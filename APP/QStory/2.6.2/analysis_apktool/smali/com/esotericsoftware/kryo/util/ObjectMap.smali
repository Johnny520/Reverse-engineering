.class public Lcom/esotericsoftware/kryo/util/ObjectMap;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/util/ObjectMap$Keys;,
        Lcom/esotericsoftware/kryo/util/ObjectMap$Values;,
        Lcom/esotericsoftware/kryo/util/ObjectMap$Entries;,
        Lcom/esotericsoftware/kryo/util/ObjectMap$MapIterator;,
        Lcom/esotericsoftware/kryo/util/ObjectMap$Entry;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lcom/esotericsoftware/kryo/util/ObjectMap$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# static fields
.field static final dummy:Ljava/lang/Object;


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

.field valueTable:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TV;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/esotericsoftware/kryo/util/ObjectMap;->dummy:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x33

    const v1, 0x3f4ccccd    # 0.8f

    .line 54
    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/ObjectMap;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const v0, 0x3f4ccccd    # 0.8f

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;-><init>(IF)V

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
    iput p2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->loadFactor:F

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
    iput p2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->threshold:I

    .line 25
    .line 26
    add-int/lit8 p2, p1, -0x1

    .line 27
    .line 28
    iput p2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

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
    iput p2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->shift:I

    .line 36
    .line 37
    new-array p2, p1, [Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 40
    .line 41
    new-array p1, p1, [Ljava/lang/Object;

    .line 42
    .line 43
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

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

.method public constructor <init>(Lcom/esotericsoftware/kryo/util/ObjectMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/ObjectMap<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    .line 55
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    array-length v0, v0

    int-to-float v0, v0

    iget v1, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;->loadFactor:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/ObjectMap;-><init>(IF)V

    .line 56
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 57
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    iget p1, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    iput p1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    return-void
.end method

.method public static nextPowerOfTwo(I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    add-int/lit8 p0, p0, -0x1

    .line 6
    .line 7
    shr-int/lit8 v1, p0, 0x1

    .line 8
    .line 9
    or-int/2addr p0, v1

    .line 10
    shr-int/lit8 v1, p0, 0x2

    .line 11
    .line 12
    or-int/2addr p0, v1

    .line 13
    shr-int/lit8 v1, p0, 0x4

    .line 14
    .line 15
    or-int/2addr p0, v1

    .line 16
    shr-int/lit8 v1, p0, 0x8

    .line 17
    .line 18
    or-int/2addr p0, v1

    .line 19
    shr-int/lit8 v1, p0, 0x10

    .line 20
    .line 21
    or-int/2addr p0, v1

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method private putResize(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->place(Ljava/lang/Object;)I

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
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

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
    iget v2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

    .line 21
    .line 22
    and-int/2addr v1, v2

    .line 23
    goto :goto_0
.end method

.method public static tableSize(IF)I
    .locals 2

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    int-to-float v0, p0

    .line 4
    div-float/2addr v0, p1

    .line 5
    float-to-double v0, v0

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    double-to-int p1, v0

    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->nextPowerOfTwo(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/high16 v0, 0x40000000    # 2.0f

    .line 21
    .line 22
    if-gt p1, v0, :cond_0

    .line 23
    .line 24
    return p1

    .line 25
    :cond_0
    const-string p1, "The required capacity is too large: "

    .line 26
    .line 27
    invoke-static {p0, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    const-string p1, "capacity must be >= 0: "

    .line 37
    .line 38
    invoke-static {p0, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0
.end method

.method private toString(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 30
    .line 31
    array-length v3, v1

    .line 32
    :goto_0
    add-int/lit8 v4, v3, -0x1

    .line 33
    .line 34
    const/16 v5, 0x3d

    .line 35
    .line 36
    const-string v6, "(this)"

    .line 37
    .line 38
    if-lez v3, :cond_6

    .line 39
    .line 40
    aget-object v3, v1, v4

    .line 41
    .line 42
    if-nez v3, :cond_3

    .line 43
    .line 44
    move v3, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    if-ne v3, p0, :cond_4

    .line 47
    .line 48
    move-object v3, v6

    .line 49
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    aget-object v3, v2, v4

    .line 56
    .line 57
    if-ne v3, p0, :cond_5

    .line 58
    .line 59
    move-object v3, v6

    .line 60
    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :cond_6
    :goto_1
    add-int/lit8 v3, v4, -0x1

    .line 64
    .line 65
    if-lez v4, :cond_a

    .line 66
    .line 67
    aget-object v4, v1, v3

    .line 68
    .line 69
    if-nez v4, :cond_7

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_7
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    if-ne v4, p0, :cond_8

    .line 76
    .line 77
    move-object v4, v6

    .line 78
    :cond_8
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    aget-object v4, v2, v3

    .line 85
    .line 86
    if-ne v4, p0, :cond_9

    .line 87
    .line 88
    move-object v4, v6

    .line 89
    :cond_9
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    :goto_2
    move v4, v3

    .line 93
    goto :goto_1

    .line 94
    :cond_a
    if-eqz p2, :cond_b

    .line 95
    .line 96
    const/16 p0, 0x7d

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_b
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 23
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 24
    iput v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 25
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    invoke-static {p0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public clear(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->loadFactor:F

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->tableSize(IF)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    if-gt v0, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->clear()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->resize(I)V

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
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->locateKey(Ljava/lang/Object;)I

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

.method public containsValue(Ljava/lang/Object;Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 7
    .line 8
    array-length p1, v0

    .line 9
    sub-int/2addr p1, v1

    .line 10
    :goto_0
    if-ltz p1, :cond_5

    .line 11
    .line 12
    aget-object p2, p0, p1

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    aget-object p2, v0, p1

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    if-eqz p2, :cond_3

    .line 25
    .line 26
    array-length p0, v0

    .line 27
    sub-int/2addr p0, v1

    .line 28
    :goto_1
    if-ltz p0, :cond_5

    .line 29
    .line 30
    aget-object p2, v0, p0

    .line 31
    .line 32
    if-ne p2, p1, :cond_2

    .line 33
    .line 34
    return v1

    .line 35
    :cond_2
    add-int/lit8 p0, p0, -0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    array-length p0, v0

    .line 39
    sub-int/2addr p0, v1

    .line 40
    :goto_2
    if-ltz p0, :cond_5

    .line 41
    .line 42
    aget-object p2, v0, p0

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_4

    .line 49
    .line 50
    return v1

    .line 51
    :cond_4
    add-int/lit8 p0, p0, -0x1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_5
    const/4 p0, 0x0

    .line 55
    return p0
.end method

.method public ensureCapacity(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iget p1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->loadFactor:F

    .line 5
    .line 6
    invoke-static {v0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->tableSize(IF)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    if-ge v0, p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->resize(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public entries()Lcom/esotericsoftware/kryo/util/ObjectMap$Entries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/ObjectMap$Entries<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/ObjectMap$Entries;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/ObjectMap$Entries;-><init>(Lcom/esotericsoftware/kryo/util/ObjectMap;)V

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
    instance-of v1, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;

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
    check-cast p1, Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 12
    .line 13
    iget v1, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

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
    aget-object v6, p0, v4

    .line 33
    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    sget-object v6, Lcom/esotericsoftware/kryo/util/ObjectMap;->dummy:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {p1, v5, v6}, Lcom/esotericsoftware/kryo/util/ObjectMap;->get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-eqz v5, :cond_4

    .line 43
    .line 44
    return v2

    .line 45
    :cond_3
    invoke-virtual {p1, v5}, Lcom/esotericsoftware/kryo/util/ObjectMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_4

    .line 54
    .line 55
    return v2

    .line 56
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_5
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
    instance-of v1, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;

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
    check-cast p1, Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 12
    .line 13
    iget v1, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 23
    .line 24
    array-length v3, v1

    .line 25
    move v4, v2

    .line 26
    :goto_0
    if-ge v4, v3, :cond_4

    .line 27
    .line 28
    aget-object v5, v1, v4

    .line 29
    .line 30
    if-eqz v5, :cond_3

    .line 31
    .line 32
    aget-object v6, p0, v4

    .line 33
    .line 34
    sget-object v7, Lcom/esotericsoftware/kryo/util/ObjectMap;->dummy:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {p1, v5, v7}, Lcom/esotericsoftware/kryo/util/ObjectMap;->get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-eq v6, v5, :cond_3

    .line 41
    .line 42
    return v2

    .line 43
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    return v0
.end method

.method public findKey(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Z)TK;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 6
    .line 7
    array-length p1, v0

    .line 8
    add-int/lit8 p1, p1, -0x1

    .line 9
    .line 10
    :goto_0
    if-ltz p1, :cond_5

    .line 11
    .line 12
    aget-object p2, p0, p1

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    aget-object v1, v0, p1

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    return-object p2

    .line 21
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    if-eqz p2, :cond_3

    .line 25
    .line 26
    array-length p2, v0

    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    :goto_1
    if-ltz p2, :cond_5

    .line 30
    .line 31
    aget-object v1, v0, p2

    .line 32
    .line 33
    if-ne v1, p1, :cond_2

    .line 34
    .line 35
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 36
    .line 37
    aget-object p0, p0, p2

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    add-int/lit8 p2, p2, -0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    array-length p2, v0

    .line 44
    add-int/lit8 p2, p2, -0x1

    .line 45
    .line 46
    :goto_2
    if-ltz p2, :cond_5

    .line 47
    .line 48
    aget-object v1, v0, p2

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 57
    .line 58
    aget-object p0, p0, p2

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_4
    add-int/lit8 p2, p2, -0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:TK;>(TT;)TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->place(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object p0, p0, v0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    iget v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

    .line 27
    .line 28
    and-int/2addr v0, v1

    .line 29
    goto :goto_0
.end method

.method public get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 30
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->place(Ljava/lang/Object;)I

    move-result v0

    .line 31
    :goto_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    aget-object v1, v1, v0

    if-nez v1, :cond_0

    return-object p2

    .line 32
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    aget-object p0, p0, v0

    return-object p0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 33
    iget v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

    and-int/2addr v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v2, :cond_2

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    add-int/2addr v4, v0

    .line 20
    aget-object v0, p0, v3

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    move v0, v4

    .line 31
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return v0
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

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

.method public iterator()Lcom/esotericsoftware/kryo/util/ObjectMap$Entries;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/ObjectMap$Entries<",
            "TK;TV;>;"
        }
    .end annotation

    .line 6
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->entries()Lcom/esotericsoftware/kryo/util/ObjectMap$Entries;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->iterator()Lcom/esotericsoftware/kryo/util/ObjectMap$Entries;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public keys()Lcom/esotericsoftware/kryo/util/ObjectMap$Keys;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/ObjectMap$Keys<",
            "TK;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/ObjectMap$Keys;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/ObjectMap$Keys;-><init>(Lcom/esotericsoftware/kryo/util/ObjectMap;)V

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
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->place(Ljava/lang/Object;)I

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
    iget v2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

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
    iget p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

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
    iget p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->shift:I

    .line 13
    .line 14
    ushr-long p0, v0, p0

    .line 15
    .line 16
    long-to-int p0, p0

    .line 17
    return p0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->locateKey(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object p1, p0, v0

    .line 10
    .line 11
    aput-object p2, p0, v0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    neg-int v0, v0

    .line 17
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 18
    .line 19
    aput-object p1, v1, v0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 22
    .line 23
    aput-object p2, p1, v0

    .line 24
    .line 25
    iget p1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    iput p1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 30
    .line 31
    iget p2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->threshold:I

    .line 32
    .line 33
    if-lt p1, p2, :cond_1

    .line 34
    .line 35
    array-length p1, v1

    .line 36
    shl-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->resize(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public putAll(Lcom/esotericsoftware/kryo/util/ObjectMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/ObjectMap<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    .line 1
    iget v0, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->ensureCapacity(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

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
    aget-object v4, p1, v2

    .line 19
    .line 20
    invoke-virtual {p0, v3, v4}, Lcom/esotericsoftware/kryo/util/ObjectMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->locateKey(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-gez p1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 12
    .line 13
    aget-object v3, v2, p1

    .line 14
    .line 15
    iget v4, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

    .line 16
    .line 17
    add-int/lit8 v5, p1, 0x1

    .line 18
    .line 19
    :goto_0
    and-int/2addr v5, v4

    .line 20
    aget-object v6, v1, v5

    .line 21
    .line 22
    if-eqz v6, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v6}, Lcom/esotericsoftware/kryo/util/ObjectMap;->place(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    sub-int v8, v5, v7

    .line 29
    .line 30
    and-int/2addr v8, v4

    .line 31
    sub-int v7, p1, v7

    .line 32
    .line 33
    and-int/2addr v7, v4

    .line 34
    if-le v8, v7, :cond_1

    .line 35
    .line 36
    aput-object v6, v1, p1

    .line 37
    .line 38
    aget-object v6, v2, v5

    .line 39
    .line 40
    aput-object v6, v2, p1

    .line 41
    .line 42
    move p1, v5

    .line 43
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    aput-object v0, v1, p1

    .line 47
    .line 48
    aput-object v0, v2, p1

    .line 49
    .line 50
    iget p1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 51
    .line 52
    add-int/lit8 p1, p1, -0x1

    .line 53
    .line 54
    iput p1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 55
    .line 56
    return-object v3
.end method

.method public final resize(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    int-to-float v1, p1

    .line 5
    iget v2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->loadFactor:F

    .line 6
    .line 7
    mul-float/2addr v1, v2

    .line 8
    float-to-int v1, v1

    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->threshold:I

    .line 10
    .line 11
    add-int/lit8 v1, p1, -0x1

    .line 12
    .line 13
    iput v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

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
    iput v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->shift:I

    .line 21
    .line 22
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 25
    .line 26
    new-array v3, p1, [Ljava/lang/Object;

    .line 27
    .line 28
    iput-object v3, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 29
    .line 30
    new-array p1, p1, [Ljava/lang/Object;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 33
    .line 34
    iget p1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

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
    aget-object v4, v2, p1

    .line 46
    .line 47
    invoke-direct {p0, v3, v4}, Lcom/esotericsoftware/kryo/util/ObjectMap;->putResize(Ljava/lang/Object;Ljava/lang/Object;)V

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
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->loadFactor:F

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->tableSize(IF)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 10
    .line 11
    array-length v0, v0

    .line 12
    if-le v0, p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->resize(I)V

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
    .locals 2

    .line 106
    const-string v0, ", "

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->toString(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 107
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->toString(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public values()Lcom/esotericsoftware/kryo/util/ObjectMap$Values;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/ObjectMap$Values<",
            "TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/ObjectMap$Values;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/ObjectMap$Values;-><init>(Lcom/esotericsoftware/kryo/util/ObjectMap;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
