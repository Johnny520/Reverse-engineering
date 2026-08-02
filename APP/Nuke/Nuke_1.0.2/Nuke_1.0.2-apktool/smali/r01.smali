.class public final Lr01;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw41;


# static fields
.field public static final a:Lr01;

.field public static final b:Lg32;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lr01;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr01;->a:Lr01;

    .line 7
    .line 8
    new-instance v0, Lg32;

    .line 9
    .line 10
    const-string v1, "kotlin.time.Instant"

    .line 11
    .line 12
    sget-object v2, Lf32;->o:Lf32;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lg32;-><init>(Ljava/lang/String;Lf32;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lr01;->b:Lg32;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 25

    .line 1
    sget-object v0, Ln01;->j:Ln01;

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ly40;->w()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Lsz0;

    .line 17
    .line 18
    const-string v2, "An empty string is not a valid Instant"

    .line 19
    .line 20
    const/16 v3, 0x15

    .line 21
    .line 22
    invoke-direct {v1, v3, v2, v0}, Lsz0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_15

    .line 26
    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/16 v3, 0x20

    .line 33
    .line 34
    const/16 v4, 0x2b

    .line 35
    .line 36
    const/16 v5, 0x2d

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    if-eq v2, v4, :cond_1

    .line 40
    .line 41
    if-eq v2, v5, :cond_1

    .line 42
    .line 43
    move v7, v1

    .line 44
    move v2, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v7, v6

    .line 47
    :goto_0
    move v9, v1

    .line 48
    move v8, v7

    .line 49
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    const/16 v11, 0x3a

    .line 54
    .line 55
    const/16 v12, 0x30

    .line 56
    .line 57
    if-ge v8, v10, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-gt v12, v10, :cond_2

    .line 64
    .line 65
    if-ge v10, v11, :cond_2

    .line 66
    .line 67
    mul-int/lit8 v9, v9, 0xa

    .line 68
    .line 69
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    sub-int/2addr v10, v12

    .line 74
    add-int/2addr v9, v10

    .line 75
    add-int/lit8 v8, v8, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sub-int v10, v8, v7

    .line 79
    .line 80
    const-string v13, " digits"

    .line 81
    .line 82
    const/16 v14, 0xa

    .line 83
    .line 84
    if-le v10, v14, :cond_3

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v2, "Expected at most 10 digits for the year number, got "

    .line 89
    .line 90
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    goto/16 :goto_15

    .line 108
    .line 109
    :cond_3
    if-ne v10, v14, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    const/16 v15, 0x32

    .line 116
    .line 117
    if-lt v7, v15, :cond_4

    .line 118
    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v2, "Expected at most 9 digits for the year number or year 1000000000, got "

    .line 122
    .line 123
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    goto/16 :goto_15

    .line 141
    .line 142
    :cond_4
    const/4 v7, 0x4

    .line 143
    if-ge v10, v7, :cond_5

    .line 144
    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v2, "The year number must be padded to 4 digits, got "

    .line 148
    .line 149
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    goto/16 :goto_15

    .line 167
    .line 168
    :cond_5
    if-ne v2, v4, :cond_6

    .line 169
    .line 170
    if-ne v10, v7, :cond_6

    .line 171
    .line 172
    const-string v1, "The \'+\' sign at the start is only valid for year numbers longer than 4 digits"

    .line 173
    .line 174
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    goto/16 :goto_15

    .line 179
    .line 180
    :cond_6
    if-ne v2, v3, :cond_7

    .line 181
    .line 182
    if-eq v10, v7, :cond_7

    .line 183
    .line 184
    const-string v1, "A \'+\' or \'-\' sign is required for year numbers longer than 4 digits"

    .line 185
    .line 186
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    goto/16 :goto_15

    .line 191
    .line 192
    :cond_7
    if-ne v2, v5, :cond_8

    .line 193
    .line 194
    neg-int v9, v9

    .line 195
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    add-int/lit8 v3, v8, 0x10

    .line 200
    .line 201
    if-ge v2, v3, :cond_9

    .line 202
    .line 203
    const-string v1, "The input string is too short"

    .line 204
    .line 205
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    goto/16 :goto_15

    .line 210
    .line 211
    :cond_9
    new-instance v2, Lnx0;

    .line 212
    .line 213
    const/4 v10, 0x3

    .line 214
    invoke-direct {v2, v10}, Lnx0;-><init>(I)V

    .line 215
    .line 216
    .line 217
    const-string v15, "\'-\'"

    .line 218
    .line 219
    invoke-static {v0, v15, v8, v2}, Lqp0;->F(Ljava/lang/String;Ljava/lang/String;ILin0;)Lsz0;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    if-eqz v2, :cond_a

    .line 224
    .line 225
    move-object v1, v2

    .line 226
    goto/16 :goto_15

    .line 227
    .line 228
    :cond_a
    add-int/lit8 v2, v8, 0x3

    .line 229
    .line 230
    new-instance v1, Lnx0;

    .line 231
    .line 232
    invoke-direct {v1, v7}, Lnx0;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-static {v0, v15, v2, v1}, Lqp0;->F(Ljava/lang/String;Ljava/lang/String;ILin0;)Lsz0;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    if-eqz v1, :cond_b

    .line 240
    .line 241
    goto/16 :goto_15

    .line 242
    .line 243
    :cond_b
    add-int/lit8 v1, v8, 0x6

    .line 244
    .line 245
    new-instance v2, Lnx0;

    .line 246
    .line 247
    const/4 v15, 0x5

    .line 248
    invoke-direct {v2, v15}, Lnx0;-><init>(I)V

    .line 249
    .line 250
    .line 251
    const-string v15, "\'T\' or \'t\'"

    .line 252
    .line 253
    invoke-static {v0, v15, v1, v2}, Lqp0;->F(Ljava/lang/String;Ljava/lang/String;ILin0;)Lsz0;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    if-eqz v1, :cond_c

    .line 258
    .line 259
    goto/16 :goto_15

    .line 260
    .line 261
    :cond_c
    add-int/lit8 v1, v8, 0x9

    .line 262
    .line 263
    new-instance v2, Lnx0;

    .line 264
    .line 265
    const/4 v15, 0x6

    .line 266
    invoke-direct {v2, v15}, Lnx0;-><init>(I)V

    .line 267
    .line 268
    .line 269
    const-string v7, "\':\'"

    .line 270
    .line 271
    invoke-static {v0, v7, v1, v2}, Lqp0;->F(Ljava/lang/String;Ljava/lang/String;ILin0;)Lsz0;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    if-eqz v1, :cond_d

    .line 276
    .line 277
    goto/16 :goto_15

    .line 278
    .line 279
    :cond_d
    add-int/lit8 v1, v8, 0xc

    .line 280
    .line 281
    new-instance v2, Lnx0;

    .line 282
    .line 283
    const/4 v10, 0x7

    .line 284
    invoke-direct {v2, v10}, Lnx0;-><init>(I)V

    .line 285
    .line 286
    .line 287
    invoke-static {v0, v7, v1, v2}, Lqp0;->F(Ljava/lang/String;Ljava/lang/String;ILin0;)Lsz0;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    if-eqz v1, :cond_e

    .line 292
    .line 293
    goto/16 :goto_15

    .line 294
    .line 295
    :cond_e
    sget-object v1, Lqp0;->l:[I

    .line 296
    .line 297
    const/4 v2, 0x0

    .line 298
    :goto_2
    if-ge v2, v14, :cond_10

    .line 299
    .line 300
    aget v7, v1, v2

    .line 301
    .line 302
    add-int/2addr v7, v8

    .line 303
    new-instance v10, Lnx0;

    .line 304
    .line 305
    const/16 v15, 0x8

    .line 306
    .line 307
    invoke-direct {v10, v15}, Lnx0;-><init>(I)V

    .line 308
    .line 309
    .line 310
    const-string v15, "an ASCII digit"

    .line 311
    .line 312
    invoke-static {v0, v15, v7, v10}, Lqp0;->F(Ljava/lang/String;Ljava/lang/String;ILin0;)Lsz0;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    if-eqz v7, :cond_f

    .line 317
    .line 318
    move-object v1, v7

    .line 319
    goto/16 :goto_15

    .line 320
    .line 321
    :cond_f
    add-int/lit8 v2, v2, 0x1

    .line 322
    .line 323
    const/4 v15, 0x6

    .line 324
    goto :goto_2

    .line 325
    :cond_10
    add-int/lit8 v1, v8, 0x1

    .line 326
    .line 327
    invoke-static {v0, v1}, Lqp0;->H(Ljava/lang/String;I)I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    add-int/lit8 v2, v8, 0x4

    .line 332
    .line 333
    invoke-static {v0, v2}, Lqp0;->H(Ljava/lang/String;I)I

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    add-int/lit8 v7, v8, 0x7

    .line 338
    .line 339
    invoke-static {v0, v7}, Lqp0;->H(Ljava/lang/String;I)I

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    add-int/lit8 v10, v8, 0xa

    .line 344
    .line 345
    invoke-static {v0, v10}, Lqp0;->H(Ljava/lang/String;I)I

    .line 346
    .line 347
    .line 348
    move-result v10

    .line 349
    add-int/lit8 v15, v8, 0xd

    .line 350
    .line 351
    invoke-static {v0, v15}, Lqp0;->H(Ljava/lang/String;I)I

    .line 352
    .line 353
    .line 354
    move-result v15

    .line 355
    add-int/lit8 v8, v8, 0xf

    .line 356
    .line 357
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    const/16 v4, 0x2e

    .line 362
    .line 363
    const/16 v14, 0x9

    .line 364
    .line 365
    if-ne v5, v4, :cond_13

    .line 366
    .line 367
    move v8, v3

    .line 368
    const/4 v4, 0x0

    .line 369
    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-ge v8, v5, :cond_11

    .line 374
    .line 375
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    if-gt v12, v5, :cond_11

    .line 380
    .line 381
    if-ge v5, v11, :cond_11

    .line 382
    .line 383
    mul-int/lit8 v4, v4, 0xa

    .line 384
    .line 385
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    sub-int/2addr v5, v12

    .line 390
    add-int/2addr v4, v5

    .line 391
    add-int/lit8 v8, v8, 0x1

    .line 392
    .line 393
    goto :goto_3

    .line 394
    :cond_11
    sub-int v3, v8, v3

    .line 395
    .line 396
    if-gt v6, v3, :cond_12

    .line 397
    .line 398
    const/16 v5, 0xa

    .line 399
    .line 400
    if-ge v3, v5, :cond_12

    .line 401
    .line 402
    sget-object v5, Lqp0;->k:[I

    .line 403
    .line 404
    rsub-int/lit8 v3, v3, 0x9

    .line 405
    .line 406
    aget v3, v5, v3

    .line 407
    .line 408
    mul-int/2addr v4, v3

    .line 409
    goto :goto_4

    .line 410
    :cond_12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 411
    .line 412
    const-string v2, "1..9 digits are supported for the fraction of the second, got "

    .line 413
    .line 414
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    goto/16 :goto_15

    .line 432
    .line 433
    :cond_13
    const/4 v4, 0x0

    .line 434
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    if-lt v8, v3, :cond_14

    .line 439
    .line 440
    const-string v1, "The UTC offset at the end of the string is missing"

    .line 441
    .line 442
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    goto/16 :goto_15

    .line 447
    .line 448
    :cond_14
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 449
    .line 450
    .line 451
    move-result v3

    .line 452
    const/4 v5, 0x2

    .line 453
    const/16 v13, 0x27

    .line 454
    .line 455
    move/from16 v20, v6

    .line 456
    .line 457
    const-string v6, ", got \'"

    .line 458
    .line 459
    const/16 v12, 0x2b

    .line 460
    .line 461
    if-eq v3, v12, :cond_17

    .line 462
    .line 463
    const/16 v12, 0x2d

    .line 464
    .line 465
    if-eq v3, v12, :cond_17

    .line 466
    .line 467
    const/16 v11, 0x5a

    .line 468
    .line 469
    if-eq v3, v11, :cond_15

    .line 470
    .line 471
    const/16 v11, 0x7a

    .line 472
    .line 473
    if-eq v3, v11, :cond_15

    .line 474
    .line 475
    new-instance v1, Ljava/lang/StringBuilder;

    .line 476
    .line 477
    const-string v2, "Expected the UTC offset at position "

    .line 478
    .line 479
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    goto/16 :goto_15

    .line 503
    .line 504
    :cond_15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    add-int/lit8 v8, v8, 0x1

    .line 509
    .line 510
    if-ne v3, v8, :cond_16

    .line 511
    .line 512
    const/4 v6, 0x0

    .line 513
    :goto_5
    move/from16 v3, v20

    .line 514
    .line 515
    goto/16 :goto_f

    .line 516
    .line 517
    :cond_16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    const-string v2, "Extra text after the instant at position "

    .line 520
    .line 521
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    goto/16 :goto_15

    .line 536
    .line 537
    :cond_17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 538
    .line 539
    .line 540
    move-result v12

    .line 541
    sub-int/2addr v12, v8

    .line 542
    if-le v12, v14, :cond_18

    .line 543
    .line 544
    new-instance v1, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    const-string v2, "The UTC offset string \""

    .line 547
    .line 548
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    const/16 v3, 0x10

    .line 564
    .line 565
    invoke-static {v2, v3}, Lqp0;->W(Ljava/lang/String;I)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    const-string v2, "\" is too long"

    .line 573
    .line 574
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    goto/16 :goto_15

    .line 586
    .line 587
    :cond_18
    rem-int/lit8 v19, v12, 0x3

    .line 588
    .line 589
    if-eqz v19, :cond_19

    .line 590
    .line 591
    new-instance v1, Ljava/lang/StringBuilder;

    .line 592
    .line 593
    const-string v2, "Invalid UTC offset string \""

    .line 594
    .line 595
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    const/16 v2, 0x22

    .line 614
    .line 615
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    goto/16 :goto_15

    .line 627
    .line 628
    :cond_19
    sget-object v19, Lqp0;->m:[I

    .line 629
    .line 630
    const/4 v14, 0x0

    .line 631
    :goto_6
    if-ge v14, v5, :cond_1c

    .line 632
    .line 633
    aget v23, v19, v14

    .line 634
    .line 635
    add-int v5, v8, v23

    .line 636
    .line 637
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 638
    .line 639
    .line 640
    move-result v13

    .line 641
    if-lt v5, v13, :cond_1a

    .line 642
    .line 643
    goto :goto_7

    .line 644
    :cond_1a
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 645
    .line 646
    .line 647
    move-result v13

    .line 648
    if-eq v13, v11, :cond_1b

    .line 649
    .line 650
    const-string v1, "Expected \':\' at index "

    .line 651
    .line 652
    invoke-static {v5, v1, v6}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    const/16 v2, 0x27

    .line 664
    .line 665
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    goto/16 :goto_15

    .line 677
    .line 678
    :cond_1b
    add-int/lit8 v14, v14, 0x1

    .line 679
    .line 680
    const/4 v5, 0x2

    .line 681
    const/16 v13, 0x27

    .line 682
    .line 683
    goto :goto_6

    .line 684
    :cond_1c
    :goto_7
    sget-object v5, Lqp0;->n:[I

    .line 685
    .line 686
    const/4 v13, 0x0

    .line 687
    :goto_8
    const/4 v14, 0x6

    .line 688
    if-ge v13, v14, :cond_1f

    .line 689
    .line 690
    aget v14, v5, v13

    .line 691
    .line 692
    add-int/2addr v14, v8

    .line 693
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 694
    .line 695
    .line 696
    move-result v11

    .line 697
    if-lt v14, v11, :cond_1d

    .line 698
    .line 699
    goto :goto_9

    .line 700
    :cond_1d
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 701
    .line 702
    .line 703
    move-result v11

    .line 704
    move-object/from16 v24, v5

    .line 705
    .line 706
    const/16 v5, 0x30

    .line 707
    .line 708
    if-gt v5, v11, :cond_1e

    .line 709
    .line 710
    const/16 v5, 0x3a

    .line 711
    .line 712
    if-ge v11, v5, :cond_1e

    .line 713
    .line 714
    add-int/lit8 v13, v13, 0x1

    .line 715
    .line 716
    move v11, v5

    .line 717
    move-object/from16 v5, v24

    .line 718
    .line 719
    goto :goto_8

    .line 720
    :cond_1e
    const-string v1, "Expected an ASCII digit at index "

    .line 721
    .line 722
    invoke-static {v14, v1, v6}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 727
    .line 728
    .line 729
    move-result v2

    .line 730
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    const/16 v2, 0x27

    .line 734
    .line 735
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    goto/16 :goto_15

    .line 747
    .line 748
    :cond_1f
    :goto_9
    add-int/lit8 v5, v8, 0x1

    .line 749
    .line 750
    invoke-static {v0, v5}, Lqp0;->H(Ljava/lang/String;I)I

    .line 751
    .line 752
    .line 753
    move-result v5

    .line 754
    const/4 v6, 0x3

    .line 755
    if-le v12, v6, :cond_20

    .line 756
    .line 757
    add-int/lit8 v6, v8, 0x4

    .line 758
    .line 759
    invoke-static {v0, v6}, Lqp0;->H(Ljava/lang/String;I)I

    .line 760
    .line 761
    .line 762
    move-result v6

    .line 763
    :goto_a
    const/4 v14, 0x6

    .line 764
    goto :goto_b

    .line 765
    :cond_20
    const/4 v6, 0x0

    .line 766
    goto :goto_a

    .line 767
    :goto_b
    if-le v12, v14, :cond_21

    .line 768
    .line 769
    add-int/lit8 v11, v8, 0x7

    .line 770
    .line 771
    invoke-static {v0, v11}, Lqp0;->H(Ljava/lang/String;I)I

    .line 772
    .line 773
    .line 774
    move-result v11

    .line 775
    :goto_c
    const/16 v12, 0x3b

    .line 776
    .line 777
    goto :goto_d

    .line 778
    :cond_21
    const/4 v11, 0x0

    .line 779
    goto :goto_c

    .line 780
    :goto_d
    if-le v6, v12, :cond_22

    .line 781
    .line 782
    new-instance v1, Ljava/lang/StringBuilder;

    .line 783
    .line 784
    const-string v2, "Expected offset-minute-of-hour in 0..59, got "

    .line 785
    .line 786
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    goto/16 :goto_15

    .line 801
    .line 802
    :cond_22
    if-le v11, v12, :cond_23

    .line 803
    .line 804
    new-instance v1, Ljava/lang/StringBuilder;

    .line 805
    .line 806
    const-string v2, "Expected offset-second-of-minute in 0..59, got "

    .line 807
    .line 808
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    goto/16 :goto_15

    .line 823
    .line 824
    :cond_23
    const/16 v12, 0x11

    .line 825
    .line 826
    if-le v5, v12, :cond_25

    .line 827
    .line 828
    const/16 v12, 0x12

    .line 829
    .line 830
    if-ne v5, v12, :cond_24

    .line 831
    .line 832
    if-nez v6, :cond_24

    .line 833
    .line 834
    if-eqz v11, :cond_25

    .line 835
    .line 836
    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 837
    .line 838
    const-string v2, "Expected an offset in -18:00..+18:00, got "

    .line 839
    .line 840
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 844
    .line 845
    .line 846
    move-result v2

    .line 847
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    goto/16 :goto_15

    .line 867
    .line 868
    :cond_25
    mul-int/lit16 v5, v5, 0xe10

    .line 869
    .line 870
    mul-int/lit8 v6, v6, 0x3c

    .line 871
    .line 872
    add-int/2addr v6, v5

    .line 873
    add-int/2addr v6, v11

    .line 874
    const/16 v12, 0x2d

    .line 875
    .line 876
    if-ne v3, v12, :cond_26

    .line 877
    .line 878
    const/4 v3, -0x1

    .line 879
    goto :goto_e

    .line 880
    :cond_26
    move/from16 v3, v20

    .line 881
    .line 882
    :goto_e
    mul-int/2addr v6, v3

    .line 883
    goto/16 :goto_5

    .line 884
    .line 885
    :goto_f
    if-gt v3, v1, :cond_34

    .line 886
    .line 887
    const/16 v5, 0xd

    .line 888
    .line 889
    if-ge v1, v5, :cond_34

    .line 890
    .line 891
    if-gt v3, v2, :cond_33

    .line 892
    .line 893
    and-int/lit8 v3, v9, 0x3

    .line 894
    .line 895
    if-nez v3, :cond_28

    .line 896
    .line 897
    rem-int/lit8 v5, v9, 0x64

    .line 898
    .line 899
    if-nez v5, :cond_27

    .line 900
    .line 901
    rem-int/lit16 v5, v9, 0x190

    .line 902
    .line 903
    if-nez v5, :cond_28

    .line 904
    .line 905
    :cond_27
    const/4 v5, 0x1

    .line 906
    :goto_10
    const/4 v8, 0x2

    .line 907
    goto :goto_11

    .line 908
    :cond_28
    const/4 v5, 0x0

    .line 909
    goto :goto_10

    .line 910
    :goto_11
    if-eq v1, v8, :cond_2a

    .line 911
    .line 912
    const/4 v8, 0x4

    .line 913
    if-eq v1, v8, :cond_29

    .line 914
    .line 915
    const/4 v14, 0x6

    .line 916
    if-eq v1, v14, :cond_29

    .line 917
    .line 918
    const/16 v5, 0x9

    .line 919
    .line 920
    if-eq v1, v5, :cond_29

    .line 921
    .line 922
    const/16 v5, 0xb

    .line 923
    .line 924
    if-eq v1, v5, :cond_29

    .line 925
    .line 926
    const/16 v5, 0x1f

    .line 927
    .line 928
    goto :goto_12

    .line 929
    :cond_29
    const/16 v5, 0x1e

    .line 930
    .line 931
    goto :goto_12

    .line 932
    :cond_2a
    if-eqz v5, :cond_2b

    .line 933
    .line 934
    const/16 v5, 0x1d

    .line 935
    .line 936
    goto :goto_12

    .line 937
    :cond_2b
    const/16 v5, 0x1c

    .line 938
    .line 939
    :goto_12
    if-gt v2, v5, :cond_33

    .line 940
    .line 941
    const/16 v5, 0x17

    .line 942
    .line 943
    if-le v7, v5, :cond_2c

    .line 944
    .line 945
    new-instance v1, Ljava/lang/StringBuilder;

    .line 946
    .line 947
    const-string v2, "Expected hour in 0..23, got "

    .line 948
    .line 949
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v1

    .line 959
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    goto/16 :goto_15

    .line 964
    .line 965
    :cond_2c
    const/16 v12, 0x3b

    .line 966
    .line 967
    if-le v10, v12, :cond_2d

    .line 968
    .line 969
    new-instance v1, Ljava/lang/StringBuilder;

    .line 970
    .line 971
    const-string v2, "Expected minute-of-hour in 0..59, got "

    .line 972
    .line 973
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 977
    .line 978
    .line 979
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    goto/16 :goto_15

    .line 988
    .line 989
    :cond_2d
    if-le v15, v12, :cond_2e

    .line 990
    .line 991
    new-instance v1, Ljava/lang/StringBuilder;

    .line 992
    .line 993
    const-string v2, "Expected second-of-minute in 0..59, got "

    .line 994
    .line 995
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    goto/16 :goto_15

    .line 1010
    .line 1011
    :cond_2e
    int-to-long v11, v9

    .line 1012
    const-wide/16 v13, 0x16d

    .line 1013
    .line 1014
    mul-long/2addr v13, v11

    .line 1015
    const-wide/16 v16, 0x0

    .line 1016
    .line 1017
    cmp-long v0, v11, v16

    .line 1018
    .line 1019
    if-ltz v0, :cond_2f

    .line 1020
    .line 1021
    const-wide/16 v16, 0x3

    .line 1022
    .line 1023
    add-long v16, v11, v16

    .line 1024
    .line 1025
    const-wide/16 v18, 0x4

    .line 1026
    .line 1027
    div-long v16, v16, v18

    .line 1028
    .line 1029
    const-wide/16 v18, 0x63

    .line 1030
    .line 1031
    add-long v18, v11, v18

    .line 1032
    .line 1033
    const-wide/16 v21, 0x64

    .line 1034
    .line 1035
    div-long v18, v18, v21

    .line 1036
    .line 1037
    sub-long v16, v16, v18

    .line 1038
    .line 1039
    const-wide/16 v18, 0x18f

    .line 1040
    .line 1041
    add-long v11, v11, v18

    .line 1042
    .line 1043
    const-wide/16 v18, 0x190

    .line 1044
    .line 1045
    div-long v11, v11, v18

    .line 1046
    .line 1047
    add-long v11, v11, v16

    .line 1048
    .line 1049
    add-long/2addr v11, v13

    .line 1050
    goto :goto_13

    .line 1051
    :cond_2f
    const-wide/16 v16, -0x4

    .line 1052
    .line 1053
    div-long v16, v11, v16

    .line 1054
    .line 1055
    const-wide/16 v18, -0x64

    .line 1056
    .line 1057
    div-long v18, v11, v18

    .line 1058
    .line 1059
    sub-long v16, v16, v18

    .line 1060
    .line 1061
    const-wide/16 v18, -0x190

    .line 1062
    .line 1063
    div-long v11, v11, v18

    .line 1064
    .line 1065
    add-long v11, v11, v16

    .line 1066
    .line 1067
    sub-long v11, v13, v11

    .line 1068
    .line 1069
    :goto_13
    mul-int/lit16 v0, v1, 0x16f

    .line 1070
    .line 1071
    add-int/lit16 v0, v0, -0x16a

    .line 1072
    .line 1073
    div-int/lit8 v0, v0, 0xc

    .line 1074
    .line 1075
    int-to-long v13, v0

    .line 1076
    add-long/2addr v11, v13

    .line 1077
    const/16 v20, 0x1

    .line 1078
    .line 1079
    add-int/lit8 v2, v2, -0x1

    .line 1080
    .line 1081
    int-to-long v13, v2

    .line 1082
    add-long/2addr v11, v13

    .line 1083
    const/4 v8, 0x2

    .line 1084
    if-le v1, v8, :cond_32

    .line 1085
    .line 1086
    const-wide/16 v0, -0x1

    .line 1087
    .line 1088
    add-long/2addr v0, v11

    .line 1089
    if-nez v3, :cond_31

    .line 1090
    .line 1091
    rem-int/lit8 v2, v9, 0x64

    .line 1092
    .line 1093
    if-nez v2, :cond_30

    .line 1094
    .line 1095
    rem-int/lit16 v9, v9, 0x190

    .line 1096
    .line 1097
    if-nez v9, :cond_31

    .line 1098
    .line 1099
    :cond_30
    move-wide v11, v0

    .line 1100
    goto :goto_14

    .line 1101
    :cond_31
    const-wide/16 v0, -0x2

    .line 1102
    .line 1103
    add-long/2addr v11, v0

    .line 1104
    :cond_32
    :goto_14
    const-wide/32 v0, 0xafaa8

    .line 1105
    .line 1106
    .line 1107
    sub-long/2addr v11, v0

    .line 1108
    mul-int/lit16 v7, v7, 0xe10

    .line 1109
    .line 1110
    mul-int/lit8 v10, v10, 0x3c

    .line 1111
    .line 1112
    add-int/2addr v10, v7

    .line 1113
    add-int/2addr v10, v15

    .line 1114
    const-wide/32 v0, 0x15180

    .line 1115
    .line 1116
    .line 1117
    mul-long/2addr v11, v0

    .line 1118
    int-to-long v0, v10

    .line 1119
    add-long/2addr v11, v0

    .line 1120
    int-to-long v0, v6

    .line 1121
    sub-long/2addr v11, v0

    .line 1122
    new-instance v1, Lp01;

    .line 1123
    .line 1124
    invoke-direct {v1, v11, v12, v4}, Lp01;-><init>(JI)V

    .line 1125
    .line 1126
    .line 1127
    goto :goto_15

    .line 1128
    :cond_33
    const-string v3, " of year "

    .line 1129
    .line 1130
    const-string v4, ", got "

    .line 1131
    .line 1132
    const-string v5, "Expected a valid day-of-month for month "

    .line 1133
    .line 1134
    invoke-static {v5, v1, v9, v3, v4}, Lhk1;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v1

    .line 1138
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v1

    .line 1145
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v1

    .line 1149
    goto :goto_15

    .line 1150
    :cond_34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1151
    .line 1152
    const-string v3, "Expected a month number in 1..12, got "

    .line 1153
    .line 1154
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v1

    .line 1164
    invoke-static {v0, v1}, Lqp0;->G(Ljava/lang/String;Ljava/lang/String;)Lsz0;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v1

    .line 1168
    :goto_15
    invoke-interface {v1}, Lq01;->toInstant()Ln01;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    return-object v0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ln01;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ln01;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p1, p0}, Lve0;->p(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lr01;->b:Lg32;

    .line 2
    .line 3
    return-object p0
.end method
