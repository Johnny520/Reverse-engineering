.class public final synthetic Leb/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk8/h;


# virtual methods
.method public final a(Lb/e;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v0, v0, Lb/e;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 6
    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    new-instance v1, Lh/Hchat/hooks/items/script/ScriptMessageBean;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;-><init>(Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    sget-object v0, Leb/f;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/16 v5, 0x80

    .line 25
    .line 26
    const/4 v6, 0x4

    .line 27
    const/16 v7, 0xa

    .line 28
    .line 29
    if-ge v4, v5, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-instance v5, Lca/c;

    .line 37
    .line 38
    invoke-direct {v5, v2, v3, v6}, Lca/c;-><init>(JI)V

    .line 39
    .line 40
    .line 41
    new-instance v8, Lbe/i;

    .line 42
    .line 43
    invoke-direct {v8, v5, v7}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v4, v8}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 47
    .line 48
    .line 49
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalker()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const-string v6, ""

    .line 59
    .line 60
    if-nez v5, :cond_1

    .line 61
    .line 62
    move-object v5, v6

    .line 63
    :cond_1
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSender()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    if-nez v8, :cond_2

    .line 76
    .line 77
    move-object v8, v6

    .line 78
    :cond_2
    invoke-static {v8}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-lez v9, :cond_3

    .line 91
    .line 92
    invoke-virtual {v8, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-nez v9, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object v8, v6

    .line 100
    :goto_1
    invoke-virtual {v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    if-nez v9, :cond_4

    .line 105
    .line 106
    move-object v9, v6

    .line 107
    :cond_4
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-virtual {v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getContent()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    if-nez v10, :cond_5

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    move-object v6, v10

    .line 123
    :goto_2
    const-string v10, "\r\n"

    .line 124
    .line 125
    const-string v11, "\n"

    .line 126
    .line 127
    const/4 v12, 0x0

    .line 128
    invoke-static {v6, v10, v11, v12}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    const/16 v10, 0xd

    .line 133
    .line 134
    invoke-virtual {v6, v10, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    const-string v10, "@chatroom"

    .line 150
    .line 151
    const/4 v11, 0x1

    .line 152
    invoke-static {v5, v10, v11}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    const-string v14, ":"

    .line 157
    .line 158
    if-eqz v13, :cond_b

    .line 159
    .line 160
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    if-eqz v13, :cond_6

    .line 165
    .line 166
    goto/16 :goto_3

    .line 167
    .line 168
    :cond_6
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    if-nez v13, :cond_7

    .line 173
    .line 174
    const-string v13, ":\n"

    .line 175
    .line 176
    invoke-virtual {v8, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v13

    .line 180
    invoke-static {v6, v13, v12}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    if-eqz v15, :cond_7

    .line 185
    .line 186
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    goto :goto_3

    .line 203
    :cond_7
    const/4 v13, 0x6

    .line 204
    invoke-static {v6, v7, v12, v13}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    if-gtz v7, :cond_8

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_8
    invoke-virtual {v6, v12, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    invoke-static {v13}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    invoke-static {v13, v14}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v13

    .line 227
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result v15

    .line 231
    if-nez v15, :cond_b

    .line 232
    .line 233
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 234
    .line 235
    .line 236
    move-result v15

    .line 237
    move/from16 p1, v11

    .line 238
    .line 239
    const/16 v11, 0x50

    .line 240
    .line 241
    if-le v15, v11, :cond_9

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_9
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 245
    .line 246
    invoke-static {v11, v13, v11}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    const-string v13, "@openim"

    .line 251
    .line 252
    invoke-static {v11, v13, v12}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    if-nez v13, :cond_a

    .line 257
    .line 258
    invoke-static {v11, v10, v12}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    if-nez v10, :cond_a

    .line 263
    .line 264
    sget-object v10, Leb/f;->b:Log/k;

    .line 265
    .line 266
    invoke-virtual {v10, v11}, Log/k;->d(Ljava/lang/String;)Z

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-eqz v10, :cond_b

    .line 271
    .line 272
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 273
    .line 274
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    :cond_b
    :goto_3
    invoke-virtual {v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgId()J

    .line 287
    .line 288
    .line 289
    move-result-wide v10

    .line 290
    const-wide/16 v15, 0x0

    .line 291
    .line 292
    cmp-long v7, v10, v15

    .line 293
    .line 294
    const-string v13, "msg:"

    .line 295
    .line 296
    if-lez v7, :cond_c

    .line 297
    .line 298
    new-instance v7, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v7, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    :cond_c
    invoke-virtual {v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgSvrId()J

    .line 320
    .line 321
    .line 322
    move-result-wide v10

    .line 323
    cmp-long v7, v10, v15

    .line 324
    .line 325
    if-lez v7, :cond_d

    .line 326
    .line 327
    new-instance v7, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v15, "svr:"

    .line 330
    .line 331
    invoke-direct {v7, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v7, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    :cond_d
    new-instance v7, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-string v10, "raw:"

    .line 353
    .line 354
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    const/16 v10, 0x7c

    .line 361
    .line 362
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isSend()Z

    .line 378
    .line 379
    .line 380
    move-result v11

    .line 381
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    new-instance v7, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    const-string v10, "body:"

    .line 400
    .line 401
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const-string v10, "|"

    .line 408
    .line 409
    invoke-static {v7, v10, v8, v10, v9}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v7

    .line 422
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isSend()Z

    .line 426
    .line 427
    .line 428
    move-result v7

    .line 429
    if-eqz v7, :cond_e

    .line 430
    .line 431
    const-string v7, "chat:"

    .line 432
    .line 433
    invoke-static {v7, v5, v10, v9, v10}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    :cond_e
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    if-eqz v5, :cond_f

    .line 452
    .line 453
    goto :goto_5

    .line 454
    :cond_f
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    :cond_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 459
    .line 460
    .line 461
    move-result v6

    .line 462
    if-eqz v6, :cond_12

    .line 463
    .line 464
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    check-cast v6, Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {v0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    check-cast v7, Ljava/lang/Long;

    .line 475
    .line 476
    if-eqz v7, :cond_10

    .line 477
    .line 478
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 479
    .line 480
    .line 481
    move-result-wide v7

    .line 482
    sub-long v7, v2, v7

    .line 483
    .line 484
    sget-object v9, Leb/f;->a:Leb/f;

    .line 485
    .line 486
    invoke-static {v6, v13, v12}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    if-eqz v6, :cond_11

    .line 491
    .line 492
    const-wide/32 v9, 0xea60

    .line 493
    .line 494
    .line 495
    goto :goto_4

    .line 496
    :cond_11
    const-wide/16 v9, 0x3e8

    .line 497
    .line 498
    :goto_4
    cmp-long v6, v7, v9

    .line 499
    .line 500
    if-gez v6, :cond_10

    .line 501
    .line 502
    goto :goto_7

    .line 503
    :cond_12
    :goto_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    if-eqz v5, :cond_13

    .line 512
    .line 513
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v5

    .line 517
    check-cast v5, Ljava/lang/String;

    .line 518
    .line 519
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 520
    .line 521
    .line 522
    move-result-object v6

    .line 523
    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    goto :goto_6

    .line 527
    :cond_13
    sget-object v0, Leb/f;->e:Ljava/util/concurrent/ExecutorService;

    .line 528
    .line 529
    new-instance v2, La1/a;

    .line 530
    .line 531
    const/4 v3, 0x7

    .line 532
    invoke-direct {v2, v1, v3}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 533
    .line 534
    .line 535
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 536
    .line 537
    .line 538
    :cond_14
    :goto_7
    return-void
.end method
