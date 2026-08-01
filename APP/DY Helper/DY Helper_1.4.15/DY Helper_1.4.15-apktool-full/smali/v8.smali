.class public final synthetic Lv8;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lv8;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lv8;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lv8;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lv8;->η:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lv8;->ι:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lv8;->κ:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p6, p0, Lv8;->ε:I

    iput-object p1, p0, Lv8;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lv8;->η:Ljava/lang/Object;

    iput-object p3, p0, Lv8;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lv8;->ι:Ljava/lang/Object;

    iput-object p5, p0, Lv8;->κ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lv8;->ε:I

    .line 4
    .line 5
    const-string v2, "\u53d6\u6d88"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, Lv8;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v7, v0, Lv8;->κ:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v8, v0, Lv8;->ι:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v9, v0, Lv8;->η:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v10, v0, Lv8;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object v12, v10

    .line 24
    check-cast v12, Landroid/app/Activity;

    .line 25
    .line 26
    move-object/from16 v16, v9

    .line 27
    .line 28
    check-cast v16, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    move-object/from16 v18, v8

    .line 31
    .line 32
    check-cast v18, [Ljava/lang/Object;

    .line 33
    .line 34
    move-object/from16 v25, v7

    .line 35
    .line 36
    check-cast v25, Lna2;

    .line 37
    .line 38
    sget-object v1, Lib2;->α:Lib2;

    .line 39
    .line 40
    invoke-virtual {v12}, Landroid/app/Activity;->isFinishing()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget-object v0, v0, Lv8;->θ:Ljava/lang/Object;

    .line 45
    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v12}, Landroid/app/Activity;->isDestroyed()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    :cond_0
    move-object/from16 v9, v16

    .line 55
    .line 56
    move-object/from16 v8, v18

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_1
    sget-object v1, Lx01;->α:Lx01;

    .line 61
    .line 62
    invoke-virtual {v1, v12}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const v2, 0x7f0c003e

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v15, Landroid/app/Dialog;

    .line 74
    .line 75
    invoke-direct {v15, v12}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v15, v5}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 79
    .line 80
    .line 81
    invoke-virtual {v15, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 82
    .line 83
    .line 84
    const v2, 0x7f09020f

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    move-object/from16 v21, v2

    .line 92
    .line 93
    check-cast v21, Landroid/widget/ListView;

    .line 94
    .line 95
    const v2, 0x7f090379

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Landroid/widget/TextView;

    .line 103
    .line 104
    const v3, 0x7f090377

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Landroid/widget/TextView;

    .line 112
    .line 113
    const v6, 0x7f090378

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    check-cast v6, Landroid/widget/TextView;

    .line 121
    .line 122
    const v7, 0x7f09037e

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    check-cast v7, Landroid/widget/TextView;

    .line 130
    .line 131
    const v8, 0x7f09037b

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    check-cast v8, Landroid/widget/TextView;

    .line 139
    .line 140
    const v9, 0x7f09037a

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    check-cast v9, Landroid/widget/TextView;

    .line 148
    .line 149
    const v10, 0x7f09006e

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    move-object/from16 v22, v10

    .line 157
    .line 158
    check-cast v22, Landroid/widget/Button;

    .line 159
    .line 160
    const v10, 0x7f09006f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    move-object/from16 v23, v10

    .line 168
    .line 169
    check-cast v23, Landroid/widget/Button;

    .line 170
    .line 171
    const v10, 0x7f09024b

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v20

    .line 178
    const v10, 0x7f09037d

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    move-object/from16 v27, v10

    .line 186
    .line 187
    check-cast v27, Landroid/widget/TextView;

    .line 188
    .line 189
    const v10, 0x7f090261

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    move-object/from16 v26, v10

    .line 197
    .line 198
    check-cast v26, Landroid/widget/ProgressBar;

    .line 199
    .line 200
    const v10, 0x7f09024a

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    const v11, 0x7f09037c

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    check-cast v11, Landroid/widget/TextView;

    .line 215
    .line 216
    const v13, 0x7f090260

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    check-cast v13, Landroid/widget/ProgressBar;

    .line 224
    .line 225
    invoke-static {v12}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    iget-object v4, v14, Lxx;->η:Ljava/lang/String;

    .line 230
    .line 231
    iget-object v5, v14, Lxx;->ζ:Ljava/lang/String;

    .line 232
    .line 233
    move-object/from16 p0, v0

    .line 234
    .line 235
    iget-object v0, v14, Lxx;->γ:Ljava/lang/String;

    .line 236
    .line 237
    move-object/from16 v30, v2

    .line 238
    .line 239
    new-instance v2, Lva2;

    .line 240
    .line 241
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-direct {v2, v12, v10, v11, v13}, Lva2;-><init>(Landroid/app/Activity;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/ProgressBar;)V

    .line 251
    .line 252
    .line 253
    move-object/from16 v24, v2

    .line 254
    .line 255
    new-instance v2, Lum1;

    .line 256
    .line 257
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 258
    .line 259
    .line 260
    move-object/from16 v31, v3

    .line 261
    .line 262
    invoke-static {}, Lib2;->χ()Ljava/util/ArrayList;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    iput-object v3, v2, Lum1;->ε:Ljava/lang/Object;

    .line 267
    .line 268
    new-instance v3, Lpa2;

    .line 269
    .line 270
    move-object/from16 v32, v4

    .line 271
    .line 272
    iget-object v4, v2, Lum1;->ε:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v4, Ljava/util/List;

    .line 275
    .line 276
    new-instance v19, Lil1;

    .line 277
    .line 278
    const/16 v29, 0x3

    .line 279
    .line 280
    move-object/from16 v28, v15

    .line 281
    .line 282
    invoke-direct/range {v19 .. v29}, Lil1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/widget/TextView;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 283
    .line 284
    .line 285
    move-object/from16 v15, v19

    .line 286
    .line 287
    move-object/from16 v19, v2

    .line 288
    .line 289
    move-object/from16 v2, v21

    .line 290
    .line 291
    move-object/from16 v21, v9

    .line 292
    .line 293
    move-object/from16 v9, v23

    .line 294
    .line 295
    move-object/from16 v23, v11

    .line 296
    .line 297
    move-object/from16 v11, v24

    .line 298
    .line 299
    move-object/from16 v24, v13

    .line 300
    .line 301
    move-object v13, v15

    .line 302
    move-object/from16 v15, v20

    .line 303
    .line 304
    move-object/from16 v20, v5

    .line 305
    .line 306
    move-object/from16 v5, v22

    .line 307
    .line 308
    move-object/from16 v22, v7

    .line 309
    .line 310
    move-object v7, v15

    .line 311
    move-object/from16 v33, v27

    .line 312
    .line 313
    move-object/from16 v15, v28

    .line 314
    .line 315
    invoke-direct {v3, v12, v4, v11, v13}, Lpa2;-><init>(Landroid/app/Activity;Ljava/util/List;Lva2;Lil1;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 319
    .line 320
    .line 321
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    .line 322
    .line 323
    iget-object v13, v14, Lxx;->δ:Ljava/lang/String;

    .line 324
    .line 325
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v13

    .line 329
    invoke-direct {v4, v13}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v4}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 333
    .line 334
    .line 335
    const/4 v4, 0x1

    .line 336
    invoke-virtual {v2, v4}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 337
    .line 338
    .line 339
    const/4 v4, 0x0

    .line 340
    invoke-virtual {v2, v4}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 341
    .line 342
    .line 343
    iget-object v4, v14, Lxx;->Α:Ljava/lang/String;

    .line 344
    .line 345
    invoke-static {v4}, Ljx0;->Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-virtual {v2, v4}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 350
    .line 351
    .line 352
    const/16 v4, 0xc

    .line 353
    .line 354
    invoke-static {v4, v12, v0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 359
    .line 360
    .line 361
    new-instance v2, Ll9;

    .line 362
    .line 363
    const/16 v4, 0xf

    .line 364
    .line 365
    invoke-direct {v2, v11, v4, v15}, Ll9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v6, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 369
    .line 370
    .line 371
    new-instance v13, Lg90;

    .line 372
    .line 373
    move-object/from16 v17, p0

    .line 374
    .line 375
    move-object v4, v14

    .line 376
    move-object/from16 v2, v24

    .line 377
    .line 378
    move-object v14, v11

    .line 379
    invoke-direct/range {v13 .. v18}, Lg90;-><init>(Lva2;Landroid/app/Dialog;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    move-object/from16 v24, v14

    .line 383
    .line 384
    invoke-virtual {v9, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 385
    .line 386
    .line 387
    new-instance v11, Lg90;

    .line 388
    .line 389
    const/16 v17, 0x6

    .line 390
    .line 391
    move-object/from16 v13, v23

    .line 392
    .line 393
    move-object/from16 v23, v9

    .line 394
    .line 395
    move-object v9, v13

    .line 396
    move-object v14, v3

    .line 397
    move-object/from16 v13, v19

    .line 398
    .line 399
    move-object/from16 v3, v24

    .line 400
    .line 401
    move-object/from16 v15, v30

    .line 402
    .line 403
    move-object/from16 v16, v31

    .line 404
    .line 405
    invoke-direct/range {v11 .. v17}, Lg90;-><init>(Landroid/app/Activity;Lum1;Ljava/lang/Object;Landroid/widget/TextView;Ljava/lang/Object;I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v5, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 409
    .line 410
    .line 411
    new-instance v11, Lla2;

    .line 412
    .line 413
    const/16 v17, 0x0

    .line 414
    .line 415
    invoke-direct/range {v11 .. v17}, Lla2;-><init>(Landroid/app/Activity;Lum1;Lpa2;Landroid/widget/TextView;Landroid/widget/TextView;I)V

    .line 416
    .line 417
    .line 418
    move-object/from16 v34, v16

    .line 419
    .line 420
    move-object/from16 v16, v5

    .line 421
    .line 422
    move-object v5, v11

    .line 423
    move-object/from16 v11, v34

    .line 424
    .line 425
    iput-object v5, v14, Lpa2;->ι:Lla2;

    .line 426
    .line 427
    iget-object v5, v4, Lxx;->κ:Ljava/lang/String;

    .line 428
    .line 429
    const/16 v3, 0x63

    .line 430
    .line 431
    invoke-static {v3, v12, v5}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-virtual {v11, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 436
    .line 437
    .line 438
    iget-object v3, v4, Lxx;->β:Ljava/lang/String;

    .line 439
    .line 440
    const/16 v5, 0xe

    .line 441
    .line 442
    invoke-static {v5, v12, v3}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 447
    .line 448
    .line 449
    const v3, 0x7f09038c

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    const/16 v3, 0xa

    .line 457
    .line 458
    if-eqz v1, :cond_2

    .line 459
    .line 460
    invoke-static {v3, v12, v0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    invoke-virtual {v1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 465
    .line 466
    .line 467
    :cond_2
    invoke-static {v3, v12, v0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    invoke-virtual {v8, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 472
    .line 473
    .line 474
    invoke-static {v3, v12, v0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-virtual {v7, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 479
    .line 480
    .line 481
    invoke-static {v3, v12, v0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-virtual {v10, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 486
    .line 487
    .line 488
    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    move-object/from16 v7, v22

    .line 493
    .line 494
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 495
    .line 496
    .line 497
    invoke-static/range {v32 .. v32}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 502
    .line 503
    .line 504
    invoke-static/range {v32 .. v32}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 509
    .line 510
    .line 511
    iget-object v0, v4, Lxx;->Β:Ljava/lang/String;

    .line 512
    .line 513
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    move-object/from16 v1, v21

    .line 518
    .line 519
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 520
    .line 521
    .line 522
    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    move-object/from16 v10, v33

    .line 527
    .line 528
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 529
    .line 530
    .line 531
    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    move-object/from16 v10, v26

    .line 542
    .line 543
    invoke-static {v10, v4}, Lib2;->Μ(Landroid/widget/ProgressBar;Lxx;)V

    .line 544
    .line 545
    .line 546
    invoke-static {v2, v4}, Lib2;->Μ(Landroid/widget/ProgressBar;Lxx;)V

    .line 547
    .line 548
    .line 549
    invoke-static/range {v16 .. v16}, Lib2;->Λ(Landroid/widget/Button;)V

    .line 550
    .line 551
    .line 552
    invoke-static/range {v23 .. v23}, Lib2;->Λ(Landroid/widget/Button;)V

    .line 553
    .line 554
    .line 555
    iget-object v0, v13, Lum1;->ε:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v0, Ljava/util/List;

    .line 558
    .line 559
    invoke-static {v13, v14, v15, v11, v0}, Lib2;->Κ(Lum1;Lpa2;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/List;)V

    .line 560
    .line 561
    .line 562
    new-instance v0, Lvg;

    .line 563
    .line 564
    const/4 v1, 0x7

    .line 565
    move-object/from16 v3, v24

    .line 566
    .line 567
    invoke-direct {v0, v1, v3}, Lvg;-><init>(ILjava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    move-object/from16 v15, v28

    .line 571
    .line 572
    invoke-virtual {v15, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v15}, Landroid/app/Dialog;->show()V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v15}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    if-eqz v0, :cond_3

    .line 583
    .line 584
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 585
    .line 586
    const/4 v4, 0x0

    .line 587
    invoke-direct {v1, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 591
    .line 592
    .line 593
    const/high16 v1, 0x3f000000    # 0.5f

    .line 594
    .line 595
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 596
    .line 597
    .line 598
    const/4 v1, 0x2

    .line 599
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 611
    .line 612
    int-to-float v1, v1

    .line 613
    const v2, 0x3f70a3d7    # 0.94f

    .line 614
    .line 615
    .line 616
    mul-float/2addr v1, v2

    .line 617
    float-to-int v1, v1

    .line 618
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 627
    .line 628
    int-to-float v2, v2

    .line 629
    const v3, 0x3f47ae14    # 0.78f

    .line 630
    .line 631
    .line 632
    mul-float/2addr v2, v3

    .line 633
    float-to-int v2, v2

    .line 634
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 635
    .line 636
    .line 637
    goto :goto_1

    .line 638
    :goto_0
    invoke-static {v0, v9, v8}, Lib2;->σ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    :cond_3
    :goto_1
    return-void

    .line 642
    :pswitch_0
    check-cast v10, Landroid/widget/TextView;

    .line 643
    .line 644
    check-cast v9, Ljava/lang/Throwable;

    .line 645
    .line 646
    check-cast v6, Landroid/widget/Button;

    .line 647
    .line 648
    check-cast v8, Landroid/widget/Button;

    .line 649
    .line 650
    check-cast v7, Landroid/app/Activity;

    .line 651
    .line 652
    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    if-nez v0, :cond_4

    .line 657
    .line 658
    const-string v0, "\u672a\u77e5\u9519\u8bef"

    .line 659
    .line 660
    :cond_4
    const-string v1, "\u4e0b\u8f7d\u5931\u8d25\uff1a"

    .line 661
    .line 662
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 667
    .line 668
    .line 669
    const/4 v4, 0x1

    .line 670
    invoke-virtual {v6, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v8, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 674
    .line 675
    .line 676
    const-string v0, "\u4e0b\u8f7d\u5931\u8d25"

    .line 677
    .line 678
    const/4 v4, 0x0

    .line 679
    invoke-static {v7, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 684
    .line 685
    .line 686
    return-void

    .line 687
    :pswitch_1
    check-cast v10, Landroid/app/Activity;

    .line 688
    .line 689
    check-cast v9, Lsm1;

    .line 690
    .line 691
    check-cast v6, Ljava/util/List;

    .line 692
    .line 693
    check-cast v8, Landroid/widget/LinearLayout;

    .line 694
    .line 695
    check-cast v7, Landroid/view/View;

    .line 696
    .line 697
    invoke-static {v10, v9, v6, v8, v7}, Lbv1;->ρ(Landroid/app/Activity;Lsm1;Ljava/util/List;Landroid/widget/LinearLayout;Landroid/view/View;)V

    .line 698
    .line 699
    .line 700
    return-void

    .line 701
    :pswitch_2
    check-cast v10, Landroid/graphics/Bitmap;

    .line 702
    .line 703
    check-cast v9, Landroid/widget/CompoundButton;

    .line 704
    .line 705
    check-cast v6, Ljava/lang/String;

    .line 706
    .line 707
    check-cast v8, Ljava/lang/String;

    .line 708
    .line 709
    check-cast v7, Landroid/app/Activity;

    .line 710
    .line 711
    invoke-static {v9, v6, v8, v7, v10}, Lxd1;->ζ(Landroid/widget/CompoundButton;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;)V

    .line 712
    .line 713
    .line 714
    return-void

    .line 715
    :pswitch_3
    check-cast v10, Landroid/app/Activity;

    .line 716
    .line 717
    check-cast v6, Ljava/lang/String;

    .line 718
    .line 719
    check-cast v9, Ljava/lang/String;

    .line 720
    .line 721
    check-cast v8, Ljava/lang/String;

    .line 722
    .line 723
    check-cast v7, La80;

    .line 724
    .line 725
    const/4 v4, 0x1

    .line 726
    invoke-static {v10, v4}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    const/16 v1, 0x30

    .line 731
    .line 732
    const/16 v4, 0x18

    .line 733
    .line 734
    const/4 v5, 0x0

    .line 735
    invoke-virtual {v0, v1, v4, v1, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 736
    .line 737
    .line 738
    new-instance v1, Landroid/widget/TextView;

    .line 739
    .line 740
    invoke-direct {v1, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 744
    .line 745
    .line 746
    const/high16 v4, 0x41500000    # 13.0f

    .line 747
    .line 748
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 749
    .line 750
    .line 751
    const v4, -0xbbbbbc

    .line 752
    .line 753
    .line 754
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 755
    .line 756
    .line 757
    new-instance v4, Landroid/widget/EditText;

    .line 758
    .line 759
    invoke-direct {v4, v10}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 763
    .line 764
    .line 765
    const/4 v5, 0x1

    .line 766
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v4, v5}, Landroid/view/View;->setFocusable(Z)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v4, v5}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 776
    .line 777
    .line 778
    move-result-object v5

    .line 779
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 780
    .line 781
    .line 782
    move-result v5

    .line 783
    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setSelection(I)V

    .line 784
    .line 785
    .line 786
    const v5, 0x80001

    .line 787
    .line 788
    .line 789
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setInputType(I)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 796
    .line 797
    .line 798
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 799
    .line 800
    invoke-direct {v1, v10}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v1, v6}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    new-instance v1, Ley0;

    .line 812
    .line 813
    const/4 v5, 0x1

    .line 814
    invoke-direct {v1, v7, v4, v8, v5}, Ley0;-><init>(La80;Landroid/widget/EditText;Ljava/lang/String;I)V

    .line 815
    .line 816
    .line 817
    const-string v6, "\u4fdd\u5b58"

    .line 818
    .line 819
    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    new-instance v1, Lfy0;

    .line 832
    .line 833
    invoke-direct {v1, v0, v4, v5}, Lfy0;-><init>(Landroid/app/AlertDialog;Landroid/widget/EditText;I)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 840
    .line 841
    .line 842
    return-void

    .line 843
    :pswitch_4
    check-cast v10, Landroid/app/AlertDialog;

    .line 844
    .line 845
    check-cast v9, Lr90;

    .line 846
    .line 847
    check-cast v6, Landroid/widget/ProgressBar;

    .line 848
    .line 849
    check-cast v8, Landroid/widget/TextView;

    .line 850
    .line 851
    check-cast v7, Lxx;

    .line 852
    .line 853
    invoke-virtual {v10}, Landroid/app/Dialog;->isShowing()Z

    .line 854
    .line 855
    .line 856
    move-result v0

    .line 857
    if-eqz v0, :cond_6

    .line 858
    .line 859
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    iget-wide v0, v9, Lr90;->β:J

    .line 863
    .line 864
    const-wide/16 v2, 0x3e8

    .line 865
    .line 866
    mul-long/2addr v2, v0

    .line 867
    const-wide/32 v4, 0xb0d53cf

    .line 868
    .line 869
    .line 870
    div-long/2addr v2, v4

    .line 871
    long-to-int v2, v2

    .line 872
    const/16 v3, 0x3e8

    .line 873
    .line 874
    const/4 v10, 0x0

    .line 875
    invoke-static {v2, v10, v3}, Lj81;->μ(III)I

    .line 876
    .line 877
    .line 878
    move-result v2

    .line 879
    invoke-virtual {v6, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 880
    .line 881
    .line 882
    long-to-double v0, v0

    .line 883
    const-wide/high16 v2, 0x4130000000000000L    # 1048576.0

    .line 884
    .line 885
    div-double/2addr v0, v2

    .line 886
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    const/4 v1, 0x1

    .line 895
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    const-string v6, "%.1f"

    .line 900
    .line 901
    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    long-to-double v4, v4

    .line 906
    div-double/2addr v4, v2

    .line 907
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 908
    .line 909
    .line 910
    move-result-object v4

    .line 911
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v4

    .line 915
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v4

    .line 919
    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v4

    .line 923
    iget-wide v10, v9, Lr90;->γ:J

    .line 924
    .line 925
    const-wide/16 v12, 0x0

    .line 926
    .line 927
    cmp-long v5, v10, v12

    .line 928
    .line 929
    const-string v12, " \u00b7 "

    .line 930
    .line 931
    if-lez v5, :cond_5

    .line 932
    .line 933
    long-to-double v10, v10

    .line 934
    div-double/2addr v10, v2

    .line 935
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v2

    .line 943
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v1

    .line 951
    const-string v2, " MB/s"

    .line 952
    .line 953
    invoke-static {v12, v1, v2}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    :goto_2
    const/4 v5, 0x0

    .line 958
    goto :goto_3

    .line 959
    :cond_5
    const-string v1, ""

    .line 960
    .line 961
    goto :goto_2

    .line 962
    :goto_3
    invoke-virtual {v8, v5}, Landroid/view/View;->setVisibility(I)V

    .line 963
    .line 964
    .line 965
    iget-object v2, v7, Lxx;->η:Ljava/lang/String;

    .line 966
    .line 967
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 968
    .line 969
    .line 970
    move-result v2

    .line 971
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 972
    .line 973
    .line 974
    iget-object v2, v9, Lr90;->δ:Ljava/lang/String;

    .line 975
    .line 976
    const-string v3, " / "

    .line 977
    .line 978
    invoke-static {v2, v12, v0, v3, v4}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    const-string v2, " MB"

    .line 983
    .line 984
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 985
    .line 986
    .line 987
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 995
    .line 996
    .line 997
    :cond_6
    return-void

    .line 998
    :pswitch_5
    check-cast v10, Landroid/app/Activity;

    .line 999
    .line 1000
    check-cast v9, Lm10;

    .line 1001
    .line 1002
    iget-object v1, v9, Lm10;->α:Ljava/util/concurrent/CountDownLatch;

    .line 1003
    .line 1004
    check-cast v6, Ljava/lang/String;

    .line 1005
    .line 1006
    check-cast v8, Ljava/lang/String;

    .line 1007
    .line 1008
    check-cast v7, Ljava/lang/String;

    .line 1009
    .line 1010
    const-string v0, "\u662f\u5426\u7ee7\u7eed\u6267\u884c\u672c\u6b21 Feed \u6d41\u5173\u6ce8\u8bf7\u6c42\uff1f\n\n\u76ee\u6807\uff1a"

    .line 1011
    .line 1012
    invoke-virtual {v10}, Landroid/app/Activity;->isFinishing()Z

    .line 1013
    .line 1014
    .line 1015
    move-result v3

    .line 1016
    if-nez v3, :cond_a

    .line 1017
    .line 1018
    invoke-virtual {v10}, Landroid/app/Activity;->isDestroyed()Z

    .line 1019
    .line 1020
    .line 1021
    move-result v3

    .line 1022
    if-eqz v3, :cond_7

    .line 1023
    .line 1024
    goto/16 :goto_6

    .line 1025
    .line 1026
    :cond_7
    :try_start_0
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 1027
    .line 1028
    invoke-direct {v3, v10}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1029
    .line 1030
    .line 1031
    const-string v4, "\u786e\u8ba4\u5173\u6ce8"

    .line 1032
    .line 1033
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v3

    .line 1037
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v4

    .line 1041
    if-eqz v4, :cond_8

    .line 1042
    .line 1043
    move-object v6, v8

    .line 1044
    :cond_8
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1045
    .line 1046
    .line 1047
    move-result v4

    .line 1048
    if-eqz v4, :cond_9

    .line 1049
    .line 1050
    const-string v0, "\u662f\u5426\u7ee7\u7eed\u6267\u884c\u672c\u6b21 Feed \u6d41\u5173\u6ce8\u8bf7\u6c42\uff1f"

    .line 1051
    .line 1052
    goto :goto_4

    .line 1053
    :cond_9
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    :goto_4
    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    const-string v3, "\u5173\u6ce8"

    .line 1062
    .line 1063
    new-instance v4, Lk10;

    .line 1064
    .line 1065
    const/4 v5, 0x0

    .line 1066
    invoke-direct {v4, v9, v5}, Lk10;-><init>(Lm10;I)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    new-instance v3, Lk10;

    .line 1074
    .line 1075
    const/4 v4, 0x1

    .line 1076
    invoke-direct {v3, v9, v4}, Lk10;-><init>(Lm10;I)V

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    new-instance v2, Ll10;

    .line 1084
    .line 1085
    invoke-direct {v2, v9}, Ll10;-><init>(Lm10;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v0

    .line 1092
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1096
    goto :goto_5

    .line 1097
    :catchall_0
    move-exception v0

    .line 1098
    new-instance v2, Leo1;

    .line 1099
    .line 1100
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1101
    .line 1102
    .line 1103
    move-object v0, v2

    .line 1104
    :goto_5
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    if-eqz v0, :cond_b

    .line 1109
    .line 1110
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1115
    .line 1116
    const-string v3, "r6bf684bf1a62dbe6"

    .line 1117
    .line 1118
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1135
    .line 1136
    .line 1137
    goto :goto_7

    .line 1138
    :cond_a
    :goto_6
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1139
    .line 1140
    .line 1141
    :cond_b
    :goto_7
    return-void

    .line 1142
    :pswitch_6
    check-cast v10, Landroid/app/Activity;

    .line 1143
    .line 1144
    check-cast v9, Lp9;

    .line 1145
    .line 1146
    check-cast v6, Ljava/util/ArrayList;

    .line 1147
    .line 1148
    check-cast v8, Lη;

    .line 1149
    .line 1150
    check-cast v7, Lo7;

    .line 1151
    .line 1152
    invoke-static {v10, v9, v6, v8, v7}, Lpd2;->Υ(Landroid/app/Activity;Lp9;Ljava/util/ArrayList;Lη;Lo7;)V

    .line 1153
    .line 1154
    .line 1155
    return-void

    .line 1156
    :pswitch_7
    check-cast v10, Lw32;

    .line 1157
    .line 1158
    check-cast v9, Lnp0;

    .line 1159
    .line 1160
    move-object v12, v6

    .line 1161
    check-cast v12, Ljava/lang/String;

    .line 1162
    .line 1163
    move-object/from16 v17, v8

    .line 1164
    .line 1165
    check-cast v17, Lyr;

    .line 1166
    .line 1167
    move-object/from16 v16, v7

    .line 1168
    .line 1169
    check-cast v16, Lf50;

    .line 1170
    .line 1171
    const-string v0, "BackgroundTextMeasurement"

    .line 1172
    .line 1173
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1174
    .line 1175
    .line 1176
    :try_start_1
    invoke-static {}, Lax1;->κ()Ltw1;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    instance-of v1, v0, Lf21;

    .line 1181
    .line 1182
    if-eqz v1, :cond_c

    .line 1183
    .line 1184
    check-cast v0, Lf21;

    .line 1185
    .line 1186
    goto :goto_8

    .line 1187
    :cond_c
    move-object v0, v3

    .line 1188
    :goto_8
    if-eqz v0, :cond_d

    .line 1189
    .line 1190
    invoke-virtual {v0, v3, v3}, Lf21;->Ε(La80;La80;)Lf21;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 1194
    if-eqz v1, :cond_d

    .line 1195
    .line 1196
    :try_start_2
    invoke-virtual {v1}, Ltw1;->κ()Ltw1;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1200
    :try_start_3
    invoke-static {v10, v9}, Lj81;->Μ(Lw32;Lnp0;)Lw32;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v13

    .line 1204
    sget-object v14, Ljz;->ε:Ljz;

    .line 1205
    .line 1206
    new-instance v11, Lw2;

    .line 1207
    .line 1208
    move-object v15, v14

    .line 1209
    invoke-direct/range {v11 .. v17}, Lw2;-><init>(Ljava/lang/String;Lw32;Ljava/util/List;Ljava/util/List;Lf50;Lyr;)V

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v11}, Lw2;->β()F

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v11}, Lw2;->γ()F
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1216
    .line 1217
    .line 1218
    :try_start_4
    invoke-static {v2}, Ltw1;->ρ(Ltw1;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1219
    .line 1220
    .line 1221
    :try_start_5
    invoke-virtual {v1}, Lf21;->ψ()Lg81;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    invoke-virtual {v0}, Lg81;->γ()V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v1}, Lf21;->γ()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 1229
    .line 1230
    .line 1231
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1232
    .line 1233
    .line 1234
    return-void

    .line 1235
    :catchall_1
    move-exception v0

    .line 1236
    goto :goto_9

    .line 1237
    :catchall_2
    move-exception v0

    .line 1238
    :try_start_6
    invoke-static {v2}, Ltw1;->ρ(Ltw1;)V

    .line 1239
    .line 1240
    .line 1241
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1242
    :goto_9
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1243
    :catchall_3
    move-exception v0

    .line 1244
    :try_start_8
    invoke-virtual {v1}, Lf21;->γ()V

    .line 1245
    .line 1246
    .line 1247
    throw v0

    .line 1248
    :catchall_4
    move-exception v0

    .line 1249
    goto :goto_a

    .line 1250
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1251
    .line 1252
    const-string v1, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 1253
    .line 1254
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1255
    .line 1256
    .line 1257
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1258
    :goto_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1259
    .line 1260
    .line 1261
    throw v0

    .line 1262
    nop

    .line 1263
    :pswitch_data_0
    .packed-switch 0x0
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
