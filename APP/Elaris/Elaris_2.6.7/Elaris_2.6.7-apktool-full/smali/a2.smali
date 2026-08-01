.class public final La2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, La2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, La2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, La2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La2;->a:I

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/high16 v3, 0x41400000    # 12.0f

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    const/16 v5, 0xf5

    .line 11
    .line 12
    const-string v6, "\u6b63\u5728\u52a0\u8f7d"

    .line 13
    .line 14
    const/high16 v7, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const/high16 v8, 0x41000000    # 8.0f

    .line 17
    .line 18
    iget-object v9, v0, La2;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v0, v0, La2;->b:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v11, 0x1

    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object v13, v0

    .line 28
    check-cast v13, Le2;

    .line 29
    .line 30
    move-object v14, v9

    .line 31
    check-cast v14, Ll1;

    .line 32
    .line 33
    iget-object v0, v13, Le2;->b:Landroid/app/Activity;

    .line 34
    .line 35
    iget-object v1, v14, Ll1;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_0

    .line 42
    .line 43
    const-string v1, "\u8868\u60c5\u9884\u89c8"

    .line 44
    .line 45
    :cond_0
    invoke-static {v0, v1, v6}, Lg2;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ly;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v6, v1, Ly;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v6, Landroid/app/Dialog;

    .line 52
    .line 53
    iget-object v1, v1, Ly;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Landroid/widget/LinearLayout;

    .line 56
    .line 57
    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    move-object/from16 v17, v9

    .line 62
    .line 63
    check-cast v17, Landroid/widget/TextView;

    .line 64
    .line 65
    new-instance v9, Landroid/widget/ImageView;

    .line 66
    .line 67
    invoke-direct {v9, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    sget-object v12, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 71
    .line 72
    invoke-virtual {v9, v12}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 73
    .line 74
    .line 75
    const/16 v12, 0xf4

    .line 76
    .line 77
    const/16 v15, 0xf8

    .line 78
    .line 79
    invoke-static {v12, v5, v15}, Landroid/graphics/Color;->rgb(III)I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    const/high16 v12, 0x41200000    # 10.0f

    .line 84
    .line 85
    invoke-static {v0, v12}, Lg2;->g(Landroid/content/Context;F)I

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    invoke-static {v5, v12, v10, v10}, Lg2;->n(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v9, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 94
    .line 95
    .line 96
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 97
    .line 98
    const/high16 v12, 0x437a0000    # 250.0f

    .line 99
    .line 100
    invoke-static {v0, v12}, Lg2;->g(Landroid/content/Context;F)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    invoke-direct {v5, v4, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    iput v3, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 112
    .line 113
    invoke-virtual {v1, v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    .line 115
    .line 116
    new-instance v3, Landroid/widget/LinearLayout;

    .line 117
    .line 118
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 122
    .line 123
    .line 124
    const-string v2, "\u4e3e\u62a5"

    .line 125
    .line 126
    invoke-static {v0, v2}, Lg2;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const-string v4, "\u5173\u95ed"

    .line 131
    .line 132
    invoke-static {v0, v4}, Lg2;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    const-string v5, "\u53d1\u9001"

    .line 137
    .line 138
    invoke-static {v0, v5}, Lg2;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 143
    .line 144
    const/high16 v12, 0x42280000    # 42.0f

    .line 145
    .line 146
    invoke-static {v0, v12}, Lg2;->g(Landroid/content/Context;F)I

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    invoke-direct {v15, v10, v11, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v2, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 154
    .line 155
    .line 156
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 157
    .line 158
    invoke-static {v0, v12}, Lg2;->g(Landroid/content/Context;F)I

    .line 159
    .line 160
    .line 161
    move-result v15

    .line 162
    invoke-direct {v11, v10, v15, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v8}, Lg2;->g(Landroid/content/Context;F)I

    .line 166
    .line 167
    .line 168
    move-result v15

    .line 169
    iput v15, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 170
    .line 171
    invoke-virtual {v3, v4, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 172
    .line 173
    .line 174
    iget-object v11, v13, Le2;->d:Lpd;

    .line 175
    .line 176
    if-eqz v11, :cond_1

    .line 177
    .line 178
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 179
    .line 180
    invoke-static {v0, v12}, Lg2;->g(Landroid/content/Context;F)I

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    invoke-direct {v11, v10, v12, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 185
    .line 186
    .line 187
    invoke-static {v0, v8}, Lg2;->g(Landroid/content/Context;F)I

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    iput v7, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 192
    .line 193
    invoke-virtual {v3, v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 194
    .line 195
    .line 196
    :cond_1
    invoke-static {v0}, Lg2;->c(Landroid/content/Context;)Landroid/widget/LinearLayout$LayoutParams;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-virtual {v1, v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 201
    .line 202
    .line 203
    new-instance v1, Lq1;

    .line 204
    .line 205
    const/4 v3, 0x2

    .line 206
    invoke-direct {v1, v6, v3}, Lq1;-><init>(Landroid/app/Dialog;I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    .line 211
    .line 212
    new-instance v1, Lr1;

    .line 213
    .line 214
    const/4 v4, 0x1

    .line 215
    invoke-direct {v1, v6, v13, v14, v4}, Lr1;-><init>(Landroid/app/Dialog;Le2;Ll1;I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    .line 220
    .line 221
    new-instance v1, Lr1;

    .line 222
    .line 223
    invoke-direct {v1, v6, v13, v14, v3}, Lr1;-><init>(Landroid/app/Dialog;Le2;Ll1;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 227
    .line 228
    .line 229
    new-instance v1, Lv1;

    .line 230
    .line 231
    invoke-direct {v1, v9}, Lv1;-><init>(Landroid/widget/ImageView;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v6, v0}, Lg2;->p(Landroid/app/Dialog;Landroid/app/Activity;)V

    .line 238
    .line 239
    .line 240
    const/high16 v1, 0x437a0000    # 250.0f

    .line 241
    .line 242
    invoke-static {v0, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 243
    .line 244
    .line 245
    move-result v15

    .line 246
    sget-object v0, Lg2;->c:Ljava/util/concurrent/ExecutorService;

    .line 247
    .line 248
    new-instance v12, Lw1;

    .line 249
    .line 250
    move-object/from16 v16, v6

    .line 251
    .line 252
    move-object/from16 v18, v9

    .line 253
    .line 254
    invoke-direct/range {v12 .. v18}, Lw1;-><init>(Le2;Ll1;ILandroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v0, v12}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 258
    .line 259
    .line 260
    const/16 v19, 0x1

    .line 261
    .line 262
    return v19

    .line 263
    :pswitch_0
    const-string v1, "cloud_sticker_panel"

    .line 264
    .line 265
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-nez v1, :cond_2

    .line 270
    .line 271
    goto/16 :goto_3

    .line 272
    .line 273
    :cond_2
    const/4 v1, 0x0

    .line 274
    if-nez p1, :cond_3

    .line 275
    .line 276
    move-object v11, v1

    .line 277
    goto :goto_0

    .line 278
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    :goto_0
    instance-of v12, v11, Landroid/content/ContextWrapper;

    .line 283
    .line 284
    if-eqz v12, :cond_6

    .line 285
    .line 286
    instance-of v12, v11, Landroid/app/Activity;

    .line 287
    .line 288
    if-eqz v12, :cond_4

    .line 289
    .line 290
    move-object v1, v11

    .line 291
    check-cast v1, Landroid/app/Activity;

    .line 292
    .line 293
    goto :goto_2

    .line 294
    :cond_4
    move-object v12, v11

    .line 295
    check-cast v12, Landroid/content/ContextWrapper;

    .line 296
    .line 297
    invoke-virtual {v12}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 298
    .line 299
    .line 300
    move-result-object v12

    .line 301
    if-ne v12, v11, :cond_5

    .line 302
    .line 303
    goto :goto_1

    .line 304
    :cond_5
    move-object v11, v12

    .line 305
    goto :goto_0

    .line 306
    :cond_6
    :goto_1
    instance-of v12, v11, Landroid/app/Activity;

    .line 307
    .line 308
    if-eqz v12, :cond_7

    .line 309
    .line 310
    move-object v1, v11

    .line 311
    check-cast v1, Landroid/app/Activity;

    .line 312
    .line 313
    :cond_7
    :goto_2
    if-nez v1, :cond_8

    .line 314
    .line 315
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    :cond_8
    move-object v13, v1

    .line 320
    if-nez v13, :cond_9

    .line 321
    .line 322
    goto/16 :goto_3

    .line 323
    .line 324
    :cond_9
    check-cast v9, Landroid/view/ViewGroup;

    .line 325
    .line 326
    invoke-static {v13, v9}, Lcom/mr/elaris/w;->q(Landroid/app/Activity;Landroid/view/View;)Lpd;

    .line 327
    .line 328
    .line 329
    move-result-object v15

    .line 330
    move-object v14, v0

    .line 331
    check-cast v14, Ljava/lang/ClassLoader;

    .line 332
    .line 333
    new-instance v12, Landroid/app/Dialog;

    .line 334
    .line 335
    invoke-direct {v12, v13}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 336
    .line 337
    .line 338
    new-instance v0, Landroid/widget/LinearLayout;

    .line 339
    .line 340
    invoke-direct {v0, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 341
    .line 342
    .line 343
    const/4 v1, 0x1

    .line 344
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 345
    .line 346
    .line 347
    const/high16 v1, 0x41600000    # 14.0f

    .line 348
    .line 349
    invoke-static {v13, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 350
    .line 351
    .line 352
    move-result v9

    .line 353
    invoke-static {v13, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 354
    .line 355
    .line 356
    move-result v11

    .line 357
    invoke-static {v13, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    invoke-static {v13, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 362
    .line 363
    .line 364
    move-result v5

    .line 365
    invoke-virtual {v0, v9, v11, v1, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 366
    .line 367
    .line 368
    const/high16 v1, 0x41800000    # 16.0f

    .line 369
    .line 370
    invoke-static {v13, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    invoke-static {v4, v1, v10, v10}, Lg2;->n(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 379
    .line 380
    .line 381
    new-instance v1, Landroid/widget/LinearLayout;

    .line 382
    .line 383
    invoke-direct {v1, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 387
    .line 388
    .line 389
    const/16 v5, 0x19

    .line 390
    .line 391
    const/16 v9, 0x1e

    .line 392
    .line 393
    const/16 v11, 0x17

    .line 394
    .line 395
    invoke-static {v11, v5, v9}, Landroid/graphics/Color;->rgb(III)I

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    const-string v9, "\u4e91\u7aef\u8868\u60c5"

    .line 400
    .line 401
    const/16 v11, 0x13

    .line 402
    .line 403
    invoke-static {v13, v9, v11, v5}, Lg2;->q(Landroid/content/Context;Ljava/lang/String;II)Landroid/widget/TextView;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 408
    .line 409
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 410
    .line 411
    .line 412
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 413
    .line 414
    const/4 v11, -0x2

    .line 415
    invoke-direct {v9, v10, v11, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1, v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 419
    .line 420
    .line 421
    const-string v5, "\u4e0a\u4f20"

    .line 422
    .line 423
    invoke-static {v13, v5}, Lg2;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 428
    .line 429
    const/high16 v4, 0x42800000    # 64.0f

    .line 430
    .line 431
    invoke-static {v13, v4}, Lg2;->g(Landroid/content/Context;F)I

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    const/high16 v11, 0x42100000    # 36.0f

    .line 436
    .line 437
    invoke-static {v13, v11}, Lg2;->g(Landroid/content/Context;F)I

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    invoke-direct {v9, v4, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 448
    .line 449
    .line 450
    new-instance v1, Landroid/widget/LinearLayout;

    .line 451
    .line 452
    invoke-direct {v1, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 456
    .line 457
    .line 458
    invoke-static {v13, v8}, Lg2;->g(Landroid/content/Context;F)I

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    const/high16 v7, 0x40c00000    # 6.0f

    .line 463
    .line 464
    invoke-static {v13, v7}, Lg2;->g(Landroid/content/Context;F)I

    .line 465
    .line 466
    .line 467
    move-result v7

    .line 468
    invoke-virtual {v1, v10, v4, v10, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 469
    .line 470
    .line 471
    new-instance v4, Landroid/widget/EditText;

    .line 472
    .line 473
    invoke-direct {v4, v13}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 474
    .line 475
    .line 476
    const/4 v7, 0x1

    .line 477
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 478
    .line 479
    .line 480
    const-string v9, "\u641c\u7d22\u8868\u60c5"

    .line 481
    .line 482
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 483
    .line 484
    .line 485
    const/high16 v9, 0x41700000    # 15.0f

    .line 486
    .line 487
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 488
    .line 489
    .line 490
    invoke-static {v13, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 491
    .line 492
    .line 493
    move-result v9

    .line 494
    invoke-static {v13, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    invoke-virtual {v4, v9, v10, v3, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 499
    .line 500
    .line 501
    const/16 v3, 0xf6

    .line 502
    .line 503
    const/16 v9, 0xf9

    .line 504
    .line 505
    const/16 v7, 0xf5

    .line 506
    .line 507
    invoke-static {v7, v3, v9}, Landroid/graphics/Color;->rgb(III)I

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    const/high16 v7, 0x41100000    # 9.0f

    .line 512
    .line 513
    invoke-static {v13, v7}, Lg2;->g(Landroid/content/Context;F)I

    .line 514
    .line 515
    .line 516
    move-result v7

    .line 517
    invoke-static {v3, v7, v10, v10}, Lg2;->n(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    invoke-virtual {v4, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 522
    .line 523
    .line 524
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 525
    .line 526
    const/high16 v7, 0x42180000    # 38.0f

    .line 527
    .line 528
    invoke-static {v13, v7}, Lg2;->g(Landroid/content/Context;F)I

    .line 529
    .line 530
    .line 531
    move-result v9

    .line 532
    const/high16 v11, 0x3f800000    # 1.0f

    .line 533
    .line 534
    invoke-direct {v3, v10, v9, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 538
    .line 539
    .line 540
    const-string v3, "\u641c\u7d22"

    .line 541
    .line 542
    invoke-static {v13, v3}, Lg2;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 547
    .line 548
    const/high16 v11, 0x42780000    # 62.0f

    .line 549
    .line 550
    invoke-static {v13, v11}, Lg2;->g(Landroid/content/Context;F)I

    .line 551
    .line 552
    .line 553
    move-result v11

    .line 554
    invoke-static {v13, v7}, Lg2;->g(Landroid/content/Context;F)I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    invoke-direct {v9, v11, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 559
    .line 560
    .line 561
    invoke-static {v13, v8}, Lg2;->g(Landroid/content/Context;F)I

    .line 562
    .line 563
    .line 564
    move-result v2

    .line 565
    iput v2, v9, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 566
    .line 567
    invoke-virtual {v1, v3, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 571
    .line 572
    .line 573
    new-instance v1, Landroid/widget/HorizontalScrollView;

    .line 574
    .line 575
    invoke-direct {v1, v13}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1, v10}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 579
    .line 580
    .line 581
    new-instance v2, Landroid/widget/LinearLayout;

    .line 582
    .line 583
    invoke-direct {v2, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 587
    .line 588
    .line 589
    const/16 v9, 0x10

    .line 590
    .line 591
    invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 592
    .line 593
    .line 594
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 595
    .line 596
    const/4 v10, -0x2

    .line 597
    const/4 v11, -0x1

    .line 598
    invoke-direct {v9, v10, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1, v2, v9}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 602
    .line 603
    .line 604
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 605
    .line 606
    invoke-static {v13, v7}, Lg2;->g(Landroid/content/Context;F)I

    .line 607
    .line 608
    .line 609
    move-result v7

    .line 610
    invoke-direct {v9, v11, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v0, v1, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 614
    .line 615
    .line 616
    if-nez v15, :cond_a

    .line 617
    .line 618
    const-string v6, "\u672a\u8bc6\u522b\u5f53\u524d\u4f1a\u8bdd\uff0c\u53ef\u6d4f\u89c8\u4f46\u65e0\u6cd5\u53d1\u9001"

    .line 619
    .line 620
    :cond_a
    const/16 v1, 0x70

    .line 621
    .line 622
    const/16 v7, 0x7a

    .line 623
    .line 624
    const/16 v9, 0x6c

    .line 625
    .line 626
    invoke-static {v9, v1, v7}, Landroid/graphics/Color;->rgb(III)I

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    const/16 v7, 0xd

    .line 631
    .line 632
    invoke-static {v13, v6, v7, v1}, Lg2;->q(Landroid/content/Context;Ljava/lang/String;II)Landroid/widget/TextView;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    invoke-static {v13, v8}, Lg2;->g(Landroid/content/Context;F)I

    .line 637
    .line 638
    .line 639
    move-result v6

    .line 640
    const/4 v7, 0x0

    .line 641
    invoke-virtual {v1, v7, v7, v7, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 645
    .line 646
    .line 647
    new-instance v6, Landroid/widget/ScrollView;

    .line 648
    .line 649
    invoke-direct {v6, v13}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 650
    .line 651
    .line 652
    new-instance v8, Landroid/widget/GridLayout;

    .line 653
    .line 654
    invoke-direct {v8, v13}, Landroid/widget/GridLayout;-><init>(Landroid/content/Context;)V

    .line 655
    .line 656
    .line 657
    const/4 v9, 0x5

    .line 658
    invoke-virtual {v8, v9}, Landroid/widget/GridLayout;->setColumnCount(I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v8, v7}, Landroid/widget/GridLayout;->setAlignmentMode(I)V

    .line 662
    .line 663
    .line 664
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 665
    .line 666
    const/4 v10, -0x2

    .line 667
    const/4 v11, -0x1

    .line 668
    invoke-direct {v7, v11, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v6, v8, v7}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 672
    .line 673
    .line 674
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 675
    .line 676
    const/high16 v9, 0x438c0000    # 280.0f

    .line 677
    .line 678
    invoke-static {v13, v9}, Lg2;->g(Landroid/content/Context;F)I

    .line 679
    .line 680
    .line 681
    move-result v9

    .line 682
    invoke-direct {v7, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    if-eqz v0, :cond_b

    .line 696
    .line 697
    const v6, 0x106000d

    .line 698
    .line 699
    .line 700
    invoke-virtual {v0, v6}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 704
    .line 705
    .line 706
    move-result-object v6

    .line 707
    const/high16 v7, 0x43c70000    # 398.0f

    .line 708
    .line 709
    invoke-static {v13, v7}, Lg2;->g(Landroid/content/Context;F)I

    .line 710
    .line 711
    .line 712
    move-result v7

    .line 713
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 714
    .line 715
    .line 716
    move-result-object v9

    .line 717
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 718
    .line 719
    .line 720
    move-result-object v9

    .line 721
    iget v9, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 722
    .line 723
    const/high16 v10, 0x42100000    # 36.0f

    .line 724
    .line 725
    invoke-static {v13, v10}, Lg2;->g(Landroid/content/Context;F)I

    .line 726
    .line 727
    .line 728
    move-result v10

    .line 729
    sub-int/2addr v9, v10

    .line 730
    invoke-static {v7, v9}, Ljava/lang/Math;->min(II)I

    .line 731
    .line 732
    .line 733
    move-result v7

    .line 734
    iput v7, v6, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 735
    .line 736
    const/4 v10, -0x2

    .line 737
    iput v10, v6, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 738
    .line 739
    const/16 v7, 0x11

    .line 740
    .line 741
    iput v7, v6, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 742
    .line 743
    invoke-virtual {v0, v6}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 744
    .line 745
    .line 746
    :cond_b
    new-instance v11, Le2;

    .line 747
    .line 748
    move-object/from16 v18, v1

    .line 749
    .line 750
    move-object/from16 v17, v2

    .line 751
    .line 752
    move-object/from16 v16, v8

    .line 753
    .line 754
    invoke-direct/range {v11 .. v18}, Le2;-><init>(Landroid/app/Dialog;Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Landroid/widget/GridLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 755
    .line 756
    .line 757
    new-instance v0, Lb2;

    .line 758
    .line 759
    const/4 v7, 0x0

    .line 760
    invoke-direct {v0, v11, v4, v7}, Lb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 764
    .line 765
    .line 766
    new-instance v0, Lse;

    .line 767
    .line 768
    invoke-direct {v0, v13, v14, v15, v11}, Lse;-><init>(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Le2;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12}, Landroid/app/Dialog;->show()V

    .line 775
    .line 776
    .line 777
    const-string v0, ""

    .line 778
    .line 779
    invoke-static {v11, v0}, Lg2;->j(Le2;Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    const/4 v10, 0x1

    .line 783
    :goto_3
    return v10

    .line 784
    nop

    .line 785
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
