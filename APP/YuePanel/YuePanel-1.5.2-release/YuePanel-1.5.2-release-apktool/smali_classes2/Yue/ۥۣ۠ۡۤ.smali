.class public final LYue/ۥۣ۠ۡۤ;
.super LYue/ۥۣۣ۠ۡ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۨ;


# instance fields
.field public final ۥ۟۟۠ۤ:Ljava/util/concurrent/Executor;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥۣۣ۠ۡ;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠ۡۤ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟ۦۥۦ;->ۥ۟۟(Ljava/util/concurrent/Executor;)Z

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    invoke-virtual {p0}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;

    move-result-object v0

    instance-of v1, v0, Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_1
    return-void
.end method

.method public dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 2
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, p2}, LYue/ۥ۟۟ۢۧ;->ۥۣ۟۟۟(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v1, p2

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟۠()V

    :cond_2
    invoke-virtual {p0, p1, v0}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/RejectedExecutionException;)V

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟()LYue/ۥ۟ۧۦۨ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LYue/ۥ۟ۧۦۨ;->dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    :goto_2
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥۣ۠ۡۤ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥۣ۠ۡۤ;

    invoke-virtual {p1}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p0}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡ۠(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated without replacement as an internal method never intended for public use"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, LYue/ۥ۟ۨۨ$ۥ;->ۥ(LYue/ۥ۟ۨۨ;JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟(JLjava/lang/Runnable;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣۣ۠۟;
    .locals 9
    .param p3    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;

    move-result-object v0

    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    if-eqz v4, :cond_1

    move-object v3, p0

    move-object v5, p3

    move-object v6, p4

    move-wide v7, p1

    invoke-virtual/range {v3 .. v8}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧۡ(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;LYue/ۥ۟ۧۦۥ;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    new-instance p1, LYue/ۥۣ۠۟ۢ;

    invoke-direct {p1, v2}, LYue/ۥۣ۠۟ۢ;-><init>(Ljava/util/concurrent/Future;)V

    goto :goto_1

    :cond_2
    sget-object v0, LYue/ۥ۟ۨۥۤ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۥۤ;

    invoke-virtual {v0, p1, p2, p3, p4}, LYue/ۥ۟ۨۥۤ;->ۥۣ۟۟(JLjava/lang/Runnable;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣۣ۠۟;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public ۥ۟۟ۤۥ(JLYue/ۥۣ۟ۨ۟;)V
    .locals 9
    .param p3    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;

    move-result-object v0

    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    if-eqz v4, :cond_1

    new-instance v5, LYue/ۥۡۦۨ۟;

    invoke-direct {v5, p0, p3}, LYue/ۥۡۦۨ۟;-><init>(LYue/ۥ۟ۧۦۨ;LYue/ۥۣ۟ۨ۟;)V

    invoke-interface {p3}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v6

    move-object v3, p0

    move-wide v7, p1

    invoke-virtual/range {v3 .. v8}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧۡ(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;LYue/ۥ۟ۧۦۥ;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    invoke-static {p3, v2}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۠ۦ(LYue/ۥۣ۟ۨ۟;Ljava/util/concurrent/Future;)V

    return-void

    :cond_2
    sget-object v0, LYue/ۥ۟ۨۥۤ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۥۤ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۠ۡۡۡ;->ۥ۟۟ۤۥ(JLYue/ۥۣ۟ۨ۟;)V

    return-void
.end method

.method public ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۡۤ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final ۥ۟۟ۧ۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/RejectedExecutionException;)V
    .locals 1

    const-string v0, "The task was rejected"

    invoke-static {v0, p2}, LYue/ۥ۠ۡۢۧ;->ۥ(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p2

    invoke-static {p1, p2}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final ۥ۟۟ۧۡ(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;LYue/ۥ۟ۧۦۥ;J)Ljava/util/concurrent/ScheduledFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Ljava/lang/Runnable;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "J)",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, p2, p4, p5, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p3, p1}, LYue/ۥۣ۠ۡۤ;->ۥ۟۟ۧ۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/RejectedExecutionException;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
