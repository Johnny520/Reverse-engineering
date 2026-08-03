.class public final Lk/n0;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/m;


# instance fields
.field public final synthetic w:I

.field public final x:Lk/i;

.field public final y:Lk/g0;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ls1/l0;Lk/i;Lk/g0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk/n0;->w:I

    .line 17
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 18
    iput-object p2, p0, Lk/n0;->x:Lk/i;

    .line 19
    iput-object p3, p0, Lk/n0;->y:Lk/g0;

    .line 20
    invoke-virtual {p0, p1}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    return-void
.end method

.method public constructor <init>(Ls1/l0;Lk/i;Lk/g0;Lp/x0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lk/n0;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lk/n0;->x:Lk/i;

    .line 8
    .line 9
    iput-object p3, p0, Lk/n0;->y:Lk/g0;

    .line 10
    .line 11
    iput-object p4, p0, Lk/n0;->z:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static n1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p0, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2, p0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {p2, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 23
    .line 24
    .line 25
    return p0
.end method

.method public static o1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 3

    .line 1
    invoke-virtual {p4}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p4, p0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 6
    .line 7
    .line 8
    const/16 p0, 0x20

    .line 9
    .line 10
    shr-long v1, p1, p0

    .line 11
    .line 12
    long-to-int p0, v1

    .line 13
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const-wide v1, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p1, v1

    .line 23
    long-to-int p1, p1

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p4, p0, p1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, p4}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {p4, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 36
    .line 37
    .line 38
    return p0
.end method


# virtual methods
.method public final B(Lx1/h0;)V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lk/n0;->w:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lx1/h0;->g:Lh1/b;

    .line 11
    .line 12
    invoke-interface {v2}, Lh1/d;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    iget-object v5, v1, Lk/n0;->x:Lk/i;

    .line 17
    .line 18
    invoke-virtual {v5, v3, v4}, Lk/i;->l(J)V

    .line 19
    .line 20
    .line 21
    iget-object v3, v2, Lh1/b;->h:Lb5/c;

    .line 22
    .line 23
    invoke-virtual {v3}, Lb5/c;->p()Lf1/u;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, Lf1/c;->a(Lf1/u;)Landroid/graphics/Canvas;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, v5, Lk/i;->d:Li0/j1;

    .line 32
    .line 33
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-interface {v2}, Lh1/d;->a()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    invoke-static {v6, v7}, Le1/e;->c(J)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, Lx1/h0;->e()V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_1a

    .line 50
    .line 51
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iget-object v6, v1, Lk/n0;->y:Lk/g0;

    .line 56
    .line 57
    if-nez v4, :cond_9

    .line 58
    .line 59
    iget-object v2, v6, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    .line 64
    .line 65
    .line 66
    :cond_1
    iget-object v2, v6, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-object v2, v6, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 74
    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    .line 78
    .line 79
    .line 80
    :cond_3
    iget-object v2, v6, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 81
    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    .line 85
    .line 86
    .line 87
    :cond_4
    iget-object v2, v6, Lk/g0;->h:Landroid/widget/EdgeEffect;

    .line 88
    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    .line 92
    .line 93
    .line 94
    :cond_5
    iget-object v2, v6, Lk/g0;->i:Landroid/widget/EdgeEffect;

    .line 95
    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    .line 99
    .line 100
    .line 101
    :cond_6
    iget-object v2, v6, Lk/g0;->j:Landroid/widget/EdgeEffect;

    .line 102
    .line 103
    if-eqz v2, :cond_7

    .line 104
    .line 105
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    .line 106
    .line 107
    .line 108
    :cond_7
    iget-object v2, v6, Lk/g0;->k:Landroid/widget/EdgeEffect;

    .line 109
    .line 110
    if-eqz v2, :cond_8

    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    .line 113
    .line 114
    .line 115
    :cond_8
    invoke-virtual {v0}, Lx1/h0;->e()V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_1a

    .line 119
    .line 120
    :cond_9
    sget v4, Lk/y;->a:F

    .line 121
    .line 122
    invoke-virtual {v0, v4}, Lx1/h0;->x0(F)F

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    iget-object v7, v6, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 127
    .line 128
    invoke-static {v7}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-nez v7, :cond_b

    .line 133
    .line 134
    iget-object v7, v6, Lk/g0;->h:Landroid/widget/EdgeEffect;

    .line 135
    .line 136
    invoke-static {v7}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-nez v7, :cond_b

    .line 141
    .line 142
    iget-object v7, v6, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 143
    .line 144
    invoke-static {v7}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-nez v7, :cond_b

    .line 149
    .line 150
    iget-object v7, v6, Lk/g0;->i:Landroid/widget/EdgeEffect;

    .line 151
    .line 152
    invoke-static {v7}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eqz v7, :cond_a

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_a
    const/4 v7, 0x0

    .line 160
    goto :goto_1

    .line 161
    :cond_b
    :goto_0
    const/4 v7, 0x1

    .line 162
    :goto_1
    iget-object v10, v6, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 163
    .line 164
    invoke-static {v10}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    if-nez v10, :cond_d

    .line 169
    .line 170
    iget-object v10, v6, Lk/g0;->j:Landroid/widget/EdgeEffect;

    .line 171
    .line 172
    invoke-static {v10}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-nez v10, :cond_d

    .line 177
    .line 178
    iget-object v10, v6, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 179
    .line 180
    invoke-static {v10}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    if-nez v10, :cond_d

    .line 185
    .line 186
    iget-object v10, v6, Lk/g0;->k:Landroid/widget/EdgeEffect;

    .line 187
    .line 188
    invoke-static {v10}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-eqz v10, :cond_c

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_c
    const/4 v10, 0x0

    .line 196
    goto :goto_3

    .line 197
    :cond_d
    :goto_2
    const/4 v10, 0x1

    .line 198
    :goto_3
    if-eqz v7, :cond_e

    .line 199
    .line 200
    if-eqz v10, :cond_e

    .line 201
    .line 202
    invoke-virtual {v1}, Lk/n0;->p1()Landroid/graphics/RenderNode;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    .line 211
    .line 212
    .line 213
    move-result v13

    .line 214
    invoke-static {v11, v12, v13}, Lj2/b;->n(Landroid/graphics/RenderNode;II)V

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_e
    if-eqz v7, :cond_f

    .line 219
    .line 220
    invoke-virtual {v1}, Lk/n0;->p1()Landroid/graphics/RenderNode;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    invoke-static {v4}, Lig/a;->X(F)I

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    mul-int/lit8 v13, v13, 0x2

    .line 233
    .line 234
    add-int/2addr v13, v12

    .line 235
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    .line 236
    .line 237
    .line 238
    move-result v12

    .line 239
    invoke-static {v11, v13, v12}, Lj2/b;->n(Landroid/graphics/RenderNode;II)V

    .line 240
    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_f
    if-eqz v10, :cond_35

    .line 244
    .line 245
    invoke-virtual {v1}, Lk/n0;->p1()Landroid/graphics/RenderNode;

    .line 246
    .line 247
    .line 248
    move-result-object v11

    .line 249
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    .line 250
    .line 251
    .line 252
    move-result v12

    .line 253
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    .line 254
    .line 255
    .line 256
    move-result v13

    .line 257
    invoke-static {v4}, Lig/a;->X(F)I

    .line 258
    .line 259
    .line 260
    move-result v14

    .line 261
    mul-int/lit8 v14, v14, 0x2

    .line 262
    .line 263
    add-int/2addr v14, v13

    .line 264
    invoke-static {v11, v12, v14}, Lj2/b;->n(Landroid/graphics/RenderNode;II)V

    .line 265
    .line 266
    .line 267
    :goto_4
    invoke-virtual {v1}, Lk/n0;->p1()Landroid/graphics/RenderNode;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    invoke-static {v11}, Lj2/b;->e(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    iget-object v12, v6, Lk/g0;->j:Landroid/widget/EdgeEffect;

    .line 276
    .line 277
    invoke-static {v12}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 278
    .line 279
    .line 280
    move-result v12

    .line 281
    const/high16 v13, 0x42b40000    # 90.0f

    .line 282
    .line 283
    sget-object v14, Lm/p1;->h:Lm/p1;

    .line 284
    .line 285
    if-eqz v12, :cond_11

    .line 286
    .line 287
    iget-object v12, v6, Lk/g0;->j:Landroid/widget/EdgeEffect;

    .line 288
    .line 289
    if-nez v12, :cond_10

    .line 290
    .line 291
    invoke-virtual {v6, v14}, Lk/g0;->a(Lm/p1;)Landroid/widget/EdgeEffect;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    iput-object v12, v6, Lk/g0;->j:Landroid/widget/EdgeEffect;

    .line 296
    .line 297
    :cond_10
    invoke-static {v13, v12, v11}, Lk/n0;->n1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12}, Landroid/widget/EdgeEffect;->finish()V

    .line 301
    .line 302
    .line 303
    :cond_11
    iget-object v12, v6, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 304
    .line 305
    invoke-static {v12}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 306
    .line 307
    .line 308
    move-result v12

    .line 309
    const/high16 v15, 0x43870000    # 270.0f

    .line 310
    .line 311
    const-wide v16, 0xffffffffL

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    const/16 v13, 0x1f

    .line 317
    .line 318
    if-eqz v12, :cond_16

    .line 319
    .line 320
    invoke-virtual {v6}, Lk/g0;->c()Landroid/widget/EdgeEffect;

    .line 321
    .line 322
    .line 323
    move-result-object v12

    .line 324
    invoke-static {v15, v12, v11}, Lk/n0;->n1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 325
    .line 326
    .line 327
    move-result v19

    .line 328
    iget-object v15, v6, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 329
    .line 330
    invoke-static {v15}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 331
    .line 332
    .line 333
    move-result v15

    .line 334
    if-eqz v15, :cond_15

    .line 335
    .line 336
    invoke-virtual {v5}, Lk/i;->f()J

    .line 337
    .line 338
    .line 339
    move-result-wide v20

    .line 340
    move v15, v10

    .line 341
    and-long v9, v20, v16

    .line 342
    .line 343
    long-to-int v9, v9

    .line 344
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    iget-object v10, v6, Lk/g0;->j:Landroid/widget/EdgeEffect;

    .line 349
    .line 350
    if-nez v10, :cond_12

    .line 351
    .line 352
    invoke-virtual {v6, v14}, Lk/g0;->a(Lm/p1;)Landroid/widget/EdgeEffect;

    .line 353
    .line 354
    .line 355
    move-result-object v10

    .line 356
    iput-object v10, v6, Lk/g0;->j:Landroid/widget/EdgeEffect;

    .line 357
    .line 358
    :cond_12
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 359
    .line 360
    if-lt v8, v13, :cond_13

    .line 361
    .line 362
    invoke-static {v12}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 363
    .line 364
    .line 365
    move-result v12

    .line 366
    :goto_5
    move/from16 v22, v4

    .line 367
    .line 368
    const/4 v13, 0x1

    .line 369
    goto :goto_6

    .line 370
    :cond_13
    const/4 v12, 0x0

    .line 371
    goto :goto_5

    .line 372
    :goto_6
    int-to-float v4, v13

    .line 373
    sub-float/2addr v4, v9

    .line 374
    const/16 v9, 0x1f

    .line 375
    .line 376
    if-lt v8, v9, :cond_14

    .line 377
    .line 378
    invoke-static {v10, v12, v4}, Lk/l;->c(Landroid/widget/EdgeEffect;FF)F

    .line 379
    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_14
    invoke-virtual {v10, v12, v4}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 383
    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_15
    move/from16 v22, v4

    .line 387
    .line 388
    move v15, v10

    .line 389
    goto :goto_7

    .line 390
    :cond_16
    move/from16 v22, v4

    .line 391
    .line 392
    move v15, v10

    .line 393
    const/16 v19, 0x0

    .line 394
    .line 395
    :goto_7
    iget-object v4, v6, Lk/g0;->h:Landroid/widget/EdgeEffect;

    .line 396
    .line 397
    invoke-static {v4}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    const/high16 v8, 0x43340000    # 180.0f

    .line 402
    .line 403
    sget-object v9, Lm/p1;->g:Lm/p1;

    .line 404
    .line 405
    if-eqz v4, :cond_18

    .line 406
    .line 407
    iget-object v4, v6, Lk/g0;->h:Landroid/widget/EdgeEffect;

    .line 408
    .line 409
    if-nez v4, :cond_17

    .line 410
    .line 411
    invoke-virtual {v6, v9}, Lk/g0;->a(Lm/p1;)Landroid/widget/EdgeEffect;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    iput-object v4, v6, Lk/g0;->h:Landroid/widget/EdgeEffect;

    .line 416
    .line 417
    :cond_17
    invoke-static {v8, v4, v11}, Lk/n0;->n1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 418
    .line 419
    .line 420
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->finish()V

    .line 421
    .line 422
    .line 423
    :cond_18
    iget-object v4, v6, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 424
    .line 425
    invoke-static {v4}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    if-eqz v4, :cond_1f

    .line 430
    .line 431
    invoke-virtual {v6}, Lk/g0;->e()Landroid/widget/EdgeEffect;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    const/4 v12, 0x0

    .line 436
    invoke-static {v12, v4, v11}, Lk/n0;->n1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 437
    .line 438
    .line 439
    move-result v13

    .line 440
    if-nez v13, :cond_1a

    .line 441
    .line 442
    if-eqz v19, :cond_19

    .line 443
    .line 444
    goto :goto_8

    .line 445
    :cond_19
    const/4 v13, 0x0

    .line 446
    goto :goto_9

    .line 447
    :cond_1a
    :goto_8
    const/4 v13, 0x1

    .line 448
    :goto_9
    iget-object v12, v6, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 449
    .line 450
    invoke-static {v12}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 451
    .line 452
    .line 453
    move-result v12

    .line 454
    if-eqz v12, :cond_1e

    .line 455
    .line 456
    invoke-virtual {v5}, Lk/i;->f()J

    .line 457
    .line 458
    .line 459
    move-result-wide v23

    .line 460
    move-object v12, v11

    .line 461
    const/16 v25, 0x20

    .line 462
    .line 463
    shr-long v10, v23, v25

    .line 464
    .line 465
    long-to-int v10, v10

    .line 466
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    iget-object v11, v6, Lk/g0;->h:Landroid/widget/EdgeEffect;

    .line 471
    .line 472
    if-nez v11, :cond_1b

    .line 473
    .line 474
    invoke-virtual {v6, v9}, Lk/g0;->a(Lm/p1;)Landroid/widget/EdgeEffect;

    .line 475
    .line 476
    .line 477
    move-result-object v11

    .line 478
    iput-object v11, v6, Lk/g0;->h:Landroid/widget/EdgeEffect;

    .line 479
    .line 480
    :cond_1b
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 481
    .line 482
    move-object/from16 v24, v4

    .line 483
    .line 484
    const/16 v4, 0x1f

    .line 485
    .line 486
    if-lt v8, v4, :cond_1c

    .line 487
    .line 488
    invoke-static/range {v24 .. v24}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 489
    .line 490
    .line 491
    move-result v19

    .line 492
    move-object/from16 v24, v5

    .line 493
    .line 494
    move/from16 v5, v19

    .line 495
    .line 496
    goto :goto_a

    .line 497
    :cond_1c
    move-object/from16 v24, v5

    .line 498
    .line 499
    const/4 v5, 0x0

    .line 500
    :goto_a
    if-lt v8, v4, :cond_1d

    .line 501
    .line 502
    invoke-static {v11, v5, v10}, Lk/l;->c(Landroid/widget/EdgeEffect;FF)F

    .line 503
    .line 504
    .line 505
    goto :goto_b

    .line 506
    :cond_1d
    invoke-virtual {v11, v5, v10}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 507
    .line 508
    .line 509
    goto :goto_b

    .line 510
    :cond_1e
    move-object/from16 v24, v5

    .line 511
    .line 512
    move-object v12, v11

    .line 513
    const/16 v25, 0x20

    .line 514
    .line 515
    :goto_b
    move/from16 v19, v13

    .line 516
    .line 517
    goto :goto_c

    .line 518
    :cond_1f
    move-object/from16 v24, v5

    .line 519
    .line 520
    move-object v12, v11

    .line 521
    const/16 v25, 0x20

    .line 522
    .line 523
    :goto_c
    iget-object v4, v6, Lk/g0;->k:Landroid/widget/EdgeEffect;

    .line 524
    .line 525
    invoke-static {v4}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    if-eqz v4, :cond_21

    .line 530
    .line 531
    iget-object v4, v6, Lk/g0;->k:Landroid/widget/EdgeEffect;

    .line 532
    .line 533
    if-nez v4, :cond_20

    .line 534
    .line 535
    invoke-virtual {v6, v14}, Lk/g0;->a(Lm/p1;)Landroid/widget/EdgeEffect;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    iput-object v4, v6, Lk/g0;->k:Landroid/widget/EdgeEffect;

    .line 540
    .line 541
    :cond_20
    const/high16 v5, 0x43870000    # 270.0f

    .line 542
    .line 543
    invoke-static {v5, v4, v12}, Lk/n0;->n1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 544
    .line 545
    .line 546
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->finish()V

    .line 547
    .line 548
    .line 549
    :cond_21
    iget-object v4, v6, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 550
    .line 551
    invoke-static {v4}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    if-eqz v4, :cond_28

    .line 556
    .line 557
    invoke-virtual {v6}, Lk/g0;->d()Landroid/widget/EdgeEffect;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    const/high16 v5, 0x42b40000    # 90.0f

    .line 562
    .line 563
    invoke-static {v5, v4, v12}, Lk/n0;->n1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 564
    .line 565
    .line 566
    move-result v5

    .line 567
    if-nez v5, :cond_23

    .line 568
    .line 569
    if-eqz v19, :cond_22

    .line 570
    .line 571
    goto :goto_d

    .line 572
    :cond_22
    const/4 v13, 0x0

    .line 573
    goto :goto_e

    .line 574
    :cond_23
    :goto_d
    const/4 v13, 0x1

    .line 575
    :goto_e
    iget-object v5, v6, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 576
    .line 577
    invoke-static {v5}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    if-eqz v5, :cond_27

    .line 582
    .line 583
    invoke-virtual/range {v24 .. v24}, Lk/i;->f()J

    .line 584
    .line 585
    .line 586
    move-result-wide v10

    .line 587
    and-long v10, v10, v16

    .line 588
    .line 589
    long-to-int v5, v10

    .line 590
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    iget-object v8, v6, Lk/g0;->k:Landroid/widget/EdgeEffect;

    .line 595
    .line 596
    if-nez v8, :cond_24

    .line 597
    .line 598
    invoke-virtual {v6, v14}, Lk/g0;->a(Lm/p1;)Landroid/widget/EdgeEffect;

    .line 599
    .line 600
    .line 601
    move-result-object v8

    .line 602
    iput-object v8, v6, Lk/g0;->k:Landroid/widget/EdgeEffect;

    .line 603
    .line 604
    :cond_24
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 605
    .line 606
    const/16 v11, 0x1f

    .line 607
    .line 608
    if-lt v10, v11, :cond_25

    .line 609
    .line 610
    invoke-static {v4}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 611
    .line 612
    .line 613
    move-result v4

    .line 614
    goto :goto_f

    .line 615
    :cond_25
    const/4 v4, 0x0

    .line 616
    :goto_f
    if-lt v10, v11, :cond_26

    .line 617
    .line 618
    invoke-static {v8, v4, v5}, Lk/l;->c(Landroid/widget/EdgeEffect;FF)F

    .line 619
    .line 620
    .line 621
    goto :goto_10

    .line 622
    :cond_26
    invoke-virtual {v8, v4, v5}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 623
    .line 624
    .line 625
    :cond_27
    :goto_10
    move/from16 v19, v13

    .line 626
    .line 627
    :cond_28
    iget-object v4, v6, Lk/g0;->i:Landroid/widget/EdgeEffect;

    .line 628
    .line 629
    invoke-static {v4}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    if-eqz v4, :cond_2a

    .line 634
    .line 635
    iget-object v4, v6, Lk/g0;->i:Landroid/widget/EdgeEffect;

    .line 636
    .line 637
    if-nez v4, :cond_29

    .line 638
    .line 639
    invoke-virtual {v6, v9}, Lk/g0;->a(Lm/p1;)Landroid/widget/EdgeEffect;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    iput-object v4, v6, Lk/g0;->i:Landroid/widget/EdgeEffect;

    .line 644
    .line 645
    :cond_29
    const/4 v5, 0x0

    .line 646
    invoke-static {v5, v4, v12}, Lk/n0;->n1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 647
    .line 648
    .line 649
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->finish()V

    .line 650
    .line 651
    .line 652
    goto :goto_11

    .line 653
    :cond_2a
    const/4 v5, 0x0

    .line 654
    :goto_11
    iget-object v4, v6, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 655
    .line 656
    invoke-static {v4}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 657
    .line 658
    .line 659
    move-result v4

    .line 660
    if-eqz v4, :cond_31

    .line 661
    .line 662
    invoke-virtual {v6}, Lk/g0;->b()Landroid/widget/EdgeEffect;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    const/high16 v8, 0x43340000    # 180.0f

    .line 667
    .line 668
    invoke-static {v8, v4, v12}, Lk/n0;->n1(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 669
    .line 670
    .line 671
    move-result v8

    .line 672
    if-nez v8, :cond_2c

    .line 673
    .line 674
    if-eqz v19, :cond_2b

    .line 675
    .line 676
    goto :goto_12

    .line 677
    :cond_2b
    const/16 v18, 0x0

    .line 678
    .line 679
    goto :goto_13

    .line 680
    :cond_2c
    :goto_12
    const/16 v18, 0x1

    .line 681
    .line 682
    :goto_13
    iget-object v8, v6, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 683
    .line 684
    invoke-static {v8}, Lk/g0;->g(Landroid/widget/EdgeEffect;)Z

    .line 685
    .line 686
    .line 687
    move-result v8

    .line 688
    if-eqz v8, :cond_30

    .line 689
    .line 690
    invoke-virtual/range {v24 .. v24}, Lk/i;->f()J

    .line 691
    .line 692
    .line 693
    move-result-wide v10

    .line 694
    shr-long v10, v10, v25

    .line 695
    .line 696
    long-to-int v8, v10

    .line 697
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 698
    .line 699
    .line 700
    move-result v8

    .line 701
    iget-object v10, v6, Lk/g0;->i:Landroid/widget/EdgeEffect;

    .line 702
    .line 703
    if-nez v10, :cond_2d

    .line 704
    .line 705
    invoke-virtual {v6, v9}, Lk/g0;->a(Lm/p1;)Landroid/widget/EdgeEffect;

    .line 706
    .line 707
    .line 708
    move-result-object v10

    .line 709
    iput-object v10, v6, Lk/g0;->i:Landroid/widget/EdgeEffect;

    .line 710
    .line 711
    :cond_2d
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 712
    .line 713
    const/16 v9, 0x1f

    .line 714
    .line 715
    if-lt v6, v9, :cond_2e

    .line 716
    .line 717
    invoke-static {v4}, Lk/l;->b(Landroid/widget/EdgeEffect;)F

    .line 718
    .line 719
    .line 720
    move-result v4

    .line 721
    :goto_14
    const/4 v13, 0x1

    .line 722
    goto :goto_15

    .line 723
    :cond_2e
    move v4, v5

    .line 724
    goto :goto_14

    .line 725
    :goto_15
    int-to-float v11, v13

    .line 726
    sub-float/2addr v11, v8

    .line 727
    if-lt v6, v9, :cond_2f

    .line 728
    .line 729
    invoke-static {v10, v4, v11}, Lk/l;->c(Landroid/widget/EdgeEffect;FF)F

    .line 730
    .line 731
    .line 732
    goto :goto_16

    .line 733
    :cond_2f
    invoke-virtual {v10, v4, v11}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 734
    .line 735
    .line 736
    :cond_30
    :goto_16
    move/from16 v19, v18

    .line 737
    .line 738
    :cond_31
    if-eqz v19, :cond_32

    .line 739
    .line 740
    invoke-virtual/range {v24 .. v24}, Lk/i;->g()V

    .line 741
    .line 742
    .line 743
    :cond_32
    if-eqz v15, :cond_33

    .line 744
    .line 745
    move v4, v5

    .line 746
    goto :goto_17

    .line 747
    :cond_33
    move/from16 v4, v22

    .line 748
    .line 749
    :goto_17
    if-eqz v7, :cond_34

    .line 750
    .line 751
    goto :goto_18

    .line 752
    :cond_34
    move/from16 v5, v22

    .line 753
    .line 754
    :goto_18
    invoke-virtual {v0}, Lx1/h0;->getLayoutDirection()Lu2/m;

    .line 755
    .line 756
    .line 757
    move-result-object v6

    .line 758
    new-instance v7, Lf1/b;

    .line 759
    .line 760
    invoke-direct {v7}, Lf1/b;-><init>()V

    .line 761
    .line 762
    .line 763
    iput-object v12, v7, Lf1/b;->a:Landroid/graphics/Canvas;

    .line 764
    .line 765
    invoke-interface {v2}, Lh1/d;->a()J

    .line 766
    .line 767
    .line 768
    move-result-wide v8

    .line 769
    iget-object v10, v2, Lh1/b;->h:Lb5/c;

    .line 770
    .line 771
    invoke-virtual {v10}, Lb5/c;->s()Lu2/c;

    .line 772
    .line 773
    .line 774
    move-result-object v10

    .line 775
    iget-object v11, v2, Lh1/b;->h:Lb5/c;

    .line 776
    .line 777
    invoke-virtual {v11}, Lb5/c;->u()Lu2/m;

    .line 778
    .line 779
    .line 780
    move-result-object v11

    .line 781
    iget-object v12, v2, Lh1/b;->h:Lb5/c;

    .line 782
    .line 783
    invoke-virtual {v12}, Lb5/c;->p()Lf1/u;

    .line 784
    .line 785
    .line 786
    move-result-object v12

    .line 787
    iget-object v13, v2, Lh1/b;->h:Lb5/c;

    .line 788
    .line 789
    invoke-virtual {v13}, Lb5/c;->v()J

    .line 790
    .line 791
    .line 792
    move-result-wide v13

    .line 793
    iget-object v15, v2, Lh1/b;->h:Lb5/c;

    .line 794
    .line 795
    iget-object v1, v15, Lb5/c;->b:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v1, Li1/b;

    .line 798
    .line 799
    invoke-virtual {v15, v0}, Lb5/c;->R(Lu2/c;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v15, v6}, Lb5/c;->S(Lu2/m;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v15, v7}, Lb5/c;->P(Lf1/u;)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v15, v8, v9}, Lb5/c;->U(J)V

    .line 809
    .line 810
    .line 811
    const/4 v6, 0x0

    .line 812
    iput-object v6, v15, Lb5/c;->b:Ljava/lang/Object;

    .line 813
    .line 814
    invoke-virtual {v7}, Lf1/b;->e()V

    .line 815
    .line 816
    .line 817
    :try_start_0
    iget-object v6, v2, Lh1/b;->h:Lb5/c;

    .line 818
    .line 819
    iget-object v6, v6, Lb5/c;->a:Ljava/lang/Object;

    .line 820
    .line 821
    check-cast v6, Landroidx/lifecycle/x;

    .line 822
    .line 823
    invoke-virtual {v6, v4, v5}, Landroidx/lifecycle/x;->c0(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 824
    .line 825
    .line 826
    :try_start_1
    invoke-virtual {v0}, Lx1/h0;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 827
    .line 828
    .line 829
    :try_start_2
    iget-object v0, v2, Lh1/b;->h:Lb5/c;

    .line 830
    .line 831
    iget-object v0, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast v0, Landroidx/lifecycle/x;

    .line 834
    .line 835
    neg-float v4, v4

    .line 836
    neg-float v5, v5

    .line 837
    invoke-virtual {v0, v4, v5}, Landroidx/lifecycle/x;->c0(FF)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 838
    .line 839
    .line 840
    invoke-virtual {v7}, Lf1/b;->p()V

    .line 841
    .line 842
    .line 843
    iget-object v0, v2, Lh1/b;->h:Lb5/c;

    .line 844
    .line 845
    invoke-virtual {v0, v10}, Lb5/c;->R(Lu2/c;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v0, v11}, Lb5/c;->S(Lu2/m;)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v0, v12}, Lb5/c;->P(Lf1/u;)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v0, v13, v14}, Lb5/c;->U(J)V

    .line 855
    .line 856
    .line 857
    iput-object v1, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 858
    .line 859
    invoke-virtual/range {p0 .. p0}, Lk/n0;->p1()Landroid/graphics/RenderNode;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-static {v0}, Lj2/b;->m(Landroid/graphics/RenderNode;)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    .line 867
    .line 868
    .line 869
    move-result v0

    .line 870
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 871
    .line 872
    .line 873
    invoke-virtual/range {p0 .. p0}, Lk/n0;->p1()Landroid/graphics/RenderNode;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    invoke-static {v3, v1}, Lj2/b;->k(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 881
    .line 882
    .line 883
    goto :goto_1a

    .line 884
    :catchall_0
    move-exception v0

    .line 885
    goto :goto_19

    .line 886
    :catchall_1
    move-exception v0

    .line 887
    :try_start_3
    iget-object v3, v2, Lh1/b;->h:Lb5/c;

    .line 888
    .line 889
    iget-object v3, v3, Lb5/c;->a:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast v3, Landroidx/lifecycle/x;

    .line 892
    .line 893
    neg-float v4, v4

    .line 894
    neg-float v5, v5

    .line 895
    invoke-virtual {v3, v4, v5}, Landroidx/lifecycle/x;->c0(FF)V

    .line 896
    .line 897
    .line 898
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 899
    :goto_19
    invoke-virtual {v7}, Lf1/b;->p()V

    .line 900
    .line 901
    .line 902
    iget-object v2, v2, Lh1/b;->h:Lb5/c;

    .line 903
    .line 904
    invoke-virtual {v2, v10}, Lb5/c;->R(Lu2/c;)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v2, v11}, Lb5/c;->S(Lu2/m;)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v2, v12}, Lb5/c;->P(Lf1/u;)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v2, v13, v14}, Lb5/c;->U(J)V

    .line 914
    .line 915
    .line 916
    iput-object v1, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 917
    .line 918
    throw v0

    .line 919
    :cond_35
    invoke-virtual {v0}, Lx1/h0;->e()V

    .line 920
    .line 921
    .line 922
    :goto_1a
    return-void

    .line 923
    :pswitch_0
    iget-object v2, v1, Lk/n0;->z:Ljava/lang/Object;

    .line 924
    .line 925
    check-cast v2, Lp/x0;

    .line 926
    .line 927
    iget-object v3, v0, Lx1/h0;->g:Lh1/b;

    .line 928
    .line 929
    invoke-interface {v3}, Lh1/d;->a()J

    .line 930
    .line 931
    .line 932
    move-result-wide v4

    .line 933
    iget-object v6, v1, Lk/n0;->x:Lk/i;

    .line 934
    .line 935
    invoke-virtual {v6, v4, v5}, Lk/i;->l(J)V

    .line 936
    .line 937
    .line 938
    invoke-interface {v3}, Lh1/d;->a()J

    .line 939
    .line 940
    .line 941
    move-result-wide v4

    .line 942
    invoke-static {v4, v5}, Le1/e;->c(J)Z

    .line 943
    .line 944
    .line 945
    move-result v4

    .line 946
    if-eqz v4, :cond_36

    .line 947
    .line 948
    invoke-virtual {v0}, Lx1/h0;->e()V

    .line 949
    .line 950
    .line 951
    goto/16 :goto_20

    .line 952
    .line 953
    :cond_36
    invoke-virtual {v0}, Lx1/h0;->e()V

    .line 954
    .line 955
    .line 956
    iget-object v4, v6, Lk/i;->d:Li0/j1;

    .line 957
    .line 958
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    iget-object v4, v3, Lh1/b;->h:Lb5/c;

    .line 962
    .line 963
    invoke-virtual {v4}, Lb5/c;->p()Lf1/u;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    invoke-static {v4}, Lf1/c;->a(Lf1/u;)Landroid/graphics/Canvas;

    .line 968
    .line 969
    .line 970
    move-result-object v4

    .line 971
    iget-object v5, v1, Lk/n0;->y:Lk/g0;

    .line 972
    .line 973
    iget-object v7, v5, Lk/g0;->f:Landroid/widget/EdgeEffect;

    .line 974
    .line 975
    invoke-static {v7}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 976
    .line 977
    .line 978
    move-result v7

    .line 979
    const/16 v8, 0x20

    .line 980
    .line 981
    const-wide v9, 0xffffffffL

    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    const/4 v11, 0x0

    .line 987
    if-eqz v7, :cond_37

    .line 988
    .line 989
    invoke-virtual {v5}, Lk/g0;->c()Landroid/widget/EdgeEffect;

    .line 990
    .line 991
    .line 992
    move-result-object v7

    .line 993
    invoke-interface {v3}, Lh1/d;->a()J

    .line 994
    .line 995
    .line 996
    move-result-wide v12

    .line 997
    and-long/2addr v12, v9

    .line 998
    long-to-int v12, v12

    .line 999
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1000
    .line 1001
    .line 1002
    move-result v12

    .line 1003
    neg-float v12, v12

    .line 1004
    invoke-virtual {v0}, Lx1/h0;->getLayoutDirection()Lu2/m;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v13

    .line 1008
    invoke-interface {v2, v13}, Lp/x0;->d(Lu2/m;)F

    .line 1009
    .line 1010
    .line 1011
    move-result v13

    .line 1012
    invoke-virtual {v0, v13}, Lx1/h0;->x0(F)F

    .line 1013
    .line 1014
    .line 1015
    move-result v13

    .line 1016
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1017
    .line 1018
    .line 1019
    move-result v12

    .line 1020
    int-to-long v14, v12

    .line 1021
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1022
    .line 1023
    .line 1024
    move-result v12

    .line 1025
    int-to-long v12, v12

    .line 1026
    shl-long/2addr v14, v8

    .line 1027
    and-long/2addr v12, v9

    .line 1028
    or-long/2addr v12, v14

    .line 1029
    const/high16 v14, 0x43870000    # 270.0f

    .line 1030
    .line 1031
    invoke-static {v14, v12, v13, v7, v4}, Lk/n0;->o1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v7

    .line 1035
    goto :goto_1b

    .line 1036
    :cond_37
    move v7, v11

    .line 1037
    :goto_1b
    iget-object v12, v5, Lk/g0;->d:Landroid/widget/EdgeEffect;

    .line 1038
    .line 1039
    invoke-static {v12}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v12

    .line 1043
    const/4 v13, 0x0

    .line 1044
    if-eqz v12, :cond_3a

    .line 1045
    .line 1046
    invoke-virtual {v5}, Lk/g0;->e()Landroid/widget/EdgeEffect;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v12

    .line 1050
    invoke-interface {v2}, Lp/x0;->c()F

    .line 1051
    .line 1052
    .line 1053
    move-result v15

    .line 1054
    invoke-virtual {v0, v15}, Lx1/h0;->x0(F)F

    .line 1055
    .line 1056
    .line 1057
    move-result v15

    .line 1058
    move/from16 v16, v8

    .line 1059
    .line 1060
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1061
    .line 1062
    .line 1063
    move-result v8

    .line 1064
    move-wide/from16 v17, v9

    .line 1065
    .line 1066
    int-to-long v9, v8

    .line 1067
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1068
    .line 1069
    .line 1070
    move-result v8

    .line 1071
    int-to-long v14, v8

    .line 1072
    shl-long v8, v9, v16

    .line 1073
    .line 1074
    and-long v14, v14, v17

    .line 1075
    .line 1076
    or-long/2addr v8, v14

    .line 1077
    invoke-static {v13, v8, v9, v12, v4}, Lk/n0;->o1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v8

    .line 1081
    if-nez v8, :cond_39

    .line 1082
    .line 1083
    if-eqz v7, :cond_38

    .line 1084
    .line 1085
    goto :goto_1c

    .line 1086
    :cond_38
    move v7, v11

    .line 1087
    goto :goto_1d

    .line 1088
    :cond_39
    :goto_1c
    const/4 v7, 0x1

    .line 1089
    goto :goto_1d

    .line 1090
    :cond_3a
    move/from16 v16, v8

    .line 1091
    .line 1092
    move-wide/from16 v17, v9

    .line 1093
    .line 1094
    :goto_1d
    iget-object v8, v5, Lk/g0;->g:Landroid/widget/EdgeEffect;

    .line 1095
    .line 1096
    invoke-static {v8}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v8

    .line 1100
    if-eqz v8, :cond_3d

    .line 1101
    .line 1102
    invoke-virtual {v5}, Lk/g0;->d()Landroid/widget/EdgeEffect;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v8

    .line 1106
    invoke-interface {v3}, Lh1/d;->a()J

    .line 1107
    .line 1108
    .line 1109
    move-result-wide v9

    .line 1110
    shr-long v9, v9, v16

    .line 1111
    .line 1112
    long-to-int v9, v9

    .line 1113
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1114
    .line 1115
    .line 1116
    move-result v9

    .line 1117
    invoke-static {v9}, Lig/a;->X(F)I

    .line 1118
    .line 1119
    .line 1120
    move-result v9

    .line 1121
    invoke-virtual {v0}, Lx1/h0;->getLayoutDirection()Lu2/m;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v10

    .line 1125
    invoke-interface {v2, v10}, Lp/x0;->b(Lu2/m;)F

    .line 1126
    .line 1127
    .line 1128
    move-result v10

    .line 1129
    int-to-float v9, v9

    .line 1130
    neg-float v9, v9

    .line 1131
    invoke-virtual {v0, v10}, Lx1/h0;->x0(F)F

    .line 1132
    .line 1133
    .line 1134
    move-result v10

    .line 1135
    add-float/2addr v10, v9

    .line 1136
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1137
    .line 1138
    .line 1139
    move-result v9

    .line 1140
    int-to-long v12, v9

    .line 1141
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1142
    .line 1143
    .line 1144
    move-result v9

    .line 1145
    int-to-long v9, v9

    .line 1146
    shl-long v12, v12, v16

    .line 1147
    .line 1148
    and-long v9, v9, v17

    .line 1149
    .line 1150
    or-long/2addr v9, v12

    .line 1151
    const/high16 v12, 0x42b40000    # 90.0f

    .line 1152
    .line 1153
    invoke-static {v12, v9, v10, v8, v4}, Lk/n0;->o1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1154
    .line 1155
    .line 1156
    move-result v8

    .line 1157
    if-nez v8, :cond_3c

    .line 1158
    .line 1159
    if-eqz v7, :cond_3b

    .line 1160
    .line 1161
    goto :goto_1e

    .line 1162
    :cond_3b
    move v7, v11

    .line 1163
    goto :goto_1f

    .line 1164
    :cond_3c
    :goto_1e
    const/4 v7, 0x1

    .line 1165
    :cond_3d
    :goto_1f
    iget-object v8, v5, Lk/g0;->e:Landroid/widget/EdgeEffect;

    .line 1166
    .line 1167
    invoke-static {v8}, Lk/g0;->f(Landroid/widget/EdgeEffect;)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v8

    .line 1171
    if-eqz v8, :cond_40

    .line 1172
    .line 1173
    invoke-virtual {v5}, Lk/g0;->b()Landroid/widget/EdgeEffect;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v5

    .line 1177
    invoke-interface {v2}, Lp/x0;->a()F

    .line 1178
    .line 1179
    .line 1180
    move-result v2

    .line 1181
    invoke-virtual {v0, v2}, Lx1/h0;->x0(F)F

    .line 1182
    .line 1183
    .line 1184
    move-result v0

    .line 1185
    invoke-interface {v3}, Lh1/d;->a()J

    .line 1186
    .line 1187
    .line 1188
    move-result-wide v8

    .line 1189
    shr-long v8, v8, v16

    .line 1190
    .line 1191
    long-to-int v2, v8

    .line 1192
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1193
    .line 1194
    .line 1195
    move-result v2

    .line 1196
    neg-float v2, v2

    .line 1197
    invoke-interface {v3}, Lh1/d;->a()J

    .line 1198
    .line 1199
    .line 1200
    move-result-wide v8

    .line 1201
    and-long v8, v8, v17

    .line 1202
    .line 1203
    long-to-int v3, v8

    .line 1204
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1205
    .line 1206
    .line 1207
    move-result v3

    .line 1208
    neg-float v3, v3

    .line 1209
    add-float/2addr v3, v0

    .line 1210
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1211
    .line 1212
    .line 1213
    move-result v0

    .line 1214
    int-to-long v8, v0

    .line 1215
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1216
    .line 1217
    .line 1218
    move-result v0

    .line 1219
    int-to-long v2, v0

    .line 1220
    shl-long v8, v8, v16

    .line 1221
    .line 1222
    and-long v2, v2, v17

    .line 1223
    .line 1224
    or-long/2addr v2, v8

    .line 1225
    const/high16 v0, 0x43340000    # 180.0f

    .line 1226
    .line 1227
    invoke-static {v0, v2, v3, v5, v4}, Lk/n0;->o1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v0

    .line 1231
    if-nez v0, :cond_3e

    .line 1232
    .line 1233
    if-eqz v7, :cond_3f

    .line 1234
    .line 1235
    :cond_3e
    const/4 v11, 0x1

    .line 1236
    :cond_3f
    move v7, v11

    .line 1237
    :cond_40
    if-eqz v7, :cond_41

    .line 1238
    .line 1239
    invoke-virtual {v6}, Lk/i;->g()V

    .line 1240
    .line 1241
    .line 1242
    :cond_41
    :goto_20
    return-void

    .line 1243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public p1()Landroid/graphics/RenderNode;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/n0;->z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/RenderNode;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lj2/b;->f()Landroid/graphics/RenderNode;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lk/n0;->z:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method
