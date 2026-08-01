.class public final Lc2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld2;Ly;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc2;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc2;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lc2;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lc2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Lc2;->a:I

    iput-object p1, p0, Lc2;->b:Ljava/lang/Object;

    iput-object p2, p0, Lc2;->c:Ljava/lang/Object;

    iput-object p3, p0, Lc2;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lc2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lc2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, [Z

    .line 11
    .line 12
    iget-object v3, p0, Lc2;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lw6;

    .line 15
    .line 16
    invoke-virtual {v3}, Lw6;->b()V

    .line 17
    .line 18
    .line 19
    aput-boolean v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    :catchall_0
    iget-object p0, p0, Lc2;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    sget-object v0, Lj4;->e:Lg4;

    .line 30
    .line 31
    iget-object v1, p0, Lc2;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lg4;

    .line 34
    .line 35
    if-eq v0, v1, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-static {v1}, Lj4;->d(Lg4;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lc2;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Li4;

    .line 44
    .line 45
    iget-object v0, v0, Li4;->f:Lh4;

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    sget-object v0, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    iget-object v1, p0, Lc2;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lc2;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Li4;

    .line 61
    .line 62
    iget-object v0, v0, Li4;->c:Landroid/widget/EditText;

    .line 63
    .line 64
    iget-object v1, p0, Lc2;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    new-instance v2, Lq;

    .line 76
    .line 77
    const/4 v3, 0x5

    .line 78
    invoke-direct {v2, v0, v1, v3}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 82
    .line 83
    .line 84
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v1, "favorite emoticon batch official send not captured token="

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lc2;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v1, " object="

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    iget-object p0, p0, Lc2;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p0, Li4;

    .line 106
    .line 107
    iget-object p0, p0, Li4;->b:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-static {p0}, Lj4;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Lj4;->u(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    :goto_1
    return-void

    .line 124
    :pswitch_1
    iget-object v0, p0, Lc2;->c:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Ljava/util/ArrayList;

    .line 127
    .line 128
    iget-object v3, p0, Lc2;->d:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v3, Ld2;

    .line 131
    .line 132
    iget-object v4, v3, Ld2;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Le2;

    .line 135
    .line 136
    iget-object v5, v4, Le2;->a:Landroid/app/Dialog;

    .line 137
    .line 138
    invoke-virtual {v5}, Landroid/app/Dialog;->isShowing()Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_8

    .line 143
    .line 144
    iget v3, v3, Ld2;->b:I

    .line 145
    .line 146
    iget v5, v4, Le2;->j:I

    .line 147
    .line 148
    if-eq v3, v5, :cond_3

    .line 149
    .line 150
    goto/16 :goto_6

    .line 151
    .line 152
    :cond_3
    iget-object p0, p0, Lc2;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Ly;

    .line 155
    .line 156
    iget-object p0, p0, Ly;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p0, Ljava/util/ArrayList;

    .line 159
    .line 160
    sget-object v3, Lg2;->a:Ljava/util/Set;

    .line 161
    .line 162
    iget-object v3, v4, Le2;->f:Landroid/widget/LinearLayout;

    .line 163
    .line 164
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 165
    .line 166
    .line 167
    const-string v3, "\u5168\u90e8"

    .line 168
    .line 169
    const-string v5, ""

    .line 170
    .line 171
    invoke-static {v4, v3, v5}, Lg2;->d(Le2;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    move v3, v1

    .line 175
    :goto_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-ge v3, v5, :cond_4

    .line 180
    .line 181
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    check-cast v5, Lk1;

    .line 186
    .line 187
    iget-object v6, v5, Lk1;->b:Ljava/lang/String;

    .line 188
    .line 189
    iget-object v5, v5, Lk1;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {v4, v6, v5}, Lg2;->d(Le2;Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    add-int/lit8 v3, v3, 0x1

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_4
    iget-object p0, v4, Le2;->g:Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_5

    .line 204
    .line 205
    const-string v3, "\u6682\u65e0\u5ba1\u6838\u901a\u8fc7\u7684\u8868\u60c5"

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_5
    sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    const-string v6, "\u5171 %d \u4e2a\uff0c\u70b9\u51fb\u53d1\u9001\uff0c\u957f\u6309\u9884\u89c8"

    .line 223
    .line 224
    invoke-static {v3, v6, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    :goto_3
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    move p0, v1

    .line 232
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-ge p0, v3, :cond_8

    .line 237
    .line 238
    iget-object v3, v4, Le2;->b:Landroid/app/Activity;

    .line 239
    .line 240
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    check-cast v5, Ll1;

    .line 245
    .line 246
    new-instance v6, Landroid/widget/LinearLayout;

    .line 247
    .line 248
    invoke-direct {v6, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v6, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v6, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 255
    .line 256
    .line 257
    const/high16 v7, 0x40000000    # 2.0f

    .line 258
    .line 259
    invoke-static {v3, v7}, Lg2;->g(Landroid/content/Context;F)I

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    const/high16 v9, 0x40400000    # 3.0f

    .line 264
    .line 265
    invoke-static {v3, v9}, Lg2;->g(Landroid/content/Context;F)I

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    invoke-static {v3, v7}, Lg2;->g(Landroid/content/Context;F)I

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    const/high16 v10, 0x40a00000    # 5.0f

    .line 274
    .line 275
    invoke-static {v3, v10}, Lg2;->g(Landroid/content/Context;F)I

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    invoke-virtual {v6, v8, v9, v7, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 280
    .line 281
    .line 282
    new-instance v7, Landroid/widget/ImageView;

    .line 283
    .line 284
    invoke-direct {v7, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 285
    .line 286
    .line 287
    sget-object v8, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 288
    .line 289
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 290
    .line 291
    .line 292
    const/16 v8, 0xf5

    .line 293
    .line 294
    const/16 v9, 0xf8

    .line 295
    .line 296
    const/16 v10, 0xf4

    .line 297
    .line 298
    invoke-static {v10, v8, v9}, Landroid/graphics/Color;->rgb(III)I

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    const/high16 v9, 0x41000000    # 8.0f

    .line 303
    .line 304
    invoke-static {v3, v9}, Lg2;->g(Landroid/content/Context;F)I

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    invoke-static {v8, v9, v1, v1}, Lg2;->n(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    invoke-virtual {v7, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 313
    .line 314
    .line 315
    const/high16 v8, 0x42580000    # 54.0f

    .line 316
    .line 317
    invoke-static {v3, v8}, Lg2;->g(Landroid/content/Context;F)I

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 322
    .line 323
    invoke-direct {v9, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6, v7, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 327
    .line 328
    .line 329
    iget-object v9, v5, Ll1;->b:Ljava/lang/String;

    .line 330
    .line 331
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    if-nez v9, :cond_6

    .line 336
    .line 337
    iget-object v9, v5, Ll1;->b:Ljava/lang/String;

    .line 338
    .line 339
    const/16 v10, 0x54

    .line 340
    .line 341
    const/16 v11, 0x5d

    .line 342
    .line 343
    const/16 v12, 0x50

    .line 344
    .line 345
    invoke-static {v12, v10, v11}, Landroid/graphics/Color;->rgb(III)I

    .line 346
    .line 347
    .line 348
    move-result v10

    .line 349
    const/16 v11, 0xc

    .line 350
    .line 351
    invoke-static {v3, v9, v11, v10}, Lg2;->q(Landroid/content/Context;Ljava/lang/String;II)Landroid/widget/TextView;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 356
    .line 357
    .line 358
    const/16 v10, 0x11

    .line 359
    .line 360
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 361
    .line 362
    .line 363
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 364
    .line 365
    const/high16 v11, 0x41a00000    # 20.0f

    .line 366
    .line 367
    invoke-static {v3, v11}, Lg2;->g(Landroid/content/Context;F)I

    .line 368
    .line 369
    .line 370
    move-result v11

    .line 371
    const/4 v12, -0x1

    .line 372
    invoke-direct {v10, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v6, v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 376
    .line 377
    .line 378
    :cond_6
    new-instance v9, Landroid/widget/GridLayout$LayoutParams;

    .line 379
    .line 380
    invoke-direct {v9}, Landroid/widget/GridLayout$LayoutParams;-><init>()V

    .line 381
    .line 382
    .line 383
    const/high16 v10, 0x42840000    # 66.0f

    .line 384
    .line 385
    invoke-static {v3, v10}, Lg2;->g(Landroid/content/Context;F)I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    iput v3, v9, Landroid/widget/GridLayout$LayoutParams;->width:I

    .line 390
    .line 391
    const/4 v3, -0x2

    .line 392
    iput v3, v9, Landroid/widget/GridLayout$LayoutParams;->height:I

    .line 393
    .line 394
    div-int/lit8 v3, p0, 0x5

    .line 395
    .line 396
    invoke-static {v3}, Landroid/widget/GridLayout;->spec(I)Landroid/widget/GridLayout$Spec;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    iput-object v3, v9, Landroid/widget/GridLayout$LayoutParams;->rowSpec:Landroid/widget/GridLayout$Spec;

    .line 401
    .line 402
    rem-int/lit8 v3, p0, 0x5

    .line 403
    .line 404
    invoke-static {v3}, Landroid/widget/GridLayout;->spec(I)Landroid/widget/GridLayout$Spec;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    iput-object v3, v9, Landroid/widget/GridLayout$LayoutParams;->columnSpec:Landroid/widget/GridLayout$Spec;

    .line 409
    .line 410
    iget-object v3, v4, Le2;->e:Landroid/widget/GridLayout;

    .line 411
    .line 412
    invoke-virtual {v3, v6, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 413
    .line 414
    .line 415
    new-instance v3, Lb2;

    .line 416
    .line 417
    invoke-direct {v3, v4, v5, v2}, Lb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v6, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 421
    .line 422
    .line 423
    new-instance v3, La2;

    .line 424
    .line 425
    invoke-direct {v3, v4, v5, v2}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v6, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 429
    .line 430
    .line 431
    sget-object v3, Lg2;->e:Ljava/util/Map;

    .line 432
    .line 433
    iget-object v6, v5, Ll1;->a:Ljava/lang/String;

    .line 434
    .line 435
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    check-cast v3, Landroid/graphics/Bitmap;

    .line 440
    .line 441
    if-eqz v3, :cond_7

    .line 442
    .line 443
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 444
    .line 445
    .line 446
    move-result v6

    .line 447
    if-nez v6, :cond_7

    .line 448
    .line 449
    invoke-virtual {v7, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 450
    .line 451
    .line 452
    goto :goto_5

    .line 453
    :cond_7
    sget-object v3, Lg2;->c:Ljava/util/concurrent/ExecutorService;

    .line 454
    .line 455
    new-instance v6, Ld2;

    .line 456
    .line 457
    invoke-direct {v6, v5, v8, v4, v7}, Ld2;-><init>(Ll1;ILe2;Landroid/widget/ImageView;)V

    .line 458
    .line 459
    .line 460
    invoke-interface {v3, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 461
    .line 462
    .line 463
    :goto_5
    add-int/lit8 p0, p0, 0x1

    .line 464
    .line 465
    goto/16 :goto_4

    .line 466
    .line 467
    :cond_8
    :goto_6
    return-void

    .line 468
    nop

    .line 469
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
