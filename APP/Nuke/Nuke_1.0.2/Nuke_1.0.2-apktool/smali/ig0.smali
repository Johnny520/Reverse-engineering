.class public abstract Lig0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    const-string v0, "*"

    .line 2
    .line 3
    const-string v1, "{"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lig0;->a:Ljava/util/Set;

    .line 14
    .line 15
    const-string v16, "^"

    .line 16
    .line 17
    const-string v17, "~"

    .line 18
    .line 19
    const-string v1, "("

    .line 20
    .line 21
    const-string v2, "["

    .line 22
    .line 23
    const-string v3, "{"

    .line 24
    .line 25
    const-string v4, "="

    .line 26
    .line 27
    const-string v5, ":"

    .line 28
    .line 29
    const-string v6, ","

    .line 30
    .line 31
    const-string v7, ";"

    .line 32
    .line 33
    const-string v8, "!"

    .line 34
    .line 35
    const-string v9, "?"

    .line 36
    .line 37
    const-string v10, "+"

    .line 38
    .line 39
    const-string v11, "-"

    .line 40
    .line 41
    const-string v12, "*"

    .line 42
    .line 43
    const-string v13, "%"

    .line 44
    .line 45
    const-string v14, "&"

    .line 46
    .line 47
    const-string v15, "|"

    .line 48
    .line 49
    filled-new-array/range {v1 .. v17}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lig0;->b:Ljava/util/Set;

    .line 58
    .line 59
    const-string v10, "yield"

    .line 60
    .line 61
    const-string v11, "await"

    .line 62
    .line 63
    const-string v1, "return"

    .line 64
    .line 65
    const-string v2, "throw"

    .line 66
    .line 67
    const-string v3, "case"

    .line 68
    .line 69
    const-string v4, "delete"

    .line 70
    .line 71
    const-string v5, "void"

    .line 72
    .line 73
    const-string v6, "typeof"

    .line 74
    .line 75
    const-string v7, "instanceof"

    .line 76
    .line 77
    const-string v8, "in"

    .line 78
    .line 79
    const-string v9, "of"

    .line 80
    .line 81
    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lig0;->c:Ljava/util/Set;

    .line 90
    .line 91
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/util/List;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v4, 0x1

    .line 13
    if-ge v2, v3, :cond_2c

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-static {v3}, Lxe1;->Q(C)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_1

    .line 24
    .line 25
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v5, 0x0

    .line 29
    const/16 v6, 0xa

    .line 30
    .line 31
    const/16 v7, 0x2f

    .line 32
    .line 33
    if-ne v3, v7, :cond_4

    .line 34
    .line 35
    add-int/lit8 v8, v2, 0x1

    .line 36
    .line 37
    if-ltz v8, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-ge v8, v9, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move-object v8, v5

    .line 55
    :goto_2
    if-nez v8, :cond_3

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_3
    invoke-virtual {v8}, Ljava/lang/Character;->charValue()C

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-ne v8, v7, :cond_4

    .line 63
    .line 64
    add-int/lit8 v2, v2, 0x2

    .line 65
    .line 66
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-ge v2, v3, :cond_0

    .line 71
    .line 72
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eq v3, v6, :cond_0

    .line 77
    .line 78
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_4
    if-ne v3, v7, :cond_9

    .line 82
    .line 83
    add-int/lit8 v8, v2, 0x1

    .line 84
    .line 85
    if-ltz v8, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    if-ge v8, v9, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    goto :goto_5

    .line 102
    :cond_5
    move-object v8, v5

    .line 103
    :goto_5
    if-nez v8, :cond_6

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_6
    invoke-virtual {v8}, Ljava/lang/Character;->charValue()C

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    const/16 v9, 0x2a

    .line 111
    .line 112
    if-ne v8, v9, :cond_9

    .line 113
    .line 114
    add-int/lit8 v2, v2, 0x2

    .line 115
    .line 116
    :goto_6
    add-int/lit8 v3, v2, 0x1

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-ge v3, v4, :cond_8

    .line 123
    .line 124
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-ne v4, v9, :cond_7

    .line 129
    .line 130
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eq v4, v7, :cond_8

    .line 135
    .line 136
    :cond_7
    move v2, v3

    .line 137
    goto :goto_6

    .line 138
    :cond_8
    add-int/lit8 v2, v2, 0x2

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-le v2, v3, :cond_0

    .line 145
    .line 146
    goto/16 :goto_15

    .line 147
    .line 148
    :cond_9
    :goto_7
    if-ne v3, v7, :cond_12

    .line 149
    .line 150
    invoke-static {v0}, Ldu;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    check-cast v8, Lhg0;

    .line 155
    .line 156
    if-nez v8, :cond_a

    .line 157
    .line 158
    move v5, v4

    .line 159
    goto :goto_8

    .line 160
    :cond_a
    instance-of v9, v8, Lgg0;

    .line 161
    .line 162
    if-eqz v9, :cond_b

    .line 163
    .line 164
    check-cast v8, Lgg0;

    .line 165
    .line 166
    iget-object v5, v8, Lgg0;->a:Ljava/lang/String;

    .line 167
    .line 168
    sget-object v8, Lig0;->b:Ljava/util/Set;

    .line 169
    .line 170
    invoke-interface {v8, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    goto :goto_8

    .line 175
    :cond_b
    instance-of v9, v8, Leg0;

    .line 176
    .line 177
    if-eqz v9, :cond_c

    .line 178
    .line 179
    check-cast v8, Leg0;

    .line 180
    .line 181
    iget-object v5, v8, Leg0;->a:Ljava/lang/String;

    .line 182
    .line 183
    sget-object v8, Lig0;->c:Ljava/util/Set;

    .line 184
    .line 185
    invoke-interface {v8, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    goto :goto_8

    .line 190
    :cond_c
    instance-of v8, v8, Lfg0;

    .line 191
    .line 192
    if-eqz v8, :cond_11

    .line 193
    .line 194
    move v5, v1

    .line 195
    :goto_8
    if-eqz v5, :cond_12

    .line 196
    .line 197
    add-int/lit8 v2, v2, 0x1

    .line 198
    .line 199
    move v3, v1

    .line 200
    :cond_d
    :goto_9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-ge v2, v5, :cond_0

    .line 205
    .line 206
    add-int/lit8 v5, v2, 0x1

    .line 207
    .line 208
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eq v6, v7, :cond_f

    .line 213
    .line 214
    packed-switch v6, :pswitch_data_0

    .line 215
    .line 216
    .line 217
    goto :goto_a

    .line 218
    :pswitch_0
    move v3, v1

    .line 219
    :cond_e
    :goto_a
    move v2, v5

    .line 220
    goto :goto_9

    .line 221
    :pswitch_1
    add-int/lit8 v2, v2, 0x2

    .line 222
    .line 223
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-le v2, v5, :cond_d

    .line 228
    .line 229
    goto :goto_a

    .line 230
    :pswitch_2
    move v3, v4

    .line 231
    goto :goto_a

    .line 232
    :cond_f
    if-nez v3, :cond_e

    .line 233
    .line 234
    :goto_b
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-ge v5, v2, :cond_10

    .line 239
    .line 240
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_10

    .line 249
    .line 250
    add-int/lit8 v5, v5, 0x1

    .line 251
    .line 252
    goto :goto_b

    .line 253
    :cond_10
    move v2, v5

    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_11
    invoke-static {}, Lc80;->s()V

    .line 257
    .line 258
    .line 259
    return-object v5

    .line 260
    :cond_12
    const/16 v5, 0x27

    .line 261
    .line 262
    const/16 v7, 0x5c

    .line 263
    .line 264
    if-eq v3, v5, :cond_20

    .line 265
    .line 266
    const/16 v5, 0x22

    .line 267
    .line 268
    if-ne v3, v5, :cond_13

    .line 269
    .line 270
    goto/16 :goto_16

    .line 271
    .line 272
    :cond_13
    const/16 v5, 0x60

    .line 273
    .line 274
    if-ne v3, v5, :cond_16

    .line 275
    .line 276
    add-int/lit8 v2, v2, 0x1

    .line 277
    .line 278
    :cond_14
    :goto_c
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    if-ge v2, v3, :cond_0

    .line 283
    .line 284
    add-int/lit8 v3, v2, 0x1

    .line 285
    .line 286
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-eq v4, v7, :cond_15

    .line 291
    .line 292
    if-eq v4, v5, :cond_1e

    .line 293
    .line 294
    :goto_d
    move v2, v3

    .line 295
    goto :goto_c

    .line 296
    :cond_15
    add-int/lit8 v2, v2, 0x2

    .line 297
    .line 298
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    if-le v2, v3, :cond_14

    .line 303
    .line 304
    goto :goto_d

    .line 305
    :cond_16
    const/16 v5, 0x24

    .line 306
    .line 307
    const/16 v6, 0x5f

    .line 308
    .line 309
    if-eq v3, v6, :cond_18

    .line 310
    .line 311
    if-eq v3, v5, :cond_18

    .line 312
    .line 313
    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    if-eqz v7, :cond_17

    .line 318
    .line 319
    goto :goto_e

    .line 320
    :cond_17
    move v7, v1

    .line 321
    goto :goto_f

    .line 322
    :cond_18
    :goto_e
    move v7, v4

    .line 323
    :goto_f
    if-eqz v7, :cond_1f

    .line 324
    .line 325
    add-int/lit8 v3, v2, 0x1

    .line 326
    .line 327
    :goto_10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    if-ge v3, v7, :cond_1d

    .line 332
    .line 333
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    if-eq v7, v6, :cond_1a

    .line 338
    .line 339
    if-eq v7, v5, :cond_1a

    .line 340
    .line 341
    invoke-static {v7}, Ljava/lang/Character;->isLetter(C)Z

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    if-eqz v8, :cond_19

    .line 346
    .line 347
    goto :goto_11

    .line 348
    :cond_19
    move v8, v1

    .line 349
    goto :goto_12

    .line 350
    :cond_1a
    :goto_11
    move v8, v4

    .line 351
    :goto_12
    if-nez v8, :cond_1c

    .line 352
    .line 353
    invoke-static {v7}, Ljava/lang/Character;->isDigit(C)Z

    .line 354
    .line 355
    .line 356
    move-result v7

    .line 357
    if-eqz v7, :cond_1b

    .line 358
    .line 359
    goto :goto_13

    .line 360
    :cond_1b
    move v7, v1

    .line 361
    goto :goto_14

    .line 362
    :cond_1c
    :goto_13
    move v7, v4

    .line 363
    :goto_14
    if-eqz v7, :cond_1d

    .line 364
    .line 365
    add-int/lit8 v3, v3, 0x1

    .line 366
    .line 367
    goto :goto_10

    .line 368
    :cond_1d
    new-instance v4, Leg0;

    .line 369
    .line 370
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-direct {v4, v2}, Leg0;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    :cond_1e
    :goto_15
    move v2, v3

    .line 381
    goto/16 :goto_0

    .line 382
    .line 383
    :cond_1f
    new-instance v4, Lgg0;

    .line 384
    .line 385
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    invoke-direct {v4, v3}, Lgg0;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    :cond_20
    :goto_16
    new-instance v4, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    add-int/lit8 v2, v2, 0x1

    .line 403
    .line 404
    :cond_21
    :goto_17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-ge v2, v5, :cond_2b

    .line 409
    .line 410
    add-int/lit8 v5, v2, 0x1

    .line 411
    .line 412
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 413
    .line 414
    .line 415
    move-result v8

    .line 416
    if-ne v8, v3, :cond_22

    .line 417
    .line 418
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    new-instance v4, Low1;

    .line 427
    .line 428
    invoke-direct {v4, v2, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    goto/16 :goto_18

    .line 432
    .line 433
    :cond_22
    if-eq v8, v7, :cond_23

    .line 434
    .line 435
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    move v2, v5

    .line 439
    goto :goto_17

    .line 440
    :cond_23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 441
    .line 442
    .line 443
    move-result v8

    .line 444
    if-ge v5, v8, :cond_2a

    .line 445
    .line 446
    add-int/lit8 v2, v2, 0x2

    .line 447
    .line 448
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    if-eq v5, v6, :cond_21

    .line 453
    .line 454
    const/16 v8, 0xd

    .line 455
    .line 456
    if-eq v5, v8, :cond_21

    .line 457
    .line 458
    const/16 v9, 0x62

    .line 459
    .line 460
    if-eq v5, v9, :cond_29

    .line 461
    .line 462
    const/16 v9, 0x66

    .line 463
    .line 464
    if-eq v5, v9, :cond_28

    .line 465
    .line 466
    const/16 v9, 0x6e

    .line 467
    .line 468
    if-eq v5, v9, :cond_27

    .line 469
    .line 470
    const/16 v9, 0x72

    .line 471
    .line 472
    if-eq v5, v9, :cond_26

    .line 473
    .line 474
    const/16 v8, 0x74

    .line 475
    .line 476
    if-eq v5, v8, :cond_25

    .line 477
    .line 478
    const/16 v8, 0x76

    .line 479
    .line 480
    if-eq v5, v8, :cond_24

    .line 481
    .line 482
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    goto :goto_17

    .line 486
    :cond_24
    const/16 v5, 0xb

    .line 487
    .line 488
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    goto :goto_17

    .line 492
    :cond_25
    const/16 v5, 0x9

    .line 493
    .line 494
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    goto :goto_17

    .line 498
    :cond_26
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    goto :goto_17

    .line 502
    :cond_27
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    goto :goto_17

    .line 506
    :cond_28
    const/16 v5, 0xc

    .line 507
    .line 508
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    goto :goto_17

    .line 512
    :cond_29
    const/16 v5, 0x8

    .line 513
    .line 514
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    goto :goto_17

    .line 518
    :cond_2a
    move v2, v5

    .line 519
    :cond_2b
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    new-instance v4, Low1;

    .line 528
    .line 529
    invoke-direct {v4, v3, v2}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    :goto_18
    iget-object v2, v4, Low1;->h:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v2, Ljava/lang/String;

    .line 535
    .line 536
    iget-object v3, v4, Low1;->i:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v3, Ljava/lang/Number;

    .line 539
    .line 540
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    new-instance v4, Lfg0;

    .line 545
    .line 546
    invoke-direct {v4, v2}, Lfg0;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    goto/16 :goto_15

    .line 553
    .line 554
    :cond_2c
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 555
    .line 556
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 557
    .line 558
    .line 559
    move v2, v1

    .line 560
    :goto_19
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    if-ge v2, v3, :cond_45

    .line 565
    .line 566
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    check-cast v3, Lhg0;

    .line 571
    .line 572
    instance-of v5, v3, Leg0;

    .line 573
    .line 574
    if-eqz v5, :cond_44

    .line 575
    .line 576
    check-cast v3, Leg0;

    .line 577
    .line 578
    iget-object v3, v3, Leg0;->a:Ljava/lang/String;

    .line 579
    .line 580
    const-string v5, "import"

    .line 581
    .line 582
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v5

    .line 586
    const-string v6, "."

    .line 587
    .line 588
    const-string v7, "from"

    .line 589
    .line 590
    const-string v8, ";"

    .line 591
    .line 592
    if-eqz v5, :cond_36

    .line 593
    .line 594
    add-int/lit8 v3, v2, -0x1

    .line 595
    .line 596
    invoke-static {v3, v0}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    check-cast v3, Lhg0;

    .line 601
    .line 602
    instance-of v5, v3, Lgg0;

    .line 603
    .line 604
    if-eqz v5, :cond_2d

    .line 605
    .line 606
    check-cast v3, Lgg0;

    .line 607
    .line 608
    iget-object v3, v3, Lgg0;->a:Ljava/lang/String;

    .line 609
    .line 610
    invoke-static {v3, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v3

    .line 614
    if-eqz v3, :cond_2d

    .line 615
    .line 616
    move v3, v4

    .line 617
    goto :goto_1a

    .line 618
    :cond_2d
    move v3, v1

    .line 619
    :goto_1a
    if-eqz v3, :cond_2e

    .line 620
    .line 621
    goto/16 :goto_21

    .line 622
    .line 623
    :cond_2e
    add-int/lit8 v3, v2, 0x1

    .line 624
    .line 625
    invoke-static {v3, v0}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v5

    .line 629
    check-cast v5, Lhg0;

    .line 630
    .line 631
    if-nez v5, :cond_2f

    .line 632
    .line 633
    goto/16 :goto_1d

    .line 634
    .line 635
    :cond_2f
    instance-of v9, v5, Lfg0;

    .line 636
    .line 637
    if-eqz v9, :cond_30

    .line 638
    .line 639
    check-cast v5, Lfg0;

    .line 640
    .line 641
    iget-object v3, v5, Lfg0;->a:Ljava/lang/String;

    .line 642
    .line 643
    invoke-interface {p0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    :goto_1b
    add-int/lit8 v3, v2, 0x2

    .line 647
    .line 648
    goto/16 :goto_1d

    .line 649
    .line 650
    :cond_30
    instance-of v9, v5, Lgg0;

    .line 651
    .line 652
    if-eqz v9, :cond_32

    .line 653
    .line 654
    check-cast v5, Lgg0;

    .line 655
    .line 656
    iget-object v5, v5, Lgg0;->a:Ljava/lang/String;

    .line 657
    .line 658
    invoke-static {v5, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v6

    .line 662
    if-eqz v6, :cond_31

    .line 663
    .line 664
    goto :goto_1b

    .line 665
    :cond_31
    const-string v6, "("

    .line 666
    .line 667
    invoke-static {v5, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    if-eqz v5, :cond_32

    .line 672
    .line 673
    add-int/lit8 v3, v2, 0x2

    .line 674
    .line 675
    invoke-static {v3, v0}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    check-cast v2, Lhg0;

    .line 680
    .line 681
    instance-of v5, v2, Lfg0;

    .line 682
    .line 683
    if-eqz v5, :cond_35

    .line 684
    .line 685
    check-cast v2, Lfg0;

    .line 686
    .line 687
    iget-object v2, v2, Lfg0;->a:Ljava/lang/String;

    .line 688
    .line 689
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    goto :goto_1d

    .line 693
    :cond_32
    :goto_1c
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 694
    .line 695
    .line 696
    move-result v2

    .line 697
    if-ge v3, v2, :cond_35

    .line 698
    .line 699
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    check-cast v2, Lhg0;

    .line 704
    .line 705
    instance-of v5, v2, Lgg0;

    .line 706
    .line 707
    if-eqz v5, :cond_33

    .line 708
    .line 709
    move-object v5, v2

    .line 710
    check-cast v5, Lgg0;

    .line 711
    .line 712
    iget-object v5, v5, Lgg0;->a:Ljava/lang/String;

    .line 713
    .line 714
    invoke-static {v5, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    if-eqz v5, :cond_33

    .line 719
    .line 720
    add-int/lit8 v3, v3, 0x1

    .line 721
    .line 722
    goto :goto_1d

    .line 723
    :cond_33
    instance-of v5, v2, Leg0;

    .line 724
    .line 725
    if-eqz v5, :cond_34

    .line 726
    .line 727
    check-cast v2, Leg0;

    .line 728
    .line 729
    iget-object v2, v2, Leg0;->a:Ljava/lang/String;

    .line 730
    .line 731
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    if-eqz v2, :cond_34

    .line 736
    .line 737
    add-int/lit8 v2, v3, 0x1

    .line 738
    .line 739
    invoke-static {v2, v0}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    check-cast v2, Lhg0;

    .line 744
    .line 745
    instance-of v5, v2, Lfg0;

    .line 746
    .line 747
    if-eqz v5, :cond_34

    .line 748
    .line 749
    check-cast v2, Lfg0;

    .line 750
    .line 751
    iget-object v2, v2, Lfg0;->a:Ljava/lang/String;

    .line 752
    .line 753
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    add-int/lit8 v3, v3, 0x2

    .line 757
    .line 758
    goto :goto_1d

    .line 759
    :cond_34
    add-int/lit8 v3, v3, 0x1

    .line 760
    .line 761
    goto :goto_1c

    .line 762
    :cond_35
    :goto_1d
    move v2, v3

    .line 763
    goto/16 :goto_19

    .line 764
    .line 765
    :cond_36
    const-string v5, "export"

    .line 766
    .line 767
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    move-result v3

    .line 771
    if-eqz v3, :cond_44

    .line 772
    .line 773
    add-int/lit8 v3, v2, -0x1

    .line 774
    .line 775
    invoke-static {v3, v0}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    check-cast v3, Lhg0;

    .line 780
    .line 781
    instance-of v5, v3, Lgg0;

    .line 782
    .line 783
    if-eqz v5, :cond_37

    .line 784
    .line 785
    check-cast v3, Lgg0;

    .line 786
    .line 787
    iget-object v3, v3, Lgg0;->a:Ljava/lang/String;

    .line 788
    .line 789
    invoke-static {v3, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    move-result v3

    .line 793
    if-eqz v3, :cond_37

    .line 794
    .line 795
    move v3, v4

    .line 796
    goto :goto_1e

    .line 797
    :cond_37
    move v3, v1

    .line 798
    :goto_1e
    if-eqz v3, :cond_38

    .line 799
    .line 800
    goto/16 :goto_21

    .line 801
    .line 802
    :cond_38
    add-int/lit8 v3, v2, 0x1

    .line 803
    .line 804
    invoke-static {v3, v0}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v5

    .line 808
    check-cast v5, Lhg0;

    .line 809
    .line 810
    if-nez v5, :cond_39

    .line 811
    .line 812
    goto :goto_1d

    .line 813
    :cond_39
    instance-of v6, v5, Lgg0;

    .line 814
    .line 815
    if-eqz v6, :cond_35

    .line 816
    .line 817
    check-cast v5, Lgg0;

    .line 818
    .line 819
    iget-object v5, v5, Lgg0;->a:Ljava/lang/String;

    .line 820
    .line 821
    sget-object v6, Lig0;->a:Ljava/util/Set;

    .line 822
    .line 823
    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result v6

    .line 827
    if-nez v6, :cond_3a

    .line 828
    .line 829
    goto :goto_1d

    .line 830
    :cond_3a
    add-int/lit8 v2, v2, 0x2

    .line 831
    .line 832
    const-string v3, "{"

    .line 833
    .line 834
    invoke-static {v5, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 835
    .line 836
    .line 837
    move-result v5

    .line 838
    :goto_1f
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 839
    .line 840
    .line 841
    move-result v6

    .line 842
    if-ge v2, v6, :cond_43

    .line 843
    .line 844
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v6

    .line 848
    check-cast v6, Lhg0;

    .line 849
    .line 850
    instance-of v9, v6, Lgg0;

    .line 851
    .line 852
    if-eqz v9, :cond_41

    .line 853
    .line 854
    move-object v9, v6

    .line 855
    check-cast v9, Lgg0;

    .line 856
    .line 857
    iget-object v9, v9, Lgg0;->a:Ljava/lang/String;

    .line 858
    .line 859
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 860
    .line 861
    .line 862
    move-result v10

    .line 863
    const/16 v11, 0x3b

    .line 864
    .line 865
    if-eq v10, v11, :cond_3f

    .line 866
    .line 867
    const/16 v11, 0x7b

    .line 868
    .line 869
    if-eq v10, v11, :cond_3d

    .line 870
    .line 871
    const/16 v11, 0x7d

    .line 872
    .line 873
    if-eq v10, v11, :cond_3b

    .line 874
    .line 875
    goto :goto_20

    .line 876
    :cond_3b
    const-string v10, "}"

    .line 877
    .line 878
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v9

    .line 882
    if-nez v9, :cond_3c

    .line 883
    .line 884
    goto :goto_20

    .line 885
    :cond_3c
    add-int/lit8 v5, v5, -0x1

    .line 886
    .line 887
    goto :goto_20

    .line 888
    :cond_3d
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 889
    .line 890
    .line 891
    move-result v9

    .line 892
    if-nez v9, :cond_3e

    .line 893
    .line 894
    goto :goto_20

    .line 895
    :cond_3e
    add-int/lit8 v5, v5, 0x1

    .line 896
    .line 897
    goto :goto_20

    .line 898
    :cond_3f
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 899
    .line 900
    .line 901
    move-result v9

    .line 902
    if-nez v9, :cond_40

    .line 903
    .line 904
    goto :goto_20

    .line 905
    :cond_40
    add-int/lit8 v3, v2, 0x1

    .line 906
    .line 907
    goto/16 :goto_1d

    .line 908
    .line 909
    :cond_41
    :goto_20
    if-gtz v5, :cond_42

    .line 910
    .line 911
    instance-of v9, v6, Leg0;

    .line 912
    .line 913
    if-eqz v9, :cond_42

    .line 914
    .line 915
    check-cast v6, Leg0;

    .line 916
    .line 917
    iget-object v6, v6, Leg0;->a:Ljava/lang/String;

    .line 918
    .line 919
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    move-result v6

    .line 923
    if-eqz v6, :cond_42

    .line 924
    .line 925
    add-int/lit8 v6, v2, 0x1

    .line 926
    .line 927
    invoke-static {v6, v0}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v6

    .line 931
    check-cast v6, Lhg0;

    .line 932
    .line 933
    instance-of v9, v6, Lfg0;

    .line 934
    .line 935
    if-eqz v9, :cond_42

    .line 936
    .line 937
    check-cast v6, Lfg0;

    .line 938
    .line 939
    iget-object v3, v6, Lfg0;->a:Ljava/lang/String;

    .line 940
    .line 941
    invoke-interface {p0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    goto/16 :goto_1b

    .line 945
    .line 946
    :cond_42
    add-int/lit8 v2, v2, 0x1

    .line 947
    .line 948
    goto :goto_1f

    .line 949
    :cond_43
    move v3, v2

    .line 950
    goto/16 :goto_1d

    .line 951
    .line 952
    :cond_44
    :goto_21
    add-int/lit8 v2, v2, 0x1

    .line 953
    .line 954
    goto/16 :goto_19

    .line 955
    .line 956
    :cond_45
    invoke-static {p0}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 957
    .line 958
    .line 959
    move-result-object p0

    .line 960
    return-object p0

    .line 961
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
