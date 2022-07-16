// Generated from YAPL.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, STRING=34, INT=35, TYPE=36, ID=37, POINT=38, UNKNOWN=39, 
		LINE_COMMENT=40;
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
			null, "';'", "'class'", "'inherits'", "'{'", "'}'", "'('", "','", "')'", 
			"':'", "'<-'", "'@'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
			"'loop'", "'pool'", "'let'", "'in'", "'new'", "'isvoID'", "'+'", "'-'", 
			"'*'", "'/'", "'~'", "'<'", "'<='", "'='", "'not'", "'true'", "'false'", 
			null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"INT", "TYPE", "ID", "POINT", "UNKNOWN", "LINE_COMMENT"
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				my_class();
				setState(11);
				match(T__0);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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
			setState(17);
			match(T__1);
			setState(18);
			match(TYPE);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(19);
				match(T__2);
				setState(20);
				match(TYPE);
				}
			}

			setState(23);
			match(T__3);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				feature();
				setState(25);
				match(T__0);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(31);
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
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(33);
				match(ID);
				setState(34);
				match(T__5);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(35);
					formal();
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(36);
						match(T__6);
						}
					}

					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(T__7);
				setState(45);
				match(T__8);
				setState(46);
				match(TYPE);
				setState(47);
				match(T__3);
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
				match(T__8);
				setState(53);
				match(TYPE);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(54);
					match(T__9);
					setState(55);
					expr(0);
					}
				}

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
			setState(60);
			match(ID);
			setState(61);
			match(T__8);
			setState(62);
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
		public TerminalNode POINT() { return getToken(YAPLParser.POINT, 0); }
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(65);
				match(ID);
				setState(66);
				match(T__9);
				setState(67);
				expr(24);
				}
				break;
			case 2:
				{
				setState(68);
				match(T__11);
				setState(69);
				expr(0);
				setState(70);
				match(T__12);
				setState(71);
				expr(0);
				setState(72);
				match(T__13);
				setState(73);
				expr(0);
				setState(74);
				match(T__14);
				}
				break;
			case 3:
				{
				setState(76);
				match(T__15);
				setState(77);
				expr(0);
				setState(78);
				match(T__16);
				setState(79);
				expr(0);
				setState(80);
				match(T__17);
				}
				break;
			case 4:
				{
				setState(82);
				match(T__3);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(83);
					expr(0);
					setState(84);
					match(T__0);
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0) );
				setState(90);
				match(T__4);
				}
				break;
			case 5:
				{
				setState(92);
				match(T__18);
				setState(93);
				match(ID);
				setState(94);
				match(T__8);
				setState(95);
				match(TYPE);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(96);
					match(T__9);
					setState(97);
					expr(0);
					}
				}

				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(100);
					match(T__6);
					setState(101);
					match(ID);
					setState(102);
					match(T__8);
					setState(103);
					match(TYPE);
					setState(104);
					match(T__9);
					setState(105);
					expr(0);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__19);
				setState(112);
				expr(18);
				}
				break;
			case 6:
				{
				setState(113);
				match(T__20);
				setState(114);
				match(TYPE);
				}
				break;
			case 7:
				{
				setState(115);
				match(T__21);
				setState(116);
				expr(16);
				}
				break;
			case 8:
				{
				setState(117);
				match(T__26);
				setState(118);
				expr(11);
				}
				break;
			case 9:
				{
				setState(119);
				match(T__30);
				setState(120);
				expr(7);
				}
				break;
			case 10:
				{
				setState(121);
				match(T__5);
				setState(122);
				expr(0);
				setState(123);
				match(T__7);
				}
				break;
			case 11:
				{
				setState(125);
				match(ID);
				}
				break;
			case 12:
				{
				setState(126);
				match(INT);
				}
				break;
			case 13:
				{
				setState(127);
				match(STRING);
				}
				break;
			case 14:
				{
				setState(128);
				match(T__31);
				}
				break;
			case 15:
				{
				setState(129);
				match(T__32);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(133);
						match(T__22);
						setState(134);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(136);
						match(T__23);
						setState(137);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(139);
						match(T__24);
						setState(140);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(142);
						match(T__25);
						setState(143);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(145);
						match(T__27);
						setState(146);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(148);
						match(T__28);
						setState(149);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(151);
						match(T__29);
						setState(152);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(154);
						match(T__5);
						setState(159); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(155);
							expr(0);
							setState(157);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__6) {
								{
								setState(156);
								match(T__6);
								}
							}

							}
							}
							setState(161); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0) );
						setState(163);
						match(T__7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(168);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(166);
							match(T__10);
							setState(167);
							match(TYPE);
							}
						}

						setState(170);
						match(POINT);
						setState(171);
						match(ID);
						setState(172);
						match(T__5);
						setState(173);
						expr(0);
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__6) {
							{
							{
							setState(174);
							match(T__6);
							setState(175);
							expr(0);
							}
							}
							setState(180);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(181);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			return precpred(_ctx, 23);
		case 8:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00bd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0016\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u001c\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0005"+
		"\u0002(\b\u0002\n\u0002\f\u0002+\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00029\b\u0002\u0003"+
		"\u0002;\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004W\b\u0004\u000b"+
		"\u0004\f\u0004X\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004c\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004k\b\u0004\n\u0004\f\u0004n\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0083"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u009e\b\u0004\u0004\u0004\u00a0\b\u0004"+
		"\u000b\u0004\f\u0004\u00a1\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00a9\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b1\b\u0004\n\u0004"+
		"\f\u0004\u00b4\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b8\b\u0004"+
		"\n\u0004\f\u0004\u00bb\t\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0000\u00dc\u0000\r\u0001\u0000\u0000\u0000\u0002"+
		"\u0011\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006<\u0001"+
		"\u0000\u0000\u0000\b\u0082\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002"+
		"\u0001\u0000\u000b\f\u0005\u0001\u0000\u0000\f\u000e\u0001\u0000\u0000"+
		"\u0000\r\n\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000"+
		"\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010"+
		"\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0002\u0000\u0000\u0012"+
		"\u0015\u0005$\u0000\u0000\u0013\u0014\u0005\u0003\u0000\u0000\u0014\u0016"+
		"\u0005$\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u001b\u0005"+
		"\u0004\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0005"+
		"\u0001\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0018\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0001"+
		"\u0000\u0000\u0000\u001f \u0005\u0005\u0000\u0000 \u0003\u0001\u0000\u0000"+
		"\u0000!\"\u0005%\u0000\u0000\")\u0005\u0006\u0000\u0000#%\u0003\u0006"+
		"\u0003\u0000$&\u0005\u0007\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000"+
		"(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\b\u0000"+
		"\u0000-.\u0005\t\u0000\u0000./\u0005$\u0000\u0000/0\u0005\u0004\u0000"+
		"\u000001\u0003\b\u0004\u000012\u0005\u0005\u0000\u00002;\u0001\u0000\u0000"+
		"\u000034\u0005%\u0000\u000045\u0005\t\u0000\u000058\u0005$\u0000\u0000"+
		"67\u0005\n\u0000\u000079\u0003\b\u0004\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:!\u0001\u0000\u0000"+
		"\u0000:3\u0001\u0000\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0005"+
		"%\u0000\u0000=>\u0005\t\u0000\u0000>?\u0005$\u0000\u0000?\u0007\u0001"+
		"\u0000\u0000\u0000@A\u0006\u0004\uffff\uffff\u0000AB\u0005%\u0000\u0000"+
		"BC\u0005\n\u0000\u0000C\u0083\u0003\b\u0004\u0018DE\u0005\f\u0000\u0000"+
		"EF\u0003\b\u0004\u0000FG\u0005\r\u0000\u0000GH\u0003\b\u0004\u0000HI\u0005"+
		"\u000e\u0000\u0000IJ\u0003\b\u0004\u0000JK\u0005\u000f\u0000\u0000K\u0083"+
		"\u0001\u0000\u0000\u0000LM\u0005\u0010\u0000\u0000MN\u0003\b\u0004\u0000"+
		"NO\u0005\u0011\u0000\u0000OP\u0003\b\u0004\u0000PQ\u0005\u0012\u0000\u0000"+
		"Q\u0083\u0001\u0000\u0000\u0000RV\u0005\u0004\u0000\u0000ST\u0003\b\u0004"+
		"\u0000TU\u0005\u0001\u0000\u0000UW\u0001\u0000\u0000\u0000VS\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0005\u0005\u0000\u0000"+
		"[\u0083\u0001\u0000\u0000\u0000\\]\u0005\u0013\u0000\u0000]^\u0005%\u0000"+
		"\u0000^_\u0005\t\u0000\u0000_b\u0005$\u0000\u0000`a\u0005\n\u0000\u0000"+
		"ac\u0003\b\u0004\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cl\u0001\u0000\u0000\u0000de\u0005\u0007\u0000\u0000ef\u0005%\u0000\u0000"+
		"fg\u0005\t\u0000\u0000gh\u0005$\u0000\u0000hi\u0005\n\u0000\u0000ik\u0003"+
		"\b\u0004\u0000jd\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000op\u0005\u0014\u0000\u0000p\u0083\u0003\b\u0004"+
		"\u0012qr\u0005\u0015\u0000\u0000r\u0083\u0005$\u0000\u0000st\u0005\u0016"+
		"\u0000\u0000t\u0083\u0003\b\u0004\u0010uv\u0005\u001b\u0000\u0000v\u0083"+
		"\u0003\b\u0004\u000bwx\u0005\u001f\u0000\u0000x\u0083\u0003\b\u0004\u0007"+
		"yz\u0005\u0006\u0000\u0000z{\u0003\b\u0004\u0000{|\u0005\b\u0000\u0000"+
		"|\u0083\u0001\u0000\u0000\u0000}\u0083\u0005%\u0000\u0000~\u0083\u0005"+
		"#\u0000\u0000\u007f\u0083\u0005\"\u0000\u0000\u0080\u0083\u0005 \u0000"+
		"\u0000\u0081\u0083\u0005!\u0000\u0000\u0082@\u0001\u0000\u0000\u0000\u0082"+
		"D\u0001\u0000\u0000\u0000\u0082L\u0001\u0000\u0000\u0000\u0082R\u0001"+
		"\u0000\u0000\u0000\u0082\\\u0001\u0000\u0000\u0000\u0082q\u0001\u0000"+
		"\u0000\u0000\u0082s\u0001\u0000\u0000\u0000\u0082u\u0001\u0000\u0000\u0000"+
		"\u0082w\u0001\u0000\u0000\u0000\u0082y\u0001\u0000\u0000\u0000\u0082}"+
		"\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0082\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u00b9\u0001\u0000\u0000\u0000\u0084\u0085\n\u000f"+
		"\u0000\u0000\u0085\u0086\u0005\u0017\u0000\u0000\u0086\u00b8\u0003\b\u0004"+
		"\u0010\u0087\u0088\n\u000e\u0000\u0000\u0088\u0089\u0005\u0018\u0000\u0000"+
		"\u0089\u00b8\u0003\b\u0004\u000f\u008a\u008b\n\r\u0000\u0000\u008b\u008c"+
		"\u0005\u0019\u0000\u0000\u008c\u00b8\u0003\b\u0004\u000e\u008d\u008e\n"+
		"\f\u0000\u0000\u008e\u008f\u0005\u001a\u0000\u0000\u008f\u00b8\u0003\b"+
		"\u0004\r\u0090\u0091\n\n\u0000\u0000\u0091\u0092\u0005\u001c\u0000\u0000"+
		"\u0092\u00b8\u0003\b\u0004\u000b\u0093\u0094\n\t\u0000\u0000\u0094\u0095"+
		"\u0005\u001d\u0000\u0000\u0095\u00b8\u0003\b\u0004\n\u0096\u0097\n\b\u0000"+
		"\u0000\u0097\u0098\u0005\u001e\u0000\u0000\u0098\u00b8\u0003\b\u0004\t"+
		"\u0099\u009a\n\u0017\u0000\u0000\u009a\u009f\u0005\u0006\u0000\u0000\u009b"+
		"\u009d\u0003\b\u0004\u0000\u009c\u009e\u0005\u0007\u0000\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0"+
		"\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\b\u0000\u0000\u00a4\u00b8\u0001\u0000\u0000\u0000\u00a5\u00a8\n"+
		"\u0016\u0000\u0000\u00a6\u00a7\u0005\u000b\u0000\u0000\u00a7\u00a9\u0005"+
		"$\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005&\u0000"+
		"\u0000\u00ab\u00ac\u0005%\u0000\u0000\u00ac\u00ad\u0005\u0006\u0000\u0000"+
		"\u00ad\u00b2\u0003\b\u0004\u0000\u00ae\u00af\u0005\u0007\u0000\u0000\u00af"+
		"\u00b1\u0003\b\u0004\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\b\u0000\u0000\u00b6\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b7\u0084\u0001\u0000\u0000\u0000\u00b7\u0087\u0001"+
		"\u0000\u0000\u0000\u00b7\u008a\u0001\u0000\u0000\u0000\u00b7\u008d\u0001"+
		"\u0000\u0000\u0000\u00b7\u0090\u0001\u0000\u0000\u0000\u00b7\u0093\u0001"+
		"\u0000\u0000\u0000\u00b7\u0096\u0001\u0000\u0000\u0000\u00b7\u0099\u0001"+
		"\u0000\u0000\u0000\u00b7\u00a5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\t\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u0011\u000f\u0015\u001d%)8:Xbl\u0082\u009d\u00a1\u00a8\u00b2"+
		"\u00b7\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}