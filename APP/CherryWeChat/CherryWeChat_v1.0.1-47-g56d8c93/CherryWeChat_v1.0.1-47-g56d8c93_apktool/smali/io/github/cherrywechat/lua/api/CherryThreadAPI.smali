.class public final Lio/github/cherrywechat/lua/api/CherryThreadAPI;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

.field private static final TAG:Ljava/lang/String;

.field private static final executor:Ljava/util/concurrent/ExecutorService;

.field private static final mainHandler:Landroid/os/Handler;

.field private static final scheduledExecutor:Ljava/util/concurrent/ScheduledExecutorService;

.field private static final scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final taskCounter:Ljava/util/concurrent/atomic/AtomicLong;

.field private static final taskRefs:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-wide v0, -0x1e3fafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->mainHandler:Landroid/os/Handler;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->executor:Ljava/util/concurrent/ExecutorService;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    const-wide v1, -0x1e38afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskRefs:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskCounter:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic A(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$15$lambda$14$lambda$10$lambda$9(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$19$lambda$18(Lparty/iroiro/luajava/Lua;I)V

    return-void
.end method

.method public static synthetic C(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$19$lambda$18$lambda$17(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$23(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic E(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$23$lambda$22$lambda$21$lambda$20(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$15$lambda$14$lambda$13(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$19(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic H(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$6$lambda$5$lambda$4(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$35(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic J(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$37(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic K(ZLparty/iroiro/luajava/Lua;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$15$lambda$14(ZLparty/iroiro/luajava/Lua;II)V

    return-void
.end method

.method public static synthetic L(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$2$lambda$1(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$23$lambda$22$lambda$21(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$31(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$32(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$15(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private static final cleanup$lambda$47(Ljava/util/List;)LTC;
    .locals 5

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    sget-object v1, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v2

    new-instance v3, Lio/github/cherrywechat/lua/api/a;

    const/4 v4, 0x6

    invoke-direct {v3, v0, v4}, Lio/github/cherrywechat/lua/api/a;-><init>(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;I)V

    invoke-virtual {v1, v2, v3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final cleanup$lambda$47$lambda$46$lambda$45(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getRef()I

    move-result p0

    invoke-interface {v0, p0}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final cleanupFor$lambda$43(Ljava/util/List;)LTC;
    .locals 5

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    sget-object v1, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v2

    new-instance v3, Lio/github/cherrywechat/lua/api/a;

    const/4 v4, 0x3

    invoke-direct {v3, v0, v4}, Lio/github/cherrywechat/lua/api/a;-><init>(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;I)V

    invoke-virtual {v1, v2, v3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final cleanupFor$lambda$43$lambda$42$lambda$41(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getRef()I

    move-result p0

    invoke-interface {v0, p0}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method public static synthetic d(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$15$lambda$14$lambda$10(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$15$lambda$14$lambda$12$lambda$11(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$34(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Ljava/util/List;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$31$lambda$30(Ljava/util/List;)LTC;

    move-result-object p0

    return-object p0
.end method

.method private final generateTaskId()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1e40cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskCounter:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Ljava/util/List;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->cleanup$lambda$47(Ljava/util/List;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->cleanup$lambda$47$lambda$46$lambda$45(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$31$lambda$30$lambda$29$lambda$28(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->cleanupFor$lambda$43$lambda$42$lambda$41(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$15$lambda$14$lambda$12(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$2(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic n(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$6(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$23$lambda$22(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic p(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$26$lambda$25$lambda$24(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$26(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic r(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$15$lambda$14$lambda$8(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method private static final register$lambda$15(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1e368fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v1

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v3

    const/4 v4, 0x2

    if-lt v3, v4, :cond_1

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v3

    goto :goto_1

    :cond_2
    const/4 v3, -0x1

    :goto_1
    sget-object v4, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v5, LH8;

    invoke-direct {v5, v0, p0, v1, v3}, LH8;-><init>(ZLparty/iroiro/luajava/Lua;II)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v2
.end method

.method private static final register$lambda$15$lambda$14(ZLparty/iroiro/luajava/Lua;II)V
    .locals 4

    if-eqz p0, :cond_0

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0x12

    invoke-direct {v1, p1, p2, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p1, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0x13

    invoke-direct {v1, p1, p2, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p1, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    new-instance v2, LJ8;

    const/4 v3, 0x1

    invoke-direct {v2, p1, p3, v0, v3}, LJ8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;I)V

    invoke-direct {v1, v2}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->runOnUiThread(LUi;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object p0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, Lj8;

    const/16 v0, 0x14

    invoke-direct {p3, p1, p2, v0}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    :goto_1
    invoke-virtual {p0, p1, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void

    :catch_0
    const-wide v0, -0x1e34cfffff835L

    :try_start_1
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1e35cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    if-eqz p0, :cond_2

    sget-object p0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    new-instance v0, Lj8;

    const/16 v1, 0x15

    invoke-direct {v0, p1, p3, v1}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-direct {p0, v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->runOnUiThread(LUi;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    sget-object p0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, Lj8;

    const/16 v0, 0x14

    invoke-direct {p3, p1, p2, v0}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    goto :goto_1

    :goto_2
    sget-object p3, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v0, Lj8;

    const/16 v1, 0x14

    invoke-direct {v0, p1, p2, v1}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p3, p1, v0}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    throw p0
.end method

.method private static final register$lambda$15$lambda$14$lambda$10(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, LJ8;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, LJ8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;I)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$15$lambda$14$lambda$10$lambda$9(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;)LTC;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    if-eqz p2, :cond_0

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, p2, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-interface {p0, p2, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$15$lambda$14$lambda$12(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0xe

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$15$lambda$14$lambda$12$lambda$11(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 2

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$15$lambda$14$lambda$13(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$15$lambda$14$lambda$7(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Object;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-interface {p0, p1, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    const/4 p1, -0x1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object p1
.end method

.method private static final register$lambda$15$lambda$14$lambda$8(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 p1, 0x0

    invoke-interface {p0, p1, p1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$19(Lparty/iroiro/luajava/Lua;)I
    .locals 10

    const-wide v0, -0x1e30ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v1

    double-to-long v5, v1

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v1

    double-to-long v7, v1

    const/4 v1, 0x3

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v1

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    invoke-direct {v2}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->generateTaskId()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v4, Lm8;

    const/4 v9, 0x5

    invoke-direct {v4, p0, v1, v9}, Lm8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v3 .. v9}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v3

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskRefs:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v4, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-direct {v4, p0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;-><init>(Lparty/iroiro/luajava/Lua;I)V

    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$19$lambda$18(Lparty/iroiro/luajava/Lua;I)V
    .locals 3

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    new-instance v1, Lj8;

    const/16 v2, 0x18

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-direct {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->runOnUiThread(LUi;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-wide p0, -0x1e36afffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const-wide p0, -0x1e37afffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method private static final register$lambda$19$lambda$18$lambda$17(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0x16

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$19$lambda$18$lambda$17$lambda$16(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 p1, 0x0

    invoke-interface {p0, p1, p1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$2(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1e348fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    new-instance v3, Lj8;

    const/16 v4, 0x11

    invoke-direct {v3, p0, v0, v4}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-direct {v1, v3}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->runOnUiThread(LUi;)V

    return v2
.end method

.method private static final register$lambda$2$lambda$1(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0xf

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$2$lambda$1$lambda$0(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 1

    :try_start_0
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x0

    invoke-interface {p0, v0, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0

    :catchall_0
    move-exception v0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    throw v0
.end method

.method private static final register$lambda$23(Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x1e336fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v1

    double-to-long v1, v1

    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v4

    if-nez v4, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v3

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    invoke-direct {v4}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->generateTaskId()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v6, LN2;

    const/4 v7, 0x4

    invoke-direct {v6, v7, v4}, LN2;-><init>(ILjava/lang/Object;)V

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v5, v6, v1, v2, v7}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskRefs:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v2, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-direct {v2, p0, v3}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;-><init>(Lparty/iroiro/luajava/Lua;I)V

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$23$lambda$22(Ljava/lang/String;)V
    .locals 4

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    if-eqz v0, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    new-instance v2, Lio/github/cherrywechat/lua/api/a;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Lio/github/cherrywechat/lua/api/a;-><init>(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;I)V

    invoke-direct {v1, v2}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->runOnUiThread(LUi;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :catch_0
    const-wide v0, -0x1e311fffff835L

    :try_start_1
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1e321fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method

.method private static final register$lambda$23$lambda$22$lambda$21(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 4

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v1

    new-instance v2, Lio/github/cherrywechat/lua/api/a;

    const/4 v3, 0x4

    invoke-direct {v2, p0, v3}, Lio/github/cherrywechat/lua/api/a;-><init>(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;I)V

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$23$lambda$22$lambda$21$lambda$20(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 2

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getRef()I

    move-result v1

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, v1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getRef()I

    move-result p0

    invoke-interface {v0, p0}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$26(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1e338fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ScheduledFuture;

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    if-eqz v3, :cond_1

    invoke-interface {v3, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    if-eqz v1, :cond_2

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    new-instance v5, Lio/github/cherrywechat/lua/api/a;

    const/4 v6, 0x1

    invoke-direct {v5, v1, v6}, Lio/github/cherrywechat/lua/api/a;-><init>(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;I)V

    invoke-direct {v4, v5}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->runOnUiThread(LUi;)V

    :cond_2
    if-nez v3, :cond_3

    if-eqz v1, :cond_4

    :cond_3
    move v2, v0

    :cond_4
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$26$lambda$25(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 4

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v1

    new-instance v2, Lio/github/cherrywechat/lua/api/a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/github/cherrywechat/lua/api/a;-><init>(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;I)V

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$26$lambda$25$lambda$24(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getRef()I

    move-result p0

    invoke-interface {v0, p0}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$31(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1e33afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v2, -0x1e33cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ScheduledFuture;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    const-wide v3, -0x1e3cefffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v2}, Lra;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    new-instance v3, LI8;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2}, LI8;-><init>(ILjava/util/List;)V

    invoke-direct {v0, v3}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->runOnUiThread(LUi;)V

    :cond_1
    int-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$31$lambda$30(Ljava/util/List;)LTC;
    .locals 5

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    sget-object v1, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v2

    new-instance v3, Lio/github/cherrywechat/lua/api/a;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v4}, Lio/github/cherrywechat/lua/api/a;-><init>(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;I)V

    invoke-virtual {v1, v2, v3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$31$lambda$30$lambda$29$lambda$28(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getRef()I

    move-result p0

    invoke-interface {v0, p0}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$32(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1e3e0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v0

    double-to-long v0, v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-lez p0, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$33(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1e3e2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$34(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1e3e4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$35(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1e3e6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Ljava/lang/Thread;->yield()V

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$37(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1e3e8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    const-wide v1, -0x1e3eafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v0}, Lra;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v3, v2, 0x1

    if-ltz v2, :cond_0

    check-cast v1, Ljava/lang/String;

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 v1, -0x2

    invoke-interface {p0, v1, v3}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-static {}, Lsa;->c0()V

    const/4 p0, 0x0

    throw p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$6(Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x1e34afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v1

    double-to-long v1, v1

    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v4

    if-nez v4, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v3

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    invoke-direct {v4}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->generateTaskId()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->mainHandler:Landroid/os/Handler;

    new-instance v6, Lm8;

    const/4 v7, 0x4

    invoke-direct {v6, p0, v3, v7}, Lm8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v5, v6, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$6$lambda$5(Lparty/iroiro/luajava/Lua;I)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    new-instance v1, Lj8;

    const/16 v2, 0x17

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, v1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->runOnUiThread(LUi;)V

    return-void
.end method

.method private static final register$lambda$6$lambda$5$lambda$4(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0x10

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$6$lambda$5$lambda$4$lambda$3(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 1

    :try_start_0
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x0

    invoke-interface {p0, v0, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0

    :catchall_0
    move-exception v0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    throw v0
.end method

.method private final runOnUiThread(LUi;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUi;",
            ")V"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->runOnUiThread(LUi;)V

    return-void
.end method

.method public static synthetic s(Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$6$lambda$5(Lparty/iroiro/luajava/Lua;I)V

    return-void
.end method

.method public static synthetic t(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$15$lambda$14$lambda$7(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ljava/util/ArrayList;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->cleanupFor$lambda$43(Ljava/util/List;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$19$lambda$18$lambda$17$lambda$16(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$26$lambda$25(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$6$lambda$5$lambda$4$lambda$3(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$33(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic z(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register$lambda$2$lambda$1$lambda$0(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final cleanup()V
    .locals 4

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v1, -0x1e4f2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-wide v2, -0x1e484fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v1}, Lra;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, LI8;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, LI8;-><init>(ILjava/util/List;)V

    invoke-direct {p0, v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->runOnUiThread(LUi;)V

    :cond_1
    const-wide v0, -0x1e496fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1e4a6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final cleanupFor(Lparty/iroiro/luajava/Lua;)V
    .locals 5

    const-wide v0, -0x1e412fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    const-wide v1, -0x1e416fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v0}, Lra;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v3

    invoke-static {v3, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const-wide v3, -0x1e429fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_1
    return-void

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->scheduledTasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ScheduledFuture;

    if-eqz v3, :cond_5

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_5
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->taskRefs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    if-eqz v2, :cond_4

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    new-instance v0, LQ4;

    const/4 v2, 0x3

    invoke-direct {v0, v2, p1}, LQ4;-><init>(ILjava/lang/Object;)V

    invoke-direct {p0, v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->runOnUiThread(LUi;)V

    :cond_7
    const-wide v2, -0x1e438fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x1e4c8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    return-void
.end method

.method public final register(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    const-wide v0, -0x1e5e2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    const/16 v1, 0xf

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    new-instance v0, Lz8;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1e5e6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e5f4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0xd

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e580fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e586fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e58ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e59cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0x11

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e5a3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e5adfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e5b3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e5befffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e44cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/16 v2, 0xb

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1e452fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v0, -0x1e461fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1e471fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method
