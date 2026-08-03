.class public final synthetic LYue/ۥ۠ۢۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,496:1\n190#2:497\n*S KotlinDebug\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n*L\n435#1:497\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'cache()\' is \'shareIn\' with unlimited replay and \'started = SharingStared.Lazily\' argument\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۧ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p5    # LYue/ۥۣ۠ۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'combineLatest\' is \'combine\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "combine(this, other, other2, other3, transform)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "T4:",
            "Ljava/lang/Object;",
            "T5:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT1;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT2;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT3;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT4;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT5;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e7<",
            "-TT1;-TT2;-TT3;-TT4;-TT5;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    invoke-static/range {p0 .. p5}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۡۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۧ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۦ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠ۢۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'combineLatest\' is \'combine\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "combine(this, other, other2, other3, transform)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "T4:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT1;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT2;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT3;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT4;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e6<",
            "-TT1;-TT2;-TT3;-TT4;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۡۢ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۦ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۥ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'combineLatest\' is \'combine\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "combine(this, other, other2, transform)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT1;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT2;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT3;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e5<",
            "-TT1;-TT2;-TT3;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, LYue/ۥۣ۠ۢۧ;->ۥۣ۟۟ۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۥ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'combineLatest\' is \'combine\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.combine(other, transform)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT1;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT2;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-TT1;-TT2;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۡۤ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'compose\' is \'let\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "let(transformer)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;+",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TR;>;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'concatMap\' is \'flatMapConcat\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "flatMapConcat(mapper)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TR;>;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'concatWith\' is \'onCompletion\'. Use \'onCompletion { if (it == null) emitAll(other) }\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "onCompletion { if (it == null) emitAll(other) }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۣ۠ۢۡ;Ljava/lang/Object;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'concatWith\' is \'onCompletion\'. Use \'onCompletion { emit(value) }\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "onCompletion { emit(value) }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;TT;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۟ۤ(LYue/ۥۣ۠ۢۡ;J)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Use \'onEach { delay(timeMillis) }\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "onEach { delay(timeMillis) }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;J)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۥ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LYue/ۥ۠ۢۥ$ۥ;-><init>(JLYue/ۥ۟ۧۤۢ;)V

    invoke-static {p0, v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۤ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۥ(LYue/ۥۣ۠ۢۡ;J)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Use \'onStart { delay(timeMillis) }\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "onStart { delay(timeMillis) }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;J)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۥ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LYue/ۥ۠ۢۥ$ۥ۟;-><init>(JLYue/ۥ۟ۧۤۢ;)V

    invoke-static {p0, v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۦ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue is \'flatMapConcat\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "flatMapConcat(mapper)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TR;>;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۟ۧ(LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'flatten\' is \'flattenConcat\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "flattenConcat()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۟ۨ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'forEach\' is \'collect\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "collect(action)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۠(LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'merge\' is \'flattenConcat\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "flattenConcat()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۠۟()Ljava/lang/Void;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not implemented, should not be called"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۥ۟۟۠۠(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Collect flow in the desired context instead"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۠ۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emitAll(fallback) }\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "catch { emitAll(fallback) }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۠ۢ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emitAll(fallback) }\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "catch { emitAll(fallback) }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥۣ۟۟۠(LYue/ۥۣ۠ۢۡ;Ljava/lang/Object;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emit(fallback) }\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "catch { emit(fallback) }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;TT;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۠ۤ(LYue/ۥۣ۠ۢۡ;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { e -> if (predicate(e)) emit(fallback) else throw e }\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;TT;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Boolean;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۥ$ۥ۟۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p1, v1}, LYue/ۥ۠ۢۥ$ۥ۟۟۟;-><init>(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {p0, v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟۠ۤ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۠ۥ(LYue/ۥۣ۠ۢۡ;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥۣ۠ۢۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, LYue/ۥ۠ۢۥ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۢۥ$ۥ۟۟;

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠(LYue/ۥۣ۠ۢۡ;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۦ(LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'publish()\' is \'shareIn\'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \npublish().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.shareIn(scope, 0)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۠ۧ(LYue/ۥۣ۠ۢۡ;I)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'publish(bufferSize)\' is \'buffer\' followed by \'shareIn\'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \npublish().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.buffer(bufferSize).shareIn(scope, 0)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;I)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟۠ۨ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Collect flow in the desired context instead"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟ۡ(LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'replay()\' is \'shareIn\' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \nreplay().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.shareIn(scope, Int.MAX_VALUE)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟ۡ۟(LYue/ۥۣ۠ۢۡ;I)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'replay(bufferSize)\' is \'shareIn\' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \nreplay().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.shareIn(scope, bufferSize)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;I)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟ۡ۠(LYue/ۥۣ۠ۢۡ;Ljava/lang/Object;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۣ۟ۤ۟;
        .end annotation

        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow has less verbose \'scan\' shortcut"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "scan(initial, operation)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;TR;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-TR;-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟ۡۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "\'scanReduce\' was renamed to \'runningReduce\' to be consistent with Kotlin standard library"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "runningReduce(operation)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-TT;-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠۠ۢ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡۢ(LYue/ۥۣ۠ۢۡ;I)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'skip\' is \'drop\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "drop(count)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;I)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥۣ۟۟ۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'startWith\' is \'onStart\'. Use \'onStart { emitAll(other) }\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "onStart { emitAll(other) }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟ۡۤ(LYue/ۥۣ۠ۢۡ;Ljava/lang/Object;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogue of \'startWith\' is \'onStart\'. Use \'onStart { emit(value) }\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "onStart { emit(value) }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;TT;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟ۡۥ(LYue/ۥۣ۠ۢۡ;)V
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟ۡۦ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟ۡۧ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Throwable;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟ۡۨ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Use \'flowOn\' instead"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۨۡ()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟۟ۢ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Flow analogues of \'switchMap\' are \'transformLatest\', \'flatMapLatest\' and \'mapLatest\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.flatMapLatest(transform)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TR;>;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {p0, v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠ۢۨ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method
