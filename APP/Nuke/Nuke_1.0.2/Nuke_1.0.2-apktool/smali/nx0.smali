.class public final synthetic Lnx0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lnx0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILx81;)V
    .locals 0

    .line 1
    const/16 p1, 0xd

    .line 2
    .line 3
    iput p1, p0, Lnx0;->h:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget p0, p0, Lnx0;->h:I

    .line 2
    .line 3
    const/16 v0, 0x2d

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x3a

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    sget-object v5, La83;->a:La83;

    .line 11
    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljg3;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 21
    .line 22
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast p0, Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    aget-object v0, v0, v4

    .line 34
    .line 35
    instance-of v2, v0, Ljava/lang/CharSequence;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    move-object v1, v0

    .line 40
    check-cast v1, Ljava/lang/CharSequence;

    .line 41
    .line 42
    :cond_0
    if-nez v1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    sget-object v0, Ldi1;->d:Ldi1;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-string v0, "\u4e2a\u670b\u53cb"

    .line 51
    .line 52
    invoke-static {v1, v0, v4}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    sget-object v0, Ldi1;->j:Lo72;

    .line 59
    .line 60
    iget-object v2, v0, Lo72;->i:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Ljava/util/regex/Pattern;

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-static {}, Ltp0;->y()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v3, "com.tencent.mm.ui.contact"

    .line 79
    .line 80
    invoke-static {v2, v3, v4}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_4

    .line 85
    .line 86
    invoke-static {}, Ldi1;->q()Lci1;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iget v2, v2, Lci1;->a:I

    .line 91
    .line 92
    const/4 v3, -0x1

    .line 93
    if-ne v2, v3, :cond_2

    .line 94
    .line 95
    const/16 p1, 0x8

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-gez v2, :cond_3

    .line 113
    .line 114
    move v2, v4

    .line 115
    :cond_3
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v0, v0, Lo72;->i:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Ljava/util/regex/Pattern;

    .line 128
    .line 129
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    aput-object p1, p0, v4

    .line 141
    .line 142
    :cond_4
    :goto_0
    return-object v5

    .line 143
    :pswitch_0
    check-cast p1, Lcj0;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    const-string p0, "com.tencent.mm.plugin.messenger.foundation"

    .line 149
    .line 150
    filled-new-array {p0}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    iput-object p0, p1, Lcj0;->t:Ljava/util/List;

    .line 159
    .line 160
    new-instance p0, Lnx0;

    .line 161
    .line 162
    const/16 v0, 0x1b

    .line 163
    .line 164
    invoke-direct {p0, v0}, Lnx0;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p0}, Lcj0;->c0(Lin0;)V

    .line 168
    .line 169
    .line 170
    return-object v5

    .line 171
    :pswitch_1
    check-cast p1, Lat;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance p0, Lyg1;

    .line 177
    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v0, "onCreate"

    .line 182
    .line 183
    invoke-virtual {p0, v0}, Lyg1;->g0(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p1, Lat;->v:Lah1;

    .line 187
    .line 188
    if-nez v0, :cond_5

    .line 189
    .line 190
    new-instance v0, Lah1;

    .line 191
    .line 192
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 193
    .line 194
    .line 195
    :cond_5
    iput-object v0, p1, Lat;->v:Lah1;

    .line 196
    .line 197
    iget-object v1, v0, Lah1;->t:Ljava/util/List;

    .line 198
    .line 199
    if-nez v1, :cond_6

    .line 200
    .line 201
    new-instance v1, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 204
    .line 205
    .line 206
    :cond_6
    iput-object v1, v0, Lah1;->t:Ljava/util/List;

    .line 207
    .line 208
    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    new-instance p0, Lyg1;

    .line 212
    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    .line 215
    .line 216
    const-string v0, "onAccountReleased"

    .line 217
    .line 218
    invoke-virtual {p0, v0}, Lyg1;->g0(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    iget-object v0, p1, Lat;->v:Lah1;

    .line 222
    .line 223
    if-nez v0, :cond_7

    .line 224
    .line 225
    new-instance v0, Lah1;

    .line 226
    .line 227
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 228
    .line 229
    .line 230
    :cond_7
    iput-object v0, p1, Lat;->v:Lah1;

    .line 231
    .line 232
    iget-object p1, v0, Lah1;->t:Ljava/util/List;

    .line 233
    .line 234
    if-nez p1, :cond_8

    .line 235
    .line 236
    new-instance p1, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    :cond_8
    iput-object p1, v0, Lah1;->t:Ljava/util/List;

    .line 242
    .line 243
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    return-object v5

    .line 247
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Member;

    .line 248
    .line 249
    new-instance p0, Lwf1;

    .line 250
    .line 251
    invoke-direct {p0, p1}, Lwf1;-><init>(Ljava/lang/reflect/Member;)V

    .line 252
    .line 253
    .line 254
    return-object p0

    .line 255
    :pswitch_3
    check-cast p1, Lwf1;

    .line 256
    .line 257
    invoke-virtual {p1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    return-object p0

    .line 265
    :pswitch_4
    check-cast p1, Ljava/lang/Long;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    return-object v5

    .line 271
    :pswitch_5
    check-cast p1, Ldj0;

    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    new-instance p0, Lyg1;

    .line 277
    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    new-instance v0, Lnx0;

    .line 282
    .line 283
    const/16 v1, 0x16

    .line 284
    .line 285
    invoke-direct {v0, v1}, Lnx0;-><init>(I)V

    .line 286
    .line 287
    .line 288
    new-instance v1, Lat;

    .line 289
    .line 290
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-interface {v0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    iput-object v1, p0, Lyg1;->v:Lat;

    .line 297
    .line 298
    const/16 v0, 0x9

    .line 299
    .line 300
    invoke-static {p0, v0}, Lyg1;->c0(Lyg1;I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0, v4}, Lyg1;->d0(I)V

    .line 304
    .line 305
    .line 306
    const-string v0, "mCoreStorage not initialized!"

    .line 307
    .line 308
    filled-new-array {v0}, [Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 316
    .line 317
    return-object v5

    .line 318
    :pswitch_6
    check-cast p1, Lat;

    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    const-string p0, "MicroMsg.MMKernel"

    .line 324
    .line 325
    const-string v0, "Kernel not null, has initialized."

    .line 326
    .line 327
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    invoke-virtual {p1, p0}, Lat;->d0([Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    return-object v5

    .line 335
    :pswitch_7
    check-cast p1, Lcj0;

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance p0, Lat;

    .line 341
    .line 342
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 343
    .line 344
    .line 345
    const-string v0, "mCoreAccount not initialized!"

    .line 346
    .line 347
    filled-new-array {v0}, [Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    iput-object p0, p1, Lcj0;->u:Lat;

    .line 355
    .line 356
    return-object v5

    .line 357
    :pswitch_8
    check-cast p1, Ldj0;

    .line 358
    .line 359
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    const-string p0, "com.tencent.mm.plugin.luckymoney.model"

    .line 363
    .line 364
    filled-new-array {p0}, [Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 373
    .line 374
    new-instance p0, Lyg1;

    .line 375
    .line 376
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 377
    .line 378
    .line 379
    const-string v0, "MicroMsg.LuckyMoneyUtil"

    .line 380
    .line 381
    const-string v1, "exception:%s"

    .line 382
    .line 383
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 391
    .line 392
    return-object v5

    .line 393
    :pswitch_9
    check-cast p1, Lib1;

    .line 394
    .line 395
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    new-instance p0, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    iget-object v0, p1, Lib1;->n:Lbt;

    .line 404
    .line 405
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    const/16 v0, 0x3d

    .line 409
    .line 410
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    iget-object p1, p1, Lib1;->o:Ljava/lang/Object;

    .line 414
    .line 415
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    return-object p0

    .line 423
    :pswitch_a
    check-cast p1, Lib1;

    .line 424
    .line 425
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    iget-object p0, p1, Lib1;->p:Lp40;

    .line 429
    .line 430
    instance-of p1, p0, Lib1;

    .line 431
    .line 432
    if-eqz p1, :cond_9

    .line 433
    .line 434
    move-object v1, p0

    .line 435
    check-cast v1, Lib1;

    .line 436
    .line 437
    :cond_9
    return-object v1

    .line 438
    :pswitch_b
    check-cast p1, Lwx0;

    .line 439
    .line 440
    return-object v5

    .line 441
    :pswitch_c
    check-cast p1, Ljava/util/List;

    .line 442
    .line 443
    return-object v5

    .line 444
    :pswitch_d
    check-cast p1, Lk03;

    .line 445
    .line 446
    return-object v5

    .line 447
    :pswitch_e
    check-cast p1, Ldj0;

    .line 448
    .line 449
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    const-string p0, "com.tencent.mm.ui.base.preference"

    .line 453
    .line 454
    filled-new-array {p0}, [Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 463
    .line 464
    new-instance p0, Lyg1;

    .line 465
    .line 466
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 467
    .line 468
    .line 469
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    new-array v1, v3, [Ljava/lang/Number;

    .line 474
    .line 475
    aput-object v0, v1, v4

    .line 476
    .line 477
    invoke-virtual {p0, v1}, Lyg1;->i0([Ljava/lang/Number;)V

    .line 478
    .line 479
    .line 480
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 481
    .line 482
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    invoke-virtual {p0, v0}, Lyg1;->f0(Ljava/lang/Class;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {p0, v3}, Lyg1;->d0(I)V

    .line 489
    .line 490
    .line 491
    const-class v0, Ljava/lang/CharSequence;

    .line 492
    .line 493
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {p0, v0}, Lyg1;->e0([Ljava/lang/Class;)V

    .line 498
    .line 499
    .line 500
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 501
    .line 502
    return-object v5

    .line 503
    :pswitch_f
    check-cast p1, Lp22;

    .line 504
    .line 505
    return-object v5

    .line 506
    :pswitch_10
    check-cast p1, Ljava/util/List;

    .line 507
    .line 508
    new-instance p0, Ld91;

    .line 509
    .line 510
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    check-cast v0, Ljava/lang/Number;

    .line 515
    .line 516
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object p1

    .line 524
    check-cast p1, Ljava/lang/Number;

    .line 525
    .line 526
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 527
    .line 528
    .line 529
    move-result p1

    .line 530
    invoke-direct {p0, v0, p1}, Ld91;-><init>(II)V

    .line 531
    .line 532
    .line 533
    return-object p0

    .line 534
    :pswitch_11
    check-cast p1, Ljava/lang/Integer;

    .line 535
    .line 536
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    return-object v1

    .line 540
    :pswitch_12
    check-cast p1, Ljava/util/Map$Entry;

    .line 541
    .line 542
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object p0

    .line 549
    check-cast p0, Ljava/lang/String;

    .line 550
    .line 551
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    check-cast p1, Lj31;

    .line 556
    .line 557
    new-instance v0, Ljava/lang/StringBuilder;

    .line 558
    .line 559
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 560
    .line 561
    .line 562
    invoke-static {v0, p0}, Lmv2;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    return-object p0

    .line 576
    :pswitch_13
    check-cast p1, Lct;

    .line 577
    .line 578
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    new-instance p0, Ldy;

    .line 582
    .line 583
    const/16 v0, 0x1c

    .line 584
    .line 585
    invoke-direct {p0, v0}, Ldy;-><init>(I)V

    .line 586
    .line 587
    .line 588
    new-instance v0, Lp31;

    .line 589
    .line 590
    invoke-direct {v0, p0}, Lp31;-><init>(Lxm0;)V

    .line 591
    .line 592
    .line 593
    const-string p0, "JsonPrimitive"

    .line 594
    .line 595
    invoke-static {p1, p0, v0}, Lct;->a(Lct;Ljava/lang/String;Lp31;)V

    .line 596
    .line 597
    .line 598
    new-instance p0, Ldy;

    .line 599
    .line 600
    const/16 v0, 0x1d

    .line 601
    .line 602
    invoke-direct {p0, v0}, Ldy;-><init>(I)V

    .line 603
    .line 604
    .line 605
    new-instance v0, Lp31;

    .line 606
    .line 607
    invoke-direct {v0, p0}, Lp31;-><init>(Lxm0;)V

    .line 608
    .line 609
    .line 610
    const-string p0, "JsonNull"

    .line 611
    .line 612
    invoke-static {p1, p0, v0}, Lct;->a(Lct;Ljava/lang/String;Lp31;)V

    .line 613
    .line 614
    .line 615
    new-instance p0, Ln31;

    .line 616
    .line 617
    invoke-direct {p0, v4}, Ln31;-><init>(I)V

    .line 618
    .line 619
    .line 620
    new-instance v0, Lp31;

    .line 621
    .line 622
    invoke-direct {v0, p0}, Lp31;-><init>(Lxm0;)V

    .line 623
    .line 624
    .line 625
    const-string p0, "JsonLiteral"

    .line 626
    .line 627
    invoke-static {p1, p0, v0}, Lct;->a(Lct;Ljava/lang/String;Lp31;)V

    .line 628
    .line 629
    .line 630
    new-instance p0, Ln31;

    .line 631
    .line 632
    invoke-direct {p0, v3}, Ln31;-><init>(I)V

    .line 633
    .line 634
    .line 635
    new-instance v0, Lp31;

    .line 636
    .line 637
    invoke-direct {v0, p0}, Lp31;-><init>(Lxm0;)V

    .line 638
    .line 639
    .line 640
    const-string p0, "JsonObject"

    .line 641
    .line 642
    invoke-static {p1, p0, v0}, Lct;->a(Lct;Ljava/lang/String;Lp31;)V

    .line 643
    .line 644
    .line 645
    new-instance p0, Ln31;

    .line 646
    .line 647
    const/4 v0, 0x2

    .line 648
    invoke-direct {p0, v0}, Ln31;-><init>(I)V

    .line 649
    .line 650
    .line 651
    new-instance v0, Lp31;

    .line 652
    .line 653
    invoke-direct {v0, p0}, Lp31;-><init>(Lxm0;)V

    .line 654
    .line 655
    .line 656
    const-string p0, "JsonArray"

    .line 657
    .line 658
    invoke-static {p1, p0, v0}, Lct;->a(Lct;Ljava/lang/String;Lp31;)V

    .line 659
    .line 660
    .line 661
    return-object v5

    .line 662
    :pswitch_14
    check-cast p1, Ljava/lang/Character;

    .line 663
    .line 664
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 665
    .line 666
    .line 667
    move-result p0

    .line 668
    const/16 p1, 0x30

    .line 669
    .line 670
    if-gt p1, p0, :cond_a

    .line 671
    .line 672
    if-ge p0, v2, :cond_a

    .line 673
    .line 674
    goto :goto_1

    .line 675
    :cond_a
    move v3, v4

    .line 676
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 677
    .line 678
    .line 679
    move-result-object p0

    .line 680
    return-object p0

    .line 681
    :pswitch_15
    check-cast p1, Ljava/lang/Character;

    .line 682
    .line 683
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 684
    .line 685
    .line 686
    move-result p0

    .line 687
    if-ne p0, v2, :cond_b

    .line 688
    .line 689
    goto :goto_2

    .line 690
    :cond_b
    move v3, v4

    .line 691
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 692
    .line 693
    .line 694
    move-result-object p0

    .line 695
    return-object p0

    .line 696
    :pswitch_16
    check-cast p1, Ljava/lang/Character;

    .line 697
    .line 698
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 699
    .line 700
    .line 701
    move-result p0

    .line 702
    if-ne p0, v2, :cond_c

    .line 703
    .line 704
    goto :goto_3

    .line 705
    :cond_c
    move v3, v4

    .line 706
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 707
    .line 708
    .line 709
    move-result-object p0

    .line 710
    return-object p0

    .line 711
    :pswitch_17
    check-cast p1, Ljava/lang/Character;

    .line 712
    .line 713
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 714
    .line 715
    .line 716
    move-result p0

    .line 717
    const/16 p1, 0x54

    .line 718
    .line 719
    if-eq p0, p1, :cond_e

    .line 720
    .line 721
    const/16 p1, 0x74

    .line 722
    .line 723
    if-ne p0, p1, :cond_d

    .line 724
    .line 725
    goto :goto_4

    .line 726
    :cond_d
    move v3, v4

    .line 727
    :cond_e
    :goto_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 728
    .line 729
    .line 730
    move-result-object p0

    .line 731
    return-object p0

    .line 732
    :pswitch_18
    check-cast p1, Ljava/lang/Character;

    .line 733
    .line 734
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 735
    .line 736
    .line 737
    move-result p0

    .line 738
    if-ne p0, v0, :cond_f

    .line 739
    .line 740
    goto :goto_5

    .line 741
    :cond_f
    move v3, v4

    .line 742
    :goto_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 743
    .line 744
    .line 745
    move-result-object p0

    .line 746
    return-object p0

    .line 747
    :pswitch_19
    check-cast p1, Ljava/lang/Character;

    .line 748
    .line 749
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 750
    .line 751
    .line 752
    move-result p0

    .line 753
    if-ne p0, v0, :cond_10

    .line 754
    .line 755
    goto :goto_6

    .line 756
    :cond_10
    move v3, v4

    .line 757
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 758
    .line 759
    .line 760
    move-result-object p0

    .line 761
    return-object p0

    .line 762
    :pswitch_1a
    check-cast p1, Ljg3;

    .line 763
    .line 764
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    iget-object p0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 768
    .line 769
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 770
    .line 771
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    check-cast p0, Landroid/app/Activity;

    .line 775
    .line 776
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 777
    .line 778
    .line 779
    move-result-object p0

    .line 780
    const-string p1, "max_limit_num"

    .line 781
    .line 782
    const/16 v0, 0x3e7

    .line 783
    .line 784
    invoke-virtual {p0, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 785
    .line 786
    .line 787
    return-object v5

    .line 788
    :pswitch_1b
    check-cast p1, Ldj0;

    .line 789
    .line 790
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    new-instance p0, Lnx0;

    .line 794
    .line 795
    invoke-direct {p0, v4}, Lnx0;-><init>(I)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {p1, p0}, Ldj0;->c0(Lin0;)V

    .line 799
    .line 800
    .line 801
    return-object v5

    .line 802
    :pswitch_1c
    check-cast p1, Lyg1;

    .line 803
    .line 804
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    const/16 p0, 0x19

    .line 808
    .line 809
    invoke-static {p1, p0}, Lyg1;->c0(Lyg1;I)V

    .line 810
    .line 811
    .line 812
    iget-object p0, p1, Lyg1;->x:Lix1;

    .line 813
    .line 814
    if-nez p0, :cond_11

    .line 815
    .line 816
    new-instance p0, Lix1;

    .line 817
    .line 818
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 819
    .line 820
    .line 821
    iput-object p0, p1, Lyg1;->x:Lix1;

    .line 822
    .line 823
    :cond_11
    iget-object p0, p1, Lyg1;->x:Lix1;

    .line 824
    .line 825
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    new-instance v0, Lp3;

    .line 829
    .line 830
    invoke-direct {v0, v3}, Lp3;-><init>(I)V

    .line 831
    .line 832
    .line 833
    const/4 v1, 0x4

    .line 834
    iput v1, v0, Lp3;->u:I

    .line 835
    .line 836
    const/4 v1, 0x5

    .line 837
    iput v1, v0, Lp3;->v:I

    .line 838
    .line 839
    iput-object v0, p0, Lix1;->u:Lp3;

    .line 840
    .line 841
    const-string p0, "send_mid_size"

    .line 842
    .line 843
    const-string v0, "send_hevc_mid_size"

    .line 844
    .line 845
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object p0

    .line 849
    invoke-virtual {p1, p0}, Lyg1;->h0([Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    return-object v5

    .line 853
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
