.class public Lcom/esotericsoftware/kryo/util/ObjectIntMap$Values;
.super Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/util/ObjectIntMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Values"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;-><init>(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V

    .line 2
    .line 3
    .line 4
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

.method public iterator()Lcom/esotericsoftware/kryo/util/ObjectIntMap$Values;
    .locals 0

    .line 1
    return-object p0
.end method

.method public next()I
    .locals 2

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
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 12
    .line 13
    iget v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->nextIndex:I

    .line 14
    .line 15
    aget v0, v0, v1

    .line 16
    .line 17
    iput v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->currentIndex:I

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->findNextIndex()V

    .line 20
    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 24
    .line 25
    const-string v0, "#iterator() cannot be used nested."

    .line 26
    .line 27
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return p0
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

.method public toArray()Lcom/esotericsoftware/kryo/util/IntArray;
    .locals 3

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/IntArray;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/ObjectIntMap;

    .line 4
    .line 5
    iget v1, v1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v2, v1}, Lcom/esotericsoftware/kryo/util/IntArray;-><init>(ZI)V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->hasNext:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Values;->next()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/util/IntArray;->add(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v0
.end method

.method public toArray(Lcom/esotericsoftware/kryo/util/IntArray;)Lcom/esotericsoftware/kryo/util/IntArray;
    .locals 1

    .line 24
    :goto_0
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->hasNext:Z

    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Values;->next()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/util/IntArray;->add(I)V

    goto :goto_0

    :cond_0
    return-object p1
.end method
