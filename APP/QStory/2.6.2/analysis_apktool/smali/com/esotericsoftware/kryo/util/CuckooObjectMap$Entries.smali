.class public Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;
.super Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/util/CuckooObjectMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entries"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator<",
        "TK;TV;>;",
        "Ljava/lang/Iterable<",
        "Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry<",
        "TK;TV;>;>;",
        "Ljava/util/Iterator<",
        "Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field entry:Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/util/CuckooObjectMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/CuckooObjectMap<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;-><init>(Lcom/esotericsoftware/kryo/util/CuckooObjectMap;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;

    .line 5
    .line 6
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;->entry:Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->hasNext:Z

    .line 2
    .line 3
    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    return-object p0
.end method

.method public next()Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->hasNext:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/CuckooObjectMap;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;->entry:Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;

    .line 10
    .line 11
    iget v3, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->nextIndex:I

    .line 12
    .line 13
    aget-object v1, v1, v3

    .line 14
    .line 15
    iput-object v1, v2, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;->key:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 18
    .line 19
    aget-object v0, v0, v3

    .line 20
    .line 21
    iput-object v0, v2, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;->value:Ljava/lang/Object;

    .line 22
    .line 23
    iput v3, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->currentIndex:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->advance()V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;->entry:Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 0

    .line 36
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;->next()Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic remove()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->remove()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic reset()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->reset()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
