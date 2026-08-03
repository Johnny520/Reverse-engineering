.class final Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableBoolean;
.super Lparty/iroiro/luajava/value/ImmutableLuaValue;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/value/ImmutableLuaValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ImmutableBoolean"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lparty/iroiro/luajava/value/ImmutableLuaValue<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Boolean;)V
    .locals 1

    .line 2
    sget-object v0, Lparty/iroiro/luajava/Lua$LuaType;->BOOLEAN:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-direct {p0, p1, v0, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Boolean;Lparty/iroiro/luajava/value/ImmutableLuaValue$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableBoolean;-><init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public push(Lparty/iroiro/luajava/Lua;)V
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return-void
.end method

.method public toBoolean()Z
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
