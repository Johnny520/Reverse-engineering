.class public final synthetic Ls13;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lin0;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Lxk1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lin0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls13;->h:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Ls13;->i:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ls13;->j:Lin0;

    .line 9
    .line 10
    iput-object p4, p0, Ls13;->k:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Ls13;->l:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Ls13;->m:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Ls13;->n:Lxk1;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lbv;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Lpx;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v1, v3, 0x11

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    const/16 v6, 0x10

    .line 27
    .line 28
    if-eq v1, v6, :cond_0

    .line 29
    .line 30
    move v1, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v5

    .line 33
    :goto_0
    and-int/2addr v3, v4

    .line 34
    move-object v14, v2

    .line 35
    check-cast v14, Lgo0;

    .line 36
    .line 37
    invoke-virtual {v14, v3, v1}, Lgo0;->O(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_7

    .line 42
    .line 43
    sget-object v1, Lte;->e:Lyi0;

    .line 44
    .line 45
    const/high16 v2, 0x43d20000    # 420.0f

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-static {v1, v3, v2, v4}, Lte;->P(Luh1;FFI)Luh1;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v14}, Lgf1;->P(Lpx;)Lnl2;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v1, v2}, Lgf1;->b0(Luh1;Lnl2;)Luh1;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget-object v2, Ltp0;->c:Lvf;

    .line 61
    .line 62
    sget-object v3, Lsn;->u:Lpk;

    .line 63
    .line 64
    invoke-static {v2, v3, v14, v5}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-wide v7, v14, Lgo0;->T:J

    .line 69
    .line 70
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v14}, Lgo0;->l()Lyy1;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-static {v14, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    sget-object v8, Lhx;->c:Lgx;

    .line 83
    .line 84
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    sget-object v8, Lgx;->b:Ljy;

    .line 88
    .line 89
    invoke-virtual {v14}, Lgo0;->Z()V

    .line 90
    .line 91
    .line 92
    iget-boolean v9, v14, Lgo0;->S:Z

    .line 93
    .line 94
    if-eqz v9, :cond_1

    .line 95
    .line 96
    invoke-virtual {v14, v8}, Lgo0;->k(Lxm0;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {v14}, Lgo0;->i0()V

    .line 101
    .line 102
    .line 103
    :goto_1
    sget-object v8, Lgx;->e:Llc;

    .line 104
    .line 105
    invoke-static {v14, v8, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v2, Lgx;->d:Llc;

    .line 109
    .line 110
    invoke-static {v14, v2, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    sget-object v3, Lgx;->f:Llc;

    .line 118
    .line 119
    invoke-static {v14, v3, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object v2, Lgx;->g:Lv6;

    .line 123
    .line 124
    invoke-static {v14, v2}, Lyf3;->b(Lpx;Lin0;)V

    .line 125
    .line 126
    .line 127
    sget-object v2, Lgx;->c:Llc;

    .line 128
    .line 129
    invoke-static {v14, v2, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    const v1, 0x790b0156

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v14}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v1, v14, v5}, Lgf1;->g(Ljava/lang/String;Lpx;I)V

    .line 140
    .line 141
    .line 142
    iget-object v1, v0, Ls13;->h:Ljava/util/List;

    .line 143
    .line 144
    iget-object v2, v0, Ls13;->i:Ljava/lang/String;

    .line 145
    .line 146
    iget-object v8, v0, Ls13;->j:Lin0;

    .line 147
    .line 148
    invoke-static {v1, v2, v8, v14, v5}, Lgf1;->i(Ljava/util/List;Ljava/lang/String;Lin0;Lpx;I)V

    .line 149
    .line 150
    .line 151
    iget-object v1, v0, Ls13;->k:Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    const/high16 v7, 0x41800000    # 16.0f

    .line 158
    .line 159
    sget-object v9, Lrh1;->a:Lrh1;

    .line 160
    .line 161
    if-nez v3, :cond_2

    .line 162
    .line 163
    const v3, -0x3c9d11ba

    .line 164
    .line 165
    .line 166
    invoke-virtual {v14, v3}, Lgo0;->W(I)V

    .line 167
    .line 168
    .line 169
    invoke-static {v9, v7}, Lte;->O(Luh1;F)Luh1;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v14, v3}, Lrp0;->O(Lpx;Luh1;)V

    .line 174
    .line 175
    .line 176
    const v3, 0x790b0157

    .line 177
    .line 178
    .line 179
    invoke-static {v3, v14}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-static {v3, v14, v5}, Lgf1;->g(Ljava/lang/String;Lpx;I)V

    .line 184
    .line 185
    .line 186
    invoke-static {v1, v2, v8, v14, v5}, Lgf1;->i(Ljava/util/List;Ljava/lang/String;Lin0;Lpx;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v14, v5}, Lgo0;->p(Z)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_2
    const v1, -0x3c9768b8

    .line 194
    .line 195
    .line 196
    invoke-virtual {v14, v1}, Lgo0;->W(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v14, v5}, Lgo0;->p(Z)V

    .line 200
    .line 201
    .line 202
    :goto_2
    const v1, 0x790b0152

    .line 203
    .line 204
    .line 205
    invoke-static {v9, v7, v14, v1, v14}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-static {v1, v14, v5}, Lgf1;->g(Ljava/lang/String;Lpx;I)V

    .line 210
    .line 211
    .line 212
    new-instance v1, Ln0;

    .line 213
    .line 214
    const/16 v3, 0xb

    .line 215
    .line 216
    invoke-direct {v1, v2, v3}, Ln0;-><init>(Ljava/lang/String;I)V

    .line 217
    .line 218
    .line 219
    const v3, -0x637a62

    .line 220
    .line 221
    .line 222
    invoke-static {v3, v1, v14}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    new-instance v1, Lm51;

    .line 227
    .line 228
    const/4 v3, 0x2

    .line 229
    const/16 v10, 0x7a

    .line 230
    .line 231
    invoke-direct {v1, v3, v10}, Lm51;-><init>(II)V

    .line 232
    .line 233
    .line 234
    const/16 v23, 0x180

    .line 235
    .line 236
    const/16 v24, 0x2fd4

    .line 237
    .line 238
    move v3, v7

    .line 239
    iget-object v7, v0, Ls13;->l:Ljava/lang/String;

    .line 240
    .line 241
    move-object v15, v9

    .line 242
    const/4 v9, 0x0

    .line 243
    iget-object v10, v0, Ls13;->m:Ljava/lang/String;

    .line 244
    .line 245
    const/4 v11, 0x0

    .line 246
    const/4 v13, 0x0

    .line 247
    move-object/from16 v21, v14

    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    move-object/from16 v16, v15

    .line 251
    .line 252
    const/4 v15, 0x0

    .line 253
    move-object/from16 v17, v16

    .line 254
    .line 255
    const/16 v16, 0x0

    .line 256
    .line 257
    move-object/from16 v18, v17

    .line 258
    .line 259
    const/16 v17, 0x0

    .line 260
    .line 261
    move-object/from16 v19, v18

    .line 262
    .line 263
    const/16 v18, 0x0

    .line 264
    .line 265
    const/16 v20, 0x0

    .line 266
    .line 267
    const/high16 v22, 0x30000

    .line 268
    .line 269
    move-object/from16 v30, v19

    .line 270
    .line 271
    move-object/from16 v19, v1

    .line 272
    .line 273
    move-object/from16 v1, v30

    .line 274
    .line 275
    invoke-static/range {v7 .. v24}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 276
    .line 277
    .line 278
    move-object/from16 v14, v21

    .line 279
    .line 280
    const/16 v19, 0x0

    .line 281
    .line 282
    const/16 v20, 0xd

    .line 283
    .line 284
    const/16 v16, 0x0

    .line 285
    .line 286
    const/high16 v17, 0x41000000    # 8.0f

    .line 287
    .line 288
    const/16 v18, 0x0

    .line 289
    .line 290
    move-object v15, v1

    .line 291
    invoke-static/range {v15 .. v20}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    if-nez v2, :cond_3

    .line 296
    .line 297
    const v7, 0x6124d7ee

    .line 298
    .line 299
    .line 300
    invoke-virtual {v14, v7}, Lgo0;->W(I)V

    .line 301
    .line 302
    .line 303
    const v7, 0x790b0139

    .line 304
    .line 305
    .line 306
    invoke-static {v7, v14}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    invoke-virtual {v14, v5}, Lgo0;->p(Z)V

    .line 311
    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_3
    const v7, 0x6124d544

    .line 315
    .line 316
    .line 317
    invoke-virtual {v14, v7}, Lgo0;->W(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v14, v5}, Lgo0;->p(Z)V

    .line 321
    .line 322
    .line 323
    move-object v7, v2

    .line 324
    :goto_3
    if-nez v2, :cond_4

    .line 325
    .line 326
    const v2, -0x3c87933a

    .line 327
    .line 328
    .line 329
    invoke-virtual {v14, v2}, Lgo0;->W(I)V

    .line 330
    .line 331
    .line 332
    sget-object v2, Lur1;->a:Ltu2;

    .line 333
    .line 334
    invoke-virtual {v14, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    check-cast v2, Llp1;

    .line 339
    .line 340
    iget-wide v9, v2, Llp1;->f:J

    .line 341
    .line 342
    const v2, 0x3f3851ec    # 0.72f

    .line 343
    .line 344
    .line 345
    invoke-static {v2, v9, v10}, Lju;->b(FJ)J

    .line 346
    .line 347
    .line 348
    move-result-wide v9

    .line 349
    invoke-virtual {v14, v5}, Lgo0;->p(Z)V

    .line 350
    .line 351
    .line 352
    :goto_4
    move-wide/from16 v17, v9

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_4
    const v2, -0x3c8602a6

    .line 356
    .line 357
    .line 358
    invoke-virtual {v14, v2}, Lgo0;->W(I)V

    .line 359
    .line 360
    .line 361
    sget-object v2, Lur1;->a:Ltu2;

    .line 362
    .line 363
    invoke-virtual {v14, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    check-cast v2, Llp1;

    .line 368
    .line 369
    iget-wide v9, v2, Llp1;->f:J

    .line 370
    .line 371
    invoke-virtual {v14, v5}, Lgo0;->p(Z)V

    .line 372
    .line 373
    .line 374
    goto :goto_4

    .line 375
    :goto_5
    const/16 v2, 0xc

    .line 376
    .line 377
    invoke-static {v2}, Lrg3;->D(I)J

    .line 378
    .line 379
    .line 380
    move-result-wide v19

    .line 381
    invoke-static {v6}, Lrg3;->D(I)J

    .line 382
    .line 383
    .line 384
    move-result-wide v25

    .line 385
    sget-object v21, Lim0;->k:Lim0;

    .line 386
    .line 387
    new-instance v16, Lm13;

    .line 388
    .line 389
    const/16 v28, 0x0

    .line 390
    .line 391
    const v29, 0xfdfff8

    .line 392
    .line 393
    .line 394
    const-wide/16 v22, 0x0

    .line 395
    .line 396
    const/16 v24, 0x0

    .line 397
    .line 398
    const/16 v27, 0x0

    .line 399
    .line 400
    invoke-direct/range {v16 .. v29}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 401
    .line 402
    .line 403
    move-object/from16 v17, v15

    .line 404
    .line 405
    const/16 v15, 0x30

    .line 406
    .line 407
    move-object/from16 v9, v16

    .line 408
    .line 409
    const/16 v16, 0x3f8

    .line 410
    .line 411
    const/4 v10, 0x0

    .line 412
    const/4 v11, 0x0

    .line 413
    const/4 v12, 0x0

    .line 414
    const/4 v13, 0x0

    .line 415
    move-object v2, v8

    .line 416
    move-object v8, v1

    .line 417
    move-object v1, v2

    .line 418
    move-object/from16 v2, v17

    .line 419
    .line 420
    invoke-static/range {v7 .. v16}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 421
    .line 422
    .line 423
    const v6, 0x790b0155

    .line 424
    .line 425
    .line 426
    invoke-static {v2, v3, v14, v6, v14}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-static {v2, v14, v5}, Lgf1;->g(Ljava/lang/String;Lpx;I)V

    .line 431
    .line 432
    .line 433
    iget-object v0, v0, Ls13;->n:Lxk1;

    .line 434
    .line 435
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    check-cast v2, Lx13;

    .line 440
    .line 441
    invoke-virtual {v14, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    invoke-virtual {v14}, Lgo0;->L()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    if-nez v3, :cond_5

    .line 450
    .line 451
    sget-object v3, Lnx;->a:Leb;

    .line 452
    .line 453
    if-ne v6, v3, :cond_6

    .line 454
    .line 455
    :cond_5
    new-instance v6, Ld62;

    .line 456
    .line 457
    const/4 v3, 0x3

    .line 458
    invoke-direct {v6, v3, v1, v0}, Ld62;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v14, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    :cond_6
    check-cast v6, Lin0;

    .line 465
    .line 466
    invoke-static {v2, v6, v14, v5}, Lgf1;->f(Lx13;Lin0;Lpx;I)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v14, v4}, Lgo0;->p(Z)V

    .line 470
    .line 471
    .line 472
    goto :goto_6

    .line 473
    :cond_7
    invoke-virtual {v14}, Lgo0;->R()V

    .line 474
    .line 475
    .line 476
    :goto_6
    sget-object v0, La83;->a:La83;

    .line 477
    .line 478
    return-object v0
.end method
