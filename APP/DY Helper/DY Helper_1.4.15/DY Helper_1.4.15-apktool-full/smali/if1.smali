.class public abstract Lif1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lif1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static α(Ljava/lang/ClassLoader;)Lhf1;
    .locals 28

    .line 1
    sget-object v0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-static {v0}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcf1;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-direct {v1, v2}, Lcf1;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Ly30;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-direct {v2, v0, v3, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lib1;

    .line 30
    .line 31
    const/16 v1, 0xc

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lib1;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1, v0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_0

    .line 52
    .line 53
    sget-object v0, Ljz;->ε:Ljz;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_1

    .line 65
    .line 66
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-static {v1}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_2

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    move-object v0, v1

    .line 90
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/4 v2, 0x0

    .line 95
    const/4 v4, 0x4

    .line 96
    const-string v5, "ra38c9f1519a93e5b"

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    const-string v0, "\u6ca1\u6709\u5df2\u6536\u96c6\u7684\u5c0f\u706b\u4eba\u5355\u804a\u4f1a\u8bdd\uff0c\u8bf7\u5148\u8fdb\u5165\u79c1\u4fe1\u5217\u8868\u6216\u804a\u5929\u9875"

    .line 102
    .line 103
    invoke-static {v5, v0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    new-instance v1, Lhf1;

    .line 107
    .line 108
    invoke-direct {v1, v2, v2, v2, v0}, Lhf1;-><init>(IIILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v1

    .line 112
    :cond_3
    new-instance v1, Ljava/util/HashSet;

    .line 113
    .line 114
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    const-string v8, "\u5f00\u59cb\u83b7\u53d6\u98df\u7269\u5217\u8868 \u4f1a\u8bdd="

    .line 122
    .line 123
    const-string v9, " endpoint=feed/get\uff0c\u4ec5\u6267\u884c\u53ea\u8bfb\u8bf7\u6c42"

    .line 124
    .line 125
    invoke-static {v8, v7, v9}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-static {v5, v7, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    move v8, v2

    .line 137
    move v9, v8

    .line 138
    move v10, v9

    .line 139
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_1c

    .line 144
    .line 145
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    add-int/lit8 v12, v10, 0x1

    .line 150
    .line 151
    if-ltz v10, :cond_1b

    .line 152
    .line 153
    check-cast v11, Lky1;

    .line 154
    .line 155
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    invoke-virtual {v13}, Ljava/lang/Thread;->isInterrupted()Z

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    if-nez v13, :cond_19

    .line 164
    .line 165
    sget-object v13, Lry1;->α:Lry1;

    .line 166
    .line 167
    invoke-static {v11}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    iget-wide v14, v11, Lky1;->β:J

    .line 172
    .line 173
    move-object/from16 v11, p0

    .line 174
    .line 175
    move/from16 v16, v3

    .line 176
    .line 177
    invoke-static {v11, v14, v15}, Lp91;->κ(Ljava/lang/ClassLoader;J)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    instance-of v4, v3, Leo1;

    .line 182
    .line 183
    const-string v6, " shortId="

    .line 184
    .line 185
    if-nez v4, :cond_17

    .line 186
    .line 187
    move-object v4, v3

    .line 188
    check-cast v4, Lxe1;

    .line 189
    .line 190
    move-object/from16 v17, v0

    .line 191
    .line 192
    iget-object v0, v4, Lxe1;->β:Ljava/lang/Integer;

    .line 193
    .line 194
    move-object/from16 v18, v0

    .line 195
    .line 196
    iget v0, v4, Lxe1;->α:I

    .line 197
    .line 198
    move-object/from16 v19, v3

    .line 199
    .line 200
    iget-object v3, v4, Lxe1;->η:Lorg/json/JSONObject;

    .line 201
    .line 202
    move-object/from16 v20, v7

    .line 203
    .line 204
    iget-object v7, v4, Lxe1;->ζ:Ljava/util/List;

    .line 205
    .line 206
    move-object/from16 v21, v7

    .line 207
    .line 208
    iget v7, v4, Lxe1;->γ:I

    .line 209
    .line 210
    invoke-virtual {v4}, Lxe1;->α()Z

    .line 211
    .line 212
    .line 213
    move-result v22

    .line 214
    const-string v23, ""

    .line 215
    .line 216
    const-string v11, " http="

    .line 217
    .line 218
    move/from16 v24, v12

    .line 219
    .line 220
    const-string v12, " bridge="

    .line 221
    .line 222
    const/16 v25, -0x1

    .line 223
    .line 224
    if-eqz v22, :cond_13

    .line 225
    .line 226
    add-int/lit8 v2, v2, 0x1

    .line 227
    .line 228
    move/from16 v22, v2

    .line 229
    .line 230
    if-eqz v3, :cond_4

    .line 231
    .line 232
    const-string v2, "left"

    .line 233
    .line 234
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    goto :goto_3

    .line 239
    :cond_4
    const/4 v2, 0x0

    .line 240
    :goto_3
    move/from16 v26, v9

    .line 241
    .line 242
    if-eqz v3, :cond_5

    .line 243
    .line 244
    const-string v9, "right"

    .line 245
    .line 246
    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    goto :goto_4

    .line 251
    :cond_5
    const/4 v3, 0x0

    .line 252
    :goto_4
    filled-new-array {v2, v3}, [Lorg/json/JSONObject;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-static {v2}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    new-instance v3, Lcf1;

    .line 261
    .line 262
    const/4 v9, 0x3

    .line 263
    invoke-direct {v3, v9}, Lcf1;-><init>(I)V

    .line 264
    .line 265
    .line 266
    invoke-static {v2, v3}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {v2}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    check-cast v2, Lorg/json/JSONObject;

    .line 275
    .line 276
    if-eqz v18, :cond_6

    .line 277
    .line 278
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    goto :goto_5

    .line 283
    :cond_6
    move/from16 v3, v25

    .line 284
    .line 285
    :goto_5
    iget v4, v4, Lxe1;->ε:I

    .line 286
    .line 287
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    .line 288
    .line 289
    .line 290
    move-result v9

    .line 291
    move/from16 v27, v8

    .line 292
    .line 293
    if-eqz v2, :cond_7

    .line 294
    .line 295
    const-string v8, "food_id"

    .line 296
    .line 297
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    if-nez v2, :cond_8

    .line 302
    .line 303
    :cond_7
    const-string v2, "none"

    .line 304
    .line 305
    :cond_8
    const-string v8, "\u98df\u7269\u76ee\u5f55 name="

    .line 306
    .line 307
    invoke-static {v8, v13, v14, v15, v6}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    const-string v0, " status="

    .line 324
    .line 325
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string v0, " rawCount="

    .line 332
    .line 333
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v0, " parsedCount="

    .line 340
    .line 341
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    const-string v0, " activeFoodId="

    .line 348
    .line 349
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    const/4 v2, 0x4

    .line 360
    const/4 v3, 0x0

    .line 361
    invoke-static {v5, v0, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    :cond_9
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-eqz v2, :cond_c

    .line 373
    .line 374
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    check-cast v2, Lze1;

    .line 379
    .line 380
    iget-object v3, v2, Lze1;->α:Ljava/lang/String;

    .line 381
    .line 382
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    if-eqz v3, :cond_9

    .line 387
    .line 388
    iget-object v3, v2, Lze1;->α:Ljava/lang/String;

    .line 389
    .line 390
    iget-object v4, v2, Lze1;->β:Ljava/lang/String;

    .line 391
    .line 392
    iget-object v7, v2, Lze1;->δ:Ljava/lang/Integer;

    .line 393
    .line 394
    if-eqz v7, :cond_a

    .line 395
    .line 396
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 397
    .line 398
    .line 399
    move-result v7

    .line 400
    goto :goto_7

    .line 401
    :cond_a
    move/from16 v7, v25

    .line 402
    .line 403
    :goto_7
    iget-object v8, v2, Lze1;->ζ:Ljava/lang/String;

    .line 404
    .line 405
    if-nez v8, :cond_b

    .line 406
    .line 407
    move-object/from16 v8, v23

    .line 408
    .line 409
    :cond_b
    iget-object v2, v2, Lze1;->θ:Ljava/lang/String;

    .line 410
    .line 411
    const-string v9, " foodName="

    .line 412
    .line 413
    const-string v11, " duration="

    .line 414
    .line 415
    const-string v12, "\u98df\u7269\u914d\u7f6e id="

    .line 416
    .line 417
    invoke-static {v12, v3, v9, v4, v11}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    const-string v4, " icon="

    .line 422
    .line 423
    const-string v9, " source="

    .line 424
    .line 425
    invoke-static {v3, v7, v4, v8, v9}, Llz1;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    const/4 v3, 0x4

    .line 436
    const/4 v4, 0x0

    .line 437
    invoke-static {v5, v2, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    goto :goto_6

    .line 441
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 444
    .line 445
    .line 446
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    :cond_d
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-eqz v3, :cond_f

    .line 455
    .line 456
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    move-object v4, v3

    .line 461
    check-cast v4, Lze1;

    .line 462
    .line 463
    iget-object v4, v4, Lze1;->γ:Ljava/lang/Integer;

    .line 464
    .line 465
    if-nez v4, :cond_e

    .line 466
    .line 467
    goto :goto_8

    .line 468
    :cond_e
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 469
    .line 470
    .line 471
    move-result v4

    .line 472
    if-nez v4, :cond_d

    .line 473
    .line 474
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    goto :goto_8

    .line 478
    :cond_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    if-nez v2, :cond_12

    .line 483
    .line 484
    new-instance v2, Ljava/util/ArrayList;

    .line 485
    .line 486
    const/16 v3, 0xa

    .line 487
    .line 488
    invoke-static {v0, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v3

    .line 503
    if-eqz v3, :cond_11

    .line 504
    .line 505
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    check-cast v3, Lze1;

    .line 510
    .line 511
    iget-object v4, v3, Lze1;->α:Ljava/lang/String;

    .line 512
    .line 513
    iget-object v7, v3, Lze1;->β:Ljava/lang/String;

    .line 514
    .line 515
    iget-object v3, v3, Lze1;->ε:Ljava/lang/Integer;

    .line 516
    .line 517
    if-eqz v3, :cond_10

    .line 518
    .line 519
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    goto :goto_a

    .line 524
    :cond_10
    move/from16 v3, v25

    .line 525
    .line 526
    :goto_a
    new-instance v8, Ljava/lang/StringBuilder;

    .line 527
    .line 528
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    const-string v4, ":"

    .line 535
    .line 536
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    goto :goto_9

    .line 556
    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 557
    .line 558
    const-string v3, "\u514d\u8d39\u98df\u7269 name="

    .line 559
    .line 560
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    const-string v3, " items="

    .line 567
    .line 568
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    const/4 v2, 0x4

    .line 579
    const/4 v3, 0x0

    .line 580
    invoke-static {v5, v0, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    :cond_12
    move-object/from16 v18, v1

    .line 584
    .line 585
    move/from16 v2, v22

    .line 586
    .line 587
    move/from16 v9, v26

    .line 588
    .line 589
    :goto_b
    move/from16 v8, v27

    .line 590
    .line 591
    goto/16 :goto_c

    .line 592
    .line 593
    :cond_13
    move/from16 v27, v8

    .line 594
    .line 595
    move/from16 v26, v9

    .line 596
    .line 597
    const v3, 0xf2ad8

    .line 598
    .line 599
    .line 600
    const-string v8, " code="

    .line 601
    .line 602
    if-ne v7, v3, :cond_14

    .line 603
    .line 604
    add-int/lit8 v0, v27, 0x1

    .line 605
    .line 606
    const-string v3, "\u98df\u7269\u76ee\u5f55\u8df3\u8fc7 name="

    .line 607
    .line 608
    invoke-static {v3, v13, v14, v15, v6}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    const-string v4, " reason=pet_not_exist"

    .line 619
    .line 620
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    const/4 v4, 0x4

    .line 628
    const/4 v7, 0x0

    .line 629
    invoke-static {v5, v3, v7, v4, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    move v8, v0

    .line 633
    move-object/from16 v18, v1

    .line 634
    .line 635
    move/from16 v9, v26

    .line 636
    .line 637
    goto :goto_c

    .line 638
    :cond_14
    add-int/lit8 v9, v26, 0x1

    .line 639
    .line 640
    if-eqz v18, :cond_15

    .line 641
    .line 642
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    .line 643
    .line 644
    .line 645
    move-result v25

    .line 646
    :cond_15
    move/from16 v3, v25

    .line 647
    .line 648
    iget-object v4, v4, Lxe1;->δ:Ljava/lang/String;

    .line 649
    .line 650
    if-nez v4, :cond_16

    .line 651
    .line 652
    move-object/from16 v4, v23

    .line 653
    .line 654
    :cond_16
    move-object/from16 v18, v1

    .line 655
    .line 656
    const-string v1, "\u98df\u7269\u76ee\u5f55\u4e1a\u52a1\u5931\u8d25 name="

    .line 657
    .line 658
    invoke-static {v1, v13, v14, v15, v6}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    const-string v0, " msg="

    .line 681
    .line 682
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    const/4 v3, 0x4

    .line 693
    const/4 v4, 0x0

    .line 694
    invoke-static {v5, v0, v4, v3, v4}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    goto :goto_b

    .line 698
    :cond_17
    move-object/from16 v17, v0

    .line 699
    .line 700
    move-object/from16 v18, v1

    .line 701
    .line 702
    move-object/from16 v19, v3

    .line 703
    .line 704
    move-object/from16 v20, v7

    .line 705
    .line 706
    move/from16 v27, v8

    .line 707
    .line 708
    move/from16 v26, v9

    .line 709
    .line 710
    move/from16 v24, v12

    .line 711
    .line 712
    :goto_c
    invoke-static/range {v19 .. v19}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    if-eqz v0, :cond_18

    .line 717
    .line 718
    add-int/lit8 v9, v9, 0x1

    .line 719
    .line 720
    new-instance v1, Ljava/lang/StringBuilder;

    .line 721
    .line 722
    const-string v3, "\u98df\u7269\u76ee\u5f55\u62c9\u53d6\u5931\u8d25 name="

    .line 723
    .line 724
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v1, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    invoke-static {v5, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 741
    .line 742
    .line 743
    :cond_18
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    add-int/lit8 v0, v0, -0x1

    .line 748
    .line 749
    if-ge v10, v0, :cond_1a

    .line 750
    .line 751
    const-wide/16 v0, 0x12c

    .line 752
    .line 753
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 754
    .line 755
    .line 756
    goto :goto_d

    .line 757
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 762
    .line 763
    .line 764
    goto :goto_d

    .line 765
    :cond_19
    move-object/from16 v17, v0

    .line 766
    .line 767
    move-object/from16 v18, v1

    .line 768
    .line 769
    move/from16 v16, v3

    .line 770
    .line 771
    move-object/from16 v20, v7

    .line 772
    .line 773
    move/from16 v27, v8

    .line 774
    .line 775
    move/from16 v26, v9

    .line 776
    .line 777
    move/from16 v24, v12

    .line 778
    .line 779
    :cond_1a
    :goto_d
    move/from16 v3, v16

    .line 780
    .line 781
    move-object/from16 v0, v17

    .line 782
    .line 783
    move-object/from16 v1, v18

    .line 784
    .line 785
    move-object/from16 v7, v20

    .line 786
    .line 787
    move/from16 v10, v24

    .line 788
    .line 789
    const/4 v4, 0x4

    .line 790
    const/4 v6, 0x0

    .line 791
    goto/16 :goto_2

    .line 792
    .line 793
    :cond_1b
    invoke-static {}, Lyh;->х()V

    .line 794
    .line 795
    .line 796
    const/4 v3, 0x0

    .line 797
    throw v3

    .line 798
    :cond_1c
    move-object/from16 v17, v0

    .line 799
    .line 800
    move-object v3, v6

    .line 801
    move/from16 v27, v8

    .line 802
    .line 803
    move/from16 v26, v9

    .line 804
    .line 805
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    const-string v1, ", \u6210\u529f "

    .line 810
    .line 811
    const-string v4, ", \u8df3\u8fc7 "

    .line 812
    .line 813
    const-string v6, "\u98df\u7269\u5217\u8868\u8c03\u8bd5\u5b8c\u6210: \u4f1a\u8bdd "

    .line 814
    .line 815
    invoke-static {v6, v0, v1, v2, v4}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    const-string v1, ", \u5931\u8d25 "

    .line 823
    .line 824
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    const/4 v4, 0x4

    .line 835
    invoke-static {v5, v0, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    new-instance v1, Lhf1;

    .line 839
    .line 840
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    invoke-direct {v1, v3, v2, v9, v0}, Lhf1;-><init>(IIILjava/lang/String;)V

    .line 845
    .line 846
    .line 847
    return-object v1
.end method
