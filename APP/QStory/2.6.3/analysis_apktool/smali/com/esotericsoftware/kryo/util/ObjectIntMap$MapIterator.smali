.class Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/util/ObjectIntMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MapIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field currentIndex:I

.field public hasNext:Z

.field final map:Lcom/esotericsoftware/kryo/util/ObjectIntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap<",
            "TK;>;"
        }
    .end annotation
.end field

.field nextIndex:I

.field valid:Z


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->valid:Z

    .line 6
    .line 7
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/ObjectIntMap;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->reset()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public findNextIndex()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/ObjectIntMap;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    :cond_0
    iget v2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->nextIndex:I

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    add-int/2addr v2, v3

    .line 10
    iput v2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->nextIndex:I

    .line 11
    .line 12
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v2, v0, v2

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iput-boolean v3, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->hasNext:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->hasNext:Z

    .line 23
    .line 24
    return-void
.end method

.method public remove()V
    .locals 8

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->currentIndex:I

    .line 2
    .line 3
    if-ltz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/ObjectIntMap;

    .line 6
    .line 7
    iget-object v2, v1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v3, v1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 10
    .line 11
    iget v1, v1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->mask:I

    .line 12
    .line 13
    add-int/lit8 v4, v0, 0x1

    .line 14
    .line 15
    :goto_0
    and-int/2addr v4, v1

    .line 16
    aget-object v5, v2, v4

    .line 17
    .line 18
    if-eqz v5, :cond_1

    .line 19
    .line 20
    iget-object v6, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/ObjectIntMap;

    .line 21
    .line 22
    invoke-virtual {v6, v5}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->place(Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    sub-int v7, v4, v6

    .line 27
    .line 28
    and-int/2addr v7, v1

    .line 29
    sub-int v6, v0, v6

    .line 30
    .line 31
    and-int/2addr v6, v1

    .line 32
    if-le v7, v6, :cond_0

    .line 33
    .line 34
    aput-object v5, v2, v0

    .line 35
    .line 36
    aget v5, v3, v4

    .line 37
    .line 38
    aput v5, v3, v0

    .line 39
    .line 40
    move v0, v4

    .line 41
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    aput-object v1, v2, v0

    .line 46
    .line 47
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/ObjectIntMap;

    .line 48
    .line 49
    iget v2, v1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 50
    .line 51
    add-int/lit8 v2, v2, -0x1

    .line 52
    .line 53
    iput v2, v1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 54
    .line 55
    iget v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->currentIndex:I

    .line 56
    .line 57
    if-eq v0, v1, :cond_2

    .line 58
    .line 59
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->nextIndex:I

    .line 60
    .line 61
    add-int/lit8 v0, v0, -0x1

    .line 62
    .line 63
    iput v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->nextIndex:I

    .line 64
    .line 65
    :cond_2
    const/4 v0, -0x1

    .line 66
    iput v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->currentIndex:I

    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    const-string p0, "next must be called before remove."

    .line 70
    .line 71
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->currentIndex:I

    .line 3
    .line 4
    iput v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->nextIndex:I

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;->findNextIndex()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
