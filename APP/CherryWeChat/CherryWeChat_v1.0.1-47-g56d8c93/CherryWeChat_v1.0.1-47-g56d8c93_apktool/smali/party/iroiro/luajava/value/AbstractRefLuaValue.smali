.class public abstract Lparty/iroiro/luajava/value/AbstractRefLuaValue;
.super Lparty/iroiro/luajava/value/AbstractLuaValue;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/cleaner/LuaReferable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lparty/iroiro/luajava/value/AbstractLuaValue<",
        "Lparty/iroiro/luajava/Lua;",
        ">;",
        "Lparty/iroiro/luajava/cleaner/LuaReferable;"
    }
.end annotation


# instance fields
.field private final ref:I


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/AbstractLuaValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;)V

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result p1

    iput p1, p0, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->ref:I

    return-void
.end method


# virtual methods
.method public varargs call([Ljava/lang/Object;)[Lparty/iroiro/luajava/value/LuaValue;
    .locals 7

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    iget-object v1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    invoke-virtual {p0, v1}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    iget-object v5, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    sget-object v6, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {v5, v4, v6}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    array-length p1, p1

    const/4 v3, -0x1

    invoke-interface {v1, p1, v3}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    iget-object p1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result p1

    sub-int/2addr p1, v0

    new-array v0, p1, [Lparty/iroiro/luajava/value/LuaValue;

    :goto_1
    if-ge v2, p1, :cond_1

    sub-int v1, p1, v2

    add-int/lit8 v1, v1, -0x1

    iget-object v3, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v3}, Lparty/iroiro/luajava/Lua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v3

    aput-object v3, v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public getReference()I
    .locals 1

    iget v0, p0, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->ref:I

    return v0
.end method

.method public push(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getMainState()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    iget-object v1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v1}, Lparty/iroiro/luajava/Lua;->getMainState()Lparty/iroiro/luajava/Lua;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->ref:I

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    return-void

    :cond_0
    new-instance p1, Lparty/iroiro/luajava/LuaException;

    sget-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->MEMORY:Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "Unable to pass Lua values between different Lua states"

    invoke-direct {p1, v0, v1}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p1
.end method

.method public toJavaObject()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    iget-object v0, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object v0
.end method
