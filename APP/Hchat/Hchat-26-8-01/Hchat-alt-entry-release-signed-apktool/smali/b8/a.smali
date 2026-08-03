.class public final Lb8/a;
.super Lc8/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e0:Ljava/io/StringReader;


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb8/a;->e0:Ljava/io/StringReader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lb8/a;->e0:Ljava/io/StringReader;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final z()I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lb8/a;->e0:Ljava/io/StringReader;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-object v1, v0, Lc8/b;->n:Ljava/io/StringReader;

    .line 10
    .line 11
    if-eqz v1, :cond_39

    .line 12
    .line 13
    iget v1, v0, Lc8/b;->u:I

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    if-ne v1, v3, :cond_1

    .line 17
    .line 18
    iget v1, v0, Lc8/b;->j:I

    .line 19
    .line 20
    sub-int/2addr v1, v2

    .line 21
    iput v1, v0, Lc8/b;->j:I

    .line 22
    .line 23
    :cond_1
    iget-boolean v1, v0, Lc8/b;->A:Z

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iput-boolean v4, v0, Lc8/b;->A:Z

    .line 29
    .line 30
    iput v3, v0, Lc8/b;->u:I

    .line 31
    .line 32
    goto/16 :goto_18

    .line 33
    .line 34
    :cond_2
    iget-object v1, v0, Lc8/b;->E:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    iput-object v5, v0, Lc8/b;->E:Ljava/lang/String;

    .line 40
    .line 41
    :cond_3
    invoke-virtual {v0, v4}, Lc8/b;->l(Z)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iput v1, v0, Lc8/b;->u:I

    .line 46
    .line 47
    const/16 v6, 0x3e6

    .line 48
    .line 49
    sget-object v7, Lc8/b;->M:[C

    .line 50
    .line 51
    const/4 v8, 0x2

    .line 52
    const/4 v9, 0x6

    .line 53
    const/4 v10, 0x7

    .line 54
    if-ne v1, v6, :cond_d

    .line 55
    .line 56
    iget v1, v0, Lc8/b;->s:I

    .line 57
    .line 58
    if-nez v1, :cond_4

    .line 59
    .line 60
    iget v1, v0, Lc8/b;->t:I

    .line 61
    .line 62
    if-nez v1, :cond_4

    .line 63
    .line 64
    iget v1, v0, Lc8/b;->q:I

    .line 65
    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    :cond_4
    const-string v1, "processing instructions must not start with xml"

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lc8/b;->a(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {v0, v7}, Lc8/b;->o([C)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v2, v2}, Lc8/b;->i(ZZ)V

    .line 77
    .line 78
    .line 79
    iget v1, v0, Lc8/b;->B:I

    .line 80
    .line 81
    if-lt v1, v2, :cond_6

    .line 82
    .line 83
    iget-object v1, v0, Lc8/b;->D:[Ljava/lang/String;

    .line 84
    .line 85
    aget-object v1, v1, v8

    .line 86
    .line 87
    const-string v6, "version"

    .line 88
    .line 89
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_7

    .line 94
    .line 95
    :cond_6
    const-string v1, "version expected"

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lc8/b;->a(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_7
    iget-object v1, v0, Lc8/b;->D:[Ljava/lang/String;

    .line 101
    .line 102
    aget-object v6, v1, v3

    .line 103
    .line 104
    iget v6, v0, Lc8/b;->B:I

    .line 105
    .line 106
    if-ge v2, v6, :cond_8

    .line 107
    .line 108
    const-string v6, "encoding"

    .line 109
    .line 110
    aget-object v1, v1, v9

    .line 111
    .line 112
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    iget-object v1, v0, Lc8/b;->D:[Ljava/lang/String;

    .line 119
    .line 120
    aget-object v1, v1, v10

    .line 121
    .line 122
    move v1, v8

    .line 123
    goto :goto_0

    .line 124
    :cond_8
    move v1, v2

    .line 125
    :goto_0
    iget v6, v0, Lc8/b;->B:I

    .line 126
    .line 127
    if-ge v1, v6, :cond_b

    .line 128
    .line 129
    iget-object v6, v0, Lc8/b;->D:[Ljava/lang/String;

    .line 130
    .line 131
    mul-int/lit8 v11, v1, 0x4

    .line 132
    .line 133
    add-int/lit8 v12, v11, 0x2

    .line 134
    .line 135
    aget-object v6, v6, v12

    .line 136
    .line 137
    const-string v12, "standalone"

    .line 138
    .line 139
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_b

    .line 144
    .line 145
    iget-object v6, v0, Lc8/b;->D:[Ljava/lang/String;

    .line 146
    .line 147
    add-int/2addr v11, v3

    .line 148
    aget-object v6, v6, v11

    .line 149
    .line 150
    const-string v11, "yes"

    .line 151
    .line 152
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    if-eqz v11, :cond_9

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_9
    const-string v11, "no"

    .line 160
    .line 161
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v11

    .line 165
    if-eqz v11, :cond_a

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_a
    new-instance v11, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v12, "illegal standalone value: "

    .line 171
    .line 172
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-virtual {v0, v6}, Lc8/b;->a(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 186
    .line 187
    :cond_b
    iget v6, v0, Lc8/b;->B:I

    .line 188
    .line 189
    if-eq v1, v6, :cond_c

    .line 190
    .line 191
    const-string v1, "unexpected attributes in XML declaration"

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Lc8/b;->a(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :cond_c
    iput-boolean v2, v0, Lc8/b;->v:Z

    .line 197
    .line 198
    iput-object v5, v0, Lc8/b;->z:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v0, v4}, Lc8/b;->l(Z)I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    iput v1, v0, Lc8/b;->u:I

    .line 205
    .line 206
    :cond_d
    iput-object v5, v0, Lc8/b;->z:Ljava/lang/String;

    .line 207
    .line 208
    iput-boolean v2, v0, Lc8/b;->v:Z

    .line 209
    .line 210
    iput-object v5, v0, Lc8/b;->x:Ljava/lang/String;

    .line 211
    .line 212
    iput-object v5, v0, Lc8/b;->y:Ljava/lang/String;

    .line 213
    .line 214
    iput-object v5, v0, Lc8/b;->w:Ljava/lang/String;

    .line 215
    .line 216
    const/4 v1, -0x1

    .line 217
    iput v1, v0, Lc8/b;->B:I

    .line 218
    .line 219
    :goto_2
    iget v6, v0, Lc8/b;->u:I

    .line 220
    .line 221
    sget-object v11, Lc8/b;->N:[C

    .line 222
    .line 223
    const-string v12, "Unexpected token"

    .line 224
    .line 225
    const/16 v13, 0x3e

    .line 226
    .line 227
    const/16 v14, 0x3c

    .line 228
    .line 229
    packed-switch v6, :pswitch_data_0

    .line 230
    .line 231
    .line 232
    :pswitch_0
    new-instance v1, Laf/e;

    .line 233
    .line 234
    invoke-direct {v1, v12, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 235
    .line 236
    .line 237
    throw v1

    .line 238
    :pswitch_1
    sget-object v6, Lc8/b;->O:[C

    .line 239
    .line 240
    invoke-virtual {v0, v6}, Lc8/b;->o([C)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Lc8/b;->t()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v2, v2}, Lc8/b;->s(ZZ)Z

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    const/16 v14, 0x5b

    .line 260
    .line 261
    if-ne v6, v14, :cond_e

    .line 262
    .line 263
    invoke-virtual {v0, v14}, Lc8/b;->m(C)V

    .line 264
    .line 265
    .line 266
    :goto_3
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    const/16 v14, 0x5d

    .line 274
    .line 275
    if-ne v6, v14, :cond_f

    .line 276
    .line 277
    iget v6, v0, Lc8/b;->q:I

    .line 278
    .line 279
    add-int/2addr v6, v2

    .line 280
    iput v6, v0, Lc8/b;->q:I

    .line 281
    .line 282
    :cond_e
    move v5, v1

    .line 283
    move v4, v3

    .line 284
    goto/16 :goto_11

    .line 285
    .line 286
    :cond_f
    invoke-virtual {v0, v2}, Lc8/b;->l(Z)I

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    const/16 v14, 0x27

    .line 291
    .line 292
    const/16 v5, 0x22

    .line 293
    .line 294
    const/16 v15, 0x29

    .line 295
    .line 296
    const/16 v9, 0x28

    .line 297
    .line 298
    packed-switch v6, :pswitch_data_1

    .line 299
    .line 300
    .line 301
    :pswitch_2
    new-instance v1, Laf/e;

    .line 302
    .line 303
    invoke-direct {v1, v12, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 304
    .line 305
    .line 306
    throw v1

    .line 307
    :pswitch_3
    new-instance v1, Laf/e;

    .line 308
    .line 309
    const-string v2, "Parameter entity references are not supported"

    .line 310
    .line 311
    invoke-direct {v1, v2, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 312
    .line 313
    .line 314
    throw v1

    .line 315
    :pswitch_4
    sget-object v5, Lc8/b;->U:[C

    .line 316
    .line 317
    invoke-virtual {v0, v5}, Lc8/b;->o([C)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0}, Lc8/b;->t()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v4, v4}, Lc8/b;->s(ZZ)Z

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    if-eqz v5, :cond_10

    .line 331
    .line 332
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v13}, Lc8/b;->m(C)V

    .line 336
    .line 337
    .line 338
    :goto_4
    move v5, v1

    .line 339
    move v4, v3

    .line 340
    goto/16 :goto_10

    .line 341
    .line 342
    :cond_10
    new-instance v1, Laf/e;

    .line 343
    .line 344
    const-string v2, "Expected external ID or public ID for notation"

    .line 345
    .line 346
    invoke-direct {v1, v2, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 347
    .line 348
    .line 349
    throw v1

    .line 350
    :pswitch_5
    sget-object v6, Lc8/b;->S:[C

    .line 351
    .line 352
    invoke-virtual {v0, v6}, Lc8/b;->o([C)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Lc8/b;->t()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    :goto_5
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 366
    .line 367
    .line 368
    move-result v10

    .line 369
    if-ne v10, v13, :cond_11

    .line 370
    .line 371
    iget v5, v0, Lc8/b;->q:I

    .line 372
    .line 373
    add-int/2addr v5, v2

    .line 374
    iput v5, v0, Lc8/b;->q:I

    .line 375
    .line 376
    goto :goto_4

    .line 377
    :cond_11
    invoke-virtual {v0}, Lc8/b;->t()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v10

    .line 381
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 382
    .line 383
    .line 384
    iget v1, v0, Lc8/b;->q:I

    .line 385
    .line 386
    add-int/2addr v1, v2

    .line 387
    iget v13, v0, Lc8/b;->r:I

    .line 388
    .line 389
    if-lt v1, v13, :cond_13

    .line 390
    .line 391
    invoke-virtual {v0, v8}, Lc8/b;->c(I)Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_12

    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_12
    new-instance v1, Laf/e;

    .line 399
    .line 400
    const-string v2, "Malformed attribute list"

    .line 401
    .line 402
    invoke-direct {v1, v2, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 403
    .line 404
    .line 405
    throw v1

    .line 406
    :cond_13
    :goto_6
    iget-object v1, v0, Lc8/b;->p:[C

    .line 407
    .line 408
    iget v13, v0, Lc8/b;->q:I

    .line 409
    .line 410
    aget-char v8, v1, v13

    .line 411
    .line 412
    sget-object v3, Lc8/b;->Y:[C

    .line 413
    .line 414
    move/from16 v18, v4

    .line 415
    .line 416
    aget-char v4, v3, v18

    .line 417
    .line 418
    if-ne v8, v4, :cond_14

    .line 419
    .line 420
    add-int/lit8 v13, v13, 0x1

    .line 421
    .line 422
    aget-char v1, v1, v13

    .line 423
    .line 424
    aget-char v4, v3, v2

    .line 425
    .line 426
    if-ne v1, v4, :cond_14

    .line 427
    .line 428
    invoke-virtual {v0, v3}, Lc8/b;->o([C)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 432
    .line 433
    .line 434
    :cond_14
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    const-string v3, "Malformed attribute type"

    .line 439
    .line 440
    if-ne v1, v9, :cond_17

    .line 441
    .line 442
    iget v1, v0, Lc8/b;->q:I

    .line 443
    .line 444
    add-int/2addr v1, v2

    .line 445
    iput v1, v0, Lc8/b;->q:I

    .line 446
    .line 447
    :goto_7
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Lc8/b;->t()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    if-ne v1, v15, :cond_15

    .line 461
    .line 462
    iget v1, v0, Lc8/b;->q:I

    .line 463
    .line 464
    add-int/2addr v1, v2

    .line 465
    iput v1, v0, Lc8/b;->q:I

    .line 466
    .line 467
    goto :goto_8

    .line 468
    :cond_15
    const/16 v4, 0x7c

    .line 469
    .line 470
    if-ne v1, v4, :cond_16

    .line 471
    .line 472
    iget v1, v0, Lc8/b;->q:I

    .line 473
    .line 474
    add-int/2addr v1, v2

    .line 475
    iput v1, v0, Lc8/b;->q:I

    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_16
    new-instance v1, Laf/e;

    .line 479
    .line 480
    invoke-direct {v1, v3, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 481
    .line 482
    .line 483
    throw v1

    .line 484
    :cond_17
    invoke-virtual {v0}, Lc8/b;->t()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    :goto_8
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    const/16 v4, 0x23

    .line 495
    .line 496
    if-ne v1, v4, :cond_1b

    .line 497
    .line 498
    iget v1, v0, Lc8/b;->q:I

    .line 499
    .line 500
    add-int/2addr v1, v2

    .line 501
    iput v1, v0, Lc8/b;->q:I

    .line 502
    .line 503
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    const/16 v4, 0x52

    .line 508
    .line 509
    if-ne v1, v4, :cond_18

    .line 510
    .line 511
    sget-object v1, Lc8/b;->Z:[C

    .line 512
    .line 513
    invoke-virtual {v0, v1}, Lc8/b;->o([C)V

    .line 514
    .line 515
    .line 516
    goto :goto_9

    .line 517
    :cond_18
    const/16 v4, 0x49

    .line 518
    .line 519
    if-ne v1, v4, :cond_19

    .line 520
    .line 521
    sget-object v1, Lc8/b;->a0:[C

    .line 522
    .line 523
    invoke-virtual {v0, v1}, Lc8/b;->o([C)V

    .line 524
    .line 525
    .line 526
    goto :goto_9

    .line 527
    :cond_19
    const/16 v4, 0x46

    .line 528
    .line 529
    if-ne v1, v4, :cond_1a

    .line 530
    .line 531
    sget-object v1, Lc8/b;->b0:[C

    .line 532
    .line 533
    invoke-virtual {v0, v1}, Lc8/b;->o([C)V

    .line 534
    .line 535
    .line 536
    :goto_9
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    goto :goto_a

    .line 544
    :cond_1a
    new-instance v1, Laf/e;

    .line 545
    .line 546
    invoke-direct {v1, v3, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 547
    .line 548
    .line 549
    throw v1

    .line 550
    :cond_1b
    :goto_a
    if-eq v1, v5, :cond_1c

    .line 551
    .line 552
    if-ne v1, v14, :cond_20

    .line 553
    .line 554
    :cond_1c
    iget v3, v0, Lc8/b;->q:I

    .line 555
    .line 556
    add-int/2addr v3, v2

    .line 557
    iput v3, v0, Lc8/b;->q:I

    .line 558
    .line 559
    int-to-char v3, v1

    .line 560
    invoke-virtual {v0, v3, v2, v2, v2}, Lc8/b;->x(CZZI)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    if-ne v4, v1, :cond_1d

    .line 569
    .line 570
    iget v1, v0, Lc8/b;->q:I

    .line 571
    .line 572
    add-int/2addr v1, v2

    .line 573
    iput v1, v0, Lc8/b;->q:I

    .line 574
    .line 575
    :cond_1d
    iget-object v1, v0, Lc8/b;->i:Ljava/util/HashMap;

    .line 576
    .line 577
    if-nez v1, :cond_1e

    .line 578
    .line 579
    new-instance v1, Ljava/util/HashMap;

    .line 580
    .line 581
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 582
    .line 583
    .line 584
    iput-object v1, v0, Lc8/b;->i:Ljava/util/HashMap;

    .line 585
    .line 586
    :cond_1e
    iget-object v1, v0, Lc8/b;->i:Ljava/util/HashMap;

    .line 587
    .line 588
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    check-cast v1, Ljava/util/Map;

    .line 593
    .line 594
    if-nez v1, :cond_1f

    .line 595
    .line 596
    new-instance v1, Ljava/util/HashMap;

    .line 597
    .line 598
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 599
    .line 600
    .line 601
    iget-object v4, v0, Lc8/b;->i:Ljava/util/HashMap;

    .line 602
    .line 603
    invoke-virtual {v4, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    :cond_1f
    invoke-interface {v1, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    :cond_20
    move/from16 v4, v18

    .line 610
    .line 611
    const/4 v1, -0x1

    .line 612
    const/4 v3, 0x3

    .line 613
    const/4 v8, 0x2

    .line 614
    const/4 v10, 0x7

    .line 615
    const/16 v13, 0x3e

    .line 616
    .line 617
    goto/16 :goto_5

    .line 618
    .line 619
    :pswitch_6
    move/from16 v18, v4

    .line 620
    .line 621
    sget-object v1, Lc8/b;->T:[C

    .line 622
    .line 623
    invoke-virtual {v0, v1}, Lc8/b;->o([C)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 630
    .line 631
    .line 632
    move-result v1

    .line 633
    const/16 v3, 0x25

    .line 634
    .line 635
    if-ne v1, v3, :cond_21

    .line 636
    .line 637
    iget v1, v0, Lc8/b;->q:I

    .line 638
    .line 639
    add-int/2addr v1, v2

    .line 640
    iput v1, v0, Lc8/b;->q:I

    .line 641
    .line 642
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 643
    .line 644
    .line 645
    :cond_21
    invoke-virtual {v0}, Lc8/b;->t()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 652
    .line 653
    .line 654
    move-result v1

    .line 655
    if-eq v1, v5, :cond_25

    .line 656
    .line 657
    if-ne v1, v14, :cond_22

    .line 658
    .line 659
    goto :goto_b

    .line 660
    :cond_22
    move/from16 v3, v18

    .line 661
    .line 662
    invoke-virtual {v0, v2, v3}, Lc8/b;->s(ZZ)Z

    .line 663
    .line 664
    .line 665
    move-result v1

    .line 666
    if-eqz v1, :cond_24

    .line 667
    .line 668
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 672
    .line 673
    .line 674
    move-result v1

    .line 675
    sget-object v4, Lc8/b;->X:[C

    .line 676
    .line 677
    aget-char v5, v4, v3

    .line 678
    .line 679
    if-ne v1, v5, :cond_23

    .line 680
    .line 681
    invoke-virtual {v0, v4}, Lc8/b;->o([C)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0}, Lc8/b;->t()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    :cond_23
    const/4 v4, 0x3

    .line 691
    goto :goto_c

    .line 692
    :cond_24
    new-instance v1, Laf/e;

    .line 693
    .line 694
    const-string v2, "Expected entity value or external ID"

    .line 695
    .line 696
    invoke-direct {v1, v2, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 697
    .line 698
    .line 699
    throw v1

    .line 700
    :cond_25
    :goto_b
    iget v3, v0, Lc8/b;->q:I

    .line 701
    .line 702
    add-int/2addr v3, v2

    .line 703
    iput v3, v0, Lc8/b;->q:I

    .line 704
    .line 705
    int-to-char v3, v1

    .line 706
    const/4 v4, 0x3

    .line 707
    const/4 v5, 0x0

    .line 708
    invoke-virtual {v0, v3, v2, v5, v4}, Lc8/b;->x(CZZI)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    if-ne v3, v1, :cond_26

    .line 716
    .line 717
    iget v1, v0, Lc8/b;->q:I

    .line 718
    .line 719
    add-int/2addr v1, v2

    .line 720
    iput v1, v0, Lc8/b;->q:I

    .line 721
    .line 722
    :cond_26
    :goto_c
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 723
    .line 724
    .line 725
    const/16 v1, 0x3e

    .line 726
    .line 727
    invoke-virtual {v0, v1}, Lc8/b;->m(C)V

    .line 728
    .line 729
    .line 730
    const/4 v5, -0x1

    .line 731
    goto/16 :goto_10

    .line 732
    .line 733
    :pswitch_7
    move v4, v3

    .line 734
    sget-object v1, Lc8/b;->R:[C

    .line 735
    .line 736
    invoke-virtual {v0, v1}, Lc8/b;->o([C)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v0}, Lc8/b;->t()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 749
    .line 750
    .line 751
    move-result v1

    .line 752
    if-ne v1, v9, :cond_2c

    .line 753
    .line 754
    const/4 v3, 0x0

    .line 755
    :cond_27
    if-ne v1, v9, :cond_28

    .line 756
    .line 757
    add-int/lit8 v3, v3, 0x1

    .line 758
    .line 759
    :goto_d
    const/4 v5, -0x1

    .line 760
    goto :goto_e

    .line 761
    :cond_28
    if-ne v1, v15, :cond_29

    .line 762
    .line 763
    add-int/lit8 v3, v3, -0x1

    .line 764
    .line 765
    goto :goto_d

    .line 766
    :cond_29
    const/4 v5, -0x1

    .line 767
    if-eq v1, v5, :cond_2b

    .line 768
    .line 769
    :goto_e
    iget v1, v0, Lc8/b;->q:I

    .line 770
    .line 771
    add-int/2addr v1, v2

    .line 772
    iput v1, v0, Lc8/b;->q:I

    .line 773
    .line 774
    invoke-virtual {v0}, Lc8/b;->k()I

    .line 775
    .line 776
    .line 777
    move-result v1

    .line 778
    if-gtz v3, :cond_27

    .line 779
    .line 780
    const/16 v3, 0x2a

    .line 781
    .line 782
    if-eq v1, v3, :cond_2a

    .line 783
    .line 784
    const/16 v3, 0x3f

    .line 785
    .line 786
    if-eq v1, v3, :cond_2a

    .line 787
    .line 788
    const/16 v3, 0x2b

    .line 789
    .line 790
    if-ne v1, v3, :cond_2e

    .line 791
    .line 792
    :cond_2a
    iget v1, v0, Lc8/b;->q:I

    .line 793
    .line 794
    add-int/2addr v1, v2

    .line 795
    iput v1, v0, Lc8/b;->q:I

    .line 796
    .line 797
    goto :goto_f

    .line 798
    :cond_2b
    new-instance v1, Laf/e;

    .line 799
    .line 800
    const-string v2, "Unterminated element content spec"

    .line 801
    .line 802
    invoke-direct {v1, v2, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 803
    .line 804
    .line 805
    throw v1

    .line 806
    :cond_2c
    const/4 v5, -0x1

    .line 807
    sget-object v3, Lc8/b;->V:[C

    .line 808
    .line 809
    const/16 v18, 0x0

    .line 810
    .line 811
    aget-char v6, v3, v18

    .line 812
    .line 813
    if-ne v1, v6, :cond_2d

    .line 814
    .line 815
    invoke-virtual {v0, v3}, Lc8/b;->o([C)V

    .line 816
    .line 817
    .line 818
    goto :goto_f

    .line 819
    :cond_2d
    sget-object v3, Lc8/b;->W:[C

    .line 820
    .line 821
    aget-char v6, v3, v18

    .line 822
    .line 823
    if-ne v1, v6, :cond_2f

    .line 824
    .line 825
    invoke-virtual {v0, v3}, Lc8/b;->o([C)V

    .line 826
    .line 827
    .line 828
    :cond_2e
    :goto_f
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 829
    .line 830
    .line 831
    const/16 v1, 0x3e

    .line 832
    .line 833
    invoke-virtual {v0, v1}, Lc8/b;->m(C)V

    .line 834
    .line 835
    .line 836
    goto :goto_10

    .line 837
    :cond_2f
    new-instance v1, Laf/e;

    .line 838
    .line 839
    const-string v2, "Expected element content spec"

    .line 840
    .line 841
    invoke-direct {v1, v2, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 842
    .line 843
    .line 844
    throw v1

    .line 845
    :pswitch_8
    move v5, v1

    .line 846
    move v4, v3

    .line 847
    invoke-virtual {v0}, Lc8/b;->q()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    goto :goto_10

    .line 851
    :pswitch_9
    move v5, v1

    .line 852
    move v4, v3

    .line 853
    invoke-virtual {v0, v7}, Lc8/b;->o([C)V

    .line 854
    .line 855
    .line 856
    const/4 v3, 0x0

    .line 857
    invoke-virtual {v0, v11, v3}, Lc8/b;->w([CZ)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    :goto_10
    move v3, v4

    .line 861
    move v1, v5

    .line 862
    const/4 v4, 0x0

    .line 863
    const/4 v5, 0x0

    .line 864
    const/4 v8, 0x2

    .line 865
    const/4 v9, 0x6

    .line 866
    const/4 v10, 0x7

    .line 867
    const/16 v13, 0x3e

    .line 868
    .line 869
    goto/16 :goto_3

    .line 870
    .line 871
    :goto_11
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 872
    .line 873
    .line 874
    const/16 v1, 0x3e

    .line 875
    .line 876
    invoke-virtual {v0, v1}, Lc8/b;->m(C)V

    .line 877
    .line 878
    .line 879
    iget-boolean v1, v0, Lc8/b;->C:Z

    .line 880
    .line 881
    if-nez v1, :cond_30

    .line 882
    .line 883
    goto :goto_13

    .line 884
    :cond_30
    new-instance v1, Laf/e;

    .line 885
    .line 886
    invoke-direct {v1, v12, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 887
    .line 888
    .line 889
    throw v1

    .line 890
    :pswitch_a
    move v5, v1

    .line 891
    move v4, v3

    .line 892
    invoke-virtual {v0}, Lc8/b;->q()Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    goto :goto_13

    .line 896
    :pswitch_b
    move v5, v1

    .line 897
    move v4, v3

    .line 898
    invoke-virtual {v0, v7}, Lc8/b;->o([C)V

    .line 899
    .line 900
    .line 901
    const/4 v3, 0x0

    .line 902
    invoke-virtual {v0, v11, v3}, Lc8/b;->w([CZ)Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    goto :goto_13

    .line 906
    :pswitch_c
    move v5, v1

    .line 907
    move v4, v3

    .line 908
    move v1, v8

    .line 909
    goto :goto_12

    .line 910
    :pswitch_d
    move v5, v1

    .line 911
    move v4, v3

    .line 912
    sget-object v1, Lc8/b;->K:[C

    .line 913
    .line 914
    invoke-virtual {v0, v1}, Lc8/b;->o([C)V

    .line 915
    .line 916
    .line 917
    sget-object v1, Lc8/b;->L:[C

    .line 918
    .line 919
    invoke-virtual {v0, v1, v2}, Lc8/b;->w([CZ)Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    iput-object v1, v0, Lc8/b;->z:Ljava/lang/String;

    .line 924
    .line 925
    goto :goto_13

    .line 926
    :goto_12
    invoke-virtual {v0, v14, v2, v2, v1}, Lc8/b;->x(CZZI)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v3

    .line 930
    iput-object v3, v0, Lc8/b;->z:Ljava/lang/String;

    .line 931
    .line 932
    iget v1, v0, Lc8/b;->j:I

    .line 933
    .line 934
    if-nez v1, :cond_31

    .line 935
    .line 936
    iget-boolean v1, v0, Lc8/b;->v:Z

    .line 937
    .line 938
    if-eqz v1, :cond_31

    .line 939
    .line 940
    const/4 v1, 0x7

    .line 941
    iput v1, v0, Lc8/b;->u:I

    .line 942
    .line 943
    :cond_31
    :goto_13
    iget v1, v0, Lc8/b;->j:I

    .line 944
    .line 945
    if-nez v1, :cond_33

    .line 946
    .line 947
    iget v1, v0, Lc8/b;->u:I

    .line 948
    .line 949
    const/4 v3, 0x6

    .line 950
    if-eq v1, v3, :cond_32

    .line 951
    .line 952
    const/4 v6, 0x4

    .line 953
    if-eq v1, v6, :cond_32

    .line 954
    .line 955
    const/4 v6, 0x5

    .line 956
    if-eq v1, v6, :cond_32

    .line 957
    .line 958
    goto :goto_14

    .line 959
    :cond_32
    new-instance v1, Laf/e;

    .line 960
    .line 961
    invoke-direct {v1, v12, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 962
    .line 963
    .line 964
    throw v1

    .line 965
    :cond_33
    const/4 v3, 0x6

    .line 966
    :goto_14
    iget v1, v0, Lc8/b;->u:I

    .line 967
    .line 968
    const/4 v6, 0x7

    .line 969
    if-ne v1, v6, :cond_34

    .line 970
    .line 971
    const/4 v1, 0x0

    .line 972
    iput-object v1, v0, Lc8/b;->z:Ljava/lang/String;

    .line 973
    .line 974
    :goto_15
    const/4 v8, 0x0

    .line 975
    goto :goto_16

    .line 976
    :cond_34
    const/4 v1, 0x0

    .line 977
    goto :goto_15

    .line 978
    :goto_16
    invoke-virtual {v0, v8}, Lc8/b;->l(Z)I

    .line 979
    .line 980
    .line 981
    move-result v9

    .line 982
    iget-object v8, v0, Lc8/b;->z:Ljava/lang/String;

    .line 983
    .line 984
    if-eqz v8, :cond_35

    .line 985
    .line 986
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 987
    .line 988
    .line 989
    move-result v8

    .line 990
    if-nez v8, :cond_35

    .line 991
    .line 992
    const/4 v8, 0x4

    .line 993
    if-ge v9, v8, :cond_35

    .line 994
    .line 995
    iput v8, v0, Lc8/b;->u:I

    .line 996
    .line 997
    const/4 v3, 0x4

    .line 998
    goto/16 :goto_18

    .line 999
    .line 1000
    :cond_35
    iput v9, v0, Lc8/b;->u:I

    .line 1001
    .line 1002
    move v8, v5

    .line 1003
    move-object v5, v1

    .line 1004
    move v1, v8

    .line 1005
    move v9, v3

    .line 1006
    move v3, v4

    .line 1007
    move v10, v6

    .line 1008
    const/4 v4, 0x0

    .line 1009
    const/4 v8, 0x2

    .line 1010
    goto/16 :goto_2

    .line 1011
    .line 1012
    :pswitch_e
    invoke-virtual {v0, v14}, Lc8/b;->m(C)V

    .line 1013
    .line 1014
    .line 1015
    const/16 v1, 0x2f

    .line 1016
    .line 1017
    invoke-virtual {v0, v1}, Lc8/b;->m(C)V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v0}, Lc8/b;->t()Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    iput-object v1, v0, Lc8/b;->y:Ljava/lang/String;

    .line 1025
    .line 1026
    invoke-virtual {v0}, Lc8/b;->y()V

    .line 1027
    .line 1028
    .line 1029
    const/16 v1, 0x3e

    .line 1030
    .line 1031
    invoke-virtual {v0, v1}, Lc8/b;->m(C)V

    .line 1032
    .line 1033
    .line 1034
    iget v1, v0, Lc8/b;->j:I

    .line 1035
    .line 1036
    add-int/lit8 v3, v1, -0x1

    .line 1037
    .line 1038
    const/16 v16, 0x4

    .line 1039
    .line 1040
    mul-int/lit8 v3, v3, 0x4

    .line 1041
    .line 1042
    iget-object v4, v0, Lc8/b;->y:Ljava/lang/String;

    .line 1043
    .line 1044
    if-nez v1, :cond_36

    .line 1045
    .line 1046
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1047
    .line 1048
    const-string v3, "read end tag "

    .line 1049
    .line 1050
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    .line 1056
    const-string v3, " with no tags open"

    .line 1057
    .line 1058
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    invoke-virtual {v0, v1}, Lc8/b;->a(Ljava/lang/String;)V

    .line 1066
    .line 1067
    .line 1068
    const/16 v1, 0x9

    .line 1069
    .line 1070
    iput v1, v0, Lc8/b;->u:I

    .line 1071
    .line 1072
    goto :goto_17

    .line 1073
    :cond_36
    iget-object v1, v0, Lc8/b;->k:[Ljava/lang/String;

    .line 1074
    .line 1075
    add-int/lit8 v5, v3, 0x3

    .line 1076
    .line 1077
    aget-object v1, v1, v5

    .line 1078
    .line 1079
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1080
    .line 1081
    .line 1082
    move-result v1

    .line 1083
    if-eqz v1, :cond_37

    .line 1084
    .line 1085
    iget-object v1, v0, Lc8/b;->k:[Ljava/lang/String;

    .line 1086
    .line 1087
    aget-object v4, v1, v3

    .line 1088
    .line 1089
    iput-object v4, v0, Lc8/b;->w:Ljava/lang/String;

    .line 1090
    .line 1091
    add-int/lit8 v4, v3, 0x1

    .line 1092
    .line 1093
    aget-object v4, v1, v4

    .line 1094
    .line 1095
    iput-object v4, v0, Lc8/b;->x:Ljava/lang/String;

    .line 1096
    .line 1097
    const/16 v17, 0x2

    .line 1098
    .line 1099
    add-int/lit8 v3, v3, 0x2

    .line 1100
    .line 1101
    aget-object v1, v1, v3

    .line 1102
    .line 1103
    iput-object v1, v0, Lc8/b;->y:Ljava/lang/String;

    .line 1104
    .line 1105
    :goto_17
    iget v3, v0, Lc8/b;->u:I

    .line 1106
    .line 1107
    goto :goto_18

    .line 1108
    :cond_37
    new-instance v1, Laf/e;

    .line 1109
    .line 1110
    iget-object v2, v0, Lc8/b;->k:[Ljava/lang/String;

    .line 1111
    .line 1112
    aget-object v2, v2, v5

    .line 1113
    .line 1114
    iget-object v3, v0, Lc8/b;->y:Ljava/lang/String;

    .line 1115
    .line 1116
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1117
    .line 1118
    const-string v5, "expected: /"

    .line 1119
    .line 1120
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1124
    .line 1125
    .line 1126
    const-string v2, " read: "

    .line 1127
    .line 1128
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v2

    .line 1138
    invoke-direct {v1, v2, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 1139
    .line 1140
    .line 1141
    throw v1

    .line 1142
    :pswitch_f
    move v3, v4

    .line 1143
    invoke-virtual {v0, v3, v2}, Lc8/b;->i(ZZ)V

    .line 1144
    .line 1145
    .line 1146
    iget v3, v0, Lc8/b;->u:I

    .line 1147
    .line 1148
    goto :goto_18

    .line 1149
    :pswitch_10
    move v3, v6

    .line 1150
    :goto_18
    if-ne v3, v2, :cond_38

    .line 1151
    .line 1152
    invoke-virtual {v0}, Lb8/a;->close()V

    .line 1153
    .line 1154
    .line 1155
    :cond_38
    return v3

    .line 1156
    :cond_39
    new-instance v1, Laf/e;

    .line 1157
    .line 1158
    const-string v2, "setInput() must be called first."

    .line 1159
    .line 1160
    invoke-direct {v1, v2, v0}, Laf/e;-><init>(Ljava/lang/String;Lqh/a;)V

    .line 1161
    .line 1162
    .line 1163
    throw v1

    .line 1164
    nop

    .line 1165
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_c
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_1
    .end packed-switch

    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_9
        :pswitch_8
        :pswitch_2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
