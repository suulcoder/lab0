// Generated from YAPL.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, STRING=37, INT=38, ID=39, 
		TYPE=40;
	public static final int
		RULE_program = 0, RULE_my_class = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "my_class", "feature", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'my_class'", "'inherits'", "'{'", "';'", "'}'", "'('", "'['", 
			"','", "']'", "')'", "':'", "'<-'", "'@'", "'.'", "'if'", "'then'", "'else'", 
			"'fi'", "'while'", "'loop'", "'pool'", "'let'", "'in'", "'new'", "'isvoID'", 
			"'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", "'not'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "INT", "ID", "TYPE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "YAPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YAPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<My_classContext> my_class() {
			return getRuleContexts(My_classContext.class);
		}
		public My_classContext my_class(int i) {
			return getRuleContext(My_classContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				my_class();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class My_classContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(YAPLParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(YAPLParser.TYPE, i);
		}
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public My_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_my_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterMy_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitMy_class(this);
		}
	}

	public final My_classContext my_class() throws RecognitionException {
		My_classContext _localctx = new My_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_my_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(T__0);
			setState(16);
			match(TYPE);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(17);
				match(T__1);
				setState(18);
				match(TYPE);
				}
			}

			setState(21);
			match(T__2);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(22);
				feature();
				setState(23);
				match(T__3);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitFeature(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(32);
				match(ID);
				setState(33);
				match(T__5);
				setState(34);
				match(T__6);
				setState(35);
				formal();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(36);
					match(T__7);
					setState(37);
					formal();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(T__8);
				setState(44);
				match(T__9);
				setState(45);
				match(T__10);
				setState(46);
				match(TYPE);
				setState(47);
				match(T__2);
				setState(48);
				expr(0);
				setState(49);
				match(T__4);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(ID);
				setState(52);
				match(T__10);
				setState(53);
				match(TYPE);
				setState(54);
				match(T__6);
				setState(55);
				match(T__11);
				setState(56);
				expr(0);
				setState(57);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
			setState(62);
			match(T__10);
			setState(63);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(YAPLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(YAPLParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TYPE() { return getTokens(YAPLParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(YAPLParser.TYPE, i);
		}
		public TerminalNode INT() { return getToken(YAPLParser.INT, 0); }
		public TerminalNode STRING() { return getToken(YAPLParser.STRING, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(66);
				match(ID);
				setState(67);
				match(T__11);
				setState(68);
				expr(23);
				}
				break;
			case 2:
				{
				setState(69);
				match(T__14);
				setState(70);
				expr(0);
				setState(71);
				match(T__15);
				setState(72);
				expr(0);
				setState(73);
				match(T__16);
				setState(74);
				expr(0);
				setState(75);
				match(T__17);
				}
				break;
			case 3:
				{
				setState(77);
				match(T__18);
				setState(78);
				expr(0);
				setState(79);
				match(T__19);
				setState(80);
				expr(0);
				setState(81);
				match(T__20);
				}
				break;
			case 4:
				{
				setState(83);
				match(T__2);
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					expr(0);
					setState(85);
					match(T__3);
					}
					}
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__14) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__29) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0) );
				setState(91);
				match(T__4);
				}
				break;
			case 5:
				{
				setState(93);
				match(T__21);
				setState(94);
				match(ID);
				setState(95);
				match(T__10);
				setState(96);
				match(TYPE);
				setState(97);
				match(T__6);
				setState(98);
				match(T__11);
				setState(99);
				expr(0);
				setState(100);
				match(T__8);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(101);
					match(T__7);
					setState(102);
					match(ID);
					setState(103);
					match(T__10);
					setState(104);
					match(TYPE);
					setState(105);
					match(T__6);
					setState(106);
					match(T__11);
					setState(107);
					expr(0);
					setState(108);
					match(T__8);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(T__22);
				setState(116);
				expr(18);
				}
				break;
			case 6:
				{
				setState(118);
				match(T__23);
				setState(119);
				match(TYPE);
				}
				break;
			case 7:
				{
				setState(120);
				match(T__24);
				setState(121);
				expr(16);
				}
				break;
			case 8:
				{
				setState(122);
				match(T__29);
				setState(123);
				expr(11);
				}
				break;
			case 9:
				{
				setState(124);
				match(T__33);
				setState(125);
				expr(7);
				}
				break;
			case 10:
				{
				setState(126);
				match(T__5);
				setState(127);
				expr(0);
				setState(128);
				match(T__9);
				}
				break;
			case 11:
				{
				setState(130);
				match(ID);
				}
				break;
			case 12:
				{
				setState(131);
				match(INT);
				}
				break;
			case 13:
				{
				setState(132);
				match(STRING);
				}
				break;
			case 14:
				{
				setState(133);
				match(T__34);
				}
				break;
			case 15:
				{
				setState(134);
				match(T__35);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(138);
						match(T__25);
						setState(139);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(141);
						match(T__26);
						setState(142);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(144);
						match(T__27);
						setState(145);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(147);
						match(T__28);
						setState(148);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(150);
						match(T__30);
						setState(151);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(153);
						match(T__31);
						setState(154);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(156);
						match(T__32);
						setState(157);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(159);
						match(T__6);
						setState(160);
						match(T__12);
						setState(161);
						match(TYPE);
						setState(162);
						match(T__8);
						setState(163);
						match(T__13);
						setState(164);
						match(ID);
						setState(165);
						match(T__5);
						setState(166);
						match(T__6);
						setState(167);
						expr(0);
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__7) {
							{
							{
							setState(168);
							match(T__7);
							setState(169);
							expr(0);
							}
							}
							setState(174);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(175);
						match(T__8);
						setState(176);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3"+
		"\3\3\5\3\26\n\3\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\6\6Z\n\6\r\6\16\6[\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6q\n\6\f\6\16\6t\13\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u008a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u00ad\n\6\f\6\16\6\u00b0\13\6\3\6\3\6\3\6\7\6\u00b5\n\6"+
		"\f\6\16\6\u00b8\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2\2\u00d2\2\r\3\2\2\2\4\21"+
		"\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\n\u0089\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2"+
		"\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\3\2\2"+
		"\22\25\7*\2\2\23\24\7\4\2\2\24\26\7*\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26"+
		"\27\3\2\2\2\27\35\7\5\2\2\30\31\5\6\4\2\31\32\7\6\2\2\32\34\3\2\2\2\33"+
		"\30\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35"+
		"\3\2\2\2 !\7\7\2\2!\5\3\2\2\2\"#\7)\2\2#$\7\b\2\2$%\7\t\2\2%*\5\b\5\2"+
		"&\'\7\n\2\2\')\5\b\5\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2"+
		"\2,*\3\2\2\2-.\7\13\2\2./\7\f\2\2/\60\7\r\2\2\60\61\7*\2\2\61\62\7\5\2"+
		"\2\62\63\5\n\6\2\63\64\7\7\2\2\64>\3\2\2\2\65\66\7)\2\2\66\67\7\r\2\2"+
		"\678\7*\2\289\7\t\2\29:\7\16\2\2:;\5\n\6\2;<\7\13\2\2<>\3\2\2\2=\"\3\2"+
		"\2\2=\65\3\2\2\2>\7\3\2\2\2?@\7)\2\2@A\7\r\2\2AB\7*\2\2B\t\3\2\2\2CD\b"+
		"\6\1\2DE\7)\2\2EF\7\16\2\2F\u008a\5\n\6\31GH\7\21\2\2HI\5\n\6\2IJ\7\22"+
		"\2\2JK\5\n\6\2KL\7\23\2\2LM\5\n\6\2MN\7\24\2\2N\u008a\3\2\2\2OP\7\25\2"+
		"\2PQ\5\n\6\2QR\7\26\2\2RS\5\n\6\2ST\7\27\2\2T\u008a\3\2\2\2UY\7\5\2\2"+
		"VW\5\n\6\2WX\7\6\2\2XZ\3\2\2\2YV\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\]\3\2\2\2]^\7\7\2\2^\u008a\3\2\2\2_`\7\30\2\2`a\7)\2\2ab\7\r\2\2b"+
		"c\7*\2\2cd\7\t\2\2de\7\16\2\2ef\5\n\6\2fr\7\13\2\2gh\7\n\2\2hi\7)\2\2"+
		"ij\7\r\2\2jk\7*\2\2kl\7\t\2\2lm\7\16\2\2mn\5\n\6\2no\7\13\2\2oq\3\2\2"+
		"\2pg\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\31"+
		"\2\2vw\5\n\6\24w\u008a\3\2\2\2xy\7\32\2\2y\u008a\7*\2\2z{\7\33\2\2{\u008a"+
		"\5\n\6\22|}\7 \2\2}\u008a\5\n\6\r~\177\7$\2\2\177\u008a\5\n\6\t\u0080"+
		"\u0081\7\b\2\2\u0081\u0082\5\n\6\2\u0082\u0083\7\f\2\2\u0083\u008a\3\2"+
		"\2\2\u0084\u008a\7)\2\2\u0085\u008a\7(\2\2\u0086\u008a\7\'\2\2\u0087\u008a"+
		"\7%\2\2\u0088\u008a\7&\2\2\u0089C\3\2\2\2\u0089G\3\2\2\2\u0089O\3\2\2"+
		"\2\u0089U\3\2\2\2\u0089_\3\2\2\2\u0089x\3\2\2\2\u0089z\3\2\2\2\u0089|"+
		"\3\2\2\2\u0089~\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0084\3\2\2\2\u0089"+
		"\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2"+
		"\2\2\u008a\u00b6\3\2\2\2\u008b\u008c\f\21\2\2\u008c\u008d\7\34\2\2\u008d"+
		"\u00b5\5\n\6\22\u008e\u008f\f\20\2\2\u008f\u0090\7\35\2\2\u0090\u00b5"+
		"\5\n\6\21\u0091\u0092\f\17\2\2\u0092\u0093\7\36\2\2\u0093\u00b5\5\n\6"+
		"\20\u0094\u0095\f\16\2\2\u0095\u0096\7\37\2\2\u0096\u00b5\5\n\6\17\u0097"+
		"\u0098\f\f\2\2\u0098\u0099\7!\2\2\u0099\u00b5\5\n\6\r\u009a\u009b\f\13"+
		"\2\2\u009b\u009c\7\"\2\2\u009c\u00b5\5\n\6\f\u009d\u009e\f\n\2\2\u009e"+
		"\u009f\7#\2\2\u009f\u00b5\5\n\6\13\u00a0\u00a1\f\30\2\2\u00a1\u00a2\7"+
		"\t\2\2\u00a2\u00a3\7\17\2\2\u00a3\u00a4\7*\2\2\u00a4\u00a5\7\13\2\2\u00a5"+
		"\u00a6\7\20\2\2\u00a6\u00a7\7)\2\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9\7\t"+
		"\2\2\u00a9\u00ae\5\n\6\2\u00aa\u00ab\7\n\2\2\u00ab\u00ad\5\n\6\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\13\2\2\u00b2"+
		"\u00b3\7\f\2\2\u00b3\u00b5\3\2\2\2\u00b4\u008b\3\2\2\2\u00b4\u008e\3\2"+
		"\2\2\u00b4\u0091\3\2\2\2\u00b4\u0094\3\2\2\2\u00b4\u0097\3\2\2\2\u00b4"+
		"\u009a\3\2\2\2\u00b4\u009d\3\2\2\2\u00b4\u00a0\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\13\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\r\17\25\35*=[r\u0089\u00ae\u00b4\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}