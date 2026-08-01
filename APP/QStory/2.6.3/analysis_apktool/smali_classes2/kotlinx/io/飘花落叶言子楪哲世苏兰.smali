.class public abstract Lkotlinx/io/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static 飘花落叶言子楪世兰哲苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;B)J
    .locals 20

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-wide/16 v5, 0x0

    .line 7
    .line 8
    :goto_0
    const-wide v3, 0x7fffffffffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long v7, v5, v3

    .line 14
    .line 15
    if-gez v7, :cond_f

    .line 16
    .line 17
    const-wide/16 v7, 0x1

    .line 18
    .line 19
    add-long/2addr v7, v5

    .line 20
    move-object/from16 v11, p0

    .line 21
    .line 22
    invoke-interface {v11, v7, v8}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(J)Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    if-eqz v7, :cond_f

    .line 27
    .line 28
    invoke-interface {v11}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 29
    .line 30
    .line 31
    move-result-object v12

    .line 32
    invoke-interface {v11}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    iget-wide v7, v7, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 37
    .line 38
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-wide v7, v12, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 46
    .line 47
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    iget-wide v3, v12, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 52
    .line 53
    invoke-static/range {v3 .. v8}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(JJJ)V

    .line 54
    .line 55
    .line 56
    cmp-long v3, v5, v7

    .line 57
    .line 58
    if-nez v3, :cond_0

    .line 59
    .line 60
    :goto_1
    const-wide/16 v13, -0x1

    .line 61
    .line 62
    const-wide/16 v16, 0x0

    .line 63
    .line 64
    const-wide/16 v18, -0x1

    .line 65
    .line 66
    goto/16 :goto_6

    .line 67
    .line 68
    :cond_0
    iget-object v3, v12, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 69
    .line 70
    if-nez v3, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    iget-wide v13, v12, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 74
    .line 75
    sub-long v15, v13, v5

    .line 76
    .line 77
    cmp-long v4, v15, v5

    .line 78
    .line 79
    const-string v15, "Check failed."

    .line 80
    .line 81
    const-wide/16 v16, 0x0

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    if-gez v4, :cond_9

    .line 85
    .line 86
    iget-object v3, v12, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 87
    .line 88
    :goto_2
    if-eqz v3, :cond_2

    .line 89
    .line 90
    cmp-long v4, v13, v5

    .line 91
    .line 92
    if-lez v4, :cond_2

    .line 93
    .line 94
    iget v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 95
    .line 96
    iget v12, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 97
    .line 98
    sub-int/2addr v4, v12

    .line 99
    const-wide/16 v18, -0x1

    .line 100
    .line 101
    int-to-long v9, v4

    .line 102
    sub-long/2addr v13, v9

    .line 103
    cmp-long v4, v13, v5

    .line 104
    .line 105
    if-lez v4, :cond_3

    .line 106
    .line 107
    iget-object v3, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_2
    const-wide/16 v18, -0x1

    .line 111
    .line 112
    :cond_3
    cmp-long v4, v13, v18

    .line 113
    .line 114
    if-nez v4, :cond_5

    .line 115
    .line 116
    :cond_4
    :goto_3
    move-wide/from16 v13, v18

    .line 117
    .line 118
    goto/16 :goto_6

    .line 119
    .line 120
    :cond_5
    :goto_4
    cmp-long v4, v7, v13

    .line 121
    .line 122
    if-lez v4, :cond_8

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sub-long v9, v5, v13

    .line 128
    .line 129
    long-to-int v4, v9

    .line 130
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    invoke-virtual {v3}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    sub-long v1, v7, v13

    .line 139
    .line 140
    long-to-int v1, v1

    .line 141
    invoke-static {v9, v1}, Ljava/lang/Math;->min(II)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-static {v3, v0, v4, v1}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/io/飘花落叶言子楪苏世兰哲;BII)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    const/4 v10, -0x1

    .line 150
    if-eq v1, v10, :cond_6

    .line 151
    .line 152
    int-to-long v1, v1

    .line 153
    add-long/2addr v13, v1

    .line 154
    goto :goto_6

    .line 155
    :cond_6
    invoke-virtual {v3}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    int-to-long v1, v1

    .line 160
    add-long/2addr v13, v1

    .line 161
    iget-object v3, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 162
    .line 163
    if-eqz v3, :cond_4

    .line 164
    .line 165
    cmp-long v1, v13, v7

    .line 166
    .line 167
    if-ltz v1, :cond_7

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_7
    const/4 v2, 0x0

    .line 171
    goto :goto_4

    .line 172
    :cond_8
    invoke-static {v15}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-wide v16

    .line 176
    :cond_9
    const-wide/16 v18, -0x1

    .line 177
    .line 178
    move-wide/from16 v1, v16

    .line 179
    .line 180
    :goto_5
    if-eqz v3, :cond_a

    .line 181
    .line 182
    iget v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 183
    .line 184
    iget v9, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 185
    .line 186
    sub-int/2addr v4, v9

    .line 187
    int-to-long v13, v4

    .line 188
    add-long/2addr v13, v1

    .line 189
    cmp-long v4, v13, v5

    .line 190
    .line 191
    if-gtz v4, :cond_a

    .line 192
    .line 193
    iget-object v3, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 194
    .line 195
    move-wide v1, v13

    .line 196
    goto :goto_5

    .line 197
    :cond_a
    cmp-long v4, v1, v18

    .line 198
    .line 199
    if-nez v4, :cond_b

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_b
    cmp-long v4, v7, v1

    .line 203
    .line 204
    if-lez v4, :cond_e

    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    sub-long v13, v5, v1

    .line 210
    .line 211
    long-to-int v4, v13

    .line 212
    const/4 v12, 0x0

    .line 213
    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    invoke-virtual {v3}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 218
    .line 219
    .line 220
    move-result v9

    .line 221
    sub-long v13, v7, v1

    .line 222
    .line 223
    long-to-int v13, v13

    .line 224
    invoke-static {v9, v13}, Ljava/lang/Math;->min(II)I

    .line 225
    .line 226
    .line 227
    move-result v9

    .line 228
    invoke-static {v3, v0, v4, v9}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/io/飘花落叶言子楪苏世兰哲;BII)I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    const/4 v10, -0x1

    .line 233
    if-eq v4, v10, :cond_c

    .line 234
    .line 235
    int-to-long v3, v4

    .line 236
    add-long v13, v1, v3

    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_c
    invoke-virtual {v3}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    int-to-long v13, v4

    .line 244
    add-long/2addr v1, v13

    .line 245
    iget-object v3, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 246
    .line 247
    if-eqz v3, :cond_4

    .line 248
    .line 249
    cmp-long v4, v1, v7

    .line 250
    .line 251
    if-ltz v4, :cond_b

    .line 252
    .line 253
    goto/16 :goto_3

    .line 254
    .line 255
    :goto_6
    cmp-long v1, v13, v18

    .line 256
    .line 257
    if-eqz v1, :cond_d

    .line 258
    .line 259
    return-wide v13

    .line 260
    :cond_d
    invoke-interface {v11}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    iget-wide v5, v1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :cond_e
    invoke-static {v15}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-wide v16

    .line 272
    :cond_f
    const-wide/16 v18, -0x1

    .line 273
    .line 274
    return-wide v18
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Lkotlinx/io/飘花落叶言子楪苏世兰哲;BII)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p2, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge p2, v1, :cond_3

    .line 9
    .line 10
    if-gt p2, p3, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-gt p3, v1, :cond_2

    .line 17
    .line 18
    iget v0, p0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 21
    .line 22
    :goto_0
    if-ge p2, p3, :cond_1

    .line 23
    .line 24
    add-int v1, v0, p2

    .line 25
    .line 26
    aget-byte v1, p0, v1

    .line 27
    .line 28
    if-ne v1, p1, :cond_0

    .line 29
    .line 30
    return p2

    .line 31
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p0, -0x1

    .line 35
    return p0

    .line 36
    :cond_2
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return v0

    .line 44
    :cond_3
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return v0
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)Ljava/lang/String;
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    int-to-long v1, v1

    .line 19
    cmp-long v1, v1, p1

    .line 20
    .line 21
    if-ltz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 24
    .line 25
    iget v2, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 26
    .line 27
    iget v0, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 28
    .line 29
    long-to-int v3, p1

    .line 30
    add-int/2addr v3, v2

    .line 31
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v2, v1, v0}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(I[BI)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, p1, p2}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->skip(J)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_1
    long-to-int p1, p1

    .line 44
    invoke-static {p0, p1}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const/4 p1, 0x0

    .line 49
    array-length p2, p0

    .line 50
    invoke-static {p1, p0, p2}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(I[BI)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_2
    const-string p0, "Unreacheable"

    .line 56
    .line 57
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method

.method public static final 飘花落叶言子楪世哲苏兰(JJJ)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p2, v0

    .line 4
    .line 5
    if-ltz v2, :cond_0

    .line 6
    .line 7
    cmp-long v2, p2, p0

    .line 8
    .line 9
    if-gtz v2, :cond_0

    .line 10
    .line 11
    sub-long v2, p0, p2

    .line 12
    .line 13
    cmp-long v2, v2, p4

    .line 14
    .line 15
    if-ltz v2, :cond_0

    .line 16
    .line 17
    cmp-long v0, p4, v0

    .line 18
    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "offset ("

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p2, ") and byteCount ("

    .line 35
    .line 36
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p2, ") are not within the range [0..size("

    .line 43
    .line 44
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, "))"

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(JJJ)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p2, v0

    .line 4
    .line 5
    const-string v1, "startIndex ("

    .line 6
    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    cmp-long v0, p4, p0

    .line 10
    .line 11
    if-gtz v0, :cond_1

    .line 12
    .line 13
    cmp-long p0, p2, p4

    .line 14
    .line 15
    if-gtz p0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    new-instance p1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p2, ") > endIndex ("

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x29

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 50
    .line 51
    new-instance v2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p2, ") and endIndex ("

    .line 60
    .line 61
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p2, ") are not within the range [0..size("

    .line 68
    .line 69
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p0, "))"

    .line 76
    .line 77
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)Lkotlinx/io/飘花落叶言子楪苏兰哲世;
    .locals 2

    .line 1
    instance-of v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lkotlinx/io/SourcesJvmKt$asInputStream$isClosed$1;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lkotlinx/io/SourcesJvmKt$asInputStream$isClosed$1;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    instance-of v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Landroidx/window/area/飘花落叶言子楪世兰哲苏;

    .line 16
    .line 17
    const/16 v1, 0x11

    .line 18
    .line 19
    invoke-direct {v0, v1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, Lkotlinx/io/飘花落叶言子楪苏兰哲世;

    .line 23
    .line 24
    invoke-direct {v1, v0, p0}, Lkotlinx/io/飘花落叶言子楪苏兰哲世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Lkotlinx/io/飘花落叶言子楪苏兰世哲;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲世兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;[BII)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    array-length v0, p1

    .line 8
    int-to-long v1, v0

    .line 9
    int-to-long v3, p2

    .line 10
    int-to-long v5, p3

    .line 11
    invoke-static/range {v1 .. v6}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(JJJ)V

    .line 12
    .line 13
    .line 14
    move v0, p2

    .line 15
    :goto_0
    if-ge v0, p3, :cond_1

    .line 16
    .line 17
    invoke-interface {p0, v0, p1, p3}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子苏楪世兰哲(I[BI)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq v1, v2, :cond_0

    .line 23
    .line 24
    add-int/2addr v0, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 27
    .line 28
    sub-int/2addr p3, p2

    .line 29
    new-instance p1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string p2, "Source exhausted before reading "

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p2, " bytes. Only "

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p2, " bytes were read."

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_1
    return-void
.end method

.method public static final 飘花落叶言子楪哲世苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, p1, p2}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(J)V

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0, p1, p2}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲苏世兰(Lkotlinx/io/飘花落叶言子楪世苏哲兰;Ljava/nio/ByteBuffer;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    :cond_0
    :goto_0
    if-lez v0, :cond_4

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, v2, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 16
    .line 17
    iget v4, v2, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 18
    .line 19
    array-length v5, v3

    .line 20
    sub-int/2addr v5, v4

    .line 21
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {p1, v3, v4, v5}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    sub-int/2addr v0, v5

    .line 29
    if-ne v5, v1, :cond_1

    .line 30
    .line 31
    iget v1, v2, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 32
    .line 33
    add-int/2addr v1, v5

    .line 34
    iput v1, v2, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 35
    .line 36
    iget-wide v1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 37
    .line 38
    int-to-long v3, v5

    .line 39
    add-long/2addr v1, v3

    .line 40
    iput-wide v1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    if-ltz v5, :cond_3

    .line 44
    .line 45
    invoke-virtual {v2}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-gt v5, v1, :cond_3

    .line 50
    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    iget v1, v2, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 54
    .line 55
    add-int/2addr v1, v5

    .line 56
    iput v1, v2, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 57
    .line 58
    iget-wide v1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 59
    .line 60
    int-to-long v3, v5

    .line 61
    add-long/2addr v1, v3

    .line 62
    iput-wide v1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static {v2}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    const-string p0, "Invalid number of bytes written: "

    .line 76
    .line 77
    const-string p1, ". Should be in 0.."

    .line 78
    .line 79
    invoke-static {v5, p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v2}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-static {p0, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;I)V

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void
.end method

.method public static final 飘花落叶言子楪哲苏兰世(Lkotlinx/io/飘花落叶言子楪苏哲兰世;Ljava/lang/String;II)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-long v1, v0

    .line 12
    int-to-long v3, p2

    .line 13
    int-to-long v5, p3

    .line 14
    invoke-static/range {v1 .. v6}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(JJJ)V

    .line 15
    .line 16
    .line 17
    check-cast p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    :cond_0
    :goto_0
    if-ge p2, p3, :cond_b

    .line 20
    .line 21
    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 22
    .line 23
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iput v1, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 31
    .line 32
    const/16 v2, 0x80

    .line 33
    .line 34
    if-ge v1, v2, :cond_5

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {p0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 42
    .line 43
    neg-int v5, p2

    .line 44
    invoke-virtual {v3}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    add-int/2addr v6, p2

    .line 49
    invoke-static {p3, v6}, Ljava/lang/Math;->min(II)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    add-int/lit8 v7, p2, 0x1

    .line 54
    .line 55
    add-int/2addr p2, v5

    .line 56
    iget v8, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 57
    .line 58
    int-to-byte v8, v8

    .line 59
    iget v9, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 60
    .line 61
    add-int/2addr v9, p2

    .line 62
    aput-byte v8, v4, v9

    .line 63
    .line 64
    move p2, v7

    .line 65
    :goto_1
    if-ge p2, v6, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    iput v7, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 72
    .line 73
    if-ge v7, v2, :cond_1

    .line 74
    .line 75
    add-int/lit8 v8, p2, 0x1

    .line 76
    .line 77
    add-int/2addr p2, v5

    .line 78
    int-to-byte v7, v7

    .line 79
    iget v9, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 80
    .line 81
    add-int/2addr v9, p2

    .line 82
    aput-byte v7, v4, v9

    .line 83
    .line 84
    move p2, v8

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    add-int/2addr v5, p2

    .line 87
    if-ne v5, v1, :cond_2

    .line 88
    .line 89
    iget v0, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 90
    .line 91
    add-int/2addr v0, v5

    .line 92
    iput v0, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 93
    .line 94
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 95
    .line 96
    int-to-long v2, v5

    .line 97
    add-long/2addr v0, v2

    .line 98
    iput-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    if-ltz v5, :cond_4

    .line 102
    .line 103
    invoke-virtual {v3}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-gt v5, v0, :cond_4

    .line 108
    .line 109
    if-eqz v5, :cond_3

    .line 110
    .line 111
    iget v0, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 112
    .line 113
    add-int/2addr v0, v5

    .line 114
    iput v0, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 115
    .line 116
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 117
    .line 118
    int-to-long v2, v5

    .line 119
    add-long/2addr v0, v2

    .line 120
    iput-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    invoke-static {v3}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_0

    .line 128
    .line 129
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_4
    const-string p0, "Invalid number of bytes written: "

    .line 134
    .line 135
    const-string p1, ". Should be in 0.."

    .line 136
    .line 137
    invoke-static {v5, p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {v3}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-static {p0, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;I)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_5
    const/16 v3, 0x800

    .line 150
    .line 151
    const/16 v4, 0x3f

    .line 152
    .line 153
    if-ge v1, v3, :cond_6

    .line 154
    .line 155
    const/4 v1, 0x2

    .line 156
    invoke-virtual {p0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 161
    .line 162
    shr-int/lit8 v5, v0, 0x6

    .line 163
    .line 164
    or-int/lit16 v5, v5, 0xc0

    .line 165
    .line 166
    int-to-byte v5, v5

    .line 167
    and-int/2addr v0, v4

    .line 168
    or-int/2addr v0, v2

    .line 169
    int-to-byte v0, v0

    .line 170
    iget-object v2, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 171
    .line 172
    iget v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 173
    .line 174
    aput-byte v5, v2, v4

    .line 175
    .line 176
    add-int/lit8 v5, v4, 0x1

    .line 177
    .line 178
    aput-byte v0, v2, v5

    .line 179
    .line 180
    add-int/2addr v4, v1

    .line 181
    iput v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 182
    .line 183
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 184
    .line 185
    const-wide/16 v2, 0x2

    .line 186
    .line 187
    :goto_2
    add-long/2addr v0, v2

    .line 188
    iput-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 189
    .line 190
    add-int/lit8 p2, p2, 0x1

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_6
    const v3, 0xd800

    .line 195
    .line 196
    .line 197
    if-lt v1, v3, :cond_a

    .line 198
    .line 199
    const v3, 0xdfff

    .line 200
    .line 201
    .line 202
    if-le v1, v3, :cond_7

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_7
    add-int/lit8 v1, p2, 0x1

    .line 206
    .line 207
    if-ge v1, p3, :cond_8

    .line 208
    .line 209
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    goto :goto_3

    .line 214
    :cond_8
    const/4 v3, 0x0

    .line 215
    :goto_3
    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 216
    .line 217
    const v5, 0xdbff

    .line 218
    .line 219
    .line 220
    if-gt v0, v5, :cond_9

    .line 221
    .line 222
    const v5, 0xdc00

    .line 223
    .line 224
    .line 225
    if-gt v5, v3, :cond_9

    .line 226
    .line 227
    const v5, 0xe000

    .line 228
    .line 229
    .line 230
    if-ge v3, v5, :cond_9

    .line 231
    .line 232
    and-int/lit16 v0, v0, 0x3ff

    .line 233
    .line 234
    shl-int/lit8 v0, v0, 0xa

    .line 235
    .line 236
    and-int/lit16 v1, v3, 0x3ff

    .line 237
    .line 238
    or-int/2addr v0, v1

    .line 239
    const/high16 v1, 0x10000

    .line 240
    .line 241
    add-int/2addr v0, v1

    .line 242
    const/4 v1, 0x4

    .line 243
    invoke-virtual {p0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    shr-int/lit8 v5, v0, 0x12

    .line 248
    .line 249
    or-int/lit16 v5, v5, 0xf0

    .line 250
    .line 251
    int-to-byte v5, v5

    .line 252
    shr-int/lit8 v6, v0, 0xc

    .line 253
    .line 254
    and-int/2addr v6, v4

    .line 255
    or-int/2addr v6, v2

    .line 256
    int-to-byte v6, v6

    .line 257
    shr-int/lit8 v7, v0, 0x6

    .line 258
    .line 259
    and-int/2addr v7, v4

    .line 260
    or-int/2addr v7, v2

    .line 261
    int-to-byte v7, v7

    .line 262
    and-int/2addr v0, v4

    .line 263
    or-int/2addr v0, v2

    .line 264
    int-to-byte v0, v0

    .line 265
    iget-object v2, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 266
    .line 267
    iget v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 268
    .line 269
    aput-byte v5, v2, v4

    .line 270
    .line 271
    add-int/lit8 v5, v4, 0x1

    .line 272
    .line 273
    aput-byte v6, v2, v5

    .line 274
    .line 275
    add-int/lit8 v5, v4, 0x2

    .line 276
    .line 277
    aput-byte v7, v2, v5

    .line 278
    .line 279
    add-int/lit8 v5, v4, 0x3

    .line 280
    .line 281
    aput-byte v0, v2, v5

    .line 282
    .line 283
    add-int/2addr v4, v1

    .line 284
    iput v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 285
    .line 286
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 287
    .line 288
    const-wide/16 v2, 0x4

    .line 289
    .line 290
    add-long/2addr v0, v2

    .line 291
    iput-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 292
    .line 293
    add-int/lit8 p2, p2, 0x2

    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :cond_9
    invoke-virtual {p0, v4}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(B)V

    .line 298
    .line 299
    .line 300
    move p2, v1

    .line 301
    goto/16 :goto_0

    .line 302
    .line 303
    :cond_a
    :goto_4
    const/4 v1, 0x3

    .line 304
    invoke-virtual {p0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 309
    .line 310
    shr-int/lit8 v5, v0, 0xc

    .line 311
    .line 312
    or-int/lit16 v5, v5, 0xe0

    .line 313
    .line 314
    int-to-byte v5, v5

    .line 315
    shr-int/lit8 v6, v0, 0x6

    .line 316
    .line 317
    and-int/2addr v6, v4

    .line 318
    or-int/2addr v6, v2

    .line 319
    int-to-byte v6, v6

    .line 320
    and-int/2addr v0, v4

    .line 321
    or-int/2addr v0, v2

    .line 322
    int-to-byte v0, v0

    .line 323
    iget-object v2, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 324
    .line 325
    iget v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 326
    .line 327
    aput-byte v5, v2, v4

    .line 328
    .line 329
    add-int/lit8 v5, v4, 0x1

    .line 330
    .line 331
    aput-byte v6, v2, v5

    .line 332
    .line 333
    add-int/lit8 v5, v4, 0x2

    .line 334
    .line 335
    aput-byte v0, v2, v5

    .line 336
    .line 337
    add-int/2addr v4, v1

    .line 338
    iput v4, v3, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 339
    .line 340
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 341
    .line 342
    const-wide/16 v2, 0x3

    .line 343
    .line 344
    goto/16 :goto_2

    .line 345
    .line 346
    :cond_b
    return-void
.end method

.method public static final 飘花落叶言子楪苏世兰哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;Ljava/nio/ByteBuffer;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v0, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-wide/16 v0, 0x2000

    .line 20
    .line 21
    invoke-interface {p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(J)Z

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-wide v0, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 29
    .line 30
    cmp-long v0, v0, v2

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    :goto_0
    const/4 p0, -0x1

    .line 49
    return p0

    .line 50
    :cond_1
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v2, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 63
    .line 64
    iget v3, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 65
    .line 66
    iget v4, v0, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    sub-int/2addr v4, v3

    .line 73
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-virtual {p1, v2, v3, v4}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    if-ltz v4, :cond_3

    .line 83
    .line 84
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-gt v4, p1, :cond_2

    .line 89
    .line 90
    int-to-long v0, v4

    .line 91
    invoke-virtual {p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->skip(J)V

    .line 92
    .line 93
    .line 94
    return v4

    .line 95
    :cond_2
    const-string p0, "Returned too many bytes"

    .line 96
    .line 97
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return v1

    .line 101
    :cond_3
    const-string p0, "Returned negative read bytes count"

    .line 102
    .line 103
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return v1

    .line 107
    :cond_4
    return v4

    .line 108
    :cond_5
    const-string p0, "Buffer is empty"

    .line 109
    .line 110
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return v1
.end method

.method public static final 飘花落叶言子楪苏世哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static final 飘花落叶言子楪苏兰世哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_2

    .line 3
    .line 4
    const-wide/32 v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    move-wide v2, v0

    .line 8
    :goto_0
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-wide v4, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 13
    .line 14
    cmp-long p1, v4, v0

    .line 15
    .line 16
    if-gez p1, :cond_0

    .line 17
    .line 18
    invoke-interface {p0, v2, v3}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(J)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const-wide/16 v4, 0x2

    .line 25
    .line 26
    mul-long/2addr v2, v4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-wide v2, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 33
    .line 34
    cmp-long p1, v2, v0

    .line 35
    .line 36
    if-gez p1, :cond_1

    .line 37
    .line 38
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-wide v0, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 43
    .line 44
    long-to-int p1, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iget-wide p0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, "Can\'t create an array of size "

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_2
    int-to-long v0, p1

    .line 77
    invoke-interface {p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(J)V

    .line 78
    .line 79
    .line 80
    :goto_1
    new-array v0, p1, [B

    .line 81
    .line 82
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-static {p0, v0, v1, p1}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;[BII)V

    .line 88
    .line 89
    .line 90
    return-object v0
.end method

.method public static final 飘花落叶言子楪苏兰哲世(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide v0, 0x7fffffffffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(J)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-wide v1, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏哲世兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)[B
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    invoke-static {p0, v0}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏哲兰世(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    int-to-long v0, p1

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-ltz v2, :cond_0

    .line 10
    .line 11
    invoke-static {p0, p1}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "byteCount ("

    .line 17
    .line 18
    const-string p1, ") < 0"

    .line 19
    .line 20
    invoke-static {p0, v0, v1, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;JLjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method
