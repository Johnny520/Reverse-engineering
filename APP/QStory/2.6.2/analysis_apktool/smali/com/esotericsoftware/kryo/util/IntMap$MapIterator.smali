.class Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/util/IntMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MapIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final INDEX_ILLEGAL:I = -0x2

.field static final INDEX_ZERO:I = -0x1


# instance fields
.field currentIndex:I

.field public hasNext:Z

.field final map:Lcom/esotericsoftware/kryo/util/IntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/IntMap<",
            "TV;>;"
        }
    .end annotation
.end field

.field nextIndex:I

.field valid:Z


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/util/IntMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/IntMap<",
            "TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->valid:Z

    .line 6
    .line 7
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->reset()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public findNextIndex()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    :cond_0
    iget v2, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->nextIndex:I

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    add-int/2addr v2, v3

    .line 10
    iput v2, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->nextIndex:I

    .line 11
    .line 12
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget v2, v0, v2

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iput-boolean v3, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->hasNext:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->hasNext:Z

    .line 23
    .line 24
    return-void
.end method

.method public remove()V
    .locals 9

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->currentIndex:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 8
    .line 9
    iget-boolean v3, v1, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    iput-boolean v2, v1, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    if-ltz v0, :cond_4

    .line 17
    .line 18
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 19
    .line 20
    iget-object v3, v1, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 21
    .line 22
    iget-object v4, v1, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 23
    .line 24
    iget v1, v1, Lcom/esotericsoftware/kryo/util/IntMap;->mask:I

    .line 25
    .line 26
    add-int/lit8 v5, v0, 0x1

    .line 27
    .line 28
    :goto_0
    and-int/2addr v5, v1

    .line 29
    aget v6, v3, v5

    .line 30
    .line 31
    if-eqz v6, :cond_2

    .line 32
    .line 33
    iget-object v7, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 34
    .line 35
    invoke-virtual {v7, v6}, Lcom/esotericsoftware/kryo/util/IntMap;->place(I)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    sub-int v8, v5, v7

    .line 40
    .line 41
    and-int/2addr v8, v1

    .line 42
    sub-int v7, v0, v7

    .line 43
    .line 44
    and-int/2addr v7, v1

    .line 45
    if-le v8, v7, :cond_1

    .line 46
    .line 47
    aput v6, v3, v0

    .line 48
    .line 49
    aget-object v6, v4, v5

    .line 50
    .line 51
    aput-object v6, v4, v0

    .line 52
    .line 53
    move v0, v5

    .line 54
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    aput v2, v3, v0

    .line 58
    .line 59
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->currentIndex:I

    .line 60
    .line 61
    if-eq v0, v1, :cond_3

    .line 62
    .line 63
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->nextIndex:I

    .line 64
    .line 65
    add-int/lit8 v0, v0, -0x1

    .line 66
    .line 67
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->nextIndex:I

    .line 68
    .line 69
    :cond_3
    :goto_1
    const/4 v0, -0x2

    .line 70
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->currentIndex:I

    .line 71
    .line 72
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 73
    .line 74
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 75
    .line 76
    add-int/lit8 v0, v0, -0x1

    .line 77
    .line 78
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    const-string p0, "next must be called before remove."

    .line 82
    .line 83
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    const/4 v0, -0x2

    .line 2
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->currentIndex:I

    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->nextIndex:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->map:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 8
    .line 9
    iget-boolean v0, v0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->hasNext:Z

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;->findNextIndex()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
