.class public final LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۤ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1"
    f = "Migration.kt"
    i = {}
    l = {
        0xbe,
        0xbe
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۥ;->ۥ۟۟ۢ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e0\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "-TR;>;TT;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n*L\n1#1,215:1\n*E\n"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public synthetic ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public synthetic ۥ۟۟۠ۥ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۢ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۢ;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۣۣ۠ۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LYue/ۥۣۣ۠ۢ;

    iget-object p1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iget-object v4, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۢ;

    iput-object v1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    invoke-interface {v4, p1, p0}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, LYue/ۥۣ۠ۢۡ;

    const/4 v3, 0x0

    iput-object v3, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    invoke-static {v1, p1, p0}, LYue/ۥۣ۠ۢۧ;->ۥۣ۟۟ۤ(LYue/ۥۣۣ۠ۢ;LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۣۣ۠ۢ;

    check-cast p3, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TR;>;TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;

    iget-object v1, p0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۢ;

    invoke-direct {v0, v1, p3}, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۢۥ$ۥ۟۟۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
