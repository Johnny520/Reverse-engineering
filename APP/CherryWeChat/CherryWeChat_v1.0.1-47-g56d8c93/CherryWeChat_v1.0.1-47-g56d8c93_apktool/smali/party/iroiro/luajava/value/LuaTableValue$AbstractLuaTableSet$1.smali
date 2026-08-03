.class Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "Lparty/iroiro/luajava/value/LuaValue;",
        "Lparty/iroiro/luajava/value/LuaValue;",
        ">;>;"
    }
.end annotation


# instance fields
.field keyRef:Lparty/iroiro/luajava/value/LuaValue;

.field final synthetic this$1:Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;

.field final synthetic val$L:Lparty/iroiro/luajava/Lua;


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;Lparty/iroiro/luajava/Lua;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->this$1:Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;

    iput-object p2, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Lparty/iroiro/luajava/value/LuaThread;->fromNull()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    iput-object p1, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->keyRef:Lparty/iroiro/luajava/value/LuaValue;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 4

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->this$1:Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;

    iget-object v0, v0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;->this$0:Lparty/iroiro/luajava/value/LuaTableValue;

    iget-object v1, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-virtual {v0, v1}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->keyRef:Lparty/iroiro/luajava/value/LuaValue;

    iget-object v1, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/value/LuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    const/4 v1, -0x2

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->next(I)I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    if-eqz v0, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    const/4 v3, 0x3

    :goto_1
    invoke-interface {v2, v3}, Lparty/iroiro/luajava/Lua;->pop(I)V

    xor-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->next()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/util/Map$Entry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "Lparty/iroiro/luajava/value/LuaValue;",
            "Lparty/iroiro/luajava/value/LuaValue;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->this$1:Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;

    iget-object v0, v0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;->this$0:Lparty/iroiro/luajava/value/LuaTableValue;

    iget-object v1, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-virtual {v0, v1}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    .line 3
    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->keyRef:Lparty/iroiro/luajava/value/LuaValue;

    iget-object v1, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/value/LuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    .line 4
    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    const/4 v1, -0x2

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->next(I)I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v0

    .line 6
    iget-object v2, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v2}, Lparty/iroiro/luajava/Lua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v2

    iput-object v2, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->keyRef:Lparty/iroiro/luajava/value/LuaValue;

    .line 7
    iget-object v2, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v2, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    .line 8
    new-instance v1, Ljava/util/AbstractMap$SimpleEntry;

    iget-object v2, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->keyRef:Lparty/iroiro/luajava/value/LuaValue;

    invoke-direct {v1, v2, v0}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    .line 9
    :cond_0
    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    .line 10
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 2

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->keyRef:Lparty/iroiro/luajava/value/LuaValue;

    invoke-interface {v0}, Lparty/iroiro/luajava/value/LuaValue;->type()Lparty/iroiro/luajava/Lua$LuaType;

    move-result-object v0

    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->NIL:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->this$1:Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;

    iget-object v0, v0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet;->this$0:Lparty/iroiro/luajava/value/LuaTableValue;

    iget-object v1, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-virtual {v0, v1}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->keyRef:Lparty/iroiro/luajava/value/LuaValue;

    iget-object v1, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/value/LuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->setTable(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/value/LuaTableValue$AbstractLuaTableSet$1;->val$L:Lparty/iroiro/luajava/Lua;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
