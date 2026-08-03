.class public final Lio/github/cherrywechat/lua/api/CherryAPIRegistry;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPIRegistry;

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x1c873fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPIRegistry;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final registerConfigModule(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryConfigAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryConfigAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryConfigAPI;->register(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1c9edfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private final registerDevModule(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V
    .locals 2
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

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryDevAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryDevAPI;

    invoke-virtual {v0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryDevAPI;->register(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V

    const-wide v0, -0x1c988fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    const/4 v0, -0x2

    invoke-interface {p1, v0, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private final registerFileModule(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryFileAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryFileAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryFileAPI;->register(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1c9f4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private final registerGlobalFunctions(Lparty/iroiro/luajava/Lua;)V
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register(Lparty/iroiro/luajava/Lua;)V

    return-void
.end method

.method private final registerMessageModule(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1c9d6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private final registerNetworkModule(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1c9defffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private final registerThreadModule(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->register(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1c981fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private final registerUIModule(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->register(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1c9f9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private final registerUtilModule(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryUtilAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryUtilAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryUtilAPI;->register(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1c9fcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private final registerWeChatModule(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryWeChatAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryWeChatAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryWeChatAPI;->register(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1c9cffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private final registerXposedModule(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V
    .locals 2
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

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-virtual {v0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->register(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V

    const-wide v0, -0x1c9e6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    const/4 v0, -0x2

    invoke-interface {p1, v0, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final cleanup()V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->cleanup()V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->cleanup()V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->cleanup()V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryViewAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryViewAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->cleanup()V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryDevAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryDevAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryDevAPI;->cleanup()V

    const-wide v0, -0x1c98cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1c99efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final cleanupFor(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    const-wide v0, -0x1c9b9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->cleanupFor(Lparty/iroiro/luajava/Lua;)V

    sget-object v0, Lio/github/cherrywechat/lua/api/MessageAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/MessageAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->cleanupFor(Lparty/iroiro/luajava/Lua;)V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryThreadAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->cleanupFor(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1c9bdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1c84ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final registerAll(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V
    .locals 2
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

    const-wide v0, -0x1c90afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1c90efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerWeChatModule(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerMessageModule(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerNetworkModule(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerXposedModule(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerConfigModule(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerFileModule(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerUIModule(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerUtilModule(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerThreadModule(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerDevModule(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V

    const-wide v0, -0x1c91bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerGlobalFunctions(Lparty/iroiro/luajava/Lua;)V

    const-wide p1, -0x1c922fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x1c934fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method
