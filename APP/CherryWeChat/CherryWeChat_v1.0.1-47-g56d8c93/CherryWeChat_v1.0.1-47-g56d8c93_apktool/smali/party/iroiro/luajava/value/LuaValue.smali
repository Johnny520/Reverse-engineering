.class public interface abstract Lparty/iroiro/luajava/value/LuaValue;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/value/LuaTableTrait;


# virtual methods
.method public varargs abstract call([Ljava/lang/Object;)[Lparty/iroiro/luajava/value/LuaValue;
.end method

.method public abstract push(Lparty/iroiro/luajava/Lua;)V
.end method

.method public abstract state()Lparty/iroiro/luajava/Lua;
.end method

.method public abstract toBoolean()Z
.end method

.method public abstract toBuffer()Ljava/nio/ByteBuffer;
.end method

.method public abstract toInteger()J
.end method

.method public abstract toJavaObject()Ljava/lang/Object;
.end method

.method public abstract toNumber()D
.end method

.method public abstract toProxy(Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract toProxy([Ljava/lang/Class;Lparty/iroiro/luajava/Lua$Conversion;)Ljava/lang/Object;
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
.end method

.method public abstract toString()Ljava/lang/String;
.end method

.method public abstract type()Lparty/iroiro/luajava/Lua$LuaType;
.end method
