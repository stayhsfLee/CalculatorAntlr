import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String test = "float a;" +
                "int b;" +
                "a = (10.44*356+1.28) / 2 + 1024 * 1.6;" +
                "b = a * 2 - c/2; write(a)";
        //Lexer analysis
        CalculatorLexer calculatorLexer = new CalculatorLexer(new ANTLRInputStream(test));
        CommonTokenStream tokens = new CommonTokenStream(calculatorLexer);
        tokens.getText();

        System.out.println(tokens.getTokens().toString());

//        CalculatorParser calculatorParser = new CalculatorParser(tokens);
//        ParseTree parseTree = calculatorParser.start();
    }
}
