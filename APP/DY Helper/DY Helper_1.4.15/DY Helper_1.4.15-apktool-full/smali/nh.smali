.class public final Lnh;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lnh;->α:I

    iput-object p2, p0, Lnh;->β:Ljava/lang/Object;

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lnh;->α:I

    .line 3
    .line 4
    sget-object v0, Lcm;->α:Ljava/util/Set;

    .line 5
    .line 6
    iput-object p1, p0, Lnh;->β:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p0}, Lm01;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lmi1;Lji1;)V
    .locals 0

    const/4 p1, 0x6

    iput p1, p0, Lnh;->α:I

    iput-object p2, p0, Lnh;->β:Ljava/lang/Object;

    .line 13
    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 7

    .line 1
    iget v0, p0, Lnh;->α:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    invoke-super {p0, p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v0, p1, Lk01;->ζ:Ljava/lang/Throwable;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    const-string v0, "quick_share_filter_application"

    .line 24
    .line 25
    iget-object v1, p1, Lk01;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v1, v0, Lgk1;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    check-cast v0, Lgk1;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v0, v4

    .line 39
    :goto_0
    if-nez v0, :cond_2

    .line 40
    .line 41
    goto :goto_4

    .line 42
    :cond_2
    iget v1, v0, Lgk1;->β:I

    .line 43
    .line 44
    if-lez v1, :cond_6

    .line 45
    .line 46
    iget v0, v0, Lgk1;->γ:I

    .line 47
    .line 48
    if-nez v0, :cond_6

    .line 49
    .line 50
    iget-object p0, p0, Lnh;->β:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lce0;

    .line 53
    .line 54
    :try_start_0
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget v0, p0, Lce0;->γ:I

    .line 60
    .line 61
    invoke-static {v0, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-nez p1, :cond_3

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_3
    sget-object v0, Llv1;->α:Llv1;

    .line 69
    .line 70
    iget-object v0, p0, Lce0;->ε:Ljava/lang/reflect/Method;

    .line 71
    .line 72
    invoke-virtual {v0, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    instance-of v1, v0, Ljava/util/List;

    .line 77
    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    check-cast v0, Ljava/util/List;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    move-object v0, v4

    .line 84
    :goto_1
    if-nez v0, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    invoke-static {v0}, Lh62;->η(Ljava/util/List;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Lce0;->ζ:Ljava/lang/reflect/Method;

    .line 94
    .line 95
    invoke-virtual {p0, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :goto_2
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :catchall_0
    move-exception p0

    .line 102
    new-instance p1, Leo1;

    .line 103
    .line 104
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    move-object p0, p1

    .line 108
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-eqz p0, :cond_6

    .line 113
    .line 114
    const-string p1, "rac25e39d95f0abcc"

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const-string v0, "quick empty submit callback failed: "

    .line 121
    .line 122
    invoke-static {v0, p0, p1}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_6
    :goto_4
    return-void

    .line 126
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, Lnh;->β:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, Lee0;

    .line 132
    .line 133
    iget-object p0, p0, Lee0;->β:Ljava/lang/Class;

    .line 134
    .line 135
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-nez p0, :cond_7

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_7
    sget-object p0, Lcn1;->η:Ljava/lang/ThreadLocal;

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Ljava/lang/Integer;

    .line 151
    .line 152
    if-eqz p1, :cond_8

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    goto :goto_5

    .line 159
    :cond_8
    move p1, v3

    .line 160
    :goto_5
    sub-int/2addr p1, v2

    .line 161
    if-gez p1, :cond_9

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_9
    move v3, p1

    .line 165
    :goto_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :goto_7
    return-void

    .line 173
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 177
    .line 178
    iget-object p0, p0, Lnh;->β:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p0, Lji1;

    .line 181
    .line 182
    iget-object p0, p0, Lji1;->β:Ljava/lang/reflect/Field;

    .line 183
    .line 184
    iget-object v1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v1}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    iget-object p1, p1, Lk01;->ζ:Ljava/lang/Throwable;

    .line 194
    .line 195
    if-eqz p1, :cond_a

    .line 196
    .line 197
    move p1, v2

    .line 198
    goto :goto_8

    .line 199
    :cond_a
    move p1, v3

    .line 200
    :goto_8
    const-string v5, "precise_time_enabled"

    .line 201
    .line 202
    invoke-static {v5, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    if-eqz v5, :cond_13

    .line 207
    .line 208
    if-nez p1, :cond_13

    .line 209
    .line 210
    if-eqz v0, :cond_13

    .line 211
    .line 212
    if-nez v1, :cond_b

    .line 213
    .line 214
    goto/16 :goto_c

    .line 215
    .line 216
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {p1}, Lmi1;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    new-instance v5, Lf7;

    .line 225
    .line 226
    invoke-direct {v5, v2, p1}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    new-instance p1, Lli1;

    .line 230
    .line 231
    invoke-direct {p1, v3}, Lli1;-><init>(I)V

    .line 232
    .line 233
    .line 234
    new-instance v3, Ly30;

    .line 235
    .line 236
    invoke-direct {v3, v5, v2, p1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 237
    .line 238
    .line 239
    new-instance p1, Lef;

    .line 240
    .line 241
    const/16 v2, 0xf

    .line 242
    .line 243
    invoke-direct {p1, v2, v1}, Lef;-><init>(ILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v3, p1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-static {p1}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    check-cast p1, Ljava/lang/Long;

    .line 255
    .line 256
    const-wide/16 v1, 0x0

    .line 257
    .line 258
    if-eqz p1, :cond_c

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 261
    .line 262
    .line 263
    move-result-wide v5

    .line 264
    goto :goto_9

    .line 265
    :cond_c
    move-wide v5, v1

    .line 266
    :goto_9
    cmp-long p1, v5, v1

    .line 267
    .line 268
    if-gtz p1, :cond_d

    .line 269
    .line 270
    goto :goto_c

    .line 271
    :cond_d
    invoke-static {v5, v6}, Lmi1;->γ(J)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_e

    .line 280
    .line 281
    goto :goto_c

    .line 282
    :cond_e
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    instance-of v0, p0, Landroid/widget/TextView;

    .line 287
    .line 288
    if-eqz v0, :cond_f

    .line 289
    .line 290
    check-cast p0, Landroid/widget/TextView;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 291
    .line 292
    goto :goto_b

    .line 293
    :catchall_1
    move-exception p0

    .line 294
    goto :goto_a

    .line 295
    :cond_f
    move-object p0, v4

    .line 296
    goto :goto_b

    .line 297
    :goto_a
    new-instance v0, Leo1;

    .line 298
    .line 299
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 300
    .line 301
    .line 302
    move-object p0, v0

    .line 303
    :goto_b
    instance-of v0, p0, Leo1;

    .line 304
    .line 305
    if-eqz v0, :cond_10

    .line 306
    .line 307
    move-object p0, v4

    .line 308
    :cond_10
    check-cast p0, Landroid/widget/TextView;

    .line 309
    .line 310
    if-nez p0, :cond_11

    .line 311
    .line 312
    goto :goto_c

    .line 313
    :cond_11
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    if-eqz v0, :cond_12

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    :cond_12
    invoke-static {v4, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-nez v0, :cond_13

    .line 328
    .line 329
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    .line 331
    .line 332
    :cond_13
    :goto_c
    return-void

    .line 333
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    sget-object v0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 337
    .line 338
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Κ()Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-nez v0, :cond_14

    .line 343
    .line 344
    goto :goto_e

    .line 345
    :cond_14
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 346
    .line 347
    instance-of v0, p1, Landroid/view/View;

    .line 348
    .line 349
    if-eqz v0, :cond_15

    .line 350
    .line 351
    move-object v4, p1

    .line 352
    check-cast v4, Landroid/view/View;

    .line 353
    .line 354
    :cond_15
    if-nez v4, :cond_16

    .line 355
    .line 356
    goto :goto_e

    .line 357
    :cond_16
    iget-object p0, p0, Lnh;->β:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast p0, Lk20;

    .line 360
    .line 361
    sget-object p1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 362
    .line 363
    monitor-enter p1

    .line 364
    :try_start_2
    sget-object v0, Lcom/example/dyhelper/hook/γ;->π:Ljava/util/WeakHashMap;

    .line 365
    .line 366
    invoke-virtual {v0, v4}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    if-eqz v5, :cond_17

    .line 371
    .line 372
    goto :goto_d

    .line 373
    :cond_17
    invoke-virtual {v0, v4, p0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 374
    .line 375
    .line 376
    move v2, v3

    .line 377
    :goto_d
    monitor-exit p1

    .line 378
    if-eqz v2, :cond_18

    .line 379
    .line 380
    goto :goto_e

    .line 381
    :cond_18
    new-instance p1, Ly10;

    .line 382
    .line 383
    invoke-direct {p1, p0}, Ly10;-><init>(Lk20;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v4, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 387
    .line 388
    .line 389
    new-instance p1, Lk2;

    .line 390
    .line 391
    invoke-direct {p1, v1, p0}, Lk2;-><init>(ILjava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 395
    .line 396
    .line 397
    new-instance p1, Lz10;

    .line 398
    .line 399
    invoke-direct {p1, v4, p0, v3}, Lz10;-><init>(Landroid/view/View;Lk20;I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v4, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 403
    .line 404
    .line 405
    :goto_e
    return-void

    .line 406
    :catchall_2
    move-exception p0

    .line 407
    monitor-exit p1

    .line 408
    throw p0

    .line 409
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 413
    .line 414
    instance-of v1, v0, Landroid/view/View;

    .line 415
    .line 416
    if-eqz v1, :cond_19

    .line 417
    .line 418
    check-cast v0, Landroid/view/View;

    .line 419
    .line 420
    goto :goto_f

    .line 421
    :cond_19
    move-object v0, v4

    .line 422
    :goto_f
    if-nez v0, :cond_1a

    .line 423
    .line 424
    goto :goto_10

    .line 425
    :cond_1a
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 426
    .line 427
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    invoke-static {v3, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    instance-of v1, p1, Landroid/view/View$OnClickListener;

    .line 435
    .line 436
    if-eqz v1, :cond_1b

    .line 437
    .line 438
    move-object v4, p1

    .line 439
    check-cast v4, Landroid/view/View$OnClickListener;

    .line 440
    .line 441
    :cond_1b
    if-nez v4, :cond_1c

    .line 442
    .line 443
    goto :goto_10

    .line 444
    :cond_1c
    iget-object p0, p0, Lnh;->β:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast p0, Lq10;

    .line 447
    .line 448
    new-instance p1, Lz7;

    .line 449
    .line 450
    const/4 v1, 0x5

    .line 451
    invoke-direct {p1, p0, v0, v4, v1}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 452
    .line 453
    .line 454
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result p0

    .line 466
    if-eqz p0, :cond_1d

    .line 467
    .line 468
    invoke-virtual {p1}, Lz7;->invoke()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    goto :goto_10

    .line 472
    :cond_1d
    sget-object p0, Lq10;->γ:Landroid/os/Handler;

    .line 473
    .line 474
    new-instance v0, Lr0;

    .line 475
    .line 476
    const/4 v1, 0x4

    .line 477
    invoke-direct {v0, v1, p1}, Lr0;-><init>(ILp70;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 481
    .line 482
    .line 483
    :goto_10
    return-void

    .line 484
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    sget-object v0, Ltl;->α:Landroid/util/LruCache;

    .line 488
    .line 489
    invoke-static {}, Ltl;->γ()Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-nez v0, :cond_1e

    .line 494
    .line 495
    goto/16 :goto_17

    .line 496
    .line 497
    :cond_1e
    iget-object v0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 498
    .line 499
    instance-of v2, v0, Ljava/util/List;

    .line 500
    .line 501
    if-eqz v2, :cond_1f

    .line 502
    .line 503
    check-cast v0, Ljava/util/List;

    .line 504
    .line 505
    goto :goto_11

    .line 506
    :cond_1f
    move-object v0, v4

    .line 507
    :goto_11
    if-nez v0, :cond_20

    .line 508
    .line 509
    goto/16 :goto_17

    .line 510
    .line 511
    :cond_20
    iget-object v2, p1, Lk01;->β:Ljava/lang/Object;

    .line 512
    .line 513
    if-nez v2, :cond_21

    .line 514
    .line 515
    goto/16 :goto_17

    .line 516
    .line 517
    :cond_21
    iget-object p0, p0, Lnh;->β:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast p0, Ljava/lang/reflect/Field;

    .line 520
    .line 521
    invoke-static {v2, p0}, Ltl;->α(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object p0

    .line 525
    instance-of v2, p0, Ljava/util/List;

    .line 526
    .line 527
    if-eqz v2, :cond_22

    .line 528
    .line 529
    check-cast p0, Ljava/util/List;

    .line 530
    .line 531
    goto :goto_12

    .line 532
    :cond_22
    move-object p0, v4

    .line 533
    :goto_12
    if-nez p0, :cond_23

    .line 534
    .line 535
    goto/16 :goto_17

    .line 536
    .line 537
    :cond_23
    if-eq v0, p0, :cond_24

    .line 538
    .line 539
    goto/16 :goto_17

    .line 540
    .line 541
    :cond_24
    new-instance v2, Ljava/util/ArrayList;

    .line 542
    .line 543
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 544
    .line 545
    .line 546
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 547
    .line 548
    .line 549
    move-result-object p0

    .line 550
    :cond_25
    :goto_13
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    if-eqz v3, :cond_27

    .line 555
    .line 556
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    instance-of v5, v3, Ljava/lang/String;

    .line 561
    .line 562
    if-eqz v5, :cond_26

    .line 563
    .line 564
    check-cast v3, Ljava/lang/String;

    .line 565
    .line 566
    goto :goto_14

    .line 567
    :cond_26
    move-object v3, v4

    .line 568
    :goto_14
    if-eqz v3, :cond_25

    .line 569
    .line 570
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    goto :goto_13

    .line 574
    :cond_27
    new-instance p0, Ljava/util/ArrayList;

    .line 575
    .line 576
    const/16 v3, 0xa

    .line 577
    .line 578
    invoke-static {v2, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    if-eqz v3, :cond_28

    .line 594
    .line 595
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v3

    .line 599
    check-cast v3, Ljava/lang/String;

    .line 600
    .line 601
    sget-object v4, Ltl;->α:Landroid/util/LruCache;

    .line 602
    .line 603
    invoke-static {v3}, Ltl;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v3

    .line 607
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    goto :goto_15

    .line 611
    :cond_28
    new-instance v2, Ljava/util/ArrayList;

    .line 612
    .line 613
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 614
    .line 615
    .line 616
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 617
    .line 618
    .line 619
    move-result-object p0

    .line 620
    :cond_29
    :goto_16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 621
    .line 622
    .line 623
    move-result v3

    .line 624
    if-eqz v3, :cond_2a

    .line 625
    .line 626
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    move-object v4, v3

    .line 631
    check-cast v4, Ljava/lang/String;

    .line 632
    .line 633
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 634
    .line 635
    .line 636
    move-result v4

    .line 637
    if-nez v4, :cond_29

    .line 638
    .line 639
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    goto :goto_16

    .line 643
    :cond_2a
    invoke-static {v2}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 644
    .line 645
    .line 646
    move-result-object p0

    .line 647
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 648
    .line 649
    .line 650
    move-result-object p0

    .line 651
    new-instance v2, Ltf;

    .line 652
    .line 653
    const/16 v3, 0x15

    .line 654
    .line 655
    invoke-direct {v2, v3}, Ltf;-><init>(I)V

    .line 656
    .line 657
    .line 658
    new-instance v3, Lye;

    .line 659
    .line 660
    invoke-direct {v3, v1, v2}, Lye;-><init>(ILjava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    invoke-static {p0, v3}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object p0

    .line 667
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 668
    .line 669
    .line 670
    move-result v1

    .line 671
    if-nez v1, :cond_2b

    .line 672
    .line 673
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v0

    .line 677
    if-nez v0, :cond_2b

    .line 678
    .line 679
    invoke-virtual {p1, p0}, Lk01;->α(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    const-string p0, "DYHelper_ImageWatermark"

    .line 683
    .line 684
    const-string p1, "\u66ff\u6362\u8bc4\u8bba\u52a8\u56fe\u4fdd\u5b58\u6e90: url_list \u5df2\u6e05\u6d17\u6392\u5e8f"

    .line 685
    .line 686
    invoke-static {p0, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    :cond_2b
    :goto_17
    return-void

    .line 690
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    :try_start_3
    iget-object p0, p0, Lnh;->β:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast p0, Lgh;

    .line 696
    .line 697
    invoke-virtual {p0, p1}, Lgh;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 698
    .line 699
    .line 700
    goto :goto_18

    .line 701
    :catchall_3
    move-exception p0

    .line 702
    sget-object p1, Lmj;->α:Lh22;

    .line 703
    .line 704
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object p0

    .line 708
    new-instance p1, Ljava/lang/StringBuilder;

    .line 709
    .line 710
    const-string v0, "hook ctor failed: "

    .line 711
    .line 712
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object p0

    .line 722
    invoke-static {p0}, Lmj;->σ(Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    :goto_18
    return-void

    .line 726
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 727
    .line 728
    .line 729
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 730
    .line 731
    instance-of v0, p1, Landroid/view/View;

    .line 732
    .line 733
    if-eqz v0, :cond_2c

    .line 734
    .line 735
    move-object v4, p1

    .line 736
    check-cast v4, Landroid/view/View;

    .line 737
    .line 738
    :cond_2c
    if-nez v4, :cond_2d

    .line 739
    .line 740
    goto :goto_19

    .line 741
    :cond_2d
    iget-object p0, p0, Lnh;->β:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast p0, Loh;

    .line 744
    .line 745
    invoke-virtual {p0, v4}, Loh;->ζ(Landroid/view/View;)V

    .line 746
    .line 747
    .line 748
    :goto_19
    return-void

    .line 749
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 9

    .line 1
    iget v0, p0, Lnh;->α:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ls62;->α:Ls62;

    .line 5
    .line 6
    iget-object v3, p0, Lnh;->β:Ljava/lang/Object;

    .line 7
    .line 8
    sparse-switch v0, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :sswitch_0
    const-string p0, "rac25e39d95f0abcc"

    .line 16
    .line 17
    const-string v0, "quick submit filtered source="

    .line 18
    .line 19
    const-string v1, "quick:"

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v4, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v5, Lbe0;->α:Lbe0;

    .line 27
    .line 28
    invoke-virtual {v5}, Lbe0;->η()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    check-cast v3, Lce0;

    .line 36
    .line 37
    iget v5, v3, Lce0;->δ:I

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v5, v4}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-static {v3, v6}, Li81;->ν(Lce0;Ljava/lang/Object;)Lgk1;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    if-nez v6, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object v7, v6, Lgk1;->α:Ljava/lang/Object;

    .line 54
    .line 55
    aput-object v7, v4, v5

    .line 56
    .line 57
    const-string v4, "quick_share_filter_application"

    .line 58
    .line 59
    iget-object p1, p1, Lk01;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 60
    .line 61
    invoke-virtual {p1, v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget-object p1, v3, Lce0;->α:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object v1, Llv1;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 75
    .line 76
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    iget p1, v6, Lgk1;->β:I

    .line 83
    .line 84
    iget v1, v6, Lgk1;->γ:I

    .line 85
    .line 86
    sub-int v1, p1, v1

    .line 87
    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, " removed="

    .line 97
    .line 98
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p0, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catchall_0
    move-exception p1

    .line 113
    new-instance v2, Leo1;

    .line 114
    .line 115
    invoke-direct {v2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    :cond_2
    :goto_0
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-eqz p1, :cond_3

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    const-string v0, "quick submit callback failed: "

    .line 129
    .line 130
    invoke-static {v0, p1, p0}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    :goto_1
    return-void

    .line 134
    :sswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Lee0;

    .line 140
    .line 141
    iget v0, v3, Lee0;->γ:I

    .line 142
    .line 143
    iget-object v4, v3, Lee0;->β:Ljava/lang/Class;

    .line 144
    .line 145
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-virtual {v4, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-nez v4, :cond_4

    .line 152
    .line 153
    goto/16 :goto_5

    .line 154
    .line 155
    :cond_4
    sget-object v4, Lcn1;->η:Ljava/lang/ThreadLocal;

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    check-cast v5, Ljava/lang/Integer;

    .line 162
    .line 163
    if-eqz v5, :cond_5

    .line 164
    .line 165
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    goto :goto_2

    .line 170
    :cond_5
    const/4 v5, 0x0

    .line 171
    :goto_2
    add-int/lit8 v6, v5, 0x1

    .line 172
    .line 173
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-virtual {v4, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {v0, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    instance-of v6, v4, Ljava/util/List;

    .line 188
    .line 189
    if-eqz v6, :cond_6

    .line 190
    .line 191
    move-object v1, v4

    .line 192
    check-cast v1, Ljava/util/List;

    .line 193
    .line 194
    :cond_6
    if-nez v1, :cond_7

    .line 195
    .line 196
    goto/16 :goto_5

    .line 197
    .line 198
    :cond_7
    new-instance v4, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 208
    .line 209
    .line 210
    sget-object v6, Lvd0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 211
    .line 212
    new-instance v6, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    :cond_8
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    if-eqz v8, :cond_9

    .line 226
    .line 227
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    invoke-static {v8}, Lvd0;->τ(Ljava/lang/Object;)Lxd0;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    if-eqz v8, :cond_8

    .line 236
    .line 237
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_9
    sget-object v7, Lxc0;->α:Lxc0;

    .line 242
    .line 243
    invoke-virtual {v7, v6}, Lxc0;->δ(Ljava/util/List;)V

    .line 244
    .line 245
    .line 246
    if-nez v5, :cond_a

    .line 247
    .line 248
    iget-boolean v5, v3, Lee0;->δ:Z

    .line 249
    .line 250
    if-eqz v5, :cond_a

    .line 251
    .line 252
    sget-object v5, Lcn1;->δ:Ljava/util/Map;

    .line 253
    .line 254
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    new-instance v7, Lbn1;

    .line 258
    .line 259
    invoke-direct {v7, v3, v4}, Lbn1;-><init>(Lee0;Ljava/util/ArrayList;)V

    .line 260
    .line 261
    .line 262
    invoke-interface {v5, p1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    :cond_a
    sget-object v4, Lbe0;->α:Lbe0;

    .line 266
    .line 267
    invoke-virtual {v4}, Lbe0;->η()Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_b

    .line 272
    .line 273
    invoke-static {v1}, Lvd0;->η(Ljava/util/List;)Ljava/util/ArrayList;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    new-instance v5, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 280
    .line 281
    .line 282
    aput-object v5, p0, v0

    .line 283
    .line 284
    sget-object p0, Lcn1;->α:Lcn1;

    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    sub-int/2addr v0, v4

    .line 302
    invoke-static {v3, p1, v1, p0, v0}, Lcn1;->β(Lee0;Ljava/lang/Object;Ljava/util/List;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :catchall_1
    move-exception p0

    .line 307
    new-instance v2, Leo1;

    .line 308
    .line 309
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    :cond_b
    :goto_4
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    if-eqz p0, :cond_c

    .line 317
    .line 318
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    const-string p1, "relation submit callback failed: "

    .line 323
    .line 324
    const-string v0, "reae2c2e0c445b34d"

    .line 325
    .line 326
    invoke-static {p1, p0, v0}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :cond_c
    :goto_5
    return-void

    .line 330
    :sswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 334
    .line 335
    if-nez p0, :cond_d

    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_d
    sget-object v0, Lcm;->γ:Ljava/util/Map;

    .line 339
    .line 340
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    check-cast v0, Lnv0;

    .line 345
    .line 346
    if-nez v0, :cond_e

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_e
    sget-object v2, Lcm;->δ:Ljava/util/Map;

    .line 350
    .line 351
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    if-nez p0, :cond_f

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_f
    sget-object v2, Lcm;->α:Ljava/util/Set;

    .line 359
    .line 360
    check-cast v3, Ljava/lang/Class;

    .line 361
    .line 362
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    if-nez v2, :cond_10

    .line 367
    .line 368
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    :cond_10
    const-string v3, "item"

    .line 376
    .line 377
    invoke-static {v0, p0, v2, v3}, Lcm;->ι(Lnv0;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;)Z

    .line 378
    .line 379
    .line 380
    move-result p0

    .line 381
    if-eqz p0, :cond_11

    .line 382
    .line 383
    invoke-virtual {p1, v1}, Lk01;->α(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    :cond_11
    :goto_6
    return-void

    .line 387
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_2
        0x7 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method
