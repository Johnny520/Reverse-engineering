.class public final Lio/github/cherrywechat/lua/LuaContext;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private activity:Landroid/app/Activity;

.field private closed:Z

.field private final id:Ljava/lang/String;

.field private final lua:Lparty/iroiro/luajava/Lua;

.field private final refs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lparty/iroiro/luajava/Lua;Ljava/util/List;Landroid/app/Activity;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lparty/iroiro/luajava/Lua;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/ClassLoader;",
            ">;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    const-wide v0, -0x14076fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14079fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1407dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    .line 4
    iput-object p4, p0, Lio/github/cherrywechat/lua/LuaContext;->activity:Landroid/app/Activity;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->refs:Ljava/util/List;

    .line 6
    invoke-interface {p2}, Lparty/iroiro/luajava/Lua;->openLibraries()V

    .line 7
    sget-object p1, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-virtual {p1, p2, p3}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->register(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V

    .line 8
    iget-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->activity:Landroid/app/Activity;

    if-eqz p1, :cond_0

    sget-object p4, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {p4, p1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->setCurrentActivity(Landroid/app/Activity;)V

    .line 9
    :cond_0
    sget-object p1, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    iget-object p4, p0, Lio/github/cherrywechat/lua/LuaContext;->activity:Landroid/app/Activity;

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    goto :goto_0

    :cond_1
    const/4 p4, 0x0

    :goto_0
    invoke-virtual {p1, p4}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->setCurrentContext(Landroid/content/Context;)V

    .line 10
    sget-object p1, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPIRegistry;

    invoke-virtual {p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerAll(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V

    .line 11
    iget-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->activity:Landroid/app/Activity;

    if-eqz p1, :cond_2

    .line 12
    sget-object p3, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p2, p1, p3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const-wide p3, -0x1400afffff835L

    .line 13
    invoke-static {p3, p4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lparty/iroiro/luajava/Lua;Ljava/util/List;Landroid/app/Activity;ILOc;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/lua/LuaContext;-><init>(Ljava/lang/String;Lparty/iroiro/luajava/Lua;Ljava/util/List;Landroid/app/Activity;)V

    return-void
.end method

.method private static final callFunction_gIAlu_s$lambda$6(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;[Ljava/lang/Object;)LHw;
    .locals 7

    const-string v0, "\'"

    const/4 v1, 0x0

    const/4 v2, -0x1

    :try_start_0
    iget-object v3, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {v3, p1}, Lparty/iroiro/luajava/Lua;->getGlobal(Ljava/lang/String;)V

    iget-object v3, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {v3, v2}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_0

    iget-object p2, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p2, v4}, Lparty/iroiro/luajava/Lua;->pop(I)V

    new-instance p2, Lio/github/cherrywechat/lua/LuaException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, -0x14091fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/github/cherrywechat/lua/LuaException;-><init>(Ljava/lang/String;)V

    new-instance p1, LGw;

    invoke-direct {p1, p2}, LGw;-><init>(Ljava/lang/Throwable;)V

    new-instance p2, LHw;

    invoke-direct {p2, p1}, LHw;-><init>(Ljava/lang/Object;)V

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    array-length p1, p2

    move v0, v1

    :goto_0
    if-ge v0, p1, :cond_2

    aget-object v3, p2, v0

    if-eqz v3, :cond_1

    iget-object v5, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    sget-object v6, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {v5, v3, v6}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {v3}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    array-length p2, p2

    invoke-interface {p1, p2, v4}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    iget-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p2, v4}, Lparty/iroiro/luajava/Lua;->pop(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_2
    :try_start_1
    iget-object p2, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p2, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    const/4 p2, 0x0

    :goto_3
    iget-object p0, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->setTop(I)V

    new-instance p0, Lio/github/cherrywechat/lua/LuaException;

    if-nez p2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_3

    const-wide p1, -0x140a5fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    :cond_3
    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/LuaException;-><init>(Ljava/lang/String;)V

    new-instance p1, LGw;

    invoke-direct {p1, p0}, LGw;-><init>(Ljava/lang/Throwable;)V

    :goto_4
    new-instance p0, LHw;

    invoke-direct {p0, p1}, LHw;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method private final checkClosed()V
    .locals 4

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/LuaContext;->closed:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x140e1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/github/cherrywechat/lua/LuaContext;->id:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v2, -0x140eefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic d(Ljava/lang/Object;Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/LuaContext;->setGlobal$lambda$3(Ljava/lang/Object;Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method private static final executeFile_IoAF18A$lambda$2(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)LHw;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {v3, p1}, Lparty/iroiro/luajava/Lua;->load(Ljava/lang/String;)V

    iget-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p1, v2, v1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    iget-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object v3, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {v3, v2}, Lparty/iroiro/luajava/Lua;->setTop(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    :try_start_1
    iget-object v3, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {v3, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    iget-object p0, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->setTop(I)V

    new-instance p0, Lio/github/cherrywechat/lua/LuaException;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-wide v0, -0x140fafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-direct {p0, v0}, Lio/github/cherrywechat/lua/LuaException;-><init>(Ljava/lang/String;)V

    new-instance p1, LGw;

    invoke-direct {p1, p0}, LGw;-><init>(Ljava/lang/Throwable;)V

    :goto_2
    new-instance p0, LHw;

    invoke-direct {p0, p1}, LHw;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic f(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/LuaContext;->getGlobal$lambda$4(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final getGlobal$lambda$4(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0, p1}, Lparty/iroiro/luajava/Lua;->getGlobal(Ljava/lang/String;)V

    iget-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    iget-object p0, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object p1
.end method

.method public static synthetic i(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;[Ljava/lang/Object;)LHw;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/LuaContext;->callFunction_gIAlu_s$lambda$6(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;[Ljava/lang/Object;)LHw;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)LHw;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/LuaContext;->executeFile_IoAF18A$lambda$2(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)LHw;

    move-result-object p0

    return-object p0
.end method

.method private static final setGlobal$lambda$3(Ljava/lang/Object;Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)LTC;
    .locals 2

    if-eqz p0, :cond_0

    iget-object v0, p1, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {v0, p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_0

    :cond_0
    iget-object p0, p1, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    iget-object p0, p1, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method


# virtual methods
.method public final varargs callFunction-gIAlu-s(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const-wide v0, -0x14027fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1402cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaContext;->checkClosed()V

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    iget-object v1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    new-instance v2, LM8;

    invoke-direct {v2, p0, p1, p2}, LM8;-><init>(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LHw;

    iget-object p1, p1, LHw;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public close()V
    .locals 5

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/LuaContext;->closed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/github/cherrywechat/lua/LuaContext;->closed:Z

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPIRegistry;

    iget-object v1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-virtual {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->cleanupFor(Lparty/iroiro/luajava/Lua;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-wide v1, -0x14035fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x140c0fffff835L

    const-wide v3, -0x140ddfffff835L

    invoke-static {v1, v2, v3, v4, v0}, LEy;->i(JJLjava/lang/Exception;)V

    :goto_0
    iget-object v0, p0, Lio/github/cherrywechat/lua/LuaContext;->refs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/github/cherrywechat/lua/LuaContext;->activity:Landroid/app/Activity;

    iget-object v0, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->close()V

    return-void
.end method

.method public final execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    const-wide v0, -0x14013fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaContext;->checkClosed()V

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    iget-object v1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    invoke-virtual {v0, v1, p1}, Lio/github/cherrywechat/lua/LuaEngine;->executeInternal-gIAlu-s$app_release(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final executeFile-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    const-wide v0, -0x14018fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaContext;->checkClosed()V

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    iget-object v1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    new-instance v2, LFp;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, LFp;-><init>(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;I)V

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LHw;

    iget-object p1, p1, LHw;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public final getActivity()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/LuaContext;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method public final getGlobal(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    const-wide v0, -0x14022fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaContext;->checkClosed()V

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    iget-object v1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    new-instance v2, LFp;

    const/4 v3, 0x1

    invoke-direct {v2, p0, p1, v3}, LFp;-><init>(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;I)V

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/LuaContext;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final hold(Ljava/lang/Object;)V
    .locals 2

    const-wide v0, -0x14031fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, Lio/github/cherrywechat/lua/LuaContext;->refs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final setActivity(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lio/github/cherrywechat/lua/LuaContext;->activity:Landroid/app/Activity;

    return-void
.end method

.method public final setGlobal(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    const-wide v0, -0x1401dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaContext;->checkClosed()V

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    iget-object v1, p0, Lio/github/cherrywechat/lua/LuaContext;->lua:Lparty/iroiro/luajava/Lua;

    new-instance v2, LM8;

    const/4 v3, 0x1

    invoke-direct {v2, p2, p0, p1, v3}, LM8;-><init>(Ljava/lang/Object;Ljava/lang/AutoCloseable;Ljava/lang/String;I)V

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method
