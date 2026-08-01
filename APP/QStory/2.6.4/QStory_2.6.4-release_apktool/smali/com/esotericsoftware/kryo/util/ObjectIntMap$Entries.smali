.class public Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;
.super Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/util/ObjectIntMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entries"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator<",
        "TK;>;",
        "Ljava/lang/Iterable<",
        "Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry<",
        "TK;>;>;",
        "Ljava/util/Iterator<",
        "Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry<",
        "TK;>;>;"
    }
.end annotation


# instance fields
.field entry:Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;-><init>(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;

    .line 5
    .line 6
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;->entry:Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->valid:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->hasNext:Z

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 9
    .line 10
    const-string v0, "#iterator() cannot be used nested."

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public iterator()Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries<",
            "TK;>;"
        }
    .end annotation

    .line 6
    return-object p0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;->iterator()Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public next()Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry<",
            "TK;>;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->hasNext:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->valid:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/ObjectIntMap;

    .line 10
    .line 11
    iget-object v1, v0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;->entry:Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->nextIndex:I

    .line 16
    .line 17
    aget-object v1, v1, v3

    .line 18
    .line 19
    iput-object v1, v2, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;->key:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 22
    .line 23
    aget v0, v0, v3

    .line 24
    .line 25
    iput v0, v2, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;->value:I

    .line 26
    .line 27
    iput v3, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->currentIndex:I

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->findNextIndex()V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;->entry:Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 36
    .line 37
    const-string v0, "#iterator() cannot be used nested."

    .line 38
    .line 39
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_1
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 0

    .line 48
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;->next()Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic remove()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->remove()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic reset()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->reset()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
