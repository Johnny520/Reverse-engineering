.class public final synthetic Lr0/F1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/F1;->b:I

    iput-object p1, p0, Lr0/F1;->c:Ljava/lang/Object;

    iput-object p2, p0, Lr0/F1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    const-string p1, "listAdapter"

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, -0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, Lr0/F1;->b:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lr0/F1;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lo0/b;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lo0/b;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Lr0/F1;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, LN0/l;

    .line 23
    .line 24
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    check-cast p1, Landroid/app/AlertDialog;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    const-string p1, "dialog"

    .line 35
    .line 36
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v2

    .line 40
    :pswitch_0
    new-instance p1, Ls0/B;

    .line 41
    .line 42
    iget-object v0, p0, Lr0/F1;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LN0/l;

    .line 45
    .line 46
    iget-object v1, p0, Lr0/F1;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ls0/J;

    .line 49
    .line 50
    const/4 v2, 0x3

    .line 51
    invoke-direct {p1, v2, v0, v1}, Ls0/B;-><init>(ILN0/l;Ls0/J;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ls0/J;->P(LM0/a;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_1
    iget-object p1, p0, Lr0/F1;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Ls0/J;

    .line 61
    .line 62
    iget-object v0, p0, Lr0/F1;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Landroid/widget/TextView;

    .line 65
    .line 66
    invoke-static {p1, v0}, Ls0/J;->p(Ls0/J;Landroid/widget/TextView;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_2
    iget-object v3, p0, Lr0/F1;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v3, Ls0/p;

    .line 73
    .line 74
    iget v3, v3, Ln0/a;->b:I

    .line 75
    .line 76
    iget-object v4, p0, Lr0/F1;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Li/t;

    .line 79
    .line 80
    if-ltz v3, :cond_c

    .line 81
    .line 82
    iget-object v5, v4, Li/t;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, Ls0/g;

    .line 85
    .line 86
    if-eqz v5, :cond_b

    .line 87
    .line 88
    iget-object v5, v5, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-lt v3, v5, :cond_2

    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :cond_2
    iget-object v5, v4, Li/t;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, Ls0/g;

    .line 101
    .line 102
    if-eqz v5, :cond_a

    .line 103
    .line 104
    iget-object p1, v5, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 105
    .line 106
    invoke-virtual {p1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    check-cast p1, Ls0/o;

    .line 111
    .line 112
    if-nez p1, :cond_3

    .line 113
    .line 114
    goto/16 :goto_3

    .line 115
    .line 116
    :cond_3
    iget-object v3, p1, Ls0/o;->c:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-nez v5, :cond_4

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    move-object v3, v2

    .line 126
    :goto_0
    if-eqz v3, :cond_5

    .line 127
    .line 128
    new-instance v5, Ljava/io/File;

    .line 129
    .line 130
    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    move-object v5, v2

    .line 135
    :goto_1
    if-eqz v5, :cond_9

    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-nez v3, :cond_6

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-static {v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    if-nez v3, :cond_7

    .line 153
    .line 154
    const-string p1, "\u9884\u89c8\u56fe\u8bfb\u53d6\u5931\u8d25"

    .line 155
    .line 156
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    new-instance v5, Landroid/widget/ImageView;

    .line 161
    .line 162
    iget-object v4, v4, Li/t;->a:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v4, Landroid/app/Activity;

    .line 165
    .line 166
    invoke-direct {v5, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 167
    .line 168
    .line 169
    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    .line 170
    .line 171
    const/4 v7, -0x2

    .line 172
    invoke-direct {v6, v1, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 179
    .line 180
    .line 181
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 182
    .line 183
    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 187
    .line 188
    .line 189
    const/16 v0, 0xc

    .line 190
    .line 191
    invoke-static {v0}, LB0/a;->b(I)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    invoke-static {v0}, LB0/a;->b(I)I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    invoke-static {v0}, LB0/a;->b(I)I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    invoke-static {v0}, LB0/a;->b(I)I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    invoke-virtual {v5, v1, v3, v6, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 208
    .line 209
    .line 210
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 211
    .line 212
    invoke-direct {v0, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 213
    .line 214
    .line 215
    iget-object p1, p1, Ls0/o;->b:Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_8

    .line 222
    .line 223
    const-string p1, "\u670b\u53cb\u5708\u9884\u89c8"

    .line 224
    .line 225
    :cond_8
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-virtual {p1, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    const-string v0, "\u5173\u95ed"

    .line 234
    .line 235
    invoke-virtual {p1, v0, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_9
    :goto_2
    const-string p1, "\u6682\u65e0\u9884\u89c8\u56fe"

    .line 244
    .line 245
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_a
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v2

    .line 253
    :cond_b
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v2

    .line 257
    :cond_c
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    :goto_3
    return-void

    .line 261
    :pswitch_3
    iget-object p1, p0, Lr0/F1;->d:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast p1, Landroid/widget/FrameLayout;

    .line 264
    .line 265
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    instance-of v0, p1, Ln0/a;

    .line 270
    .line 271
    if-eqz v0, :cond_d

    .line 272
    .line 273
    move-object v2, p1

    .line 274
    check-cast v2, Ln0/a;

    .line 275
    .line 276
    :cond_d
    if-eqz v2, :cond_e

    .line 277
    .line 278
    iget v1, v2, Ln0/a;->b:I

    .line 279
    .line 280
    :cond_e
    iget-object p1, p0, Lr0/F1;->c:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast p1, Li/t;

    .line 283
    .line 284
    invoke-static {p1, v1}, Li/t;->b(Li/t;I)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_4
    iget-object p1, p0, Lr0/F1;->c:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast p1, Ls0/l;

    .line 291
    .line 292
    iget-object v0, p0, Lr0/F1;->d:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Ls0/i;

    .line 295
    .line 296
    invoke-static {p1, v0}, Ls0/l;->b(Ls0/l;Ls0/i;)V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :pswitch_5
    iget-object v1, p0, Lr0/F1;->c:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v1, Ls0/e;

    .line 303
    .line 304
    iget-object v3, p0, Lr0/F1;->d:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v3, Li/q1;

    .line 307
    .line 308
    iget v1, v1, Ln0/a;->b:I

    .line 309
    .line 310
    if-ltz v1, :cond_1d

    .line 311
    .line 312
    iget-object v4, v3, Li/q1;->c:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v4, Ls0/g;

    .line 315
    .line 316
    if-eqz v4, :cond_1c

    .line 317
    .line 318
    iget-object v4, v4, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 319
    .line 320
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    if-ge v1, v4, :cond_1d

    .line 325
    .line 326
    iget-object v4, v3, Li/q1;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v4, Ls0/g;

    .line 329
    .line 330
    if-eqz v4, :cond_1b

    .line 331
    .line 332
    iget-object p1, v4, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 333
    .line 334
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    check-cast p1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 339
    .line 340
    if-eqz p1, :cond_f

    .line 341
    .line 342
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    if-eqz p1, :cond_f

    .line 347
    .line 348
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    goto :goto_4

    .line 357
    :cond_f
    move-object p1, v2

    .line 358
    :goto_4
    if-nez p1, :cond_10

    .line 359
    .line 360
    const-string p1, ""

    .line 361
    .line 362
    :cond_10
    sget-object v1, Lz0/z;->a:Lz0/z;

    .line 363
    .line 364
    invoke-static {p1}, Lz0/z;->b(Ljava/lang/String;)Lz0/y;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    if-eqz v1, :cond_12

    .line 369
    .line 370
    iget-object v1, v1, Lz0/y;->a:Ljava/lang/String;

    .line 371
    .line 372
    if-eqz v1, :cond_12

    .line 373
    .line 374
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    if-eqz v1, :cond_12

    .line 383
    .line 384
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-nez v4, :cond_11

    .line 389
    .line 390
    move-object v2, v1

    .line 391
    :cond_11
    if-nez v2, :cond_13

    .line 392
    .line 393
    :cond_12
    move-object v2, p1

    .line 394
    :cond_13
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    if-eqz v1, :cond_14

    .line 399
    .line 400
    goto/16 :goto_a

    .line 401
    .line 402
    :cond_14
    sget-object v1, Lz0/e;->a:Ljava/lang/String;

    .line 403
    .line 404
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    if-eqz v4, :cond_15

    .line 417
    .line 418
    goto :goto_5

    .line 419
    :cond_15
    sput-object v1, Lz0/e;->a:Ljava/lang/String;

    .line 420
    .line 421
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 422
    .line 423
    .line 424
    move-result-wide v4

    .line 425
    sput-wide v4, Lz0/e;->b:J

    .line 426
    .line 427
    :goto_5
    filled-new-array {p1, v2}, [Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    new-instance v1, Ljava/util/ArrayList;

    .line 432
    .line 433
    const/4 v4, 0x2

    .line 434
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 435
    .line 436
    .line 437
    const/4 v5, 0x0

    .line 438
    move v6, v5

    .line 439
    :goto_6
    if-ge v6, v4, :cond_16

    .line 440
    .line 441
    aget-object v7, p1, v6

    .line 442
    .line 443
    invoke-static {v7}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    add-int/2addr v6, v0

    .line 455
    goto :goto_6

    .line 456
    :cond_16
    new-instance p1, Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    :cond_17
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v4

    .line 469
    if-eqz v4, :cond_18

    .line 470
    .line 471
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    move-object v6, v4

    .line 476
    check-cast v6, Ljava/lang/String;

    .line 477
    .line 478
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 479
    .line 480
    .line 481
    move-result v6

    .line 482
    if-nez v6, :cond_17

    .line 483
    .line 484
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    goto :goto_7

    .line 488
    :cond_18
    invoke-static {p1}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    if-eqz v1, :cond_19

    .line 497
    .line 498
    goto :goto_8

    .line 499
    :cond_19
    sput-object p1, Lz0/e;->c:Ljava/util/Set;

    .line 500
    .line 501
    :goto_8
    iget-object p1, v3, Li/q1;->a:Landroid/view/View;

    .line 502
    .line 503
    check-cast p1, Lt0/e;

    .line 504
    .line 505
    invoke-virtual {p1}, Lt0/c;->a()V

    .line 506
    .line 507
    .line 508
    iget-object p1, v3, Li/q1;->g:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 511
    .line 512
    invoke-virtual {p1, v5, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 513
    .line 514
    .line 515
    move-result p1

    .line 516
    if-nez p1, :cond_1a

    .line 517
    .line 518
    goto :goto_9

    .line 519
    :cond_1a
    iget-object p1, v3, Li/q1;->e:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 522
    .line 523
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    iget-object p1, v3, Li/q1;->f:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast p1, Ls0/f;

    .line 529
    .line 530
    invoke-virtual {p1}, Landroid/util/LruCache;->evictAll()V

    .line 531
    .line 532
    .line 533
    :goto_9
    iget-object p1, v3, Li/q1;->b:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast p1, Landroid/app/Activity;

    .line 536
    .line 537
    new-instance v0, Landroid/content/Intent;

    .line 538
    .line 539
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 540
    .line 541
    .line 542
    iget-object v1, v3, Li/q1;->b:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v1, Landroid/app/Activity;

    .line 545
    .line 546
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    const-string v3, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 551
    .line 552
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 553
    .line 554
    .line 555
    const-string v1, "Chat_User"

    .line 556
    .line 557
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 558
    .line 559
    .line 560
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 561
    .line 562
    .line 563
    goto :goto_a

    .line 564
    :cond_1b
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    throw v2

    .line 568
    :cond_1c
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    throw v2

    .line 572
    :cond_1d
    :goto_a
    return-void

    .line 573
    :pswitch_6
    iget-object p1, p0, Lr0/F1;->d:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast p1, Landroid/widget/FrameLayout;

    .line 576
    .line 577
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    instance-of v0, p1, Ln0/a;

    .line 582
    .line 583
    if-eqz v0, :cond_1e

    .line 584
    .line 585
    move-object v2, p1

    .line 586
    check-cast v2, Ln0/a;

    .line 587
    .line 588
    :cond_1e
    if-eqz v2, :cond_1f

    .line 589
    .line 590
    iget v1, v2, Ln0/a;->b:I

    .line 591
    .line 592
    :cond_1f
    iget-object p1, p0, Lr0/F1;->c:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast p1, Li/q1;

    .line 595
    .line 596
    invoke-static {p1, v1}, Li/q1;->a(Li/q1;I)V

    .line 597
    .line 598
    .line 599
    return-void

    .line 600
    :pswitch_7
    iget-object p1, p0, Lr0/F1;->c:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast p1, Lr0/M1;

    .line 603
    .line 604
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    invoke-static {}, Lr0/M1;->c()Z

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-nez v0, :cond_20

    .line 612
    .line 613
    goto :goto_b

    .line 614
    :cond_20
    iget-object v0, p0, Lr0/F1;->d:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v0, Landroid/app/Activity;

    .line 617
    .line 618
    invoke-virtual {p1, v0}, Lr0/M1;->i(Landroid/app/Activity;)V

    .line 619
    .line 620
    .line 621
    :goto_b
    return-void

    .line 622
    nop

    .line 623
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
