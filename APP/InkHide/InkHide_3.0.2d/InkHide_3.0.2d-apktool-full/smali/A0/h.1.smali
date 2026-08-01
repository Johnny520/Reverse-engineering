.class public final synthetic LA0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;
.implements LM0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    iput v0, p0, LA0/h;->a:I

    sget-object v0, LA0/Y;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/h;->b:Landroid/content/Context;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 2
    iput p2, p0, LA0/h;->a:I

    iput-object p1, p0, LA0/h;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    const-string v1, "bridge"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p0

    .line 11
    .line 12
    iget-object v2, v1, LA0/h;->b:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "getClassLoader(...)"

    .line 19
    .line 20
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v3, "com.tencent.mm.storage.e4"

    .line 24
    .line 25
    const-string v4, "com.tencent.mm.storage.l4"

    .line 26
    .line 27
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    new-instance v4, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v2, v5}, LA0/g;->H(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    const/4 v5, 0x0

    .line 71
    const-string v6, "com.tencent.mm.storage."

    .line 72
    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    :goto_1
    move-object v7, v4

    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_2
    const-string v3, "storage"

    .line 79
    .line 80
    invoke-static {v3}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v0, v2, v3}, LA0/g;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    new-instance v4, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_7

    .line 102
    .line 103
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    move-object v8, v7

    .line 108
    check-cast v8, Ljava/lang/Class;

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    invoke-static {v9, v5, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    if-eqz v9, :cond_3

    .line 119
    .line 120
    invoke-static {v8}, LA0/g;->i(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-eqz v9, :cond_4

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    :cond_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-eqz v9, :cond_3

    .line 140
    .line 141
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    check-cast v9, Ljava/lang/reflect/Field;

    .line 146
    .line 147
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    const-string v11, "field_username"

    .line 152
    .line 153
    invoke-static {v10, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-nez v10, :cond_6

    .line 158
    .line 159
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    const-string v11, "field_conversationTime"

    .line 164
    .line 165
    invoke-static {v10, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    if-nez v10, :cond_6

    .line 170
    .line 171
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    const-string v10, "field_digest"

    .line 176
    .line 177
    invoke-static {v9, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    if-eqz v9, :cond_5

    .line 182
    .line 183
    :cond_6
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_7
    const/4 v3, 0x4

    .line 188
    invoke-static {v4, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    goto :goto_1

    .line 193
    :goto_3
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_8

    .line 198
    .line 199
    const-string v0, "conversation dexkit unresolved storage empty"

    .line 200
    .line 201
    invoke-static {v0}, LA0/g;->q(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    move/from16 v18, v5

    .line 205
    .line 206
    const/4 v11, 0x1

    .line 207
    const/4 v13, 0x0

    .line 208
    goto/16 :goto_52

    .line 209
    .line 210
    :cond_8
    const-string v17, "unRead"

    .line 211
    .line 212
    const-string v18, "digest"

    .line 213
    .line 214
    const-string v14, "conversation"

    .line 215
    .line 216
    const-string v15, "rconversation"

    .line 217
    .line 218
    const-string v16, "storage"

    .line 219
    .line 220
    const-string v19, "session"

    .line 221
    .line 222
    const-string v20, "chat"

    .line 223
    .line 224
    filled-new-array/range {v14 .. v20}, [Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-static {v3}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-static {v0, v2, v3}, LA0/g;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/util/ArrayList;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    new-instance v8, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    if-eqz v10, :cond_9

    .line 250
    .line 251
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    check-cast v10, Ljava/lang/Class;

    .line 256
    .line 257
    invoke-static {v10, v2}, LA0/g;->v(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v10

    .line 261
    invoke-static {v10, v8}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_9
    invoke-static {v2}, LA0/g;->x(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    invoke-static {v8, v9}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    invoke-static {v8, v3}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    new-instance v8, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    const-class v10, Ljava/lang/String;

    .line 291
    .line 292
    const-class v11, Ljava/util/List;

    .line 293
    .line 294
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 295
    .line 296
    const-string v15, "getParameterTypes(...)"

    .line 297
    .line 298
    const-string v13, "scanner"

    .line 299
    .line 300
    const-string v14, "game"

    .line 301
    .line 302
    const-string v4, "finder"

    .line 303
    .line 304
    if-eqz v9, :cond_23

    .line 305
    .line 306
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    move-object v5, v9

    .line 311
    check-cast v5, Ljava/lang/Class;

    .line 312
    .line 313
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v19

    .line 317
    invoke-static/range {v19 .. v19}, LA0/g;->D(Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v19

    .line 321
    if-eqz v19, :cond_22

    .line 322
    .line 323
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    move-object/from16 v19, v3

    .line 328
    .line 329
    const/4 v3, 0x0

    .line 330
    invoke-static {v1, v3, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    if-nez v1, :cond_21

    .line 335
    .line 336
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    const/4 v3, 0x1

    .line 341
    invoke-static {v1, v4, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-nez v1, :cond_21

    .line 346
    .line 347
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-static {v1, v14, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-nez v1, :cond_21

    .line 356
    .line 357
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-static {v1, v13, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    if-nez v1, :cond_21

    .line 366
    .line 367
    new-instance v1, Ljava/util/ArrayList;

    .line 368
    .line 369
    invoke-static {v7}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    if-eqz v4, :cond_a

    .line 385
    .line 386
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    check-cast v4, Ljava/lang/Class;

    .line 391
    .line 392
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    goto :goto_6

    .line 400
    :cond_a
    invoke-static {v1}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-static {v5}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-static {v5}, LA0/g;->i(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 413
    .line 414
    .line 415
    move-result v13

    .line 416
    if-eqz v13, :cond_b

    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_b
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object v13

    .line 423
    :cond_c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    .line 425
    .line 426
    move-result v14

    .line 427
    if-eqz v14, :cond_d

    .line 428
    .line 429
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v14

    .line 433
    check-cast v14, Ljava/lang/reflect/Field;

    .line 434
    .line 435
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    move-result-object v14

    .line 439
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v14

    .line 443
    invoke-interface {v1, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v14

    .line 447
    if-eqz v14, :cond_c

    .line 448
    .line 449
    move-object/from16 v21, v3

    .line 450
    .line 451
    goto :goto_a

    .line 452
    :cond_d
    :goto_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 453
    .line 454
    .line 455
    move-result v13

    .line 456
    if-eqz v13, :cond_f

    .line 457
    .line 458
    :cond_e
    move-object/from16 v21, v3

    .line 459
    .line 460
    goto :goto_b

    .line 461
    :cond_f
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 462
    .line 463
    .line 464
    move-result-object v13

    .line 465
    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v14

    .line 469
    if-eqz v14, :cond_e

    .line 470
    .line 471
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v14

    .line 475
    check-cast v14, Ljava/lang/reflect/Method;

    .line 476
    .line 477
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    move-result-object v20

    .line 481
    move-object/from16 v21, v3

    .line 482
    .line 483
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    if-nez v3, :cond_12

    .line 492
    .line 493
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    invoke-static {v3, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    array-length v14, v3

    .line 501
    move-object/from16 v20, v3

    .line 502
    .line 503
    const/4 v3, 0x0

    .line 504
    :goto_9
    if-ge v3, v14, :cond_11

    .line 505
    .line 506
    aget-object v22, v20, v3

    .line 507
    .line 508
    move/from16 v23, v3

    .line 509
    .line 510
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    if-eqz v3, :cond_10

    .line 519
    .line 520
    goto :goto_a

    .line 521
    :cond_10
    add-int/lit8 v3, v23, 0x1

    .line 522
    .line 523
    goto :goto_9

    .line 524
    :cond_11
    move-object/from16 v3, v21

    .line 525
    .line 526
    goto :goto_8

    .line 527
    :cond_12
    :goto_a
    const/4 v1, 0x1

    .line 528
    goto :goto_c

    .line 529
    :goto_b
    const/4 v1, 0x0

    .line 530
    :goto_c
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->isEmpty()Z

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    if-eqz v3, :cond_14

    .line 535
    .line 536
    :cond_13
    const/4 v3, 0x0

    .line 537
    goto :goto_d

    .line 538
    :cond_14
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    :cond_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 543
    .line 544
    .line 545
    move-result v13

    .line 546
    if-eqz v13, :cond_13

    .line 547
    .line 548
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v13

    .line 552
    check-cast v13, Ljava/lang/reflect/Method;

    .line 553
    .line 554
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    move-result-object v14

    .line 558
    invoke-static {v14, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    array-length v14, v14

    .line 562
    if-nez v14, :cond_15

    .line 563
    .line 564
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    move-result-object v13

    .line 568
    invoke-virtual {v11, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 569
    .line 570
    .line 571
    move-result v13

    .line 572
    if-eqz v13, :cond_15

    .line 573
    .line 574
    const/4 v3, 0x1

    .line 575
    :goto_d
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->isEmpty()Z

    .line 576
    .line 577
    .line 578
    move-result v13

    .line 579
    if-eqz v13, :cond_17

    .line 580
    .line 581
    :cond_16
    move/from16 v20, v1

    .line 582
    .line 583
    const/4 v1, 0x0

    .line 584
    goto :goto_f

    .line 585
    :cond_17
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 586
    .line 587
    .line 588
    move-result-object v13

    .line 589
    :goto_e
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 590
    .line 591
    .line 592
    move-result v14

    .line 593
    if-eqz v14, :cond_16

    .line 594
    .line 595
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v14

    .line 599
    check-cast v14, Ljava/lang/reflect/Method;

    .line 600
    .line 601
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    move-result-object v15

    .line 605
    array-length v15, v15

    .line 606
    move/from16 v20, v1

    .line 607
    .line 608
    const/4 v1, 0x1

    .line 609
    if-ne v15, v1, :cond_18

    .line 610
    .line 611
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    const/16 v18, 0x0

    .line 616
    .line 617
    aget-object v1, v1, v18

    .line 618
    .line 619
    invoke-virtual {v11, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-eqz v1, :cond_18

    .line 624
    .line 625
    const/4 v1, 0x1

    .line 626
    goto :goto_f

    .line 627
    :cond_18
    move/from16 v1, v20

    .line 628
    .line 629
    goto :goto_e

    .line 630
    :goto_f
    invoke-static {v5, v7}, LA0/g;->w(Ljava/lang/Class;Ljava/util/List;)Ljava/util/ArrayList;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 635
    .line 636
    .line 637
    move-result v5

    .line 638
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->isEmpty()Z

    .line 639
    .line 640
    .line 641
    move-result v11

    .line 642
    if-eqz v11, :cond_1a

    .line 643
    .line 644
    :cond_19
    const/4 v10, 0x0

    .line 645
    goto :goto_10

    .line 646
    :cond_1a
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 647
    .line 648
    .line 649
    move-result-object v11

    .line 650
    :cond_1b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 651
    .line 652
    .line 653
    move-result v13

    .line 654
    if-eqz v13, :cond_19

    .line 655
    .line 656
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v13

    .line 660
    check-cast v13, Ljava/lang/reflect/Method;

    .line 661
    .line 662
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    move-result-object v14

    .line 666
    array-length v14, v14

    .line 667
    const/4 v15, 0x2

    .line 668
    if-ne v14, v15, :cond_1b

    .line 669
    .line 670
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    move-result-object v14

    .line 674
    const/16 v18, 0x0

    .line 675
    .line 676
    aget-object v14, v14, v18

    .line 677
    .line 678
    invoke-static {v14, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v14

    .line 682
    if-eqz v14, :cond_1b

    .line 683
    .line 684
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    move-result-object v13

    .line 688
    const/16 v17, 0x1

    .line 689
    .line 690
    aget-object v13, v13, v17

    .line 691
    .line 692
    invoke-static {v13, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    move-result v13

    .line 696
    if-eqz v13, :cond_1b

    .line 697
    .line 698
    const/4 v10, 0x1

    .line 699
    :goto_10
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 700
    .line 701
    .line 702
    move-result v11

    .line 703
    if-eqz v11, :cond_1d

    .line 704
    .line 705
    :cond_1c
    const/4 v4, 0x0

    .line 706
    goto :goto_11

    .line 707
    :cond_1d
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 708
    .line 709
    .line 710
    move-result-object v4

    .line 711
    :cond_1e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 712
    .line 713
    .line 714
    move-result v11

    .line 715
    if-eqz v11, :cond_1c

    .line 716
    .line 717
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v11

    .line 721
    check-cast v11, Ljava/lang/reflect/Field;

    .line 722
    .line 723
    const-class v12, Ljava/util/Map;

    .line 724
    .line 725
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    move-result-object v11

    .line 729
    invoke-virtual {v12, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 730
    .line 731
    .line 732
    move-result v11

    .line 733
    if-eqz v11, :cond_1e

    .line 734
    .line 735
    const/4 v4, 0x1

    .line 736
    :goto_11
    if-eqz v20, :cond_21

    .line 737
    .line 738
    if-nez v3, :cond_1f

    .line 739
    .line 740
    if-eqz v4, :cond_21

    .line 741
    .line 742
    :cond_1f
    if-nez v1, :cond_20

    .line 743
    .line 744
    if-eqz v5, :cond_20

    .line 745
    .line 746
    if-eqz v10, :cond_21

    .line 747
    .line 748
    :cond_20
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    :cond_21
    :goto_12
    move-object/from16 v1, p0

    .line 752
    .line 753
    move-object/from16 v3, v19

    .line 754
    .line 755
    const/4 v5, 0x0

    .line 756
    goto/16 :goto_5

    .line 757
    .line 758
    :cond_22
    move-object/from16 v19, v3

    .line 759
    .line 760
    goto :goto_12

    .line 761
    :cond_23
    new-instance v1, Ljava/util/HashSet;

    .line 762
    .line 763
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 764
    .line 765
    .line 766
    new-instance v3, Ljava/util/ArrayList;

    .line 767
    .line 768
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 772
    .line 773
    .line 774
    move-result-object v5

    .line 775
    :cond_24
    :goto_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 776
    .line 777
    .line 778
    move-result v6

    .line 779
    if-eqz v6, :cond_25

    .line 780
    .line 781
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v6

    .line 785
    move-object v8, v6

    .line 786
    check-cast v8, Ljava/lang/Class;

    .line 787
    .line 788
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v8

    .line 792
    invoke-virtual {v1, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    move-result v8

    .line 796
    if-eqz v8, :cond_24

    .line 797
    .line 798
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    goto :goto_13

    .line 802
    :cond_25
    const/16 v1, 0x30

    .line 803
    .line 804
    invoke-static {v3, v1}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 805
    .line 806
    .line 807
    move-result-object v1

    .line 808
    const/16 v3, 0xc

    .line 809
    .line 810
    invoke-static {v1, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 811
    .line 812
    .line 813
    move-result-object v19

    .line 814
    new-instance v5, LA0/a;

    .line 815
    .line 816
    const/16 v6, 0xe

    .line 817
    .line 818
    invoke-direct {v5, v6}, LA0/a;-><init>(I)V

    .line 819
    .line 820
    .line 821
    const/16 v21, 0x0

    .line 822
    .line 823
    const/16 v22, 0x0

    .line 824
    .line 825
    const-string v20, ","

    .line 826
    .line 827
    const/16 v24, 0x1e

    .line 828
    .line 829
    move-object/from16 v23, v5

    .line 830
    .line 831
    invoke-static/range {v19 .. v24}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v5

    .line 835
    const-string v6, "conversation dexkit datasource candidates "

    .line 836
    .line 837
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v5

    .line 841
    invoke-static {v5}, LA0/g;->q(Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 845
    .line 846
    .line 847
    move-result v5

    .line 848
    if-eqz v5, :cond_26

    .line 849
    .line 850
    new-instance v11, LA0/a;

    .line 851
    .line 852
    const/4 v0, 0x7

    .line 853
    invoke-direct {v11, v0}, LA0/a;-><init>(I)V

    .line 854
    .line 855
    .line 856
    const/4 v10, 0x0

    .line 857
    const/16 v12, 0x1e

    .line 858
    .line 859
    const-string v8, ","

    .line 860
    .line 861
    const/4 v9, 0x0

    .line 862
    invoke-static/range {v7 .. v12}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    const-string v1, "conversation dexkit unresolved dataSource candidate empty storage="

    .line 867
    .line 868
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-static {v0}, LA0/g;->q(Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    :goto_14
    const/4 v11, 0x1

    .line 876
    const/4 v13, 0x0

    .line 877
    const/16 v18, 0x0

    .line 878
    .line 879
    goto/16 :goto_52

    .line 880
    .line 881
    :cond_26
    new-instance v5, Ljava/util/ArrayList;

    .line 882
    .line 883
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 884
    .line 885
    .line 886
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 887
    .line 888
    .line 889
    move-result-object v6

    .line 890
    :goto_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 891
    .line 892
    .line 893
    move-result v8

    .line 894
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 895
    .line 896
    const-string v3, "ViewHolder"

    .line 897
    .line 898
    move-object/from16 v20, v6

    .line 899
    .line 900
    const-string v6, " dataSource="

    .line 901
    .line 902
    move/from16 v21, v8

    .line 903
    .line 904
    if-eqz v21, :cond_43

    .line 905
    .line 906
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v21

    .line 910
    move-object/from16 v8, v21

    .line 911
    .line 912
    check-cast v8, Ljava/lang/Class;

    .line 913
    .line 914
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v21

    .line 918
    invoke-static/range {v21 .. v21}, LA0/g;->E(Ljava/lang/String;)Z

    .line 919
    .line 920
    .line 921
    move-result v21

    .line 922
    if-eqz v21, :cond_27

    .line 923
    .line 924
    invoke-static {v2}, LA0/g;->x(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 925
    .line 926
    .line 927
    move-result-object v21

    .line 928
    move-object/from16 v24, v21

    .line 929
    .line 930
    move-object/from16 v21, v10

    .line 931
    .line 932
    move-object/from16 v10, v24

    .line 933
    .line 934
    move-object/from16 v24, v11

    .line 935
    .line 936
    goto :goto_16

    .line 937
    :cond_27
    move-object/from16 v21, v10

    .line 938
    .line 939
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v10

    .line 943
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v23

    .line 947
    move-object/from16 v24, v11

    .line 948
    .line 949
    invoke-static/range {v23 .. v23}, LU0/i;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v11

    .line 953
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v10

    .line 957
    invoke-static {v10}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 958
    .line 959
    .line 960
    move-result-object v10

    .line 961
    invoke-static {v0, v2, v10}, LA0/g;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/util/ArrayList;

    .line 962
    .line 963
    .line 964
    move-result-object v10

    .line 965
    :goto_16
    invoke-static {v8, v2}, LA0/g;->v(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 966
    .line 967
    .line 968
    move-result-object v11

    .line 969
    invoke-static {v11, v10}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 970
    .line 971
    .line 972
    move-result-object v10

    .line 973
    new-instance v11, Ljava/util/HashSet;

    .line 974
    .line 975
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 976
    .line 977
    .line 978
    move-object/from16 v23, v0

    .line 979
    .line 980
    new-instance v0, Ljava/util/ArrayList;

    .line 981
    .line 982
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 986
    .line 987
    .line 988
    move-result-object v10

    .line 989
    :goto_17
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 990
    .line 991
    .line 992
    move-result v25

    .line 993
    if-eqz v25, :cond_29

    .line 994
    .line 995
    move-object/from16 v25, v2

    .line 996
    .line 997
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    move-object/from16 v26, v2

    .line 1002
    .line 1003
    check-cast v26, Ljava/lang/Class;

    .line 1004
    .line 1005
    move-object/from16 v27, v10

    .line 1006
    .line 1007
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v10

    .line 1011
    invoke-virtual {v11, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v10

    .line 1015
    if-eqz v10, :cond_28

    .line 1016
    .line 1017
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1018
    .line 1019
    .line 1020
    :cond_28
    move-object/from16 v2, v25

    .line 1021
    .line 1022
    move-object/from16 v10, v27

    .line 1023
    .line 1024
    goto :goto_17

    .line 1025
    :cond_29
    move-object/from16 v25, v2

    .line 1026
    .line 1027
    new-instance v2, Ljava/util/ArrayList;

    .line 1028
    .line 1029
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1037
    .line 1038
    .line 1039
    move-result v10

    .line 1040
    if-eqz v10, :cond_40

    .line 1041
    .line 1042
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v10

    .line 1046
    move-object v11, v10

    .line 1047
    check-cast v11, Ljava/lang/Class;

    .line 1048
    .line 1049
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v26

    .line 1053
    invoke-static/range {v26 .. v26}, LA0/g;->D(Ljava/lang/String;)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v26

    .line 1057
    if-eqz v26, :cond_3f

    .line 1058
    .line 1059
    move-object/from16 v26, v0

    .line 1060
    .line 1061
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    move-object/from16 v27, v11

    .line 1066
    .line 1067
    const/4 v11, 0x1

    .line 1068
    invoke-static {v0, v4, v11}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v0

    .line 1072
    if-nez v0, :cond_3e

    .line 1073
    .line 1074
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    invoke-static {v0, v14, v11}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v0

    .line 1082
    if-nez v0, :cond_3e

    .line 1083
    .line 1084
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    invoke-static {v0, v13, v11}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v0

    .line 1092
    if-nez v0, :cond_3e

    .line 1093
    .line 1094
    invoke-static/range {v27 .. v27}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1099
    .line 1100
    .line 1101
    move-result v11

    .line 1102
    move-object/from16 v28, v0

    .line 1103
    .line 1104
    const-string v0, "android.view.View"

    .line 1105
    .line 1106
    if-eqz v11, :cond_2b

    .line 1107
    .line 1108
    :cond_2a
    move-object/from16 v29, v4

    .line 1109
    .line 1110
    move-object/from16 v34, v13

    .line 1111
    .line 1112
    const/4 v4, 0x0

    .line 1113
    goto/16 :goto_1e

    .line 1114
    .line 1115
    :cond_2b
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v11

    .line 1119
    :goto_19
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1120
    .line 1121
    .line 1122
    move-result v28

    .line 1123
    if-eqz v28, :cond_2a

    .line 1124
    .line 1125
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v28

    .line 1129
    check-cast v28, Ljava/lang/reflect/Method;

    .line 1130
    .line 1131
    move-object/from16 v29, v4

    .line 1132
    .line 1133
    invoke-virtual/range {v28 .. v28}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v4

    .line 1137
    invoke-static {v4, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v4

    .line 1141
    if-eqz v4, :cond_30

    .line 1142
    .line 1143
    invoke-virtual/range {v28 .. v28}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v4

    .line 1147
    array-length v4, v4

    .line 1148
    move-object/from16 v30, v11

    .line 1149
    .line 1150
    const/4 v11, 0x2

    .line 1151
    if-lt v4, v11, :cond_2f

    .line 1152
    .line 1153
    invoke-virtual/range {v28 .. v28}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v4

    .line 1157
    invoke-static {v4, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    array-length v11, v4

    .line 1161
    move-object/from16 v28, v4

    .line 1162
    .line 1163
    const/4 v4, 0x0

    .line 1164
    :goto_1a
    if-ge v4, v11, :cond_2f

    .line 1165
    .line 1166
    aget-object v31, v28, v4

    .line 1167
    .line 1168
    move/from16 v32, v4

    .line 1169
    .line 1170
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v4

    .line 1174
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1175
    .line 1176
    .line 1177
    move-result v4

    .line 1178
    if-nez v4, :cond_2d

    .line 1179
    .line 1180
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v4

    .line 1184
    move/from16 v33, v11

    .line 1185
    .line 1186
    const/4 v11, 0x0

    .line 1187
    invoke-static {v4, v3, v11}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v4

    .line 1191
    if-nez v4, :cond_2d

    .line 1192
    .line 1193
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v4

    .line 1197
    move-object/from16 v34, v13

    .line 1198
    .line 1199
    const-string v13, "androidx.recyclerview"

    .line 1200
    .line 1201
    invoke-static {v4, v11, v13}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v4

    .line 1205
    if-nez v4, :cond_2e

    .line 1206
    .line 1207
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v4

    .line 1211
    const-string v13, "android.support.v7.widget.RecyclerView"

    .line 1212
    .line 1213
    invoke-static {v4, v11, v13}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v4

    .line 1217
    if-eqz v4, :cond_2c

    .line 1218
    .line 1219
    goto :goto_1b

    .line 1220
    :cond_2c
    add-int/lit8 v4, v32, 0x1

    .line 1221
    .line 1222
    move/from16 v11, v33

    .line 1223
    .line 1224
    move-object/from16 v13, v34

    .line 1225
    .line 1226
    goto :goto_1a

    .line 1227
    :cond_2d
    move-object/from16 v34, v13

    .line 1228
    .line 1229
    :cond_2e
    :goto_1b
    const/4 v4, 0x1

    .line 1230
    goto :goto_1e

    .line 1231
    :cond_2f
    :goto_1c
    move-object/from16 v34, v13

    .line 1232
    .line 1233
    goto :goto_1d

    .line 1234
    :cond_30
    move-object/from16 v30, v11

    .line 1235
    .line 1236
    goto :goto_1c

    .line 1237
    :goto_1d
    move-object/from16 v4, v29

    .line 1238
    .line 1239
    move-object/from16 v11, v30

    .line 1240
    .line 1241
    move-object/from16 v13, v34

    .line 1242
    .line 1243
    goto :goto_19

    .line 1244
    :goto_1e
    invoke-static/range {v27 .. v27}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v11

    .line 1248
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1249
    .line 1250
    .line 1251
    move-result v13

    .line 1252
    if-eqz v13, :cond_32

    .line 1253
    .line 1254
    :cond_31
    move/from16 v28, v4

    .line 1255
    .line 1256
    goto/16 :goto_20

    .line 1257
    .line 1258
    :cond_32
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v11

    .line 1262
    :goto_1f
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1263
    .line 1264
    .line 1265
    move-result v13

    .line 1266
    if-eqz v13, :cond_31

    .line 1267
    .line 1268
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v13

    .line 1272
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1273
    .line 1274
    move/from16 v28, v4

    .line 1275
    .line 1276
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v4

    .line 1280
    move-object/from16 v30, v11

    .line 1281
    .line 1282
    const-string v11, "getView"

    .line 1283
    .line 1284
    invoke-static {v4, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v4

    .line 1288
    if-eqz v4, :cond_35

    .line 1289
    .line 1290
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v4

    .line 1294
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v4

    .line 1298
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v4

    .line 1302
    if-eqz v4, :cond_35

    .line 1303
    .line 1304
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v4

    .line 1308
    array-length v4, v4

    .line 1309
    const/4 v11, 0x3

    .line 1310
    if-ne v4, v11, :cond_35

    .line 1311
    .line 1312
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v4

    .line 1316
    const/16 v18, 0x0

    .line 1317
    .line 1318
    aget-object v4, v4, v18

    .line 1319
    .line 1320
    invoke-static {v4, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1321
    .line 1322
    .line 1323
    move-result v4

    .line 1324
    if-eqz v4, :cond_35

    .line 1325
    .line 1326
    invoke-static/range {v27 .. v27}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v0

    .line 1330
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1331
    .line 1332
    .line 1333
    move-result v4

    .line 1334
    if-eqz v4, :cond_33

    .line 1335
    .line 1336
    goto :goto_20

    .line 1337
    :cond_33
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    :cond_34
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1342
    .line 1343
    .line 1344
    move-result v4

    .line 1345
    if-eqz v4, :cond_36

    .line 1346
    .line 1347
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v4

    .line 1351
    check-cast v4, Ljava/lang/reflect/Method;

    .line 1352
    .line 1353
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v11

    .line 1357
    const-string v13, "getItem"

    .line 1358
    .line 1359
    invoke-static {v11, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1360
    .line 1361
    .line 1362
    move-result v11

    .line 1363
    if-eqz v11, :cond_34

    .line 1364
    .line 1365
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v4

    .line 1369
    array-length v4, v4

    .line 1370
    const/4 v11, 0x1

    .line 1371
    if-ne v4, v11, :cond_34

    .line 1372
    .line 1373
    const/4 v0, 0x1

    .line 1374
    goto :goto_21

    .line 1375
    :cond_35
    move/from16 v4, v28

    .line 1376
    .line 1377
    move-object/from16 v11, v30

    .line 1378
    .line 1379
    goto :goto_1f

    .line 1380
    :cond_36
    :goto_20
    const/4 v0, 0x0

    .line 1381
    :goto_21
    if-nez v28, :cond_37

    .line 1382
    .line 1383
    if-eqz v0, :cond_3d

    .line 1384
    .line 1385
    :cond_37
    invoke-static/range {v27 .. v27}, LA0/g;->i(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1390
    .line 1391
    .line 1392
    move-result v4

    .line 1393
    if-eqz v4, :cond_38

    .line 1394
    .line 1395
    goto :goto_22

    .line 1396
    :cond_38
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    :cond_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1401
    .line 1402
    .line 1403
    move-result v4

    .line 1404
    if-eqz v4, :cond_3a

    .line 1405
    .line 1406
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v4

    .line 1410
    check-cast v4, Ljava/lang/reflect/Field;

    .line 1411
    .line 1412
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v4

    .line 1416
    invoke-static {v4, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1417
    .line 1418
    .line 1419
    move-result v4

    .line 1420
    if-eqz v4, :cond_39

    .line 1421
    .line 1422
    goto :goto_23

    .line 1423
    :cond_3a
    :goto_22
    invoke-static/range {v27 .. v27}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v0

    .line 1427
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1428
    .line 1429
    .line 1430
    move-result v4

    .line 1431
    if-eqz v4, :cond_3b

    .line 1432
    .line 1433
    goto :goto_24

    .line 1434
    :cond_3b
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    :cond_3c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1439
    .line 1440
    .line 1441
    move-result v4

    .line 1442
    if-eqz v4, :cond_3d

    .line 1443
    .line 1444
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v4

    .line 1448
    check-cast v4, Ljava/lang/reflect/Method;

    .line 1449
    .line 1450
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v4

    .line 1454
    invoke-static {v4, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1455
    .line 1456
    .line 1457
    move-result v4

    .line 1458
    if-eqz v4, :cond_3c

    .line 1459
    .line 1460
    :goto_23
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1461
    .line 1462
    .line 1463
    :cond_3d
    :goto_24
    move-object/from16 v0, v26

    .line 1464
    .line 1465
    move-object/from16 v4, v29

    .line 1466
    .line 1467
    move-object/from16 v13, v34

    .line 1468
    .line 1469
    goto/16 :goto_18

    .line 1470
    .line 1471
    :cond_3e
    :goto_25
    move-object/from16 v29, v4

    .line 1472
    .line 1473
    move-object/from16 v34, v13

    .line 1474
    .line 1475
    goto :goto_24

    .line 1476
    :cond_3f
    move-object/from16 v26, v0

    .line 1477
    .line 1478
    goto :goto_25

    .line 1479
    :cond_40
    move-object/from16 v29, v4

    .line 1480
    .line 1481
    move-object/from16 v34, v13

    .line 1482
    .line 1483
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v0

    .line 1487
    const/16 v3, 0x8

    .line 1488
    .line 1489
    invoke-static {v2, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v35

    .line 1493
    new-instance v3, LA0/a;

    .line 1494
    .line 1495
    const/16 v4, 0xf

    .line 1496
    .line 1497
    invoke-direct {v3, v4}, LA0/a;-><init>(I)V

    .line 1498
    .line 1499
    .line 1500
    const/16 v37, 0x0

    .line 1501
    .line 1502
    const/16 v38, 0x0

    .line 1503
    .line 1504
    const-string v36, ","

    .line 1505
    .line 1506
    const/16 v40, 0x1e

    .line 1507
    .line 1508
    move-object/from16 v39, v3

    .line 1509
    .line 1510
    invoke-static/range {v35 .. v40}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v3

    .line 1514
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1515
    .line 1516
    const-string v9, "conversation dexkit adapter candidates for "

    .line 1517
    .line 1518
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1522
    .line 1523
    .line 1524
    const-string v0, " "

    .line 1525
    .line 1526
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1530
    .line 1531
    .line 1532
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v0

    .line 1536
    invoke-static {v0}, LA0/g;->q(Ljava/lang/String;)V

    .line 1537
    .line 1538
    .line 1539
    invoke-static {v2}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v0

    .line 1543
    check-cast v0, Ljava/lang/Class;

    .line 1544
    .line 1545
    if-eqz v0, :cond_41

    .line 1546
    .line 1547
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v2

    .line 1551
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v3

    .line 1555
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1556
    .line 1557
    const-string v9, "conversation dexkit pair adapter="

    .line 1558
    .line 1559
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1560
    .line 1561
    .line 1562
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1563
    .line 1564
    .line 1565
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1566
    .line 1567
    .line 1568
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1569
    .line 1570
    .line 1571
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v2

    .line 1575
    invoke-static {v2}, LA0/g;->q(Ljava/lang/String;)V

    .line 1576
    .line 1577
    .line 1578
    new-instance v2, LE0/c;

    .line 1579
    .line 1580
    invoke-direct {v2, v0, v8}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1581
    .line 1582
    .line 1583
    goto :goto_26

    .line 1584
    :cond_41
    const/4 v2, 0x0

    .line 1585
    :goto_26
    if-eqz v2, :cond_42

    .line 1586
    .line 1587
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1588
    .line 1589
    .line 1590
    :cond_42
    move-object/from16 v6, v20

    .line 1591
    .line 1592
    move-object/from16 v10, v21

    .line 1593
    .line 1594
    move-object/from16 v0, v23

    .line 1595
    .line 1596
    move-object/from16 v11, v24

    .line 1597
    .line 1598
    move-object/from16 v2, v25

    .line 1599
    .line 1600
    move-object/from16 v4, v29

    .line 1601
    .line 1602
    move-object/from16 v13, v34

    .line 1603
    .line 1604
    const/16 v3, 0xc

    .line 1605
    .line 1606
    goto/16 :goto_15

    .line 1607
    .line 1608
    :cond_43
    move-object/from16 v21, v10

    .line 1609
    .line 1610
    move-object/from16 v24, v11

    .line 1611
    .line 1612
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1613
    .line 1614
    .line 1615
    move-result v0

    .line 1616
    if-eqz v0, :cond_44

    .line 1617
    .line 1618
    const/16 v0, 0xc

    .line 1619
    .line 1620
    invoke-static {v1, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v25

    .line 1624
    new-instance v0, LA0/a;

    .line 1625
    .line 1626
    const/16 v1, 0x8

    .line 1627
    .line 1628
    invoke-direct {v0, v1}, LA0/a;-><init>(I)V

    .line 1629
    .line 1630
    .line 1631
    const/16 v28, 0x0

    .line 1632
    .line 1633
    const/16 v30, 0x1e

    .line 1634
    .line 1635
    const-string v26, ","

    .line 1636
    .line 1637
    const/16 v27, 0x0

    .line 1638
    .line 1639
    move-object/from16 v29, v0

    .line 1640
    .line 1641
    invoke-static/range {v25 .. v30}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v0

    .line 1645
    const-string v1, "conversation dexkit unresolved adapter empty dataSourceCandidates="

    .line 1646
    .line 1647
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v0

    .line 1651
    invoke-static {v0}, LA0/g;->q(Ljava/lang/String;)V

    .line 1652
    .line 1653
    .line 1654
    goto/16 :goto_14

    .line 1655
    .line 1656
    :cond_44
    new-instance v0, Ljava/util/ArrayList;

    .line 1657
    .line 1658
    invoke-static {v5}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1659
    .line 1660
    .line 1661
    move-result v1

    .line 1662
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v1

    .line 1669
    :goto_27
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1670
    .line 1671
    .line 1672
    move-result v2

    .line 1673
    if-eqz v2, :cond_45

    .line 1674
    .line 1675
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v2

    .line 1679
    check-cast v2, LE0/c;

    .line 1680
    .line 1681
    iget-object v2, v2, LE0/c;->a:Ljava/lang/Object;

    .line 1682
    .line 1683
    check-cast v2, Ljava/lang/Class;

    .line 1684
    .line 1685
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1686
    .line 1687
    .line 1688
    goto :goto_27

    .line 1689
    :cond_45
    new-instance v1, Ljava/util/HashSet;

    .line 1690
    .line 1691
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1692
    .line 1693
    .line 1694
    new-instance v2, Ljava/util/ArrayList;

    .line 1695
    .line 1696
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1697
    .line 1698
    .line 1699
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v0

    .line 1703
    :cond_46
    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1704
    .line 1705
    .line 1706
    move-result v4

    .line 1707
    if-eqz v4, :cond_47

    .line 1708
    .line 1709
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v4

    .line 1713
    move-object v8, v4

    .line 1714
    check-cast v8, Ljava/lang/Class;

    .line 1715
    .line 1716
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v8

    .line 1720
    invoke-virtual {v1, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1721
    .line 1722
    .line 1723
    move-result v8

    .line 1724
    if-eqz v8, :cond_46

    .line 1725
    .line 1726
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1727
    .line 1728
    .line 1729
    goto :goto_28

    .line 1730
    :cond_47
    const/16 v4, 0x8

    .line 1731
    .line 1732
    invoke-static {v2, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v25

    .line 1736
    new-instance v0, Ljava/util/ArrayList;

    .line 1737
    .line 1738
    invoke-static {v5}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1739
    .line 1740
    .line 1741
    move-result v1

    .line 1742
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1743
    .line 1744
    .line 1745
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v1

    .line 1749
    :goto_29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1750
    .line 1751
    .line 1752
    move-result v2

    .line 1753
    if-eqz v2, :cond_48

    .line 1754
    .line 1755
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v2

    .line 1759
    check-cast v2, LE0/c;

    .line 1760
    .line 1761
    iget-object v2, v2, LE0/c;->b:Ljava/lang/Object;

    .line 1762
    .line 1763
    check-cast v2, Ljava/lang/Class;

    .line 1764
    .line 1765
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1766
    .line 1767
    .line 1768
    goto :goto_29

    .line 1769
    :cond_48
    new-instance v1, Ljava/util/HashSet;

    .line 1770
    .line 1771
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1772
    .line 1773
    .line 1774
    new-instance v2, Ljava/util/ArrayList;

    .line 1775
    .line 1776
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1777
    .line 1778
    .line 1779
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v0

    .line 1783
    :cond_49
    :goto_2a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1784
    .line 1785
    .line 1786
    move-result v4

    .line 1787
    if-eqz v4, :cond_4a

    .line 1788
    .line 1789
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v4

    .line 1793
    move-object v5, v4

    .line 1794
    check-cast v5, Ljava/lang/Class;

    .line 1795
    .line 1796
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v5

    .line 1800
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1801
    .line 1802
    .line 1803
    move-result v5

    .line 1804
    if-eqz v5, :cond_49

    .line 1805
    .line 1806
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1807
    .line 1808
    .line 1809
    goto :goto_2a

    .line 1810
    :cond_4a
    const/16 v4, 0x8

    .line 1811
    .line 1812
    invoke-static {v2, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v26

    .line 1816
    new-instance v0, Ljava/util/ArrayList;

    .line 1817
    .line 1818
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1819
    .line 1820
    .line 1821
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v1

    .line 1825
    :goto_2b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1826
    .line 1827
    .line 1828
    move-result v2

    .line 1829
    if-eqz v2, :cond_4b

    .line 1830
    .line 1831
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v2

    .line 1835
    check-cast v2, Ljava/lang/Class;

    .line 1836
    .line 1837
    invoke-static {v2, v7}, LA0/g;->w(Ljava/lang/Class;Ljava/util/List;)Ljava/util/ArrayList;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v2

    .line 1841
    invoke-static {v2, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1842
    .line 1843
    .line 1844
    goto :goto_2b

    .line 1845
    :cond_4b
    new-instance v1, Ljava/util/HashSet;

    .line 1846
    .line 1847
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1848
    .line 1849
    .line 1850
    new-instance v2, Ljava/util/ArrayList;

    .line 1851
    .line 1852
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v0

    .line 1859
    :cond_4c
    :goto_2c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1860
    .line 1861
    .line 1862
    move-result v4

    .line 1863
    if-eqz v4, :cond_4d

    .line 1864
    .line 1865
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v4

    .line 1869
    move-object v5, v4

    .line 1870
    check-cast v5, Ljava/lang/Class;

    .line 1871
    .line 1872
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v5

    .line 1876
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1877
    .line 1878
    .line 1879
    move-result v5

    .line 1880
    if-eqz v5, :cond_4c

    .line 1881
    .line 1882
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1883
    .line 1884
    .line 1885
    goto :goto_2c

    .line 1886
    :cond_4d
    const/16 v4, 0x8

    .line 1887
    .line 1888
    invoke-static {v2, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v0

    .line 1892
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1893
    .line 1894
    .line 1895
    move-result v1

    .line 1896
    if-eqz v1, :cond_4e

    .line 1897
    .line 1898
    new-instance v0, LA0/a;

    .line 1899
    .line 1900
    const/16 v1, 0x9

    .line 1901
    .line 1902
    invoke-direct {v0, v1}, LA0/a;-><init>(I)V

    .line 1903
    .line 1904
    .line 1905
    const/16 v29, 0x0

    .line 1906
    .line 1907
    const/16 v31, 0x1e

    .line 1908
    .line 1909
    const-string v27, ","

    .line 1910
    .line 1911
    const/16 v28, 0x0

    .line 1912
    .line 1913
    move-object/from16 v30, v0

    .line 1914
    .line 1915
    invoke-static/range {v26 .. v31}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v0

    .line 1919
    const-string v1, "conversation dexkit unresolved item empty dataSource="

    .line 1920
    .line 1921
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v0

    .line 1925
    invoke-static {v0}, LA0/g;->q(Ljava/lang/String;)V

    .line 1926
    .line 1927
    .line 1928
    goto/16 :goto_14

    .line 1929
    .line 1930
    :cond_4e
    move-object/from16 v1, v26

    .line 1931
    .line 1932
    new-instance v2, Ljava/util/ArrayList;

    .line 1933
    .line 1934
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1935
    .line 1936
    .line 1937
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v4

    .line 1941
    :goto_2d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1942
    .line 1943
    .line 1944
    move-result v5

    .line 1945
    if-eqz v5, :cond_51

    .line 1946
    .line 1947
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v5

    .line 1951
    check-cast v5, Ljava/lang/Class;

    .line 1952
    .line 1953
    invoke-static {v5}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v8

    .line 1957
    new-instance v10, Ljava/util/ArrayList;

    .line 1958
    .line 1959
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1960
    .line 1961
    .line 1962
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v8

    .line 1966
    :goto_2e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1967
    .line 1968
    .line 1969
    move-result v11

    .line 1970
    if-eqz v11, :cond_4f

    .line 1971
    .line 1972
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v11

    .line 1976
    check-cast v11, Ljava/lang/reflect/Method;

    .line 1977
    .line 1978
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v11

    .line 1982
    invoke-static {v11, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1983
    .line 1984
    .line 1985
    invoke-static {v11}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v11

    .line 1989
    invoke-static {v11, v10}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1990
    .line 1991
    .line 1992
    goto :goto_2e

    .line 1993
    :cond_4f
    invoke-static {v5}, LA0/g;->i(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v5

    .line 1997
    new-instance v8, Ljava/util/ArrayList;

    .line 1998
    .line 1999
    invoke-static {v5}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2000
    .line 2001
    .line 2002
    move-result v11

    .line 2003
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v5

    .line 2010
    :goto_2f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2011
    .line 2012
    .line 2013
    move-result v11

    .line 2014
    if-eqz v11, :cond_50

    .line 2015
    .line 2016
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v11

    .line 2020
    check-cast v11, Ljava/lang/reflect/Field;

    .line 2021
    .line 2022
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v11

    .line 2026
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2027
    .line 2028
    .line 2029
    goto :goto_2f

    .line 2030
    :cond_50
    invoke-static {v10, v8}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 2031
    .line 2032
    .line 2033
    move-result-object v5

    .line 2034
    invoke-static {v5, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 2035
    .line 2036
    .line 2037
    goto :goto_2d

    .line 2038
    :cond_51
    new-instance v4, Ljava/util/ArrayList;

    .line 2039
    .line 2040
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2041
    .line 2042
    .line 2043
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v2

    .line 2047
    :cond_52
    :goto_30
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2048
    .line 2049
    .line 2050
    move-result v5

    .line 2051
    if-eqz v5, :cond_54

    .line 2052
    .line 2053
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v5

    .line 2057
    move-object v8, v5

    .line 2058
    check-cast v8, Ljava/lang/Class;

    .line 2059
    .line 2060
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v10

    .line 2064
    invoke-static {v10}, LA0/g;->D(Ljava/lang/String;)Z

    .line 2065
    .line 2066
    .line 2067
    move-result v10

    .line 2068
    if-eqz v10, :cond_52

    .line 2069
    .line 2070
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v10

    .line 2074
    const/4 v11, 0x0

    .line 2075
    invoke-static {v10, v3, v11}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 2076
    .line 2077
    .line 2078
    move-result v10

    .line 2079
    if-nez v10, :cond_53

    .line 2080
    .line 2081
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v10

    .line 2085
    const-string v11, ".n"

    .line 2086
    .line 2087
    invoke-virtual {v10, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 2088
    .line 2089
    .line 2090
    move-result v10

    .line 2091
    if-nez v10, :cond_53

    .line 2092
    .line 2093
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v8

    .line 2097
    const-string v10, "$a"

    .line 2098
    .line 2099
    invoke-virtual {v8, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 2100
    .line 2101
    .line 2102
    move-result v8

    .line 2103
    if-eqz v8, :cond_52

    .line 2104
    .line 2105
    :cond_53
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2106
    .line 2107
    .line 2108
    goto :goto_30

    .line 2109
    :cond_54
    new-instance v2, Ljava/util/HashSet;

    .line 2110
    .line 2111
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 2112
    .line 2113
    .line 2114
    new-instance v3, Ljava/util/ArrayList;

    .line 2115
    .line 2116
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2117
    .line 2118
    .line 2119
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v4

    .line 2123
    :cond_55
    :goto_31
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2124
    .line 2125
    .line 2126
    move-result v5

    .line 2127
    if-eqz v5, :cond_56

    .line 2128
    .line 2129
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v5

    .line 2133
    move-object v8, v5

    .line 2134
    check-cast v8, Ljava/lang/Class;

    .line 2135
    .line 2136
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v8

    .line 2140
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2141
    .line 2142
    .line 2143
    move-result v8

    .line 2144
    if-eqz v8, :cond_55

    .line 2145
    .line 2146
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2147
    .line 2148
    .line 2149
    goto :goto_31

    .line 2150
    :cond_56
    const/16 v5, 0x8

    .line 2151
    .line 2152
    invoke-static {v3, v5}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2153
    .line 2154
    .line 2155
    move-result-object v2

    .line 2156
    new-instance v3, Ljava/util/ArrayList;

    .line 2157
    .line 2158
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2159
    .line 2160
    .line 2161
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2162
    .line 2163
    .line 2164
    move-result-object v4

    .line 2165
    :goto_32
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2166
    .line 2167
    .line 2168
    move-result v5

    .line 2169
    if-eqz v5, :cond_59

    .line 2170
    .line 2171
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2172
    .line 2173
    .line 2174
    move-result-object v5

    .line 2175
    check-cast v5, Ljava/lang/Class;

    .line 2176
    .line 2177
    invoke-static {v5}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v8

    .line 2181
    new-instance v10, Ljava/util/ArrayList;

    .line 2182
    .line 2183
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 2184
    .line 2185
    .line 2186
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v8

    .line 2190
    :goto_33
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2191
    .line 2192
    .line 2193
    move-result v11

    .line 2194
    if-eqz v11, :cond_57

    .line 2195
    .line 2196
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v11

    .line 2200
    check-cast v11, Ljava/lang/reflect/Method;

    .line 2201
    .line 2202
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v11

    .line 2206
    invoke-static {v11, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2207
    .line 2208
    .line 2209
    invoke-static {v11}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v11

    .line 2213
    invoke-static {v11, v10}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 2214
    .line 2215
    .line 2216
    goto :goto_33

    .line 2217
    :cond_57
    invoke-static {v5}, LA0/g;->i(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v5

    .line 2221
    new-instance v8, Ljava/util/ArrayList;

    .line 2222
    .line 2223
    invoke-static {v5}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2224
    .line 2225
    .line 2226
    move-result v11

    .line 2227
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 2228
    .line 2229
    .line 2230
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v5

    .line 2234
    :goto_34
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2235
    .line 2236
    .line 2237
    move-result v11

    .line 2238
    if-eqz v11, :cond_58

    .line 2239
    .line 2240
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2241
    .line 2242
    .line 2243
    move-result-object v11

    .line 2244
    check-cast v11, Ljava/lang/reflect/Field;

    .line 2245
    .line 2246
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2247
    .line 2248
    .line 2249
    move-result-object v11

    .line 2250
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2251
    .line 2252
    .line 2253
    goto :goto_34

    .line 2254
    :cond_58
    invoke-static {v10, v8}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v5

    .line 2258
    invoke-static {v5, v3}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 2259
    .line 2260
    .line 2261
    goto :goto_32

    .line 2262
    :cond_59
    new-instance v4, Ljava/util/ArrayList;

    .line 2263
    .line 2264
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2265
    .line 2266
    .line 2267
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v3

    .line 2271
    :cond_5a
    :goto_35
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2272
    .line 2273
    .line 2274
    move-result v5

    .line 2275
    if-eqz v5, :cond_5f

    .line 2276
    .line 2277
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2278
    .line 2279
    .line 2280
    move-result-object v5

    .line 2281
    move-object v8, v5

    .line 2282
    check-cast v8, Ljava/lang/Class;

    .line 2283
    .line 2284
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v10

    .line 2288
    invoke-static {v10}, LA0/g;->D(Ljava/lang/String;)Z

    .line 2289
    .line 2290
    .line 2291
    move-result v10

    .line 2292
    if-eqz v10, :cond_5a

    .line 2293
    .line 2294
    new-instance v10, Ljava/util/ArrayList;

    .line 2295
    .line 2296
    invoke-static {v7}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2297
    .line 2298
    .line 2299
    move-result v11

    .line 2300
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 2301
    .line 2302
    .line 2303
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2304
    .line 2305
    .line 2306
    move-result-object v11

    .line 2307
    :goto_36
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 2308
    .line 2309
    .line 2310
    move-result v13

    .line 2311
    if-eqz v13, :cond_5b

    .line 2312
    .line 2313
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2314
    .line 2315
    .line 2316
    move-result-object v13

    .line 2317
    check-cast v13, Ljava/lang/Class;

    .line 2318
    .line 2319
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2320
    .line 2321
    .line 2322
    move-result-object v13

    .line 2323
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2324
    .line 2325
    .line 2326
    goto :goto_36

    .line 2327
    :cond_5b
    invoke-static {v10}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2328
    .line 2329
    .line 2330
    move-result-object v10

    .line 2331
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v11

    .line 2335
    invoke-interface {v10, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2336
    .line 2337
    .line 2338
    move-result v10

    .line 2339
    if-nez v10, :cond_5a

    .line 2340
    .line 2341
    new-instance v10, Ljava/util/ArrayList;

    .line 2342
    .line 2343
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2344
    .line 2345
    .line 2346
    move-result v11

    .line 2347
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 2348
    .line 2349
    .line 2350
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v11

    .line 2354
    :goto_37
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 2355
    .line 2356
    .line 2357
    move-result v13

    .line 2358
    if-eqz v13, :cond_5c

    .line 2359
    .line 2360
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2361
    .line 2362
    .line 2363
    move-result-object v13

    .line 2364
    check-cast v13, Ljava/lang/Class;

    .line 2365
    .line 2366
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2367
    .line 2368
    .line 2369
    move-result-object v13

    .line 2370
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2371
    .line 2372
    .line 2373
    goto :goto_37

    .line 2374
    :cond_5c
    invoke-static {v10}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v10

    .line 2378
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v11

    .line 2382
    invoke-interface {v10, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2383
    .line 2384
    .line 2385
    move-result v10

    .line 2386
    if-nez v10, :cond_5a

    .line 2387
    .line 2388
    invoke-static {v8}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2389
    .line 2390
    .line 2391
    move-result-object v8

    .line 2392
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2393
    .line 2394
    .line 2395
    move-result v10

    .line 2396
    if-eqz v10, :cond_5d

    .line 2397
    .line 2398
    goto :goto_35

    .line 2399
    :cond_5d
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2400
    .line 2401
    .line 2402
    move-result-object v8

    .line 2403
    :cond_5e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2404
    .line 2405
    .line 2406
    move-result v10

    .line 2407
    if-eqz v10, :cond_5a

    .line 2408
    .line 2409
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v10

    .line 2413
    check-cast v10, Ljava/lang/reflect/Method;

    .line 2414
    .line 2415
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2416
    .line 2417
    .line 2418
    move-result-object v10

    .line 2419
    invoke-static {v10, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2420
    .line 2421
    .line 2422
    move-result v10

    .line 2423
    if-eqz v10, :cond_5e

    .line 2424
    .line 2425
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2426
    .line 2427
    .line 2428
    goto/16 :goto_35

    .line 2429
    .line 2430
    :cond_5f
    new-instance v3, Ljava/util/HashSet;

    .line 2431
    .line 2432
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 2433
    .line 2434
    .line 2435
    new-instance v5, Ljava/util/ArrayList;

    .line 2436
    .line 2437
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2438
    .line 2439
    .line 2440
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v4

    .line 2444
    :cond_60
    :goto_38
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2445
    .line 2446
    .line 2447
    move-result v8

    .line 2448
    if-eqz v8, :cond_61

    .line 2449
    .line 2450
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2451
    .line 2452
    .line 2453
    move-result-object v8

    .line 2454
    move-object v10, v8

    .line 2455
    check-cast v10, Ljava/lang/Class;

    .line 2456
    .line 2457
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2458
    .line 2459
    .line 2460
    move-result-object v10

    .line 2461
    invoke-virtual {v3, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2462
    .line 2463
    .line 2464
    move-result v10

    .line 2465
    if-eqz v10, :cond_60

    .line 2466
    .line 2467
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2468
    .line 2469
    .line 2470
    goto :goto_38

    .line 2471
    :cond_61
    const/16 v8, 0x8

    .line 2472
    .line 2473
    invoke-static {v5, v8}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v3

    .line 2477
    new-instance v4, Ljava/util/ArrayList;

    .line 2478
    .line 2479
    invoke-static {v1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2480
    .line 2481
    .line 2482
    move-result v5

    .line 2483
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2484
    .line 2485
    .line 2486
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2487
    .line 2488
    .line 2489
    move-result-object v5

    .line 2490
    :goto_39
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2491
    .line 2492
    .line 2493
    move-result v8

    .line 2494
    if-eqz v8, :cond_62

    .line 2495
    .line 2496
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2497
    .line 2498
    .line 2499
    move-result-object v8

    .line 2500
    check-cast v8, Ljava/lang/Class;

    .line 2501
    .line 2502
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2503
    .line 2504
    .line 2505
    move-result-object v8

    .line 2506
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2507
    .line 2508
    .line 2509
    goto :goto_39

    .line 2510
    :cond_62
    new-instance v5, Ljava/util/ArrayList;

    .line 2511
    .line 2512
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2513
    .line 2514
    .line 2515
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2516
    .line 2517
    .line 2518
    move-result-object v8

    .line 2519
    :goto_3a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2520
    .line 2521
    .line 2522
    move-result v10

    .line 2523
    if-eqz v10, :cond_63

    .line 2524
    .line 2525
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v10

    .line 2529
    check-cast v10, Ljava/lang/Class;

    .line 2530
    .line 2531
    invoke-static {v10}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2532
    .line 2533
    .line 2534
    move-result-object v10

    .line 2535
    invoke-static {v10, v5}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 2536
    .line 2537
    .line 2538
    goto :goto_3a

    .line 2539
    :cond_63
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2540
    .line 2541
    .line 2542
    move-result-object v5

    .line 2543
    :cond_64
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2544
    .line 2545
    .line 2546
    move-result v8

    .line 2547
    if-eqz v8, :cond_65

    .line 2548
    .line 2549
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2550
    .line 2551
    .line 2552
    move-result-object v8

    .line 2553
    move-object v10, v8

    .line 2554
    check-cast v10, Ljava/lang/reflect/Method;

    .line 2555
    .line 2556
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2557
    .line 2558
    .line 2559
    move-result-object v11

    .line 2560
    invoke-static {v11, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2561
    .line 2562
    .line 2563
    array-length v11, v11

    .line 2564
    if-nez v11, :cond_64

    .line 2565
    .line 2566
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2567
    .line 2568
    .line 2569
    move-result-object v10

    .line 2570
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v10

    .line 2574
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2575
    .line 2576
    .line 2577
    move-result v10

    .line 2578
    if-eqz v10, :cond_64

    .line 2579
    .line 2580
    goto :goto_3b

    .line 2581
    :cond_65
    const/4 v8, 0x0

    .line 2582
    :goto_3b
    check-cast v8, Ljava/lang/reflect/Method;

    .line 2583
    .line 2584
    if-eqz v8, :cond_66

    .line 2585
    .line 2586
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2587
    .line 2588
    .line 2589
    move-result-object v4

    .line 2590
    move-object/from16 v33, v4

    .line 2591
    .line 2592
    goto :goto_3c

    .line 2593
    :cond_66
    const/16 v33, 0x0

    .line 2594
    .line 2595
    :goto_3c
    if-nez v33, :cond_67

    .line 2596
    .line 2597
    new-instance v0, LA0/a;

    .line 2598
    .line 2599
    const/16 v2, 0xa

    .line 2600
    .line 2601
    invoke-direct {v0, v2}, LA0/a;-><init>(I)V

    .line 2602
    .line 2603
    .line 2604
    const/16 v28, 0x0

    .line 2605
    .line 2606
    const/16 v30, 0x1e

    .line 2607
    .line 2608
    const-string v26, ","

    .line 2609
    .line 2610
    const/16 v27, 0x0

    .line 2611
    .line 2612
    move-object/from16 v29, v0

    .line 2613
    .line 2614
    invoke-static/range {v25 .. v30}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 2615
    .line 2616
    .line 2617
    move-result-object v0

    .line 2618
    new-instance v2, LA0/a;

    .line 2619
    .line 2620
    const/16 v3, 0xb

    .line 2621
    .line 2622
    invoke-direct {v2, v3}, LA0/a;-><init>(I)V

    .line 2623
    .line 2624
    .line 2625
    const/16 v29, 0x0

    .line 2626
    .line 2627
    const/16 v31, 0x1e

    .line 2628
    .line 2629
    const-string v27, ","

    .line 2630
    .line 2631
    const/16 v28, 0x0

    .line 2632
    .line 2633
    move-object/from16 v26, v1

    .line 2634
    .line 2635
    move-object/from16 v30, v2

    .line 2636
    .line 2637
    invoke-static/range {v26 .. v31}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 2638
    .line 2639
    .line 2640
    move-result-object v1

    .line 2641
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2642
    .line 2643
    const-string v3, "conversation dexkit unresolved dataSource getter empty adapter="

    .line 2644
    .line 2645
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2646
    .line 2647
    .line 2648
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2649
    .line 2650
    .line 2651
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2652
    .line 2653
    .line 2654
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2655
    .line 2656
    .line 2657
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2658
    .line 2659
    .line 2660
    move-result-object v0

    .line 2661
    invoke-static {v0}, LA0/g;->q(Ljava/lang/String;)V

    .line 2662
    .line 2663
    .line 2664
    goto/16 :goto_14

    .line 2665
    .line 2666
    :cond_67
    move-object/from16 v26, v1

    .line 2667
    .line 2668
    new-instance v1, Ljava/util/ArrayList;

    .line 2669
    .line 2670
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2671
    .line 2672
    .line 2673
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v4

    .line 2677
    :goto_3d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2678
    .line 2679
    .line 2680
    move-result v5

    .line 2681
    if-eqz v5, :cond_68

    .line 2682
    .line 2683
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2684
    .line 2685
    .line 2686
    move-result-object v5

    .line 2687
    check-cast v5, Ljava/lang/Class;

    .line 2688
    .line 2689
    invoke-static {v5}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2690
    .line 2691
    .line 2692
    move-result-object v5

    .line 2693
    invoke-static {v5, v1}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 2694
    .line 2695
    .line 2696
    goto :goto_3d

    .line 2697
    :cond_68
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2698
    .line 2699
    .line 2700
    move-result-object v1

    .line 2701
    :goto_3e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2702
    .line 2703
    .line 2704
    move-result v4

    .line 2705
    if-eqz v4, :cond_6b

    .line 2706
    .line 2707
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2708
    .line 2709
    .line 2710
    move-result-object v4

    .line 2711
    move-object v5, v4

    .line 2712
    check-cast v5, Ljava/lang/reflect/Method;

    .line 2713
    .line 2714
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2715
    .line 2716
    .line 2717
    move-result-object v8

    .line 2718
    invoke-static {v8, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2719
    .line 2720
    .line 2721
    array-length v8, v8

    .line 2722
    if-nez v8, :cond_69

    .line 2723
    .line 2724
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2725
    .line 2726
    .line 2727
    move-result-object v5

    .line 2728
    move-object/from16 v8, v24

    .line 2729
    .line 2730
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2731
    .line 2732
    .line 2733
    move-result v5

    .line 2734
    if-eqz v5, :cond_6a

    .line 2735
    .line 2736
    goto :goto_3f

    .line 2737
    :cond_69
    move-object/from16 v8, v24

    .line 2738
    .line 2739
    :cond_6a
    move-object/from16 v24, v8

    .line 2740
    .line 2741
    goto :goto_3e

    .line 2742
    :cond_6b
    move-object/from16 v8, v24

    .line 2743
    .line 2744
    const/4 v4, 0x0

    .line 2745
    :goto_3f
    check-cast v4, Ljava/lang/reflect/Method;

    .line 2746
    .line 2747
    if-eqz v4, :cond_6c

    .line 2748
    .line 2749
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2750
    .line 2751
    .line 2752
    move-result-object v1

    .line 2753
    if-eqz v1, :cond_6c

    .line 2754
    .line 2755
    goto :goto_42

    .line 2756
    :cond_6c
    new-instance v1, Ljava/util/ArrayList;

    .line 2757
    .line 2758
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2759
    .line 2760
    .line 2761
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2762
    .line 2763
    .line 2764
    move-result-object v4

    .line 2765
    :goto_40
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2766
    .line 2767
    .line 2768
    move-result v5

    .line 2769
    if-eqz v5, :cond_6d

    .line 2770
    .line 2771
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2772
    .line 2773
    .line 2774
    move-result-object v5

    .line 2775
    check-cast v5, Ljava/lang/Class;

    .line 2776
    .line 2777
    invoke-static {v5}, LA0/g;->i(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v5

    .line 2781
    invoke-static {v5, v1}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 2782
    .line 2783
    .line 2784
    goto :goto_40

    .line 2785
    :cond_6d
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2786
    .line 2787
    .line 2788
    move-result-object v1

    .line 2789
    :cond_6e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2790
    .line 2791
    .line 2792
    move-result v4

    .line 2793
    if-eqz v4, :cond_6f

    .line 2794
    .line 2795
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2796
    .line 2797
    .line 2798
    move-result-object v4

    .line 2799
    move-object v5, v4

    .line 2800
    check-cast v5, Ljava/lang/reflect/Field;

    .line 2801
    .line 2802
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2803
    .line 2804
    .line 2805
    move-result-object v5

    .line 2806
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2807
    .line 2808
    .line 2809
    move-result v5

    .line 2810
    if-eqz v5, :cond_6e

    .line 2811
    .line 2812
    goto :goto_41

    .line 2813
    :cond_6f
    const/4 v4, 0x0

    .line 2814
    :goto_41
    check-cast v4, Ljava/lang/reflect/Field;

    .line 2815
    .line 2816
    if-eqz v4, :cond_70

    .line 2817
    .line 2818
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 2819
    .line 2820
    .line 2821
    move-result-object v1

    .line 2822
    goto :goto_42

    .line 2823
    :cond_70
    const/4 v1, 0x0

    .line 2824
    :goto_42
    if-nez v1, :cond_71

    .line 2825
    .line 2826
    const-string v1, ""

    .line 2827
    .line 2828
    :cond_71
    move-object/from16 v34, v1

    .line 2829
    .line 2830
    invoke-static/range {v34 .. v34}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 2831
    .line 2832
    .line 2833
    move-result v1

    .line 2834
    if-eqz v1, :cond_72

    .line 2835
    .line 2836
    new-instance v1, LA0/a;

    .line 2837
    .line 2838
    const/16 v4, 0xc

    .line 2839
    .line 2840
    invoke-direct {v1, v4}, LA0/a;-><init>(I)V

    .line 2841
    .line 2842
    .line 2843
    const/16 v29, 0x0

    .line 2844
    .line 2845
    const/16 v31, 0x1e

    .line 2846
    .line 2847
    const-string v27, ","

    .line 2848
    .line 2849
    const/16 v28, 0x0

    .line 2850
    .line 2851
    move-object/from16 v30, v1

    .line 2852
    .line 2853
    invoke-static/range {v26 .. v31}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 2854
    .line 2855
    .line 2856
    move-result-object v1

    .line 2857
    const-string v4, "conversation dexkit list getter empty dataSource="

    .line 2858
    .line 2859
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2860
    .line 2861
    .line 2862
    move-result-object v1

    .line 2863
    invoke-static {v1}, LA0/g;->q(Ljava/lang/String;)V

    .line 2864
    .line 2865
    .line 2866
    :cond_72
    new-instance v1, Ljava/util/ArrayList;

    .line 2867
    .line 2868
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2869
    .line 2870
    .line 2871
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2872
    .line 2873
    .line 2874
    move-result-object v4

    .line 2875
    :goto_43
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2876
    .line 2877
    .line 2878
    move-result v5

    .line 2879
    if-eqz v5, :cond_73

    .line 2880
    .line 2881
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2882
    .line 2883
    .line 2884
    move-result-object v5

    .line 2885
    check-cast v5, Ljava/lang/Class;

    .line 2886
    .line 2887
    invoke-static {v5}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v5

    .line 2891
    invoke-static {v5, v1}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 2892
    .line 2893
    .line 2894
    goto :goto_43

    .line 2895
    :cond_73
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2896
    .line 2897
    .line 2898
    move-result-object v4

    .line 2899
    :goto_44
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2900
    .line 2901
    .line 2902
    move-result v5

    .line 2903
    if-eqz v5, :cond_78

    .line 2904
    .line 2905
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2906
    .line 2907
    .line 2908
    move-result-object v5

    .line 2909
    move-object v8, v5

    .line 2910
    check-cast v8, Ljava/lang/reflect/Method;

    .line 2911
    .line 2912
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2913
    .line 2914
    .line 2915
    move-result-object v10

    .line 2916
    invoke-static {v10, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2917
    .line 2918
    .line 2919
    move-result v10

    .line 2920
    if-eqz v10, :cond_76

    .line 2921
    .line 2922
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2923
    .line 2924
    .line 2925
    move-result-object v10

    .line 2926
    array-length v10, v10

    .line 2927
    const/4 v15, 0x2

    .line 2928
    if-ne v10, v15, :cond_75

    .line 2929
    .line 2930
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2931
    .line 2932
    .line 2933
    move-result-object v10

    .line 2934
    const/16 v18, 0x0

    .line 2935
    .line 2936
    aget-object v10, v10, v18

    .line 2937
    .line 2938
    invoke-static {v10, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2939
    .line 2940
    .line 2941
    move-result v10

    .line 2942
    if-eqz v10, :cond_74

    .line 2943
    .line 2944
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2945
    .line 2946
    .line 2947
    move-result-object v8

    .line 2948
    const/16 v17, 0x1

    .line 2949
    .line 2950
    aget-object v8, v8, v17

    .line 2951
    .line 2952
    move-object/from16 v10, v21

    .line 2953
    .line 2954
    invoke-static {v8, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2955
    .line 2956
    .line 2957
    move-result v8

    .line 2958
    if-eqz v8, :cond_77

    .line 2959
    .line 2960
    goto :goto_47

    .line 2961
    :cond_74
    move-object/from16 v10, v21

    .line 2962
    .line 2963
    goto :goto_46

    .line 2964
    :cond_75
    move-object/from16 v10, v21

    .line 2965
    .line 2966
    :goto_45
    const/16 v18, 0x0

    .line 2967
    .line 2968
    goto :goto_46

    .line 2969
    :cond_76
    move-object/from16 v10, v21

    .line 2970
    .line 2971
    const/4 v15, 0x2

    .line 2972
    goto :goto_45

    .line 2973
    :cond_77
    :goto_46
    move-object/from16 v21, v10

    .line 2974
    .line 2975
    goto :goto_44

    .line 2976
    :cond_78
    const/16 v18, 0x0

    .line 2977
    .line 2978
    const/4 v5, 0x0

    .line 2979
    :goto_47
    check-cast v5, Ljava/lang/reflect/Method;

    .line 2980
    .line 2981
    if-eqz v5, :cond_79

    .line 2982
    .line 2983
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2984
    .line 2985
    .line 2986
    move-result-object v4

    .line 2987
    if-eqz v4, :cond_79

    .line 2988
    .line 2989
    move-object v13, v4

    .line 2990
    const/4 v11, 0x1

    .line 2991
    goto :goto_49

    .line 2992
    :cond_79
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2993
    .line 2994
    .line 2995
    move-result-object v1

    .line 2996
    :cond_7a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2997
    .line 2998
    .line 2999
    move-result v4

    .line 3000
    if-eqz v4, :cond_7b

    .line 3001
    .line 3002
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3003
    .line 3004
    .line 3005
    move-result-object v4

    .line 3006
    move-object v5, v4

    .line 3007
    check-cast v5, Ljava/lang/reflect/Method;

    .line 3008
    .line 3009
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 3010
    .line 3011
    .line 3012
    move-result-object v8

    .line 3013
    array-length v8, v8

    .line 3014
    const/4 v11, 0x1

    .line 3015
    if-gt v8, v11, :cond_7a

    .line 3016
    .line 3017
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 3018
    .line 3019
    .line 3020
    move-result-object v5

    .line 3021
    invoke-static {v5, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3022
    .line 3023
    .line 3024
    move-result v5

    .line 3025
    if-eqz v5, :cond_7a

    .line 3026
    .line 3027
    goto :goto_48

    .line 3028
    :cond_7b
    const/4 v11, 0x1

    .line 3029
    const/4 v4, 0x0

    .line 3030
    :goto_48
    check-cast v4, Ljava/lang/reflect/Method;

    .line 3031
    .line 3032
    if-eqz v4, :cond_7c

    .line 3033
    .line 3034
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 3035
    .line 3036
    .line 3037
    move-result-object v13

    .line 3038
    goto :goto_49

    .line 3039
    :cond_7c
    const/4 v13, 0x0

    .line 3040
    :goto_49
    if-nez v13, :cond_7d

    .line 3041
    .line 3042
    const-string v13, "k"

    .line 3043
    .line 3044
    :cond_7d
    move-object/from16 v35, v13

    .line 3045
    .line 3046
    new-instance v1, Ljava/util/ArrayList;

    .line 3047
    .line 3048
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3049
    .line 3050
    .line 3051
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3052
    .line 3053
    .line 3054
    move-result-object v4

    .line 3055
    :goto_4a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 3056
    .line 3057
    .line 3058
    move-result v5

    .line 3059
    if-eqz v5, :cond_7e

    .line 3060
    .line 3061
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3062
    .line 3063
    .line 3064
    move-result-object v5

    .line 3065
    check-cast v5, Ljava/lang/Class;

    .line 3066
    .line 3067
    invoke-static {v5}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 3068
    .line 3069
    .line 3070
    move-result-object v5

    .line 3071
    invoke-static {v5, v1}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 3072
    .line 3073
    .line 3074
    goto :goto_4a

    .line 3075
    :cond_7e
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3076
    .line 3077
    .line 3078
    move-result-object v1

    .line 3079
    :cond_7f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 3080
    .line 3081
    .line 3082
    move-result v4

    .line 3083
    const/4 v5, 0x0

    .line 3084
    if-eqz v4, :cond_80

    .line 3085
    .line 3086
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3087
    .line 3088
    .line 3089
    move-result-object v4

    .line 3090
    move-object v8, v4

    .line 3091
    check-cast v8, Ljava/lang/reflect/Method;

    .line 3092
    .line 3093
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 3094
    .line 3095
    .line 3096
    move-result-object v9

    .line 3097
    array-length v9, v9

    .line 3098
    const/4 v10, 0x1

    .line 3099
    if-ne v9, v10, :cond_7f

    .line 3100
    .line 3101
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 3102
    .line 3103
    .line 3104
    move-result-object v8

    .line 3105
    const/4 v9, 0x0

    .line 3106
    aget-object v8, v8, v9

    .line 3107
    .line 3108
    const-class v9, Ljava/util/List;

    .line 3109
    .line 3110
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 3111
    .line 3112
    .line 3113
    move-result v8

    .line 3114
    if-eqz v8, :cond_7f

    .line 3115
    .line 3116
    goto :goto_4b

    .line 3117
    :cond_80
    move-object v4, v5

    .line 3118
    :goto_4b
    check-cast v4, Ljava/lang/reflect/Method;

    .line 3119
    .line 3120
    if-eqz v4, :cond_81

    .line 3121
    .line 3122
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 3123
    .line 3124
    .line 3125
    move-result-object v5

    .line 3126
    :cond_81
    if-nez v5, :cond_82

    .line 3127
    .line 3128
    const-string v5, "a"

    .line 3129
    .line 3130
    :cond_82
    move-object/from16 v36, v5

    .line 3131
    .line 3132
    new-instance v12, Ljava/util/ArrayList;

    .line 3133
    .line 3134
    invoke-static/range {v25 .. v25}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 3135
    .line 3136
    .line 3137
    move-result v1

    .line 3138
    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3139
    .line 3140
    .line 3141
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3142
    .line 3143
    .line 3144
    move-result-object v1

    .line 3145
    :goto_4c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 3146
    .line 3147
    .line 3148
    move-result v4

    .line 3149
    if-eqz v4, :cond_83

    .line 3150
    .line 3151
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3152
    .line 3153
    .line 3154
    move-result-object v4

    .line 3155
    check-cast v4, Ljava/lang/Class;

    .line 3156
    .line 3157
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 3158
    .line 3159
    .line 3160
    move-result-object v4

    .line 3161
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3162
    .line 3163
    .line 3164
    goto :goto_4c

    .line 3165
    :cond_83
    new-instance v1, Ljava/util/ArrayList;

    .line 3166
    .line 3167
    invoke-static/range {v26 .. v26}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 3168
    .line 3169
    .line 3170
    move-result v4

    .line 3171
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 3172
    .line 3173
    .line 3174
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3175
    .line 3176
    .line 3177
    move-result-object v4

    .line 3178
    :goto_4d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 3179
    .line 3180
    .line 3181
    move-result v5

    .line 3182
    if-eqz v5, :cond_84

    .line 3183
    .line 3184
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3185
    .line 3186
    .line 3187
    move-result-object v5

    .line 3188
    check-cast v5, Ljava/lang/Class;

    .line 3189
    .line 3190
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 3191
    .line 3192
    .line 3193
    move-result-object v5

    .line 3194
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3195
    .line 3196
    .line 3197
    goto :goto_4d

    .line 3198
    :cond_84
    new-instance v4, Ljava/util/ArrayList;

    .line 3199
    .line 3200
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 3201
    .line 3202
    .line 3203
    move-result v5

    .line 3204
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 3205
    .line 3206
    .line 3207
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3208
    .line 3209
    .line 3210
    move-result-object v0

    .line 3211
    :goto_4e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3212
    .line 3213
    .line 3214
    move-result v5

    .line 3215
    if-eqz v5, :cond_85

    .line 3216
    .line 3217
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3218
    .line 3219
    .line 3220
    move-result-object v5

    .line 3221
    check-cast v5, Ljava/lang/Class;

    .line 3222
    .line 3223
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 3224
    .line 3225
    .line 3226
    move-result-object v5

    .line 3227
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3228
    .line 3229
    .line 3230
    goto :goto_4e

    .line 3231
    :cond_85
    new-instance v0, Ljava/util/ArrayList;

    .line 3232
    .line 3233
    invoke-static {v2}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 3234
    .line 3235
    .line 3236
    move-result v5

    .line 3237
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 3238
    .line 3239
    .line 3240
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3241
    .line 3242
    .line 3243
    move-result-object v2

    .line 3244
    :goto_4f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 3245
    .line 3246
    .line 3247
    move-result v5

    .line 3248
    if-eqz v5, :cond_86

    .line 3249
    .line 3250
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3251
    .line 3252
    .line 3253
    move-result-object v5

    .line 3254
    check-cast v5, Ljava/lang/Class;

    .line 3255
    .line 3256
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 3257
    .line 3258
    .line 3259
    move-result-object v5

    .line 3260
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3261
    .line 3262
    .line 3263
    goto :goto_4f

    .line 3264
    :cond_86
    new-instance v2, Ljava/util/ArrayList;

    .line 3265
    .line 3266
    invoke-static {v7}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 3267
    .line 3268
    .line 3269
    move-result v5

    .line 3270
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 3271
    .line 3272
    .line 3273
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3274
    .line 3275
    .line 3276
    move-result-object v5

    .line 3277
    :goto_50
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 3278
    .line 3279
    .line 3280
    move-result v7

    .line 3281
    if-eqz v7, :cond_87

    .line 3282
    .line 3283
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3284
    .line 3285
    .line 3286
    move-result-object v7

    .line 3287
    check-cast v7, Ljava/lang/Class;

    .line 3288
    .line 3289
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 3290
    .line 3291
    .line 3292
    move-result-object v7

    .line 3293
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3294
    .line 3295
    .line 3296
    goto :goto_50

    .line 3297
    :cond_87
    new-instance v5, Ljava/util/ArrayList;

    .line 3298
    .line 3299
    invoke-static {v3}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 3300
    .line 3301
    .line 3302
    move-result v7

    .line 3303
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 3304
    .line 3305
    .line 3306
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3307
    .line 3308
    .line 3309
    move-result-object v3

    .line 3310
    :goto_51
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 3311
    .line 3312
    .line 3313
    move-result v7

    .line 3314
    if-eqz v7, :cond_88

    .line 3315
    .line 3316
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3317
    .line 3318
    .line 3319
    move-result-object v7

    .line 3320
    check-cast v7, Ljava/lang/Class;

    .line 3321
    .line 3322
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 3323
    .line 3324
    .line 3325
    move-result-object v7

    .line 3326
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3327
    .line 3328
    .line 3329
    goto :goto_51

    .line 3330
    :cond_88
    new-instance v26, LA0/j;

    .line 3331
    .line 3332
    move-object/from16 v30, v0

    .line 3333
    .line 3334
    move-object/from16 v28, v1

    .line 3335
    .line 3336
    move-object/from16 v31, v2

    .line 3337
    .line 3338
    move-object/from16 v29, v4

    .line 3339
    .line 3340
    move-object/from16 v32, v5

    .line 3341
    .line 3342
    move-object/from16 v27, v12

    .line 3343
    .line 3344
    invoke-direct/range {v26 .. v36}, LA0/j;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3345
    .line 3346
    .line 3347
    move-object/from16 v19, v28

    .line 3348
    .line 3349
    move-object/from16 v4, v33

    .line 3350
    .line 3351
    move-object/from16 v1, v34

    .line 3352
    .line 3353
    const/4 v15, 0x0

    .line 3354
    const/16 v17, 0x3e

    .line 3355
    .line 3356
    const-string v13, ","

    .line 3357
    .line 3358
    const/4 v14, 0x0

    .line 3359
    const/16 v16, 0x0

    .line 3360
    .line 3361
    move-object/from16 v12, v27

    .line 3362
    .line 3363
    invoke-static/range {v12 .. v17}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 3364
    .line 3365
    .line 3366
    move-result-object v0

    .line 3367
    const/16 v22, 0x0

    .line 3368
    .line 3369
    const/16 v24, 0x3e

    .line 3370
    .line 3371
    const-string v20, ","

    .line 3372
    .line 3373
    const/16 v21, 0x0

    .line 3374
    .line 3375
    const/16 v23, 0x0

    .line 3376
    .line 3377
    invoke-static/range {v19 .. v24}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 3378
    .line 3379
    .line 3380
    move-result-object v2

    .line 3381
    const/16 v22, 0x0

    .line 3382
    .line 3383
    const/16 v24, 0x3e

    .line 3384
    .line 3385
    const-string v20, ","

    .line 3386
    .line 3387
    const/16 v21, 0x0

    .line 3388
    .line 3389
    const/16 v23, 0x0

    .line 3390
    .line 3391
    move-object/from16 v19, v29

    .line 3392
    .line 3393
    invoke-static/range {v19 .. v24}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 3394
    .line 3395
    .line 3396
    move-result-object v3

    .line 3397
    const/16 v22, 0x0

    .line 3398
    .line 3399
    const/16 v24, 0x3e

    .line 3400
    .line 3401
    const-string v20, ","

    .line 3402
    .line 3403
    const/16 v21, 0x0

    .line 3404
    .line 3405
    const/16 v23, 0x0

    .line 3406
    .line 3407
    move-object/from16 v19, v30

    .line 3408
    .line 3409
    invoke-static/range {v19 .. v24}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 3410
    .line 3411
    .line 3412
    move-result-object v5

    .line 3413
    const/16 v22, 0x0

    .line 3414
    .line 3415
    const/16 v24, 0x3e

    .line 3416
    .line 3417
    const-string v20, ","

    .line 3418
    .line 3419
    const/16 v21, 0x0

    .line 3420
    .line 3421
    const/16 v23, 0x0

    .line 3422
    .line 3423
    move-object/from16 v19, v31

    .line 3424
    .line 3425
    invoke-static/range {v19 .. v24}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 3426
    .line 3427
    .line 3428
    move-result-object v7

    .line 3429
    const/16 v22, 0x0

    .line 3430
    .line 3431
    const/16 v24, 0x3e

    .line 3432
    .line 3433
    const-string v20, ","

    .line 3434
    .line 3435
    const/16 v21, 0x0

    .line 3436
    .line 3437
    const/16 v23, 0x0

    .line 3438
    .line 3439
    move-object/from16 v19, v32

    .line 3440
    .line 3441
    invoke-static/range {v19 .. v24}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 3442
    .line 3443
    .line 3444
    move-result-object v8

    .line 3445
    new-instance v9, Ljava/lang/StringBuilder;

    .line 3446
    .line 3447
    const-string v10, "conversation dexkit resolved adapter="

    .line 3448
    .line 3449
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3450
    .line 3451
    .line 3452
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3453
    .line 3454
    .line 3455
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3456
    .line 3457
    .line 3458
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3459
    .line 3460
    .line 3461
    const-string v0, " item="

    .line 3462
    .line 3463
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3464
    .line 3465
    .line 3466
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3467
    .line 3468
    .line 3469
    const-string v0, " holder="

    .line 3470
    .line 3471
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3472
    .line 3473
    .line 3474
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3475
    .line 3476
    .line 3477
    const-string v0, " storage="

    .line 3478
    .line 3479
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3480
    .line 3481
    .line 3482
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3483
    .line 3484
    .line 3485
    const-string v0, "request="

    .line 3486
    .line 3487
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3488
    .line 3489
    .line 3490
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3491
    .line 3492
    .line 3493
    const-string v0, " getDataSource="

    .line 3494
    .line 3495
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3496
    .line 3497
    .line 3498
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3499
    .line 3500
    .line 3501
    const-string v0, " getList="

    .line 3502
    .line 3503
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3504
    .line 3505
    .line 3506
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3507
    .line 3508
    .line 3509
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3510
    .line 3511
    .line 3512
    move-result-object v0

    .line 3513
    invoke-static {v0}, LA0/g;->q(Ljava/lang/String;)V

    .line 3514
    .line 3515
    .line 3516
    move-object/from16 v13, v26

    .line 3517
    .line 3518
    :goto_52
    if-eqz v13, :cond_89

    .line 3519
    .line 3520
    move v5, v11

    .line 3521
    goto :goto_53

    .line 3522
    :cond_89
    move/from16 v5, v18

    .line 3523
    .line 3524
    :goto_53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3525
    .line 3526
    const-string v1, "conversation dexkit resolve end "

    .line 3527
    .line 3528
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3529
    .line 3530
    .line 3531
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 3532
    .line 3533
    .line 3534
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3535
    .line 3536
    .line 3537
    move-result-object v0

    .line 3538
    invoke-static {v0}, LA0/g;->q(Ljava/lang/String;)V

    .line 3539
    .line 3540
    .line 3541
    return-object v13
.end method

.method private final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    const-string v0, "bridge"

    .line 6
    .line 7
    invoke-static {v1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p0

    .line 11
    .line 12
    iget-object v0, v2, LA0/h;->b:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string v0, "getClassLoader(...)"

    .line 19
    .line 20
    invoke-static {v3, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v4, "MicroMsg.AvatarDrawable"

    .line 29
    .line 30
    const-string v5, "imageView is null"

    .line 31
    .line 32
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v1, v5}, LA0/g;->r(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {v5, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 41
    .line 42
    .line 43
    const-string v5, "MicroMsg.AvatarGetContactServiceHelper"

    .line 44
    .line 45
    const-string v6, "put stack into pool: "

    .line 46
    .line 47
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-static {v1, v5}, LA0/g;->r(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v5, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 56
    .line 57
    .line 58
    filled-new-array {v4}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v1, v4}, LA0/g;->r(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v4, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 67
    .line 68
    .line 69
    new-instance v4, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    const/4 v6, 0x0

    .line 83
    if-eqz v5, :cond_1

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    move-object v7, v5

    .line 90
    check-cast v7, Lb1/j;

    .line 91
    .line 92
    invoke-virtual {v7}, Lb1/j;->c()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    const-string v8, "(Landroid/widget/ImageView;Ljava/lang/String;"

    .line 97
    .line 98
    invoke-static {v7, v6, v8}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_0

    .line 103
    .line 104
    const-string v6, ")V"

    .line 105
    .line 106
    invoke-virtual {v7, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_0

    .line 111
    .line 112
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    new-instance v0, LA0/e;

    .line 117
    .line 118
    const/4 v5, 0x3

    .line 119
    invoke-direct {v0, v5}, LA0/e;-><init>(I)V

    .line 120
    .line 121
    .line 122
    new-instance v5, LA0/f;

    .line 123
    .line 124
    const/4 v7, 0x5

    .line 125
    invoke-direct {v5, v7, v0}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v4, v5}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v4, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_2

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    check-cast v5, Lb1/j;

    .line 156
    .line 157
    new-instance v7, Lz0/j;

    .line 158
    .line 159
    invoke-virtual {v5}, Lb1/j;->b()Lf1/d;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    iget-object v8, v8, Lf1/d;->a:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v5}, Lb1/j;->b()Lf1/d;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    iget-object v9, v9, Lf1/d;->b:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v5}, Lb1/j;->c()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-direct {v7, v8, v9, v5}, Lz0/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_2
    invoke-static {v4}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    const/16 v4, 0x10

    .line 191
    .line 192
    invoke-static {v0, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 197
    .line 198
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView"

    .line 202
    .line 203
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    :cond_3
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_5

    .line 216
    .line 217
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, Ljava/lang/String;

    .line 222
    .line 223
    :try_start_0
    invoke-static {v0, v6, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    goto :goto_3

    .line 228
    :catchall_0
    move-exception v0

    .line 229
    new-instance v9, LE0/d;

    .line 230
    .line 231
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    move-object v0, v9

    .line 235
    :goto_3
    nop

    .line 236
    instance-of v9, v0, LE0/d;

    .line 237
    .line 238
    if-eqz v9, :cond_4

    .line 239
    .line 240
    const/4 v8, 0x0

    .line 241
    goto :goto_4

    .line 242
    :cond_4
    move-object v8, v0

    .line 243
    :goto_4
    check-cast v8, Ljava/lang/Class;

    .line 244
    .line 245
    if-eqz v8, :cond_3

    .line 246
    .line 247
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_5
    const-string v0, "HdHeadImageGallery"

    .line 252
    .line 253
    const-string v7, "HeadImageGallery"

    .line 254
    .line 255
    const-string v9, "GetHdHeadImageGalleryView"

    .line 256
    .line 257
    const-string v10, "HdHeadImage"

    .line 258
    .line 259
    const-string v11, "HeadImage"

    .line 260
    .line 261
    filled-new-array {v9, v0, v7, v10, v11}, [Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    :cond_6
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    const/4 v10, 0x1

    .line 278
    if-eqz v0, :cond_8

    .line 279
    .line 280
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    move-object v11, v0

    .line 285
    check-cast v11, Ljava/lang/String;

    .line 286
    .line 287
    :try_start_1
    new-instance v0, LW0/a;

    .line 288
    .line 289
    const/4 v12, 0x0

    .line 290
    invoke-direct {v0, v12}, LW0/a;-><init>(I)V

    .line 291
    .line 292
    .line 293
    const-string v12, "com.tencent.mm.plugin.setting"

    .line 294
    .line 295
    const-string v13, "com.tencent.mm.ui"

    .line 296
    .line 297
    const-string v14, "com.tencent.mm"

    .line 298
    .line 299
    filled-new-array {v12, v13, v14}, [Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    invoke-virtual {v0, v12}, LW0/a;->Z([Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    new-instance v12, LZ0/a;

    .line 307
    .line 308
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v11, v10, v6}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 312
    .line 313
    .line 314
    iput-object v12, v0, LW0/a;->f:LD/h;

    .line 315
    .line 316
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    if-eqz v10, :cond_7

    .line 329
    .line 330
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v10

    .line 334
    check-cast v10, Lb1/d;

    .line 335
    .line 336
    invoke-virtual {v10, v3}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 341
    .line 342
    .line 343
    goto :goto_6

    .line 344
    :catchall_1
    move-exception v0

    .line 345
    goto :goto_7

    .line 346
    :cond_7
    move-object v10, v5

    .line 347
    goto :goto_8

    .line 348
    :goto_7
    new-instance v10, LE0/d;

    .line 349
    .line 350
    invoke-direct {v10, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 351
    .line 352
    .line 353
    :goto_8
    invoke-static {v10}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    if-eqz v0, :cond_6

    .line 358
    .line 359
    const-string v10, "custom avatar hd class scan fail"

    .line 360
    .line 361
    filled-new-array {v10, v11, v0}, [Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_8
    const-string v0, "hdHead"

    .line 370
    .line 371
    const-string v7, "headImg"

    .line 372
    .line 373
    const-string v11, "setUsername"

    .line 374
    .line 375
    filled-new-array {v9, v0, v7, v11}, [Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    :cond_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-eqz v0, :cond_c

    .line 392
    .line 393
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    check-cast v0, Ljava/lang/String;

    .line 398
    .line 399
    filled-new-array {v0}, [Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-static {v1, v0}, LA0/g;->r(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;)Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    :cond_a
    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-eqz v0, :cond_9

    .line 416
    .line 417
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, Lb1/j;

    .line 422
    .line 423
    :try_start_2
    invoke-virtual {v0}, Lb1/j;->b()Lf1/d;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    iget-object v0, v0, Lf1/d;->a:Ljava/lang/String;

    .line 428
    .line 429
    invoke-static {v0, v6, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 433
    goto :goto_a

    .line 434
    :catchall_2
    move-exception v0

    .line 435
    new-instance v12, LE0/d;

    .line 436
    .line 437
    invoke-direct {v12, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 438
    .line 439
    .line 440
    move-object v0, v12

    .line 441
    :goto_a
    nop

    .line 442
    instance-of v12, v0, LE0/d;

    .line 443
    .line 444
    if-eqz v12, :cond_b

    .line 445
    .line 446
    const/4 v0, 0x0

    .line 447
    :cond_b
    check-cast v0, Ljava/lang/Class;

    .line 448
    .line 449
    if-eqz v0, :cond_a

    .line 450
    .line 451
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    goto :goto_9

    .line 455
    :cond_c
    new-instance v1, Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    :cond_d
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    sget-object v5, LF0/s;->a:LF0/s;

    .line 469
    .line 470
    const-class v7, Ljava/lang/String;

    .line 471
    .line 472
    const-class v9, Ljava/lang/Object;

    .line 473
    .line 474
    if-eqz v0, :cond_1b

    .line 475
    .line 476
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v12

    .line 480
    move-object v13, v12

    .line 481
    check-cast v13, Ljava/lang/Class;

    .line 482
    .line 483
    new-instance v14, Ljava/util/ArrayList;

    .line 484
    .line 485
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 486
    .line 487
    .line 488
    move-object v15, v13

    .line 489
    :goto_c
    if-eqz v15, :cond_f

    .line 490
    .line 491
    invoke-virtual {v15, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-nez v0, :cond_f

    .line 496
    .line 497
    :try_start_3
    invoke-virtual {v15}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 498
    .line 499
    .line 500
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 501
    const/16 p1, 0x0

    .line 502
    .line 503
    :try_start_4
    const-string v8, "getDeclaredFields(...)"

    .line 504
    .line 505
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 509
    .line 510
    .line 511
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 512
    goto :goto_e

    .line 513
    :catchall_3
    move-exception v0

    .line 514
    goto :goto_d

    .line 515
    :catchall_4
    move-exception v0

    .line 516
    const/16 p1, 0x0

    .line 517
    .line 518
    :goto_d
    new-instance v8, LE0/d;

    .line 519
    .line 520
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 521
    .line 522
    .line 523
    move-object v0, v8

    .line 524
    :goto_e
    nop

    .line 525
    instance-of v8, v0, LE0/d;

    .line 526
    .line 527
    if-eqz v8, :cond_e

    .line 528
    .line 529
    move-object v0, v5

    .line 530
    :cond_e
    check-cast v0, Ljava/util/Collection;

    .line 531
    .line 532
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 533
    .line 534
    .line 535
    invoke-virtual {v15}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    move-result-object v15

    .line 539
    goto :goto_c

    .line 540
    :cond_f
    const/16 p1, 0x0

    .line 541
    .line 542
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    if-eqz v0, :cond_10

    .line 547
    .line 548
    move v5, v6

    .line 549
    goto :goto_10

    .line 550
    :cond_10
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    move v5, v6

    .line 555
    :cond_11
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 556
    .line 557
    .line 558
    move-result v8

    .line 559
    if-eqz v8, :cond_13

    .line 560
    .line 561
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v8

    .line 565
    check-cast v8, Ljava/lang/reflect/Field;

    .line 566
    .line 567
    const-class v9, Landroid/graphics/Bitmap;

    .line 568
    .line 569
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    move-result-object v8

    .line 573
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 574
    .line 575
    .line 576
    move-result v8

    .line 577
    if-eqz v8, :cond_11

    .line 578
    .line 579
    add-int/lit8 v5, v5, 0x1

    .line 580
    .line 581
    if-ltz v5, :cond_12

    .line 582
    .line 583
    goto :goto_f

    .line 584
    :cond_12
    invoke-static {}, LF0/l;->a0()V

    .line 585
    .line 586
    .line 587
    throw p1

    .line 588
    :cond_13
    :goto_10
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    if-eqz v0, :cond_15

    .line 593
    .line 594
    :cond_14
    move v0, v6

    .line 595
    goto :goto_11

    .line 596
    :cond_15
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 601
    .line 602
    .line 603
    move-result v8

    .line 604
    if-eqz v8, :cond_14

    .line 605
    .line 606
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    check-cast v8, Ljava/lang/reflect/Field;

    .line 611
    .line 612
    const-class v9, Landroid/widget/SpinnerAdapter;

    .line 613
    .line 614
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    move-result-object v8

    .line 618
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 619
    .line 620
    .line 621
    move-result v8

    .line 622
    if-eqz v8, :cond_16

    .line 623
    .line 624
    move v0, v10

    .line 625
    :goto_11
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 626
    .line 627
    .line 628
    move-result v8

    .line 629
    if-eqz v8, :cond_18

    .line 630
    .line 631
    :cond_17
    move v7, v6

    .line 632
    goto :goto_12

    .line 633
    :cond_18
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 634
    .line 635
    .line 636
    move-result-object v8

    .line 637
    :cond_19
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 638
    .line 639
    .line 640
    move-result v9

    .line 641
    if-eqz v9, :cond_17

    .line 642
    .line 643
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v9

    .line 647
    check-cast v9, Ljava/lang/reflect/Field;

    .line 648
    .line 649
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    move-result-object v9

    .line 653
    invoke-static {v9, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v9

    .line 657
    if-eqz v9, :cond_19

    .line 658
    .line 659
    move v7, v10

    .line 660
    :goto_12
    if-lt v5, v10, :cond_d

    .line 661
    .line 662
    if-eqz v7, :cond_d

    .line 663
    .line 664
    if-nez v0, :cond_1a

    .line 665
    .line 666
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    const-string v5, "Head"

    .line 671
    .line 672
    invoke-static {v0, v5, v10}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    if-eqz v0, :cond_d

    .line 677
    .line 678
    :cond_1a
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    goto/16 :goto_b

    .line 682
    .line 683
    :cond_1b
    const/16 p1, 0x0

    .line 684
    .line 685
    new-instance v3, Ljava/util/ArrayList;

    .line 686
    .line 687
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 695
    .line 696
    .line 697
    move-result v0

    .line 698
    if-eqz v0, :cond_23

    .line 699
    .line 700
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    move-object v8, v0

    .line 705
    check-cast v8, Ljava/lang/Class;

    .line 706
    .line 707
    new-instance v12, Ljava/util/ArrayList;

    .line 708
    .line 709
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 710
    .line 711
    .line 712
    move-object v13, v8

    .line 713
    :goto_14
    if-eqz v13, :cond_1d

    .line 714
    .line 715
    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v0

    .line 719
    if-nez v0, :cond_1d

    .line 720
    .line 721
    :try_start_5
    invoke-virtual {v13}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    const-string v14, "getDeclaredMethods(...)"

    .line 726
    .line 727
    invoke-static {v0, v14}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 731
    .line 732
    .line 733
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 734
    goto :goto_15

    .line 735
    :catchall_5
    move-exception v0

    .line 736
    new-instance v14, LE0/d;

    .line 737
    .line 738
    invoke-direct {v14, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 739
    .line 740
    .line 741
    move-object v0, v14

    .line 742
    :goto_15
    nop

    .line 743
    instance-of v14, v0, LE0/d;

    .line 744
    .line 745
    if-eqz v14, :cond_1c

    .line 746
    .line 747
    move-object v0, v5

    .line 748
    :cond_1c
    check-cast v0, Ljava/util/Collection;

    .line 749
    .line 750
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 751
    .line 752
    .line 753
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    move-result-object v13

    .line 757
    goto :goto_14

    .line 758
    :cond_1d
    new-instance v0, Ljava/util/ArrayList;

    .line 759
    .line 760
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 764
    .line 765
    .line 766
    move-result-object v12

    .line 767
    :goto_16
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 768
    .line 769
    .line 770
    move-result v13

    .line 771
    if-eqz v13, :cond_22

    .line 772
    .line 773
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v13

    .line 777
    check-cast v13, Ljava/lang/reflect/Method;

    .line 778
    .line 779
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 780
    .line 781
    .line 782
    move-result v14

    .line 783
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 784
    .line 785
    .line 786
    move-result v14

    .line 787
    if-eqz v14, :cond_1e

    .line 788
    .line 789
    goto :goto_17

    .line 790
    :cond_1e
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    move-result-object v14

    .line 794
    array-length v14, v14

    .line 795
    if-ne v14, v10, :cond_20

    .line 796
    .line 797
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    move-result-object v14

    .line 801
    aget-object v14, v14, v6

    .line 802
    .line 803
    invoke-static {v14, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result v14

    .line 807
    if-eqz v14, :cond_20

    .line 808
    .line 809
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    move-result-object v14

    .line 813
    sget-object v15, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 814
    .line 815
    invoke-static {v14, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    move-result v14

    .line 819
    if-eqz v14, :cond_20

    .line 820
    .line 821
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v14

    .line 825
    invoke-static {v14, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    move-result v14

    .line 829
    if-nez v14, :cond_1f

    .line 830
    .line 831
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 832
    .line 833
    .line 834
    move-result v14

    .line 835
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 836
    .line 837
    .line 838
    move-result v14

    .line 839
    if-nez v14, :cond_20

    .line 840
    .line 841
    :cond_1f
    new-instance v14, Lz0/j;

    .line 842
    .line 843
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v15

    .line 847
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v10

    .line 851
    const-string v6, "getName(...)"

    .line 852
    .line 853
    invoke-static {v10, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v6

    .line 860
    const-string v13, "toGenericString(...)"

    .line 861
    .line 862
    invoke-static {v6, v13}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    invoke-direct {v14, v15, v10, v6}, Lz0/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    goto :goto_18

    .line 869
    :cond_20
    :goto_17
    move-object/from16 v14, p1

    .line 870
    .line 871
    :goto_18
    if-eqz v14, :cond_21

    .line 872
    .line 873
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    :cond_21
    const/4 v6, 0x0

    .line 877
    const/4 v10, 0x1

    .line 878
    goto :goto_16

    .line 879
    :cond_22
    invoke-static {v0, v3}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 880
    .line 881
    .line 882
    const/4 v6, 0x0

    .line 883
    const/4 v10, 0x1

    .line 884
    goto/16 :goto_13

    .line 885
    .line 886
    :cond_23
    invoke-static {v3}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    const/16 v1, 0x8

    .line 895
    .line 896
    invoke-static {v0, v1}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    new-instance v3, Lz0/k;

    .line 901
    .line 902
    sget v0, Lz0/r;->e:I

    .line 903
    .line 904
    const/4 v5, -0x1

    .line 905
    if-ne v0, v5, :cond_24

    .line 906
    .line 907
    :try_start_6
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 916
    .line 917
    .line 918
    move-result-object v6

    .line 919
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v6

    .line 923
    const/4 v7, 0x0

    .line 924
    invoke-virtual {v0, v6, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    iget v5, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 929
    .line 930
    goto :goto_19

    .line 931
    :catch_0
    move-exception v0

    .line 932
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 937
    .line 938
    .line 939
    :goto_19
    sput v5, Lz0/r;->e:I

    .line 940
    .line 941
    :cond_24
    sget v5, Lz0/r;->e:I

    .line 942
    .line 943
    sget-object v0, Lz0/r;->f:Ljava/lang/String;

    .line 944
    .line 945
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 946
    .line 947
    .line 948
    move-result v0

    .line 949
    const-string v6, ""

    .line 950
    .line 951
    if-eqz v0, :cond_26

    .line 952
    .line 953
    :try_start_7
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 962
    .line 963
    .line 964
    move-result-object v7

    .line 965
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 966
    .line 967
    .line 968
    move-result-object v7

    .line 969
    const/4 v8, 0x0

    .line 970
    invoke-virtual {v0, v7, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 975
    .line 976
    if-nez v0, :cond_25

    .line 977
    .line 978
    goto :goto_1a

    .line 979
    :cond_25
    move-object v6, v0

    .line 980
    goto :goto_1a

    .line 981
    :catch_1
    move-exception v0

    .line 982
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 987
    .line 988
    .line 989
    :goto_1a
    sput-object v6, Lz0/r;->f:Ljava/lang/String;

    .line 990
    .line 991
    :cond_26
    sget-object v0, Lz0/r;->f:Ljava/lang/String;

    .line 992
    .line 993
    invoke-direct {v3, v4, v1, v5, v0}, Lz0/k;-><init>(Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V

    .line 994
    .line 995
    .line 996
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 997
    .line 998
    .line 999
    move-result v0

    .line 1000
    if-eqz v0, :cond_28

    .line 1001
    .line 1002
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v0

    .line 1006
    if-nez v0, :cond_27

    .line 1007
    .line 1008
    goto :goto_1b

    .line 1009
    :cond_27
    move-object/from16 v8, p1

    .line 1010
    .line 1011
    goto :goto_1c

    .line 1012
    :cond_28
    :goto_1b
    move-object v8, v3

    .line 1013
    :goto_1c
    return-object v8
.end method

.method private final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    const-string v0, "bridge"

    .line 6
    .line 7
    invoke-static {v1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p0

    .line 11
    .line 12
    iget-object v0, v2, LA0/h;->b:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string v0, "getClassLoader(...)"

    .line 19
    .line 20
    invoke-static {v3, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v28, "gy4"

    .line 24
    .line 25
    const-string v29, "p65"

    .line 26
    .line 27
    const-string v4, "com.tencent.mm.ui"

    .line 28
    .line 29
    const-string v5, "com.tencent.mm.ui.contact"

    .line 30
    .line 31
    const-string v6, "com.tencent.mm.ui.base"

    .line 32
    .line 33
    const-string v7, "com.tencent.mm.ui.widget"

    .line 34
    .line 35
    const-string v8, "fj5"

    .line 36
    .line 37
    const-string v9, "gg5"

    .line 38
    .line 39
    const-string v10, "wh5"

    .line 40
    .line 41
    const-string v11, "rl5"

    .line 42
    .line 43
    const-string v12, "o95"

    .line 44
    .line 45
    const-string v13, "u65"

    .line 46
    .line 47
    const-string v14, "h85"

    .line 48
    .line 49
    const-string v15, "db5"

    .line 50
    .line 51
    const-string v16, "g75"

    .line 52
    .line 53
    const-string v17, "v15"

    .line 54
    .line 55
    const-string v18, "u85"

    .line 56
    .line 57
    const-string v19, "yc5"

    .line 58
    .line 59
    const-string v20, "q35"

    .line 60
    .line 61
    const-string v21, "k75"

    .line 62
    .line 63
    const-string v22, "me5"

    .line 64
    .line 65
    const-string v23, "wg5"

    .line 66
    .line 67
    const-string v24, "l75"

    .line 68
    .line 69
    const-string v25, "hb5"

    .line 70
    .line 71
    const-string v26, "ki5"

    .line 72
    .line 73
    const-string v27, "j75"

    .line 74
    .line 75
    const-string v30, "q65"

    .line 76
    .line 77
    const-string v31, "r65"

    .line 78
    .line 79
    filled-new-array/range {v4 .. v31}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const-string v19, "q"

    .line 84
    .line 85
    const-string v20, "i"

    .line 86
    .line 87
    const-string v5, "conversation"

    .line 88
    .line 89
    const-string v6, "contact"

    .line 90
    .line 91
    const-string v7, "Address"

    .line 92
    .line 93
    const-string v8, "Menu"

    .line 94
    .line 95
    const-string v9, "menu"

    .line 96
    .line 97
    const-string v10, "popup"

    .line 98
    .line 99
    const-string v11, "Pop"

    .line 100
    .line 101
    const-string v12, "t4"

    .line 102
    .line 103
    const-string v13, ".r"

    .line 104
    .line 105
    const-string v14, ".q"

    .line 106
    .line 107
    const-string v15, ".i"

    .line 108
    .line 109
    const-string v16, ".c5"

    .line 110
    .line 111
    const-string v17, ".n"

    .line 112
    .line 113
    const-string v18, "r"

    .line 114
    .line 115
    const-string v21, "c5"

    .line 116
    .line 117
    const-string v22, "n"

    .line 118
    .line 119
    filled-new-array/range {v5 .. v22}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    new-instance v5, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    sget-object v7, LF0/s;->a:LF0/s;

    .line 141
    .line 142
    const/4 v8, 0x1

    .line 143
    const/4 v9, 0x0

    .line 144
    const/16 v10, 0x1c

    .line 145
    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    move-object v11, v0

    .line 153
    check-cast v11, Ljava/lang/String;

    .line 154
    .line 155
    :try_start_0
    new-instance v0, LW0/a;

    .line 156
    .line 157
    const/4 v12, 0x0

    .line 158
    invoke-direct {v0, v12}, LW0/a;-><init>(I)V

    .line 159
    .line 160
    .line 161
    invoke-static {v4, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    check-cast v10, [Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v0, v10}, LW0/a;->Z([Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    new-instance v10, LZ0/a;

    .line 171
    .line 172
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10, v11, v8, v9}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 176
    .line 177
    .line 178
    iput-object v10, v0, LW0/a;->f:LD/h;

    .line 179
    .line 180
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    new-instance v8, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-eqz v9, :cond_0

    .line 198
    .line 199
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    check-cast v9, Lb1/d;

    .line 204
    .line 205
    invoke-virtual {v9, v3}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :catchall_0
    move-exception v0

    .line 214
    new-instance v8, LE0/d;

    .line 215
    .line 216
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    :cond_0
    invoke-static {v8}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-eqz v0, :cond_1

    .line 224
    .line 225
    const-string v9, "quick add dexkit find class fail"

    .line 226
    .line 227
    filled-new-array {v9, v11, v0}, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_1
    instance-of v0, v8, LE0/d;

    .line 235
    .line 236
    if-eqz v0, :cond_2

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_2
    move-object v7, v8

    .line 240
    :goto_2
    check-cast v7, Ljava/lang/Iterable;

    .line 241
    .line 242
    invoke-static {v7, v5}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 243
    .line 244
    .line 245
    goto :goto_0

    .line 246
    :cond_3
    const/4 v6, 0x7

    .line 247
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    move v11, v9

    .line 253
    :goto_3
    if-ge v11, v10, :cond_6

    .line 254
    .line 255
    aget-object v12, v4, v11

    .line 256
    .line 257
    new-instance v13, LW0/a;

    .line 258
    .line 259
    const/4 v14, 0x0

    .line 260
    invoke-direct {v13, v14}, LW0/a;-><init>(I)V

    .line 261
    .line 262
    .line 263
    filled-new-array {v12}, [Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v12

    .line 267
    invoke-virtual {v13, v12}, LW0/a;->Z([Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    new-instance v12, LZ0/a;

    .line 271
    .line 272
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 273
    .line 274
    .line 275
    new-instance v14, LZ0/c;

    .line 276
    .line 277
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 278
    .line 279
    .line 280
    new-instance v15, LZ0/b;

    .line 281
    .line 282
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 283
    .line 284
    .line 285
    move/from16 p1, v8

    .line 286
    .line 287
    :try_start_2
    iget-object v8, v15, LZ0/b;->h:LW0/a;

    .line 288
    .line 289
    if-nez v8, :cond_4

    .line 290
    .line 291
    new-instance v8, LW0/a;

    .line 292
    .line 293
    const/4 v10, 0x2

    .line 294
    invoke-direct {v8, v10}, LW0/a;-><init>(I)V

    .line 295
    .line 296
    .line 297
    iput-object v8, v15, LZ0/b;->h:LW0/a;

    .line 298
    .line 299
    :cond_4
    iget-object v8, v15, LZ0/b;->h:LW0/a;

    .line 300
    .line 301
    invoke-static {v8}, LN0/g;->b(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    new-instance v10, La1/a;

    .line 305
    .line 306
    const/4 v9, 0x1

    .line 307
    invoke-direct {v10, v9}, La1/a;-><init>(I)V

    .line 308
    .line 309
    .line 310
    iput v6, v10, La1/a;->e:I

    .line 311
    .line 312
    iput v6, v10, La1/a;->f:I

    .line 313
    .line 314
    iput-object v10, v8, LW0/a;->f:LD/h;

    .line 315
    .line 316
    invoke-virtual {v14, v15}, LZ0/c;->Y(LZ0/b;)V

    .line 317
    .line 318
    .line 319
    iput-object v14, v12, LZ0/a;->e:LZ0/c;

    .line 320
    .line 321
    iput-object v12, v13, LW0/a;->f:LD/h;

    .line 322
    .line 323
    invoke-virtual {v1, v13}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    new-instance v9, Ljava/util/ArrayList;

    .line 328
    .line 329
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    if-eqz v10, :cond_5

    .line 341
    .line 342
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    check-cast v10, Lb1/d;

    .line 347
    .line 348
    invoke-virtual {v10, v3}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v10

    .line 352
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    goto :goto_4

    .line 356
    :catchall_1
    move-exception v0

    .line 357
    goto :goto_5

    .line 358
    :cond_5
    invoke-static {v9, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 359
    .line 360
    .line 361
    add-int/lit8 v11, v11, 0x1

    .line 362
    .line 363
    move/from16 v8, p1

    .line 364
    .line 365
    const/4 v9, 0x0

    .line 366
    const/16 v10, 0x1c

    .line 367
    .line 368
    goto :goto_3

    .line 369
    :catchall_2
    move-exception v0

    .line 370
    move/from16 p1, v8

    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_6
    move/from16 p1, v8

    .line 374
    .line 375
    goto :goto_6

    .line 376
    :goto_5
    new-instance v4, LE0/d;

    .line 377
    .line 378
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    move-object v0, v4

    .line 382
    :goto_6
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    if-eqz v4, :cond_7

    .line 387
    .line 388
    const-string v8, "quick add dexkit popup shape scan fail"

    .line 389
    .line 390
    filled-new-array {v8, v4}, [Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    invoke-static {v4}, Li0/a;->d([Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    :cond_7
    instance-of v4, v0, LE0/d;

    .line 398
    .line 399
    if-eqz v4, :cond_8

    .line 400
    .line 401
    move-object v0, v7

    .line 402
    :cond_8
    check-cast v0, Ljava/util/List;

    .line 403
    .line 404
    invoke-static {v5, v0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    new-instance v4, Ljava/util/ArrayList;

    .line 409
    .line 410
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    :cond_9
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    if-eqz v5, :cond_b

    .line 422
    .line 423
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    move-object v8, v5

    .line 428
    check-cast v8, Ljava/lang/Class;

    .line 429
    .line 430
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    const-string v39, "gy4."

    .line 435
    .line 436
    const-string v40, "p65."

    .line 437
    .line 438
    const-string v18, "com.tencent.mm.ui"

    .line 439
    .line 440
    const-string v19, "fj5."

    .line 441
    .line 442
    const-string v20, "gg5."

    .line 443
    .line 444
    const-string v21, "wh5."

    .line 445
    .line 446
    const-string v22, "rl5."

    .line 447
    .line 448
    const-string v23, "o95."

    .line 449
    .line 450
    const-string v24, "u65."

    .line 451
    .line 452
    const-string v25, "h85."

    .line 453
    .line 454
    const-string v26, "db5."

    .line 455
    .line 456
    const-string v27, "g75."

    .line 457
    .line 458
    const-string v28, "v15."

    .line 459
    .line 460
    const-string v29, "u85."

    .line 461
    .line 462
    const-string v30, "yc5."

    .line 463
    .line 464
    const-string v31, "q35."

    .line 465
    .line 466
    const-string v32, "k75."

    .line 467
    .line 468
    const-string v33, "me5."

    .line 469
    .line 470
    const-string v34, "wg5."

    .line 471
    .line 472
    const-string v35, "l75."

    .line 473
    .line 474
    const-string v36, "hb5."

    .line 475
    .line 476
    const-string v37, "ki5."

    .line 477
    .line 478
    const-string v38, "j75."

    .line 479
    .line 480
    const-string v41, "q65."

    .line 481
    .line 482
    const-string v42, "r65."

    .line 483
    .line 484
    filled-new-array/range {v18 .. v42}, [Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v9

    .line 488
    const/4 v10, 0x0

    .line 489
    :goto_8
    const/16 v11, 0x19

    .line 490
    .line 491
    if-ge v10, v11, :cond_9

    .line 492
    .line 493
    aget-object v11, v9, v10

    .line 494
    .line 495
    const/4 v12, 0x0

    .line 496
    invoke-static {v8, v12, v11}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 497
    .line 498
    .line 499
    move-result v11

    .line 500
    if-eqz v11, :cond_a

    .line 501
    .line 502
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    goto :goto_7

    .line 506
    :cond_a
    add-int/lit8 v10, v10, 0x1

    .line 507
    .line 508
    goto :goto_8

    .line 509
    :cond_b
    new-instance v0, Ljava/util/HashSet;

    .line 510
    .line 511
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 512
    .line 513
    .line 514
    new-instance v5, Ljava/util/ArrayList;

    .line 515
    .line 516
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    :cond_c
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 524
    .line 525
    .line 526
    move-result v8

    .line 527
    if-eqz v8, :cond_d

    .line 528
    .line 529
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v8

    .line 533
    move-object v9, v8

    .line 534
    check-cast v9, Ljava/lang/Class;

    .line 535
    .line 536
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v9

    .line 540
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v9

    .line 544
    if-eqz v9, :cond_c

    .line 545
    .line 546
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    goto :goto_9

    .line 550
    :cond_d
    const/16 v0, 0x640

    .line 551
    .line 552
    invoke-static {v5, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    new-instance v4, Ljava/util/ArrayList;

    .line 557
    .line 558
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 559
    .line 560
    .line 561
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 562
    .line 563
    .line 564
    move-result-object v5

    .line 565
    :cond_e
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 566
    .line 567
    .line 568
    move-result v8

    .line 569
    const-class v9, Landroid/view/MenuItem;

    .line 570
    .line 571
    const-string v10, "onMMMenuItemSelected"

    .line 572
    .line 573
    const/4 v11, 0x2

    .line 574
    if-eqz v8, :cond_11

    .line 575
    .line 576
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v8

    .line 580
    move-object v12, v8

    .line 581
    check-cast v12, Ljava/lang/Class;

    .line 582
    .line 583
    invoke-static {v12}, LA0/g;->o(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 584
    .line 585
    .line 586
    move-result-object v12

    .line 587
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 588
    .line 589
    .line 590
    move-result v13

    .line 591
    if-eqz v13, :cond_f

    .line 592
    .line 593
    goto :goto_a

    .line 594
    :cond_f
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 595
    .line 596
    .line 597
    move-result-object v12

    .line 598
    :cond_10
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 599
    .line 600
    .line 601
    move-result v13

    .line 602
    if-eqz v13, :cond_e

    .line 603
    .line 604
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v13

    .line 608
    check-cast v13, Ljava/lang/reflect/Method;

    .line 609
    .line 610
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v14

    .line 614
    invoke-static {v14, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v14

    .line 618
    if-eqz v14, :cond_10

    .line 619
    .line 620
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    move-result-object v14

    .line 624
    array-length v14, v14

    .line 625
    if-ne v14, v11, :cond_10

    .line 626
    .line 627
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    move-result-object v13

    .line 631
    const/16 v17, 0x0

    .line 632
    .line 633
    aget-object v13, v13, v17

    .line 634
    .line 635
    invoke-virtual {v9, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 636
    .line 637
    .line 638
    move-result v13

    .line 639
    if-eqz v13, :cond_10

    .line 640
    .line 641
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_11
    new-instance v5, Ljava/util/ArrayList;

    .line 646
    .line 647
    invoke-static {v4}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 648
    .line 649
    .line 650
    move-result v8

    .line 651
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 655
    .line 656
    .line 657
    move-result-object v4

    .line 658
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 659
    .line 660
    .line 661
    move-result v8

    .line 662
    if-eqz v8, :cond_12

    .line 663
    .line 664
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v8

    .line 668
    check-cast v8, Ljava/lang/Class;

    .line 669
    .line 670
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v8

    .line 674
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    goto :goto_b

    .line 678
    :cond_12
    invoke-static {v5}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 679
    .line 680
    .line 681
    move-result-object v4

    .line 682
    invoke-static {v4}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 683
    .line 684
    .line 685
    move-result-object v4

    .line 686
    new-instance v5, Ljava/util/ArrayList;

    .line 687
    .line 688
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 689
    .line 690
    .line 691
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 692
    .line 693
    .line 694
    move-result-object v8

    .line 695
    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 696
    .line 697
    .line 698
    move-result v12

    .line 699
    const-class v13, Landroid/widget/AdapterView;

    .line 700
    .line 701
    const/4 v14, 0x4

    .line 702
    const-class v15, Landroid/view/View;

    .line 703
    .line 704
    if-eqz v12, :cond_16

    .line 705
    .line 706
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v12

    .line 710
    move-object/from16 v16, v12

    .line 711
    .line 712
    check-cast v16, Ljava/lang/Class;

    .line 713
    .line 714
    invoke-static/range {v16 .. v16}, LA0/g;->o(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 715
    .line 716
    .line 717
    move-result-object v16

    .line 718
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->isEmpty()Z

    .line 719
    .line 720
    .line 721
    move-result v18

    .line 722
    if-eqz v18, :cond_14

    .line 723
    .line 724
    :cond_13
    move/from16 v19, v11

    .line 725
    .line 726
    goto :goto_e

    .line 727
    :cond_14
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 728
    .line 729
    .line 730
    move-result-object v16

    .line 731
    :goto_d
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 732
    .line 733
    .line 734
    move-result v18

    .line 735
    if-eqz v18, :cond_13

    .line 736
    .line 737
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v18

    .line 741
    check-cast v18, Ljava/lang/reflect/Method;

    .line 742
    .line 743
    move/from16 v19, v11

    .line 744
    .line 745
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v11

    .line 749
    const-string v6, "onItemLongClick"

    .line 750
    .line 751
    invoke-static {v11, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-result v6

    .line 755
    if-eqz v6, :cond_15

    .line 756
    .line 757
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    move-result-object v6

    .line 761
    array-length v6, v6

    .line 762
    if-ne v6, v14, :cond_15

    .line 763
    .line 764
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    move-result-object v6

    .line 768
    const/16 v17, 0x0

    .line 769
    .line 770
    aget-object v6, v6, v17

    .line 771
    .line 772
    invoke-virtual {v13, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 773
    .line 774
    .line 775
    move-result v6

    .line 776
    if-eqz v6, :cond_15

    .line 777
    .line 778
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    move-result-object v6

    .line 782
    aget-object v6, v6, p1

    .line 783
    .line 784
    invoke-virtual {v15, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 785
    .line 786
    .line 787
    move-result v6

    .line 788
    if-eqz v6, :cond_15

    .line 789
    .line 790
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    :goto_e
    move/from16 v11, v19

    .line 794
    .line 795
    const/4 v6, 0x7

    .line 796
    goto :goto_c

    .line 797
    :cond_15
    move/from16 v11, v19

    .line 798
    .line 799
    const/4 v6, 0x7

    .line 800
    goto :goto_d

    .line 801
    :cond_16
    move/from16 v19, v11

    .line 802
    .line 803
    new-instance v6, Ljava/util/ArrayList;

    .line 804
    .line 805
    invoke-static {v5}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 806
    .line 807
    .line 808
    move-result v8

    .line 809
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 813
    .line 814
    .line 815
    move-result-object v5

    .line 816
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 817
    .line 818
    .line 819
    move-result v8

    .line 820
    if-eqz v8, :cond_17

    .line 821
    .line 822
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v8

    .line 826
    check-cast v8, Ljava/lang/Class;

    .line 827
    .line 828
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v8

    .line 832
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    goto :goto_f

    .line 836
    :cond_17
    invoke-static {v6}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 837
    .line 838
    .line 839
    move-result-object v5

    .line 840
    invoke-static {v5}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 841
    .line 842
    .line 843
    move-result-object v5

    .line 844
    new-instance v6, Ljava/util/ArrayList;

    .line 845
    .line 846
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 847
    .line 848
    .line 849
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 850
    .line 851
    .line 852
    move-result-object v8

    .line 853
    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 854
    .line 855
    .line 856
    move-result v11

    .line 857
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 858
    .line 859
    const/16 v16, 0x0

    .line 860
    .line 861
    move/from16 v18, v14

    .line 862
    .line 863
    const-string v14, "getName(...)"

    .line 864
    .line 865
    const-class v2, Landroid/view/View$OnCreateContextMenuListener;

    .line 866
    .line 867
    move-object/from16 v21, v0

    .line 868
    .line 869
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 870
    .line 871
    move-object/from16 v22, v7

    .line 872
    .line 873
    if-eqz v11, :cond_1e

    .line 874
    .line 875
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v11

    .line 879
    check-cast v11, Ljava/lang/Class;

    .line 880
    .line 881
    invoke-static {v11}, LA0/g;->o(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 882
    .line 883
    .line 884
    move-result-object v23

    .line 885
    const/16 v24, 0x3

    .line 886
    .line 887
    new-instance v7, Ljava/util/ArrayList;

    .line 888
    .line 889
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 890
    .line 891
    .line 892
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 893
    .line 894
    .line 895
    move-result-object v23

    .line 896
    :goto_11
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 897
    .line 898
    .line 899
    move-result v25

    .line 900
    if-eqz v25, :cond_1d

    .line 901
    .line 902
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v25

    .line 906
    check-cast v25, Ljava/lang/reflect/Method;

    .line 907
    .line 908
    move-object/from16 v26, v8

    .line 909
    .line 910
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    move-result-object v8

    .line 914
    move-object/from16 v27, v9

    .line 915
    .line 916
    array-length v9, v8

    .line 917
    move-object/from16 v28, v8

    .line 918
    .line 919
    const/4 v8, 0x7

    .line 920
    if-eq v9, v8, :cond_19

    .line 921
    .line 922
    :cond_18
    :goto_12
    const/4 v8, 0x0

    .line 923
    goto :goto_13

    .line 924
    :cond_19
    const/16 v17, 0x0

    .line 925
    .line 926
    aget-object v9, v28, v17

    .line 927
    .line 928
    invoke-virtual {v15, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 929
    .line 930
    .line 931
    move-result v9

    .line 932
    if-eqz v9, :cond_18

    .line 933
    .line 934
    aget-object v9, v28, p1

    .line 935
    .line 936
    invoke-static {v9, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 937
    .line 938
    .line 939
    move-result v9

    .line 940
    if-eqz v9, :cond_18

    .line 941
    .line 942
    aget-object v9, v28, v19

    .line 943
    .line 944
    invoke-static {v9, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    move-result v9

    .line 948
    if-eqz v9, :cond_18

    .line 949
    .line 950
    aget-object v9, v28, v24

    .line 951
    .line 952
    invoke-virtual {v2, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 953
    .line 954
    .line 955
    move-result v9

    .line 956
    if-eqz v9, :cond_18

    .line 957
    .line 958
    const/4 v9, 0x5

    .line 959
    aget-object v9, v28, v9

    .line 960
    .line 961
    invoke-static {v9, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 962
    .line 963
    .line 964
    move-result v9

    .line 965
    if-eqz v9, :cond_18

    .line 966
    .line 967
    const/4 v9, 0x6

    .line 968
    aget-object v9, v28, v9

    .line 969
    .line 970
    invoke-static {v9, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    move-result v9

    .line 974
    if-nez v9, :cond_1a

    .line 975
    .line 976
    goto :goto_12

    .line 977
    :cond_1a
    aget-object v9, v28, v18

    .line 978
    .line 979
    const-string v8, "get(...)"

    .line 980
    .line 981
    invoke-static {v9, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    invoke-static {v9}, LA0/g;->B(Ljava/lang/Class;)Z

    .line 985
    .line 986
    .line 987
    move-result v8

    .line 988
    :goto_13
    if-nez v8, :cond_1b

    .line 989
    .line 990
    move-object/from16 v28, v4

    .line 991
    .line 992
    move-object/from16 v29, v11

    .line 993
    .line 994
    move-object/from16 v9, v16

    .line 995
    .line 996
    goto :goto_14

    .line 997
    :cond_1b
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    move-result-object v8

    .line 1001
    aget-object v8, v8, v18

    .line 1002
    .line 1003
    new-instance v9, LA0/O;

    .line 1004
    .line 1005
    move-object/from16 v28, v8

    .line 1006
    .line 1007
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v8

    .line 1011
    move-object/from16 v29, v11

    .line 1012
    .line 1013
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v11

    .line 1017
    move-object/from16 v28, v4

    .line 1018
    .line 1019
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v4

    .line 1023
    invoke-static {v4, v14}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1024
    .line 1025
    .line 1026
    invoke-direct {v9, v8, v11, v4}, LA0/O;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1027
    .line 1028
    .line 1029
    :goto_14
    if-eqz v9, :cond_1c

    .line 1030
    .line 1031
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1032
    .line 1033
    .line 1034
    :cond_1c
    move-object/from16 v8, v26

    .line 1035
    .line 1036
    move-object/from16 v9, v27

    .line 1037
    .line 1038
    move-object/from16 v4, v28

    .line 1039
    .line 1040
    move-object/from16 v11, v29

    .line 1041
    .line 1042
    goto/16 :goto_11

    .line 1043
    .line 1044
    :cond_1d
    move-object/from16 v28, v4

    .line 1045
    .line 1046
    move-object/from16 v26, v8

    .line 1047
    .line 1048
    move-object/from16 v27, v9

    .line 1049
    .line 1050
    invoke-static {v7, v6}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1051
    .line 1052
    .line 1053
    move-object/from16 v2, p0

    .line 1054
    .line 1055
    move/from16 v14, v18

    .line 1056
    .line 1057
    move-object/from16 v0, v21

    .line 1058
    .line 1059
    move-object/from16 v7, v22

    .line 1060
    .line 1061
    goto/16 :goto_10

    .line 1062
    .line 1063
    :cond_1e
    move-object/from16 v28, v4

    .line 1064
    .line 1065
    move-object/from16 v27, v9

    .line 1066
    .line 1067
    const/16 v24, 0x3

    .line 1068
    .line 1069
    invoke-static {v6}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v4

    .line 1073
    invoke-static {v4}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v4

    .line 1077
    new-instance v6, Ljava/util/ArrayList;

    .line 1078
    .line 1079
    invoke-static {v4}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1080
    .line 1081
    .line 1082
    move-result v7

    .line 1083
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1084
    .line 1085
    .line 1086
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v7

    .line 1090
    :goto_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1091
    .line 1092
    .line 1093
    move-result v8

    .line 1094
    if-eqz v8, :cond_1f

    .line 1095
    .line 1096
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v8

    .line 1100
    check-cast v8, LA0/O;

    .line 1101
    .line 1102
    iget-object v8, v8, LA0/O;->a:Ljava/lang/String;

    .line 1103
    .line 1104
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1105
    .line 1106
    .line 1107
    goto :goto_15

    .line 1108
    :cond_1f
    new-instance v7, Ljava/util/ArrayList;

    .line 1109
    .line 1110
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v6

    .line 1117
    :cond_20
    :goto_16
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1118
    .line 1119
    .line 1120
    move-result v8

    .line 1121
    if-eqz v8, :cond_21

    .line 1122
    .line 1123
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v8

    .line 1127
    move-object v9, v8

    .line 1128
    check-cast v9, Ljava/lang/String;

    .line 1129
    .line 1130
    invoke-static {v9}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v9

    .line 1134
    if-nez v9, :cond_20

    .line 1135
    .line 1136
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1137
    .line 1138
    .line 1139
    goto :goto_16

    .line 1140
    :cond_21
    invoke-static {v7}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v6

    .line 1144
    invoke-static {v6}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v6

    .line 1148
    invoke-static {v6}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v7

    .line 1152
    new-instance v8, Ljava/util/ArrayList;

    .line 1153
    .line 1154
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1155
    .line 1156
    .line 1157
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v9

    .line 1161
    :goto_17
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1162
    .line 1163
    .line 1164
    move-result v11

    .line 1165
    if-eqz v11, :cond_23

    .line 1166
    .line 1167
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v11

    .line 1171
    move-object/from16 v20, v11

    .line 1172
    .line 1173
    check-cast v20, Ljava/lang/Class;

    .line 1174
    .line 1175
    move-object/from16 v23, v9

    .line 1176
    .line 1177
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v9

    .line 1181
    invoke-interface {v7, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1182
    .line 1183
    .line 1184
    move-result v9

    .line 1185
    if-eqz v9, :cond_22

    .line 1186
    .line 1187
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    :cond_22
    move-object/from16 v9, v23

    .line 1191
    .line 1192
    goto :goto_17

    .line 1193
    :cond_23
    new-instance v9, Ljava/util/ArrayList;

    .line 1194
    .line 1195
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v8

    .line 1202
    :goto_18
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1203
    .line 1204
    .line 1205
    move-result v11

    .line 1206
    if-eqz v11, :cond_28

    .line 1207
    .line 1208
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v11

    .line 1212
    check-cast v11, Ljava/lang/Class;

    .line 1213
    .line 1214
    invoke-static {v11}, LA0/g;->o(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v20

    .line 1218
    move-object/from16 v23, v8

    .line 1219
    .line 1220
    new-instance v8, Ljava/util/ArrayList;

    .line 1221
    .line 1222
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v20

    .line 1229
    :goto_19
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    .line 1230
    .line 1231
    .line 1232
    move-result v25

    .line 1233
    if-eqz v25, :cond_27

    .line 1234
    .line 1235
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v25

    .line 1239
    check-cast v25, Ljava/lang/reflect/Method;

    .line 1240
    .line 1241
    move-object/from16 v26, v11

    .line 1242
    .line 1243
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v11

    .line 1247
    array-length v11, v11

    .line 1248
    move-object/from16 v29, v4

    .line 1249
    .line 1250
    move/from16 v4, v19

    .line 1251
    .line 1252
    if-ne v11, v4, :cond_24

    .line 1253
    .line 1254
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v4

    .line 1258
    const/16 v17, 0x0

    .line 1259
    .line 1260
    aget-object v4, v4, v17

    .line 1261
    .line 1262
    invoke-static {v4, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1263
    .line 1264
    .line 1265
    move-result v4

    .line 1266
    if-eqz v4, :cond_24

    .line 1267
    .line 1268
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v4

    .line 1272
    aget-object v4, v4, p1

    .line 1273
    .line 1274
    invoke-static {v4, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v4

    .line 1278
    if-eqz v4, :cond_24

    .line 1279
    .line 1280
    move/from16 v4, p1

    .line 1281
    .line 1282
    goto :goto_1a

    .line 1283
    :cond_24
    const/4 v4, 0x0

    .line 1284
    :goto_1a
    if-eqz v4, :cond_25

    .line 1285
    .line 1286
    new-instance v4, LA0/P;

    .line 1287
    .line 1288
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v11

    .line 1292
    move-object/from16 v30, v6

    .line 1293
    .line 1294
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v6

    .line 1298
    invoke-static {v6, v14}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1299
    .line 1300
    .line 1301
    invoke-direct {v4, v11, v6}, LA0/P;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    goto :goto_1b

    .line 1305
    :cond_25
    move-object/from16 v30, v6

    .line 1306
    .line 1307
    move-object/from16 v4, v16

    .line 1308
    .line 1309
    :goto_1b
    if-eqz v4, :cond_26

    .line 1310
    .line 1311
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1312
    .line 1313
    .line 1314
    :cond_26
    move-object/from16 v11, v26

    .line 1315
    .line 1316
    move-object/from16 v4, v29

    .line 1317
    .line 1318
    move-object/from16 v6, v30

    .line 1319
    .line 1320
    const/16 v19, 0x2

    .line 1321
    .line 1322
    goto :goto_19

    .line 1323
    :cond_27
    move-object/from16 v29, v4

    .line 1324
    .line 1325
    move-object/from16 v30, v6

    .line 1326
    .line 1327
    invoke-static {v8, v9}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1328
    .line 1329
    .line 1330
    move-object/from16 v8, v23

    .line 1331
    .line 1332
    const/16 v19, 0x2

    .line 1333
    .line 1334
    goto/16 :goto_18

    .line 1335
    .line 1336
    :cond_28
    move-object/from16 v29, v4

    .line 1337
    .line 1338
    move-object/from16 v30, v6

    .line 1339
    .line 1340
    invoke-static {v9}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v4

    .line 1344
    invoke-static {v4}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v4

    .line 1348
    new-instance v6, Ljava/util/ArrayList;

    .line 1349
    .line 1350
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1351
    .line 1352
    .line 1353
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v8

    .line 1357
    :goto_1c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1358
    .line 1359
    .line 1360
    move-result v9

    .line 1361
    if-eqz v9, :cond_32

    .line 1362
    .line 1363
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v9

    .line 1367
    move-object v11, v9

    .line 1368
    check-cast v11, Ljava/lang/Class;

    .line 1369
    .line 1370
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v14

    .line 1374
    invoke-interface {v7, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v14

    .line 1378
    if-nez v14, :cond_30

    .line 1379
    .line 1380
    invoke-static {v11, v7}, LA0/g;->C(Ljava/lang/Class;Ljava/util/Set;)Z

    .line 1381
    .line 1382
    .line 1383
    move-result v14

    .line 1384
    if-eqz v14, :cond_2e

    .line 1385
    .line 1386
    invoke-static {v11}, LA0/g;->o(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v11

    .line 1390
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1391
    .line 1392
    .line 1393
    move-result v14

    .line 1394
    if-eqz v14, :cond_2a

    .line 1395
    .line 1396
    :cond_29
    move-object/from16 v20, v8

    .line 1397
    .line 1398
    move/from16 v11, v18

    .line 1399
    .line 1400
    const/4 v8, 0x0

    .line 1401
    goto/16 :goto_1f

    .line 1402
    .line 1403
    :cond_2a
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v11

    .line 1407
    :goto_1d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1408
    .line 1409
    .line 1410
    move-result v14

    .line 1411
    if-eqz v14, :cond_29

    .line 1412
    .line 1413
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v14

    .line 1417
    check-cast v14, Ljava/lang/reflect/Method;

    .line 1418
    .line 1419
    move-object/from16 v20, v8

    .line 1420
    .line 1421
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v8

    .line 1425
    move-object/from16 v23, v11

    .line 1426
    .line 1427
    const-string v11, "onItemClick"

    .line 1428
    .line 1429
    invoke-static {v8, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1430
    .line 1431
    .line 1432
    move-result v8

    .line 1433
    if-eqz v8, :cond_2b

    .line 1434
    .line 1435
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v8

    .line 1439
    array-length v8, v8

    .line 1440
    move/from16 v11, v18

    .line 1441
    .line 1442
    if-ne v8, v11, :cond_2c

    .line 1443
    .line 1444
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v8

    .line 1448
    const/16 v17, 0x0

    .line 1449
    .line 1450
    aget-object v8, v8, v17

    .line 1451
    .line 1452
    invoke-virtual {v13, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1453
    .line 1454
    .line 1455
    move-result v8

    .line 1456
    if-eqz v8, :cond_2c

    .line 1457
    .line 1458
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v8

    .line 1462
    aget-object v8, v8, p1

    .line 1463
    .line 1464
    invoke-virtual {v15, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1465
    .line 1466
    .line 1467
    move-result v8

    .line 1468
    if-eqz v8, :cond_2c

    .line 1469
    .line 1470
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v8

    .line 1474
    const/16 v19, 0x2

    .line 1475
    .line 1476
    aget-object v8, v8, v19

    .line 1477
    .line 1478
    invoke-static {v8, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1479
    .line 1480
    .line 1481
    move-result v8

    .line 1482
    if-eqz v8, :cond_2c

    .line 1483
    .line 1484
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v8

    .line 1488
    aget-object v8, v8, v24

    .line 1489
    .line 1490
    invoke-static {v8, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1491
    .line 1492
    .line 1493
    move-result v8

    .line 1494
    if-eqz v8, :cond_2c

    .line 1495
    .line 1496
    move/from16 v8, p1

    .line 1497
    .line 1498
    goto :goto_1e

    .line 1499
    :cond_2b
    move/from16 v11, v18

    .line 1500
    .line 1501
    :cond_2c
    const/4 v8, 0x0

    .line 1502
    :goto_1e
    if-eqz v8, :cond_2d

    .line 1503
    .line 1504
    move/from16 v8, p1

    .line 1505
    .line 1506
    goto :goto_1f

    .line 1507
    :cond_2d
    move/from16 v18, v11

    .line 1508
    .line 1509
    move-object/from16 v8, v20

    .line 1510
    .line 1511
    move-object/from16 v11, v23

    .line 1512
    .line 1513
    goto :goto_1d

    .line 1514
    :goto_1f
    if-eqz v8, :cond_2f

    .line 1515
    .line 1516
    goto :goto_20

    .line 1517
    :cond_2e
    move-object/from16 v20, v8

    .line 1518
    .line 1519
    move/from16 v11, v18

    .line 1520
    .line 1521
    :cond_2f
    const/4 v8, 0x0

    .line 1522
    goto :goto_21

    .line 1523
    :cond_30
    move-object/from16 v20, v8

    .line 1524
    .line 1525
    move/from16 v11, v18

    .line 1526
    .line 1527
    :goto_20
    move/from16 v8, p1

    .line 1528
    .line 1529
    :goto_21
    if-eqz v8, :cond_31

    .line 1530
    .line 1531
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1532
    .line 1533
    .line 1534
    :cond_31
    move/from16 v18, v11

    .line 1535
    .line 1536
    move-object/from16 v8, v20

    .line 1537
    .line 1538
    goto/16 :goto_1c

    .line 1539
    .line 1540
    :cond_32
    new-instance v0, Ljava/util/ArrayList;

    .line 1541
    .line 1542
    invoke-static {v6}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1543
    .line 1544
    .line 1545
    move-result v8

    .line 1546
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1547
    .line 1548
    .line 1549
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v6

    .line 1553
    :goto_22
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1554
    .line 1555
    .line 1556
    move-result v8

    .line 1557
    if-eqz v8, :cond_33

    .line 1558
    .line 1559
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v8

    .line 1563
    check-cast v8, Ljava/lang/Class;

    .line 1564
    .line 1565
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v8

    .line 1569
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1570
    .line 1571
    .line 1572
    goto :goto_22

    .line 1573
    :cond_33
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v0

    .line 1577
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v6

    .line 1581
    new-instance v0, Ljava/util/ArrayList;

    .line 1582
    .line 1583
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1584
    .line 1585
    .line 1586
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v8

    .line 1590
    :goto_23
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1591
    .line 1592
    .line 1593
    move-result v9

    .line 1594
    if-eqz v9, :cond_3d

    .line 1595
    .line 1596
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v9

    .line 1600
    move-object v11, v9

    .line 1601
    check-cast v11, Ljava/lang/Class;

    .line 1602
    .line 1603
    const-class v13, Landroid/widget/BaseAdapter;

    .line 1604
    .line 1605
    invoke-virtual {v13, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1606
    .line 1607
    .line 1608
    move-result v13

    .line 1609
    if-eqz v13, :cond_3a

    .line 1610
    .line 1611
    invoke-static {v11, v7}, LA0/g;->C(Ljava/lang/Class;Ljava/util/Set;)Z

    .line 1612
    .line 1613
    .line 1614
    move-result v13

    .line 1615
    if-eqz v13, :cond_3a

    .line 1616
    .line 1617
    invoke-static {v11}, LA0/g;->o(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v11

    .line 1621
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1622
    .line 1623
    .line 1624
    move-result v13

    .line 1625
    if-eqz v13, :cond_34

    .line 1626
    .line 1627
    move-object/from16 v18, v7

    .line 1628
    .line 1629
    move/from16 v14, v24

    .line 1630
    .line 1631
    const/4 v7, 0x0

    .line 1632
    const/16 v19, 0x2

    .line 1633
    .line 1634
    goto/16 :goto_28

    .line 1635
    .line 1636
    :cond_34
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v11

    .line 1640
    :goto_24
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1641
    .line 1642
    .line 1643
    move-result v13

    .line 1644
    if-eqz v13, :cond_39

    .line 1645
    .line 1646
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v13

    .line 1650
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1651
    .line 1652
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v14

    .line 1656
    move-object/from16 v18, v7

    .line 1657
    .line 1658
    const-string v7, "getView"

    .line 1659
    .line 1660
    invoke-static {v14, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1661
    .line 1662
    .line 1663
    move-result v7

    .line 1664
    if-eqz v7, :cond_36

    .line 1665
    .line 1666
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v7

    .line 1670
    array-length v7, v7

    .line 1671
    move/from16 v14, v24

    .line 1672
    .line 1673
    if-ne v7, v14, :cond_35

    .line 1674
    .line 1675
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v7

    .line 1679
    const/16 v17, 0x0

    .line 1680
    .line 1681
    aget-object v7, v7, v17

    .line 1682
    .line 1683
    invoke-static {v7, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1684
    .line 1685
    .line 1686
    move-result v7

    .line 1687
    if-eqz v7, :cond_35

    .line 1688
    .line 1689
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v7

    .line 1693
    aget-object v7, v7, p1

    .line 1694
    .line 1695
    invoke-virtual {v15, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1696
    .line 1697
    .line 1698
    move-result v7

    .line 1699
    if-eqz v7, :cond_35

    .line 1700
    .line 1701
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v7

    .line 1705
    const/16 v19, 0x2

    .line 1706
    .line 1707
    aget-object v7, v7, v19

    .line 1708
    .line 1709
    const-class v13, Landroid/view/ViewGroup;

    .line 1710
    .line 1711
    invoke-virtual {v13, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1712
    .line 1713
    .line 1714
    move-result v7

    .line 1715
    if-eqz v7, :cond_37

    .line 1716
    .line 1717
    move/from16 v7, p1

    .line 1718
    .line 1719
    goto :goto_27

    .line 1720
    :cond_35
    :goto_25
    const/16 v19, 0x2

    .line 1721
    .line 1722
    goto :goto_26

    .line 1723
    :cond_36
    move/from16 v14, v24

    .line 1724
    .line 1725
    goto :goto_25

    .line 1726
    :cond_37
    :goto_26
    const/4 v7, 0x0

    .line 1727
    :goto_27
    if-eqz v7, :cond_38

    .line 1728
    .line 1729
    move/from16 v7, p1

    .line 1730
    .line 1731
    goto :goto_28

    .line 1732
    :cond_38
    move/from16 v24, v14

    .line 1733
    .line 1734
    move-object/from16 v7, v18

    .line 1735
    .line 1736
    goto :goto_24

    .line 1737
    :cond_39
    move-object/from16 v18, v7

    .line 1738
    .line 1739
    move/from16 v14, v24

    .line 1740
    .line 1741
    const/16 v19, 0x2

    .line 1742
    .line 1743
    const/4 v7, 0x0

    .line 1744
    :goto_28
    if-eqz v7, :cond_3b

    .line 1745
    .line 1746
    move/from16 v7, p1

    .line 1747
    .line 1748
    goto :goto_29

    .line 1749
    :cond_3a
    move-object/from16 v18, v7

    .line 1750
    .line 1751
    move/from16 v14, v24

    .line 1752
    .line 1753
    const/16 v19, 0x2

    .line 1754
    .line 1755
    :cond_3b
    const/4 v7, 0x0

    .line 1756
    :goto_29
    if-eqz v7, :cond_3c

    .line 1757
    .line 1758
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1759
    .line 1760
    .line 1761
    :cond_3c
    move/from16 v24, v14

    .line 1762
    .line 1763
    move-object/from16 v7, v18

    .line 1764
    .line 1765
    goto/16 :goto_23

    .line 1766
    .line 1767
    :cond_3d
    new-instance v7, Ljava/util/ArrayList;

    .line 1768
    .line 1769
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1770
    .line 1771
    .line 1772
    move-result v8

    .line 1773
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1774
    .line 1775
    .line 1776
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v0

    .line 1780
    :goto_2a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1781
    .line 1782
    .line 1783
    move-result v8

    .line 1784
    if-eqz v8, :cond_3e

    .line 1785
    .line 1786
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v8

    .line 1790
    check-cast v8, Ljava/lang/Class;

    .line 1791
    .line 1792
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v8

    .line 1796
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1797
    .line 1798
    .line 1799
    goto :goto_2a

    .line 1800
    :cond_3e
    invoke-static {v7}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v0

    .line 1804
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v7

    .line 1808
    :try_start_3
    new-instance v0, LW0/a;

    .line 1809
    .line 1810
    const/4 v8, 0x0

    .line 1811
    invoke-direct {v0, v8}, LW0/a;-><init>(I)V

    .line 1812
    .line 1813
    .line 1814
    new-instance v8, LZ0/a;

    .line 1815
    .line 1816
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1817
    .line 1818
    .line 1819
    new-instance v9, LZ0/c;

    .line 1820
    .line 1821
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 1822
    .line 1823
    .line 1824
    new-instance v11, LZ0/b;

    .line 1825
    .line 1826
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 1827
    .line 1828
    .line 1829
    const-string v13, "onCreateContextMenu"

    .line 1830
    .line 1831
    invoke-static {v11, v13}, LZ0/b;->b0(LZ0/b;Ljava/lang/String;)V

    .line 1832
    .line 1833
    .line 1834
    const-class v13, Landroid/view/ContextMenu;

    .line 1835
    .line 1836
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v13

    .line 1840
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v14

    .line 1844
    const-class v15, Landroid/view/ContextMenu$ContextMenuInfo;

    .line 1845
    .line 1846
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v15

    .line 1850
    filled-new-array {v13, v14, v15}, [Ljava/lang/String;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v13

    .line 1854
    invoke-virtual {v11, v13}, LZ0/b;->c0([Ljava/lang/String;)V

    .line 1855
    .line 1856
    .line 1857
    invoke-virtual {v9, v11}, LZ0/c;->Y(LZ0/b;)V

    .line 1858
    .line 1859
    .line 1860
    iput-object v9, v8, LZ0/a;->e:LZ0/c;

    .line 1861
    .line 1862
    iput-object v8, v0, LW0/a;->f:LD/h;

    .line 1863
    .line 1864
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v0

    .line 1868
    new-instance v8, Ljava/util/ArrayList;

    .line 1869
    .line 1870
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1871
    .line 1872
    .line 1873
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v0

    .line 1877
    :goto_2b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1878
    .line 1879
    .line 1880
    move-result v9

    .line 1881
    if-eqz v9, :cond_3f

    .line 1882
    .line 1883
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v9

    .line 1887
    check-cast v9, Lb1/d;

    .line 1888
    .line 1889
    invoke-virtual {v9, v3}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1890
    .line 1891
    .line 1892
    move-result-object v9

    .line 1893
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1894
    .line 1895
    .line 1896
    goto :goto_2b

    .line 1897
    :catchall_3
    move-exception v0

    .line 1898
    new-instance v8, LE0/d;

    .line 1899
    .line 1900
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1901
    .line 1902
    .line 1903
    :cond_3f
    invoke-static {v8}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v0

    .line 1907
    if-eqz v0, :cond_40

    .line 1908
    .line 1909
    const-string v9, "quick add dexkit address menu create scan fail"

    .line 1910
    .line 1911
    filled-new-array {v9, v0}, [Ljava/lang/Object;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v0

    .line 1915
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1916
    .line 1917
    .line 1918
    :cond_40
    instance-of v0, v8, LE0/d;

    .line 1919
    .line 1920
    if-eqz v0, :cond_41

    .line 1921
    .line 1922
    move-object/from16 v8, v22

    .line 1923
    .line 1924
    :cond_41
    check-cast v8, Ljava/util/List;

    .line 1925
    .line 1926
    new-instance v0, Ljava/util/ArrayList;

    .line 1927
    .line 1928
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1929
    .line 1930
    .line 1931
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v8

    .line 1935
    :goto_2c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1936
    .line 1937
    .line 1938
    move-result v9

    .line 1939
    if-eqz v9, :cond_48

    .line 1940
    .line 1941
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v9

    .line 1945
    move-object v11, v9

    .line 1946
    check-cast v11, Ljava/lang/Class;

    .line 1947
    .line 1948
    invoke-virtual {v2, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1949
    .line 1950
    .line 1951
    move-result v13

    .line 1952
    if-eqz v13, :cond_47

    .line 1953
    .line 1954
    invoke-static {v11}, LA0/g;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v11

    .line 1958
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1959
    .line 1960
    .line 1961
    move-result v13

    .line 1962
    if-eqz v13, :cond_42

    .line 1963
    .line 1964
    goto/16 :goto_32

    .line 1965
    .line 1966
    :cond_42
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v11

    .line 1970
    :goto_2d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1971
    .line 1972
    .line 1973
    move-result v13

    .line 1974
    if-eqz v13, :cond_47

    .line 1975
    .line 1976
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v13

    .line 1980
    check-cast v13, Ljava/lang/reflect/Field;

    .line 1981
    .line 1982
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v13

    .line 1986
    invoke-static {v13}, LN0/g;->b(Ljava/lang/Object;)V

    .line 1987
    .line 1988
    .line 1989
    invoke-static {v13}, LA0/g;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v13

    .line 1993
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1994
    .line 1995
    .line 1996
    move-result v14

    .line 1997
    if-eqz v14, :cond_44

    .line 1998
    .line 1999
    :cond_43
    move-object/from16 v18, v2

    .line 2000
    .line 2001
    move-object/from16 v19, v8

    .line 2002
    .line 2003
    goto :goto_31

    .line 2004
    :cond_44
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v13

    .line 2008
    :goto_2e
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 2009
    .line 2010
    .line 2011
    move-result v14

    .line 2012
    if-eqz v14, :cond_43

    .line 2013
    .line 2014
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v14

    .line 2018
    check-cast v14, Ljava/lang/reflect/Field;

    .line 2019
    .line 2020
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v15

    .line 2024
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v15

    .line 2028
    move-object/from16 v18, v2

    .line 2029
    .line 2030
    const-string v2, "com.tencent.mm.storage."

    .line 2031
    .line 2032
    move-object/from16 v19, v8

    .line 2033
    .line 2034
    const/4 v8, 0x0

    .line 2035
    invoke-static {v15, v8, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 2036
    .line 2037
    .line 2038
    move-result v2

    .line 2039
    if-nez v2, :cond_46

    .line 2040
    .line 2041
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v2

    .line 2045
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v2

    .line 2049
    const-string v14, "com.tencent.mm.contact."

    .line 2050
    .line 2051
    invoke-static {v2, v8, v14}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 2052
    .line 2053
    .line 2054
    move-result v2

    .line 2055
    if-eqz v2, :cond_45

    .line 2056
    .line 2057
    goto :goto_2f

    .line 2058
    :cond_45
    move-object/from16 v2, v18

    .line 2059
    .line 2060
    move-object/from16 v8, v19

    .line 2061
    .line 2062
    goto :goto_2e

    .line 2063
    :cond_46
    :goto_2f
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2064
    .line 2065
    .line 2066
    :goto_30
    move-object/from16 v2, v18

    .line 2067
    .line 2068
    move-object/from16 v8, v19

    .line 2069
    .line 2070
    goto/16 :goto_2c

    .line 2071
    .line 2072
    :goto_31
    move-object/from16 v2, v18

    .line 2073
    .line 2074
    move-object/from16 v8, v19

    .line 2075
    .line 2076
    goto :goto_2d

    .line 2077
    :cond_47
    :goto_32
    move-object/from16 v18, v2

    .line 2078
    .line 2079
    move-object/from16 v19, v8

    .line 2080
    .line 2081
    goto :goto_30

    .line 2082
    :cond_48
    new-instance v2, LA0/e;

    .line 2083
    .line 2084
    const/4 v8, 0x6

    .line 2085
    invoke-direct {v2, v8}, LA0/e;-><init>(I)V

    .line 2086
    .line 2087
    .line 2088
    invoke-static {v0, v2}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v0

    .line 2092
    new-instance v2, Ljava/util/HashSet;

    .line 2093
    .line 2094
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 2095
    .line 2096
    .line 2097
    new-instance v8, Ljava/util/ArrayList;

    .line 2098
    .line 2099
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2100
    .line 2101
    .line 2102
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v0

    .line 2106
    :cond_49
    :goto_33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2107
    .line 2108
    .line 2109
    move-result v9

    .line 2110
    if-eqz v9, :cond_4a

    .line 2111
    .line 2112
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v9

    .line 2116
    move-object v11, v9

    .line 2117
    check-cast v11, Ljava/lang/Class;

    .line 2118
    .line 2119
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v11

    .line 2123
    invoke-virtual {v2, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2124
    .line 2125
    .line 2126
    move-result v11

    .line 2127
    if-eqz v11, :cond_49

    .line 2128
    .line 2129
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2130
    .line 2131
    .line 2132
    goto :goto_33

    .line 2133
    :cond_4a
    const/16 v2, 0x8

    .line 2134
    .line 2135
    invoke-static {v8, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v8

    .line 2139
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 2140
    .line 2141
    .line 2142
    move-result v0

    .line 2143
    if-eqz v0, :cond_4b

    .line 2144
    .line 2145
    move-object/from16 v18, v8

    .line 2146
    .line 2147
    goto/16 :goto_37

    .line 2148
    .line 2149
    :cond_4b
    new-instance v0, Ljava/util/ArrayList;

    .line 2150
    .line 2151
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2152
    .line 2153
    .line 2154
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v9

    .line 2158
    :goto_34
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2159
    .line 2160
    .line 2161
    move-result v11

    .line 2162
    if-eqz v11, :cond_4f

    .line 2163
    .line 2164
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v11

    .line 2168
    check-cast v11, Ljava/lang/Class;

    .line 2169
    .line 2170
    invoke-static {v11}, LA0/g;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v11

    .line 2174
    new-instance v13, Ljava/util/ArrayList;

    .line 2175
    .line 2176
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 2177
    .line 2178
    .line 2179
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v11

    .line 2183
    :goto_35
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 2184
    .line 2185
    .line 2186
    move-result v14

    .line 2187
    if-eqz v14, :cond_4d

    .line 2188
    .line 2189
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v14

    .line 2193
    move-object v15, v14

    .line 2194
    check-cast v15, Ljava/lang/reflect/Field;

    .line 2195
    .line 2196
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v18

    .line 2200
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v2

    .line 2204
    move-object/from16 v18, v8

    .line 2205
    .line 2206
    const-string v8, "java.lang.String"

    .line 2207
    .line 2208
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2209
    .line 2210
    .line 2211
    move-result v2

    .line 2212
    if-nez v2, :cond_4c

    .line 2213
    .line 2214
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v2

    .line 2218
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    .line 2219
    .line 2220
    .line 2221
    move-result v2

    .line 2222
    if-nez v2, :cond_4c

    .line 2223
    .line 2224
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2225
    .line 2226
    .line 2227
    :cond_4c
    move-object/from16 v8, v18

    .line 2228
    .line 2229
    const/16 v2, 0x8

    .line 2230
    .line 2231
    goto :goto_35

    .line 2232
    :cond_4d
    move-object/from16 v18, v8

    .line 2233
    .line 2234
    new-instance v2, Ljava/util/ArrayList;

    .line 2235
    .line 2236
    invoke-static {v13}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2237
    .line 2238
    .line 2239
    move-result v8

    .line 2240
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 2241
    .line 2242
    .line 2243
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2244
    .line 2245
    .line 2246
    move-result-object v8

    .line 2247
    :goto_36
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2248
    .line 2249
    .line 2250
    move-result v11

    .line 2251
    if-eqz v11, :cond_4e

    .line 2252
    .line 2253
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v11

    .line 2257
    check-cast v11, Ljava/lang/reflect/Field;

    .line 2258
    .line 2259
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v11

    .line 2263
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v11

    .line 2267
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2268
    .line 2269
    .line 2270
    goto :goto_36

    .line 2271
    :cond_4e
    invoke-static {v2, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 2272
    .line 2273
    .line 2274
    move-object/from16 v8, v18

    .line 2275
    .line 2276
    const/16 v2, 0x8

    .line 2277
    .line 2278
    goto :goto_34

    .line 2279
    :cond_4f
    move-object/from16 v18, v8

    .line 2280
    .line 2281
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v2

    .line 2285
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 2286
    .line 2287
    .line 2288
    move-result v0

    .line 2289
    if-eqz v0, :cond_50

    .line 2290
    .line 2291
    :goto_37
    move-object/from16 v0, v22

    .line 2292
    .line 2293
    const/4 v14, 0x0

    .line 2294
    goto/16 :goto_3e

    .line 2295
    .line 2296
    :cond_50
    new-instance v0, Ljava/util/ArrayList;

    .line 2297
    .line 2298
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2299
    .line 2300
    .line 2301
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2302
    .line 2303
    .line 2304
    move-result-object v8

    .line 2305
    :goto_38
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2306
    .line 2307
    .line 2308
    move-result v9

    .line 2309
    if-eqz v9, :cond_52

    .line 2310
    .line 2311
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v9

    .line 2315
    check-cast v9, Ljava/lang/Class;

    .line 2316
    .line 2317
    invoke-static {v9}, LA0/g;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v9

    .line 2321
    new-instance v11, Ljava/util/ArrayList;

    .line 2322
    .line 2323
    invoke-static {v9}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2324
    .line 2325
    .line 2326
    move-result v13

    .line 2327
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 2328
    .line 2329
    .line 2330
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2331
    .line 2332
    .line 2333
    move-result-object v9

    .line 2334
    :goto_39
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2335
    .line 2336
    .line 2337
    move-result v13

    .line 2338
    if-eqz v13, :cond_51

    .line 2339
    .line 2340
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2341
    .line 2342
    .line 2343
    move-result-object v13

    .line 2344
    check-cast v13, Ljava/lang/reflect/Field;

    .line 2345
    .line 2346
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2347
    .line 2348
    .line 2349
    move-result-object v13

    .line 2350
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v13

    .line 2354
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2355
    .line 2356
    .line 2357
    goto :goto_39

    .line 2358
    :cond_51
    invoke-static {v11, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 2359
    .line 2360
    .line 2361
    goto :goto_38

    .line 2362
    :cond_52
    new-instance v8, Ljava/util/ArrayList;

    .line 2363
    .line 2364
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2365
    .line 2366
    .line 2367
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2368
    .line 2369
    .line 2370
    move-result-object v0

    .line 2371
    :cond_53
    :goto_3a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2372
    .line 2373
    .line 2374
    move-result v9

    .line 2375
    if-eqz v9, :cond_55

    .line 2376
    .line 2377
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2378
    .line 2379
    .line 2380
    move-result-object v9

    .line 2381
    move-object v11, v9

    .line 2382
    check-cast v11, Ljava/lang/String;

    .line 2383
    .line 2384
    invoke-static {v11}, LN0/g;->b(Ljava/lang/Object;)V

    .line 2385
    .line 2386
    .line 2387
    const-string v13, "com.tencent.mm.ui.contact"

    .line 2388
    .line 2389
    const/4 v14, 0x0

    .line 2390
    invoke-static {v11, v14, v13}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 2391
    .line 2392
    .line 2393
    move-result v13

    .line 2394
    if-nez v13, :cond_54

    .line 2395
    .line 2396
    const-string v13, "Address"

    .line 2397
    .line 2398
    invoke-static {v11, v13, v14}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 2399
    .line 2400
    .line 2401
    move-result v11

    .line 2402
    if-eqz v11, :cond_53

    .line 2403
    .line 2404
    :cond_54
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2405
    .line 2406
    .line 2407
    goto :goto_3a

    .line 2408
    :cond_55
    const/4 v14, 0x0

    .line 2409
    invoke-static {v8}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v8

    .line 2413
    :try_start_4
    new-instance v0, LW0/a;

    .line 2414
    .line 2415
    const/4 v9, 0x0

    .line 2416
    invoke-direct {v0, v9}, LW0/a;-><init>(I)V

    .line 2417
    .line 2418
    .line 2419
    new-instance v9, LZ0/a;

    .line 2420
    .line 2421
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 2422
    .line 2423
    .line 2424
    new-instance v11, LZ0/c;

    .line 2425
    .line 2426
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 2427
    .line 2428
    .line 2429
    new-instance v13, LZ0/b;

    .line 2430
    .line 2431
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 2432
    .line 2433
    .line 2434
    invoke-static {v13, v10}, LZ0/b;->b0(LZ0/b;Ljava/lang/String;)V

    .line 2435
    .line 2436
    .line 2437
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2438
    .line 2439
    .line 2440
    move-result-object v10

    .line 2441
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2442
    .line 2443
    .line 2444
    move-result-object v12

    .line 2445
    filled-new-array {v10, v12}, [Ljava/lang/String;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v10

    .line 2449
    invoke-virtual {v13, v10}, LZ0/b;->c0([Ljava/lang/String;)V

    .line 2450
    .line 2451
    .line 2452
    invoke-virtual {v11, v13}, LZ0/c;->Y(LZ0/b;)V

    .line 2453
    .line 2454
    .line 2455
    iput-object v11, v9, LZ0/a;->e:LZ0/c;

    .line 2456
    .line 2457
    iput-object v9, v0, LW0/a;->f:LD/h;

    .line 2458
    .line 2459
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 2460
    .line 2461
    .line 2462
    move-result-object v0

    .line 2463
    new-instance v1, Ljava/util/ArrayList;

    .line 2464
    .line 2465
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2466
    .line 2467
    .line 2468
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v0

    .line 2472
    :goto_3b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2473
    .line 2474
    .line 2475
    move-result v9

    .line 2476
    if-eqz v9, :cond_56

    .line 2477
    .line 2478
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2479
    .line 2480
    .line 2481
    move-result-object v9

    .line 2482
    check-cast v9, Lb1/d;

    .line 2483
    .line 2484
    invoke-virtual {v9, v3}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2485
    .line 2486
    .line 2487
    move-result-object v9

    .line 2488
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 2489
    .line 2490
    .line 2491
    goto :goto_3b

    .line 2492
    :catchall_4
    move-exception v0

    .line 2493
    new-instance v1, LE0/d;

    .line 2494
    .line 2495
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 2496
    .line 2497
    .line 2498
    :cond_56
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v0

    .line 2502
    if-eqz v0, :cond_57

    .line 2503
    .line 2504
    const-string v3, "quick add dexkit address menu click scan fail"

    .line 2505
    .line 2506
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 2507
    .line 2508
    .line 2509
    move-result-object v0

    .line 2510
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 2511
    .line 2512
    .line 2513
    :cond_57
    instance-of v0, v1, LE0/d;

    .line 2514
    .line 2515
    if-eqz v0, :cond_58

    .line 2516
    .line 2517
    move-object/from16 v1, v22

    .line 2518
    .line 2519
    :cond_58
    check-cast v1, Ljava/util/List;

    .line 2520
    .line 2521
    new-instance v0, Ljava/util/ArrayList;

    .line 2522
    .line 2523
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2524
    .line 2525
    .line 2526
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2527
    .line 2528
    .line 2529
    move-result-object v1

    .line 2530
    :cond_59
    :goto_3c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2531
    .line 2532
    .line 2533
    move-result v3

    .line 2534
    if-eqz v3, :cond_5f

    .line 2535
    .line 2536
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2537
    .line 2538
    .line 2539
    move-result-object v3

    .line 2540
    move-object v9, v3

    .line 2541
    check-cast v9, Ljava/lang/Class;

    .line 2542
    .line 2543
    invoke-static {v9}, LA0/g;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2544
    .line 2545
    .line 2546
    move-result-object v9

    .line 2547
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2548
    .line 2549
    .line 2550
    move-result v10

    .line 2551
    if-eqz v10, :cond_5a

    .line 2552
    .line 2553
    goto :goto_3c

    .line 2554
    :cond_5a
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2555
    .line 2556
    .line 2557
    move-result-object v10

    .line 2558
    :cond_5b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2559
    .line 2560
    .line 2561
    move-result v11

    .line 2562
    if-eqz v11, :cond_59

    .line 2563
    .line 2564
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2565
    .line 2566
    .line 2567
    move-result-object v11

    .line 2568
    check-cast v11, Ljava/lang/reflect/Field;

    .line 2569
    .line 2570
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v11

    .line 2574
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v11

    .line 2578
    invoke-interface {v2, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2579
    .line 2580
    .line 2581
    move-result v11

    .line 2582
    if-eqz v11, :cond_5b

    .line 2583
    .line 2584
    invoke-interface {v8}, Ljava/util/Set;->isEmpty()Z

    .line 2585
    .line 2586
    .line 2587
    move-result v10

    .line 2588
    if-nez v10, :cond_5e

    .line 2589
    .line 2590
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2591
    .line 2592
    .line 2593
    move-result v10

    .line 2594
    if-eqz v10, :cond_5c

    .line 2595
    .line 2596
    goto :goto_3c

    .line 2597
    :cond_5c
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2598
    .line 2599
    .line 2600
    move-result-object v9

    .line 2601
    :cond_5d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2602
    .line 2603
    .line 2604
    move-result v10

    .line 2605
    if-eqz v10, :cond_59

    .line 2606
    .line 2607
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2608
    .line 2609
    .line 2610
    move-result-object v10

    .line 2611
    check-cast v10, Ljava/lang/reflect/Field;

    .line 2612
    .line 2613
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2614
    .line 2615
    .line 2616
    move-result-object v10

    .line 2617
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2618
    .line 2619
    .line 2620
    move-result-object v10

    .line 2621
    invoke-interface {v8, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2622
    .line 2623
    .line 2624
    move-result v10

    .line 2625
    if-eqz v10, :cond_5d

    .line 2626
    .line 2627
    :cond_5e
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2628
    .line 2629
    .line 2630
    goto :goto_3c

    .line 2631
    :cond_5f
    new-instance v1, LA0/Q;

    .line 2632
    .line 2633
    const/4 v3, 0x0

    .line 2634
    invoke-direct {v1, v2, v8, v3}, LA0/Q;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 2635
    .line 2636
    .line 2637
    invoke-static {v0, v1}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 2638
    .line 2639
    .line 2640
    move-result-object v0

    .line 2641
    new-instance v1, Ljava/util/HashSet;

    .line 2642
    .line 2643
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 2644
    .line 2645
    .line 2646
    new-instance v2, Ljava/util/ArrayList;

    .line 2647
    .line 2648
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2649
    .line 2650
    .line 2651
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v0

    .line 2655
    :cond_60
    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2656
    .line 2657
    .line 2658
    move-result v3

    .line 2659
    if-eqz v3, :cond_61

    .line 2660
    .line 2661
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2662
    .line 2663
    .line 2664
    move-result-object v3

    .line 2665
    move-object v8, v3

    .line 2666
    check-cast v8, Ljava/lang/Class;

    .line 2667
    .line 2668
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2669
    .line 2670
    .line 2671
    move-result-object v8

    .line 2672
    invoke-virtual {v1, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2673
    .line 2674
    .line 2675
    move-result v8

    .line 2676
    if-eqz v8, :cond_60

    .line 2677
    .line 2678
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2679
    .line 2680
    .line 2681
    goto :goto_3d

    .line 2682
    :cond_61
    const/16 v3, 0x8

    .line 2683
    .line 2684
    invoke-static {v2, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v0

    .line 2688
    :goto_3e
    const/16 v1, 0xc

    .line 2689
    .line 2690
    invoke-static {v5, v1}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2691
    .line 2692
    .line 2693
    move-result-object v32

    .line 2694
    move-object/from16 v2, v28

    .line 2695
    .line 2696
    invoke-static {v2, v1}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2697
    .line 2698
    .line 2699
    move-result-object v33

    .line 2700
    const/16 v3, 0x20

    .line 2701
    .line 2702
    move-object/from16 v5, v30

    .line 2703
    .line 2704
    invoke-static {v5, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2705
    .line 2706
    .line 2707
    move-result-object v34

    .line 2708
    move-object/from16 v5, v29

    .line 2709
    .line 2710
    invoke-static {v5, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2711
    .line 2712
    .line 2713
    move-result-object v35

    .line 2714
    const/16 v5, 0x30

    .line 2715
    .line 2716
    invoke-static {v4, v5}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2717
    .line 2718
    .line 2719
    move-result-object v36

    .line 2720
    invoke-static {v6, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2721
    .line 2722
    .line 2723
    move-result-object v37

    .line 2724
    invoke-static {v7, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2725
    .line 2726
    .line 2727
    move-result-object v38

    .line 2728
    invoke-static {v2, v1}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2729
    .line 2730
    .line 2731
    move-result-object v39

    .line 2732
    new-instance v1, Ljava/util/ArrayList;

    .line 2733
    .line 2734
    invoke-static/range {v18 .. v18}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2735
    .line 2736
    .line 2737
    move-result v2

    .line 2738
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 2739
    .line 2740
    .line 2741
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2742
    .line 2743
    .line 2744
    move-result-object v2

    .line 2745
    :goto_3f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2746
    .line 2747
    .line 2748
    move-result v3

    .line 2749
    if-eqz v3, :cond_62

    .line 2750
    .line 2751
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2752
    .line 2753
    .line 2754
    move-result-object v3

    .line 2755
    check-cast v3, Ljava/lang/Class;

    .line 2756
    .line 2757
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2758
    .line 2759
    .line 2760
    move-result-object v3

    .line 2761
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2762
    .line 2763
    .line 2764
    goto :goto_3f

    .line 2765
    :cond_62
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2766
    .line 2767
    .line 2768
    move-result-object v1

    .line 2769
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2770
    .line 2771
    .line 2772
    move-result-object v1

    .line 2773
    const/16 v3, 0x8

    .line 2774
    .line 2775
    invoke-static {v1, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2776
    .line 2777
    .line 2778
    move-result-object v40

    .line 2779
    new-instance v1, Ljava/util/ArrayList;

    .line 2780
    .line 2781
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2782
    .line 2783
    .line 2784
    move-result v2

    .line 2785
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 2786
    .line 2787
    .line 2788
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2789
    .line 2790
    .line 2791
    move-result-object v0

    .line 2792
    :goto_40
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2793
    .line 2794
    .line 2795
    move-result v2

    .line 2796
    if-eqz v2, :cond_63

    .line 2797
    .line 2798
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v2

    .line 2802
    check-cast v2, Ljava/lang/Class;

    .line 2803
    .line 2804
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2805
    .line 2806
    .line 2807
    move-result-object v2

    .line 2808
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2809
    .line 2810
    .line 2811
    goto :goto_40

    .line 2812
    :cond_63
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2813
    .line 2814
    .line 2815
    move-result-object v0

    .line 2816
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2817
    .line 2818
    .line 2819
    move-result-object v0

    .line 2820
    const/16 v3, 0x8

    .line 2821
    .line 2822
    invoke-static {v0, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v41

    .line 2826
    new-instance v31, LA0/N;

    .line 2827
    .line 2828
    invoke-direct/range {v31 .. v41}, LA0/N;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2829
    .line 2830
    .line 2831
    invoke-interface/range {v32 .. v32}, Ljava/util/Collection;->isEmpty()Z

    .line 2832
    .line 2833
    .line 2834
    move-result v0

    .line 2835
    if-eqz v0, :cond_65

    .line 2836
    .line 2837
    invoke-interface/range {v33 .. v33}, Ljava/util/Collection;->isEmpty()Z

    .line 2838
    .line 2839
    .line 2840
    move-result v0

    .line 2841
    if-eqz v0, :cond_65

    .line 2842
    .line 2843
    invoke-interface/range {v34 .. v34}, Ljava/util/Collection;->isEmpty()Z

    .line 2844
    .line 2845
    .line 2846
    move-result v0

    .line 2847
    if-eqz v0, :cond_65

    .line 2848
    .line 2849
    invoke-interface/range {v35 .. v35}, Ljava/util/Collection;->isEmpty()Z

    .line 2850
    .line 2851
    .line 2852
    move-result v0

    .line 2853
    if-eqz v0, :cond_65

    .line 2854
    .line 2855
    invoke-interface/range {v36 .. v36}, Ljava/util/Collection;->isEmpty()Z

    .line 2856
    .line 2857
    .line 2858
    move-result v0

    .line 2859
    if-eqz v0, :cond_65

    .line 2860
    .line 2861
    invoke-interface/range {v37 .. v37}, Ljava/util/Collection;->isEmpty()Z

    .line 2862
    .line 2863
    .line 2864
    move-result v0

    .line 2865
    if-eqz v0, :cond_65

    .line 2866
    .line 2867
    invoke-interface/range {v38 .. v38}, Ljava/util/Collection;->isEmpty()Z

    .line 2868
    .line 2869
    .line 2870
    move-result v0

    .line 2871
    if-eqz v0, :cond_65

    .line 2872
    .line 2873
    invoke-interface/range {v39 .. v39}, Ljava/util/Collection;->isEmpty()Z

    .line 2874
    .line 2875
    .line 2876
    move-result v0

    .line 2877
    if-eqz v0, :cond_65

    .line 2878
    .line 2879
    invoke-interface/range {v40 .. v40}, Ljava/util/Collection;->isEmpty()Z

    .line 2880
    .line 2881
    .line 2882
    move-result v0

    .line 2883
    if-eqz v0, :cond_65

    .line 2884
    .line 2885
    invoke-interface/range {v41 .. v41}, Ljava/util/Collection;->isEmpty()Z

    .line 2886
    .line 2887
    .line 2888
    move-result v0

    .line 2889
    if-nez v0, :cond_64

    .line 2890
    .line 2891
    goto :goto_41

    .line 2892
    :cond_64
    move v8, v14

    .line 2893
    goto :goto_42

    .line 2894
    :cond_65
    :goto_41
    move/from16 v8, p1

    .line 2895
    .line 2896
    :goto_42
    if-nez v8, :cond_66

    .line 2897
    .line 2898
    const-string v0, "quick add dexkit unresolved empty"

    .line 2899
    .line 2900
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v0

    .line 2904
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 2905
    .line 2906
    .line 2907
    goto :goto_43

    .line 2908
    :cond_66
    move-object/from16 v16, v31

    .line 2909
    .line 2910
    :goto_43
    return-object v16
.end method

.method private final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    const-string v0, "bridge"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "getClassLoader(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "MvvmContactListUI"

    .line 20
    .line 21
    const-string v2, "ContactList"

    .line 22
    .line 23
    const-string v3, "SelectContact"

    .line 24
    .line 25
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v3, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    sget-object v5, LF0/s;->a:LF0/s;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x1

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Ljava/lang/String;

    .line 57
    .line 58
    :try_start_0
    new-instance v8, LW0/a;

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    invoke-direct {v8, v9}, LW0/a;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const-string v9, "com.tencent.mm.ui"

    .line 65
    .line 66
    const-string v10, "com.tencent.mm.ui.mvvm"

    .line 67
    .line 68
    const-string v11, "com.tencent.mm.ui.contact"

    .line 69
    .line 70
    filled-new-array {v9, v10, v11}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-virtual {v8, v9}, LW0/a;->Z([Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v9, LZ0/a;

    .line 78
    .line 79
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9, v4, v7, v6}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 83
    .line 84
    .line 85
    iput-object v9, v8, LW0/a;->f:LD/h;

    .line 86
    .line 87
    invoke-virtual {p1, v8}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    new-instance v6, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-static {v4}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_0

    .line 109
    .line 110
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    check-cast v7, Lb1/d;

    .line 115
    .line 116
    invoke-virtual {v7}, Lb1/d;->b()Lf1/a;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    iget-object v7, v7, Lf1/a;->a:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :catchall_0
    move-exception v4

    .line 127
    new-instance v6, LE0/d;

    .line 128
    .line 129
    invoke-direct {v6, v4}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    :cond_0
    instance-of v4, v6, LE0/d;

    .line 133
    .line 134
    if-eqz v4, :cond_1

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_1
    move-object v5, v6

    .line 138
    :goto_2
    check-cast v5, Ljava/lang/Iterable;

    .line 139
    .line 140
    invoke-static {v5, v3}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    :cond_3
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_5

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    move-object v8, v4

    .line 164
    check-cast v8, Ljava/lang/String;

    .line 165
    .line 166
    const-string v9, "Contact"

    .line 167
    .line 168
    invoke-static {v8, v9, v7}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-nez v9, :cond_4

    .line 173
    .line 174
    invoke-static {v8, v1, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eqz v8, :cond_3

    .line 179
    .line 180
    :cond_4
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_5
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 193
    .line 194
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 195
    .line 196
    .line 197
    const-string v3, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"

    .line 198
    .line 199
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    :try_start_1
    new-instance v4, LW0/a;

    .line 203
    .line 204
    const/4 v8, 0x0

    .line 205
    invoke-direct {v4, v8}, LW0/a;-><init>(I)V

    .line 206
    .line 207
    .line 208
    const-string v8, "com.tencent.mm.view.recyclerview"

    .line 209
    .line 210
    const-string v9, "com.tencent.mm.ui.mvvm.uic.conversation.recent"

    .line 211
    .line 212
    filled-new-array {v8, v9}, [Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    invoke-virtual {v4, v8}, LW0/a;->Z([Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    new-instance v8, LZ0/a;

    .line 220
    .line 221
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 222
    .line 223
    .line 224
    const-string v9, "WxRecyclerAdapter"

    .line 225
    .line 226
    invoke-virtual {v8, v9, v7, v6}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 227
    .line 228
    .line 229
    iput-object v8, v4, LW0/a;->f:LD/h;

    .line 230
    .line 231
    invoke-virtual {p1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    new-instance v4, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-static {p1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_6

    .line 253
    .line 254
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    check-cast v7, Lb1/d;

    .line 259
    .line 260
    invoke-virtual {v7}, Lb1/d;->b()Lf1/a;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    iget-object v7, v7, Lf1/a;->a:Ljava/lang/String;

    .line 265
    .line 266
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :catchall_1
    move-exception p1

    .line 271
    new-instance v4, LE0/d;

    .line 272
    .line 273
    invoke-direct {v4, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    :cond_6
    instance-of p1, v4, LE0/d;

    .line 277
    .line 278
    if-eqz p1, :cond_7

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_7
    move-object v5, v4

    .line 282
    :goto_5
    check-cast v5, Ljava/lang/Iterable;

    .line 283
    .line 284
    invoke-static {v5, v2}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 285
    .line 286
    .line 287
    new-instance p1, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    :cond_8
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    const/4 v5, 0x0

    .line 301
    if-eqz v4, :cond_a

    .line 302
    .line 303
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    check-cast v4, Ljava/lang/String;

    .line 308
    .line 309
    :try_start_2
    invoke-static {v4, v6, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 313
    goto :goto_7

    .line 314
    :catchall_2
    move-exception v4

    .line 315
    new-instance v7, LE0/d;

    .line 316
    .line 317
    invoke-direct {v7, v4}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 318
    .line 319
    .line 320
    move-object v4, v7

    .line 321
    :goto_7
    nop

    .line 322
    instance-of v7, v4, LE0/d;

    .line 323
    .line 324
    if-eqz v7, :cond_9

    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_9
    move-object v5, v4

    .line 328
    :goto_8
    check-cast v5, Ljava/lang/Class;

    .line 329
    .line 330
    if-eqz v5, :cond_8

    .line 331
    .line 332
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_a
    new-instance v0, Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    :cond_b
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    const-class v4, Ljava/util/List;

    .line 350
    .line 351
    const-string v6, "data"

    .line 352
    .line 353
    if-eqz v2, :cond_f

    .line 354
    .line 355
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    move-object v7, v2

    .line 360
    check-cast v7, Ljava/lang/Class;

    .line 361
    .line 362
    invoke-static {v7}, LA0/g;->k(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 367
    .line 368
    .line 369
    move-result v8

    .line 370
    if-eqz v8, :cond_c

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_c
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    :cond_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v8

    .line 381
    if-eqz v8, :cond_b

    .line 382
    .line 383
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v8

    .line 387
    check-cast v8, Ljava/lang/reflect/Field;

    .line 388
    .line 389
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 394
    .line 395
    .line 396
    move-result v9

    .line 397
    if-nez v9, :cond_d

    .line 398
    .line 399
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    invoke-virtual {v4, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    if-nez v9, :cond_e

    .line 408
    .line 409
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v8

    .line 413
    invoke-static {v8, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    if-eqz v8, :cond_d

    .line 418
    .line 419
    :cond_e
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    goto :goto_9

    .line 423
    :cond_f
    new-instance p1, Ljava/util/HashSet;

    .line 424
    .line 425
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 426
    .line 427
    .line 428
    new-instance v2, Ljava/util/ArrayList;

    .line 429
    .line 430
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    :cond_10
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    if-eqz v7, :cond_11

    .line 442
    .line 443
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    move-object v8, v7

    .line 448
    check-cast v8, Ljava/lang/Class;

    .line 449
    .line 450
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    invoke-virtual {p1, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v8

    .line 458
    if-eqz v8, :cond_10

    .line 459
    .line 460
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    goto :goto_a

    .line 464
    :cond_11
    new-instance p1, Ljava/util/ArrayList;

    .line 465
    .line 466
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v7

    .line 477
    if-eqz v7, :cond_18

    .line 478
    .line 479
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    check-cast v7, Ljava/lang/Class;

    .line 484
    .line 485
    invoke-static {v7}, LA0/g;->k(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 486
    .line 487
    .line 488
    move-result-object v7

    .line 489
    new-instance v8, Ljava/util/ArrayList;

    .line 490
    .line 491
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 495
    .line 496
    .line 497
    move-result-object v7

    .line 498
    :cond_12
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 499
    .line 500
    .line 501
    move-result v9

    .line 502
    if-eqz v9, :cond_13

    .line 503
    .line 504
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v9

    .line 508
    move-object v10, v9

    .line 509
    check-cast v10, Ljava/lang/reflect/Field;

    .line 510
    .line 511
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 512
    .line 513
    .line 514
    move-result v10

    .line 515
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 516
    .line 517
    .line 518
    move-result v10

    .line 519
    if-nez v10, :cond_12

    .line 520
    .line 521
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    goto :goto_c

    .line 525
    :cond_13
    new-instance v7, Ljava/util/ArrayList;

    .line 526
    .line 527
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 531
    .line 532
    .line 533
    move-result-object v8

    .line 534
    :cond_14
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 535
    .line 536
    .line 537
    move-result v9

    .line 538
    if-eqz v9, :cond_16

    .line 539
    .line 540
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v9

    .line 544
    move-object v10, v9

    .line 545
    check-cast v10, Ljava/lang/reflect/Field;

    .line 546
    .line 547
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    move-result-object v11

    .line 551
    invoke-virtual {v4, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 552
    .line 553
    .line 554
    move-result v11

    .line 555
    if-nez v11, :cond_15

    .line 556
    .line 557
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v10

    .line 561
    invoke-static {v10, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v10

    .line 565
    if-eqz v10, :cond_14

    .line 566
    .line 567
    :cond_15
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    goto :goto_d

    .line 571
    :cond_16
    new-instance v8, LA0/e;

    .line 572
    .line 573
    const/4 v9, 0x7

    .line 574
    invoke-direct {v8, v9}, LA0/e;-><init>(I)V

    .line 575
    .line 576
    .line 577
    new-instance v9, LA0/f;

    .line 578
    .line 579
    const/16 v10, 0x8

    .line 580
    .line 581
    invoke-direct {v9, v10, v8}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    invoke-static {v7, v9}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 585
    .line 586
    .line 587
    move-result-object v7

    .line 588
    new-instance v8, Ljava/util/ArrayList;

    .line 589
    .line 590
    invoke-static {v7}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 591
    .line 592
    .line 593
    move-result v9

    .line 594
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 595
    .line 596
    .line 597
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 598
    .line 599
    .line 600
    move-result-object v7

    .line 601
    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 602
    .line 603
    .line 604
    move-result v9

    .line 605
    if-eqz v9, :cond_17

    .line 606
    .line 607
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v9

    .line 611
    check-cast v9, Ljava/lang/reflect/Field;

    .line 612
    .line 613
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v9

    .line 617
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    goto :goto_e

    .line 621
    :cond_17
    invoke-static {v8}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 622
    .line 623
    .line 624
    move-result-object v7

    .line 625
    invoke-static {v7}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 626
    .line 627
    .line 628
    move-result-object v7

    .line 629
    invoke-static {v7, p1}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 630
    .line 631
    .line 632
    goto/16 :goto_b

    .line 633
    .line 634
    :cond_18
    invoke-static {p1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 635
    .line 636
    .line 637
    move-result-object p1

    .line 638
    invoke-static {p1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 639
    .line 640
    .line 641
    move-result-object p1

    .line 642
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    if-eqz v0, :cond_19

    .line 647
    .line 648
    invoke-static {v6}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 649
    .line 650
    .line 651
    move-result-object p1

    .line 652
    :cond_19
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-eqz v0, :cond_1a

    .line 657
    .line 658
    const-string v0, "com.tencent.mm.ui.mvvm.MvvmContactListUI"

    .line 659
    .line 660
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    :cond_1a
    const/4 v0, 0x6

    .line 665
    invoke-static {v1, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    new-instance v1, Ljava/util/ArrayList;

    .line 670
    .line 671
    invoke-static {v2}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 672
    .line 673
    .line 674
    move-result v4

    .line 675
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 683
    .line 684
    .line 685
    move-result v4

    .line 686
    if-eqz v4, :cond_1b

    .line 687
    .line 688
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    check-cast v4, Ljava/lang/Class;

    .line 693
    .line 694
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v4

    .line 698
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 699
    .line 700
    .line 701
    goto :goto_f

    .line 702
    :cond_1b
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 703
    .line 704
    .line 705
    move-result v2

    .line 706
    if-eqz v2, :cond_1c

    .line 707
    .line 708
    invoke-static {v3}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    :cond_1c
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    const/16 v2, 0x8

    .line 721
    .line 722
    invoke-static {v1, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    invoke-static {p1, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 727
    .line 728
    .line 729
    move-result-object p1

    .line 730
    const-string v2, "llt"

    .line 731
    .line 732
    const-string v3, "ovi"

    .line 733
    .line 734
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    invoke-static {v2}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    new-instance v3, LA0/U;

    .line 743
    .line 744
    invoke-direct {v3, v0, v1, p1, v2}, LA0/U;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 745
    .line 746
    .line 747
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 748
    .line 749
    .line 750
    move-result v0

    .line 751
    if-nez v0, :cond_1d

    .line 752
    .line 753
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 754
    .line 755
    .line 756
    move-result v0

    .line 757
    if-nez v0, :cond_1d

    .line 758
    .line 759
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 760
    .line 761
    .line 762
    move-result p1

    .line 763
    if-nez p1, :cond_1d

    .line 764
    .line 765
    move-object v5, v3

    .line 766
    :cond_1d
    return-object v5
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    const-string v0, "bridge"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "getClassLoader(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "SearchView"

    .line 20
    .line 21
    const-string v2, "ActionBarSearchView"

    .line 22
    .line 23
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    const/4 v5, 0x0

    .line 30
    :try_start_0
    new-instance v6, LW0/a;

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-direct {v6, v7}, LW0/a;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const-string v7, "com.tencent.mm.ui.tools"

    .line 37
    .line 38
    filled-new-array {v7}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v6, v7}, LW0/a;->Z([Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v7, LZ0/a;

    .line 46
    .line 47
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v7, v2, v4, v5}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 51
    .line 52
    .line 53
    iput-object v7, v6, LW0/a;->f:LD/h;

    .line 54
    .line 55
    invoke-virtual {p1, v6}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    new-instance v7, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-static {v6}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_0

    .line 77
    .line 78
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    check-cast v8, Lb1/d;

    .line 83
    .line 84
    invoke-virtual {v8}, Lb1/d;->b()Lf1/a;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    iget-object v8, v8, Lf1/a;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catchall_0
    move-exception v6

    .line 95
    new-instance v7, LE0/d;

    .line 96
    .line 97
    invoke-direct {v7, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    :cond_0
    sget-object v6, LF0/s;->a:LF0/s;

    .line 101
    .line 102
    instance-of v8, v7, LE0/d;

    .line 103
    .line 104
    if-eqz v8, :cond_1

    .line 105
    .line 106
    move-object v7, v6

    .line 107
    :cond_1
    check-cast v7, Ljava/lang/Iterable;

    .line 108
    .line 109
    invoke-static {v7, v3}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 110
    .line 111
    .line 112
    :try_start_1
    new-instance v7, LW0/a;

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    invoke-direct {v7, v8}, LW0/a;-><init>(I)V

    .line 116
    .line 117
    .line 118
    const-string v8, "com.tencent.mm.ui"

    .line 119
    .line 120
    filled-new-array {v8}, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v7, v8}, LW0/a;->Z([Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    new-instance v8, LZ0/a;

    .line 128
    .line 129
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, v1, v4, v5}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 133
    .line 134
    .line 135
    iput-object v8, v7, LW0/a;->f:LD/h;

    .line 136
    .line 137
    invoke-virtual {p1, v7}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    new-instance v7, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-static {p1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-eqz v8, :cond_2

    .line 159
    .line 160
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    check-cast v8, Lb1/d;

    .line 165
    .line 166
    invoke-virtual {v8}, Lb1/d;->b()Lf1/a;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    iget-object v8, v8, Lf1/a;->a:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :catchall_1
    move-exception p1

    .line 177
    new-instance v7, LE0/d;

    .line 178
    .line 179
    invoke-direct {v7, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    :cond_2
    instance-of p1, v7, LE0/d;

    .line 183
    .line 184
    if-eqz p1, :cond_3

    .line 185
    .line 186
    move-object v7, v6

    .line 187
    :cond_3
    check-cast v7, Ljava/lang/Iterable;

    .line 188
    .line 189
    invoke-static {v7, v3}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 190
    .line 191
    .line 192
    new-instance p1, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    if-eqz v7, :cond_6

    .line 206
    .line 207
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    move-object v8, v7

    .line 212
    check-cast v8, Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v8, v2, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    if-nez v9, :cond_5

    .line 219
    .line 220
    invoke-virtual {v8, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    if-nez v9, :cond_5

    .line 225
    .line 226
    const-string v9, ".tools."

    .line 227
    .line 228
    invoke-static {v8, v9, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    if-eqz v8, :cond_4

    .line 233
    .line 234
    :cond_5
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_6
    new-instance v1, LA0/e;

    .line 239
    .line 240
    const/16 v2, 0x9

    .line 241
    .line 242
    invoke-direct {v1, v2}, LA0/e;-><init>(I)V

    .line 243
    .line 244
    .line 245
    new-instance v2, LA0/f;

    .line 246
    .line 247
    const/16 v3, 0xa

    .line 248
    .line 249
    invoke-direct {v2, v3, v1}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-static {p1, v2}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-static {p1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-static {p1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    new-instance v1, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    const/4 v4, 0x0

    .line 278
    if-eqz v3, :cond_9

    .line 279
    .line 280
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    check-cast v3, Ljava/lang/String;

    .line 285
    .line 286
    :try_start_2
    invoke-static {v3, v5, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 290
    goto :goto_4

    .line 291
    :catchall_2
    move-exception v3

    .line 292
    new-instance v7, LE0/d;

    .line 293
    .line 294
    invoke-direct {v7, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    move-object v3, v7

    .line 298
    :goto_4
    nop

    .line 299
    instance-of v7, v3, LE0/d;

    .line 300
    .line 301
    if-eqz v7, :cond_8

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_8
    move-object v4, v3

    .line 305
    :goto_5
    check-cast v4, Ljava/lang/Class;

    .line 306
    .line 307
    if-eqz v4, :cond_7

    .line 308
    .line 309
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 314
    .line 315
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_12

    .line 327
    .line 328
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    check-cast v2, Ljava/lang/Class;

    .line 333
    .line 334
    new-instance v3, Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 337
    .line 338
    .line 339
    :goto_7
    if-eqz v2, :cond_b

    .line 340
    .line 341
    const-class v7, Ljava/lang/Object;

    .line 342
    .line 343
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    if-nez v7, :cond_b

    .line 348
    .line 349
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    const-string v8, "getDeclaredFields(...)"

    .line 354
    .line 355
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-static {v7}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 362
    goto :goto_8

    .line 363
    :catchall_3
    move-exception v7

    .line 364
    new-instance v8, LE0/d;

    .line 365
    .line 366
    invoke-direct {v8, v7}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 367
    .line 368
    .line 369
    move-object v7, v8

    .line 370
    :goto_8
    nop

    .line 371
    instance-of v8, v7, LE0/d;

    .line 372
    .line 373
    if-eqz v8, :cond_a

    .line 374
    .line 375
    move-object v7, v6

    .line 376
    :cond_a
    check-cast v7, Ljava/util/Collection;

    .line 377
    .line 378
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    goto :goto_7

    .line 386
    :cond_b
    new-instance v2, Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    :cond_c
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v7

    .line 399
    if-eqz v7, :cond_d

    .line 400
    .line 401
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v7

    .line 405
    move-object v8, v7

    .line 406
    check-cast v8, Ljava/lang/reflect/Field;

    .line 407
    .line 408
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 409
    .line 410
    .line 411
    move-result v8

    .line 412
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 413
    .line 414
    .line 415
    move-result v8

    .line 416
    if-nez v8, :cond_c

    .line 417
    .line 418
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    goto :goto_9

    .line 422
    :cond_d
    new-instance v3, Ljava/util/ArrayList;

    .line 423
    .line 424
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    :cond_e
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    .line 433
    .line 434
    move-result v7

    .line 435
    if-eqz v7, :cond_10

    .line 436
    .line 437
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v7

    .line 441
    move-object v8, v7

    .line 442
    check-cast v8, Ljava/lang/reflect/Field;

    .line 443
    .line 444
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    move-result-object v9

    .line 448
    const-class v10, Landroid/widget/EditText;

    .line 449
    .line 450
    invoke-virtual {v10, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 451
    .line 452
    .line 453
    move-result v9

    .line 454
    if-nez v9, :cond_f

    .line 455
    .line 456
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v9

    .line 464
    const-string v10, "ActionBarEditText"

    .line 465
    .line 466
    invoke-static {v9, v10, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 467
    .line 468
    .line 469
    move-result v9

    .line 470
    if-nez v9, :cond_f

    .line 471
    .line 472
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    move-result-object v8

    .line 476
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v8

    .line 480
    const-string v9, "EditText"

    .line 481
    .line 482
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 483
    .line 484
    .line 485
    move-result v8

    .line 486
    if-eqz v8, :cond_e

    .line 487
    .line 488
    :cond_f
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    goto :goto_a

    .line 492
    :cond_10
    new-instance v2, LA0/e;

    .line 493
    .line 494
    const/16 v7, 0x8

    .line 495
    .line 496
    invoke-direct {v2, v7}, LA0/e;-><init>(I)V

    .line 497
    .line 498
    .line 499
    new-instance v7, LA0/f;

    .line 500
    .line 501
    const/16 v8, 0x9

    .line 502
    .line 503
    invoke-direct {v7, v8, v2}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    invoke-static {v3, v7}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    new-instance v3, Ljava/util/ArrayList;

    .line 511
    .line 512
    invoke-static {v2}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 513
    .line 514
    .line 515
    move-result v7

    .line 516
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 517
    .line 518
    .line 519
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 524
    .line 525
    .line 526
    move-result v7

    .line 527
    if-eqz v7, :cond_11

    .line 528
    .line 529
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v7

    .line 533
    check-cast v7, Ljava/lang/reflect/Field;

    .line 534
    .line 535
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    goto :goto_b

    .line 543
    :cond_11
    invoke-static {v3}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-static {v2, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 552
    .line 553
    .line 554
    goto/16 :goto_6

    .line 555
    .line 556
    :cond_12
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    new-instance v1, LA0/V;

    .line 565
    .line 566
    const/4 v2, 0x6

    .line 567
    invoke-static {p1, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 568
    .line 569
    .line 570
    move-result-object p1

    .line 571
    const/16 v2, 0x8

    .line 572
    .line 573
    invoke-static {v0, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-direct {v1, p1, v0}, LA0/V;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 578
    .line 579
    .line 580
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 581
    .line 582
    .line 583
    move-result p1

    .line 584
    if-nez p1, :cond_13

    .line 585
    .line 586
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 587
    .line 588
    .line 589
    move-result p1

    .line 590
    if-nez p1, :cond_13

    .line 591
    .line 592
    move-object v4, v1

    .line 593
    :cond_13
    return-object v4
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    const/4 v1, 0x1

    .line 2
    const/4 v2, 0x0

    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    check-cast v3, Lorg/luckypray/dexkit/DexKitBridge;

    .line 6
    .line 7
    const-string v0, "bridge"

    .line 8
    .line 9
    invoke-static {v3, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p0

    .line 13
    .line 14
    iget-object v0, v4, LA0/h;->b:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    const-string v0, "getClassLoader(...)"

    .line 21
    .line 22
    invoke-static {v5, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, LA0/Y;->a:Ljava/util/List;

    .line 26
    .line 27
    const-string v0, "com.tencent.mm.protocal.protobuf.SnsObject"

    .line 28
    .line 29
    invoke-static {v5, v0}, LA0/Y;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const-string v0, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 34
    .line 35
    invoke-static {v5, v0}, LA0/Y;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    const-string v0, "com.tencent.mm.protocal.protobuf.TimeLineObject"

    .line 40
    .line 41
    invoke-static {v5, v0}, LA0/Y;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object v0, LA0/Y;->a:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    sget-object v11, LA0/Y;->a:Ljava/util/List;

    .line 61
    .line 62
    if-eqz v10, :cond_1

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    check-cast v10, Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v5, v10}, LA0/Y;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    if-eqz v10, :cond_0

    .line 75
    .line 76
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const-string v0, "ImproveSnsTimelineUI"

    .line 81
    .line 82
    const-string v10, "ImproveMainUIC"

    .line 83
    .line 84
    const-string v11, "SnsTimelineUI"

    .line 85
    .line 86
    filled-new-array {v0, v10, v11}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    :cond_2
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    const-string v12, "com.tencent.mm.plugin.sns.ui.improve.component"

    .line 103
    .line 104
    const-string v13, "com.tencent.mm.plugin.sns.ui.improve"

    .line 105
    .line 106
    const-string v14, "com.tencent.mm.plugin.sns.ui"

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    move-object v15, v0

    .line 115
    check-cast v15, Ljava/lang/String;

    .line 116
    .line 117
    :try_start_0
    new-instance v0, LW0/a;

    .line 118
    .line 119
    invoke-direct {v0, v2}, LW0/a;-><init>(I)V

    .line 120
    .line 121
    .line 122
    filled-new-array {v14, v13, v12}, [Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    invoke-virtual {v0, v12}, LW0/a;->Z([Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    new-instance v12, LZ0/a;

    .line 130
    .line 131
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v15, v1, v2}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 135
    .line 136
    .line 137
    iput-object v12, v0, LW0/a;->f:LD/h;

    .line 138
    .line 139
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    if-eqz v12, :cond_3

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    check-cast v12, Lb1/d;

    .line 158
    .line 159
    invoke-virtual {v12, v5}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    invoke-interface {v9, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :catchall_0
    move-exception v0

    .line 168
    goto :goto_3

    .line 169
    :cond_3
    move-object v12, v9

    .line 170
    goto :goto_4

    .line 171
    :goto_3
    new-instance v12, LE0/d;

    .line 172
    .line 173
    invoke-direct {v12, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    :goto_4
    invoke-static {v12}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-eqz v0, :cond_2

    .line 181
    .line 182
    const-string v12, "sns dexkit timeline class scan fail"

    .line 183
    .line 184
    filled-new-array {v12, v15, v0}, [Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_4
    new-instance v11, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    const-string v15, "com.tencent.mm.plugin.sns."

    .line 206
    .line 207
    if-eqz v9, :cond_7

    .line 208
    .line 209
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    move-object/from16 v16, v9

    .line 214
    .line 215
    check-cast v16, Ljava/lang/Class;

    .line 216
    .line 217
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-static {v1, v2, v15}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_6

    .line 226
    .line 227
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    const-string v15, "Timeline"

    .line 232
    .line 233
    invoke-static {v1, v15, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-nez v1, :cond_5

    .line 238
    .line 239
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-static {v1, v10, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_6

    .line 248
    .line 249
    :cond_5
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    :cond_6
    const/4 v1, 0x1

    .line 253
    goto :goto_5

    .line 254
    :cond_7
    sget-object v1, LF0/s;->a:LF0/s;

    .line 255
    .line 256
    const-string v9, "getParameterTypes(...)"

    .line 257
    .line 258
    if-nez v6, :cond_8

    .line 259
    .line 260
    move-object/from16 p1, v1

    .line 261
    .line 262
    move-object/from16 v19, v11

    .line 263
    .line 264
    goto/16 :goto_12

    .line 265
    .line 266
    :cond_8
    new-instance v10, Ljava/util/LinkedHashSet;

    .line 267
    .line 268
    invoke-direct {v10}, Ljava/util/LinkedHashSet;-><init>()V

    .line 269
    .line 270
    .line 271
    const-string v24, "Interaction"

    .line 272
    .line 273
    const-string v25, "getSnsInfoStorage"

    .line 274
    .line 275
    const-string v18, "SnsObject"

    .line 276
    .line 277
    const-string v19, "SnsInfo"

    .line 278
    .line 279
    const-string v20, "TimeLine"

    .line 280
    .line 281
    const-string v21, "Timeline"

    .line 282
    .line 283
    const-string v22, "SnsCore"

    .line 284
    .line 285
    const-string v23, "Improve"

    .line 286
    .line 287
    filled-new-array/range {v18 .. v25}, [Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 296
    .line 297
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 298
    .line 299
    .line 300
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v18

    .line 304
    :goto_6
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_b

    .line 309
    .line 310
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    move-object/from16 p1, v1

    .line 315
    .line 316
    move-object v1, v0

    .line 317
    check-cast v1, Ljava/lang/String;

    .line 318
    .line 319
    :try_start_1
    new-instance v0, LW0/a;

    .line 320
    .line 321
    const/4 v4, 0x0

    .line 322
    invoke-direct {v0, v4}, LW0/a;-><init>(I)V

    .line 323
    .line 324
    .line 325
    const-string v4, "com.tencent.mm.plugin.sns.model"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 326
    .line 327
    move-object/from16 v19, v11

    .line 328
    .line 329
    :try_start_2
    const-string v11, "com.tencent.mm.plugin.sns.storage"

    .line 330
    .line 331
    filled-new-array {v4, v11, v13, v12}, [Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-virtual {v0, v4}, LW0/a;->Z([Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    new-instance v4, LZ0/a;

    .line 339
    .line 340
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 341
    .line 342
    .line 343
    move-object/from16 v20, v12

    .line 344
    .line 345
    const/4 v11, 0x0

    .line 346
    const/4 v12, 0x1

    .line 347
    :try_start_3
    invoke-virtual {v4, v1, v12, v11}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 348
    .line 349
    .line 350
    iput-object v4, v0, LW0/a;->f:LD/h;

    .line 351
    .line 352
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    if-eqz v4, :cond_9

    .line 365
    .line 366
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    check-cast v4, Lb1/d;

    .line 371
    .line 372
    invoke-virtual {v4, v5}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 377
    .line 378
    .line 379
    goto :goto_7

    .line 380
    :catchall_1
    move-exception v0

    .line 381
    goto :goto_9

    .line 382
    :cond_9
    move-object v4, v2

    .line 383
    goto :goto_a

    .line 384
    :catchall_2
    move-exception v0

    .line 385
    :goto_8
    move-object/from16 v20, v12

    .line 386
    .line 387
    goto :goto_9

    .line 388
    :catchall_3
    move-exception v0

    .line 389
    move-object/from16 v19, v11

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :goto_9
    new-instance v4, LE0/d;

    .line 393
    .line 394
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 395
    .line 396
    .line 397
    :goto_a
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    if-eqz v0, :cond_a

    .line 402
    .line 403
    const-string v4, "sns dexkit candidate class scan fail"

    .line 404
    .line 405
    filled-new-array {v4, v1, v0}, [Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    :cond_a
    move-object/from16 v4, p0

    .line 413
    .line 414
    move-object/from16 v1, p1

    .line 415
    .line 416
    move-object/from16 v11, v19

    .line 417
    .line 418
    move-object/from16 v12, v20

    .line 419
    .line 420
    goto :goto_6

    .line 421
    :cond_b
    move-object/from16 p1, v1

    .line 422
    .line 423
    move-object/from16 v19, v11

    .line 424
    .line 425
    :try_start_4
    new-instance v0, LW0/a;

    .line 426
    .line 427
    const/4 v12, 0x1

    .line 428
    invoke-direct {v0, v12}, LW0/a;-><init>(I)V

    .line 429
    .line 430
    .line 431
    new-instance v1, LZ0/b;

    .line 432
    .line 433
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 434
    .line 435
    .line 436
    const-string v4, "getSnsInfoStorage"

    .line 437
    .line 438
    const-string v11, "SnsCore"

    .line 439
    .line 440
    filled-new-array {v4, v11}, [Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    invoke-static {v4}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-static {v1, v4}, LZ0/b;->e0(LZ0/b;Ljava/util/List;)V

    .line 449
    .line 450
    .line 451
    iput-object v1, v0, LW0/a;->f:LD/h;

    .line 452
    .line 453
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    :cond_c
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    if-eqz v1, :cond_d

    .line 466
    .line 467
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    check-cast v1, Lb1/j;

    .line 472
    .line 473
    invoke-virtual {v1}, Lb1/j;->b()Lf1/d;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    iget-object v1, v1, Lf1/d;->a:Ljava/lang/String;

    .line 478
    .line 479
    invoke-static {v5, v1}, LA0/Y;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    if-eqz v1, :cond_c

    .line 484
    .line 485
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 486
    .line 487
    .line 488
    goto :goto_b

    .line 489
    :catchall_4
    move-exception v0

    .line 490
    goto :goto_c

    .line 491
    :cond_d
    move-object v1, v2

    .line 492
    goto :goto_d

    .line 493
    :goto_c
    new-instance v1, LE0/d;

    .line 494
    .line 495
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 496
    .line 497
    .line 498
    :goto_d
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    if-eqz v0, :cond_e

    .line 503
    .line 504
    const-string v1, "sns dexkit sns core method scan fail"

    .line 505
    .line 506
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    .line 514
    .line 515
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 516
    .line 517
    .line 518
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    :cond_f
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    if-eqz v2, :cond_10

    .line 527
    .line 528
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    move-object v4, v2

    .line 533
    check-cast v4, Ljava/lang/Class;

    .line 534
    .line 535
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    const/4 v11, 0x0

    .line 540
    invoke-static {v4, v11, v15}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    if-eqz v4, :cond_f

    .line 545
    .line 546
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    goto :goto_e

    .line 550
    :cond_10
    new-instance v1, Ljava/util/HashSet;

    .line 551
    .line 552
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 553
    .line 554
    .line 555
    new-instance v2, Ljava/util/ArrayList;

    .line 556
    .line 557
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    :cond_11
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    if-eqz v4, :cond_12

    .line 569
    .line 570
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    move-object v11, v4

    .line 575
    check-cast v11, Ljava/lang/Class;

    .line 576
    .line 577
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v11

    .line 581
    invoke-virtual {v1, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v11

    .line 585
    if-eqz v11, :cond_11

    .line 586
    .line 587
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    goto :goto_f

    .line 591
    :cond_12
    const/16 v0, 0x258

    .line 592
    .line 593
    invoke-static {v2, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    :cond_13
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    if-eqz v1, :cond_17

    .line 606
    .line 607
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    move-object v2, v1

    .line 612
    check-cast v2, Ljava/lang/Class;

    .line 613
    .line 614
    invoke-static {v2}, LA0/Y;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 619
    .line 620
    .line 621
    move-result v4

    .line 622
    if-eqz v4, :cond_14

    .line 623
    .line 624
    goto :goto_10

    .line 625
    :cond_14
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    :cond_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    if-eqz v4, :cond_13

    .line 634
    .line 635
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    check-cast v4, Ljava/lang/reflect/Method;

    .line 640
    .line 641
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    move-result-object v11

    .line 645
    invoke-static {v11, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v11

    .line 649
    if-eqz v11, :cond_15

    .line 650
    .line 651
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    move-result-object v11

    .line 655
    invoke-static {v11, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    array-length v11, v11

    .line 659
    if-nez v11, :cond_16

    .line 660
    .line 661
    goto :goto_11

    .line 662
    :cond_16
    if-eqz v7, :cond_15

    .line 663
    .line 664
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    move-result-object v11

    .line 672
    invoke-static {v4, v11}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v4

    .line 676
    if-eqz v4, :cond_15

    .line 677
    .line 678
    :goto_11
    invoke-interface {v10, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    goto :goto_10

    .line 682
    :cond_17
    invoke-static {v10}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    move-object v1, v0

    .line 687
    :goto_12
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 688
    .line 689
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 690
    .line 691
    .line 692
    sget-object v0, LA0/Y;->b:Ljava/util/List;

    .line 693
    .line 694
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    :cond_18
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 699
    .line 700
    .line 701
    move-result v4

    .line 702
    if-eqz v4, :cond_19

    .line 703
    .line 704
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v4

    .line 708
    check-cast v4, Ljava/lang/String;

    .line 709
    .line 710
    invoke-static {v5, v4}, LA0/Y;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    if-eqz v4, :cond_18

    .line 715
    .line 716
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    goto :goto_13

    .line 720
    :cond_19
    const-string v0, "SnsUserUI"

    .line 721
    .line 722
    const-string v4, "SnsCommentDetailUI"

    .line 723
    .line 724
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 733
    .line 734
    .line 735
    move-result-object v4

    .line 736
    :cond_1a
    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    if-eqz v0, :cond_1c

    .line 741
    .line 742
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    move-object v10, v0

    .line 747
    check-cast v10, Ljava/lang/String;

    .line 748
    .line 749
    :try_start_5
    new-instance v0, LW0/a;

    .line 750
    .line 751
    const/4 v11, 0x0

    .line 752
    invoke-direct {v0, v11}, LW0/a;-><init>(I)V

    .line 753
    .line 754
    .line 755
    filled-new-array {v14}, [Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v12

    .line 759
    invoke-virtual {v0, v12}, LW0/a;->Z([Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    new-instance v12, LZ0/a;

    .line 763
    .line 764
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 765
    .line 766
    .line 767
    const/4 v13, 0x1

    .line 768
    invoke-virtual {v12, v10, v13, v11}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 769
    .line 770
    .line 771
    iput-object v12, v0, LW0/a;->f:LD/h;

    .line 772
    .line 773
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 782
    .line 783
    .line 784
    move-result v11

    .line 785
    if-eqz v11, :cond_1b

    .line 786
    .line 787
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v11

    .line 791
    check-cast v11, Lb1/d;

    .line 792
    .line 793
    invoke-virtual {v11, v5}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    move-result-object v11

    .line 797
    invoke-interface {v2, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 798
    .line 799
    .line 800
    goto :goto_15

    .line 801
    :catchall_5
    move-exception v0

    .line 802
    goto :goto_16

    .line 803
    :cond_1b
    move-object v11, v2

    .line 804
    goto :goto_17

    .line 805
    :goto_16
    new-instance v11, LE0/d;

    .line 806
    .line 807
    invoke-direct {v11, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 808
    .line 809
    .line 810
    :goto_17
    invoke-static {v11}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    if-eqz v0, :cond_1a

    .line 815
    .line 816
    const-string v11, "sns dexkit detail activity scan fail"

    .line 817
    .line 818
    filled-new-array {v11, v10, v0}, [Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 823
    .line 824
    .line 825
    goto :goto_14

    .line 826
    :cond_1c
    new-instance v4, Ljava/util/ArrayList;

    .line 827
    .line 828
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 829
    .line 830
    .line 831
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    :cond_1d
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 836
    .line 837
    .line 838
    move-result v2

    .line 839
    if-eqz v2, :cond_1e

    .line 840
    .line 841
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    move-object v10, v2

    .line 846
    check-cast v10, Ljava/lang/Class;

    .line 847
    .line 848
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v10

    .line 852
    const-string v11, "com.tencent.mm.plugin.sns.ui."

    .line 853
    .line 854
    const/4 v12, 0x0

    .line 855
    invoke-static {v10, v12, v11}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 856
    .line 857
    .line 858
    move-result v10

    .line 859
    if-eqz v10, :cond_1d

    .line 860
    .line 861
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    goto :goto_18

    .line 865
    :cond_1e
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 866
    .line 867
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 868
    .line 869
    .line 870
    sget-object v0, LA0/Y;->c:Ljava/util/List;

    .line 871
    .line 872
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    :cond_1f
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 877
    .line 878
    .line 879
    move-result v10

    .line 880
    if-eqz v10, :cond_20

    .line 881
    .line 882
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v10

    .line 886
    check-cast v10, Ljava/lang/String;

    .line 887
    .line 888
    invoke-static {v5, v10}, LA0/Y;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    move-result-object v10

    .line 892
    if-eqz v10, :cond_1f

    .line 893
    .line 894
    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    goto :goto_19

    .line 898
    :cond_20
    new-instance v10, Ljava/util/LinkedHashSet;

    .line 899
    .line 900
    invoke-direct {v10}, Ljava/util/LinkedHashSet;-><init>()V

    .line 901
    .line 902
    .line 903
    const-string v0, "Sns"

    .line 904
    .line 905
    const-string v11, "Album"

    .line 906
    .line 907
    const-string v12, "Self"

    .line 908
    .line 909
    const-string v13, "jo"

    .line 910
    .line 911
    filled-new-array {v0, v11, v12, v13}, [Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 920
    .line 921
    .line 922
    move-result-object v11

    .line 923
    :goto_1a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 924
    .line 925
    .line 926
    move-result v0

    .line 927
    if-eqz v0, :cond_23

    .line 928
    .line 929
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    move-object v12, v0

    .line 934
    check-cast v12, Ljava/lang/String;

    .line 935
    .line 936
    :try_start_6
    new-instance v0, LW0/a;

    .line 937
    .line 938
    const/4 v13, 0x0

    .line 939
    invoke-direct {v0, v13}, LW0/a;-><init>(I)V

    .line 940
    .line 941
    .line 942
    filled-new-array {v14}, [Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v13

    .line 946
    invoke-virtual {v0, v13}, LW0/a;->Z([Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    new-instance v13, LZ0/a;

    .line 950
    .line 951
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 952
    .line 953
    .line 954
    move-object/from16 v18, v1

    .line 955
    .line 956
    move-object/from16 v20, v4

    .line 957
    .line 958
    const/4 v1, 0x0

    .line 959
    const/4 v4, 0x1

    .line 960
    :try_start_7
    invoke-virtual {v13, v12, v4, v1}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 961
    .line 962
    .line 963
    iput-object v13, v0, LW0/a;->f:LD/h;

    .line 964
    .line 965
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 974
    .line 975
    .line 976
    move-result v1

    .line 977
    if-eqz v1, :cond_21

    .line 978
    .line 979
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    check-cast v1, Lb1/d;

    .line 984
    .line 985
    invoke-virtual {v1, v5}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    move-result-object v1

    .line 989
    invoke-interface {v10, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 990
    .line 991
    .line 992
    goto :goto_1b

    .line 993
    :catchall_6
    move-exception v0

    .line 994
    goto :goto_1c

    .line 995
    :cond_21
    move-object v1, v10

    .line 996
    goto :goto_1d

    .line 997
    :catchall_7
    move-exception v0

    .line 998
    move-object/from16 v18, v1

    .line 999
    .line 1000
    move-object/from16 v20, v4

    .line 1001
    .line 1002
    :goto_1c
    new-instance v1, LE0/d;

    .line 1003
    .line 1004
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1005
    .line 1006
    .line 1007
    :goto_1d
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    if-eqz v0, :cond_22

    .line 1012
    .line 1013
    const-string v1, "sns dexkit self album adapter scan fail"

    .line 1014
    .line 1015
    filled-new-array {v1, v12, v0}, [Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1020
    .line 1021
    .line 1022
    :cond_22
    move-object/from16 v1, v18

    .line 1023
    .line 1024
    move-object/from16 v4, v20

    .line 1025
    .line 1026
    goto :goto_1a

    .line 1027
    :cond_23
    move-object/from16 v18, v1

    .line 1028
    .line 1029
    move-object/from16 v20, v4

    .line 1030
    .line 1031
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1036
    .line 1037
    .line 1038
    move-result v1

    .line 1039
    if-eqz v1, :cond_35

    .line 1040
    .line 1041
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v1

    .line 1045
    move-object v4, v1

    .line 1046
    check-cast v4, Ljava/lang/Class;

    .line 1047
    .line 1048
    const-class v5, Landroid/widget/BaseAdapter;

    .line 1049
    .line 1050
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v5

    .line 1054
    if-nez v5, :cond_24

    .line 1055
    .line 1056
    :goto_1f
    move-object/from16 v21, v0

    .line 1057
    .line 1058
    const/16 v16, 0x0

    .line 1059
    .line 1060
    goto/16 :goto_26

    .line 1061
    .line 1062
    :cond_24
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v5

    .line 1066
    const/4 v11, 0x0

    .line 1067
    invoke-static {v5, v11, v15}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v5

    .line 1071
    if-nez v5, :cond_25

    .line 1072
    .line 1073
    goto :goto_1f

    .line 1074
    :cond_25
    invoke-static {v4}, LA0/Y;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v5

    .line 1078
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v10

    .line 1082
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1083
    .line 1084
    if-eqz v10, :cond_27

    .line 1085
    .line 1086
    :cond_26
    const/4 v10, 0x0

    .line 1087
    goto :goto_20

    .line 1088
    :cond_27
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v10

    .line 1092
    :cond_28
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v12

    .line 1096
    if-eqz v12, :cond_26

    .line 1097
    .line 1098
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v12

    .line 1102
    check-cast v12, Ljava/lang/reflect/Method;

    .line 1103
    .line 1104
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v13

    .line 1108
    const-string v14, "getCount"

    .line 1109
    .line 1110
    invoke-static {v13, v14}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v13

    .line 1114
    if-eqz v13, :cond_28

    .line 1115
    .line 1116
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v13

    .line 1120
    invoke-static {v13, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    array-length v13, v13

    .line 1124
    if-nez v13, :cond_28

    .line 1125
    .line 1126
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v12

    .line 1130
    invoke-static {v12, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v12

    .line 1134
    if-eqz v12, :cond_28

    .line 1135
    .line 1136
    const/4 v10, 0x1

    .line 1137
    :goto_20
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1138
    .line 1139
    .line 1140
    move-result v12

    .line 1141
    if-eqz v12, :cond_2a

    .line 1142
    .line 1143
    :cond_29
    move-object/from16 v21, v0

    .line 1144
    .line 1145
    const/4 v0, 0x0

    .line 1146
    goto :goto_22

    .line 1147
    :cond_2a
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v12

    .line 1151
    :goto_21
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1152
    .line 1153
    .line 1154
    move-result v13

    .line 1155
    if-eqz v13, :cond_29

    .line 1156
    .line 1157
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v13

    .line 1161
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1162
    .line 1163
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v14

    .line 1167
    move-object/from16 v21, v0

    .line 1168
    .line 1169
    const-string v0, "getItem"

    .line 1170
    .line 1171
    invoke-static {v14, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v0

    .line 1175
    if-eqz v0, :cond_2b

    .line 1176
    .line 1177
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    array-length v0, v0

    .line 1182
    const/4 v14, 0x1

    .line 1183
    if-ne v0, v14, :cond_2b

    .line 1184
    .line 1185
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    const/16 v16, 0x0

    .line 1190
    .line 1191
    aget-object v0, v0, v16

    .line 1192
    .line 1193
    invoke-static {v0, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    move-result v0

    .line 1197
    if-eqz v0, :cond_2b

    .line 1198
    .line 1199
    const/4 v0, 0x1

    .line 1200
    goto :goto_22

    .line 1201
    :cond_2b
    move-object/from16 v0, v21

    .line 1202
    .line 1203
    goto :goto_21

    .line 1204
    :goto_22
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1205
    .line 1206
    .line 1207
    move-result v12

    .line 1208
    if-eqz v12, :cond_2c

    .line 1209
    .line 1210
    const/4 v5, 0x0

    .line 1211
    const/16 v16, 0x0

    .line 1212
    .line 1213
    goto :goto_24

    .line 1214
    :cond_2c
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v5

    .line 1218
    :cond_2d
    :goto_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1219
    .line 1220
    .line 1221
    move-result v12

    .line 1222
    if-eqz v12, :cond_2f

    .line 1223
    .line 1224
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v12

    .line 1228
    check-cast v12, Ljava/lang/reflect/Method;

    .line 1229
    .line 1230
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v13

    .line 1234
    const-string v14, "getView"

    .line 1235
    .line 1236
    invoke-static {v13, v14}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v13

    .line 1240
    if-eqz v13, :cond_2e

    .line 1241
    .line 1242
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v13

    .line 1246
    array-length v13, v13

    .line 1247
    const/4 v14, 0x3

    .line 1248
    if-ne v13, v14, :cond_2e

    .line 1249
    .line 1250
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v13

    .line 1254
    const/16 v16, 0x0

    .line 1255
    .line 1256
    aget-object v13, v13, v16

    .line 1257
    .line 1258
    invoke-static {v13, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v13

    .line 1262
    if-eqz v13, :cond_2d

    .line 1263
    .line 1264
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v13

    .line 1268
    const/16 v17, 0x1

    .line 1269
    .line 1270
    aget-object v13, v13, v17

    .line 1271
    .line 1272
    const-class v14, Landroid/view/View;

    .line 1273
    .line 1274
    invoke-virtual {v14, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v13

    .line 1278
    if-eqz v13, :cond_2d

    .line 1279
    .line 1280
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v12

    .line 1284
    const/4 v13, 0x2

    .line 1285
    aget-object v12, v12, v13

    .line 1286
    .line 1287
    const-class v13, Landroid/view/ViewGroup;

    .line 1288
    .line 1289
    invoke-virtual {v13, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1290
    .line 1291
    .line 1292
    move-result v12

    .line 1293
    if-eqz v12, :cond_2d

    .line 1294
    .line 1295
    const/4 v5, 0x1

    .line 1296
    goto :goto_24

    .line 1297
    :cond_2e
    const/16 v16, 0x0

    .line 1298
    .line 1299
    goto :goto_23

    .line 1300
    :cond_2f
    const/16 v16, 0x0

    .line 1301
    .line 1302
    move/from16 v5, v16

    .line 1303
    .line 1304
    :goto_24
    invoke-static {v4}, LA0/Y;->a(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v4

    .line 1308
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1309
    .line 1310
    .line 1311
    move-result v11

    .line 1312
    if-eqz v11, :cond_31

    .line 1313
    .line 1314
    :cond_30
    move/from16 v4, v16

    .line 1315
    .line 1316
    goto :goto_25

    .line 1317
    :cond_31
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v4

    .line 1321
    :cond_32
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1322
    .line 1323
    .line 1324
    move-result v11

    .line 1325
    if-eqz v11, :cond_30

    .line 1326
    .line 1327
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v11

    .line 1331
    check-cast v11, Ljava/lang/reflect/Field;

    .line 1332
    .line 1333
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v12

    .line 1337
    const-class v13, Ljava/util/List;

    .line 1338
    .line 1339
    invoke-virtual {v13, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1340
    .line 1341
    .line 1342
    move-result v12

    .line 1343
    if-nez v12, :cond_33

    .line 1344
    .line 1345
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v11

    .line 1349
    const-string v12, "e"

    .line 1350
    .line 1351
    invoke-static {v11, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v11

    .line 1355
    if-eqz v11, :cond_32

    .line 1356
    .line 1357
    :cond_33
    const/4 v4, 0x1

    .line 1358
    :goto_25
    if-eqz v10, :cond_34

    .line 1359
    .line 1360
    if-eqz v0, :cond_34

    .line 1361
    .line 1362
    if-eqz v5, :cond_34

    .line 1363
    .line 1364
    if-eqz v4, :cond_34

    .line 1365
    .line 1366
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1367
    .line 1368
    .line 1369
    :cond_34
    :goto_26
    move-object/from16 v0, v21

    .line 1370
    .line 1371
    goto/16 :goto_1e

    .line 1372
    .line 1373
    :cond_35
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v1

    .line 1377
    const-string v2, "com.tencent.mm.plugin.sns.ui.listener"

    .line 1378
    .line 1379
    const/4 v4, 0x4

    .line 1380
    :try_start_8
    new-instance v0, LW0/a;

    .line 1381
    .line 1382
    const/4 v12, 0x1

    .line 1383
    invoke-direct {v0, v12}, LW0/a;-><init>(I)V

    .line 1384
    .line 1385
    .line 1386
    filled-new-array {v2}, [Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v5

    .line 1390
    invoke-static {v5}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v5

    .line 1394
    iput-object v5, v0, LW0/a;->e:Ljava/util/List;

    .line 1395
    .line 1396
    new-instance v5, LZ0/b;

    .line 1397
    .line 1398
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1399
    .line 1400
    .line 1401
    const-string v9, "MicroMsg.TimelineOnCreateContextMenuListener"

    .line 1402
    .line 1403
    const-string v10, "onMMCreateContextMenu error"

    .line 1404
    .line 1405
    filled-new-array {v9, v10}, [Ljava/lang/String;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v9

    .line 1409
    invoke-static {v9}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v9

    .line 1413
    invoke-static {v5, v9}, LZ0/b;->e0(LZ0/b;Ljava/util/List;)V

    .line 1414
    .line 1415
    .line 1416
    iput-object v5, v0, LW0/a;->f:LD/h;

    .line 1417
    .line 1418
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0

    .line 1422
    new-instance v5, Ljava/util/ArrayList;

    .line 1423
    .line 1424
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1425
    .line 1426
    .line 1427
    move-result v9

    .line 1428
    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1436
    .line 1437
    .line 1438
    move-result v9

    .line 1439
    if-eqz v9, :cond_36

    .line 1440
    .line 1441
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v9

    .line 1445
    check-cast v9, Lb1/j;

    .line 1446
    .line 1447
    new-instance v10, LA0/X;

    .line 1448
    .line 1449
    invoke-virtual {v9}, Lb1/j;->b()Lf1/d;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v11

    .line 1453
    iget-object v11, v11, Lf1/d;->a:Ljava/lang/String;

    .line 1454
    .line 1455
    invoke-virtual {v9}, Lb1/j;->b()Lf1/d;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v12

    .line 1459
    iget-object v12, v12, Lf1/d;->b:Ljava/lang/String;

    .line 1460
    .line 1461
    invoke-virtual {v9}, Lb1/j;->c()Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v9

    .line 1465
    invoke-direct {v10, v11, v12, v9}, LA0/X;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1469
    .line 1470
    .line 1471
    goto :goto_27

    .line 1472
    :catchall_8
    move-exception v0

    .line 1473
    goto :goto_28

    .line 1474
    :cond_36
    invoke-static {v5}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v0

    .line 1478
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v0

    .line 1482
    invoke-static {v0, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 1486
    goto :goto_29

    .line 1487
    :goto_28
    new-instance v5, LE0/d;

    .line 1488
    .line 1489
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1490
    .line 1491
    .line 1492
    move-object v0, v5

    .line 1493
    :goto_29
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v5

    .line 1497
    if-eqz v5, :cond_37

    .line 1498
    .line 1499
    const-string v9, "sns dexkit context menu create scan fail"

    .line 1500
    .line 1501
    filled-new-array {v9, v5}, [Ljava/lang/Object;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v5

    .line 1505
    invoke-static {v5}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1506
    .line 1507
    .line 1508
    :cond_37
    instance-of v5, v0, LE0/d;

    .line 1509
    .line 1510
    if-eqz v5, :cond_38

    .line 1511
    .line 1512
    move-object/from16 v0, p1

    .line 1513
    .line 1514
    :cond_38
    move-object/from16 v37, v0

    .line 1515
    .line 1516
    check-cast v37, Ljava/util/List;

    .line 1517
    .line 1518
    :try_start_9
    new-instance v0, LW0/a;

    .line 1519
    .line 1520
    const/4 v12, 0x1

    .line 1521
    invoke-direct {v0, v12}, LW0/a;-><init>(I)V

    .line 1522
    .line 1523
    .line 1524
    filled-new-array {v2}, [Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v2

    .line 1528
    invoke-static {v2}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v2

    .line 1532
    iput-object v2, v0, LW0/a;->e:Ljava/util/List;

    .line 1533
    .line 1534
    new-instance v2, LZ0/b;

    .line 1535
    .line 1536
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1537
    .line 1538
    .line 1539
    const-string v5, "delete comment fail!!! snsInfo is null"

    .line 1540
    .line 1541
    const-string v9, "send photo fail, mediaObj is null"

    .line 1542
    .line 1543
    filled-new-array {v5, v9}, [Ljava/lang/String;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v5

    .line 1547
    invoke-static {v5}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v5

    .line 1551
    invoke-static {v2, v5}, LZ0/b;->e0(LZ0/b;Ljava/util/List;)V

    .line 1552
    .line 1553
    .line 1554
    iput-object v2, v0, LW0/a;->f:LD/h;

    .line 1555
    .line 1556
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v0

    .line 1560
    new-instance v2, Ljava/util/ArrayList;

    .line 1561
    .line 1562
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1563
    .line 1564
    .line 1565
    move-result v3

    .line 1566
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v0

    .line 1573
    :goto_2a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1574
    .line 1575
    .line 1576
    move-result v3

    .line 1577
    if-eqz v3, :cond_39

    .line 1578
    .line 1579
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v3

    .line 1583
    check-cast v3, Lb1/j;

    .line 1584
    .line 1585
    new-instance v5, LA0/X;

    .line 1586
    .line 1587
    invoke-virtual {v3}, Lb1/j;->b()Lf1/d;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v9

    .line 1591
    iget-object v9, v9, Lf1/d;->a:Ljava/lang/String;

    .line 1592
    .line 1593
    invoke-virtual {v3}, Lb1/j;->b()Lf1/d;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v10

    .line 1597
    iget-object v10, v10, Lf1/d;->b:Ljava/lang/String;

    .line 1598
    .line 1599
    invoke-virtual {v3}, Lb1/j;->c()Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v3

    .line 1603
    invoke-direct {v5, v9, v10, v3}, LA0/X;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1604
    .line 1605
    .line 1606
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1607
    .line 1608
    .line 1609
    goto :goto_2a

    .line 1610
    :catchall_9
    move-exception v0

    .line 1611
    goto :goto_2b

    .line 1612
    :cond_39
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v0

    .line 1616
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v0

    .line 1620
    invoke-static {v0, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1624
    goto :goto_2c

    .line 1625
    :goto_2b
    new-instance v2, LE0/d;

    .line 1626
    .line 1627
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1628
    .line 1629
    .line 1630
    move-object v0, v2

    .line 1631
    :goto_2c
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v2

    .line 1635
    if-eqz v2, :cond_3a

    .line 1636
    .line 1637
    const-string v3, "sns dexkit context menu select scan fail"

    .line 1638
    .line 1639
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v2

    .line 1643
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1644
    .line 1645
    .line 1646
    :cond_3a
    instance-of v2, v0, LE0/d;

    .line 1647
    .line 1648
    if-eqz v2, :cond_3b

    .line 1649
    .line 1650
    move-object/from16 v0, p1

    .line 1651
    .line 1652
    :cond_3b
    move-object/from16 v38, v0

    .line 1653
    .line 1654
    check-cast v38, Ljava/util/List;

    .line 1655
    .line 1656
    new-instance v0, Ljava/util/ArrayList;

    .line 1657
    .line 1658
    invoke-static/range {v19 .. v19}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1659
    .line 1660
    .line 1661
    move-result v2

    .line 1662
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v2

    .line 1669
    :goto_2d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1670
    .line 1671
    .line 1672
    move-result v3

    .line 1673
    if-eqz v3, :cond_3c

    .line 1674
    .line 1675
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v3

    .line 1679
    check-cast v3, Ljava/lang/Class;

    .line 1680
    .line 1681
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v3

    .line 1685
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1686
    .line 1687
    .line 1688
    goto :goto_2d

    .line 1689
    :cond_3c
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v0

    .line 1693
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v0

    .line 1697
    const/16 v2, 0x8

    .line 1698
    .line 1699
    invoke-static {v0, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v22

    .line 1703
    new-instance v0, Ljava/util/ArrayList;

    .line 1704
    .line 1705
    invoke-static/range {v18 .. v18}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1706
    .line 1707
    .line 1708
    move-result v3

    .line 1709
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1710
    .line 1711
    .line 1712
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v3

    .line 1716
    :goto_2e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1717
    .line 1718
    .line 1719
    move-result v4

    .line 1720
    if-eqz v4, :cond_3d

    .line 1721
    .line 1722
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v4

    .line 1726
    check-cast v4, Ljava/lang/Class;

    .line 1727
    .line 1728
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v4

    .line 1732
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1733
    .line 1734
    .line 1735
    goto :goto_2e

    .line 1736
    :cond_3d
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v0

    .line 1740
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v0

    .line 1744
    const/16 v3, 0x18

    .line 1745
    .line 1746
    invoke-static {v0, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v23

    .line 1750
    new-instance v0, Ljava/util/ArrayList;

    .line 1751
    .line 1752
    invoke-static/range {v20 .. v20}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1753
    .line 1754
    .line 1755
    move-result v3

    .line 1756
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1757
    .line 1758
    .line 1759
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v3

    .line 1763
    :goto_2f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1764
    .line 1765
    .line 1766
    move-result v4

    .line 1767
    if-eqz v4, :cond_3e

    .line 1768
    .line 1769
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v4

    .line 1773
    check-cast v4, Ljava/lang/Class;

    .line 1774
    .line 1775
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v4

    .line 1779
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1780
    .line 1781
    .line 1782
    goto :goto_2f

    .line 1783
    :cond_3e
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v0

    .line 1787
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v0

    .line 1791
    const/4 v3, 0x6

    .line 1792
    invoke-static {v0, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v24

    .line 1796
    new-instance v0, Ljava/util/ArrayList;

    .line 1797
    .line 1798
    invoke-static {v1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1799
    .line 1800
    .line 1801
    move-result v4

    .line 1802
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1803
    .line 1804
    .line 1805
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v1

    .line 1809
    :goto_30
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1810
    .line 1811
    .line 1812
    move-result v4

    .line 1813
    if-eqz v4, :cond_3f

    .line 1814
    .line 1815
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v4

    .line 1819
    check-cast v4, Ljava/lang/Class;

    .line 1820
    .line 1821
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v4

    .line 1825
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1826
    .line 1827
    .line 1828
    goto :goto_30

    .line 1829
    :cond_3f
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v0

    .line 1833
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v0

    .line 1837
    invoke-static {v0, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v25

    .line 1841
    sget-object v0, LA0/Y;->d:Ljava/util/List;

    .line 1842
    .line 1843
    invoke-static {v7, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v26

    .line 1847
    sget-object v0, LA0/Y;->e:Ljava/util/List;

    .line 1848
    .line 1849
    invoke-static {v7, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v27

    .line 1853
    sget-object v0, LA0/Y;->f:Ljava/util/List;

    .line 1854
    .line 1855
    invoke-static {v7, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v28

    .line 1859
    sget-object v0, LA0/Y;->g:Ljava/util/List;

    .line 1860
    .line 1861
    invoke-static {v8, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v29

    .line 1865
    sget-object v0, LA0/Y;->h:Ljava/util/List;

    .line 1866
    .line 1867
    invoke-static {v6, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v30

    .line 1871
    sget-object v0, LA0/Y;->i:Ljava/util/List;

    .line 1872
    .line 1873
    invoke-static {v6, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v31

    .line 1877
    sget-object v0, LA0/Y;->j:Ljava/util/List;

    .line 1878
    .line 1879
    invoke-static {v6, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v32

    .line 1883
    sget-object v0, LA0/Y;->k:Ljava/util/List;

    .line 1884
    .line 1885
    invoke-static {v6, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v33

    .line 1889
    sget-object v0, LA0/Y;->l:Ljava/util/List;

    .line 1890
    .line 1891
    invoke-static {v6, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v34

    .line 1895
    sget-object v0, LA0/Y;->m:Ljava/util/List;

    .line 1896
    .line 1897
    invoke-static {v6, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v35

    .line 1901
    sget-object v0, LA0/Y;->n:Ljava/util/List;

    .line 1902
    .line 1903
    invoke-static {v6, v0}, LA0/Y;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v36

    .line 1907
    new-instance v21, LA0/W;

    .line 1908
    .line 1909
    invoke-direct/range {v21 .. v38}, LA0/W;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 1910
    .line 1911
    .line 1912
    move-object/from16 v0, v23

    .line 1913
    .line 1914
    const/4 v12, 0x0

    .line 1915
    const/16 v14, 0x3e

    .line 1916
    .line 1917
    const-string v10, ","

    .line 1918
    .line 1919
    const/4 v11, 0x0

    .line 1920
    const/4 v13, 0x0

    .line 1921
    move-object/from16 v9, v22

    .line 1922
    .line 1923
    invoke-static/range {v9 .. v14}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v1

    .line 1927
    const-string v2, "timeline="

    .line 1928
    .line 1929
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v1

    .line 1933
    invoke-static {v0, v3}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v4

    .line 1937
    const/4 v7, 0x0

    .line 1938
    const/16 v9, 0x3e

    .line 1939
    .line 1940
    const-string v5, ","

    .line 1941
    .line 1942
    const/4 v6, 0x0

    .line 1943
    const/4 v8, 0x0

    .line 1944
    invoke-static/range {v4 .. v9}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v2

    .line 1948
    const-string v3, "provider="

    .line 1949
    .line 1950
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v2

    .line 1954
    const/4 v12, 0x0

    .line 1955
    const/16 v14, 0x3e

    .line 1956
    .line 1957
    const-string v10, ","

    .line 1958
    .line 1959
    const/4 v11, 0x0

    .line 1960
    const/4 v13, 0x0

    .line 1961
    move-object/from16 v9, v24

    .line 1962
    .line 1963
    invoke-static/range {v9 .. v14}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v3

    .line 1967
    const-string v4, "detail="

    .line 1968
    .line 1969
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v3

    .line 1973
    const/4 v12, 0x0

    .line 1974
    const/16 v14, 0x3e

    .line 1975
    .line 1976
    const-string v10, ","

    .line 1977
    .line 1978
    const/4 v11, 0x0

    .line 1979
    const/4 v13, 0x0

    .line 1980
    move-object/from16 v9, v25

    .line 1981
    .line 1982
    invoke-static/range {v9 .. v14}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v4

    .line 1986
    const-string v5, "selfAdapter="

    .line 1987
    .line 1988
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v4

    .line 1992
    const-string v5, "sns dexkit resolved"

    .line 1993
    .line 1994
    filled-new-array {v5, v1, v2, v3, v4}, [Ljava/lang/Object;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v1

    .line 1998
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1999
    .line 2000
    .line 2001
    invoke-interface/range {v22 .. v22}, Ljava/util/Collection;->isEmpty()Z

    .line 2002
    .line 2003
    .line 2004
    move-result v1

    .line 2005
    if-eqz v1, :cond_41

    .line 2006
    .line 2007
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 2008
    .line 2009
    .line 2010
    move-result v0

    .line 2011
    if-eqz v0, :cond_41

    .line 2012
    .line 2013
    invoke-interface/range {v24 .. v24}, Ljava/util/Collection;->isEmpty()Z

    .line 2014
    .line 2015
    .line 2016
    move-result v0

    .line 2017
    if-eqz v0, :cond_41

    .line 2018
    .line 2019
    invoke-interface/range {v25 .. v25}, Ljava/util/Collection;->isEmpty()Z

    .line 2020
    .line 2021
    .line 2022
    move-result v0

    .line 2023
    if-nez v0, :cond_40

    .line 2024
    .line 2025
    goto :goto_31

    .line 2026
    :cond_40
    const/16 v21, 0x0

    .line 2027
    .line 2028
    :cond_41
    :goto_31
    return-object v21
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    .line 1
    const/4 v5, 0x0

    .line 2
    const-string v6, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI"

    .line 3
    .line 4
    const/4 v9, 0x1

    .line 5
    move-object/from16 v10, p1

    .line 6
    .line 7
    check-cast v10, Lorg/luckypray/dexkit/DexKitBridge;

    .line 8
    .line 9
    const-string v0, "bridge"

    .line 10
    .line 11
    invoke-static {v10, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object/from16 v11, p0

    .line 15
    .line 16
    iget-object v0, v11, LA0/h;->b:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 19
    .line 20
    .line 21
    move-result-object v12

    .line 22
    const-string v0, "getClassLoader(...)"

    .line 23
    .line 24
    invoke-static {v12, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v13, "sort_by_file_size_chat_history"

    .line 28
    .line 29
    new-instance v14, Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    invoke-direct {v14}, Ljava/util/LinkedHashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v0, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI"

    .line 35
    .line 36
    filled-new-array {v6, v0}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v15

    .line 48
    :cond_0
    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/16 v16, 0x4

    .line 53
    .line 54
    const-string v8, "getDeclaredFields(...)"

    .line 55
    .line 56
    const/16 v17, 0x0

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/lang/String;

    .line 65
    .line 66
    :try_start_0
    invoke-static {v0, v5, v12}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    const/16 v18, 0xa

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    const/16 v18, 0xa

    .line 75
    .line 76
    new-instance v3, LE0/d;

    .line 77
    .line 78
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    move-object v0, v3

    .line 82
    :goto_1
    nop

    .line 83
    instance-of v3, v0, LE0/d;

    .line 84
    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_1
    move-object/from16 v17, v0

    .line 89
    .line 90
    :goto_2
    check-cast v17, Ljava/lang/Class;

    .line 91
    .line 92
    if-nez v17, :cond_2

    .line 93
    .line 94
    const/16 v19, 0x8

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    new-instance v3, Ljava/util/ArrayList;

    .line 105
    .line 106
    array-length v8, v0

    .line 107
    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    array-length v8, v0

    .line 111
    move v1, v5

    .line 112
    :goto_3
    if-ge v1, v8, :cond_3

    .line 113
    .line 114
    aget-object v17, v0, v1

    .line 115
    .line 116
    const/16 v19, 0x8

    .line 117
    .line 118
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    add-int/2addr v1, v9

    .line 126
    goto :goto_3

    .line 127
    :cond_3
    const/16 v19, 0x8

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :cond_4
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_0

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    move-object v3, v1

    .line 144
    check-cast v3, Ljava/lang/Class;

    .line 145
    .line 146
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v3}, LA0/g;->F(Ljava/lang/Class;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-nez v3, :cond_4

    .line 154
    .line 155
    invoke-interface {v14, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_5
    const/16 v18, 0xa

    .line 160
    .line 161
    const/16 v19, 0x8

    .line 162
    .line 163
    invoke-static {v14}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    const-string v3, "getItem"

    .line 176
    .line 177
    if-eqz v1, :cond_b

    .line 178
    .line 179
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Ljava/lang/Class;

    .line 184
    .line 185
    invoke-static {v1}, LA0/g;->p(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    new-instance v4, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    :cond_7
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    if-eqz v15, :cond_8

    .line 203
    .line 204
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v15

    .line 208
    move-object/from16 v20, v15

    .line 209
    .line 210
    check-cast v20, Ljava/lang/reflect/Method;

    .line 211
    .line 212
    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_7

    .line 221
    .line 222
    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    array-length v2, v2

    .line 227
    if-ne v2, v9, :cond_7

    .line 228
    .line 229
    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-static {v4}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-eqz v3, :cond_9

    .line 251
    .line 252
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    check-cast v3, Ljava/lang/reflect/Method;

    .line 257
    .line 258
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    :cond_a
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_6

    .line 275
    .line 276
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    move-object v3, v2

    .line 281
    check-cast v3, Ljava/lang/Class;

    .line 282
    .line 283
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    invoke-static {v3}, LA0/g;->F(Ljava/lang/Class;)Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    if-nez v3, :cond_a

    .line 291
    .line 292
    invoke-interface {v14, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_b
    invoke-static {v14}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    new-instance v0, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-static {v1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-eqz v4, :cond_c

    .line 318
    .line 319
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    check-cast v4, Ljava/lang/Class;

    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_c
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    const-string v34, "cv1"

    .line 338
    .line 339
    const-string v35, "dv1"

    .line 340
    .line 341
    const-string v22, "com.tencent.mm.plugin.clean"

    .line 342
    .line 343
    const-string v23, "com.tencent.mm.ui.vas"

    .line 344
    .line 345
    const-string v24, "wp1"

    .line 346
    .line 347
    const-string v25, "vp1"

    .line 348
    .line 349
    const-string v26, "up1"

    .line 350
    .line 351
    const-string v27, "tp1"

    .line 352
    .line 353
    const-string v28, "xs1"

    .line 354
    .line 355
    const-string v29, "bu1"

    .line 356
    .line 357
    const-string v30, "zu1"

    .line 358
    .line 359
    const-string v31, "cw1"

    .line 360
    .line 361
    const-string v32, "av1"

    .line 362
    .line 363
    const-string v33, "bv1"

    .line 364
    .line 365
    const-string v36, "ew1"

    .line 366
    .line 367
    const-string v37, "fw1"

    .line 368
    .line 369
    filled-new-array/range {v22 .. v37}, [Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    const-string v32, ".a"

    .line 374
    .line 375
    const-string v33, "a"

    .line 376
    .line 377
    const-string v22, "clean"

    .line 378
    .line 379
    const-string v23, "Clean"

    .line 380
    .line 381
    const-string v24, "Chatting"

    .line 382
    .line 383
    const-string v25, "fileindex"

    .line 384
    .line 385
    const-string v26, "BaseAdapter"

    .line 386
    .line 387
    const-string v27, "ListAdapter"

    .line 388
    .line 389
    const-string v28, "s2"

    .line 390
    .line 391
    const-string v29, "u2"

    .line 392
    .line 393
    const-string v30, "i2"

    .line 394
    .line 395
    const-string v31, "l4"

    .line 396
    .line 397
    const-string v34, ".c"

    .line 398
    .line 399
    const-string v35, "c"

    .line 400
    .line 401
    filled-new-array/range {v22 .. v35}, [Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    new-instance v14, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 412
    .line 413
    .line 414
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 415
    .line 416
    .line 417
    move-result-object v15

    .line 418
    :goto_9
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    sget-object v20, LF0/s;->a:LF0/s;

    .line 423
    .line 424
    if-eqz v0, :cond_f

    .line 425
    .line 426
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    check-cast v0, Ljava/lang/String;

    .line 431
    .line 432
    :try_start_1
    new-instance v7, LW0/a;

    .line 433
    .line 434
    invoke-direct {v7, v5}, LW0/a;-><init>(I)V

    .line 435
    .line 436
    .line 437
    const/16 v5, 0x10

    .line 438
    .line 439
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    check-cast v5, [Ljava/lang/String;

    .line 444
    .line 445
    invoke-virtual {v7, v5}, LW0/a;->Z([Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    new-instance v5, LZ0/a;

    .line 449
    .line 450
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 451
    .line 452
    .line 453
    move-object/from16 p1, v4

    .line 454
    .line 455
    const/4 v4, 0x0

    .line 456
    :try_start_2
    invoke-virtual {v5, v0, v9, v4}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 457
    .line 458
    .line 459
    iput-object v5, v7, LW0/a;->f:LD/h;

    .line 460
    .line 461
    invoke-virtual {v10, v7}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    new-instance v4, Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v5

    .line 478
    if-eqz v5, :cond_d

    .line 479
    .line 480
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    check-cast v5, Lb1/d;

    .line 485
    .line 486
    invoke-virtual {v5, v12}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 491
    .line 492
    .line 493
    goto :goto_a

    .line 494
    :catchall_1
    move-exception v0

    .line 495
    goto :goto_b

    .line 496
    :catchall_2
    move-exception v0

    .line 497
    move-object/from16 p1, v4

    .line 498
    .line 499
    :goto_b
    new-instance v4, LE0/d;

    .line 500
    .line 501
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 502
    .line 503
    .line 504
    :cond_d
    instance-of v0, v4, LE0/d;

    .line 505
    .line 506
    if-eqz v0, :cond_e

    .line 507
    .line 508
    goto :goto_c

    .line 509
    :cond_e
    move-object/from16 v20, v4

    .line 510
    .line 511
    :goto_c
    move-object/from16 v0, v20

    .line 512
    .line 513
    check-cast v0, Ljava/lang/Iterable;

    .line 514
    .line 515
    invoke-static {v0, v14}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 516
    .line 517
    .line 518
    move-object/from16 v4, p1

    .line 519
    .line 520
    const/4 v5, 0x0

    .line 521
    goto :goto_9

    .line 522
    :cond_f
    new-instance v0, Ljava/util/ArrayList;

    .line 523
    .line 524
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    const-string v7, "com.tencent.mm.plugin.clean"

    .line 536
    .line 537
    const/4 v14, 0x2

    .line 538
    if-eqz v5, :cond_12

    .line 539
    .line 540
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    move-object v15, v5

    .line 545
    check-cast v15, Ljava/lang/Class;

    .line 546
    .line 547
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v15

    .line 551
    const/4 v9, 0x0

    .line 552
    invoke-static {v15, v9, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 553
    .line 554
    .line 555
    move-result v7

    .line 556
    if-nez v7, :cond_11

    .line 557
    .line 558
    const-string v7, "com.tencent.mm.ui.vas"

    .line 559
    .line 560
    invoke-static {v15, v9, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 561
    .line 562
    .line 563
    move-result v7

    .line 564
    if-nez v7, :cond_11

    .line 565
    .line 566
    invoke-static {v15}, LU0/i;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v7

    .line 570
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 571
    .line 572
    .line 573
    move-result v7

    .line 574
    if-gt v14, v7, :cond_10

    .line 575
    .line 576
    const/4 v9, 0x5

    .line 577
    if-ge v7, v9, :cond_10

    .line 578
    .line 579
    goto :goto_f

    .line 580
    :cond_10
    :goto_e
    const/4 v9, 0x1

    .line 581
    goto :goto_d

    .line 582
    :cond_11
    :goto_f
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    goto :goto_e

    .line 586
    :cond_12
    new-instance v4, Ljava/util/HashSet;

    .line 587
    .line 588
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 589
    .line 590
    .line 591
    new-instance v5, Ljava/util/ArrayList;

    .line 592
    .line 593
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    :cond_13
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 601
    .line 602
    .line 603
    move-result v9

    .line 604
    if-eqz v9, :cond_14

    .line 605
    .line 606
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v9

    .line 610
    move-object v15, v9

    .line 611
    check-cast v15, Ljava/lang/Class;

    .line 612
    .line 613
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v15

    .line 617
    invoke-virtual {v4, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v15

    .line 621
    if-eqz v15, :cond_13

    .line 622
    .line 623
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    goto :goto_10

    .line 627
    :cond_14
    const/16 v0, 0x4b0

    .line 628
    .line 629
    invoke-static {v5, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-static {v1, v0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    new-instance v1, Ljava/util/HashSet;

    .line 638
    .line 639
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 640
    .line 641
    .line 642
    new-instance v4, Ljava/util/ArrayList;

    .line 643
    .line 644
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    :cond_15
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 652
    .line 653
    .line 654
    move-result v5

    .line 655
    if-eqz v5, :cond_16

    .line 656
    .line 657
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    move-object v9, v5

    .line 662
    check-cast v9, Ljava/lang/Class;

    .line 663
    .line 664
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v9

    .line 668
    invoke-virtual {v1, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v9

    .line 672
    if-eqz v9, :cond_15

    .line 673
    .line 674
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    goto :goto_11

    .line 678
    :cond_16
    new-instance v0, Ljava/util/ArrayList;

    .line 679
    .line 680
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v5

    .line 691
    const-string v15, "getParameterTypes(...)"

    .line 692
    .line 693
    if-eqz v5, :cond_23

    .line 694
    .line 695
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v5

    .line 699
    move/from16 p1, v14

    .line 700
    .line 701
    move-object v14, v5

    .line 702
    check-cast v14, Ljava/lang/Class;

    .line 703
    .line 704
    const-class v9, Landroid/widget/ListAdapter;

    .line 705
    .line 706
    invoke-virtual {v9, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 707
    .line 708
    .line 709
    move-result v9

    .line 710
    if-nez v9, :cond_17

    .line 711
    .line 712
    move-object/from16 v26, v1

    .line 713
    .line 714
    move-object/from16 v28, v4

    .line 715
    .line 716
    goto/16 :goto_19

    .line 717
    .line 718
    :cond_17
    invoke-static {v14}, LA0/g;->p(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 719
    .line 720
    .line 721
    move-result-object v9

    .line 722
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 723
    .line 724
    .line 725
    move-result v14

    .line 726
    move-object/from16 v26, v1

    .line 727
    .line 728
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 729
    .line 730
    if-eqz v14, :cond_19

    .line 731
    .line 732
    :cond_18
    move-object/from16 v28, v4

    .line 733
    .line 734
    move-object/from16 v29, v9

    .line 735
    .line 736
    const/4 v4, 0x0

    .line 737
    goto :goto_14

    .line 738
    :cond_19
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 739
    .line 740
    .line 741
    move-result-object v14

    .line 742
    :goto_13
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 743
    .line 744
    .line 745
    move-result v27

    .line 746
    if-eqz v27, :cond_18

    .line 747
    .line 748
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v27

    .line 752
    check-cast v27, Ljava/lang/reflect/Method;

    .line 753
    .line 754
    move-object/from16 v28, v4

    .line 755
    .line 756
    invoke-virtual/range {v27 .. v27}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    move-object/from16 v29, v9

    .line 761
    .line 762
    const-string v9, "getCount"

    .line 763
    .line 764
    invoke-static {v4, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v4

    .line 768
    if-eqz v4, :cond_1a

    .line 769
    .line 770
    invoke-virtual/range {v27 .. v27}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    move-result-object v4

    .line 774
    invoke-static {v4, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    array-length v4, v4

    .line 778
    if-nez v4, :cond_1a

    .line 779
    .line 780
    invoke-virtual/range {v27 .. v27}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    move-result-object v4

    .line 784
    invoke-static {v4, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v4

    .line 788
    if-eqz v4, :cond_1a

    .line 789
    .line 790
    const/4 v4, 0x1

    .line 791
    goto :goto_14

    .line 792
    :cond_1a
    move-object/from16 v4, v28

    .line 793
    .line 794
    move-object/from16 v9, v29

    .line 795
    .line 796
    goto :goto_13

    .line 797
    :goto_14
    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->isEmpty()Z

    .line 798
    .line 799
    .line 800
    move-result v9

    .line 801
    if-eqz v9, :cond_1c

    .line 802
    .line 803
    :cond_1b
    move/from16 v27, v4

    .line 804
    .line 805
    const/4 v4, 0x0

    .line 806
    goto :goto_16

    .line 807
    :cond_1c
    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 808
    .line 809
    .line 810
    move-result-object v9

    .line 811
    :goto_15
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 812
    .line 813
    .line 814
    move-result v14

    .line 815
    if-eqz v14, :cond_1b

    .line 816
    .line 817
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v14

    .line 821
    check-cast v14, Ljava/lang/reflect/Method;

    .line 822
    .line 823
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v15

    .line 827
    invoke-static {v15, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    move-result v15

    .line 831
    if-eqz v15, :cond_1d

    .line 832
    .line 833
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    move-result-object v15

    .line 837
    array-length v15, v15

    .line 838
    move/from16 v27, v4

    .line 839
    .line 840
    const/4 v4, 0x1

    .line 841
    if-ne v15, v4, :cond_1e

    .line 842
    .line 843
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    move-result-object v4

    .line 847
    const/16 v23, 0x0

    .line 848
    .line 849
    aget-object v4, v4, v23

    .line 850
    .line 851
    invoke-static {v4, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v4

    .line 855
    if-eqz v4, :cond_1e

    .line 856
    .line 857
    const/4 v4, 0x1

    .line 858
    goto :goto_16

    .line 859
    :cond_1d
    move/from16 v27, v4

    .line 860
    .line 861
    :cond_1e
    move/from16 v4, v27

    .line 862
    .line 863
    goto :goto_15

    .line 864
    :goto_16
    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->isEmpty()Z

    .line 865
    .line 866
    .line 867
    move-result v9

    .line 868
    if-eqz v9, :cond_20

    .line 869
    .line 870
    :cond_1f
    move/from16 v29, v4

    .line 871
    .line 872
    const/4 v1, 0x0

    .line 873
    goto :goto_18

    .line 874
    :cond_20
    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 875
    .line 876
    .line 877
    move-result-object v9

    .line 878
    :goto_17
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 879
    .line 880
    .line 881
    move-result v14

    .line 882
    if-eqz v14, :cond_1f

    .line 883
    .line 884
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v14

    .line 888
    check-cast v14, Ljava/lang/reflect/Method;

    .line 889
    .line 890
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v15

    .line 894
    move/from16 v29, v4

    .line 895
    .line 896
    const-string v4, "getView"

    .line 897
    .line 898
    invoke-static {v15, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 899
    .line 900
    .line 901
    move-result v4

    .line 902
    if-eqz v4, :cond_21

    .line 903
    .line 904
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    move-result-object v4

    .line 908
    array-length v4, v4

    .line 909
    const/4 v15, 0x3

    .line 910
    if-ne v4, v15, :cond_21

    .line 911
    .line 912
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    move-result-object v4

    .line 916
    const/16 v23, 0x0

    .line 917
    .line 918
    aget-object v4, v4, v23

    .line 919
    .line 920
    invoke-static {v4, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    move-result v4

    .line 924
    if-eqz v4, :cond_21

    .line 925
    .line 926
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 927
    .line 928
    .line 929
    move-result-object v4

    .line 930
    const/16 v24, 0x1

    .line 931
    .line 932
    aget-object v4, v4, v24

    .line 933
    .line 934
    const-class v15, Landroid/view/View;

    .line 935
    .line 936
    invoke-virtual {v15, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 937
    .line 938
    .line 939
    move-result v4

    .line 940
    if-eqz v4, :cond_21

    .line 941
    .line 942
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    move-result-object v4

    .line 946
    aget-object v4, v4, p1

    .line 947
    .line 948
    const-class v14, Landroid/view/ViewGroup;

    .line 949
    .line 950
    invoke-virtual {v14, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 951
    .line 952
    .line 953
    move-result v4

    .line 954
    if-eqz v4, :cond_21

    .line 955
    .line 956
    const/4 v1, 0x1

    .line 957
    goto :goto_18

    .line 958
    :cond_21
    move/from16 v4, v29

    .line 959
    .line 960
    goto :goto_17

    .line 961
    :goto_18
    if-eqz v27, :cond_22

    .line 962
    .line 963
    if-eqz v29, :cond_22

    .line 964
    .line 965
    if-eqz v1, :cond_22

    .line 966
    .line 967
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    :cond_22
    :goto_19
    move/from16 v14, p1

    .line 971
    .line 972
    move-object/from16 v1, v26

    .line 973
    .line 974
    move-object/from16 v4, v28

    .line 975
    .line 976
    goto/16 :goto_12

    .line 977
    .line 978
    :cond_23
    move-object/from16 v28, v4

    .line 979
    .line 980
    new-instance v1, Ljava/util/ArrayList;

    .line 981
    .line 982
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 983
    .line 984
    .line 985
    move-result v4

    .line 986
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 994
    .line 995
    .line 996
    move-result v4

    .line 997
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 998
    .line 999
    if-eqz v4, :cond_2f

    .line 1000
    .line 1001
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v4

    .line 1005
    check-cast v4, Ljava/lang/Class;

    .line 1006
    .line 1007
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v9

    .line 1011
    const/4 v14, 0x0

    .line 1012
    invoke-static {v9, v14, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v26

    .line 1016
    if-eqz v26, :cond_24

    .line 1017
    .line 1018
    move/from16 v14, v19

    .line 1019
    .line 1020
    :goto_1b
    move-object/from16 p1, v0

    .line 1021
    .line 1022
    goto :goto_1c

    .line 1023
    :cond_24
    const/4 v14, 0x0

    .line 1024
    goto :goto_1b

    .line 1025
    :goto_1c
    invoke-static {v9}, LU0/i;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    const-string v26, "[a-z]{1,2}\\d?"

    .line 1030
    .line 1031
    move-object/from16 v27, v7

    .line 1032
    .line 1033
    invoke-static/range {v26 .. v26}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v7

    .line 1037
    move-object/from16 v26, v9

    .line 1038
    .line 1039
    const-string v9, "compile(...)"

    .line 1040
    .line 1041
    invoke-static {v7, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v7, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v0

    .line 1052
    if-eqz v0, :cond_25

    .line 1053
    .line 1054
    add-int/lit8 v14, v14, 0x4

    .line 1055
    .line 1056
    :cond_25
    const-string v0, "s2"

    .line 1057
    .line 1058
    const-string v7, "u2"

    .line 1059
    .line 1060
    filled-new-array {v0, v7}, [Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    invoke-static {v0}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    invoke-static/range {v26 .. v26}, LU0/i;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v7

    .line 1072
    invoke-interface {v0, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v0

    .line 1076
    if-eqz v0, :cond_26

    .line 1077
    .line 1078
    add-int/lit8 v14, v14, 0xa

    .line 1079
    .line 1080
    :cond_26
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v0

    .line 1084
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1085
    .line 1086
    .line 1087
    array-length v7, v0

    .line 1088
    const/4 v9, 0x0

    .line 1089
    :goto_1d
    if-ge v9, v7, :cond_29

    .line 1090
    .line 1091
    aget-object v26, v0, v9

    .line 1092
    .line 1093
    invoke-virtual/range {v26 .. v26}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v29

    .line 1097
    move-object/from16 v30, v0

    .line 1098
    .line 1099
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    move/from16 v29, v7

    .line 1104
    .line 1105
    const-string v7, "Sparse"

    .line 1106
    .line 1107
    move/from16 v31, v9

    .line 1108
    .line 1109
    const/4 v9, 0x0

    .line 1110
    invoke-static {v0, v7, v9}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v0

    .line 1114
    if-nez v0, :cond_28

    .line 1115
    .line 1116
    const-class v0, Ljava/util/List;

    .line 1117
    .line 1118
    invoke-virtual/range {v26 .. v26}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v7

    .line 1122
    invoke-virtual {v0, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v0

    .line 1126
    if-eqz v0, :cond_27

    .line 1127
    .line 1128
    goto :goto_1e

    .line 1129
    :cond_27
    const/16 v24, 0x1

    .line 1130
    .line 1131
    add-int/lit8 v9, v31, 0x1

    .line 1132
    .line 1133
    move/from16 v7, v29

    .line 1134
    .line 1135
    move-object/from16 v0, v30

    .line 1136
    .line 1137
    goto :goto_1d

    .line 1138
    :cond_28
    :goto_1e
    add-int/lit8 v14, v14, 0x4

    .line 1139
    .line 1140
    :cond_29
    invoke-static {v4}, LA0/g;->p(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v0

    .line 1144
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1145
    .line 1146
    .line 1147
    move-result v7

    .line 1148
    if-eqz v7, :cond_2a

    .line 1149
    .line 1150
    goto :goto_20

    .line 1151
    :cond_2a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1156
    .line 1157
    .line 1158
    move-result v7

    .line 1159
    if-eqz v7, :cond_2d

    .line 1160
    .line 1161
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v7

    .line 1165
    check-cast v7, Ljava/lang/reflect/Method;

    .line 1166
    .line 1167
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v9

    .line 1171
    invoke-static {v9, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v9

    .line 1175
    if-eqz v9, :cond_2b

    .line 1176
    .line 1177
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v9

    .line 1181
    move-object/from16 v26, v0

    .line 1182
    .line 1183
    const-class v0, Ljava/lang/Object;

    .line 1184
    .line 1185
    invoke-static {v9, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1186
    .line 1187
    .line 1188
    move-result v0

    .line 1189
    if-nez v0, :cond_2c

    .line 1190
    .line 1191
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    invoke-static {v0, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1196
    .line 1197
    .line 1198
    move-result v0

    .line 1199
    if-nez v0, :cond_2c

    .line 1200
    .line 1201
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v0

    .line 1205
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    const-string v7, "java."

    .line 1210
    .line 1211
    const/4 v9, 0x0

    .line 1212
    invoke-static {v0, v9, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1213
    .line 1214
    .line 1215
    move-result v0

    .line 1216
    if-nez v0, :cond_2c

    .line 1217
    .line 1218
    add-int/lit8 v14, v14, 0x8

    .line 1219
    .line 1220
    goto :goto_20

    .line 1221
    :cond_2b
    move-object/from16 v26, v0

    .line 1222
    .line 1223
    :cond_2c
    move-object/from16 v0, v26

    .line 1224
    .line 1225
    goto :goto_1f

    .line 1226
    :cond_2d
    :goto_20
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1231
    .line 1232
    .line 1233
    move-result v0

    .line 1234
    if-eqz v0, :cond_2e

    .line 1235
    .line 1236
    const/16 v0, 0x1e

    .line 1237
    .line 1238
    goto :goto_21

    .line 1239
    :cond_2e
    const/4 v0, 0x0

    .line 1240
    :goto_21
    add-int/2addr v14, v0

    .line 1241
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    new-instance v5, LE0/c;

    .line 1246
    .line 1247
    invoke-direct {v5, v4, v0}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1251
    .line 1252
    .line 1253
    move-object/from16 v0, p1

    .line 1254
    .line 1255
    move-object/from16 v7, v27

    .line 1256
    .line 1257
    goto/16 :goto_1a

    .line 1258
    .line 1259
    :cond_2f
    new-instance v0, Ljava/util/ArrayList;

    .line 1260
    .line 1261
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v1

    .line 1268
    :cond_30
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1269
    .line 1270
    .line 1271
    move-result v2

    .line 1272
    if-eqz v2, :cond_31

    .line 1273
    .line 1274
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v2

    .line 1278
    move-object v4, v2

    .line 1279
    check-cast v4, LE0/c;

    .line 1280
    .line 1281
    iget-object v4, v4, LE0/c;->b:Ljava/lang/Object;

    .line 1282
    .line 1283
    check-cast v4, Ljava/lang/Number;

    .line 1284
    .line 1285
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1286
    .line 1287
    .line 1288
    move-result v4

    .line 1289
    if-lez v4, :cond_30

    .line 1290
    .line 1291
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1292
    .line 1293
    .line 1294
    goto :goto_22

    .line 1295
    :cond_31
    new-instance v1, LA0/e;

    .line 1296
    .line 1297
    const/16 v2, 0xc

    .line 1298
    .line 1299
    invoke-direct {v1, v2}, LA0/e;-><init>(I)V

    .line 1300
    .line 1301
    .line 1302
    new-instance v2, LA0/f;

    .line 1303
    .line 1304
    const/16 v4, 0xd

    .line 1305
    .line 1306
    invoke-direct {v2, v4, v1}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 1307
    .line 1308
    .line 1309
    invoke-static {v0, v2}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    new-instance v1, Ljava/util/ArrayList;

    .line 1314
    .line 1315
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1316
    .line 1317
    .line 1318
    move-result v2

    .line 1319
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1320
    .line 1321
    .line 1322
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1327
    .line 1328
    .line 1329
    move-result v2

    .line 1330
    if-eqz v2, :cond_32

    .line 1331
    .line 1332
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v2

    .line 1336
    check-cast v2, LE0/c;

    .line 1337
    .line 1338
    iget-object v2, v2, LE0/c;->a:Ljava/lang/Object;

    .line 1339
    .line 1340
    check-cast v2, Ljava/lang/Class;

    .line 1341
    .line 1342
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1343
    .line 1344
    .line 1345
    goto :goto_23

    .line 1346
    :cond_32
    new-instance v0, Ljava/util/HashSet;

    .line 1347
    .line 1348
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1349
    .line 1350
    .line 1351
    new-instance v2, Ljava/util/ArrayList;

    .line 1352
    .line 1353
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v1

    .line 1360
    :cond_33
    :goto_24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1361
    .line 1362
    .line 1363
    move-result v4

    .line 1364
    if-eqz v4, :cond_34

    .line 1365
    .line 1366
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v4

    .line 1370
    move-object v7, v4

    .line 1371
    check-cast v7, Ljava/lang/Class;

    .line 1372
    .line 1373
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v7

    .line 1377
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v7

    .line 1381
    if-eqz v7, :cond_33

    .line 1382
    .line 1383
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1384
    .line 1385
    .line 1386
    goto :goto_24

    .line 1387
    :cond_34
    new-instance v0, Ljava/util/ArrayList;

    .line 1388
    .line 1389
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v1

    .line 1396
    :goto_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1397
    .line 1398
    .line 1399
    move-result v4

    .line 1400
    if-eqz v4, :cond_42

    .line 1401
    .line 1402
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v4

    .line 1406
    check-cast v4, Ljava/lang/Class;

    .line 1407
    .line 1408
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 1409
    .line 1410
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1411
    .line 1412
    .line 1413
    invoke-static {v4}, LA0/g;->p(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v9

    .line 1417
    new-instance v14, Ljava/util/ArrayList;

    .line 1418
    .line 1419
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v9

    .line 1426
    :goto_26
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1427
    .line 1428
    .line 1429
    move-result v26

    .line 1430
    if-eqz v26, :cond_37

    .line 1431
    .line 1432
    move-object/from16 p1, v1

    .line 1433
    .line 1434
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v1

    .line 1438
    move-object/from16 v26, v1

    .line 1439
    .line 1440
    check-cast v26, Ljava/lang/reflect/Method;

    .line 1441
    .line 1442
    move-object/from16 v27, v2

    .line 1443
    .line 1444
    invoke-virtual/range {v26 .. v26}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v2

    .line 1448
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1449
    .line 1450
    .line 1451
    move-result v2

    .line 1452
    if-eqz v2, :cond_36

    .line 1453
    .line 1454
    invoke-virtual/range {v26 .. v26}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v2

    .line 1458
    array-length v2, v2

    .line 1459
    move-object/from16 v26, v3

    .line 1460
    .line 1461
    const/4 v3, 0x1

    .line 1462
    if-ne v2, v3, :cond_35

    .line 1463
    .line 1464
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1465
    .line 1466
    .line 1467
    :cond_35
    :goto_27
    move-object/from16 v1, p1

    .line 1468
    .line 1469
    move-object/from16 v3, v26

    .line 1470
    .line 1471
    move-object/from16 v2, v27

    .line 1472
    .line 1473
    goto :goto_26

    .line 1474
    :cond_36
    move-object/from16 v26, v3

    .line 1475
    .line 1476
    goto :goto_27

    .line 1477
    :cond_37
    move-object/from16 p1, v1

    .line 1478
    .line 1479
    move-object/from16 v27, v2

    .line 1480
    .line 1481
    move-object/from16 v26, v3

    .line 1482
    .line 1483
    new-instance v1, Ljava/util/ArrayList;

    .line 1484
    .line 1485
    invoke-static {v14}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1486
    .line 1487
    .line 1488
    move-result v2

    .line 1489
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1490
    .line 1491
    .line 1492
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v2

    .line 1496
    :goto_28
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1497
    .line 1498
    .line 1499
    move-result v3

    .line 1500
    if-eqz v3, :cond_38

    .line 1501
    .line 1502
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v3

    .line 1506
    check-cast v3, Ljava/lang/reflect/Method;

    .line 1507
    .line 1508
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v3

    .line 1512
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1513
    .line 1514
    .line 1515
    goto :goto_28

    .line 1516
    :cond_38
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v1

    .line 1520
    :goto_29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1521
    .line 1522
    .line 1523
    move-result v2

    .line 1524
    if-eqz v2, :cond_3a

    .line 1525
    .line 1526
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v2

    .line 1530
    move-object v3, v2

    .line 1531
    check-cast v3, Ljava/lang/Class;

    .line 1532
    .line 1533
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 1534
    .line 1535
    .line 1536
    invoke-static {v3}, LA0/g;->O(Ljava/lang/Class;)I

    .line 1537
    .line 1538
    .line 1539
    move-result v3

    .line 1540
    move/from16 v9, v19

    .line 1541
    .line 1542
    if-lt v3, v9, :cond_39

    .line 1543
    .line 1544
    invoke-interface {v7, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1545
    .line 1546
    .line 1547
    const/16 v19, 0x8

    .line 1548
    .line 1549
    goto :goto_29

    .line 1550
    :cond_39
    move/from16 v19, v9

    .line 1551
    .line 1552
    goto :goto_29

    .line 1553
    :cond_3a
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v1

    .line 1557
    invoke-static {v1, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1558
    .line 1559
    .line 1560
    new-instance v2, Ljava/util/ArrayList;

    .line 1561
    .line 1562
    array-length v3, v1

    .line 1563
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1564
    .line 1565
    .line 1566
    array-length v3, v1

    .line 1567
    const/4 v9, 0x0

    .line 1568
    :goto_2a
    if-ge v9, v3, :cond_3b

    .line 1569
    .line 1570
    aget-object v14, v1, v9

    .line 1571
    .line 1572
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v14

    .line 1576
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1577
    .line 1578
    .line 1579
    const/16 v24, 0x1

    .line 1580
    .line 1581
    add-int/lit8 v9, v9, 0x1

    .line 1582
    .line 1583
    goto :goto_2a

    .line 1584
    :cond_3b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v1

    .line 1588
    :cond_3c
    :goto_2b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1589
    .line 1590
    .line 1591
    move-result v2

    .line 1592
    if-eqz v2, :cond_3d

    .line 1593
    .line 1594
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v2

    .line 1598
    move-object v3, v2

    .line 1599
    check-cast v3, Ljava/lang/Class;

    .line 1600
    .line 1601
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 1602
    .line 1603
    .line 1604
    invoke-static {v3}, LA0/g;->O(Ljava/lang/Class;)I

    .line 1605
    .line 1606
    .line 1607
    move-result v3

    .line 1608
    const/16 v9, 0x8

    .line 1609
    .line 1610
    if-lt v3, v9, :cond_3c

    .line 1611
    .line 1612
    invoke-interface {v7, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1613
    .line 1614
    .line 1615
    goto :goto_2b

    .line 1616
    :cond_3d
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v1

    .line 1620
    invoke-static {v1}, LU0/i;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v1

    .line 1624
    new-instance v2, Ljava/util/ArrayList;

    .line 1625
    .line 1626
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v3

    .line 1633
    :cond_3e
    :goto_2c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1634
    .line 1635
    .line 1636
    move-result v4

    .line 1637
    if-eqz v4, :cond_3f

    .line 1638
    .line 1639
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v4

    .line 1643
    move-object v9, v4

    .line 1644
    check-cast v9, Ljava/lang/Class;

    .line 1645
    .line 1646
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v9

    .line 1650
    invoke-static {v9}, LU0/i;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v9

    .line 1654
    invoke-virtual {v9, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1655
    .line 1656
    .line 1657
    move-result v9

    .line 1658
    if-eqz v9, :cond_3e

    .line 1659
    .line 1660
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1661
    .line 1662
    .line 1663
    goto :goto_2c

    .line 1664
    :cond_3f
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v1

    .line 1668
    :cond_40
    :goto_2d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1669
    .line 1670
    .line 1671
    move-result v2

    .line 1672
    if-eqz v2, :cond_41

    .line 1673
    .line 1674
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v2

    .line 1678
    move-object v3, v2

    .line 1679
    check-cast v3, Ljava/lang/Class;

    .line 1680
    .line 1681
    invoke-static {v3}, LA0/g;->O(Ljava/lang/Class;)I

    .line 1682
    .line 1683
    .line 1684
    move-result v3

    .line 1685
    const/16 v9, 0x8

    .line 1686
    .line 1687
    if-lt v3, v9, :cond_40

    .line 1688
    .line 1689
    invoke-interface {v7, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1690
    .line 1691
    .line 1692
    goto :goto_2d

    .line 1693
    :cond_41
    invoke-static {v7}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v1

    .line 1697
    new-instance v2, LA0/e;

    .line 1698
    .line 1699
    const/16 v3, 0xb

    .line 1700
    .line 1701
    invoke-direct {v2, v3}, LA0/e;-><init>(I)V

    .line 1702
    .line 1703
    .line 1704
    new-instance v3, LA0/f;

    .line 1705
    .line 1706
    const/16 v4, 0xc

    .line 1707
    .line 1708
    invoke-direct {v3, v4, v2}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 1709
    .line 1710
    .line 1711
    invoke-static {v1, v3}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v1

    .line 1715
    invoke-static {v1, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1716
    .line 1717
    .line 1718
    move-object/from16 v1, p1

    .line 1719
    .line 1720
    move-object/from16 v3, v26

    .line 1721
    .line 1722
    move-object/from16 v2, v27

    .line 1723
    .line 1724
    const/16 v19, 0x8

    .line 1725
    .line 1726
    goto/16 :goto_25

    .line 1727
    .line 1728
    :cond_42
    move-object/from16 v27, v2

    .line 1729
    .line 1730
    new-instance v1, Ljava/util/HashSet;

    .line 1731
    .line 1732
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1733
    .line 1734
    .line 1735
    new-instance v2, Ljava/util/ArrayList;

    .line 1736
    .line 1737
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v0

    .line 1744
    :cond_43
    :goto_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1745
    .line 1746
    .line 1747
    move-result v3

    .line 1748
    if-eqz v3, :cond_44

    .line 1749
    .line 1750
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v3

    .line 1754
    move-object v4, v3

    .line 1755
    check-cast v4, Ljava/lang/Class;

    .line 1756
    .line 1757
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v4

    .line 1761
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1762
    .line 1763
    .line 1764
    move-result v4

    .line 1765
    if-eqz v4, :cond_43

    .line 1766
    .line 1767
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1768
    .line 1769
    .line 1770
    goto :goto_2e

    .line 1771
    :cond_44
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1772
    .line 1773
    .line 1774
    move-result v0

    .line 1775
    if-eqz v0, :cond_48

    .line 1776
    .line 1777
    new-instance v0, Ljava/util/ArrayList;

    .line 1778
    .line 1779
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1780
    .line 1781
    .line 1782
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v1

    .line 1786
    :cond_45
    :goto_2f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1787
    .line 1788
    .line 1789
    move-result v2

    .line 1790
    if-eqz v2, :cond_46

    .line 1791
    .line 1792
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v2

    .line 1796
    move-object v3, v2

    .line 1797
    check-cast v3, Ljava/lang/Class;

    .line 1798
    .line 1799
    invoke-static {v3}, LA0/g;->O(Ljava/lang/Class;)I

    .line 1800
    .line 1801
    .line 1802
    move-result v3

    .line 1803
    const/16 v9, 0x8

    .line 1804
    .line 1805
    if-lt v3, v9, :cond_45

    .line 1806
    .line 1807
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1808
    .line 1809
    .line 1810
    goto :goto_2f

    .line 1811
    :cond_46
    new-instance v1, LA0/e;

    .line 1812
    .line 1813
    const/16 v4, 0xd

    .line 1814
    .line 1815
    invoke-direct {v1, v4}, LA0/e;-><init>(I)V

    .line 1816
    .line 1817
    .line 1818
    new-instance v2, LA0/f;

    .line 1819
    .line 1820
    const/16 v3, 0xe

    .line 1821
    .line 1822
    invoke-direct {v2, v3, v1}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 1823
    .line 1824
    .line 1825
    invoke-static {v0, v2}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v0

    .line 1829
    new-instance v1, Ljava/util/HashSet;

    .line 1830
    .line 1831
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1832
    .line 1833
    .line 1834
    new-instance v2, Ljava/util/ArrayList;

    .line 1835
    .line 1836
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1837
    .line 1838
    .line 1839
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v0

    .line 1843
    :cond_47
    :goto_30
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1844
    .line 1845
    .line 1846
    move-result v3

    .line 1847
    if-eqz v3, :cond_48

    .line 1848
    .line 1849
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v3

    .line 1853
    move-object v4, v3

    .line 1854
    check-cast v4, Ljava/lang/Class;

    .line 1855
    .line 1856
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v4

    .line 1860
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1861
    .line 1862
    .line 1863
    move-result v4

    .line 1864
    if-eqz v4, :cond_47

    .line 1865
    .line 1866
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1867
    .line 1868
    .line 1869
    goto :goto_30

    .line 1870
    :cond_48
    new-instance v0, Ljava/util/ArrayList;

    .line 1871
    .line 1872
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1873
    .line 1874
    .line 1875
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v1

    .line 1879
    :goto_31
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1880
    .line 1881
    .line 1882
    move-result v3

    .line 1883
    const-string v4, "getName(...)"

    .line 1884
    .line 1885
    const-string v7, "a"

    .line 1886
    .line 1887
    if-eqz v3, :cond_50

    .line 1888
    .line 1889
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1890
    .line 1891
    .line 1892
    move-result-object v3

    .line 1893
    check-cast v3, Ljava/lang/Class;

    .line 1894
    .line 1895
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v3

    .line 1899
    invoke-static {v3, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1900
    .line 1901
    .line 1902
    new-instance v9, Ljava/util/ArrayList;

    .line 1903
    .line 1904
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1905
    .line 1906
    .line 1907
    array-length v14, v3

    .line 1908
    move-object/from16 p1, v1

    .line 1909
    .line 1910
    const/4 v1, 0x0

    .line 1911
    :goto_32
    if-ge v1, v14, :cond_4b

    .line 1912
    .line 1913
    move/from16 v21, v1

    .line 1914
    .line 1915
    aget-object v1, v3, v21

    .line 1916
    .line 1917
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1918
    .line 1919
    .line 1920
    move-result v26

    .line 1921
    invoke-static/range {v26 .. v26}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1922
    .line 1923
    .line 1924
    move-result v26

    .line 1925
    if-nez v26, :cond_4a

    .line 1926
    .line 1927
    move-object/from16 v26, v2

    .line 1928
    .line 1929
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v2

    .line 1933
    move-object/from16 v28, v3

    .line 1934
    .line 1935
    const-class v3, Ljava/lang/String;

    .line 1936
    .line 1937
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1938
    .line 1939
    .line 1940
    move-result v2

    .line 1941
    if-eqz v2, :cond_49

    .line 1942
    .line 1943
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1944
    .line 1945
    .line 1946
    :cond_49
    :goto_33
    const/16 v24, 0x1

    .line 1947
    .line 1948
    goto :goto_34

    .line 1949
    :cond_4a
    move-object/from16 v26, v2

    .line 1950
    .line 1951
    move-object/from16 v28, v3

    .line 1952
    .line 1953
    goto :goto_33

    .line 1954
    :goto_34
    add-int/lit8 v1, v21, 0x1

    .line 1955
    .line 1956
    move-object/from16 v2, v26

    .line 1957
    .line 1958
    move-object/from16 v3, v28

    .line 1959
    .line 1960
    goto :goto_32

    .line 1961
    :cond_4b
    move-object/from16 v26, v2

    .line 1962
    .line 1963
    new-instance v1, Ljava/util/ArrayList;

    .line 1964
    .line 1965
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1966
    .line 1967
    .line 1968
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v2

    .line 1972
    :goto_35
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1973
    .line 1974
    .line 1975
    move-result v3

    .line 1976
    if-eqz v3, :cond_4e

    .line 1977
    .line 1978
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v3

    .line 1982
    move-object v14, v3

    .line 1983
    check-cast v14, Ljava/lang/reflect/Field;

    .line 1984
    .line 1985
    move-object/from16 v21, v2

    .line 1986
    .line 1987
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v2

    .line 1991
    invoke-static {v2, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1992
    .line 1993
    .line 1994
    move-result v2

    .line 1995
    if-nez v2, :cond_4d

    .line 1996
    .line 1997
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v2

    .line 2001
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2002
    .line 2003
    .line 2004
    invoke-virtual {v2, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 2005
    .line 2006
    .line 2007
    move-result v2

    .line 2008
    if-nez v2, :cond_4d

    .line 2009
    .line 2010
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v2

    .line 2014
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2015
    .line 2016
    .line 2017
    const-string v14, "user"

    .line 2018
    .line 2019
    move-object/from16 v28, v7

    .line 2020
    .line 2021
    const/4 v7, 0x1

    .line 2022
    invoke-static {v2, v14, v7}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 2023
    .line 2024
    .line 2025
    move-result v2

    .line 2026
    if-eqz v2, :cond_4c

    .line 2027
    .line 2028
    goto :goto_37

    .line 2029
    :cond_4c
    :goto_36
    move-object/from16 v2, v21

    .line 2030
    .line 2031
    move-object/from16 v7, v28

    .line 2032
    .line 2033
    goto :goto_35

    .line 2034
    :cond_4d
    move-object/from16 v28, v7

    .line 2035
    .line 2036
    :goto_37
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2037
    .line 2038
    .line 2039
    goto :goto_36

    .line 2040
    :cond_4e
    invoke-static {v1, v9}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v1

    .line 2044
    new-instance v2, Ljava/util/ArrayList;

    .line 2045
    .line 2046
    invoke-static {v1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2047
    .line 2048
    .line 2049
    move-result v3

    .line 2050
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2051
    .line 2052
    .line 2053
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v1

    .line 2057
    :goto_38
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2058
    .line 2059
    .line 2060
    move-result v3

    .line 2061
    if-eqz v3, :cond_4f

    .line 2062
    .line 2063
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2064
    .line 2065
    .line 2066
    move-result-object v3

    .line 2067
    check-cast v3, Ljava/lang/reflect/Field;

    .line 2068
    .line 2069
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v3

    .line 2073
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2074
    .line 2075
    .line 2076
    goto :goto_38

    .line 2077
    :cond_4f
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v1

    .line 2081
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v1

    .line 2085
    invoke-static {v1, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 2086
    .line 2087
    .line 2088
    move-object/from16 v1, p1

    .line 2089
    .line 2090
    move-object/from16 v2, v26

    .line 2091
    .line 2092
    goto/16 :goto_31

    .line 2093
    .line 2094
    :cond_50
    move-object/from16 v26, v2

    .line 2095
    .line 2096
    move-object/from16 v28, v7

    .line 2097
    .line 2098
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v0

    .line 2102
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v0

    .line 2106
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 2107
    .line 2108
    .line 2109
    move-result v1

    .line 2110
    if-eqz v1, :cond_51

    .line 2111
    .line 2112
    invoke-static/range {v28 .. v28}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v0

    .line 2116
    :cond_51
    move-object v1, v0

    .line 2117
    const/4 v9, 0x0

    .line 2118
    :try_start_3
    invoke-static {v6, v9, v12}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 2122
    goto :goto_39

    .line 2123
    :catchall_3
    move-exception v0

    .line 2124
    new-instance v2, LE0/d;

    .line 2125
    .line 2126
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 2127
    .line 2128
    .line 2129
    move-object v0, v2

    .line 2130
    :goto_39
    nop

    .line 2131
    instance-of v2, v0, LE0/d;

    .line 2132
    .line 2133
    if-eqz v2, :cond_52

    .line 2134
    .line 2135
    move-object/from16 v0, v17

    .line 2136
    .line 2137
    :cond_52
    check-cast v0, Ljava/lang/Class;

    .line 2138
    .line 2139
    if-nez v0, :cond_53

    .line 2140
    .line 2141
    move-object/from16 v2, v20

    .line 2142
    .line 2143
    goto/16 :goto_3c

    .line 2144
    .line 2145
    :cond_53
    invoke-static {v0}, LA0/g;->p(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v0

    .line 2149
    new-instance v2, Ljava/util/ArrayList;

    .line 2150
    .line 2151
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2152
    .line 2153
    .line 2154
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v0

    .line 2158
    :cond_54
    :goto_3a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2159
    .line 2160
    .line 2161
    move-result v3

    .line 2162
    if-eqz v3, :cond_56

    .line 2163
    .line 2164
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v3

    .line 2168
    move-object v6, v3

    .line 2169
    check-cast v6, Ljava/lang/reflect/Method;

    .line 2170
    .line 2171
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2172
    .line 2173
    .line 2174
    move-result-object v7

    .line 2175
    invoke-static {v7, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2176
    .line 2177
    .line 2178
    array-length v7, v7

    .line 2179
    if-nez v7, :cond_55

    .line 2180
    .line 2181
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v7

    .line 2185
    invoke-static {v7, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2186
    .line 2187
    .line 2188
    move-result v7

    .line 2189
    if-eqz v7, :cond_55

    .line 2190
    .line 2191
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2192
    .line 2193
    .line 2194
    move-result v7

    .line 2195
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 2196
    .line 2197
    .line 2198
    move-result v7

    .line 2199
    if-nez v7, :cond_55

    .line 2200
    .line 2201
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v7

    .line 2205
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 2206
    .line 2207
    .line 2208
    move-result v7

    .line 2209
    const/4 v8, 0x3

    .line 2210
    if-gt v7, v8, :cond_54

    .line 2211
    .line 2212
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v6

    .line 2216
    invoke-static {v6, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2217
    .line 2218
    .line 2219
    invoke-static {v6}, LU0/i;->l0(Ljava/lang/String;)Ljava/lang/Character;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v6

    .line 2223
    if-eqz v6, :cond_54

    .line 2224
    .line 2225
    invoke-virtual {v6}, Ljava/lang/Character;->charValue()C

    .line 2226
    .line 2227
    .line 2228
    move-result v6

    .line 2229
    invoke-static {v6}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 2230
    .line 2231
    .line 2232
    move-result v6

    .line 2233
    const/4 v7, 0x1

    .line 2234
    if-ne v6, v7, :cond_54

    .line 2235
    .line 2236
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2237
    .line 2238
    .line 2239
    goto :goto_3a

    .line 2240
    :cond_55
    const/4 v8, 0x3

    .line 2241
    goto :goto_3a

    .line 2242
    :cond_56
    new-instance v0, LA0/e;

    .line 2243
    .line 2244
    move/from16 v3, v18

    .line 2245
    .line 2246
    invoke-direct {v0, v3}, LA0/e;-><init>(I)V

    .line 2247
    .line 2248
    .line 2249
    new-instance v3, LA0/f;

    .line 2250
    .line 2251
    const/16 v4, 0xb

    .line 2252
    .line 2253
    invoke-direct {v3, v4, v0}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 2254
    .line 2255
    .line 2256
    invoke-static {v2, v3}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v0

    .line 2260
    new-instance v2, Ljava/util/ArrayList;

    .line 2261
    .line 2262
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2263
    .line 2264
    .line 2265
    move-result v3

    .line 2266
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2267
    .line 2268
    .line 2269
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2270
    .line 2271
    .line 2272
    move-result-object v0

    .line 2273
    :goto_3b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2274
    .line 2275
    .line 2276
    move-result v3

    .line 2277
    if-eqz v3, :cond_57

    .line 2278
    .line 2279
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v3

    .line 2283
    check-cast v3, Ljava/lang/reflect/Method;

    .line 2284
    .line 2285
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2286
    .line 2287
    .line 2288
    move-result-object v3

    .line 2289
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2290
    .line 2291
    .line 2292
    goto :goto_3b

    .line 2293
    :cond_57
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v0

    .line 2297
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2298
    .line 2299
    .line 2300
    move-result-object v0

    .line 2301
    move-object v2, v0

    .line 2302
    :goto_3c
    :try_start_4
    new-instance v0, LW0/a;

    .line 2303
    .line 2304
    const/4 v7, 0x1

    .line 2305
    invoke-direct {v0, v7}, LW0/a;-><init>(I)V

    .line 2306
    .line 2307
    .line 2308
    new-instance v3, LZ0/b;

    .line 2309
    .line 2310
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 2311
    .line 2312
    .line 2313
    filled-new-array {v13}, [Ljava/lang/String;

    .line 2314
    .line 2315
    .line 2316
    move-result-object v4

    .line 2317
    invoke-virtual {v3, v4}, LZ0/b;->d0([Ljava/lang/String;)V

    .line 2318
    .line 2319
    .line 2320
    iput-object v3, v0, LW0/a;->f:LD/h;

    .line 2321
    .line 2322
    invoke-virtual {v10, v0}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v0

    .line 2326
    new-instance v3, Ljava/util/ArrayList;

    .line 2327
    .line 2328
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2329
    .line 2330
    .line 2331
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v0

    .line 2335
    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2336
    .line 2337
    .line 2338
    move-result v4

    .line 2339
    if-eqz v4, :cond_5c

    .line 2340
    .line 2341
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2342
    .line 2343
    .line 2344
    move-result-object v4

    .line 2345
    check-cast v4, Lb1/j;

    .line 2346
    .line 2347
    iget-object v4, v4, Lb1/j;->e:LE0/f;

    .line 2348
    .line 2349
    invoke-virtual {v4}, LE0/f;->a()Ljava/lang/Object;

    .line 2350
    .line 2351
    .line 2352
    move-result-object v4

    .line 2353
    check-cast v4, Ljava/util/List;

    .line 2354
    .line 2355
    new-instance v5, Ljava/util/ArrayList;

    .line 2356
    .line 2357
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2358
    .line 2359
    .line 2360
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2361
    .line 2362
    .line 2363
    move-result-object v4

    .line 2364
    :cond_58
    :goto_3e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2365
    .line 2366
    .line 2367
    move-result v6

    .line 2368
    if-eqz v6, :cond_5b

    .line 2369
    .line 2370
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2371
    .line 2372
    .line 2373
    move-result-object v6

    .line 2374
    check-cast v6, Lb1/l;

    .line 2375
    .line 2376
    iget-object v6, v6, Lb1/l;->a:Lb1/f;

    .line 2377
    .line 2378
    invoke-virtual {v6}, Lb1/f;->b()Lf1/b;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v7

    .line 2382
    iget-object v7, v7, Lf1/b;->b:Ljava/lang/String;

    .line 2383
    .line 2384
    invoke-virtual {v6}, Lb1/f;->b()Lf1/b;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v8

    .line 2388
    iget-object v8, v8, Lf1/b;->a:Ljava/lang/String;

    .line 2389
    .line 2390
    const-string v9, "com.tencent.mm.R$id"

    .line 2391
    .line 2392
    invoke-static {v8, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2393
    .line 2394
    .line 2395
    move-result v8

    .line 2396
    if-nez v8, :cond_5a

    .line 2397
    .line 2398
    invoke-virtual {v6}, Lb1/f;->b()Lf1/b;

    .line 2399
    .line 2400
    .line 2401
    move-result-object v6

    .line 2402
    iget-object v6, v6, Lf1/b;->a:Ljava/lang/String;

    .line 2403
    .line 2404
    const-string v8, ".R$id"

    .line 2405
    .line 2406
    invoke-static {v6, v8}, LU0/q;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2407
    .line 2408
    .line 2409
    move-result v6

    .line 2410
    if-eqz v6, :cond_59

    .line 2411
    .line 2412
    goto :goto_3f

    .line 2413
    :cond_59
    move-object/from16 v7, v17

    .line 2414
    .line 2415
    goto :goto_3f

    .line 2416
    :catchall_4
    move-exception v0

    .line 2417
    goto :goto_40

    .line 2418
    :cond_5a
    :goto_3f
    if-eqz v7, :cond_58

    .line 2419
    .line 2420
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2421
    .line 2422
    .line 2423
    goto :goto_3e

    .line 2424
    :cond_5b
    invoke-static {v5, v3}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 2425
    .line 2426
    .line 2427
    goto :goto_3d

    .line 2428
    :goto_40
    new-instance v3, LE0/d;

    .line 2429
    .line 2430
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 2431
    .line 2432
    .line 2433
    :cond_5c
    invoke-static {v3}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2434
    .line 2435
    .line 2436
    move-result-object v0

    .line 2437
    if-eqz v0, :cond_5d

    .line 2438
    .line 2439
    const-string v4, "storage dexkit file sort entry resolve fail"

    .line 2440
    .line 2441
    filled-new-array {v4, v0}, [Ljava/lang/Object;

    .line 2442
    .line 2443
    .line 2444
    move-result-object v0

    .line 2445
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 2446
    .line 2447
    .line 2448
    :cond_5d
    instance-of v0, v3, LE0/d;

    .line 2449
    .line 2450
    if-eqz v0, :cond_5e

    .line 2451
    .line 2452
    move-object/from16 v3, v20

    .line 2453
    .line 2454
    :cond_5e
    check-cast v3, Ljava/util/List;

    .line 2455
    .line 2456
    const-string v0, "trf"

    .line 2457
    .line 2458
    const-string v4, "tsy"

    .line 2459
    .line 2460
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v0

    .line 2464
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 2465
    .line 2466
    .line 2467
    move-result-object v0

    .line 2468
    invoke-static {v3, v0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v0

    .line 2472
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2473
    .line 2474
    .line 2475
    move-result-object v0

    .line 2476
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2477
    .line 2478
    .line 2479
    move-result-object v8

    .line 2480
    :try_start_5
    new-instance v0, LW0/a;

    .line 2481
    .line 2482
    const/4 v7, 0x1

    .line 2483
    invoke-direct {v0, v7}, LW0/a;-><init>(I)V

    .line 2484
    .line 2485
    .line 2486
    new-instance v3, LZ0/b;

    .line 2487
    .line 2488
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 2489
    .line 2490
    .line 2491
    filled-new-array {v13}, [Ljava/lang/String;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v4

    .line 2495
    invoke-virtual {v3, v4}, LZ0/b;->d0([Ljava/lang/String;)V

    .line 2496
    .line 2497
    .line 2498
    iput-object v3, v0, LW0/a;->f:LD/h;

    .line 2499
    .line 2500
    invoke-virtual {v10, v0}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 2501
    .line 2502
    .line 2503
    move-result-object v0

    .line 2504
    new-instance v3, Ljava/util/ArrayList;

    .line 2505
    .line 2506
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2507
    .line 2508
    .line 2509
    move-result v4

    .line 2510
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2511
    .line 2512
    .line 2513
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2514
    .line 2515
    .line 2516
    move-result-object v0

    .line 2517
    :goto_41
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2518
    .line 2519
    .line 2520
    move-result v4

    .line 2521
    if-eqz v4, :cond_5f

    .line 2522
    .line 2523
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2524
    .line 2525
    .line 2526
    move-result-object v4

    .line 2527
    check-cast v4, Lb1/j;

    .line 2528
    .line 2529
    invoke-virtual {v4}, Lb1/j;->b()Lf1/d;

    .line 2530
    .line 2531
    .line 2532
    move-result-object v4

    .line 2533
    iget-object v4, v4, Lf1/d;->a:Ljava/lang/String;

    .line 2534
    .line 2535
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2536
    .line 2537
    .line 2538
    goto :goto_41

    .line 2539
    :catchall_5
    move-exception v0

    .line 2540
    goto :goto_42

    .line 2541
    :cond_5f
    invoke-static {v3}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2542
    .line 2543
    .line 2544
    move-result-object v0

    .line 2545
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2546
    .line 2547
    .line 2548
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 2549
    goto :goto_43

    .line 2550
    :goto_42
    new-instance v3, LE0/d;

    .line 2551
    .line 2552
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 2553
    .line 2554
    .line 2555
    move-object v0, v3

    .line 2556
    :goto_43
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2557
    .line 2558
    .line 2559
    move-result-object v3

    .line 2560
    if-eqz v3, :cond_60

    .line 2561
    .line 2562
    const-string v4, "storage dexkit file sort activity resolve fail"

    .line 2563
    .line 2564
    filled-new-array {v4, v3}, [Ljava/lang/Object;

    .line 2565
    .line 2566
    .line 2567
    move-result-object v3

    .line 2568
    invoke-static {v3}, Li0/a;->d([Ljava/lang/Object;)V

    .line 2569
    .line 2570
    .line 2571
    :cond_60
    instance-of v3, v0, LE0/d;

    .line 2572
    .line 2573
    if-eqz v3, :cond_61

    .line 2574
    .line 2575
    goto :goto_44

    .line 2576
    :cond_61
    move-object/from16 v20, v0

    .line 2577
    .line 2578
    :goto_44
    move-object/from16 v0, v20

    .line 2579
    .line 2580
    check-cast v0, Ljava/util/List;

    .line 2581
    .line 2582
    new-instance v3, Ljava/util/ArrayList;

    .line 2583
    .line 2584
    invoke-static/range {v27 .. v27}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2585
    .line 2586
    .line 2587
    move-result v4

    .line 2588
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2589
    .line 2590
    .line 2591
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2592
    .line 2593
    .line 2594
    move-result-object v4

    .line 2595
    :goto_45
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2596
    .line 2597
    .line 2598
    move-result v5

    .line 2599
    if-eqz v5, :cond_62

    .line 2600
    .line 2601
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2602
    .line 2603
    .line 2604
    move-result-object v5

    .line 2605
    check-cast v5, Ljava/lang/Class;

    .line 2606
    .line 2607
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2608
    .line 2609
    .line 2610
    move-result-object v5

    .line 2611
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2612
    .line 2613
    .line 2614
    goto :goto_45

    .line 2615
    :cond_62
    const/16 v5, 0xc

    .line 2616
    .line 2617
    invoke-static {v3, v5}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2618
    .line 2619
    .line 2620
    move-result-object v4

    .line 2621
    new-instance v3, Ljava/util/ArrayList;

    .line 2622
    .line 2623
    invoke-static/range {v26 .. v26}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 2624
    .line 2625
    .line 2626
    move-result v5

    .line 2627
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2628
    .line 2629
    .line 2630
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2631
    .line 2632
    .line 2633
    move-result-object v5

    .line 2634
    :goto_46
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2635
    .line 2636
    .line 2637
    move-result v6

    .line 2638
    if-eqz v6, :cond_63

    .line 2639
    .line 2640
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2641
    .line 2642
    .line 2643
    move-result-object v6

    .line 2644
    check-cast v6, Ljava/lang/Class;

    .line 2645
    .line 2646
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2647
    .line 2648
    .line 2649
    move-result-object v6

    .line 2650
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2651
    .line 2652
    .line 2653
    goto :goto_46

    .line 2654
    :cond_63
    const/16 v6, 0xc

    .line 2655
    .line 2656
    invoke-static {v3, v6}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2657
    .line 2658
    .line 2659
    move-result-object v5

    .line 2660
    const/16 v9, 0x8

    .line 2661
    .line 2662
    invoke-static {v1, v9}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2663
    .line 2664
    .line 2665
    move-result-object v6

    .line 2666
    invoke-static {v2, v9}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2667
    .line 2668
    .line 2669
    move-result-object v7

    .line 2670
    move/from16 v1, v16

    .line 2671
    .line 2672
    invoke-static {v0, v1}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2673
    .line 2674
    .line 2675
    move-result-object v9

    .line 2676
    new-instance v3, LA0/Z;

    .line 2677
    .line 2678
    invoke-direct/range {v3 .. v9}, LA0/Z;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2679
    .line 2680
    .line 2681
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 2682
    .line 2683
    .line 2684
    move-result v0

    .line 2685
    if-nez v0, :cond_64

    .line 2686
    .line 2687
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 2688
    .line 2689
    .line 2690
    move-result v0

    .line 2691
    if-nez v0, :cond_64

    .line 2692
    .line 2693
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 2694
    .line 2695
    .line 2696
    move-result v0

    .line 2697
    if-nez v0, :cond_64

    .line 2698
    .line 2699
    move-object/from16 v17, v3

    .line 2700
    .line 2701
    :cond_64
    return-object v17
.end method

.method private final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    const-string v0, "bridge"

    .line 6
    .line 7
    invoke-static {v1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p0

    .line 11
    .line 12
    iget-object v0, v2, LA0/h;->b:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string v0, "getClassLoader(...)"

    .line 19
    .line 20
    invoke-static {v3, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "com.tencent.mm.plugin.textstatus"

    .line 24
    .line 25
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "OtherTopicFriends"

    .line 30
    .line 31
    const-string v6, "TextStatus"

    .line 32
    .line 33
    const-string v7, "TextStatusOtherTopicFriendsActivity"

    .line 34
    .line 35
    filled-new-array {v7, v5, v6}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v5}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-static {v1, v4, v5, v6}, LA0/g;->u(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    new-instance v5, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    const/4 v9, 0x1

    .line 62
    const-string v10, "textstatus"

    .line 63
    .line 64
    if-eqz v8, :cond_1

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    move-object v11, v8

    .line 71
    check-cast v11, Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v11, v10, v9}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_0

    .line 78
    .line 79
    const-string v9, "Friends"

    .line 80
    .line 81
    invoke-static {v11, v9, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_0

    .line 86
    .line 87
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    invoke-static {v5}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {v4}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 100
    .line 101
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v8, "com.tencent.mm.plugin.textstatus.ui.be"

    .line 105
    .line 106
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v10}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-static {v1, v0, v10, v9}, LA0/g;->u(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0, v5}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 122
    .line 123
    .line 124
    new-instance v10, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_4

    .line 138
    .line 139
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Ljava/lang/String;

    .line 144
    .line 145
    :try_start_0
    invoke-static {v0, v6, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    goto :goto_2

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    new-instance v12, LE0/d;

    .line 152
    .line 153
    invoke-direct {v12, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    move-object v0, v12

    .line 157
    :goto_2
    nop

    .line 158
    instance-of v12, v0, LE0/d;

    .line 159
    .line 160
    if-eqz v12, :cond_3

    .line 161
    .line 162
    const/4 v11, 0x0

    .line 163
    goto :goto_3

    .line 164
    :cond_3
    move-object v11, v0

    .line 165
    :goto_3
    check-cast v11, Ljava/lang/Class;

    .line 166
    .line 167
    if-eqz v11, :cond_2

    .line 168
    .line 169
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    :cond_5
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-eqz v10, :cond_6

    .line 187
    .line 188
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    move-object v12, v10

    .line 193
    check-cast v12, Ljava/lang/Class;

    .line 194
    .line 195
    invoke-static {v12}, LA0/g;->J(Ljava/lang/Class;)Z

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    if-eqz v12, :cond_5

    .line 200
    .line 201
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_6
    new-instance v5, LA0/e;

    .line 206
    .line 207
    const/16 v10, 0xf

    .line 208
    .line 209
    invoke-direct {v5, v10}, LA0/e;-><init>(I)V

    .line 210
    .line 211
    .line 212
    new-instance v10, LA0/f;

    .line 213
    .line 214
    const/16 v12, 0x10

    .line 215
    .line 216
    invoke-direct {v10, v12, v5}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v0, v10}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v5, Ljava/util/HashSet;

    .line 224
    .line 225
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 226
    .line 227
    .line 228
    new-instance v10, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    :cond_7
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v12

    .line 241
    if-eqz v12, :cond_8

    .line 242
    .line 243
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    move-object v13, v12

    .line 248
    check-cast v13, Ljava/lang/Class;

    .line 249
    .line 250
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    invoke-virtual {v5, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v13

    .line 258
    if-eqz v13, :cond_7

    .line 259
    .line 260
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    if-eqz v12, :cond_9

    .line 278
    .line 279
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    check-cast v12, Ljava/lang/Class;

    .line 284
    .line 285
    invoke-static {v12}, LA0/g;->y(Ljava/lang/Class;)Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    invoke-static {v12, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 290
    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_9
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    if-eqz v5, :cond_a

    .line 306
    .line 307
    const-string v0, "data"

    .line 308
    .line 309
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    :cond_a
    move-object v5, v0

    .line 314
    new-instance v12, Ljava/util/LinkedHashSet;

    .line 315
    .line 316
    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v13

    .line 323
    :goto_7
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    const-string v14, "clazz"

    .line 328
    .line 329
    const-string v15, "kotlin."

    .line 330
    .line 331
    const/16 p1, 0x0

    .line 332
    .line 333
    const-string v11, "android."

    .line 334
    .line 335
    const-string v6, "java."

    .line 336
    .line 337
    if-eqz v0, :cond_1a

    .line 338
    .line 339
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    move-object v9, v0

    .line 344
    check-cast v9, Ljava/lang/Class;

    .line 345
    .line 346
    invoke-static {v9, v14}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    new-instance v14, Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 352
    .line 353
    .line 354
    move-object v2, v9

    .line 355
    :goto_8
    sget-object v17, LF0/s;->a:LF0/s;

    .line 356
    .line 357
    move-object/from16 v18, v4

    .line 358
    .line 359
    const-class v4, Ljava/lang/Object;

    .line 360
    .line 361
    if-eqz v2, :cond_c

    .line 362
    .line 363
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-nez v0, :cond_c

    .line 368
    .line 369
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    const-string v4, "getDeclaredFields(...)"

    .line 374
    .line 375
    invoke-static {v0, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 382
    goto :goto_9

    .line 383
    :catchall_1
    move-exception v0

    .line 384
    new-instance v4, LE0/d;

    .line 385
    .line 386
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 387
    .line 388
    .line 389
    move-object v0, v4

    .line 390
    :goto_9
    nop

    .line 391
    instance-of v4, v0, LE0/d;

    .line 392
    .line 393
    if-eqz v4, :cond_b

    .line 394
    .line 395
    goto :goto_a

    .line 396
    :cond_b
    move-object/from16 v17, v0

    .line 397
    .line 398
    :goto_a
    move-object/from16 v0, v17

    .line 399
    .line 400
    check-cast v0, Ljava/util/Collection;

    .line 401
    .line 402
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    move-object/from16 v4, v18

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    :cond_d
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v14

    .line 425
    if-eqz v14, :cond_e

    .line 426
    .line 427
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v14

    .line 431
    move-object/from16 v19, v14

    .line 432
    .line 433
    check-cast v19, Ljava/lang/reflect/Field;

    .line 434
    .line 435
    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 436
    .line 437
    .line 438
    move-result v19

    .line 439
    invoke-static/range {v19 .. v19}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 440
    .line 441
    .line 442
    move-result v19

    .line 443
    if-nez v19, :cond_d

    .line 444
    .line 445
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    goto :goto_b

    .line 449
    :cond_e
    new-instance v2, Ljava/util/ArrayList;

    .line 450
    .line 451
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 452
    .line 453
    .line 454
    move-result v14

    .line 455
    invoke-direct {v2, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v14

    .line 466
    if-eqz v14, :cond_f

    .line 467
    .line 468
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v14

    .line 472
    check-cast v14, Ljava/lang/reflect/Field;

    .line 473
    .line 474
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 475
    .line 476
    .line 477
    move-result-object v14

    .line 478
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v14

    .line 482
    move-object/from16 v19, v0

    .line 483
    .line 484
    const-string v0, "class "

    .line 485
    .line 486
    invoke-static {v14, v0}, LU0/i;->t0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-object/from16 v0, v19

    .line 494
    .line 495
    goto :goto_c

    .line 496
    :cond_f
    new-instance v0, Ljava/util/ArrayList;

    .line 497
    .line 498
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 506
    .line 507
    .line 508
    move-result v14

    .line 509
    if-eqz v14, :cond_10

    .line 510
    .line 511
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v14

    .line 515
    check-cast v14, Ljava/lang/String;

    .line 516
    .line 517
    move-object/from16 v19, v2

    .line 518
    .line 519
    new-instance v2, LU0/g;

    .line 520
    .line 521
    move-object/from16 v20, v7

    .line 522
    .line 523
    const-string v7, "[a-zA-Z_$][\\w$]*(?:\\.[a-zA-Z_$][\\w$]*)+"

    .line 524
    .line 525
    invoke-direct {v2, v7}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-static {v2, v14}, LU0/g;->c(LU0/g;Ljava/lang/String;)LK0/h;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    new-instance v7, LA0/a;

    .line 533
    .line 534
    const/16 v14, 0x12

    .line 535
    .line 536
    invoke-direct {v7, v14}, LA0/a;-><init>(I)V

    .line 537
    .line 538
    .line 539
    new-instance v14, LK0/h;

    .line 540
    .line 541
    invoke-direct {v14, v2, v7}, LK0/h;-><init>(LT0/h;LM0/l;)V

    .line 542
    .line 543
    .line 544
    new-instance v2, LA0/a;

    .line 545
    .line 546
    const/16 v7, 0x13

    .line 547
    .line 548
    invoke-direct {v2, v7}, LA0/a;-><init>(I)V

    .line 549
    .line 550
    .line 551
    new-instance v7, LT0/f;

    .line 552
    .line 553
    move-object/from16 v21, v8

    .line 554
    .line 555
    const/4 v8, 0x1

    .line 556
    invoke-direct {v7, v14, v8, v2}, LT0/f;-><init>(LT0/h;ZLM0/l;)V

    .line 557
    .line 558
    .line 559
    invoke-static {v7}, LT0/i;->Z(LT0/h;)Ljava/util/List;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    invoke-static {v2, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 564
    .line 565
    .line 566
    move-object/from16 v2, v19

    .line 567
    .line 568
    move-object/from16 v7, v20

    .line 569
    .line 570
    move-object/from16 v8, v21

    .line 571
    .line 572
    goto :goto_d

    .line 573
    :cond_10
    move-object/from16 v20, v7

    .line 574
    .line 575
    move-object/from16 v21, v8

    .line 576
    .line 577
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    :cond_11
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-eqz v0, :cond_13

    .line 586
    .line 587
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    check-cast v0, Ljava/lang/String;

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    :try_start_2
    invoke-static {v0, v7, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 598
    goto :goto_f

    .line 599
    :catchall_2
    move-exception v0

    .line 600
    new-instance v7, LE0/d;

    .line 601
    .line 602
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 603
    .line 604
    .line 605
    move-object v0, v7

    .line 606
    :goto_f
    nop

    .line 607
    instance-of v7, v0, LE0/d;

    .line 608
    .line 609
    if-eqz v7, :cond_12

    .line 610
    .line 611
    move-object/from16 v0, p1

    .line 612
    .line 613
    :cond_12
    check-cast v0, Ljava/lang/Class;

    .line 614
    .line 615
    if-eqz v0, :cond_11

    .line 616
    .line 617
    invoke-interface {v12, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    goto :goto_e

    .line 621
    :cond_13
    new-instance v2, Ljava/util/ArrayList;

    .line 622
    .line 623
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 624
    .line 625
    .line 626
    :goto_10
    if-eqz v9, :cond_15

    .line 627
    .line 628
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    if-nez v0, :cond_15

    .line 633
    .line 634
    :try_start_3
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    const-string v7, "getDeclaredMethods(...)"

    .line 639
    .line 640
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 644
    .line 645
    .line 646
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 647
    goto :goto_11

    .line 648
    :catchall_3
    move-exception v0

    .line 649
    new-instance v7, LE0/d;

    .line 650
    .line 651
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 652
    .line 653
    .line 654
    move-object v0, v7

    .line 655
    :goto_11
    nop

    .line 656
    instance-of v7, v0, LE0/d;

    .line 657
    .line 658
    if-eqz v7, :cond_14

    .line 659
    .line 660
    move-object/from16 v0, v17

    .line 661
    .line 662
    :cond_14
    check-cast v0, Ljava/util/Collection;

    .line 663
    .line 664
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 665
    .line 666
    .line 667
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    move-result-object v9

    .line 671
    goto :goto_10

    .line 672
    :cond_15
    new-instance v0, Ljava/util/ArrayList;

    .line 673
    .line 674
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 682
    .line 683
    .line 684
    move-result v4

    .line 685
    if-eqz v4, :cond_16

    .line 686
    .line 687
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    check-cast v4, Ljava/lang/reflect/Method;

    .line 692
    .line 693
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    move-result-object v7

    .line 697
    invoke-static {v7}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 698
    .line 699
    .line 700
    move-result-object v7

    .line 701
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    move-result-object v4

    .line 705
    const-string v8, "getParameterTypes(...)"

    .line 706
    .line 707
    invoke-static {v4, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    invoke-static {v7, v4}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    invoke-static {v4, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 715
    .line 716
    .line 717
    goto :goto_12

    .line 718
    :cond_16
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    :cond_17
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 723
    .line 724
    .line 725
    move-result v2

    .line 726
    if-eqz v2, :cond_19

    .line 727
    .line 728
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    move-object v4, v2

    .line 733
    check-cast v4, Ljava/lang/Class;

    .line 734
    .line 735
    invoke-static {v4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 739
    .line 740
    .line 741
    move-result v7

    .line 742
    if-nez v7, :cond_17

    .line 743
    .line 744
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v7

    .line 748
    const/4 v8, 0x0

    .line 749
    invoke-static {v7, v8, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 750
    .line 751
    .line 752
    move-result v7

    .line 753
    if-nez v7, :cond_17

    .line 754
    .line 755
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v7

    .line 759
    invoke-static {v7, v8, v11}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 760
    .line 761
    .line 762
    move-result v7

    .line 763
    if-nez v7, :cond_17

    .line 764
    .line 765
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v4

    .line 769
    invoke-static {v4, v8, v15}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 770
    .line 771
    .line 772
    move-result v4

    .line 773
    if-eqz v4, :cond_18

    .line 774
    .line 775
    goto :goto_13

    .line 776
    :cond_18
    invoke-interface {v12, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    goto :goto_13

    .line 780
    :cond_19
    move-object/from16 v2, p0

    .line 781
    .line 782
    move-object/from16 v4, v18

    .line 783
    .line 784
    move-object/from16 v7, v20

    .line 785
    .line 786
    move-object/from16 v8, v21

    .line 787
    .line 788
    const/4 v6, 0x0

    .line 789
    const/4 v9, 0x1

    .line 790
    goto/16 :goto_7

    .line 791
    .line 792
    :cond_1a
    move-object/from16 v18, v4

    .line 793
    .line 794
    move-object/from16 v20, v7

    .line 795
    .line 796
    move-object/from16 v21, v8

    .line 797
    .line 798
    new-instance v0, Ljava/util/HashSet;

    .line 799
    .line 800
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 801
    .line 802
    .line 803
    new-instance v2, Ljava/util/ArrayList;

    .line 804
    .line 805
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 806
    .line 807
    .line 808
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    :cond_1b
    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 813
    .line 814
    .line 815
    move-result v4

    .line 816
    if-eqz v4, :cond_1c

    .line 817
    .line 818
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v4

    .line 822
    move-object v7, v4

    .line 823
    check-cast v7, Ljava/lang/Class;

    .line 824
    .line 825
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v7

    .line 829
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v7

    .line 833
    if-eqz v7, :cond_1b

    .line 834
    .line 835
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    goto :goto_14

    .line 839
    :cond_1c
    new-instance v0, Ljava/util/ArrayList;

    .line 840
    .line 841
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 845
    .line 846
    .line 847
    move-result-object v3

    .line 848
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 849
    .line 850
    .line 851
    move-result v4

    .line 852
    const-class v8, Ljava/lang/String;

    .line 853
    .line 854
    if-eqz v4, :cond_2a

    .line 855
    .line 856
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v4

    .line 860
    move-object v9, v4

    .line 861
    check-cast v9, Ljava/lang/Class;

    .line 862
    .line 863
    invoke-static {v9, v14}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v9}, Ljava/lang/Class;->isPrimitive()Z

    .line 867
    .line 868
    .line 869
    move-result v12

    .line 870
    if-nez v12, :cond_1d

    .line 871
    .line 872
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v12

    .line 876
    const/4 v13, 0x0

    .line 877
    invoke-static {v12, v13, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 878
    .line 879
    .line 880
    move-result v12

    .line 881
    if-nez v12, :cond_1d

    .line 882
    .line 883
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v12

    .line 887
    invoke-static {v12, v13, v11}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 888
    .line 889
    .line 890
    move-result v12

    .line 891
    if-nez v12, :cond_1d

    .line 892
    .line 893
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v12

    .line 897
    invoke-static {v12, v13, v15}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 898
    .line 899
    .line 900
    move-result v12

    .line 901
    if-eqz v12, :cond_1e

    .line 902
    .line 903
    :cond_1d
    move-object/from16 v17, v2

    .line 904
    .line 905
    move-object/from16 v19, v3

    .line 906
    .line 907
    const/4 v3, 0x1

    .line 908
    goto/16 :goto_1b

    .line 909
    .line 910
    :cond_1e
    invoke-static {v9}, LA0/g;->l(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 911
    .line 912
    .line 913
    move-result-object v12

    .line 914
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 915
    .line 916
    .line 917
    move-result v13

    .line 918
    if-eqz v13, :cond_1f

    .line 919
    .line 920
    const/4 v7, 0x0

    .line 921
    goto :goto_17

    .line 922
    :cond_1f
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 923
    .line 924
    .line 925
    move-result-object v13

    .line 926
    const/16 v17, 0x0

    .line 927
    .line 928
    :cond_20
    :goto_16
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 929
    .line 930
    .line 931
    move-result v19

    .line 932
    if-eqz v19, :cond_22

    .line 933
    .line 934
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v19

    .line 938
    check-cast v19, Ljava/lang/reflect/Field;

    .line 939
    .line 940
    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 941
    .line 942
    .line 943
    move-result v22

    .line 944
    invoke-static/range {v22 .. v22}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 945
    .line 946
    .line 947
    move-result v22

    .line 948
    if-nez v22, :cond_20

    .line 949
    .line 950
    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    move-result-object v7

    .line 954
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 955
    .line 956
    .line 957
    move-result v7

    .line 958
    if-eqz v7, :cond_20

    .line 959
    .line 960
    add-int/lit8 v17, v17, 0x1

    .line 961
    .line 962
    if-ltz v17, :cond_21

    .line 963
    .line 964
    goto :goto_16

    .line 965
    :cond_21
    invoke-static {}, LF0/l;->a0()V

    .line 966
    .line 967
    .line 968
    throw p1

    .line 969
    :cond_22
    move/from16 v7, v17

    .line 970
    .line 971
    :goto_17
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 972
    .line 973
    .line 974
    move-result v8

    .line 975
    if-eqz v8, :cond_24

    .line 976
    .line 977
    const/4 v12, 0x0

    .line 978
    :cond_23
    move-object/from16 v17, v2

    .line 979
    .line 980
    move-object/from16 v19, v3

    .line 981
    .line 982
    const/4 v2, 0x2

    .line 983
    goto :goto_1a

    .line 984
    :cond_24
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 985
    .line 986
    .line 987
    move-result-object v8

    .line 988
    const/4 v12, 0x0

    .line 989
    :goto_18
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 990
    .line 991
    .line 992
    move-result v13

    .line 993
    if-eqz v13, :cond_23

    .line 994
    .line 995
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v13

    .line 999
    check-cast v13, Ljava/lang/reflect/Field;

    .line 1000
    .line 1001
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1002
    .line 1003
    .line 1004
    move-result v17

    .line 1005
    invoke-static/range {v17 .. v17}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v17

    .line 1009
    if-nez v17, :cond_28

    .line 1010
    .line 1011
    move-object/from16 v17, v2

    .line 1012
    .line 1013
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v2

    .line 1017
    move-object/from16 v19, v3

    .line 1018
    .line 1019
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1020
    .line 1021
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v2

    .line 1025
    if-nez v2, :cond_25

    .line 1026
    .line 1027
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v2

    .line 1031
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v2

    .line 1035
    if-eqz v2, :cond_26

    .line 1036
    .line 1037
    :cond_25
    add-int/lit8 v12, v12, 0x1

    .line 1038
    .line 1039
    if-ltz v12, :cond_27

    .line 1040
    .line 1041
    :cond_26
    :goto_19
    move-object/from16 v2, v17

    .line 1042
    .line 1043
    move-object/from16 v3, v19

    .line 1044
    .line 1045
    goto :goto_18

    .line 1046
    :cond_27
    invoke-static {}, LF0/l;->a0()V

    .line 1047
    .line 1048
    .line 1049
    throw p1

    .line 1050
    :cond_28
    move-object/from16 v17, v2

    .line 1051
    .line 1052
    move-object/from16 v19, v3

    .line 1053
    .line 1054
    goto :goto_19

    .line 1055
    :goto_1a
    const/4 v3, 0x1

    .line 1056
    if-lt v7, v2, :cond_29

    .line 1057
    .line 1058
    if-lt v12, v3, :cond_29

    .line 1059
    .line 1060
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v7

    .line 1064
    invoke-static {v7}, LU0/i;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v7

    .line 1068
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1069
    .line 1070
    .line 1071
    move-result v7

    .line 1072
    if-gt v7, v2, :cond_29

    .line 1073
    .line 1074
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1075
    .line 1076
    .line 1077
    :cond_29
    :goto_1b
    move-object/from16 v2, v17

    .line 1078
    .line 1079
    move-object/from16 v3, v19

    .line 1080
    .line 1081
    goto/16 :goto_15

    .line 1082
    .line 1083
    :cond_2a
    move-object/from16 v17, v2

    .line 1084
    .line 1085
    const/4 v3, 0x1

    .line 1086
    new-instance v2, Ljava/util/ArrayList;

    .line 1087
    .line 1088
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1089
    .line 1090
    .line 1091
    move-result v4

    .line 1092
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1100
    .line 1101
    .line 1102
    move-result v4

    .line 1103
    if-eqz v4, :cond_2b

    .line 1104
    .line 1105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v4

    .line 1109
    check-cast v4, Ljava/lang/Class;

    .line 1110
    .line 1111
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v4

    .line 1115
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    goto :goto_1c

    .line 1119
    :cond_2b
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1120
    .line 1121
    .line 1122
    move-result v0

    .line 1123
    if-eqz v0, :cond_2c

    .line 1124
    .line 1125
    const-string v0, "kf4.c"

    .line 1126
    .line 1127
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v2

    .line 1131
    :cond_2c
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v0

    .line 1139
    new-instance v2, Ljava/util/ArrayList;

    .line 1140
    .line 1141
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v4

    .line 1148
    :goto_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1149
    .line 1150
    .line 1151
    move-result v7

    .line 1152
    const/4 v9, 0x6

    .line 1153
    if-eqz v7, :cond_3b

    .line 1154
    .line 1155
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v7

    .line 1159
    move-object v12, v7

    .line 1160
    check-cast v12, Ljava/lang/Class;

    .line 1161
    .line 1162
    invoke-static {v12, v14}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v12}, Ljava/lang/Class;->isPrimitive()Z

    .line 1166
    .line 1167
    .line 1168
    move-result v13

    .line 1169
    if-nez v13, :cond_38

    .line 1170
    .line 1171
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v13

    .line 1175
    const/4 v3, 0x0

    .line 1176
    invoke-static {v13, v3, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1177
    .line 1178
    .line 1179
    move-result v13

    .line 1180
    if-nez v13, :cond_38

    .line 1181
    .line 1182
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v13

    .line 1186
    invoke-static {v13, v3, v11}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1187
    .line 1188
    .line 1189
    move-result v13

    .line 1190
    if-nez v13, :cond_38

    .line 1191
    .line 1192
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v13

    .line 1196
    invoke-static {v13, v3, v15}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1197
    .line 1198
    .line 1199
    move-result v13

    .line 1200
    if-eqz v13, :cond_2d

    .line 1201
    .line 1202
    goto/16 :goto_24

    .line 1203
    .line 1204
    :cond_2d
    invoke-static {v12}, LA0/g;->l(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v13

    .line 1208
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1209
    .line 1210
    .line 1211
    move-result v16

    .line 1212
    if-eqz v16, :cond_2e

    .line 1213
    .line 1214
    goto :goto_1f

    .line 1215
    :cond_2e
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v16

    .line 1219
    move/from16 v17, v3

    .line 1220
    .line 1221
    :goto_1e
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 1222
    .line 1223
    .line 1224
    move-result v19

    .line 1225
    if-eqz v19, :cond_31

    .line 1226
    .line 1227
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v19

    .line 1231
    check-cast v19, Ljava/lang/reflect/Field;

    .line 1232
    .line 1233
    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1234
    .line 1235
    .line 1236
    move-result v23

    .line 1237
    invoke-static/range {v23 .. v23}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1238
    .line 1239
    .line 1240
    move-result v23

    .line 1241
    if-nez v23, :cond_2f

    .line 1242
    .line 1243
    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v3

    .line 1247
    invoke-static {v3, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1248
    .line 1249
    .line 1250
    move-result v3

    .line 1251
    if-eqz v3, :cond_2f

    .line 1252
    .line 1253
    add-int/lit8 v17, v17, 0x1

    .line 1254
    .line 1255
    if-ltz v17, :cond_30

    .line 1256
    .line 1257
    :cond_2f
    const/4 v3, 0x0

    .line 1258
    goto :goto_1e

    .line 1259
    :cond_30
    invoke-static {}, LF0/l;->a0()V

    .line 1260
    .line 1261
    .line 1262
    throw p1

    .line 1263
    :cond_31
    move/from16 v3, v17

    .line 1264
    .line 1265
    :goto_1f
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1266
    .line 1267
    .line 1268
    move-result v16

    .line 1269
    if-eqz v16, :cond_32

    .line 1270
    .line 1271
    const/4 v13, 0x0

    .line 1272
    goto :goto_21

    .line 1273
    :cond_32
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v13

    .line 1277
    const/16 v16, 0x0

    .line 1278
    .line 1279
    :cond_33
    :goto_20
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 1280
    .line 1281
    .line 1282
    move-result v17

    .line 1283
    if-eqz v17, :cond_35

    .line 1284
    .line 1285
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v17

    .line 1289
    check-cast v17, Ljava/lang/reflect/Field;

    .line 1290
    .line 1291
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1292
    .line 1293
    .line 1294
    move-result v17

    .line 1295
    invoke-static/range {v17 .. v17}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1296
    .line 1297
    .line 1298
    move-result v17

    .line 1299
    if-nez v17, :cond_33

    .line 1300
    .line 1301
    add-int/lit8 v16, v16, 0x1

    .line 1302
    .line 1303
    if-ltz v16, :cond_34

    .line 1304
    .line 1305
    goto :goto_20

    .line 1306
    :cond_34
    invoke-static {}, LF0/l;->a0()V

    .line 1307
    .line 1308
    .line 1309
    throw p1

    .line 1310
    :cond_35
    move/from16 v13, v16

    .line 1311
    .line 1312
    :goto_21
    if-gt v13, v9, :cond_36

    .line 1313
    .line 1314
    const/4 v9, 0x1

    .line 1315
    goto :goto_22

    .line 1316
    :cond_36
    const/4 v9, 0x0

    .line 1317
    :goto_22
    if-ltz v3, :cond_37

    .line 1318
    .line 1319
    const/4 v13, 0x3

    .line 1320
    if-ge v3, v13, :cond_37

    .line 1321
    .line 1322
    const/4 v3, 0x1

    .line 1323
    goto :goto_23

    .line 1324
    :cond_37
    const/4 v3, 0x0

    .line 1325
    :goto_23
    if-eqz v3, :cond_38

    .line 1326
    .line 1327
    if-eqz v9, :cond_38

    .line 1328
    .line 1329
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v3

    .line 1333
    invoke-static {v3}, LU0/i;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v3

    .line 1337
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1338
    .line 1339
    .line 1340
    move-result v3

    .line 1341
    const/4 v12, 0x2

    .line 1342
    if-gt v3, v12, :cond_39

    .line 1343
    .line 1344
    const/4 v3, 0x1

    .line 1345
    goto :goto_25

    .line 1346
    :cond_38
    :goto_24
    const/4 v12, 0x2

    .line 1347
    :cond_39
    const/4 v3, 0x0

    .line 1348
    :goto_25
    if-eqz v3, :cond_3a

    .line 1349
    .line 1350
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1351
    .line 1352
    .line 1353
    :cond_3a
    const/4 v3, 0x1

    .line 1354
    goto/16 :goto_1d

    .line 1355
    .line 1356
    :cond_3b
    new-instance v3, Ljava/util/ArrayList;

    .line 1357
    .line 1358
    invoke-static {v2}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1359
    .line 1360
    .line 1361
    move-result v4

    .line 1362
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v2

    .line 1369
    :goto_26
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1370
    .line 1371
    .line 1372
    move-result v4

    .line 1373
    if-eqz v4, :cond_3c

    .line 1374
    .line 1375
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v4

    .line 1379
    check-cast v4, Ljava/lang/Class;

    .line 1380
    .line 1381
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v4

    .line 1385
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1386
    .line 1387
    .line 1388
    goto :goto_26

    .line 1389
    :cond_3c
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1390
    .line 1391
    .line 1392
    move-result v2

    .line 1393
    if-eqz v2, :cond_3d

    .line 1394
    .line 1395
    const-string v2, "kf4.d"

    .line 1396
    .line 1397
    invoke-static {v2}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v3

    .line 1401
    :cond_3d
    invoke-static {v3}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v2

    .line 1405
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v2

    .line 1409
    invoke-static/range {v20 .. v20}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v3

    .line 1413
    move-object/from16 v4, p1

    .line 1414
    .line 1415
    invoke-static {v1, v3, v4}, LA0/g;->A(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v1

    .line 1419
    new-instance v3, Ljava/util/ArrayList;

    .line 1420
    .line 1421
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1422
    .line 1423
    .line 1424
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v6

    .line 1428
    :cond_3e
    :goto_27
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1429
    .line 1430
    .line 1431
    move-result v7

    .line 1432
    const-string v8, "m91"

    .line 1433
    .line 1434
    if-eqz v7, :cond_3f

    .line 1435
    .line 1436
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v7

    .line 1440
    move-object v11, v7

    .line 1441
    check-cast v11, Ljava/lang/String;

    .line 1442
    .line 1443
    invoke-static {v11, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1444
    .line 1445
    .line 1446
    move-result v8

    .line 1447
    if-eqz v8, :cond_3e

    .line 1448
    .line 1449
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1450
    .line 1451
    .line 1452
    goto :goto_27

    .line 1453
    :cond_3f
    invoke-static {v8}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v6

    .line 1457
    invoke-static {v3, v6}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v3

    .line 1461
    invoke-static {v3}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v3

    .line 1465
    invoke-static {v3}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v3

    .line 1469
    new-instance v6, Ljava/util/ArrayList;

    .line 1470
    .line 1471
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1472
    .line 1473
    .line 1474
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v7

    .line 1478
    :cond_40
    :goto_28
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1479
    .line 1480
    .line 1481
    move-result v11

    .line 1482
    const-string v12, "om7"

    .line 1483
    .line 1484
    if-eqz v11, :cond_41

    .line 1485
    .line 1486
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v11

    .line 1490
    move-object v13, v11

    .line 1491
    check-cast v13, Ljava/lang/String;

    .line 1492
    .line 1493
    invoke-static {v13, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1494
    .line 1495
    .line 1496
    move-result v12

    .line 1497
    if-eqz v12, :cond_40

    .line 1498
    .line 1499
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1500
    .line 1501
    .line 1502
    goto :goto_28

    .line 1503
    :cond_41
    invoke-static {v12}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v7

    .line 1507
    invoke-static {v6, v7}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v6

    .line 1511
    invoke-static {v6}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v6

    .line 1515
    invoke-static {v6}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v6

    .line 1519
    new-instance v7, Ljava/util/ArrayList;

    .line 1520
    .line 1521
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1522
    .line 1523
    .line 1524
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v1

    .line 1528
    :cond_42
    :goto_29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1529
    .line 1530
    .line 1531
    move-result v11

    .line 1532
    const-string v13, "iib"

    .line 1533
    .line 1534
    if-eqz v11, :cond_43

    .line 1535
    .line 1536
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v11

    .line 1540
    move-object v14, v11

    .line 1541
    check-cast v14, Ljava/lang/String;

    .line 1542
    .line 1543
    invoke-static {v14, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1544
    .line 1545
    .line 1546
    move-result v13

    .line 1547
    if-eqz v13, :cond_42

    .line 1548
    .line 1549
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1550
    .line 1551
    .line 1552
    goto :goto_29

    .line 1553
    :cond_43
    invoke-static {v13}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v1

    .line 1557
    invoke-static {v7, v1}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v1

    .line 1561
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v1

    .line 1565
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v1

    .line 1569
    invoke-interface/range {v18 .. v18}, Ljava/util/Collection;->isEmpty()Z

    .line 1570
    .line 1571
    .line 1572
    move-result v7

    .line 1573
    if-eqz v7, :cond_44

    .line 1574
    .line 1575
    const-string v7, "com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity"

    .line 1576
    .line 1577
    invoke-static {v7}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v7

    .line 1581
    move-object/from16 v18, v7

    .line 1582
    .line 1583
    :cond_44
    invoke-static/range {v18 .. v18}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v7

    .line 1587
    invoke-static {v7}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v7

    .line 1591
    invoke-static {v7, v9}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v25

    .line 1595
    new-instance v7, Ljava/util/ArrayList;

    .line 1596
    .line 1597
    invoke-static {v10}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1598
    .line 1599
    .line 1600
    move-result v9

    .line 1601
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1602
    .line 1603
    .line 1604
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v9

    .line 1608
    :goto_2a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1609
    .line 1610
    .line 1611
    move-result v10

    .line 1612
    if-eqz v10, :cond_45

    .line 1613
    .line 1614
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v10

    .line 1618
    check-cast v10, Ljava/lang/Class;

    .line 1619
    .line 1620
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v10

    .line 1624
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1625
    .line 1626
    .line 1627
    goto :goto_2a

    .line 1628
    :cond_45
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1629
    .line 1630
    .line 1631
    move-result v9

    .line 1632
    if-eqz v9, :cond_46

    .line 1633
    .line 1634
    invoke-static/range {v21 .. v21}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v7

    .line 1638
    :cond_46
    invoke-static {v7}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v7

    .line 1642
    invoke-static {v7}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v7

    .line 1646
    const/16 v9, 0x8

    .line 1647
    .line 1648
    invoke-static {v7, v9}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v26

    .line 1652
    invoke-static {v5, v9}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v27

    .line 1656
    invoke-static {v0, v9}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v28

    .line 1660
    invoke-static {v2, v9}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v29

    .line 1664
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1665
    .line 1666
    .line 1667
    move-result v0

    .line 1668
    if-eqz v0, :cond_47

    .line 1669
    .line 1670
    invoke-static {v8}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v3

    .line 1674
    :cond_47
    invoke-static {v3}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v0

    .line 1678
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v0

    .line 1682
    const/4 v2, 0x4

    .line 1683
    invoke-static {v0, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v30

    .line 1687
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 1688
    .line 1689
    .line 1690
    move-result v0

    .line 1691
    if-eqz v0, :cond_48

    .line 1692
    .line 1693
    invoke-static {v12}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v6

    .line 1697
    :cond_48
    invoke-static {v6}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v0

    .line 1701
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v0

    .line 1705
    invoke-static {v0, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v31

    .line 1709
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1710
    .line 1711
    .line 1712
    move-result v0

    .line 1713
    if-eqz v0, :cond_49

    .line 1714
    .line 1715
    invoke-static {v13}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v1

    .line 1719
    :cond_49
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v0

    .line 1723
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v0

    .line 1727
    invoke-static {v0, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v32

    .line 1731
    new-instance v24, LA0/b0;

    .line 1732
    .line 1733
    invoke-direct/range {v24 .. v32}, LA0/b0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 1734
    .line 1735
    .line 1736
    invoke-interface/range {v25 .. v25}, Ljava/util/Collection;->isEmpty()Z

    .line 1737
    .line 1738
    .line 1739
    move-result v0

    .line 1740
    if-nez v0, :cond_4a

    .line 1741
    .line 1742
    invoke-interface/range {v26 .. v26}, Ljava/util/Collection;->isEmpty()Z

    .line 1743
    .line 1744
    .line 1745
    move-result v0

    .line 1746
    if-nez v0, :cond_4a

    .line 1747
    .line 1748
    invoke-interface/range {v28 .. v28}, Ljava/util/Collection;->isEmpty()Z

    .line 1749
    .line 1750
    .line 1751
    move-result v0

    .line 1752
    if-nez v0, :cond_4a

    .line 1753
    .line 1754
    invoke-interface/range {v29 .. v29}, Ljava/util/Collection;->isEmpty()Z

    .line 1755
    .line 1756
    .line 1757
    move-result v0

    .line 1758
    if-nez v0, :cond_4a

    .line 1759
    .line 1760
    const/4 v6, 0x1

    .line 1761
    goto :goto_2b

    .line 1762
    :cond_4a
    const/4 v6, 0x0

    .line 1763
    :goto_2b
    if-eqz v6, :cond_4b

    .line 1764
    .line 1765
    move-object/from16 v11, v24

    .line 1766
    .line 1767
    goto :goto_2c

    .line 1768
    :cond_4b
    move-object v11, v4

    .line 1769
    :goto_2c
    return-object v11
.end method

.method private final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, LD0/c;

    .line 2
    .line 3
    const-string v0, "it"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, LD0/c;->d:Ljava/lang/Throwable;

    .line 9
    .line 10
    iget-object v1, p0, LA0/h;->b:Landroid/content/Context;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget v0, p1, LD0/c;->a:I

    .line 15
    .line 16
    const/16 v2, 0xc8

    .line 17
    .line 18
    if-ne v0, v2, :cond_1

    .line 19
    .line 20
    iget-object v0, p1, LD0/c;->c:[B

    .line 21
    .line 22
    array-length v0, v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p1, LD0/c;->c:[B

    .line 30
    .line 31
    new-instance v0, Ljava/io/FileOutputStream;

    .line 32
    .line 33
    new-instance v2, Ljava/io/File;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v3, "res/raw/menu_ui.json"

    .line 40
    .line 41
    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 45
    .line 46
    .line 47
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    sput-wide v0, Lb1/h;->k:J

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    sput-boolean p1, Lb1/h;->j:Z

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    :catchall_1
    move-exception v1

    .line 66
    invoke-static {v0, p1}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :cond_1
    :goto_0
    const-string v0, "request raw remote menu fail"

    .line 71
    .line 72
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getCdnMainUrl()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p1, "/res/raw/menu_ui.json"

    .line 94
    .line 95
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string v0, "request "

    .line 103
    .line 104
    invoke-static {v0, p1}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, LD0/d;->b:Ljava/util/Map;

    .line 116
    .line 117
    new-instance v2, LA0/h;

    .line 118
    .line 119
    const/16 v3, 0x16

    .line 120
    .line 121
    invoke-direct {v2, v1, v3}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 122
    .line 123
    .line 124
    invoke-static {p1, v0, v2}, LD/h;->p(Ljava/lang/String;Ljava/util/Map;LM0/l;)V

    .line 125
    .line 126
    .line 127
    :goto_1
    sget-object p1, LE0/i;->a:LE0/i;

    .line 128
    .line 129
    return-object p1
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LA0/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v0}, LA0/l;->p(Landroid/content/Context;)LA0/b0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 23
    .line 24
    invoke-static {v0}, LA0/l;->l(Landroid/content/Context;)LA0/V;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :pswitch_1
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 39
    .line 40
    invoke-static {v0}, LA0/l;->j(Landroid/content/Context;)LA0/S;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/4 v0, 0x0

    .line 49
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    :pswitch_2
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 55
    .line 56
    invoke-static {v0}, LA0/l;->m(Landroid/content/Context;)LA0/W;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/4 v0, 0x0

    .line 65
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0

    .line 70
    :pswitch_3
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 71
    .line 72
    invoke-static {v0}, LA0/l;->k(Landroid/content/Context;)LA0/U;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    const/4 v0, 0x0

    .line 81
    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :pswitch_4
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 87
    .line 88
    invoke-static {v0}, LA0/l;->i(Landroid/content/Context;)LA0/N;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    iget-object v0, v0, LA0/N;->d:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    const/4 v1, 0x1

    .line 101
    xor-int/2addr v0, v1

    .line 102
    if-ne v0, v1, :cond_5

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_5
    const/4 v1, 0x0

    .line 106
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    return-object v0

    .line 111
    :pswitch_5
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 112
    .line 113
    invoke-static {v0}, LA0/l;->g(Landroid/content/Context;)LA0/z;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_6

    .line 118
    .line 119
    const/4 v0, 0x1

    .line 120
    goto :goto_6

    .line 121
    :cond_6
    const/4 v0, 0x0

    .line 122
    :goto_6
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :pswitch_6
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 128
    .line 129
    invoke-static {v0}, LA0/l;->o(Landroid/content/Context;)LA0/a0;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    const/4 v0, 0x1

    .line 136
    goto :goto_7

    .line 137
    :cond_7
    const/4 v0, 0x0

    .line 138
    :goto_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    return-object v0

    .line 143
    :pswitch_7
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 144
    .line 145
    invoke-static {v0}, LA0/l;->e(Landroid/content/Context;)LA0/i;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v0, :cond_8

    .line 150
    .line 151
    const/4 v0, 0x1

    .line 152
    goto :goto_8

    .line 153
    :cond_8
    const/4 v0, 0x0

    .line 154
    :goto_8
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :pswitch_8
    iget-object v0, p0, LA0/h;->b:Landroid/content/Context;

    .line 160
    .line 161
    invoke-static {v0}, LA0/l;->c(Landroid/content/Context;)LA0/b;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    if-eqz v1, :cond_9

    .line 166
    .line 167
    invoke-static {v0}, LA0/l;->d(Landroid/content/Context;)LA0/c;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-eqz v1, :cond_9

    .line 172
    .line 173
    invoke-static {v0}, LA0/l;->q(Landroid/content/Context;)LA0/d;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-eqz v0, :cond_9

    .line 178
    .line 179
    const/4 v0, 0x1

    .line 180
    goto :goto_9

    .line 181
    :cond_9
    const/4 v0, 0x0

    .line 182
    :goto_9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    return-object v0

    .line 187
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v3, "getParameterTypes(...)"

    .line 4
    .line 5
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    const-class v5, Ljava/lang/Object;

    .line 8
    .line 9
    const-string v6, "com.tencent.mm.ui.contact"

    .line 10
    .line 11
    sget-object v9, LF0/s;->a:LF0/s;

    .line 12
    .line 13
    const/16 v10, 0x8

    .line 14
    .line 15
    const-string v0, "contact"

    .line 16
    .line 17
    const-string v11, "getClassLoader(...)"

    .line 18
    .line 19
    const-string v13, "bridge"

    .line 20
    .line 21
    const/4 v14, 0x1

    .line 22
    iget-object v15, v1, LA0/h;->b:Landroid/content/Context;

    .line 23
    .line 24
    const/4 v12, 0x0

    .line 25
    iget v2, v1, LA0/h;->a:I

    .line 26
    .line 27
    packed-switch v2, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    :pswitch_0
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, LD0/c;

    .line 33
    .line 34
    const-string v2, "cdnRes"

    .line 35
    .line 36
    invoke-static {v0, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, v0, LD0/c;->d:Ljava/lang/Throwable;

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    iget v2, v0, LD0/c;->a:I

    .line 44
    .line 45
    const/16 v3, 0xc8

    .line 46
    .line 47
    if-ne v2, v3, :cond_1

    .line 48
    .line 49
    iget-object v2, v0, LD0/c;->c:[B

    .line 50
    .line 51
    array-length v2, v2

    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v15}, LN0/g;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, v0, LD0/c;->c:[B

    .line 59
    .line 60
    new-instance v2, Ljava/io/FileOutputStream;

    .line 61
    .line 62
    new-instance v3, Ljava/io/File;

    .line 63
    .line 64
    invoke-virtual {v15}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const-string v5, "res/raw/menu_ui.json"

    .line 69
    .line 70
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 74
    .line 75
    .line 76
    :try_start_0
    invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 80
    .line 81
    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    sput-wide v2, Lb1/h;->k:J

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object v3, v0

    .line 91
    :try_start_1
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    invoke-static {v2, v3}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw v0

    .line 97
    :cond_1
    :goto_0
    const-string v2, "request jscdn remote menu fail"

    .line 98
    .line 99
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :goto_1
    sput-boolean v12, Lb1/h;->j:Z

    .line 107
    .line 108
    sget-object v0, LE0/i;->a:LE0/i;

    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_1
    invoke-direct/range {p0 .. p1}, LA0/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0

    .line 116
    :pswitch_2
    invoke-direct/range {p0 .. p1}, LA0/h;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0

    .line 121
    :pswitch_3
    move-object/from16 v2, p1

    .line 122
    .line 123
    check-cast v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 124
    .line 125
    invoke-static {v2, v13}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v15}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-static {v3, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v4, "com.tencent.mm.ui"

    .line 136
    .line 137
    invoke-static {v4}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    const-string v6, "MvvmContactListUI"

    .line 142
    .line 143
    const-string v11, "ContactListUI"

    .line 144
    .line 145
    const-string v13, "label_name"

    .line 146
    .line 147
    filled-new-array {v6, v11, v13}, [Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    invoke-static {v11}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    invoke-static {v2, v5, v11, v12}, LA0/g;->u(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    new-instance v11, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v15

    .line 172
    if-eqz v15, :cond_4

    .line 173
    .line 174
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    move-object v7, v15

    .line 179
    check-cast v7, Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v7, v6, v12}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v16

    .line 185
    if-nez v16, :cond_3

    .line 186
    .line 187
    const-string v8, "ContactList"

    .line 188
    .line 189
    invoke-static {v7, v8, v12}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    if-eqz v7, :cond_2

    .line 194
    .line 195
    :cond_3
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_4
    invoke-static {v11}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-static {v5}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 208
    .line 209
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-static {v4}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v2, v4, v0, v14}, LA0/g;->u(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v0, v6}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 225
    .line 226
    .line 227
    const-string v0, "com.tencent.mm.ui.mvvm"

    .line 228
    .line 229
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    const-string v4, "adapter"

    .line 234
    .line 235
    invoke-static {v4}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-static {v2, v0, v4, v14}, LA0/g;->u(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {v0, v6}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 244
    .line 245
    .line 246
    new-instance v4, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    :cond_5
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_7

    .line 260
    .line 261
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Ljava/lang/String;

    .line 266
    .line 267
    :try_start_2
    invoke-static {v0, v12, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 271
    goto :goto_4

    .line 272
    :catchall_2
    move-exception v0

    .line 273
    new-instance v7, LE0/d;

    .line 274
    .line 275
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    move-object v0, v7

    .line 279
    :goto_4
    nop

    .line 280
    instance-of v7, v0, LE0/d;

    .line 281
    .line 282
    if-eqz v7, :cond_6

    .line 283
    .line 284
    const/4 v0, 0x0

    .line 285
    :cond_6
    check-cast v0, Ljava/lang/Class;

    .line 286
    .line 287
    if-eqz v0, :cond_5

    .line 288
    .line 289
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    :cond_8
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-eqz v4, :cond_9

    .line 307
    .line 308
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    move-object v6, v4

    .line 313
    check-cast v6, Ljava/lang/Class;

    .line 314
    .line 315
    invoke-static {v6}, LA0/g;->J(Ljava/lang/Class;)Z

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    if-eqz v6, :cond_8

    .line 320
    .line 321
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    goto :goto_5

    .line 325
    :cond_9
    new-instance v3, LA0/e;

    .line 326
    .line 327
    const/16 v4, 0xe

    .line 328
    .line 329
    invoke-direct {v3, v4}, LA0/e;-><init>(I)V

    .line 330
    .line 331
    .line 332
    new-instance v4, LA0/f;

    .line 333
    .line 334
    const/16 v6, 0xf

    .line 335
    .line 336
    invoke-direct {v4, v6, v3}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    invoke-static {v0, v4}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    new-instance v3, Ljava/util/ArrayList;

    .line 344
    .line 345
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 350
    .line 351
    .line 352
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    if-eqz v4, :cond_a

    .line 361
    .line 362
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    check-cast v4, Ljava/lang/Class;

    .line 367
    .line 368
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_a
    invoke-static {v3}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    const-string v3, "label_id"

    .line 385
    .line 386
    const-string v4, "INTENT_KEY_SEARCH_LABEL_USERNAME_LIST"

    .line 387
    .line 388
    filled-new-array {v4, v13, v3}, [Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-static {v3}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    const-string v4, "k12"

    .line 397
    .line 398
    const-string v6, "mim"

    .line 399
    .line 400
    filled-new-array {v6, v4}, [Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    invoke-static {v4}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    invoke-static {v2, v3, v4}, LA0/g;->A(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    invoke-static {v6}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    invoke-static {v2, v3}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    if-eqz v3, :cond_b

    .line 433
    .line 434
    const-string v3, "com.tencent.mm.ui.mvvm.MvvmContactListUI"

    .line 435
    .line 436
    invoke-static {v3}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    :cond_b
    invoke-static {v5}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    invoke-static {v3}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-static {v3, v10}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    if-eqz v4, :cond_c

    .line 457
    .line 458
    goto :goto_7

    .line 459
    :cond_c
    move-object v9, v0

    .line 460
    :goto_7
    invoke-static {v9}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    const/16 v4, 0xc

    .line 469
    .line 470
    invoke-static {v0, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    if-eqz v4, :cond_d

    .line 479
    .line 480
    invoke-static {v6}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    :cond_d
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    const/4 v4, 0x6

    .line 493
    invoke-static {v2, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    new-instance v4, LA0/a0;

    .line 498
    .line 499
    invoke-direct {v4, v3, v0, v2}, LA0/a0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 500
    .line 501
    .line 502
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    if-nez v0, :cond_e

    .line 507
    .line 508
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-nez v0, :cond_e

    .line 513
    .line 514
    move-object v12, v4

    .line 515
    goto :goto_8

    .line 516
    :cond_e
    const/4 v12, 0x0

    .line 517
    :goto_8
    return-object v12

    .line 518
    :pswitch_4
    invoke-direct/range {p0 .. p1}, LA0/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    return-object v0

    .line 523
    :pswitch_5
    invoke-direct/range {p0 .. p1}, LA0/h;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    return-object v0

    .line 528
    :pswitch_6
    invoke-direct/range {p0 .. p1}, LA0/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    return-object v0

    .line 533
    :pswitch_7
    invoke-direct/range {p0 .. p1}, LA0/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    return-object v0

    .line 538
    :pswitch_8
    invoke-direct/range {p0 .. p1}, LA0/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    return-object v0

    .line 543
    :pswitch_9
    move-object/from16 v2, p1

    .line 544
    .line 545
    check-cast v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 546
    .line 547
    invoke-static {v2, v13}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v15}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    invoke-static {v7, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-static {v6}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 558
    .line 559
    .line 560
    move-result-object v8

    .line 561
    const-string v11, "SelectContact"

    .line 562
    .line 563
    const-string v13, "SelectContactUI"

    .line 564
    .line 565
    const-string v15, "OnlyChatContactMgrUI"

    .line 566
    .line 567
    filled-new-array {v13, v15, v11}, [Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v11

    .line 571
    invoke-static {v11}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 572
    .line 573
    .line 574
    move-result-object v11

    .line 575
    invoke-static {v2, v8, v11, v12}, LA0/g;->u(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v8

    .line 579
    new-instance v11, Ljava/util/ArrayList;

    .line 580
    .line 581
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 582
    .line 583
    .line 584
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 585
    .line 586
    .line 587
    move-result-object v8

    .line 588
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 589
    .line 590
    .line 591
    move-result v19

    .line 592
    if-eqz v19, :cond_11

    .line 593
    .line 594
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v10

    .line 598
    move-object v14, v10

    .line 599
    check-cast v14, Ljava/lang/String;

    .line 600
    .line 601
    invoke-static {v14, v13, v12}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 602
    .line 603
    .line 604
    move-result v21

    .line 605
    if-nez v21, :cond_10

    .line 606
    .line 607
    invoke-static {v14, v15, v12}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 608
    .line 609
    .line 610
    move-result v14

    .line 611
    if-eqz v14, :cond_f

    .line 612
    .line 613
    goto :goto_b

    .line 614
    :cond_f
    :goto_a
    const/16 v10, 0x8

    .line 615
    .line 616
    const/4 v14, 0x1

    .line 617
    goto :goto_9

    .line 618
    :cond_10
    :goto_b
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    goto :goto_a

    .line 622
    :cond_11
    invoke-static {v11}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 623
    .line 624
    .line 625
    move-result-object v8

    .line 626
    invoke-static {v8}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 627
    .line 628
    .line 629
    move-result-object v8

    .line 630
    new-instance v10, Ljava/util/LinkedHashSet;

    .line 631
    .line 632
    invoke-direct {v10}, Ljava/util/LinkedHashSet;-><init>()V

    .line 633
    .line 634
    .line 635
    const-string v11, "com.tencent.mm.ui.contact.h0"

    .line 636
    .line 637
    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    invoke-static {v6}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 641
    .line 642
    .line 643
    move-result-object v6

    .line 644
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    const/4 v11, 0x1

    .line 649
    invoke-static {v2, v6, v0, v11}, LA0/g;->u(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-static {v0, v10}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 654
    .line 655
    .line 656
    new-instance v6, Ljava/util/ArrayList;

    .line 657
    .line 658
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 659
    .line 660
    .line 661
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 662
    .line 663
    .line 664
    move-result-object v10

    .line 665
    :cond_12
    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    if-eqz v0, :cond_14

    .line 670
    .line 671
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    check-cast v0, Ljava/lang/String;

    .line 676
    .line 677
    :try_start_3
    invoke-static {v0, v12, v7}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 681
    goto :goto_d

    .line 682
    :catchall_3
    move-exception v0

    .line 683
    new-instance v11, LE0/d;

    .line 684
    .line 685
    invoke-direct {v11, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 686
    .line 687
    .line 688
    move-object v0, v11

    .line 689
    :goto_d
    nop

    .line 690
    instance-of v11, v0, LE0/d;

    .line 691
    .line 692
    if-eqz v11, :cond_13

    .line 693
    .line 694
    const/4 v0, 0x0

    .line 695
    :cond_13
    check-cast v0, Ljava/lang/Class;

    .line 696
    .line 697
    if-eqz v0, :cond_12

    .line 698
    .line 699
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    goto :goto_c

    .line 703
    :cond_14
    new-instance v0, Ljava/util/ArrayList;

    .line 704
    .line 705
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 709
    .line 710
    .line 711
    move-result-object v6

    .line 712
    :cond_15
    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 713
    .line 714
    .line 715
    move-result v7

    .line 716
    if-eqz v7, :cond_16

    .line 717
    .line 718
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v7

    .line 722
    move-object v10, v7

    .line 723
    check-cast v10, Ljava/lang/Class;

    .line 724
    .line 725
    const-class v11, Landroid/widget/ListAdapter;

    .line 726
    .line 727
    invoke-virtual {v11, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 728
    .line 729
    .line 730
    move-result v10

    .line 731
    if-eqz v10, :cond_15

    .line 732
    .line 733
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    goto :goto_e

    .line 737
    :cond_16
    new-instance v6, Ljava/util/ArrayList;

    .line 738
    .line 739
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 743
    .line 744
    .line 745
    move-result-object v7

    .line 746
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 747
    .line 748
    .line 749
    move-result v0

    .line 750
    if-eqz v0, :cond_23

    .line 751
    .line 752
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v10

    .line 756
    move-object v0, v10

    .line 757
    check-cast v0, Ljava/lang/Class;

    .line 758
    .line 759
    const-string v11, "clazz"

    .line 760
    .line 761
    invoke-static {v0, v11}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    new-instance v11, Ljava/util/ArrayList;

    .line 765
    .line 766
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 767
    .line 768
    .line 769
    move-object v14, v0

    .line 770
    :goto_10
    if-eqz v14, :cond_18

    .line 771
    .line 772
    invoke-virtual {v14, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    move-result v0

    .line 776
    if-nez v0, :cond_18

    .line 777
    .line 778
    :try_start_4
    invoke-virtual {v14}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 779
    .line 780
    .line 781
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 782
    move/from16 v21, v12

    .line 783
    .line 784
    :try_start_5
    const-string v12, "getDeclaredMethods(...)"

    .line 785
    .line 786
    invoke-static {v0, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 790
    .line 791
    .line 792
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 793
    goto :goto_12

    .line 794
    :catchall_4
    move-exception v0

    .line 795
    goto :goto_11

    .line 796
    :catchall_5
    move-exception v0

    .line 797
    move/from16 v21, v12

    .line 798
    .line 799
    :goto_11
    new-instance v12, LE0/d;

    .line 800
    .line 801
    invoke-direct {v12, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 802
    .line 803
    .line 804
    move-object v0, v12

    .line 805
    :goto_12
    nop

    .line 806
    instance-of v12, v0, LE0/d;

    .line 807
    .line 808
    if-eqz v12, :cond_17

    .line 809
    .line 810
    move-object v0, v9

    .line 811
    :cond_17
    check-cast v0, Ljava/util/Collection;

    .line 812
    .line 813
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 814
    .line 815
    .line 816
    invoke-virtual {v14}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 817
    .line 818
    .line 819
    move-result-object v14

    .line 820
    move/from16 v12, v21

    .line 821
    .line 822
    goto :goto_10

    .line 823
    :cond_18
    move/from16 v21, v12

    .line 824
    .line 825
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 826
    .line 827
    .line 828
    move-result v0

    .line 829
    if-eqz v0, :cond_1a

    .line 830
    .line 831
    :cond_19
    move/from16 v0, v21

    .line 832
    .line 833
    goto :goto_14

    .line 834
    :cond_1a
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 839
    .line 840
    .line 841
    move-result v12

    .line 842
    if-eqz v12, :cond_19

    .line 843
    .line 844
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v12

    .line 848
    check-cast v12, Ljava/lang/reflect/Method;

    .line 849
    .line 850
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v14

    .line 854
    move-object/from16 p1, v0

    .line 855
    .line 856
    const-string v0, "getCount"

    .line 857
    .line 858
    invoke-static {v14, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 859
    .line 860
    .line 861
    move-result v0

    .line 862
    if-eqz v0, :cond_1b

    .line 863
    .line 864
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 869
    .line 870
    .line 871
    array-length v0, v0

    .line 872
    if-nez v0, :cond_1b

    .line 873
    .line 874
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    invoke-static {v0, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v0

    .line 882
    if-eqz v0, :cond_1b

    .line 883
    .line 884
    const/4 v0, 0x1

    .line 885
    goto :goto_14

    .line 886
    :cond_1b
    move-object/from16 v0, p1

    .line 887
    .line 888
    goto :goto_13

    .line 889
    :goto_14
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 890
    .line 891
    .line 892
    move-result v12

    .line 893
    if-eqz v12, :cond_1d

    .line 894
    .line 895
    :cond_1c
    move/from16 p1, v0

    .line 896
    .line 897
    move/from16 v0, v21

    .line 898
    .line 899
    goto :goto_16

    .line 900
    :cond_1d
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 901
    .line 902
    .line 903
    move-result-object v12

    .line 904
    :goto_15
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 905
    .line 906
    .line 907
    move-result v14

    .line 908
    if-eqz v14, :cond_1c

    .line 909
    .line 910
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v14

    .line 914
    check-cast v14, Ljava/lang/reflect/Method;

    .line 915
    .line 916
    move/from16 p1, v0

    .line 917
    .line 918
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    const-string v1, "getItem"

    .line 923
    .line 924
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    move-result v0

    .line 928
    if-eqz v0, :cond_1e

    .line 929
    .line 930
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    array-length v0, v0

    .line 935
    const/4 v1, 0x1

    .line 936
    if-ne v0, v1, :cond_1e

    .line 937
    .line 938
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    aget-object v0, v0, v21

    .line 943
    .line 944
    invoke-static {v0, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    move-result v0

    .line 948
    if-eqz v0, :cond_1e

    .line 949
    .line 950
    const/4 v0, 0x1

    .line 951
    goto :goto_16

    .line 952
    :cond_1e
    move-object/from16 v1, p0

    .line 953
    .line 954
    move/from16 v0, p1

    .line 955
    .line 956
    goto :goto_15

    .line 957
    :goto_16
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 958
    .line 959
    .line 960
    move-result v1

    .line 961
    if-eqz v1, :cond_20

    .line 962
    .line 963
    :cond_1f
    move/from16 v1, v21

    .line 964
    .line 965
    goto :goto_17

    .line 966
    :cond_20
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    :cond_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 971
    .line 972
    .line 973
    move-result v11

    .line 974
    if-eqz v11, :cond_1f

    .line 975
    .line 976
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v11

    .line 980
    check-cast v11, Ljava/lang/reflect/Method;

    .line 981
    .line 982
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v12

    .line 986
    const-string v14, "getView"

    .line 987
    .line 988
    invoke-static {v12, v14}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    move-result v12

    .line 992
    if-eqz v12, :cond_21

    .line 993
    .line 994
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 995
    .line 996
    .line 997
    move-result-object v12

    .line 998
    array-length v12, v12

    .line 999
    const/4 v14, 0x3

    .line 1000
    if-ne v12, v14, :cond_21

    .line 1001
    .line 1002
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v11

    .line 1006
    aget-object v11, v11, v21

    .line 1007
    .line 1008
    invoke-static {v11, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v11

    .line 1012
    if-eqz v11, :cond_21

    .line 1013
    .line 1014
    const/4 v1, 0x1

    .line 1015
    :goto_17
    if-eqz p1, :cond_22

    .line 1016
    .line 1017
    if-eqz v0, :cond_22

    .line 1018
    .line 1019
    if-eqz v1, :cond_22

    .line 1020
    .line 1021
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1022
    .line 1023
    .line 1024
    :cond_22
    move-object/from16 v1, p0

    .line 1025
    .line 1026
    move/from16 v12, v21

    .line 1027
    .line 1028
    goto/16 :goto_f

    .line 1029
    .line 1030
    :cond_23
    new-instance v0, LA0/e;

    .line 1031
    .line 1032
    const/4 v1, 0x5

    .line 1033
    invoke-direct {v0, v1}, LA0/e;-><init>(I)V

    .line 1034
    .line 1035
    .line 1036
    new-instance v1, LA0/f;

    .line 1037
    .line 1038
    const/4 v3, 0x7

    .line 1039
    invoke-direct {v1, v3, v0}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-static {v6, v1}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    new-instance v1, Ljava/util/HashSet;

    .line 1047
    .line 1048
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1049
    .line 1050
    .line 1051
    new-instance v3, Ljava/util/ArrayList;

    .line 1052
    .line 1053
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1054
    .line 1055
    .line 1056
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    :cond_24
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1061
    .line 1062
    .line 1063
    move-result v4

    .line 1064
    if-eqz v4, :cond_25

    .line 1065
    .line 1066
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v4

    .line 1070
    move-object v5, v4

    .line 1071
    check-cast v5, Ljava/lang/Class;

    .line 1072
    .line 1073
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v5

    .line 1077
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v5

    .line 1081
    if-eqz v5, :cond_24

    .line 1082
    .line 1083
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    goto :goto_18

    .line 1087
    :cond_25
    filled-new-array {v13, v15}, [Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    const-string v1, "mil"

    .line 1096
    .line 1097
    invoke-static {v1}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v4

    .line 1101
    invoke-static {v2, v0, v4}, LA0/g;->A(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    invoke-static {v1}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v2

    .line 1109
    invoke-static {v0, v2}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v0

    .line 1121
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 1122
    .line 1123
    .line 1124
    move-result v2

    .line 1125
    if-eqz v2, :cond_26

    .line 1126
    .line 1127
    const-string v2, "com.tencent.mm.ui.contact.SelectContactUI"

    .line 1128
    .line 1129
    invoke-static {v2}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v8

    .line 1133
    :cond_26
    invoke-static {v8}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v2

    .line 1137
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v2

    .line 1141
    const/16 v4, 0x8

    .line 1142
    .line 1143
    invoke-static {v2, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v2

    .line 1147
    new-instance v4, Ljava/util/ArrayList;

    .line 1148
    .line 1149
    invoke-static {v3}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1150
    .line 1151
    .line 1152
    move-result v5

    .line 1153
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v3

    .line 1160
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1161
    .line 1162
    .line 1163
    move-result v5

    .line 1164
    if-eqz v5, :cond_27

    .line 1165
    .line 1166
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v5

    .line 1170
    check-cast v5, Ljava/lang/Class;

    .line 1171
    .line 1172
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v5

    .line 1176
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1177
    .line 1178
    .line 1179
    goto :goto_19

    .line 1180
    :cond_27
    invoke-static {v4}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v3

    .line 1184
    invoke-static {v3}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v3

    .line 1188
    const/16 v4, 0xc

    .line 1189
    .line 1190
    invoke-static {v3, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v3

    .line 1194
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1195
    .line 1196
    .line 1197
    move-result v4

    .line 1198
    if-eqz v4, :cond_28

    .line 1199
    .line 1200
    invoke-static {v1}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    :cond_28
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v0

    .line 1208
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    const/4 v4, 0x6

    .line 1213
    invoke-static {v0, v4}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    new-instance v1, LA0/z;

    .line 1218
    .line 1219
    invoke-direct {v1, v2, v3, v0}, LA0/z;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 1220
    .line 1221
    .line 1222
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1223
    .line 1224
    .line 1225
    move-result v2

    .line 1226
    if-nez v2, :cond_29

    .line 1227
    .line 1228
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1229
    .line 1230
    .line 1231
    move-result v2

    .line 1232
    if-nez v2, :cond_29

    .line 1233
    .line 1234
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v0

    .line 1238
    if-nez v0, :cond_29

    .line 1239
    .line 1240
    move-object v12, v1

    .line 1241
    goto :goto_1a

    .line 1242
    :cond_29
    const/4 v12, 0x0

    .line 1243
    :goto_1a
    return-object v12

    .line 1244
    :pswitch_a
    invoke-direct/range {p0 .. p1}, LA0/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    return-object v0

    .line 1249
    :pswitch_b
    invoke-direct/range {p0 .. p1}, LA0/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v0

    .line 1253
    return-object v0

    .line 1254
    :pswitch_c
    move/from16 v21, v12

    .line 1255
    .line 1256
    move-object/from16 v1, p1

    .line 1257
    .line 1258
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1259
    .line 1260
    invoke-static {v1, v13}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v15}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v2

    .line 1267
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 1268
    .line 1269
    .line 1270
    const-string v0, "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment"

    .line 1271
    .line 1272
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v0

    .line 1276
    const-string v7, "MvvmAddressUIFragment"

    .line 1277
    .line 1278
    const-string v8, "AddressUIFragment"

    .line 1279
    .line 1280
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v7

    .line 1284
    invoke-static {v7}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v7

    .line 1288
    invoke-static {v2, v1, v0, v7}, LA0/g;->t(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;)Ljava/lang/Class;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v0

    .line 1292
    if-nez v0, :cond_37

    .line 1293
    .line 1294
    :try_start_6
    new-instance v0, LW0/a;

    .line 1295
    .line 1296
    move/from16 v7, v21

    .line 1297
    .line 1298
    invoke-direct {v0, v7}, LW0/a;-><init>(I)V

    .line 1299
    .line 1300
    .line 1301
    filled-new-array {v6}, [Ljava/lang/String;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v7

    .line 1305
    invoke-virtual {v0, v7}, LW0/a;->Z([Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    new-instance v7, LZ0/a;

    .line 1309
    .line 1310
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 1311
    .line 1312
    .line 1313
    const-string v8, "Address"

    .line 1314
    .line 1315
    const/4 v9, 0x0

    .line 1316
    const/4 v11, 0x1

    .line 1317
    invoke-virtual {v7, v8, v11, v9}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 1318
    .line 1319
    .line 1320
    iput-object v7, v0, LW0/a;->f:LD/h;

    .line 1321
    .line 1322
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    new-instance v7, Ljava/util/ArrayList;

    .line 1327
    .line 1328
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v8

    .line 1335
    :cond_2a
    :goto_1b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1336
    .line 1337
    .line 1338
    move-result v0

    .line 1339
    if-eqz v0, :cond_2c

    .line 1340
    .line 1341
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v0

    .line 1345
    check-cast v0, Lb1/d;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 1346
    .line 1347
    :try_start_7
    invoke-virtual {v0, v2}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 1351
    goto :goto_1c

    .line 1352
    :catchall_6
    move-exception v0

    .line 1353
    :try_start_8
    new-instance v9, LE0/d;

    .line 1354
    .line 1355
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1356
    .line 1357
    .line 1358
    move-object v0, v9

    .line 1359
    :goto_1c
    nop

    .line 1360
    instance-of v9, v0, LE0/d;

    .line 1361
    .line 1362
    if-eqz v9, :cond_2b

    .line 1363
    .line 1364
    const/4 v0, 0x0

    .line 1365
    :cond_2b
    check-cast v0, Ljava/lang/Class;

    .line 1366
    .line 1367
    if-eqz v0, :cond_2a

    .line 1368
    .line 1369
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1370
    .line 1371
    .line 1372
    goto :goto_1b

    .line 1373
    :catchall_7
    move-exception v0

    .line 1374
    goto/16 :goto_20

    .line 1375
    .line 1376
    :cond_2c
    new-instance v0, Ljava/util/ArrayList;

    .line 1377
    .line 1378
    invoke-static {v7}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1379
    .line 1380
    .line 1381
    move-result v8

    .line 1382
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v7

    .line 1389
    :goto_1d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1390
    .line 1391
    .line 1392
    move-result v8

    .line 1393
    if-eqz v8, :cond_2d

    .line 1394
    .line 1395
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v8

    .line 1399
    check-cast v8, Ljava/lang/Class;

    .line 1400
    .line 1401
    invoke-static {v8}, LA0/g;->M(Ljava/lang/Class;)I

    .line 1402
    .line 1403
    .line 1404
    move-result v9

    .line 1405
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v9

    .line 1409
    new-instance v10, LE0/c;

    .line 1410
    .line 1411
    invoke-direct {v10, v8, v9}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1415
    .line 1416
    .line 1417
    goto :goto_1d

    .line 1418
    :cond_2d
    new-instance v7, Ljava/util/ArrayList;

    .line 1419
    .line 1420
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v0

    .line 1427
    :cond_2e
    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1428
    .line 1429
    .line 1430
    move-result v8

    .line 1431
    if-eqz v8, :cond_2f

    .line 1432
    .line 1433
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v8

    .line 1437
    move-object v9, v8

    .line 1438
    check-cast v9, LE0/c;

    .line 1439
    .line 1440
    iget-object v9, v9, LE0/c;->b:Ljava/lang/Object;

    .line 1441
    .line 1442
    check-cast v9, Ljava/lang/Number;

    .line 1443
    .line 1444
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1445
    .line 1446
    .line 1447
    move-result v9

    .line 1448
    if-lez v9, :cond_2e

    .line 1449
    .line 1450
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1451
    .line 1452
    .line 1453
    goto :goto_1e

    .line 1454
    :cond_2f
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v0

    .line 1458
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1459
    .line 1460
    .line 1461
    move-result v7

    .line 1462
    if-nez v7, :cond_30

    .line 1463
    .line 1464
    const/4 v7, 0x0

    .line 1465
    goto :goto_1f

    .line 1466
    :cond_30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v7

    .line 1470
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1471
    .line 1472
    .line 1473
    move-result v8

    .line 1474
    if-nez v8, :cond_31

    .line 1475
    .line 1476
    goto :goto_1f

    .line 1477
    :cond_31
    move-object v8, v7

    .line 1478
    check-cast v8, LE0/c;

    .line 1479
    .line 1480
    iget-object v8, v8, LE0/c;->b:Ljava/lang/Object;

    .line 1481
    .line 1482
    check-cast v8, Ljava/lang/Number;

    .line 1483
    .line 1484
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 1485
    .line 1486
    .line 1487
    move-result v8

    .line 1488
    :cond_32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v9

    .line 1492
    move-object v10, v9

    .line 1493
    check-cast v10, LE0/c;

    .line 1494
    .line 1495
    iget-object v10, v10, LE0/c;->b:Ljava/lang/Object;

    .line 1496
    .line 1497
    check-cast v10, Ljava/lang/Number;

    .line 1498
    .line 1499
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1500
    .line 1501
    .line 1502
    move-result v10

    .line 1503
    if-ge v8, v10, :cond_33

    .line 1504
    .line 1505
    move-object v7, v9

    .line 1506
    move v8, v10

    .line 1507
    :cond_33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1508
    .line 1509
    .line 1510
    move-result v9

    .line 1511
    if-nez v9, :cond_32

    .line 1512
    .line 1513
    :goto_1f
    check-cast v7, LE0/c;

    .line 1514
    .line 1515
    if-eqz v7, :cond_34

    .line 1516
    .line 1517
    iget-object v0, v7, LE0/c;->a:Ljava/lang/Object;

    .line 1518
    .line 1519
    check-cast v0, Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 1520
    .line 1521
    goto :goto_21

    .line 1522
    :cond_34
    const/4 v0, 0x0

    .line 1523
    goto :goto_21

    .line 1524
    :goto_20
    new-instance v7, LE0/d;

    .line 1525
    .line 1526
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1527
    .line 1528
    .line 1529
    move-object v0, v7

    .line 1530
    :goto_21
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v7

    .line 1534
    if-eqz v7, :cond_35

    .line 1535
    .line 1536
    const-string v8, "contact dexkit fragment structure scan fail"

    .line 1537
    .line 1538
    filled-new-array {v8, v7}, [Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v7

    .line 1542
    invoke-static {v7}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1543
    .line 1544
    .line 1545
    :cond_35
    instance-of v7, v0, LE0/d;

    .line 1546
    .line 1547
    if-eqz v7, :cond_36

    .line 1548
    .line 1549
    const/4 v0, 0x0

    .line 1550
    :cond_36
    check-cast v0, Ljava/lang/Class;

    .line 1551
    .line 1552
    if-nez v0, :cond_37

    .line 1553
    .line 1554
    const-string v0, "contact dexkit fragment class missing"

    .line 1555
    .line 1556
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v0

    .line 1560
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1561
    .line 1562
    .line 1563
    :goto_22
    const/4 v12, 0x0

    .line 1564
    goto/16 :goto_43

    .line 1565
    .line 1566
    :cond_37
    move-object v7, v0

    .line 1567
    const-string v0, "com.tencent.mm.ui.contact.address.AddressLiveList"

    .line 1568
    .line 1569
    invoke-static {v0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v0

    .line 1573
    const-string v8, "AddressLiveList"

    .line 1574
    .line 1575
    invoke-static {v8}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v8

    .line 1579
    invoke-static {v2, v1, v0, v8}, LA0/g;->t(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;)Ljava/lang/Class;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v0

    .line 1583
    const/4 v8, 0x4

    .line 1584
    const-string v9, "getReturnType(...)"

    .line 1585
    .line 1586
    if-nez v0, :cond_48

    .line 1587
    .line 1588
    invoke-static {v7}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v0

    .line 1596
    :cond_38
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1597
    .line 1598
    .line 1599
    move-result v10

    .line 1600
    if-eqz v10, :cond_39

    .line 1601
    .line 1602
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v10

    .line 1606
    move-object v11, v10

    .line 1607
    check-cast v11, Ljava/lang/reflect/Method;

    .line 1608
    .line 1609
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v12

    .line 1613
    invoke-static {v12, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1614
    .line 1615
    .line 1616
    array-length v12, v12

    .line 1617
    if-nez v12, :cond_38

    .line 1618
    .line 1619
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v11

    .line 1623
    invoke-static {v11, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1624
    .line 1625
    .line 1626
    invoke-static {v11}, LA0/g;->N(Ljava/lang/Class;)I

    .line 1627
    .line 1628
    .line 1629
    move-result v11

    .line 1630
    if-lt v11, v8, :cond_38

    .line 1631
    .line 1632
    goto :goto_23

    .line 1633
    :cond_39
    const/4 v10, 0x0

    .line 1634
    :goto_23
    check-cast v10, Ljava/lang/reflect/Method;

    .line 1635
    .line 1636
    if-eqz v10, :cond_3a

    .line 1637
    .line 1638
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v0

    .line 1642
    if-eqz v0, :cond_3a

    .line 1643
    .line 1644
    goto/16 :goto_2b

    .line 1645
    .line 1646
    :cond_3a
    :try_start_9
    new-instance v0, LW0/a;

    .line 1647
    .line 1648
    const/4 v10, 0x0

    .line 1649
    invoke-direct {v0, v10}, LW0/a;-><init>(I)V

    .line 1650
    .line 1651
    .line 1652
    filled-new-array {v6}, [Ljava/lang/String;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v6

    .line 1656
    invoke-virtual {v0, v6}, LW0/a;->Z([Ljava/lang/String;)V

    .line 1657
    .line 1658
    .line 1659
    new-instance v6, LZ0/a;

    .line 1660
    .line 1661
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1662
    .line 1663
    .line 1664
    const-string v10, "LiveList"

    .line 1665
    .line 1666
    const/4 v11, 0x0

    .line 1667
    const/4 v12, 0x1

    .line 1668
    invoke-virtual {v6, v10, v12, v11}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 1669
    .line 1670
    .line 1671
    iput-object v6, v0, LW0/a;->f:LD/h;

    .line 1672
    .line 1673
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v0

    .line 1677
    new-instance v6, Ljava/util/ArrayList;

    .line 1678
    .line 1679
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1680
    .line 1681
    .line 1682
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v10

    .line 1686
    :cond_3b
    :goto_24
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1687
    .line 1688
    .line 1689
    move-result v0

    .line 1690
    if-eqz v0, :cond_3d

    .line 1691
    .line 1692
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v0

    .line 1696
    check-cast v0, Lb1/d;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1697
    .line 1698
    :try_start_a
    invoke-virtual {v0, v2}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1702
    goto :goto_25

    .line 1703
    :catchall_8
    move-exception v0

    .line 1704
    :try_start_b
    new-instance v11, LE0/d;

    .line 1705
    .line 1706
    invoke-direct {v11, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1707
    .line 1708
    .line 1709
    move-object v0, v11

    .line 1710
    :goto_25
    nop

    .line 1711
    instance-of v11, v0, LE0/d;

    .line 1712
    .line 1713
    if-eqz v11, :cond_3c

    .line 1714
    .line 1715
    const/4 v0, 0x0

    .line 1716
    :cond_3c
    check-cast v0, Ljava/lang/Class;

    .line 1717
    .line 1718
    if-eqz v0, :cond_3b

    .line 1719
    .line 1720
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1721
    .line 1722
    .line 1723
    goto :goto_24

    .line 1724
    :catchall_9
    move-exception v0

    .line 1725
    goto/16 :goto_29

    .line 1726
    .line 1727
    :cond_3d
    new-instance v0, Ljava/util/ArrayList;

    .line 1728
    .line 1729
    invoke-static {v6}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1730
    .line 1731
    .line 1732
    move-result v10

    .line 1733
    invoke-direct {v0, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 1734
    .line 1735
    .line 1736
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v6

    .line 1740
    :goto_26
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1741
    .line 1742
    .line 1743
    move-result v10

    .line 1744
    if-eqz v10, :cond_3e

    .line 1745
    .line 1746
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v10

    .line 1750
    check-cast v10, Ljava/lang/Class;

    .line 1751
    .line 1752
    invoke-static {v10}, LA0/g;->N(Ljava/lang/Class;)I

    .line 1753
    .line 1754
    .line 1755
    move-result v11

    .line 1756
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v11

    .line 1760
    new-instance v12, LE0/c;

    .line 1761
    .line 1762
    invoke-direct {v12, v10, v11}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1763
    .line 1764
    .line 1765
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1766
    .line 1767
    .line 1768
    goto :goto_26

    .line 1769
    :cond_3e
    new-instance v6, Ljava/util/ArrayList;

    .line 1770
    .line 1771
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v0

    .line 1778
    :cond_3f
    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1779
    .line 1780
    .line 1781
    move-result v10

    .line 1782
    if-eqz v10, :cond_40

    .line 1783
    .line 1784
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v10

    .line 1788
    move-object v11, v10

    .line 1789
    check-cast v11, LE0/c;

    .line 1790
    .line 1791
    iget-object v11, v11, LE0/c;->b:Ljava/lang/Object;

    .line 1792
    .line 1793
    check-cast v11, Ljava/lang/Number;

    .line 1794
    .line 1795
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1796
    .line 1797
    .line 1798
    move-result v11

    .line 1799
    if-lez v11, :cond_3f

    .line 1800
    .line 1801
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1802
    .line 1803
    .line 1804
    goto :goto_27

    .line 1805
    :cond_40
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v0

    .line 1809
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1810
    .line 1811
    .line 1812
    move-result v6

    .line 1813
    if-nez v6, :cond_41

    .line 1814
    .line 1815
    const/4 v6, 0x0

    .line 1816
    goto :goto_28

    .line 1817
    :cond_41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v6

    .line 1821
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1822
    .line 1823
    .line 1824
    move-result v10

    .line 1825
    if-nez v10, :cond_42

    .line 1826
    .line 1827
    goto :goto_28

    .line 1828
    :cond_42
    move-object v10, v6

    .line 1829
    check-cast v10, LE0/c;

    .line 1830
    .line 1831
    iget-object v10, v10, LE0/c;->b:Ljava/lang/Object;

    .line 1832
    .line 1833
    check-cast v10, Ljava/lang/Number;

    .line 1834
    .line 1835
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1836
    .line 1837
    .line 1838
    move-result v10

    .line 1839
    :cond_43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v11

    .line 1843
    move-object v12, v11

    .line 1844
    check-cast v12, LE0/c;

    .line 1845
    .line 1846
    iget-object v12, v12, LE0/c;->b:Ljava/lang/Object;

    .line 1847
    .line 1848
    check-cast v12, Ljava/lang/Number;

    .line 1849
    .line 1850
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 1851
    .line 1852
    .line 1853
    move-result v12

    .line 1854
    if-ge v10, v12, :cond_44

    .line 1855
    .line 1856
    move-object v6, v11

    .line 1857
    move v10, v12

    .line 1858
    :cond_44
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1859
    .line 1860
    .line 1861
    move-result v11

    .line 1862
    if-nez v11, :cond_43

    .line 1863
    .line 1864
    :goto_28
    check-cast v6, LE0/c;

    .line 1865
    .line 1866
    if-eqz v6, :cond_45

    .line 1867
    .line 1868
    iget-object v0, v6, LE0/c;->a:Ljava/lang/Object;

    .line 1869
    .line 1870
    check-cast v0, Ljava/lang/Class;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 1871
    .line 1872
    goto :goto_2a

    .line 1873
    :cond_45
    const/4 v0, 0x0

    .line 1874
    goto :goto_2a

    .line 1875
    :goto_29
    new-instance v6, LE0/d;

    .line 1876
    .line 1877
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1878
    .line 1879
    .line 1880
    move-object v0, v6

    .line 1881
    :goto_2a
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v6

    .line 1885
    if-eqz v6, :cond_46

    .line 1886
    .line 1887
    const-string v10, "contact dexkit live list structure scan fail"

    .line 1888
    .line 1889
    filled-new-array {v10, v6}, [Ljava/lang/Object;

    .line 1890
    .line 1891
    .line 1892
    move-result-object v6

    .line 1893
    invoke-static {v6}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1894
    .line 1895
    .line 1896
    :cond_46
    instance-of v6, v0, LE0/d;

    .line 1897
    .line 1898
    if-eqz v6, :cond_47

    .line 1899
    .line 1900
    const/4 v0, 0x0

    .line 1901
    :cond_47
    check-cast v0, Ljava/lang/Class;

    .line 1902
    .line 1903
    :goto_2b
    if-nez v0, :cond_48

    .line 1904
    .line 1905
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v0

    .line 1909
    const-string v1, "contact dexkit live list class missing"

    .line 1910
    .line 1911
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v0

    .line 1915
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1916
    .line 1917
    .line 1918
    goto/16 :goto_22

    .line 1919
    .line 1920
    :cond_48
    move-object v6, v0

    .line 1921
    invoke-static {v6}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v0

    .line 1925
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v0

    .line 1929
    :cond_49
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1930
    .line 1931
    .line 1932
    move-result v10

    .line 1933
    if-eqz v10, :cond_4a

    .line 1934
    .line 1935
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v10

    .line 1939
    move-object v11, v10

    .line 1940
    check-cast v11, Ljava/lang/reflect/Method;

    .line 1941
    .line 1942
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v12

    .line 1946
    array-length v12, v12

    .line 1947
    const/4 v13, 0x1

    .line 1948
    if-ne v12, v13, :cond_49

    .line 1949
    .line 1950
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v11

    .line 1954
    const/16 v21, 0x0

    .line 1955
    .line 1956
    aget-object v11, v11, v21

    .line 1957
    .line 1958
    const-class v12, Ljava/util/List;

    .line 1959
    .line 1960
    invoke-virtual {v12, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1961
    .line 1962
    .line 1963
    move-result v11

    .line 1964
    if-eqz v11, :cond_49

    .line 1965
    .line 1966
    goto :goto_2c

    .line 1967
    :cond_4a
    const/4 v10, 0x0

    .line 1968
    :goto_2c
    check-cast v10, Ljava/lang/reflect/Method;

    .line 1969
    .line 1970
    if-nez v10, :cond_4b

    .line 1971
    .line 1972
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v0

    .line 1976
    const-string v1, "contact dexkit live list submit missing"

    .line 1977
    .line 1978
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v0

    .line 1982
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1983
    .line 1984
    .line 1985
    goto/16 :goto_22

    .line 1986
    .line 1987
    :cond_4b
    invoke-static {v7}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v0

    .line 1991
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v0

    .line 1995
    :cond_4c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1996
    .line 1997
    .line 1998
    move-result v11

    .line 1999
    if-eqz v11, :cond_4d

    .line 2000
    .line 2001
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v11

    .line 2005
    move-object v12, v11

    .line 2006
    check-cast v12, Ljava/lang/reflect/Method;

    .line 2007
    .line 2008
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v13

    .line 2012
    invoke-static {v13, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2013
    .line 2014
    .line 2015
    array-length v13, v13

    .line 2016
    if-nez v13, :cond_4c

    .line 2017
    .line 2018
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v12

    .line 2022
    invoke-virtual {v6, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2023
    .line 2024
    .line 2025
    move-result v12

    .line 2026
    if-eqz v12, :cond_4c

    .line 2027
    .line 2028
    goto :goto_2d

    .line 2029
    :cond_4d
    const/4 v11, 0x0

    .line 2030
    :goto_2d
    check-cast v11, Ljava/lang/reflect/Method;

    .line 2031
    .line 2032
    const-string v0, "F0"

    .line 2033
    .line 2034
    if-nez v11, :cond_4e

    .line 2035
    .line 2036
    const-string v11, "G0"

    .line 2037
    .line 2038
    const-string v12, "I0"

    .line 2039
    .line 2040
    const-string v13, "z0"

    .line 2041
    .line 2042
    filled-new-array {v13, v11, v0, v12}, [Ljava/lang/String;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v11

    .line 2046
    invoke-static {v11}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v11

    .line 2050
    invoke-static {v7, v11}, LA0/g;->z(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v11

    .line 2054
    if-nez v11, :cond_4e

    .line 2055
    .line 2056
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v0

    .line 2060
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v1

    .line 2064
    const-string v2, "contact dexkit live list getter missing"

    .line 2065
    .line 2066
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v0

    .line 2070
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 2071
    .line 2072
    .line 2073
    goto/16 :goto_22

    .line 2074
    .line 2075
    :cond_4e
    invoke-static {v7}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v12

    .line 2079
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v12

    .line 2083
    :cond_4f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 2084
    .line 2085
    .line 2086
    move-result v13

    .line 2087
    if-eqz v13, :cond_50

    .line 2088
    .line 2089
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v13

    .line 2093
    move-object v14, v13

    .line 2094
    check-cast v14, Ljava/lang/reflect/Method;

    .line 2095
    .line 2096
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v15

    .line 2100
    invoke-static {v15, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2101
    .line 2102
    .line 2103
    array-length v15, v15

    .line 2104
    if-nez v15, :cond_4f

    .line 2105
    .line 2106
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v14

    .line 2110
    invoke-static {v14, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2111
    .line 2112
    .line 2113
    invoke-static {v14}, LA0/g;->K(Ljava/lang/Class;)Z

    .line 2114
    .line 2115
    .line 2116
    move-result v14

    .line 2117
    if-eqz v14, :cond_4f

    .line 2118
    .line 2119
    goto :goto_2e

    .line 2120
    :cond_50
    const/4 v13, 0x0

    .line 2121
    :goto_2e
    check-cast v13, Ljava/lang/reflect/Method;

    .line 2122
    .line 2123
    if-nez v13, :cond_51

    .line 2124
    .line 2125
    const-string v9, "E0"

    .line 2126
    .line 2127
    const-string v12, "H0"

    .line 2128
    .line 2129
    const-string v13, "y0"

    .line 2130
    .line 2131
    filled-new-array {v13, v0, v9, v12}, [Ljava/lang/String;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v0

    .line 2135
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v0

    .line 2139
    invoke-static {v7, v0}, LA0/g;->z(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v13

    .line 2143
    if-nez v13, :cond_51

    .line 2144
    .line 2145
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v0

    .line 2149
    const-string v1, "contact dexkit adapter getter missing"

    .line 2150
    .line 2151
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v0

    .line 2155
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 2156
    .line 2157
    .line 2158
    goto/16 :goto_22

    .line 2159
    .line 2160
    :cond_51
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2161
    .line 2162
    .line 2163
    move-result-object v0

    .line 2164
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 2165
    .line 2166
    .line 2167
    invoke-static {v0}, LA0/g;->K(Ljava/lang/Class;)Z

    .line 2168
    .line 2169
    .line 2170
    move-result v9

    .line 2171
    if-eqz v9, :cond_52

    .line 2172
    .line 2173
    goto :goto_2f

    .line 2174
    :cond_52
    const/4 v0, 0x0

    .line 2175
    :goto_2f
    if-nez v0, :cond_54

    .line 2176
    .line 2177
    :try_start_c
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v0

    .line 2181
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v0

    .line 2185
    const/4 v9, 0x0

    .line 2186
    invoke-static {v0, v9, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 2190
    goto :goto_30

    .line 2191
    :catchall_a
    move-exception v0

    .line 2192
    new-instance v9, LE0/d;

    .line 2193
    .line 2194
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 2195
    .line 2196
    .line 2197
    move-object v0, v9

    .line 2198
    :goto_30
    nop

    .line 2199
    instance-of v9, v0, LE0/d;

    .line 2200
    .line 2201
    if-eqz v9, :cond_53

    .line 2202
    .line 2203
    const/4 v0, 0x0

    .line 2204
    :cond_53
    check-cast v0, Ljava/lang/Class;

    .line 2205
    .line 2206
    if-nez v0, :cond_54

    .line 2207
    .line 2208
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v0

    .line 2212
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v1

    .line 2216
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v1

    .line 2220
    const-string v2, "contact dexkit adapter class missing"

    .line 2221
    .line 2222
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 2223
    .line 2224
    .line 2225
    move-result-object v0

    .line 2226
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 2227
    .line 2228
    .line 2229
    goto/16 :goto_22

    .line 2230
    .line 2231
    :cond_54
    new-instance v9, Ljava/util/ArrayList;

    .line 2232
    .line 2233
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 2234
    .line 2235
    .line 2236
    move-object v12, v0

    .line 2237
    :goto_31
    if-eqz v12, :cond_56

    .line 2238
    .line 2239
    invoke-virtual {v12, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2240
    .line 2241
    .line 2242
    move-result v14

    .line 2243
    if-nez v14, :cond_56

    .line 2244
    .line 2245
    invoke-static {v12}, LA0/g;->K(Ljava/lang/Class;)Z

    .line 2246
    .line 2247
    .line 2248
    move-result v14

    .line 2249
    if-eqz v14, :cond_55

    .line 2250
    .line 2251
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v14

    .line 2255
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2256
    .line 2257
    .line 2258
    :cond_55
    invoke-virtual {v12}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v12

    .line 2262
    goto :goto_31

    .line 2263
    :cond_56
    invoke-static {v9}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v9

    .line 2267
    invoke-static {v9}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v9

    .line 2271
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 2272
    .line 2273
    .line 2274
    move-result v12

    .line 2275
    if-eqz v12, :cond_57

    .line 2276
    .line 2277
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2278
    .line 2279
    .line 2280
    move-result-object v9

    .line 2281
    invoke-static {v9}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v9

    .line 2285
    :cond_57
    move-object/from16 v28, v9

    .line 2286
    .line 2287
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 2288
    .line 2289
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2290
    .line 2291
    .line 2292
    :try_start_d
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2293
    .line 2294
    .line 2295
    move-result-object v12

    .line 2296
    invoke-virtual {v1, v12}, Lorg/luckypray/dexkit/DexKitBridge;->f(Ljava/lang/String;)Lb1/d;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v1

    .line 2300
    if-eqz v1, :cond_59

    .line 2301
    .line 2302
    iget-object v1, v1, Lb1/d;->j:LE0/f;

    .line 2303
    .line 2304
    invoke-virtual {v1}, LE0/f;->a()Ljava/lang/Object;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v1

    .line 2308
    check-cast v1, Lb1/g;

    .line 2309
    .line 2310
    if-eqz v1, :cond_59

    .line 2311
    .line 2312
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2313
    .line 2314
    .line 2315
    move-result-object v1

    .line 2316
    :cond_58
    :goto_32
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2317
    .line 2318
    .line 2319
    move-result v12

    .line 2320
    if-eqz v12, :cond_59

    .line 2321
    .line 2322
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v12

    .line 2326
    check-cast v12, Lb1/f;

    .line 2327
    .line 2328
    iget-object v12, v12, Lb1/f;->f:LE0/f;

    .line 2329
    .line 2330
    invoke-virtual {v12}, LE0/f;->a()Ljava/lang/Object;

    .line 2331
    .line 2332
    .line 2333
    move-result-object v12

    .line 2334
    check-cast v12, Lb1/d;

    .line 2335
    .line 2336
    invoke-virtual {v12}, Lb1/d;->b()Lf1/a;

    .line 2337
    .line 2338
    .line 2339
    move-result-object v12

    .line 2340
    iget-object v12, v12, Lf1/a;->a:Ljava/lang/String;

    .line 2341
    .line 2342
    invoke-static {v12}, LA0/g;->I(Ljava/lang/String;)Z

    .line 2343
    .line 2344
    .line 2345
    move-result v14

    .line 2346
    if-eqz v14, :cond_58

    .line 2347
    .line 2348
    invoke-virtual {v9, v12}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    .line 2349
    .line 2350
    .line 2351
    goto :goto_32

    .line 2352
    :catchall_b
    :cond_59
    invoke-static {v0}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v0

    .line 2356
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2357
    .line 2358
    .line 2359
    move-result-object v1

    .line 2360
    :goto_33
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2361
    .line 2362
    .line 2363
    move-result v0

    .line 2364
    if-eqz v0, :cond_62

    .line 2365
    .line 2366
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2367
    .line 2368
    .line 2369
    move-result-object v0

    .line 2370
    check-cast v0, Ljava/lang/reflect/Method;

    .line 2371
    .line 2372
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2373
    .line 2374
    .line 2375
    move-result-object v12

    .line 2376
    array-length v12, v12

    .line 2377
    const/4 v14, 0x1

    .line 2378
    if-ne v12, v14, :cond_61

    .line 2379
    .line 2380
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2381
    .line 2382
    .line 2383
    move-result-object v12

    .line 2384
    const/16 v21, 0x0

    .line 2385
    .line 2386
    aget-object v12, v12, v21

    .line 2387
    .line 2388
    invoke-static {v12, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2389
    .line 2390
    .line 2391
    move-result v12

    .line 2392
    if-eqz v12, :cond_60

    .line 2393
    .line 2394
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2395
    .line 2396
    .line 2397
    move-result-object v12

    .line 2398
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2399
    .line 2400
    invoke-static {v12, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2401
    .line 2402
    .line 2403
    move-result v0

    .line 2404
    if-nez v0, :cond_60

    .line 2405
    .line 2406
    invoke-static {v12, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2407
    .line 2408
    .line 2409
    move-result v0

    .line 2410
    if-nez v0, :cond_60

    .line 2411
    .line 2412
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v0

    .line 2416
    const-string v14, "java.lang.Object"

    .line 2417
    .line 2418
    invoke-virtual {v0, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2419
    .line 2420
    .line 2421
    move-result v0

    .line 2422
    if-nez v0, :cond_60

    .line 2423
    .line 2424
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2425
    .line 2426
    .line 2427
    move-result-object v0

    .line 2428
    invoke-static {v0}, LA0/g;->I(Ljava/lang/String;)Z

    .line 2429
    .line 2430
    .line 2431
    move-result v0

    .line 2432
    if-eqz v0, :cond_5a

    .line 2433
    .line 2434
    :goto_34
    move-object/from16 v18, v1

    .line 2435
    .line 2436
    goto/16 :goto_3a

    .line 2437
    .line 2438
    :cond_5a
    invoke-static {v12}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2439
    .line 2440
    .line 2441
    move-result-object v0

    .line 2442
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2443
    .line 2444
    .line 2445
    move-result v14

    .line 2446
    if-eqz v14, :cond_5b

    .line 2447
    .line 2448
    goto :goto_36

    .line 2449
    :cond_5b
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v0

    .line 2453
    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2454
    .line 2455
    .line 2456
    move-result v14

    .line 2457
    if-eqz v14, :cond_5d

    .line 2458
    .line 2459
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2460
    .line 2461
    .line 2462
    move-result-object v14

    .line 2463
    check-cast v14, Ljava/lang/reflect/Method;

    .line 2464
    .line 2465
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v15

    .line 2469
    invoke-static {v15, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2470
    .line 2471
    .line 2472
    array-length v15, v15

    .line 2473
    if-nez v15, :cond_5c

    .line 2474
    .line 2475
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2476
    .line 2477
    .line 2478
    move-result-object v15

    .line 2479
    const-class v8, Ljava/lang/String;

    .line 2480
    .line 2481
    invoke-static {v15, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2482
    .line 2483
    .line 2484
    move-result v8

    .line 2485
    if-eqz v8, :cond_5c

    .line 2486
    .line 2487
    const-string v8, "v"

    .line 2488
    .line 2489
    const-string v15, "x"

    .line 2490
    .line 2491
    filled-new-array {v8, v15}, [Ljava/lang/String;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v8

    .line 2495
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2496
    .line 2497
    .line 2498
    move-result-object v14

    .line 2499
    invoke-static {v8, v14}, LF0/h;->b0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2500
    .line 2501
    .line 2502
    move-result v8

    .line 2503
    if-eqz v8, :cond_5c

    .line 2504
    .line 2505
    goto :goto_34

    .line 2506
    :cond_5c
    const/4 v8, 0x4

    .line 2507
    goto :goto_35

    .line 2508
    :cond_5d
    :goto_36
    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v8

    .line 2512
    const-string v0, "getDeclaredFields(...)"

    .line 2513
    .line 2514
    invoke-static {v8, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2515
    .line 2516
    .line 2517
    array-length v14, v8

    .line 2518
    const/4 v15, 0x0

    .line 2519
    :goto_37
    if-ge v15, v14, :cond_60

    .line 2520
    .line 2521
    aget-object v0, v8, v15

    .line 2522
    .line 2523
    move-object/from16 v17, v0

    .line 2524
    .line 2525
    :try_start_e
    const-string v0, "com.tencent.mm.storage.s3"
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 2526
    .line 2527
    move-object/from16 v18, v1

    .line 2528
    .line 2529
    const/4 v1, 0x0

    .line 2530
    :try_start_f
    invoke-static {v0, v1, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2531
    .line 2532
    .line 2533
    move-result-object v0

    .line 2534
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2535
    .line 2536
    .line 2537
    move-result-object v1

    .line 2538
    invoke-static {v1, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2539
    .line 2540
    .line 2541
    move-result v0

    .line 2542
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2543
    .line 2544
    .line 2545
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_c

    .line 2546
    goto :goto_39

    .line 2547
    :catchall_c
    move-exception v0

    .line 2548
    goto :goto_38

    .line 2549
    :catchall_d
    move-exception v0

    .line 2550
    move-object/from16 v18, v1

    .line 2551
    .line 2552
    :goto_38
    new-instance v1, LE0/d;

    .line 2553
    .line 2554
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 2555
    .line 2556
    .line 2557
    move-object v0, v1

    .line 2558
    :goto_39
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2559
    .line 2560
    move-object/from16 v17, v1

    .line 2561
    .line 2562
    instance-of v1, v0, LE0/d;

    .line 2563
    .line 2564
    if-eqz v1, :cond_5e

    .line 2565
    .line 2566
    move-object/from16 v0, v17

    .line 2567
    .line 2568
    :cond_5e
    check-cast v0, Ljava/lang/Boolean;

    .line 2569
    .line 2570
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2571
    .line 2572
    .line 2573
    move-result v0

    .line 2574
    if-eqz v0, :cond_5f

    .line 2575
    .line 2576
    :goto_3a
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v0

    .line 2580
    invoke-virtual {v9, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 2581
    .line 2582
    .line 2583
    :goto_3b
    const/16 v20, 0x1

    .line 2584
    .line 2585
    goto :goto_3c

    .line 2586
    :cond_5f
    const/16 v20, 0x1

    .line 2587
    .line 2588
    add-int/lit8 v15, v15, 0x1

    .line 2589
    .line 2590
    move-object/from16 v1, v18

    .line 2591
    .line 2592
    goto :goto_37

    .line 2593
    :cond_60
    move-object/from16 v18, v1

    .line 2594
    .line 2595
    goto :goto_3b

    .line 2596
    :cond_61
    move-object/from16 v18, v1

    .line 2597
    .line 2598
    move/from16 v20, v14

    .line 2599
    .line 2600
    :goto_3c
    move-object/from16 v1, v18

    .line 2601
    .line 2602
    const/4 v8, 0x4

    .line 2603
    goto/16 :goto_33

    .line 2604
    .line 2605
    :cond_62
    invoke-static {v9}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2606
    .line 2607
    .line 2608
    move-result-object v29

    .line 2609
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 2610
    .line 2611
    .line 2612
    move-result-object v0

    .line 2613
    if-nez v0, :cond_63

    .line 2614
    .line 2615
    move-object v0, v6

    .line 2616
    :cond_63
    invoke-static {v0}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2617
    .line 2618
    .line 2619
    move-result-object v1

    .line 2620
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2621
    .line 2622
    .line 2623
    move-result-object v1

    .line 2624
    :cond_64
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2625
    .line 2626
    .line 2627
    move-result v2

    .line 2628
    if-eqz v2, :cond_65

    .line 2629
    .line 2630
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2631
    .line 2632
    .line 2633
    move-result-object v2

    .line 2634
    move-object v3, v2

    .line 2635
    check-cast v3, Ljava/lang/reflect/Method;

    .line 2636
    .line 2637
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2638
    .line 2639
    .line 2640
    move-result-object v4

    .line 2641
    const-string v5, "r"

    .line 2642
    .line 2643
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2644
    .line 2645
    .line 2646
    move-result v4

    .line 2647
    if-eqz v4, :cond_64

    .line 2648
    .line 2649
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2650
    .line 2651
    .line 2652
    move-result-object v4

    .line 2653
    array-length v4, v4

    .line 2654
    const/4 v5, 0x4

    .line 2655
    if-ne v4, v5, :cond_64

    .line 2656
    .line 2657
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2658
    .line 2659
    .line 2660
    move-result-object v3

    .line 2661
    const/16 v21, 0x0

    .line 2662
    .line 2663
    aget-object v3, v3, v21

    .line 2664
    .line 2665
    invoke-virtual {v3, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2666
    .line 2667
    .line 2668
    move-result v3

    .line 2669
    if-eqz v3, :cond_64

    .line 2670
    .line 2671
    goto :goto_3d

    .line 2672
    :cond_65
    const/4 v2, 0x0

    .line 2673
    :goto_3d
    check-cast v2, Ljava/lang/reflect/Method;

    .line 2674
    .line 2675
    if-nez v2, :cond_6b

    .line 2676
    .line 2677
    invoke-static {v0}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2678
    .line 2679
    .line 2680
    move-result-object v0

    .line 2681
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v0

    .line 2685
    :cond_66
    :goto_3e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2686
    .line 2687
    .line 2688
    move-result v1

    .line 2689
    if-eqz v1, :cond_6a

    .line 2690
    .line 2691
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2692
    .line 2693
    .line 2694
    move-result-object v1

    .line 2695
    move-object v2, v1

    .line 2696
    check-cast v2, Ljava/lang/reflect/Method;

    .line 2697
    .line 2698
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2699
    .line 2700
    .line 2701
    move-result-object v3

    .line 2702
    const-string v4, "q"

    .line 2703
    .line 2704
    invoke-static {v3, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2705
    .line 2706
    .line 2707
    move-result v3

    .line 2708
    if-eqz v3, :cond_69

    .line 2709
    .line 2710
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2711
    .line 2712
    .line 2713
    move-result-object v3

    .line 2714
    array-length v3, v3

    .line 2715
    const/4 v5, 0x4

    .line 2716
    if-eq v3, v5, :cond_68

    .line 2717
    .line 2718
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2719
    .line 2720
    .line 2721
    move-result-object v3

    .line 2722
    array-length v3, v3

    .line 2723
    const/4 v4, 0x5

    .line 2724
    if-ne v3, v4, :cond_67

    .line 2725
    .line 2726
    goto :goto_40

    .line 2727
    :cond_67
    :goto_3f
    const/16 v21, 0x0

    .line 2728
    .line 2729
    goto :goto_3e

    .line 2730
    :cond_68
    const/4 v4, 0x5

    .line 2731
    :goto_40
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2732
    .line 2733
    .line 2734
    move-result-object v2

    .line 2735
    const/16 v21, 0x0

    .line 2736
    .line 2737
    aget-object v2, v2, v21

    .line 2738
    .line 2739
    invoke-virtual {v2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2740
    .line 2741
    .line 2742
    move-result v2

    .line 2743
    if-eqz v2, :cond_66

    .line 2744
    .line 2745
    goto :goto_41

    .line 2746
    :cond_69
    const/4 v4, 0x5

    .line 2747
    const/4 v5, 0x4

    .line 2748
    goto :goto_3f

    .line 2749
    :cond_6a
    const/4 v1, 0x0

    .line 2750
    :goto_41
    move-object v2, v1

    .line 2751
    check-cast v2, Ljava/lang/reflect/Method;

    .line 2752
    .line 2753
    :cond_6b
    if-eqz v2, :cond_6c

    .line 2754
    .line 2755
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2756
    .line 2757
    .line 2758
    move-result-object v12

    .line 2759
    goto :goto_42

    .line 2760
    :cond_6c
    const/4 v12, 0x0

    .line 2761
    :goto_42
    if-nez v12, :cond_6d

    .line 2762
    .line 2763
    const-string v12, ""

    .line 2764
    .line 2765
    :cond_6d
    move-object/from16 v30, v12

    .line 2766
    .line 2767
    new-instance v22, LA0/i;

    .line 2768
    .line 2769
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2770
    .line 2771
    .line 2772
    move-result-object v23

    .line 2773
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2774
    .line 2775
    .line 2776
    move-result-object v24

    .line 2777
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v0

    .line 2781
    const-string v1, "getName(...)"

    .line 2782
    .line 2783
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2784
    .line 2785
    .line 2786
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2787
    .line 2788
    .line 2789
    move-result-object v2

    .line 2790
    invoke-static {v2, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2791
    .line 2792
    .line 2793
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2794
    .line 2795
    .line 2796
    move-result-object v3

    .line 2797
    invoke-static {v3, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2798
    .line 2799
    .line 2800
    move-object/from16 v25, v0

    .line 2801
    .line 2802
    move-object/from16 v26, v2

    .line 2803
    .line 2804
    move-object/from16 v27, v3

    .line 2805
    .line 2806
    invoke-direct/range {v22 .. v30}, LA0/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 2807
    .line 2808
    .line 2809
    move-object/from16 v12, v22

    .line 2810
    .line 2811
    :goto_43
    return-object v12

    .line 2812
    nop

    .line 2813
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
