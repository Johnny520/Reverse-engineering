.class public final Lio/github/cherrywechat/lua/api/CherryGlobalAPI;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

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

    const-wide v0, -0x1f2bffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->mainHandler:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$27$lambda$26(Lparty/iroiro/luajava/Lua;I)V

    return-void
.end method

.method public static synthetic b(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$27(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$18(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$15(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic e(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$1(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$3(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$10(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic h(ILjava/lang/String;)LTC;
    .locals 0

    invoke-static {p1, p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$17$lambda$16(Ljava/lang/String;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$23(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic j(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$27$lambda$26$lambda$25(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$19(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic l(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$27$lambda$26$lambda$25$lambda$24(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$28(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic n(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$20(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$7(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic p(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$23$lambda$22(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$6(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic r(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$8(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private static final register$lambda$1(Lparty/iroiro/luajava/Lua;)I
    .locals 9

    const-wide v0, -0x1f3cbfffff835L

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
    const-wide v1, -0x1f3cdfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-wide v0, -0x1f3d1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {v0, p0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->print(Ljava/lang/String;)V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->printListener:Lfj;

    if-eqz v0, :cond_3

    invoke-interface {v0, p0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$10(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1f258fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide v1, -0x1f25afffff835L

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
    sget-object p0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    new-instance v2, Lo8;

    const/4 v4, 0x1

    invoke-direct {v2, v1, v0, v4}, Lo8;-><init>(Ljava/lang/String;II)V

    invoke-direct {p0, v2}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->runOnUiThread(LUi;)V

    return v3
.end method

.method private static final register$lambda$10$lambda$9(Ljava/lang/String;I)LTC;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentContext:Landroid/content/Context;

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_1
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$15(Lparty/iroiro/luajava/Lua;)I
    .locals 10

    const-wide v0, -0x1f26efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x1f270fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide v4, -0x1f27dfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    const-wide v5, -0x1f204fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    :goto_0
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x1f208fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    instance-of v4, v1, Ljava/lang/String;

    if-nez v4, :cond_2

    instance-of v4, v1, Ljava/lang/Number;

    if-nez v4, :cond_2

    instance-of v4, v1, Ljava/lang/Boolean;

    if-nez v4, :cond_2

    const-wide v4, -0x1f210fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    const-wide v5, -0x1f218fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const/16 v5, 0xf

    invoke-static {v4, v5}, LP4;->J([Ljava/lang/Object;I)Ljava/util/List;

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
    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v8, -0x1f22ffffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v8, -0x1f232fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v7, -0x1f235fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v7, -0x1f238fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-wide v4, -0x1f2c2fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    const-wide v4, -0x1f2cbfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v1, v3}, LP4;->J([Ljava/lang/Object;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v6, -0x1f2e3fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x28

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    const-wide v6, -0x1f2e6fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    new-instance v6, LF7;

    const/16 v7, 0xf

    invoke-direct {v6, v7}, LF7;-><init>(I)V

    const/16 v7, 0x1f

    invoke-static {v4, v6, v7}, LP4;->I([Ljava/lang/Object;Lfj;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x29

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    const-wide v4, -0x1f2fdfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    const-wide v3, -0x1f28afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->printListener:Lfj;

    if-eqz v2, :cond_3

    invoke-interface {v2, v1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$15$lambda$14$lambda$13$lambda$12(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-wide v0, -0x1f25bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object p0
.end method

.method private static final register$lambda$17(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1f292fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide v1, -0x1f294fffff835L

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
    sget-object p0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    new-instance v2, Lo8;

    const/4 v4, 0x2

    invoke-direct {v2, v1, v0, v4}, Lo8;-><init>(Ljava/lang/String;II)V

    invoke-direct {p0, v2}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->runOnUiThread(LUi;)V

    return v3
.end method

.method private static final register$lambda$17$lambda$16(Ljava/lang/String;I)LTC;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentContext:Landroid/content/Context;

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_1
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$18(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1f295fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    const-wide v2, -0x1f297fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-wide v3, -0x1f2a1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_0
    invoke-virtual {v0, v2, p0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-wide v0, -0x1f2a5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_2
    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    const-wide v1, -0x1f2affffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_3
    sget-object v1, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {v1, v0, p0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$19(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1f2b3fffff835L

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

.method private static final register$lambda$20(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f2b5fffff835L

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

.method private static final register$lambda$23(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1f2b7fffff835L

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

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    new-instance v3, Lj8;

    const/16 v4, 0xb

    invoke-direct {v3, p0, v0, v4}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-direct {v1, v3}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->runOnUiThread(LUi;)V

    return v2
.end method

.method private static final register$lambda$23$lambda$22(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0xc

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$23$lambda$22$lambda$21(Lparty/iroiro/luajava/Lua;I)LTC;
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

.method private static final register$lambda$27(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1f2b9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v0

    double-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return v4

    :cond_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v2

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->mainHandler:Landroid/os/Handler;

    new-instance v5, Lm8;

    const/4 v6, 0x2

    invoke-direct {v5, p0, v2, v6}, Lm8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v3, v5, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return v4
.end method

.method private static final register$lambda$27$lambda$26(Lparty/iroiro/luajava/Lua;I)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaUiScheduler;->INSTANCE:Lio/github/cherrywechat/lua/LuaUiScheduler;

    new-instance v1, Lj8;

    const/16 v2, 0xa

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, v1}, Lio/github/cherrywechat/lua/LuaUiScheduler;->runOnUiThread(LUi;)V

    return-void
.end method

.method private static final register$lambda$27$lambda$26$lambda$25(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0x9

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$27$lambda$26$lambda$25$lambda$24(Lparty/iroiro/luajava/Lua;I)LTC;
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

.method private static final register$lambda$28(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f2bbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentContext:Landroid/content/Context;

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

.method private static final register$lambda$29(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1f2bdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentActivity:Landroid/app/Activity;

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$3(Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x1f3d3fffff835L

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

    move-result-object p0

    const-wide v2, -0x1f3d5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {v0, p0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->print(Ljava/lang/String;)V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->printListener:Lfj;

    if-eqz v0, :cond_3

    invoke-interface {v0, p0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p0, v0

    sget-object v2, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    const-wide v3, -0x1f3e1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x1f3ebfffff835L

    invoke-static {v4, v5, v0, p0}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->e$default(Lio/github/cherrywechat/lua/dev/LogInterceptor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_3
    :goto_1
    return v1
.end method

.method private static final register$lambda$4(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1f3fafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    const-wide v2, -0x1f3fcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-wide v3, -0x1f386fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_0
    invoke-virtual {v0, v2, p0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-wide v0, -0x1f38afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_2
    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    const-wide v1, -0x1f394fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_3
    sget-object v1, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {v1, v0, p0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$5(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1f398fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-wide v0, -0x1f39afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    const-wide v1, -0x1f39efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$6(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1f3a8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-wide v0, -0x1f3aafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    const-wide v1, -0x1f3aefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$7(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1f3b8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-wide v0, -0x1f3bafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    const-wide v1, -0x1f3befffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final register$lambda$8(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1f248fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-wide v0, -0x1f24afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_0
    move-object v2, p0

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    const-wide v3, -0x1f24efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->e$default(Lio/github/cherrywechat/lua/dev/LogInterceptor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    const/4 p0, 0x0

    return p0
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

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$29(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic t(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$4(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic u(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$5(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic v(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$23$lambda$22$lambda$21(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$15$lambda$14$lambda$13$lambda$12(Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$17(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic y(ILjava/lang/String;)LTC;
    .locals 0

    invoke-static {p1, p0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->register$lambda$10$lambda$9(Ljava/lang/String;I)LTC;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getCurrentActivity()Landroid/app/Activity;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentActivity:Landroid/app/Activity;

    return-object v0
.end method

.method public final getCurrentContext()Landroid/content/Context;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentContext:Landroid/content/Context;

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

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->printListener:Lfj;

    return-object v0
.end method

.method public final register(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    const-wide v0, -0x1f49ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lv8;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f4a3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    new-instance v0, Lu8;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lu8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f4a9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    new-instance v0, Lu8;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lu8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f4b0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    new-instance v0, Lu8;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lu8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f4b4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    new-instance v0, Lu8;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lu8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f4b9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    new-instance v0, Lu8;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lu8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f4befffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    new-instance v0, Lu8;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lu8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f343fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    new-instance v0, Lv8;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f348fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    new-instance v0, Lv8;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f34efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    const-wide v0, -0x1f353fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->getGlobal(Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->isNil(I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lv8;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f35afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f360fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f364fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/4 v2, 0x6

    invoke-direct {v0, v2}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f36afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lu8;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, Lu8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f36ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lu8;

    const/16 v2, 0x15

    invoke-direct {v0, v2}, Lu8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f37dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lu8;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Lu8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f309fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lu8;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Lu8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f314fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v0, -0x1f320fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1f330fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final setCurrentActivity(Landroid/app/Activity;)V
    .locals 0

    sput-object p1, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentActivity:Landroid/app/Activity;

    return-void
.end method

.method public final setCurrentContext(Landroid/content/Context;)V
    .locals 0

    sput-object p1, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->currentContext:Landroid/content/Context;

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

    sput-object p1, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->printListener:Lfj;

    return-void
.end method
