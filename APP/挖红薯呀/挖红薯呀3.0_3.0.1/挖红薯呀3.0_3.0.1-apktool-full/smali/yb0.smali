.class public abstract Lyb0;
.super Lxq0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lzd0;
.implements Lcg0;


# instance fields
.field public i:Lvb0;

.field public j:Lsw;

.field public k:Lzq0;

.field public l:Z

.field public m:Z

.field public n:Z

.field public final o:Lzb0;

.field public p:Llw0;

.field public q:Ljh0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lxq0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lzb0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1, p0}, Lzb0;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyb0;->o:Lzb0;

    .line 11
    .line 12
    return-void
.end method

.method public static s0(Lqj0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqj0;->s:Lqj0;

    .line 2
    .line 3
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lqj0;->r:Lb60;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0, p0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lb60;->J:Lf60;

    .line 18
    .line 19
    iget-object p0, p0, Lf60;->p:Lwd0;

    .line 20
    .line 21
    iget-object p0, p0, Lwd0;->z:Lc60;

    .line 22
    .line 23
    invoke-virtual {p0}, Lc60;->f()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object p0, p0, Lb60;->J:Lf60;

    .line 28
    .line 29
    iget-object p0, p0, Lf60;->p:Lwd0;

    .line 30
    .line 31
    invoke-virtual {p0}, Lwd0;->s()Lt2;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    check-cast p0, Lwd0;

    .line 38
    .line 39
    iget-object p0, p0, Lwd0;->z:Lc60;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Lc60;->f()V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method


# virtual methods
.method public final E(IILjava/util/Map;Lsw;Lsw;)Lyd0;
    .locals 8

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    and-int v1, p1, v0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    and-int/2addr v0, p2

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Size("

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " x "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, ") is out of range. Each dimension must be between 0 and 16777215."

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    new-instance v1, Lxb0;

    .line 42
    .line 43
    move-object v7, p0

    .line 44
    move v2, p1

    .line 45
    move v3, p2

    .line 46
    move-object v4, p3

    .line 47
    move-object v5, p4

    .line 48
    move-object v6, p5

    .line 49
    invoke-direct/range {v1 .. v7}, Lxb0;-><init>(IILjava/util/Map;Lsw;Lsw;Lyb0;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public final b0(Lb60;Lez;)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lyb0;->q:Ljh0;

    .line 6
    .line 7
    const/4 v7, 0x7

    .line 8
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v10, 0x8

    .line 14
    .line 15
    if-eqz v2, :cond_a

    .line 16
    .line 17
    iget-object v12, v2, Ljh0;->c:[Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v2, v2, Ljh0;->a:[J

    .line 20
    .line 21
    array-length v13, v2

    .line 22
    add-int/lit8 v13, v13, -0x2

    .line 23
    .line 24
    if-ltz v13, :cond_a

    .line 25
    .line 26
    const/4 v14, 0x0

    .line 27
    const-wide/16 v15, 0x80

    .line 28
    .line 29
    :goto_0
    aget-wide v3, v2, v14

    .line 30
    .line 31
    const-wide/16 v17, 0xff

    .line 32
    .line 33
    not-long v5, v3

    .line 34
    shl-long/2addr v5, v7

    .line 35
    and-long/2addr v5, v3

    .line 36
    and-long/2addr v5, v8

    .line 37
    cmp-long v5, v5, v8

    .line 38
    .line 39
    if-eqz v5, :cond_9

    .line 40
    .line 41
    sub-int v5, v14, v13

    .line 42
    .line 43
    not-int v5, v5

    .line 44
    ushr-int/lit8 v5, v5, 0x1f

    .line 45
    .line 46
    rsub-int/lit8 v5, v5, 0x8

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    :goto_1
    if-ge v6, v5, :cond_8

    .line 50
    .line 51
    and-long v19, v3, v17

    .line 52
    .line 53
    cmp-long v19, v19, v15

    .line 54
    .line 55
    if-gez v19, :cond_7

    .line 56
    .line 57
    shl-int/lit8 v19, v14, 0x3

    .line 58
    .line 59
    add-int v19, v19, v6

    .line 60
    .line 61
    aget-object v19, v12, v19

    .line 62
    .line 63
    move/from16 v20, v7

    .line 64
    .line 65
    move-object/from16 v7, v19

    .line 66
    .line 67
    check-cast v7, Lkh0;

    .line 68
    .line 69
    move-wide/from16 v21, v8

    .line 70
    .line 71
    iget-object v8, v7, Lkh0;->b:[Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v9, v7, Lkh0;->a:[J

    .line 74
    .line 75
    array-length v11, v9

    .line 76
    add-int/lit8 v11, v11, -0x2

    .line 77
    .line 78
    if-ltz v11, :cond_5

    .line 79
    .line 80
    move-wide/from16 v23, v15

    .line 81
    .line 82
    const/4 v15, 0x0

    .line 83
    move/from16 v16, v10

    .line 84
    .line 85
    :goto_2
    move/from16 v25, v11

    .line 86
    .line 87
    aget-wide v10, v9, v15

    .line 88
    .line 89
    move-object/from16 v26, v2

    .line 90
    .line 91
    move-wide/from16 v27, v3

    .line 92
    .line 93
    not-long v2, v10

    .line 94
    shl-long v2, v2, v20

    .line 95
    .line 96
    and-long/2addr v2, v10

    .line 97
    and-long v2, v2, v21

    .line 98
    .line 99
    cmp-long v2, v2, v21

    .line 100
    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    sub-int v2, v15, v25

    .line 104
    .line 105
    not-int v2, v2

    .line 106
    ushr-int/lit8 v2, v2, 0x1f

    .line 107
    .line 108
    rsub-int/lit8 v2, v2, 0x8

    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    :goto_3
    if-ge v3, v2, :cond_3

    .line 112
    .line 113
    and-long v29, v10, v17

    .line 114
    .line 115
    cmp-long v4, v29, v23

    .line 116
    .line 117
    if-gez v4, :cond_2

    .line 118
    .line 119
    shl-int/lit8 v4, v15, 0x3

    .line 120
    .line 121
    add-int/2addr v4, v3

    .line 122
    aget-object v29, v8, v4

    .line 123
    .line 124
    check-cast v29, Lad1;

    .line 125
    .line 126
    invoke-virtual/range {v29 .. v29}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v29

    .line 130
    check-cast v29, Lb60;

    .line 131
    .line 132
    move/from16 v30, v3

    .line 133
    .line 134
    if-eqz v29, :cond_0

    .line 135
    .line 136
    invoke-virtual/range {v29 .. v29}, Lb60;->H()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    move/from16 v29, v6

    .line 141
    .line 142
    const/4 v6, 0x1

    .line 143
    if-ne v3, v6, :cond_1

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_0
    move/from16 v29, v6

    .line 147
    .line 148
    :cond_1
    invoke-virtual {v7, v4}, Lkh0;->m(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_2
    move/from16 v30, v3

    .line 153
    .line 154
    move/from16 v29, v6

    .line 155
    .line 156
    :goto_4
    shr-long v10, v10, v16

    .line 157
    .line 158
    add-int/lit8 v3, v30, 0x1

    .line 159
    .line 160
    move/from16 v6, v29

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_3
    move/from16 v29, v6

    .line 164
    .line 165
    move/from16 v3, v16

    .line 166
    .line 167
    if-ne v2, v3, :cond_6

    .line 168
    .line 169
    :goto_5
    move/from16 v11, v25

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_4
    move/from16 v29, v6

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :goto_6
    if-eq v15, v11, :cond_6

    .line 176
    .line 177
    add-int/lit8 v15, v15, 0x1

    .line 178
    .line 179
    move-object/from16 v2, v26

    .line 180
    .line 181
    move-wide/from16 v3, v27

    .line 182
    .line 183
    move/from16 v6, v29

    .line 184
    .line 185
    const/16 v16, 0x8

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_5
    move-object/from16 v26, v2

    .line 189
    .line 190
    move-wide/from16 v27, v3

    .line 191
    .line 192
    move/from16 v29, v6

    .line 193
    .line 194
    move-wide/from16 v23, v15

    .line 195
    .line 196
    :cond_6
    const/16 v3, 0x8

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_7
    move-object/from16 v26, v2

    .line 200
    .line 201
    move-wide/from16 v27, v3

    .line 202
    .line 203
    move/from16 v29, v6

    .line 204
    .line 205
    move/from16 v20, v7

    .line 206
    .line 207
    move-wide/from16 v21, v8

    .line 208
    .line 209
    move-wide/from16 v23, v15

    .line 210
    .line 211
    move v3, v10

    .line 212
    :goto_7
    shr-long v6, v27, v3

    .line 213
    .line 214
    add-int/lit8 v2, v29, 0x1

    .line 215
    .line 216
    move v10, v3

    .line 217
    move-wide v3, v6

    .line 218
    move/from16 v7, v20

    .line 219
    .line 220
    move-wide/from16 v8, v21

    .line 221
    .line 222
    move-wide/from16 v15, v23

    .line 223
    .line 224
    move v6, v2

    .line 225
    move-object/from16 v2, v26

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_8
    move-object/from16 v26, v2

    .line 230
    .line 231
    move/from16 v20, v7

    .line 232
    .line 233
    move-wide/from16 v21, v8

    .line 234
    .line 235
    move v3, v10

    .line 236
    move-wide/from16 v23, v15

    .line 237
    .line 238
    if-ne v5, v3, :cond_b

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_9
    move-object/from16 v26, v2

    .line 242
    .line 243
    move/from16 v20, v7

    .line 244
    .line 245
    move-wide/from16 v21, v8

    .line 246
    .line 247
    move-wide/from16 v23, v15

    .line 248
    .line 249
    :goto_8
    if-eq v14, v13, :cond_b

    .line 250
    .line 251
    add-int/lit8 v14, v14, 0x1

    .line 252
    .line 253
    move/from16 v7, v20

    .line 254
    .line 255
    move-wide/from16 v8, v21

    .line 256
    .line 257
    move-wide/from16 v15, v23

    .line 258
    .line 259
    move-object/from16 v2, v26

    .line 260
    .line 261
    const/16 v10, 0x8

    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :cond_a
    move/from16 v20, v7

    .line 266
    .line 267
    move-wide/from16 v21, v8

    .line 268
    .line 269
    const-wide/16 v17, 0xff

    .line 270
    .line 271
    const-wide/16 v23, 0x80

    .line 272
    .line 273
    :cond_b
    iget-object v2, v0, Lyb0;->q:Ljh0;

    .line 274
    .line 275
    if-eqz v2, :cond_f

    .line 276
    .line 277
    iget-object v3, v2, Ljh0;->a:[J

    .line 278
    .line 279
    array-length v4, v3

    .line 280
    add-int/lit8 v4, v4, -0x2

    .line 281
    .line 282
    if-ltz v4, :cond_f

    .line 283
    .line 284
    const/4 v5, 0x0

    .line 285
    :goto_9
    aget-wide v6, v3, v5

    .line 286
    .line 287
    not-long v8, v6

    .line 288
    shl-long v8, v8, v20

    .line 289
    .line 290
    and-long/2addr v8, v6

    .line 291
    and-long v8, v8, v21

    .line 292
    .line 293
    cmp-long v8, v8, v21

    .line 294
    .line 295
    if-eqz v8, :cond_e

    .line 296
    .line 297
    sub-int v8, v5, v4

    .line 298
    .line 299
    not-int v8, v8

    .line 300
    ushr-int/lit8 v8, v8, 0x1f

    .line 301
    .line 302
    const/16 v16, 0x8

    .line 303
    .line 304
    rsub-int/lit8 v10, v8, 0x8

    .line 305
    .line 306
    const/4 v8, 0x0

    .line 307
    :goto_a
    if-ge v8, v10, :cond_d

    .line 308
    .line 309
    and-long v11, v6, v17

    .line 310
    .line 311
    cmp-long v9, v11, v23

    .line 312
    .line 313
    if-gez v9, :cond_c

    .line 314
    .line 315
    shl-int/lit8 v9, v5, 0x3

    .line 316
    .line 317
    add-int/2addr v9, v8

    .line 318
    iget-object v11, v2, Ljh0;->b:[Ljava/lang/Object;

    .line 319
    .line 320
    aget-object v11, v11, v9

    .line 321
    .line 322
    iget-object v12, v2, Ljh0;->c:[Ljava/lang/Object;

    .line 323
    .line 324
    aget-object v12, v12, v9

    .line 325
    .line 326
    check-cast v12, Lkh0;

    .line 327
    .line 328
    check-cast v11, Lez;

    .line 329
    .line 330
    invoke-virtual {v12}, Lkh0;->g()Z

    .line 331
    .line 332
    .line 333
    move-result v11

    .line 334
    if-eqz v11, :cond_c

    .line 335
    .line 336
    invoke-virtual {v2, v9}, Ljh0;->l(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    :cond_c
    const/16 v9, 0x8

    .line 340
    .line 341
    shr-long/2addr v6, v9

    .line 342
    add-int/lit8 v8, v8, 0x1

    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_d
    const/16 v9, 0x8

    .line 346
    .line 347
    if-ne v10, v9, :cond_f

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_e
    const/16 v9, 0x8

    .line 351
    .line 352
    :goto_b
    if-eq v5, v4, :cond_f

    .line 353
    .line 354
    add-int/lit8 v5, v5, 0x1

    .line 355
    .line 356
    goto :goto_9

    .line 357
    :cond_f
    iget-object v2, v0, Lyb0;->q:Ljh0;

    .line 358
    .line 359
    if-nez v2, :cond_10

    .line 360
    .line 361
    new-instance v2, Ljh0;

    .line 362
    .line 363
    invoke-direct {v2}, Ljh0;-><init>()V

    .line 364
    .line 365
    .line 366
    iput-object v2, v0, Lyb0;->q:Ljh0;

    .line 367
    .line 368
    :cond_10
    invoke-virtual {v2, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    if-nez v0, :cond_11

    .line 373
    .line 374
    new-instance v0, Lkh0;

    .line 375
    .line 376
    invoke-direct {v0}, Lkh0;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v1, v0}, Ljh0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    :cond_11
    check-cast v0, Lkh0;

    .line 383
    .line 384
    new-instance v1, Lad1;

    .line 385
    .line 386
    move-object/from16 v2, p1

    .line 387
    .line 388
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0, v1}, Lkh0;->k(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    return-void
.end method

.method public abstract c0(Lo2;)I
.end method

.method public final d0(Lzq0;JJ)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v7, v1, Lyb0;->q:Ljh0;

    .line 4
    .line 5
    iget-object v0, v1, Lyb0;->p:Llw0;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Llw0;

    .line 10
    .line 11
    invoke-direct {v0}, Llw0;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, v1, Lyb0;->p:Llw0;

    .line 15
    .line 16
    :cond_0
    move-object v8, v0

    .line 17
    invoke-virtual {v1}, Lyb0;->n0()Lb60;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, Lb60;->r:Ldn0;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast v0, Lw3;

    .line 26
    .line 27
    invoke-virtual {v0}, Lw3;->getSnapshotObserver()Lfn0;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    if-eqz v9, :cond_1

    .line 32
    .line 33
    sget-object v10, Lp3;->s:Lp3;

    .line 34
    .line 35
    new-instance v0, Lwb0;

    .line 36
    .line 37
    move-object/from16 v6, p1

    .line 38
    .line 39
    move-wide/from16 v2, p2

    .line 40
    .line 41
    move-wide/from16 v4, p4

    .line 42
    .line 43
    invoke-direct/range {v0 .. v6}, Lwb0;-><init>(Lyb0;JJLzq0;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v9, Lfn0;->a:Le31;

    .line 47
    .line 48
    invoke-virtual {v1, v6, v10, v0}, Le31;->b(Ljava/lang/Object;Lsw;Lhw;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lyb0;->m()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget-object v1, v8, Llw0;->e:Lkh0;

    .line 56
    .line 57
    iget-object v2, v8, Llw0;->f:Lkh0;

    .line 58
    .line 59
    iget v3, v8, Llw0;->a:I

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    :goto_0
    if-ge v5, v3, :cond_4

    .line 63
    .line 64
    iget-object v6, v8, Llw0;->d:[B

    .line 65
    .line 66
    aget-byte v6, v6, v5

    .line 67
    .line 68
    const/4 v9, 0x3

    .line 69
    if-ne v6, v9, :cond_2

    .line 70
    .line 71
    iget-object v6, v8, Llw0;->b:[Lez;

    .line 72
    .line 73
    aget-object v6, v6, v5

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v6}, Lkh0;->k(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    if-eqz v6, :cond_3

    .line 83
    .line 84
    if-eqz v7, :cond_3

    .line 85
    .line 86
    iget-object v6, v8, Llw0;->b:[Lez;

    .line 87
    .line 88
    aget-object v6, v6, v5

    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7, v6}, Ljh0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Lkh0;

    .line 98
    .line 99
    if-eqz v6, :cond_3

    .line 100
    .line 101
    invoke-virtual {v1, v6}, Lkh0;->j(Lkh0;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_4
    iget v3, v8, Llw0;->a:I

    .line 108
    .line 109
    const/4 v5, 0x0

    .line 110
    const/4 v6, 0x0

    .line 111
    :goto_2
    const/4 v7, 0x2

    .line 112
    if-ge v5, v3, :cond_7

    .line 113
    .line 114
    iget-object v9, v8, Llw0;->d:[B

    .line 115
    .line 116
    aget-byte v10, v9, v5

    .line 117
    .line 118
    if-ne v10, v7, :cond_5

    .line 119
    .line 120
    add-int/lit8 v6, v6, 0x1

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_5
    if-lez v6, :cond_6

    .line 124
    .line 125
    sub-int v10, v5, v6

    .line 126
    .line 127
    iget-object v11, v8, Llw0;->b:[Lez;

    .line 128
    .line 129
    aget-object v12, v11, v5

    .line 130
    .line 131
    aput-object v12, v11, v10

    .line 132
    .line 133
    :cond_6
    :goto_3
    aput-byte v7, v9, v5

    .line 134
    .line 135
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_7
    iget v3, v8, Llw0;->a:I

    .line 139
    .line 140
    sub-int v5, v3, v6

    .line 141
    .line 142
    :goto_4
    const/4 v9, 0x0

    .line 143
    if-ge v5, v3, :cond_8

    .line 144
    .line 145
    iget-object v10, v8, Llw0;->b:[Lez;

    .line 146
    .line 147
    aput-object v9, v10, v5

    .line 148
    .line 149
    add-int/lit8 v5, v5, 0x1

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_8
    iget v3, v8, Llw0;->a:I

    .line 153
    .line 154
    sub-int/2addr v3, v6

    .line 155
    iput v3, v8, Llw0;->a:I

    .line 156
    .line 157
    invoke-virtual/range {p0 .. p0}, Lyb0;->p0()Lyb0;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    iget-object v5, v2, Lkh0;->b:[Ljava/lang/Object;

    .line 162
    .line 163
    iget-object v6, v2, Lkh0;->a:[J

    .line 164
    .line 165
    array-length v8, v6

    .line 166
    sub-int/2addr v8, v7

    .line 167
    const/4 v14, 0x7

    .line 168
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    move/from16 p1, v7

    .line 174
    .line 175
    const/16 v7, 0x8

    .line 176
    .line 177
    if-ltz v8, :cond_11

    .line 178
    .line 179
    const-wide/16 p3, 0x80

    .line 180
    .line 181
    const/4 v9, 0x0

    .line 182
    :goto_5
    aget-wide v10, v6, v9

    .line 183
    .line 184
    const-wide/16 v17, 0xff

    .line 185
    .line 186
    not-long v12, v10

    .line 187
    shl-long/2addr v12, v14

    .line 188
    and-long/2addr v12, v10

    .line 189
    and-long/2addr v12, v15

    .line 190
    cmp-long v12, v12, v15

    .line 191
    .line 192
    if-eqz v12, :cond_10

    .line 193
    .line 194
    sub-int v12, v9, v8

    .line 195
    .line 196
    not-int v12, v12

    .line 197
    ushr-int/lit8 v12, v12, 0x1f

    .line 198
    .line 199
    rsub-int/lit8 v12, v12, 0x8

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    :goto_6
    if-ge v13, v12, :cond_f

    .line 203
    .line 204
    and-long v19, v10, v17

    .line 205
    .line 206
    cmp-long v19, v19, p3

    .line 207
    .line 208
    if-gez v19, :cond_d

    .line 209
    .line 210
    shl-int/lit8 v19, v9, 0x3

    .line 211
    .line 212
    add-int v19, v19, v13

    .line 213
    .line 214
    aget-object v19, v5, v19

    .line 215
    .line 216
    move/from16 p5, v14

    .line 217
    .line 218
    move-object/from16 v14, v19

    .line 219
    .line 220
    check-cast v14, Lez;

    .line 221
    .line 222
    move-wide/from16 v19, v15

    .line 223
    .line 224
    if-nez v3, :cond_9

    .line 225
    .line 226
    move-object/from16 v15, p0

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_9
    move-object v15, v3

    .line 230
    :goto_7
    move/from16 v21, v7

    .line 231
    .line 232
    move-object v4, v15

    .line 233
    :goto_8
    iget-object v7, v4, Lyb0;->p:Llw0;

    .line 234
    .line 235
    if-eqz v7, :cond_a

    .line 236
    .line 237
    iget-object v7, v7, Llw0;->b:[Lez;

    .line 238
    .line 239
    invoke-static {v7, v14}, Lf9;->l0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    if-ltz v7, :cond_a

    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_a
    invoke-virtual {v4}, Lyb0;->p0()Lyb0;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    if-nez v7, :cond_c

    .line 251
    .line 252
    :goto_9
    iget-object v4, v4, Lyb0;->q:Ljh0;

    .line 253
    .line 254
    if-eqz v4, :cond_b

    .line 255
    .line 256
    invoke-virtual {v4, v14}, Ljh0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    check-cast v4, Lkh0;

    .line 261
    .line 262
    goto :goto_a

    .line 263
    :cond_b
    const/4 v4, 0x0

    .line 264
    :goto_a
    if-eqz v4, :cond_e

    .line 265
    .line 266
    invoke-virtual {v15, v4}, Lyb0;->t0(Lkh0;)V

    .line 267
    .line 268
    .line 269
    goto :goto_b

    .line 270
    :cond_c
    move-object v4, v7

    .line 271
    goto :goto_8

    .line 272
    :cond_d
    move/from16 v21, v7

    .line 273
    .line 274
    move/from16 p5, v14

    .line 275
    .line 276
    move-wide/from16 v19, v15

    .line 277
    .line 278
    :cond_e
    :goto_b
    shr-long v10, v10, v21

    .line 279
    .line 280
    add-int/lit8 v13, v13, 0x1

    .line 281
    .line 282
    move/from16 v14, p5

    .line 283
    .line 284
    move-wide/from16 v15, v19

    .line 285
    .line 286
    move/from16 v7, v21

    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_f
    move v4, v7

    .line 290
    move/from16 p5, v14

    .line 291
    .line 292
    move-wide/from16 v19, v15

    .line 293
    .line 294
    if-ne v12, v4, :cond_12

    .line 295
    .line 296
    goto :goto_c

    .line 297
    :cond_10
    move/from16 p5, v14

    .line 298
    .line 299
    move-wide/from16 v19, v15

    .line 300
    .line 301
    :goto_c
    if-eq v9, v8, :cond_12

    .line 302
    .line 303
    add-int/lit8 v9, v9, 0x1

    .line 304
    .line 305
    move/from16 v14, p5

    .line 306
    .line 307
    move-wide/from16 v15, v19

    .line 308
    .line 309
    const/16 v7, 0x8

    .line 310
    .line 311
    goto/16 :goto_5

    .line 312
    .line 313
    :cond_11
    move/from16 p5, v14

    .line 314
    .line 315
    move-wide/from16 v19, v15

    .line 316
    .line 317
    const-wide/16 p3, 0x80

    .line 318
    .line 319
    const-wide/16 v17, 0xff

    .line 320
    .line 321
    :cond_12
    invoke-virtual {v2}, Lkh0;->b()V

    .line 322
    .line 323
    .line 324
    iget-object v2, v1, Lkh0;->b:[Ljava/lang/Object;

    .line 325
    .line 326
    iget-object v3, v1, Lkh0;->a:[J

    .line 327
    .line 328
    array-length v4, v3

    .line 329
    add-int/lit8 v4, v4, -0x2

    .line 330
    .line 331
    if-ltz v4, :cond_17

    .line 332
    .line 333
    const/4 v5, 0x0

    .line 334
    :goto_d
    aget-wide v6, v3, v5

    .line 335
    .line 336
    not-long v8, v6

    .line 337
    shl-long v8, v8, p5

    .line 338
    .line 339
    and-long/2addr v8, v6

    .line 340
    and-long v8, v8, v19

    .line 341
    .line 342
    cmp-long v8, v8, v19

    .line 343
    .line 344
    if-eqz v8, :cond_16

    .line 345
    .line 346
    sub-int v8, v5, v4

    .line 347
    .line 348
    not-int v8, v8

    .line 349
    ushr-int/lit8 v8, v8, 0x1f

    .line 350
    .line 351
    const/16 v21, 0x8

    .line 352
    .line 353
    rsub-int/lit8 v8, v8, 0x8

    .line 354
    .line 355
    const/4 v9, 0x0

    .line 356
    :goto_e
    if-ge v9, v8, :cond_15

    .line 357
    .line 358
    and-long v10, v6, v17

    .line 359
    .line 360
    cmp-long v10, v10, p3

    .line 361
    .line 362
    if-gez v10, :cond_14

    .line 363
    .line 364
    shl-int/lit8 v10, v5, 0x3

    .line 365
    .line 366
    add-int/2addr v10, v9

    .line 367
    aget-object v10, v2, v10

    .line 368
    .line 369
    check-cast v10, Lad1;

    .line 370
    .line 371
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    check-cast v10, Lb60;

    .line 376
    .line 377
    if-eqz v10, :cond_14

    .line 378
    .line 379
    if-eqz v0, :cond_13

    .line 380
    .line 381
    const/4 v11, 0x0

    .line 382
    invoke-virtual {v10, v11}, Lb60;->U(Z)V

    .line 383
    .line 384
    .line 385
    goto :goto_f

    .line 386
    :cond_13
    const/4 v11, 0x0

    .line 387
    invoke-virtual {v10, v11}, Lb60;->W(Z)V

    .line 388
    .line 389
    .line 390
    :goto_f
    const/16 v10, 0x8

    .line 391
    .line 392
    goto :goto_10

    .line 393
    :cond_14
    const/4 v11, 0x0

    .line 394
    goto :goto_f

    .line 395
    :goto_10
    shr-long/2addr v6, v10

    .line 396
    add-int/lit8 v9, v9, 0x1

    .line 397
    .line 398
    goto :goto_e

    .line 399
    :cond_15
    const/16 v10, 0x8

    .line 400
    .line 401
    const/4 v11, 0x0

    .line 402
    if-ne v8, v10, :cond_17

    .line 403
    .line 404
    goto :goto_11

    .line 405
    :cond_16
    const/16 v10, 0x8

    .line 406
    .line 407
    const/4 v11, 0x0

    .line 408
    :goto_11
    if-eq v5, v4, :cond_17

    .line 409
    .line 410
    add-int/lit8 v5, v5, 0x1

    .line 411
    .line 412
    goto :goto_d

    .line 413
    :cond_17
    invoke-virtual {v1}, Lkh0;->b()V

    .line 414
    .line 415
    .line 416
    return-void
.end method

.method public final e0(Lyd0;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lyb0;->q:Ljh0;

    .line 2
    .line 3
    iget-boolean v1, p0, Lyb0;->n:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_6

    .line 8
    .line 9
    :cond_0
    invoke-interface {p1}, Lyd0;->d()Lsw;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_5

    .line 15
    .line 16
    if-eqz v0, :cond_b

    .line 17
    .line 18
    iget-object p1, v0, Ljh0;->c:[Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v1, v0, Ljh0;->a:[J

    .line 21
    .line 22
    array-length v3, v1

    .line 23
    add-int/lit8 v3, v3, -0x2

    .line 24
    .line 25
    if-ltz v3, :cond_4

    .line 26
    .line 27
    move v4, v2

    .line 28
    :goto_0
    aget-wide v5, v1, v4

    .line 29
    .line 30
    not-long v7, v5

    .line 31
    const/4 v9, 0x7

    .line 32
    shl-long/2addr v7, v9

    .line 33
    and-long/2addr v7, v5

    .line 34
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v7, v9

    .line 40
    cmp-long v7, v7, v9

    .line 41
    .line 42
    if-eqz v7, :cond_3

    .line 43
    .line 44
    sub-int v7, v4, v3

    .line 45
    .line 46
    not-int v7, v7

    .line 47
    ushr-int/lit8 v7, v7, 0x1f

    .line 48
    .line 49
    const/16 v8, 0x8

    .line 50
    .line 51
    rsub-int/lit8 v7, v7, 0x8

    .line 52
    .line 53
    move v9, v2

    .line 54
    :goto_1
    if-ge v9, v7, :cond_2

    .line 55
    .line 56
    const-wide/16 v10, 0xff

    .line 57
    .line 58
    and-long/2addr v10, v5

    .line 59
    const-wide/16 v12, 0x80

    .line 60
    .line 61
    cmp-long v10, v10, v12

    .line 62
    .line 63
    if-gez v10, :cond_1

    .line 64
    .line 65
    shl-int/lit8 v10, v4, 0x3

    .line 66
    .line 67
    add-int/2addr v10, v9

    .line 68
    aget-object v10, p1, v10

    .line 69
    .line 70
    check-cast v10, Lkh0;

    .line 71
    .line 72
    invoke-virtual {p0, v10}, Lyb0;->t0(Lkh0;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    shr-long/2addr v5, v8

    .line 76
    add-int/lit8 v9, v9, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    if-ne v7, v8, :cond_4

    .line 80
    .line 81
    :cond_3
    if-eq v4, v3, :cond_4

    .line 82
    .line 83
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    invoke-virtual {v0}, Ljh0;->a()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_5
    iget-object v0, p0, Lyb0;->j:Lsw;

    .line 91
    .line 92
    const/4 v3, 0x1

    .line 93
    if-eq v0, v1, :cond_6

    .line 94
    .line 95
    move v0, v3

    .line 96
    goto :goto_2

    .line 97
    :cond_6
    move v0, v2

    .line 98
    :goto_2
    const-wide/16 v4, 0x0

    .line 99
    .line 100
    if-nez v0, :cond_9

    .line 101
    .line 102
    invoke-virtual {p0}, Lyb0;->r0()Lvb0;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-boolean v1, v1, Lvb0;->d:Z

    .line 107
    .line 108
    if-eqz v1, :cond_9

    .line 109
    .line 110
    invoke-virtual {p0}, Lyb0;->l0()Li50;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {v0, v4, v5}, Li50;->d(J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    invoke-static {v4, v5}, Li4;->D(J)J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    invoke-interface {v0}, Li50;->G()J

    .line 123
    .line 124
    .line 125
    move-result-wide v0

    .line 126
    invoke-virtual {p0}, Lyb0;->r0()Lvb0;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    iget-wide v6, v6, Lvb0;->e:J

    .line 131
    .line 132
    invoke-static {v4, v5, v6, v7}, Lw20;->a(JJ)Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_7

    .line 137
    .line 138
    invoke-virtual {p0}, Lyb0;->r0()Lvb0;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    iget-wide v6, v6, Lvb0;->f:J

    .line 143
    .line 144
    invoke-static {v0, v1, v6, v7}, Ld30;->a(JJ)Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-nez v6, :cond_8

    .line 149
    .line 150
    :cond_7
    move v2, v3

    .line 151
    :cond_8
    move-wide v3, v4

    .line 152
    move-wide v5, v0

    .line 153
    move v0, v2

    .line 154
    goto :goto_3

    .line 155
    :cond_9
    const-wide v1, 0x7fffffff7fffffffL

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    move-wide v5, v4

    .line 161
    move-wide v3, v1

    .line 162
    :goto_3
    if-eqz v0, :cond_b

    .line 163
    .line 164
    iget-object v0, p0, Lyb0;->k:Lzq0;

    .line 165
    .line 166
    if-eqz v0, :cond_a

    .line 167
    .line 168
    iput-object p1, v0, Lzq0;->d:Lyd0;

    .line 169
    .line 170
    :goto_4
    move-object v1, p0

    .line 171
    move-object v2, v0

    .line 172
    goto :goto_5

    .line 173
    :cond_a
    new-instance v0, Lzq0;

    .line 174
    .line 175
    invoke-direct {v0, p1, p0}, Lzq0;-><init>(Lyd0;Lyb0;)V

    .line 176
    .line 177
    .line 178
    iput-object v0, p0, Lyb0;->k:Lzq0;

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :goto_5
    invoke-virtual/range {v1 .. v6}, Lyb0;->d0(Lzq0;JJ)V

    .line 182
    .line 183
    .line 184
    invoke-interface {p1}, Lyd0;->d()Lsw;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    iput-object p0, v1, Lyb0;->j:Lsw;

    .line 189
    .line 190
    :cond_b
    :goto_6
    return-void
.end method

.method public final g0(Lo2;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lyb0;->m0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lyb0;->c0(Lo2;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    :goto_0
    return v1

    .line 17
    :cond_1
    instance-of p1, p1, Lac1;

    .line 18
    .line 19
    iget-wide v1, p0, Lxq0;->h:J

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    const/16 p0, 0x20

    .line 24
    .line 25
    shr-long p0, v1, p0

    .line 26
    .line 27
    :goto_1
    long-to-int p0, p0

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    const-wide p0, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr p0, v1

    .line 35
    goto :goto_1

    .line 36
    :goto_2
    add-int/2addr v0, p0

    .line 37
    return v0
.end method

.method public abstract k0()Lyb0;
.end method

.method public abstract l0()Li50;
.end method

.method public m()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract m0()Z
.end method

.method public final n(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyb0;->p0()Lyb0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lyb0;->n0()Lb60;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    invoke-virtual {p0}, Lyb0;->n0()Lb60;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v0, v2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iput-boolean p1, p0, Lyb0;->l:Z

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, Lb60;->J:Lf60;

    .line 30
    .line 31
    iget-object v2, v2, Lf60;->d:Lx50;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object v2, v1

    .line 35
    :goto_1
    sget-object v3, Lx50;->f:Lx50;

    .line 36
    .line 37
    if-eq v2, v3, :cond_5

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-object v0, v0, Lb60;->J:Lf60;

    .line 42
    .line 43
    iget-object v1, v0, Lf60;->d:Lx50;

    .line 44
    .line 45
    :cond_3
    sget-object v0, Lx50;->g:Lx50;

    .line 46
    .line 47
    if-ne v1, v0, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    return-void

    .line 51
    :cond_5
    :goto_2
    iput-boolean p1, p0, Lyb0;->l:Z

    .line 52
    .line 53
    return-void
.end method

.method public abstract n0()Lb60;
.end method

.method public abstract o0()Lyd0;
.end method

.method public abstract p0()Lyb0;
.end method

.method public abstract q0()J
.end method

.method public final r0()Lvb0;
    .locals 1

    .line 1
    iget-object v0, p0, Lyb0;->i:Lvb0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lvb0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lvb0;-><init>(Lyb0;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyb0;->i:Lvb0;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final t0(Lkh0;)V
    .locals 13

    .line 1
    iget-object v0, p1, Lkh0;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p1, p1, Lkh0;->a:[J

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    add-int/lit8 v1, v1, -0x2

    .line 7
    .line 8
    if-ltz v1, :cond_4

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    aget-wide v4, p1, v3

    .line 13
    .line 14
    not-long v6, v4

    .line 15
    const/4 v8, 0x7

    .line 16
    shl-long/2addr v6, v8

    .line 17
    and-long/2addr v6, v4

    .line 18
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v6, v8

    .line 24
    cmp-long v6, v6, v8

    .line 25
    .line 26
    if-eqz v6, :cond_3

    .line 27
    .line 28
    sub-int v6, v3, v1

    .line 29
    .line 30
    not-int v6, v6

    .line 31
    ushr-int/lit8 v6, v6, 0x1f

    .line 32
    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    rsub-int/lit8 v6, v6, 0x8

    .line 36
    .line 37
    move v8, v2

    .line 38
    :goto_1
    if-ge v8, v6, :cond_2

    .line 39
    .line 40
    const-wide/16 v9, 0xff

    .line 41
    .line 42
    and-long/2addr v9, v4

    .line 43
    const-wide/16 v11, 0x80

    .line 44
    .line 45
    cmp-long v9, v9, v11

    .line 46
    .line 47
    if-gez v9, :cond_1

    .line 48
    .line 49
    shl-int/lit8 v9, v3, 0x3

    .line 50
    .line 51
    add-int/2addr v9, v8

    .line 52
    aget-object v9, v0, v9

    .line 53
    .line 54
    check-cast v9, Lad1;

    .line 55
    .line 56
    invoke-virtual {v9}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    check-cast v9, Lb60;

    .line 61
    .line 62
    if-eqz v9, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0}, Lyb0;->m()Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    if-eqz v10, :cond_0

    .line 69
    .line 70
    invoke-virtual {v9, v2}, Lb60;->U(Z)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_0
    invoke-virtual {v9, v2}, Lb60;->W(Z)V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_2
    shr-long/2addr v4, v7

    .line 78
    add-int/lit8 v8, v8, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    if-ne v6, v7, :cond_4

    .line 82
    .line 83
    :cond_3
    if-eq v3, v1, :cond_4

    .line 84
    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    return-void
.end method

.method public abstract u0()V
.end method
