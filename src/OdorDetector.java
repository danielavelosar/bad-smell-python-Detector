import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;

import java.util.Arrays;
import java.util.Stack;
public class OdorDetector extends Python3ParserBaseListener {

    @Override
    public void enterSingle_input(Python3Parser.Single_inputContext ctx) {

    }

    @Override
    public void exitSingle_input(Python3Parser.Single_inputContext ctx) {

    }

    @Override
    public void enterFile_input(Python3Parser.File_inputContext ctx) {

    }

    @Override
    public void exitFile_input(Python3Parser.File_inputContext ctx) {

    }

    @Override
    public void enterEval_input(Python3Parser.Eval_inputContext ctx) {

    }

    @Override
    public void exitEval_input(Python3Parser.Eval_inputContext ctx) {

    }

    @Override
    public void enterDecorator(Python3Parser.DecoratorContext ctx) {

    }

    @Override
    public void exitDecorator(Python3Parser.DecoratorContext ctx) {

    }

    @Override
    public void enterDecorators(Python3Parser.DecoratorsContext ctx) {

    }

    @Override
    public void exitDecorators(Python3Parser.DecoratorsContext ctx) {

    }

    @Override
    public void enterDecorated(Python3Parser.DecoratedContext ctx) {

    }

    @Override
    public void exitDecorated(Python3Parser.DecoratedContext ctx) {

    }

    @Override
    public void enterAsync_funcdef(Python3Parser.Async_funcdefContext ctx) {

    }

    @Override
    public void exitAsync_funcdef(Python3Parser.Async_funcdefContext ctx) {

    }

    @Override
    public void enterFuncdef(Python3Parser.FuncdefContext ctx) {

    }

    @Override
    public void exitFuncdef(Python3Parser.FuncdefContext ctx) {

    }

    @Override
    public void enterParameters(Python3Parser.ParametersContext ctx) {

    }

    @Override
    public void exitParameters(Python3Parser.ParametersContext ctx) {

    }

    @Override
    public void enterTypedargslist(Python3Parser.TypedargslistContext ctx) {

    }

    @Override
    public void exitTypedargslist(Python3Parser.TypedargslistContext ctx) {

    }

    @Override
    public void enterTfpdef(Python3Parser.TfpdefContext ctx) {

    }

    @Override
    public void exitTfpdef(Python3Parser.TfpdefContext ctx) {

    }

    @Override
    public void enterVarargslist(Python3Parser.VarargslistContext ctx) {

    }

    @Override
    public void exitVarargslist(Python3Parser.VarargslistContext ctx) {

    }

    @Override
    public void enterVfpdef(Python3Parser.VfpdefContext ctx) {

    }

    @Override
    public void exitVfpdef(Python3Parser.VfpdefContext ctx) {

    }

    @Override
    public void enterStmt(Python3Parser.StmtContext ctx) {

    }

    @Override
    public void exitStmt(Python3Parser.StmtContext ctx) {

    }

    @Override
    public void enterSimple_stmts(Python3Parser.Simple_stmtsContext ctx) {

    }

    @Override
    public void exitSimple_stmts(Python3Parser.Simple_stmtsContext ctx) {

    }

    @Override
    public void enterSimple_stmt(Python3Parser.Simple_stmtContext ctx) {

    }

    @Override
    public void exitSimple_stmt(Python3Parser.Simple_stmtContext ctx) {

    }

