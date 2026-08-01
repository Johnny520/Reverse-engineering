.class public final Lut0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Lu5;

.field public final b:Le81;

.field public final c:Ldh0;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Lv1;

.field public h:J

.field public final i:Li7;

.field public final j:Lih0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lu5;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0xc0

    .line 10
    .line 11
    new-array v2, v1, [J

    .line 12
    .line 13
    iput-object v2, v0, Lu5;->b:Ljava/lang/Object;

    .line 14
    .line 15
    new-array v1, v1, [J

    .line 16
    .line 17
    iput-object v1, v0, Lu5;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v0, p0, Lut0;->a:Lu5;

    .line 20
    .line 21
    new-instance v0, Le81;

    .line 22
    .line 23
    invoke-direct {v0}, Le81;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lut0;->b:Le81;

    .line 27
    .line 28
    new-instance v0, Ldh0;

    .line 29
    .line 30
    invoke-direct {v0}, Ldh0;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lut0;->c:Ldh0;

    .line 34
    .line 35
    const-wide/16 v0, -0x1

    .line 36
    .line 37
    iput-wide v0, p0, Lut0;->h:J

    .line 38
    .line 39
    new-instance v0, Li7;

    .line 40
    .line 41
    const/16 v1, 0x8

    .line 42
    .line 43
    invoke-direct {v0, v1, p0}, Li7;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lut0;->i:Li7;

    .line 47
    .line 48
    new-instance v0, Lih0;

    .line 49
    .line 50
    invoke-direct {v0}, Lih0;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lut0;->j:Lih0;

    .line 54
    .line 55
    return-void
.end method

.method public static c(Lqj0;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->O:Lcn0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lxx;

    .line 6
    .line 7
    invoke-virtual {p0}, Lxx;->b()[F

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lw60;->z([F)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static g(Lb60;)J
    .locals 5

    .line 1
    iget-object p0, p0, Lb60;->I:Lmj0;

    .line 2
    .line 3
    iget-object v0, p0, Lmj0;->d:Lqj0;

    .line 4
    .line 5
    iget-object p0, p0, Lmj0;->c:Lc20;

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    :goto_0
    if-eqz p0, :cond_1

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Lut0;->c(Lqj0;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const-wide v0, 0x7fffffff7fffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    return-wide v0

    .line 25
    :cond_0
    iget-wide v3, p0, Lqj0;->C:J

    .line 26
    .line 27
    invoke-static {v1, v2, v3, v4}, Lw20;->c(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    iget-object p0, p0, Lqj0;->t:Lqj0;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-wide v1
.end method

.method public static i(Lb60;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lb60;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lb60;->I:Lmj0;

    .line 6
    .line 7
    iget-object v0, v0, Lmj0;->d:Lqj0;

    .line 8
    .line 9
    invoke-static {v0}, Lut0;->c(Lqj0;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lb60;->f:Z

    .line 17
    .line 18
    iget-boolean v1, p0, Lb60;->j:Z

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Lut0;->g(Lb60;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    iput-wide v1, p0, Lb60;->i:J

    .line 27
    .line 28
    iput-boolean v0, p0, Lb60;->j:Z

    .line 29
    .line 30
    :cond_0
    iget-wide v1, p0, Lb60;->i:J

    .line 31
    .line 32
    const-wide v3, 0x7fffffff7fffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2, v3, v4}, Lw20;->a(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Lb60;->z()Lsh0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object v1, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 48
    .line 49
    iget p0, p0, Lsh0;->f:I

    .line 50
    .line 51
    :goto_0
    if-ge v0, p0, :cond_1

    .line 52
    .line 53
    aget-object v2, v1, v0

    .line 54
    .line 55
    check-cast v2, Lb60;

    .line 56
    .line 57
    invoke-static {v2}, Lut0;->i(Lb60;)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lut0;->g:Lv1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v2, Lw1;->a:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, Lut0;->g:Lv1;

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lw1;->a:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v9

    .line 21
    iget-boolean v1, v0, Lut0;->d:Z

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v11, 0x0

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    iget-boolean v3, v0, Lut0;->e:Z

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v12, v11

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    :goto_0
    move v12, v2

    .line 35
    :goto_1
    iget-object v15, v0, Lut0;->a:Lu5;

    .line 36
    .line 37
    move v3, v2

    .line 38
    iget-object v2, v0, Lut0;->b:Le81;

    .line 39
    .line 40
    if-eqz v1, :cond_a

    .line 41
    .line 42
    iput-boolean v11, v0, Lut0;->d:Z

    .line 43
    .line 44
    iget-object v1, v0, Lut0;->c:Ldh0;

    .line 45
    .line 46
    iget-object v4, v1, Ldh0;->a:[Ljava/lang/Object;

    .line 47
    .line 48
    iget v1, v1, Ldh0;->b:I

    .line 49
    .line 50
    move v5, v11

    .line 51
    :goto_2
    if-ge v5, v1, :cond_3

    .line 52
    .line 53
    aget-object v6, v4, v5

    .line 54
    .line 55
    check-cast v6, Lhw;

    .line 56
    .line 57
    invoke-interface {v6}, Lhw;->invoke()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    iget-object v1, v15, Lu5;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, [J

    .line 66
    .line 67
    iget v4, v15, Lu5;->a:I

    .line 68
    .line 69
    move v5, v11

    .line 70
    :goto_3
    array-length v6, v1

    .line 71
    add-int/lit8 v6, v6, -0x2

    .line 72
    .line 73
    if-ge v5, v6, :cond_9

    .line 74
    .line 75
    if-ge v5, v4, :cond_9

    .line 76
    .line 77
    add-int/lit8 v6, v5, 0x2

    .line 78
    .line 79
    aget-wide v6, v1, v6

    .line 80
    .line 81
    const/16 v8, 0x3c

    .line 82
    .line 83
    move/from16 v16, v3

    .line 84
    .line 85
    move/from16 v17, v4

    .line 86
    .line 87
    shr-long v3, v6, v8

    .line 88
    .line 89
    long-to-int v3, v3

    .line 90
    and-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    if-eqz v3, :cond_8

    .line 93
    .line 94
    aget-wide v3, v1, v5

    .line 95
    .line 96
    add-int/lit8 v8, v5, 0x1

    .line 97
    .line 98
    const-wide/16 v28, 0x0

    .line 99
    .line 100
    aget-wide v13, v1, v8

    .line 101
    .line 102
    long-to-int v6, v6

    .line 103
    const v7, 0x1ffffff

    .line 104
    .line 105
    .line 106
    and-int/2addr v6, v7

    .line 107
    iget-object v7, v2, Le81;->a:Lug0;

    .line 108
    .line 109
    invoke-virtual {v7, v6}, Lu20;->b(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, Ld81;

    .line 114
    .line 115
    :goto_4
    if-eqz v6, :cond_7

    .line 116
    .line 117
    iget-object v7, v6, Ld81;->d:Ld81;

    .line 118
    .line 119
    move/from16 v30, v12

    .line 120
    .line 121
    iget-wide v11, v6, Ld81;->g:J

    .line 122
    .line 123
    sub-long v18, v9, v11

    .line 124
    .line 125
    cmp-long v8, v18, v28

    .line 126
    .line 127
    if-gez v8, :cond_5

    .line 128
    .line 129
    const-wide/high16 v18, -0x8000000000000000L

    .line 130
    .line 131
    cmp-long v8, v11, v18

    .line 132
    .line 133
    if-nez v8, :cond_4

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_4
    const/4 v8, 0x0

    .line 137
    goto :goto_6

    .line 138
    :cond_5
    :goto_5
    move/from16 v8, v16

    .line 139
    .line 140
    :goto_6
    iput-wide v3, v6, Ld81;->e:J

    .line 141
    .line 142
    iput-wide v13, v6, Ld81;->f:J

    .line 143
    .line 144
    if-eqz v8, :cond_6

    .line 145
    .line 146
    iput-wide v9, v6, Ld81;->g:J

    .line 147
    .line 148
    iget-wide v11, v2, Le81;->d:J

    .line 149
    .line 150
    move-wide/from16 v19, v3

    .line 151
    .line 152
    iget-wide v3, v2, Le81;->e:J

    .line 153
    .line 154
    iget-object v8, v2, Le81;->g:[F

    .line 155
    .line 156
    move-wide/from16 v25, v3

    .line 157
    .line 158
    move-object/from16 v18, v6

    .line 159
    .line 160
    move-object/from16 v27, v8

    .line 161
    .line 162
    move-wide/from16 v23, v11

    .line 163
    .line 164
    move-wide/from16 v21, v13

    .line 165
    .line 166
    invoke-virtual/range {v18 .. v27}, Ld81;->a(JJJJ[F)V

    .line 167
    .line 168
    .line 169
    goto :goto_7

    .line 170
    :cond_6
    move-wide/from16 v19, v3

    .line 171
    .line 172
    move-wide/from16 v21, v13

    .line 173
    .line 174
    :goto_7
    move-object v6, v7

    .line 175
    move-wide/from16 v3, v19

    .line 176
    .line 177
    move-wide/from16 v13, v21

    .line 178
    .line 179
    move/from16 v12, v30

    .line 180
    .line 181
    const/4 v11, 0x0

    .line 182
    goto :goto_4

    .line 183
    :cond_7
    :goto_8
    move/from16 v30, v12

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_8
    const-wide/16 v28, 0x0

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :goto_9
    add-int/lit8 v5, v5, 0x3

    .line 190
    .line 191
    move/from16 v3, v16

    .line 192
    .line 193
    move/from16 v4, v17

    .line 194
    .line 195
    move/from16 v12, v30

    .line 196
    .line 197
    const/4 v11, 0x0

    .line 198
    goto/16 :goto_3

    .line 199
    .line 200
    :cond_9
    move/from16 v30, v12

    .line 201
    .line 202
    const-wide/16 v28, 0x0

    .line 203
    .line 204
    iget-object v1, v15, Lu5;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v1, [J

    .line 207
    .line 208
    iget v3, v15, Lu5;->a:I

    .line 209
    .line 210
    const/4 v4, 0x0

    .line 211
    :goto_a
    array-length v5, v1

    .line 212
    add-int/lit8 v5, v5, -0x2

    .line 213
    .line 214
    if-ge v4, v5, :cond_b

    .line 215
    .line 216
    if-ge v4, v3, :cond_b

    .line 217
    .line 218
    add-int/lit8 v5, v4, 0x2

    .line 219
    .line 220
    aget-wide v6, v1, v5

    .line 221
    .line 222
    const-wide v11, -0x1000000000000001L    # -3.1050361846014175E231

    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    and-long/2addr v6, v11

    .line 228
    aput-wide v6, v1, v5

    .line 229
    .line 230
    add-int/lit8 v4, v4, 0x3

    .line 231
    .line 232
    goto :goto_a

    .line 233
    :cond_a
    move/from16 v30, v12

    .line 234
    .line 235
    const-wide/16 v28, 0x0

    .line 236
    .line 237
    :cond_b
    iget-boolean v1, v0, Lut0;->e:Z

    .line 238
    .line 239
    const/16 v16, 0x7

    .line 240
    .line 241
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    if-eqz v1, :cond_10

    .line 247
    .line 248
    const/4 v1, 0x0

    .line 249
    iput-boolean v1, v0, Lut0;->e:Z

    .line 250
    .line 251
    iget-wide v4, v2, Le81;->d:J

    .line 252
    .line 253
    iget-wide v6, v2, Le81;->e:J

    .line 254
    .line 255
    iget-object v8, v2, Le81;->g:[F

    .line 256
    .line 257
    iget-object v1, v2, Le81;->a:Lug0;

    .line 258
    .line 259
    const-wide/16 v19, 0x80

    .line 260
    .line 261
    iget-object v11, v1, Lu20;->c:[Ljava/lang/Object;

    .line 262
    .line 263
    iget-object v1, v1, Lu20;->a:[J

    .line 264
    .line 265
    array-length v12, v1

    .line 266
    add-int/lit8 v12, v12, -0x2

    .line 267
    .line 268
    if-ltz v12, :cond_f

    .line 269
    .line 270
    const/4 v13, 0x0

    .line 271
    const/16 v14, 0x8

    .line 272
    .line 273
    const-wide/16 v21, 0xff

    .line 274
    .line 275
    :goto_b
    move-wide/from16 v23, v4

    .line 276
    .line 277
    aget-wide v3, v1, v13

    .line 278
    .line 279
    move v5, v14

    .line 280
    move-object/from16 v25, v15

    .line 281
    .line 282
    not-long v14, v3

    .line 283
    shl-long v14, v14, v16

    .line 284
    .line 285
    and-long/2addr v14, v3

    .line 286
    and-long v14, v14, v17

    .line 287
    .line 288
    cmp-long v14, v14, v17

    .line 289
    .line 290
    if-eqz v14, :cond_e

    .line 291
    .line 292
    sub-int v14, v13, v12

    .line 293
    .line 294
    not-int v14, v14

    .line 295
    ushr-int/lit8 v14, v14, 0x1f

    .line 296
    .line 297
    rsub-int/lit8 v14, v14, 0x8

    .line 298
    .line 299
    move-wide/from16 v26, v3

    .line 300
    .line 301
    const/4 v15, 0x0

    .line 302
    :goto_c
    if-ge v15, v14, :cond_d

    .line 303
    .line 304
    and-long v3, v26, v21

    .line 305
    .line 306
    cmp-long v3, v3, v19

    .line 307
    .line 308
    if-gez v3, :cond_c

    .line 309
    .line 310
    shl-int/lit8 v3, v13, 0x3

    .line 311
    .line 312
    add-int/2addr v3, v15

    .line 313
    aget-object v3, v11, v3

    .line 314
    .line 315
    check-cast v3, Ld81;

    .line 316
    .line 317
    :goto_d
    if-eqz v3, :cond_c

    .line 318
    .line 319
    move-object/from16 v31, v1

    .line 320
    .line 321
    move v1, v5

    .line 322
    move-wide/from16 v4, v23

    .line 323
    .line 324
    invoke-virtual/range {v2 .. v10}, Le81;->a(Ld81;JJ[FJ)V

    .line 325
    .line 326
    .line 327
    iget-object v3, v3, Ld81;->d:Ld81;

    .line 328
    .line 329
    move v5, v1

    .line 330
    move-object/from16 v1, v31

    .line 331
    .line 332
    goto :goto_d

    .line 333
    :cond_c
    move-object/from16 v31, v1

    .line 334
    .line 335
    move v1, v5

    .line 336
    move-wide/from16 v4, v23

    .line 337
    .line 338
    shr-long v26, v26, v1

    .line 339
    .line 340
    add-int/lit8 v15, v15, 0x1

    .line 341
    .line 342
    move-wide/from16 v23, v4

    .line 343
    .line 344
    move v5, v1

    .line 345
    move-object/from16 v1, v31

    .line 346
    .line 347
    goto :goto_c

    .line 348
    :cond_d
    move-object/from16 v31, v1

    .line 349
    .line 350
    move v1, v5

    .line 351
    move-wide/from16 v4, v23

    .line 352
    .line 353
    if-ne v14, v1, :cond_11

    .line 354
    .line 355
    goto :goto_e

    .line 356
    :cond_e
    move-object/from16 v31, v1

    .line 357
    .line 358
    move v1, v5

    .line 359
    move-wide/from16 v4, v23

    .line 360
    .line 361
    :goto_e
    if-eq v13, v12, :cond_11

    .line 362
    .line 363
    add-int/lit8 v13, v13, 0x1

    .line 364
    .line 365
    move v14, v1

    .line 366
    move-object/from16 v15, v25

    .line 367
    .line 368
    move-object/from16 v1, v31

    .line 369
    .line 370
    goto :goto_b

    .line 371
    :cond_f
    move-object/from16 v25, v15

    .line 372
    .line 373
    const/16 v1, 0x8

    .line 374
    .line 375
    goto :goto_f

    .line 376
    :cond_10
    move-object/from16 v25, v15

    .line 377
    .line 378
    const/16 v1, 0x8

    .line 379
    .line 380
    const-wide/16 v19, 0x80

    .line 381
    .line 382
    :goto_f
    const-wide/16 v21, 0xff

    .line 383
    .line 384
    :cond_11
    if-eqz v30, :cond_12

    .line 385
    .line 386
    iget-wide v4, v2, Le81;->d:J

    .line 387
    .line 388
    iget-wide v6, v2, Le81;->e:J

    .line 389
    .line 390
    iget-object v8, v2, Le81;->g:[F

    .line 391
    .line 392
    iget-object v3, v2, Le81;->b:Ld81;

    .line 393
    .line 394
    if-eqz v3, :cond_12

    .line 395
    .line 396
    :goto_10
    if-eqz v3, :cond_12

    .line 397
    .line 398
    iget-object v11, v3, Ld81;->b:Ln9;

    .line 399
    .line 400
    invoke-static {v11}, Lpf1;->Q(Lrm;)Lb60;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    invoke-static {v11}, Le60;->a(Lb60;)Ldn0;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    check-cast v12, Lw3;

    .line 409
    .line 410
    invoke-virtual {v12}, Lw3;->getRectManager()Lut0;

    .line 411
    .line 412
    .line 413
    move-result-object v12

    .line 414
    invoke-virtual {v12, v11}, Lut0;->b(Lb60;)J

    .line 415
    .line 416
    .line 417
    move-result-wide v12

    .line 418
    iget-wide v14, v11, Lb60;->h:J

    .line 419
    .line 420
    iput-wide v12, v3, Ld81;->e:J

    .line 421
    .line 422
    move-wide/from16 v23, v12

    .line 423
    .line 424
    const/16 v13, 0x20

    .line 425
    .line 426
    shr-long v11, v23, v13

    .line 427
    .line 428
    long-to-int v11, v11

    .line 429
    move v12, v13

    .line 430
    move-wide/from16 v26, v14

    .line 431
    .line 432
    shr-long v13, v26, v12

    .line 433
    .line 434
    long-to-int v13, v13

    .line 435
    add-int/2addr v11, v13

    .line 436
    move v15, v12

    .line 437
    const-wide v30, 0xffffffffL

    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    and-long v12, v23, v30

    .line 443
    .line 444
    long-to-int v12, v12

    .line 445
    and-long v13, v26, v30

    .line 446
    .line 447
    long-to-int v13, v13

    .line 448
    add-int/2addr v12, v13

    .line 449
    int-to-long v13, v11

    .line 450
    shl-long/2addr v13, v15

    .line 451
    int-to-long v11, v12

    .line 452
    and-long v11, v11, v30

    .line 453
    .line 454
    or-long/2addr v11, v13

    .line 455
    iput-wide v11, v3, Ld81;->f:J

    .line 456
    .line 457
    invoke-virtual/range {v2 .. v10}, Le81;->a(Ld81;JJ[FJ)V

    .line 458
    .line 459
    .line 460
    iget-object v3, v3, Ld81;->d:Ld81;

    .line 461
    .line 462
    goto :goto_10

    .line 463
    :cond_12
    iget-boolean v3, v0, Lut0;->f:Z

    .line 464
    .line 465
    if-eqz v3, :cond_15

    .line 466
    .line 467
    const/4 v3, 0x0

    .line 468
    iput-boolean v3, v0, Lut0;->f:Z

    .line 469
    .line 470
    move-object/from16 v4, v25

    .line 471
    .line 472
    iget-object v5, v4, Lu5;->b:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v5, [J

    .line 475
    .line 476
    iget v6, v4, Lu5;->a:I

    .line 477
    .line 478
    iget-object v7, v4, Lu5;->c:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v7, [J

    .line 481
    .line 482
    move v8, v3

    .line 483
    move v11, v8

    .line 484
    :goto_11
    array-length v12, v5

    .line 485
    add-int/lit8 v12, v12, -0x2

    .line 486
    .line 487
    if-ge v8, v12, :cond_14

    .line 488
    .line 489
    array-length v12, v7

    .line 490
    add-int/lit8 v12, v12, -0x2

    .line 491
    .line 492
    if-ge v11, v12, :cond_14

    .line 493
    .line 494
    if-ge v8, v6, :cond_14

    .line 495
    .line 496
    add-int/lit8 v12, v8, 0x2

    .line 497
    .line 498
    aget-wide v13, v5, v12

    .line 499
    .line 500
    sget-wide v23, Ltt0;->a:J

    .line 501
    .line 502
    cmp-long v13, v13, v23

    .line 503
    .line 504
    if-eqz v13, :cond_13

    .line 505
    .line 506
    aget-wide v13, v5, v8

    .line 507
    .line 508
    aput-wide v13, v7, v11

    .line 509
    .line 510
    add-int/lit8 v13, v11, 0x1

    .line 511
    .line 512
    add-int/lit8 v14, v8, 0x1

    .line 513
    .line 514
    aget-wide v14, v5, v14

    .line 515
    .line 516
    aput-wide v14, v7, v13

    .line 517
    .line 518
    add-int/lit8 v13, v11, 0x2

    .line 519
    .line 520
    aget-wide v14, v5, v12

    .line 521
    .line 522
    aput-wide v14, v7, v13

    .line 523
    .line 524
    add-int/lit8 v11, v11, 0x3

    .line 525
    .line 526
    :cond_13
    add-int/lit8 v8, v8, 0x3

    .line 527
    .line 528
    goto :goto_11

    .line 529
    :cond_14
    iput v11, v4, Lu5;->a:I

    .line 530
    .line 531
    iput-object v7, v4, Lu5;->b:Ljava/lang/Object;

    .line 532
    .line 533
    iput-object v5, v4, Lu5;->c:Ljava/lang/Object;

    .line 534
    .line 535
    goto :goto_12

    .line 536
    :cond_15
    const/4 v3, 0x0

    .line 537
    :goto_12
    iget-wide v4, v2, Le81;->c:J

    .line 538
    .line 539
    cmp-long v4, v4, v9

    .line 540
    .line 541
    if-lez v4, :cond_16

    .line 542
    .line 543
    goto :goto_17

    .line 544
    :cond_16
    iget-object v4, v2, Le81;->a:Lug0;

    .line 545
    .line 546
    iget-object v5, v4, Lu20;->c:[Ljava/lang/Object;

    .line 547
    .line 548
    iget-object v4, v4, Lu20;->a:[J

    .line 549
    .line 550
    array-length v6, v4

    .line 551
    add-int/lit8 v6, v6, -0x2

    .line 552
    .line 553
    if-ltz v6, :cond_1a

    .line 554
    .line 555
    move v7, v3

    .line 556
    :goto_13
    aget-wide v8, v4, v7

    .line 557
    .line 558
    not-long v10, v8

    .line 559
    shl-long v10, v10, v16

    .line 560
    .line 561
    and-long/2addr v10, v8

    .line 562
    and-long v10, v10, v17

    .line 563
    .line 564
    cmp-long v10, v10, v17

    .line 565
    .line 566
    if-eqz v10, :cond_19

    .line 567
    .line 568
    sub-int v10, v7, v6

    .line 569
    .line 570
    not-int v10, v10

    .line 571
    ushr-int/lit8 v10, v10, 0x1f

    .line 572
    .line 573
    rsub-int/lit8 v10, v10, 0x8

    .line 574
    .line 575
    move-wide v11, v8

    .line 576
    move v8, v3

    .line 577
    :goto_14
    if-ge v8, v10, :cond_18

    .line 578
    .line 579
    and-long v13, v11, v21

    .line 580
    .line 581
    cmp-long v9, v13, v19

    .line 582
    .line 583
    if-gez v9, :cond_17

    .line 584
    .line 585
    shl-int/lit8 v9, v7, 0x3

    .line 586
    .line 587
    add-int/2addr v9, v8

    .line 588
    aget-object v9, v5, v9

    .line 589
    .line 590
    check-cast v9, Ld81;

    .line 591
    .line 592
    :goto_15
    if-eqz v9, :cond_17

    .line 593
    .line 594
    iget-object v9, v9, Ld81;->d:Ld81;

    .line 595
    .line 596
    goto :goto_15

    .line 597
    :cond_17
    shr-long/2addr v11, v1

    .line 598
    add-int/lit8 v8, v8, 0x1

    .line 599
    .line 600
    goto :goto_14

    .line 601
    :cond_18
    if-ne v10, v1, :cond_1a

    .line 602
    .line 603
    :cond_19
    if-eq v7, v6, :cond_1a

    .line 604
    .line 605
    add-int/lit8 v7, v7, 0x1

    .line 606
    .line 607
    goto :goto_13

    .line 608
    :cond_1a
    iget-object v1, v2, Le81;->b:Ld81;

    .line 609
    .line 610
    if-eqz v1, :cond_1b

    .line 611
    .line 612
    :goto_16
    if-eqz v1, :cond_1b

    .line 613
    .line 614
    iget-object v1, v1, Ld81;->d:Ld81;

    .line 615
    .line 616
    goto :goto_16

    .line 617
    :cond_1b
    const-wide/16 v3, -0x1

    .line 618
    .line 619
    iput-wide v3, v2, Le81;->c:J

    .line 620
    .line 621
    :goto_17
    iget-wide v1, v2, Le81;->c:J

    .line 622
    .line 623
    cmp-long v1, v1, v28

    .line 624
    .line 625
    if-lez v1, :cond_1c

    .line 626
    .line 627
    invoke-virtual {v0}, Lut0;->j()V

    .line 628
    .line 629
    .line 630
    :cond_1c
    return-void
.end method

.method public final b(Lb60;)J
    .locals 8

    .line 1
    iget p1, p1, Lb60;->e:I

    .line 2
    .line 3
    const v0, 0x1ffffff

    .line 4
    .line 5
    .line 6
    and-int/2addr p1, v0

    .line 7
    iget-object p0, p0, Lut0;->a:Lu5;

    .line 8
    .line 9
    iget-object v1, p0, Lu5;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [J

    .line 12
    .line 13
    iget p0, p0, Lu5;->a:I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    array-length v3, v1

    .line 17
    add-int/lit8 v3, v3, -0x2

    .line 18
    .line 19
    const-wide v4, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ge v2, v3, :cond_1

    .line 25
    .line 26
    if-ge v2, p0, :cond_1

    .line 27
    .line 28
    add-int/lit8 v3, v2, 0x2

    .line 29
    .line 30
    aget-wide v6, v1, v3

    .line 31
    .line 32
    long-to-int v3, v6

    .line 33
    and-int/2addr v3, v0

    .line 34
    if-ne v3, p1, :cond_0

    .line 35
    .line 36
    aget-wide p0, v1, v2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 v2, v2, 0x3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-wide p0, v4

    .line 43
    :goto_1
    cmp-long v0, p0, v4

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const-wide p0, 0x7fffffff7fffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    return-wide p0

    .line 53
    :cond_2
    const/16 v0, 0x20

    .line 54
    .line 55
    shr-long v1, p0, v0

    .line 56
    .line 57
    long-to-int v1, v1

    .line 58
    long-to-int p0, p0

    .line 59
    int-to-long v1, v1

    .line 60
    shl-long v0, v1, v0

    .line 61
    .line 62
    int-to-long p0, p0

    .line 63
    const-wide v2, 0xffffffffL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    and-long/2addr p0, v2

    .line 69
    or-long/2addr p0, v0

    .line 70
    return-wide p0
.end method

.method public final d(Lb60;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iput-boolean v2, v1, Lb60;->f:Z

    .line 7
    .line 8
    const-wide v3, 0x7fffffff7fffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v3, v1, Lb60;->g:J

    .line 14
    .line 15
    iget-object v5, v1, Lb60;->I:Lmj0;

    .line 16
    .line 17
    iget-object v6, v5, Lmj0;->d:Lqj0;

    .line 18
    .line 19
    iget-object v7, v1, Lb60;->J:Lf60;

    .line 20
    .line 21
    iget-object v7, v7, Lf60;->p:Lwd0;

    .line 22
    .line 23
    invoke-virtual {v7}, Lwd0;->U()I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    invoke-virtual {v7}, Lwd0;->S()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    int-to-float v8, v8

    .line 32
    int-to-float v7, v7

    .line 33
    iget-object v9, v0, Lut0;->j:Lih0;

    .line 34
    .line 35
    const/4 v10, 0x0

    .line 36
    iput v10, v9, Lih0;->a:F

    .line 37
    .line 38
    iput v10, v9, Lih0;->b:F

    .line 39
    .line 40
    iput v8, v9, Lih0;->c:F

    .line 41
    .line 42
    iput v7, v9, Lih0;->d:F

    .line 43
    .line 44
    :goto_0
    const-wide v7, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const/16 v10, 0x20

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    iget-object v11, v6, Lqj0;->r:Lb60;

    .line 54
    .line 55
    iget-object v12, v11, Lb60;->I:Lmj0;

    .line 56
    .line 57
    iget-object v12, v12, Lmj0;->d:Lqj0;

    .line 58
    .line 59
    if-ne v6, v12, :cond_0

    .line 60
    .line 61
    iget-boolean v12, v11, Lb60;->f:Z

    .line 62
    .line 63
    if-nez v12, :cond_0

    .line 64
    .line 65
    invoke-virtual {v0, v11}, Lut0;->b(Lb60;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v11

    .line 69
    invoke-static {v11, v12, v3, v4}, Lw20;->a(JJ)Z

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    if-nez v13, :cond_0

    .line 74
    .line 75
    shr-long v3, v11, v10

    .line 76
    .line 77
    long-to-int v3, v3

    .line 78
    int-to-float v3, v3

    .line 79
    and-long/2addr v11, v7

    .line 80
    long-to-int v4, v11

    .line 81
    int-to-float v4, v4

    .line 82
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    int-to-long v11, v3

    .line 87
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    int-to-long v3, v3

    .line 92
    shl-long/2addr v11, v10

    .line 93
    and-long/2addr v3, v7

    .line 94
    or-long/2addr v3, v11

    .line 95
    invoke-virtual {v9, v3, v4}, Lih0;->c(J)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_0
    iget-object v11, v6, Lqj0;->O:Lcn0;

    .line 100
    .line 101
    if-eqz v11, :cond_1

    .line 102
    .line 103
    check-cast v11, Lxx;

    .line 104
    .line 105
    invoke-virtual {v11}, Lxx;->b()[F

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    invoke-static {v11}, Lw60;->z([F)Z

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    if-nez v12, :cond_1

    .line 114
    .line 115
    invoke-static {v11, v9}, Lr60;->t([FLih0;)V

    .line 116
    .line 117
    .line 118
    :cond_1
    iget-wide v11, v6, Lqj0;->C:J

    .line 119
    .line 120
    shr-long v13, v11, v10

    .line 121
    .line 122
    long-to-int v13, v13

    .line 123
    int-to-float v13, v13

    .line 124
    and-long/2addr v11, v7

    .line 125
    long-to-int v11, v11

    .line 126
    int-to-float v11, v11

    .line 127
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    int-to-long v12, v12

    .line 132
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    int-to-long v14, v11

    .line 137
    shl-long v10, v12, v10

    .line 138
    .line 139
    and-long/2addr v7, v14

    .line 140
    or-long/2addr v7, v10

    .line 141
    invoke-virtual {v9, v7, v8}, Lih0;->c(J)V

    .line 142
    .line 143
    .line 144
    iget-object v6, v6, Lqj0;->t:Lqj0;

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_2
    :goto_1
    iget v3, v9, Lih0;->a:F

    .line 148
    .line 149
    float-to-int v13, v3

    .line 150
    iget v3, v9, Lih0;->b:F

    .line 151
    .line 152
    float-to-int v14, v3

    .line 153
    iget v3, v9, Lih0;->c:F

    .line 154
    .line 155
    float-to-int v15, v3

    .line 156
    iget v3, v9, Lih0;->d:F

    .line 157
    .line 158
    float-to-int v3, v3

    .line 159
    iget v12, v1, Lb60;->e:I

    .line 160
    .line 161
    iget-boolean v4, v1, Lb60;->k:Z

    .line 162
    .line 163
    iput-boolean v2, v1, Lb60;->k:Z

    .line 164
    .line 165
    iget-object v11, v0, Lut0;->a:Lu5;

    .line 166
    .line 167
    if-eqz v4, :cond_4

    .line 168
    .line 169
    const v4, 0x1ffffff

    .line 170
    .line 171
    .line 172
    and-int v9, v12, v4

    .line 173
    .line 174
    move/from16 v16, v4

    .line 175
    .line 176
    iget-object v4, v11, Lu5;->b:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v4, [J

    .line 179
    .line 180
    iget v6, v11, Lu5;->a:I

    .line 181
    .line 182
    move-wide/from16 v17, v7

    .line 183
    .line 184
    const/4 v7, 0x0

    .line 185
    :goto_2
    array-length v8, v4

    .line 186
    add-int/lit8 v8, v8, -0x2

    .line 187
    .line 188
    if-ge v7, v8, :cond_4

    .line 189
    .line 190
    if-ge v7, v6, :cond_4

    .line 191
    .line 192
    add-int/lit8 v8, v7, 0x2

    .line 193
    .line 194
    move/from16 v19, v10

    .line 195
    .line 196
    move-object/from16 v20, v11

    .line 197
    .line 198
    aget-wide v10, v4, v8

    .line 199
    .line 200
    move/from16 v22, v2

    .line 201
    .line 202
    long-to-int v2, v10

    .line 203
    and-int v2, v2, v16

    .line 204
    .line 205
    if-ne v2, v9, :cond_3

    .line 206
    .line 207
    int-to-long v5, v13

    .line 208
    shl-long v5, v5, v19

    .line 209
    .line 210
    int-to-long v12, v14

    .line 211
    and-long v12, v12, v17

    .line 212
    .line 213
    or-long/2addr v5, v12

    .line 214
    aput-wide v5, v4, v7

    .line 215
    .line 216
    add-int/lit8 v7, v7, 0x1

    .line 217
    .line 218
    int-to-long v5, v15

    .line 219
    shl-long v5, v5, v19

    .line 220
    .line 221
    int-to-long v2, v3

    .line 222
    and-long v2, v2, v17

    .line 223
    .line 224
    or-long/2addr v2, v5

    .line 225
    aput-wide v2, v4, v7

    .line 226
    .line 227
    const/16 v2, 0x3f

    .line 228
    .line 229
    shr-long v2, v10, v2

    .line 230
    .line 231
    const-wide/16 v5, 0x1

    .line 232
    .line 233
    and-long/2addr v2, v5

    .line 234
    const/16 v5, 0x3c

    .line 235
    .line 236
    shl-long/2addr v2, v5

    .line 237
    or-long/2addr v2, v10

    .line 238
    aput-wide v2, v4, v8

    .line 239
    .line 240
    :goto_3
    move/from16 v2, v22

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_3
    add-int/lit8 v7, v7, 0x3

    .line 244
    .line 245
    move/from16 v10, v19

    .line 246
    .line 247
    move-object/from16 v11, v20

    .line 248
    .line 249
    move/from16 v2, v22

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_4
    move/from16 v22, v2

    .line 253
    .line 254
    move-object/from16 v20, v11

    .line 255
    .line 256
    invoke-virtual {v1}, Lb60;->v()Lb60;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    if-eqz v2, :cond_5

    .line 261
    .line 262
    iget v2, v2, Lb60;->e:I

    .line 263
    .line 264
    :goto_4
    move/from16 v17, v2

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_5
    const/4 v2, -0x1

    .line 268
    goto :goto_4

    .line 269
    :goto_5
    const/16 v2, 0x400

    .line 270
    .line 271
    invoke-virtual {v5, v2}, Lmj0;->d(I)Z

    .line 272
    .line 273
    .line 274
    move-result v18

    .line 275
    const/16 v2, 0x10

    .line 276
    .line 277
    invoke-virtual {v5, v2}, Lmj0;->d(I)Z

    .line 278
    .line 279
    .line 280
    move-result v19

    .line 281
    iget-object v2, v0, Lut0;->b:Le81;

    .line 282
    .line 283
    iget-object v2, v2, Le81;->a:Lug0;

    .line 284
    .line 285
    invoke-virtual {v2, v12}, Lu20;->a(I)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    const/16 v21, 0x200

    .line 290
    .line 291
    move/from16 v16, v3

    .line 292
    .line 293
    move-object/from16 v11, v20

    .line 294
    .line 295
    move/from16 v20, v2

    .line 296
    .line 297
    invoke-static/range {v11 .. v21}, Lu5;->e(Lu5;IIIIIIZZZI)V

    .line 298
    .line 299
    .line 300
    goto :goto_3

    .line 301
    :goto_6
    iput-boolean v2, v0, Lut0;->d:Z

    .line 302
    .line 303
    invoke-virtual {v1}, Lb60;->z()Lsh0;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    iget-object v2, v1, Lsh0;->d:[Ljava/lang/Object;

    .line 308
    .line 309
    iget v1, v1, Lsh0;->f:I

    .line 310
    .line 311
    const/4 v6, 0x0

    .line 312
    :goto_7
    if-ge v6, v1, :cond_7

    .line 313
    .line 314
    aget-object v3, v2, v6

    .line 315
    .line 316
    check-cast v3, Lb60;

    .line 317
    .line 318
    invoke-virtual {v3}, Lb60;->I()Z

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    if-eqz v4, :cond_6

    .line 323
    .line 324
    invoke-virtual {v0, v3}, Lut0;->d(Lb60;)V

    .line 325
    .line 326
    .line 327
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_7
    return-void
.end method

.method public final e(Lb60;)V
    .locals 9

    .line 1
    iget-boolean v0, p1, Lb60;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lut0;->d:Z

    .line 7
    .line 8
    iget p1, p1, Lb60;->e:I

    .line 9
    .line 10
    const v0, 0x1ffffff

    .line 11
    .line 12
    .line 13
    and-int/2addr p1, v0

    .line 14
    iget-object v1, p0, Lut0;->a:Lu5;

    .line 15
    .line 16
    iget-object v2, v1, Lu5;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, [J

    .line 19
    .line 20
    iget v1, v1, Lu5;->a:I

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    array-length v4, v2

    .line 24
    add-int/lit8 v4, v4, -0x2

    .line 25
    .line 26
    if-ge v3, v4, :cond_1

    .line 27
    .line 28
    if-ge v3, v1, :cond_1

    .line 29
    .line 30
    add-int/lit8 v4, v3, 0x2

    .line 31
    .line 32
    aget-wide v5, v2, v4

    .line 33
    .line 34
    long-to-int v7, v5

    .line 35
    and-int/2addr v7, v0

    .line 36
    if-ne v7, p1, :cond_0

    .line 37
    .line 38
    const/16 p1, 0x3f

    .line 39
    .line 40
    shr-long v0, v5, p1

    .line 41
    .line 42
    const-wide/16 v7, 0x1

    .line 43
    .line 44
    and-long/2addr v0, v7

    .line 45
    const/16 p1, 0x3c

    .line 46
    .line 47
    shl-long/2addr v0, p1

    .line 48
    or-long/2addr v0, v5

    .line 49
    aput-wide v0, v2, v4

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    add-int/lit8 v3, v3, 0x3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lut0;->j()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final f(Lb60;Z)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lb60;->I()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, v1, Lb60;->I:Lmj0;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {v1}, Lb60;->v()Lb60;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-wide v4, 0x7fffffff7fffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    iget-boolean v7, v2, Lb60;->f:Z

    .line 27
    .line 28
    if-nez v7, :cond_2

    .line 29
    .line 30
    iget-boolean v7, v2, Lb60;->j:Z

    .line 31
    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    iput-boolean v6, v2, Lb60;->j:Z

    .line 35
    .line 36
    invoke-static {v2}, Lut0;->g(Lb60;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    iput-wide v7, v2, Lb60;->i:J

    .line 41
    .line 42
    :cond_1
    iget-wide v7, v2, Lb60;->i:J

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    if-nez v2, :cond_3

    .line 46
    .line 47
    const-wide/16 v7, 0x0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    move-wide v7, v4

    .line 51
    :goto_0
    iget-object v9, v3, Lmj0;->d:Lqj0;

    .line 52
    .line 53
    invoke-static {v7, v8, v4, v5}, Lw20;->a(JJ)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_15

    .line 58
    .line 59
    invoke-static {v9}, Lut0;->c(Lqj0;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_15

    .line 64
    .line 65
    iget-boolean v4, v1, Lb60;->f:Z

    .line 66
    .line 67
    if-nez v4, :cond_14

    .line 68
    .line 69
    iget-wide v4, v9, Lqj0;->C:J

    .line 70
    .line 71
    invoke-static {v7, v8, v4, v5}, Lw20;->c(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    iget-object v7, v1, Lb60;->J:Lf60;

    .line 76
    .line 77
    iget-object v7, v7, Lf60;->p:Lwd0;

    .line 78
    .line 79
    invoke-virtual {v7}, Lwd0;->U()I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    invoke-virtual {v7}, Lwd0;->S()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    int-to-long v9, v8

    .line 88
    const/16 v11, 0x20

    .line 89
    .line 90
    shl-long/2addr v9, v11

    .line 91
    int-to-long v12, v7

    .line 92
    const-wide v14, 0xffffffffL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    and-long/2addr v12, v14

    .line 98
    or-long/2addr v9, v12

    .line 99
    iget v12, v1, Lb60;->e:I

    .line 100
    .line 101
    iget-boolean v13, v1, Lb60;->k:Z

    .line 102
    .line 103
    iget-object v6, v0, Lut0;->a:Lu5;

    .line 104
    .line 105
    const v17, 0x1ffffff

    .line 106
    .line 107
    .line 108
    move/from16 v18, v11

    .line 109
    .line 110
    if-eqz v13, :cond_10

    .line 111
    .line 112
    move-wide/from16 v19, v14

    .line 113
    .line 114
    if-nez p2, :cond_5

    .line 115
    .line 116
    iget-wide v14, v1, Lb60;->g:J

    .line 117
    .line 118
    invoke-static {v4, v5, v14, v15}, Lw20;->a(JJ)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    iget-wide v13, v1, Lb60;->h:J

    .line 125
    .line 126
    invoke-static {v9, v10, v13, v14}, Ld30;->a(JJ)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-nez v3, :cond_4

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    move-wide/from16 v27, v4

    .line 134
    .line 135
    goto/16 :goto_e

    .line 136
    .line 137
    :cond_5
    :goto_1
    const-wide/16 v21, 0x1

    .line 138
    .line 139
    const/16 v23, 0x3f

    .line 140
    .line 141
    if-eqz v2, :cond_c

    .line 142
    .line 143
    iget v2, v2, Lb60;->e:I

    .line 144
    .line 145
    const-wide v24, -0x3fffffe000001L

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    shr-long v13, v4, v18

    .line 151
    .line 152
    long-to-int v13, v13

    .line 153
    move-wide/from16 v27, v4

    .line 154
    .line 155
    const/16 p2, 0x19

    .line 156
    .line 157
    and-long v3, v27, v19

    .line 158
    .line 159
    long-to-int v3, v3

    .line 160
    and-int v4, v12, v17

    .line 161
    .line 162
    iget-object v5, v6, Lu5;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v5, [J

    .line 165
    .line 166
    iget v12, v6, Lu5;->a:I

    .line 167
    .line 168
    const/4 v14, 0x0

    .line 169
    const/16 v26, 0x3c

    .line 170
    .line 171
    :goto_2
    array-length v15, v5

    .line 172
    add-int/lit8 v15, v15, -0x2

    .line 173
    .line 174
    if-ge v14, v15, :cond_b

    .line 175
    .line 176
    if-ge v14, v12, :cond_b

    .line 177
    .line 178
    add-int/lit8 v15, v14, 0x2

    .line 179
    .line 180
    move/from16 v29, v12

    .line 181
    .line 182
    aget-wide v11, v5, v15

    .line 183
    .line 184
    long-to-int v11, v11

    .line 185
    and-int v11, v11, v17

    .line 186
    .line 187
    if-ne v11, v2, :cond_a

    .line 188
    .line 189
    aget-wide v11, v5, v14

    .line 190
    .line 191
    move v15, v2

    .line 192
    move/from16 v30, v3

    .line 193
    .line 194
    shr-long v2, v11, v18

    .line 195
    .line 196
    long-to-int v2, v2

    .line 197
    long-to-int v3, v11

    .line 198
    add-int/2addr v2, v13

    .line 199
    add-int v3, v3, v30

    .line 200
    .line 201
    add-int v11, v2, v8

    .line 202
    .line 203
    add-int v12, v3, v7

    .line 204
    .line 205
    add-int/lit8 v14, v14, 0x3

    .line 206
    .line 207
    move/from16 v31, v7

    .line 208
    .line 209
    :goto_3
    array-length v7, v5

    .line 210
    add-int/lit8 v7, v7, -0x2

    .line 211
    .line 212
    if-ge v14, v7, :cond_9

    .line 213
    .line 214
    move/from16 v7, v29

    .line 215
    .line 216
    if-ge v14, v7, :cond_8

    .line 217
    .line 218
    add-int/lit8 v16, v14, 0x2

    .line 219
    .line 220
    move/from16 v32, v7

    .line 221
    .line 222
    move/from16 v29, v8

    .line 223
    .line 224
    aget-wide v7, v5, v16

    .line 225
    .line 226
    move-object/from16 v33, v5

    .line 227
    .line 228
    long-to-int v5, v7

    .line 229
    and-int v5, v5, v17

    .line 230
    .line 231
    if-ne v5, v4, :cond_7

    .line 232
    .line 233
    aget-wide v4, v33, v14

    .line 234
    .line 235
    move-wide/from16 v34, v7

    .line 236
    .line 237
    shr-long v7, v4, v18

    .line 238
    .line 239
    long-to-int v7, v7

    .line 240
    long-to-int v4, v4

    .line 241
    sub-int v5, v2, v7

    .line 242
    .line 243
    sub-int v4, v3, v4

    .line 244
    .line 245
    int-to-long v7, v2

    .line 246
    shl-long v7, v7, v18

    .line 247
    .line 248
    int-to-long v2, v3

    .line 249
    and-long v2, v2, v19

    .line 250
    .line 251
    or-long/2addr v2, v7

    .line 252
    aput-wide v2, v33, v14

    .line 253
    .line 254
    add-int/lit8 v2, v14, 0x1

    .line 255
    .line 256
    int-to-long v7, v11

    .line 257
    shl-long v7, v7, v18

    .line 258
    .line 259
    int-to-long v11, v12

    .line 260
    and-long v11, v11, v19

    .line 261
    .line 262
    or-long/2addr v7, v11

    .line 263
    aput-wide v7, v33, v2

    .line 264
    .line 265
    shr-long v2, v34, v23

    .line 266
    .line 267
    and-long v2, v2, v21

    .line 268
    .line 269
    shl-long v2, v2, v26

    .line 270
    .line 271
    or-long v2, v34, v2

    .line 272
    .line 273
    aput-wide v2, v33, v16

    .line 274
    .line 275
    if-nez v5, :cond_6

    .line 276
    .line 277
    if-eqz v4, :cond_b

    .line 278
    .line 279
    :cond_6
    add-int/lit8 v14, v14, 0x3

    .line 280
    .line 281
    sget v2, Ltt0;->b:I

    .line 282
    .line 283
    and-long v2, v34, v24

    .line 284
    .line 285
    and-int v7, v14, v17

    .line 286
    .line 287
    int-to-long v7, v7

    .line 288
    shl-long v7, v7, p2

    .line 289
    .line 290
    or-long/2addr v2, v7

    .line 291
    invoke-virtual {v6, v2, v3, v5, v4}, Lu5;->g(JII)V

    .line 292
    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_7
    add-int/lit8 v14, v14, 0x3

    .line 296
    .line 297
    move/from16 v8, v29

    .line 298
    .line 299
    move/from16 v29, v32

    .line 300
    .line 301
    move-object/from16 v5, v33

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_8
    move/from16 v32, v7

    .line 305
    .line 306
    :goto_4
    move-object/from16 v33, v5

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_9
    move/from16 v32, v29

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_a
    move v15, v2

    .line 313
    move/from16 v30, v3

    .line 314
    .line 315
    move-object/from16 v33, v5

    .line 316
    .line 317
    move/from16 v31, v7

    .line 318
    .line 319
    move/from16 v32, v29

    .line 320
    .line 321
    :goto_5
    move/from16 v29, v8

    .line 322
    .line 323
    add-int/lit8 v14, v14, 0x3

    .line 324
    .line 325
    move v2, v15

    .line 326
    move/from16 v8, v29

    .line 327
    .line 328
    move/from16 v3, v30

    .line 329
    .line 330
    move/from16 v7, v31

    .line 331
    .line 332
    move/from16 v12, v32

    .line 333
    .line 334
    move-object/from16 v5, v33

    .line 335
    .line 336
    goto/16 :goto_2

    .line 337
    .line 338
    :cond_b
    :goto_6
    const/4 v4, 0x1

    .line 339
    goto/16 :goto_a

    .line 340
    .line 341
    :cond_c
    move-wide/from16 v27, v4

    .line 342
    .line 343
    move/from16 v31, v7

    .line 344
    .line 345
    move/from16 v29, v8

    .line 346
    .line 347
    const/16 p2, 0x19

    .line 348
    .line 349
    const-wide v24, -0x3fffffe000001L

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    const/16 v26, 0x3c

    .line 355
    .line 356
    shr-long v2, v27, v18

    .line 357
    .line 358
    long-to-int v2, v2

    .line 359
    and-long v3, v27, v19

    .line 360
    .line 361
    long-to-int v3, v3

    .line 362
    add-int v8, v2, v29

    .line 363
    .line 364
    add-int v7, v3, v31

    .line 365
    .line 366
    and-int v4, v12, v17

    .line 367
    .line 368
    iget-object v5, v6, Lu5;->b:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v5, [J

    .line 371
    .line 372
    iget v11, v6, Lu5;->a:I

    .line 373
    .line 374
    const/4 v12, 0x0

    .line 375
    :goto_7
    array-length v13, v5

    .line 376
    add-int/lit8 v13, v13, -0x2

    .line 377
    .line 378
    if-ge v12, v13, :cond_b

    .line 379
    .line 380
    if-ge v12, v11, :cond_b

    .line 381
    .line 382
    add-int/lit8 v13, v12, 0x2

    .line 383
    .line 384
    aget-wide v14, v5, v13

    .line 385
    .line 386
    move-object/from16 v29, v5

    .line 387
    .line 388
    long-to-int v5, v14

    .line 389
    and-int v5, v5, v17

    .line 390
    .line 391
    if-ne v5, v4, :cond_f

    .line 392
    .line 393
    aget-wide v4, v29, v12

    .line 394
    .line 395
    move/from16 v30, v12

    .line 396
    .line 397
    int-to-long v11, v2

    .line 398
    shl-long v11, v11, v18

    .line 399
    .line 400
    move-wide/from16 v31, v11

    .line 401
    .line 402
    int-to-long v11, v3

    .line 403
    and-long v11, v11, v19

    .line 404
    .line 405
    or-long v11, v31, v11

    .line 406
    .line 407
    aput-wide v11, v29, v30

    .line 408
    .line 409
    add-int/lit8 v12, v30, 0x1

    .line 410
    .line 411
    move/from16 v32, v2

    .line 412
    .line 413
    move/from16 v33, v3

    .line 414
    .line 415
    int-to-long v2, v8

    .line 416
    shl-long v2, v2, v18

    .line 417
    .line 418
    int-to-long v7, v7

    .line 419
    and-long v7, v7, v19

    .line 420
    .line 421
    or-long/2addr v2, v7

    .line 422
    aput-wide v2, v29, v12

    .line 423
    .line 424
    shr-long v2, v14, v23

    .line 425
    .line 426
    and-long v2, v2, v21

    .line 427
    .line 428
    shl-long v2, v2, v26

    .line 429
    .line 430
    or-long/2addr v2, v14

    .line 431
    aput-wide v2, v29, v13

    .line 432
    .line 433
    shr-long v2, v4, v18

    .line 434
    .line 435
    long-to-int v2, v2

    .line 436
    sub-int v2, v32, v2

    .line 437
    .line 438
    long-to-int v3, v4

    .line 439
    sub-int v3, v33, v3

    .line 440
    .line 441
    if-eqz v2, :cond_d

    .line 442
    .line 443
    const/4 v4, 0x1

    .line 444
    goto :goto_8

    .line 445
    :cond_d
    const/4 v4, 0x0

    .line 446
    :goto_8
    if-eqz v3, :cond_e

    .line 447
    .line 448
    const/16 v16, 0x1

    .line 449
    .line 450
    goto :goto_9

    .line 451
    :cond_e
    const/16 v16, 0x0

    .line 452
    .line 453
    :goto_9
    or-int v4, v4, v16

    .line 454
    .line 455
    if-eqz v4, :cond_b

    .line 456
    .line 457
    add-int/lit8 v12, v30, 0x3

    .line 458
    .line 459
    sget v4, Ltt0;->b:I

    .line 460
    .line 461
    and-long v4, v14, v24

    .line 462
    .line 463
    and-int v7, v12, v17

    .line 464
    .line 465
    int-to-long v7, v7

    .line 466
    shl-long v7, v7, p2

    .line 467
    .line 468
    or-long/2addr v4, v7

    .line 469
    invoke-virtual {v6, v4, v5, v2, v3}, Lu5;->g(JII)V

    .line 470
    .line 471
    .line 472
    goto/16 :goto_6

    .line 473
    .line 474
    :cond_f
    move/from16 v32, v2

    .line 475
    .line 476
    move/from16 v33, v3

    .line 477
    .line 478
    move/from16 v30, v12

    .line 479
    .line 480
    add-int/lit8 v12, v30, 0x3

    .line 481
    .line 482
    move-object/from16 v5, v29

    .line 483
    .line 484
    goto :goto_7

    .line 485
    :goto_a
    iput-boolean v4, v0, Lut0;->d:Z

    .line 486
    .line 487
    goto/16 :goto_e

    .line 488
    .line 489
    :cond_10
    move-wide/from16 v27, v4

    .line 490
    .line 491
    move/from16 v31, v7

    .line 492
    .line 493
    move/from16 v29, v8

    .line 494
    .line 495
    move-wide/from16 v19, v14

    .line 496
    .line 497
    const/4 v4, 0x1

    .line 498
    iput-boolean v4, v1, Lb60;->k:Z

    .line 499
    .line 500
    const/16 v4, 0x400

    .line 501
    .line 502
    invoke-virtual {v3, v4}, Lmj0;->d(I)Z

    .line 503
    .line 504
    .line 505
    move-result v23

    .line 506
    const/16 v4, 0x10

    .line 507
    .line 508
    invoke-virtual {v3, v4}, Lmj0;->d(I)Z

    .line 509
    .line 510
    .line 511
    move-result v24

    .line 512
    iget-object v3, v0, Lut0;->b:Le81;

    .line 513
    .line 514
    iget-object v3, v3, Le81;->a:Lug0;

    .line 515
    .line 516
    invoke-virtual {v3, v12}, Lu20;->a(I)Z

    .line 517
    .line 518
    .line 519
    move-result v25

    .line 520
    if-eqz v2, :cond_13

    .line 521
    .line 522
    iget v2, v2, Lb60;->e:I

    .line 523
    .line 524
    shr-long v3, v27, v18

    .line 525
    .line 526
    long-to-int v3, v3

    .line 527
    and-long v4, v27, v19

    .line 528
    .line 529
    long-to-int v4, v4

    .line 530
    move/from16 v5, v17

    .line 531
    .line 532
    and-int v17, v12, v5

    .line 533
    .line 534
    iget-object v7, v6, Lu5;->b:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v7, [J

    .line 537
    .line 538
    iget v8, v6, Lu5;->a:I

    .line 539
    .line 540
    const/4 v11, 0x0

    .line 541
    :goto_b
    array-length v12, v7

    .line 542
    add-int/lit8 v12, v12, -0x2

    .line 543
    .line 544
    if-ge v11, v12, :cond_12

    .line 545
    .line 546
    if-ge v11, v8, :cond_12

    .line 547
    .line 548
    add-int/lit8 v12, v11, 0x2

    .line 549
    .line 550
    aget-wide v12, v7, v12

    .line 551
    .line 552
    long-to-int v12, v12

    .line 553
    and-int/2addr v12, v5

    .line 554
    if-ne v12, v2, :cond_11

    .line 555
    .line 556
    aget-wide v7, v7, v11

    .line 557
    .line 558
    shr-long v12, v7, v18

    .line 559
    .line 560
    long-to-int v5, v12

    .line 561
    long-to-int v7, v7

    .line 562
    add-int v18, v5, v3

    .line 563
    .line 564
    add-int v19, v7, v4

    .line 565
    .line 566
    add-int v20, v18, v29

    .line 567
    .line 568
    add-int v21, v19, v31

    .line 569
    .line 570
    move/from16 v22, v2

    .line 571
    .line 572
    move-object/from16 v16, v6

    .line 573
    .line 574
    move/from16 v26, v11

    .line 575
    .line 576
    invoke-virtual/range {v16 .. v26}, Lu5;->d(IIIIIIZZZI)V

    .line 577
    .line 578
    .line 579
    goto :goto_c

    .line 580
    :cond_11
    move/from16 v22, v2

    .line 581
    .line 582
    move-object/from16 v16, v6

    .line 583
    .line 584
    move/from16 v26, v11

    .line 585
    .line 586
    add-int/lit8 v11, v26, 0x3

    .line 587
    .line 588
    goto :goto_b

    .line 589
    :cond_12
    :goto_c
    const/4 v4, 0x1

    .line 590
    goto :goto_d

    .line 591
    :cond_13
    move-object/from16 v16, v6

    .line 592
    .line 593
    shr-long v2, v27, v18

    .line 594
    .line 595
    long-to-int v2, v2

    .line 596
    and-long v3, v27, v19

    .line 597
    .line 598
    long-to-int v3, v3

    .line 599
    add-int v20, v2, v29

    .line 600
    .line 601
    add-int v21, v3, v31

    .line 602
    .line 603
    const/16 v22, 0x0

    .line 604
    .line 605
    const/16 v26, 0x220

    .line 606
    .line 607
    move/from16 v18, v2

    .line 608
    .line 609
    move/from16 v19, v3

    .line 610
    .line 611
    move/from16 v17, v12

    .line 612
    .line 613
    invoke-static/range {v16 .. v26}, Lu5;->e(Lu5;IIIIIIZZZI)V

    .line 614
    .line 615
    .line 616
    goto :goto_c

    .line 617
    :goto_d
    iput-boolean v4, v0, Lut0;->d:Z

    .line 618
    .line 619
    :goto_e
    iput-wide v9, v1, Lb60;->h:J

    .line 620
    .line 621
    move-wide/from16 v2, v27

    .line 622
    .line 623
    iput-wide v2, v1, Lb60;->g:J

    .line 624
    .line 625
    return-void

    .line 626
    :cond_14
    invoke-virtual/range {p0 .. p1}, Lut0;->d(Lb60;)V

    .line 627
    .line 628
    .line 629
    invoke-static {v1}, Lut0;->i(Lb60;)V

    .line 630
    .line 631
    .line 632
    return-void

    .line 633
    :cond_15
    invoke-virtual/range {p0 .. p1}, Lut0;->d(Lb60;)V

    .line 634
    .line 635
    .line 636
    return-void
.end method

.method public final h(Lb60;)V
    .locals 10

    .line 1
    iget-boolean v0, p1, Lb60;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v0, p1, Lb60;->e:I

    .line 6
    .line 7
    const v1, 0x1ffffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, v1

    .line 11
    iget-object v2, p0, Lut0;->a:Lu5;

    .line 12
    .line 13
    iget-object v3, v2, Lu5;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, [J

    .line 16
    .line 17
    iget v2, v2, Lu5;->a:I

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move v5, v4

    .line 21
    :goto_0
    array-length v6, v3

    .line 22
    add-int/lit8 v6, v6, -0x2

    .line 23
    .line 24
    const/4 v7, 0x1

    .line 25
    if-ge v5, v6, :cond_1

    .line 26
    .line 27
    if-ge v5, v2, :cond_1

    .line 28
    .line 29
    add-int/lit8 v6, v5, 0x2

    .line 30
    .line 31
    aget-wide v8, v3, v6

    .line 32
    .line 33
    long-to-int v8, v8

    .line 34
    and-int/2addr v8, v1

    .line 35
    if-ne v8, v0, :cond_0

    .line 36
    .line 37
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    aput-wide v0, v3, v5

    .line 40
    .line 41
    add-int/2addr v5, v7

    .line 42
    aput-wide v0, v3, v5

    .line 43
    .line 44
    sget-wide v0, Ltt0;->a:J

    .line 45
    .line 46
    aput-wide v0, v3, v6

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    add-int/lit8 v5, v5, 0x3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    iput-boolean v4, p1, Lb60;->k:Z

    .line 53
    .line 54
    iput-boolean v7, p0, Lut0;->d:Z

    .line 55
    .line 56
    iput-boolean v7, p0, Lut0;->f:Z

    .line 57
    .line 58
    :cond_2
    return-void
.end method

.method public final j()V
    .locals 9

    .line 1
    iget-object v0, p0, Lut0;->g:Lv1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v1

    .line 9
    :goto_0
    iget-object v3, p0, Lut0;->b:Le81;

    .line 10
    .line 11
    iget-wide v3, v3, Le81;->c:J

    .line 12
    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    cmp-long v5, v3, v5

    .line 16
    .line 17
    if-gez v5, :cond_1

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-wide v5, p0, Lut0;->h:J

    .line 23
    .line 24
    cmp-long v5, v5, v3

    .line 25
    .line 26
    if-nez v5, :cond_2

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    :goto_1
    return-void

    .line 31
    :cond_2
    if-eqz v0, :cond_3

    .line 32
    .line 33
    sget-object v2, Lw1;->a:Landroid/os/Handler;

    .line 34
    .line 35
    sget-object v2, Lw1;->a:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    :cond_3
    sget-object v0, Lw1;->a:Landroid/os/Handler;

    .line 41
    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    const-wide/16 v7, 0x10

    .line 47
    .line 48
    add-long/2addr v7, v5

    .line 49
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    iput-wide v2, p0, Lut0;->h:J

    .line 54
    .line 55
    sub-long/2addr v2, v5

    .line 56
    new-instance v0, Lv1;

    .line 57
    .line 58
    iget-object v4, p0, Lut0;->i:Li7;

    .line 59
    .line 60
    invoke-direct {v0, v1, v4}, Lv1;-><init>(ILhw;)V

    .line 61
    .line 62
    .line 63
    sget-object v1, Lw1;->a:Landroid/os/Handler;

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lut0;->g:Lv1;

    .line 69
    .line 70
    return-void
.end method
