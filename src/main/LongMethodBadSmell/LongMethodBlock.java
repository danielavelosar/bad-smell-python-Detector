package main.LongMethodBadSmell;

public class LongMethodBlock extends Python3ParserBaseVisitor {
    private int numberOfStatements;
    public int getNumberOfStatements() {
        return numberOfStatements;
    }
    public boolean visit(Python3Parser.FuncdefContext node) {
        LongMethodBlock visitor = new LongMethodBlock();
        int temp = visitor.getNumberOfStatements();
        //numberOfStatements = node.parameters().size() + temp;
        return true;
    }


}
