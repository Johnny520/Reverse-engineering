.class public final synthetic Lmc;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:J


# direct methods
.method public synthetic constructor <init>(IJ)V
    .locals 0

    .line 1
    iput p1, p0, Lmc;->ε:I

    .line 2
    .line 3
    iput-wide p2, p0, Lmc;->ζ:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lmc;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Long;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iget-wide v3, v0, Lmc;->ζ:J

    .line 17
    .line 18
    cmp-long v0, v1, v3

    .line 19
    .line 20
    if-lez v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, Led1;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-wide v1, v1, Led1;->α:J

    .line 38
    .line 39
    iget-wide v3, v0, Lmc;->ζ:J

    .line 40
    .line 41
    cmp-long v0, v1, v3

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_1
    move-object/from16 v1, p1

    .line 54
    .line 55
    check-cast v1, Lorg/json/JSONObject;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const-string v2, "field"

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const/4 v3, 0x0

    .line 67
    if-nez v2, :cond_2

    .line 68
    .line 69
    goto/16 :goto_12

    .line 70
    .line 71
    :cond_2
    const-string v4, "coordinate"

    .line 72
    .line 73
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const-string v5, "decorate_uuid"

    .line 78
    .line 79
    invoke-static {v5, v1}, Lxn0;->е(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    if-nez v7, :cond_3

    .line 84
    .line 85
    goto/16 :goto_12

    .line 86
    .line 87
    :cond_3
    const-string v5, "status"

    .line 88
    .line 89
    invoke-static {v5, v2}, Lxn0;->б(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const-string v6, "seed_id"

    .line 94
    .line 95
    invoke-static {v6, v2}, Lxn0;->б(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    if-eqz v6, :cond_4

    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-lez v8, :cond_4

    .line 106
    .line 107
    move-object v10, v6

    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v10, v3

    .line 110
    :goto_2
    const-string v6, "planting_time"

    .line 111
    .line 112
    invoke-static {v6, v2}, Lxn0;->е(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static {v6}, Lxn0;->л(Ljava/lang/String;)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    const-string v6, "watering_saved_time"

    .line 121
    .line 122
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    instance-of v8, v6, Ljava/lang/Number;

    .line 127
    .line 128
    if-eqz v8, :cond_5

    .line 129
    .line 130
    check-cast v6, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 133
    .line 134
    .line 135
    move-result-wide v8

    .line 136
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    goto :goto_3

    .line 141
    :cond_5
    instance-of v8, v6, Ljava/lang/String;

    .line 142
    .line 143
    if-eqz v8, :cond_6

    .line 144
    .line 145
    check-cast v6, Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {v6}, Lw02;->Θ(Ljava/lang/String;)Ljava/lang/Double;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    if-eqz v6, :cond_6

    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 154
    .line 155
    .line 156
    move-result-wide v8

    .line 157
    double-to-long v8, v8

    .line 158
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    goto :goto_3

    .line 163
    :cond_6
    move-object v6, v3

    .line 164
    :goto_3
    const-wide/16 v8, 0x0

    .line 165
    .line 166
    if-eqz v6, :cond_8

    .line 167
    .line 168
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 169
    .line 170
    .line 171
    move-result-wide v12

    .line 172
    cmp-long v6, v12, v8

    .line 173
    .line 174
    if-gez v6, :cond_7

    .line 175
    .line 176
    move-wide v12, v8

    .line 177
    :cond_7
    move-wide v13, v12

    .line 178
    goto :goto_4

    .line 179
    :cond_8
    move-wide v13, v8

    .line 180
    :goto_4
    const-string v6, "growth_time"

    .line 181
    .line 182
    invoke-static {v6, v2}, Lxn0;->е(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v12

    .line 186
    if-eqz v12, :cond_9

    .line 187
    .line 188
    invoke-static {v12}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    goto :goto_5

    .line 197
    :cond_9
    move-object v12, v3

    .line 198
    :goto_5
    if-nez v12, :cond_a

    .line 199
    .line 200
    const-string v12, ""

    .line 201
    .line 202
    :cond_a
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result v15

    .line 206
    const-wide/16 v16, 0x0

    .line 207
    .line 208
    const-wide v18, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    if-nez v15, :cond_c

    .line 214
    .line 215
    :cond_b
    move-object v12, v3

    .line 216
    goto :goto_7

    .line 217
    :cond_c
    invoke-static {v12}, Lw02;->Θ(Ljava/lang/String;)Ljava/lang/Double;

    .line 218
    .line 219
    .line 220
    move-result-object v15

    .line 221
    if-eqz v15, :cond_10

    .line 222
    .line 223
    invoke-virtual {v15}, Ljava/lang/Double;->doubleValue()D

    .line 224
    .line 225
    .line 226
    move-result-wide v20

    .line 227
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->abs(D)D

    .line 228
    .line 229
    .line 230
    move-result-wide v20

    .line 231
    cmpg-double v20, v20, v18

    .line 232
    .line 233
    if-gtz v20, :cond_10

    .line 234
    .line 235
    invoke-virtual {v15}, Ljava/lang/Double;->doubleValue()D

    .line 236
    .line 237
    .line 238
    move-result-wide v20

    .line 239
    cmpl-double v20, v20, v16

    .line 240
    .line 241
    if-ltz v20, :cond_10

    .line 242
    .line 243
    move-wide/from16 v20, v8

    .line 244
    .line 245
    invoke-virtual {v15}, Ljava/lang/Double;->doubleValue()D

    .line 246
    .line 247
    .line 248
    move-result-wide v8

    .line 249
    double-to-long v8, v8

    .line 250
    const-wide/32 v22, 0x386d4380

    .line 251
    .line 252
    .line 253
    cmp-long v12, v8, v22

    .line 254
    .line 255
    const-wide/16 v22, 0x3e8

    .line 256
    .line 257
    if-ltz v12, :cond_e

    .line 258
    .line 259
    const-wide v20, 0x174876e800L

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    cmp-long v12, v8, v20

    .line 265
    .line 266
    if-gez v12, :cond_d

    .line 267
    .line 268
    mul-long v8, v8, v22

    .line 269
    .line 270
    :cond_d
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    :goto_6
    move-object v12, v8

    .line 275
    goto :goto_7

    .line 276
    :cond_e
    if-eqz v11, :cond_b

    .line 277
    .line 278
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 279
    .line 280
    .line 281
    move-result-wide v24

    .line 282
    sub-long/2addr v8, v13

    .line 283
    cmp-long v12, v8, v20

    .line 284
    .line 285
    if-gez v12, :cond_f

    .line 286
    .line 287
    move-wide/from16 v8, v20

    .line 288
    .line 289
    :cond_f
    mul-long v8, v8, v22

    .line 290
    .line 291
    add-long v8, v8, v24

    .line 292
    .line 293
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    goto :goto_6

    .line 298
    :cond_10
    invoke-static {v12}, Lxn0;->л(Ljava/lang/String;)Ljava/lang/Long;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    goto :goto_6

    .line 303
    :goto_7
    const/4 v8, 0x1

    .line 304
    if-nez v5, :cond_11

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_11
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    if-nez v9, :cond_12

    .line 312
    .line 313
    sget-object v0, Lmc1;->ε:Lmc1;

    .line 314
    .line 315
    :goto_8
    move-object v9, v0

    .line 316
    goto :goto_c

    .line 317
    :cond_12
    :goto_9
    if-nez v5, :cond_13

    .line 318
    .line 319
    goto :goto_a

    .line 320
    :cond_13
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    if-ne v9, v8, :cond_14

    .line 325
    .line 326
    sget-object v0, Lmc1;->ζ:Lmc1;

    .line 327
    .line 328
    goto :goto_8

    .line 329
    :cond_14
    :goto_a
    if-nez v5, :cond_15

    .line 330
    .line 331
    goto :goto_b

    .line 332
    :cond_15
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    const/4 v9, 0x2

    .line 337
    if-ne v5, v9, :cond_17

    .line 338
    .line 339
    if-eqz v12, :cond_16

    .line 340
    .line 341
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 342
    .line 343
    .line 344
    move-result-wide v20

    .line 345
    iget-wide v8, v0, Lmc;->ζ:J

    .line 346
    .line 347
    cmp-long v0, v20, v8

    .line 348
    .line 349
    if-gtz v0, :cond_16

    .line 350
    .line 351
    sget-object v0, Lmc1;->θ:Lmc1;

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_16
    sget-object v0, Lmc1;->η:Lmc1;

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_17
    :goto_b
    sget-object v0, Lmc1;->ι:Lmc1;

    .line 358
    .line 359
    goto :goto_8

    .line 360
    :goto_c
    new-instance v0, Llc1;

    .line 361
    .line 362
    const-string v5, "item_id"

    .line 363
    .line 364
    invoke-static {v5, v1}, Lxn0;->б(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    const-string v1, "is_double_income"

    .line 369
    .line 370
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    instance-of v5, v1, Ljava/lang/Boolean;

    .line 375
    .line 376
    if-eqz v5, :cond_18

    .line 377
    .line 378
    check-cast v1, Ljava/lang/Boolean;

    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    move v15, v1

    .line 385
    goto :goto_e

    .line 386
    :cond_18
    instance-of v5, v1, Ljava/lang/Number;

    .line 387
    .line 388
    const/4 v15, 0x0

    .line 389
    if-eqz v5, :cond_1a

    .line 390
    .line 391
    check-cast v1, Ljava/lang/Number;

    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-eqz v1, :cond_1b

    .line 398
    .line 399
    :cond_19
    :goto_d
    const/4 v15, 0x1

    .line 400
    goto :goto_e

    .line 401
    :cond_1a
    instance-of v5, v1, Ljava/lang/String;

    .line 402
    .line 403
    if-eqz v5, :cond_1b

    .line 404
    .line 405
    const-string v5, "1"

    .line 406
    .line 407
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v5

    .line 411
    if-nez v5, :cond_19

    .line 412
    .line 413
    check-cast v1, Ljava/lang/String;

    .line 414
    .line 415
    const-string v5, "true"

    .line 416
    .line 417
    invoke-virtual {v1, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    if-eqz v1, :cond_1b

    .line 422
    .line 423
    goto :goto_d

    .line 424
    :cond_1b
    :goto_e
    if-eqz v4, :cond_1c

    .line 425
    .line 426
    const-string v1, "x"

    .line 427
    .line 428
    invoke-static {v1, v4}, Lxn0;->б(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    goto :goto_f

    .line 433
    :cond_1c
    move-object v1, v3

    .line 434
    :goto_f
    if-eqz v4, :cond_1d

    .line 435
    .line 436
    const-string v5, "y"

    .line 437
    .line 438
    invoke-static {v5, v4}, Lxn0;->б(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    goto :goto_10

    .line 443
    :cond_1d
    move-object v4, v3

    .line 444
    :goto_10
    invoke-static {v6, v2}, Lxn0;->е(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    if-eqz v5, :cond_1f

    .line 449
    .line 450
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    if-eqz v5, :cond_1f

    .line 459
    .line 460
    invoke-static {v5}, Lw02;->Θ(Ljava/lang/String;)Ljava/lang/Double;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    if-eqz v5, :cond_1f

    .line 465
    .line 466
    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    .line 467
    .line 468
    .line 469
    move-result-wide v20

    .line 470
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->abs(D)D

    .line 471
    .line 472
    .line 473
    move-result-wide v22

    .line 474
    cmpg-double v6, v22, v18

    .line 475
    .line 476
    if-gtz v6, :cond_1e

    .line 477
    .line 478
    cmpl-double v6, v20, v16

    .line 479
    .line 480
    if-ltz v6, :cond_1e

    .line 481
    .line 482
    const-wide v16, 0x41cc36a1c0000000L    # 9.466848E8

    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    cmpg-double v6, v20, v16

    .line 488
    .line 489
    if-gez v6, :cond_1e

    .line 490
    .line 491
    goto :goto_11

    .line 492
    :cond_1e
    move-object v5, v3

    .line 493
    :goto_11
    if-eqz v5, :cond_1f

    .line 494
    .line 495
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 496
    .line 497
    .line 498
    move-result-wide v5

    .line 499
    double-to-long v5, v5

    .line 500
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    :cond_1f
    move-object/from16 v18, v3

    .line 505
    .line 506
    const-string v3, "watering_count"

    .line 507
    .line 508
    invoke-static {v3, v2}, Lxn0;->б(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    if-nez v3, :cond_20

    .line 513
    .line 514
    const-string v3, "water_times"

    .line 515
    .line 516
    invoke-static {v3, v2}, Lxn0;->б(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    :cond_20
    move-object/from16 v19, v3

    .line 521
    .line 522
    const-string v3, "last_watering_time"

    .line 523
    .line 524
    invoke-static {v3, v2}, Lxn0;->е(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    if-nez v3, :cond_21

    .line 529
    .line 530
    const-string v3, "watering_time"

    .line 531
    .line 532
    invoke-static {v3, v2}, Lxn0;->е(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    :cond_21
    invoke-static {v3}, Lxn0;->л(Ljava/lang/String;)Ljava/lang/Long;

    .line 537
    .line 538
    .line 539
    move-result-object v20

    .line 540
    move-object v6, v0

    .line 541
    move-object/from16 v16, v1

    .line 542
    .line 543
    move-object/from16 v17, v4

    .line 544
    .line 545
    invoke-direct/range {v6 .. v20}, Llc1;-><init>(Ljava/lang/String;Ljava/lang/Integer;Lmc1;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;JZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;)V

    .line 546
    .line 547
    .line 548
    move-object v3, v6

    .line 549
    :goto_12
    return-object v3

    .line 550
    :pswitch_2
    move-object/from16 v1, p1

    .line 551
    .line 552
    check-cast v1, Ljava/util/Map$Entry;

    .line 553
    .line 554
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    check-cast v1, Ljava/lang/Number;

    .line 565
    .line 566
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 567
    .line 568
    .line 569
    move-result-wide v1

    .line 570
    iget-wide v3, v0, Lmc;->ζ:J

    .line 571
    .line 572
    sub-long/2addr v3, v1

    .line 573
    const-wide/16 v0, 0x1388

    .line 574
    .line 575
    cmp-long v0, v3, v0

    .line 576
    .line 577
    if-lez v0, :cond_22

    .line 578
    .line 579
    const/4 v0, 0x1

    .line 580
    goto :goto_13

    .line 581
    :cond_22
    const/4 v0, 0x0

    .line 582
    :goto_13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    return-object v0

    .line 587
    :pswitch_3
    move-object/from16 v1, p1

    .line 588
    .line 589
    check-cast v1, Lcw;

    .line 590
    .line 591
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    const/4 v6, 0x0

    .line 595
    const/16 v7, 0x7e

    .line 596
    .line 597
    iget-wide v2, v0, Lmc;->ζ:J

    .line 598
    .line 599
    const-wide/16 v4, 0x0

    .line 600
    .line 601
    invoke-static/range {v1 .. v7}, Lcw;->а(Lcw;JJFI)V

    .line 602
    .line 603
    .line 604
    sget-object v0, Ls62;->α:Ls62;

    .line 605
    .line 606
    return-object v0

    .line 607
    :pswitch_4
    move-object/from16 v1, p1

    .line 608
    .line 609
    check-cast v1, Ljava/util/Map$Entry;

    .line 610
    .line 611
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    check-cast v1, Lcj;

    .line 619
    .line 620
    iget-wide v1, v1, Lcj;->ζ:J

    .line 621
    .line 622
    iget-wide v3, v0, Lmc;->ζ:J

    .line 623
    .line 624
    sub-long/2addr v3, v1

    .line 625
    const-wide/32 v0, 0x927c0

    .line 626
    .line 627
    .line 628
    cmp-long v0, v3, v0

    .line 629
    .line 630
    if-lez v0, :cond_23

    .line 631
    .line 632
    const/4 v0, 0x1

    .line 633
    goto :goto_14

    .line 634
    :cond_23
    const/4 v0, 0x0

    .line 635
    :goto_14
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    return-object v0

    .line 640
    :pswitch_5
    move-object/from16 v1, p1

    .line 641
    .line 642
    check-cast v1, Ljava/lang/Long;

    .line 643
    .line 644
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 645
    .line 646
    .line 647
    move-result-wide v1

    .line 648
    iget-wide v3, v0, Lmc;->ζ:J

    .line 649
    .line 650
    cmp-long v0, v1, v3

    .line 651
    .line 652
    if-lez v0, :cond_24

    .line 653
    .line 654
    const-wide/16 v3, 0x3e8

    .line 655
    .line 656
    cmp-long v0, v3, v1

    .line 657
    .line 658
    if-gtz v0, :cond_24

    .line 659
    .line 660
    const-wide/32 v3, 0xdbba01

    .line 661
    .line 662
    .line 663
    cmp-long v0, v1, v3

    .line 664
    .line 665
    if-gez v0, :cond_24

    .line 666
    .line 667
    const/4 v0, 0x1

    .line 668
    goto :goto_15

    .line 669
    :cond_24
    const/4 v0, 0x0

    .line 670
    :goto_15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    return-object v0

    .line 675
    :pswitch_6
    iget-wide v0, v0, Lmc;->ζ:J

    .line 676
    .line 677
    move-object/from16 v2, p1

    .line 678
    .line 679
    check-cast v2, Lnc;

    .line 680
    .line 681
    iget-object v3, v2, Lnc;->β:La80;

    .line 682
    .line 683
    if-nez v3, :cond_25

    .line 684
    .line 685
    goto :goto_17

    .line 686
    :cond_25
    iget-object v2, v2, Lnc;->α:Lae;

    .line 687
    .line 688
    if-eqz v2, :cond_26

    .line 689
    .line 690
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-interface {v3, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 698
    goto :goto_16

    .line 699
    :catchall_0
    move-exception v0

    .line 700
    new-instance v1, Leo1;

    .line 701
    .line 702
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 703
    .line 704
    .line 705
    move-object v0, v1

    .line 706
    :goto_16
    invoke-virtual {v2, v0}, Lae;->ζ(Ljava/lang/Object;)V

    .line 707
    .line 708
    .line 709
    :cond_26
    :goto_17
    sget-object v0, Ls62;->α:Ls62;

    .line 710
    .line 711
    return-object v0

    .line 712
    nop

    .line 713
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
