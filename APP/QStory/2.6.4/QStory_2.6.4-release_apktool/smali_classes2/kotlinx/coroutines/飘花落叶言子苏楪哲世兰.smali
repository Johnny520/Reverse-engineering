.class public final Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;
.super Lkotlinx/coroutines/飘花落叶言子苏楪世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    sget-object p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    :try_start_0
    instance-of p0, p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    sget-object p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Method;

    .line 20
    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    :catchall_0
    :goto_1
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;

    .line 6
    .line 7
    iget-object p1, p1, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    if-ne p1, p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(JLjava/lang/Runnable;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/飘花落叶言子世哲兰楪苏;
    .locals 2

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    invoke-interface {p0, p3, p1, p2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    goto :goto_1

    .line 21
    :catch_0
    move-exception p0

    .line 22
    const-string v0, "The task was rejected"

    .line 23
    .line 24
    invoke-static {v0, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p4, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/util/concurrent/CancellationException;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 32
    .line 33
    new-instance p0, Lkotlinx/coroutines/飘花落叶言子世哲苏兰楪;

    .line 34
    .line 35
    invoke-direct {p0, v1}, Lkotlinx/coroutines/飘花落叶言子世哲苏兰楪;-><init>(Ljava/util/concurrent/ScheduledFuture;)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_2
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏兰哲:Lkotlinx/coroutines/飘花落叶言子世苏楪哲兰;

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2, p3, p4}, Lkotlinx/coroutines/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰(JLjava/lang/Runnable;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/飘花落叶言子世哲兰楪苏;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(JLkotlinx/coroutines/飘花落叶言子楪苏兰世哲;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    :goto_0
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v3, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    const/4 v4, 0x3

    .line 18
    invoke-direct {v3, v4, p0, p3, v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p3, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 22
    .line 23
    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    .line 25
    invoke-interface {v0, v3, p1, p2, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 26
    .line 27
    .line 28
    move-result-object v2
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    goto :goto_1

    .line 30
    :catch_0
    move-exception v0

    .line 31
    const-string v3, "The task was rejected"

    .line 32
    .line 33
    invoke-static {v3, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p0, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/util/concurrent/CancellationException;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    .line 41
    .line 42
    new-instance p0, Lkotlinx/coroutines/飘花落叶言子楪苏世兰哲;

    .line 43
    .line 44
    invoke-direct {p0, v2, v1}, Lkotlinx/coroutines/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰(Lkotlinx/coroutines/飘花落叶言子哲楪世苏兰;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏兰哲:Lkotlinx/coroutines/飘花落叶言子世苏楪哲兰;

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲(JLkotlinx/coroutines/飘花落叶言子楪苏兰世哲;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-interface {p0, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    const-string v0, "The task was rejected"

    .line 9
    .line 10
    invoke-static {v0, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p1, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/util/concurrent/CancellationException;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 18
    .line 19
    sget-object p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
