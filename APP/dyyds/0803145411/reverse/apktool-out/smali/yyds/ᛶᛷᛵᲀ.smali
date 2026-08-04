.class public final Lyyds/ᛶᛷᛵᲀ;
.super Landroid/app/Dialog;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᛶᛵᲁᛴ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lyyds/ᛶᛵᲁᛴ;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛶᛷᛵᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛵᲁᛴ;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v6, v0, Lyyds/ᛶᛷᛵᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛵᲁᛴ;

    .line 4
    .line 5
    iget-object v2, v6, Lyyds/ᛶᛵᲁᛴ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v7, v6, Lyyds/ᛶᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v8, v6, Lyyds/ᛶᛵᲁᛴ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-super/range {p0 .. p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    const/4 v9, 0x1

    .line 15
    invoke-virtual {v0, v9}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v10, 0x2

    .line 23
    const/16 v3, 0x11

    .line 24
    .line 25
    const/4 v4, -0x1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const v5, 0x106000d

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v5}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v4, v4}, Landroid/view/Window;->setLayout(II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v3}, Landroid/view/Window;->setGravity(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v10}, Landroid/view/Window;->addFlags(I)V

    .line 41
    .line 42
    .line 43
    const v5, 0x3ecccccd    # 0.4f

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v5}, Landroid/view/Window;->setDimAmount(F)V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-wide v11, -0xaeffe68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    iget v11, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 80
    .line 81
    int-to-float v11, v11

    .line 82
    const v12, 0x3f6b851f    # 0.92f

    .line 83
    .line 84
    .line 85
    mul-float/2addr v11, v12

    .line 86
    float-to-int v11, v11

    .line 87
    new-instance v12, Landroid/widget/FrameLayout;

    .line 88
    .line 89
    invoke-direct {v12, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    new-instance v13, Landroid/view/ViewGroup$LayoutParams;

    .line 93
    .line 94
    invoke-direct {v13, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    new-instance v13, Lyyds/ᛶᲈᛴᲈ;

    .line 101
    .line 102
    const/16 v14, 0x9

    .line 103
    .line 104
    invoke-direct {v13, v14, v0}, Lyyds/ᛶᲈᛴᲈ;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    .line 109
    .line 110
    new-instance v13, Landroid/widget/LinearLayout;

    .line 111
    .line 112
    invoke-direct {v13, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v13, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 116
    .line 117
    .line 118
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 119
    .line 120
    const/4 v15, -0x2

    .line 121
    invoke-direct {v14, v11, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 122
    .line 123
    .line 124
    iput v3, v14, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 125
    .line 126
    invoke-virtual {v13, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    .line 128
    .line 129
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 130
    .line 131
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 132
    .line 133
    .line 134
    const/high16 v11, 0x41a00000    # 20.0f

    .line 135
    .line 136
    mul-float/2addr v11, v5

    .line 137
    invoke-virtual {v3, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v13, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v13, v9}, Landroid/view/View;->setClipToOutline(Z)V

    .line 147
    .line 148
    .line 149
    new-instance v3, Lyyds/ᛴᛸᛷᲈ;

    .line 150
    .line 151
    invoke-direct {v3, v5}, Lyyds/ᛴᛸᛷᲈ;-><init>(F)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v13, v3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 155
    .line 156
    .line 157
    new-instance v3, Lyyds/ᲈᛳᛲᛶ;

    .line 158
    .line 159
    const/4 v11, 0x5

    .line 160
    invoke-direct {v3, v11}, Lyyds/ᲈᛳᛲᛶ;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v13, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 164
    .line 165
    .line 166
    iget-object v3, v6, Lyyds/ᛶᛵᲁᛴ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v11, v6, Lyyds/ᛶᛵᲁᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    const/high16 v16, 0x41400000    # 12.0f

    .line 175
    .line 176
    const/high16 v17, 0x41c00000    # 24.0f

    .line 177
    .line 178
    const/high16 v18, 0x41000000    # 8.0f

    .line 179
    .line 180
    if-lez v14, :cond_2

    .line 181
    .line 182
    new-instance v14, Landroid/widget/TextView;

    .line 183
    .line 184
    invoke-direct {v14, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v14, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    .line 189
    .line 190
    const/high16 v10, 0x41b00000    # 22.0f

    .line 191
    .line 192
    invoke-virtual {v14, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 193
    .line 194
    .line 195
    const/4 v10, 0x0

    .line 196
    invoke-virtual {v14, v10, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 197
    .line 198
    .line 199
    const v10, -0xdededf

    .line 200
    .line 201
    .line 202
    invoke-virtual {v14, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 203
    .line 204
    .line 205
    mul-float v10, v17, v5

    .line 206
    .line 207
    float-to-int v10, v10

    .line 208
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 209
    .line 210
    .line 211
    move-result v19

    .line 212
    if-nez v19, :cond_1

    .line 213
    .line 214
    mul-float v9, v18, v5

    .line 215
    .line 216
    :goto_0
    float-to-int v9, v9

    .line 217
    goto :goto_1

    .line 218
    :cond_1
    mul-float v9, v16, v5

    .line 219
    .line 220
    goto :goto_0

    .line 221
    :goto_1
    invoke-virtual {v14, v10, v10, v10, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 225
    .line 226
    .line 227
    :cond_2
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    const/4 v10, 0x0

    .line 232
    const/high16 v14, 0x41800000    # 16.0f

    .line 233
    .line 234
    if-lez v9, :cond_4

    .line 235
    .line 236
    new-instance v9, Landroid/widget/TextView;

    .line 237
    .line 238
    invoke-direct {v9, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 245
    .line 246
    .line 247
    const v11, -0xbdbdbe

    .line 248
    .line 249
    .line 250
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 251
    .line 252
    .line 253
    const/4 v11, 0x0

    .line 254
    move/from16 v20, v14

    .line 255
    .line 256
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 257
    .line 258
    invoke-virtual {v9, v11, v14}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 259
    .line 260
    .line 261
    mul-float v11, v17, v5

    .line 262
    .line 263
    float-to-int v11, v11

    .line 264
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-nez v3, :cond_3

    .line 269
    .line 270
    move v3, v11

    .line 271
    goto :goto_2

    .line 272
    :cond_3
    move v3, v10

    .line 273
    :goto_2
    mul-float v14, v18, v5

    .line 274
    .line 275
    float-to-int v14, v14

    .line 276
    invoke-virtual {v9, v11, v3, v11, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v13, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_4
    move/from16 v20, v14

    .line 284
    .line 285
    :goto_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    if-lez v3, :cond_5

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_5
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-lez v3, :cond_6

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_6
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    if-lez v3, :cond_a

    .line 304
    .line 305
    :goto_4
    new-instance v9, Landroid/widget/LinearLayout;

    .line 306
    .line 307
    invoke-direct {v9, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 311
    .line 312
    .line 313
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 314
    .line 315
    invoke-direct {v3, v4, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v9, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 319
    .line 320
    .line 321
    mul-float v3, v16, v5

    .line 322
    .line 323
    float-to-int v3, v3

    .line 324
    mul-float v11, v18, v5

    .line 325
    .line 326
    float-to-int v11, v11

    .line 327
    mul-float v14, v20, v5

    .line 328
    .line 329
    float-to-int v14, v14

    .line 330
    invoke-virtual {v9, v3, v11, v3, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 331
    .line 332
    .line 333
    new-instance v3, Landroid/view/View;

    .line 334
    .line 335
    invoke-direct {v3, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 336
    .line 337
    .line 338
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 339
    .line 340
    const/high16 v14, 0x3f800000    # 1.0f

    .line 341
    .line 342
    invoke-direct {v11, v10, v4, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    move v4, v5

    .line 356
    if-lez v3, :cond_7

    .line 357
    .line 358
    new-instance v5, Lyyds/ᛴᛵᛳᛳ;

    .line 359
    .line 360
    invoke-direct {v5, v0, v10}, Lyyds/ᛴᛵᛳᛳ;-><init>(Lyyds/ᛶᛷᛵᲀ;I)V

    .line 361
    .line 362
    .line 363
    const/4 v3, 0x0

    .line 364
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛶᛷᛵᲀ;->ᛲᲈᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;FLyyds/ᲁᛶᲁᲀ;)Landroid/widget/TextView;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 369
    .line 370
    .line 371
    :cond_7
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-lez v2, :cond_8

    .line 376
    .line 377
    new-instance v5, Lyyds/ᛴᛵᛳᛳ;

    .line 378
    .line 379
    const/4 v2, 0x1

    .line 380
    invoke-direct {v5, v0, v2}, Lyyds/ᛴᛵᛳᛳ;-><init>(Lyyds/ᛶᛷᛵᲀ;I)V

    .line 381
    .line 382
    .line 383
    const/4 v3, 0x0

    .line 384
    move-object v2, v7

    .line 385
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛶᛷᛵᲀ;->ᛲᲈᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;FLyyds/ᲁᛶᲁᲀ;)Landroid/widget/TextView;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 390
    .line 391
    .line 392
    :cond_8
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-lez v2, :cond_9

    .line 397
    .line 398
    iget-object v3, v6, Lyyds/ᛶᛵᲁᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Integer;

    .line 399
    .line 400
    new-instance v5, Lyyds/ᛴᛵᛳᛳ;

    .line 401
    .line 402
    const/4 v2, 0x2

    .line 403
    invoke-direct {v5, v0, v2}, Lyyds/ᛴᛵᛳᛳ;-><init>(Lyyds/ᛶᛷᛵᲀ;I)V

    .line 404
    .line 405
    .line 406
    move-object v2, v8

    .line 407
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛶᛷᛵᲀ;->ᛲᲈᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;FLyyds/ᲁᛶᲁᲀ;)Landroid/widget/TextView;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 412
    .line 413
    .line 414
    :cond_9
    invoke-virtual {v13, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 415
    .line 416
    .line 417
    :cond_a
    invoke-virtual {v12, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 418
    .line 419
    .line 420
    new-instance v1, Lyyds/ᛲᛳᛵᛱ;

    .line 421
    .line 422
    const/16 v2, 0xb

    .line 423
    .line 424
    invoke-direct {v1, v2, v13}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v12}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 431
    .line 432
    .line 433
    iget-boolean v1, v6, Lyyds/ᛶᛵᲁᛴ;->ᛱᲈᲁ:Z

    .line 434
    .line 435
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 436
    .line 437
    .line 438
    return-void
.end method

.method public final ᛲᲈᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;FLyyds/ᲁᛶᲁᲀ;)Landroid/widget/TextView;
    .locals 2

    .line 1
    new-instance p0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const p1, -0xd55412

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    const/high16 p2, 0x41800000    # 16.0f

    .line 20
    .line 21
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 22
    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    const/4 p3, 0x1

    .line 26
    invoke-virtual {p0, p2, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 30
    .line 31
    .line 32
    const/16 v0, 0x11

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 35
    .line 36
    .line 37
    const/high16 v0, 0x41400000    # 12.0f

    .line 38
    .line 39
    mul-float/2addr v0, p4

    .line 40
    float-to-int v0, v0

    .line 41
    const/high16 v1, 0x41000000    # 8.0f

    .line 42
    .line 43
    mul-float/2addr v1, p4

    .line 44
    float-to-int v1, v1

    .line 45
    invoke-virtual {p0, v0, v1, v0, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 49
    .line 50
    const/4 v1, -0x2

    .line 51
    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    .line 56
    .line 57
    const v0, 0xffffff

    .line 58
    .line 59
    .line 60
    and-int/2addr p1, v0

    .line 61
    const/high16 v0, 0x1a000000

    .line 62
    .line 63
    or-int/2addr p1, v0

    .line 64
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-wide v0, -0xaf0fe68a836eL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 77
    .line 78
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 79
    .line 80
    .line 81
    const/high16 v1, 0x40c00000    # 6.0f

    .line 82
    .line 83
    mul-float/2addr v1, p4

    .line 84
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 85
    .line 86
    .line 87
    const/4 p4, -0x1

    .line 88
    invoke-virtual {v0, p4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 89
    .line 90
    .line 91
    new-instance p4, Landroid/graphics/drawable/RippleDrawable;

    .line 92
    .line 93
    invoke-direct {p4, p1, p2, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p3}, Landroid/view/View;->setClickable(Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p3}, Landroid/view/View;->setFocusable(Z)V

    .line 103
    .line 104
    .line 105
    new-instance p1, Lyyds/ᛶᲇᲁᲀ;

    .line 106
    .line 107
    invoke-direct {p1, p3, p5}, Lyyds/ᛶᲇᲁᲀ;-><init>(ILyyds/ᲁᛶᲁᲀ;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    .line 112
    .line 113
    return-object p0
.end method
