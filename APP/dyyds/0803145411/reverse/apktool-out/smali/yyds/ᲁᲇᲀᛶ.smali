.class public final Lyyds/ᲁᲇᲀᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:I

.field public ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

.field public final ᛲᲈᲁ:Lyyds/ᛷᛲᲈᛲ;

.field public ᛵᛸᛸᛷ:I

.field public ᛶᛷᛲᲁ:I

.field public ᲀᛲᛳᲀ:Z

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Lyyds/ᛷᛲᲈᛲ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᲈᲁ:Lyyds/ᛷᛲᲈᛲ;

    .line 5
    .line 6
    const p1, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛵᛸᛸᛷ:I

    .line 10
    .line 11
    const/16 p1, 0x1000

    .line 12
    .line 13
    iput p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲈᛵᛷ:I

    .line 14
    .line 15
    const/16 p1, 0x8

    .line 16
    .line 17
    new-array p1, p1, [Lyyds/ᛸᛸᛸᛵ;

    .line 18
    .line 19
    iput-object p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 20
    .line 21
    const/4 p1, 0x7

    .line 22
    iput p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(III)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᲈᲁ:Lyyds/ᛷᛲᲈᛲ;

    .line 2
    .line 3
    if-ge p1, p2, :cond_0

    .line 4
    .line 5
    or-int/2addr p1, p3

    .line 6
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    or-int/2addr p3, p2

    .line 11
    invoke-virtual {p0, p3}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 12
    .line 13
    .line 14
    sub-int/2addr p1, p2

    .line 15
    :goto_0
    const/16 p2, 0x80

    .line 16
    .line 17
    if-lt p1, p2, :cond_1

    .line 18
    .line 19
    and-int/lit8 p3, p1, 0x7f

    .line 20
    .line 21
    or-int/2addr p2, p3

    .line 22
    invoke-virtual {p0, p2}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 23
    .line 24
    .line 25
    ushr-int/lit8 p1, p1, 0x7

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final ᛲᲈᲁ(I)V
    .locals 4

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    iget v2, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 10
    .line 11
    if-lt v0, v2, :cond_0

    .line 12
    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 16
    .line 17
    aget-object v2, v2, v0

    .line 18
    .line 19
    iget v2, v2, Lyyds/ᛸᛸᛸᛵ;->ᲀᛲᛳᲀ:I

    .line 20
    .line 21
    sub-int/2addr p1, v2

    .line 22
    iget v3, p0, Lyyds/ᲁᲇᲀᛶ;->ᛱᲈᲁ:I

    .line 23
    .line 24
    sub-int/2addr v3, v2

    .line 25
    iput v3, p0, Lyyds/ᲁᲇᲀᛶ;->ᛱᲈᲁ:I

    .line 26
    .line 27
    iget v2, p0, Lyyds/ᲁᲇᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 28
    .line 29
    add-int/lit8 v2, v2, -0x1

    .line 30
    .line 31
    iput v2, p0, Lyyds/ᲁᲇᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    add-int v0, v2, v1

    .line 43
    .line 44
    iget v3, p0, Lyyds/ᲁᲇᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 45
    .line 46
    invoke-static {p1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 50
    .line 51
    iget v0, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    add-int v2, v0, v1

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-static {p1, v0, v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 62
    .line 63
    add-int/2addr p1, v1

    .line 64
    iput p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 65
    .line 66
    :cond_1
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛸᛸᛸᛵ;)V
    .locals 6

    .line 1
    iget v0, p1, Lyyds/ᛸᛸᛸᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-le v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    array-length v1, p1

    .line 12
    invoke-static {p1, v2, v1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 16
    .line 17
    array-length p1, p1

    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    iput p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 21
    .line 22
    iput v2, p0, Lyyds/ᲁᲇᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 23
    .line 24
    iput v2, p0, Lyyds/ᲁᲇᲀᛶ;->ᛱᲈᲁ:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget v3, p0, Lyyds/ᲁᲇᲀᛶ;->ᛱᲈᲁ:I

    .line 28
    .line 29
    add-int/2addr v3, v0

    .line 30
    sub-int/2addr v3, v1

    .line 31
    invoke-virtual {p0, v3}, Lyyds/ᲁᲇᲀᛶ;->ᛲᲈᲁ(I)V

    .line 32
    .line 33
    .line 34
    iget v1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    iget-object v3, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 39
    .line 40
    array-length v4, v3

    .line 41
    if-le v1, v4, :cond_1

    .line 42
    .line 43
    array-length v1, v3

    .line 44
    mul-int/lit8 v1, v1, 0x2

    .line 45
    .line 46
    new-array v1, v1, [Lyyds/ᛸᛸᛸᛵ;

    .line 47
    .line 48
    array-length v4, v3

    .line 49
    array-length v5, v3

    .line 50
    invoke-static {v3, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 54
    .line 55
    array-length v2, v2

    .line 56
    add-int/lit8 v2, v2, -0x1

    .line 57
    .line 58
    iput v2, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 59
    .line 60
    iput-object v1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 61
    .line 62
    move-object v3, v1

    .line 63
    :cond_1
    iget v1, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 64
    .line 65
    add-int/lit8 v2, v1, -0x1

    .line 66
    .line 67
    iput v2, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 68
    .line 69
    aput-object p1, v3, v1

    .line 70
    .line 71
    iget p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    iput p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 76
    .line 77
    iget p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛱᲈᲁ:I

    .line 78
    .line 79
    add-int/2addr p1, v0

    .line 80
    iput p1, p0, Lyyds/ᲁᲇᲀᛶ;->ᛱᲈᲁ:I

    .line 81
    .line 82
    return-void
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᲇᲁᲀᲁ;)V
    .locals 11

    .line 1
    sget-object v0, Lyyds/ᛵᲇᲀᛸ;->ᛲᲈᲁ:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move-wide v5, v1

    .line 11
    move v4, v3

    .line 12
    :goto_0
    if-ge v4, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v4}, Lyyds/ᲇᲁᲀᲁ;->ᛲᛴᛳᛲ(I)B

    .line 15
    .line 16
    .line 17
    move-result v7

    .line 18
    sget-object v8, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 19
    .line 20
    and-int/lit16 v7, v7, 0xff

    .line 21
    .line 22
    sget-object v8, Lyyds/ᛵᲇᲀᛸ;->ᛵᛸᛸᛷ:[B

    .line 23
    .line 24
    aget-byte v7, v8, v7

    .line 25
    .line 26
    int-to-long v7, v7

    .line 27
    add-long/2addr v5, v7

    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-wide/16 v7, 0x7

    .line 32
    .line 33
    add-long/2addr v5, v7

    .line 34
    const/4 v0, 0x3

    .line 35
    shr-long v4, v5, v0

    .line 36
    .line 37
    long-to-int v0, v4

    .line 38
    invoke-virtual {p1}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    iget-object v5, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᲈᲁ:Lyyds/ᛷᛲᲈᛲ;

    .line 43
    .line 44
    const/16 v6, 0x7f

    .line 45
    .line 46
    if-ge v0, v4, :cond_4

    .line 47
    .line 48
    new-instance v0, Lyyds/ᛷᛲᲈᛲ;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v4, Lyyds/ᛵᲇᲀᛸ;->ᛲᲈᲁ:[I

    .line 54
    .line 55
    invoke-virtual {p1}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    move v7, v3

    .line 60
    :goto_1
    if-ge v3, v4, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1, v3}, Lyyds/ᲇᲁᲀᲁ;->ᛲᛴᛳᛲ(I)B

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    sget-object v9, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 67
    .line 68
    and-int/lit16 v8, v8, 0xff

    .line 69
    .line 70
    sget-object v9, Lyyds/ᛵᲇᲀᛸ;->ᛲᲈᲁ:[I

    .line 71
    .line 72
    aget v9, v9, v8

    .line 73
    .line 74
    sget-object v10, Lyyds/ᛵᲇᲀᛸ;->ᛵᛸᛸᛷ:[B

    .line 75
    .line 76
    aget-byte v8, v10, v8

    .line 77
    .line 78
    shl-long/2addr v1, v8

    .line 79
    int-to-long v9, v9

    .line 80
    or-long/2addr v1, v9

    .line 81
    add-int/2addr v7, v8

    .line 82
    :goto_2
    const/16 v8, 0x8

    .line 83
    .line 84
    if-lt v7, v8, :cond_1

    .line 85
    .line 86
    add-int/lit8 v7, v7, -0x8

    .line 87
    .line 88
    shr-long v8, v1, v7

    .line 89
    .line 90
    long-to-int v8, v8

    .line 91
    invoke-virtual {v0, v8}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    if-lez v7, :cond_3

    .line 99
    .line 100
    rsub-int/lit8 p1, v7, 0x8

    .line 101
    .line 102
    shl-long/2addr v1, p1

    .line 103
    const-wide/16 v3, 0xff

    .line 104
    .line 105
    ushr-long/2addr v3, v7

    .line 106
    or-long/2addr v1, v3

    .line 107
    long-to-int p1, v1

    .line 108
    invoke-virtual {v0, p1}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 109
    .line 110
    .line 111
    :cond_3
    iget-wide v1, v0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 112
    .line 113
    invoke-virtual {v0, v1, v2}, Lyyds/ᛷᛲᲈᛲ;->ᲇᛱᛲ(J)Lyyds/ᲇᲁᲀᲁ;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    const/16 v1, 0x80

    .line 122
    .line 123
    invoke-virtual {p0, v0, v6, v1}, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ(III)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, p1}, Lyyds/ᛷᛲᲈᛲ;->ᛱᛸᲁᲇ(Lyyds/ᲇᲁᲀᲁ;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_4
    invoke-virtual {p1}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-virtual {p0, v0, v6, v3}, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ(III)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, p1}, Lyyds/ᛷᛲᲈᛲ;->ᛱᛸᲁᲇ(Lyyds/ᲇᲁᲀᲁ;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Ljava/util/ArrayList;)V
    .locals 13

    .line 1
    iget-boolean v0, p0, Lyyds/ᲁᲇᲀᛶ;->ᲀᛲᛳᲀ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lyyds/ᲁᲇᲀᛶ;->ᛵᛸᛸᛷ:I

    .line 7
    .line 8
    iget v2, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲈᛵᛷ:I

    .line 9
    .line 10
    const/16 v3, 0x20

    .line 11
    .line 12
    const/16 v4, 0x1f

    .line 13
    .line 14
    if-ge v0, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0, v4, v3}, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ(III)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iput-boolean v1, p0, Lyyds/ᲁᲇᲀᛶ;->ᲀᛲᛳᲀ:Z

    .line 20
    .line 21
    const v0, 0x7fffffff

    .line 22
    .line 23
    .line 24
    iput v0, p0, Lyyds/ᲁᲇᲀᛶ;->ᛵᛸᛸᛷ:I

    .line 25
    .line 26
    iget v0, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲈᛵᛷ:I

    .line 27
    .line 28
    invoke-virtual {p0, v0, v4, v3}, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ(III)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    move v2, v1

    .line 36
    :goto_0
    if-ge v2, v0, :cond_b

    .line 37
    .line 38
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lyyds/ᛸᛸᛸᛵ;

    .line 43
    .line 44
    iget-object v4, v3, Lyyds/ᛸᛸᛸᛵ;->ᛲᲈᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 45
    .line 46
    invoke-virtual {v4}, Lyyds/ᲇᲁᲀᲁ;->ᛷᲈᲈᲁ()Lyyds/ᲇᲁᲀᲁ;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object v5, v3, Lyyds/ᛸᛸᛸᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲀᲁ;

    .line 51
    .line 52
    sget-object v6, Lyyds/ᛵᲀᲁᛷ;->ᛵᛸᛸᛷ:Ljava/util/Map;

    .line 53
    .line 54
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Ljava/lang/Integer;

    .line 59
    .line 60
    const/4 v7, -0x1

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    add-int/lit8 v8, v6, 0x1

    .line 68
    .line 69
    const/4 v9, 0x2

    .line 70
    if-gt v9, v8, :cond_3

    .line 71
    .line 72
    const/16 v9, 0x8

    .line 73
    .line 74
    if-ge v8, v9, :cond_3

    .line 75
    .line 76
    sget-object v9, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ:[Lyyds/ᛸᛸᛸᛵ;

    .line 77
    .line 78
    aget-object v10, v9, v6

    .line 79
    .line 80
    iget-object v10, v10, Lyyds/ᛸᛸᛸᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲀᲁ;

    .line 81
    .line 82
    invoke-static {v10, v5}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_2

    .line 87
    .line 88
    move v6, v8

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    aget-object v9, v9, v8

    .line 91
    .line 92
    iget-object v9, v9, Lyyds/ᛸᛸᛸᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲀᲁ;

    .line 93
    .line 94
    invoke-static {v9, v5}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_3

    .line 99
    .line 100
    add-int/lit8 v6, v6, 0x2

    .line 101
    .line 102
    move v12, v8

    .line 103
    move v8, v6

    .line 104
    move v6, v12

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move v6, v8

    .line 107
    move v8, v7

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    move v6, v7

    .line 110
    move v8, v6

    .line 111
    :goto_1
    if-ne v8, v7, :cond_7

    .line 112
    .line 113
    iget v9, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 114
    .line 115
    add-int/lit8 v9, v9, 0x1

    .line 116
    .line 117
    iget-object v10, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 118
    .line 119
    array-length v10, v10

    .line 120
    :goto_2
    if-ge v9, v10, :cond_7

    .line 121
    .line 122
    iget-object v11, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 123
    .line 124
    aget-object v11, v11, v9

    .line 125
    .line 126
    iget-object v11, v11, Lyyds/ᛸᛸᛸᛵ;->ᛲᲈᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 127
    .line 128
    invoke-static {v11, v4}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    if-eqz v11, :cond_6

    .line 133
    .line 134
    iget-object v11, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 135
    .line 136
    aget-object v11, v11, v9

    .line 137
    .line 138
    iget-object v11, v11, Lyyds/ᛸᛸᛸᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲀᲁ;

    .line 139
    .line 140
    invoke-static {v11, v5}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    if-eqz v11, :cond_5

    .line 145
    .line 146
    iget v8, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 147
    .line 148
    sub-int/2addr v9, v8

    .line 149
    sget-object v8, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ:[Lyyds/ᛸᛸᛸᛵ;

    .line 150
    .line 151
    array-length v8, v8

    .line 152
    add-int/2addr v8, v9

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    if-ne v6, v7, :cond_6

    .line 155
    .line 156
    iget v6, p0, Lyyds/ᲁᲇᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 157
    .line 158
    sub-int v6, v9, v6

    .line 159
    .line 160
    sget-object v11, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ:[Lyyds/ᛸᛸᛸᛵ;

    .line 161
    .line 162
    array-length v11, v11

    .line 163
    add-int/2addr v6, v11

    .line 164
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_7
    :goto_3
    if-eq v8, v7, :cond_8

    .line 168
    .line 169
    const/16 v3, 0x7f

    .line 170
    .line 171
    const/16 v4, 0x80

    .line 172
    .line 173
    invoke-virtual {p0, v8, v3, v4}, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ(III)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_8
    const/16 v8, 0x40

    .line 178
    .line 179
    if-ne v6, v7, :cond_9

    .line 180
    .line 181
    iget-object v6, p0, Lyyds/ᲁᲇᲀᛶ;->ᛲᲈᲁ:Lyyds/ᛷᛲᲈᛲ;

    .line 182
    .line 183
    invoke-virtual {v6, v8}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, v4}, Lyyds/ᲁᲇᲀᛶ;->ᲀᛲᛳᲀ(Lyyds/ᲇᲁᲀᲁ;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, v5}, Lyyds/ᲁᲇᲀᛶ;->ᲀᛲᛳᲀ(Lyyds/ᲇᲁᲀᲁ;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v3}, Lyyds/ᲁᲇᲀᛶ;->ᛵᛸᛸᛷ(Lyyds/ᛸᛸᛸᛵ;)V

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_9
    sget-object v7, Lyyds/ᛸᛸᛸᛵ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲁᲀᲁ;

    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    invoke-virtual {v4, v7, v9}, Lyyds/ᲇᲁᲀᲁ;->ᛶᛷᛲᲁ(Lyyds/ᲇᲁᲀᲁ;I)Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_a

    .line 210
    .line 211
    sget-object v7, Lyyds/ᛸᛸᛸᛵ;->ᛲᛳᛶᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 212
    .line 213
    invoke-static {v7, v4}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-nez v4, :cond_a

    .line 218
    .line 219
    const/16 v3, 0xf

    .line 220
    .line 221
    invoke-virtual {p0, v6, v3, v1}, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ(III)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, v5}, Lyyds/ᲁᲇᲀᛶ;->ᲀᛲᛳᲀ(Lyyds/ᲇᲁᲀᲁ;)V

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_a
    const/16 v4, 0x3f

    .line 229
    .line 230
    invoke-virtual {p0, v6, v4, v8}, Lyyds/ᲁᲇᲀᛶ;->ᛲᛴᛳᛲ(III)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v5}, Lyyds/ᲁᲇᲀᛶ;->ᲀᛲᛳᲀ(Lyyds/ᲇᲁᲀᲁ;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v3}, Lyyds/ᲁᲇᲀᛶ;->ᛵᛸᛸᛷ(Lyyds/ᛸᛸᛸᛵ;)V

    .line 237
    .line 238
    .line 239
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_b
    return-void
.end method
