.class public final Lio/github/cherrywechat/lua/bridge/JavaImporter;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

.field private static final TAG:Ljava/lang/String;

.field private static final classCache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final packageAliases:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-wide v0, -0x13bb8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/bridge/JavaImporter;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/bridge/JavaImporter;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/bridge/JavaImporter;->classCache:Ljava/util/concurrent/ConcurrentHashMap;

    const-wide v0, -0x13a45fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x13a47fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LEt;

    invoke-direct {v2, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0x13a51fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0x13a55fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v3, LEt;

    invoke-direct {v3, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0x13a66fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v4, -0x13a6cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v4, LEt;

    invoke-direct {v4, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0x13a01fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v5, -0x13a06fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v5, LEt;

    invoke-direct {v5, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0x13a18fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v6, -0x13a20fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v6, LEt;

    invoke-direct {v6, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0x13a38fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v7, -0x13a3ffffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v7, LEt;

    invoke-direct {v7, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0x13ad6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v8, -0x13addfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v8, LEt;

    invoke-direct {v8, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0x13aeffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v9, -0x13af7fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v9, LEt;

    invoke-direct {v9, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v0, -0x13a8afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v10, -0x13a91fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v10, LEt;

    invoke-direct {v10, v0, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v2 .. v10}, [LEt;

    move-result-object v0

    invoke-static {v0}, Luq;->L([LEt;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/bridge/JavaImporter;->packageAliases:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->registerLuaJavaNamespace$lambda$9(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->pushClassWrapper$lambda$6(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final boxPrimitive(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-class p1, Ljava/lang/Boolean;

    return-object p1

    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-class p1, Ljava/lang/Byte;

    return-object p1

    :cond_1
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-class p1, Ljava/lang/Character;

    return-object p1

    :cond_2
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-class p1, Ljava/lang/Short;

    return-object p1

    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-class p1, Ljava/lang/Integer;

    return-object p1

    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-class p1, Ljava/lang/Long;

    return-object p1

    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-class p1, Ljava/lang/Float;

    return-object p1

    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-class p1, Ljava/lang/Double;

    :cond_7
    return-object p1
.end method

.method public static synthetic c(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->registerLuaJavaNamespace$lambda$12(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->pushMethodWrapper$lambda$8(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic e(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->register$lambda$0(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->pushClassWrapper$lambda$3(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final findMatchingConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p1

    new-instance v0, Lx;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lx;-><init>(ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, Lx;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lx;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    const-wide v3, -0x13de7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, v2, p2}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->isMatchingSignature([Ljava/lang/Class;[Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    new-instance v0, Lx;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lx;-><init>(ILjava/lang/Object;)V

    :cond_2
    invoke-virtual {v0}, Lx;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Lx;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/Constructor;

    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    const-wide v2, -0x13dfefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, v1, p2}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->isLooseMatchingSignature([Ljava/lang/Class;[Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private final findMatchingMethod(Ljava/util/List;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    const-wide v3, -0x13d95fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, v2, p2}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->isMatchingSignature([Ljava/lang/Class;[Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    const-wide v2, -0x13dacfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, v1, p2}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->isLooseMatchingSignature([Ljava/lang/Class;[Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic g(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->pushClassWrapper$lambda$5(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic h(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->registerLuaJavaNamespace$lambda$11(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic i(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->registerNewFunction$lambda$14(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final isAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->boxPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->boxPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method private final isLooseAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->isAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-class v11, Ljava/lang/Float;

    const-class v12, Ljava/lang/Double;

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v7, Ljava/lang/Byte;

    const-class v8, Ljava/lang/Short;

    const-class v9, Ljava/lang/Integer;

    const-class v10, Ljava/lang/Long;

    filled-new-array/range {v1 .. v12}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LLx;->B([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->boxPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->boxPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-class v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-class p1, Ljava/lang/String;

    invoke-static {p2, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private final isLooseMatchingSignature([Ljava/lang/Class;[Ljava/lang/Class;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    array-length v0, p1

    array-length v1, p2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    array-length v0, p1

    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v3, p1, v1

    aget-object v4, p2, v1

    if-eqz v4, :cond_1

    invoke-direct {p0, v3, v4}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->isLooseAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private final isMatchingSignature([Ljava/lang/Class;[Ljava/lang/Class;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    array-length v0, p1

    array-length v1, p2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    array-length v0, p1

    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v3, p1, v1

    aget-object v4, p2, v1

    if-nez v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    move-result v3

    if-eqz v3, :cond_2

    return v2

    :cond_1
    invoke-direct {p0, v3, v4}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->isAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private final loadClass(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/ClassLoader;",
            ">;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/bridge/JavaImporter;->packageAliases:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    sget-object v0, Lio/github/cherrywechat/lua/bridge/JavaImporter;->classCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const-wide v0, -0x13d00fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, LBz;->J(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-wide p1, -0x13d03fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x13d10fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const/4 p1, 0x0

    return-object p1

    :cond_2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ClassLoader;

    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lio/github/cherrywechat/lua/bridge/JavaImporter;->classCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_3
    :try_start_1
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lio/github/cherrywechat/lua/bridge/JavaImporter;->classCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->tryLoadInnerClass(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Class;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method private final pushClassWrapper(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    new-instance v0, Lbm;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p2}, Lbm;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x13dc1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v2, -0x2

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lbm;

    const/4 v3, 0x1

    invoke-direct {v0, v3, p2}, Lbm;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v3, -0x13dc8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lbm;

    const/4 v3, 0x2

    invoke-direct {v0, v3, p2}, Lbm;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v3, -0x13dd0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, p2, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const-wide v0, -0x13ddbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v2, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->insert(I)V

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->setMetatable(I)V

    return-void
.end method

.method private static final pushClassWrapper$lambda$3(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x13c3efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x2

    :try_start_0
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_0

    add-int/lit8 v6, v5, 0x2

    invoke-interface {p1, v6}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_3

    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v4

    :goto_1
    if-ge v6, v1, :cond_2

    aget-object v7, v3, v6

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    :goto_2
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    new-array v4, v4, [Ljava/lang/Class;

    invoke-interface {v5, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/Class;

    sget-object v5, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-direct {v5, p0, v4}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->findMatchingConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v4, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return v2

    :cond_3
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x13cc0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :goto_3
    const-wide v1, -0x13ce3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x13cf0fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x13c88fffff835L

    invoke-static {v2, v3, v1, p0, p1}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v0
.end method

.method private static final pushClassWrapper$lambda$5(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I
    .locals 9

    const-wide v0, -0x13c9cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x0

    if-nez v5, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    const/4 v7, 0x1

    :try_start_0
    invoke-virtual {p0, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v2, p1

    goto/16 :goto_2

    :catch_1
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    :try_start_1
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v3

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return v7

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    const-wide v3, -0x13c9efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v2

    :goto_1
    if-ge v0, v3, :cond_3

    aget-object v4, v2, v0

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v8

    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v1, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v3, 0x0

    move-object v4, p0

    move-object v2, p1

    :try_start_2
    invoke-direct/range {v1 .. v6}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->pushMethodWrapper(Lparty/iroiro/luajava/Lua;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    return v7

    :cond_4
    move-object v4, p0

    move-object v2, p1

    :try_start_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x24

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_2
    if-eqz v1, :cond_5

    :try_start_4
    sget-object p0, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-direct {p0, v2, v1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->pushClassWrapper(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;)V

    return v7

    :cond_5
    invoke-interface {v2}, Lparty/iroiro/luajava/Lua;->pushNil()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_3

    :catch_3
    :goto_2
    const-wide p0, -0x13caefffff835L

    const-wide v0, -0x13cbbfffff835L

    invoke-static {p0, p1, v0, v1, v2}, LEy;->j(JJLparty/iroiro/luajava/Lua;)V

    :goto_3
    return v7
.end method

.method private static final pushClassWrapper$lambda$6(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x13b52fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x13b54fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x3e

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final pushMethodWrapper(Lparty/iroiro/luajava/Lua;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;)V"
        }
    .end annotation

    new-instance p3, Lam;

    invoke-direct {p3, p5, p2, p4}, Lam;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p3}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    return-void
.end method

.method private static final pushMethodWrapper$lambda$8(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lparty/iroiro/luajava/Lua;)I
    .locals 7

    const-wide v0, -0x13b5ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x2

    :try_start_0
    invoke-interface {p3}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_0

    add-int/lit8 v5, v4, 0x1

    invoke-interface {p3, v5}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v2, v4

    move v4, v5

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_3

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    move v5, v3

    :goto_1
    if-ge v5, v1, :cond_2

    aget-object v6, v2, v5

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    :goto_2
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    new-array v5, v3, [Ljava/lang/Class;

    invoke-interface {v4, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/Class;

    sget-object v5, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-direct {v5, p0, v4}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->findMatchingMethod(Ljava/util/List;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    if-eqz p0, :cond_4

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p0

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    return v3

    :cond_3
    sget-object p0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p3, p1, p0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return p2

    :cond_4
    invoke-interface {p3}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x13b61fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide p1, -0x13b76fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p3, p0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :goto_3
    const-wide p1, -0x13b7efffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x13b0bfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p3}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x13b20fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_6

    :cond_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    :cond_6
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p3, p0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$0(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x13c71fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 v2, 0x2

    :try_start_0
    sget-object v3, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-direct {v3, v1, p0}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->loadClass(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-direct {v3, p1, p0}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->pushClassWrapper(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;)V

    return v0

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v3, -0x13c73fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :goto_0
    const-wide v0, -0x13c05fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x13c12fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x13c2bfffff835L

    invoke-static {v3, v4, v0, p0, p1}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v2
.end method

.method private final registerLuaJavaNamespace(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V
    .locals 4
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

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    new-instance v0, LZl;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, LZl;-><init>(ILjava/util/List;)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x13c43fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LZl;

    const/4 v2, 0x2

    invoke-direct {v0, v2, p2}, LZl;-><init>(ILjava/util/List;)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x13c4dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, LZl;

    const/4 v2, 0x3

    invoke-direct {v0, v2, p2}, LZl;-><init>(ILjava/util/List;)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x13c59fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v0, -0x13c65fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    return-void
.end method

.method private static final registerLuaJavaNamespace$lambda$11(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x13b31fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    sget-object v3, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-direct {v3, v1, p0}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->loadClass(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Class;

    move-result-object p0

    const/4 v3, 0x2

    if-nez p0, :cond_1

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v4, -0x13b33fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v3

    :cond_1
    :try_start_0
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v1

    sub-int/2addr v1, v0

    new-array v4, v1, [Ljava/lang/Object;

    move v5, v2

    :goto_0
    if-ge v5, v1, :cond_2

    add-int/lit8 v6, v5, 0x2

    invoke-interface {p1, v6}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_3

    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v2

    :goto_1
    if-ge v6, v1, :cond_4

    aget-object v7, v4, v6

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    :goto_2
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    new-array v2, v2, [Ljava/lang/Class;

    invoke-interface {v5, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Class;

    sget-object v5, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-direct {v5, p0, v2}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->findMatchingConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return v0

    :cond_5
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x13bc5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :goto_3
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x13bddfffff835L

    invoke-static {v1, v2, v0, p0, p1}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v3
.end method

.method private static final registerLuaJavaNamespace$lambda$12(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x13be5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v2, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-direct {v2, v1, p0}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->loadClass(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Class;

    move-result-object p0

    const/4 v2, 0x2

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    sget-object v1, Lio/github/cherrywechat/lua/bridge/InterfaceProxy;->INSTANCE:Lio/github/cherrywechat/lua/bridge/InterfaceProxy;

    invoke-virtual {v1, p1, p0, v2}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy;->create(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception p0

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x13bfafffff835L

    invoke-static {v3, v4, v0, p0, p1}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v2

    :cond_2
    :goto_0
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v3, -0x13be7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v2
.end method

.method private static final registerLuaJavaNamespace$lambda$9(Ljava/util/List;Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x13b2ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v2, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-direct {v2, v1, p0}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->loadClass(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-direct {v2, p1, p0}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->pushClassWrapper(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    return v0
.end method

.method private final registerNewFunction(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    new-instance v0, Le9;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Le9;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x13c6dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    return-void
.end method

.method private static final registerNewFunction$lambda$14(Lparty/iroiro/luajava/Lua;)I
    .locals 10

    const-wide v0, -0x13b88fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Class;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/Class;

    goto :goto_0

    :cond_0
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    :try_start_0
    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    move-object v1, v3

    :goto_0
    const/4 v2, 0x2

    if-nez v1, :cond_2

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x13b8afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v2

    :cond_2
    :try_start_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v4

    sub-int/2addr v4, v0

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    if-ge v7, v4, :cond_3

    add-int/lit8 v8, v7, 0x2

    invoke-interface {p0, v8}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v8

    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_5

    :cond_3
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    move v8, v6

    :goto_2
    if-ge v8, v4, :cond_5

    aget-object v9, v5, v8

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    goto :goto_3

    :cond_4
    move-object v9, v3

    :goto_3
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_5
    new-array v3, v6, [Ljava/lang/Class;

    invoke-interface {v7, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/Class;

    sget-object v6, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-direct {v6, v1, v3}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->findMatchingConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_4

    :cond_6
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x13b98fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move v0, v2

    :goto_4
    move v2, v0

    goto :goto_6

    :goto_5
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x13bb0fffff835L

    invoke-static {v3, v4, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    :goto_6
    return v2
.end method

.method private final tryLoadInnerClass(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Class;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/ClassLoader;",
            ">;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-wide v0, -0x13d39fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide v2, -0x13d3bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x6

    invoke-static {p1, v0, v2}, Ltz;->Z(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-lez v2, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    const-wide v5, -0x13d3dfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x24

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v0, v2, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    const-wide v6, -0x13d3ffffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x0

    const/16 v10, 0x3e

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :catch_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ClassLoader;

    :try_start_0
    invoke-virtual {v5, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    sget-object v6, Lio/github/cherrywechat/lua/bridge/JavaImporter;->classCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v6, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v5

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final clearCache()V
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/bridge/JavaImporter;->classCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

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

    const-wide v0, -0x13d43fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x13d47fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LZl;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, LZl;-><init>(ILjava/util/List;)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x13d54fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->registerLuaJavaNamespace(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->registerNewFunction(Lparty/iroiro/luajava/Lua;)V

    const-wide p1, -0x13d5bfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x13d68fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method
