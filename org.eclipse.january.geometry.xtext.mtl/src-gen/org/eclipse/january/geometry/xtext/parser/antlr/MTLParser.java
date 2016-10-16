/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.january.geometry.xtext.parser.antlr.internal.InternalMTLParser;
import org.eclipse.january.geometry.xtext.services.MTLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MTLParser extends AbstractAntlrParser {

	@Inject
	private MTLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_SL_COMMENT", "RULE_WS");
	}
	

	@Override
	protected InternalMTLParser createParser(XtextTokenStream stream) {
		return new InternalMTLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MaterialSource";
	}

	public MTLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MTLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
