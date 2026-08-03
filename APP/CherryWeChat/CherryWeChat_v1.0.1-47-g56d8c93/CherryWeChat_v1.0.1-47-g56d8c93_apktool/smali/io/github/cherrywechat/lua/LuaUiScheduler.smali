.class public final Lio/github/cherrywechat/lua/LuaUiScheduler;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

.field private static final MAX_PENDING_TASKS:I = 0x64

.field private static final TAG:Ljava/lang/String;

.field private static volatile isForeground:Z

.field private static final mainHandler:Landroid/os/Handler;

.field private static final pendingCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static final pendingTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "LUi;",
            ">;"
        }
    .end annotation
.end field

.field private static final resumedCount:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x14af4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/LuaUiScheduler;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/LuaUiScheduler;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->mainHandler:Landroid/os/Handler;

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->pendingTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->pendingCount:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->resumedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x1

    sput-boolean v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->isForeground:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LUi;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->runOnUiThreadSync$lambda$1(LUi;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method

.method public static synthetic b(LUi;)V
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/LuaUiScheduler;->runOnUiThread$lambda$0(LUi;)V

    return-void
.end method

.method public static synthetic c(LUi;)V
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/LuaUiScheduler;->flush$lambda$2(LUi;)V

    return-void
.end method

.method private final enqueue(LUi;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUi;",
            ")V"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->pendingCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    const/16 v2, 0x64

    if-le v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    const-wide v0, -0x14accfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14adbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->pendingTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    return-void
.end method

.method private final flush()V
    .locals 4

    :goto_0
    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->pendingTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUi;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Lio/github/cherrywechat/lua/LuaUiScheduler;->pendingCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    sget-object v1, Lio/github/cherrywechat/lua/LuaUiScheduler;->mainHandler:Landroid/os/Handler;

    new-instance v2, LSp;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, LSp;-><init>(ILUi;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method private static final flush$lambda$2(LUi;)V
    .locals 0

    invoke-interface {p0}, LUi;->a()Ljava/lang/Object;

    return-void
.end method

.method private static final runOnUiThread$lambda$0(LUi;)V
    .locals 0

    invoke-interface {p0}, LUi;->a()Ljava/lang/Object;

    return-void
.end method

.method private static final runOnUiThreadSync$lambda$1(LUi;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, LUi;->a()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw p0
.end method

.method private final setForeground(Z)V
    .locals 1

    sget-boolean v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->isForeground:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    sput-boolean p1, Lio/github/cherrywechat/lua/LuaUiScheduler;->isForeground:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaUiScheduler;->flush()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final isForeground()Z
    .locals 1

    sget-boolean v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->isForeground:Z

    return v0
.end method

.method public final onActivityPaused()V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->resumedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-gtz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    invoke-direct {p0, v1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->setForeground(Z)V

    :cond_0
    return-void
.end method

.method public final onActivityResumed()V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->resumedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0, v1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->setForeground(Z)V

    :cond_0
    return-void
.end method

.method public final runOnUiThread(LUi;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUi;",
            ")V"
        }
    .end annotation

    const-wide v0, -0x14a11fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-boolean v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->isForeground:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LUi;->a()Ljava/lang/Object;

    return-void

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->mainHandler:Landroid/os/Handler;

    new-instance v1, LSp;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, LSp;-><init>(ILUi;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->enqueue(LUi;)V

    return-void
.end method

.method public final runOnUiThreadSync(LUi;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUi;",
            ")Z"
        }
    .end annotation

    const-wide v0, -0x14a18fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-boolean v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->isForeground:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->enqueue(LUi;)V

    return v1

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {v0, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-interface {p1}, LUi;->a()Ljava/lang/Object;

    return v2

    :cond_1
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v0, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    sget-object v2, Lio/github/cherrywechat/lua/LuaUiScheduler;->mainHandler:Landroid/os/Handler;

    new-instance v3, Ln3;

    const/16 v4, 0xc

    invoke-direct {v3, v4, p1, v0}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-virtual {v0, v2, v3, p1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const-wide v2, -0x14a1ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x14a2efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    return v1
.end method
