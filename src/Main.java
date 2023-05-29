import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
        try{
            Python3Lexer lexer;

            if (args.length>0)
                lexer = new Python3Lexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new Python3Lexer(CharStreams.fromStream(System.in));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Python3Parser parser = new Python3Parser(tokens);
            ParseTree tree = parser.file_input();

            //MyVisitor loader = new MyVisitor();
            //loader.visit(tree);
            ParseTreeWalker walker = new ParseTreeWalker();
            OdorDetector listener = new OdorDetector();
            walker.walk( listener, tree);

        }
        catch (Exception e){
            System.err.println("Error (Test): " + e);
        }


    }
}