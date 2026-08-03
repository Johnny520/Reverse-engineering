.class public final LYue/ۥۣ۠ۡۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ()LYue/ۥ۠ۡۡ۠;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۟ۢۨ۟;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥ۟ۢۨ۟;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method

.method public static final ۥ۟(LYue/ۥۣ۠۠ۨ;)V
    .locals 0
    .param p0    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final ۥ۟۟()J
    .locals 2
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    sget-object v0, LYue/ۥۢۡۡۨ;->ۥ:LYue/ۥۢۡۡۨ;

    invoke-virtual {v0}, LYue/ۥۢۡۡۨ;->ۥ()LYue/ۥ۠ۡۡ۠;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۨ()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    :goto_0
    return-wide v0
.end method
