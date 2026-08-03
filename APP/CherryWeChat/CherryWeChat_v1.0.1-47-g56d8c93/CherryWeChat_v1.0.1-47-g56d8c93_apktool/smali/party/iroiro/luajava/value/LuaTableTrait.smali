.class public interface abstract Lparty/iroiro/luajava/value/LuaTableTrait;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Map<",
        "Lparty/iroiro/luajava/value/LuaValue;",
        "Lparty/iroiro/luajava/value/LuaValue;",
        ">;"
    }
.end annotation


# virtual methods
.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/value/LuaTableTrait;->get(Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public abstract get(I)Lparty/iroiro/luajava/value/LuaValue;
.end method

.method public abstract get(Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
.end method

.method public abstract get(Ljava/lang/String;)Lparty/iroiro/luajava/value/LuaValue;
.end method

.method public abstract get(Lparty/iroiro/luajava/value/LuaValue;)Lparty/iroiro/luajava/value/LuaValue;
.end method

.method public abstract length()I
.end method

.method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lparty/iroiro/luajava/value/LuaValue;

    check-cast p2, Lparty/iroiro/luajava/value/LuaValue;

    invoke-interface {p0, p1, p2}, Lparty/iroiro/luajava/value/LuaTableTrait;->put(Lparty/iroiro/luajava/value/LuaValue;Lparty/iroiro/luajava/value/LuaValue;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public abstract put(Lparty/iroiro/luajava/value/LuaValue;Lparty/iroiro/luajava/value/LuaValue;)Lparty/iroiro/luajava/value/LuaValue;
.end method

.method public abstract set(ILjava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
.end method

.method public abstract set(Ljava/lang/Object;Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
.end method

.method public abstract size()I
.end method
