.class public Lcom/esotericsoftware/kryo/util/IntMap;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/util/IntMap$Keys;,
        Lcom/esotericsoftware/kryo/util/IntMap$Values;,
        Lcom/esotericsoftware/kryo/util/IntMap$Entries;,
        Lcom/esotericsoftware/kryo/util/IntMap$MapIterator;,
        Lcom/esotericsoftware/kryo/util/IntMap$Entry;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lcom/esotericsoftware/kryo/util/IntMap$Entry<",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field hasZeroValue:Z

.field keyTable:[I

.field private final loadFactor:F

.field protected mask:I

.field protected shift:I

.field public size:I

.field private threshold:I

.field valueTable:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TV;"
        }
    .end annotation
.end field

.field zeroValue:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x33

    const v1, 0x3f4ccccd    # 0.8f

    .line 54
    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/IntMap;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const v0, 0x3f4ccccd    # 0.8f

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/util/IntMap;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    cmpg-float v0, p2, v0

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    cmpl-float v0, p2, v0

    .line 12
    .line 13
    if-gez v0, :cond_0

    .line 14
    .line 15
    iput p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->loadFactor:F

    .line 16
    .line 17
    invoke-static {p1, p2}, Lcom/esotericsoftware/kryo/util/ObjectMap;->tableSize(IF)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    int-to-float v0, p1

    .line 22
    mul-float/2addr v0, p2

    .line 23
    float-to-int p2, v0

    .line 24
    iput p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->threshold:I

    .line 25
    .line 26
    add-int/lit8 p2, p1, -0x1

    .line 27
    .line 28
    iput p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->mask:I

    .line 29
    .line 30
    int-to-long v0, p2

    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iput p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->shift:I

    .line 36
    .line 37
    new-array p2, p1, [I

    .line 38
    .line 39
    iput-object p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 40
    .line 41
    new-array p1, p1, [Ljava/lang/Object;

    .line 42
    .line 43
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    const-string p0, "loadFactor must be > 0 and < 1: "

    .line 47
    .line 48
    invoke-static {p0, p2}, Lcom/esotericsoftware/kryo/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;F)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    throw p0
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/util/IntMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/IntMap<",
            "+TV;>;)V"
        }
    .end annotation

    .line 55
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    array-length v0, v0

    int-to-float v0, v0

    iget v1, p1, Lcom/esotericsoftware/kryo/util/IntMap;->loadFactor:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/IntMap;-><init>(IF)V

    .line 56
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 57
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    iget v0, p1, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 59
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 60
    iget-boolean p1, p1, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    return-void
.end method

