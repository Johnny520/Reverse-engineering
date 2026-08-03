.class public Lparty/iroiro/luajava/value/LuaTableValue;
.super Lparty/iroiro/luajava/value/AbstractRefLuaValue;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/value/LuaValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;
    }
.end annotation


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;)V

    return-void
.end method

.method private putRaw(Ljava/lang/Object;Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 3

    invoke-virtual {p0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->state()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {v0, p1, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const/4 p1, -0x1

    invoke-interface {v0, p1}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    const/4 p1, -0x3

    invoke-interface {v0, p1}, Lparty/iroiro/luajava/Lua;->getTable(I)V

    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v2

    invoke-interface {v0, p2, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    invoke-interface {v0, p1}, Lparty/iroiro/luajava/Lua;->setTable(I)V

    const/4 p1, 0x1

    invoke-interface {v0, p1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object v2
.end method


# virtual methods
.method public containsKey(Ljava/lang/Object;)Z
    .locals 2

    invoke-virtual {p0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->state()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {v0, p1, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const/4 p1, -0x2

    invoke-interface {v0, p1}, Lparty/iroiro/luajava/Lua;->getTable(I)V

    const/4 p1, -0x1

    invoke-interface {v0, p1}, Lparty/iroiro/luajava/Lua;->isNil(I)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
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

    new-instance v0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;

    invoke-direct {v0, p0}, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;-><init>(Lparty/iroiro/luajava/value/LuaTableValue;)V

    return-object v0
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/value/LuaTableValue;->get(Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public get(I)Lparty/iroiro/luajava/value/LuaValue;
    .locals 3

    .line 2
    invoke-virtual {p0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->state()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    .line 3
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    int-to-long v1, p1

    .line 4
    invoke-interface {v0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(J)V

    const/4 p1, -0x2

    .line 5
    invoke-interface {v0, p1}, Lparty/iroiro/luajava/Lua;->getTable(I)V

    .line 6
    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    const/4 v1, 0x1

    .line 7
    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object p1
.end method

.method public get(Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 2

    .line 19
    invoke-virtual {p0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->state()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    .line 21
    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {v0, p1, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const/4 p1, -0x2

    .line 22
    invoke-interface {v0, p1}, Lparty/iroiro/luajava/Lua;->getTable(I)V

    .line 23
    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    const/4 v1, 0x1

    .line 24
    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object p1
.end method

.method public get(Ljava/lang/String;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 2

    .line 8
    invoke-virtual {p0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->state()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    const/4 v1, -0x1

    .line 10
    invoke-interface {v0, v1, p1}, Lparty/iroiro/luajava/Lua;->getField(ILjava/lang/String;)V

    .line 11
    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    const/4 v1, 0x1

    .line 12
    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object p1
.end method

.method public get(Lparty/iroiro/luajava/value/LuaValue;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 2

    .line 13
    invoke-virtual {p0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->state()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    .line 15
    invoke-interface {p1, v0}, Lparty/iroiro/luajava/value/LuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    const/4 p1, -0x2

    .line 16
    invoke-interface {v0, p1}, Lparty/iroiro/luajava/Lua;->getTable(I)V

    .line 17
    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    const/4 v1, 0x1

    .line 18
    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object p1
.end method

.method public length()I
    .locals 3

    invoke-virtual {p0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->state()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->rawLength(I)I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return v1
.end method

.method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lparty/iroiro/luajava/value/LuaValue;

    check-cast p2, Lparty/iroiro/luajava/value/LuaValue;

    invoke-virtual {p0, p1, p2}, Lparty/iroiro/luajava/value/LuaTableValue;->put(Lparty/iroiro/luajava/value/LuaValue;Lparty/iroiro/luajava/value/LuaValue;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public put(Lparty/iroiro/luajava/value/LuaValue;Lparty/iroiro/luajava/value/LuaValue;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/LuaTableValue;->putRaw(Ljava/lang/Object;Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/value/LuaTableValue;->remove(Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lparty/iroiro/luajava/value/LuaTableValue;->putRaw(Ljava/lang/Object;Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public set(ILjava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/LuaTableValue;->putRaw(Ljava/lang/Object;Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public set(Ljava/lang/Object;Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/LuaTableValue;->putRaw(Ljava/lang/Object;Ljava/lang/Object;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method
