.class public Lcom/esotericsoftware/kryo/util/ObjectIntMap;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/util/ObjectIntMap$Keys;,
        Lcom/esotericsoftware/kryo/util/ObjectIntMap$Values;,
        Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;,
        Lcom/esotericsoftware/kryo/util/ObjectIntMap$MapIterator;,
        Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entry<",
        "TK;>;>;"
    }
.end annotation


# instance fields
.field keyTable:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TK;"
        }
    .end annotation
.end field

.field loadFactor:F

.field protected mask:I

.field protected shift:I

.field public size:I

.field threshold:I

.field valueTable:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x33

    const v1, 0x3f4ccccd    # 0.8f

    .line 54
    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const v0, 0x3f4ccccd    # 0.8f

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;-><init>(IF)V

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
    iput p2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->loadFactor:F

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
    iput p2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->threshold:I

    .line 25
    .line 26
    add-int/lit8 p2, p1, -0x1

    .line 27
    .line 28
    iput p2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->mask:I

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
    iput p2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->shift:I

    .line 36
    .line 37
    new-array p2, p1, [Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 40
    .line 41
    new-array p1, p1, [I

    .line 42
    .line 43
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

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

.method public constructor <init>(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap<",
            "+TK;>;)V"
        }
    .end annotation

    .line 55
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    array-length v0, v0

    int-to-float v0, v0

    iget v1, p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->loadFactor:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;-><init>(IF)V

    .line 56
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 57
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    iget p1, p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    iput p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    return-void
.end method

.method private putResize(Ljava/lang/Object;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->place(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    :goto_0
    aget-object v2, v0, v1

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    aput-object p1, v0, v1

    .line 12
    .line 13
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 14
    .line 15
    aput p2, p0, v1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    iget v2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->mask:I

    .line 21
    .line 22
    and-int/2addr v1, v2

    .line 23
    goto :goto_0
.end method

.method private toString(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const-string p0, "{}"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, ""

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const/16 v1, 0x20

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 18
    .line 19
    .line 20
    if-eqz p2, :cond_2

    .line 21
    .line 22
    const/16 v1, 0x7b

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    :cond_2
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 28
    .line 29
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 30
    .line 31
    array-length v2, v1

    .line 32
    :goto_0
    add-int/lit8 v3, v2, -0x1

    .line 33
    .line 34
    const/16 v4, 0x3d

    .line 35
    .line 36
    if-lez v2, :cond_4

    .line 37
    .line 38
    aget-object v2, v1, v3

    .line 39
    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    move v2, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    aget v2, p0, v3

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :cond_4
    :goto_1
    add-int/lit8 v2, v3, -0x1

    .line 56
    .line 57
    if-lez v3, :cond_6

    .line 58
    .line 59
    aget-object v3, v1, v2

    .line 60
    .line 61
    if-nez v3, :cond_5

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    aget v3, p0, v2

    .line 74
    .line 75
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    :goto_2
    move v3, v2

    .line 79
    goto :goto_1

    .line 80
    :cond_6
    if-eqz p2, :cond_7

    .line 81
    .line 82
    const/16 p0, 0x7d

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 23
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 24
    iput v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 25
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public clear(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->loadFactor:F

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->tableSize(IF)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    if-gt v0, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->clear()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->resize(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->locateKey(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public containsValue(I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 4
    .line 5
    array-length v1, p0

    .line 6
    const/4 v2, 0x1

    .line 7
    sub-int/2addr v1, v2

    .line 8
    :goto_0
    if-ltz v1, :cond_1

    .line 9
    .line 10
    aget-object v3, v0, v1

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    aget v3, p0, v1

    .line 15
    .line 16
    if-ne v3, p1, :cond_0

    .line 17
    .line 18
    return v2

    .line 19
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public ensureCapacity(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iget p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->loadFactor:F

    .line 5
    .line 6
    invoke-static {v0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->tableSize(IF)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    if-ge v0, p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->resize(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public entries()Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries<",
            "TK;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;-><init>(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V

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
    instance-of v1, p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;

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
    check-cast p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;

    .line 12
    .line 13
    iget v1, p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 23
    .line 24
    array-length v3, v1

    .line 25
    move v4, v2

    .line 26
    :goto_0
    if-ge v4, v3, :cond_5

    .line 27
    .line 28
    aget-object v5, v1, v4

    .line 29
    .line 30
    if-eqz v5, :cond_4

    .line 31
    .line 32
    invoke-virtual {p1, v5, v2}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->get(Ljava/lang/Object;I)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_3

    .line 37
    .line 38
    invoke-virtual {p1, v5}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->containsKey(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_3

    .line 43
    .line 44
    return v2

    .line 45
    :cond_3
    aget v5, p0, v4

    .line 46
    .line 47
    if-eq v6, v5, :cond_4

    .line 48
    .line 49
    return v2

    .line 50
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    return v0
.end method

.method public findKey(I)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 4
    .line 5
    array-length v1, p0

    .line 6
    add-int/lit8 v1, v1, -0x1

    .line 7
    .line 8
    :goto_0
    if-ltz v1, :cond_1

    .line 9
    .line 10
    aget-object v2, v0, v1

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    aget v3, p0, v1

    .line 15
    .line 16
    if-ne v3, p1, :cond_0

    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public get(Ljava/lang/Object;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->locateKey(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    return p2

    .line 8
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 9
    .line 10
    aget p0, p0, p1

    .line 11
    .line 12
    return p0
.end method

.method public getAndIncrement(Ljava/lang/Object;II)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;II)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->locateKey(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 8
    .line 9
    aget p1, p0, v0

    .line 10
    .line 11
    add-int/2addr p3, p1

    .line 12
    aput p3, p0, v0

    .line 13
    .line 14
    return p1

    .line 15
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    neg-int v0, v0

    .line 18
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 19
    .line 20
    aput-object p1, v1, v0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 23
    .line 24
    add-int/2addr p3, p2

    .line 25
    aput p3, p1, v0

    .line 26
    .line 27
    iget p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    iput p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 32
    .line 33
    iget p3, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->threshold:I

    .line 34
    .line 35
    if-lt p1, p3, :cond_1

    .line 36
    .line 37
    array-length p1, v1

    .line 38
    shl-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->resize(I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return p2
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v2, :cond_1

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    aget v5, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, v5

    .line 22
    add-int/2addr v4, v0

    .line 23
    move v0, v4

    .line 24
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return v0
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

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
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->entries()Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->iterator()Lcom/esotericsoftware/kryo/util/ObjectIntMap$Entries;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public keys()Lcom/esotericsoftware/kryo/util/ObjectIntMap$Keys;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap$Keys<",
            "TK;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Keys;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Keys;-><init>(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public locateKey(Ljava/lang/Object;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->place(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    :goto_0
    aget-object v2, v0, v1

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    neg-int p0, v1

    .line 16
    return p0

    .line 17
    :cond_0
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    iget v2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->mask:I

    .line 27
    .line 28
    and-int/2addr v1, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-string p0, "key cannot be null."

    .line 31
    .line 32
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public notEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

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

.method public place(Ljava/lang/Object;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-long v0, p1

    .line 6
    const-wide v2, -0x61c8864680b583ebL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    mul-long/2addr v0, v2

    .line 12
    iget p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->shift:I

    .line 13
    .line 14
    ushr-long p0, v0, p0

    .line 15
    .line 16
    long-to-int p0, p0

    .line 17
    return p0
.end method

.method public put(Ljava/lang/Object;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->locateKey(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 8
    .line 9
    aput p2, p0, v0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    neg-int v0, v0

    .line 15
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 16
    .line 17
    aput-object p1, v1, v0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 20
    .line 21
    aput p2, p1, v0

    .line 22
    .line 23
    iget p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 24
    .line 25
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    iput p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 28
    .line 29
    iget p2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->threshold:I

    .line 30
    .line 31
    if-lt p1, p2, :cond_1

    .line 32
    .line 33
    array-length p1, v1

    .line 34
    shl-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->resize(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public putAll(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/ObjectIntMap<",
            "+TK;>;)V"
        }
    .end annotation

    .line 1
    iget v0, p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->ensureCapacity(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    aget v4, p1, v2

    .line 19
    .line 20
    invoke-virtual {p0, v3, v4}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->put(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method public remove(Ljava/lang/Object;I)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->locateKey(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    return p2

    .line 8
    :cond_0
    iget-object p2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 11
    .line 12
    aget v1, v0, p1

    .line 13
    .line 14
    iget v2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->mask:I

    .line 15
    .line 16
    add-int/lit8 v3, p1, 0x1

    .line 17
    .line 18
    :goto_0
    and-int/2addr v3, v2

    .line 19
    aget-object v4, p2, v3

    .line 20
    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->place(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    sub-int v6, v3, v5

    .line 28
    .line 29
    and-int/2addr v6, v2

    .line 30
    sub-int v5, p1, v5

    .line 31
    .line 32
    and-int/2addr v5, v2

    .line 33
    if-le v6, v5, :cond_1

    .line 34
    .line 35
    aput-object v4, p2, p1

    .line 36
    .line 37
    aget v4, v0, v3

    .line 38
    .line 39
    aput v4, v0, p1

    .line 40
    .line 41
    move p1, v3

    .line 42
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    aput-object v0, p2, p1

    .line 47
    .line 48
    iget p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 49
    .line 50
    add-int/lit8 p1, p1, -0x1

    .line 51
    .line 52
    iput p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 53
    .line 54
    return v1
.end method

.method public final resize(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    int-to-float v1, p1

    .line 5
    iget v2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->loadFactor:F

    .line 6
    .line 7
    mul-float/2addr v1, v2

    .line 8
    float-to-int v1, v1

    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->threshold:I

    .line 10
    .line 11
    add-int/lit8 v1, p1, -0x1

    .line 12
    .line 13
    iput v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->mask:I

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
    iput v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->shift:I

    .line 21
    .line 22
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 25
    .line 26
    new-array v3, p1, [Ljava/lang/Object;

    .line 27
    .line 28
    iput-object v3, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 29
    .line 30
    new-array p1, p1, [I

    .line 31
    .line 32
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 33
    .line 34
    iget p1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

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
    aget-object v3, v1, p1

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    aget v4, v2, p1

    .line 46
    .line 47
    invoke-direct {p0, v3, v4}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->putResize(Ljava/lang/Object;I)V

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

.method public shrink(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->loadFactor:F

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->tableSize(IF)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 10
    .line 11
    array-length v0, v0

    .line 12
    if-le v0, p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->resize(I)V

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
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

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
    .locals 2

    .line 92
    const-string v0, ", "

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->toString(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 93
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->toString(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public values()Lcom/esotericsoftware/kryo/util/ObjectIntMap$Values;
    .locals 1

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Values;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap$Values;-><init>(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
