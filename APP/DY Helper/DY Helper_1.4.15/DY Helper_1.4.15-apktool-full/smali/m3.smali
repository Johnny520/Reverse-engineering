.class public final synthetic Lm3;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lm3;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lm3;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lm3;->η:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lm3;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lm3;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/16 v3, 0xa

    .line 7
    .line 8
    const/16 v5, 0x10

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    sget-object v8, Ls62;->α:Ls62;

    .line 13
    .line 14
    iget-object v9, v0, Lm3;->θ:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v10, v0, Lm3;->η:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v0, v0, Lm3;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v0, Ljava/lang/ClassLoader;

    .line 24
    .line 25
    check-cast v10, Ljava/lang/Class;

    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object v2, Lry1;->α:Lry1;

    .line 35
    .line 36
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v1, v0, v10, v2}, Lry1;->о(Ljava/lang/reflect/Method;Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :pswitch_0
    move-object v2, v0

    .line 50
    check-cast v2, Landroid/app/Activity;

    .line 51
    .line 52
    move-object v4, v10

    .line 53
    check-cast v4, Landroid/graphics/Bitmap;

    .line 54
    .line 55
    move-object v5, v9

    .line 56
    check-cast v5, Lum1;

    .line 57
    .line 58
    move-object/from16 v3, p1

    .line 59
    .line 60
    check-cast v3, Landroid/graphics/Bitmap;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v0, Ljava/lang/Thread;

    .line 66
    .line 67
    new-instance v1, Lvg0;

    .line 68
    .line 69
    const/4 v6, 0x6

    .line 70
    invoke-direct/range {v1 .. v6}, Lvg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 77
    .line 78
    .line 79
    return-object v8

    .line 80
    :pswitch_1
    check-cast v0, La80;

    .line 81
    .line 82
    check-cast v10, [Ljava/lang/String;

    .line 83
    .line 84
    check-cast v9, Landroid/app/Activity;

    .line 85
    .line 86
    move-object/from16 v1, p1

    .line 87
    .line 88
    check-cast v1, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    sget-object v2, Lbv1;->α:Lbv1;

    .line 95
    .line 96
    const-string v2, "comment_audio_download_trigger_mode"

    .line 97
    .line 98
    invoke-static {v2, v1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    aget-object v1, v10, v1

    .line 102
    .line 103
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    const-string v0, "\u8bc4\u8bba\u8bed\u97f3\u4e0b\u8f7d\u65b9\u6848\u5df2\u66f4\u65b0\uff0c\u91cd\u65b0\u6253\u5f00\u8bc4\u8bba\u533a\u540e\u751f\u6548"

    .line 107
    .line 108
    invoke-static {v9, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 113
    .line 114
    .line 115
    return-object v8

    .line 116
    :pswitch_2
    check-cast v0, Lsm1;

    .line 117
    .line 118
    check-cast v10, La80;

    .line 119
    .line 120
    check-cast v9, [Ljava/lang/String;

    .line 121
    .line 122
    move-object/from16 v1, p1

    .line 123
    .line 124
    check-cast v1, Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    iput v1, v0, Lsm1;->ε:I

    .line 131
    .line 132
    sget-object v0, Lbv1;->α:Lbv1;

    .line 133
    .line 134
    const-string v0, "feed_preload_quality"

    .line 135
    .line 136
    invoke-static {v0, v1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 137
    .line 138
    .line 139
    aget-object v0, v9, v1

    .line 140
    .line 141
    invoke-interface {v10, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    return-object v8

    .line 145
    :pswitch_3
    check-cast v0, Landroid/app/Activity;

    .line 146
    .line 147
    check-cast v10, [Ljava/lang/String;

    .line 148
    .line 149
    check-cast v9, Lsm1;

    .line 150
    .line 151
    move-object/from16 v1, p1

    .line 152
    .line 153
    check-cast v1, La80;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    sget-object v2, Lbv1;->α:Lbv1;

    .line 159
    .line 160
    iget v2, v9, Lsm1;->ε:I

    .line 161
    .line 162
    new-instance v4, Lm3;

    .line 163
    .line 164
    invoke-direct {v4, v9, v1, v10, v3}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 165
    .line 166
    .line 167
    const-string v1, "\u9009\u62e9\u9884\u52a0\u8f7d\u6e05\u6670\u5ea6"

    .line 168
    .line 169
    invoke-static {v0, v1, v10, v2, v4}, Lbv1;->Ω(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILa80;)V

    .line 170
    .line 171
    .line 172
    return-object v8

    .line 173
    :pswitch_4
    check-cast v0, Ljava/util/ArrayList;

    .line 174
    .line 175
    check-cast v10, Lck1;

    .line 176
    .line 177
    check-cast v9, Ljava/lang/ClassLoader;

    .line 178
    .line 179
    move-object/from16 v1, p1

    .line 180
    .line 181
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 187
    .line 188
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 189
    .line 190
    .line 191
    sget-object v4, Lck1;->ε:Ljava/util/Set;

    .line 192
    .line 193
    check-cast v4, Ljava/lang/Iterable;

    .line 194
    .line 195
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    :catchall_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-eqz v6, :cond_0

    .line 204
    .line 205
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    check-cast v6, Ljava/lang/String;

    .line 210
    .line 211
    :try_start_0
    new-instance v7, Lyh0;

    .line 212
    .line 213
    invoke-direct {v7, v6, v5}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v7}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(La80;)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-static {v3, v6, v9}, Lck1;->α(Ljava/util/LinkedHashSet;Lorg/luckypray/dexkit/result/ClassDataList;Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    .line 222
    .line 223
    goto :goto_0

    .line 224
    :cond_0
    const-string v4, "PublishButton"

    .line 225
    .line 226
    const-string v5, "setPublishViewAlpha:"

    .line 227
    .line 228
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    const-string v5, "HomePage_Main_Shoot"

    .line 233
    .line 234
    filled-new-array {v5}, [Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    const-string v6, "HomeShotDynamicIconAbility"

    .line 239
    .line 240
    filled-new-array {v6}, [Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    const-string v7, "PublishStickerViewAbility"

    .line 245
    .line 246
    filled-new-array {v7}, [Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    const-string v8, "PUBLISH"

    .line 251
    .line 252
    filled-new-array {v8}, [Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    filled-new-array {v4, v5, v6, v7, v8}, [[Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-static {v4}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    :catchall_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-eqz v5, :cond_1

    .line 273
    .line 274
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    check-cast v5, [Ljava/lang/String;

    .line 279
    .line 280
    :try_start_1
    new-instance v6, Lzi;

    .line 281
    .line 282
    invoke-direct {v6, v5, v2}, Lzi;-><init>([Ljava/lang/String;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v6}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-static {v3, v5, v9}, Lck1;->β(Ljava/util/LinkedHashSet;Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 290
    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-eqz v3, :cond_3

    .line 307
    .line 308
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    move-object v4, v3

    .line 313
    check-cast v4, Ljava/lang/Class;

    .line 314
    .line 315
    invoke-static {v4}, Lck1;->ε(Ljava/lang/Class;)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-eqz v4, :cond_2

    .line 320
    .line 321
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    goto :goto_2

    .line 325
    :cond_3
    new-instance v2, Lib1;

    .line 326
    .line 327
    const/16 v3, 0x19

    .line 328
    .line 329
    invoke-direct {v2, v3, v10}, Lib1;-><init>(ILjava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v1, v2}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    new-instance v2, Ljava/util/HashSet;

    .line 337
    .line 338
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 339
    .line 340
    .line 341
    new-instance v3, Ljava/util/ArrayList;

    .line 342
    .line 343
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 344
    .line 345
    .line 346
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    if-eqz v4, :cond_5

    .line 355
    .line 356
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    move-object v5, v4

    .line 361
    check-cast v5, Ljava/lang/Class;

    .line 362
    .line 363
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    if-eqz v5, :cond_4

    .line 372
    .line 373
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    goto :goto_3

    .line 377
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    if-nez v1, :cond_6

    .line 382
    .line 383
    move-object v0, v3

    .line 384
    :cond_6
    return-object v0

    .line 385
    :pswitch_5
    check-cast v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;

    .line 386
    .line 387
    check-cast v10, Lce1;

    .line 388
    .line 389
    check-cast v9, Ljava/lang/String;

    .line 390
    .line 391
    move-object/from16 v1, p1

    .line 392
    .line 393
    check-cast v1, Ljava/lang/Integer;

    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    iget-object v0, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->κ:Ljava/util/List;

    .line 400
    .line 401
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    iget-object v2, v10, Lce1;->γ:Ljava/util/List;

    .line 406
    .line 407
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    new-instance v2, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    const-string v0, " "

    .line 420
    .line 421
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    return-object v0

    .line 435
    :pswitch_6
    check-cast v0, Landroid/app/Activity;

    .line 436
    .line 437
    check-cast v10, Landroid/view/View;

    .line 438
    .line 439
    move-object v11, v9

    .line 440
    check-cast v11, Lod;

    .line 441
    .line 442
    move-object/from16 v1, p1

    .line 443
    .line 444
    check-cast v1, Ldc1;

    .line 445
    .line 446
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    invoke-static {v0, v10, v6}, Lxn0;->З(Landroid/app/Activity;Landroid/view/View;Z)Z

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    if-eqz v2, :cond_7

    .line 454
    .line 455
    goto :goto_4

    .line 456
    :cond_7
    invoke-static {v0, v10, v1}, Lxn0;->Ξ(Landroid/app/Activity;Landroid/view/View;Ldc1;)Z

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    if-nez v2, :cond_8

    .line 461
    .line 462
    :goto_4
    move-object/from16 v23, v8

    .line 463
    .line 464
    goto/16 :goto_10

    .line 465
    .line 466
    :cond_8
    invoke-virtual {v1}, Ldc1;->α()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-static {v0, v10, v1}, Lxn0;->т(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    sget-object v1, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 474
    .line 475
    new-instance v15, Lbb1;

    .line 476
    .line 477
    const-string v1, "pet_elf_camp_daily_harvest_limit"

    .line 478
    .line 479
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    invoke-interface {v2, v1, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 484
    .line 485
    .line 486
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 487
    goto :goto_5

    .line 488
    :catchall_2
    move v1, v7

    .line 489
    :goto_5
    const/16 v2, 0x64

    .line 490
    .line 491
    invoke-static {v1, v7, v2}, Lj81;->μ(III)I

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    const-string v9, "pet_elf_camp_daily_plant_limit"

    .line 496
    .line 497
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 498
    .line 499
    .line 500
    move-result-object v12

    .line 501
    invoke-interface {v12, v9, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 502
    .line 503
    .line 504
    move-result v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 505
    goto :goto_6

    .line 506
    :catchall_3
    move v9, v7

    .line 507
    :goto_6
    invoke-static {v9, v7, v2}, Lj81;->μ(III)I

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    const-string v9, "pet_elf_camp_operation_interval_seconds"

    .line 512
    .line 513
    const/4 v12, 0x3

    .line 514
    :try_start_4
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 515
    .line 516
    .line 517
    move-result-object v13

    .line 518
    invoke-interface {v13, v9, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 519
    .line 520
    .line 521
    move-result v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 522
    :catchall_4
    const/16 v9, 0x3c

    .line 523
    .line 524
    invoke-static {v12, v7, v9}, Lj81;->μ(III)I

    .line 525
    .line 526
    .line 527
    move-result v9

    .line 528
    int-to-long v12, v9

    .line 529
    const-wide/16 v16, 0x3e8

    .line 530
    .line 531
    mul-long v12, v12, v16

    .line 532
    .line 533
    invoke-direct {v15, v1, v2, v12, v13}, Lbb1;-><init>(IIJ)V

    .line 534
    .line 535
    .line 536
    sget-object v1, Lxn0;->ο:Lxn0;

    .line 537
    .line 538
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 539
    .line 540
    .line 541
    move-result-wide v12

    .line 542
    invoke-virtual {v1, v12, v13}, Lxn0;->Φ(J)Lrc1;

    .line 543
    .line 544
    .line 545
    move-result-object v16

    .line 546
    invoke-static {}, Ljc1;->κ()Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object v12

    .line 550
    invoke-static {}, Lv81;->ι()Lqd;

    .line 551
    .line 552
    .line 553
    move-result-object v13

    .line 554
    sget-object v1, Lkd1;->α:Lkd1;

    .line 555
    .line 556
    invoke-virtual {v1}, Lkd1;->ε()Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v14

    .line 560
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 561
    .line 562
    .line 563
    move-result-wide v17

    .line 564
    invoke-static/range {v11 .. v18}, Ljc1;->γ(Lod;Ljava/util/List;Lqd;Ljava/util/List;Lbb1;Lrc1;J)Lbc1;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    iget-object v2, v1, Lbc1;->α:Ljava/util/ArrayList;

    .line 569
    .line 570
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    iget v9, v1, Lbc1;->β:I

    .line 575
    .line 576
    iget-wide v12, v1, Lbc1;->γ:J

    .line 577
    .line 578
    iget-object v14, v1, Lbc1;->δ:Ljava/util/LinkedHashSet;

    .line 579
    .line 580
    iget-object v15, v1, Lbc1;->ε:Ljava/util/ArrayList;

    .line 581
    .line 582
    iget v6, v1, Lbc1;->η:I

    .line 583
    .line 584
    iget v5, v1, Lbc1;->θ:I

    .line 585
    .line 586
    const/16 v21, 0x0

    .line 587
    .line 588
    iget v4, v1, Lbc1;->ι:I

    .line 589
    .line 590
    iget-object v1, v1, Lbc1;->κ:Ljava/lang/Integer;

    .line 591
    .line 592
    if-eqz v2, :cond_9

    .line 593
    .line 594
    if-nez v9, :cond_a

    .line 595
    .line 596
    :cond_9
    move-object v2, v0

    .line 597
    move-object/from16 p0, v1

    .line 598
    .line 599
    move-object/from16 v23, v8

    .line 600
    .line 601
    goto/16 :goto_b

    .line 602
    .line 603
    :cond_a
    new-instance v7, Ljava/lang/StringBuilder;

    .line 604
    .line 605
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 606
    .line 607
    .line 608
    const-string v3, " \u4f4d\u4eba\u5458\u3001"

    .line 609
    .line 610
    move-object/from16 p0, v1

    .line 611
    .line 612
    const-string v1, " \u5757\u5730"

    .line 613
    .line 614
    move-object/from16 v23, v8

    .line 615
    .line 616
    const-string v8, "\u672c\u6b21\u5c06\u5904\u7406 "

    .line 617
    .line 618
    invoke-static {v8, v2, v3, v9, v1}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    sget-object v1, Lod;->ζ:Lod;

    .line 626
    .line 627
    if-ne v11, v1, :cond_16

    .line 628
    .line 629
    new-instance v1, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    const-string v2, "\n\u9884\u8ba1\u6d88\u8017\u91d1\u5e01\uff1a"

    .line 632
    .line 633
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    const/16 v19, 0x0

    .line 647
    .line 648
    const/16 v20, 0x3f

    .line 649
    .line 650
    move-object v1, v15

    .line 651
    const/4 v15, 0x0

    .line 652
    const/16 v16, 0x0

    .line 653
    .line 654
    const/16 v17, 0x0

    .line 655
    .line 656
    const/16 v18, 0x0

    .line 657
    .line 658
    invoke-static/range {v14 .. v20}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 663
    .line 664
    .line 665
    move-result v3

    .line 666
    if-eqz v3, :cond_b

    .line 667
    .line 668
    const-string v2, "\u65e0\u6709\u6548\u9009\u62e9"

    .line 669
    .line 670
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 671
    .line 672
    const-string v8, "\n\u672c\u6b21\u79cd\u5b50\uff1a"

    .line 673
    .line 674
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    const-string v2, "\n\n\u9010\u4f1a\u8bdd\u79cd\u690d\u8ba1\u5212\uff1a"

    .line 688
    .line 689
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    const/4 v2, 0x0

    .line 697
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    if-eqz v3, :cond_16

    .line 702
    .line 703
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    add-int/lit8 v8, v2, 0x1

    .line 708
    .line 709
    if-ltz v2, :cond_15

    .line 710
    .line 711
    check-cast v3, Lfc1;

    .line 712
    .line 713
    iget-object v2, v3, Lfc1;->θ:Ljava/lang/Long;

    .line 714
    .line 715
    const-string v9, "\u672a\u77e5"

    .line 716
    .line 717
    if-eqz v2, :cond_c

    .line 718
    .line 719
    invoke-virtual {v2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    if-nez v2, :cond_d

    .line 724
    .line 725
    :cond_c
    move-object v2, v9

    .line 726
    :cond_d
    iget-object v12, v3, Lfc1;->ι:Ljava/lang/Long;

    .line 727
    .line 728
    if-eqz v12, :cond_e

    .line 729
    .line 730
    invoke-virtual {v12}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v12

    .line 734
    if-nez v12, :cond_f

    .line 735
    .line 736
    :cond_e
    move-object v12, v9

    .line 737
    :cond_f
    iget-object v13, v3, Lfc1;->ζ:Ljava/lang/Integer;

    .line 738
    .line 739
    if-eqz v13, :cond_10

    .line 740
    .line 741
    invoke-virtual {v13}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v13

    .line 745
    if-nez v13, :cond_11

    .line 746
    .line 747
    :cond_10
    move-object v13, v9

    .line 748
    :cond_11
    iget-object v14, v3, Lfc1;->η:Ljava/lang/Integer;

    .line 749
    .line 750
    if-eqz v14, :cond_13

    .line 751
    .line 752
    invoke-virtual {v14}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v14

    .line 756
    if-nez v14, :cond_12

    .line 757
    .line 758
    goto :goto_8

    .line 759
    :cond_12
    move-object v9, v14

    .line 760
    :cond_13
    :goto_8
    iget-object v14, v3, Lfc1;->β:Ljava/lang/String;

    .line 761
    .line 762
    const/16 v15, 0xd

    .line 763
    .line 764
    move-object/from16 p1, v1

    .line 765
    .line 766
    const/16 v1, 0x20

    .line 767
    .line 768
    invoke-virtual {v14, v15, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v14

    .line 772
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    const/16 v15, 0xa

    .line 776
    .line 777
    invoke-virtual {v14, v15, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v1

    .line 792
    const/16 v14, 0x30

    .line 793
    .line 794
    invoke-static {v1, v14}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 799
    .line 800
    .line 801
    move-result v14

    .line 802
    if-eqz v14, :cond_14

    .line 803
    .line 804
    const-string v1, "\u672a\u547d\u540d\u4f1a\u8bdd"

    .line 805
    .line 806
    :cond_14
    new-instance v14, Ljava/lang/StringBuilder;

    .line 807
    .line 808
    const-string v15, "\n"

    .line 809
    .line 810
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    const-string v15, ". "

    .line 817
    .line 818
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 829
    .line 830
    .line 831
    iget-object v1, v3, Lfc1;->κ:Ljava/lang/String;

    .line 832
    .line 833
    iget-object v14, v3, Lfc1;->δ:Ljava/lang/String;

    .line 834
    .line 835
    iget v15, v3, Lfc1;->γ:I

    .line 836
    .line 837
    iget v3, v3, Lfc1;->ε:I

    .line 838
    .line 839
    move/from16 v16, v8

    .line 840
    .line 841
    const-string v8, " \u00b7 "

    .line 842
    .line 843
    move-object/from16 v17, v10

    .line 844
    .line 845
    const-string v10, " (#"

    .line 846
    .line 847
    move-object/from16 v18, v0

    .line 848
    .line 849
    const-string v0, "\n   "

    .line 850
    .line 851
    invoke-static {v0, v1, v8, v14, v10}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 856
    .line 857
    .line 858
    const-string v1, ") \u00d7 "

    .line 859
    .line 860
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 864
    .line 865
    .line 866
    const-string v1, " \u5757"

    .line 867
    .line 868
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 869
    .line 870
    .line 871
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 876
    .line 877
    .line 878
    new-instance v0, Ljava/lang/StringBuilder;

    .line 879
    .line 880
    const-string v1, "\n   \u6295\u5165 "

    .line 881
    .line 882
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 886
    .line 887
    .line 888
    const-string v1, " \u91d1\u5e01\uff08"

    .line 889
    .line 890
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    const-string v1, "/\u5757\uff09 \u00b7 \u9884\u8ba1\u6536\u76ca "

    .line 894
    .line 895
    const-string v2, "\uff08"

    .line 896
    .line 897
    invoke-static {v0, v13, v1, v12, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    const-string v1, "/\u5757\uff09"

    .line 904
    .line 905
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 913
    .line 914
    .line 915
    move-object/from16 v1, p1

    .line 916
    .line 917
    move/from16 v2, v16

    .line 918
    .line 919
    move-object/from16 v10, v17

    .line 920
    .line 921
    move-object/from16 v0, v18

    .line 922
    .line 923
    goto/16 :goto_7

    .line 924
    .line 925
    :cond_15
    invoke-static {}, Lyh;->х()V

    .line 926
    .line 927
    .line 928
    throw v21

    .line 929
    :cond_16
    move-object/from16 v18, v0

    .line 930
    .line 931
    move-object/from16 v17, v10

    .line 932
    .line 933
    sget-object v0, Lod;->η:Lod;

    .line 934
    .line 935
    if-eq v11, v0, :cond_18

    .line 936
    .line 937
    if-eqz p0, :cond_17

    .line 938
    .line 939
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Number;->intValue()I

    .line 940
    .line 941
    .line 942
    move-result v0

    .line 943
    const-string v1, "\u5269\u4f59 "

    .line 944
    .line 945
    const-string v2, " \u6b21"

    .line 946
    .line 947
    invoke-static {v1, v0, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    goto :goto_9

    .line 952
    :cond_17
    const-string v0, "\u4e0d\u9650\u5236"

    .line 953
    .line 954
    :goto_9
    const-string v1, "\n\u4eca\u65e5\u9650\u989d\uff1a"

    .line 955
    .line 956
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 961
    .line 962
    .line 963
    :cond_18
    add-int v0, v5, v4

    .line 964
    .line 965
    if-gtz v0, :cond_19

    .line 966
    .line 967
    if-lez v6, :cond_1a

    .line 968
    .line 969
    :cond_19
    const-string v0, " \u4eba\uff0c\u65e0\u5019\u9009 "

    .line 970
    .line 971
    const-string v1, " \u4eba\uff0c\u89c4\u5219\u5173\u95ed "

    .line 972
    .line 973
    const-string v2, "\n\u672a\u7eb3\u5165\uff1a\u4e0d\u53ef\u7528 "

    .line 974
    .line 975
    invoke-static {v2, v5, v0, v4, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 980
    .line 981
    .line 982
    const-string v1, " \u4eba"

    .line 983
    .line 984
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 985
    .line 986
    .line 987
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 992
    .line 993
    .line 994
    :cond_1a
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    sget-object v1, Lx01;->α:Lx01;

    .line 999
    .line 1000
    move-object/from16 v2, v18

    .line 1001
    .line 1002
    invoke-virtual {v1, v2}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    const v3, 0x7f0c0030

    .line 1007
    .line 1008
    .line 1009
    move-object/from16 v4, v21

    .line 1010
    .line 1011
    const/4 v5, 0x0

    .line 1012
    invoke-virtual {v1, v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v1

    .line 1016
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 1020
    .line 1021
    invoke-direct {v3, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v3, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v3

    .line 1028
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v3

    .line 1032
    invoke-static {v2}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v4

    .line 1036
    iget-object v5, v4, Lxx;->β:Ljava/lang/String;

    .line 1037
    .line 1038
    const/16 v6, 0x10

    .line 1039
    .line 1040
    invoke-static {v6, v2, v5}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v5

    .line 1044
    invoke-virtual {v1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1045
    .line 1046
    .line 1047
    const v5, 0x7f09007a

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v5

    .line 1054
    iget-object v6, v4, Lxx;->γ:Ljava/lang/String;

    .line 1055
    .line 1056
    const/16 v7, 0xc

    .line 1057
    .line 1058
    invoke-static {v7, v2, v6}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v6

    .line 1062
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1063
    .line 1064
    .line 1065
    invoke-static {v1, v4}, Lxn0;->μ(Landroid/view/View;Lxx;)V

    .line 1066
    .line 1067
    .line 1068
    const v5, 0x7f090079

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v6

    .line 1075
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    check-cast v6, Landroid/widget/Button;

    .line 1079
    .line 1080
    iget-object v8, v4, Lxx;->χ:Ljava/lang/String;

    .line 1081
    .line 1082
    invoke-static {v4}, Lxn0;->о(Lxx;)I

    .line 1083
    .line 1084
    .line 1085
    move-result v9

    .line 1086
    invoke-static {v6, v8, v9}, Lxn0;->Ж(Landroid/widget/Button;Ljava/lang/String;I)V

    .line 1087
    .line 1088
    .line 1089
    const v6, 0x7f09007e

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v8

    .line 1096
    check-cast v8, Landroid/widget/TextView;

    .line 1097
    .line 1098
    invoke-static {v4}, Lxn0;->о(Lxx;)I

    .line 1099
    .line 1100
    .line 1101
    move-result v9

    .line 1102
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1103
    .line 1104
    .line 1105
    const v8, 0x7f09007b

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v9

    .line 1112
    check-cast v9, Landroid/widget/TextView;

    .line 1113
    .line 1114
    invoke-static {v4}, Lxn0;->Б(Lxx;)I

    .line 1115
    .line 1116
    .line 1117
    move-result v10

    .line 1118
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1119
    .line 1120
    .line 1121
    const v9, 0x7f09007c

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v10

    .line 1128
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1129
    .line 1130
    .line 1131
    check-cast v10, Landroid/widget/Button;

    .line 1132
    .line 1133
    iget-object v4, v4, Lxx;->ι:Ljava/lang/String;

    .line 1134
    .line 1135
    const-string v12, "#FFFFFF"

    .line 1136
    .line 1137
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1138
    .line 1139
    .line 1140
    move-result v12

    .line 1141
    invoke-static {v10, v4, v12}, Lxn0;->Ж(Landroid/widget/Button;Ljava/lang/String;I)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v4

    .line 1148
    check-cast v4, Landroid/widget/TextView;

    .line 1149
    .line 1150
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 1151
    .line 1152
    .line 1153
    move-result v6

    .line 1154
    if-eqz v6, :cond_1d

    .line 1155
    .line 1156
    const/4 v10, 0x1

    .line 1157
    if-eq v6, v10, :cond_1c

    .line 1158
    .line 1159
    const/4 v10, 0x2

    .line 1160
    if-ne v6, v10, :cond_1b

    .line 1161
    .line 1162
    const-string v6, "\u786e\u8ba4\u5168\u90e8\u6d47\u6c34"

    .line 1163
    .line 1164
    goto :goto_a

    .line 1165
    :cond_1b
    invoke-static {}, Lγ;->κ()V

    .line 1166
    .line 1167
    .line 1168
    const/4 v4, 0x0

    .line 1169
    goto/16 :goto_11

    .line 1170
    .line 1171
    :cond_1c
    const-string v6, "\u786e\u8ba4\u5168\u90e8\u79cd\u5730"

    .line 1172
    .line 1173
    goto :goto_a

    .line 1174
    :cond_1d
    const-string v6, "\u786e\u8ba4\u4e00\u952e\u6536\u83dc"

    .line 1175
    .line 1176
    :goto_a
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v4

    .line 1183
    check-cast v4, Landroid/widget/TextView;

    .line 1184
    .line 1185
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    check-cast v0, Landroid/widget/Button;

    .line 1193
    .line 1194
    new-instance v4, Lsa;

    .line 1195
    .line 1196
    invoke-direct {v4, v3, v7}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v0

    .line 1206
    check-cast v0, Landroid/widget/Button;

    .line 1207
    .line 1208
    new-instance v1, Lvj;

    .line 1209
    .line 1210
    move-object/from16 v10, v17

    .line 1211
    .line 1212
    invoke-direct {v1, v2, v3, v10, v11}, Lvj;-><init>(Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/View;Lod;)V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    .line 1219
    .line 1220
    .line 1221
    const v0, 0x3f666666    # 0.9f

    .line 1222
    .line 1223
    .line 1224
    const/4 v4, 0x0

    .line 1225
    invoke-static {v2, v3, v0, v4}, Lxn0;->φ(Landroid/app/Activity;Landroid/app/AlertDialog;FLjava/lang/Float;)V

    .line 1226
    .line 1227
    .line 1228
    goto :goto_10

    .line 1229
    :goto_b
    if-nez p0, :cond_1e

    .line 1230
    .line 1231
    goto :goto_d

    .line 1232
    :cond_1e
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Integer;->intValue()I

    .line 1233
    .line 1234
    .line 1235
    move-result v0

    .line 1236
    if-nez v0, :cond_1f

    .line 1237
    .line 1238
    invoke-static {v11}, Lxn0;->κ(Lod;)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    const-string v1, "\u4eca\u65e5"

    .line 1243
    .line 1244
    const-string v3, "\u9650\u989d\u5df2\u7528\u5b8c"

    .line 1245
    .line 1246
    invoke-static {v1, v0, v3}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v0

    .line 1250
    :goto_c
    const/4 v10, 0x1

    .line 1251
    goto :goto_f

    .line 1252
    :cond_1f
    :goto_d
    const-string v0, "\u5f53\u524d\u6ca1\u6709\u53ef\u6267\u884c\u7684"

    .line 1253
    .line 1254
    if-lez v5, :cond_20

    .line 1255
    .line 1256
    invoke-static {v11}, Lxn0;->κ(Lod;)Ljava/lang/String;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v1

    .line 1260
    const-string v3, "\u5730\u5757\uff1b\u65e0\u5c0f\u706b\u4eba\u6216\u65e0\u8425\u5730\u4f1a\u8bdd\u5df2\u6392\u9664"

    .line 1261
    .line 1262
    :goto_e
    invoke-static {v0, v1, v3}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    goto :goto_c

    .line 1267
    :cond_20
    invoke-static {v11}, Lxn0;->κ(Lod;)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v1

    .line 1271
    const-string v3, "\u5730\u5757"

    .line 1272
    .line 1273
    goto :goto_e

    .line 1274
    :goto_f
    invoke-static {v2, v0, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1279
    .line 1280
    .line 1281
    :goto_10
    move-object/from16 v4, v23

    .line 1282
    .line 1283
    :goto_11
    return-object v4

    .line 1284
    :pswitch_7
    move-object/from16 v23, v8

    .line 1285
    .line 1286
    move-object v7, v0

    .line 1287
    check-cast v7, Landroid/app/Activity;

    .line 1288
    .line 1289
    move-object v6, v10

    .line 1290
    check-cast v6, Ljava/util/ArrayList;

    .line 1291
    .line 1292
    check-cast v9, Lfv;

    .line 1293
    .line 1294
    move-object/from16 v11, p1

    .line 1295
    .line 1296
    check-cast v11, Ljava/lang/String;

    .line 1297
    .line 1298
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1299
    .line 1300
    .line 1301
    sget-object v0, Lqy0;->α:Lqy0;

    .line 1302
    .line 1303
    iget-object v12, v9, Lfv;->α:Ljava/lang/String;

    .line 1304
    .line 1305
    invoke-static {v7}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v0}, Lqy0;->ж()I

    .line 1309
    .line 1310
    .line 1311
    move-result v10

    .line 1312
    invoke-static {v7}, Lqy0;->А(Landroid/content/Context;)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v8

    .line 1316
    const-string v0, "notification"

    .line 1317
    .line 1318
    invoke-virtual {v7, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1323
    .line 1324
    .line 1325
    move-object v9, v0

    .line 1326
    check-cast v9, Landroid/app/NotificationManager;

    .line 1327
    .line 1328
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1329
    .line 1330
    .line 1331
    move-result v0

    .line 1332
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1333
    .line 1334
    const-string v2, "\u5171 "

    .line 1335
    .line 1336
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1340
    .line 1341
    .line 1342
    const-string v0, " \u5f20"

    .line 1343
    .line 1344
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v0

    .line 1351
    const-string v1, "\u4fdd\u5b58\u56fe\u7247"

    .line 1352
    .line 1353
    invoke-static {v7, v1, v0}, Lqy0;->б(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1357
    .line 1358
    .line 1359
    move-result v0

    .line 1360
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1361
    .line 1362
    const-string v2, "\u2b07 \u5f00\u59cb\u4fdd\u5b58 "

    .line 1363
    .line 1364
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1368
    .line 1369
    .line 1370
    const-string v0, " \u5f20\u56fe\u7247..."

    .line 1371
    .line 1372
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1373
    .line 1374
    .line 1375
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    invoke-static {v7, v0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1380
    .line 1381
    .line 1382
    new-instance v5, Liy0;

    .line 1383
    .line 1384
    invoke-direct/range {v5 .. v12}, Liy0;-><init>(Ljava/util/ArrayList;Landroid/app/Activity;ZLandroid/app/NotificationManager;ILjava/lang/String;Ljava/lang/String;)V

    .line 1385
    .line 1386
    .line 1387
    const/16 v0, 0x17

    .line 1388
    .line 1389
    const-string v1, "save-bitmaps"

    .line 1390
    .line 1391
    invoke-static {v0, v5, v1}, Lp91;->Ζ(ILp70;Ljava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    return-object v23

    .line 1395
    :pswitch_8
    move-object/from16 v23, v8

    .line 1396
    .line 1397
    check-cast v0, Landroid/app/Activity;

    .line 1398
    .line 1399
    check-cast v10, Lf8;

    .line 1400
    .line 1401
    check-cast v9, Ljava/util/List;

    .line 1402
    .line 1403
    move-object/from16 v1, p1

    .line 1404
    .line 1405
    check-cast v1, Ljava/lang/String;

    .line 1406
    .line 1407
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1408
    .line 1409
    .line 1410
    sget-object v2, Lqy0;->α:Lqy0;

    .line 1411
    .line 1412
    invoke-static {v0, v10, v9, v1}, Lqy0;->Ξ(Landroid/app/Activity;Lf8;Ljava/util/List;Ljava/lang/String;)V

    .line 1413
    .line 1414
    .line 1415
    return-object v23

    .line 1416
    :pswitch_9
    const/4 v4, 0x0

    .line 1417
    move-object v1, v0

    .line 1418
    check-cast v1, Landroid/content/Context;

    .line 1419
    .line 1420
    check-cast v10, Lf8;

    .line 1421
    .line 1422
    check-cast v9, Lfv;

    .line 1423
    .line 1424
    move-object/from16 v2, p1

    .line 1425
    .line 1426
    check-cast v2, Ljava/util/List;

    .line 1427
    .line 1428
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1429
    .line 1430
    .line 1431
    sget-object v0, Lqy0;->α:Lqy0;

    .line 1432
    .line 1433
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1434
    .line 1435
    .line 1436
    move-result v3

    .line 1437
    if-nez v3, :cond_32

    .line 1438
    .line 1439
    new-instance v3, Ljava/util/ArrayList;

    .line 1440
    .line 1441
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1442
    .line 1443
    .line 1444
    invoke-static {v1, v10}, Lqy0;->ζ(Landroid/content/Context;Lf8;)Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v5

    .line 1448
    if-nez v9, :cond_21

    .line 1449
    .line 1450
    sget-object v6, Ljy0;->ι:Ljy0;

    .line 1451
    .line 1452
    invoke-static {v0, v1, v10, v6, v5}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v9

    .line 1456
    :cond_21
    iget-object v5, v9, Lfv;->α:Ljava/lang/String;

    .line 1457
    .line 1458
    iget-object v0, v9, Lfv;->β:Ljava/lang/String;

    .line 1459
    .line 1460
    invoke-static {v0}, Lpu0;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v6

    .line 1464
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v7

    .line 1468
    const/4 v0, 0x0

    .line 1469
    :goto_12
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1470
    .line 1471
    .line 1472
    move-result v8

    .line 1473
    if-eqz v8, :cond_31

    .line 1474
    .line 1475
    const/4 v10, 0x1

    .line 1476
    add-int/lit8 v8, v0, 0x1

    .line 1477
    .line 1478
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v0

    .line 1482
    move-object v9, v0

    .line 1483
    check-cast v9, Lh41;

    .line 1484
    .line 1485
    iget-object v0, v9, Lh41;->α:Ljava/lang/String;

    .line 1486
    .line 1487
    iget-object v11, v9, Lh41;->β:Ljava/lang/String;

    .line 1488
    .line 1489
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1490
    .line 1491
    .line 1492
    move-result v0

    .line 1493
    if-nez v0, :cond_30

    .line 1494
    .line 1495
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1496
    .line 1497
    .line 1498
    move-result v0

    .line 1499
    const/4 v12, 0x6

    .line 1500
    if-gt v0, v10, :cond_22

    .line 1501
    .line 1502
    move-object v10, v6

    .line 1503
    const/4 v13, 0x0

    .line 1504
    goto :goto_14

    .line 1505
    :cond_22
    const-string v0, "."

    .line 1506
    .line 1507
    invoke-static {v12, v6, v0}, Lq02;->и(ILjava/lang/String;Ljava/lang/String;)I

    .line 1508
    .line 1509
    .line 1510
    move-result v10

    .line 1511
    const/4 v13, -0x1

    .line 1512
    if-ne v10, v13, :cond_23

    .line 1513
    .line 1514
    move-object v10, v6

    .line 1515
    const/4 v13, 0x0

    .line 1516
    goto :goto_13

    .line 1517
    :cond_23
    const/4 v13, 0x0

    .line 1518
    invoke-virtual {v6, v13, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v10

    .line 1522
    :goto_13
    const-string v14, "jpg"

    .line 1523
    .line 1524
    invoke-static {v6, v0, v14}, Lq02;->ч(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v14

    .line 1528
    new-instance v15, Ljava/lang/StringBuilder;

    .line 1529
    .line 1530
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 1531
    .line 1532
    .line 1533
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1534
    .line 1535
    .line 1536
    const-string v10, "_official"

    .line 1537
    .line 1538
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1539
    .line 1540
    .line 1541
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v0

    .line 1554
    move-object v10, v0

    .line 1555
    :goto_14
    invoke-static {v1}, Lyh;->Ρ(Landroid/content/Context;)Landroid/net/Uri;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v0

    .line 1559
    if-eqz v0, :cond_24

    .line 1560
    .line 1561
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v0

    .line 1565
    goto :goto_15

    .line 1566
    :cond_24
    move-object v0, v4

    .line 1567
    :goto_15
    if-eqz v0, :cond_25

    .line 1568
    .line 1569
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1570
    .line 1571
    .line 1572
    move-result v14

    .line 1573
    if-eqz v14, :cond_26

    .line 1574
    .line 1575
    :cond_25
    move-object v0, v4

    .line 1576
    :cond_26
    const-string v14, "DYHelper"

    .line 1577
    .line 1578
    if-nez v0, :cond_27

    .line 1579
    .line 1580
    :goto_16
    move-object/from16 p0, v6

    .line 1581
    .line 1582
    move-object/from16 p1, v7

    .line 1583
    .line 1584
    goto/16 :goto_1a

    .line 1585
    .line 1586
    :cond_27
    :try_start_5
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v0

    .line 1590
    invoke-static {v1, v0}, Lcw1;->δ(Landroid/content/Context;Landroid/net/Uri;)Lcw1;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v0

    .line 1594
    invoke-virtual {v0}, Lcw1;->α()Z

    .line 1595
    .line 1596
    .line 1597
    move-result v15

    .line 1598
    if-nez v15, :cond_28

    .line 1599
    .line 1600
    goto :goto_16

    .line 1601
    :cond_28
    invoke-static {v0, v5}, Lqy0;->й(Lcw1;Ljava/lang/String;)Ljava/lang/String;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v15

    .line 1605
    invoke-static {v15}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1606
    .line 1607
    .line 1608
    move-result v16

    .line 1609
    if-nez v16, :cond_2c

    .line 1610
    .line 1611
    const-string v16, "/"

    .line 1612
    .line 1613
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v4

    .line 1617
    invoke-static {v15, v4, v12}, Lq02;->т(Ljava/lang/String;[Ljava/lang/String;I)Ljava/util/List;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v4

    .line 1621
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v4

    .line 1625
    :cond_29
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1626
    .line 1627
    .line 1628
    move-result v12

    .line 1629
    if-eqz v12, :cond_2c

    .line 1630
    .line 1631
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v12

    .line 1635
    check-cast v12, Ljava/lang/String;

    .line 1636
    .line 1637
    invoke-static {v12}, Lku;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v12

    .line 1641
    invoke-virtual {v0, v12}, Lcw1;->β(Ljava/lang/String;)Lcw1;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v0

    .line 1645
    if-eqz v0, :cond_2a

    .line 1646
    .line 1647
    invoke-virtual {v0}, Lcw1;->ε()Z

    .line 1648
    .line 1649
    .line 1650
    move-result v12

    .line 1651
    if-nez v12, :cond_29

    .line 1652
    .line 1653
    goto :goto_17

    .line 1654
    :catchall_5
    move-exception v0

    .line 1655
    move-object/from16 p0, v6

    .line 1656
    .line 1657
    move-object/from16 p1, v7

    .line 1658
    .line 1659
    goto :goto_19

    .line 1660
    :cond_2a
    :goto_17
    move-object/from16 p0, v6

    .line 1661
    .line 1662
    move-object/from16 p1, v7

    .line 1663
    .line 1664
    :cond_2b
    :goto_18
    const/4 v4, 0x0

    .line 1665
    goto :goto_1a

    .line 1666
    :cond_2c
    invoke-static {v10}, Lku;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v4

    .line 1670
    invoke-virtual {v0, v4}, Lcw1;->β(Ljava/lang/String;)Lcw1;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v4

    .line 1674
    if-eqz v4, :cond_2a

    .line 1675
    .line 1676
    iget-object v0, v4, Lcw1;->η:Ljava/lang/Object;

    .line 1677
    .line 1678
    check-cast v0, Landroid/net/Uri;

    .line 1679
    .line 1680
    iget-object v12, v4, Lcw1;->ζ:Ljava/lang/Object;

    .line 1681
    .line 1682
    check-cast v12, Landroid/content/Context;

    .line 1683
    .line 1684
    const-string v15, "mime_type"

    .line 1685
    .line 1686
    invoke-static {v12, v0, v15}, Lbd;->Ν(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v15

    .line 1690
    const-string v13, "vnd.android.document/directory"

    .line 1691
    .line 1692
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1693
    .line 1694
    .line 1695
    move-result v13

    .line 1696
    if-nez v13, :cond_2a

    .line 1697
    .line 1698
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v13

    .line 1702
    if-eqz v13, :cond_2d

    .line 1703
    .line 1704
    goto :goto_17

    .line 1705
    :cond_2d
    const-string v13, "_size"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1706
    .line 1707
    move-object/from16 p0, v6

    .line 1708
    .line 1709
    move-object/from16 p1, v7

    .line 1710
    .line 1711
    const-wide/16 v6, 0x0

    .line 1712
    .line 1713
    :try_start_6
    invoke-static {v12, v0, v13, v6, v7}, Lbd;->Μ(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;J)J

    .line 1714
    .line 1715
    .line 1716
    move-result-wide v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1717
    cmp-long v0, v12, v6

    .line 1718
    .line 1719
    if-lez v0, :cond_2b

    .line 1720
    .line 1721
    goto :goto_1a

    .line 1722
    :catchall_6
    move-exception v0

    .line 1723
    :goto_19
    const-string v4, "[SAF] \u68c0\u67e5\u5df2\u5b58\u5728\u8f93\u51fa\u5931\u8d25"

    .line 1724
    .line 1725
    invoke-static {v14, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1726
    .line 1727
    .line 1728
    goto :goto_18

    .line 1729
    :goto_1a
    const-string v0, ", uri="

    .line 1730
    .line 1731
    if-eqz v4, :cond_2e

    .line 1732
    .line 1733
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1734
    .line 1735
    .line 1736
    iget-object v4, v4, Lcw1;->η:Ljava/lang/Object;

    .line 1737
    .line 1738
    check-cast v4, Landroid/net/Uri;

    .line 1739
    .line 1740
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1741
    .line 1742
    const-string v7, "[LIVEPHOTO-MERGE-OFFICIAL-KEEP] file="

    .line 1743
    .line 1744
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1745
    .line 1746
    .line 1747
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1748
    .line 1749
    .line 1750
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1754
    .line 1755
    .line 1756
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v0

    .line 1760
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1761
    .line 1762
    .line 1763
    goto :goto_1b

    .line 1764
    :cond_2e
    :try_start_7
    const-string v4, "image/jpeg"

    .line 1765
    .line 1766
    sget-object v6, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 1767
    .line 1768
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1769
    .line 1770
    .line 1771
    invoke-static {v1, v5, v10, v4, v6}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_c

    .line 1775
    :try_start_8
    invoke-static {v1, v9}, Lqy0;->н(Landroid/content/Context;Lh41;)Ljava/io/InputStream;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 1779
    :try_start_9
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v7

    .line 1783
    invoke-virtual {v7, v4}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 1787
    if-eqz v7, :cond_2f

    .line 1788
    .line 1789
    const/16 v9, 0x2000

    .line 1790
    .line 1791
    :try_start_a
    invoke-static {v6, v7, v9}, Lh62;->Δ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J

    .line 1792
    .line 1793
    .line 1794
    invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 1795
    .line 1796
    .line 1797
    :try_start_b
    invoke-interface {v7}, Ljava/io/Closeable;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 1798
    .line 1799
    .line 1800
    :try_start_c
    invoke-interface {v6}, Ljava/io/Closeable;->close()V

    .line 1801
    .line 1802
    .line 1803
    invoke-static {v1, v4}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V

    .line 1804
    .line 1805
    .line 1806
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1807
    .line 1808
    .line 1809
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1810
    .line 1811
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1812
    .line 1813
    .line 1814
    const-string v7, "[LIVEPHOTO-MERGE-OFFICIAL-IMPORTED] source="

    .line 1815
    .line 1816
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1817
    .line 1818
    .line 1819
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1820
    .line 1821
    .line 1822
    const-string v7, ", file="

    .line 1823
    .line 1824
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1825
    .line 1826
    .line 1827
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1828
    .line 1829
    .line 1830
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1831
    .line 1832
    .line 1833
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1834
    .line 1835
    .line 1836
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v0

    .line 1840
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 1841
    .line 1842
    .line 1843
    :goto_1b
    move-object/from16 v6, p0

    .line 1844
    .line 1845
    move-object/from16 v7, p1

    .line 1846
    .line 1847
    move v0, v8

    .line 1848
    const/4 v4, 0x0

    .line 1849
    goto/16 :goto_12

    .line 1850
    .line 1851
    :catchall_7
    move-exception v0

    .line 1852
    goto :goto_1d

    .line 1853
    :catchall_8
    move-exception v0

    .line 1854
    move-object v2, v0

    .line 1855
    goto :goto_1c

    .line 1856
    :catchall_9
    move-exception v0

    .line 1857
    move-object v2, v0

    .line 1858
    :try_start_d
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 1859
    :catchall_a
    move-exception v0

    .line 1860
    :try_start_e
    invoke-static {v7, v2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1861
    .line 1862
    .line 1863
    throw v0

    .line 1864
    :cond_2f
    new-instance v0, Ljava/lang/Exception;

    .line 1865
    .line 1866
    const-string v2, "\u65e0\u6cd5\u6253\u5f00\u5b98\u65b9\u5408\u5e76\u8f93\u51fa\u5bfc\u5165\u6d41"

    .line 1867
    .line 1868
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1869
    .line 1870
    .line 1871
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 1872
    :goto_1c
    :try_start_f
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 1873
    :catchall_b
    move-exception v0

    .line 1874
    :try_start_10
    invoke-static {v6, v2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1875
    .line 1876
    .line 1877
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 1878
    :catchall_c
    move-exception v0

    .line 1879
    const/4 v4, 0x0

    .line 1880
    :goto_1d
    invoke-static {v1, v4}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 1881
    .line 1882
    .line 1883
    throw v0

    .line 1884
    :cond_30
    new-instance v0, Ljava/lang/Exception;

    .line 1885
    .line 1886
    const-string v1, "\u5b98\u65b9\u5408\u5e76\u672a\u8fd4\u56de\u53ef\u8bfb\u53d6\u7684\u8f93\u51fa\u8def\u5f84: "

    .line 1887
    .line 1888
    invoke-static {v1, v11}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v1

    .line 1892
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1893
    .line 1894
    .line 1895
    throw v0

    .line 1896
    :cond_31
    return-object v3

    .line 1897
    :cond_32
    new-instance v0, Ljava/lang/Exception;

    .line 1898
    .line 1899
    const-string v1, "\u5b98\u65b9\u5408\u5e76\u6210\u529f\u4f46\u6ca1\u6709\u8fd4\u56de\u8f93\u51fa\u6587\u4ef6"

    .line 1900
    .line 1901
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1902
    .line 1903
    .line 1904
    throw v0

    .line 1905
    :pswitch_a
    move-object/from16 v23, v8

    .line 1906
    .line 1907
    check-cast v0, Lum1;

    .line 1908
    .line 1909
    check-cast v10, Lcom/example/dyhelper/ui/GestureAreaView;

    .line 1910
    .line 1911
    check-cast v9, Lla0;

    .line 1912
    .line 1913
    move-object/from16 v1, p1

    .line 1914
    .line 1915
    check-cast v1, Lw90;

    .line 1916
    .line 1917
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1918
    .line 1919
    .line 1920
    iput-object v1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 1921
    .line 1922
    invoke-virtual {v10, v1}, Lcom/example/dyhelper/ui/GestureAreaView;->setGridBounds(Lw90;)V

    .line 1923
    .line 1924
    .line 1925
    invoke-virtual {v9}, Lla0;->invoke()Ljava/lang/Object;

    .line 1926
    .line 1927
    .line 1928
    return-object v23

    .line 1929
    :pswitch_b
    move-object v1, v0

    .line 1930
    check-cast v1, Lst;

    .line 1931
    .line 1932
    check-cast v10, Ljava/lang/ClassLoader;

    .line 1933
    .line 1934
    check-cast v9, Lcb;

    .line 1935
    .line 1936
    move-object/from16 v3, p1

    .line 1937
    .line 1938
    check-cast v3, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1939
    .line 1940
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1941
    .line 1942
    .line 1943
    sget-object v0, Lst;->α:Lst;

    .line 1944
    .line 1945
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1946
    .line 1947
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1948
    .line 1949
    .line 1950
    :try_start_11
    new-instance v0, Lhm;

    .line 1951
    .line 1952
    const/16 v5, 0xe

    .line 1953
    .line 1954
    invoke-direct {v0, v5}, Lhm;-><init>(I)V

    .line 1955
    .line 1956
    .line 1957
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v0

    .line 1961
    new-instance v5, Ljava/util/ArrayList;

    .line 1962
    .line 1963
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1964
    .line 1965
    .line 1966
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v0

    .line 1970
    :cond_33
    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1971
    .line 1972
    .line 1973
    move-result v6

    .line 1974
    if-eqz v6, :cond_34

    .line 1975
    .line 1976
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v6

    .line 1980
    check-cast v6, Lorg/luckypray/dexkit/result/MethodData;

    .line 1981
    .line 1982
    invoke-virtual {v6, v10}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v6

    .line 1986
    if-eqz v6, :cond_33

    .line 1987
    .line 1988
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_d

    .line 1989
    .line 1990
    .line 1991
    goto :goto_1e

    .line 1992
    :catchall_d
    move-exception v0

    .line 1993
    new-instance v5, Leo1;

    .line 1994
    .line 1995
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1996
    .line 1997
    .line 1998
    :cond_34
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v0

    .line 2002
    sget-object v6, Ljz;->ε:Ljz;

    .line 2003
    .line 2004
    const-string v7, "r398844d0f2b2fd7c"

    .line 2005
    .line 2006
    if-nez v0, :cond_35

    .line 2007
    .line 2008
    goto :goto_1f

    .line 2009
    :cond_35
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v0

    .line 2013
    const-string v5, "DexKit strict matcher failed: "

    .line 2014
    .line 2015
    invoke-static {v5, v0, v7}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2016
    .line 2017
    .line 2018
    move-object v5, v6

    .line 2019
    :goto_1f
    check-cast v5, Ljava/util/List;

    .line 2020
    .line 2021
    invoke-static {v4, v5}, Lst;->μ(Ljava/util/LinkedHashSet;Ljava/util/List;)V

    .line 2022
    .line 2023
    .line 2024
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 2025
    .line 2026
    .line 2027
    move-result v0

    .line 2028
    if-eqz v0, :cond_39

    .line 2029
    .line 2030
    :try_start_12
    new-instance v0, Lhm;

    .line 2031
    .line 2032
    const/16 v5, 0xf

    .line 2033
    .line 2034
    invoke-direct {v0, v5}, Lhm;-><init>(I)V

    .line 2035
    .line 2036
    .line 2037
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v0

    .line 2041
    new-instance v5, Ljava/util/ArrayList;

    .line 2042
    .line 2043
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2044
    .line 2045
    .line 2046
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v0

    .line 2050
    :cond_36
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2051
    .line 2052
    .line 2053
    move-result v8

    .line 2054
    if-eqz v8, :cond_37

    .line 2055
    .line 2056
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v8

    .line 2060
    check-cast v8, Lorg/luckypray/dexkit/result/MethodData;

    .line 2061
    .line 2062
    invoke-virtual {v8, v10}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v8

    .line 2066
    if-eqz v8, :cond_36

    .line 2067
    .line 2068
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_e

    .line 2069
    .line 2070
    .line 2071
    goto :goto_20

    .line 2072
    :catchall_e
    move-exception v0

    .line 2073
    new-instance v5, Leo1;

    .line 2074
    .line 2075
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2076
    .line 2077
    .line 2078
    :cond_37
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2079
    .line 2080
    .line 2081
    move-result-object v0

    .line 2082
    if-nez v0, :cond_38

    .line 2083
    .line 2084
    goto :goto_21

    .line 2085
    :cond_38
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2086
    .line 2087
    .line 2088
    move-result-object v0

    .line 2089
    const-string v5, "DexKit signature matcher failed: "

    .line 2090
    .line 2091
    invoke-static {v5, v0, v7}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2092
    .line 2093
    .line 2094
    move-object v5, v6

    .line 2095
    :goto_21
    check-cast v5, Ljava/util/List;

    .line 2096
    .line 2097
    invoke-static {v4, v5}, Lst;->μ(Ljava/util/LinkedHashSet;Ljava/util/List;)V

    .line 2098
    .line 2099
    .line 2100
    :cond_39
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 2101
    .line 2102
    .line 2103
    move-result v0

    .line 2104
    if-eqz v0, :cond_3d

    .line 2105
    .line 2106
    :try_start_13
    new-instance v0, Lhm;

    .line 2107
    .line 2108
    const/16 v5, 0x10

    .line 2109
    .line 2110
    invoke-direct {v0, v5}, Lhm;-><init>(I)V

    .line 2111
    .line 2112
    .line 2113
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 2114
    .line 2115
    .line 2116
    move-result-object v0

    .line 2117
    new-instance v3, Ljava/util/ArrayList;

    .line 2118
    .line 2119
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2120
    .line 2121
    .line 2122
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2123
    .line 2124
    .line 2125
    move-result-object v0

    .line 2126
    :cond_3a
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2127
    .line 2128
    .line 2129
    move-result v5

    .line 2130
    if-eqz v5, :cond_3b

    .line 2131
    .line 2132
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v5

    .line 2136
    check-cast v5, Lorg/luckypray/dexkit/result/MethodData;

    .line 2137
    .line 2138
    invoke-virtual {v5, v10}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v5

    .line 2142
    if-eqz v5, :cond_3a

    .line 2143
    .line 2144
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_f

    .line 2145
    .line 2146
    .line 2147
    goto :goto_22

    .line 2148
    :catchall_f
    move-exception v0

    .line 2149
    new-instance v3, Leo1;

    .line 2150
    .line 2151
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2152
    .line 2153
    .line 2154
    :cond_3b
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v0

    .line 2158
    if-nez v0, :cond_3c

    .line 2159
    .line 2160
    move-object v6, v3

    .line 2161
    goto :goto_23

    .line 2162
    :cond_3c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v0

    .line 2166
    const-string v3, "DexKit string matcher failed: "

    .line 2167
    .line 2168
    invoke-static {v3, v0, v7}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2169
    .line 2170
    .line 2171
    :goto_23
    check-cast v6, Ljava/util/List;

    .line 2172
    .line 2173
    invoke-static {v4, v6}, Lst;->μ(Ljava/util/LinkedHashSet;Ljava/util/List;)V

    .line 2174
    .line 2175
    .line 2176
    :cond_3d
    new-instance v0, Ljava/util/HashSet;

    .line 2177
    .line 2178
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 2179
    .line 2180
    .line 2181
    new-instance v3, Ljava/util/ArrayList;

    .line 2182
    .line 2183
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2184
    .line 2185
    .line 2186
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v4

    .line 2190
    :cond_3e
    :goto_24
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2191
    .line 2192
    .line 2193
    move-result v5

    .line 2194
    if-eqz v5, :cond_3f

    .line 2195
    .line 2196
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v5

    .line 2200
    move-object v6, v5

    .line 2201
    check-cast v6, Ljava/lang/reflect/Method;

    .line 2202
    .line 2203
    invoke-static {v6}, Lst;->χ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v6

    .line 2207
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2208
    .line 2209
    .line 2210
    move-result v6

    .line 2211
    if-eqz v6, :cond_3e

    .line 2212
    .line 2213
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2214
    .line 2215
    .line 2216
    goto :goto_24

    .line 2217
    :cond_3f
    new-instance v0, Ltf;

    .line 2218
    .line 2219
    const/16 v4, 0x1a

    .line 2220
    .line 2221
    invoke-direct {v0, v4}, Ltf;-><init>(I)V

    .line 2222
    .line 2223
    .line 2224
    invoke-static {v3, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v0

    .line 2228
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2229
    .line 2230
    .line 2231
    move-result-object v3

    .line 2232
    :goto_25
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2233
    .line 2234
    .line 2235
    move-result v4

    .line 2236
    if-eqz v4, :cond_40

    .line 2237
    .line 2238
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v4

    .line 2242
    check-cast v4, Ljava/lang/reflect/Method;

    .line 2243
    .line 2244
    const/4 v10, 0x1

    .line 2245
    invoke-virtual {v4, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 2246
    .line 2247
    .line 2248
    invoke-static {v4}, Lst;->δ(Ljava/lang/reflect/Method;)V

    .line 2249
    .line 2250
    .line 2251
    goto :goto_25

    .line 2252
    :cond_40
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 2253
    .line 2254
    .line 2255
    move-result v3

    .line 2256
    if-nez v3, :cond_41

    .line 2257
    .line 2258
    goto :goto_26

    .line 2259
    :cond_41
    invoke-virtual {v9}, Lcb;->invoke()Ljava/lang/Object;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v0

    .line 2263
    check-cast v0, Ljava/util/List;

    .line 2264
    .line 2265
    :goto_26
    new-instance v3, Ljava/util/HashSet;

    .line 2266
    .line 2267
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 2268
    .line 2269
    .line 2270
    new-instance v4, Ljava/util/ArrayList;

    .line 2271
    .line 2272
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2273
    .line 2274
    .line 2275
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v0

    .line 2279
    :cond_42
    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2280
    .line 2281
    .line 2282
    move-result v5

    .line 2283
    if-eqz v5, :cond_43

    .line 2284
    .line 2285
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2286
    .line 2287
    .line 2288
    move-result-object v5

    .line 2289
    move-object v6, v5

    .line 2290
    check-cast v6, Ljava/lang/reflect/Method;

    .line 2291
    .line 2292
    invoke-static {v6}, Lst;->χ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2293
    .line 2294
    .line 2295
    move-result-object v6

    .line 2296
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2297
    .line 2298
    .line 2299
    move-result v6

    .line 2300
    if-eqz v6, :cond_42

    .line 2301
    .line 2302
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2303
    .line 2304
    .line 2305
    goto :goto_27

    .line 2306
    :cond_43
    new-instance v0, Lqt;

    .line 2307
    .line 2308
    invoke-direct {v0, v2, v1}, Lqt;-><init>(ILjava/lang/Object;)V

    .line 2309
    .line 2310
    .line 2311
    invoke-static {v4, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v0

    .line 2315
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v1

    .line 2319
    :goto_28
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2320
    .line 2321
    .line 2322
    move-result v2

    .line 2323
    if-eqz v2, :cond_44

    .line 2324
    .line 2325
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2326
    .line 2327
    .line 2328
    move-result-object v2

    .line 2329
    check-cast v2, Ljava/lang/reflect/Method;

    .line 2330
    .line 2331
    const/4 v10, 0x1

    .line 2332
    invoke-virtual {v2, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 2333
    .line 2334
    .line 2335
    invoke-static {v2}, Lst;->δ(Ljava/lang/reflect/Method;)V

    .line 2336
    .line 2337
    .line 2338
    goto :goto_28

    .line 2339
    :cond_44
    return-object v0

    .line 2340
    :pswitch_c
    move-object/from16 v23, v8

    .line 2341
    .line 2342
    check-cast v0, Lo3;

    .line 2343
    .line 2344
    check-cast v10, Lx3;

    .line 2345
    .line 2346
    check-cast v9, Lqm1;

    .line 2347
    .line 2348
    move-object/from16 v1, p1

    .line 2349
    .line 2350
    check-cast v1, Lv3;

    .line 2351
    .line 2352
    iget-object v2, v0, Lo3;->γ:Lx3;

    .line 2353
    .line 2354
    invoke-static {v1, v2}, Lj81;->Τ(Lv3;Lx3;)V

    .line 2355
    .line 2356
    .line 2357
    iget-object v2, v1, Lv3;->δ:Lx91;

    .line 2358
    .line 2359
    invoke-virtual {v2}, Lx91;->getValue()Ljava/lang/Object;

    .line 2360
    .line 2361
    .line 2362
    move-result-object v3

    .line 2363
    iget-object v4, v0, Lo3;->α:Lg62;

    .line 2364
    .line 2365
    iget-object v5, v0, Lo3;->κ:Lc4;

    .line 2366
    .line 2367
    iget-object v6, v0, Lo3;->ι:Lc4;

    .line 2368
    .line 2369
    iget-object v7, v0, Lo3;->η:Lc4;

    .line 2370
    .line 2371
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2372
    .line 2373
    .line 2374
    move-result v7

    .line 2375
    if-eqz v7, :cond_45

    .line 2376
    .line 2377
    iget-object v7, v0, Lo3;->θ:Lc4;

    .line 2378
    .line 2379
    invoke-static {v5, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2380
    .line 2381
    .line 2382
    move-result v7

    .line 2383
    if-eqz v7, :cond_45

    .line 2384
    .line 2385
    goto :goto_2a

    .line 2386
    :cond_45
    iget-object v7, v4, Lg62;->α:La80;

    .line 2387
    .line 2388
    invoke-interface {v7, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2389
    .line 2390
    .line 2391
    move-result-object v7

    .line 2392
    check-cast v7, Lc4;

    .line 2393
    .line 2394
    invoke-virtual {v7}, Lc4;->β()I

    .line 2395
    .line 2396
    .line 2397
    move-result v8

    .line 2398
    const/4 v11, 0x0

    .line 2399
    const/16 v22, 0x0

    .line 2400
    .line 2401
    :goto_29
    if-ge v11, v8, :cond_48

    .line 2402
    .line 2403
    invoke-virtual {v7, v11}, Lc4;->α(I)F

    .line 2404
    .line 2405
    .line 2406
    move-result v12

    .line 2407
    invoke-virtual {v6, v11}, Lc4;->α(I)F

    .line 2408
    .line 2409
    .line 2410
    move-result v13

    .line 2411
    cmpg-float v12, v12, v13

    .line 2412
    .line 2413
    if-ltz v12, :cond_46

    .line 2414
    .line 2415
    invoke-virtual {v7, v11}, Lc4;->α(I)F

    .line 2416
    .line 2417
    .line 2418
    move-result v12

    .line 2419
    invoke-virtual {v5, v11}, Lc4;->α(I)F

    .line 2420
    .line 2421
    .line 2422
    move-result v13

    .line 2423
    cmpl-float v12, v12, v13

    .line 2424
    .line 2425
    if-lez v12, :cond_47

    .line 2426
    .line 2427
    :cond_46
    invoke-virtual {v7, v11}, Lc4;->α(I)F

    .line 2428
    .line 2429
    .line 2430
    move-result v12

    .line 2431
    invoke-virtual {v6, v11}, Lc4;->α(I)F

    .line 2432
    .line 2433
    .line 2434
    move-result v13

    .line 2435
    invoke-virtual {v5, v11}, Lc4;->α(I)F

    .line 2436
    .line 2437
    .line 2438
    move-result v14

    .line 2439
    invoke-static {v12, v13, v14}, Lj81;->λ(FFF)F

    .line 2440
    .line 2441
    .line 2442
    move-result v12

    .line 2443
    invoke-virtual {v7, v11, v12}, Lc4;->ε(IF)V

    .line 2444
    .line 2445
    .line 2446
    const/16 v22, 0x1

    .line 2447
    .line 2448
    :cond_47
    add-int/lit8 v11, v11, 0x1

    .line 2449
    .line 2450
    goto :goto_29

    .line 2451
    :cond_48
    if-eqz v22, :cond_49

    .line 2452
    .line 2453
    iget-object v3, v4, Lg62;->β:La80;

    .line 2454
    .line 2455
    invoke-interface {v3, v7}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2456
    .line 2457
    .line 2458
    move-result-object v3

    .line 2459
    :cond_49
    :goto_2a
    invoke-virtual {v2}, Lx91;->getValue()Ljava/lang/Object;

    .line 2460
    .line 2461
    .line 2462
    move-result-object v2

    .line 2463
    invoke-static {v3, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2464
    .line 2465
    .line 2466
    move-result v2

    .line 2467
    if-nez v2, :cond_4a

    .line 2468
    .line 2469
    iget-object v0, v0, Lo3;->γ:Lx3;

    .line 2470
    .line 2471
    iget-object v0, v0, Lx3;->ζ:Lx91;

    .line 2472
    .line 2473
    invoke-virtual {v0, v3}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 2474
    .line 2475
    .line 2476
    iget-object v0, v10, Lx3;->ζ:Lx91;

    .line 2477
    .line 2478
    invoke-virtual {v0, v3}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 2479
    .line 2480
    .line 2481
    iget-object v0, v1, Lv3;->θ:Lx91;

    .line 2482
    .line 2483
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2484
    .line 2485
    invoke-virtual {v0, v2}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 2486
    .line 2487
    .line 2488
    iget-object v0, v1, Lv3;->γ:Lp70;

    .line 2489
    .line 2490
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 2491
    .line 2492
    .line 2493
    const/4 v10, 0x1

    .line 2494
    iput-boolean v10, v9, Lqm1;->ε:Z

    .line 2495
    .line 2496
    :cond_4a
    return-object v23

    .line 2497
    :pswitch_data_0
    .packed-switch 0x0
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
