.class public final LYue/ۥۣ۠ۡۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic ۥ()V
    .locals 0
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    return-void
.end method

.method public static final ۥ۟(LYue/ۥ۟ۧۦۨ;)Ljava/util/concurrent/Executor;
    .locals 1
    .param p0    # LYue/ۥ۟ۧۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    instance-of v0, p0, LYue/ۥۣۣ۠ۡ;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LYue/ۥۣۣ۠ۡ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥۣۣ۠ۡ;->ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, LYue/ۥ۠۟ۢۥ;

    invoke-direct {v0, p0}, LYue/ۥ۠۟ۢۥ;-><init>(LYue/ۥ۟ۧۦۨ;)V

    :cond_2
    return-object v0
.end method

.method public static final ۥ۟۟(Ljava/util/concurrent/Executor;)LYue/ۥ۟ۧۦۨ;
    .locals 1
    .param p0    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "from"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    instance-of v0, p0, LYue/ۥ۠۟ۢۥ;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LYue/ۥ۠۟ۢۥ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, LYue/ۥ۠۟ۢۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, LYue/ۥۣ۠ۡۤ;

    invoke-direct {v0, p0}, LYue/ۥۣ۠ۡۤ;-><init>(Ljava/util/concurrent/Executor;)V

    :cond_2
    return-object v0
.end method

.method public static final ۥ۟۟۟(Ljava/util/concurrent/ExecutorService;)LYue/ۥۣۣ۠ۡ;
    .locals 1
    .param p0    # Ljava/util/concurrent/ExecutorService;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "from"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۡۤ;

    invoke-direct {v0, p0}, LYue/ۥۣ۠ۡۤ;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
