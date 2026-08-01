.class public final Lkotlinx/io/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/io/飘花落叶言子楪苏兰世哲;
.implements Lkotlinx/io/飘花落叶言子楪苏哲兰世;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪哲兰苏世:J

.field public 飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public final peek()Lkotlinx/io/飘花落叶言子楪世兰哲苏;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/io/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lkotlinx/io/飘花落叶言子楪世哲苏兰;-><init>(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lkotlinx/io/飘花落叶言子楪世兰哲苏;-><init>(Lkotlinx/io/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final readByte()B
    .locals 7

    .line 1
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readByte()B

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    iget-object v4, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 22
    .line 23
    iget v5, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 24
    .line 25
    add-int/lit8 v6, v5, 0x1

    .line 26
    .line 27
    iput v6, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 28
    .line 29
    aget-byte v0, v4, v5

    .line 30
    .line 31
    iget-wide v4, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 32
    .line 33
    sub-long/2addr v4, v1

    .line 34
    iput-wide v4, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    if-ne v3, v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 40
    .line 41
    .line 42
    :cond_1
    return v0

    .line 43
    :cond_2
    invoke-virtual {p0, v1, v2}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(J)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    throw p0
.end method

.method public final readInt()I
    .locals 10

    .line 1
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    const-wide/16 v1, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x4

    .line 12
    if-ge v3, v4, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v1, v2}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(J)V

    .line 15
    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readInt()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_0
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readShort()S

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    shl-int/lit8 v0, v0, 0x10

    .line 32
    .line 33
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readShort()S

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    const v1, 0xffff

    .line 38
    .line 39
    .line 40
    and-int/2addr p0, v1

    .line 41
    or-int/2addr p0, v0

    .line 42
    return p0

    .line 43
    :cond_1
    iget-object v5, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 44
    .line 45
    iget v6, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 46
    .line 47
    add-int/lit8 v7, v6, 0x1

    .line 48
    .line 49
    aget-byte v8, v5, v6

    .line 50
    .line 51
    and-int/lit16 v8, v8, 0xff

    .line 52
    .line 53
    shl-int/lit8 v8, v8, 0x18

    .line 54
    .line 55
    add-int/lit8 v9, v6, 0x2

    .line 56
    .line 57
    aget-byte v7, v5, v7

    .line 58
    .line 59
    and-int/lit16 v7, v7, 0xff

    .line 60
    .line 61
    shl-int/lit8 v7, v7, 0x10

    .line 62
    .line 63
    or-int/2addr v7, v8

    .line 64
    add-int/lit8 v8, v6, 0x3

    .line 65
    .line 66
    aget-byte v9, v5, v9

    .line 67
    .line 68
    and-int/lit16 v9, v9, 0xff

    .line 69
    .line 70
    shl-int/lit8 v9, v9, 0x8

    .line 71
    .line 72
    or-int/2addr v7, v9

    .line 73
    add-int/2addr v6, v4

    .line 74
    aget-byte v5, v5, v8

    .line 75
    .line 76
    and-int/lit16 v5, v5, 0xff

    .line 77
    .line 78
    or-int/2addr v5, v7

    .line 79
    iput v6, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 80
    .line 81
    iget-wide v6, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 82
    .line 83
    sub-long/2addr v6, v1

    .line 84
    iput-wide v6, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 85
    .line 86
    if-ne v3, v4, :cond_2

    .line 87
    .line 88
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 89
    .line 90
    .line 91
    :cond_2
    return v5

    .line 92
    :cond_3
    invoke-virtual {p0, v1, v2}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(J)V

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x0

    .line 96
    throw p0
.end method

.method public final readLong()J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    const-wide/16 v2, 0x8

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    invoke-virtual {v1}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/16 v5, 0x20

    .line 14
    .line 15
    const/16 v6, 0x8

    .line 16
    .line 17
    if-ge v4, v6, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v2, v3}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(J)V

    .line 20
    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readLong()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    return-wide v0

    .line 32
    :cond_0
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    int-to-long v1, v1

    .line 37
    shl-long/2addr v1, v5

    .line 38
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readInt()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    int-to-long v3, v0

    .line 43
    const-wide v5, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v3, v5

    .line 49
    or-long v0, v1, v3

    .line 50
    .line 51
    return-wide v0

    .line 52
    :cond_1
    iget-object v7, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 53
    .line 54
    iget v8, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 55
    .line 56
    add-int/lit8 v9, v8, 0x1

    .line 57
    .line 58
    aget-byte v10, v7, v8

    .line 59
    .line 60
    int-to-long v10, v10

    .line 61
    const-wide/16 v12, 0xff

    .line 62
    .line 63
    and-long/2addr v10, v12

    .line 64
    const/16 v14, 0x38

    .line 65
    .line 66
    shl-long/2addr v10, v14

    .line 67
    add-int/lit8 v14, v8, 0x2

    .line 68
    .line 69
    aget-byte v9, v7, v9

    .line 70
    .line 71
    move-wide v15, v12

    .line 72
    int-to-long v12, v9

    .line 73
    and-long/2addr v12, v15

    .line 74
    const/16 v9, 0x30

    .line 75
    .line 76
    shl-long/2addr v12, v9

    .line 77
    or-long v9, v10, v12

    .line 78
    .line 79
    add-int/lit8 v11, v8, 0x3

    .line 80
    .line 81
    aget-byte v12, v7, v14

    .line 82
    .line 83
    int-to-long v12, v12

    .line 84
    and-long/2addr v12, v15

    .line 85
    const/16 v14, 0x28

    .line 86
    .line 87
    shl-long/2addr v12, v14

    .line 88
    or-long/2addr v9, v12

    .line 89
    add-int/lit8 v12, v8, 0x4

    .line 90
    .line 91
    aget-byte v11, v7, v11

    .line 92
    .line 93
    int-to-long v13, v11

    .line 94
    and-long/2addr v13, v15

    .line 95
    shl-long/2addr v13, v5

    .line 96
    or-long/2addr v9, v13

    .line 97
    add-int/lit8 v5, v8, 0x5

    .line 98
    .line 99
    aget-byte v11, v7, v12

    .line 100
    .line 101
    int-to-long v11, v11

    .line 102
    and-long/2addr v11, v15

    .line 103
    const/16 v13, 0x18

    .line 104
    .line 105
    shl-long/2addr v11, v13

    .line 106
    or-long/2addr v9, v11

    .line 107
    add-int/lit8 v11, v8, 0x6

    .line 108
    .line 109
    aget-byte v5, v7, v5

    .line 110
    .line 111
    int-to-long v12, v5

    .line 112
    and-long/2addr v12, v15

    .line 113
    const/16 v5, 0x10

    .line 114
    .line 115
    shl-long/2addr v12, v5

    .line 116
    or-long/2addr v9, v12

    .line 117
    add-int/lit8 v5, v8, 0x7

    .line 118
    .line 119
    aget-byte v11, v7, v11

    .line 120
    .line 121
    int-to-long v11, v11

    .line 122
    and-long/2addr v11, v15

    .line 123
    shl-long/2addr v11, v6

    .line 124
    or-long/2addr v9, v11

    .line 125
    add-int/2addr v8, v6

    .line 126
    aget-byte v5, v7, v5

    .line 127
    .line 128
    int-to-long v11, v5

    .line 129
    and-long/2addr v11, v15

    .line 130
    or-long/2addr v9, v11

    .line 131
    iput v8, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 132
    .line 133
    iget-wide v7, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 134
    .line 135
    sub-long/2addr v7, v2

    .line 136
    iput-wide v7, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 137
    .line 138
    if-ne v4, v6, :cond_2

    .line 139
    .line 140
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 141
    .line 142
    .line 143
    :cond_2
    return-wide v9

    .line 144
    :cond_3
    invoke-virtual {v0, v2, v3}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(J)V

    .line 145
    .line 146
    .line 147
    const/4 v0, 0x0

    .line 148
    throw v0
