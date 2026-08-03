.class public final Lio/github/cherrywechat/lua/api/CherryXposedAPI;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;,
        Lio/github/cherrywechat/lua/api/CherryXposedAPI$WhenMappings;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

.field private static final TAG:Ljava/lang/String;

.field private static final activeHooks:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lde/robv/android/xposed/XC_MethodHook$Unhook;",
            ">;"
        }
    .end annotation
.end field

.field private static final classLoaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation
.end field

.field private static hookCounter:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x1016ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->classLoaders:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic A(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerClassAPI$lambda$20(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic B(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerClassAPI$lambda$13(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic C(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$35(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic D(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerReflectionAPI$lambda$55(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic E(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerMethodAPI$lambda$22(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic F(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookAPI$lambda$4(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic G(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$38(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic H(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerMethodAPI$lambda$23(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic I(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerConstructorAPI$lambda$48(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic J(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->pushMethodParam$lambda$76(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic K(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerClassAPI$lambda$18(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic L(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookAPI$lambda$11(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic M(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerClassAPI$lambda$12(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic N(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$42(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic O(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookManagementAPI$lambda$63(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic P(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookAPI$lambda$2(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic Q(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerClassAPI$lambda$16(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic R(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$37(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic S(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerReflectionAPI$lambda$56(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic T(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->pushMethodParam$lambda$74(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic U(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerReflectionAPI$lambda$49(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic V(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$39(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic W(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookAPI$lambda$8(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic X(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookAPI$lambda$1(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic Y(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerMethodAPI$lambda$29(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic Z(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$33(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerReflectionAPI$lambda$54(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic a0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$31(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$pushMethodParam(Lio/github/cherrywechat/lua/api/CherryXposedAPI;Lparty/iroiro/luajava/Lua;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->pushMethodParam(Lparty/iroiro/luajava/Lua;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    return-void
.end method

.method public static synthetic b(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerReflectionAPI$lambda$57(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic b0(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$40(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerClassAPI$lambda$15(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final createMethodCallback(Lparty/iroiro/luajava/Lua;IIIZ)Lde/robv/android/xposed/XC_MethodHook;
    .locals 6

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createMethodCallback$1;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v2, p4

    move v1, p5

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createMethodCallback$1;-><init>(ZILparty/iroiro/luajava/Lua;II)V

    return-object v0
.end method

.method private final createReplaceCallback(Lparty/iroiro/luajava/Lua;I)Lde/robv/android/xposed/XC_MethodReplacement;
    .locals 1

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createReplaceCallback$1;

    invoke-direct {v0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$createReplaceCallback$1;-><init>(Lparty/iroiro/luajava/Lua;I)V

    return-object v0
.end method

.method public static synthetic d(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerConstructorAPI$lambda$44(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final doHook(Lparty/iroiro/luajava/Lua;ILio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;)Ljava/lang/String;
    .locals 14

    move/from16 v0, p2

    const-wide v1, -0x119e7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    const/4 v1, -0x1

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {p1, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v4, -0x119edfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v0, v4}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const/4 v5, 0x0

    if-eqz v2, :cond_d

    if-nez v4, :cond_0

    goto/16 :goto_b

    :cond_0
    const-wide v6, -0x119a8fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p1, v0, v6}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->isNil(I)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-direct {p0, p1, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->readStringArray(Lparty/iroiro/luajava/Lua;I)Ljava/util/List;

    move-result-object v6

    goto :goto_0

    :cond_1
    move-object v6, v5

    :goto_0
    invoke-interface {p1, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v7, -0x119affffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v0, v7}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v7

    move v10, v7

    goto :goto_1

    :cond_2
    invoke-interface {p1, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    move v10, v1

    :goto_1
    const-wide v7, -0x119b6fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v0, v7}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v7

    move v11, v7

    goto :goto_2

    :cond_3
    invoke-interface {p1, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    move v11, v1

    :goto_2
    const-wide v7, -0x119bcfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v0, v7}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v1

    :goto_3
    move v12, v1

    goto :goto_4

    :cond_4
    invoke-interface {p1, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    goto :goto_3

    :goto_4
    invoke-direct {p0, v2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_5

    const-wide v0, -0x11844fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x11854fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object v5

    :cond_5
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryXposedAPI$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v1, v1, v7

    const/4 v7, 0x0

    if-ne v1, v3, :cond_6

    invoke-direct {p0, p1, v12}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->createReplaceCallback(Lparty/iroiro/luajava/Lua;I)Lde/robv/android/xposed/XC_MethodReplacement;

    move-result-object p1

    goto :goto_7

    :cond_6
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->REPLACE:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    move-object/from16 v8, p3

    if-ne v8, v1, :cond_7

    move v13, v3

    :goto_5
    move-object v8, p0

    move-object v9, p1

    goto :goto_6

    :cond_7
    move v13, v7

    goto :goto_5

    :goto_6
    invoke-direct/range {v8 .. v13}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->createMethodCallback(Lparty/iroiro/luajava/Lua;IIIZ)Lde/robv/android/xposed/XC_MethodHook;

    move-result-object p1

    :goto_7
    if-eqz v6, :cond_9

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v6, v3}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    sget-object v9, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v9, v6}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_8
    new-array v3, v7, [Ljava/lang/Class;

    invoke-interface {v1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Class;

    array-length v3, v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Class;

    invoke-static {v0, v4, v1}, Lde/robv/android/xposed/XposedHelpers;->findMethodExact(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p1

    goto :goto_a

    :cond_9
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-wide v9, -0x11866fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v0

    :goto_9
    if-ge v7, v3, :cond_b

    aget-object v6, v0, v7

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_b
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    const-wide v0, -0x1187efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1180efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object v5

    :cond_c
    invoke-static {v1}, Lra;->h0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Member;

    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p1

    :goto_a
    invoke-direct {p0, v2, v4}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->generateHookId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide v1, -0x11821fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x11831fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1183afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-wide v0, -0x1183ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x118cffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object v5

    :cond_d
    :goto_b
    const-wide v0, -0x119f4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x11984fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object v5
.end method

.method private final doHookConstructor(Lparty/iroiro/luajava/Lua;I)Ljava/lang/String;
    .locals 12

    const-wide v0, -0x11898fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const-wide p1, -0x1189efffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x118aefffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-object v3

    :cond_0
    const-wide v4, -0x10754fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v4}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->isNil(I)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-direct {p0, p1, v0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->readStringArray(Lparty/iroiro/luajava/Lua;I)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v5, -0x1075bfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, p2, v5}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v5

    move v8, v5

    goto :goto_1

    :cond_2
    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    move v8, v0

    :goto_1
    const-wide v5, -0x10762fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, p2, v5}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v0

    :goto_2
    move v9, v0

    goto :goto_3

    :cond_3
    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    goto :goto_2

    :goto_3
    invoke-direct {p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    if-nez p2, :cond_4

    return-object v3

    :cond_4
    const/4 v10, -0x1

    const/4 v11, 0x0

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v6 .. v11}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->createMethodCallback(Lparty/iroiro/luajava/Lua;IIIZ)Lde/robv/android/xposed/XC_MethodHook;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz v4, :cond_6

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v4, v5}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v7, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v7, v5}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    new-array v0, v0, [Ljava/lang/Class;

    invoke-interface {v2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    invoke-static {p2, v0}, Lde/robv/android/xposed/XposedHelpers;->findConstructorExact(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2

    invoke-static {p2, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p1

    goto :goto_5

    :cond_6
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p2

    array-length v2, p2

    if-nez v2, :cond_7

    return-object v3

    :cond_7
    array-length v2, p2

    if-eqz v2, :cond_8

    aget-object p2, p2, v0

    invoke-static {p2, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p1

    :goto_5
    const-wide v4, -0x10768fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v1, p2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->generateHookId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :cond_8
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "Array is empty."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-wide p1, -0x1076ffffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x1077ffffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-object v3
.end method

.method private final doSimpleHook(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;)Ljava/lang/String;
    .locals 13

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    if-nez v6, :cond_0

    return-object v7

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p1, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_1

    return-object v7

    :cond_1
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v4

    const/4 v5, 0x4

    const/4 v9, 0x0

    const/4 v10, 0x3

    if-lt v4, v5, :cond_2

    invoke-interface {p1, v10}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    move v2, v9

    :goto_0
    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    move v5, v10

    :goto_1
    invoke-interface {p1, v5}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v4

    if-nez v4, :cond_4

    return-object v7

    :cond_4
    if-eqz v2, :cond_5

    invoke-direct {p0, p1, v10}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->readStringArray(Lparty/iroiro/luajava/Lua;I)Ljava/util/List;

    move-result-object v2

    move-object v11, v2

    goto :goto_2

    :cond_5
    move-object v11, v7

    :goto_2
    invoke-interface {p1, v5}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v2

    invoke-direct {p0, v6}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    if-nez v12, :cond_6

    return-object v7

    :cond_6
    sget-object v4, Lio/github/cherrywechat/lua/api/CherryXposedAPI$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    if-eq v4, v3, :cond_8

    if-eq v4, v10, :cond_7

    return-object v7

    :cond_7
    const/4 v4, -0x1

    const/4 v5, 0x0

    move v3, v2

    const/4 v2, -0x1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->createMethodCallback(Lparty/iroiro/luajava/Lua;IIIZ)Lde/robv/android/xposed/XC_MethodHook;

    move-result-object v1

    goto :goto_3

    :cond_8
    move v3, v2

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v3, -0x1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->createMethodCallback(Lparty/iroiro/luajava/Lua;IIIZ)Lde/robv/android/xposed/XC_MethodHook;

    move-result-object v1

    :goto_3
    if-eqz v11, :cond_a

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v11, v3}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v5, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v5, v4}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    new-array v3, v9, [Ljava/lang/Class;

    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Class;

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Class;

    invoke-static {v12, v8, v2}, Lde/robv/android/xposed/XposedHelpers;->findMethodExact(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v2, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object v1

    goto :goto_6

    :cond_a
    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    const-wide v3, -0x118ddfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    array-length v4, v2

    :goto_5
    if-ge v9, v4, :cond_c

    aget-object v5, v2, v9

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v8}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_c
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    return-object v7

    :cond_d
    invoke-static {v3}, Lra;->h0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Member;

    invoke-static {v2, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object v1

    :goto_6
    invoke-direct {p0, v6, v8}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->generateHookId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    const-wide v1, -0x118f5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x11885fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    return-object v7
.end method

.method public static synthetic e(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->pushMethodParam$lambda$75(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookAPI$lambda$0(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final findClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->classLoaders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ClassLoader;

    :try_start_0
    invoke-static {p1, v1}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    :try_start_1
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public static synthetic g(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$30(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final generateHookId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x23

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-wide p1, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->hookCounter:J

    const-wide/16 v1, 0x1

    add-long/2addr p1, v1

    sput-wide p1, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->hookCounter:J

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getArgsFromStack(Lparty/iroiro/luajava/Lua;I)[Ljava/lang/Object;
    .locals 4

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    sub-int/2addr v0, p2

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-lez v0, :cond_1

    new-array v2, v0, [Ljava/lang/Object;

    :goto_0
    if-ge v1, v0, :cond_0

    add-int v3, p2, v1

    invoke-interface {p1, v3}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v2

    :cond_1
    new-array p1, v1, [Ljava/lang/Object;

    return-object p1
.end method

.method private final getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "I)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/Class;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/Class;

    return-object p1

    :cond_0
    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final getParamTypesFromStack(Lparty/iroiro/luajava/Lua;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "I)",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v1

    if-gt p2, v1, :cond_2

    :goto_0
    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Class;

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_1

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0, v2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    if-eq p2, v1, :cond_2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static synthetic h(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$34(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic i(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerReflectionAPI$lambda$58(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic j(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerReflectionAPI$lambda$50(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic k(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerConstructorAPI$lambda$45(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic l(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerReflectionAPI$lambda$53(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic m(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerClassAPI$lambda$14(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic n(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerConstructorAPI$lambda$47(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerMethodAPI$lambda$24(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic p(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$36(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final pushMethodParam(Lparty/iroiro/luajava/Lua;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    iget-object v0, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v2, -0x2

    if-eqz v0, :cond_0

    sget-object v3, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, v0, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const-wide v3, -0x10719fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    :cond_0
    iget-object v0, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-eqz v0, :cond_1

    array-length v0, v0

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    iget-object v0, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-eqz v0, :cond_3

    array-length v3, v0

    move v4, v1

    :goto_1
    if-ge v1, v3, :cond_3

    aget-object v5, v0, v1

    add-int/lit8 v4, v4, 0x1

    if-eqz v5, :cond_2

    sget-object v6, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, v5, v6}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_2
    invoke-interface {p1, v2, v4}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const-wide v0, -0x10724fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const-wide v0, -0x10729fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    :cond_4
    iget-object v0, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const-wide v0, -0x10730fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Ld9;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Ld9;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x10737fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Ld9;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Ld9;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x107c1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Ld9;

    const/4 v1, 0x2

    invoke-direct {v0, p2, v1}, Ld9;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x107c8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v2, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final pushMethodParam$lambda$74(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x10169fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final pushMethodParam$lambda$75(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x1016bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v0

    double-to-int v0, v0

    const/4 v1, 0x2

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    if-ltz v0, :cond_0

    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-eqz p0, :cond_0

    array-length v1, p0

    if-ge v0, v1, :cond_0

    aput-object p1, p0, v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final pushMethodParam$lambda$76(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1016dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v1

    double-to-int v1, v1

    if-ltz v1, :cond_0

    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-eqz p0, :cond_0

    array-length v2, p0

    if-ge v1, v2, :cond_0

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    aget-object p0, p0, v1

    invoke-direct {v2, p1, p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->pushResult(Lparty/iroiro/luajava/Lua;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    return v0
.end method

.method private final pushResult(Lparty/iroiro/luajava/Lua;Ljava/lang/Object;)V
    .locals 1

    if-eqz p2, :cond_0

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, p2, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    return-void
.end method

.method public static synthetic q(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookManagementAPI$lambda$64(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic r(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookAPI$lambda$3(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final readStringArray(Lparty/iroiro/luajava/Lua;I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "I)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p2, -0x2

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->next(I)I

    move-result p2

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    const/4 p2, -0x1

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    goto :goto_0

    :cond_1
    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object v0
.end method

.method private final registerClassAPI(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    new-instance v0, Lc9;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x11b0bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11b15fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11b27fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11b33fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/4 v2, 0x6

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11bc0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11bcefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11bdcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11be7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerClassAPI$lambda$12(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1058efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v2, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    return v0
.end method

.method private static final registerClassAPI$lambda$13(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x10590fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    :try_start_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v2, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_1
    return v0
.end method

.method private static final registerClassAPI$lambda$14(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x10592fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    :try_start_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v3, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    move v2, v0

    :catch_0
    :cond_1
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final registerClassAPI$lambda$15(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x10594fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    return v0
.end method

.method private static final registerClassAPI$lambda$16(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x10596fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_1
    return v1
.end method

.method private static final registerClassAPI$lambda$18(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x10598fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    array-length v3, v0

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    array-length v3, v0

    move v4, v2

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v5, v0, v2

    add-int/2addr v4, v1

    sget-object v6, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v5, v6}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const/4 v5, -0x2

    invoke-interface {p0, v5, v4}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0, v2, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    :cond_1
    return v1
.end method

.method private static final registerClassAPI$lambda$20(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1059afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0

    :cond_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v4, 0x2

    invoke-direct {v3, p0, v4}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    :cond_1
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method private static final registerClassAPI$lambda$21(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1059cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v0, p0, v3}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v0

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v1
.end method

.method private final registerConstructorAPI(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    new-instance v0, Lb9;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x11ae1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11aedfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11afdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11a96fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11aa6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerConstructorAPI$lambda$43(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x10334fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    const/4 v4, 0x2

    :try_start_0
    invoke-direct {v0, p0, v4}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getArgsFromStack(Lparty/iroiro/luajava/Lua;I)[Ljava/lang/Object;

    move-result-object v0

    array-length v5, v0

    if-nez v5, :cond_1

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {v2, v0}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    array-length v3, v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :goto_1
    const-wide v1, -0x10336fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x103c6fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x103d8fffff835L

    invoke-static {v2, v3, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v4
.end method

.method private static final registerConstructorAPI$lambda$44(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x103e0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    const/4 v4, 0x2

    :try_start_0
    invoke-direct {v0, p0, v4}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getParamTypesFromStack(Lparty/iroiro/luajava/Lua;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const-wide v4, -0x103e2fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    array-length v2, v0

    if-nez v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    aget-object v0, v0, v3

    goto :goto_0

    :cond_2
    new-array v3, v3, [Ljava/lang/Class;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    array-length v3, v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    invoke-static {v2, v0}, Lde/robv/android/xposed/XposedHelpers;->findConstructorExact(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return v1

    :cond_3
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    const-wide v2, -0x103fffffff835L

    const-wide v4, -0x1038ffffff835L

    invoke-static {v2, v3, v4, v5, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    return v1
.end method

.method private static final registerConstructorAPI$lambda$45(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x103a5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 v3, 0x2

    :try_start_0
    invoke-direct {v0, p0, v3}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getArgsFromStack(Lparty/iroiro/luajava/Lua;I)[Ljava/lang/Object;

    move-result-object v0

    array-length v3, v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Lde/robv/android/xposed/XposedHelpers;->findConstructorBestMatch(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v2, -0x103a7fffff835L

    const-wide v4, -0x103b7fffff835L

    invoke-static {v2, v3, v4, v5, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_0
    return v1
.end method

.method private static final registerConstructorAPI$lambda$47(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x10256fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    array-length v3, v0

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    array-length v3, v0

    move v4, v2

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v5, v0, v2

    add-int/2addr v4, v1

    sget-object v6, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v5, v6}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const/4 v5, -0x2

    invoke-interface {p0, v5, v4}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private static final registerConstructorAPI$lambda$48(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x10258fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/Constructor;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Constructor;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    :try_start_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getArgsFromStack(Lparty/iroiro/luajava/Lua;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-wide v1, -0x1025afffff835L

    const-wide v3, -0x1026afffff835L

    invoke-static {v1, v2, v3, v4, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_1
    return v0
.end method

.method private final registerFieldAPI(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    new-instance v0, Lc9;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x11a4bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x15

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11a54fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11a5dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11a6cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11a7bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11a07fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11a13fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11a23fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x1d

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11a33fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11ac0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11acdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11ad7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerFieldAPI$lambda$30(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1048cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    :try_start_0
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v2, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->pushResult(Lparty/iroiro/luajava/Lua;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v1, -0x1048efffff835L

    const-wide v3, -0x1049efffff835L

    invoke-static {v1, v2, v3, v4, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_0
    return v0
.end method

.method private static final registerFieldAPI$lambda$31(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x104affffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    const/4 v4, 0x3

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v4

    :try_start_0
    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v3, -0x104b1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x10341fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
.end method

.method private static final registerFieldAPI$lambda$32(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x10352fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    const/4 v4, 0x2

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    return v3

    :cond_1
    :try_start_0
    invoke-static {v2, v4}, Lde/robv/android/xposed/XposedHelpers;->getStaticObjectField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->pushResult(Lparty/iroiro/luajava/Lua;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v2, -0x10354fffff835L

    const-wide v4, -0x10364fffff835L

    invoke-static {v2, v3, v4, v5, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_0
    return v1
.end method

.method private static final registerFieldAPI$lambda$33(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1037bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    const/4 v4, 0x3

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v4

    :try_start_0
    invoke-static {v0, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->setStaticObjectField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v3, -0x1037dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1030dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v1
.end method

.method private static final registerFieldAPI$lambda$34(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x10324fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    :try_start_0
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    move-result v1

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    :goto_0
    return v0
.end method

.method private static final registerFieldAPI$lambda$35(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x10326fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    const/4 v4, 0x3

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v4

    double-to-int v4, v4

    :try_start_0
    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
.end method

.method private static final registerFieldAPI$lambda$36(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x10328fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    :try_start_0
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedHelpers;->getBooleanField(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
.end method

.method private static final registerFieldAPI$lambda$37(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1032afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    const/4 v4, 0x3

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toBoolean(I)Z

    move-result v4

    :try_start_0
    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->setBooleanField(Ljava/lang/Object;Ljava/lang/String;Z)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
.end method

.method private static final registerFieldAPI$lambda$38(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1032cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    :try_start_0
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedHelpers;->getLongField(Ljava/lang/Object;Ljava/lang/String;)J

    move-result-wide v1

    long-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    :goto_0
    return v0
.end method

.method private static final registerFieldAPI$lambda$39(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1032efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    const/4 v4, 0x3

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v4

    double-to-long v4, v4

    :try_start_0
    invoke-static {v1, v3, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->setLongField(Ljava/lang/Object;Ljava/lang/String;J)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
.end method

.method private static final registerFieldAPI$lambda$40(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x10330fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    :try_start_0
    invoke-static {v0, v3}, Lde/robv/android/xposed/XposedHelpers;->findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    return v1
.end method

.method private static final registerFieldAPI$lambda$42(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x10332fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v3, v0

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    array-length v3, v0

    move v4, v2

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v5, v0, v2

    add-int/2addr v4, v1

    sget-object v6, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v5, v6}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const/4 v5, -0x2

    invoke-interface {p0, v5, v4}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private final registerHookAPI(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    new-instance v0, Lc9;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x11cb2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0xb

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11cb7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11b42fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0xd

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11b4cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11b58fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11b68fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/16 v2, 0x11

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11b77fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerHookAPI$lambda$0(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x10793fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    const/4 v2, 0x2

    if-nez v1, :cond_0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x10795fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v2

    :cond_0
    :try_start_0
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->NORMAL:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    invoke-direct {v1, p0, v0, v3}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->doHook(Lparty/iroiro/luajava/Lua;ILio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x107b5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :goto_0
    const-wide v3, -0x10641fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x10651fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x1065cfffff835L

    invoke-static {v3, v4, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v2
.end method

.method private static final registerHookAPI$lambda$1(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x10669fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->BEFORE:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->doSimpleHook(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v0, -0x1066bfffff835L

    const-wide v2, -0x1067bfffff835L

    invoke-static {v0, v1, v2, v3, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final registerHookAPI$lambda$11(Lparty/iroiro/luajava/Lua;)I
    .locals 12

    const-wide v0, -0x105dbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v4

    if-nez v4, :cond_1

    return v2

    :cond_1
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v7

    :try_start_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v3, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    return v0

    :catch_0
    move-object v6, p0

    goto :goto_2

    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v3

    new-instance v11, Lx;

    const/4 v5, 0x1

    invoke-direct {v11, v5, v3}, Lx;-><init>(ILjava/lang/Object;)V

    :goto_0
    invoke-virtual {v11}, Lx;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v11}, Lx;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Constructor;

    sget-object v5, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v9, -0x1

    const/4 v10, 0x0

    const/4 v8, -0x1

    move-object v6, p0

    :try_start_1
    invoke-direct/range {v5 .. v10}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->createMethodCallback(Lparty/iroiro/luajava/Lua;IIIZ)Lde/robv/android/xposed/XC_MethodHook;

    move-result-object p0

    invoke-static {v3, p0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p0

    const-wide v8, -0x105ddfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v1, v3}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->generateHookId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v5, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p0, v6

    goto :goto_0

    :cond_3
    move-object v6, p0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result p0

    invoke-interface {v6, p0, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v3, v2, 0x1

    if-ltz v2, :cond_4

    check-cast v1, Ljava/lang/String;

    invoke-interface {v6, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 v1, -0x2

    invoke-interface {v6, v1, v3}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    move v2, v3

    goto :goto_1

    :cond_4
    invoke-static {}, Lsa;->c0()V

    const/4 p0, 0x0

    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_2
    const-wide v1, -0x105e4fffff835L

    const-wide v3, -0x105f4fffff835L

    invoke-static {v1, v2, v3, v4, v6}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :cond_5
    return v0
.end method

.method private static final registerHookAPI$lambda$2(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1060cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->AFTER:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->doSimpleHook(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v0, -0x1060efffff835L

    const-wide v2, -0x1061efffff835L

    invoke-static {v0, v1, v2, v3, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final registerHookAPI$lambda$3(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1062efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    const/4 v2, 0x2

    if-nez v1, :cond_0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x10630fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v2

    :cond_0
    :try_start_0
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->REPLACE:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    invoke-direct {v1, p0, v0, v3}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->doHook(Lparty/iroiro/luajava/Lua;ILio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x106d7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :goto_0
    const-wide v3, -0x106e3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x106f3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x10685fffff835L

    invoke-static {v3, v4, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v2
.end method

.method private static final registerHookAPI$lambda$4(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x10699fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    const/4 v2, 0x2

    if-nez v1, :cond_0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x1069bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v2

    :cond_0
    :try_start_0
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->doHookConstructor(Lparty/iroiro/luajava/Lua;I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x10546fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :goto_0
    const-wide v3, -0x1055efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1056efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x10504fffff835L

    invoke-static {v3, v4, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v2
.end method

.method private static final registerHookAPI$lambda$8(Lparty/iroiro/luajava/Lua;)I
    .locals 13

    const-wide v0, -0x1051cfffff835L

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

    return v2

    :cond_1
    const/4 v4, 0x3

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v5

    if-nez v5, :cond_2

    return v2

    :cond_2
    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v8

    :try_start_0
    sget-object v4, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    invoke-direct {v4, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    return v0

    :catch_0
    move-object v7, p0

    goto/16 :goto_3

    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    const-wide v6, -0x1051efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    array-length v7, v4

    move v9, v2

    :goto_0
    if-ge v9, v7, :cond_5

    aget-object v10, v4, v9

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v6, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_5
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v12, v6

    check-cast v12, Ljava/lang/reflect/Method;

    sget-object v6, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v9, -0x1

    move-object v7, p0

    :try_start_1
    invoke-direct/range {v6 .. v11}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->createMethodCallback(Lparty/iroiro/luajava/Lua;IIIZ)Lde/robv/android/xposed/XC_MethodHook;

    move-result-object p0

    invoke-static {v12, p0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p0

    invoke-direct {v6, v1, v3}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->generateHookId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sget-object v9, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v9, v6, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p0, v7

    goto :goto_1

    :cond_6
    move-object v7, p0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p0

    invoke-interface {v7, p0, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v3, v2, 0x1

    if-ltz v2, :cond_7

    check-cast v1, Ljava/lang/String;

    invoke-interface {v7, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 v1, -0x2

    invoke-interface {v7, v1, v3}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    move v2, v3

    goto :goto_2

    :cond_7
    invoke-static {}, Lsa;->c0()V

    const/4 p0, 0x0

    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_3
    const-wide v1, -0x10536fffff835L

    const-wide v3, -0x105c6fffff835L

    invoke-static {v1, v2, v3, v4, v7}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :cond_8
    return v0
.end method

.method private final registerHookManagementAPI(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    new-instance v0, Lb9;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x11934fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x15

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1193bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x119c5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x119d4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerHookManagementAPI$lambda$59(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x102fefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    const-wide v1, -0x10280fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10290fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_0

    :cond_1
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
.end method

.method private static final registerHookManagementAPI$lambda$61(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1029bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v2, -0x1029dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    const-wide v2, -0x102affffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x102bffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x1014efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    int-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final registerHookManagementAPI$lambda$63(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x10155fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    const-wide v1, -0x10157fffff835L

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

.method private static final registerHookManagementAPI$lambda$64(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x10167fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final registerMethodAPI(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    new-instance v0, Lb9;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x11bf8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11b83fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11b94fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11ba1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x1d

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11bacfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lc9;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lc9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11a40fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerMethodAPI$lambda$22(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1059efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    return v2

    :cond_1
    :try_start_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v5, 0x3

    invoke-direct {v2, p0, v5}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getArgsFromStack(Lparty/iroiro/luajava/Lua;I)[Ljava/lang/Object;

    move-result-object v5

    array-length v6, v5

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v2, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->pushResult(Lparty/iroiro/luajava/Lua;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    const-wide v1, -0x105a0fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x105b0fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x10443fffff835L

    invoke-static {v4, v5, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v3
.end method

.method private static final registerMethodAPI$lambda$23(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1044bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    const/4 v4, 0x2

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    return v3

    :cond_1
    const/4 v3, 0x3

    :try_start_0
    invoke-direct {v0, p0, v3}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getArgsFromStack(Lparty/iroiro/luajava/Lua;I)[Ljava/lang/Object;

    move-result-object v3

    array-length v6, v3

    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v5, v3}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->pushResult(Lparty/iroiro/luajava/Lua;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    const-wide v1, -0x1044dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x1045dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x10476fffff835L

    invoke-static {v2, v3, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v4
.end method

.method private static final registerMethodAPI$lambda$24(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1047efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Method;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v2

    :try_start_0
    sget-object v3, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v4, 0x3

    invoke-direct {v3, p0, v4}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getArgsFromStack(Lparty/iroiro/luajava/Lua;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    array-length v5, v4

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v3, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->pushResult(Lparty/iroiro/luajava/Lua;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-wide v1, -0x10400fffff835L

    const-wide v3, -0x10410fffff835L

    invoke-static {v1, v2, v3, v4, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_1
    return v0
.end method

.method private static final registerMethodAPI$lambda$26(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x10423fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    const/4 v4, 0x2

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    return v3

    :cond_1
    const/4 v5, 0x3

    :try_start_0
    invoke-direct {v0, p0, v5}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getParamTypesFromStack(Lparty/iroiro/luajava/Lua;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-wide v5, -0x10425fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    array-length v2, v0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v5, v0, v3

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    goto :goto_1

    :cond_4
    new-array v3, v3, [Ljava/lang/Class;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    array-length v3, v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    invoke-static {v2, v4, v0}, Lde/robv/android/xposed/XposedHelpers;->findMethodExact(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    :goto_1
    if-eqz v5, :cond_5

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v5, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_2

    :cond_5
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-wide v2, -0x1043dfffff835L

    const-wide v4, -0x104cdfffff835L

    invoke-static {v2, v3, v4, v5, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_2
    return v1
.end method

.method private static final registerMethodAPI$lambda$27(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x104defffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    const/4 v4, 0x2

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    return v3

    :cond_1
    const/4 v3, 0x3

    :try_start_0
    invoke-direct {v0, p0, v3}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getArgsFromStack(Lparty/iroiro/luajava/Lua;I)[Ljava/lang/Object;

    move-result-object v0

    array-length v3, v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v4, v0}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v0

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v2, -0x104e0fffff835L

    const-wide v4, -0x104f0fffff835L

    invoke-static {v2, v3, v4, v5, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_0
    return v1
.end method

.method private static final registerMethodAPI$lambda$29(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x1048afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryXposedAPI;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->getClassFromArg(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v3, v0

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    array-length v3, v0

    move v4, v2

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v5, v0, v2

    add-int/2addr v4, v1

    sget-object v6, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v5, v6}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const/4 v5, -0x2

    invoke-interface {p0, v5, v4}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private final registerReflectionAPI(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    new-instance v0, Le9;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x11ab8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11946fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11953fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11965fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11973fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11900fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x11

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11912fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11916fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lb9;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, Lb9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x11925fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final registerReflectionAPI$lambda$49(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x10202fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/AccessibleObject;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/AccessibleObject;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    const/4 v3, 0x2

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->toBoolean(I)Z

    move-result v3

    :try_start_0
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_1
    return v0
.end method

.method private static final registerReflectionAPI$lambda$50(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x10204fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v1

    goto :goto_0

    :cond_0
    instance-of v2, v1, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/reflect/Field;

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    goto :goto_0

    :cond_1
    instance-of v2, v1, Ljava/lang/reflect/Constructor;

    if-eqz v2, :cond_2

    check-cast v1, Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v1

    goto :goto_0

    :cond_2
    instance-of v2, v1, Ljava/lang/Class;

    if-eqz v2, :cond_3

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    :goto_0
    const/16 v2, 0xa

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v2, -0x10206fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v4, -0x1020ffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    move-result v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v4, -0x10219fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v4, -0x10225fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v4, -0x1022efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v4, -0x10236fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    move-result v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v4, -0x102c1fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isSynchronized(I)Z

    move-result v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v4, -0x102cafffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isVolatile(I)Z

    move-result v2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v4, -0x102d9fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v1, -0x102e4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v3, v1}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return v0

    :cond_3
    return v3
.end method

.method private static final registerReflectionAPI$lambda$52(Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x102f0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v2, v1, Ljava/lang/reflect/Constructor;

    if-eqz v2, :cond_2

    check-cast v1, Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    :goto_0
    array-length v2, v1

    invoke-interface {p0, v2, v3}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    array-length v2, v1

    move v4, v3

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v5, v1, v3

    add-int/2addr v4, v0

    sget-object v6, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v5, v6}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const/4 v5, -0x2

    invoke-interface {p0, v5, v4}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return v0

    :cond_2
    return v3
.end method

.method private static final registerReflectionAPI$lambda$53(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x102f2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Method;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return v0
.end method

.method private static final registerReflectionAPI$lambda$54(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x102f4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Field;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return v0
.end method

.method private static final registerReflectionAPI$lambda$55(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x102f6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v2, v1, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/reflect/Field;

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v2, v1, Ljava/lang/reflect/Constructor;

    if-eqz v2, :cond_2

    check-cast v1, Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    :goto_0
    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static final registerReflectionAPI$lambda$56(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x102f8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    const/4 p0, 0x0

    return p0
.end method

.method private static final registerReflectionAPI$lambda$57(Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x102fafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->classLoaders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final registerReflectionAPI$lambda$58(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x102fcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/ClassLoader;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/ClassLoader;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->classLoaders:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0
.end method

.method public static synthetic s(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerConstructorAPI$lambda$43(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic t(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookManagementAPI$lambda$61(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic u(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerMethodAPI$lambda$27(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic v(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerReflectionAPI$lambda$52(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic w(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerMethodAPI$lambda$26(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic x(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI$lambda$32(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic y(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerClassAPI$lambda$21(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic z(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookManagementAPI$lambda$59(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final cleanup()V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v1, -0x107cffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    const-wide v0, -0x107e1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x107f1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final register(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V
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

    const-wide v0, -0x11ce6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x11ceafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->classLoaders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 p2, 0x0

    const/16 v1, 0x28

    invoke-interface {p1, p2, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookAPI(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerClassAPI(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerMethodAPI(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerFieldAPI(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerConstructorAPI(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerReflectionAPI(Lparty/iroiro/luajava/Lua;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->registerHookManagementAPI(Lparty/iroiro/luajava/Lua;)V

    const-wide p1, -0x11cf2fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x11c82fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/List;->size()I

    const-wide p1, -0x11ca3fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method
