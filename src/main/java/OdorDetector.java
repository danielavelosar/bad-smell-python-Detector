import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Arrays;
import java.util.Stack;
public class OdorDetector extends Python3ParserBaseListener{
    @Override
    public void enterSingle_input(Python3Parser.Single_inputContext ctx){
        System.out.println("aqui empieza el programa");
    }

    @Override
    public void enterFile_input(Python3Parser.File_inputContext ctx){
        //
        //System.out.println(ctx.getPayload().getText());
    }

    @Override
    public void enterFuncdef(Python3Parser.FuncdefContext ctx){
        System.out.println("entre a una funcion");
    }
}

