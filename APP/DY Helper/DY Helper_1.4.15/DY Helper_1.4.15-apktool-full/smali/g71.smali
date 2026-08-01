.class public final synthetic Lg71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 11
    iput p2, p0, Lg71;->ε:I

    iput-object p1, p0, Lg71;->ζ:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>([Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0

    .line 1
    const/16 p1, 0x17

    .line 2
    .line 3
    iput p1, p0, Lg71;->ε:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lg71;->ζ:Landroid/app/Activity;

    .line 9
    .line 10
    return-void
.end method

.method private final β(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    check-cast v1, La80;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "info_bar_text_format"

    .line 9
    .line 10
    const-string v2, "{time}     {location}"

    .line 11
    .line 12
    invoke-static {v0, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    new-instance v10, Lum1;

    .line 17
    .line 18
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    move v2, v0

    .line 23
    :goto_0
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/16 v4, 0x7d

    .line 28
    .line 29
    const/16 v5, 0x7b

    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    const-string v7, "createTime:"

    .line 33
    .line 34
    const-string v9, "time:"

    .line 35
    .line 36
    const-string v11, "yyyy-MM-dd HH:mm"

    .line 37
    .line 38
    const/4 v12, 0x0

    .line 39
    if-ge v2, v3, :cond_3

    .line 40
    .line 41
    invoke-static {v8, v5, v2, v6}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-ltz v2, :cond_3

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    invoke-static {v8, v4, v2, v6}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ltz v3, :cond_3

    .line 54
    .line 55
    invoke-virtual {v8, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v2, v9, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    if-nez v13, :cond_1

    .line 64
    .line 65
    invoke-static {v2, v7, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    if-eqz v13, :cond_0

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    add-int/lit8 v2, v3, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    :goto_1
    const/16 v3, 0x3a

    .line 76
    .line 77
    invoke-static {v2, v3, v2}, Lq02;->ф(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    move-object v2, v12

    .line 89
    :goto_2
    if-nez v2, :cond_4

    .line 90
    .line 91
    :cond_3
    move-object v2, v11

    .line 92
    :cond_4
    iput-object v2, v10, Lum1;->ε:Ljava/lang/Object;

    .line 93
    .line 94
    new-instance v14, Lum1;

    .line 95
    .line 96
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    new-instance v2, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 106
    .line 107
    .line 108
    move v3, v0

    .line 109
    :goto_3
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    const-string v15, "{time}"

    .line 114
    .line 115
    if-ge v3, v13, :cond_9

    .line 116
    .line 117
    invoke-static {v8, v5, v3, v6}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    if-gez v13, :cond_5

    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    invoke-virtual {v2, v8, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_5
    invoke-virtual {v2, v8, v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    add-int/lit8 v3, v13, 0x1

    .line 135
    .line 136
    invoke-static {v8, v4, v3, v6}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-gez v5, :cond_6

    .line 141
    .line 142
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    invoke-virtual {v2, v8, v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_6
    invoke-virtual {v8, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    const-string v4, "time"

    .line 155
    .line 156
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-nez v4, :cond_8

    .line 161
    .line 162
    const-string v4, "createTime"

    .line 163
    .line 164
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-nez v4, :cond_8

    .line 169
    .line 170
    invoke-static {v3, v9, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-nez v4, :cond_8

    .line 175
    .line 176
    invoke-static {v3, v7, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_7

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_7
    add-int/lit8 v3, v5, 0x1

    .line 184
    .line 185
    invoke-virtual {v2, v8, v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_8
    :goto_4
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    :goto_5
    add-int/lit8 v3, v5, 0x1

    .line 193
    .line 194
    const/16 v4, 0x7d

    .line 195
    .line 196
    const/16 v5, 0x7b

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_9
    :goto_6
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const-string v3, "{loc}"

    .line 204
    .line 205
    const-string v4, "{location}"

    .line 206
    .line 207
    invoke-static {v2, v3, v4}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    const-string v5, "{awemeId}"

    .line 212
    .line 213
    const-string v7, "{id}"

    .line 214
    .line 215
    invoke-static {v2, v5, v7}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    const/4 v9, 0x6

    .line 220
    invoke-static {v2, v15, v0, v0, v9}, Lq02;->д(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v15

    .line 228
    if-ltz v13, :cond_a

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_a
    move-object v15, v12

    .line 232
    :goto_7
    if-eqz v15, :cond_11

    .line 233
    .line 234
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v13

    .line 238
    add-int/2addr v13, v9

    .line 239
    invoke-static {v2, v4, v13, v0, v6}, Lq02;->д(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v15

    .line 247
    if-ltz v9, :cond_b

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_b
    move-object v15, v12

    .line 251
    :goto_8
    const v9, 0x7fffffff

    .line 252
    .line 253
    .line 254
    if-eqz v15, :cond_c

    .line 255
    .line 256
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 257
    .line 258
    .line 259
    move-result v15

    .line 260
    goto :goto_9

    .line 261
    :cond_c
    move v15, v9

    .line 262
    :goto_9
    invoke-static {v2, v7, v13, v0, v6}, Lq02;->д(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 263
    .line 264
    .line 265
    move-result v16

    .line 266
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v17

    .line 270
    if-ltz v16, :cond_d

    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_d
    move-object/from16 v17, v12

    .line 274
    .line 275
    :goto_a
    if-eqz v17, :cond_e

    .line 276
    .line 277
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    .line 278
    .line 279
    .line 280
    move-result v16

    .line 281
    move/from16 v6, v16

    .line 282
    .line 283
    goto :goto_b

    .line 284
    :cond_e
    move v6, v9

    .line 285
    :goto_b
    invoke-static {v15, v6}, Ljava/lang/Math;->min(II)I

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eq v6, v9, :cond_11

    .line 290
    .line 291
    if-gt v6, v13, :cond_f

    .line 292
    .line 293
    goto :goto_d

    .line 294
    :cond_f
    invoke-virtual {v2, v13, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    if-lez v6, :cond_10

    .line 303
    .line 304
    goto :goto_c

    .line 305
    :cond_10
    move-object v2, v12

    .line 306
    :goto_c
    if-nez v2, :cond_12

    .line 307
    .line 308
    :cond_11
    :goto_d
    const-string v2, "     "

    .line 309
    .line 310
    :cond_12
    iput-object v2, v14, Lum1;->ε:Ljava/lang/Object;

    .line 311
    .line 312
    new-instance v15, Lqm1;

    .line 313
    .line 314
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 315
    .line 316
    .line 317
    invoke-static {v8, v4, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-nez v2, :cond_14

    .line 322
    .line 323
    invoke-static {v8, v3, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_13

    .line 328
    .line 329
    goto :goto_e

    .line 330
    :cond_13
    move v2, v0

    .line 331
    goto :goto_f

    .line 332
    :cond_14
    :goto_e
    const/4 v2, 0x1

    .line 333
    :goto_f
    iput-boolean v2, v15, Lqm1;->ε:Z

    .line 334
    .line 335
    new-instance v6, Lqm1;

    .line 336
    .line 337
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-static {v8, v7, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    if-nez v2, :cond_16

    .line 345
    .line 346
    invoke-static {v8, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    if-eqz v2, :cond_15

    .line 351
    .line 352
    goto :goto_10

    .line 353
    :cond_15
    move v2, v0

    .line 354
    goto :goto_11

    .line 355
    :cond_16
    :goto_10
    const/4 v2, 0x1

    .line 356
    :goto_11
    iput-boolean v2, v6, Lqm1;->ε:Z

    .line 357
    .line 358
    sget-object v2, Lx01;->α:Lx01;

    .line 359
    .line 360
    move-object/from16 v3, p0

    .line 361
    .line 362
    iget-object v3, v3, Lg71;->ζ:Landroid/app/Activity;

    .line 363
    .line 364
    invoke-virtual {v2, v3}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    const v5, 0x7f0c002d

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v5, v12, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    invoke-static {v3}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    iget-object v7, v5, Lxx;->Α:Ljava/lang/String;

    .line 383
    .line 384
    iget-object v9, v5, Lxx;->ζ:Ljava/lang/String;

    .line 385
    .line 386
    iget-object v12, v5, Lxx;->γ:Ljava/lang/String;

    .line 387
    .line 388
    const v13, 0x7f0901f9

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 392
    .line 393
    .line 394
    move-result-object v13

    .line 395
    check-cast v13, Landroid/widget/ScrollView;

    .line 396
    .line 397
    const/4 v4, 0x2

    .line 398
    if-eqz v13, :cond_17

    .line 399
    .line 400
    invoke-virtual {v13, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 401
    .line 402
    .line 403
    const/4 v0, 0x1

    .line 404
    invoke-virtual {v13, v0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v13, v4}, Landroid/view/View;->setOverScrollMode(I)V

    .line 408
    .line 409
    .line 410
    :cond_17
    const v0, 0x7f0901f8

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    if-eqz v0, :cond_18

    .line 418
    .line 419
    iget-object v13, v5, Lxx;->β:Ljava/lang/String;

    .line 420
    .line 421
    const/16 v4, 0xe

    .line 422
    .line 423
    invoke-static {v4, v3, v13}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 428
    .line 429
    .line 430
    :cond_18
    const v0, 0x7f090198

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    const/16 v4, 0xc

    .line 438
    .line 439
    if-eqz v0, :cond_19

    .line 440
    .line 441
    invoke-static {v4, v3, v12}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 442
    .line 443
    .line 444
    move-result-object v13

    .line 445
    invoke-virtual {v0, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 446
    .line 447
    .line 448
    :cond_19
    const v0, 0x7f09018e

    .line 449
    .line 450
    .line 451
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    const v13, 0x7f09018c

    .line 456
    .line 457
    .line 458
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 459
    .line 460
    .line 461
    move-result-object v13

    .line 462
    const v17, 0x7f09018d

    .line 463
    .line 464
    .line 465
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    filled-new-array {v0, v13, v4}, [Ljava/lang/Integer;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    if-eqz v4, :cond_1b

    .line 486
    .line 487
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    check-cast v4, Ljava/lang/Number;

    .line 492
    .line 493
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    move-object/from16 v17, v0

    .line 502
    .line 503
    const/16 v13, 0xc

    .line 504
    .line 505
    if-eqz v4, :cond_1a

    .line 506
    .line 507
    invoke-static {v13, v3, v12}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 512
    .line 513
    .line 514
    :cond_1a
    move-object/from16 v0, v17

    .line 515
    .line 516
    goto :goto_12

    .line 517
    :cond_1b
    const v0, 0x7f090199

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    check-cast v0, Landroid/widget/TextView;

    .line 525
    .line 526
    const/16 v4, 0x63

    .line 527
    .line 528
    if-eqz v0, :cond_1c

    .line 529
    .line 530
    iget-object v13, v5, Lxx;->ι:Ljava/lang/String;

    .line 531
    .line 532
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 533
    .line 534
    .line 535
    move-result v13

    .line 536
    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 537
    .line 538
    .line 539
    iget-object v13, v5, Lxx;->κ:Ljava/lang/String;

    .line 540
    .line 541
    invoke-static {v4, v3, v13}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 542
    .line 543
    .line 544
    move-result-object v13

    .line 545
    invoke-virtual {v0, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 546
    .line 547
    .line 548
    :cond_1c
    const v0, 0x7f0901a9

    .line 549
    .line 550
    .line 551
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 552
    .line 553
    .line 554
    move-result-object v21

    .line 555
    const v0, 0x7f0901a4

    .line 556
    .line 557
    .line 558
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 559
    .line 560
    .line 561
    move-result-object v22

    .line 562
    const v0, 0x7f09019c

    .line 563
    .line 564
    .line 565
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 566
    .line 567
    .line 568
    move-result-object v23

    .line 569
    const v0, 0x7f09019d

    .line 570
    .line 571
    .line 572
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 573
    .line 574
    .line 575
    move-result-object v24

    .line 576
    const v0, 0x7f0901a6

    .line 577
    .line 578
    .line 579
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 580
    .line 581
    .line 582
    move-result-object v25

    .line 583
    const v0, 0x7f0901a2

    .line 584
    .line 585
    .line 586
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 587
    .line 588
    .line 589
    move-result-object v26

    .line 590
    const v0, 0x7f0901a0

    .line 591
    .line 592
    .line 593
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 594
    .line 595
    .line 596
    move-result-object v27

    .line 597
    filled-new-array/range {v21 .. v27}, [Ljava/lang/Integer;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 610
    .line 611
    .line 612
    move-result v13

    .line 613
    if-eqz v13, :cond_1e

    .line 614
    .line 615
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v13

    .line 619
    check-cast v13, Ljava/lang/Number;

    .line 620
    .line 621
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 622
    .line 623
    .line 624
    move-result v13

    .line 625
    invoke-virtual {v2, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 626
    .line 627
    .line 628
    move-result-object v13

    .line 629
    check-cast v13, Landroid/widget/TextView;

    .line 630
    .line 631
    if-eqz v13, :cond_1d

    .line 632
    .line 633
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 634
    .line 635
    .line 636
    move-result v4

    .line 637
    invoke-virtual {v13, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 638
    .line 639
    .line 640
    :cond_1d
    const/16 v4, 0x63

    .line 641
    .line 642
    goto :goto_13

    .line 643
    :cond_1e
    const v0, 0x7f09019a

    .line 644
    .line 645
    .line 646
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 647
    .line 648
    .line 649
    move-result-object v21

    .line 650
    const v4, 0x7f0901a8

    .line 651
    .line 652
    .line 653
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 654
    .line 655
    .line 656
    move-result-object v22

    .line 657
    const v13, 0x7f09019b

    .line 658
    .line 659
    .line 660
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 661
    .line 662
    .line 663
    move-result-object v23

    .line 664
    const v13, 0x7f0901a5

    .line 665
    .line 666
    .line 667
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 668
    .line 669
    .line 670
    move-result-object v24

    .line 671
    const v13, 0x7f0901a1

    .line 672
    .line 673
    .line 674
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 675
    .line 676
    .line 677
    move-result-object v25

    .line 678
    const v13, 0x7f09019f

    .line 679
    .line 680
    .line 681
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 682
    .line 683
    .line 684
    move-result-object v26

    .line 685
    filled-new-array/range {v21 .. v26}, [Ljava/lang/Integer;

    .line 686
    .line 687
    .line 688
    move-result-object v13

    .line 689
    invoke-static {v13}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 690
    .line 691
    .line 692
    move-result-object v13

    .line 693
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 694
    .line 695
    .line 696
    move-result-object v13

    .line 697
    :goto_14
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 698
    .line 699
    .line 700
    move-result v18

    .line 701
    if-eqz v18, :cond_20

    .line 702
    .line 703
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v18

    .line 707
    check-cast v18, Ljava/lang/Number;

    .line 708
    .line 709
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 710
    .line 711
    .line 712
    move-result v4

    .line 713
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 714
    .line 715
    .line 716
    move-result-object v4

    .line 717
    check-cast v4, Landroid/widget/TextView;

    .line 718
    .line 719
    if-eqz v4, :cond_1f

    .line 720
    .line 721
    iget-object v0, v5, Lxx;->η:Ljava/lang/String;

    .line 722
    .line 723
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 728
    .line 729
    .line 730
    :cond_1f
    const v0, 0x7f09019a

    .line 731
    .line 732
    .line 733
    const v4, 0x7f0901a8

    .line 734
    .line 735
    .line 736
    goto :goto_14

    .line 737
    :cond_20
    const v0, 0x7f0901a3

    .line 738
    .line 739
    .line 740
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 741
    .line 742
    .line 743
    move-result-object v4

    .line 744
    const v21, 0x7f0901a7

    .line 745
    .line 746
    .line 747
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 748
    .line 749
    .line 750
    move-result-object v13

    .line 751
    filled-new-array {v4, v13}, [Ljava/lang/Integer;

    .line 752
    .line 753
    .line 754
    move-result-object v4

    .line 755
    invoke-static {v4}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 756
    .line 757
    .line 758
    move-result-object v4

    .line 759
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 760
    .line 761
    .line 762
    move-result-object v4

    .line 763
    :goto_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 764
    .line 765
    .line 766
    move-result v13

    .line 767
    if-eqz v13, :cond_22

    .line 768
    .line 769
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v13

    .line 773
    check-cast v13, Ljava/lang/Number;

    .line 774
    .line 775
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 776
    .line 777
    .line 778
    move-result v13

    .line 779
    invoke-virtual {v2, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 780
    .line 781
    .line 782
    move-result-object v13

    .line 783
    check-cast v13, Landroid/widget/TextView;

    .line 784
    .line 785
    if-eqz v13, :cond_21

    .line 786
    .line 787
    iget-object v0, v5, Lxx;->λ:Ljava/lang/String;

    .line 788
    .line 789
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 790
    .line 791
    .line 792
    move-result v0

    .line 793
    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 794
    .line 795
    .line 796
    :cond_21
    const v0, 0x7f0901a3

    .line 797
    .line 798
    .line 799
    goto :goto_15

    .line 800
    :cond_22
    const v0, 0x7f09019e

    .line 801
    .line 802
    .line 803
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    check-cast v0, Landroid/widget/TextView;

    .line 808
    .line 809
    if-eqz v0, :cond_23

    .line 810
    .line 811
    iget-object v4, v5, Lxx;->Β:Ljava/lang/String;

    .line 812
    .line 813
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 814
    .line 815
    .line 816
    move-result v4

    .line 817
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 818
    .line 819
    .line 820
    :cond_23
    const v0, 0x7f090190

    .line 821
    .line 822
    .line 823
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    const v4, 0x7f090191

    .line 828
    .line 829
    .line 830
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 831
    .line 832
    .line 833
    move-result-object v4

    .line 834
    filled-new-array {v0, v4}, [Ljava/lang/Integer;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    :cond_24
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 847
    .line 848
    .line 849
    move-result v4

    .line 850
    if-eqz v4, :cond_25

    .line 851
    .line 852
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v4

    .line 856
    check-cast v4, Ljava/lang/Number;

    .line 857
    .line 858
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 859
    .line 860
    .line 861
    move-result v4

    .line 862
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 863
    .line 864
    .line 865
    move-result-object v4

    .line 866
    if-eqz v4, :cond_24

    .line 867
    .line 868
    iget-object v13, v5, Lxx;->δ:Ljava/lang/String;

    .line 869
    .line 870
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 871
    .line 872
    .line 873
    move-result v13

    .line 874
    invoke-virtual {v4, v13}, Landroid/view/View;->setBackgroundColor(I)V

    .line 875
    .line 876
    .line 877
    goto :goto_16

    .line 878
    :cond_25
    const v0, 0x7f090192

    .line 879
    .line 880
    .line 881
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 882
    .line 883
    .line 884
    move-result-object v4

    .line 885
    check-cast v4, Landroid/widget/EditText;

    .line 886
    .line 887
    const/16 v13, 0xa

    .line 888
    .line 889
    if-eqz v4, :cond_26

    .line 890
    .line 891
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 892
    .line 893
    .line 894
    move-result v9

    .line 895
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 896
    .line 897
    .line 898
    iget-object v9, v5, Lxx;->θ:Ljava/lang/String;

    .line 899
    .line 900
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 901
    .line 902
    .line 903
    move-result v9

    .line 904
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 905
    .line 906
    .line 907
    iget-object v5, v5, Lxx;->χ:Ljava/lang/String;

    .line 908
    .line 909
    invoke-static {v13, v3, v7, v5}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 910
    .line 911
    .line 912
    move-result-object v5

    .line 913
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 914
    .line 915
    .line 916
    new-instance v5, Lsu;

    .line 917
    .line 918
    const/4 v9, 0x2

    .line 919
    invoke-direct {v5, v3, v4, v9}, Lsu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 923
    .line 924
    .line 925
    new-instance v5, Luu;

    .line 926
    .line 927
    const/4 v9, 0x1

    .line 928
    invoke-direct {v5, v3, v4, v9}, Luu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 932
    .line 933
    .line 934
    :cond_26
    const v4, 0x7f090195

    .line 935
    .line 936
    .line 937
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 938
    .line 939
    .line 940
    move-result-object v5

    .line 941
    const v16, 0x7f090194

    .line 942
    .line 943
    .line 944
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 945
    .line 946
    .line 947
    move-result-object v9

    .line 948
    const v24, 0x7f090193

    .line 949
    .line 950
    .line 951
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    filled-new-array {v5, v9, v4}, [Ljava/lang/Integer;

    .line 956
    .line 957
    .line 958
    move-result-object v4

    .line 959
    invoke-static {v4}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 960
    .line 961
    .line 962
    move-result-object v4

    .line 963
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    :cond_27
    :goto_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 968
    .line 969
    .line 970
    move-result v5

    .line 971
    if-eqz v5, :cond_28

    .line 972
    .line 973
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v5

    .line 977
    check-cast v5, Ljava/lang/Number;

    .line 978
    .line 979
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 980
    .line 981
    .line 982
    move-result v5

    .line 983
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 984
    .line 985
    .line 986
    move-result-object v5

    .line 987
    if-eqz v5, :cond_27

    .line 988
    .line 989
    const/16 v9, 0x8

    .line 990
    .line 991
    invoke-static {v9, v3, v7, v12}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 992
    .line 993
    .line 994
    move-result-object v9

    .line 995
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 996
    .line 997
    .line 998
    goto :goto_17

    .line 999
    :cond_28
    const v4, 0x7f090197

    .line 1000
    .line 1001
    .line 1002
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v5

    .line 1006
    const v7, 0x7f090196

    .line 1007
    .line 1008
    .line 1009
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v9

    .line 1013
    filled-new-array {v5, v9}, [Ljava/lang/Integer;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v5

    .line 1017
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v5

    .line 1021
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v5

    .line 1025
    :goto_18
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1026
    .line 1027
    .line 1028
    move-result v9

    .line 1029
    if-eqz v9, :cond_2a

    .line 1030
    .line 1031
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v9

    .line 1035
    check-cast v9, Ljava/lang/Number;

    .line 1036
    .line 1037
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1038
    .line 1039
    .line 1040
    move-result v9

    .line 1041
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v9

    .line 1045
    check-cast v9, Landroid/widget/Switch;

    .line 1046
    .line 1047
    if-eqz v9, :cond_29

    .line 1048
    .line 1049
    invoke-static {v3}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v12

    .line 1053
    new-instance v7, Landroid/content/res/ColorStateList;

    .line 1054
    .line 1055
    const v26, 0x10100a0

    .line 1056
    .line 1057
    .line 1058
    filled-new-array/range {v26 .. v26}, [I

    .line 1059
    .line 1060
    .line 1061
    move-result-object v4

    .line 1062
    const/4 v0, 0x0

    .line 1063
    new-array v13, v0, [I

    .line 1064
    .line 1065
    filled-new-array {v4, v13}, [[I

    .line 1066
    .line 1067
    .line 1068
    move-result-object v4

    .line 1069
    iget-object v13, v12, Lxx;->ι:Ljava/lang/String;

    .line 1070
    .line 1071
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1072
    .line 1073
    .line 1074
    move-result v13

    .line 1075
    iget-object v0, v12, Lxx;->θ:Ljava/lang/String;

    .line 1076
    .line 1077
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    filled-new-array {v13, v0}, [I

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    invoke-direct {v7, v4, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v9, v7}, Landroid/widget/Switch;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 1089
    .line 1090
    .line 1091
    new-instance v0, Landroid/content/res/ColorStateList;

    .line 1092
    .line 1093
    filled-new-array/range {v26 .. v26}, [I

    .line 1094
    .line 1095
    .line 1096
    move-result-object v4

    .line 1097
    const/4 v7, 0x0

    .line 1098
    new-array v13, v7, [I

    .line 1099
    .line 1100
    filled-new-array {v4, v13}, [[I

    .line 1101
    .line 1102
    .line 1103
    move-result-object v4

    .line 1104
    iget-object v7, v12, Lxx;->κ:Ljava/lang/String;

    .line 1105
    .line 1106
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1107
    .line 1108
    .line 1109
    move-result v7

    .line 1110
    iget-object v12, v12, Lxx;->χ:Ljava/lang/String;

    .line 1111
    .line 1112
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1113
    .line 1114
    .line 1115
    move-result v12

    .line 1116
    filled-new-array {v7, v12}, [I

    .line 1117
    .line 1118
    .line 1119
    move-result-object v7

    .line 1120
    invoke-direct {v0, v4, v7}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v9, v0}, Landroid/widget/Switch;->setTrackTintList(Landroid/content/res/ColorStateList;)V

    .line 1124
    .line 1125
    .line 1126
    :cond_29
    const v0, 0x7f090192

    .line 1127
    .line 1128
    .line 1129
    const v4, 0x7f090197

    .line 1130
    .line 1131
    .line 1132
    const v7, 0x7f090196

    .line 1133
    .line 1134
    .line 1135
    const/16 v13, 0xa

    .line 1136
    .line 1137
    goto :goto_18

    .line 1138
    :cond_2a
    const v0, 0x7f09018a

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v4

    .line 1145
    check-cast v4, Landroid/widget/TextView;

    .line 1146
    .line 1147
    if-eqz v4, :cond_2b

    .line 1148
    .line 1149
    invoke-static {v3, v4}, Lln0;->θ(Landroid/content/Context;Landroid/widget/TextView;)V

    .line 1150
    .line 1151
    .line 1152
    :cond_2b
    const v4, 0x7f090189

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v5

    .line 1159
    check-cast v5, Landroid/widget/TextView;

    .line 1160
    .line 1161
    if-eqz v5, :cond_2c

    .line 1162
    .line 1163
    invoke-static {v3, v5}, Lln0;->θ(Landroid/content/Context;Landroid/widget/TextView;)V

    .line 1164
    .line 1165
    .line 1166
    :cond_2c
    const v5, 0x7f09018b

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v7

    .line 1173
    check-cast v7, Landroid/widget/TextView;

    .line 1174
    .line 1175
    const/16 v9, 0x11

    .line 1176
    .line 1177
    if-eqz v7, :cond_2d

    .line 1178
    .line 1179
    invoke-static {v3}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v12

    .line 1183
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 1184
    .line 1185
    .line 1186
    const/4 v13, 0x0

    .line 1187
    invoke-virtual {v7, v13}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 1188
    .line 1189
    .line 1190
    const/4 v13, -0x1

    .line 1191
    invoke-virtual {v7, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1192
    .line 1193
    .line 1194
    iget-object v13, v12, Lxx;->Α:Ljava/lang/String;

    .line 1195
    .line 1196
    iget-object v12, v12, Lxx;->ι:Ljava/lang/String;

    .line 1197
    .line 1198
    const/16 v5, 0xa

    .line 1199
    .line 1200
    invoke-static {v5, v3, v13, v12}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v5

    .line 1204
    invoke-virtual {v7, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1205
    .line 1206
    .line 1207
    :cond_2d
    const v5, 0x7f09019a

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v7

    .line 1214
    check-cast v7, Landroid/widget/TextView;

    .line 1215
    .line 1216
    if-eqz v7, :cond_2e

    .line 1217
    .line 1218
    invoke-static {v3}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v5

    .line 1222
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 1223
    .line 1224
    .line 1225
    const/4 v9, 0x0

    .line 1226
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 1227
    .line 1228
    .line 1229
    iget-object v12, v5, Lxx;->η:Ljava/lang/String;

    .line 1230
    .line 1231
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1232
    .line 1233
    .line 1234
    move-result v12

    .line 1235
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1236
    .line 1237
    .line 1238
    iget-object v12, v5, Lxx;->Α:Ljava/lang/String;

    .line 1239
    .line 1240
    iget-object v5, v5, Lxx;->χ:Ljava/lang/String;

    .line 1241
    .line 1242
    const/16 v13, 0x63

    .line 1243
    .line 1244
    invoke-static {v13, v3, v12, v5}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v5

    .line 1248
    invoke-virtual {v7, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1249
    .line 1250
    .line 1251
    :goto_19
    const v5, 0x7f0901a3

    .line 1252
    .line 1253
    .line 1254
    goto :goto_1a

    .line 1255
    :cond_2e
    const/4 v9, 0x0

    .line 1256
    goto :goto_19

    .line 1257
    :goto_1a
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v5

    .line 1261
    move-object v13, v5

    .line 1262
    check-cast v13, Landroid/widget/TextView;

    .line 1263
    .line 1264
    const v5, 0x7f0901a8

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v5

    .line 1271
    move-object v12, v5

    .line 1272
    check-cast v12, Landroid/widget/TextView;

    .line 1273
    .line 1274
    const v5, 0x7f090192

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v5

    .line 1281
    check-cast v5, Landroid/widget/EditText;

    .line 1282
    .line 1283
    const v7, 0x7f09018f

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v7

    .line 1290
    check-cast v7, Landroid/widget/LinearLayout;

    .line 1291
    .line 1292
    const v9, 0x7f090195

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v9

    .line 1299
    move/from16 v4, v21

    .line 1300
    .line 1301
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v4

    .line 1305
    check-cast v4, Landroid/widget/TextView;

    .line 1306
    .line 1307
    move/from16 v0, v16

    .line 1308
    .line 1309
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    move-object/from16 v21, v1

    .line 1314
    .line 1315
    const v1, 0x7f090197

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v1

    .line 1322
    check-cast v1, Landroid/widget/Switch;

    .line 1323
    .line 1324
    move-object/from16 v16, v4

    .line 1325
    .line 1326
    move/from16 v4, v24

    .line 1327
    .line 1328
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v4

    .line 1332
    move-object/from16 v22, v5

    .line 1333
    .line 1334
    const v5, 0x7f090196

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v5

    .line 1341
    check-cast v5, Landroid/widget/Switch;

    .line 1342
    .line 1343
    move-object/from16 v23, v6

    .line 1344
    .line 1345
    const v6, 0x7f09019a

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v6

    .line 1352
    check-cast v6, Landroid/widget/TextView;

    .line 1353
    .line 1354
    move-object/from16 v18, v9

    .line 1355
    .line 1356
    const v9, 0x7f09018a

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v9

    .line 1363
    check-cast v9, Landroid/widget/TextView;

    .line 1364
    .line 1365
    move-object/from16 v19, v9

    .line 1366
    .line 1367
    const v9, 0x7f090189

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v9

    .line 1374
    check-cast v9, Landroid/widget/TextView;

    .line 1375
    .line 1376
    move-object/from16 v17, v9

    .line 1377
    .line 1378
    const v9, 0x7f09018b

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v9

    .line 1385
    check-cast v9, Landroid/widget/TextView;

    .line 1386
    .line 1387
    move-object/from16 v24, v9

    .line 1388
    .line 1389
    new-instance v9, Landroid/app/AlertDialog$Builder;

    .line 1390
    .line 1391
    invoke-direct {v9, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v9, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v2

    .line 1398
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v2

    .line 1402
    const-string v9, "yyyy\u5e74MM\u6708dd\u65e5 HH:mm"

    .line 1403
    .line 1404
    move-object/from16 v25, v10

    .line 1405
    .line 1406
    const-string v10, "yyyyMMdd HH:mm"

    .line 1407
    .line 1408
    move-object/from16 v26, v12

    .line 1409
    .line 1410
    const-string v12, "yyyy/MM/dd HH:mm"

    .line 1411
    .line 1412
    move-object/from16 v27, v13

    .line 1413
    .line 1414
    const-string v13, "MM-dd HH:mm"

    .line 1415
    .line 1416
    filled-new-array {v11, v12, v13, v9, v10}, [Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v9

    .line 1420
    invoke-static {v9}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v9

    .line 1424
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v28

    .line 1428
    :goto_1b
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->hasNext()Z

    .line 1429
    .line 1430
    .line 1431
    move-result v9

    .line 1432
    if-eqz v9, :cond_2f

    .line 1433
    .line 1434
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v9

    .line 1438
    move-object v11, v9

    .line 1439
    check-cast v11, Ljava/lang/String;

    .line 1440
    .line 1441
    sget-object v9, Lbv1;->α:Lbv1;

    .line 1442
    .line 1443
    new-instance v9, Lil1;

    .line 1444
    .line 1445
    move-object/from16 v10, v19

    .line 1446
    .line 1447
    const/16 v19, 0x1

    .line 1448
    .line 1449
    move-object/from16 v29, v8

    .line 1450
    .line 1451
    move-object/from16 v30, v10

    .line 1452
    .line 1453
    move-object/from16 v31, v17

    .line 1454
    .line 1455
    move-object/from16 v8, v18

    .line 1456
    .line 1457
    move-object/from16 v12, v22

    .line 1458
    .line 1459
    move-object/from16 v18, v23

    .line 1460
    .line 1461
    move-object/from16 v32, v24

    .line 1462
    .line 1463
    move-object/from16 v10, v25

    .line 1464
    .line 1465
    move-object/from16 v13, v27

    .line 1466
    .line 1467
    const/16 v20, 0x2

    .line 1468
    .line 1469
    const/16 v22, 0x0

    .line 1470
    .line 1471
    move-object/from16 v17, v15

    .line 1472
    .line 1473
    move-object/from16 v15, v16

    .line 1474
    .line 1475
    move-object/from16 v16, v14

    .line 1476
    .line 1477
    move-object/from16 v14, v26

    .line 1478
    .line 1479
    invoke-direct/range {v9 .. v19}, Lil1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/widget/TextView;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1480
    .line 1481
    .line 1482
    const-string v13, ""

    .line 1483
    .line 1484
    const-string v14, "\u70b9\u51fb\u5e94\u7528\u8be5\u65e5\u671f\u683c\u5f0f"

    .line 1485
    .line 1486
    invoke-static {v3, v11, v13, v14, v9}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v9

    .line 1490
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1491
    .line 1492
    .line 1493
    move-object/from16 v22, v12

    .line 1494
    .line 1495
    move-object/from16 v14, v16

    .line 1496
    .line 1497
    move-object/from16 v19, v30

    .line 1498
    .line 1499
    move-object/from16 v18, v8

    .line 1500
    .line 1501
    move-object/from16 v16, v15

    .line 1502
    .line 1503
    move-object/from16 v15, v17

    .line 1504
    .line 1505
    move-object/from16 v8, v29

    .line 1506
    .line 1507
    move-object/from16 v17, v31

    .line 1508
    .line 1509
    goto :goto_1b

    .line 1510
    :cond_2f
    move-object/from16 v29, v8

    .line 1511
    .line 1512
    move-object/from16 v31, v17

    .line 1513
    .line 1514
    move-object/from16 v8, v18

    .line 1515
    .line 1516
    move-object/from16 v30, v19

    .line 1517
    .line 1518
    move-object/from16 v12, v22

    .line 1519
    .line 1520
    move-object/from16 v18, v23

    .line 1521
    .line 1522
    move-object/from16 v32, v24

    .line 1523
    .line 1524
    move-object/from16 v10, v25

    .line 1525
    .line 1526
    const/16 v20, 0x2

    .line 1527
    .line 1528
    const/16 v22, 0x0

    .line 1529
    .line 1530
    move-object/from16 v17, v15

    .line 1531
    .line 1532
    move-object/from16 v15, v16

    .line 1533
    .line 1534
    move-object/from16 v16, v14

    .line 1535
    .line 1536
    iget-object v7, v10, Lum1;->ε:Ljava/lang/Object;

    .line 1537
    .line 1538
    check-cast v7, Ljava/lang/CharSequence;

    .line 1539
    .line 1540
    invoke-virtual {v12, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v12}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v7

    .line 1547
    if-eqz v7, :cond_30

    .line 1548
    .line 1549
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 1550
    .line 1551
    .line 1552
    move-result v7

    .line 1553
    goto :goto_1c

    .line 1554
    :cond_30
    move/from16 v7, v22

    .line 1555
    .line 1556
    :goto_1c
    invoke-virtual {v12, v7}, Landroid/widget/EditText;->setSelection(I)V

    .line 1557
    .line 1558
    .line 1559
    new-instance v9, Lav1;

    .line 1560
    .line 1561
    move-object v11, v12

    .line 1562
    move-object v14, v15

    .line 1563
    move-object/from16 v15, v16

    .line 1564
    .line 1565
    move-object/from16 v16, v17

    .line 1566
    .line 1567
    move-object/from16 v17, v18

    .line 1568
    .line 1569
    move-object/from16 v13, v26

    .line 1570
    .line 1571
    move-object/from16 v12, v27

    .line 1572
    .line 1573
    invoke-direct/range {v9 .. v17}, Lav1;-><init>(Lum1;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lum1;Lqm1;Lqm1;)V

    .line 1574
    .line 1575
    .line 1576
    move-object/from16 v17, v16

    .line 1577
    .line 1578
    move-object/from16 v16, v15

    .line 1579
    .line 1580
    move-object v15, v14

    .line 1581
    move-object v14, v13

    .line 1582
    move-object v13, v12

    .line 1583
    move-object v12, v11

    .line 1584
    invoke-virtual {v12, v9}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1585
    .line 1586
    .line 1587
    new-instance v9, Lea0;

    .line 1588
    .line 1589
    move-object v12, v10

    .line 1590
    move-object/from16 v10, v16

    .line 1591
    .line 1592
    move-object/from16 v16, v15

    .line 1593
    .line 1594
    move-object v15, v14

    .line 1595
    move-object v14, v13

    .line 1596
    move-object v13, v11

    .line 1597
    move-object v11, v3

    .line 1598
    invoke-direct/range {v9 .. v18}, Lea0;-><init>(Lum1;Landroid/app/Activity;Lum1;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lqm1;Lqm1;)V

    .line 1599
    .line 1600
    .line 1601
    move-object/from16 v19, v11

    .line 1602
    .line 1603
    move-object/from16 v7, v16

    .line 1604
    .line 1605
    move-object/from16 v3, v18

    .line 1606
    .line 1607
    move-object/from16 v16, v10

    .line 1608
    .line 1609
    move-object v10, v12

    .line 1610
    move-object v12, v13

    .line 1611
    move-object v13, v14

    .line 1612
    move-object v14, v15

    .line 1613
    move-object/from16 v15, v17

    .line 1614
    .line 1615
    invoke-virtual {v8, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1616
    .line 1617
    .line 1618
    iget-boolean v8, v15, Lqm1;->ε:Z

    .line 1619
    .line 1620
    invoke-virtual {v1, v8}, Landroid/widget/Switch;->setChecked(Z)V

    .line 1621
    .line 1622
    .line 1623
    iget-boolean v8, v3, Lqm1;->ε:Z

    .line 1624
    .line 1625
    invoke-virtual {v5, v8}, Landroid/widget/Switch;->setChecked(Z)V

    .line 1626
    .line 1627
    .line 1628
    new-instance v9, Lst1;

    .line 1629
    .line 1630
    const/16 v18, 0x0

    .line 1631
    .line 1632
    move-object/from16 v17, v3

    .line 1633
    .line 1634
    move-object v11, v10

    .line 1635
    move-object v10, v15

    .line 1636
    move-object v15, v7

    .line 1637
    invoke-direct/range {v9 .. v18}, Lst1;-><init>(Lqm1;Lum1;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lum1;Lqm1;I)V

    .line 1638
    .line 1639
    .line 1640
    move-object/from16 v18, v17

    .line 1641
    .line 1642
    move-object/from16 v17, v10

    .line 1643
    .line 1644
    move-object v10, v11

    .line 1645
    invoke-virtual {v1, v9}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1646
    .line 1647
    .line 1648
    new-instance v9, Lst1;

    .line 1649
    .line 1650
    move-object/from16 v3, v18

    .line 1651
    .line 1652
    const/16 v18, 0x1

    .line 1653
    .line 1654
    move-object v10, v3

    .line 1655
    invoke-direct/range {v9 .. v18}, Lst1;-><init>(Lqm1;Lum1;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lum1;Lqm1;I)V

    .line 1656
    .line 1657
    .line 1658
    move-object/from16 v18, v10

    .line 1659
    .line 1660
    move-object v10, v11

    .line 1661
    invoke-virtual {v5, v9}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1662
    .line 1663
    .line 1664
    new-instance v3, Lwu;

    .line 1665
    .line 1666
    const/4 v7, 0x3

    .line 1667
    invoke-direct {v3, v1, v7}, Lwu;-><init>(Landroid/widget/Switch;I)V

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1671
    .line 1672
    .line 1673
    new-instance v0, Lwu;

    .line 1674
    .line 1675
    const/4 v1, 0x4

    .line 1676
    invoke-direct {v0, v5, v1}, Lwu;-><init>(Landroid/widget/Switch;I)V

    .line 1677
    .line 1678
    .line 1679
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1680
    .line 1681
    .line 1682
    new-instance v0, Lsa;

    .line 1683
    .line 1684
    const/16 v1, 0x14

    .line 1685
    .line 1686
    invoke-direct {v0, v2, v1}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1690
    .line 1691
    .line 1692
    new-instance v0, Lsa;

    .line 1693
    .line 1694
    const/16 v1, 0x15

    .line 1695
    .line 1696
    invoke-direct {v0, v2, v1}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 1697
    .line 1698
    .line 1699
    move-object/from16 v9, v31

    .line 1700
    .line 1701
    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1702
    .line 1703
    .line 1704
    new-instance v0, Ltt1;

    .line 1705
    .line 1706
    move-object v3, v2

    .line 1707
    move-object v4, v10

    .line 1708
    move-object/from16 v7, v16

    .line 1709
    .line 1710
    move-object/from16 v5, v17

    .line 1711
    .line 1712
    move-object/from16 v6, v18

    .line 1713
    .line 1714
    move-object/from16 v2, v19

    .line 1715
    .line 1716
    move/from16 v8, v20

    .line 1717
    .line 1718
    move-object/from16 v1, v21

    .line 1719
    .line 1720
    move/from16 v20, v22

    .line 1721
    .line 1722
    invoke-direct/range {v0 .. v7}, Ltt1;-><init>(La80;Landroid/app/Activity;Landroid/app/AlertDialog;Lum1;Lqm1;Lqm1;Lum1;)V

    .line 1723
    .line 1724
    .line 1725
    move-object/from16 v9, v32

    .line 1726
    .line 1727
    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1728
    .line 1729
    .line 1730
    new-instance v0, Lvj;

    .line 1731
    .line 1732
    move-object/from16 v4, v29

    .line 1733
    .line 1734
    invoke-direct {v0, v3, v2, v4, v1}, Lvj;-><init>(Landroid/app/AlertDialog;Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 1735
    .line 1736
    .line 1737
    move-object/from16 v9, v30

    .line 1738
    .line 1739
    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1740
    .line 1741
    .line 1742
    move-object v9, v10

    .line 1743
    move-object v10, v12

    .line 1744
    move-object v11, v13

    .line 1745
    move-object v12, v14

    .line 1746
    move-object v13, v15

    .line 1747
    move-object/from16 v14, v16

    .line 1748
    .line 1749
    move-object/from16 v15, v17

    .line 1750
    .line 1751
    move-object/from16 v16, v18

    .line 1752
    .line 1753
    move/from16 v0, v20

    .line 1754
    .line 1755
    invoke-static/range {v9 .. v16}, Lbv1;->Φ(Lum1;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lum1;Lqm1;Lqm1;)V

    .line 1756
    .line 1757
    .line 1758
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    .line 1759
    .line 1760
    .line 1761
    invoke-virtual {v3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v1

    .line 1765
    if-eqz v1, :cond_31

    .line 1766
    .line 1767
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 1768
    .line 1769
    invoke-direct {v3, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 1770
    .line 1771
    .line 1772
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1773
    .line 1774
    .line 1775
    const/high16 v0, 0x3f000000    # 0.5f

    .line 1776
    .line 1777
    invoke-virtual {v1, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 1778
    .line 1779
    .line 1780
    invoke-virtual {v1, v8}, Landroid/view/Window;->addFlags(I)V

    .line 1781
    .line 1782
    .line 1783
    const v0, 0x20008

    .line 1784
    .line 1785
    .line 1786
    invoke-virtual {v1, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 1787
    .line 1788
    .line 1789
    const/16 v0, 0x10

    .line 1790
    .line 1791
    invoke-virtual {v1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 1792
    .line 1793
    .line 1794
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v0

    .line 1798
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v0

    .line 1802
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1803
    .line 1804
    int-to-float v0, v0

    .line 1805
    const v2, 0x3f6b851f    # 0.92f

    .line 1806
    .line 1807
    .line 1808
    mul-float/2addr v0, v2

    .line 1809
    float-to-int v0, v0

    .line 1810
    const/4 v2, -0x2

    .line 1811
    invoke-virtual {v1, v0, v2}, Landroid/view/Window;->setLayout(II)V

    .line 1812
    .line 1813
    .line 1814
    :cond_31
    sget-object v0, Ls62;->α:Ls62;

    .line 1815
    .line 1816
    return-object v0
.end method

.method private final γ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lg71;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    move-object/from16 v0, p1

    .line 6
    .line 7
    check-cast v0, La80;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, Lbv1;->α:Lbv1;

    .line 13
    .line 14
    new-instance v8, Lnt;

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    invoke-direct {v8, v0, v2}, Lnt;-><init>(La80;I)V

    .line 18
    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    :try_start_0
    sget-object v0, Lx01;->α:Lx01;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const v2, 0x7f0c0025

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v0, v2, v3, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v2, 0x7f090334

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Landroid/widget/TextView;

    .line 43
    .line 44
    const v4, 0x7f09032e

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    move-object v12, v4

    .line 52
    check-cast v12, Landroid/widget/TextView;

    .line 53
    .line 54
    const v4, 0x7f090335

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    move-object v13, v4

    .line 62
    check-cast v13, Landroid/widget/TextView;

    .line 63
    .line 64
    const v4, 0x7f090213

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Landroid/widget/ListView;

    .line 72
    .line 73
    const v5, 0x7f090055

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const v6, 0x7f09006a

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    const v7, 0x7f090068

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    instance-of v10, v5, Landroid/widget/TextView;

    .line 95
    .line 96
    if-eqz v10, :cond_0

    .line 97
    .line 98
    move-object v10, v5

    .line 99
    check-cast v10, Landroid/widget/TextView;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_0
    move-object v10, v3

    .line 106
    :goto_0
    if-eqz v10, :cond_1

    .line 107
    .line 108
    const-string v11, "\u6e05\u7a7a\u7b5b\u9009"

    .line 109
    .line 110
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    instance-of v10, v6, Landroid/widget/TextView;

    .line 114
    .line 115
    if-eqz v10, :cond_2

    .line 116
    .line 117
    move-object v10, v6

    .line 118
    check-cast v10, Landroid/widget/TextView;

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    move-object v10, v3

    .line 122
    :goto_1
    if-eqz v10, :cond_3

    .line 123
    .line 124
    const-string v11, "\u5168\u90e8\u663e\u793a"

    .line 125
    .line 126
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    instance-of v10, v7, Landroid/widget/TextView;

    .line 130
    .line 131
    if-eqz v10, :cond_4

    .line 132
    .line 133
    move-object v10, v7

    .line 134
    check-cast v10, Landroid/widget/TextView;

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_4
    move-object v10, v3

    .line 138
    :goto_2
    if-eqz v10, :cond_5

    .line 139
    .line 140
    const-string v11, "\u4fdd\u5b58"

    .line 141
    .line 142
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    invoke-static {}, Lbv1;->ψ()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    new-instance v14, Ljava/util/LinkedHashMap;

    .line 150
    .line 151
    invoke-direct {v14}, Ljava/util/LinkedHashMap;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v11

    .line 162
    if-eqz v11, :cond_6

    .line 163
    .line 164
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    check-cast v11, Lku1;

    .line 169
    .line 170
    iget-object v11, v11, Lku1;->α:Ljava/lang/String;

    .line 171
    .line 172
    const-string v3, "feed_right_control_hide_"

    .line 173
    .line 174
    invoke-virtual {v3, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-static {v3, v9}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-interface {v14, v11, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    const/4 v3, 0x0

    .line 190
    goto :goto_3

    .line 191
    :cond_6
    new-instance v11, Lzc0;

    .line 192
    .line 193
    invoke-direct {v11, v1, v15, v14}, Lzc0;-><init>(Landroid/app/Activity;Ljava/util/List;Ljava/util/LinkedHashMap;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, v11}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 197
    .line 198
    .line 199
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 200
    .line 201
    sget-object v10, Lbv1;->δ:Lqu1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    .line 203
    const-string v16, "theme"

    .line 204
    .line 205
    if-eqz v10, :cond_8

    .line 206
    .line 207
    :try_start_1
    iget-object v10, v10, Lqu1;->ε:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    invoke-direct {v3, v10}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v3}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 217
    .line 218
    .line 219
    const/4 v3, 0x1

    .line 220
    invoke-virtual {v4, v3}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4, v9}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 224
    .line 225
    .line 226
    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    .line 227
    .line 228
    sget-object v10, Lbv1;->δ:Lqu1;

    .line 229
    .line 230
    if-eqz v10, :cond_7

    .line 231
    .line 232
    iget-object v10, v10, Lqu1;->υ:Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    invoke-static {v10}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    const/4 v9, 0x0

    .line 243
    invoke-direct {v3, v10, v9, v9}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4, v3}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v12, v15, v13, v14}, Lbv1;->Π(Landroid/widget/TextView;Ljava/util/List;Landroid/widget/TextView;Ljava/util/LinkedHashMap;)V

    .line 250
    .line 251
    .line 252
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 253
    .line 254
    invoke-direct {v3, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 262
    .line 263
    .line 264
    move-result-object v9

    .line 265
    new-instance v0, Lsa;

    .line 266
    .line 267
    const/16 v3, 0x16

    .line 268
    .line 269
    invoke-direct {v0, v9, v3}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 273
    .line 274
    .line 275
    new-instance v10, Lut1;

    .line 276
    .line 277
    invoke-direct/range {v10 .. v15}, Lut1;-><init>(Lzc0;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4, v10}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 281
    .line 282
    .line 283
    new-instance v0, Lcl0;

    .line 284
    .line 285
    move-object v2, v7

    .line 286
    const/4 v7, 0x3

    .line 287
    move-object v10, v5

    .line 288
    move-object v3, v11

    .line 289
    move-object v5, v12

    .line 290
    move-object v4, v14

    .line 291
    move-object v12, v2

    .line 292
    move-object v11, v6

    .line 293
    move-object v6, v13

    .line 294
    move-object v2, v15

    .line 295
    invoke-direct/range {v0 .. v7}, Lcl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v10, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 299
    .line 300
    .line 301
    new-instance v10, Lg90;

    .line 302
    .line 303
    move-object v0, v11

    .line 304
    move-object v6, v12

    .line 305
    move-object v11, v3

    .line 306
    move-object v12, v5

    .line 307
    invoke-direct/range {v10 .. v15}, Lg90;-><init>(Lzc0;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 311
    .line 312
    .line 313
    new-instance v0, Lg90;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 314
    .line 315
    move-object v2, v1

    .line 316
    move-object v3, v8

    .line 317
    move-object v4, v9

    .line 318
    move-object v5, v14

    .line 319
    move-object v1, v15

    .line 320
    :try_start_2
    invoke-direct/range {v0 .. v5}, Lg90;-><init>(Ljava/util/List;Landroid/app/Activity;Lnt;Landroid/app/AlertDialog;Ljava/util/LinkedHashMap;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 321
    .line 322
    .line 323
    move-object v1, v2

    .line 324
    :try_start_3
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v4}, Landroid/app/Dialog;->show()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    if-eqz v0, :cond_9

    .line 335
    .line 336
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 337
    .line 338
    const/4 v3, 0x0

    .line 339
    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 354
    .line 355
    int-to-float v2, v2

    .line 356
    const v3, 0x3f6b851f    # 0.92f

    .line 357
    .line 358
    .line 359
    mul-float/2addr v2, v3

    .line 360
    float-to-int v2, v2

    .line 361
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 370
    .line 371
    int-to-float v3, v3

    .line 372
    const v4, 0x3f428f5c    # 0.76f

    .line 373
    .line 374
    .line 375
    mul-float/2addr v3, v4

    .line 376
    float-to-int v3, v3

    .line 377
    invoke-virtual {v0, v2, v3}, Landroid/view/Window;->setLayout(II)V

    .line 378
    .line 379
    .line 380
    goto :goto_5

    .line 381
    :catchall_1
    move-exception v0

    .line 382
    move-object v1, v2

    .line 383
    goto :goto_4

    .line 384
    :cond_7
    invoke-static/range {v16 .. v16}, Lln0;->и(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    const/4 v9, 0x0

    .line 388
    throw v9

    .line 389
    :cond_8
    invoke-static/range {v16 .. v16}, Lln0;->и(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    const/4 v9, 0x0

    .line 393
    throw v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 394
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    new-instance v3, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    const-string v4, "\u6253\u5f00 Feed \u53f3\u4fa7\u63a7\u4ef6\u5c4f\u853d\u8bbe\u7f6e\u5931\u8d25: "

    .line 401
    .line 402
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    const-string v3, "DYHelper"

    .line 413
    .line 414
    invoke-static {v3, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    new-instance v2, Ljava/lang/StringBuilder;

    .line 422
    .line 423
    const-string v3, "\u6253\u5f00\u8bbe\u7f6e\u5931\u8d25: "

    .line 424
    .line 425
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    const/4 v3, 0x0

    .line 436
    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 441
    .line 442
    .line 443
    :cond_9
    :goto_5
    sget-object v0, Ls62;->α:Ls62;

    .line 444
    .line 445
    return-object v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lg71;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/16 v3, 0x11

    .line 7
    .line 8
    const/16 v4, 0xb

    .line 9
    .line 10
    const/16 v5, 0x13

    .line 11
    .line 12
    const/16 v6, 0xa

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const-string v9, "DYHelper"

    .line 16
    .line 17
    const/4 v10, 0x2

    .line 18
    const/4 v11, 0x7

    .line 19
    const/4 v12, 0x1

    .line 20
    const/4 v13, 0x0

    .line 21
    iget-object v14, v0, Lg71;->ζ:Landroid/app/Activity;

    .line 22
    .line 23
    sget-object v15, Ls62;->α:Ls62;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    check-cast v0, La80;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const-string v1, "\u624b\u52a8\u7f16\u8f91\u89c4\u5219"

    .line 36
    .line 37
    const-string v2, "\u6e05\u7a7a\u89c4\u5219"

    .line 38
    .line 39
    const-string v3, "\u4ece\u5f53\u524d\u4f1a\u8bdd\u9009\u62e9"

    .line 40
    .line 41
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 46
    .line 47
    invoke-direct {v2, v14}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 48
    .line 49
    .line 50
    const-string v3, "\u8bbe\u7f6e\u81ea\u52a8\u5df2\u8bfb\u89c4\u5219"

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v1, [Ljava/lang/CharSequence;

    .line 57
    .line 58
    new-instance v3, Lbc0;

    .line 59
    .line 60
    invoke-direct {v3, v14, v11, v0}, Lbc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1, v3}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 68
    .line 69
    .line 70
    return-object v15

    .line 71
    :pswitch_0
    move-object/from16 v0, p1

    .line 72
    .line 73
    check-cast v0, La80;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v1, Lbv1;->α:Lbv1;

    .line 79
    .line 80
    sget-object v1, Lkn0;->β:[Ljava/lang/String;

    .line 81
    .line 82
    const-string v2, "im_auto_read_filter_mode"

    .line 83
    .line 84
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {v3, v2, v13}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 89
    .line 90
    .line 91
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move v2, v13

    .line 94
    :goto_0
    invoke-static {v2, v13, v10}, Lj81;->μ(III)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    new-instance v3, Lxj0;

    .line 99
    .line 100
    invoke-direct {v3, v0, v11}, Lxj0;-><init>(La80;I)V

    .line 101
    .line 102
    .line 103
    const-string v0, "\u9009\u62e9\u81ea\u52a8\u5df2\u8bfb\u6a21\u5f0f"

    .line 104
    .line 105
    invoke-static {v14, v0, v1, v2, v3}, Lbv1;->Ω(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILa80;)V

    .line 106
    .line 107
    .line 108
    return-object v15

    .line 109
    :pswitch_1
    move-object/from16 v0, p1

    .line 110
    .line 111
    check-cast v0, La80;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance v0, Ln9;

    .line 120
    .line 121
    const/16 v1, 0x1d

    .line 122
    .line 123
    invoke-direct {v0, v14, v1}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v14, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    return-object v15

    .line 130
    :pswitch_2
    invoke-direct/range {p0 .. p1}, Lg71;->γ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    :pswitch_3
    move-object/from16 v0, p1

    .line 136
    .line 137
    check-cast v0, La80;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    sget-object v1, Lbv1;->α:Lbv1;

    .line 143
    .line 144
    invoke-static {}, Lbv1;->φ()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-nez v2, :cond_1

    .line 153
    .line 154
    const-string v2, "0"

    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_0

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_0
    const-string v2, "\u68c0\u67e5\u4e2d\u2026"

    .line 164
    .line 165
    invoke-interface {v0, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    new-instance v2, Lhu;

    .line 169
    .line 170
    const/16 v3, 0x17

    .line 171
    .line 172
    invoke-direct {v2, v14, v0, v3}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 173
    .line 174
    .line 175
    invoke-static {v1, v2}, Lx9;->μ(Ljava/lang/String;La80;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_1
    :goto_1
    const-string v1, "\u6682\u672a\u68c0\u6d4b\u5230\u5f53\u524d\u6296\u97f3\u8d26\u53f7 UID"

    .line 180
    .line 181
    invoke-static {v14, v1, v13}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 186
    .line 187
    .line 188
    const-string v1, "\u672a\u68c0\u6d4b\u5230\u8d26\u53f7"

    .line 189
    .line 190
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    :goto_2
    return-object v15

    .line 194
    :pswitch_4
    move-object/from16 v1, p1

    .line 195
    .line 196
    check-cast v1, La80;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    sget-object v2, Lbv1;->α:Lbv1;

    .line 202
    .line 203
    const-string v2, "offline_cache_count_enabled"

    .line 204
    .line 205
    invoke-static {v2, v13}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 206
    .line 207
    .line 208
    const-string v2, "offline_cache_count"

    .line 209
    .line 210
    const/16 v3, 0x64

    .line 211
    .line 212
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 217
    .line 218
    .line 219
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 220
    :catchall_1
    const/16 v2, 0x1f4

    .line 221
    .line 222
    invoke-static {v3, v6, v2}, Lj81;->μ(III)I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    new-instance v11, Lhu;

    .line 231
    .line 232
    iget-object v6, v0, Lg71;->ζ:Landroid/app/Activity;

    .line 233
    .line 234
    invoke-direct {v11, v6, v1, v5}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 235
    .line 236
    .line 237
    const-string v7, "\u8bbe\u7f6e\u79bb\u7ebf\u7f13\u5b58\u89c6\u9891\u6570\u91cf"

    .line 238
    .line 239
    const-string v8, "\u8f93\u5165 10~500 \u7684\u6574\u6570"

    .line 240
    .line 241
    const/4 v10, 0x2

    .line 242
    invoke-static/range {v6 .. v11}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 243
    .line 244
    .line 245
    return-object v15

    .line 246
    :pswitch_5
    sget-object v0, Lkn0;->γ:[Ljava/lang/String;

    .line 247
    .line 248
    move-object/from16 v1, p1

    .line 249
    .line 250
    check-cast v1, La80;

    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    sget-object v2, Lbv1;->α:Lbv1;

    .line 256
    .line 257
    const-string v2, "comment_audio_download_trigger_mode"

    .line 258
    .line 259
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-interface {v3, v2, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 264
    .line 265
    .line 266
    move-result v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 267
    :catchall_2
    invoke-static {v0}, Lg7;->в([Ljava/lang/Object;)Lxm0;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-static {v12, v2}, Lj81;->ν(ILxm0;)I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    new-instance v3, Lm3;

    .line 276
    .line 277
    invoke-direct {v3, v1, v0, v14, v4}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 278
    .line 279
    .line 280
    const-string v1, "\u9009\u62e9\u8bc4\u8bba\u8bed\u97f3\u4e0b\u8f7d\u65b9\u6848"

    .line 281
    .line 282
    invoke-static {v14, v1, v0, v2, v3}, Lbv1;->Ω(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILa80;)V

    .line 283
    .line 284
    .line 285
    return-object v15

    .line 286
    :pswitch_6
    move-object/from16 v0, p1

    .line 287
    .line 288
    check-cast v0, La80;

    .line 289
    .line 290
    const-string v1, "#CCFFFFFF"

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    :try_start_3
    const-string v2, "info_bar_text_color"

    .line 296
    .line 297
    invoke-static {v2, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 302
    .line 303
    .line 304
    move-result v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 305
    goto :goto_3

    .line 306
    :catch_0
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    :goto_3
    new-instance v2, Lhu;

    .line 311
    .line 312
    invoke-direct {v2, v0, v14, v3}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 313
    .line 314
    .line 315
    const-string v0, "\u8bbe\u7f6e\u5b57\u4f53\u989c\u8272"

    .line 316
    .line 317
    invoke-static {v14, v0, v1, v12, v2}, Lcom/example/dyhelper/ui/μ;->δ(Landroid/content/Context;Ljava/lang/String;IZLa80;)V

    .line 318
    .line 319
    .line 320
    return-object v15

    .line 321
    :pswitch_7
    invoke-direct/range {p0 .. p1}, Lg71;->β(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    return-object v0

    .line 326
    :pswitch_8
    move-object/from16 v0, p1

    .line 327
    .line 328
    check-cast v0, La80;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v14}, Landroid/app/Activity;->isFinishing()Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-nez v0, :cond_3

    .line 341
    .line 342
    invoke-virtual {v14}, Landroid/app/Activity;->isDestroyed()Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_2

    .line 347
    .line 348
    goto :goto_5

    .line 349
    :cond_2
    :try_start_4
    new-instance v0, Luk;

    .line 350
    .line 351
    invoke-direct {v0, v14}, Luk;-><init>(Landroid/app/Activity;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Luk;->μ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 355
    .line 356
    .line 357
    move-object v1, v15

    .line 358
    goto :goto_4

    .line 359
    :catchall_3
    move-exception v0

    .line 360
    new-instance v1, Leo1;

    .line 361
    .line 362
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 363
    .line 364
    .line 365
    :goto_4
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-eqz v0, :cond_3

    .line 370
    .line 371
    const-string v1, "rb83b9714f35f634"

    .line 372
    .line 373
    const-string v2, "\u6253\u5f00\u8bc4\u8bba\u533a\u63a7\u4ef6\u7ba1\u7406\u5668\u5931\u8d25"

    .line 374
    .line 375
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    const-string v0, "\u8bc4\u8bba\u533a\u63a7\u4ef6\u7ba1\u7406\u5668\u6253\u5f00\u5931\u8d25"

    .line 379
    .line 380
    invoke-static {v14, v0, v13}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 385
    .line 386
    .line 387
    :cond_3
    :goto_5
    return-object v15

    .line 388
    :pswitch_9
    move-object/from16 v0, p1

    .line 389
    .line 390
    check-cast v0, La80;

    .line 391
    .line 392
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    new-instance v1, Lxj0;

    .line 396
    .line 397
    const/4 v2, 0x5

    .line 398
    invoke-direct {v1, v0, v2}, Lxj0;-><init>(La80;I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    new-instance v0, Lw1;

    .line 405
    .line 406
    invoke-direct {v0, v14, v1}, Lw1;-><init>(Landroid/app/Activity;Lxj0;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v14, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 410
    .line 411
    .line 412
    return-object v15

    .line 413
    :pswitch_a
    move-object/from16 v0, p1

    .line 414
    .line 415
    check-cast v0, La80;

    .line 416
    .line 417
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    sget-object v0, Lbv1;->α:Lbv1;

    .line 421
    .line 422
    new-instance v0, Le71;

    .line 423
    .line 424
    invoke-direct {v0, v14, v3}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 425
    .line 426
    .line 427
    const-string v1, "\u786e\u8ba4\u6e05\u9664\u5168\u90e8\u7528\u6237\u914d\u7f6e"

    .line 428
    .line 429
    const-string v2, "\u786e\u5b9a\u8981\u6e05\u9664 DYHelper \u7684\u5168\u90e8\u7528\u6237\u914d\u7f6e\u5417\uff1f\n\n\u5c06\u6e05\u9664\uff1a\n\u2022 \u5f53\u524d\u8d26\u53f7\u914d\u7f6e\n\u2022 \u5176\u4ed6\u8d26\u53f7\u914d\u7f6e\n\u2022 \u65e7\u7248\u5168\u5c40\u914d\u7f6e\n\u2022 \u5143\u6570\u636e / \u6700\u540e\u8d26\u53f7\u8bb0\u5f55\n\u2022 \u5185\u6d4b\u72b6\u6001\u6587\u4ef6\n\u2022 \u5185\u6d4b\u8d26\u53f7\u72b6\u6001\u6587\u4ef6\n\u2022 \u706b\u82b1\u8bb0\u5f55\u7b49\u6a21\u5757\u914d\u7f6e\u6587\u4ef6\n\n\u4e0d\u4f1a\u5220\u9664\u4f60\u5df2\u7ecf\u4e0b\u8f7d\u5230\u672c\u5730\u7684\u89c6\u9891\u3001\u56fe\u7247\u6216\u97f3\u9891\u6587\u4ef6\u3002\n\n\u6b64\u64cd\u4f5c\u4e0d\u53ef\u6062\u590d\uff0c\u6e05\u9664\u540e\u5efa\u8bae\u91cd\u542f\u6296\u97f3\u3002"

    .line 430
    .line 431
    const-string v3, "\u5168\u90e8\u6e05\u9664"

    .line 432
    .line 433
    invoke-static {v14, v1, v2, v3, v0}, Lbv1;->Μ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 434
    .line 435
    .line 436
    return-object v15

    .line 437
    :pswitch_b
    move-object/from16 v0, p1

    .line 438
    .line 439
    check-cast v0, La80;

    .line 440
    .line 441
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    sget-object v0, Lbv1;->α:Lbv1;

    .line 445
    .line 446
    new-instance v0, Le71;

    .line 447
    .line 448
    const/16 v1, 0x10

    .line 449
    .line 450
    invoke-direct {v0, v14, v1}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 451
    .line 452
    .line 453
    const-string v1, "\u786e\u8ba4\u5bfc\u5165\u7528\u6237\u914d\u7f6e"

    .line 454
    .line 455
    const-string v2, "\u5bfc\u5165\u4f1a\u8986\u76d6\u5907\u4efd\u6587\u4ef6\u4e2d\u5305\u542b\u7684 DYHelper \u914d\u7f6e\uff0c\u5305\u62ec\u8d26\u53f7\u914d\u7f6e\u3001\u706b\u82b1\u8bb0\u5f55\u3001\u5185\u6d4b\u72b6\u6001\u7b49\u3002\n\n\u5bfc\u5165\u5b8c\u6210\u540e\u5efa\u8bae\u91cd\u542f\u6296\u97f3\uff0c\u786e\u4fdd\u6240\u6709 Hook \u91cd\u65b0\u8bfb\u53d6\u914d\u7f6e\u3002"

    .line 456
    .line 457
    const-string v3, "\u9009\u62e9\u6587\u4ef6"

    .line 458
    .line 459
    invoke-static {v14, v1, v2, v3, v0}, Lbv1;->Μ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 460
    .line 461
    .line 462
    return-object v15

    .line 463
    :pswitch_c
    move-object/from16 v0, p1

    .line 464
    .line 465
    check-cast v0, La80;

    .line 466
    .line 467
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    new-instance v0, Lit1;

    .line 471
    .line 472
    invoke-direct {v0, v14, v2}, Lit1;-><init>(Landroid/app/Activity;I)V

    .line 473
    .line 474
    .line 475
    const-string v1, "dyhelper_config_"

    .line 476
    .line 477
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    :try_start_5
    invoke-static {}, Lui1;->Α()Z

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    if-nez v2, :cond_4

    .line 485
    .line 486
    invoke-virtual {v14}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    invoke-static {v2}, Lui1;->π(Landroid/content/Context;)V

    .line 494
    .line 495
    .line 496
    goto :goto_6

    .line 497
    :catchall_4
    move-exception v0

    .line 498
    goto :goto_7

    .line 499
    :cond_4
    :goto_6
    invoke-static {}, Lui1;->ζ()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 504
    .line 505
    .line 506
    move-result-wide v3

    .line 507
    new-instance v5, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    const-string v1, ".json"

    .line 516
    .line 517
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    new-instance v3, Landroid/content/Intent;

    .line 525
    .line 526
    const-string v4, "android.intent.action.CREATE_DOCUMENT"

    .line 527
    .line 528
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    const-string v4, "android.intent.category.OPENABLE"

    .line 532
    .line 533
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 534
    .line 535
    .line 536
    const-string v4, "application/json"

    .line 537
    .line 538
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 539
    .line 540
    .line 541
    const-string v4, "android.intent.extra.TITLE"

    .line 542
    .line 543
    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 544
    .line 545
    .line 546
    new-instance v1, Lbt1;

    .line 547
    .line 548
    invoke-direct {v1}, Lbt1;-><init>()V

    .line 549
    .line 550
    .line 551
    iput v12, v1, Lbt1;->ε:I

    .line 552
    .line 553
    iput-object v2, v1, Lbt1;->ζ:Ljava/lang/String;

    .line 554
    .line 555
    iput-object v0, v1, Lbt1;->η:Le80;

    .line 556
    .line 557
    invoke-virtual {v14}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    const-string v2, "dyhelper_config_export"

    .line 566
    .line 567
    invoke-virtual {v0, v1, v2}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 572
    .line 573
    .line 574
    new-instance v0, Landroid/os/Handler;

    .line 575
    .line 576
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 581
    .line 582
    .line 583
    new-instance v2, Lat1;

    .line 584
    .line 585
    invoke-direct {v2, v1, v3, v13}, Lat1;-><init>(Lbt1;Landroid/content/Intent;I)V

    .line 586
    .line 587
    .line 588
    const-wide/16 v3, 0x64

    .line 589
    .line 590
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 591
    .line 592
    .line 593
    goto :goto_8

    .line 594
    :goto_7
    const-string v1, "\u5bfc\u51fa\u7528\u6237\u914d\u7f6e\u5931\u8d25"

    .line 595
    .line 596
    invoke-static {v9, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    new-instance v1, Ljava/lang/StringBuilder;

    .line 604
    .line 605
    const-string v2, "\u5bfc\u51fa\u5931\u8d25: "

    .line 606
    .line 607
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    invoke-static {v14, v0, v13}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 622
    .line 623
    .line 624
    :goto_8
    return-object v15

    .line 625
    :pswitch_d
    iget-object v1, v0, Lg71;->ζ:Landroid/app/Activity;

    .line 626
    .line 627
    move-object/from16 v0, p1

    .line 628
    .line 629
    check-cast v0, La80;

    .line 630
    .line 631
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    sget-object v0, Lbv1;->α:Lbv1;

    .line 635
    .line 636
    const-string v0, "\u6253\u5f00 DyLog \u65e5\u5fd7\u67e5\u770b\u5668\uff0c\u5f53\u524d\u7f13\u5b58\u65e5\u5fd7="

    .line 637
    .line 638
    :try_start_6
    invoke-static {v8, v12, v8}, Lux;->Ε(Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    new-instance v4, Ljava/lang/StringBuilder;

    .line 647
    .line 648
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-static {v9, v0, v8, v2, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    sget-object v0, Lx01;->α:Lx01;

    .line 662
    .line 663
    invoke-virtual {v0, v1}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    const v2, 0x7f0c0024

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0, v2, v8, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    const v3, 0x7f090137

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    if-nez v3, :cond_5

    .line 682
    .line 683
    move-object v3, v2

    .line 684
    :cond_5
    const v4, 0x7f090138

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    check-cast v4, Landroid/widget/TextView;

    .line 692
    .line 693
    const v11, 0x7f09013c

    .line 694
    .line 695
    .line 696
    invoke-virtual {v2, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 697
    .line 698
    .line 699
    move-result-object v11

    .line 700
    check-cast v11, Landroid/widget/TextView;

    .line 701
    .line 702
    const v14, 0x7f090139

    .line 703
    .line 704
    .line 705
    invoke-virtual {v2, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 706
    .line 707
    .line 708
    move-result-object v14

    .line 709
    check-cast v14, Landroid/widget/TextView;

    .line 710
    .line 711
    const v5, 0x7f09013b

    .line 712
    .line 713
    .line 714
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 715
    .line 716
    .line 717
    move-result-object v5

    .line 718
    check-cast v5, Landroid/widget/TextView;

    .line 719
    .line 720
    const v10, 0x7f09012d

    .line 721
    .line 722
    .line 723
    invoke-virtual {v2, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 724
    .line 725
    .line 726
    move-result-object v10

    .line 727
    check-cast v10, Landroid/widget/TextView;

    .line 728
    .line 729
    const v13, 0x7f09012f

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 733
    .line 734
    .line 735
    move-result-object v13

    .line 736
    check-cast v13, Landroid/widget/TextView;

    .line 737
    .line 738
    const v8, 0x7f09012e

    .line 739
    .line 740
    .line 741
    invoke-virtual {v2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 742
    .line 743
    .line 744
    move-result-object v8

    .line 745
    check-cast v8, Landroid/widget/TextView;

    .line 746
    .line 747
    const v6, 0x7f090136

    .line 748
    .line 749
    .line 750
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 751
    .line 752
    .line 753
    move-result-object v6

    .line 754
    check-cast v6, Landroid/widget/ListView;

    .line 755
    .line 756
    const v12, 0x7f09013a

    .line 757
    .line 758
    .line 759
    invoke-virtual {v2, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 760
    .line 761
    .line 762
    move-result-object v12

    .line 763
    check-cast v12, Landroid/widget/TextView;

    .line 764
    .line 765
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    .line 766
    .line 767
    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    .line 768
    .line 769
    .line 770
    move-object/from16 v24, v15

    .line 771
    .line 772
    :try_start_7
    sget-object v15, Lbv1;->δ:Lqu1;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 773
    .line 774
    const-string v20, "theme"

    .line 775
    .line 776
    if-eqz v15, :cond_15

    .line 777
    .line 778
    :try_start_8
    iget-object v15, v15, Lqu1;->β:Ljava/lang/String;

    .line 779
    .line 780
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 781
    .line 782
    .line 783
    move-result v15

    .line 784
    invoke-virtual {v7, v15}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 785
    .line 786
    .line 787
    const/16 v15, 0x12

    .line 788
    .line 789
    invoke-static {v1, v15}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 790
    .line 791
    .line 792
    move-result v15

    .line 793
    int-to-float v15, v15

    .line 794
    invoke-virtual {v7, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 795
    .line 796
    .line 797
    move-object/from16 v25, v9

    .line 798
    .line 799
    const/4 v15, 0x1

    .line 800
    :try_start_9
    invoke-static {v1, v15}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 801
    .line 802
    .line 803
    move-result v9

    .line 804
    sget-object v15, Lbv1;->δ:Lqu1;

    .line 805
    .line 806
    if-eqz v15, :cond_14

    .line 807
    .line 808
    iget-object v15, v15, Lqu1;->φ:Ljava/lang/String;

    .line 809
    .line 810
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 811
    .line 812
    .line 813
    move-result v15

    .line 814
    invoke-virtual {v7, v9, v15}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v3, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 818
    .line 819
    .line 820
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 821
    .line 822
    if-eqz v3, :cond_13

    .line 823
    .line 824
    iget-object v3, v3, Lqu1;->η:Ljava/lang/String;

    .line 825
    .line 826
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 827
    .line 828
    .line 829
    move-result v3

    .line 830
    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 831
    .line 832
    .line 833
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 834
    .line 835
    if-eqz v3, :cond_12

    .line 836
    .line 837
    iget-object v3, v3, Lqu1;->θ:Ljava/lang/String;

    .line 838
    .line 839
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 840
    .line 841
    .line 842
    move-result v3

    .line 843
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 844
    .line 845
    .line 846
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 847
    .line 848
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 849
    .line 850
    .line 851
    sget-object v7, Lbv1;->δ:Lqu1;

    .line 852
    .line 853
    if-eqz v7, :cond_11

    .line 854
    .line 855
    iget-object v7, v7, Lqu1;->δ:Ljava/lang/String;

    .line 856
    .line 857
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 858
    .line 859
    .line 860
    move-result v7

    .line 861
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 862
    .line 863
    .line 864
    const/4 v15, 0x1

    .line 865
    invoke-virtual {v3, v15}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v4, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 869
    .line 870
    .line 871
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 872
    .line 873
    if-eqz v3, :cond_10

    .line 874
    .line 875
    iget-object v3, v3, Lqu1;->μ:Ljava/lang/String;

    .line 876
    .line 877
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 878
    .line 879
    .line 880
    move-result v3

    .line 881
    invoke-virtual {v14, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 882
    .line 883
    .line 884
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 885
    .line 886
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 887
    .line 888
    .line 889
    sget-object v7, Lbv1;->δ:Lqu1;

    .line 890
    .line 891
    if-eqz v7, :cond_f

    .line 892
    .line 893
    iget-object v7, v7, Lqu1;->ν:Ljava/lang/String;

    .line 894
    .line 895
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 896
    .line 897
    .line 898
    move-result v7

    .line 899
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 900
    .line 901
    .line 902
    const/16 v7, 0xa

    .line 903
    .line 904
    invoke-static {v1, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 905
    .line 906
    .line 907
    move-result v7

    .line 908
    int-to-float v7, v7

    .line 909
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v14, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 913
    .line 914
    .line 915
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 916
    .line 917
    if-eqz v3, :cond_e

    .line 918
    .line 919
    iget-object v3, v3, Lqu1;->ι:Ljava/lang/String;

    .line 920
    .line 921
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 922
    .line 923
    .line 924
    move-result v3

    .line 925
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 926
    .line 927
    .line 928
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 929
    .line 930
    if-eqz v3, :cond_d

    .line 931
    .line 932
    iget-object v3, v3, Lqu1;->θ:Ljava/lang/String;

    .line 933
    .line 934
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 939
    .line 940
    .line 941
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 942
    .line 943
    if-eqz v3, :cond_c

    .line 944
    .line 945
    iget-object v3, v3, Lqu1;->δ:Ljava/lang/String;

    .line 946
    .line 947
    invoke-static {v1, v3}, Lbv1;->Ν(Landroid/app/Activity;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 948
    .line 949
    .line 950
    move-result-object v3

    .line 951
    invoke-virtual {v10, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 952
    .line 953
    .line 954
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 955
    .line 956
    if-eqz v3, :cond_b

    .line 957
    .line 958
    iget-object v3, v3, Lqu1;->μ:Ljava/lang/String;

    .line 959
    .line 960
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 961
    .line 962
    .line 963
    move-result v3

    .line 964
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 965
    .line 966
    .line 967
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 968
    .line 969
    if-eqz v3, :cond_a

    .line 970
    .line 971
    iget-object v3, v3, Lqu1;->ν:Ljava/lang/String;

    .line 972
    .line 973
    invoke-static {v1, v3}, Lbv1;->Ν(Landroid/app/Activity;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 974
    .line 975
    .line 976
    move-result-object v3

    .line 977
    invoke-virtual {v13, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 978
    .line 979
    .line 980
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 981
    .line 982
    if-eqz v3, :cond_9

    .line 983
    .line 984
    iget-object v3, v3, Lqu1;->κ:Ljava/lang/String;

    .line 985
    .line 986
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 987
    .line 988
    .line 989
    move-result v3

    .line 990
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 991
    .line 992
    .line 993
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 994
    .line 995
    if-eqz v3, :cond_8

    .line 996
    .line 997
    iget-object v3, v3, Lqu1;->λ:Ljava/lang/String;

    .line 998
    .line 999
    invoke-static {v1, v3}, Lbv1;->Ν(Landroid/app/Activity;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    invoke-virtual {v8, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1004
    .line 1005
    .line 1006
    const/4 v3, 0x0

    .line 1007
    invoke-virtual {v6, v3}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 1008
    .line 1009
    .line 1010
    const/4 v3, 0x0

    .line 1011
    invoke-virtual {v6, v3}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v6, v12}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    .line 1015
    .line 1016
    .line 1017
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 1018
    .line 1019
    if-eqz v3, :cond_7

    .line 1020
    .line 1021
    iget-object v3, v3, Lqu1;->ι:Ljava/lang/String;

    .line 1022
    .line 1023
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1024
    .line 1025
    .line 1026
    move-result v3

    .line 1027
    invoke-virtual {v12, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1028
    .line 1029
    .line 1030
    new-instance v3, Lwu1;

    .line 1031
    .line 1032
    invoke-direct {v3, v0}, Lwu1;-><init>(Landroid/view/LayoutInflater;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v6, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1036
    .line 1037
    .line 1038
    new-instance v0, Lum1;

    .line 1039
    .line 1040
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1041
    .line 1042
    .line 1043
    const-string v7, ""

    .line 1044
    .line 1045
    iput-object v7, v0, Lum1;->ε:Ljava/lang/Object;

    .line 1046
    .line 1047
    new-instance v16, Lpt1;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 1048
    .line 1049
    move-object/from16 v18, v0

    .line 1050
    .line 1051
    move-object/from16 v17, v1

    .line 1052
    .line 1053
    move-object/from16 v19, v3

    .line 1054
    .line 1055
    move-object/from16 v21, v5

    .line 1056
    .line 1057
    move-object/from16 v23, v10

    .line 1058
    .line 1059
    move-object/from16 v22, v12

    .line 1060
    .line 1061
    move-object/from16 v20, v14

    .line 1062
    .line 1063
    :try_start_a
    invoke-direct/range {v16 .. v23}, Lpt1;-><init>(Landroid/app/Activity;Lum1;Lwu1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1064
    .line 1065
    .line 1066
    move-object/from16 v0, v16

    .line 1067
    .line 1068
    move-object/from16 v16, v18

    .line 1069
    .line 1070
    invoke-virtual {v13, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1071
    .line 1072
    .line 1073
    move-object/from16 v18, v16

    .line 1074
    .line 1075
    new-instance v16, Lpt1;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 1076
    .line 1077
    move-object/from16 v26, v18

    .line 1078
    .line 1079
    move-object/from16 v18, v17

    .line 1080
    .line 1081
    move-object/from16 v17, v26

    .line 1082
    .line 1083
    :try_start_b
    invoke-direct/range {v16 .. v23}, Lpt1;-><init>(Lum1;Landroid/app/Activity;Lwu1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 1084
    .line 1085
    .line 1086
    move-object/from16 v3, v16

    .line 1087
    .line 1088
    move-object/from16 v16, v17

    .line 1089
    .line 1090
    move-object/from16 v1, v18

    .line 1091
    .line 1092
    move-object/from16 v0, v19

    .line 1093
    .line 1094
    move-object/from16 v10, v23

    .line 1095
    .line 1096
    :try_start_c
    invoke-virtual {v10, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1097
    .line 1098
    .line 1099
    new-instance v3, Lma0;

    .line 1100
    .line 1101
    const/4 v5, 0x2

    .line 1102
    invoke-direct {v3, v1, v5}, Lma0;-><init>(Landroid/app/Activity;I)V

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v8, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1106
    .line 1107
    .line 1108
    new-instance v3, Lqt1;

    .line 1109
    .line 1110
    invoke-direct {v3, v0, v1}, Lqt1;-><init>(Lwu1;Landroid/app/Activity;)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v6, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1114
    .line 1115
    .line 1116
    const v3, 0x3f666666    # 0.9f

    .line 1117
    .line 1118
    .line 1119
    invoke-static {v4, v3}, Lbv1;->Γ(Landroid/view/View;F)V

    .line 1120
    .line 1121
    .line 1122
    const v3, 0x3f75c28f    # 0.96f

    .line 1123
    .line 1124
    .line 1125
    invoke-static {v10, v3}, Lbv1;->Γ(Landroid/view/View;F)V

    .line 1126
    .line 1127
    .line 1128
    invoke-static {v13, v3}, Lbv1;->Γ(Landroid/view/View;F)V

    .line 1129
    .line 1130
    .line 1131
    invoke-static {v8, v3}, Lbv1;->Γ(Landroid/view/View;F)V

    .line 1132
    .line 1133
    .line 1134
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 1135
    .line 1136
    invoke-direct {v3, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v3

    .line 1143
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v3

    .line 1147
    new-instance v5, Lsa;

    .line 1148
    .line 1149
    const/16 v6, 0x13

    .line 1150
    .line 1151
    invoke-direct {v5, v3, v6}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1155
    .line 1156
    .line 1157
    move-object/from16 v17, v0

    .line 1158
    .line 1159
    move-object/from16 v18, v20

    .line 1160
    .line 1161
    move-object/from16 v19, v21

    .line 1162
    .line 1163
    move-object/from16 v20, v22

    .line 1164
    .line 1165
    move-object/from16 v21, v10

    .line 1166
    .line 1167
    invoke-static/range {v16 .. v21}, Lbv1;->Ξ(Lum1;Lwu1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1168
    .line 1169
    .line 1170
    move-object/from16 v22, v20

    .line 1171
    .line 1172
    move-object/from16 v23, v21

    .line 1173
    .line 1174
    move-object/from16 v20, v18

    .line 1175
    .line 1176
    move-object/from16 v21, v19

    .line 1177
    .line 1178
    move-object/from16 v19, v17

    .line 1179
    .line 1180
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    if-eqz v0, :cond_6

    .line 1188
    .line 1189
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 1190
    .line 1191
    const/4 v4, 0x0

    .line 1192
    invoke-direct {v3, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v0, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v3

    .line 1202
    invoke-virtual {v3, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v3

    .line 1209
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v3

    .line 1213
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1214
    .line 1215
    int-to-float v3, v3

    .line 1216
    const v4, 0x3f70a3d7    # 0.94f

    .line 1217
    .line 1218
    .line 1219
    mul-float/2addr v3, v4

    .line 1220
    float-to-int v3, v3

    .line 1221
    const/4 v4, -0x2

    .line 1222
    invoke-virtual {v0, v3, v4}, Landroid/view/Window;->setLayout(II)V

    .line 1223
    .line 1224
    .line 1225
    :cond_6
    move-object/from16 v17, v16

    .line 1226
    .line 1227
    goto :goto_9

    .line 1228
    :catchall_5
    move-exception v0

    .line 1229
    goto/16 :goto_a

    .line 1230
    .line 1231
    :goto_9
    new-instance v16, Lrt1;

    .line 1232
    .line 1233
    move-object/from16 v10, v23

    .line 1234
    .line 1235
    const/16 v23, 0x0

    .line 1236
    .line 1237
    move-object/from16 v18, v19

    .line 1238
    .line 1239
    move-object/from16 v19, v20

    .line 1240
    .line 1241
    move-object/from16 v20, v21

    .line 1242
    .line 1243
    move-object/from16 v21, v22

    .line 1244
    .line 1245
    move-object/from16 v22, v10

    .line 1246
    .line 1247
    invoke-direct/range {v16 .. v23}, Lrt1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;I)V

    .line 1248
    .line 1249
    .line 1250
    move-object/from16 v0, v16

    .line 1251
    .line 1252
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1253
    .line 1254
    .line 1255
    goto/16 :goto_b

    .line 1256
    .line 1257
    :catchall_6
    move-exception v0

    .line 1258
    move-object/from16 v1, v18

    .line 1259
    .line 1260
    goto :goto_a

    .line 1261
    :catchall_7
    move-exception v0

    .line 1262
    move-object/from16 v1, v17

    .line 1263
    .line 1264
    goto :goto_a

    .line 1265
    :cond_7
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1266
    .line 1267
    .line 1268
    const/16 v16, 0x0

    .line 1269
    .line 1270
    throw v16

    .line 1271
    :cond_8
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1272
    .line 1273
    .line 1274
    const/16 v16, 0x0

    .line 1275
    .line 1276
    throw v16

    .line 1277
    :cond_9
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    const/16 v16, 0x0

    .line 1281
    .line 1282
    throw v16

    .line 1283
    :cond_a
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1284
    .line 1285
    .line 1286
    const/16 v16, 0x0

    .line 1287
    .line 1288
    throw v16

    .line 1289
    :cond_b
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1290
    .line 1291
    .line 1292
    const/16 v16, 0x0

    .line 1293
    .line 1294
    throw v16

    .line 1295
    :cond_c
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    const/16 v16, 0x0

    .line 1299
    .line 1300
    throw v16

    .line 1301
    :cond_d
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    const/16 v16, 0x0

    .line 1305
    .line 1306
    throw v16

    .line 1307
    :cond_e
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1308
    .line 1309
    .line 1310
    const/16 v16, 0x0

    .line 1311
    .line 1312
    throw v16

    .line 1313
    :cond_f
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1314
    .line 1315
    .line 1316
    const/16 v16, 0x0

    .line 1317
    .line 1318
    throw v16

    .line 1319
    :cond_10
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1320
    .line 1321
    .line 1322
    const/16 v16, 0x0

    .line 1323
    .line 1324
    throw v16

    .line 1325
    :cond_11
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1326
    .line 1327
    .line 1328
    const/16 v16, 0x0

    .line 1329
    .line 1330
    throw v16

    .line 1331
    :cond_12
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1332
    .line 1333
    .line 1334
    const/16 v16, 0x0

    .line 1335
    .line 1336
    throw v16

    .line 1337
    :cond_13
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1338
    .line 1339
    .line 1340
    const/16 v16, 0x0

    .line 1341
    .line 1342
    throw v16

    .line 1343
    :cond_14
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1344
    .line 1345
    .line 1346
    const/16 v16, 0x0

    .line 1347
    .line 1348
    throw v16

    .line 1349
    :catchall_8
    move-exception v0

    .line 1350
    move-object/from16 v25, v9

    .line 1351
    .line 1352
    goto :goto_a

    .line 1353
    :cond_15
    move-object/from16 v25, v9

    .line 1354
    .line 1355
    invoke-static/range {v20 .. v20}, Lln0;->и(Ljava/lang/String;)V

    .line 1356
    .line 1357
    .line 1358
    const/16 v16, 0x0

    .line 1359
    .line 1360
    throw v16
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 1361
    :catchall_9
    move-exception v0

    .line 1362
    move-object/from16 v25, v9

    .line 1363
    .line 1364
    move-object/from16 v24, v15

    .line 1365
    .line 1366
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v2

    .line 1370
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1371
    .line 1372
    const-string v4, "\u6253\u5f00 DyLog \u65e5\u5fd7\u67e5\u770b\u5668\u5931\u8d25: "

    .line 1373
    .line 1374
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v2

    .line 1384
    move-object/from16 v3, v25

    .line 1385
    .line 1386
    invoke-static {v3, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1387
    .line 1388
    .line 1389
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v0

    .line 1393
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1394
    .line 1395
    const-string v3, "\u6253\u5f00\u65e5\u5fd7\u5931\u8d25: "

    .line 1396
    .line 1397
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    const/4 v3, 0x0

    .line 1408
    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1413
    .line 1414
    .line 1415
    :goto_b
    return-object v24

    .line 1416
    :pswitch_e
    move-object/from16 v24, v15

    .line 1417
    .line 1418
    move-object/from16 v0, p1

    .line 1419
    .line 1420
    check-cast v0, La80;

    .line 1421
    .line 1422
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1423
    .line 1424
    .line 1425
    sget-object v0, Lbv1;->α:Lbv1;

    .line 1426
    .line 1427
    new-instance v0, Le71;

    .line 1428
    .line 1429
    const/16 v15, 0x12

    .line 1430
    .line 1431
    invoke-direct {v0, v14, v15}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 1432
    .line 1433
    .line 1434
    const-string v1, "\u786e\u8ba4\u6e05\u9664"

    .line 1435
    .line 1436
    const-string v2, "\u786e\u5b9a\u8981\u6e05\u9664 DexKit \u7f13\u5b58\u5417\uff1f\n\n\u6e05\u9664\u540e\u4e0b\u6b21\u542f\u52a8\u4f1a\u91cd\u65b0\u8fdb\u884c DexKit \u9002\u914d\uff0c\u53ef\u80fd\u9700\u8981\u8f83\u957f\u65f6\u95f4\u3002"

    .line 1437
    .line 1438
    const-string v3, "\u6e05\u9664"

    .line 1439
    .line 1440
    invoke-static {v14, v1, v2, v3, v0}, Lbv1;->Μ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 1441
    .line 1442
    .line 1443
    return-object v24

    .line 1444
    :pswitch_f
    move-object/from16 v24, v15

    .line 1445
    .line 1446
    move-object/from16 v0, p1

    .line 1447
    .line 1448
    check-cast v0, La80;

    .line 1449
    .line 1450
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1451
    .line 1452
    .line 1453
    sget-object v1, Lhk0;->α:Lym1;

    .line 1454
    .line 1455
    const-string v1, "im_time_label_dark_color"

    .line 1456
    .line 1457
    const-string v2, "#FFFFFF"

    .line 1458
    .line 1459
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v1

    .line 1463
    invoke-static {v1, v2}, Lhk0;->γ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1468
    .line 1469
    .line 1470
    move-result v1

    .line 1471
    new-instance v2, Lhu;

    .line 1472
    .line 1473
    invoke-direct {v2, v0, v14, v4}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 1474
    .line 1475
    .line 1476
    const-string v0, "\u8bbe\u7f6e\u6df1\u8272\u6a21\u5f0f\u6807\u7b7e\u989c\u8272"

    .line 1477
    .line 1478
    const/4 v3, 0x0

    .line 1479
    invoke-static {v14, v0, v1, v3, v2}, Lcom/example/dyhelper/ui/μ;->δ(Landroid/content/Context;Ljava/lang/String;IZLa80;)V

    .line 1480
    .line 1481
    .line 1482
    return-object v24

    .line 1483
    :pswitch_10
    move-object/from16 v24, v15

    .line 1484
    .line 1485
    move-object/from16 v0, p1

    .line 1486
    .line 1487
    check-cast v0, La80;

    .line 1488
    .line 1489
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1490
    .line 1491
    .line 1492
    sget-object v1, Lhk0;->α:Lym1;

    .line 1493
    .line 1494
    const-string v1, "im_time_label_light_color"

    .line 1495
    .line 1496
    const-string v2, "#000000"

    .line 1497
    .line 1498
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v1

    .line 1502
    invoke-static {v1, v2}, Lhk0;->γ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v1

    .line 1506
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1507
    .line 1508
    .line 1509
    move-result v1

    .line 1510
    new-instance v2, Lhu;

    .line 1511
    .line 1512
    const/16 v15, 0x12

    .line 1513
    .line 1514
    invoke-direct {v2, v0, v14, v15}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 1515
    .line 1516
    .line 1517
    const-string v0, "\u8bbe\u7f6e\u6d45\u8272\u6a21\u5f0f\u6807\u7b7e\u989c\u8272"

    .line 1518
    .line 1519
    const/4 v3, 0x0

    .line 1520
    invoke-static {v14, v0, v1, v3, v2}, Lcom/example/dyhelper/ui/μ;->δ(Landroid/content/Context;Ljava/lang/String;IZLa80;)V

    .line 1521
    .line 1522
    .line 1523
    return-object v24

    .line 1524
    :pswitch_11
    move-object/from16 v24, v15

    .line 1525
    .line 1526
    move-object/from16 v1, p1

    .line 1527
    .line 1528
    check-cast v1, La80;

    .line 1529
    .line 1530
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1531
    .line 1532
    .line 1533
    const-string v2, "im_time_label_format"

    .line 1534
    .line 1535
    const-string v3, "yyyy-MM-dd HH:mm:ss"

    .line 1536
    .line 1537
    invoke-static {v2, v3}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v6

    .line 1541
    const-string v2, "im_time_label_text"

    .line 1542
    .line 1543
    const-string v3, "{time}"

    .line 1544
    .line 1545
    invoke-static {v2, v3}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v7

    .line 1549
    new-instance v8, Lhu;

    .line 1550
    .line 1551
    const/16 v2, 0x16

    .line 1552
    .line 1553
    iget-object v5, v0, Lg71;->ζ:Landroid/app/Activity;

    .line 1554
    .line 1555
    invoke-direct {v8, v1, v5, v2}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 1556
    .line 1557
    .line 1558
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1559
    .line 1560
    .line 1561
    new-instance v4, Lvg0;

    .line 1562
    .line 1563
    const/4 v9, 0x1

    .line 1564
    invoke-direct/range {v4 .. v9}, Lvg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v5, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1568
    .line 1569
    .line 1570
    return-object v24

    .line 1571
    :pswitch_12
    move-object/from16 v24, v15

    .line 1572
    .line 1573
    move-object/from16 v0, p1

    .line 1574
    .line 1575
    check-cast v0, La80;

    .line 1576
    .line 1577
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1578
    .line 1579
    .line 1580
    invoke-static {v14}, Lpd2;->Τ(Landroid/app/Activity;)V

    .line 1581
    .line 1582
    .line 1583
    return-object v24

    .line 1584
    :pswitch_13
    move-object/from16 v0, p1

    .line 1585
    .line 1586
    check-cast v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 1587
    .line 1588
    invoke-static {v14, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->γ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Ls62;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    return-object v0

    .line 1593
    :pswitch_14
    move-object/from16 v16, v8

    .line 1594
    .line 1595
    move-object v3, v9

    .line 1596
    move-object/from16 v1, p1

    .line 1597
    .line 1598
    check-cast v1, Ljava/util/List;

    .line 1599
    .line 1600
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1601
    .line 1602
    .line 1603
    new-instance v6, Ljava/util/ArrayList;

    .line 1604
    .line 1605
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1606
    .line 1607
    .line 1608
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v1

    .line 1612
    :cond_16
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1613
    .line 1614
    .line 1615
    move-result v2

    .line 1616
    if-eqz v2, :cond_18

    .line 1617
    .line 1618
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v2

    .line 1622
    check-cast v2, Lzy0;

    .line 1623
    .line 1624
    iget-object v2, v2, Lzy0;->κ:Ljava/lang/Object;

    .line 1625
    .line 1626
    instance-of v4, v2, Lf8;

    .line 1627
    .line 1628
    if-eqz v4, :cond_17

    .line 1629
    .line 1630
    check-cast v2, Lf8;

    .line 1631
    .line 1632
    goto :goto_d

    .line 1633
    :cond_17
    move-object/from16 v2, v16

    .line 1634
    .line 1635
    :goto_d
    if-eqz v2, :cond_16

    .line 1636
    .line 1637
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1638
    .line 1639
    .line 1640
    goto :goto_c

    .line 1641
    :cond_18
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1642
    .line 1643
    .line 1644
    move-result v1

    .line 1645
    iget-object v7, v0, Lg71;->ζ:Landroid/app/Activity;

    .line 1646
    .line 1647
    if-eqz v1, :cond_19

    .line 1648
    .line 1649
    const-string v0, "\u8bf7\u5148\u52fe\u9009\u8981\u4e0b\u8f7d\u7684\u4f5c\u54c1"

    .line 1650
    .line 1651
    const/4 v3, 0x0

    .line 1652
    invoke-static {v7, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v0

    .line 1656
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1657
    .line 1658
    .line 1659
    const/4 v12, 0x0

    .line 1660
    goto :goto_f

    .line 1661
    :cond_19
    sget-object v0, Lqy0;->α:Lqy0;

    .line 1662
    .line 1663
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1664
    .line 1665
    .line 1666
    invoke-static {v7}, Lyh;->у(Landroid/content/Context;)Liu;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v1

    .line 1670
    iget-object v2, v1, Liu;->β:Ljava/lang/String;

    .line 1671
    .line 1672
    if-eqz v2, :cond_1b

    .line 1673
    .line 1674
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v2

    .line 1678
    if-eqz v2, :cond_1a

    .line 1679
    .line 1680
    goto :goto_e

    .line 1681
    :cond_1a
    invoke-virtual {v1}, Liu;->α()Z

    .line 1682
    .line 1683
    .line 1684
    move-result v1

    .line 1685
    if-nez v1, :cond_1b

    .line 1686
    .line 1687
    const-string v1, "[DOWNLOAD-STORAGE] \u5f53\u524d\u7a7a\u95f4\u65e0\u53ef\u7528 SAF \u6388\u6743\uff0c\u6539\u7528 MediaStore"

    .line 1688
    .line 1689
    invoke-static {v3, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1690
    .line 1691
    .line 1692
    :cond_1b
    :goto_e
    invoke-static {v7}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v0}, Lqy0;->ж()I

    .line 1696
    .line 1697
    .line 1698
    move-result v11

    .line 1699
    const-string v0, "notification"

    .line 1700
    .line 1701
    invoke-virtual {v7, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v0

    .line 1705
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1706
    .line 1707
    .line 1708
    move-object v10, v0

    .line 1709
    check-cast v10, Landroid/app/NotificationManager;

    .line 1710
    .line 1711
    invoke-static {v7}, Lqy0;->А(Landroid/content/Context;)Z

    .line 1712
    .line 1713
    .line 1714
    move-result v9

    .line 1715
    new-instance v8, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1716
    .line 1717
    const/4 v3, 0x0

    .line 1718
    invoke-direct {v8, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 1719
    .line 1720
    .line 1721
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1722
    .line 1723
    .line 1724
    move-result v5

    .line 1725
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1726
    .line 1727
    const-string v1, "\u5171 "

    .line 1728
    .line 1729
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1730
    .line 1731
    .line 1732
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1733
    .line 1734
    .line 1735
    const-string v1, " \u4e2a\u4f5c\u54c1\uff0c\u51c6\u5907\u4e2d..."

    .line 1736
    .line 1737
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v0

    .line 1744
    const-string v1, "\u6279\u91cf\u4e0b\u8f7d"

    .line 1745
    .line 1746
    invoke-static {v7, v1, v0}, Lqy0;->б(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1747
    .line 1748
    .line 1749
    sget-object v0, Lqy0;->δ:Ljava/util/concurrent/ExecutorService;

    .line 1750
    .line 1751
    new-instance v4, Lcy0;

    .line 1752
    .line 1753
    invoke-direct/range {v4 .. v11}, Lcy0;-><init>(ILjava/util/ArrayList;Landroid/app/Activity;Ljava/util/concurrent/atomic/AtomicInteger;ZLandroid/app/NotificationManager;I)V

    .line 1754
    .line 1755
    .line 1756
    invoke-interface {v0, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1757
    .line 1758
    .line 1759
    const/4 v12, 0x1

    .line 1760
    :goto_f
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v0

    .line 1764
    return-object v0

    .line 1765
    :pswitch_15
    move-object/from16 v24, v15

    .line 1766
    .line 1767
    move-object/from16 v0, p1

    .line 1768
    .line 1769
    check-cast v0, Lmg1;

    .line 1770
    .line 1771
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1772
    .line 1773
    .line 1774
    iget-object v0, v0, Lmg1;->θ:Ljava/lang/String;

    .line 1775
    .line 1776
    const/4 v15, 0x1

    .line 1777
    invoke-static {v14, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v0

    .line 1781
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1782
    .line 1783
    .line 1784
    return-object v24

    .line 1785
    :pswitch_16
    move-object/from16 v24, v15

    .line 1786
    .line 1787
    move-object/from16 v0, p1

    .line 1788
    .line 1789
    check-cast v0, Lf8;

    .line 1790
    .line 1791
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1792
    .line 1793
    .line 1794
    sget-object v1, Lqy0;->α:Lqy0;

    .line 1795
    .line 1796
    invoke-static {v0, v14}, Lqy0;->Б(Lf8;Landroid/app/Activity;)V

    .line 1797
    .line 1798
    .line 1799
    return-object v24

    .line 1800
    :pswitch_17
    move-object/from16 v16, v8

    .line 1801
    .line 1802
    move-object/from16 v24, v15

    .line 1803
    .line 1804
    move-object/from16 v0, p1

    .line 1805
    .line 1806
    check-cast v0, Lf8;

    .line 1807
    .line 1808
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1809
    .line 1810
    .line 1811
    sget-object v1, Lqy0;->α:Lqy0;

    .line 1812
    .line 1813
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1814
    .line 1815
    .line 1816
    iget-object v1, v0, Lf8;->η:Ljava/lang/String;

    .line 1817
    .line 1818
    if-nez v1, :cond_1e

    .line 1819
    .line 1820
    invoke-virtual {v0}, Lf8;->ζ()Ljava/lang/String;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v1

    .line 1824
    if-nez v1, :cond_1e

    .line 1825
    .line 1826
    invoke-virtual {v0}, Lf8;->η()Ljava/lang/String;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v1

    .line 1830
    if-nez v1, :cond_1e

    .line 1831
    .line 1832
    invoke-virtual {v0}, Lf8;->ε()Ljava/lang/String;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v1

    .line 1836
    if-nez v1, :cond_1e

    .line 1837
    .line 1838
    iget-object v1, v0, Lf8;->δ:Ljava/util/List;

    .line 1839
    .line 1840
    if-eqz v1, :cond_1c

    .line 1841
    .line 1842
    invoke-static {v1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v1

    .line 1846
    move-object v8, v1

    .line 1847
    check-cast v8, Ljava/lang/String;

    .line 1848
    .line 1849
    goto :goto_10

    .line 1850
    :cond_1c
    move-object/from16 v8, v16

    .line 1851
    .line 1852
    :goto_10
    if-nez v8, :cond_1d

    .line 1853
    .line 1854
    invoke-virtual {v0}, Lf8;->δ()Ljava/lang/String;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v1

    .line 1858
    if-nez v1, :cond_1e

    .line 1859
    .line 1860
    const-string v1, "\u65e0\u94fe\u63a5"

    .line 1861
    .line 1862
    goto :goto_11

    .line 1863
    :cond_1d
    move-object v1, v8

    .line 1864
    :cond_1e
    :goto_11
    new-instance v0, Lxx0;

    .line 1865
    .line 1866
    const/4 v2, 0x3

    .line 1867
    invoke-direct {v0, v14, v1, v2}, Lxx0;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 1868
    .line 1869
    .line 1870
    invoke-virtual {v14, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1871
    .line 1872
    .line 1873
    return-object v24

    .line 1874
    :pswitch_18
    move-object/from16 v24, v15

    .line 1875
    .line 1876
    move-object/from16 v0, p1

    .line 1877
    .line 1878
    check-cast v0, Lf8;

    .line 1879
    .line 1880
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1881
    .line 1882
    .line 1883
    sget-object v1, Ldl0;->α:Landroid/os/Handler;

    .line 1884
    .line 1885
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1886
    .line 1887
    .line 1888
    new-instance v1, Lzk0;

    .line 1889
    .line 1890
    const/4 v3, 0x0

    .line 1891
    invoke-direct {v1, v14, v0, v3}, Lzk0;-><init>(Landroid/app/Activity;Lf8;I)V

    .line 1892
    .line 1893
    .line 1894
    invoke-virtual {v14, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1895
    .line 1896
    .line 1897
    return-object v24

    .line 1898
    :pswitch_19
    move-object/from16 v24, v15

    .line 1899
    .line 1900
    move-object/from16 v0, p1

    .line 1901
    .line 1902
    check-cast v0, Lf8;

    .line 1903
    .line 1904
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1905
    .line 1906
    .line 1907
    sget-object v3, Lqy0;->α:Lqy0;

    .line 1908
    .line 1909
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1910
    .line 1911
    .line 1912
    iget-object v1, v0, Lf8;->ζ:Lh8;

    .line 1913
    .line 1914
    sget-object v2, Lh8;->η:Lh8;

    .line 1915
    .line 1916
    if-eq v1, v2, :cond_24

    .line 1917
    .line 1918
    invoke-virtual {v0}, Lf8;->λ()Z

    .line 1919
    .line 1920
    .line 1921
    move-result v1

    .line 1922
    if-nez v1, :cond_24

    .line 1923
    .line 1924
    invoke-virtual {v0}, Lf8;->μ()Z

    .line 1925
    .line 1926
    .line 1927
    move-result v1

    .line 1928
    if-eqz v1, :cond_1f

    .line 1929
    .line 1930
    goto/16 :goto_14

    .line 1931
    .line 1932
    :cond_1f
    invoke-virtual {v0}, Lf8;->ν()Z

    .line 1933
    .line 1934
    .line 1935
    move-result v1

    .line 1936
    sget-object v2, Ljz;->ε:Ljz;

    .line 1937
    .line 1938
    if-eqz v1, :cond_21

    .line 1939
    .line 1940
    invoke-virtual {v0}, Lf8;->η()Ljava/lang/String;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v1

    .line 1944
    invoke-static {v1}, Lyh;->в(Ljava/lang/Object;)Ljava/util/List;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v1

    .line 1948
    iget-object v0, v0, Lf8;->γ:Ljava/util/List;

    .line 1949
    .line 1950
    if-nez v0, :cond_20

    .line 1951
    .line 1952
    goto :goto_12

    .line 1953
    :cond_20
    move-object v2, v0

    .line 1954
    :goto_12
    new-instance v0, Luh0;

    .line 1955
    .line 1956
    const/16 v4, 0x14

    .line 1957
    .line 1958
    invoke-direct {v0, v4}, Luh0;-><init>(I)V

    .line 1959
    .line 1960
    .line 1961
    invoke-static {v2, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v0

    .line 1965
    invoke-static {v1, v0}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v0

    .line 1969
    new-instance v1, Lf7;

    .line 1970
    .line 1971
    const/4 v15, 0x1

    .line 1972
    invoke-direct {v1, v15, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1973
    .line 1974
    .line 1975
    sget-object v0, Loy0;->ε:Loy0;

    .line 1976
    .line 1977
    new-instance v2, Lt52;

    .line 1978
    .line 1979
    invoke-direct {v2, v1, v0}, Lt52;-><init>(Lss1;La80;)V

    .line 1980
    .line 1981
    .line 1982
    new-instance v0, Lsv0;

    .line 1983
    .line 1984
    invoke-direct {v0, v11}, Lsv0;-><init>(I)V

    .line 1985
    .line 1986
    .line 1987
    new-instance v9, Ly30;

    .line 1988
    .line 1989
    invoke-direct {v9, v2, v15, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1990
    .line 1991
    .line 1992
    new-instance v1, Lny0;

    .line 1993
    .line 1994
    const/4 v7, 0x0

    .line 1995
    const/4 v8, 0x1

    .line 1996
    const/4 v2, 0x1

    .line 1997
    const-class v4, Lqy0;

    .line 1998
    .line 1999
    const-string v5, "isBadVideoUrlForMp4Download"

    .line 2000
    .line 2001
    const-string v6, "isBadVideoUrlForMp4Download(Ljava/lang/String;)Z"

    .line 2002
    .line 2003
    invoke-direct/range {v1 .. v8}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 2004
    .line 2005
    .line 2006
    new-instance v0, Ly30;

    .line 2007
    .line 2008
    const/4 v4, 0x0

    .line 2009
    invoke-direct {v0, v9, v4, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 2010
    .line 2011
    .line 2012
    new-instance v15, Lny0;

    .line 2013
    .line 2014
    const/16 v21, 0x0

    .line 2015
    .line 2016
    const/16 v22, 0x2

    .line 2017
    .line 2018
    const/16 v16, 0x1

    .line 2019
    .line 2020
    sget-object v17, Lpu0;->α:Lpu0;

    .line 2021
    .line 2022
    const-class v18, Lpu0;

    .line 2023
    .line 2024
    const-string v19, "isWatermarkVideoUrl"

    .line 2025
    .line 2026
    const-string v20, "isWatermarkVideoUrl(Ljava/lang/String;)Z"

    .line 2027
    .line 2028
    invoke-direct/range {v15 .. v22}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 2029
    .line 2030
    .line 2031
    new-instance v9, Ly30;

    .line 2032
    .line 2033
    invoke-direct {v9, v0, v4, v15}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 2034
    .line 2035
    .line 2036
    new-instance v1, Lny0;

    .line 2037
    .line 2038
    const/4 v8, 0x3

    .line 2039
    const-class v4, Lqy0;

    .line 2040
    .line 2041
    const-string v5, "normalizeAssetUrl"

    .line 2042
    .line 2043
    const-string v6, "normalizeAssetUrl(Ljava/lang/String;)Ljava/lang/String;"

    .line 2044
    .line 2045
    invoke-direct/range {v1 .. v8}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 2046
    .line 2047
    .line 2048
    new-instance v0, Lt52;

    .line 2049
    .line 2050
    invoke-direct {v0, v9, v1}, Lt52;-><init>(Lss1;La80;)V

    .line 2051
    .line 2052
    .line 2053
    invoke-static {v0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v0

    .line 2057
    check-cast v0, Ljava/lang/String;

    .line 2058
    .line 2059
    goto :goto_15

    .line 2060
    :cond_21
    invoke-static {v0}, Lqy0;->В(Lf8;)Ljava/util/List;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v1

    .line 2064
    if-nez v1, :cond_23

    .line 2065
    .line 2066
    iget-object v0, v0, Lf8;->δ:Ljava/util/List;

    .line 2067
    .line 2068
    if-nez v0, :cond_22

    .line 2069
    .line 2070
    goto :goto_13

    .line 2071
    :cond_22
    move-object v2, v0

    .line 2072
    goto :goto_13

    .line 2073
    :cond_23
    move-object v2, v1

    .line 2074
    :goto_13
    new-instance v0, Lf7;

    .line 2075
    .line 2076
    const/4 v15, 0x1

    .line 2077
    invoke-direct {v0, v15, v2}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 2078
    .line 2079
    .line 2080
    sget-object v1, Lpy0;->ε:Lpy0;

    .line 2081
    .line 2082
    new-instance v2, Lt52;

    .line 2083
    .line 2084
    invoke-direct {v2, v0, v1}, Lt52;-><init>(Lss1;La80;)V

    .line 2085
    .line 2086
    .line 2087
    new-instance v0, Lsv0;

    .line 2088
    .line 2089
    const/16 v1, 0x8

    .line 2090
    .line 2091
    invoke-direct {v0, v1}, Lsv0;-><init>(I)V

    .line 2092
    .line 2093
    .line 2094
    new-instance v9, Ly30;

    .line 2095
    .line 2096
    invoke-direct {v9, v2, v15, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 2097
    .line 2098
    .line 2099
    new-instance v1, Lny0;

    .line 2100
    .line 2101
    const/4 v7, 0x0

    .line 2102
    const/4 v8, 0x4

    .line 2103
    const/4 v2, 0x1

    .line 2104
    const-class v4, Lqy0;

    .line 2105
    .line 2106
    const-string v5, "normalizeAssetUrl"

    .line 2107
    .line 2108
    const-string v6, "normalizeAssetUrl(Ljava/lang/String;)Ljava/lang/String;"

    .line 2109
    .line 2110
    invoke-direct/range {v1 .. v8}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 2111
    .line 2112
    .line 2113
    new-instance v0, Lt52;

    .line 2114
    .line 2115
    invoke-direct {v0, v9, v1}, Lt52;-><init>(Lss1;La80;)V

    .line 2116
    .line 2117
    .line 2118
    invoke-static {v0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v0

    .line 2122
    check-cast v0, Ljava/lang/String;

    .line 2123
    .line 2124
    goto :goto_15

    .line 2125
    :cond_24
    :goto_14
    invoke-static {}, Lqy0;->г()Llu;

    .line 2126
    .line 2127
    .line 2128
    move-result-object v1

    .line 2129
    invoke-static {v0, v1}, Lkn0;->π(Lf8;Llu;)Ljava/util/List;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v1

    .line 2133
    invoke-static {v1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v1

    .line 2137
    check-cast v1, Ljava/lang/String;

    .line 2138
    .line 2139
    if-nez v1, :cond_25

    .line 2140
    .line 2141
    invoke-static {v0}, Lqy0;->θ(Lf8;)Ljava/util/List;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v0

    .line 2145
    invoke-static {v0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v0

    .line 2149
    check-cast v0, Ljava/lang/String;

    .line 2150
    .line 2151
    goto :goto_15

    .line 2152
    :cond_25
    move-object v0, v1

    .line 2153
    :goto_15
    new-instance v1, Lxx0;

    .line 2154
    .line 2155
    const/4 v5, 0x2

    .line 2156
    invoke-direct {v1, v0, v14, v5}, Lxx0;-><init>(Ljava/lang/String;Landroid/app/Activity;I)V

    .line 2157
    .line 2158
    .line 2159
    invoke-virtual {v14, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 2160
    .line 2161
    .line 2162
    return-object v24

    .line 2163
    :pswitch_1a
    move-object/from16 v24, v15

    .line 2164
    .line 2165
    move v15, v12

    .line 2166
    move-object/from16 v0, p1

    .line 2167
    .line 2168
    check-cast v0, Lte1;

    .line 2169
    .line 2170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2171
    .line 2172
    .line 2173
    iget-object v1, v0, Lte1;->ε:Ljava/lang/String;

    .line 2174
    .line 2175
    iget v0, v0, Lte1;->δ:I

    .line 2176
    .line 2177
    if-nez v0, :cond_26

    .line 2178
    .line 2179
    const/4 v12, 0x0

    .line 2180
    goto :goto_16

    .line 2181
    :cond_26
    move v12, v15

    .line 2182
    :goto_16
    invoke-static {v14, v1, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v0

    .line 2186
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2187
    .line 2188
    .line 2189
    return-object v24

    .line 2190
    :pswitch_1b
    move-object/from16 v24, v15

    .line 2191
    .line 2192
    move-object/from16 v0, p1

    .line 2193
    .line 2194
    check-cast v0, Lf8;

    .line 2195
    .line 2196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2197
    .line 2198
    .line 2199
    sget-object v1, Lqy0;->α:Lqy0;

    .line 2200
    .line 2201
    invoke-static {v0, v14}, Lqy0;->Б(Lf8;Landroid/app/Activity;)V

    .line 2202
    .line 2203
    .line 2204
    return-object v24

    .line 2205
    :pswitch_1c
    move-object/from16 v24, v15

    .line 2206
    .line 2207
    move-object/from16 v0, p1

    .line 2208
    .line 2209
    check-cast v0, Lf8;

    .line 2210
    .line 2211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2212
    .line 2213
    .line 2214
    iget-object v0, v0, Lf8;->β:Ljava/lang/String;

    .line 2215
    .line 2216
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v0

    .line 2220
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v0

    .line 2224
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2225
    .line 2226
    .line 2227
    move-result v1

    .line 2228
    if-nez v1, :cond_28

    .line 2229
    .line 2230
    const-string v1, "\u65e0\u63cf\u8ff0"

    .line 2231
    .line 2232
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2233
    .line 2234
    .line 2235
    move-result v1

    .line 2236
    if-nez v1, :cond_28

    .line 2237
    .line 2238
    const-string v1, "\u672a\u77e5"

    .line 2239
    .line 2240
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2241
    .line 2242
    .line 2243
    move-result v1

    .line 2244
    if-eqz v1, :cond_27

    .line 2245
    .line 2246
    goto :goto_17

    .line 2247
    :cond_27
    sget-object v1, Lq71;->α:Lq71;

    .line 2248
    .line 2249
    const-string v1, "\u6587\u6848\u5df2\u590d\u5236"

    .line 2250
    .line 2251
    invoke-static {v14, v0, v1}, Lq71;->κ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 2252
    .line 2253
    .line 2254
    goto :goto_18

    .line 2255
    :cond_28
    :goto_17
    const-string v0, "\u5f53\u524d\u4f5c\u54c1\u6ca1\u6709\u53ef\u590d\u5236\u6587\u6848"

    .line 2256
    .line 2257
    const/4 v3, 0x0

    .line 2258
    invoke-static {v14, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v0

    .line 2262
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2263
    .line 2264
    .line 2265
    :goto_18
    return-object v24

    .line 2266
    nop

    .line 2267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
