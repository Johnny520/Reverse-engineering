.class public final Lta;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:I

.field public final b:Ljava/io/FileOutputStream;

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:[B

.field public final f:[B

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:J

.field public l:J

.field public m:J

.field public n:I

.field public o:Z

.field public final p:[S

.field public q:J

.field public r:I

.field public s:I

.field public t:D

.field public u:S

.field public v:S


# direct methods
.method public constructor <init>(ILjava/io/FileOutputStream;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2000

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Lta;->e:[B

    .line 9
    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    iput-object v0, p0, Lta;->f:[B

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    iput v0, p0, Lta;->i:I

    .line 18
    .line 19
    const/16 v0, 0x80

    .line 20
    .line 21
    new-array v0, v0, [S

    .line 22
    .line 23
    iput-object v0, p0, Lta;->p:[S

    .line 24
    .line 25
    if-gtz p1, :cond_0

    .line 26
    .line 27
    const/16 p1, 0x1f40

    .line 28
    .line 29
    :cond_0
    iput p1, p0, Lta;->a:I

    .line 30
    .line 31
    iput-object p2, p0, Lta;->b:Ljava/io/FileOutputStream;

    .line 32
    .line 33
    const-wide/16 p1, 0x0

    .line 34
    .line 35
    cmp-long p1, p3, p1

    .line 36
    .line 37
    if-gtz p1, :cond_1

    .line 38
    .line 39
    const-wide p3, 0x7fffffffffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    :cond_1
    iput-wide p3, p0, Lta;->c:J

    .line 45
    .line 46
    const-string p1, "not enough storage for decoded audio"

    .line 47
    .line 48
    iput-object p1, p0, Lta;->d:Ljava/lang/String;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;III)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-wide/16 v5, 0x0

    .line 11
    .line 12
    move v7, v4

    .line 13
    move v8, v7

    .line 14
    :goto_0
    const-wide v9, 0x40dfffc000000000L    # 32767.0

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    const/4 v11, 0x1

    .line 20
    const/4 v12, 0x4

    .line 21
    if-ge v7, v1, :cond_a

    .line 22
    .line 23
    if-ne v3, v12, :cond_4

    .line 24
    .line 25
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    and-int/lit16 v11, v11, 0xff

    .line 30
    .line 31
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 32
    .line 33
    .line 34
    move-result v13

    .line 35
    and-int/lit16 v13, v13, 0xff

    .line 36
    .line 37
    shl-int/lit8 v13, v13, 0x8

    .line 38
    .line 39
    or-int/2addr v11, v13

    .line 40
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    and-int/lit16 v13, v13, 0xff

    .line 45
    .line 46
    shl-int/lit8 v13, v13, 0x10

    .line 47
    .line 48
    or-int/2addr v11, v13

    .line 49
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 50
    .line 51
    .line 52
    move-result v13

    .line 53
    and-int/lit16 v13, v13, 0xff

    .line 54
    .line 55
    shl-int/lit8 v13, v13, 0x18

    .line 56
    .line 57
    or-int/2addr v11, v13

    .line 58
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    invoke-static {v11}, Ljava/lang/Float;->isNaN(F)Z

    .line 63
    .line 64
    .line 65
    move-result v13

    .line 66
    if-nez v13, :cond_0

    .line 67
    .line 68
    invoke-static {v11}, Ljava/lang/Float;->isInfinite(F)Z

    .line 69
    .line 70
    .line 71
    move-result v13

    .line 72
    if-eqz v13, :cond_1

    .line 73
    .line 74
    :cond_0
    const/4 v11, 0x0

    .line 75
    :cond_1
    const/high16 v13, 0x3f800000    # 1.0f

    .line 76
    .line 77
    cmpl-float v14, v11, v13

    .line 78
    .line 79
    if-lez v14, :cond_2

    .line 80
    .line 81
    move v11, v13

    .line 82
    :cond_2
    const/high16 v13, -0x40800000    # -1.0f

    .line 83
    .line 84
    cmpg-float v14, v11, v13

    .line 85
    .line 86
    if-gez v14, :cond_3

    .line 87
    .line 88
    move v11, v13

    .line 89
    :cond_3
    const v13, 0x46fffe00    # 32767.0f

    .line 90
    .line 91
    .line 92
    mul-float/2addr v11, v13

    .line 93
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    goto :goto_1

    .line 98
    :cond_4
    if-ne v2, v11, :cond_5

    .line 99
    .line 100
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    and-int/lit16 v11, v11, 0xff

    .line 105
    .line 106
    add-int/lit8 v11, v11, -0x80

    .line 107
    .line 108
    shl-int/lit8 v11, v11, 0x8

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    const/4 v11, 0x2

    .line 112
    if-ne v2, v11, :cond_6

    .line 113
    .line 114
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    and-int/lit16 v11, v11, 0xff

    .line 119
    .line 120
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    shl-int/lit8 v13, v13, 0x8

    .line 125
    .line 126
    or-int/2addr v11, v13

    .line 127
    int-to-short v11, v11

    .line 128
    goto :goto_1

    .line 129
    :cond_6
    const/4 v11, 0x3

    .line 130
    if-ne v2, v11, :cond_8

    .line 131
    .line 132
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    and-int/lit16 v11, v11, 0xff

    .line 137
    .line 138
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    and-int/lit16 v13, v13, 0xff

    .line 143
    .line 144
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    shl-int/lit8 v13, v13, 0x8

    .line 149
    .line 150
    or-int/2addr v11, v13

    .line 151
    shl-int/lit8 v13, v14, 0x10

    .line 152
    .line 153
    or-int/2addr v11, v13

    .line 154
    const/high16 v13, 0x800000

    .line 155
    .line 156
    and-int/2addr v13, v11

    .line 157
    if-eqz v13, :cond_7

    .line 158
    .line 159
    const/high16 v13, -0x1000000

    .line 160
    .line 161
    or-int/2addr v11, v13

    .line 162
    :cond_7
    shr-int/lit8 v11, v11, 0x8

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    and-int/lit16 v11, v11, 0xff

    .line 170
    .line 171
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    and-int/lit16 v13, v13, 0xff

    .line 176
    .line 177
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    and-int/lit16 v14, v14, 0xff

    .line 182
    .line 183
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 184
    .line 185
    .line 186
    move-result v15

    .line 187
    shl-int/lit8 v13, v13, 0x8

    .line 188
    .line 189
    or-int/2addr v11, v13

    .line 190
    shl-int/lit8 v13, v14, 0x10

    .line 191
    .line 192
    or-int/2addr v11, v13

    .line 193
    shl-int/lit8 v13, v15, 0x18

    .line 194
    .line 195
    or-int/2addr v11, v13

    .line 196
    shr-int/lit8 v11, v11, 0x10

    .line 197
    .line 198
    :goto_1
    if-ne v3, v12, :cond_9

    .line 199
    .line 200
    int-to-double v11, v11

    .line 201
    div-double/2addr v11, v9

    .line 202
    add-double/2addr v11, v5

    .line 203
    move-wide v5, v11

    .line 204
    goto :goto_2

    .line 205
    :cond_9
    add-int/2addr v8, v11

    .line 206
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_a
    if-ne v3, v12, :cond_b

    .line 211
    .line 212
    int-to-double v1, v1

    .line 213
    div-double/2addr v5, v1

    .line 214
    mul-double/2addr v5, v9

    .line 215
    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    .line 216
    .line 217
    .line 218
    move-result-wide v1

    .line 219
    long-to-int v1, v1

    .line 220
    goto :goto_3

    .line 221
    :cond_b
    div-int v1, v8, v1

    .line 222
    .line 223
    :goto_3
    const/16 v2, 0x7fff

    .line 224
    .line 225
    const/16 v3, -0x8000

    .line 226
    .line 227
    if-le v1, v2, :cond_c

    .line 228
    .line 229
    move v1, v2

    .line 230
    goto :goto_4

    .line 231
    :cond_c
    if-ge v1, v3, :cond_d

    .line 232
    .line 233
    move v1, v3

    .line 234
    :cond_d
    :goto_4
    if-le v1, v2, :cond_e

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_e
    if-ge v1, v3, :cond_f

    .line 238
    .line 239
    move v2, v3

    .line 240
    goto :goto_5

    .line 241
    :cond_f
    move v2, v1

    .line 242
    :goto_5
    iget v1, v0, Lta;->g:I

    .line 243
    .line 244
    iget-wide v5, v0, Lta;->k:J

    .line 245
    .line 246
    const-wide/16 v7, 0x1

    .line 247
    .line 248
    iget v3, v0, Lta;->a:I

    .line 249
    .line 250
    if-ne v1, v3, :cond_10

    .line 251
    .line 252
    add-long/2addr v5, v7

    .line 253
    iput-wide v5, v0, Lta;->k:J

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Lta;->d(I)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_10
    const-wide/16 v9, 0x0

    .line 260
    .line 261
    cmp-long v1, v5, v9

    .line 262
    .line 263
    if-nez v1, :cond_11

    .line 264
    .line 265
    int-to-short v1, v2

    .line 266
    iput-short v1, v0, Lta;->u:S

    .line 267
    .line 268
    :cond_11
    int-to-short v1, v2

    .line 269
    iput-short v1, v0, Lta;->v:S

    .line 270
    .line 271
    iget v2, v0, Lta;->s:I

    .line 272
    .line 273
    iget-object v3, v0, Lta;->p:[S

    .line 274
    .line 275
    array-length v5, v3

    .line 276
    if-ne v2, v5, :cond_13

    .line 277
    .line 278
    iget-wide v5, v0, Lta;->q:J

    .line 279
    .line 280
    add-long/2addr v5, v7

    .line 281
    invoke-virtual {v0, v5, v6}, Lta;->b(J)V

    .line 282
    .line 283
    .line 284
    iget v2, v0, Lta;->s:I

    .line 285
    .line 286
    array-length v5, v3

    .line 287
    if-eq v2, v5, :cond_12

    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_12
    const-string v0, "audio resampler buffer overflow"

    .line 291
    .line 292
    invoke-static {v0}, Lu2;->c(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_13
    :goto_6
    iget v2, v0, Lta;->r:I

    .line 297
    .line 298
    iget v5, v0, Lta;->s:I

    .line 299
    .line 300
    add-int/2addr v2, v5

    .line 301
    array-length v6, v3

    .line 302
    rem-int/2addr v2, v6

    .line 303
    aput-short v1, v3, v2

    .line 304
    .line 305
    add-int/2addr v5, v11

    .line 306
    iput v5, v0, Lta;->s:I

    .line 307
    .line 308
    iget-wide v1, v0, Lta;->k:J

    .line 309
    .line 310
    add-long/2addr v1, v7

    .line 311
    iput-wide v1, v0, Lta;->k:J

    .line 312
    .line 313
    :goto_7
    iget-wide v1, v0, Lta;->t:D

    .line 314
    .line 315
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 316
    .line 317
    .line 318
    move-result-wide v1

    .line 319
    double-to-long v1, v1

    .line 320
    const-wide/16 v5, 0x10

    .line 321
    .line 322
    add-long/2addr v1, v5

    .line 323
    iget-wide v5, v0, Lta;->k:J

    .line 324
    .line 325
    cmp-long v1, v1, v5

    .line 326
    .line 327
    if-gez v1, :cond_14

    .line 328
    .line 329
    invoke-virtual {v0, v4}, Lta;->c(Z)V

    .line 330
    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_14
    return-void
.end method

.method public final b(J)V
    .locals 5

    .line 1
    :goto_0
    iget v0, p0, Lta;->s:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p0, Lta;->q:J

    .line 6
    .line 7
    cmp-long v3, v1, p1

    .line 8
    .line 9
    if-gez v3, :cond_0

    .line 10
    .line 11
    iget v3, p0, Lta;->r:I

    .line 12
    .line 13
    add-int/lit8 v3, v3, 0x1

    .line 14
    .line 15
    iget-object v4, p0, Lta;->p:[S

    .line 16
    .line 17
    array-length v4, v4

    .line 18
    rem-int/2addr v3, v4

    .line 19
    iput v3, p0, Lta;->r:I

    .line 20
    .line 21
    const-wide/16 v3, 0x1

    .line 22
    .line 23
    add-long/2addr v1, v3

    .line 24
    iput-wide v1, p0, Lta;->q:J

    .line 25
    .line 26
    add-int/lit8 v0, v0, -0x1

    .line 27
    .line 28
    iput v0, p0, Lta;->s:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lta;->a:I

    .line 6
    .line 7
    int-to-double v2, v2

    .line 8
    iget v4, v0, Lta;->g:I

    .line 9
    .line 10
    int-to-double v4, v4

    .line 11
    div-double v4, v2, v4

    .line 12
    .line 13
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 14
    .line 15
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    const-wide v8, 0x3fef5c28f5c28f5cL    # 0.98

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    mul-double/2addr v4, v8

    .line 25
    iget-wide v8, v0, Lta;->t:D

    .line 26
    .line 27
    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v8

    .line 31
    double-to-long v8, v8

    .line 32
    const/16 v12, -0x10

    .line 33
    .line 34
    move-wide/from16 v17, v6

    .line 35
    .line 36
    const-wide/16 v13, 0x0

    .line 37
    .line 38
    const-wide/16 v15, 0x0

    .line 39
    .line 40
    :goto_0
    const/16 v6, 0x10

    .line 41
    .line 42
    if-gt v12, v6, :cond_2

    .line 43
    .line 44
    int-to-long v6, v12

    .line 45
    add-long/2addr v6, v8

    .line 46
    const-wide/16 v19, 0x0

    .line 47
    .line 48
    long-to-double v10, v6

    .line 49
    move-wide/from16 v21, v2

    .line 50
    .line 51
    iget-wide v2, v0, Lta;->t:D

    .line 52
    .line 53
    sub-double/2addr v10, v2

    .line 54
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(D)D

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    const-wide/high16 v23, 0x4030000000000000L    # 16.0

    .line 59
    .line 60
    div-double v2, v2, v23

    .line 61
    .line 62
    cmpl-double v23, v2, v17

    .line 63
    .line 64
    if-lez v23, :cond_0

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_0
    const-wide v23, 0x400921fb54442d18L    # Math.PI

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    mul-double v25, v2, v23

    .line 73
    .line 74
    invoke-static/range {v25 .. v26}, Ljava/lang/Math;->cos(D)D

    .line 75
    .line 76
    .line 77
    move-result-wide v25

    .line 78
    const-wide/high16 v27, 0x3fe0000000000000L    # 0.5

    .line 79
    .line 80
    mul-double v25, v25, v27

    .line 81
    .line 82
    const-wide v27, 0x3fdae147ae147ae1L    # 0.42

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    add-double v25, v25, v27

    .line 88
    .line 89
    const-wide v27, 0x401921fb54442d18L    # 6.283185307179586

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    mul-double v2, v2, v27

    .line 95
    .line 96
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    const-wide v27, 0x3fb47ae147ae147bL    # 0.08

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    mul-double v2, v2, v27

    .line 106
    .line 107
    add-double v2, v2, v25

    .line 108
    .line 109
    mul-double v23, v23, v4

    .line 110
    .line 111
    mul-double v23, v23, v10

    .line 112
    .line 113
    invoke-static/range {v23 .. v24}, Ljava/lang/Math;->abs(D)D

    .line 114
    .line 115
    .line 116
    move-result-wide v10

    .line 117
    const-wide v25, 0x3d719799812dea11L    # 1.0E-12

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    cmpg-double v10, v10, v25

    .line 123
    .line 124
    if-gez v10, :cond_1

    .line 125
    .line 126
    move-wide/from16 v10, v17

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    invoke-static/range {v23 .. v24}, Ljava/lang/Math;->sin(D)D

    .line 130
    .line 131
    .line 132
    move-result-wide v10

    .line 133
    div-double v10, v10, v23

    .line 134
    .line 135
    :goto_1
    mul-double/2addr v10, v4

    .line 136
    mul-double/2addr v10, v2

    .line 137
    invoke-virtual {v0, v6, v7, v1}, Lta;->f(JZ)I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    int-to-double v2, v2

    .line 142
    mul-double/2addr v2, v10

    .line 143
    add-double/2addr v15, v2

    .line 144
    add-double/2addr v13, v10

    .line 145
    :goto_2
    add-int/lit8 v12, v12, 0x1

    .line 146
    .line 147
    move-wide/from16 v2, v21

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_2
    move-wide/from16 v21, v2

    .line 151
    .line 152
    const-wide/16 v19, 0x0

    .line 153
    .line 154
    cmpl-double v2, v13, v19

    .line 155
    .line 156
    if-nez v2, :cond_3

    .line 157
    .line 158
    invoke-virtual {v0, v8, v9, v1}, Lta;->f(JZ)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    goto :goto_3

    .line 163
    :cond_3
    div-double/2addr v15, v13

    .line 164
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->round(D)J

    .line 165
    .line 166
    .line 167
    move-result-wide v1

    .line 168
    long-to-int v1, v1

    .line 169
    :goto_3
    invoke-virtual {v0, v1}, Lta;->d(I)V

    .line 170
    .line 171
    .line 172
    iget-wide v1, v0, Lta;->t:D

    .line 173
    .line 174
    iget v3, v0, Lta;->g:I

    .line 175
    .line 176
    int-to-double v3, v3

    .line 177
    div-double v3, v3, v21

    .line 178
    .line 179
    add-double/2addr v3, v1

    .line 180
    iput-wide v3, v0, Lta;->t:D

    .line 181
    .line 182
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 183
    .line 184
    .line 185
    move-result-wide v1

    .line 186
    double-to-long v1, v1

    .line 187
    const-wide/16 v3, 0x11

    .line 188
    .line 189
    sub-long/2addr v1, v3

    .line 190
    invoke-virtual {v0, v1, v2}, Lta;->b(J)V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public final d(I)V
    .locals 6

    .line 1
    iget-wide v0, p0, Lta;->m:J

    .line 2
    .line 3
    iget v2, p0, Lta;->n:I

    .line 4
    .line 5
    int-to-long v3, v2

    .line 6
    add-long/2addr v0, v3

    .line 7
    const-wide/16 v3, 0x2

    .line 8
    .line 9
    add-long/2addr v0, v3

    .line 10
    iget-wide v3, p0, Lta;->c:J

    .line 11
    .line 12
    cmp-long v0, v0, v3

    .line 13
    .line 14
    if-gtz v0, :cond_4

    .line 15
    .line 16
    const/16 v0, 0x7fff

    .line 17
    .line 18
    if-le p1, v0, :cond_0

    .line 19
    .line 20
    :goto_0
    move p1, v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/16 v0, -0x8000

    .line 23
    .line 24
    if-ge p1, v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    :goto_1
    add-int/lit8 v0, v2, 0x1

    .line 28
    .line 29
    iput v0, p0, Lta;->n:I

    .line 30
    .line 31
    and-int/lit16 v1, p1, 0xff

    .line 32
    .line 33
    int-to-byte v1, v1

    .line 34
    iget-object v3, p0, Lta;->e:[B

    .line 35
    .line 36
    aput-byte v1, v3, v2

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x2

    .line 39
    .line 40
    iput v2, p0, Lta;->n:I

    .line 41
    .line 42
    shr-int/lit8 p1, p1, 0x8

    .line 43
    .line 44
    and-int/lit16 p1, p1, 0xff

    .line 45
    .line 46
    int-to-byte p1, p1

    .line 47
    aput-byte p1, v3, v0

    .line 48
    .line 49
    iget-wide v0, p0, Lta;->l:J

    .line 50
    .line 51
    const-wide/16 v4, 0x1

    .line 52
    .line 53
    add-long/2addr v0, v4

    .line 54
    iput-wide v0, p0, Lta;->l:J

    .line 55
    .line 56
    array-length p1, v3

    .line 57
    if-ne v2, p1, :cond_3

    .line 58
    .line 59
    if-gtz v2, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    iget-object p1, p0, Lta;->b:Ljava/io/FileOutputStream;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-virtual {p1, v3, v0, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 66
    .line 67
    .line 68
    iget-wide v1, p0, Lta;->m:J

    .line 69
    .line 70
    iget p1, p0, Lta;->n:I

    .line 71
    .line 72
    int-to-long v3, p1

    .line 73
    add-long/2addr v1, v3

    .line 74
    iput-wide v1, p0, Lta;->m:J

    .line 75
    .line 76
    iput v0, p0, Lta;->n:I

    .line 77
    .line 78
    :cond_3
    :goto_2
    return-void

    .line 79
    :cond_4
    iget-object p0, p0, Lta;->d:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final e()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lta;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lta;->o:Z

    .line 8
    .line 9
    iget v1, p0, Lta;->j:I

    .line 10
    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    iget v1, p0, Lta;->g:I

    .line 14
    .line 15
    if-lez v1, :cond_1

    .line 16
    .line 17
    iget-wide v2, p0, Lta;->k:J

    .line 18
    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    cmp-long v4, v2, v4

    .line 22
    .line 23
    if-lez v4, :cond_1

    .line 24
    .line 25
    iget v4, p0, Lta;->a:I

    .line 26
    .line 27
    if-eq v1, v4, :cond_1

    .line 28
    .line 29
    long-to-double v2, v2

    .line 30
    int-to-double v4, v4

    .line 31
    mul-double/2addr v2, v4

    .line 32
    int-to-double v4, v1

    .line 33
    div-double/2addr v2, v4

    .line 34
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    const-wide/16 v3, 0x1

    .line 39
    .line 40
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    :goto_0
    iget-wide v3, p0, Lta;->l:J

    .line 45
    .line 46
    cmp-long v3, v3, v1

    .line 47
    .line 48
    if-gez v3, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lta;->c(Z)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget v0, p0, Lta;->n:I

    .line 55
    .line 56
    if-gtz v0, :cond_2

    .line 57
    .line 58
    :goto_1
    return-void

    .line 59
    :cond_2
    iget-object v1, p0, Lta;->b:Ljava/io/FileOutputStream;

    .line 60
    .line 61
    iget-object v2, p0, Lta;->e:[B

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-virtual {v1, v2, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 65
    .line 66
    .line 67
    iget-wide v0, p0, Lta;->m:J

    .line 68
    .line 69
    iget v2, p0, Lta;->n:I

    .line 70
    .line 71
    int-to-long v4, v2

    .line 72
    add-long/2addr v0, v4

    .line 73
    iput-wide v0, p0, Lta;->m:J

    .line 74
    .line 75
    iput v3, p0, Lta;->n:I

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    const-string p0, "audio decode incomplete pcm frame"

    .line 79
    .line 80
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final f(JZ)I
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    iget-short p0, p0, Lta;->u:S

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    iget-wide v2, p0, Lta;->k:J

    .line 11
    .line 12
    cmp-long v2, p1, v2

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-ltz v2, :cond_2

    .line 16
    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    iget-short p0, p0, Lta;->v:S

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const-string p0, "audio resampler read ahead"

    .line 23
    .line 24
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return v3

    .line 28
    :cond_2
    iget-wide v4, p0, Lta;->q:J

    .line 29
    .line 30
    sub-long/2addr p1, v4

    .line 31
    cmp-long p3, p1, v0

    .line 32
    .line 33
    if-ltz p3, :cond_3

    .line 34
    .line 35
    iget p3, p0, Lta;->s:I

    .line 36
    .line 37
    int-to-long v0, p3

    .line 38
    cmp-long p3, p1, v0

    .line 39
    .line 40
    if-gez p3, :cond_3

    .line 41
    .line 42
    iget p3, p0, Lta;->r:I

    .line 43
    .line 44
    long-to-int p1, p1

    .line 45
    add-int/2addr p3, p1

    .line 46
    iget-object p0, p0, Lta;->p:[S

    .line 47
    .line 48
    array-length p1, p0

    .line 49
    rem-int/2addr p3, p1

    .line 50
    aget-short p0, p0, p3

    .line 51
    .line 52
    return p0

    .line 53
    :cond_3
    const-string p0, "audio resampler state invalid"

    .line 54
    .line 55
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return v3
.end method

.method public final g(Ljava/nio/ByteBuffer;III)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lta;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    if-gtz p2, :cond_0

    .line 6
    .line 7
    iget p2, p0, Lta;->a:I

    .line 8
    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-gtz p3, :cond_1

    .line 11
    .line 12
    move p3, v0

    .line 13
    :cond_1
    const/16 v1, 0x8

    .line 14
    .line 15
    if-gt p3, v1, :cond_e

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x4

    .line 19
    if-ne p4, v2, :cond_2

    .line 20
    .line 21
    :goto_0
    move v0, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    const/4 v3, 0x3

    .line 24
    if-ne p4, v3, :cond_3

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_3
    const/4 v0, 0x2

    .line 28
    if-ne p4, v0, :cond_4

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_4
    const/16 v0, 0x15

    .line 32
    .line 33
    if-ne p4, v0, :cond_5

    .line 34
    .line 35
    move v0, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_5
    const/16 v0, 0x16

    .line 38
    .line 39
    if-ne p4, v0, :cond_6

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_6
    move v0, v1

    .line 43
    :goto_1
    if-lez v0, :cond_d

    .line 44
    .line 45
    iget v2, p0, Lta;->g:I

    .line 46
    .line 47
    if-gtz v2, :cond_7

    .line 48
    .line 49
    iput p2, p0, Lta;->g:I

    .line 50
    .line 51
    iput p3, p0, Lta;->h:I

    .line 52
    .line 53
    iput p4, p0, Lta;->i:I

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_7
    if-ne p2, v2, :cond_8

    .line 57
    .line 58
    iget v2, p0, Lta;->h:I

    .line 59
    .line 60
    if-ne p3, v2, :cond_8

    .line 61
    .line 62
    iget v2, p0, Lta;->i:I

    .line 63
    .line 64
    if-eq p4, v2, :cond_9

    .line 65
    .line 66
    :cond_8
    iget-wide v2, p0, Lta;->k:J

    .line 67
    .line 68
    const-wide/16 v4, 0x0

    .line 69
    .line 70
    cmp-long v2, v2, v4

    .line 71
    .line 72
    if-gtz v2, :cond_c

    .line 73
    .line 74
    iget v2, p0, Lta;->j:I

    .line 75
    .line 76
    if-nez v2, :cond_c

    .line 77
    .line 78
    iput p2, p0, Lta;->g:I

    .line 79
    .line 80
    iput p3, p0, Lta;->h:I

    .line 81
    .line 82
    iput p4, p0, Lta;->i:I

    .line 83
    .line 84
    :cond_9
    :goto_2
    mul-int p2, p3, v0

    .line 85
    .line 86
    :cond_a
    :goto_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_f

    .line 91
    .line 92
    iget v2, p0, Lta;->j:I

    .line 93
    .line 94
    if-nez v2, :cond_b

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-lt v2, p2, :cond_b

    .line 101
    .line 102
    invoke-virtual {p0, p1, p3, v0, p4}, Lta;->a(Ljava/nio/ByteBuffer;III)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_b
    iget v2, p0, Lta;->j:I

    .line 107
    .line 108
    sub-int v2, p2, v2

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    iget v3, p0, Lta;->j:I

    .line 119
    .line 120
    iget-object v4, p0, Lta;->f:[B

    .line 121
    .line 122
    invoke-virtual {p1, v4, v3, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    .line 125
    iget v3, p0, Lta;->j:I

    .line 126
    .line 127
    add-int/2addr v3, v2

    .line 128
    iput v3, p0, Lta;->j:I

    .line 129
    .line 130
    if-ne v3, p2, :cond_a

    .line 131
    .line 132
    invoke-static {v4, v1, p2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {p0, v2, p3, v0, p4}, Lta;->a(Ljava/nio/ByteBuffer;III)V

    .line 137
    .line 138
    .line 139
    iput v1, p0, Lta;->j:I

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_c
    const-string p0, "audio decode format changed"

    .line 143
    .line 144
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_d
    const-string p0, "audio decode pcm encoding unsupported"

    .line 149
    .line 150
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_e
    const-string p0, "audio decode channel count unsupported"

    .line 155
    .line 156
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_f
    return-void
.end method
