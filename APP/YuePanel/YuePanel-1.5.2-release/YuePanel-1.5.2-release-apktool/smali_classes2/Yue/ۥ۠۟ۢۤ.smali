.class public final LYue/ۥ۠۟ۢۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"
.end annotation


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:Ljava/lang/Runnable;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟:Ljava/util/concurrent/ExecutorService;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:Ljava/util/ArrayDeque;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "LYue/\u06e5\u06e1\u06e6\u06e0\u06e4$\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟۠:Ljava/util/ArrayDeque;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "LYue/\u06e5\u06e1\u06e6\u06e0\u06e4$\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟ۡ:Ljava/util/ArrayDeque;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "LYue/\u06e5\u06e1\u06e6\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    .line 2
    iput v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ:I

    const/4 v0, 0x5

    .line 3
    iput v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟:I

    .line 4
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۟:Ljava/util/ArrayDeque;

    .line 5
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۠:Ljava/util/ArrayDeque;

    .line 6
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۡ:Ljava/util/ArrayDeque;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/ExecutorService;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "executorService"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, LYue/ۥ۠۟ۢۤ;-><init>()V

    .line 8
    iput-object p1, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/util/concurrent/ExecutorService;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "executorService"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_executorService"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized ۥ۟()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۟:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۦ۠ۤ$ۥ;

    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟()LYue/ۥۡۦ۠ۤ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ;->cancel()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۠:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۦ۠ۤ$ۥ;

    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟()LYue/ۥۡۦ۠ۤ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ;->cancel()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۦ۠ۤ;

    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final ۥ۟۟(LYue/ۥۡۦ۠ۤ$ۥ;)V
    .locals 1
    .param p1    # LYue/ۥۡۦ۠ۤ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "call"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۟:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟()LYue/ۥۡۦ۠ۤ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۠۠()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۠(Ljava/lang/String;)LYue/ۥۡۦ۠ۤ$ۥ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۟۠(LYue/ۥۡۦ۠ۤ$ۥ;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    invoke-virtual {p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۧ()Z

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized ۥ۟۟۟(LYue/ۥۡۦ۠ۤ;)V
    .locals 1
    .param p1    # LYue/ۥۡۦ۠ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "call"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۥ۟۟۟۟()Ljava/util/concurrent/ExecutorService;
    .locals 9
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "executorService"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, LYue/ۥۣۢۥ۟;->ۥۣ۟۟۟:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Dispatcher"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, LYue/ۥۣۢۥ۟;->ۥۣ۟۟ۡ(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final ۥ۟۟۟۠(Ljava/lang/String;)LYue/ۥۡۦ۠ۤ$ۥ;
    .locals 3

    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۠:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۦ۠ۤ$ۥ;

    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۟:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۦ۠ۤ$ۥ;

    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۥ۟۟۟ۡ(Ljava/util/Deque;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Deque<",
            "TT;>;TT;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-interface {p1, p2}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟:Ljava/lang/Runnable;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    invoke-virtual {p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۧ()Z

    move-result p2

    if-nez p2, :cond_0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Call wasn\'t in-flight!"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final ۥ۟۟۟ۢ(LYue/ۥۡۦ۠ۤ$ۥ;)V
    .locals 1
    .param p1    # LYue/ۥۡۦ۠ۤ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "call"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۠:Ljava/util/ArrayDeque;

    invoke-virtual {p0, v0, p1}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۡ(Ljava/util/Deque;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۥۣ۟۟۟(LYue/ۥۡۦ۠ۤ;)V
    .locals 1
    .param p1    # LYue/ۥۡۦ۠ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "call"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {p0, v0, p1}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۡ(Ljava/util/Deque;Ljava/lang/Object;)V

    return-void
.end method

.method public final declared-synchronized ۥ۟۟۟ۤ()Ljava/lang/Runnable;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟:Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ۥ۟۟۟ۥ()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ۥ۟۟۟ۦ()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final ۥ۟۟۟ۧ()Z
    .locals 6

    sget-boolean v0, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۟:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "readyAsyncCalls.iterator()"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۡۦ۠ۤ$ۥ;

    iget-object v3, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۠:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->size()I

    move-result v3

    iget v4, p0, LYue/ۥ۠۟ۢۤ;->ۥ:I

    if-ge v3, v4, :cond_3

    invoke-virtual {v2}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    iget v4, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟:I

    if-ge v3, v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    invoke-virtual {v2}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const-string v3, "asyncCall"

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۠:Ljava/util/ArrayDeque;

    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_3
    invoke-virtual {p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۠۠()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    sget-object v3, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    :goto_3
    if-ge v2, v3, :cond_5

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥۡۦ۠ۤ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    invoke-virtual {v4, v5}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ(Ljava/util/concurrent/ExecutorService;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    return v1

    :goto_4
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized ۥ۟۟۟ۨ()Ljava/util/List;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e3\u06e6\u06e3;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۟:Ljava/util/ArrayDeque;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LYue/ۥ۟ۥۡۤ;->ۥۣ۟۟ۡ(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۡۦ۠ۤ$ۥ;

    invoke-virtual {v2}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟()LYue/ۥۡۦ۠ۤ;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const-string v1, "unmodifiableList(readyAsyncCalls.map { it.call })"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ۥ۟۟۠()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۟:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ۥ۟۟۠۟()Ljava/util/List;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e3\u06e6\u06e3;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۡ:Ljava/util/ArrayDeque;

    iget-object v1, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۠:Ljava/util/ArrayDeque;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, LYue/ۥ۟ۥۡۤ;->ۥۣ۟۟ۡ(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۡۦ۠ۤ$ۥ;

    invoke-virtual {v3}, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟()LYue/ۥۡۦ۠ۤ;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-static {v0, v2}, LYue/ۥ۟ۥۢ۠;->ۥ۟ۡۤۥ(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const-string v1, "unmodifiableList(running\u2026yncCalls.map { it.call })"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ۥ۟۟۠۠()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟۠:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0

    iget-object v1, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v0, v1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ۥ۟۟۠ۡ(Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟۟:Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۥ۟۟۠ۢ(I)V
    .locals 2

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    monitor-enter p0

    :try_start_0
    iput p1, p0, LYue/ۥ۠۟ۢۤ;->ۥ:I

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    invoke-virtual {p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۧ()Z

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "max < 1: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥۣ۟۟۠(I)V
    .locals 2

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    monitor-enter p0

    :try_start_0
    iput p1, p0, LYue/ۥ۠۟ۢۤ;->ۥ۟:I

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    invoke-virtual {p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۧ()Z

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "max < 1: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
