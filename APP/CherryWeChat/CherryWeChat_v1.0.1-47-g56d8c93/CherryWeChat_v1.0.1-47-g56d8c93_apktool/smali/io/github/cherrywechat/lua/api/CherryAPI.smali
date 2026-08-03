.class public final Lio/github/cherrywechat/lua/api/CherryAPI;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPI;

.field private static final TAG:Ljava/lang/String;

.field private static volatile currentActivity:Landroid/app/Activity;

.field private static volatile currentContext:Landroid/content/Context;

.field private static final mainHandler:Landroid/os/Handler;

.field private static volatile printListener:Lfj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x1c900fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryAPI;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryAPI;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPI;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->mainHandler:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic A(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUtilApi$lambda$26(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic B(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$20(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic C(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUtilApi$lambda$28(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic D(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$20$lambda$19$lambda$14(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic E(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$12$lambda$11(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerConfigApi$lambda$35(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic G(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$20$lambda$19$lambda$18$lambda$17(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerLogApi$lambda$4(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static synthetic I(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerGlobalFunctions$lambda$57(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic J(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerFileApi$lambda$46(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic K(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi$lambda$42$lambda$41$lambda$40(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lkotlin/jvm/functions/Function2;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerLogApi$lambda$6$lambda$5(Lkotlin/jvm/functions/Function2;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic M(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerFileApi$lambda$53(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic N(Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi$lambda$45$lambda$44(Lparty/iroiro/luajava/Lua;I)V

    return-void
.end method

.method public static synthetic O(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerFileApi$lambda$50(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic P(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUtilApi$lambda$27(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic Q(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerConfigApi$lambda$34(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic R(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi$lambda$45$lambda$44$lambda$43(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi$lambda$42$lambda$41(Lparty/iroiro/luajava/Lua;I)V

    return-void
.end method

.method public static synthetic T(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerGlobalFunctions$lambda$55(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic U(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerLogApi$lambda$0(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic V(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUtilApi$lambda$29(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic W(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$20$lambda$19(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUtilApi$lambda$31(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic Y(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerFileApi$lambda$47(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic Z(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUtilApi$lambda$24(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerGlobalFunctions$lambda$60(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic a0(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$12$lambda$11$lambda$10(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic b(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerConfigApi$lambda$33(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic b0(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$20$lambda$19$lambda$16$lambda$15(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi$lambda$42(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic c0(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerLogApi$lambda$2(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$21(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic e(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi$lambda$38$lambda$37$lambda$36(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerConfigApi$lambda$32(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic g(ILjava/lang/String;)LTC;
    .locals 0

    invoke-static {p1, p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$8$lambda$7(Ljava/lang/String;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi$lambda$45(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic i(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi$lambda$38$lambda$37(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerFileApi$lambda$52(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic k(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi$lambda$42$lambda$41$lambda$40$lambda$39(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerLogApi$lambda$1(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static synthetic m(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerFileApi$lambda$48(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic n(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$20$lambda$19$lambda$16(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic o(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUtilApi$lambda$30(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic p(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerFileApi$lambda$49(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic q(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$12(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic r(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$8(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final registerConfigApi(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    new-instance v0, Lk8;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1cc43fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc47fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc4bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc52fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v2, -0x1cc58fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerConfigApi$lambda$32(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1ca12fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v3

    if-le v3, v0, :cond_1

    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    sget-object v4, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    if-nez v4, :cond_2

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    :cond_2
    if-eqz v4, :cond_4

    const-wide v5, -0x1ca14fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    goto :goto_1

    :cond_4
    if-eqz v3, :cond_5

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_1
    return v0
.end method

.method private static final registerConfigApi$lambda$33(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1ca1ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    if-nez v4, :cond_1

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    :cond_1
    if-eqz v4, :cond_2

    const-wide v5, -0x1ca21fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_0

    :cond_2
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
.end method

.method private static final registerConfigApi$lambda$34(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1ca2cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    if-nez v3, :cond_1

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    :cond_1
    if-eqz v3, :cond_2

    const-wide v4, -0x1ca2efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_0

    :cond_2
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
.end method

.method private static final registerConfigApi$lambda$35(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1ca39fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    if-nez v0, :cond_0

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const-wide v3, -0x1ca3bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_0

    :cond_1
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v1
.end method

.method private final registerFileApi(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    new-instance v0, Lk8;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1cc7ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc04fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc0afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/4 v2, 0x6

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc11fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc18fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc1efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc23fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v2, -0x1cc30fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerFileApi$lambda$46(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1caccfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lwh;->g0(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    return v0
.end method

.method private static final registerFileApi$lambda$47(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1cacefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    const-wide v3, -0x1cad0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    :cond_1
    :try_start_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v3}, Lwh;->i0(Ljava/io/File;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final registerFileApi$lambda$48(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1cad1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final registerFileApi$lambda$49(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1cad3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final registerFileApi$lambda$50(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1cad5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final registerFileApi$lambda$52(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1cad7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_1

    array-length v3, v1

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    array-length v3, v1

    move v4, v2

    :goto_0
    if-ge v2, v3, :cond_2

    aget-object v5, v1, v2

    add-int/2addr v4, v0

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0, v5}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 v5, -0x2

    invoke-interface {p0, v5, v4}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p0, v2, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    :cond_2
    return v0
.end method

.method private static final registerFileApi$lambda$53(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1cad9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    if-nez v0, :cond_0

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    :cond_0
    if-eqz v0, :cond_2

    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-wide v2, -0x1cadbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private final registerGlobalFunctions(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    new-instance v0, Lk8;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1cc35fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1cc3bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1ccc2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    return-void
.end method

.method private static final registerGlobalFunctions$lambda$55(Lparty/iroiro/luajava/Lua;)I
    .locals 9

    const-wide v0, -0x1cae7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LGl;

    const/4 v1, 0x1

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v2

    invoke-direct {v0, v1, v2, v1}, LDl;-><init>(III)V

    new-instance v3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, LDl;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v1, v0

    check-cast v1, LEl;

    iget-boolean v2, v1, LEl;->c:Z

    if-eqz v2, :cond_2

    invoke-virtual {v1}, LEl;->nextInt()I

    move-result v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-wide v1, -0x1cae9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-wide v0, -0x1caedfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object p0

    const-wide v0, -0x1caeffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->printListener:Lfj;

    if-eqz v0, :cond_3

    invoke-interface {v0, p0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method private static final registerGlobalFunctions$lambda$57(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1caf9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    new-instance v3, LGl;

    const/4 v4, 0x2

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v5

    invoke-direct {v3, v4, v5, v2}, LDl;-><init>(III)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v4, v3

    check-cast v4, LEl;

    invoke-virtual {v4}, LEl;->nextInt()I

    move-result v4

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-array p0, v1, [Ljava/lang/Object;

    invoke-interface {v2, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    :try_start_0
    array-length v2, p0

    invoke-static {p0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    array-length v2, p0

    invoke-static {p0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    const-wide v2, -0x1cafbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x1ca87fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    const-wide v2, -0x1ca91fffff835L

    const-wide v4, -0x1ca9bfffff835L

    invoke-static {v2, v3, v4, v5, p0}, LEy;->i(JJLjava/lang/Exception;)V

    :goto_1
    return v1
.end method

.method private static final registerGlobalFunctions$lambda$60(Lparty/iroiro/luajava/Lua;)I
    .locals 9

    const-wide v0, -0x1caaafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x1caacfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide v4, -0x1cab2fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    const-wide v5, -0x1cab9fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    :goto_0
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x1cabdfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    instance-of v4, v1, Ljava/lang/String;

    if-nez v4, :cond_1

    instance-of v4, v1, Ljava/lang/Number;

    if-nez v4, :cond_1

    instance-of v4, v1, Ljava/lang/Boolean;

    if-nez v4, :cond_1

    const-wide v4, -0x1c945fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    const-wide v5, -0x1c94dfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v3}, LP4;->J([Ljava/lang/Object;I)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/reflect/Field;

    invoke-virtual {v5, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :try_start_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v7, -0x1c964fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v7, -0x1c967fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v7, -0x1c96afffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v7, -0x1c96dfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-wide v4, -0x1c977fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x1c978fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private final registerLogApi(Lparty/iroiro/luajava/Lua;)V
    .locals 8

    new-instance v0, Lk8;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1cd38fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v2, -0x1cd3cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v2, LH7;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, LH7;-><init>(I)V

    new-instance v3, LEt;

    invoke-direct {v3, v0, v2}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v4, -0x1cdc1fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v2, LH7;

    const/4 v4, 0x2

    invoke-direct {v2, v4}, LH7;-><init>(I)V

    new-instance v4, LEt;

    invoke-direct {v4, v0, v2}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x1cdc6fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v2, LH7;

    const/4 v5, 0x3

    invoke-direct {v2, v5}, LH7;-><init>(I)V

    new-instance v5, LEt;

    invoke-direct {v5, v0, v2}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v6, -0x1cdcbfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v2, LH7;

    const/4 v6, 0x4

    invoke-direct {v2, v6}, LH7;-><init>(I)V

    new-instance v6, LEt;

    invoke-direct {v6, v0, v2}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5, v6}, [LEt;

    move-result-object v0

    invoke-static {v0}, Luq;->L([LEt;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function2;

    new-instance v4, Lbm;

    const/4 v5, 0x3

    invoke-direct {v4, v5, v2}, Lbm;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v4}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    invoke-interface {p1, v1, v3}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final registerLogApi$lambda$0(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1ccc7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-wide v0, -0x1ccc9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_0
    const-wide v0, -0x1cccdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_1
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-wide v0, -0x1ccd7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_2
    const/4 v0, 0x2

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    const-wide v0, -0x1cce1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final registerLogApi$lambda$1(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    const-wide v0, -0x1cce5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1cce9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static final registerLogApi$lambda$2(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    const-wide v0, -0x1ccedfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1ccf1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static final registerLogApi$lambda$3(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    const-wide v0, -0x1ccf5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1ccf9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static final registerLogApi$lambda$4(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    const-wide v0, -0x1ccfdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1cc81fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static final registerLogApi$lambda$6$lambda$5(Lkotlin/jvm/functions/Function2;Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1cc85fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-wide v2, -0x1cc87fffff835L

    :goto_0
    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    const-wide v2, -0x1cc91fffff835L

    goto :goto_0

    :cond_1
    :goto_1
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v2

    if-le v2, v1, :cond_2

    const/4 v1, 0x2

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    const-wide v1, -0x1cc9bfffff835L

    :goto_2
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_2
    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    const-wide v1, -0x1cc9ffffff835L

    goto :goto_2

    :cond_3
    :goto_3
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    return p0
.end method

.method private final registerThreadApi(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    new-instance v0, Lk8;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1cc5ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc6dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0xd

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cc79fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerThreadApi$lambda$38(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1cac6fffff835L

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

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPI;

    new-instance v3, Lj8;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v0, v4}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-direct {v1, v3}, Lio/github/cherrywechat/lua/api/CherryAPI;->runOnUiThread(LUi;)V

    return v2
.end method

.method private static final registerThreadApi$lambda$38$lambda$37(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0x8

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final registerThreadApi$lambda$38$lambda$37$lambda$36(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x0

    invoke-interface {p0, v0, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final registerThreadApi$lambda$42(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1cac8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v3

    double-to-long v3, v3

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryAPI;->mainHandler:Landroid/os/Handler;

    new-instance v5, Lm8;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v0, v6}, Lm8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v1, v5, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return v2
.end method

.method private static final registerThreadApi$lambda$42$lambda$41(Lparty/iroiro/luajava/Lua;I)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    new-instance v1, Lj8;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, v1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->runOnUiThread(LUi;)V

    return-void
.end method

.method private static final registerThreadApi$lambda$42$lambda$41$lambda$40(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/4 v2, 0x6

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final registerThreadApi$lambda$42$lambda$41$lambda$40$lambda$39(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x0

    invoke-interface {p0, v0, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final registerThreadApi$lambda$45(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1cacafffff835L

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

    new-instance v1, Ljava/lang/Thread;

    new-instance v3, Lm8;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v0, v4}, Lm8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return v2
.end method

.method private static final registerThreadApi$lambda$45$lambda$44(Lparty/iroiro/luajava/Lua;I)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final registerThreadApi$lambda$45$lambda$44$lambda$43(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x0

    invoke-interface {p0, v0, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private final registerUiApi(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    new-instance v0, Lk8;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1cdd0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cdd6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cddcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x11

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cde4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cdf0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerUiApi$lambda$12(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1cb6dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, -0x1cb6ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v2, v0

    const/4 v0, 0x2

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-wide v0, -0x1cb70fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v3, v0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v0

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    goto :goto_0

    :goto_1
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPI;

    new-instance v1, Ln8;

    const/4 v6, 0x1

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, Ln8;-><init>(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;I)V

    invoke-direct {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->runOnUiThread(LUi;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final registerUiApi$lambda$12$lambda$11(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const-wide v0, -0x1cb4afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll8;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1}, Ll8;-><init>(ILparty/iroiro/luajava/Lua;I)V

    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0

    :cond_0
    const-wide p0, -0x1cb4dfffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const-wide p0, -0x1cb57fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final registerUiApi$lambda$12$lambda$11$lambda$10(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    const/4 p2, -0x1

    if-eq p0, p2, :cond_0

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, Lj8;

    const/4 v0, 0x4

    invoke-direct {p3, p1, p0, v0}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p1, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final registerUiApi$lambda$12$lambda$11$lambda$10$lambda$9(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 2

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final registerUiApi$lambda$20(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1cb7bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, -0x1cb7dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v2, v0

    const/4 v0, 0x2

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-wide v0, -0x1cb7efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v3, v0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v0

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    goto :goto_0

    :goto_1
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPI;

    new-instance v1, Ln8;

    const/4 v6, 0x0

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, Ln8;-><init>(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;I)V

    invoke-direct {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->runOnUiThread(LUi;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final registerUiApi$lambda$20$lambda$19(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)LTC;
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const-wide v0, -0x1cb71fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll8;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p3, v1}, Ll8;-><init>(ILparty/iroiro/luajava/Lua;I)V

    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const-wide v0, -0x1cb74fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll8;

    const/4 v1, 0x2

    invoke-direct {v0, p2, p3, v1}, Ll8;-><init>(ILparty/iroiro/luajava/Lua;I)V

    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    new-instance p1, Lp8;

    invoke-direct {p1, p3, p2}, Lp8;-><init>(Lparty/iroiro/luajava/Lua;I)V

    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_0
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final registerUiApi$lambda$20$lambda$19$lambda$14(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    const/4 p2, -0x1

    if-eq p0, p2, :cond_0

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, Lj8;

    const/4 v0, 0x5

    invoke-direct {p3, p1, p0, v0}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p1, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final registerUiApi$lambda$20$lambda$19$lambda$14$lambda$13(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 p1, 0x1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final registerUiApi$lambda$20$lambda$19$lambda$16(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    const/4 p2, -0x1

    if-eq p0, p2, :cond_0

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance p3, Lj8;

    const/4 v0, 0x7

    invoke-direct {p3, p1, p0, v0}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p1, p3}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final registerUiApi$lambda$20$lambda$19$lambda$16$lambda$15(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 v0, 0x1

    invoke-interface {p0, v0, p1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final registerUiApi$lambda$20$lambda$19$lambda$18(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;)V
    .locals 2

    const/4 p2, -0x1

    if-eq p0, p2, :cond_0

    sget-object p2, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v0, Lj8;

    const/4 v1, 0x3

    invoke-direct {v0, p1, p0, v1}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p2, p1, v0}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final registerUiApi$lambda$20$lambda$19$lambda$18$lambda$17(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final registerUiApi$lambda$21(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1cb7ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final registerUiApi$lambda$22(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1cb01fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    :goto_0
    if-eqz v0, :cond_1

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method private static final registerUiApi$lambda$8(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1cb44fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide v1, -0x1cb46fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v2

    const/4 v3, 0x0

    if-le v2, v0, :cond_1

    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v4

    double-to-int p0, v4

    if-lez p0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    sget-object p0, Lio/github/cherrywechat/lua/api/CherryAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPI;

    new-instance v2, Lo8;

    const/4 v4, 0x0

    invoke-direct {v2, v1, v0, v4}, Lo8;-><init>(Ljava/lang/String;II)V

    invoke-direct {p0, v2}, Lio/github/cherrywechat/lua/api/CherryAPI;->runOnUiThread(LUi;)V

    return v3
.end method

.method private static final registerUiApi$lambda$8$lambda$7(Ljava/lang/String;I)LTC;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    :cond_1
    const-wide p0, -0x1cca3fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const-wide p0, -0x1ccadfffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    :goto_1
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private final registerUtilApi(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    new-instance v0, Lk8;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1cdfbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cd81fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cd8efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/16 v2, 0x1d

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cd9bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lq8;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lq8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cda0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lq8;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Lq8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cda5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cdabfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cdb3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lk8;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lk8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1cdb8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerUtilApi$lambda$23(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1cb03fffff835L

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

.method private static final registerUtilApi$lambda$24(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1cb05fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/LuaUiScheduler;->isForeground()Z

    move-result v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final registerUtilApi$lambda$25(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1cb07fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/LuaUiScheduler;->isForeground()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v1
.end method

.method private static final registerUtilApi$lambda$26(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1cb09fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final registerUtilApi$lambda$27(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1cb0bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    :goto_0
    if-eqz v3, :cond_2

    const-wide v4, -0x1cb0dfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-wide v3, -0x1cb17fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/content/ClipboardManager;

    const-wide v3, -0x1cbddfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_1

    :cond_2
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_1
    return v0
.end method

.method private static final registerUtilApi$lambda$28(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1cbe6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    :goto_0
    if-eqz v0, :cond_3

    const-wide v1, -0x1cbe8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-wide v1, -0x1cbf2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/content/ClipboardManager;

    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    goto :goto_2

    :cond_3
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_2
    const/4 p0, 0x1

    return p0
.end method

.method private static final registerUtilApi$lambda$29(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1cbb8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    :goto_0
    if-eqz v3, :cond_2

    :try_start_0
    new-instance v4, Landroid/content/Intent;

    const-wide v5, -0x1cbbafffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v4, v5, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v4, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v3, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-wide v3, -0x1ca55fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1ca5ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_1

    :cond_2
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_1
    return v0
.end method

.method private static final registerUtilApi$lambda$30(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1ca74fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide v1, -0x1ca76fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    const-wide v1, -0x1ca7afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_2

    const-wide v1, -0x1ca01fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    const-wide v1, -0x1ca08fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final registerUtilApi$lambda$31(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1ca10fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    :try_start_0
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_0

    :cond_0
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
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

.method public static synthetic s(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi$lambda$38(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic t(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$20$lambda$19$lambda$18(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic u(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$22(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic v(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$12$lambda$11$lambda$10$lambda$9(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi$lambda$20$lambda$19$lambda$14$lambda$13(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerLogApi$lambda$3(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static synthetic y(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUtilApi$lambda$23(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic z(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUtilApi$lambda$25(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final getCurrentActivity()Landroid/app/Activity;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    return-object v0
.end method

.method public final getCurrentContext()Landroid/content/Context;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getPrintListener()Lfj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj;"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPI;->printListener:Lfj;

    return-object v0
.end method

.method public final register(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    const-wide v0, -0x1cd0efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerLogApi(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUiApi(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerUtilApi(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerConfigApi(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerThreadApi(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerFileApi(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1cd12fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->registerGlobalFunctions(Lparty/iroiro/luajava/Lua;)V

    const-wide v0, -0x1cd19fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1cd23fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final setCurrentActivity(Landroid/app/Activity;)V
    .locals 0

    sput-object p1, Lio/github/cherrywechat/lua/api/CherryAPI;->currentActivity:Landroid/app/Activity;

    return-void
.end method

.method public final setCurrentContext(Landroid/content/Context;)V
    .locals 0

    sput-object p1, Lio/github/cherrywechat/lua/api/CherryAPI;->currentContext:Landroid/content/Context;

    return-void
.end method

.method public final setPrintListener(Lfj;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj;",
            ")V"
        }
    .end annotation

    sput-object p1, Lio/github/cherrywechat/lua/api/CherryAPI;->printListener:Lfj;

    return-void
.end method
