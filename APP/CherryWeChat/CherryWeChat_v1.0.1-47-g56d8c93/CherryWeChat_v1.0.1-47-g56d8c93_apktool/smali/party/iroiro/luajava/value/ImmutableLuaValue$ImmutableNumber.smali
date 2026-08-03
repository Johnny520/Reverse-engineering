.class final Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableNumber;
.super Lparty/iroiro/luajava/value/ImmutableLuaValue;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/value/ImmutableLuaValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ImmutableNumber"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lparty/iroiro/luajava/value/ImmutableLuaValue<",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Double;)V
    .locals 1

    .line 2
    sget-object v0, Lparty/iroiro/luajava/Lua$LuaType;->NUMBER:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-direct {p0, p1, v0, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Double;Lparty/iroiro/luajava/value/ImmutableLuaValue$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableNumber;-><init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Double;)V

    return-void
.end method


# virtual methods
.method public push(Lparty/iroiro/luajava/Lua;)V
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    return-void
.end method

.method public toNumber()D
    .locals 2

    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method
