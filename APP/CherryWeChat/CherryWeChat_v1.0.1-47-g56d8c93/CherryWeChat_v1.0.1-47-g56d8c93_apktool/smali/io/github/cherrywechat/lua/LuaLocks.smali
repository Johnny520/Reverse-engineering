.class public final Lio/github/cherrywechat/lua/LuaLocks;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

.field private static final locks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lparty/iroiro/luajava/Lua;",
            "Ljava/util/concurrent/locks/ReentrantLock;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/github/cherrywechat/lua/LuaLocks;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/LuaLocks;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/LuaLocks;->locks:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lparty/iroiro/luajava/Lua;",
            "LUi;",
            ")TT;"
        }
    .end annotation

    const-wide v0, -0x14a7bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14a7ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->locks:Ljava/util/Map;

    const-wide v1, -0x14a05fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    monitor-enter v0

    const-wide v1, -0x14a0bfffff835L

    :try_start_0
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v1, Ljava/util/concurrent/locks/ReentrantLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_1
    invoke-interface {p2}, LUi;->a()Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object p1

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :goto_1
    monitor-exit v0

    throw p1
.end method