.method private locateKey(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->place(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    :goto_0
    aget v2, v0, v1

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    neg-int p0, v1

    .line 14
    return p0

    .line 15
    :cond_0
    if-ne v2, p1, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    iget v2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->mask:I

    .line 21
    .line 22
    and-int/2addr v1, v2

    .line 23
    goto :goto_0
.end method

.method private putResize(ILjava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->place(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    :goto_0
    aget v2, v0, v1

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    aput p1, v0, v1

    .line 12
    .line 13
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p2, p0, v1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    iget v2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->mask:I

    .line 21
    .line 22
    and-int/2addr v1, v2

    .line 23
    goto :goto_0
.end method

.method private resize(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    int-to-float v1, p1

    .line 5
    iget v2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->loadFactor:F

    .line 6
    .line 7
    mul-float/2addr v1, v2

    .line 8
    float-to-int v1, v1

    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->threshold:I

    .line 10
    .line 11
    add-int/lit8 v1, p1, -0x1

    .line 12
    .line 13
    iput v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->mask:I

    .line 14
    .line 15
    int-to-long v1, v1

    .line 16
    invoke-static {v1, v2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iput v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->shift:I

    .line 21
    .line 22
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 23
    .line 24
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 25
    .line 26
    new-array v3, p1, [I

    .line 27
    .line 28
    iput-object v3, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 29
    .line 30
    new-array p1, p1, [Ljava/lang/Object;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 33
    .line 34
    iget p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 35
    .line 36
    if-lez p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    :goto_0
    if-ge p1, v0, :cond_1

    .line 40
    .line 41
    aget v3, v1, p1

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    aget-object v4, v2, p1

    .line 46
    .line 47
    invoke-direct {p0, v3, v4}, Lcom/esotericsoftware/kryo/util/IntMap;->putResize(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 3

    .line 28
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 30
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    .line 31
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    iput-object v2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 33
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    return-void
.end method

.method public clear(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->loadFactor:F

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->tableSize(IF)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    if-gt v0, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/IntMap;->clear()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->resize(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public containsKey(I)Z
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->locateKey(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-ltz p0, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_1
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public containsValue(Ljava/lang/Object;Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez p1, :cond_2

    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 16
    .line 17
    array-length p1, v0

    .line 18
    sub-int/2addr p1, v1

    .line 19
    :goto_0
    if-ltz p1, :cond_8

    .line 20
    .line 21
    aget p2, p0, p1

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    aget-object p2, v0, p1

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    add-int/lit8 p1, p1, -0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    if-eqz p2, :cond_5

    .line 34
    .line 35
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 36
    .line 37
    if-ne p1, p0, :cond_3

    .line 38
    .line 39
    return v1

    .line 40
    :cond_3
    array-length p0, v0

    .line 41
    sub-int/2addr p0, v1

    .line 42
    :goto_1
    if-ltz p0, :cond_8

    .line 43
    .line 44
    aget-object p2, v0, p0

    .line 45
    .line 46
    if-ne p2, p1, :cond_4

    .line 47
    .line 48
    return v1

    .line 49
    :cond_4
    add-int/lit8 p0, p0, -0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_5
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 53
    .line 54
    if-eqz p2, :cond_6

    .line 55
    .line 56
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_6

    .line 63
    .line 64
    return v1

    .line 65
    :cond_6
    array-length p0, v0

    .line 66
    sub-int/2addr p0, v1

    .line 67
    :goto_2
    if-ltz p0, :cond_8

    .line 68
    .line 69
    aget-object p2, v0, p0

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_7

    .line 76
    .line 77
    return v1

    .line 78
    :cond_7
    add-int/lit8 p0, p0, -0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_8
    const/4 p0, 0x0

    .line 82
    return p0
.end method

.method public ensureCapacity(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iget p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->loadFactor:F

    .line 5
    .line 6
    invoke-static {v0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->tableSize(IF)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    if-ge v0, p1, :cond_0

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->resize(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public entries()Lcom/esotericsoftware/kryo/util/IntMap$Entries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/IntMap$Entries<",
            "TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/IntMap$Entries;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/IntMap$Entries;-><init>(Lcom/esotericsoftware/kryo/util/IntMap;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/esotericsoftware/kryo/util/IntMap;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/esotericsoftware/kryo/util/IntMap;

    .line 12
    .line 13
    iget v1, p1, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p1, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 21
    .line 22
    iget-boolean v3, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    if-eqz v3, :cond_5

    .line 28
    .line 29
    iget-object v1, p1, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 32
    .line 33
    if-nez v1, :cond_4

    .line 34
    .line 35
    if-eqz v3, :cond_5

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 46
    .line 47
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 48
    .line 49
    array-length v3, v1

    .line 50
    move v4, v2

    .line 51
    :goto_0
    if-ge v4, v3, :cond_8

    .line 52
    .line 53
    aget v5, v1, v4

    .line 54
    .line 55
    if-eqz v5, :cond_7

    .line 56
    .line 57
    aget-object v6, p0, v4

    .line 58
    .line 59
    if-nez v6, :cond_6

    .line 60
    .line 61
    sget-object v6, Lcom/esotericsoftware/kryo/util/ObjectMap;->dummy:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {p1, v5, v6}, Lcom/esotericsoftware/kryo/util/IntMap;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    if-eqz v5, :cond_7

    .line 68
    .line 69
    return v2

    .line 70
    :cond_6
    invoke-virtual {p1, v5}, Lcom/esotericsoftware/kryo/util/IntMap;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-nez v5, :cond_7

    .line 79
    .line 80
    return v2

    .line 81
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    return v0
.end method

.method public equalsIdentity(Ljava/lang/Object;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/esotericsoftware/kryo/util/IntMap;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/esotericsoftware/kryo/util/IntMap;

    .line 12
    .line 13
    iget v1, p1, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p1, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 21
    .line 22
    iget-boolean v3, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    if-eqz v3, :cond_4

    .line 28
    .line 29
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v3, p1, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 32
    .line 33
    if-eq v1, v3, :cond_4

    .line 34
    .line 35
    return v2

    .line 36
    :cond_4
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 37
    .line 38
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 39
    .line 40
    array-length v3, v1

    .line 41
    move v4, v2

    .line 42
    :goto_0
    if-ge v4, v3, :cond_6

    .line 43
    .line 44
    aget v5, v1, v4

    .line 45
    .line 46
    if-eqz v5, :cond_5

    .line 47
    .line 48
    aget-object v6, p0, v4

    .line 49
    .line 50
    sget-object v7, Lcom/esotericsoftware/kryo/util/ObjectMap;->dummy:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {p1, v5, v7}, Lcom/esotericsoftware/kryo/util/IntMap;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-eq v6, v5, :cond_5

    .line 57
    .line 58
    return v2

    .line 59
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    return v0
.end method

.method public findKey(Ljava/lang/Object;ZI)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_2

    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 16
    .line 17
    array-length p1, v0

    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    :goto_0
    if-ltz p1, :cond_8

    .line 21
    .line 22
    aget p2, p0, p1

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    aget-object v1, v0, p1

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return p2

    .line 31
    :cond_1
    add-int/lit8 p1, p1, -0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    if-eqz p2, :cond_5

    .line 35
    .line 36
    iget-object p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 37
    .line 38
    if-ne p1, p2, :cond_3

    .line 39
    .line 40
    return v1

    .line 41
    :cond_3
    array-length p2, v0

    .line 42
    add-int/lit8 p2, p2, -0x1

    .line 43
    .line 44
    :goto_1
    if-ltz p2, :cond_8

    .line 45
    .line 46
    aget-object v1, v0, p2

    .line 47
    .line 48
    if-ne v1, p1, :cond_4

    .line 49
    .line 50
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 51
    .line 52
    aget p0, p0, p2

    .line 53
    .line 54
    return p0

    .line 55
    :cond_4
    add-int/lit8 p2, p2, -0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 59
    .line 60
    if-eqz p2, :cond_6

    .line 61
    .line 62
    iget-object p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_6

    .line 69
    .line 70
    return v1

    .line 71
    :cond_6
    array-length p2, v0

    .line 72
    add-int/lit8 p2, p2, -0x1

    .line 73
    .line 74
    :goto_2
    if-ltz p2, :cond_8

    .line 75
    .line 76
    aget-object v1, v0, p2

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_7

    .line 83
    .line 84
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 85
    .line 86
    aget p0, p0, p2

    .line 87
    .line 88
    return p0

    .line 89
    :cond_7
    add-int/lit8 p2, p2, -0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_8
    return p3
.end method

.method public get(I)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_1

    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    return-object v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->place(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    :goto_0
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 17
    .line 18
    aget v2, v2, v1

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_2
    if-ne v2, p1, :cond_3

    .line 24
    .line 25
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object p0, p0, v1

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    iget v2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->mask:I

    .line 33
    .line 34
    and-int/2addr v1, v2

    .line 35
    goto :goto_0
.end method

.method public get(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    if-nez p1, :cond_1

    .line 36
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    if-eqz p1, :cond_0

    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0

    .line 37
    :cond_1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->place(I)I

    move-result v0

    .line 38
    :goto_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    aget v1, v1, v0

    if-nez v1, :cond_2

    return-object p2

    :cond_2
    if-ne v1, p1, :cond_3

    .line 39
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    aget-object p0, p0, v0

    return-object p0

    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 40
    iget v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->mask:I

    and-int/2addr v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 17
    .line 18
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 19
    .line 20
    array-length v2, v1

    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_0
    if-ge v3, v2, :cond_3

    .line 23
    .line 24
    aget v4, v1, v3

    .line 25
    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    mul-int/lit8 v4, v4, 0x1f

    .line 29
    .line 30
    add-int/2addr v4, v0

    .line 31
    aget-object v0, p0, v3

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/2addr v0, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v0, v4

    .line 42
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    return v0
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
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
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/IntMap;->entries()Lcom/esotericsoftware/kryo/util/IntMap$Entries;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public keys()Lcom/esotericsoftware/kryo/util/IntMap$Keys;
    .locals 1

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/IntMap$Keys;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/IntMap$Keys;-><init>(Lcom/esotericsoftware/kryo/util/IntMap;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public notEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public place(I)I
    .locals 4

    .line 1
    int-to-long v0, p1

    .line 2
    const-wide v2, -0x61c8864680b583ebL

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    mul-long/2addr v0, v2

    .line 8
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->shift:I

    .line 9
    .line 10
    ushr-long p0, v0, p0

    .line 11
    .line 12
    long-to-int p0, p0

    .line 13
    return p0
.end method

.method public put(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_1

    .line 3
    .line 4
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 7
    .line 8
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 13
    .line 14
    iget p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 15
    .line 16
    add-int/2addr p2, v0

    .line 17
    iput p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 18
    .line 19
    :cond_0
    return-object p1

    .line 20
    :cond_1
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->locateKey(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-ltz v1, :cond_2

    .line 25
    .line 26
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object p1, p0, v1

    .line 29
    .line 30
    aput-object p2, p0, v1

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_2
    add-int/2addr v1, v0

    .line 34
    neg-int v1, v1

    .line 35
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 36
    .line 37
    aput p1, v2, v1

    .line 38
    .line 39
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 40
    .line 41
    aput-object p2, p1, v1

    .line 42
    .line 43
    iget p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 44
    .line 45
    add-int/2addr p1, v0

    .line 46
    iput p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 47
    .line 48
    iget p2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->threshold:I

    .line 49
    .line 50
    if-lt p1, p2, :cond_3

    .line 51
    .line 52
    array-length p1, v2

    .line 53
    shl-int/2addr p1, v0

    .line 54
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->resize(I)V

    .line 55
    .line 56
    .line 57
    :cond_3
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method

.method public putAll(Lcom/esotericsoftware/kryo/util/IntMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/IntMap<",
            "+TV;>;)V"
        }
    .end annotation

    .line 1
    iget v0, p1, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/IntMap;->ensureCapacity(I)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p1, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lcom/esotericsoftware/kryo/util/IntMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 17
    .line 18
    iget-object p1, p1, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 19
    .line 20
    array-length v2, v0

    .line 21
    :goto_0
    if-ge v1, v2, :cond_2

    .line 22
    .line 23
    aget v3, v0, v1

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    aget-object v4, p1, v1

    .line 28
    .line 29
    invoke-virtual {p0, v3, v4}, Lcom/esotericsoftware/kryo/util/IntMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return-void
.end method

.method public remove(I)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 11
    .line 12
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 15
    .line 16
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->locateKey(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-gez p1, :cond_2

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_2
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 31
    .line 32
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 33
    .line 34
    aget-object v3, v2, p1

    .line 35
    .line 36
    iget v4, p0, Lcom/esotericsoftware/kryo/util/IntMap;->mask:I

    .line 37
    .line 38
    add-int/lit8 v5, p1, 0x1

    .line 39
    .line 40
    :goto_0
    and-int/2addr v5, v4

    .line 41
    aget v6, v1, v5

    .line 42
    .line 43
    if-eqz v6, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0, v6}, Lcom/esotericsoftware/kryo/util/IntMap;->place(I)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    sub-int v8, v5, v7

    .line 50
    .line 51
    and-int/2addr v8, v4

    .line 52
    sub-int v7, p1, v7

    .line 53
    .line 54
    and-int/2addr v7, v4

    .line 55
    if-le v8, v7, :cond_3

    .line 56
    .line 57
    aput v6, v1, p1

    .line 58
    .line 59
    aget-object v6, v2, v5

    .line 60
    .line 61
    aput-object v6, v2, p1

    .line 62
    .line 63
    move p1, v5

    .line 64
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    aput v0, v1, p1

    .line 68
    .line 69
    iget p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 70
    .line 71
    add-int/lit8 p1, p1, -0x1

    .line 72
    .line 73
    iput p1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 74
    .line 75
    return-object v3
.end method

.method public shrink(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->loadFactor:F

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->tableSize(IF)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 10
    .line 11
    array-length v0, v0

    .line 12
    if-le v0, p1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->resize(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    const-string p0, "maximumCapacity must be >= 0: "

    .line 19
    .line 20
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->size:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p0, "[]"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const/16 v1, 0x20

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x5b

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/IntMap;->keyTable:[I

    .line 21
    .line 22
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/IntMap;->valueTable:[Ljava/lang/Object;

    .line 23
    .line 24
    array-length v3, v1

    .line 25
    iget-boolean v4, p0, Lcom/esotericsoftware/kryo/util/IntMap;->hasZeroValue:Z

    .line 26
    .line 27
    const/16 v5, 0x3d

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    const-string v4, "0="

    .line 32
    .line 33
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/IntMap;->zeroValue:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_0
    add-int/lit8 p0, v3, -0x1

    .line 43
    .line 44
    if-lez v3, :cond_3

    .line 45
    .line 46
    aget v3, v1, p0

    .line 47
    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    move v3, p0

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    aget-object v3, v2, p0

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :cond_3
    :goto_1
    move v3, p0

    .line 64
    :goto_2
    add-int/lit8 p0, v3, -0x1

    .line 65
    .line 66
    if-lez v3, :cond_5

    .line 67
    .line 68
    aget v3, v1, p0

    .line 69
    .line 70
    if-nez v3, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const-string v4, ", "

    .line 74
    .line 75
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    aget-object v3, v2, p0

    .line 85
    .line 86
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    const/16 p0, 0x5d

    .line 91
    .line 92
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0
.end method

.method public values()Lcom/esotericsoftware/kryo/util/IntMap$Values;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/IntMap$Values<",
            "TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/IntMap$Values;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/IntMap$Values;-><init>(Lcom/esotericsoftware/kryo/util/IntMap;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
