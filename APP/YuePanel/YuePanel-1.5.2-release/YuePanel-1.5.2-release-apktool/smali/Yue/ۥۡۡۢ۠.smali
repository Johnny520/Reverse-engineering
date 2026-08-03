.class public abstract LYue/ۥۡۡۢ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۡۢ۠$ۥ۟۟۟۟;,
        LYue/ۥۡۡۢ۠$ۥ۟۟۟ۢ;,
        LYue/ۥۡۡۢ۠$ۥ۟۟۟۠;,
        LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Params:",
        "Ljava/lang/Object;",
        "Progress:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۨ:Ljava/lang/String; = "AsyncTask"

.field public static final ۥ۟۟ۡ:I = 0x5

.field public static final ۥ۟۟ۡ۟:I = 0x80

.field public static final ۥ۟۟ۡ۠:I = 0x1

.field public static final ۥ۟۟ۡۡ:Ljava/util/concurrent/ThreadFactory;

.field public static final ۥ۟۟ۡۢ:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥۣ۟۟ۡ:Ljava/util/concurrent/Executor;

.field public static final ۥ۟۟ۡۤ:I = 0x1

.field public static final ۥ۟۟ۡۥ:I = 0x2

.field public static ۥ۟۟ۡۦ:LYue/ۥۡۡۢ۠$ۥ۟۟۟۠;

.field public static volatile ۥ۟۟ۡۧ:Ljava/util/concurrent/Executor;


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e1\u06e2\u06e0$\u06e5\u06df\u06df\u06df\u06e2<",
            "TParams;TResult;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask<",
            "TResult;>;"
        }
    .end annotation
.end field

.field public volatile ۥ۟۟۠ۥ:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

