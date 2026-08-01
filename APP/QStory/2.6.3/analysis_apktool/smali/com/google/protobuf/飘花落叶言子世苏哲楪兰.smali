.class public abstract Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;
.super Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:I

.field public final 飘花落叶言子楪世兰苏哲:[B

.field public 飘花落叶言子楪苏世兰哲:I

.field public 飘花落叶言子楪苏世哲兰:I

.field public 飘花落叶言子楪苏兰世哲:I

.field public final 飘花落叶言子楪苏哲世兰:I

.field public 飘花落叶言子楪苏哲兰世:I


# direct methods
.method public constructor <init>([BIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const p4, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput p4, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 10
    .line 11
    add-int/2addr p3, p2

    .line 12
    iput p3, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 13
    .line 14
    iput p2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 15
    .line 16
    iput p2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏哲世兰:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世兰哲楪苏()J
    .locals 12

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 12
    .line 13
    aget-byte v4, v3, v0

    .line 14
    .line 15
    if-ltz v4, :cond_1

    .line 16
    .line 17
    iput v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 18
    .line 19
    int-to-long v0, v4

    .line 20
    return-wide v0

    .line 21
    :cond_1
    sub-int/2addr v1, v2

    .line 22
    const/16 v5, 0x9

    .line 23
    .line 24
    if-ge v1, v5, :cond_2

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_2
    add-int/lit8 v1, v0, 0x2

    .line 29
    .line 30
    aget-byte v2, v3, v2

    .line 31
    .line 32
    shl-int/lit8 v2, v2, 0x7

    .line 33
    .line 34
    xor-int/2addr v2, v4

    .line 35
    if-gez v2, :cond_3

    .line 36
    .line 37
    xor-int/lit8 v0, v2, -0x80

    .line 38
    .line 39
    int-to-long v2, v0

    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_3
    add-int/lit8 v4, v0, 0x3

    .line 43
    .line 44
    aget-byte v1, v3, v1

    .line 45
    .line 46
    shl-int/lit8 v1, v1, 0xe

    .line 47
    .line 48
    xor-int/2addr v1, v2

    .line 49
    if-ltz v1, :cond_4

    .line 50
    .line 51
    xor-int/lit16 v0, v1, 0x3f80

    .line 52
    .line 53
    int-to-long v2, v0

    .line 54
    move v1, v4

    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_4
    add-int/lit8 v2, v0, 0x4

    .line 58
    .line 59
    aget-byte v4, v3, v4

    .line 60
    .line 61
    shl-int/lit8 v4, v4, 0x15

    .line 62
    .line 63
    xor-int/2addr v1, v4

    .line 64
    if-gez v1, :cond_5

    .line 65
    .line 66
    const v0, -0x1fc080

    .line 67
    .line 68
    .line 69
    xor-int/2addr v0, v1

    .line 70
    int-to-long v0, v0

    .line 71
    :goto_0
    move-wide v10, v0

    .line 72
    move v1, v2

    .line 73
    move-wide v2, v10

    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_5
    int-to-long v4, v1

    .line 77
    add-int/lit8 v1, v0, 0x5

    .line 78
    .line 79
    aget-byte v2, v3, v2

    .line 80
    .line 81
    int-to-long v6, v2

    .line 82
    const/16 v2, 0x1c

    .line 83
    .line 84
    shl-long/2addr v6, v2

    .line 85
    xor-long/2addr v4, v6

    .line 86
    const-wide/16 v6, 0x0

    .line 87
    .line 88
    cmp-long v2, v4, v6

    .line 89
    .line 90
    if-ltz v2, :cond_6

    .line 91
    .line 92
    const-wide/32 v2, 0xfe03f80

    .line 93
    .line 94
    .line 95
    :goto_1
    xor-long/2addr v2, v4

    .line 96
    goto :goto_3

    .line 97
    :cond_6
    add-int/lit8 v2, v0, 0x6

    .line 98
    .line 99
    aget-byte v1, v3, v1

    .line 100
    .line 101
    int-to-long v8, v1

    .line 102
    const/16 v1, 0x23

    .line 103
    .line 104
    shl-long/2addr v8, v1

    .line 105
    xor-long/2addr v4, v8

    .line 106
    cmp-long v1, v4, v6

    .line 107
    .line 108
    if-gez v1, :cond_7

    .line 109
    .line 110
    const-wide v0, -0x7f01fc080L

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    :goto_2
    xor-long/2addr v0, v4

    .line 116
    goto :goto_0

    .line 117
    :cond_7
    add-int/lit8 v1, v0, 0x7

    .line 118
    .line 119
    aget-byte v2, v3, v2

    .line 120
    .line 121
    int-to-long v8, v2

    .line 122
    const/16 v2, 0x2a

    .line 123
    .line 124
    shl-long/2addr v8, v2

    .line 125
    xor-long/2addr v4, v8

    .line 126
    cmp-long v2, v4, v6

    .line 127
    .line 128
    if-ltz v2, :cond_8

    .line 129
    .line 130
    const-wide v2, 0x3f80fe03f80L

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_8
    add-int/lit8 v2, v0, 0x8

    .line 137
    .line 138
    aget-byte v1, v3, v1

    .line 139
    .line 140
    int-to-long v8, v1

    .line 141
    const/16 v1, 0x31

    .line 142
    .line 143
    shl-long/2addr v8, v1

    .line 144
    xor-long/2addr v4, v8

    .line 145
    cmp-long v1, v4, v6

    .line 146
    .line 147
    if-gez v1, :cond_9

    .line 148
    .line 149
    const-wide v0, -0x1fc07f01fc080L

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_9
    add-int/lit8 v1, v0, 0x9

    .line 156
    .line 157
    aget-byte v2, v3, v2

    .line 158
    .line 159
    int-to-long v8, v2

    .line 160
    const/16 v2, 0x38

    .line 161
    .line 162
    shl-long/2addr v8, v2

    .line 163
    xor-long/2addr v4, v8

    .line 164
    cmp-long v2, v4, v6

    .line 165
    .line 166
    if-ltz v2, :cond_a

    .line 167
    .line 168
    const-wide v2, 0xfe03f80fe03f80L

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_a
    add-int/lit8 v0, v0, 0xa

    .line 175
    .line 176
    aget-byte v1, v3, v1

    .line 177
    .line 178
    int-to-long v1, v1

    .line 179
    const/16 v3, 0x3f

    .line 180
    .line 181
    shl-long/2addr v1, v3

    .line 182
    xor-long/2addr v1, v4

    .line 183
    cmp-long v3, v1, v6

    .line 184
    .line 185
    if-ltz v3, :cond_b

    .line 186
    .line 187
    const-wide v3, -0x7f01fc07f01fc080L    # -6.838959413692434E-304

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    xor-long v2, v1, v3

    .line 193
    .line 194
    move v1, v0

    .line 195
    :goto_3
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 196
    .line 197
    return-wide v2

    .line 198
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰哲苏楪()J

    .line 199
    .line 200
    .line 201
    move-result-wide v0

    .line 202
    return-wide v0
.end method

.method public final 飘花落叶言子世兰哲苏楪()J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    const/16 v3, 0x40

    .line 5
    .line 6
    if-ge v2, v3, :cond_2

    .line 7
    .line 8
    iget v3, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 9
    .line 10
    iget v4, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 11
    .line 12
    if-eq v3, v4, :cond_1

    .line 13
    .line 14
    add-int/lit8 v4, v3, 0x1

    .line 15
    .line 16
    iput v4, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 17
    .line 18
    iget-object v4, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 19
    .line 20
    aget-byte v3, v4, v3

    .line 21
    .line 22
    and-int/lit8 v4, v3, 0x7f

    .line 23
    .line 24
    int-to-long v4, v4

    .line 25
    shl-long/2addr v4, v2

    .line 26
    or-long/2addr v0, v4

    .line 27
    and-int/lit16 v3, v3, 0x80

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    return-wide v0

    .line 32
    :cond_0
    add-int/lit8 v2, v2, 0x7

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    throw p0

    .line 40
    :cond_2
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->malformedVarint()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    throw p0
.end method

.method public final 飘花落叶言子世兰楪哲苏()I
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰苏楪哲()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 6
    .line 7
    iget v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 8
    .line 9
    if-gt v1, v2, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 19
    .line 20
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 21
    .line 22
    if-le v1, p0, :cond_1

    .line 23
    .line 24
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    throw p0

    .line 29
    :cond_1
    throw v0

    .line 30
    :catch_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    throw p0
.end method

.method public abstract 飘花落叶言子世兰楪苏哲()I
.end method

.method public final 飘花落叶言子世兰苏哲楪()I
    .locals 7

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 9
    .line 10
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 11
    .line 12
    aget-byte v4, v3, v0

    .line 13
    .line 14
    if-ltz v4, :cond_1

    .line 15
    .line 16
    iput v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 17
    .line 18
    return v4

    .line 19
    :cond_1
    sub-int/2addr v1, v2

    .line 20
    const/16 v5, 0x9

    .line 21
    .line 22
    if-ge v1, v5, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    add-int/lit8 v1, v0, 0x2

    .line 26
    .line 27
    aget-byte v2, v3, v2

    .line 28
    .line 29
    shl-int/lit8 v2, v2, 0x7

    .line 30
    .line 31
    xor-int/2addr v2, v4

    .line 32
    if-gez v2, :cond_3

    .line 33
    .line 34
    xor-int/lit8 v0, v2, -0x80

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_3
    add-int/lit8 v4, v0, 0x3

    .line 38
    .line 39
    aget-byte v1, v3, v1

    .line 40
    .line 41
    shl-int/lit8 v1, v1, 0xe

    .line 42
    .line 43
    xor-int/2addr v1, v2

    .line 44
    if-ltz v1, :cond_4

    .line 45
    .line 46
    xor-int/lit16 v0, v1, 0x3f80

    .line 47
    .line 48
    :goto_0
    move v1, v4

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    add-int/lit8 v2, v0, 0x4

    .line 51
    .line 52
    aget-byte v4, v3, v4

    .line 53
    .line 54
    shl-int/lit8 v4, v4, 0x15

    .line 55
    .line 56
    xor-int/2addr v1, v4

    .line 57
    if-gez v1, :cond_5

    .line 58
    .line 59
    const v0, -0x1fc080

    .line 60
    .line 61
    .line 62
    xor-int/2addr v0, v1

    .line 63
    :goto_1
    move v1, v2

    .line 64
    goto :goto_3

    .line 65
    :cond_5
    add-int/lit8 v4, v0, 0x5

    .line 66
    .line 67
    aget-byte v2, v3, v2

    .line 68
    .line 69
    shl-int/lit8 v5, v2, 0x1c

    .line 70
    .line 71
    xor-int/2addr v1, v5

    .line 72
    const v5, 0xfe03f80

    .line 73
    .line 74
    .line 75
    xor-int/2addr v1, v5

    .line 76
    if-gez v2, :cond_7

    .line 77
    .line 78
    add-int/lit8 v2, v0, 0x6

    .line 79
    .line 80
    aget-byte v4, v3, v4

    .line 81
    .line 82
    if-gez v4, :cond_8

    .line 83
    .line 84
    add-int/lit8 v4, v0, 0x7

    .line 85
    .line 86
    aget-byte v2, v3, v2

    .line 87
    .line 88
    if-gez v2, :cond_7

    .line 89
    .line 90
    add-int/lit8 v2, v0, 0x8

    .line 91
    .line 92
    aget-byte v4, v3, v4

    .line 93
    .line 94
    if-gez v4, :cond_8

    .line 95
    .line 96
    add-int/lit8 v4, v0, 0x9

    .line 97
    .line 98
    aget-byte v2, v3, v2

    .line 99
    .line 100
    if-gez v2, :cond_7

    .line 101
    .line 102
    add-int/lit8 v0, v0, 0xa

    .line 103
    .line 104
    aget-byte v2, v3, v4

    .line 105
    .line 106
    if-gez v2, :cond_6

    .line 107
    .line 108
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰哲苏楪()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    long-to-int p0, v0

    .line 113
    return p0

    .line 114
    :cond_6
    move v6, v1

    .line 115
    move v1, v0

    .line 116
    move v0, v6

    .line 117
    goto :goto_3

    .line 118
    :cond_7
    move v0, v1

    .line 119
    goto :goto_0

    .line 120
    :cond_8
    move v0, v1

    .line 121
    goto :goto_1

    .line 122
    :goto_3
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 123
    .line 124
    return v0
.end method

.method public final 飘花落叶言子世兰苏楪哲()I
    .locals 7

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 6
    .line 7
    aget-byte v3, v2, v0

    .line 8
    .line 9
    if-ltz v3, :cond_0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    add-int/lit8 v4, v0, 0x2

    .line 14
    .line 15
    aget-byte v1, v2, v1

    .line 16
    .line 17
    shl-int/lit8 v1, v1, 0x7

    .line 18
    .line 19
    xor-int/2addr v1, v3

    .line 20
    if-gez v1, :cond_1

    .line 21
    .line 22
    xor-int/lit8 v3, v1, -0x80

    .line 23
    .line 24
    :goto_0
    move v1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    add-int/lit8 v3, v0, 0x3

    .line 27
    .line 28
    aget-byte v4, v2, v4

    .line 29
    .line 30
    shl-int/lit8 v4, v4, 0xe

    .line 31
    .line 32
    xor-int/2addr v1, v4

    .line 33
    if-ltz v1, :cond_2

    .line 34
    .line 35
    xor-int/lit16 v0, v1, 0x3f80

    .line 36
    .line 37
    move v1, v3

    .line 38
    move v3, v0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    add-int/lit8 v4, v0, 0x4

    .line 41
    .line 42
    aget-byte v3, v2, v3

    .line 43
    .line 44
    shl-int/lit8 v3, v3, 0x15

    .line 45
    .line 46
    xor-int/2addr v1, v3

    .line 47
    if-gez v1, :cond_3

    .line 48
    .line 49
    const v0, -0x1fc080

    .line 50
    .line 51
    .line 52
    xor-int v3, v1, v0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    add-int/lit8 v3, v0, 0x5

    .line 56
    .line 57
    aget-byte v4, v2, v4

    .line 58
    .line 59
    shl-int/lit8 v5, v4, 0x1c

    .line 60
    .line 61
    xor-int/2addr v1, v5

    .line 62
    const v5, 0xfe03f80

    .line 63
    .line 64
    .line 65
    xor-int/2addr v1, v5

    .line 66
    if-gez v4, :cond_5

    .line 67
    .line 68
    add-int/lit8 v4, v0, 0x6

    .line 69
    .line 70
    aget-byte v3, v2, v3

    .line 71
    .line 72
    if-gez v3, :cond_6

    .line 73
    .line 74
    add-int/lit8 v3, v0, 0x7

    .line 75
    .line 76
    aget-byte v4, v2, v4

    .line 77
    .line 78
    if-gez v4, :cond_5

    .line 79
    .line 80
    add-int/lit8 v4, v0, 0x8

    .line 81
    .line 82
    aget-byte v3, v2, v3

    .line 83
    .line 84
    if-gez v3, :cond_6

    .line 85
    .line 86
    add-int/lit8 v3, v0, 0x9

    .line 87
    .line 88
    aget-byte v4, v2, v4

    .line 89
    .line 90
    if-gez v4, :cond_5

    .line 91
    .line 92
    add-int/lit8 v0, v0, 0xa

    .line 93
    .line 94
    aget-byte v2, v2, v3

    .line 95
    .line 96
    if-ltz v2, :cond_4

    .line 97
    .line 98
    move v3, v1

    .line 99
    move v1, v0

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->malformedVarint()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    throw p0

    .line 106
    :cond_5
    move v6, v3

    .line 107
    move v3, v1

    .line 108
    move v1, v6

    .line 109
    goto :goto_1

    .line 110
    :cond_6
    move v3, v1

    .line 111
    goto :goto_0

    .line 112
    :goto_1
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 113
    .line 114
    return v3
.end method

.method public final 飘花落叶言子世哲兰楪苏()J
    .locals 9

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 4
    .line 5
    sub-int/2addr v1, v0

    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    if-lt v1, v2, :cond_0

    .line 9
    .line 10
    add-int/lit8 v1, v0, 0x8

    .line 11
    .line 12
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 13
    .line 14
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 15
    .line 16
    aget-byte v1, p0, v0

    .line 17
    .line 18
    int-to-long v3, v1

    .line 19
    const-wide/16 v5, 0xff

    .line 20
    .line 21
    and-long/2addr v3, v5

    .line 22
    add-int/lit8 v1, v0, 0x1

    .line 23
    .line 24
    aget-byte v1, p0, v1

    .line 25
    .line 26
    int-to-long v7, v1

    .line 27
    and-long/2addr v7, v5

    .line 28
    shl-long v1, v7, v2

    .line 29
    .line 30
    or-long/2addr v1, v3

    .line 31
    add-int/lit8 v3, v0, 0x2

    .line 32
    .line 33
    aget-byte v3, p0, v3

    .line 34
    .line 35
    int-to-long v3, v3

    .line 36
    and-long/2addr v3, v5

    .line 37
    const/16 v7, 0x10

    .line 38
    .line 39
    shl-long/2addr v3, v7

    .line 40
    or-long/2addr v1, v3

    .line 41
    add-int/lit8 v3, v0, 0x3

    .line 42
    .line 43
    aget-byte v3, p0, v3

    .line 44
    .line 45
    int-to-long v3, v3

    .line 46
    and-long/2addr v3, v5

    .line 47
    const/16 v7, 0x18

    .line 48
    .line 49
    shl-long/2addr v3, v7

    .line 50
    or-long/2addr v1, v3

    .line 51
    add-int/lit8 v3, v0, 0x4

    .line 52
    .line 53
    aget-byte v3, p0, v3

    .line 54
    .line 55
    int-to-long v3, v3

    .line 56
    and-long/2addr v3, v5

    .line 57
    const/16 v7, 0x20

    .line 58
    .line 59
    shl-long/2addr v3, v7

    .line 60
    or-long/2addr v1, v3

    .line 61
    add-int/lit8 v3, v0, 0x5

    .line 62
    .line 63
    aget-byte v3, p0, v3

    .line 64
    .line 65
    int-to-long v3, v3

    .line 66
    and-long/2addr v3, v5

    .line 67
    const/16 v7, 0x28

    .line 68
    .line 69
    shl-long/2addr v3, v7

    .line 70
    or-long/2addr v1, v3

    .line 71
    add-int/lit8 v3, v0, 0x6

    .line 72
    .line 73
    aget-byte v3, p0, v3

    .line 74
    .line 75
    int-to-long v3, v3

    .line 76
    and-long/2addr v3, v5

    .line 77
    const/16 v7, 0x30

    .line 78
    .line 79
    shl-long/2addr v3, v7

    .line 80
    or-long/2addr v1, v3

    .line 81
    add-int/lit8 v0, v0, 0x7

    .line 82
    .line 83
    aget-byte p0, p0, v0

    .line 84
    .line 85
    int-to-long v3, p0

    .line 86
    and-long/2addr v3, v5

    .line 87
    const/16 p0, 0x38

    .line 88
    .line 89
    shl-long/2addr v3, p0

    .line 90
    or-long v0, v1, v3

    .line 91
    .line 92
    return-wide v0

    .line 93
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    throw p0
.end method

.method public abstract 飘花落叶言子世哲兰苏楪()I
.end method

.method public final 飘花落叶言子世哲楪苏兰(I)Z
    .locals 5

    .line 1
    and-int/lit8 v0, p1, 0x7

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    if-eq v0, v2, :cond_5

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v0, v3, :cond_4

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    const/4 v4, 0x3

    .line 14
    if-eq v0, v4, :cond_3

    .line 15
    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x5

    .line 19
    if-ne v0, p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子苏楪世兰哲(I)V

    .line 22
    .line 23
    .line 24
    return v2

    .line 25
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidWireType()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    throw p0

    .line 30
    :cond_1
    iget p1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 35
    .line 36
    .line 37
    :cond_2
    return v1

    .line 38
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世哲楪兰苏()V

    .line 39
    .line 40
    .line 41
    ushr-int/2addr p1, v4

    .line 42
    shl-int/2addr p1, v4

    .line 43
    or-int/2addr p1, v3

    .line 44
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 45
    .line 46
    .line 47
    return v2

    .line 48
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰楪苏哲()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子苏楪世兰哲(I)V

    .line 53
    .line 54
    .line 55
    return v2

    .line 56
    :cond_5
    const/16 p1, 0x8

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子苏楪世兰哲(I)V

    .line 59
    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget p1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 63
    .line 64
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 65
    .line 66
    sub-int/2addr p1, v0

    .line 67
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 68
    .line 69
    const/16 v3, 0xa

    .line 70
    .line 71
    if-lt p1, v3, :cond_9

    .line 72
    .line 73
    :goto_0
    if-ge v1, v3, :cond_8

    .line 74
    .line 75
    iget p1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 76
    .line 77
    add-int/lit8 v4, p1, 0x1

    .line 78
    .line 79
    iput v4, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 80
    .line 81
    aget-byte p1, v0, p1

    .line 82
    .line 83
    if-ltz p1, :cond_7

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_8
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->malformedVarint()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    throw p0

    .line 94
    :cond_9
    :goto_1
    if-ge v1, v3, :cond_c

    .line 95
    .line 96
    iget p1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 97
    .line 98
    iget v4, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 99
    .line 100
    if-eq p1, v4, :cond_b

    .line 101
    .line 102
    add-int/lit8 v4, p1, 0x1

    .line 103
    .line 104
    iput v4, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 105
    .line 106
    aget-byte p1, v0, p1

    .line 107
    .line 108
    if-ltz p1, :cond_a

    .line 109
    .line 110
    :goto_2
    return v2

    .line 111
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_b
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    throw p0

    .line 119
    :cond_c
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->malformedVarint()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    throw p0
.end method

.method public final 飘花落叶言子世哲苏兰楪()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 4
    .line 5
    sub-int/2addr v1, v0

    .line 6
    const/4 v2, 0x4

    .line 7
    if-lt v1, v2, :cond_0

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x4

    .line 10
    .line 11
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 12
    .line 13
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 14
    .line 15
    aget-byte v1, p0, v0

    .line 16
    .line 17
    and-int/lit16 v1, v1, 0xff

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    aget-byte v2, p0, v2

    .line 22
    .line 23
    and-int/lit16 v2, v2, 0xff

    .line 24
    .line 25
    shl-int/lit8 v2, v2, 0x8

    .line 26
    .line 27
    or-int/2addr v1, v2

    .line 28
    add-int/lit8 v2, v0, 0x2

    .line 29
    .line 30
    aget-byte v2, p0, v2

    .line 31
    .line 32
    and-int/lit16 v2, v2, 0xff

    .line 33
    .line 34
    shl-int/lit8 v2, v2, 0x10

    .line 35
    .line 36
    or-int/2addr v1, v2

    .line 37
    add-int/lit8 v0, v0, 0x3

    .line 38
    .line 39
    aget-byte p0, p0, v0

    .line 40
    .line 41
    and-int/lit16 p0, p0, 0xff

    .line 42
    .line 43
    shl-int/lit8 p0, p0, 0x18

    .line 44
    .line 45
    or-int/2addr p0, v1

    .line 46
    return p0

    .line 47
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    throw p0
.end method

.method public final 飘花落叶言子世哲苏楪兰(I)[B
    .locals 2

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 4
    .line 5
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    if-gt p1, v0, :cond_0

    .line 9
    .line 10
    add-int/2addr p1, v1

    .line 11
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 12
    .line 13
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 14
    .line 15
    invoke-static {p0, v1, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    if-gtz p1, :cond_2

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    sget-object p0, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世哲苏兰:[B

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->negativeSize()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    throw p0

    .line 32
    :cond_2
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    throw p0
.end method

.method public final 飘花落叶言子世楪兰哲苏()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰楪苏哲()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子世楪兰苏哲()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲兰楪苏()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final 飘花落叶言子世楪哲兰苏()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲苏兰楪()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子世楪苏兰哲()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲兰苏楪()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子世苏兰哲楪()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰哲楪苏()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final 飘花落叶言子世苏兰楪哲()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰楪苏哲()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子世苏哲兰楪()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰楪苏哲()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 16
    .line 17
    ushr-int/lit8 p0, v0, 0x3

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidTag()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    throw p0
.end method

.method public final 飘花落叶言子世苏哲楪兰()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰楪苏哲()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    iget v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 10
    .line 11
    iget v3, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 12
    .line 13
    sub-int/2addr v2, v3

    .line 14
    if-gt v0, v2, :cond_1

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    sget-object v2, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v1, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 24
    .line 25
    invoke-virtual {v1, v3, v2, v0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪世苏兰哲(I[BI)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    iget v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 30
    .line 31
    add-int/2addr v2, v0

    .line 32
    iput v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_1
    if-nez v0, :cond_2

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_2
    if-gtz v0, :cond_3

    .line 39
    .line 40
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->negativeSize()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    throw p0

    .line 45
    :cond_3
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    throw p0
.end method

.method public final 飘花落叶言子世苏楪兰哲()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰楪苏哲()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 8
    .line 9
    iget v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 10
    .line 11
    sub-int/2addr v1, v2

    .line 12
    if-gt v0, v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 17
    .line 18
    sget-object v4, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 19
    .line 20
    invoke-direct {v1, v3, v2, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 21
    .line 22
    .line 23
    iget v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 24
    .line 25
    add-int/2addr v2, v0

    .line 26
    iput v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string p0, ""

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    if-gez v0, :cond_2

    .line 35
    .line 36
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->negativeSize()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    throw p0

    .line 41
    :cond_2
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    throw p0
.end method

.method public final 飘花落叶言子世苏楪哲兰()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰哲楪苏()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲兰苏(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final 飘花落叶言子楪世兰哲苏()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏哲世兰:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

.method public final 飘花落叶言子楪世兰苏哲()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, -0x1

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    sub-int/2addr v0, p0

    .line 15
    return v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(I)V
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidEndTag()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    throw p0
.end method

.method public final 飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    invoke-interface {p2, p0, p3}, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 11
    .line 12
    .line 13
    shl-int/lit8 p1, p1, 0x3

    .line 14
    .line 15
    or-int/lit8 p1, p1, 0x4

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 18
    .line 19
    .line 20
    iget p1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, -0x1

    .line 23
    .line 24
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 25
    .line 26
    return-void
.end method

.method public final 飘花落叶言子楪兰世苏哲()F
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲苏兰楪()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子楪兰哲世苏(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰楪苏哲()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰哲世(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 17
    .line 18
    invoke-interface {p1, p0, p2}, Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 26
    .line 27
    .line 28
    iget p2, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 29
    .line 30
    add-int/lit8 p2, p2, -0x1

    .line 31
    .line 32
    iput p2, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰世哲(I)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    throw p0
.end method

.method public final 飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰楪苏哲()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰哲世(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 17
    .line 18
    invoke-interface {p1, p0, p2}, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 26
    .line 27
    add-int/lit8 p1, p1, -0x1

    .line 28
    .line 29
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰世哲(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    throw p0
.end method

.method public final 飘花落叶言子楪兰苏世哲()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲兰苏楪()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪兰苏哲世()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰哲楪苏()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final 飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰楪苏哲()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    iget v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 9
    .line 10
    iget v3, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 11
    .line 12
    sub-int/2addr v2, v3

    .line 13
    if-gt v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:[B

    .line 16
    .line 17
    invoke-static {v2, v3, v0, v1}, Lcom/google/protobuf/ByteString;->copyFrom([BIIZ)Lcom/google/protobuf/ByteString;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 22
    .line 23
    add-int/2addr v2, v0

    .line 24
    iput v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_0
    if-nez v0, :cond_1

    .line 28
    .line 29
    sget-object p0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲苏楪兰(I)[B

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0, v1}, Lcom/google/protobuf/ByteString;->wrap([BZ)Lcom/google/protobuf/ByteString;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世苏兰()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰哲楪苏()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long p0, v0, v2

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final 飘花落叶言子楪哲兰世苏()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲苏兰楪()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪哲兰苏世()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲兰楪苏()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final 飘花落叶言子楪哲苏世兰()D
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲兰楪苏()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final 飘花落叶言子楪哲苏兰世()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲兰苏楪()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 4
    .line 5
    if-ne v0, p0, :cond_0

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

.method public final 飘花落叶言子楪苏兰世哲(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子苏楪世哲兰()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世(I)I
    .locals 1

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/2addr v0, p1

    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    iget p1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 11
    .line 12
    if-gt v0, p1, :cond_0

    .line 13
    .line 14
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子苏楪世哲兰()V

    .line 17
    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    throw p0

    .line 25
    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->sizeLimitExceeded()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    throw p0

    .line 30
    :cond_2
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->negativeSize()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    throw p0
.end method

.method public final 飘花落叶言子苏楪世兰哲(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 4
    .line 5
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    if-gt p1, v0, :cond_0

    .line 9
    .line 10
    add-int/2addr v1, p1

    .line 11
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:I

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    if-gez p1, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->negativeSize()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    throw p0

    .line 21
    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    throw p0
.end method

.method public final 飘花落叶言子苏楪世哲兰()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 7
    .line 8
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏哲世兰:I

    .line 9
    .line 10
    sub-int v1, v0, v1

    .line 11
    .line 12
    iget v2, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 13
    .line 14
    if-le v1, v2, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:I

    .line 18
    .line 19
    sub-int/2addr v0, v1

    .line 20
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:I

    .line 25
    .line 26
    return-void
.end method
