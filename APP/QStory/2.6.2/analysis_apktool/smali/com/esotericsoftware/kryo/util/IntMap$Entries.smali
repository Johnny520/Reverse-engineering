.class public Lcom/esotericsoftware/kryo/util/IntMap$Entries;
.super Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/util/IntMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entries"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/esotericsoftware/kryo/util/IntMap$MapIterator<",
        "TV;>;",
        "Ljava/lang/Iterable<",
        "Lcom/esotericsoftware/kryo/util/IntMap$Entry<",
        "TV;>;>;",
        "Ljava/util/Iterator<",
        "Lcom/esotericsoftware/kryo/util/IntMap$Entry<",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field private final entry:Lcom/esotericsoftware/kryo/util/IntMap$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/IntMap$Entry<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/util/IntMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;-><init>(Lcom/esotericsoftware/kryo/util/IntMap;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/esotericsoftware/kryo/util/IntMap$Entry;

    .line 5
    .line 6
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/util/IntMap$Entry;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/IntMap$Entries;->entry:Lcom/esotericsoftware/kryo/util/IntMap$Entry;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->valid:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->hasNext:Z

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

.method public iterator()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/esotericsoftware/kryo/util/IntMap$Entry<",
            "TV;>;>;"
        }
    .end annotation

    .line 1
    return-object p0
.end method

.method public next()Lcom/esotericsoftware/kryo/util/IntMap$Entry;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/IntMap$Entry<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->hasNext:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->valid:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 10
    .line 11
    iget-object v1, v0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 12
    .line 13
    iget v2, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->nextIndex:I

    .line 14
    .line 15
    iget-object v3, p0, Lcom/esotericsoftware/kryo/util/IntMap$Entries;->entry:Lcom/esotericsoftware/kryo/util/IntMap$Entry;

    .line 16
    .line 17
    const/4 v4, -0x1

    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput v1, v3, Lcom/esotericsoftware/kryo/util/IntMap$Entry;->key:I

    .line 22
    .line 23
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v0, v3, Lcom/esotericsoftware/kryo/util/IntMap$Entry;->value:Ljava/lang/Object;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    aget v1, v1, v2

    .line 29
    .line 30
    iput v1, v3, Lcom/esotericsoftware/kryo/util/IntMap$Entry;->key:I

    .line 31
    .line 32
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 33
    .line 34
    aget-object v0, v0, v2

    .line 35
    .line 36
    iput-object v0, v3, Lcom/esotericsoftware/kryo/util/IntMap$Entry;->value:Ljava/lang/Object;

    .line 37
    .line 38
    :goto_0
    iput v2, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->currentIndex:I

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->findNextIndex()V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap$Entries;->entry:Lcom/esotericsoftware/kryo/util/IntMap$Entry;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_1
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 47
    .line 48
    const-string v0, "#iterator() cannot be used nested."

    .line 49
    .line 50
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 0

    .line 59
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/IntMap$Entries;->next()Lcom/esotericsoftware/kryo/util/IntMap$Entry;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic remove()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->remove()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic reset()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->reset()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