.end method

.method public final readShort()S
    .locals 9

    .line 1
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    const-wide/16 v1, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x2

    .line 12
    if-ge v3, v4, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v1, v2}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(J)V

    .line 15
    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readShort()S

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_0
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readByte()B

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    and-int/lit16 v0, v0, 0xff

    .line 32
    .line 33
    shl-int/lit8 v0, v0, 0x8

    .line 34
    .line 35
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readByte()B

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    and-int/lit16 p0, p0, 0xff

    .line 40
    .line 41
    or-int/2addr p0, v0

    .line 42
    int-to-short p0, p0

    .line 43
    return p0

    .line 44
    :cond_1
    iget-object v5, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 45
    .line 46
    iget v6, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 47
    .line 48
    add-int/lit8 v7, v6, 0x1

    .line 49
    .line 50
    aget-byte v8, v5, v6

    .line 51
    .line 52
    and-int/lit16 v8, v8, 0xff

    .line 53
    .line 54
    shl-int/lit8 v8, v8, 0x8

    .line 55
    .line 56
    add-int/2addr v6, v4

    .line 57
    aget-byte v5, v5, v7

    .line 58
    .line 59
    and-int/lit16 v5, v5, 0xff

    .line 60
    .line 61
    or-int/2addr v5, v8

    .line 62
    int-to-short v5, v5

    .line 63
    iput v6, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 64
    .line 65
    iget-wide v6, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 66
    .line 67
    sub-long/2addr v6, v1

    .line 68
    iput-wide v6, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 69
    .line 70
    if-ne v3, v4, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 73
    .line 74
    .line 75
    :cond_2
    return v5

    .line 76
    :cond_3
    invoke-virtual {p0, v1, v2}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(J)V

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x0

    .line 80
    throw p0
