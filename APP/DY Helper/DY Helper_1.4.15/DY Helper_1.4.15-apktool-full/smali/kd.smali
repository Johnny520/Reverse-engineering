.class public final Lkd;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljn0;


# static fields
.field public static final β:Lkd;

.field public static final γ:Lkd;


# instance fields
.field public final synthetic α:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkd;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkd;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkd;->β:Lkd;

    .line 8
    .line 9
    new-instance v0, Lkd;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lkd;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lkd;->γ:Lkd;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lkd;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α(Lyk1;)Lzn1;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lkd;->α:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-string v0, "networkResponse"

    .line 14
    .line 15
    const-string v2, "Content-Type"

    .line 16
    .line 17
    const-string v5, "Content-Encoding"

    .line 18
    .line 19
    const-string v6, "Content-Length"

    .line 20
    .line 21
    const-string v7, "cacheResponse"

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    iget-object v9, v1, Lyk1;->ε:Li5;

    .line 27
    .line 28
    new-instance v8, Ln5;

    .line 29
    .line 30
    const/4 v10, 0x6

    .line 31
    invoke-direct {v8, v10, v9, v3, v4}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 32
    .line 33
    .line 34
    iget-object v11, v9, Li5;->η:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v11, Lfd;

    .line 37
    .line 38
    if-nez v11, :cond_0

    .line 39
    .line 40
    sget v11, Lfd;->ξ:I

    .line 41
    .line 42
    iget-object v11, v9, Li5;->δ:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v11, Lvc0;

    .line 45
    .line 46
    invoke-static {v11}, Lpd2;->Η(Lvc0;)Lfd;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    iput-object v11, v9, Li5;->η:Ljava/lang/Object;

    .line 51
    .line 52
    :cond_0
    iget-boolean v11, v11, Lfd;->κ:Z

    .line 53
    .line 54
    if-eqz v11, :cond_1

    .line 55
    .line 56
    new-instance v8, Ln5;

    .line 57
    .line 58
    invoke-direct {v8, v10, v3, v3, v4}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v10, v8, Ln5;->ζ:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v10, Li5;

    .line 64
    .line 65
    iget-object v8, v8, Ln5;->η:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v8, Lzn1;

    .line 68
    .line 69
    const/16 v11, 0x14

    .line 70
    .line 71
    if-nez v10, :cond_2

    .line 72
    .line 73
    if-nez v8, :cond_2

    .line 74
    .line 75
    sget-object v15, Lbo1;->ε:Lao1;

    .line 76
    .line 77
    sget-object v25, Lp52;->δ:Lzz1;

    .line 78
    .line 79
    new-instance v0, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v0, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    sget-object v10, Lzj1;->θ:Lzj1;

    .line 85
    .line 86
    const-string v11, "Unsatisfiable Request (only-if-cached)"

    .line 87
    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v22

    .line 92
    new-instance v14, Lvc0;

    .line 93
    .line 94
    new-array v1, v4, [Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, [Ljava/lang/String;

    .line 101
    .line 102
    invoke-direct {v14, v0}, Lvc0;-><init>([Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v8, Lzn1;

    .line 106
    .line 107
    const/16 v12, 0x1f8

    .line 108
    .line 109
    const/4 v13, 0x0

    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const/16 v18, 0x0

    .line 115
    .line 116
    const/16 v19, 0x0

    .line 117
    .line 118
    const-wide/16 v20, -0x1

    .line 119
    .line 120
    const/16 v24, 0x0

    .line 121
    .line 122
    invoke-direct/range {v8 .. v25}, Lzn1;-><init>(Li5;Lzj1;Ljava/lang/String;ILqc0;Lvc0;Lbo1;Llx1;Lzn1;Lzn1;Lzn1;JJLzz;Lp52;)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_7

    .line 126
    .line 127
    :cond_2
    if-nez v10, :cond_3

    .line 128
    .line 129
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8}, Lzn1;->δ()Lyn1;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v8}, Lp91;->Ε(Lzn1;)Lzn1;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v7, v1}, Lyn1;->β(Ljava/lang/String;Lzn1;)V

    .line 141
    .line 142
    .line 143
    iput-object v1, v0, Lyn1;->κ:Lzn1;

    .line 144
    .line 145
    invoke-virtual {v0}, Lyn1;->α()Lzn1;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :cond_3
    invoke-virtual {v1, v10}, Lyk1;->β(Li5;)Lzn1;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-eqz v8, :cond_e

    .line 156
    .line 157
    iget v9, v1, Lzn1;->θ:I

    .line 158
    .line 159
    const/16 v10, 0x130

    .line 160
    .line 161
    if-ne v9, v10, :cond_d

    .line 162
    .line 163
    invoke-virtual {v8}, Lzn1;->δ()Lyn1;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    iget-object v10, v8, Lzn1;->κ:Lvc0;

    .line 168
    .line 169
    iget-object v12, v1, Lzn1;->κ:Lvc0;

    .line 170
    .line 171
    new-instance v13, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v13, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v10}, Lvc0;->size()I

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    move v14, v4

    .line 181
    :goto_0
    if-ge v14, v11, :cond_9

    .line 182
    .line 183
    invoke-virtual {v10, v14}, Lvc0;->β(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v15

    .line 187
    move-object/from16 p0, v3

    .line 188
    .line 189
    invoke-virtual {v10, v14}, Lvc0;->δ(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    const-string v4, "Warning"

    .line 194
    .line 195
    invoke-virtual {v4, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_4

    .line 200
    .line 201
    const-string v4, "1"

    .line 202
    .line 203
    move-object/from16 v17, v10

    .line 204
    .line 205
    const/4 v10, 0x0

    .line 206
    invoke-static {v3, v4, v10}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-eqz v4, :cond_5

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_4
    move-object/from16 v17, v10

    .line 214
    .line 215
    :cond_5
    invoke-virtual {v6, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-nez v4, :cond_7

    .line 220
    .line 221
    invoke-virtual {v5, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-nez v4, :cond_7

    .line 226
    .line 227
    invoke-virtual {v2, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    if-eqz v4, :cond_6

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_6
    invoke-static {v15}, Ls1;->ξ(Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_7

    .line 239
    .line 240
    invoke-virtual {v12, v15}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    if-nez v4, :cond_8

    .line 245
    .line 246
    :cond_7
    :goto_1
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    :cond_8
    :goto_2
    add-int/lit8 v14, v14, 0x1

    .line 261
    .line 262
    const/4 v4, 0x0

    .line 263
    move-object/from16 v3, p0

    .line 264
    .line 265
    move-object/from16 v10, v17

    .line 266
    .line 267
    goto :goto_0

    .line 268
    :cond_9
    move-object/from16 p0, v3

    .line 269
    .line 270
    invoke-virtual {v12}, Lvc0;->size()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    const/4 v4, 0x0

    .line 275
    :goto_3
    if-ge v4, v3, :cond_c

    .line 276
    .line 277
    invoke-virtual {v12, v4}, Lvc0;->β(I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    invoke-virtual {v6, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    if-nez v11, :cond_b

    .line 286
    .line 287
    invoke-virtual {v5, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    if-nez v11, :cond_b

    .line 292
    .line 293
    invoke-virtual {v2, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    if-eqz v11, :cond_a

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_a
    invoke-static {v10}, Ls1;->ξ(Ljava/lang/String;)Z

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    if-eqz v11, :cond_b

    .line 305
    .line 306
    invoke-virtual {v12, v4}, Lvc0;->δ(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v11

    .line 310
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    invoke-static {v11}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    :cond_b
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_c
    new-instance v2, Lvc0;

    .line 328
    .line 329
    const/4 v10, 0x0

    .line 330
    new-array v3, v10, [Ljava/lang/String;

    .line 331
    .line 332
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    check-cast v3, [Ljava/lang/String;

    .line 337
    .line 338
    invoke-direct {v2, v3}, Lvc0;-><init>([Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Lvc0;->γ()Luc0;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    iput-object v2, v9, Lyn1;->ζ:Luc0;

    .line 346
    .line 347
    iget-wide v2, v1, Lzn1;->π:J

    .line 348
    .line 349
    iput-wide v2, v9, Lyn1;->μ:J

    .line 350
    .line 351
    iget-wide v2, v1, Lzn1;->ρ:J

    .line 352
    .line 353
    iput-wide v2, v9, Lyn1;->ν:J

    .line 354
    .line 355
    invoke-static {v8}, Lp91;->Ε(Lzn1;)Lzn1;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-static {v7, v2}, Lyn1;->β(Ljava/lang/String;Lzn1;)V

    .line 360
    .line 361
    .line 362
    iput-object v2, v9, Lyn1;->κ:Lzn1;

    .line 363
    .line 364
    invoke-static {v1}, Lp91;->Ε(Lzn1;)Lzn1;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-static {v0, v2}, Lyn1;->β(Ljava/lang/String;Lzn1;)V

    .line 369
    .line 370
    .line 371
    iput-object v2, v9, Lyn1;->ι:Lzn1;

    .line 372
    .line 373
    invoke-virtual {v9}, Lyn1;->α()Lzn1;

    .line 374
    .line 375
    .line 376
    iget-object v0, v1, Lzn1;->λ:Lbo1;

    .line 377
    .line 378
    invoke-virtual {v0}, Lbo1;->close()V

    .line 379
    .line 380
    .line 381
    throw p0

    .line 382
    :cond_d
    move-object/from16 p0, v3

    .line 383
    .line 384
    iget-object v2, v8, Lzn1;->λ:Lbo1;

    .line 385
    .line 386
    invoke-static {v2}, Lsd2;->β(Ljava/io/Closeable;)V

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_e
    move-object/from16 p0, v3

    .line 391
    .line 392
    :goto_5
    invoke-virtual {v1}, Lzn1;->δ()Lyn1;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    if-eqz v8, :cond_f

    .line 397
    .line 398
    invoke-static {v8}, Lp91;->Ε(Lzn1;)Lzn1;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    goto :goto_6

    .line 403
    :cond_f
    move-object/from16 v3, p0

    .line 404
    .line 405
    :goto_6
    invoke-static {v7, v3}, Lyn1;->β(Ljava/lang/String;Lzn1;)V

    .line 406
    .line 407
    .line 408
    iput-object v3, v2, Lyn1;->κ:Lzn1;

    .line 409
    .line 410
    invoke-static {v1}, Lp91;->Ε(Lzn1;)Lzn1;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-static {v0, v1}, Lyn1;->β(Ljava/lang/String;Lzn1;)V

    .line 415
    .line 416
    .line 417
    iput-object v1, v2, Lyn1;->ι:Lzn1;

    .line 418
    .line 419
    invoke-virtual {v2}, Lyn1;->α()Lzn1;

    .line 420
    .line 421
    .line 422
    move-result-object v8

    .line 423
    :goto_7
    return-object v8

    .line 424
    :pswitch_0
    move-object/from16 p0, v3

    .line 425
    .line 426
    iget-object v3, v1, Lyk1;->α:Luk1;

    .line 427
    .line 428
    monitor-enter v3

    .line 429
    :try_start_0
    iget-boolean v0, v3, Luk1;->τ:Z

    .line 430
    .line 431
    if-eqz v0, :cond_13

    .line 432
    .line 433
    iget-boolean v0, v3, Luk1;->π:Z

    .line 434
    .line 435
    if-nez v0, :cond_12

    .line 436
    .line 437
    iget-boolean v0, v3, Luk1;->ο:Z

    .line 438
    .line 439
    if-nez v0, :cond_12

    .line 440
    .line 441
    iget-boolean v0, v3, Luk1;->σ:Z

    .line 442
    .line 443
    if-nez v0, :cond_12

    .line 444
    .line 445
    iget-boolean v0, v3, Luk1;->ρ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 446
    .line 447
    if-nez v0, :cond_12

    .line 448
    .line 449
    monitor-exit v3

    .line 450
    iget-object v0, v3, Luk1;->λ:Lc00;

    .line 451
    .line 452
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    invoke-interface {v0}, Lc00;->α()Lvk1;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    iget-object v5, v3, Luk1;->ε:Lt41;

    .line 460
    .line 461
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    iget v6, v1, Lyk1;->η:I

    .line 468
    .line 469
    iget-object v7, v4, Lvk1;->θ:Lm6;

    .line 470
    .line 471
    iget-object v8, v4, Lvk1;->ι:Ldg0;

    .line 472
    .line 473
    if-eqz v8, :cond_10

    .line 474
    .line 475
    new-instance v6, Leg0;

    .line 476
    .line 477
    invoke-direct {v6, v5, v4, v1, v8}, Leg0;-><init>(Lt41;Lvk1;Lyk1;Ldg0;)V

    .line 478
    .line 479
    .line 480
    goto :goto_8

    .line 481
    :cond_10
    iget-object v8, v4, Lvk1;->ε:Ljava/net/Socket;

    .line 482
    .line 483
    invoke-virtual {v8, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 484
    .line 485
    .line 486
    iget-object v8, v7, Lm6;->η:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v8, Lrk1;

    .line 489
    .line 490
    iget-object v8, v8, Lrk1;->ε:Lrx1;

    .line 491
    .line 492
    invoke-interface {v8}, Lrx1;->α()Lm42;

    .line 493
    .line 494
    .line 495
    move-result-object v8

    .line 496
    int-to-long v9, v6

    .line 497
    invoke-virtual {v8, v9, v10}, Lm42;->η(J)Lm42;

    .line 498
    .line 499
    .line 500
    iget-object v6, v7, Lm6;->θ:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v6, Lqk1;

    .line 503
    .line 504
    iget-object v6, v6, Lqk1;->ε:Liw1;

    .line 505
    .line 506
    invoke-interface {v6}, Liw1;->α()Lm42;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    iget v8, v1, Lyk1;->θ:I

    .line 511
    .line 512
    int-to-long v8, v8

    .line 513
    invoke-virtual {v6, v8, v9}, Lm42;->η(J)Lm42;

    .line 514
    .line 515
    .line 516
    new-instance v6, Luf0;

    .line 517
    .line 518
    invoke-direct {v6, v5, v4, v7}, Luf0;-><init>(Lt41;La00;Lm6;)V

    .line 519
    .line 520
    .line 521
    :goto_8
    new-instance v4, Lzz;

    .line 522
    .line 523
    invoke-direct {v4, v3, v0, v6}, Lzz;-><init>(Luk1;Lc00;Lb00;)V

    .line 524
    .line 525
    .line 526
    iput-object v4, v3, Luk1;->ξ:Lzz;

    .line 527
    .line 528
    iput-object v4, v3, Luk1;->φ:Lzz;

    .line 529
    .line 530
    monitor-enter v3

    .line 531
    :try_start_1
    iput-boolean v2, v3, Luk1;->ο:Z

    .line 532
    .line 533
    iput-boolean v2, v3, Luk1;->π:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 534
    .line 535
    monitor-exit v3

    .line 536
    iget-boolean v0, v3, Luk1;->υ:Z

    .line 537
    .line 538
    if-nez v0, :cond_11

    .line 539
    .line 540
    const/16 v0, 0x3d

    .line 541
    .line 542
    const/4 v10, 0x0

    .line 543
    move-object/from16 v3, p0

    .line 544
    .line 545
    invoke-static {v1, v10, v4, v3, v0}, Lyk1;->α(Lyk1;ILzz;Li5;I)Lyk1;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    iget-object v1, v1, Lyk1;->ε:Li5;

    .line 550
    .line 551
    invoke-virtual {v0, v1}, Lyk1;->β(Li5;)Lzn1;

    .line 552
    .line 553
    .line 554
    move-result-object v3

    .line 555
    goto :goto_9

    .line 556
    :cond_11
    move-object/from16 v3, p0

    .line 557
    .line 558
    const-string v0, "Canceled"

    .line 559
    .line 560
    invoke-static {v0}, Lγ;->τ(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    :goto_9
    return-object v3

    .line 564
    :catchall_0
    move-exception v0

    .line 565
    monitor-exit v3

    .line 566
    throw v0

    .line 567
    :catchall_1
    move-exception v0

    .line 568
    goto :goto_a

    .line 569
    :cond_12
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 570
    .line 571
    const-string v1, "Check failed."

    .line 572
    .line 573
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    throw v0

    .line 577
    :cond_13
    const-string v0, "released"

    .line 578
    .line 579
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 580
    .line 581
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 585
    :goto_a
    monitor-exit v3

    .line 586
    throw v0

    .line 587
    :pswitch_1
    const-string v4, "close"

    .line 588
    .line 589
    const-string v5, "upgrade"

    .line 590
    .line 591
    const-string v6, "Connection"

    .line 592
    .line 593
    iget-object v8, v1, Lyk1;->δ:Lzz;

    .line 594
    .line 595
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    iget-object v0, v8, Lzz;->β:Ljava/lang/Object;

    .line 599
    .line 600
    move-object v7, v0

    .line 601
    check-cast v7, Luk1;

    .line 602
    .line 603
    iget-object v0, v8, Lzz;->δ:Ljava/lang/Object;

    .line 604
    .line 605
    move-object v14, v0

    .line 606
    check-cast v14, Lb00;

    .line 607
    .line 608
    iget-object v1, v1, Lyk1;->ε:Li5;

    .line 609
    .line 610
    iget-object v0, v1, Li5;->ε:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v0, Lkn1;

    .line 613
    .line 614
    iget-object v9, v1, Li5;->δ:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v9, Lvc0;

    .line 617
    .line 618
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 619
    .line 620
    .line 621
    move-result-wide v10

    .line 622
    iget-object v12, v1, Li5;->γ:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v12, Ljava/lang/String;

    .line 625
    .line 626
    invoke-static {v12}, Ljx0;->Φ(Ljava/lang/String;)Z

    .line 627
    .line 628
    .line 629
    move-result v12

    .line 630
    if-eqz v12, :cond_14

    .line 631
    .line 632
    if-eqz v0, :cond_14

    .line 633
    .line 634
    move v12, v2

    .line 635
    goto :goto_b

    .line 636
    :cond_14
    const/4 v12, 0x0

    .line 637
    :goto_b
    invoke-virtual {v9, v6}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v13

    .line 641
    invoke-virtual {v5, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 642
    .line 643
    .line 644
    move-result v15

    .line 645
    :try_start_3
    invoke-interface {v14, v1}, Lb00;->α(Li5;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8

    .line 646
    .line 647
    .line 648
    if-eqz v12, :cond_19

    .line 649
    .line 650
    :try_start_4
    const-string v12, "100-continue"

    .line 651
    .line 652
    const-string v13, "Expect"

    .line 653
    .line 654
    invoke-virtual {v9, v13}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v9

    .line 658
    invoke-virtual {v12, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 659
    .line 660
    .line 661
    move-result v9
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    .line 662
    if-eqz v9, :cond_15

    .line 663
    .line 664
    :try_start_5
    invoke-interface {v14}, Lb00;->ε()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 665
    .line 666
    .line 667
    :try_start_6
    invoke-virtual {v8, v2}, Lzz;->γ(Z)Lyn1;

    .line 668
    .line 669
    .line 670
    move-result-object v9

    .line 671
    move-object/from16 v17, v9

    .line 672
    .line 673
    goto :goto_d

    .line 674
    :catch_0
    move-exception v0

    .line 675
    move-object/from16 v17, v3

    .line 676
    .line 677
    :goto_c
    move-wide v2, v10

    .line 678
    goto/16 :goto_12

    .line 679
    .line 680
    :catch_1
    move-exception v0

    .line 681
    invoke-virtual {v8, v0}, Lzz;->δ(Ljava/io/IOException;)V

    .line 682
    .line 683
    .line 684
    throw v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 685
    :cond_15
    move-object/from16 v17, v3

    .line 686
    .line 687
    :goto_d
    if-nez v17, :cond_17

    .line 688
    .line 689
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 693
    .line 694
    .line 695
    move-wide v12, v10

    .line 696
    :try_start_8
    invoke-virtual {v0}, Lkn1;->α()J

    .line 697
    .line 698
    .line 699
    move-result-wide v10

    .line 700
    invoke-interface {v14, v1, v10, v11}, Lb00;->ι(Li5;J)Liw1;

    .line 701
    .line 702
    .line 703
    move-result-object v9

    .line 704
    new-instance v7, Lxz;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 705
    .line 706
    move-wide/from16 v18, v12

    .line 707
    .line 708
    const/4 v12, 0x0

    .line 709
    move-wide/from16 v2, v18

    .line 710
    .line 711
    :try_start_9
    invoke-direct/range {v7 .. v12}, Lxz;-><init>(Lzz;Liw1;JZ)V

    .line 712
    .line 713
    .line 714
    new-instance v9, Lqk1;

    .line 715
    .line 716
    invoke-direct {v9, v7}, Lqk1;-><init>(Liw1;)V

    .line 717
    .line 718
    .line 719
    iget-object v7, v0, Lkn1;->γ:[B

    .line 720
    .line 721
    iget v0, v0, Lkn1;->β:I

    .line 722
    .line 723
    iget-boolean v10, v9, Lqk1;->η:Z

    .line 724
    .line 725
    if-nez v10, :cond_16

    .line 726
    .line 727
    iget-object v10, v9, Lqk1;->ζ:Lsc;

    .line 728
    .line 729
    invoke-virtual {v10, v7, v0}, Lsc;->χ([BI)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v9}, Lqk1;->δ()Lzc;

    .line 733
    .line 734
    .line 735
    goto :goto_e

    .line 736
    :cond_16
    const-string v0, "closed"

    .line 737
    .line 738
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    :goto_e
    invoke-virtual {v9}, Lqk1;->close()V

    .line 742
    .line 743
    .line 744
    goto :goto_11

    .line 745
    :catch_2
    move-exception v0

    .line 746
    goto :goto_12

    .line 747
    :catch_3
    move-exception v0

    .line 748
    move-wide v2, v12

    .line 749
    goto :goto_12

    .line 750
    :catch_4
    move-exception v0

    .line 751
    goto :goto_c

    .line 752
    :cond_17
    move-wide v2, v10

    .line 753
    const/4 v11, 0x0

    .line 754
    const/4 v12, 0x0

    .line 755
    const/4 v13, 0x0

    .line 756
    const/4 v9, 0x1

    .line 757
    const/4 v10, 0x0

    .line 758
    invoke-virtual/range {v7 .. v13}, Luk1;->η(Lzz;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v8}, Lzz;->β()Lvk1;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    iget-object v0, v0, Lvk1;->ι:Ldg0;

    .line 766
    .line 767
    if-eqz v0, :cond_18

    .line 768
    .line 769
    const/4 v0, 0x1

    .line 770
    goto :goto_f

    .line 771
    :cond_18
    const/4 v0, 0x0

    .line 772
    :goto_f
    if-nez v0, :cond_1a

    .line 773
    .line 774
    invoke-interface {v14}, Lb00;->η()La00;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-interface {v0}, La00;->θ()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2

    .line 779
    .line 780
    .line 781
    goto :goto_11

    .line 782
    :catch_5
    move-exception v0

    .line 783
    move-wide v2, v10

    .line 784
    :goto_10
    const/16 v17, 0x0

    .line 785
    .line 786
    goto :goto_12

    .line 787
    :cond_19
    move-wide v2, v10

    .line 788
    const/4 v11, 0x0

    .line 789
    const/4 v12, 0x0

    .line 790
    const/4 v13, 0x0

    .line 791
    const/4 v9, 0x1

    .line 792
    const/4 v10, 0x0

    .line 793
    :try_start_a
    invoke-virtual/range {v7 .. v13}, Luk1;->η(Lzz;ZZZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 794
    .line 795
    .line 796
    const/16 v17, 0x0

    .line 797
    .line 798
    :cond_1a
    :goto_11
    :try_start_b
    invoke-interface {v14}, Lb00;->γ()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6

    .line 799
    .line 800
    .line 801
    const/4 v13, 0x0

    .line 802
    goto :goto_13

    .line 803
    :catch_6
    move-exception v0

    .line 804
    :try_start_c
    invoke-virtual {v8, v0}, Lzz;->δ(Ljava/io/IOException;)V

    .line 805
    .line 806
    .line 807
    throw v0
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2

    .line 808
    :catch_7
    move-exception v0

    .line 809
    goto :goto_10

    .line 810
    :catch_8
    move-exception v0

    .line 811
    move-wide v2, v10

    .line 812
    :try_start_d
    invoke-virtual {v8, v0}, Lzz;->δ(Ljava/io/IOException;)V

    .line 813
    .line 814
    .line 815
    throw v0
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    .line 816
    :goto_12
    instance-of v7, v0, Lno;

    .line 817
    .line 818
    if-nez v7, :cond_2e

    .line 819
    .line 820
    iget-boolean v7, v8, Lzz;->α:Z

    .line 821
    .line 822
    if-eqz v7, :cond_2d

    .line 823
    .line 824
    move-object v13, v0

    .line 825
    :goto_13
    if-nez v17, :cond_1b

    .line 826
    .line 827
    const/4 v10, 0x0

    .line 828
    :try_start_e
    invoke-virtual {v8, v10}, Lzz;->γ(Z)Lyn1;

    .line 829
    .line 830
    .line 831
    move-result-object v17

    .line 832
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    :cond_1b
    move-object/from16 v0, v17

    .line 836
    .line 837
    goto :goto_14

    .line 838
    :catch_9
    move-exception v0

    .line 839
    goto/16 :goto_1e

    .line 840
    .line 841
    :goto_14
    iput-object v1, v0, Lyn1;->α:Li5;

    .line 842
    .line 843
    invoke-virtual {v8}, Lzz;->β()Lvk1;

    .line 844
    .line 845
    .line 846
    move-result-object v7

    .line 847
    iget-object v7, v7, Lvk1;->ζ:Lqc0;

    .line 848
    .line 849
    iput-object v7, v0, Lyn1;->ε:Lqc0;

    .line 850
    .line 851
    iput-wide v2, v0, Lyn1;->μ:J

    .line 852
    .line 853
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 854
    .line 855
    .line 856
    move-result-wide v9

    .line 857
    iput-wide v9, v0, Lyn1;->ν:J

    .line 858
    .line 859
    invoke-virtual {v0}, Lyn1;->α()Lzn1;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    iget v7, v0, Lzn1;->θ:I
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_9

    .line 864
    .line 865
    :goto_15
    iget-object v9, v0, Lzn1;->κ:Lvc0;

    .line 866
    .line 867
    iget-object v10, v0, Lzn1;->λ:Lbo1;

    .line 868
    .line 869
    const/16 v11, 0x64

    .line 870
    .line 871
    if-ne v7, v11, :cond_1c

    .line 872
    .line 873
    :goto_16
    const/4 v11, 0x0

    .line 874
    goto :goto_17

    .line 875
    :cond_1c
    const/16 v11, 0x66

    .line 876
    .line 877
    if-gt v11, v7, :cond_1d

    .line 878
    .line 879
    const/16 v11, 0xc8

    .line 880
    .line 881
    if-ge v7, v11, :cond_1d

    .line 882
    .line 883
    goto :goto_16

    .line 884
    :goto_17
    :try_start_f
    invoke-virtual {v8, v11}, Lzz;->γ(Z)Lyn1;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    iput-object v1, v0, Lyn1;->α:Li5;

    .line 892
    .line 893
    invoke-virtual {v8}, Lzz;->β()Lvk1;

    .line 894
    .line 895
    .line 896
    move-result-object v7

    .line 897
    iget-object v7, v7, Lvk1;->ζ:Lqc0;

    .line 898
    .line 899
    iput-object v7, v0, Lyn1;->ε:Lqc0;

    .line 900
    .line 901
    iput-wide v2, v0, Lyn1;->μ:J

    .line 902
    .line 903
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 904
    .line 905
    .line 906
    move-result-wide v9

    .line 907
    iput-wide v9, v0, Lyn1;->ν:J

    .line 908
    .line 909
    invoke-virtual {v0}, Lyn1;->α()Lzn1;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    iget v7, v0, Lzn1;->θ:I

    .line 914
    .line 915
    goto :goto_15

    .line 916
    :cond_1d
    const/4 v11, 0x0

    .line 917
    const/16 v1, 0x65

    .line 918
    .line 919
    if-ne v7, v1, :cond_1e

    .line 920
    .line 921
    const/4 v1, 0x1

    .line 922
    goto :goto_18

    .line 923
    :cond_1e
    move v1, v11

    .line 924
    :goto_18
    if-eqz v1, :cond_21

    .line 925
    .line 926
    invoke-virtual {v8}, Lzz;->β()Lvk1;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    iget-object v2, v2, Lvk1;->ι:Ldg0;

    .line 931
    .line 932
    if-eqz v2, :cond_1f

    .line 933
    .line 934
    const/4 v2, 0x1

    .line 935
    goto :goto_19

    .line 936
    :cond_1f
    move v2, v11

    .line 937
    :goto_19
    if-nez v2, :cond_20

    .line 938
    .line 939
    goto :goto_1a

    .line 940
    :cond_20
    new-instance v0, Ljava/net/ProtocolException;

    .line 941
    .line 942
    const-string v1, "Unexpected 101 code on HTTP/2 connection"

    .line 943
    .line 944
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    throw v0

    .line 948
    :cond_21
    :goto_1a
    if-eqz v1, :cond_23

    .line 949
    .line 950
    invoke-virtual {v9, v6}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v1

    .line 954
    if-nez v1, :cond_22

    .line 955
    .line 956
    const/4 v1, 0x0

    .line 957
    :cond_22
    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 958
    .line 959
    .line 960
    move-result v1

    .line 961
    if-eqz v1, :cond_23

    .line 962
    .line 963
    const/4 v2, 0x1

    .line 964
    goto :goto_1b

    .line 965
    :cond_23
    move v2, v11

    .line 966
    :goto_1b
    if-eqz v15, :cond_24

    .line 967
    .line 968
    if-eqz v2, :cond_24

    .line 969
    .line 970
    invoke-virtual {v0}, Lzn1;->δ()Lyn1;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    new-instance v1, Lv62;

    .line 975
    .line 976
    invoke-virtual {v10}, Lbo1;->θ()Lez0;

    .line 977
    .line 978
    .line 979
    move-result-object v2

    .line 980
    invoke-virtual {v10}, Lbo1;->η()J

    .line 981
    .line 982
    .line 983
    move-result-wide v9

    .line 984
    invoke-direct {v1, v2, v9, v10}, Lv62;-><init>(Lez0;J)V

    .line 985
    .line 986
    .line 987
    iput-object v1, v0, Lyn1;->η:Lbo1;

    .line 988
    .line 989
    invoke-virtual {v8}, Lzz;->ε()Ln5;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    iput-object v1, v0, Lyn1;->θ:Llx1;

    .line 994
    .line 995
    invoke-virtual {v0}, Lyn1;->α()Lzn1;

    .line 996
    .line 997
    .line 998
    move-result-object v0
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9

    .line 999
    move v2, v7

    .line 1000
    goto :goto_1c

    .line 1001
    :cond_24
    :try_start_10
    const-string v1, "Content-Type"

    .line 1002
    .line 1003
    invoke-virtual {v9, v1}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    if-nez v1, :cond_25

    .line 1008
    .line 1009
    const/4 v1, 0x0

    .line 1010
    :cond_25
    invoke-interface {v14, v0}, Lb00;->θ(Lzn1;)J

    .line 1011
    .line 1012
    .line 1013
    move-result-wide v10

    .line 1014
    invoke-interface {v14, v0}, Lb00;->β(Lzn1;)Lrx1;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v9

    .line 1018
    move v2, v7

    .line 1019
    new-instance v7, Lyz;

    .line 1020
    .line 1021
    const/4 v12, 0x0

    .line 1022
    invoke-direct/range {v7 .. v12}, Lyz;-><init>(Lzz;Lrx1;JZ)V

    .line 1023
    .line 1024
    .line 1025
    new-instance v3, Lzk1;

    .line 1026
    .line 1027
    new-instance v5, Lrk1;

    .line 1028
    .line 1029
    invoke-direct {v5, v7}, Lrk1;-><init>(Lrx1;)V

    .line 1030
    .line 1031
    .line 1032
    invoke-direct {v3, v1, v10, v11, v5}, Lzk1;-><init>(Ljava/lang/String;JLrk1;)V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_a

    .line 1033
    .line 1034
    .line 1035
    :try_start_11
    invoke-virtual {v0}, Lzn1;->δ()Lyn1;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    iput-object v3, v0, Lyn1;->η:Lbo1;

    .line 1040
    .line 1041
    new-instance v1, Li2;

    .line 1042
    .line 1043
    const/16 v3, 0xa

    .line 1044
    .line 1045
    invoke-direct {v1, v3}, Li2;-><init>(I)V

    .line 1046
    .line 1047
    .line 1048
    iput-object v1, v0, Lyn1;->ο:Lp52;

    .line 1049
    .line 1050
    invoke-virtual {v0}, Lyn1;->α()Lzn1;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    :goto_1c
    iget-object v1, v0, Lzn1;->ε:Li5;

    .line 1055
    .line 1056
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1057
    .line 1058
    .line 1059
    iget-object v1, v1, Li5;->δ:Ljava/lang/Object;

    .line 1060
    .line 1061
    check-cast v1, Lvc0;

    .line 1062
    .line 1063
    invoke-virtual {v1, v6}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v1

    .line 1071
    if-nez v1, :cond_27

    .line 1072
    .line 1073
    iget-object v1, v0, Lzn1;->κ:Lvc0;

    .line 1074
    .line 1075
    invoke-virtual {v1, v6}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v1

    .line 1079
    if-nez v1, :cond_26

    .line 1080
    .line 1081
    const/4 v3, 0x0

    .line 1082
    goto :goto_1d

    .line 1083
    :cond_26
    move-object v3, v1

    .line 1084
    :goto_1d
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1085
    .line 1086
    .line 1087
    move-result v1

    .line 1088
    if-eqz v1, :cond_28

    .line 1089
    .line 1090
    :cond_27
    invoke-interface {v14}, Lb00;->η()La00;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    invoke-interface {v1}, La00;->θ()V

    .line 1095
    .line 1096
    .line 1097
    :cond_28
    const/16 v1, 0xcc

    .line 1098
    .line 1099
    if-eq v2, v1, :cond_29

    .line 1100
    .line 1101
    const/16 v1, 0xcd

    .line 1102
    .line 1103
    if-ne v2, v1, :cond_2a

    .line 1104
    .line 1105
    :cond_29
    iget-object v1, v0, Lzn1;->λ:Lbo1;

    .line 1106
    .line 1107
    invoke-virtual {v1}, Lbo1;->η()J

    .line 1108
    .line 1109
    .line 1110
    move-result-wide v3

    .line 1111
    const-wide/16 v5, 0x0

    .line 1112
    .line 1113
    cmp-long v1, v3, v5

    .line 1114
    .line 1115
    if-gtz v1, :cond_2b

    .line 1116
    .line 1117
    :cond_2a
    return-object v0

    .line 1118
    :cond_2b
    new-instance v1, Ljava/net/ProtocolException;

    .line 1119
    .line 1120
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1121
    .line 1122
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1123
    .line 1124
    .line 1125
    const-string v4, "HTTP "

    .line 1126
    .line 1127
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1131
    .line 1132
    .line 1133
    const-string v2, " had non-zero Content-Length: "

    .line 1134
    .line 1135
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1136
    .line 1137
    .line 1138
    iget-object v0, v0, Lzn1;->λ:Lbo1;

    .line 1139
    .line 1140
    invoke-virtual {v0}, Lbo1;->η()J

    .line 1141
    .line 1142
    .line 1143
    move-result-wide v4

    .line 1144
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 1152
    .line 1153
    .line 1154
    throw v1

    .line 1155
    :catch_a
    move-exception v0

    .line 1156
    invoke-virtual {v8, v0}, Lzz;->δ(Ljava/io/IOException;)V

    .line 1157
    .line 1158
    .line 1159
    throw v0
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9

    .line 1160
    :goto_1e
    if-eqz v13, :cond_2c

    .line 1161
    .line 1162
    invoke-static {v13, v0}, Lln0;->η(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 1163
    .line 1164
    .line 1165
    throw v13

    .line 1166
    :cond_2c
    throw v0

    .line 1167
    :cond_2d
    throw v0

    .line 1168
    :cond_2e
    throw v0

    .line 1169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
