.class public final Lcom/example/dyhelper/ui/MainActivity;
.super Landroid/app/Activity;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic η:I


# instance fields
.field public final ε:Lh22;

.field public final ζ:Lh22;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lmw0;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Lmw0;-><init>(Lcom/example/dyhelper/ui/MainActivity;I)V

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
    iput-object v1, p0, Lcom/example/dyhelper/ui/MainActivity;->ε:Lh22;

    .line 16
    .line 17
    new-instance v0, Lmw0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, v1}, Lmw0;-><init>(Lcom/example/dyhelper/ui/MainActivity;I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lh22;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lh22;-><init>(Lp70;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/example/dyhelper/ui/MainActivity;->ζ:Lh22;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/view/Window;->addFlags(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->δ()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "#FAFAFA"

    .line 20
    .line 21
    const-string v4, "#121212"

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->δ()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->δ()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/16 v2, 0x2010

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 68
    .line 69
    .line 70
    :cond_2
    const/16 v1, 0x18

    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const/4 v2, 0x3

    .line 77
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const/16 v3, 0xa

    .line 82
    .line 83
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const/16 v4, 0xc

    .line 88
    .line 89
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    const/4 v5, 0x6

    .line 94
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    const/16 v6, 0x14

    .line 99
    .line 100
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    const/16 v7, 0x10

    .line 105
    .line 106
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    const/16 v9, 0xe

    .line 111
    .line 112
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    const/4 v10, 0x1

    .line 117
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->δ()Z

    .line 122
    .line 123
    .line 124
    move-result v12

    .line 125
    if-eqz v12, :cond_3

    .line 126
    .line 127
    new-instance v13, Lnw0;

    .line 128
    .line 129
    const-string v28, "#332196F3"

    .line 130
    .line 131
    const-string v29, "#337C4DFF"

    .line 132
    .line 133
    const-string v14, "#121212"

    .line 134
    .line 135
    const-string v15, "#1E1E1E"

    .line 136
    .line 137
    const-string v16, "#2A2A2A"

    .line 138
    .line 139
    const-string v17, "#FFFFFF"

    .line 140
    .line 141
    const-string v18, "#E0E0E0"

    .line 142
    .line 143
    const-string v19, "#9A9AA0"

    .line 144
    .line 145
    const-string v20, "#33FE2C55"

    .line 146
    .line 147
    const-string v21, "#2AFFFFFF"

    .line 148
    .line 149
    const-string v22, "#333333"

    .line 150
    .line 151
    const-string v23, "#4CAF50"

    .line 152
    .line 153
    const-string v24, "#334CAF50"

    .line 154
    .line 155
    const-string v25, "#FF9800"

    .line 156
    .line 157
    const-string v26, "#33FF9800"

    .line 158
    .line 159
    const-string v27, "#2196F3"

    .line 160
    .line 161
    invoke-direct/range {v13 .. v29}, Lnw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_3
    new-instance v14, Lnw0;

    .line 166
    .line 167
    const-string v29, "#1A007AFF"

    .line 168
    .line 169
    const-string v30, "#1A7C4DFF"

    .line 170
    .line 171
    const-string v15, "#FAFAFA"

    .line 172
    .line 173
    const-string v16, "#FFFFFF"

    .line 174
    .line 175
    const-string v17, "#F5F5F7"

    .line 176
    .line 177
    const-string v18, "#1A1A2E"

    .line 178
    .line 179
    const-string v19, "#3D3D5C"

    .line 180
    .line 181
    const-string v20, "#8E8E93"

    .line 182
    .line 183
    const-string v21, "#1AFE2C55"

    .line 184
    .line 185
    const-string v22, "#12000000"

    .line 186
    .line 187
    const-string v23, "#E8E8ED"

    .line 188
    .line 189
    const-string v24, "#34C759"

    .line 190
    .line 191
    const-string v25, "#1A34C759"

    .line 192
    .line 193
    const-string v26, "#FF9500"

    .line 194
    .line 195
    const-string v27, "#1AFF9500"

    .line 196
    .line 197
    const-string v28, "#007AFF"

    .line 198
    .line 199
    invoke-direct/range {v14 .. v30}, Lnw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    move-object v13, v14

    .line 203
    :goto_2
    new-instance v12, Landroid/widget/LinearLayout;

    .line 204
    .line 205
    invoke-direct {v12, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 209
    .line 210
    .line 211
    iget-object v14, v13, Lnw0;->α:Ljava/lang/String;

    .line 212
    .line 213
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    move-result v14

    .line 217
    invoke-virtual {v12, v14}, Landroid/view/View;->setBackgroundColor(I)V

    .line 218
    .line 219
    .line 220
    new-instance v14, Landroid/view/ViewGroup$LayoutParams;

    .line 221
    .line 222
    const/4 v15, -0x1

    .line 223
    invoke-direct {v14, v15, v15}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 227
    .line 228
    .line 229
    new-instance v14, Landroid/widget/ScrollView;

    .line 230
    .line 231
    invoke-direct {v14, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 232
    .line 233
    .line 234
    const/4 v15, 0x2

    .line 235
    invoke-virtual {v14, v15}, Landroid/view/View;->setOverScrollMode(I)V

    .line 236
    .line 237
    .line 238
    const/4 v15, 0x0

    .line 239
    invoke-virtual {v14, v15}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 240
    .line 241
    .line 242
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 243
    .line 244
    const/4 v15, -0x1

    .line 245
    invoke-direct {v7, v15, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v14, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 249
    .line 250
    .line 251
    new-instance v7, Landroid/widget/LinearLayout;

    .line 252
    .line 253
    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v7, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 260
    .line 261
    .line 262
    move-result-object v15

    .line 263
    invoke-interface {v15, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v15

    .line 267
    check-cast v15, Ljava/lang/Number;

    .line 268
    .line 269
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 270
    .line 271
    .line 272
    move-result v15

    .line 273
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    const/16 v18, 0x30

    .line 278
    .line 279
    move-object/from16 v19, v12

    .line 280
    .line 281
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v12

    .line 285
    invoke-interface {v10, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v10

    .line 289
    check-cast v10, Ljava/lang/Number;

    .line 290
    .line 291
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 296
    .line 297
    .line 298
    move-result-object v12

    .line 299
    invoke-interface {v12, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    check-cast v6, Ljava/lang/Number;

    .line 304
    .line 305
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 310
    .line 311
    .line 312
    move-result-object v12

    .line 313
    const/16 v18, 0x24

    .line 314
    .line 315
    move-object/from16 v20, v14

    .line 316
    .line 317
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 318
    .line 319
    .line 320
    move-result-object v14

    .line 321
    invoke-interface {v12, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v12

    .line 325
    check-cast v12, Ljava/lang/Number;

    .line 326
    .line 327
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v12

    .line 331
    invoke-virtual {v7, v15, v10, v6, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 332
    .line 333
    .line 334
    new-instance v6, Landroid/widget/LinearLayout;

    .line 335
    .line 336
    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 337
    .line 338
    .line 339
    const/4 v10, 0x1

    .line 340
    invoke-virtual {v6, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 341
    .line 342
    .line 343
    const/16 v10, 0x11

    .line 344
    .line 345
    invoke-virtual {v6, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 346
    .line 347
    .line 348
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 349
    .line 350
    const/4 v12, -0x2

    .line 351
    const/4 v14, -0x1

    .line 352
    invoke-direct {v10, v14, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 356
    .line 357
    .line 358
    move-result-object v12

    .line 359
    const/16 v14, 0x16

    .line 360
    .line 361
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v14

    .line 365
    invoke-interface {v12, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v12

    .line 369
    check-cast v12, Ljava/lang/Number;

    .line 370
    .line 371
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result v12

    .line 375
    iput v12, v10, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 376
    .line 377
    invoke-virtual {v6, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 378
    .line 379
    .line 380
    new-instance v10, Landroid/widget/LinearLayout;

    .line 381
    .line 382
    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 383
    .line 384
    .line 385
    const/16 v12, 0x11

    .line 386
    .line 387
    invoke-virtual {v10, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 388
    .line 389
    .line 390
    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    .line 391
    .line 392
    invoke-direct {v12}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 393
    .line 394
    .line 395
    const/4 v14, 0x1

    .line 396
    invoke-virtual {v12, v14}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 397
    .line 398
    .line 399
    const-string v14, "#FE2C55"

    .line 400
    .line 401
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 402
    .line 403
    .line 404
    move-result v15

    .line 405
    invoke-virtual {v12, v15}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v10, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 409
    .line 410
    .line 411
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 412
    .line 413
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 414
    .line 415
    .line 416
    move-result-object v15

    .line 417
    const/16 v18, 0x48

    .line 418
    .line 419
    move-object/from16 v21, v14

    .line 420
    .line 421
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v14

    .line 425
    invoke-interface {v15, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v15

    .line 429
    check-cast v15, Ljava/lang/Number;

    .line 430
    .line 431
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result v15

    .line 435
    move-object/from16 v18, v1

    .line 436
    .line 437
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-interface {v1, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    check-cast v1, Ljava/lang/Number;

    .line 446
    .line 447
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    invoke-direct {v12, v15, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 452
    .line 453
    .line 454
    const/4 v14, 0x1

    .line 455
    iput v14, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 456
    .line 457
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    invoke-interface {v1, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    check-cast v1, Ljava/lang/Number;

    .line 466
    .line 467
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 468
    .line 469
    .line 470
    move-result v1

    .line 471
    iput v1, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 472
    .line 473
    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 474
    .line 475
    .line 476
    new-instance v1, Landroid/widget/TextView;

    .line 477
    .line 478
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 479
    .line 480
    .line 481
    const-string v12, "DY"

    .line 482
    .line 483
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 484
    .line 485
    .line 486
    const/high16 v12, 0x41d00000    # 26.0f

    .line 487
    .line 488
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 489
    .line 490
    .line 491
    const/4 v12, -0x1

    .line 492
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 493
    .line 494
    .line 495
    const/4 v12, 0x0

    .line 496
    const/4 v14, 0x1

    .line 497
    invoke-virtual {v1, v12, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 498
    .line 499
    .line 500
    const/16 v12, 0x11

    .line 501
    .line 502
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v6, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 509
    .line 510
    .line 511
    new-instance v1, Landroid/widget/TextView;

    .line 512
    .line 513
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 514
    .line 515
    .line 516
    const-string v10, "DY Helper"

    .line 517
    .line 518
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 519
    .line 520
    .line 521
    const/high16 v10, 0x41e00000    # 28.0f

    .line 522
    .line 523
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 524
    .line 525
    .line 526
    iget-object v10, v13, Lnw0;->δ:Ljava/lang/String;

    .line 527
    .line 528
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 529
    .line 530
    .line 531
    move-result v12

    .line 532
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 533
    .line 534
    .line 535
    const/4 v12, 0x0

    .line 536
    const/4 v14, 0x1

    .line 537
    invoke-virtual {v1, v12, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 538
    .line 539
    .line 540
    const/16 v12, 0x11

    .line 541
    .line 542
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 543
    .line 544
    .line 545
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 546
    .line 547
    const/4 v15, -0x2

    .line 548
    invoke-direct {v12, v15, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 549
    .line 550
    .line 551
    iput v14, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 552
    .line 553
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 554
    .line 555
    .line 556
    move-result-object v14

    .line 557
    invoke-interface {v14, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v14

    .line 561
    check-cast v14, Ljava/lang/Number;

    .line 562
    .line 563
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 564
    .line 565
    .line 566
    move-result v14

    .line 567
    iput v14, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 568
    .line 569
    invoke-virtual {v1, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 573
    .line 574
    .line 575
    new-instance v1, Landroid/widget/TextView;

    .line 576
    .line 577
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 578
    .line 579
    .line 580
    const-string v12, "DY \u89c6\u9891 / \u56fe\u6587 / \u8bc4\u8bba / \u79c1\u4fe1\u589e\u5f3a\u6a21\u5757"

    .line 581
    .line 582
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 583
    .line 584
    .line 585
    const/high16 v12, 0x41500000    # 13.0f

    .line 586
    .line 587
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 588
    .line 589
    .line 590
    iget-object v12, v13, Lnw0;->ζ:Ljava/lang/String;

    .line 591
    .line 592
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 593
    .line 594
    .line 595
    move-result v14

    .line 596
    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 597
    .line 598
    .line 599
    const/16 v14, 0x11

    .line 600
    .line 601
    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 602
    .line 603
    .line 604
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 605
    .line 606
    invoke-direct {v14, v15, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 607
    .line 608
    .line 609
    const/4 v15, 0x1

    .line 610
    iput v15, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 611
    .line 612
    invoke-virtual {v1, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 619
    .line 620
    .line 621
    const-string v1, "\u6b63\u5f0f\u529f\u80fd"

    .line 622
    .line 623
    invoke-virtual {v0, v1, v13}, Lcom/example/dyhelper/ui/MainActivity;->β(Ljava/lang/String;Lnw0;)Landroid/widget/TextView;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 628
    .line 629
    .line 630
    new-instance v22, Lpw0;

    .line 631
    .line 632
    const-string v26, "Feed \u6d41\u624b\u52bf\u914d\u7f6e"

    .line 633
    .line 634
    const-string v27, "\u53ef\u4e3a\u4e0d\u540c\u5c4f\u5e55\u533a\u57df\u914d\u7f6e\u53cc\u51fb / \u957f\u6309\u52a8\u4f5c\uff1b\u9884\u89c8\u6a21\u5f0f\u652f\u6301\u8c03\u6574\u4e0a\u4e0b\u5de6\u53f3\u5c4f\u5e55\u95f4\u8ddd\u4e0e\u89e6\u53d1\u9762\u79ef\u3002"

    .line 635
    .line 636
    const-string v23, "\u624b\u52bf"

    .line 637
    .line 638
    iget-object v1, v13, Lnw0;->ξ:Ljava/lang/String;

    .line 639
    .line 640
    iget-object v6, v13, Lnw0;->ο:Ljava/lang/String;

    .line 641
    .line 642
    move-object/from16 v24, v1

    .line 643
    .line 644
    move-object/from16 v25, v6

    .line 645
    .line 646
    invoke-direct/range {v22 .. v27}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    move-object/from16 v1, v22

    .line 650
    .line 651
    move-object/from16 v30, v24

    .line 652
    .line 653
    move-object/from16 v31, v25

    .line 654
    .line 655
    new-instance v28, Lpw0;

    .line 656
    .line 657
    const-string v32, "\u4e66\u7b7e\u4e0e\u539f\u751f\u4e92\u52a8\u52a8\u4f5c"

    .line 658
    .line 659
    const-string v33, "\u624b\u52bf\u53ef\u6dfb\u52a0\u5f53\u524d\u4f5c\u54c1\u4e66\u7b7e\u6216\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e\uff0c\u4e5f\u53ef\u8c03\u7528\u70b9\u8d5e\u3001\u8bc4\u8bba\u3001\u6536\u85cf\u3001\u5206\u4eab\u3001\u4f5c\u8005\u4e3b\u9875\u548c\u5173\u6ce8\uff1b\u5bf9\u5e94\u53f3\u4fa7\u63a7\u4ef6\u88ab\u9690\u85cf\u540e\u4ecd\u53ef\u89e6\u53d1\u3002"

    .line 660
    .line 661
    const-string v29, "\u52a8\u4f5c"

    .line 662
    .line 663
    invoke-direct/range {v28 .. v33}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    move-object/from16 v6, v28

    .line 667
    .line 668
    new-instance v28, Lpw0;

    .line 669
    .line 670
    const-string v32, "\u7981\u7528\u53cc\u51fb\u70b9\u8d5e"

    .line 671
    .line 672
    const-string v33, "\u53ef\u5355\u72ec\u62e6\u622a Feed \u539f\u751f\u53cc\u51fb\u70b9\u8d5e\uff1b\u5df2\u914d\u7f6e\u7684\u6a21\u5757\u53cc\u51fb\u624b\u52bf\u4ecd\u4f18\u5148\u6267\u884c\u3002"

    .line 673
    .line 674
    const-string v29, "\u53cc\u51fb"

    .line 675
    .line 676
    invoke-direct/range {v28 .. v33}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    move-object/from16 v14, v28

    .line 680
    .line 681
    new-instance v28, Lpw0;

    .line 682
    .line 683
    const-string v32, "\u97f3\u91cf\u952e\u7ec4\u5408\u5524\u51fa"

    .line 684
    .line 685
    const-string v33, "\u5148\u6309\u97f3\u91cf+\uff0c\u518d\u6309\u97f3\u91cf-\uff0c\u5feb\u901f\u5524\u51fa DY Helper \u64cd\u4f5c\u83dc\u5355\u3002"

    .line 686
    .line 687
    const-string v29, "\u97f3\u91cf"

    .line 688
    .line 689
    invoke-direct/range {v28 .. v33}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    move-object/from16 v15, v28

    .line 693
    .line 694
    new-instance v28, Lpw0;

    .line 695
    .line 696
    const-string v32, "\u5206\u4eab\u754c\u9762\u6ce8\u5165"

    .line 697
    .line 698
    const-string v33, "\u5728\u6296\u97f3\u5206\u4eab\u9762\u677f\u4e2d\u6dfb\u52a0 DY Helper \u5feb\u6377\u4e0b\u8f7d\u5165\u53e3\u3002"

    .line 699
    .line 700
    const-string v29, "\u5206\u4eab"

    .line 701
    .line 702
    invoke-direct/range {v28 .. v33}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    move-object/from16 v22, v10

    .line 706
    .line 707
    move-object/from16 v10, v28

    .line 708
    .line 709
    filled-new-array {v1, v6, v14, v15, v10}, [Lpw0;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v34

    .line 717
    new-instance v35, Low0;

    .line 718
    .line 719
    move-object/from16 v33, v31

    .line 720
    .line 721
    const-string v31, "\u624b\u52bf\u3001\u97f3\u91cf\u952e\u3001\u5206\u4eab\u9762\u677f\u5165\u53e3"

    .line 722
    .line 723
    move-object/from16 v28, v35

    .line 724
    .line 725
    const/16 v35, 0x1

    .line 726
    .line 727
    const-string v29, "\u5165\u53e3"

    .line 728
    .line 729
    move-object/from16 v32, v30

    .line 730
    .line 731
    const-string v30, "\u6fc0\u6d3b\u83dc\u5355"

    .line 732
    .line 733
    invoke-direct/range {v28 .. v35}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 734
    .line 735
    .line 736
    move-object/from16 v1, v28

    .line 737
    .line 738
    move-object/from16 v30, v32

    .line 739
    .line 740
    move-object/from16 v31, v33

    .line 741
    .line 742
    new-instance v32, Low0;

    .line 743
    .line 744
    new-instance v23, Lpw0;

    .line 745
    .line 746
    const-string v27, "\u89c6\u9891 / \u56fe\u7247\u4e0b\u8f7d\u76ee\u5f55"

    .line 747
    .line 748
    const-string v28, "\u4fdd\u7559 /sdcard/dy/{nickname}_{currentTime} \u7b49\u7edd\u5bf9\u5171\u4eab\u5b58\u50a8\u8def\u5f84\u8bed\u4e49\uff0c\u5e76\u517c\u5bb9\u5e94\u7528\u5206\u8eab\u7a7a\u95f4\uff1b\u65e0\u6cd5\u7cbe\u786e\u5199\u5165\u65f6\u4f1a\u63d0\u793a\u91cd\u65b0\u9009\u62e9\u76ee\u5f55\u3002"

    .line 749
    .line 750
    const-string v24, "\u76ee\u5f55"

    .line 751
    .line 752
    const-string v25, "#FE2C55"

    .line 753
    .line 754
    iget-object v6, v13, Lnw0;->η:Ljava/lang/String;

    .line 755
    .line 756
    move-object/from16 v26, v6

    .line 757
    .line 758
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    move-object/from16 v36, v26

    .line 762
    .line 763
    new-instance v33, Lpw0;

    .line 764
    .line 765
    const-string v37, "\u89c6\u9891 / \u56fe\u7247\u547d\u540d\u89c4\u5219"

    .line 766
    .line 767
    const-string v38, "\u89c6\u9891\u3001\u56fe\u7247\u3001\u52a8\u56fe\u3001LivePhoto\u3001\u97f3\u4e50\u548c\u8bc4\u8bba\u5a92\u4f53\u7edf\u4e00\u4f7f\u7528\u6700\u7ec8\u540d\u79f0\u51b3\u7b56\uff1b\u786e\u8ba4\u5f39\u7a97\u8f93\u5165\u4f18\u5148\uff0c\u5e76\u81ea\u52a8\u5904\u7406\u975e\u6cd5\u5b57\u7b26\u4e0e\u6269\u5c55\u540d\u3002"

    .line 768
    .line 769
    const-string v34, "\u547d\u540d"

    .line 770
    .line 771
    const-string v35, "#FE2C55"

    .line 772
    .line 773
    invoke-direct/range {v33 .. v38}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    move-object/from16 v24, v33

    .line 777
    .line 778
    new-instance v33, Lpw0;

    .line 779
    .line 780
    const-string v37, "\u7edf\u4e00\u5a92\u4f53\u8def\u5f84\u521b\u5efa"

    .line 781
    .line 782
    const-string v38, "\u89c6\u9891\u3001\u56fe\u7247\u3001\u52a8\u56fe\u3001LivePhoto\u3001\u97f3\u4e50\u3001\u8bc4\u8bba\u8bed\u97f3\u548c\u8bc4\u8bba\u8868\u60c5\u5171\u7528\u540c\u4e00\u5957\u8def\u5f84\u521b\u5efa\u4e0e\u5931\u8d25\u63d0\u793a\u903b\u8f91\u3002"

    .line 783
    .line 784
    const-string v34, "\u8def\u5f84"

    .line 785
    .line 786
    const-string v35, "#FE2C55"

    .line 787
    .line 788
    invoke-direct/range {v33 .. v38}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    move-object/from16 v25, v33

    .line 792
    .line 793
    new-instance v33, Lpw0;

    .line 794
    .line 795
    const-string v37, "\u4e3b\u9875\u6279\u91cf\u4e0b\u8f7d"

    .line 796
    .line 797
    const-string v38, "\u53ef\u4e3b\u52a8\u67e5\u8be2\u4e2a\u4eba\u4e3b\u9875\u4f5c\u54c1\u6570\u636e\u5e76\u81ea\u52a8\u5206\u9875\u52a0\u8f7d\u540e\u6279\u91cf\u4e0b\u8f7d\uff0c\u65e0\u9700\u624b\u52a8\u4e0b\u6ed1\u52a0\u8f7d\u4f5c\u54c1\u5217\u8868\u3002"

    .line 798
    .line 799
    const-string v34, "\u6279\u91cf"

    .line 800
    .line 801
    const-string v35, "#FE2C55"

    .line 802
    .line 803
    invoke-direct/range {v33 .. v38}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    move-object/from16 v26, v33

    .line 807
    .line 808
    new-instance v33, Lpw0;

    .line 809
    .line 810
    const-string v37, "\u97f3\u9891\u4e0b\u8f7d\u76ee\u5f55\u4e0e\u547d\u540d"

    .line 811
    .line 812
    const-string v38, "\u97f3\u9891\u53ef\u5355\u72ec\u8bbe\u7f6e\u4fdd\u5b58\u76ee\u5f55\u548c\u6587\u4ef6\u547d\u540d\u89c4\u5219\u3002"

    .line 813
    .line 814
    const-string v34, "\u97f3\u9891"

    .line 815
    .line 816
    const-string v35, "#FE2C55"

    .line 817
    .line 818
    invoke-direct/range {v33 .. v38}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    move-object/from16 v27, v33

    .line 822
    .line 823
    new-instance v33, Lpw0;

    .line 824
    .line 825
    const-string v37, "\u52a8\u56fe\u4e0b\u8f7d\u540e\u5408\u5e76"

    .line 826
    .line 827
    const-string v38, "\u4e0b\u8f7d\u56fe\u7247\u3001\u89c6\u9891\u3001\u97f3\u9891\u540e\u5408\u6210\u4e3a\u5c0f\u7c73\u683c\u5f0f Motion Photo\u3002"

    .line 828
    .line 829
    const-string v34, "\u52a8\u56fe"

    .line 830
    .line 831
    const-string v35, "#FE2C55"

    .line 832
    .line 833
    invoke-direct/range {v33 .. v38}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    move-object/from16 v28, v33

    .line 837
    .line 838
    new-instance v33, Lpw0;

    .line 839
    .line 840
    const-string v37, "\u4e0b\u8f7d\u901a\u77e5"

    .line 841
    .line 842
    const-string v38, "\u4e0b\u8f7d\u65f6\u53ef\u5728\u901a\u77e5\u680f\u663e\u793a\u4e0b\u8f7d\u8fdb\u5ea6\u3002"

    .line 843
    .line 844
    const-string v34, "\u901a\u77e5"

    .line 845
    .line 846
    const-string v35, "#FE2C55"

    .line 847
    .line 848
    invoke-direct/range {v33 .. v38}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    move-object/from16 v29, v33

    .line 852
    .line 853
    filled-new-array/range {v23 .. v29}, [Lpw0;

    .line 854
    .line 855
    .line 856
    move-result-object v6

    .line 857
    invoke-static {v6}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 858
    .line 859
    .line 860
    move-result-object v38

    .line 861
    const/16 v39, 0x0

    .line 862
    .line 863
    const-string v33, "\u4e0b\u8f7d"

    .line 864
    .line 865
    const-string v34, "\u4e0b\u8f7d\u8bbe\u7f6e"

    .line 866
    .line 867
    const-string v35, "\u89c6\u9891\u3001\u56fe\u6587\u3001\u97f3\u9891\u3001\u52a8\u56fe\u4fdd\u5b58"

    .line 868
    .line 869
    move-object/from16 v37, v36

    .line 870
    .line 871
    const-string v36, "#FE2C55"

    .line 872
    .line 873
    invoke-direct/range {v32 .. v39}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 874
    .line 875
    .line 876
    move-object/from16 v36, v32

    .line 877
    .line 878
    new-instance v37, Low0;

    .line 879
    .line 880
    new-instance v23, Lpw0;

    .line 881
    .line 882
    const-string v27, "\u542f\u7528\u89c6\u9891\u6d41\u8fc7\u6ee4"

    .line 883
    .line 884
    const-string v28, "\u5728\u63a8\u8350\u6d41\u6570\u636e\u5c42\u8fc7\u6ee4\u4e0d\u60f3\u770b\u7684\u5185\u5bb9\u3002"

    .line 885
    .line 886
    const-string v24, "\u603b\u5f00"

    .line 887
    .line 888
    iget-object v6, v13, Lnw0;->μ:Ljava/lang/String;

    .line 889
    .line 890
    iget-object v10, v13, Lnw0;->ν:Ljava/lang/String;

    .line 891
    .line 892
    move-object/from16 v25, v6

    .line 893
    .line 894
    move-object/from16 v26, v10

    .line 895
    .line 896
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    move-object/from16 v40, v25

    .line 900
    .line 901
    move-object/from16 v41, v26

    .line 902
    .line 903
    new-instance v38, Lpw0;

    .line 904
    .line 905
    const-string v42, "\u4ec5\u8fc7\u6ee4\u63a8\u8350\u6d41"

    .line 906
    .line 907
    const-string v43, "\u5f00\u542f\u540e\u4e0d\u5f71\u54cd\u5173\u6ce8\u3001\u6536\u85cf\u7b49\u5176\u4ed6\u9875\u9762\u3002"

    .line 908
    .line 909
    const-string v39, "\u63a8\u8350"

    .line 910
    .line 911
    invoke-direct/range {v38 .. v43}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    move-object/from16 v24, v38

    .line 915
    .line 916
    new-instance v38, Lpw0;

    .line 917
    .line 918
    const-string v42, "\u8fc7\u6ee4\u5e7f\u544a / \u76f4\u64ad / \u56fe\u6587"

    .line 919
    .line 920
    const-string v43, "\u53ef\u5206\u522b\u79fb\u9664\u5e7f\u544a\u5361\u7247\u3001\u76f4\u64ad\u63a8\u6d41\u548c\u56fe\u6587\u5185\u5bb9\u3002"

    .line 921
    .line 922
    const-string v39, "\u5e7f\u544a"

    .line 923
    .line 924
    invoke-direct/range {v38 .. v43}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    move-object/from16 v25, v38

    .line 928
    .line 929
    new-instance v38, Lpw0;

    .line 930
    .line 931
    const-string v42, "\u8fc7\u6ee4\u957f\u89c6\u9891 / \u77ed\u89c6\u9891"

    .line 932
    .line 933
    const-string v43, "\u652f\u6301\u6309\u89c6\u9891\u65f6\u957f\u8fc7\u6ee4\u8fc7\u957f\u6216\u8fc7\u77ed\u7684\u89c6\u9891\u3002"

    .line 934
    .line 935
    const-string v39, "\u957f\u77ed"

    .line 936
    .line 937
    invoke-direct/range {v38 .. v43}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    move-object/from16 v26, v38

    .line 941
    .line 942
    new-instance v38, Lpw0;

    .line 943
    .line 944
    const-string v42, "\u5173\u952e\u8bcd\u4e0e UID \u9ed1\u540d\u5355"

    .line 945
    .line 946
    const-string v43, "\u5305\u542b\u6307\u5b9a\u5173\u952e\u8bcd\u6216\u6765\u81ea\u6307\u5b9a UID \u7684\u89c6\u9891\u4f1a\u88ab\u8fc7\u6ee4\u3002"

    .line 947
    .line 948
    const-string v39, "\u9ed1\u540d"

    .line 949
    .line 950
    invoke-direct/range {v38 .. v43}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    move-object/from16 v27, v38

    .line 954
    .line 955
    new-instance v38, Lpw0;

    .line 956
    .line 957
    const-string v42, "\u65f6\u957f\u4e0e\u70b9\u8d5e\u6570\u6761\u4ef6"

    .line 958
    .line 959
    const-string v43, "\u652f\u6301\u8bbe\u7f6e\u6700\u77ed\u65f6\u957f\u3001\u6700\u957f\u65f6\u957f\u548c\u6700\u4f4e\u70b9\u8d5e\u6570\u8fc7\u6ee4\u6761\u4ef6\u3002"

    .line 960
    .line 961
    const-string v39, "\u6761\u4ef6"

    .line 962
    .line 963
    invoke-direct/range {v38 .. v43}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 964
    .line 965
    .line 966
    move-object/from16 v28, v38

    .line 967
    .line 968
    filled-new-array/range {v23 .. v28}, [Lpw0;

    .line 969
    .line 970
    .line 971
    move-result-object v6

    .line 972
    invoke-static {v6}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 973
    .line 974
    .line 975
    move-result-object v43

    .line 976
    const/16 v44, 0x0

    .line 977
    .line 978
    const-string v38, "\u8fc7\u6ee4"

    .line 979
    .line 980
    const-string v39, "\u89c6\u9891\u6d41\u8fc7\u6ee4"

    .line 981
    .line 982
    move-object/from16 v25, v40

    .line 983
    .line 984
    const-string v40, "\u51cf\u5c11\u4e0d\u60f3\u770b\u7684 Feed \u5185\u5bb9"

    .line 985
    .line 986
    move-object/from16 v42, v41

    .line 987
    .line 988
    move-object/from16 v41, v25

    .line 989
    .line 990
    invoke-direct/range {v37 .. v44}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 991
    .line 992
    .line 993
    move-object/from16 v40, v41

    .line 994
    .line 995
    move-object/from16 v41, v42

    .line 996
    .line 997
    new-instance v38, Low0;

    .line 998
    .line 999
    new-instance v23, Lpw0;

    .line 1000
    .line 1001
    const-string v27, "\u65f6\u957f\u63d0\u9192"

    .line 1002
    .line 1003
    const-string v28, "\u8fde\u7eed\u5237\u89c6\u9891\u8d85\u8fc7\u8bbe\u5b9a\u65f6\u95f4\u540e\u63d0\u9192\u4f11\u606f\uff0c\u652f\u6301\u91cd\u590d\u63d0\u9192\u3001\u632f\u52a8\u548c\u81ea\u5b9a\u4e49\u6587\u6848\u3002"

    .line 1004
    .line 1005
    const-string v24, "\u65f6\u957f"

    .line 1006
    .line 1007
    iget-object v6, v13, Lnw0;->κ:Ljava/lang/String;

    .line 1008
    .line 1009
    iget-object v10, v13, Lnw0;->λ:Ljava/lang/String;

    .line 1010
    .line 1011
    move-object/from16 v25, v6

    .line 1012
    .line 1013
    move-object/from16 v26, v10

    .line 1014
    .line 1015
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1016
    .line 1017
    .line 1018
    move-object/from16 v44, v25

    .line 1019
    .line 1020
    move-object/from16 v45, v26

    .line 1021
    .line 1022
    new-instance v24, Lpw0;

    .line 1023
    .line 1024
    const-string v46, "\u5c4f\u853d\u6296\u97f3\u5b98\u65b9\u65f6\u957f\u63d0\u9192\u5f39\u7a97"

    .line 1025
    .line 1026
    const-string v47, "\u963b\u6b62\u6296\u97f3\u81ea\u8eab\u7684\u4f7f\u7528\u65f6\u957f / \u9632\u6c89\u8ff7\u7c7b Feed \u5f39\u7a97\u3002"

    .line 1027
    .line 1028
    const-string v43, "\u5b98\u65b9"

    .line 1029
    .line 1030
    move-object/from16 v42, v24

    .line 1031
    .line 1032
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1033
    .line 1034
    .line 1035
    new-instance v25, Lpw0;

    .line 1036
    .line 1037
    const-string v46, "\u957f\u89c6\u9891\u63d0\u9192"

    .line 1038
    .line 1039
    const-string v47, "\u5f53\u524d\u89c6\u9891\u603b\u65f6\u957f\u8d85\u8fc7\u8bbe\u5b9a\u9608\u503c\u65f6\u5f39\u51fa\u63d0\u9192\u3002"

    .line 1040
    .line 1041
    const-string v43, "\u957f\u7247"

    .line 1042
    .line 1043
    move-object/from16 v42, v25

    .line 1044
    .line 1045
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    new-instance v42, Lpw0;

    .line 1049
    .line 1050
    const-string v46, "\u81ea\u52a8\u4e0b\u6ed1"

    .line 1051
    .line 1052
    const-string v47, "\u5f53\u524d\u89c6\u9891\u64ad\u653e\u5b8c\u6210\u540e\u81ea\u52a8\u6ed1\u5230\u4e0b\u4e00\u4e2a\u4f5c\u54c1\uff0c\u652f\u6301\u5ef6\u8fdf\u548c\u8bc4\u8bba\u533a\u63a7\u5236\u3002"

    .line 1053
    .line 1054
    const-string v43, "\u4e0b\u6ed1"

    .line 1055
    .line 1056
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1057
    .line 1058
    .line 1059
    move-object/from16 v26, v42

    .line 1060
    .line 1061
    new-instance v42, Lpw0;

    .line 1062
    .line 1063
    const-string v46, "\u64ad\u653e\u5b8c\u6210\u81ea\u52a8\u6682\u505c"

    .line 1064
    .line 1065
    const-string v47, "\u89c6\u9891\u64ad\u653e\u5b8c\u6210\u540e\u81ea\u52a8\u6682\u505c\uff0c\u907f\u514d\u81ea\u52a8\u5faa\u73af\u64ad\u653e\u3002"

    .line 1066
    .line 1067
    const-string v43, "\u6682\u505c"

    .line 1068
    .line 1069
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    move-object/from16 v27, v42

    .line 1073
    .line 1074
    new-instance v42, Lpw0;

    .line 1075
    .line 1076
    const-string v46, "\u8fdb\u5ea6\u6761\u65f6\u95f4\u663e\u793a"

    .line 1077
    .line 1078
    const-string v47, "\u5728\u8fdb\u5ea6\u6761\u9644\u8fd1\u663e\u793a\u5f53\u524d\u65f6\u95f4 / \u603b\u65f6\u957f\uff0c\u652f\u6301\u5b57\u4f53\u5927\u5c0f\u3001\u989c\u8272\u548c\u900f\u660e\u5ea6\u3002"

    .line 1079
    .line 1080
    const-string v43, "\u8fdb\u5ea6"

    .line 1081
    .line 1082
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1083
    .line 1084
    .line 1085
    move-object/from16 v28, v42

    .line 1086
    .line 1087
    new-instance v42, Lpw0;

    .line 1088
    .line 1089
    const-string v46, "\u89c6\u9891\u500d\u901f\u6269\u5c55"

    .line 1090
    .line 1091
    const-string v47, "\u6269\u5c55\u5bbf\u4e3b\u64ad\u653e\u500d\u901f\u9009\u9879\uff0c\u652f\u6301 0.25\u30010.5\u30012.5\u30013.0 \u7b49\u989d\u5916\u901f\u5ea6\u3002"

    .line 1092
    .line 1093
    const-string v43, "\u500d\u901f"

    .line 1094
    .line 1095
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    move-object/from16 v29, v42

    .line 1099
    .line 1100
    filled-new-array/range {v23 .. v29}, [Lpw0;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v6

    .line 1104
    invoke-static {v6}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v48

    .line 1108
    const/16 v49, 0x0

    .line 1109
    .line 1110
    const-string v43, "\u64ad\u653e"

    .line 1111
    .line 1112
    move-object/from16 v46, v44

    .line 1113
    .line 1114
    const-string v44, "\u64ad\u653e\u589e\u5f3a"

    .line 1115
    .line 1116
    move-object/from16 v47, v45

    .line 1117
    .line 1118
    const-string v45, "\u63d0\u9192\u3001\u4e0b\u6ed1\u3001\u6682\u505c\u3001\u8fdb\u5ea6\u6761"

    .line 1119
    .line 1120
    move-object/from16 v42, v38

    .line 1121
    .line 1122
    invoke-direct/range {v42 .. v49}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 1123
    .line 1124
    .line 1125
    move-object/from16 v6, v42

    .line 1126
    .line 1127
    move-object/from16 v44, v46

    .line 1128
    .line 1129
    move-object/from16 v45, v47

    .line 1130
    .line 1131
    new-instance v39, Low0;

    .line 1132
    .line 1133
    new-instance v42, Lpw0;

    .line 1134
    .line 1135
    const-string v46, "Feed \u6d41\u9884\u52a0\u8f7d\u63a7\u5236"

    .line 1136
    .line 1137
    const-string v47, "\u53ef\u63a7\u5236\u89c6\u9891\u9884\u52a0\u8f7d\u5f00\u5173\u3001\u9884\u52a0\u8f7d\u6570\u91cf\u3001\u6e05\u6670\u5ea6\u548c\u8c03\u8bd5\u65e5\u5fd7\u3002"

    .line 1138
    .line 1139
    const-string v43, "\u9884\u8f7d"

    .line 1140
    .line 1141
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    move-object/from16 v10, v42

    .line 1145
    .line 1146
    new-instance v42, Lpw0;

    .line 1147
    .line 1148
    const-string v46, "Feed \u53f3\u4fa7\u63a7\u4ef6\u5c4f\u853d"

    .line 1149
    .line 1150
    const-string v47, "\u81ea\u5b9a\u4e49\u9690\u85cf\u5934\u50cf\u3001\u70b9\u8d5e\u3001\u6536\u85cf\u3001\u8bc4\u8bba\u3001\u5206\u4eab\u3001\u97f3\u4e50\u3001\u4e0d\u611f\u5174\u8da3\u7b49\u53f3\u4fa7\u63a7\u4ef6\u3002"

    .line 1151
    .line 1152
    const-string v43, "\u53f3\u4fa7"

    .line 1153
    .line 1154
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1155
    .line 1156
    .line 1157
    move-object/from16 v14, v42

    .line 1158
    .line 1159
    new-instance v42, Lpw0;

    .line 1160
    .line 1161
    const-string v46, "\u76f4\u64ad\u95f4\u7cbe\u786e\u4eba\u6570\u663e\u793a"

    .line 1162
    .line 1163
    const-string v47, "\u5c06\u76f4\u64ad\u95f4\u5728\u7ebf\u4eba\u6570\u4ece\u201c1\u4e07\u201d\u201c1.2\u4e07\u201d\u7b49\u6a21\u7cca\u6570\u5b57\u663e\u793a\u4e3a\u5177\u4f53\u6570\u5b57\u3002"

    .line 1164
    .line 1165
    const-string v43, "\u76f4\u64ad"

    .line 1166
    .line 1167
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1168
    .line 1169
    .line 1170
    move-object/from16 v15, v42

    .line 1171
    .line 1172
    new-instance v42, Lpw0;

    .line 1173
    .line 1174
    const-string v46, "\u4e2a\u4eba\u4e3b\u9875\u589e\u5f3a"

    .line 1175
    .line 1176
    const-string v47, "\u5728\u4e2a\u4eba\u4e3b\u9875\u663e\u793a\u6570\u5b57 UID\uff0c\u63d0\u4f9b\u4e3b\u9875\u4e66\u7b7e\u5165\u53e3\uff0c\u5e76\u652f\u6301\u4e3b\u52a8\u83b7\u53d6\u4e3b\u9875\u4f5c\u54c1\u6570\u636e\u3002"

    .line 1177
    .line 1178
    const-string v43, "\u4e3b\u9875"

    .line 1179
    .line 1180
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1181
    .line 1182
    .line 1183
    move-object/from16 v23, v1

    .line 1184
    .line 1185
    move-object/from16 v1, v42

    .line 1186
    .line 1187
    filled-new-array {v10, v14, v15, v1}, [Lpw0;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v48

    .line 1195
    const-string v43, "Feed"

    .line 1196
    .line 1197
    move-object/from16 v46, v44

    .line 1198
    .line 1199
    const-string v44, "Feed \u9875\u9762\u589e\u5f3a"

    .line 1200
    .line 1201
    move-object/from16 v47, v45

    .line 1202
    .line 1203
    const-string v45, "\u9884\u52a0\u8f7d\u3001\u53f3\u4fa7\u63a7\u4ef6\u3001\u76f4\u64ad\u4eba\u6570\u3001\u4e3b\u9875"

    .line 1204
    .line 1205
    move-object/from16 v42, v39

    .line 1206
    .line 1207
    invoke-direct/range {v42 .. v49}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 1208
    .line 1209
    .line 1210
    move-object/from16 v1, v42

    .line 1211
    .line 1212
    move-object/from16 v44, v46

    .line 1213
    .line 1214
    move-object/from16 v45, v47

    .line 1215
    .line 1216
    new-instance v10, Low0;

    .line 1217
    .line 1218
    new-instance v28, Lpw0;

    .line 1219
    .line 1220
    const-string v32, "\u8bc4\u8bba\u533a\u6837\u5f0f"

    .line 1221
    .line 1222
    const-string v33, "\u5df2\u8fc1\u79fb\u81f3\u8bc4\u8bba\u533a\u63a7\u4ef6\u7ba1\u7406\uff0c\u53ef\u9690\u85cf\u8bc4\u8bba\u5934\u50cf\u3001\u6635\u79f0\u3001\u5185\u5bb9\u3001\u56de\u590d\u3001\u65f6\u95f4\u3001\u70b9\u8d5e\u3001\u8e29\u548c\u53d1\u5e03\u5730\u70b9\uff0c\u5e76\u914d\u7f6e\u8bc4\u8bba\u67d3\u8272\u8303\u56f4\u3002"

    .line 1223
    .line 1224
    const-string v29, "\u67d3\u8272"

    .line 1225
    .line 1226
    invoke-direct/range {v28 .. v33}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    move-object/from16 v14, v28

    .line 1230
    .line 1231
    new-instance v28, Lpw0;

    .line 1232
    .line 1233
    const-string v32, "\u8bc4\u8bba\u533a\u80cc\u666f"

    .line 1234
    .line 1235
    const-string v33, "\u652f\u6301\u9ed8\u8ba4\u3001\u7eaf\u8272\u548c\u81ea\u5b9a\u4e49\u56fe\u7247\u80cc\u666f\uff0c\u53ef\u8c03\u6574\u56fe\u7247\u900f\u660e\u5ea6\u5e76\u751f\u6210\u9ad8\u65af\u6a21\u7cca\u7f13\u5b58\u3002"

    .line 1236
    .line 1237
    const-string v29, "\u80cc\u666f"

    .line 1238
    .line 1239
    invoke-direct/range {v28 .. v33}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1240
    .line 1241
    .line 1242
    move-object/from16 v15, v28

    .line 1243
    .line 1244
    new-instance v28, Lpw0;

    .line 1245
    .line 1246
    const-string v32, "\u8bc4\u8bba\u7cbe\u786e\u65f6\u95f4"

    .line 1247
    .line 1248
    const-string v33, "\u5c06\u8bc4\u8bba\u533a\u76f8\u5bf9\u65f6\u95f4\u66ff\u6362\u4e3a\u7cbe\u786e\u65f6\u95f4\uff0c\u652f\u6301\u81ea\u5b9a\u4e49\u683c\u5f0f\u3002"

    .line 1249
    .line 1250
    const-string v29, "\u65f6\u95f4"

    .line 1251
    .line 1252
    invoke-direct/range {v28 .. v33}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1253
    .line 1254
    .line 1255
    move-object/from16 v24, v1

    .line 1256
    .line 1257
    move-object/from16 v1, v28

    .line 1258
    .line 1259
    new-instance v28, Lpw0;

    .line 1260
    .line 1261
    const-string v32, "\u8bc4\u8bba\u533a\u56fe\u7247\u65e0\u6c34\u5370\u4e0b\u8f7d"

    .line 1262
    .line 1263
    const-string v33, "\u81ea\u52a8\u62e6\u622a\u8bc4\u8bba\u533a\u5e26\u6c34\u5370\u56fe\u7247\uff0c\u66ff\u6362\u4e3a\u65e0\u6c34\u5370\u539f\u56fe\u94fe\u63a5\u3002"

    .line 1264
    .line 1265
    const-string v29, "\u56fe\u7247"

    .line 1266
    .line 1267
    invoke-direct/range {v28 .. v33}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1268
    .line 1269
    .line 1270
    move-object/from16 v25, v6

    .line 1271
    .line 1272
    move-object/from16 v6, v28

    .line 1273
    .line 1274
    filled-new-array {v14, v15, v1, v6}, [Lpw0;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v1

    .line 1278
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v34

    .line 1282
    const/16 v35, 0x0

    .line 1283
    .line 1284
    const-string v29, "\u8bc4\u8bba"

    .line 1285
    .line 1286
    move-object/from16 v32, v30

    .line 1287
    .line 1288
    const-string v30, "\u8bc4\u8bba\u533a\u589e\u5f3a"

    .line 1289
    .line 1290
    move-object/from16 v33, v31

    .line 1291
    .line 1292
    const-string v31, "\u6837\u5f0f\u3001\u80cc\u666f\u3001\u65f6\u95f4\u3001\u56fe\u7247"

    .line 1293
    .line 1294
    move-object/from16 v28, v10

    .line 1295
    .line 1296
    invoke-direct/range {v28 .. v35}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 1297
    .line 1298
    .line 1299
    new-instance v1, Low0;

    .line 1300
    .line 1301
    new-instance v42, Lpw0;

    .line 1302
    .line 1303
    const-string v46, "\u6c89\u6d78\u5f0f\u72b6\u6001\u680f"

    .line 1304
    .line 1305
    const-string v47, "\u9690\u85cf\u9876\u90e8\u7cfb\u7edf\u72b6\u6001\u680f\uff0c\u4e5f\u53ef\u9009\u62e9\u540c\u65f6\u9690\u85cf\u5bfc\u822a\u680f / \u624b\u52bf\u6761\u3002"

    .line 1306
    .line 1307
    const-string v43, "\u6c89\u6d78"

    .line 1308
    .line 1309
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1310
    .line 1311
    .line 1312
    move-object/from16 v6, v42

    .line 1313
    .line 1314
    new-instance v42, Lpw0;

    .line 1315
    .line 1316
    const-string v46, "\u89c6\u9891\u4fe1\u606f\u6761"

    .line 1317
    .line 1318
    const-string v47, "\u5728\u89c6\u9891\u63cf\u8ff0\u4e0b\u65b9\u663e\u793a\u53d1\u5e03\u65f6\u95f4\u548c\u4f4d\u7f6e\u4fe1\u606f\uff0c\u652f\u6301\u5b57\u4f53\u5927\u5c0f\u3001\u989c\u8272\u548c\u9713\u8679\u5f69\u8679\u8272\u3002"

    .line 1319
    .line 1320
    const-string v43, "\u4fe1\u606f"

    .line 1321
    .line 1322
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    move-object/from16 v10, v42

    .line 1326
    .line 1327
    filled-new-array {v6, v10}, [Lpw0;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v6

    .line 1331
    invoke-static {v6}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v48

    .line 1335
    const-string v43, "\u5916\u89c2"

    .line 1336
    .line 1337
    move-object/from16 v46, v44

    .line 1338
    .line 1339
    const-string v44, "\u5916\u89c2\u4e0e\u4fe1\u606f\u663e\u793a"

    .line 1340
    .line 1341
    move-object/from16 v47, v45

    .line 1342
    .line 1343
    const-string v45, "\u72b6\u6001\u680f\u3001\u4fe1\u606f\u6761"

    .line 1344
    .line 1345
    move-object/from16 v42, v1

    .line 1346
    .line 1347
    invoke-direct/range {v42 .. v49}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 1348
    .line 1349
    .line 1350
    new-instance v6, Low0;

    .line 1351
    .line 1352
    new-instance v38, Lpw0;

    .line 1353
    .line 1354
    const-string v42, "DexKit \u7f13\u5b58\u7ba1\u7406"

    .line 1355
    .line 1356
    const-string v43, "\u53ef\u6e05\u9664 DexKit \u65b9\u6cd5 / \u7c7b / \u5b57\u6bb5\u67e5\u8be2\u7f13\u5b58\uff0c\u4e0b\u6b21\u542f\u52a8\u91cd\u65b0\u9002\u914d\u3002"

    .line 1357
    .line 1358
    const-string v39, "\u7f13\u5b58"

    .line 1359
    .line 1360
    invoke-direct/range {v38 .. v43}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1361
    .line 1362
    .line 1363
    move-object/from16 v10, v38

    .line 1364
    .line 1365
    new-instance v38, Lpw0;

    .line 1366
    .line 1367
    const-string v42, "DyLog \u65e5\u5fd7\u67e5\u770b\u4e0e\u5bfc\u51fa"

    .line 1368
    .line 1369
    const-string v43, "\u67e5\u770b\u6a21\u5757\u8fd0\u884c\u65e5\u5fd7\uff0c\u652f\u6301\u5237\u65b0\u3001\u67e5\u770b\u8be6\u60c5\u548c\u5bfc\u51fa\u65e5\u5fd7\u6587\u4ef6\u3002"

    .line 1370
    .line 1371
    const-string v39, "\u65e5\u5fd7"

    .line 1372
    .line 1373
    invoke-direct/range {v38 .. v43}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1374
    .line 1375
    .line 1376
    move-object/from16 v14, v38

    .line 1377
    .line 1378
    new-instance v38, Lpw0;

    .line 1379
    .line 1380
    const-string v42, "\u6e05\u9664\u5168\u90e8\u7528\u6237\u914d\u7f6e"

    .line 1381
    .line 1382
    const-string v43, "\u53ef\u6e05\u9664\u5f53\u524d\u8d26\u53f7\u3001\u5176\u4ed6\u8d26\u53f7\u3001\u5143\u6570\u636e\u3001\u5185\u6d4b\u72b6\u6001\u7b49\u5168\u90e8 DYHelper \u7528\u6237\u914d\u7f6e\u3002"

    .line 1383
    .line 1384
    const-string v39, "\u91cd\u7f6e"

    .line 1385
    .line 1386
    invoke-direct/range {v38 .. v43}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1387
    .line 1388
    .line 1389
    move-object/from16 v15, v38

    .line 1390
    .line 1391
    filled-new-array {v10, v14, v15}, [Lpw0;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v10

    .line 1395
    invoke-static {v10}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v44

    .line 1399
    const/16 v45, 0x0

    .line 1400
    .line 1401
    const-string v39, "\u5de5\u5177"

    .line 1402
    .line 1403
    move-object/from16 v42, v40

    .line 1404
    .line 1405
    const-string v40, "\u5de5\u5177\u4e0e\u8bca\u65ad"

    .line 1406
    .line 1407
    move-object/from16 v26, v41

    .line 1408
    .line 1409
    const-string v41, "\u7f13\u5b58\u3001\u65e5\u5fd7"

    .line 1410
    .line 1411
    move-object/from16 v38, v6

    .line 1412
    .line 1413
    move-object/from16 v43, v26

    .line 1414
    .line 1415
    invoke-direct/range {v38 .. v45}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 1416
    .line 1417
    .line 1418
    new-instance v6, Low0;

    .line 1419
    .line 1420
    new-instance v42, Lpw0;

    .line 1421
    .line 1422
    move-object/from16 v44, v46

    .line 1423
    .line 1424
    const-string v46, "\u79c1\u4fe1\u9632\u64a4\u56de"

    .line 1425
    .line 1426
    move-object/from16 v45, v47

    .line 1427
    .line 1428
    const-string v47, "\u9632\u6b62\u79c1\u4fe1\u6d88\u606f\u88ab\u64a4\u56de\uff0c\u4fdd\u7559\u539f\u59cb\u6d88\u606f\u5185\u5bb9\u3002"

    .line 1429
    .line 1430
    const-string v43, "\u9632\u64a4"

    .line 1431
    .line 1432
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1433
    .line 1434
    .line 1435
    move-object/from16 v10, v42

    .line 1436
    .line 1437
    new-instance v42, Lpw0;

    .line 1438
    .line 1439
    const-string v46, "\u79c1\u4fe1\u65f6\u95f4\u6807\u7b7e"

    .line 1440
    .line 1441
    const-string v47, "\u5728\u79c1\u4fe1\u6d88\u606f\u4e0b\u65b9\u663e\u793a\u7cbe\u786e\u53d1\u9001\u65f6\u95f4\uff0c\u5e76\u53ef\u663e\u793a\u64a4\u56de\u6807\u8bb0\u3002"

    .line 1442
    .line 1443
    const-string v43, "\u65f6\u95f4"

    .line 1444
    .line 1445
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1446
    .line 1447
    .line 1448
    move-object/from16 v14, v42

    .line 1449
    .line 1450
    new-instance v42, Lpw0;

    .line 1451
    .line 1452
    const-string v46, "\u79c1\u4fe1\u72b6\u6001\u9690\u79c1"

    .line 1453
    .line 1454
    const-string v47, "\u5173\u95ed\u5df2\u8bfb\u72b6\u6001\u4e0a\u62a5\u548c\u6b63\u5728\u8f93\u5165 / \u5f55\u97f3\u4e2d\u7b49\u4e34\u65f6\u72b6\u6001\u4e0a\u62a5\u3002"

    .line 1455
    .line 1456
    const-string v43, "\u9690\u79c1"

    .line 1457
    .line 1458
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1459
    .line 1460
    .line 1461
    move-object/from16 v15, v42

    .line 1462
    .line 1463
    new-instance v42, Lpw0;

    .line 1464
    .line 1465
    const-string v46, "\u79c1\u4fe1\u81ea\u52a8\u5df2\u8bfb"

    .line 1466
    .line 1467
    const-string v47, "\u6309\u8bbe\u5b9a\u95f4\u9694\u81ea\u52a8\u5c06\u79c1\u4fe1\u6807\u8bb0\u4e3a\u5df2\u8bfb\uff0c\u652f\u6301\u4e92\u52a8\u6d88\u606f\u3001\u767d\u540d\u5355\u548c\u9ed1\u540d\u5355\u3002"

    .line 1468
    .line 1469
    const-string v43, "\u5df2\u8bfb"

    .line 1470
    .line 1471
    invoke-direct/range {v42 .. v47}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1472
    .line 1473
    .line 1474
    move-object/from16 v41, v1

    .line 1475
    .line 1476
    move-object/from16 v1, v42

    .line 1477
    .line 1478
    filled-new-array {v10, v14, v15, v1}, [Lpw0;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v1

    .line 1482
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v48

    .line 1486
    const-string v43, "\u79c1\u4fe1"

    .line 1487
    .line 1488
    move-object/from16 v46, v44

    .line 1489
    .line 1490
    const-string v44, "\u79c1\u4fe1\u589e\u5f3a"

    .line 1491
    .line 1492
    move-object/from16 v47, v45

    .line 1493
    .line 1494
    const-string v45, "\u9632\u64a4\u56de\u3001\u65f6\u95f4\u3001\u9690\u79c1\u3001\u5df2\u8bfb\u3001\u9690\u85cf"

    .line 1495
    .line 1496
    move-object/from16 v42, v6

    .line 1497
    .line 1498
    invoke-direct/range {v42 .. v49}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 1499
    .line 1500
    .line 1501
    move-object/from16 v35, v23

    .line 1502
    .line 1503
    move-object/from16 v39, v24

    .line 1504
    .line 1505
    move-object/from16 v40, v28

    .line 1506
    .line 1507
    move-object/from16 v43, v42

    .line 1508
    .line 1509
    move-object/from16 v42, v38

    .line 1510
    .line 1511
    move-object/from16 v38, v25

    .line 1512
    .line 1513
    filled-new-array/range {v35 .. v43}, [Low0;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v1

    .line 1517
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    invoke-virtual {v0, v1, v13}, Lcom/example/dyhelper/ui/MainActivity;->α(Ljava/util/List;Lnw0;)Landroid/widget/LinearLayout;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v1

    .line 1525
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1526
    .line 1527
    .line 1528
    const-string v1, "\u5185\u6d4b\u529f\u80fd"

    .line 1529
    .line 1530
    invoke-virtual {v0, v1, v13}, Lcom/example/dyhelper/ui/MainActivity;->β(Ljava/lang/String;Lnw0;)Landroid/widget/TextView;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v1

    .line 1534
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1535
    .line 1536
    .line 1537
    new-instance v1, Landroid/widget/LinearLayout;

    .line 1538
    .line 1539
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1540
    .line 1541
    .line 1542
    const/4 v14, 0x1

    .line 1543
    invoke-virtual {v1, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v6

    .line 1550
    invoke-interface {v6, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v6

    .line 1554
    check-cast v6, Ljava/lang/Number;

    .line 1555
    .line 1556
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1557
    .line 1558
    .line 1559
    move-result v6

    .line 1560
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v10

    .line 1564
    invoke-interface {v10, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v10

    .line 1568
    check-cast v10, Ljava/lang/Number;

    .line 1569
    .line 1570
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1571
    .line 1572
    .line 1573
    move-result v10

    .line 1574
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v14

    .line 1578
    invoke-interface {v14, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v14

    .line 1582
    check-cast v14, Ljava/lang/Number;

    .line 1583
    .line 1584
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 1585
    .line 1586
    .line 1587
    move-result v14

    .line 1588
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v15

    .line 1592
    invoke-interface {v15, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v15

    .line 1596
    check-cast v15, Ljava/lang/Number;

    .line 1597
    .line 1598
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 1599
    .line 1600
    .line 1601
    move-result v15

    .line 1602
    invoke-virtual {v1, v6, v10, v14, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 1603
    .line 1604
    .line 1605
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 1606
    .line 1607
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1608
    .line 1609
    .line 1610
    iget-object v10, v13, Lnw0;->π:Ljava/lang/String;

    .line 1611
    .line 1612
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1613
    .line 1614
    .line 1615
    move-result v14

    .line 1616
    invoke-virtual {v6, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1617
    .line 1618
    .line 1619
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v14

    .line 1623
    invoke-interface {v14, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v14

    .line 1627
    check-cast v14, Ljava/lang/Number;

    .line 1628
    .line 1629
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 1630
    .line 1631
    .line 1632
    move-result v14

    .line 1633
    int-to-float v14, v14

    .line 1634
    invoke-virtual {v6, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v14

    .line 1641
    invoke-interface {v14, v11}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v14

    .line 1645
    check-cast v14, Ljava/lang/Number;

    .line 1646
    .line 1647
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 1648
    .line 1649
    .line 1650
    move-result v14

    .line 1651
    const-string v15, "#7C4DFF"

    .line 1652
    .line 1653
    move-object/from16 v26, v10

    .line 1654
    .line 1655
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1656
    .line 1657
    .line 1658
    move-result v10

    .line 1659
    invoke-virtual {v6, v14, v10}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 1660
    .line 1661
    .line 1662
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1663
    .line 1664
    .line 1665
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1666
    .line 1667
    const/4 v10, -0x2

    .line 1668
    const/4 v14, -0x1

    .line 1669
    invoke-direct {v6, v14, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v10

    .line 1676
    invoke-interface {v10, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v10

    .line 1680
    check-cast v10, Ljava/lang/Number;

    .line 1681
    .line 1682
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1683
    .line 1684
    .line 1685
    move-result v10

    .line 1686
    iput v10, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1687
    .line 1688
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1689
    .line 1690
    .line 1691
    new-instance v6, Landroid/widget/TextView;

    .line 1692
    .line 1693
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1694
    .line 1695
    .line 1696
    const-string v10, "\u4ee5\u4e0b\u529f\u80fd\u6b63\u5728\u5185\u6d4b\u4e2d"

    .line 1697
    .line 1698
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1699
    .line 1700
    .line 1701
    const/high16 v10, 0x41500000    # 13.0f

    .line 1702
    .line 1703
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1704
    .line 1705
    .line 1706
    const/4 v10, 0x0

    .line 1707
    const/4 v14, 0x1

    .line 1708
    invoke-static {v15, v6, v10, v14}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 1709
    .line 1710
    .line 1711
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1712
    .line 1713
    .line 1714
    new-instance v6, Landroid/widget/TextView;

    .line 1715
    .line 1716
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1717
    .line 1718
    .line 1719
    const-string v10, "\u5185\u6d4b\u529f\u80fd\u9700\u8981\u5f53\u524d\u6296\u97f3\u8d26\u53f7\u901a\u8fc7\u5185\u6d4b\u6821\u9a8c\u540e\u624d\u80fd\u4f7f\u7528\u3002\u5177\u4f53\u72b6\u6001\u4ee5\u6296\u97f3\u5185\u8bbe\u7f6e\u9875\u9876\u90e8\u663e\u793a\u548c\u5404\u529f\u80fd\u5f00\u5173\u6821\u9a8c\u7ed3\u679c\u4e3a\u51c6\u3002"

    .line 1720
    .line 1721
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1722
    .line 1723
    .line 1724
    const/high16 v10, 0x41400000    # 12.0f

    .line 1725
    .line 1726
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1727
    .line 1728
    .line 1729
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1730
    .line 1731
    .line 1732
    move-result v10

    .line 1733
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1734
    .line 1735
    .line 1736
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v10

    .line 1740
    invoke-interface {v10, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v5

    .line 1744
    check-cast v5, Ljava/lang/Number;

    .line 1745
    .line 1746
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1747
    .line 1748
    .line 1749
    move-result v5

    .line 1750
    const/4 v10, 0x0

    .line 1751
    invoke-virtual {v6, v10, v5, v10, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1752
    .line 1753
    .line 1754
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v5

    .line 1758
    invoke-interface {v5, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v5

    .line 1762
    check-cast v5, Ljava/lang/Number;

    .line 1763
    .line 1764
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1765
    .line 1766
    .line 1767
    move-result v5

    .line 1768
    int-to-float v5, v5

    .line 1769
    const/high16 v10, 0x3f800000    # 1.0f

    .line 1770
    .line 1771
    invoke-virtual {v6, v5, v10}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1775
    .line 1776
    .line 1777
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1778
    .line 1779
    .line 1780
    new-instance v23, Lpw0;

    .line 1781
    .line 1782
    const-string v27, "\u5e95\u680f TAB \u8fc7\u6ee4"

    .line 1783
    .line 1784
    const-string v28, "\u9690\u85cf\u670b\u53cb\u3001\u53d1\u5e03\u3001\u6d88\u606f\u3001\u6211\u7684\u3001\u63a2\u7d22\u3001\u5546\u57ce\u3001\u540c\u57ce\u7b49\u5e95\u680f\u5165\u53e3\u3002"

    .line 1785
    .line 1786
    const-string v24, "\u5e95\u680f"

    .line 1787
    .line 1788
    const-string v25, "#7C4DFF"

    .line 1789
    .line 1790
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1791
    .line 1792
    .line 1793
    move-object/from16 v1, v23

    .line 1794
    .line 1795
    new-instance v23, Lpw0;

    .line 1796
    .line 1797
    const-string v27, "\u9876\u680f TAB \u8fc7\u6ee4"

    .line 1798
    .line 1799
    const-string v28, "\u81ea\u52a8\u626b\u63cf\u9996\u9875\u9876\u90e8\u9891\u9053 TAB\uff0c\u53ef\u9690\u85cf\u6307\u5b9a\u9891\u9053\u3001\u8df3\u8fc7\u9690\u85cf\u9875\u9762\u5e76\u8bbe\u7f6e\u5c45\u4e2d\u5bf9\u9f50\uff0c\u540c\u65f6\u517c\u5bb9\u5d4c\u5165\u5f0f\u9876\u90e8\u680f\u3002"

    .line 1800
    .line 1801
    const-string v24, "\u9876\u680f"

    .line 1802
    .line 1803
    const-string v25, "#7C4DFF"

    .line 1804
    .line 1805
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1806
    .line 1807
    .line 1808
    move-object/from16 v5, v23

    .line 1809
    .line 1810
    filled-new-array {v1, v5}, [Lpw0;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v1

    .line 1814
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v29

    .line 1818
    new-instance v30, Low0;

    .line 1819
    .line 1820
    move-object/from16 v28, v26

    .line 1821
    .line 1822
    const-string v26, "\u5e95\u680f\u4e0e\u9876\u680f\u5165\u53e3\u8fc7\u6ee4"

    .line 1823
    .line 1824
    move-object/from16 v23, v30

    .line 1825
    .line 1826
    const/16 v30, 0x1

    .line 1827
    .line 1828
    const-string v24, "TAB"

    .line 1829
    .line 1830
    const-string v25, "TAB \u8fc7\u6ee4"

    .line 1831
    .line 1832
    const-string v27, "#7C4DFF"

    .line 1833
    .line 1834
    invoke-direct/range {v23 .. v30}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 1835
    .line 1836
    .line 1837
    move-object/from16 v1, v23

    .line 1838
    .line 1839
    move-object/from16 v26, v28

    .line 1840
    .line 1841
    new-instance v31, Low0;

    .line 1842
    .line 1843
    new-instance v23, Lpw0;

    .line 1844
    .line 1845
    const-string v27, "\u64ad\u653e\u9875\u63a7\u4ef6\u900f\u660e\u5ea6"

    .line 1846
    .line 1847
    const-string v28, "\u53ef\u8c03\u8282\u53f3\u4fa7\u4e92\u52a8\u533a\u3001\u5e95\u90e8\u4fe1\u606f\u533a\u3001\u9876\u680f\u548c\u6742\u9879\u680f\u900f\u660e\u5ea6\u3002"

    .line 1848
    .line 1849
    const-string v24, "\u900f\u660e"

    .line 1850
    .line 1851
    const-string v25, "#7C4DFF"

    .line 1852
    .line 1853
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1854
    .line 1855
    .line 1856
    move-object/from16 v5, v23

    .line 1857
    .line 1858
    new-instance v23, Lpw0;

    .line 1859
    .line 1860
    const-string v27, "\u89c6\u9891\u6682\u505c\u663e\u793a\u63a7\u4ef6"

    .line 1861
    .line 1862
    const-string v28, "\u89c6\u9891\u6682\u505c\u65f6\u4e34\u65f6\u6062\u590d\u63a7\u4ef6\u663e\u793a\uff0c\u7ee7\u7eed\u64ad\u653e\u540e\u6062\u590d\u6e05\u723d\u900f\u660e\u5ea6\u3002"

    .line 1863
    .line 1864
    const-string v24, "\u6682\u505c"

    .line 1865
    .line 1866
    const-string v25, "#7C4DFF"

    .line 1867
    .line 1868
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1869
    .line 1870
    .line 1871
    move-object/from16 v6, v23

    .line 1872
    .line 1873
    new-instance v23, Lpw0;

    .line 1874
    .line 1875
    const-string v27, "\u8fdb\u5ea6\u6761\u900f\u660e\u5ea6\u63a7\u5236"

    .line 1876
    .line 1877
    const-string v28, "\u81ea\u5b9a\u4e49\u89c6\u9891\u64ad\u653e\u65f6\u8fdb\u5ea6\u6761\u900f\u660e\u5ea6\uff0c\u5e76\u53ef\u8bbe\u7f6e\u6682\u505c\u65f6\u6062\u590d\u4e0d\u900f\u660e\u3002"

    .line 1878
    .line 1879
    const-string v24, "\u8fdb\u5ea6"

    .line 1880
    .line 1881
    const-string v25, "#7C4DFF"

    .line 1882
    .line 1883
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1884
    .line 1885
    .line 1886
    move-object/from16 v10, v23

    .line 1887
    .line 1888
    new-instance v23, Lpw0;

    .line 1889
    .line 1890
    const-string v27, "\u5e95\u680f\u9690\u85cf\u4e0e\u5e95\u680f\u6587\u5b57\u900f\u660e\u5ea6"

    .line 1891
    .line 1892
    const-string v28, "\u53ef\u9690\u85cf\u5e95\u680f\u3001\u9690\u85cf\u52a0\u53f7\u6309\u94ae\u3001\u63a7\u5236\u5e95\u680f\u6587\u5b57\u663e\u793a\u548c\u900f\u660e\u5ea6\u3002"

    .line 1893
    .line 1894
    const-string v24, "\u5e95\u680f"

    .line 1895
    .line 1896
    const-string v25, "#7C4DFF"

    .line 1897
    .line 1898
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1899
    .line 1900
    .line 1901
    move-object/from16 v14, v23

    .line 1902
    .line 1903
    filled-new-array {v5, v6, v10, v14}, [Lpw0;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v5

    .line 1907
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v29

    .line 1911
    const/16 v30, 0x0

    .line 1912
    .line 1913
    const-string v24, "\u6e05\u723d"

    .line 1914
    .line 1915
    const-string v25, "\u6e05\u723d\u6a21\u5f0f"

    .line 1916
    .line 1917
    move-object/from16 v28, v26

    .line 1918
    .line 1919
    const-string v26, "\u64ad\u653e\u9875\u6c89\u6d78\u51c0\u5316"

    .line 1920
    .line 1921
    const-string v27, "#7C4DFF"

    .line 1922
    .line 1923
    move-object/from16 v23, v31

    .line 1924
    .line 1925
    invoke-direct/range {v23 .. v30}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 1926
    .line 1927
    .line 1928
    move-object/from16 v26, v28

    .line 1929
    .line 1930
    new-instance v32, Low0;

    .line 1931
    .line 1932
    new-instance v23, Lpw0;

    .line 1933
    .line 1934
    const-string v27, "Feed \u53f3\u4fa7\u4e0d\u611f\u5174\u8da3\u6309\u94ae"

    .line 1935
    .line 1936
    const-string v28, "\u5728\u89c6\u9891\u53f3\u4fa7\u64cd\u4f5c\u680f\u6dfb\u52a0\u5feb\u901f\u6807\u8bb0\u300c\u4e0d\u611f\u5174\u8da3\u300d\u7684\u6309\u94ae\uff0c\u9700\u8981\u91cd\u542f\u6296\u97f3\u751f\u6548\u3002"

    .line 1937
    .line 1938
    const-string v24, "\u4e0d\u611f"

    .line 1939
    .line 1940
    const-string v25, "#7C4DFF"

    .line 1941
    .line 1942
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1943
    .line 1944
    .line 1945
    invoke-static/range {v23 .. v23}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v29

    .line 1949
    const-string v24, "\u53f3\u4fa7"

    .line 1950
    .line 1951
    const-string v25, "\u53f3\u4fa7\u4e0d\u611f\u5174\u8da3\u6309\u94ae"

    .line 1952
    .line 1953
    move-object/from16 v28, v26

    .line 1954
    .line 1955
    const-string v26, "\u5feb\u901f\u6807\u8bb0\u4e0d\u559c\u6b22"

    .line 1956
    .line 1957
    const-string v27, "#7C4DFF"

    .line 1958
    .line 1959
    move-object/from16 v23, v32

    .line 1960
    .line 1961
    invoke-direct/range {v23 .. v30}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 1962
    .line 1963
    .line 1964
    move-object/from16 v26, v28

    .line 1965
    .line 1966
    new-instance v33, Low0;

    .line 1967
    .line 1968
    new-instance v23, Lpw0;

    .line 1969
    .line 1970
    const-string v27, "\u8fdb\u5165\u6296\u97f3\u81ea\u52a8\u626b\u63cf\u4e66\u7b7e\u8bc4\u8bba"

    .line 1971
    .line 1972
    const-string v28, "\u542f\u52a8\u540e\u81ea\u52a8\u67e5\u8be2\u6240\u6709\u4e66\u7b7e\u8bc4\u8bba\u7684\u65b0\u56de\u590d\uff0c\u5e76\u901a\u8fc7\u7cfb\u7edf\u901a\u77e5\u63d0\u9192\u3002"

    .line 1973
    .line 1974
    const-string v24, "\u626b\u63cf"

    .line 1975
    .line 1976
    const-string v25, "#7C4DFF"

    .line 1977
    .line 1978
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1979
    .line 1980
    .line 1981
    invoke-static/range {v23 .. v23}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v29

    .line 1985
    const-string v24, "\u4e66\u7b7e"

    .line 1986
    .line 1987
    const-string v25, "\u8bc4\u8bba\u4e66\u7b7e\u81ea\u52a8\u626b\u63cf"

    .line 1988
    .line 1989
    move-object/from16 v28, v26

    .line 1990
    .line 1991
    const-string v26, "\u81ea\u52a8\u67e5\u8be2\u65b0\u56de\u590d"

    .line 1992
    .line 1993
    const-string v27, "#7C4DFF"

    .line 1994
    .line 1995
    move-object/from16 v23, v33

    .line 1996
    .line 1997
    invoke-direct/range {v23 .. v30}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 1998
    .line 1999
    .line 2000
    move-object/from16 v26, v28

    .line 2001
    .line 2002
    new-instance v34, Low0;

    .line 2003
    .line 2004
    new-instance v35, Lpw0;

    .line 2005
    .line 2006
    const-string v27, "\u706b\u82b1\u81ea\u52a8\u7eed\u671f"

    .line 2007
    .line 2008
    const-string v28, "\u5230\u8fbe\u8bbe\u5b9a\u65f6\u95f4\u540e\u81ea\u52a8\u53d1\u9001\u7eed\u671f\u6d88\u606f\uff0c\u652f\u6301\u65e5\u671f\u5207\u6362\u6216\u6307\u5b9a\u5c0f\u65f6\u89e6\u53d1\u3002"

    .line 2009
    .line 2010
    const-string v24, "\u81ea\u52a8"

    .line 2011
    .line 2012
    const-string v25, "#7C4DFF"

    .line 2013
    .line 2014
    move-object/from16 v23, v35

    .line 2015
    .line 2016
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2017
    .line 2018
    .line 2019
    new-instance v36, Lpw0;

    .line 2020
    .line 2021
    const-string v27, "\u542f\u52a8\u5ef6\u8fdf\u4e0e\u7eed\u671f\u6587\u6848"

    .line 2022
    .line 2023
    const-string v28, "\u53ef\u8bbe\u7f6e\u6253\u5f00\u6296\u97f3\u540e\u7684\u6267\u884c\u5ef6\u8fdf\u548c\u81ea\u52a8\u53d1\u9001\u7684\u7eed\u671f\u6d88\u606f\u5185\u5bb9\u3002"

    .line 2024
    .line 2025
    const-string v24, "\u5ef6\u8fdf"

    .line 2026
    .line 2027
    const-string v25, "#7C4DFF"

    .line 2028
    .line 2029
    move-object/from16 v23, v36

    .line 2030
    .line 2031
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2032
    .line 2033
    .line 2034
    new-instance v37, Lpw0;

    .line 2035
    .line 2036
    const-string v27, "\u81ea\u5b9a\u4e49\u4eba\u5458\u7eed\u706b"

    .line 2037
    .line 2038
    const-string v28, "\u53ef\u4ece\u5df2\u8bc6\u522b\u706b\u82b1\u4f1a\u8bdd\u9009\u62e9\u4eba\u5458\uff0c\u6216\u624b\u52a8\u586b\u5199 cid / uid / name \u89c4\u5219\u3002"

    .line 2039
    .line 2040
    const-string v24, "\u4eba\u5458"

    .line 2041
    .line 2042
    const-string v25, "#7C4DFF"

    .line 2043
    .line 2044
    move-object/from16 v23, v37

    .line 2045
    .line 2046
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2047
    .line 2048
    .line 2049
    new-instance v38, Lpw0;

    .line 2050
    .line 2051
    const-string v27, "\u81ea\u52a8\u9886\u53d6\u706b\u661f\u5956\u52b1"

    .line 2052
    .line 2053
    const-string v28, "\u4ec5\u904d\u5386\u8eab\u4efd\u5b8c\u6574\u7684\u5355\u804a\u5e76\u9886\u53d6\u5168\u90e8\u5f85\u9886\u53d6\u5956\u52b1\uff0c\u6309\u4f1a\u8bdd\u4e0e\u4efb\u52a1\u53bb\u91cd\uff1b\u542f\u52a8\u68c0\u67e5\u652f\u6301\u4f1a\u8bdd\u672a\u5c31\u7eea\u91cd\u8bd5\uff0c\u81ea\u52a8\u8425\u5730\u6279\u6b21\u540e\u8fd8\u53ef\u9759\u9ed8\u8865\u9886\u3002"

    .line 2054
    .line 2055
    const-string v24, "\u9886\u53d6"

    .line 2056
    .line 2057
    const-string v25, "#7C4DFF"

    .line 2058
    .line 2059
    move-object/from16 v23, v38

    .line 2060
    .line 2061
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2062
    .line 2063
    .line 2064
    new-instance v23, Lpw0;

    .line 2065
    .line 2066
    const-string v27, "\u81ea\u52a8\u5b8c\u6210\u706b\u661f\u4efb\u52a1"

    .line 2067
    .line 2068
    const-string v28, "\u6309\u670d\u52a1\u7aef\u5b9e\u65f6\u8981\u6c42\u5b8c\u6210\u4e92\u53d1\u6d88\u606f\u6216\u56fe\u7247\u4efb\u52a1\uff1b\u652f\u6301\u5168\u5c40\u4e0e\u4eba\u5458\u89c4\u5219\u300148 \u5b57\u6d88\u606f\u5185\u5bb9\u300130MB \u4ee5\u5185\u4efb\u52a1\u56fe\u7247\uff0c\u4ee5\u53ca\u5b8c\u6210\u540e\u9886\u53d6\u3002"

    .line 2069
    .line 2070
    const-string v24, "\u4efb\u52a1"

    .line 2071
    .line 2072
    const-string v25, "#7C4DFF"

    .line 2073
    .line 2074
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2075
    .line 2076
    .line 2077
    move-object/from16 v39, v23

    .line 2078
    .line 2079
    new-instance v23, Lpw0;

    .line 2080
    .line 2081
    const-string v27, "\u5c0f\u706b\u4eba\u6295\u5582"

    .line 2082
    .line 2083
    const-string v28, "\u652f\u6301\u624b\u52a8\u548c\u6bcf\u8fdb\u7a0b\u4e00\u6b21\u7684\u81ea\u52a8\u6295\u5582\uff0c\u98df\u7269\u5217\u8868\u9879\u53ef\u70b9\u51fb\u4fee\u6539\uff1b\u56fa\u5b9a\u6216\u667a\u80fd\u9009\u98df\u5747\u4f1a\u9010\u4eba\u5458\u590d\u6838\u5b9e\u65f6\u76ee\u5f55\u3001\u6d3b\u52a8\u72b6\u6001\u548c\u4ef7\u683c\u3002"

    .line 2084
    .line 2085
    const-string v24, "\u6295\u5582"

    .line 2086
    .line 2087
    const-string v25, "#7C4DFF"

    .line 2088
    .line 2089
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2090
    .line 2091
    .line 2092
    move-object/from16 v40, v23

    .line 2093
    .line 2094
    new-instance v23, Lpw0;

    .line 2095
    .line 2096
    const-string v27, "\u6295\u5582\u667a\u80fd\u9009\u62e9\u4e0e\u4ef7\u683c\u4e0a\u9650"

    .line 2097
    .line 2098
    const-string v28, "\u514d\u8d39\u98df\u7269\u4f18\u5148\uff0c\u4ed8\u8d39\u98df\u7269\u6309\u4eb2\u5bc6\u5ea6 / \u706b\u661f\u4ef7\u683c\u9009\u62e9\uff1b\u5355\u6b21\u4e0a\u9650\u4e3a 0 \u65f6\u4ec5\u5141\u8bb8\u514d\u8d39\u98df\u7269\uff0c\u670d\u52a1\u7aef\u6539\u4ef7\u65f6\u5b89\u5168\u8df3\u8fc7\u4e14\u4e0d\u81ea\u52a8\u6362\u98df\u7269\u3002"

    .line 2099
    .line 2100
    const-string v24, "\u667a\u80fd"

    .line 2101
    .line 2102
    const-string v25, "#7C4DFF"

    .line 2103
    .line 2104
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2105
    .line 2106
    .line 2107
    move-object/from16 v41, v23

    .line 2108
    .line 2109
    new-instance v23, Lpw0;

    .line 2110
    .line 2111
    const-string v27, "\u706b\u82b1 / \u706b\u661f\u8fdb\u5ea6\u4e0e\u6210\u529f\u63d0\u9192"

    .line 2112
    .line 2113
    const-string v28, "\u81ea\u52a8\u6d41\u7a0b\u6309\u8d26\u53f7\u548c\u672c\u5730\u81ea\u7136\u65e5\u9650\u5236\u9876\u90e8\u63d0\u793a\u9891\u7387\uff1b\u624b\u52a8\u4efb\u52a1\u4fdd\u7559\u771f\u5b9e\u8fdb\u5ea6\uff0c\u6295\u5582\u3001\u7ecf\u9a8c\u6216\u706b\u661f\u5b9e\u9645\u6210\u529f\u65f6\u53ef\u72ec\u7acb\u663e\u793a Toast\u3002"

    .line 2114
    .line 2115
    const-string v24, "\u63d0\u9192"

    .line 2116
    .line 2117
    const-string v25, "#7C4DFF"

    .line 2118
    .line 2119
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2120
    .line 2121
    .line 2122
    move-object/from16 v42, v23

    .line 2123
    .line 2124
    filled-new-array/range {v35 .. v42}, [Lpw0;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v5

    .line 2128
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v29

    .line 2132
    const-string v24, "\u706b\u82b1"

    .line 2133
    .line 2134
    const-string v25, "\u706b\u82b1\u7eed\u671f"

    .line 2135
    .line 2136
    move-object/from16 v28, v26

    .line 2137
    .line 2138
    const-string v26, "\u7eed\u706b\u3001\u706b\u661f\u4efb\u52a1\u4e0e\u81ea\u5b9a\u4e49\u4eba\u5458"

    .line 2139
    .line 2140
    const-string v27, "#7C4DFF"

    .line 2141
    .line 2142
    move-object/from16 v23, v34

    .line 2143
    .line 2144
    invoke-direct/range {v23 .. v30}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 2145
    .line 2146
    .line 2147
    move-object/from16 v26, v28

    .line 2148
    .line 2149
    new-instance v35, Low0;

    .line 2150
    .line 2151
    new-instance v36, Lpw0;

    .line 2152
    .line 2153
    const-string v27, "\u8425\u5730\u7ba1\u7406\u4e0e\u72b6\u6001\u5237\u65b0"

    .line 2154
    .line 2155
    const-string v28, "\u7edf\u4e00\u7ba1\u7406\u5f53\u524d\u8d26\u53f7\u8bc6\u522b\u5230\u7684\u5355\u804a\u8425\u5730\uff0c\u53ef\u5f3a\u5236\u5237\u65b0\u5e76\u533a\u5206\u53ef\u7528\u3001\u65e0\u5c0f\u706b\u4eba\u3001\u65e0\u8425\u5730\u3001\u5f85\u5237\u65b0\u548c\u7f51\u7edc\u5931\u8d25\uff1b\u957f\u6309\u67e5\u770b\u9010\u5730\u5757\u8be6\u60c5\u3002"

    .line 2156
    .line 2157
    const-string v24, "\u4eba\u5458"

    .line 2158
    .line 2159
    const-string v25, "#7C4DFF"

    .line 2160
    .line 2161
    move-object/from16 v23, v36

    .line 2162
    .line 2163
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2164
    .line 2165
    .line 2166
    new-instance v37, Lpw0;

    .line 2167
    .line 2168
    const-string v27, "\u8fd1\u671f\u6536\u76ca\u7edf\u8ba1"

    .line 2169
    .line 2170
    const-string v28, "\u8425\u5730\u9762\u677f\u5c55\u793a\u8fd1\u671f\u6536\u76ca\u7edf\u8ba1\u548c\u6298\u7ebf\u56fe\uff0c\u5e76\u9002\u914d\u6d45\u8272\u4e0e\u6df1\u8272\u6a21\u5f0f\uff1b\u4eba\u5458\u5217\u8868\u6c47\u603b\u7b49\u7ea7\u3001\u4f5c\u7269\u3001\u751f\u957f\u8fdb\u5ea6\u53ca\u5730\u5757\u72b6\u6001\u3002"

    .line 2171
    .line 2172
    const-string v24, "\u7edf\u8ba1"

    .line 2173
    .line 2174
    const-string v25, "#7C4DFF"

    .line 2175
    .line 2176
    move-object/from16 v23, v37

    .line 2177
    .line 2178
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2179
    .line 2180
    .line 2181
    new-instance v38, Lpw0;

    .line 2182
    .line 2183
    const-string v27, "\u624b\u52a8\u6279\u91cf\u6536\u83dc\u3001\u79cd\u5730\u4e0e\u6d47\u6c34"

    .line 2184
    .line 2185
    const-string v28, "\u6267\u884c\u524d\u5f3a\u5236\u5237\u65b0\u6700\u65b0\u72b6\u6001\uff1b\u6700\u591a\u5e76\u884c\u5904\u7406 4 \u4e2a\u4e0d\u540c\u4f1a\u8bdd\uff0c\u540c\u4e00\u4f1a\u8bdd\u4e25\u683c\u987a\u5e8f\uff0c\u53ef\u4e2d\u9014\u505c\u6b62\u5e76\u4fdd\u7559\u771f\u5b9e\u8fdb\u5ea6\u548c\u7ed3\u679c\u3002"

    .line 2186
    .line 2187
    const-string v24, "\u624b\u52a8"

    .line 2188
    .line 2189
    const-string v25, "#7C4DFF"

    .line 2190
    .line 2191
    move-object/from16 v23, v38

    .line 2192
    .line 2193
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2194
    .line 2195
    .line 2196
    new-instance v23, Lpw0;

    .line 2197
    .line 2198
    const-string v27, "\u72ec\u7acb\u81ea\u52a8\u4efb\u52a1\u4e0e\u5b9a\u5411\u5237\u65b0"

    .line 2199
    .line 2200
    const-string v28, "\u81ea\u52a8\u6536\u83dc\u3001\u79cd\u5730\u3001\u6d47\u6c34\u76f8\u4e92\u72ec\u7acb\uff0c\u652f\u6301 0~300 \u79d2\u8fdb\u5165\u5ef6\u8fdf\uff1b\u4ec5\u5237\u65b0\u5230\u671f\u6216\u5b58\u5728\u5019\u9009\u64cd\u4f5c\u7684\u6700\u5c0f\u4f1a\u8bdd\u8303\u56f4\u3002"

    .line 2201
    .line 2202
    const-string v24, "\u81ea\u52a8"

    .line 2203
    .line 2204
    const-string v25, "#7C4DFF"

    .line 2205
    .line 2206
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2207
    .line 2208
    .line 2209
    move-object/from16 v39, v23

    .line 2210
    .line 2211
    new-instance v23, Lpw0;

    .line 2212
    .line 2213
    const-string v27, "\u79cd\u5b50\u76ee\u5f55\u4e0e\u79cd\u690d\u7b56\u7565"

    .line 2214
    .line 2215
    const-string v28, "\u652f\u6301\u672a\u8bbe\u7f6e\u3001\u667a\u80fd\u9009\u62e9\u548c\u56fa\u5b9a\u79cd\u5b50\uff1b\u667a\u80fd\u6a21\u5f0f\u6309\u5b9e\u65f6\u7b49\u7ea7\u3001\u4f59\u989d\u3001\u5728\u552e\u4e0e\u6d3b\u52a8\u72b6\u6001\u7b5b\u9009\uff0c\u514d\u8d39\u4f18\u5148\uff0c\u4ed8\u8d39\u79cd\u5b50\u6309\u6536\u76ca / \u4ef7\u683c\u6392\u5e8f\u3002"

    .line 2216
    .line 2217
    const-string v24, "\u79cd\u5b50"

    .line 2218
    .line 2219
    const-string v25, "#7C4DFF"

    .line 2220
    .line 2221
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2222
    .line 2223
    .line 2224
    move-object/from16 v40, v23

    .line 2225
    .line 2226
    new-instance v23, Lpw0;

    .line 2227
    .line 2228
    const-string v27, "\u4eba\u5458\u72ec\u7acb\u89c4\u5219"

    .line 2229
    .line 2230
    const-string v28, "\u6bcf\u4f4d\u4eba\u5458\u53ef\u5206\u522b\u8986\u76d6\u6536\u83dc\u3001\u79cd\u5730\u3001\u6d47\u6c34\u548c\u79cd\u5b50\u7b56\u7565\uff0c\u5e76\u7ef4\u62a4\u53ea\u5f71\u54cd\u667a\u80fd\u9009\u79cd\u7684\u72ec\u7acb\u6392\u9664\u540d\u5355\u3002"

    .line 2231
    .line 2232
    const-string v24, "\u89c4\u5219"

    .line 2233
    .line 2234
    const-string v25, "#7C4DFF"

    .line 2235
    .line 2236
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2237
    .line 2238
    .line 2239
    move-object/from16 v41, v23

    .line 2240
    .line 2241
    new-instance v23, Lpw0;

    .line 2242
    .line 2243
    const-string v27, "\u8425\u5730\u5b89\u5168\u9650\u5236\u4e0e\u964d\u7ea7"

    .line 2244
    .line 2245
    const-string v28, "\u652f\u6301\u6bcf\u65e5\u6536\u83b7 / \u79cd\u690d\u9650\u989d\u3001\u667a\u80fd\u4ef7\u683c\u4e0a\u9650\u548c\u540c\u4f1a\u8bdd\u64cd\u4f5c\u95f4\u9694\uff1b\u4f59\u989d\u3001\u7b49\u7ea7\u3001\u76ee\u5f55\u3001\u7f51\u7edc\u6216\u72b6\u6001\u4e0d\u6ee1\u8db3\u65f6\u5b89\u5168\u8df3\u8fc7\u3002"

    .line 2246
    .line 2247
    const-string v24, "\u5b89\u5168"

    .line 2248
    .line 2249
    const-string v25, "#7C4DFF"

    .line 2250
    .line 2251
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2252
    .line 2253
    .line 2254
    move-object/from16 v42, v23

    .line 2255
    .line 2256
    filled-new-array/range {v36 .. v42}, [Lpw0;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v5

    .line 2260
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2261
    .line 2262
    .line 2263
    move-result-object v29

    .line 2264
    const-string v24, "\u8425\u5730"

    .line 2265
    .line 2266
    const-string v25, "\u5c0f\u706b\u4eba\u53e3\u888b\u8425\u5730"

    .line 2267
    .line 2268
    move-object/from16 v28, v26

    .line 2269
    .line 2270
    const-string v26, "\u9002\u914d\u5bbf\u4e3b 39.3\uff0c\u7ba1\u7406\u3001\u7edf\u8ba1\u4e0e\u81ea\u52a8\u4efb\u52a1"

    .line 2271
    .line 2272
    const-string v27, "#7C4DFF"

    .line 2273
    .line 2274
    move-object/from16 v23, v35

    .line 2275
    .line 2276
    invoke-direct/range {v23 .. v30}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 2277
    .line 2278
    .line 2279
    move-object/from16 v26, v28

    .line 2280
    .line 2281
    new-instance v36, Low0;

    .line 2282
    .line 2283
    new-instance v23, Lpw0;

    .line 2284
    .line 2285
    const-string v27, "\u804a\u5929\u8bb0\u5f55\u5bfc\u51fa"

    .line 2286
    .line 2287
    const-string v28, "\u652f\u6301 TXT / JSON \u683c\u5f0f\u548c\u81ea\u9009\u4fdd\u5b58\u76ee\u5f55\uff1b\u5b8c\u6574\u5bfc\u51fa\u4f1a\u8bfb\u53d6\u5230\u6700\u65e9\u4e00\u6761\u6d88\u606f\u5e76\u663e\u793a\u9636\u6bb5\u8fdb\u5ea6\uff0c\u56e0\u6b64\u4f1a\u6bd4\u4ec5\u5bfc\u51fa\u5f53\u524d\u5df2\u52a0\u8f7d\u6d88\u606f\u66f4\u6162\u3002"

    .line 2288
    .line 2289
    const-string v24, "\u5bfc\u51fa"

    .line 2290
    .line 2291
    const-string v25, "#7C4DFF"

    .line 2292
    .line 2293
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2294
    .line 2295
    .line 2296
    move-object/from16 v5, v23

    .line 2297
    .line 2298
    new-instance v23, Lpw0;

    .line 2299
    .line 2300
    const-string v27, "\u9ab0\u5b50\u70b9\u6570\u63a7\u5236"

    .line 2301
    .line 2302
    const-string v28, "\u53ef\u5c06\u4e0b\u4e00\u6b21\u804a\u5929\u9ab0\u5b50\u9501\u5b9a\u4e3a 1~6 \u70b9\uff0c\u53d1\u9001\u540e\u5bf9\u65b9\u770b\u5230\u76f8\u540c\u7ed3\u679c\uff0c\u4e5f\u53ef\u968f\u65f6\u6062\u590d\u5bbf\u4e3b\u968f\u673a\u6a21\u5f0f\u3002"

    .line 2303
    .line 2304
    const-string v24, "\u9ab0\u5b50"

    .line 2305
    .line 2306
    const-string v25, "#7C4DFF"

    .line 2307
    .line 2308
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2309
    .line 2310
    .line 2311
    move-object/from16 v6, v23

    .line 2312
    .line 2313
    new-instance v23, Lpw0;

    .line 2314
    .line 2315
    const-string v27, "\u4e00\u952e\u5df2\u8bfb"

    .line 2316
    .line 2317
    const-string v28, "\u4ece\u64cd\u4f5c\u83dc\u5355\u5c06\u6d88\u606f\u5217\u8868\u4e2d\u7684\u5168\u90e8\u4f1a\u8bdd\u6279\u91cf\u6807\u8bb0\u4e3a\u5df2\u8bfb\u3002"

    .line 2318
    .line 2319
    const-string v24, "\u5df2\u8bfb"

    .line 2320
    .line 2321
    const-string v25, "#7C4DFF"

    .line 2322
    .line 2323
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2324
    .line 2325
    .line 2326
    move-object/from16 v10, v23

    .line 2327
    .line 2328
    filled-new-array {v5, v6, v10}, [Lpw0;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v5

    .line 2332
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v29

    .line 2336
    const-string v24, "\u804a\u5929"

    .line 2337
    .line 2338
    const-string v25, "\u804a\u5929\u5de5\u5177"

    .line 2339
    .line 2340
    move-object/from16 v28, v26

    .line 2341
    .line 2342
    const-string v26, "\u8bb0\u5f55\u5bfc\u51fa\u3001\u9ab0\u5b50\u4e0e\u6279\u91cf\u5df2\u8bfb"

    .line 2343
    .line 2344
    const-string v27, "#7C4DFF"

    .line 2345
    .line 2346
    move-object/from16 v23, v36

    .line 2347
    .line 2348
    invoke-direct/range {v23 .. v30}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 2349
    .line 2350
    .line 2351
    move-object/from16 v26, v28

    .line 2352
    .line 2353
    new-instance v37, Low0;

    .line 2354
    .line 2355
    new-instance v23, Lpw0;

    .line 2356
    .line 2357
    const-string v27, "\u89c6\u9891\u7ae0\u8282\u5e7f\u544a\u8df3\u8fc7"

    .line 2358
    .line 2359
    const-string v28, "\u64ad\u653e\u5e26\u7ae0\u8282\u7684\u89c6\u9891\u65f6\uff0c\u8bc6\u522b\u7ae0\u8282\u8fdb\u5ea6\u6761\u4e2d\u7684\u5e7f\u544a\u6216\u8425\u9500\u7247\u6bb5\u5e76\u5c1d\u8bd5\u81ea\u52a8\u8df3\u8fc7\uff1b\u5bbf\u4e3b\u9875\u9762\u5dee\u5f02\u8f83\u5927\uff0c\u672a\u547d\u4e2d\u65f6\u4fdd\u7559\u539f\u59cb\u64ad\u653e\u884c\u4e3a\u3002"

    .line 2360
    .line 2361
    const-string v24, "\u7ae0\u8282"

    .line 2362
    .line 2363
    const-string v25, "#7C4DFF"

    .line 2364
    .line 2365
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2366
    .line 2367
    .line 2368
    invoke-static/range {v23 .. v23}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 2369
    .line 2370
    .line 2371
    move-result-object v29

    .line 2372
    const-string v24, "\u5b9e\u9a8c"

    .line 2373
    .line 2374
    const-string v25, "\u5b9e\u9a8c\u6027\u64ad\u653e\u529f\u80fd"

    .line 2375
    .line 2376
    move-object/from16 v28, v26

    .line 2377
    .line 2378
    const-string v26, "\u7ae0\u8282\u5185\u5bb9\u8bc6\u522b\u4e0e\u8df3\u8fc7"

    .line 2379
    .line 2380
    const-string v27, "#7C4DFF"

    .line 2381
    .line 2382
    move-object/from16 v23, v37

    .line 2383
    .line 2384
    invoke-direct/range {v23 .. v30}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 2385
    .line 2386
    .line 2387
    move-object/from16 v26, v28

    .line 2388
    .line 2389
    new-instance v38, Low0;

    .line 2390
    .line 2391
    new-instance v23, Lpw0;

    .line 2392
    .line 2393
    const-string v27, "\u542f\u7528\u7a7a\u95f2\u9000\u51fa"

    .line 2394
    .line 2395
    const-string v28, "\u8d85\u8fc7\u8bbe\u5b9a\u65f6\u95f4\u65e0\u64cd\u4f5c\u540e\u81ea\u52a8\u9000\u51fa\u6296\u97f3\u3002"

    .line 2396
    .line 2397
    const-string v24, "\u8ba1\u65f6"

    .line 2398
    .line 2399
    const-string v25, "#7C4DFF"

    .line 2400
    .line 2401
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2402
    .line 2403
    .line 2404
    move-object/from16 v5, v23

    .line 2405
    .line 2406
    new-instance v23, Lpw0;

    .line 2407
    .line 2408
    const-string v27, "\u9000\u51fa\u540e\u9501\u5c4f"

    .line 2409
    .line 2410
    const-string v28, "\u9000\u51fa\u6296\u97f3\u65f6\u53ef\u5c1d\u8bd5\u9501\u5c4f\uff0c\u9700\u8981 Root\u3002"

    .line 2411
    .line 2412
    const-string v24, "\u9501\u5c4f"

    .line 2413
    .line 2414
    const-string v25, "#7C4DFF"

    .line 2415
    .line 2416
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2417
    .line 2418
    .line 2419
    move-object/from16 v6, v23

    .line 2420
    .line 2421
    new-instance v23, Lpw0;

    .line 2422
    .line 2423
    const-string v27, "\u9000\u51fa\u524d\u5012\u8ba1\u65f6\u63d0\u793a"

    .line 2424
    .line 2425
    const-string v28, "\u7a7a\u95f2\u8d85\u65f6\u524d\u663e\u793a\u5012\u8ba1\u65f6\uff0c\u89e6\u6478\u53ef\u53d6\u6d88\u9000\u51fa\u3002"

    .line 2426
    .line 2427
    const-string v24, "\u5012\u8ba1"

    .line 2428
    .line 2429
    const-string v25, "#7C4DFF"

    .line 2430
    .line 2431
    invoke-direct/range {v23 .. v28}, Lpw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2432
    .line 2433
    .line 2434
    move-object/from16 v10, v23

    .line 2435
    .line 2436
    filled-new-array {v5, v6, v10}, [Lpw0;

    .line 2437
    .line 2438
    .line 2439
    move-result-object v5

    .line 2440
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v29

    .line 2444
    const-string v24, "\u9000\u51fa"

    .line 2445
    .line 2446
    const-string v25, "\u7a7a\u95f2\u9000\u51fa"

    .line 2447
    .line 2448
    move-object/from16 v28, v26

    .line 2449
    .line 2450
    const-string v26, "\u65e0\u64cd\u4f5c\u81ea\u52a8\u9000\u51fa"

    .line 2451
    .line 2452
    const-string v27, "#7C4DFF"

    .line 2453
    .line 2454
    move-object/from16 v23, v38

    .line 2455
    .line 2456
    invoke-direct/range {v23 .. v30}, Low0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 2457
    .line 2458
    .line 2459
    move-object/from16 v30, v1

    .line 2460
    .line 2461
    filled-new-array/range {v30 .. v38}, [Low0;

    .line 2462
    .line 2463
    .line 2464
    move-result-object v1

    .line 2465
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v1

    .line 2469
    invoke-virtual {v0, v1, v13}, Lcom/example/dyhelper/ui/MainActivity;->α(Ljava/util/List;Lnw0;)Landroid/widget/LinearLayout;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v1

    .line 2473
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v5

    .line 2477
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2478
    .line 2479
    .line 2480
    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 2481
    .line 2482
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2483
    .line 2484
    .line 2485
    move-result-object v6

    .line 2486
    const/16 v10, 0x1c

    .line 2487
    .line 2488
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v10

    .line 2492
    invoke-interface {v6, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2493
    .line 2494
    .line 2495
    move-result-object v6

    .line 2496
    check-cast v6, Ljava/lang/Number;

    .line 2497
    .line 2498
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 2499
    .line 2500
    .line 2501
    move-result v6

    .line 2502
    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 2503
    .line 2504
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2505
    .line 2506
    .line 2507
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2508
    .line 2509
    .line 2510
    const-string v1, "\u83dc\u5355\u547c\u51fa\u65b9\u5f0f"

    .line 2511
    .line 2512
    invoke-virtual {v0, v1, v13}, Lcom/example/dyhelper/ui/MainActivity;->β(Ljava/lang/String;Lnw0;)Landroid/widget/TextView;

    .line 2513
    .line 2514
    .line 2515
    move-result-object v1

    .line 2516
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2517
    .line 2518
    .line 2519
    const/16 v1, 0xd

    .line 2520
    .line 2521
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2522
    .line 2523
    .line 2524
    move-result-object v1

    .line 2525
    new-instance v5, Ll91;

    .line 2526
    .line 2527
    const-string v6, "Feed \u6d41\u624b\u52bf"

    .line 2528
    .line 2529
    const-string v10, "\u53ef\u5728\u6296\u97f3\u5185\u8bbe\u7f6e\u9875\u914d\u7f6e\u4e0d\u540c\u533a\u57df\u7684\u53cc\u51fb / \u957f\u6309\u52a8\u4f5c\u3002"

    .line 2530
    .line 2531
    invoke-direct {v5, v6, v10}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2532
    .line 2533
    .line 2534
    new-instance v6, Ll91;

    .line 2535
    .line 2536
    const-string v10, "\u97f3\u91cf\u952e\u7ec4\u5408"

    .line 2537
    .line 2538
    const-string v14, "\u5148\u6309\u4e00\u4e0b\u97f3\u91cf+\uff0c\u518d\u6309\u4e00\u4e0b\u97f3\u91cf-\uff0c\u5373\u53ef\u547c\u51fa DY Helper \u64cd\u4f5c\u83dc\u5355\u3002"

    .line 2539
    .line 2540
    invoke-direct {v6, v10, v14}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2541
    .line 2542
    .line 2543
    new-instance v10, Ll91;

    .line 2544
    .line 2545
    const-string v14, "\u5206\u4eab\u9762\u677f"

    .line 2546
    .line 2547
    const-string v15, "\u70b9\u51fb\u89c6\u9891\u5206\u4eab\uff0c\u5728\u5206\u4eab\u9762\u677f\u4e2d\u627e\u5230 DY Helper \u5feb\u6377\u5165\u53e3\u3002"

    .line 2548
    .line 2549
    invoke-direct {v10, v14, v15}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2550
    .line 2551
    .line 2552
    filled-new-array {v5, v6, v10}, [Ll91;

    .line 2553
    .line 2554
    .line 2555
    move-result-object v5

    .line 2556
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2557
    .line 2558
    .line 2559
    move-result-object v5

    .line 2560
    new-instance v6, Landroid/widget/LinearLayout;

    .line 2561
    .line 2562
    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2563
    .line 2564
    .line 2565
    const/4 v14, 0x1

    .line 2566
    invoke-virtual {v6, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2567
    .line 2568
    .line 2569
    new-instance v10, Landroid/graphics/drawable/GradientDrawable;

    .line 2570
    .line 2571
    invoke-direct {v10}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 2572
    .line 2573
    .line 2574
    iget-object v14, v13, Lnw0;->β:Ljava/lang/String;

    .line 2575
    .line 2576
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2577
    .line 2578
    .line 2579
    move-result v14

    .line 2580
    invoke-virtual {v10, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 2581
    .line 2582
    .line 2583
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2584
    .line 2585
    .line 2586
    move-result-object v14

    .line 2587
    invoke-interface {v14, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2588
    .line 2589
    .line 2590
    move-result-object v14

    .line 2591
    check-cast v14, Ljava/lang/Number;

    .line 2592
    .line 2593
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 2594
    .line 2595
    .line 2596
    move-result v14

    .line 2597
    int-to-float v14, v14

    .line 2598
    invoke-virtual {v10, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 2599
    .line 2600
    .line 2601
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2602
    .line 2603
    .line 2604
    move-result-object v14

    .line 2605
    invoke-interface {v14, v11}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2606
    .line 2607
    .line 2608
    move-result-object v14

    .line 2609
    check-cast v14, Ljava/lang/Number;

    .line 2610
    .line 2611
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 2612
    .line 2613
    .line 2614
    move-result v14

    .line 2615
    iget-object v15, v13, Lnw0;->ι:Ljava/lang/String;

    .line 2616
    .line 2617
    move-object/from16 v23, v5

    .line 2618
    .line 2619
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2620
    .line 2621
    .line 2622
    move-result v5

    .line 2623
    invoke-virtual {v10, v14, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 2624
    .line 2625
    .line 2626
    invoke-virtual {v6, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2627
    .line 2628
    .line 2629
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 2630
    .line 2631
    const/4 v10, -0x2

    .line 2632
    const/4 v14, -0x1

    .line 2633
    invoke-direct {v5, v14, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2634
    .line 2635
    .line 2636
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2637
    .line 2638
    .line 2639
    move-result-object v10

    .line 2640
    move-object/from16 v14, v18

    .line 2641
    .line 2642
    invoke-interface {v10, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2643
    .line 2644
    .line 2645
    move-result-object v10

    .line 2646
    check-cast v10, Ljava/lang/Number;

    .line 2647
    .line 2648
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 2649
    .line 2650
    .line 2651
    move-result v10

    .line 2652
    iput v10, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 2653
    .line 2654
    invoke-virtual {v6, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2655
    .line 2656
    .line 2657
    invoke-interface/range {v23 .. v23}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2658
    .line 2659
    .line 2660
    move-result-object v5

    .line 2661
    const/4 v10, 0x0

    .line 2662
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2663
    .line 2664
    .line 2665
    move-result v18

    .line 2666
    if-eqz v18, :cond_6

    .line 2667
    .line 2668
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2669
    .line 2670
    .line 2671
    move-result-object v18

    .line 2672
    add-int/lit8 v24, v10, 0x1

    .line 2673
    .line 2674
    if-ltz v10, :cond_5

    .line 2675
    .line 2676
    move-object/from16 v25, v5

    .line 2677
    .line 2678
    move-object/from16 v5, v18

    .line 2679
    .line 2680
    check-cast v5, Ll91;

    .line 2681
    .line 2682
    move-object/from16 v18, v12

    .line 2683
    .line 2684
    new-instance v12, Landroid/widget/LinearLayout;

    .line 2685
    .line 2686
    invoke-direct {v12, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2687
    .line 2688
    .line 2689
    move-object/from16 v26, v15

    .line 2690
    .line 2691
    const/4 v15, 0x0

    .line 2692
    invoke-virtual {v12, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2693
    .line 2694
    .line 2695
    const/16 v15, 0x10

    .line 2696
    .line 2697
    invoke-virtual {v12, v15}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 2698
    .line 2699
    .line 2700
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2701
    .line 2702
    .line 2703
    move-result-object v15

    .line 2704
    invoke-interface {v15, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2705
    .line 2706
    .line 2707
    move-result-object v15

    .line 2708
    check-cast v15, Ljava/lang/Number;

    .line 2709
    .line 2710
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 2711
    .line 2712
    .line 2713
    move-result v15

    .line 2714
    move-object/from16 v27, v3

    .line 2715
    .line 2716
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2717
    .line 2718
    .line 2719
    move-result-object v3

    .line 2720
    invoke-interface {v3, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2721
    .line 2722
    .line 2723
    move-result-object v3

    .line 2724
    check-cast v3, Ljava/lang/Number;

    .line 2725
    .line 2726
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2727
    .line 2728
    .line 2729
    move-result v3

    .line 2730
    move-object/from16 v28, v2

    .line 2731
    .line 2732
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2733
    .line 2734
    .line 2735
    move-result-object v2

    .line 2736
    invoke-interface {v2, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2737
    .line 2738
    .line 2739
    move-result-object v2

    .line 2740
    check-cast v2, Ljava/lang/Number;

    .line 2741
    .line 2742
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 2743
    .line 2744
    .line 2745
    move-result v2

    .line 2746
    move-object/from16 v29, v14

    .line 2747
    .line 2748
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2749
    .line 2750
    .line 2751
    move-result-object v14

    .line 2752
    invoke-interface {v14, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2753
    .line 2754
    .line 2755
    move-result-object v14

    .line 2756
    check-cast v14, Ljava/lang/Number;

    .line 2757
    .line 2758
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 2759
    .line 2760
    .line 2761
    move-result v14

    .line 2762
    invoke-virtual {v12, v15, v3, v2, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 2763
    .line 2764
    .line 2765
    new-instance v2, Landroid/widget/TextView;

    .line 2766
    .line 2767
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2768
    .line 2769
    .line 2770
    const-string v3, "\u203a"

    .line 2771
    .line 2772
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2773
    .line 2774
    .line 2775
    const/high16 v3, 0x41900000    # 18.0f

    .line 2776
    .line 2777
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2778
    .line 2779
    .line 2780
    invoke-static/range {v21 .. v21}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2781
    .line 2782
    .line 2783
    move-result v3

    .line 2784
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2785
    .line 2786
    .line 2787
    const/4 v3, 0x0

    .line 2788
    const/4 v14, 0x1

    .line 2789
    invoke-virtual {v2, v3, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 2790
    .line 2791
    .line 2792
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 2793
    .line 2794
    const/4 v14, -0x2

    .line 2795
    invoke-direct {v3, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2796
    .line 2797
    .line 2798
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v14

    .line 2802
    invoke-interface {v14, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2803
    .line 2804
    .line 2805
    move-result-object v14

    .line 2806
    check-cast v14, Ljava/lang/Number;

    .line 2807
    .line 2808
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 2809
    .line 2810
    .line 2811
    move-result v14

    .line 2812
    iput v14, v3, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 2813
    .line 2814
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2815
    .line 2816
    .line 2817
    invoke-virtual {v12, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2818
    .line 2819
    .line 2820
    new-instance v2, Landroid/widget/LinearLayout;

    .line 2821
    .line 2822
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2823
    .line 2824
    .line 2825
    const/4 v14, 0x1

    .line 2826
    invoke-virtual {v2, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2827
    .line 2828
    .line 2829
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 2830
    .line 2831
    const/high16 v14, 0x3f800000    # 1.0f

    .line 2832
    .line 2833
    const/4 v15, -0x2

    .line 2834
    move-object/from16 v30, v1

    .line 2835
    .line 2836
    const/4 v1, 0x0

    .line 2837
    invoke-direct {v3, v1, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 2838
    .line 2839
    .line 2840
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2841
    .line 2842
    .line 2843
    new-instance v1, Landroid/widget/TextView;

    .line 2844
    .line 2845
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2846
    .line 2847
    .line 2848
    iget-object v3, v5, Ll91;->ε:Ljava/lang/Object;

    .line 2849
    .line 2850
    check-cast v3, Ljava/lang/CharSequence;

    .line 2851
    .line 2852
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2853
    .line 2854
    .line 2855
    const/high16 v3, 0x41500000    # 13.0f

    .line 2856
    .line 2857
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2858
    .line 2859
    .line 2860
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2861
    .line 2862
    .line 2863
    move-result v3

    .line 2864
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2865
    .line 2866
    .line 2867
    const/4 v3, 0x0

    .line 2868
    const/4 v14, 0x1

    .line 2869
    invoke-virtual {v1, v3, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 2870
    .line 2871
    .line 2872
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2873
    .line 2874
    .line 2875
    new-instance v1, Landroid/widget/TextView;

    .line 2876
    .line 2877
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2878
    .line 2879
    .line 2880
    iget-object v3, v5, Ll91;->ζ:Ljava/lang/Object;

    .line 2881
    .line 2882
    check-cast v3, Ljava/lang/CharSequence;

    .line 2883
    .line 2884
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2885
    .line 2886
    .line 2887
    const/high16 v3, 0x41400000    # 12.0f

    .line 2888
    .line 2889
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2890
    .line 2891
    .line 2892
    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2893
    .line 2894
    .line 2895
    move-result v3

    .line 2896
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2897
    .line 2898
    .line 2899
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2900
    .line 2901
    .line 2902
    move-result-object v3

    .line 2903
    const/4 v5, 0x2

    .line 2904
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2905
    .line 2906
    .line 2907
    move-result-object v5

    .line 2908
    invoke-interface {v3, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2909
    .line 2910
    .line 2911
    move-result-object v3

    .line 2912
    check-cast v3, Ljava/lang/Number;

    .line 2913
    .line 2914
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2915
    .line 2916
    .line 2917
    move-result v3

    .line 2918
    const/4 v15, 0x0

    .line 2919
    invoke-virtual {v1, v15, v3, v15, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 2920
    .line 2921
    .line 2922
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2923
    .line 2924
    .line 2925
    invoke-virtual {v12, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2926
    .line 2927
    .line 2928
    invoke-virtual {v6, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2929
    .line 2930
    .line 2931
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I

    .line 2932
    .line 2933
    .line 2934
    move-result v1

    .line 2935
    const/16 v17, 0x1

    .line 2936
    .line 2937
    add-int/lit8 v1, v1, -0x1

    .line 2938
    .line 2939
    if-ge v10, v1, :cond_4

    .line 2940
    .line 2941
    new-instance v1, Landroid/view/View;

    .line 2942
    .line 2943
    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2944
    .line 2945
    .line 2946
    iget-object v2, v13, Lnw0;->θ:Ljava/lang/String;

    .line 2947
    .line 2948
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2949
    .line 2950
    .line 2951
    move-result v2

    .line 2952
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2953
    .line 2954
    .line 2955
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 2956
    .line 2957
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2958
    .line 2959
    .line 2960
    move-result-object v3

    .line 2961
    invoke-interface {v3, v11}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2962
    .line 2963
    .line 2964
    move-result-object v3

    .line 2965
    check-cast v3, Ljava/lang/Number;

    .line 2966
    .line 2967
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2968
    .line 2969
    .line 2970
    move-result v3

    .line 2971
    const/4 v5, -0x1

    .line 2972
    invoke-direct {v2, v5, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2973
    .line 2974
    .line 2975
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2976
    .line 2977
    .line 2978
    move-result-object v3

    .line 2979
    const/16 v5, 0x28

    .line 2980
    .line 2981
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2982
    .line 2983
    .line 2984
    move-result-object v5

    .line 2985
    invoke-interface {v3, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2986
    .line 2987
    .line 2988
    move-result-object v3

    .line 2989
    check-cast v3, Ljava/lang/Number;

    .line 2990
    .line 2991
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2992
    .line 2993
    .line 2994
    move-result v3

    .line 2995
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 2996
    .line 2997
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 2998
    .line 2999
    .line 3000
    move-result-object v3

    .line 3001
    invoke-interface {v3, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3002
    .line 3003
    .line 3004
    move-result-object v3

    .line 3005
    check-cast v3, Ljava/lang/Number;

    .line 3006
    .line 3007
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3008
    .line 3009
    .line 3010
    move-result v3

    .line 3011
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 3012
    .line 3013
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3014
    .line 3015
    .line 3016
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3017
    .line 3018
    .line 3019
    :cond_4
    move-object/from16 v12, v18

    .line 3020
    .line 3021
    move/from16 v10, v24

    .line 3022
    .line 3023
    move-object/from16 v5, v25

    .line 3024
    .line 3025
    move-object/from16 v15, v26

    .line 3026
    .line 3027
    move-object/from16 v3, v27

    .line 3028
    .line 3029
    move-object/from16 v2, v28

    .line 3030
    .line 3031
    move-object/from16 v14, v29

    .line 3032
    .line 3033
    move-object/from16 v1, v30

    .line 3034
    .line 3035
    goto/16 :goto_3

    .line 3036
    .line 3037
    :cond_5
    invoke-static {}, Lyh;->х()V

    .line 3038
    .line 3039
    .line 3040
    const/4 v0, 0x0

    .line 3041
    throw v0

    .line 3042
    :cond_6
    move-object/from16 v28, v2

    .line 3043
    .line 3044
    move-object/from16 v27, v3

    .line 3045
    .line 3046
    move-object/from16 v29, v14

    .line 3047
    .line 3048
    move-object/from16 v26, v15

    .line 3049
    .line 3050
    const/4 v15, 0x0

    .line 3051
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3052
    .line 3053
    .line 3054
    const-string v1, "\u4f7f\u7528\u8bf4\u660e"

    .line 3055
    .line 3056
    invoke-virtual {v0, v1, v13}, Lcom/example/dyhelper/ui/MainActivity;->β(Ljava/lang/String;Lnw0;)Landroid/widget/TextView;

    .line 3057
    .line 3058
    .line 3059
    move-result-object v1

    .line 3060
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3061
    .line 3062
    .line 3063
    const-string v36, "\u2466 \u706b\u661f\u529f\u80fd\u8bf4\u660e\uff1a\u81ea\u52a8\u9886\u53d6\u4f1a\u5728\u6bcf\u6b21\u6253\u5f00\u6296\u97f3\u65f6\u6267\u884c\uff0c\u6bcf\u4e2a\u81ea\u7136\u65e5\u9996\u6b21\u663e\u793a\u901a\u77e5\uff1b\u81ea\u52a8\u5b8c\u6210\u652f\u6301\u4e92\u53d1\u6d88\u606f\u548c\u56fe\u7247\u4efb\u52a1\u3002"

    .line 3064
    .line 3065
    const-string v37, "\u2467 \u5982\u9047\u9002\u914d\u5f02\u5e38\uff0c\u53ef\u5728\u8bbe\u7f6e\u9875\u7684\u7f13\u5b58\u7ba1\u7406\u4e2d\u67e5\u770b DyLog \u65e5\u5fd7\u6216\u6e05\u9664 DexKit \u7f13\u5b58\u3002"

    .line 3066
    .line 3067
    const-string v30, "\u2460 \u5728 LSPosed \u7ba1\u7406\u5668\u4e2d\u542f\u7528\u672c\u6a21\u5757\uff0c\u4f5c\u7528\u57df\u52fe\u9009\u300c\u6296\u97f3\u300d\u3002"

    .line 3068
    .line 3069
    const-string v31, "\u2461 \u5f3a\u5236\u505c\u6b62\u6296\u97f3\u540e\u91cd\u65b0\u6253\u5f00\uff0c\u6a21\u5757\u5f00\u59cb\u751f\u6548\u3002"

    .line 3070
    .line 3071
    const-string v32, "\u2462 \u5927\u90e8\u5206\u529f\u80fd\u53ef\u5728\u6296\u97f3\u5185\u901a\u8fc7 DY Helper \u8bbe\u7f6e\u9875\u5f00\u542f\u3001\u5173\u95ed\u6216\u8c03\u6574\u53c2\u6570\u3002"

    .line 3072
    .line 3073
    const-string v33, "\u2463 \u4e0b\u8f7d\u7c7b\u529f\u80fd\u53ef\u901a\u8fc7\u5206\u4eab\u9762\u677f\u3001\u97f3\u91cf\u952e\u7ec4\u5408\u6216\u624b\u52bf\u83dc\u5355\u547c\u51fa\u3002"

    .line 3074
    .line 3075
    const-string v34, "\u2464 \u90e8\u5206\u8bbe\u7f6e\u9700\u8981\u5207\u6362\u9875\u9762\u6216\u91cd\u542f\u6296\u97f3\u540e\u624d\u4f1a\u5b8c\u5168\u751f\u6548\u3002"

    .line 3076
    .line 3077
    const-string v35, "\u2465 \u5185\u6d4b\u529f\u80fd\u9700\u8981\u5f53\u524d\u6296\u97f3\u8d26\u53f7\u901a\u8fc7\u5185\u6d4b\u9a8c\u8bc1\uff0c\u5b9e\u9645\u72b6\u6001\u4ee5\u8bbe\u7f6e\u9875\u663e\u793a\u4e3a\u51c6\u3002"

    .line 3078
    .line 3079
    filled-new-array/range {v30 .. v37}, [Ljava/lang/String;

    .line 3080
    .line 3081
    .line 3082
    move-result-object v1

    .line 3083
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 3084
    .line 3085
    .line 3086
    move-result-object v1

    .line 3087
    new-instance v2, Landroid/widget/LinearLayout;

    .line 3088
    .line 3089
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3090
    .line 3091
    .line 3092
    const/4 v14, 0x1

    .line 3093
    invoke-virtual {v2, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3094
    .line 3095
    .line 3096
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3097
    .line 3098
    .line 3099
    move-result-object v3

    .line 3100
    const/16 v4, 0x12

    .line 3101
    .line 3102
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3103
    .line 3104
    .line 3105
    move-result-object v4

    .line 3106
    invoke-interface {v3, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3107
    .line 3108
    .line 3109
    move-result-object v3

    .line 3110
    check-cast v3, Ljava/lang/Number;

    .line 3111
    .line 3112
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3113
    .line 3114
    .line 3115
    move-result v3

    .line 3116
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3117
    .line 3118
    .line 3119
    move-result-object v5

    .line 3120
    invoke-interface {v5, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3121
    .line 3122
    .line 3123
    move-result-object v5

    .line 3124
    check-cast v5, Ljava/lang/Number;

    .line 3125
    .line 3126
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 3127
    .line 3128
    .line 3129
    move-result v5

    .line 3130
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3131
    .line 3132
    .line 3133
    move-result-object v6

    .line 3134
    invoke-interface {v6, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3135
    .line 3136
    .line 3137
    move-result-object v4

    .line 3138
    check-cast v4, Ljava/lang/Number;

    .line 3139
    .line 3140
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3141
    .line 3142
    .line 3143
    move-result v4

    .line 3144
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3145
    .line 3146
    .line 3147
    move-result-object v6

    .line 3148
    invoke-interface {v6, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3149
    .line 3150
    .line 3151
    move-result-object v6

    .line 3152
    check-cast v6, Ljava/lang/Number;

    .line 3153
    .line 3154
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 3155
    .line 3156
    .line 3157
    move-result v6

    .line 3158
    invoke-virtual {v2, v3, v5, v4, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 3159
    .line 3160
    .line 3161
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 3162
    .line 3163
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 3164
    .line 3165
    .line 3166
    iget-object v4, v13, Lnw0;->γ:Ljava/lang/String;

    .line 3167
    .line 3168
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3169
    .line 3170
    .line 3171
    move-result v4

    .line 3172
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 3173
    .line 3174
    .line 3175
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3176
    .line 3177
    .line 3178
    move-result-object v4

    .line 3179
    invoke-interface {v4, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3180
    .line 3181
    .line 3182
    move-result-object v4

    .line 3183
    check-cast v4, Ljava/lang/Number;

    .line 3184
    .line 3185
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3186
    .line 3187
    .line 3188
    move-result v4

    .line 3189
    int-to-float v4, v4

    .line 3190
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 3191
    .line 3192
    .line 3193
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3194
    .line 3195
    .line 3196
    move-result-object v4

    .line 3197
    invoke-interface {v4, v11}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3198
    .line 3199
    .line 3200
    move-result-object v4

    .line 3201
    check-cast v4, Ljava/lang/Number;

    .line 3202
    .line 3203
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3204
    .line 3205
    .line 3206
    move-result v4

    .line 3207
    invoke-static/range {v26 .. v26}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3208
    .line 3209
    .line 3210
    move-result v5

    .line 3211
    invoke-virtual {v3, v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 3212
    .line 3213
    .line 3214
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 3215
    .line 3216
    .line 3217
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 3218
    .line 3219
    const/4 v4, -0x2

    .line 3220
    const/4 v5, -0x1

    .line 3221
    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3222
    .line 3223
    .line 3224
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3225
    .line 3226
    .line 3227
    move-result-object v4

    .line 3228
    move-object/from16 v14, v29

    .line 3229
    .line 3230
    invoke-interface {v4, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3231
    .line 3232
    .line 3233
    move-result-object v4

    .line 3234
    check-cast v4, Ljava/lang/Number;

    .line 3235
    .line 3236
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3237
    .line 3238
    .line 3239
    move-result v4

    .line 3240
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 3241
    .line 3242
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3243
    .line 3244
    .line 3245
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3246
    .line 3247
    .line 3248
    move-result-object v3

    .line 3249
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 3250
    .line 3251
    .line 3252
    move-result v4

    .line 3253
    if-eqz v4, :cond_9

    .line 3254
    .line 3255
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3256
    .line 3257
    .line 3258
    move-result-object v4

    .line 3259
    add-int/lit8 v5, v15, 0x1

    .line 3260
    .line 3261
    if-ltz v15, :cond_8

    .line 3262
    .line 3263
    check-cast v4, Ljava/lang/String;

    .line 3264
    .line 3265
    new-instance v6, Landroid/widget/TextView;

    .line 3266
    .line 3267
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3268
    .line 3269
    .line 3270
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3271
    .line 3272
    .line 3273
    const/high16 v4, 0x41500000    # 13.0f

    .line 3274
    .line 3275
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 3276
    .line 3277
    .line 3278
    iget-object v4, v13, Lnw0;->ε:Ljava/lang/String;

    .line 3279
    .line 3280
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3281
    .line 3282
    .line 3283
    move-result v4

    .line 3284
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3285
    .line 3286
    .line 3287
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3288
    .line 3289
    .line 3290
    move-result-object v4

    .line 3291
    move-object/from16 v8, v28

    .line 3292
    .line 3293
    invoke-interface {v4, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3294
    .line 3295
    .line 3296
    move-result-object v4

    .line 3297
    check-cast v4, Ljava/lang/Number;

    .line 3298
    .line 3299
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3300
    .line 3301
    .line 3302
    move-result v4

    .line 3303
    int-to-float v4, v4

    .line 3304
    const/high16 v9, 0x3f800000    # 1.0f

    .line 3305
    .line 3306
    invoke-virtual {v6, v4, v9}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 3307
    .line 3308
    .line 3309
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 3310
    .line 3311
    const/4 v9, -0x2

    .line 3312
    const/4 v10, -0x1

    .line 3313
    invoke-direct {v4, v10, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3314
    .line 3315
    .line 3316
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 3317
    .line 3318
    .line 3319
    move-result v9

    .line 3320
    const/16 v17, 0x1

    .line 3321
    .line 3322
    add-int/lit8 v9, v9, -0x1

    .line 3323
    .line 3324
    if-ge v15, v9, :cond_7

    .line 3325
    .line 3326
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3327
    .line 3328
    .line 3329
    move-result-object v9

    .line 3330
    move-object/from16 v10, v27

    .line 3331
    .line 3332
    invoke-interface {v9, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3333
    .line 3334
    .line 3335
    move-result-object v9

    .line 3336
    check-cast v9, Ljava/lang/Number;

    .line 3337
    .line 3338
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 3339
    .line 3340
    .line 3341
    move-result v9

    .line 3342
    iput v9, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 3343
    .line 3344
    goto :goto_5

    .line 3345
    :cond_7
    move-object/from16 v10, v27

    .line 3346
    .line 3347
    :goto_5
    invoke-virtual {v6, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3348
    .line 3349
    .line 3350
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3351
    .line 3352
    .line 3353
    move v15, v5

    .line 3354
    move-object/from16 v28, v8

    .line 3355
    .line 3356
    move-object/from16 v27, v10

    .line 3357
    .line 3358
    goto :goto_4

    .line 3359
    :cond_8
    invoke-static {}, Lyh;->х()V

    .line 3360
    .line 3361
    .line 3362
    const/4 v0, 0x0

    .line 3363
    throw v0

    .line 3364
    :cond_9
    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3365
    .line 3366
    .line 3367
    const-string v1, "\u5feb\u6377\u64cd\u4f5c"

    .line 3368
    .line 3369
    invoke-virtual {v0, v1, v13}, Lcom/example/dyhelper/ui/MainActivity;->β(Ljava/lang/String;Lnw0;)Landroid/widget/TextView;

    .line 3370
    .line 3371
    .line 3372
    move-result-object v1

    .line 3373
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3374
    .line 3375
    .line 3376
    const/16 v1, 0xe

    .line 3377
    .line 3378
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3379
    .line 3380
    .line 3381
    move-result-object v1

    .line 3382
    const/16 v2, 0x12

    .line 3383
    .line 3384
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3385
    .line 3386
    .line 3387
    move-result-object v2

    .line 3388
    const/16 v3, 0x10

    .line 3389
    .line 3390
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3391
    .line 3392
    .line 3393
    move-result-object v4

    .line 3394
    const/4 v5, 0x2

    .line 3395
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3396
    .line 3397
    .line 3398
    move-result-object v6

    .line 3399
    new-instance v8, Landroid/widget/LinearLayout;

    .line 3400
    .line 3401
    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3402
    .line 3403
    .line 3404
    const/4 v9, 0x1

    .line 3405
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3406
    .line 3407
    .line 3408
    move-result-object v10

    .line 3409
    invoke-virtual {v8, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3410
    .line 3411
    .line 3412
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 3413
    .line 3414
    const/4 v12, -0x1

    .line 3415
    const/4 v14, -0x2

    .line 3416
    invoke-direct {v11, v12, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3417
    .line 3418
    .line 3419
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3420
    .line 3421
    .line 3422
    move-result-object v15

    .line 3423
    const/16 v16, 0xc

    .line 3424
    .line 3425
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3426
    .line 3427
    .line 3428
    move-result-object v9

    .line 3429
    invoke-interface {v15, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3430
    .line 3431
    .line 3432
    move-result-object v9

    .line 3433
    check-cast v9, Ljava/lang/Number;

    .line 3434
    .line 3435
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 3436
    .line 3437
    .line 3438
    move-result v9

    .line 3439
    iput v9, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 3440
    .line 3441
    invoke-virtual {v8, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3442
    .line 3443
    .line 3444
    const/4 v9, 0x0

    .line 3445
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 3446
    .line 3447
    .line 3448
    move-result-object v11

    .line 3449
    iget-object v15, v0, Lcom/example/dyhelper/ui/MainActivity;->ζ:Lh22;

    .line 3450
    .line 3451
    invoke-virtual {v15}, Lh22;->getValue()Ljava/lang/Object;

    .line 3452
    .line 3453
    .line 3454
    move-result-object v15

    .line 3455
    check-cast v15, Landroid/content/ComponentName;

    .line 3456
    .line 3457
    invoke-virtual {v11, v15}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 3458
    .line 3459
    .line 3460
    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3461
    if-eq v11, v5, :cond_b

    .line 3462
    .line 3463
    const/4 v5, 0x3

    .line 3464
    if-ne v11, v5, :cond_a

    .line 3465
    .line 3466
    goto :goto_6

    .line 3467
    :catchall_0
    :cond_a
    move v5, v9

    .line 3468
    goto :goto_7

    .line 3469
    :cond_b
    :goto_6
    const/4 v5, 0x1

    .line 3470
    :goto_7
    new-instance v11, Llw0;

    .line 3471
    .line 3472
    const/4 v15, 0x0

    .line 3473
    invoke-direct {v11, v0, v15}, Llw0;-><init>(Lcom/example/dyhelper/ui/MainActivity;I)V

    .line 3474
    .line 3475
    .line 3476
    new-instance v15, Landroid/widget/LinearLayout;

    .line 3477
    .line 3478
    invoke-direct {v15, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3479
    .line 3480
    .line 3481
    invoke-virtual {v15, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3482
    .line 3483
    .line 3484
    invoke-virtual {v15, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 3485
    .line 3486
    .line 3487
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3488
    .line 3489
    .line 3490
    move-result-object v3

    .line 3491
    invoke-interface {v3, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3492
    .line 3493
    .line 3494
    move-result-object v3

    .line 3495
    check-cast v3, Ljava/lang/Number;

    .line 3496
    .line 3497
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3498
    .line 3499
    .line 3500
    move-result v3

    .line 3501
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3502
    .line 3503
    .line 3504
    move-result-object v9

    .line 3505
    invoke-interface {v9, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3506
    .line 3507
    .line 3508
    move-result-object v9

    .line 3509
    check-cast v9, Ljava/lang/Number;

    .line 3510
    .line 3511
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 3512
    .line 3513
    .line 3514
    move-result v9

    .line 3515
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3516
    .line 3517
    .line 3518
    move-result-object v12

    .line 3519
    invoke-interface {v12, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3520
    .line 3521
    .line 3522
    move-result-object v12

    .line 3523
    check-cast v12, Ljava/lang/Number;

    .line 3524
    .line 3525
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 3526
    .line 3527
    .line 3528
    move-result v12

    .line 3529
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3530
    .line 3531
    .line 3532
    move-result-object v14

    .line 3533
    invoke-interface {v14, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3534
    .line 3535
    .line 3536
    move-result-object v14

    .line 3537
    check-cast v14, Ljava/lang/Number;

    .line 3538
    .line 3539
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 3540
    .line 3541
    .line 3542
    move-result v14

    .line 3543
    invoke-virtual {v15, v3, v9, v12, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 3544
    .line 3545
    .line 3546
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 3547
    .line 3548
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 3549
    .line 3550
    .line 3551
    iget-object v9, v13, Lnw0;->β:Ljava/lang/String;

    .line 3552
    .line 3553
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3554
    .line 3555
    .line 3556
    move-result v12

    .line 3557
    invoke-virtual {v3, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 3558
    .line 3559
    .line 3560
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3561
    .line 3562
    .line 3563
    move-result-object v12

    .line 3564
    invoke-interface {v12, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3565
    .line 3566
    .line 3567
    move-result-object v12

    .line 3568
    check-cast v12, Ljava/lang/Number;

    .line 3569
    .line 3570
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 3571
    .line 3572
    .line 3573
    move-result v12

    .line 3574
    int-to-float v12, v12

    .line 3575
    invoke-virtual {v3, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 3576
    .line 3577
    .line 3578
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3579
    .line 3580
    .line 3581
    move-result-object v12

    .line 3582
    invoke-interface {v12, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3583
    .line 3584
    .line 3585
    move-result-object v12

    .line 3586
    check-cast v12, Ljava/lang/Number;

    .line 3587
    .line 3588
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 3589
    .line 3590
    .line 3591
    move-result v12

    .line 3592
    iget-object v14, v13, Lnw0;->ι:Ljava/lang/String;

    .line 3593
    .line 3594
    move-object/from16 v22, v9

    .line 3595
    .line 3596
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3597
    .line 3598
    .line 3599
    move-result v9

    .line 3600
    invoke-virtual {v3, v12, v9}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 3601
    .line 3602
    .line 3603
    invoke-virtual {v15, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 3604
    .line 3605
    .line 3606
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 3607
    .line 3608
    const/4 v9, -0x1

    .line 3609
    const/4 v12, -0x2

    .line 3610
    invoke-direct {v3, v9, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3611
    .line 3612
    .line 3613
    invoke-virtual {v15, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3614
    .line 3615
    .line 3616
    new-instance v3, Landroid/widget/LinearLayout;

    .line 3617
    .line 3618
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3619
    .line 3620
    .line 3621
    const/4 v9, 0x1

    .line 3622
    invoke-virtual {v3, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3623
    .line 3624
    .line 3625
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 3626
    .line 3627
    move-object/from16 v23, v14

    .line 3628
    .line 3629
    const/high16 v14, 0x3f800000    # 1.0f

    .line 3630
    .line 3631
    move-object/from16 v24, v7

    .line 3632
    .line 3633
    const/4 v7, 0x0

    .line 3634
    invoke-direct {v9, v7, v12, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 3635
    .line 3636
    .line 3637
    invoke-virtual {v3, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3638
    .line 3639
    .line 3640
    new-instance v7, Landroid/widget/TextView;

    .line 3641
    .line 3642
    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3643
    .line 3644
    .line 3645
    const-string v9, "\u9690\u85cf\u684c\u9762\u56fe\u6807"

    .line 3646
    .line 3647
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3648
    .line 3649
    .line 3650
    const/high16 v9, 0x41700000    # 15.0f

    .line 3651
    .line 3652
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 3653
    .line 3654
    .line 3655
    iget-object v12, v13, Lnw0;->δ:Ljava/lang/String;

    .line 3656
    .line 3657
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3658
    .line 3659
    .line 3660
    move-result v9

    .line 3661
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3662
    .line 3663
    .line 3664
    const/4 v9, 0x0

    .line 3665
    const/4 v14, 0x1

    .line 3666
    invoke-virtual {v7, v9, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 3667
    .line 3668
    .line 3669
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3670
    .line 3671
    .line 3672
    new-instance v7, Landroid/widget/TextView;

    .line 3673
    .line 3674
    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3675
    .line 3676
    .line 3677
    const-string v14, "\u9690\u85cf\u540e\u9700\u4ece LSPosed \u7ba1\u7406\u5668\u6216\u7cfb\u7edf\u5e94\u7528\u8be6\u60c5\u4e2d\u6253\u5f00\u672c\u5e94\u7528"

    .line 3678
    .line 3679
    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3680
    .line 3681
    .line 3682
    const/high16 v14, 0x41400000    # 12.0f

    .line 3683
    .line 3684
    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 3685
    .line 3686
    .line 3687
    iget-object v14, v13, Lnw0;->ζ:Ljava/lang/String;

    .line 3688
    .line 3689
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3690
    .line 3691
    .line 3692
    move-result v9

    .line 3693
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3694
    .line 3695
    .line 3696
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3697
    .line 3698
    .line 3699
    move-result-object v9

    .line 3700
    invoke-interface {v9, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3701
    .line 3702
    .line 3703
    move-result-object v9

    .line 3704
    check-cast v9, Ljava/lang/Number;

    .line 3705
    .line 3706
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 3707
    .line 3708
    .line 3709
    move-result v9

    .line 3710
    move-object/from16 v29, v12

    .line 3711
    .line 3712
    const/4 v12, 0x0

    .line 3713
    invoke-virtual {v7, v12, v9, v12, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 3714
    .line 3715
    .line 3716
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3717
    .line 3718
    .line 3719
    invoke-virtual {v15, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3720
    .line 3721
    .line 3722
    new-instance v3, Landroid/widget/Switch;

    .line 3723
    .line 3724
    invoke-direct {v3, v0}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    .line 3725
    .line 3726
    .line 3727
    invoke-virtual {v3, v5}, Landroid/widget/Switch;->setChecked(Z)V

    .line 3728
    .line 3729
    .line 3730
    new-instance v5, Lyg;

    .line 3731
    .line 3732
    const/4 v7, 0x1

    .line 3733
    invoke-direct {v5, v11, v7}, Lyg;-><init>(La80;I)V

    .line 3734
    .line 3735
    .line 3736
    invoke-virtual {v3, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 3737
    .line 3738
    .line 3739
    invoke-virtual {v15, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3740
    .line 3741
    .line 3742
    invoke-virtual {v8, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3743
    .line 3744
    .line 3745
    new-instance v3, Landroid/view/View;

    .line 3746
    .line 3747
    invoke-direct {v3, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 3748
    .line 3749
    .line 3750
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 3751
    .line 3752
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3753
    .line 3754
    .line 3755
    move-result-object v7

    .line 3756
    const/16 v9, 0xa

    .line 3757
    .line 3758
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3759
    .line 3760
    .line 3761
    move-result-object v9

    .line 3762
    invoke-interface {v7, v9}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3763
    .line 3764
    .line 3765
    move-result-object v7

    .line 3766
    check-cast v7, Ljava/lang/Number;

    .line 3767
    .line 3768
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 3769
    .line 3770
    .line 3771
    move-result v7

    .line 3772
    const/4 v9, -0x1

    .line 3773
    invoke-direct {v5, v9, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3774
    .line 3775
    .line 3776
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3777
    .line 3778
    .line 3779
    invoke-virtual {v8, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3780
    .line 3781
    .line 3782
    new-instance v3, Lmw0;

    .line 3783
    .line 3784
    const/4 v5, 0x0

    .line 3785
    invoke-direct {v3, v0, v5}, Lmw0;-><init>(Lcom/example/dyhelper/ui/MainActivity;I)V

    .line 3786
    .line 3787
    .line 3788
    new-instance v5, Landroid/widget/LinearLayout;

    .line 3789
    .line 3790
    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3791
    .line 3792
    .line 3793
    const/4 v7, 0x0

    .line 3794
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3795
    .line 3796
    .line 3797
    const/16 v7, 0x10

    .line 3798
    .line 3799
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 3800
    .line 3801
    .line 3802
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3803
    .line 3804
    .line 3805
    move-result-object v7

    .line 3806
    invoke-interface {v7, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3807
    .line 3808
    .line 3809
    move-result-object v7

    .line 3810
    check-cast v7, Ljava/lang/Number;

    .line 3811
    .line 3812
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 3813
    .line 3814
    .line 3815
    move-result v7

    .line 3816
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3817
    .line 3818
    .line 3819
    move-result-object v9

    .line 3820
    invoke-interface {v9, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3821
    .line 3822
    .line 3823
    move-result-object v9

    .line 3824
    check-cast v9, Ljava/lang/Number;

    .line 3825
    .line 3826
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 3827
    .line 3828
    .line 3829
    move-result v9

    .line 3830
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3831
    .line 3832
    .line 3833
    move-result-object v11

    .line 3834
    invoke-interface {v11, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3835
    .line 3836
    .line 3837
    move-result-object v2

    .line 3838
    check-cast v2, Ljava/lang/Number;

    .line 3839
    .line 3840
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 3841
    .line 3842
    .line 3843
    move-result v2

    .line 3844
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3845
    .line 3846
    .line 3847
    move-result-object v11

    .line 3848
    invoke-interface {v11, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3849
    .line 3850
    .line 3851
    move-result-object v4

    .line 3852
    check-cast v4, Ljava/lang/Number;

    .line 3853
    .line 3854
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3855
    .line 3856
    .line 3857
    move-result v4

    .line 3858
    invoke-virtual {v5, v7, v9, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 3859
    .line 3860
    .line 3861
    const/4 v9, 0x1

    .line 3862
    invoke-virtual {v5, v9}, Landroid/view/View;->setClickable(Z)V

    .line 3863
    .line 3864
    .line 3865
    invoke-virtual {v5, v9}, Landroid/view/View;->setFocusable(Z)V

    .line 3866
    .line 3867
    .line 3868
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 3869
    .line 3870
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 3871
    .line 3872
    .line 3873
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3874
    .line 3875
    .line 3876
    move-result v4

    .line 3877
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 3878
    .line 3879
    .line 3880
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3881
    .line 3882
    .line 3883
    move-result-object v4

    .line 3884
    invoke-interface {v4, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3885
    .line 3886
    .line 3887
    move-result-object v1

    .line 3888
    check-cast v1, Ljava/lang/Number;

    .line 3889
    .line 3890
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 3891
    .line 3892
    .line 3893
    move-result v1

    .line 3894
    int-to-float v1, v1

    .line 3895
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 3896
    .line 3897
    .line 3898
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 3899
    .line 3900
    .line 3901
    move-result-object v1

    .line 3902
    invoke-interface {v1, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3903
    .line 3904
    .line 3905
    move-result-object v1

    .line 3906
    check-cast v1, Ljava/lang/Number;

    .line 3907
    .line 3908
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 3909
    .line 3910
    .line 3911
    move-result v1

    .line 3912
    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3913
    .line 3914
    .line 3915
    move-result v4

    .line 3916
    invoke-virtual {v2, v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 3917
    .line 3918
    .line 3919
    new-instance v1, Landroid/graphics/drawable/RippleDrawable;

    .line 3920
    .line 3921
    iget-object v4, v13, Lnw0;->θ:Ljava/lang/String;

    .line 3922
    .line 3923
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3924
    .line 3925
    .line 3926
    move-result v4

    .line 3927
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 3928
    .line 3929
    .line 3930
    move-result-object v4

    .line 3931
    const/4 v7, 0x0

    .line 3932
    invoke-direct {v1, v4, v2, v7}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 3933
    .line 3934
    .line 3935
    invoke-virtual {v5, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 3936
    .line 3937
    .line 3938
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 3939
    .line 3940
    const/4 v9, -0x1

    .line 3941
    const/4 v12, -0x2

    .line 3942
    invoke-direct {v1, v9, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3943
    .line 3944
    .line 3945
    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3946
    .line 3947
    .line 3948
    new-instance v1, Lhi;

    .line 3949
    .line 3950
    const/4 v2, 0x5

    .line 3951
    invoke-direct {v1, v2, v3}, Lhi;-><init>(ILjava/lang/Object;)V

    .line 3952
    .line 3953
    .line 3954
    invoke-virtual {v5, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3955
    .line 3956
    .line 3957
    new-instance v1, Landroid/widget/LinearLayout;

    .line 3958
    .line 3959
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3960
    .line 3961
    .line 3962
    const/4 v9, 0x1

    .line 3963
    invoke-virtual {v1, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3964
    .line 3965
    .line 3966
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 3967
    .line 3968
    const/high16 v3, 0x3f800000    # 1.0f

    .line 3969
    .line 3970
    const/4 v7, 0x0

    .line 3971
    invoke-direct {v2, v7, v12, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 3972
    .line 3973
    .line 3974
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3975
    .line 3976
    .line 3977
    new-instance v2, Landroid/widget/TextView;

    .line 3978
    .line 3979
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3980
    .line 3981
    .line 3982
    const-string v3, "\u5173\u4e8e"

    .line 3983
    .line 3984
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3985
    .line 3986
    .line 3987
    const/high16 v3, 0x41700000    # 15.0f

    .line 3988
    .line 3989
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 3990
    .line 3991
    .line 3992
    invoke-static/range {v29 .. v29}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 3993
    .line 3994
    .line 3995
    move-result v3

    .line 3996
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3997
    .line 3998
    .line 3999
    const/4 v7, 0x0

    .line 4000
    invoke-virtual {v2, v7, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 4001
    .line 4002
    .line 4003
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4004
    .line 4005
    .line 4006
    new-instance v2, Landroid/widget/TextView;

    .line 4007
    .line 4008
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4009
    .line 4010
    .line 4011
    const-string v3, "\u7248\u672c\u4fe1\u606f\u4e0e\u5f00\u53d1\u8005\u8054\u7cfb\u65b9\u5f0f"

    .line 4012
    .line 4013
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4014
    .line 4015
    .line 4016
    const/high16 v3, 0x41400000    # 12.0f

    .line 4017
    .line 4018
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 4019
    .line 4020
    .line 4021
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4022
    .line 4023
    .line 4024
    move-result v3

    .line 4025
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4026
    .line 4027
    .line 4028
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 4029
    .line 4030
    .line 4031
    move-result-object v3

    .line 4032
    invoke-interface {v3, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4033
    .line 4034
    .line 4035
    move-result-object v3

    .line 4036
    check-cast v3, Ljava/lang/Number;

    .line 4037
    .line 4038
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 4039
    .line 4040
    .line 4041
    move-result v3

    .line 4042
    const/4 v7, 0x0

    .line 4043
    invoke-virtual {v2, v7, v3, v7, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 4044
    .line 4045
    .line 4046
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4047
    .line 4048
    .line 4049
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4050
    .line 4051
    .line 4052
    new-instance v1, Landroid/widget/TextView;

    .line 4053
    .line 4054
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4055
    .line 4056
    .line 4057
    const-string v2, "\u203a"

    .line 4058
    .line 4059
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4060
    .line 4061
    .line 4062
    const/high16 v2, 0x41a00000    # 20.0f

    .line 4063
    .line 4064
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 4065
    .line 4066
    .line 4067
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4068
    .line 4069
    .line 4070
    move-result v2

    .line 4071
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4072
    .line 4073
    .line 4074
    const/16 v2, 0x11

    .line 4075
    .line 4076
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 4077
    .line 4078
    .line 4079
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4080
    .line 4081
    .line 4082
    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4083
    .line 4084
    .line 4085
    move-object/from16 v1, v24

    .line 4086
    .line 4087
    invoke-virtual {v1, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4088
    .line 4089
    .line 4090
    move-object/from16 v2, v20

    .line 4091
    .line 4092
    invoke-virtual {v2, v1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 4093
    .line 4094
    .line 4095
    move-object/from16 v1, v19

    .line 4096
    .line 4097
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4098
    .line 4099
    .line 4100
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 4101
    .line 4102
    .line 4103
    return-void
.end method

.method public final α(Ljava/util/List;Lnw0;)Landroid/widget/LinearLayout;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/16 v3, 0x18

    .line 11
    .line 12
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const/16 v4, 0xc

    .line 17
    .line 18
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    new-instance v5, Landroid/widget/LinearLayout;

    .line 23
    .line 24
    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 33
    .line 34
    .line 35
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 36
    .line 37
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 38
    .line 39
    .line 40
    iget-object v9, v1, Lnw0;->β:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v10, v1, Lnw0;->δ:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v11, v1, Lnw0;->θ:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v12, v1, Lnw0;->ζ:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    const/16 v13, 0x10

    .line 60
    .line 61
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v14

    .line 65
    invoke-interface {v9, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    check-cast v9, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    int-to-float v9, v9

    .line 76
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-interface {v9, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    check-cast v9, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    iget-object v1, v1, Lnw0;->ι:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {v8, v9, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 106
    .line 107
    const/4 v8, -0x1

    .line 108
    const/4 v9, -0x2

    .line 109
    invoke-direct {v1, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 113
    .line 114
    .line 115
    move-result-object v15

    .line 116
    const/16 v16, 0x14

    .line 117
    .line 118
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-interface {v15, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    check-cast v8, Ljava/lang/Number;

    .line 127
    .line 128
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    iput v8, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 133
    .line 134
    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 135
    .line 136
    .line 137
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const/4 v15, 0x0

    .line 142
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    if-eqz v16, :cond_b

    .line 147
    .line 148
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v16

    .line 152
    add-int/lit8 v17, v15, 0x1

    .line 153
    .line 154
    if-ltz v15, :cond_a

    .line 155
    .line 156
    move-object/from16 v9, v16

    .line 157
    .line 158
    check-cast v9, Low0;

    .line 159
    .line 160
    iget-object v13, v9, Low0;->ζ:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-ne v8, v6, :cond_0

    .line 167
    .line 168
    move v8, v6

    .line 169
    goto :goto_1

    .line 170
    :cond_0
    const/4 v8, 0x0

    .line 171
    :goto_1
    new-instance v6, Lqm1;

    .line 172
    .line 173
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 174
    .line 175
    .line 176
    move-object/from16 v21, v1

    .line 177
    .line 178
    iget-boolean v1, v9, Low0;->η:Z

    .line 179
    .line 180
    if-nez v1, :cond_2

    .line 181
    .line 182
    if-eqz v8, :cond_1

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_1
    const/4 v1, 0x0

    .line 186
    goto :goto_3

    .line 187
    :cond_2
    :goto_2
    const/4 v1, 0x1

    .line 188
    :goto_3
    iput-boolean v1, v6, Lqm1;->ε:Z

    .line 189
    .line 190
    new-instance v1, Landroid/widget/LinearLayout;

    .line 191
    .line 192
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 193
    .line 194
    .line 195
    move/from16 v22, v8

    .line 196
    .line 197
    const/4 v8, 0x1

    .line 198
    invoke-virtual {v1, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    const/16 v23, 0x8

    .line 206
    .line 207
    move-object/from16 v24, v10

    .line 208
    .line 209
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    invoke-interface {v8, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    check-cast v8, Ljava/lang/Number;

    .line 218
    .line 219
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    const/4 v10, 0x0

    .line 224
    invoke-virtual {v1, v10, v10, v10, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    const/4 v10, 0x0

    .line 232
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v25

    .line 236
    move-object/from16 v26, v8

    .line 237
    .line 238
    if-eqz v25, :cond_5

    .line 239
    .line 240
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v25

    .line 244
    add-int/lit8 v27, v10, 0x1

    .line 245
    .line 246
    if-ltz v10, :cond_4

    .line 247
    .line 248
    move-object/from16 v8, v25

    .line 249
    .line 250
    check-cast v8, Lpw0;

    .line 251
    .line 252
    move-object/from16 v25, v11

    .line 253
    .line 254
    new-instance v11, Landroid/widget/LinearLayout;

    .line 255
    .line 256
    invoke-direct {v11, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 257
    .line 258
    .line 259
    move-object/from16 v28, v12

    .line 260
    .line 261
    const/4 v12, 0x0

    .line 262
    invoke-virtual {v11, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 263
    .line 264
    .line 265
    const/16 v12, 0x10

    .line 266
    .line 267
    invoke-virtual {v11, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 271
    .line 272
    .line 273
    move-result-object v12

    .line 274
    invoke-interface {v12, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v12

    .line 278
    check-cast v12, Ljava/lang/Number;

    .line 279
    .line 280
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result v12

    .line 284
    move-object/from16 v29, v13

    .line 285
    .line 286
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    const/16 v30, 0x9

    .line 291
    .line 292
    move/from16 v31, v15

    .line 293
    .line 294
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v15

    .line 298
    invoke-interface {v13, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v13

    .line 302
    check-cast v13, Ljava/lang/Number;

    .line 303
    .line 304
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result v13

    .line 308
    move-object/from16 v30, v5

    .line 309
    .line 310
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-interface {v5, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    check-cast v5, Ljava/lang/Number;

    .line 319
    .line 320
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    move-object/from16 v32, v6

    .line 325
    .line 326
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    invoke-interface {v6, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    check-cast v6, Ljava/lang/Number;

    .line 335
    .line 336
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    invoke-virtual {v11, v12, v13, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 341
    .line 342
    .line 343
    new-instance v5, Landroid/widget/TextView;

    .line 344
    .line 345
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 346
    .line 347
    .line 348
    iget-object v6, v8, Lpw0;->α:Ljava/lang/String;

    .line 349
    .line 350
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    .line 352
    .line 353
    const/high16 v6, 0x41080000    # 8.5f

    .line 354
    .line 355
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 356
    .line 357
    .line 358
    iget-object v6, v8, Lpw0;->β:Ljava/lang/String;

    .line 359
    .line 360
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 365
    .line 366
    .line 367
    const/4 v6, 0x0

    .line 368
    const/4 v12, 0x1

    .line 369
    invoke-virtual {v5, v6, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 370
    .line 371
    .line 372
    const/16 v6, 0x11

    .line 373
    .line 374
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 375
    .line 376
    .line 377
    const/4 v12, 0x0

    .line 378
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 379
    .line 380
    .line 381
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 382
    .line 383
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 384
    .line 385
    .line 386
    iget-object v12, v8, Lpw0;->γ:Ljava/lang/String;

    .line 387
    .line 388
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 389
    .line 390
    .line 391
    move-result v12

    .line 392
    invoke-virtual {v6, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 396
    .line 397
    .line 398
    move-result-object v12

    .line 399
    const/4 v13, 0x6

    .line 400
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 401
    .line 402
    .line 403
    move-result-object v13

    .line 404
    invoke-interface {v12, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    check-cast v12, Ljava/lang/Number;

    .line 409
    .line 410
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result v12

    .line 414
    int-to-float v12, v12

    .line 415
    invoke-virtual {v6, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 419
    .line 420
    .line 421
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 422
    .line 423
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 424
    .line 425
    .line 426
    move-result-object v12

    .line 427
    const/16 v13, 0x22

    .line 428
    .line 429
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 430
    .line 431
    .line 432
    move-result-object v13

    .line 433
    invoke-interface {v12, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v12

    .line 437
    check-cast v12, Ljava/lang/Number;

    .line 438
    .line 439
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 440
    .line 441
    .line 442
    move-result v12

    .line 443
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 444
    .line 445
    .line 446
    move-result-object v13

    .line 447
    invoke-interface {v13, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v13

    .line 451
    check-cast v13, Ljava/lang/Number;

    .line 452
    .line 453
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 454
    .line 455
    .line 456
    move-result v13

    .line 457
    invoke-direct {v6, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 461
    .line 462
    .line 463
    move-result-object v12

    .line 464
    invoke-interface {v12, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v12

    .line 468
    check-cast v12, Ljava/lang/Number;

    .line 469
    .line 470
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 471
    .line 472
    .line 473
    move-result v12

    .line 474
    iput v12, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 475
    .line 476
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 480
    .line 481
    .line 482
    new-instance v5, Landroid/widget/LinearLayout;

    .line 483
    .line 484
    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 485
    .line 486
    .line 487
    const/4 v12, 0x1

    .line 488
    invoke-virtual {v5, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 489
    .line 490
    .line 491
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 492
    .line 493
    const/high16 v12, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v13, -0x2

    .line 496
    const/4 v15, 0x0

    .line 497
    invoke-direct {v6, v15, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 501
    .line 502
    .line 503
    new-instance v6, Landroid/widget/TextView;

    .line 504
    .line 505
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 506
    .line 507
    .line 508
    iget-object v12, v8, Lpw0;->δ:Ljava/lang/String;

    .line 509
    .line 510
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 511
    .line 512
    .line 513
    const/high16 v12, 0x41500000    # 13.0f

    .line 514
    .line 515
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 516
    .line 517
    .line 518
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 519
    .line 520
    .line 521
    move-result v12

    .line 522
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 523
    .line 524
    .line 525
    const/4 v12, 0x0

    .line 526
    const/4 v13, 0x1

    .line 527
    invoke-virtual {v6, v12, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 531
    .line 532
    .line 533
    new-instance v6, Landroid/widget/TextView;

    .line 534
    .line 535
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 536
    .line 537
    .line 538
    iget-object v8, v8, Lpw0;->ε:Ljava/lang/String;

    .line 539
    .line 540
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 541
    .line 542
    .line 543
    const/high16 v8, 0x41380000    # 11.5f

    .line 544
    .line 545
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 546
    .line 547
    .line 548
    invoke-static/range {v28 .. v28}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 549
    .line 550
    .line 551
    move-result v8

    .line 552
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 556
    .line 557
    .line 558
    move-result-object v8

    .line 559
    invoke-interface {v8, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v8

    .line 563
    check-cast v8, Ljava/lang/Number;

    .line 564
    .line 565
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v8

    .line 569
    const/4 v12, 0x0

    .line 570
    invoke-virtual {v6, v12, v8, v12, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 574
    .line 575
    .line 576
    move-result-object v8

    .line 577
    invoke-interface {v8, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v8

    .line 581
    check-cast v8, Ljava/lang/Number;

    .line 582
    .line 583
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 584
    .line 585
    .line 586
    move-result v8

    .line 587
    int-to-float v8, v8

    .line 588
    const/high16 v12, 0x3f800000    # 1.0f

    .line 589
    .line 590
    invoke-virtual {v6, v8, v12}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 600
    .line 601
    .line 602
    invoke-interface/range {v29 .. v29}, Ljava/util/List;->size()I

    .line 603
    .line 604
    .line 605
    move-result v5

    .line 606
    const/16 v20, 0x1

    .line 607
    .line 608
    add-int/lit8 v5, v5, -0x1

    .line 609
    .line 610
    if-ge v10, v5, :cond_3

    .line 611
    .line 612
    new-instance v5, Landroid/view/View;

    .line 613
    .line 614
    invoke-direct {v5, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 615
    .line 616
    .line 617
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 618
    .line 619
    .line 620
    move-result v6

    .line 621
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 622
    .line 623
    .line 624
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 625
    .line 626
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 627
    .line 628
    .line 629
    move-result-object v8

    .line 630
    invoke-interface {v8, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v8

    .line 634
    check-cast v8, Ljava/lang/Number;

    .line 635
    .line 636
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 637
    .line 638
    .line 639
    move-result v8

    .line 640
    const/4 v10, -0x1

    .line 641
    invoke-direct {v6, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 645
    .line 646
    .line 647
    move-result-object v8

    .line 648
    const/16 v10, 0x3e

    .line 649
    .line 650
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v10

    .line 654
    invoke-interface {v8, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    check-cast v8, Ljava/lang/Number;

    .line 659
    .line 660
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 661
    .line 662
    .line 663
    move-result v8

    .line 664
    iput v8, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 665
    .line 666
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 667
    .line 668
    .line 669
    move-result-object v8

    .line 670
    invoke-interface {v8, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v8

    .line 674
    check-cast v8, Ljava/lang/Number;

    .line 675
    .line 676
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 677
    .line 678
    .line 679
    move-result v8

    .line 680
    iput v8, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 681
    .line 682
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 686
    .line 687
    .line 688
    :cond_3
    move-object/from16 v11, v25

    .line 689
    .line 690
    move-object/from16 v8, v26

    .line 691
    .line 692
    move/from16 v10, v27

    .line 693
    .line 694
    move-object/from16 v12, v28

    .line 695
    .line 696
    move-object/from16 v13, v29

    .line 697
    .line 698
    move-object/from16 v5, v30

    .line 699
    .line 700
    move/from16 v15, v31

    .line 701
    .line 702
    move-object/from16 v6, v32

    .line 703
    .line 704
    goto/16 :goto_4

    .line 705
    .line 706
    :cond_4
    invoke-static {}, Lyh;->х()V

    .line 707
    .line 708
    .line 709
    const/4 v6, 0x0

    .line 710
    throw v6

    .line 711
    :cond_5
    move-object/from16 v30, v5

    .line 712
    .line 713
    move-object/from16 v32, v6

    .line 714
    .line 715
    move-object/from16 v25, v11

    .line 716
    .line 717
    move-object/from16 v28, v12

    .line 718
    .line 719
    move-object/from16 v29, v13

    .line 720
    .line 721
    move/from16 v31, v15

    .line 722
    .line 723
    const/4 v6, 0x0

    .line 724
    if-nez v22, :cond_8

    .line 725
    .line 726
    new-instance v5, Landroid/widget/TextView;

    .line 727
    .line 728
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 729
    .line 730
    .line 731
    const/high16 v8, 0x41a00000    # 20.0f

    .line 732
    .line 733
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 734
    .line 735
    .line 736
    const/4 v12, 0x1

    .line 737
    invoke-virtual {v5, v6, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 738
    .line 739
    .line 740
    invoke-static/range {v28 .. v28}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 741
    .line 742
    .line 743
    move-result v6

    .line 744
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 745
    .line 746
    .line 747
    const/16 v6, 0x11

    .line 748
    .line 749
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 750
    .line 751
    .line 752
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 753
    .line 754
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 755
    .line 756
    .line 757
    move-result-object v8

    .line 758
    invoke-interface {v8, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v8

    .line 762
    check-cast v8, Ljava/lang/Number;

    .line 763
    .line 764
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 765
    .line 766
    .line 767
    move-result v8

    .line 768
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 769
    .line 770
    .line 771
    move-result-object v10

    .line 772
    invoke-interface {v10, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v10

    .line 776
    check-cast v10, Ljava/lang/Number;

    .line 777
    .line 778
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 779
    .line 780
    .line 781
    move-result v10

    .line 782
    invoke-direct {v6, v8, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 786
    .line 787
    .line 788
    new-instance v6, Landroid/widget/LinearLayout;

    .line 789
    .line 790
    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 791
    .line 792
    .line 793
    const/4 v12, 0x0

    .line 794
    invoke-virtual {v6, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 795
    .line 796
    .line 797
    const/16 v12, 0x10

    .line 798
    .line 799
    invoke-virtual {v6, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 803
    .line 804
    .line 805
    move-result-object v8

    .line 806
    invoke-interface {v8, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v8

    .line 810
    check-cast v8, Ljava/lang/Number;

    .line 811
    .line 812
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 813
    .line 814
    .line 815
    move-result v8

    .line 816
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 817
    .line 818
    .line 819
    move-result-object v10

    .line 820
    invoke-interface {v10, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v10

    .line 824
    check-cast v10, Ljava/lang/Number;

    .line 825
    .line 826
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 827
    .line 828
    .line 829
    move-result v10

    .line 830
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 831
    .line 832
    .line 833
    move-result-object v11

    .line 834
    const/16 v13, 0xe

    .line 835
    .line 836
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 837
    .line 838
    .line 839
    move-result-object v13

    .line 840
    invoke-interface {v11, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v11

    .line 844
    check-cast v11, Ljava/lang/Number;

    .line 845
    .line 846
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 847
    .line 848
    .line 849
    move-result v11

    .line 850
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 851
    .line 852
    .line 853
    move-result-object v13

    .line 854
    invoke-interface {v13, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v13

    .line 858
    check-cast v13, Ljava/lang/Number;

    .line 859
    .line 860
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 861
    .line 862
    .line 863
    move-result v13

    .line 864
    invoke-virtual {v6, v8, v10, v11, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 865
    .line 866
    .line 867
    const/4 v13, 0x1

    .line 868
    invoke-virtual {v6, v13}, Landroid/view/View;->setClickable(Z)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v6, v13}, Landroid/view/View;->setFocusable(Z)V

    .line 872
    .line 873
    .line 874
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 875
    .line 876
    .line 877
    move-result v8

    .line 878
    invoke-static {v8}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 879
    .line 880
    .line 881
    move-result-object v8

    .line 882
    const/16 v19, 0x0

    .line 883
    .line 884
    invoke-static/range {v19 .. v19}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 885
    .line 886
    .line 887
    move-result-object v10

    .line 888
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 889
    .line 890
    .line 891
    move-result-object v11

    .line 892
    invoke-interface {v11, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v11

    .line 896
    check-cast v11, Ljava/lang/Number;

    .line 897
    .line 898
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 899
    .line 900
    .line 901
    move-result v11

    .line 902
    int-to-float v11, v11

    .line 903
    invoke-virtual {v10, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 904
    .line 905
    .line 906
    new-instance v11, Landroid/graphics/drawable/RippleDrawable;

    .line 907
    .line 908
    const/4 v13, 0x0

    .line 909
    invoke-direct {v11, v8, v10, v13}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v6, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 913
    .line 914
    .line 915
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 916
    .line 917
    const/4 v10, -0x1

    .line 918
    const/4 v13, -0x2

    .line 919
    invoke-direct {v8, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 923
    .line 924
    .line 925
    new-instance v8, Landroid/widget/TextView;

    .line 926
    .line 927
    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 928
    .line 929
    .line 930
    iget-object v10, v9, Low0;->α:Ljava/lang/String;

    .line 931
    .line 932
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 933
    .line 934
    .line 935
    const/high16 v10, 0x41100000    # 9.0f

    .line 936
    .line 937
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 938
    .line 939
    .line 940
    iget-object v10, v9, Low0;->δ:Ljava/lang/String;

    .line 941
    .line 942
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 943
    .line 944
    .line 945
    move-result v10

    .line 946
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 947
    .line 948
    .line 949
    const/4 v10, 0x1

    .line 950
    const/4 v13, 0x0

    .line 951
    invoke-virtual {v8, v13, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 952
    .line 953
    .line 954
    const/16 v10, 0x11

    .line 955
    .line 956
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 957
    .line 958
    .line 959
    const/4 v15, 0x0

    .line 960
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 961
    .line 962
    .line 963
    new-instance v10, Landroid/graphics/drawable/GradientDrawable;

    .line 964
    .line 965
    invoke-direct {v10}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 966
    .line 967
    .line 968
    iget-object v11, v9, Low0;->ε:Ljava/lang/String;

    .line 969
    .line 970
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 971
    .line 972
    .line 973
    move-result v11

    .line 974
    invoke-virtual {v10, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 978
    .line 979
    .line 980
    move-result-object v11

    .line 981
    const/4 v13, 0x7

    .line 982
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 983
    .line 984
    .line 985
    move-result-object v13

    .line 986
    invoke-interface {v11, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v11

    .line 990
    check-cast v11, Ljava/lang/Number;

    .line 991
    .line 992
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 993
    .line 994
    .line 995
    move-result v11

    .line 996
    int-to-float v11, v11

    .line 997
    invoke-virtual {v10, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v8, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1001
    .line 1002
    .line 1003
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 1004
    .line 1005
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v11

    .line 1009
    const/16 v13, 0x26

    .line 1010
    .line 1011
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v13

    .line 1015
    invoke-interface {v11, v13}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v11

    .line 1019
    check-cast v11, Ljava/lang/Number;

    .line 1020
    .line 1021
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1022
    .line 1023
    .line 1024
    move-result v11

    .line 1025
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v13

    .line 1029
    const/16 v15, 0x1c

    .line 1030
    .line 1031
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v15

    .line 1035
    invoke-interface {v13, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v13

    .line 1039
    check-cast v13, Ljava/lang/Number;

    .line 1040
    .line 1041
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1042
    .line 1043
    .line 1044
    move-result v13

    .line 1045
    invoke-direct {v10, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v11

    .line 1052
    invoke-interface {v11, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v11

    .line 1056
    check-cast v11, Ljava/lang/Number;

    .line 1057
    .line 1058
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1059
    .line 1060
    .line 1061
    move-result v11

    .line 1062
    iput v11, v10, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1063
    .line 1064
    invoke-virtual {v8, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1068
    .line 1069
    .line 1070
    new-instance v8, Landroid/widget/LinearLayout;

    .line 1071
    .line 1072
    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1073
    .line 1074
    .line 1075
    const/4 v13, 0x1

    .line 1076
    invoke-virtual {v8, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1077
    .line 1078
    .line 1079
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 1080
    .line 1081
    const/high16 v11, 0x3f800000    # 1.0f

    .line 1082
    .line 1083
    const/4 v13, -0x2

    .line 1084
    const/4 v15, 0x0

    .line 1085
    invoke-direct {v10, v15, v13, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v8, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1089
    .line 1090
    .line 1091
    new-instance v10, Landroid/widget/TextView;

    .line 1092
    .line 1093
    invoke-direct {v10, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1094
    .line 1095
    .line 1096
    iget-object v11, v9, Low0;->β:Ljava/lang/String;

    .line 1097
    .line 1098
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1099
    .line 1100
    .line 1101
    const/high16 v11, 0x41600000    # 14.0f

    .line 1102
    .line 1103
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1104
    .line 1105
    .line 1106
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1107
    .line 1108
    .line 1109
    move-result v11

    .line 1110
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1111
    .line 1112
    .line 1113
    const/4 v11, 0x0

    .line 1114
    const/4 v15, 0x1

    .line 1115
    invoke-virtual {v10, v11, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1119
    .line 1120
    .line 1121
    new-instance v10, Landroid/widget/TextView;

    .line 1122
    .line 1123
    invoke-direct {v10, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1124
    .line 1125
    .line 1126
    iget-object v9, v9, Low0;->γ:Ljava/lang/String;

    .line 1127
    .line 1128
    invoke-interface/range {v29 .. v29}, Ljava/util/List;->size()I

    .line 1129
    .line 1130
    .line 1131
    move-result v11

    .line 1132
    new-instance v15, Ljava/lang/StringBuilder;

    .line 1133
    .line 1134
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1138
    .line 1139
    .line 1140
    const-string v9, " \u00b7 "

    .line 1141
    .line 1142
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    .line 1148
    const-string v9, " \u9879"

    .line 1149
    .line 1150
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v9

    .line 1157
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1158
    .line 1159
    .line 1160
    const/high16 v9, 0x41380000    # 11.5f

    .line 1161
    .line 1162
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1163
    .line 1164
    .line 1165
    invoke-static/range {v28 .. v28}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1166
    .line 1167
    .line 1168
    move-result v9

    .line 1169
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v9

    .line 1176
    invoke-interface {v9, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v9

    .line 1180
    check-cast v9, Ljava/lang/Number;

    .line 1181
    .line 1182
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1183
    .line 1184
    .line 1185
    move-result v9

    .line 1186
    const/4 v15, 0x0

    .line 1187
    invoke-virtual {v10, v15, v9, v15, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1197
    .line 1198
    .line 1199
    new-instance v8, Lc9;

    .line 1200
    .line 1201
    const/4 v9, 0x7

    .line 1202
    move-object/from16 v10, v32

    .line 1203
    .line 1204
    invoke-direct {v8, v10, v1, v5, v9}, Lc9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v6, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1208
    .line 1209
    .line 1210
    iget-boolean v8, v10, Lqm1;->ε:Z

    .line 1211
    .line 1212
    if-eqz v8, :cond_6

    .line 1213
    .line 1214
    move v8, v15

    .line 1215
    goto :goto_5

    .line 1216
    :cond_6
    move/from16 v8, v23

    .line 1217
    .line 1218
    :goto_5
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1219
    .line 1220
    .line 1221
    iget-boolean v8, v10, Lqm1;->ε:Z

    .line 1222
    .line 1223
    if-eqz v8, :cond_7

    .line 1224
    .line 1225
    const-string v8, "\u2304"

    .line 1226
    .line 1227
    goto :goto_6

    .line 1228
    :cond_7
    const-string v8, "\u203a"

    .line 1229
    .line 1230
    :goto_6
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1231
    .line 1232
    .line 1233
    move-object/from16 v5, v30

    .line 1234
    .line 1235
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1236
    .line 1237
    .line 1238
    goto :goto_7

    .line 1239
    :cond_8
    move-object/from16 v5, v30

    .line 1240
    .line 1241
    const/16 v12, 0x10

    .line 1242
    .line 1243
    const/4 v13, -0x2

    .line 1244
    const/4 v15, 0x0

    .line 1245
    :goto_7
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1246
    .line 1247
    .line 1248
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 1249
    .line 1250
    .line 1251
    move-result v1

    .line 1252
    const/16 v20, 0x1

    .line 1253
    .line 1254
    add-int/lit8 v1, v1, -0x1

    .line 1255
    .line 1256
    move/from16 v8, v31

    .line 1257
    .line 1258
    if-ge v8, v1, :cond_9

    .line 1259
    .line 1260
    new-instance v1, Landroid/view/View;

    .line 1261
    .line 1262
    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1263
    .line 1264
    .line 1265
    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1266
    .line 1267
    .line 1268
    move-result v6

    .line 1269
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1270
    .line 1271
    .line 1272
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1273
    .line 1274
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v8

    .line 1278
    invoke-interface {v8, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v8

    .line 1282
    check-cast v8, Ljava/lang/Number;

    .line 1283
    .line 1284
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 1285
    .line 1286
    .line 1287
    move-result v8

    .line 1288
    const/4 v10, -0x1

    .line 1289
    invoke-direct {v6, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v8

    .line 1296
    invoke-interface {v8, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v8

    .line 1300
    check-cast v8, Ljava/lang/Number;

    .line 1301
    .line 1302
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 1303
    .line 1304
    .line 1305
    move-result v8

    .line 1306
    iput v8, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1307
    .line 1308
    invoke-virtual {v0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v8

    .line 1312
    invoke-interface {v8, v14}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v8

    .line 1316
    check-cast v8, Ljava/lang/Number;

    .line 1317
    .line 1318
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 1319
    .line 1320
    .line 1321
    move-result v8

    .line 1322
    iput v8, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1323
    .line 1324
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1328
    .line 1329
    .line 1330
    goto :goto_8

    .line 1331
    :cond_9
    const/4 v10, -0x1

    .line 1332
    :goto_8
    move v9, v13

    .line 1333
    move/from16 v15, v17

    .line 1334
    .line 1335
    move/from16 v6, v20

    .line 1336
    .line 1337
    move-object/from16 v1, v21

    .line 1338
    .line 1339
    move-object/from16 v10, v24

    .line 1340
    .line 1341
    move-object/from16 v11, v25

    .line 1342
    .line 1343
    move v13, v12

    .line 1344
    move-object/from16 v12, v28

    .line 1345
    .line 1346
    goto/16 :goto_0

    .line 1347
    .line 1348
    :cond_a
    invoke-static {}, Lyh;->х()V

    .line 1349
    .line 1350
    .line 1351
    const/16 v18, 0x0

    .line 1352
    .line 1353
    throw v18

    .line 1354
    :cond_b
    return-object v5
.end method

.method public final β(Ljava/lang/String;Lnw0;)Landroid/widget/TextView;
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
    const/high16 p1, 0x41700000    # 15.0f

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p2, Lnw0;->δ:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    const/4 p2, 0x1

    .line 25
    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 26
    .line 27
    .line 28
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 29
    .line 30
    const/4 p2, -0x1

    .line 31
    const/4 v1, -0x2

    .line 32
    invoke-direct {p1, p2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const/4 v1, 0x4

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {p2, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    iput p2, p1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/MainActivity;->γ()La80;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const/16 p2, 0xa

    .line 61
    .line 62
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p0, p2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    iput p0, p1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method

.method public final γ()La80;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/ui/MainActivity;->ε:Lh22;

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
