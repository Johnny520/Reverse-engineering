.class public final Li7;
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
    iput p1, p0, Li7;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Li7;->b:Ljava/lang/Object;

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
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Li7;->a:I

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    iget-object v8, v1, Li7;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v8, Lra0;

    .line 12
    .line 13
    invoke-virtual {v8, v7}, Lra0;->n(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast v8, Landroidx/appcompat/widget/Toolbar;

    .line 18
    .line 19
    iget-object v0, v8, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:Lj1;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lj1;->l()Z

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_1
    check-cast v8, Lcom/google/android/material/textfield/TextInputLayout;

    .line 32
    .line 33
    iget-object v0, v8, Lcom/google/android/material/textfield/TextInputLayout;->c:Lgj;

    .line 34
    .line 35
    iget-object v0, v0, Lgj;->g:Lcom/google/android/material/internal/CheckableImageButton;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_2
    check-cast v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 45
    .line 46
    invoke-virtual {v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y0()Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_3
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->H:Lqz;

    .line 53
    .line 54
    if-eqz v0, :cond_d

    .line 55
    .line 56
    check-cast v0, Lvf;

    .line 57
    .line 58
    iget-wide v9, v0, Lqz;->d:J

    .line 59
    .line 60
    iget-object v11, v0, Lvf;->h:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    iget-object v13, v0, Lvf;->j:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v14

    .line 72
    iget-object v15, v0, Lvf;->k:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v16

    .line 78
    const-wide/16 v17, 0x0

    .line 79
    .line 80
    iget-object v3, v0, Lvf;->i:Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v12, :cond_1

    .line 87
    .line 88
    if-eqz v14, :cond_1

    .line 89
    .line 90
    if-eqz v4, :cond_1

    .line 91
    .line 92
    if-eqz v16, :cond_1

    .line 93
    .line 94
    goto/16 :goto_8

    .line 95
    .line 96
    :cond_1
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    move v6, v7

    .line 101
    :goto_0
    if-ge v6, v5, :cond_2

    .line 102
    .line 103
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v20

    .line 107
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    move-object/from16 v7, v20

    .line 110
    .line 111
    check-cast v7, Li00;

    .line 112
    .line 113
    iget-object v2, v7, Li00;->a:Landroid/view/View;

    .line 114
    .line 115
    move/from16 v22, v4

    .line 116
    .line 117
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    move/from16 v23, v5

    .line 122
    .line 123
    iget-object v5, v0, Lvf;->q:Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v9, v10}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    move/from16 v24, v6

    .line 133
    .line 134
    const/4 v6, 0x0

    .line 135
    invoke-virtual {v5, v6}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    new-instance v6, Lqf;

    .line 140
    .line 141
    invoke-direct {v6, v0, v7, v4, v2}, Lqf;-><init>(Lvf;Li00;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v6}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 149
    .line 150
    .line 151
    move/from16 v4, v22

    .line 152
    .line 153
    move/from16 v5, v23

    .line 154
    .line 155
    move/from16 v6, v24

    .line 156
    .line 157
    const/4 v7, 0x0

    .line 158
    goto :goto_0

    .line 159
    :cond_2
    move/from16 v22, v4

    .line 160
    .line 161
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 162
    .line 163
    .line 164
    if-nez v14, :cond_4

    .line 165
    .line 166
    new-instance v2, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 172
    .line 173
    .line 174
    iget-object v4, v0, Lvf;->m:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 180
    .line 181
    .line 182
    new-instance v4, Lpf;

    .line 183
    .line 184
    const/4 v5, 0x0

    .line 185
    invoke-direct {v4, v0, v2, v5}, Lpf;-><init>(Lvf;Ljava/util/ArrayList;I)V

    .line 186
    .line 187
    .line 188
    if-nez v12, :cond_3

    .line 189
    .line 190
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    check-cast v2, Luf;

    .line 195
    .line 196
    iget-object v2, v2, Luf;->a:Li00;

    .line 197
    .line 198
    iget-object v2, v2, Li00;->a:Landroid/view/View;

    .line 199
    .line 200
    sget-object v5, Loa0;->a:Ljava/util/WeakHashMap;

    .line 201
    .line 202
    invoke-static {v2, v4, v9, v10}, Lx90;->n(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_3
    invoke-virtual {v4}, Lpf;->run()V

    .line 207
    .line 208
    .line 209
    :cond_4
    :goto_1
    if-nez v16, :cond_6

    .line 210
    .line 211
    new-instance v2, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 217
    .line 218
    .line 219
    iget-object v4, v0, Lvf;->n:Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    .line 225
    .line 226
    .line 227
    new-instance v4, Lpf;

    .line 228
    .line 229
    const/4 v5, 0x1

    .line 230
    invoke-direct {v4, v0, v2, v5}, Lpf;-><init>(Lvf;Ljava/util/ArrayList;I)V

    .line 231
    .line 232
    .line 233
    if-nez v12, :cond_5

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    check-cast v2, Ltf;

    .line 241
    .line 242
    iget-object v2, v2, Ltf;->a:Li00;

    .line 243
    .line 244
    iget-object v2, v2, Li00;->a:Landroid/view/View;

    .line 245
    .line 246
    sget-object v5, Loa0;->a:Ljava/util/WeakHashMap;

    .line 247
    .line 248
    invoke-static {v2, v4, v9, v10}, Lx90;->n(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_5
    invoke-virtual {v4}, Lpf;->run()V

    .line 253
    .line 254
    .line 255
    :cond_6
    :goto_2
    if-nez v22, :cond_c

    .line 256
    .line 257
    new-instance v2, Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 263
    .line 264
    .line 265
    iget-object v4, v0, Lvf;->l:Ljava/util/ArrayList;

    .line 266
    .line 267
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 271
    .line 272
    .line 273
    new-instance v3, Lpf;

    .line 274
    .line 275
    const/4 v4, 0x2

    .line 276
    invoke-direct {v3, v0, v2, v4}, Lpf;-><init>(Lvf;Ljava/util/ArrayList;I)V

    .line 277
    .line 278
    .line 279
    if-eqz v12, :cond_8

    .line 280
    .line 281
    if-eqz v14, :cond_8

    .line 282
    .line 283
    if-nez v16, :cond_7

    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_7
    invoke-virtual {v3}, Lpf;->run()V

    .line 287
    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_8
    :goto_3
    if-nez v12, :cond_9

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_9
    move-wide/from16 v9, v17

    .line 294
    .line 295
    :goto_4
    if-nez v14, :cond_a

    .line 296
    .line 297
    iget-wide v4, v0, Lqz;->e:J

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_a
    move-wide/from16 v4, v17

    .line 301
    .line 302
    :goto_5
    if-nez v16, :cond_b

    .line 303
    .line 304
    iget-wide v6, v0, Lqz;->f:J

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_b
    move-wide/from16 v6, v17

    .line 308
    .line 309
    :goto_6
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 310
    .line 311
    .line 312
    move-result-wide v4

    .line 313
    add-long/2addr v4, v9

    .line 314
    const/4 v0, 0x0

    .line 315
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    check-cast v2, Li00;

    .line 320
    .line 321
    iget-object v2, v2, Li00;->a:Landroid/view/View;

    .line 322
    .line 323
    sget-object v6, Loa0;->a:Ljava/util/WeakHashMap;

    .line 324
    .line 325
    invoke-static {v2, v3, v4, v5}, Lx90;->n(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 326
    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_c
    :goto_7
    const/4 v0, 0x0

    .line 330
    goto :goto_9

    .line 331
    :cond_d
    :goto_8
    move v0, v7

    .line 332
    :goto_9
    iput-boolean v0, v8, Landroidx/recyclerview/widget/RecyclerView;->i0:Z

    .line 333
    .line 334
    return-void

    .line 335
    :pswitch_4
    check-cast v8, Lam;

    .line 336
    .line 337
    const/4 v5, 0x1

    .line 338
    invoke-virtual {v8, v5}, Lam;->t(Z)Z

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :pswitch_5
    const/4 v5, 0x1

    .line 343
    check-cast v8, Lyj;

    .line 344
    .line 345
    iget-object v0, v8, Lyj;->z:Landroid/animation/ValueAnimator;

    .line 346
    .line 347
    iget v2, v8, Lyj;->A:I

    .line 348
    .line 349
    if-eq v2, v5, :cond_e

    .line 350
    .line 351
    const/4 v4, 0x2

    .line 352
    if-eq v2, v4, :cond_f

    .line 353
    .line 354
    goto :goto_a

    .line 355
    :cond_e
    const/4 v4, 0x2

    .line 356
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 357
    .line 358
    .line 359
    :cond_f
    const/4 v2, 0x3

    .line 360
    iput v2, v8, Lyj;->A:I

    .line 361
    .line 362
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    check-cast v2, Ljava/lang/Float;

    .line 367
    .line 368
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    new-array v3, v4, [F

    .line 373
    .line 374
    const/16 v21, 0x0

    .line 375
    .line 376
    aput v2, v3, v21

    .line 377
    .line 378
    const/16 v19, 0x1

    .line 379
    .line 380
    const/16 v20, 0x0

    .line 381
    .line 382
    aput v20, v3, v19

    .line 383
    .line 384
    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 385
    .line 386
    .line 387
    const/16 v2, 0x1f4

    .line 388
    .line 389
    int-to-long v2, v2

    .line 390
    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 394
    .line 395
    .line 396
    :goto_a
    return-void

    .line 397
    :pswitch_6
    check-cast v8, Lmh;

    .line 398
    .line 399
    const/4 v0, 0x0

    .line 400
    iput-object v0, v8, Lmh;->l:Li7;

    .line 401
    .line 402
    invoke-virtual {v8}, Lmh;->drawableStateChanged()V

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :pswitch_7
    check-cast v8, Ltg;

    .line 407
    .line 408
    iget-object v0, v8, Ltg;->S:Lrg;

    .line 409
    .line 410
    iget-object v2, v8, Ltg;->a0:Landroid/app/Dialog;

    .line 411
    .line 412
    invoke-virtual {v0, v2}, Lrg;->onDismiss(Landroid/content/DialogInterface;)V

    .line 413
    .line 414
    .line 415
    return-void

    .line 416
    :pswitch_8
    check-cast v8, Lag;

    .line 417
    .line 418
    iget-object v0, v8, Lag;->a:Landroid/view/ViewGroup;

    .line 419
    .line 420
    iget-object v2, v8, Lag;->b:Landroid/view/View;

    .line 421
    .line 422
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 423
    .line 424
    .line 425
    iget-object v0, v8, Lag;->c:Lbg;

    .line 426
    .line 427
    invoke-virtual {v0}, Lo3;->d()V

    .line 428
    .line 429
    .line 430
    return-void

    .line 431
    :pswitch_9
    :try_start_0
    check-cast v8, Landroidx/activity/ComponentActivity;

    .line 432
    .line 433
    invoke-static {v8}, Landroidx/activity/ComponentActivity;->g(Landroidx/activity/ComponentActivity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 434
    .line 435
    .line 436
    goto :goto_d

    .line 437
    :catch_0
    move-exception v0

    .line 438
    goto :goto_b

    .line 439
    :catch_1
    move-exception v0

    .line 440
    goto :goto_c

    .line 441
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    const-string v3, "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference"

    .line 446
    .line 447
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    if-eqz v2, :cond_10

    .line 452
    .line 453
    goto :goto_d

    .line 454
    :cond_10
    throw v0

    .line 455
    :goto_c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    const-string v3, "Can not perform this action after onSaveInstanceState"

    .line 460
    .line 461
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    if-eqz v2, :cond_11

    .line 466
    .line 467
    :goto_d
    return-void

    .line 468
    :cond_11
    throw v0

    .line 469
    :pswitch_a
    check-cast v8, Le8;

    .line 470
    .line 471
    const/4 v5, 0x0

    .line 472
    iput-boolean v5, v8, Le8;->c:Z

    .line 473
    .line 474
    iget-object v0, v8, Le8;->e:Lxd;

    .line 475
    .line 476
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 477
    .line 478
    iget-object v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:Lra0;

    .line 479
    .line 480
    if-eqz v2, :cond_12

    .line 481
    .line 482
    invoke-virtual {v2}, Lra0;->f()Z

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    if-eqz v2, :cond_12

    .line 487
    .line 488
    iget v0, v8, Le8;->b:I

    .line 489
    .line 490
    invoke-virtual {v8, v0}, Le8;->a(I)V

    .line 491
    .line 492
    .line 493
    goto :goto_e

    .line 494
    :cond_12
    iget v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    .line 495
    .line 496
    const/4 v4, 0x2

    .line 497
    if-ne v2, v4, :cond_13

    .line 498
    .line 499
    iget v2, v8, Le8;->b:I

    .line 500
    .line 501
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    .line 502
    .line 503
    .line 504
    :cond_13
    :goto_e
    return-void

    .line 505
    :pswitch_b
    const-wide/16 v17, 0x0

    .line 506
    .line 507
    check-cast v8, Lpr;

    .line 508
    .line 509
    iget-object v0, v8, Lpr;->c:Lmh;

    .line 510
    .line 511
    iget-object v2, v8, Lpr;->a:Lh7;

    .line 512
    .line 513
    iget-boolean v3, v8, Lpr;->o:Z

    .line 514
    .line 515
    if-nez v3, :cond_14

    .line 516
    .line 517
    goto/16 :goto_11

    .line 518
    .line 519
    :cond_14
    iget-boolean v3, v8, Lpr;->m:Z

    .line 520
    .line 521
    if-eqz v3, :cond_15

    .line 522
    .line 523
    const/4 v5, 0x0

    .line 524
    iput-boolean v5, v8, Lpr;->m:Z

    .line 525
    .line 526
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 527
    .line 528
    .line 529
    move-result-wide v3

    .line 530
    iput-wide v3, v2, Lh7;->e:J

    .line 531
    .line 532
    const-wide/16 v5, -0x1

    .line 533
    .line 534
    iput-wide v5, v2, Lh7;->g:J

    .line 535
    .line 536
    iput-wide v3, v2, Lh7;->f:J

    .line 537
    .line 538
    const/high16 v3, 0x3f000000    # 0.5f

    .line 539
    .line 540
    iput v3, v2, Lh7;->h:F

    .line 541
    .line 542
    :cond_15
    iget-wide v3, v2, Lh7;->g:J

    .line 543
    .line 544
    cmp-long v3, v3, v17

    .line 545
    .line 546
    if-lez v3, :cond_16

    .line 547
    .line 548
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 549
    .line 550
    .line 551
    move-result-wide v3

    .line 552
    iget-wide v5, v2, Lh7;->g:J

    .line 553
    .line 554
    iget v7, v2, Lh7;->i:I

    .line 555
    .line 556
    int-to-long v9, v7

    .line 557
    add-long/2addr v5, v9

    .line 558
    cmp-long v3, v3, v5

    .line 559
    .line 560
    if-lez v3, :cond_16

    .line 561
    .line 562
    :goto_f
    const/4 v5, 0x0

    .line 563
    goto :goto_10

    .line 564
    :cond_16
    invoke-virtual {v8}, Lpr;->e()Z

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    if-nez v3, :cond_17

    .line 569
    .line 570
    goto :goto_f

    .line 571
    :goto_10
    iput-boolean v5, v8, Lpr;->o:Z

    .line 572
    .line 573
    goto :goto_11

    .line 574
    :cond_17
    const/4 v5, 0x0

    .line 575
    iget-boolean v3, v8, Lpr;->n:Z

    .line 576
    .line 577
    if-eqz v3, :cond_18

    .line 578
    .line 579
    iput-boolean v5, v8, Lpr;->n:Z

    .line 580
    .line 581
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 582
    .line 583
    .line 584
    move-result-wide v9

    .line 585
    const/4 v15, 0x0

    .line 586
    const/16 v16, 0x0

    .line 587
    .line 588
    const/4 v13, 0x3

    .line 589
    const/4 v14, 0x0

    .line 590
    move-wide v11, v9

    .line 591
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 592
    .line 593
    .line 594
    move-result-object v3

    .line 595
    invoke-virtual {v0, v3}, Lmh;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 596
    .line 597
    .line 598
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 599
    .line 600
    .line 601
    :cond_18
    iget-wide v3, v2, Lh7;->f:J

    .line 602
    .line 603
    cmp-long v3, v3, v17

    .line 604
    .line 605
    if-eqz v3, :cond_19

    .line 606
    .line 607
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 608
    .line 609
    .line 610
    move-result-wide v3

    .line 611
    invoke-virtual {v2, v3, v4}, Lh7;->a(J)F

    .line 612
    .line 613
    .line 614
    move-result v5

    .line 615
    const/high16 v6, -0x3f800000    # -4.0f

    .line 616
    .line 617
    mul-float/2addr v6, v5

    .line 618
    mul-float/2addr v6, v5

    .line 619
    const/high16 v7, 0x40800000    # 4.0f

    .line 620
    .line 621
    mul-float/2addr v5, v7

    .line 622
    add-float/2addr v5, v6

    .line 623
    iget-wide v6, v2, Lh7;->f:J

    .line 624
    .line 625
    sub-long v6, v3, v6

    .line 626
    .line 627
    iput-wide v3, v2, Lh7;->f:J

    .line 628
    .line 629
    long-to-float v3, v6

    .line 630
    mul-float/2addr v3, v5

    .line 631
    iget v2, v2, Lh7;->d:F

    .line 632
    .line 633
    mul-float/2addr v3, v2

    .line 634
    float-to-int v2, v3

    .line 635
    iget-object v3, v8, Lpr;->q:Lmh;

    .line 636
    .line 637
    invoke-static {v3, v2}, Lqr;->b(Landroid/widget/ListView;I)V

    .line 638
    .line 639
    .line 640
    sget-object v2, Loa0;->a:Ljava/util/WeakHashMap;

    .line 641
    .line 642
    invoke-static {v0, v1}, Lx90;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 643
    .line 644
    .line 645
    :goto_11
    return-void

    .line 646
    :cond_19
    new-instance v0, Ljava/lang/RuntimeException;

    .line 647
    .line 648
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 649
    .line 650
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    throw v0

    .line 654
    nop

    .line 655
    :pswitch_data_0
    .packed-switch 0x0
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
