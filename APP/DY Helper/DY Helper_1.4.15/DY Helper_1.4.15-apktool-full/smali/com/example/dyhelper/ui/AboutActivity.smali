.class public final Lcom/example/dyhelper/ui/AboutActivity;
.super Landroid/app/Activity;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic ζ:I


# instance fields
.field public final ε:Lh22;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lη;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lh22;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lh22;-><init>(Lp70;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lcom/example/dyhelper/ui/AboutActivity;->ε:Lh22;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 76

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v9

    .line 9
    const/4 v1, 0x4

    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v10

    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x6

    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v11

    .line 25
    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/high16 v3, -0x80000000

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/view/Window;->addFlags(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v4, "#FAFAFA"

    .line 42
    .line 43
    const-string v5, "#121212"

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    :goto_0
    invoke-virtual {v2, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const/16 v3, 0x2000

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 72
    .line 73
    .line 74
    :cond_1
    const/16 v2, 0x28

    .line 75
    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    const/16 v2, 0xe

    .line 81
    .line 82
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    const/16 v2, 0x12

    .line 87
    .line 88
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    const/16 v2, 0x8

    .line 93
    .line 94
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v15

    .line 98
    const/16 v2, 0xc

    .line 99
    .line 100
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const/4 v3, 0x2

    .line 105
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    const/16 v7, 0x18

    .line 110
    .line 111
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    const/16 v8, 0x10

    .line 116
    .line 117
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const/16 v16, 0x1

    .line 122
    .line 123
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 128
    .line 129
    .line 130
    move-result v17

    .line 131
    if-eqz v17, :cond_2

    .line 132
    .line 133
    move-object v4, v5

    .line 134
    :cond_2
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    const-string v17, "#FFFFFF"

    .line 139
    .line 140
    if-eqz v5, :cond_3

    .line 141
    .line 142
    const-string v5, "#1E1E1E"

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_3
    move-object/from16 v5, v17

    .line 146
    .line 147
    :goto_1
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 148
    .line 149
    .line 150
    move-result v18

    .line 151
    if-eqz v18, :cond_4

    .line 152
    .line 153
    const-string v18, "#2A2A2A"

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    const-string v18, "#F5F5F7"

    .line 157
    .line 158
    :goto_2
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 159
    .line 160
    .line 161
    move-result v19

    .line 162
    const-string v20, "#1A1A2E"

    .line 163
    .line 164
    if-eqz v19, :cond_5

    .line 165
    .line 166
    move-object/from16 v19, v4

    .line 167
    .line 168
    move-object/from16 v4, v17

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_5
    move-object/from16 v19, v4

    .line 172
    .line 173
    move-object/from16 v4, v20

    .line 174
    .line 175
    :goto_3
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 176
    .line 177
    .line 178
    move-result v21

    .line 179
    if-eqz v21, :cond_6

    .line 180
    .line 181
    const-string v21, "#E0E0E0"

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_6
    const-string v21, "#3D3D5C"

    .line 185
    .line 186
    :goto_4
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 187
    .line 188
    .line 189
    move-result v22

    .line 190
    if-eqz v22, :cond_7

    .line 191
    .line 192
    const-string v22, "#888888"

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_7
    const-string v22, "#9E9EB8"

    .line 196
    .line 197
    :goto_5
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 198
    .line 199
    .line 200
    move-result v23

    .line 201
    if-eqz v23, :cond_8

    .line 202
    .line 203
    const-string v23, "#33FE2C55"

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_8
    const-string v23, "#1AFE2C55"

    .line 207
    .line 208
    :goto_6
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 209
    .line 210
    .line 211
    move-result v24

    .line 212
    if-eqz v24, :cond_9

    .line 213
    .line 214
    const-string v24, "#333333"

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_9
    const-string v24, "#E8E8ED"

    .line 218
    .line 219
    :goto_7
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 220
    .line 221
    .line 222
    move-result v25

    .line 223
    const-string v26, "#12000000"

    .line 224
    .line 225
    const-string v27, "#2AFFFFFF"

    .line 226
    .line 227
    if-eqz v25, :cond_a

    .line 228
    .line 229
    move-object/from16 v25, v27

    .line 230
    .line 231
    :goto_8
    move-object/from16 v28, v5

    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_a
    move-object/from16 v25, v26

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :goto_9
    new-instance v5, Landroid/widget/LinearLayout;

    .line 238
    .line 239
    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 240
    .line 241
    .line 242
    move-object/from16 v29, v10

    .line 243
    .line 244
    move/from16 v10, v16

    .line 245
    .line 246
    invoke-virtual {v5, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 247
    .line 248
    .line 249
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    invoke-virtual {v5, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 254
    .line 255
    .line 256
    new-instance v10, Landroid/view/ViewGroup$LayoutParams;

    .line 257
    .line 258
    move-object/from16 v30, v9

    .line 259
    .line 260
    const/4 v9, -0x1

    .line 261
    invoke-direct {v10, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 265
    .line 266
    .line 267
    new-instance v10, Landroid/widget/LinearLayout;

    .line 268
    .line 269
    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 270
    .line 271
    .line 272
    const/4 v9, 0x0

    .line 273
    invoke-virtual {v10, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 274
    .line 275
    .line 276
    const/16 v9, 0x10

    .line 277
    .line 278
    invoke-virtual {v10, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    invoke-interface {v9, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    check-cast v9, Ljava/lang/Number;

    .line 290
    .line 291
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    move-object/from16 v31, v1

    .line 296
    .line 297
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-interface {v1, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    check-cast v1, Ljava/lang/Number;

    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    move-object/from16 v32, v13

    .line 312
    .line 313
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    invoke-interface {v13, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v13

    .line 321
    check-cast v13, Ljava/lang/Number;

    .line 322
    .line 323
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 324
    .line 325
    .line 326
    move-result v13

    .line 327
    move-object/from16 v33, v11

    .line 328
    .line 329
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 330
    .line 331
    .line 332
    move-result-object v11

    .line 333
    invoke-interface {v11, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    check-cast v11, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v11

    .line 343
    invoke-virtual {v10, v9, v1, v13, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 344
    .line 345
    .line 346
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    invoke-virtual {v10, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-interface {v1, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    check-cast v1, Ljava/lang/Number;

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    int-to-float v1, v1

    .line 368
    invoke-virtual {v10, v1}, Landroid/view/View;->setElevation(F)V

    .line 369
    .line 370
    .line 371
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 372
    .line 373
    const/4 v9, -0x2

    .line 374
    const/4 v11, -0x1

    .line 375
    invoke-direct {v1, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v10, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 379
    .line 380
    .line 381
    new-instance v1, Landroid/widget/TextView;

    .line 382
    .line 383
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 384
    .line 385
    .line 386
    const-string v11, "<  \u8fd4\u56de"

    .line 387
    .line 388
    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 389
    .line 390
    .line 391
    const/high16 v11, 0x41700000    # 15.0f

    .line 392
    .line 393
    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 394
    .line 395
    .line 396
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 397
    .line 398
    .line 399
    move-result v11

    .line 400
    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 404
    .line 405
    .line 406
    move-result-object v11

    .line 407
    invoke-interface {v11, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v11

    .line 411
    check-cast v11, Ljava/lang/Number;

    .line 412
    .line 413
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 414
    .line 415
    .line 416
    move-result v11

    .line 417
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 418
    .line 419
    .line 420
    move-result-object v13

    .line 421
    invoke-interface {v13, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v13

    .line 425
    check-cast v13, Ljava/lang/Number;

    .line 426
    .line 427
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 428
    .line 429
    .line 430
    move-result v13

    .line 431
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 432
    .line 433
    .line 434
    move-result-object v9

    .line 435
    invoke-interface {v9, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v9

    .line 439
    check-cast v9, Ljava/lang/Number;

    .line 440
    .line 441
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    move-object/from16 v34, v6

    .line 446
    .line 447
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    invoke-interface {v6, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    check-cast v6, Ljava/lang/Number;

    .line 456
    .line 457
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 458
    .line 459
    .line 460
    move-result v6

    .line 461
    invoke-virtual {v1, v11, v13, v9, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 462
    .line 463
    .line 464
    const/4 v6, 0x1

    .line 465
    invoke-virtual {v1, v6}, Landroid/view/View;->setClickable(Z)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v6}, Landroid/view/View;->setFocusable(Z)V

    .line 469
    .line 470
    .line 471
    new-instance v6, Lε;

    .line 472
    .line 473
    const/4 v9, 0x1

    .line 474
    invoke-direct {v6, v0, v9}, Lε;-><init>(Lcom/example/dyhelper/ui/AboutActivity;I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 481
    .line 482
    .line 483
    new-instance v1, Landroid/view/View;

    .line 484
    .line 485
    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 486
    .line 487
    .line 488
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 489
    .line 490
    const/high16 v9, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/4 v11, 0x0

    .line 493
    invoke-direct {v6, v11, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 500
    .line 501
    .line 502
    new-instance v1, Landroid/widget/TextView;

    .line 503
    .line 504
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 505
    .line 506
    .line 507
    const-string v6, "\u5173\u4e8e"

    .line 508
    .line 509
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 510
    .line 511
    .line 512
    const/high16 v6, 0x41880000    # 17.0f

    .line 513
    .line 514
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 515
    .line 516
    .line 517
    const/4 v11, 0x0

    .line 518
    const/4 v6, 0x1

    .line 519
    invoke-static {v4, v1, v11, v6}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 523
    .line 524
    .line 525
    new-instance v1, Landroid/view/View;

    .line 526
    .line 527
    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 528
    .line 529
    .line 530
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 531
    .line 532
    const/4 v13, 0x0

    .line 533
    invoke-direct {v6, v13, v13, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 540
    .line 541
    .line 542
    new-instance v1, Landroid/view/View;

    .line 543
    .line 544
    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 545
    .line 546
    .line 547
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 548
    .line 549
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 550
    .line 551
    .line 552
    move-result-object v13

    .line 553
    const/16 v35, 0x3c

    .line 554
    .line 555
    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 556
    .line 557
    .line 558
    move-result-object v9

    .line 559
    invoke-interface {v13, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v9

    .line 563
    check-cast v9, Ljava/lang/Number;

    .line 564
    .line 565
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v9

    .line 569
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 570
    .line 571
    .line 572
    move-result-object v13

    .line 573
    invoke-interface {v13, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v13

    .line 577
    check-cast v13, Ljava/lang/Number;

    .line 578
    .line 579
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 580
    .line 581
    .line 582
    move-result v13

    .line 583
    invoke-direct {v6, v9, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 593
    .line 594
    .line 595
    new-instance v9, Landroid/widget/ScrollView;

    .line 596
    .line 597
    invoke-direct {v9, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 598
    .line 599
    .line 600
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 601
    .line 602
    const/4 v6, -0x1

    .line 603
    invoke-direct {v1, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v9, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 607
    .line 608
    .line 609
    const/4 v1, 0x2

    .line 610
    invoke-virtual {v9, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 611
    .line 612
    .line 613
    const/4 v13, 0x0

    .line 614
    invoke-virtual {v9, v13}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 615
    .line 616
    .line 617
    new-instance v10, Landroid/widget/LinearLayout;

    .line 618
    .line 619
    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 620
    .line 621
    .line 622
    const/4 v6, 0x1

    .line 623
    invoke-virtual {v10, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    invoke-interface {v1, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    check-cast v1, Ljava/lang/Number;

    .line 635
    .line 636
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 637
    .line 638
    .line 639
    move-result v1

    .line 640
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 641
    .line 642
    .line 643
    move-result-object v6

    .line 644
    invoke-interface {v6, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v6

    .line 648
    check-cast v6, Ljava/lang/Number;

    .line 649
    .line 650
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 651
    .line 652
    .line 653
    move-result v6

    .line 654
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 655
    .line 656
    .line 657
    move-result-object v13

    .line 658
    invoke-interface {v13, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v13

    .line 662
    check-cast v13, Ljava/lang/Number;

    .line 663
    .line 664
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 665
    .line 666
    .line 667
    move-result v13

    .line 668
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 669
    .line 670
    .line 671
    move-result-object v11

    .line 672
    invoke-interface {v11, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v11

    .line 676
    check-cast v11, Ljava/lang/Number;

    .line 677
    .line 678
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 679
    .line 680
    .line 681
    move-result v11

    .line 682
    invoke-virtual {v10, v1, v6, v13, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 683
    .line 684
    .line 685
    new-instance v1, Landroid/widget/LinearLayout;

    .line 686
    .line 687
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 688
    .line 689
    .line 690
    const/4 v6, 0x1

    .line 691
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 692
    .line 693
    .line 694
    const/16 v11, 0x11

    .line 695
    .line 696
    invoke-virtual {v1, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 697
    .line 698
    .line 699
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 700
    .line 701
    const/4 v11, -0x1

    .line 702
    const/4 v13, -0x2

    .line 703
    invoke-direct {v6, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 707
    .line 708
    .line 709
    move-result-object v11

    .line 710
    invoke-interface {v11, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v11

    .line 714
    check-cast v11, Ljava/lang/Number;

    .line 715
    .line 716
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 717
    .line 718
    .line 719
    move-result v11

    .line 720
    iput v11, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 721
    .line 722
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 723
    .line 724
    .line 725
    move-result-object v11

    .line 726
    const/16 v13, 0x20

    .line 727
    .line 728
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 729
    .line 730
    .line 731
    move-result-object v13

    .line 732
    invoke-interface {v11, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v11

    .line 736
    check-cast v11, Ljava/lang/Number;

    .line 737
    .line 738
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 739
    .line 740
    .line 741
    move-result v11

    .line 742
    iput v11, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 743
    .line 744
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 745
    .line 746
    .line 747
    new-instance v6, Landroid/widget/LinearLayout;

    .line 748
    .line 749
    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 750
    .line 751
    .line 752
    const/16 v11, 0x11

    .line 753
    .line 754
    invoke-virtual {v6, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 755
    .line 756
    .line 757
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    .line 758
    .line 759
    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 760
    .line 761
    .line 762
    const/4 v13, 0x1

    .line 763
    invoke-virtual {v11, v13}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 764
    .line 765
    .line 766
    const-string v13, "#FE2C55"

    .line 767
    .line 768
    move-object/from16 v36, v5

    .line 769
    .line 770
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 771
    .line 772
    .line 773
    move-result v5

    .line 774
    invoke-virtual {v11, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v6, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 778
    .line 779
    .line 780
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 781
    .line 782
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 783
    .line 784
    .line 785
    move-result-object v11

    .line 786
    const/16 v37, 0x58

    .line 787
    .line 788
    move-object/from16 v38, v9

    .line 789
    .line 790
    invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 791
    .line 792
    .line 793
    move-result-object v9

    .line 794
    invoke-interface {v11, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v11

    .line 798
    check-cast v11, Ljava/lang/Number;

    .line 799
    .line 800
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 801
    .line 802
    .line 803
    move-result v11

    .line 804
    move-object/from16 v37, v12

    .line 805
    .line 806
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 807
    .line 808
    .line 809
    move-result-object v12

    .line 810
    invoke-interface {v12, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v9

    .line 814
    check-cast v9, Ljava/lang/Number;

    .line 815
    .line 816
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 817
    .line 818
    .line 819
    move-result v9

    .line 820
    invoke-direct {v5, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 821
    .line 822
    .line 823
    const/4 v9, 0x1

    .line 824
    iput v9, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 825
    .line 826
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 827
    .line 828
    .line 829
    move-result-object v9

    .line 830
    invoke-interface {v9, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v9

    .line 834
    check-cast v9, Ljava/lang/Number;

    .line 835
    .line 836
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 837
    .line 838
    .line 839
    move-result v9

    .line 840
    iput v9, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 841
    .line 842
    invoke-virtual {v6, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 843
    .line 844
    .line 845
    new-instance v5, Landroid/widget/TextView;

    .line 846
    .line 847
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 848
    .line 849
    .line 850
    const-string v9, "DY"

    .line 851
    .line 852
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 853
    .line 854
    .line 855
    const/high16 v9, 0x42000000    # 32.0f

    .line 856
    .line 857
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 858
    .line 859
    .line 860
    const/4 v11, -0x1

    .line 861
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 862
    .line 863
    .line 864
    const/4 v9, 0x0

    .line 865
    const/4 v11, 0x1

    .line 866
    invoke-virtual {v5, v9, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 867
    .line 868
    .line 869
    const/16 v11, 0x11

    .line 870
    .line 871
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 878
    .line 879
    .line 880
    new-instance v5, Landroid/widget/TextView;

    .line 881
    .line 882
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 883
    .line 884
    .line 885
    const-string v6, "DY Helper"

    .line 886
    .line 887
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 888
    .line 889
    .line 890
    const/high16 v6, 0x41d00000    # 26.0f

    .line 891
    .line 892
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 893
    .line 894
    .line 895
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 896
    .line 897
    .line 898
    move-result v6

    .line 899
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 900
    .line 901
    .line 902
    const/4 v6, 0x1

    .line 903
    const/4 v9, 0x0

    .line 904
    invoke-virtual {v5, v9, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 905
    .line 906
    .line 907
    const/16 v11, 0x11

    .line 908
    .line 909
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 910
    .line 911
    .line 912
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 913
    .line 914
    const/4 v11, -0x2

    .line 915
    invoke-direct {v9, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 916
    .line 917
    .line 918
    iput v6, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 919
    .line 920
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 921
    .line 922
    .line 923
    move-result-object v6

    .line 924
    move-object/from16 v11, v33

    .line 925
    .line 926
    invoke-interface {v6, v11}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v6

    .line 930
    check-cast v6, Ljava/lang/Number;

    .line 931
    .line 932
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 933
    .line 934
    .line 935
    move-result v6

    .line 936
    iput v6, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 937
    .line 938
    invoke-virtual {v5, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 942
    .line 943
    .line 944
    new-instance v5, Landroid/widget/TextView;

    .line 945
    .line 946
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 947
    .line 948
    .line 949
    const-string v6, "v1.4.15"

    .line 950
    .line 951
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 952
    .line 953
    .line 954
    const/high16 v9, 0x41500000    # 13.0f

    .line 955
    .line 956
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 957
    .line 958
    .line 959
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 960
    .line 961
    .line 962
    move-result v12

    .line 963
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 964
    .line 965
    .line 966
    const/4 v9, 0x1

    .line 967
    const/4 v12, 0x0

    .line 968
    invoke-virtual {v5, v12, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 969
    .line 970
    .line 971
    const/16 v9, 0x11

    .line 972
    .line 973
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 977
    .line 978
    .line 979
    move-result-object v9

    .line 980
    move-object/from16 v12, v32

    .line 981
    .line 982
    invoke-interface {v9, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v9

    .line 986
    check-cast v9, Ljava/lang/Number;

    .line 987
    .line 988
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 989
    .line 990
    .line 991
    move-result v9

    .line 992
    move-object/from16 v32, v11

    .line 993
    .line 994
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 995
    .line 996
    .line 997
    move-result-object v11

    .line 998
    const/16 v39, 0x5

    .line 999
    .line 1000
    move-object/from16 v40, v13

    .line 1001
    .line 1002
    invoke-static/range {v39 .. v39}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v13

    .line 1006
    invoke-interface {v11, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v11

    .line 1010
    check-cast v11, Ljava/lang/Number;

    .line 1011
    .line 1012
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1013
    .line 1014
    .line 1015
    move-result v11

    .line 1016
    move-object/from16 v39, v15

    .line 1017
    .line 1018
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v15

    .line 1022
    invoke-interface {v15, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v15

    .line 1026
    check-cast v15, Ljava/lang/Number;

    .line 1027
    .line 1028
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 1029
    .line 1030
    .line 1031
    move-result v15

    .line 1032
    move-object/from16 v41, v12

    .line 1033
    .line 1034
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v12

    .line 1038
    invoke-interface {v12, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v12

    .line 1042
    check-cast v12, Ljava/lang/Number;

    .line 1043
    .line 1044
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 1045
    .line 1046
    .line 1047
    move-result v12

    .line 1048
    invoke-virtual {v5, v9, v11, v15, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1049
    .line 1050
    .line 1051
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 1052
    .line 1053
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1054
    .line 1055
    .line 1056
    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1057
    .line 1058
    .line 1059
    move-result v11

    .line 1060
    invoke-virtual {v9, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v11

    .line 1067
    invoke-interface {v11, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v11

    .line 1071
    check-cast v11, Ljava/lang/Number;

    .line 1072
    .line 1073
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1074
    .line 1075
    .line 1076
    move-result v11

    .line 1077
    int-to-float v11, v11

    .line 1078
    invoke-virtual {v9, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1082
    .line 1083
    .line 1084
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 1085
    .line 1086
    const/4 v11, -0x2

    .line 1087
    invoke-direct {v9, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1088
    .line 1089
    .line 1090
    const/4 v11, 0x1

    .line 1091
    iput v11, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1092
    .line 1093
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v11

    .line 1097
    move-object/from16 v12, v31

    .line 1098
    .line 1099
    invoke-interface {v11, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v11

    .line 1103
    check-cast v11, Ljava/lang/Number;

    .line 1104
    .line 1105
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1106
    .line 1107
    .line 1108
    move-result v11

    .line 1109
    iput v11, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1110
    .line 1111
    invoke-virtual {v5, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1115
    .line 1116
    .line 1117
    new-instance v5, Landroid/widget/TextView;

    .line 1118
    .line 1119
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1120
    .line 1121
    .line 1122
    const-string v9, "\u6296\u97f3\u52a9\u624b"

    .line 1123
    .line 1124
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1125
    .line 1126
    .line 1127
    const/high16 v9, 0x41600000    # 14.0f

    .line 1128
    .line 1129
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1130
    .line 1131
    .line 1132
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1133
    .line 1134
    .line 1135
    move-result v11

    .line 1136
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1137
    .line 1138
    .line 1139
    const/16 v11, 0x11

    .line 1140
    .line 1141
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 1142
    .line 1143
    .line 1144
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 1145
    .line 1146
    const/4 v13, -0x2

    .line 1147
    invoke-direct {v11, v13, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1148
    .line 1149
    .line 1150
    const/4 v13, 0x1

    .line 1151
    iput v13, v11, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1152
    .line 1153
    invoke-virtual {v5, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1160
    .line 1161
    .line 1162
    const-string v1, "\u7248\u672c\u4fe1\u606f"

    .line 1163
    .line 1164
    invoke-virtual {v0, v1, v4}, Lcom/example/dyhelper/ui/AboutActivity;->β(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v1

    .line 1168
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1169
    .line 1170
    .line 1171
    new-instance v1, Lκ;

    .line 1172
    .line 1173
    const-string v5, "\u5e94\u7528\u7248\u672c"

    .line 1174
    .line 1175
    invoke-direct {v1, v5, v6}, Lκ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    new-instance v5, Lκ;

    .line 1179
    .line 1180
    const-string v6, "\u76ee\u6807\u5e94\u7528"

    .line 1181
    .line 1182
    const-string v11, "DY:39.0Ver"

    .line 1183
    .line 1184
    invoke-direct {v5, v6, v11}, Lκ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    filled-new-array {v1, v5}, [Lκ;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v1

    .line 1195
    const/16 v5, 0xd

    .line 1196
    .line 1197
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v5

    .line 1201
    new-instance v6, Landroid/widget/LinearLayout;

    .line 1202
    .line 1203
    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1204
    .line 1205
    .line 1206
    const/4 v11, 0x1

    .line 1207
    invoke-virtual {v6, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1208
    .line 1209
    .line 1210
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    .line 1211
    .line 1212
    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1213
    .line 1214
    .line 1215
    invoke-static/range {v28 .. v28}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1216
    .line 1217
    .line 1218
    move-result v13

    .line 1219
    invoke-virtual {v11, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v13

    .line 1226
    invoke-interface {v13, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v13

    .line 1230
    check-cast v13, Ljava/lang/Number;

    .line 1231
    .line 1232
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1233
    .line 1234
    .line 1235
    move-result v13

    .line 1236
    int-to-float v13, v13

    .line 1237
    invoke-virtual {v11, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v13

    .line 1244
    invoke-interface {v13, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v13

    .line 1248
    check-cast v13, Ljava/lang/Number;

    .line 1249
    .line 1250
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1251
    .line 1252
    .line 1253
    move-result v13

    .line 1254
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1255
    .line 1256
    .line 1257
    move-result v15

    .line 1258
    invoke-virtual {v11, v13, v15}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v6, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1262
    .line 1263
    .line 1264
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 1265
    .line 1266
    const/4 v13, -0x2

    .line 1267
    const/4 v15, -0x1

    .line 1268
    invoke-direct {v11, v15, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v13

    .line 1275
    invoke-interface {v13, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v13

    .line 1279
    check-cast v13, Ljava/lang/Number;

    .line 1280
    .line 1281
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1282
    .line 1283
    .line 1284
    move-result v13

    .line 1285
    iput v13, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1286
    .line 1287
    invoke-virtual {v6, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1288
    .line 1289
    .line 1290
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v11

    .line 1294
    const/4 v13, 0x0

    .line 1295
    :goto_a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1296
    .line 1297
    .line 1298
    move-result v15

    .line 1299
    if-eqz v15, :cond_d

    .line 1300
    .line 1301
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v15

    .line 1305
    add-int/lit8 v31, v13, 0x1

    .line 1306
    .line 1307
    if-ltz v13, :cond_c

    .line 1308
    .line 1309
    check-cast v15, Lκ;

    .line 1310
    .line 1311
    new-instance v9, Landroid/widget/LinearLayout;

    .line 1312
    .line 1313
    invoke-direct {v9, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1314
    .line 1315
    .line 1316
    move-object/from16 v43, v1

    .line 1317
    .line 1318
    const/4 v1, 0x0

    .line 1319
    invoke-virtual {v9, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1320
    .line 1321
    .line 1322
    const/16 v1, 0x10

    .line 1323
    .line 1324
    invoke-virtual {v9, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v1

    .line 1331
    invoke-interface {v1, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    check-cast v1, Ljava/lang/Number;

    .line 1336
    .line 1337
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1338
    .line 1339
    .line 1340
    move-result v1

    .line 1341
    move-object/from16 v44, v2

    .line 1342
    .line 1343
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    invoke-interface {v2, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v2

    .line 1351
    check-cast v2, Ljava/lang/Number;

    .line 1352
    .line 1353
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1354
    .line 1355
    .line 1356
    move-result v2

    .line 1357
    move-object/from16 v45, v11

    .line 1358
    .line 1359
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v11

    .line 1363
    invoke-interface {v11, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v11

    .line 1367
    check-cast v11, Ljava/lang/Number;

    .line 1368
    .line 1369
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1370
    .line 1371
    .line 1372
    move-result v11

    .line 1373
    move-object/from16 v46, v12

    .line 1374
    .line 1375
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v12

    .line 1379
    invoke-interface {v12, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v12

    .line 1383
    check-cast v12, Ljava/lang/Number;

    .line 1384
    .line 1385
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 1386
    .line 1387
    .line 1388
    move-result v12

    .line 1389
    invoke-virtual {v9, v1, v2, v11, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 1390
    .line 1391
    .line 1392
    const/4 v11, 0x1

    .line 1393
    invoke-virtual {v9, v11}, Landroid/view/View;->setClickable(Z)V

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v9, v11}, Landroid/view/View;->setFocusable(Z)V

    .line 1397
    .line 1398
    .line 1399
    new-instance v1, Lζ;

    .line 1400
    .line 1401
    const/4 v2, 0x0

    .line 1402
    invoke-direct {v1, v0, v2, v15}, Lζ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v9, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1406
    .line 1407
    .line 1408
    new-instance v1, Landroid/widget/TextView;

    .line 1409
    .line 1410
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1411
    .line 1412
    .line 1413
    iget-object v2, v15, Lκ;->α:Ljava/lang/String;

    .line 1414
    .line 1415
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1416
    .line 1417
    .line 1418
    const/high16 v2, 0x41600000    # 14.0f

    .line 1419
    .line 1420
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1421
    .line 1422
    .line 1423
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1424
    .line 1425
    .line 1426
    move-result v2

    .line 1427
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1428
    .line 1429
    .line 1430
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1431
    .line 1432
    move-object/from16 v47, v5

    .line 1433
    .line 1434
    const/4 v5, -0x2

    .line 1435
    const/high16 v11, 0x3f800000    # 1.0f

    .line 1436
    .line 1437
    const/4 v12, 0x0

    .line 1438
    invoke-direct {v2, v12, v5, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1439
    .line 1440
    .line 1441
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1445
    .line 1446
    .line 1447
    new-instance v1, Landroid/widget/TextView;

    .line 1448
    .line 1449
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1450
    .line 1451
    .line 1452
    iget-object v2, v15, Lκ;->β:Ljava/lang/String;

    .line 1453
    .line 1454
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1455
    .line 1456
    .line 1457
    const/high16 v2, 0x41500000    # 13.0f

    .line 1458
    .line 1459
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1460
    .line 1461
    .line 1462
    invoke-static/range {v21 .. v21}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1463
    .line 1464
    .line 1465
    move-result v2

    .line 1466
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1467
    .line 1468
    .line 1469
    const v2, 0x800005

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1476
    .line 1477
    .line 1478
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1479
    .line 1480
    .line 1481
    invoke-interface/range {v43 .. v43}, Ljava/util/List;->size()I

    .line 1482
    .line 1483
    .line 1484
    move-result v1

    .line 1485
    const/16 v16, 0x1

    .line 1486
    .line 1487
    add-int/lit8 v1, v1, -0x1

    .line 1488
    .line 1489
    if-ge v13, v1, :cond_b

    .line 1490
    .line 1491
    new-instance v1, Landroid/view/View;

    .line 1492
    .line 1493
    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1494
    .line 1495
    .line 1496
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1497
    .line 1498
    .line 1499
    move-result v2

    .line 1500
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1501
    .line 1502
    .line 1503
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1504
    .line 1505
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v5

    .line 1509
    invoke-interface {v5, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v5

    .line 1513
    check-cast v5, Ljava/lang/Number;

    .line 1514
    .line 1515
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1516
    .line 1517
    .line 1518
    move-result v5

    .line 1519
    const/4 v11, -0x1

    .line 1520
    invoke-direct {v2, v11, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v5

    .line 1527
    invoke-interface {v5, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v5

    .line 1531
    check-cast v5, Ljava/lang/Number;

    .line 1532
    .line 1533
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1534
    .line 1535
    .line 1536
    move-result v5

    .line 1537
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1538
    .line 1539
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v5

    .line 1543
    invoke-interface {v5, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v5

    .line 1547
    check-cast v5, Ljava/lang/Number;

    .line 1548
    .line 1549
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1550
    .line 1551
    .line 1552
    move-result v5

    .line 1553
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1554
    .line 1555
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1556
    .line 1557
    .line 1558
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1559
    .line 1560
    .line 1561
    :cond_b
    move/from16 v13, v31

    .line 1562
    .line 1563
    move-object/from16 v1, v43

    .line 1564
    .line 1565
    move-object/from16 v2, v44

    .line 1566
    .line 1567
    move-object/from16 v11, v45

    .line 1568
    .line 1569
    move-object/from16 v12, v46

    .line 1570
    .line 1571
    move-object/from16 v5, v47

    .line 1572
    .line 1573
    const/high16 v9, 0x41600000    # 14.0f

    .line 1574
    .line 1575
    goto/16 :goto_a

    .line 1576
    .line 1577
    :cond_c
    invoke-static {}, Lyh;->х()V

    .line 1578
    .line 1579
    .line 1580
    const/4 v9, 0x0

    .line 1581
    throw v9

    .line 1582
    :cond_d
    move-object/from16 v44, v2

    .line 1583
    .line 1584
    move-object/from16 v46, v12

    .line 1585
    .line 1586
    invoke-virtual {v10, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1587
    .line 1588
    .line 1589
    const-string v1, "\u5f00\u53d1\u8005"

    .line 1590
    .line 1591
    invoke-virtual {v0, v1, v4}, Lcom/example/dyhelper/ui/AboutActivity;->β(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v1

    .line 1595
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1596
    .line 1597
    .line 1598
    new-instance v1, Landroid/widget/LinearLayout;

    .line 1599
    .line 1600
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1601
    .line 1602
    .line 1603
    const/4 v6, 0x1

    .line 1604
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v2

    .line 1611
    move-object/from16 v9, v30

    .line 1612
    .line 1613
    invoke-interface {v2, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v2

    .line 1617
    check-cast v2, Ljava/lang/Number;

    .line 1618
    .line 1619
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1620
    .line 1621
    .line 1622
    move-result v2

    .line 1623
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v5

    .line 1627
    invoke-interface {v5, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v5

    .line 1631
    check-cast v5, Ljava/lang/Number;

    .line 1632
    .line 1633
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1634
    .line 1635
    .line 1636
    move-result v5

    .line 1637
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v6

    .line 1641
    invoke-interface {v6, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v6

    .line 1645
    check-cast v6, Ljava/lang/Number;

    .line 1646
    .line 1647
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1648
    .line 1649
    .line 1650
    move-result v6

    .line 1651
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v11

    .line 1655
    invoke-interface {v11, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v11

    .line 1659
    check-cast v11, Ljava/lang/Number;

    .line 1660
    .line 1661
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1662
    .line 1663
    .line 1664
    move-result v11

    .line 1665
    invoke-virtual {v1, v2, v5, v6, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 1666
    .line 1667
    .line 1668
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 1669
    .line 1670
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1671
    .line 1672
    .line 1673
    invoke-static/range {v28 .. v28}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1674
    .line 1675
    .line 1676
    move-result v5

    .line 1677
    invoke-virtual {v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1678
    .line 1679
    .line 1680
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v5

    .line 1684
    invoke-interface {v5, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v5

    .line 1688
    check-cast v5, Ljava/lang/Number;

    .line 1689
    .line 1690
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1691
    .line 1692
    .line 1693
    move-result v5

    .line 1694
    int-to-float v5, v5

    .line 1695
    invoke-virtual {v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1696
    .line 1697
    .line 1698
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v5

    .line 1702
    invoke-interface {v5, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v5

    .line 1706
    check-cast v5, Ljava/lang/Number;

    .line 1707
    .line 1708
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1709
    .line 1710
    .line 1711
    move-result v5

    .line 1712
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1713
    .line 1714
    .line 1715
    move-result v6

    .line 1716
    invoke-virtual {v2, v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 1717
    .line 1718
    .line 1719
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1720
    .line 1721
    .line 1722
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1723
    .line 1724
    const/4 v11, -0x1

    .line 1725
    const/4 v13, -0x2

    .line 1726
    invoke-direct {v2, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v5

    .line 1733
    invoke-interface {v5, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v5

    .line 1737
    check-cast v5, Ljava/lang/Number;

    .line 1738
    .line 1739
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1740
    .line 1741
    .line 1742
    move-result v5

    .line 1743
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1744
    .line 1745
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1746
    .line 1747
    .line 1748
    new-instance v2, Landroid/widget/LinearLayout;

    .line 1749
    .line 1750
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1751
    .line 1752
    .line 1753
    const/4 v13, 0x0

    .line 1754
    invoke-virtual {v2, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1755
    .line 1756
    .line 1757
    const/16 v5, 0x10

    .line 1758
    .line 1759
    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1760
    .line 1761
    .line 1762
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1763
    .line 1764
    const/4 v11, -0x1

    .line 1765
    const/4 v13, -0x2

    .line 1766
    invoke-direct {v5, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1767
    .line 1768
    .line 1769
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v6

    .line 1773
    invoke-interface {v6, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v6

    .line 1777
    check-cast v6, Ljava/lang/Number;

    .line 1778
    .line 1779
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1780
    .line 1781
    .line 1782
    move-result v6

    .line 1783
    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1784
    .line 1785
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1786
    .line 1787
    .line 1788
    new-instance v5, Landroid/widget/LinearLayout;

    .line 1789
    .line 1790
    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1791
    .line 1792
    .line 1793
    const/16 v11, 0x11

    .line 1794
    .line 1795
    invoke-virtual {v5, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1796
    .line 1797
    .line 1798
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 1799
    .line 1800
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1801
    .line 1802
    .line 1803
    const/4 v11, 0x1

    .line 1804
    invoke-virtual {v6, v11}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 1805
    .line 1806
    .line 1807
    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1808
    .line 1809
    .line 1810
    move-result v11

    .line 1811
    invoke-virtual {v6, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1812
    .line 1813
    .line 1814
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1815
    .line 1816
    .line 1817
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1818
    .line 1819
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v11

    .line 1823
    const/16 v12, 0x34

    .line 1824
    .line 1825
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v12

    .line 1829
    invoke-interface {v11, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v11

    .line 1833
    check-cast v11, Ljava/lang/Number;

    .line 1834
    .line 1835
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1836
    .line 1837
    .line 1838
    move-result v11

    .line 1839
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v13

    .line 1843
    invoke-interface {v13, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v12

    .line 1847
    check-cast v12, Ljava/lang/Number;

    .line 1848
    .line 1849
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 1850
    .line 1851
    .line 1852
    move-result v12

    .line 1853
    invoke-direct {v6, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v11

    .line 1860
    move-object/from16 v12, v41

    .line 1861
    .line 1862
    invoke-interface {v11, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v11

    .line 1866
    check-cast v11, Ljava/lang/Number;

    .line 1867
    .line 1868
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1869
    .line 1870
    .line 1871
    move-result v11

    .line 1872
    iput v11, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1873
    .line 1874
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1875
    .line 1876
    .line 1877
    new-instance v6, Landroid/widget/TextView;

    .line 1878
    .line 1879
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1880
    .line 1881
    .line 1882
    const-string v11, "MF"

    .line 1883
    .line 1884
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1885
    .line 1886
    .line 1887
    const/high16 v13, 0x41900000    # 18.0f

    .line 1888
    .line 1889
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1890
    .line 1891
    .line 1892
    invoke-static/range {v40 .. v40}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1893
    .line 1894
    .line 1895
    move-result v15

    .line 1896
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1897
    .line 1898
    .line 1899
    const/4 v13, 0x1

    .line 1900
    const/4 v15, 0x0

    .line 1901
    invoke-virtual {v6, v15, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1902
    .line 1903
    .line 1904
    const/16 v15, 0x11

    .line 1905
    .line 1906
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setGravity(I)V

    .line 1907
    .line 1908
    .line 1909
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1910
    .line 1911
    .line 1912
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1913
    .line 1914
    .line 1915
    new-instance v5, Landroid/widget/LinearLayout;

    .line 1916
    .line 1917
    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1918
    .line 1919
    .line 1920
    invoke-virtual {v5, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1921
    .line 1922
    .line 1923
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1924
    .line 1925
    move-object/from16 v30, v3

    .line 1926
    .line 1927
    const/4 v3, -0x2

    .line 1928
    const/4 v13, 0x0

    .line 1929
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1930
    .line 1931
    invoke-direct {v6, v13, v3, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1932
    .line 1933
    .line 1934
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1935
    .line 1936
    .line 1937
    new-instance v3, Landroid/widget/TextView;

    .line 1938
    .line 1939
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1940
    .line 1941
    .line 1942
    invoke-virtual {v3, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1943
    .line 1944
    .line 1945
    const/high16 v6, 0x41900000    # 18.0f

    .line 1946
    .line 1947
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1948
    .line 1949
    .line 1950
    const/4 v6, 0x1

    .line 1951
    const/4 v15, 0x0

    .line 1952
    invoke-static {v4, v3, v15, v6}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 1953
    .line 1954
    .line 1955
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1956
    .line 1957
    .line 1958
    new-instance v3, Landroid/widget/TextView;

    .line 1959
    .line 1960
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1961
    .line 1962
    .line 1963
    const-string v6, "\u72ec\u7acb\u5f00\u53d1\u8005"

    .line 1964
    .line 1965
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1966
    .line 1967
    .line 1968
    const/high16 v11, 0x41400000    # 12.0f

    .line 1969
    .line 1970
    invoke-virtual {v3, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1971
    .line 1972
    .line 1973
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1974
    .line 1975
    .line 1976
    move-result v6

    .line 1977
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1978
    .line 1979
    .line 1980
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v6

    .line 1984
    move-object/from16 v13, v34

    .line 1985
    .line 1986
    invoke-interface {v6, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v6

    .line 1990
    check-cast v6, Ljava/lang/Number;

    .line 1991
    .line 1992
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1993
    .line 1994
    .line 1995
    move-result v6

    .line 1996
    const/4 v15, 0x0

    .line 1997
    invoke-virtual {v3, v15, v6, v15, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1998
    .line 1999
    .line 2000
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2001
    .line 2002
    .line 2003
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2007
    .line 2008
    .line 2009
    new-instance v2, Landroid/view/View;

    .line 2010
    .line 2011
    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2012
    .line 2013
    .line 2014
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 2015
    .line 2016
    .line 2017
    move-result v3

    .line 2018
    if-eqz v3, :cond_e

    .line 2019
    .line 2020
    move-object/from16 v3, v27

    .line 2021
    .line 2022
    goto :goto_b

    .line 2023
    :cond_e
    move-object/from16 v3, v26

    .line 2024
    .line 2025
    :goto_b
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2026
    .line 2027
    .line 2028
    move-result v3

    .line 2029
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2030
    .line 2031
    .line 2032
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 2033
    .line 2034
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v5

    .line 2038
    invoke-interface {v5, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v5

    .line 2042
    check-cast v5, Ljava/lang/Number;

    .line 2043
    .line 2044
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 2045
    .line 2046
    .line 2047
    move-result v5

    .line 2048
    const/4 v15, -0x1

    .line 2049
    invoke-direct {v3, v15, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2050
    .line 2051
    .line 2052
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v5

    .line 2056
    invoke-interface {v5, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v5

    .line 2060
    check-cast v5, Ljava/lang/Number;

    .line 2061
    .line 2062
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 2063
    .line 2064
    .line 2065
    move-result v5

    .line 2066
    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 2067
    .line 2068
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2069
    .line 2070
    .line 2071
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2072
    .line 2073
    .line 2074
    new-instance v2, Landroid/widget/TextView;

    .line 2075
    .line 2076
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2077
    .line 2078
    .line 2079
    const-string v3, "DY Helper \u7531 MF \u72ec\u7acb\u5f00\u53d1\u4e0e\u7ef4\u62a4\u3002\n\u672c\u9879\u76ee\u4ec5\u4f9b\u5b66\u4e60\u4ea4\u6d41\u4f7f\u7528,\u4e0d\u63d0\u4f9b\u4efb\u4f55\u5546\u4e1a\u670d\u52a1\u3002"

    .line 2080
    .line 2081
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2082
    .line 2083
    .line 2084
    const/high16 v3, 0x41500000    # 13.0f

    .line 2085
    .line 2086
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2087
    .line 2088
    .line 2089
    invoke-static/range {v21 .. v21}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2090
    .line 2091
    .line 2092
    move-result v3

    .line 2093
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2094
    .line 2095
    .line 2096
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v3

    .line 2100
    move-object/from16 v15, v29

    .line 2101
    .line 2102
    invoke-interface {v3, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v3

    .line 2106
    check-cast v3, Ljava/lang/Number;

    .line 2107
    .line 2108
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2109
    .line 2110
    .line 2111
    move-result v3

    .line 2112
    int-to-float v3, v3

    .line 2113
    const/high16 v5, 0x3f800000    # 1.0f

    .line 2114
    .line 2115
    invoke-virtual {v2, v3, v5}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 2116
    .line 2117
    .line 2118
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2119
    .line 2120
    .line 2121
    new-instance v2, Landroid/view/View;

    .line 2122
    .line 2123
    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2124
    .line 2125
    .line 2126
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 2127
    .line 2128
    .line 2129
    move-result v3

    .line 2130
    if-eqz v3, :cond_f

    .line 2131
    .line 2132
    move-object/from16 v3, v27

    .line 2133
    .line 2134
    goto :goto_c

    .line 2135
    :cond_f
    move-object/from16 v3, v26

    .line 2136
    .line 2137
    :goto_c
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2138
    .line 2139
    .line 2140
    move-result v3

    .line 2141
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2142
    .line 2143
    .line 2144
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 2145
    .line 2146
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2147
    .line 2148
    .line 2149
    move-result-object v5

    .line 2150
    invoke-interface {v5, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v5

    .line 2154
    check-cast v5, Ljava/lang/Number;

    .line 2155
    .line 2156
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 2157
    .line 2158
    .line 2159
    move-result v5

    .line 2160
    const/4 v6, -0x1

    .line 2161
    invoke-direct {v3, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2162
    .line 2163
    .line 2164
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v5

    .line 2168
    invoke-interface {v5, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v5

    .line 2172
    check-cast v5, Ljava/lang/Number;

    .line 2173
    .line 2174
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 2175
    .line 2176
    .line 2177
    move-result v5

    .line 2178
    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 2179
    .line 2180
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v5

    .line 2184
    invoke-interface {v5, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v5

    .line 2188
    check-cast v5, Ljava/lang/Number;

    .line 2189
    .line 2190
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 2191
    .line 2192
    .line 2193
    move-result v5

    .line 2194
    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 2195
    .line 2196
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2197
    .line 2198
    .line 2199
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2200
    .line 2201
    .line 2202
    new-instance v2, Landroid/widget/LinearLayout;

    .line 2203
    .line 2204
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2205
    .line 2206
    .line 2207
    const/4 v3, 0x0

    .line 2208
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2209
    .line 2210
    .line 2211
    const/16 v5, 0x10

    .line 2212
    .line 2213
    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 2214
    .line 2215
    .line 2216
    const/4 v6, 0x1

    .line 2217
    invoke-virtual {v2, v6}, Landroid/view/View;->setClickable(Z)V

    .line 2218
    .line 2219
    .line 2220
    invoke-virtual {v2, v6}, Landroid/view/View;->setFocusable(Z)V

    .line 2221
    .line 2222
    .line 2223
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v3

    .line 2227
    invoke-interface {v3, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v3

    .line 2231
    check-cast v3, Ljava/lang/Number;

    .line 2232
    .line 2233
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2234
    .line 2235
    .line 2236
    move-result v3

    .line 2237
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v6

    .line 2241
    move-object/from16 v11, v39

    .line 2242
    .line 2243
    invoke-interface {v6, v11}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2244
    .line 2245
    .line 2246
    move-result-object v6

    .line 2247
    check-cast v6, Ljava/lang/Number;

    .line 2248
    .line 2249
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 2250
    .line 2251
    .line 2252
    move-result v6

    .line 2253
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v5

    .line 2257
    invoke-interface {v5, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v5

    .line 2261
    check-cast v5, Ljava/lang/Number;

    .line 2262
    .line 2263
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 2264
    .line 2265
    .line 2266
    move-result v5

    .line 2267
    move-object/from16 v29, v7

    .line 2268
    .line 2269
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2270
    .line 2271
    .line 2272
    move-result-object v7

    .line 2273
    invoke-interface {v7, v11}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2274
    .line 2275
    .line 2276
    move-result-object v7

    .line 2277
    check-cast v7, Ljava/lang/Number;

    .line 2278
    .line 2279
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 2280
    .line 2281
    .line 2282
    move-result v7

    .line 2283
    invoke-virtual {v2, v3, v6, v5, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 2284
    .line 2285
    .line 2286
    new-instance v3, Lε;

    .line 2287
    .line 2288
    const/4 v5, 0x0

    .line 2289
    invoke-direct {v3, v0, v5}, Lε;-><init>(Lcom/example/dyhelper/ui/AboutActivity;I)V

    .line 2290
    .line 2291
    .line 2292
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2293
    .line 2294
    .line 2295
    new-instance v3, Landroid/widget/TextView;

    .line 2296
    .line 2297
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2298
    .line 2299
    .line 2300
    const-string v5, "\u2708\ufe0f"

    .line 2301
    .line 2302
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2303
    .line 2304
    .line 2305
    const/high16 v5, 0x41800000    # 16.0f

    .line 2306
    .line 2307
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2308
    .line 2309
    .line 2310
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 2311
    .line 2312
    const/4 v7, -0x2

    .line 2313
    invoke-direct {v6, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2314
    .line 2315
    .line 2316
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v7

    .line 2320
    move-object/from16 v5, v46

    .line 2321
    .line 2322
    invoke-interface {v7, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v5

    .line 2326
    check-cast v5, Ljava/lang/Number;

    .line 2327
    .line 2328
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 2329
    .line 2330
    .line 2331
    move-result v5

    .line 2332
    iput v5, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 2333
    .line 2334
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2335
    .line 2336
    .line 2337
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2338
    .line 2339
    .line 2340
    new-instance v3, Landroid/widget/LinearLayout;

    .line 2341
    .line 2342
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2343
    .line 2344
    .line 2345
    const/4 v6, 0x1

    .line 2346
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2347
    .line 2348
    .line 2349
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 2350
    .line 2351
    move-object/from16 v34, v8

    .line 2352
    .line 2353
    const/4 v6, 0x0

    .line 2354
    const/high16 v7, 0x3f800000    # 1.0f

    .line 2355
    .line 2356
    const/4 v8, -0x2

    .line 2357
    invoke-direct {v5, v6, v8, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 2358
    .line 2359
    .line 2360
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2361
    .line 2362
    .line 2363
    new-instance v5, Landroid/widget/TextView;

    .line 2364
    .line 2365
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2366
    .line 2367
    .line 2368
    const-string v6, "Telegram \u9891\u9053"

    .line 2369
    .line 2370
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2371
    .line 2372
    .line 2373
    const/high16 v6, 0x41600000    # 14.0f

    .line 2374
    .line 2375
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2376
    .line 2377
    .line 2378
    move-object/from16 v8, v40

    .line 2379
    .line 2380
    const/4 v6, 0x0

    .line 2381
    const/4 v7, 0x1

    .line 2382
    invoke-static {v8, v5, v6, v7}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 2383
    .line 2384
    .line 2385
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2386
    .line 2387
    .line 2388
    new-instance v5, Landroid/widget/TextView;

    .line 2389
    .line 2390
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2391
    .line 2392
    .line 2393
    const-string v6, "@MFDYHelper"

    .line 2394
    .line 2395
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2396
    .line 2397
    .line 2398
    const/high16 v6, 0x41400000    # 12.0f

    .line 2399
    .line 2400
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2401
    .line 2402
    .line 2403
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2404
    .line 2405
    .line 2406
    move-result v6

    .line 2407
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2408
    .line 2409
    .line 2410
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 2411
    .line 2412
    .line 2413
    move-result-object v6

    .line 2414
    invoke-interface {v6, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v6

    .line 2418
    check-cast v6, Ljava/lang/Number;

    .line 2419
    .line 2420
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 2421
    .line 2422
    .line 2423
    move-result v6

    .line 2424
    const/4 v7, 0x0

    .line 2425
    invoke-virtual {v5, v7, v6, v7, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 2426
    .line 2427
    .line 2428
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2429
    .line 2430
    .line 2431
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2432
    .line 2433
    .line 2434
    new-instance v3, Landroid/widget/TextView;

    .line 2435
    .line 2436
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2437
    .line 2438
    .line 2439
    const-string v5, "\u2192"

    .line 2440
    .line 2441
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2442
    .line 2443
    .line 2444
    const/high16 v5, 0x41800000    # 16.0f

    .line 2445
    .line 2446
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2447
    .line 2448
    .line 2449
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2450
    .line 2451
    .line 2452
    move-result v6

    .line 2453
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2454
    .line 2455
    .line 2456
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 2457
    .line 2458
    const/4 v7, -0x2

    .line 2459
    invoke-direct {v6, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2460
    .line 2461
    .line 2462
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2463
    .line 2464
    .line 2465
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2466
    .line 2467
    .line 2468
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2469
    .line 2470
    .line 2471
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2472
    .line 2473
    .line 2474
    const-string v1, "\u516c\u5f00\u529f\u80fd"

    .line 2475
    .line 2476
    invoke-virtual {v0, v1, v4}, Lcom/example/dyhelper/ui/AboutActivity;->β(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    .line 2477
    .line 2478
    .line 2479
    move-result-object v1

    .line 2480
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2481
    .line 2482
    .line 2483
    new-instance v1, Lι;

    .line 2484
    .line 2485
    const-string v2, "\u6fc0\u6d3b\u83dc\u5355"

    .line 2486
    .line 2487
    const-string v3, "\u6d6e\u7a97\u6309\u94ae\u3001\u624b\u52bf\u3001\u97f3\u91cf\u952e\u7ec4\u5408\u548c\u5206\u4eab\u9762\u677f\u5feb\u6377\u5165\u53e3\u3002"

    .line 2488
    .line 2489
    const-string v6, "\u89c6\u9891"

    .line 2490
    .line 2491
    invoke-direct {v1, v6, v2, v3}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2492
    .line 2493
    .line 2494
    new-instance v2, Lι;

    .line 2495
    .line 2496
    const-string v3, "\u89c6\u9891\u6d41\u8fc7\u6ee4"

    .line 2497
    .line 2498
    const-string v7, "\u8fc7\u6ee4\u5e7f\u544a\u3001\u76f4\u64ad\u3001\u56fe\u6587\u3001\u5173\u952e\u8bcd\u3001UID\u3001\u65f6\u957f\u548c\u4f4e\u70b9\u8d5e\u5185\u5bb9\u3002"

    .line 2499
    .line 2500
    invoke-direct {v2, v6, v3, v7}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2501
    .line 2502
    .line 2503
    new-instance v3, Lι;

    .line 2504
    .line 2505
    const-string v7, "\u65f6\u957f\u63d0\u9192"

    .line 2506
    .line 2507
    const-string v5, "\u8fde\u7eed\u4f7f\u7528\u63d0\u9192\u4f11\u606f\uff0c\u652f\u6301\u91cd\u590d\u63d0\u9192\u3001\u632f\u52a8\u548c\u81ea\u5b9a\u4e49\u6587\u6848\u3002"

    .line 2508
    .line 2509
    invoke-direct {v3, v6, v7, v5}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2510
    .line 2511
    .line 2512
    new-instance v5, Lι;

    .line 2513
    .line 2514
    const-string v7, "\u5c4f\u853d\u6296\u97f3\u5b98\u65b9\u65f6\u957f\u63d0\u9192\u5f39\u7a97"

    .line 2515
    .line 2516
    const-string v0, "\u62e6\u622a\u6296\u97f3\u5b98\u65b9\u4f7f\u7528\u65f6\u957f\u6216\u9632\u6c89\u8ff7\u7c7b\u5f39\u7a97\u3002"

    .line 2517
    .line 2518
    invoke-direct {v5, v6, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2519
    .line 2520
    .line 2521
    new-instance v0, Lι;

    .line 2522
    .line 2523
    const-string v7, "\u957f\u89c6\u9891\u63d0\u9192"

    .line 2524
    .line 2525
    move-object/from16 v45, v1

    .line 2526
    .line 2527
    const-string v1, "\u89c6\u9891\u8d85\u8fc7\u8bbe\u5b9a\u9608\u503c\u65f6\u4e3b\u52a8\u63d0\u793a\u3002"

    .line 2528
    .line 2529
    invoke-direct {v0, v6, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2530
    .line 2531
    .line 2532
    new-instance v1, Lι;

    .line 2533
    .line 2534
    const-string v7, "\u81ea\u52a8\u4e0b\u6ed1"

    .line 2535
    .line 2536
    move-object/from16 v49, v0

    .line 2537
    .line 2538
    const-string v0, "\u64ad\u653e\u5b8c\u6210\u540e\u81ea\u52a8\u5207\u6362\u4e0b\u4e00\u4e2a\u4f5c\u54c1\uff0c\u53ef\u8bbe\u7f6e\u5ef6\u8fdf\u3002"

    .line 2539
    .line 2540
    invoke-direct {v1, v6, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2541
    .line 2542
    .line 2543
    new-instance v0, Lι;

    .line 2544
    .line 2545
    const-string v7, "\u64ad\u653e\u5b8c\u6210\u81ea\u52a8\u6682\u505c"

    .line 2546
    .line 2547
    move-object/from16 v50, v1

    .line 2548
    .line 2549
    const-string v1, "\u64ad\u653e\u5b8c\u6bd5\u540e\u81ea\u52a8\u6682\u505c\uff0c\u907f\u514d\u5faa\u73af\u64ad\u653e\u3002"

    .line 2550
    .line 2551
    invoke-direct {v0, v6, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2552
    .line 2553
    .line 2554
    new-instance v1, Lι;

    .line 2555
    .line 2556
    const-string v7, "\u8fdb\u5ea6\u6761\u65f6\u95f4\u663e\u793a"

    .line 2557
    .line 2558
    move-object/from16 v51, v0

    .line 2559
    .line 2560
    const-string v0, "\u663e\u793a\u5f53\u524d\u8fdb\u5ea6\u548c\u603b\u65f6\u957f\uff0c\u53ef\u8c03\u5b57\u4f53\u3001\u989c\u8272\u4e0e\u900f\u660e\u5ea6\u3002"

    .line 2561
    .line 2562
    invoke-direct {v1, v6, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2563
    .line 2564
    .line 2565
    new-instance v0, Lι;

    .line 2566
    .line 2567
    const-string v7, "\u89c6\u9891\u500d\u901f\u6269\u5c55"

    .line 2568
    .line 2569
    move-object/from16 v52, v1

    .line 2570
    .line 2571
    const-string v1, "\u6269\u5c55\u6296\u97f3\u64ad\u653e\u5668\u53ef\u9009\u500d\u901f\u8303\u56f4\u3002"

    .line 2572
    .line 2573
    invoke-direct {v0, v6, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2574
    .line 2575
    .line 2576
    new-instance v1, Lι;

    .line 2577
    .line 2578
    const-string v7, "Feed\u6d41\u9884\u52a0\u8f7d\u63a7\u5236"

    .line 2579
    .line 2580
    move-object/from16 v53, v0

    .line 2581
    .line 2582
    const-string v0, "\u63a7\u5236\u9884\u52a0\u8f7d\u5f00\u5173\u3001\u6570\u91cf\u548c\u6e05\u6670\u5ea6\u3002"

    .line 2583
    .line 2584
    invoke-direct {v1, v6, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2585
    .line 2586
    .line 2587
    new-instance v0, Lι;

    .line 2588
    .line 2589
    const-string v7, "\u76f4\u64ad\u95f4\u7cbe\u786e\u4eba\u6570\u663e\u793a"

    .line 2590
    .line 2591
    move-object/from16 v54, v1

    .line 2592
    .line 2593
    const-string v1, "\u5c06\u76f4\u64ad\u95f4\u6a21\u7cca\u4eba\u6570\u663e\u793a\u4e3a\u66f4\u5177\u4f53\u7684\u6570\u5b57\u3002"

    .line 2594
    .line 2595
    invoke-direct {v0, v6, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2596
    .line 2597
    .line 2598
    new-instance v1, Lι;

    .line 2599
    .line 2600
    const-string v7, "\u8bc4\u8bba\u533a\u63a7\u4ef6\u7ba1\u7406"

    .line 2601
    .line 2602
    move-object/from16 v55, v0

    .line 2603
    .line 2604
    const-string v0, "\u9690\u85cf\u8bc4\u8bba\u5934\u50cf\u3001\u6635\u79f0\u3001\u5185\u5bb9\u3001\u56de\u590d\u3001\u65f6\u95f4\u3001\u70b9\u8d5e\u3001\u8e29\u548c\u53d1\u5e03\u5730\u70b9\u7b49\u63a7\u4ef6\u3002"

    .line 2605
    .line 2606
    move-object/from16 v39, v13

    .line 2607
    .line 2608
    const-string v13, "\u8bc4\u8bba"

    .line 2609
    .line 2610
    invoke-direct {v1, v13, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2611
    .line 2612
    .line 2613
    new-instance v0, Lι;

    .line 2614
    .line 2615
    const-string v7, "\u8bc4\u8bba\u53d1\u5e03\u4f5c\u54c1\u63a7\u4ef6"

    .line 2616
    .line 2617
    move-object/from16 v56, v1

    .line 2618
    .line 2619
    const-string v1, "\u9690\u85cf\u8bc4\u8bba\u952e\u76d8\u4e2d\u7684\u540c\u65f6\u53d1\u5e03\u4f5c\u54c1\u5165\u53e3\u53ca\u76f8\u5173\u9884\u89c8\u63a7\u4ef6\u3002"

    .line 2620
    .line 2621
    invoke-direct {v0, v13, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2622
    .line 2623
    .line 2624
    new-instance v1, Lι;

    .line 2625
    .line 2626
    const-string v7, "\u8bc4\u8bba\u533a\u6837\u5f0f"

    .line 2627
    .line 2628
    move-object/from16 v57, v0

    .line 2629
    .line 2630
    const-string v0, "\u81ea\u5b9a\u4e49\u4f5c\u8005\u6635\u79f0\u3001\u8bc4\u8bba\u5185\u5bb9\u3001\u65f6\u95f4\u3001IP\u5c5e\u5730\u3001\u56de\u590d\u6309\u94ae\u7b49\u989c\u8272\u3002"

    .line 2631
    .line 2632
    invoke-direct {v1, v13, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2633
    .line 2634
    .line 2635
    new-instance v0, Lι;

    .line 2636
    .line 2637
    const-string v7, "\u8bc4\u8bba\u533a\u80cc\u666f"

    .line 2638
    .line 2639
    move-object/from16 v58, v1

    .line 2640
    .line 2641
    const-string v1, "\u652f\u6301\u7eaf\u8272\u6216\u81ea\u5b9a\u4e49\u56fe\u7247\u80cc\u666f\uff0c\u5e76\u53ef\u8c03\u900f\u660e\u5ea6\u3002"

    .line 2642
    .line 2643
    invoke-direct {v0, v13, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2644
    .line 2645
    .line 2646
    new-instance v1, Lι;

    .line 2647
    .line 2648
    const-string v7, "\u8bc4\u8bba\u7cbe\u786e\u65f6\u95f4"

    .line 2649
    .line 2650
    move-object/from16 v59, v0

    .line 2651
    .line 2652
    const-string v0, "\u5c06\u76f8\u5bf9\u65f6\u95f4\u66ff\u6362\u4e3a\u7cbe\u786e\u65f6\u95f4\uff0c\u652f\u6301\u683c\u5f0f\u914d\u7f6e\u3002"

    .line 2653
    .line 2654
    invoke-direct {v1, v13, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2655
    .line 2656
    .line 2657
    new-instance v0, Lι;

    .line 2658
    .line 2659
    const-string v7, "\u8bc4\u8bba\u533a\u56fe\u7247\u65e0\u6c34\u5370\u4e0b\u8f7d"

    .line 2660
    .line 2661
    move-object/from16 v60, v1

    .line 2662
    .line 2663
    const-string v1, "\u62e6\u622a\u8bc4\u8bba\u533a\u5e26\u6c34\u5370\u56fe\u7247\u5e76\u66ff\u6362\u4e3a\u65e0\u6c34\u5370\u539f\u56fe\u94fe\u63a5\u3002"

    .line 2664
    .line 2665
    invoke-direct {v0, v13, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2666
    .line 2667
    .line 2668
    new-instance v1, Lι;

    .line 2669
    .line 2670
    const-string v7, "\u6c89\u6d78\u5f0f\u72b6\u6001\u680f"

    .line 2671
    .line 2672
    move-object/from16 v61, v0

    .line 2673
    .line 2674
    const-string v0, "\u9690\u85cf\u7cfb\u7edf\u72b6\u6001\u680f\uff0c\u4e5f\u53ef\u914d\u5408\u5bfc\u822a\u680f\u9690\u85cf\u3002"

    .line 2675
    .line 2676
    move-object/from16 v40, v15

    .line 2677
    .line 2678
    const-string v15, "\u5916\u89c2"

    .line 2679
    .line 2680
    invoke-direct {v1, v15, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2681
    .line 2682
    .line 2683
    new-instance v0, Lι;

    .line 2684
    .line 2685
    const-string v7, "\u4e2a\u4eba\u4e3b\u9875\u589e\u5f3a"

    .line 2686
    .line 2687
    move-object/from16 v62, v1

    .line 2688
    .line 2689
    const-string v1, "\u5728\u4e2a\u4eba\u4e3b\u9875\u5c55\u793a UID\uff0c\u5e76\u63d0\u4f9b\u4e66\u7b7e\u5165\u53e3\u3002"

    .line 2690
    .line 2691
    invoke-direct {v0, v15, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2692
    .line 2693
    .line 2694
    new-instance v1, Lι;

    .line 2695
    .line 2696
    const-string v7, "\u89c6\u9891\u4fe1\u606f\u6761"

    .line 2697
    .line 2698
    move-object/from16 v63, v0

    .line 2699
    .line 2700
    const-string v0, "\u5728\u89c6\u9891\u63cf\u8ff0\u9644\u8fd1\u663e\u793a\u53d1\u5e03\u65f6\u95f4\u3001\u4f4d\u7f6e\u7b49\u4fe1\u606f\u3002"

    .line 2701
    .line 2702
    invoke-direct {v1, v15, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2703
    .line 2704
    .line 2705
    new-instance v0, Lι;

    .line 2706
    .line 2707
    const-string v7, "\u9876\u90e8\u901a\u77e5\u7ba1\u7406\u5668"

    .line 2708
    .line 2709
    move-object/from16 v64, v1

    .line 2710
    .line 2711
    const-string v1, "\u7ba1\u7406\u4e0b\u8f7d\u8fdb\u5ea6\u3001\u706b\u82b1\u7eed\u671f\u7b49\u9876\u90e8\u901a\u77e5\u6837\u5f0f\u548c\u900f\u660e\u5ea6\u3002"

    .line 2712
    .line 2713
    move-object/from16 v41, v9

    .line 2714
    .line 2715
    const-string v9, "\u5de5\u5177"

    .line 2716
    .line 2717
    invoke-direct {v0, v9, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2718
    .line 2719
    .line 2720
    new-instance v1, Lι;

    .line 2721
    .line 2722
    const-string v7, "\u4e0b\u8f7d\u8bbe\u7f6e"

    .line 2723
    .line 2724
    move-object/from16 v65, v0

    .line 2725
    .line 2726
    const-string v0, "\u914d\u7f6e\u5a92\u4f53\u4fdd\u5b58\u76ee\u5f55\u3001\u547d\u540d\u89c4\u5219\u3001\u4e0b\u8f7d\u901a\u77e5\u548c\u8def\u5f84\u6a21\u677f\u3002"

    .line 2727
    .line 2728
    invoke-direct {v1, v9, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2729
    .line 2730
    .line 2731
    new-instance v0, Lι;

    .line 2732
    .line 2733
    const-string v7, "\u7248\u672c\u66f4\u65b0"

    .line 2734
    .line 2735
    move-object/from16 v66, v1

    .line 2736
    .line 2737
    const-string v1, "\u68c0\u67e5\u65b0\u7248\u3001\u4e0b\u8f7d\u66f4\u65b0\u5e76\u652f\u6301\u8df3\u8fc7\u6307\u5b9a\u7248\u672c\u3002"

    .line 2738
    .line 2739
    invoke-direct {v0, v9, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2740
    .line 2741
    .line 2742
    new-instance v1, Lι;

    .line 2743
    .line 2744
    const-string v7, "\u7ae0\u8282\u5e7f\u544a\u8df3\u8fc7"

    .line 2745
    .line 2746
    move-object/from16 v67, v0

    .line 2747
    .line 2748
    const-string v0, "\u8df3\u8fc7\u7ae0\u8282\u5e7f\u544a\u3001\u8df3\u8fc7\u7b49\u5f85\u5e76\u8bb0\u5f55\u7edf\u8ba1\u3002"

    .line 2749
    .line 2750
    invoke-direct {v1, v9, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2751
    .line 2752
    .line 2753
    new-instance v0, Lι;

    .line 2754
    .line 2755
    const-string v7, "\u7f13\u5b58\u7ba1\u7406"

    .line 2756
    .line 2757
    move-object/from16 v68, v1

    .line 2758
    .line 2759
    const-string v1, "\u7ba1\u7406 DexKit \u7f13\u5b58\u3001DyLog \u65e5\u5fd7\u548c\u7528\u6237\u914d\u7f6e\u6e05\u7406\u3002"

    .line 2760
    .line 2761
    invoke-direct {v0, v9, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2762
    .line 2763
    .line 2764
    new-instance v1, Lι;

    .line 2765
    .line 2766
    const-string v7, "\u79c1\u4fe1\u9632\u64a4\u56de"

    .line 2767
    .line 2768
    move-object/from16 v69, v0

    .line 2769
    .line 2770
    const-string v0, "\u4fdd\u7559\u88ab\u64a4\u56de\u7684\u79c1\u4fe1\u6d88\u606f\u5185\u5bb9\u548c\u64a4\u56de\u6807\u8bb0\u3002"

    .line 2771
    .line 2772
    move-object/from16 v46, v2

    .line 2773
    .line 2774
    const-string v2, "\u79c1\u4fe1"

    .line 2775
    .line 2776
    invoke-direct {v1, v2, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2777
    .line 2778
    .line 2779
    new-instance v0, Lι;

    .line 2780
    .line 2781
    const-string v7, "\u804a\u5929\u65f6\u95f4\u6807\u7b7e"

    .line 2782
    .line 2783
    move-object/from16 v70, v1

    .line 2784
    .line 2785
    const-string v1, "\u5728\u79c1\u4fe1\u6d88\u606f\u4e0b\u65b9\u663e\u793a\u7cbe\u786e\u53d1\u9001\u65f6\u95f4\u3002"

    .line 2786
    .line 2787
    invoke-direct {v0, v2, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2788
    .line 2789
    .line 2790
    new-instance v1, Lι;

    .line 2791
    .line 2792
    const-string v7, "\u804a\u5929\u72b6\u6001\u9690\u79c1"

    .line 2793
    .line 2794
    move-object/from16 v71, v0

    .line 2795
    .line 2796
    const-string v0, "\u5173\u95ed\u5df2\u8bfb\u56de\u6267\u3001\u6b63\u5728\u8f93\u5165\u548c\u5f55\u97f3\u72b6\u6001\u4e0a\u62a5\u3002"

    .line 2797
    .line 2798
    invoke-direct {v1, v2, v7, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2799
    .line 2800
    .line 2801
    new-instance v0, Lι;

    .line 2802
    .line 2803
    const-string v7, "\u804a\u5929\u81ea\u52a8\u5df2\u8bfb"

    .line 2804
    .line 2805
    move-object/from16 v72, v1

    .line 2806
    .line 2807
    const-string v1, "\u6309\u89c4\u5219\u548c\u95f4\u9694\u81ea\u52a8\u6807\u8bb0\u79c1\u4fe1\u5df2\u8bfb\uff0c\u652f\u6301\u540d\u5355\u63a7\u5236\u3002"

    .line 2808
    .line 2809
    invoke-direct {v0, v2, v7, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2810
    .line 2811
    .line 2812
    move-object/from16 v73, v0

    .line 2813
    .line 2814
    move-object/from16 v47, v3

    .line 2815
    .line 2816
    move-object/from16 v48, v5

    .line 2817
    .line 2818
    filled-new-array/range {v45 .. v73}, [Lι;

    .line 2819
    .line 2820
    .line 2821
    move-result-object v0

    .line 2822
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v1

    .line 2826
    invoke-virtual/range {p0 .. p0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 2827
    .line 2828
    .line 2829
    move-result v0

    .line 2830
    if-eqz v0, :cond_10

    .line 2831
    .line 2832
    const-string v0, "#263D2B"

    .line 2833
    .line 2834
    :goto_d
    move-object v7, v0

    .line 2835
    move-object v0, v6

    .line 2836
    goto :goto_e

    .line 2837
    :cond_10
    const-string v0, "#EAF7EE"

    .line 2838
    .line 2839
    goto :goto_d

    .line 2840
    :goto_e
    const-string v6, "#34C759"

    .line 2841
    .line 2842
    move-object/from16 v42, v11

    .line 2843
    .line 2844
    move-object/from16 v16, v12

    .line 2845
    .line 2846
    move-object/from16 v5, v21

    .line 2847
    .line 2848
    move-object/from16 v3, v24

    .line 2849
    .line 2850
    move-object/from16 v2, v28

    .line 2851
    .line 2852
    move-object/from16 v74, v34

    .line 2853
    .line 2854
    move-object/from16 v75, v36

    .line 2855
    .line 2856
    move-object/from16 v34, v39

    .line 2857
    .line 2858
    const/4 v11, 0x1

    .line 2859
    move-object v12, v0

    .line 2860
    move-object/from16 v21, v8

    .line 2861
    .line 2862
    move-object/from16 v8, v25

    .line 2863
    .line 2864
    move-object/from16 v0, p0

    .line 2865
    .line 2866
    invoke-virtual/range {v0 .. v8}, Lcom/example/dyhelper/ui/AboutActivity;->α(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 2867
    .line 2868
    .line 2869
    move-result-object v1

    .line 2870
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2871
    .line 2872
    .line 2873
    const-string v1, "\u5185\u6d4b\u529f\u80fd"

    .line 2874
    .line 2875
    invoke-virtual {v0, v1, v4}, Lcom/example/dyhelper/ui/AboutActivity;->β(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    .line 2876
    .line 2877
    .line 2878
    move-result-object v1

    .line 2879
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2880
    .line 2881
    .line 2882
    new-instance v1, Lι;

    .line 2883
    .line 2884
    const-string v6, "\u5e95\u680fTab\u8fc7\u6ee4"

    .line 2885
    .line 2886
    const-string v7, "\u9690\u85cf\u670b\u53cb\u3001\u53d1\u5e03\u3001\u6d88\u606f\u3001\u6211\u7684\u3001\u63a2\u7d22\u3001\u5546\u57ce\u3001\u540c\u57ce\u7b49\u5e95\u680f\u5165\u53e3\u3002"

    .line 2887
    .line 2888
    invoke-direct {v1, v12, v6, v7}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2889
    .line 2890
    .line 2891
    new-instance v6, Lι;

    .line 2892
    .line 2893
    const-string v7, "\u9876\u680fTab\u8fc7\u6ee4"

    .line 2894
    .line 2895
    const-string v11, "\u626b\u63cf\u9996\u9875\u9876\u90e8\u9891\u9053\uff0c\u53ef\u9690\u85cf\u6307\u5b9a\u9891\u9053\u3001\u5c45\u4e2d\u5bf9\u9f50\u6216\u8df3\u8fc7\u9690\u85cf\u9875\u9762\u3002"

    .line 2896
    .line 2897
    invoke-direct {v6, v12, v7, v11}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2898
    .line 2899
    .line 2900
    new-instance v7, Lι;

    .line 2901
    .line 2902
    const-string v11, "\u89c6\u9891\u7ae0\u8282\u5e7f\u544a\u8df3\u8fc7"

    .line 2903
    .line 2904
    const-string v0, "\u8bc6\u522b\u7ae0\u8282\u8fdb\u5ea6\u6761\u4e2d\u7684\u5e7f\u544a\u6216\u8425\u9500\u7247\u6bb5\u5e76\u5c1d\u8bd5\u8df3\u8fc7\u3002"

    .line 2905
    .line 2906
    invoke-direct {v7, v12, v11, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2907
    .line 2908
    .line 2909
    new-instance v0, Lι;

    .line 2910
    .line 2911
    const-string v11, "\u53f3\u4fa7\u4e0d\u611f\u5174\u8da3\u6309\u94ae"

    .line 2912
    .line 2913
    move-object/from16 v45, v1

    .line 2914
    .line 2915
    const-string v1, "\u5728 Feed \u53f3\u4fa7\u64cd\u4f5c\u680f\u589e\u52a0\u5feb\u901f\u4e0d\u611f\u5174\u8da3\u6309\u94ae\u3002"

    .line 2916
    .line 2917
    invoke-direct {v0, v12, v11, v1}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2918
    .line 2919
    .line 2920
    new-instance v1, Lι;

    .line 2921
    .line 2922
    const-string v11, "\u8bed\u97f3\u66ff\u6362"

    .line 2923
    .line 2924
    const-string v12, "\u9009\u62e9 MP3 \u66ff\u6362\u8bc4\u8bba\u8bed\u97f3\u6216\u79c1\u4fe1\u8bed\u97f3\u5f55\u97f3\u3002"

    .line 2925
    .line 2926
    invoke-direct {v1, v13, v11, v12}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2927
    .line 2928
    .line 2929
    new-instance v11, Lι;

    .line 2930
    .line 2931
    const-string v12, "\u8bc4\u8bba\u4e66\u7b7e"

    .line 2932
    .line 2933
    move-object/from16 v48, v0

    .line 2934
    .line 2935
    const-string v0, "\u7ba1\u7406\u4e66\u7b7e\u8bc4\u8bba\uff0c\u652f\u6301\u81ea\u52a8\u626b\u63cf\u65b0\u56de\u590d\u548c\u4e3b\u52a8\u67e5\u8be2\u3002"

    .line 2936
    .line 2937
    invoke-direct {v11, v13, v12, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2938
    .line 2939
    .line 2940
    new-instance v0, Lι;

    .line 2941
    .line 2942
    const-string v12, "\u6e05\u723d\u6a21\u5f0f"

    .line 2943
    .line 2944
    const-string v13, "\u8c03\u8282\u64ad\u653e\u9875\u53f3\u4fa7\u3001\u5e95\u90e8\u3001\u9876\u680f\u3001\u6742\u9879\u680f\u548c\u8fdb\u5ea6\u6761\u900f\u660e\u5ea6\uff0c\u5e76\u652f\u6301\u5e95\u680f\u9690\u85cf\u3002"

    .line 2945
    .line 2946
    invoke-direct {v0, v15, v12, v13}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2947
    .line 2948
    .line 2949
    new-instance v12, Lι;

    .line 2950
    .line 2951
    const-string v13, "\u7a7a\u95f2\u9000\u51fa"

    .line 2952
    .line 2953
    const-string v15, "\u8d85\u8fc7\u8bbe\u5b9a\u65f6\u95f4\u65e0\u64cd\u4f5c\u540e\u81ea\u52a8\u9000\u51fa\u6296\u97f3\uff0c\u53ef\u5012\u8ba1\u65f6\u63d0\u793a\u6216\u9501\u5c4f\u3002"

    .line 2954
    .line 2955
    invoke-direct {v12, v9, v13, v15}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2956
    .line 2957
    .line 2958
    new-instance v13, Lι;

    .line 2959
    .line 2960
    const-string v15, "\u706b\u82b1\u7eed\u671f"

    .line 2961
    .line 2962
    move-object/from16 v51, v0

    .line 2963
    .line 2964
    const-string v0, "\u81ea\u52a8\u6216\u81ea\u5b9a\u4e49\u7eed\u706b\uff0c\u652f\u6301\u7eed\u671f\u6587\u6848\u3001\u7fa4\u804a\u3001\u4f2a\u88c5\u706b\u82b1\u5929\u6570\u548c\u9876\u90e8\u901a\u77e5\u3002"

    .line 2965
    .line 2966
    invoke-direct {v13, v9, v15, v0}, Lι;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2967
    .line 2968
    .line 2969
    move-object/from16 v49, v1

    .line 2970
    .line 2971
    move-object/from16 v46, v6

    .line 2972
    .line 2973
    move-object/from16 v47, v7

    .line 2974
    .line 2975
    move-object/from16 v50, v11

    .line 2976
    .line 2977
    move-object/from16 v52, v12

    .line 2978
    .line 2979
    move-object/from16 v53, v13

    .line 2980
    .line 2981
    filled-new-array/range {v45 .. v53}, [Lι;

    .line 2982
    .line 2983
    .line 2984
    move-result-object v0

    .line 2985
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2986
    .line 2987
    .line 2988
    move-result-object v1

    .line 2989
    invoke-virtual/range {p0 .. p0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 2990
    .line 2991
    .line 2992
    move-result v0

    .line 2993
    if-eqz v0, :cond_11

    .line 2994
    .line 2995
    const-string v0, "#30244F"

    .line 2996
    .line 2997
    :goto_f
    move-object v7, v0

    .line 2998
    goto :goto_10

    .line 2999
    :cond_11
    const-string v0, "#EFE9FF"

    .line 3000
    .line 3001
    goto :goto_f

    .line 3002
    :goto_10
    const-string v6, "#7C4DFF"

    .line 3003
    .line 3004
    move-object/from16 v0, p0

    .line 3005
    .line 3006
    invoke-virtual/range {v0 .. v8}, Lcom/example/dyhelper/ui/AboutActivity;->α(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 3007
    .line 3008
    .line 3009
    move-result-object v1

    .line 3010
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3011
    .line 3012
    .line 3013
    const-string v1, "\u514d\u8d23\u58f0\u660e"

    .line 3014
    .line 3015
    invoke-virtual {v0, v1, v4}, Lcom/example/dyhelper/ui/AboutActivity;->β(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    .line 3016
    .line 3017
    .line 3018
    move-result-object v1

    .line 3019
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3020
    .line 3021
    .line 3022
    new-instance v1, Landroid/widget/LinearLayout;

    .line 3023
    .line 3024
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3025
    .line 3026
    .line 3027
    const/4 v6, 0x1

    .line 3028
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3029
    .line 3030
    .line 3031
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3032
    .line 3033
    .line 3034
    move-result-object v2

    .line 3035
    invoke-interface {v2, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3036
    .line 3037
    .line 3038
    move-result-object v2

    .line 3039
    check-cast v2, Ljava/lang/Number;

    .line 3040
    .line 3041
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 3042
    .line 3043
    .line 3044
    move-result v2

    .line 3045
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3046
    .line 3047
    .line 3048
    move-result-object v3

    .line 3049
    move-object/from16 v6, v30

    .line 3050
    .line 3051
    invoke-interface {v3, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3052
    .line 3053
    .line 3054
    move-result-object v3

    .line 3055
    check-cast v3, Ljava/lang/Number;

    .line 3056
    .line 3057
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3058
    .line 3059
    .line 3060
    move-result v3

    .line 3061
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3062
    .line 3063
    .line 3064
    move-result-object v7

    .line 3065
    invoke-interface {v7, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3066
    .line 3067
    .line 3068
    move-result-object v7

    .line 3069
    check-cast v7, Ljava/lang/Number;

    .line 3070
    .line 3071
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 3072
    .line 3073
    .line 3074
    move-result v7

    .line 3075
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3076
    .line 3077
    .line 3078
    move-result-object v8

    .line 3079
    invoke-interface {v8, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3080
    .line 3081
    .line 3082
    move-result-object v8

    .line 3083
    check-cast v8, Ljava/lang/Number;

    .line 3084
    .line 3085
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 3086
    .line 3087
    .line 3088
    move-result v8

    .line 3089
    invoke-virtual {v1, v2, v3, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 3090
    .line 3091
    .line 3092
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 3093
    .line 3094
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 3095
    .line 3096
    .line 3097
    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3098
    .line 3099
    .line 3100
    move-result v3

    .line 3101
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 3102
    .line 3103
    .line 3104
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3105
    .line 3106
    .line 3107
    move-result-object v3

    .line 3108
    move-object/from16 v12, v16

    .line 3109
    .line 3110
    invoke-interface {v3, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3111
    .line 3112
    .line 3113
    move-result-object v3

    .line 3114
    check-cast v3, Ljava/lang/Number;

    .line 3115
    .line 3116
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3117
    .line 3118
    .line 3119
    move-result v3

    .line 3120
    int-to-float v3, v3

    .line 3121
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 3122
    .line 3123
    .line 3124
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 3125
    .line 3126
    .line 3127
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 3128
    .line 3129
    const/4 v11, -0x1

    .line 3130
    const/4 v13, -0x2

    .line 3131
    invoke-direct {v2, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3132
    .line 3133
    .line 3134
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3135
    .line 3136
    .line 3137
    move-result-object v3

    .line 3138
    move-object/from16 v7, v29

    .line 3139
    .line 3140
    invoke-interface {v3, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3141
    .line 3142
    .line 3143
    move-result-object v3

    .line 3144
    check-cast v3, Ljava/lang/Number;

    .line 3145
    .line 3146
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3147
    .line 3148
    .line 3149
    move-result v3

    .line 3150
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 3151
    .line 3152
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3153
    .line 3154
    .line 3155
    new-instance v2, Landroid/widget/TextView;

    .line 3156
    .line 3157
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3158
    .line 3159
    .line 3160
    const-string v3, "1. \u672c\u6a21\u5757\u4ec5\u4f9b\u4e2a\u4eba\u5b66\u4e60\u548c\u7814\u7a76 Xposed \u6846\u67b6\u5f00\u53d1\u6280\u672f\u4f7f\u7528\u3002\n\n2. \u8bf7\u52ff\u5c06\u4e0b\u8f7d\u7684\u5185\u5bb9\u7528\u4e8e\u4efb\u4f55\u5546\u4e1a\u7528\u9014\uff0c\u5c0a\u91cd\u539f\u521b\u4f5c\u8005\u7684\u77e5\u8bc6\u4ea7\u6743\u3002\n\n3. \u4f7f\u7528\u672c\u6a21\u5757\u6240\u4ea7\u751f\u7684\u4e00\u5207\u540e\u679c\u7531\u4f7f\u7528\u8005\u81ea\u884c\u627f\u62c5\uff0c\u5f00\u53d1\u8005\u4e0d\u627f\u62c5\u4efb\u4f55\u8d23\u4efb\u3002\n\n4. \u5982\u6709\u4fb5\u6743\u8bf7\u8054\u7cfb\u5f00\u53d1\u8005\uff0c\u5c06\u53ca\u65f6\u5904\u7406\u3002\n\n5. \u672c\u6a21\u5757\u4e0d\u6536\u96c6\u4efb\u4f55\u7528\u6237\u6570\u636e\uff0c\u6240\u6709\u64cd\u4f5c\u5747\u5728\u672c\u5730\u5b8c\u6210\u3002"

    .line 3161
    .line 3162
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3163
    .line 3164
    .line 3165
    const/high16 v3, 0x41400000    # 12.0f

    .line 3166
    .line 3167
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 3168
    .line 3169
    .line 3170
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3171
    .line 3172
    .line 3173
    move-result v3

    .line 3174
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3175
    .line 3176
    .line 3177
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3178
    .line 3179
    .line 3180
    move-result-object v3

    .line 3181
    move-object/from16 v13, v34

    .line 3182
    .line 3183
    invoke-interface {v3, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3184
    .line 3185
    .line 3186
    move-result-object v3

    .line 3187
    check-cast v3, Ljava/lang/Number;

    .line 3188
    .line 3189
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3190
    .line 3191
    .line 3192
    move-result v3

    .line 3193
    int-to-float v3, v3

    .line 3194
    const/high16 v15, 0x3f800000    # 1.0f

    .line 3195
    .line 3196
    invoke-virtual {v2, v3, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 3197
    .line 3198
    .line 3199
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3200
    .line 3201
    .line 3202
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3203
    .line 3204
    .line 3205
    const-string v1, "\u6280\u672f\u8bf4\u660e"

    .line 3206
    .line 3207
    invoke-virtual {v0, v1, v4}, Lcom/example/dyhelper/ui/AboutActivity;->β(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;

    .line 3208
    .line 3209
    .line 3210
    move-result-object v1

    .line 3211
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3212
    .line 3213
    .line 3214
    new-instance v1, Landroid/widget/LinearLayout;

    .line 3215
    .line 3216
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3217
    .line 3218
    .line 3219
    const/4 v11, 0x1

    .line 3220
    invoke-virtual {v1, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3221
    .line 3222
    .line 3223
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3224
    .line 3225
    .line 3226
    move-result-object v2

    .line 3227
    invoke-interface {v2, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3228
    .line 3229
    .line 3230
    move-result-object v2

    .line 3231
    check-cast v2, Ljava/lang/Number;

    .line 3232
    .line 3233
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 3234
    .line 3235
    .line 3236
    move-result v2

    .line 3237
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3238
    .line 3239
    .line 3240
    move-result-object v3

    .line 3241
    invoke-interface {v3, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3242
    .line 3243
    .line 3244
    move-result-object v3

    .line 3245
    check-cast v3, Ljava/lang/Number;

    .line 3246
    .line 3247
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3248
    .line 3249
    .line 3250
    move-result v3

    .line 3251
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3252
    .line 3253
    .line 3254
    move-result-object v4

    .line 3255
    invoke-interface {v4, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3256
    .line 3257
    .line 3258
    move-result-object v4

    .line 3259
    check-cast v4, Ljava/lang/Number;

    .line 3260
    .line 3261
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3262
    .line 3263
    .line 3264
    move-result v4

    .line 3265
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3266
    .line 3267
    .line 3268
    move-result-object v8

    .line 3269
    invoke-interface {v8, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3270
    .line 3271
    .line 3272
    move-result-object v8

    .line 3273
    check-cast v8, Ljava/lang/Number;

    .line 3274
    .line 3275
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 3276
    .line 3277
    .line 3278
    move-result v8

    .line 3279
    invoke-virtual {v1, v2, v3, v4, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 3280
    .line 3281
    .line 3282
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 3283
    .line 3284
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 3285
    .line 3286
    .line 3287
    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3288
    .line 3289
    .line 3290
    move-result v3

    .line 3291
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 3292
    .line 3293
    .line 3294
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3295
    .line 3296
    .line 3297
    move-result-object v3

    .line 3298
    invoke-interface {v3, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3299
    .line 3300
    .line 3301
    move-result-object v3

    .line 3302
    check-cast v3, Ljava/lang/Number;

    .line 3303
    .line 3304
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3305
    .line 3306
    .line 3307
    move-result v3

    .line 3308
    int-to-float v3, v3

    .line 3309
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 3310
    .line 3311
    .line 3312
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 3313
    .line 3314
    .line 3315
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 3316
    .line 3317
    const/4 v11, -0x2

    .line 3318
    const/4 v15, -0x1

    .line 3319
    invoke-direct {v2, v15, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3320
    .line 3321
    .line 3322
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3323
    .line 3324
    .line 3325
    move-result-object v3

    .line 3326
    invoke-interface {v3, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3327
    .line 3328
    .line 3329
    move-result-object v3

    .line 3330
    check-cast v3, Ljava/lang/Number;

    .line 3331
    .line 3332
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3333
    .line 3334
    .line 3335
    move-result v3

    .line 3336
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 3337
    .line 3338
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3339
    .line 3340
    .line 3341
    new-instance v2, Landroid/widget/TextView;

    .line 3342
    .line 3343
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3344
    .line 3345
    .line 3346
    const-string v3, "\u672c\u6a21\u5757\u4f7f\u7528 DexKit \u8fdb\u884c\u9ad8\u6548\u7684\u7c7b\u548c\u65b9\u6cd5\u5b9a\u4f4d\uff0c\u786e\u4fdd\u5728\u4e0d\u540c\u7248\u672c\u6296\u97f3\u4e2d\u7684\u517c\u5bb9\u6027\u3002"

    .line 3347
    .line 3348
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3349
    .line 3350
    .line 3351
    const/high16 v3, 0x41500000    # 13.0f

    .line 3352
    .line 3353
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 3354
    .line 3355
    .line 3356
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3357
    .line 3358
    .line 3359
    move-result v3

    .line 3360
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3361
    .line 3362
    .line 3363
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3364
    .line 3365
    .line 3366
    move-result-object v3

    .line 3367
    const/4 v4, 0x3

    .line 3368
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3369
    .line 3370
    .line 3371
    move-result-object v4

    .line 3372
    invoke-interface {v3, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3373
    .line 3374
    .line 3375
    move-result-object v3

    .line 3376
    check-cast v3, Ljava/lang/Number;

    .line 3377
    .line 3378
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3379
    .line 3380
    .line 3381
    move-result v3

    .line 3382
    int-to-float v3, v3

    .line 3383
    const/high16 v15, 0x3f800000    # 1.0f

    .line 3384
    .line 3385
    invoke-virtual {v2, v3, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 3386
    .line 3387
    .line 3388
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 3389
    .line 3390
    const/4 v11, -0x2

    .line 3391
    const/4 v15, -0x1

    .line 3392
    invoke-direct {v3, v15, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3393
    .line 3394
    .line 3395
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3396
    .line 3397
    .line 3398
    move-result-object v4

    .line 3399
    move-object/from16 v5, v44

    .line 3400
    .line 3401
    invoke-interface {v4, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3402
    .line 3403
    .line 3404
    move-result-object v4

    .line 3405
    check-cast v4, Ljava/lang/Number;

    .line 3406
    .line 3407
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3408
    .line 3409
    .line 3410
    move-result v4

    .line 3411
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 3412
    .line 3413
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3414
    .line 3415
    .line 3416
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3417
    .line 3418
    .line 3419
    new-instance v2, Landroid/view/View;

    .line 3420
    .line 3421
    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 3422
    .line 3423
    .line 3424
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 3425
    .line 3426
    .line 3427
    move-result v3

    .line 3428
    if-eqz v3, :cond_12

    .line 3429
    .line 3430
    move-object/from16 v3, v27

    .line 3431
    .line 3432
    goto :goto_11

    .line 3433
    :cond_12
    move-object/from16 v3, v26

    .line 3434
    .line 3435
    :goto_11
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3436
    .line 3437
    .line 3438
    move-result v3

    .line 3439
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3440
    .line 3441
    .line 3442
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 3443
    .line 3444
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3445
    .line 3446
    .line 3447
    move-result-object v4

    .line 3448
    move-object/from16 v8, v74

    .line 3449
    .line 3450
    invoke-interface {v4, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3451
    .line 3452
    .line 3453
    move-result-object v4

    .line 3454
    check-cast v4, Ljava/lang/Number;

    .line 3455
    .line 3456
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3457
    .line 3458
    .line 3459
    move-result v4

    .line 3460
    const/4 v11, -0x1

    .line 3461
    invoke-direct {v3, v11, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3462
    .line 3463
    .line 3464
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3465
    .line 3466
    .line 3467
    move-result-object v4

    .line 3468
    invoke-interface {v4, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3469
    .line 3470
    .line 3471
    move-result-object v4

    .line 3472
    check-cast v4, Ljava/lang/Number;

    .line 3473
    .line 3474
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3475
    .line 3476
    .line 3477
    move-result v4

    .line 3478
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 3479
    .line 3480
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3481
    .line 3482
    .line 3483
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3484
    .line 3485
    .line 3486
    new-instance v2, Ll91;

    .line 3487
    .line 3488
    const-string v3, "DexKit"

    .line 3489
    .line 3490
    const-string v4, "\u9ad8\u6027\u80fd\u7684 DEX \u6587\u4ef6\u5206\u6790\u5e93\uff0c\u7528\u4e8e\u5feb\u901f\u5b9a\u4f4d\u6df7\u6dc6\u540e\u7684\u7c7b\u548c\u65b9\u6cd5"

    .line 3491
    .line 3492
    invoke-direct {v2, v3, v4}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3493
    .line 3494
    .line 3495
    new-instance v3, Ll91;

    .line 3496
    .line 3497
    const-string v4, "\u591a\u8d26\u53f7\u652f\u6301"

    .line 3498
    .line 3499
    const-string v9, "\u72ec\u7acb\u7684\u914d\u7f6e\u5b58\u50a8\u7cfb\u7edf\uff0c\u652f\u6301\u591a\u8d26\u53f7\u5207\u6362\u548c\u914d\u7f6e\u9694\u79bb"

    .line 3500
    .line 3501
    invoke-direct {v3, v4, v9}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3502
    .line 3503
    .line 3504
    filled-new-array {v2, v3}, [Ll91;

    .line 3505
    .line 3506
    .line 3507
    move-result-object v2

    .line 3508
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 3509
    .line 3510
    .line 3511
    move-result-object v2

    .line 3512
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3513
    .line 3514
    .line 3515
    move-result-object v3

    .line 3516
    const/4 v11, 0x0

    .line 3517
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 3518
    .line 3519
    .line 3520
    move-result v4

    .line 3521
    if-eqz v4, :cond_17

    .line 3522
    .line 3523
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3524
    .line 3525
    .line 3526
    move-result-object v4

    .line 3527
    add-int/lit8 v9, v11, 0x1

    .line 3528
    .line 3529
    if-ltz v11, :cond_16

    .line 3530
    .line 3531
    check-cast v4, Ll91;

    .line 3532
    .line 3533
    iget-object v12, v4, Ll91;->ε:Ljava/lang/Object;

    .line 3534
    .line 3535
    check-cast v12, Ljava/lang/String;

    .line 3536
    .line 3537
    iget-object v4, v4, Ll91;->ζ:Ljava/lang/Object;

    .line 3538
    .line 3539
    check-cast v4, Ljava/lang/String;

    .line 3540
    .line 3541
    new-instance v14, Landroid/widget/LinearLayout;

    .line 3542
    .line 3543
    invoke-direct {v14, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3544
    .line 3545
    .line 3546
    const/4 v15, 0x0

    .line 3547
    invoke-virtual {v14, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3548
    .line 3549
    .line 3550
    const/16 v15, 0x10

    .line 3551
    .line 3552
    invoke-virtual {v14, v15}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 3553
    .line 3554
    .line 3555
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3556
    .line 3557
    .line 3558
    move-result-object v15

    .line 3559
    move-object/from16 v16, v2

    .line 3560
    .line 3561
    move-object/from16 v2, v32

    .line 3562
    .line 3563
    invoke-interface {v15, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3564
    .line 3565
    .line 3566
    move-result-object v15

    .line 3567
    check-cast v15, Ljava/lang/Number;

    .line 3568
    .line 3569
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 3570
    .line 3571
    .line 3572
    move-result v15

    .line 3573
    move-object/from16 v18, v3

    .line 3574
    .line 3575
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3576
    .line 3577
    .line 3578
    move-result-object v3

    .line 3579
    invoke-interface {v3, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3580
    .line 3581
    .line 3582
    move-result-object v3

    .line 3583
    check-cast v3, Ljava/lang/Number;

    .line 3584
    .line 3585
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3586
    .line 3587
    .line 3588
    move-result v3

    .line 3589
    move/from16 v24, v9

    .line 3590
    .line 3591
    const/4 v9, 0x0

    .line 3592
    invoke-virtual {v14, v9, v15, v9, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 3593
    .line 3594
    .line 3595
    new-instance v3, Landroid/widget/TextView;

    .line 3596
    .line 3597
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3598
    .line 3599
    .line 3600
    const-string v9, "\u2022"

    .line 3601
    .line 3602
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3603
    .line 3604
    .line 3605
    const/high16 v9, 0x41800000    # 16.0f

    .line 3606
    .line 3607
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 3608
    .line 3609
    .line 3610
    invoke-static/range {v21 .. v21}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3611
    .line 3612
    .line 3613
    move-result v15

    .line 3614
    invoke-virtual {v3, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3615
    .line 3616
    .line 3617
    const/4 v9, 0x1

    .line 3618
    const/4 v15, 0x0

    .line 3619
    invoke-virtual {v3, v15, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 3620
    .line 3621
    .line 3622
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 3623
    .line 3624
    const/4 v15, -0x2

    .line 3625
    invoke-direct {v9, v15, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3626
    .line 3627
    .line 3628
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3629
    .line 3630
    .line 3631
    move-result-object v15

    .line 3632
    move-object/from16 v30, v6

    .line 3633
    .line 3634
    move-object/from16 v6, v42

    .line 3635
    .line 3636
    invoke-interface {v15, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3637
    .line 3638
    .line 3639
    move-result-object v15

    .line 3640
    check-cast v15, Ljava/lang/Number;

    .line 3641
    .line 3642
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 3643
    .line 3644
    .line 3645
    move-result v15

    .line 3646
    iput v15, v9, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 3647
    .line 3648
    invoke-virtual {v3, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3649
    .line 3650
    .line 3651
    invoke-virtual {v14, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3652
    .line 3653
    .line 3654
    new-instance v3, Landroid/widget/LinearLayout;

    .line 3655
    .line 3656
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3657
    .line 3658
    .line 3659
    const/4 v9, 0x1

    .line 3660
    invoke-virtual {v3, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3661
    .line 3662
    .line 3663
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 3664
    .line 3665
    move-object/from16 v44, v5

    .line 3666
    .line 3667
    move-object/from16 v39, v6

    .line 3668
    .line 3669
    const/4 v5, -0x2

    .line 3670
    const/4 v6, 0x0

    .line 3671
    const/high16 v15, 0x3f800000    # 1.0f

    .line 3672
    .line 3673
    invoke-direct {v9, v6, v5, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 3674
    .line 3675
    .line 3676
    invoke-virtual {v3, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3677
    .line 3678
    .line 3679
    new-instance v5, Landroid/widget/TextView;

    .line 3680
    .line 3681
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3682
    .line 3683
    .line 3684
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3685
    .line 3686
    .line 3687
    const/high16 v6, 0x41500000    # 13.0f

    .line 3688
    .line 3689
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 3690
    .line 3691
    .line 3692
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 3693
    .line 3694
    .line 3695
    move-result v9

    .line 3696
    if-eqz v9, :cond_13

    .line 3697
    .line 3698
    move-object/from16 v9, v17

    .line 3699
    .line 3700
    :goto_13
    const/4 v6, 0x1

    .line 3701
    const/4 v12, 0x0

    .line 3702
    goto :goto_14

    .line 3703
    :cond_13
    move-object/from16 v9, v20

    .line 3704
    .line 3705
    goto :goto_13

    .line 3706
    :goto_14
    invoke-static {v9, v5, v12, v6}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 3707
    .line 3708
    .line 3709
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3710
    .line 3711
    .line 3712
    new-instance v5, Landroid/widget/TextView;

    .line 3713
    .line 3714
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3715
    .line 3716
    .line 3717
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3718
    .line 3719
    .line 3720
    const/high16 v6, 0x41400000    # 12.0f

    .line 3721
    .line 3722
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 3723
    .line 3724
    .line 3725
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3726
    .line 3727
    .line 3728
    move-result v4

    .line 3729
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3730
    .line 3731
    .line 3732
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3733
    .line 3734
    .line 3735
    move-result-object v4

    .line 3736
    invoke-interface {v4, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3737
    .line 3738
    .line 3739
    move-result-object v4

    .line 3740
    check-cast v4, Ljava/lang/Number;

    .line 3741
    .line 3742
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3743
    .line 3744
    .line 3745
    move-result v4

    .line 3746
    const/4 v6, 0x0

    .line 3747
    invoke-virtual {v5, v6, v4, v6, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 3748
    .line 3749
    .line 3750
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3751
    .line 3752
    .line 3753
    invoke-virtual {v14, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3754
    .line 3755
    .line 3756
    invoke-virtual {v1, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3757
    .line 3758
    .line 3759
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    .line 3760
    .line 3761
    .line 3762
    move-result v3

    .line 3763
    const/4 v6, 0x1

    .line 3764
    sub-int/2addr v3, v6

    .line 3765
    if-ge v11, v3, :cond_15

    .line 3766
    .line 3767
    new-instance v3, Landroid/view/View;

    .line 3768
    .line 3769
    invoke-direct {v3, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 3770
    .line 3771
    .line 3772
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->δ()Z

    .line 3773
    .line 3774
    .line 3775
    move-result v4

    .line 3776
    if-eqz v4, :cond_14

    .line 3777
    .line 3778
    move-object/from16 v4, v27

    .line 3779
    .line 3780
    goto :goto_15

    .line 3781
    :cond_14
    move-object/from16 v4, v26

    .line 3782
    .line 3783
    :goto_15
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3784
    .line 3785
    .line 3786
    move-result v4

    .line 3787
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3788
    .line 3789
    .line 3790
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 3791
    .line 3792
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3793
    .line 3794
    .line 3795
    move-result-object v5

    .line 3796
    invoke-interface {v5, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3797
    .line 3798
    .line 3799
    move-result-object v5

    .line 3800
    check-cast v5, Ljava/lang/Number;

    .line 3801
    .line 3802
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 3803
    .line 3804
    .line 3805
    move-result v5

    .line 3806
    const/4 v11, -0x1

    .line 3807
    invoke-direct {v4, v11, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3808
    .line 3809
    .line 3810
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3811
    .line 3812
    .line 3813
    move-result-object v5

    .line 3814
    invoke-interface {v5, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3815
    .line 3816
    .line 3817
    move-result-object v5

    .line 3818
    check-cast v5, Ljava/lang/Number;

    .line 3819
    .line 3820
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 3821
    .line 3822
    .line 3823
    move-result v5

    .line 3824
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 3825
    .line 3826
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3827
    .line 3828
    .line 3829
    move-result-object v5

    .line 3830
    invoke-interface {v5, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3831
    .line 3832
    .line 3833
    move-result-object v5

    .line 3834
    check-cast v5, Ljava/lang/Number;

    .line 3835
    .line 3836
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 3837
    .line 3838
    .line 3839
    move-result v5

    .line 3840
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 3841
    .line 3842
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3843
    .line 3844
    .line 3845
    move-result-object v5

    .line 3846
    invoke-interface {v5, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3847
    .line 3848
    .line 3849
    move-result-object v5

    .line 3850
    check-cast v5, Ljava/lang/Number;

    .line 3851
    .line 3852
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 3853
    .line 3854
    .line 3855
    move-result v5

    .line 3856
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 3857
    .line 3858
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3859
    .line 3860
    .line 3861
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3862
    .line 3863
    .line 3864
    goto :goto_16

    .line 3865
    :cond_15
    const/4 v11, -0x1

    .line 3866
    :goto_16
    move-object/from16 v32, v2

    .line 3867
    .line 3868
    move-object/from16 v2, v16

    .line 3869
    .line 3870
    move-object/from16 v3, v18

    .line 3871
    .line 3872
    move/from16 v11, v24

    .line 3873
    .line 3874
    move-object/from16 v6, v30

    .line 3875
    .line 3876
    move-object/from16 v42, v39

    .line 3877
    .line 3878
    move-object/from16 v5, v44

    .line 3879
    .line 3880
    goto/16 :goto_12

    .line 3881
    .line 3882
    :cond_16
    invoke-static {}, Lyh;->х()V

    .line 3883
    .line 3884
    .line 3885
    const/4 v15, 0x0

    .line 3886
    throw v15

    .line 3887
    :cond_17
    move-object/from16 v44, v5

    .line 3888
    .line 3889
    move-object/from16 v30, v6

    .line 3890
    .line 3891
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3892
    .line 3893
    .line 3894
    new-instance v1, Landroid/widget/LinearLayout;

    .line 3895
    .line 3896
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3897
    .line 3898
    .line 3899
    const/4 v6, 0x1

    .line 3900
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3901
    .line 3902
    .line 3903
    const/16 v11, 0x11

    .line 3904
    .line 3905
    invoke-virtual {v1, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 3906
    .line 3907
    .line 3908
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3909
    .line 3910
    .line 3911
    move-result-object v2

    .line 3912
    invoke-interface {v2, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3913
    .line 3914
    .line 3915
    move-result-object v2

    .line 3916
    check-cast v2, Ljava/lang/Number;

    .line 3917
    .line 3918
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 3919
    .line 3920
    .line 3921
    move-result v2

    .line 3922
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3923
    .line 3924
    .line 3925
    move-result-object v3

    .line 3926
    move-object/from16 v9, v41

    .line 3927
    .line 3928
    invoke-interface {v3, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3929
    .line 3930
    .line 3931
    move-result-object v3

    .line 3932
    check-cast v3, Ljava/lang/Number;

    .line 3933
    .line 3934
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3935
    .line 3936
    .line 3937
    move-result v3

    .line 3938
    const/4 v13, 0x0

    .line 3939
    invoke-virtual {v1, v13, v2, v13, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 3940
    .line 3941
    .line 3942
    new-instance v2, Landroid/view/View;

    .line 3943
    .line 3944
    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 3945
    .line 3946
    .line 3947
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3948
    .line 3949
    .line 3950
    move-result v3

    .line 3951
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3952
    .line 3953
    .line 3954
    const v3, 0x3e99999a    # 0.3f

    .line 3955
    .line 3956
    .line 3957
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 3958
    .line 3959
    .line 3960
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 3961
    .line 3962
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3963
    .line 3964
    .line 3965
    move-result-object v4

    .line 3966
    move-object/from16 v5, v37

    .line 3967
    .line 3968
    invoke-interface {v4, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3969
    .line 3970
    .line 3971
    move-result-object v4

    .line 3972
    check-cast v4, Ljava/lang/Number;

    .line 3973
    .line 3974
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3975
    .line 3976
    .line 3977
    move-result v4

    .line 3978
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3979
    .line 3980
    .line 3981
    move-result-object v5

    .line 3982
    invoke-interface {v5, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3983
    .line 3984
    .line 3985
    move-result-object v5

    .line 3986
    check-cast v5, Ljava/lang/Number;

    .line 3987
    .line 3988
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 3989
    .line 3990
    .line 3991
    move-result v5

    .line 3992
    invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3993
    .line 3994
    .line 3995
    const/4 v6, 0x1

    .line 3996
    iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 3997
    .line 3998
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 3999
    .line 4000
    .line 4001
    move-result-object v4

    .line 4002
    move-object/from16 v6, v30

    .line 4003
    .line 4004
    invoke-interface {v4, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4005
    .line 4006
    .line 4007
    move-result-object v4

    .line 4008
    check-cast v4, Ljava/lang/Number;

    .line 4009
    .line 4010
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 4011
    .line 4012
    .line 4013
    move-result v4

    .line 4014
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 4015
    .line 4016
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4017
    .line 4018
    .line 4019
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4020
    .line 4021
    .line 4022
    new-instance v2, Landroid/widget/TextView;

    .line 4023
    .line 4024
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4025
    .line 4026
    .line 4027
    const-string v3, "DY Helper v1.4.15"

    .line 4028
    .line 4029
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4030
    .line 4031
    .line 4032
    const/high16 v6, 0x41400000    # 12.0f

    .line 4033
    .line 4034
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 4035
    .line 4036
    .line 4037
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4038
    .line 4039
    .line 4040
    move-result v3

    .line 4041
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4042
    .line 4043
    .line 4044
    const/16 v11, 0x11

    .line 4045
    .line 4046
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 4047
    .line 4048
    .line 4049
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 4050
    .line 4051
    const/4 v13, -0x2

    .line 4052
    invoke-direct {v3, v13, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 4053
    .line 4054
    .line 4055
    const/4 v6, 0x1

    .line 4056
    iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 4057
    .line 4058
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 4059
    .line 4060
    .line 4061
    move-result-object v4

    .line 4062
    move-object/from16 v15, v40

    .line 4063
    .line 4064
    invoke-interface {v4, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4065
    .line 4066
    .line 4067
    move-result-object v4

    .line 4068
    check-cast v4, Ljava/lang/Number;

    .line 4069
    .line 4070
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 4071
    .line 4072
    .line 4073
    move-result v4

    .line 4074
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 4075
    .line 4076
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4077
    .line 4078
    .line 4079
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4080
    .line 4081
    .line 4082
    new-instance v2, Landroid/widget/TextView;

    .line 4083
    .line 4084
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4085
    .line 4086
    .line 4087
    const-string v3, "Made with code by MF"

    .line 4088
    .line 4089
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4090
    .line 4091
    .line 4092
    const/high16 v3, 0x41300000    # 11.0f

    .line 4093
    .line 4094
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 4095
    .line 4096
    .line 4097
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4098
    .line 4099
    .line 4100
    move-result v3

    .line 4101
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4102
    .line 4103
    .line 4104
    const/16 v11, 0x11

    .line 4105
    .line 4106
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 4107
    .line 4108
    .line 4109
    const v3, 0x3f333333    # 0.7f

    .line 4110
    .line 4111
    .line 4112
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 4113
    .line 4114
    .line 4115
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 4116
    .line 4117
    const/4 v13, -0x2

    .line 4118
    invoke-direct {v3, v13, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 4119
    .line 4120
    .line 4121
    const/4 v6, 0x1

    .line 4122
    iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 4123
    .line 4124
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4125
    .line 4126
    .line 4127
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4128
    .line 4129
    .line 4130
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4131
    .line 4132
    .line 4133
    move-object/from16 v1, v38

    .line 4134
    .line 4135
    invoke-virtual {v1, v10}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 4136
    .line 4137
    .line 4138
    move-object/from16 v2, v75

    .line 4139
    .line 4140
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4141
    .line 4142
    .line 4143
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 4144
    .line 4145
    .line 4146
    return-void
.end method

.method public final α(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/16 v2, 0x8

    .line 9
    .line 10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/16 v3, 0xc

    .line 15
    .line 16
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    new-instance v4, Landroid/widget/LinearLayout;

    .line 21
    .line 22
    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 31
    .line 32
    .line 33
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    .line 34
    .line 35
    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static/range {p2 .. p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    const/16 v9, 0x10

    .line 50
    .line 51
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    invoke-interface {v8, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    check-cast v8, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    int-to-float v8, v8

    .line 66
    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-interface {v8, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    check-cast v8, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    invoke-static/range {p3 .. p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    invoke-virtual {v7, v8, v11}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 94
    .line 95
    const/4 v8, -0x1

    .line 96
    const/4 v11, -0x2

    .line 97
    invoke-direct {v7, v8, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    const/16 v13, 0x18

    .line 105
    .line 106
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    invoke-interface {v12, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    check-cast v12, Ljava/lang/Number;

    .line 115
    .line 116
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    iput v12, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 121
    .line 122
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    .line 124
    .line 125
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    const/4 v12, 0x0

    .line 130
    move v13, v12

    .line 131
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v14

    .line 135
    if-eqz v14, :cond_2

    .line 136
    .line 137
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    add-int/lit8 v15, v13, 0x1

    .line 142
    .line 143
    if-ltz v13, :cond_1

    .line 144
    .line 145
    check-cast v14, Lι;

    .line 146
    .line 147
    new-instance v11, Landroid/widget/LinearLayout;

    .line 148
    .line 149
    invoke-direct {v11, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v11, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v11, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    invoke-interface {v9, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    check-cast v9, Ljava/lang/Number;

    .line 167
    .line 168
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    invoke-interface {v12, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    check-cast v12, Ljava/lang/Number;

    .line 181
    .line 182
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-interface {v5, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    check-cast v5, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    invoke-interface {v8, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    check-cast v8, Ljava/lang/Number;

    .line 209
    .line 210
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    invoke-virtual {v11, v9, v12, v5, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 215
    .line 216
    .line 217
    new-instance v5, Landroid/widget/TextView;

    .line 218
    .line 219
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 220
    .line 221
    .line 222
    iget-object v8, v14, Lι;->α:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    .line 226
    .line 227
    const/high16 v8, 0x41300000    # 11.0f

    .line 228
    .line 229
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 230
    .line 231
    .line 232
    invoke-static/range {p6 .. p6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 237
    .line 238
    .line 239
    const/4 v8, 0x0

    .line 240
    const/4 v9, 0x1

    .line 241
    invoke-virtual {v5, v8, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 242
    .line 243
    .line 244
    const/16 v8, 0x11

    .line 245
    .line 246
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    const/16 v9, 0x2a

    .line 254
    .line 255
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-interface {v8, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    check-cast v8, Ljava/lang/Number;

    .line 264
    .line 265
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    invoke-interface {v8, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    check-cast v8, Ljava/lang/Number;

    .line 281
    .line 282
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    invoke-interface {v9, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    check-cast v9, Ljava/lang/Number;

    .line 295
    .line 296
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 301
    .line 302
    .line 303
    move-result-object v12

    .line 304
    invoke-interface {v12, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v12

    .line 308
    check-cast v12, Ljava/lang/Number;

    .line 309
    .line 310
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 311
    .line 312
    .line 313
    move-result v12

    .line 314
    move-object/from16 v18, v2

    .line 315
    .line 316
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-interface {v2, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    check-cast v2, Ljava/lang/Number;

    .line 325
    .line 326
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    invoke-virtual {v5, v8, v9, v12, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 331
    .line 332
    .line 333
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 334
    .line 335
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-static/range {p7 .. p7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    const/16 v9, 0xa

    .line 350
    .line 351
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    invoke-interface {v8, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    check-cast v8, Ljava/lang/Number;

    .line 360
    .line 361
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 362
    .line 363
    .line 364
    move-result v8

    .line 365
    int-to-float v8, v8

    .line 366
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v5, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 370
    .line 371
    .line 372
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 373
    .line 374
    const/4 v8, -0x2

    .line 375
    invoke-direct {v2, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 379
    .line 380
    .line 381
    move-result-object v8

    .line 382
    invoke-interface {v8, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    check-cast v8, Ljava/lang/Number;

    .line 387
    .line 388
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    iput v8, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 393
    .line 394
    invoke-virtual {v5, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 398
    .line 399
    .line 400
    new-instance v2, Landroid/widget/LinearLayout;

    .line 401
    .line 402
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 403
    .line 404
    .line 405
    const/4 v9, 0x1

    .line 406
    invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 407
    .line 408
    .line 409
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 410
    .line 411
    const/high16 v8, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/4 v9, -0x2

    .line 414
    const/4 v12, 0x0

    .line 415
    invoke-direct {v5, v12, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 419
    .line 420
    .line 421
    new-instance v5, Landroid/widget/TextView;

    .line 422
    .line 423
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 424
    .line 425
    .line 426
    iget-object v12, v14, Lι;->β:Ljava/lang/String;

    .line 427
    .line 428
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    .line 430
    .line 431
    const/high16 v12, 0x41600000    # 14.0f

    .line 432
    .line 433
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 434
    .line 435
    .line 436
    invoke-static/range {p4 .. p4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 437
    .line 438
    .line 439
    move-result v12

    .line 440
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 441
    .line 442
    .line 443
    const/4 v9, 0x1

    .line 444
    const/4 v12, 0x0

    .line 445
    invoke-virtual {v5, v12, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 449
    .line 450
    .line 451
    new-instance v5, Landroid/widget/TextView;

    .line 452
    .line 453
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 454
    .line 455
    .line 456
    iget-object v9, v14, Lι;->γ:Ljava/lang/String;

    .line 457
    .line 458
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 459
    .line 460
    .line 461
    const/high16 v9, 0x41400000    # 12.0f

    .line 462
    .line 463
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 464
    .line 465
    .line 466
    invoke-static/range {p5 .. p5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 467
    .line 468
    .line 469
    move-result v9

    .line 470
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 474
    .line 475
    .line 476
    move-result-object v9

    .line 477
    const/4 v12, 0x3

    .line 478
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 479
    .line 480
    .line 481
    move-result-object v12

    .line 482
    invoke-interface {v9, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v9

    .line 486
    check-cast v9, Ljava/lang/Number;

    .line 487
    .line 488
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 489
    .line 490
    .line 491
    move-result v9

    .line 492
    const/4 v12, 0x0

    .line 493
    invoke-virtual {v5, v12, v9, v12, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    const/4 v14, 0x2

    .line 501
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v14

    .line 505
    invoke-interface {v9, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v9

    .line 509
    check-cast v9, Ljava/lang/Number;

    .line 510
    .line 511
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 512
    .line 513
    .line 514
    move-result v9

    .line 515
    int-to-float v9, v9

    .line 516
    invoke-virtual {v5, v9, v8}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v4, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 526
    .line 527
    .line 528
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    const/16 v16, 0x1

    .line 533
    .line 534
    add-int/lit8 v2, v2, -0x1

    .line 535
    .line 536
    if-ge v13, v2, :cond_0

    .line 537
    .line 538
    new-instance v2, Landroid/view/View;

    .line 539
    .line 540
    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 541
    .line 542
    .line 543
    invoke-static/range {p8 .. p8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    invoke-virtual {v2, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 548
    .line 549
    .line 550
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 551
    .line 552
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 553
    .line 554
    .line 555
    move-result-object v8

    .line 556
    invoke-interface {v8, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v8

    .line 560
    check-cast v8, Ljava/lang/Number;

    .line 561
    .line 562
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 563
    .line 564
    .line 565
    move-result v8

    .line 566
    const/4 v9, -0x1

    .line 567
    invoke-direct {v5, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 571
    .line 572
    .line 573
    move-result-object v8

    .line 574
    const/16 v11, 0x46

    .line 575
    .line 576
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 577
    .line 578
    .line 579
    move-result-object v11

    .line 580
    invoke-interface {v8, v11}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    check-cast v8, Ljava/lang/Number;

    .line 585
    .line 586
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 587
    .line 588
    .line 589
    move-result v8

    .line 590
    iput v8, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 591
    .line 592
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 593
    .line 594
    .line 595
    move-result-object v8

    .line 596
    invoke-interface {v8, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v8

    .line 600
    check-cast v8, Ljava/lang/Number;

    .line 601
    .line 602
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 603
    .line 604
    .line 605
    move-result v8

    .line 606
    iput v8, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 607
    .line 608
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 612
    .line 613
    .line 614
    goto :goto_1

    .line 615
    :cond_0
    const/4 v9, -0x1

    .line 616
    :goto_1
    move v8, v9

    .line 617
    move v13, v15

    .line 618
    move/from16 v5, v16

    .line 619
    .line 620
    move-object/from16 v2, v18

    .line 621
    .line 622
    const/16 v9, 0x10

    .line 623
    .line 624
    const/4 v11, -0x2

    .line 625
    goto/16 :goto_0

    .line 626
    .line 627
    :cond_1
    invoke-static {}, Lyh;->х()V

    .line 628
    .line 629
    .line 630
    const/16 v17, 0x0

    .line 631
    .line 632
    throw v17

    .line 633
    :cond_2
    return-object v4
.end method

.method public final β(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p1, 0x41800000    # 16.0f

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 27
    .line 28
    const/4 p2, -0x1

    .line 29
    const/4 v1, -0x2

    .line 30
    invoke-direct {p1, p2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/AboutActivity;->γ()La80;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/16 p2, 0xc

    .line 38
    .line 39
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-interface {p0, p2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    iput p0, p1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method public final γ()La80;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/ui/AboutActivity;->ε:Lh22;

    .line 2
    .line 3
    invoke-virtual {p0}, Lh22;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La80;

    .line 8
    .line 9
    return-object p0
.end method

.method public final δ()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 10
    .line 11
    and-int/lit8 p0, p0, 0x30

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method
