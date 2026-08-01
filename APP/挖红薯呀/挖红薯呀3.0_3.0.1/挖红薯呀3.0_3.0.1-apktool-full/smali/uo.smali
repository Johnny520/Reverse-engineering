.class public final Luo;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Liu;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 13
    iput p1, p0, Luo;->d:I

    iput-object p2, p0, Luo;->f:Ljava/lang/Object;

    iput-object p3, p0, Luo;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 12
    iput p1, p0, Luo;->d:I

    iput-object p2, p0, Luo;->e:Ljava/lang/Object;

    iput-object p3, p0, Luo;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lvo;Lzt0;Liu;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Luo;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Luo;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Luo;->f:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Lik;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Luo;->d:I

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    sget-object v2, Lzk;->d:Lzk;

    .line 6
    .line 7
    const/high16 v3, -0x80000000

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object v5, p0, Luo;->e:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    sget-object v7, Lna1;->a:Lna1;

    .line 14
    .line 15
    iget-object v8, p0, Luo;->f:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p1, Lf30;

    .line 21
    .line 22
    check-cast v5, Lxt0;

    .line 23
    .line 24
    instance-of p0, p1, Ljs0;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    iget p0, v5, Lxt0;->d:I

    .line 29
    .line 30
    add-int/2addr p0, v6

    .line 31
    iput p0, v5, Lxt0;->d:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of p0, p1, Lks0;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    iget p0, v5, Lxt0;->d:I

    .line 39
    .line 40
    add-int/lit8 p0, p0, -0x1

    .line 41
    .line 42
    iput p0, v5, Lxt0;->d:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    instance-of p0, p1, Lis0;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    iget p0, v5, Lxt0;->d:I

    .line 50
    .line 51
    add-int/lit8 p0, p0, -0x1

    .line 52
    .line 53
    iput p0, v5, Lxt0;->d:I

    .line 54
    .line 55
    :cond_2
    :goto_0
    iget p0, v5, Lxt0;->d:I

    .line 56
    .line 57
    if-lez p0, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    const/4 v6, 0x0

    .line 61
    :goto_1
    check-cast v8, Li81;

    .line 62
    .line 63
    iget-boolean p0, v8, Li81;->u:Z

    .line 64
    .line 65
    if-eq p0, v6, :cond_4

    .line 66
    .line 67
    iput-boolean v6, v8, Li81;->u:Z

    .line 68
    .line 69
    invoke-static {v8}, Lv50;->m(Lr50;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    return-object v7

    .line 73
    :pswitch_0
    check-cast p1, Lf30;

    .line 74
    .line 75
    instance-of p0, p1, Lls0;

    .line 76
    .line 77
    check-cast v5, Ll6;

    .line 78
    .line 79
    if-eqz p0, :cond_6

    .line 80
    .line 81
    iget-boolean p0, v5, Ll6;->z:Z

    .line 82
    .line 83
    if-eqz p0, :cond_5

    .line 84
    .line 85
    check-cast p1, Lls0;

    .line 86
    .line 87
    invoke-virtual {v5, p1}, Ll6;->w0(Lls0;)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_7

    .line 91
    .line 92
    :cond_5
    iget-object p0, v5, Ll6;->A:Ldh0;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ldh0;->a(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_7

    .line 98
    .line 99
    :cond_6
    check-cast v8, Lyk;

    .line 100
    .line 101
    iget-object p0, v5, Ll6;->w:Lfe;

    .line 102
    .line 103
    const/4 p2, 0x0

    .line 104
    if-nez p0, :cond_7

    .line 105
    .line 106
    new-instance p0, Lfe;

    .line 107
    .line 108
    iget-boolean v0, v5, Ll6;->s:Z

    .line 109
    .line 110
    iget-object v1, v5, Ll6;->v:Ltm;

    .line 111
    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-boolean v0, p0, Lfe;->a:Z

    .line 116
    .line 117
    iput-object v1, p0, Lfe;->b:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-static {p2}, Lkl;->b(F)Lb7;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iput-object v0, p0, Lfe;->c:Ljava/lang/Object;

    .line 124
    .line 125
    new-instance v0, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    iput-object v0, p0, Lfe;->d:Ljava/lang/Object;

    .line 131
    .line 132
    invoke-static {v5}, Lkl;->r(Ltq;)V

    .line 133
    .line 134
    .line 135
    iput-object p0, v5, Ll6;->w:Lfe;

    .line 136
    .line 137
    :cond_7
    iget-object v0, p0, Lfe;->d:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Ljava/util/ArrayList;

    .line 140
    .line 141
    instance-of v1, p1, Lgz;

    .line 142
    .line 143
    if-eqz v1, :cond_8

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_8
    instance-of v1, p1, Lhz;

    .line 150
    .line 151
    if-eqz v1, :cond_9

    .line 152
    .line 153
    check-cast p1, Lhz;

    .line 154
    .line 155
    iget-object p1, p1, Lhz;->a:Lgz;

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_9
    instance-of v1, p1, Lru;

    .line 162
    .line 163
    if-eqz v1, :cond_a

    .line 164
    .line 165
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_a
    instance-of v1, p1, Lsu;

    .line 170
    .line 171
    if-eqz v1, :cond_b

    .line 172
    .line 173
    check-cast p1, Lsu;

    .line 174
    .line 175
    iget-object p1, p1, Lsu;->a:Lru;

    .line 176
    .line 177
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_b
    instance-of v1, p1, Llq;

    .line 182
    .line 183
    if-eqz v1, :cond_c

    .line 184
    .line 185
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_c
    instance-of v1, p1, Lmq;

    .line 190
    .line 191
    if-eqz v1, :cond_d

    .line 192
    .line 193
    check-cast p1, Lmq;

    .line 194
    .line 195
    iget-object p1, p1, Lmq;->a:Llq;

    .line 196
    .line 197
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_d
    instance-of v1, p1, Lkq;

    .line 202
    .line 203
    if-eqz v1, :cond_18

    .line 204
    .line 205
    check-cast p1, Lkq;

    .line 206
    .line 207
    iget-object p1, p1, Lkq;->a:Llq;

    .line 208
    .line 209
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :goto_2
    invoke-static {v0}, Lye;->Q(Ljava/util/List;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    check-cast p1, Lf30;

    .line 217
    .line 218
    iget-object v0, p0, Lfe;->e:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Lf30;

    .line 221
    .line 222
    invoke-static {v0, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-nez v0, :cond_18

    .line 227
    .line 228
    const/4 v0, 0x3

    .line 229
    if-eqz p1, :cond_14

    .line 230
    .line 231
    iget-object v1, p0, Lfe;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v1, Ltm;

    .line 234
    .line 235
    invoke-virtual {v1}, Ltm;->invoke()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    instance-of v1, p1, Lgz;

    .line 239
    .line 240
    if-eqz v1, :cond_e

    .line 241
    .line 242
    const p2, 0x3da3d70a    # 0.08f

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_e
    instance-of v2, p1, Lru;

    .line 247
    .line 248
    if-eqz v2, :cond_f

    .line 249
    .line 250
    const p2, 0x3dcccccd    # 0.1f

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_f
    instance-of v2, p1, Llq;

    .line 255
    .line 256
    if-eqz v2, :cond_10

    .line 257
    .line 258
    const p2, 0x3e23d70a    # 0.16f

    .line 259
    .line 260
    .line 261
    :cond_10
    :goto_3
    sget-object v2, Lvv0;->a:Lp91;

    .line 262
    .line 263
    if-eqz v1, :cond_11

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_11
    instance-of v1, p1, Lru;

    .line 267
    .line 268
    const/16 v3, 0x2d

    .line 269
    .line 270
    if-eqz v1, :cond_12

    .line 271
    .line 272
    new-instance v2, Lp91;

    .line 273
    .line 274
    sget-object v1, Lcr;->b:Lxc;

    .line 275
    .line 276
    invoke-direct {v2, v3, v1}, Lp91;-><init>(ILbr;)V

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_12
    instance-of v1, p1, Llq;

    .line 281
    .line 282
    if-eqz v1, :cond_13

    .line 283
    .line 284
    new-instance v2, Lp91;

    .line 285
    .line 286
    sget-object v1, Lcr;->b:Lxc;

    .line 287
    .line 288
    invoke-direct {v2, v3, v1}, Lp91;-><init>(ILbr;)V

    .line 289
    .line 290
    .line 291
    :cond_13
    :goto_4
    new-instance v1, Lb41;

    .line 292
    .line 293
    invoke-direct {v1, p0, p2, v2, v4}, Lb41;-><init>(Lfe;FLv7;Lik;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v8, v4, v1, v0}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 297
    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_14
    iget-object p2, p0, Lfe;->e:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast p2, Lf30;

    .line 303
    .line 304
    sget-object v1, Lvv0;->a:Lp91;

    .line 305
    .line 306
    instance-of v2, p2, Lgz;

    .line 307
    .line 308
    if-eqz v2, :cond_15

    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_15
    instance-of v2, p2, Lru;

    .line 312
    .line 313
    if-eqz v2, :cond_16

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_16
    instance-of p2, p2, Llq;

    .line 317
    .line 318
    if-eqz p2, :cond_17

    .line 319
    .line 320
    new-instance v1, Lp91;

    .line 321
    .line 322
    const/16 p2, 0x96

    .line 323
    .line 324
    sget-object v2, Lcr;->b:Lxc;

    .line 325
    .line 326
    invoke-direct {v1, p2, v2}, Lp91;-><init>(ILbr;)V

    .line 327
    .line 328
    .line 329
    :cond_17
    :goto_5
    new-instance p2, Le;

    .line 330
    .line 331
    const/16 v2, 0xb

    .line 332
    .line 333
    invoke-direct {p2, p0, v1, v4, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 334
    .line 335
    .line 336
    invoke-static {v8, v4, p2, v0}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 337
    .line 338
    .line 339
    :goto_6
    iput-object p1, p0, Lfe;->e:Ljava/lang/Object;

    .line 340
    .line 341
    :cond_18
    :goto_7
    return-object v7

    .line 342
    :pswitch_1
    check-cast v5, Lld0;

    .line 343
    .line 344
    iget-object v0, v5, Lld0;->b:Ljava/util/LinkedHashMap;

    .line 345
    .line 346
    instance-of v9, p2, Lkd0;

    .line 347
    .line 348
    if-eqz v9, :cond_19

    .line 349
    .line 350
    move-object v9, p2

    .line 351
    check-cast v9, Lkd0;

    .line 352
    .line 353
    iget v10, v9, Lkd0;->h:I

    .line 354
    .line 355
    and-int v11, v10, v3

    .line 356
    .line 357
    if-eqz v11, :cond_19

    .line 358
    .line 359
    sub-int/2addr v10, v3

    .line 360
    iput v10, v9, Lkd0;->h:I

    .line 361
    .line 362
    goto :goto_8

    .line 363
    :cond_19
    new-instance v9, Lkd0;

    .line 364
    .line 365
    invoke-direct {v9, p0, p2}, Lkd0;-><init>(Luo;Lik;)V

    .line 366
    .line 367
    .line 368
    :goto_8
    iget-object p0, v9, Lkd0;->g:Ljava/lang/Object;

    .line 369
    .line 370
    iget p2, v9, Lkd0;->h:I

    .line 371
    .line 372
    if-eqz p2, :cond_1b

    .line 373
    .line 374
    if-ne p2, v6, :cond_1a

    .line 375
    .line 376
    invoke-static {p0}, Lw60;->M(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    goto :goto_a

    .line 380
    :cond_1a
    invoke-static {v1}, Lxc;->o(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    move-object v2, v4

    .line 384
    goto :goto_b

    .line 385
    :cond_1b
    invoke-static {p0}, Lw60;->M(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    check-cast v8, Liu;

    .line 389
    .line 390
    check-cast p1, Lf30;

    .line 391
    .line 392
    instance-of p0, p1, Ljs0;

    .line 393
    .line 394
    if-eqz p0, :cond_1c

    .line 395
    .line 396
    move-object p0, p1

    .line 397
    check-cast p0, Ljs0;

    .line 398
    .line 399
    new-instance p2, Ljs0;

    .line 400
    .line 401
    iget-wide v3, p0, Ljs0;->a:J

    .line 402
    .line 403
    iget-wide v10, v5, Lld0;->a:J

    .line 404
    .line 405
    invoke-static {v3, v4, v10, v11}, Lok0;->d(JJ)J

    .line 406
    .line 407
    .line 408
    move-result-wide v3

    .line 409
    invoke-direct {p2, v3, v4}, Ljs0;-><init>(J)V

    .line 410
    .line 411
    .line 412
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-object p1, p2

    .line 416
    goto :goto_9

    .line 417
    :cond_1c
    instance-of p0, p1, Lis0;

    .line 418
    .line 419
    if-eqz p0, :cond_1e

    .line 420
    .line 421
    check-cast p1, Lis0;

    .line 422
    .line 423
    iget-object p0, p1, Lis0;->a:Ljs0;

    .line 424
    .line 425
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    check-cast p0, Ljs0;

    .line 430
    .line 431
    if-nez p0, :cond_1d

    .line 432
    .line 433
    goto :goto_9

    .line 434
    :cond_1d
    new-instance p1, Lis0;

    .line 435
    .line 436
    invoke-direct {p1, p0}, Lis0;-><init>(Ljs0;)V

    .line 437
    .line 438
    .line 439
    goto :goto_9

    .line 440
    :cond_1e
    instance-of p0, p1, Lks0;

    .line 441
    .line 442
    if-eqz p0, :cond_20

    .line 443
    .line 444
    check-cast p1, Lks0;

    .line 445
    .line 446
    iget-object p0, p1, Lks0;->a:Ljs0;

    .line 447
    .line 448
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    check-cast p0, Ljs0;

    .line 453
    .line 454
    if-nez p0, :cond_1f

    .line 455
    .line 456
    goto :goto_9

    .line 457
    :cond_1f
    new-instance p1, Lks0;

    .line 458
    .line 459
    invoke-direct {p1, p0}, Lks0;-><init>(Ljs0;)V

    .line 460
    .line 461
    .line 462
    :cond_20
    :goto_9
    iput v6, v9, Lkd0;->h:I

    .line 463
    .line 464
    invoke-interface {v8, p1, v9}, Liu;->f(Ljava/lang/Object;Lik;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    if-ne p0, v2, :cond_21

    .line 469
    .line 470
    goto :goto_b

    .line 471
    :cond_21
    :goto_a
    move-object v2, v7

    .line 472
    :goto_b
    return-object v2

    .line 473
    :pswitch_2
    instance-of v0, p2, Lnu;

    .line 474
    .line 475
    if-eqz v0, :cond_22

    .line 476
    .line 477
    move-object v0, p2

    .line 478
    check-cast v0, Lnu;

    .line 479
    .line 480
    iget v5, v0, Lnu;->i:I

    .line 481
    .line 482
    and-int v9, v5, v3

    .line 483
    .line 484
    if-eqz v9, :cond_22

    .line 485
    .line 486
    sub-int/2addr v5, v3

    .line 487
    iput v5, v0, Lnu;->i:I

    .line 488
    .line 489
    goto :goto_c

    .line 490
    :cond_22
    new-instance v0, Lnu;

    .line 491
    .line 492
    invoke-direct {v0, p0, p2}, Lnu;-><init>(Luo;Lik;)V

    .line 493
    .line 494
    .line 495
    :goto_c
    iget-object p2, v0, Lnu;->h:Ljava/lang/Object;

    .line 496
    .line 497
    iget v3, v0, Lnu;->i:I

    .line 498
    .line 499
    if-eqz v3, :cond_24

    .line 500
    .line 501
    if-ne v3, v6, :cond_23

    .line 502
    .line 503
    iget-object p1, v0, Lnu;->k:Ljava/lang/Object;

    .line 504
    .line 505
    iget-object p0, v0, Lnu;->g:Luo;

    .line 506
    .line 507
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    goto :goto_d

    .line 511
    :cond_23
    invoke-static {v1}, Lxc;->o(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    move-object v2, v4

    .line 515
    goto :goto_e

    .line 516
    :cond_24
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    check-cast v8, Lww;

    .line 520
    .line 521
    iput-object p0, v0, Lnu;->g:Luo;

    .line 522
    .line 523
    iput-object p1, v0, Lnu;->k:Ljava/lang/Object;

    .line 524
    .line 525
    iput v6, v0, Lnu;->i:I

    .line 526
    .line 527
    invoke-interface {v8, p1, v0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object p2

    .line 531
    if-ne p2, v2, :cond_25

    .line 532
    .line 533
    goto :goto_e

    .line 534
    :cond_25
    :goto_d
    check-cast p2, Ljava/lang/Boolean;

    .line 535
    .line 536
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 537
    .line 538
    .line 539
    move-result p2

    .line 540
    if-nez p2, :cond_26

    .line 541
    .line 542
    move-object v2, v7

    .line 543
    :goto_e
    return-object v2

    .line 544
    :cond_26
    iget-object p2, p0, Luo;->e:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast p2, Lzt0;

    .line 547
    .line 548
    iput-object p1, p2, Lzt0;->d:Ljava/lang/Object;

    .line 549
    .line 550
    new-instance p1, La;

    .line 551
    .line 552
    invoke-direct {p1, p0}, La;-><init>(Luo;)V

    .line 553
    .line 554
    .line 555
    throw p1

    .line 556
    :pswitch_3
    check-cast v5, Lzt0;

    .line 557
    .line 558
    instance-of v0, p2, Lto;

    .line 559
    .line 560
    if-eqz v0, :cond_27

    .line 561
    .line 562
    move-object v0, p2

    .line 563
    check-cast v0, Lto;

    .line 564
    .line 565
    iget v9, v0, Lto;->i:I

    .line 566
    .line 567
    and-int v10, v9, v3

    .line 568
    .line 569
    if-eqz v10, :cond_27

    .line 570
    .line 571
    sub-int/2addr v9, v3

    .line 572
    iput v9, v0, Lto;->i:I

    .line 573
    .line 574
    goto :goto_f

    .line 575
    :cond_27
    new-instance v0, Lto;

    .line 576
    .line 577
    invoke-direct {v0, p0, p2}, Lto;-><init>(Luo;Lik;)V

    .line 578
    .line 579
    .line 580
    :goto_f
    iget-object p0, v0, Lto;->g:Ljava/lang/Object;

    .line 581
    .line 582
    iget p2, v0, Lto;->i:I

    .line 583
    .line 584
    if-eqz p2, :cond_2a

    .line 585
    .line 586
    if-ne p2, v6, :cond_29

    .line 587
    .line 588
    invoke-static {p0}, Lw60;->M(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    :cond_28
    move-object v2, v7

    .line 592
    goto :goto_10

    .line 593
    :cond_29
    invoke-static {v1}, Lxc;->o(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    move-object v2, v4

    .line 597
    goto :goto_10

    .line 598
    :cond_2a
    invoke-static {p0}, Lw60;->M(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    iget-object p0, v5, Lzt0;->d:Ljava/lang/Object;

    .line 602
    .line 603
    sget-object p2, Lo30;->l:Lzr;

    .line 604
    .line 605
    if-eq p0, p2, :cond_2b

    .line 606
    .line 607
    invoke-static {p0, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result p0

    .line 611
    if-nez p0, :cond_28

    .line 612
    .line 613
    :cond_2b
    iput-object p1, v5, Lzt0;->d:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v8, Liu;

    .line 616
    .line 617
    iput v6, v0, Lto;->i:I

    .line 618
    .line 619
    invoke-interface {v8, p1, v0}, Liu;->f(Ljava/lang/Object;Lik;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    if-ne p0, v2, :cond_28

    .line 624
    .line 625
    :goto_10
    return-object v2

    .line 626
    nop

    .line 627
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
