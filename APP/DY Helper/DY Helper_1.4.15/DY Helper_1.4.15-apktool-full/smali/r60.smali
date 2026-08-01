.class public final Lr60;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final ε:Lb70;


# direct methods
.method public constructor <init>(Lb70;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr60;->ε:Lb70;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 16

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const-class v3, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    move-object/from16 v4, p0

    .line 18
    .line 19
    iget-object v4, v4, Lr60;->ε:Lb70;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    new-instance v0, Landroidx/fragment/app/FragmentContainerView;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v4}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lb70;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    const-string v3, "fragment"

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v3, 0x0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_9

    .line 39
    .line 40
    :cond_1
    const-string v0, "class"

    .line 41
    .line 42
    invoke-interface {v2, v3, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v5, Lik1;->α:[I

    .line 47
    .line 48
    invoke-virtual {v1, v2, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/4 v6, 0x0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_2
    const/4 v7, 0x1

    .line 60
    const/4 v8, -0x1

    .line 61
    invoke-virtual {v5, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    const/4 v10, 0x2

    .line 66
    invoke-virtual {v5, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    .line 72
    .line 73
    if-eqz v0, :cond_16

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    :try_start_0
    invoke-static {v5, v0}, Lw60;->β(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    const-class v12, Ln60;

    .line 84
    .line 85
    invoke-virtual {v12, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 86
    .line 87
    .line 88
    move-result v5
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    goto :goto_0

    .line 90
    :catch_0
    move v5, v6

    .line 91
    :goto_0
    if-nez v5, :cond_3

    .line 92
    .line 93
    goto/16 :goto_9

    .line 94
    .line 95
    :cond_3
    if-eqz p1, :cond_4

    .line 96
    .line 97
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    :cond_4
    if-ne v6, v8, :cond_6

    .line 102
    .line 103
    if-ne v9, v8, :cond_6

    .line 104
    .line 105
    if-eqz v11, :cond_5

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 109
    .line 110
    invoke-interface {v2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    new-instance v3, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v2, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    .line 123
    .line 124
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v1

    .line 138
    :cond_6
    :goto_1
    if-eq v9, v8, :cond_7

    .line 139
    .line 140
    invoke-virtual {v4, v9}, Lb70;->Β(I)Ln60;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    goto :goto_2

    .line 145
    :cond_7
    move-object v5, v3

    .line 146
    :goto_2
    if-nez v5, :cond_c

    .line 147
    .line 148
    if-eqz v11, :cond_c

    .line 149
    .line 150
    iget-object v5, v4, Lb70;->γ:Li0;

    .line 151
    .line 152
    iget-object v12, v5, Li0;->ζ:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v12, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    sub-int/2addr v13, v7

    .line 161
    :goto_3
    if-ltz v13, :cond_9

    .line 162
    .line 163
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    check-cast v14, Ln60;

    .line 168
    .line 169
    if-eqz v14, :cond_8

    .line 170
    .line 171
    iget-object v15, v14, Ln60;->Δ:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    if-eqz v15, :cond_8

    .line 178
    .line 179
    move-object v5, v14

    .line 180
    goto :goto_4

    .line 181
    :cond_8
    add-int/lit8 v13, v13, -0x1

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_9
    iget-object v5, v5, Li0;->η:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v5, Ljava/util/HashMap;

    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    :cond_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    if-eqz v12, :cond_b

    .line 201
    .line 202
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    check-cast v12, Li70;

    .line 207
    .line 208
    if-eqz v12, :cond_a

    .line 209
    .line 210
    iget-object v12, v12, Li70;->γ:Ln60;

    .line 211
    .line 212
    iget-object v13, v12, Ln60;->Δ:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    if-eqz v13, :cond_a

    .line 219
    .line 220
    move-object v5, v12

    .line 221
    goto :goto_4

    .line 222
    :cond_b
    move-object v5, v3

    .line 223
    :cond_c
    :goto_4
    if-nez v5, :cond_d

    .line 224
    .line 225
    if-eq v6, v8, :cond_d

    .line 226
    .line 227
    invoke-virtual {v4, v6}, Lb70;->Β(I)Ln60;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    :cond_d
    const-string v8, "Fragment "

    .line 232
    .line 233
    const-string v12, "FragmentManager"

    .line 234
    .line 235
    if-nez v5, :cond_11

    .line 236
    .line 237
    invoke-virtual {v4}, Lb70;->Δ()Lw60;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v0}, Lw60;->α(Ljava/lang/String;)Ln60;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    iput-boolean v7, v5, Ln60;->ρ:Z

    .line 249
    .line 250
    if-eqz v9, :cond_e

    .line 251
    .line 252
    move v1, v9

    .line 253
    goto :goto_5

    .line 254
    :cond_e
    move v1, v6

    .line 255
    :goto_5
    iput v1, v5, Ln60;->Β:I

    .line 256
    .line 257
    iput v6, v5, Ln60;->Γ:I

    .line 258
    .line 259
    iput-object v11, v5, Ln60;->Δ:Ljava/lang/String;

    .line 260
    .line 261
    iput-boolean v7, v5, Ln60;->σ:Z

    .line 262
    .line 263
    iput-object v4, v5, Ln60;->χ:Lb70;

    .line 264
    .line 265
    iget-object v1, v4, Lb70;->υ:Lp60;

    .line 266
    .line 267
    iput-object v1, v5, Ln60;->ψ:Lp60;

    .line 268
    .line 269
    iget-object v2, v1, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 270
    .line 271
    iput-boolean v7, v5, Ln60;->Ι:Z

    .line 272
    .line 273
    if-nez v1, :cond_f

    .line 274
    .line 275
    move-object v1, v3

    .line 276
    goto :goto_6

    .line 277
    :cond_f
    iget-object v1, v1, Lp60;->φ:Landroidx/fragment/app/FragmentActivity;

    .line 278
    .line 279
    :goto_6
    if-eqz v1, :cond_10

    .line 280
    .line 281
    iput-boolean v7, v5, Ln60;->Ι:Z

    .line 282
    .line 283
    :cond_10
    invoke-virtual {v4, v5}, Lb70;->α(Ln60;)Li70;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-static {v10}, Lb70;->Η(I)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eqz v2, :cond_14

    .line 292
    .line 293
    new-instance v2, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string v4, " has been inflated via the <fragment> tag: id=0x"

    .line 302
    .line 303
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-static {v12, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 318
    .line 319
    .line 320
    goto :goto_8

    .line 321
    :cond_11
    iget-boolean v1, v5, Ln60;->σ:Z

    .line 322
    .line 323
    if-nez v1, :cond_15

    .line 324
    .line 325
    iput-boolean v7, v5, Ln60;->σ:Z

    .line 326
    .line 327
    iput-object v4, v5, Ln60;->χ:Lb70;

    .line 328
    .line 329
    iget-object v1, v4, Lb70;->υ:Lp60;

    .line 330
    .line 331
    iput-object v1, v5, Ln60;->ψ:Lp60;

    .line 332
    .line 333
    iget-object v2, v1, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 334
    .line 335
    iput-boolean v7, v5, Ln60;->Ι:Z

    .line 336
    .line 337
    if-nez v1, :cond_12

    .line 338
    .line 339
    move-object v1, v3

    .line 340
    goto :goto_7

    .line 341
    :cond_12
    iget-object v1, v1, Lp60;->φ:Landroidx/fragment/app/FragmentActivity;

    .line 342
    .line 343
    :goto_7
    if-eqz v1, :cond_13

    .line 344
    .line 345
    iput-boolean v7, v5, Ln60;->Ι:Z

    .line 346
    .line 347
    :cond_13
    invoke-virtual {v4, v5}, Lb70;->ζ(Ln60;)Li70;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-static {v10}, Lb70;->Η(I)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-eqz v2, :cond_14

    .line 356
    .line 357
    new-instance v2, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    const-string v4, "Retained Fragment "

    .line 360
    .line 361
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    const-string v4, " has been re-attached via the <fragment> tag: id=0x"

    .line 368
    .line 369
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-static {v12, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 384
    .line 385
    .line 386
    :cond_14
    :goto_8
    move-object/from16 v2, p1

    .line 387
    .line 388
    check-cast v2, Landroid/view/ViewGroup;

    .line 389
    .line 390
    sget-object v4, Lk70;->α:Lj70;

    .line 391
    .line 392
    new-instance v4, Lg70;

    .line 393
    .line 394
    new-instance v6, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    const-string v7, "Attempting to use <fragment> tag to add fragment "

    .line 397
    .line 398
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    const-string v7, " to container "

    .line 405
    .line 406
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v6

    .line 416
    invoke-direct {v4, v5, v6}, Lg70;-><init>(Ln60;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-static {v4}, Lk70;->β(Lg70;)V

    .line 420
    .line 421
    .line 422
    invoke-static {v5}, Lk70;->α(Ln60;)Lj70;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    iput-object v2, v5, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 430
    .line 431
    invoke-virtual {v1}, Li70;->κ()V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1}, Li70;->ι()V

    .line 435
    .line 436
    .line 437
    const-string v1, " did not create a view."

    .line 438
    .line 439
    invoke-static {v8, v0, v1}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    return-object v3

    .line 447
    :cond_15
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 448
    .line 449
    invoke-interface {v2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    new-instance v5, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    const-string v2, ": Duplicate id 0x"

    .line 470
    .line 471
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    const-string v2, ", tag "

    .line 478
    .line 479
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    const-string v2, ", or parent id 0x"

    .line 486
    .line 487
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    const-string v2, " with another fragment for "

    .line 494
    .line 495
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    throw v1

    .line 509
    :cond_16
    :goto_9
    return-object v3
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 510
    invoke-virtual {p0, v0, p1, p2, p3}, Lr60;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method
