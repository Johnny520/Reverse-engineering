.class public abstract Lparty/iroiro/luajava/value/AbstractLuaValue;
.super Ljava/util/AbstractMap;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/value/LuaValue;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lparty/iroiro/luajava/Lua;",
        ">",
        "Ljava/util/AbstractMap<",
        "Lparty/iroiro/luajava/value/LuaValue;",
        "Lparty/iroiro/luajava/value/LuaValue;",
        ">;",
        "Lparty/iroiro/luajava/value/LuaValue;"
    }
.end annotation


# instance fields
.field protected final L:Lparty/iroiro/luajava/Lua;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected final type:Lparty/iroiro/luajava/Lua$LuaType;


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lparty/iroiro/luajava/Lua$LuaType;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    iput-object p1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    iput-object p2, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    return-void
.end method

.method private checkNumber()Ljava/lang/Number;
    .locals 4

    invoke-interface {p0}, Lparty/iroiro/luajava/value/LuaValue;->toJavaObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    return-object v0

    :cond_0
    new-instance v0, Lparty/iroiro/luajava/LuaException;

    sget-object v1, Lparty/iroiro/luajava/LuaException$LuaError;->JAVA:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " is not a number"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public varargs call([Ljava/lang/Object;)[Lparty/iroiro/luajava/value/LuaValue;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Lparty/iroiro/luajava/value/LuaValue;",
            "Lparty/iroiro/luajava/value/LuaValue;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    iget-object v1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public get(I)Lparty/iroiro/luajava/value/LuaValue;
    .locals 1

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lparty/iroiro/luajava/value/LuaValue;

    return-object p1
.end method

.method public get(Ljava/lang/String;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 1

    .line 3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public get(Lparty/iroiro/luajava/value/LuaValue;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 1

    .line 4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public length()I
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    iget-object v1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic put(Lparty/iroiro/luajava/value/LuaValue;Lparty/iroiro/luajava/value/LuaValue;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    invoke-super {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lparty/iroiro/luajava/value/LuaValue;

    return-object p1
.end method

.method public set(ILjava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    iget-object p2, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public set(Ljava/lang/Object;Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    iget-object p2, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public state()Lparty/iroiro/luajava/Lua;
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    return-object v0
.end method

.method public toBoolean()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toBuffer()Ljava/nio/ByteBuffer;
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/value/LuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->toBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public toInteger()J
    .locals 2

    invoke-direct {p0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->checkNumber()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public toNumber()D
    .locals 2

    invoke-direct {p0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->checkNumber()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public toProxy(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TI;>;)TI;"
        }
    .end annotation

    .line 1
    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object p1

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-virtual {p0, p1, v0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->toProxy([Ljava/lang/Class;Lparty/iroiro/luajava/Lua$Conversion;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toProxy([Ljava/lang/Class;Lparty/iroiro/luajava/Lua$Conversion;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;",
            "Lparty/iroiro/luajava/Lua$Conversion;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/value/LuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    .line 3
    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0, p1, p2}, Lparty/iroiro/luajava/Lua;->createProxy([Ljava/lang/Class;Lparty/iroiro/luajava/Lua$Conversion;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public type()Lparty/iroiro/luajava/Lua$LuaType;
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    return-object v0
.end method
