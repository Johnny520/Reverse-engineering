.class public final synthetic Lx8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lx8;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lx8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lx8;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lrb0;

    .line 13
    .line 14
    iget-object v1, v0, Lrb0;->a:Landroid/view/View;

    .line 15
    .line 16
    const v3, 0x7e060008

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-wide v4, v0, Lrb0;->d:J

    .line 24
    .line 25
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v1, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget-object v0, v0, Lrb0;->a:Landroid/view/View;

    .line 36
    .line 37
    invoke-virtual {v0, v3, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_0
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_1
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Le8;

    .line 54
    .line 55
    iput-boolean v4, v0, Le8;->c:Z

    .line 56
    .line 57
    iget-object v2, v0, Le8;->e:Lxd;

    .line 58
    .line 59
    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 60
    .line 61
    iget-object v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lra0;

    .line 62
    .line 63
    if-eqz v3, :cond_1

    .line 64
    .line 65
    invoke-virtual {v3}, Lra0;->f()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    iget v1, v0, Le8;->b:I

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Le8;->a(I)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iget v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 78
    .line 79
    if-ne v3, v1, :cond_2

    .line 80
    .line 81
    iget v0, v0, Le8;->b:I

    .line 82
    .line 83
    invoke-virtual {v2, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_0
    return-void

    .line 87
    :pswitch_2
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lfz;

    .line 90
    .line 91
    invoke-virtual {v0}, Lfz;->e()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_3
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Loy;

    .line 98
    .line 99
    iget-object v1, v0, Loy;->f:Landroidx/lifecycle/a;

    .line 100
    .line 101
    iget v2, v0, Loy;->b:I

    .line 102
    .line 103
    if-nez v2, :cond_3

    .line 104
    .line 105
    iput-boolean v3, v0, Loy;->c:Z

    .line 106
    .line 107
    sget-object v2, Lmq;->ON_PAUSE:Lmq;

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    iget v2, v0, Loy;->a:I

    .line 113
    .line 114
    if-nez v2, :cond_4

    .line 115
    .line 116
    iget-boolean v2, v0, Loy;->c:Z

    .line 117
    .line 118
    if-eqz v2, :cond_4

    .line 119
    .line 120
    sget-object v2, Lmq;->ON_STOP:Lmq;

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 123
    .line 124
    .line 125
    iput-boolean v3, v0, Loy;->d:Z

    .line 126
    .line 127
    :cond_4
    return-void

    .line 128
    :pswitch_4
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Lp00;

    .line 131
    .line 132
    iget-object v0, v0, Lp00;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Ljava/lang/String;

    .line 135
    .line 136
    sget-object v1, Lkn;->a:Lkn;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    sget-object v1, Lkn;->f:Ljava/lang/ref/WeakReference;

    .line 142
    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, Landroid/app/Activity;

    .line 150
    .line 151
    if-nez v1, :cond_5

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_5
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    .line 155
    .line 156
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    sget-object v5, Lub0;->b0:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 166
    .line 167
    .line 168
    const-string v4, "l6j9w85LDIOKqNvp0kY=\n"

    .line 169
    .line 170
    const-string v5, "/M2EnKAqeOo=\n"

    .line 171
    .line 172
    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-virtual {v2, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 177
    .line 178
    .line 179
    const-string v0, "sBmxcfXuog==\n"

    .line 180
    .line 181
    const-string v4, "23zILoKP2zY=\n"

    .line 182
    .line 183
    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x10000000

    .line 191
    .line 192
    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :catchall_0
    const-string v0, "2ScHfiWZtVnwKztGNbmvW/QmAVYwvblc\n"

    .line 200
    .line 201
    const-string v1, "lVJkFVzU2jc=\n"

    .line 202
    .line 203
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v1, "06ke\n"

    .line 208
    .line 209
    const-string v2, "p8h5VTpLcuY=\n"

    .line 210
    .line 211
    const-string v3, "tw==\n"

    .line 212
    .line 213
    const-string v4, "0vI8ySRxU5w=\n"

    .line 214
    .line 215
    invoke-static {v1, v2, v0, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :cond_6
    :goto_1
    return-void

    .line 219
    :pswitch_5
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Ll00;

    .line 222
    .line 223
    iput-boolean v4, v0, Ll00;->a:Z

    .line 224
    .line 225
    return-void

    .line 226
    :pswitch_6
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Ljava/lang/String;

    .line 229
    .line 230
    sget-object v1, Lkn;->f:Ljava/lang/ref/WeakReference;

    .line 231
    .line 232
    const/4 v9, 0x0

    .line 233
    if-eqz v1, :cond_7

    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Landroid/app/Activity;

    .line 240
    .line 241
    move-object v6, v1

    .line 242
    goto :goto_2

    .line 243
    :cond_7
    move-object v6, v9

    .line 244
    :goto_2
    if-eqz v6, :cond_16

    .line 245
    .line 246
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-nez v1, :cond_16

    .line 251
    .line 252
    invoke-virtual {v6}, Landroid/app/Activity;->isDestroyed()Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_8

    .line 257
    .line 258
    goto/16 :goto_7

    .line 259
    .line 260
    :cond_8
    invoke-virtual {v6}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 269
    .line 270
    if-eqz v2, :cond_9

    .line 271
    .line 272
    check-cast v1, Landroid/view/ViewGroup;

    .line 273
    .line 274
    move-object v8, v1

    .line 275
    goto :goto_3

    .line 276
    :cond_9
    move-object v8, v9

    .line 277
    :goto_3
    if-nez v8, :cond_a

    .line 278
    .line 279
    goto/16 :goto_7

    .line 280
    .line 281
    :cond_a
    sget-object v1, Lkn;->k:Lw40;

    .line 282
    .line 283
    if-eqz v1, :cond_b

    .line 284
    .line 285
    new-instance v2, Lrp;

    .line 286
    .line 287
    invoke-virtual {v1}, Laq;->o()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-direct {v2, v5, v9, v1}, Lrp;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Laq;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v2}, Laq;->m(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    :cond_b
    new-instance v7, Lp00;

    .line 298
    .line 299
    invoke-direct {v7}, Lp00;-><init>()V

    .line 300
    .line 301
    .line 302
    const-string v1, "PS180h/kKrIxMUbNL+kspQ==\n"

    .line 303
    .line 304
    const-string v2, "WkgZuUCIX9E=\n"

    .line 305
    .line 306
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-virtual {v8, v1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    iput-object v1, v7, Lp00;->b:Ljava/lang/Object;

    .line 315
    .line 316
    if-nez v1, :cond_e

    .line 317
    .line 318
    new-instance v1, Landroid/widget/LinearLayout;

    .line 319
    .line 320
    invoke-direct {v1, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 321
    .line 322
    .line 323
    const-string v2, "RzW6LDdIsChLKYAzB0W2Pw==\n"

    .line 324
    .line 325
    const-string v5, "IFDfR2gkxUs=\n"

    .line 326
    .line 327
    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 335
    .line 336
    .line 337
    const/16 v2, 0x10

    .line 338
    .line 339
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 340
    .line 341
    .line 342
    const/16 v2, 0x12

    .line 343
    .line 344
    invoke-static {v2}, Lmp;->q(I)I

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    const/16 v5, 0xc

    .line 349
    .line 350
    invoke-static {v5}, Lmp;->q(I)I

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    const/16 v11, 0x16

    .line 355
    .line 356
    invoke-static {v11}, Lmp;->q(I)I

    .line 357
    .line 358
    .line 359
    move-result v11

    .line 360
    invoke-static {v5}, Lmp;->q(I)I

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    invoke-virtual {v1, v2, v10, v11, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 365
    .line 366
    .line 367
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 368
    .line 369
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 370
    .line 371
    .line 372
    const-string v5, "Q+m42Cf4OC5R\n"

    .line 373
    .line 374
    const-string v10, "YKyO6RbJCR8=\n"

    .line 375
    .line 376
    invoke-static {v5, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    invoke-virtual {v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 385
    .line 386
    .line 387
    const/high16 v5, 0x42c80000    # 100.0f

    .line 388
    .line 389
    invoke-static {v5}, Lmp;->p(F)F

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    invoke-virtual {v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 394
    .line 395
    .line 396
    invoke-static {v3}, Lmp;->q(I)I

    .line 397
    .line 398
    .line 399
    move-result v5

    .line 400
    const-string v10, "MDxbr4kcEQgj\n"

    .line 401
    .line 402
    const-string v11, "Ew9o6c8vUzs=\n"

    .line 403
    .line 404
    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 409
    .line 410
    .line 411
    move-result v10

    .line 412
    invoke-virtual {v2, v5, v10}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 416
    .line 417
    .line 418
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 419
    .line 420
    const/high16 v5, 0x41f00000    # 30.0f

    .line 421
    .line 422
    invoke-static {v5}, Lmp;->p(F)F

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    invoke-virtual {v1, v5}, Landroid/view/View;->setElevation(F)V

    .line 427
    .line 428
    .line 429
    const/16 v5, 0x1c

    .line 430
    .line 431
    if-lt v2, v5, :cond_c

    .line 432
    .line 433
    const-string v2, "2fy6+PES4A==\n"

    .line 434
    .line 435
    const-string v5, "+syKyMEi0Ns=\n"

    .line 436
    .line 437
    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    invoke-static {v1, v2}, Lc0;->r(Landroid/widget/LinearLayout;I)V

    .line 446
    .line 447
    .line 448
    const-string v2, "OVKhMePdo5Qq\n"

    .line 449
    .line 450
    const-string v5, "GmSXd6Xu4ac=\n"

    .line 451
    .line 452
    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    invoke-static {v1, v2}, Lc0;->A(Landroid/widget/LinearLayout;I)V

    .line 461
    .line 462
    .line 463
    :cond_c
    iput-object v1, v7, Lp00;->b:Ljava/lang/Object;

    .line 464
    .line 465
    new-instance v2, Landroid/widget/TextView;

    .line 466
    .line 467
    invoke-direct {v2, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 468
    .line 469
    .line 470
    const-string v5, "dD93\n"

    .line 471
    .line 472
    const-string v10, "m77Xl2bAQhw=\n"

    .line 473
    .line 474
    invoke-static {v5, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 479
    .line 480
    .line 481
    sget-object v5, Lbo;->a:Landroid/graphics/Typeface;

    .line 482
    .line 483
    if-eqz v5, :cond_d

    .line 484
    .line 485
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 486
    .line 487
    .line 488
    :cond_d
    const/high16 v5, 0x41800000    # 16.0f

    .line 489
    .line 490
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 491
    .line 492
    .line 493
    const-string v5, "H1K6r3eFxg==\n"

    .line 494
    .line 495
    const-string v10, "PBT8nDW29tw=\n"

    .line 496
    .line 497
    invoke-static {v5, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v5

    .line 501
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 502
    .line 503
    .line 504
    move-result v5

    .line 505
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 506
    .line 507
    .line 508
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 509
    .line 510
    const/4 v10, -0x2

    .line 511
    invoke-direct {v5, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 512
    .line 513
    .line 514
    const/16 v11, 0xa

    .line 515
    .line 516
    invoke-static {v11}, Lmp;->q(I)I

    .line 517
    .line 518
    .line 519
    move-result v11

    .line 520
    iput v11, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 521
    .line 522
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 526
    .line 527
    .line 528
    iget-object v1, v7, Lp00;->b:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v1, Landroid/widget/LinearLayout;

    .line 531
    .line 532
    new-instance v2, Landroid/widget/TextView;

    .line 533
    .line 534
    invoke-direct {v2, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 535
    .line 536
    .line 537
    const-string v5, "ZAqTwMcFT5ZpDIT0yj9DjVcJmc7J\n"

    .line 538
    .line 539
    const-string v11, "CH/wq75aO/k=\n"

    .line 540
    .line 541
    invoke-static {v5, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    invoke-virtual {v2, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    const/high16 v5, 0x41580000    # 13.5f

    .line 549
    .line 550
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 551
    .line 552
    .line 553
    const-string v5, "mdvU6s130g==\n"

    .line 554
    .line 555
    const-string v11, "up2SrIsxlAc=\n"

    .line 556
    .line 557
    invoke-static {v5, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 562
    .line 563
    .line 564
    move-result v5

    .line 565
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 566
    .line 567
    .line 568
    const-string v5, "t6Wp3BfITD2tourCX99AOqk=\n"

    .line 569
    .line 570
    const-string v11, "xMTHrzq7KU8=\n"

    .line 571
    .line 572
    invoke-static {v5, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v5

    .line 576
    invoke-static {v5, v4}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 577
    .line 578
    .line 579
    move-result-object v4

    .line 580
    invoke-virtual {v2, v4, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 581
    .line 582
    .line 583
    const v4, 0x3ca3d70a    # 0.02f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 590
    .line 591
    .line 592
    iget-object v1, v7, Lp00;->b:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v1, Landroid/view/View;

    .line 595
    .line 596
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 597
    .line 598
    invoke-direct {v2, v10, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 599
    .line 600
    .line 601
    const/16 v4, 0x31

    .line 602
    .line 603
    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 604
    .line 605
    const/16 v4, 0x37

    .line 606
    .line 607
    invoke-static {v4}, Lmp;->q(I)I

    .line 608
    .line 609
    .line 610
    move-result v4

    .line 611
    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 612
    .line 613
    invoke-virtual {v8, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 614
    .line 615
    .line 616
    :cond_e
    iget-object v1, v7, Lp00;->b:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v1, Landroid/widget/LinearLayout;

    .line 619
    .line 620
    const-string v2, "cIcScW9oPq19gQVFYlIytkOEGH9h\n"

    .line 621
    .line 622
    const-string v4, "HPJxGhY3SsI=\n"

    .line 623
    .line 624
    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    check-cast v1, Landroid/widget/TextView;

    .line 633
    .line 634
    if-eqz v1, :cond_f

    .line 635
    .line 636
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 637
    .line 638
    .line 639
    :cond_f
    sget-object v0, Lkn;->a:Lkn;

    .line 640
    .line 641
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    invoke-static {v8, v3}, Lkn;->i(Landroid/view/View;I)V

    .line 645
    .line 646
    .line 647
    iget-object v0, v7, Lp00;->b:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v0, Landroid/widget/LinearLayout;

    .line 650
    .line 651
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 656
    .line 657
    .line 658
    iget-object v0, v7, Lp00;->b:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v0, Landroid/widget/LinearLayout;

    .line 661
    .line 662
    const v1, 0x7e110004

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    instance-of v2, v0, Lo40;

    .line 670
    .line 671
    if-eqz v2, :cond_10

    .line 672
    .line 673
    check-cast v0, Lo40;

    .line 674
    .line 675
    goto :goto_4

    .line 676
    :cond_10
    move-object v0, v9

    .line 677
    :goto_4
    if-eqz v0, :cond_11

    .line 678
    .line 679
    invoke-virtual {v0}, Lo40;->c()V

    .line 680
    .line 681
    .line 682
    :cond_11
    iget-object v0, v7, Lp00;->b:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v0, Landroid/widget/LinearLayout;

    .line 685
    .line 686
    const v2, 0x7e110005

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    instance-of v3, v0, Lo40;

    .line 694
    .line 695
    if-eqz v3, :cond_12

    .line 696
    .line 697
    check-cast v0, Lo40;

    .line 698
    .line 699
    goto :goto_5

    .line 700
    :cond_12
    move-object v0, v9

    .line 701
    :goto_5
    if-eqz v0, :cond_13

    .line 702
    .line 703
    invoke-virtual {v0}, Lo40;->c()V

    .line 704
    .line 705
    .line 706
    :cond_13
    iget-object v0, v7, Lp00;->b:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v0, Landroid/widget/LinearLayout;

    .line 709
    .line 710
    const v3, 0x7e110006

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    instance-of v4, v0, Lo40;

    .line 718
    .line 719
    if-eqz v4, :cond_14

    .line 720
    .line 721
    check-cast v0, Lo40;

    .line 722
    .line 723
    goto :goto_6

    .line 724
    :cond_14
    move-object v0, v9

    .line 725
    :goto_6
    if-eqz v0, :cond_15

    .line 726
    .line 727
    invoke-virtual {v0}, Lo40;->c()V

    .line 728
    .line 729
    .line 730
    :cond_15
    iget-object v0, v7, Lp00;->b:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v0, Landroid/widget/LinearLayout;

    .line 733
    .line 734
    const/high16 v4, 0x42700000    # 60.0f

    .line 735
    .line 736
    invoke-static {v4}, Lmp;->p(F)F

    .line 737
    .line 738
    .line 739
    move-result v4

    .line 740
    neg-float v4, v4

    .line 741
    invoke-virtual {v0, v4}, Landroid/view/View;->setTranslationY(F)V

    .line 742
    .line 743
    .line 744
    iget-object v0, v7, Lp00;->b:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v0, Landroid/widget/LinearLayout;

    .line 747
    .line 748
    const/4 v4, 0x0

    .line 749
    invoke-virtual {v0, v4}, Landroid/view/View;->setAlpha(F)V

    .line 750
    .line 751
    .line 752
    iget-object v0, v7, Lp00;->b:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v0, Landroid/widget/LinearLayout;

    .line 755
    .line 756
    const v5, 0x3f59999a    # 0.85f

    .line 757
    .line 758
    .line 759
    invoke-virtual {v0, v5}, Landroid/view/View;->setScaleX(F)V

    .line 760
    .line 761
    .line 762
    iget-object v0, v7, Lp00;->b:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v0, Landroid/widget/LinearLayout;

    .line 765
    .line 766
    invoke-virtual {v0, v5}, Landroid/view/View;->setScaleY(F)V

    .line 767
    .line 768
    .line 769
    iget-object v0, v7, Lp00;->b:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v0, Landroid/widget/LinearLayout;

    .line 772
    .line 773
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    const/high16 v5, 0x3f800000    # 1.0f

    .line 778
    .line 779
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    const-wide/16 v10, 0xc8

    .line 784
    .line 785
    invoke-virtual {v0, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 790
    .line 791
    .line 792
    new-instance v0, Lo40;

    .line 793
    .line 794
    iget-object v10, v7, Lp00;->b:Ljava/lang/Object;

    .line 795
    .line 796
    sget-object v11, Lo40;->n:Lsh;

    .line 797
    .line 798
    invoke-direct {v0, v10, v11}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 799
    .line 800
    .line 801
    const/high16 v10, 0x43480000    # 200.0f

    .line 802
    .line 803
    const v11, 0x3f19999a    # 0.6f

    .line 804
    .line 805
    .line 806
    invoke-static {v4, v10, v11}, Lg40;->f(FFF)Lp40;

    .line 807
    .line 808
    .line 809
    move-result-object v4

    .line 810
    iput-object v4, v0, Lo40;->k:Lp40;

    .line 811
    .line 812
    iget-object v4, v7, Lp00;->b:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast v4, Landroid/widget/LinearLayout;

    .line 815
    .line 816
    invoke-virtual {v4, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v0}, Lo40;->h()V

    .line 820
    .line 821
    .line 822
    new-instance v0, Lo40;

    .line 823
    .line 824
    iget-object v1, v7, Lp00;->b:Ljava/lang/Object;

    .line 825
    .line 826
    sget-object v4, Lo40;->o:Lsh;

    .line 827
    .line 828
    invoke-direct {v0, v1, v4}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 829
    .line 830
    .line 831
    invoke-static {v5, v10, v11}, Lg40;->f(FFF)Lp40;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    iput-object v1, v0, Lo40;->k:Lp40;

    .line 836
    .line 837
    iget-object v1, v7, Lp00;->b:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v1, Landroid/widget/LinearLayout;

    .line 840
    .line 841
    invoke-virtual {v1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v0}, Lo40;->h()V

    .line 845
    .line 846
    .line 847
    new-instance v0, Lo40;

    .line 848
    .line 849
    iget-object v1, v7, Lp00;->b:Ljava/lang/Object;

    .line 850
    .line 851
    sget-object v2, Lo40;->p:Lsh;

    .line 852
    .line 853
    invoke-direct {v0, v1, v2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 854
    .line 855
    .line 856
    invoke-static {v5, v10, v11}, Lg40;->f(FFF)Lp40;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    iput-object v1, v0, Lo40;->k:Lp40;

    .line 861
    .line 862
    iget-object v1, v7, Lp00;->b:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v1, Landroid/widget/LinearLayout;

    .line 865
    .line 866
    invoke-virtual {v1, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v0}, Lo40;->h()V

    .line 870
    .line 871
    .line 872
    sget-object v0, Lkn;->i:Lsd;

    .line 873
    .line 874
    new-instance v5, Ljn;

    .line 875
    .line 876
    const/4 v10, 0x0

    .line 877
    invoke-direct/range {v5 .. v10}, Ljn;-><init>(Landroid/app/Activity;Lp00;Landroid/view/ViewGroup;Lvd;I)V

    .line 878
    .line 879
    .line 880
    const/4 v1, 0x3

    .line 881
    invoke-static {v0, v9, v5, v1}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    sput-object v0, Lkn;->k:Lw40;

    .line 886
    .line 887
    :cond_16
    :goto_7
    return-void

    .line 888
    :pswitch_7
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 889
    .line 890
    move-object v2, v0

    .line 891
    check-cast v2, Lxk;

    .line 892
    .line 893
    const-string v0, "fetchFonts result is not OK. ("

    .line 894
    .line 895
    iget-object v3, v2, Lxk;->d:Ljava/lang/Object;

    .line 896
    .line 897
    monitor-enter v3

    .line 898
    :try_start_1
    iget-object v5, v2, Lxk;->h:Lgf;

    .line 899
    .line 900
    if-nez v5, :cond_17

    .line 901
    .line 902
    monitor-exit v3

    .line 903
    goto/16 :goto_d

    .line 904
    .line 905
    :catchall_1
    move-exception v0

    .line 906
    goto/16 :goto_f

    .line 907
    .line 908
    :cond_17
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 909
    :try_start_2
    invoke-virtual {v2}, Lxk;->c()Lil;

    .line 910
    .line 911
    .line 912
    move-result-object v3

    .line 913
    iget v5, v3, Lil;->e:I

    .line 914
    .line 915
    if-ne v5, v1, :cond_18

    .line 916
    .line 917
    iget-object v1, v2, Lxk;->d:Ljava/lang/Object;

    .line 918
    .line 919
    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 920
    :try_start_3
    monitor-exit v1

    .line 921
    goto :goto_8

    .line 922
    :catchall_2
    move-exception v0

    .line 923
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 924
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 925
    :catchall_3
    move-exception v0

    .line 926
    goto/16 :goto_b

    .line 927
    .line 928
    :cond_18
    :goto_8
    if-nez v5, :cond_1b

    .line 929
    .line 930
    :try_start_5
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 931
    .line 932
    sget v1, Lt70;->a:I

    .line 933
    .line 934
    invoke-static {v0}, Ls70;->a(Ljava/lang/String;)V

    .line 935
    .line 936
    .line 937
    iget-object v0, v2, Lxk;->c:Lxh;

    .line 938
    .line 939
    iget-object v1, v2, Lxk;->a:Landroid/content/Context;

    .line 940
    .line 941
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 942
    .line 943
    .line 944
    filled-new-array {v3}, [Lil;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    sget-object v5, Lh80;->a:Lju;

    .line 949
    .line 950
    invoke-virtual {v5, v1, v0, v4}, Lju;->h(Landroid/content/Context;[Lil;I)Landroid/graphics/Typeface;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    iget-object v1, v2, Lxk;->a:Landroid/content/Context;

    .line 955
    .line 956
    iget-object v3, v3, Lil;->a:Landroid/net/Uri;

    .line 957
    .line 958
    invoke-static {v1, v3}, Lmu;->v(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 959
    .line 960
    .line 961
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 962
    if-eqz v1, :cond_1a

    .line 963
    .line 964
    if-eqz v0, :cond_1a

    .line 965
    .line 966
    :try_start_6
    const-string v3, "EmojiCompat.MetadataRepo.create"

    .line 967
    .line 968
    invoke-static {v3}, Ls70;->a(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    new-instance v3, Lk8;

    .line 972
    .line 973
    invoke-static {v1}, Lju;->u(Ljava/nio/MappedByteBuffer;)Ldw;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    invoke-direct {v3, v0, v1}, Lk8;-><init>(Landroid/graphics/Typeface;Ldw;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 978
    .line 979
    .line 980
    :try_start_7
    invoke-static {}, Ls70;->b()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 981
    .line 982
    .line 983
    :try_start_8
    invoke-static {}, Ls70;->b()V

    .line 984
    .line 985
    .line 986
    iget-object v1, v2, Lxk;->d:Ljava/lang/Object;

    .line 987
    .line 988
    monitor-enter v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 989
    :try_start_9
    iget-object v0, v2, Lxk;->h:Lgf;

    .line 990
    .line 991
    if-eqz v0, :cond_19

    .line 992
    .line 993
    invoke-virtual {v0, v3}, Lgf;->M(Lk8;)V

    .line 994
    .line 995
    .line 996
    goto :goto_9

    .line 997
    :catchall_4
    move-exception v0

    .line 998
    goto :goto_a

    .line 999
    :cond_19
    :goto_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1000
    :try_start_a
    invoke-virtual {v2}, Lxk;->a()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 1001
    .line 1002
    .line 1003
    goto :goto_d

    .line 1004
    :goto_a
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 1005
    :try_start_c
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 1006
    :catchall_5
    move-exception v0

    .line 1007
    :try_start_d
    sget v1, Lt70;->a:I

    .line 1008
    .line 1009
    invoke-static {}, Ls70;->b()V

    .line 1010
    .line 1011
    .line 1012
    throw v0

    .line 1013
    :cond_1a
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1014
    .line 1015
    const-string v1, "Unable to open file."

    .line 1016
    .line 1017
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1018
    .line 1019
    .line 1020
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 1021
    :catchall_6
    move-exception v0

    .line 1022
    :try_start_e
    sget v1, Lt70;->a:I

    .line 1023
    .line 1024
    invoke-static {}, Ls70;->b()V

    .line 1025
    .line 1026
    .line 1027
    throw v0

    .line 1028
    :cond_1b
    new-instance v1, Ljava/lang/RuntimeException;

    .line 1029
    .line 1030
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1031
    .line 1032
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1036
    .line 1037
    .line 1038
    const-string v0, ")"

    .line 1039
    .line 1040
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1048
    .line 1049
    .line 1050
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 1051
    :goto_b
    iget-object v1, v2, Lxk;->d:Ljava/lang/Object;

    .line 1052
    .line 1053
    monitor-enter v1

    .line 1054
    :try_start_f
    iget-object v3, v2, Lxk;->h:Lgf;

    .line 1055
    .line 1056
    if-eqz v3, :cond_1c

    .line 1057
    .line 1058
    invoke-virtual {v3, v0}, Lgf;->J(Ljava/lang/Throwable;)V

    .line 1059
    .line 1060
    .line 1061
    goto :goto_c

    .line 1062
    :catchall_7
    move-exception v0

    .line 1063
    goto :goto_e

    .line 1064
    :cond_1c
    :goto_c
    monitor-exit v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 1065
    invoke-virtual {v2}, Lxk;->a()V

    .line 1066
    .line 1067
    .line 1068
    :goto_d
    return-void

    .line 1069
    :goto_e
    :try_start_10
    monitor-exit v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 1070
    throw v0

    .line 1071
    :goto_f
    :try_start_11
    monitor-exit v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 1072
    throw v0

    .line 1073
    :pswitch_8
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 1074
    .line 1075
    check-cast v0, Lrh;

    .line 1076
    .line 1077
    iget-object v1, v0, Lrh;->h:Landroid/widget/AutoCompleteTextView;

    .line 1078
    .line 1079
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 1080
    .line 1081
    .line 1082
    move-result v1

    .line 1083
    invoke-virtual {v0, v1}, Lrh;->s(Z)V

    .line 1084
    .line 1085
    .line 1086
    iput-boolean v1, v0, Lrh;->m:Z

    .line 1087
    .line 1088
    return-void

    .line 1089
    :pswitch_9
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 1090
    .line 1091
    check-cast v0, Lg2;

    .line 1092
    .line 1093
    invoke-static {v0}, Lg2;->a(Lg2;)V

    .line 1094
    .line 1095
    .line 1096
    return-void

    .line 1097
    :pswitch_a
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v0, Lec;

    .line 1100
    .line 1101
    iget-object v1, v0, Lec;->b:Ljava/lang/Runnable;

    .line 1102
    .line 1103
    if-eqz v1, :cond_1d

    .line 1104
    .line 1105
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 1106
    .line 1107
    .line 1108
    iput-object v2, v0, Lec;->b:Ljava/lang/Runnable;

    .line 1109
    .line 1110
    :cond_1d
    return-void

    .line 1111
    :pswitch_b
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 1112
    .line 1113
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 1114
    .line 1115
    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 1116
    .line 1117
    .line 1118
    return-void

    .line 1119
    :pswitch_c
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 1120
    .line 1121
    check-cast v0, Lcb;

    .line 1122
    .line 1123
    invoke-virtual {v0, v3}, Lcb;->s(Z)V

    .line 1124
    .line 1125
    .line 1126
    return-void

    .line 1127
    :pswitch_d
    iget-object v0, p0, Lx8;->b:Ljava/lang/Object;

    .line 1128
    .line 1129
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 1130
    .line 1131
    invoke-virtual {v0}, Luz;->j0()V

    .line 1132
    .line 1133
    .line 1134
    return-void

    .line 1135
    :pswitch_data_0
    .packed-switch 0x0
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
