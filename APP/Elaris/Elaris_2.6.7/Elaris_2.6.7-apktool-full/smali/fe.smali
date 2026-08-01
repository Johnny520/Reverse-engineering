.class public final Lfe;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Ljava/lang/ClassLoader;

.field public final synthetic c:Lpd;

.field public final synthetic d:Landroid/app/Dialog;

.field public final synthetic e:Landroid/widget/TextView;

.field public final synthetic f:Landroid/widget/LinearLayout;

.field public final synthetic g:[Lw6;

.field public final synthetic h:[I

.field public final synthetic i:Ln9;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/LinearLayout;[Lw6;[ILn9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfe;->a:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lfe;->b:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    iput-object p3, p0, Lfe;->c:Lpd;

    .line 9
    .line 10
    iput-object p4, p0, Lfe;->d:Landroid/app/Dialog;

    .line 11
    .line 12
    iput-object p5, p0, Lfe;->e:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p6, p0, Lfe;->f:Landroid/widget/LinearLayout;

    .line 15
    .line 16
    iput-object p7, p0, Lfe;->g:[Lw6;

    .line 17
    .line 18
    iput-object p8, p0, Lfe;->h:[I

    .line 19
    .line 20
    iput-object p9, p0, Lfe;->i:Ln9;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v3, v0, Lfe;->a:Landroid/app/Activity;

    .line 4
    .line 5
    const/4 v13, 0x1

    .line 6
    if-eqz v3, :cond_0

    .line 7
    .line 8
    iget-object v4, v0, Lfe;->i:Ln9;

    .line 9
    .line 10
    invoke-virtual {v4}, Ln9;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :cond_0
    move/from16 p1, v13

    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_1
    iget-object v1, v4, Ln9;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v1}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v5, Landroid/widget/EditText;

    .line 27
    .line 28
    invoke-direct {v5, v3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 32
    .line 33
    .line 34
    const v6, 0x80001

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setInputType(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-lez v7, :cond_2

    .line 52
    .line 53
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 54
    .line 55
    invoke-virtual {v1, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual {v2, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {v8, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_2

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    sub-int/2addr v7, v2

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    :goto_0
    :try_start_0
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-virtual {v5, v6, v2}, Landroid/widget/EditText;->setSelection(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    :catchall_0
    new-instance v2, Landroid/app/Dialog;

    .line 91
    .line 92
    invoke-direct {v2, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v2}, Lu9;->d(Landroid/app/Dialog;)V

    .line 96
    .line 97
    .line 98
    :try_start_1
    invoke-virtual {v2, v13}, Landroid/app/Dialog;->requestWindowFeature(I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    .line 100
    .line 101
    :catchall_1
    new-instance v14, Landroid/widget/LinearLayout;

    .line 102
    .line 103
    invoke-direct {v14, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v14, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 107
    .line 108
    .line 109
    const/high16 v7, 0x41600000    # 14.0f

    .line 110
    .line 111
    invoke-static {v3, v7}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    invoke-static {v3, v7}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    invoke-static {v3, v7}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    const/high16 v11, 0x41400000    # 12.0f

    .line 124
    .line 125
    invoke-static {v3, v11}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    invoke-virtual {v14, v8, v9, v10, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 130
    .line 131
    .line 132
    invoke-static {v3}, Lcom/mr/elaris/w;->l0(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-virtual {v14, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 137
    .line 138
    .line 139
    new-instance v8, Landroid/widget/TextView;

    .line 140
    .line 141
    invoke-direct {v8, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 142
    .line 143
    .line 144
    const-string v9, "\u91cd\u547d\u540d"

    .line 145
    .line 146
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v3}, Lu9;->G(Landroid/content/Context;)I

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 154
    .line 155
    .line 156
    const/high16 v9, 0x41880000    # 17.0f

    .line 157
    .line 158
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 159
    .line 160
    .line 161
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 162
    .line 163
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 167
    .line 168
    .line 169
    const/16 v9, 0x10

    .line 170
    .line 171
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 172
    .line 173
    .line 174
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 175
    .line 176
    const/4 v10, -0x1

    .line 177
    const/4 v15, -0x2

    .line 178
    invoke-direct {v9, v10, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v14, v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v3, v11}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    invoke-static {v3}, Lu9;->G(Landroid/content/Context;)I

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v8, v6, v8, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 199
    .line 200
    .line 201
    invoke-static {v3}, Lu9;->y(Landroid/content/Context;)I

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    invoke-static {v3, v11}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    invoke-static {v3}, Lu9;->o(Landroid/content/Context;)Z

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    if-eqz v9, :cond_3

    .line 214
    .line 215
    const v9, -0xb3aea2

    .line 216
    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_3
    const v9, -0x17130e

    .line 220
    .line 221
    .line 222
    :goto_1
    const/high16 v12, 0x3f800000    # 1.0f

    .line 223
    .line 224
    move/from16 p1, v13

    .line 225
    .line 226
    invoke-static {v3, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    invoke-static {v7, v8, v9, v13}, Lcom/mr/elaris/w;->m0(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    invoke-virtual {v5, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 235
    .line 236
    .line 237
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 238
    .line 239
    const/high16 v8, 0x42180000    # 38.0f

    .line 240
    .line 241
    invoke-static {v3, v8}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    invoke-direct {v7, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 246
    .line 247
    .line 248
    invoke-static {v3, v11}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 253
    .line 254
    invoke-virtual {v14, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 255
    .line 256
    .line 257
    new-instance v7, Landroid/widget/LinearLayout;

    .line 258
    .line 259
    invoke-direct {v7, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 263
    .line 264
    .line 265
    const/16 v8, 0x11

    .line 266
    .line 267
    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 268
    .line 269
    .line 270
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 271
    .line 272
    const/high16 v9, 0x42080000    # 34.0f

    .line 273
    .line 274
    invoke-static {v3, v9}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    invoke-direct {v8, v10, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 279
    .line 280
    .line 281
    invoke-static {v3, v11}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 286
    .line 287
    const-string v9, "\u4fdd\u5b58"

    .line 288
    .line 289
    invoke-static {v3, v9}, Lcom/mr/elaris/w;->j0(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 290
    .line 291
    .line 292
    move-result-object v13

    .line 293
    const-string v9, "\u53d6\u6d88"

    .line 294
    .line 295
    invoke-static {v3, v9}, Lcom/mr/elaris/w;->j0(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 300
    .line 301
    invoke-direct {v11, v6, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v7, v13, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 305
    .line 306
    .line 307
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 308
    .line 309
    invoke-direct {v11, v6, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 310
    .line 311
    .line 312
    const/high16 v6, 0x41000000    # 8.0f

    .line 313
    .line 314
    invoke-static {v3, v6}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    iput v6, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 319
    .line 320
    invoke-virtual {v7, v9, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v14, v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 324
    .line 325
    .line 326
    new-instance v6, Lj6;

    .line 327
    .line 328
    const/4 v7, 0x3

    .line 329
    invoke-direct {v6, v2, v7}, Lj6;-><init>(Landroid/app/Dialog;I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 333
    .line 334
    .line 335
    new-instance v6, Lhe;

    .line 336
    .line 337
    move-object v7, v6

    .line 338
    iget-object v6, v0, Lfe;->b:Ljava/lang/ClassLoader;

    .line 339
    .line 340
    move-object v8, v7

    .line 341
    iget-object v7, v0, Lfe;->c:Lpd;

    .line 342
    .line 343
    move-object v9, v8

    .line 344
    iget-object v8, v0, Lfe;->d:Landroid/app/Dialog;

    .line 345
    .line 346
    move-object v10, v9

    .line 347
    iget-object v9, v0, Lfe;->e:Landroid/widget/TextView;

    .line 348
    .line 349
    move-object v11, v10

    .line 350
    iget-object v10, v0, Lfe;->f:Landroid/widget/LinearLayout;

    .line 351
    .line 352
    move-object v12, v11

    .line 353
    iget-object v11, v0, Lfe;->g:[Lw6;

    .line 354
    .line 355
    iget-object v0, v0, Lfe;->h:[I

    .line 356
    .line 357
    move-object/from16 v16, v12

    .line 358
    .line 359
    move-object v12, v0

    .line 360
    move-object/from16 v0, v16

    .line 361
    .line 362
    move-object/from16 v16, v5

    .line 363
    .line 364
    move-object v5, v2

    .line 365
    move-object/from16 v2, v16

    .line 366
    .line 367
    invoke-direct/range {v0 .. v12}, Lhe;-><init>(Ljava/lang/String;Landroid/widget/EditText;Landroid/app/Activity;Ln9;Landroid/app/Dialog;Ljava/lang/ClassLoader;Lpd;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/LinearLayout;[Lw6;[I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v13, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v5, v14}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 377
    .line 378
    .line 379
    :try_start_2
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    if-eqz v0, :cond_4

    .line 384
    .line 385
    const v1, 0x106000d

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    const/high16 v2, 0x43700000    # 240.0f

    .line 396
    .line 397
    invoke-static {v3, v2}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 410
    .line 411
    const/high16 v5, 0x42b40000    # 90.0f

    .line 412
    .line 413
    invoke-static {v3, v5}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    sub-int/2addr v4, v5

    .line 418
    const/high16 v5, 0x43be0000    # 380.0f

    .line 419
    .line 420
    invoke-static {v3, v5}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 433
    .line 434
    iput v15, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 435
    .line 436
    const v2, 0x3ecccccd    # 0.4f

    .line 437
    .line 438
    .line 439
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 440
    .line 441
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 442
    .line 443
    .line 444
    :catchall_2
    :cond_4
    :goto_2
    return p1
.end method
