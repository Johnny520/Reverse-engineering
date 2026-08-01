.class public final Lxhss/ᛱᲁᛴᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:I

.field public ᛷᛴᛷᛱ:I

.field public ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

.field public final ᛷᲁᲁ:Lxhss/ᛶᛵᲇᛸ;

.field public ᛸᛲᲀᛵ:[I

.field public ᛸᛴᛶᛳ:I

.field public ᛸᛷᲈᲈ:I

.field public ᲀᲇᛳᲁ:Z

.field public ᲇᛴᲇᛵ:[I

.field public ᲇᛶᛴᲀ:Z

.field public ᲈᛳᲀ:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lxhss/ᛶᛵᲇᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lxhss/ᛶᛵᲇᛸ;

    .line 6
    .line 7
    const/16 v1, 0x19

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lxhss/ᛶᛵᲇᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛵᲇᛸ;

    .line 13
    .line 14
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛳᲁᲇᛸ:I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-object v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ:I

    .line 25
    .line 26
    iput-boolean v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ:Z

    .line 27
    .line 28
    iput-boolean v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᲀᲇᛳᲁ:Z

    .line 29
    .line 30
    const/16 v2, 0x10

    .line 31
    .line 32
    new-array v2, v2, [I

    .line 33
    .line 34
    iput-object v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛲᲀᛵ:[I

    .line 35
    .line 36
    iput v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ:I

    .line 37
    .line 38
    iput v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ:I

    .line 39
    .line 40
    const/16 v1, 0x400

    .line 41
    .line 42
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput-object v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    iput-object v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ:Lxhss/ᛶᛵᲇᛸ;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(IB)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ(B)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    aput p0, p2, p1

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final ᛳᲁᲇᛸ(J)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    invoke-virtual {p0, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iget v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 10
    .line 11
    sub-int/2addr v2, v1

    .line 12
    iput v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 13
    .line 14
    invoke-virtual {v0, v2, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final ᛷᛴᛷᛱ(II)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ(I)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    aput p0, p2, p1

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final ᛷᛵᛵᲈ(B)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iget v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 9
    .line 10
    sub-int/2addr v2, v1

    .line 11
    iput v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 12
    .line 13
    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final ᛷᲁᲁ(II)V
    .locals 7

    .line 1
    iget v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    if-le p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛳᲁᲇᛸ:I

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    add-int/2addr v0, p2

    .line 17
    not-int v0, v0

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    add-int/lit8 v1, p1, -0x1

    .line 21
    .line 22
    and-int/2addr v0, v1

    .line 23
    :goto_0
    iget v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 24
    .line 25
    add-int v2, v0, p1

    .line 26
    .line 27
    add-int/2addr v2, p2

    .line 28
    const/4 v3, 0x0

    .line 29
    if-ge v1, v2, :cond_4

    .line 30
    .line 31
    iget-object v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    const/16 v5, 0x400

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const v5, 0x7ffffff7

    .line 49
    .line 50
    .line 51
    if-eq v4, v5, :cond_3

    .line 52
    .line 53
    const/high16 v6, -0x40000000    # -2.0f

    .line 54
    .line 55
    and-int/2addr v6, v4

    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    shl-int/lit8 v5, v4, 0x1

    .line 60
    .line 61
    :goto_1
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 62
    .line 63
    .line 64
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 69
    .line 70
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    sub-int/2addr v5, v4

    .line 83
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    iput-object v3, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    iget v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    sub-int/2addr v3, v1

    .line 98
    add-int/2addr v3, v2

    .line 99
    iput v3, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    new-instance p0, Ljava/lang/AssertionError;

    .line 103
    .line 104
    const-string p1, "FlatBuffers: cannot grow buffer beyond 2 gigabytes."

    .line 105
    .line 106
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    throw p0

    .line 110
    :cond_4
    move p1, v3

    .line 111
    :goto_2
    if-ge p1, v0, :cond_5

    .line 112
    .line 113
    iget-object p2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    iget v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 116
    .line 117
    add-int/lit8 v1, v1, -0x1

    .line 118
    .line 119
    iput v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 120
    .line 121
    invoke-virtual {p2, v1, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 122
    .line 123
    .line 124
    add-int/lit8 p1, p1, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    return-void
.end method

.method public final ᛸᛲᲀᛵ()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ:Z

    .line 7
    .line 8
    iget v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ:I

    .line 9
    .line 10
    iget-object v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    iget v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 13
    .line 14
    add-int/lit8 v2, v2, -0x4

    .line 15
    .line 16
    iput v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 17
    .line 18
    invoke-virtual {v1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 27
    .line 28
    const-string v0, "FlatBuffers: endVector called without startVector"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method public final ᛸᛴᛶᛳ()I
    .locals 11

    .line 1
    iget-object v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-boolean v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    iget v3, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 17
    .line 18
    sub-int/2addr v3, v0

    .line 19
    iput v3, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 20
    .line 21
    invoke-virtual {v2, v3, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ:I

    .line 29
    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    :goto_0
    if-ltz v2, :cond_0

    .line 33
    .line 34
    iget-object v3, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 35
    .line 36
    aget v3, v3, v2

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    add-int/lit8 v2, v2, -0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v3, v2

    .line 44
    :goto_1
    if-ltz v3, :cond_2

    .line 45
    .line 46
    iget-object v4, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 47
    .line 48
    aget v4, v4, v3

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    sub-int v4, v0, v4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    move v4, v1

    .line 56
    :goto_2
    int-to-short v4, v4

    .line 57
    invoke-virtual {p0, v4}, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ(S)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v3, v3, -0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iget v3, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ:I

    .line 64
    .line 65
    sub-int v3, v0, v3

    .line 66
    .line 67
    int-to-short v3, v3

    .line 68
    invoke-virtual {p0, v3}, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ(S)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x3

    .line 72
    .line 73
    const/4 v3, 0x2

    .line 74
    mul-int/2addr v2, v3

    .line 75
    int-to-short v2, v2

    .line 76
    invoke-virtual {p0, v2}, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ(S)V

    .line 77
    .line 78
    .line 79
    move v2, v1

    .line 80
    :goto_3
    iget v4, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ:I

    .line 81
    .line 82
    if-ge v2, v4, :cond_6

    .line 83
    .line 84
    iget-object v4, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    iget-object v5, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛲᲀᛵ:[I

    .line 91
    .line 92
    aget v5, v5, v2

    .line 93
    .line 94
    sub-int/2addr v4, v5

    .line 95
    iget v5, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 96
    .line 97
    iget-object v6, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 98
    .line 99
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    iget-object v7, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-ne v6, v7, :cond_5

    .line 110
    .line 111
    move v7, v3

    .line 112
    :goto_4
    if-ge v7, v6, :cond_4

    .line 113
    .line 114
    iget-object v8, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 115
    .line 116
    add-int v9, v4, v7

    .line 117
    .line 118
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    iget-object v9, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    add-int v10, v5, v7

    .line 125
    .line 126
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eq v8, v9, :cond_3

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_3
    add-int/lit8 v7, v7, 0x2

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_4
    iget-object v4, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛲᲀᛵ:[I

    .line 137
    .line 138
    aget v2, v4, v2

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_5
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    move v2, v1

    .line 145
    :goto_6
    if-eqz v2, :cond_7

    .line 146
    .line 147
    iget-object v3, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    sub-int/2addr v3, v0

    .line 154
    iput v3, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 155
    .line 156
    iget-object v4, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 157
    .line 158
    sub-int/2addr v2, v0

    .line 159
    invoke-virtual {v4, v3, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 160
    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_7
    iget v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ:I

    .line 164
    .line 165
    iget-object v4, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛲᲀᛵ:[I

    .line 166
    .line 167
    array-length v5, v4

    .line 168
    if-ne v2, v5, :cond_8

    .line 169
    .line 170
    mul-int/2addr v2, v3

    .line 171
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    iput-object v4, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛲᲀᛵ:[I

    .line 176
    .line 177
    :cond_8
    iget v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ:I

    .line 178
    .line 179
    add-int/lit8 v3, v2, 0x1

    .line 180
    .line 181
    iput v3, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ:I

    .line 182
    .line 183
    invoke-virtual {p0}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    aput v3, v4, v2

    .line 188
    .line 189
    iget-object v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    sub-int/2addr v3, v0

    .line 196
    invoke-virtual {p0}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    sub-int/2addr v4, v0

    .line 201
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 202
    .line 203
    .line 204
    :goto_7
    iput-boolean v1, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ:Z

    .line 205
    .line 206
    return v0

    .line 207
    :cond_9
    new-instance p0, Ljava/lang/AssertionError;

    .line 208
    .line 209
    const-string v0, "FlatBuffers: endTable called without startTable"

    .line 210
    .line 211
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    throw p0
.end method

.method public final ᛸᛶᲈᛶ(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-ge v1, p1, :cond_1

    .line 11
    .line 12
    :cond_0
    new-array v0, p1, [I

    .line 13
    .line 14
    iput-object v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 15
    .line 16
    :cond_1
    iput p1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ:I

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v0, v1, p1, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ:Z

    .line 24
    .line 25
    invoke-virtual {p0}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    .line 33
    .line 34
    const-string p1, "FlatBuffers: object serialization must not be nested."

    .line 35
    .line 36
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    throw p0
.end method

.method public final ᛸᛷᲈᲈ(I)V
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {p0, v0, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ(I)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    iget v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lxhss/ᛱᲁᛴᲈ;->ᲀᲇᛳᲁ:Z

    .line 19
    .line 20
    return-void
.end method

.method public final ᲀᲇᛳᲁ([I)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    array-length v1, p1

    .line 7
    invoke-virtual {p0, v0, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᲇᛸᛳᲁ(III)V

    .line 8
    .line 9
    .line 10
    array-length v0, p1

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v0, :cond_0

    .line 14
    .line 15
    aget v1, p1, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ(I)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛲᲀᛵ()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    .line 29
    .line 30
    const-string p1, "FlatBuffers: object serialization must not be nested."

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public final ᲇᛴᲇᛵ(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    invoke-virtual {p0, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sub-int/2addr v0, p1

    .line 11
    add-int/2addr v0, v1

    .line 12
    iget-object p1, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    iget v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 15
    .line 16
    sub-int/2addr v2, v1

    .line 17
    iput v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 18
    .line 19
    invoke-virtual {p1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final ᲇᛶᛴᲀ(S)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-virtual {p0, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iget v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 9
    .line 10
    sub-int/2addr v2, v1

    .line 11
    iput v2, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 12
    .line 13
    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final ᲇᛸᛳᲁ(III)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput p2, p0, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ:I

    .line 6
    .line 7
    mul-int/2addr p1, p2

    .line 8
    const/4 p2, 0x4

    .line 9
    invoke-virtual {p0, p2, p1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p3, p1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lxhss/ᛱᲁᛴᲈ;->ᲇᛶᛴᲀ:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 20
    .line 21
    const-string p1, "FlatBuffers: object serialization must not be nested."

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public final ᲈᛳᲀ()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 8
    .line 9
    sub-int/2addr v0, p0

    .line 10
    return v0
.end method
