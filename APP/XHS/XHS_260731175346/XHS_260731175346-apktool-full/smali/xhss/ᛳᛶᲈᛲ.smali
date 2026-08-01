.class public final synthetic Lxhss/ᛳᛶᲈᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lxhss/ᛳᛶᲈᛲ;->ᛱᛱᛲᲇ:I

    iput-object p2, p0, Lxhss/ᛳᛶᲈᛲ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lxhss/ᲈᲇᲁᛲ;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput p1, p0, Lxhss/ᛳᛶᲈᛲ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lxhss/ᛳᛶᲈᛲ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lxhss/ᛳᛶᲈᛲ;->ᛱᛱᛲᲇ:I

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
    iget-object p0, p0, Lxhss/ᛳᛶᲈᛲ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lxhss/ᛸᛶᲀᲁ;

    .line 13
    .line 14
    iget-object p0, p0, Lxhss/ᛸᛶᲀᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛲᲀᛷ;

    .line 15
    .line 16
    invoke-virtual {p0}, Lxhss/ᛲᛲᲀᛷ;->ᛷᛵᛵᲈ()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast p0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    add-int/lit8 v1, v4, 0x1

    .line 37
    .line 38
    if-ltz v4, :cond_0

    .line 39
    .line 40
    check-cast v0, Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 62
    .line 63
    const/high16 v6, 0x41400000    # 12.0f

    .line 64
    .line 65
    mul-float/2addr v5, v6

    .line 66
    invoke-virtual {v0, v5}, Landroid/view/View;->setTranslationY(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/high16 v5, 0x3f800000    # 1.0f

    .line 74
    .line 75
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    int-to-long v3, v4

    .line 84
    const-wide/16 v5, 0x1e

    .line 85
    .line 86
    mul-long/2addr v3, v5

    .line 87
    const-wide/16 v5, 0x50

    .line 88
    .line 89
    add-long/2addr v3, v5

    .line 90
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-wide/16 v3, 0xdc

    .line 95
    .line 96
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    .line 101
    .line 102
    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 110
    .line 111
    .line 112
    move v4, v1

    .line 113
    goto :goto_0

    .line 114
    :cond_0
    invoke-static {}, Lxhss/ᛱᲀᛷᛳ;->ᛳᛸᛵᲀ()V

    .line 115
    .line 116
    .line 117
    throw v2

    .line 118
    :cond_1
    return-void

    .line 119
    :pswitch_1
    check-cast p0, Lxhss/ᛷᛸᛴᛵ;

    .line 120
    .line 121
    iget-object v0, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛶᛴᲀ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 122
    .line 123
    iget v1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛱᛱᛲᲇ:I

    .line 124
    .line 125
    if-nez v1, :cond_2

    .line 126
    .line 127
    iput-boolean v3, p0, Lxhss/ᛷᛸᛴᛵ;->ᛳᲁᲇᛸ:Z

    .line 128
    .line 129
    sget-object v1, Lxhss/ᲈᲀᛵᛸ;->ON_PAUSE:Lxhss/ᲈᲀᛵᛸ;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ(Lxhss/ᲈᲀᛵᛸ;)V

    .line 132
    .line 133
    .line 134
    :cond_2
    iget v1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛷᛵᛵᲈ:I

    .line 135
    .line 136
    if-nez v1, :cond_3

    .line 137
    .line 138
    iget-boolean v1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛳᲁᲇᛸ:Z

    .line 139
    .line 140
    if-eqz v1, :cond_3

    .line 141
    .line 142
    sget-object v1, Lxhss/ᲈᲀᛵᛸ;->ON_STOP:Lxhss/ᲈᲀᛵᛸ;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ(Lxhss/ᲈᲀᛵᛸ;)V

    .line 145
    .line 146
    .line 147
    iput-boolean v3, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛴᲇᛵ:Z

    .line 148
    .line 149
    :cond_3
    return-void

    .line 150
    :pswitch_2
    check-cast p0, Lxhss/ᲈᲇᲁᛲ;

    .line 151
    .line 152
    sget-object v0, Lxhss/ᲈᛵᲈᛶ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛵᲈᛶ;

    .line 153
    .line 154
    sget-object v5, Lxhss/ᲈᛵᲈᛶ;->ᲇᛸᛳᲁ:Ljava/lang/ref/WeakReference;

    .line 155
    .line 156
    if-eqz v5, :cond_14

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    if-nez v5, :cond_4

    .line 163
    .line 164
    goto/16 :goto_c

    .line 165
    .line 166
    :cond_4
    invoke-virtual {v0, v5}, Lxhss/ᲈᛵᲈᛶ;->ᛸᛲᛷᛱ(Ljava/lang/Object;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    if-nez v0, :cond_5

    .line 171
    .line 172
    goto/16 :goto_c

    .line 173
    .line 174
    :cond_5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    move v7, v4

    .line 179
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    if-eqz v8, :cond_9

    .line 184
    .line 185
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-static {v8}, Lxhss/ᲈᛵᲈᛶ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    invoke-static {v8}, Lxhss/ᲈᛵᲈᛶ;->ᲈᛲᛵᲁ(Ljava/lang/Object;)Ljava/util/Set;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    if-eqz v8, :cond_6

    .line 198
    .line 199
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    if-eqz v9, :cond_6

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_6
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    :cond_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    if-eqz v9, :cond_8

    .line 215
    .line 216
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    check-cast v9, Ljava/lang/String;

    .line 221
    .line 222
    iget-object v10, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 223
    .line 224
    invoke-virtual {v10, v9}, Lxhss/ᛷᛸᛵᛶ;->containsKey(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v9

    .line 228
    if-eqz v9, :cond_7

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_8
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_9
    const/4 v7, -0x1

    .line 235
    :goto_3
    const-wide v8, -0xfd081b858845L

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    if-gez v7, :cond_a

    .line 241
    .line 242
    const-wide v1, -0x118031b858845L

    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    const-wide v1, -0x118151b858845L

    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    const-wide v1, -0x1181c1b858845L

    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    invoke-static {v8, v9}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    goto/16 :goto_c

    .line 273
    .line 274
    :cond_a
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    const-wide v10, -0x118241b858845L

    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    invoke-static {v10, v11}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    new-instance v0, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    array-length v6, p0

    .line 296
    move v10, v4

    .line 297
    :goto_4
    if-ge v10, v6, :cond_d

    .line 298
    .line 299
    aget-object v11, p0, v10

    .line 300
    .line 301
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    const-wide v13, -0x118341b858845L

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v13

    .line 314
    invoke-static {v12, v13}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    if-eqz v12, :cond_c

    .line 319
    .line 320
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object v12

    .line 324
    const-wide v13, -0x118461b858845L

    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    array-length v13, v12

    .line 333
    if-nez v13, :cond_b

    .line 334
    .line 335
    move-object v12, v2

    .line 336
    goto :goto_5

    .line 337
    :cond_b
    aget-object v12, v12, v4

    .line 338
    .line 339
    :goto_5
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 340
    .line 341
    invoke-static {v12, v13}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v12

    .line 345
    if-eqz v12, :cond_c

    .line 346
    .line 347
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    goto :goto_6

    .line 351
    :catchall_0
    move-exception p0

    .line 352
    goto/16 :goto_a

    .line 353
    .line 354
    :cond_c
    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    :cond_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    if-eqz v4, :cond_f

    .line 366
    .line 367
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    move-object v6, v4

    .line 372
    check-cast v6, Ljava/lang/reflect/Method;

    .line 373
    .line 374
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    if-ne v6, v1, :cond_e

    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_f
    move-object v4, v2

    .line 382
    :goto_7
    check-cast v4, Ljava/lang/reflect/Method;

    .line 383
    .line 384
    if-eqz v4, :cond_10

    .line 385
    .line 386
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    const-wide v0, -0x1185d1b858845L

    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    invoke-virtual {v4, v5, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    goto :goto_8

    .line 407
    :cond_10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    :cond_11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-eqz v0, :cond_12

    .line 416
    .line 417
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    move-object v1, v0

    .line 422
    check-cast v1, Ljava/lang/reflect/Method;

    .line 423
    .line 424
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-ne v1, v3, :cond_11

    .line 429
    .line 430
    move-object v2, v0

    .line 431
    :cond_12
    check-cast v2, Ljava/lang/reflect/Method;

    .line 432
    .line 433
    if-eqz v2, :cond_13

    .line 434
    .line 435
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    invoke-virtual {v2, v5, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    :goto_8
    const-wide v0, -0x118691b858845L

    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    invoke-static {v8, v9}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_13
    const-wide v0, -0x1187c1b858845L

    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    invoke-static {v8, v9}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    :goto_9
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 470
    .line 471
    goto :goto_b

    .line 472
    :goto_a
    new-instance v0, Lxhss/ᲈᛳᛱᲇ;

    .line 473
    .line 474
    invoke-direct {v0, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 475
    .line 476
    .line 477
    move-object p0, v0

    .line 478
    :goto_b
    invoke-static {p0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    if-eqz p0, :cond_14

    .line 483
    .line 484
    const-wide v0, -0x118961b858845L

    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    invoke-static {v8, v9}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    :cond_14
    :goto_c
    return-void

    .line 499
    :pswitch_3
    check-cast p0, Landroid/app/Activity;

    .line 500
    .line 501
    sget-object v0, Lxhss/ᛴᛶᛴᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛶᛴᛲ;

    .line 502
    .line 503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    invoke-static {p0}, Lxhss/ᛴᛶᛴᛲ;->ᛳᲈᲈᛲ(Landroid/app/Activity;)V

    .line 507
    .line 508
    .line 509
    return-void

    .line 510
    :pswitch_4
    check-cast p0, Lxhss/ᛲᛳᛲᛲ;

    .line 511
    .line 512
    const-string v0, "fetchFonts result is not OK. ("

    .line 513
    .line 514
    iget-object v2, p0, Lxhss/ᛲᛳᛲᛲ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 515
    .line 516
    monitor-enter v2

    .line 517
    :try_start_1
    iget-object v3, p0, Lxhss/ᛲᛳᛲᛲ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛱᛷᛸ;

    .line 518
    .line 519
    if-nez v3, :cond_15

    .line 520
    .line 521
    monitor-exit v2

    .line 522
    goto/16 :goto_12

    .line 523
    .line 524
    :catchall_1
    move-exception p0

    .line 525
    goto/16 :goto_14

    .line 526
    .line 527
    :cond_15
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 528
    :try_start_2
    invoke-virtual {p0}, Lxhss/ᛲᛳᛲᛲ;->ᛱᛱᛲᲇ()Lxhss/ᛵᛶᲈᛳ;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    iget v3, v2, Lxhss/ᛵᛶᲈᛳ;->ᲇᛶᛴᲀ:I

    .line 533
    .line 534
    if-ne v3, v1, :cond_16

    .line 535
    .line 536
    iget-object v1, p0, Lxhss/ᛲᛳᛲᛲ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 537
    .line 538
    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 539
    :try_start_3
    monitor-exit v1

    .line 540
    goto :goto_d

    .line 541
    :catchall_2
    move-exception v0

    .line 542
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 543
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 544
    :catchall_3
    move-exception v0

    .line 545
    goto :goto_10

    .line 546
    :cond_16
    :goto_d
    if-nez v3, :cond_19

    .line 547
    .line 548
    :try_start_5
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 549
    .line 550
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    iget-object v0, p0, Lxhss/ᛲᛳᛲᛲ;->ᛱᛱᛲᲇ:Landroid/content/Context;

    .line 554
    .line 555
    filled-new-array {v2}, [Lxhss/ᛵᛶᲈᛳ;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    invoke-static {v0, v1, v4}, Lxhss/ᛱᲁᛶᲇ;->ᛷᛵᛵᲈ(Landroid/content/Context;[Lxhss/ᛵᛶᲈᛳ;I)Landroid/graphics/Typeface;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    iget-object v1, p0, Lxhss/ᛲᛳᛲᛲ;->ᛱᛱᛲᲇ:Landroid/content/Context;

    .line 564
    .line 565
    iget-object v2, v2, Lxhss/ᛵᛶᲈᛳ;->ᛷᛵᛵᲈ:Landroid/net/Uri;

    .line 566
    .line 567
    invoke-static {v1, v2}, Lxhss/ᛷᛸᲀᲀ;->ᲁᛴᲇᛲ(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 568
    .line 569
    .line 570
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 571
    if-eqz v1, :cond_18

    .line 572
    .line 573
    if-eqz v0, :cond_18

    .line 574
    .line 575
    :try_start_6
    const-string v2, "EmojiCompat.MetadataRepo.create"

    .line 576
    .line 577
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    new-instance v2, Lxhss/ᲇᛸᛶ;

    .line 581
    .line 582
    invoke-static {v1}, Lxhss/ᛵᛵᛲᲈ;->ᛴᲈᛱᛴ(Ljava/nio/MappedByteBuffer;)Lxhss/ᲁᛸᛱᲀ;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-direct {v2, v0, v1}, Lxhss/ᲇᛸᛶ;-><init>(Landroid/graphics/Typeface;Lxhss/ᲁᛸᛱᲀ;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 587
    .line 588
    .line 589
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 590
    .line 591
    .line 592
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 593
    .line 594
    .line 595
    iget-object v0, p0, Lxhss/ᛲᛳᛲᛲ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 596
    .line 597
    monitor-enter v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 598
    :try_start_9
    iget-object v1, p0, Lxhss/ᛲᛳᛲᛲ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛱᛷᛸ;

    .line 599
    .line 600
    if-eqz v1, :cond_17

    .line 601
    .line 602
    invoke-virtual {v1, v2}, Lxhss/ᛱᛱᛷᛸ;->ᛸᛲᲀᛵ(Lxhss/ᲇᛸᛶ;)V

    .line 603
    .line 604
    .line 605
    goto :goto_e

    .line 606
    :catchall_4
    move-exception v1

    .line 607
    goto :goto_f

    .line 608
    :cond_17
    :goto_e
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 609
    :try_start_a
    invoke-virtual {p0}, Lxhss/ᛲᛳᛲᛲ;->ᛷᛵᛵᲈ()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 610
    .line 611
    .line 612
    goto :goto_12

    .line 613
    :goto_f
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 614
    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 615
    :catchall_5
    move-exception v0

    .line 616
    :try_start_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 617
    .line 618
    .line 619
    throw v0

    .line 620
    :cond_18
    new-instance v0, Ljava/lang/RuntimeException;

    .line 621
    .line 622
    const-string v1, "Unable to open file."

    .line 623
    .line 624
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 628
    :catchall_6
    move-exception v0

    .line 629
    :try_start_e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 630
    .line 631
    .line 632
    throw v0

    .line 633
    :cond_19
    new-instance v1, Ljava/lang/RuntimeException;

    .line 634
    .line 635
    new-instance v2, Ljava/lang/StringBuilder;

    .line 636
    .line 637
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    const-string v0, ")"

    .line 644
    .line 645
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 656
    :goto_10
    iget-object v1, p0, Lxhss/ᛲᛳᛲᛲ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 657
    .line 658
    monitor-enter v1

    .line 659
    :try_start_f
    iget-object v2, p0, Lxhss/ᛲᛳᛲᛲ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛱᛷᛸ;

    .line 660
    .line 661
    if-eqz v2, :cond_1a

    .line 662
    .line 663
    invoke-virtual {v2, v0}, Lxhss/ᛱᛱᛷᛸ;->ᛸᛴᛶᛳ(Ljava/lang/Throwable;)V

    .line 664
    .line 665
    .line 666
    goto :goto_11

    .line 667
    :catchall_7
    move-exception p0

    .line 668
    goto :goto_13

    .line 669
    :cond_1a
    :goto_11
    monitor-exit v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 670
    invoke-virtual {p0}, Lxhss/ᛲᛳᛲᛲ;->ᛷᛵᛵᲈ()V

    .line 671
    .line 672
    .line 673
    :goto_12
    return-void

    .line 674
    :goto_13
    :try_start_10
    monitor-exit v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 675
    throw p0

    .line 676
    :goto_14
    :try_start_11
    monitor-exit v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 677
    throw p0

    .line 678
    nop

    .line 679
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