    @Override
    public void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx) {

    }

    @Override
    public void exitExpr_stmt(Python3Parser.Expr_stmtContext ctx) {

    }

    @Override
    public void enterAnnassign(Python3Parser.AnnassignContext ctx) {

    }

    @Override
    public void exitAnnassign(Python3Parser.AnnassignContext ctx) {

    }

    @Override
    public void enterTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx) {

    }

    @Override
    public void exitTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx) {

    }

    @Override
    public void enterAugassign(Python3Parser.AugassignContext ctx) {

    }

    @Override
    public void exitAugassign(Python3Parser.AugassignContext ctx) {

    }

    @Override
    public void enterDel_stmt(Python3Parser.Del_stmtContext ctx) {

    }

    @Override
    public void exitDel_stmt(Python3Parser.Del_stmtContext ctx) {

    }

    @Override
    public void enterPass_stmt(Python3Parser.Pass_stmtContext ctx) {

    }

    @Override
    public void exitPass_stmt(Python3Parser.Pass_stmtContext ctx) {

    }

    @Override
    public void enterFlow_stmt(Python3Parser.Flow_stmtContext ctx) {

    }

    @Override
    public void exitFlow_stmt(Python3Parser.Flow_stmtContext ctx) {

    }

    @Override
    public void enterBreak_stmt(Python3Parser.Break_stmtContext ctx) {

    }

    @Override
    public void exitBreak_stmt(Python3Parser.Break_stmtContext ctx) {

    }

    @Override
    public void enterContinue_stmt(Python3Parser.Continue_stmtContext ctx) {

    }

    @Override
    public void exitContinue_stmt(Python3Parser.Continue_stmtContext ctx) {

    }

    @Override
    public void enterReturn_stmt(Python3Parser.Return_stmtContext ctx) {

    }

    @Override
    public void exitReturn_stmt(Python3Parser.Return_stmtContext ctx) {

    }

    @Override
    public void enterYield_stmt(Python3Parser.Yield_stmtContext ctx) {

    }

    @Override
    public void exitYield_stmt(Python3Parser.Yield_stmtContext ctx) {

    }

    @Override
    public void enterRaise_stmt(Python3Parser.Raise_stmtContext ctx) {

    }

    @Override
    public void exitRaise_stmt(Python3Parser.Raise_stmtContext ctx) {

    }

    @Override
    public void enterImport_stmt(Python3Parser.Import_stmtContext ctx) {

    }

    @Override
    public void exitImport_stmt(Python3Parser.Import_stmtContext ctx) {

    }

    @Override
    public void enterImport_name(Python3Parser.Import_nameContext ctx) {

    }

    @Override
    public void exitImport_name(Python3Parser.Import_nameContext ctx) {

    }

    @Override
    public void enterImport_from(Python3Parser.Import_fromContext ctx) {

    }

    @Override
    public void exitImport_from(Python3Parser.Import_fromContext ctx) {

    }

    @Override
    public void enterImport_as_name(Python3Parser.Import_as_nameContext ctx) {

    }

    @Override
    public void exitImport_as_name(Python3Parser.Import_as_nameContext ctx) {

    }

    @Override
    public void enterDotted_as_name(Python3Parser.Dotted_as_nameContext ctx) {

    }

    @Override
    public void exitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx) {

    }

    @Override
    public void enterImport_as_names(Python3Parser.Import_as_namesContext ctx) {

    }

    @Override
    public void exitImport_as_names(Python3Parser.Import_as_namesContext ctx) {

    }

    @Override
    public void enterDotted_as_names(Python3Parser.Dotted_as_namesContext ctx) {

    }

    @Override
    public void exitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx) {

    }

    @Override
    public void enterDotted_name(Python3Parser.Dotted_nameContext ctx) {

    }

    @Override
    public void exitDotted_name(Python3Parser.Dotted_nameContext ctx) {

    }

    @Override
    public void enterGlobal_stmt(Python3Parser.Global_stmtContext ctx) {

    }

    @Override
    public void exitGlobal_stmt(Python3Parser.Global_stmtContext ctx) {

    }

    @Override
    public void enterNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx) {

    }

    @Override
    public void exitNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx) {

    }

    @Override
    public void enterAssert_stmt(Python3Parser.Assert_stmtContext ctx) {

    }

    @Override
    public void exitAssert_stmt(Python3Parser.Assert_stmtContext ctx) {

    }

    @Override
    public void enterCompound_stmt(Python3Parser.Compound_stmtContext ctx) {

    }

    @Override
    public void exitCompound_stmt(Python3Parser.Compound_stmtContext ctx) {

    }

    @Override
    public void enterAsync_stmt(Python3Parser.Async_stmtContext ctx) {

    }

    @Override
    public void exitAsync_stmt(Python3Parser.Async_stmtContext ctx) {

    }

    @Override
    public void enterIf_stmt(Python3Parser.If_stmtContext ctx) {

    }

    @Override
    public void exitIf_stmt(Python3Parser.If_stmtContext ctx) {

    }

    @Override
    public void enterWhile_stmt(Python3Parser.While_stmtContext ctx) {

    }

    @Override
    public void exitWhile_stmt(Python3Parser.While_stmtContext ctx) {

    }

    @Override
    public void enterFor_stmt(Python3Parser.For_stmtContext ctx) {

    }

    @Override
    public void exitFor_stmt(Python3Parser.For_stmtContext ctx) {

    }

    @Override
    public void enterTry_stmt(Python3Parser.Try_stmtContext ctx) {

    }

    @Override
    public void exitTry_stmt(Python3Parser.Try_stmtContext ctx) {

    }

    @Override
    public void enterWith_stmt(Python3Parser.With_stmtContext ctx) {

    }

    @Override
    public void exitWith_stmt(Python3Parser.With_stmtContext ctx) {

    }

    @Override
    public void enterWith_item(Python3Parser.With_itemContext ctx) {

    }

    @Override
    public void exitWith_item(Python3Parser.With_itemContext ctx) {

    }

    @Override
    public void enterExcept_clause(Python3Parser.Except_clauseContext ctx) {

    }

    @Override
    public void exitExcept_clause(Python3Parser.Except_clauseContext ctx) {

    }

    @Override
    public void enterBlock(Python3Parser.BlockContext ctx) {

    }

    @Override
    public void exitBlock(Python3Parser.BlockContext ctx) {

    }

    @Override
    public void enterMatch_stmt(Python3Parser.Match_stmtContext ctx) {

    }

    @Override
    public void exitMatch_stmt(Python3Parser.Match_stmtContext ctx) {

    }

    @Override
    public void enterSubject_expr(Python3Parser.Subject_exprContext ctx) {

    }

    @Override
    public void exitSubject_expr(Python3Parser.Subject_exprContext ctx) {

    }

    @Override
    public void enterStar_named_expressions(Python3Parser.Star_named_expressionsContext ctx) {

    }

    @Override
    public void exitStar_named_expressions(Python3Parser.Star_named_expressionsContext ctx) {

    }

    @Override
    public void enterStar_named_expression(Python3Parser.Star_named_expressionContext ctx) {

    }

    @Override
    public void exitStar_named_expression(Python3Parser.Star_named_expressionContext ctx) {

    }

    @Override
    public void enterCase_block(Python3Parser.Case_blockContext ctx) {

    }

    @Override
    public void exitCase_block(Python3Parser.Case_blockContext ctx) {

    }

    @Override
    public void enterGuard(Python3Parser.GuardContext ctx) {

    }

    @Override
    public void exitGuard(Python3Parser.GuardContext ctx) {

    }

    @Override
    public void enterPatterns(Python3Parser.PatternsContext ctx) {

    }

    @Override
    public void exitPatterns(Python3Parser.PatternsContext ctx) {

    }

    @Override
    public void enterPattern(Python3Parser.PatternContext ctx) {

    }

    @Override
    public void exitPattern(Python3Parser.PatternContext ctx) {

    }

    @Override
    public void enterAs_pattern(Python3Parser.As_patternContext ctx) {

    }

    @Override
    public void exitAs_pattern(Python3Parser.As_patternContext ctx) {

    }

    @Override
    public void enterOr_pattern(Python3Parser.Or_patternContext ctx) {

    }

    @Override
    public void exitOr_pattern(Python3Parser.Or_patternContext ctx) {

    }

    @Override
    public void enterClosed_pattern(Python3Parser.Closed_patternContext ctx) {

    }

    @Override
    public void exitClosed_pattern(Python3Parser.Closed_patternContext ctx) {

    }

    @Override
    public void enterLiteral_pattern(Python3Parser.Literal_patternContext ctx) {

    }

    @Override
    public void exitLiteral_pattern(Python3Parser.Literal_patternContext ctx) {

    }

    @Override
    public void enterLiteral_expr(Python3Parser.Literal_exprContext ctx) {

    }

    @Override
    public void exitLiteral_expr(Python3Parser.Literal_exprContext ctx) {

    }

    @Override
    public void enterComplex_number(Python3Parser.Complex_numberContext ctx) {

    }

    @Override
    public void exitComplex_number(Python3Parser.Complex_numberContext ctx) {

    }

    @Override
    public void enterSigned_number(Python3Parser.Signed_numberContext ctx) {

    }

    @Override
    public void exitSigned_number(Python3Parser.Signed_numberContext ctx) {

    }

    @Override
    public void enterSigned_real_number(Python3Parser.Signed_real_numberContext ctx) {

    }

    @Override
    public void exitSigned_real_number(Python3Parser.Signed_real_numberContext ctx) {

    }

    @Override
    public void enterReal_number(Python3Parser.Real_numberContext ctx) {

    }

    @Override
    public void exitReal_number(Python3Parser.Real_numberContext ctx) {

    }

    @Override
    public void enterImaginary_number(Python3Parser.Imaginary_numberContext ctx) {

    }

    @Override
    public void exitImaginary_number(Python3Parser.Imaginary_numberContext ctx) {

    }

    @Override
    public void enterCapture_pattern(Python3Parser.Capture_patternContext ctx) {

    }

    @Override
    public void exitCapture_pattern(Python3Parser.Capture_patternContext ctx) {

    }

    @Override
    public void enterPattern_capture_target(Python3Parser.Pattern_capture_targetContext ctx) {

    }

    @Override
    public void exitPattern_capture_target(Python3Parser.Pattern_capture_targetContext ctx) {

    }

    @Override
    public void enterWildcard_pattern(Python3Parser.Wildcard_patternContext ctx) {

    }

    @Override
    public void exitWildcard_pattern(Python3Parser.Wildcard_patternContext ctx) {

    }

    @Override
    public void enterValue_pattern(Python3Parser.Value_patternContext ctx) {

    }

    @Override
    public void exitValue_pattern(Python3Parser.Value_patternContext ctx) {

    }

    @Override
    public void enterAttr(Python3Parser.AttrContext ctx) {

    }

    @Override
    public void exitAttr(Python3Parser.AttrContext ctx) {

    }

    @Override
    public void enterName_or_attr(Python3Parser.Name_or_attrContext ctx) {

    }

    @Override
    public void exitName_or_attr(Python3Parser.Name_or_attrContext ctx) {

    }

    @Override
    public void enterGroup_pattern(Python3Parser.Group_patternContext ctx) {

    }

    @Override
    public void exitGroup_pattern(Python3Parser.Group_patternContext ctx) {

    }

    @Override
    public void enterSequence_pattern(Python3Parser.Sequence_patternContext ctx) {

    }

    @Override
    public void exitSequence_pattern(Python3Parser.Sequence_patternContext ctx) {

    }

    @Override
    public void enterOpen_sequence_pattern(Python3Parser.Open_sequence_patternContext ctx) {

    }

    @Override
    public void exitOpen_sequence_pattern(Python3Parser.Open_sequence_patternContext ctx) {

    }

    @Override
    public void enterMaybe_sequence_pattern(Python3Parser.Maybe_sequence_patternContext ctx) {

    }

    @Override
    public void exitMaybe_sequence_pattern(Python3Parser.Maybe_sequence_patternContext ctx) {

    }

    @Override
    public void enterMaybe_star_pattern(Python3Parser.Maybe_star_patternContext ctx) {

    }

    @Override
    public void exitMaybe_star_pattern(Python3Parser.Maybe_star_patternContext ctx) {

    }

    @Override
    public void enterStar_pattern(Python3Parser.Star_patternContext ctx) {

    }

    @Override
    public void exitStar_pattern(Python3Parser.Star_patternContext ctx) {

    }

    @Override
    public void enterMapping_pattern(Python3Parser.Mapping_patternContext ctx) {

    }

    @Override
    public void exitMapping_pattern(Python3Parser.Mapping_patternContext ctx) {

    }

    @Override
    public void enterItems_pattern(Python3Parser.Items_patternContext ctx) {

    }

    @Override
    public void exitItems_pattern(Python3Parser.Items_patternContext ctx) {

    }

    @Override
    public void enterKey_value_pattern(Python3Parser.Key_value_patternContext ctx) {

    }

    @Override
    public void exitKey_value_pattern(Python3Parser.Key_value_patternContext ctx) {

    }

    @Override
    public void enterDouble_star_pattern(Python3Parser.Double_star_patternContext ctx) {

    }

    @Override
    public void exitDouble_star_pattern(Python3Parser.Double_star_patternContext ctx) {

    }

    @Override
    public void enterClass_pattern(Python3Parser.Class_patternContext ctx) {

    }

    @Override
    public void exitClass_pattern(Python3Parser.Class_patternContext ctx) {

    }

    @Override
    public void enterPositional_patterns(Python3Parser.Positional_patternsContext ctx) {

    }

    @Override
    public void exitPositional_patterns(Python3Parser.Positional_patternsContext ctx) {

    }

    @Override
    public void enterKeyword_patterns(Python3Parser.Keyword_patternsContext ctx) {

    }

    @Override
    public void exitKeyword_patterns(Python3Parser.Keyword_patternsContext ctx) {

    }

    @Override
    public void enterKeyword_pattern(Python3Parser.Keyword_patternContext ctx) {

    }

    @Override
    public void exitKeyword_pattern(Python3Parser.Keyword_patternContext ctx) {

    }

    @Override
    public void enterTest(Python3Parser.TestContext ctx) {

    }

    @Override
    public void exitTest(Python3Parser.TestContext ctx) {

    }

    @Override
    public void enterTest_nocond(Python3Parser.Test_nocondContext ctx) {

    }

    @Override
    public void exitTest_nocond(Python3Parser.Test_nocondContext ctx) {

    }

    @Override
    public void enterLambdef(Python3Parser.LambdefContext ctx) {

    }

    @Override
    public void exitLambdef(Python3Parser.LambdefContext ctx) {

    }

    @Override
    public void enterLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx) {

    }

    @Override
    public void exitLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx) {

    }

    @Override
    public void enterOr_test(Python3Parser.Or_testContext ctx) {

    }

    @Override
    public void exitOr_test(Python3Parser.Or_testContext ctx) {

    }

    @Override
    public void enterAnd_test(Python3Parser.And_testContext ctx) {

    }

    @Override
    public void exitAnd_test(Python3Parser.And_testContext ctx) {

    }

    @Override
    public void enterNot_test(Python3Parser.Not_testContext ctx) {

    }

    @Override
    public void exitNot_test(Python3Parser.Not_testContext ctx) {

    }

    @Override
    public void enterComparison(Python3Parser.ComparisonContext ctx) {

    }

    @Override
    public void exitComparison(Python3Parser.ComparisonContext ctx) {

    }

    @Override
    public void enterComp_op(Python3Parser.Comp_opContext ctx) {

    }

    @Override
    public void exitComp_op(Python3Parser.Comp_opContext ctx) {

    }

    @Override
    public void enterStar_expr(Python3Parser.Star_exprContext ctx) {

    }

    @Override
    public void exitStar_expr(Python3Parser.Star_exprContext ctx) {

    }

    @Override
    public void enterExpr(Python3Parser.ExprContext ctx) {

    }

    @Override
    public void exitExpr(Python3Parser.ExprContext ctx) {

    }

    @Override
    public void enterXor_expr(Python3Parser.Xor_exprContext ctx) {

    }

    @Override
    public void exitXor_expr(Python3Parser.Xor_exprContext ctx) {

    }

    @Override
    public void enterAnd_expr(Python3Parser.And_exprContext ctx) {

    }

    @Override
    public void exitAnd_expr(Python3Parser.And_exprContext ctx) {

    }

    @Override
    public void enterShift_expr(Python3Parser.Shift_exprContext ctx) {

    }

    @Override
    public void exitShift_expr(Python3Parser.Shift_exprContext ctx) {

    }

    @Override
    public void enterArith_expr(Python3Parser.Arith_exprContext ctx) {

    }

    @Override
    public void exitArith_expr(Python3Parser.Arith_exprContext ctx) {

    }

    @Override
    public void enterTerm(Python3Parser.TermContext ctx) {

    }

    @Override
    public void exitTerm(Python3Parser.TermContext ctx) {

    }

    @Override
    public void enterFactor(Python3Parser.FactorContext ctx) {

    }

    @Override
    public void exitFactor(Python3Parser.FactorContext ctx) {

    }

    @Override
    public void enterPower(Python3Parser.PowerContext ctx) {

    }

    @Override
    public void exitPower(Python3Parser.PowerContext ctx) {

    }

    @Override
    public void enterAtom_expr(Python3Parser.Atom_exprContext ctx) {

    }

    @Override
    public void exitAtom_expr(Python3Parser.Atom_exprContext ctx) {

    }

    @Override
    public void enterAtom(Python3Parser.AtomContext ctx) {

    }

    @Override
    public void exitAtom(Python3Parser.AtomContext ctx) {

    }

    @Override
    public void enterName(Python3Parser.NameContext ctx) {

    }

    @Override
    public void exitName(Python3Parser.NameContext ctx) {

    }

    @Override
    public void enterTestlist_comp(Python3Parser.Testlist_compContext ctx) {

    }

    @Override
    public void exitTestlist_comp(Python3Parser.Testlist_compContext ctx) {

    }

    @Override
    public void enterTrailer(Python3Parser.TrailerContext ctx) {

    }

    @Override
    public void exitTrailer(Python3Parser.TrailerContext ctx) {

    }

    @Override
    public void enterSubscriptlist(Python3Parser.SubscriptlistContext ctx) {

    }

    @Override
    public void exitSubscriptlist(Python3Parser.SubscriptlistContext ctx) {

    }

    @Override
    public void enterSubscript_(Python3Parser.Subscript_Context ctx) {

    }

    @Override
    public void exitSubscript_(Python3Parser.Subscript_Context ctx) {

    }

    @Override
    public void enterSliceop(Python3Parser.SliceopContext ctx) {

    }

    @Override
    public void exitSliceop(Python3Parser.SliceopContext ctx) {

    }

    @Override
    public void enterExprlist(Python3Parser.ExprlistContext ctx) {

    }

    @Override
    public void exitExprlist(Python3Parser.ExprlistContext ctx) {

    }

    @Override
    public void enterTestlist(Python3Parser.TestlistContext ctx) {

    }

    @Override
    public void exitTestlist(Python3Parser.TestlistContext ctx) {

    }

    @Override
    public void enterDictorsetmaker(Python3Parser.DictorsetmakerContext ctx) {

    }

    @Override
    public void exitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx) {

    }

    @Override
    public void enterClassdef(Python3Parser.ClassdefContext ctx) {

    }

    @Override
    public void exitClassdef(Python3Parser.ClassdefContext ctx) {

    }

    @Override
    public void enterArglist(Python3Parser.ArglistContext ctx) {

    }

    @Override
    public void exitArglist(Python3Parser.ArglistContext ctx) {

    }

    @Override
    public void enterArgument(Python3Parser.ArgumentContext ctx) {

    }

    @Override
    public void exitArgument(Python3Parser.ArgumentContext ctx) {

    }

    @Override
    public void enterComp_iter(Python3Parser.Comp_iterContext ctx) {

    }

    @Override
    public void exitComp_iter(Python3Parser.Comp_iterContext ctx) {

    }

    @Override
    public void enterComp_for(Python3Parser.Comp_forContext ctx) {

    }

    @Override
    public void exitComp_for(Python3Parser.Comp_forContext ctx) {

    }

    @Override
    public void enterComp_if(Python3Parser.Comp_ifContext ctx) {

    }

    @Override
    public void exitComp_if(Python3Parser.Comp_ifContext ctx) {

    }

    @Override
    public void enterEncoding_decl(Python3Parser.Encoding_declContext ctx) {

    }

    @Override
    public void exitEncoding_decl(Python3Parser.Encoding_declContext ctx) {

    }

    @Override
    public void enterYield_expr(Python3Parser.Yield_exprContext ctx) {

    }

    @Override
    public void exitYield_expr(Python3Parser.Yield_exprContext ctx) {

    }

    @Override
    public void enterYield_arg(Python3Parser.Yield_argContext ctx) {

    }

    @Override
    public void exitYield_arg(Python3Parser.Yield_argContext ctx) {

    }

    @Override
    public void enterStrings(Python3Parser.StringsContext ctx) {

    }

    @Override
    public void exitStrings(Python3Parser.StringsContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}

