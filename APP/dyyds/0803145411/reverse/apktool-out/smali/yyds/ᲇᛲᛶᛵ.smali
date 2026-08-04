.class public final Lyyds/ᲇᛲᛶᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:I

.field public ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

.field public ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Ljava/util/ArrayList;

.field public ᛶᛷᛲᲁ:I

.field public ᲀᛲᛳᲀ:J

.field public ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:Lyyds/ᲀᲀᛵᲈ;


# direct methods
.method public constructor <init>(Lyyds/ᲁᲀᛴᲇ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1000

    .line 5
    .line 6
    iput v0, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᲈᲁ:I

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lyyds/ᲇᛲᛶᛵ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 14
    .line 15
    new-instance v0, Lyyds/ᲀᲀᛵᲈ;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lyyds/ᲀᲀᛵᲈ;-><init>(Lyyds/ᛷᛷᛳᛷ;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲀᛵᲈ;

    .line 21
    .line 22
    const/16 p1, 0x8

    .line 23
    .line 24
    new-array p1, p1, [Lyyds/ᛸᛸᛸᛵ;

    .line 25
    .line 26
    iput-object p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 27
    .line 28
    const/4 p1, 0x7

    .line 29
    iput p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ()Lyyds/ᲇᲁᲀᲁ;
    .locals 11

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲀᛵᲈ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sget-object v2, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 8
    .line 9
    and-int/lit16 v2, v1, 0xff

    .line 10
    .line 11
    const/16 v3, 0x80

    .line 12
    .line 13
    and-int/2addr v1, v3

    .line 14
    const/4 v4, 0x0

    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v4

    .line 20
    :goto_0
    const/16 v3, 0x7f

    .line 21
    .line 22
    invoke-virtual {p0, v2, v3}, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ(II)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    int-to-long v2, v2

    .line 27
    iget-wide v5, p0, Lyyds/ᲇᛲᛶᛵ;->ᲀᛲᛳᲀ:J

    .line 28
    .line 29
    add-long/2addr v5, v2

    .line 30
    const-wide/32 v7, 0x40000

    .line 31
    .line 32
    .line 33
    cmp-long p0, v5, v7

    .line 34
    .line 35
    if-gtz p0, :cond_7

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    new-instance p0, Lyyds/ᛷᛲᲈᛲ;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lyyds/ᛵᲇᲀᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛷᛴᛵ;

    .line 45
    .line 46
    const-wide/16 v5, 0x0

    .line 47
    .line 48
    move-object v8, v1

    .line 49
    move-wide v6, v5

    .line 50
    move v5, v4

    .line 51
    :goto_1
    cmp-long v9, v6, v2

    .line 52
    .line 53
    if-gez v9, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    sget-object v10, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 60
    .line 61
    and-int/lit16 v9, v9, 0xff

    .line 62
    .line 63
    shl-int/lit8 v4, v4, 0x8

    .line 64
    .line 65
    or-int/2addr v4, v9

    .line 66
    add-int/lit8 v5, v5, 0x8

    .line 67
    .line 68
    :goto_2
    const/16 v9, 0x8

    .line 69
    .line 70
    if-lt v5, v9, :cond_2

    .line 71
    .line 72
    add-int/lit8 v9, v5, -0x8

    .line 73
    .line 74
    ushr-int v9, v4, v9

    .line 75
    .line 76
    and-int/lit16 v9, v9, 0xff

    .line 77
    .line 78
    iget-object v8, v8, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v8, [Lyyds/ᛲᛷᛴᛵ;

    .line 81
    .line 82
    aget-object v8, v8, v9

    .line 83
    .line 84
    iget-object v9, v8, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v9, [Lyyds/ᛲᛷᛴᛵ;

    .line 87
    .line 88
    if-nez v9, :cond_1

    .line 89
    .line 90
    iget v9, v8, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 91
    .line 92
    invoke-virtual {p0, v9}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 93
    .line 94
    .line 95
    iget v8, v8, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 96
    .line 97
    sub-int/2addr v5, v8

    .line 98
    move-object v8, v1

    .line 99
    goto :goto_2

    .line 100
    :cond_1
    add-int/lit8 v5, v5, -0x8

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    const-wide/16 v9, 0x1

    .line 104
    .line 105
    add-long/2addr v6, v9

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    :goto_3
    if-lez v5, :cond_5

    .line 108
    .line 109
    rsub-int/lit8 v0, v5, 0x8

    .line 110
    .line 111
    shl-int v0, v4, v0

    .line 112
    .line 113
    and-int/lit16 v0, v0, 0xff

    .line 114
    .line 115
    iget-object v2, v8, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, [Lyyds/ᛲᛷᛴᛵ;

    .line 118
    .line 119
    aget-object v0, v2, v0

    .line 120
    .line 121
    iget-object v2, v0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, [Lyyds/ᛲᛷᛴᛵ;

    .line 124
    .line 125
    iget v3, v0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 126
    .line 127
    if-nez v2, :cond_5

    .line 128
    .line 129
    if-le v3, v5, :cond_4

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_4
    iget v0, v0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 133
    .line 134
    invoke-virtual {p0, v0}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 135
    .line 136
    .line 137
    sub-int/2addr v5, v3

    .line 138
    move-object v8, v1

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    :goto_4
    iget-wide v0, p0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 141
    .line 142
    invoke-virtual {p0, v0, v1}, Lyyds/ᛷᛲᲈᛲ;->ᲇᛱᛲ(J)Lyyds/ᲇᲁᲀᲁ;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0

    .line 147
    :cond_6
    invoke-virtual {v0, v2, v3}, Lyyds/ᲀᲀᛵᲈ;->ᛷᲈᲈᲁ(J)Lyyds/ᲇᲁᲀᲁ;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :cond_7
    const-string p0, "header byte count limit of 262144 exceeded"

    .line 153
    .line 154
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const/4 p0, 0x0

    .line 158
    return-object p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛸᛸᛸᛵ;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛲᛶᛵ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lyyds/ᛸᛸᛸᛵ;->ᛲᲈᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 7
    .line 8
    invoke-virtual {v0}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object p1, p1, Lyyds/ᛸᛸᛸᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲀᲁ;

    .line 13
    .line 14
    invoke-virtual {p1}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    add-int/2addr p1, v0

    .line 19
    iget-wide v0, p0, Lyyds/ᲇᛲᛶᛵ;->ᲀᛲᛳᲀ:J

    .line 20
    .line 21
    int-to-long v2, p1

    .line 22
    add-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, Lyyds/ᲇᛲᛶᛵ;->ᲀᛲᛳᲀ:J

    .line 24
    .line 25
    const-wide/32 p0, 0x40000

    .line 26
    .line 27
    .line 28
    cmp-long p0, v0, p0

    .line 29
    .line 30
    if-gtz p0, :cond_0

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const-string p0, "header byte count limit of 262144 exceeded"

    .line 34
    .line 35
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final ᛵᛸᛸᛷ(I)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 5
    .line 6
    array-length v1, v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    iget v2, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

    .line 10
    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 16
    .line 17
    aget-object v2, v2, v1

    .line 18
    .line 19
    iget v2, v2, Lyyds/ᛸᛸᛸᛵ;->ᲀᛲᛳᲀ:I

    .line 20
    .line 21
    sub-int/2addr p1, v2

    .line 22
    iget v3, p0, Lyyds/ᲇᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 23
    .line 24
    sub-int/2addr v3, v2

    .line 25
    iput v3, p0, Lyyds/ᲇᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 26
    .line 27
    iget v2, p0, Lyyds/ᲇᛲᛶᛵ;->ᛶᛷᛲᲁ:I

    .line 28
    .line 29
    add-int/lit8 v2, v2, -0x1

    .line 30
    .line 31
    iput v2, p0, Lyyds/ᲇᛲᛶᛵ;->ᛶᛷᛲᲁ:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    add-int v1, v2, v0

    .line 43
    .line 44
    iget v3, p0, Lyyds/ᲇᛲᛶᛵ;->ᛶᛷᛲᲁ:I

    .line 45
    .line 46
    invoke-static {p1, v2, p1, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    iget p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

    .line 50
    .line 51
    add-int/2addr p1, v0

    .line 52
    iput p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

    .line 53
    .line 54
    :cond_1
    return v0
.end method

.method public final ᲀᛲᛳᲀ(I)Lyyds/ᲇᲁᲀᲁ;
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ:[Lyyds/ᛸᛸᛸᛵ;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    add-int/lit8 v1, v1, -0x1

    .line 7
    .line 8
    if-gt p1, v1, :cond_0

    .line 9
    .line 10
    aget-object p0, v0, p1

    .line 11
    .line 12
    iget-object p0, p0, Lyyds/ᛸᛸᛸᛵ;->ᛲᲈᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object v0, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ:[Lyyds/ᛸᛸᛸᛵ;

    .line 16
    .line 17
    array-length v0, v0

    .line 18
    sub-int v0, p1, v0

    .line 19
    .line 20
    iget v1, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    add-int/2addr v1, v0

    .line 25
    if-ltz v1, :cond_1

    .line 26
    .line 27
    iget-object p0, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 28
    .line 29
    array-length v0, p0

    .line 30
    if-ge v1, v0, :cond_1

    .line 31
    .line 32
    aget-object p0, p0, v1

    .line 33
    .line 34
    iget-object p0, p0, Lyyds/ᛸᛸᛸᛵ;->ᛲᲈᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    new-instance p0, Ljava/io/IOException;

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, "Header index too large "

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0
.end method

.method public final ᲇᲇᲇᛱ(II)I
    .locals 9

    .line 1
    and-int/2addr p1, p2

    .line 2
    if-ge p1, p2, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    int-to-long p1, p2

    .line 6
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    const/4 v3, 0x5

    .line 10
    const-string v4, "HPACK integer overflow"

    .line 11
    .line 12
    if-eq v1, v3, :cond_3

    .line 13
    .line 14
    iget-object v3, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲀᛵᲈ;

    .line 15
    .line 16
    invoke-virtual {v3}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    sget-object v5, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    and-int/lit8 v5, v3, 0x7f

    .line 25
    .line 26
    int-to-long v5, v5

    .line 27
    shl-long/2addr v5, v2

    .line 28
    const-wide/32 v7, 0x7fffffff

    .line 29
    .line 30
    .line 31
    sub-long/2addr v7, p1

    .line 32
    cmp-long v7, v5, v7

    .line 33
    .line 34
    if-gtz v7, :cond_2

    .line 35
    .line 36
    add-long/2addr p1, v5

    .line 37
    and-int/lit16 v3, v3, 0x80

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x7

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    long-to-int p0, p1

    .line 45
    return p0

    .line 46
    :cond_2
    invoke-static {v4}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return v0

    .line 50
    :cond_3
    invoke-static {v4}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return v0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛸᛸᛸᛵ;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᲇᛲᛶᛵ;->ᛲᲈᲁ(Lyyds/ᛸᛸᛸᛵ;)V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lyyds/ᛸᛸᛸᛵ;->ᲀᛲᛳᲀ:I

    .line 5
    .line 6
    iget v1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᲈᲁ:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-le v0, v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    array-length v1, p1

    .line 15
    invoke-static {p1, v2, v1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 19
    .line 20
    array-length p1, p1

    .line 21
    add-int/lit8 p1, p1, -0x1

    .line 22
    .line 23
    iput p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

    .line 24
    .line 25
    iput v2, p0, Lyyds/ᲇᛲᛶᛵ;->ᛶᛷᛲᲁ:I

    .line 26
    .line 27
    iput v2, p0, Lyyds/ᲇᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget v3, p0, Lyyds/ᲇᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 31
    .line 32
    add-int/2addr v3, v0

    .line 33
    sub-int/2addr v3, v1

    .line 34
    invoke-virtual {p0, v3}, Lyyds/ᲇᛲᛶᛵ;->ᛵᛸᛸᛷ(I)I

    .line 35
    .line 36
    .line 37
    iget v1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛶᛷᛲᲁ:I

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    iget-object v3, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 42
    .line 43
    array-length v4, v3

    .line 44
    if-le v1, v4, :cond_1

    .line 45
    .line 46
    array-length v1, v3

    .line 47
    mul-int/lit8 v1, v1, 0x2

    .line 48
    .line 49
    new-array v1, v1, [Lyyds/ᛸᛸᛸᛵ;

    .line 50
    .line 51
    array-length v4, v3

    .line 52
    array-length v5, v3

    .line 53
    invoke-static {v3, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 57
    .line 58
    array-length v2, v2

    .line 59
    add-int/lit8 v2, v2, -0x1

    .line 60
    .line 61
    iput v2, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

    .line 62
    .line 63
    iput-object v1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 64
    .line 65
    move-object v3, v1

    .line 66
    :cond_1
    iget v1, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

    .line 67
    .line 68
    add-int/lit8 v2, v1, -0x1

    .line 69
    .line 70
    iput v2, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

    .line 71
    .line 72
    aput-object p1, v3, v1

    .line 73
    .line 74
    iget p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛶᛷᛲᲁ:I

    .line 75
    .line 76
    add-int/lit8 p1, p1, 0x1

    .line 77
    .line 78
    iput p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛶᛷᛲᲁ:I

    .line 79
    .line 80
    iget p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 81
    .line 82
    add-int/2addr p1, v0

    .line 83
    iput p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 84
    .line 85
    return-void
.end method
