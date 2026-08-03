.class final Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/bridge/InterfaceProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LuaInvocationHandler"
.end annotation


# instance fields
.field private final interfaceClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final lua:Lparty/iroiro/luajava/Lua;

.field private final tableRef:I


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "Ljava/lang/Class<",
            "*>;I)V"
        }
    .end annotation

    const-wide v0, -0x130d9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x130ddfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    iput-object p2, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->interfaceClass:Ljava/lang/Class;

    invoke-interface {p1, p3}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result p1

    iput p1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->tableRef:I

    return-void
.end method

.method public static synthetic a(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;[Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->invokeLuaMethod$lambda$2(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;[Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final convertReturnValue(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->getDefaultValue(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_7

    :cond_1
    instance-of v0, p1, Ljava/lang/Number;

    const-class v1, Ljava/lang/Boolean;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_11

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    const-class v0, Ljava/lang/Integer;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_6

    :cond_2
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    const-class v0, Ljava/lang/Long;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_5

    :cond_3
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    const-class v0, Ljava/lang/Float;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_4

    :cond_4
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-class v0, Ljava/lang/Double;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const-class v0, Ljava/lang/Short;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-class v0, Ljava/lang/Byte;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_0

    :cond_8
    check-cast p1, Ljava/io/Serializable;

    return-object p1

    :cond_9
    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eqz p1, :cond_a

    move v3, v4

    :cond_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_b
    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :cond_c
    :goto_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1

    :cond_d
    :goto_3
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :cond_e
    :goto_4
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_f
    :goto_5
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_10
    :goto_6
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_11
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_12

    goto :goto_8

    :cond_12
    :goto_7
    return-object p1

    :cond_13
    :goto_8
    instance-of p2, p1, Ljava/lang/Boolean;

    if-eqz p2, :cond_14

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    goto :goto_a

    :cond_14
    if-eqz v0, :cond_16

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eqz p1, :cond_17

    :cond_15
    :goto_9
    move v3, v4

    goto :goto_a

    :cond_16
    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_15

    move-object p2, p1

    check-cast p2, Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_17

    const-wide v0, -0x13f74fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    goto :goto_9

    :cond_17
    :goto_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final getDefaultValue(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    const-class v0, Ljava/lang/Boolean;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_e

    const-class v0, Ljava/lang/Byte;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_6

    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-class v0, Ljava/lang/Short;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_5

    :cond_2
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const-class v0, Ljava/lang/Integer;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_4

    :cond_3
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-class v0, Ljava/lang/Long;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    const-class v0, Ljava/lang/Float;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    const-class v0, Ljava/lang/Double;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_6
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-class v0, Ljava/lang/Character;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    const/4 p1, 0x0

    return-object p1

    :cond_8
    :goto_0
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    return-object p1

    :cond_9
    :goto_1
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :cond_a
    :goto_2
    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_b
    :goto_3
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_c
    :goto_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_d
    :goto_5
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1

    :cond_e
    :goto_6
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :cond_f
    :goto_7
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private final handleCallResult(ZLjava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->convertReturnValue(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->getDefaultValue(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final invokeLuaMethod(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    iget-object v1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    new-instance v2, Lio/github/cherrywechat/lua/bridge/a;

    invoke-direct {v2, p0, p2, p3, p1}, Lio/github/cherrywechat/lua/bridge/a;-><init>(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;[Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static final invokeLuaMethod$lambda$2(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;[Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->tableRef:I

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    iget-object v0, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    array-length p3, p1

    :goto_0
    if-ge v2, p3, :cond_0

    aget-object v0, p1, v2

    iget-object v1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    sget-object v4, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {v1, v0, v4}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p3, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    array-length p1, p1

    invoke-interface {p3, p1, v3}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-direct {p0, v3, p2}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->handleCallResult(ZLjava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    const-wide v0, -0x13f7afffff835L

    const-wide v2, -0x13f09fffff835L

    invoke-static {v0, v1, v2, v3, p1}, LEy;->i(JJLjava/lang/Exception;)V

    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->getDefaultValue(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    iget-object v0, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0, v1, p3}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    iget-object p3, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p3, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result p3

    if-nez p3, :cond_2

    iget-object p1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    const/4 p3, 0x2

    invoke-interface {p1, p3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    const-wide v0, -0x13f1afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x13f29fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x13f32fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->getDefaultValue(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    array-length p3, p1

    move v0, v2

    :goto_1
    if-ge v0, p3, :cond_3

    aget-object v1, p1, v0

    iget-object v4, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    sget-object v5, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {v4, v1, v5}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    :try_start_1
    iget-object p3, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    array-length p1, p1

    invoke-interface {p3, p1, v3}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    iget-object p1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    const/4 p3, -0x2

    invoke-interface {p1, p3}, Lparty/iroiro/luajava/Lua;->remove(I)V

    invoke-direct {p0, v3, p2}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->handleCallResult(ZLjava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    move-exception p1

    iget-object p3, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p3, v2}, Lparty/iroiro/luajava/Lua;->setTop(I)V

    const-wide v0, -0x13fcbfffff835L

    const-wide v2, -0x13fdafffff835L

    invoke-static {v0, v1, v2, v3, p1}, LEy;->i(JJLjava/lang/Exception;)V

    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->getDefaultValue(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const-wide v0, -0x130ecfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x69e9ad94

    if-eq v2, v3, :cond_7

    const v3, -0x4d378041

    if-eq v2, v3, :cond_2

    const v3, 0x8cdac1b

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const-wide v2, -0x130f3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_2
    const-wide v2, -0x130fcfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    if-eqz p3, :cond_5

    array-length v0, p3

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    aget-object p2, p3, v1

    :cond_5
    :goto_0
    if-ne p1, p2, :cond_6

    const/4 v1, 0x1

    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_7
    const-wide v2, -0x13083fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide p2, -0x1308cfffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->interfaceClass:Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x3e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_9
    :goto_1
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-wide v2, -0x13096fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    if-nez p3, :cond_a

    new-array p3, v1, [Ljava/lang/Object;

    :cond_a
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    const-wide v1, -0x130a3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, p1, p3, v0}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->invokeLuaMethod(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-wide v0, -0x130b6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x13f45fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    const-wide p2, -0x13f61fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaInvocationHandler;->getDefaultValue(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
