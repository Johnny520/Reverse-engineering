.class public final LYue/ۥ۟ۧۧۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۧۥ;
    .locals 3
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۟ۧۤ۠;

    sget-object v1, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p0, v1}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟(LYue/ۥ۠ۦ۟ۡ;ILjava/lang/Object;)LYue/ۥ۟ۦۣ۟;

    move-result-object v1

    invoke-interface {p0, v1}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, LYue/ۥ۟ۧۤ۠;-><init>(LYue/ۥ۟ۧۦۥ;)V

    return-object v0
.end method

.method public static final ۥ۟()LYue/ۥ۟ۧۧۥ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۟ۧۤ۠;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LYue/ۥۢ۠ۥ;->ۥ۟۟(LYue/ۥ۠ۦ۟ۡ;ILjava/lang/Object;)LYue/ۥ۟ۦۣ۟;

    move-result-object v1

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟۟()LYue/ۥ۠ۨۥۥ;

    move-result-object v2

    invoke-interface {v1, v2}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥ۟ۧۤ۠;-><init>(LYue/ۥ۟ۧۦۥ;)V

    return-object v0
.end method

.method public static final ۥ۟۟(LYue/ۥ۟ۧۧۥ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p0    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-static {p1, p2}, LYue/ۥ۠ۡۢۧ;->ۥ(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۟ۧۧۦ;->ۥ۟۟۟(LYue/ۥ۟ۧۧۥ;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final ۥ۟۟۟(LYue/ۥ۟ۧۧۥ;Ljava/util/concurrent/CancellationException;)V
    .locals 2
    .param p0    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-interface {p0}, LYue/ۥ۟ۧۧۥ;->getCoroutineContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    sget-object v1, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {v0, v1}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦ۟ۡ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scope cannot be cancelled because it does not have a job: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۧۧۦ;->ۥ۟۟(LYue/ۥ۟ۧۧۥ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠(LYue/ۥ۟ۧۧۥ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۟ۧۧۦ;->ۥ۟۟۟(LYue/ۥ۟ۧۧۥ;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۧۥ;

    invoke-interface {p1}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LYue/ۥۡۧۥ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0, v0, p0}, LYue/ۥۣۢ۠۠;->ۥ۟۟۟۠(LYue/ۥۡۧۥ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_0
    return-object p0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p0    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 p0, 0x3

    invoke-static {p0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final ۥ۟۟۟ۤ(LYue/ۥ۟ۧۧۥ;)V
    .locals 0
    .param p0    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p0}, LYue/ۥ۟ۧۧۥ;->getCoroutineContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟ۡ(LYue/ۥ۟ۧۦۥ;)V

    return-void
.end method

.method public static final ۥ۟۟۟ۥ(LYue/ۥ۟ۧۧۥ;)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p0}, LYue/ۥ۟ۧۧۥ;->getCoroutineContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    check-cast p0, LYue/ۥ۠ۦ۟ۡ;

    if-eqz p0, :cond_0

    invoke-interface {p0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static synthetic ۥ۟۟۟ۦ(LYue/ۥ۟ۧۧۥ;)V
    .locals 0

    return-void
.end method

.method public static final ۥ۟۟۟ۧ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۧۥ;
    .locals 1
    .param p0    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۟ۧۤ۠;

    invoke-interface {p0}, LYue/ۥ۟ۧۧۥ;->getCoroutineContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    invoke-interface {p0, p1}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥ۟ۧۤ۠;-><init>(LYue/ۥ۟ۧۦۥ;)V

    return-object v0
.end method
