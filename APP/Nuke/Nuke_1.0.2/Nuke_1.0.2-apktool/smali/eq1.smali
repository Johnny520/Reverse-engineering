.class public final synthetic Leq1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 8
    iput p1, p0, Leq1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkj1;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Leq1;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget p0, p0, Leq1;->h:I

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    const-class v1, Landroid/util/SparseArray;

    .line 6
    .line 7
    const-string v2, "com.tencent.mm.ui"

    .line 8
    .line 9
    const v3, 0x79070006

    .line 10
    .line 11
    .line 12
    const/16 v4, 0x479

    .line 13
    .line 14
    const/4 v5, 0x2

    .line 15
    const/4 v6, 0x1

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    sget-object v9, La83;->a:La83;

    .line 19
    .line 20
    packed-switch p0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    check-cast p0, Ljava/lang/Integer;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object p0, v7

    .line 38
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    move-object v7, p1

    .line 52
    check-cast v7, Ljava/lang/Integer;

    .line 53
    .line 54
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-static {p0, p1}, Lfg1;->i(II)J

    .line 62
    .line 63
    .line 64
    move-result-wide p0

    .line 65
    new-instance v0, Lf13;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, Lf13;-><init>(J)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    check-cast p1, Ljava/lang/Float;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    new-instance p1, Lxj;

    .line 81
    .line 82
    invoke-direct {p1, p0}, Lxj;-><init>(F)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :pswitch_1
    new-instance p0, Lim0;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    check-cast p1, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-direct {p0, p1}, Lim0;-><init>(I)V

    .line 98
    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    check-cast p1, Ljava/util/List;

    .line 105
    .line 106
    new-instance p0, Ln03;

    .line 107
    .line 108
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sget-object v1, Lp13;->b:[Lq13;

    .line 113
    .line 114
    sget-object v1, Lbd2;->v:Lad2;

    .line 115
    .line 116
    iget-object v1, v1, Lad2;->i:Lin0;

    .line 117
    .line 118
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-static {v0, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    if-eqz v0, :cond_2

    .line 124
    .line 125
    invoke-interface {v1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Lp13;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    move-object v0, v7

    .line 133
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-wide v3, v0, Lp13;->a:J

    .line 137
    .line 138
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {p1, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    if-eqz p1, :cond_3

    .line 146
    .line 147
    invoke-interface {v1, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    move-object v7, p1

    .line 152
    check-cast v7, Lp13;

    .line 153
    .line 154
    :cond_3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-wide v0, v7, Lp13;->a:J

    .line 158
    .line 159
    invoke-direct {p0, v3, v4, v0, v1}, Ln03;-><init>(JJ)V

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    check-cast p1, Ljava/util/List;

    .line 167
    .line 168
    new-instance p0, Lm03;

    .line 169
    .line 170
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    check-cast p1, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    invoke-direct {p0, v0, p1}, Lm03;-><init>(FF)V

    .line 191
    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_4
    new-instance p0, Lgz2;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    check-cast p1, Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    invoke-direct {p0, p1}, Lgz2;-><init>(I)V

    .line 206
    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    check-cast p1, Ljava/util/List;

    .line 213
    .line 214
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    sget-object v0, Lbd2;->a:Ldq1;

    .line 219
    .line 220
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-static {p0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_5

    .line 227
    .line 228
    :cond_4
    move-object p0, v7

    .line 229
    goto :goto_2

    .line 230
    :cond_5
    if-eqz p0, :cond_4

    .line 231
    .line 232
    iget-object v0, v0, Ldq1;->j:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Lin0;

    .line 235
    .line 236
    invoke-interface {v0, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    check-cast p0, Ljava/util/List;

    .line 241
    .line 242
    :goto_2
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    if-eqz p1, :cond_6

    .line 247
    .line 248
    move-object v7, p1

    .line 249
    check-cast v7, Ljava/lang/String;

    .line 250
    .line 251
    :cond_6
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    new-instance p1, Lsd;

    .line 255
    .line 256
    invoke-direct {p1, p0, v7}, Lsd;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    return-object p1

    .line 260
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    check-cast p1, Ljava/util/List;

    .line 264
    .line 265
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    sget-object v0, Lbd2;->h:Ldq1;

    .line 270
    .line 271
    iget-object v0, v0, Ldq1;->j:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, Lin0;

    .line 274
    .line 275
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-static {p0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-eqz v2, :cond_8

    .line 282
    .line 283
    :cond_7
    move-object p0, v7

    .line 284
    goto :goto_3

    .line 285
    :cond_8
    if-eqz p0, :cond_7

    .line 286
    .line 287
    invoke-interface {v0, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    check-cast p0, Llt2;

    .line 292
    .line 293
    :goto_3
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-static {v2, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-eqz v3, :cond_a

    .line 302
    .line 303
    :cond_9
    move-object v2, v7

    .line 304
    goto :goto_4

    .line 305
    :cond_a
    if-eqz v2, :cond_9

    .line 306
    .line 307
    invoke-interface {v0, v2}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    check-cast v2, Llt2;

    .line 312
    .line 313
    :goto_4
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-static {v3, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    if-eqz v4, :cond_c

    .line 322
    .line 323
    :cond_b
    move-object v3, v7

    .line 324
    goto :goto_5

    .line 325
    :cond_c
    if-eqz v3, :cond_b

    .line 326
    .line 327
    invoke-interface {v0, v3}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    check-cast v3, Llt2;

    .line 332
    .line 333
    :goto_5
    const/4 v4, 0x3

    .line 334
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-static {p1, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-eqz v1, :cond_d

    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_d
    if-eqz p1, :cond_e

    .line 346
    .line 347
    invoke-interface {v0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    move-object v7, p1

    .line 352
    check-cast v7, Llt2;

    .line 353
    .line 354
    :cond_e
    :goto_6
    new-instance p1, Lb13;

    .line 355
    .line 356
    invoke-direct {p1, p0, v2, v3, v7}, Lb13;-><init>(Llt2;Llt2;Llt2;Llt2;)V

    .line 357
    .line 358
    .line 359
    :pswitch_7
    return-object p1

    .line 360
    :pswitch_8
    check-cast p1, Ljava/util/Map;

    .line 361
    .line 362
    new-instance p0, Ldc2;

    .line 363
    .line 364
    invoke-direct {p0, p1}, Ldc2;-><init>(Ljava/util/Map;)V

    .line 365
    .line 366
    .line 367
    return-object p0

    .line 368
    :pswitch_9
    check-cast p1, Lcj0;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    new-instance p0, Leq1;

    .line 374
    .line 375
    const/16 v0, 0x12

    .line 376
    .line 377
    invoke-direct {p0, v0}, Leq1;-><init>(I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p1, p0}, Lcj0;->c0(Lin0;)V

    .line 381
    .line 382
    .line 383
    return-object v9

    .line 384
    :pswitch_a
    check-cast p1, Lat;

    .line 385
    .line 386
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    const-string p0, "MicroMsg.SqliteDB"

    .line 390
    .line 391
    const-string v0, "sql is null "

    .line 392
    .line 393
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    invoke-virtual {p1, p0}, Lat;->c0([Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    return-object v9

    .line 401
    :pswitch_b
    check-cast p1, Lcj0;

    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    new-instance p0, Lat;

    .line 407
    .line 408
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 409
    .line 410
    .line 411
    const-string v0, "DB has been closed :[%s]"

    .line 412
    .line 413
    filled-new-array {v0}, [Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    iput-object p0, p1, Lcj0;->u:Lat;

    .line 421
    .line 422
    return-object v9

    .line 423
    :pswitch_c
    check-cast p1, Lgf2;

    .line 424
    .line 425
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    iget-object p0, p1, Lgf2;->a:Ljava/lang/String;

    .line 429
    .line 430
    iget-object p1, p1, Lgf2;->b:Ljava/lang/String;

    .line 431
    .line 432
    if-eqz p0, :cond_f

    .line 433
    .line 434
    new-instance v0, Ljava/lang/StringBuilder;

    .line 435
    .line 436
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    const-string p0, ": "

    .line 443
    .line 444
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    :cond_f
    return-object p1

    .line 455
    :pswitch_d
    check-cast p1, Lzn2;

    .line 456
    .line 457
    sget-object p0, Ls32;->c:Ls32;

    .line 458
    .line 459
    sget-object v0, Lxn2;->a:[Lv41;

    .line 460
    .line 461
    sget-object v0, Lvn2;->c:Lyn2;

    .line 462
    .line 463
    sget-object v1, Lxn2;->a:[Lv41;

    .line 464
    .line 465
    aget-object v1, v1, v6

    .line 466
    .line 467
    invoke-interface {p1, v0, p0}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    return-object v9

    .line 471
    :pswitch_e
    check-cast p1, Lp51;

    .line 472
    .line 473
    const/16 p0, 0x1770

    .line 474
    .line 475
    iput p0, p1, Lp51;->a:I

    .line 476
    .line 477
    const/high16 v0, 0x42b40000    # 90.0f

    .line 478
    .line 479
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    const/16 v1, 0x12c

    .line 484
    .line 485
    invoke-virtual {p1, v0, v1}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    sget-object v2, Lmi1;->a:Ls30;

    .line 490
    .line 491
    iput-object v2, v1, Lo51;->b:Lgd0;

    .line 492
    .line 493
    const/16 v1, 0x5dc

    .line 494
    .line 495
    invoke-virtual {p1, v0, v1}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x43340000    # 180.0f

    .line 499
    .line 500
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    const/16 v1, 0x708

    .line 505
    .line 506
    invoke-virtual {p1, v0, v1}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 507
    .line 508
    .line 509
    const/16 v1, 0xbb8

    .line 510
    .line 511
    invoke-virtual {p1, v0, v1}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x43870000    # 270.0f

    .line 515
    .line 516
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    const/16 v1, 0xce4

    .line 521
    .line 522
    invoke-virtual {p1, v0, v1}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 523
    .line 524
    .line 525
    const/16 v1, 0x1194

    .line 526
    .line 527
    invoke-virtual {p1, v0, v1}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 528
    .line 529
    .line 530
    const/high16 v0, 0x43b40000    # 360.0f

    .line 531
    .line 532
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    const/16 v1, 0x12c0

    .line 537
    .line 538
    invoke-virtual {p1, v0, v1}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 539
    .line 540
    .line 541
    invoke-virtual {p1, v0, p0}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 542
    .line 543
    .line 544
    return-object v9

    .line 545
    :pswitch_f
    check-cast p1, Landroid/content/Context;

    .line 546
    .line 547
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 548
    .line 549
    .line 550
    move-result-object p0

    .line 551
    new-instance v0, Landroid/content/Intent;

    .line 552
    .line 553
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 554
    .line 555
    .line 556
    const-string v1, "android.intent.action.PROCESS_TEXT"

    .line 557
    .line 558
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    const-string v1, "text/plain"

    .line 563
    .line 564
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-virtual {p0, v0, v8}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    new-instance v0, Ljava/util/ArrayList;

    .line 573
    .line 574
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 575
    .line 576
    .line 577
    move-result v1

    .line 578
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 579
    .line 580
    .line 581
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    :goto_7
    if-ge v8, v1, :cond_12

    .line 586
    .line 587
    invoke-interface {p0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    move-object v3, v2

    .line 592
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 593
    .line 594
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    iget-object v5, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 599
    .line 600
    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 601
    .line 602
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v4

    .line 606
    if-nez v4, :cond_10

    .line 607
    .line 608
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 609
    .line 610
    iget-boolean v4, v3, Landroid/content/pm/ActivityInfo;->exported:Z

    .line 611
    .line 612
    if-eqz v4, :cond_11

    .line 613
    .line 614
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->permission:Ljava/lang/String;

    .line 615
    .line 616
    if-eqz v3, :cond_10

    .line 617
    .line 618
    invoke-virtual {p1, v3}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    if-nez v3, :cond_11

    .line 623
    .line 624
    :cond_10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    :cond_11
    add-int/lit8 v8, v8, 0x1

    .line 628
    .line 629
    goto :goto_7

    .line 630
    :cond_12
    return-object v0

    .line 631
    :pswitch_10
    check-cast p1, Ljg3;

    .line 632
    .line 633
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object p0

    .line 640
    aget-object p0, p0, v8

    .line 641
    .line 642
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    check-cast p0, Landroid/view/View;

    .line 646
    .line 647
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 648
    .line 649
    .line 650
    move-result p0

    .line 651
    if-ne p0, v4, :cond_15

    .line 652
    .line 653
    sget-object p0, Lup0;->k:Landroid/app/Activity;

    .line 654
    .line 655
    const-string p1, "hostAct"

    .line 656
    .line 657
    if-eqz p0, :cond_14

    .line 658
    .line 659
    new-instance v0, Landroid/content/Intent;

    .line 660
    .line 661
    sget-object v1, Lup0;->k:Landroid/app/Activity;

    .line 662
    .line 663
    if-eqz v1, :cond_13

    .line 664
    .line 665
    const-class p1, Lnuke/ui/HomeActivity;

    .line 666
    .line 667
    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 671
    .line 672
    .line 673
    goto :goto_8

    .line 674
    :cond_13
    invoke-static {p1}, Lt11;->S(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    throw v7

    .line 678
    :cond_14
    invoke-static {p1}, Lt11;->S(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    throw v7

    .line 682
    :cond_15
    :goto_8
    return-object v9

    .line 683
    :pswitch_11
    check-cast p1, Ljg3;

    .line 684
    .line 685
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object p0

    .line 692
    aget-object p0, p0, v6

    .line 693
    .line 694
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    check-cast p0, Ljava/util/List;

    .line 698
    .line 699
    const-string p1, "com.tencent.widget.PopupMenuDialog$MenuItem"

    .line 700
    .line 701
    invoke-static {p1}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    const-string v1, "QQ enhancement"

    .line 710
    .line 711
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    const-string v3, "Nuke"

    .line 716
    .line 717
    filled-new-array {v0, v3, v1, v2}, [Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-static {p1, v0}, Ldt;->c(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object p1

    .line 725
    invoke-interface {p0, v8, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    return-object v9

    .line 729
    :pswitch_12
    check-cast p1, Lcj0;

    .line 730
    .line 731
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    filled-new-array {v2}, [Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object p0

    .line 738
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 739
    .line 740
    .line 741
    move-result-object p0

    .line 742
    iput-object p0, p1, Lcj0;->t:Ljava/util/List;

    .line 743
    .line 744
    new-instance p0, Lat;

    .line 745
    .line 746
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 747
    .line 748
    .line 749
    const-string v0, "goto native hk offlinepay"

    .line 750
    .line 751
    filled-new-array {v0}, [Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    iput-object p0, p1, Lcj0;->u:Lat;

    .line 759
    .line 760
    return-object v9

    .line 761
    :pswitch_13
    check-cast p1, Lcj0;

    .line 762
    .line 763
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    filled-new-array {v2}, [Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object p0

    .line 770
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 771
    .line 772
    .line 773
    move-result-object p0

    .line 774
    iput-object p0, p1, Lcj0;->t:Ljava/util/List;

    .line 775
    .line 776
    new-instance p0, Lat;

    .line 777
    .line 778
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 779
    .line 780
    .line 781
    const-string v0, "compatCallBack"

    .line 782
    .line 783
    const-string v1, "com/tencent/mm/ui/PlusSubMenuHelper"

    .line 784
    .line 785
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    iput-object p0, p1, Lcj0;->u:Lat;

    .line 793
    .line 794
    return-object v9

    .line 795
    :pswitch_14
    check-cast p1, Ljg3;

    .line 796
    .line 797
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    iget-object p0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 801
    .line 802
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 803
    .line 804
    if-nez p0, :cond_16

    .line 805
    .line 806
    goto/16 :goto_c

    .line 807
    .line 808
    :cond_16
    sget-object p1, Lld3;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 809
    .line 810
    invoke-static {p1}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 811
    .line 812
    .line 813
    move-result-object p1

    .line 814
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 815
    .line 816
    .line 817
    move-result v2

    .line 818
    if-eqz v2, :cond_17

    .line 819
    .line 820
    goto/16 :goto_c

    .line 821
    .line 822
    :cond_17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    invoke-static {v2}, Lmg;->l0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    check-cast v2, Ljava/lang/reflect/Field;

    .line 838
    .line 839
    if-eqz v2, :cond_1f

    .line 840
    .line 841
    invoke-static {v2}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object p0

    .line 848
    if-eqz p0, :cond_1f

    .line 849
    .line 850
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 851
    .line 852
    .line 853
    move-result-object p0

    .line 854
    invoke-virtual {p0}, Ln4;->r()Lhi0;

    .line 855
    .line 856
    .line 857
    move-result-object p0

    .line 858
    iput-object v1, p0, Lhi0;->g:Ljava/lang/Class;

    .line 859
    .line 860
    invoke-virtual {p0}, Lhi0;->c()Ljava/util/List;

    .line 861
    .line 862
    .line 863
    move-result-object p0

    .line 864
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object p0

    .line 868
    check-cast p0, Lpi0;

    .line 869
    .line 870
    invoke-virtual {p0}, Lpi0;->g0()Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object p0

    .line 874
    instance-of v1, p0, Landroid/util/SparseArray;

    .line 875
    .line 876
    if-eqz v1, :cond_18

    .line 877
    .line 878
    move-object v7, p0

    .line 879
    check-cast v7, Landroid/util/SparseArray;

    .line 880
    .line 881
    :cond_18
    if-nez v7, :cond_19

    .line 882
    .line 883
    goto/16 :goto_c

    .line 884
    .line 885
    :cond_19
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 886
    .line 887
    .line 888
    move-result p0

    .line 889
    if-nez p0, :cond_1a

    .line 890
    .line 891
    goto/16 :goto_c

    .line 892
    .line 893
    :cond_1a
    sget-object p0, Lf12;->d:Lf12;

    .line 894
    .line 895
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    new-instance p0, Ljava/util/HashSet;

    .line 899
    .line 900
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 904
    .line 905
    .line 906
    move-result v1

    .line 907
    move v2, v8

    .line 908
    :goto_9
    if-ge v2, v1, :cond_1d

    .line 909
    .line 910
    invoke-virtual {v7, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v4

    .line 914
    if-nez v4, :cond_1b

    .line 915
    .line 916
    goto :goto_a

    .line 917
    :cond_1b
    invoke-static {v4}, Lf12;->k(Ljava/lang/Object;)Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v4

    .line 921
    if-eqz v4, :cond_1c

    .line 922
    .line 923
    invoke-virtual {p0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 924
    .line 925
    .line 926
    :cond_1c
    :goto_a
    add-int/lit8 v2, v2, 0x1

    .line 927
    .line 928
    goto :goto_9

    .line 929
    :cond_1d
    invoke-virtual {v7, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 938
    .line 939
    .line 940
    move-result-object v2

    .line 941
    aget-object v2, v2, v8

    .line 942
    .line 943
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    aget-object v2, v2, v8

    .line 948
    .line 949
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 950
    .line 951
    .line 952
    move-result-object p1

    .line 953
    :cond_1e
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 954
    .line 955
    .line 956
    move-result v4

    .line 957
    if-eqz v4, :cond_1f

    .line 958
    .line 959
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v4

    .line 963
    check-cast v4, Lkd3;

    .line 964
    .line 965
    iget v5, v4, Lkd3;->a:I

    .line 966
    .line 967
    iget-object v4, v4, Lkd3;->b:Ljava/lang/String;

    .line 968
    .line 969
    invoke-virtual {p0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 970
    .line 971
    .line 972
    move-result v6

    .line 973
    if-nez v6, :cond_1e

    .line 974
    .line 975
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 979
    .line 980
    .line 981
    move-result-object v5

    .line 982
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 983
    .line 984
    .line 985
    move-result-object v6

    .line 986
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 987
    .line 988
    .line 989
    move-result-object v10

    .line 990
    filled-new-array {v5, v4, v0, v6, v10}, [Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v4

    .line 994
    invoke-static {v2, v4}, Ldt;->c(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    move-result-object v4

    .line 998
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v4

    .line 1002
    invoke-static {v1, v4}, Ldt;->c(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v4

    .line 1006
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 1007
    .line 1008
    .line 1009
    move-result v5

    .line 1010
    invoke-virtual {v7, v5, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 1011
    .line 1012
    .line 1013
    goto :goto_b

    .line 1014
    :cond_1f
    :goto_c
    return-object v9

    .line 1015
    :pswitch_15
    check-cast p1, Ljg3;

    .line 1016
    .line 1017
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    iget-object p0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 1021
    .line 1022
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1023
    .line 1024
    if-nez p0, :cond_20

    .line 1025
    .line 1026
    goto/16 :goto_f

    .line 1027
    .line 1028
    :cond_20
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object p1

    .line 1032
    invoke-static {v5, p1}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object p1

    .line 1036
    instance-of v0, p1, Ljava/lang/Integer;

    .line 1037
    .line 1038
    if-eqz v0, :cond_21

    .line 1039
    .line 1040
    check-cast p1, Ljava/lang/Integer;

    .line 1041
    .line 1042
    goto :goto_d

    .line 1043
    :cond_21
    move-object p1, v7

    .line 1044
    :goto_d
    if-eqz p1, :cond_28

    .line 1045
    .line 1046
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1047
    .line 1048
    .line 1049
    move-result p1

    .line 1050
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 1051
    .line 1052
    .line 1053
    move-result-object p0

    .line 1054
    invoke-virtual {p0}, Ln4;->r()Lhi0;

    .line 1055
    .line 1056
    .line 1057
    move-result-object p0

    .line 1058
    iput-object v1, p0, Lhi0;->g:Ljava/lang/Class;

    .line 1059
    .line 1060
    invoke-virtual {p0}, Lhi0;->c()Ljava/util/List;

    .line 1061
    .line 1062
    .line 1063
    move-result-object p0

    .line 1064
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object p0

    .line 1068
    check-cast p0, Lpi0;

    .line 1069
    .line 1070
    invoke-virtual {p0}, Lpi0;->g0()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object p0

    .line 1074
    instance-of v0, p0, Landroid/util/SparseArray;

    .line 1075
    .line 1076
    if-eqz v0, :cond_22

    .line 1077
    .line 1078
    check-cast p0, Landroid/util/SparseArray;

    .line 1079
    .line 1080
    goto :goto_e

    .line 1081
    :cond_22
    move-object p0, v7

    .line 1082
    :goto_e
    if-nez p0, :cond_23

    .line 1083
    .line 1084
    goto :goto_f

    .line 1085
    :cond_23
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1086
    .line 1087
    .line 1088
    move-result-object p0

    .line 1089
    if-nez p0, :cond_24

    .line 1090
    .line 1091
    goto :goto_f

    .line 1092
    :cond_24
    sget-object p1, Lf12;->d:Lf12;

    .line 1093
    .line 1094
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1095
    .line 1096
    .line 1097
    invoke-static {p0}, Lf12;->k(Ljava/lang/Object;)Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object p0

    .line 1101
    if-nez p0, :cond_25

    .line 1102
    .line 1103
    goto :goto_f

    .line 1104
    :cond_25
    sget-object p1, Lld3;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1105
    .line 1106
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 1107
    .line 1108
    .line 1109
    move-result-object p1

    .line 1110
    :cond_26
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1111
    .line 1112
    .line 1113
    move-result v0

    .line 1114
    if-eqz v0, :cond_27

    .line 1115
    .line 1116
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    move-object v1, v0

    .line 1121
    check-cast v1, Lkd3;

    .line 1122
    .line 1123
    iget-object v1, v1, Lkd3;->b:Ljava/lang/String;

    .line 1124
    .line 1125
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v1

    .line 1129
    if-eqz v1, :cond_26

    .line 1130
    .line 1131
    move-object v7, v0

    .line 1132
    :cond_27
    check-cast v7, Lkd3;

    .line 1133
    .line 1134
    if-eqz v7, :cond_28

    .line 1135
    .line 1136
    iget-object p0, v7, Lkd3;->c:Lxm0;

    .line 1137
    .line 1138
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    :cond_28
    :goto_f
    return-object v9

    .line 1142
    :pswitch_16
    check-cast p1, Ljg3;

    .line 1143
    .line 1144
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1145
    .line 1146
    .line 1147
    iget-object p0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 1148
    .line 1149
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1150
    .line 1151
    if-nez p0, :cond_29

    .line 1152
    .line 1153
    goto :goto_11

    .line 1154
    :cond_29
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 1155
    .line 1156
    .line 1157
    move-result-object p0

    .line 1158
    invoke-virtual {p0}, Ln4;->v()Lsg1;

    .line 1159
    .line 1160
    .line 1161
    move-result-object p0

    .line 1162
    const-class p1, Landroid/view/View;

    .line 1163
    .line 1164
    invoke-static {p1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v0

    .line 1168
    invoke-static {v0}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    if-nez v0, :cond_2a

    .line 1173
    .line 1174
    goto :goto_10

    .line 1175
    :cond_2a
    move-object p1, v0

    .line 1176
    :goto_10
    iput-object p1, p0, Lsg1;->C:Ljava/lang/Class;

    .line 1177
    .line 1178
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1179
    .line 1180
    .line 1181
    move-result-object p1

    .line 1182
    iput-object p1, p0, Lsg1;->l:Ljava/lang/Integer;

    .line 1183
    .line 1184
    invoke-virtual {p0}, Lsg1;->c()Ljava/util/List;

    .line 1185
    .line 1186
    .line 1187
    move-result-object p0

    .line 1188
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object p0

    .line 1192
    check-cast p0, Lzg1;

    .line 1193
    .line 1194
    new-array p1, v8, [Ljava/lang/Object;

    .line 1195
    .line 1196
    invoke-virtual {p0, p1}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object p0

    .line 1200
    instance-of p1, p0, Landroid/view/View;

    .line 1201
    .line 1202
    if-eqz p1, :cond_2b

    .line 1203
    .line 1204
    move-object v7, p0

    .line 1205
    check-cast v7, Landroid/view/View;

    .line 1206
    .line 1207
    :cond_2b
    if-nez v7, :cond_2c

    .line 1208
    .line 1209
    goto :goto_11

    .line 1210
    :cond_2c
    new-instance p0, Lc12;

    .line 1211
    .line 1212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v7, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1216
    .line 1217
    .line 1218
    :goto_11
    return-object v9

    .line 1219
    :pswitch_17
    check-cast p1, Lyy1;

    .line 1220
    .line 1221
    sget p0, Lp9;->a:I

    .line 1222
    .line 1223
    sget-object p0, Lr7;->b:Ltu2;

    .line 1224
    .line 1225
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1226
    .line 1227
    .line 1228
    invoke-static {p1, p0}, Lop0;->w(Lyy1;Le42;)Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    move-result-object p0

    .line 1232
    move-object v1, p0

    .line 1233
    check-cast v1, Landroid/content/Context;

    .line 1234
    .line 1235
    sget-object p0, Lly;->h:Ltu2;

    .line 1236
    .line 1237
    invoke-static {p1, p0}, Lop0;->w(Lyy1;Le42;)Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object p0

    .line 1241
    move-object v2, p0

    .line 1242
    check-cast v2, Le70;

    .line 1243
    .line 1244
    sget-object p0, Lwv1;->a:Lmy;

    .line 1245
    .line 1246
    invoke-static {p1, p0}, Lop0;->w(Lyy1;Le42;)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object p0

    .line 1250
    check-cast p0, Lvv1;

    .line 1251
    .line 1252
    if-nez p0, :cond_2d

    .line 1253
    .line 1254
    goto :goto_12

    .line 1255
    :cond_2d
    new-instance v0, Lt8;

    .line 1256
    .line 1257
    iget-wide v3, p0, Lvv1;->a:J

    .line 1258
    .line 1259
    iget-object v5, p0, Lvv1;->b:Ljw1;

    .line 1260
    .line 1261
    invoke-direct/range {v0 .. v5}, Lt8;-><init>(Landroid/content/Context;Le70;JLjw1;)V

    .line 1262
    .line 1263
    .line 1264
    move-object v7, v0

    .line 1265
    :goto_12
    return-object v7

    .line 1266
    :pswitch_18
    check-cast p1, Lzf2;

    .line 1267
    .line 1268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1269
    .line 1270
    .line 1271
    iget-object p0, p1, Lzf2;->c:Ljava/lang/String;

    .line 1272
    .line 1273
    return-object p0

    .line 1274
    :pswitch_19
    check-cast p1, Lzf2;

    .line 1275
    .line 1276
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1277
    .line 1278
    .line 1279
    iget-object p0, p1, Lzf2;->c:Ljava/lang/String;

    .line 1280
    .line 1281
    return-object p0

    .line 1282
    :pswitch_1a
    check-cast p1, Lff2;

    .line 1283
    .line 1284
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    iget-object p0, p1, Lff2;->a:Lef2;

    .line 1288
    .line 1289
    iget-object p0, p0, Lef2;->h:Ljava/lang/String;

    .line 1290
    .line 1291
    iget-object p1, p1, Lff2;->b:Ljava/lang/String;

    .line 1292
    .line 1293
    if-nez p1, :cond_2e

    .line 1294
    .line 1295
    goto :goto_13

    .line 1296
    :cond_2e
    move-object v0, p1

    .line 1297
    :goto_13
    new-instance p1, Ljava/lang/StringBuilder;

    .line 1298
    .line 1299
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1303
    .line 1304
    .line 1305
    const-string p0, "="

    .line 1306
    .line 1307
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1314
    .line 1315
    .line 1316
    move-result-object p0

    .line 1317
    return-object p0

    .line 1318
    :pswitch_1b
    check-cast p1, Ld31;

    .line 1319
    .line 1320
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1321
    .line 1322
    .line 1323
    iput-boolean v8, p1, Ld31;->c:Z

    .line 1324
    .line 1325
    return-object v9

    .line 1326
    :pswitch_1c
    check-cast p1, Lki2;

    .line 1327
    .line 1328
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    iget-object p0, p1, Lki2;->a:Ljava/lang/String;

    .line 1332
    .line 1333
    const-string v0, "text"

    .line 1334
    .line 1335
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1336
    .line 1337
    .line 1338
    move-result v1

    .line 1339
    const/16 v2, 0x8

    .line 1340
    .line 1341
    if-eqz v1, :cond_31

    .line 1342
    .line 1343
    iget-object p0, p1, Lki2;->b:Ld41;

    .line 1344
    .line 1345
    invoke-virtual {p0, v0}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object p0

    .line 1349
    instance-of p1, p0, Li41;

    .line 1350
    .line 1351
    if-eqz p1, :cond_2f

    .line 1352
    .line 1353
    move-object v7, p0

    .line 1354
    check-cast v7, Li41;

    .line 1355
    .line 1356
    :cond_2f
    if-eqz v7, :cond_30

    .line 1357
    .line 1358
    invoke-virtual {v7}, Li41;->b()Z

    .line 1359
    .line 1360
    .line 1361
    move-result p0

    .line 1362
    if-eqz p0, :cond_30

    .line 1363
    .line 1364
    invoke-virtual {v7}, Li41;->a()Ljava/lang/String;

    .line 1365
    .line 1366
    .line 1367
    move-result-object p0

    .line 1368
    return-object p0

    .line 1369
    :cond_30
    new-instance p0, Lfi2;

    .line 1370
    .line 1371
    const-string p1, "INVALID_ARGUMENT"

    .line 1372
    .line 1373
    const-string v0, "Text segments must contain a string text field."

    .line 1374
    .line 1375
    invoke-direct {p0, p1, v0, v2, v8}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 1376
    .line 1377
    .line 1378
    throw p0

    .line 1379
    :cond_31
    const-string p1, "The \'"

    .line 1380
    .line 1381
    const-string v0, "\' message segment is not supported by WeChat yet."

    .line 1382
    .line 1383
    invoke-static {p1, p0, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1384
    .line 1385
    .line 1386
    move-result-object p0

    .line 1387
    new-instance p1, Lfi2;

    .line 1388
    .line 1389
    const-string v0, "NOT_SUPPORTED"

    .line 1390
    .line 1391
    invoke-direct {p1, v0, p0, v2, v8}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 1392
    .line 1393
    .line 1394
    throw p1

    .line 1395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
