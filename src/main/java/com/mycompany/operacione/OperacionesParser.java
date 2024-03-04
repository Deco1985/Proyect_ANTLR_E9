package com.mycompany.operacione;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
// Generated from C:/Users/elcab/Documents/ProyectoTLP/Operaciones.g4 by ANTLR 4.13.1
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OperacionesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, FLOAT=9, 
		WS=10;
	public static final int
		RULE_expr = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "INT", "FLOAT", "WS"
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
	public String getGrammarFileName() { return "Operaciones.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OperacionesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(OperacionesParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(OperacionesParser.FLOAT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperacionesListener ) ((OperacionesListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperacionesListener ) ((OperacionesListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		int _la;
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2);
				match(T__0);
				}
				setState(3);
				expr();
				setState(4);
				expr();
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(6);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(7);
				expr();
				setState(8);
				expr();
				}
				break;
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(10);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(11);
				expr();
				setState(12);
				expr();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(14);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(15);
				match(FLOAT);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(16);
				match(T__5);
				setState(17);
				expr();
				setState(18);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\u0004\u0001\n\u0017\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000\u0001"+
		"\u0000\u0000\u0000\u0001\u0000\u0000\u0002\u0001\u0000\u0002\u0003\u0001"+
		"\u0000\u0004\u0005\u001a\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u0003"+
		"\u0005\u0001\u0000\u0000\u0003\u0004\u0003\u0000\u0000\u0000\u0004\u0005"+
		"\u0003\u0000\u0000\u0000\u0005\u0015\u0001\u0000\u0000\u0000\u0006\u0007"+
		"\u0007\u0000\u0000\u0000\u0007\b\u0003\u0000\u0000\u0000\b\t\u0003\u0000"+
		"\u0000\u0000\t\u0015\u0001\u0000\u0000\u0000\n\u000b\u0007\u0001\u0000"+
		"\u0000\u000b\f\u0003\u0000\u0000\u0000\f\r\u0003\u0000\u0000\u0000\r\u0015"+
		"\u0001\u0000\u0000\u0000\u000e\u0015\u0005\b\u0000\u0000\u000f\u0015\u0005"+
		"\t\u0000\u0000\u0010\u0011\u0005\u0006\u0000\u0000\u0011\u0012\u0003\u0000"+
		"\u0000\u0000\u0012\u0013\u0005\u0007\u0000\u0000\u0013\u0015\u0001\u0000"+
		"\u0000\u0000\u0014\u0002\u0001\u0000\u0000\u0000\u0014\u0006\u0001\u0000"+
		"\u0000\u0000\u0014\n\u0001\u0000\u0000\u0000\u0014\u000e\u0001\u0000\u0000"+
		"\u0000\u0014\u000f\u0001\u0000\u0000\u0000\u0014\u0010\u0001\u0000\u0000"+
		"\u0000\u0015\u0001\u0001\u0000\u0000\u0000\u0001\u0014";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}