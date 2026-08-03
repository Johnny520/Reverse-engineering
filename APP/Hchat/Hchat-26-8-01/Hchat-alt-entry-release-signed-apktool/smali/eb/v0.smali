.class public final synthetic Leb/v0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Leb/v0;->g:I

    .line 2
    .line 3
    iput p1, p0, Leb/v0;->h:I

    .line 4
    .line 5
    iput-object p2, p0, Leb/v0;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Leb/v0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 13
    iput p4, p0, Leb/v0;->g:I

    iput-object p1, p0, Leb/v0;->i:Ljava/lang/Object;

    iput p2, p0, Leb/v0;->h:I

    iput-object p3, p0, Leb/v0;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 14
    iput p4, p0, Leb/v0;->g:I

    iput-object p1, p0, Leb/v0;->i:Ljava/lang/Object;

    iput-object p2, p0, Leb/v0;->j:Ljava/lang/Object;

    iput p3, p0, Leb/v0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Leb/v0;->g:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 9
    .line 10
    iget-object v6, v0, Leb/v0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v7, v0, Leb/v0;->i:Ljava/lang/Object;

    .line 13
    .line 14
    iget v8, v0, Leb/v0;->h:I

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v7, Li0/a1;

    .line 20
    .line 21
    check-cast v6, Li0/a1;

    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, Ln2/s;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Ln2/s;->a:Li2/g;

    .line 31
    .line 32
    iget-object v2, v2, Li2/g;->h:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v8, v2}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-wide v3, v1, Ln2/s;->b:J

    .line 39
    .line 40
    sget v1, Li2/m0;->c:I

    .line 41
    .line 42
    const/16 v1, 0x20

    .line 43
    .line 44
    shr-long v8, v3, v1

    .line 45
    .line 46
    long-to-int v1, v8

    .line 47
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-le v1, v8, :cond_0

    .line 52
    .line 53
    move v1, v8

    .line 54
    :cond_0
    const-wide v8, 0xffffffffL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v3, v8

    .line 60
    long-to-int v3, v3

    .line 61
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-le v3, v4, :cond_1

    .line 66
    .line 67
    move v3, v4

    .line 68
    :cond_1
    new-instance v4, Ln2/s;

    .line 69
    .line 70
    invoke-static {v1, v3}, Li2/e0;->b(II)J

    .line 71
    .line 72
    .line 73
    move-result-wide v8

    .line 74
    const/4 v1, 0x4

    .line 75
    invoke-direct {v4, v1, v2, v8, v9}, Ln2/s;-><init>(ILjava/lang/String;J)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v7, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const-string v1, ""

    .line 82
    .line 83
    invoke-interface {v6, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-object v5

    .line 87
    :pswitch_0
    check-cast v7, Landroid/content/Context;

    .line 88
    .line 89
    check-cast v6, Li0/a1;

    .line 90
    .line 91
    move-object/from16 v1, p1

    .line 92
    .line 93
    check-cast v1, Ljava/util/List;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    if-ne v8, v3, :cond_2

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    const/16 v10, 0x9

    .line 105
    .line 106
    if-le v9, v10, :cond_2

    .line 107
    .line 108
    const-string v2, "\u670b\u53cb\u5708\u6700\u591a\u4fdd\u7559\u524d 9 \u5f20\u56fe\u7247"

    .line 109
    .line 110
    invoke-static {v7, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    if-ne v8, v2, :cond_3

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-le v2, v3, :cond_3

    .line 125
    .line 126
    const-string v2, "\u670b\u53cb\u5708\u53ea\u4fdd\u7559\u7b2c 1 \u4e2a\u89c6\u9891"

    .line 127
    .line 128
    invoke-static {v7, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 133
    .line 134
    .line 135
    :cond_3
    :goto_0
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    check-cast v2, Ldb/c;

    .line 140
    .line 141
    invoke-static {v2, v8, v1}, Lwb/ho;->o7(Ldb/c;ILjava/util/List;)Ldb/c;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-interface {v6, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return-object v5

    .line 149
    :pswitch_1
    check-cast v7, Lfg/l;

    .line 150
    .line 151
    check-cast v6, Landroid/content/Context;

    .line 152
    .line 153
    move-object/from16 v1, p1

    .line 154
    .line 155
    check-cast v1, Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_5

    .line 165
    .line 166
    if-ne v8, v3, :cond_4

    .line 167
    .line 168
    sget-object v2, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 169
    .line 170
    invoke-static {v6, v1}, Le9/q;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    :cond_4
    invoke-interface {v7, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    :cond_5
    return-object v5

    .line 178
    :pswitch_2
    check-cast v7, Ljava/lang/String;

    .line 179
    .line 180
    check-cast v6, Lk9/c;

    .line 181
    .line 182
    move-object/from16 v1, p1

    .line 183
    .line 184
    check-cast v1, Landroid/widget/ImageView;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v7}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 190
    .line 191
    .line 192
    new-instance v2, Lk9/d;

    .line 193
    .line 194
    invoke-direct {v2, v6, v8}, Lk9/d;-><init>(Lk9/c;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 198
    .line 199
    .line 200
    return-object v5

    .line 201
    :pswitch_3
    check-cast v7, Lw/r1;

    .line 202
    .line 203
    check-cast v6, Lv1/b1;

    .line 204
    .line 205
    move-object/from16 v9, p1

    .line 206
    .line 207
    check-cast v9, Lv1/a1;

    .line 208
    .line 209
    iget v10, v7, Lw/r1;->b:I

    .line 210
    .line 211
    iget-object v1, v7, Lw/r1;->a:Lw/j1;

    .line 212
    .line 213
    iget-object v11, v7, Lw/r1;->c:Ln2/z;

    .line 214
    .line 215
    iget-object v2, v7, Lw/r1;->d:Lfg/a;

    .line 216
    .line 217
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, Lw/m1;

    .line 222
    .line 223
    if-eqz v2, :cond_6

    .line 224
    .line 225
    iget-object v2, v2, Lw/m1;->a:Li2/k0;

    .line 226
    .line 227
    :goto_1
    move-object v12, v2

    .line 228
    goto :goto_2

    .line 229
    :cond_6
    const/4 v2, 0x0

    .line 230
    goto :goto_1

    .line 231
    :goto_2
    const/4 v13, 0x0

    .line 232
    iget v14, v6, Lv1/b1;->g:I

    .line 233
    .line 234
    invoke-static/range {v9 .. v14}, Lw/s;->k(Lv1/a1;ILn2/z;Li2/k0;ZI)Le1/c;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    sget-object v3, Lm/p1;->g:Lm/p1;

    .line 239
    .line 240
    iget v7, v6, Lv1/b1;->h:I

    .line 241
    .line 242
    invoke-virtual {v1, v3, v2, v8, v7}, Lw/j1;->a(Lm/p1;Le1/c;II)V

    .line 243
    .line 244
    .line 245
    iget-object v1, v1, Lw/j1;->a:Li0/f1;

    .line 246
    .line 247
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    neg-float v1, v1

    .line 252
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    invoke-static {v9, v6, v4, v1}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 257
    .line 258
    .line 259
    return-object v5

    .line 260
    :pswitch_4
    check-cast v7, Lk/u1;

    .line 261
    .line 262
    check-cast v6, Lv1/b1;

    .line 263
    .line 264
    move-object/from16 v1, p1

    .line 265
    .line 266
    check-cast v1, Lv1/a1;

    .line 267
    .line 268
    iget-object v2, v7, Lk/u1;->u:Lk/w1;

    .line 269
    .line 270
    iget-object v2, v2, Lk/w1;->a:Li0/g1;

    .line 271
    .line 272
    invoke-virtual {v2}, Li0/g1;->g()I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-gez v2, :cond_7

    .line 277
    .line 278
    move v2, v4

    .line 279
    :cond_7
    if-le v2, v8, :cond_8

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_8
    move v8, v2

    .line 283
    :goto_3
    neg-int v2, v8

    .line 284
    iget-boolean v7, v7, Lk/u1;->v:Z

    .line 285
    .line 286
    if-eqz v7, :cond_9

    .line 287
    .line 288
    move v8, v4

    .line 289
    goto :goto_4

    .line 290
    :cond_9
    move v8, v2

    .line 291
    :goto_4
    if-eqz v7, :cond_a

    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_a
    move v2, v4

    .line 295
    :goto_5
    iput-boolean v3, v1, Lv1/a1;->g:Z

    .line 296
    .line 297
    invoke-static {v1, v6, v8, v2}, Lv1/a1;->F(Lv1/a1;Lv1/b1;II)V

    .line 298
    .line 299
    .line 300
    iput-boolean v4, v1, Lv1/a1;->g:Z

    .line 301
    .line 302
    return-object v5

    .line 303
    :pswitch_5
    check-cast v7, Li0/r1;

    .line 304
    .line 305
    check-cast v6, Lf/b0;

    .line 306
    .line 307
    move-object/from16 v1, p1

    .line 308
    .line 309
    check-cast v1, Li0/n;

    .line 310
    .line 311
    iget v9, v7, Li0/r1;->e:I

    .line 312
    .line 313
    if-ne v9, v8, :cond_13

    .line 314
    .line 315
    iget-object v9, v7, Li0/r1;->f:Lf/b0;

    .line 316
    .line 317
    invoke-static {v6, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v9

    .line 321
    if-eqz v9, :cond_13

    .line 322
    .line 323
    instance-of v9, v1, Li0/q;

    .line 324
    .line 325
    if-eqz v9, :cond_13

    .line 326
    .line 327
    iget-object v9, v6, Lf/b0;->a:[J

    .line 328
    .line 329
    array-length v10, v9

    .line 330
    sub-int/2addr v10, v2

    .line 331
    if-ltz v10, :cond_13

    .line 332
    .line 333
    move v2, v4

    .line 334
    :goto_6
    aget-wide v11, v9, v2

    .line 335
    .line 336
    not-long v13, v11

    .line 337
    const/4 v15, 0x7

    .line 338
    shl-long/2addr v13, v15

    .line 339
    and-long/2addr v13, v11

    .line 340
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    and-long/2addr v13, v15

    .line 346
    cmp-long v13, v13, v15

    .line 347
    .line 348
    if-eqz v13, :cond_12

    .line 349
    .line 350
    sub-int v13, v2, v10

    .line 351
    .line 352
    not-int v13, v13

    .line 353
    ushr-int/lit8 v13, v13, 0x1f

    .line 354
    .line 355
    const/16 v14, 0x8

    .line 356
    .line 357
    rsub-int/lit8 v13, v13, 0x8

    .line 358
    .line 359
    move v15, v4

    .line 360
    :goto_7
    if-ge v15, v13, :cond_11

    .line 361
    .line 362
    const-wide/16 v16, 0xff

    .line 363
    .line 364
    and-long v16, v11, v16

    .line 365
    .line 366
    const-wide/16 v18, 0x80

    .line 367
    .line 368
    cmp-long v16, v16, v18

    .line 369
    .line 370
    if-gez v16, :cond_f

    .line 371
    .line 372
    shl-int/lit8 v16, v2, 0x3

    .line 373
    .line 374
    add-int v3, v16, v15

    .line 375
    .line 376
    iget-object v4, v6, Lf/b0;->b:[Ljava/lang/Object;

    .line 377
    .line 378
    aget-object v4, v4, v3

    .line 379
    .line 380
    move/from16 p1, v14

    .line 381
    .line 382
    iget-object v14, v6, Lf/b0;->c:[I

    .line 383
    .line 384
    aget v14, v14, v3

    .line 385
    .line 386
    if-eq v14, v8, :cond_b

    .line 387
    .line 388
    const/4 v14, 0x1

    .line 389
    goto :goto_8

    .line 390
    :cond_b
    const/4 v14, 0x0

    .line 391
    :goto_8
    if-eqz v14, :cond_d

    .line 392
    .line 393
    move-object v0, v1

    .line 394
    check-cast v0, Li0/q;

    .line 395
    .line 396
    move-object/from16 v18, v1

    .line 397
    .line 398
    iget-object v1, v0, Li0/q;->m:Lf/k0;

    .line 399
    .line 400
    invoke-static {v1, v4, v7}, Lf8/i;->w0(Lf/k0;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-object/from16 v19, v5

    .line 404
    .line 405
    instance-of v5, v4, Li0/x;

    .line 406
    .line 407
    if-eqz v5, :cond_e

    .line 408
    .line 409
    move-object v5, v4

    .line 410
    check-cast v5, Li0/x;

    .line 411
    .line 412
    invoke-virtual {v1, v5}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    if-nez v1, :cond_c

    .line 417
    .line 418
    iget-object v0, v0, Li0/q;->p:Lf/k0;

    .line 419
    .line 420
    invoke-static {v0, v5}, Lf8/i;->x0(Lf/k0;Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    :cond_c
    iget-object v0, v7, Li0/r1;->g:Lf/k0;

    .line 424
    .line 425
    if-eqz v0, :cond_e

    .line 426
    .line 427
    invoke-virtual {v0, v4}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    goto :goto_9

    .line 431
    :cond_d
    move-object/from16 v18, v1

    .line 432
    .line 433
    move-object/from16 v19, v5

    .line 434
    .line 435
    :cond_e
    :goto_9
    if-eqz v14, :cond_10

    .line 436
    .line 437
    invoke-virtual {v6, v3}, Lf/b0;->f(I)V

    .line 438
    .line 439
    .line 440
    goto :goto_a

    .line 441
    :cond_f
    move-object/from16 v18, v1

    .line 442
    .line 443
    move-object/from16 v19, v5

    .line 444
    .line 445
    move/from16 p1, v14

    .line 446
    .line 447
    :cond_10
    :goto_a
    shr-long v11, v11, p1

    .line 448
    .line 449
    add-int/lit8 v15, v15, 0x1

    .line 450
    .line 451
    move-object/from16 v0, p0

    .line 452
    .line 453
    move/from16 v14, p1

    .line 454
    .line 455
    move-object/from16 v1, v18

    .line 456
    .line 457
    move-object/from16 v5, v19

    .line 458
    .line 459
    const/4 v3, 0x1

    .line 460
    const/4 v4, 0x0

    .line 461
    goto :goto_7

    .line 462
    :cond_11
    move-object/from16 v18, v1

    .line 463
    .line 464
    move-object/from16 v19, v5

    .line 465
    .line 466
    move v0, v14

    .line 467
    if-ne v13, v0, :cond_14

    .line 468
    .line 469
    goto :goto_b

    .line 470
    :cond_12
    move-object/from16 v18, v1

    .line 471
    .line 472
    move-object/from16 v19, v5

    .line 473
    .line 474
    :goto_b
    if-eq v2, v10, :cond_14

    .line 475
    .line 476
    add-int/lit8 v2, v2, 0x1

    .line 477
    .line 478
    move-object/from16 v0, p0

    .line 479
    .line 480
    move-object/from16 v1, v18

    .line 481
    .line 482
    move-object/from16 v5, v19

    .line 483
    .line 484
    const/4 v3, 0x1

    .line 485
    const/4 v4, 0x0

    .line 486
    goto/16 :goto_6

    .line 487
    .line 488
    :cond_13
    move-object/from16 v19, v5

    .line 489
    .line 490
    :cond_14
    return-object v19

    .line 491
    :pswitch_6
    check-cast v7, Ljava/lang/String;

    .line 492
    .line 493
    check-cast v6, Ljava/lang/String;

    .line 494
    .line 495
    move-object/from16 v0, p1

    .line 496
    .line 497
    check-cast v0, Lj8/p;

    .line 498
    .line 499
    invoke-static {v8, v7, v6, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->r(ILjava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    return-object v0

    .line 508
    nop

    .line 509
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
