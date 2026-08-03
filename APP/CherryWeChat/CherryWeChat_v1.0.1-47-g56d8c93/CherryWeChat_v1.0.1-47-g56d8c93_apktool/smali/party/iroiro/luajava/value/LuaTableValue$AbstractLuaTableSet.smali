.class public Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;
.super Ljava/util/AbstractSet;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/value/LuaTableValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AbstractLuaTableSet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Ljava/util/Map$Entry<",
        "Lparty/iroiro/luajava/value/LuaValue;",
        "Lparty/iroiro/luajava/value/LuaValue;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lparty/iroiro/luajava/value/LuaTableValue;


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/value/LuaTableValue;)V
    .locals 0

    iput-object p1, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;->this$0:Lparty/iroiro/luajava/value/LuaTableValue;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "Lparty/iroiro/luajava/value/LuaValue;",
            "Lparty/iroiro/luajava/value/LuaValue;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;->this$0:Lparty/iroiro/luajava/value/LuaTableValue;

    invoke-virtual {v0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->state()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    new-instance v1, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;

    invoke-direct {v1, p0, v0}, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;-><init>(Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;Lparty/iroiro/luajava/Lua;)V

    return-object v1
.end method

.method public size()I
    .locals 4

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;->this$0:Lparty/iroiro/luajava/value/LuaTableValue;

    invoke-virtual {v0}, Lparty/iroiro/luajava/value/AbstractLuaValue;->state()Lparty/iroiro/luajava/Lua;

    move-result-object v0

    iget-object v1, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;->this$0:Lparty/iroiro/luajava/value/LuaTableValue;

    invoke-virtual {v1, v0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x2

    invoke-interface {v0, v2}, Lparty/iroiro/luajava/Lua;->next(I)I

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return v1
.end method
