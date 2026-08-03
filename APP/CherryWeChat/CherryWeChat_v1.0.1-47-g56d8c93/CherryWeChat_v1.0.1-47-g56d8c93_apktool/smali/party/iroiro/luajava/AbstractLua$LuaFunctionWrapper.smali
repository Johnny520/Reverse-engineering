.class Lparty/iroiro/luajava/AbstractLua$LuaFunctionWrapper;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/JFunction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/AbstractLua;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LuaFunctionWrapper"
.end annotation


# instance fields
.field private final function:Lparty/iroiro/luajava/value/LuaFunction;


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/value/LuaFunction;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lparty/iroiro/luajava/AbstractLua$LuaFunctionWrapper;->function:Lparty/iroiro/luajava/value/LuaFunction;

    return-void
.end method


# virtual methods
.method public __call(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    new-array v1, v0, [Lparty/iroiro/luajava/value/LuaValue;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    sub-int v4, v0, v3

    add-int/lit8 v4, v4, -0x1

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v5

    aput-object v5, v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua$LuaFunctionWrapper;->function:Lparty/iroiro/luajava/value/LuaFunction;

    invoke-interface {v0, p1, v1}, Lparty/iroiro/luajava/value/LuaFunction;->call(Lparty/iroiro/luajava/Lua;[Lparty/iroiro/luajava/value/LuaValue;)[Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v1, v0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-interface {p1, v4}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/value/LuaValue;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    return v2

    :cond_2
    array-length p1, v0

    return p1
.end method
