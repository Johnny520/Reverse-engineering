.class public final synthetic Lyyds/ᲇᛵᛱᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲇᛵᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲇᛵᛱᲇ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyyds/ᲇᛵᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    iget-object v0, v0, Lyyds/ᲇᛵᛱᲇ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 11
    .line 12
    sget-object v1, Lyyds/ᛱᛴᲁᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛴᲁᛲ;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛱᛱ(Lyyds/ᛱᛴᲁᛲ;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    sget-object v1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 19
    .line 20
    sget-object v1, Lyyds/ᛱᛴᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᲁᛲ;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛱᛱ(Lyyds/ᛱᛴᲁᛲ;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v1, v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛵᛶᛲᲀ:Landroid/view/View;

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    const-wide v3, -0xf772e68a836eL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const v3, 0x3f51eb85    # 0.82f

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-wide/16 v3, 0x64

    .line 55
    .line 56
    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v3, Lyyds/ᛸᛳᛱᛳ;

    .line 61
    .line 62
    const/4 v4, 0x4

    .line 63
    invoke-direct {v3, v0, v4}, Lyyds/ᛸᛳᛱᛳ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 71
    .line 72
    .line 73
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v3, v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛲᲇ:Lyyds/ᛵᛱᛷᛳ;

    .line 83
    .line 84
    new-instance v5, Lyyds/ᛶᲀᲈᛷ;

    .line 85
    .line 86
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance v6, Landroid/widget/LinearLayout;

    .line 90
    .line 91
    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 92
    .line 93
    .line 94
    const/4 v7, 0x1

    .line 95
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 96
    .line 97
    .line 98
    const/16 v8, 0x14

    .line 99
    .line 100
    invoke-virtual {v0, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    const/16 v10, 0x12

    .line 105
    .line 106
    invoke-virtual {v0, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    invoke-virtual {v0, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    const/16 v11, 0x10

    .line 115
    .line 116
    invoke-virtual {v0, v11}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    invoke-virtual {v6, v9, v10, v8, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 121
    .line 122
    .line 123
    new-instance v8, Landroid/widget/TextView;

    .line 124
    .line 125
    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 126
    .line 127
    .line 128
    const-wide v9, -0xf6d8e68a836eL

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 138
    .line 139
    .line 140
    const/high16 v9, 0x41900000    # 18.0f

    .line 141
    .line 142
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 143
    .line 144
    .line 145
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 146
    .line 147
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 148
    .line 149
    .line 150
    const v10, 0x660600f4

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 161
    .line 162
    .line 163
    new-instance v8, Landroid/widget/TextView;

    .line 164
    .line 165
    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 166
    .line 167
    .line 168
    const-wide v12, -0xf6dde68a836eL

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    invoke-static {v12, v13}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    .line 179
    .line 180
    const/high16 v12, 0x41400000    # 12.0f

    .line 181
    .line 182
    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 183
    .line 184
    .line 185
    const v12, 0x66060102

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v4}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    const/4 v14, 0x0

    .line 200
    invoke-virtual {v8, v14, v13, v14, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 204
    .line 205
    .line 206
    new-instance v8, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    new-instance v13, Landroid/widget/TextView;

    .line 212
    .line 213
    invoke-direct {v13, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 214
    .line 215
    .line 216
    const-wide v15, -0xf6f0e68a836eL

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    invoke-static/range {v15 .. v16}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v15

    .line 225
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    .line 227
    .line 228
    const/high16 v15, 0x41600000    # 14.0f

    .line 229
    .line 230
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v13, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 234
    .line 235
    .line 236
    const/16 v9, 0x11

    .line 237
    .line 238
    invoke-virtual {v13, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 239
    .line 240
    .line 241
    invoke-static {v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛳᛸᛴᛶ(Lcom/ss/android/ugc/awemes/MainActivity;)I

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 246
    .line 247
    .line 248
    const/16 v15, 0xc

    .line 249
    .line 250
    invoke-virtual {v0, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    invoke-virtual {v0, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 255
    .line 256
    .line 257
    move-result v9

    .line 258
    invoke-virtual {v13, v14, v4, v14, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 259
    .line 260
    .line 261
    const/16 v4, 0x30

    .line 262
    .line 263
    invoke-virtual {v0, v4}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    invoke-virtual {v13, v4}, Landroid/view/View;->setMinimumHeight(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᲈᲈᲁ()Landroid/graphics/drawable/GradientDrawable;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-virtual {v13, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 275
    .line 276
    .line 277
    new-instance v4, Landroid/widget/LinearLayout;

    .line 278
    .line 279
    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 283
    .line 284
    .line 285
    sget-object v9, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 286
    .line 287
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v16

    .line 295
    const/16 v12, 0xa

    .line 296
    .line 297
    if-eqz v16, :cond_1

    .line 298
    .line 299
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v16

    .line 303
    move-object/from16 v2, v16

    .line 304
    .line 305
    check-cast v2, Lyyds/ᛵᛱᛷᛳ;

    .line 306
    .line 307
    new-instance v10, Lyyds/ᲁᲈᛸᛲ;

    .line 308
    .line 309
    invoke-direct {v10, v0, v8, v13}, Lyyds/ᲁᲈᛸᛲ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;Ljava/util/ArrayList;Landroid/widget/TextView;)V

    .line 310
    .line 311
    .line 312
    new-instance v7, Landroid/widget/LinearLayout;

    .line 313
    .line 314
    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v7, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    invoke-virtual {v0, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 328
    .line 329
    .line 330
    move-result v14

    .line 331
    move-object/from16 v17, v9

    .line 332
    .line 333
    invoke-virtual {v0, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    invoke-virtual {v0, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 338
    .line 339
    .line 340
    move-result v15

    .line 341
    invoke-virtual {v7, v11, v14, v9, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 342
    .line 343
    .line 344
    const/4 v9, 0x1

    .line 345
    invoke-virtual {v7, v9}, Landroid/view/View;->setClickable(Z)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v7, v9}, Landroid/view/View;->setFocusable(Z)V

    .line 349
    .line 350
    .line 351
    const v9, 0x6606004a

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    new-instance v11, Landroid/widget/FrameLayout;

    .line 359
    .line 360
    invoke-direct {v11, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 361
    .line 362
    .line 363
    new-instance v14, Landroid/view/ViewGroup$LayoutParams;

    .line 364
    .line 365
    const/16 v15, 0x34

    .line 366
    .line 367
    invoke-virtual {v0, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 368
    .line 369
    .line 370
    move-result v12

    .line 371
    invoke-virtual {v0, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 372
    .line 373
    .line 374
    move-result v15

    .line 375
    invoke-direct {v14, v12, v15}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v11, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 379
    .line 380
    .line 381
    const/4 v12, 0x0

    .line 382
    invoke-virtual {v11, v12}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 383
    .line 384
    .line 385
    new-instance v14, Landroid/view/View;

    .line 386
    .line 387
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 388
    .line 389
    .line 390
    move-result-object v15

    .line 391
    invoke-direct {v14, v15}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 392
    .line 393
    .line 394
    iget v15, v2, Lyyds/ᛵᛱᛷᛳ;->ᛲᛴᛳᛲ:I

    .line 395
    .line 396
    move-object/from16 v19, v1

    .line 397
    .line 398
    move-object/from16 v18, v3

    .line 399
    .line 400
    const/16 v3, 0xc

    .line 401
    .line 402
    invoke-virtual {v0, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    const/4 v3, 0x0

    .line 407
    invoke-static {v15, v1, v3, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v14, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 412
    .line 413
    .line 414
    const v1, 0x3f59999a    # 0.85f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v14, v1}, Landroid/view/View;->setAlpha(F)V

    .line 418
    .line 419
    .line 420
    const/high16 v1, -0x3f400000    # -6.0f

    .line 421
    .line 422
    invoke-virtual {v14, v1}, Landroid/view/View;->setRotation(F)V

    .line 423
    .line 424
    .line 425
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 426
    .line 427
    const/16 v3, 0x26

    .line 428
    .line 429
    invoke-virtual {v0, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 430
    .line 431
    .line 432
    move-result v12

    .line 433
    invoke-virtual {v0, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 434
    .line 435
    .line 436
    move-result v15

    .line 437
    invoke-direct {v1, v12, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 438
    .line 439
    .line 440
    const/16 v12, 0x8

    .line 441
    .line 442
    invoke-virtual {v0, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 443
    .line 444
    .line 445
    move-result v12

    .line 446
    iput v12, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 447
    .line 448
    const/16 v12, 0x9

    .line 449
    .line 450
    invoke-virtual {v0, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 451
    .line 452
    .line 453
    move-result v12

    .line 454
    iput v12, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 455
    .line 456
    invoke-virtual {v14, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v11, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 460
    .line 461
    .line 462
    new-instance v1, Landroid/view/View;

    .line 463
    .line 464
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 465
    .line 466
    .line 467
    move-result-object v12

    .line 468
    invoke-direct {v1, v12}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 469
    .line 470
    .line 471
    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    .line 472
    .line 473
    sget-object v14, Landroid/graphics/drawable/GradientDrawable$Orientation;->TL_BR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 474
    .line 475
    iget v15, v2, Lyyds/ᛵᛱᛷᛳ;->ᲇᲈᛵᛷ:I

    .line 476
    .line 477
    const v3, 0x3ee66666    # 0.45f

    .line 478
    .line 479
    .line 480
    move-object/from16 v20, v5

    .line 481
    .line 482
    const/4 v5, -0x1

    .line 483
    invoke-static {v15, v5, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    filled-new-array {v15, v3}, [I

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    invoke-direct {v12, v14, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 492
    .line 493
    .line 494
    const/16 v3, 0xc

    .line 495
    .line 496
    invoke-virtual {v0, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 497
    .line 498
    .line 499
    move-result v5

    .line 500
    invoke-virtual {v12, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 504
    .line 505
    .line 506
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 507
    .line 508
    const/16 v5, 0x26

    .line 509
    .line 510
    invoke-virtual {v0, v5}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 511
    .line 512
    .line 513
    move-result v12

    .line 514
    invoke-virtual {v0, v5}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    invoke-direct {v3, v12, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 525
    .line 526
    .line 527
    new-instance v1, Landroid/view/View;

    .line 528
    .line 529
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    invoke-direct {v1, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 534
    .line 535
    .line 536
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 537
    .line 538
    sget-object v5, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 539
    .line 540
    const/high16 v12, 0x3e800000    # 0.25f

    .line 541
    .line 542
    invoke-static {v15, v9, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 543
    .line 544
    .line 545
    move-result v12

    .line 546
    filled-new-array {v12, v9}, [I

    .line 547
    .line 548
    .line 549
    move-result-object v9

    .line 550
    invoke-direct {v3, v5, v9}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 551
    .line 552
    .line 553
    const/16 v5, 0xb

    .line 554
    .line 555
    invoke-virtual {v0, v5}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 556
    .line 557
    .line 558
    move-result v9

    .line 559
    invoke-virtual {v3, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 563
    .line 564
    .line 565
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 566
    .line 567
    const/16 v9, 0x24

    .line 568
    .line 569
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 570
    .line 571
    .line 572
    move-result v12

    .line 573
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 574
    .line 575
    .line 576
    move-result v9

    .line 577
    invoke-direct {v3, v12, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 578
    .line 579
    .line 580
    const/4 v9, 0x1

    .line 581
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 582
    .line 583
    .line 584
    move-result v12

    .line 585
    iput v12, v3, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 586
    .line 587
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 588
    .line 589
    .line 590
    move-result v12

    .line 591
    iput v12, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 592
    .line 593
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 597
    .line 598
    .line 599
    new-instance v1, Landroid/view/View;

    .line 600
    .line 601
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    invoke-direct {v1, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 606
    .line 607
    .line 608
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 609
    .line 610
    const v9, 0x3ecccccd    # 0.4f

    .line 611
    .line 612
    .line 613
    const/4 v12, -0x1

    .line 614
    invoke-static {v15, v12, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 615
    .line 616
    .line 617
    move-result v9

    .line 618
    filled-new-array {v15, v9}, [I

    .line 619
    .line 620
    .line 621
    move-result-object v9

    .line 622
    invoke-direct {v3, v14, v9}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 623
    .line 624
    .line 625
    const/4 v9, 0x1

    .line 626
    invoke-virtual {v3, v9}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 630
    .line 631
    .line 632
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 633
    .line 634
    const/16 v9, 0xe

    .line 635
    .line 636
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 637
    .line 638
    .line 639
    move-result v12

    .line 640
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 641
    .line 642
    .line 643
    move-result v9

    .line 644
    invoke-direct {v3, v12, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 645
    .line 646
    .line 647
    const/16 v9, 0xc

    .line 648
    .line 649
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 650
    .line 651
    .line 652
    move-result v12

    .line 653
    iput v12, v3, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 654
    .line 655
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 656
    .line 657
    .line 658
    move-result v12

    .line 659
    iput v12, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 660
    .line 661
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v7, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 668
    .line 669
    .line 670
    new-instance v1, Landroid/widget/LinearLayout;

    .line 671
    .line 672
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 673
    .line 674
    .line 675
    const/4 v3, 0x1

    .line 676
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 677
    .line 678
    .line 679
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 680
    .line 681
    const/4 v12, 0x0

    .line 682
    const/high16 v14, 0x3f800000    # 1.0f

    .line 683
    .line 684
    const/4 v15, -0x2

    .line 685
    invoke-direct {v11, v12, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 689
    .line 690
    .line 691
    move-result v12

    .line 692
    iput v12, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 693
    .line 694
    invoke-virtual {v1, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 695
    .line 696
    .line 697
    new-instance v11, Landroid/widget/TextView;

    .line 698
    .line 699
    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 700
    .line 701
    .line 702
    iget-object v12, v2, Lyyds/ᛵᛱᛷᛳ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 703
    .line 704
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 705
    .line 706
    .line 707
    const/high16 v12, 0x41700000    # 15.0f

    .line 708
    .line 709
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 710
    .line 711
    .line 712
    sget-object v12, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 713
    .line 714
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 715
    .line 716
    .line 717
    const v14, 0x660600f4

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0, v14}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 721
    .line 722
    .line 723
    move-result v15

    .line 724
    invoke-virtual {v11, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 728
    .line 729
    .line 730
    new-instance v11, Landroid/widget/TextView;

    .line 731
    .line 732
    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 733
    .line 734
    .line 735
    iget-object v15, v2, Lyyds/ᛵᛱᛷᛳ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 736
    .line 737
    invoke-virtual {v11, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 738
    .line 739
    .line 740
    const/high16 v15, 0x41300000    # 11.0f

    .line 741
    .line 742
    invoke-virtual {v11, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 743
    .line 744
    .line 745
    const v15, 0x66060102

    .line 746
    .line 747
    .line 748
    invoke-virtual {v0, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 749
    .line 750
    .line 751
    move-result v3

    .line 752
    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 753
    .line 754
    .line 755
    const/4 v3, 0x2

    .line 756
    invoke-virtual {v0, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 757
    .line 758
    .line 759
    move-result v3

    .line 760
    const/4 v9, 0x0

    .line 761
    invoke-virtual {v11, v9, v3, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 768
    .line 769
    .line 770
    new-instance v1, Landroid/widget/TextView;

    .line 771
    .line 772
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 773
    .line 774
    .line 775
    const/high16 v3, 0x41500000    # 13.0f

    .line 776
    .line 777
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 781
    .line 782
    .line 783
    const/16 v3, 0x11

    .line 784
    .line 785
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 786
    .line 787
    .line 788
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 789
    .line 790
    const/16 v11, 0x18

    .line 791
    .line 792
    invoke-virtual {v0, v11}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 793
    .line 794
    .line 795
    move-result v12

    .line 796
    invoke-virtual {v0, v11}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 797
    .line 798
    .line 799
    move-result v11

    .line 800
    invoke-direct {v9, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 807
    .line 808
    .line 809
    new-instance v9, Lyyds/ᛶᛵᛷᛷ;

    .line 810
    .line 811
    invoke-direct {v9, v7, v1, v2}, Lyyds/ᛶᛵᛷᛷ;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Lyyds/ᛵᛱᛷᛳ;)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛸᛸᛷᛱ(Lyyds/ᛶᛵᛷᛷ;)V

    .line 815
    .line 816
    .line 817
    new-instance v1, Lyyds/ᛵᲀᲈᛴ;

    .line 818
    .line 819
    invoke-direct {v1, v10, v2, v7, v5}, Lyyds/ᛵᲀᲈᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v7, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 829
    .line 830
    const/4 v2, -0x2

    .line 831
    const/4 v5, -0x1

    .line 832
    invoke-direct {v1, v5, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 833
    .line 834
    .line 835
    const/16 v2, 0xa

    .line 836
    .line 837
    invoke-virtual {v0, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 838
    .line 839
    .line 840
    move-result v2

    .line 841
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 842
    .line 843
    iget-object v2, v9, Lyyds/ᛶᛵᛷᛷ;->ᛲᲈᲁ:Landroid/widget/LinearLayout;

    .line 844
    .line 845
    invoke-virtual {v4, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 846
    .line 847
    .line 848
    move v10, v14

    .line 849
    move v12, v15

    .line 850
    move-object/from16 v9, v17

    .line 851
    .line 852
    move-object/from16 v3, v18

    .line 853
    .line 854
    move-object/from16 v1, v19

    .line 855
    .line 856
    move-object/from16 v5, v20

    .line 857
    .line 858
    const/4 v7, 0x1

    .line 859
    const/16 v11, 0x10

    .line 860
    .line 861
    const/4 v14, 0x0

    .line 862
    const/16 v15, 0xc

    .line 863
    .line 864
    goto/16 :goto_0

    .line 865
    .line 866
    :cond_1
    move-object/from16 v19, v1

    .line 867
    .line 868
    move-object/from16 v18, v3

    .line 869
    .line 870
    move-object/from16 v20, v5

    .line 871
    .line 872
    const/4 v2, -0x2

    .line 873
    const/4 v5, -0x1

    .line 874
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 875
    .line 876
    invoke-direct {v1, v5, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 877
    .line 878
    .line 879
    const/16 v3, 0x10

    .line 880
    .line 881
    invoke-virtual {v0, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 882
    .line 883
    .line 884
    move-result v3

    .line 885
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 886
    .line 887
    invoke-virtual {v6, v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 888
    .line 889
    .line 890
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 891
    .line 892
    invoke-direct {v1, v5, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 893
    .line 894
    .line 895
    const/4 v2, 0x4

    .line 896
    invoke-virtual {v0, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 897
    .line 898
    .line 899
    move-result v2

    .line 900
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 901
    .line 902
    invoke-virtual {v6, v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 903
    .line 904
    .line 905
    new-instance v1, Lyyds/ᛵᲀᲈᛴ;

    .line 906
    .line 907
    move-object/from16 v2, v19

    .line 908
    .line 909
    move-object/from16 v3, v20

    .line 910
    .line 911
    const/16 v5, 0xa

    .line 912
    .line 913
    invoke-direct {v1, v3, v0, v2, v5}, Lyyds/ᛵᲀᲈᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v13, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 917
    .line 918
    .line 919
    new-instance v1, Lyyds/ᛳᲇᛶ;

    .line 920
    .line 921
    move-object/from16 v5, v18

    .line 922
    .line 923
    invoke-direct {v1, v3, v0, v5}, Lyyds/ᛳᲇᛶ;-><init>(Lyyds/ᛶᲀᲈᛷ;Lcom/ss/android/ugc/awemes/MainActivity;Lyyds/ᛵᛱᛷᛳ;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v2, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v2, v6}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    if-eqz v1, :cond_2

    .line 940
    .line 941
    const v9, 0x6606004a

    .line 942
    .line 943
    .line 944
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 945
    .line 946
    .line 947
    move-result v2

    .line 948
    const/16 v11, 0x18

    .line 949
    .line 950
    invoke-virtual {v0, v11}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 951
    .line 952
    .line 953
    move-result v3

    .line 954
    const/4 v5, 0x0

    .line 955
    const/4 v12, 0x0

    .line 956
    invoke-static {v2, v3, v5, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 961
    .line 962
    .line 963
    goto :goto_1

    .line 964
    :cond_2
    const/4 v12, 0x0

    .line 965
    :goto_1
    const/4 v1, 0x0

    .line 966
    invoke-virtual {v6, v1}, Landroid/view/View;->setAlpha(F)V

    .line 967
    .line 968
    .line 969
    const/16 v9, 0x24

    .line 970
    .line 971
    invoke-virtual {v0, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 972
    .line 973
    .line 974
    move-result v2

    .line 975
    invoke-virtual {v6, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 979
    .line 980
    .line 981
    move-result-object v2

    .line 982
    const/high16 v14, 0x3f800000    # 1.0f

    .line 983
    .line 984
    invoke-virtual {v2, v14}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 985
    .line 986
    .line 987
    move-result-object v2

    .line 988
    invoke-virtual {v2, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 989
    .line 990
    .line 991
    move-result-object v2

    .line 992
    const-wide/16 v5, 0x118

    .line 993
    .line 994
    invoke-virtual {v2, v5, v6}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    new-instance v3, Landroid/view/animation/OvershootInterpolator;

    .line 999
    .line 1000
    const v5, 0x3f333333    # 0.7f

    .line 1001
    .line 1002
    .line 1003
    invoke-direct {v3, v5}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v2

    .line 1010
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1014
    .line 1015
    .line 1016
    move-result v2

    .line 1017
    move v14, v12

    .line 1018
    :goto_2
    if-ge v14, v2, :cond_3

    .line 1019
    .line 1020
    invoke-virtual {v4, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v3

    .line 1024
    invoke-virtual {v3, v1}, Landroid/view/View;->setAlpha(F)V

    .line 1025
    .line 1026
    .line 1027
    const/16 v5, 0x2a

    .line 1028
    .line 1029
    invoke-virtual {v0, v5}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 1030
    .line 1031
    .line 1032
    move-result v5

    .line 1033
    invoke-virtual {v3, v5}, Landroid/view/View;->setTranslationX(F)V

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v3

    .line 1040
    const/high16 v5, 0x3f800000    # 1.0f

    .line 1041
    .line 1042
    invoke-virtual {v3, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v3

    .line 1046
    invoke-virtual {v3, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v3

    .line 1050
    const-wide/16 v6, 0x3c

    .line 1051
    .line 1052
    int-to-long v8, v14

    .line 1053
    mul-long/2addr v8, v6

    .line 1054
    const-wide/16 v6, 0x8c

    .line 1055
    .line 1056
    add-long/2addr v8, v6

    .line 1057
    invoke-virtual {v3, v8, v9}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v3

    .line 1061
    const-wide/16 v6, 0x140

    .line 1062
    .line 1063
    invoke-virtual {v3, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v3

    .line 1067
    new-instance v6, Landroid/view/animation/OvershootInterpolator;

    .line 1068
    .line 1069
    const v7, 0x3f4ccccd    # 0.8f

    .line 1070
    .line 1071
    .line 1072
    invoke-direct {v6, v7}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v3, v6}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v3

    .line 1079
    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1080
    .line 1081
    .line 1082
    add-int/lit8 v14, v14, 0x1

    .line 1083
    .line 1084
    goto :goto_2

    .line 1085
    :cond_3
    return-void

    .line 1086
    nop

    .line 1087
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
