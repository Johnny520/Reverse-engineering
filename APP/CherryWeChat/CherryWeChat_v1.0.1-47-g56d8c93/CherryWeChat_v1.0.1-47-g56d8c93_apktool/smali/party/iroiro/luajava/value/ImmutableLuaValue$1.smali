.class Lparty/iroiro/luajava/value/ImmutableLuaValue$1;
.super Lparty/iroiro/luajava/value/ImmutableLuaValue;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lparty/iroiro/luajava/value/ImmutableLuaValue;->NIL(Lparty/iroiro/luajava/Lua;)Lparty/iroiro/luajava/value/LuaValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lparty/iroiro/luajava/value/ImmutableLuaValue<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;Ljava/lang/Void;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lparty/iroiro/luajava/value/ImmutableLuaValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public push(Lparty/iroiro/luajava/Lua;)V
    .locals 0

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    return-void
.end method

.method public toBoolean()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
