.class public final synthetic Lp9;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Lp9;->d:I

    iput-object p1, p0, Lp9;->e:Ljava/lang/Object;

    iput-object p2, p0, Lp9;->f:Ljava/lang/Object;

    iput-object p3, p0, Lp9;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lpi;Ljd;Lv11;Lmg0;)V
    .locals 0

    .line 1
    const/4 p4, 0x2

    .line 2
    iput p4, p0, Lp9;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lp9;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lp9;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lp9;->g:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lp9;->d:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lna1;->a:Lna1;

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    iget-object v7, p0, Lp9;->g:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v8, p0, Lp9;->f:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p0, p0, Lp9;->e:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, Lu2;

    .line 20
    .line 21
    check-cast v8, Lz11;

    .line 22
    .line 23
    check-cast v7, Lqm0;

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v8, p0}, Lz11;->c(Lu2;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    iget v0, v8, Lz11;->t:I

    .line 32
    .line 33
    sub-int/2addr p0, v0

    .line 34
    invoke-virtual {v8, p0}, Lz11;->a(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget p0, v8, Lz11;->t:I

    .line 38
    .line 39
    invoke-static {v8, v6, p0, v6}, Lp30;->p(Lz11;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lye;->Q(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ldi;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget-object v0, v0, Ldi;->b:Ljava/lang/Integer;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v0, v6

    .line 55
    :goto_0
    invoke-interface {v7, v0}, Lqm0;->e(Ljava/lang/Integer;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v0, :cond_7

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_2
    invoke-static {v1}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ldi;

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    sub-int/2addr v3, v5

    .line 79
    if-gtz v3, :cond_3

    .line 80
    .line 81
    sget-object v1, Lhs;->d:Lhs;

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    if-ne v3, v5, :cond_4

    .line 85
    .line 86
    invoke-static {v1}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    goto :goto_3

    .line 95
    :cond_4
    new-instance v4, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    instance-of v3, v1, Ljava/util/RandomAccess;

    .line 101
    .line 102
    if-eqz v3, :cond_5

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    :goto_1
    if-ge v5, v3, :cond_6

    .line 109
    .line 110
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    add-int/lit8 v5, v5, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    invoke-interface {v1, v5}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_6

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_6
    move-object v1, v4

    .line 139
    :goto_3
    iget v2, v2, Ldi;->a:I

    .line 140
    .line 141
    new-instance v3, Ldi;

    .line 142
    .line 143
    invoke-direct {v3, v2, v6, v0}, Ldi;-><init>(ILz60;Ljava/lang/Integer;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v3}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v0, v1}, Lye;->S(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    :cond_7
    :goto_4
    new-instance v0, Lci;

    .line 155
    .line 156
    invoke-static {p0, v1}, Lye;->S(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-direct {v0, p0}, Lci;-><init>(Ljava/util/List;)V

    .line 161
    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_0
    check-cast p0, Landroid/widget/TextView;

    .line 165
    .line 166
    check-cast v8, Landroid/app/Activity;

    .line 167
    .line 168
    check-cast v7, Landroid/graphics/drawable/GradientDrawable;

    .line 169
    .line 170
    invoke-static {p0, v8, v7}, Lck0;->i(Landroid/widget/TextView;Landroid/app/Activity;Landroid/graphics/drawable/GradientDrawable;)Lna1;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_1
    check-cast p0, Ldn;

    .line 176
    .line 177
    check-cast v8, Lc90;

    .line 178
    .line 179
    check-cast v7, Ly60;

    .line 180
    .line 181
    invoke-virtual {p0}, Ldn;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    check-cast p0, Lp80;

    .line 186
    .line 187
    new-instance v0, Lu5;

    .line 188
    .line 189
    iget-object v1, v8, Lc90;->e:Lfe;

    .line 190
    .line 191
    iget-object v1, v1, Lfe;->e:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v1, Lt70;

    .line 194
    .line 195
    invoke-virtual {v1}, Lt70;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, Lz20;

    .line 200
    .line 201
    invoke-direct {v0, v1, p0}, Lu5;-><init>(Lz20;Lu50;)V

    .line 202
    .line 203
    .line 204
    new-instance v1, Lr80;

    .line 205
    .line 206
    invoke-direct {v1, v8, p0, v7, v0}, Lr80;-><init>(Lc90;Lp80;Ly60;Lu5;)V

    .line 207
    .line 208
    .line 209
    return-object v1

    .line 210
    :pswitch_2
    check-cast p0, Loh0;

    .line 211
    .line 212
    check-cast v8, Loh0;

    .line 213
    .line 214
    check-cast v7, Lhw;

    .line 215
    .line 216
    new-instance v0, Lwn0;

    .line 217
    .line 218
    invoke-interface {p0}, Lw31;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    check-cast p0, Lyw;

    .line 223
    .line 224
    invoke-interface {v8}, Lw31;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, Lsw;

    .line 229
    .line 230
    invoke-interface {v7}, Lhw;->invoke()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    check-cast v2, Ljava/lang/Number;

    .line 235
    .line 236
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    invoke-direct {v0, p0, v1, v2}, Lwn0;-><init>(Lyw;Lsw;I)V

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    :pswitch_3
    move-object v6, p0

    .line 245
    check-cast v6, Lck;

    .line 246
    .line 247
    move-object p0, v8

    .line 248
    check-cast p0, Lva1;

    .line 249
    .line 250
    move-object v0, v7

    .line 251
    check-cast v0, Lkb;

    .line 252
    .line 253
    iget-object v13, v6, Lck;->w:Leb;

    .line 254
    .line 255
    :goto_5
    iget-object v7, v13, Leb;->a:Lsh0;

    .line 256
    .line 257
    iget v8, v7, Lsh0;->f:I

    .line 258
    .line 259
    if-eqz v8, :cond_a

    .line 260
    .line 261
    if-eqz v8, :cond_9

    .line 262
    .line 263
    add-int/lit8 v8, v8, -0x1

    .line 264
    .line 265
    iget-object v7, v7, Lsh0;->d:[Ljava/lang/Object;

    .line 266
    .line 267
    aget-object v7, v7, v8

    .line 268
    .line 269
    check-cast v7, Lyj;

    .line 270
    .line 271
    iget-object v7, v7, Lyj;->a:Lfb;

    .line 272
    .line 273
    invoke-virtual {v7}, Lfb;->invoke()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    check-cast v7, Lst0;

    .line 278
    .line 279
    if-nez v7, :cond_8

    .line 280
    .line 281
    move v7, v5

    .line 282
    goto :goto_6

    .line 283
    :cond_8
    const-wide/16 v10, 0x0

    .line 284
    .line 285
    const/4 v12, 0x3

    .line 286
    const-wide/16 v8, 0x0

    .line 287
    .line 288
    invoke-static/range {v6 .. v12}, Lck;->x0(Lck;Lst0;JJI)Z

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    :goto_6
    if-eqz v7, :cond_a

    .line 293
    .line 294
    iget-object v7, v13, Leb;->a:Lsh0;

    .line 295
    .line 296
    iget v8, v7, Lsh0;->f:I

    .line 297
    .line 298
    sub-int/2addr v8, v5

    .line 299
    invoke-virtual {v7, v8}, Lsh0;->k(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    check-cast v7, Lyj;

    .line 304
    .line 305
    iget-object v7, v7, Lyj;->b:Lwc;

    .line 306
    .line 307
    invoke-virtual {v7, v4}, Lwc;->i(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_9
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 312
    .line 313
    const-string v0, "MutableVector is empty."

    .line 314
    .line 315
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw p0

    .line 319
    :cond_a
    iget-boolean v7, v6, Lck;->x:Z

    .line 320
    .line 321
    if-eqz v7, :cond_b

    .line 322
    .line 323
    iget-object v7, v6, Lck;->v:Lzy0;

    .line 324
    .line 325
    invoke-virtual {v7}, Lzy0;->invoke()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    check-cast v7, Lst0;

    .line 330
    .line 331
    if-eqz v7, :cond_b

    .line 332
    .line 333
    const-wide/16 v10, 0x0

    .line 334
    .line 335
    const/4 v12, 0x3

    .line 336
    const-wide/16 v8, 0x0

    .line 337
    .line 338
    invoke-static/range {v6 .. v12}, Lck;->x0(Lck;Lst0;JJI)Z

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    if-ne v7, v5, :cond_b

    .line 343
    .line 344
    iput-boolean v3, v6, Lck;->x:Z

    .line 345
    .line 346
    :cond_b
    invoke-static {v6, v0, v1, v2}, Lck;->w0(Lck;Lkb;J)F

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    iput v0, p0, Lva1;->e:F

    .line 351
    .line 352
    return-object v4

    .line 353
    :pswitch_4
    check-cast p0, Lpi;

    .line 354
    .line 355
    check-cast v8, Ljd;

    .line 356
    .line 357
    check-cast v7, Lv11;

    .line 358
    .line 359
    iget-object v1, p0, Lpi;->M:Lki;

    .line 360
    .line 361
    iget-object v2, v1, Lki;->b:Ljd;

    .line 362
    .line 363
    :try_start_0
    iput-object v8, v1, Lki;->b:Ljd;

    .line 364
    .line 365
    iget-object v4, p0, Lpi;->G:Lv11;

    .line 366
    .line 367
    iget-object v5, p0, Lpi;->o:[I

    .line 368
    .line 369
    iget-object v8, p0, Lpi;->v:Lug0;

    .line 370
    .line 371
    iput-object v6, p0, Lpi;->o:[I

    .line 372
    .line 373
    iput-object v6, p0, Lpi;->v:Lug0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 374
    .line 375
    :try_start_1
    iput-object v7, p0, Lpi;->G:Lv11;

    .line 376
    .line 377
    iget-boolean v7, v1, Lki;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 378
    .line 379
    :try_start_2
    iput-boolean v3, v1, Lki;->e:Z

    .line 380
    .line 381
    throw v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 382
    :catchall_0
    move-exception v0

    .line 383
    :try_start_3
    iput-boolean v7, v1, Lki;->e:Z

    .line 384
    .line 385
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 386
    :catchall_1
    move-exception v0

    .line 387
    :try_start_4
    iput-object v4, p0, Lpi;->G:Lv11;

    .line 388
    .line 389
    iput-object v5, p0, Lpi;->o:[I

    .line 390
    .line 391
    iput-object v8, p0, Lpi;->v:Lug0;

    .line 392
    .line 393
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 394
    :catchall_2
    move-exception v0

    .line 395
    move-object p0, v0

    .line 396
    iput-object v2, v1, Lki;->b:Ljd;

    .line 397
    .line 398
    throw p0

    .line 399
    :pswitch_5
    check-cast p0, Lhb;

    .line 400
    .line 401
    check-cast v8, Lqj0;

    .line 402
    .line 403
    check-cast v7, Lm3;

    .line 404
    .line 405
    invoke-static {p0, v8, v7}, Lhb;->w0(Lhb;Lqj0;Lm3;)Lst0;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    if-eqz v10, :cond_d

    .line 410
    .line 411
    iget-object v9, p0, Lhb;->r:Lck;

    .line 412
    .line 413
    iget-wide v3, v9, Lck;->y:J

    .line 414
    .line 415
    invoke-static {v3, v4, v1, v2}, Ld30;->a(JJ)Z

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    if-eqz p0, :cond_c

    .line 420
    .line 421
    const-string p0, "Expected BringIntoViewRequester to not be used before parents are placed."

    .line 422
    .line 423
    invoke-static {p0}, Lz10;->c(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    :cond_c
    iget-wide v11, v9, Lck;->y:J

    .line 427
    .line 428
    const-wide/16 v13, 0x0

    .line 429
    .line 430
    invoke-virtual/range {v9 .. v14}, Lck;->z0(Lst0;JJ)J

    .line 431
    .line 432
    .line 433
    move-result-wide v0

    .line 434
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    xor-long/2addr v0, v2

    .line 440
    invoke-virtual {v10, v0, v1}, Lst0;->e(J)Lst0;

    .line 441
    .line 442
    .line 443
    move-result-object v6

    .line 444
    :cond_d
    return-object v6

    .line 445
    :pswitch_6
    check-cast p0, Lq9;

    .line 446
    .line 447
    check-cast v8, Lr9;

    .line 448
    .line 449
    check-cast v7, Lxt0;

    .line 450
    .line 451
    invoke-virtual {p0}, Lq9;->a()V

    .line 452
    .line 453
    .line 454
    iget-object p0, v8, Lr9;->c:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast p0, Lg9;

    .line 457
    .line 458
    iget v0, v7, Lxt0;->d:I

    .line 459
    .line 460
    :cond_e
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    ushr-int/lit8 v2, v1, 0x1b

    .line 465
    .line 466
    and-int/lit8 v2, v2, 0xf

    .line 467
    .line 468
    if-ne v2, v0, :cond_f

    .line 469
    .line 470
    add-int/lit8 v2, v1, -0x1

    .line 471
    .line 472
    goto :goto_7

    .line 473
    :cond_f
    move v2, v1

    .line 474
    :goto_7
    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    if-eqz v1, :cond_e

    .line 479
    .line 480
    return-object v4

    .line 481
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
