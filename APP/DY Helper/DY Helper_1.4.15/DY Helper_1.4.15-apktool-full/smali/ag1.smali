.class public abstract Lag1;
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
    sput-object v0, Lag1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static α(Ljava/lang/String;I)Lzf1;
    .locals 9

    .line 1
    new-instance v0, Lzf1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    move-object v8, p0

    .line 10
    move v7, p1

    .line 11
    invoke-direct/range {v0 .. v8}, Lzf1;-><init>(IIIIIIILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static β(Ljava/lang/ClassLoader;)Lzf1;
    .locals 37

    .line 1
    sget-object v0, Lxn0;->χ:Lxn0;

    .line 2
    .line 3
    sget-object v1, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-static {v1}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Iterable;

    .line 14
    .line 15
    invoke-static {v1}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Lcf1;

    .line 20
    .line 21
    const/16 v3, 0x9

    .line 22
    .line 23
    invoke-direct {v2, v3}, Lcf1;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Ly30;

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-direct {v3, v1, v4, v2}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lib1;

    .line 33
    .line 34
    const/16 v2, 0xe

    .line 35
    .line 36
    invoke-direct {v1, v2}, Lib1;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v2, v1}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_0

    .line 55
    .line 56
    sget-object v1, Ljz;->ε:Ljz;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_1

    .line 68
    .line 69
    invoke-static {v2}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-static {v2}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    move-object v1, v2

    .line 93
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    const/4 v3, 0x4

    .line 98
    const-string v5, "r86c859e3375e752"

    .line 99
    .line 100
    const/4 v12, 0x0

    .line 101
    const/4 v6, 0x0

    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    const-string v0, "\u6ca1\u6709\u5df2\u6536\u96c6\u7684\u5c0f\u706b\u4eba\u5355\u804a\u4f1a\u8bdd\uff0c\u8bf7\u5148\u8fdb\u5165\u79c1\u4fe1\u5217\u8868\u6216\u804a\u5929\u9875"

    .line 105
    .line 106
    invoke-static {v5, v0, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v12}, Lag1;->α(Ljava/lang/String;I)Lzf1;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0

    .line 114
    :cond_3
    const/16 v2, 0x14

    .line 115
    .line 116
    invoke-static {v1, v2}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-le v7, v8, :cond_4

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    const-string v7, "\u8c03\u8bd5\u4ec5\u5904\u7406\u524d 20 \u4e2a\u4f1a\u8bdd\uff0c\u603b\u4f1a\u8bdd="

    .line 135
    .line 136
    invoke-static {v7, v1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v5, v1, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    new-instance v7, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v8, "\u5f00\u59cb\u706b\u661f\u4efb\u52a1\u8c03\u8bd5 mode="

    .line 150
    .line 151
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    sget-object v8, Lyf1;->ε:Lyf1;

    .line 155
    .line 156
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v8, " \u4f1a\u8bdd="

    .line 160
    .line 161
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v1, "\uff0c\u672c\u529f\u80fd\u4e0d\u4f1a\u53d1\u9001\u6d88\u606f"

    .line 168
    .line 169
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-static {v5, v1, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    move v7, v12

    .line 184
    move v8, v7

    .line 185
    move v9, v8

    .line 186
    move v10, v9

    .line 187
    move v11, v10

    .line 188
    move v13, v11

    .line 189
    move v14, v13

    .line 190
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    if-eqz v15, :cond_27

    .line 195
    .line 196
    add-int/lit8 v15, v7, 0x1

    .line 197
    .line 198
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v16

    .line 202
    move-object/from16 v12, v16

    .line 203
    .line 204
    check-cast v12, Lky1;

    .line 205
    .line 206
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 207
    .line 208
    .line 209
    move-result-object v16

    .line 210
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Thread;->isInterrupted()Z

    .line 211
    .line 212
    .line 213
    move-result v16

    .line 214
    if-nez v16, :cond_27

    .line 215
    .line 216
    sget-object v16, Lry1;->α:Lry1;

    .line 217
    .line 218
    invoke-static {v12}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    move/from16 v18, v7

    .line 223
    .line 224
    iget-wide v6, v12, Lky1;->β:J

    .line 225
    .line 226
    move-object/from16 v12, p0

    .line 227
    .line 228
    invoke-virtual {v0, v12, v6, v7}, Lxn0;->Θ(Ljava/lang/ClassLoader;J)Lrf1;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v3}, Lrf1;->α()Z

    .line 233
    .line 234
    .line 235
    move-result v19

    .line 236
    const-wide/16 v20, 0x12c

    .line 237
    .line 238
    move-object/from16 v22, v0

    .line 239
    .line 240
    const-string v0, " shortId="

    .line 241
    .line 242
    if-nez v19, :cond_7

    .line 243
    .line 244
    add-int/lit8 v14, v14, 0x1

    .line 245
    .line 246
    iget-object v3, v3, Lrf1;->β:Ljava/lang/Throwable;

    .line 247
    .line 248
    if-eqz v3, :cond_6

    .line 249
    .line 250
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    if-nez v3, :cond_5

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_5
    :goto_3
    move-object/from16 v19, v1

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_6
    :goto_4
    const-string v3, "unknown"

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :goto_5
    const-string v1, "\u4efb\u52a1\u5217\u8868\u62c9\u53d6\u5931\u8d25 name="

    .line 264
    .line 265
    invoke-static {v1, v4, v6, v7, v0}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    const-string v1, ": "

    .line 270
    .line 271
    invoke-static {v0, v1, v3}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    const/4 v1, 0x4

    .line 276
    const/4 v3, 0x0

    .line 277
    invoke-static {v5, v0, v3, v1, v3}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :try_start_0
    invoke-static/range {v20 .. v21}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    .line 282
    .line 283
    goto :goto_6

    .line 284
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 289
    .line 290
    .line 291
    :goto_6
    move v7, v15

    .line 292
    move-object/from16 v1, v19

    .line 293
    .line 294
    move-object/from16 v0, v22

    .line 295
    .line 296
    const/4 v3, 0x4

    .line 297
    const/4 v4, 0x1

    .line 298
    :goto_7
    const/4 v6, 0x0

    .line 299
    const/4 v12, 0x0

    .line 300
    goto :goto_2

    .line 301
    :cond_7
    move-object/from16 v19, v1

    .line 302
    .line 303
    iget-object v1, v3, Lrf1;->α:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v1, Lgg1;

    .line 306
    .line 307
    const-string v3, ""

    .line 308
    .line 309
    move-object/from16 v23, v2

    .line 310
    .line 311
    if-eqz v1, :cond_23

    .line 312
    .line 313
    iget v2, v1, Lgg1;->α:I

    .line 314
    .line 315
    if-nez v2, :cond_23

    .line 316
    .line 317
    add-int/lit8 v8, v8, 0x1

    .line 318
    .line 319
    invoke-virtual {v1}, Lgg1;->α()Ljava/util/ArrayList;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 324
    .line 325
    .line 326
    move-result v24

    .line 327
    add-int v9, v24, v9

    .line 328
    .line 329
    move-object/from16 v24, v2

    .line 330
    .line 331
    iget-object v2, v1, Lgg1;->ζ:Ljava/util/Map;

    .line 332
    .line 333
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    move-object/from16 v25, v2

    .line 338
    .line 339
    check-cast v25, Ljava/lang/Iterable;

    .line 340
    .line 341
    new-instance v2, Lcf1;

    .line 342
    .line 343
    move-object/from16 v32, v3

    .line 344
    .line 345
    const/16 v3, 0xa

    .line 346
    .line 347
    invoke-direct {v2, v3}, Lcf1;-><init>(I)V

    .line 348
    .line 349
    .line 350
    const/16 v31, 0x1e

    .line 351
    .line 352
    const-string v26, ","

    .line 353
    .line 354
    const/16 v27, 0x0

    .line 355
    .line 356
    const/16 v28, 0x0

    .line 357
    .line 358
    const/16 v29, 0x0

    .line 359
    .line 360
    move-object/from16 v30, v2

    .line 361
    .line 362
    invoke-static/range {v25 .. v31}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 367
    .line 368
    .line 369
    move-result v25

    .line 370
    const-string v26, "none"

    .line 371
    .line 372
    if-eqz v25, :cond_8

    .line 373
    .line 374
    move-object/from16 v2, v26

    .line 375
    .line 376
    :cond_8
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->size()I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    move/from16 v27, v8

    .line 381
    .line 382
    iget-object v8, v1, Lgg1;->ε:Ljava/lang/String;

    .line 383
    .line 384
    if-nez v8, :cond_9

    .line 385
    .line 386
    move-object/from16 v8, v26

    .line 387
    .line 388
    :cond_9
    iget-object v1, v1, Lgg1;->γ:Ljava/lang/Long;

    .line 389
    .line 390
    if-eqz v1, :cond_a

    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 393
    .line 394
    .line 395
    move-result-wide v28

    .line 396
    :goto_8
    move/from16 v30, v14

    .line 397
    .line 398
    move/from16 v26, v15

    .line 399
    .line 400
    move-wide/from16 v14, v28

    .line 401
    .line 402
    goto :goto_9

    .line 403
    :cond_a
    const-wide/16 v28, -0x1

    .line 404
    .line 405
    goto :goto_8

    .line 406
    :goto_9
    const-string v1, "\u4efb\u52a1\u5217\u8868 name="

    .line 407
    .line 408
    invoke-static {v1, v4, v6, v7, v0}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    const-string v1, " count="

    .line 413
    .line 414
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    const-string v1, " source="

    .line 421
    .line 422
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    const-string v1, " candidates="

    .line 429
    .line 430
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    const-string v1, " balanceSpark="

    .line 437
    .line 438
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    const/4 v1, 0x4

    .line 449
    const/4 v3, 0x0

    .line 450
    invoke-static {v5, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    const-string v2, " requirement="

    .line 462
    .line 463
    const-string v3, " progress="

    .line 464
    .line 465
    const-string v6, " kind="

    .line 466
    .line 467
    const-string v7, " status="

    .line 468
    .line 469
    if-eqz v1, :cond_10

    .line 470
    .line 471
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    check-cast v1, Ltf1;

    .line 476
    .line 477
    iget-object v8, v1, Ltf1;->δ:Ljava/lang/String;

    .line 478
    .line 479
    if-eqz v8, :cond_c

    .line 480
    .line 481
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 482
    .line 483
    .line 484
    move-result v8

    .line 485
    if-eqz v8, :cond_b

    .line 486
    .line 487
    goto :goto_b

    .line 488
    :cond_b
    const-string v8, "present"

    .line 489
    .line 490
    goto :goto_c

    .line 491
    :cond_c
    :goto_b
    const-string v8, "missing"

    .line 492
    .line 493
    :goto_c
    iget-object v14, v1, Ltf1;->κ:Ljava/lang/String;

    .line 494
    .line 495
    if-eqz v14, :cond_d

    .line 496
    .line 497
    const/16 v15, 0x20

    .line 498
    .line 499
    move-object/from16 v28, v0

    .line 500
    .line 501
    const/16 v0, 0xa

    .line 502
    .line 503
    invoke-virtual {v14, v0, v15}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v14

    .line 507
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    const/16 v15, 0x50

    .line 511
    .line 512
    invoke-static {v14, v15}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v14

    .line 516
    goto :goto_d

    .line 517
    :cond_d
    move-object/from16 v28, v0

    .line 518
    .line 519
    const/16 v0, 0xa

    .line 520
    .line 521
    const/4 v14, 0x0

    .line 522
    :goto_d
    if-nez v14, :cond_e

    .line 523
    .line 524
    move-object/from16 v14, v32

    .line 525
    .line 526
    :cond_e
    iget-object v15, v1, Ltf1;->α:Ljava/lang/String;

    .line 527
    .line 528
    iget-object v0, v1, Ltf1;->β:Ljava/lang/String;

    .line 529
    .line 530
    if-nez v0, :cond_f

    .line 531
    .line 532
    move-object/from16 v0, v32

    .line 533
    .line 534
    :cond_f
    move/from16 v29, v9

    .line 535
    .line 536
    iget v9, v1, Ltf1;->γ:I

    .line 537
    .line 538
    invoke-virtual {v1}, Ltf1;->γ()Lfg1;

    .line 539
    .line 540
    .line 541
    move-result-object v12

    .line 542
    move/from16 v31, v13

    .line 543
    .line 544
    invoke-static {v1}, Lag1;->γ(Ltf1;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v13

    .line 548
    move/from16 v33, v10

    .line 549
    .line 550
    invoke-static {v1}, Lag1;->δ(Ltf1;)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v10

    .line 554
    iget-object v1, v1, Ltf1;->μ:Ljava/lang/String;

    .line 555
    .line 556
    move/from16 v34, v11

    .line 557
    .line 558
    const-string v11, " id="

    .line 559
    .line 560
    move-object/from16 v35, v5

    .line 561
    .line 562
    const-string v5, " unique="

    .line 563
    .line 564
    move-object/from16 v36, v8

    .line 565
    .line 566
    const-string v8, "\u4efb\u52a1 name="

    .line 567
    .line 568
    invoke-static {v8, v4, v11, v15, v5}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    const-string v0, " enterFrom="

    .line 597
    .line 598
    const-string v2, " token="

    .line 599
    .line 600
    invoke-static {v5, v10, v0, v1, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    const-string v0, " title="

    .line 604
    .line 605
    move-object/from16 v8, v36

    .line 606
    .line 607
    invoke-static {v5, v8, v0, v14}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    move-object/from16 v5, v35

    .line 612
    .line 613
    const/4 v1, 0x4

    .line 614
    const/4 v3, 0x0

    .line 615
    invoke-static {v5, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    move-object/from16 v12, p0

    .line 619
    .line 620
    move-object/from16 v0, v28

    .line 621
    .line 622
    move/from16 v9, v29

    .line 623
    .line 624
    move/from16 v13, v31

    .line 625
    .line 626
    move/from16 v10, v33

    .line 627
    .line 628
    move/from16 v11, v34

    .line 629
    .line 630
    goto/16 :goto_a

    .line 631
    .line 632
    :cond_10
    move/from16 v29, v9

    .line 633
    .line 634
    move/from16 v33, v10

    .line 635
    .line 636
    move/from16 v34, v11

    .line 637
    .line 638
    move/from16 v31, v13

    .line 639
    .line 640
    new-instance v0, Ljava/util/ArrayList;

    .line 641
    .line 642
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    :cond_11
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 650
    .line 651
    .line 652
    move-result v8

    .line 653
    if-eqz v8, :cond_12

    .line 654
    .line 655
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v8

    .line 659
    move-object v9, v8

    .line 660
    check-cast v9, Ltf1;

    .line 661
    .line 662
    invoke-virtual {v9}, Ltf1;->γ()Lfg1;

    .line 663
    .line 664
    .line 665
    move-result-object v9

    .line 666
    sget-object v10, Lfg1;->η:Lfg1;

    .line 667
    .line 668
    if-eq v9, v10, :cond_11

    .line 669
    .line 670
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    goto :goto_e

    .line 674
    :cond_12
    new-instance v1, Ljava/util/HashSet;

    .line 675
    .line 676
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 677
    .line 678
    .line 679
    new-instance v8, Ljava/util/ArrayList;

    .line 680
    .line 681
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    :cond_13
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 689
    .line 690
    .line 691
    move-result v9

    .line 692
    if-eqz v9, :cond_15

    .line 693
    .line 694
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v9

    .line 698
    move-object v10, v9

    .line 699
    check-cast v10, Ltf1;

    .line 700
    .line 701
    iget-object v11, v10, Ltf1;->β:Ljava/lang/String;

    .line 702
    .line 703
    if-nez v11, :cond_14

    .line 704
    .line 705
    iget-object v11, v10, Ltf1;->α:Ljava/lang/String;

    .line 706
    .line 707
    :cond_14
    invoke-virtual {v1, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v10

    .line 711
    if-eqz v10, :cond_13

    .line 712
    .line 713
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    goto :goto_f

    .line 717
    :cond_15
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    add-int v10, v0, v33

    .line 722
    .line 723
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    if-eqz v0, :cond_16

    .line 728
    .line 729
    const/4 v1, 0x0

    .line 730
    goto :goto_14

    .line 731
    :cond_16
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    const/4 v1, 0x0

    .line 736
    :cond_17
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 737
    .line 738
    .line 739
    move-result v9

    .line 740
    if-eqz v9, :cond_1b

    .line 741
    .line 742
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v9

    .line 746
    check-cast v9, Ltf1;

    .line 747
    .line 748
    invoke-virtual {v9}, Ltf1;->δ()Ljava/lang/Integer;

    .line 749
    .line 750
    .line 751
    move-result-object v9

    .line 752
    if-eqz v9, :cond_18

    .line 753
    .line 754
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 755
    .line 756
    .line 757
    move-result v9

    .line 758
    :goto_11
    const/4 v11, 0x1

    .line 759
    goto :goto_12

    .line 760
    :cond_18
    const/4 v9, 0x0

    .line 761
    goto :goto_11

    .line 762
    :goto_12
    if-le v9, v11, :cond_19

    .line 763
    .line 764
    const/4 v11, 0x1

    .line 765
    goto :goto_13

    .line 766
    :cond_19
    const/4 v11, 0x0

    .line 767
    :goto_13
    if-eqz v11, :cond_17

    .line 768
    .line 769
    add-int/lit8 v1, v1, 0x1

    .line 770
    .line 771
    if-ltz v1, :cond_1a

    .line 772
    .line 773
    goto :goto_10

    .line 774
    :cond_1a
    invoke-static {}, Lyh;->ф()V

    .line 775
    .line 776
    .line 777
    const/16 v17, 0x0

    .line 778
    .line 779
    throw v17

    .line 780
    :cond_1b
    :goto_14
    add-int v11, v34, v1

    .line 781
    .line 782
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 787
    .line 788
    .line 789
    move-result v1

    .line 790
    if-eqz v1, :cond_1c

    .line 791
    .line 792
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    check-cast v1, Ltf1;

    .line 797
    .line 798
    iget-object v8, v1, Ltf1;->α:Ljava/lang/String;

    .line 799
    .line 800
    invoke-virtual {v1}, Ltf1;->γ()Lfg1;

    .line 801
    .line 802
    .line 803
    move-result-object v9

    .line 804
    iget v12, v1, Ltf1;->γ:I

    .line 805
    .line 806
    invoke-static {v1}, Lag1;->γ(Ltf1;)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v13

    .line 810
    invoke-static {v1}, Lag1;->δ(Ltf1;)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    const-string v14, "\u547d\u4e2d\u76f8\u5173\u4efb\u52a1 name="

    .line 815
    .line 816
    const-string v15, " taskId="

    .line 817
    .line 818
    invoke-static {v14, v4, v15, v8, v6}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 819
    .line 820
    .line 821
    move-result-object v8

    .line 822
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    invoke-static {v8, v13, v2, v1}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    const/4 v8, 0x4

    .line 839
    const/4 v9, 0x0

    .line 840
    invoke-static {v5, v1, v9, v8, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 841
    .line 842
    .line 843
    goto :goto_15

    .line 844
    :cond_1c
    new-instance v0, Ljava/util/ArrayList;

    .line 845
    .line 846
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    :cond_1d
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 854
    .line 855
    .line 856
    move-result v2

    .line 857
    if-eqz v2, :cond_1e

    .line 858
    .line 859
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    move-object v3, v2

    .line 864
    check-cast v3, Ltf1;

    .line 865
    .line 866
    iget v3, v3, Ltf1;->γ:I

    .line 867
    .line 868
    const/16 v4, 0x71a3

    .line 869
    .line 870
    filled-new-array {v3}, [I

    .line 871
    .line 872
    .line 873
    move-result-object v3

    .line 874
    invoke-static {v4, v3}, Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;->β(I[I)Z

    .line 875
    .line 876
    .line 877
    move-result v3

    .line 878
    if-eqz v3, :cond_1d

    .line 879
    .line 880
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 881
    .line 882
    .line 883
    goto :goto_16

    .line 884
    :cond_1e
    new-instance v1, Ljava/util/HashSet;

    .line 885
    .line 886
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 887
    .line 888
    .line 889
    new-instance v2, Ljava/util/ArrayList;

    .line 890
    .line 891
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    :cond_1f
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 899
    .line 900
    .line 901
    move-result v3

    .line 902
    if-eqz v3, :cond_21

    .line 903
    .line 904
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    move-object v4, v3

    .line 909
    check-cast v4, Ltf1;

    .line 910
    .line 911
    iget-object v6, v4, Ltf1;->β:Ljava/lang/String;

    .line 912
    .line 913
    if-nez v6, :cond_20

    .line 914
    .line 915
    iget-object v6, v4, Ltf1;->α:Ljava/lang/String;

    .line 916
    .line 917
    :cond_20
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 918
    .line 919
    .line 920
    move-result v4

    .line 921
    if-eqz v4, :cond_1f

    .line 922
    .line 923
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 924
    .line 925
    .line 926
    goto :goto_17

    .line 927
    :cond_21
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 928
    .line 929
    .line 930
    move-result v0

    .line 931
    add-int v13, v0, v31

    .line 932
    .line 933
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I

    .line 934
    .line 935
    .line 936
    move-result v0

    .line 937
    const/16 v16, 0x1

    .line 938
    .line 939
    add-int/lit8 v0, v0, -0x1

    .line 940
    .line 941
    move/from16 v15, v18

    .line 942
    .line 943
    if-ge v15, v0, :cond_22

    .line 944
    .line 945
    :try_start_1
    invoke-static/range {v20 .. v21}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 946
    .line 947
    .line 948
    goto :goto_18

    .line 949
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 954
    .line 955
    .line 956
    :cond_22
    :goto_18
    move/from16 v4, v16

    .line 957
    .line 958
    move-object/from16 v1, v19

    .line 959
    .line 960
    move-object/from16 v0, v22

    .line 961
    .line 962
    move-object/from16 v2, v23

    .line 963
    .line 964
    move/from16 v7, v26

    .line 965
    .line 966
    move/from16 v8, v27

    .line 967
    .line 968
    move/from16 v9, v29

    .line 969
    .line 970
    move/from16 v14, v30

    .line 971
    .line 972
    :goto_19
    const/4 v3, 0x4

    .line 973
    goto/16 :goto_7

    .line 974
    .line 975
    :cond_23
    move-object/from16 v32, v3

    .line 976
    .line 977
    move/from16 v33, v10

    .line 978
    .line 979
    move/from16 v34, v11

    .line 980
    .line 981
    move/from16 v31, v13

    .line 982
    .line 983
    move/from16 v30, v14

    .line 984
    .line 985
    move/from16 v26, v15

    .line 986
    .line 987
    const/16 v16, 0x1

    .line 988
    .line 989
    add-int/lit8 v14, v30, 0x1

    .line 990
    .line 991
    if-eqz v1, :cond_24

    .line 992
    .line 993
    iget v0, v1, Lgg1;->α:I

    .line 994
    .line 995
    goto :goto_1a

    .line 996
    :cond_24
    const/4 v0, -0x1

    .line 997
    :goto_1a
    if-eqz v1, :cond_25

    .line 998
    .line 999
    iget-object v1, v1, Lgg1;->β:Ljava/lang/String;

    .line 1000
    .line 1001
    goto :goto_1b

    .line 1002
    :cond_25
    const/4 v1, 0x0

    .line 1003
    :goto_1b
    if-nez v1, :cond_26

    .line 1004
    .line 1005
    move-object/from16 v3, v32

    .line 1006
    .line 1007
    goto :goto_1c

    .line 1008
    :cond_26
    move-object v3, v1

    .line 1009
    :goto_1c
    const-string v1, " code="

    .line 1010
    .line 1011
    const-string v2, " msg="

    .line 1012
    .line 1013
    const-string v6, "\u4efb\u52a1\u5217\u8868\u4e1a\u52a1\u5931\u8d25 name="

    .line 1014
    .line 1015
    invoke-static {v0, v6, v4, v1, v2}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    const/4 v1, 0x4

    .line 1027
    const/4 v3, 0x0

    .line 1028
    invoke-static {v5, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1029
    .line 1030
    .line 1031
    :try_start_2
    invoke-static/range {v20 .. v21}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1032
    .line 1033
    .line 1034
    goto :goto_1d

    .line 1035
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 1040
    .line 1041
    .line 1042
    :goto_1d
    move/from16 v4, v16

    .line 1043
    .line 1044
    move-object/from16 v1, v19

    .line 1045
    .line 1046
    move-object/from16 v0, v22

    .line 1047
    .line 1048
    move-object/from16 v2, v23

    .line 1049
    .line 1050
    move/from16 v7, v26

    .line 1051
    .line 1052
    move/from16 v13, v31

    .line 1053
    .line 1054
    move/from16 v10, v33

    .line 1055
    .line 1056
    move/from16 v11, v34

    .line 1057
    .line 1058
    goto :goto_19

    .line 1059
    :cond_27
    move/from16 v33, v10

    .line 1060
    .line 1061
    move/from16 v34, v11

    .line 1062
    .line 1063
    move/from16 v31, v13

    .line 1064
    .line 1065
    move/from16 v30, v14

    .line 1066
    .line 1067
    const-string v0, ", \u4efb\u52a1 "

    .line 1068
    .line 1069
    const-string v1, ", \u76f8\u5173 "

    .line 1070
    .line 1071
    const-string v2, "\u4efb\u52a1\u68c0\u6d4b\u5b8c\u6210: \u4f1a\u8bdd "

    .line 1072
    .line 1073
    invoke-static {v2, v8, v0, v9, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    const-string v1, ", \u6570\u91cf\u4efb\u52a1 "

    .line 1078
    .line 1079
    const-string v2, ", \u53ef\u9886\u53d6 "

    .line 1080
    .line 1081
    move/from16 v10, v33

    .line 1082
    .line 1083
    move/from16 v11, v34

    .line 1084
    .line 1085
    invoke-static {v0, v10, v1, v11, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    move/from16 v13, v31

    .line 1089
    .line 1090
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1091
    .line 1092
    .line 1093
    const-string v1, ", \u5931\u8d25 "

    .line 1094
    .line 1095
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1096
    .line 1097
    .line 1098
    move/from16 v14, v30

    .line 1099
    .line 1100
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    const-string v1, "\uff1b\u672a\u53d1\u9001\u6d88\u606f"

    .line 1104
    .line 1105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    const/4 v1, 0x4

    .line 1113
    const/4 v3, 0x0

    .line 1114
    invoke-static {v5, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1115
    .line 1116
    .line 1117
    new-instance v6, Lzf1;

    .line 1118
    .line 1119
    move v7, v8

    .line 1120
    move v8, v9

    .line 1121
    move v9, v10

    .line 1122
    move v10, v11

    .line 1123
    move v11, v13

    .line 1124
    move v13, v14

    .line 1125
    const/4 v12, 0x0

    .line 1126
    move-object v14, v0

    .line 1127
    invoke-direct/range {v6 .. v14}, Lzf1;-><init>(IIIIIIILjava/lang/String;)V

    .line 1128
    .line 1129
    .line 1130
    return-object v6
.end method

.method public static γ(Ltf1;)Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Ltf1;->γ:I

    .line 2
    .line 3
    iget-object v1, p0, Ltf1;->ι:Ljava/lang/Integer;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-lez v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v2

    .line 16
    :goto_0
    iget-object p0, p0, Ltf1;->θ:Ljava/lang/Integer;

    .line 17
    .line 18
    if-nez p0, :cond_2

    .line 19
    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    const/16 p0, 0x71a3

    .line 23
    .line 24
    filled-new-array {v0}, [I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {p0, v3}, Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;->β(I[I)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x3

    .line 35
    if-ne v0, p0, :cond_3

    .line 36
    .line 37
    :cond_1
    move-object v2, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object v2, p0

    .line 40
    :cond_3
    :goto_1
    if-eqz v2, :cond_4

    .line 41
    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    new-instance p0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, "/"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    if-eqz v2, :cond_5

    .line 66
    .line 67
    new-instance p0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, "/?"

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_5
    if-eqz v1, :cond_6

    .line 86
    .line 87
    new-instance p0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v0, "?/"

    .line 90
    .line 91
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :cond_6
    const-string p0, "unknown"

    .line 103
    .line 104
    return-object p0
.end method

.method public static δ(Ltf1;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ltf1;->δ()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ltf1;->γ()Lfg1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, ")"

    .line 14
    .line 15
    const-string v3, "("

    .line 16
    .line 17
    const-string v4, ""

    .line 18
    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    if-eq v1, v5, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x2

    .line 25
    if-ne v1, p0, :cond_0

    .line 26
    .line 27
    const-string p0, "other"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_1
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p0}, Ltf1;->β()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move-object v4, p0

    .line 49
    :goto_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "media:"

    .line 52
    .line 53
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_3
    const-string p0, "media:unknown"

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_4
    if-eqz v0, :cond_6

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p0}, Ltf1;->β()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-nez p0, :cond_5

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    move-object v4, p0

    .line 90
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v1, "message:"

    .line 93
    .line 94
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :cond_6
    const-string p0, "message:unknown"

    .line 115
    .line 116
    return-object p0
.end method
