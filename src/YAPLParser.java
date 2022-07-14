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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\3"+
		"\3\3\3\3\3\3\5\3\30\n\3\3\3\3\3\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\5\4(\n\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\6\6Y\n\6\r\6\16\6Z\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0085\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\6\6\u00a2\n\6\r\6\16\6\u00a3"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00ab\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b3\n"+
		"\6\f\6\16\6\u00b6\13\6\3\6\3\6\7\6\u00ba\n\6\f\6\16\6\u00bd\13\6\3\6\2"+
		"\3\n\7\2\4\6\b\n\2\2\2\u00de\2\17\3\2\2\2\4\23\3\2\2\2\6<\3\2\2\2\b>\3"+
		"\2\2\2\n\u0084\3\2\2\2\f\r\5\4\3\2\r\16\7\3\2\2\16\20\3\2\2\2\17\f\3\2"+
		"\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\7\4"+
		"\2\2\24\27\7&\2\2\25\26\7\5\2\2\26\30\7&\2\2\27\25\3\2\2\2\27\30\3\2\2"+
		"\2\30\31\3\2\2\2\31\35\7\6\2\2\32\33\5\6\4\2\33\34\7\3\2\2\34\36\3\2\2"+
		"\2\35\32\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\""+
		"\7\7\2\2\"\5\3\2\2\2#$\7\'\2\2$+\7\b\2\2%\'\5\b\5\2&(\7\t\2\2\'&\3\2\2"+
		"\2\'(\3\2\2\2(*\3\2\2\2)%\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2"+
		"\2\2-+\3\2\2\2./\7\n\2\2/\60\7\13\2\2\60\61\7&\2\2\61\62\7\6\2\2\62\63"+
		"\5\n\6\2\63\64\7\7\2\2\64=\3\2\2\2\65\66\7\'\2\2\66\67\7\13\2\2\67:\7"+
		"&\2\289\7\f\2\29;\5\n\6\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<#\3\2\2\2<\65"+
		"\3\2\2\2=\7\3\2\2\2>?\7\'\2\2?@\7\13\2\2@A\7&\2\2A\t\3\2\2\2BC\b\6\1\2"+
		"CD\7\'\2\2DE\7\f\2\2E\u0085\5\n\6\32FG\7\16\2\2GH\5\n\6\2HI\7\17\2\2I"+
		"J\5\n\6\2JK\7\20\2\2KL\5\n\6\2LM\7\21\2\2M\u0085\3\2\2\2NO\7\22\2\2OP"+
		"\5\n\6\2PQ\7\23\2\2QR\5\n\6\2RS\7\24\2\2S\u0085\3\2\2\2TX\7\6\2\2UV\5"+
		"\n\6\2VW\7\3\2\2WY\3\2\2\2XU\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\"+
		"\3\2\2\2\\]\7\7\2\2]\u0085\3\2\2\2^_\7\25\2\2_`\7\'\2\2`a\7\13\2\2ad\7"+
		"&\2\2bc\7\f\2\2ce\5\n\6\2db\3\2\2\2de\3\2\2\2en\3\2\2\2fg\7\t\2\2gh\7"+
		"\'\2\2hi\7\13\2\2ij\7&\2\2jk\7\f\2\2km\5\n\6\2lf\3\2\2\2mp\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\26\2\2r\u0085\5\n\6\24st\7\27"+
		"\2\2t\u0085\7&\2\2uv\7\30\2\2v\u0085\5\n\6\22wx\7\35\2\2x\u0085\5\n\6"+
		"\ryz\7!\2\2z\u0085\5\n\6\t{|\7\b\2\2|}\5\n\6\2}~\7\n\2\2~\u0085\3\2\2"+
		"\2\177\u0085\7\'\2\2\u0080\u0085\7%\2\2\u0081\u0085\7$\2\2\u0082\u0085"+
		"\7\"\2\2\u0083\u0085\7#\2\2\u0084B\3\2\2\2\u0084F\3\2\2\2\u0084N\3\2\2"+
		"\2\u0084T\3\2\2\2\u0084^\3\2\2\2\u0084s\3\2\2\2\u0084u\3\2\2\2\u0084w"+
		"\3\2\2\2\u0084y\3\2\2\2\u0084{\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080\3"+
		"\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u00bb\3\2\2\2\u0086\u0087\f\21\2\2\u0087\u0088\7\31\2\2\u0088\u00ba\5"+
		"\n\6\22\u0089\u008a\f\20\2\2\u008a\u008b\7\32\2\2\u008b\u00ba\5\n\6\21"+
		"\u008c\u008d\f\17\2\2\u008d\u008e\7\33\2\2\u008e\u00ba\5\n\6\20\u008f"+
		"\u0090\f\16\2\2\u0090\u0091\7\34\2\2\u0091\u00ba\5\n\6\17\u0092\u0093"+
		"\f\f\2\2\u0093\u0094\7\36\2\2\u0094\u00ba\5\n\6\r\u0095\u0096\f\13\2\2"+
		"\u0096\u0097\7\37\2\2\u0097\u00ba\5\n\6\f\u0098\u0099\f\n\2\2\u0099\u009a"+
		"\7 \2\2\u009a\u00ba\5\n\6\13\u009b\u009c\f\31\2\2\u009c\u00a1\7\b\2\2"+
		"\u009d\u009f\5\n\6\2\u009e\u00a0\7\t\2\2\u009f\u009e\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\n"+
		"\2\2\u00a6\u00ba\3\2\2\2\u00a7\u00aa\f\30\2\2\u00a8\u00a9\7\r\2\2\u00a9"+
		"\u00ab\7&\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\7(\2\2\u00ad\u00ae\7\'\2\2\u00ae\u00af\7\b\2\2\u00af"+
		"\u00b4\5\n\6\2\u00b0\u00b1\7\t\2\2\u00b1\u00b3\5\n\6\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00ba\3\2"+
		"\2\2\u00b9\u0086\3\2\2\2\u00b9\u0089\3\2\2\2\u00b9\u008c\3\2\2\2\u00b9"+
		"\u008f\3\2\2\2\u00b9\u0092\3\2\2\2\u00b9\u0095\3\2\2\2\u00b9\u0098\3\2"+
		"\2\2\u00b9\u009b\3\2\2\2\u00b9\u00a7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\13\3\2\2\2\u00bd\u00bb\3\2\2"+
		"\2\23\21\27\37\'+:<Zdn\u0084\u009f\u00a3\u00aa\u00b4\u00b9\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}