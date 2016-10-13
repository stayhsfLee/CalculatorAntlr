// Generated from /Users/coolautumn/Documents/Compile_File/JAVA_IntelliJ/CalculatorAntlr/Resources/Calculator.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#idenStmt}.
	 * @param ctx the parse tree
	 */
	void enterIdenStmt(CalculatorParser.IdenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#idenStmt}.
	 * @param ctx the parse tree
	 */
	void exitIdenStmt(CalculatorParser.IdenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(CalculatorParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(CalculatorParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(CalculatorParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(CalculatorParser.WriteStmtContext ctx);
}