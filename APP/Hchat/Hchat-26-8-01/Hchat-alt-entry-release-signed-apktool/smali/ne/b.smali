.class public final Lne/b;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "^\\d+$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lne/b;->g:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RenameVisitor"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lud/u;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lud/u;->a:Lbc/g;

    .line 4
    .line 5
    iget-object v2, v0, Lud/u;->p:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v3, v1, Lbc/g;->g:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget v3, Lne/d;->a:I

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v3, v1, Lbc/g;->D:Ljava/util/EnumSet;

    .line 22
    .line 23
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    goto/16 :goto_1c

    .line 30
    .line 31
    :cond_1
    iget-object v4, v1, Lbc/g;->A:Lkd/a;

    .line 32
    .line 33
    iget-object v5, v0, Lud/u;->n:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    const/4 v9, 0x0

    .line 44
    sget-object v11, Lbc/f;->i:Lbc/f;

    .line 45
    .line 46
    if-eqz v7, :cond_21

    .line 47
    .line 48
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Lud/e;

    .line 53
    .line 54
    iget-object v12, v7, Lmd/e;->g:Lmd/f;

    .line 55
    .line 56
    sget-object v13, Lmd/a;->x:Lmd/a;

    .line 57
    .line 58
    invoke-virtual {v12, v13}, Lmd/f;->a(Lmd/a;)Z

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    if-eqz v12, :cond_2

    .line 63
    .line 64
    move-object/from16 v17, v1

    .line 65
    .line 66
    goto/16 :goto_6

    .line 67
    .line 68
    :cond_2
    iget-object v12, v7, Lud/e;->m:Lod/a;

    .line 69
    .line 70
    invoke-virtual {v12}, Lod/a;->k()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v14

    .line 74
    invoke-static {v14}, Lxe/q;->g(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v15

    .line 78
    if-eqz v15, :cond_3

    .line 79
    .line 80
    move-object/from16 v17, v1

    .line 81
    .line 82
    :goto_1
    const/4 v8, 0x0

    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :cond_3
    invoke-virtual {v1}, Lbc/g;->a()Z

    .line 86
    .line 87
    .line 88
    move-result v15

    .line 89
    const-string v8, "C"

    .line 90
    .line 91
    if-eqz v15, :cond_6

    .line 92
    .line 93
    sget-object v10, Lne/b;->g:Ljava/util/regex/Pattern;

    .line 94
    .line 95
    invoke-virtual {v10, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-eqz v10, :cond_4

    .line 104
    .line 105
    invoke-static {v14}, Lkd/d;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    const-string v10, "AnonymousClass"

    .line 110
    .line 111
    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    :goto_2
    move-object/from16 v17, v1

    .line 116
    .line 117
    goto/16 :goto_4

    .line 118
    .line 119
    :cond_4
    invoke-virtual {v14, v9}, Ljava/lang/String;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    const/16 v9, 0x24

    .line 124
    .line 125
    if-eq v10, v9, :cond_5

    .line 126
    .line 127
    invoke-static {v10}, Ljava/lang/Character;->isDigit(C)Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-eqz v9, :cond_6

    .line 132
    .line 133
    :cond_5
    invoke-static {v14}, Lkd/d;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    invoke-virtual {v8, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    goto :goto_2

    .line 142
    :cond_6
    invoke-interface {v3, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-eqz v9, :cond_7

    .line 147
    .line 148
    sget-object v9, Lkd/d;->a:Ljava/util/regex/Pattern;

    .line 149
    .line 150
    new-instance v9, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 157
    .line 158
    .line 159
    new-instance v10, Lkd/c;

    .line 160
    .line 161
    move-object/from16 v17, v1

    .line 162
    .line 163
    const/4 v1, 0x0

    .line 164
    invoke-direct {v10, v9, v1}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 165
    .line 166
    .line 167
    invoke-static {v14, v10}, Lxe/q;->j(Ljava/lang/String;Ljava/util/function/IntConsumer;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    goto :goto_3

    .line 175
    :cond_7
    move-object/from16 v17, v1

    .line 176
    .line 177
    move-object v1, v14

    .line 178
    :goto_3
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    if-eqz v9, :cond_8

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_8
    if-eqz v15, :cond_a

    .line 186
    .line 187
    invoke-static {v14}, Lkd/d;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    if-nez v9, :cond_9

    .line 196
    .line 197
    const/4 v9, 0x0

    .line 198
    invoke-virtual {v1, v9}, Ljava/lang/String;->codePointAt(I)I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    invoke-static {v10}, Ljava/lang/Character;->isJavaIdentifierStart(I)Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-nez v9, :cond_9

    .line 207
    .line 208
    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :cond_9
    invoke-static {v1}, Lkd/d;->d(Ljava/lang/String;)Z

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-nez v9, :cond_a

    .line 217
    .line 218
    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    goto :goto_4

    .line 223
    :cond_a
    move-object v8, v1

    .line 224
    :goto_4
    if-nez v8, :cond_b

    .line 225
    .line 226
    invoke-virtual {v4, v7}, Lkd/a;->a(Lud/e;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v7, v1}, Lud/e;->j0(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    new-instance v1, Lnd/f0;

    .line 234
    .line 235
    invoke-direct {v1, v7}, Lnd/f0;-><init>(Lnd/b0;)V

    .line 236
    .line 237
    .line 238
    const-string v8, "contains not printable characters"

    .line 239
    .line 240
    invoke-virtual {v1, v8}, Lnd/f0;->b(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v7, v1}, Lmd/e;->y(Loc/b;)V

    .line 244
    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_b
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-nez v1, :cond_c

    .line 252
    .line 253
    invoke-virtual {v12, v8}, Lod/a;->a(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    new-instance v1, Lnd/f0;

    .line 257
    .line 258
    invoke-direct {v1, v7}, Lnd/f0;-><init>(Lnd/b0;)V

    .line 259
    .line 260
    .line 261
    const-string v9, "invalid class name"

    .line 262
    .line 263
    invoke-virtual {v1, v9}, Lnd/f0;->b(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v7, v1}, Lmd/e;->y(Loc/b;)V

    .line 267
    .line 268
    .line 269
    :cond_c
    invoke-virtual {v12}, Lod/a;->o()Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_e

    .line 274
    .line 275
    invoke-virtual/range {v17 .. v17}, Lbc/g;->a()Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_e

    .line 280
    .line 281
    iget-object v1, v12, Lod/a;->k:Lod/a;

    .line 282
    .line 283
    :goto_5
    if-eqz v1, :cond_e

    .line 284
    .line 285
    invoke-virtual {v1}, Lod/a;->k()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    if-eqz v9, :cond_d

    .line 294
    .line 295
    invoke-virtual {v4, v7}, Lkd/a;->a(Lud/e;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v7, v1}, Lud/e;->j0(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    new-instance v1, Lnd/f0;

    .line 303
    .line 304
    invoke-direct {v1, v7}, Lnd/f0;-><init>(Lnd/b0;)V

    .line 305
    .line 306
    .line 307
    const-string v8, "collision with other inner class name"

    .line 308
    .line 309
    invoke-virtual {v1, v8}, Lnd/f0;->b(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v7, v1}, Lmd/e;->y(Loc/b;)V

    .line 313
    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_d
    iget-object v1, v1, Lod/a;->k:Lod/a;

    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_e
    :goto_6
    new-instance v1, Ljava/util/HashSet;

    .line 320
    .line 321
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 322
    .line 323
    .line 324
    iget-object v8, v7, Lud/e;->u:Ljava/util/List;

    .line 325
    .line 326
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    if-eqz v9, :cond_14

    .line 335
    .line 336
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    check-cast v9, Lud/g;

    .line 341
    .line 342
    iget-object v10, v9, Lud/g;->l:Lod/c;

    .line 343
    .line 344
    iget-object v10, v10, Lod/c;->j:Ljava/lang/String;

    .line 345
    .line 346
    invoke-virtual {v1, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v12

    .line 350
    invoke-virtual/range {v17 .. v17}, Lbc/g;->a()Z

    .line 351
    .line 352
    .line 353
    move-result v14

    .line 354
    if-eqz v14, :cond_f

    .line 355
    .line 356
    invoke-static {v10}, Lkd/d;->d(Ljava/lang/String;)Z

    .line 357
    .line 358
    .line 359
    move-result v14

    .line 360
    if-nez v14, :cond_f

    .line 361
    .line 362
    const/4 v14, 0x1

    .line 363
    goto :goto_8

    .line 364
    :cond_f
    const/4 v14, 0x0

    .line 365
    :goto_8
    invoke-interface {v3, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v15

    .line 369
    if-eqz v15, :cond_10

    .line 370
    .line 371
    invoke-static {v10}, Lkd/d;->a(Ljava/lang/String;)Z

    .line 372
    .line 373
    .line 374
    move-result v10

    .line 375
    if-nez v10, :cond_10

    .line 376
    .line 377
    const/4 v10, 0x1

    .line 378
    goto :goto_9

    .line 379
    :cond_10
    const/4 v10, 0x0

    .line 380
    :goto_9
    if-eqz v12, :cond_12

    .line 381
    .line 382
    if-nez v14, :cond_12

    .line 383
    .line 384
    if-eqz v10, :cond_11

    .line 385
    .line 386
    goto :goto_a

    .line 387
    :cond_11
    move-object/from16 v16, v1

    .line 388
    .line 389
    goto :goto_b

    .line 390
    :cond_12
    :goto_a
    invoke-virtual {v4, v9}, Lkd/a;->b(Lud/g;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v15

    .line 394
    move-object/from16 v16, v1

    .line 395
    .line 396
    iget-object v1, v9, Lud/g;->l:Lod/c;

    .line 397
    .line 398
    iput-object v15, v1, Lod/c;->j:Ljava/lang/String;

    .line 399
    .line 400
    new-instance v1, Lnd/f0;

    .line 401
    .line 402
    invoke-direct {v1, v9, v14, v10}, Lnd/f0;-><init>(Lnd/b0;ZZ)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v9, v1}, Lmd/e;->y(Loc/b;)V

    .line 406
    .line 407
    .line 408
    if-nez v12, :cond_13

    .line 409
    .line 410
    new-instance v1, Lnd/f0;

    .line 411
    .line 412
    invoke-direct {v1, v9}, Lnd/f0;-><init>(Lnd/b0;)V

    .line 413
    .line 414
    .line 415
    const-string v10, "collision with other field name"

    .line 416
    .line 417
    invoke-virtual {v1, v10}, Lnd/f0;->b(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v9, v1}, Lmd/e;->y(Loc/b;)V

    .line 421
    .line 422
    .line 423
    :cond_13
    :goto_b
    move-object/from16 v1, v16

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_14
    new-instance v1, Ljava/util/ArrayList;

    .line 427
    .line 428
    iget-object v8, v7, Lud/e;->t:Ljava/util/List;

    .line 429
    .line 430
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 431
    .line 432
    .line 433
    move-result v8

    .line 434
    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 435
    .line 436
    .line 437
    iget-object v7, v7, Lud/e;->t:Ljava/util/List;

    .line 438
    .line 439
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    :cond_15
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 444
    .line 445
    .line 446
    move-result v8

    .line 447
    if-eqz v8, :cond_16

    .line 448
    .line 449
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    check-cast v8, Lud/r;

    .line 454
    .line 455
    iget-object v9, v8, Lud/r;->m:Lb5/k;

    .line 456
    .line 457
    invoke-virtual {v9}, Lb5/k;->a()Z

    .line 458
    .line 459
    .line 460
    move-result v9

    .line 461
    if-nez v9, :cond_15

    .line 462
    .line 463
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    goto :goto_c

    .line 467
    :cond_16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    :cond_17
    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v8

    .line 475
    if-eqz v8, :cond_1b

    .line 476
    .line 477
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    check-cast v8, Lud/r;

    .line 482
    .line 483
    iget-object v9, v8, Lud/r;->k:Lod/d;

    .line 484
    .line 485
    iget-object v9, v9, Lod/d;->n:Ljava/lang/String;

    .line 486
    .line 487
    invoke-virtual/range {v17 .. v17}, Lbc/g;->a()Z

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    if-eqz v10, :cond_18

    .line 492
    .line 493
    invoke-static {v9}, Lkd/d;->d(Ljava/lang/String;)Z

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    if-nez v10, :cond_18

    .line 498
    .line 499
    const/4 v10, 0x1

    .line 500
    goto :goto_e

    .line 501
    :cond_18
    const/4 v10, 0x0

    .line 502
    :goto_e
    invoke-interface {v3, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v12

    .line 506
    if-eqz v12, :cond_19

    .line 507
    .line 508
    invoke-static {v9}, Lkd/d;->a(Ljava/lang/String;)Z

    .line 509
    .line 510
    .line 511
    move-result v9

    .line 512
    if-nez v9, :cond_19

    .line 513
    .line 514
    const/4 v9, 0x1

    .line 515
    goto :goto_f

    .line 516
    :cond_19
    const/4 v9, 0x0

    .line 517
    :goto_f
    if-nez v10, :cond_1a

    .line 518
    .line 519
    if-eqz v9, :cond_17

    .line 520
    .line 521
    :cond_1a
    invoke-virtual {v4, v8}, Lkd/a;->c(Lud/r;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v12

    .line 525
    invoke-virtual {v8, v12}, Lud/r;->d0(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    new-instance v12, Lnd/f0;

    .line 529
    .line 530
    invoke-direct {v12, v8, v10, v9}, Lnd/f0;-><init>(Lnd/b0;ZZ)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v8, v12}, Lmd/e;->y(Loc/b;)V

    .line 534
    .line 535
    .line 536
    goto :goto_d

    .line 537
    :cond_1b
    invoke-virtual/range {v17 .. v17}, Lbc/g;->a()Z

    .line 538
    .line 539
    .line 540
    move-result v7

    .line 541
    if-eqz v7, :cond_20

    .line 542
    .line 543
    new-instance v7, Ljava/util/HashSet;

    .line 544
    .line 545
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 546
    .line 547
    .line 548
    move-result v8

    .line 549
    invoke-direct {v7, v8}, Ljava/util/HashSet;-><init>(I)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    :cond_1c
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 557
    .line 558
    .line 559
    move-result v8

    .line 560
    if-eqz v8, :cond_20

    .line 561
    .line 562
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v8

    .line 566
    check-cast v8, Lud/r;

    .line 567
    .line 568
    iget-object v9, v8, Lud/r;->k:Lod/d;

    .line 569
    .line 570
    const/4 v10, 0x0

    .line 571
    const/4 v12, 0x1

    .line 572
    invoke-virtual {v9, v12, v10}, Lod/d;->j(ZZ)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v9

    .line 576
    invoke-virtual {v7, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result v9

    .line 580
    if-nez v9, :cond_1c

    .line 581
    .line 582
    iget-object v9, v8, Lmd/e;->g:Lmd/f;

    .line 583
    .line 584
    invoke-virtual {v9, v13}, Lmd/f;->a(Lmd/a;)Z

    .line 585
    .line 586
    .line 587
    move-result v9

    .line 588
    if-eqz v9, :cond_1d

    .line 589
    .line 590
    goto :goto_10

    .line 591
    :cond_1d
    sget-object v9, Lmd/b;->r:Lmd/b;

    .line 592
    .line 593
    iget-object v11, v8, Lmd/e;->g:Lmd/f;

    .line 594
    .line 595
    invoke-virtual {v11, v9}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 596
    .line 597
    .line 598
    move-result-object v9

    .line 599
    check-cast v9, Lnd/x;

    .line 600
    .line 601
    if-eqz v9, :cond_1f

    .line 602
    .line 603
    iget-object v9, v9, Lnd/x;->h:Ljava/util/SortedSet;

    .line 604
    .line 605
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 606
    .line 607
    .line 608
    move-result-object v9

    .line 609
    :cond_1e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 610
    .line 611
    .line 612
    move-result v11

    .line 613
    if-eqz v11, :cond_1f

    .line 614
    .line 615
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v11

    .line 619
    check-cast v11, Lud/r;

    .line 620
    .line 621
    if-eq v11, v8, :cond_1e

    .line 622
    .line 623
    iget-object v14, v8, Lud/r;->l:Lud/e;

    .line 624
    .line 625
    iget-object v11, v11, Lud/r;->l:Lud/e;

    .line 626
    .line 627
    invoke-virtual {v14, v11}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v11

    .line 631
    if-eqz v11, :cond_1e

    .line 632
    .line 633
    goto :goto_10

    .line 634
    :cond_1f
    invoke-virtual {v4, v8}, Lkd/a;->c(Lud/r;)Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v9

    .line 638
    invoke-virtual {v8, v9}, Lud/r;->d0(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    new-instance v9, Lnd/f0;

    .line 642
    .line 643
    const-string v11, "collision with other method in class"

    .line 644
    .line 645
    invoke-direct {v9, v11}, Lnd/f0;-><init>(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v8, v9}, Lmd/e;->y(Loc/b;)V

    .line 649
    .line 650
    .line 651
    goto :goto_10

    .line 652
    :cond_20
    move-object/from16 v1, v17

    .line 653
    .line 654
    goto/16 :goto_0

    .line 655
    .line 656
    :cond_21
    move-object/from16 v17, v1

    .line 657
    .line 658
    move v10, v9

    .line 659
    const/4 v12, 0x1

    .line 660
    sget-object v1, Lbc/f;->g:Lbc/f;

    .line 661
    .line 662
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v1

    .line 666
    if-eqz v1, :cond_23

    .line 667
    .line 668
    new-instance v1, Ljava/util/HashSet;

    .line 669
    .line 670
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 671
    .line 672
    .line 673
    move-result v6

    .line 674
    invoke-direct {v1, v6}, Ljava/util/HashSet;-><init>(I)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 678
    .line 679
    .line 680
    move-result-object v6

    .line 681
    :cond_22
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 682
    .line 683
    .line 684
    move-result v7

    .line 685
    if-eqz v7, :cond_23

    .line 686
    .line 687
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v7

    .line 691
    check-cast v7, Lud/e;

    .line 692
    .line 693
    iget-object v8, v7, Lud/e;->m:Lod/a;

    .line 694
    .line 695
    invoke-virtual {v8}, Lod/a;->g()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v9

    .line 699
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v9

    .line 703
    invoke-virtual {v1, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v9

    .line 707
    if-nez v9, :cond_22

    .line 708
    .line 709
    invoke-virtual {v4, v7}, Lkd/a;->a(Lud/e;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v9

    .line 713
    invoke-virtual {v8, v9}, Lod/a;->a(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    new-instance v9, Lnd/f0;

    .line 717
    .line 718
    invoke-direct {v9, v7}, Lnd/f0;-><init>(Lnd/b0;)V

    .line 719
    .line 720
    .line 721
    const-string v13, "case insensitive filesystem"

    .line 722
    .line 723
    invoke-virtual {v9, v13}, Lnd/f0;->b(Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v7, v9}, Lmd/e;->y(Loc/b;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v8}, Lod/a;->g()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v7

    .line 733
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v7

    .line 737
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    goto :goto_11

    .line 741
    :cond_23
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    move v6, v10

    .line 746
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 747
    .line 748
    .line 749
    move-result v7

    .line 750
    if-eqz v7, :cond_2c

    .line 751
    .line 752
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v7

    .line 756
    check-cast v7, Lud/s;

    .line 757
    .line 758
    invoke-virtual/range {v17 .. v17}, Lbc/g;->a()Z

    .line 759
    .line 760
    .line 761
    move-result v8

    .line 762
    if-eqz v8, :cond_25

    .line 763
    .line 764
    iget-object v8, v7, Lud/s;->p:Lod/e;

    .line 765
    .line 766
    iget-object v8, v8, Lod/e;->b:Ljava/lang/String;

    .line 767
    .line 768
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 769
    .line 770
    .line 771
    move-result v8

    .line 772
    if-eqz v8, :cond_25

    .line 773
    .line 774
    iget-object v8, v7, Lud/s;->l:Lod/e;

    .line 775
    .line 776
    iget-object v9, v8, Lod/e;->b:Ljava/lang/String;

    .line 777
    .line 778
    const-string v13, "defpackage"

    .line 779
    .line 780
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    move-result v9

    .line 784
    if-eqz v9, :cond_24

    .line 785
    .line 786
    iput-object v8, v7, Lud/s;->p:Lod/e;

    .line 787
    .line 788
    goto :goto_13

    .line 789
    :cond_24
    iget-object v8, v7, Lud/s;->k:Lud/u;

    .line 790
    .line 791
    invoke-static {v8, v13}, Lod/e;->a(Lud/u;Ljava/lang/String;)Lod/e;

    .line 792
    .line 793
    .line 794
    move-result-object v8

    .line 795
    iput-object v8, v7, Lud/s;->p:Lod/e;

    .line 796
    .line 797
    :goto_13
    move v7, v12

    .line 798
    goto/16 :goto_18

    .line 799
    .line 800
    :cond_25
    iget-object v8, v7, Lud/s;->p:Lod/e;

    .line 801
    .line 802
    iget-object v8, v8, Lod/e;->c:Ljava/lang/String;

    .line 803
    .line 804
    invoke-virtual/range {v17 .. v17}, Lbc/g;->a()Z

    .line 805
    .line 806
    .line 807
    move-result v9

    .line 808
    if-eqz v9, :cond_26

    .line 809
    .line 810
    invoke-static {v8}, Lkd/d;->d(Ljava/lang/String;)Z

    .line 811
    .line 812
    .line 813
    move-result v9

    .line 814
    if-nez v9, :cond_26

    .line 815
    .line 816
    move v9, v12

    .line 817
    goto :goto_14

    .line 818
    :cond_26
    move v9, v10

    .line 819
    :goto_14
    invoke-interface {v3, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-result v13

    .line 823
    if-eqz v13, :cond_27

    .line 824
    .line 825
    invoke-static {v8}, Lkd/d;->a(Ljava/lang/String;)Z

    .line 826
    .line 827
    .line 828
    move-result v8

    .line 829
    if-nez v8, :cond_27

    .line 830
    .line 831
    move v8, v12

    .line 832
    goto :goto_15

    .line 833
    :cond_27
    move v8, v10

    .line 834
    :goto_15
    if-nez v9, :cond_29

    .line 835
    .line 836
    if-eqz v8, :cond_28

    .line 837
    .line 838
    goto :goto_16

    .line 839
    :cond_28
    move v7, v10

    .line 840
    goto :goto_18

    .line 841
    :cond_29
    :goto_16
    iget v8, v4, Lkd/a;->a:I

    .line 842
    .line 843
    add-int/lit8 v9, v8, 0x1

    .line 844
    .line 845
    iput v9, v4, Lkd/a;->a:I

    .line 846
    .line 847
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 848
    .line 849
    .line 850
    move-result-object v8

    .line 851
    iget-object v9, v7, Lud/s;->l:Lod/e;

    .line 852
    .line 853
    iget-object v9, v9, Lod/e;->c:Ljava/lang/String;

    .line 854
    .line 855
    invoke-virtual {v4, v9}, Lkd/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v9

    .line 859
    filled-new-array {v8, v9}, [Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v8

    .line 863
    const-string v9, "p%03d%s"

    .line 864
    .line 865
    invoke-static {v9, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v8

    .line 869
    iget-object v9, v7, Lud/s;->l:Lod/e;

    .line 870
    .line 871
    iget-object v13, v9, Lod/e;->c:Ljava/lang/String;

    .line 872
    .line 873
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    move-result v13

    .line 877
    if-eqz v13, :cond_2a

    .line 878
    .line 879
    iput-object v9, v7, Lud/s;->p:Lod/e;

    .line 880
    .line 881
    goto :goto_13

    .line 882
    :cond_2a
    iget-object v9, v7, Lud/s;->k:Lud/u;

    .line 883
    .line 884
    iget-object v13, v7, Lud/s;->m:Lud/s;

    .line 885
    .line 886
    if-nez v13, :cond_2b

    .line 887
    .line 888
    const/4 v13, 0x0

    .line 889
    goto :goto_17

    .line 890
    :cond_2b
    iget-object v13, v13, Lud/s;->p:Lod/e;

    .line 891
    .line 892
    :goto_17
    invoke-static {v9, v13, v8}, Lod/e;->b(Lud/u;Lod/e;Ljava/lang/String;)Lod/e;

    .line 893
    .line 894
    .line 895
    move-result-object v8

    .line 896
    iput-object v8, v7, Lud/s;->p:Lod/e;

    .line 897
    .line 898
    goto :goto_13

    .line 899
    :goto_18
    or-int/2addr v6, v7

    .line 900
    goto/16 :goto_12

    .line 901
    .line 902
    :cond_2c
    if-eqz v6, :cond_2e

    .line 903
    .line 904
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 905
    .line 906
    .line 907
    move-result-object v1

    .line 908
    :cond_2d
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 909
    .line 910
    .line 911
    move-result v3

    .line 912
    if-eqz v3, :cond_2e

    .line 913
    .line 914
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    check-cast v3, Lud/s;

    .line 919
    .line 920
    iget-object v6, v3, Lud/s;->m:Lud/s;

    .line 921
    .line 922
    if-nez v6, :cond_2d

    .line 923
    .line 924
    invoke-virtual {v3}, Lud/s;->J()V

    .line 925
    .line 926
    .line 927
    goto :goto_19

    .line 928
    :cond_2e
    new-instance v1, Ljava/util/HashSet;

    .line 929
    .line 930
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 934
    .line 935
    .line 936
    move-result-object v2

    .line 937
    :cond_2f
    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 938
    .line 939
    .line 940
    move-result v3

    .line 941
    if-eqz v3, :cond_30

    .line 942
    .line 943
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v3

    .line 947
    check-cast v3, Lud/s;

    .line 948
    .line 949
    iget-object v6, v3, Lud/s;->m:Lud/s;

    .line 950
    .line 951
    if-nez v6, :cond_2f

    .line 952
    .line 953
    iget-object v3, v3, Lud/s;->l:Lod/e;

    .line 954
    .line 955
    iget-object v3, v3, Lod/e;->c:Ljava/lang/String;

    .line 956
    .line 957
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 958
    .line 959
    .line 960
    goto :goto_1a

    .line 961
    :cond_30
    iget-object v2, v0, Lud/u;->f:Lxe/e;

    .line 962
    .line 963
    iput-object v1, v2, Lxe/e;->b:Ljava/lang/Object;

    .line 964
    .line 965
    invoke-virtual/range {v17 .. v17}, Lbc/g;->a()Z

    .line 966
    .line 967
    .line 968
    move-result v2

    .line 969
    if-eqz v2, :cond_33

    .line 970
    .line 971
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    :cond_31
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 976
    .line 977
    .line 978
    move-result v3

    .line 979
    if-eqz v3, :cond_33

    .line 980
    .line 981
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v3

    .line 985
    check-cast v3, Lud/e;

    .line 986
    .line 987
    iget-object v3, v3, Lud/e;->u:Ljava/util/List;

    .line 988
    .line 989
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 990
    .line 991
    .line 992
    move-result-object v3

    .line 993
    :cond_32
    :goto_1b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 994
    .line 995
    .line 996
    move-result v5

    .line 997
    if-eqz v5, :cond_31

    .line 998
    .line 999
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v5

    .line 1003
    check-cast v5, Lud/g;

    .line 1004
    .line 1005
    iget-object v6, v5, Lud/g;->l:Lod/c;

    .line 1006
    .line 1007
    iget-object v6, v6, Lod/c;->j:Ljava/lang/String;

    .line 1008
    .line 1009
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v6

    .line 1013
    if-eqz v6, :cond_32

    .line 1014
    .line 1015
    invoke-virtual {v4, v5}, Lkd/a;->b(Lud/g;)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v6

    .line 1019
    iget-object v7, v5, Lud/g;->l:Lod/c;

    .line 1020
    .line 1021
    iput-object v6, v7, Lod/c;->j:Ljava/lang/String;

    .line 1022
    .line 1023
    new-instance v6, Lnd/f0;

    .line 1024
    .line 1025
    const-string v7, "collision with root package name"

    .line 1026
    .line 1027
    invoke-direct {v6, v7}, Lnd/f0;-><init>(Ljava/lang/String;)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v5, v6}, Lmd/e;->y(Loc/b;)V

    .line 1031
    .line 1032
    .line 1033
    goto :goto_1b

    .line 1034
    :cond_33
    :goto_1c
    new-instance v1, Lah/a;

    .line 1035
    .line 1036
    const/4 v2, 0x4

    .line 1037
    invoke-direct {v1, v2}, Lah/a;-><init>(I)V

    .line 1038
    .line 1039
    .line 1040
    iget-object v0, v0, Lud/u;->j:Ljava/util/ArrayList;

    .line 1041
    .line 1042
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    return-void
.end method
