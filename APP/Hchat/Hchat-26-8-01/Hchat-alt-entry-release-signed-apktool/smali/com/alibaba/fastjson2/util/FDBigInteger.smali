.class public final Lcom/alibaba/fastjson2/util/FDBigInteger;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final MAX_FIVE_POW:I = 0x154

.field private static final POW_5_CACHE:[Lcom/alibaba/fastjson2/util/FDBigInteger;

.field private static final SMALL_5_POW:[I


# instance fields
.field private data:[I

.field immutable:Z

.field private nWords:I

.field private offset:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->SMALL_5_POW:[I

    .line 9
    .line 10
    const/16 v0, 0x154

    .line 11
    .line 12
    new-array v1, v0, [Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 13
    .line 14
    sput-object v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->POW_5_CACHE:[Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    :goto_0
    sget-object v3, Lcom/alibaba/fastjson2/util/FDBigInteger;->SMALL_5_POW:[I

    .line 19
    .line 20
    array-length v4, v3

    .line 21
    const/4 v5, 0x1

    .line 22
    if-ge v2, v4, :cond_0

    .line 23
    .line 24
    new-instance v4, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 25
    .line 26
    aget v3, v3, v2

    .line 27
    .line 28
    filled-new-array {v3}, [I

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v4, v3, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 33
    .line 34
    .line 35
    iput-boolean v5, v4, Lcom/alibaba/fastjson2/util/FDBigInteger;->immutable:Z

    .line 36
    .line 37
    sget-object v3, Lcom/alibaba/fastjson2/util/FDBigInteger;->POW_5_CACHE:[Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 38
    .line 39
    aput-object v4, v3, v2

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->POW_5_CACHE:[Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 45
    .line 46
    add-int/lit8 v3, v2, -0x1

    .line 47
    .line 48
    aget-object v1, v1, v3

    .line 49
    .line 50
    :goto_1
    if-ge v2, v0, :cond_1

    .line 51
    .line 52
    sget-object v3, Lcom/alibaba/fastjson2/util/FDBigInteger;->POW_5_CACHE:[Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 53
    .line 54
    const/4 v4, 0x5

    .line 55
    invoke-direct {v1, v4}, Lcom/alibaba/fastjson2/util/FDBigInteger;->mult(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    aput-object v1, v3, v2

    .line 60
    .line 61
    iput-boolean v5, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->immutable:Z

    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-void

    .line 67
    :array_0
    .array-data 4
        0x1
        0x5
        0x19
        0x7d
        0x271
        0xc35
        0x3d09
        0x1312d
        0x5f5e1
        0x1dcd65
        0x9502f9
        0x2e90edd
        0xe8d4a51
        0x48c27395
    .end array-data
.end method

.method public constructor <init>(J[CII)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    add-int/lit8 v0, p5, 0x8

    .line 5
    .line 6
    div-int/lit8 v0, v0, 0x9

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-array v0, v0, [I

    .line 14
    .line 15
    iput-object v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 16
    .line 17
    long-to-int v2, p1

    .line 18
    const/4 v3, 0x0

    .line 19
    aput v2, v0, v3

    .line 20
    .line 21
    const/16 v2, 0x20

    .line 22
    .line 23
    ushr-long/2addr p1, v2

    .line 24
    long-to-int p1, p1

    .line 25
    const/4 p2, 0x1

    .line 26
    aput p1, v0, p2

    .line 27
    .line 28
    iput v3, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 29
    .line 30
    iput v1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 31
    .line 32
    add-int/lit8 p1, p5, -0x5

    .line 33
    .line 34
    :goto_0
    if-ge p4, p1, :cond_1

    .line 35
    .line 36
    add-int/lit8 v0, p4, 0x5

    .line 37
    .line 38
    add-int/lit8 v1, p4, 0x1

    .line 39
    .line 40
    aget-char p4, p3, p4

    .line 41
    .line 42
    add-int/lit8 p4, p4, -0x30

    .line 43
    .line 44
    move v4, v1

    .line 45
    move v1, p4

    .line 46
    move p4, v4

    .line 47
    :goto_1
    if-ge p4, v0, :cond_0

    .line 48
    .line 49
    mul-int/lit8 v1, v1, 0xa

    .line 50
    .line 51
    add-int/lit8 v2, p4, 0x1

    .line 52
    .line 53
    aget-char p4, p3, p4

    .line 54
    .line 55
    add-int/2addr v1, p4

    .line 56
    add-int/lit8 v1, v1, -0x30

    .line 57
    .line 58
    move p4, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    const v0, 0x186a0

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, v0, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;->multAddMe(II)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move p1, p2

    .line 68
    :goto_2
    if-ge p4, p5, :cond_2

    .line 69
    .line 70
    mul-int/lit8 v3, v3, 0xa

    .line 71
    .line 72
    add-int/lit8 v0, p4, 0x1

    .line 73
    .line 74
    aget-char p4, p3, p4

    .line 75
    .line 76
    add-int/2addr v3, p4

    .line 77
    add-int/lit8 v3, v3, -0x30

    .line 78
    .line 79
    mul-int/lit8 p1, p1, 0xa

    .line 80
    .line 81
    move p4, v0

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    if-eq p1, p2, :cond_3

    .line 84
    .line 85
    invoke-direct {p0, p1, v3}, Lcom/alibaba/fastjson2/util/FDBigInteger;->multAddMe(II)V

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-direct {p0}, Lcom/alibaba/fastjson2/util/FDBigInteger;->trimLeadingZeros()V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method private constructor <init>([II)V
    .locals 0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 94
    iput p2, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 95
    array-length p1, p1

    iput p1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 96
    invoke-direct {p0}, Lcom/alibaba/fastjson2/util/FDBigInteger;->trimLeadingZeros()V

    return-void
.end method

.method private static big5pow(I)Lcom/alibaba/fastjson2/util/FDBigInteger;
    .locals 1

    .line 1
    const/16 v0, 0x154

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->POW_5_CACHE:[Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 6
    .line 7
    aget-object p0, v0, p0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/FDBigInteger;->big5powRec(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private static big5powRec(I)Lcom/alibaba/fastjson2/util/FDBigInteger;
    .locals 6

    .line 1
    const/16 v0, 0x154

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->POW_5_CACHE:[Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 6
    .line 7
    aget-object p0, v0, p0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    shr-int/lit8 v0, p0, 0x1

    .line 11
    .line 12
    sub-int/2addr p0, v0

    .line 13
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/FDBigInteger;->big5powRec(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->SMALL_5_POW:[I

    .line 18
    .line 19
    array-length v2, v1

    .line 20
    if-ge p0, v2, :cond_1

    .line 21
    .line 22
    aget p0, v1, p0

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/util/FDBigInteger;->mult(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/FDBigInteger;->big5powRec(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget v1, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    iget v2, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 39
    .line 40
    add-int/2addr v2, v1

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x1

    .line 43
    if-ne v2, v4, :cond_3

    .line 44
    .line 45
    iget-object v0, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 46
    .line 47
    aget v0, v0, v3

    .line 48
    .line 49
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/util/FDBigInteger;->mult(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    iget v2, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 55
    .line 56
    if-nez v2, :cond_4

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_4
    iget v5, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 60
    .line 61
    add-int/2addr v5, v2

    .line 62
    if-ne v5, v4, :cond_5

    .line 63
    .line 64
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 65
    .line 66
    aget p0, p0, v3

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/util/FDBigInteger;->mult(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_5
    add-int v3, v1, v2

    .line 74
    .line 75
    new-array v3, v3, [I

    .line 76
    .line 77
    iget-object v4, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 78
    .line 79
    iget-object v5, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 80
    .line 81
    invoke-static {v4, v1, v5, v2, v3}, Lcom/alibaba/fastjson2/util/FDBigInteger;->mult([II[II[I)V

    .line 82
    .line 83
    .line 84
    new-instance v1, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 85
    .line 86
    iget v0, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 87
    .line 88
    iget p0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 89
    .line 90
    add-int/2addr v0, p0

    .line 91
    invoke-direct {v1, v3, v0}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 92
    .line 93
    .line 94
    return-object v1
.end method

.method private static checkZeroTail([II)I
    .locals 1

    .line 1
    :cond_0
    if-lez p1, :cond_1

    .line 2
    .line 3
    add-int/lit8 p1, p1, -0x1

    .line 4
    .line 5
    aget v0, p0, p1

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_1
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private static leftShift([II[IIII)V
    .locals 2

    :goto_0
    if-lez p1, :cond_0

    shl-int/2addr p5, p3

    add-int/lit8 v0, p1, -0x1

    .line 145
    aget v0, p0, v0

    ushr-int v1, v0, p4

    or-int/2addr p5, v1

    .line 146
    aput p5, p2, p1

    add-int/lit8 p1, p1, -0x1

    move p5, v0

    goto :goto_0

    :cond_0
    shl-int p0, p5, p3

    const/4 p1, 0x0

    .line 147
    aput p0, p2, p1

    return-void
.end method

.method private mult(I)Lcom/alibaba/fastjson2/util/FDBigInteger;
    .locals 3

    .line 58
    iget v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 59
    new-array v1, v1, [I

    .line 60
    iget-object v2, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    invoke-static {v2, v0, p1, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;->mult([III[I)V

    .line 61
    new-instance p1, Lcom/alibaba/fastjson2/util/FDBigInteger;

    iget v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    invoke-direct {p1, v1, v0}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    return-object p1
.end method

.method private static mult([III[I)V
    .locals 8

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    const-wide/16 v4, 0x0

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    .line 55
    aget v6, p0, p2

    int-to-long v6, v6

    and-long/2addr v6, v2

    mul-long/2addr v6, v0

    add-long/2addr v6, v4

    long-to-int v4, v6

    .line 56
    aput v4, p3, p2

    const/16 v4, 0x20

    ushr-long v4, v6, v4

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    long-to-int p0, v4

    .line 57
    aput p0, p3, p1

    return-void
.end method

.method private static mult([II[II[I)V
    .locals 16

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move/from16 v2, p1

    .line 5
    .line 6
    move v3, v1

    .line 7
    :goto_0
    if-ge v3, v2, :cond_1

    .line 8
    .line 9
    aget v4, p0, v3

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    const-wide v6, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr v4, v6

    .line 18
    const-wide/16 v8, 0x0

    .line 19
    .line 20
    move v10, v1

    .line 21
    :goto_1
    if-ge v10, v0, :cond_0

    .line 22
    .line 23
    add-int v11, v3, v10

    .line 24
    .line 25
    aget v12, p4, v11

    .line 26
    .line 27
    int-to-long v12, v12

    .line 28
    and-long/2addr v12, v6

    .line 29
    aget v14, p2, v10

    .line 30
    .line 31
    int-to-long v14, v14

    .line 32
    and-long/2addr v14, v6

    .line 33
    mul-long/2addr v14, v4

    .line 34
    add-long/2addr v14, v12

    .line 35
    add-long/2addr v14, v8

    .line 36
    long-to-int v8, v14

    .line 37
    aput v8, p4, v11

    .line 38
    .line 39
    const/16 v8, 0x20

    .line 40
    .line 41
    ushr-long v8, v14, v8

    .line 42
    .line 43
    add-int/lit8 v10, v10, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    add-int v4, v3, v0

    .line 47
    .line 48
    long-to-int v5, v8

    .line 49
    aput v5, p4, v4

    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-void
.end method

.method private multAddMe(II)V
    .locals 9

    .line 1
    int-to-long v0, p1

    .line 2
    const-wide v2, 0xffffffffL

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    iget-object p1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    aget v5, p1, v4

    .line 12
    .line 13
    int-to-long v5, v5

    .line 14
    and-long/2addr v5, v2

    .line 15
    mul-long/2addr v5, v0

    .line 16
    int-to-long v7, p2

    .line 17
    and-long/2addr v7, v2

    .line 18
    add-long/2addr v5, v7

    .line 19
    long-to-int p2, v5

    .line 20
    aput p2, p1, v4

    .line 21
    .line 22
    const/16 p1, 0x20

    .line 23
    .line 24
    ushr-long v4, v5, p1

    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    :goto_0
    iget v6, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 28
    .line 29
    if-ge p2, v6, :cond_0

    .line 30
    .line 31
    iget-object v6, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 32
    .line 33
    aget v7, v6, p2

    .line 34
    .line 35
    int-to-long v7, v7

    .line 36
    and-long/2addr v7, v2

    .line 37
    mul-long/2addr v7, v0

    .line 38
    add-long/2addr v7, v4

    .line 39
    long-to-int v4, v7

    .line 40
    aput v4, v6, p2

    .line 41
    .line 42
    ushr-long v4, v7, p1

    .line 43
    .line 44
    add-int/lit8 p2, p2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-wide/16 p1, 0x0

    .line 48
    .line 49
    cmp-long p1, v4, p1

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    iget-object p1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 54
    .line 55
    add-int/lit8 p2, v6, 0x1

    .line 56
    .line 57
    iput p2, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 58
    .line 59
    long-to-int p2, v4

    .line 60
    aput p2, p1, v6

    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method private trimLeadingZeros()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    aget v1, v1, v0

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    :goto_0
    if-lez v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 16
    .line 17
    add-int/lit8 v2, v0, -0x1

    .line 18
    .line 19
    aget v1, v1, v2

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public static valueOfMulPow52(JII)Lcom/alibaba/fastjson2/util/FDBigInteger;
    .locals 19

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    move/from16 v2, p2

    .line 4
    .line 5
    move/from16 v3, p3

    .line 6
    .line 7
    long-to-int v4, v0

    .line 8
    const/16 v5, 0x20

    .line 9
    .line 10
    ushr-long/2addr v0, v5

    .line 11
    long-to-int v0, v0

    .line 12
    shr-int/lit8 v1, v3, 0x5

    .line 13
    .line 14
    and-int/lit8 v6, v3, 0x1f

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    if-eqz v2, :cond_8

    .line 18
    .line 19
    sget-object v8, Lcom/alibaba/fastjson2/util/FDBigInteger;->SMALL_5_POW:[I

    .line 20
    .line 21
    array-length v9, v8

    .line 22
    const-wide v10, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    if-ge v2, v9, :cond_1

    .line 28
    .line 29
    aget v2, v8, v2

    .line 30
    .line 31
    int-to-long v2, v2

    .line 32
    and-long/2addr v2, v10

    .line 33
    int-to-long v7, v4

    .line 34
    and-long/2addr v7, v10

    .line 35
    mul-long/2addr v7, v2

    .line 36
    long-to-int v4, v7

    .line 37
    ushr-long/2addr v7, v5

    .line 38
    int-to-long v12, v0

    .line 39
    and-long v9, v12, v10

    .line 40
    .line 41
    mul-long/2addr v9, v2

    .line 42
    add-long/2addr v9, v7

    .line 43
    long-to-int v0, v9

    .line 44
    ushr-long v2, v9, v5

    .line 45
    .line 46
    long-to-int v2, v2

    .line 47
    if-nez v6, :cond_0

    .line 48
    .line 49
    new-instance v3, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 50
    .line 51
    filled-new-array {v4, v0, v2}, [I

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {v3, v0, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 56
    .line 57
    .line 58
    return-object v3

    .line 59
    :cond_0
    new-instance v3, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 60
    .line 61
    shl-int v5, v4, v6

    .line 62
    .line 63
    shl-int v7, v0, v6

    .line 64
    .line 65
    rsub-int/lit8 v8, v6, 0x20

    .line 66
    .line 67
    ushr-int/2addr v4, v8

    .line 68
    or-int/2addr v4, v7

    .line 69
    shl-int v6, v2, v6

    .line 70
    .line 71
    ushr-int/2addr v0, v8

    .line 72
    or-int/2addr v0, v6

    .line 73
    ushr-int/2addr v2, v8

    .line 74
    filled-new-array {v5, v4, v0, v2}, [I

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-direct {v3, v0, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 79
    .line 80
    .line 81
    return-object v3

    .line 82
    :cond_1
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/FDBigInteger;->big5pow(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v2, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 87
    .line 88
    iget v6, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 89
    .line 90
    int-to-long v8, v4

    .line 91
    and-long/2addr v8, v10

    .line 92
    if-nez v0, :cond_3

    .line 93
    .line 94
    add-int/lit8 v12, v6, 0x1

    .line 95
    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    const/4 v13, 0x1

    .line 99
    goto :goto_0

    .line 100
    :cond_2
    move v13, v7

    .line 101
    :goto_0
    add-int/2addr v12, v13

    .line 102
    new-array v12, v12, [I

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    add-int/lit8 v12, v6, 0x2

    .line 106
    .line 107
    if-eqz v3, :cond_4

    .line 108
    .line 109
    const/4 v13, 0x1

    .line 110
    goto :goto_1

    .line 111
    :cond_4
    move v13, v7

    .line 112
    :goto_1
    add-int/2addr v12, v13

    .line 113
    new-array v12, v12, [I

    .line 114
    .line 115
    :goto_2
    const-wide/16 v13, 0x0

    .line 116
    .line 117
    move/from16 v16, v5

    .line 118
    .line 119
    move v15, v7

    .line 120
    move-wide v4, v13

    .line 121
    const/16 p0, 0x1

    .line 122
    .line 123
    :goto_3
    if-ge v15, v6, :cond_5

    .line 124
    .line 125
    move-wide/from16 v17, v10

    .line 126
    .line 127
    aget v10, v2, v15

    .line 128
    .line 129
    int-to-long v10, v10

    .line 130
    and-long v10, v10, v17

    .line 131
    .line 132
    mul-long/2addr v10, v8

    .line 133
    add-long/2addr v10, v4

    .line 134
    long-to-int v4, v10

    .line 135
    aput v4, v12, v15

    .line 136
    .line 137
    ushr-long v4, v10, v16

    .line 138
    .line 139
    add-int/lit8 v15, v15, 0x1

    .line 140
    .line 141
    move-wide/from16 v10, v17

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_5
    move-wide/from16 v17, v10

    .line 145
    .line 146
    long-to-int v4, v4

    .line 147
    aput v4, v12, v6

    .line 148
    .line 149
    if-eqz v0, :cond_7

    .line 150
    .line 151
    int-to-long v4, v0

    .line 152
    and-long v4, v4, v17

    .line 153
    .line 154
    :goto_4
    if-ge v7, v6, :cond_6

    .line 155
    .line 156
    add-int/lit8 v0, v7, 0x1

    .line 157
    .line 158
    aget v8, v12, v0

    .line 159
    .line 160
    int-to-long v8, v8

    .line 161
    and-long v8, v8, v17

    .line 162
    .line 163
    aget v7, v2, v7

    .line 164
    .line 165
    int-to-long v10, v7

    .line 166
    and-long v10, v10, v17

    .line 167
    .line 168
    mul-long/2addr v10, v4

    .line 169
    add-long/2addr v10, v8

    .line 170
    add-long/2addr v10, v13

    .line 171
    long-to-int v7, v10

    .line 172
    aput v7, v12, v0

    .line 173
    .line 174
    ushr-long v13, v10, v16

    .line 175
    .line 176
    move v7, v0

    .line 177
    goto :goto_4

    .line 178
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 179
    .line 180
    long-to-int v0, v13

    .line 181
    aput v0, v12, v6

    .line 182
    .line 183
    :cond_7
    new-instance v0, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 184
    .line 185
    iget v1, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 186
    .line 187
    invoke-direct {v0, v12, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftShift(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :cond_8
    move/from16 v16, v5

    .line 196
    .line 197
    if-eqz v3, :cond_a

    .line 198
    .line 199
    if-nez v6, :cond_9

    .line 200
    .line 201
    new-instance v2, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 202
    .line 203
    filled-new-array {v4, v0}, [I

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-direct {v2, v0, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 208
    .line 209
    .line 210
    return-object v2

    .line 211
    :cond_9
    new-instance v2, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 212
    .line 213
    shl-int v3, v4, v6

    .line 214
    .line 215
    shl-int v5, v0, v6

    .line 216
    .line 217
    rsub-int/lit8 v6, v6, 0x20

    .line 218
    .line 219
    ushr-int/2addr v4, v6

    .line 220
    or-int/2addr v4, v5

    .line 221
    ushr-int/2addr v0, v6

    .line 222
    filled-new-array {v3, v4, v0}, [I

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-direct {v2, v0, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 227
    .line 228
    .line 229
    return-object v2

    .line 230
    :cond_a
    new-instance v1, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 231
    .line 232
    filled-new-array {v4, v0}, [I

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-direct {v1, v0, v7}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 237
    .line 238
    .line 239
    return-object v1
.end method


# virtual methods
.method public cmp(Lcom/alibaba/fastjson2/util/FDBigInteger;)I
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    iget v2, p1, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 7
    .line 8
    iget v3, p1, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 9
    .line 10
    add-int/2addr v3, v2

    .line 11
    const/4 v4, 0x1

    .line 12
    if-le v1, v3, :cond_0

    .line 13
    .line 14
    return v4

    .line 15
    :cond_0
    const/4 v5, -0x1

    .line 16
    if-ge v1, v3, :cond_1

    .line 17
    .line 18
    return v5

    .line 19
    :cond_1
    if-lez v0, :cond_3

    .line 20
    .line 21
    if-lez v2, :cond_3

    .line 22
    .line 23
    iget-object v1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 24
    .line 25
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    aget v1, v1, v0

    .line 28
    .line 29
    iget-object v3, p1, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 30
    .line 31
    add-int/lit8 v2, v2, -0x1

    .line 32
    .line 33
    aget v3, v3, v2

    .line 34
    .line 35
    if-eq v1, v3, :cond_1

    .line 36
    .line 37
    int-to-long v0, v1

    .line 38
    const-wide v6, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v0, v6

    .line 44
    int-to-long v2, v3

    .line 45
    and-long/2addr v2, v6

    .line 46
    cmp-long p1, v0, v2

    .line 47
    .line 48
    if-gez p1, :cond_2

    .line 49
    .line 50
    return v5

    .line 51
    :cond_2
    return v4

    .line 52
    :cond_3
    if-lez v0, :cond_4

    .line 53
    .line 54
    iget-object p1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 55
    .line 56
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/util/FDBigInteger;->checkZeroTail([II)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    return p1

    .line 61
    :cond_4
    if-lez v2, :cond_5

    .line 62
    .line 63
    iget-object p1, p1, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 64
    .line 65
    invoke-static {p1, v2}, Lcom/alibaba/fastjson2/util/FDBigInteger;->checkZeroTail([II)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    neg-int p1, p1

    .line 70
    return p1

    .line 71
    :cond_5
    const/4 p1, 0x0

    .line 72
    return p1
.end method

.method public cmpPow52(II)I
    .locals 6

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    shr-int/lit8 p1, p2, 0x5

    .line 4
    .line 5
    and-int/lit8 p2, p2, 0x1f

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    const/4 v2, 0x1

    .line 13
    add-int/2addr p1, v2

    .line 14
    if-le v1, p1, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    const/4 v3, -0x1

    .line 18
    if-ge v1, p1, :cond_1

    .line 19
    .line 20
    return v3

    .line 21
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 22
    .line 23
    add-int/lit8 v1, v0, -0x1

    .line 24
    .line 25
    aget v1, p1, v1

    .line 26
    .line 27
    shl-int p2, v2, p2

    .line 28
    .line 29
    if-eq v1, p2, :cond_3

    .line 30
    .line 31
    int-to-long v0, v1

    .line 32
    const-wide v4, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v0, v4

    .line 38
    int-to-long p1, p2

    .line 39
    and-long/2addr p1, v4

    .line 40
    cmp-long p1, v0, p1

    .line 41
    .line 42
    if-gez p1, :cond_2

    .line 43
    .line 44
    return v3

    .line 45
    :cond_2
    return v2

    .line 46
    :cond_3
    sub-int/2addr v0, v2

    .line 47
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/util/FDBigInteger;->checkZeroTail([II)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1

    .line 52
    :cond_4
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/FDBigInteger;->big5pow(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftShift(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/util/FDBigInteger;->cmp(Lcom/alibaba/fastjson2/util/FDBigInteger;)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    return p1
.end method

.method public leftInplaceSub(Lcom/alibaba/fastjson2/util/FDBigInteger;)Lcom/alibaba/fastjson2/util/FDBigInteger;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->immutable:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    new-instance v2, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 10
    .line 11
    iget-object v3, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 12
    .line 13
    invoke-virtual {v3}, [I->clone()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, [I

    .line 18
    .line 19
    iget v4, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 20
    .line 21
    invoke-direct {v2, v3, v4}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v2, v0

    .line 26
    :goto_0
    iget v3, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 27
    .line 28
    iget v4, v2, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 29
    .line 30
    sub-int/2addr v3, v4

    .line 31
    iget-object v4, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 32
    .line 33
    iget-object v5, v2, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 34
    .line 35
    iget v6, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 36
    .line 37
    iget v7, v2, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    if-gez v3, :cond_2

    .line 41
    .line 42
    sub-int v9, v7, v3

    .line 43
    .line 44
    array-length v10, v5

    .line 45
    if-ge v9, v10, :cond_1

    .line 46
    .line 47
    neg-int v3, v3

    .line 48
    invoke-static {v5, v8, v5, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    .line 50
    .line 51
    invoke-static {v5, v8, v3, v8}, Ljava/util/Arrays;->fill([IIII)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-array v10, v9, [I

    .line 56
    .line 57
    neg-int v3, v3

    .line 58
    invoke-static {v5, v8, v10, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    iput-object v10, v2, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 62
    .line 63
    move-object v5, v10

    .line 64
    :goto_1
    iget v1, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 65
    .line 66
    iput v1, v2, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 67
    .line 68
    iput v9, v2, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 69
    .line 70
    move v3, v8

    .line 71
    move v7, v9

    .line 72
    :cond_2
    const-wide/16 v11, 0x0

    .line 73
    .line 74
    :goto_2
    const-wide v13, 0xffffffffL

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    if-ge v8, v6, :cond_3

    .line 80
    .line 81
    if-ge v3, v7, :cond_3

    .line 82
    .line 83
    aget v15, v5, v3

    .line 84
    .line 85
    move-object/from16 v16, v2

    .line 86
    .line 87
    const/16 p1, 0x20

    .line 88
    .line 89
    int-to-long v1, v15

    .line 90
    and-long/2addr v1, v13

    .line 91
    aget v15, v4, v8

    .line 92
    .line 93
    const-wide/16 v17, 0x0

    .line 94
    .line 95
    int-to-long v9, v15

    .line 96
    and-long/2addr v9, v13

    .line 97
    sub-long/2addr v1, v9

    .line 98
    add-long/2addr v1, v11

    .line 99
    long-to-int v9, v1

    .line 100
    aput v9, v5, v3

    .line 101
    .line 102
    shr-long v11, v1, p1

    .line 103
    .line 104
    add-int/lit8 v8, v8, 0x1

    .line 105
    .line 106
    add-int/lit8 v3, v3, 0x1

    .line 107
    .line 108
    move-object/from16 v2, v16

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    move-object/from16 v16, v2

    .line 112
    .line 113
    const/16 p1, 0x20

    .line 114
    .line 115
    const-wide/16 v17, 0x0

    .line 116
    .line 117
    :goto_3
    cmp-long v1, v11, v17

    .line 118
    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    if-ge v3, v7, :cond_4

    .line 122
    .line 123
    aget v1, v5, v3

    .line 124
    .line 125
    int-to-long v1, v1

    .line 126
    and-long/2addr v1, v13

    .line 127
    add-long/2addr v1, v11

    .line 128
    long-to-int v4, v1

    .line 129
    aput v4, v5, v3

    .line 130
    .line 131
    shr-long v11, v1, p1

    .line 132
    .line 133
    add-int/lit8 v3, v3, 0x1

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    invoke-direct/range {v16 .. v16}, Lcom/alibaba/fastjson2/util/FDBigInteger;->trimLeadingZeros()V

    .line 137
    .line 138
    .line 139
    return-object v16
.end method

.method public leftShift(I)Lcom/alibaba/fastjson2/util/FDBigInteger;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 4
    .line 5
    iget v6, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 6
    .line 7
    if-eqz p1, :cond_a

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    shr-int/lit8 v7, p1, 0x5

    .line 14
    .line 15
    and-int/lit8 v3, p1, 0x1f

    .line 16
    .line 17
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->immutable:Z

    .line 18
    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    new-instance p1, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    add-int/2addr v6, v7

    .line 30
    invoke-direct {p1, v0, v6}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    rsub-int/lit8 v4, v3, 0x20

    .line 35
    .line 36
    move p1, v1

    .line 37
    add-int/lit8 v1, p1, -0x1

    .line 38
    .line 39
    aget v5, v0, v1

    .line 40
    .line 41
    ushr-int v2, v5, v4

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    add-int/lit8 v8, p1, 0x1

    .line 46
    .line 47
    new-array v8, v8, [I

    .line 48
    .line 49
    aput v2, v8, p1

    .line 50
    .line 51
    :goto_0
    move-object v2, v8

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    new-array v8, p1, [I

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_1
    invoke-static/range {v0 .. v5}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftShift([II[IIII)V

    .line 57
    .line 58
    .line 59
    move-object v8, v2

    .line 60
    new-instance p1, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 61
    .line 62
    add-int/2addr v6, v7

    .line 63
    invoke-direct {p1, v8, v6}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_3
    move p1, v1

    .line 68
    if-eqz v3, :cond_9

    .line 69
    .line 70
    rsub-int/lit8 v4, v3, 0x20

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    aget v2, v0, v1

    .line 74
    .line 75
    shl-int v5, v2, v3

    .line 76
    .line 77
    if-nez v5, :cond_6

    .line 78
    .line 79
    :goto_2
    add-int/lit8 v5, p1, -0x1

    .line 80
    .line 81
    if-ge v1, v5, :cond_4

    .line 82
    .line 83
    ushr-int/2addr v2, v4

    .line 84
    add-int/lit8 v5, v1, 0x1

    .line 85
    .line 86
    aget v8, v0, v5

    .line 87
    .line 88
    shl-int v9, v8, v3

    .line 89
    .line 90
    or-int/2addr v2, v9

    .line 91
    aput v2, v0, v1

    .line 92
    .line 93
    move v1, v5

    .line 94
    move v2, v8

    .line 95
    goto :goto_2

    .line 96
    :cond_4
    ushr-int/2addr v2, v4

    .line 97
    aput v2, v0, v1

    .line 98
    .line 99
    if-nez v2, :cond_5

    .line 100
    .line 101
    add-int/lit8 v1, p1, -0x1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    move v1, p1

    .line 105
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_6
    add-int/lit8 v1, p1, -0x1

    .line 109
    .line 110
    aget v5, v0, v1

    .line 111
    .line 112
    ushr-int v2, v5, v4

    .line 113
    .line 114
    if-eqz v2, :cond_8

    .line 115
    .line 116
    array-length v8, v0

    .line 117
    if-ne p1, v8, :cond_7

    .line 118
    .line 119
    add-int/lit8 v8, p1, 0x1

    .line 120
    .line 121
    new-array v8, v8, [I

    .line 122
    .line 123
    iput-object v8, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_7
    move-object v8, v0

    .line 127
    :goto_4
    add-int/lit8 v9, p1, 0x1

    .line 128
    .line 129
    aput v2, v8, p1

    .line 130
    .line 131
    move-object v2, v8

    .line 132
    move p1, v9

    .line 133
    goto :goto_5

    .line 134
    :cond_8
    move-object v2, v0

    .line 135
    :goto_5
    invoke-static/range {v0 .. v5}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftShift([II[IIII)V

    .line 136
    .line 137
    .line 138
    :cond_9
    move v1, p1

    .line 139
    :goto_6
    iput v1, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 140
    .line 141
    add-int/2addr v6, v7

    .line 142
    iput v6, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 143
    .line 144
    :cond_a
    :goto_7
    return-object p0
.end method

.method public multByPow52(II)Lcom/alibaba/fastjson2/util/FDBigInteger;
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-eqz p1, :cond_3

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    sget-object v2, Lcom/alibaba/fastjson2/util/FDBigInteger;->SMALL_5_POW:[I

    .line 14
    .line 15
    array-length v3, v2

    .line 16
    if-ge p1, v3, :cond_2

    .line 17
    .line 18
    add-int/lit8 v3, v0, 0x1

    .line 19
    .line 20
    add-int/2addr v3, v1

    .line 21
    new-array v1, v3, [I

    .line 22
    .line 23
    iget-object v3, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 24
    .line 25
    aget p1, v2, p1

    .line 26
    .line 27
    invoke-static {v3, v0, p1, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;->mult([III[I)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 31
    .line 32
    iget v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 33
    .line 34
    invoke-direct {p1, v1, v0}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/FDBigInteger;->big5pow(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget v0, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 43
    .line 44
    iget v2, p1, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 45
    .line 46
    add-int v3, v0, v2

    .line 47
    .line 48
    iget v4, p1, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 49
    .line 50
    add-int/2addr v3, v4

    .line 51
    add-int/2addr v3, v1

    .line 52
    new-array v1, v3, [I

    .line 53
    .line 54
    iget-object v3, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 55
    .line 56
    iget-object v4, p1, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 57
    .line 58
    invoke-static {v3, v0, v4, v2, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;->mult([II[II[I)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 62
    .line 63
    iget v2, p0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 64
    .line 65
    iget p1, p1, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 66
    .line 67
    add-int/2addr v2, p1

    .line 68
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 69
    .line 70
    .line 71
    move-object p1, v0

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move-object p1, p0

    .line 74
    :goto_1
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftShift(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method

.method public rightInplaceSub(Lcom/alibaba/fastjson2/util/FDBigInteger;)Lcom/alibaba/fastjson2/util/FDBigInteger;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->immutable:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    new-instance v2, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 10
    .line 11
    iget-object v3, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 12
    .line 13
    invoke-virtual {v3}, [I->clone()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, [I

    .line 18
    .line 19
    iget v1, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 20
    .line 21
    invoke-direct {v2, v3, v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>([II)V

    .line 22
    .line 23
    .line 24
    move-object v1, v2

    .line 25
    :cond_0
    iget v2, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 26
    .line 27
    iget v3, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 28
    .line 29
    sub-int/2addr v2, v3

    .line 30
    iget-object v3, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 31
    .line 32
    iget-object v4, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 33
    .line 34
    iget v5, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 35
    .line 36
    iget v6, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    if-gez v2, :cond_2

    .line 40
    .line 41
    array-length v8, v3

    .line 42
    if-ge v6, v8, :cond_1

    .line 43
    .line 44
    neg-int v2, v2

    .line 45
    invoke-static {v3, v7, v3, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 46
    .line 47
    .line 48
    invoke-static {v3, v7, v2, v7}, Ljava/util/Arrays;->fill([IIII)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-array v8, v6, [I

    .line 53
    .line 54
    neg-int v2, v2

    .line 55
    invoke-static {v3, v7, v8, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    .line 57
    .line 58
    iput-object v8, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 59
    .line 60
    move-object v3, v8

    .line 61
    :goto_0
    iget v2, v0, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 62
    .line 63
    iput v2, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->offset:I

    .line 64
    .line 65
    move v2, v7

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    add-int v5, v6, v2

    .line 68
    .line 69
    array-length v8, v3

    .line 70
    if-lt v5, v8, :cond_3

    .line 71
    .line 72
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iput-object v3, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->data:[I

    .line 77
    .line 78
    :cond_3
    :goto_1
    const-wide/16 v8, 0x0

    .line 79
    .line 80
    move v5, v7

    .line 81
    :goto_2
    const/16 v10, 0x20

    .line 82
    .line 83
    const-wide v11, 0xffffffffL

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    if-ge v5, v2, :cond_4

    .line 89
    .line 90
    aget v13, v3, v5

    .line 91
    .line 92
    int-to-long v13, v13

    .line 93
    and-long/2addr v11, v13

    .line 94
    neg-long v11, v11

    .line 95
    add-long/2addr v11, v8

    .line 96
    long-to-int v8, v11

    .line 97
    aput v8, v3, v5

    .line 98
    .line 99
    shr-long v8, v11, v10

    .line 100
    .line 101
    add-int/lit8 v5, v5, 0x1

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    :goto_3
    if-ge v7, v6, :cond_5

    .line 105
    .line 106
    aget v2, v4, v7

    .line 107
    .line 108
    int-to-long v13, v2

    .line 109
    and-long/2addr v13, v11

    .line 110
    aget v2, v3, v5

    .line 111
    .line 112
    move/from16 p1, v10

    .line 113
    .line 114
    move-wide v15, v11

    .line 115
    int-to-long v10, v2

    .line 116
    and-long/2addr v10, v15

    .line 117
    sub-long/2addr v13, v10

    .line 118
    add-long/2addr v13, v8

    .line 119
    long-to-int v2, v13

    .line 120
    aput v2, v3, v5

    .line 121
    .line 122
    shr-long v8, v13, p1

    .line 123
    .line 124
    add-int/lit8 v5, v5, 0x1

    .line 125
    .line 126
    add-int/lit8 v7, v7, 0x1

    .line 127
    .line 128
    move/from16 v10, p1

    .line 129
    .line 130
    move-wide v11, v15

    .line 131
    goto :goto_3

    .line 132
    :cond_5
    iput v5, v1, Lcom/alibaba/fastjson2/util/FDBigInteger;->nWords:I

    .line 133
    .line 134
    invoke-direct {v1}, Lcom/alibaba/fastjson2/util/FDBigInteger;->trimLeadingZeros()V

    .line 135
    .line 136
    .line 137
    return-object v1
.end method
