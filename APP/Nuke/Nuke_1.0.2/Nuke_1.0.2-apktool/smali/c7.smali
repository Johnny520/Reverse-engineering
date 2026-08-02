.class public final Lc7;
.super Ln4;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic j:Lh7;


# direct methods
.method public constructor <init>(Lh7;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc7;->j:Lh7;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Ln4;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final i(ILl4;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lc7;->j:Lh7;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lh7;->c(ILl4;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(I)Ll4;
    .locals 44

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    move-object/from16 v3, p0

    .line 9
    .line 10
    iget-object v3, v3, Lc7;->j:Lh7;

    .line 11
    .line 12
    iget-object v4, v3, Lh7;->n:Landroid/view/accessibility/AccessibilityManager;

    .line 13
    .line 14
    iget-object v5, v3, Lh7;->k:Lb7;

    .line 15
    .line 16
    invoke-virtual {v5}, Lb7;->getComposeViewContext()Llx;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    iget-object v6, v6, Llx;->c:Lia1;

    .line 21
    .line 22
    invoke-interface {v6}, Lia1;->getLifecycle()Lba1;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    check-cast v6, Lla1;

    .line 27
    .line 28
    iget-object v6, v6, Lla1;->h:Laa1;

    .line 29
    .line 30
    sget-object v7, Laa1;->h:Laa1;

    .line 31
    .line 32
    if-ne v6, v7, :cond_1

    .line 33
    .line 34
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v8, Ll4;

    .line 45
    .line 46
    invoke-direct {v8, v1}, Ll4;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 v8, 0x0

    .line 51
    :goto_0
    move v6, v0

    .line 52
    move-object v12, v3

    .line 53
    goto/16 :goto_4f

    .line 54
    .line 55
    :cond_1
    invoke-virtual {v3}, Lh7;->l()Lx01;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v6, v0}, Lx01;->b(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, Lsn2;

    .line 64
    .line 65
    if-nez v6, :cond_2

    .line 66
    .line 67
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_0

    .line 72
    .line 73
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    new-instance v8, Ll4;

    .line 78
    .line 79
    invoke-direct {v8, v1}, Ll4;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    iget-object v7, v6, Lsn2;->a:Lqn2;

    .line 84
    .line 85
    invoke-virtual {v7}, Lqn2;->k()Lln2;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    iget-object v10, v7, Lqn2;->c:Lr61;

    .line 90
    .line 91
    sget-object v11, Lvn2;->o:Lyn2;

    .line 92
    .line 93
    iget-object v9, v9, Lln2;->h:Lrk1;

    .line 94
    .line 95
    invoke-virtual {v9, v11}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    if-nez v9, :cond_3

    .line 100
    .line 101
    const/4 v9, 0x0

    .line 102
    :cond_3
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-static {v9, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    const/16 v11, 0x22

    .line 109
    .line 110
    if-eqz v9, :cond_5

    .line 111
    .line 112
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 113
    .line 114
    if-lt v13, v11, :cond_4

    .line 115
    .line 116
    invoke-static {v4}, Lu3;->e(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    goto :goto_1

    .line 121
    :cond_4
    const/4 v13, 0x1

    .line 122
    :goto_1
    if-nez v13, :cond_5

    .line 123
    .line 124
    move v6, v0

    .line 125
    move-object v12, v3

    .line 126
    const/4 v8, 0x0

    .line 127
    goto/16 :goto_4f

    .line 128
    .line 129
    :cond_5
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    new-instance v14, Ll4;

    .line 134
    .line 135
    invoke-direct {v14, v13}, Ll4;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 136
    .line 137
    .line 138
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 139
    .line 140
    if-lt v15, v11, :cond_6

    .line 141
    .line 142
    invoke-static {v13, v9}, Lu3;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 143
    .line 144
    .line 145
    const/16 p0, 0x0

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    const/16 p0, 0x0

    .line 149
    .line 150
    const/16 v8, 0x40

    .line 151
    .line 152
    invoke-virtual {v14, v8, v9}, Ll4;->f(IZ)V

    .line 153
    .line 154
    .line 155
    :goto_2
    const/4 v8, -0x1

    .line 156
    if-ne v0, v8, :cond_8

    .line 157
    .line 158
    invoke-virtual {v5}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    instance-of v1, v9, Landroid/view/View;

    .line 163
    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    move-object v1, v9

    .line 167
    check-cast v1, Landroid/view/View;

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_7
    move-object/from16 v1, p0

    .line 171
    .line 172
    :goto_3
    iput v8, v14, Ll4;->b:I

    .line 173
    .line 174
    invoke-virtual {v13, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_8
    invoke-virtual {v7}, Lqn2;->l()Lqn2;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-eqz v1, :cond_9

    .line 183
    .line 184
    iget v1, v1, Lqn2;->f:I

    .line 185
    .line 186
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    goto :goto_4

    .line 191
    :cond_9
    move-object/from16 v1, p0

    .line 192
    .line 193
    :goto_4
    if-eqz v1, :cond_ad

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    invoke-virtual {v5}, Lb7;->getSemanticsOwner()Ltn2;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    invoke-virtual {v9}, Ltn2;->a()Lqn2;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    iget v9, v9, Lqn2;->f:I

    .line 208
    .line 209
    if-ne v1, v9, :cond_a

    .line 210
    .line 211
    move v1, v8

    .line 212
    :cond_a
    iput v1, v14, Ll4;->b:I

    .line 213
    .line 214
    invoke-virtual {v13, v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 215
    .line 216
    .line 217
    :goto_5
    iput v0, v14, Ll4;->c:I

    .line 218
    .line 219
    invoke-virtual {v13, v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v6}, Lh7;->d(Lsn2;)Landroid/graphics/Rect;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v13, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 227
    .line 228
    .line 229
    iget-object v1, v3, Lh7;->Q:Lxj1;

    .line 230
    .line 231
    iget-object v6, v3, Lh7;->z:Lnt2;

    .line 232
    .line 233
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    const-string v12, "android.view.View"

    .line 242
    .line 243
    invoke-virtual {v14, v12}, Ll4;->g(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    iget-object v12, v7, Lqn2;->d:Lln2;

    .line 247
    .line 248
    iget-object v8, v12, Lln2;->h:Lrk1;

    .line 249
    .line 250
    sget-object v11, Lvn2;->G:Lyn2;

    .line 251
    .line 252
    invoke-virtual {v8, v11}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v11

    .line 256
    if-eqz v11, :cond_b

    .line 257
    .line 258
    const-string v11, "android.widget.EditText"

    .line 259
    .line 260
    invoke-virtual {v14, v11}, Ll4;->g(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :cond_b
    sget-object v11, Lvn2;->C:Lyn2;

    .line 264
    .line 265
    invoke-virtual {v8, v11}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    if-eqz v11, :cond_c

    .line 270
    .line 271
    const-string v11, "android.widget.TextView"

    .line 272
    .line 273
    invoke-virtual {v14, v11}, Ll4;->g(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    :cond_c
    sget-object v11, Lvn2;->z:Lyn2;

    .line 277
    .line 278
    invoke-virtual {v8, v11}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    if-nez v11, :cond_d

    .line 283
    .line 284
    move-object/from16 v11, p0

    .line 285
    .line 286
    :cond_d
    check-cast v11, Lva2;

    .line 287
    .line 288
    move-object/from16 v18, v2

    .line 289
    .line 290
    const/4 v2, 0x4

    .line 291
    if-eqz v11, :cond_10

    .line 292
    .line 293
    invoke-virtual {v7}, Lqn2;->o()Z

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    if-nez v11, :cond_e

    .line 298
    .line 299
    invoke-static {v2, v7}, Lqn2;->j(ILqn2;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 304
    .line 305
    .line 306
    move-result v11

    .line 307
    if-eqz v11, :cond_10

    .line 308
    .line 309
    :cond_e
    invoke-virtual {v7}, Lqn2;->q()Z

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    if-nez v11, :cond_f

    .line 314
    .line 315
    iget-boolean v11, v12, Lln2;->j:Z

    .line 316
    .line 317
    if-eqz v11, :cond_10

    .line 318
    .line 319
    :cond_f
    const-string v11, "android.widget.ImageView"

    .line 320
    .line 321
    invoke-virtual {v14, v11}, Ll4;->g(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :cond_10
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 325
    .line 326
    .line 327
    move-result-object v11

    .line 328
    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v11

    .line 332
    invoke-virtual {v13, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v7}, Lxe1;->M(Lqn2;)Z

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    invoke-virtual {v13, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    .line 340
    .line 341
    .line 342
    const/16 v11, 0x22

    .line 343
    .line 344
    if-lt v15, v11, :cond_11

    .line 345
    .line 346
    invoke-static {v4}, Lu3;->e(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    goto :goto_6

    .line 351
    :cond_11
    const/4 v4, 0x1

    .line 352
    :goto_6
    invoke-static {v2, v7}, Lqn2;->j(ILqn2;)Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v11

    .line 356
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 357
    .line 358
    .line 359
    move-result v15

    .line 360
    move/from16 v19, v4

    .line 361
    .line 362
    const/4 v2, 0x0

    .line 363
    const/4 v4, 0x0

    .line 364
    :goto_7
    if-ge v2, v15, :cond_19

    .line 365
    .line 366
    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v20

    .line 370
    move/from16 v21, v2

    .line 371
    .line 372
    move-object/from16 v2, v20

    .line 373
    .line 374
    check-cast v2, Lqn2;

    .line 375
    .line 376
    move-object/from16 v20, v11

    .line 377
    .line 378
    invoke-virtual {v3}, Lh7;->l()Lx01;

    .line 379
    .line 380
    .line 381
    move-result-object v11

    .line 382
    move/from16 v22, v15

    .line 383
    .line 384
    iget v15, v2, Lqn2;->f:I

    .line 385
    .line 386
    invoke-virtual {v11, v15}, Lx01;->a(I)Z

    .line 387
    .line 388
    .line 389
    move-result v11

    .line 390
    if-eqz v11, :cond_18

    .line 391
    .line 392
    invoke-virtual {v5}, Lb7;->getAndroidViewsHandler$ui()Lnc;

    .line 393
    .line 394
    .line 395
    move-result-object v11

    .line 396
    invoke-virtual {v11}, Lnc;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 397
    .line 398
    .line 399
    move-result-object v11

    .line 400
    iget-object v2, v2, Lqn2;->c:Lr61;

    .line 401
    .line 402
    invoke-virtual {v11, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    check-cast v2, Lic;

    .line 407
    .line 408
    const/4 v11, -0x1

    .line 409
    if-ne v15, v11, :cond_12

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_12
    if-eqz v2, :cond_13

    .line 413
    .line 414
    invoke-virtual {v13, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;)V

    .line 415
    .line 416
    .line 417
    goto :goto_9

    .line 418
    :cond_13
    invoke-virtual {v3}, Lh7;->l()Lx01;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-virtual {v2, v15}, Lx01;->b(I)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    check-cast v2, Lsn2;

    .line 427
    .line 428
    if-eqz v2, :cond_15

    .line 429
    .line 430
    iget-object v2, v2, Lsn2;->a:Lqn2;

    .line 431
    .line 432
    if-eqz v2, :cond_15

    .line 433
    .line 434
    invoke-virtual {v2}, Lqn2;->k()Lln2;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    sget-object v11, Lvn2;->o:Lyn2;

    .line 439
    .line 440
    iget-object v2, v2, Lln2;->h:Lrk1;

    .line 441
    .line 442
    invoke-virtual {v2, v11}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    if-nez v2, :cond_14

    .line 447
    .line 448
    move-object/from16 v2, p0

    .line 449
    .line 450
    :cond_14
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 451
    .line 452
    invoke-static {v2, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    goto :goto_8

    .line 457
    :cond_15
    const/4 v2, 0x0

    .line 458
    :goto_8
    if-nez v19, :cond_16

    .line 459
    .line 460
    if-nez v2, :cond_17

    .line 461
    .line 462
    :cond_16
    invoke-virtual {v13, v5, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 463
    .line 464
    .line 465
    :cond_17
    :goto_9
    invoke-virtual {v1, v15, v4}, Lxj1;->f(II)V

    .line 466
    .line 467
    .line 468
    add-int/lit8 v4, v4, 0x1

    .line 469
    .line 470
    :cond_18
    :goto_a
    add-int/lit8 v2, v21, 0x1

    .line 471
    .line 472
    move-object/from16 v11, v20

    .line 473
    .line 474
    move/from16 v15, v22

    .line 475
    .line 476
    goto :goto_7

    .line 477
    :cond_19
    iget v2, v3, Lh7;->r:I

    .line 478
    .line 479
    iget-object v4, v14, Ll4;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 480
    .line 481
    if-ne v0, v2, :cond_1a

    .line 482
    .line 483
    const/4 v2, 0x1

    .line 484
    invoke-virtual {v4, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 485
    .line 486
    .line 487
    sget-object v2, Lf4;->d:Lf4;

    .line 488
    .line 489
    invoke-virtual {v14, v2}, Ll4;->a(Lf4;)V

    .line 490
    .line 491
    .line 492
    goto :goto_b

    .line 493
    :cond_1a
    const/4 v2, 0x0

    .line 494
    invoke-virtual {v4, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 495
    .line 496
    .line 497
    sget-object v2, Lf4;->c:Lf4;

    .line 498
    .line 499
    invoke-virtual {v14, v2}, Ll4;->a(Lf4;)V

    .line 500
    .line 501
    .line 502
    :goto_b
    invoke-static {v7}, Lrg3;->B(Lqn2;)Lsd;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    if-eqz v2, :cond_38

    .line 507
    .line 508
    invoke-virtual {v5}, Lb7;->getFontFamilyResolver()Lxl0;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v5}, Lb7;->getDensity()Le70;

    .line 512
    .line 513
    .line 514
    move-result-object v22

    .line 515
    iget-object v11, v3, Lh7;->M:Lvu2;

    .line 516
    .line 517
    new-instance v15, Landroid/text/SpannableString;

    .line 518
    .line 519
    move-object/from16 v25, v5

    .line 520
    .line 521
    iget-object v5, v2, Lsd;->i:Ljava/lang/String;

    .line 522
    .line 523
    move-object/from16 v26, v6

    .line 524
    .line 525
    iget-object v6, v2, Lsd;->h:Ljava/util/List;

    .line 526
    .line 527
    invoke-direct {v15, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 528
    .line 529
    .line 530
    iget-object v2, v2, Lsd;->j:Ljava/util/ArrayList;

    .line 531
    .line 532
    move-object/from16 v27, v5

    .line 533
    .line 534
    if-eqz v2, :cond_26

    .line 535
    .line 536
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 537
    .line 538
    .line 539
    move-result v5

    .line 540
    move-object/from16 v28, v10

    .line 541
    .line 542
    const/4 v10, 0x0

    .line 543
    :goto_c
    if-ge v10, v5, :cond_25

    .line 544
    .line 545
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v19

    .line 549
    move-object/from16 v29, v2

    .line 550
    .line 551
    move-object/from16 v2, v19

    .line 552
    .line 553
    check-cast v2, Lrd;

    .line 554
    .line 555
    move/from16 v30, v5

    .line 556
    .line 557
    iget-object v5, v2, Lrd;->a:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v5, Llt2;

    .line 560
    .line 561
    move/from16 v31, v10

    .line 562
    .line 563
    iget v10, v2, Lrd;->b:I

    .line 564
    .line 565
    iget v2, v2, Lrd;->c:I

    .line 566
    .line 567
    move-object/from16 v32, v3

    .line 568
    .line 569
    iget-object v3, v5, Llt2;->a:Ll03;

    .line 570
    .line 571
    move-object/from16 v33, v1

    .line 572
    .line 573
    invoke-interface {v3}, Ll03;->b()J

    .line 574
    .line 575
    .line 576
    move-result-wide v0

    .line 577
    move-object/from16 v34, v12

    .line 578
    .line 579
    move-object v3, v13

    .line 580
    iget-wide v12, v5, Llt2;->b:J

    .line 581
    .line 582
    move-object/from16 v35, v3

    .line 583
    .line 584
    iget-object v3, v5, Llt2;->c:Lim0;

    .line 585
    .line 586
    move-object/from16 v36, v3

    .line 587
    .line 588
    iget-object v3, v5, Llt2;->d:Lgm0;

    .line 589
    .line 590
    move-wide/from16 v20, v12

    .line 591
    .line 592
    iget-object v12, v5, Llt2;->j:Lm03;

    .line 593
    .line 594
    iget-object v13, v5, Llt2;->k:Lkc1;

    .line 595
    .line 596
    move-object/from16 v37, v7

    .line 597
    .line 598
    move-object/from16 v38, v8

    .line 599
    .line 600
    iget-wide v7, v5, Llt2;->l:J

    .line 601
    .line 602
    move-wide/from16 v39, v7

    .line 603
    .line 604
    iget-object v7, v5, Llt2;->m:Lgz2;

    .line 605
    .line 606
    iget-object v5, v5, Llt2;->a:Ll03;

    .line 607
    .line 608
    move-object/from16 v41, v9

    .line 609
    .line 610
    invoke-interface {v5}, Ll03;->b()J

    .line 611
    .line 612
    .line 613
    move-result-wide v8

    .line 614
    invoke-static {v0, v1, v8, v9}, Lju;->c(JJ)Z

    .line 615
    .line 616
    .line 617
    move-result v8

    .line 618
    const-wide/16 v42, 0x10

    .line 619
    .line 620
    if-eqz v8, :cond_1b

    .line 621
    .line 622
    goto :goto_d

    .line 623
    :cond_1b
    cmp-long v5, v0, v42

    .line 624
    .line 625
    if-eqz v5, :cond_1c

    .line 626
    .line 627
    new-instance v5, Lwu;

    .line 628
    .line 629
    invoke-direct {v5, v0, v1}, Lwu;-><init>(J)V

    .line 630
    .line 631
    .line 632
    goto :goto_d

    .line 633
    :cond_1c
    sget-object v0, Lsn;->U:Lsn;

    .line 634
    .line 635
    move-object v5, v0

    .line 636
    :goto_d
    invoke-interface {v5}, Ll03;->b()J

    .line 637
    .line 638
    .line 639
    move-result-wide v0

    .line 640
    invoke-static {v15, v0, v1, v10, v2}, Leu;->W(Landroid/text/Spannable;JII)V

    .line 641
    .line 642
    .line 643
    move/from16 v24, v2

    .line 644
    .line 645
    move/from16 v23, v10

    .line 646
    .line 647
    move-object/from16 v19, v15

    .line 648
    .line 649
    invoke-static/range {v19 .. v24}, Leu;->X(Landroid/text/Spannable;JLe70;II)V

    .line 650
    .line 651
    .line 652
    move-object/from16 v0, v19

    .line 653
    .line 654
    move/from16 v1, v23

    .line 655
    .line 656
    if-nez v36, :cond_1e

    .line 657
    .line 658
    if-eqz v3, :cond_1d

    .line 659
    .line 660
    goto :goto_e

    .line 661
    :cond_1d
    const/16 v3, 0x21

    .line 662
    .line 663
    goto :goto_11

    .line 664
    :cond_1e
    :goto_e
    if-nez v36, :cond_1f

    .line 665
    .line 666
    sget-object v5, Lim0;->j:Lim0;

    .line 667
    .line 668
    goto :goto_f

    .line 669
    :cond_1f
    move-object/from16 v5, v36

    .line 670
    .line 671
    :goto_f
    if-eqz v3, :cond_20

    .line 672
    .line 673
    iget v3, v3, Lgm0;->a:I

    .line 674
    .line 675
    goto :goto_10

    .line 676
    :cond_20
    const/4 v3, 0x0

    .line 677
    :goto_10
    new-instance v8, Landroid/text/style/StyleSpan;

    .line 678
    .line 679
    invoke-static {v5, v3}, Ltl;->A(Lim0;I)I

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    invoke-direct {v8, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 684
    .line 685
    .line 686
    const/16 v3, 0x21

    .line 687
    .line 688
    invoke-virtual {v0, v8, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 689
    .line 690
    .line 691
    :goto_11
    if-eqz v7, :cond_22

    .line 692
    .line 693
    iget v5, v7, Lgz2;->a:I

    .line 694
    .line 695
    or-int/lit8 v7, v5, 0x1

    .line 696
    .line 697
    if-ne v7, v5, :cond_21

    .line 698
    .line 699
    new-instance v7, Landroid/text/style/UnderlineSpan;

    .line 700
    .line 701
    invoke-direct {v7}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v0, v7, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 705
    .line 706
    .line 707
    :cond_21
    or-int/lit8 v7, v5, 0x2

    .line 708
    .line 709
    if-ne v7, v5, :cond_22

    .line 710
    .line 711
    new-instance v5, Landroid/text/style/StrikethroughSpan;

    .line 712
    .line 713
    invoke-direct {v5}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v0, v5, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 717
    .line 718
    .line 719
    :cond_22
    if-eqz v12, :cond_23

    .line 720
    .line 721
    new-instance v5, Landroid/text/style/ScaleXSpan;

    .line 722
    .line 723
    iget v7, v12, Lm03;->a:F

    .line 724
    .line 725
    invoke-direct {v5, v7}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v0, v5, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 729
    .line 730
    .line 731
    :cond_23
    invoke-static {v0, v13, v1, v2}, Leu;->Y(Landroid/text/Spannable;Lkc1;II)V

    .line 732
    .line 733
    .line 734
    cmp-long v5, v39, v42

    .line 735
    .line 736
    if-eqz v5, :cond_24

    .line 737
    .line 738
    new-instance v5, Landroid/text/style/BackgroundColorSpan;

    .line 739
    .line 740
    invoke-static/range {v39 .. v40}, Lsp0;->j0(J)I

    .line 741
    .line 742
    .line 743
    move-result v7

    .line 744
    invoke-direct {v5, v7}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v0, v5, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 748
    .line 749
    .line 750
    :cond_24
    add-int/lit8 v10, v31, 0x1

    .line 751
    .line 752
    move-object v15, v0

    .line 753
    move-object/from16 v2, v29

    .line 754
    .line 755
    move/from16 v5, v30

    .line 756
    .line 757
    move-object/from16 v3, v32

    .line 758
    .line 759
    move-object/from16 v1, v33

    .line 760
    .line 761
    move-object/from16 v12, v34

    .line 762
    .line 763
    move-object/from16 v13, v35

    .line 764
    .line 765
    move-object/from16 v7, v37

    .line 766
    .line 767
    move-object/from16 v8, v38

    .line 768
    .line 769
    move-object/from16 v9, v41

    .line 770
    .line 771
    move/from16 v0, p1

    .line 772
    .line 773
    goto/16 :goto_c

    .line 774
    .line 775
    :cond_25
    :goto_12
    move-object/from16 v33, v1

    .line 776
    .line 777
    move-object/from16 v32, v3

    .line 778
    .line 779
    move-object/from16 v37, v7

    .line 780
    .line 781
    move-object/from16 v38, v8

    .line 782
    .line 783
    move-object/from16 v41, v9

    .line 784
    .line 785
    move-object/from16 v34, v12

    .line 786
    .line 787
    move-object/from16 v35, v13

    .line 788
    .line 789
    move-object v0, v15

    .line 790
    goto :goto_13

    .line 791
    :cond_26
    move-object/from16 v28, v10

    .line 792
    .line 793
    goto :goto_12

    .line 794
    :goto_13
    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->length()I

    .line 795
    .line 796
    .line 797
    move-result v1

    .line 798
    sget-object v2, Lbe0;->h:Lbe0;

    .line 799
    .line 800
    if-eqz v6, :cond_28

    .line 801
    .line 802
    new-instance v3, Ljava/util/ArrayList;

    .line 803
    .line 804
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 805
    .line 806
    .line 807
    move-result v5

    .line 808
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 809
    .line 810
    .line 811
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 812
    .line 813
    .line 814
    move-result v5

    .line 815
    const/4 v7, 0x0

    .line 816
    :goto_14
    if-ge v7, v5, :cond_29

    .line 817
    .line 818
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v8

    .line 822
    move-object v9, v8

    .line 823
    check-cast v9, Lrd;

    .line 824
    .line 825
    iget-object v10, v9, Lrd;->a:Ljava/lang/Object;

    .line 826
    .line 827
    instance-of v10, v10, Lha3;

    .line 828
    .line 829
    if-eqz v10, :cond_27

    .line 830
    .line 831
    iget v10, v9, Lrd;->b:I

    .line 832
    .line 833
    iget v9, v9, Lrd;->c:I

    .line 834
    .line 835
    const/4 v12, 0x0

    .line 836
    invoke-static {v12, v1, v10, v9}, Ltd;->b(IIII)Z

    .line 837
    .line 838
    .line 839
    move-result v9

    .line 840
    if-eqz v9, :cond_27

    .line 841
    .line 842
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    :cond_27
    add-int/lit8 v7, v7, 0x1

    .line 846
    .line 847
    goto :goto_14

    .line 848
    :cond_28
    move-object v3, v2

    .line 849
    :cond_29
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 850
    .line 851
    .line 852
    move-result v1

    .line 853
    const/4 v5, 0x0

    .line 854
    :goto_15
    if-ge v5, v1, :cond_2b

    .line 855
    .line 856
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v7

    .line 860
    check-cast v7, Lrd;

    .line 861
    .line 862
    iget-object v8, v7, Lrd;->a:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v8, Lha3;

    .line 865
    .line 866
    iget v9, v7, Lrd;->b:I

    .line 867
    .line 868
    iget v7, v7, Lrd;->c:I

    .line 869
    .line 870
    instance-of v10, v8, Lha3;

    .line 871
    .line 872
    if-eqz v10, :cond_2a

    .line 873
    .line 874
    new-instance v10, Landroid/text/style/TtsSpan$VerbatimBuilder;

    .line 875
    .line 876
    iget-object v8, v8, Lha3;->a:Ljava/lang/String;

    .line 877
    .line 878
    invoke-direct {v10, v8}, Landroid/text/style/TtsSpan$VerbatimBuilder;-><init>(Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v10}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    .line 882
    .line 883
    .line 884
    move-result-object v8

    .line 885
    const/16 v10, 0x21

    .line 886
    .line 887
    invoke-virtual {v0, v8, v9, v7, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 888
    .line 889
    .line 890
    add-int/lit8 v5, v5, 0x1

    .line 891
    .line 892
    goto :goto_15

    .line 893
    :cond_2a
    invoke-static {}, Lc80;->s()V

    .line 894
    .line 895
    .line 896
    return-object p0

    .line 897
    :cond_2b
    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->length()I

    .line 898
    .line 899
    .line 900
    move-result v1

    .line 901
    if-eqz v6, :cond_2d

    .line 902
    .line 903
    new-instance v3, Ljava/util/ArrayList;

    .line 904
    .line 905
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 906
    .line 907
    .line 908
    move-result v5

    .line 909
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 910
    .line 911
    .line 912
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 913
    .line 914
    .line 915
    move-result v5

    .line 916
    const/4 v7, 0x0

    .line 917
    :goto_16
    if-ge v7, v5, :cond_2e

    .line 918
    .line 919
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v8

    .line 923
    move-object v9, v8

    .line 924
    check-cast v9, Lrd;

    .line 925
    .line 926
    iget-object v10, v9, Lrd;->a:Ljava/lang/Object;

    .line 927
    .line 928
    instance-of v10, v10, Lv83;

    .line 929
    .line 930
    if-eqz v10, :cond_2c

    .line 931
    .line 932
    iget v10, v9, Lrd;->b:I

    .line 933
    .line 934
    iget v9, v9, Lrd;->c:I

    .line 935
    .line 936
    const/4 v12, 0x0

    .line 937
    invoke-static {v12, v1, v10, v9}, Ltd;->b(IIII)Z

    .line 938
    .line 939
    .line 940
    move-result v9

    .line 941
    if-eqz v9, :cond_2c

    .line 942
    .line 943
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    :cond_2c
    add-int/lit8 v7, v7, 0x1

    .line 947
    .line 948
    goto :goto_16

    .line 949
    :cond_2d
    move-object v3, v2

    .line 950
    :cond_2e
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 951
    .line 952
    .line 953
    move-result v1

    .line 954
    const/4 v5, 0x0

    .line 955
    :goto_17
    if-ge v5, v1, :cond_30

    .line 956
    .line 957
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v7

    .line 961
    check-cast v7, Lrd;

    .line 962
    .line 963
    iget-object v8, v7, Lrd;->a:Ljava/lang/Object;

    .line 964
    .line 965
    check-cast v8, Lv83;

    .line 966
    .line 967
    iget v9, v7, Lrd;->b:I

    .line 968
    .line 969
    iget v7, v7, Lrd;->c:I

    .line 970
    .line 971
    iget-object v10, v11, Lvu2;->a:Ljava/lang/Object;

    .line 972
    .line 973
    check-cast v10, Ljava/util/WeakHashMap;

    .line 974
    .line 975
    invoke-virtual {v10, v8}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v12

    .line 979
    if-nez v12, :cond_2f

    .line 980
    .line 981
    new-instance v12, Landroid/text/style/URLSpan;

    .line 982
    .line 983
    iget-object v13, v8, Lv83;->a:Ljava/lang/String;

    .line 984
    .line 985
    invoke-direct {v12, v13}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v10, v8, v12}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    :cond_2f
    check-cast v12, Landroid/text/style/URLSpan;

    .line 992
    .line 993
    const/16 v10, 0x21

    .line 994
    .line 995
    invoke-virtual {v0, v12, v9, v7, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 996
    .line 997
    .line 998
    add-int/lit8 v5, v5, 0x1

    .line 999
    .line 1000
    goto :goto_17

    .line 1001
    :cond_30
    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->length()I

    .line 1002
    .line 1003
    .line 1004
    move-result v1

    .line 1005
    if-eqz v6, :cond_32

    .line 1006
    .line 1007
    new-instance v2, Ljava/util/ArrayList;

    .line 1008
    .line 1009
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1010
    .line 1011
    .line 1012
    move-result v3

    .line 1013
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1014
    .line 1015
    .line 1016
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 1017
    .line 1018
    .line 1019
    move-result v3

    .line 1020
    const/4 v5, 0x0

    .line 1021
    :goto_18
    if-ge v5, v3, :cond_32

    .line 1022
    .line 1023
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v7

    .line 1027
    move-object v8, v7

    .line 1028
    check-cast v8, Lrd;

    .line 1029
    .line 1030
    iget-object v9, v8, Lrd;->a:Ljava/lang/Object;

    .line 1031
    .line 1032
    instance-of v9, v9, Lfb1;

    .line 1033
    .line 1034
    if-eqz v9, :cond_31

    .line 1035
    .line 1036
    iget v9, v8, Lrd;->b:I

    .line 1037
    .line 1038
    iget v8, v8, Lrd;->c:I

    .line 1039
    .line 1040
    const/4 v12, 0x0

    .line 1041
    invoke-static {v12, v1, v9, v8}, Ltd;->b(IIII)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v8

    .line 1045
    if-eqz v8, :cond_31

    .line 1046
    .line 1047
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1048
    .line 1049
    .line 1050
    :cond_31
    add-int/lit8 v5, v5, 0x1

    .line 1051
    .line 1052
    goto :goto_18

    .line 1053
    :cond_32
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1054
    .line 1055
    .line 1056
    move-result v1

    .line 1057
    const/4 v3, 0x0

    .line 1058
    :goto_19
    if-ge v3, v1, :cond_37

    .line 1059
    .line 1060
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v5

    .line 1064
    check-cast v5, Lrd;

    .line 1065
    .line 1066
    iget v6, v5, Lrd;->b:I

    .line 1067
    .line 1068
    iget-object v7, v5, Lrd;->a:Ljava/lang/Object;

    .line 1069
    .line 1070
    iget v8, v5, Lrd;->c:I

    .line 1071
    .line 1072
    if-eq v6, v8, :cond_36

    .line 1073
    .line 1074
    move-object v9, v7

    .line 1075
    check-cast v9, Lfb1;

    .line 1076
    .line 1077
    instance-of v10, v9, Leb1;

    .line 1078
    .line 1079
    if-eqz v10, :cond_34

    .line 1080
    .line 1081
    new-instance v5, Lrd;

    .line 1082
    .line 1083
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1084
    .line 1085
    .line 1086
    check-cast v7, Leb1;

    .line 1087
    .line 1088
    invoke-direct {v5, v6, v8, v7}, Lrd;-><init>(IILjava/lang/Object;)V

    .line 1089
    .line 1090
    .line 1091
    iget-object v9, v11, Lvu2;->b:Ljava/lang/Object;

    .line 1092
    .line 1093
    check-cast v9, Ljava/util/WeakHashMap;

    .line 1094
    .line 1095
    invoke-virtual {v9, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v10

    .line 1099
    if-nez v10, :cond_33

    .line 1100
    .line 1101
    new-instance v10, Landroid/text/style/URLSpan;

    .line 1102
    .line 1103
    iget-object v7, v7, Leb1;->a:Ljava/lang/String;

    .line 1104
    .line 1105
    invoke-direct {v10, v7}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v9, v5, v10}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    :cond_33
    check-cast v10, Landroid/text/style/URLSpan;

    .line 1112
    .line 1113
    const/16 v5, 0x21

    .line 1114
    .line 1115
    invoke-virtual {v0, v10, v6, v8, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1116
    .line 1117
    .line 1118
    goto :goto_1a

    .line 1119
    :cond_34
    iget-object v7, v11, Lvu2;->c:Ljava/lang/Object;

    .line 1120
    .line 1121
    check-cast v7, Ljava/util/WeakHashMap;

    .line 1122
    .line 1123
    invoke-virtual {v7, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v10

    .line 1127
    if-nez v10, :cond_35

    .line 1128
    .line 1129
    new-instance v10, Ltw;

    .line 1130
    .line 1131
    invoke-direct {v10, v9}, Ltw;-><init>(Lfb1;)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v7, v5, v10}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    :cond_35
    check-cast v10, Landroid/text/style/ClickableSpan;

    .line 1138
    .line 1139
    const/16 v5, 0x21

    .line 1140
    .line 1141
    invoke-virtual {v0, v10, v6, v8, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1142
    .line 1143
    .line 1144
    goto :goto_1a

    .line 1145
    :cond_36
    const/16 v5, 0x21

    .line 1146
    .line 1147
    :goto_1a
    add-int/lit8 v3, v3, 0x1

    .line 1148
    .line 1149
    goto :goto_19

    .line 1150
    :cond_37
    invoke-static {v0}, Lh7;->I(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    check-cast v0, Landroid/text/SpannableString;

    .line 1155
    .line 1156
    goto :goto_1b

    .line 1157
    :cond_38
    move-object/from16 v33, v1

    .line 1158
    .line 1159
    move-object/from16 v32, v3

    .line 1160
    .line 1161
    move-object/from16 v25, v5

    .line 1162
    .line 1163
    move-object/from16 v26, v6

    .line 1164
    .line 1165
    move-object/from16 v37, v7

    .line 1166
    .line 1167
    move-object/from16 v38, v8

    .line 1168
    .line 1169
    move-object/from16 v41, v9

    .line 1170
    .line 1171
    move-object/from16 v28, v10

    .line 1172
    .line 1173
    move-object/from16 v34, v12

    .line 1174
    .line 1175
    move-object/from16 v35, v13

    .line 1176
    .line 1177
    move-object/from16 v0, p0

    .line 1178
    .line 1179
    :goto_1b
    invoke-virtual {v4, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    .line 1180
    .line 1181
    .line 1182
    sget-object v0, Lvn2;->M:Lyn2;

    .line 1183
    .line 1184
    move-object/from16 v1, v38

    .line 1185
    .line 1186
    invoke-virtual {v1, v0}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 1187
    .line 1188
    .line 1189
    move-result v2

    .line 1190
    if-eqz v2, :cond_3a

    .line 1191
    .line 1192
    move-object/from16 v3, v35

    .line 1193
    .line 1194
    const/4 v2, 0x1

    .line 1195
    invoke-virtual {v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v1, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    if-nez v0, :cond_39

    .line 1203
    .line 1204
    move-object/from16 v0, p0

    .line 1205
    .line 1206
    :cond_39
    check-cast v0, Ljava/lang/CharSequence;

    .line 1207
    .line 1208
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    .line 1209
    .line 1210
    .line 1211
    :goto_1c
    move-object/from16 v0, v37

    .line 1212
    .line 1213
    move-object/from16 v2, v41

    .line 1214
    .line 1215
    goto :goto_1d

    .line 1216
    :cond_3a
    move-object/from16 v3, v35

    .line 1217
    .line 1218
    goto :goto_1c

    .line 1219
    :goto_1d
    invoke-static {v0, v2}, Lrg3;->A(Lqn2;Landroid/content/res/Resources;)Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v5

    .line 1223
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1224
    .line 1225
    const/16 v7, 0x1e

    .line 1226
    .line 1227
    if-lt v6, v7, :cond_3b

    .line 1228
    .line 1229
    invoke-static {v4, v5}, Lg4;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 1230
    .line 1231
    .line 1232
    goto :goto_1e

    .line 1233
    :cond_3b
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v6

    .line 1237
    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 1238
    .line 1239
    invoke-virtual {v6, v7, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 1240
    .line 1241
    .line 1242
    :goto_1e
    invoke-static {v0}, Lrg3;->z(Lqn2;)Z

    .line 1243
    .line 1244
    .line 1245
    move-result v5

    .line 1246
    invoke-virtual {v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 1247
    .line 1248
    .line 1249
    sget-object v5, Lvn2;->K:Lyn2;

    .line 1250
    .line 1251
    invoke-virtual {v1, v5}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v5

    .line 1255
    if-nez v5, :cond_3c

    .line 1256
    .line 1257
    move-object/from16 v5, p0

    .line 1258
    .line 1259
    :cond_3c
    check-cast v5, Lu23;

    .line 1260
    .line 1261
    if-eqz v5, :cond_3e

    .line 1262
    .line 1263
    sget-object v6, Lu23;->h:Lu23;

    .line 1264
    .line 1265
    if-ne v5, v6, :cond_3d

    .line 1266
    .line 1267
    const/4 v6, 0x1

    .line 1268
    invoke-virtual {v4, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1269
    .line 1270
    .line 1271
    goto :goto_1f

    .line 1272
    :cond_3d
    sget-object v6, Lu23;->i:Lu23;

    .line 1273
    .line 1274
    if-ne v5, v6, :cond_3e

    .line 1275
    .line 1276
    const/4 v12, 0x0

    .line 1277
    invoke-virtual {v4, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1278
    .line 1279
    .line 1280
    :cond_3e
    :goto_1f
    sget-object v5, Lvn2;->J:Lyn2;

    .line 1281
    .line 1282
    invoke-virtual {v1, v5}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v5

    .line 1286
    if-nez v5, :cond_3f

    .line 1287
    .line 1288
    move-object/from16 v5, p0

    .line 1289
    .line 1290
    :cond_3f
    check-cast v5, Ljava/lang/Boolean;

    .line 1291
    .line 1292
    if-eqz v5, :cond_40

    .line 1293
    .line 1294
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1295
    .line 1296
    .line 1297
    move-result v5

    .line 1298
    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1299
    .line 1300
    .line 1301
    :cond_40
    move-object/from16 v5, v34

    .line 1302
    .line 1303
    iget-boolean v6, v5, Lln2;->j:Z

    .line 1304
    .line 1305
    if-eqz v6, :cond_41

    .line 1306
    .line 1307
    const/4 v6, 0x4

    .line 1308
    invoke-static {v6, v0}, Lqn2;->j(ILqn2;)Ljava/util/List;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v7

    .line 1312
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 1313
    .line 1314
    .line 1315
    move-result v6

    .line 1316
    if-eqz v6, :cond_44

    .line 1317
    .line 1318
    :cond_41
    sget-object v6, Lvn2;->a:Lyn2;

    .line 1319
    .line 1320
    invoke-virtual {v1, v6}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v6

    .line 1324
    if-nez v6, :cond_42

    .line 1325
    .line 1326
    move-object/from16 v6, p0

    .line 1327
    .line 1328
    :cond_42
    check-cast v6, Ljava/util/List;

    .line 1329
    .line 1330
    if-eqz v6, :cond_43

    .line 1331
    .line 1332
    invoke-static {v6}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v6

    .line 1336
    check-cast v6, Ljava/lang/String;

    .line 1337
    .line 1338
    goto :goto_20

    .line 1339
    :cond_43
    move-object/from16 v6, p0

    .line 1340
    .line 1341
    :goto_20
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1342
    .line 1343
    .line 1344
    :cond_44
    sget-object v6, Lvn2;->A:Lyn2;

    .line 1345
    .line 1346
    invoke-virtual {v1, v6}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v6

    .line 1350
    if-nez v6, :cond_45

    .line 1351
    .line 1352
    move-object/from16 v6, p0

    .line 1353
    .line 1354
    :cond_45
    check-cast v6, Ljava/lang/String;

    .line 1355
    .line 1356
    if-eqz v6, :cond_48

    .line 1357
    .line 1358
    move-object v7, v0

    .line 1359
    :goto_21
    if-eqz v7, :cond_47

    .line 1360
    .line 1361
    iget-object v8, v7, Lqn2;->d:Lln2;

    .line 1362
    .line 1363
    sget-object v9, Lwn2;->a:Lyn2;

    .line 1364
    .line 1365
    iget-object v10, v8, Lln2;->h:Lrk1;

    .line 1366
    .line 1367
    invoke-virtual {v10, v9}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 1368
    .line 1369
    .line 1370
    move-result v10

    .line 1371
    if-eqz v10, :cond_46

    .line 1372
    .line 1373
    invoke-virtual {v8, v9}, Lln2;->c(Lyn2;)Ljava/lang/Object;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v7

    .line 1377
    check-cast v7, Ljava/lang/Boolean;

    .line 1378
    .line 1379
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1380
    .line 1381
    .line 1382
    move-result v7

    .line 1383
    goto :goto_22

    .line 1384
    :cond_46
    invoke-virtual {v7}, Lqn2;->l()Lqn2;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v7

    .line 1388
    goto :goto_21

    .line 1389
    :cond_47
    const/4 v7, 0x0

    .line 1390
    :goto_22
    if-eqz v7, :cond_48

    .line 1391
    .line 1392
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 1393
    .line 1394
    .line 1395
    :cond_48
    sget-object v6, Lvn2;->h:Lyn2;

    .line 1396
    .line 1397
    invoke-virtual {v1, v6}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v6

    .line 1401
    if-nez v6, :cond_49

    .line 1402
    .line 1403
    move-object/from16 v6, p0

    .line 1404
    .line 1405
    :cond_49
    check-cast v6, La83;

    .line 1406
    .line 1407
    const/16 v7, 0x1c

    .line 1408
    .line 1409
    const/4 v8, 0x2

    .line 1410
    if-eqz v6, :cond_4b

    .line 1411
    .line 1412
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1413
    .line 1414
    if-lt v6, v7, :cond_4a

    .line 1415
    .line 1416
    const/4 v6, 0x1

    .line 1417
    invoke-static {v4, v6}, La4;->C(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 1418
    .line 1419
    .line 1420
    goto :goto_23

    .line 1421
    :cond_4a
    const/4 v6, 0x1

    .line 1422
    invoke-virtual {v14, v8, v6}, Ll4;->f(IZ)V

    .line 1423
    .line 1424
    .line 1425
    :cond_4b
    :goto_23
    sget-object v6, Lvn2;->i:Lyn2;

    .line 1426
    .line 1427
    invoke-virtual {v1, v6}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v6

    .line 1431
    if-nez v6, :cond_4c

    .line 1432
    .line 1433
    move-object/from16 v6, p0

    .line 1434
    .line 1435
    :cond_4c
    check-cast v6, La83;

    .line 1436
    .line 1437
    const/16 v9, 0x1d

    .line 1438
    .line 1439
    if-eqz v6, :cond_4e

    .line 1440
    .line 1441
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1442
    .line 1443
    if-lt v6, v9, :cond_4d

    .line 1444
    .line 1445
    invoke-static {v3}, Lb4;->d(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 1446
    .line 1447
    .line 1448
    goto :goto_24

    .line 1449
    :cond_4d
    const/16 v6, 0x8

    .line 1450
    .line 1451
    const/4 v10, 0x1

    .line 1452
    invoke-virtual {v14, v6, v10}, Ll4;->f(IZ)V

    .line 1453
    .line 1454
    .line 1455
    :cond_4e
    :goto_24
    move/from16 v6, p1

    .line 1456
    .line 1457
    const/4 v11, -0x1

    .line 1458
    if-eq v6, v11, :cond_50

    .line 1459
    .line 1460
    iget v10, v0, Lqn2;->f:I

    .line 1461
    .line 1462
    move-object/from16 v12, v33

    .line 1463
    .line 1464
    invoke-virtual {v12, v10}, Lxj1;->d(I)I

    .line 1465
    .line 1466
    .line 1467
    move-result v10

    .line 1468
    if-eq v10, v11, :cond_4f

    .line 1469
    .line 1470
    invoke-virtual {v3, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDrawingOrder(I)V

    .line 1471
    .line 1472
    .line 1473
    goto :goto_25

    .line 1474
    :cond_4f
    const-string v10, "AccessibilityDelegate"

    .line 1475
    .line 1476
    const-string v11, "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"

    .line 1477
    .line 1478
    invoke-static {v10, v11}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1479
    .line 1480
    .line 1481
    :cond_50
    :goto_25
    sget-object v10, Lvn2;->L:Lyn2;

    .line 1482
    .line 1483
    invoke-virtual {v1, v10}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 1484
    .line 1485
    .line 1486
    move-result v10

    .line 1487
    invoke-virtual {v3, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    .line 1488
    .line 1489
    .line 1490
    sget-object v10, Lvn2;->O:Lyn2;

    .line 1491
    .line 1492
    invoke-virtual {v1, v10}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v10

    .line 1496
    if-nez v10, :cond_51

    .line 1497
    .line 1498
    move-object/from16 v10, p0

    .line 1499
    .line 1500
    :cond_51
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1501
    .line 1502
    invoke-static {v10, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1503
    .line 1504
    .line 1505
    move-result v10

    .line 1506
    invoke-virtual {v3, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    .line 1507
    .line 1508
    .line 1509
    sget-object v10, Lvn2;->P:Lyn2;

    .line 1510
    .line 1511
    invoke-static {v5, v10}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v10

    .line 1515
    check-cast v10, Ljava/lang/Integer;

    .line 1516
    .line 1517
    if-eqz v10, :cond_52

    .line 1518
    .line 1519
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 1520
    .line 1521
    .line 1522
    move-result v10

    .line 1523
    goto :goto_26

    .line 1524
    :cond_52
    const/4 v10, -0x1

    .line 1525
    :goto_26
    invoke-virtual {v3, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    .line 1526
    .line 1527
    .line 1528
    invoke-static {v0}, Lrg3;->j(Lqn2;)Z

    .line 1529
    .line 1530
    .line 1531
    move-result v10

    .line 1532
    invoke-virtual {v3, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 1533
    .line 1534
    .line 1535
    sget-object v10, Lvn2;->l:Lyn2;

    .line 1536
    .line 1537
    invoke-virtual {v1, v10}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 1538
    .line 1539
    .line 1540
    move-result v12

    .line 1541
    invoke-virtual {v3, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 1545
    .line 1546
    .line 1547
    move-result v12

    .line 1548
    if-eqz v12, :cond_54

    .line 1549
    .line 1550
    invoke-virtual {v5, v10}, Lln2;->c(Lyn2;)Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v12

    .line 1554
    check-cast v12, Ljava/lang/Boolean;

    .line 1555
    .line 1556
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1557
    .line 1558
    .line 1559
    move-result v12

    .line 1560
    invoke-virtual {v3, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 1561
    .line 1562
    .line 1563
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 1564
    .line 1565
    .line 1566
    move-result v12

    .line 1567
    if-eqz v12, :cond_53

    .line 1568
    .line 1569
    invoke-virtual {v4, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1570
    .line 1571
    .line 1572
    move-object/from16 v12, v32

    .line 1573
    .line 1574
    iput v6, v12, Lh7;->s:I

    .line 1575
    .line 1576
    :goto_27
    const/4 v13, 0x1

    .line 1577
    goto :goto_28

    .line 1578
    :cond_53
    move-object/from16 v12, v32

    .line 1579
    .line 1580
    const/4 v13, 0x1

    .line 1581
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1582
    .line 1583
    .line 1584
    goto :goto_28

    .line 1585
    :cond_54
    move-object/from16 v12, v32

    .line 1586
    .line 1587
    goto :goto_27

    .line 1588
    :goto_28
    invoke-static {v0}, Lxe1;->L(Lqn2;)Z

    .line 1589
    .line 1590
    .line 1591
    move-result v15

    .line 1592
    xor-int/2addr v15, v13

    .line 1593
    invoke-virtual {v4, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1594
    .line 1595
    .line 1596
    invoke-virtual {v0}, Lqn2;->o()Z

    .line 1597
    .line 1598
    .line 1599
    move-result v13

    .line 1600
    if-eqz v13, :cond_55

    .line 1601
    .line 1602
    invoke-virtual {v0}, Lqn2;->l()Lqn2;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v13

    .line 1606
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1607
    .line 1608
    .line 1609
    goto :goto_29

    .line 1610
    :cond_55
    move-object v13, v0

    .line 1611
    :goto_29
    invoke-virtual {v13}, Lqn2;->m()Lo62;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v13

    .line 1615
    invoke-virtual {v13}, Lo62;->f()Z

    .line 1616
    .line 1617
    .line 1618
    move-result v13

    .line 1619
    if-eqz v13, :cond_56

    .line 1620
    .line 1621
    const/4 v13, 0x0

    .line 1622
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1623
    .line 1624
    .line 1625
    goto :goto_2a

    .line 1626
    :cond_56
    const/4 v13, 0x0

    .line 1627
    :goto_2a
    sget-object v15, Lvn2;->k:Lyn2;

    .line 1628
    .line 1629
    invoke-static {v5, v15}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v15

    .line 1633
    invoke-static {v15}, Lvi0;->t(Ljava/lang/Object;)V

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1637
    .line 1638
    .line 1639
    sget-object v13, Lkn2;->b:Lyn2;

    .line 1640
    .line 1641
    invoke-static {v5, v13}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v13

    .line 1645
    check-cast v13, Lq3;

    .line 1646
    .line 1647
    const/16 v15, 0x10

    .line 1648
    .line 1649
    move/from16 v19, v8

    .line 1650
    .line 1651
    if-eqz v13, :cond_57

    .line 1652
    .line 1653
    sget-object v8, Lvn2;->J:Lyn2;

    .line 1654
    .line 1655
    invoke-static {v5, v8}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v8

    .line 1659
    invoke-static {v8, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1660
    .line 1661
    .line 1662
    const/4 v8, 0x1

    .line 1663
    invoke-virtual {v4, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1664
    .line 1665
    .line 1666
    invoke-static {v0}, Lrg3;->j(Lqn2;)Z

    .line 1667
    .line 1668
    .line 1669
    move-result v8

    .line 1670
    if-eqz v8, :cond_57

    .line 1671
    .line 1672
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    .line 1673
    .line 1674
    .line 1675
    move-result v8

    .line 1676
    if-eqz v8, :cond_57

    .line 1677
    .line 1678
    new-instance v8, Lf4;

    .line 1679
    .line 1680
    iget-object v13, v13, Lq3;->a:Ljava/lang/String;

    .line 1681
    .line 1682
    invoke-direct {v8, v13, v15}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual {v14, v8}, Ll4;->a(Lf4;)V

    .line 1686
    .line 1687
    .line 1688
    :cond_57
    const/4 v13, 0x0

    .line 1689
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1690
    .line 1691
    .line 1692
    sget-object v8, Lkn2;->c:Lyn2;

    .line 1693
    .line 1694
    invoke-static {v5, v8}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v8

    .line 1698
    check-cast v8, Lq3;

    .line 1699
    .line 1700
    if-eqz v8, :cond_58

    .line 1701
    .line 1702
    const/4 v13, 0x1

    .line 1703
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1704
    .line 1705
    .line 1706
    invoke-static {v0}, Lrg3;->j(Lqn2;)Z

    .line 1707
    .line 1708
    .line 1709
    move-result v13

    .line 1710
    if-eqz v13, :cond_58

    .line 1711
    .line 1712
    new-instance v13, Lf4;

    .line 1713
    .line 1714
    const/16 v15, 0x20

    .line 1715
    .line 1716
    iget-object v8, v8, Lq3;->a:Ljava/lang/String;

    .line 1717
    .line 1718
    invoke-direct {v13, v8, v15}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 1719
    .line 1720
    .line 1721
    invoke-virtual {v14, v13}, Ll4;->a(Lf4;)V

    .line 1722
    .line 1723
    .line 1724
    :cond_58
    sget-object v8, Lkn2;->q:Lyn2;

    .line 1725
    .line 1726
    invoke-static {v5, v8}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v8

    .line 1730
    check-cast v8, Lq3;

    .line 1731
    .line 1732
    if-eqz v8, :cond_59

    .line 1733
    .line 1734
    new-instance v13, Lf4;

    .line 1735
    .line 1736
    const/16 v15, 0x4000

    .line 1737
    .line 1738
    iget-object v8, v8, Lq3;->a:Ljava/lang/String;

    .line 1739
    .line 1740
    invoke-direct {v13, v8, v15}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 1741
    .line 1742
    .line 1743
    invoke-virtual {v14, v13}, Ll4;->a(Lf4;)V

    .line 1744
    .line 1745
    .line 1746
    :cond_59
    invoke-static {v0}, Lrg3;->j(Lqn2;)Z

    .line 1747
    .line 1748
    .line 1749
    move-result v8

    .line 1750
    if-eqz v8, :cond_5e

    .line 1751
    .line 1752
    sget-object v8, Lkn2;->k:Lyn2;

    .line 1753
    .line 1754
    invoke-static {v5, v8}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v8

    .line 1758
    check-cast v8, Lq3;

    .line 1759
    .line 1760
    if-eqz v8, :cond_5a

    .line 1761
    .line 1762
    new-instance v13, Lf4;

    .line 1763
    .line 1764
    const/high16 v15, 0x200000

    .line 1765
    .line 1766
    iget-object v8, v8, Lq3;->a:Ljava/lang/String;

    .line 1767
    .line 1768
    invoke-direct {v13, v8, v15}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 1769
    .line 1770
    .line 1771
    invoke-virtual {v14, v13}, Ll4;->a(Lf4;)V

    .line 1772
    .line 1773
    .line 1774
    :cond_5a
    sget-object v8, Lkn2;->p:Lyn2;

    .line 1775
    .line 1776
    invoke-static {v5, v8}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v8

    .line 1780
    check-cast v8, Lq3;

    .line 1781
    .line 1782
    if-eqz v8, :cond_5b

    .line 1783
    .line 1784
    new-instance v13, Lf4;

    .line 1785
    .line 1786
    const v15, 0x1020054

    .line 1787
    .line 1788
    .line 1789
    iget-object v8, v8, Lq3;->a:Ljava/lang/String;

    .line 1790
    .line 1791
    invoke-direct {v13, v8, v15}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 1792
    .line 1793
    .line 1794
    invoke-virtual {v14, v13}, Ll4;->a(Lf4;)V

    .line 1795
    .line 1796
    .line 1797
    :cond_5b
    sget-object v8, Lkn2;->r:Lyn2;

    .line 1798
    .line 1799
    invoke-static {v5, v8}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v8

    .line 1803
    check-cast v8, Lq3;

    .line 1804
    .line 1805
    if-eqz v8, :cond_5c

    .line 1806
    .line 1807
    new-instance v13, Lf4;

    .line 1808
    .line 1809
    const/high16 v15, 0x10000

    .line 1810
    .line 1811
    iget-object v8, v8, Lq3;->a:Ljava/lang/String;

    .line 1812
    .line 1813
    invoke-direct {v13, v8, v15}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {v14, v13}, Ll4;->a(Lf4;)V

    .line 1817
    .line 1818
    .line 1819
    :cond_5c
    sget-object v8, Lkn2;->s:Lyn2;

    .line 1820
    .line 1821
    invoke-static {v5, v8}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v8

    .line 1825
    check-cast v8, Lq3;

    .line 1826
    .line 1827
    if-eqz v8, :cond_5e

    .line 1828
    .line 1829
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 1830
    .line 1831
    .line 1832
    move-result v13

    .line 1833
    if-eqz v13, :cond_5e

    .line 1834
    .line 1835
    invoke-virtual/range {v25 .. v25}, Lb7;->getClipboardManager()Lj6;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v13

    .line 1839
    invoke-virtual {v13}, Lj6;->a()Landroid/content/ClipboardManager;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v13

    .line 1843
    invoke-virtual {v13}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v13

    .line 1847
    if-eqz v13, :cond_5d

    .line 1848
    .line 1849
    const-string v15, "text/*"

    .line 1850
    .line 1851
    invoke-virtual {v13, v15}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 1852
    .line 1853
    .line 1854
    move-result v13

    .line 1855
    goto :goto_2b

    .line 1856
    :cond_5d
    const/4 v13, 0x0

    .line 1857
    :goto_2b
    if-eqz v13, :cond_5e

    .line 1858
    .line 1859
    new-instance v13, Lf4;

    .line 1860
    .line 1861
    const v15, 0x8000

    .line 1862
    .line 1863
    .line 1864
    iget-object v8, v8, Lq3;->a:Ljava/lang/String;

    .line 1865
    .line 1866
    invoke-direct {v13, v8, v15}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 1867
    .line 1868
    .line 1869
    invoke-virtual {v14, v13}, Ll4;->a(Lf4;)V

    .line 1870
    .line 1871
    .line 1872
    :cond_5e
    invoke-static {v0}, Lh7;->m(Lqn2;)Ljava/lang/String;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v8

    .line 1876
    if-eqz v8, :cond_60

    .line 1877
    .line 1878
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1879
    .line 1880
    .line 1881
    move-result v8

    .line 1882
    if-nez v8, :cond_5f

    .line 1883
    .line 1884
    goto :goto_2c

    .line 1885
    :cond_5f
    const/4 v8, 0x0

    .line 1886
    goto :goto_2d

    .line 1887
    :cond_60
    :goto_2c
    const/4 v8, 0x1

    .line 1888
    :goto_2d
    if-nez v8, :cond_6b

    .line 1889
    .line 1890
    invoke-virtual {v12, v0}, Lh7;->k(Lqn2;)I

    .line 1891
    .line 1892
    .line 1893
    move-result v8

    .line 1894
    invoke-virtual {v12, v0}, Lh7;->j(Lqn2;)I

    .line 1895
    .line 1896
    .line 1897
    move-result v13

    .line 1898
    invoke-virtual {v3, v8, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    .line 1899
    .line 1900
    .line 1901
    sget-object v8, Lkn2;->j:Lyn2;

    .line 1902
    .line 1903
    invoke-static {v5, v8}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v8

    .line 1907
    check-cast v8, Lq3;

    .line 1908
    .line 1909
    new-instance v13, Lf4;

    .line 1910
    .line 1911
    if-eqz v8, :cond_61

    .line 1912
    .line 1913
    iget-object v8, v8, Lq3;->a:Ljava/lang/String;

    .line 1914
    .line 1915
    goto :goto_2e

    .line 1916
    :cond_61
    move-object/from16 v8, p0

    .line 1917
    .line 1918
    :goto_2e
    const/high16 v15, 0x20000

    .line 1919
    .line 1920
    invoke-direct {v13, v8, v15}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 1921
    .line 1922
    .line 1923
    invoke-virtual {v14, v13}, Ll4;->a(Lf4;)V

    .line 1924
    .line 1925
    .line 1926
    const/16 v8, 0x100

    .line 1927
    .line 1928
    invoke-virtual {v4, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1929
    .line 1930
    .line 1931
    const/16 v8, 0x200

    .line 1932
    .line 1933
    invoke-virtual {v4, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1934
    .line 1935
    .line 1936
    const/16 v8, 0xb

    .line 1937
    .line 1938
    invoke-virtual {v4, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 1939
    .line 1940
    .line 1941
    sget-object v8, Lvn2;->a:Lyn2;

    .line 1942
    .line 1943
    invoke-static {v5, v8}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v8

    .line 1947
    check-cast v8, Ljava/util/List;

    .line 1948
    .line 1949
    if-eqz v8, :cond_63

    .line 1950
    .line 1951
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 1952
    .line 1953
    .line 1954
    move-result v8

    .line 1955
    if-eqz v8, :cond_62

    .line 1956
    .line 1957
    goto :goto_2f

    .line 1958
    :cond_62
    const/4 v8, 0x0

    .line 1959
    goto :goto_30

    .line 1960
    :cond_63
    :goto_2f
    const/4 v8, 0x1

    .line 1961
    :goto_30
    if-eqz v8, :cond_6b

    .line 1962
    .line 1963
    sget-object v8, Lkn2;->a:Lyn2;

    .line 1964
    .line 1965
    invoke-virtual {v1, v8}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 1966
    .line 1967
    .line 1968
    move-result v8

    .line 1969
    if-eqz v8, :cond_6b

    .line 1970
    .line 1971
    sget-object v8, Lvn2;->G:Lyn2;

    .line 1972
    .line 1973
    invoke-virtual {v1, v8}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 1974
    .line 1975
    .line 1976
    move-result v8

    .line 1977
    if-eqz v8, :cond_64

    .line 1978
    .line 1979
    invoke-static {v5, v10}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v8

    .line 1983
    invoke-static {v8, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1984
    .line 1985
    .line 1986
    move-result v8

    .line 1987
    if-nez v8, :cond_64

    .line 1988
    .line 1989
    goto :goto_35

    .line 1990
    :cond_64
    invoke-virtual/range {v28 .. v28}, Lr61;->u()Lr61;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v8

    .line 1994
    :goto_31
    if-eqz v8, :cond_67

    .line 1995
    .line 1996
    invoke-virtual {v8}, Lr61;->w()Lln2;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v10

    .line 2000
    if-eqz v10, :cond_65

    .line 2001
    .line 2002
    iget-boolean v11, v10, Lln2;->j:Z

    .line 2003
    .line 2004
    const/4 v13, 0x1

    .line 2005
    if-ne v11, v13, :cond_65

    .line 2006
    .line 2007
    sget-object v11, Lvn2;->G:Lyn2;

    .line 2008
    .line 2009
    iget-object v10, v10, Lln2;->h:Lrk1;

    .line 2010
    .line 2011
    invoke-virtual {v10, v11}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 2012
    .line 2013
    .line 2014
    move-result v10

    .line 2015
    if-eqz v10, :cond_65

    .line 2016
    .line 2017
    const/4 v10, 0x1

    .line 2018
    goto :goto_32

    .line 2019
    :cond_65
    const/4 v10, 0x0

    .line 2020
    :goto_32
    if-eqz v10, :cond_66

    .line 2021
    .line 2022
    goto :goto_33

    .line 2023
    :cond_66
    invoke-virtual {v8}, Lr61;->u()Lr61;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v8

    .line 2027
    goto :goto_31

    .line 2028
    :cond_67
    move-object/from16 v8, p0

    .line 2029
    .line 2030
    :goto_33
    if-eqz v8, :cond_6a

    .line 2031
    .line 2032
    invoke-virtual {v8}, Lr61;->w()Lln2;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v8

    .line 2036
    if-eqz v8, :cond_69

    .line 2037
    .line 2038
    sget-object v10, Lvn2;->l:Lyn2;

    .line 2039
    .line 2040
    iget-object v8, v8, Lln2;->h:Lrk1;

    .line 2041
    .line 2042
    invoke-virtual {v8, v10}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v8

    .line 2046
    if-nez v8, :cond_68

    .line 2047
    .line 2048
    move-object/from16 v8, p0

    .line 2049
    .line 2050
    :cond_68
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2051
    .line 2052
    invoke-static {v8, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2053
    .line 2054
    .line 2055
    move-result v8

    .line 2056
    goto :goto_34

    .line 2057
    :cond_69
    const/4 v8, 0x0

    .line 2058
    :goto_34
    if-nez v8, :cond_6a

    .line 2059
    .line 2060
    :goto_35
    const/4 v8, 0x1

    .line 2061
    goto :goto_36

    .line 2062
    :cond_6a
    const/4 v8, 0x0

    .line 2063
    :goto_36
    if-nez v8, :cond_6b

    .line 2064
    .line 2065
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    .line 2066
    .line 2067
    .line 2068
    move-result v8

    .line 2069
    or-int/lit8 v8, v8, 0x14

    .line 2070
    .line 2071
    invoke-virtual {v4, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 2072
    .line 2073
    .line 2074
    :cond_6b
    new-instance v8, Ljava/util/ArrayList;

    .line 2075
    .line 2076
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2077
    .line 2078
    .line 2079
    const-string v10, "androidx.compose.ui.semantics.id"

    .line 2080
    .line 2081
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2082
    .line 2083
    .line 2084
    invoke-virtual {v14}, Ll4;->e()Ljava/lang/CharSequence;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v10

    .line 2088
    if-eqz v10, :cond_6d

    .line 2089
    .line 2090
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 2091
    .line 2092
    .line 2093
    move-result v10

    .line 2094
    if-nez v10, :cond_6c

    .line 2095
    .line 2096
    goto :goto_37

    .line 2097
    :cond_6c
    const/4 v10, 0x0

    .line 2098
    goto :goto_38

    .line 2099
    :cond_6d
    :goto_37
    const/4 v10, 0x1

    .line 2100
    :goto_38
    if-nez v10, :cond_6e

    .line 2101
    .line 2102
    sget-object v10, Lkn2;->a:Lyn2;

    .line 2103
    .line 2104
    invoke-virtual {v1, v10}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 2105
    .line 2106
    .line 2107
    move-result v10

    .line 2108
    if-eqz v10, :cond_6e

    .line 2109
    .line 2110
    const-string v10, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 2111
    .line 2112
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2113
    .line 2114
    .line 2115
    :cond_6e
    sget-object v10, Lvn2;->A:Lyn2;

    .line 2116
    .line 2117
    invoke-virtual {v1, v10}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 2118
    .line 2119
    .line 2120
    move-result v10

    .line 2121
    if-eqz v10, :cond_6f

    .line 2122
    .line 2123
    const-string v10, "androidx.compose.ui.semantics.testTag"

    .line 2124
    .line 2125
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2126
    .line 2127
    .line 2128
    :cond_6f
    sget-object v10, Lvn2;->Q:Lyn2;

    .line 2129
    .line 2130
    invoke-virtual {v1, v10}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 2131
    .line 2132
    .line 2133
    move-result v10

    .line 2134
    if-eqz v10, :cond_70

    .line 2135
    .line 2136
    const-string v10, "androidx.compose.ui.semantics.shapeType"

    .line 2137
    .line 2138
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2139
    .line 2140
    .line 2141
    const-string v10, "androidx.compose.ui.semantics.shapeRect"

    .line 2142
    .line 2143
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2144
    .line 2145
    .line 2146
    const-string v10, "androidx.compose.ui.semantics.shapeCorners"

    .line 2147
    .line 2148
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2149
    .line 2150
    .line 2151
    const-string v10, "androidx.compose.ui.semantics.shapeRegion"

    .line 2152
    .line 2153
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2154
    .line 2155
    .line 2156
    :cond_70
    invoke-virtual {v3, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAvailableExtraData(Ljava/util/List;)V

    .line 2157
    .line 2158
    .line 2159
    sget-object v3, Lvn2;->c:Lyn2;

    .line 2160
    .line 2161
    invoke-static {v5, v3}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 2162
    .line 2163
    .line 2164
    move-result-object v3

    .line 2165
    check-cast v3, Ls32;

    .line 2166
    .line 2167
    if-eqz v3, :cond_75

    .line 2168
    .line 2169
    iget v5, v3, Ls32;->a:F

    .line 2170
    .line 2171
    iget-object v8, v3, Ls32;->b:Ltt;

    .line 2172
    .line 2173
    sget-object v10, Lkn2;->i:Lyn2;

    .line 2174
    .line 2175
    invoke-virtual {v1, v10}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 2176
    .line 2177
    .line 2178
    move-result v11

    .line 2179
    if-eqz v11, :cond_71

    .line 2180
    .line 2181
    const-string v11, "android.widget.SeekBar"

    .line 2182
    .line 2183
    invoke-virtual {v14, v11}, Ll4;->g(Ljava/lang/String;)V

    .line 2184
    .line 2185
    .line 2186
    goto :goto_39

    .line 2187
    :cond_71
    const-string v11, "android.widget.ProgressBar"

    .line 2188
    .line 2189
    invoke-virtual {v14, v11}, Ll4;->g(Ljava/lang/String;)V

    .line 2190
    .line 2191
    .line 2192
    :goto_39
    sget-object v11, Ls32;->c:Ls32;

    .line 2193
    .line 2194
    if-eq v3, v11, :cond_72

    .line 2195
    .line 2196
    iget v3, v8, Ltt;->a:F

    .line 2197
    .line 2198
    new-instance v11, Lk4;

    .line 2199
    .line 2200
    const/4 v13, 0x0

    .line 2201
    const/4 v15, 0x1

    .line 2202
    invoke-static {v15, v13, v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v3

    .line 2206
    invoke-direct {v11, v3}, Lk4;-><init>(Ljava/lang/Object;)V

    .line 2207
    .line 2208
    .line 2209
    iget-object v3, v11, Lk4;->h:Ljava/lang/Object;

    .line 2210
    .line 2211
    check-cast v3, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    .line 2212
    .line 2213
    invoke-virtual {v4, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 2214
    .line 2215
    .line 2216
    :cond_72
    invoke-virtual {v1, v10}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 2217
    .line 2218
    .line 2219
    move-result v1

    .line 2220
    if-eqz v1, :cond_75

    .line 2221
    .line 2222
    invoke-static {v0}, Lrg3;->j(Lqn2;)Z

    .line 2223
    .line 2224
    .line 2225
    move-result v1

    .line 2226
    if-eqz v1, :cond_75

    .line 2227
    .line 2228
    iget v1, v8, Ltt;->a:F

    .line 2229
    .line 2230
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v1

    .line 2234
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 2235
    .line 2236
    .line 2237
    move-result v1

    .line 2238
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->floatValue()F

    .line 2239
    .line 2240
    .line 2241
    move-result v3

    .line 2242
    invoke-static {v1, v3}, Lci0;->A(FF)F

    .line 2243
    .line 2244
    .line 2245
    move-result v1

    .line 2246
    cmpg-float v1, v5, v1

    .line 2247
    .line 2248
    if-gez v1, :cond_73

    .line 2249
    .line 2250
    sget-object v1, Lf4;->e:Lf4;

    .line 2251
    .line 2252
    invoke-virtual {v14, v1}, Ll4;->a(Lf4;)V

    .line 2253
    .line 2254
    .line 2255
    :cond_73
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->floatValue()F

    .line 2256
    .line 2257
    .line 2258
    move-result v1

    .line 2259
    iget v3, v8, Ltt;->a:F

    .line 2260
    .line 2261
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v3

    .line 2265
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 2266
    .line 2267
    .line 2268
    move-result v3

    .line 2269
    cmpl-float v8, v1, v3

    .line 2270
    .line 2271
    if-lez v8, :cond_74

    .line 2272
    .line 2273
    move v1, v3

    .line 2274
    :cond_74
    cmpl-float v1, v5, v1

    .line 2275
    .line 2276
    if-lez v1, :cond_75

    .line 2277
    .line 2278
    sget-object v1, Lf4;->f:Lf4;

    .line 2279
    .line 2280
    invoke-virtual {v14, v1}, Ll4;->a(Lf4;)V

    .line 2281
    .line 2282
    .line 2283
    :cond_75
    invoke-static {v14, v0}, Lfg1;->j(Ll4;Lqn2;)V

    .line 2284
    .line 2285
    .line 2286
    invoke-static {v14, v0}, Lrp0;->k0(Ll4;Lqn2;)V

    .line 2287
    .line 2288
    .line 2289
    invoke-virtual {v0}, Lqn2;->k()Lln2;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v1

    .line 2293
    sget-object v3, Lvn2;->g:Lyn2;

    .line 2294
    .line 2295
    iget-object v1, v1, Lln2;->h:Lrk1;

    .line 2296
    .line 2297
    invoke-virtual {v1, v3}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2298
    .line 2299
    .line 2300
    move-result-object v1

    .line 2301
    if-nez v1, :cond_76

    .line 2302
    .line 2303
    move-object/from16 v1, p0

    .line 2304
    .line 2305
    :cond_76
    if-nez v1, :cond_81

    .line 2306
    .line 2307
    invoke-virtual {v0}, Lqn2;->l()Lqn2;

    .line 2308
    .line 2309
    .line 2310
    move-result-object v1

    .line 2311
    if-nez v1, :cond_77

    .line 2312
    .line 2313
    goto/16 :goto_3d

    .line 2314
    .line 2315
    :cond_77
    invoke-virtual {v1}, Lqn2;->k()Lln2;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v3

    .line 2319
    sget-object v5, Lvn2;->e:Lyn2;

    .line 2320
    .line 2321
    iget-object v3, v3, Lln2;->h:Lrk1;

    .line 2322
    .line 2323
    invoke-virtual {v3, v5}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2324
    .line 2325
    .line 2326
    move-result-object v3

    .line 2327
    if-nez v3, :cond_78

    .line 2328
    .line 2329
    move-object/from16 v3, p0

    .line 2330
    .line 2331
    :cond_78
    if-eqz v3, :cond_82

    .line 2332
    .line 2333
    invoke-virtual {v1}, Lqn2;->k()Lln2;

    .line 2334
    .line 2335
    .line 2336
    move-result-object v3

    .line 2337
    sget-object v5, Lvn2;->f:Lyn2;

    .line 2338
    .line 2339
    iget-object v3, v3, Lln2;->h:Lrk1;

    .line 2340
    .line 2341
    invoke-virtual {v3, v5}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2342
    .line 2343
    .line 2344
    move-result-object v3

    .line 2345
    if-nez v3, :cond_79

    .line 2346
    .line 2347
    move-object/from16 v3, p0

    .line 2348
    .line 2349
    :cond_79
    check-cast v3, Lzt;

    .line 2350
    .line 2351
    if-eqz v3, :cond_7a

    .line 2352
    .line 2353
    iget v5, v3, Lzt;->a:I

    .line 2354
    .line 2355
    if-ltz v5, :cond_82

    .line 2356
    .line 2357
    iget v3, v3, Lzt;->b:I

    .line 2358
    .line 2359
    if-gez v3, :cond_7a

    .line 2360
    .line 2361
    goto/16 :goto_3d

    .line 2362
    .line 2363
    :cond_7a
    invoke-virtual {v0}, Lqn2;->k()Lln2;

    .line 2364
    .line 2365
    .line 2366
    move-result-object v3

    .line 2367
    sget-object v5, Lvn2;->J:Lyn2;

    .line 2368
    .line 2369
    iget-object v3, v3, Lln2;->h:Lrk1;

    .line 2370
    .line 2371
    invoke-virtual {v3, v5}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 2372
    .line 2373
    .line 2374
    move-result v3

    .line 2375
    if-nez v3, :cond_7b

    .line 2376
    .line 2377
    goto/16 :goto_3d

    .line 2378
    .line 2379
    :cond_7b
    new-instance v3, Ljava/util/ArrayList;

    .line 2380
    .line 2381
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2382
    .line 2383
    .line 2384
    const/4 v5, 0x4

    .line 2385
    invoke-static {v5, v1}, Lqn2;->j(ILqn2;)Ljava/util/List;

    .line 2386
    .line 2387
    .line 2388
    move-result-object v1

    .line 2389
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 2390
    .line 2391
    .line 2392
    move-result v5

    .line 2393
    const/4 v8, 0x0

    .line 2394
    const/4 v10, 0x0

    .line 2395
    :goto_3a
    if-ge v8, v5, :cond_7d

    .line 2396
    .line 2397
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2398
    .line 2399
    .line 2400
    move-result-object v11

    .line 2401
    check-cast v11, Lqn2;

    .line 2402
    .line 2403
    invoke-virtual {v11}, Lqn2;->k()Lln2;

    .line 2404
    .line 2405
    .line 2406
    move-result-object v13

    .line 2407
    sget-object v15, Lvn2;->J:Lyn2;

    .line 2408
    .line 2409
    iget-object v13, v13, Lln2;->h:Lrk1;

    .line 2410
    .line 2411
    invoke-virtual {v13, v15}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 2412
    .line 2413
    .line 2414
    move-result v13

    .line 2415
    if-eqz v13, :cond_7c

    .line 2416
    .line 2417
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2418
    .line 2419
    .line 2420
    iget-object v11, v11, Lqn2;->c:Lr61;

    .line 2421
    .line 2422
    invoke-virtual {v11}, Lr61;->v()I

    .line 2423
    .line 2424
    .line 2425
    move-result v11

    .line 2426
    iget-object v13, v0, Lqn2;->c:Lr61;

    .line 2427
    .line 2428
    invoke-virtual {v13}, Lr61;->v()I

    .line 2429
    .line 2430
    .line 2431
    move-result v13

    .line 2432
    if-ge v11, v13, :cond_7c

    .line 2433
    .line 2434
    add-int/lit8 v10, v10, 0x1

    .line 2435
    .line 2436
    :cond_7c
    add-int/lit8 v8, v8, 0x1

    .line 2437
    .line 2438
    goto :goto_3a

    .line 2439
    :cond_7d
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2440
    .line 2441
    .line 2442
    move-result v1

    .line 2443
    if-nez v1, :cond_82

    .line 2444
    .line 2445
    invoke-static {v3}, Lrp0;->V(Ljava/util/ArrayList;)Z

    .line 2446
    .line 2447
    .line 2448
    move-result v1

    .line 2449
    if-eqz v1, :cond_7e

    .line 2450
    .line 2451
    const/16 v29, 0x0

    .line 2452
    .line 2453
    goto :goto_3b

    .line 2454
    :cond_7e
    move/from16 v29, v10

    .line 2455
    .line 2456
    :goto_3b
    if-eqz v1, :cond_7f

    .line 2457
    .line 2458
    move/from16 v31, v10

    .line 2459
    .line 2460
    goto :goto_3c

    .line 2461
    :cond_7f
    const/16 v31, 0x0

    .line 2462
    .line 2463
    :goto_3c
    invoke-virtual {v0}, Lqn2;->k()Lln2;

    .line 2464
    .line 2465
    .line 2466
    move-result-object v1

    .line 2467
    sget-object v3, Lvn2;->J:Lyn2;

    .line 2468
    .line 2469
    iget-object v1, v1, Lln2;->h:Lrk1;

    .line 2470
    .line 2471
    invoke-virtual {v1, v3}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2472
    .line 2473
    .line 2474
    move-result-object v1

    .line 2475
    if-nez v1, :cond_80

    .line 2476
    .line 2477
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2478
    .line 2479
    :cond_80
    check-cast v1, Ljava/lang/Boolean;

    .line 2480
    .line 2481
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2482
    .line 2483
    .line 2484
    move-result v34

    .line 2485
    const/16 v32, 0x1

    .line 2486
    .line 2487
    const/16 v33, 0x0

    .line 2488
    .line 2489
    const/16 v30, 0x1

    .line 2490
    .line 2491
    invoke-static/range {v29 .. v34}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v1

    .line 2495
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 2496
    .line 2497
    .line 2498
    goto :goto_3d

    .line 2499
    :cond_81
    invoke-static {}, Lc80;->g()V

    .line 2500
    .line 2501
    .line 2502
    :cond_82
    :goto_3d
    invoke-virtual {v0}, Lqn2;->n()Lln2;

    .line 2503
    .line 2504
    .line 2505
    move-result-object v1

    .line 2506
    sget-object v3, Lvn2;->v:Lyn2;

    .line 2507
    .line 2508
    invoke-static {v1, v3}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v1

    .line 2512
    check-cast v1, Lel2;

    .line 2513
    .line 2514
    invoke-virtual {v0}, Lqn2;->n()Lln2;

    .line 2515
    .line 2516
    .line 2517
    move-result-object v3

    .line 2518
    sget-object v5, Lkn2;->d:Lyn2;

    .line 2519
    .line 2520
    invoke-static {v3, v5}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 2521
    .line 2522
    .line 2523
    move-result-object v3

    .line 2524
    check-cast v3, Lq3;

    .line 2525
    .line 2526
    if-eqz v1, :cond_8e

    .line 2527
    .line 2528
    if-eqz v3, :cond_8e

    .line 2529
    .line 2530
    invoke-virtual {v0}, Lqn2;->k()Lln2;

    .line 2531
    .line 2532
    .line 2533
    move-result-object v5

    .line 2534
    sget-object v8, Lvn2;->f:Lyn2;

    .line 2535
    .line 2536
    iget-object v5, v5, Lln2;->h:Lrk1;

    .line 2537
    .line 2538
    invoke-virtual {v5, v8}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2539
    .line 2540
    .line 2541
    move-result-object v5

    .line 2542
    if-nez v5, :cond_83

    .line 2543
    .line 2544
    move-object/from16 v5, p0

    .line 2545
    .line 2546
    :cond_83
    if-nez v5, :cond_86

    .line 2547
    .line 2548
    invoke-virtual {v0}, Lqn2;->k()Lln2;

    .line 2549
    .line 2550
    .line 2551
    move-result-object v5

    .line 2552
    sget-object v8, Lvn2;->e:Lyn2;

    .line 2553
    .line 2554
    iget-object v5, v5, Lln2;->h:Lrk1;

    .line 2555
    .line 2556
    invoke-virtual {v5, v8}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2557
    .line 2558
    .line 2559
    move-result-object v5

    .line 2560
    if-nez v5, :cond_84

    .line 2561
    .line 2562
    move-object/from16 v5, p0

    .line 2563
    .line 2564
    :cond_84
    if-eqz v5, :cond_85

    .line 2565
    .line 2566
    goto :goto_3e

    .line 2567
    :cond_85
    const/4 v5, 0x0

    .line 2568
    goto :goto_3f

    .line 2569
    :cond_86
    :goto_3e
    const/4 v5, 0x1

    .line 2570
    :goto_3f
    if-nez v5, :cond_87

    .line 2571
    .line 2572
    const-string v5, "android.widget.HorizontalScrollView"

    .line 2573
    .line 2574
    invoke-virtual {v14, v5}, Ll4;->g(Ljava/lang/String;)V

    .line 2575
    .line 2576
    .line 2577
    :cond_87
    iget-object v5, v1, Lel2;->b:Lxm0;

    .line 2578
    .line 2579
    invoke-interface {v5}, Lxm0;->a()Ljava/lang/Object;

    .line 2580
    .line 2581
    .line 2582
    move-result-object v5

    .line 2583
    check-cast v5, Ljava/lang/Number;

    .line 2584
    .line 2585
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 2586
    .line 2587
    .line 2588
    move-result v5

    .line 2589
    const/16 v16, 0x0

    .line 2590
    .line 2591
    cmpl-float v5, v5, v16

    .line 2592
    .line 2593
    if-lez v5, :cond_88

    .line 2594
    .line 2595
    const/4 v13, 0x1

    .line 2596
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 2597
    .line 2598
    .line 2599
    :cond_88
    invoke-static {v0}, Lrg3;->j(Lqn2;)Z

    .line 2600
    .line 2601
    .line 2602
    move-result v5

    .line 2603
    if-eqz v5, :cond_8e

    .line 2604
    .line 2605
    invoke-static {v1}, Lh7;->s(Lel2;)Z

    .line 2606
    .line 2607
    .line 2608
    move-result v5

    .line 2609
    sget-object v8, Ld61;->i:Ld61;

    .line 2610
    .line 2611
    if-eqz v5, :cond_8b

    .line 2612
    .line 2613
    sget-object v5, Lf4;->e:Lf4;

    .line 2614
    .line 2615
    invoke-virtual {v14, v5}, Ll4;->a(Lf4;)V

    .line 2616
    .line 2617
    .line 2618
    move-object/from16 v5, v28

    .line 2619
    .line 2620
    iget-object v10, v5, Lr61;->G:Ld61;

    .line 2621
    .line 2622
    if-ne v10, v8, :cond_89

    .line 2623
    .line 2624
    const/4 v10, 0x1

    .line 2625
    goto :goto_40

    .line 2626
    :cond_89
    const/4 v10, 0x0

    .line 2627
    :goto_40
    if-nez v10, :cond_8a

    .line 2628
    .line 2629
    sget-object v10, Lf4;->j:Lf4;

    .line 2630
    .line 2631
    goto :goto_41

    .line 2632
    :cond_8a
    sget-object v10, Lf4;->h:Lf4;

    .line 2633
    .line 2634
    :goto_41
    invoke-virtual {v14, v10}, Ll4;->a(Lf4;)V

    .line 2635
    .line 2636
    .line 2637
    goto :goto_42

    .line 2638
    :cond_8b
    move-object/from16 v5, v28

    .line 2639
    .line 2640
    :goto_42
    invoke-static {v1}, Lh7;->r(Lel2;)Z

    .line 2641
    .line 2642
    .line 2643
    move-result v1

    .line 2644
    if-eqz v1, :cond_8e

    .line 2645
    .line 2646
    sget-object v1, Lf4;->f:Lf4;

    .line 2647
    .line 2648
    invoke-virtual {v14, v1}, Ll4;->a(Lf4;)V

    .line 2649
    .line 2650
    .line 2651
    iget-object v1, v5, Lr61;->G:Ld61;

    .line 2652
    .line 2653
    if-ne v1, v8, :cond_8c

    .line 2654
    .line 2655
    const/4 v1, 0x1

    .line 2656
    goto :goto_43

    .line 2657
    :cond_8c
    const/4 v1, 0x0

    .line 2658
    :goto_43
    if-nez v1, :cond_8d

    .line 2659
    .line 2660
    sget-object v1, Lf4;->h:Lf4;

    .line 2661
    .line 2662
    goto :goto_44

    .line 2663
    :cond_8d
    sget-object v1, Lf4;->j:Lf4;

    .line 2664
    .line 2665
    :goto_44
    invoke-virtual {v14, v1}, Ll4;->a(Lf4;)V

    .line 2666
    .line 2667
    .line 2668
    :cond_8e
    invoke-virtual {v0}, Lqn2;->n()Lln2;

    .line 2669
    .line 2670
    .line 2671
    move-result-object v1

    .line 2672
    sget-object v5, Lvn2;->w:Lyn2;

    .line 2673
    .line 2674
    invoke-static {v1, v5}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v1

    .line 2678
    check-cast v1, Lel2;

    .line 2679
    .line 2680
    if-eqz v1, :cond_96

    .line 2681
    .line 2682
    if-eqz v3, :cond_96

    .line 2683
    .line 2684
    invoke-virtual {v0}, Lqn2;->k()Lln2;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v3

    .line 2688
    sget-object v5, Lvn2;->f:Lyn2;

    .line 2689
    .line 2690
    iget-object v3, v3, Lln2;->h:Lrk1;

    .line 2691
    .line 2692
    invoke-virtual {v3, v5}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2693
    .line 2694
    .line 2695
    move-result-object v3

    .line 2696
    if-nez v3, :cond_8f

    .line 2697
    .line 2698
    move-object/from16 v3, p0

    .line 2699
    .line 2700
    :cond_8f
    if-nez v3, :cond_92

    .line 2701
    .line 2702
    invoke-virtual {v0}, Lqn2;->k()Lln2;

    .line 2703
    .line 2704
    .line 2705
    move-result-object v3

    .line 2706
    sget-object v5, Lvn2;->e:Lyn2;

    .line 2707
    .line 2708
    iget-object v3, v3, Lln2;->h:Lrk1;

    .line 2709
    .line 2710
    invoke-virtual {v3, v5}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2711
    .line 2712
    .line 2713
    move-result-object v3

    .line 2714
    if-nez v3, :cond_90

    .line 2715
    .line 2716
    move-object/from16 v3, p0

    .line 2717
    .line 2718
    :cond_90
    if-eqz v3, :cond_91

    .line 2719
    .line 2720
    goto :goto_45

    .line 2721
    :cond_91
    const/4 v3, 0x0

    .line 2722
    goto :goto_46

    .line 2723
    :cond_92
    :goto_45
    const/4 v3, 0x1

    .line 2724
    :goto_46
    if-nez v3, :cond_93

    .line 2725
    .line 2726
    const-string v3, "android.widget.ScrollView"

    .line 2727
    .line 2728
    invoke-virtual {v14, v3}, Ll4;->g(Ljava/lang/String;)V

    .line 2729
    .line 2730
    .line 2731
    :cond_93
    iget-object v3, v1, Lel2;->b:Lxm0;

    .line 2732
    .line 2733
    invoke-interface {v3}, Lxm0;->a()Ljava/lang/Object;

    .line 2734
    .line 2735
    .line 2736
    move-result-object v3

    .line 2737
    check-cast v3, Ljava/lang/Number;

    .line 2738
    .line 2739
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 2740
    .line 2741
    .line 2742
    move-result v3

    .line 2743
    const/16 v16, 0x0

    .line 2744
    .line 2745
    cmpl-float v3, v3, v16

    .line 2746
    .line 2747
    if-lez v3, :cond_94

    .line 2748
    .line 2749
    const/4 v13, 0x1

    .line 2750
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 2751
    .line 2752
    .line 2753
    :cond_94
    invoke-static {v0}, Lrg3;->j(Lqn2;)Z

    .line 2754
    .line 2755
    .line 2756
    move-result v3

    .line 2757
    if-eqz v3, :cond_96

    .line 2758
    .line 2759
    invoke-static {v1}, Lh7;->s(Lel2;)Z

    .line 2760
    .line 2761
    .line 2762
    move-result v3

    .line 2763
    if-eqz v3, :cond_95

    .line 2764
    .line 2765
    sget-object v3, Lf4;->e:Lf4;

    .line 2766
    .line 2767
    invoke-virtual {v14, v3}, Ll4;->a(Lf4;)V

    .line 2768
    .line 2769
    .line 2770
    sget-object v3, Lf4;->i:Lf4;

    .line 2771
    .line 2772
    invoke-virtual {v14, v3}, Ll4;->a(Lf4;)V

    .line 2773
    .line 2774
    .line 2775
    :cond_95
    invoke-static {v1}, Lh7;->r(Lel2;)Z

    .line 2776
    .line 2777
    .line 2778
    move-result v1

    .line 2779
    if-eqz v1, :cond_96

    .line 2780
    .line 2781
    sget-object v1, Lf4;->f:Lf4;

    .line 2782
    .line 2783
    invoke-virtual {v14, v1}, Ll4;->a(Lf4;)V

    .line 2784
    .line 2785
    .line 2786
    sget-object v1, Lf4;->g:Lf4;

    .line 2787
    .line 2788
    invoke-virtual {v14, v1}, Ll4;->a(Lf4;)V

    .line 2789
    .line 2790
    .line 2791
    :cond_96
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2792
    .line 2793
    if-lt v1, v9, :cond_97

    .line 2794
    .line 2795
    invoke-static {v14, v0}, Lxe1;->c(Ll4;Lqn2;)V

    .line 2796
    .line 2797
    .line 2798
    :cond_97
    invoke-virtual {v0}, Lqn2;->n()Lln2;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v3

    .line 2802
    sget-object v5, Lvn2;->d:Lyn2;

    .line 2803
    .line 2804
    invoke-static {v3, v5}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 2805
    .line 2806
    .line 2807
    move-result-object v3

    .line 2808
    check-cast v3, Ljava/lang/CharSequence;

    .line 2809
    .line 2810
    if-lt v1, v7, :cond_98

    .line 2811
    .line 2812
    invoke-static {v4, v3}, La4;->t(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 2813
    .line 2814
    .line 2815
    goto :goto_47

    .line 2816
    :cond_98
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 2817
    .line 2818
    .line 2819
    move-result-object v1

    .line 2820
    const-string v5, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 2821
    .line 2822
    invoke-virtual {v1, v5, v3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 2823
    .line 2824
    .line 2825
    :goto_47
    invoke-static {v0}, Lrg3;->j(Lqn2;)Z

    .line 2826
    .line 2827
    .line 2828
    move-result v1

    .line 2829
    if-eqz v1, :cond_a5

    .line 2830
    .line 2831
    invoke-virtual {v0}, Lqn2;->n()Lln2;

    .line 2832
    .line 2833
    .line 2834
    move-result-object v1

    .line 2835
    sget-object v3, Lkn2;->t:Lyn2;

    .line 2836
    .line 2837
    invoke-static {v1, v3}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 2838
    .line 2839
    .line 2840
    move-result-object v1

    .line 2841
    check-cast v1, Lq3;

    .line 2842
    .line 2843
    if-eqz v1, :cond_99

    .line 2844
    .line 2845
    new-instance v3, Lf4;

    .line 2846
    .line 2847
    const/high16 v5, 0x40000

    .line 2848
    .line 2849
    iget-object v1, v1, Lq3;->a:Ljava/lang/String;

    .line 2850
    .line 2851
    invoke-direct {v3, v1, v5}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 2852
    .line 2853
    .line 2854
    invoke-virtual {v14, v3}, Ll4;->a(Lf4;)V

    .line 2855
    .line 2856
    .line 2857
    :cond_99
    invoke-virtual {v0}, Lqn2;->n()Lln2;

    .line 2858
    .line 2859
    .line 2860
    move-result-object v1

    .line 2861
    sget-object v3, Lkn2;->u:Lyn2;

    .line 2862
    .line 2863
    invoke-static {v1, v3}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 2864
    .line 2865
    .line 2866
    move-result-object v1

    .line 2867
    check-cast v1, Lq3;

    .line 2868
    .line 2869
    if-eqz v1, :cond_9a

    .line 2870
    .line 2871
    new-instance v3, Lf4;

    .line 2872
    .line 2873
    const/high16 v5, 0x80000

    .line 2874
    .line 2875
    iget-object v1, v1, Lq3;->a:Ljava/lang/String;

    .line 2876
    .line 2877
    invoke-direct {v3, v1, v5}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 2878
    .line 2879
    .line 2880
    invoke-virtual {v14, v3}, Ll4;->a(Lf4;)V

    .line 2881
    .line 2882
    .line 2883
    :cond_9a
    invoke-virtual {v0}, Lqn2;->n()Lln2;

    .line 2884
    .line 2885
    .line 2886
    move-result-object v1

    .line 2887
    sget-object v3, Lkn2;->v:Lyn2;

    .line 2888
    .line 2889
    invoke-static {v1, v3}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 2890
    .line 2891
    .line 2892
    move-result-object v1

    .line 2893
    check-cast v1, Lq3;

    .line 2894
    .line 2895
    if-eqz v1, :cond_9b

    .line 2896
    .line 2897
    new-instance v3, Lf4;

    .line 2898
    .line 2899
    const/high16 v5, 0x100000

    .line 2900
    .line 2901
    iget-object v1, v1, Lq3;->a:Ljava/lang/String;

    .line 2902
    .line 2903
    invoke-direct {v3, v1, v5}, Lf4;-><init>(Ljava/lang/String;I)V

    .line 2904
    .line 2905
    .line 2906
    invoke-virtual {v14, v3}, Ll4;->a(Lf4;)V

    .line 2907
    .line 2908
    .line 2909
    :cond_9b
    invoke-virtual {v0}, Lqn2;->n()Lln2;

    .line 2910
    .line 2911
    .line 2912
    move-result-object v1

    .line 2913
    sget-object v3, Lkn2;->x:Lyn2;

    .line 2914
    .line 2915
    iget-object v1, v1, Lln2;->h:Lrk1;

    .line 2916
    .line 2917
    invoke-virtual {v1, v3}, Lrk1;->c(Ljava/lang/Object;)Z

    .line 2918
    .line 2919
    .line 2920
    move-result v1

    .line 2921
    if-eqz v1, :cond_a5

    .line 2922
    .line 2923
    invoke-virtual {v0}, Lqn2;->n()Lln2;

    .line 2924
    .line 2925
    .line 2926
    move-result-object v1

    .line 2927
    invoke-virtual {v1, v3}, Lln2;->c(Lyn2;)Ljava/lang/Object;

    .line 2928
    .line 2929
    .line 2930
    move-result-object v1

    .line 2931
    check-cast v1, Ljava/util/List;

    .line 2932
    .line 2933
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2934
    .line 2935
    .line 2936
    move-result v3

    .line 2937
    sget-object v5, Lh7;->U:Lyj1;

    .line 2938
    .line 2939
    iget v8, v5, Lyj1;->b:I

    .line 2940
    .line 2941
    if-ge v3, v8, :cond_a4

    .line 2942
    .line 2943
    new-instance v3, Lnt2;

    .line 2944
    .line 2945
    invoke-direct {v3}, Lnt2;-><init>()V

    .line 2946
    .line 2947
    .line 2948
    invoke-static {}, Lhs1;->a()Lgk1;

    .line 2949
    .line 2950
    .line 2951
    move-result-object v8

    .line 2952
    move-object/from16 v9, v26

    .line 2953
    .line 2954
    iget-object v10, v9, Lnt2;->h:[I

    .line 2955
    .line 2956
    iget v11, v9, Lnt2;->j:I

    .line 2957
    .line 2958
    invoke-static {v10, v11, v6}, Lrg3;->p([III)I

    .line 2959
    .line 2960
    .line 2961
    move-result v10

    .line 2962
    if-ltz v10, :cond_9c

    .line 2963
    .line 2964
    const/4 v10, 0x1

    .line 2965
    goto :goto_48

    .line 2966
    :cond_9c
    const/4 v10, 0x0

    .line 2967
    :goto_48
    if-eqz v10, :cond_a2

    .line 2968
    .line 2969
    invoke-virtual {v9, v6}, Lnt2;->d(I)Ljava/lang/Object;

    .line 2970
    .line 2971
    .line 2972
    move-result-object v10

    .line 2973
    check-cast v10, Lgk1;

    .line 2974
    .line 2975
    const/16 v11, 0x10

    .line 2976
    .line 2977
    new-array v11, v11, [I

    .line 2978
    .line 2979
    iget-object v13, v5, Lyj1;->a:[I

    .line 2980
    .line 2981
    iget v5, v5, Lyj1;->b:I

    .line 2982
    .line 2983
    move-object v7, v11

    .line 2984
    const/4 v11, 0x0

    .line 2985
    const/4 v15, 0x0

    .line 2986
    :goto_49
    if-ge v11, v5, :cond_9e

    .line 2987
    .line 2988
    aget v17, v13, v11

    .line 2989
    .line 2990
    move/from16 v18, v5

    .line 2991
    .line 2992
    add-int/lit8 v5, v15, 0x1

    .line 2993
    .line 2994
    move-object/from16 v20, v10

    .line 2995
    .line 2996
    array-length v10, v7

    .line 2997
    if-ge v10, v5, :cond_9d

    .line 2998
    .line 2999
    array-length v10, v7

    .line 3000
    mul-int/lit8 v10, v10, 0x3

    .line 3001
    .line 3002
    div-int/lit8 v10, v10, 0x2

    .line 3003
    .line 3004
    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    .line 3005
    .line 3006
    .line 3007
    move-result v10

    .line 3008
    invoke-static {v7, v10}, Ljava/util/Arrays;->copyOf([II)[I

    .line 3009
    .line 3010
    .line 3011
    move-result-object v7

    .line 3012
    :cond_9d
    aput v17, v7, v15

    .line 3013
    .line 3014
    add-int/lit8 v11, v11, 0x1

    .line 3015
    .line 3016
    move v15, v5

    .line 3017
    move/from16 v5, v18

    .line 3018
    .line 3019
    move-object/from16 v10, v20

    .line 3020
    .line 3021
    goto :goto_49

    .line 3022
    :cond_9e
    move-object/from16 v20, v10

    .line 3023
    .line 3024
    new-instance v5, Ljava/util/ArrayList;

    .line 3025
    .line 3026
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 3027
    .line 3028
    .line 3029
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 3030
    .line 3031
    .line 3032
    move-result v10

    .line 3033
    if-gtz v10, :cond_a1

    .line 3034
    .line 3035
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 3036
    .line 3037
    .line 3038
    move-result v1

    .line 3039
    if-gtz v1, :cond_9f

    .line 3040
    .line 3041
    goto :goto_4a

    .line 3042
    :cond_9f
    const/4 v13, 0x0

    .line 3043
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3044
    .line 3045
    .line 3046
    move-result-object v0

    .line 3047
    invoke-static {v0}, Lvi0;->t(Ljava/lang/Object;)V

    .line 3048
    .line 3049
    .line 3050
    if-gtz v15, :cond_a0

    .line 3051
    .line 3052
    const-string v0, "Index must be between 0 and size"

    .line 3053
    .line 3054
    invoke-static {v0}, Ls;->d(Ljava/lang/String;)V

    .line 3055
    .line 3056
    .line 3057
    return-object p0

    .line 3058
    :cond_a0
    aget v0, v7, v13

    .line 3059
    .line 3060
    throw p0

    .line 3061
    :cond_a1
    const/4 v13, 0x0

    .line 3062
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3063
    .line 3064
    .line 3065
    move-result-object v0

    .line 3066
    invoke-static {v0}, Lvi0;->t(Ljava/lang/Object;)V

    .line 3067
    .line 3068
    .line 3069
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3070
    .line 3071
    .line 3072
    throw p0

    .line 3073
    :cond_a2
    const/4 v13, 0x0

    .line 3074
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 3075
    .line 3076
    .line 3077
    move-result v7

    .line 3078
    if-gtz v7, :cond_a3

    .line 3079
    .line 3080
    :goto_4a
    iget-object v1, v12, Lh7;->y:Lnt2;

    .line 3081
    .line 3082
    invoke-virtual {v1, v6, v3}, Lnt2;->f(ILjava/lang/Object;)V

    .line 3083
    .line 3084
    .line 3085
    invoke-virtual {v9, v6, v8}, Lnt2;->f(ILjava/lang/Object;)V

    .line 3086
    .line 3087
    .line 3088
    goto :goto_4b

    .line 3089
    :cond_a3
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3090
    .line 3091
    .line 3092
    move-result-object v0

    .line 3093
    invoke-static {v0}, Lvi0;->t(Ljava/lang/Object;)V

    .line 3094
    .line 3095
    .line 3096
    invoke-virtual {v5, v13}, Lyj1;->c(I)I

    .line 3097
    .line 3098
    .line 3099
    throw p0

    .line 3100
    :cond_a4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3101
    .line 3102
    iget v1, v5, Lyj1;->b:I

    .line 3103
    .line 3104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 3105
    .line 3106
    const-string v3, "Can\'t have more than "

    .line 3107
    .line 3108
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3109
    .line 3110
    .line 3111
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3112
    .line 3113
    .line 3114
    const-string v1, " custom actions for one widget"

    .line 3115
    .line 3116
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3117
    .line 3118
    .line 3119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3120
    .line 3121
    .line 3122
    move-result-object v1

    .line 3123
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 3124
    .line 3125
    .line 3126
    throw v0

    .line 3127
    :cond_a5
    :goto_4b
    invoke-static {v0, v2}, Lrg3;->k(Lqn2;Landroid/content/res/Resources;)Z

    .line 3128
    .line 3129
    .line 3130
    move-result v1

    .line 3131
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3132
    .line 3133
    const/16 v3, 0x1c

    .line 3134
    .line 3135
    if-lt v2, v3, :cond_a6

    .line 3136
    .line 3137
    invoke-static {v4, v1}, La4;->u(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 3138
    .line 3139
    .line 3140
    goto :goto_4c

    .line 3141
    :cond_a6
    const/4 v13, 0x1

    .line 3142
    invoke-virtual {v14, v13, v1}, Ll4;->f(IZ)V

    .line 3143
    .line 3144
    .line 3145
    :goto_4c
    iget-object v1, v12, Lh7;->I:Lxj1;

    .line 3146
    .line 3147
    invoke-virtual {v1, v6}, Lxj1;->d(I)I

    .line 3148
    .line 3149
    .line 3150
    move-result v1

    .line 3151
    const/4 v11, -0x1

    .line 3152
    if-eq v1, v11, :cond_a8

    .line 3153
    .line 3154
    invoke-virtual/range {v25 .. v25}, Lb7;->getAndroidViewsHandler$ui()Lnc;

    .line 3155
    .line 3156
    .line 3157
    move-result-object v2

    .line 3158
    invoke-static {v2, v1}, Leu;->V(Lnc;I)Lic;

    .line 3159
    .line 3160
    .line 3161
    move-result-object v2

    .line 3162
    if-eqz v2, :cond_a7

    .line 3163
    .line 3164
    invoke-virtual {v4, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;)V

    .line 3165
    .line 3166
    .line 3167
    move-object/from16 v2, v25

    .line 3168
    .line 3169
    goto :goto_4d

    .line 3170
    :cond_a7
    move-object/from16 v2, v25

    .line 3171
    .line 3172
    invoke-virtual {v4, v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;I)V

    .line 3173
    .line 3174
    .line 3175
    :goto_4d
    iget-object v1, v12, Lh7;->K:Ljava/lang/String;

    .line 3176
    .line 3177
    move-object/from16 v3, p0

    .line 3178
    .line 3179
    invoke-virtual {v12, v6, v14, v1, v3}, Lh7;->c(ILl4;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 3180
    .line 3181
    .line 3182
    goto :goto_4e

    .line 3183
    :cond_a8
    move-object/from16 v3, p0

    .line 3184
    .line 3185
    move-object/from16 v2, v25

    .line 3186
    .line 3187
    :goto_4e
    iget-object v1, v12, Lh7;->J:Lxj1;

    .line 3188
    .line 3189
    invoke-virtual {v1, v6}, Lxj1;->d(I)I

    .line 3190
    .line 3191
    .line 3192
    move-result v1

    .line 3193
    const/4 v11, -0x1

    .line 3194
    if-eq v1, v11, :cond_a9

    .line 3195
    .line 3196
    invoke-virtual {v2}, Lb7;->getAndroidViewsHandler$ui()Lnc;

    .line 3197
    .line 3198
    .line 3199
    move-result-object v2

    .line 3200
    invoke-static {v2, v1}, Leu;->V(Lnc;I)Lic;

    .line 3201
    .line 3202
    .line 3203
    move-result-object v1

    .line 3204
    if-eqz v1, :cond_a9

    .line 3205
    .line 3206
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;)V

    .line 3207
    .line 3208
    .line 3209
    iget-object v1, v12, Lh7;->L:Ljava/lang/String;

    .line 3210
    .line 3211
    invoke-virtual {v12, v6, v14, v1, v3}, Lh7;->c(ILl4;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 3212
    .line 3213
    .line 3214
    :cond_a9
    invoke-virtual {v0}, Lqn2;->n()Lln2;

    .line 3215
    .line 3216
    .line 3217
    move-result-object v0

    .line 3218
    sget-object v1, Lwn2;->b:Lyn2;

    .line 3219
    .line 3220
    invoke-static {v0, v1}, Lpp0;->x(Lln2;Lyn2;)Ljava/lang/Object;

    .line 3221
    .line 3222
    .line 3223
    move-result-object v0

    .line 3224
    check-cast v0, Ljava/lang/String;

    .line 3225
    .line 3226
    if-eqz v0, :cond_aa

    .line 3227
    .line 3228
    invoke-virtual {v14, v0}, Ll4;->g(Ljava/lang/String;)V

    .line 3229
    .line 3230
    .line 3231
    :cond_aa
    move-object v8, v14

    .line 3232
    :goto_4f
    iget-boolean v0, v12, Lh7;->v:Z

    .line 3233
    .line 3234
    if-eqz v0, :cond_ac

    .line 3235
    .line 3236
    iget v0, v12, Lh7;->r:I

    .line 3237
    .line 3238
    if-ne v6, v0, :cond_ab

    .line 3239
    .line 3240
    iput-object v8, v12, Lh7;->t:Ll4;

    .line 3241
    .line 3242
    :cond_ab
    iget v0, v12, Lh7;->s:I

    .line 3243
    .line 3244
    if-ne v6, v0, :cond_ac

    .line 3245
    .line 3246
    iput-object v8, v12, Lh7;->u:Ll4;

    .line 3247
    .line 3248
    :cond_ac
    return-object v8

    .line 3249
    :cond_ad
    move v6, v0

    .line 3250
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3251
    .line 3252
    const-string v1, "semanticsNode "

    .line 3253
    .line 3254
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3255
    .line 3256
    .line 3257
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3258
    .line 3259
    .line 3260
    const-string v1, " has null parent"

    .line 3261
    .line 3262
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3263
    .line 3264
    .line 3265
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3266
    .line 3267
    .line 3268
    move-result-object v0

    .line 3269
    invoke-static {v0}, Lkz0;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 3270
    .line 3271
    .line 3272
    invoke-static {}, Ls;->b()V

    .line 3273
    .line 3274
    .line 3275
    const/4 v3, 0x0

    .line 3276
    return-object v3
.end method

.method public final s(I)Ll4;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lc7;->j:Lh7;

    .line 4
    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    iget p1, v2, Lh7;->r:I

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lc7;->l(I)Ll4;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "Unknown focus type: "

    .line 18
    .line 19
    invoke-static {p0, p1}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    iget p1, v2, Lh7;->s:I

    .line 28
    .line 29
    const/high16 v0, -0x80000000

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_2
    invoke-virtual {p0, p1}, Lc7;->l(I)Ll4;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final w(IILandroid/os/Bundle;)Z
    .locals 22

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    .line 1
    iget-object v2, v2, Lc7;->j:Lh7;

    iget-object v4, v2, Lh7;->n:Landroid/view/accessibility/AccessibilityManager;

    const/4 v5, 0x0

    .line 2
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    .line 3
    iget-object v7, v2, Lh7;->k:Lb7;

    .line 4
    invoke-virtual {v2}, Lh7;->l()Lx01;

    move-result-object v8

    invoke-virtual {v8, v0}, Lx01;->b(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lsn2;

    if-eqz v8, :cond_0

    .line 5
    iget-object v11, v8, Lsn2;->a:Lqn2;

    if-nez v11, :cond_1

    :cond_0
    :goto_0
    const/16 v17, 0x0

    goto/16 :goto_4b

    .line 6
    :cond_1
    iget-object v8, v11, Lqn2;->c:Lr61;

    iget v10, v11, Lqn2;->f:I

    iget-object v12, v11, Lqn2;->d:Lln2;

    iget-object v13, v12, Lln2;->h:Lrk1;

    .line 7
    sget-object v14, Lvn2;->o:Lyn2;

    .line 8
    invoke-virtual {v13, v14}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_2

    const/4 v14, 0x0

    :cond_2
    move/from16 p0, v5

    .line 9
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v14, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    const/4 v15, 0x1

    if-eqz v14, :cond_4

    .line 10
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x22

    if-lt v14, v9, :cond_3

    .line 11
    invoke-static {v4}, Lu3;->e(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result v9

    goto :goto_1

    :cond_3
    move v9, v15

    :goto_1
    if-nez v9, :cond_4

    goto :goto_0

    :cond_4
    const/16 v9, 0x40

    const/high16 v14, -0x80000000

    if-eq v1, v9, :cond_8a

    const/16 v4, 0x80

    if-eq v1, v4, :cond_88

    const/16 v9, 0x200

    const/16 v4, 0x100

    const/4 v14, -0x1

    if-eq v1, v4, :cond_6a

    if-eq v1, v9, :cond_6a

    const/16 v4, 0x4000

    if-eq v1, v4, :cond_68

    const/high16 v4, 0x20000

    if-eq v1, v4, :cond_64

    .line 12
    invoke-static {v11}, Lrg3;->j(Lqn2;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    if-eq v1, v15, :cond_61

    const/4 v4, 0x2

    if-eq v1, v4, :cond_5f

    .line 13
    sget-object v4, Ld61;->i:Ld61;

    sparse-switch v1, :sswitch_data_0

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    .line 14
    iget-object v2, v2, Lh7;->y:Lnt2;

    invoke-virtual {v2, v0}, Lnt2;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnt2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lnt2;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-nez v0, :cond_6

    goto :goto_0

    .line 15
    :cond_6
    sget-object v0, Lkn2;->x:Lyn2;

    .line 16
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7

    const/4 v15, 0x0

    goto :goto_2

    :cond_7
    move-object v15, v0

    .line 17
    :goto_2
    check-cast v15, Ljava/util/List;

    if-nez v15, :cond_8

    goto/16 :goto_0

    .line 18
    :cond_8
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    move-result v0

    if-gtz v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/4 v0, 0x0

    .line 19
    invoke-interface {v15, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-static {}, Lc80;->g()V

    return v0

    .line 22
    :pswitch_0
    sget-object v0, Lkn2;->B:Lyn2;

    .line 23
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_a

    const/4 v15, 0x0

    goto :goto_3

    :cond_a
    move-object v15, v0

    .line 24
    :goto_3
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 25
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 26
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 27
    :pswitch_1
    sget-object v0, Lkn2;->z:Lyn2;

    .line 28
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_b

    const/4 v15, 0x0

    goto :goto_4

    :cond_b
    move-object v15, v0

    .line 29
    :goto_4
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 30
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 31
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 32
    :pswitch_2
    sget-object v0, Lkn2;->A:Lyn2;

    .line 33
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_c

    const/4 v15, 0x0

    goto :goto_5

    :cond_c
    move-object v15, v0

    .line 34
    :goto_5
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 35
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 36
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 37
    :pswitch_3
    sget-object v0, Lkn2;->y:Lyn2;

    .line 38
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_d

    const/4 v15, 0x0

    goto :goto_6

    :cond_d
    move-object v15, v0

    .line 39
    :goto_6
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 40
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 41
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :pswitch_4
    :sswitch_0
    const/16 v18, 0x20

    const-wide v20, 0xffffffffL

    goto/16 :goto_1e

    .line 42
    :sswitch_1
    sget-object v0, Lkn2;->p:Lyn2;

    .line 43
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_e

    const/4 v15, 0x0

    goto :goto_7

    :cond_e
    move-object v15, v0

    .line 44
    :goto_7
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 45
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 46
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_2
    if-eqz v3, :cond_0

    .line 47
    const-string v0, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_0

    .line 48
    :cond_f
    sget-object v1, Lkn2;->i:Lyn2;

    .line 49
    invoke-virtual {v13, v1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_10

    const/4 v15, 0x0

    goto :goto_8

    :cond_10
    move-object v15, v1

    .line 50
    :goto_8
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 51
    iget-object v1, v15, Lq3;->b:Lun0;

    .line 52
    check-cast v1, Lin0;

    if-eqz v1, :cond_0

    .line 53
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 54
    invoke-interface {v1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 55
    :sswitch_3
    invoke-virtual {v11}, Lqn2;->l()Lqn2;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 56
    iget-object v1, v0, Lqn2;->d:Lln2;

    .line 57
    sget-object v2, Lkn2;->d:Lyn2;

    .line 58
    iget-object v1, v1, Lln2;->h:Lrk1;

    .line 59
    invoke-virtual {v1, v2}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_11

    const/4 v1, 0x0

    .line 60
    :cond_11
    check-cast v1, Lq3;

    goto :goto_9

    :cond_12
    const/4 v1, 0x0

    :goto_9
    if-nez v1, :cond_14

    if-eqz v0, :cond_14

    .line 61
    invoke-virtual {v0}, Lqn2;->l()Lqn2;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 62
    iget-object v1, v0, Lqn2;->d:Lln2;

    .line 63
    sget-object v2, Lkn2;->d:Lyn2;

    .line 64
    iget-object v1, v1, Lln2;->h:Lrk1;

    .line 65
    invoke-virtual {v1, v2}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_13

    const/4 v1, 0x0

    .line 66
    :cond_13
    check-cast v1, Lq3;

    goto :goto_9

    :cond_14
    if-nez v0, :cond_15

    .line 67
    invoke-virtual {v11}, Lqn2;->g()Lo62;

    move-result-object v0

    .line 68
    new-instance v1, Landroid/graphics/Rect;

    .line 69
    iget v2, v0, Lo62;->a:F

    float-to-double v2, v2

    .line 70
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    .line 71
    iget v3, v0, Lo62;->b:F

    float-to-double v3, v3

    .line 72
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    .line 73
    iget v4, v0, Lo62;->c:F

    float-to-double v4, v4

    .line 74
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-static {v4}, Lgf1;->Q(F)I

    move-result v4

    .line 75
    iget v0, v0, Lo62;->d:F

    float-to-double v5, v0

    .line 76
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v0, v5

    invoke-static {v0}, Lgf1;->Q(F)I

    move-result v0

    .line 77
    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 78
    invoke-virtual {v7, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    move-result v0

    return v0

    :cond_15
    const-wide/16 v1, 0x0

    move-wide v6, v1

    const/4 v3, 0x0

    :goto_a
    if-eqz v0, :cond_27

    .line 79
    iget-object v12, v0, Lqn2;->c:Lr61;

    iget-object v13, v0, Lqn2;->d:Lln2;

    iget-object v13, v13, Lln2;->h:Lrk1;

    .line 80
    sget-object v14, Lkn2;->d:Lyn2;

    .line 81
    invoke-virtual {v13, v14}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_16

    const/4 v14, 0x0

    .line 82
    :cond_16
    check-cast v14, Lq3;

    const/16 v18, 0x20

    if-eqz v14, :cond_26

    .line 83
    iget-object v5, v12, Lr61;->M:Lvn1;

    .line 84
    iget-object v5, v5, Lvn1;->d:Ljava/lang/Object;

    check-cast v5, Lqz0;

    .line 85
    invoke-static {v5}, Ls11;->v(Lc61;)Lo62;

    move-result-object v5

    .line 86
    iget-object v12, v12, Lr61;->M:Lvn1;

    .line 87
    iget-object v12, v12, Lvn1;->d:Ljava/lang/Object;

    check-cast v12, Lqz0;

    .line 88
    invoke-virtual {v12}, Lzn1;->j()Lc61;

    move-result-object v12

    if-eqz v12, :cond_17

    .line 89
    check-cast v12, Lzn1;

    invoke-virtual {v12, v1, v2}, Lzn1;->M(J)J

    move-result-wide v19

    move-wide/from16 v9, v19

    :goto_b
    const-wide v20, 0xffffffffL

    goto :goto_c

    :cond_17
    move-wide v9, v1

    goto :goto_b

    .line 90
    :goto_c
    invoke-virtual {v5, v9, v10}, Lo62;->i(J)Lo62;

    move-result-object v5

    .line 91
    invoke-virtual {v11}, Lqn2;->d()Lzn1;

    move-result-object v9

    if-eqz v9, :cond_19

    .line 92
    invoke-virtual {v9}, Lzn1;->S0()Lth1;

    move-result-object v10

    .line 93
    iget-boolean v10, v10, Lth1;->u:Z

    if-eqz v10, :cond_18

    goto :goto_d

    :cond_18
    const/4 v9, 0x0

    :goto_d
    if-eqz v9, :cond_19

    .line 94
    invoke-virtual {v9, v1, v2}, Lzn1;->M(J)J

    move-result-wide v9

    goto :goto_e

    :cond_19
    move-wide v9, v1

    .line 95
    :goto_e
    invoke-static {v9, v10, v6, v7}, Lrs1;->e(JJ)J

    move-result-wide v9

    .line 96
    invoke-virtual {v11}, Lqn2;->d()Lzn1;

    move-result-object v12

    if-eqz v12, :cond_1a

    .line 97
    iget-wide v1, v12, Lsz1;->j:J

    goto :goto_f

    :cond_1a
    const-wide/16 v1, 0x0

    .line 98
    :goto_f
    invoke-static {v1, v2}, Ls11;->q0(J)J

    move-result-wide v1

    invoke-static {v9, v10, v1, v2}, Leu;->q(JJ)Lo62;

    move-result-object v1

    .line 99
    iget v2, v1, Lo62;->a:F

    iget v9, v5, Lo62;->a:F

    sub-float/2addr v2, v9

    .line 100
    iget v9, v1, Lo62;->c:F

    iget v10, v5, Lo62;->c:F

    sub-float/2addr v9, v10

    .line 101
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    move-result v10

    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    move-result v12

    cmpg-float v10, v10, v12

    if-nez v10, :cond_1c

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v10

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v12

    cmpg-float v10, v10, v12

    if-gez v10, :cond_1b

    goto :goto_10

    :cond_1b
    move v2, v9

    goto :goto_10

    :cond_1c
    move/from16 v2, p0

    .line 102
    :goto_10
    iget v9, v1, Lo62;->b:F

    iget v10, v5, Lo62;->b:F

    sub-float/2addr v9, v10

    .line 103
    iget v1, v1, Lo62;->d:F

    iget v5, v5, Lo62;->d:F

    sub-float/2addr v1, v5

    .line 104
    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    move-result v5

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v10

    cmpg-float v5, v5, v10

    if-nez v5, :cond_1e

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v5

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v10

    cmpg-float v5, v5, v10

    if-gez v5, :cond_1d

    goto :goto_11

    :cond_1d
    move v9, v1

    goto :goto_11

    :cond_1e
    move/from16 v9, p0

    .line 105
    :goto_11
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    .line 106
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v9, v5

    shl-long v1, v1, v18

    and-long v9, v9, v20

    or-long/2addr v1, v9

    const-wide/16 v9, 0x0

    .line 107
    invoke-static {v1, v2, v9, v10}, Lrs1;->b(JJ)Z

    move-result v5

    if-eqz v5, :cond_1f

    move-wide v9, v1

    goto :goto_13

    :cond_1f
    shr-long v9, v1, v18

    long-to-int v5, v9

    .line 108
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    and-long v9, v1, v20

    long-to-int v9, v9

    .line 109
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    .line 110
    sget-object v10, Lvn2;->v:Lyn2;

    .line 111
    invoke-virtual {v13, v10}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_20

    const/4 v10, 0x0

    .line 112
    :cond_20
    check-cast v10, Lel2;

    .line 113
    iget-object v10, v8, Lr61;->G:Ld61;

    if-ne v10, v4, :cond_21

    move v10, v15

    goto :goto_12

    :cond_21
    const/4 v10, 0x0

    :goto_12
    if-eqz v10, :cond_22

    neg-float v5, v5

    .line 114
    :cond_22
    sget-object v10, Lvn2;->w:Lyn2;

    .line 115
    invoke-virtual {v13, v10}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_23

    const/4 v10, 0x0

    .line 116
    :cond_23
    check-cast v10, Lel2;

    .line 117
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v12, v5

    .line 118
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v9, v5

    shl-long v12, v12, v18

    and-long v9, v9, v20

    or-long/2addr v9, v12

    .line 119
    :goto_13
    iget-object v5, v14, Lq3;->b:Lun0;

    .line 120
    check-cast v5, Lmn0;

    if-eqz v5, :cond_24

    shr-long v12, v9, v18

    long-to-int v12, v12

    .line 121
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    .line 122
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    and-long v9, v9, v20

    long-to-int v9, v9

    .line 123
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    .line 124
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    .line 125
    invoke-interface {v5, v12, v9}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-ne v5, v15, :cond_24

    goto :goto_14

    :cond_24
    if-eqz v3, :cond_25

    :goto_14
    move v3, v15

    goto :goto_15

    :cond_25
    const/4 v3, 0x0

    .line 126
    :goto_15
    invoke-static {v6, v7, v1, v2}, Lrs1;->d(JJ)J

    move-result-wide v6

    goto :goto_16

    :cond_26
    const-wide v20, 0xffffffffL

    .line 127
    :goto_16
    invoke-virtual {v0}, Lqn2;->l()Lqn2;

    move-result-object v0

    const-wide/16 v1, 0x0

    goto/16 :goto_a

    :cond_27
    return v3

    :sswitch_4
    if-eqz v3, :cond_28

    .line 128
    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    .line 129
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_17

    :cond_28
    const/4 v0, 0x0

    .line 130
    :goto_17
    sget-object v1, Lkn2;->k:Lyn2;

    .line 131
    invoke-virtual {v13, v1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_29

    const/4 v15, 0x0

    goto :goto_18

    :cond_29
    move-object v15, v1

    .line 132
    :goto_18
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 133
    iget-object v1, v15, Lq3;->b:Lun0;

    .line 134
    check-cast v1, Lin0;

    if-eqz v1, :cond_0

    .line 135
    new-instance v2, Lsd;

    if-nez v0, :cond_2a

    const-string v0, ""

    :cond_2a
    invoke-direct {v2, v0}, Lsd;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 136
    :sswitch_5
    sget-object v0, Lkn2;->v:Lyn2;

    .line 137
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2b

    const/4 v15, 0x0

    goto :goto_19

    :cond_2b
    move-object v15, v0

    .line 138
    :goto_19
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 139
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 140
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 141
    :sswitch_6
    sget-object v0, Lkn2;->u:Lyn2;

    .line 142
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2c

    const/4 v15, 0x0

    goto :goto_1a

    :cond_2c
    move-object v15, v0

    .line 143
    :goto_1a
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 144
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 145
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 146
    :sswitch_7
    sget-object v0, Lkn2;->t:Lyn2;

    .line 147
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2d

    const/4 v15, 0x0

    goto :goto_1b

    :cond_2d
    move-object v15, v0

    .line 148
    :goto_1b
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 149
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 150
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 151
    :sswitch_8
    sget-object v0, Lkn2;->r:Lyn2;

    .line 152
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2e

    const/4 v15, 0x0

    goto :goto_1c

    :cond_2e
    move-object v15, v0

    .line 153
    :goto_1c
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 154
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 155
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 156
    :sswitch_9
    sget-object v0, Lkn2;->s:Lyn2;

    .line 157
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2f

    const/4 v15, 0x0

    goto :goto_1d

    :cond_2f
    move-object v15, v0

    .line 158
    :goto_1d
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 159
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 160
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :goto_1e
    const/16 v0, 0x1000

    if-ne v1, v0, :cond_30

    move v0, v15

    goto :goto_1f

    :cond_30
    const/4 v0, 0x0

    :goto_1f
    const/16 v2, 0x2000

    if-ne v1, v2, :cond_31

    move v2, v15

    goto :goto_20

    :cond_31
    const/4 v2, 0x0

    :goto_20
    const v3, 0x1020039

    if-ne v1, v3, :cond_32

    move v3, v15

    goto :goto_21

    :cond_32
    const/4 v3, 0x0

    :goto_21
    const v5, 0x102003b

    if-ne v1, v5, :cond_33

    move v5, v15

    goto :goto_22

    :cond_33
    const/4 v5, 0x0

    :goto_22
    const v7, 0x1020038

    if-ne v1, v7, :cond_34

    move v7, v15

    goto :goto_23

    :cond_34
    const/4 v7, 0x0

    :goto_23
    const v9, 0x102003a

    if-ne v1, v9, :cond_35

    move v1, v15

    goto :goto_24

    :cond_35
    const/4 v1, 0x0

    :goto_24
    if-nez v3, :cond_37

    if-nez v5, :cond_37

    if-nez v0, :cond_37

    if-eqz v2, :cond_36

    goto :goto_25

    :cond_36
    const/4 v9, 0x0

    goto :goto_26

    :cond_37
    :goto_25
    move v9, v15

    :goto_26
    if-nez v7, :cond_39

    if-nez v1, :cond_39

    if-nez v0, :cond_39

    if-eqz v2, :cond_38

    goto :goto_27

    :cond_38
    const/4 v1, 0x0

    goto :goto_28

    :cond_39
    :goto_27
    move v1, v15

    :goto_28
    if-nez v0, :cond_3a

    if-eqz v2, :cond_40

    .line 161
    :cond_3a
    sget-object v0, Lvn2;->c:Lyn2;

    .line 162
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3b

    const/4 v0, 0x0

    .line 163
    :cond_3b
    check-cast v0, Ls32;

    .line 164
    sget-object v10, Lkn2;->i:Lyn2;

    .line 165
    invoke-virtual {v13, v10}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_3c

    const/4 v10, 0x0

    .line 166
    :cond_3c
    check-cast v10, Lq3;

    if-eqz v0, :cond_40

    .line 167
    iget-object v11, v0, Ls32;->b:Ltt;

    if-eqz v10, :cond_40

    .line 168
    iget v1, v11, Ltt;->a:F

    cmpg-float v3, v1, p0

    if-gez v3, :cond_3d

    move/from16 v3, p0

    goto :goto_29

    :cond_3d
    move v3, v1

    :goto_29
    cmpl-float v4, p0, v1

    if-lez v4, :cond_3e

    move v5, v1

    goto :goto_2a

    :cond_3e
    move/from16 v5, p0

    :goto_2a
    sub-float/2addr v3, v5

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v3, v1

    if-eqz v2, :cond_3f

    neg-float v3, v3

    .line 169
    :cond_3f
    iget-object v1, v10, Lq3;->b:Lun0;

    .line 170
    check-cast v1, Lin0;

    if-eqz v1, :cond_0

    .line 171
    iget v0, v0, Ls32;->a:F

    add-float/2addr v0, v3

    .line 172
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 173
    :cond_40
    iget-object v0, v8, Lr61;->M:Lvn1;

    .line 174
    iget-object v0, v0, Lvn1;->d:Ljava/lang/Object;

    check-cast v0, Lqz0;

    .line 175
    invoke-static {v0}, Ls11;->v(Lc61;)Lo62;

    move-result-object v0

    invoke-virtual {v0}, Lo62;->c()J

    move-result-wide v10

    .line 176
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 177
    sget-object v12, Lkn2;->C:Lyn2;

    .line 178
    invoke-virtual {v13, v12}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_41

    const/4 v12, 0x0

    .line 179
    :cond_41
    check-cast v12, Lq3;

    if-eqz v12, :cond_42

    .line 180
    iget-object v12, v12, Lq3;->b:Lun0;

    .line 181
    check-cast v12, Lin0;

    if-eqz v12, :cond_42

    .line 182
    invoke-interface {v12, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-eqz v12, :cond_42

    const/4 v12, 0x0

    .line 183
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    goto :goto_2b

    :cond_42
    const/4 v0, 0x0

    .line 184
    :goto_2b
    sget-object v12, Lkn2;->d:Lyn2;

    .line 185
    invoke-virtual {v13, v12}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_43

    const/4 v12, 0x0

    .line 186
    :cond_43
    check-cast v12, Lq3;

    if-nez v12, :cond_44

    goto/16 :goto_0

    :cond_44
    iget-object v12, v12, Lq3;->b:Lun0;

    .line 187
    sget-object v14, Lvn2;->v:Lyn2;

    .line 188
    invoke-virtual {v13, v14}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_45

    const/4 v14, 0x0

    .line 189
    :cond_45
    check-cast v14, Lel2;

    if-eqz v14, :cond_51

    if-eqz v9, :cond_51

    if-eqz v0, :cond_46

    .line 190
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v9

    move-object/from16 p2, v0

    move/from16 p1, v1

    goto :goto_2c

    :cond_46
    move-object/from16 p2, v0

    move/from16 p1, v1

    shr-long v0, v10, v18

    long-to-int v0, v0

    .line 191
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    :goto_2c
    if-nez v3, :cond_47

    if-eqz v2, :cond_48

    :cond_47
    neg-float v9, v9

    .line 192
    :cond_48
    iget-object v0, v8, Lr61;->G:Ld61;

    if-ne v0, v4, :cond_49

    goto :goto_2d

    :cond_49
    const/4 v15, 0x0

    :goto_2d
    if-eqz v15, :cond_4b

    if-nez v3, :cond_4a

    if-eqz v5, :cond_4b

    :cond_4a
    neg-float v9, v9

    .line 193
    :cond_4b
    invoke-static {v14, v9}, Lh7;->q(Lel2;F)Z

    move-result v0

    if-eqz v0, :cond_52

    .line 194
    sget-object v0, Lkn2;->z:Lyn2;

    .line 195
    invoke-virtual {v13, v0}, Lrk1;->c(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4d

    .line 196
    sget-object v1, Lkn2;->B:Lyn2;

    .line 197
    invoke-virtual {v13, v1}, Lrk1;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4c

    goto :goto_2e

    .line 198
    :cond_4c
    check-cast v12, Lmn0;

    if-eqz v12, :cond_0

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v12, v0, v6}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_4d
    :goto_2e
    cmpl-float v1, v9, p0

    if-lez v1, :cond_4f

    .line 199
    sget-object v0, Lkn2;->B:Lyn2;

    .line 200
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4e

    const/4 v15, 0x0

    goto :goto_2f

    :cond_4e
    move-object v15, v0

    .line 201
    :goto_2f
    check-cast v15, Lq3;

    goto :goto_31

    .line 202
    :cond_4f
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_50

    const/4 v15, 0x0

    goto :goto_30

    :cond_50
    move-object v15, v0

    .line 203
    :goto_30
    check-cast v15, Lq3;

    :goto_31
    if-eqz v15, :cond_0

    .line 204
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 205
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_51
    move-object/from16 p2, v0

    move/from16 p1, v1

    .line 206
    :cond_52
    sget-object v0, Lvn2;->w:Lyn2;

    .line 207
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_53

    const/4 v0, 0x0

    .line 208
    :cond_53
    check-cast v0, Lel2;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_54

    .line 209
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_32

    :cond_54
    and-long v3, v10, v20

    long-to-int v1, v3

    .line 210
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    :goto_32
    if-nez v7, :cond_55

    if-eqz v2, :cond_56

    :cond_55
    neg-float v1, v1

    .line 211
    :cond_56
    invoke-static {v0, v1}, Lh7;->q(Lel2;F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    sget-object v0, Lkn2;->y:Lyn2;

    .line 213
    invoke-virtual {v13, v0}, Lrk1;->c(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_58

    .line 214
    sget-object v2, Lkn2;->A:Lyn2;

    .line 215
    invoke-virtual {v13, v2}, Lrk1;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_57

    goto :goto_33

    .line 216
    :cond_57
    check-cast v12, Lmn0;

    if-eqz v12, :cond_0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v12, v6, v0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_58
    :goto_33
    cmpl-float v1, v1, p0

    if-lez v1, :cond_5a

    .line 217
    sget-object v0, Lkn2;->A:Lyn2;

    .line 218
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_59

    const/4 v15, 0x0

    goto :goto_34

    :cond_59
    move-object v15, v0

    .line 219
    :goto_34
    check-cast v15, Lq3;

    goto :goto_36

    .line 220
    :cond_5a
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5b

    const/4 v15, 0x0

    goto :goto_35

    :cond_5b
    move-object v15, v0

    .line 221
    :goto_35
    check-cast v15, Lq3;

    :goto_36
    if-eqz v15, :cond_0

    .line 222
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 223
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 224
    :sswitch_a
    sget-object v0, Lkn2;->c:Lyn2;

    .line 225
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5c

    const/4 v15, 0x0

    goto :goto_37

    :cond_5c
    move-object v15, v0

    .line 226
    :goto_37
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 227
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 228
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 229
    :sswitch_b
    sget-object v1, Lkn2;->b:Lyn2;

    .line 230
    invoke-virtual {v13, v1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_5d

    const/4 v1, 0x0

    .line 231
    :cond_5d
    check-cast v1, Lq3;

    if-eqz v1, :cond_5e

    .line 232
    iget-object v1, v1, Lq3;->b:Lun0;

    .line 233
    check-cast v1, Lxm0;

    if-eqz v1, :cond_5e

    invoke-interface {v1}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    move-object/from16 v16, v1

    :goto_38
    const/16 v1, 0xc

    const/4 v3, 0x0

    goto :goto_39

    :cond_5e
    const/16 v16, 0x0

    goto :goto_38

    .line 234
    :goto_39
    invoke-static {v2, v0, v15, v3, v1}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    if-eqz v16, :cond_0

    .line 235
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 236
    :cond_5f
    sget-object v0, Lvn2;->l:Lyn2;

    .line 237
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_60

    const/4 v0, 0x0

    .line 238
    :cond_60
    invoke-static {v0, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    invoke-virtual {v7}, Lb7;->getFocusOwner()Lyk0;

    move-result-object v0

    check-cast v0, Lbl0;

    const/16 v1, 0x8

    const/4 v12, 0x0

    invoke-virtual {v0, v1, v12, v15}, Lbl0;->b(IZZ)Z

    return v15

    .line 240
    :cond_61
    invoke-virtual {v7}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_62

    invoke-virtual {v7}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 241
    :cond_62
    sget-object v0, Lkn2;->w:Lyn2;

    .line 242
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_63

    const/4 v15, 0x0

    goto :goto_3a

    :cond_63
    move-object v15, v0

    .line 243
    :goto_3a
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 244
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 245
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_64
    if-eqz v3, :cond_65

    .line 246
    const-string v0, "ACTION_ARGUMENT_SELECTION_START_INT"

    .line 247
    invoke-virtual {v3, v0, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_3b

    :cond_65
    move v0, v14

    :goto_3b
    if-eqz v3, :cond_66

    .line 248
    const-string v1, "ACTION_ARGUMENT_SELECTION_END_INT"

    .line 249
    invoke-virtual {v3, v1, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v14

    :cond_66
    const/4 v12, 0x0

    .line 250
    invoke-virtual {v2, v11, v0, v14, v12}, Lh7;->D(Lqn2;IIZ)Z

    move-result v0

    if-eqz v0, :cond_67

    .line 251
    invoke-virtual {v2, v10}, Lh7;->t(I)I

    move-result v1

    const/16 v3, 0xc

    const/4 v4, 0x0

    .line 252
    invoke-static {v2, v1, v12, v4, v3}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    :cond_67
    return v0

    .line 253
    :cond_68
    sget-object v0, Lkn2;->q:Lyn2;

    .line 254
    invoke-virtual {v13, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_69

    const/4 v15, 0x0

    goto :goto_3c

    :cond_69
    move-object v15, v0

    .line 255
    :goto_3c
    check-cast v15, Lq3;

    if-eqz v15, :cond_0

    .line 256
    iget-object v0, v15, Lq3;->b:Lun0;

    .line 257
    check-cast v0, Lxm0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_6a
    if-eqz v3, :cond_0

    .line 258
    const-string v0, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    .line 259
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 260
    const-string v5, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    .line 261
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v1, v4, :cond_6b

    move v1, v15

    goto :goto_3d

    :cond_6b
    const/4 v1, 0x0

    .line 262
    :goto_3d
    iget-object v5, v2, Lh7;->B:Ljava/lang/Integer;

    if-nez v5, :cond_6c

    goto :goto_3e

    :cond_6c
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eq v10, v5, :cond_6d

    .line 263
    :goto_3e
    iput v14, v2, Lh7;->A:I

    .line 264
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v2, Lh7;->B:Ljava/lang/Integer;

    .line 265
    :cond_6d
    invoke-static {v11}, Lh7;->m(Lqn2;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 266
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_6e

    goto/16 :goto_0

    .line 267
    :cond_6e
    invoke-static {v11}, Lh7;->m(Lqn2;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_70

    .line 268
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_6f

    goto :goto_3f

    :cond_6f
    if-eq v0, v15, :cond_7b

    const/4 v8, 0x2

    if-eq v0, v8, :cond_79

    const/4 v7, 0x4

    if-eq v0, v7, :cond_73

    const/16 v8, 0x8

    if-eq v0, v8, :cond_71

    const/16 v8, 0x10

    if-eq v0, v8, :cond_73

    :cond_70
    :goto_3f
    const/4 v7, 0x0

    goto/16 :goto_40

    .line 269
    :cond_71
    sget-object v7, Ly3;->j:Ly3;

    if-nez v7, :cond_72

    .line 270
    new-instance v7, Ly3;

    .line 271
    invoke-direct {v7}, Lv3;-><init>()V

    .line 272
    sput-object v7, Ly3;->j:Ly3;

    .line 273
    :cond_72
    sget-object v7, Ly3;->j:Ly3;

    .line 274
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    iput-object v6, v7, Lv3;->h:Ljava/lang/Object;

    goto/16 :goto_40

    .line 276
    :cond_73
    sget-object v8, Lkn2;->a:Lyn2;

    .line 277
    invoke-virtual {v13, v8}, Lrk1;->c(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_74

    goto :goto_3f

    .line 278
    :cond_74
    invoke-static {v12}, Leu;->N(Lln2;)Ly03;

    move-result-object v8

    if-nez v8, :cond_75

    goto :goto_3f

    :cond_75
    if-ne v0, v7, :cond_77

    .line 279
    sget-object v7, Lw3;->n:Lw3;

    if-nez v7, :cond_76

    .line 280
    new-instance v7, Lw3;

    const/4 v10, 0x2

    .line 281
    invoke-direct {v7, v10}, Lw3;-><init>(I)V

    .line 282
    sput-object v7, Lw3;->n:Lw3;

    .line 283
    :cond_76
    sget-object v7, Lw3;->n:Lw3;

    .line 284
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    iput-object v6, v7, Lv3;->h:Ljava/lang/Object;

    .line 286
    iput-object v8, v7, Lw3;->k:Ljava/lang/Object;

    goto :goto_40

    .line 287
    :cond_77
    sget-object v7, Lx3;->l:Lx3;

    if-nez v7, :cond_78

    .line 288
    new-instance v7, Lx3;

    .line 289
    invoke-direct {v7}, Lv3;-><init>()V

    .line 290
    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 291
    sput-object v7, Lx3;->l:Lx3;

    .line 292
    :cond_78
    sget-object v7, Lx3;->l:Lx3;

    .line 293
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    iput-object v6, v7, Lv3;->h:Ljava/lang/Object;

    .line 295
    iput-object v8, v7, Lx3;->j:Ly03;

    .line 296
    iput-object v11, v7, Lx3;->k:Lqn2;

    goto :goto_40

    .line 297
    :cond_79
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v7

    iget-object v7, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 298
    sget-object v8, Lw3;->m:Lw3;

    if-nez v8, :cond_7a

    .line 299
    new-instance v8, Lw3;

    .line 300
    invoke-direct {v8, v15}, Lw3;-><init>(I)V

    .line 301
    invoke-static {v7}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object v7

    iput-object v7, v8, Lw3;->k:Ljava/lang/Object;

    .line 302
    sput-object v8, Lw3;->m:Lw3;

    .line 303
    :cond_7a
    sget-object v7, Lw3;->m:Lw3;

    .line 304
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    invoke-virtual {v7, v6}, Lw3;->l(Ljava/lang/String;)V

    goto :goto_40

    .line 306
    :cond_7b
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v7

    iget-object v7, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 307
    sget-object v8, Lw3;->l:Lw3;

    if-nez v8, :cond_7c

    .line 308
    new-instance v8, Lw3;

    const/4 v12, 0x0

    .line 309
    invoke-direct {v8, v12}, Lw3;-><init>(I)V

    .line 310
    invoke-static {v7}, Ljava/text/BreakIterator;->getCharacterInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object v7

    iput-object v7, v8, Lw3;->k:Ljava/lang/Object;

    .line 311
    sput-object v8, Lw3;->l:Lw3;

    .line 312
    :cond_7c
    sget-object v7, Lw3;->l:Lw3;

    .line 313
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    invoke-virtual {v7, v6}, Lw3;->l(Ljava/lang/String;)V

    :goto_40
    if-nez v7, :cond_7d

    goto/16 :goto_0

    .line 315
    :cond_7d
    invoke-virtual {v2, v11}, Lh7;->j(Lqn2;)I

    move-result v6

    if-ne v6, v14, :cond_7f

    if-eqz v1, :cond_7e

    const/4 v5, 0x0

    goto :goto_41

    .line 316
    :cond_7e
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    :goto_41
    move v6, v5

    :cond_7f
    if-eqz v1, :cond_80

    .line 317
    invoke-virtual {v7, v6}, Lv3;->a(I)[I

    move-result-object v5

    goto :goto_42

    :cond_80
    invoke-virtual {v7, v6}, Lv3;->i(I)[I

    move-result-object v5

    :goto_42
    if-nez v5, :cond_81

    goto/16 :goto_0

    :cond_81
    const/16 v17, 0x0

    .line 318
    aget v6, v5, v17

    .line 319
    aget v5, v5, v15

    if-eqz v3, :cond_85

    .line 320
    sget-object v3, Lvn2;->a:Lyn2;

    .line 321
    invoke-virtual {v13, v3}, Lrk1;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_85

    .line 322
    sget-object v3, Lvn2;->G:Lyn2;

    .line 323
    invoke-virtual {v13, v3}, Lrk1;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_85

    .line 324
    invoke-virtual {v2, v11}, Lh7;->k(Lqn2;)I

    move-result v3

    if-ne v3, v14, :cond_83

    if-eqz v1, :cond_82

    move v3, v6

    goto :goto_43

    :cond_82
    move v3, v5

    :cond_83
    :goto_43
    if-eqz v1, :cond_84

    move v7, v5

    goto :goto_45

    :cond_84
    move v7, v6

    goto :goto_45

    :cond_85
    if-eqz v1, :cond_86

    move v3, v5

    goto :goto_44

    :cond_86
    move v3, v6

    :goto_44
    move v7, v3

    :goto_45
    if-eqz v1, :cond_87

    move v12, v4

    goto :goto_46

    :cond_87
    move v12, v9

    .line 325
    :goto_46
    new-instance v10, Ld7;

    .line 326
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v16

    move v13, v0

    move v14, v6

    move v1, v15

    move v15, v5

    .line 327
    invoke-direct/range {v10 .. v17}, Ld7;-><init>(Lqn2;IIIIJ)V

    .line 328
    iput-object v10, v2, Lh7;->F:Ld7;

    .line 329
    invoke-virtual {v2, v11, v3, v7, v1}, Lh7;->D(Lqn2;IIZ)Z

    return v1

    :cond_88
    move v1, v15

    .line 330
    iget v3, v2, Lh7;->r:I

    if-ne v3, v0, :cond_89

    move v15, v1

    goto :goto_47

    :cond_89
    const/4 v15, 0x0

    :goto_47
    if-eqz v15, :cond_0

    .line 331
    iput v14, v2, Lh7;->r:I

    const/4 v3, 0x0

    .line 332
    iput-object v3, v2, Lh7;->t:Ll4;

    .line 333
    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    const/high16 v4, 0x10000

    const/16 v5, 0xc

    .line 334
    invoke-static {v2, v0, v4, v3, v5}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    return v1

    :cond_8a
    move v1, v15

    .line 335
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_8b

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v3

    if-eqz v3, :cond_8b

    move v15, v1

    goto :goto_48

    :cond_8b
    const/4 v15, 0x0

    :goto_48
    if-nez v15, :cond_8c

    goto/16 :goto_0

    .line 336
    :cond_8c
    iget v3, v2, Lh7;->r:I

    if-ne v3, v0, :cond_8d

    move v15, v1

    goto :goto_49

    :cond_8d
    const/4 v15, 0x0

    :goto_49
    if-nez v15, :cond_0

    if-eq v3, v14, :cond_8e

    const/high16 v4, 0x10000

    const/16 v5, 0xc

    const/4 v6, 0x0

    .line 337
    invoke-static {v2, v3, v4, v6, v5}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    goto :goto_4a

    :cond_8e
    const/16 v5, 0xc

    const/4 v6, 0x0

    .line 338
    :goto_4a
    iput v0, v2, Lh7;->r:I

    .line 339
    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    const v3, 0x8000

    .line 340
    invoke-static {v2, v0, v3, v6, v5}, Lh7;->x(Lh7;IILjava/lang/Integer;I)V

    return v1

    :goto_4b
    return v17

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_b
        0x20 -> :sswitch_a
        0x1000 -> :sswitch_0
        0x2000 -> :sswitch_0
        0x8000 -> :sswitch_9
        0x10000 -> :sswitch_8
        0x40000 -> :sswitch_7
        0x80000 -> :sswitch_6
        0x100000 -> :sswitch_5
        0x200000 -> :sswitch_4
        0x1020036 -> :sswitch_3
        0x102003d -> :sswitch_2
        0x1020054 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1020038
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1020046
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
