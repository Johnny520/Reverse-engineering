.class public final Lio/github/cherrywechat/lua/api/CherryDevAPI;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryDevAPI;

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x1f687fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryDevAPI;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryDevAPI;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryDevAPI;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryDevAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryDevAPI;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryDevAPI;->register$lambda$2(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryDevAPI;->register$lambda$4(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryDevAPI;->register$lambda$5(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryDevAPI;->register$lambda$1(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic e(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryDevAPI;->register$lambda$3(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryDevAPI;->register$lambda$0(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private static final register$lambda$0(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1f636fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v2

    double-to-int v0, v2

    goto :goto_0

    :cond_0
    const/16 v0, 0x2537

    :goto_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_1

    sget-object v3, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {v3, v2, v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->start(Landroid/content/Context;I)Z

    move-result v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_1

    :cond_1
    const-wide v2, -0x1f638fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x1f6c5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_1
    return v1
.end method

.method private static final register$lambda$1(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f6dafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object p0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->stop()V

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$2(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f6dcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->getServerUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$3(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f6defffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->isRunning()Z

    move-result v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$4(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1f6e0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, -0x1f6e2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-wide v1, -0x1f6e7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_1
    const/4 v2, 0x3

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    const-wide v2, -0x1f6f1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_2
    sget-object v2, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {v2, v0, v1, p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$5(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1f6f2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, -0x1f6f4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    const-wide v1, -0x1f6fcfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_1
    sget-object v1, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    const-wide v2, -0x1f6fdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final cleanup()V
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->stop()V

    return-void
.end method

.method public final register(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/ClassLoader;",
            ">;)V"
        }
    .end annotation

    const-wide v0, -0x1f656fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1f65afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 p2, 0x0

    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    new-instance p2, Lq8;

    const/16 v0, 0x10

    invoke-direct {p2, v0}, Lq8;-><init>(I)V

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f667fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    const/4 v0, -0x2

    invoke-interface {p1, v0, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance p2, Lq8;

    const/16 v1, 0x11

    invoke-direct {p2, v1}, Lq8;-><init>(I)V

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v1, -0x1f66dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance p2, Lq8;

    const/16 v1, 0x12

    invoke-direct {p2, v1}, Lq8;-><init>(I)V

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v1, -0x1f672fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance p2, Lq8;

    const/16 v1, 0x13

    invoke-direct {p2, v1}, Lq8;-><init>(I)V

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v1, -0x1f679fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance p2, Lq8;

    const/16 v1, 0x14

    invoke-direct {p2, v1}, Lq8;-><init>(I)V

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v1, -0x1f603fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance p2, Lq8;

    const/16 v1, 0x15

    invoke-direct {p2, v1}, Lq8;-><init>(I)V

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v1, -0x1f607fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide p1, -0x1f611fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x1f61efffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method
