.class public final LYue/ۥ۟۟ۢۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static ۥ:LYue/ۥ۟۟ۢۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final ۥ()J
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۧ;->ۥ()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public static final ۥ۟()LYue/ۥ۟۟ۢۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    sget-object v0, LYue/ۥ۟۟ۢۨ;->ۥ:LYue/ۥ۟۟ۢۧ;

    return-object v0
.end method

.method public static final ۥ۟۟()J
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۧ;->ۥ۟()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public static final ۥ۟۟۟(Ljava/lang/Object;J)V
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1, p2}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟(Ljava/lang/Object;J)V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {p0, p1, p2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    :cond_1
    return-void
.end method

.method public static final ۥ۟۟۟۟()V
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟()V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥ۟۟ۢۧ;)V
    .locals 0
    .param p0    # LYue/ۥ۟۟ۢۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    sput-object p0, LYue/ۥ۟۟ۢۨ;->ۥ:LYue/ۥ۟۟ۢۧ;

    return-void
.end method

.method public static final ۥ۟۟۟ۡ()V
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟۟()V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۢ()V
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟۠()V

    :cond_0
    return-void
.end method

.method public static final ۥۣ۟۟۟(Ljava/lang/Thread;)V
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟ۡ(Ljava/lang/Thread;)V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_1
    return-void
.end method

.method public static final ۥ۟۟۟ۤ()V
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟ۢ()V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۥ(Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, LYue/ۥ۟۟ۢۧ;->ۥۣ۟۟۟(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :cond_1
    :goto_0
    return-object p0
.end method
