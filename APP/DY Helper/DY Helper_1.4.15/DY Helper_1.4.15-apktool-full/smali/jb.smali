.class public final synthetic Ljb;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(ILandroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput p1, p0, Ljb;->ε:I

    iput-object p2, p0, Ljb;->ζ:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    iput v0, p0, Ljb;->ε:I

    .line 4
    .line 5
    sget-object v0, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ljb;->ζ:Landroid/view/View;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 15
    iput p2, p0, Ljb;->ε:I

    iput-object p1, p0, Ljb;->ζ:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltg;Landroid/view/View;)V
    .locals 0

    .line 13
    const/16 p1, 0x10

    iput p1, p0, Ljb;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ljb;->ζ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Ljb;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x4

    .line 7
    sget-object v5, Ls62;->α:Ls62;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x3

    .line 11
    iget-object p0, p0, Ljb;->ζ:Landroid/view/View;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-static {p0}, Lqr1;->α(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    :try_start_0
    invoke-static {p0}, La01;->α(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    new-instance v5, Leo1;

    .line 28
    .line 29
    invoke-direct {v5, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "\u9644\u7740\u6807\u9898 View \u5931\u8d25: "

    .line 43
    .line 44
    const-string v1, "rbe3d87ed96de26de"

    .line 45
    .line 46
    invoke-static {v0, p0, v1}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void

    .line 50
    :pswitch_1
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iput v6, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 63
    .line 64
    iput v6, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 65
    .line 66
    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    move-object v1, v0

    .line 71
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 72
    .line 73
    invoke-virtual {v1, v6, v6, v6, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void

    .line 80
    :pswitch_2
    invoke-static {p0}, Lcp0;->α(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_3
    invoke-static {p0}, Lcp0;->α(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_4
    sget-object v0, Lxk0;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 89
    .line 90
    instance-of v0, p0, Landroid/widget/ImageView;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    move-object v0, p0

    .line 95
    check-cast v0, Landroid/widget/ImageView;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    instance-of v3, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 104
    .line 105
    if-eqz v3, :cond_3

    .line 106
    .line 107
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    invoke-static {v0}, Lxk0;->α(Landroid/graphics/Bitmap;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :goto_1
    if-eqz v0, :cond_7

    .line 123
    .line 124
    const-class v3, Landroid/view/View;

    .line 125
    .line 126
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-nez v3, :cond_7

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-static {v3}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    :catchall_1
    :cond_4
    :goto_2
    invoke-virtual {v3}, Lτ;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_6

    .line 145
    .line 146
    invoke-virtual {v3}, Lτ;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    check-cast v4, Ljava/lang/reflect/Field;

    .line 151
    .line 152
    :try_start_1
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    instance-of v5, v4, Landroid/graphics/Bitmap;

    .line 160
    .line 161
    if-eqz v5, :cond_5

    .line 162
    .line 163
    check-cast v4, Landroid/graphics/Bitmap;

    .line 164
    .line 165
    invoke-static {v4}, Lxk0;->α(Landroid/graphics/Bitmap;)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_5
    instance-of v5, v4, Landroid/graphics/drawable/Drawable;

    .line 170
    .line 171
    if-eqz v5, :cond_4

    .line 172
    .line 173
    check-cast v4, Landroid/graphics/drawable/Drawable;

    .line 174
    .line 175
    instance-of v5, v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 176
    .line 177
    if-eqz v5, :cond_4

    .line 178
    .line 179
    check-cast v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 180
    .line 181
    invoke-virtual {v4}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    if-eqz v4, :cond_4

    .line 186
    .line 187
    invoke-static {v4}, Lxk0;->α(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    goto :goto_1

    .line 196
    :cond_7
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    sget-object v2, Lxk0;->δ:Ljava/util/LinkedHashSet;

    .line 201
    .line 202
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-nez v3, :cond_a

    .line 211
    .line 212
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    const/16 v4, 0x64

    .line 217
    .line 218
    if-le v3, v4, :cond_a

    .line 219
    .line 220
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-le v3, v4, :cond_a

    .line 225
    .line 226
    :try_start_2
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 227
    .line 228
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_8

    .line 233
    .line 234
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    invoke-static {v1, v4, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    new-instance v3, Landroid/graphics/Canvas;

    .line 247
    .line 248
    invoke-direct {v3, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    int-to-float v4, v4

    .line 256
    neg-float v4, v4

    .line 257
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    int-to-float v5, v5

    .line 262
    neg-float v5, v5

    .line 263
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 267
    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_8
    const-string p0, "View needs to be laid out before calling drawToBitmap()"

    .line 271
    .line 272
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    :goto_3
    if-eqz v1, :cond_9

    .line 276
    .line 277
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    if-nez p0, :cond_9

    .line 282
    .line 283
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 284
    .line 285
    .line 286
    move-result p0

    .line 287
    const/16 v3, 0xc8

    .line 288
    .line 289
    if-lt p0, v3, :cond_9

    .line 290
    .line 291
    invoke-static {v1}, Lxk0;->β(Landroid/graphics/Bitmap;)Z

    .line 292
    .line 293
    .line 294
    move-result p0

    .line 295
    if-nez p0, :cond_9

    .line 296
    .line 297
    invoke-static {v1}, Lxk0;->α(Landroid/graphics/Bitmap;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-interface {v2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_9
    if-eqz v1, :cond_a

    .line 309
    .line 310
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 311
    .line 312
    .line 313
    :catchall_2
    :cond_a
    :goto_4
    return-void

    .line 314
    :pswitch_5
    :try_start_3
    invoke-static {p0}, Lri0;->α(Landroid/view/View;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 315
    .line 316
    .line 317
    goto :goto_5

    .line 318
    :catchall_3
    move-exception p0

    .line 319
    new-instance v5, Leo1;

    .line 320
    .line 321
    invoke-direct {v5, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    :goto_5
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    if-eqz p0, :cond_b

    .line 329
    .line 330
    const-string v0, "rbb4637c919e2110c"

    .line 331
    .line 332
    const-string v1, "\u6ce8\u5165\u6d88\u606f\u9875\u4f1a\u8bdd\u5220\u9664\u6309\u94ae\u5931\u8d25"

    .line 333
    .line 334
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 335
    .line 336
    .line 337
    :cond_b
    return-void

    .line 338
    :pswitch_6
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 339
    .line 340
    invoke-static {p0}, Lah0;->Χ(Landroid/view/View;)V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :pswitch_7
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    if-eqz v0, :cond_d

    .line 355
    .line 356
    iput v6, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 357
    .line 358
    iput v6, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 359
    .line 360
    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 361
    .line 362
    if-eqz v1, :cond_c

    .line 363
    .line 364
    move-object v1, v0

    .line 365
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 366
    .line 367
    invoke-virtual {v1, v6, v6, v6, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 368
    .line 369
    .line 370
    :cond_c
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 371
    .line 372
    .line 373
    :cond_d
    return-void

    .line 374
    :pswitch_8
    sget-object v0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 375
    .line 376
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/γ;->й(Landroid/view/View;)V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :pswitch_9
    invoke-static {p0}, Loh;->α(Landroid/view/View;)V

    .line 381
    .line 382
    .line 383
    return-void

    .line 384
    :pswitch_a
    sget-object v0, Lug;->α:Ltg;

    .line 385
    .line 386
    invoke-static {p0}, Ltg;->а(Landroid/view/View;)Ljava/lang/Integer;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    if-eqz v1, :cond_e

    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    invoke-static {v2}, Ltg;->Ρ(I)Z

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-eqz v2, :cond_e

    .line 401
    .line 402
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    invoke-virtual {v0, p0, v1, v6}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 407
    .line 408
    .line 409
    :cond_e
    invoke-static {}, Ltg;->д()V

    .line 410
    .line 411
    .line 412
    return-void

    .line 413
    :pswitch_b
    sget-object v0, Lug;->α:Ltg;

    .line 414
    .line 415
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    if-nez v1, :cond_f

    .line 428
    .line 429
    sget-object v0, Lug;->κ:Landroid/os/Handler;

    .line 430
    .line 431
    new-instance v1, Ljb;

    .line 432
    .line 433
    const/16 v2, 0x11

    .line 434
    .line 435
    invoke-direct {v1, p0, v2}, Ljb;-><init>(Landroid/view/View;I)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 439
    .line 440
    .line 441
    goto :goto_6

    .line 442
    :cond_f
    invoke-virtual {v0, p0, v2}, Ltg;->Φ(Landroid/view/View;Z)V

    .line 443
    .line 444
    .line 445
    :goto_6
    return-void

    .line 446
    :pswitch_c
    const v0, 0x7f0deaea

    .line 447
    .line 448
    .line 449
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-eqz v0, :cond_10

    .line 457
    .line 458
    invoke-static {p0}, Ltg;->γ(Landroid/view/View;)V

    .line 459
    .line 460
    .line 461
    :cond_10
    return-void

    .line 462
    :pswitch_d
    sget-object v0, Lug;->α:Ltg;

    .line 463
    .line 464
    invoke-static {p0}, Ltg;->γ(Landroid/view/View;)V

    .line 465
    .line 466
    .line 467
    return-void

    .line 468
    :pswitch_e
    sget-object v0, Lug;->α:Ltg;

    .line 469
    .line 470
    invoke-virtual {v0, p0}, Ltg;->ξ(Landroid/view/View;)V

    .line 471
    .line 472
    .line 473
    return-void

    .line 474
    :pswitch_f
    sget-object v0, Lug;->α:Ltg;

    .line 475
    .line 476
    invoke-virtual {v0, p0}, Ltg;->ν(Landroid/view/View;)V

    .line 477
    .line 478
    .line 479
    return-void

    .line 480
    :pswitch_10
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-eqz v0, :cond_11

    .line 485
    .line 486
    sget-object v0, Lug;->α:Ltg;

    .line 487
    .line 488
    const/4 v1, 0x2

    .line 489
    invoke-virtual {v0, p0, v1, v6}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 490
    .line 491
    .line 492
    :cond_11
    return-void

    .line 493
    :pswitch_11
    sget-object v0, Lug;->α:Ltg;

    .line 494
    .line 495
    invoke-virtual {v0, p0}, Ltg;->Υ(Landroid/view/View;)V

    .line 496
    .line 497
    .line 498
    return-void

    .line 499
    :pswitch_12
    invoke-static {p0, v7}, Lsb;->ε(Landroid/view/View;I)V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :pswitch_13
    invoke-static {p0, v7}, Lsb;->ε(Landroid/view/View;I)V

    .line 504
    .line 505
    .line 506
    return-void

    .line 507
    :pswitch_14
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    if-eqz v0, :cond_12

    .line 512
    .line 513
    invoke-static {p0}, Lsb;->ξ(Landroid/view/View;)V

    .line 514
    .line 515
    .line 516
    :cond_12
    return-void

    .line 517
    :pswitch_15
    sget-object v0, Lsb;->α:Lsb;

    .line 518
    .line 519
    invoke-static {p0}, Lsb;->δ(Landroid/view/View;)V

    .line 520
    .line 521
    .line 522
    return-void

    .line 523
    :pswitch_16
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 524
    .line 525
    .line 526
    move-result v0

    .line 527
    if-eqz v0, :cond_13

    .line 528
    .line 529
    invoke-static {p0, v7}, Lsb;->ε(Landroid/view/View;I)V

    .line 530
    .line 531
    .line 532
    :cond_13
    return-void

    .line 533
    :pswitch_17
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    if-eqz v0, :cond_14

    .line 538
    .line 539
    invoke-static {p0, v7}, Lsb;->ε(Landroid/view/View;I)V

    .line 540
    .line 541
    .line 542
    :cond_14
    return-void

    .line 543
    :pswitch_18
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-eqz v0, :cond_15

    .line 548
    .line 549
    invoke-static {p0}, Lsb;->ο(Landroid/view/View;)V

    .line 550
    .line 551
    .line 552
    :cond_15
    return-void

    .line 553
    :pswitch_19
    sget-object v0, Lsb;->α:Lsb;

    .line 554
    .line 555
    invoke-static {p0}, Lsb;->а(Landroid/view/View;)V

    .line 556
    .line 557
    .line 558
    invoke-static {}, Lsb;->β()V

    .line 559
    .line 560
    .line 561
    return-void

    .line 562
    :pswitch_1a
    sget-object v0, Lsb;->α:Lsb;

    .line 563
    .line 564
    invoke-static {p0}, Lsb;->а(Landroid/view/View;)V

    .line 565
    .line 566
    .line 567
    invoke-static {}, Lsb;->β()V

    .line 568
    .line 569
    .line 570
    return-void

    .line 571
    :pswitch_1b
    sget-object v0, Lsb;->α:Lsb;

    .line 572
    .line 573
    invoke-static {p0}, Lsb;->а(Landroid/view/View;)V

    .line 574
    .line 575
    .line 576
    invoke-static {}, Lsb;->β()V

    .line 577
    .line 578
    .line 579
    return-void

    .line 580
    :pswitch_1c
    invoke-static {p0, v7}, Lsb;->ε(Landroid/view/View;I)V

    .line 581
    .line 582
    .line 583
    return-void

    .line 584
    nop

    .line 585
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
