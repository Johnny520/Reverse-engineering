.class public final synthetic Lcg1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lyf1;


# direct methods
.method public synthetic constructor <init>(Lyf1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcg1;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lcg1;->i:Lyf1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lcg1;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-class v2, Lj93;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object p0, p0, Lcg1;->i:Lyf1;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/util/Set;

    .line 14
    .line 15
    check-cast p2, Lwf1;

    .line 16
    .line 17
    invoke-virtual {p2}, Lwf1;->a()[Ljava/lang/annotation/Annotation;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    array-length v5, p2

    .line 24
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    array-length v5, p2

    .line 28
    move v6, v3

    .line 29
    :goto_0
    if-ge v6, v5, :cond_0

    .line 30
    .line 31
    aget-object v7, p2, v6

    .line 32
    .line 33
    invoke-static {v7}, Lp40;->v(Ljava/lang/annotation/Annotation;)Lbt;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-static {v7}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    add-int/lit8 v6, v6, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    check-cast p1, Ljava/util/Collection;

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eq p2, v5, :cond_1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    move p2, v3

    .line 67
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    add-int/lit8 v6, p2, 0x1

    .line 78
    .line 79
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Ljava/lang/Class;

    .line 84
    .line 85
    invoke-static {v5, p0, v1}, Ltl;->c0(Ljava/lang/Object;Lyf1;Ljava/lang/String;)Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-static {v7}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    if-nez v7, :cond_2

    .line 98
    .line 99
    move-object v7, v2

    .line 100
    :cond_2
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-nez v7, :cond_3

    .line 105
    .line 106
    invoke-static {p2, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-nez p2, :cond_3

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_3
    move p2, v6

    .line 114
    goto :goto_1

    .line 115
    :cond_4
    move v3, v4

    .line 116
    :goto_2
    xor-int/lit8 p0, v3, 0x1

    .line 117
    .line 118
    :goto_3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :pswitch_0
    check-cast p1, Ljava/util/Set;

    .line 124
    .line 125
    check-cast p2, Lwf1;

    .line 126
    .line 127
    invoke-virtual {p2}, Lwf1;->a()[Ljava/lang/annotation/Annotation;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    new-instance v0, Ljava/util/ArrayList;

    .line 132
    .line 133
    array-length v5, p2

    .line 134
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    .line 136
    .line 137
    array-length v5, p2

    .line 138
    move v6, v3

    .line 139
    :goto_4
    if-ge v6, v5, :cond_5

    .line 140
    .line 141
    aget-object v7, p2, v6

    .line 142
    .line 143
    invoke-static {v7}, Lp40;->v(Ljava/lang/annotation/Annotation;)Lbt;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-static {v7}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    add-int/lit8 v6, v6, 0x1

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_5
    check-cast p1, Ljava/util/Collection;

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eq p2, v5, :cond_6

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_6
    check-cast p1, Ljava/lang/Iterable;

    .line 171
    .line 172
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    move p2, v3

    .line 177
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_9

    .line 182
    .line 183
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    add-int/lit8 v6, p2, 0x1

    .line 188
    .line 189
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    check-cast p2, Ljava/lang/Class;

    .line 194
    .line 195
    invoke-static {v5, p0, v1}, Ltl;->c0(Ljava/lang/Object;Lyf1;Ljava/lang/String;)Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    invoke-static {v7}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    if-nez v7, :cond_7

    .line 208
    .line 209
    move-object v7, v2

    .line 210
    :cond_7
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-nez v7, :cond_8

    .line 215
    .line 216
    invoke-static {p2, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    if-nez p2, :cond_8

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_8
    move p2, v6

    .line 224
    goto :goto_5

    .line 225
    :cond_9
    move v3, v4

    .line 226
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
    :pswitch_1
    check-cast p1, Ljava/util/Set;

    .line 232
    .line 233
    check-cast p2, Lbh0;

    .line 234
    .line 235
    check-cast p1, Ljava/util/Collection;

    .line 236
    .line 237
    iget-object p2, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 238
    .line 239
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 243
    .line 244
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getExceptionTypes()[Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    invoke-static {p2}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    if-eq v0, v5, :cond_a

    .line 261
    .line 262
    goto/16 :goto_2

    .line 263
    .line 264
    :cond_a
    check-cast p1, Ljava/lang/Iterable;

    .line 265
    .line 266
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    move v0, v3

    .line 271
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    if-eqz v5, :cond_4

    .line 276
    .line 277
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    add-int/lit8 v6, v0, 0x1

    .line 282
    .line 283
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, Ljava/lang/Class;

    .line 288
    .line 289
    invoke-static {v5, p0, v1}, Ltl;->c0(Ljava/lang/Object;Lyf1;Ljava/lang/String;)Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    invoke-static {v7}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    if-nez v7, :cond_b

    .line 302
    .line 303
    move-object v7, v2

    .line 304
    :cond_b
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v7

    .line 308
    if-nez v7, :cond_c

    .line 309
    .line 310
    invoke-static {v0, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-nez v0, :cond_c

    .line 315
    .line 316
    goto/16 :goto_2

    .line 317
    .line 318
    :cond_c
    move v0, v6

    .line 319
    goto :goto_7

    .line 320
    :pswitch_2
    check-cast p1, Ljava/util/Set;

    .line 321
    .line 322
    check-cast p2, Lbh0;

    .line 323
    .line 324
    check-cast p1, Ljava/util/Collection;

    .line 325
    .line 326
    iget-object p2, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 327
    .line 328
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 332
    .line 333
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getExceptionTypes()[Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    move-result-object p2

    .line 337
    invoke-static {p2}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object p2

    .line 341
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-eq v0, v5, :cond_d

    .line 350
    .line 351
    goto :goto_9

    .line 352
    :cond_d
    check-cast p1, Ljava/lang/Iterable;

    .line 353
    .line 354
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    move v0, v3

    .line 359
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    if-eqz v5, :cond_10

    .line 364
    .line 365
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    add-int/lit8 v6, v0, 0x1

    .line 370
    .line 371
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    check-cast v0, Ljava/lang/Class;

    .line 376
    .line 377
    invoke-static {v5, p0, v1}, Ltl;->c0(Ljava/lang/Object;Lyf1;Ljava/lang/String;)Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    invoke-static {v7}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    if-nez v7, :cond_e

    .line 390
    .line 391
    move-object v7, v2

    .line 392
    :cond_e
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    if-nez v7, :cond_f

    .line 397
    .line 398
    invoke-static {v0, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-nez v0, :cond_f

    .line 403
    .line 404
    goto :goto_9

    .line 405
    :cond_f
    move v0, v6

    .line 406
    goto :goto_8

    .line 407
    :cond_10
    move v3, v4

    .line 408
    :goto_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    return-object p0

    .line 413
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 414
    .line 415
    check-cast p2, Lbh0;

    .line 416
    .line 417
    iget-object p2, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 418
    .line 419
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 423
    .line 424
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    move-result-object p2

    .line 428
    invoke-static {p2}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 429
    .line 430
    .line 431
    move-result-object p2

    .line 432
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 437
    .line 438
    .line 439
    move-result v5

    .line 440
    if-eq v0, v5, :cond_11

    .line 441
    .line 442
    goto/16 :goto_2

    .line 443
    .line 444
    :cond_11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    move v0, v3

    .line 449
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 450
    .line 451
    .line 452
    move-result v5

    .line 453
    if-eqz v5, :cond_4

    .line 454
    .line 455
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    add-int/lit8 v6, v0, 0x1

    .line 460
    .line 461
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    check-cast v0, Ljava/lang/Class;

    .line 466
    .line 467
    invoke-static {v5, p0, v1}, Ltl;->c0(Ljava/lang/Object;Lyf1;Ljava/lang/String;)Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    move-result-object v5

    .line 471
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 472
    .line 473
    .line 474
    move-result-object v7

    .line 475
    invoke-static {v7}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    move-result-object v7

    .line 479
    if-nez v7, :cond_12

    .line 480
    .line 481
    move-object v7, v2

    .line 482
    :cond_12
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v7

    .line 486
    if-nez v7, :cond_13

    .line 487
    .line 488
    invoke-static {v0, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-nez v0, :cond_13

    .line 493
    .line 494
    goto/16 :goto_2

    .line 495
    .line 496
    :cond_13
    move v0, v6

    .line 497
    goto :goto_a

    .line 498
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 499
    .line 500
    check-cast p2, Lbh0;

    .line 501
    .line 502
    iget-object p2, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 503
    .line 504
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 508
    .line 509
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 510
    .line 511
    .line 512
    move-result-object p2

    .line 513
    new-instance v0, Ljava/util/ArrayList;

    .line 514
    .line 515
    array-length v1, p2

    .line 516
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 517
    .line 518
    .line 519
    array-length v1, p2

    .line 520
    move v2, v3

    .line 521
    :goto_b
    if-ge v2, v1, :cond_15

    .line 522
    .line 523
    aget-object v5, p2, v2

    .line 524
    .line 525
    check-cast v5, [Ljava/lang/annotation/Annotation;

    .line 526
    .line 527
    new-instance v6, Ljava/util/ArrayList;

    .line 528
    .line 529
    array-length v7, v5

    .line 530
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 531
    .line 532
    .line 533
    array-length v7, v5

    .line 534
    move v8, v3

    .line 535
    :goto_c
    if-ge v8, v7, :cond_14

    .line 536
    .line 537
    aget-object v9, v5, v8

    .line 538
    .line 539
    invoke-static {v9}, Lp40;->v(Ljava/lang/annotation/Annotation;)Lbt;

    .line 540
    .line 541
    .line 542
    move-result-object v9

    .line 543
    invoke-static {v9}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    move-result-object v9

    .line 547
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    add-int/lit8 v8, v8, 0x1

    .line 551
    .line 552
    goto :goto_c

    .line 553
    :cond_14
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    add-int/lit8 v2, v2, 0x1

    .line 557
    .line 558
    goto :goto_b

    .line 559
    :cond_15
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 560
    .line 561
    .line 562
    move-result p2

    .line 563
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    if-eq p2, v1, :cond_16

    .line 568
    .line 569
    goto/16 :goto_2

    .line 570
    .line 571
    :cond_16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 572
    .line 573
    .line 574
    move-result-object p1

    .line 575
    move p2, v3

    .line 576
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    if-eqz v1, :cond_4

    .line 581
    .line 582
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    check-cast v1, Ljava/util/Collection;

    .line 587
    .line 588
    add-int/lit8 v2, p2, 0x1

    .line 589
    .line 590
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object p2

    .line 594
    check-cast p2, Ljava/util/List;

    .line 595
    .line 596
    invoke-static {v1, p2, p0}, Ltl;->r(Ljava/util/Collection;Ljava/util/List;Lyf1;)Z

    .line 597
    .line 598
    .line 599
    move-result p2

    .line 600
    if-nez p2, :cond_17

    .line 601
    .line 602
    goto/16 :goto_2

    .line 603
    .line 604
    :cond_17
    move p2, v2

    .line 605
    goto :goto_d

    .line 606
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 607
    .line 608
    check-cast p2, Lbh0;

    .line 609
    .line 610
    iget-object p2, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 611
    .line 612
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 616
    .line 617
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 618
    .line 619
    .line 620
    move-result-object p2

    .line 621
    new-instance v0, Ljava/util/ArrayList;

    .line 622
    .line 623
    array-length v1, p2

    .line 624
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 625
    .line 626
    .line 627
    array-length v1, p2

    .line 628
    move v2, v3

    .line 629
    :goto_e
    if-ge v2, v1, :cond_19

    .line 630
    .line 631
    aget-object v5, p2, v2

    .line 632
    .line 633
    check-cast v5, [Ljava/lang/annotation/Annotation;

    .line 634
    .line 635
    new-instance v6, Ljava/util/ArrayList;

    .line 636
    .line 637
    array-length v7, v5

    .line 638
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 639
    .line 640
    .line 641
    array-length v7, v5

    .line 642
    move v8, v3

    .line 643
    :goto_f
    if-ge v8, v7, :cond_18

    .line 644
    .line 645
    aget-object v9, v5, v8

    .line 646
    .line 647
    invoke-static {v9}, Lp40;->v(Ljava/lang/annotation/Annotation;)Lbt;

    .line 648
    .line 649
    .line 650
    move-result-object v9

    .line 651
    invoke-static {v9}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    move-result-object v9

    .line 655
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    add-int/lit8 v8, v8, 0x1

    .line 659
    .line 660
    goto :goto_f

    .line 661
    :cond_18
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    add-int/lit8 v2, v2, 0x1

    .line 665
    .line 666
    goto :goto_e

    .line 667
    :cond_19
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 668
    .line 669
    .line 670
    move-result p2

    .line 671
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 672
    .line 673
    .line 674
    move-result v1

    .line 675
    if-eq p2, v1, :cond_1a

    .line 676
    .line 677
    goto :goto_11

    .line 678
    :cond_1a
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 679
    .line 680
    .line 681
    move-result-object p1

    .line 682
    move p2, v3

    .line 683
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    if-eqz v1, :cond_1c

    .line 688
    .line 689
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    check-cast v1, Ljava/util/Collection;

    .line 694
    .line 695
    add-int/lit8 v2, p2, 0x1

    .line 696
    .line 697
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object p2

    .line 701
    check-cast p2, Ljava/util/List;

    .line 702
    .line 703
    invoke-static {v1, p2, p0}, Ltl;->r(Ljava/util/Collection;Ljava/util/List;Lyf1;)Z

    .line 704
    .line 705
    .line 706
    move-result p2

    .line 707
    if-nez p2, :cond_1b

    .line 708
    .line 709
    goto :goto_11

    .line 710
    :cond_1b
    move p2, v2

    .line 711
    goto :goto_10

    .line 712
    :cond_1c
    move v3, v4

    .line 713
    :goto_11
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 714
    .line 715
    .line 716
    move-result-object p0

    .line 717
    return-object p0

    .line 718
    :pswitch_6
    check-cast p1, Ljava/util/List;

    .line 719
    .line 720
    check-cast p2, Lbh0;

    .line 721
    .line 722
    iget-object p2, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 723
    .line 724
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 728
    .line 729
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    move-result-object p2

    .line 733
    invoke-static {p2}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 734
    .line 735
    .line 736
    move-result-object p2

    .line 737
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 742
    .line 743
    .line 744
    move-result v5

    .line 745
    if-eq v0, v5, :cond_1d

    .line 746
    .line 747
    goto :goto_13

    .line 748
    :cond_1d
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 749
    .line 750
    .line 751
    move-result-object p1

    .line 752
    move v0, v3

    .line 753
    :goto_12
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 754
    .line 755
    .line 756
    move-result v5

    .line 757
    if-eqz v5, :cond_20

    .line 758
    .line 759
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v5

    .line 763
    add-int/lit8 v6, v0, 0x1

    .line 764
    .line 765
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    check-cast v0, Ljava/lang/Class;

    .line 770
    .line 771
    invoke-static {v5, p0, v1}, Ltl;->c0(Ljava/lang/Object;Lyf1;Ljava/lang/String;)Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    move-result-object v5

    .line 775
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 776
    .line 777
    .line 778
    move-result-object v7

    .line 779
    invoke-static {v7}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    move-result-object v7

    .line 783
    if-nez v7, :cond_1e

    .line 784
    .line 785
    move-object v7, v2

    .line 786
    :cond_1e
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v7

    .line 790
    if-nez v7, :cond_1f

    .line 791
    .line 792
    invoke-static {v0, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    move-result v0

    .line 796
    if-nez v0, :cond_1f

    .line 797
    .line 798
    goto :goto_13

    .line 799
    :cond_1f
    move v0, v6

    .line 800
    goto :goto_12

    .line 801
    :cond_20
    move v3, v4

    .line 802
    :goto_13
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 803
    .line 804
    .line 805
    move-result-object p0

    .line 806
    return-object p0

    .line 807
    :pswitch_7
    check-cast p2, Lgi0;

    .line 808
    .line 809
    iget-object p2, p2, Lgi0;->c:Ljava/lang/reflect/Field;

    .line 810
    .line 811
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    move-result-object p2

    .line 815
    const-string v0, "Field: type"

    .line 816
    .line 817
    invoke-static {p1, p0, v0}, Ltl;->c0(Ljava/lang/Object;Lyf1;Ljava/lang/String;)Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    move-result-object p0

    .line 821
    invoke-static {p2, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result p0

    .line 825
    goto/16 :goto_3

    .line 826
    .line 827
    :pswitch_8
    check-cast p2, Lrg1;

    .line 828
    .line 829
    iget-object p2, p2, Lrg1;->c:Ljava/lang/reflect/Method;

    .line 830
    .line 831
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 832
    .line 833
    .line 834
    move-result-object p2

    .line 835
    const-string v0, "Method: returnType"

    .line 836
    .line 837
    invoke-static {p1, p0, v0}, Ltl;->c0(Ljava/lang/Object;Lyf1;Ljava/lang/String;)Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    move-result-object p0

    .line 841
    invoke-static {p2, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    move-result p0

    .line 845
    goto/16 :goto_3

    .line 846
    .line 847
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
