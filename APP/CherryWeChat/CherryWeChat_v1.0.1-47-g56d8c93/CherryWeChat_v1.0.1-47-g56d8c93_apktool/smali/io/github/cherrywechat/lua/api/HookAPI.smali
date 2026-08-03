.class public final Lio/github/cherrywechat/lua/api/HookAPI;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x10eadfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/HookAPI;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/HookAPI;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->classLoaders:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/HookAPI;->register$lambda$8(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$pushMethodParam(Lio/github/cherrywechat/lua/api/HookAPI;Lparty/iroiro/luajava/Lua;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/lua/api/HookAPI;->pushMethodParam(Lparty/iroiro/luajava/Lua;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    return-void
.end method

.method public static synthetic b(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/HookAPI;->register$lambda$6(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/HookAPI;->register$lambda$7(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/HookAPI;->register$lambda$4(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final doHook(Lparty/iroiro/luajava/Lua;IZ)Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v1, p2

    const-wide v2, -0x1007cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v1, v2}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    const/4 v2, -0x1

    invoke-interface {v4, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v10

    const/4 v3, 0x1

    invoke-interface {v4, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v5, -0x10002fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v1, v5}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {v4, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v4, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const/4 v12, 0x0

    if-eqz v10, :cond_b

    if-nez v11, :cond_0

    goto/16 :goto_8

    :cond_0
    const-wide v5, -0x10038fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v1, v5}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {v4, v2}, Lparty/iroiro/luajava/Lua;->isNil(I)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-interface {v4, v2}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-direct {v0, v4, v2}, Lio/github/cherrywechat/lua/api/HookAPI;->readStringArray(Lparty/iroiro/luajava/Lua;I)Ljava/util/List;

    move-result-object v5

    move-object v13, v5

    goto :goto_0

    :cond_1
    move-object v13, v12

    :goto_0
    invoke-interface {v4, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v5, -0x1003ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v1, v5}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {v4, v2}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v6

    move v7, v6

    goto :goto_1

    :cond_2
    invoke-interface {v4, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    move v7, v2

    :goto_1
    const-wide v8, -0x100c6fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v1, v6}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {v4, v2}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v4}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v6

    move v9, v6

    goto :goto_2

    :cond_3
    invoke-interface {v4, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    move v9, v2

    :goto_2
    const-wide v14, -0x100ccfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v1, v6}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    invoke-interface {v4, v2}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v4}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v2

    :goto_3
    move v6, v2

    goto :goto_4

    :cond_4
    invoke-interface {v4, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    goto :goto_3

    :goto_4
    invoke-direct {v0, v10}, Lio/github/cherrywechat/lua/api/HookAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v14

    if-nez v14, :cond_5

    const-wide v1, -0x100d4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x100dffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    return-object v12

    :cond_5
    move v3, v1

    new-instance v1, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;

    move/from16 v2, p3

    invoke-direct/range {v1 .. v9}, Lio/github/cherrywechat/lua/api/HookAPI$doHook$callback$1;-><init>(ZZLparty/iroiro/luajava/Lua;ZIIZI)V

    const/4 v2, 0x0

    if-eqz v13, :cond_7

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v13, v4}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v6, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    invoke-direct {v6, v5}, Lio/github/cherrywechat/lua/api/HookAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_6
    new-array v2, v2, [Ljava/lang/Class;

    invoke-interface {v3, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Class;

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Class;

    invoke-static {v14, v11, v2}, Lde/robv/android/xposed/XposedHelpers;->findMethodExact(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v2, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object v1

    goto :goto_7

    :cond_7
    invoke-virtual {v14}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    const-wide v4, -0x100f1fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    array-length v5, v3

    :goto_6
    if-ge v2, v5, :cond_9

    aget-object v6, v3, v2

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v11}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_9
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    const-wide v1, -0x10089fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10094fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    return-object v12

    :cond_a
    invoke-static {v4}, Lra;->h0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Member;

    invoke-static {v2, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object v1

    :goto_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x23

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lio/github/cherrywechat/lua/api/HookAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide v3, -0x100a7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x100b2fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x100bbfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    const-wide v1, -0x10f40fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10f4bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    return-object v12

    :cond_b
    :goto_8
    const-wide v1, -0x10009fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10014fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    return-object v12
.end method

.method public static synthetic e(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/HookAPI;->register$lambda$0(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/HookAPI;->register$lambda$5(Lparty/iroiro/luajava/Lua;)I

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

    sget-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->classLoaders:Ljava/util/List;

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

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/HookAPI;->register$lambda$1(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic h(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/HookAPI;->register$lambda$2(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic i(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/HookAPI;->pushMethodParam$lambda$15(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic j(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/HookAPI;->pushMethodParam$lambda$14(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final pushMethodParam(Lparty/iroiro/luajava/Lua;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    iget-object v0, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v2, -0x2

    if-eqz v0, :cond_0

    sget-object v3, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, v0, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const-wide v3, -0x10f59fffff835L

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
    const-wide v0, -0x10f64fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-virtual {p2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const-wide v0, -0x10f69fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    :cond_4
    iget-object v0, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const-wide v0, -0x10f70fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Ld9;

    const/4 v1, 0x3

    invoke-direct {v0, p2, v1}, Ld9;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x10f77fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Ld9;

    const/4 v1, 0x4

    invoke-direct {v0, p2, v1}, Ld9;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x10f01fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v2, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    return-void
.end method

.method private static final pushMethodParam$lambda$14(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x10ea9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final pushMethodParam$lambda$15(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lparty/iroiro/luajava/Lua;)I
    .locals 2

    const-wide v0, -0x10eabfffff835L

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

.method private static final register$lambda$0(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x10f3ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v0, -0x10fc1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v2

    :cond_0
    :try_start_0
    sget-object v1, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    invoke-direct {v1, p0, v0, v3}, Lio/github/cherrywechat/lua/api/HookAPI;->doHook(Lparty/iroiro/luajava/Lua;IZ)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v0, -0x10fe1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :goto_0
    const-wide v4, -0x10fedfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x10ff8fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x10f83fffff835L

    invoke-static {v3, v4, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v2
.end method

.method private static final register$lambda$1(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x10f90fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v0, -0x10f92fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v2

    :cond_0
    :try_start_0
    sget-object v1, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    invoke-direct {v1, p0, v0, v0}, Lio/github/cherrywechat/lua/api/HookAPI;->doHook(Lparty/iroiro/luajava/Lua;IZ)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v0, -0x10fb9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :goto_0
    const-wide v4, -0x10e45fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x10e50fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->push(Z)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x10e62fffff835L

    invoke-static {v3, v4, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v2
.end method

.method private static final register$lambda$2(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x10e76fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    sget-object v3, Lio/github/cherrywechat/lua/api/HookAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    const-wide v1, -0x10e78fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10e03fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_0

    :cond_1
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
.end method

.method private static final register$lambda$4(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x10e0efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v2, -0x10e10fffff835L

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
    sget-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    int-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    const-wide v0, -0x10e22fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10e2dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10e3cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 p0, 0x1

    return p0
.end method

.method private static final register$lambda$5(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x10ec3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v2, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    invoke-direct {v2, v1}, Lio/github/cherrywechat/lua/api/HookAPI;->findClass(Ljava/lang/String;)Ljava/lang/Class;

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

.method private static final register$lambda$6(Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x10ec5fffff835L

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
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v5

    sub-int/2addr v5, v3

    new-array v6, v5, [Ljava/lang/Object;

    :goto_0
    if-ge v2, v5, :cond_2

    add-int/lit8 v7, v2, 0x3

    invoke-interface {p0, v7}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v7

    aput-object v7, v6, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_2
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v4, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_1

    :cond_3
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return v0

    :goto_2
    const-wide v1, -0x10ec7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x10ed2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x10ee5fffff835L

    invoke-static {v4, v5, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v3
.end method

.method private static final register$lambda$7(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x10eedfffff835L

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

    if-eqz v1, :cond_2

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide v1, -0x10eeffffff835L

    const-wide v3, -0x10efafffff835L

    invoke-static {v1, v2, v3, v4, p0}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_0
    return v0
.end method

.method private static final register$lambda$8(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x10e8bfffff835L

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
    const-wide v3, -0x10e8dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x10e98fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    :goto_0
    return v0
.end method


# virtual methods
.method public final addClassLoader(Ljava/lang/ClassLoader;)V
    .locals 2

    const-wide v0, -0x101fcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->classLoaders:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final cleanup()V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v1, -0x10f08fffff835L

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
    sget-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    const-wide v0, -0x10f1afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10f25fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final getActiveHookCount()I
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->activeHooks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    return v0
.end method

.method public final register(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    const-wide v0, -0x10183fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10187fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->getGlobal(Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->isNil(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const/4 v0, 0x0

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    :cond_0
    new-instance v0, Le9;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1018efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10193fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1019ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x101a6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x101b0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0xb

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x101bafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x10045fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Le9;

    const/16 v2, 0xd

    invoke-direct {v0, v2}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1004efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v0, -0x10057fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    const-wide v0, -0x1005efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10069fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final setClassLoaders(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/ClassLoader;",
            ">;)V"
        }
    .end annotation

    const-wide v0, -0x101f4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->classLoaders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
