.class public final Lio/github/cherrywechat/lua/api/CherryMessageAPI;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;,
        Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;,
        Lio/github/cherrywechat/lua/api/CherryMessageAPI$TalkerType;,
        Lio/github/cherrywechat/lua/api/CherryMessageAPI$Type;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI;

.field private static final TAG:Ljava/lang/String;

.field private static final messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x1f8c8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic A(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$16(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic B(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$22(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic C(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$11(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic D(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$5(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$1(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$13(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->pushMessageData$lambda$28(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private static final cleanup$lambda$33$lambda$32(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)LTC;
    .locals 1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getFuncRef()I

    move-result p0

    invoke-interface {v0, p0}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final cleanupFor$lambda$36$lambda$35(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)LTC;
    .locals 0

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getFuncRef()I

    move-result p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method public static synthetic d(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->cleanupFor$lambda$36$lambda$35(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)LTC;

    move-result-object p0

    return-object p0
.end method

.method private static final dispatchMessage$lambda$24(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;)LTC;
    .locals 2

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getFuncRef()I

    move-result v1

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->pushMessageData(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;)V

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object p0

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method public static synthetic e(Lx8;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$16$lambda$15(Lfj;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->pushMessageData$lambda$31(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic g(ILio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$16$lambda$14(ILio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$9(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic i(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$3(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic j(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$2(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic k(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$8(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic l(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$6(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic m(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$4(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic n(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$7(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->cleanup$lambda$33$lambda$32(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->pushMessageData$lambda$25(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final pushMessageData(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;)V
    .locals 4

    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getTalker()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const-wide v0, -0x1ff31fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getSendTalker()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const-wide v2, -0x1ff38fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->isSend()I

    move-result v0

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x1ffc3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getType()I

    move-result v0

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x1ffcafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getMsgId()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x1ffcffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getCreateTime()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x1ffd5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const-wide v2, -0x1ffe0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getTalkerType()I

    move-result v0

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x1ffe8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lw8;

    const/4 v2, 0x3

    invoke-direct {v0, p2, v2}, Lw8;-><init>(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1fff3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lw8;

    const/4 v2, 0x4

    invoke-direct {v0, p2, v2}, Lw8;-><init>(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1fffdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lw8;

    const/4 v2, 0x5

    invoke-direct {v0, p2, v2}, Lw8;-><init>(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ff85fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lw8;

    const/4 v2, 0x6

    invoke-direct {v0, p2, v2}, Lw8;-><init>(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ff90fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lw8;

    const/4 v2, 0x0

    invoke-direct {v0, p2, v2}, Lw8;-><init>(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ff97fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lw8;

    const/4 v2, 0x1

    invoke-direct {v0, p2, v2}, Lw8;-><init>(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ff9ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lw8;

    const/4 v2, 0x2

    invoke-direct {v0, p2, v2}, Lw8;-><init>(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1ffa7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final pushMessageData$lambda$25(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f83afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getTalkerType()I

    move-result p0

    const/4 v0, 0x1

    if-nez p0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final pushMessageData$lambda$26(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f83cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getTalkerType()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final pushMessageData$lambda$27(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f83efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->isSend()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final pushMessageData$lambda$28(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f8c0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getType()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final pushMessageData$lambda$29(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f8c2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getType()I

    move-result p0

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    move p0, v1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v1
.end method

.method private static final pushMessageData$lambda$30(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f8c4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getType()I

    move-result p0

    const/16 v0, 0x22

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    move p0, v1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v1
.end method

.method private static final pushMessageData$lambda$31(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f8c6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getType()I

    move-result p0

    const/16 v0, 0x2b

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    move p0, v1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v1
.end method

.method public static synthetic q(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->pushMessageData$lambda$27(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic r(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$0(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private static final register$lambda$0(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1fe6ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    sget-object v4, Lms;->a:LPg;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, LPg;->l(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v1, -0x1fe71fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fe02fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fe0cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fe0ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const-wide v1, -0x1fe1afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fe2bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0

    :cond_2
    :goto_0
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$1(Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x1fe3afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    sget-object v4, Lms;->a:LPg;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v4, -0x9d69fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x9d70fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    sget-object v4, Lms;->c:LCb;

    new-instance v5, Llp;

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v5, v2, v1, v6, v7}, Llp;-><init>(Ljava/lang/String;Ljava/lang/String;LEb;I)V

    const/4 v1, 0x3

    invoke-static {v4, v5, v1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    const-wide v1, -0x1fe3cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fecdfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fed8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fedbfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const-wide v1, -0x1fee6fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fef7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0

    :cond_2
    :goto_0
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$10(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1fc98fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    const-wide v1, -0x1fc9afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fcabfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fcb3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$11(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1fcbbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    const-wide v1, -0x1fcbdfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fb4efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fb56fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$12(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1fb5efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x1fb60fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fb71fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fb7afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fb7dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$13(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1fb05fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v1

    if-nez v1, :cond_0

    const-wide/high16 v1, -0x4010000000000000L    # -1.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    return v0

    :cond_0
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v1

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;

    invoke-direct {v3, p0, v1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;-><init>(Lparty/iroiro/luajava/Lua;I)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v1, -0x1fb07fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fb18fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    return v0
.end method

.method private static final register$lambda$16(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1fb2ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v1

    double-to-int v1, v1

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Lx8;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lx8;-><init>(II)V

    new-instance v4, Ly8;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, Ly8;-><init>(Lfj;I)V

    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    :cond_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$16$lambda$14(ILio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;)Z
    .locals 0

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getFuncRef()I

    move-result p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$16$lambda$15(Lfj;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final register$lambda$18(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1fb31fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getFuncRef()I

    move-result v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    goto :goto_0

    :cond_0
    sget-object p0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$2(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1fe87fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_0

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    :cond_0
    const-wide v1, -0x1fe89fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fe9afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fea5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fea8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1feabfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$22(Lparty/iroiro/luajava/Lua;)I
    .locals 17

    move-object/from16 v1, p0

    const-wide v2, -0x1fb33fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v3

    const/4 v4, 0x2

    if-lt v3, v4, :cond_0

    invoke-interface {v1, v4}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v3

    double-to-int v3, v3

    goto :goto_0

    :cond_0
    const/16 v3, 0x14

    :goto_0
    invoke-interface {v1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x3

    if-lt v4, v6, :cond_1

    invoke-interface {v1, v6}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v6

    double-to-long v6, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v5

    :goto_1
    const/4 v6, 0x0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_2

    goto/16 :goto_a

    :cond_2
    if-eqz v4, :cond_3

    const-wide v7, -0x1fb35fffff835L

    :try_start_0
    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_3
    const-wide v7, -0x1fa47fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    :goto_2
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v4, v3}, [Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_4
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {v7, v0}, LPj;->w(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_6

    :goto_4
    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_5

    const-wide v7, -0x1facbfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v7, -0x1fad1fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    new-instance v8, LEt;

    invoke-direct {v8, v4, v7}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v9, -0x1fad7fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v9, -0x1fae0fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    new-instance v9, LEt;

    invoke-direct {v9, v4, v7}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v10, -0x1fae9fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v10, -0x1faeefffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v10, LEt;

    invoke-direct {v10, v4, v7}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v11, -0x1faf3fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v11, -0x1fafafffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v11, LEt;

    invoke-direct {v11, v4, v7}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v12, -0x1fa81fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v12, -0x1fa88fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v12, LEt;

    invoke-direct {v12, v4, v7}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v13, -0x1fa8ffffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v13, -0x1fa9afffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    new-instance v13, LEt;

    invoke-direct {v13, v4, v7}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v14, -0x1faa5fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v14, -0x1faacfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v14, LEt;

    invoke-direct {v14, v4, v7}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v15, -0x1fab3fffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v15, -0x1fabbfffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v15, LEt;

    invoke-direct {v15, v4, v7}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v8 .. v15}, [LEt;

    move-result-object v4

    invoke-static {v4}, Luq;->L([LEt;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move-object v4, v0

    goto :goto_5

    :cond_5
    :try_start_2
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_6

    :goto_5
    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {v3, v4}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    :goto_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-interface {v1, v3, v6}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v6

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v4, 0x1

    if-ltz v4, :cond_b

    check-cast v7, Ljava/util/Map;

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v4

    invoke-interface {v1, v6, v4}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v9, -0x2

    if-eqz v7, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    instance-of v11, v7, Ljava/lang/Long;

    if-eqz v11, :cond_7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    long-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-interface {v1, v7}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    goto :goto_9

    :cond_7
    instance-of v11, v7, Ljava/lang/Integer;

    if-eqz v11, :cond_8

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    int-to-double v11, v7

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-interface {v1, v7}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    goto :goto_9

    :cond_8
    instance-of v11, v7, Ljava/lang/String;

    if-eqz v11, :cond_9

    check-cast v7, Ljava/lang/String;

    invoke-interface {v1, v7}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_9

    :cond_9
    invoke-interface {v1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_9
    invoke-interface {v1, v9, v10}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    goto :goto_8

    :cond_a
    invoke-interface {v1, v9, v8}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    move v4, v8

    goto :goto_7

    :cond_b
    invoke-static {}, Lsa;->c0()V

    throw v5

    :cond_c
    const-wide v3, -0x1f943fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1f954fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1f960fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    const-wide v3, -0x1f96afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return v2

    :catch_0
    const-wide v3, -0x1f974fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1f905fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v1, v6, v6}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    return v2

    :cond_d
    :goto_a
    invoke-interface {v1, v6, v6}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    return v2
.end method

.method private static final register$lambda$23(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1f916fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v1

    double-to-long v1, v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    return v0

    :cond_0
    const-wide v3, -0x1f918fffff835L

    :try_start_0
    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, LPj;->w(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-ne v2, v0, :cond_2

    const/4 v2, 0x0

    const/16 v3, 0xa

    invoke-interface {p0, v2, v3}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    const-wide v2, -0x1f9fffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    long-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x1f985fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v4, -0x1f98bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    long-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v4, -0x1f994fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v4, -0x1f99dfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    int-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v4, -0x1f9a2fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v4, -0x1f9a7fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    int-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v4, -0x1f9aefffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v4, -0x1f9b5fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    int-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v4, -0x1f9bcfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v4, -0x1f843fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    long-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v4, -0x1f84efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v4, -0x1f859fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const-wide v4, -0x1f860fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v4, -0x1f867fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const-wide v4, -0x1f86ffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const-wide v4, -0x1f870fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    const-wide v1, -0x1f878fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1f809fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1f812fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    return v0

    :cond_2
    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const-wide v1, -0x1f81bfffff835L

    const-wide v3, -0x1f82cfffff835L

    invoke-static {v1, v2, v3, v4, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    return v0
.end method

.method private static final register$lambda$3(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1feb3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x1feb5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fd46fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fd51fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fd54fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$4(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1fd5cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x1fd5efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fd6ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fd7afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fd7dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$5(Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x1fd05fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    sget-object v4, Lms;->a:LPg;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v4, -0x9d9ffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x9da6fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    sget-object v4, Lms;->c:LCb;

    new-instance v5, Llp;

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct {v5, v2, v1, v6, v7}, Llp;-><init>(Ljava/lang/String;Ljava/lang/String;LEb;I)V

    const/4 v1, 0x3

    invoke-static {v4, v5, v1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    const-wide v1, -0x1fd07fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fd18fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fd22fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fd25fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const-wide v1, -0x1fd30fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fdc1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0

    :cond_2
    :goto_0
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$6(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1fdd0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    const/4 v1, 0x3

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x1fdd2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fde3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fdeefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fdf1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fdf4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$7(Lparty/iroiro/luajava/Lua;)I
    .locals 11

    const-wide v0, -0x1fdfcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v4

    if-eqz v4, :cond_1

    const-wide v4, -0x1fdfefffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0, v3, v4}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    const/4 v4, -0x1

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v6, -0x1fd82fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0, v3, v6}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v7, -0x1fd88fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p0, v3, v7}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v8, -0x1fd94fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-interface {p0, v3, v8}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v9, -0x1fd9bfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-interface {p0, v3, v9}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    :goto_0
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    :try_start_0
    sget-object v3, Lms;->a:LPg;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5, v6, v7, v8}, LPg;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide v3, -0x1fc4cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1fc5dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1fc67fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1fc6afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const-wide v3, -0x1fc75fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1fc06fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0

    :cond_3
    :goto_1
    const-wide v3, -0x1fda1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1fdb2fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0

    :cond_4
    :goto_2
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$8(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1fc15fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x1fc17fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fc28fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fc36fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$9(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1fcd2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    sget-object v4, Lms;->a:LPg;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, LPg;->h(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v1, -0x1fcd4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fce5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fceefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const-wide v1, -0x1fcf9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1fc8afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0

    :cond_2
    :goto_0
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method public static synthetic s(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->pushMessageData$lambda$29(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic t(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->pushMessageData$lambda$26(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic u(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$18(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic v(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->dispatchMessage$lambda$24(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$10(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic x(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$23(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic y(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->register$lambda$12(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic z(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->pushMessageData$lambda$30(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final cleanup()V
    .locals 6

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;

    :try_start_0
    sget-object v2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v3

    new-instance v4, LQ4;

    const/4 v5, 0x2

    invoke-direct {v4, v5, v1}, LQ4;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3, v4}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method

.method public final cleanupFor(Lparty/iroiro/luajava/Lua;)V
    .locals 6

    const-wide v0, -0x1ffaffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v3

    invoke-static {v3, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    :try_start_0
    sget-object v3, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v4, Lf;

    const/4 v5, 0x1

    invoke-direct {v4, v5, p1, v2}, Lf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v4}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_3
    const-wide v2, -0x1ffb3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x1fe44fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    return-void
.end method

.method public final dispatchMessage(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;)V
    .locals 6

    const-wide v0, -0x1ff58fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1ff5cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1ff6dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;->getContent()Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide v1, -0x1ff03fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;

    :try_start_0
    sget-object v2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v3

    new-instance v4, Lf;

    const/4 v5, 0x2

    invoke-direct {v4, v5, v1, p1}, Lf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3, v4}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v1, -0x1ff11fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1ff22fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final register(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    const-wide v0, -0x1f1a5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/16 v0, 0x1e

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    const/16 v0, 0xf

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v0, -0x1f1a9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide/high16 v1, 0x4008000000000000L    # 3.0

    const/4 v3, -0x2

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f1aefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide/high16 v1, 0x4041000000000000L    # 34.0

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f1b4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, 0x4045800000000000L    # 43.0

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f1bafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, 0x4047800000000000L    # 47.0

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f040fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, 0x4048800000000000L    # 49.0

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f046fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide/high16 v1, 0x4048000000000000L    # 48.0

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f04bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, 0x40c3880000000000L    # 10000.0

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f054fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, 0x41b9000031000000L    # 4.19430449E8

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f058fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, 0x41ba000031000000L    # 4.36207665E8

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f061fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, 0x41c8800018800000L    # 8.22083633E8

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f06cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, 0x41d040000c400000L    # 1.090519089E9

    invoke-static {p1, v3, v0, v1, v2}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v0, -0x1f072fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v0, -0x1f077fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f07cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f005fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f00ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f019fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f023fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f02dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f036fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f0c0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f0c9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f0d6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f0defffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f0e5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f0ecfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f0f4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f0fefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f089fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f098fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f0a3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v0, -0x1f0abfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1f0bcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method
