.class public abstract Lww0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lv82;

.field public final b:Let1;

.field public final c:Lx00;


# direct methods
.method public constructor <init>(Lv82;Let1;Lx00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lww0;->a:Lv82;

    .line 5
    .line 6
    iput-object p2, p0, Lww0;->b:Let1;

    .line 7
    .line 8
    iput-object p3, p0, Lww0;->c:Lx00;

    .line 9
    .line 10
    return-void
.end method

.method public static b(Lcj;Ljava/lang/reflect/Method;)Lww0;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Lu82;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Lu82;-><init>(Lcj;Ljava/lang/reflect/Method;)V

    .line 8
    .line 9
    .line 10
    iget-object v3, v2, Lu82;->c:[Ljava/lang/annotation/Annotation;

    .line 11
    .line 12
    array-length v4, v3

    .line 13
    const/4 v5, 0x0

    .line 14
    move v6, v5

    .line 15
    :goto_0
    const-string v7, "HEAD"

    .line 16
    .line 17
    const/4 v8, 0x1

    .line 18
    const/4 v9, 0x0

    .line 19
    if-ge v6, v4, :cond_12

    .line 20
    .line 21
    aget-object v10, v3, v6

    .line 22
    .line 23
    instance-of v11, v10, Lz30;

    .line 24
    .line 25
    if-eqz v11, :cond_0

    .line 26
    .line 27
    check-cast v10, Lz30;

    .line 28
    .line 29
    invoke-interface {v10}, Lz30;->value()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    const-string v8, "DELETE"

    .line 34
    .line 35
    invoke-virtual {v2, v8, v7, v5}, Lu82;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_0
    instance-of v11, v10, Lzn0;

    .line 41
    .line 42
    if-eqz v11, :cond_1

    .line 43
    .line 44
    check-cast v10, Lzn0;

    .line 45
    .line 46
    invoke-interface {v10}, Lzn0;->value()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const-string v8, "GET"

    .line 51
    .line 52
    invoke-virtual {v2, v8, v7, v5}, Lu82;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_1
    instance-of v11, v10, Lpr0;

    .line 58
    .line 59
    if-eqz v11, :cond_2

    .line 60
    .line 61
    check-cast v10, Lpr0;

    .line 62
    .line 63
    invoke-interface {v10}, Lpr0;->value()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-virtual {v2, v7, v8, v5}, Lu82;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_3

    .line 71
    .line 72
    :cond_2
    instance-of v7, v10, Lcw1;

    .line 73
    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    check-cast v10, Lcw1;

    .line 77
    .line 78
    invoke-interface {v10}, Lcw1;->value()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    const-string v9, "PATCH"

    .line 83
    .line 84
    invoke-virtual {v2, v9, v7, v8}, Lu82;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_3
    instance-of v7, v10, Ldw1;

    .line 90
    .line 91
    if-eqz v7, :cond_4

    .line 92
    .line 93
    check-cast v10, Ldw1;

    .line 94
    .line 95
    invoke-interface {v10}, Ldw1;->value()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    const-string v9, "POST"

    .line 100
    .line 101
    invoke-virtual {v2, v9, v7, v8}, Lu82;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    goto/16 :goto_3

    .line 105
    .line 106
    :cond_4
    instance-of v7, v10, Lew1;

    .line 107
    .line 108
    if-eqz v7, :cond_5

    .line 109
    .line 110
    check-cast v10, Lew1;

    .line 111
    .line 112
    invoke-interface {v10}, Lew1;->value()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    const-string v9, "PUT"

    .line 117
    .line 118
    invoke-virtual {v2, v9, v7, v8}, Lu82;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :cond_5
    instance-of v7, v10, Lds1;

    .line 124
    .line 125
    if-eqz v7, :cond_6

    .line 126
    .line 127
    check-cast v10, Lds1;

    .line 128
    .line 129
    invoke-interface {v10}, Lds1;->value()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    const-string v8, "OPTIONS"

    .line 134
    .line 135
    invoke-virtual {v2, v8, v7, v5}, Lu82;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_3

    .line 139
    .line 140
    :cond_6
    instance-of v7, v10, Lqr0;

    .line 141
    .line 142
    if-eqz v7, :cond_7

    .line 143
    .line 144
    check-cast v10, Lqr0;

    .line 145
    .line 146
    invoke-interface {v10}, Lqr0;->method()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-interface {v10}, Lqr0;->path()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-interface {v10}, Lqr0;->hasBody()Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    invoke-virtual {v2, v7, v8, v9}, Lu82;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_3

    .line 162
    .line 163
    :cond_7
    instance-of v7, v10, Lks0;

    .line 164
    .line 165
    if-eqz v7, :cond_d

    .line 166
    .line 167
    check-cast v10, Lks0;

    .line 168
    .line 169
    invoke-interface {v10}, Lks0;->value()[Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    array-length v11, v7

    .line 174
    if-eqz v11, :cond_c

    .line 175
    .line 176
    invoke-interface {v10}, Lks0;->allowUnsafeNonAsciiValues()Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    new-instance v11, Lye0;

    .line 181
    .line 182
    invoke-direct {v11, v8}, Lye0;-><init>(I)V

    .line 183
    .line 184
    .line 185
    array-length v12, v7

    .line 186
    move v13, v5

    .line 187
    :goto_1
    if-ge v13, v12, :cond_b

    .line 188
    .line 189
    aget-object v14, v7, v13

    .line 190
    .line 191
    const/16 v15, 0x3a

    .line 192
    .line 193
    invoke-virtual {v14, v15}, Ljava/lang/String;->indexOf(I)I

    .line 194
    .line 195
    .line 196
    move-result v15

    .line 197
    move/from16 v16, v8

    .line 198
    .line 199
    const/4 v8, -0x1

    .line 200
    if-eq v15, v8, :cond_a

    .line 201
    .line 202
    if-eqz v15, :cond_a

    .line 203
    .line 204
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    add-int/lit8 v8, v8, -0x1

    .line 209
    .line 210
    if-eq v15, v8, :cond_a

    .line 211
    .line 212
    invoke-virtual {v14, v5, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    add-int/lit8 v15, v15, 0x1

    .line 217
    .line 218
    invoke-virtual {v14, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v14

    .line 222
    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v14

    .line 226
    const-string v15, "Content-Type"

    .line 227
    .line 228
    invoke-virtual {v15, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result v15

    .line 232
    if-eqz v15, :cond_8

    .line 233
    .line 234
    :try_start_0
    sget-object v8, Lvf1;->d:Lo72;

    .line 235
    .line 236
    invoke-static {v14}, Lte;->C(Ljava/lang/String;)Lvf1;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    iput-object v8, v2, Lu82;->t:Lvf1;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :catch_0
    move-exception v0

    .line 244
    const-string v2, "Malformed content type: %s"

    .line 245
    .line 246
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-static {v1, v0, v2, v3}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    throw v0

    .line 255
    :cond_8
    if-eqz v10, :cond_9

    .line 256
    .line 257
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-static {v8}, Ln93;->c(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v11, v8, v14}, Ln93;->a(Lye0;Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_9
    invoke-virtual {v11, v8, v14}, Lye0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    :goto_2
    add-int/lit8 v13, v13, 0x1

    .line 271
    .line 272
    move/from16 v8, v16

    .line 273
    .line 274
    goto :goto_1

    .line 275
    :cond_a
    const-string v0, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    .line 276
    .line 277
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-static {v1, v9, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    throw v0

    .line 286
    :cond_b
    invoke-virtual {v11}, Lye0;->b()Ljs0;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    iput-object v7, v2, Lu82;->s:Ljs0;

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_c
    const-string v0, "@Headers annotation is empty."

    .line 294
    .line 295
    new-array v2, v5, [Ljava/lang/Object;

    .line 296
    .line 297
    invoke-static {v1, v9, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    throw v0

    .line 302
    :cond_d
    move/from16 v16, v8

    .line 303
    .line 304
    instance-of v7, v10, Lsj1;

    .line 305
    .line 306
    const-string v8, "Only one encoding annotation is allowed."

    .line 307
    .line 308
    if-eqz v7, :cond_f

    .line 309
    .line 310
    iget-boolean v7, v2, Lu82;->p:Z

    .line 311
    .line 312
    if-nez v7, :cond_e

    .line 313
    .line 314
    move/from16 v7, v16

    .line 315
    .line 316
    iput-boolean v7, v2, Lu82;->q:Z

    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_e
    new-array v0, v5, [Ljava/lang/Object;

    .line 320
    .line 321
    invoke-static {v1, v9, v8, v0}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    throw v0

    .line 326
    :cond_f
    move/from16 v7, v16

    .line 327
    .line 328
    instance-of v10, v10, Lqm0;

    .line 329
    .line 330
    if-eqz v10, :cond_11

    .line 331
    .line 332
    iget-boolean v10, v2, Lu82;->q:Z

    .line 333
    .line 334
    if-nez v10, :cond_10

    .line 335
    .line 336
    iput-boolean v7, v2, Lu82;->p:Z

    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_10
    new-array v0, v5, [Ljava/lang/Object;

    .line 340
    .line 341
    invoke-static {v1, v9, v8, v0}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    throw v0

    .line 346
    :cond_11
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 347
    .line 348
    goto/16 :goto_0

    .line 349
    .line 350
    :cond_12
    iget-object v4, v2, Lu82;->n:Ljava/lang/String;

    .line 351
    .line 352
    if-eqz v4, :cond_80

    .line 353
    .line 354
    iget-boolean v4, v2, Lu82;->o:Z

    .line 355
    .line 356
    if-nez v4, :cond_15

    .line 357
    .line 358
    iget-boolean v4, v2, Lu82;->q:Z

    .line 359
    .line 360
    if-nez v4, :cond_14

    .line 361
    .line 362
    iget-boolean v4, v2, Lu82;->p:Z

    .line 363
    .line 364
    if-nez v4, :cond_13

    .line 365
    .line 366
    goto :goto_4

    .line 367
    :cond_13
    const-string v0, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    .line 368
    .line 369
    new-array v2, v5, [Ljava/lang/Object;

    .line 370
    .line 371
    invoke-static {v1, v9, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    throw v0

    .line 376
    :cond_14
    const-string v0, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    .line 377
    .line 378
    new-array v2, v5, [Ljava/lang/Object;

    .line 379
    .line 380
    invoke-static {v1, v9, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    throw v0

    .line 385
    :cond_15
    :goto_4
    iget-object v4, v2, Lu82;->d:[[Ljava/lang/annotation/Annotation;

    .line 386
    .line 387
    array-length v6, v4

    .line 388
    new-array v8, v6, [Lop0;

    .line 389
    .line 390
    iput-object v8, v2, Lu82;->v:[Lop0;

    .line 391
    .line 392
    add-int/lit8 v8, v6, -0x1

    .line 393
    .line 394
    move v10, v5

    .line 395
    :goto_5
    if-ge v10, v6, :cond_69

    .line 396
    .line 397
    iget-object v11, v2, Lu82;->v:[Lop0;

    .line 398
    .line 399
    iget-object v12, v2, Lu82;->e:[Ljava/lang/reflect/Type;

    .line 400
    .line 401
    aget-object v12, v12, v10

    .line 402
    .line 403
    aget-object v13, v4, v10

    .line 404
    .line 405
    if-ne v10, v8, :cond_16

    .line 406
    .line 407
    const/4 v14, 0x1

    .line 408
    goto :goto_6

    .line 409
    :cond_16
    move v14, v5

    .line 410
    :goto_6
    if-eqz v13, :cond_66

    .line 411
    .line 412
    array-length v15, v13

    .line 413
    move-object/from16 v17, v9

    .line 414
    .line 415
    move v9, v5

    .line 416
    :goto_7
    if-ge v9, v15, :cond_65

    .line 417
    .line 418
    aget-object v5, v13, v9

    .line 419
    .line 420
    move-object/from16 v18, v4

    .line 421
    .line 422
    sget-object v4, Lfx1;->h:Lfx1;

    .line 423
    .line 424
    move/from16 v19, v6

    .line 425
    .line 426
    instance-of v6, v5, Lu83;

    .line 427
    .line 428
    move/from16 v20, v6

    .line 429
    .line 430
    const-string v6, "@Path parameters may not be used with @Url."

    .line 431
    .line 432
    move/from16 v21, v8

    .line 433
    .line 434
    const-class v8, Ljava/lang/String;

    .line 435
    .line 436
    if-eqz v20, :cond_1f

    .line 437
    .line 438
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 439
    .line 440
    .line 441
    iget-boolean v4, v2, Lu82;->m:Z

    .line 442
    .line 443
    if-nez v4, :cond_1e

    .line 444
    .line 445
    iget-boolean v4, v2, Lu82;->i:Z

    .line 446
    .line 447
    if-nez v4, :cond_1d

    .line 448
    .line 449
    iget-boolean v4, v2, Lu82;->j:Z

    .line 450
    .line 451
    if-nez v4, :cond_1c

    .line 452
    .line 453
    iget-boolean v4, v2, Lu82;->k:Z

    .line 454
    .line 455
    if-nez v4, :cond_1b

    .line 456
    .line 457
    iget-boolean v4, v2, Lu82;->l:Z

    .line 458
    .line 459
    if-nez v4, :cond_1a

    .line 460
    .line 461
    iget-object v4, v2, Lu82;->r:Ljava/lang/String;

    .line 462
    .line 463
    if-nez v4, :cond_19

    .line 464
    .line 465
    const/4 v4, 0x1

    .line 466
    iput-boolean v4, v2, Lu82;->m:Z

    .line 467
    .line 468
    const-class v4, Lyw0;

    .line 469
    .line 470
    if-eq v12, v4, :cond_18

    .line 471
    .line 472
    if-eq v12, v8, :cond_18

    .line 473
    .line 474
    const-class v4, Ljava/net/URI;

    .line 475
    .line 476
    if-eq v12, v4, :cond_18

    .line 477
    .line 478
    instance-of v4, v12, Ljava/lang/Class;

    .line 479
    .line 480
    if-eqz v4, :cond_17

    .line 481
    .line 482
    move-object v4, v12

    .line 483
    check-cast v4, Ljava/lang/Class;

    .line 484
    .line 485
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v4

    .line 489
    const-string v5, "android.net.Uri"

    .line 490
    .line 491
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    if-eqz v4, :cond_17

    .line 496
    .line 497
    goto :goto_8

    .line 498
    :cond_17
    const-string v0, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    .line 499
    .line 500
    const/4 v2, 0x0

    .line 501
    new-array v2, v2, [Ljava/lang/Object;

    .line 502
    .line 503
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    throw v0

    .line 508
    :cond_18
    :goto_8
    new-instance v4, Lbx1;

    .line 509
    .line 510
    const/4 v5, 0x1

    .line 511
    invoke-direct {v4, v1, v10, v5}, Lbx1;-><init>(Ljava/lang/reflect/Method;II)V

    .line 512
    .line 513
    .line 514
    move-object v0, v4

    .line 515
    move-object/from16 v27, v7

    .line 516
    .line 517
    move/from16 v20, v9

    .line 518
    .line 519
    :goto_9
    move-object/from16 v24, v11

    .line 520
    .line 521
    move/from16 v25, v14

    .line 522
    .line 523
    move/from16 v22, v15

    .line 524
    .line 525
    goto/16 :goto_10

    .line 526
    .line 527
    :cond_19
    iget-object v0, v2, Lu82;->n:Ljava/lang/String;

    .line 528
    .line 529
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    const-string v2, "@Url cannot be used with @%s URL"

    .line 534
    .line 535
    invoke-static {v1, v10, v2, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    throw v0

    .line 540
    :cond_1a
    const-string v0, "A @Url parameter must not come after a @QueryMap."

    .line 541
    .line 542
    const/4 v2, 0x0

    .line 543
    new-array v2, v2, [Ljava/lang/Object;

    .line 544
    .line 545
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    throw v0

    .line 550
    :cond_1b
    const/4 v2, 0x0

    .line 551
    const-string v0, "A @Url parameter must not come after a @QueryName."

    .line 552
    .line 553
    new-array v2, v2, [Ljava/lang/Object;

    .line 554
    .line 555
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    throw v0

    .line 560
    :cond_1c
    const/4 v2, 0x0

    .line 561
    const-string v0, "A @Url parameter must not come after a @Query."

    .line 562
    .line 563
    new-array v2, v2, [Ljava/lang/Object;

    .line 564
    .line 565
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    throw v0

    .line 570
    :cond_1d
    const/4 v2, 0x0

    .line 571
    new-array v0, v2, [Ljava/lang/Object;

    .line 572
    .line 573
    invoke-static {v1, v10, v6, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    throw v0

    .line 578
    :cond_1e
    const/4 v2, 0x0

    .line 579
    const-string v0, "Multiple @Url method annotations found."

    .line 580
    .line 581
    new-array v2, v2, [Ljava/lang/Object;

    .line 582
    .line 583
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    throw v0

    .line 588
    :cond_1f
    move/from16 v20, v9

    .line 589
    .line 590
    instance-of v9, v5, Lvx1;

    .line 591
    .line 592
    move/from16 v22, v9

    .line 593
    .line 594
    iget-object v9, v2, Lu82;->a:Lcj;

    .line 595
    .line 596
    if-eqz v22, :cond_27

    .line 597
    .line 598
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 599
    .line 600
    .line 601
    iget-boolean v4, v2, Lu82;->j:Z

    .line 602
    .line 603
    if-nez v4, :cond_26

    .line 604
    .line 605
    iget-boolean v4, v2, Lu82;->k:Z

    .line 606
    .line 607
    if-nez v4, :cond_25

    .line 608
    .line 609
    iget-boolean v4, v2, Lu82;->l:Z

    .line 610
    .line 611
    if-nez v4, :cond_24

    .line 612
    .line 613
    iget-boolean v4, v2, Lu82;->m:Z

    .line 614
    .line 615
    if-nez v4, :cond_23

    .line 616
    .line 617
    iget-object v4, v2, Lu82;->r:Ljava/lang/String;

    .line 618
    .line 619
    if-eqz v4, :cond_22

    .line 620
    .line 621
    const/4 v4, 0x1

    .line 622
    iput-boolean v4, v2, Lu82;->i:Z

    .line 623
    .line 624
    check-cast v5, Lvx1;

    .line 625
    .line 626
    invoke-interface {v5}, Lvx1;->value()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v4

    .line 630
    sget-object v6, Lu82;->y:Ljava/util/regex/Pattern;

    .line 631
    .line 632
    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 633
    .line 634
    .line 635
    move-result-object v6

    .line 636
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 637
    .line 638
    .line 639
    move-result v6

    .line 640
    if-eqz v6, :cond_21

    .line 641
    .line 642
    iget-object v6, v2, Lu82;->u:Ljava/util/LinkedHashSet;

    .line 643
    .line 644
    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v6

    .line 648
    if-eqz v6, :cond_20

    .line 649
    .line 650
    invoke-virtual {v9, v12, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 651
    .line 652
    .line 653
    new-instance v6, Ldx1;

    .line 654
    .line 655
    iget-object v8, v2, Lu82;->b:Ljava/lang/reflect/Method;

    .line 656
    .line 657
    invoke-interface {v5}, Lvx1;->encoded()Z

    .line 658
    .line 659
    .line 660
    move-result v5

    .line 661
    invoke-direct {v6, v8, v10, v4, v5}, Ldx1;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;Z)V

    .line 662
    .line 663
    .line 664
    move-object v0, v6

    .line 665
    move-object/from16 v27, v7

    .line 666
    .line 667
    goto/16 :goto_9

    .line 668
    .line 669
    :cond_20
    iget-object v0, v2, Lu82;->r:Ljava/lang/String;

    .line 670
    .line 671
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    const-string v2, "URL \"%s\" does not contain \"{%s}\"."

    .line 676
    .line 677
    invoke-static {v1, v10, v2, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    throw v0

    .line 682
    :cond_21
    sget-object v0, Lu82;->x:Ljava/util/regex/Pattern;

    .line 683
    .line 684
    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    const-string v2, "@Path parameter name must match %s. Found: %s"

    .line 693
    .line 694
    invoke-static {v1, v10, v2, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    throw v0

    .line 699
    :cond_22
    iget-object v0, v2, Lu82;->n:Ljava/lang/String;

    .line 700
    .line 701
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    const-string v2, "@Path can only be used with relative url on @%s"

    .line 706
    .line 707
    invoke-static {v1, v10, v2, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    throw v0

    .line 712
    :cond_23
    const/4 v2, 0x0

    .line 713
    new-array v0, v2, [Ljava/lang/Object;

    .line 714
    .line 715
    invoke-static {v1, v10, v6, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    throw v0

    .line 720
    :cond_24
    const/4 v2, 0x0

    .line 721
    const-string v0, "A @Path parameter must not come after a @QueryMap."

    .line 722
    .line 723
    new-array v2, v2, [Ljava/lang/Object;

    .line 724
    .line 725
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    throw v0

    .line 730
    :cond_25
    const/4 v2, 0x0

    .line 731
    const-string v0, "A @Path parameter must not come after a @QueryName."

    .line 732
    .line 733
    new-array v2, v2, [Ljava/lang/Object;

    .line 734
    .line 735
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    throw v0

    .line 740
    :cond_26
    const/4 v2, 0x0

    .line 741
    const-string v0, "A @Path parameter must not come after a @Query."

    .line 742
    .line 743
    new-array v2, v2, [Ljava/lang/Object;

    .line 744
    .line 745
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    throw v0

    .line 750
    :cond_27
    instance-of v6, v5, Lp42;

    .line 751
    .line 752
    move/from16 v22, v6

    .line 753
    .line 754
    const-string v6, "<String>)"

    .line 755
    .line 756
    move-object/from16 v24, v11

    .line 757
    .line 758
    const-string v11, " must include generic type (e.g., "

    .line 759
    .line 760
    move/from16 v25, v14

    .line 761
    .line 762
    const-class v14, Ljava/lang/Iterable;

    .line 763
    .line 764
    if-eqz v22, :cond_2b

    .line 765
    .line 766
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 767
    .line 768
    .line 769
    check-cast v5, Lp42;

    .line 770
    .line 771
    invoke-interface {v5}, Lp42;->value()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v4

    .line 775
    invoke-interface {v5}, Lp42;->encoded()Z

    .line 776
    .line 777
    .line 778
    move-result v5

    .line 779
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    move-result-object v8

    .line 783
    move/from16 v22, v15

    .line 784
    .line 785
    const/4 v15, 0x1

    .line 786
    iput-boolean v15, v2, Lu82;->j:Z

    .line 787
    .line 788
    invoke-virtual {v14, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 789
    .line 790
    .line 791
    move-result v14

    .line 792
    if-eqz v14, :cond_29

    .line 793
    .line 794
    instance-of v14, v12, Ljava/lang/reflect/ParameterizedType;

    .line 795
    .line 796
    if-eqz v14, :cond_28

    .line 797
    .line 798
    move-object v6, v12

    .line 799
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 800
    .line 801
    const/4 v14, 0x0

    .line 802
    invoke-static {v14, v6}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 803
    .line 804
    .line 805
    move-result-object v6

    .line 806
    invoke-virtual {v9, v6, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 807
    .line 808
    .line 809
    new-instance v6, Lzw1;

    .line 810
    .line 811
    const/4 v8, 0x2

    .line 812
    invoke-direct {v6, v8, v4, v5}, Lzw1;-><init>(ILjava/lang/String;Z)V

    .line 813
    .line 814
    .line 815
    new-instance v4, Lxw1;

    .line 816
    .line 817
    invoke-direct {v4, v6, v14}, Lxw1;-><init>(Lop0;I)V

    .line 818
    .line 819
    .line 820
    :goto_a
    move-object v0, v4

    .line 821
    :goto_b
    move-object/from16 v27, v7

    .line 822
    .line 823
    goto/16 :goto_10

    .line 824
    .line 825
    :cond_28
    const/4 v14, 0x0

    .line 826
    new-instance v0, Ljava/lang/StringBuilder;

    .line 827
    .line 828
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v2

    .line 835
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    new-array v2, v14, [Ljava/lang/Object;

    .line 856
    .line 857
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    throw v0

    .line 862
    :cond_29
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    .line 863
    .line 864
    .line 865
    move-result v6

    .line 866
    if-eqz v6, :cond_2a

    .line 867
    .line 868
    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    move-result-object v6

    .line 872
    invoke-static {v6}, Lu82;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    move-result-object v6

    .line 876
    invoke-virtual {v9, v6, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 877
    .line 878
    .line 879
    new-instance v6, Lzw1;

    .line 880
    .line 881
    const/4 v8, 0x2

    .line 882
    invoke-direct {v6, v8, v4, v5}, Lzw1;-><init>(ILjava/lang/String;Z)V

    .line 883
    .line 884
    .line 885
    new-instance v4, Lxw1;

    .line 886
    .line 887
    const/4 v15, 0x1

    .line 888
    invoke-direct {v4, v6, v15}, Lxw1;-><init>(Lop0;I)V

    .line 889
    .line 890
    .line 891
    goto :goto_a

    .line 892
    :cond_2a
    const/4 v8, 0x2

    .line 893
    invoke-virtual {v9, v12, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 894
    .line 895
    .line 896
    new-instance v6, Lzw1;

    .line 897
    .line 898
    invoke-direct {v6, v8, v4, v5}, Lzw1;-><init>(ILjava/lang/String;Z)V

    .line 899
    .line 900
    .line 901
    move-object v0, v6

    .line 902
    goto :goto_b

    .line 903
    :cond_2b
    move/from16 v22, v15

    .line 904
    .line 905
    instance-of v15, v5, Lr42;

    .line 906
    .line 907
    if-eqz v15, :cond_2f

    .line 908
    .line 909
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 910
    .line 911
    .line 912
    check-cast v5, Lr42;

    .line 913
    .line 914
    invoke-interface {v5}, Lr42;->encoded()Z

    .line 915
    .line 916
    .line 917
    move-result v4

    .line 918
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    move-result-object v5

    .line 922
    const/4 v15, 0x1

    .line 923
    iput-boolean v15, v2, Lu82;->k:Z

    .line 924
    .line 925
    invoke-virtual {v14, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 926
    .line 927
    .line 928
    move-result v8

    .line 929
    if-eqz v8, :cond_2d

    .line 930
    .line 931
    instance-of v8, v12, Ljava/lang/reflect/ParameterizedType;

    .line 932
    .line 933
    if-eqz v8, :cond_2c

    .line 934
    .line 935
    move-object v5, v12

    .line 936
    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    .line 937
    .line 938
    const/4 v14, 0x0

    .line 939
    invoke-static {v14, v5}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 940
    .line 941
    .line 942
    move-result-object v5

    .line 943
    invoke-virtual {v9, v5, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 944
    .line 945
    .line 946
    new-instance v5, Lex1;

    .line 947
    .line 948
    invoke-direct {v5, v4}, Lex1;-><init>(Z)V

    .line 949
    .line 950
    .line 951
    new-instance v4, Lxw1;

    .line 952
    .line 953
    invoke-direct {v4, v5, v14}, Lxw1;-><init>(Lop0;I)V

    .line 954
    .line 955
    .line 956
    goto/16 :goto_a

    .line 957
    .line 958
    :cond_2c
    const/4 v14, 0x0

    .line 959
    new-instance v0, Ljava/lang/StringBuilder;

    .line 960
    .line 961
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 962
    .line 963
    .line 964
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v2

    .line 968
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v2

    .line 978
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 979
    .line 980
    .line 981
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 982
    .line 983
    .line 984
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    new-array v2, v14, [Ljava/lang/Object;

    .line 989
    .line 990
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    throw v0

    .line 995
    :cond_2d
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    .line 996
    .line 997
    .line 998
    move-result v6

    .line 999
    if-eqz v6, :cond_2e

    .line 1000
    .line 1001
    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v5

    .line 1005
    invoke-static {v5}, Lu82;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v5

    .line 1009
    invoke-virtual {v9, v5, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1010
    .line 1011
    .line 1012
    new-instance v5, Lex1;

    .line 1013
    .line 1014
    invoke-direct {v5, v4}, Lex1;-><init>(Z)V

    .line 1015
    .line 1016
    .line 1017
    new-instance v4, Lxw1;

    .line 1018
    .line 1019
    const/4 v15, 0x1

    .line 1020
    invoke-direct {v4, v5, v15}, Lxw1;-><init>(Lop0;I)V

    .line 1021
    .line 1022
    .line 1023
    goto/16 :goto_a

    .line 1024
    .line 1025
    :cond_2e
    invoke-virtual {v9, v12, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1026
    .line 1027
    .line 1028
    new-instance v5, Lex1;

    .line 1029
    .line 1030
    invoke-direct {v5, v4}, Lex1;-><init>(Z)V

    .line 1031
    .line 1032
    .line 1033
    move-object v0, v5

    .line 1034
    goto/16 :goto_b

    .line 1035
    .line 1036
    :cond_2f
    instance-of v15, v5, Lq42;

    .line 1037
    .line 1038
    move/from16 v26, v15

    .line 1039
    .line 1040
    const-string v15, "Map must include generic types (e.g., Map<String, String>)"

    .line 1041
    .line 1042
    move-object/from16 v27, v7

    .line 1043
    .line 1044
    const-class v7, Ljava/util/Map;

    .line 1045
    .line 1046
    if-eqz v26, :cond_33

    .line 1047
    .line 1048
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v4

    .line 1055
    const/4 v6, 0x1

    .line 1056
    iput-boolean v6, v2, Lu82;->l:Z

    .line 1057
    .line 1058
    invoke-virtual {v7, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1059
    .line 1060
    .line 1061
    move-result v7

    .line 1062
    if-eqz v7, :cond_32

    .line 1063
    .line 1064
    invoke-static {v12, v4}, Lxe1;->E(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v4

    .line 1068
    instance-of v7, v4, Ljava/lang/reflect/ParameterizedType;

    .line 1069
    .line 1070
    if-eqz v7, :cond_31

    .line 1071
    .line 1072
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 1073
    .line 1074
    const/4 v14, 0x0

    .line 1075
    invoke-static {v14, v4}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v7

    .line 1079
    if-ne v8, v7, :cond_30

    .line 1080
    .line 1081
    invoke-static {v6, v4}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v4

    .line 1085
    invoke-virtual {v9, v4, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1086
    .line 1087
    .line 1088
    new-instance v4, Lax1;

    .line 1089
    .line 1090
    check-cast v5, Lq42;

    .line 1091
    .line 1092
    invoke-interface {v5}, Lq42;->encoded()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v5

    .line 1096
    const/4 v8, 0x2

    .line 1097
    invoke-direct {v4, v1, v10, v5, v8}, Lax1;-><init>(Ljava/lang/reflect/Method;IZI)V

    .line 1098
    .line 1099
    .line 1100
    :goto_c
    move-object v0, v4

    .line 1101
    goto/16 :goto_10

    .line 1102
    .line 1103
    :cond_30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1104
    .line 1105
    const-string v2, "@QueryMap keys must be of type String: "

    .line 1106
    .line 1107
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    const/4 v14, 0x0

    .line 1118
    new-array v2, v14, [Ljava/lang/Object;

    .line 1119
    .line 1120
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v0

    .line 1124
    throw v0

    .line 1125
    :cond_31
    const/4 v14, 0x0

    .line 1126
    new-array v0, v14, [Ljava/lang/Object;

    .line 1127
    .line 1128
    invoke-static {v1, v10, v15, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    throw v0

    .line 1133
    :cond_32
    const/4 v14, 0x0

    .line 1134
    const-string v0, "@QueryMap parameter type must be Map."

    .line 1135
    .line 1136
    new-array v2, v14, [Ljava/lang/Object;

    .line 1137
    .line 1138
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    throw v0

    .line 1143
    :cond_33
    instance-of v0, v5, Lfs0;

    .line 1144
    .line 1145
    if-eqz v0, :cond_37

    .line 1146
    .line 1147
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 1148
    .line 1149
    .line 1150
    check-cast v5, Lfs0;

    .line 1151
    .line 1152
    invoke-interface {v5}, Lfs0;->value()Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v4

    .line 1160
    invoke-virtual {v14, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1161
    .line 1162
    .line 1163
    move-result v7

    .line 1164
    if-eqz v7, :cond_35

    .line 1165
    .line 1166
    instance-of v7, v12, Ljava/lang/reflect/ParameterizedType;

    .line 1167
    .line 1168
    if-eqz v7, :cond_34

    .line 1169
    .line 1170
    move-object v4, v12

    .line 1171
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 1172
    .line 1173
    const/4 v14, 0x0

    .line 1174
    invoke-static {v14, v4}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v4

    .line 1178
    invoke-virtual {v9, v4, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1179
    .line 1180
    .line 1181
    new-instance v4, Lzw1;

    .line 1182
    .line 1183
    invoke-interface {v5}, Lfs0;->allowUnsafeNonAsciiValues()Z

    .line 1184
    .line 1185
    .line 1186
    move-result v5

    .line 1187
    const/4 v15, 0x1

    .line 1188
    invoke-direct {v4, v15, v0, v5}, Lzw1;-><init>(ILjava/lang/String;Z)V

    .line 1189
    .line 1190
    .line 1191
    new-instance v0, Lxw1;

    .line 1192
    .line 1193
    invoke-direct {v0, v4, v14}, Lxw1;-><init>(Lop0;I)V

    .line 1194
    .line 1195
    .line 1196
    goto/16 :goto_10

    .line 1197
    .line 1198
    :cond_34
    const/4 v14, 0x0

    .line 1199
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1200
    .line 1201
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v2

    .line 1208
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v2

    .line 1218
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v0

    .line 1228
    new-array v2, v14, [Ljava/lang/Object;

    .line 1229
    .line 1230
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v0

    .line 1234
    throw v0

    .line 1235
    :cond_35
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 1236
    .line 1237
    .line 1238
    move-result v6

    .line 1239
    if-eqz v6, :cond_36

    .line 1240
    .line 1241
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v4

    .line 1245
    invoke-static {v4}, Lu82;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v4

    .line 1249
    invoke-virtual {v9, v4, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1250
    .line 1251
    .line 1252
    new-instance v4, Lzw1;

    .line 1253
    .line 1254
    invoke-interface {v5}, Lfs0;->allowUnsafeNonAsciiValues()Z

    .line 1255
    .line 1256
    .line 1257
    move-result v5

    .line 1258
    const/4 v15, 0x1

    .line 1259
    invoke-direct {v4, v15, v0, v5}, Lzw1;-><init>(ILjava/lang/String;Z)V

    .line 1260
    .line 1261
    .line 1262
    new-instance v0, Lxw1;

    .line 1263
    .line 1264
    invoke-direct {v0, v4, v15}, Lxw1;-><init>(Lop0;I)V

    .line 1265
    .line 1266
    .line 1267
    goto/16 :goto_10

    .line 1268
    .line 1269
    :cond_36
    const/4 v15, 0x1

    .line 1270
    invoke-virtual {v9, v12, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1271
    .line 1272
    .line 1273
    new-instance v4, Lzw1;

    .line 1274
    .line 1275
    invoke-interface {v5}, Lfs0;->allowUnsafeNonAsciiValues()Z

    .line 1276
    .line 1277
    .line 1278
    move-result v5

    .line 1279
    invoke-direct {v4, v15, v0, v5}, Lzw1;-><init>(ILjava/lang/String;Z)V

    .line 1280
    .line 1281
    .line 1282
    goto/16 :goto_c

    .line 1283
    .line 1284
    :cond_37
    instance-of v0, v5, Lis0;

    .line 1285
    .line 1286
    if-eqz v0, :cond_3c

    .line 1287
    .line 1288
    const-class v0, Ljs0;

    .line 1289
    .line 1290
    if-ne v12, v0, :cond_38

    .line 1291
    .line 1292
    new-instance v0, Lbx1;

    .line 1293
    .line 1294
    const/4 v14, 0x0

    .line 1295
    invoke-direct {v0, v1, v10, v14}, Lbx1;-><init>(Ljava/lang/reflect/Method;II)V

    .line 1296
    .line 1297
    .line 1298
    goto/16 :goto_10

    .line 1299
    .line 1300
    :cond_38
    const/4 v14, 0x0

    .line 1301
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 1302
    .line 1303
    .line 1304
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    invoke-virtual {v7, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1309
    .line 1310
    .line 1311
    move-result v4

    .line 1312
    if-eqz v4, :cond_3b

    .line 1313
    .line 1314
    invoke-static {v12, v0}, Lxe1;->E(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v0

    .line 1318
    instance-of v4, v0, Ljava/lang/reflect/ParameterizedType;

    .line 1319
    .line 1320
    if-eqz v4, :cond_3a

    .line 1321
    .line 1322
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 1323
    .line 1324
    invoke-static {v14, v0}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v4

    .line 1328
    if-ne v8, v4, :cond_39

    .line 1329
    .line 1330
    const/4 v15, 0x1

    .line 1331
    invoke-static {v15, v0}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v0

    .line 1335
    invoke-virtual {v9, v0, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1336
    .line 1337
    .line 1338
    new-instance v0, Lax1;

    .line 1339
    .line 1340
    check-cast v5, Lis0;

    .line 1341
    .line 1342
    invoke-interface {v5}, Lis0;->allowUnsafeNonAsciiValues()Z

    .line 1343
    .line 1344
    .line 1345
    move-result v4

    .line 1346
    invoke-direct {v0, v1, v10, v4, v15}, Lax1;-><init>(Ljava/lang/reflect/Method;IZI)V

    .line 1347
    .line 1348
    .line 1349
    goto/16 :goto_10

    .line 1350
    .line 1351
    :cond_39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1352
    .line 1353
    const-string v2, "@HeaderMap keys must be of type String: "

    .line 1354
    .line 1355
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v0

    .line 1365
    const/4 v14, 0x0

    .line 1366
    new-array v2, v14, [Ljava/lang/Object;

    .line 1367
    .line 1368
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v0

    .line 1372
    throw v0

    .line 1373
    :cond_3a
    new-array v0, v14, [Ljava/lang/Object;

    .line 1374
    .line 1375
    invoke-static {v1, v10, v15, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    throw v0

    .line 1380
    :cond_3b
    const-string v0, "@HeaderMap parameter type must be Map or Headers."

    .line 1381
    .line 1382
    new-array v2, v14, [Ljava/lang/Object;

    .line 1383
    .line 1384
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    throw v0

    .line 1389
    :cond_3c
    instance-of v0, v5, Lfi0;

    .line 1390
    .line 1391
    if-eqz v0, :cond_41

    .line 1392
    .line 1393
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 1394
    .line 1395
    .line 1396
    iget-boolean v0, v2, Lu82;->p:Z

    .line 1397
    .line 1398
    if-eqz v0, :cond_40

    .line 1399
    .line 1400
    check-cast v5, Lfi0;

    .line 1401
    .line 1402
    invoke-interface {v5}, Lfi0;->value()Ljava/lang/String;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v0

    .line 1406
    invoke-interface {v5}, Lfi0;->encoded()Z

    .line 1407
    .line 1408
    .line 1409
    move-result v4

    .line 1410
    const/4 v15, 0x1

    .line 1411
    iput-boolean v15, v2, Lu82;->f:Z

    .line 1412
    .line 1413
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v5

    .line 1417
    invoke-virtual {v14, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v7

    .line 1421
    if-eqz v7, :cond_3e

    .line 1422
    .line 1423
    instance-of v7, v12, Ljava/lang/reflect/ParameterizedType;

    .line 1424
    .line 1425
    if-eqz v7, :cond_3d

    .line 1426
    .line 1427
    move-object v5, v12

    .line 1428
    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    .line 1429
    .line 1430
    const/4 v14, 0x0

    .line 1431
    invoke-static {v14, v5}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v5

    .line 1435
    invoke-virtual {v9, v5, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1436
    .line 1437
    .line 1438
    new-instance v5, Lzw1;

    .line 1439
    .line 1440
    invoke-direct {v5, v14, v0, v4}, Lzw1;-><init>(ILjava/lang/String;Z)V

    .line 1441
    .line 1442
    .line 1443
    new-instance v0, Lxw1;

    .line 1444
    .line 1445
    invoke-direct {v0, v5, v14}, Lxw1;-><init>(Lop0;I)V

    .line 1446
    .line 1447
    .line 1448
    goto/16 :goto_10

    .line 1449
    .line 1450
    :cond_3d
    const/4 v14, 0x0

    .line 1451
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1452
    .line 1453
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1454
    .line 1455
    .line 1456
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v2

    .line 1460
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v2

    .line 1470
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1474
    .line 1475
    .line 1476
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v0

    .line 1480
    new-array v2, v14, [Ljava/lang/Object;

    .line 1481
    .line 1482
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    throw v0

    .line 1487
    :cond_3e
    const/4 v14, 0x0

    .line 1488
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    .line 1489
    .line 1490
    .line 1491
    move-result v6

    .line 1492
    if-eqz v6, :cond_3f

    .line 1493
    .line 1494
    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v5

    .line 1498
    invoke-static {v5}, Lu82;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v5

    .line 1502
    invoke-virtual {v9, v5, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1503
    .line 1504
    .line 1505
    new-instance v5, Lzw1;

    .line 1506
    .line 1507
    invoke-direct {v5, v14, v0, v4}, Lzw1;-><init>(ILjava/lang/String;Z)V

    .line 1508
    .line 1509
    .line 1510
    new-instance v0, Lxw1;

    .line 1511
    .line 1512
    const/4 v15, 0x1

    .line 1513
    invoke-direct {v0, v5, v15}, Lxw1;-><init>(Lop0;I)V

    .line 1514
    .line 1515
    .line 1516
    goto/16 :goto_10

    .line 1517
    .line 1518
    :cond_3f
    invoke-virtual {v9, v12, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1519
    .line 1520
    .line 1521
    new-instance v5, Lzw1;

    .line 1522
    .line 1523
    invoke-direct {v5, v14, v0, v4}, Lzw1;-><init>(ILjava/lang/String;Z)V

    .line 1524
    .line 1525
    .line 1526
    :goto_d
    move-object v0, v5

    .line 1527
    goto/16 :goto_10

    .line 1528
    .line 1529
    :cond_40
    const/4 v14, 0x0

    .line 1530
    const-string v0, "@Field parameters can only be used with form encoding."

    .line 1531
    .line 1532
    new-array v2, v14, [Ljava/lang/Object;

    .line 1533
    .line 1534
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    throw v0

    .line 1539
    :cond_41
    instance-of v0, v5, Loi0;

    .line 1540
    .line 1541
    if-eqz v0, :cond_46

    .line 1542
    .line 1543
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 1544
    .line 1545
    .line 1546
    iget-boolean v0, v2, Lu82;->p:Z

    .line 1547
    .line 1548
    if-eqz v0, :cond_45

    .line 1549
    .line 1550
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v0

    .line 1554
    invoke-virtual {v7, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1555
    .line 1556
    .line 1557
    move-result v4

    .line 1558
    if-eqz v4, :cond_44

    .line 1559
    .line 1560
    invoke-static {v12, v0}, Lxe1;->E(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v0

    .line 1564
    instance-of v4, v0, Ljava/lang/reflect/ParameterizedType;

    .line 1565
    .line 1566
    if-eqz v4, :cond_43

    .line 1567
    .line 1568
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 1569
    .line 1570
    const/4 v14, 0x0

    .line 1571
    invoke-static {v14, v0}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v4

    .line 1575
    if-ne v8, v4, :cond_42

    .line 1576
    .line 1577
    const/4 v15, 0x1

    .line 1578
    invoke-static {v15, v0}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v0

    .line 1582
    invoke-virtual {v9, v0, v13}, Lcj;->r(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1583
    .line 1584
    .line 1585
    iput-boolean v15, v2, Lu82;->f:Z

    .line 1586
    .line 1587
    new-instance v0, Lax1;

    .line 1588
    .line 1589
    check-cast v5, Loi0;

    .line 1590
    .line 1591
    invoke-interface {v5}, Loi0;->encoded()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v4

    .line 1595
    invoke-direct {v0, v1, v10, v4, v14}, Lax1;-><init>(Ljava/lang/reflect/Method;IZI)V

    .line 1596
    .line 1597
    .line 1598
    goto/16 :goto_10

    .line 1599
    .line 1600
    :cond_42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1601
    .line 1602
    const-string v2, "@FieldMap keys must be of type String: "

    .line 1603
    .line 1604
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1608
    .line 1609
    .line 1610
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v0

    .line 1614
    new-array v2, v14, [Ljava/lang/Object;

    .line 1615
    .line 1616
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v0

    .line 1620
    throw v0

    .line 1621
    :cond_43
    const/4 v14, 0x0

    .line 1622
    new-array v0, v14, [Ljava/lang/Object;

    .line 1623
    .line 1624
    invoke-static {v1, v10, v15, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    throw v0

    .line 1629
    :cond_44
    const/4 v14, 0x0

    .line 1630
    const-string v0, "@FieldMap parameter type must be Map."

    .line 1631
    .line 1632
    new-array v2, v14, [Ljava/lang/Object;

    .line 1633
    .line 1634
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v0

    .line 1638
    throw v0

    .line 1639
    :cond_45
    const/4 v14, 0x0

    .line 1640
    const-string v0, "@FieldMap parameters can only be used with form encoding."

    .line 1641
    .line 1642
    new-array v2, v14, [Ljava/lang/Object;

    .line 1643
    .line 1644
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    throw v0

    .line 1649
    :cond_46
    instance-of v0, v5, Lqx1;

    .line 1650
    .line 1651
    move/from16 v23, v0

    .line 1652
    .line 1653
    const-class v0, Ltj1;

    .line 1654
    .line 1655
    if-eqz v23, :cond_55

    .line 1656
    .line 1657
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 1658
    .line 1659
    .line 1660
    iget-boolean v7, v2, Lu82;->q:Z

    .line 1661
    .line 1662
    if-eqz v7, :cond_54

    .line 1663
    .line 1664
    check-cast v5, Lqx1;

    .line 1665
    .line 1666
    const/4 v15, 0x1

    .line 1667
    iput-boolean v15, v2, Lu82;->g:Z

    .line 1668
    .line 1669
    invoke-interface {v5}, Lqx1;->value()Ljava/lang/String;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v7

    .line 1673
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v8

    .line 1677
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 1678
    .line 1679
    .line 1680
    move-result v15

    .line 1681
    if-eqz v15, :cond_4d

    .line 1682
    .line 1683
    invoke-virtual {v14, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1684
    .line 1685
    .line 1686
    move-result v5

    .line 1687
    const-string v7, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    .line 1688
    .line 1689
    if-eqz v5, :cond_49

    .line 1690
    .line 1691
    instance-of v5, v12, Ljava/lang/reflect/ParameterizedType;

    .line 1692
    .line 1693
    if-eqz v5, :cond_48

    .line 1694
    .line 1695
    move-object v5, v12

    .line 1696
    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    .line 1697
    .line 1698
    const/4 v14, 0x0

    .line 1699
    invoke-static {v14, v5}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v5

    .line 1703
    invoke-static {v5}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v5

    .line 1707
    invoke-virtual {v0, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1708
    .line 1709
    .line 1710
    move-result v0

    .line 1711
    if-eqz v0, :cond_47

    .line 1712
    .line 1713
    new-instance v0, Lxw1;

    .line 1714
    .line 1715
    invoke-direct {v0, v4, v14}, Lxw1;-><init>(Lop0;I)V

    .line 1716
    .line 1717
    .line 1718
    goto/16 :goto_10

    .line 1719
    .line 1720
    :cond_47
    new-array v0, v14, [Ljava/lang/Object;

    .line 1721
    .line 1722
    invoke-static {v1, v10, v7, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v0

    .line 1726
    throw v0

    .line 1727
    :cond_48
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1728
    .line 1729
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1730
    .line 1731
    .line 1732
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v2

    .line 1736
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1740
    .line 1741
    .line 1742
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v2

    .line 1746
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1747
    .line 1748
    .line 1749
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1750
    .line 1751
    .line 1752
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v0

    .line 1756
    const/4 v14, 0x0

    .line 1757
    new-array v2, v14, [Ljava/lang/Object;

    .line 1758
    .line 1759
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v0

    .line 1763
    throw v0

    .line 1764
    :cond_49
    const/4 v14, 0x0

    .line 1765
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    .line 1766
    .line 1767
    .line 1768
    move-result v5

    .line 1769
    if-eqz v5, :cond_4b

    .line 1770
    .line 1771
    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v5

    .line 1775
    invoke-virtual {v0, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1776
    .line 1777
    .line 1778
    move-result v0

    .line 1779
    if-eqz v0, :cond_4a

    .line 1780
    .line 1781
    new-instance v0, Lxw1;

    .line 1782
    .line 1783
    const/4 v15, 0x1

    .line 1784
    invoke-direct {v0, v4, v15}, Lxw1;-><init>(Lop0;I)V

    .line 1785
    .line 1786
    .line 1787
    goto/16 :goto_10

    .line 1788
    .line 1789
    :cond_4a
    new-array v0, v14, [Ljava/lang/Object;

    .line 1790
    .line 1791
    invoke-static {v1, v10, v7, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v0

    .line 1795
    throw v0

    .line 1796
    :cond_4b
    invoke-virtual {v0, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1797
    .line 1798
    .line 1799
    move-result v0

    .line 1800
    if-eqz v0, :cond_4c

    .line 1801
    .line 1802
    goto/16 :goto_c

    .line 1803
    .line 1804
    :cond_4c
    new-array v0, v14, [Ljava/lang/Object;

    .line 1805
    .line 1806
    invoke-static {v1, v10, v7, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v0

    .line 1810
    throw v0

    .line 1811
    :cond_4d
    const-string v4, "form-data; name=\""

    .line 1812
    .line 1813
    const-string v15, "\""

    .line 1814
    .line 1815
    invoke-static {v4, v7, v15}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v4

    .line 1819
    const-string v7, "Content-Transfer-Encoding"

    .line 1820
    .line 1821
    invoke-interface {v5}, Lqx1;->encoding()Ljava/lang/String;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v5

    .line 1825
    const-string v15, "Content-Disposition"

    .line 1826
    .line 1827
    filled-new-array {v15, v4, v7, v5}, [Ljava/lang/String;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v4

    .line 1831
    sget-object v5, Ljs0;->i:Ljs0;

    .line 1832
    .line 1833
    invoke-static {v4}, Lci0;->P([Ljava/lang/String;)Ljs0;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v4

    .line 1837
    invoke-virtual {v14, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1838
    .line 1839
    .line 1840
    move-result v5

    .line 1841
    const-string v7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    .line 1842
    .line 1843
    if-eqz v5, :cond_50

    .line 1844
    .line 1845
    instance-of v5, v12, Ljava/lang/reflect/ParameterizedType;

    .line 1846
    .line 1847
    if-eqz v5, :cond_4f

    .line 1848
    .line 1849
    move-object v5, v12

    .line 1850
    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    .line 1851
    .line 1852
    const/4 v14, 0x0

    .line 1853
    invoke-static {v14, v5}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v5

    .line 1857
    invoke-static {v5}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v6

    .line 1861
    invoke-virtual {v0, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1862
    .line 1863
    .line 1864
    move-result v0

    .line 1865
    if-nez v0, :cond_4e

    .line 1866
    .line 1867
    invoke-virtual {v9, v5, v13, v3}, Lcj;->o(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lx00;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v0

    .line 1871
    new-instance v5, Lcx1;

    .line 1872
    .line 1873
    invoke-direct {v5, v1, v10, v4, v0}, Lcx1;-><init>(Ljava/lang/reflect/Method;ILjs0;Lx00;)V

    .line 1874
    .line 1875
    .line 1876
    new-instance v0, Lxw1;

    .line 1877
    .line 1878
    invoke-direct {v0, v5, v14}, Lxw1;-><init>(Lop0;I)V

    .line 1879
    .line 1880
    .line 1881
    goto/16 :goto_10

    .line 1882
    .line 1883
    :cond_4e
    new-array v0, v14, [Ljava/lang/Object;

    .line 1884
    .line 1885
    invoke-static {v1, v10, v7, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v0

    .line 1889
    throw v0

    .line 1890
    :cond_4f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1891
    .line 1892
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1893
    .line 1894
    .line 1895
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v2

    .line 1899
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1900
    .line 1901
    .line 1902
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1903
    .line 1904
    .line 1905
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v2

    .line 1909
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1910
    .line 1911
    .line 1912
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1913
    .line 1914
    .line 1915
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v0

    .line 1919
    const/4 v14, 0x0

    .line 1920
    new-array v2, v14, [Ljava/lang/Object;

    .line 1921
    .line 1922
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v0

    .line 1926
    throw v0

    .line 1927
    :cond_50
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    .line 1928
    .line 1929
    .line 1930
    move-result v5

    .line 1931
    if-eqz v5, :cond_52

    .line 1932
    .line 1933
    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v5

    .line 1937
    invoke-static {v5}, Lu82;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v5

    .line 1941
    invoke-virtual {v0, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1942
    .line 1943
    .line 1944
    move-result v0

    .line 1945
    if-nez v0, :cond_51

    .line 1946
    .line 1947
    invoke-virtual {v9, v5, v13, v3}, Lcj;->o(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lx00;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v0

    .line 1951
    new-instance v5, Lcx1;

    .line 1952
    .line 1953
    invoke-direct {v5, v1, v10, v4, v0}, Lcx1;-><init>(Ljava/lang/reflect/Method;ILjs0;Lx00;)V

    .line 1954
    .line 1955
    .line 1956
    new-instance v0, Lxw1;

    .line 1957
    .line 1958
    const/4 v15, 0x1

    .line 1959
    invoke-direct {v0, v5, v15}, Lxw1;-><init>(Lop0;I)V

    .line 1960
    .line 1961
    .line 1962
    goto/16 :goto_10

    .line 1963
    .line 1964
    :cond_51
    const/4 v14, 0x0

    .line 1965
    new-array v0, v14, [Ljava/lang/Object;

    .line 1966
    .line 1967
    invoke-static {v1, v10, v7, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v0

    .line 1971
    throw v0

    .line 1972
    :cond_52
    const/4 v14, 0x0

    .line 1973
    invoke-virtual {v0, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1974
    .line 1975
    .line 1976
    move-result v0

    .line 1977
    if-nez v0, :cond_53

    .line 1978
    .line 1979
    invoke-virtual {v9, v12, v13, v3}, Lcj;->o(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lx00;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v0

    .line 1983
    new-instance v5, Lcx1;

    .line 1984
    .line 1985
    invoke-direct {v5, v1, v10, v4, v0}, Lcx1;-><init>(Ljava/lang/reflect/Method;ILjs0;Lx00;)V

    .line 1986
    .line 1987
    .line 1988
    goto/16 :goto_d

    .line 1989
    .line 1990
    :cond_53
    new-array v0, v14, [Ljava/lang/Object;

    .line 1991
    .line 1992
    invoke-static {v1, v10, v7, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v0

    .line 1996
    throw v0

    .line 1997
    :cond_54
    const/4 v14, 0x0

    .line 1998
    const-string v0, "@Part parameters can only be used with multipart encoding."

    .line 1999
    .line 2000
    new-array v2, v14, [Ljava/lang/Object;

    .line 2001
    .line 2002
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v0

    .line 2006
    throw v0

    .line 2007
    :cond_55
    instance-of v4, v5, Lrx1;

    .line 2008
    .line 2009
    if-eqz v4, :cond_5b

    .line 2010
    .line 2011
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 2012
    .line 2013
    .line 2014
    iget-boolean v4, v2, Lu82;->q:Z

    .line 2015
    .line 2016
    if-eqz v4, :cond_5a

    .line 2017
    .line 2018
    const/4 v4, 0x1

    .line 2019
    iput-boolean v4, v2, Lu82;->g:Z

    .line 2020
    .line 2021
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v6

    .line 2025
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2026
    .line 2027
    .line 2028
    move-result v7

    .line 2029
    if-eqz v7, :cond_59

    .line 2030
    .line 2031
    invoke-static {v12, v6}, Lxe1;->E(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v6

    .line 2035
    instance-of v7, v6, Ljava/lang/reflect/ParameterizedType;

    .line 2036
    .line 2037
    if-eqz v7, :cond_58

    .line 2038
    .line 2039
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 2040
    .line 2041
    const/4 v14, 0x0

    .line 2042
    invoke-static {v14, v6}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v7

    .line 2046
    if-ne v8, v7, :cond_57

    .line 2047
    .line 2048
    invoke-static {v4, v6}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v6

    .line 2052
    invoke-static {v6}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v4

    .line 2056
    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2057
    .line 2058
    .line 2059
    move-result v0

    .line 2060
    if-nez v0, :cond_56

    .line 2061
    .line 2062
    invoke-virtual {v9, v6, v13, v3}, Lcj;->o(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lx00;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v0

    .line 2066
    check-cast v5, Lrx1;

    .line 2067
    .line 2068
    new-instance v4, Lcx1;

    .line 2069
    .line 2070
    invoke-interface {v5}, Lrx1;->encoding()Ljava/lang/String;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v5

    .line 2074
    invoke-direct {v4, v1, v10, v0, v5}, Lcx1;-><init>(Ljava/lang/reflect/Method;ILx00;Ljava/lang/String;)V

    .line 2075
    .line 2076
    .line 2077
    goto/16 :goto_c

    .line 2078
    .line 2079
    :cond_56
    const-string v0, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    .line 2080
    .line 2081
    const/4 v14, 0x0

    .line 2082
    new-array v2, v14, [Ljava/lang/Object;

    .line 2083
    .line 2084
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v0

    .line 2088
    throw v0

    .line 2089
    :cond_57
    const/4 v14, 0x0

    .line 2090
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2091
    .line 2092
    const-string v2, "@PartMap keys must be of type String: "

    .line 2093
    .line 2094
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2095
    .line 2096
    .line 2097
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2098
    .line 2099
    .line 2100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v0

    .line 2104
    new-array v2, v14, [Ljava/lang/Object;

    .line 2105
    .line 2106
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v0

    .line 2110
    throw v0

    .line 2111
    :cond_58
    const/4 v14, 0x0

    .line 2112
    new-array v0, v14, [Ljava/lang/Object;

    .line 2113
    .line 2114
    invoke-static {v1, v10, v15, v0}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v0

    .line 2118
    throw v0

    .line 2119
    :cond_59
    const/4 v14, 0x0

    .line 2120
    const-string v0, "@PartMap parameter type must be Map."

    .line 2121
    .line 2122
    new-array v2, v14, [Ljava/lang/Object;

    .line 2123
    .line 2124
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v0

    .line 2128
    throw v0

    .line 2129
    :cond_5a
    const/4 v14, 0x0

    .line 2130
    const-string v0, "@PartMap parameters can only be used with multipart encoding."

    .line 2131
    .line 2132
    new-array v2, v14, [Ljava/lang/Object;

    .line 2133
    .line 2134
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v0

    .line 2138
    throw v0

    .line 2139
    :cond_5b
    instance-of v0, v5, Lil;

    .line 2140
    .line 2141
    if-eqz v0, :cond_5e

    .line 2142
    .line 2143
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 2144
    .line 2145
    .line 2146
    iget-boolean v0, v2, Lu82;->p:Z

    .line 2147
    .line 2148
    if-nez v0, :cond_5d

    .line 2149
    .line 2150
    iget-boolean v0, v2, Lu82;->q:Z

    .line 2151
    .line 2152
    if-nez v0, :cond_5d

    .line 2153
    .line 2154
    iget-boolean v0, v2, Lu82;->h:Z

    .line 2155
    .line 2156
    if-nez v0, :cond_5c

    .line 2157
    .line 2158
    :try_start_1
    invoke-virtual {v9, v12, v13, v3}, Lcj;->o(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lx00;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2162
    const/4 v15, 0x1

    .line 2163
    iput-boolean v15, v2, Lu82;->h:Z

    .line 2164
    .line 2165
    new-instance v4, Lyw1;

    .line 2166
    .line 2167
    invoke-direct {v4, v1, v10, v0}, Lyw1;-><init>(Ljava/lang/reflect/Method;ILx00;)V

    .line 2168
    .line 2169
    .line 2170
    goto/16 :goto_c

    .line 2171
    .line 2172
    :catch_1
    move-exception v0

    .line 2173
    const-string v2, "Unable to create @Body converter for %s"

    .line 2174
    .line 2175
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v3

    .line 2179
    invoke-static {v1, v0, v10, v2, v3}, Lxe1;->b0(Ljava/lang/reflect/Method;Ljava/lang/Exception;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v0

    .line 2183
    throw v0

    .line 2184
    :cond_5c
    const-string v0, "Multiple @Body method annotations found."

    .line 2185
    .line 2186
    const/4 v14, 0x0

    .line 2187
    new-array v2, v14, [Ljava/lang/Object;

    .line 2188
    .line 2189
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v0

    .line 2193
    throw v0

    .line 2194
    :cond_5d
    const/4 v14, 0x0

    .line 2195
    const-string v0, "@Body parameters cannot be used with form or multi-part encoding."

    .line 2196
    .line 2197
    new-array v2, v14, [Ljava/lang/Object;

    .line 2198
    .line 2199
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v0

    .line 2203
    throw v0

    .line 2204
    :cond_5e
    instance-of v0, v5, Lpx2;

    .line 2205
    .line 2206
    if-eqz v0, :cond_62

    .line 2207
    .line 2208
    invoke-virtual {v2, v10, v12}, Lu82;->c(ILjava/lang/reflect/Type;)V

    .line 2209
    .line 2210
    .line 2211
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v0

    .line 2215
    invoke-static {v0}, Lu82;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v0

    .line 2219
    add-int/lit8 v4, v10, -0x1

    .line 2220
    .line 2221
    :goto_e
    if-ltz v4, :cond_61

    .line 2222
    .line 2223
    iget-object v5, v2, Lu82;->v:[Lop0;

    .line 2224
    .line 2225
    aget-object v5, v5, v4

    .line 2226
    .line 2227
    instance-of v6, v5, Lgx1;

    .line 2228
    .line 2229
    if-eqz v6, :cond_60

    .line 2230
    .line 2231
    check-cast v5, Lgx1;

    .line 2232
    .line 2233
    iget-object v5, v5, Lgx1;->h:Ljava/lang/Class;

    .line 2234
    .line 2235
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2236
    .line 2237
    .line 2238
    move-result v5

    .line 2239
    if-nez v5, :cond_5f

    .line 2240
    .line 2241
    goto :goto_f

    .line 2242
    :cond_5f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2243
    .line 2244
    const-string v3, "@Tag type "

    .line 2245
    .line 2246
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2247
    .line 2248
    .line 2249
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v0

    .line 2253
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2254
    .line 2255
    .line 2256
    const-string v0, " is duplicate of "

    .line 2257
    .line 2258
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2259
    .line 2260
    .line 2261
    sget-object v0, Lyz1;->b:Li51;

    .line 2262
    .line 2263
    invoke-virtual {v0, v1, v4}, Li51;->l(Ljava/lang/reflect/Method;I)Ljava/lang/String;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v0

    .line 2267
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2268
    .line 2269
    .line 2270
    const-string v0, " and would always overwrite its value."

    .line 2271
    .line 2272
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2273
    .line 2274
    .line 2275
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v0

    .line 2279
    const/4 v14, 0x0

    .line 2280
    new-array v2, v14, [Ljava/lang/Object;

    .line 2281
    .line 2282
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v0

    .line 2286
    throw v0

    .line 2287
    :cond_60
    :goto_f
    add-int/lit8 v4, v4, -0x1

    .line 2288
    .line 2289
    goto :goto_e

    .line 2290
    :cond_61
    new-instance v4, Lgx1;

    .line 2291
    .line 2292
    invoke-direct {v4, v0}, Lgx1;-><init>(Ljava/lang/Class;)V

    .line 2293
    .line 2294
    .line 2295
    goto/16 :goto_c

    .line 2296
    .line 2297
    :cond_62
    const/4 v0, 0x0

    .line 2298
    :goto_10
    if-nez v0, :cond_63

    .line 2299
    .line 2300
    goto :goto_11

    .line 2301
    :cond_63
    if-nez v17, :cond_64

    .line 2302
    .line 2303
    move-object/from16 v17, v0

    .line 2304
    .line 2305
    :goto_11
    add-int/lit8 v9, v20, 0x1

    .line 2306
    .line 2307
    move-object/from16 v0, p0

    .line 2308
    .line 2309
    move-object/from16 v4, v18

    .line 2310
    .line 2311
    move/from16 v6, v19

    .line 2312
    .line 2313
    move/from16 v8, v21

    .line 2314
    .line 2315
    move/from16 v15, v22

    .line 2316
    .line 2317
    move-object/from16 v11, v24

    .line 2318
    .line 2319
    move/from16 v14, v25

    .line 2320
    .line 2321
    move-object/from16 v7, v27

    .line 2322
    .line 2323
    const/4 v5, 0x0

    .line 2324
    goto/16 :goto_7

    .line 2325
    .line 2326
    :cond_64
    const-string v0, "Multiple Retrofit annotations found, only one allowed."

    .line 2327
    .line 2328
    const/4 v14, 0x0

    .line 2329
    new-array v2, v14, [Ljava/lang/Object;

    .line 2330
    .line 2331
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v0

    .line 2335
    throw v0

    .line 2336
    :cond_65
    :goto_12
    move-object/from16 v18, v4

    .line 2337
    .line 2338
    move/from16 v19, v6

    .line 2339
    .line 2340
    move-object/from16 v27, v7

    .line 2341
    .line 2342
    move/from16 v21, v8

    .line 2343
    .line 2344
    move-object/from16 v24, v11

    .line 2345
    .line 2346
    move/from16 v25, v14

    .line 2347
    .line 2348
    goto :goto_13

    .line 2349
    :cond_66
    const/16 v17, 0x0

    .line 2350
    .line 2351
    goto :goto_12

    .line 2352
    :goto_13
    if-nez v17, :cond_68

    .line 2353
    .line 2354
    if-eqz v25, :cond_67

    .line 2355
    .line 2356
    :try_start_2
    invoke-static {v12}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2357
    .line 2358
    .line 2359
    move-result-object v0

    .line 2360
    const-class v4, Lt00;

    .line 2361
    .line 2362
    if-ne v0, v4, :cond_67

    .line 2363
    .line 2364
    const/4 v15, 0x1

    .line 2365
    iput-boolean v15, v2, Lu82;->w:Z
    :try_end_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_2

    .line 2366
    .line 2367
    const/16 v17, 0x0

    .line 2368
    .line 2369
    goto :goto_14

    .line 2370
    :catch_2
    :cond_67
    const-string v0, "No Retrofit annotation found."

    .line 2371
    .line 2372
    const/4 v14, 0x0

    .line 2373
    new-array v2, v14, [Ljava/lang/Object;

    .line 2374
    .line 2375
    invoke-static {v1, v10, v0, v2}, Lxe1;->a0(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2376
    .line 2377
    .line 2378
    move-result-object v0

    .line 2379
    throw v0

    .line 2380
    :cond_68
    :goto_14
    aput-object v17, v24, v10

    .line 2381
    .line 2382
    add-int/lit8 v10, v10, 0x1

    .line 2383
    .line 2384
    move-object/from16 v0, p0

    .line 2385
    .line 2386
    move-object/from16 v4, v18

    .line 2387
    .line 2388
    move/from16 v6, v19

    .line 2389
    .line 2390
    move/from16 v8, v21

    .line 2391
    .line 2392
    move-object/from16 v7, v27

    .line 2393
    .line 2394
    const/4 v5, 0x0

    .line 2395
    const/4 v9, 0x0

    .line 2396
    goto/16 :goto_5

    .line 2397
    .line 2398
    :cond_69
    move-object/from16 v27, v7

    .line 2399
    .line 2400
    iget-object v0, v2, Lu82;->r:Ljava/lang/String;

    .line 2401
    .line 2402
    if-nez v0, :cond_6b

    .line 2403
    .line 2404
    iget-boolean v0, v2, Lu82;->m:Z

    .line 2405
    .line 2406
    if-eqz v0, :cond_6a

    .line 2407
    .line 2408
    goto :goto_15

    .line 2409
    :cond_6a
    iget-object v0, v2, Lu82;->n:Ljava/lang/String;

    .line 2410
    .line 2411
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2412
    .line 2413
    .line 2414
    move-result-object v0

    .line 2415
    const-string v2, "Missing either @%s URL or @Url parameter."

    .line 2416
    .line 2417
    const/4 v3, 0x0

    .line 2418
    invoke-static {v1, v3, v2, v0}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v0

    .line 2422
    throw v0

    .line 2423
    :cond_6b
    :goto_15
    iget-boolean v0, v2, Lu82;->p:Z

    .line 2424
    .line 2425
    if-nez v0, :cond_6c

    .line 2426
    .line 2427
    iget-boolean v3, v2, Lu82;->q:Z

    .line 2428
    .line 2429
    if-nez v3, :cond_6c

    .line 2430
    .line 2431
    iget-boolean v3, v2, Lu82;->o:Z

    .line 2432
    .line 2433
    if-nez v3, :cond_6c

    .line 2434
    .line 2435
    iget-boolean v3, v2, Lu82;->h:Z

    .line 2436
    .line 2437
    if-nez v3, :cond_6d

    .line 2438
    .line 2439
    :cond_6c
    const/4 v3, 0x0

    .line 2440
    const/4 v14, 0x0

    .line 2441
    goto :goto_16

    .line 2442
    :cond_6d
    const-string v0, "Non-body HTTP method cannot contain @Body."

    .line 2443
    .line 2444
    const/4 v14, 0x0

    .line 2445
    new-array v2, v14, [Ljava/lang/Object;

    .line 2446
    .line 2447
    const/4 v3, 0x0

    .line 2448
    invoke-static {v1, v3, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v0

    .line 2452
    throw v0

    .line 2453
    :goto_16
    if-eqz v0, :cond_6f

    .line 2454
    .line 2455
    iget-boolean v0, v2, Lu82;->f:Z

    .line 2456
    .line 2457
    if-eqz v0, :cond_6e

    .line 2458
    .line 2459
    goto :goto_17

    .line 2460
    :cond_6e
    const-string v0, "Form-encoded method must contain at least one @Field."

    .line 2461
    .line 2462
    new-array v2, v14, [Ljava/lang/Object;

    .line 2463
    .line 2464
    invoke-static {v1, v3, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2465
    .line 2466
    .line 2467
    move-result-object v0

    .line 2468
    throw v0

    .line 2469
    :cond_6f
    :goto_17
    iget-boolean v0, v2, Lu82;->q:Z

    .line 2470
    .line 2471
    if-eqz v0, :cond_71

    .line 2472
    .line 2473
    iget-boolean v0, v2, Lu82;->g:Z

    .line 2474
    .line 2475
    if-eqz v0, :cond_70

    .line 2476
    .line 2477
    goto :goto_18

    .line 2478
    :cond_70
    const-string v0, "Multipart method must contain at least one @Part."

    .line 2479
    .line 2480
    new-array v2, v14, [Ljava/lang/Object;

    .line 2481
    .line 2482
    invoke-static {v1, v3, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2483
    .line 2484
    .line 2485
    move-result-object v0

    .line 2486
    throw v0

    .line 2487
    :cond_71
    :goto_18
    new-instance v0, Lv82;

    .line 2488
    .line 2489
    invoke-direct {v0, v2}, Lv82;-><init>(Lu82;)V

    .line 2490
    .line 2491
    .line 2492
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 2493
    .line 2494
    .line 2495
    move-result-object v2

    .line 2496
    invoke-static {v2}, Lxe1;->F(Ljava/lang/reflect/Type;)Z

    .line 2497
    .line 2498
    .line 2499
    move-result v3

    .line 2500
    if-nez v3, :cond_7f

    .line 2501
    .line 2502
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2503
    .line 2504
    if-eq v2, v3, :cond_7e

    .line 2505
    .line 2506
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 2507
    .line 2508
    .line 2509
    move-result-object v2

    .line 2510
    const-class v3, La83;

    .line 2511
    .line 2512
    const-class v4, Lq92;

    .line 2513
    .line 2514
    iget-boolean v5, v0, Lv82;->k:Z

    .line 2515
    .line 2516
    if-eqz v5, :cond_77

    .line 2517
    .line 2518
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 2519
    .line 2520
    .line 2521
    move-result-object v6

    .line 2522
    array-length v7, v6

    .line 2523
    const/16 v16, 0x1

    .line 2524
    .line 2525
    add-int/lit8 v7, v7, -0x1

    .line 2526
    .line 2527
    aget-object v6, v6, v7

    .line 2528
    .line 2529
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 2530
    .line 2531
    invoke-interface {v6}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 2532
    .line 2533
    .line 2534
    move-result-object v6

    .line 2535
    const/4 v14, 0x0

    .line 2536
    aget-object v6, v6, v14

    .line 2537
    .line 2538
    instance-of v7, v6, Ljava/lang/reflect/WildcardType;

    .line 2539
    .line 2540
    if-eqz v7, :cond_72

    .line 2541
    .line 2542
    check-cast v6, Ljava/lang/reflect/WildcardType;

    .line 2543
    .line 2544
    invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 2545
    .line 2546
    .line 2547
    move-result-object v6

    .line 2548
    aget-object v6, v6, v14

    .line 2549
    .line 2550
    :cond_72
    invoke-static {v6}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2551
    .line 2552
    .line 2553
    move-result-object v7

    .line 2554
    const-class v8, Lwo;

    .line 2555
    .line 2556
    if-ne v7, v4, :cond_73

    .line 2557
    .line 2558
    instance-of v7, v6, Ljava/lang/reflect/ParameterizedType;

    .line 2559
    .line 2560
    if-eqz v7, :cond_73

    .line 2561
    .line 2562
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 2563
    .line 2564
    invoke-static {v14, v6}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2565
    .line 2566
    .line 2567
    move-result-object v6

    .line 2568
    const/4 v7, 0x1

    .line 2569
    const/4 v9, 0x0

    .line 2570
    goto :goto_1a

    .line 2571
    :cond_73
    invoke-static {v6}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2572
    .line 2573
    .line 2574
    move-result-object v7

    .line 2575
    if-eq v7, v8, :cond_76

    .line 2576
    .line 2577
    sget-boolean v7, Lxe1;->h:Z

    .line 2578
    .line 2579
    if-eqz v7, :cond_74

    .line 2580
    .line 2581
    if-ne v6, v3, :cond_74

    .line 2582
    .line 2583
    const/4 v7, 0x1

    .line 2584
    goto :goto_19

    .line 2585
    :cond_74
    const/4 v7, 0x0

    .line 2586
    :goto_19
    move v9, v7

    .line 2587
    const/4 v7, 0x0

    .line 2588
    :goto_1a
    new-instance v10, Le93;

    .line 2589
    .line 2590
    const/4 v15, 0x1

    .line 2591
    new-array v11, v15, [Ljava/lang/reflect/Type;

    .line 2592
    .line 2593
    const/4 v14, 0x0

    .line 2594
    aput-object v6, v11, v14

    .line 2595
    .line 2596
    const/4 v6, 0x0

    .line 2597
    invoke-direct {v10, v6, v8, v11}, Le93;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 2598
    .line 2599
    .line 2600
    const-class v6, Lmr2;

    .line 2601
    .line 2602
    invoke-static {v2, v6}, Lxe1;->J([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    .line 2603
    .line 2604
    .line 2605
    move-result v6

    .line 2606
    if-eqz v6, :cond_75

    .line 2607
    .line 2608
    goto :goto_1b

    .line 2609
    :cond_75
    array-length v6, v2

    .line 2610
    add-int/2addr v6, v15

    .line 2611
    new-array v6, v6, [Ljava/lang/annotation/Annotation;

    .line 2612
    .line 2613
    sget-object v8, Lnr2;->a:Lnr2;

    .line 2614
    .line 2615
    aput-object v8, v6, v14

    .line 2616
    .line 2617
    array-length v8, v2

    .line 2618
    invoke-static {v2, v14, v6, v15, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2619
    .line 2620
    .line 2621
    move-object v2, v6

    .line 2622
    :goto_1b
    move v6, v9

    .line 2623
    :goto_1c
    move-object/from16 v8, p0

    .line 2624
    .line 2625
    goto :goto_1d

    .line 2626
    :cond_76
    const/4 v14, 0x0

    .line 2627
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 2628
    .line 2629
    invoke-static {v14, v6}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2630
    .line 2631
    .line 2632
    move-result-object v0

    .line 2633
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2634
    .line 2635
    .line 2636
    move-result-object v0

    .line 2637
    const-string v2, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s"

    .line 2638
    .line 2639
    const/4 v3, 0x0

    .line 2640
    invoke-static {v1, v3, v2, v0}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2641
    .line 2642
    .line 2643
    move-result-object v0

    .line 2644
    throw v0

    .line 2645
    :cond_77
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 2646
    .line 2647
    .line 2648
    move-result-object v10

    .line 2649
    const/4 v6, 0x0

    .line 2650
    const/4 v7, 0x0

    .line 2651
    goto :goto_1c

    .line 2652
    :goto_1d
    :try_start_3
    invoke-virtual {v8, v10, v2}, Lcj;->f(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lyo;

    .line 2653
    .line 2654
    .line 2655
    move-result-object v2
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 2656
    invoke-interface {v2}, Lyo;->e()Ljava/lang/reflect/Type;

    .line 2657
    .line 2658
    .line 2659
    move-result-object v9

    .line 2660
    const-class v10, Lr92;

    .line 2661
    .line 2662
    if-eq v9, v10, :cond_7d

    .line 2663
    .line 2664
    if-eq v9, v4, :cond_7c

    .line 2665
    .line 2666
    iget-object v4, v0, Lv82;->c:Ljava/lang/String;

    .line 2667
    .line 2668
    move-object/from16 v10, v27

    .line 2669
    .line 2670
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2671
    .line 2672
    .line 2673
    move-result v4

    .line 2674
    if-eqz v4, :cond_79

    .line 2675
    .line 2676
    const-class v4, Ljava/lang/Void;

    .line 2677
    .line 2678
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2679
    .line 2680
    .line 2681
    move-result v4

    .line 2682
    if-nez v4, :cond_79

    .line 2683
    .line 2684
    sget-boolean v4, Lxe1;->h:Z

    .line 2685
    .line 2686
    if-eqz v4, :cond_78

    .line 2687
    .line 2688
    if-ne v9, v3, :cond_78

    .line 2689
    .line 2690
    goto :goto_1e

    .line 2691
    :cond_78
    const-string v0, "HEAD method must use Void or Unit as response type."

    .line 2692
    .line 2693
    const/4 v14, 0x0

    .line 2694
    new-array v2, v14, [Ljava/lang/Object;

    .line 2695
    .line 2696
    const/4 v3, 0x0

    .line 2697
    invoke-static {v1, v3, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2698
    .line 2699
    .line 2700
    move-result-object v0

    .line 2701
    throw v0

    .line 2702
    :cond_79
    :goto_1e
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 2703
    .line 2704
    .line 2705
    move-result-object v3

    .line 2706
    :try_start_4
    invoke-virtual {v8, v9, v3}, Lcj;->p(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lx00;

    .line 2707
    .line 2708
    .line 2709
    move-result-object v4
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    .line 2710
    iget-object v1, v8, Lcj;->b:Ljava/lang/Object;

    .line 2711
    .line 2712
    move-object v3, v1

    .line 2713
    check-cast v3, Let1;

    .line 2714
    .line 2715
    if-nez v5, :cond_7a

    .line 2716
    .line 2717
    new-instance v1, Luw0;

    .line 2718
    .line 2719
    const/4 v6, 0x0

    .line 2720
    move-object v5, v2

    .line 2721
    move-object v2, v0

    .line 2722
    invoke-direct/range {v1 .. v6}, Luw0;-><init>(Lv82;Let1;Lx00;Lyo;I)V

    .line 2723
    .line 2724
    .line 2725
    return-object v1

    .line 2726
    :cond_7a
    move-object v5, v2

    .line 2727
    move-object v2, v0

    .line 2728
    if-eqz v7, :cond_7b

    .line 2729
    .line 2730
    new-instance v1, Luw0;

    .line 2731
    .line 2732
    const/4 v6, 0x1

    .line 2733
    invoke-direct/range {v1 .. v6}, Luw0;-><init>(Lv82;Let1;Lx00;Lyo;I)V

    .line 2734
    .line 2735
    .line 2736
    return-object v1

    .line 2737
    :cond_7b
    new-instance v1, Lvw0;

    .line 2738
    .line 2739
    invoke-direct/range {v1 .. v6}, Lvw0;-><init>(Lv82;Let1;Lx00;Lyo;Z)V

    .line 2740
    .line 2741
    .line 2742
    return-object v1

    .line 2743
    :catch_3
    move-exception v0

    .line 2744
    const-string v2, "Unable to create converter for %s"

    .line 2745
    .line 2746
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 2747
    .line 2748
    .line 2749
    move-result-object v3

    .line 2750
    invoke-static {v1, v0, v2, v3}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2751
    .line 2752
    .line 2753
    move-result-object v0

    .line 2754
    throw v0

    .line 2755
    :cond_7c
    const-string v0, "Response must include generic type (e.g., Response<String>)"

    .line 2756
    .line 2757
    const/4 v14, 0x0

    .line 2758
    new-array v2, v14, [Ljava/lang/Object;

    .line 2759
    .line 2760
    const/4 v3, 0x0

    .line 2761
    invoke-static {v1, v3, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2762
    .line 2763
    .line 2764
    move-result-object v0

    .line 2765
    throw v0

    .line 2766
    :cond_7d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2767
    .line 2768
    const-string v2, "\'"

    .line 2769
    .line 2770
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2771
    .line 2772
    .line 2773
    invoke-static {v9}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2774
    .line 2775
    .line 2776
    move-result-object v2

    .line 2777
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v2

    .line 2781
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2782
    .line 2783
    .line 2784
    const-string v2, "\' is not a valid response body type. Did you mean ResponseBody?"

    .line 2785
    .line 2786
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2787
    .line 2788
    .line 2789
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2790
    .line 2791
    .line 2792
    move-result-object v0

    .line 2793
    const/4 v14, 0x0

    .line 2794
    new-array v2, v14, [Ljava/lang/Object;

    .line 2795
    .line 2796
    const/4 v3, 0x0

    .line 2797
    invoke-static {v1, v3, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2798
    .line 2799
    .line 2800
    move-result-object v0

    .line 2801
    throw v0

    .line 2802
    :catch_4
    move-exception v0

    .line 2803
    const-string v2, "Unable to create call adapter for %s"

    .line 2804
    .line 2805
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 2806
    .line 2807
    .line 2808
    move-result-object v3

    .line 2809
    invoke-static {v1, v0, v2, v3}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2810
    .line 2811
    .line 2812
    move-result-object v0

    .line 2813
    throw v0

    .line 2814
    :cond_7e
    const/4 v3, 0x0

    .line 2815
    const/4 v14, 0x0

    .line 2816
    const-string v0, "Service methods cannot return void."

    .line 2817
    .line 2818
    new-array v2, v14, [Ljava/lang/Object;

    .line 2819
    .line 2820
    invoke-static {v1, v3, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2821
    .line 2822
    .line 2823
    move-result-object v0

    .line 2824
    throw v0

    .line 2825
    :cond_7f
    const/4 v3, 0x0

    .line 2826
    const-string v0, "Method return type must not include a type variable or wildcard: %s"

    .line 2827
    .line 2828
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 2829
    .line 2830
    .line 2831
    move-result-object v2

    .line 2832
    invoke-static {v1, v3, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2833
    .line 2834
    .line 2835
    move-result-object v0

    .line 2836
    throw v0

    .line 2837
    :cond_80
    move v14, v5

    .line 2838
    move-object v3, v9

    .line 2839
    const-string v0, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    .line 2840
    .line 2841
    new-array v2, v14, [Ljava/lang/Object;

    .line 2842
    .line 2843
    invoke-static {v1, v3, v0, v2}, Lxe1;->V(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2844
    .line 2845
    .line 2846
    move-result-object v0

    .line 2847
    throw v0
.end method


# virtual methods
.method public abstract a(Lct1;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
