.class public final Lio/github/cherrywechat/lua/api/MessageAPI;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;,
        Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/MessageAPI;

.field private static final TAG:Ljava/lang/String;

.field private static final messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x137c5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/MessageAPI;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/MessageAPI;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/MessageAPI;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/MessageAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/MessageAPI;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/MessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic A(Lx8;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$14$lambda$13(Lfj;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic B(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$11(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic C(ILio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$14$lambda$12(ILio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)Z

    move-result p0

    return p0
.end method

.method public static synthetic D(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$30(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic E(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$4(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic F(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$10(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic G(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->cleanupFor$lambda$36$lambda$35(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$26(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic I(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$29(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$0(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$27(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$6(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private static final cleanup$lambda$38$lambda$37(Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)LTC;
    .locals 1

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->getFuncRef()I

    move-result p0

    invoke-interface {v0, p0}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final cleanupFor$lambda$36$lambda$35(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)LTC;
    .locals 0

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->getFuncRef()I

    move-result p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method public static synthetic d(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$22(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private static final dispatchMessage$lambda$17(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;)LTC;
    .locals 0

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->getFuncRef()I

    move-result p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    sget-object p1, Lio/github/cherrywechat/lua/api/MessageAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/MessageAPI;

    invoke-direct {p1, p0, p2}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-interface {p0, p1, p2}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method public static synthetic e(Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)LTC;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->cleanup$lambda$38$lambda$37(Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$16(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$5(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic h(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$8(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic i(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$1(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic j(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$24(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic k(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/MessageAPI;->dispatchMessage$lambda$17(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$20(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic m(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$9(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic n(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$31(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$32(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic p(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$19(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final pushMessageData(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;)V
    .locals 4

    const/4 v0, 0x0

    const/16 v1, 0xf

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->getTalker()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const-wide v0, -0x10b2ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->getSendTalker()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const-wide v2, -0x10b36fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend()I

    move-result v0

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x10bc1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->getTalkerId()I

    move-result v0

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x10bc8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->getType()I

    move-result v0

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x10bd1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->getMsgId()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x10bd6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->getCreateTime()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x10bdcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const-wide v2, -0x10be7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->getTalkerType()I

    move-result v0

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v2, -0x10beffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/16 v2, 0x8

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10bfafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/16 v2, 0xf

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10b88fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/4 v2, 0x0

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10b94fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/4 v2, 0x1

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10ba6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/4 v2, 0x2

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10bb3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/4 v2, 0x3

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10bbefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/4 v2, 0x4

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10a45fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/4 v2, 0x5

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10a4dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/4 v2, 0x6

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10a55fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/4 v2, 0x7

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10a5dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/16 v2, 0x9

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10a65fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/16 v2, 0xa

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10a6cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/16 v2, 0xb

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10a72fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/16 v2, 0xc

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10a7dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/16 v2, 0xd

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10a09fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LIr;

    const/16 v2, 0xe

    invoke-direct {v0, p2, v2}, LIr;-><init>(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10a11fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final pushMessageData$lambda$18(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x13725fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isPrivateChat()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$19(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x13727fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isGroupChat()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$20(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x13729fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isOfficialAccount()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$21(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1372bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isEnterprise()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$22(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1372dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$23(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1372ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isText()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$24(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x13731fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isImage()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$25(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x13733fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isVoice()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$26(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x13735fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isVideo()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$27(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x13737fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isEmoji()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$28(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x13739fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isCard()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$29(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1373bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isTip()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$30(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1373dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isTransfer()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$31(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1373ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isRedPacket()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$32(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x137c1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isReply()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final pushMessageData$lambda$33(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x137c3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isFile()Z

    move-result p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic q(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$14(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic r(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$23(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private static final register$lambda$0(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x10af4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x10af6fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10a81fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10a8bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10a8efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$1(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x10aacfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x10aaefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10ab9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10944fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10947fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$10(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x108a9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    const-wide v1, -0x108abfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x108b6fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x108befffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$11(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1375cfffff835L

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

    new-instance v2, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    invoke-direct {v2, p0, v1}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;-><init>(Lparty/iroiro/luajava/Lua;I)V

    sget-object v3, Lio/github/cherrywechat/lua/api/MessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v1, -0x1375efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x13769fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    return v0
.end method

.method private static final register$lambda$14(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x13700fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v1

    double-to-int v1, v1

    sget-object v2, Lio/github/cherrywechat/lua/api/MessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Lx8;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, Lx8;-><init>(II)V

    new-instance v4, Ly8;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Ly8;-><init>(Lfj;I)V

    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    :cond_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$14$lambda$12(ILio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;)Z
    .locals 0

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->getFuncRef()I

    move-result p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$14$lambda$13(Lfj;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final register$lambda$16(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x13702fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/MessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->getFuncRef()I

    move-result v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    goto :goto_0

    :cond_0
    sget-object p0, Lio/github/cherrywechat/lua/api/MessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    const-wide v0, -0x13704fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1370ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$2(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x10965fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x10967fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10972fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1097dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10900fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$3(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1091efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x10920fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1092bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10936fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10939fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$4(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x109d7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 v1, 0x3

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x109d9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x109e4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x109effffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x109f2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x109f5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$5(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x10993fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x10995fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x109a0fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x109aafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$6(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x10848fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x1084afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10855fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10864fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$7(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x10802fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x10804fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1080ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1081cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$8(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1083afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const-wide v1, -0x1083cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x108c7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x108d5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x108d8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final register$lambda$9(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x108f6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    const-wide v1, -0x108f8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10883fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1088bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method public static synthetic s(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$2(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic t(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$33(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic u(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$3(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic v(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$21(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic w(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$28(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic x(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/MessageAPI;->register$lambda$7(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic y(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$18(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic z(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->pushMessageData$lambda$25(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final cleanup()V
    .locals 6

    sget-object v0, Lio/github/cherrywechat/lua/api/MessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    :try_start_0
    sget-object v2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v3

    new-instance v4, LQ4;

    const/4 v5, 0x5

    invoke-direct {v4, v5, v1}, LQ4;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3, v4}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/MessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    const-wide v0, -0x10accfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10ad7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final cleanupFor(Lparty/iroiro/luajava/Lua;)V
    .locals 6

    const-wide v0, -0x10a18fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/MessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

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

    check-cast v3, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

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

    check-cast v2, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    sget-object v3, Lio/github/cherrywechat/lua/api/MessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    :try_start_0
    sget-object v3, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v4, Lf;

    const/16 v5, 0x8

    invoke-direct {v4, v5, p1, v2}, Lf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v4}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_3
    const-wide v2, -0x10a1cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x10a27fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    return-void
.end method

.method public final dispatchMessage(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;)V
    .locals 6

    const-wide v0, -0x10b4afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10b4efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10b59fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->getContent()Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/MessageAPI;->messageCallbacks:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide v1, -0x10b6ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    :try_start_0
    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->getLua()Lparty/iroiro/luajava/Lua;

    move-result-object v2

    sget-object v3, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v4, LM8;

    const/4 v5, 0x4

    invoke-direct {v4, v2, v1, p1, v5}, LM8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v3, v2, v4}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v2, -0x10b7dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x10b08fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;->getFuncRef()I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final register(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    const-wide v0, -0x10d8efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    new-instance v0, Le9;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x10d92fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10d9bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x15

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10da5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10daffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10db9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10c43fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10c4cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10c5afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10c66fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10c73fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10c7afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x11

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10c01fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10c0bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10c16fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10c25fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10c2ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide/high16 v2, 0x4041000000000000L    # 34.0

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10c3afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, 0x4045800000000000L    # 43.0

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10cc5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, 0x4047800000000000L    # 47.0

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10cd0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, 0x4048800000000000L    # 49.0

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10cdbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, 0x40c3880000000000L    # 10000.0

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10ce5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, 0x41b9000031000000L    # 4.19430449E8

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10ceefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, 0x41ba000031000000L    # 4.36207665E8

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10cfcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, 0x41c8800018800000L    # 8.22083633E8

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10c8cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, 0x41d040000c400000L    # 1.090519089E9

    invoke-static {p1, v1, v0, v2, v3}, LEy;->q(Lparty/iroiro/luajava/Lua;ILjava/lang/String;D)V

    const-wide v2, -0x10c97fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v0, -0x10ca1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    const-wide v0, -0x10ca9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10cb4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method
