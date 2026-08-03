.class public final synthetic LYue/ۥ۠ۢۤۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,224:1\n106#2:225\n106#2:227\n1#3:226\n167#4:228\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n58#1:225\n132#1:227\n221#1:228\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
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
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;-",
            "Ljava/lang/Throwable;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۦ$ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۢۤۦ$ۥ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)V

    return-object v0
.end method

.method public static final ۥ۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۣ۠ۢ;
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
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۤۦ$ۥ۟;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۤۦ$ۥ۟;

    iget v1, v0, LYue/ۥ۠ۢۤۦ$ۥ۟;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۤۦ$ۥ۟;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۤۦ$ۥ۟;

    invoke-direct {v0, p2}, LYue/ۥ۠ۢۤۦ$ۥ۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۤۦ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۤۦ$ۥ۟;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۤۦ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p2}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    :try_start_1
    new-instance v2, LYue/ۥ۠ۢۤۦ$ۥ۟۟;

    invoke-direct {v2, p1, p2}, LYue/ۥ۠ۢۤۦ$ۥ۟۟;-><init>(LYue/ۥۣۣ۠ۢ;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    iput-object p2, v0, LYue/ۥ۠ۢۤۦ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۤۦ$ۥ۟;->ۥ۟۟۠ۥ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0

    :catchall_1
    move-exception p1

    move-object p0, p2

    :goto_2
    iget-object p0, p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p1, p0}, LYue/ۥ۠ۢۤۦ;->ۥ۟۟۟(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_6

    invoke-interface {v0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p2

    invoke-static {p1, p2}, LYue/ۥ۠ۢۤۦ;->ۥ۟۟(Ljava/lang/Throwable;LYue/ۥ۟ۧۦۥ;)Z

    move-result p2

    if-nez p2, :cond_6

    if-nez p0, :cond_4

    return-object p1

    :cond_4
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    if-eqz p2, :cond_5

    invoke-static {p0, p1}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p0

    :cond_5
    invoke-static {p1, p0}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p1

    :cond_6
    throw p1
.end method

.method public static final ۥ۟۟(Ljava/lang/Throwable;LYue/ۥ۟ۧۦۥ;)Z
    .locals 1

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p1, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۦ۟ۡ;

    if-eqz p1, :cond_1

    invoke-interface {p1}, LYue/ۥ۠ۦ۟ۡ;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟ۢۥ()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۠ۢۤۦ;->ۥ۟۟۟(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final ۥ۟۟۟(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p1, p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;JLYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;J",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Throwable;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    new-instance v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۟;-><init>(JLYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {p0, v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠۠۠(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۥ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Expected positive amount of retries, but had "

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ۥ۟۟۟۠(LYue/ۥۣ۠ۢۡ;JLYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۣ۠ۢۡ;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    new-instance p3, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟;

    const/4 p4, 0x0

    invoke-direct {p3, p4}, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :cond_1
    invoke-static {p0, p1, p2, p3}, LYue/ۥۣ۠ۢۧ;->ۥ۟۠۠(LYue/ۥۣ۠ۢۡ;JLYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۥ;)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e5<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;-",
            "Ljava/lang/Throwable;",
            "-",
            "Ljava/lang/Long;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۥ;)V

    return-object v0
.end method
