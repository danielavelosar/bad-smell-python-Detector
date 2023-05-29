package main.LongMethodBadSmell;

public class LongMethodMethodDeclaration extends Python3ParserBaseVisitor {
    private int numberOfStatements;
    private String smell;
    public String getSmell() {
        return smell;
    }
    public boolean visit(Python3Parser.FuncdefContext node) {
        String[] methodBody = null;
        LongMethodBlock visitor = new LongMethodBlock();
        node.accept(visitor);
        numberOfStatements = visitor.getNumberOfStatements();
        methodBody = node.toString().split("\n");
        numberOfStatements = methodBody.length - 2;
        if (numberOfStatements > 15) {
            smell = "Method Name: " + node.name().toString()
                    + " Number of Lines: " +
                    numberOfStatements;

        }
        return true;
    }
}
