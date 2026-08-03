.class public final Lk/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk/k1;


# instance fields
.field public final a:Lu2/c;

.field public b:J

.field public final c:Lk/g0;

.field public final d:Li0/j1;

.field public final e:Z

.field public f:Z

.field public g:J

.field public h:J

.field public final i:Lx1/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu2/c;JLp/x0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lk/i;->a:Lu2/c;

    .line 5
    .line 6
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lk/i;->b:J

    .line 12
    .line 13
    new-instance p2, Lk/g0;

    .line 14
    .line 15
    invoke-static {p3, p4}, Lf1/c0;->w(J)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-direct {p2, p1, p3}, Lk/g0;-><init>(Landroid/content/Context;I)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lk/i;->c:Lk/g0;

    .line 23
    .line 24
    sget-object p1, Li0/e;->j:Li0/e;

    .line 25
    .line 26
    new-instance p3, Li0/j1;

    .line 27
    .line 28
    sget-object p4, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    invoke-direct {p3, p4, p1}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 31
    .line 32
    .line 33
    iput-object p3, p0, Lk/i;->d:Li0/j1;

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Lk/i;->e:Z

    .line 37
    .line 38
    const-wide/16 p3, 0x0

    .line 39
    .line 40
    iput-wide p3, p0, Lk/i;->g:J

    .line 41
    .line 42
    const-wide/16 p3, -0x1

    .line 43
    .line 44
    iput-wide p3, p0, Lk/i;->h:J

    .line 45
    .line 46
    new-instance p1, Lc0/g;

    .line 47
    .line 48
    const/4 p3, 0x5

    .line 49
    invoke-direct {p1, p0, p3}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    sget-object p3, Ls1/h0;->a:Ls1/k;

    .line 53
    .line 54
    new-instance p3, Ls1/l0;

    .line 55
    .line 56
    const/4 p4, 0x0

    .line 57
    invoke-direct {p3, p4, p4, p4, p1}, Ls1/l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 58
    .line 59
    .line 60
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 p4, 0x1f

    .line 63
    .line 64
    if-lt p1, p4, :cond_0

    .line 65
    .line 66
    new-instance p1, Lk/n0;

    .line 67
    .line 68
    invoke-direct {p1, p3, p0, p2}, Lk/n0;-><init>(Ls1/l0;Lk/i;Lk/g0;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance p1, Lk/n0;

    .line 73
    .line 74
    invoke-direct {p1, p3, p0, p2, p5}, Lk/n0;-><init>(Ls1/l0;Lk/i;Lk/g0;Lp/x0;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    iput-object p1, p0, Lk/i;->i:Lx1/j;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final a(JLm/n2;Lyf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    instance-of v5, v4, Lk/h;

    .line 10
    .line 11
    if-eqz v5, :cond_0

    .line 12
    .line 13
    move-object v5, v4

    .line 14
    check-cast v5, Lk/h;

    .line 15
    .line 16
    iget v6, v5, Lk/h;->j:I

    .line 17
    .line 18
    const/high16 v7, -0x80000000

    .line 19
    .line 20
    and-int v8, v6, v7

    .line 21
    .line 22
    if-eqz v8, :cond_0

    .line 23
    .line 24
    sub-int/2addr v6, v7

    .line 25
    iput v6, v5, Lk/h;->j:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v5, Lk/h;

    .line 29
    .line 30
    invoke-direct {v5, v0, v4}, Lk/h;-><init>(Lk/i;Lyf/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v4, v5, Lk/h;->h:Ljava/lang/Object;

    .line 34
    .line 35
    iget v6, v5, Lk/h;->j:I

    .line 36
    .line 37
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 38
    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x0

    .line 42
    iget-object v11, v0, Lk/i;->c:Lk/g0;

    .line 43
    .line 44
    if-eqz v6, :cond_3

    .line 45
    .line 46
    if-eq v6, v9, :cond_2

    .line 47
    .line 48
    if-ne v6, v8, :cond_1

    .line 49
    .line 50
    iget-wide v1, v5, Lk/h;->g:J

    .line 51
    .line 52
    invoke-static {v4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    return-object v1

    .line 64
    :cond_2
    invoke-static {v4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object v7

    .line 68
    :cond_3
    invoke-static {v4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-wide v12, v0, Lk/i;->g:J

    .line 72
    .line 73
    invoke-static {v12, v13}, Le1/e;->c(J)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 78
    .line 79
    if-eqz v4, :cond_5

    .line 80
    .line 81
    iput v9, v5, Lk/h;->j:I

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v4, Lm/n2;

    .line 87
    .line 88
    iget-object v3, v3, Lm/n2;->k:Lm/o2;

    .line 89
    .line 90
    invoke-direct {v4, v3, v5}, Lm/n2;-><init>(Lm/o2;Lwf/c;)V

    .line 91
    .line 92
    .line 93
    iput-wide v1, v4, Lm/n2;->j:J

    .line 94
    .line 95
    invoke-virtual {v4, v7}, Lm/n2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-ne v1, v6, :cond_4

    .line 100
    .line 101
    goto/16 :goto_4

    .line 102
    .line 103
    :cond_4
    return-object v7

    .line 104
    :cond_5
    iget-object v4, v11, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 105
    .line 106
    invoke-static {v4}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    const/16 v9, 0x20

    .line 111
    .line 112
    iget-object v12, v0, Lk/i;->a:Lu2/c;

    .line 113
    .line 114
    if-eqz v4, :cond_6

    .line 115
    .line 116
    invoke-static {v1, v2}, Lu2/q;->b(J)F

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    cmpg-float v4, v4, v10

    .line 121
    .line 122
    if-gez v4, :cond_6

    .line 123
    .line 124
    invoke-virtual {v11}, Lk/g0;->c()Landroid/widget/EdgeEffect;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-static {v1, v2}, Lu2/q;->b(J)F

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    iget-wide v14, v0, Lk/i;->g:J

    .line 133
    .line 134
    shr-long/2addr v14, v9

    .line 135
    long-to-int v9, v14

    .line 136
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    invoke-static {v4, v13, v9, v12}, Lk/n;->e(Landroid/widget/EdgeEffect;FFLu2/c;)F

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    goto :goto_1

    .line 145
    :cond_6
    iget-object v4, v11, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 146
    .line 147
    invoke-static {v4}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_7

    .line 152
    .line 153
    invoke-static {v1, v2}, Lu2/q;->b(J)F

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    cmpl-float v4, v4, v10

    .line 158
    .line 159
    if-lez v4, :cond_7

    .line 160
    .line 161
    invoke-virtual {v11}, Lk/g0;->d()Landroid/widget/EdgeEffect;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-static {v1, v2}, Lu2/q;->b(J)F

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    neg-float v13, v13

    .line 170
    iget-wide v14, v0, Lk/i;->g:J

    .line 171
    .line 172
    shr-long/2addr v14, v9

    .line 173
    long-to-int v9, v14

    .line 174
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    invoke-static {v4, v13, v9, v12}, Lk/n;->e(Landroid/widget/EdgeEffect;FFLu2/c;)F

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    neg-float v4, v4

    .line 183
    goto :goto_1

    .line 184
    :cond_7
    move v4, v10

    .line 185
    :goto_1
    iget-object v9, v11, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 186
    .line 187
    invoke-static {v9}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-eqz v9, :cond_8

    .line 192
    .line 193
    invoke-static {v1, v2}, Lu2/q;->c(J)F

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    cmpg-float v9, v9, v10

    .line 198
    .line 199
    if-gez v9, :cond_8

    .line 200
    .line 201
    invoke-virtual {v11}, Lk/g0;->e()Landroid/widget/EdgeEffect;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    invoke-static {v1, v2}, Lu2/q;->c(J)F

    .line 206
    .line 207
    .line 208
    move-result v15

    .line 209
    const-wide v16, 0xffffffffL

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    iget-wide v13, v0, Lk/i;->g:J

    .line 215
    .line 216
    and-long v13, v13, v16

    .line 217
    .line 218
    long-to-int v13, v13

    .line 219
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    invoke-static {v9, v15, v13, v12}, Lk/n;->e(Landroid/widget/EdgeEffect;FFLu2/c;)F

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    goto :goto_2

    .line 228
    :cond_8
    const-wide v16, 0xffffffffL

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    iget-object v9, v11, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 234
    .line 235
    invoke-static {v9}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    if-eqz v9, :cond_9

    .line 240
    .line 241
    invoke-static {v1, v2}, Lu2/q;->c(J)F

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    cmpl-float v9, v9, v10

    .line 246
    .line 247
    if-lez v9, :cond_9

    .line 248
    .line 249
    invoke-virtual {v11}, Lk/g0;->b()Landroid/widget/EdgeEffect;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-static {v1, v2}, Lu2/q;->c(J)F

    .line 254
    .line 255
    .line 256
    move-result v13

    .line 257
    neg-float v13, v13

    .line 258
    iget-wide v14, v0, Lk/i;->g:J

    .line 259
    .line 260
    and-long v14, v14, v16

    .line 261
    .line 262
    long-to-int v14, v14

    .line 263
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 264
    .line 265
    .line 266
    move-result v14

    .line 267
    invoke-static {v9, v13, v14, v12}, Lk/n;->e(Landroid/widget/EdgeEffect;FFLu2/c;)F

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    neg-float v9, v9

    .line 272
    goto :goto_2

    .line 273
    :cond_9
    move v9, v10

    .line 274
    :goto_2
    invoke-static {v4, v9}, La/a;->d(FF)J

    .line 275
    .line 276
    .line 277
    move-result-wide v12

    .line 278
    const-wide/16 v14, 0x0

    .line 279
    .line 280
    cmp-long v4, v12, v14

    .line 281
    .line 282
    if-nez v4, :cond_a

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_a
    invoke-virtual {v0}, Lk/i;->g()V

    .line 286
    .line 287
    .line 288
    :goto_3
    invoke-static {v1, v2, v12, v13}, Lu2/q;->d(JJ)J

    .line 289
    .line 290
    .line 291
    move-result-wide v1

    .line 292
    iput-wide v1, v5, Lk/h;->g:J

    .line 293
    .line 294
    iput v8, v5, Lk/h;->j:I

    .line 295
    .line 296
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    new-instance v4, Lm/n2;

    .line 300
    .line 301
    iget-object v3, v3, Lm/n2;->k:Lm/o2;

    .line 302
    .line 303
    invoke-direct {v4, v3, v5}, Lm/n2;-><init>(Lm/o2;Lwf/c;)V

    .line 304
    .line 305
    .line 306
    iput-wide v1, v4, Lm/n2;->j:J

    .line 307
    .line 308
    invoke-virtual {v4, v7}, Lm/n2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    if-ne v4, v6, :cond_b

    .line 313
    .line 314
    :goto_4
    return-object v6

    .line 315
    :cond_b
    :goto_5
    check-cast v4, Lu2/q;

    .line 316
    .line 317
    iget-wide v3, v4, Lu2/q;->a:J

    .line 318
    .line 319
    invoke-static {v1, v2, v3, v4}, Lu2/q;->d(JJ)J

    .line 320
    .line 321
    .line 322
    move-result-wide v1

    .line 323
    const/4 v3, 0x0

    .line 324
    iput-boolean v3, v0, Lk/i;->f:Z

    .line 325
    .line 326
    invoke-static {v1, v2}, Lu2/q;->b(J)F

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    cmpl-float v3, v3, v10

    .line 331
    .line 332
    const/16 v4, 0x1f

    .line 333
    .line 334
    if-lez v3, :cond_d

    .line 335
    .line 336
    invoke-virtual {v11}, Lk/g0;->c()Landroid/widget/EdgeEffect;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    invoke-static {v1, v2}, Lu2/q;->b(J)F

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    invoke-static {v5}, Lig/a;->X(F)I

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 349
    .line 350
    if-lt v6, v4, :cond_c

    .line 351
    .line 352
    invoke-virtual {v3, v5}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 353
    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_c
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    if-eqz v6, :cond_f

    .line 361
    .line 362
    invoke-virtual {v3, v5}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 363
    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_d
    invoke-static {v1, v2}, Lu2/q;->b(J)F

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    cmpg-float v3, v3, v10

    .line 371
    .line 372
    if-gez v3, :cond_f

    .line 373
    .line 374
    invoke-virtual {v11}, Lk/g0;->d()Landroid/widget/EdgeEffect;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-static {v1, v2}, Lu2/q;->b(J)F

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    invoke-static {v5}, Lig/a;->X(F)I

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    neg-int v5, v5

    .line 387
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 388
    .line 389
    if-lt v6, v4, :cond_e

    .line 390
    .line 391
    invoke-virtual {v3, v5}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 392
    .line 393
    .line 394
    goto :goto_6

    .line 395
    :cond_e
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    if-eqz v6, :cond_f

    .line 400
    .line 401
    invoke-virtual {v3, v5}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 402
    .line 403
    .line 404
    :cond_f
    :goto_6
    invoke-static {v1, v2}, Lu2/q;->c(J)F

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    cmpl-float v3, v3, v10

    .line 409
    .line 410
    if-lez v3, :cond_11

    .line 411
    .line 412
    invoke-virtual {v11}, Lk/g0;->e()Landroid/widget/EdgeEffect;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    invoke-static {v1, v2}, Lu2/q;->c(J)F

    .line 417
    .line 418
    .line 419
    move-result v1

    .line 420
    invoke-static {v1}, Lig/a;->X(F)I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 425
    .line 426
    if-lt v2, v4, :cond_10

    .line 427
    .line 428
    invoke-virtual {v3, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 429
    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_10
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-eqz v2, :cond_13

    .line 437
    .line 438
    invoke-virtual {v3, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 439
    .line 440
    .line 441
    goto :goto_7

    .line 442
    :cond_11
    invoke-static {v1, v2}, Lu2/q;->c(J)F

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    cmpg-float v3, v3, v10

    .line 447
    .line 448
    if-gez v3, :cond_13

    .line 449
    .line 450
    invoke-virtual {v11}, Lk/g0;->b()Landroid/widget/EdgeEffect;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    invoke-static {v1, v2}, Lu2/q;->c(J)F

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    invoke-static {v1}, Lig/a;->X(F)I

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    neg-int v1, v1

    .line 463
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 464
    .line 465
    if-lt v2, v4, :cond_12

    .line 466
    .line 467
    invoke-virtual {v3, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 468
    .line 469
    .line 470
    goto :goto_7

    .line 471
    :cond_12
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-eqz v2, :cond_13

    .line 476
    .line 477
    invoke-virtual {v3, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 478
    .line 479
    .line 480
    :cond_13
    :goto_7
    invoke-virtual {v0}, Lk/i;->e()V

    .line 481
    .line 482
    .line 483
    return-object v7
.end method

.method public final b(JILb0/d0;)J
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    iget-wide v5, v0, Lk/i;->g:J

    .line 10
    .line 11
    invoke-static {v5, v6}, Le1/e;->c(J)Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    iget-object v3, v4, Lb0/d0;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lm/o2;

    .line 20
    .line 21
    iget-object v4, v3, Lm/o2;->k:Lm/u1;

    .line 22
    .line 23
    iget v5, v3, Lm/o2;->j:I

    .line 24
    .line 25
    invoke-virtual {v3, v4, v1, v2, v5}, Lm/o2;->c(Lm/u1;JI)J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    new-instance v3, Le1/b;

    .line 30
    .line 31
    invoke-direct {v3, v1, v2}, Le1/b;-><init>(J)V

    .line 32
    .line 33
    .line 34
    iget-wide v1, v3, Le1/b;->a:J

    .line 35
    .line 36
    return-wide v1

    .line 37
    :cond_0
    iget-boolean v5, v0, Lk/i;->f:Z

    .line 38
    .line 39
    const-wide/16 v6, 0x0

    .line 40
    .line 41
    const/4 v8, 0x1

    .line 42
    iget-object v9, v0, Lk/i;->c:Lk/g0;

    .line 43
    .line 44
    if-nez v5, :cond_5

    .line 45
    .line 46
    iget-object v5, v9, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 47
    .line 48
    invoke-static {v5}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0, v6, v7}, Lk/i;->i(J)F

    .line 55
    .line 56
    .line 57
    :cond_1
    iget-object v5, v9, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 58
    .line 59
    invoke-static {v5}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, v6, v7}, Lk/i;->j(J)F

    .line 66
    .line 67
    .line 68
    :cond_2
    iget-object v5, v9, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 69
    .line 70
    invoke-static {v5}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    invoke-virtual {v0, v6, v7}, Lk/i;->k(J)F

    .line 77
    .line 78
    .line 79
    :cond_3
    iget-object v5, v9, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 80
    .line 81
    invoke-static {v5}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0, v6, v7}, Lk/i;->h(J)F

    .line 88
    .line 89
    .line 90
    :cond_4
    iput-boolean v8, v0, Lk/i;->f:Z

    .line 91
    .line 92
    :cond_5
    sget v5, Lk/k;->a:I

    .line 93
    .line 94
    const/4 v5, 0x2

    .line 95
    if-ne v3, v5, :cond_6

    .line 96
    .line 97
    const/high16 v5, 0x40800000    # 4.0f

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_6
    const/high16 v5, 0x3f800000    # 1.0f

    .line 101
    .line 102
    :goto_0
    invoke-static {v1, v2, v5}, Le1/b;->f(JF)J

    .line 103
    .line 104
    .line 105
    move-result-wide v10

    .line 106
    const-wide v12, 0xffffffffL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    and-long v14, v1, v12

    .line 112
    .line 113
    long-to-int v14, v14

    .line 114
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 115
    .line 116
    .line 117
    move-result v15

    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    cmpg-float v15, v15, v16

    .line 121
    .line 122
    if-nez v15, :cond_8

    .line 123
    .line 124
    move-wide/from16 v17, v12

    .line 125
    .line 126
    :cond_7
    move/from16 v12, v16

    .line 127
    .line 128
    goto/16 :goto_1

    .line 129
    .line 130
    :cond_8
    iget-object v15, v9, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 131
    .line 132
    invoke-static {v15}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 133
    .line 134
    .line 135
    move-result v15

    .line 136
    if-eqz v15, :cond_b

    .line 137
    .line 138
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 139
    .line 140
    .line 141
    move-result v15

    .line 142
    cmpg-float v15, v15, v16

    .line 143
    .line 144
    if-gez v15, :cond_b

    .line 145
    .line 146
    invoke-virtual {v0, v10, v11}, Lk/i;->k(J)F

    .line 147
    .line 148
    .line 149
    move-result v15

    .line 150
    move-wide/from16 v17, v12

    .line 151
    .line 152
    iget-object v12, v9, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 153
    .line 154
    invoke-static {v12}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    if-nez v12, :cond_9

    .line 159
    .line 160
    invoke-virtual {v9}, Lk/g0;->e()Landroid/widget/EdgeEffect;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    invoke-virtual {v12}, Landroid/widget/EdgeEffect;->finish()V

    .line 165
    .line 166
    .line 167
    :cond_9
    and-long v12, v10, v17

    .line 168
    .line 169
    long-to-int v12, v12

    .line 170
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    cmpg-float v12, v15, v12

    .line 175
    .line 176
    if-nez v12, :cond_a

    .line 177
    .line 178
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    goto :goto_1

    .line 183
    :cond_a
    div-float v12, v15, v5

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_b
    move-wide/from16 v17, v12

    .line 187
    .line 188
    iget-object v12, v9, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 189
    .line 190
    invoke-static {v12}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    if-eqz v12, :cond_7

    .line 195
    .line 196
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    cmpl-float v12, v12, v16

    .line 201
    .line 202
    if-lez v12, :cond_7

    .line 203
    .line 204
    invoke-virtual {v0, v10, v11}, Lk/i;->h(J)F

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    iget-object v13, v9, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 209
    .line 210
    invoke-static {v13}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 211
    .line 212
    .line 213
    move-result v13

    .line 214
    if-nez v13, :cond_c

    .line 215
    .line 216
    invoke-virtual {v9}, Lk/g0;->b()Landroid/widget/EdgeEffect;

    .line 217
    .line 218
    .line 219
    move-result-object v13

    .line 220
    invoke-virtual {v13}, Landroid/widget/EdgeEffect;->finish()V

    .line 221
    .line 222
    .line 223
    :cond_c
    and-long v6, v10, v17

    .line 224
    .line 225
    long-to-int v6, v6

    .line 226
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    cmpg-float v6, v12, v6

    .line 231
    .line 232
    if-nez v6, :cond_d

    .line 233
    .line 234
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 235
    .line 236
    .line 237
    move-result v12

    .line 238
    goto :goto_1

    .line 239
    :cond_d
    div-float/2addr v12, v5

    .line 240
    :goto_1
    const/16 v13, 0x20

    .line 241
    .line 242
    shr-long v6, v1, v13

    .line 243
    .line 244
    long-to-int v6, v6

    .line 245
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    cmpg-float v7, v7, v16

    .line 250
    .line 251
    if-nez v7, :cond_f

    .line 252
    .line 253
    :cond_e
    move/from16 v5, v16

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_f
    iget-object v7, v9, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 257
    .line 258
    invoke-static {v7}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    if-eqz v7, :cond_12

    .line 263
    .line 264
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 265
    .line 266
    .line 267
    move-result v7

    .line 268
    cmpg-float v7, v7, v16

    .line 269
    .line 270
    if-gez v7, :cond_12

    .line 271
    .line 272
    invoke-virtual {v0, v10, v11}, Lk/i;->i(J)F

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    iget-object v15, v9, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 277
    .line 278
    invoke-static {v15}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 279
    .line 280
    .line 281
    move-result v15

    .line 282
    if-nez v15, :cond_10

    .line 283
    .line 284
    invoke-virtual {v9}, Lk/g0;->c()Landroid/widget/EdgeEffect;

    .line 285
    .line 286
    .line 287
    move-result-object v15

    .line 288
    invoke-virtual {v15}, Landroid/widget/EdgeEffect;->finish()V

    .line 289
    .line 290
    .line 291
    :cond_10
    shr-long/2addr v10, v13

    .line 292
    long-to-int v10, v10

    .line 293
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    cmpg-float v10, v7, v10

    .line 298
    .line 299
    if-nez v10, :cond_11

    .line 300
    .line 301
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    goto :goto_2

    .line 306
    :cond_11
    div-float v5, v7, v5

    .line 307
    .line 308
    goto :goto_2

    .line 309
    :cond_12
    iget-object v7, v9, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 310
    .line 311
    invoke-static {v7}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    if-eqz v7, :cond_e

    .line 316
    .line 317
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    cmpl-float v7, v7, v16

    .line 322
    .line 323
    if-lez v7, :cond_e

    .line 324
    .line 325
    invoke-virtual {v0, v10, v11}, Lk/i;->j(J)F

    .line 326
    .line 327
    .line 328
    move-result v7

    .line 329
    iget-object v15, v9, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 330
    .line 331
    invoke-static {v15}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 332
    .line 333
    .line 334
    move-result v15

    .line 335
    if-nez v15, :cond_13

    .line 336
    .line 337
    invoke-virtual {v9}, Lk/g0;->d()Landroid/widget/EdgeEffect;

    .line 338
    .line 339
    .line 340
    move-result-object v15

    .line 341
    invoke-virtual {v15}, Landroid/widget/EdgeEffect;->finish()V

    .line 342
    .line 343
    .line 344
    :cond_13
    shr-long/2addr v10, v13

    .line 345
    long-to-int v10, v10

    .line 346
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    cmpg-float v10, v7, v10

    .line 351
    .line 352
    if-nez v10, :cond_11

    .line 353
    .line 354
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    :goto_2
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    int-to-long v10, v5

    .line 363
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    move v12, v13

    .line 368
    move v7, v14

    .line 369
    int-to-long v13, v5

    .line 370
    shl-long/2addr v10, v12

    .line 371
    and-long v13, v13, v17

    .line 372
    .line 373
    or-long/2addr v10, v13

    .line 374
    const-wide/16 v13, 0x0

    .line 375
    .line 376
    invoke-static {v10, v11, v13, v14}, Le1/b;->b(JJ)Z

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    if-nez v5, :cond_14

    .line 381
    .line 382
    invoke-virtual {v0}, Lk/i;->g()V

    .line 383
    .line 384
    .line 385
    :cond_14
    invoke-static {v1, v2, v10, v11}, Le1/b;->d(JJ)J

    .line 386
    .line 387
    .line 388
    move-result-wide v1

    .line 389
    iget-object v4, v4, Lb0/d0;->h:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v4, Lm/o2;

    .line 392
    .line 393
    iget-object v5, v4, Lm/o2;->k:Lm/u1;

    .line 394
    .line 395
    iget v13, v4, Lm/o2;->j:I

    .line 396
    .line 397
    invoke-virtual {v4, v5, v1, v2, v13}, Lm/o2;->c(Lm/u1;JI)J

    .line 398
    .line 399
    .line 400
    move-result-wide v4

    .line 401
    new-instance v13, Le1/b;

    .line 402
    .line 403
    invoke-direct {v13, v4, v5}, Le1/b;-><init>(J)V

    .line 404
    .line 405
    .line 406
    iget-wide v4, v13, Le1/b;->a:J

    .line 407
    .line 408
    invoke-static {v1, v2, v4, v5}, Le1/b;->d(JJ)J

    .line 409
    .line 410
    .line 411
    move-result-wide v13

    .line 412
    move v15, v12

    .line 413
    move-wide/from16 p1, v13

    .line 414
    .line 415
    shr-long v12, v1, v15

    .line 416
    .line 417
    long-to-int v12, v12

    .line 418
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 419
    .line 420
    .line 421
    move-result v12

    .line 422
    cmpg-float v12, v12, v16

    .line 423
    .line 424
    if-nez v12, :cond_15

    .line 425
    .line 426
    and-long v12, v1, v17

    .line 427
    .line 428
    long-to-int v12, v12

    .line 429
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 430
    .line 431
    .line 432
    move-result v12

    .line 433
    cmpg-float v12, v12, v16

    .line 434
    .line 435
    if-nez v12, :cond_15

    .line 436
    .line 437
    goto :goto_3

    .line 438
    :cond_15
    shr-long v12, v4, v15

    .line 439
    .line 440
    long-to-int v12, v12

    .line 441
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 442
    .line 443
    .line 444
    move-result v12

    .line 445
    cmpg-float v12, v12, v16

    .line 446
    .line 447
    if-nez v12, :cond_16

    .line 448
    .line 449
    and-long v12, v4, v17

    .line 450
    .line 451
    long-to-int v12, v12

    .line 452
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 453
    .line 454
    .line 455
    move-result v12

    .line 456
    cmpg-float v12, v12, v16

    .line 457
    .line 458
    if-nez v12, :cond_16

    .line 459
    .line 460
    goto :goto_3

    .line 461
    :cond_16
    iget-object v12, v9, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 462
    .line 463
    invoke-static {v12}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 464
    .line 465
    .line 466
    move-result v12

    .line 467
    if-nez v12, :cond_17

    .line 468
    .line 469
    iget-object v12, v9, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 470
    .line 471
    invoke-static {v12}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 472
    .line 473
    .line 474
    move-result v12

    .line 475
    if-nez v12, :cond_17

    .line 476
    .line 477
    iget-object v12, v9, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 478
    .line 479
    invoke-static {v12}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 480
    .line 481
    .line 482
    move-result v12

    .line 483
    if-nez v12, :cond_17

    .line 484
    .line 485
    iget-object v12, v9, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 486
    .line 487
    invoke-static {v12}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 488
    .line 489
    .line 490
    move-result v12

    .line 491
    if-eqz v12, :cond_18

    .line 492
    .line 493
    :cond_17
    invoke-virtual {v0}, Lk/i;->e()V

    .line 494
    .line 495
    .line 496
    :cond_18
    :goto_3
    if-ne v3, v8, :cond_1e

    .line 497
    .line 498
    shr-long v13, p1, v15

    .line 499
    .line 500
    long-to-int v3, v13

    .line 501
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 502
    .line 503
    .line 504
    move-result v13

    .line 505
    const/high16 v14, 0x3f000000    # 0.5f

    .line 506
    .line 507
    cmpl-float v13, v13, v14

    .line 508
    .line 509
    const/high16 v15, -0x41000000    # -0.5f

    .line 510
    .line 511
    if-lez v13, :cond_19

    .line 512
    .line 513
    move-wide/from16 v12, p1

    .line 514
    .line 515
    invoke-virtual {v0, v12, v13}, Lk/i;->i(J)F

    .line 516
    .line 517
    .line 518
    :goto_4
    move v3, v8

    .line 519
    move/from16 p1, v14

    .line 520
    .line 521
    move/from16 p2, v15

    .line 522
    .line 523
    goto :goto_5

    .line 524
    :cond_19
    move-wide/from16 v12, p1

    .line 525
    .line 526
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    cmpg-float v3, v3, v15

    .line 531
    .line 532
    if-gez v3, :cond_1a

    .line 533
    .line 534
    invoke-virtual {v0, v12, v13}, Lk/i;->j(J)F

    .line 535
    .line 536
    .line 537
    goto :goto_4

    .line 538
    :cond_1a
    move/from16 p1, v14

    .line 539
    .line 540
    move/from16 p2, v15

    .line 541
    .line 542
    const/4 v3, 0x0

    .line 543
    :goto_5
    and-long v14, v12, v17

    .line 544
    .line 545
    long-to-int v14, v14

    .line 546
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 547
    .line 548
    .line 549
    move-result v15

    .line 550
    cmpl-float v15, v15, p1

    .line 551
    .line 552
    if-lez v15, :cond_1b

    .line 553
    .line 554
    invoke-virtual {v0, v12, v13}, Lk/i;->k(J)F

    .line 555
    .line 556
    .line 557
    :goto_6
    move v12, v8

    .line 558
    goto :goto_7

    .line 559
    :cond_1b
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 560
    .line 561
    .line 562
    move-result v14

    .line 563
    cmpg-float v14, v14, p2

    .line 564
    .line 565
    if-gez v14, :cond_1c

    .line 566
    .line 567
    invoke-virtual {v0, v12, v13}, Lk/i;->h(J)F

    .line 568
    .line 569
    .line 570
    goto :goto_6

    .line 571
    :cond_1c
    const/4 v12, 0x0

    .line 572
    :goto_7
    if-nez v3, :cond_1d

    .line 573
    .line 574
    if-eqz v12, :cond_1e

    .line 575
    .line 576
    :cond_1d
    move v3, v8

    .line 577
    :goto_8
    const-wide/16 v13, 0x0

    .line 578
    .line 579
    goto :goto_9

    .line 580
    :cond_1e
    const/4 v3, 0x0

    .line 581
    goto :goto_8

    .line 582
    :goto_9
    invoke-static {v1, v2, v13, v14}, Le1/b;->b(JJ)Z

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    if-nez v1, :cond_33

    .line 587
    .line 588
    iget-object v1, v9, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 589
    .line 590
    invoke-static {v1}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    if-eqz v1, :cond_21

    .line 595
    .line 596
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    cmpg-float v1, v1, v16

    .line 601
    .line 602
    if-gez v1, :cond_21

    .line 603
    .line 604
    invoke-virtual {v9}, Lk/g0;->c()Landroid/widget/EdgeEffect;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    instance-of v12, v1, Lk/m0;

    .line 613
    .line 614
    if-eqz v12, :cond_1f

    .line 615
    .line 616
    check-cast v1, Lk/m0;

    .line 617
    .line 618
    iget v12, v1, Lk/m0;->b:F

    .line 619
    .line 620
    add-float/2addr v12, v2

    .line 621
    iput v12, v1, Lk/m0;->b:F

    .line 622
    .line 623
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 624
    .line 625
    .line 626
    move-result v2

    .line 627
    iget v12, v1, Lk/m0;->a:F

    .line 628
    .line 629
    cmpl-float v2, v2, v12

    .line 630
    .line 631
    if-lez v2, :cond_20

    .line 632
    .line 633
    invoke-virtual {v1}, Lk/m0;->onRelease()V

    .line 634
    .line 635
    .line 636
    goto :goto_a

    .line 637
    :cond_1f
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 638
    .line 639
    .line 640
    :cond_20
    :goto_a
    iget-object v1, v9, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 641
    .line 642
    invoke-static {v1}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    goto :goto_b

    .line 647
    :cond_21
    const/4 v1, 0x0

    .line 648
    :goto_b
    iget-object v2, v9, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 649
    .line 650
    invoke-static {v2}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    if-eqz v2, :cond_26

    .line 655
    .line 656
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    cmpl-float v2, v2, v16

    .line 661
    .line 662
    if-lez v2, :cond_26

    .line 663
    .line 664
    invoke-virtual {v9}, Lk/g0;->d()Landroid/widget/EdgeEffect;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 669
    .line 670
    .line 671
    move-result v6

    .line 672
    instance-of v12, v2, Lk/m0;

    .line 673
    .line 674
    if-eqz v12, :cond_22

    .line 675
    .line 676
    check-cast v2, Lk/m0;

    .line 677
    .line 678
    iget v12, v2, Lk/m0;->b:F

    .line 679
    .line 680
    add-float/2addr v12, v6

    .line 681
    iput v12, v2, Lk/m0;->b:F

    .line 682
    .line 683
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 684
    .line 685
    .line 686
    move-result v6

    .line 687
    iget v12, v2, Lk/m0;->a:F

    .line 688
    .line 689
    cmpl-float v6, v6, v12

    .line 690
    .line 691
    if-lez v6, :cond_23

    .line 692
    .line 693
    invoke-virtual {v2}, Lk/m0;->onRelease()V

    .line 694
    .line 695
    .line 696
    goto :goto_c

    .line 697
    :cond_22
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 698
    .line 699
    .line 700
    :cond_23
    :goto_c
    if-nez v1, :cond_25

    .line 701
    .line 702
    iget-object v1, v9, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 703
    .line 704
    invoke-static {v1}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 705
    .line 706
    .line 707
    move-result v1

    .line 708
    if-eqz v1, :cond_24

    .line 709
    .line 710
    goto :goto_d

    .line 711
    :cond_24
    const/4 v1, 0x0

    .line 712
    goto :goto_e

    .line 713
    :cond_25
    :goto_d
    move v1, v8

    .line 714
    :cond_26
    :goto_e
    iget-object v2, v9, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 715
    .line 716
    invoke-static {v2}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 717
    .line 718
    .line 719
    move-result v2

    .line 720
    if-eqz v2, :cond_2b

    .line 721
    .line 722
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 723
    .line 724
    .line 725
    move-result v2

    .line 726
    cmpg-float v2, v2, v16

    .line 727
    .line 728
    if-gez v2, :cond_2b

    .line 729
    .line 730
    invoke-virtual {v9}, Lk/g0;->e()Landroid/widget/EdgeEffect;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 735
    .line 736
    .line 737
    move-result v6

    .line 738
    instance-of v12, v2, Lk/m0;

    .line 739
    .line 740
    if-eqz v12, :cond_27

    .line 741
    .line 742
    check-cast v2, Lk/m0;

    .line 743
    .line 744
    iget v12, v2, Lk/m0;->b:F

    .line 745
    .line 746
    add-float/2addr v12, v6

    .line 747
    iput v12, v2, Lk/m0;->b:F

    .line 748
    .line 749
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 750
    .line 751
    .line 752
    move-result v6

    .line 753
    iget v12, v2, Lk/m0;->a:F

    .line 754
    .line 755
    cmpl-float v6, v6, v12

    .line 756
    .line 757
    if-lez v6, :cond_28

    .line 758
    .line 759
    invoke-virtual {v2}, Lk/m0;->onRelease()V

    .line 760
    .line 761
    .line 762
    goto :goto_f

    .line 763
    :cond_27
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 764
    .line 765
    .line 766
    :cond_28
    :goto_f
    if-nez v1, :cond_2a

    .line 767
    .line 768
    iget-object v1, v9, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 769
    .line 770
    invoke-static {v1}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 771
    .line 772
    .line 773
    move-result v1

    .line 774
    if-eqz v1, :cond_29

    .line 775
    .line 776
    goto :goto_10

    .line 777
    :cond_29
    const/4 v1, 0x0

    .line 778
    goto :goto_11

    .line 779
    :cond_2a
    :goto_10
    move v1, v8

    .line 780
    :cond_2b
    :goto_11
    iget-object v2, v9, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 781
    .line 782
    invoke-static {v2}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 783
    .line 784
    .line 785
    move-result v2

    .line 786
    if-eqz v2, :cond_30

    .line 787
    .line 788
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    cmpl-float v2, v2, v16

    .line 793
    .line 794
    if-lez v2, :cond_30

    .line 795
    .line 796
    invoke-virtual {v9}, Lk/g0;->b()Landroid/widget/EdgeEffect;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 801
    .line 802
    .line 803
    move-result v6

    .line 804
    instance-of v7, v2, Lk/m0;

    .line 805
    .line 806
    if-eqz v7, :cond_2c

    .line 807
    .line 808
    check-cast v2, Lk/m0;

    .line 809
    .line 810
    iget v7, v2, Lk/m0;->b:F

    .line 811
    .line 812
    add-float/2addr v7, v6

    .line 813
    iput v7, v2, Lk/m0;->b:F

    .line 814
    .line 815
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 816
    .line 817
    .line 818
    move-result v6

    .line 819
    iget v7, v2, Lk/m0;->a:F

    .line 820
    .line 821
    cmpl-float v6, v6, v7

    .line 822
    .line 823
    if-lez v6, :cond_2d

    .line 824
    .line 825
    invoke-virtual {v2}, Lk/m0;->onRelease()V

    .line 826
    .line 827
    .line 828
    goto :goto_12

    .line 829
    :cond_2c
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 830
    .line 831
    .line 832
    :cond_2d
    :goto_12
    if-nez v1, :cond_2f

    .line 833
    .line 834
    iget-object v1, v9, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 835
    .line 836
    invoke-static {v1}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 837
    .line 838
    .line 839
    move-result v1

    .line 840
    if-eqz v1, :cond_2e

    .line 841
    .line 842
    goto :goto_13

    .line 843
    :cond_2e
    const/4 v1, 0x0

    .line 844
    goto :goto_14

    .line 845
    :cond_2f
    :goto_13
    move v1, v8

    .line 846
    :cond_30
    :goto_14
    if-nez v1, :cond_32

    .line 847
    .line 848
    if-eqz v3, :cond_31

    .line 849
    .line 850
    goto :goto_15

    .line 851
    :cond_31
    const/4 v8, 0x0

    .line 852
    :cond_32
    :goto_15
    move v3, v8

    .line 853
    :cond_33
    if-eqz v3, :cond_34

    .line 854
    .line 855
    invoke-virtual {v0}, Lk/i;->g()V

    .line 856
    .line 857
    .line 858
    :cond_34
    invoke-static {v10, v11, v4, v5}, Le1/b;->e(JJ)J

    .line 859
    .line 860
    .line 861
    move-result-wide v1

    .line 862
    return-wide v1
.end method

.method public final c()Lx1/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/i;->i:Lx1/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lk/i;->c:Lk/g0;

    .line 2
    .line 3
    iget-object v1, v0, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    if-lt v4, v2, :cond_0

    .line 13
    .line 14
    invoke-static {v1}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v3

    .line 20
    :goto_0
    cmpg-float v1, v1, v3

    .line 21
    .line 22
    if-nez v1, :cond_7

    .line 23
    .line 24
    :cond_1
    iget-object v1, v0, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    if-lt v4, v2, :cond_2

    .line 31
    .line 32
    invoke-static {v1}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v1, v3

    .line 38
    :goto_1
    cmpg-float v1, v1, v3

    .line 39
    .line 40
    if-nez v1, :cond_7

    .line 41
    .line 42
    :cond_3
    iget-object v1, v0, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 43
    .line 44
    if-eqz v1, :cond_5

    .line 45
    .line 46
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    if-lt v4, v2, :cond_4

    .line 49
    .line 50
    invoke-static {v1}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    goto :goto_2

    .line 55
    :cond_4
    move v1, v3

    .line 56
    :goto_2
    cmpg-float v1, v1, v3

    .line 57
    .line 58
    if-nez v1, :cond_7

    .line 59
    .line 60
    :cond_5
    iget-object v0, v0, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 61
    .line 62
    if-eqz v0, :cond_8

    .line 63
    .line 64
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    if-lt v1, v2, :cond_6

    .line 67
    .line 68
    invoke-static {v0}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    goto :goto_3

    .line 73
    :cond_6
    move v0, v3

    .line 74
    :goto_3
    cmpg-float v0, v0, v3

    .line 75
    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_7
    const/4 v0, 0x1

    .line 80
    return v0

    .line 81
    :cond_8
    :goto_4
    const/4 v0, 0x0

    .line 82
    return v0
.end method

.method public final e()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk/i;->c:Lk/g0;

    .line 2
    .line 3
    iget-object v1, v0, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    xor-int/2addr v1, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v3

    .line 19
    :goto_0
    iget-object v4, v0, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 20
    .line 21
    if-eqz v4, :cond_3

    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v1, v3

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    :goto_1
    move v1, v2

    .line 38
    :cond_3
    :goto_2
    iget-object v4, v0, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 39
    .line 40
    if-eqz v4, :cond_6

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_5

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    move v1, v3

    .line 55
    goto :goto_4

    .line 56
    :cond_5
    :goto_3
    move v1, v2

    .line 57
    :cond_6
    :goto_4
    iget-object v0, v0, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 58
    .line 59
    if-eqz v0, :cond_9

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_8

    .line 69
    .line 70
    if-eqz v1, :cond_7

    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    move v2, v3

    .line 74
    :cond_8
    :goto_5
    move v1, v2

    .line 75
    :cond_9
    if-eqz v1, :cond_a

    .line 76
    .line 77
    invoke-virtual {p0}, Lk/i;->g()V

    .line 78
    .line 79
    .line 80
    :cond_a
    return-void
.end method

.method public final f()J
    .locals 8

    .line 1
    iget-wide v0, p0, Lk/i;->b:J

    .line 2
    .line 3
    const-wide v2, 0x7fffffff7fffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long/2addr v2, v0

    .line 9
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-wide v0, p0, Lk/i;->g:J

    .line 20
    .line 21
    invoke-static {v0, v1}, Lf8/i;->B(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    :goto_0
    const/16 v2, 0x20

    .line 26
    .line 27
    shr-long v3, v0, v2

    .line 28
    .line 29
    long-to-int v3, v3

    .line 30
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget-wide v4, p0, Lk/i;->g:J

    .line 35
    .line 36
    shr-long/2addr v4, v2

    .line 37
    long-to-int v4, v4

    .line 38
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    div-float/2addr v3, v4

    .line 43
    const-wide v4, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v0, v4

    .line 49
    long-to-int v0, v0

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-wide v6, p0, Lk/i;->g:J

    .line 55
    .line 56
    and-long/2addr v6, v4

    .line 57
    long-to-int v1, v6

    .line 58
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    div-float/2addr v0, v1

    .line 63
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    int-to-long v6, v1

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    int-to-long v0, v0

    .line 73
    shl-long v2, v6, v2

    .line 74
    .line 75
    and-long/2addr v0, v4

    .line 76
    or-long/2addr v0, v2

    .line 77
    return-wide v0
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk/i;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk/i;->d:Li0/j1;

    .line 6
    .line 7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final h(J)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Lk/i;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-wide v1, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p1, v1

    .line 19
    long-to-int p1, p1

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-wide v3, p0, Lk/i;->g:J

    .line 25
    .line 26
    and-long/2addr v3, v1

    .line 27
    long-to-int v3, v3

    .line 28
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    div-float/2addr p2, v3

    .line 33
    iget-object v3, p0, Lk/i;->c:Lk/g0;

    .line 34
    .line 35
    invoke-virtual {v3}, Lk/g0;->b()Landroid/widget/EdgeEffect;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    neg-float p2, p2

    .line 40
    const/4 v4, 0x1

    .line 41
    int-to-float v4, v4

    .line 42
    sub-float/2addr v4, v0

    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v5, 0x1f

    .line 46
    .line 47
    if-lt v0, v5, :cond_0

    .line 48
    .line 49
    invoke-static {v3, p2, v4}, Lk/l;->c(Landroid/widget/EdgeEffect;FF)F

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v3, p2, v4}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 55
    .line 56
    .line 57
    :goto_0
    neg-float p2, p2

    .line 58
    iget-wide v6, p0, Lk/i;->g:J

    .line 59
    .line 60
    and-long/2addr v1, v6

    .line 61
    long-to-int v1, v1

    .line 62
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    mul-float/2addr v1, p2

    .line 67
    const/4 p2, 0x0

    .line 68
    if-lt v0, v5, :cond_1

    .line 69
    .line 70
    invoke-static {v3}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move v0, p2

    .line 76
    :goto_1
    cmpg-float p2, v0, p2

    .line 77
    .line 78
    if-nez p2, :cond_2

    .line 79
    .line 80
    return v1

    .line 81
    :cond_2
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    return p1
.end method

.method public final i(J)F
    .locals 7

    .line 1
    invoke-virtual {p0}, Lk/i;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v2

    .line 11
    long-to-int v0, v0

    .line 12
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x20

    .line 17
    .line 18
    shr-long/2addr p1, v1

    .line 19
    long-to-int p1, p1

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-wide v2, p0, Lk/i;->g:J

    .line 25
    .line 26
    shr-long/2addr v2, v1

    .line 27
    long-to-int v2, v2

    .line 28
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    div-float/2addr p2, v2

    .line 33
    iget-object v2, p0, Lk/i;->c:Lk/g0;

    .line 34
    .line 35
    invoke-virtual {v2}, Lk/g0;->c()Landroid/widget/EdgeEffect;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x1

    .line 40
    int-to-float v3, v3

    .line 41
    sub-float/2addr v3, v0

    .line 42
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 43
    .line 44
    const/16 v4, 0x1f

    .line 45
    .line 46
    if-lt v0, v4, :cond_0

    .line 47
    .line 48
    invoke-static {v2, p2, v3}, Lk/l;->c(Landroid/widget/EdgeEffect;FF)F

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v2, p2, v3}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-wide v5, p0, Lk/i;->g:J

    .line 57
    .line 58
    shr-long/2addr v5, v1

    .line 59
    long-to-int v1, v5

    .line 60
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    mul-float/2addr v1, p2

    .line 65
    const/4 p2, 0x0

    .line 66
    if-lt v0, v4, :cond_1

    .line 67
    .line 68
    invoke-static {v2}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v0, p2

    .line 74
    :goto_1
    cmpg-float p2, v0, p2

    .line 75
    .line 76
    if-nez p2, :cond_2

    .line 77
    .line 78
    return v1

    .line 79
    :cond_2
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    return p1
.end method

.method public final j(J)F
    .locals 7

    .line 1
    invoke-virtual {p0}, Lk/i;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v2

    .line 11
    long-to-int v0, v0

    .line 12
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x20

    .line 17
    .line 18
    shr-long/2addr p1, v1

    .line 19
    long-to-int p1, p1

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-wide v2, p0, Lk/i;->g:J

    .line 25
    .line 26
    shr-long/2addr v2, v1

    .line 27
    long-to-int v2, v2

    .line 28
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    div-float/2addr p2, v2

    .line 33
    iget-object v2, p0, Lk/i;->c:Lk/g0;

    .line 34
    .line 35
    invoke-virtual {v2}, Lk/g0;->d()Landroid/widget/EdgeEffect;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    neg-float p2, p2

    .line 40
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v4, 0x1f

    .line 43
    .line 44
    if-lt v3, v4, :cond_0

    .line 45
    .line 46
    invoke-static {v2, p2, v0}, Lk/l;->c(Landroid/widget/EdgeEffect;FF)F

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v2, p2, v0}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 52
    .line 53
    .line 54
    :goto_0
    neg-float p2, p2

    .line 55
    iget-wide v5, p0, Lk/i;->g:J

    .line 56
    .line 57
    shr-long v0, v5, v1

    .line 58
    .line 59
    long-to-int v0, v0

    .line 60
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    mul-float/2addr v0, p2

    .line 65
    const/4 p2, 0x0

    .line 66
    if-lt v3, v4, :cond_1

    .line 67
    .line 68
    invoke-static {v2}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v1, p2

    .line 74
    :goto_1
    cmpg-float p2, v1, p2

    .line 75
    .line 76
    if-nez p2, :cond_2

    .line 77
    .line 78
    return v0

    .line 79
    :cond_2
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    return p1
.end method

.method public final k(J)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Lk/i;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-wide v1, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p1, v1

    .line 19
    long-to-int p1, p1

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-wide v3, p0, Lk/i;->g:J

    .line 25
    .line 26
    and-long/2addr v3, v1

    .line 27
    long-to-int v3, v3

    .line 28
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    div-float/2addr p2, v3

    .line 33
    iget-object v3, p0, Lk/i;->c:Lk/g0;

    .line 34
    .line 35
    invoke-virtual {v3}, Lk/g0;->e()Landroid/widget/EdgeEffect;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v5, 0x1f

    .line 42
    .line 43
    if-lt v4, v5, :cond_0

    .line 44
    .line 45
    invoke-static {v3, p2, v0}, Lk/l;->c(Landroid/widget/EdgeEffect;FF)F

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v3, p2, v0}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-wide v6, p0, Lk/i;->g:J

    .line 54
    .line 55
    and-long v0, v6, v1

    .line 56
    .line 57
    long-to-int v0, v0

    .line 58
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    mul-float/2addr v0, p2

    .line 63
    const/4 p2, 0x0

    .line 64
    if-lt v4, v5, :cond_1

    .line 65
    .line 66
    invoke-static {v3}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move v1, p2

    .line 72
    :goto_1
    cmpg-float p2, v1, p2

    .line 73
    .line 74
    if-nez p2, :cond_2

    .line 75
    .line 76
    return v0

    .line 77
    :cond_2
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    return p1
.end method

.method public final l(J)V
    .locals 10

    .line 1
    iget-wide v0, p0, Lk/i;->g:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Le1/e;->a(JJ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-wide v1, p0, Lk/i;->g:J

    .line 10
    .line 11
    invoke-static {p1, p2, v1, v2}, Le1/e;->a(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput-wide p1, p0, Lk/i;->g:J

    .line 16
    .line 17
    if-nez v1, :cond_7

    .line 18
    .line 19
    const/16 v2, 0x20

    .line 20
    .line 21
    shr-long v3, p1, v2

    .line 22
    .line 23
    long-to-int v3, v3

    .line 24
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v3}, Lig/a;->X(F)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-wide v4, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr p1, v4

    .line 38
    long-to-int p1, p1

    .line 39
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1}, Lig/a;->X(F)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    int-to-long v6, v3

    .line 48
    shl-long/2addr v6, v2

    .line 49
    int-to-long p1, p1

    .line 50
    and-long/2addr p1, v4

    .line 51
    or-long/2addr p1, v6

    .line 52
    iget-object v3, p0, Lk/i;->c:Lk/g0;

    .line 53
    .line 54
    iput-wide p1, v3, Lk/g0;->c:J

    .line 55
    .line 56
    iget-object v6, v3, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 57
    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    shr-long v7, p1, v2

    .line 61
    .line 62
    long-to-int v7, v7

    .line 63
    and-long v8, p1, v4

    .line 64
    .line 65
    long-to-int v8, v8

    .line 66
    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 67
    .line 68
    .line 69
    :cond_0
    iget-object v6, v3, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 70
    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    shr-long v7, p1, v2

    .line 74
    .line 75
    long-to-int v7, v7

    .line 76
    and-long v8, p1, v4

    .line 77
    .line 78
    long-to-int v8, v8

    .line 79
    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 80
    .line 81
    .line 82
    :cond_1
    iget-object v6, v3, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 83
    .line 84
    if-eqz v6, :cond_2

    .line 85
    .line 86
    and-long v7, p1, v4

    .line 87
    .line 88
    long-to-int v7, v7

    .line 89
    shr-long v8, p1, v2

    .line 90
    .line 91
    long-to-int v8, v8

    .line 92
    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 93
    .line 94
    .line 95
    :cond_2
    iget-object v6, v3, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 96
    .line 97
    if-eqz v6, :cond_3

    .line 98
    .line 99
    and-long v7, p1, v4

    .line 100
    .line 101
    long-to-int v7, v7

    .line 102
    shr-long v8, p1, v2

    .line 103
    .line 104
    long-to-int v8, v8

    .line 105
    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 106
    .line 107
    .line 108
    :cond_3
    iget-object v6, v3, Lk/g0;->h:Landroid/widget/EdgeEffect;

    .line 109
    .line 110
    if-eqz v6, :cond_4

    .line 111
    .line 112
    shr-long v7, p1, v2

    .line 113
    .line 114
    long-to-int v7, v7

    .line 115
    and-long v8, p1, v4

    .line 116
    .line 117
    long-to-int v8, v8

    .line 118
    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 119
    .line 120
    .line 121
    :cond_4
    iget-object v6, v3, Lk/g0;->i:Landroid/widget/EdgeEffect;

    .line 122
    .line 123
    if-eqz v6, :cond_5

    .line 124
    .line 125
    shr-long v7, p1, v2

    .line 126
    .line 127
    long-to-int v7, v7

    .line 128
    and-long v8, p1, v4

    .line 129
    .line 130
    long-to-int v8, v8

    .line 131
    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 132
    .line 133
    .line 134
    :cond_5
    iget-object v6, v3, Lk/g0;->j:Landroid/widget/EdgeEffect;

    .line 135
    .line 136
    if-eqz v6, :cond_6

    .line 137
    .line 138
    and-long v7, p1, v4

    .line 139
    .line 140
    long-to-int v7, v7

    .line 141
    shr-long v8, p1, v2

    .line 142
    .line 143
    long-to-int v8, v8

    .line 144
    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 145
    .line 146
    .line 147
    :cond_6
    iget-object v3, v3, Lk/g0;->k:Landroid/widget/EdgeEffect;

    .line 148
    .line 149
    if-eqz v3, :cond_7

    .line 150
    .line 151
    and-long/2addr v4, p1

    .line 152
    long-to-int v4, v4

    .line 153
    shr-long/2addr p1, v2

    .line 154
    long-to-int p1, p1

    .line 155
    invoke-virtual {v3, v4, p1}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 156
    .line 157
    .line 158
    :cond_7
    if-nez v0, :cond_8

    .line 159
    .line 160
    if-nez v1, :cond_8

    .line 161
    .line 162
    invoke-virtual {p0}, Lk/i;->e()V

    .line 163
    .line 164
    .line 165
    :cond_8
    return-void
.end method
