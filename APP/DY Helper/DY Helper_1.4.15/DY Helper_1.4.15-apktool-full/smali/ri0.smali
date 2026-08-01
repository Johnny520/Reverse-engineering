.class public final Lri0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lri0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static final α(Landroid/view/View;)V
    .locals 13

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    :goto_0
    move v0, v2

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-static {}, Lx9;->β()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const-string v0, "im_conversation_delete_entry_enabled"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_1
    if-nez v0, :cond_2

    .line 25
    .line 26
    goto/16 :goto_e

    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v3, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    :goto_2
    const/4 v4, 0x0

    .line 38
    if-eqz v0, :cond_6

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_6

    .line 45
    .line 46
    instance-of v5, v0, Landroid/app/Activity;

    .line 47
    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    check-cast v0, Landroid/app/Activity;

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_3
    instance-of v5, v0, Landroid/content/ContextWrapper;

    .line 54
    .line 55
    if-eqz v5, :cond_4

    .line 56
    .line 57
    check-cast v0, Landroid/content/ContextWrapper;

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move-object v0, v4

    .line 61
    :goto_3
    if-eqz v0, :cond_5

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_2

    .line 68
    :cond_5
    move-object v0, v4

    .line 69
    goto :goto_2

    .line 70
    :cond_6
    move-object v0, v4

    .line 71
    :goto_4
    if-nez v0, :cond_7

    .line 72
    .line 73
    goto/16 :goto_e

    .line 74
    .line 75
    :cond_7
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v3, :cond_21

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_8

    .line 86
    .line 87
    goto/16 :goto_e

    .line 88
    .line 89
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    instance-of v5, v3, Landroid/view/ViewGroup;

    .line 94
    .line 95
    if-eqz v5, :cond_9

    .line 96
    .line 97
    check-cast v3, Landroid/view/ViewGroup;

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_9
    move-object v3, v4

    .line 101
    :goto_5
    invoke-static {p0}, Lri0;->ζ(Landroid/view/View;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-static {v3}, Lri0;->ζ(Landroid/view/View;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    new-instance v6, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v7, "\u6807\u9898\u680f\u7ed3\u6784 root="

    .line 112
    .line 113
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v5, ", parent="

    .line 120
    .line 121
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    const-string v5, "rbb4637c919e2110c"

    .line 132
    .line 133
    invoke-static {v5, v3}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    new-instance v3, Ljava/util/ArrayList;

    .line 137
    .line 138
    const/4 v6, 0x2

    .line 139
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    .line 141
    .line 142
    instance-of v7, p0, Landroid/view/ViewGroup;

    .line 143
    .line 144
    if-eqz v7, :cond_a

    .line 145
    .line 146
    move-object v7, p0

    .line 147
    check-cast v7, Landroid/view/ViewGroup;

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_a
    move-object v7, v4

    .line 151
    :goto_6
    if-eqz v7, :cond_b

    .line 152
    .line 153
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    instance-of v8, v7, Landroid/view/ViewGroup;

    .line 161
    .line 162
    if-eqz v8, :cond_c

    .line 163
    .line 164
    check-cast v7, Landroid/view/ViewGroup;

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_c
    move-object v7, v4

    .line 168
    :goto_7
    if-eqz v7, :cond_d

    .line 169
    .line 170
    if-eq v7, p0, :cond_d

    .line 171
    .line 172
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-eqz v7, :cond_14

    .line 184
    .line 185
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    check-cast v7, Landroid/view/ViewGroup;

    .line 190
    .line 191
    instance-of v8, v7, Landroid/widget/FrameLayout;

    .line 192
    .line 193
    if-eqz v8, :cond_f

    .line 194
    .line 195
    sget-object v8, Lpi0;->ε:Lpi0;

    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_f
    instance-of v8, v7, Landroid/widget/RelativeLayout;

    .line 199
    .line 200
    if-eqz v8, :cond_10

    .line 201
    .line 202
    sget-object v8, Lpi0;->ζ:Lpi0;

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_10
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    new-instance v9, Lsh0;

    .line 210
    .line 211
    const/16 v10, 0x13

    .line 212
    .line 213
    invoke-direct {v9, v10}, Lsh0;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-static {v8, v9}, Lus1;->χ(Ljava/lang/Object;La80;)Lss1;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    invoke-interface {v8}, Lss1;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    :cond_11
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v9

    .line 228
    if-eqz v9, :cond_12

    .line 229
    .line 230
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    check-cast v9, Ljava/lang/Class;

    .line 235
    .line 236
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    const-string v10, "androidx.constraintlayout.widget.ConstraintLayout"

    .line 241
    .line 242
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    if-eqz v9, :cond_11

    .line 247
    .line 248
    sget-object v8, Lpi0;->η:Lpi0;

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_12
    instance-of v8, v7, Landroid/widget/LinearLayout;

    .line 252
    .line 253
    if-eqz v8, :cond_13

    .line 254
    .line 255
    move-object v8, v7

    .line 256
    check-cast v8, Landroid/widget/LinearLayout;

    .line 257
    .line 258
    invoke-virtual {v8}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-nez v8, :cond_13

    .line 263
    .line 264
    sget-object v8, Lpi0;->θ:Lpi0;

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_13
    move-object v8, v4

    .line 268
    :goto_8
    if-eqz v8, :cond_e

    .line 269
    .line 270
    new-instance v4, Ll91;

    .line 271
    .line 272
    invoke-direct {v4, v7, v8}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_14
    if-nez v4, :cond_15

    .line 276
    .line 277
    invoke-static {p0}, Lri0;->ε(Landroid/view/View;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    const-string v0, "\u6807\u9898\u680f\u6ca1\u6709\u53d7\u652f\u6301\u7684\u5bb9\u5668\uff0c\u8df3\u8fc7\u5165\u53e3\u6ce8\u5165\uff1bchildren="

    .line 282
    .line 283
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    invoke-static {v5, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :cond_15
    iget-object v3, v4, Ll91;->ε:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v3, Landroid/view/ViewGroup;

    .line 294
    .line 295
    iget-object v4, v4, Ll91;->ζ:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v4, Lpi0;

    .line 298
    .line 299
    const-string v7, "dyhelper_im_conversation_delete_entry"

    .line 300
    .line 301
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    if-eqz v8, :cond_16

    .line 306
    .line 307
    goto/16 :goto_e

    .line 308
    .line 309
    :cond_16
    invoke-static {p0, v3}, Lri0;->β(Landroid/view/View;Landroid/view/ViewGroup;)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    if-eqz v8, :cond_20

    .line 314
    .line 315
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result v8

    .line 319
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    sget-object v10, Lx01;->α:Lx01;

    .line 324
    .line 325
    invoke-virtual {v10, v0}, Lx01;->α(Landroid/content/Context;)Lw01;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    new-instance v11, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 330
    .line 331
    invoke-direct {v11, v0}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;)V

    .line 332
    .line 333
    .line 334
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 335
    .line 336
    .line 337
    move-result v12

    .line 338
    invoke-virtual {v11, v12}, Landroid/view/View;->setId(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v11, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    const-string v7, "\u6279\u91cf\u5220\u9664\u4f1a\u8bdd"

    .line 345
    .line 346
    invoke-virtual {v11, v7}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v11, v7}, Landroid/view/View;->setTooltipText(Ljava/lang/CharSequence;)V

    .line 350
    .line 351
    .line 352
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 353
    .line 354
    invoke-virtual {v11, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 355
    .line 356
    .line 357
    const/16 v7, 0xa

    .line 358
    .line 359
    invoke-static {v0, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 360
    .line 361
    .line 362
    move-result v7

    .line 363
    invoke-virtual {v11, v7, v7, v7, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 364
    .line 365
    .line 366
    iget-object v7, v10, Lw01;->α:Landroid/content/res/Resources;

    .line 367
    .line 368
    invoke-virtual {v10}, Lw01;->getTheme()Landroid/content/res/Resources$Theme;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    sget-object v12, Lwn1;->α:Ljava/lang/ThreadLocal;

    .line 373
    .line 374
    const v12, 0x7f08008b

    .line 375
    .line 376
    .line 377
    invoke-virtual {v7, v12, v10}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    invoke-virtual {v11, v7}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 382
    .line 383
    .line 384
    iget-boolean v7, v9, Lxx;->α:Z

    .line 385
    .line 386
    const/4 v10, -0x1

    .line 387
    if-eqz v7, :cond_17

    .line 388
    .line 389
    move v7, v10

    .line 390
    goto :goto_9

    .line 391
    :cond_17
    const/high16 v7, -0x1000000

    .line 392
    .line 393
    :goto_9
    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 394
    .line 395
    .line 396
    move-result-object v7

    .line 397
    invoke-virtual {v11, v7}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 398
    .line 399
    .line 400
    iget-object v7, v9, Lxx;->Α:Ljava/lang/String;

    .line 401
    .line 402
    invoke-static {v7}, Ljx0;->Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 403
    .line 404
    .line 405
    move-result-object v7

    .line 406
    invoke-virtual {v11, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 407
    .line 408
    .line 409
    new-instance v7, Loi0;

    .line 410
    .line 411
    invoke-direct {v7, v2}, Loi0;-><init>(I)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v11, v7}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 415
    .line 416
    .line 417
    new-instance v7, Lma0;

    .line 418
    .line 419
    invoke-direct {v7, v0, v1}, Lma0;-><init>(Landroid/app/Activity;I)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v11, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 423
    .line 424
    .line 425
    const/16 v7, 0x2c

    .line 426
    .line 427
    invoke-static {v0, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 432
    .line 433
    .line 434
    move-result v7

    .line 435
    if-eqz v7, :cond_1c

    .line 436
    .line 437
    if-eq v7, v1, :cond_1b

    .line 438
    .line 439
    if-eq v7, v6, :cond_19

    .line 440
    .line 441
    const/4 v1, 0x3

    .line 442
    if-ne v7, v1, :cond_18

    .line 443
    .line 444
    move-object v1, v3

    .line 445
    check-cast v1, Landroid/widget/LinearLayout;

    .line 446
    .line 447
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 448
    .line 449
    invoke-direct {v6, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 450
    .line 451
    .line 452
    const/16 v0, 0x10

    .line 453
    .line 454
    iput v0, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 455
    .line 456
    invoke-static {v1, p0}, Lri0;->η(Landroid/widget/LinearLayout;Landroid/view/View;)I

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    invoke-virtual {v1, v11, v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 461
    .line 462
    .line 463
    goto :goto_a

    .line 464
    :catchall_0
    move-exception v0

    .line 465
    goto :goto_b

    .line 466
    :cond_18
    new-instance v0, Lpm;

    .line 467
    .line 468
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 469
    .line 470
    .line 471
    throw v0

    .line 472
    :cond_19
    invoke-static {v3, v0, v8}, Lri0;->δ(Landroid/view/ViewGroup;II)Landroid/view/ViewGroup$LayoutParams;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    if-nez v0, :cond_1a

    .line 477
    .line 478
    move v0, v2

    .line 479
    goto :goto_d

    .line 480
    :cond_1a
    invoke-virtual {v3, v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 481
    .line 482
    .line 483
    goto :goto_a

    .line 484
    :cond_1b
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 485
    .line 486
    invoke-direct {v1, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 487
    .line 488
    .line 489
    const/16 v0, 0x15

    .line 490
    .line 491
    invoke-virtual {v1, v0, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 492
    .line 493
    .line 494
    const/16 v0, 0xf

    .line 495
    .line 496
    invoke-virtual {v1, v0, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v1, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v3, v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 503
    .line 504
    .line 505
    goto :goto_a

    .line 506
    :cond_1c
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 507
    .line 508
    const v6, 0x800015

    .line 509
    .line 510
    .line 511
    invoke-direct {v1, v0, v0, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v1, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v3, v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 518
    .line 519
    .line 520
    :goto_a
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 521
    .line 522
    goto :goto_c

    .line 523
    :goto_b
    new-instance v1, Leo1;

    .line 524
    .line 525
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 526
    .line 527
    .line 528
    move-object v0, v1

    .line 529
    :goto_c
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    if-eqz v1, :cond_1d

    .line 534
    .line 535
    new-instance v6, Ljava/lang/StringBuilder;

    .line 536
    .line 537
    const-string v7, "\u5411\u6807\u9898\u680f\u5bb9\u5668\u52a0\u5165\u5220\u9664\u6309\u94ae\u5931\u8d25 strategy="

    .line 538
    .line 539
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v6

    .line 549
    invoke-static {v5, v6, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 550
    .line 551
    .line 552
    :cond_1d
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 553
    .line 554
    instance-of v6, v0, Leo1;

    .line 555
    .line 556
    if-eqz v6, :cond_1e

    .line 557
    .line 558
    move-object v0, v1

    .line 559
    :cond_1e
    check-cast v0, Ljava/lang/Boolean;

    .line 560
    .line 561
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    :goto_d
    const-string v1, ", strategy="

    .line 566
    .line 567
    if-nez v0, :cond_1f

    .line 568
    .line 569
    invoke-static {v3}, Lri0;->ζ(Landroid/view/View;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    new-instance v0, Ljava/lang/StringBuilder;

    .line 574
    .line 575
    const-string v2, "\u6807\u9898\u680f\u6309\u94ae\u5e03\u5c40\u53c2\u6570\u521b\u5efa\u5931\u8d25\uff0c\u8df3\u8fc7\u5165\u53e3\u6ce8\u5165\uff1bparent="

    .line 576
    .line 577
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object p0

    .line 593
    invoke-static {v5, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    goto :goto_e

    .line 597
    :cond_1f
    new-instance v0, Lni0;

    .line 598
    .line 599
    invoke-direct {v0, p0, v3, v11, v4}, Lni0;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/appcompat/widget/AppCompatImageButton;Lpi0;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 603
    .line 604
    .line 605
    new-instance v0, Lqi0;

    .line 606
    .line 607
    invoke-direct {v0, v2, v3, v11}, Lqi0;-><init>(ILandroid/view/View;Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    move-result-object p0

    .line 617
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object p0

    .line 621
    new-instance v0, Ljava/lang/StringBuilder;

    .line 622
    .line 623
    const-string v2, "\u6d88\u606f\u9875\u4f1a\u8bdd\u5220\u9664\u5165\u53e3\u5df2\u6ce8\u5165 parent="

    .line 624
    .line 625
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    const-string p0, ", endMargin="

    .line 638
    .line 639
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object p0

    .line 649
    invoke-static {v5, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    goto :goto_e

    .line 653
    :cond_20
    invoke-static {p0}, Lri0;->ε(Landroid/view/View;)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object p0

    .line 657
    new-instance v0, Ljava/lang/StringBuilder;

    .line 658
    .line 659
    const-string v1, "\u6807\u9898\u680f\u53f3\u4fa7\u6ca1\u6709\u5b89\u5168\u7a7a\u4f4d\uff0c\u8df3\u8fc7\u5165\u53e3\u6ce8\u5165\uff1bstrategy="

    .line 660
    .line 661
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    const-string v1, ", children="

    .line 668
    .line 669
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object p0

    .line 679
    invoke-static {v5, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    :cond_21
    :goto_e
    return-void
.end method

.method public static β(Landroid/view/View;Landroid/view/ViewGroup;)Ljava/lang/Integer;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_7

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/16 v2, 0x2c

    .line 24
    .line 25
    invoke-static {v0, v2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p0, v2}, Lri0;->γ(Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x2

    .line 38
    new-array v4, v3, [I

    .line 39
    .line 40
    new-array v5, v3, [I

    .line 41
    .line 42
    invoke-virtual {p0, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 46
    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    aget v7, v4, v6

    .line 50
    .line 51
    aget v5, v5, v6

    .line 52
    .line 53
    sub-int/2addr v7, v5

    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    sub-int/2addr v5, v7

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    sub-int/2addr v5, v7

    .line 64
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-nez v7, :cond_1

    .line 73
    .line 74
    move-object v7, v1

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    check-cast v7, Landroid/view/View;

    .line 81
    .line 82
    new-array v8, v3, [I

    .line 83
    .line 84
    invoke-virtual {v7, v8}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 85
    .line 86
    .line 87
    aget v7, v8, v6

    .line 88
    .line 89
    aget v8, v4, v6

    .line 90
    .line 91
    sub-int/2addr v7, v8

    .line 92
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_3

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, Landroid/view/View;

    .line 107
    .line 108
    new-array v9, v3, [I

    .line 109
    .line 110
    invoke-virtual {v8, v9}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 111
    .line 112
    .line 113
    aget v8, v9, v6

    .line 114
    .line 115
    aget v9, v4, v6

    .line 116
    .line 117
    sub-int/2addr v8, v9

    .line 118
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-virtual {v7, v8}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-lez v9, :cond_2

    .line 127
    .line 128
    move-object v7, v8

    .line 129
    goto :goto_0

    .line 130
    :cond_3
    :goto_1
    if-eqz v7, :cond_4

    .line 131
    .line 132
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    sub-int/2addr v2, v0

    .line 137
    goto :goto_2

    .line 138
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    sub-int/2addr v2, v0

    .line 143
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    const/16 v7, 0xc

    .line 151
    .line 152
    invoke-static {v4, v7}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    sub-int/2addr v2, v4

    .line 157
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    div-int/2addr v4, v3

    .line 162
    if-ge v2, v4, :cond_5

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    add-int/2addr p0, v5

    .line 170
    sub-int/2addr p0, v2

    .line 171
    sub-int/2addr p0, v0

    .line 172
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    sub-int/2addr p1, v0

    .line 177
    if-gez p1, :cond_6

    .line 178
    .line 179
    move p1, v6

    .line 180
    :cond_6
    invoke-static {p0, v6, p1}, Lj81;->μ(III)I

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :cond_7
    :goto_3
    return-object v1
.end method

.method public static γ(Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "dyhelper_im_conversation_delete_entry"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    check-cast v0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    move v3, v1

    .line 34
    :goto_0
    if-ge v3, v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {v4, p1, p2}, Lri0;->γ(Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const/16 v2, 0x18

    .line 57
    .line 58
    invoke-static {v0, v2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/16 v3, 0x40

    .line 70
    .line 71
    invoke-static {v2, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    instance-of v3, p0, Landroid/widget/ImageView;

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-gt v0, v3, :cond_3

    .line 91
    .line 92
    if-gt v3, v2, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-gt v0, v3, :cond_3

    .line 99
    .line 100
    if-gt v3, v2, :cond_3

    .line 101
    .line 102
    const/4 v0, 0x2

    .line 103
    new-array v2, v0, [I

    .line 104
    .line 105
    new-array v3, v0, [I

    .line 106
    .line 107
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 111
    .line 112
    .line 113
    aget v3, v3, v1

    .line 114
    .line 115
    aget v1, v2, v1

    .line 116
    .line 117
    sub-int/2addr v3, v1

    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    div-int/2addr v1, v0

    .line 123
    add-int/2addr v1, v3

    .line 124
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    div-int/2addr p1, v0

    .line 129
    if-le v1, p1, :cond_3

    .line 130
    .line 131
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    :cond_3
    :goto_1
    return-void
.end method

.method public static δ(Landroid/view/ViewGroup;II)Landroid/view/ViewGroup$LayoutParams;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    new-instance v1, Lsh0;

    .line 7
    .line 8
    const/16 v2, 0x14

    .line 9
    .line 10
    invoke-direct {v1, v2}, Lsh0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1}, Lus1;->χ(Ljava/lang/Object;La80;)Lss1;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Lss1;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v2, v1

    .line 32
    check-cast v2, Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "androidx.constraintlayout.widget.ConstraintLayout"

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_1
    move-object v1, v0

    .line 51
    :goto_0
    check-cast v1, Ljava/lang/Class;

    .line 52
    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    array-length v1, p0

    .line 64
    const/4 v2, 0x0

    .line 65
    :goto_1
    if-ge v2, v1, :cond_4

    .line 66
    .line 67
    aget-object v3, p0, v2

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v5, "LayoutParams"

    .line 74
    .line 75
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    move-object v3, v0

    .line 86
    :goto_2
    if-nez v3, :cond_5

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_5
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 90
    .line 91
    filled-new-array {p0, p0}, [Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v3, p0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    instance-of p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 116
    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_6
    move-object p0, v0

    .line 123
    :goto_3
    if-nez p0, :cond_7

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_7
    const-string p1, "endToEnd"

    .line 127
    .line 128
    invoke-static {p0, p1}, Lri0;->ι(Landroid/view/ViewGroup$MarginLayoutParams;Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_9

    .line 133
    .line 134
    const-string p1, "rightToRight"

    .line 135
    .line 136
    invoke-static {p0, p1}, Lri0;->ι(Landroid/view/ViewGroup$MarginLayoutParams;Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_8
    :goto_4
    return-object v0

    .line 144
    :cond_9
    :goto_5
    const-string p1, "topToTop"

    .line 145
    .line 146
    invoke-static {p0, p1}, Lri0;->ι(Landroid/view/ViewGroup$MarginLayoutParams;Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    const-string p1, "bottomToBottom"

    .line 150
    .line 151
    invoke-static {p0, p1}, Lri0;->ι(Landroid/view/ViewGroup$MarginLayoutParams;Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    .line 156
    .line 157
    goto :goto_7

    .line 158
    :goto_6
    new-instance p1, Leo1;

    .line 159
    .line 160
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    move-object p0, p1

    .line 164
    :goto_7
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-eqz p1, :cond_a

    .line 169
    .line 170
    const-string p2, "rbb4637c919e2110c"

    .line 171
    .line 172
    const-string v1, "\u521b\u5efa\u5bbf\u4e3b ConstraintLayout.LayoutParams \u5931\u8d25"

    .line 173
    .line 174
    invoke-static {p2, v1, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    :cond_a
    instance-of p1, p0, Leo1;

    .line 178
    .line 179
    if-eqz p1, :cond_b

    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_b
    move-object v0, p0

    .line 183
    :goto_8
    check-cast v0, Landroid/view/ViewGroup$LayoutParams;

    .line 184
    .line 185
    return-object v0
.end method

.method public static ε(Landroid/view/View;)Ljava/lang/String;
    .locals 9

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    if-nez p0, :cond_1

    .line 10
    .line 11
    const-string p0, "none"

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v1, 0xc

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v1, v0}, Lj81;->Σ(II)Lxm0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v7, Lθ;

    .line 30
    .line 31
    const/16 v1, 0x15

    .line 32
    .line 33
    invoke-direct {v7, v1, p0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const/16 v8, 0x1e

    .line 37
    .line 38
    const-string v3, ";"

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-static/range {v2 .. v8}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-le v2, v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    const-string v0, ";...total="

    .line 58
    .line 59
    invoke-static {v1, v0, p0}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_3

    .line 69
    .line 70
    const-string p0, "empty"

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_3
    return-object v1
.end method

.method public static ζ(Landroid/view/View;)Ljava/lang/String;
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    check-cast v0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    const/4 v0, 0x0

    .line 24
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v2, "{id="

    .line 67
    .line 68
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v2, ",size="

    .line 75
    .line 76
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v2, "x"

    .line 83
    .line 84
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v2, ",lp="

    .line 91
    .line 92
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v1, ",children="

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v0, "}"

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method

.method public static η(Landroid/widget/LinearLayout;Landroid/view/View;)I
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p1, v0}, Lri0;->γ(Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    :goto_0
    move-object p1, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v2, v0

    .line 35
    check-cast v2, Landroid/view/View;

    .line 36
    .line 37
    const/4 v3, 0x2

    .line 38
    new-array v4, v3, [I

    .line 39
    .line 40
    invoke-virtual {v2, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 41
    .line 42
    .line 43
    aget v2, v4, v1

    .line 44
    .line 45
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    move-object v5, v4

    .line 50
    check-cast v5, Landroid/view/View;

    .line 51
    .line 52
    new-array v6, v3, [I

    .line 53
    .line 54
    invoke-virtual {v5, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 55
    .line 56
    .line 57
    aget v5, v6, v1

    .line 58
    .line 59
    if-le v2, v5, :cond_3

    .line 60
    .line 61
    move-object v0, v4

    .line 62
    move v2, v5

    .line 63
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :goto_1
    check-cast p1, Landroid/view/View;

    .line 71
    .line 72
    if-nez p1, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0

    .line 79
    :cond_4
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    instance-of v0, v0, Landroid/view/View;

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eq v0, p0, :cond_5

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    check-cast p1, Landroid/view/View;

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-eq v0, p0, :cond_6

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    return p0

    .line 114
    :cond_6
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-gez p0, :cond_7

    .line 119
    .line 120
    return v1

    .line 121
    :cond_7
    return p0
.end method

.method public static θ(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE655A148DE001A79FAC0ED051157FAA8B5C21A4618C1376FF67C513D2B9EA171EDDC206E1AAC617F550EF8436AABAFC"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p0, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lf10;

    .line 16
    .line 17
    const/16 v1, 0x1c

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lf10;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const-class v1, Landroid/view/View;

    .line 23
    .line 24
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "onViewCreated"

    .line 29
    .line 30
    invoke-static {p0, v1, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 31
    .line 32
    .line 33
    const-string p0, "rbb4637c919e2110c"

    .line 34
    .line 35
    const-string v0, "\u5df2\u5b89\u88c5 TitleBarUI \u4f1a\u8bdd\u5220\u9664\u5165\u53e3"

    .line 36
    .line 37
    invoke-static {p0, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/ClassNotFoundException;

    .line 42
    .line 43
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p0, v0}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method public static ι(Landroid/view/ViewGroup$MarginLayoutParams;Ljava/lang/String;)Z
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    new-instance p1, Leo1;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object p0, p1

    .line 23
    :goto_0
    instance-of p0, p0, Leo1;

    .line 24
    .line 25
    xor-int/lit8 p0, p0, 0x1

    .line 26
    .line 27
    return p0
.end method