.field public final ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v7, LYue/ۥۡۡۢ۠$ۥ;

    invoke-direct {v7}, LYue/ۥۡۡۢ۠$ۥ;-><init>()V

    sput-object v7, LYue/ۥۡۡۢ۠;->ۥ۟۟ۡۡ:Ljava/util/concurrent/ThreadFactory;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v0, 0xa

    invoke-direct {v6, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v6, LYue/ۥۡۡۢ۠;->ۥ۟۟ۡۢ:Ljava/util/concurrent/BlockingQueue;

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v3, 0x1

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x5

    const/16 v2, 0x80

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v8, LYue/ۥۡۡۢ۠;->ۥۣ۟۟ۡ:Ljava/util/concurrent/Executor;

    sput-object v8, LYue/ۥۡۡۢ۠;->ۥ۟۟ۡۧ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

    iput-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۥ:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, LYue/ۥۡۡۢ۠$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۡۡۢ۠$ۥ۟;-><init>(LYue/ۥۡۡۢ۠;)V

    iput-object v0, p0, LYue/ۥۡۡۢ۠;->ۥۣ۟۟۠:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۢ;

    new-instance v1, LYue/ۥۡۡۢ۠$ۥ۟۟;

    invoke-direct {v1, p0, v0}, LYue/ۥۡۡۢ۠$ۥ۟۟;-><init>(LYue/ۥۡۡۢ۠;Ljava/util/concurrent/Callable;)V

    iput-object v1, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۤ:Ljava/util/concurrent/FutureTask;

    return-void
.end method

.method public static ۥ۟۟۟(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, LYue/ۥۡۡۢ۠;->ۥ۟۟ۡۧ:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ۥۣ۟۟۟()Landroid/os/Handler;
    .locals 2

    const-class v0, LYue/ۥۡۡۢ۠;

    monitor-enter v0

    :try_start_0
    sget-object v1, LYue/ۥۡۡۢ۠;->ۥ۟۟ۡۦ:LYue/ۥۡۡۢ۠$ۥ۟۟۟۠;

    if-nez v1, :cond_0

    new-instance v1, LYue/ۥۡۡۢ۠$ۥ۟۟۟۠;

    invoke-direct {v1}, LYue/ۥۡۡۢ۠$ۥ۟۟۟۠;-><init>()V

    sput-object v1, LYue/ۥۡۡۢ۠;->ۥ۟۟ۡۦ:LYue/ۥۡۡۢ۠$ۥ۟۟۟۠;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYue/ۥۡۡۢ۠;->ۥ۟۟ۡۦ:LYue/ۥۡۡۢ۠$ۥ۟۟۟۠;

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ۥۣ۟۟۠(Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sput-object p0, LYue/ۥۡۡۢ۠;->ۥ۟۟ۡۧ:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final ۥ(Z)Z
    .locals 2

    iget-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۤ:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public varargs abstract ۥ۟([Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)TResult;"
        }
    .end annotation
.end method

.method public final varargs ۥ۟۟([Ljava/lang/Object;)LYue/ۥۡۡۢ۠;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)",
            "LYue/\u06e5\u06e1\u06e1\u06e2\u06e0<",
            "TParams;TProgress;TResult;>;"
        }
    .end annotation

    sget-object v0, LYue/ۥۡۡۢ۠;->ۥ۟۟ۡۧ:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۡۢ۠;->ۥ۟۟۟۟(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)LYue/ۥۡۡۢ۠;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ۥ۟۟۟۟(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)LYue/ۥۡۡۢ۠;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "[TParams;)",
            "LYue/\u06e5\u06e1\u06e1\u06e2\u06e0<",
            "TParams;TProgress;TResult;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۥ:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

    sget-object v1, LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

    if-eq v0, v1, :cond_2

    sget-object p1, LYue/ۥۡۡۢ۠$ۥ۟۟۟;->ۥ:[I

    iget-object p2, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۥ:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "We should never reach this state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot execute task: the task is already running."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object v0, LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

    iput-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۥ:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

    invoke-virtual {p0}, LYue/ۥۡۡۢ۠;->ۥ۟۟۠()V

    iget-object v0, p0, LYue/ۥۡۡۢ۠;->ۥۣ۟۟۠:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۢ;

    iput-object p2, v0, LYue/ۥۡۡۢ۠$ۥ۟۟۟ۢ;->ۥ:[Ljava/lang/Object;

    iget-object p2, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۤ:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۢ۠;->ۥ۟۟۟ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۡۡۢ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۡۡۢ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

    iput-object p1, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۥ:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

    return-void
.end method

.method public final ۥ۟۟۟ۡ()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۤ:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۤ:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۤ()LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۥ:LYue/ۥۡۡۢ۠$ۥ۟۟۟ۡ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۥ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۦ()V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۟ۧ(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۢ۠;->ۥ۟۟۟ۦ()V

    return-void
.end method

.method public ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    return-void
.end method

.method public ۥ۟۟۠()V
    .locals 0

    return-void
.end method

.method public varargs ۥ۟۟۠۟([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    return-void
.end method

.method public ۥ۟۟۠۠(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)TResult;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۡۡۢ۠;->ۥۣ۟۟۟()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, LYue/ۥۡۡۢ۠$ۥ۟۟۟۟;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, p0, v2}, LYue/ۥۡۡۢ۠$ۥ۟۟۟۟;-><init>(LYue/ۥۡۡۢ۠;[Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-object p1
.end method

.method public ۥ۟۟۠ۡ(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۢ۠;->ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۡۡۢ۠;->ۥ۟۟۠۠(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final varargs ۥ۟۟۠ۢ([Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۢ۠;->ۥ۟۟۟ۥ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, LYue/ۥۡۡۢ۠;->ۥۣ۟۟۟()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, LYue/ۥۡۡۢ۠$ۥ۟۟۟۟;

    invoke-direct {v1, p0, p1}, LYue/ۥۡۡۢ۠$ۥ۟۟۟۟;-><init>(LYue/ۥۡۡۢ۠;[Ljava/lang/Object;)V

    const/4 p1, 0x2

    invoke-virtual {v0, p1, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_0
    return-void
.end method
