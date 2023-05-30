import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SmellDetector extends Python3ParserBaseListener{

    @Override
    public void enterSingle_input(Python3Parser.Single_inputContext ctx) {
        super.enterSingle_input(ctx);
    }

    @Override
    public void exitSingle_input(Python3Parser.Single_inputContext ctx) {
        super.exitSingle_input(ctx);
    }

    @Override
    public void enterFile_input(Python3Parser.File_inputContext ctx) {
        System.out.println("Acabo de entrar a mi file");
    }

    @Override
    public void exitFile_input(Python3Parser.File_inputContext ctx) {
        super.exitFile_input(ctx);
    }

    @Override
    public void enterEval_input(Python3Parser.Eval_inputContext ctx) {
        super.enterEval_input(ctx);
    }

    @Override
    public void exitEval_input(Python3Parser.Eval_inputContext ctx) {
        super.exitEval_input(ctx);
    }

    @Override
    public void enterDecorator(Python3Parser.DecoratorContext ctx) {
        super.enterDecorator(ctx);
    }

    @Override
    public void exitDecorator(Python3Parser.DecoratorContext ctx) {
        super.exitDecorator(ctx);
    }

    @Override
    public void enterDecorators(Python3Parser.DecoratorsContext ctx) {
        super.enterDecorators(ctx);
    }

    @Override
    public void exitDecorators(Python3Parser.DecoratorsContext ctx) {
        super.exitDecorators(ctx);
    }

    @Override
    public void enterDecorated(Python3Parser.DecoratedContext ctx) {
        super.enterDecorated(ctx);
    }

    @Override
    public void exitDecorated(Python3Parser.DecoratedContext ctx) {
        super.exitDecorated(ctx);
    }

    @Override
    public void enterAsync_funcdef(Python3Parser.Async_funcdefContext ctx) {
        super.enterAsync_funcdef(ctx);
    }

    @Override
    public void exitAsync_funcdef(Python3Parser.Async_funcdefContext ctx) {
        super.exitAsync_funcdef(ctx);
    }

    @Override
    public void enterFuncdef(Python3Parser.FuncdefContext ctx) {
        System.out.println("acabo de entrar a la funcion "+ ctx.getChild(1).getText());
        Python3Parser.BlockContext newCtx = ctx.block();
        int numLines = newCtx.stmt().size();
        // System.out.println(numLines);
        if(numLines>10){
            System.out.println("La funcion es muy larga pls recortala jejeje ");
        }
        System.out.println(newCtx.getPayload().getText());

    }

    @Override
    public void exitFuncdef(Python3Parser.FuncdefContext ctx) {
        super.exitFuncdef(ctx);
    }

    @Override
    public void enterParameters(Python3Parser.ParametersContext ctx) {
        super.enterParameters(ctx);
    }

    @Override
    public void exitParameters(Python3Parser.ParametersContext ctx) {
        super.exitParameters(ctx);
    }

    @Override
    public void enterTypedargslist(Python3Parser.TypedargslistContext ctx) {
        super.enterTypedargslist(ctx);
    }

    @Override
    public void exitTypedargslist(Python3Parser.TypedargslistContext ctx) {
        super.exitTypedargslist(ctx);
    }

    @Override
    public void enterTfpdef(Python3Parser.TfpdefContext ctx) {
        super.enterTfpdef(ctx);
    }

    @Override
    public void exitTfpdef(Python3Parser.TfpdefContext ctx) {
        super.exitTfpdef(ctx);
    }

    @Override
    public void enterVarargslist(Python3Parser.VarargslistContext ctx) {
        super.enterVarargslist(ctx);
    }

    @Override
    public void exitVarargslist(Python3Parser.VarargslistContext ctx) {
        super.exitVarargslist(ctx);
    }

    @Override
    public void enterVfpdef(Python3Parser.VfpdefContext ctx) {
        super.enterVfpdef(ctx);
    }

    @Override
    public void exitVfpdef(Python3Parser.VfpdefContext ctx) {
        super.exitVfpdef(ctx);
    }

    @Override
    public void enterStmt(Python3Parser.StmtContext ctx) {
        super.enterStmt(ctx);
    }

    @Override
    public void exitStmt(Python3Parser.StmtContext ctx) {
        super.exitStmt(ctx);
    }

    @Override
    public void enterSimple_stmts(Python3Parser.Simple_stmtsContext ctx) {
        super.enterSimple_stmts(ctx);
    }

    @Override
    public void exitSimple_stmts(Python3Parser.Simple_stmtsContext ctx) {
        super.exitSimple_stmts(ctx);
    }

    @Override
    public void enterSimple_stmt(Python3Parser.Simple_stmtContext ctx) {
        super.enterSimple_stmt(ctx);
    }

    @Override
    public void exitSimple_stmt(Python3Parser.Simple_stmtContext ctx) {
        super.exitSimple_stmt(ctx);
    }

    @Override
    public void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx) {
        super.enterExpr_stmt(ctx);
    }

    @Override
    public void exitExpr_stmt(Python3Parser.Expr_stmtContext ctx) {
        super.exitExpr_stmt(ctx);
    }

    @Override
    public void enterAnnassign(Python3Parser.AnnassignContext ctx) {
        super.enterAnnassign(ctx);
    }

    @Override
    public void exitAnnassign(Python3Parser.AnnassignContext ctx) {
        super.exitAnnassign(ctx);
    }

    @Override
    public void enterTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx) {
        super.enterTestlist_star_expr(ctx);
    }

    @Override
    public void exitTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx) {
        super.exitTestlist_star_expr(ctx);
    }

    @Override
    public void enterAugassign(Python3Parser.AugassignContext ctx) {
        super.enterAugassign(ctx);
    }

    @Override
    public void exitAugassign(Python3Parser.AugassignContext ctx) {
        super.exitAugassign(ctx);
    }

    @Override
    public void enterDel_stmt(Python3Parser.Del_stmtContext ctx) {
        super.enterDel_stmt(ctx);
    }

    @Override
    public void exitDel_stmt(Python3Parser.Del_stmtContext ctx) {
        super.exitDel_stmt(ctx);
    }

    @Override
    public void enterPass_stmt(Python3Parser.Pass_stmtContext ctx) {
        super.enterPass_stmt(ctx);
    }

    @Override
    public void exitPass_stmt(Python3Parser.Pass_stmtContext ctx) {
        super.exitPass_stmt(ctx);
    }

    @Override
    public void enterFlow_stmt(Python3Parser.Flow_stmtContext ctx) {
        super.enterFlow_stmt(ctx);
    }

    @Override
    public void exitFlow_stmt(Python3Parser.Flow_stmtContext ctx) {
        super.exitFlow_stmt(ctx);
    }

    @Override
    public void enterBreak_stmt(Python3Parser.Break_stmtContext ctx) {
        super.enterBreak_stmt(ctx);
    }

    @Override
    public void exitBreak_stmt(Python3Parser.Break_stmtContext ctx) {
        super.exitBreak_stmt(ctx);
    }

    @Override
    public void enterContinue_stmt(Python3Parser.Continue_stmtContext ctx) {
        super.enterContinue_stmt(ctx);
    }

    @Override
    public void exitContinue_stmt(Python3Parser.Continue_stmtContext ctx) {
        super.exitContinue_stmt(ctx);
    }

    @Override
    public void enterReturn_stmt(Python3Parser.Return_stmtContext ctx) {
        super.enterReturn_stmt(ctx);
    }

    @Override
    public void exitReturn_stmt(Python3Parser.Return_stmtContext ctx) {
        super.exitReturn_stmt(ctx);
    }

    @Override
    public void enterYield_stmt(Python3Parser.Yield_stmtContext ctx) {
        super.enterYield_stmt(ctx);
    }

    @Override
    public void exitYield_stmt(Python3Parser.Yield_stmtContext ctx) {
        super.exitYield_stmt(ctx);
    }

    @Override
    public void enterRaise_stmt(Python3Parser.Raise_stmtContext ctx) {
        super.enterRaise_stmt(ctx);
    }

    @Override
    public void exitRaise_stmt(Python3Parser.Raise_stmtContext ctx) {
        super.exitRaise_stmt(ctx);
    }

    @Override
    public void enterImport_stmt(Python3Parser.Import_stmtContext ctx) {
        super.enterImport_stmt(ctx);
    }

    @Override
    public void exitImport_stmt(Python3Parser.Import_stmtContext ctx) {
        super.exitImport_stmt(ctx);
    }

    @Override
    public void enterImport_name(Python3Parser.Import_nameContext ctx) {
        super.enterImport_name(ctx);
    }

    @Override
    public void exitImport_name(Python3Parser.Import_nameContext ctx) {
        super.exitImport_name(ctx);
    }

    @Override
    public void enterImport_from(Python3Parser.Import_fromContext ctx) {
        super.enterImport_from(ctx);
    }

    @Override
    public void exitImport_from(Python3Parser.Import_fromContext ctx) {
        super.exitImport_from(ctx);
    }

    @Override
    public void enterImport_as_name(Python3Parser.Import_as_nameContext ctx) {
        super.enterImport_as_name(ctx);
    }

    @Override
    public void exitImport_as_name(Python3Parser.Import_as_nameContext ctx) {
        super.exitImport_as_name(ctx);
    }

    @Override
    public void enterDotted_as_name(Python3Parser.Dotted_as_nameContext ctx) {
        super.enterDotted_as_name(ctx);
    }

    @Override
    public void exitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx) {
        super.exitDotted_as_name(ctx);
    }

    @Override
    public void enterImport_as_names(Python3Parser.Import_as_namesContext ctx) {
        super.enterImport_as_names(ctx);
    }

    @Override
    public void exitImport_as_names(Python3Parser.Import_as_namesContext ctx) {
        super.exitImport_as_names(ctx);
    }

    @Override
    public void enterDotted_as_names(Python3Parser.Dotted_as_namesContext ctx) {
        super.enterDotted_as_names(ctx);
    }

    @Override
    public void exitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx) {
        super.exitDotted_as_names(ctx);
    }

    @Override
    public void enterDotted_name(Python3Parser.Dotted_nameContext ctx) {
        super.enterDotted_name(ctx);
    }

    @Override
    public void exitDotted_name(Python3Parser.Dotted_nameContext ctx) {
        super.exitDotted_name(ctx);
    }

    @Override
    public void enterGlobal_stmt(Python3Parser.Global_stmtContext ctx) {
        super.enterGlobal_stmt(ctx);
    }

    @Override
    public void exitGlobal_stmt(Python3Parser.Global_stmtContext ctx) {
        super.exitGlobal_stmt(ctx);
    }

    @Override
    public void enterNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx) {
        super.enterNonlocal_stmt(ctx);
    }

    @Override
    public void exitNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx) {
        super.exitNonlocal_stmt(ctx);
    }

    @Override
    public void enterAssert_stmt(Python3Parser.Assert_stmtContext ctx) {
        super.enterAssert_stmt(ctx);
    }

    @Override
    public void exitAssert_stmt(Python3Parser.Assert_stmtContext ctx) {
        super.exitAssert_stmt(ctx);
    }

    @Override
    public void enterCompound_stmt(Python3Parser.Compound_stmtContext ctx) {
        super.enterCompound_stmt(ctx);
    }

    @Override
    public void exitCompound_stmt(Python3Parser.Compound_stmtContext ctx) {
        super.exitCompound_stmt(ctx);
    }

    @Override
    public void enterAsync_stmt(Python3Parser.Async_stmtContext ctx) {
        super.enterAsync_stmt(ctx);
    }

    @Override
    public void exitAsync_stmt(Python3Parser.Async_stmtContext ctx) {
        super.exitAsync_stmt(ctx);
    }

    @Override
    public void enterIf_stmt(Python3Parser.If_stmtContext ctx) {
        super.enterIf_stmt(ctx);
    }

    @Override
    public void exitIf_stmt(Python3Parser.If_stmtContext ctx) {
        super.exitIf_stmt(ctx);
    }

    @Override
    public void enterWhile_stmt(Python3Parser.While_stmtContext ctx) {
        super.enterWhile_stmt(ctx);
    }

    @Override
    public void exitWhile_stmt(Python3Parser.While_stmtContext ctx) {
        super.exitWhile_stmt(ctx);
    }

    @Override
    public void enterFor_stmt(Python3Parser.For_stmtContext ctx) {
        super.enterFor_stmt(ctx);
    }

    @Override
    public void exitFor_stmt(Python3Parser.For_stmtContext ctx) {
        super.exitFor_stmt(ctx);
    }

    @Override
    public void enterTry_stmt(Python3Parser.Try_stmtContext ctx) {
        super.enterTry_stmt(ctx);
    }

    @Override
    public void exitTry_stmt(Python3Parser.Try_stmtContext ctx) {
        super.exitTry_stmt(ctx);
    }

    @Override
    public void enterWith_stmt(Python3Parser.With_stmtContext ctx) {
        super.enterWith_stmt(ctx);
    }

    @Override
    public void exitWith_stmt(Python3Parser.With_stmtContext ctx) {
        super.exitWith_stmt(ctx);
    }

    @Override
    public void enterWith_item(Python3Parser.With_itemContext ctx) {
        super.enterWith_item(ctx);
    }

    @Override
    public void exitWith_item(Python3Parser.With_itemContext ctx) {
        super.exitWith_item(ctx);
    }

    @Override
    public void enterExcept_clause(Python3Parser.Except_clauseContext ctx) {
        super.enterExcept_clause(ctx);
    }

    @Override
    public void exitExcept_clause(Python3Parser.Except_clauseContext ctx) {
        super.exitExcept_clause(ctx);
    }

    @Override
    public void enterBlock(Python3Parser.BlockContext ctx) {
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(Python3Parser.BlockContext ctx) {
        super.exitBlock(ctx);
    }

    @Override
    public void enterMatch_stmt(Python3Parser.Match_stmtContext ctx) {
        super.enterMatch_stmt(ctx);
    }

    @Override
    public void exitMatch_stmt(Python3Parser.Match_stmtContext ctx) {
        super.exitMatch_stmt(ctx);
    }

    @Override
    public void enterSubject_expr(Python3Parser.Subject_exprContext ctx) {
        super.enterSubject_expr(ctx);
    }

    @Override
    public void exitSubject_expr(Python3Parser.Subject_exprContext ctx) {
        super.exitSubject_expr(ctx);
    }

    @Override
    public void enterStar_named_expressions(Python3Parser.Star_named_expressionsContext ctx) {
        super.enterStar_named_expressions(ctx);
    }

    @Override
    public void exitStar_named_expressions(Python3Parser.Star_named_expressionsContext ctx) {
        super.exitStar_named_expressions(ctx);
    }

    @Override
    public void enterStar_named_expression(Python3Parser.Star_named_expressionContext ctx) {
        super.enterStar_named_expression(ctx);
    }

    @Override
    public void exitStar_named_expression(Python3Parser.Star_named_expressionContext ctx) {
        super.exitStar_named_expression(ctx);
    }

    @Override
    public void enterCase_block(Python3Parser.Case_blockContext ctx) {
        super.enterCase_block(ctx);
    }

    @Override
    public void exitCase_block(Python3Parser.Case_blockContext ctx) {
        super.exitCase_block(ctx);
    }

    @Override
    public void enterGuard(Python3Parser.GuardContext ctx) {
        super.enterGuard(ctx);
    }

    @Override
    public void exitGuard(Python3Parser.GuardContext ctx) {
        super.exitGuard(ctx);
    }

    @Override
    public void enterPatterns(Python3Parser.PatternsContext ctx) {
        super.enterPatterns(ctx);
    }

    @Override
    public void exitPatterns(Python3Parser.PatternsContext ctx) {
        super.exitPatterns(ctx);
    }

    @Override
    public void enterPattern(Python3Parser.PatternContext ctx) {
        super.enterPattern(ctx);
    }

    @Override
    public void exitPattern(Python3Parser.PatternContext ctx) {
        super.exitPattern(ctx);
    }

    @Override
    public void enterAs_pattern(Python3Parser.As_patternContext ctx) {
        super.enterAs_pattern(ctx);
    }

    @Override
    public void exitAs_pattern(Python3Parser.As_patternContext ctx) {
        super.exitAs_pattern(ctx);
    }

    @Override
    public void enterOr_pattern(Python3Parser.Or_patternContext ctx) {
        super.enterOr_pattern(ctx);
    }

    @Override
    public void exitOr_pattern(Python3Parser.Or_patternContext ctx) {
        super.exitOr_pattern(ctx);
    }

    @Override
    public void enterClosed_pattern(Python3Parser.Closed_patternContext ctx) {
        super.enterClosed_pattern(ctx);
    }

    @Override
    public void exitClosed_pattern(Python3Parser.Closed_patternContext ctx) {
        super.exitClosed_pattern(ctx);
    }

    @Override
    public void enterLiteral_pattern(Python3Parser.Literal_patternContext ctx) {
        super.enterLiteral_pattern(ctx);
    }

    @Override
    public void exitLiteral_pattern(Python3Parser.Literal_patternContext ctx) {
        super.exitLiteral_pattern(ctx);
    }

    @Override
    public void enterLiteral_expr(Python3Parser.Literal_exprContext ctx) {
        super.enterLiteral_expr(ctx);
    }

    @Override
    public void exitLiteral_expr(Python3Parser.Literal_exprContext ctx) {
        super.exitLiteral_expr(ctx);
    }

    @Override
    public void enterComplex_number(Python3Parser.Complex_numberContext ctx) {
        super.enterComplex_number(ctx);
    }

    @Override
    public void exitComplex_number(Python3Parser.Complex_numberContext ctx) {
        super.exitComplex_number(ctx);
    }

    @Override
    public void enterSigned_number(Python3Parser.Signed_numberContext ctx) {
        super.enterSigned_number(ctx);
    }

    @Override
    public void exitSigned_number(Python3Parser.Signed_numberContext ctx) {
        super.exitSigned_number(ctx);
    }

    @Override
    public void enterSigned_real_number(Python3Parser.Signed_real_numberContext ctx) {
        super.enterSigned_real_number(ctx);
    }

    @Override
    public void exitSigned_real_number(Python3Parser.Signed_real_numberContext ctx) {
        super.exitSigned_real_number(ctx);
    }

    @Override
    public void enterReal_number(Python3Parser.Real_numberContext ctx) {
        super.enterReal_number(ctx);
    }

    @Override
    public void exitReal_number(Python3Parser.Real_numberContext ctx) {
        super.exitReal_number(ctx);
    }

    @Override
    public void enterImaginary_number(Python3Parser.Imaginary_numberContext ctx) {
        super.enterImaginary_number(ctx);
    }

    @Override
    public void exitImaginary_number(Python3Parser.Imaginary_numberContext ctx) {
        super.exitImaginary_number(ctx);
    }

    @Override
    public void enterCapture_pattern(Python3Parser.Capture_patternContext ctx) {
        super.enterCapture_pattern(ctx);
    }

    @Override
    public void exitCapture_pattern(Python3Parser.Capture_patternContext ctx) {
        super.exitCapture_pattern(ctx);
    }

    @Override
    public void enterPattern_capture_target(Python3Parser.Pattern_capture_targetContext ctx) {
        super.enterPattern_capture_target(ctx);
    }

    @Override
    public void exitPattern_capture_target(Python3Parser.Pattern_capture_targetContext ctx) {
        super.exitPattern_capture_target(ctx);
    }

    @Override
    public void enterWildcard_pattern(Python3Parser.Wildcard_patternContext ctx) {
        super.enterWildcard_pattern(ctx);
    }

    @Override
    public void exitWildcard_pattern(Python3Parser.Wildcard_patternContext ctx) {
        super.exitWildcard_pattern(ctx);
    }

    @Override
    public void enterValue_pattern(Python3Parser.Value_patternContext ctx) {
        super.enterValue_pattern(ctx);
    }

    @Override
    public void exitValue_pattern(Python3Parser.Value_patternContext ctx) {
        super.exitValue_pattern(ctx);
    }

    @Override
    public void enterAttr(Python3Parser.AttrContext ctx) {
        super.enterAttr(ctx);
    }

    @Override
    public void exitAttr(Python3Parser.AttrContext ctx) {
        super.exitAttr(ctx);
    }

    @Override
    public void enterName_or_attr(Python3Parser.Name_or_attrContext ctx) {
        super.enterName_or_attr(ctx);
    }

    @Override
    public void exitName_or_attr(Python3Parser.Name_or_attrContext ctx) {
        super.exitName_or_attr(ctx);
    }

    @Override
    public void enterGroup_pattern(Python3Parser.Group_patternContext ctx) {
        super.enterGroup_pattern(ctx);
    }

    @Override
    public void exitGroup_pattern(Python3Parser.Group_patternContext ctx) {
        super.exitGroup_pattern(ctx);
    }

    @Override
    public void enterSequence_pattern(Python3Parser.Sequence_patternContext ctx) {
        super.enterSequence_pattern(ctx);
    }

    @Override
    public void exitSequence_pattern(Python3Parser.Sequence_patternContext ctx) {
        super.exitSequence_pattern(ctx);
    }

    @Override
    public void enterOpen_sequence_pattern(Python3Parser.Open_sequence_patternContext ctx) {
        super.enterOpen_sequence_pattern(ctx);
    }

    @Override
    public void exitOpen_sequence_pattern(Python3Parser.Open_sequence_patternContext ctx) {
        super.exitOpen_sequence_pattern(ctx);
    }

    @Override
    public void enterMaybe_sequence_pattern(Python3Parser.Maybe_sequence_patternContext ctx) {
        super.enterMaybe_sequence_pattern(ctx);
    }

    @Override
    public void exitMaybe_sequence_pattern(Python3Parser.Maybe_sequence_patternContext ctx) {
        super.exitMaybe_sequence_pattern(ctx);
    }

    @Override
    public void enterMaybe_star_pattern(Python3Parser.Maybe_star_patternContext ctx) {
        super.enterMaybe_star_pattern(ctx);
    }

    @Override
    public void exitMaybe_star_pattern(Python3Parser.Maybe_star_patternContext ctx) {
        super.exitMaybe_star_pattern(ctx);
    }

    @Override
    public void enterStar_pattern(Python3Parser.Star_patternContext ctx) {
        super.enterStar_pattern(ctx);
    }

    @Override
    public void exitStar_pattern(Python3Parser.Star_patternContext ctx) {
        super.exitStar_pattern(ctx);
    }

    @Override
    public void enterMapping_pattern(Python3Parser.Mapping_patternContext ctx) {
        super.enterMapping_pattern(ctx);
    }

    @Override
    public void exitMapping_pattern(Python3Parser.Mapping_patternContext ctx) {
        super.exitMapping_pattern(ctx);
    }

    @Override
    public void enterItems_pattern(Python3Parser.Items_patternContext ctx) {
        super.enterItems_pattern(ctx);
    }

    @Override
    public void exitItems_pattern(Python3Parser.Items_patternContext ctx) {
        super.exitItems_pattern(ctx);
    }

    @Override
    public void enterKey_value_pattern(Python3Parser.Key_value_patternContext ctx) {
        super.enterKey_value_pattern(ctx);
    }

    @Override
    public void exitKey_value_pattern(Python3Parser.Key_value_patternContext ctx) {
        super.exitKey_value_pattern(ctx);
    }

    @Override
    public void enterDouble_star_pattern(Python3Parser.Double_star_patternContext ctx) {
        super.enterDouble_star_pattern(ctx);
    }

    @Override
    public void exitDouble_star_pattern(Python3Parser.Double_star_patternContext ctx) {
        super.exitDouble_star_pattern(ctx);
    }

    @Override
    public void enterClass_pattern(Python3Parser.Class_patternContext ctx) {
        super.enterClass_pattern(ctx);
    }

    @Override
    public void exitClass_pattern(Python3Parser.Class_patternContext ctx) {
        super.exitClass_pattern(ctx);
    }

    @Override
    public void enterPositional_patterns(Python3Parser.Positional_patternsContext ctx) {
        super.enterPositional_patterns(ctx);
    }

    @Override
    public void exitPositional_patterns(Python3Parser.Positional_patternsContext ctx) {
        super.exitPositional_patterns(ctx);
    }

    @Override
    public void enterKeyword_patterns(Python3Parser.Keyword_patternsContext ctx) {
        super.enterKeyword_patterns(ctx);
    }

    @Override
    public void exitKeyword_patterns(Python3Parser.Keyword_patternsContext ctx) {
        super.exitKeyword_patterns(ctx);
    }

    @Override
    public void enterKeyword_pattern(Python3Parser.Keyword_patternContext ctx) {
        super.enterKeyword_pattern(ctx);
    }

    @Override
    public void exitKeyword_pattern(Python3Parser.Keyword_patternContext ctx) {
        super.exitKeyword_pattern(ctx);
    }

    @Override
    public void enterTest(Python3Parser.TestContext ctx) {
        super.enterTest(ctx);
    }

    @Override
    public void exitTest(Python3Parser.TestContext ctx) {
        super.exitTest(ctx);
    }

    @Override
    public void enterTest_nocond(Python3Parser.Test_nocondContext ctx) {
        super.enterTest_nocond(ctx);
    }

    @Override
    public void exitTest_nocond(Python3Parser.Test_nocondContext ctx) {
        super.exitTest_nocond(ctx);
    }

    @Override
    public void enterLambdef(Python3Parser.LambdefContext ctx) {
        super.enterLambdef(ctx);
    }

    @Override
    public void exitLambdef(Python3Parser.LambdefContext ctx) {
        super.exitLambdef(ctx);
    }

    @Override
    public void enterLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx) {
        super.enterLambdef_nocond(ctx);
    }

    @Override
    public void exitLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx) {
        super.exitLambdef_nocond(ctx);
    }

    @Override
    public void enterOr_test(Python3Parser.Or_testContext ctx) {
        super.enterOr_test(ctx);
    }

    @Override
    public void exitOr_test(Python3Parser.Or_testContext ctx) {
        super.exitOr_test(ctx);
    }

    @Override
    public void enterAnd_test(Python3Parser.And_testContext ctx) {
        super.enterAnd_test(ctx);
    }

    @Override
    public void exitAnd_test(Python3Parser.And_testContext ctx) {
        super.exitAnd_test(ctx);
    }

    @Override
    public void enterNot_test(Python3Parser.Not_testContext ctx) {
        super.enterNot_test(ctx);
    }

    @Override
    public void exitNot_test(Python3Parser.Not_testContext ctx) {
        super.exitNot_test(ctx);
    }

    @Override
    public void enterComparison(Python3Parser.ComparisonContext ctx) {
        super.enterComparison(ctx);
    }

    @Override
    public void exitComparison(Python3Parser.ComparisonContext ctx) {
        super.exitComparison(ctx);
    }

    @Override
    public void enterComp_op(Python3Parser.Comp_opContext ctx) {
        super.enterComp_op(ctx);
    }

    @Override
    public void exitComp_op(Python3Parser.Comp_opContext ctx) {
        super.exitComp_op(ctx);
    }

    @Override
    public void enterStar_expr(Python3Parser.Star_exprContext ctx) {
        super.enterStar_expr(ctx);
    }

    @Override
    public void exitStar_expr(Python3Parser.Star_exprContext ctx) {
        super.exitStar_expr(ctx);
    }

    @Override
    public void enterExpr(Python3Parser.ExprContext ctx) {
        super.enterExpr(ctx);
    }

    @Override
    public void exitExpr(Python3Parser.ExprContext ctx) {
        super.exitExpr(ctx);
    }

    @Override
    public void enterXor_expr(Python3Parser.Xor_exprContext ctx) {
        super.enterXor_expr(ctx);
    }

    @Override
    public void exitXor_expr(Python3Parser.Xor_exprContext ctx) {
        super.exitXor_expr(ctx);
    }

    @Override
    public void enterAnd_expr(Python3Parser.And_exprContext ctx) {
        super.enterAnd_expr(ctx);
    }

    @Override
    public void exitAnd_expr(Python3Parser.And_exprContext ctx) {
        super.exitAnd_expr(ctx);
    }

    @Override
    public void enterShift_expr(Python3Parser.Shift_exprContext ctx) {
        super.enterShift_expr(ctx);
    }

    @Override
    public void exitShift_expr(Python3Parser.Shift_exprContext ctx) {
        super.exitShift_expr(ctx);
    }

    @Override
    public void enterArith_expr(Python3Parser.Arith_exprContext ctx) {
        super.enterArith_expr(ctx);
    }

    @Override
    public void exitArith_expr(Python3Parser.Arith_exprContext ctx) {
        super.exitArith_expr(ctx);
    }

    @Override
    public void enterTerm(Python3Parser.TermContext ctx) {
        super.enterTerm(ctx);
    }

    @Override
    public void exitTerm(Python3Parser.TermContext ctx) {
        super.exitTerm(ctx);
    }

    @Override
    public void enterFactor(Python3Parser.FactorContext ctx) {
        super.enterFactor(ctx);
    }

    @Override
    public void exitFactor(Python3Parser.FactorContext ctx) {
        super.exitFactor(ctx);
    }

    @Override
    public void enterPower(Python3Parser.PowerContext ctx) {
        super.enterPower(ctx);
    }

    @Override
    public void exitPower(Python3Parser.PowerContext ctx) {
        super.exitPower(ctx);
    }

    @Override
    public void enterAtom_expr(Python3Parser.Atom_exprContext ctx) {
        super.enterAtom_expr(ctx);
    }

    @Override
    public void exitAtom_expr(Python3Parser.Atom_exprContext ctx) {
        super.exitAtom_expr(ctx);
    }

    @Override
    public void enterAtom(Python3Parser.AtomContext ctx) {
        super.enterAtom(ctx);
    }

    @Override
    public void exitAtom(Python3Parser.AtomContext ctx) {
        super.exitAtom(ctx);
    }

    @Override
    public void enterName(Python3Parser.NameContext ctx) {
        super.enterName(ctx);
    }

    @Override
    public void exitName(Python3Parser.NameContext ctx) {
        super.exitName(ctx);
    }

    @Override
    public void enterTestlist_comp(Python3Parser.Testlist_compContext ctx) {
        super.enterTestlist_comp(ctx);
    }

    @Override
    public void exitTestlist_comp(Python3Parser.Testlist_compContext ctx) {
        super.exitTestlist_comp(ctx);
    }

    @Override
    public void enterTrailer(Python3Parser.TrailerContext ctx) {
        super.enterTrailer(ctx);
    }

    @Override
    public void exitTrailer(Python3Parser.TrailerContext ctx) {
        super.exitTrailer(ctx);
    }

    @Override
    public void enterSubscriptlist(Python3Parser.SubscriptlistContext ctx) {
        super.enterSubscriptlist(ctx);
    }

    @Override
    public void exitSubscriptlist(Python3Parser.SubscriptlistContext ctx) {
        super.exitSubscriptlist(ctx);
    }

    @Override
    public void enterSubscript_(Python3Parser.Subscript_Context ctx) {
        super.enterSubscript_(ctx);
    }

    @Override
    public void exitSubscript_(Python3Parser.Subscript_Context ctx) {
        super.exitSubscript_(ctx);
    }

    @Override
    public void enterSliceop(Python3Parser.SliceopContext ctx) {
        super.enterSliceop(ctx);
    }

    @Override
    public void exitSliceop(Python3Parser.SliceopContext ctx) {
        super.exitSliceop(ctx);
    }

    @Override
    public void enterExprlist(Python3Parser.ExprlistContext ctx) {
        super.enterExprlist(ctx);
    }

    @Override
    public void exitExprlist(Python3Parser.ExprlistContext ctx) {
        super.exitExprlist(ctx);
    }

    @Override
    public void enterTestlist(Python3Parser.TestlistContext ctx) {
        super.enterTestlist(ctx);
    }

    @Override
    public void exitTestlist(Python3Parser.TestlistContext ctx) {
        super.exitTestlist(ctx);
    }

    @Override
    public void enterDictorsetmaker(Python3Parser.DictorsetmakerContext ctx) {
        super.enterDictorsetmaker(ctx);
    }

    @Override
    public void exitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx) {
        super.exitDictorsetmaker(ctx);
    }

    @Override
    public void enterClassdef(Python3Parser.ClassdefContext ctx) {
        super.enterClassdef(ctx);
    }

    @Override
    public void exitClassdef(Python3Parser.ClassdefContext ctx) {
        super.exitClassdef(ctx);
    }

    @Override
    public void enterArglist(Python3Parser.ArglistContext ctx) {
        super.enterArglist(ctx);
    }

    @Override
    public void exitArglist(Python3Parser.ArglistContext ctx) {
        super.exitArglist(ctx);
    }

    @Override
    public void enterArgument(Python3Parser.ArgumentContext ctx) {
        super.enterArgument(ctx);
    }

    @Override
    public void exitArgument(Python3Parser.ArgumentContext ctx) {
        super.exitArgument(ctx);
    }

    @Override
    public void enterComp_iter(Python3Parser.Comp_iterContext ctx) {
        super.enterComp_iter(ctx);
    }

    @Override
    public void exitComp_iter(Python3Parser.Comp_iterContext ctx) {
        super.exitComp_iter(ctx);
    }

    @Override
    public void enterComp_for(Python3Parser.Comp_forContext ctx) {
        super.enterComp_for(ctx);
    }

    @Override
    public void exitComp_for(Python3Parser.Comp_forContext ctx) {
        super.exitComp_for(ctx);
    }

    @Override
    public void enterComp_if(Python3Parser.Comp_ifContext ctx) {
        super.enterComp_if(ctx);
    }

    @Override
    public void exitComp_if(Python3Parser.Comp_ifContext ctx) {
        super.exitComp_if(ctx);
    }

    @Override
    public void enterEncoding_decl(Python3Parser.Encoding_declContext ctx) {
        super.enterEncoding_decl(ctx);
    }

    @Override
    public void exitEncoding_decl(Python3Parser.Encoding_declContext ctx) {
        super.exitEncoding_decl(ctx);
    }

    @Override
    public void enterYield_expr(Python3Parser.Yield_exprContext ctx) {
        super.enterYield_expr(ctx);
    }

    @Override
    public void exitYield_expr(Python3Parser.Yield_exprContext ctx) {
        super.exitYield_expr(ctx);
    }

    @Override
    public void enterYield_arg(Python3Parser.Yield_argContext ctx) {
        super.enterYield_arg(ctx);
    }

    @Override
    public void exitYield_arg(Python3Parser.Yield_argContext ctx) {
        super.exitYield_arg(ctx);
    }

    @Override
    public void enterStrings(Python3Parser.StringsContext ctx) {
        super.enterStrings(ctx);
    }

    @Override
    public void exitStrings(Python3Parser.StringsContext ctx) {
        super.exitStrings(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}

