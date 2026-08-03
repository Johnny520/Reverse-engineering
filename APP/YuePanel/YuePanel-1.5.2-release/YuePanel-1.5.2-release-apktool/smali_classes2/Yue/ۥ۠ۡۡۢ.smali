.class public abstract LYue/ۥ۠ۡۡۢ;
.super LYue/ۥ۠ۡۡ۠;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۡۡ۠;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract ۥ۟۟ۨۡ()Ljava/lang/Thread;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method

.method public ۥ۟۟ۨۢ(JLYue/ۥ۠ۡۡۡ$ۥ۟۟;)V
    .locals 1
    .param p3    # LYue/ۥ۠ۡۡۡ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۟ۨۥۤ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۥۤ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۠ۡۡۡ;->ۥ۟۠۟۟(JLYue/ۥ۠ۡۡۡ$ۥ۟۟;)V

    return-void
.end method

.method public final ۥۣ۟۟ۨ()V
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۠ۡۡۢ;->ۥ۟۟ۨۡ()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_1

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟ۡ(Ljava/lang/Thread;)V

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_1
    return-void
.end method
