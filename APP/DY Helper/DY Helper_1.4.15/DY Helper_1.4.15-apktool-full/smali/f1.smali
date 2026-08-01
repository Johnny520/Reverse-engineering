.class public final Lf1;
.super Ln;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic θ:Ll1;


# direct methods
.method public constructor <init>(Ll1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf1;->θ:Ll1;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Ln;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final ξ(ILэ;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lf1;->θ:Ll1;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Ll1;->κ(ILэ;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ο(I)Lэ;
    .locals 49

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
    iget-object v3, v3, Lf1;->θ:Ll1;

    .line 11
    .line 12
    iget-object v4, v3, Ll1;->λ:Landroid/view/accessibility/AccessibilityManager;

    .line 13
    .line 14
    iget-object v5, v3, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 15
    .line 16
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    iget-object v6, v6, Lpn;->γ:Lhr0;

    .line 21
    .line 22
    invoke-interface {v6}, Lhr0;->δ()Ljr0;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    iget-object v6, v6, Ljr0;->γ:Lcr0;

    .line 27
    .line 28
    sget-object v7, Lcr0;->ε:Lcr0;

    .line 29
    .line 30
    if-ne v6, v7, :cond_0

    .line 31
    .line 32
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_4

    .line 37
    .line 38
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v8, Lэ;

    .line 43
    .line 44
    invoke-direct {v8, v0}, Lэ;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_5b

    .line 48
    .line 49
    :cond_0
    invoke-virtual {v3}, Ll1;->σ()Lsm0;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v6, v0}, Lsm0;->β(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Lds1;

    .line 58
    .line 59
    if-nez v6, :cond_1

    .line 60
    .line 61
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v8, Lэ;

    .line 72
    .line 73
    invoke-direct {v8, v0}, Lэ;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_5b

    .line 77
    .line 78
    :cond_1
    iget-object v7, v6, Lds1;->α:Lbs1;

    .line 79
    .line 80
    invoke-virtual {v7}, Lbs1;->λ()Lxr1;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    sget-object v10, Lfs1;->ξ:Lis1;

    .line 85
    .line 86
    iget-object v9, v9, Lxr1;->ε:Lb21;

    .line 87
    .line 88
    invoke-virtual {v9, v10}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    if-nez v9, :cond_2

    .line 93
    .line 94
    const/4 v9, 0x0

    .line 95
    :cond_2
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    const/16 v10, 0x22

    .line 102
    .line 103
    if-eqz v9, :cond_5

    .line 104
    .line 105
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 106
    .line 107
    if-lt v12, v10, :cond_3

    .line 108
    .line 109
    invoke-static {v4}, Lп;->θ(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    goto :goto_0

    .line 114
    :cond_3
    const/4 v12, 0x1

    .line 115
    :goto_0
    if-nez v12, :cond_5

    .line 116
    .line 117
    :cond_4
    const/4 v8, 0x0

    .line 118
    goto/16 :goto_5b

    .line 119
    .line 120
    :cond_5
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    new-instance v13, Lэ;

    .line 125
    .line 126
    invoke-direct {v13, v12}, Lэ;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 127
    .line 128
    .line 129
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 130
    .line 131
    const/4 v15, 0x0

    .line 132
    if-lt v14, v10, :cond_7

    .line 133
    .line 134
    invoke-static {v12, v9}, Lп;->κ(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 135
    .line 136
    .line 137
    :cond_6
    const/16 p0, 0x0

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    invoke-virtual {v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-eqz v1, :cond_6

    .line 145
    .line 146
    const/16 p0, 0x0

    .line 147
    .line 148
    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    .line 149
    .line 150
    invoke-virtual {v1, v8, v15}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 151
    .line 152
    .line 153
    move-result v17

    .line 154
    and-int/lit8 v17, v17, -0x41

    .line 155
    .line 156
    if-eqz v9, :cond_8

    .line 157
    .line 158
    const/16 v9, 0x40

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_8
    move v9, v15

    .line 162
    :goto_1
    or-int v9, v17, v9

    .line 163
    .line 164
    invoke-virtual {v1, v8, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    :goto_2
    const/4 v1, -0x1

    .line 168
    if-ne v0, v1, :cond_a

    .line 169
    .line 170
    invoke-virtual {v5}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    instance-of v9, v8, Landroid/view/View;

    .line 175
    .line 176
    if-eqz v9, :cond_9

    .line 177
    .line 178
    check-cast v8, Landroid/view/View;

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_9
    move-object/from16 v8, p0

    .line 182
    .line 183
    :goto_3
    iput v1, v13, Lэ;->β:I

    .line 184
    .line 185
    invoke-virtual {v12, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_a
    invoke-virtual {v7}, Lbs1;->μ()Lbs1;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    if-eqz v8, :cond_b

    .line 194
    .line 195
    iget v8, v8, Lbs1;->ζ:I

    .line 196
    .line 197
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    goto :goto_4

    .line 202
    :cond_b
    move-object/from16 v8, p0

    .line 203
    .line 204
    :goto_4
    if-eqz v8, :cond_b8

    .line 205
    .line 206
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    invoke-virtual {v9}, Les1;->α()Lbs1;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    iget v9, v9, Lbs1;->ζ:I

    .line 219
    .line 220
    if-ne v8, v9, :cond_c

    .line 221
    .line 222
    move v8, v1

    .line 223
    :cond_c
    iput v8, v13, Lэ;->β:I

    .line 224
    .line 225
    invoke-virtual {v12, v5, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 226
    .line 227
    .line 228
    :goto_5
    iput v0, v13, Lэ;->γ:I

    .line 229
    .line 230
    invoke-virtual {v12, v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 231
    .line 232
    .line 233
    iget-object v6, v6, Lds1;->β:Lym0;

    .line 234
    .line 235
    iget v8, v6, Lym0;->α:I

    .line 236
    .line 237
    int-to-float v8, v8

    .line 238
    iget v9, v6, Lym0;->β:I

    .line 239
    .line 240
    int-to-float v9, v9

    .line 241
    iget v15, v6, Lym0;->γ:I

    .line 242
    .line 243
    int-to-float v15, v15

    .line 244
    iget v6, v6, Lym0;->δ:I

    .line 245
    .line 246
    int-to-float v6, v6

    .line 247
    invoke-virtual {v3, v8, v9, v15, v6}, Ll1;->Κ(FFFF)Landroid/graphics/Rect;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-virtual {v12, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 252
    .line 253
    .line 254
    iget-object v6, v3, Ll1;->Ν:Ll11;

    .line 255
    .line 256
    iget-object v8, v3, Ll1;->υ:Lkz1;

    .line 257
    .line 258
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    const-string v15, "android.view.View"

    .line 267
    .line 268
    invoke-virtual {v13, v15}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 269
    .line 270
    .line 271
    iget-object v15, v7, Lbs1;->δ:Lxr1;

    .line 272
    .line 273
    iget-object v11, v15, Lxr1;->ε:Lb21;

    .line 274
    .line 275
    sget-object v1, Lfs1;->Ζ:Lis1;

    .line 276
    .line 277
    invoke-virtual {v11, v1}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-eqz v1, :cond_d

    .line 282
    .line 283
    const-string v1, "android.widget.EditText"

    .line 284
    .line 285
    invoke-virtual {v13, v1}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 286
    .line 287
    .line 288
    :cond_d
    sget-object v1, Lfs1;->Β:Lis1;

    .line 289
    .line 290
    invoke-virtual {v11, v1}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_e

    .line 295
    .line 296
    const-string v1, "android.widget.TextView"

    .line 297
    .line 298
    invoke-virtual {v13, v1}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 299
    .line 300
    .line 301
    :cond_e
    sget-object v1, Lfs1;->ψ:Lis1;

    .line 302
    .line 303
    invoke-virtual {v11, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    if-nez v1, :cond_f

    .line 308
    .line 309
    move-object/from16 v1, p0

    .line 310
    .line 311
    :cond_f
    check-cast v1, Lso1;

    .line 312
    .line 313
    if-eqz v1, :cond_14

    .line 314
    .line 315
    iget v10, v1, Lso1;->α:I

    .line 316
    .line 317
    invoke-virtual {v7}, Lbs1;->ο()Z

    .line 318
    .line 319
    .line 320
    move-result v22

    .line 321
    if-nez v22, :cond_10

    .line 322
    .line 323
    move-object/from16 v22, v2

    .line 324
    .line 325
    const/4 v2, 0x4

    .line 326
    invoke-static {v2, v7}, Lbs1;->κ(ILbs1;)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v21

    .line 330
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v21

    .line 334
    move-object/from16 v23, v4

    .line 335
    .line 336
    if-eqz v21, :cond_15

    .line 337
    .line 338
    goto :goto_6

    .line 339
    :cond_10
    move-object/from16 v22, v2

    .line 340
    .line 341
    const/4 v2, 0x4

    .line 342
    move-object/from16 v23, v4

    .line 343
    .line 344
    :goto_6
    const-string v4, "AccessibilityNodeInfo.roleDescription"

    .line 345
    .line 346
    if-ne v10, v2, :cond_11

    .line 347
    .line 348
    const v2, 0x7f0f008b

    .line 349
    .line 350
    .line 351
    invoke-virtual {v9, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 356
    .line 357
    .line 358
    move-result-object v10

    .line 359
    invoke-virtual {v10, v4, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 360
    .line 361
    .line 362
    goto :goto_7

    .line 363
    :cond_11
    const/4 v2, 0x2

    .line 364
    if-ne v10, v2, :cond_12

    .line 365
    .line 366
    const v2, 0x7f0f008a

    .line 367
    .line 368
    .line 369
    invoke-virtual {v9, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 374
    .line 375
    .line 376
    move-result-object v10

    .line 377
    invoke-virtual {v10, v4, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 378
    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_12
    invoke-static {v10}, Lv71;->σ(I)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    const/4 v4, 0x5

    .line 386
    if-ne v10, v4, :cond_13

    .line 387
    .line 388
    invoke-virtual {v7}, Lbs1;->ρ()Z

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    if-nez v4, :cond_13

    .line 393
    .line 394
    iget-boolean v4, v15, Lxr1;->η:Z

    .line 395
    .line 396
    if-eqz v4, :cond_15

    .line 397
    .line 398
    :cond_13
    invoke-virtual {v13, v2}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 399
    .line 400
    .line 401
    goto :goto_7

    .line 402
    :cond_14
    move-object/from16 v22, v2

    .line 403
    .line 404
    move-object/from16 v23, v4

    .line 405
    .line 406
    :cond_15
    :goto_7
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-virtual {v12, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 415
    .line 416
    .line 417
    invoke-static {v7}, Lh62;->й(Lbs1;)Z

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-virtual {v12, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    .line 422
    .line 423
    .line 424
    const/16 v2, 0x22

    .line 425
    .line 426
    if-lt v14, v2, :cond_16

    .line 427
    .line 428
    invoke-static/range {v23 .. v23}, Lп;->θ(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    :goto_8
    const/4 v4, 0x4

    .line 433
    goto :goto_9

    .line 434
    :cond_16
    const/4 v2, 0x1

    .line 435
    goto :goto_8

    .line 436
    :goto_9
    invoke-static {v4, v7}, Lbs1;->κ(ILbs1;)Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    move/from16 v19, v2

    .line 445
    .line 446
    move-object/from16 v23, v8

    .line 447
    .line 448
    const/4 v2, 0x0

    .line 449
    const/4 v14, 0x0

    .line 450
    :goto_a
    iget-object v8, v13, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 451
    .line 452
    if-ge v14, v4, :cond_1e

    .line 453
    .line 454
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v24

    .line 458
    move/from16 v25, v4

    .line 459
    .line 460
    move-object/from16 v4, v24

    .line 461
    .line 462
    check-cast v4, Lbs1;

    .line 463
    .line 464
    move-object/from16 v24, v10

    .line 465
    .line 466
    invoke-virtual {v3}, Ll1;->σ()Lsm0;

    .line 467
    .line 468
    .line 469
    move-result-object v10

    .line 470
    move/from16 v26, v14

    .line 471
    .line 472
    iget v14, v4, Lbs1;->ζ:I

    .line 473
    .line 474
    invoke-virtual {v10, v14}, Lsm0;->α(I)Z

    .line 475
    .line 476
    .line 477
    move-result v10

    .line 478
    if-eqz v10, :cond_1d

    .line 479
    .line 480
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 481
    .line 482
    .line 483
    move-result-object v10

    .line 484
    invoke-virtual {v10}, Landroidx/compose/ui/platform/AndroidViewsHandler;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 485
    .line 486
    .line 487
    move-result-object v10

    .line 488
    iget-object v4, v4, Lbs1;->γ:Lyp0;

    .line 489
    .line 490
    invoke-virtual {v10, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    check-cast v4, Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 495
    .line 496
    const/4 v10, -0x1

    .line 497
    if-ne v14, v10, :cond_17

    .line 498
    .line 499
    goto :goto_d

    .line 500
    :cond_17
    if-eqz v4, :cond_18

    .line 501
    .line 502
    invoke-virtual {v8, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;)V

    .line 503
    .line 504
    .line 505
    goto :goto_c

    .line 506
    :cond_18
    invoke-virtual {v3}, Ll1;->σ()Lsm0;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    invoke-virtual {v4, v14}, Lsm0;->β(I)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    check-cast v4, Lds1;

    .line 515
    .line 516
    if-eqz v4, :cond_1a

    .line 517
    .line 518
    iget-object v4, v4, Lds1;->α:Lbs1;

    .line 519
    .line 520
    if-eqz v4, :cond_1a

    .line 521
    .line 522
    invoke-virtual {v4}, Lbs1;->λ()Lxr1;

    .line 523
    .line 524
    .line 525
    move-result-object v4

    .line 526
    sget-object v8, Lfs1;->ξ:Lis1;

    .line 527
    .line 528
    iget-object v4, v4, Lxr1;->ε:Lb21;

    .line 529
    .line 530
    invoke-virtual {v4, v8}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v4

    .line 534
    if-nez v4, :cond_19

    .line 535
    .line 536
    move-object/from16 v4, p0

    .line 537
    .line 538
    :cond_19
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 539
    .line 540
    invoke-static {v4, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    goto :goto_b

    .line 545
    :cond_1a
    const/4 v4, 0x0

    .line 546
    :goto_b
    if-nez v19, :cond_1b

    .line 547
    .line 548
    if-nez v4, :cond_1c

    .line 549
    .line 550
    :cond_1b
    invoke-virtual {v12, v5, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 551
    .line 552
    .line 553
    :cond_1c
    :goto_c
    invoke-virtual {v6, v14, v2}, Ll11;->ζ(II)V

    .line 554
    .line 555
    .line 556
    add-int/lit8 v2, v2, 0x1

    .line 557
    .line 558
    :cond_1d
    :goto_d
    add-int/lit8 v14, v26, 0x1

    .line 559
    .line 560
    move-object/from16 v10, v24

    .line 561
    .line 562
    move/from16 v4, v25

    .line 563
    .line 564
    goto :goto_a

    .line 565
    :cond_1e
    iget v2, v3, Ll1;->ο:I

    .line 566
    .line 567
    if-ne v0, v2, :cond_1f

    .line 568
    .line 569
    const/4 v2, 0x1

    .line 570
    invoke-virtual {v8, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 571
    .line 572
    .line 573
    sget-object v2, Lч;->ζ:Lч;

    .line 574
    .line 575
    invoke-virtual {v13, v2}, Lэ;->β(Lч;)V

    .line 576
    .line 577
    .line 578
    goto :goto_e

    .line 579
    :cond_1f
    const/4 v2, 0x0

    .line 580
    invoke-virtual {v8, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 581
    .line 582
    .line 583
    sget-object v2, Lч;->ε:Lч;

    .line 584
    .line 585
    invoke-virtual {v13, v2}, Lэ;->β(Lч;)V

    .line 586
    .line 587
    .line 588
    :goto_e
    invoke-static {v7}, Lkn0;->Γ(Lbs1;)Lg4;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    if-eqz v2, :cond_42

    .line 593
    .line 594
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getFontFamilyResolver()Lf50;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Lyr;

    .line 598
    .line 599
    .line 600
    move-result-object v27

    .line 601
    iget-object v10, v3, Ll1;->Ι:Lm6;

    .line 602
    .line 603
    new-instance v14, Landroid/text/SpannableString;

    .line 604
    .line 605
    iget-object v4, v2, Lg4;->ζ:Ljava/lang/String;

    .line 606
    .line 607
    move-object/from16 v30, v5

    .line 608
    .line 609
    iget-object v5, v2, Lg4;->ε:Ljava/util/List;

    .line 610
    .line 611
    invoke-direct {v14, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 612
    .line 613
    .line 614
    iget-object v2, v2, Lg4;->η:Ljava/util/ArrayList;

    .line 615
    .line 616
    move-object/from16 v31, v4

    .line 617
    .line 618
    if-eqz v2, :cond_30

    .line 619
    .line 620
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 621
    .line 622
    .line 623
    move-result v4

    .line 624
    move-object/from16 v33, v3

    .line 625
    .line 626
    const/4 v3, 0x0

    .line 627
    :goto_f
    if-ge v3, v4, :cond_2f

    .line 628
    .line 629
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v24

    .line 633
    move-object/from16 v34, v2

    .line 634
    .line 635
    move-object/from16 v2, v24

    .line 636
    .line 637
    check-cast v2, Lf4;

    .line 638
    .line 639
    move/from16 v35, v3

    .line 640
    .line 641
    iget-object v3, v2, Lf4;->α:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast v3, Lux1;

    .line 644
    .line 645
    move/from16 v36, v4

    .line 646
    .line 647
    iget v4, v2, Lf4;->β:I

    .line 648
    .line 649
    iget v2, v2, Lf4;->γ:I

    .line 650
    .line 651
    move-object/from16 v37, v13

    .line 652
    .line 653
    iget-object v13, v3, Lux1;->α:Lf32;

    .line 654
    .line 655
    move-object/from16 v38, v1

    .line 656
    .line 657
    invoke-interface {v13}, Lf32;->β()J

    .line 658
    .line 659
    .line 660
    move-result-wide v0

    .line 661
    move-object/from16 v39, v6

    .line 662
    .line 663
    move-object v13, v7

    .line 664
    iget-wide v6, v3, Lux1;->β:J

    .line 665
    .line 666
    move-wide/from16 v25, v6

    .line 667
    .line 668
    iget-object v6, v3, Lux1;->γ:Ld60;

    .line 669
    .line 670
    iget-object v7, v3, Lux1;->δ:Lb60;

    .line 671
    .line 672
    move-object/from16 v40, v6

    .line 673
    .line 674
    iget-object v6, v3, Lux1;->κ:Lg32;

    .line 675
    .line 676
    move-object/from16 v41, v13

    .line 677
    .line 678
    iget-object v13, v3, Lux1;->λ:Lav0;

    .line 679
    .line 680
    move-object/from16 v43, v11

    .line 681
    .line 682
    move-object/from16 v42, v12

    .line 683
    .line 684
    iget-wide v11, v3, Lux1;->μ:J

    .line 685
    .line 686
    move-wide/from16 v44, v11

    .line 687
    .line 688
    iget-object v11, v3, Lux1;->ν:Lc32;

    .line 689
    .line 690
    iget-object v3, v3, Lux1;->α:Lf32;

    .line 691
    .line 692
    move-object/from16 v46, v8

    .line 693
    .line 694
    move-object v12, v9

    .line 695
    invoke-interface {v3}, Lf32;->β()J

    .line 696
    .line 697
    .line 698
    move-result-wide v8

    .line 699
    invoke-static {v0, v1, v8, v9}, Lci;->γ(JJ)Z

    .line 700
    .line 701
    .line 702
    move-result v8

    .line 703
    const-wide/16 v47, 0x10

    .line 704
    .line 705
    if-eqz v8, :cond_20

    .line 706
    .line 707
    goto :goto_10

    .line 708
    :cond_20
    cmp-long v3, v0, v47

    .line 709
    .line 710
    if-eqz v3, :cond_21

    .line 711
    .line 712
    new-instance v3, Loi;

    .line 713
    .line 714
    invoke-direct {v3, v0, v1}, Loi;-><init>(J)V

    .line 715
    .line 716
    .line 717
    goto :goto_10

    .line 718
    :cond_21
    sget-object v0, Lxn0;->Ε:Lxn0;

    .line 719
    .line 720
    move-object v3, v0

    .line 721
    :goto_10
    invoke-interface {v3}, Lf32;->β()J

    .line 722
    .line 723
    .line 724
    move-result-wide v0

    .line 725
    invoke-static {v14, v0, v1, v4, v2}, Lp91;->Β(Landroid/text/Spannable;JII)V

    .line 726
    .line 727
    .line 728
    move/from16 v29, v2

    .line 729
    .line 730
    move/from16 v28, v4

    .line 731
    .line 732
    move-object/from16 v24, v14

    .line 733
    .line 734
    invoke-static/range {v24 .. v29}, Lp91;->Γ(Landroid/text/Spannable;JLyr;II)V

    .line 735
    .line 736
    .line 737
    move-object/from16 v0, v24

    .line 738
    .line 739
    move/from16 v1, v28

    .line 740
    .line 741
    if-nez v40, :cond_23

    .line 742
    .line 743
    if-eqz v7, :cond_22

    .line 744
    .line 745
    goto :goto_11

    .line 746
    :cond_22
    const/16 v3, 0x21

    .line 747
    .line 748
    goto :goto_18

    .line 749
    :cond_23
    :goto_11
    if-nez v40, :cond_24

    .line 750
    .line 751
    sget-object v3, Ld60;->η:Ld60;

    .line 752
    .line 753
    goto :goto_12

    .line 754
    :cond_24
    move-object/from16 v3, v40

    .line 755
    .line 756
    :goto_12
    if-eqz v7, :cond_25

    .line 757
    .line 758
    iget v4, v7, Lb60;->α:I

    .line 759
    .line 760
    goto :goto_13

    .line 761
    :cond_25
    const/4 v4, 0x0

    .line 762
    :goto_13
    new-instance v7, Landroid/text/style/StyleSpan;

    .line 763
    .line 764
    sget-object v8, Ld60;->ζ:Ld60;

    .line 765
    .line 766
    iget v3, v3, Ld60;->ε:I

    .line 767
    .line 768
    iget v8, v8, Ld60;->ε:I

    .line 769
    .line 770
    invoke-static {v3, v8}, Lln0;->ο(II)I

    .line 771
    .line 772
    .line 773
    move-result v3

    .line 774
    if-ltz v3, :cond_26

    .line 775
    .line 776
    const/4 v3, 0x1

    .line 777
    :goto_14
    const/4 v8, 0x1

    .line 778
    goto :goto_15

    .line 779
    :cond_26
    const/4 v3, 0x0

    .line 780
    goto :goto_14

    .line 781
    :goto_15
    if-ne v4, v8, :cond_27

    .line 782
    .line 783
    const/4 v4, 0x1

    .line 784
    goto :goto_16

    .line 785
    :cond_27
    const/4 v4, 0x0

    .line 786
    :goto_16
    if-eqz v4, :cond_28

    .line 787
    .line 788
    if-eqz v3, :cond_28

    .line 789
    .line 790
    const/4 v3, 0x3

    .line 791
    goto :goto_17

    .line 792
    :cond_28
    if-eqz v3, :cond_29

    .line 793
    .line 794
    const/4 v3, 0x1

    .line 795
    goto :goto_17

    .line 796
    :cond_29
    if-eqz v4, :cond_2a

    .line 797
    .line 798
    const/4 v3, 0x2

    .line 799
    goto :goto_17

    .line 800
    :cond_2a
    const/4 v3, 0x0

    .line 801
    :goto_17
    invoke-direct {v7, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 802
    .line 803
    .line 804
    const/16 v3, 0x21

    .line 805
    .line 806
    invoke-virtual {v0, v7, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 807
    .line 808
    .line 809
    :goto_18
    if-eqz v11, :cond_2c

    .line 810
    .line 811
    iget v4, v11, Lc32;->α:I

    .line 812
    .line 813
    or-int/lit8 v7, v4, 0x1

    .line 814
    .line 815
    if-ne v7, v4, :cond_2b

    .line 816
    .line 817
    new-instance v7, Landroid/text/style/UnderlineSpan;

    .line 818
    .line 819
    invoke-direct {v7}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v0, v7, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 823
    .line 824
    .line 825
    :cond_2b
    or-int/lit8 v7, v4, 0x2

    .line 826
    .line 827
    if-ne v7, v4, :cond_2c

    .line 828
    .line 829
    new-instance v4, Landroid/text/style/StrikethroughSpan;

    .line 830
    .line 831
    invoke-direct {v4}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 835
    .line 836
    .line 837
    :cond_2c
    if-eqz v6, :cond_2d

    .line 838
    .line 839
    new-instance v4, Landroid/text/style/ScaleXSpan;

    .line 840
    .line 841
    iget v6, v6, Lg32;->α:F

    .line 842
    .line 843
    invoke-direct {v4, v6}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 847
    .line 848
    .line 849
    :cond_2d
    invoke-static {v0, v13, v1, v2}, Lp91;->Δ(Landroid/text/Spannable;Lav0;II)V

    .line 850
    .line 851
    .line 852
    cmp-long v4, v44, v47

    .line 853
    .line 854
    if-eqz v4, :cond_2e

    .line 855
    .line 856
    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    .line 857
    .line 858
    invoke-static/range {v44 .. v45}, Lkn0;->Τ(J)I

    .line 859
    .line 860
    .line 861
    move-result v6

    .line 862
    invoke-direct {v4, v6}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 866
    .line 867
    .line 868
    :cond_2e
    add-int/lit8 v3, v35, 0x1

    .line 869
    .line 870
    move-object v14, v0

    .line 871
    move-object v9, v12

    .line 872
    move-object/from16 v2, v34

    .line 873
    .line 874
    move/from16 v4, v36

    .line 875
    .line 876
    move-object/from16 v13, v37

    .line 877
    .line 878
    move-object/from16 v1, v38

    .line 879
    .line 880
    move-object/from16 v6, v39

    .line 881
    .line 882
    move-object/from16 v7, v41

    .line 883
    .line 884
    move-object/from16 v12, v42

    .line 885
    .line 886
    move-object/from16 v11, v43

    .line 887
    .line 888
    move-object/from16 v8, v46

    .line 889
    .line 890
    move/from16 v0, p1

    .line 891
    .line 892
    goto/16 :goto_f

    .line 893
    .line 894
    :cond_2f
    :goto_19
    move-object/from16 v38, v1

    .line 895
    .line 896
    move-object/from16 v39, v6

    .line 897
    .line 898
    move-object/from16 v41, v7

    .line 899
    .line 900
    move-object/from16 v46, v8

    .line 901
    .line 902
    move-object/from16 v43, v11

    .line 903
    .line 904
    move-object/from16 v42, v12

    .line 905
    .line 906
    move-object/from16 v37, v13

    .line 907
    .line 908
    move-object v0, v14

    .line 909
    move-object v12, v9

    .line 910
    goto :goto_1a

    .line 911
    :cond_30
    move-object/from16 v33, v3

    .line 912
    .line 913
    goto :goto_19

    .line 914
    :goto_1a
    invoke-virtual/range {v31 .. v31}, Ljava/lang/String;->length()I

    .line 915
    .line 916
    .line 917
    move-result v1

    .line 918
    sget-object v2, Ljz;->ε:Ljz;

    .line 919
    .line 920
    if-eqz v5, :cond_32

    .line 921
    .line 922
    new-instance v3, Ljava/util/ArrayList;

    .line 923
    .line 924
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 925
    .line 926
    .line 927
    move-result v4

    .line 928
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 929
    .line 930
    .line 931
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 932
    .line 933
    .line 934
    move-result v4

    .line 935
    const/4 v6, 0x0

    .line 936
    :goto_1b
    if-ge v6, v4, :cond_33

    .line 937
    .line 938
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v7

    .line 942
    move-object v8, v7

    .line 943
    check-cast v8, Lf4;

    .line 944
    .line 945
    iget-object v9, v8, Lf4;->α:Ljava/lang/Object;

    .line 946
    .line 947
    instance-of v9, v9, Lq72;

    .line 948
    .line 949
    if-eqz v9, :cond_31

    .line 950
    .line 951
    iget v9, v8, Lf4;->β:I

    .line 952
    .line 953
    iget v8, v8, Lf4;->γ:I

    .line 954
    .line 955
    const/4 v11, 0x0

    .line 956
    invoke-static {v11, v1, v9, v8}, Lh4;->α(IIII)Z

    .line 957
    .line 958
    .line 959
    move-result v8

    .line 960
    if-eqz v8, :cond_31

    .line 961
    .line 962
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    :cond_31
    add-int/lit8 v6, v6, 0x1

    .line 966
    .line 967
    goto :goto_1b

    .line 968
    :cond_32
    move-object v3, v2

    .line 969
    :cond_33
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 970
    .line 971
    .line 972
    move-result v1

    .line 973
    const/4 v4, 0x0

    .line 974
    :goto_1c
    if-ge v4, v1, :cond_35

    .line 975
    .line 976
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v6

    .line 980
    check-cast v6, Lf4;

    .line 981
    .line 982
    iget-object v7, v6, Lf4;->α:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v7, Lq72;

    .line 985
    .line 986
    iget v8, v6, Lf4;->β:I

    .line 987
    .line 988
    iget v6, v6, Lf4;->γ:I

    .line 989
    .line 990
    instance-of v9, v7, Lq72;

    .line 991
    .line 992
    if-eqz v9, :cond_34

    .line 993
    .line 994
    new-instance v9, Landroid/text/style/TtsSpan$VerbatimBuilder;

    .line 995
    .line 996
    iget-object v7, v7, Lq72;->α:Ljava/lang/String;

    .line 997
    .line 998
    invoke-direct {v9, v7}, Landroid/text/style/TtsSpan$VerbatimBuilder;-><init>(Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v9}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v7

    .line 1005
    const/16 v9, 0x21

    .line 1006
    .line 1007
    invoke-virtual {v0, v7, v8, v6, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1008
    .line 1009
    .line 1010
    add-int/lit8 v4, v4, 0x1

    .line 1011
    .line 1012
    goto :goto_1c

    .line 1013
    :cond_34
    invoke-static {}, Lγ;->κ()V

    .line 1014
    .line 1015
    .line 1016
    return-object p0

    .line 1017
    :cond_35
    invoke-virtual/range {v31 .. v31}, Ljava/lang/String;->length()I

    .line 1018
    .line 1019
    .line 1020
    move-result v1

    .line 1021
    if-eqz v5, :cond_37

    .line 1022
    .line 1023
    new-instance v3, Ljava/util/ArrayList;

    .line 1024
    .line 1025
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1026
    .line 1027
    .line 1028
    move-result v4

    .line 1029
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1030
    .line 1031
    .line 1032
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1033
    .line 1034
    .line 1035
    move-result v4

    .line 1036
    const/4 v6, 0x0

    .line 1037
    :goto_1d
    if-ge v6, v4, :cond_38

    .line 1038
    .line 1039
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v7

    .line 1043
    move-object v8, v7

    .line 1044
    check-cast v8, Lf4;

    .line 1045
    .line 1046
    iget-object v9, v8, Lf4;->α:Ljava/lang/Object;

    .line 1047
    .line 1048
    instance-of v9, v9, La72;

    .line 1049
    .line 1050
    if-eqz v9, :cond_36

    .line 1051
    .line 1052
    iget v9, v8, Lf4;->β:I

    .line 1053
    .line 1054
    iget v8, v8, Lf4;->γ:I

    .line 1055
    .line 1056
    const/4 v11, 0x0

    .line 1057
    invoke-static {v11, v1, v9, v8}, Lh4;->α(IIII)Z

    .line 1058
    .line 1059
    .line 1060
    move-result v8

    .line 1061
    if-eqz v8, :cond_36

    .line 1062
    .line 1063
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    :cond_36
    add-int/lit8 v6, v6, 0x1

    .line 1067
    .line 1068
    goto :goto_1d

    .line 1069
    :cond_37
    move-object v3, v2

    .line 1070
    :cond_38
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1071
    .line 1072
    .line 1073
    move-result v1

    .line 1074
    const/4 v4, 0x0

    .line 1075
    :goto_1e
    if-ge v4, v1, :cond_3a

    .line 1076
    .line 1077
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v6

    .line 1081
    check-cast v6, Lf4;

    .line 1082
    .line 1083
    iget-object v7, v6, Lf4;->α:Ljava/lang/Object;

    .line 1084
    .line 1085
    check-cast v7, La72;

    .line 1086
    .line 1087
    iget v8, v6, Lf4;->β:I

    .line 1088
    .line 1089
    iget v6, v6, Lf4;->γ:I

    .line 1090
    .line 1091
    iget-object v9, v10, Lm6;->ζ:Ljava/lang/Object;

    .line 1092
    .line 1093
    check-cast v9, Ljava/util/WeakHashMap;

    .line 1094
    .line 1095
    invoke-virtual {v9, v7}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v11

    .line 1099
    if-nez v11, :cond_39

    .line 1100
    .line 1101
    new-instance v11, Landroid/text/style/URLSpan;

    .line 1102
    .line 1103
    iget-object v13, v7, La72;->α:Ljava/lang/String;

    .line 1104
    .line 1105
    invoke-direct {v11, v13}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v9, v7, v11}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    :cond_39
    check-cast v11, Landroid/text/style/URLSpan;

    .line 1112
    .line 1113
    const/16 v9, 0x21

    .line 1114
    .line 1115
    invoke-virtual {v0, v11, v8, v6, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1116
    .line 1117
    .line 1118
    add-int/lit8 v4, v4, 0x1

    .line 1119
    .line 1120
    goto :goto_1e

    .line 1121
    :cond_3a
    invoke-virtual/range {v31 .. v31}, Ljava/lang/String;->length()I

    .line 1122
    .line 1123
    .line 1124
    move-result v1

    .line 1125
    if-eqz v5, :cond_3c

    .line 1126
    .line 1127
    new-instance v2, Ljava/util/ArrayList;

    .line 1128
    .line 1129
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1130
    .line 1131
    .line 1132
    move-result v3

    .line 1133
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1134
    .line 1135
    .line 1136
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1137
    .line 1138
    .line 1139
    move-result v3

    .line 1140
    const/4 v4, 0x0

    .line 1141
    :goto_1f
    if-ge v4, v3, :cond_3c

    .line 1142
    .line 1143
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v6

    .line 1147
    move-object v7, v6

    .line 1148
    check-cast v7, Lf4;

    .line 1149
    .line 1150
    iget-object v8, v7, Lf4;->α:Ljava/lang/Object;

    .line 1151
    .line 1152
    instance-of v8, v8, Lhs0;

    .line 1153
    .line 1154
    if-eqz v8, :cond_3b

    .line 1155
    .line 1156
    iget v8, v7, Lf4;->β:I

    .line 1157
    .line 1158
    iget v7, v7, Lf4;->γ:I

    .line 1159
    .line 1160
    const/4 v11, 0x0

    .line 1161
    invoke-static {v11, v1, v8, v7}, Lh4;->α(IIII)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v7

    .line 1165
    if-eqz v7, :cond_3b

    .line 1166
    .line 1167
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1168
    .line 1169
    .line 1170
    :cond_3b
    add-int/lit8 v4, v4, 0x1

    .line 1171
    .line 1172
    goto :goto_1f

    .line 1173
    :cond_3c
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1174
    .line 1175
    .line 1176
    move-result v1

    .line 1177
    const/4 v3, 0x0

    .line 1178
    :goto_20
    if-ge v3, v1, :cond_41

    .line 1179
    .line 1180
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v4

    .line 1184
    check-cast v4, Lf4;

    .line 1185
    .line 1186
    iget v5, v4, Lf4;->β:I

    .line 1187
    .line 1188
    iget-object v6, v4, Lf4;->α:Ljava/lang/Object;

    .line 1189
    .line 1190
    iget v7, v4, Lf4;->γ:I

    .line 1191
    .line 1192
    if-eq v5, v7, :cond_40

    .line 1193
    .line 1194
    move-object v8, v6

    .line 1195
    check-cast v8, Lhs0;

    .line 1196
    .line 1197
    instance-of v9, v8, Lgs0;

    .line 1198
    .line 1199
    if-eqz v9, :cond_3e

    .line 1200
    .line 1201
    new-instance v4, Lf4;

    .line 1202
    .line 1203
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1204
    .line 1205
    .line 1206
    check-cast v6, Lgs0;

    .line 1207
    .line 1208
    invoke-direct {v4, v5, v7, v6}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 1209
    .line 1210
    .line 1211
    iget-object v8, v10, Lm6;->η:Ljava/lang/Object;

    .line 1212
    .line 1213
    check-cast v8, Ljava/util/WeakHashMap;

    .line 1214
    .line 1215
    invoke-virtual {v8, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v9

    .line 1219
    if-nez v9, :cond_3d

    .line 1220
    .line 1221
    new-instance v9, Landroid/text/style/URLSpan;

    .line 1222
    .line 1223
    iget-object v6, v6, Lgs0;->α:Ljava/lang/String;

    .line 1224
    .line 1225
    invoke-direct {v9, v6}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v8, v4, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    :cond_3d
    check-cast v9, Landroid/text/style/URLSpan;

    .line 1232
    .line 1233
    const/16 v4, 0x21

    .line 1234
    .line 1235
    invoke-virtual {v0, v9, v5, v7, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1236
    .line 1237
    .line 1238
    goto :goto_21

    .line 1239
    :cond_3e
    iget-object v6, v10, Lm6;->θ:Ljava/lang/Object;

    .line 1240
    .line 1241
    check-cast v6, Ljava/util/WeakHashMap;

    .line 1242
    .line 1243
    invoke-virtual {v6, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v9

    .line 1247
    if-nez v9, :cond_3f

    .line 1248
    .line 1249
    new-instance v9, Ldn;

    .line 1250
    .line 1251
    invoke-direct {v9, v8}, Ldn;-><init>(Lhs0;)V

    .line 1252
    .line 1253
    .line 1254
    invoke-virtual {v6, v4, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    :cond_3f
    check-cast v9, Landroid/text/style/ClickableSpan;

    .line 1258
    .line 1259
    const/16 v4, 0x21

    .line 1260
    .line 1261
    invoke-virtual {v0, v9, v5, v7, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1262
    .line 1263
    .line 1264
    goto :goto_21

    .line 1265
    :cond_40
    const/16 v4, 0x21

    .line 1266
    .line 1267
    :goto_21
    add-int/lit8 v3, v3, 0x1

    .line 1268
    .line 1269
    goto :goto_20

    .line 1270
    :cond_41
    invoke-static {v0}, Ll1;->Ν(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v0

    .line 1274
    check-cast v0, Landroid/text/SpannableString;

    .line 1275
    .line 1276
    move-object/from16 v1, v46

    .line 1277
    .line 1278
    goto :goto_22

    .line 1279
    :cond_42
    move-object/from16 v38, v1

    .line 1280
    .line 1281
    move-object/from16 v33, v3

    .line 1282
    .line 1283
    move-object/from16 v30, v5

    .line 1284
    .line 1285
    move-object/from16 v39, v6

    .line 1286
    .line 1287
    move-object/from16 v41, v7

    .line 1288
    .line 1289
    move-object/from16 v43, v11

    .line 1290
    .line 1291
    move-object/from16 v42, v12

    .line 1292
    .line 1293
    move-object/from16 v37, v13

    .line 1294
    .line 1295
    move-object v12, v9

    .line 1296
    move-object/from16 v0, p0

    .line 1297
    .line 1298
    move-object v1, v8

    .line 1299
    :goto_22
    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    .line 1300
    .line 1301
    .line 1302
    sget-object v0, Lfs1;->Λ:Lis1;

    .line 1303
    .line 1304
    move-object/from16 v2, v43

    .line 1305
    .line 1306
    invoke-virtual {v2, v0}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 1307
    .line 1308
    .line 1309
    move-result v3

    .line 1310
    if-eqz v3, :cond_44

    .line 1311
    .line 1312
    move-object/from16 v3, v42

    .line 1313
    .line 1314
    const/4 v8, 0x1

    .line 1315
    invoke-virtual {v3, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v2, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    if-nez v0, :cond_43

    .line 1323
    .line 1324
    move-object/from16 v0, p0

    .line 1325
    .line 1326
    :cond_43
    check-cast v0, Ljava/lang/CharSequence;

    .line 1327
    .line 1328
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    .line 1329
    .line 1330
    .line 1331
    :goto_23
    move-object/from16 v13, v41

    .line 1332
    .line 1333
    goto :goto_24

    .line 1334
    :cond_44
    move-object/from16 v3, v42

    .line 1335
    .line 1336
    goto :goto_23

    .line 1337
    :goto_24
    invoke-static {v13, v12}, Lkn0;->Β(Lbs1;Landroid/content/res/Resources;)Ljava/lang/String;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setStateDescription(Ljava/lang/CharSequence;)V

    .line 1342
    .line 1343
    .line 1344
    invoke-static {v13}, Lkn0;->Α(Lbs1;)Z

    .line 1345
    .line 1346
    .line 1347
    move-result v0

    .line 1348
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 1349
    .line 1350
    .line 1351
    sget-object v0, Lfs1;->Ι:Lis1;

    .line 1352
    .line 1353
    invoke-virtual {v2, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v0

    .line 1357
    if-nez v0, :cond_45

    .line 1358
    .line 1359
    move-object/from16 v0, p0

    .line 1360
    .line 1361
    :cond_45
    check-cast v0, Lr42;

    .line 1362
    .line 1363
    if-eqz v0, :cond_47

    .line 1364
    .line 1365
    sget-object v4, Lr42;->ε:Lr42;

    .line 1366
    .line 1367
    if-ne v0, v4, :cond_46

    .line 1368
    .line 1369
    const/4 v8, 0x1

    .line 1370
    invoke-virtual {v1, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1371
    .line 1372
    .line 1373
    goto :goto_25

    .line 1374
    :cond_46
    sget-object v4, Lr42;->ζ:Lr42;

    .line 1375
    .line 1376
    if-ne v0, v4, :cond_47

    .line 1377
    .line 1378
    const/4 v11, 0x0

    .line 1379
    invoke-virtual {v1, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1380
    .line 1381
    .line 1382
    :cond_47
    :goto_25
    sget-object v0, Lfs1;->Θ:Lis1;

    .line 1383
    .line 1384
    invoke-virtual {v2, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    if-nez v0, :cond_48

    .line 1389
    .line 1390
    move-object/from16 v0, p0

    .line 1391
    .line 1392
    :cond_48
    check-cast v0, Ljava/lang/Boolean;

    .line 1393
    .line 1394
    if-eqz v0, :cond_4b

    .line 1395
    .line 1396
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1397
    .line 1398
    .line 1399
    move-result v0

    .line 1400
    if-nez v38, :cond_49

    .line 1401
    .line 1402
    move-object/from16 v4, v38

    .line 1403
    .line 1404
    const/4 v6, 0x4

    .line 1405
    goto :goto_26

    .line 1406
    :cond_49
    move-object/from16 v4, v38

    .line 1407
    .line 1408
    iget v5, v4, Lso1;->α:I

    .line 1409
    .line 1410
    const/4 v6, 0x4

    .line 1411
    if-ne v5, v6, :cond_4a

    .line 1412
    .line 1413
    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    .line 1414
    .line 1415
    .line 1416
    goto :goto_27

    .line 1417
    :cond_4a
    :goto_26
    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1418
    .line 1419
    .line 1420
    goto :goto_27

    .line 1421
    :cond_4b
    move-object/from16 v4, v38

    .line 1422
    .line 1423
    const/4 v6, 0x4

    .line 1424
    :goto_27
    iget-boolean v0, v15, Lxr1;->η:Z

    .line 1425
    .line 1426
    if-eqz v0, :cond_4c

    .line 1427
    .line 1428
    invoke-static {v6, v13}, Lbs1;->κ(ILbs1;)Ljava/util/List;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v0

    .line 1432
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1433
    .line 1434
    .line 1435
    move-result v0

    .line 1436
    if-eqz v0, :cond_4f

    .line 1437
    .line 1438
    :cond_4c
    sget-object v0, Lfs1;->α:Lis1;

    .line 1439
    .line 1440
    invoke-virtual {v2, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v0

    .line 1444
    if-nez v0, :cond_4d

    .line 1445
    .line 1446
    move-object/from16 v0, p0

    .line 1447
    .line 1448
    :cond_4d
    check-cast v0, Ljava/util/List;

    .line 1449
    .line 1450
    if-eqz v0, :cond_4e

    .line 1451
    .line 1452
    invoke-static {v0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v0

    .line 1456
    check-cast v0, Ljava/lang/String;

    .line 1457
    .line 1458
    goto :goto_28

    .line 1459
    :cond_4e
    move-object/from16 v0, p0

    .line 1460
    .line 1461
    :goto_28
    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1462
    .line 1463
    .line 1464
    :cond_4f
    sget-object v0, Lfs1;->ω:Lis1;

    .line 1465
    .line 1466
    invoke-virtual {v2, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v0

    .line 1470
    if-nez v0, :cond_50

    .line 1471
    .line 1472
    move-object/from16 v0, p0

    .line 1473
    .line 1474
    :cond_50
    check-cast v0, Ljava/lang/String;

    .line 1475
    .line 1476
    if-eqz v0, :cond_53

    .line 1477
    .line 1478
    move-object v5, v13

    .line 1479
    :goto_29
    if-eqz v5, :cond_52

    .line 1480
    .line 1481
    iget-object v6, v5, Lbs1;->δ:Lxr1;

    .line 1482
    .line 1483
    sget-object v7, Lgs1;->α:Lis1;

    .line 1484
    .line 1485
    iget-object v8, v6, Lxr1;->ε:Lb21;

    .line 1486
    .line 1487
    invoke-virtual {v8, v7}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 1488
    .line 1489
    .line 1490
    move-result v8

    .line 1491
    if-eqz v8, :cond_51

    .line 1492
    .line 1493
    invoke-virtual {v6, v7}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v5

    .line 1497
    check-cast v5, Ljava/lang/Boolean;

    .line 1498
    .line 1499
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1500
    .line 1501
    .line 1502
    move-result v5

    .line 1503
    goto :goto_2a

    .line 1504
    :cond_51
    invoke-virtual {v5}, Lbs1;->μ()Lbs1;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v5

    .line 1508
    goto :goto_29

    .line 1509
    :cond_52
    const/4 v5, 0x0

    .line 1510
    :goto_2a
    if-eqz v5, :cond_53

    .line 1511
    .line 1512
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 1513
    .line 1514
    .line 1515
    :cond_53
    sget-object v0, Lfs1;->θ:Lis1;

    .line 1516
    .line 1517
    invoke-virtual {v2, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v0

    .line 1521
    if-nez v0, :cond_54

    .line 1522
    .line 1523
    move-object/from16 v0, p0

    .line 1524
    .line 1525
    :cond_54
    check-cast v0, Ls62;

    .line 1526
    .line 1527
    const/4 v8, 0x1

    .line 1528
    if-eqz v0, :cond_55

    .line 1529
    .line 1530
    invoke-virtual {v1, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    .line 1531
    .line 1532
    .line 1533
    :cond_55
    sget-object v0, Lfs1;->ι:Lis1;

    .line 1534
    .line 1535
    invoke-virtual {v2, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v0

    .line 1539
    if-nez v0, :cond_56

    .line 1540
    .line 1541
    move-object/from16 v0, p0

    .line 1542
    .line 1543
    :cond_56
    check-cast v0, Ls62;

    .line 1544
    .line 1545
    if-eqz v0, :cond_57

    .line 1546
    .line 1547
    invoke-virtual {v3, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextEntryKey(Z)V

    .line 1548
    .line 1549
    .line 1550
    :cond_57
    move/from16 v0, p1

    .line 1551
    .line 1552
    const/4 v10, -0x1

    .line 1553
    if-eq v0, v10, :cond_59

    .line 1554
    .line 1555
    iget v5, v13, Lbs1;->ζ:I

    .line 1556
    .line 1557
    move-object/from16 v6, v39

    .line 1558
    .line 1559
    invoke-virtual {v6, v5}, Ll11;->δ(I)I

    .line 1560
    .line 1561
    .line 1562
    move-result v5

    .line 1563
    if-eq v5, v10, :cond_58

    .line 1564
    .line 1565
    invoke-virtual {v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDrawingOrder(I)V

    .line 1566
    .line 1567
    .line 1568
    goto :goto_2b

    .line 1569
    :cond_58
    const-string v5, "AccessibilityDelegate"

    .line 1570
    .line 1571
    const-string v6, "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"

    .line 1572
    .line 1573
    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1574
    .line 1575
    .line 1576
    :cond_59
    :goto_2b
    sget-object v5, Lfs1;->Κ:Lis1;

    .line 1577
    .line 1578
    invoke-virtual {v2, v5}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 1579
    .line 1580
    .line 1581
    move-result v5

    .line 1582
    invoke-virtual {v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    .line 1583
    .line 1584
    .line 1585
    sget-object v5, Lfs1;->Μ:Lis1;

    .line 1586
    .line 1587
    invoke-virtual {v2, v5}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v5

    .line 1591
    if-nez v5, :cond_5a

    .line 1592
    .line 1593
    move-object/from16 v5, p0

    .line 1594
    .line 1595
    :cond_5a
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1596
    .line 1597
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1598
    .line 1599
    .line 1600
    move-result v5

    .line 1601
    invoke-virtual {v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    .line 1602
    .line 1603
    .line 1604
    sget-object v5, Lfs1;->Ν:Lis1;

    .line 1605
    .line 1606
    invoke-virtual {v2, v5}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v5

    .line 1610
    if-nez v5, :cond_5b

    .line 1611
    .line 1612
    move-object/from16 v5, p0

    .line 1613
    .line 1614
    :cond_5b
    check-cast v5, Ljava/lang/Integer;

    .line 1615
    .line 1616
    if-eqz v5, :cond_5c

    .line 1617
    .line 1618
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1619
    .line 1620
    .line 1621
    move-result v5

    .line 1622
    goto :goto_2c

    .line 1623
    :cond_5c
    const/4 v5, -0x1

    .line 1624
    :goto_2c
    invoke-virtual {v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    .line 1625
    .line 1626
    .line 1627
    invoke-static {v13}, Lkn0;->ε(Lbs1;)Z

    .line 1628
    .line 1629
    .line 1630
    move-result v5

    .line 1631
    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 1632
    .line 1633
    .line 1634
    sget-object v5, Lfs1;->μ:Lis1;

    .line 1635
    .line 1636
    invoke-virtual {v2, v5}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 1637
    .line 1638
    .line 1639
    move-result v7

    .line 1640
    invoke-virtual {v1, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 1644
    .line 1645
    .line 1646
    move-result v7

    .line 1647
    if-eqz v7, :cond_5e

    .line 1648
    .line 1649
    invoke-virtual {v15, v5}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v7

    .line 1653
    check-cast v7, Ljava/lang/Boolean;

    .line 1654
    .line 1655
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1656
    .line 1657
    .line 1658
    move-result v7

    .line 1659
    invoke-virtual {v1, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 1660
    .line 1661
    .line 1662
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 1663
    .line 1664
    .line 1665
    move-result v7

    .line 1666
    if-eqz v7, :cond_5d

    .line 1667
    .line 1668
    move-object/from16 v7, v37

    .line 1669
    .line 1670
    const/4 v8, 0x2

    .line 1671
    invoke-virtual {v7, v8}, Lэ;->α(I)V

    .line 1672
    .line 1673
    .line 1674
    move-object/from16 v8, v33

    .line 1675
    .line 1676
    iput v0, v8, Ll1;->π:I

    .line 1677
    .line 1678
    :goto_2d
    const/4 v9, 0x1

    .line 1679
    goto :goto_2e

    .line 1680
    :cond_5d
    move-object/from16 v8, v33

    .line 1681
    .line 1682
    move-object/from16 v7, v37

    .line 1683
    .line 1684
    const/4 v9, 0x1

    .line 1685
    invoke-virtual {v7, v9}, Lэ;->α(I)V

    .line 1686
    .line 1687
    .line 1688
    goto :goto_2e

    .line 1689
    :cond_5e
    move-object/from16 v8, v33

    .line 1690
    .line 1691
    move-object/from16 v7, v37

    .line 1692
    .line 1693
    goto :goto_2d

    .line 1694
    :goto_2e
    invoke-static {v13}, Lh62;->и(Lbs1;)Z

    .line 1695
    .line 1696
    .line 1697
    move-result v10

    .line 1698
    xor-int/2addr v10, v9

    .line 1699
    invoke-virtual {v1, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1700
    .line 1701
    .line 1702
    invoke-virtual {v13}, Lbs1;->ο()Z

    .line 1703
    .line 1704
    .line 1705
    move-result v9

    .line 1706
    if-eqz v9, :cond_5f

    .line 1707
    .line 1708
    invoke-virtual {v13}, Lbs1;->μ()Lbs1;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v41

    .line 1712
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1713
    .line 1714
    .line 1715
    goto :goto_2f

    .line 1716
    :cond_5f
    move-object/from16 v41, v13

    .line 1717
    .line 1718
    :goto_2f
    invoke-virtual/range {v41 .. v41}, Lbs1;->ν()Lml1;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v9

    .line 1722
    iget v10, v9, Lml1;->α:F

    .line 1723
    .line 1724
    iget v11, v9, Lml1;->γ:F

    .line 1725
    .line 1726
    cmpl-float v10, v10, v11

    .line 1727
    .line 1728
    if-ltz v10, :cond_60

    .line 1729
    .line 1730
    const/4 v10, 0x1

    .line 1731
    goto :goto_30

    .line 1732
    :cond_60
    const/4 v10, 0x0

    .line 1733
    :goto_30
    iget v11, v9, Lml1;->β:F

    .line 1734
    .line 1735
    iget v9, v9, Lml1;->δ:F

    .line 1736
    .line 1737
    cmpl-float v9, v11, v9

    .line 1738
    .line 1739
    if-ltz v9, :cond_61

    .line 1740
    .line 1741
    const/4 v9, 0x1

    .line 1742
    goto :goto_31

    .line 1743
    :cond_61
    const/4 v9, 0x0

    .line 1744
    :goto_31
    or-int/2addr v9, v10

    .line 1745
    if-eqz v9, :cond_62

    .line 1746
    .line 1747
    const/4 v11, 0x0

    .line 1748
    invoke-virtual {v1, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1749
    .line 1750
    .line 1751
    goto :goto_32

    .line 1752
    :cond_62
    const/4 v11, 0x0

    .line 1753
    :goto_32
    sget-object v9, Lfs1;->λ:Lis1;

    .line 1754
    .line 1755
    invoke-virtual {v2, v9}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v9

    .line 1759
    if-nez v9, :cond_63

    .line 1760
    .line 1761
    move-object/from16 v9, p0

    .line 1762
    .line 1763
    :cond_63
    if-nez v9, :cond_b7

    .line 1764
    .line 1765
    invoke-virtual {v1, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1766
    .line 1767
    .line 1768
    sget-object v9, Lwr1;->β:Lis1;

    .line 1769
    .line 1770
    invoke-virtual {v2, v9}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v9

    .line 1774
    if-nez v9, :cond_64

    .line 1775
    .line 1776
    move-object/from16 v9, p0

    .line 1777
    .line 1778
    :cond_64
    check-cast v9, Lм;

    .line 1779
    .line 1780
    if-eqz v9, :cond_6e

    .line 1781
    .line 1782
    sget-object v11, Lfs1;->Θ:Lis1;

    .line 1783
    .line 1784
    invoke-virtual {v2, v11}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v11

    .line 1788
    if-nez v11, :cond_65

    .line 1789
    .line 1790
    move-object/from16 v11, p0

    .line 1791
    .line 1792
    :cond_65
    invoke-static {v11, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1793
    .line 1794
    .line 1795
    move-result v11

    .line 1796
    if-nez v4, :cond_67

    .line 1797
    .line 1798
    :cond_66
    const/4 v10, 0x0

    .line 1799
    goto :goto_33

    .line 1800
    :cond_67
    iget v14, v4, Lso1;->α:I

    .line 1801
    .line 1802
    const/4 v10, 0x4

    .line 1803
    if-ne v14, v10, :cond_66

    .line 1804
    .line 1805
    const/4 v10, 0x1

    .line 1806
    :goto_33
    if-nez v10, :cond_6b

    .line 1807
    .line 1808
    if-nez v4, :cond_69

    .line 1809
    .line 1810
    :cond_68
    const/4 v4, 0x0

    .line 1811
    goto :goto_34

    .line 1812
    :cond_69
    iget v4, v4, Lso1;->α:I

    .line 1813
    .line 1814
    const/4 v10, 0x3

    .line 1815
    if-ne v4, v10, :cond_68

    .line 1816
    .line 1817
    const/4 v4, 0x1

    .line 1818
    :goto_34
    if-eqz v4, :cond_6a

    .line 1819
    .line 1820
    goto :goto_35

    .line 1821
    :cond_6a
    const/4 v4, 0x0

    .line 1822
    goto :goto_36

    .line 1823
    :cond_6b
    :goto_35
    const/4 v4, 0x1

    .line 1824
    :goto_36
    if-eqz v4, :cond_6d

    .line 1825
    .line 1826
    if-eqz v4, :cond_6c

    .line 1827
    .line 1828
    if-nez v11, :cond_6c

    .line 1829
    .line 1830
    goto :goto_37

    .line 1831
    :cond_6c
    const/4 v4, 0x0

    .line 1832
    goto :goto_38

    .line 1833
    :cond_6d
    :goto_37
    const/4 v4, 0x1

    .line 1834
    :goto_38
    invoke-virtual {v1, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1835
    .line 1836
    .line 1837
    invoke-static {v13}, Lkn0;->ε(Lbs1;)Z

    .line 1838
    .line 1839
    .line 1840
    move-result v4

    .line 1841
    if-eqz v4, :cond_6e

    .line 1842
    .line 1843
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    .line 1844
    .line 1845
    .line 1846
    move-result v4

    .line 1847
    if-eqz v4, :cond_6e

    .line 1848
    .line 1849
    new-instance v4, Lч;

    .line 1850
    .line 1851
    iget-object v9, v9, Lм;->α:Ljava/lang/String;

    .line 1852
    .line 1853
    const/16 v10, 0x10

    .line 1854
    .line 1855
    move-object/from16 v11, p0

    .line 1856
    .line 1857
    invoke-direct {v4, v11, v10, v9, v11}, Lч;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Ljava/lang/Class;)V

    .line 1858
    .line 1859
    .line 1860
    invoke-virtual {v7, v4}, Lэ;->β(Lч;)V

    .line 1861
    .line 1862
    .line 1863
    :cond_6e
    const/4 v11, 0x0

    .line 1864
    invoke-virtual {v1, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1865
    .line 1866
    .line 1867
    sget-object v4, Lwr1;->γ:Lis1;

    .line 1868
    .line 1869
    invoke-virtual {v2, v4}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v4

    .line 1873
    if-nez v4, :cond_6f

    .line 1874
    .line 1875
    const/4 v4, 0x0

    .line 1876
    :cond_6f
    check-cast v4, Lм;

    .line 1877
    .line 1878
    if-eqz v4, :cond_70

    .line 1879
    .line 1880
    const/4 v9, 0x1

    .line 1881
    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1882
    .line 1883
    .line 1884
    invoke-static {v13}, Lkn0;->ε(Lbs1;)Z

    .line 1885
    .line 1886
    .line 1887
    move-result v9

    .line 1888
    if-eqz v9, :cond_70

    .line 1889
    .line 1890
    new-instance v9, Lч;

    .line 1891
    .line 1892
    const/16 v10, 0x20

    .line 1893
    .line 1894
    iget-object v4, v4, Lм;->α:Ljava/lang/String;

    .line 1895
    .line 1896
    invoke-direct {v9, v4, v10}, Lч;-><init>(Ljava/lang/String;I)V

    .line 1897
    .line 1898
    .line 1899
    invoke-virtual {v7, v9}, Lэ;->β(Lч;)V

    .line 1900
    .line 1901
    .line 1902
    :cond_70
    sget-object v4, Lwr1;->ο:Lis1;

    .line 1903
    .line 1904
    invoke-static {v15, v4}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v4

    .line 1908
    check-cast v4, Lм;

    .line 1909
    .line 1910
    if-eqz v4, :cond_71

    .line 1911
    .line 1912
    new-instance v9, Lч;

    .line 1913
    .line 1914
    const/16 v10, 0x4000

    .line 1915
    .line 1916
    iget-object v4, v4, Lм;->α:Ljava/lang/String;

    .line 1917
    .line 1918
    invoke-direct {v9, v4, v10}, Lч;-><init>(Ljava/lang/String;I)V

    .line 1919
    .line 1920
    .line 1921
    invoke-virtual {v7, v9}, Lэ;->β(Lч;)V

    .line 1922
    .line 1923
    .line 1924
    :cond_71
    invoke-static {v13}, Lkn0;->ε(Lbs1;)Z

    .line 1925
    .line 1926
    .line 1927
    move-result v4

    .line 1928
    if-eqz v4, :cond_77

    .line 1929
    .line 1930
    sget-object v4, Lwr1;->κ:Lis1;

    .line 1931
    .line 1932
    invoke-static {v15, v4}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v4

    .line 1936
    check-cast v4, Lм;

    .line 1937
    .line 1938
    if-eqz v4, :cond_72

    .line 1939
    .line 1940
    new-instance v9, Lч;

    .line 1941
    .line 1942
    const/high16 v10, 0x200000

    .line 1943
    .line 1944
    iget-object v4, v4, Lм;->α:Ljava/lang/String;

    .line 1945
    .line 1946
    invoke-direct {v9, v4, v10}, Lч;-><init>(Ljava/lang/String;I)V

    .line 1947
    .line 1948
    .line 1949
    invoke-virtual {v7, v9}, Lэ;->β(Lч;)V

    .line 1950
    .line 1951
    .line 1952
    :cond_72
    sget-object v4, Lwr1;->ξ:Lis1;

    .line 1953
    .line 1954
    invoke-static {v15, v4}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v4

    .line 1958
    check-cast v4, Lм;

    .line 1959
    .line 1960
    if-eqz v4, :cond_73

    .line 1961
    .line 1962
    new-instance v9, Lч;

    .line 1963
    .line 1964
    const v10, 0x1020054

    .line 1965
    .line 1966
    .line 1967
    iget-object v4, v4, Lм;->α:Ljava/lang/String;

    .line 1968
    .line 1969
    invoke-direct {v9, v4, v10}, Lч;-><init>(Ljava/lang/String;I)V

    .line 1970
    .line 1971
    .line 1972
    invoke-virtual {v7, v9}, Lэ;->β(Lч;)V

    .line 1973
    .line 1974
    .line 1975
    :cond_73
    sget-object v4, Lwr1;->π:Lis1;

    .line 1976
    .line 1977
    invoke-static {v15, v4}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v4

    .line 1981
    check-cast v4, Lм;

    .line 1982
    .line 1983
    if-eqz v4, :cond_74

    .line 1984
    .line 1985
    new-instance v9, Lч;

    .line 1986
    .line 1987
    const/high16 v10, 0x10000

    .line 1988
    .line 1989
    iget-object v4, v4, Lм;->α:Ljava/lang/String;

    .line 1990
    .line 1991
    invoke-direct {v9, v4, v10}, Lч;-><init>(Ljava/lang/String;I)V

    .line 1992
    .line 1993
    .line 1994
    invoke-virtual {v7, v9}, Lэ;->β(Lч;)V

    .line 1995
    .line 1996
    .line 1997
    :cond_74
    sget-object v4, Lwr1;->ρ:Lis1;

    .line 1998
    .line 1999
    invoke-static {v15, v4}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v4

    .line 2003
    check-cast v4, Lм;

    .line 2004
    .line 2005
    if-eqz v4, :cond_77

    .line 2006
    .line 2007
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 2008
    .line 2009
    .line 2010
    move-result v9

    .line 2011
    if-eqz v9, :cond_77

    .line 2012
    .line 2013
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/platform/AndroidComposeView;->getClipboardManager()Lp0;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v9

    .line 2017
    iget-object v10, v9, Lp0;->β:Landroid/content/ClipboardManager;

    .line 2018
    .line 2019
    if-nez v10, :cond_75

    .line 2020
    .line 2021
    iget-object v10, v9, Lp0;->α:Landroid/content/Context;

    .line 2022
    .line 2023
    const-string v11, "clipboard"

    .line 2024
    .line 2025
    invoke-virtual {v10, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v10

    .line 2029
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2030
    .line 2031
    .line 2032
    check-cast v10, Landroid/content/ClipboardManager;

    .line 2033
    .line 2034
    iput-object v10, v9, Lp0;->β:Landroid/content/ClipboardManager;

    .line 2035
    .line 2036
    :cond_75
    invoke-virtual {v10}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v9

    .line 2040
    if-eqz v9, :cond_76

    .line 2041
    .line 2042
    const-string v10, "text/*"

    .line 2043
    .line 2044
    invoke-virtual {v9, v10}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 2045
    .line 2046
    .line 2047
    move-result v9

    .line 2048
    goto :goto_39

    .line 2049
    :cond_76
    const/4 v9, 0x0

    .line 2050
    :goto_39
    if-eqz v9, :cond_77

    .line 2051
    .line 2052
    new-instance v9, Lч;

    .line 2053
    .line 2054
    const v10, 0x8000

    .line 2055
    .line 2056
    .line 2057
    iget-object v4, v4, Lм;->α:Ljava/lang/String;

    .line 2058
    .line 2059
    invoke-direct {v9, v4, v10}, Lч;-><init>(Ljava/lang/String;I)V

    .line 2060
    .line 2061
    .line 2062
    invoke-virtual {v7, v9}, Lэ;->β(Lч;)V

    .line 2063
    .line 2064
    .line 2065
    :cond_77
    invoke-static {v13}, Ll1;->τ(Lbs1;)Ljava/lang/String;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v4

    .line 2069
    if-eqz v4, :cond_79

    .line 2070
    .line 2071
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 2072
    .line 2073
    .line 2074
    move-result v4

    .line 2075
    if-nez v4, :cond_78

    .line 2076
    .line 2077
    goto :goto_3a

    .line 2078
    :cond_78
    const/4 v4, 0x0

    .line 2079
    goto :goto_3b

    .line 2080
    :cond_79
    :goto_3a
    const/4 v4, 0x1

    .line 2081
    :goto_3b
    if-nez v4, :cond_84

    .line 2082
    .line 2083
    invoke-virtual {v8, v13}, Ll1;->ρ(Lbs1;)I

    .line 2084
    .line 2085
    .line 2086
    move-result v4

    .line 2087
    invoke-virtual {v8, v13}, Ll1;->π(Lbs1;)I

    .line 2088
    .line 2089
    .line 2090
    move-result v9

    .line 2091
    invoke-virtual {v3, v4, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    .line 2092
    .line 2093
    .line 2094
    sget-object v4, Lwr1;->ι:Lis1;

    .line 2095
    .line 2096
    invoke-static {v15, v4}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v4

    .line 2100
    check-cast v4, Lм;

    .line 2101
    .line 2102
    new-instance v9, Lч;

    .line 2103
    .line 2104
    if-eqz v4, :cond_7a

    .line 2105
    .line 2106
    iget-object v4, v4, Lм;->α:Ljava/lang/String;

    .line 2107
    .line 2108
    goto :goto_3c

    .line 2109
    :cond_7a
    const/4 v4, 0x0

    .line 2110
    :goto_3c
    const/high16 v10, 0x20000

    .line 2111
    .line 2112
    invoke-direct {v9, v4, v10}, Lч;-><init>(Ljava/lang/String;I)V

    .line 2113
    .line 2114
    .line 2115
    invoke-virtual {v7, v9}, Lэ;->β(Lч;)V

    .line 2116
    .line 2117
    .line 2118
    const/16 v4, 0x100

    .line 2119
    .line 2120
    invoke-virtual {v7, v4}, Lэ;->α(I)V

    .line 2121
    .line 2122
    .line 2123
    const/16 v4, 0x200

    .line 2124
    .line 2125
    invoke-virtual {v7, v4}, Lэ;->α(I)V

    .line 2126
    .line 2127
    .line 2128
    const/16 v4, 0xb

    .line 2129
    .line 2130
    invoke-virtual {v1, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 2131
    .line 2132
    .line 2133
    sget-object v4, Lfs1;->α:Lis1;

    .line 2134
    .line 2135
    invoke-static {v15, v4}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v4

    .line 2139
    check-cast v4, Ljava/util/List;

    .line 2140
    .line 2141
    if-eqz v4, :cond_7c

    .line 2142
    .line 2143
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 2144
    .line 2145
    .line 2146
    move-result v4

    .line 2147
    if-eqz v4, :cond_7b

    .line 2148
    .line 2149
    goto :goto_3d

    .line 2150
    :cond_7b
    const/4 v4, 0x0

    .line 2151
    goto :goto_3e

    .line 2152
    :cond_7c
    :goto_3d
    const/4 v4, 0x1

    .line 2153
    :goto_3e
    if-eqz v4, :cond_84

    .line 2154
    .line 2155
    sget-object v4, Lwr1;->α:Lis1;

    .line 2156
    .line 2157
    invoke-virtual {v2, v4}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2158
    .line 2159
    .line 2160
    move-result v4

    .line 2161
    if-eqz v4, :cond_84

    .line 2162
    .line 2163
    sget-object v4, Lfs1;->Ζ:Lis1;

    .line 2164
    .line 2165
    invoke-virtual {v2, v4}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2166
    .line 2167
    .line 2168
    move-result v4

    .line 2169
    if-eqz v4, :cond_7d

    .line 2170
    .line 2171
    invoke-static {v15, v5}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2172
    .line 2173
    .line 2174
    move-result-object v4

    .line 2175
    invoke-static {v4, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2176
    .line 2177
    .line 2178
    move-result v4

    .line 2179
    if-nez v4, :cond_7d

    .line 2180
    .line 2181
    goto :goto_43

    .line 2182
    :cond_7d
    iget-object v4, v13, Lbs1;->γ:Lyp0;

    .line 2183
    .line 2184
    invoke-virtual {v4}, Lyp0;->σ()Lyp0;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v4

    .line 2188
    :goto_3f
    if-eqz v4, :cond_80

    .line 2189
    .line 2190
    invoke-virtual {v4}, Lyp0;->υ()Lxr1;

    .line 2191
    .line 2192
    .line 2193
    move-result-object v5

    .line 2194
    if-eqz v5, :cond_7e

    .line 2195
    .line 2196
    iget-boolean v6, v5, Lxr1;->η:Z

    .line 2197
    .line 2198
    const/4 v9, 0x1

    .line 2199
    if-ne v6, v9, :cond_7e

    .line 2200
    .line 2201
    sget-object v6, Lfs1;->Ζ:Lis1;

    .line 2202
    .line 2203
    iget-object v5, v5, Lxr1;->ε:Lb21;

    .line 2204
    .line 2205
    invoke-virtual {v5, v6}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2206
    .line 2207
    .line 2208
    move-result v5

    .line 2209
    if-eqz v5, :cond_7e

    .line 2210
    .line 2211
    const/4 v5, 0x1

    .line 2212
    goto :goto_40

    .line 2213
    :cond_7e
    const/4 v5, 0x0

    .line 2214
    :goto_40
    if-eqz v5, :cond_7f

    .line 2215
    .line 2216
    goto :goto_41

    .line 2217
    :cond_7f
    invoke-virtual {v4}, Lyp0;->σ()Lyp0;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v4

    .line 2221
    goto :goto_3f

    .line 2222
    :cond_80
    const/4 v4, 0x0

    .line 2223
    :goto_41
    if-eqz v4, :cond_83

    .line 2224
    .line 2225
    invoke-virtual {v4}, Lyp0;->υ()Lxr1;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v4

    .line 2229
    if-eqz v4, :cond_82

    .line 2230
    .line 2231
    sget-object v5, Lfs1;->μ:Lis1;

    .line 2232
    .line 2233
    iget-object v4, v4, Lxr1;->ε:Lb21;

    .line 2234
    .line 2235
    invoke-virtual {v4, v5}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v4

    .line 2239
    if-nez v4, :cond_81

    .line 2240
    .line 2241
    const/4 v4, 0x0

    .line 2242
    :cond_81
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2243
    .line 2244
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2245
    .line 2246
    .line 2247
    move-result v4

    .line 2248
    goto :goto_42

    .line 2249
    :cond_82
    const/4 v4, 0x0

    .line 2250
    :goto_42
    if-nez v4, :cond_83

    .line 2251
    .line 2252
    :goto_43
    const/4 v4, 0x1

    .line 2253
    goto :goto_44

    .line 2254
    :cond_83
    const/4 v4, 0x0

    .line 2255
    :goto_44
    if-nez v4, :cond_84

    .line 2256
    .line 2257
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    .line 2258
    .line 2259
    .line 2260
    move-result v4

    .line 2261
    or-int/lit8 v4, v4, 0x14

    .line 2262
    .line 2263
    invoke-virtual {v1, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 2264
    .line 2265
    .line 2266
    :cond_84
    new-instance v4, Ljava/util/ArrayList;

    .line 2267
    .line 2268
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2269
    .line 2270
    .line 2271
    const-string v5, "androidx.compose.ui.semantics.id"

    .line 2272
    .line 2273
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2274
    .line 2275
    .line 2276
    invoke-virtual {v7}, Lэ;->ζ()Ljava/lang/CharSequence;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v5

    .line 2280
    if-eqz v5, :cond_86

    .line 2281
    .line 2282
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 2283
    .line 2284
    .line 2285
    move-result v5

    .line 2286
    if-nez v5, :cond_85

    .line 2287
    .line 2288
    goto :goto_45

    .line 2289
    :cond_85
    const/4 v5, 0x0

    .line 2290
    goto :goto_46

    .line 2291
    :cond_86
    :goto_45
    const/4 v5, 0x1

    .line 2292
    :goto_46
    if-nez v5, :cond_87

    .line 2293
    .line 2294
    sget-object v5, Lwr1;->α:Lis1;

    .line 2295
    .line 2296
    invoke-virtual {v2, v5}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2297
    .line 2298
    .line 2299
    move-result v5

    .line 2300
    if-eqz v5, :cond_87

    .line 2301
    .line 2302
    const-string v5, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 2303
    .line 2304
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2305
    .line 2306
    .line 2307
    :cond_87
    sget-object v5, Lfs1;->ω:Lis1;

    .line 2308
    .line 2309
    invoke-virtual {v2, v5}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2310
    .line 2311
    .line 2312
    move-result v5

    .line 2313
    if-eqz v5, :cond_88

    .line 2314
    .line 2315
    const-string v5, "androidx.compose.ui.semantics.testTag"

    .line 2316
    .line 2317
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2318
    .line 2319
    .line 2320
    :cond_88
    sget-object v5, Lfs1;->Ξ:Lis1;

    .line 2321
    .line 2322
    invoke-virtual {v2, v5}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2323
    .line 2324
    .line 2325
    move-result v5

    .line 2326
    if-eqz v5, :cond_89

    .line 2327
    .line 2328
    const-string v5, "androidx.compose.ui.semantics.shapeType"

    .line 2329
    .line 2330
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2331
    .line 2332
    .line 2333
    const-string v5, "androidx.compose.ui.semantics.shapeRect"

    .line 2334
    .line 2335
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2336
    .line 2337
    .line 2338
    const-string v5, "androidx.compose.ui.semantics.shapeCorners"

    .line 2339
    .line 2340
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2341
    .line 2342
    .line 2343
    const-string v5, "androidx.compose.ui.semantics.shapeRegion"

    .line 2344
    .line 2345
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2346
    .line 2347
    .line 2348
    :cond_89
    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAvailableExtraData(Ljava/util/List;)V

    .line 2349
    .line 2350
    .line 2351
    sget-object v4, Lfs1;->γ:Lis1;

    .line 2352
    .line 2353
    invoke-static {v15, v4}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2354
    .line 2355
    .line 2356
    move-result-object v4

    .line 2357
    check-cast v4, Lvj1;

    .line 2358
    .line 2359
    if-eqz v4, :cond_8f

    .line 2360
    .line 2361
    sget-object v5, Lwr1;->θ:Lis1;

    .line 2362
    .line 2363
    invoke-virtual {v2, v5}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2364
    .line 2365
    .line 2366
    move-result v6

    .line 2367
    if-eqz v6, :cond_8a

    .line 2368
    .line 2369
    const-string v6, "android.widget.SeekBar"

    .line 2370
    .line 2371
    invoke-virtual {v7, v6}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 2372
    .line 2373
    .line 2374
    goto :goto_47

    .line 2375
    :cond_8a
    const-string v6, "android.widget.ProgressBar"

    .line 2376
    .line 2377
    invoke-virtual {v7, v6}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 2378
    .line 2379
    .line 2380
    :goto_47
    sget-object v6, Lvj1;->β:Lvj1;

    .line 2381
    .line 2382
    if-eq v4, v6, :cond_8b

    .line 2383
    .line 2384
    const/4 v4, 0x0

    .line 2385
    const/4 v9, 0x1

    .line 2386
    invoke-static {v9, v4, v4, v4}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    .line 2387
    .line 2388
    .line 2389
    move-result-object v6

    .line 2390
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 2391
    .line 2392
    .line 2393
    goto :goto_48

    .line 2394
    :cond_8b
    const/4 v4, 0x0

    .line 2395
    const/4 v9, 0x1

    .line 2396
    :goto_48
    invoke-virtual {v2, v5}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2397
    .line 2398
    .line 2399
    move-result v2

    .line 2400
    if-eqz v2, :cond_90

    .line 2401
    .line 2402
    invoke-static {v13}, Lkn0;->ε(Lbs1;)Z

    .line 2403
    .line 2404
    .line 2405
    move-result v2

    .line 2406
    if-eqz v2, :cond_90

    .line 2407
    .line 2408
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Number;->floatValue()F

    .line 2409
    .line 2410
    .line 2411
    move-result v16

    .line 2412
    cmpg-float v2, v4, v16

    .line 2413
    .line 2414
    if-gez v2, :cond_8c

    .line 2415
    .line 2416
    goto :goto_49

    .line 2417
    :cond_8c
    move/from16 v16, v4

    .line 2418
    .line 2419
    :goto_49
    cmpg-float v2, v4, v16

    .line 2420
    .line 2421
    if-gez v2, :cond_8d

    .line 2422
    .line 2423
    sget-object v2, Lч;->η:Lч;

    .line 2424
    .line 2425
    invoke-virtual {v7, v2}, Lэ;->β(Lч;)V

    .line 2426
    .line 2427
    .line 2428
    :cond_8d
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Number;->floatValue()F

    .line 2429
    .line 2430
    .line 2431
    move-result v2

    .line 2432
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Number;->floatValue()F

    .line 2433
    .line 2434
    .line 2435
    move-result v3

    .line 2436
    cmpl-float v4, v2, v3

    .line 2437
    .line 2438
    if-lez v4, :cond_8e

    .line 2439
    .line 2440
    move v2, v3

    .line 2441
    :cond_8e
    const/16 v16, 0x0

    .line 2442
    .line 2443
    cmpl-float v2, v16, v2

    .line 2444
    .line 2445
    if-lez v2, :cond_90

    .line 2446
    .line 2447
    sget-object v2, Lч;->θ:Lч;

    .line 2448
    .line 2449
    invoke-virtual {v7, v2}, Lэ;->β(Lч;)V

    .line 2450
    .line 2451
    .line 2452
    goto :goto_4a

    .line 2453
    :cond_8f
    const/4 v9, 0x1

    .line 2454
    :cond_90
    :goto_4a
    invoke-static {v7, v13}, Lbd;->γ(Lэ;Lbs1;)V

    .line 2455
    .line 2456
    .line 2457
    invoke-virtual {v13}, Lbs1;->λ()Lxr1;

    .line 2458
    .line 2459
    .line 2460
    move-result-object v2

    .line 2461
    sget-object v3, Lfs1;->ζ:Lis1;

    .line 2462
    .line 2463
    iget-object v2, v2, Lxr1;->ε:Lb21;

    .line 2464
    .line 2465
    invoke-virtual {v2, v3}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v2

    .line 2469
    if-nez v2, :cond_91

    .line 2470
    .line 2471
    const/4 v2, 0x0

    .line 2472
    :cond_91
    if-nez v2, :cond_97

    .line 2473
    .line 2474
    new-instance v2, Ljava/util/ArrayList;

    .line 2475
    .line 2476
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2477
    .line 2478
    .line 2479
    invoke-virtual {v13}, Lbs1;->λ()Lxr1;

    .line 2480
    .line 2481
    .line 2482
    move-result-object v3

    .line 2483
    sget-object v4, Lfs1;->ε:Lis1;

    .line 2484
    .line 2485
    iget-object v3, v3, Lxr1;->ε:Lb21;

    .line 2486
    .line 2487
    invoke-virtual {v3, v4}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v3

    .line 2491
    if-nez v3, :cond_92

    .line 2492
    .line 2493
    const/4 v3, 0x0

    .line 2494
    :cond_92
    if-eqz v3, :cond_94

    .line 2495
    .line 2496
    const/4 v4, 0x4

    .line 2497
    invoke-static {v4, v13}, Lbs1;->κ(ILbs1;)Ljava/util/List;

    .line 2498
    .line 2499
    .line 2500
    move-result-object v3

    .line 2501
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 2502
    .line 2503
    .line 2504
    move-result v4

    .line 2505
    const/4 v5, 0x0

    .line 2506
    :goto_4b
    if-ge v5, v4, :cond_94

    .line 2507
    .line 2508
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v6

    .line 2512
    check-cast v6, Lbs1;

    .line 2513
    .line 2514
    invoke-virtual {v6}, Lbs1;->λ()Lxr1;

    .line 2515
    .line 2516
    .line 2517
    move-result-object v10

    .line 2518
    sget-object v11, Lfs1;->Θ:Lis1;

    .line 2519
    .line 2520
    iget-object v10, v10, Lxr1;->ε:Lb21;

    .line 2521
    .line 2522
    invoke-virtual {v10, v11}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2523
    .line 2524
    .line 2525
    move-result v10

    .line 2526
    if-eqz v10, :cond_93

    .line 2527
    .line 2528
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2529
    .line 2530
    .line 2531
    :cond_93
    add-int/lit8 v5, v5, 0x1

    .line 2532
    .line 2533
    goto :goto_4b

    .line 2534
    :cond_94
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2535
    .line 2536
    .line 2537
    move-result v3

    .line 2538
    if-nez v3, :cond_98

    .line 2539
    .line 2540
    invoke-static {v2}, Lbd;->ζ(Ljava/util/ArrayList;)Z

    .line 2541
    .line 2542
    .line 2543
    move-result v3

    .line 2544
    if-eqz v3, :cond_95

    .line 2545
    .line 2546
    move v4, v9

    .line 2547
    goto :goto_4c

    .line 2548
    :cond_95
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 2549
    .line 2550
    .line 2551
    move-result v4

    .line 2552
    :goto_4c
    if-eqz v3, :cond_96

    .line 2553
    .line 2554
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 2555
    .line 2556
    .line 2557
    move-result v2

    .line 2558
    :goto_4d
    const/4 v11, 0x0

    .line 2559
    goto :goto_4e

    .line 2560
    :cond_96
    move v2, v9

    .line 2561
    goto :goto_4d

    .line 2562
    :goto_4e
    invoke-static {v4, v2, v11, v11}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 2563
    .line 2564
    .line 2565
    move-result-object v2

    .line 2566
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 2567
    .line 2568
    .line 2569
    goto :goto_4f

    .line 2570
    :cond_97
    invoke-static {}, Lγ;->β()V

    .line 2571
    .line 2572
    .line 2573
    :cond_98
    :goto_4f
    invoke-virtual {v13}, Lbs1;->λ()Lxr1;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v2

    .line 2577
    sget-object v3, Lfs1;->η:Lis1;

    .line 2578
    .line 2579
    iget-object v2, v2, Lxr1;->ε:Lb21;

    .line 2580
    .line 2581
    invoke-virtual {v2, v3}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2582
    .line 2583
    .line 2584
    move-result-object v2

    .line 2585
    if-nez v2, :cond_99

    .line 2586
    .line 2587
    const/4 v2, 0x0

    .line 2588
    :cond_99
    if-nez v2, :cond_a4

    .line 2589
    .line 2590
    invoke-virtual {v13}, Lbs1;->μ()Lbs1;

    .line 2591
    .line 2592
    .line 2593
    move-result-object v2

    .line 2594
    if-nez v2, :cond_9a

    .line 2595
    .line 2596
    goto/16 :goto_53

    .line 2597
    .line 2598
    :cond_9a
    invoke-virtual {v2}, Lbs1;->λ()Lxr1;

    .line 2599
    .line 2600
    .line 2601
    move-result-object v3

    .line 2602
    sget-object v4, Lfs1;->ε:Lis1;

    .line 2603
    .line 2604
    iget-object v3, v3, Lxr1;->ε:Lb21;

    .line 2605
    .line 2606
    invoke-virtual {v3, v4}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2607
    .line 2608
    .line 2609
    move-result-object v3

    .line 2610
    if-nez v3, :cond_9b

    .line 2611
    .line 2612
    const/4 v3, 0x0

    .line 2613
    :cond_9b
    if-eqz v3, :cond_a5

    .line 2614
    .line 2615
    invoke-virtual {v2}, Lbs1;->λ()Lxr1;

    .line 2616
    .line 2617
    .line 2618
    move-result-object v3

    .line 2619
    sget-object v4, Lfs1;->ζ:Lis1;

    .line 2620
    .line 2621
    iget-object v3, v3, Lxr1;->ε:Lb21;

    .line 2622
    .line 2623
    invoke-virtual {v3, v4}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2624
    .line 2625
    .line 2626
    move-result-object v3

    .line 2627
    if-nez v3, :cond_9c

    .line 2628
    .line 2629
    const/4 v3, 0x0

    .line 2630
    :cond_9c
    if-nez v3, :cond_a3

    .line 2631
    .line 2632
    invoke-virtual {v13}, Lbs1;->λ()Lxr1;

    .line 2633
    .line 2634
    .line 2635
    move-result-object v3

    .line 2636
    sget-object v4, Lfs1;->Θ:Lis1;

    .line 2637
    .line 2638
    iget-object v3, v3, Lxr1;->ε:Lb21;

    .line 2639
    .line 2640
    invoke-virtual {v3, v4}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2641
    .line 2642
    .line 2643
    move-result v3

    .line 2644
    if-nez v3, :cond_9d

    .line 2645
    .line 2646
    goto/16 :goto_53

    .line 2647
    .line 2648
    :cond_9d
    new-instance v3, Ljava/util/ArrayList;

    .line 2649
    .line 2650
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2651
    .line 2652
    .line 2653
    const/4 v4, 0x4

    .line 2654
    invoke-static {v4, v2}, Lbs1;->κ(ILbs1;)Ljava/util/List;

    .line 2655
    .line 2656
    .line 2657
    move-result-object v2

    .line 2658
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 2659
    .line 2660
    .line 2661
    move-result v4

    .line 2662
    const/4 v5, 0x0

    .line 2663
    const/4 v6, 0x0

    .line 2664
    :goto_50
    if-ge v5, v4, :cond_9f

    .line 2665
    .line 2666
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2667
    .line 2668
    .line 2669
    move-result-object v10

    .line 2670
    check-cast v10, Lbs1;

    .line 2671
    .line 2672
    invoke-virtual {v10}, Lbs1;->λ()Lxr1;

    .line 2673
    .line 2674
    .line 2675
    move-result-object v11

    .line 2676
    sget-object v14, Lfs1;->Θ:Lis1;

    .line 2677
    .line 2678
    iget-object v11, v11, Lxr1;->ε:Lb21;

    .line 2679
    .line 2680
    invoke-virtual {v11, v14}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2681
    .line 2682
    .line 2683
    move-result v11

    .line 2684
    if-eqz v11, :cond_9e

    .line 2685
    .line 2686
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2687
    .line 2688
    .line 2689
    iget-object v10, v10, Lbs1;->γ:Lyp0;

    .line 2690
    .line 2691
    invoke-virtual {v10}, Lyp0;->τ()I

    .line 2692
    .line 2693
    .line 2694
    move-result v10

    .line 2695
    iget-object v11, v13, Lbs1;->γ:Lyp0;

    .line 2696
    .line 2697
    invoke-virtual {v11}, Lyp0;->τ()I

    .line 2698
    .line 2699
    .line 2700
    move-result v11

    .line 2701
    if-ge v10, v11, :cond_9e

    .line 2702
    .line 2703
    add-int/lit8 v6, v6, 0x1

    .line 2704
    .line 2705
    :cond_9e
    add-int/lit8 v5, v5, 0x1

    .line 2706
    .line 2707
    goto :goto_50

    .line 2708
    :cond_9f
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2709
    .line 2710
    .line 2711
    move-result v2

    .line 2712
    if-nez v2, :cond_a5

    .line 2713
    .line 2714
    invoke-static {v3}, Lbd;->ζ(Ljava/util/ArrayList;)Z

    .line 2715
    .line 2716
    .line 2717
    move-result v2

    .line 2718
    if-eqz v2, :cond_a0

    .line 2719
    .line 2720
    const/16 v31, 0x0

    .line 2721
    .line 2722
    goto :goto_51

    .line 2723
    :cond_a0
    move/from16 v31, v6

    .line 2724
    .line 2725
    :goto_51
    if-eqz v2, :cond_a1

    .line 2726
    .line 2727
    move/from16 v33, v6

    .line 2728
    .line 2729
    goto :goto_52

    .line 2730
    :cond_a1
    const/16 v33, 0x0

    .line 2731
    .line 2732
    :goto_52
    invoke-virtual {v13}, Lbs1;->λ()Lxr1;

    .line 2733
    .line 2734
    .line 2735
    move-result-object v2

    .line 2736
    sget-object v3, Lfs1;->Θ:Lis1;

    .line 2737
    .line 2738
    iget-object v2, v2, Lxr1;->ε:Lb21;

    .line 2739
    .line 2740
    invoke-virtual {v2, v3}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2741
    .line 2742
    .line 2743
    move-result-object v2

    .line 2744
    if-nez v2, :cond_a2

    .line 2745
    .line 2746
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2747
    .line 2748
    :cond_a2
    check-cast v2, Ljava/lang/Boolean;

    .line 2749
    .line 2750
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2751
    .line 2752
    .line 2753
    move-result v36

    .line 2754
    const/16 v35, 0x0

    .line 2755
    .line 2756
    const/16 v32, 0x1

    .line 2757
    .line 2758
    const/16 v34, 0x1

    .line 2759
    .line 2760
    invoke-static/range {v31 .. v36}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 2761
    .line 2762
    .line 2763
    move-result-object v2

    .line 2764
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 2765
    .line 2766
    .line 2767
    goto :goto_53

    .line 2768
    :cond_a3
    invoke-static {}, Lγ;->β()V

    .line 2769
    .line 2770
    .line 2771
    goto :goto_53

    .line 2772
    :cond_a4
    invoke-static {}, Lγ;->β()V

    .line 2773
    .line 2774
    .line 2775
    :cond_a5
    :goto_53
    invoke-virtual {v13}, Lbs1;->ξ()Lxr1;

    .line 2776
    .line 2777
    .line 2778
    move-result-object v2

    .line 2779
    sget-object v3, Lfs1;->φ:Lis1;

    .line 2780
    .line 2781
    invoke-static {v2, v3}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2782
    .line 2783
    .line 2784
    move-result-object v2

    .line 2785
    invoke-static {v2}, Llz1;->ψ(Ljava/lang/Object;)V

    .line 2786
    .line 2787
    .line 2788
    invoke-virtual {v13}, Lbs1;->ξ()Lxr1;

    .line 2789
    .line 2790
    .line 2791
    move-result-object v2

    .line 2792
    sget-object v3, Lwr1;->δ:Lis1;

    .line 2793
    .line 2794
    invoke-static {v2, v3}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2795
    .line 2796
    .line 2797
    move-result-object v2

    .line 2798
    check-cast v2, Lм;

    .line 2799
    .line 2800
    invoke-virtual {v13}, Lbs1;->ξ()Lxr1;

    .line 2801
    .line 2802
    .line 2803
    move-result-object v2

    .line 2804
    sget-object v3, Lfs1;->χ:Lis1;

    .line 2805
    .line 2806
    invoke-static {v2, v3}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v2

    .line 2810
    invoke-static {v2}, Llz1;->ψ(Ljava/lang/Object;)V

    .line 2811
    .line 2812
    .line 2813
    invoke-static {v7, v13}, Lyh;->ζ(Lэ;Lbs1;)V

    .line 2814
    .line 2815
    .line 2816
    invoke-virtual {v13}, Lbs1;->ξ()Lxr1;

    .line 2817
    .line 2818
    .line 2819
    move-result-object v2

    .line 2820
    sget-object v3, Lfs1;->δ:Lis1;

    .line 2821
    .line 2822
    invoke-static {v2, v3}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v2

    .line 2826
    check-cast v2, Ljava/lang/CharSequence;

    .line 2827
    .line 2828
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPaneTitle(Ljava/lang/CharSequence;)V

    .line 2829
    .line 2830
    .line 2831
    invoke-static {v13}, Lkn0;->ε(Lbs1;)Z

    .line 2832
    .line 2833
    .line 2834
    move-result v2

    .line 2835
    if-eqz v2, :cond_b2

    .line 2836
    .line 2837
    invoke-virtual {v13}, Lbs1;->ξ()Lxr1;

    .line 2838
    .line 2839
    .line 2840
    move-result-object v2

    .line 2841
    sget-object v3, Lwr1;->σ:Lis1;

    .line 2842
    .line 2843
    invoke-static {v2, v3}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2844
    .line 2845
    .line 2846
    move-result-object v2

    .line 2847
    check-cast v2, Lм;

    .line 2848
    .line 2849
    if-eqz v2, :cond_a6

    .line 2850
    .line 2851
    new-instance v3, Lч;

    .line 2852
    .line 2853
    const/high16 v4, 0x40000

    .line 2854
    .line 2855
    iget-object v2, v2, Lм;->α:Ljava/lang/String;

    .line 2856
    .line 2857
    invoke-direct {v3, v2, v4}, Lч;-><init>(Ljava/lang/String;I)V

    .line 2858
    .line 2859
    .line 2860
    invoke-virtual {v7, v3}, Lэ;->β(Lч;)V

    .line 2861
    .line 2862
    .line 2863
    :cond_a6
    invoke-virtual {v13}, Lbs1;->ξ()Lxr1;

    .line 2864
    .line 2865
    .line 2866
    move-result-object v2

    .line 2867
    sget-object v3, Lwr1;->τ:Lis1;

    .line 2868
    .line 2869
    invoke-static {v2, v3}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2870
    .line 2871
    .line 2872
    move-result-object v2

    .line 2873
    check-cast v2, Lм;

    .line 2874
    .line 2875
    if-eqz v2, :cond_a7

    .line 2876
    .line 2877
    new-instance v3, Lч;

    .line 2878
    .line 2879
    const/high16 v4, 0x80000

    .line 2880
    .line 2881
    iget-object v2, v2, Lм;->α:Ljava/lang/String;

    .line 2882
    .line 2883
    invoke-direct {v3, v2, v4}, Lч;-><init>(Ljava/lang/String;I)V

    .line 2884
    .line 2885
    .line 2886
    invoke-virtual {v7, v3}, Lэ;->β(Lч;)V

    .line 2887
    .line 2888
    .line 2889
    :cond_a7
    invoke-virtual {v13}, Lbs1;->ξ()Lxr1;

    .line 2890
    .line 2891
    .line 2892
    move-result-object v2

    .line 2893
    sget-object v3, Lwr1;->υ:Lis1;

    .line 2894
    .line 2895
    invoke-static {v2, v3}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 2896
    .line 2897
    .line 2898
    move-result-object v2

    .line 2899
    check-cast v2, Lм;

    .line 2900
    .line 2901
    if-eqz v2, :cond_a8

    .line 2902
    .line 2903
    new-instance v3, Lч;

    .line 2904
    .line 2905
    const/high16 v4, 0x100000

    .line 2906
    .line 2907
    iget-object v2, v2, Lм;->α:Ljava/lang/String;

    .line 2908
    .line 2909
    invoke-direct {v3, v2, v4}, Lч;-><init>(Ljava/lang/String;I)V

    .line 2910
    .line 2911
    .line 2912
    invoke-virtual {v7, v3}, Lэ;->β(Lч;)V

    .line 2913
    .line 2914
    .line 2915
    :cond_a8
    invoke-virtual {v13}, Lbs1;->ξ()Lxr1;

    .line 2916
    .line 2917
    .line 2918
    move-result-object v2

    .line 2919
    sget-object v3, Lwr1;->χ:Lis1;

    .line 2920
    .line 2921
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2922
    .line 2923
    .line 2924
    sget-object v4, Lwr1;->χ:Lis1;

    .line 2925
    .line 2926
    iget-object v2, v2, Lxr1;->ε:Lb21;

    .line 2927
    .line 2928
    invoke-virtual {v2, v4}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 2929
    .line 2930
    .line 2931
    move-result v2

    .line 2932
    if-eqz v2, :cond_b2

    .line 2933
    .line 2934
    invoke-virtual {v13}, Lbs1;->ξ()Lxr1;

    .line 2935
    .line 2936
    .line 2937
    move-result-object v2

    .line 2938
    invoke-virtual {v2, v3}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 2939
    .line 2940
    .line 2941
    move-result-object v2

    .line 2942
    check-cast v2, Ljava/util/List;

    .line 2943
    .line 2944
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2945
    .line 2946
    .line 2947
    move-result v3

    .line 2948
    sget-object v4, Ll1;->Ρ:Lm11;

    .line 2949
    .line 2950
    iget v5, v4, Lm11;->β:I

    .line 2951
    .line 2952
    if-ge v3, v5, :cond_b1

    .line 2953
    .line 2954
    new-instance v3, Lkz1;

    .line 2955
    .line 2956
    const/4 v11, 0x0

    .line 2957
    invoke-direct {v3, v11}, Lkz1;-><init>(I)V

    .line 2958
    .line 2959
    .line 2960
    sget-object v5, Lz31;->α:Lu11;

    .line 2961
    .line 2962
    new-instance v5, Lu11;

    .line 2963
    .line 2964
    invoke-direct {v5}, Lu11;-><init>()V

    .line 2965
    .line 2966
    .line 2967
    move-object/from16 v6, v23

    .line 2968
    .line 2969
    iget-object v10, v6, Lkz1;->ε:[I

    .line 2970
    .line 2971
    iget v11, v6, Lkz1;->η:I

    .line 2972
    .line 2973
    invoke-static {v11, v0, v10}, Lyh;->ι(II[I)I

    .line 2974
    .line 2975
    .line 2976
    move-result v10

    .line 2977
    if-ltz v10, :cond_a9

    .line 2978
    .line 2979
    move v11, v9

    .line 2980
    goto :goto_54

    .line 2981
    :cond_a9
    const/4 v11, 0x0

    .line 2982
    :goto_54
    if-eqz v11, :cond_af

    .line 2983
    .line 2984
    invoke-virtual {v6, v0}, Lkz1;->β(I)Ljava/lang/Object;

    .line 2985
    .line 2986
    .line 2987
    move-result-object v9

    .line 2988
    check-cast v9, Lu11;

    .line 2989
    .line 2990
    const/16 v10, 0x10

    .line 2991
    .line 2992
    new-array v10, v10, [I

    .line 2993
    .line 2994
    iget-object v11, v4, Lm11;->α:[I

    .line 2995
    .line 2996
    iget v4, v4, Lm11;->β:I

    .line 2997
    .line 2998
    move-object v15, v10

    .line 2999
    const/4 v10, 0x0

    .line 3000
    const/4 v14, 0x0

    .line 3001
    :goto_55
    if-ge v10, v4, :cond_ab

    .line 3002
    .line 3003
    aget v16, v11, v10

    .line 3004
    .line 3005
    move/from16 v18, v4

    .line 3006
    .line 3007
    add-int/lit8 v4, v14, 0x1

    .line 3008
    .line 3009
    move-object/from16 v21, v9

    .line 3010
    .line 3011
    array-length v9, v15

    .line 3012
    if-ge v9, v4, :cond_aa

    .line 3013
    .line 3014
    array-length v9, v15

    .line 3015
    const/16 v19, 0x3

    .line 3016
    .line 3017
    mul-int/lit8 v9, v9, 0x3

    .line 3018
    .line 3019
    const/16 v20, 0x2

    .line 3020
    .line 3021
    div-int/lit8 v9, v9, 0x2

    .line 3022
    .line 3023
    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    .line 3024
    .line 3025
    .line 3026
    move-result v9

    .line 3027
    invoke-static {v15, v9}, Ljava/util/Arrays;->copyOf([II)[I

    .line 3028
    .line 3029
    .line 3030
    move-result-object v9

    .line 3031
    move-object v15, v9

    .line 3032
    goto :goto_56

    .line 3033
    :cond_aa
    const/16 v19, 0x3

    .line 3034
    .line 3035
    const/16 v20, 0x2

    .line 3036
    .line 3037
    :goto_56
    aput v16, v15, v14

    .line 3038
    .line 3039
    add-int/lit8 v10, v10, 0x1

    .line 3040
    .line 3041
    move v14, v4

    .line 3042
    move/from16 v4, v18

    .line 3043
    .line 3044
    move-object/from16 v9, v21

    .line 3045
    .line 3046
    goto :goto_55

    .line 3047
    :cond_ab
    move-object/from16 v21, v9

    .line 3048
    .line 3049
    new-instance v4, Ljava/util/ArrayList;

    .line 3050
    .line 3051
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3052
    .line 3053
    .line 3054
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 3055
    .line 3056
    .line 3057
    move-result v9

    .line 3058
    if-gtz v9, :cond_ae

    .line 3059
    .line 3060
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 3061
    .line 3062
    .line 3063
    move-result v2

    .line 3064
    if-gtz v2, :cond_ac

    .line 3065
    .line 3066
    const/4 v9, 0x0

    .line 3067
    goto :goto_57

    .line 3068
    :cond_ac
    const/4 v11, 0x0

    .line 3069
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3070
    .line 3071
    .line 3072
    move-result-object v0

    .line 3073
    invoke-static {v0}, Llz1;->ψ(Ljava/lang/Object;)V

    .line 3074
    .line 3075
    .line 3076
    if-gtz v14, :cond_ad

    .line 3077
    .line 3078
    const-string v0, "Index must be between 0 and size"

    .line 3079
    .line 3080
    invoke-static {v0}, Lγ;->η(Ljava/lang/String;)V

    .line 3081
    .line 3082
    .line 3083
    const/4 v9, 0x0

    .line 3084
    return-object v9

    .line 3085
    :cond_ad
    const/4 v9, 0x0

    .line 3086
    aget v0, v15, v11

    .line 3087
    .line 3088
    throw v9

    .line 3089
    :cond_ae
    const/4 v9, 0x0

    .line 3090
    const/4 v11, 0x0

    .line 3091
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3092
    .line 3093
    .line 3094
    move-result-object v0

    .line 3095
    invoke-static {v0}, Llz1;->ψ(Ljava/lang/Object;)V

    .line 3096
    .line 3097
    .line 3098
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3099
    .line 3100
    .line 3101
    throw v9

    .line 3102
    :cond_af
    const/4 v9, 0x0

    .line 3103
    const/4 v11, 0x0

    .line 3104
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 3105
    .line 3106
    .line 3107
    move-result v10

    .line 3108
    if-gtz v10, :cond_b0

    .line 3109
    .line 3110
    :goto_57
    iget-object v2, v8, Ll1;->τ:Lkz1;

    .line 3111
    .line 3112
    invoke-virtual {v2, v0, v3}, Lkz1;->γ(ILjava/lang/Object;)V

    .line 3113
    .line 3114
    .line 3115
    invoke-virtual {v6, v0, v5}, Lkz1;->γ(ILjava/lang/Object;)V

    .line 3116
    .line 3117
    .line 3118
    goto :goto_58

    .line 3119
    :cond_b0
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3120
    .line 3121
    .line 3122
    move-result-object v0

    .line 3123
    invoke-static {v0}, Llz1;->ψ(Ljava/lang/Object;)V

    .line 3124
    .line 3125
    .line 3126
    invoke-virtual {v4, v11}, Lm11;->β(I)I

    .line 3127
    .line 3128
    .line 3129
    throw v9

    .line 3130
    :cond_b1
    const/4 v9, 0x0

    .line 3131
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3132
    .line 3133
    const-string v1, "Can\'t have more than "

    .line 3134
    .line 3135
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3136
    .line 3137
    .line 3138
    iget v1, v4, Lm11;->β:I

    .line 3139
    .line 3140
    const-string v2, " custom actions for one widget"

    .line 3141
    .line 3142
    invoke-static {v0, v1, v2}, Lnx;->κ(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 3143
    .line 3144
    .line 3145
    move-result-object v0

    .line 3146
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 3147
    .line 3148
    .line 3149
    return-object v9

    .line 3150
    :cond_b2
    :goto_58
    invoke-static {v13, v12}, Lkn0;->ζ(Lbs1;Landroid/content/res/Resources;)Z

    .line 3151
    .line 3152
    .line 3153
    move-result v2

    .line 3154
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScreenReaderFocusable(Z)V

    .line 3155
    .line 3156
    .line 3157
    iget-object v2, v8, Ll1;->Ε:Ll11;

    .line 3158
    .line 3159
    invoke-virtual {v2, v0}, Ll11;->δ(I)I

    .line 3160
    .line 3161
    .line 3162
    move-result v2

    .line 3163
    const/4 v10, -0x1

    .line 3164
    if-eq v2, v10, :cond_b4

    .line 3165
    .line 3166
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 3167
    .line 3168
    .line 3169
    move-result-object v3

    .line 3170
    invoke-static {v3, v2}, Lv71;->π(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 3171
    .line 3172
    .line 3173
    move-result-object v3

    .line 3174
    if-eqz v3, :cond_b3

    .line 3175
    .line 3176
    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;)V

    .line 3177
    .line 3178
    .line 3179
    move-object/from16 v3, v30

    .line 3180
    .line 3181
    goto :goto_59

    .line 3182
    :cond_b3
    move-object/from16 v3, v30

    .line 3183
    .line 3184
    invoke-virtual {v1, v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;I)V

    .line 3185
    .line 3186
    .line 3187
    :goto_59
    iget-object v2, v8, Ll1;->Η:Ljava/lang/String;

    .line 3188
    .line 3189
    const/4 v9, 0x0

    .line 3190
    invoke-virtual {v8, v0, v7, v2, v9}, Ll1;->κ(ILэ;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 3191
    .line 3192
    .line 3193
    goto :goto_5a

    .line 3194
    :cond_b4
    move-object/from16 v3, v30

    .line 3195
    .line 3196
    const/4 v9, 0x0

    .line 3197
    :goto_5a
    iget-object v2, v8, Ll1;->Ζ:Ll11;

    .line 3198
    .line 3199
    invoke-virtual {v2, v0}, Ll11;->δ(I)I

    .line 3200
    .line 3201
    .line 3202
    move-result v2

    .line 3203
    const/4 v10, -0x1

    .line 3204
    if-eq v2, v10, :cond_b5

    .line 3205
    .line 3206
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 3207
    .line 3208
    .line 3209
    move-result-object v3

    .line 3210
    invoke-static {v3, v2}, Lv71;->π(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 3211
    .line 3212
    .line 3213
    move-result-object v2

    .line 3214
    if-eqz v2, :cond_b5

    .line 3215
    .line 3216
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;)V

    .line 3217
    .line 3218
    .line 3219
    iget-object v1, v8, Ll1;->Θ:Ljava/lang/String;

    .line 3220
    .line 3221
    invoke-virtual {v8, v0, v7, v1, v9}, Ll1;->κ(ILэ;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 3222
    .line 3223
    .line 3224
    :cond_b5
    invoke-virtual {v13}, Lbs1;->ξ()Lxr1;

    .line 3225
    .line 3226
    .line 3227
    move-result-object v0

    .line 3228
    sget-object v1, Lgs1;->β:Lis1;

    .line 3229
    .line 3230
    invoke-static {v0, v1}, Lv81;->δ(Lxr1;Lis1;)Ljava/lang/Object;

    .line 3231
    .line 3232
    .line 3233
    move-result-object v0

    .line 3234
    check-cast v0, Ljava/lang/String;

    .line 3235
    .line 3236
    if-eqz v0, :cond_b6

    .line 3237
    .line 3238
    invoke-virtual {v7, v0}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 3239
    .line 3240
    .line 3241
    :cond_b6
    move-object v8, v7

    .line 3242
    :goto_5b
    return-object v8

    .line 3243
    :cond_b7
    invoke-static {}, Lγ;->β()V

    .line 3244
    .line 3245
    .line 3246
    const/4 v9, 0x0

    .line 3247
    return-object v9

    .line 3248
    :cond_b8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 3249
    .line 3250
    const-string v2, "semanticsNode "

    .line 3251
    .line 3252
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3253
    .line 3254
    .line 3255
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3256
    .line 3257
    .line 3258
    const-string v0, " has null parent"

    .line 3259
    .line 3260
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3261
    .line 3262
    .line 3263
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3264
    .line 3265
    .line 3266
    move-result-object v0

    .line 3267
    invoke-static {v0}, Lam0;->γ(Ljava/lang/String;)Ljava/lang/Void;

    .line 3268
    .line 3269
    .line 3270
    new-instance v0, Lpm;

    .line 3271
    .line 3272
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 3273
    .line 3274
    .line 3275
    throw v0
.end method

.method public final τ(I)Lэ;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lf1;->θ:Ll1;

    .line 3
    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget p1, v1, Ll1;->ο:I

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lf1;->ο(I)Lэ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Unknown focus type: "

    .line 17
    .line 18
    invoke-static {p0, p1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    iget p1, v1, Ll1;->π:I

    .line 28
    .line 29
    const/high16 v0, -0x80000000

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_2
    invoke-virtual {p0, p1}, Lf1;->ο(I)Lэ;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final ω(IILandroid/os/Bundle;)Z
    .locals 19

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    .line 1
    iget-object v2, v2, Lf1;->θ:Ll1;

    iget-object v4, v2, Ll1;->λ:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    iget-object v5, v2, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 3
    invoke-virtual {v2}, Ll1;->σ()Lsm0;

    move-result-object v6

    invoke-virtual {v6, v0}, Lsm0;->β(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lds1;

    if-eqz v6, :cond_0

    .line 4
    iget-object v9, v6, Lds1;->α:Lbs1;

    if-nez v9, :cond_1

    :cond_0
    :goto_0
    const/16 v18, 0x0

    goto/16 :goto_3a

    .line 5
    :cond_1
    iget-object v6, v9, Lbs1;->γ:Lyp0;

    iget v8, v9, Lbs1;->ζ:I

    iget-object v10, v9, Lbs1;->δ:Lxr1;

    iget-object v11, v10, Lxr1;->ε:Lb21;

    .line 6
    sget-object v12, Lfs1;->ξ:Lis1;

    .line 7
    invoke-virtual {v11, v12}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_2

    const/4 v12, 0x0

    .line 8
    :cond_2
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v12, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    const/4 v15, 0x1

    if-eqz v12, :cond_4

    .line 9
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v13, 0x22

    if-lt v12, v13, :cond_3

    .line 10
    invoke-static {v4}, Lп;->θ(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result v12

    goto :goto_1

    :cond_3
    move v12, v15

    :goto_1
    if-nez v12, :cond_4

    goto :goto_0

    :cond_4
    const/16 v12, 0x40

    const/high16 v13, -0x80000000

    if-eq v1, v12, :cond_73

    const/16 v4, 0x80

    if-eq v1, v4, :cond_71

    const/16 v12, 0x200

    const/4 v13, 0x2

    const/16 v4, 0x100

    const/4 v7, -0x1

    if-eq v1, v4, :cond_53

    if-eq v1, v12, :cond_53

    const/16 v4, 0x4000

    if-eq v1, v4, :cond_51

    const/high16 v4, 0x20000

    if-eq v1, v4, :cond_4d

    .line 11
    invoke-static {v9}, Lkn0;->ε(Lbs1;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    if-eq v1, v15, :cond_4a

    if-eq v1, v13, :cond_48

    sparse-switch v1, :sswitch_data_0

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    .line 12
    iget-object v2, v2, Ll1;->τ:Lkz1;

    invoke-virtual {v2, v0}, Lkz1;->β(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkz1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lkz1;->β(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-nez v0, :cond_6

    goto :goto_0

    .line 13
    :cond_6
    sget-object v0, Lwr1;->χ:Lis1;

    .line 14
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7

    const/4 v13, 0x0

    goto :goto_2

    :cond_7
    move-object v13, v0

    .line 15
    :goto_2
    check-cast v13, Ljava/util/List;

    if-nez v13, :cond_8

    goto :goto_0

    .line 16
    :cond_8
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v0

    if-gtz v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/4 v0, 0x0

    .line 17
    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-static {}, Lγ;->β()V

    const/4 v0, 0x0

    return v0

    .line 20
    :pswitch_0
    sget-object v0, Lwr1;->Β:Lis1;

    .line 21
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_a

    const/4 v13, 0x0

    goto :goto_3

    :cond_a
    move-object v13, v0

    .line 22
    :goto_3
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 23
    iget-object v0, v13, Lм;->β:Lm80;

    .line 24
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 25
    :pswitch_1
    sget-object v0, Lwr1;->ω:Lis1;

    .line 26
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_b

    const/4 v13, 0x0

    goto :goto_4

    :cond_b
    move-object v13, v0

    .line 27
    :goto_4
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 28
    iget-object v0, v13, Lм;->β:Lm80;

    .line 29
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 30
    :pswitch_2
    sget-object v0, Lwr1;->Α:Lis1;

    .line 31
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_c

    const/4 v13, 0x0

    goto :goto_5

    :cond_c
    move-object v13, v0

    .line 32
    :goto_5
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 33
    iget-object v0, v13, Lм;->β:Lm80;

    .line 34
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 35
    :pswitch_3
    sget-object v0, Lwr1;->ψ:Lis1;

    .line 36
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_d

    const/4 v13, 0x0

    goto :goto_6

    :cond_d
    move-object v13, v0

    .line 37
    :goto_6
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 38
    iget-object v0, v13, Lм;->β:Lm80;

    .line 39
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :pswitch_4
    :sswitch_0
    const/4 v14, 0x0

    goto/16 :goto_1d

    .line 40
    :sswitch_1
    sget-object v0, Lwr1;->ξ:Lis1;

    .line 41
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_e

    const/4 v13, 0x0

    goto :goto_7

    :cond_e
    move-object v13, v0

    .line 42
    :goto_7
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 43
    iget-object v0, v13, Lм;->β:Lm80;

    .line 44
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_2
    if-eqz v3, :cond_0

    .line 45
    const-string v0, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_0

    .line 46
    :cond_f
    sget-object v1, Lwr1;->θ:Lis1;

    .line 47
    invoke-virtual {v11, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_10

    const/4 v13, 0x0

    goto :goto_8

    :cond_10
    move-object v13, v1

    .line 48
    :goto_8
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 49
    iget-object v1, v13, Lм;->β:Lm80;

    .line 50
    check-cast v1, La80;

    if-eqz v1, :cond_0

    .line 51
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 52
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 53
    :sswitch_3
    invoke-virtual {v9}, Lbs1;->μ()Lbs1;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 54
    iget-object v1, v0, Lbs1;->δ:Lxr1;

    .line 55
    sget-object v2, Lwr1;->δ:Lis1;

    .line 56
    iget-object v1, v1, Lxr1;->ε:Lb21;

    .line 57
    invoke-virtual {v1, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_11

    const/4 v1, 0x0

    .line 58
    :cond_11
    check-cast v1, Lм;

    goto :goto_9

    :cond_12
    const/4 v1, 0x0

    :goto_9
    if-nez v1, :cond_14

    if-eqz v0, :cond_14

    .line 59
    invoke-virtual {v0}, Lbs1;->μ()Lbs1;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 60
    iget-object v1, v0, Lbs1;->δ:Lxr1;

    .line 61
    sget-object v2, Lwr1;->δ:Lis1;

    .line 62
    iget-object v1, v1, Lxr1;->ε:Lb21;

    .line 63
    invoke-virtual {v1, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_13

    const/4 v1, 0x0

    .line 64
    :cond_13
    check-cast v1, Lм;

    goto :goto_9

    :cond_14
    if-nez v0, :cond_15

    .line 65
    invoke-virtual {v9}, Lbs1;->η()Lml1;

    move-result-object v0

    .line 66
    new-instance v1, Landroid/graphics/Rect;

    .line 67
    iget v2, v0, Lml1;->α:F

    float-to-double v2, v2

    .line 68
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    .line 69
    iget v3, v0, Lml1;->β:F

    float-to-double v3, v3

    .line 70
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    .line 71
    iget v4, v0, Lml1;->γ:F

    float-to-double v6, v4

    .line 72
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v4, v6

    invoke-static {v4}, Ljx0;->в(F)I

    move-result v4

    .line 73
    iget v0, v0, Lml1;->δ:F

    float-to-double v6, v0

    .line 74
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v0, v6

    invoke-static {v0}, Ljx0;->в(F)I

    move-result v0

    .line 75
    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 76
    invoke-virtual {v5, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    move-result v0

    return v0

    :cond_15
    const-wide/16 v1, 0x0

    move-wide v7, v1

    const/4 v3, 0x0

    :goto_a
    if-eqz v0, :cond_29

    .line 77
    iget-object v5, v0, Lbs1;->γ:Lyp0;

    iget-object v10, v0, Lbs1;->δ:Lxr1;

    iget-object v10, v10, Lxr1;->ε:Lb21;

    .line 78
    sget-object v11, Lwr1;->δ:Lis1;

    .line 79
    invoke-virtual {v10, v11}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_16

    const/4 v11, 0x0

    .line 80
    :cond_16
    check-cast v11, Lм;

    if-eqz v11, :cond_28

    .line 81
    iget-object v12, v5, Lyp0;->Κ:Lk31;

    .line 82
    iget-object v12, v12, Lk31;->γ:Lgm0;

    .line 83
    invoke-static {v12}, Ls1;->δ(Lmp0;)Lml1;

    move-result-object v12

    .line 84
    iget-object v5, v5, Lyp0;->Κ:Lk31;

    .line 85
    iget-object v5, v5, Lk31;->γ:Lgm0;

    .line 86
    invoke-virtual {v5}, Lq31;->μ()Lmp0;

    move-result-object v5

    if-eqz v5, :cond_17

    .line 87
    check-cast v5, Lq31;

    invoke-virtual {v5, v1, v2}, Lq31;->ｂ(J)J

    move-result-wide v13

    goto :goto_b

    :cond_17
    move-wide v13, v1

    .line 88
    :goto_b
    invoke-virtual {v12, v13, v14}, Lml1;->ε(J)Lml1;

    move-result-object v5

    .line 89
    invoke-virtual {v9}, Lbs1;->δ()Lq31;

    move-result-object v12

    if-eqz v12, :cond_19

    .line 90
    invoke-virtual {v12}, Lq31;->Х()Lq01;

    move-result-object v13

    .line 91
    iget-boolean v13, v13, Lq01;->σ:Z

    if-eqz v13, :cond_18

    goto :goto_c

    :cond_18
    const/4 v12, 0x0

    :goto_c
    if-eqz v12, :cond_19

    .line 92
    invoke-virtual {v12, v1, v2}, Lq31;->ｂ(J)J

    move-result-wide v12

    goto :goto_d

    :cond_19
    move-wide v12, v1

    .line 93
    :goto_d
    invoke-static {v12, v13, v7, v8}, Lo41;->γ(JJ)J

    move-result-wide v12

    .line 94
    invoke-virtual {v9}, Lbs1;->δ()Lq31;

    move-result-object v14

    if-eqz v14, :cond_1a

    .line 95
    iget-wide v1, v14, Lch1;->η:J

    goto :goto_e

    :cond_1a
    const-wide/16 v1, 0x0

    .line 96
    :goto_e
    invoke-static {v1, v2}, Ls1;->Ζ(J)J

    move-result-wide v1

    invoke-static {v12, v13, v1, v2}, Li91;->δ(JJ)Lml1;

    move-result-object v1

    .line 97
    iget v2, v1, Lml1;->α:F

    iget v12, v5, Lml1;->α:F

    sub-float/2addr v2, v12

    .line 98
    iget v12, v1, Lml1;->γ:F

    iget v13, v5, Lml1;->γ:F

    sub-float/2addr v12, v13

    .line 99
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    move-result v13

    invoke-static {v12}, Ljava/lang/Math;->signum(F)F

    move-result v14

    cmpg-float v13, v13, v14

    if-nez v13, :cond_1c

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v13

    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v14

    cmpg-float v13, v13, v14

    if-gez v13, :cond_1b

    goto :goto_f

    :cond_1b
    move v2, v12

    goto :goto_f

    :cond_1c
    const/4 v2, 0x0

    .line 100
    :goto_f
    iget v12, v1, Lml1;->β:F

    iget v13, v5, Lml1;->β:F

    sub-float/2addr v12, v13

    .line 101
    iget v1, v1, Lml1;->δ:F

    iget v5, v5, Lml1;->δ:F

    sub-float/2addr v1, v5

    .line 102
    invoke-static {v12}, Ljava/lang/Math;->signum(F)F

    move-result v5

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v13

    cmpg-float v5, v5, v13

    if-nez v5, :cond_1e

    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v5

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v13

    cmpg-float v5, v5, v13

    if-gez v5, :cond_1d

    goto :goto_10

    :cond_1d
    move v12, v1

    goto :goto_10

    :cond_1e
    const/4 v12, 0x0

    .line 103
    :goto_10
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    .line 104
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v12, v5

    const/16 v5, 0x20

    shl-long/2addr v1, v5

    const-wide v16, 0xffffffffL

    and-long v12, v12, v16

    or-long/2addr v1, v12

    const-wide/16 v12, 0x0

    .line 105
    invoke-static {v1, v2, v12, v13}, Lo41;->α(JJ)Z

    move-result v14

    if-eqz v14, :cond_1f

    move/from16 p1, v5

    const/4 v14, 0x0

    move-wide v4, v1

    goto :goto_12

    :cond_1f
    move/from16 p1, v5

    const/4 v14, 0x0

    shr-long v4, v1, p1

    long-to-int v4, v4

    .line 106
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    and-long v12, v1, v16

    long-to-int v5, v12

    .line 107
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 108
    sget-object v12, Lfs1;->φ:Lis1;

    .line 109
    invoke-virtual {v10, v12}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_20

    const/4 v12, 0x0

    :cond_20
    if-nez v12, :cond_27

    .line 110
    iget-object v12, v6, Lyp0;->Δ:Lnp0;

    .line 111
    sget-object v13, Lnp0;->ζ:Lnp0;

    if-ne v12, v13, :cond_21

    move v12, v15

    goto :goto_11

    :cond_21
    const/4 v12, 0x0

    :goto_11
    if-eqz v12, :cond_22

    neg-float v4, v4

    .line 112
    :cond_22
    sget-object v12, Lfs1;->χ:Lis1;

    .line 113
    invoke-virtual {v10, v12}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_23

    const/4 v10, 0x0

    :cond_23
    if-nez v10, :cond_26

    .line 114
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v12, v4

    .line 115
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long v12, v12, p1

    and-long v4, v4, v16

    or-long/2addr v4, v12

    .line 116
    :goto_12
    iget-object v10, v11, Lм;->β:Lm80;

    .line 117
    check-cast v10, Le80;

    if-eqz v10, :cond_24

    shr-long v11, v4, p1

    long-to-int v11, v11

    .line 118
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    .line 119
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    and-long v4, v4, v16

    long-to-int v4, v4

    .line 120
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 121
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 122
    invoke-interface {v10, v11, v4}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-ne v4, v15, :cond_24

    goto :goto_13

    :cond_24
    if-eqz v3, :cond_25

    :goto_13
    move v3, v15

    goto :goto_14

    :cond_25
    const/4 v3, 0x0

    .line 123
    :goto_14
    invoke-static {v7, v8, v1, v2}, Lo41;->β(JJ)J

    move-result-wide v7

    goto :goto_15

    .line 124
    :cond_26
    invoke-static {}, Lγ;->β()V

    const/4 v0, 0x0

    return v0

    .line 125
    :cond_27
    invoke-static {}, Lγ;->β()V

    const/4 v0, 0x0

    return v0

    :cond_28
    const/4 v14, 0x0

    .line 126
    :goto_15
    invoke-virtual {v0}, Lbs1;->μ()Lbs1;

    move-result-object v0

    const-wide/16 v1, 0x0

    goto/16 :goto_a

    :cond_29
    return v3

    :sswitch_4
    if-eqz v3, :cond_2a

    .line 127
    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    .line 128
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_16

    :cond_2a
    const/4 v0, 0x0

    .line 129
    :goto_16
    sget-object v1, Lwr1;->κ:Lis1;

    .line 130
    invoke-virtual {v11, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2b

    const/4 v13, 0x0

    goto :goto_17

    :cond_2b
    move-object v13, v1

    .line 131
    :goto_17
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 132
    iget-object v1, v13, Lм;->β:Lm80;

    .line 133
    check-cast v1, La80;

    if-eqz v1, :cond_0

    .line 134
    new-instance v2, Lg4;

    if-nez v0, :cond_2c

    const-string v0, ""

    :cond_2c
    invoke-direct {v2, v0}, Lg4;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 135
    :sswitch_5
    sget-object v0, Lwr1;->υ:Lis1;

    .line 136
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2d

    const/4 v13, 0x0

    goto :goto_18

    :cond_2d
    move-object v13, v0

    .line 137
    :goto_18
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 138
    iget-object v0, v13, Lм;->β:Lm80;

    .line 139
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 140
    :sswitch_6
    sget-object v0, Lwr1;->τ:Lis1;

    .line 141
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2e

    const/4 v13, 0x0

    goto :goto_19

    :cond_2e
    move-object v13, v0

    .line 142
    :goto_19
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 143
    iget-object v0, v13, Lм;->β:Lm80;

    .line 144
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 145
    :sswitch_7
    sget-object v0, Lwr1;->σ:Lis1;

    .line 146
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2f

    const/4 v13, 0x0

    goto :goto_1a

    :cond_2f
    move-object v13, v0

    .line 147
    :goto_1a
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 148
    iget-object v0, v13, Lм;->β:Lm80;

    .line 149
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 150
    :sswitch_8
    sget-object v0, Lwr1;->π:Lis1;

    .line 151
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_30

    const/4 v13, 0x0

    goto :goto_1b

    :cond_30
    move-object v13, v0

    .line 152
    :goto_1b
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 153
    iget-object v0, v13, Lм;->β:Lm80;

    .line 154
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 155
    :sswitch_9
    sget-object v0, Lwr1;->ρ:Lis1;

    .line 156
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_31

    const/4 v13, 0x0

    goto :goto_1c

    :cond_31
    move-object v13, v0

    .line 157
    :goto_1c
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 158
    iget-object v0, v13, Lм;->β:Lm80;

    .line 159
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :goto_1d
    const/16 v0, 0x1000

    if-ne v1, v0, :cond_32

    move v0, v15

    goto :goto_1e

    :cond_32
    const/4 v0, 0x0

    :goto_1e
    const/16 v2, 0x2000

    if-ne v1, v2, :cond_33

    move v2, v15

    goto :goto_1f

    :cond_33
    const/4 v2, 0x0

    :goto_1f
    const v3, 0x1020039

    if-ne v1, v3, :cond_34

    move v3, v15

    goto :goto_20

    :cond_34
    const/4 v3, 0x0

    :goto_20
    const v4, 0x102003b

    if-ne v1, v4, :cond_35

    move v4, v15

    goto :goto_21

    :cond_35
    const/4 v4, 0x0

    :goto_21
    const v5, 0x1020038

    if-ne v1, v5, :cond_36

    move v5, v15

    goto :goto_22

    :cond_36
    const/4 v5, 0x0

    :goto_22
    const v7, 0x102003a

    if-ne v1, v7, :cond_37

    goto :goto_23

    :cond_37
    const/4 v15, 0x0

    :goto_23
    if-nez v0, :cond_38

    if-eqz v2, :cond_3c

    .line 160
    :cond_38
    sget-object v0, Lfs1;->γ:Lis1;

    .line 161
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_39

    const/4 v0, 0x0

    .line 162
    :cond_39
    check-cast v0, Lvj1;

    .line 163
    sget-object v1, Lwr1;->θ:Lis1;

    .line 164
    invoke-virtual {v11, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3a

    const/4 v1, 0x0

    .line 165
    :cond_3a
    check-cast v1, Lм;

    if-eqz v0, :cond_3c

    if-eqz v1, :cond_3c

    const/16 v0, 0x14

    int-to-float v0, v0

    div-float v4, v14, v0

    if-eqz v2, :cond_3b

    neg-float v4, v4

    .line 166
    :cond_3b
    iget-object v0, v1, Lм;->β:Lm80;

    .line 167
    check-cast v0, La80;

    if-eqz v0, :cond_0

    add-float/2addr v4, v14

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 168
    :cond_3c
    iget-object v0, v6, Lyp0;->Κ:Lk31;

    .line 169
    iget-object v0, v0, Lk31;->γ:Lgm0;

    .line 170
    invoke-static {v0}, Ls1;->δ(Lmp0;)Lml1;

    move-result-object v0

    invoke-virtual {v0}, Lml1;->β()J

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 172
    sget-object v1, Lwr1;->Γ:Lis1;

    .line 173
    invoke-virtual {v11, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3d

    const/4 v1, 0x0

    .line 174
    :cond_3d
    check-cast v1, Lм;

    if-eqz v1, :cond_3e

    .line 175
    iget-object v1, v1, Lм;->β:Lm80;

    .line 176
    check-cast v1, La80;

    if-eqz v1, :cond_3e

    .line 177
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3e

    const/4 v1, 0x0

    .line 178
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    .line 179
    :cond_3e
    sget-object v0, Lwr1;->δ:Lis1;

    .line 180
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3f

    const/4 v0, 0x0

    .line 181
    :cond_3f
    check-cast v0, Lм;

    if-nez v0, :cond_40

    goto/16 :goto_0

    .line 182
    :cond_40
    sget-object v0, Lfs1;->φ:Lis1;

    .line 183
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_41

    const/4 v0, 0x0

    :cond_41
    if-nez v0, :cond_44

    .line 184
    sget-object v0, Lfs1;->χ:Lis1;

    .line 185
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_42

    const/4 v13, 0x0

    goto :goto_24

    :cond_42
    move-object v13, v0

    :goto_24
    if-nez v13, :cond_43

    goto/16 :goto_0

    .line 186
    :cond_43
    invoke-static {}, Lγ;->β()V

    const/4 v0, 0x0

    return v0

    .line 187
    :cond_44
    invoke-static {}, Lγ;->β()V

    const/4 v0, 0x0

    return v0

    .line 188
    :sswitch_a
    sget-object v0, Lwr1;->γ:Lis1;

    .line 189
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_45

    const/4 v13, 0x0

    goto :goto_25

    :cond_45
    move-object v13, v0

    .line 190
    :goto_25
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 191
    iget-object v0, v13, Lм;->β:Lm80;

    .line 192
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 193
    :sswitch_b
    sget-object v1, Lwr1;->β:Lis1;

    .line 194
    invoke-virtual {v11, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_46

    const/4 v1, 0x0

    .line 195
    :cond_46
    check-cast v1, Lм;

    if-eqz v1, :cond_47

    .line 196
    iget-object v1, v1, Lм;->β:Lm80;

    .line 197
    check-cast v1, Lp70;

    if-eqz v1, :cond_47

    invoke-interface {v1}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    :goto_26
    const/16 v3, 0xc

    const/4 v4, 0x0

    goto :goto_27

    :cond_47
    const/4 v1, 0x0

    goto :goto_26

    .line 198
    :goto_27
    invoke-static {v2, v0, v15, v4, v3}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    if-eqz v1, :cond_0

    .line 199
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 200
    :cond_48
    sget-object v0, Lfs1;->μ:Lis1;

    .line 201
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_49

    const/4 v13, 0x0

    goto :goto_28

    :cond_49
    move-object v13, v0

    .line 202
    :goto_28
    invoke-static {v13, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    move-result-object v0

    check-cast v0, Ly40;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v15}, Ly40;->β(IZZ)Z

    return v15

    .line 204
    :cond_4a
    invoke-virtual {v5}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_4b

    invoke-virtual {v5}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 205
    :cond_4b
    sget-object v0, Lwr1;->φ:Lis1;

    .line 206
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4c

    const/4 v13, 0x0

    goto :goto_29

    :cond_4c
    move-object v13, v0

    .line 207
    :goto_29
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 208
    iget-object v0, v13, Lм;->β:Lm80;

    .line 209
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_4d
    if-eqz v3, :cond_4e

    .line 210
    const-string v0, "ACTION_ARGUMENT_SELECTION_START_INT"

    .line 211
    invoke-virtual {v3, v0, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_2a

    :cond_4e
    move v0, v7

    :goto_2a
    if-eqz v3, :cond_4f

    .line 212
    const-string v1, "ACTION_ARGUMENT_SELECTION_END_INT"

    .line 213
    invoke-virtual {v3, v1, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v7

    :cond_4f
    const/4 v1, 0x0

    .line 214
    invoke-virtual {v2, v9, v0, v7, v1}, Ll1;->Θ(Lbs1;IIZ)Z

    move-result v0

    if-eqz v0, :cond_50

    .line 215
    invoke-virtual {v2, v8}, Ll1;->ψ(I)I

    move-result v3

    const/16 v4, 0xc

    const/4 v5, 0x0

    .line 216
    invoke-static {v2, v3, v1, v5, v4}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    :cond_50
    return v0

    .line 217
    :cond_51
    sget-object v0, Lwr1;->ο:Lis1;

    .line 218
    invoke-virtual {v11, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_52

    const/4 v13, 0x0

    goto :goto_2b

    :cond_52
    move-object v13, v0

    .line 219
    :goto_2b
    check-cast v13, Lм;

    if-eqz v13, :cond_0

    .line 220
    iget-object v0, v13, Lм;->β:Lm80;

    .line 221
    check-cast v0, Lp70;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_53
    if-eqz v3, :cond_0

    .line 222
    const-string v0, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    .line 223
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 224
    const-string v6, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    .line 225
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v1, v4, :cond_54

    move v1, v15

    goto :goto_2c

    :cond_54
    const/4 v1, 0x0

    .line 226
    :goto_2c
    iget-object v6, v2, Ll1;->χ:Ljava/lang/Integer;

    if-nez v6, :cond_55

    goto :goto_2d

    :cond_55
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eq v8, v6, :cond_56

    .line 227
    :goto_2d
    iput v7, v2, Ll1;->φ:I

    .line 228
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v2, Ll1;->χ:Ljava/lang/Integer;

    .line 229
    :cond_56
    invoke-static {v9}, Ll1;->τ(Lbs1;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 230
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_57

    goto/16 :goto_0

    .line 231
    :cond_57
    invoke-static {v9}, Ll1;->τ(Lbs1;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_59

    .line 232
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v14

    if-nez v14, :cond_58

    goto :goto_2e

    :cond_58
    if-eq v0, v15, :cond_64

    if-eq v0, v13, :cond_62

    const/4 v5, 0x4

    if-eq v0, v5, :cond_5c

    const/16 v13, 0x8

    if-eq v0, v13, :cond_5a

    const/16 v13, 0x10

    if-eq v0, v13, :cond_5c

    :cond_59
    :goto_2e
    const/4 v13, 0x0

    goto/16 :goto_2f

    .line 233
    :cond_5a
    sget-object v5, Lу;->γ:Lу;

    if-nez v5, :cond_5b

    .line 234
    new-instance v5, Lу;

    .line 235
    invoke-direct {v5}, Lр;-><init>()V

    .line 236
    sput-object v5, Lу;->γ:Lу;

    .line 237
    :cond_5b
    sget-object v13, Lу;->γ:Lу;

    .line 238
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    iput-object v8, v13, Lр;->α:Ljava/lang/Object;

    goto/16 :goto_2f

    .line 240
    :cond_5c
    sget-object v13, Lwr1;->α:Lis1;

    .line 241
    invoke-virtual {v11, v13}, Lb21;->γ(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5d

    goto :goto_2e

    .line 242
    :cond_5d
    invoke-static {v10}, Lv71;->θ(Lxr1;)Lm32;

    move-result-object v10

    if-nez v10, :cond_5e

    goto :goto_2e

    :cond_5e
    if-ne v0, v5, :cond_60

    .line 243
    sget-object v5, Lс;->η:Lс;

    if-nez v5, :cond_5f

    .line 244
    new-instance v5, Lс;

    const/4 v13, 0x2

    .line 245
    invoke-direct {v5, v13}, Lс;-><init>(I)V

    .line 246
    sput-object v5, Lс;->η:Lс;

    .line 247
    :cond_5f
    sget-object v13, Lс;->η:Lс;

    .line 248
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    iput-object v8, v13, Lр;->α:Ljava/lang/Object;

    .line 250
    iput-object v10, v13, Lс;->δ:Ljava/lang/Object;

    goto :goto_2f

    .line 251
    :cond_60
    sget-object v5, Lт;->ε:Lт;

    if-nez v5, :cond_61

    .line 252
    new-instance v5, Lт;

    .line 253
    invoke-direct {v5}, Lр;-><init>()V

    .line 254
    new-instance v13, Landroid/graphics/Rect;

    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    .line 255
    sput-object v5, Lт;->ε:Lт;

    .line 256
    :cond_61
    sget-object v13, Lт;->ε:Lт;

    .line 257
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    iput-object v8, v13, Lр;->α:Ljava/lang/Object;

    .line 259
    iput-object v10, v13, Lт;->γ:Lm32;

    .line 260
    iput-object v9, v13, Lт;->δ:Lbs1;

    goto :goto_2f

    .line 261
    :cond_62
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    iget-object v5, v5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 262
    sget-object v10, Lс;->ζ:Lс;

    if-nez v10, :cond_63

    .line 263
    new-instance v10, Lс;

    const/4 v13, 0x1

    .line 264
    invoke-direct {v10, v13}, Lс;-><init>(I)V

    .line 265
    invoke-static {v5}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object v5

    iput-object v5, v10, Lс;->δ:Ljava/lang/Object;

    .line 266
    sput-object v10, Lс;->ζ:Lс;

    .line 267
    :cond_63
    sget-object v13, Lс;->ζ:Lс;

    .line 268
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    invoke-virtual {v13, v8}, Lс;->Β(Ljava/lang/String;)V

    goto :goto_2f

    .line 270
    :cond_64
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    iget-object v5, v5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 271
    sget-object v10, Lс;->ε:Lс;

    if-nez v10, :cond_65

    .line 272
    new-instance v10, Lс;

    const/4 v13, 0x0

    .line 273
    invoke-direct {v10, v13}, Lс;-><init>(I)V

    .line 274
    invoke-static {v5}, Ljava/text/BreakIterator;->getCharacterInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object v5

    iput-object v5, v10, Lс;->δ:Ljava/lang/Object;

    .line 275
    sput-object v10, Lс;->ε:Lс;

    .line 276
    :cond_65
    sget-object v13, Lс;->ε:Lс;

    .line 277
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    invoke-virtual {v13, v8}, Lс;->Β(Ljava/lang/String;)V

    :goto_2f
    if-nez v13, :cond_66

    goto/16 :goto_0

    .line 279
    :cond_66
    invoke-virtual {v2, v9}, Ll1;->π(Lbs1;)I

    move-result v5

    if-ne v5, v7, :cond_68

    if-eqz v1, :cond_67

    const/4 v5, 0x0

    goto :goto_30

    .line 280
    :cond_67
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v5

    :cond_68
    :goto_30
    if-eqz v1, :cond_69

    .line 281
    invoke-virtual {v13, v5}, Lр;->ζ(I)[I

    move-result-object v5

    goto :goto_31

    :cond_69
    invoke-virtual {v13, v5}, Lр;->ψ(I)[I

    move-result-object v5

    :goto_31
    if-nez v5, :cond_6a

    goto/16 :goto_0

    :cond_6a
    const/16 v18, 0x0

    .line 282
    aget v6, v5, v18

    .line 283
    aget v13, v5, v15

    if-eqz v3, :cond_6e

    .line 284
    sget-object v3, Lfs1;->α:Lis1;

    .line 285
    invoke-virtual {v11, v3}, Lb21;->γ(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6e

    .line 286
    sget-object v3, Lfs1;->Ζ:Lis1;

    .line 287
    invoke-virtual {v11, v3}, Lb21;->γ(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6e

    .line 288
    invoke-virtual {v2, v9}, Ll1;->ρ(Lbs1;)I

    move-result v3

    if-ne v3, v7, :cond_6c

    if-eqz v1, :cond_6b

    move v3, v6

    goto :goto_32

    :cond_6b
    move v3, v13

    :cond_6c
    :goto_32
    if-eqz v1, :cond_6d

    move v5, v13

    goto :goto_34

    :cond_6d
    move v5, v6

    goto :goto_34

    :cond_6e
    if-eqz v1, :cond_6f

    move v3, v13

    goto :goto_33

    :cond_6f
    move v3, v6

    :goto_33
    move v5, v3

    :goto_34
    if-eqz v1, :cond_70

    move v10, v4

    goto :goto_35

    :cond_70
    move v10, v12

    .line 289
    :goto_35
    new-instance v8, Lg1;

    move v1, v15

    .line 290
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v14

    move v11, v0

    move v12, v6

    .line 291
    invoke-direct/range {v8 .. v15}, Lg1;-><init>(Lbs1;IIIIJ)V

    .line 292
    iput-object v8, v2, Ll1;->Β:Lg1;

    .line 293
    invoke-virtual {v2, v9, v3, v5, v1}, Ll1;->Θ(Lbs1;IIZ)Z

    return v1

    :cond_71
    move v1, v15

    .line 294
    iget v3, v2, Ll1;->ο:I

    if-ne v3, v0, :cond_72

    move v15, v1

    goto :goto_36

    :cond_72
    const/4 v15, 0x0

    :goto_36
    if-eqz v15, :cond_0

    .line 295
    iput v13, v2, Ll1;->ο:I

    .line 296
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    const/high16 v3, 0x10000

    const/16 v4, 0xc

    const/4 v5, 0x0

    .line 297
    invoke-static {v2, v0, v3, v5, v4}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    return v1

    :cond_73
    move v1, v15

    .line 298
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_74

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v3

    if-eqz v3, :cond_74

    move v15, v1

    goto :goto_37

    :cond_74
    const/4 v15, 0x0

    :goto_37
    if-nez v15, :cond_75

    goto/16 :goto_0

    .line 299
    :cond_75
    iget v3, v2, Ll1;->ο:I

    if-ne v3, v0, :cond_76

    move v15, v1

    goto :goto_38

    :cond_76
    const/4 v15, 0x0

    :goto_38
    if-nez v15, :cond_0

    if-eq v3, v13, :cond_77

    const/high16 v4, 0x10000

    const/16 v6, 0xc

    const/4 v7, 0x0

    .line 300
    invoke-static {v2, v3, v4, v7, v6}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    goto :goto_39

    :cond_77
    const/16 v6, 0xc

    const/4 v7, 0x0

    .line 301
    :goto_39
    iput v0, v2, Ll1;->ο:I

    .line 302
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    const v3, 0x8000

    .line 303
    invoke-static {v2, v0, v3, v7, v6}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    return v1

    :goto_3a
    return v18

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
