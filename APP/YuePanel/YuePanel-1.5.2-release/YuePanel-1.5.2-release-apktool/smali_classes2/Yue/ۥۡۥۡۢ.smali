.class public final LYue/ۥۡۥۡۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,151:1\n1#2:152\n314#3,11:153\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n48#1:153,11\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۡۥۡۤ;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۡۥۡۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "*>;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥۡۥۡۢ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۡۥۡۢ$ۥ;

    iget v1, v0, LYue/ۥۡۥۡۢ$ۥ;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۡۥۡۢ$ۥ;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۡۥۡۢ$ۥ;

    invoke-direct {v0, p2}, LYue/ۥۡۥۡۢ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۡۥۡۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۡۥۡۢ$ۥ;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۡۥۡۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LYue/ۥۣ۠۠ۨ;

    iget-object p0, v0, LYue/ۥۡۥۡۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۥۡۤ;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    invoke-interface {v0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p2

    sget-object v2, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p2, v2}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p2

    if-ne p2, p0, :cond_5

    :try_start_1
    iput-object p0, v0, LYue/ۥۡۥۡۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۡۥۡۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۡۥۡۢ$ۥ;->ۥ۟۟۠ۦ:I

    new-instance p2, LYue/ۥۣ۟ۨ۠;

    invoke-static {v0}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v2

    invoke-direct {p2, v2, v3}, LYue/ۥۣ۟ۨ۠;-><init>(LYue/ۥ۟ۧۤۢ;I)V

    invoke-virtual {p2}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟ۢ۟()V

    new-instance v2, LYue/ۥۡۥۡۢ$ۥ۟۟;

    invoke-direct {v2, p2}, LYue/ۥۡۥۡۢ$ۥ۟۟;-><init>(LYue/ۥۣ۟ۨ۟;)V

    invoke-interface {p0, v2}, LYue/ۥۡۨۡ۠;->ۥ۟۟ۢ۠(LYue/ۥۣ۠ۡ۟;)V

    invoke-virtual {p2}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p0, p2, :cond_3

    invoke-static {v0}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0

    :goto_2
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "awaitClose() can only be invoked from the producer context"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟(LYue/ۥۡۥۡۤ;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p1, LYue/ۥۡۥۡۢ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡۥۡۢ$ۥ۟;

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥۡۥۡۢ;->ۥ(LYue/ۥۡۥۡۤ;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;LYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 2
    .param p0    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۟ۧۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p5    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p6    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۣ۟ۤ۟;
        .end annotation

        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            "LYue/\u06e5\u06df\u06e7\u06e8;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TE;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p2, p3, v0, v1, v0}, LYue/ۥ۟ۤۡۨ;->ۥ۟۟۟(ILYue/ۥۣۣ۟;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥ۟ۤ۠ۨ;

    move-result-object p2

    invoke-static {p0, p1}, LYue/ۥ۟ۧۦۧ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    new-instance p1, LYue/ۥۡۥۣۡ;

    invoke-direct {p1, p0, p2}, LYue/ۥۡۥۣۡ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۤ۠ۨ;)V

    if-eqz p5, :cond_0

    invoke-virtual {p1, p5}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۡۡ(LYue/ۥۣ۠ۡ۟;)LYue/ۥۣۣ۠۟;

    :cond_0
    invoke-virtual {p1, p4, p1, p6}, LYue/ۥ۟۟۠ۧ;->ۥ۟۠۠۠(LYue/ۥ۟ۧۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V

    return-object p1
.end method

.method public static final ۥ۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 7
    .param p0    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p5    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۣ۟ۤ۟;
        .end annotation

        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e7\u06e8;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TE;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TE;>;"
        }
    .end annotation

    sget-object v3, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, LYue/ۥۡۥۡۢ;->ۥ۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;LYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 7
    .param p0    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۣ۟ۤ۟;
        .end annotation

        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TE;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TE;>;"
        }
    .end annotation

    sget-object v3, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    sget-object v4, LYue/ۥ۟ۧۨ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۨ;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, LYue/ۥۡۥۡۢ;->ۥ۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;LYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟۠(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;LYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    sget-object p1, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    :cond_1
    move v2, p2

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    sget-object p3, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    :cond_2
    move-object v3, p3

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    sget-object p4, LYue/ۥ۟ۧۨ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۨ;

    :cond_3
    move-object v4, p4

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    const/4 p5, 0x0

    :cond_4
    move-object v5, p5

    move-object v0, p0

    move-object v6, p6

    invoke-static/range {v0 .. v6}, LYue/ۥۡۥۡۢ;->ۥ۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;LYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    :cond_1
    move v2, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    sget-object p3, LYue/ۥ۟ۧۨ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۨ;

    :cond_2
    move-object v3, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    const/4 p4, 0x0

    :cond_3
    move-object v4, p4

    move-object v0, p0

    move-object v5, p5

    invoke-static/range {v0 .. v5}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟ۢ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2, p3}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method
