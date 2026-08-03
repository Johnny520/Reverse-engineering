.class public final synthetic Lua/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk8/n;


# instance fields
.field public final synthetic a:Lua/b;

.field public final synthetic b:Lr8/g;


# direct methods
.method public synthetic constructor <init>(Lua/b;Lr8/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lua/a;->a:Lua/b;

    .line 5
    .line 6
    iput-object p2, p0, Lua/a;->b:Lr8/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lk8/o;)V
    .locals 61

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v1, v3, Lk8/o;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, v3, Lk8/o;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v3, Lk8/o;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    iget-object v4, v3, Lk8/o;->f:Ljava/lang/String;

    .line 18
    .line 19
    :cond_0
    iget-boolean v5, v3, Lk8/o;->i:Z

    .line 20
    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    goto/16 :goto_32

    .line 24
    .line 25
    :cond_1
    new-instance v5, Lp4/t;

    .line 26
    .line 27
    iget-object v6, v0, Lua/a;->b:Lr8/g;

    .line 28
    .line 29
    iget-object v6, v6, Lr8/g;->a:Landroid/content/Context;

    .line 30
    .line 31
    invoke-direct {v5, v6}, Lp4/t;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    iget-object v6, v5, Lp4/t;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v6, Landroid/content/SharedPreferences;

    .line 37
    .line 38
    const-string v7, "transfer_auto_enable"

    .line 39
    .line 40
    invoke-virtual {v5, v7}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-nez v8, :cond_2

    .line 45
    .line 46
    goto/16 :goto_32

    .line 47
    .line 48
    :cond_2
    const/4 v8, 0x2

    .line 49
    const-string v9, ""

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    if-eqz v4, :cond_4

    .line 53
    .line 54
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eqz v11, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const-string v11, ":\n"

    .line 62
    .line 63
    const/4 v12, 0x6

    .line 64
    invoke-static {v4, v11, v10, v10, v12}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-lez v11, :cond_5

    .line 69
    .line 70
    const-string v12, "<"

    .line 71
    .line 72
    const/4 v13, 0x4

    .line 73
    invoke-static {v4, v12, v11, v10, v13}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    if-le v12, v11, :cond_5

    .line 78
    .line 79
    add-int/2addr v11, v8

    .line 80
    invoke-virtual {v4, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    :goto_0
    move-object v4, v9

    .line 86
    :cond_5
    :goto_1
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    const/16 v23, 0x0

    .line 91
    .line 92
    if-nez v11, :cond_15

    .line 93
    .line 94
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 95
    .line 96
    invoke-static {v11, v4, v11}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    const-string v12, "<wcpayinfo"

    .line 101
    .line 102
    invoke-static {v11, v12, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    if-eqz v12, :cond_15

    .line 107
    .line 108
    const-string v12, "<transferid"

    .line 109
    .line 110
    invoke-static {v11, v12, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    if-nez v12, :cond_6

    .line 115
    .line 116
    const-string v12, "<transfer_id"

    .line 117
    .line 118
    invoke-static {v11, v12, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    if-nez v12, :cond_6

    .line 123
    .line 124
    const-string v12, "<trans_id"

    .line 125
    .line 126
    invoke-static {v11, v12, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    if-nez v12, :cond_6

    .line 131
    .line 132
    const-string v12, "<transcationid"

    .line 133
    .line 134
    invoke-static {v11, v12, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-nez v12, :cond_6

    .line 139
    .line 140
    const-string v12, "<transactionid"

    .line 141
    .line 142
    invoke-static {v11, v12, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    if-nez v12, :cond_6

    .line 147
    .line 148
    const-string v12, "<transaction_id"

    .line 149
    .line 150
    invoke-static {v11, v12, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    if-eqz v11, :cond_15

    .line 155
    .line 156
    :cond_6
    const-string v11, "transcationid"

    .line 157
    .line 158
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result v12

    .line 166
    if-eqz v12, :cond_7

    .line 167
    .line 168
    const-string v11, "transactionid"

    .line 169
    .line 170
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    :cond_7
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    if-eqz v12, :cond_8

    .line 179
    .line 180
    const-string v11, "transaction_id"

    .line 181
    .line 182
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    :cond_8
    move-object v12, v11

    .line 187
    const-string v11, "transferid"

    .line 188
    .line 189
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v13

    .line 197
    if-eqz v13, :cond_9

    .line 198
    .line 199
    const-string v11, "transfer_id"

    .line 200
    .line 201
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    :cond_9
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    if-eqz v13, :cond_a

    .line 210
    .line 211
    const-string v11, "trans_id"

    .line 212
    .line 213
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    :cond_a
    move-object v13, v11

    .line 218
    const-string v11, "payer_username"

    .line 219
    .line 220
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    if-eqz v14, :cond_b

    .line 229
    .line 230
    const-string v11, "payerusername"

    .line 231
    .line 232
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    :cond_b
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 237
    .line 238
    .line 239
    move-result v14

    .line 240
    if-eqz v14, :cond_c

    .line 241
    .line 242
    const-string v11, "fromusername"

    .line 243
    .line 244
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v11

    .line 248
    :cond_c
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 249
    .line 250
    .line 251
    move-result v14

    .line 252
    if-eqz v14, :cond_e

    .line 253
    .line 254
    if-nez v2, :cond_d

    .line 255
    .line 256
    move-object v11, v9

    .line 257
    goto :goto_2

    .line 258
    :cond_d
    move-object v11, v2

    .line 259
    :cond_e
    :goto_2
    move-object v14, v11

    .line 260
    const-string v11, "receiver_username"

    .line 261
    .line 262
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v11

    .line 266
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result v15

    .line 270
    if-eqz v15, :cond_f

    .line 271
    .line 272
    const-string v11, "receiverusername"

    .line 273
    .line 274
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    :cond_f
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 279
    .line 280
    .line 281
    move-result v15

    .line 282
    if-eqz v15, :cond_10

    .line 283
    .line 284
    const-string v11, "tousername"

    .line 285
    .line 286
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    :cond_10
    move-object v15, v11

    .line 291
    const-string v11, "invalidtime"

    .line 292
    .line 293
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    const/16 v8, 0xa

    .line 298
    .line 299
    invoke-static {v8, v11}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    if-eqz v11, :cond_11

    .line 304
    .line 305
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    move/from16 v16, v11

    .line 310
    .line 311
    goto :goto_3

    .line 312
    :cond_11
    move/from16 v16, v10

    .line 313
    .line 314
    :goto_3
    const-string v11, "total_fee"

    .line 315
    .line 316
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v11

    .line 320
    invoke-static {v8, v11}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v11

    .line 324
    if-eqz v11, :cond_12

    .line 325
    .line 326
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 327
    .line 328
    .line 329
    move-result v8

    .line 330
    :goto_4
    move/from16 v17, v8

    .line 331
    .line 332
    goto :goto_5

    .line 333
    :cond_12
    const-string v11, "feederval"

    .line 334
    .line 335
    invoke-static {v4, v11}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v11

    .line 339
    invoke-static {v8, v11}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    if-eqz v8, :cond_13

    .line 344
    .line 345
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 346
    .line 347
    .line 348
    move-result v8

    .line 349
    goto :goto_4

    .line 350
    :cond_13
    invoke-static {v4}, Lfb/v0;->H(Ljava/lang/String;)D

    .line 351
    .line 352
    .line 353
    move-result-wide v17

    .line 354
    const-wide/high16 v19, 0x4059000000000000L    # 100.0

    .line 355
    .line 356
    mul-double v10, v17, v19

    .line 357
    .line 358
    double-to-int v10, v10

    .line 359
    move/from16 v17, v10

    .line 360
    .line 361
    :goto_5
    const-string v10, "paysubtype"

    .line 362
    .line 363
    invoke-static {v4, v10}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v20

    .line 367
    invoke-static {v4}, Lfb/v0;->H(Ljava/lang/String;)D

    .line 368
    .line 369
    .line 370
    move-result-wide v18

    .line 371
    const-string v10, "transfer_attach"

    .line 372
    .line 373
    invoke-static {v4, v10}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v10

    .line 377
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 378
    .line 379
    .line 380
    move-result v11

    .line 381
    if-eqz v11, :cond_14

    .line 382
    .line 383
    const-string v10, "transferattach"

    .line 384
    .line 385
    invoke-static {v4, v10}, Lfb/v0;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v10

    .line 389
    :cond_14
    move-object/from16 v21, v10

    .line 390
    .line 391
    new-instance v11, Lua/d;

    .line 392
    .line 393
    move-object/from16 v22, v4

    .line 394
    .line 395
    invoke-direct/range {v11 .. v22}, Lua/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    goto :goto_6

    .line 399
    :cond_15
    move-object/from16 v11, v23

    .line 400
    .line 401
    :goto_6
    if-nez v11, :cond_16

    .line 402
    .line 403
    goto/16 :goto_32

    .line 404
    .line 405
    :cond_16
    iget-object v4, v11, Lua/d;->d:Ljava/lang/String;

    .line 406
    .line 407
    iget-object v10, v11, Lua/d;->c:Ljava/lang/String;

    .line 408
    .line 409
    iget-object v12, v11, Lua/d;->h:Ljava/lang/String;

    .line 410
    .line 411
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 412
    .line 413
    .line 414
    move-result v13

    .line 415
    if-nez v13, :cond_17

    .line 416
    .line 417
    sget-object v13, Lua/e;->a:Ljava/util/Set;

    .line 418
    .line 419
    invoke-interface {v13, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v12

    .line 423
    if-eqz v12, :cond_5a

    .line 424
    .line 425
    :cond_17
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 426
    .line 427
    .line 428
    move-result-object v12

    .line 429
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->a()Lg8/a;

    .line 433
    .line 434
    .line 435
    move-result-object v12

    .line 436
    if-eqz v12, :cond_18

    .line 437
    .line 438
    invoke-virtual {v12}, Lg8/a;->c()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v12

    .line 442
    goto :goto_7

    .line 443
    :cond_18
    move-object/from16 v12, v23

    .line 444
    .line 445
    :goto_7
    if-nez v12, :cond_19

    .line 446
    .line 447
    move-object v12, v9

    .line 448
    :cond_19
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 449
    .line 450
    .line 451
    move-result v13

    .line 452
    if-nez v13, :cond_1a

    .line 453
    .line 454
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 455
    .line 456
    .line 457
    move-result v13

    .line 458
    if-nez v13, :cond_1a

    .line 459
    .line 460
    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v4

    .line 464
    if-nez v4, :cond_1a

    .line 465
    .line 466
    goto/16 :goto_32

    .line 467
    .line 468
    :cond_1a
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 469
    .line 470
    .line 471
    move-result v4

    .line 472
    if-nez v4, :cond_1b

    .line 473
    .line 474
    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    if-eqz v4, :cond_1b

    .line 479
    .line 480
    goto/16 :goto_32

    .line 481
    .line 482
    :cond_1b
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 483
    .line 484
    .line 485
    move-result v4

    .line 486
    if-eqz v4, :cond_1c

    .line 487
    .line 488
    move-object v4, v2

    .line 489
    goto :goto_8

    .line 490
    :cond_1c
    move-object v4, v10

    .line 491
    :goto_8
    const-string v12, "transfer_reply_items_v1"

    .line 492
    .line 493
    invoke-virtual {v5, v12, v9}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v12

    .line 497
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 498
    .line 499
    .line 500
    move-result v13

    .line 501
    if-nez v13, :cond_1d

    .line 502
    .line 503
    goto :goto_9

    .line 504
    :cond_1d
    move-object/from16 v12, v23

    .line 505
    .line 506
    :goto_9
    const/4 v13, 0x1

    .line 507
    if-eqz v12, :cond_1e

    .line 508
    .line 509
    invoke-static {v12}, La7/a;->J(Ljava/lang/String;)Ljava/util/List;

    .line 510
    .line 511
    .line 512
    move-result-object v12

    .line 513
    if-eqz v12, :cond_1e

    .line 514
    .line 515
    :goto_a
    move-object/from16 v48, v12

    .line 516
    .line 517
    goto :goto_b

    .line 518
    :cond_1e
    const-string v12, "transfer_reply_enable"

    .line 519
    .line 520
    invoke-virtual {v5, v12}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 521
    .line 522
    .line 523
    move-result v12

    .line 524
    if-eqz v12, :cond_1f

    .line 525
    .line 526
    const-string v12, "transfer_reply_text"

    .line 527
    .line 528
    const-string v14, "\u8c22\u8c22\u8001\u677f"

    .line 529
    .line 530
    invoke-virtual {v5, v12, v14}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v12

    .line 534
    const-wide/16 v14, 0x3e8

    .line 535
    .line 536
    const/4 v8, 0x0

    .line 537
    invoke-static {v13, v14, v15, v12, v8}, La7/a;->B(IJLjava/lang/String;Z)Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v12

    .line 541
    goto :goto_a

    .line 542
    :cond_1f
    sget-object v12, Ltf/t;->g:Ltf/t;

    .line 543
    .line 544
    goto :goto_a

    .line 545
    :goto_b
    new-instance v24, Lua/c;

    .line 546
    .line 547
    invoke-virtual {v5, v7}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 548
    .line 549
    .line 550
    move-result v26

    .line 551
    const-string v7, "transfer_delay_mode"

    .line 552
    .line 553
    if-eqz v6, :cond_20

    .line 554
    .line 555
    const/4 v12, 0x2

    .line 556
    :try_start_0
    invoke-interface {v6, v7, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 557
    .line 558
    .line 559
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 560
    move/from16 v27, v7

    .line 561
    .line 562
    goto :goto_c

    .line 563
    :catchall_0
    :cond_20
    const/16 v27, 0x2

    .line 564
    .line 565
    :goto_c
    const-string v7, "transfer_delay_ms"

    .line 566
    .line 567
    const-wide/16 v14, 0x0

    .line 568
    .line 569
    if-eqz v6, :cond_21

    .line 570
    .line 571
    :try_start_1
    invoke-interface {v6, v7, v14, v15}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 572
    .line 573
    .line 574
    move-result-wide v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 575
    move-wide/from16 v28, v16

    .line 576
    .line 577
    goto :goto_d

    .line 578
    :catchall_1
    :cond_21
    move-wide/from16 v28, v14

    .line 579
    .line 580
    :goto_d
    const-string v7, "transfer_delay_random_min"

    .line 581
    .line 582
    if-eqz v6, :cond_22

    .line 583
    .line 584
    :try_start_2
    invoke-interface {v6, v7, v14, v15}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 585
    .line 586
    .line 587
    move-result-wide v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 588
    move-wide/from16 v30, v16

    .line 589
    .line 590
    goto :goto_e

    .line 591
    :catchall_2
    :cond_22
    move-wide/from16 v30, v14

    .line 592
    .line 593
    :goto_e
    const-string v7, "transfer_delay_random_max"

    .line 594
    .line 595
    if-eqz v6, :cond_23

    .line 596
    .line 597
    :try_start_3
    invoke-interface {v6, v7, v14, v15}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 598
    .line 599
    .line 600
    move-result-wide v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 601
    move-wide/from16 v32, v16

    .line 602
    .line 603
    goto :goto_f

    .line 604
    :catchall_3
    :cond_23
    move-wide/from16 v32, v14

    .line 605
    .line 606
    :goto_f
    const-string v7, "transfer_receive_account"

    .line 607
    .line 608
    const-string v12, "default"

    .line 609
    .line 610
    invoke-virtual {v5, v7, v12}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v34

    .line 614
    const-string v7, "transfer_mode"

    .line 615
    .line 616
    if-eqz v6, :cond_24

    .line 617
    .line 618
    const/4 v8, 0x0

    .line 619
    :try_start_4
    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 620
    .line 621
    .line 622
    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 623
    move/from16 v35, v7

    .line 624
    .line 625
    goto :goto_10

    .line 626
    :catchall_4
    :cond_24
    const/16 v35, 0x0

    .line 627
    .line 628
    :goto_10
    const-string v7, "transfer_whitelist"

    .line 629
    .line 630
    invoke-virtual {v5, v7, v9}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v36

    .line 634
    const-string v7, "transfer_blacklist"

    .line 635
    .line 636
    invoke-virtual {v5, v7, v9}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v37

    .line 640
    const-string v7, "transfer_amount_enable"

    .line 641
    .line 642
    invoke-virtual {v5, v7}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 643
    .line 644
    .line 645
    move-result v38

    .line 646
    const-string v7, "transfer_amount_cond"

    .line 647
    .line 648
    if-eqz v6, :cond_25

    .line 649
    .line 650
    :try_start_5
    invoke-interface {v6, v7, v13}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 651
    .line 652
    .line 653
    move-result v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 654
    move/from16 v39, v7

    .line 655
    .line 656
    goto :goto_11

    .line 657
    :catchall_5
    :cond_25
    move/from16 v39, v13

    .line 658
    .line 659
    :goto_11
    const-string v7, "transfer_amount_value"

    .line 660
    .line 661
    const-string v12, "0"

    .line 662
    .line 663
    invoke-virtual {v5, v7, v12}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v40

    .line 667
    const-string v7, "transfer_amount_action"

    .line 668
    .line 669
    if-eqz v6, :cond_26

    .line 670
    .line 671
    const/4 v8, 0x0

    .line 672
    :try_start_6
    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 673
    .line 674
    .line 675
    move-result v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 676
    move/from16 v41, v7

    .line 677
    .line 678
    goto :goto_12

    .line 679
    :cond_26
    const/4 v8, 0x0

    .line 680
    :catchall_6
    move/from16 v41, v8

    .line 681
    .line 682
    :goto_12
    const-string v7, "transfer_keyword_mode"

    .line 683
    .line 684
    if-eqz v6, :cond_27

    .line 685
    .line 686
    :try_start_7
    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 687
    .line 688
    .line 689
    move-result v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 690
    move/from16 v42, v7

    .line 691
    .line 692
    goto :goto_13

    .line 693
    :catchall_7
    :cond_27
    const/16 v42, 0x0

    .line 694
    .line 695
    :goto_13
    const-string v7, "transfer_keywords"

    .line 696
    .line 697
    invoke-virtual {v5, v7, v9}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v43

    .line 701
    const-string v7, "transfer_quiet_enable"

    .line 702
    .line 703
    invoke-virtual {v5, v7}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 704
    .line 705
    .line 706
    move-result v44

    .line 707
    const-string v7, "transfer_quiet_start_second"

    .line 708
    .line 709
    if-eqz v6, :cond_28

    .line 710
    .line 711
    const/4 v8, 0x0

    .line 712
    :try_start_8
    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 713
    .line 714
    .line 715
    move-result v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 716
    move/from16 v45, v7

    .line 717
    .line 718
    goto :goto_14

    .line 719
    :cond_28
    const/4 v8, 0x0

    .line 720
    :catchall_8
    move/from16 v45, v8

    .line 721
    .line 722
    :goto_14
    const-string v7, "transfer_quiet_end_second"

    .line 723
    .line 724
    if-eqz v6, :cond_29

    .line 725
    .line 726
    :try_start_9
    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 727
    .line 728
    .line 729
    move-result v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 730
    move/from16 v46, v7

    .line 731
    .line 732
    goto :goto_15

    .line 733
    :catchall_9
    :cond_29
    const/16 v46, 0x0

    .line 734
    .line 735
    :goto_15
    const-string v7, "transfer_refund_rejected"

    .line 736
    .line 737
    invoke-virtual {v5, v7}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 738
    .line 739
    .line 740
    move-result v47

    .line 741
    const-string v7, "transfer_notify_system_enable"

    .line 742
    .line 743
    invoke-virtual {v5, v7}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 744
    .line 745
    .line 746
    move-result v49

    .line 747
    const-string v7, "transfer_notify_toast_enable"

    .line 748
    .line 749
    invoke-virtual {v5, v7}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 750
    .line 751
    .line 752
    move-result v50

    .line 753
    const-string v7, "transfer_notify_sound_enable"

    .line 754
    .line 755
    invoke-virtual {v5, v7}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 756
    .line 757
    .line 758
    move-result v51

    .line 759
    const-string v7, "transfer_notify_sound_mode"

    .line 760
    .line 761
    if-eqz v6, :cond_2a

    .line 762
    .line 763
    const/4 v8, 0x0

    .line 764
    :try_start_a
    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 765
    .line 766
    .line 767
    move-result v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 768
    move/from16 v52, v6

    .line 769
    .line 770
    goto :goto_16

    .line 771
    :catchall_a
    :cond_2a
    const/16 v52, 0x0

    .line 772
    .line 773
    :goto_16
    const-string v6, "transfer_notify_vibrate_enable"

    .line 774
    .line 775
    invoke-virtual {v5, v6}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 776
    .line 777
    .line 778
    move-result v53

    .line 779
    const-string v6, "transfer_notify_sound_uri"

    .line 780
    .line 781
    invoke-virtual {v5, v6, v9}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v54

    .line 785
    const-string v6, "transfer_notify_text"

    .line 786
    .line 787
    const-string v7, "\u5df2\u6536\u6b3e {amount} \u5143"

    .line 788
    .line 789
    invoke-virtual {v5, v6, v7}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v55

    .line 793
    const-string v6, "transfer_notify_toast_text"

    .line 794
    .line 795
    invoke-virtual {v5, v6, v7}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v56

    .line 799
    const-string v6, "transfer_announce_enable"

    .line 800
    .line 801
    invoke-virtual {v5, v6}, Lp4/t;->w(Ljava/lang/String;)Z

    .line 802
    .line 803
    .line 804
    move-result v57

    .line 805
    const-string v6, "transfer_announce_text"

    .line 806
    .line 807
    const-string v7, "\u6536\u5230\u8f6c\u8d26 {amount} \u5143"

    .line 808
    .line 809
    invoke-virtual {v5, v6, v7}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v58

    .line 813
    const-string v25, "\u65e7\u7248\u5168\u5c40\u8bbe\u7f6e"

    .line 814
    .line 815
    invoke-direct/range {v24 .. v58}, Lua/c;-><init>(Ljava/lang/String;ZIJJJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/String;ZIIZLjava/util/List;ZZZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 816
    .line 817
    .line 818
    move-object/from16 v6, v24

    .line 819
    .line 820
    const-string v7, "transfer_rule_templates_v1"

    .line 821
    .line 822
    invoke-virtual {v5, v7, v9}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v7

    .line 826
    invoke-static {v7}, Lg4/a;->E(Ljava/lang/String;)Ljava/util/List;

    .line 827
    .line 828
    .line 829
    move-result-object v7

    .line 830
    const-string v12, "transfer_rule_bindings_v1"

    .line 831
    .line 832
    invoke-virtual {v5, v12, v9}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v9

    .line 836
    invoke-static {v9}, Lg4/a;->C(Ljava/lang/String;)Ljava/util/List;

    .line 837
    .line 838
    .line 839
    move-result-object v9

    .line 840
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 841
    .line 842
    .line 843
    move-result-object v9

    .line 844
    :goto_17
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 845
    .line 846
    .line 847
    move-result v12

    .line 848
    if-eqz v12, :cond_30

    .line 849
    .line 850
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v12

    .line 854
    move-object v8, v12

    .line 855
    check-cast v8, Lua/h;

    .line 856
    .line 857
    iget-object v8, v8, Lua/h;->b:Ljava/lang/String;

    .line 858
    .line 859
    if-eqz v8, :cond_2b

    .line 860
    .line 861
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 862
    .line 863
    .line 864
    move-result v17

    .line 865
    if-eqz v17, :cond_2c

    .line 866
    .line 867
    :cond_2b
    move-wide/from16 v17, v14

    .line 868
    .line 869
    goto :goto_1a

    .line 870
    :cond_2c
    invoke-static {v8}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 871
    .line 872
    .line 873
    move-result-object v8

    .line 874
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v8

    .line 878
    if-eqz v1, :cond_2d

    .line 879
    .line 880
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 881
    .line 882
    .line 883
    move-result-object v17

    .line 884
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v17

    .line 888
    move-wide/from16 v59, v14

    .line 889
    .line 890
    move-object/from16 v14, v17

    .line 891
    .line 892
    move-wide/from16 v17, v59

    .line 893
    .line 894
    goto :goto_18

    .line 895
    :cond_2d
    move-wide/from16 v17, v14

    .line 896
    .line 897
    move-object/from16 v14, v23

    .line 898
    .line 899
    :goto_18
    invoke-static {v8, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v14

    .line 903
    if-nez v14, :cond_31

    .line 904
    .line 905
    if-eqz v4, :cond_2e

    .line 906
    .line 907
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 908
    .line 909
    .line 910
    move-result-object v14

    .line 911
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v14

    .line 915
    goto :goto_19

    .line 916
    :cond_2e
    move-object/from16 v14, v23

    .line 917
    .line 918
    :goto_19
    invoke-static {v8, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 919
    .line 920
    .line 921
    move-result v8

    .line 922
    if-eqz v8, :cond_2f

    .line 923
    .line 924
    goto :goto_1b

    .line 925
    :cond_2f
    :goto_1a
    move-wide/from16 v14, v17

    .line 926
    .line 927
    goto :goto_17

    .line 928
    :cond_30
    move-wide/from16 v17, v14

    .line 929
    .line 930
    move-object/from16 v12, v23

    .line 931
    .line 932
    :cond_31
    :goto_1b
    check-cast v12, Lua/h;

    .line 933
    .line 934
    if-eqz v12, :cond_37

    .line 935
    .line 936
    iget-object v4, v12, Lua/h;->c:Ljava/lang/String;

    .line 937
    .line 938
    iget-object v8, v12, Lua/h;->e:Ljava/lang/String;

    .line 939
    .line 940
    iget-boolean v9, v12, Lua/h;->d:Z

    .line 941
    .line 942
    if-nez v9, :cond_32

    .line 943
    .line 944
    invoke-static {v6, v4}, Lua/c;->a(Lua/c;Ljava/lang/String;)Lua/c;

    .line 945
    .line 946
    .line 947
    move-result-object v4

    .line 948
    :goto_1c
    move-object v6, v4

    .line 949
    goto :goto_1e

    .line 950
    :cond_32
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 951
    .line 952
    .line 953
    move-result v9

    .line 954
    if-eqz v9, :cond_33

    .line 955
    .line 956
    invoke-static {v5, v7, v6}, Loh/h;->t(Lp4/t;Ljava/util/List;Lua/c;)Lua/c;

    .line 957
    .line 958
    .line 959
    move-result-object v4

    .line 960
    goto :goto_1c

    .line 961
    :cond_33
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 962
    .line 963
    .line 964
    move-result-object v7

    .line 965
    :cond_34
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 966
    .line 967
    .line 968
    move-result v9

    .line 969
    if-eqz v9, :cond_35

    .line 970
    .line 971
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v9

    .line 975
    move-object v12, v9

    .line 976
    check-cast v12, Lua/i;

    .line 977
    .line 978
    iget-object v12, v12, Lua/i;->a:Ljava/lang/String;

    .line 979
    .line 980
    invoke-virtual {v12, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 981
    .line 982
    .line 983
    move-result v12

    .line 984
    if-eqz v12, :cond_34

    .line 985
    .line 986
    goto :goto_1d

    .line 987
    :cond_35
    move-object/from16 v9, v23

    .line 988
    .line 989
    :goto_1d
    check-cast v9, Lua/i;

    .line 990
    .line 991
    if-eqz v9, :cond_36

    .line 992
    .line 993
    invoke-static {v9, v4, v6}, Lig/a;->d(Lua/i;Ljava/lang/String;Lua/c;)Lua/c;

    .line 994
    .line 995
    .line 996
    move-result-object v4

    .line 997
    goto :goto_1c

    .line 998
    :cond_36
    invoke-static {v6, v4}, Lua/c;->a(Lua/c;Ljava/lang/String;)Lua/c;

    .line 999
    .line 1000
    .line 1001
    move-result-object v4

    .line 1002
    goto :goto_1c

    .line 1003
    :cond_37
    invoke-static {v5, v7, v6}, Loh/h;->t(Lp4/t;Ljava/util/List;Lua/c;)Lua/c;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v4

    .line 1007
    goto :goto_1c

    .line 1008
    :goto_1e
    iget-boolean v4, v6, Lua/c;->b:Z

    .line 1009
    .line 1010
    if-eqz v4, :cond_5a

    .line 1011
    .line 1012
    move-object v4, v5

    .line 1013
    iget-object v5, v0, Lua/a;->a:Lua/b;

    .line 1014
    .line 1015
    iget-object v7, v5, Lua/b;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1016
    .line 1017
    invoke-static {v11}, Lua/b;->n(Lua/d;)Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v8

    .line 1021
    const-string v9, "::"

    .line 1022
    .line 1023
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v9

    .line 1027
    if-eqz v9, :cond_38

    .line 1028
    .line 1029
    goto :goto_20

    .line 1030
    :cond_38
    invoke-virtual {v7}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 1031
    .line 1032
    .line 1033
    move-result v9

    .line 1034
    const/16 v12, 0x40

    .line 1035
    .line 1036
    if-ge v9, v12, :cond_39

    .line 1037
    .line 1038
    goto :goto_1f

    .line 1039
    :cond_39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1040
    .line 1041
    .line 1042
    move-result-wide v14

    .line 1043
    const-wide/32 v19, 0x36ee80

    .line 1044
    .line 1045
    .line 1046
    sub-long v14, v14, v19

    .line 1047
    .line 1048
    invoke-virtual {v7}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v9

    .line 1052
    new-instance v12, Lca/c;

    .line 1053
    .line 1054
    const/16 v13, 0xd

    .line 1055
    .line 1056
    invoke-direct {v12, v14, v15, v13}, Lca/c;-><init>(JI)V

    .line 1057
    .line 1058
    .line 1059
    new-instance v13, Lbe/i;

    .line 1060
    .line 1061
    const/16 v14, 0x1b

    .line 1062
    .line 1063
    invoke-direct {v13, v12, v14}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 1064
    .line 1065
    .line 1066
    invoke-interface {v9, v13}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 1067
    .line 1068
    .line 1069
    :goto_1f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1070
    .line 1071
    .line 1072
    move-result-wide v12

    .line 1073
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v9

    .line 1077
    invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v7

    .line 1081
    if-nez v7, :cond_5a

    .line 1082
    .line 1083
    :goto_20
    iget-wide v12, v11, Lua/d;->g:D

    .line 1084
    .line 1085
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v7

    .line 1089
    if-eqz v7, :cond_3a

    .line 1090
    .line 1091
    goto :goto_21

    .line 1092
    :cond_3a
    move-object v2, v10

    .line 1093
    :goto_21
    iget-boolean v7, v3, Lk8/o;->h:Z

    .line 1094
    .line 1095
    if-nez v7, :cond_3c

    .line 1096
    .line 1097
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1098
    .line 1099
    .line 1100
    const-string v7, "@chatroom"

    .line 1101
    .line 1102
    const/4 v8, 0x0

    .line 1103
    invoke-static {v1, v7, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v7

    .line 1107
    if-eqz v7, :cond_3b

    .line 1108
    .line 1109
    goto :goto_22

    .line 1110
    :cond_3b
    const/4 v7, 0x0

    .line 1111
    goto :goto_23

    .line 1112
    :cond_3c
    :goto_22
    const/4 v7, 0x1

    .line 1113
    :goto_23
    iget-boolean v9, v6, Lua/c;->q:Z

    .line 1114
    .line 1115
    iget-object v10, v6, Lua/c;->i:Ljava/lang/String;

    .line 1116
    .line 1117
    iget-object v14, v6, Lua/c;->j:Ljava/lang/String;

    .line 1118
    .line 1119
    if-nez v9, :cond_3d

    .line 1120
    .line 1121
    const/4 v0, 0x0

    .line 1122
    goto :goto_24

    .line 1123
    :cond_3d
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v9

    .line 1127
    const/16 v15, 0xb

    .line 1128
    .line 1129
    invoke-virtual {v9, v15}, Ljava/util/Calendar;->get(I)I

    .line 1130
    .line 1131
    .line 1132
    move-result v15

    .line 1133
    mul-int/lit16 v15, v15, 0xe10

    .line 1134
    .line 1135
    const/16 v8, 0xc

    .line 1136
    .line 1137
    invoke-virtual {v9, v8}, Ljava/util/Calendar;->get(I)I

    .line 1138
    .line 1139
    .line 1140
    move-result v8

    .line 1141
    mul-int/lit8 v8, v8, 0x3c

    .line 1142
    .line 1143
    add-int/2addr v8, v15

    .line 1144
    const/16 v15, 0xd

    .line 1145
    .line 1146
    invoke-virtual {v9, v15}, Ljava/util/Calendar;->get(I)I

    .line 1147
    .line 1148
    .line 1149
    move-result v9

    .line 1150
    add-int/2addr v9, v8

    .line 1151
    iget v8, v6, Lua/c;->r:I

    .line 1152
    .line 1153
    const v15, 0x1517f

    .line 1154
    .line 1155
    .line 1156
    const/4 v0, 0x0

    .line 1157
    invoke-static {v8, v0, v15}, Lr9/e0;->r(III)I

    .line 1158
    .line 1159
    .line 1160
    move-result v8

    .line 1161
    iget v3, v6, Lua/c;->s:I

    .line 1162
    .line 1163
    invoke-static {v3, v0, v15}, Lr9/e0;->r(III)I

    .line 1164
    .line 1165
    .line 1166
    move-result v3

    .line 1167
    if-gt v8, v3, :cond_3e

    .line 1168
    .line 1169
    if-gt v8, v9, :cond_3f

    .line 1170
    .line 1171
    if-gt v9, v3, :cond_3f

    .line 1172
    .line 1173
    goto/16 :goto_2e

    .line 1174
    .line 1175
    :cond_3e
    if-ge v9, v8, :cond_53

    .line 1176
    .line 1177
    if-gt v9, v3, :cond_3f

    .line 1178
    .line 1179
    goto/16 :goto_2e

    .line 1180
    .line 1181
    :cond_3f
    :goto_24
    iget v3, v6, Lua/c;->h:I

    .line 1182
    .line 1183
    const/4 v8, 0x1

    .line 1184
    if-eq v3, v8, :cond_43

    .line 1185
    .line 1186
    const/4 v8, 0x2

    .line 1187
    if-eq v3, v8, :cond_40

    .line 1188
    .line 1189
    goto :goto_26

    .line 1190
    :cond_40
    invoke-static {v2, v14}, Lua/b;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1191
    .line 1192
    .line 1193
    move-result v2

    .line 1194
    if-nez v2, :cond_41

    .line 1195
    .line 1196
    if-eqz v7, :cond_45

    .line 1197
    .line 1198
    invoke-static {v1, v14}, Lua/b;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1199
    .line 1200
    .line 1201
    move-result v1

    .line 1202
    if-eqz v1, :cond_45

    .line 1203
    .line 1204
    :cond_41
    const-string v23, "\u9ed1\u540d\u5355"

    .line 1205
    .line 1206
    :cond_42
    :goto_25
    move-object/from16 v2, v23

    .line 1207
    .line 1208
    goto/16 :goto_2f

    .line 1209
    .line 1210
    :cond_43
    invoke-static {v2, v10}, Lua/b;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v2

    .line 1214
    if-nez v2, :cond_45

    .line 1215
    .line 1216
    if-eqz v7, :cond_44

    .line 1217
    .line 1218
    invoke-static {v1, v10}, Lua/b;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v1

    .line 1222
    if-eqz v1, :cond_44

    .line 1223
    .line 1224
    goto :goto_26

    .line 1225
    :cond_44
    const-string v23, "\u975e\u767d\u540d\u5355"

    .line 1226
    .line 1227
    goto :goto_25

    .line 1228
    :cond_45
    :goto_26
    iget-boolean v1, v6, Lua/c;->k:Z

    .line 1229
    .line 1230
    if-eqz v1, :cond_4b

    .line 1231
    .line 1232
    iget-object v1, v6, Lua/c;->m:Ljava/lang/String;

    .line 1233
    .line 1234
    invoke-static {v1}, Log/s;->U(Ljava/lang/String;)Ljava/lang/Double;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v1

    .line 1238
    if-eqz v1, :cond_46

    .line 1239
    .line 1240
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 1241
    .line 1242
    .line 1243
    move-result-wide v1

    .line 1244
    goto :goto_27

    .line 1245
    :cond_46
    const-wide/16 v1, 0x0

    .line 1246
    .line 1247
    :goto_27
    iget v3, v6, Lua/c;->l:I

    .line 1248
    .line 1249
    if-eqz v3, :cond_49

    .line 1250
    .line 1251
    const/4 v8, 0x2

    .line 1252
    if-eq v3, v8, :cond_48

    .line 1253
    .line 1254
    cmpg-double v1, v12, v1

    .line 1255
    .line 1256
    if-gez v1, :cond_47

    .line 1257
    .line 1258
    :goto_28
    const/4 v8, 0x1

    .line 1259
    goto :goto_29

    .line 1260
    :cond_47
    move v8, v0

    .line 1261
    goto :goto_29

    .line 1262
    :cond_48
    sub-double/2addr v12, v1

    .line 1263
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    .line 1264
    .line 1265
    .line 1266
    move-result-wide v1

    .line 1267
    const-wide v7, 0x3f847ae147ae147bL    # 0.01

    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    cmpg-double v1, v1, v7

    .line 1273
    .line 1274
    if-gez v1, :cond_47

    .line 1275
    .line 1276
    goto :goto_28

    .line 1277
    :cond_49
    cmpl-double v1, v12, v1

    .line 1278
    .line 1279
    if-lez v1, :cond_47

    .line 1280
    .line 1281
    goto :goto_28

    .line 1282
    :goto_29
    iget v1, v6, Lua/c;->n:I

    .line 1283
    .line 1284
    const-string v2, "\u91d1\u989d\u89c4\u5219"

    .line 1285
    .line 1286
    if-nez v1, :cond_4a

    .line 1287
    .line 1288
    if-eqz v8, :cond_4a

    .line 1289
    .line 1290
    goto/16 :goto_2f

    .line 1291
    .line 1292
    :cond_4a
    const/4 v3, 0x1

    .line 1293
    if-ne v1, v3, :cond_4b

    .line 1294
    .line 1295
    if-nez v8, :cond_4b

    .line 1296
    .line 1297
    goto/16 :goto_2f

    .line 1298
    .line 1299
    :cond_4b
    iget v1, v6, Lua/c;->o:I

    .line 1300
    .line 1301
    iget-object v2, v11, Lua/d;->j:Ljava/lang/String;

    .line 1302
    .line 1303
    iget-object v3, v6, Lua/c;->p:Ljava/lang/String;

    .line 1304
    .line 1305
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1306
    .line 1307
    .line 1308
    move-result v7

    .line 1309
    if-nez v7, :cond_51

    .line 1310
    .line 1311
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1312
    .line 1313
    .line 1314
    move-result v7

    .line 1315
    if-eqz v7, :cond_4c

    .line 1316
    .line 1317
    goto :goto_2c

    .line 1318
    :cond_4c
    const-string v7, ","

    .line 1319
    .line 1320
    const-string v8, "\uff0c"

    .line 1321
    .line 1322
    const-string v9, "|"

    .line 1323
    .line 1324
    filled-new-array {v9, v7, v8}, [Ljava/lang/String;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v7

    .line 1328
    invoke-static {v3, v7}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v3

    .line 1332
    new-instance v7, Ljava/util/ArrayList;

    .line 1333
    .line 1334
    invoke-static {v3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1335
    .line 1336
    .line 1337
    move-result v8

    .line 1338
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1339
    .line 1340
    .line 1341
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v3

    .line 1345
    :goto_2a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1346
    .line 1347
    .line 1348
    move-result v8

    .line 1349
    if-eqz v8, :cond_4d

    .line 1350
    .line 1351
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v8

    .line 1355
    check-cast v8, Ljava/lang/String;

    .line 1356
    .line 1357
    invoke-static {v8, v7}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1358
    .line 1359
    .line 1360
    goto :goto_2a

    .line 1361
    :cond_4d
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1362
    .line 1363
    .line 1364
    move-result v3

    .line 1365
    if-eqz v3, :cond_4e

    .line 1366
    .line 1367
    move v10, v0

    .line 1368
    const/4 v8, 0x1

    .line 1369
    goto :goto_2d

    .line 1370
    :cond_4e
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v3

    .line 1374
    :cond_4f
    :goto_2b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1375
    .line 1376
    .line 1377
    move-result v7

    .line 1378
    if-eqz v7, :cond_51

    .line 1379
    .line 1380
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v7

    .line 1384
    check-cast v7, Ljava/lang/String;

    .line 1385
    .line 1386
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1387
    .line 1388
    .line 1389
    move-result v8

    .line 1390
    if-lez v8, :cond_50

    .line 1391
    .line 1392
    const/4 v8, 0x1

    .line 1393
    invoke-static {v2, v7, v8}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1394
    .line 1395
    .line 1396
    move-result v7

    .line 1397
    if-eqz v7, :cond_4f

    .line 1398
    .line 1399
    move v10, v8

    .line 1400
    goto :goto_2d

    .line 1401
    :cond_50
    const/4 v8, 0x1

    .line 1402
    goto :goto_2b

    .line 1403
    :cond_51
    :goto_2c
    const/4 v8, 0x1

    .line 1404
    move v10, v0

    .line 1405
    :goto_2d
    if-ne v1, v8, :cond_52

    .line 1406
    .line 1407
    if-nez v10, :cond_52

    .line 1408
    .line 1409
    const-string v23, "\u7f3a\u5c11\u5173\u952e\u8bcd"

    .line 1410
    .line 1411
    goto/16 :goto_25

    .line 1412
    .line 1413
    :cond_52
    const/4 v8, 0x2

    .line 1414
    if-ne v1, v8, :cond_42

    .line 1415
    .line 1416
    if-eqz v10, :cond_42

    .line 1417
    .line 1418
    const-string v23, "\u5173\u952e\u8bcd\u89c4\u5219"

    .line 1419
    .line 1420
    goto/16 :goto_25

    .line 1421
    .line 1422
    :cond_53
    :goto_2e
    const-string v23, "\u5f53\u524d\u5904\u4e8e\u7981\u6536\u65f6\u6bb5"

    .line 1423
    .line 1424
    goto/16 :goto_25

    .line 1425
    .line 1426
    :goto_2f
    iget v0, v6, Lua/c;->c:I

    .line 1427
    .line 1428
    const/4 v8, 0x1

    .line 1429
    if-eq v0, v8, :cond_55

    .line 1430
    .line 1431
    iget-wide v0, v6, Lua/c;->d:J

    .line 1432
    .line 1433
    cmp-long v3, v0, v17

    .line 1434
    .line 1435
    if-gez v3, :cond_54

    .line 1436
    .line 1437
    move-wide/from16 v8, v17

    .line 1438
    .line 1439
    goto :goto_31

    .line 1440
    :cond_54
    :goto_30
    move-wide v8, v0

    .line 1441
    goto :goto_31

    .line 1442
    :cond_55
    iget-wide v0, v6, Lua/c;->e:J

    .line 1443
    .line 1444
    cmp-long v3, v0, v17

    .line 1445
    .line 1446
    if-gez v3, :cond_56

    .line 1447
    .line 1448
    move-wide/from16 v0, v17

    .line 1449
    .line 1450
    :cond_56
    iget-wide v7, v6, Lua/c;->f:J

    .line 1451
    .line 1452
    cmp-long v3, v7, v0

    .line 1453
    .line 1454
    if-gez v3, :cond_57

    .line 1455
    .line 1456
    move-wide v7, v0

    .line 1457
    :cond_57
    cmp-long v3, v7, v0

    .line 1458
    .line 1459
    if-gtz v3, :cond_58

    .line 1460
    .line 1461
    goto :goto_30

    .line 1462
    :cond_58
    const-wide/16 v9, 0x1

    .line 1463
    .line 1464
    add-long/2addr v7, v9

    .line 1465
    sget-object v3, Ljg/d;->g:Ljg/a;

    .line 1466
    .line 1467
    invoke-virtual {v3, v0, v1, v7, v8}, Ljg/d;->e(JJ)J

    .line 1468
    .line 1469
    .line 1470
    move-result-wide v0

    .line 1471
    goto :goto_30

    .line 1472
    :goto_31
    new-instance v1, Lc9/w;

    .line 1473
    .line 1474
    move-object/from16 v3, p1

    .line 1475
    .line 1476
    move-object v7, v11

    .line 1477
    invoke-direct/range {v1 .. v7}, Lc9/w;-><init>(Ljava/lang/String;Lk8/o;Lp4/t;Lua/b;Lua/c;Lua/d;)V

    .line 1478
    .line 1479
    .line 1480
    cmp-long v0, v8, v17

    .line 1481
    .line 1482
    if-lez v0, :cond_59

    .line 1483
    .line 1484
    iget-object v0, v5, Lua/b;->e:Landroid/os/Handler;

    .line 1485
    .line 1486
    invoke-virtual {v0, v1, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1487
    .line 1488
    .line 1489
    return-void

    .line 1490
    :cond_59
    invoke-virtual {v1}, Lc9/w;->run()V

    .line 1491
    .line 1492
    .line 1493
    :cond_5a
    :goto_32
    return-void
.end method
