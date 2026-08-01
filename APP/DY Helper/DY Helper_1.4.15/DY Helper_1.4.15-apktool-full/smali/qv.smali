.class public final Lqv;
.super Ldo1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public η:Lvh1;

.field public θ:I

.field public ι:I

.field public synthetic κ:Ljava/lang/Object;

.field public final synthetic λ:Lqm1;

.field public final synthetic μ:Lum1;

.field public final synthetic ν:Lum1;


# direct methods
.method public constructor <init>(Lqm1;Lum1;Lum1;Lop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqv;->λ:Lqm1;

    .line 2
    .line 3
    iput-object p2, p0, Lqv;->μ:Lum1;

    .line 4
    .line 5
    iput-object p3, p0, Lqv;->ν:Lum1;

    .line 6
    .line 7
    invoke-direct {p0, p4}, Ldo1;-><init>(Lop;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ld22;

    .line 2
    .line 3
    check-cast p2, Lop;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lqv;->η(Lop;Ljava/lang/Object;)Lop;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lqv;

    .line 10
    .line 11
    sget-object p1, Ls62;->α:Ls62;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lqv;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 3

    .line 1
    new-instance v0, Lqv;

    .line 2
    .line 3
    iget-object v1, p0, Lqv;->μ:Lum1;

    .line 4
    .line 5
    iget-object v2, p0, Lqv;->ν:Lum1;

    .line 6
    .line 7
    iget-object p0, p0, Lqv;->λ:Lqm1;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p1}, Lqv;-><init>(Lqm1;Lum1;Lum1;Lop;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, v0, Lqv;->κ:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lqv;->ι:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    sget-object v6, Lcq;->ε:Lcq;

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v5, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    iget v1, v0, Lqv;->θ:I

    .line 17
    .line 18
    iget-object v7, v0, Lqv;->η:Lvh1;

    .line 19
    .line 20
    iget-object v8, v0, Lqv;->κ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v8, Ld22;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v2, p1

    .line 28
    .line 29
    move v4, v5

    .line 30
    move-object v5, v6

    .line 31
    goto/16 :goto_e

    .line 32
    .line 33
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    return-object v0

    .line 40
    :cond_1
    iget v1, v0, Lqv;->θ:I

    .line 41
    .line 42
    iget-object v7, v0, Lqv;->κ:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v7, Ld22;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object/from16 v8, p1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, v0, Lqv;->κ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ld22;

    .line 58
    .line 59
    move-object v7, v1

    .line 60
    const/4 v1, 0x0

    .line 61
    :goto_0
    if-nez v1, :cond_18

    .line 62
    .line 63
    iput-object v7, v0, Lqv;->κ:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v2, v0, Lqv;->η:Lvh1;

    .line 66
    .line 67
    iput v1, v0, Lqv;->θ:I

    .line 68
    .line 69
    iput v5, v0, Lqv;->ι:I

    .line 70
    .line 71
    sget-object v8, Lwh1;->ζ:Lwh1;

    .line 72
    .line 73
    invoke-virtual {v7, v8, v0}, Ld22;->δ(Lwh1;Lq8;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    if-ne v8, v6, :cond_3

    .line 78
    .line 79
    move-object v5, v6

    .line 80
    goto/16 :goto_d

    .line 81
    .line 82
    :cond_3
    :goto_1
    check-cast v8, Lvh1;

    .line 83
    .line 84
    iget-object v9, v8, Lvh1;->α:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    const/4 v11, 0x0

    .line 91
    :goto_2
    if-ge v11, v10, :cond_5

    .line 92
    .line 93
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    check-cast v12, Lai1;

    .line 98
    .line 99
    invoke-static {v12}, Lj81;->θ(Lai1;)Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-nez v12, :cond_4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    add-int/lit8 v11, v11, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    move v1, v5

    .line 110
    :goto_3
    iget-object v9, v8, Lvh1;->α:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    const/4 v11, 0x0

    .line 117
    :goto_4
    if-ge v11, v10, :cond_d

    .line 118
    .line 119
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    check-cast v12, Lai1;

    .line 124
    .line 125
    invoke-virtual {v12}, Lai1;->β()Z

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    if-nez v13, :cond_c

    .line 130
    .line 131
    iget-object v13, v7, Ld22;->κ:Le22;

    .line 132
    .line 133
    iget-wide v14, v13, Le22;->Δ:J

    .line 134
    .line 135
    invoke-static {v13}, Lh62;->ц(Lur;)Lyp0;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    iget-object v2, v2, Lyp0;->Ε:Lg92;

    .line 140
    .line 141
    invoke-interface {v2}, Lg92;->β()J

    .line 142
    .line 143
    .line 144
    move-result-wide v3

    .line 145
    invoke-interface {v13, v3, v4}, Lyr;->Ψ(J)J

    .line 146
    .line 147
    .line 148
    move-result-wide v2

    .line 149
    move-object/from16 v16, v6

    .line 150
    .line 151
    iget-wide v5, v13, Le22;->Δ:J

    .line 152
    .line 153
    const/16 v13, 0x20

    .line 154
    .line 155
    move-wide/from16 v17, v5

    .line 156
    .line 157
    shr-long v4, v2, v13

    .line 158
    .line 159
    long-to-int v4, v4

    .line 160
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    shr-long v5, v17, v13

    .line 165
    .line 166
    long-to-int v5, v5

    .line 167
    int-to-float v5, v5

    .line 168
    sub-float/2addr v4, v5

    .line 169
    const/4 v5, 0x0

    .line 170
    invoke-static {v5, v4}, Ljava/lang/Math;->max(FF)F

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    const/high16 v6, 0x40000000    # 2.0f

    .line 175
    .line 176
    div-float/2addr v4, v6

    .line 177
    const-wide v19, 0xffffffffL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    and-long v2, v2, v19

    .line 183
    .line 184
    long-to-int v2, v2

    .line 185
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    move v3, v13

    .line 190
    move-wide/from16 v21, v14

    .line 191
    .line 192
    and-long v13, v17, v19

    .line 193
    .line 194
    long-to-int v13, v13

    .line 195
    int-to-float v13, v13

    .line 196
    sub-float/2addr v2, v13

    .line 197
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    div-float/2addr v2, v6

    .line 202
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    int-to-long v4, v4

    .line 207
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    int-to-long v13, v2

    .line 212
    shl-long/2addr v4, v3

    .line 213
    and-long v13, v13, v19

    .line 214
    .line 215
    or-long v5, v4, v13

    .line 216
    .line 217
    iget v2, v12, Lai1;->ι:I

    .line 218
    .line 219
    const/4 v4, 0x1

    .line 220
    if-ne v2, v4, :cond_6

    .line 221
    .line 222
    const/4 v2, 0x1

    .line 223
    goto :goto_5

    .line 224
    :cond_6
    const/4 v2, 0x0

    .line 225
    :goto_5
    iget-wide v12, v12, Lai1;->γ:J

    .line 226
    .line 227
    shr-long v14, v12, v3

    .line 228
    .line 229
    long-to-int v14, v14

    .line 230
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 231
    .line 232
    .line 233
    move-result v14

    .line 234
    and-long v12, v12, v19

    .line 235
    .line 236
    long-to-int v12, v12

    .line 237
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 238
    .line 239
    .line 240
    move-result v12

    .line 241
    move/from16 p1, v3

    .line 242
    .line 243
    shr-long v3, v5, p1

    .line 244
    .line 245
    long-to-int v3, v3

    .line 246
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    int-to-float v2, v2

    .line 251
    mul-float/2addr v3, v2

    .line 252
    move v4, v14

    .line 253
    shr-long v13, v21, p1

    .line 254
    .line 255
    long-to-int v13, v13

    .line 256
    int-to-float v13, v13

    .line 257
    add-float/2addr v13, v3

    .line 258
    and-long v5, v5, v19

    .line 259
    .line 260
    long-to-int v5, v5

    .line 261
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    mul-float/2addr v5, v2

    .line 266
    move/from16 p1, v1

    .line 267
    .line 268
    and-long v1, v21, v19

    .line 269
    .line 270
    long-to-int v1, v1

    .line 271
    int-to-float v1, v1

    .line 272
    add-float/2addr v1, v5

    .line 273
    neg-float v2, v3

    .line 274
    cmpg-float v2, v4, v2

    .line 275
    .line 276
    if-gez v2, :cond_7

    .line 277
    .line 278
    const/4 v2, 0x1

    .line 279
    goto :goto_6

    .line 280
    :cond_7
    const/4 v2, 0x0

    .line 281
    :goto_6
    cmpl-float v3, v4, v13

    .line 282
    .line 283
    if-lez v3, :cond_8

    .line 284
    .line 285
    const/4 v3, 0x1

    .line 286
    goto :goto_7

    .line 287
    :cond_8
    const/4 v3, 0x0

    .line 288
    :goto_7
    or-int/2addr v2, v3

    .line 289
    neg-float v3, v5

    .line 290
    cmpg-float v3, v12, v3

    .line 291
    .line 292
    if-gez v3, :cond_9

    .line 293
    .line 294
    const/4 v3, 0x1

    .line 295
    goto :goto_8

    .line 296
    :cond_9
    const/4 v3, 0x0

    .line 297
    :goto_8
    or-int/2addr v2, v3

    .line 298
    cmpl-float v1, v12, v1

    .line 299
    .line 300
    if-lez v1, :cond_a

    .line 301
    .line 302
    const/4 v1, 0x1

    .line 303
    goto :goto_9

    .line 304
    :cond_a
    const/4 v1, 0x0

    .line 305
    :goto_9
    or-int/2addr v1, v2

    .line 306
    if-eqz v1, :cond_b

    .line 307
    .line 308
    goto :goto_a

    .line 309
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 310
    .line 311
    move/from16 v1, p1

    .line 312
    .line 313
    move-object/from16 v6, v16

    .line 314
    .line 315
    const/4 v2, 0x0

    .line 316
    const/4 v3, 0x2

    .line 317
    const/4 v5, 0x1

    .line 318
    goto/16 :goto_4

    .line 319
    .line 320
    :cond_c
    move-object/from16 v16, v6

    .line 321
    .line 322
    :goto_a
    const/4 v1, 0x1

    .line 323
    goto :goto_b

    .line 324
    :cond_d
    move/from16 p1, v1

    .line 325
    .line 326
    move-object/from16 v16, v6

    .line 327
    .line 328
    :goto_b
    iget v2, v8, Lvh1;->γ:I

    .line 329
    .line 330
    const/4 v3, 0x2

    .line 331
    if-ne v2, v3, :cond_e

    .line 332
    .line 333
    iget-object v1, v0, Lqv;->λ:Lqm1;

    .line 334
    .line 335
    const/4 v4, 0x1

    .line 336
    iput-boolean v4, v1, Lqm1;->ε:Z

    .line 337
    .line 338
    move v1, v4

    .line 339
    goto :goto_c

    .line 340
    :cond_e
    const/4 v4, 0x1

    .line 341
    :goto_c
    iput-object v7, v0, Lqv;->κ:Ljava/lang/Object;

    .line 342
    .line 343
    iput-object v8, v0, Lqv;->η:Lvh1;

    .line 344
    .line 345
    iput v1, v0, Lqv;->θ:I

    .line 346
    .line 347
    iput v3, v0, Lqv;->ι:I

    .line 348
    .line 349
    sget-object v2, Lwh1;->η:Lwh1;

    .line 350
    .line 351
    invoke-virtual {v7, v2, v0}, Ld22;->δ(Lwh1;Lq8;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    move-object/from16 v5, v16

    .line 356
    .line 357
    if-ne v2, v5, :cond_f

    .line 358
    .line 359
    :goto_d
    return-object v5

    .line 360
    :cond_f
    move-object/from16 v23, v8

    .line 361
    .line 362
    move-object v8, v7

    .line 363
    move-object/from16 v7, v23

    .line 364
    .line 365
    :goto_e
    check-cast v2, Lvh1;

    .line 366
    .line 367
    iget-object v2, v2, Lvh1;->α:Ljava/lang/Object;

    .line 368
    .line 369
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    const/4 v9, 0x0

    .line 374
    :goto_f
    if-ge v9, v6, :cond_11

    .line 375
    .line 376
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v10

    .line 380
    check-cast v10, Lai1;

    .line 381
    .line 382
    invoke-virtual {v10}, Lai1;->β()Z

    .line 383
    .line 384
    .line 385
    move-result v10

    .line 386
    if-eqz v10, :cond_10

    .line 387
    .line 388
    move v1, v4

    .line 389
    goto :goto_10

    .line 390
    :cond_10
    add-int/lit8 v9, v9, 0x1

    .line 391
    .line 392
    goto :goto_f

    .line 393
    :cond_11
    :goto_10
    iget-object v2, v0, Lqv;->μ:Lum1;

    .line 394
    .line 395
    iget-object v6, v2, Lum1;->ε:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v6, Lai1;

    .line 398
    .line 399
    iget-wide v9, v6, Lai1;->α:J

    .line 400
    .line 401
    invoke-static {v7, v9, v10}, Lsv;->δ(Lvh1;J)Z

    .line 402
    .line 403
    .line 404
    move-result v6

    .line 405
    iget-object v7, v7, Lvh1;->α:Ljava/lang/Object;

    .line 406
    .line 407
    iget-object v9, v0, Lqv;->ν:Lum1;

    .line 408
    .line 409
    if-eqz v6, :cond_15

    .line 410
    .line 411
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 412
    .line 413
    .line 414
    move-result v6

    .line 415
    const/4 v10, 0x0

    .line 416
    :goto_11
    if-ge v10, v6, :cond_13

    .line 417
    .line 418
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v11

    .line 422
    move-object v12, v11

    .line 423
    check-cast v12, Lai1;

    .line 424
    .line 425
    iget-boolean v12, v12, Lai1;->δ:Z

    .line 426
    .line 427
    if-eqz v12, :cond_12

    .line 428
    .line 429
    goto :goto_12

    .line 430
    :cond_12
    add-int/lit8 v10, v10, 0x1

    .line 431
    .line 432
    goto :goto_11

    .line 433
    :cond_13
    const/4 v11, 0x0

    .line 434
    :goto_12
    check-cast v11, Lai1;

    .line 435
    .line 436
    if-eqz v11, :cond_14

    .line 437
    .line 438
    iput-object v11, v2, Lum1;->ε:Ljava/lang/Object;

    .line 439
    .line 440
    iput-object v11, v9, Lum1;->ε:Ljava/lang/Object;

    .line 441
    .line 442
    goto :goto_15

    .line 443
    :cond_14
    move v1, v4

    .line 444
    move-object v6, v5

    .line 445
    move-object v7, v8

    .line 446
    const/4 v2, 0x0

    .line 447
    move v5, v1

    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :cond_15
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 451
    .line 452
    .line 453
    move-result v6

    .line 454
    const/4 v10, 0x0

    .line 455
    :goto_13
    if-ge v10, v6, :cond_17

    .line 456
    .line 457
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v11

    .line 461
    move-object v12, v11

    .line 462
    check-cast v12, Lai1;

    .line 463
    .line 464
    iget-wide v12, v12, Lai1;->α:J

    .line 465
    .line 466
    iget-object v14, v2, Lum1;->ε:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v14, Lai1;

    .line 469
    .line 470
    iget-wide v14, v14, Lai1;->α:J

    .line 471
    .line 472
    invoke-static {v12, v13, v14, v15}, Lu81;->δ(JJ)Z

    .line 473
    .line 474
    .line 475
    move-result v12

    .line 476
    if-eqz v12, :cond_16

    .line 477
    .line 478
    goto :goto_14

    .line 479
    :cond_16
    add-int/lit8 v10, v10, 0x1

    .line 480
    .line 481
    goto :goto_13

    .line 482
    :cond_17
    const/4 v11, 0x0

    .line 483
    :goto_14
    iput-object v11, v9, Lum1;->ε:Ljava/lang/Object;

    .line 484
    .line 485
    :goto_15
    move-object v6, v5

    .line 486
    move-object v7, v8

    .line 487
    const/4 v2, 0x0

    .line 488
    move v5, v4

    .line 489
    goto/16 :goto_0

    .line 490
    .line 491
    :cond_18
    sget-object v0, Ls62;->α:Ls62;

    .line 492
    .line 493
    return-object v0
.end method