.end method

.method public final skip(J)V
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-ltz v2, :cond_3

    .line 6
    .line 7
    move-wide v2, p1

    .line 8
    :cond_0
    :goto_0
    cmp-long v4, v2, v0

    .line 9
    .line 10
    if-lez v4, :cond_2

    .line 11
    .line 12
    iget-object v4, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    iget v5, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 17
    .line 18
    iget v6, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    sub-int/2addr v5, v6

    .line 21
    int-to-long v5, v5

    .line 22
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    long-to-int v5, v5

    .line 27
    iget-wide v6, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 28
    .line 29
    int-to-long v8, v5

    .line 30
    sub-long/2addr v6, v8

    .line 31
    iput-wide v6, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 32
    .line 33
    sub-long/2addr v2, v8

    .line 34
    iget v6, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 35
    .line 36
    add-int/2addr v6, v5

    .line 37
    iput v6, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 38
    .line 39
    iget v4, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 40
    .line 41
    if-ne v6, v4, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance p0, Ljava/io/EOFException;

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "Buffer exhausted before skipping "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p1, " bytes."

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p0

    .line 72
    :cond_2
    return-void

    .line 73
    :cond_3
    const-string p0, "byteCount ("

    .line 74
    .line 75
    const-string v0, ") < 0"

    .line 76
    .line 77
    invoke-static {p0, p1, p2, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;JLjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const-string p0, "Buffer(size=0)"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-wide/16 v2, 0x40

    .line 13
    .line 14
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    long-to-int v0, v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    mul-int/lit8 v4, v0, 0x2

    .line 22
    .line 23
    iget-wide v5, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 24
    .line 25
    cmp-long v5, v5, v2

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    if-lez v5, :cond_1

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v5, v6

    .line 33
    :goto_0
    add-int/2addr v4, v5

    .line 34
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iget-object v4, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 38
    .line 39
    move v5, v6

    .line 40
    :goto_1
    if-eqz v4, :cond_3

    .line 41
    .line 42
    move v7, v6

    .line 43
    :goto_2
    if-ge v5, v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {v4}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-ge v7, v8, :cond_2

    .line 50
    .line 51
    add-int/lit8 v8, v7, 0x1

    .line 52
    .line 53
    iget-object v9, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 54
    .line 55
    iget v10, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 56
    .line 57
    add-int/2addr v10, v7

    .line 58
    aget-byte v7, v9, v10

    .line 59
    .line 60
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    shr-int/lit8 v9, v7, 0x4

    .line 63
    .line 64
    and-int/lit8 v9, v9, 0xf

    .line 65
    .line 66
    sget-object v10, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:[C

    .line 67
    .line 68
    aget-char v9, v10, v9

    .line 69
    .line 70
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    and-int/lit8 v7, v7, 0xf

    .line 74
    .line 75
    aget-char v7, v10, v7

    .line 76
    .line 77
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    move v7, v8

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    iget-object v4, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    iget-wide v4, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 86
    .line 87
    cmp-long v0, v4, v2

    .line 88
    .line 89
    if-lez v0, :cond_4

    .line 90
    .line 91
    const/16 v0, 0x2026

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v2, "Buffer(size="

    .line 99
    .line 100
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-wide v2, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 104
    .line 105
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p0, " hex="

    .line 109
    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const/16 p0, 0x29

    .line 117
    .line 118
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0
.end method

.method public final write([BII)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    int-to-long v1, v0

    .line 6
    int-to-long v3, p2

    .line 7
    int-to-long v5, p3

    .line 8
    invoke-static/range {v1 .. v6}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(JJJ)V

    .line 9
    .line 10
    .line 11
    move v0, p2

    .line 12
    :goto_0
    if-ge v0, p3, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sub-int v2, p3, v0

    .line 20
    .line 21
    invoke-virtual {v1}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, v0

    .line 30
    iget-object v3, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 31
    .line 32
    iget v4, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 33
    .line 34
    invoke-static {p1, v4, v3, v0, v2}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪兰苏([BI[BII)V

    .line 35
    .line 36
    .line 37
    iget v3, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 38
    .line 39
    sub-int v0, v2, v0

    .line 40
    .line 41
    add-int/2addr v0, v3

    .line 42
    iput v0, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 43
    .line 44
    move v0, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 47
    .line 48
    sub-int/2addr p3, p2

    .line 49
    int-to-long p1, p3

    .line 50
    add-long/2addr v0, p1

    .line 51
    iput-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 52
    .line 53
    return-void
.end method

.method public final 飘花落叶言子世兰楪苏哲(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p2, v0

    .line 4
    .line 5
    if-ltz v2, :cond_2

    .line 6
    .line 7
    iget-wide v2, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 8
    .line 9
    cmp-long v0, v2, v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-wide/16 p0, -0x1

    .line 14
    .line 15
    return-wide p0

    .line 16
    :cond_0
    cmp-long v0, p2, v2

    .line 17
    .line 18
    if-lez v0, :cond_1

    .line 19
    .line 20
    move-wide p2, v2

    .line 21
    :cond_1
    invoke-virtual {p1, p0, p2, p3}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)V

    .line 22
    .line 23
    .line 24
    return-wide p2

    .line 25
    :cond_2
    const-string p0, "byteCount ("

    .line 26
    .line 27
    const-string p1, ") < 0"

    .line 28
    .line 29
    invoke-static {p0, p2, p3, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;JLjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-wide v0
.end method

.method public final 飘花落叶言子世苏兰楪哲()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final 飘花落叶言子哲世兰苏楪(I[BI)I
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p2

    .line 5
    int-to-long v1, v0

    .line 6
    int-to-long v3, p1

    .line 7
    int-to-long v5, p3

    .line 8
    invoke-static/range {v1 .. v6}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(JJJ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    return p0

    .line 17
    :cond_0
    sub-int/2addr p3, p1

    .line 18
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    add-int v1, p1, p3

    .line 27
    .line 28
    sub-int/2addr v1, p1

    .line 29
    iget-object v2, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 30
    .line 31
    iget v3, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 32
    .line 33
    add-int v4, v3, v1

    .line 34
    .line 35
    invoke-static {v2, p1, p2, v3, v4}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪兰苏([BI[BII)V

    .line 36
    .line 37
    .line 38
    iget p1, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 39
    .line 40
    add-int/2addr p1, v1

    .line 41
    iput p1, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 42
    .line 43
    iget-wide p1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 44
    .line 45
    int-to-long v1, p3

    .line 46
    sub-long/2addr p1, v1

    .line 47
    iput-wide p1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 48
    .line 49
    invoke-static {v0}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 56
    .line 57
    .line 58
    :cond_1
    return p3
.end method

.method public final 飘花落叶言子哲楪世兰苏(Lkotlinx/io/飘花落叶言子楪苏哲兰世;J)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p2, v0

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 11
    .line 12
    cmp-long v2, v0, p2

    .line 13
    .line 14
    if-ltz v2, :cond_0

    .line 15
    .line 16
    check-cast p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    invoke-virtual {p1, p0, p2, p3}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    check-cast p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    invoke-virtual {p1, p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Ljava/io/EOFException;

    .line 28
    .line 29
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 30
    .line 31
    new-instance p0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "Buffer exhausted before writing "

    .line 34
    .line 35
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p2, " bytes. Only "

    .line 42
    .line 43
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p2, " bytes were written."

    .line 50
    .line 51
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-direct {p1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_1
    const-string p0, "byteCount ("

    .line 63
    .line 64
    const-string p1, ") < 0"

    .line 65
    .line 66
    invoke-static {p0, p2, p3, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;JLjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final 飘花落叶言子哲楪世苏兰(Lkotlinx/io/飘花落叶言子楪苏哲兰世;)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-lez v2, :cond_0

    .line 11
    .line 12
    check-cast p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-virtual {p1, p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-wide v0
.end method

.method public final 飘花落叶言子楪世兰哲苏(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 8
    .line 9
    cmp-long p0, v0, p1

    .line 10
    .line 11
    if-ltz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_1
    const-string p0, "byteCount: "

    .line 18
    .line 19
    const-string v0, " < 0"

    .line 20
    .line 21
    invoke-static {p0, p1, p2, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;JLjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final synthetic 飘花落叶言子楪世哲苏兰()V
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    iput-object v1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-object v2, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput-object v2, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 17
    .line 18
    :goto_0
    iput-object v2, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 19
    .line 20
    invoke-static {v0}, Lkotlinx/io/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    iput-object v1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-object v2, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput-object v2, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 17
    .line 18
    :goto_0
    iput-object v2, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 19
    .line 20
    invoke-static {v0}, Lkotlinx/io/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final 飘花落叶言子楪兰世苏哲(S)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 7
    .line 8
    iget v3, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 9
    .line 10
    add-int/lit8 v4, v3, 0x1

    .line 11
    .line 12
    ushr-int/lit8 v5, p1, 0x8

    .line 13
    .line 14
    and-int/lit16 v5, v5, 0xff

    .line 15
    .line 16
    int-to-byte v5, v5

    .line 17
    aput-byte v5, v2, v3

    .line 18
    .line 19
    add-int/2addr v3, v0

    .line 20
    and-int/lit16 p1, p1, 0xff

    .line 21
    .line 22
    int-to-byte p1, p1

    .line 23
    aput-byte p1, v2, v4

    .line 24
    .line 25
    iput v3, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 26
    .line 27
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 28
    .line 29
    const-wide/16 v2, 0x2

    .line 30
    .line 31
    add-long/2addr v0, v2

    .line 32
    iput-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 33
    .line 34
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏(J)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 8
    .line 9
    cmp-long v0, v0, p1

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    .line 15
    .line 16
    iget-wide v1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 17
    .line 18
    new-instance p0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v3, "Buffer doesn\'t contain required number of bytes (size: "

    .line 21
    .line 22
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", required: "

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p1, 0x29

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {v0, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    const-string p0, "byteCount: "

    .line 50
    .line 51
    invoke-static {p1, p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final synthetic 飘花落叶言子楪哲世苏兰(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p1, v0, :cond_3

    .line 3
    .line 4
    const/16 v0, 0x2000

    .line 5
    .line 6
    if-gt p1, v0, :cond_3

    .line 7
    .line 8
    iget-object v1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lkotlinx/io/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲()Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 17
    .line 18
    iput-object p1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    iget v2, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 22
    .line 23
    add-int/2addr v2, p1

    .line 24
    if-gt v2, v0, :cond_2

    .line 25
    .line 26
    iget-boolean p1, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-object v1

    .line 32
    :cond_2
    :goto_0
    invoke-static {}, Lkotlinx/io/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲()Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v1, p1}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_3
    const-string p0, "unexpected capacity"

    .line 43
    .line 44
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰苏世(I)V
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 7
    .line 8
    iget v3, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 9
    .line 10
    add-int/lit8 v4, v3, 0x1

    .line 11
    .line 12
    ushr-int/lit8 v5, p1, 0x18

    .line 13
    .line 14
    and-int/lit16 v5, v5, 0xff

    .line 15
    .line 16
    int-to-byte v5, v5

    .line 17
    aput-byte v5, v2, v3

    .line 18
    .line 19
    add-int/lit8 v5, v3, 0x2

    .line 20
    .line 21
    ushr-int/lit8 v6, p1, 0x10

    .line 22
    .line 23
    and-int/lit16 v6, v6, 0xff

    .line 24
    .line 25
    int-to-byte v6, v6

    .line 26
    aput-byte v6, v2, v4

    .line 27
    .line 28
    add-int/lit8 v4, v3, 0x3

    .line 29
    .line 30
    ushr-int/lit8 v6, p1, 0x8

    .line 31
    .line 32
    and-int/lit16 v6, v6, 0xff

    .line 33
    .line 34
    int-to-byte v6, v6

    .line 35
    aput-byte v6, v2, v5

    .line 36
    .line 37
    add-int/2addr v3, v0

    .line 38
    and-int/lit16 p1, p1, 0xff

    .line 39
    .line 40
    int-to-byte p1, p1

    .line 41
    aput-byte p1, v2, v4

    .line 42
    .line 43
    iput v3, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 44
    .line 45
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 46
    .line 47
    const-wide/16 v2, 0x4

    .line 48
    .line 49
    add-long/2addr v0, v2

    .line 50
    iput-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 51
    .line 52
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)V
    .locals 9

    .line 1
    if-eq p1, p0, :cond_f

    .line 2
    .line 3
    iget-wide v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    move-wide v4, p2

    .line 8
    invoke-static/range {v0 .. v5}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(JJJ)V

    .line 9
    .line 10
    .line 11
    :goto_0
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long v0, p2, v0

    .line 14
    .line 15
    if-lez v0, :cond_e

    .line 16
    .line 17
    iget-object v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-long v0, v0

    .line 27
    cmp-long v0, p2, v0

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-gez v0, :cond_5

    .line 31
    .line 32
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-boolean v2, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    iget v2, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 41
    .line 42
    int-to-long v2, v2

    .line 43
    add-long/2addr v2, p2

    .line 44
    iget-object v4, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Lkotlinx/io/飘花落叶言子楪苏世哲兰;

    .line 45
    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    iget v4, v4, Lkotlinx/io/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 49
    .line 50
    if-lez v4, :cond_0

    .line 51
    .line 52
    move v4, v1

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    iget v4, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 55
    .line 56
    :goto_1
    int-to-long v4, v4

    .line 57
    sub-long/2addr v2, v4

    .line 58
    const-wide/16 v4, 0x2000

    .line 59
    .line 60
    cmp-long v2, v2, v4

    .line 61
    .line 62
    if-gtz v2, :cond_1

    .line 63
    .line 64
    iget-object v1, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    long-to-int v2, p2

    .line 70
    invoke-virtual {v1, v0, v2}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Lkotlinx/io/飘花落叶言子楪苏世兰哲;I)V

    .line 71
    .line 72
    .line 73
    iget-wide v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 74
    .line 75
    sub-long/2addr v0, p2

    .line 76
    iput-wide v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 77
    .line 78
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 79
    .line 80
    add-long/2addr v0, p2

    .line 81
    iput-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    iget-object v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    long-to-int v2, p2

    .line 90
    if-lez v2, :cond_4

    .line 91
    .line 92
    iget v3, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 93
    .line 94
    iget v4, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 95
    .line 96
    sub-int/2addr v3, v4

    .line 97
    if-gt v2, v3, :cond_4

    .line 98
    .line 99
    const/16 v3, 0x400

    .line 100
    .line 101
    if-lt v2, v3, :cond_2

    .line 102
    .line 103
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲()Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    goto :goto_2

    .line 108
    :cond_2
    invoke-static {}, Lkotlinx/io/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲()Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iget-object v4, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 113
    .line 114
    iget-object v5, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 115
    .line 116
    iget v6, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 117
    .line 118
    add-int v7, v6, v2

    .line 119
    .line 120
    const/4 v8, 0x2

    .line 121
    invoke-static {v4, v6, v5, v7, v8}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子世兰楪苏哲([BI[BII)V

    .line 122
    .line 123
    .line 124
    :goto_2
    iget v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 125
    .line 126
    add-int/2addr v4, v2

    .line 127
    iput v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 128
    .line 129
    iget v4, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 130
    .line 131
    add-int/2addr v4, v2

    .line 132
    iput v4, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 133
    .line 134
    iget-object v2, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 135
    .line 136
    if-eqz v2, :cond_3

    .line 137
    .line 138
    invoke-virtual {v2, v3}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_3
    iput-object v0, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 143
    .line 144
    iput-object v3, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 145
    .line 146
    :goto_3
    iput-object v3, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_4
    const-string p0, "byteCount out of range"

    .line 150
    .line 151
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_5
    :goto_4
    iget-object v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    int-to-long v2, v2

    .line 165
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    iput-object v4, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 170
    .line 171
    if-nez v4, :cond_6

    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    iput-object v4, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 175
    .line 176
    :cond_6
    iget-object v4, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 177
    .line 178
    if-nez v4, :cond_7

    .line 179
    .line 180
    iput-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 181
    .line 182
    iput-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_7
    iget-object v4, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)V

    .line 191
    .line 192
    .line 193
    iget-object v4, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 194
    .line 195
    if-eqz v4, :cond_d

    .line 196
    .line 197
    iget-boolean v5, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 198
    .line 199
    if-nez v5, :cond_8

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_8
    iget v5, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 203
    .line 204
    iget v6, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 205
    .line 206
    sub-int/2addr v5, v6

    .line 207
    iget v6, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 208
    .line 209
    rsub-int v6, v6, 0x2000

    .line 210
    .line 211
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v4, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Lkotlinx/io/飘花落叶言子楪苏世哲兰;

    .line 215
    .line 216
    if-eqz v4, :cond_9

    .line 217
    .line 218
    iget v4, v4, Lkotlinx/io/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 219
    .line 220
    if-lez v4, :cond_9

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_9
    iget-object v1, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    iget v1, v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 229
    .line 230
    :goto_5
    add-int/2addr v6, v1

    .line 231
    if-le v5, v6, :cond_a

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_a
    iget-object v1, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v1, v5}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Lkotlinx/io/飘花落叶言子楪苏世兰哲;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    if-nez v4, :cond_c

    .line 247
    .line 248
    invoke-static {v0}, Lkotlinx/io/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)V

    .line 249
    .line 250
    .line 251
    move-object v0, v1

    .line 252
    :goto_6
    iput-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 253
    .line 254
    iget-object v1, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 255
    .line 256
    if-nez v1, :cond_b

    .line 257
    .line 258
    iput-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 259
    .line 260
    :cond_b
    :goto_7
    iget-wide v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 261
    .line 262
    sub-long/2addr v0, v2

    .line 263
    iput-wide v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 264
    .line 265
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 266
    .line 267
    add-long/2addr v0, v2

    .line 268
    iput-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 269
    .line 270
    sub-long/2addr p2, v2

    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :cond_c
    const-string p0, "Check failed."

    .line 274
    .line 275
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_d
    const-string p0, "cannot compact"

    .line 280
    .line 281
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :cond_e
    return-void

    .line 285
    :cond_f
    const-string p0, "source == this"

    .line 286
    .line 287
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    return-void
.end method

.method public final 飘花落叶言子楪哲苏兰世(B)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 7
    .line 8
    iget v2, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 9
    .line 10
    add-int/lit8 v3, v2, 0x1

    .line 11
    .line 12
    iput v3, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 13
    .line 14
    aput-byte p1, v1, v2

    .line 15
    .line 16
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 17
    .line 18
    const-wide/16 v2, 0x1

    .line 19
    .line 20
    add-long/2addr v0, v2

    .line 21
    iput-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(J)V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/EOFException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Buffer doesn\'t contain required number of bytes (size: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-wide v2, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 11
    .line 12
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, ", required: "

    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p0, 0x29

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lkotlinx/io/飘花落叶言子楪世哲兰苏;)J
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    :goto_0
    const-wide/16 v2, 0x2000

    .line 7
    .line 8
    invoke-interface {p1, p0, v2, v3}, Lkotlinx/io/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰楪苏哲(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide/16 v4, -0x1

    .line 13
    .line 14
    cmp-long v4, v2, v4

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    add-long/2addr v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-wide v0
.end method
