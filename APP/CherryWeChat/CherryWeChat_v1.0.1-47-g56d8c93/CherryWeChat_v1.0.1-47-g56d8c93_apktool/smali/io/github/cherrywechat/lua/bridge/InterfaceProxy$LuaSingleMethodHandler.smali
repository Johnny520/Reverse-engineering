.class final Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;
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
    name = "LuaSingleMethodHandler"
.end annotation


# instance fields
.field private final functionRef:I

.field private final lua:Lparty/iroiro/luajava/Lua;

.field private final targetMethodName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/lang/String;I)V
    .locals 2

    const-wide v0, -0x13febfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x13feffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->lua:Lparty/iroiro/luajava/Lua;

    iput-object p2, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->targetMethodName:Ljava/lang/String;

    invoke-interface {p1, p3}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result p1

    iput p1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->functionRef:I

    return-void
.end method

.method public static synthetic a(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;[Ljava/lang/Object;Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->invoke$lambda$1(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;[Ljava/lang/Object;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
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

.method private static final invoke$lambda$1(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;[Ljava/lang/Object;Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->lua:Lparty/iroiro/luajava/Lua;

    iget v2, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->functionRef:I

    invoke-interface {v1, v2}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    if-nez p1, :cond_0

    new-array v1, v0, [Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_0
    move-object v1, p1

    :goto_0
    array-length v2, v1

    move v3, v0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    iget-object v5, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->lua:Lparty/iroiro/luajava/Lua;

    sget-object v6, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {v5, v4, v6}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->lua:Lparty/iroiro/luajava/Lua;

    if-eqz p1, :cond_2

    array-length p1, p1

    goto :goto_2

    :cond_2
    move p1, v0

    :goto_2
    const/4 v2, 0x1

    invoke-interface {v1, p1, v2}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    iget-object p1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->lua:Lparty/iroiro/luajava/Lua;

    const/4 v1, -0x1

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {v1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_3
    const-wide v1, -0x13e45fffff835L

    const-wide v3, -0x13e54fffff835L

    invoke-static {v1, v2, v3, v4, p1}, LEy;->i(JJLjava/lang/Exception;)V

    iget-object p1, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->lua:Lparty/iroiro/luajava/Lua;

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->setTop(I)V

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    const-wide v0, -0x13e71fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->getDefaultValue(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const-wide v0, -0x13f80fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x69e9ad94

    if-eq v1, v2, :cond_7

    const v2, -0x4d378041

    if-eq v1, v2, :cond_2

    const v2, 0x8cdac1b

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const-wide v1, -0x13f87fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    const-wide v1, -0x13f90fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    const/4 v0, 0x0

    if-eqz p3, :cond_5

    array-length v1, p3

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    aget-object v0, p3, p2

    :cond_5
    :goto_0
    if-ne p1, v0, :cond_6

    const/4 p2, 0x1

    :cond_6
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_7
    const-wide v1, -0x13f97fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide p2, -0x13fa0fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->targetMethodName:Ljava/lang/String;

    const/16 p3, 0x3e

    invoke-static {p1, p2, p3}, Lph;->l(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_9
    :goto_1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->targetMethodName:Ljava/lang/String;

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    const-wide p2, -0x13fb2fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->getDefaultValue(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_a
    sget-object p1, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    iget-object v0, p0, Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;->lua:Lparty/iroiro/luajava/Lua;

    new-instance v1, Lio/github/cherrywechat/lua/bridge/b;

    invoke-direct {v1, p0, p3, p2}, Lio/github/cherrywechat/lua/bridge/b;-><init>(Lio/github/cherrywechat/lua/bridge/InterfaceProxy$LuaSingleMethodHandler;[Ljava/lang/Object;Ljava/lang/reflect/Method;)V

    invoke-virtual {p1, v0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
