.class public Lcom/esotericsoftware/kryo/util/CuckooObjectMap;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Keys;,
        Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Values;,
        Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;,
        Lcom/esotericsoftware/kryo/util/CuckooObjectMap$MapIterator;,
        Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;
    }
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

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final PRIME2:I = -0x41e0eb4f

.field private static final PRIME3:I = -0x4b47d1c7

.field private static final PRIME4:I = -0x312e3dbf

.field static random:Ljava/util/Random;


# instance fields
.field capacity:I

.field private hashShift:I

.field private isBigTable:Z

.field keyTable:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TK;"
        }
    .end annotation
.end field

.field private loadFactor:F

.field private mask:I

.field private pushIterations:I

.field public size:I

.field private stashCapacity:I

.field stashSize:I

.field private threshold:I

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
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->random:Ljava/util/Random;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x20

    const v1, 0x3f4ccccd    # 0.8f

    .line 138
    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const v0, 0x3f4ccccd    # 0.8f

    .line 137
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_3

    .line 5
    .line 6
    const/high16 v0, 0x40000000    # 2.0f

    .line 7
    .line 8
    if-gt p1, v0, :cond_2

    .line 9
    .line 10
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->nextPowerOfTwo(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    cmpg-float v0, p2, v0

    .line 18
    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    iput p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->loadFactor:F

    .line 22
    .line 23
    ushr-int/lit8 v0, p1, 0x10

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->isBigTable:Z

    .line 31
    .line 32
    int-to-float v0, p1

    .line 33
    mul-float/2addr v0, p2

    .line 34
    float-to-int p2, v0

    .line 35
    iput p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 36
    .line 37
    add-int/lit8 p2, p1, -0x1

    .line 38
    .line 39
    iput p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    rsub-int/lit8 p1, p1, 0x1f

    .line 46
    .line 47
    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hashShift:I

    .line 48
    .line 49
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 50
    .line 51
    int-to-double p1, p1

    .line 52
    invoke-static {p1, p2}, Ljava/lang/Math;->log(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    .line 57
    .line 58
    .line 59
    move-result-wide p1

    .line 60
    double-to-int p1, p1

    .line 61
    mul-int/lit8 p1, p1, 0x2

    .line 62
    .line 63
    const/4 p2, 0x3

    .line 64
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashCapacity:I

    .line 69
    .line 70
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 71
    .line 72
    const/16 p2, 0x8

    .line 73
    .line 74
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 79
    .line 80
    int-to-double v0, v0

    .line 81
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    double-to-int v0, v0

    .line 86
    div-int/2addr v0, p2

    .line 87
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->pushIterations:I

    .line 92
    .line 93
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 94
    .line 95
    iget p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashCapacity:I

    .line 96
    .line 97
    add-int/2addr p1, p2

    .line 98
    new-array p1, p1, [Ljava/lang/Object;

    .line 99
    .line 100
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 101
    .line 102
    array-length p1, p1

    .line 103
    new-array p1, p1, [Ljava/lang/Object;

    .line 104
    .line 105
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 106
    .line 107
    return-void

    .line 108
    :cond_1
    const-string p0, "loadFactor must be > 0: "

    .line 109
    .line 110
    invoke-static {p0, p2}, Lcom/esotericsoftware/kryo/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;F)V

    .line 111
    .line 112
    .line 113
    const/4 p0, 0x0

    .line 114
    throw p0

    .line 115
    :cond_2
    const-string p0, "initialCapacity is too large: "

    .line 116
    .line 117
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    throw p0

    .line 126
    :cond_3
    const-string p0, "initialCapacity must be >= 0: "

    .line 127
    .line 128
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 p0, 0x0

    .line 136
    throw p0
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/util/CuckooObjectMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/CuckooObjectMap<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    .line 139
    iget v0, p1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    iget v1, p1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->loadFactor:F

    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;-><init>(IF)V

    .line 140
    iget v0, p1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 141
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 143
    iget p1, p1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    return-void
.end method

.method private containsKeyStash(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 4
    .line 5
    iget p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 6
    .line 7
    add-int/2addr p0, v1

    .line 8
    :goto_0
    if-ge v1, p0, :cond_1

    .line 9
    .line 10
    aget-object v2, v0, v1

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method private getStash(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 4
    .line 5
    iget v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 6
    .line 7
    add-int/2addr v2, v1

    .line 8
    :goto_0
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    aget-object v3, v0, v1

    .line 11
    .line 12
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object p0, p0, v1

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method private getStash(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 29
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    iget v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    add-int/2addr v2, v1

    :goto_0
    if-ge v1, v2, :cond_1

    .line 30
    aget-object v3, v0, v1

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    aget-object p0, p0, v1

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method private hash2(I)I
    .locals 1

    .line 1
    const v0, -0x41e0eb4f

    .line 2
    .line 3
    .line 4
    mul-int/2addr p1, v0

    .line 5
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hashShift:I

    .line 6
    .line 7
    ushr-int v0, p1, v0

    .line 8
    .line 9
    xor-int/2addr p1, v0

    .line 10
    iget p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 11
    .line 12
    and-int/2addr p0, p1

    .line 13
    return p0
.end method

.method private hash3(I)I
    .locals 1

    .line 1
    const v0, -0x4b47d1c7

    .line 2
    .line 3
    .line 4
    mul-int/2addr p1, v0

    .line 5
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hashShift:I

    .line 6
    .line 7
    ushr-int v0, p1, v0

    .line 8
    .line 9
    xor-int/2addr p1, v0

    .line 10
    iget p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 11
    .line 12
    and-int/2addr p0, p1

    .line 13
    return p0
.end method

.method private hash4(I)I
    .locals 1

    .line 1
    const v0, -0x312e3dbf

    .line 2
    .line 3
    .line 4
    mul-int/2addr p1, v0

    .line 5
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hashShift:I

    .line 6
    .line 7
    ushr-int v0, p1, v0

    .line 8
    .line 9
    xor-int/2addr p1, v0

    .line 10
    iget p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 11
    .line 12
    and-int/2addr p0, p1

    .line 13
    return p0
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

.method private push(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;ITK;ITK;ITK;ITK;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 8
    .line 9
    iget-boolean v4, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->isBigTable:Z

    .line 10
    .line 11
    iget v5, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->pushIterations:I

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    const/4 v6, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v6, 0x3

    .line 18
    :goto_0
    const/4 v7, 0x0

    .line 19
    move-object/from16 v8, p2

    .line 20
    .line 21
    move/from16 v9, p3

    .line 22
    .line 23
    move-object/from16 v10, p4

    .line 24
    .line 25
    move/from16 v11, p5

    .line 26
    .line 27
    move-object/from16 v12, p6

    .line 28
    .line 29
    move/from16 v13, p7

    .line 30
    .line 31
    move-object/from16 v14, p8

    .line 32
    .line 33
    move/from16 v15, p9

    .line 34
    .line 35
    move-object/from16 v16, p10

    .line 36
    .line 37
    move-object/from16 v18, v1

    .line 38
    .line 39
    move/from16 v17, v7

    .line 40
    .line 41
    move-object/from16 v7, p1

    .line 42
    .line 43
    :goto_1
    sget-object v1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->random:Ljava/util/Random;

    .line 44
    .line 45
    invoke-virtual {v1, v6}, Ljava/util/Random;->nextInt(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    move-object/from16 v19, v2

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    if-eq v1, v2, :cond_2

    .line 55
    .line 56
    const/4 v9, 0x2

    .line 57
    if-eq v1, v9, :cond_1

    .line 58
    .line 59
    aget-object v1, v19, v15

    .line 60
    .line 61
    aput-object v7, v18, v15

    .line 62
    .line 63
    aput-object v8, v19, v15

    .line 64
    .line 65
    move-object v8, v1

    .line 66
    move-object/from16 v7, v16

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    aget-object v1, v19, v13

    .line 70
    .line 71
    aput-object v7, v18, v13

    .line 72
    .line 73
    aput-object v8, v19, v13

    .line 74
    .line 75
    move-object v8, v1

    .line 76
    move-object v7, v14

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    aget-object v1, v19, v11

    .line 79
    .line 80
    aput-object v7, v18, v11

    .line 81
    .line 82
    aput-object v8, v19, v11

    .line 83
    .line 84
    move-object v8, v1

    .line 85
    move-object v7, v12

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    aget-object v1, v19, v9

    .line 88
    .line 89
    aput-object v7, v18, v9

    .line 90
    .line 91
    aput-object v8, v19, v9

    .line 92
    .line 93
    move-object v8, v1

    .line 94
    move-object v7, v10

    .line 95
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    and-int v9, v1, v3

    .line 100
    .line 101
    aget-object v10, v18, v9

    .line 102
    .line 103
    if-nez v10, :cond_4

    .line 104
    .line 105
    aput-object v7, v18, v9

    .line 106
    .line 107
    aput-object v8, v19, v9

    .line 108
    .line 109
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 110
    .line 111
    add-int/lit8 v3, v1, 0x1

    .line 112
    .line 113
    iput v3, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 114
    .line 115
    iget v3, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 116
    .line 117
    if-lt v1, v3, :cond_7

    .line 118
    .line 119
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 120
    .line 121
    shl-int/2addr v1, v2

    .line 122
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_4
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash2(I)I

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    aget-object v12, v18, v11

    .line 131
    .line 132
    if-nez v12, :cond_5

    .line 133
    .line 134
    aput-object v7, v18, v11

    .line 135
    .line 136
    aput-object v8, v19, v11

    .line 137
    .line 138
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 139
    .line 140
    add-int/lit8 v3, v1, 0x1

    .line 141
    .line 142
    iput v3, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 143
    .line 144
    iget v3, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 145
    .line 146
    if-lt v1, v3, :cond_7

    .line 147
    .line 148
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 149
    .line 150
    shl-int/2addr v1, v2

    .line 151
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_5
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash3(I)I

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    aget-object v14, v18, v13

    .line 160
    .line 161
    if-nez v14, :cond_6

    .line 162
    .line 163
    aput-object v7, v18, v13

    .line 164
    .line 165
    aput-object v8, v19, v13

    .line 166
    .line 167
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 168
    .line 169
    add-int/lit8 v3, v1, 0x1

    .line 170
    .line 171
    iput v3, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 172
    .line 173
    iget v3, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 174
    .line 175
    if-lt v1, v3, :cond_7

    .line 176
    .line 177
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 178
    .line 179
    shl-int/2addr v1, v2

    .line 180
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_6
    if-eqz v4, :cond_9

    .line 185
    .line 186
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash4(I)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    aget-object v15, v18, v1

    .line 191
    .line 192
    if-nez v15, :cond_8

    .line 193
    .line 194
    aput-object v7, v18, v1

    .line 195
    .line 196
    aput-object v8, v19, v1

    .line 197
    .line 198
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 199
    .line 200
    add-int/lit8 v3, v1, 0x1

    .line 201
    .line 202
    iput v3, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 203
    .line 204
    iget v3, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 205
    .line 206
    if-lt v1, v3, :cond_7

    .line 207
    .line 208
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 209
    .line 210
    shl-int/2addr v1, v2

    .line 211
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 212
    .line 213
    .line 214
    :cond_7
    return-void

    .line 215
    :cond_8
    move-object/from16 v16, v15

    .line 216
    .line 217
    move v15, v1

    .line 218
    :cond_9
    add-int/lit8 v1, v17, 0x1

    .line 219
    .line 220
    if-ne v1, v5, :cond_a

    .line 221
    .line 222
    invoke-direct {v0, v7, v8}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->putStash(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :cond_a
    move/from16 v17, v1

    .line 227
    .line 228
    move-object/from16 v2, v19

    .line 229
    .line 230
    goto/16 :goto_1
.end method

.method private putResize(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 6
    .line 7
    and-int v5, v0, v1

    .line 8
    .line 9
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 10
    .line 11
    aget-object v6, v1, v5

    .line 12
    .line 13
    if-nez v6, :cond_0

    .line 14
    .line 15
    aput-object p1, v1, v5

    .line 16
    .line 17
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 18
    .line 19
    aput-object p2, p1, v5

    .line 20
    .line 21
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 22
    .line 23
    add-int/lit8 p2, p1, 0x1

    .line 24
    .line 25
    iput p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 26
    .line 27
    iget p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 28
    .line 29
    if-lt p1, p2, :cond_3

    .line 30
    .line 31
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 32
    .line 33
    shl-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash2(I)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 44
    .line 45
    aget-object v8, v1, v7

    .line 46
    .line 47
    if-nez v8, :cond_1

    .line 48
    .line 49
    aput-object p1, v1, v7

    .line 50
    .line 51
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 52
    .line 53
    aput-object p2, p1, v7

    .line 54
    .line 55
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 56
    .line 57
    add-int/lit8 p2, p1, 0x1

    .line 58
    .line 59
    iput p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 60
    .line 61
    iget p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 62
    .line 63
    if-lt p1, p2, :cond_3

    .line 64
    .line 65
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 66
    .line 67
    shl-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash3(I)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 78
    .line 79
    aget-object v10, v1, v9

    .line 80
    .line 81
    if-nez v10, :cond_2

    .line 82
    .line 83
    aput-object p1, v1, v9

    .line 84
    .line 85
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 86
    .line 87
    aput-object p2, p1, v9

    .line 88
    .line 89
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 90
    .line 91
    add-int/lit8 p2, p1, 0x1

    .line 92
    .line 93
    iput p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 94
    .line 95
    iget p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 96
    .line 97
    if-lt p1, p2, :cond_3

    .line 98
    .line 99
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 100
    .line 101
    shl-int/lit8 p1, p1, 0x1

    .line 102
    .line 103
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_2
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->isBigTable:Z

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash4(I)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 116
    .line 117
    aget-object v2, v1, v0

    .line 118
    .line 119
    if-nez v2, :cond_4

    .line 120
    .line 121
    aput-object p1, v1, v0

    .line 122
    .line 123
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 124
    .line 125
    aput-object p2, p1, v0

    .line 126
    .line 127
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 128
    .line 129
    add-int/lit8 p2, p1, 0x1

    .line 130
    .line 131
    iput p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 132
    .line 133
    iget p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 134
    .line 135
    if-lt p1, p2, :cond_3

    .line 136
    .line 137
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 138
    .line 139
    shl-int/lit8 p1, p1, 0x1

    .line 140
    .line 141
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 142
    .line 143
    .line 144
    :cond_3
    return-void

    .line 145
    :cond_4
    :goto_0
    move-object v3, p1

    .line 146
    move-object v4, p2

    .line 147
    move v11, v0

    .line 148
    move-object v12, v2

    .line 149
    move-object v2, p0

    .line 150
    goto :goto_1

    .line 151
    :cond_5
    const/4 v0, -0x1

    .line 152
    const/4 v2, 0x0

    .line 153
    goto :goto_0

    .line 154
    :goto_1
    invoke-direct/range {v2 .. v12}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->push(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method private putStash(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashCapacity:I

    .line 4
    .line 5
    iget v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    shl-int/lit8 v0, v2, 0x1

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->put_internal(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    add-int/2addr v2, v0

    .line 19
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 20
    .line 21
    aput-object p1, v1, v2

    .line 22
    .line 23
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 24
    .line 25
    aput-object p2, p1, v2

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 30
    .line 31
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 36
    .line 37
    return-void
.end method

.method private put_internal(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 8
    .line 9
    iget-boolean v4, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->isBigTable:Z

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    and-int/2addr v3, v5

    .line 16
    move v6, v4

    .line 17
    aget-object v4, v2, v3

    .line 18
    .line 19
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    if-eqz v7, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object v1, v0, v3

    .line 28
    .line 29
    aput-object p2, v0, v3

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    invoke-direct {v0, v5}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash2(I)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    move v8, v6

    .line 37
    aget-object v6, v2, v7

    .line 38
    .line 39
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-eqz v9, :cond_1

    .line 44
    .line 45
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 46
    .line 47
    aget-object v1, v0, v7

    .line 48
    .line 49
    aput-object p2, v0, v7

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_1
    move v9, v7

    .line 53
    invoke-direct {v0, v5}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash3(I)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    move v10, v8

    .line 58
    aget-object v8, v2, v7

    .line 59
    .line 60
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-eqz v11, :cond_2

    .line 65
    .line 66
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 67
    .line 68
    aget-object v1, v0, v7

    .line 69
    .line 70
    aput-object p2, v0, v7

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_2
    const/4 v11, 0x0

    .line 74
    if-eqz v10, :cond_3

    .line 75
    .line 76
    invoke-direct {v0, v5}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash4(I)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    aget-object v12, v2, v5

    .line 81
    .line 82
    invoke-virtual {v1, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    if-eqz v13, :cond_4

    .line 87
    .line 88
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 89
    .line 90
    aget-object v1, v0, v5

    .line 91
    .line 92
    aput-object p2, v0, v5

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_3
    const/4 v5, -0x1

    .line 96
    move-object v12, v11

    .line 97
    :cond_4
    iget v13, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 98
    .line 99
    iget v14, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 100
    .line 101
    add-int/2addr v14, v13

    .line 102
    :goto_0
    if-ge v13, v14, :cond_6

    .line 103
    .line 104
    aget-object v15, v2, v13

    .line 105
    .line 106
    invoke-virtual {v1, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v15

    .line 110
    if-eqz v15, :cond_5

    .line 111
    .line 112
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 113
    .line 114
    aget-object v1, v0, v13

    .line 115
    .line 116
    aput-object p2, v0, v13

    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_6
    if-nez v4, :cond_8

    .line 123
    .line 124
    aput-object v1, v2, v3

    .line 125
    .line 126
    iget-object v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 127
    .line 128
    aput-object p2, v1, v3

    .line 129
    .line 130
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 131
    .line 132
    add-int/lit8 v2, v1, 0x1

    .line 133
    .line 134
    iput v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 135
    .line 136
    iget v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 137
    .line 138
    if-lt v1, v2, :cond_7

    .line 139
    .line 140
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 141
    .line 142
    shl-int/lit8 v1, v1, 0x1

    .line 143
    .line 144
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 145
    .line 146
    .line 147
    :cond_7
    return-object v11

    .line 148
    :cond_8
    if-nez v6, :cond_a

    .line 149
    .line 150
    aput-object v1, v2, v9

    .line 151
    .line 152
    iget-object v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 153
    .line 154
    aput-object p2, v1, v9

    .line 155
    .line 156
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 157
    .line 158
    add-int/lit8 v2, v1, 0x1

    .line 159
    .line 160
    iput v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 161
    .line 162
    iget v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 163
    .line 164
    if-lt v1, v2, :cond_9

    .line 165
    .line 166
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 167
    .line 168
    shl-int/lit8 v1, v1, 0x1

    .line 169
    .line 170
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 171
    .line 172
    .line 173
    :cond_9
    return-object v11

    .line 174
    :cond_a
    if-nez v8, :cond_c

    .line 175
    .line 176
    aput-object v1, v2, v7

    .line 177
    .line 178
    iget-object v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 179
    .line 180
    aput-object p2, v1, v7

    .line 181
    .line 182
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 183
    .line 184
    add-int/lit8 v2, v1, 0x1

    .line 185
    .line 186
    iput v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 187
    .line 188
    iget v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 189
    .line 190
    if-lt v1, v2, :cond_b

    .line 191
    .line 192
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 193
    .line 194
    shl-int/lit8 v1, v1, 0x1

    .line 195
    .line 196
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 197
    .line 198
    .line 199
    :cond_b
    return-object v11

    .line 200
    :cond_c
    if-eqz v10, :cond_e

    .line 201
    .line 202
    if-nez v12, :cond_e

    .line 203
    .line 204
    aput-object v1, v2, v5

    .line 205
    .line 206
    iget-object v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 207
    .line 208
    aput-object p2, v1, v5

    .line 209
    .line 210
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 211
    .line 212
    add-int/lit8 v2, v1, 0x1

    .line 213
    .line 214
    iput v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 215
    .line 216
    iget v2, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 217
    .line 218
    if-lt v1, v2, :cond_d

    .line 219
    .line 220
    iget v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 221
    .line 222
    shl-int/lit8 v1, v1, 0x1

    .line 223
    .line 224
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 225
    .line 226
    .line 227
    :cond_d
    return-object v11

    .line 228
    :cond_e
    move v2, v9

    .line 229
    move v9, v5

    .line 230
    move v5, v2

    .line 231
    move-object/from16 v2, p2

    .line 232
    .line 233
    move-object v10, v12

    .line 234
    invoke-direct/range {v0 .. v10}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->push(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    return-object v11
.end method

.method private resize(I)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 7
    .line 8
    int-to-float v1, p1

    .line 9
    iget v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->loadFactor:F

    .line 10
    .line 11
    mul-float/2addr v1, v2

    .line 12
    float-to-int v1, v1

    .line 13
    iput v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 14
    .line 15
    add-int/lit8 v1, p1, -0x1

    .line 16
    .line 17
    iput v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    rsub-int/lit8 v1, v1, 0x1f

    .line 24
    .line 25
    iput v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hashShift:I

    .line 26
    .line 27
    int-to-double v1, p1

    .line 28
    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    double-to-int v3, v3

    .line 37
    mul-int/lit8 v3, v3, 0x2

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    iput v3, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashCapacity:I

    .line 45
    .line 46
    const/16 v3, 0x8

    .line 47
    .line 48
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    double-to-int v1, v1

    .line 57
    div-int/2addr v1, v3

    .line 58
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iput v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->pushIterations:I

    .line 63
    .line 64
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 65
    .line 66
    ushr-int/lit8 v1, v1, 0x10

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v1, v2

    .line 74
    :goto_0
    iput-boolean v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->isBigTable:Z

    .line 75
    .line 76
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v3, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 79
    .line 80
    iget v4, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashCapacity:I

    .line 81
    .line 82
    add-int v5, p1, v4

    .line 83
    .line 84
    new-array v5, v5, [Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v5, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 87
    .line 88
    add-int/2addr p1, v4

    .line 89
    new-array p1, p1, [Ljava/lang/Object;

    .line 90
    .line 91
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 92
    .line 93
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 94
    .line 95
    iput v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 96
    .line 97
    iput v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 98
    .line 99
    if-lez p1, :cond_2

    .line 100
    .line 101
    :goto_1
    if-ge v2, v0, :cond_2

    .line 102
    .line 103
    aget-object p1, v1, v2

    .line 104
    .line 105
    if-eqz p1, :cond_1

    .line 106
    .line 107
    aget-object v4, v3, v2

    .line 108
    .line 109
    invoke-direct {p0, p1, v4}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->putResize(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 6
    .line 7
    iget v3, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 8
    .line 9
    add-int/2addr v2, v3

    .line 10
    :goto_0
    add-int/lit8 v3, v2, -0x1

    .line 11
    .line 12
    if-lez v2, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aput-object v2, v0, v3

    .line 16
    .line 17
    aput-object v2, v1, v3

    .line 18
    .line 19
    move v2, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 23
    .line 24
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 25
    .line 26
    return-void
.end method

.method public clear(I)V
    .locals 1

    .line 27
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    if-gt v0, p1, :cond_0

    .line 28
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->clear()V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 30
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 6
    .line 7
    and-int/2addr v1, v0

    .line 8
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object v1, v2, v1

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash2(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 23
    .line 24
    aget-object v1, v2, v1

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash3(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 37
    .line 38
    aget-object v1, v2, v1

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->isBigTable:Z

    .line 47
    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash4(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 55
    .line 56
    aget-object v0, v1, v0

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->containsKeyStash(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0

    .line 69
    :cond_0
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->containsKeyStash(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    return p0

    .line 74
    :cond_1
    const/4 p0, 0x1

    .line 75
    return p0
.end method

.method public containsValue(Ljava/lang/Object;Z)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 7
    .line 8
    iget p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 9
    .line 10
    iget p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 11
    .line 12
    add-int/2addr p2, p0

    .line 13
    :goto_0
    add-int/lit8 p0, p2, -0x1

    .line 14
    .line 15
    if-lez p2, :cond_5

    .line 16
    .line 17
    aget-object p2, p1, p0

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    aget-object p2, v0, p0

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    move p2, p0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    iget p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 33
    .line 34
    add-int/2addr v2, p0

    .line 35
    :goto_1
    add-int/lit8 p0, v2, -0x1

    .line 36
    .line 37
    if-lez v2, :cond_5

    .line 38
    .line 39
    aget-object p2, v0, p0

    .line 40
    .line 41
    if-ne p2, p1, :cond_2

    .line 42
    .line 43
    return v1

    .line 44
    :cond_2
    move v2, p0

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    iget p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 47
    .line 48
    add-int/2addr v2, p0

    .line 49
    :goto_2
    add-int/lit8 p0, v2, -0x1

    .line 50
    .line 51
    if-lez v2, :cond_5

    .line 52
    .line 53
    aget-object p2, v0, p0

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_4

    .line 60
    .line 61
    return v1

    .line 62
    :cond_4
    move v2, p0

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method public ensureCapacity(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->threshold:I

    .line 5
    .line 6
    if-lt v0, p1, :cond_0

    .line 7
    .line 8
    int-to-float p1, v0

    .line 9
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->loadFactor:F

    .line 10
    .line 11
    div-float/2addr p1, v0

    .line 12
    float-to-int p1, p1

    .line 13
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->nextPowerOfTwo(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public entries()Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;-><init>(Lcom/esotericsoftware/kryo/util/CuckooObjectMap;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 8
    .line 9
    iget p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 10
    .line 11
    add-int/2addr p2, p0

    .line 12
    :goto_0
    add-int/lit8 p0, p2, -0x1

    .line 13
    .line 14
    if-lez p2, :cond_5

    .line 15
    .line 16
    aget-object p2, p1, p0

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    aget-object v1, v0, p0

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    return-object p2

    .line 25
    :cond_0
    move p2, p0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 28
    .line 29
    if-eqz p2, :cond_3

    .line 30
    .line 31
    iget p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 32
    .line 33
    add-int/2addr v1, p2

    .line 34
    :goto_1
    add-int/lit8 p2, v1, -0x1

    .line 35
    .line 36
    if-lez v1, :cond_5

    .line 37
    .line 38
    aget-object v1, v0, p2

    .line 39
    .line 40
    if-ne v1, p1, :cond_2

    .line 41
    .line 42
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 43
    .line 44
    aget-object p0, p0, p2

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    move v1, p2

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    iget p2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 50
    .line 51
    add-int/2addr v1, p2

    .line 52
    :goto_2
    add-int/lit8 p2, v1, -0x1

    .line 53
    .line 54
    if-lez v1, :cond_5

    .line 55
    .line 56
    aget-object v1, v0, p2

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 65
    .line 66
    aget-object p0, p0, p2

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_4
    move v1, p2

    .line 70
    goto :goto_2

    .line 71
    :cond_5
    const/4 p0, 0x0

    .line 72
    return-object p0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 6
    .line 7
    and-int/2addr v1, v0

    .line 8
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object v2, v2, v1

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash2(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 23
    .line 24
    aget-object v2, v2, v1

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash3(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 37
    .line 38
    aget-object v2, v2, v1

    .line 39
    .line 40
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->isBigTable:Z

    .line 47
    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash4(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 55
    .line 56
    aget-object v0, v0, v1

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->getStash(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_0
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->getStash(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 75
    .line 76
    aget-object p0, p0, v1

    .line 77
    .line 78
    return-object p0
.end method

.method public get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 80
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    and-int/2addr v1, v0

    .line 81
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 82
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash2(I)I

    move-result v1

    .line 83
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 84
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash3(I)I

    move-result v1

    .line 85
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 86
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->isBigTable:Z

    if-eqz v1, :cond_0

    .line 87
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash4(I)I

    move-result v1

    .line 88
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->getStash(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 89
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->getStash(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 90
    :cond_1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    aget-object p0, p0, v1

    return-object p0
.end method

.method public keys()Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Keys;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Keys<",
            "TK;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Keys;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Keys;-><init>(Lcom/esotericsoftware/kryo/util/CuckooObjectMap;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->put_internal(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "key cannot be null."

    .line 9
    .line 10
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public putAll(Lcom/esotericsoftware/kryo/util/CuckooObjectMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/CuckooObjectMap<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    iget v0, p1, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->ensureCapacity(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->entries()Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entries;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;

    .line 25
    .line 26
    iget-object v1, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;->key:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Entry;->value:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {p0, v1, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->mask:I

    .line 6
    .line 7
    and-int/2addr v1, v0

    .line 8
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object v2, v2, v1

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 20
    .line 21
    aput-object v3, p1, v1

    .line 22
    .line 23
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 24
    .line 25
    aget-object v0, p1, v1

    .line 26
    .line 27
    aput-object v3, p1, v1

    .line 28
    .line 29
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 30
    .line 31
    add-int/lit8 p1, p1, -0x1

    .line 32
    .line 33
    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash2(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 41
    .line 42
    aget-object v2, v2, v1

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 51
    .line 52
    aput-object v3, p1, v1

    .line 53
    .line 54
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 55
    .line 56
    aget-object v0, p1, v1

    .line 57
    .line 58
    aput-object v3, p1, v1

    .line 59
    .line 60
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 61
    .line 62
    add-int/lit8 p1, p1, -0x1

    .line 63
    .line 64
    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_1
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash3(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 72
    .line 73
    aget-object v2, v2, v1

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_2

    .line 80
    .line 81
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 82
    .line 83
    aput-object v3, p1, v1

    .line 84
    .line 85
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 86
    .line 87
    aget-object v0, p1, v1

    .line 88
    .line 89
    aput-object v3, p1, v1

    .line 90
    .line 91
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 92
    .line 93
    add-int/lit8 p1, p1, -0x1

    .line 94
    .line 95
    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_2
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->isBigTable:Z

    .line 99
    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->hash4(I)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 107
    .line 108
    aget-object v1, v1, v0

    .line 109
    .line 110
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_3

    .line 115
    .line 116
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 117
    .line 118
    aput-object v3, p1, v0

    .line 119
    .line 120
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 121
    .line 122
    aget-object v1, p1, v0

    .line 123
    .line 124
    aput-object v3, p1, v0

    .line 125
    .line 126
    iget p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 127
    .line 128
    add-int/lit8 p1, p1, -0x1

    .line 129
    .line 130
    iput p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->removeStash(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0
.end method

.method public removeStash(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 4
    .line 5
    iget v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 6
    .line 7
    add-int/2addr v2, v1

    .line 8
    :goto_0
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    aget-object v3, v0, v1

    .line 11
    .line 12
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object p1, p1, v1

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->removeStashIndex(I)V

    .line 23
    .line 24
    .line 25
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public removeStashIndex(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->stashSize:I

    .line 6
    .line 7
    iget v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    const/4 v0, 0x0

    .line 11
    if-ge p1, v1, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 14
    .line 15
    aget-object v3, v2, v1

    .line 16
    .line 17
    aput-object v3, v2, p1

    .line 18
    .line 19
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object v2, p0, v1

    .line 22
    .line 23
    aput-object v2, p0, p1

    .line 24
    .line 25
    aput-object v0, p0, v1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 29
    .line 30
    aput-object v0, p0, p1

    .line 31
    .line 32
    return-void
.end method

.method public shrink(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 4
    .line 5
    if-le v0, p1, :cond_0

    .line 6
    .line 7
    move p1, v0

    .line 8
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->capacity:I

    .line 9
    .line 10
    if-gt v0, p1, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->nextPowerOfTwo(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->resize(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_2
    const-string p0, "maximumCapacity must be >= 0: "

    .line 22
    .line 23
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->size:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p0, "{}"

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
    const/16 v1, 0x7b

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->keyTable:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap;->valueTable:[Ljava/lang/Object;

    .line 23
    .line 24
    array-length v2, v1

    .line 25
    :goto_0
    add-int/lit8 v3, v2, -0x1

    .line 26
    .line 27
    const/16 v4, 0x3d

    .line 28
    .line 29
    if-lez v2, :cond_2

    .line 30
    .line 31
    aget-object v2, v1, v3

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    move v2, v3

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    aget-object v2, p0, v3

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_1
    add-int/lit8 v2, v3, -0x1

    .line 49
    .line 50
    if-lez v3, :cond_4

    .line 51
    .line 52
    aget-object v3, v1, v2

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    const-string v5, ", "

    .line 58
    .line 59
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    aget-object v3, p0, v2

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    :goto_2
    move v3, v2

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    const/16 p0, 0x7d

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0
.end method

.method public values()Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Values;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Values<",
            "TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Values;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/util/CuckooObjectMap$Values;-><init>(Lcom/esotericsoftware/kryo/util/CuckooObjectMap;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
