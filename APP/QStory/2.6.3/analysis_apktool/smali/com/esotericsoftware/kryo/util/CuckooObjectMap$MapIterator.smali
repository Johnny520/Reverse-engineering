.class Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/util/CuckooObjectMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MapIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field currentIndex:I

.field public hasNext:Z

.field final map:Lcom/esotericsoftware/kryo/util/CuckooObjectMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/CuckooObjectMap<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field nextIndex:I


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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/CuckooObjectMap;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->reset()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public advance()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->hasNext:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/CuckooObjectMap;

    .line 5
    .line 6
    iget-object v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 7
    .line 8
    iget v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 9
    .line 10
    iget v0, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 11
    .line 12
    add-int/2addr v2, v0

    .line 13
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->nextIndex:I

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    add-int/2addr v0, v3

    .line 17
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->nextIndex:I

    .line 18
    .line 19
    if-ge v0, v2, :cond_1

    .line 20
    .line 21
    aget-object v0, v1, v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iput-boolean v3, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->hasNext:Z

    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public remove()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->currentIndex:I

    .line 2
    .line 3
    if-ltz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/CuckooObjectMap;

    .line 6
    .line 7
    iget v2, v1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 8
    .line 9
    if-lt v0, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->removeStashIndex(I)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->currentIndex:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->nextIndex:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->advance()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v2, v1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    aput-object v3, v2, v0

    .line 28
    .line 29
    iget-object v1, v1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 30
    .line 31
    aput-object v3, v1, v0

    .line 32
    .line 33
    :goto_0
    const/4 v0, -0x1

    .line 34
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->currentIndex:I

    .line 35
    .line 36
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/CuckooObjectMap;

    .line 37
    .line 38
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 39
    .line 40
    add-int/lit8 v0, v0, -0x1

    .line 41
    .line 42
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const-string p0, "next must be called before remove."

    .line 46
    .line 47
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->currentIndex:I

    .line 3
    .line 4
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->nextIndex:I

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;->advance()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
