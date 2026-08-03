.class public final synthetic Lna/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lg8/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lna/f;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lna/f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lb/e;)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lna/f;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, Lna/f;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lhb/r;

    .line 13
    .line 14
    iget-object v3, v2, Lhb/r;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    sget-object v4, Ltf/v;->g:Ltf/v;

    .line 19
    .line 20
    iget-object v5, v2, Lhb/r;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    iget-object v6, v2, Lhb/r;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, Landroid/content/SharedPreferences;

    .line 27
    .line 28
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 29
    .line 30
    invoke-virtual {v0}, Lb/e;->w()Z

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    iget-object v9, v0, Lb/e;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v9, Ll8/a;

    .line 37
    .line 38
    iget-object v9, v9, Ll8/a;->d:Landroid/content/ContentValues;

    .line 39
    .line 40
    const/4 v10, 0x1

    .line 41
    if-eqz v9, :cond_0

    .line 42
    .line 43
    const-string v12, "roomdata"

    .line 44
    .line 45
    invoke-virtual {v9, v12}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    if-eqz v9, :cond_0

    .line 50
    .line 51
    move v9, v10

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v9, 0x0

    .line 54
    :goto_0
    if-nez v8, :cond_1

    .line 55
    .line 56
    if-nez v9, :cond_1

    .line 57
    .line 58
    goto/16 :goto_1a

    .line 59
    .line 60
    :cond_1
    invoke-virtual {v0}, Lb/e;->n()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v13

    .line 75
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-nez v9, :cond_2

    .line 80
    .line 81
    goto/16 :goto_1a

    .line 82
    .line 83
    :cond_2
    iget-object v9, v0, Lb/e;->i:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v9, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 86
    .line 87
    if-eqz v9, :cond_3

    .line 88
    .line 89
    iget-object v9, v9, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 90
    .line 91
    if-eqz v9, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    if-eqz v9, :cond_4

    .line 99
    .line 100
    invoke-virtual {v0}, Lb/e;->n()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    invoke-virtual {v9, v14}, Lg8/d;->i(Ljava/lang/String;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    const/4 v9, 0x0

    .line 110
    :goto_1
    if-eqz v9, :cond_5

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    move-object v9, v7

    .line 114
    :goto_2
    new-instance v14, Ldg/n;

    .line 115
    .line 116
    const/4 v15, 0x6

    .line 117
    invoke-direct {v14, v9, v15}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 118
    .line 119
    .line 120
    new-instance v9, Lo9/e;

    .line 121
    .line 122
    const/16 v15, 0x13

    .line 123
    .line 124
    invoke-direct {v9, v15}, Lo9/e;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-static {v14, v9}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    new-instance v14, Lo9/e;

    .line 132
    .line 133
    const/16 v15, 0x14

    .line 134
    .line 135
    invoke-direct {v14, v15}, Lo9/e;-><init>(I)V

    .line 136
    .line 137
    .line 138
    new-instance v15, Lng/i;

    .line 139
    .line 140
    invoke-direct {v15, v9, v10, v14}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 141
    .line 142
    .line 143
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 144
    .line 145
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-static {v15, v9}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v9}, Ljava/util/Set;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-eqz v14, :cond_6

    .line 156
    .line 157
    goto/16 :goto_1a

    .line 158
    .line 159
    :cond_6
    invoke-static {v13, v9, v0}, Lhb/r;->f(Ljava/lang/String;Ljava/util/LinkedHashSet;Lb/e;)Ljava/util/Map;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_7

    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    goto :goto_3

    .line 171
    :cond_7
    iget-object v14, v2, Lhb/r;->f:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v14, Ljava/util/concurrent/ConcurrentHashMap;

    .line 174
    .line 175
    invoke-virtual {v14, v13, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    check-cast v14, Ljava/util/Map;

    .line 180
    .line 181
    :goto_3
    if-eqz v8, :cond_8

    .line 182
    .line 183
    invoke-virtual {v5, v13, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    check-cast v5, Ljava/util/Set;

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    invoke-virtual {v5, v13}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    check-cast v15, Ljava/util/Set;

    .line 195
    .line 196
    if-nez v15, :cond_9

    .line 197
    .line 198
    invoke-virtual {v5, v13, v9}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    :cond_9
    move-object v5, v15

    .line 202
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 203
    .line 204
    .line 205
    move-result-wide v18

    .line 206
    if-nez v5, :cond_a

    .line 207
    .line 208
    move-object v15, v4

    .line 209
    goto :goto_5

    .line 210
    :cond_a
    move-object v15, v5

    .line 211
    check-cast v15, Ljava/lang/Iterable;

    .line 212
    .line 213
    invoke-static {v9, v15}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 214
    .line 215
    .line 216
    move-result-object v15

    .line 217
    :goto_5
    if-nez v5, :cond_b

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_b
    invoke-static {v5, v9}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    :goto_6
    invoke-virtual {v3, v13}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v16

    .line 228
    move-object/from16 v10, v16

    .line 229
    .line 230
    check-cast v10, Ljava/lang/Long;

    .line 231
    .line 232
    if-eqz v10, :cond_d

    .line 233
    .line 234
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 235
    .line 236
    .line 237
    move-result-wide v20

    .line 238
    cmp-long v16, v18, v20

    .line 239
    .line 240
    if-gtz v16, :cond_c

    .line 241
    .line 242
    const/4 v10, 0x1

    .line 243
    goto :goto_7

    .line 244
    :cond_c
    invoke-virtual {v3, v13, v10}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    :cond_d
    const/4 v10, 0x0

    .line 248
    :goto_7
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    const/16 v12, 0xa

    .line 253
    .line 254
    if-eqz v4, :cond_e

    .line 255
    .line 256
    invoke-interface {v15}, Ljava/util/Set;->size()I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    if-lt v4, v12, :cond_e

    .line 261
    .line 262
    const/4 v4, 0x1

    .line 263
    goto :goto_8

    .line 264
    :cond_e
    const/4 v4, 0x0

    .line 265
    :goto_8
    const-string v15, ""

    .line 266
    .line 267
    if-nez v10, :cond_16

    .line 268
    .line 269
    if-nez v4, :cond_16

    .line 270
    .line 271
    if-eqz v14, :cond_16

    .line 272
    .line 273
    if-eqz v5, :cond_16

    .line 274
    .line 275
    move-object v10, v5

    .line 276
    check-cast v10, Ljava/lang/Iterable;

    .line 277
    .line 278
    invoke-static {v10, v9}, Ltf/m;->x1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 279
    .line 280
    .line 281
    move-result-object v9

    .line 282
    new-instance v10, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v17

    .line 295
    if-eqz v17, :cond_15

    .line 296
    .line 297
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v17

    .line 301
    move-object/from16 v11, v17

    .line 302
    .line 303
    check-cast v11, Ljava/lang/String;

    .line 304
    .line 305
    invoke-interface {v14, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v17

    .line 309
    check-cast v17, Ljava/lang/String;

    .line 310
    .line 311
    if-eqz v17, :cond_f

    .line 312
    .line 313
    invoke-static/range {v17 .. v17}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 314
    .line 315
    .line 316
    move-result-object v17

    .line 317
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v17

    .line 321
    goto :goto_a

    .line 322
    :cond_f
    const/16 v17, 0x0

    .line 323
    .line 324
    :goto_a
    if-nez v17, :cond_10

    .line 325
    .line 326
    move-object v12, v15

    .line 327
    goto :goto_b

    .line 328
    :cond_10
    move-object/from16 v12, v17

    .line 329
    .line 330
    :goto_b
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v17

    .line 334
    check-cast v17, Ljava/lang/String;

    .line 335
    .line 336
    if-eqz v17, :cond_11

    .line 337
    .line 338
    invoke-static/range {v17 .. v17}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 339
    .line 340
    .line 341
    move-result-object v17

    .line 342
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v17

    .line 346
    goto :goto_c

    .line 347
    :cond_11
    const/16 v17, 0x0

    .line 348
    .line 349
    :goto_c
    move-object/from16 v21, v0

    .line 350
    .line 351
    if-nez v17, :cond_12

    .line 352
    .line 353
    move-object v0, v15

    .line 354
    goto :goto_d

    .line 355
    :cond_12
    move-object/from16 v0, v17

    .line 356
    .line 357
    :goto_d
    invoke-virtual {v12, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v17

    .line 361
    move/from16 v22, v4

    .line 362
    .line 363
    if-eqz v17, :cond_13

    .line 364
    .line 365
    const/4 v4, 0x0

    .line 366
    goto :goto_e

    .line 367
    :cond_13
    new-instance v4, Lq9/d;

    .line 368
    .line 369
    invoke-direct {v4, v11, v12, v0}, Lq9/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    :goto_e
    if-eqz v4, :cond_14

    .line 373
    .line 374
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    :cond_14
    move-object/from16 v0, v21

    .line 378
    .line 379
    move/from16 v4, v22

    .line 380
    .line 381
    const/16 v12, 0xa

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_15
    move/from16 v22, v4

    .line 385
    .line 386
    goto :goto_f

    .line 387
    :cond_16
    move/from16 v22, v4

    .line 388
    .line 389
    move-object v10, v7

    .line 390
    :goto_f
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    const/16 v4, 0xa

    .line 395
    .line 396
    if-lt v0, v4, :cond_17

    .line 397
    .line 398
    const/4 v10, 0x0

    .line 399
    :cond_17
    if-nez v10, :cond_18

    .line 400
    .line 401
    goto :goto_10

    .line 402
    :cond_18
    move-object v7, v10

    .line 403
    :goto_10
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-eqz v0, :cond_25

    .line 412
    .line 413
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    move-object v7, v0

    .line 418
    check-cast v7, Lq9/d;

    .line 419
    .line 420
    const-string v0, "group_rename_notice_enable"

    .line 421
    .line 422
    const/4 v9, 0x0

    .line 423
    invoke-interface {v6, v0, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_1b

    .line 428
    .line 429
    const-string v0, "group_rename_notice_scope"

    .line 430
    .line 431
    const-string v9, "all"

    .line 432
    .line 433
    invoke-interface {v6, v0, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    if-eqz v0, :cond_19

    .line 438
    .line 439
    move-object v9, v0

    .line 440
    :cond_19
    const-string v0, "specific"

    .line 441
    .line 442
    invoke-virtual {v9, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    if-eqz v0, :cond_1c

    .line 447
    .line 448
    const-string v0, "group_rename_notice_groups"

    .line 449
    .line 450
    invoke-interface {v6, v0, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    if-nez v0, :cond_1a

    .line 455
    .line 456
    move-object v0, v15

    .line 457
    :cond_1a
    invoke-static {v0}, Lhb/r;->t(Ljava/lang/String;)Ljava/util/Set;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-interface {v0, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_1b

    .line 466
    .line 467
    goto :goto_13

    .line 468
    :cond_1b
    move-object/from16 p1, v4

    .line 469
    .line 470
    move-object/from16 v21, v5

    .line 471
    .line 472
    move/from16 v23, v8

    .line 473
    .line 474
    :goto_12
    move-object v4, v15

    .line 475
    const/4 v5, 0x0

    .line 476
    goto/16 :goto_18

    .line 477
    .line 478
    :cond_1c
    :goto_13
    iget-object v0, v2, Lhb/r;->b:Ljava/lang/Object;

    .line 479
    .line 480
    move-object v9, v0

    .line 481
    check-cast v9, Lia/t;

    .line 482
    .line 483
    const-string v0, "\u6539\u540d\u7cfb\u7edf\u6d88\u606f\u63d2\u5165\u5931\u8d25: "

    .line 484
    .line 485
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 486
    .line 487
    .line 488
    move-result-wide v10

    .line 489
    iget-object v12, v2, Lhb/r;->h:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v12, Ljava/util/concurrent/ConcurrentHashMap;

    .line 492
    .line 493
    invoke-virtual {v12}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 494
    .line 495
    .line 496
    move-result v14

    .line 497
    move-object/from16 p1, v4

    .line 498
    .line 499
    const/16 v4, 0x80

    .line 500
    .line 501
    if-lt v14, v4, :cond_1d

    .line 502
    .line 503
    invoke-virtual {v12}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    new-instance v14, Lca/c;

    .line 508
    .line 509
    move-object/from16 v21, v5

    .line 510
    .line 511
    const/16 v5, 0xa

    .line 512
    .line 513
    invoke-direct {v14, v10, v11, v5}, Lca/c;-><init>(JI)V

    .line 514
    .line 515
    .line 516
    new-instance v5, Lbe/i;

    .line 517
    .line 518
    move/from16 v23, v8

    .line 519
    .line 520
    const/16 v8, 0x16

    .line 521
    .line 522
    invoke-direct {v5, v14, v8}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 523
    .line 524
    .line 525
    invoke-interface {v4, v5}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 526
    .line 527
    .line 528
    goto :goto_14

    .line 529
    :cond_1d
    move-object/from16 v21, v5

    .line 530
    .line 531
    move/from16 v23, v8

    .line 532
    .line 533
    :goto_14
    iget-object v4, v7, Lq9/d;->a:Ljava/lang/String;

    .line 534
    .line 535
    iget-object v5, v7, Lq9/d;->b:Ljava/lang/String;

    .line 536
    .line 537
    iget-object v8, v7, Lq9/d;->c:Ljava/lang/String;

    .line 538
    .line 539
    new-instance v14, Ljava/lang/StringBuilder;

    .line 540
    .line 541
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    move-wide/from16 v24, v10

    .line 548
    .line 549
    const-string v10, "|"

    .line 550
    .line 551
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-static {v14, v10, v8}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v4

    .line 567
    invoke-virtual {v12, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    check-cast v5, Ljava/lang/Long;

    .line 572
    .line 573
    if-eqz v5, :cond_1e

    .line 574
    .line 575
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 576
    .line 577
    .line 578
    move-result-wide v10

    .line 579
    sub-long v10, v24, v10

    .line 580
    .line 581
    const-wide/16 v26, 0x1388

    .line 582
    .line 583
    cmp-long v5, v10, v26

    .line 584
    .line 585
    if-gez v5, :cond_1e

    .line 586
    .line 587
    goto :goto_12

    .line 588
    :cond_1e
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    invoke-virtual {v12, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 596
    .line 597
    .line 598
    move-result-object v4

    .line 599
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->h()Lk8/e;

    .line 603
    .line 604
    .line 605
    move-result-object v12

    .line 606
    if-nez v12, :cond_1f

    .line 607
    .line 608
    const-string v0, "\u6539\u540d\u7cfb\u7edf\u6d88\u606f\u63d2\u5165\u5931\u8d25: \u672c\u5730\u6d88\u606f API \u672a\u5c31\u7eea"

    .line 609
    .line 610
    const/4 v4, 0x0

    .line 611
    invoke-virtual {v9, v0, v4}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-object v5, v4

    .line 615
    move-object v4, v15

    .line 616
    goto :goto_18

    .line 617
    :cond_1f
    const/4 v4, 0x0

    .line 618
    :try_start_0
    invoke-virtual {v12}, Lk8/e;->c()V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2, v13, v7}, Lhb/r;->d(Ljava/lang/String;Lq9/d;)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 625
    const/16 v17, 0x1

    .line 626
    .line 627
    move-object v5, v4

    .line 628
    move-object v4, v15

    .line 629
    move-wide/from16 v15, v24

    .line 630
    .line 631
    :try_start_1
    invoke-virtual/range {v12 .. v17}, Lk8/e;->e(Ljava/lang/String;Ljava/lang/String;JZ)J

    .line 632
    .line 633
    .line 634
    move-result-wide v10

    .line 635
    const-wide/16 v14, 0x0

    .line 636
    .line 637
    cmp-long v8, v10, v14

    .line 638
    .line 639
    if-gtz v8, :cond_20

    .line 640
    .line 641
    iget-object v8, v7, Lq9/d;->a:Ljava/lang/String;

    .line 642
    .line 643
    new-instance v10, Ljava/lang/StringBuilder;

    .line 644
    .line 645
    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    const-string v0, "/"

    .line 652
    .line 653
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-virtual {v9, v0, v5}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    goto :goto_15

    .line 667
    :catchall_0
    move-exception v0

    .line 668
    goto :goto_16

    .line 669
    :cond_20
    :goto_15
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 670
    .line 671
    goto :goto_17

    .line 672
    :catchall_1
    move-exception v0

    .line 673
    move-object v5, v4

    .line 674
    move-object v4, v15

    .line 675
    :goto_16
    new-instance v8, Lsf/f;

    .line 676
    .line 677
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 678
    .line 679
    .line 680
    move-object v0, v8

    .line 681
    :goto_17
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    if-eqz v0, :cond_21

    .line 686
    .line 687
    const-string v8, "\u6539\u540d\u7cfb\u7edf\u6d88\u606f\u63d2\u5165\u5f02\u5e38"

    .line 688
    .line 689
    invoke-virtual {v9, v8, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    :cond_21
    :goto_18
    const-string v0, "group_rename_send_enable"

    .line 693
    .line 694
    const/4 v9, 0x0

    .line 695
    invoke-interface {v6, v0, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 696
    .line 697
    .line 698
    move-result v0

    .line 699
    if-nez v0, :cond_22

    .line 700
    .line 701
    goto :goto_19

    .line 702
    :cond_22
    const-string v0, "group_rename_listen_groups"

    .line 703
    .line 704
    invoke-interface {v6, v0, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v15

    .line 708
    if-nez v15, :cond_23

    .line 709
    .line 710
    move-object v15, v4

    .line 711
    :cond_23
    invoke-static {v15}, Lhb/r;->t(Ljava/lang/String;)Ljava/util/Set;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-interface {v0, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v0

    .line 719
    if-nez v0, :cond_24

    .line 720
    .line 721
    goto :goto_19

    .line 722
    :cond_24
    new-instance v0, Ljava/lang/Thread;

    .line 723
    .line 724
    new-instance v8, Lac/l;

    .line 725
    .line 726
    const/16 v10, 0x1b

    .line 727
    .line 728
    invoke-direct {v8, v10, v2, v7, v13}, Lac/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    const-string v7, "Hchat-GroupRenameMonitor"

    .line 732
    .line 733
    invoke-direct {v0, v8, v7}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 737
    .line 738
    .line 739
    :goto_19
    move-object v15, v4

    .line 740
    move-object/from16 v5, v21

    .line 741
    .line 742
    move/from16 v8, v23

    .line 743
    .line 744
    move-object/from16 v4, p1

    .line 745
    .line 746
    goto/16 :goto_11

    .line 747
    .line 748
    :cond_25
    move-object/from16 v21, v5

    .line 749
    .line 750
    move/from16 v23, v8

    .line 751
    .line 752
    if-eqz v21, :cond_26

    .line 753
    .line 754
    if-eqz v23, :cond_27

    .line 755
    .line 756
    if-eqz v22, :cond_27

    .line 757
    .line 758
    :cond_26
    const-wide/16 v4, 0x3a98

    .line 759
    .line 760
    add-long v18, v18, v4

    .line 761
    .line 762
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    invoke-virtual {v3, v13, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    :cond_27
    :goto_1a
    return-void

    .line 770
    :pswitch_0
    iget-object v2, v1, Lna/f;->b:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v2, Lo9/p;

    .line 773
    .line 774
    iget-object v3, v2, Lo9/p;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 775
    .line 776
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 777
    .line 778
    iget-object v5, v2, Lo9/p;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 779
    .line 780
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 781
    .line 782
    .line 783
    move-result-wide v6

    .line 784
    invoke-virtual {v0}, Lb/e;->w()Z

    .line 785
    .line 786
    .line 787
    move-result v8

    .line 788
    iget-object v9, v0, Lb/e;->i:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast v9, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 791
    .line 792
    iget-object v10, v0, Lb/e;->h:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast v10, Ll8/a;

    .line 795
    .line 796
    iget-object v10, v10, Ll8/a;->d:Landroid/content/ContentValues;

    .line 797
    .line 798
    if-eqz v10, :cond_28

    .line 799
    .line 800
    const-string v13, "roomdata"

    .line 801
    .line 802
    invoke-virtual {v10, v13}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 803
    .line 804
    .line 805
    move-result v10

    .line 806
    if-eqz v10, :cond_28

    .line 807
    .line 808
    const/4 v10, 0x1

    .line 809
    goto :goto_1b

    .line 810
    :cond_28
    const/4 v10, 0x0

    .line 811
    :goto_1b
    if-nez v8, :cond_29

    .line 812
    .line 813
    if-nez v10, :cond_29

    .line 814
    .line 815
    goto/16 :goto_30

    .line 816
    .line 817
    :cond_29
    invoke-virtual {v0}, Lb/e;->n()Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v13

    .line 821
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    invoke-static {v13}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 825
    .line 826
    .line 827
    move-result-object v13

    .line 828
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v15

    .line 832
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 833
    .line 834
    .line 835
    move-result v13

    .line 836
    if-nez v13, :cond_2a

    .line 837
    .line 838
    goto/16 :goto_30

    .line 839
    .line 840
    :cond_2a
    const-string v13, "|"

    .line 841
    .line 842
    if-eqz v10, :cond_2b

    .line 843
    .line 844
    invoke-virtual {v3, v15}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v10

    .line 848
    check-cast v10, Ljava/lang/Long;

    .line 849
    .line 850
    if-eqz v10, :cond_2d

    .line 851
    .line 852
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 853
    .line 854
    .line 855
    move-result-wide v16

    .line 856
    cmp-long v14, v6, v16

    .line 857
    .line 858
    if-gtz v14, :cond_2c

    .line 859
    .line 860
    invoke-virtual {v2, v15}, Lo9/p;->g(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    :cond_2b
    move-object/from16 v17, v4

    .line 864
    .line 865
    move-wide/from16 v18, v6

    .line 866
    .line 867
    goto/16 :goto_1f

    .line 868
    .line 869
    :cond_2c
    invoke-virtual {v3, v15, v10}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    :cond_2d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 873
    .line 874
    .line 875
    move-result-wide v11

    .line 876
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 877
    .line 878
    .line 879
    move-result v14

    .line 880
    if-nez v14, :cond_2e

    .line 881
    .line 882
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 883
    .line 884
    .line 885
    move-result-object v14

    .line 886
    new-instance v10, Lca/c;

    .line 887
    .line 888
    move-object/from16 v17, v4

    .line 889
    .line 890
    const/16 v4, 0x8

    .line 891
    .line 892
    invoke-direct {v10, v11, v12, v4}, Lca/c;-><init>(JI)V

    .line 893
    .line 894
    .line 895
    new-instance v4, Lbe/i;

    .line 896
    .line 897
    const/16 v11, 0x13

    .line 898
    .line 899
    invoke-direct {v4, v10, v11}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 900
    .line 901
    .line 902
    invoke-interface {v14, v4}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 903
    .line 904
    .line 905
    goto :goto_1c

    .line 906
    :cond_2e
    move-object/from16 v17, v4

    .line 907
    .line 908
    :goto_1c
    invoke-virtual {v15, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v4

    .line 912
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 913
    .line 914
    .line 915
    move-result-object v10

    .line 916
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 917
    .line 918
    .line 919
    check-cast v10, Ljava/lang/Iterable;

    .line 920
    .line 921
    new-instance v11, Ljava/util/ArrayList;

    .line 922
    .line 923
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 924
    .line 925
    .line 926
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 927
    .line 928
    .line 929
    move-result-object v10

    .line 930
    :goto_1d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 931
    .line 932
    .line 933
    move-result v12

    .line 934
    if-eqz v12, :cond_30

    .line 935
    .line 936
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v12

    .line 940
    move-object v14, v12

    .line 941
    check-cast v14, Ljava/util/Map$Entry;

    .line 942
    .line 943
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v14

    .line 947
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    check-cast v14, Ljava/lang/String;

    .line 951
    .line 952
    move-wide/from16 v18, v6

    .line 953
    .line 954
    const/4 v6, 0x0

    .line 955
    invoke-static {v14, v4, v6}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 956
    .line 957
    .line 958
    move-result v7

    .line 959
    if-eqz v7, :cond_2f

    .line 960
    .line 961
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 962
    .line 963
    .line 964
    :cond_2f
    move-wide/from16 v6, v18

    .line 965
    .line 966
    goto :goto_1d

    .line 967
    :cond_30
    move-wide/from16 v18, v6

    .line 968
    .line 969
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 970
    .line 971
    .line 972
    move-result-object v6

    .line 973
    :cond_31
    :goto_1e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 974
    .line 975
    .line 976
    move-result v7

    .line 977
    if-eqz v7, :cond_32

    .line 978
    .line 979
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v7

    .line 983
    check-cast v7, Ljava/util/Map$Entry;

    .line 984
    .line 985
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v10

    .line 989
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    check-cast v10, Ljava/lang/String;

    .line 993
    .line 994
    invoke-static {v10, v4}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object v10

    .line 998
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v11

    .line 1002
    check-cast v11, Lo9/l;

    .line 1003
    .line 1004
    iget v11, v11, Lo9/l;->a:I

    .line 1005
    .line 1006
    invoke-virtual {v2, v11, v15, v10}, Lo9/p;->o(ILjava/lang/String;Ljava/lang/String;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v10

    .line 1010
    if-eqz v10, :cond_31

    .line 1011
    .line 1012
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v7

    .line 1016
    invoke-virtual {v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    goto :goto_1e

    .line 1020
    :cond_32
    :goto_1f
    if-nez v8, :cond_33

    .line 1021
    .line 1022
    goto/16 :goto_30

    .line 1023
    .line 1024
    :cond_33
    iget-object v4, v2, Lo9/p;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1025
    .line 1026
    if-eqz v9, :cond_3d

    .line 1027
    .line 1028
    iget-object v7, v9, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 1029
    .line 1030
    iget-object v8, v9, Lh/Hchat/hooks/api/model/WeChatChatroom;->rawDisplayNames:Ljava/lang/String;

    .line 1031
    .line 1032
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1033
    .line 1034
    .line 1035
    move-result v10

    .line 1036
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v11

    .line 1040
    if-eqz v11, :cond_34

    .line 1041
    .line 1042
    move-object/from16 v11, v17

    .line 1043
    .line 1044
    const/16 v21, 0x0

    .line 1045
    .line 1046
    goto :goto_20

    .line 1047
    :cond_34
    const-string v11, "\n"

    .line 1048
    .line 1049
    const-string v12, ";"

    .line 1050
    .line 1051
    const-string v14, "\u0001"

    .line 1052
    .line 1053
    const/16 v21, 0x0

    .line 1054
    .line 1055
    const-string v6, "\u0002"

    .line 1056
    .line 1057
    filled-new-array {v14, v6, v11, v12}, [Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v6

    .line 1061
    invoke-static {v6}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v6

    .line 1065
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v6

    .line 1069
    :cond_35
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1070
    .line 1071
    .line 1072
    move-result v11

    .line 1073
    if-eqz v11, :cond_36

    .line 1074
    .line 1075
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v11

    .line 1079
    check-cast v11, Ljava/lang/String;

    .line 1080
    .line 1081
    filled-new-array {v11}, [Ljava/lang/String;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v11

    .line 1085
    invoke-static {v8, v11}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v11

    .line 1089
    if-lez v10, :cond_37

    .line 1090
    .line 1091
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 1092
    .line 1093
    .line 1094
    move-result v12

    .line 1095
    if-ne v12, v10, :cond_35

    .line 1096
    .line 1097
    goto :goto_20

    .line 1098
    :cond_36
    invoke-static {v8}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v11

    .line 1102
    :cond_37
    :goto_20
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 1103
    .line 1104
    .line 1105
    move-result v6

    .line 1106
    if-nez v6, :cond_3e

    .line 1107
    .line 1108
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 1109
    .line 1110
    .line 1111
    move-result v6

    .line 1112
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1113
    .line 1114
    .line 1115
    move-result v8

    .line 1116
    if-eq v6, v8, :cond_38

    .line 1117
    .line 1118
    goto :goto_23

    .line 1119
    :cond_38
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v6

    .line 1123
    const/4 v7, 0x0

    .line 1124
    :goto_21
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1125
    .line 1126
    .line 1127
    move-result v8

    .line 1128
    if-eqz v8, :cond_3e

    .line 1129
    .line 1130
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v8

    .line 1134
    add-int/lit8 v10, v7, 0x1

    .line 1135
    .line 1136
    if-ltz v7, :cond_3c

    .line 1137
    .line 1138
    check-cast v8, Ljava/lang/String;

    .line 1139
    .line 1140
    invoke-static {v7, v11}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v7

    .line 1144
    check-cast v7, Ljava/lang/String;

    .line 1145
    .line 1146
    if-eqz v7, :cond_39

    .line 1147
    .line 1148
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v7

    .line 1152
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v7

    .line 1156
    goto :goto_22

    .line 1157
    :cond_39
    move-object/from16 v7, v21

    .line 1158
    .line 1159
    :goto_22
    if-nez v7, :cond_3a

    .line 1160
    .line 1161
    const-string v7, ""

    .line 1162
    .line 1163
    :cond_3a
    invoke-static {v15, v8}, Lo9/p;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v12

    .line 1167
    invoke-virtual {v4, v12}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v12

    .line 1174
    if-nez v12, :cond_3b

    .line 1175
    .line 1176
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1177
    .line 1178
    .line 1179
    move-result v12

    .line 1180
    if-nez v12, :cond_3b

    .line 1181
    .line 1182
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v12

    .line 1186
    if-nez v12, :cond_3b

    .line 1187
    .line 1188
    invoke-static {v15, v8}, Lo9/p;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v8

    .line 1192
    invoke-virtual {v4, v8, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    :cond_3b
    move v7, v10

    .line 1196
    goto :goto_21

    .line 1197
    :cond_3c
    invoke-static {}, La/a;->Q0()V

    .line 1198
    .line 1199
    .line 1200
    throw v21

    .line 1201
    :cond_3d
    const/16 v21, 0x0

    .line 1202
    .line 1203
    :cond_3e
    :goto_23
    if-eqz v9, :cond_3f

    .line 1204
    .line 1205
    iget-object v4, v9, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 1206
    .line 1207
    if-eqz v4, :cond_3f

    .line 1208
    .line 1209
    goto :goto_25

    .line 1210
    :cond_3f
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v4

    .line 1214
    if-eqz v4, :cond_40

    .line 1215
    .line 1216
    invoke-virtual {v0}, Lb/e;->n()Ljava/lang/String;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    invoke-virtual {v4, v0}, Lg8/d;->i(Ljava/lang/String;)Ljava/util/List;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    goto :goto_24

    .line 1225
    :cond_40
    move-object/from16 v0, v21

    .line 1226
    .line 1227
    :goto_24
    if-eqz v0, :cond_41

    .line 1228
    .line 1229
    move-object v4, v0

    .line 1230
    goto :goto_25

    .line 1231
    :cond_41
    move-object/from16 v4, v17

    .line 1232
    .line 1233
    :goto_25
    new-instance v0, Ldg/n;

    .line 1234
    .line 1235
    const/4 v6, 0x6

    .line 1236
    invoke-direct {v0, v4, v6}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 1237
    .line 1238
    .line 1239
    new-instance v4, Lo9/e;

    .line 1240
    .line 1241
    const/4 v6, 0x3

    .line 1242
    invoke-direct {v4, v6}, Lo9/e;-><init>(I)V

    .line 1243
    .line 1244
    .line 1245
    invoke-static {v0, v4}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    new-instance v4, Lo9/e;

    .line 1250
    .line 1251
    const/4 v6, 0x4

    .line 1252
    invoke-direct {v4, v6}, Lo9/e;-><init>(I)V

    .line 1253
    .line 1254
    .line 1255
    new-instance v6, Lng/i;

    .line 1256
    .line 1257
    const/4 v10, 0x1

    .line 1258
    invoke-direct {v6, v0, v10, v4}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1259
    .line 1260
    .line 1261
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 1262
    .line 1263
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1264
    .line 1265
    .line 1266
    invoke-static {v6, v0}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 1267
    .line 1268
    .line 1269
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 1270
    .line 1271
    .line 1272
    move-result v4

    .line 1273
    if-eqz v4, :cond_42

    .line 1274
    .line 1275
    goto/16 :goto_30

    .line 1276
    .line 1277
    :cond_42
    invoke-virtual {v2, v15, v0}, Lo9/p;->B(Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 1278
    .line 1279
    .line 1280
    iget-object v4, v2, Lo9/p;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1281
    .line 1282
    invoke-virtual {v4, v15, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v4

    .line 1286
    check-cast v4, Ljava/util/Set;

    .line 1287
    .line 1288
    const-wide/16 v6, 0x3a98

    .line 1289
    .line 1290
    if-nez v4, :cond_43

    .line 1291
    .line 1292
    add-long v6, v18, v6

    .line 1293
    .line 1294
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v0

    .line 1298
    invoke-virtual {v3, v15, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v2, v15}, Lo9/p;->g(Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    goto/16 :goto_30

    .line 1305
    .line 1306
    :cond_43
    move-object v8, v4

    .line 1307
    check-cast v8, Ljava/lang/Iterable;

    .line 1308
    .line 1309
    invoke-static {v0, v8}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v8

    .line 1313
    invoke-static {v4, v0}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v0

    .line 1317
    invoke-interface {v8}, Ljava/util/Set;->isEmpty()Z

    .line 1318
    .line 1319
    .line 1320
    move-result v4

    .line 1321
    if-eqz v4, :cond_44

    .line 1322
    .line 1323
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 1324
    .line 1325
    .line 1326
    move-result v4

    .line 1327
    if-eqz v4, :cond_44

    .line 1328
    .line 1329
    goto/16 :goto_30

    .line 1330
    .line 1331
    :cond_44
    invoke-virtual {v3, v15}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v4

    .line 1335
    check-cast v4, Ljava/lang/Long;

    .line 1336
    .line 1337
    if-eqz v4, :cond_46

    .line 1338
    .line 1339
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 1340
    .line 1341
    .line 1342
    move-result-wide v11

    .line 1343
    cmp-long v9, v18, v11

    .line 1344
    .line 1345
    if-gtz v9, :cond_45

    .line 1346
    .line 1347
    goto :goto_26

    .line 1348
    :cond_45
    invoke-virtual {v3, v15, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1349
    .line 1350
    .line 1351
    :cond_46
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 1352
    .line 1353
    .line 1354
    move-result v4

    .line 1355
    if-eqz v4, :cond_47

    .line 1356
    .line 1357
    invoke-interface {v8}, Ljava/util/Set;->size()I

    .line 1358
    .line 1359
    .line 1360
    move-result v4

    .line 1361
    const/16 v9, 0xa

    .line 1362
    .line 1363
    if-lt v4, v9, :cond_47

    .line 1364
    .line 1365
    :goto_26
    add-long v6, v18, v6

    .line 1366
    .line 1367
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    invoke-virtual {v3, v15, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v2, v15}, Lo9/p;->g(Ljava/lang/String;)V

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v2, v15}, Lo9/p;->g(Ljava/lang/String;)V

    .line 1378
    .line 1379
    .line 1380
    goto/16 :goto_30

    .line 1381
    .line 1382
    :cond_47
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v3

    .line 1386
    :goto_27
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1387
    .line 1388
    .line 1389
    move-result v0

    .line 1390
    if-eqz v0, :cond_4e

    .line 1391
    .line 1392
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    move-object v4, v0

    .line 1397
    check-cast v4, Ljava/lang/String;

    .line 1398
    .line 1399
    iget-object v0, v2, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 1400
    .line 1401
    const-string v6, "group_leave_monitor_enable"

    .line 1402
    .line 1403
    const/4 v7, 0x0

    .line 1404
    invoke-interface {v0, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1405
    .line 1406
    .line 1407
    move-result v0

    .line 1408
    if-eqz v0, :cond_4c

    .line 1409
    .line 1410
    invoke-virtual {v2, v15}, Lo9/p;->q(Ljava/lang/String;)Z

    .line 1411
    .line 1412
    .line 1413
    move-result v0

    .line 1414
    if-eqz v0, :cond_4c

    .line 1415
    .line 1416
    iget-object v6, v2, Lo9/p;->a:Lia/t;

    .line 1417
    .line 1418
    const-string v0, "\u9000\u7fa4\u7cfb\u7edf\u6d88\u606f\u63d2\u5165\u5931\u8d25: "

    .line 1419
    .line 1420
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1421
    .line 1422
    .line 1423
    move-result-wide v11

    .line 1424
    iget-object v9, v2, Lo9/p;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1425
    .line 1426
    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 1427
    .line 1428
    .line 1429
    move-result v14

    .line 1430
    const/16 v7, 0x80

    .line 1431
    .line 1432
    if-ge v14, v7, :cond_48

    .line 1433
    .line 1434
    move-object/from16 v22, v3

    .line 1435
    .line 1436
    goto :goto_28

    .line 1437
    :cond_48
    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v7

    .line 1441
    new-instance v14, Lca/c;

    .line 1442
    .line 1443
    const/16 v10, 0x9

    .line 1444
    .line 1445
    invoke-direct {v14, v11, v12, v10}, Lca/c;-><init>(JI)V

    .line 1446
    .line 1447
    .line 1448
    new-instance v10, Lbe/i;

    .line 1449
    .line 1450
    move-object/from16 v22, v3

    .line 1451
    .line 1452
    const/16 v3, 0x14

    .line 1453
    .line 1454
    invoke-direct {v10, v14, v3}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 1455
    .line 1456
    .line 1457
    invoke-interface {v7, v10}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 1458
    .line 1459
    .line 1460
    :goto_28
    invoke-static {v15, v13, v4}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v3

    .line 1464
    invoke-virtual {v9, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v7

    .line 1468
    check-cast v7, Ljava/lang/Long;

    .line 1469
    .line 1470
    if-eqz v7, :cond_49

    .line 1471
    .line 1472
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 1473
    .line 1474
    .line 1475
    move-result-wide v16

    .line 1476
    sub-long v16, v11, v16

    .line 1477
    .line 1478
    const-wide/16 v18, 0x1388

    .line 1479
    .line 1480
    cmp-long v7, v16, v18

    .line 1481
    .line 1482
    if-gez v7, :cond_49

    .line 1483
    .line 1484
    goto/16 :goto_2c

    .line 1485
    .line 1486
    :cond_49
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v7

    .line 1490
    invoke-virtual {v9, v3, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v3

    .line 1497
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1498
    .line 1499
    .line 1500
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->h()Lk8/e;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v14

    .line 1504
    if-nez v14, :cond_4a

    .line 1505
    .line 1506
    const-string v0, "\u672c\u5730\u6d88\u606f API \u672a\u5c31\u7eea"

    .line 1507
    .line 1508
    move-object/from16 v3, v21

    .line 1509
    .line 1510
    invoke-virtual {v6, v0, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1511
    .line 1512
    .line 1513
    goto :goto_2d

    .line 1514
    :cond_4a
    :try_start_2
    invoke-virtual {v14}, Lk8/e;->c()V

    .line 1515
    .line 1516
    .line 1517
    invoke-virtual {v2, v15, v4}, Lo9/p;->u(Ljava/lang/String;Ljava/lang/String;)Lo9/j;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v3

    .line 1521
    invoke-virtual {v2, v15, v3}, Lo9/p;->d(Ljava/lang/String;Lo9/j;)Ljava/lang/String;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v16

    .line 1525
    const/16 v19, 0x1

    .line 1526
    .line 1527
    move-wide/from16 v17, v11

    .line 1528
    .line 1529
    invoke-virtual/range {v14 .. v19}, Lk8/e;->e(Ljava/lang/String;Ljava/lang/String;JZ)J

    .line 1530
    .line 1531
    .line 1532
    move-result-wide v9

    .line 1533
    const-wide/16 v11, 0x0

    .line 1534
    .line 1535
    cmp-long v3, v9, v11

    .line 1536
    .line 1537
    if-gtz v3, :cond_4b

    .line 1538
    .line 1539
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1540
    .line 1541
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1545
    .line 1546
    .line 1547
    const-string v0, "/"

    .line 1548
    .line 1549
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1553
    .line 1554
    .line 1555
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 1559
    const/4 v3, 0x0

    .line 1560
    :try_start_3
    invoke-virtual {v6, v0, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    goto :goto_29

    .line 1564
    :catchall_2
    move-exception v0

    .line 1565
    goto :goto_2a

    .line 1566
    :catchall_3
    move-exception v0

    .line 1567
    const/4 v3, 0x0

    .line 1568
    goto :goto_2a

    .line 1569
    :cond_4b
    const/4 v3, 0x0

    .line 1570
    :goto_29
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1571
    .line 1572
    goto :goto_2b

    .line 1573
    :goto_2a
    new-instance v7, Lsf/f;

    .line 1574
    .line 1575
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1576
    .line 1577
    .line 1578
    move-object v0, v7

    .line 1579
    :goto_2b
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v0

    .line 1583
    if-eqz v0, :cond_4d

    .line 1584
    .line 1585
    const-string v7, "\u9000\u7fa4\u7cfb\u7edf\u6d88\u606f\u63d2\u5165\u5f02\u5e38"

    .line 1586
    .line 1587
    invoke-virtual {v6, v7, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1588
    .line 1589
    .line 1590
    goto :goto_2d

    .line 1591
    :cond_4c
    move-object/from16 v22, v3

    .line 1592
    .line 1593
    :goto_2c
    move-object/from16 v3, v21

    .line 1594
    .line 1595
    :cond_4d
    :goto_2d
    const-string v0, "left"

    .line 1596
    .line 1597
    invoke-virtual {v2, v0, v15, v4}, Lo9/p;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1598
    .line 1599
    .line 1600
    move-object/from16 v21, v3

    .line 1601
    .line 1602
    move-object/from16 v3, v22

    .line 1603
    .line 1604
    goto/16 :goto_27

    .line 1605
    .line 1606
    :cond_4e
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v0

    .line 1610
    :goto_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1611
    .line 1612
    .line 1613
    move-result v3

    .line 1614
    if-eqz v3, :cond_52

    .line 1615
    .line 1616
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v3

    .line 1620
    check-cast v3, Ljava/lang/String;

    .line 1621
    .line 1622
    const/4 v10, 0x1

    .line 1623
    invoke-virtual {v2, v10, v15, v3}, Lo9/p;->o(ILjava/lang/String;Ljava/lang/String;)Z

    .line 1624
    .line 1625
    .line 1626
    move-result v4

    .line 1627
    if-nez v4, :cond_51

    .line 1628
    .line 1629
    invoke-static {v15, v3}, Lo9/p;->r(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1630
    .line 1631
    .line 1632
    move-result v4

    .line 1633
    if-nez v4, :cond_4f

    .line 1634
    .line 1635
    goto :goto_2f

    .line 1636
    :cond_4f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1637
    .line 1638
    .line 1639
    move-result-wide v6

    .line 1640
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 1641
    .line 1642
    .line 1643
    move-result v4

    .line 1644
    if-nez v4, :cond_50

    .line 1645
    .line 1646
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v4

    .line 1650
    new-instance v8, Lca/c;

    .line 1651
    .line 1652
    const/16 v9, 0x8

    .line 1653
    .line 1654
    invoke-direct {v8, v6, v7, v9}, Lca/c;-><init>(JI)V

    .line 1655
    .line 1656
    .line 1657
    new-instance v9, Lbe/i;

    .line 1658
    .line 1659
    const/16 v11, 0x13

    .line 1660
    .line 1661
    invoke-direct {v9, v8, v11}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 1662
    .line 1663
    .line 1664
    invoke-interface {v4, v9}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 1665
    .line 1666
    .line 1667
    :cond_50
    invoke-static {v15, v13, v3}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v4

    .line 1671
    new-instance v8, Lo9/d;

    .line 1672
    .line 1673
    invoke-direct {v8, v6, v7}, Lo9/d;-><init>(J)V

    .line 1674
    .line 1675
    .line 1676
    new-instance v6, Leb/v;

    .line 1677
    .line 1678
    const/4 v7, 0x1

    .line 1679
    invoke-direct {v6, v7, v8}, Leb/v;-><init>(ILfg/p;)V

    .line 1680
    .line 1681
    .line 1682
    invoke-virtual {v5, v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 1683
    .line 1684
    .line 1685
    :cond_51
    :goto_2f
    const-string v4, "join"

    .line 1686
    .line 1687
    invoke-virtual {v2, v4, v15, v3}, Lo9/p;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1688
    .line 1689
    .line 1690
    goto :goto_2e

    .line 1691
    :cond_52
    :goto_30
    return-void

    .line 1692
    :pswitch_1
    iget-object v2, v1, Lna/f;->b:Ljava/lang/Object;

    .line 1693
    .line 1694
    check-cast v2, Lna/g;

    .line 1695
    .line 1696
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1697
    .line 1698
    .line 1699
    invoke-virtual {v0}, Lb/e;->n()Ljava/lang/String;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v3

    .line 1703
    invoke-static {v3}, Lna/g;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v3

    .line 1707
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1708
    .line 1709
    .line 1710
    move-result v4

    .line 1711
    if-eqz v4, :cond_53

    .line 1712
    .line 1713
    goto/16 :goto_34

    .line 1714
    .line 1715
    :cond_53
    iget-object v4, v0, Lb/e;->h:Ljava/lang/Object;

    .line 1716
    .line 1717
    check-cast v4, Ll8/a;

    .line 1718
    .line 1719
    iget-object v4, v4, Ll8/a;->a:Ljava/lang/String;

    .line 1720
    .line 1721
    const-string v5, "delete"

    .line 1722
    .line 1723
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1724
    .line 1725
    .line 1726
    move-result v5

    .line 1727
    if-eqz v5, :cond_54

    .line 1728
    .line 1729
    invoke-virtual {v2}, Lna/g;->c()Ljava/util/LinkedHashSet;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v0

    .line 1733
    invoke-interface {v0, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1734
    .line 1735
    .line 1736
    move-result v3

    .line 1737
    if-eqz v3, :cond_5f

    .line 1738
    .line 1739
    invoke-virtual {v2, v0}, Lna/g;->d(Ljava/util/LinkedHashSet;)V

    .line 1740
    .line 1741
    .line 1742
    goto/16 :goto_34

    .line 1743
    .line 1744
    :cond_54
    invoke-virtual {v2}, Lna/g;->c()Ljava/util/LinkedHashSet;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v5

    .line 1748
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1749
    .line 1750
    .line 1751
    move-result v6

    .line 1752
    if-nez v6, :cond_55

    .line 1753
    .line 1754
    goto/16 :goto_34

    .line 1755
    .line 1756
    :cond_55
    invoke-virtual {v2, v5}, Lna/g;->d(Ljava/util/LinkedHashSet;)V

    .line 1757
    .line 1758
    .line 1759
    const-string v5, "insert"

    .line 1760
    .line 1761
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1762
    .line 1763
    .line 1764
    move-result v4

    .line 1765
    if-nez v4, :cond_56

    .line 1766
    .line 1767
    iget-boolean v4, v2, Lna/g;->d:Z

    .line 1768
    .line 1769
    if-eqz v4, :cond_5f

    .line 1770
    .line 1771
    :cond_56
    iget-object v4, v2, Lna/g;->a:Ll3/l;

    .line 1772
    .line 1773
    const-string v5, "hb_block_new_group_enable"

    .line 1774
    .line 1775
    const/4 v6, 0x0

    .line 1776
    :try_start_4
    invoke-virtual {v4}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v4

    .line 1780
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1781
    .line 1782
    .line 1783
    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1784
    goto :goto_31

    .line 1785
    :catchall_4
    move v4, v6

    .line 1786
    :goto_31
    if-eqz v4, :cond_5f

    .line 1787
    .line 1788
    iget-object v0, v0, Lb/e;->i:Ljava/lang/Object;

    .line 1789
    .line 1790
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 1791
    .line 1792
    iget-object v4, v2, Lna/g;->a:Ll3/l;

    .line 1793
    .line 1794
    invoke-static {v3}, Lna/g;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v9

    .line 1798
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1799
    .line 1800
    .line 1801
    move-result v5

    .line 1802
    if-eqz v5, :cond_57

    .line 1803
    .line 1804
    goto/16 :goto_34

    .line 1805
    .line 1806
    :cond_57
    const-string v5, "hb_rule_bindings_v1"

    .line 1807
    .line 1808
    const-string v7, ""

    .line 1809
    .line 1810
    invoke-virtual {v4, v5, v7}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v8

    .line 1814
    invoke-static {v8}, La7/a;->F(Ljava/lang/String;)Ljava/util/List;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v10

    .line 1818
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v10

    .line 1822
    :cond_58
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1823
    .line 1824
    .line 1825
    move-result v11

    .line 1826
    if-eqz v11, :cond_59

    .line 1827
    .line 1828
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v11

    .line 1832
    check-cast v11, Lna/i;

    .line 1833
    .line 1834
    iget-object v11, v11, Lna/i;->b:Ljava/lang/String;

    .line 1835
    .line 1836
    invoke-static {v11}, La7/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v11

    .line 1840
    invoke-static {v9}, La7/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v12

    .line 1844
    invoke-static {v11, v12}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 1845
    .line 1846
    .line 1847
    move-result v11

    .line 1848
    if-eqz v11, :cond_58

    .line 1849
    .line 1850
    goto/16 :goto_34

    .line 1851
    .line 1852
    :cond_59
    new-instance v15, Ljava/util/ArrayList;

    .line 1853
    .line 1854
    invoke-static {v8}, La7/a;->F(Ljava/lang/String;)Ljava/util/List;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v8

    .line 1858
    invoke-direct {v15, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1859
    .line 1860
    .line 1861
    new-instance v8, Lna/i;

    .line 1862
    .line 1863
    move-object v10, v8

    .line 1864
    invoke-static {v9}, La7/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v8

    .line 1868
    if-eqz v0, :cond_5a

    .line 1869
    .line 1870
    iget-object v11, v0, Lh/Hchat/hooks/api/model/WeChatChatroom;->name:Ljava/lang/String;

    .line 1871
    .line 1872
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1873
    .line 1874
    .line 1875
    move-result v11

    .line 1876
    if-nez v11, :cond_5a

    .line 1877
    .line 1878
    iget-object v0, v0, Lh/Hchat/hooks/api/model/WeChatChatroom;->name:Ljava/lang/String;

    .line 1879
    .line 1880
    goto :goto_32

    .line 1881
    :cond_5a
    :try_start_5
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v0

    .line 1885
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1886
    .line 1887
    .line 1888
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->c()Lg8/d;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v0

    .line 1892
    invoke-virtual {v0, v9}, Lg8/d;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v0

    .line 1896
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1897
    .line 1898
    .line 1899
    move-result v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1900
    if-nez v11, :cond_5b

    .line 1901
    .line 1902
    goto :goto_32

    .line 1903
    :catchall_5
    :cond_5b
    move-object v0, v9

    .line 1904
    :goto_32
    const-string v11, "hb_rule_templates_v1"

    .line 1905
    .line 1906
    invoke-virtual {v4, v11, v7}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v11

    .line 1910
    invoke-static {v11}, La7/a;->M(Ljava/lang/String;)Ljava/util/List;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v11

    .line 1914
    const-string v12, "hb_rule_default_template_id"

    .line 1915
    .line 1916
    invoke-virtual {v4, v12, v7}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v12

    .line 1920
    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v12

    .line 1924
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v13

    .line 1928
    :cond_5c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 1929
    .line 1930
    .line 1931
    move-result v14

    .line 1932
    if-eqz v14, :cond_5d

    .line 1933
    .line 1934
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v14

    .line 1938
    check-cast v14, Lna/j;

    .line 1939
    .line 1940
    iget-object v14, v14, Lna/j;->a:Ljava/lang/String;

    .line 1941
    .line 1942
    invoke-static {v14, v12}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 1943
    .line 1944
    .line 1945
    move-result v14

    .line 1946
    if-eqz v14, :cond_5c

    .line 1947
    .line 1948
    goto :goto_33

    .line 1949
    :cond_5d
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 1950
    .line 1951
    .line 1952
    move-result v12

    .line 1953
    const/4 v13, 0x1

    .line 1954
    if-ne v12, v13, :cond_5e

    .line 1955
    .line 1956
    invoke-interface {v11, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v6

    .line 1960
    check-cast v6, Lna/j;

    .line 1961
    .line 1962
    iget-object v7, v6, Lna/j;->a:Ljava/lang/String;

    .line 1963
    .line 1964
    :cond_5e
    move-object v12, v7

    .line 1965
    :goto_33
    const/4 v13, 0x0

    .line 1966
    const/4 v14, 0x0

    .line 1967
    const/4 v11, 0x0

    .line 1968
    move-object v7, v10

    .line 1969
    move-object v10, v0

    .line 1970
    invoke-direct/range {v7 .. v14}, Lna/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLna/j;)V

    .line 1971
    .line 1972
    .line 1973
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1974
    .line 1975
    .line 1976
    invoke-virtual {v4}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v0

    .line 1980
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v0

    .line 1984
    invoke-static {v15}, La7/a;->q(Ljava/util/List;)Ljava/lang/String;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v4

    .line 1988
    invoke-interface {v0, v5, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v0

    .line 1992
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1993
    .line 1994
    .line 1995
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1996
    .line 1997
    const-string v4, "\u5df2\u81ea\u52a8\u52a0\u5165\u65b0\u8fdb\u7fa4\u7ea2\u5305\u5173\u95ed\u89c4\u5219: "

    .line 1998
    .line 1999
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2000
    .line 2001
    .line 2002
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2003
    .line 2004
    .line 2005
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v0

    .line 2009
    iget-object v2, v2, Lna/g;->b:Lae/g;

    .line 2010
    .line 2011
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2012
    .line 2013
    .line 2014
    move-result v3

    .line 2015
    if-nez v3, :cond_5f

    .line 2016
    .line 2017
    invoke-virtual {v2, v0}, Lae/g;->accept(Ljava/lang/Object;)V

    .line 2018
    .line 2019
    .line 2020
    :cond_5f
    :goto_34
    return-void

    .line 2021
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
