.class public final Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final largestPrime:I

.field static final primeCapacities:[I


# instance fields
.field protected consumeFreeSlot:Z

.field protected free:I

.field protected maxSize:I

.field protected set:[J

.field protected size:I

.field protected values:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0xf4

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->primeCapacities:[I

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V

    .line 11
    .line 12
    .line 13
    array-length v1, v0

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    aget v0, v0, v1

    .line 17
    .line 18
    sput v0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->largestPrime:I

    .line 19
    .line 20
    return-void

    .line 21
    :array_0
    .array-data 4
        0x5
        0xb
        0x17
        0x2f
        0x61
        0xc5
        0x18d
        0x31d
        0x63d
        0xc83
        0x1915
        0x3235
        0x6475
        0xc8ed
        0x191dd
        0x323bf
        0x64787
        0xc8f4d
        0x191e9d
        0x323d49
        0x647a97
        0xc8f539
        0x191ea81
        0x323d521
        0x647aa43
        0xc8f5489
        0x191ea927
        0x323d525b
        0x647aa4bf
        0x1b1
        0x36d
        0x6df
        0xdc7
        0x1b91
        0x373f
        0x6e81
        0xdd0f
        0x1ba25
        0x3744b
        0x6e897
        0xdd14f
        0x1ba2a3
        0x37454b
        0x6e8a99
        0xdd1563
        0x1ba2ac7
        0x374559b
        0x6e8ab8b
        0xdd1572b
        0x1ba2ae79
        0x37455d1b
        0x6e8aba45
        0x3b9
        0x773
        0xeed
        0x1ddb
        0x3bb7
        0x7771
        0xeef1
        0x1ddeb
        0x3bbdf
        0x777bf
        0xeef85
        0x1ddf13
        0x3bbe4d
        0x777cad
        0xeef96f
        0x1ddf2f3
        0x3bbe5ed
        0x777cbdb
        0xeef97cb
        0x1ddf2f9b
        0x3bbe5f3b
        0x777cbe79
        0x40f
        0x821
        0x1051
        0x20ab
        0x4159
        0x82b5
        0x1056b
        0x20add
        0x415c1
        0x82bb9
        0x105785
        0x20af19
        0x415e3b
        0x82bc79
        0x10578f7
        0x20af203
        0x415e415
        0x82bc82d
        0x1057909f
        0x20af2147
        0x415e428f
        0x1f
        0x43
        0x89
        0x115
        0x22d
        0x45d
        0x8bd
        0x1181
        0x2303
        0x4609
        0x8c17
        0x1183d
        0x2307b
        0x460fd
        0x8c201
        0x118411
        0x230833
        0x461069
        0x8c20e1
        0x11841cb
        0x2308397
        0x461075b    # 2.6452E-36f
        0x8c20ecb
        0x11841da5
        0x23083b61
        0x461076c7
        0x257
        0x4b1
        0x96b
        0x12df
        0x25cd
        0x4bad
        0x975b
        0x12ec5
        0x25d93
        0x4bb41
        0x9768b
        0x12ed29
        0x25da59
        0x4bb4b3
        0x976975
        0x12ed2ef
        0x25da5ef
        0x4bb4bed
        0x97697dd
        0x12ed2fbd
        0x25da5f7b
        0x4bb4bf6b    # 2.3690966E7f
        0x137
        0x277
        0x4fd
        0x9fd
        0x13ff
        0x2803
        0x501b
        0xa039
        0x14075
        0x280f9
        0x50215
        0xa042d
        0x140863
        0x2810e1
        0x5021c9
        0xa04395
        0x1408739
        0x2810e79
        0x5021d05
        0xa043a0b
        0x14087417    # 6.88914E-27f
        0x2810e841
        0x5021d089
        0x3
        0x7
        0x11
        0x25
        0x4f
        0xa3
        0x14b
        0x2a1
        0x551
        0xaa9
        0x155f
        0x2ac5
        0x5597
        0xab4d
        0x156a7
        0x2ad57
        0x55ab3
        0xab57b
        0x156af9
        0x2ad607
        0x55ac41
        0xab5893
        0x156b12f
        0x2ad6285
        0x55ac519
        0xab58a35
        0x156b14a3
        0x2ad62961
        0x55ac52c5
        0x2b
        0x59
        0xb3
        0x167
        0x2cf
        0x59f
        0xb3f
        0x1693
        0x2d3b
        0x5a77
        0xb4f7
        0x169f1
        0x2d3eb
        0x5a7e5
        0xb4fd9
        0x169fd3
        0x2d3fad
        0x5a7f87
        0xb4ff1f
        0x169fe4d
        0x2d3fca1
        0x5a7f95b
        0xb4ff2b9
        0x169fe58d
        0x2d3fcb1b
        0x5a7f9637
        0x17b
        0x2f9
        0x5f3
        0xbe9
        0x17d5
        0x2fab
        0x5f57
        0xbeb1
        0x17d71
        0x2faef
        0x5f5f7
        0xbebf5
        0x17d7f3
        0x2fb009
        0x5f6029
        0xbec0b1
        0x17d8195
        0x2fb0337
        0x5f60687
        0xbec0d15
        0x17d81a33
        0x2fb03481
        0x5f606903
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x12

    .line 45
    iput v0, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->maxSize:I

    const/16 v0, 0x25

    .line 46
    iput v0, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->free:I

    .line 47
    new-array v1, v0, [J

    iput-object v1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 48
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    return-void
.end method

.method public constructor <init>(JI)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x12

    .line 5
    .line 6
    iput v0, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->maxSize:I

    .line 7
    .line 8
    const/16 v0, 0x25

    .line 9
    .line 10
    new-array v1, v0, [J

    .line 11
    .line 12
    iput-object v1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 13
    .line 14
    new-array v0, v0, [I

    .line 15
    .line 16
    iput-object v0, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 20
    .line 21
    const/16 v3, 0x20

    .line 22
    .line 23
    ushr-long v3, p1, v3

    .line 24
    .line 25
    xor-long/2addr v3, p1

    .line 26
    long-to-int v3, v3

    .line 27
    const v4, 0x7fffffff

    .line 28
    .line 29
    .line 30
    and-int/2addr v3, v4

    .line 31
    array-length v4, v1

    .line 32
    rem-int/2addr v3, v4

    .line 33
    aput-wide p1, v1, v3

    .line 34
    .line 35
    aput p3, v0, v3

    .line 36
    .line 37
    const/16 p1, 0x24

    .line 38
    .line 39
    iput p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->free:I

    .line 40
    .line 41
    iput v2, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->size:I

    .line 42
    .line 43
    return-void
.end method

.method public static nextPrime(I)I
    .locals 1

    .line 1
    sget v0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->largestPrime:I

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->primeCapacities:[I

    .line 7
    .line 8
    invoke-static {v0, p0}, Ljava/util/Arrays;->binarySearch([II)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-gez p0, :cond_1

    .line 13
    .line 14
    neg-int p0, p0

    .line 15
    add-int/lit8 p0, p0, -0x1

    .line 16
    .line 17
    :cond_1
    aget p0, v0, p0

    .line 18
    .line 19
    return p0
.end method

.method private rehash(I)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->size:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->maxSize:I

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    shl-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    invoke-static {p1}, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->nextPrime(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 14
    .line 15
    array-length v1, v0

    .line 16
    iget-object v2, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 17
    .line 18
    new-array v3, p1, [J

    .line 19
    .line 20
    iput-object v3, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 21
    .line 22
    new-array p1, p1, [I

    .line 23
    .line 24
    iput-object p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 25
    .line 26
    :goto_0
    add-int/lit8 p1, v1, -0x1

    .line 27
    .line 28
    if-lez v1, :cond_2

    .line 29
    .line 30
    aget-wide v3, v0, p1

    .line 31
    .line 32
    const-wide/16 v5, 0x0

    .line 33
    .line 34
    cmp-long v1, v3, v5

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 39
    .line 40
    invoke-virtual {p0, v3, v4}, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->insertKey(J)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    aget v4, v2, p1

    .line 45
    .line 46
    aput v4, v1, v3

    .line 47
    .line 48
    :cond_1
    move v1, p1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return-void
.end method


# virtual methods
.method public get(J)I
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/16 v2, 0x20

    .line 5
    .line 6
    ushr-long v2, p1, v2

    .line 7
    .line 8
    xor-long/2addr v2, p1

    .line 9
    long-to-int v2, v2

    .line 10
    const v3, 0x7fffffff

    .line 11
    .line 12
    .line 13
    and-int/2addr v2, v3

    .line 14
    rem-int v1, v2, v1

    .line 15
    .line 16
    aget-wide v3, v0, v1

    .line 17
    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    cmp-long v7, v3, v5

    .line 21
    .line 22
    const/4 v8, -0x1

    .line 23
    if-nez v7, :cond_0

    .line 24
    .line 25
    return v8

    .line 26
    :cond_0
    cmp-long v3, v3, p1

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 31
    .line 32
    aget p1, p1, v1

    .line 33
    .line 34
    return p1

    .line 35
    :cond_1
    array-length v0, v0

    .line 36
    add-int/lit8 v3, v0, -0x2

    .line 37
    .line 38
    rem-int/2addr v2, v3

    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    move v3, v1

    .line 42
    :cond_2
    sub-int/2addr v3, v2

    .line 43
    if-gez v3, :cond_3

    .line 44
    .line 45
    add-int/2addr v3, v0

    .line 46
    :cond_3
    iget-object v4, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 47
    .line 48
    aget-wide v9, v4, v3

    .line 49
    .line 50
    cmp-long v4, v9, v5

    .line 51
    .line 52
    if-nez v4, :cond_4

    .line 53
    .line 54
    return v8

    .line 55
    :cond_4
    cmp-long v4, p1, v9

    .line 56
    .line 57
    if-nez v4, :cond_5

    .line 58
    .line 59
    iget-object p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 60
    .line 61
    aget p1, p1, v3

    .line 62
    .line 63
    return p1

    .line 64
    :cond_5
    if-ne v3, v1, :cond_2

    .line 65
    .line 66
    return v8
.end method

.method public insertKey(J)I
    .locals 11

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    ushr-long v0, p1, v0

    .line 4
    .line 5
    xor-long/2addr v0, p1

    .line 6
    long-to-int v0, v0

    .line 7
    const v1, 0x7fffffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    rem-int v2, v0, v2

    .line 15
    .line 16
    aget-wide v3, v1, v2

    .line 17
    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    cmp-long v7, v3, v5

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x1

    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    move v7, v9

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v7, v8

    .line 29
    :goto_0
    iput-boolean v8, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 30
    .line 31
    if-nez v7, :cond_1

    .line 32
    .line 33
    iput-boolean v9, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 34
    .line 35
    aput-wide p1, v1, v2

    .line 36
    .line 37
    return v2

    .line 38
    :cond_1
    cmp-long v3, v3, p1

    .line 39
    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    neg-int p1, v2

    .line 43
    sub-int/2addr p1, v9

    .line 44
    return p1

    .line 45
    :cond_2
    array-length v1, v1

    .line 46
    add-int/lit8 v3, v1, -0x2

    .line 47
    .line 48
    rem-int/2addr v0, v3

    .line 49
    add-int/2addr v0, v9

    .line 50
    move v3, v2

    .line 51
    :goto_1
    sub-int/2addr v3, v0

    .line 52
    if-gez v3, :cond_3

    .line 53
    .line 54
    add-int/2addr v3, v1

    .line 55
    :cond_3
    iget-object v4, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 56
    .line 57
    aget-wide v7, v4, v3

    .line 58
    .line 59
    cmp-long v10, v7, v5

    .line 60
    .line 61
    if-eqz v10, :cond_6

    .line 62
    .line 63
    cmp-long v4, v7, p1

    .line 64
    .line 65
    if-nez v4, :cond_4

    .line 66
    .line 67
    neg-int p1, v3

    .line 68
    sub-int/2addr p1, v9

    .line 69
    return p1

    .line 70
    :cond_4
    if-eq v3, v2, :cond_5

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_5
    const-string p1, "No free or removed slots available. Key set full?!!"

    .line 74
    .line 75
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    return p1

    .line 80
    :cond_6
    iput-boolean v9, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 81
    .line 82
    aput-wide p1, v4, v3

    .line 83
    .line 84
    return v3
.end method

.method public put(JI)V
    .locals 12

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    ushr-long v0, p1, v0

    .line 4
    .line 5
    xor-long/2addr v0, p1

    .line 6
    long-to-int v0, v0

    .line 7
    const v1, 0x7fffffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    rem-int v2, v0, v2

    .line 15
    .line 16
    aget-wide v3, v1, v2

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 20
    .line 21
    const-wide/16 v6, 0x0

    .line 22
    .line 23
    cmp-long v8, v3, v6

    .line 24
    .line 25
    const/4 v9, 0x1

    .line 26
    if-nez v8, :cond_0

    .line 27
    .line 28
    iput-boolean v9, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 29
    .line 30
    aput-wide p1, v1, v2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    cmp-long v3, v3, p1

    .line 34
    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    neg-int p1, v2

    .line 38
    :goto_0
    add-int/lit8 v2, p1, -0x1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    array-length v1, v1

    .line 42
    add-int/lit8 v3, v1, -0x2

    .line 43
    .line 44
    rem-int/2addr v0, v3

    .line 45
    add-int/2addr v0, v9

    .line 46
    move v3, v2

    .line 47
    :cond_2
    sub-int/2addr v3, v0

    .line 48
    if-gez v3, :cond_3

    .line 49
    .line 50
    add-int/2addr v3, v1

    .line 51
    :cond_3
    iget-object v4, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 52
    .line 53
    aget-wide v10, v4, v3

    .line 54
    .line 55
    cmp-long v8, v10, v6

    .line 56
    .line 57
    if-nez v8, :cond_4

    .line 58
    .line 59
    iput-boolean v9, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 60
    .line 61
    aput-wide p1, v4, v3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    cmp-long v4, v10, p1

    .line 65
    .line 66
    if-nez v4, :cond_5

    .line 67
    .line 68
    neg-int p1, v3

    .line 69
    goto :goto_0

    .line 70
    :cond_5
    if-ne v3, v2, :cond_2

    .line 71
    .line 72
    :goto_1
    move v2, v3

    .line 73
    :goto_2
    if-gez v2, :cond_6

    .line 74
    .line 75
    neg-int p1, v2

    .line 76
    add-int/lit8 v2, p1, -0x1

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_6
    move v5, v9

    .line 80
    :goto_3
    iget-object p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 81
    .line 82
    aput p3, p1, v2

    .line 83
    .line 84
    if-eqz v5, :cond_c

    .line 85
    .line 86
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 87
    .line 88
    if-eqz p1, :cond_7

    .line 89
    .line 90
    iget p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->free:I

    .line 91
    .line 92
    sub-int/2addr p1, v9

    .line 93
    iput p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->free:I

    .line 94
    .line 95
    :cond_7
    iget p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->size:I

    .line 96
    .line 97
    add-int/2addr p1, v9

    .line 98
    iput p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->size:I

    .line 99
    .line 100
    iget p2, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->maxSize:I

    .line 101
    .line 102
    if-gt p1, p2, :cond_8

    .line 103
    .line 104
    iget p3, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->free:I

    .line 105
    .line 106
    if-nez p3, :cond_c

    .line 107
    .line 108
    :cond_8
    iget-object p3, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 109
    .line 110
    array-length p3, p3

    .line 111
    if-le p1, p2, :cond_9

    .line 112
    .line 113
    shl-int/lit8 p1, p3, 0x1

    .line 114
    .line 115
    invoke-static {p1}, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->nextPrime(I)I

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    :cond_9
    iget-object p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 120
    .line 121
    array-length p2, p1

    .line 122
    iget-object v0, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 123
    .line 124
    new-array v1, p3, [J

    .line 125
    .line 126
    iput-object v1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 127
    .line 128
    new-array p3, p3, [I

    .line 129
    .line 130
    iput-object p3, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 131
    .line 132
    :goto_4
    add-int/lit8 p3, p2, -0x1

    .line 133
    .line 134
    if-lez p2, :cond_b

    .line 135
    .line 136
    aget-wide v1, p1, p3

    .line 137
    .line 138
    cmp-long p2, v1, v6

    .line 139
    .line 140
    if-eqz p2, :cond_a

    .line 141
    .line 142
    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->insertKey(J)I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    iget-object v1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 147
    .line 148
    aget v2, v0, p3

    .line 149
    .line 150
    aput v2, v1, p2

    .line 151
    .line 152
    :cond_a
    move p2, p3

    .line 153
    goto :goto_4

    .line 154
    :cond_b
    iget-object p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 155
    .line 156
    array-length p1, p1

    .line 157
    add-int/lit8 p2, p1, -0x1

    .line 158
    .line 159
    int-to-float p3, p1

    .line 160
    const/high16 v0, 0x3f000000    # 0.5f

    .line 161
    .line 162
    mul-float/2addr p3, v0

    .line 163
    float-to-int p3, p3

    .line 164
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    iput p2, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->maxSize:I

    .line 169
    .line 170
    iget p2, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->size:I

    .line 171
    .line 172
    sub-int/2addr p1, p2

    .line 173
    iput p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->free:I

    .line 174
    .line 175
    :cond_c
    return-void
.end method

.method public putIfAbsent(JI)I
    .locals 11

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    ushr-long v0, p1, v0

    .line 4
    .line 5
    xor-long/2addr v0, p1

    .line 6
    long-to-int v0, v0

    .line 7
    const v1, 0x7fffffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, v1

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    rem-int v2, v0, v2

    .line 15
    .line 16
    aget-wide v3, v1, v2

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 20
    .line 21
    const-wide/16 v5, 0x0

    .line 22
    .line 23
    cmp-long v7, v3, v5

    .line 24
    .line 25
    const/4 v8, 0x1

    .line 26
    if-nez v7, :cond_0

    .line 27
    .line 28
    iput-boolean v8, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 29
    .line 30
    aput-wide p1, v1, v2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    cmp-long v1, v3, p1

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    neg-int p1, v2

    .line 38
    :goto_0
    add-int/lit8 v2, p1, -0x1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    move v1, v2

    .line 42
    :cond_2
    iget-object v3, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 43
    .line 44
    array-length v4, v3

    .line 45
    add-int/lit8 v4, v4, -0x2

    .line 46
    .line 47
    rem-int v4, v0, v4

    .line 48
    .line 49
    add-int/2addr v4, v8

    .line 50
    sub-int/2addr v1, v4

    .line 51
    if-gez v1, :cond_3

    .line 52
    .line 53
    array-length v4, v3

    .line 54
    add-int/2addr v1, v4

    .line 55
    :cond_3
    aget-wide v9, v3, v1

    .line 56
    .line 57
    cmp-long v4, v9, v5

    .line 58
    .line 59
    if-nez v4, :cond_4

    .line 60
    .line 61
    iput-boolean v8, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 62
    .line 63
    aput-wide p1, v3, v1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    cmp-long v3, v9, p1

    .line 67
    .line 68
    if-nez v3, :cond_5

    .line 69
    .line 70
    neg-int p1, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_5
    if-ne v1, v2, :cond_2

    .line 73
    .line 74
    :goto_1
    move v2, v1

    .line 75
    :goto_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 76
    .line 77
    if-gez v2, :cond_6

    .line 78
    .line 79
    neg-int p2, v2

    .line 80
    sub-int/2addr p2, v8

    .line 81
    aget p1, p1, p2

    .line 82
    .line 83
    return p1

    .line 84
    :cond_6
    aput p3, p1, v2

    .line 85
    .line 86
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->consumeFreeSlot:Z

    .line 87
    .line 88
    if-eqz p1, :cond_7

    .line 89
    .line 90
    iget p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->free:I

    .line 91
    .line 92
    sub-int/2addr p1, v8

    .line 93
    iput p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->free:I

    .line 94
    .line 95
    :cond_7
    iget p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->size:I

    .line 96
    .line 97
    add-int/2addr p1, v8

    .line 98
    iput p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->size:I

    .line 99
    .line 100
    iget p2, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->maxSize:I

    .line 101
    .line 102
    if-gt p1, p2, :cond_9

    .line 103
    .line 104
    iget p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->free:I

    .line 105
    .line 106
    if-nez p1, :cond_8

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_8
    return p3

    .line 110
    :cond_9
    :goto_3
    iget-object p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 111
    .line 112
    array-length p1, p1

    .line 113
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->rehash(I)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 117
    .line 118
    array-length p1, p1

    .line 119
    add-int/lit8 p2, p1, -0x1

    .line 120
    .line 121
    int-to-float v0, p1

    .line 122
    const/high16 v1, 0x3f000000    # 0.5f

    .line 123
    .line 124
    mul-float/2addr v0, v1

    .line 125
    float-to-int v0, v0

    .line 126
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    iput p2, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->maxSize:I

    .line 131
    .line 132
    iget p2, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->size:I

    .line 133
    .line 134
    sub-int/2addr p1, p2

    .line 135
    iput p1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->free:I

    .line 136
    .line 137
    return p3
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->set:[J

    .line 9
    .line 10
    iget-object v2, p0, Lcom/alibaba/fastjson2/internal/trove/map/hash/TLongIntHashMap;->values:[I

    .line 11
    .line 12
    array-length v3, v1

    .line 13
    const/4 v4, 0x1

    .line 14
    :goto_0
    add-int/lit8 v5, v3, -0x1

    .line 15
    .line 16
    if-lez v3, :cond_2

    .line 17
    .line 18
    aget-wide v6, v1, v5

    .line 19
    .line 20
    const-wide/16 v8, 0x0

    .line 21
    .line 22
    cmp-long v3, v6, v8

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    aget v3, v2, v5

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const-string v8, ", "

    .line 33
    .line 34
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 v6, 0x3d

    .line 41
    .line 42
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :cond_1
    move v3, v5

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/16 v1, 0x7d

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method
