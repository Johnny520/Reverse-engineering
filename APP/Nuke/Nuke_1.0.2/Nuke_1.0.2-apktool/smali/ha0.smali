.class public final Lha0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lak0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lha0;->h:I

    iput-object p2, p0, Lha0;->i:Ljava/lang/Object;

    iput-object p3, p0, Lha0;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lia0;Lo72;Lak0;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lha0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lha0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lha0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lmn0;Lo72;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lha0;->h:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lha0;->j:Ljava/lang/Object;

    iput-object p2, p0, Lha0;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Lha0;->h:I

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/high16 v5, -0x80000000

    .line 12
    .line 13
    const/4 v6, 0x3

    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    sget-object v9, Lk20;->h:Lk20;

    .line 17
    .line 18
    iget-object v10, v0, Lha0;->j:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v11, v0, Lha0;->i:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object v12, La83;->a:La83;

    .line 23
    .line 24
    packed-switch v3, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    check-cast v0, Lrs1;

    .line 29
    .line 30
    iget-wide v0, v0, Lrs1;->a:J

    .line 31
    .line 32
    move-object v14, v11

    .line 33
    check-cast v14, Lsc;

    .line 34
    .line 35
    invoke-virtual {v14}, Lsc;->d()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lrs1;

    .line 40
    .line 41
    iget-wide v3, v3, Lrs1;->a:J

    .line 42
    .line 43
    const-wide v7, 0x7fffffff7fffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v3, v7

    .line 49
    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    cmp-long v3, v3, v15

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    and-long v3, v0, v7

    .line 59
    .line 60
    cmp-long v3, v3, v15

    .line 61
    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    invoke-virtual {v14}, Lsc;->d()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Lrs1;

    .line 69
    .line 70
    iget-wide v3, v3, Lrs1;->a:J

    .line 71
    .line 72
    const-wide v7, 0xffffffffL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    and-long/2addr v3, v7

    .line 78
    long-to-int v3, v3

    .line 79
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    and-long v4, v0, v7

    .line 84
    .line 85
    long-to-int v4, v4

    .line 86
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    cmpg-float v3, v3, v4

    .line 91
    .line 92
    if-nez v3, :cond_0

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    check-cast v10, Lj20;

    .line 96
    .line 97
    new-instance v13, Lgc;

    .line 98
    .line 99
    const/16 v18, 0x2

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    move-wide v15, v0

    .line 104
    invoke-direct/range {v13 .. v18}, Lgc;-><init>(Ljava/lang/Object;JLt00;I)V

    .line 105
    .line 106
    .line 107
    move-object/from16 v0, v17

    .line 108
    .line 109
    invoke-static {v10, v0, v13, v6}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    :goto_0
    new-instance v3, Lrs1;

    .line 114
    .line 115
    invoke-direct {v3, v0, v1}, Lrs1;-><init>(J)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v14, v2, v3}, Lsc;->e(Lt00;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-ne v0, v9, :cond_2

    .line 123
    .line 124
    move-object v12, v0

    .line 125
    :cond_2
    :goto_1
    return-object v12

    .line 126
    :pswitch_0
    move-object v0, v1

    .line 127
    check-cast v0, Lj11;

    .line 128
    .line 129
    instance-of v1, v0, Lb32;

    .line 130
    .line 131
    check-cast v11, Lua;

    .line 132
    .line 133
    if-eqz v1, :cond_4

    .line 134
    .line 135
    iget-boolean v1, v11, Lua;->D:Z

    .line 136
    .line 137
    if-eqz v1, :cond_3

    .line 138
    .line 139
    check-cast v0, Lb32;

    .line 140
    .line 141
    invoke-virtual {v11, v0}, Lua;->M0(Lb32;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_7

    .line 145
    .line 146
    :cond_3
    iget-object v1, v11, Lua;->E:Llk1;

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Llk1;->a(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_7

    .line 152
    .line 153
    :cond_4
    check-cast v10, Lj20;

    .line 154
    .line 155
    iget-object v1, v11, Lua;->A:Los;

    .line 156
    .line 157
    const/4 v2, 0x0

    .line 158
    if-nez v1, :cond_5

    .line 159
    .line 160
    new-instance v1, Los;

    .line 161
    .line 162
    iget-boolean v3, v11, Lua;->w:Z

    .line 163
    .line 164
    iget-object v4, v11, Lua;->z:Lw60;

    .line 165
    .line 166
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 167
    .line 168
    .line 169
    iput-boolean v3, v1, Los;->a:Z

    .line 170
    .line 171
    iput-object v4, v1, Los;->b:Ljava/lang/Object;

    .line 172
    .line 173
    new-instance v3, Lsc;

    .line 174
    .line 175
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    sget-object v5, Lrg3;->n:Ln43;

    .line 180
    .line 181
    const v7, 0x3c23d70a    # 0.01f

    .line 182
    .line 183
    .line 184
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    const/16 v9, 0x8

    .line 189
    .line 190
    invoke-direct {v3, v4, v5, v7, v9}, Lsc;-><init>(Ljava/lang/Object;Ln43;Ljava/lang/Object;I)V

    .line 191
    .line 192
    .line 193
    iput-object v3, v1, Los;->c:Ljava/lang/Object;

    .line 194
    .line 195
    new-instance v3, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 198
    .line 199
    .line 200
    iput-object v3, v1, Los;->d:Ljava/lang/Object;

    .line 201
    .line 202
    invoke-static {v11}, Lci0;->M(Lmc0;)V

    .line 203
    .line 204
    .line 205
    iput-object v1, v11, Lua;->A:Los;

    .line 206
    .line 207
    :cond_5
    iget-object v3, v1, Los;->d:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v3, Ljava/util/ArrayList;

    .line 210
    .line 211
    instance-of v4, v0, Lxu0;

    .line 212
    .line 213
    if-eqz v4, :cond_6

    .line 214
    .line 215
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_6
    instance-of v4, v0, Lyu0;

    .line 220
    .line 221
    if-eqz v4, :cond_7

    .line 222
    .line 223
    check-cast v0, Lyu0;

    .line 224
    .line 225
    iget-object v0, v0, Lyu0;->a:Lxu0;

    .line 226
    .line 227
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_7
    instance-of v4, v0, Ltk0;

    .line 232
    .line 233
    if-eqz v4, :cond_8

    .line 234
    .line 235
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_8
    instance-of v4, v0, Luk0;

    .line 240
    .line 241
    if-eqz v4, :cond_9

    .line 242
    .line 243
    check-cast v0, Luk0;

    .line 244
    .line 245
    iget-object v0, v0, Luk0;->a:Ltk0;

    .line 246
    .line 247
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_9
    instance-of v4, v0, Lfc0;

    .line 252
    .line 253
    if-eqz v4, :cond_a

    .line 254
    .line 255
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_a
    instance-of v4, v0, Lgc0;

    .line 260
    .line 261
    if-eqz v4, :cond_b

    .line 262
    .line 263
    check-cast v0, Lgc0;

    .line 264
    .line 265
    iget-object v0, v0, Lgc0;->a:Lfc0;

    .line 266
    .line 267
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_b
    instance-of v4, v0, Lec0;

    .line 272
    .line 273
    if-eqz v4, :cond_16

    .line 274
    .line 275
    check-cast v0, Lec0;

    .line 276
    .line 277
    iget-object v0, v0, Lec0;->a:Lfc0;

    .line 278
    .line 279
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    :goto_2
    invoke-static {v3}, Ldu;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, Lj11;

    .line 287
    .line 288
    iget-object v3, v1, Los;->e:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v3, Lj11;

    .line 291
    .line 292
    invoke-static {v3, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-nez v3, :cond_16

    .line 297
    .line 298
    if-eqz v0, :cond_12

    .line 299
    .line 300
    iget-object v3, v1, Los;->b:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v3, Lw60;

    .line 303
    .line 304
    invoke-virtual {v3}, Lw60;->a()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    instance-of v3, v0, Lxu0;

    .line 308
    .line 309
    if-eqz v3, :cond_c

    .line 310
    .line 311
    const v2, 0x3da3d70a    # 0.08f

    .line 312
    .line 313
    .line 314
    goto :goto_3

    .line 315
    :cond_c
    instance-of v4, v0, Ltk0;

    .line 316
    .line 317
    if-eqz v4, :cond_d

    .line 318
    .line 319
    const v2, 0x3dcccccd    # 0.1f

    .line 320
    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_d
    instance-of v4, v0, Lfc0;

    .line 324
    .line 325
    if-eqz v4, :cond_e

    .line 326
    .line 327
    const v2, 0x3e23d70a    # 0.16f

    .line 328
    .line 329
    .line 330
    :cond_e
    :goto_3
    sget-object v4, Lta2;->a:Lm43;

    .line 331
    .line 332
    if-eqz v3, :cond_f

    .line 333
    .line 334
    goto :goto_4

    .line 335
    :cond_f
    instance-of v3, v0, Ltk0;

    .line 336
    .line 337
    const/16 v5, 0x2d

    .line 338
    .line 339
    if-eqz v3, :cond_10

    .line 340
    .line 341
    new-instance v4, Lm43;

    .line 342
    .line 343
    sget-object v3, Lhd0;->b:Lc80;

    .line 344
    .line 345
    invoke-direct {v4, v5, v3}, Lm43;-><init>(ILgd0;)V

    .line 346
    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_10
    instance-of v3, v0, Lfc0;

    .line 350
    .line 351
    if-eqz v3, :cond_11

    .line 352
    .line 353
    new-instance v4, Lm43;

    .line 354
    .line 355
    sget-object v3, Lhd0;->b:Lc80;

    .line 356
    .line 357
    invoke-direct {v4, v5, v3}, Lm43;-><init>(ILgd0;)V

    .line 358
    .line 359
    .line 360
    :cond_11
    :goto_4
    new-instance v3, Llu2;

    .line 361
    .line 362
    invoke-direct {v3, v1, v2, v4, v8}, Llu2;-><init>(Los;FLhd;Lt00;)V

    .line 363
    .line 364
    .line 365
    invoke-static {v10, v8, v3, v6}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 366
    .line 367
    .line 368
    goto :goto_6

    .line 369
    :cond_12
    iget-object v2, v1, Los;->e:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v2, Lj11;

    .line 372
    .line 373
    sget-object v3, Lta2;->a:Lm43;

    .line 374
    .line 375
    instance-of v4, v2, Lxu0;

    .line 376
    .line 377
    if-eqz v4, :cond_13

    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_13
    instance-of v4, v2, Ltk0;

    .line 381
    .line 382
    if-eqz v4, :cond_14

    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_14
    instance-of v2, v2, Lfc0;

    .line 386
    .line 387
    if-eqz v2, :cond_15

    .line 388
    .line 389
    new-instance v3, Lm43;

    .line 390
    .line 391
    const/16 v2, 0x96

    .line 392
    .line 393
    sget-object v4, Lhd0;->b:Lc80;

    .line 394
    .line 395
    invoke-direct {v3, v2, v4}, Lm43;-><init>(ILgd0;)V

    .line 396
    .line 397
    .line 398
    :cond_15
    :goto_5
    new-instance v2, La2;

    .line 399
    .line 400
    const/16 v4, 0x1a

    .line 401
    .line 402
    invoke-direct {v2, v1, v3, v8, v4}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 403
    .line 404
    .line 405
    invoke-static {v10, v8, v2, v6}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 406
    .line 407
    .line 408
    :goto_6
    iput-object v0, v1, Los;->e:Ljava/lang/Object;

    .line 409
    .line 410
    :cond_16
    :goto_7
    return-object v12

    .line 411
    :pswitch_1
    move-object v0, v1

    .line 412
    check-cast v0, Lj11;

    .line 413
    .line 414
    check-cast v11, Ljava/util/ArrayList;

    .line 415
    .line 416
    instance-of v1, v0, Lz22;

    .line 417
    .line 418
    if-eqz v1, :cond_17

    .line 419
    .line 420
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    goto :goto_8

    .line 424
    :cond_17
    instance-of v1, v0, La32;

    .line 425
    .line 426
    if-eqz v1, :cond_18

    .line 427
    .line 428
    check-cast v0, La32;

    .line 429
    .line 430
    iget-object v0, v0, La32;->a:Lz22;

    .line 431
    .line 432
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    goto :goto_8

    .line 436
    :cond_18
    instance-of v1, v0, Ly22;

    .line 437
    .line 438
    if-eqz v1, :cond_19

    .line 439
    .line 440
    check-cast v0, Ly22;

    .line 441
    .line 442
    iget-object v0, v0, Ly22;->a:Lz22;

    .line 443
    .line 444
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    :cond_19
    :goto_8
    check-cast v10, Lxk1;

    .line 448
    .line 449
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    xor-int/2addr v0, v7

    .line 454
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-interface {v10, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    return-object v12

    .line 462
    :pswitch_2
    instance-of v3, v2, Ljk0;

    .line 463
    .line 464
    if-eqz v3, :cond_1a

    .line 465
    .line 466
    move-object v3, v2

    .line 467
    check-cast v3, Ljk0;

    .line 468
    .line 469
    iget v6, v3, Ljk0;->l:I

    .line 470
    .line 471
    and-int v13, v6, v5

    .line 472
    .line 473
    if-eqz v13, :cond_1a

    .line 474
    .line 475
    sub-int/2addr v6, v5

    .line 476
    iput v6, v3, Ljk0;->l:I

    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_1a
    new-instance v3, Ljk0;

    .line 480
    .line 481
    invoke-direct {v3, v0, v2}, Ljk0;-><init>(Lha0;Lt00;)V

    .line 482
    .line 483
    .line 484
    :goto_9
    iget-object v2, v3, Ljk0;->k:Ljava/lang/Object;

    .line 485
    .line 486
    iget v5, v3, Ljk0;->l:I

    .line 487
    .line 488
    if-eqz v5, :cond_1c

    .line 489
    .line 490
    if-ne v5, v7, :cond_1b

    .line 491
    .line 492
    iget-object v1, v3, Ljk0;->n:Ljava/lang/Object;

    .line 493
    .line 494
    invoke-static {v2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    goto :goto_a

    .line 498
    :cond_1b
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    goto :goto_b

    .line 502
    :cond_1c
    invoke-static {v2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    check-cast v10, Lmn0;

    .line 506
    .line 507
    iput-object v1, v3, Ljk0;->n:Ljava/lang/Object;

    .line 508
    .line 509
    iput v7, v3, Ljk0;->l:I

    .line 510
    .line 511
    invoke-interface {v10, v1, v3}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    if-ne v2, v9, :cond_1d

    .line 516
    .line 517
    move-object v8, v9

    .line 518
    goto :goto_b

    .line 519
    :cond_1d
    :goto_a
    check-cast v2, Ljava/lang/Boolean;

    .line 520
    .line 521
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    if-nez v2, :cond_1e

    .line 526
    .line 527
    move-object v8, v12

    .line 528
    :goto_b
    return-object v8

    .line 529
    :cond_1e
    check-cast v11, Lo72;

    .line 530
    .line 531
    iput-object v1, v11, Lo72;->i:Ljava/lang/Object;

    .line 532
    .line 533
    new-instance v1, Lo1;

    .line 534
    .line 535
    invoke-direct {v1, v0}, Lo1;-><init>(Lha0;)V

    .line 536
    .line 537
    .line 538
    throw v1

    .line 539
    :pswitch_3
    check-cast v11, Lo72;

    .line 540
    .line 541
    instance-of v3, v2, Lga0;

    .line 542
    .line 543
    if-eqz v3, :cond_1f

    .line 544
    .line 545
    move-object v3, v2

    .line 546
    check-cast v3, Lga0;

    .line 547
    .line 548
    iget v6, v3, Lga0;->m:I

    .line 549
    .line 550
    and-int v13, v6, v5

    .line 551
    .line 552
    if-eqz v13, :cond_1f

    .line 553
    .line 554
    sub-int/2addr v6, v5

    .line 555
    iput v6, v3, Lga0;->m:I

    .line 556
    .line 557
    goto :goto_c

    .line 558
    :cond_1f
    new-instance v3, Lga0;

    .line 559
    .line 560
    invoke-direct {v3, v0, v2}, Lga0;-><init>(Lha0;Lt00;)V

    .line 561
    .line 562
    .line 563
    :goto_c
    iget-object v0, v3, Lga0;->k:Ljava/lang/Object;

    .line 564
    .line 565
    iget v2, v3, Lga0;->m:I

    .line 566
    .line 567
    if-eqz v2, :cond_22

    .line 568
    .line 569
    if-ne v2, v7, :cond_21

    .line 570
    .line 571
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    :cond_20
    move-object v8, v12

    .line 575
    goto :goto_d

    .line 576
    :cond_21
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    goto :goto_d

    .line 580
    :cond_22
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    iget-object v0, v11, Lo72;->i:Ljava/lang/Object;

    .line 584
    .line 585
    sget-object v2, Lup0;->e:Lhh1;

    .line 586
    .line 587
    if-eq v0, v2, :cond_23

    .line 588
    .line 589
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-nez v0, :cond_20

    .line 594
    .line 595
    :cond_23
    iput-object v1, v11, Lo72;->i:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v10, Lak0;

    .line 598
    .line 599
    iput v7, v3, Lga0;->m:I

    .line 600
    .line 601
    invoke-interface {v10, v1, v3}, Lak0;->m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    if-ne v0, v9, :cond_20

    .line 606
    .line 607
    move-object v8, v9

    .line 608
    :goto_d
    return-object v8

    .line 609
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
