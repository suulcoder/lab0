// Generated from JSON.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#my_object}.
	 * @param ctx the parse tree
	 */
	void enterMy_object(JSONParser.My_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#my_object}.
	 * @param ctx the parse tree
	 */
	void exitMy_object(JSONParser.My_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JSONParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JSONParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSONParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JSONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JSONParser.ValueContext ctx);
}