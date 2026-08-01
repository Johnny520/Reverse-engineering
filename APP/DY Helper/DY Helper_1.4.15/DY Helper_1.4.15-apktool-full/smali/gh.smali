.class public final synthetic Lgh;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lgh;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget p0, p0, Lgh;->ε:I

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->β(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->ψ(Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->γ(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_2
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->α(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_3
    check-cast p1, Ljava/lang/Class;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->β(Ljava/lang/Class;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_4
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->δ(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;)Ls62;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_5
    check-cast p1, Ljava/lang/Class;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_6
    check-cast p1, Lk01;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object p0, Lmj;->α:Lh22;

    .line 67
    .line 68
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-static {v3, p0}, Lmj;->ω(Landroid/view/View;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Ls62;->α:Ls62;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_7
    check-cast p1, Lk01;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object p0, Lmj;->α:Lh22;

    .line 82
    .line 83
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v3, p0}, Lmj;->ω(Landroid/view/View;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Ls62;->α:Ls62;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_8
    check-cast p1, Lk01;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v2, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    instance-of v0, p0, Landroid/view/View;

    .line 106
    .line 107
    if-eqz v0, :cond_0

    .line 108
    .line 109
    move-object v3, p0

    .line 110
    check-cast v3, Landroid/view/View;

    .line 111
    .line 112
    :cond_0
    sget-object p0, Lmj;->α:Lh22;

    .line 113
    .line 114
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-static {v3, p0}, Lmj;->ω(Landroid/view/View;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Ls62;->α:Ls62;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_9
    check-cast p1, Lk01;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v2, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    instance-of v0, p0, Landroid/view/View;

    .line 137
    .line 138
    if-eqz v0, :cond_1

    .line 139
    .line 140
    move-object v3, p0

    .line 141
    check-cast v3, Landroid/view/View;

    .line 142
    .line 143
    :cond_1
    sget-object p0, Lmj;->α:Lh22;

    .line 144
    .line 145
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-static {v3, p0}, Lmj;->ω(Landroid/view/View;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-object p0, Ls62;->α:Ls62;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_a
    check-cast p1, Lk01;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 159
    .line 160
    instance-of v0, p0, Landroid/view/View;

    .line 161
    .line 162
    if-eqz v0, :cond_2

    .line 163
    .line 164
    move-object v3, p0

    .line 165
    check-cast v3, Landroid/view/View;

    .line 166
    .line 167
    :cond_2
    sget-object p0, Lmj;->α:Lh22;

    .line 168
    .line 169
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 170
    .line 171
    invoke-static {v3, p0}, Lmj;->ω(Landroid/view/View;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    sget-object p0, Ls62;->α:Ls62;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_b
    check-cast p1, Lk01;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 183
    .line 184
    instance-of v0, p0, Landroid/view/View;

    .line 185
    .line 186
    if-eqz v0, :cond_3

    .line 187
    .line 188
    move-object v3, p0

    .line 189
    check-cast v3, Landroid/view/View;

    .line 190
    .line 191
    :cond_3
    sget-object p0, Lmj;->α:Lh22;

    .line 192
    .line 193
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 194
    .line 195
    invoke-static {v3, p0}, Lmj;->ω(Landroid/view/View;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    sget-object p0, Ls62;->α:Ls62;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_c
    check-cast p1, Lk01;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 207
    .line 208
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 209
    .line 210
    if-eqz p1, :cond_4

    .line 211
    .line 212
    move-object v3, p0

    .line 213
    check-cast v3, Landroid/view/ViewGroup;

    .line 214
    .line 215
    :cond_4
    if-nez v3, :cond_5

    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_5
    invoke-static {v3, v2, v2}, Lmj;->ψ(Landroid/view/ViewGroup;ZZ)V

    .line 219
    .line 220
    .line 221
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_d
    check-cast p1, Lk01;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 230
    .line 231
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 232
    .line 233
    if-eqz p1, :cond_6

    .line 234
    .line 235
    move-object v3, p0

    .line 236
    check-cast v3, Landroid/view/ViewGroup;

    .line 237
    .line 238
    :cond_6
    if-nez v3, :cond_7

    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_7
    invoke-static {v3, v1, v1}, Lmj;->ψ(Landroid/view/ViewGroup;ZZ)V

    .line 242
    .line 243
    .line 244
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 245
    .line 246
    return-object p0

    .line 247
    :pswitch_e
    check-cast p1, Ljava/lang/Class;

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    return-object p0

    .line 254
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    sget-object p0, Lmj;->α:Lh22;

    .line 260
    .line 261
    invoke-virtual {p0}, Lh22;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    check-cast p0, Landroid/os/Handler;

    .line 266
    .line 267
    new-instance p1, Ls0;

    .line 268
    .line 269
    invoke-direct {p1, v0}, Ls0;-><init>(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 273
    .line 274
    .line 275
    sget-object p0, Ls62;->α:Ls62;

    .line 276
    .line 277
    return-object p0

    .line 278
    :pswitch_10
    check-cast p1, Ljava/lang/ClassLoader;

    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    sget-object p0, Lfj;->α:Lfj;

    .line 284
    .line 285
    invoke-virtual {p0, p1}, Lfj;->ρ(Ljava/lang/ClassLoader;)V

    .line 286
    .line 287
    .line 288
    sget-object p0, Ls62;->α:Ls62;

    .line 289
    .line 290
    return-object p0

    .line 291
    :pswitch_11
    check-cast p1, Ljava/lang/ClassLoader;

    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    new-instance p0, Lqx;

    .line 297
    .line 298
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 299
    .line 300
    sget-object v0, Lkx;->ｔ:Lkx;

    .line 301
    .line 302
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u8bed\u97f3\u64ad\u653e\u63a7\u4ef6\u7ed1\u5b9a\u5165\u53e3"

    .line 307
    .line 308
    new-instance v2, Lcb;

    .line 309
    .line 310
    const/16 v3, 0xd

    .line 311
    .line 312
    invoke-direct {v2, p1, v3}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 313
    .line 314
    .line 315
    invoke-direct {p0, v0, v1, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 316
    .line 317
    .line 318
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    return-object p0

    .line 323
    :pswitch_12
    check-cast p1, Ljava/util/Map$Entry;

    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 333
    .line 334
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 335
    .line 336
    .line 337
    move-result p0

    .line 338
    xor-int/2addr p0, v1

    .line 339
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    return-object p0

    .line 344
    :pswitch_13
    check-cast p1, Ljava/util/Map$Entry;

    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    check-cast p0, Lbj;

    .line 354
    .line 355
    invoke-virtual {p0}, Lbj;->α()Z

    .line 356
    .line 357
    .line 358
    move-result p0

    .line 359
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    return-object p0

    .line 364
    :pswitch_14
    check-cast p1, Ljava/util/Map$Entry;

    .line 365
    .line 366
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    check-cast p0, Lbj;

    .line 374
    .line 375
    invoke-virtual {p0}, Lbj;->α()Z

    .line 376
    .line 377
    .line 378
    move-result p0

    .line 379
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    return-object p0

    .line 384
    :pswitch_15
    check-cast p1, Ljava/lang/Class;

    .line 385
    .line 386
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    return-object p0

    .line 391
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 397
    .line 398
    .line 399
    move-result p0

    .line 400
    sparse-switch p0, :sswitch_data_0

    .line 401
    .line 402
    .line 403
    goto :goto_4

    .line 404
    :sswitch_0
    const-string p0, "clean_progress_bar_alpha"

    .line 405
    .line 406
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result p0

    .line 410
    if-nez p0, :cond_8

    .line 411
    .line 412
    goto :goto_4

    .line 413
    :sswitch_1
    const-string p0, "clean_progress_bar_restore_alpha_on_pause"

    .line 414
    .line 415
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    if-eqz p0, :cond_9

    .line 420
    .line 421
    goto :goto_2

    .line 422
    :sswitch_2
    const-string p0, "clean_progress_bar_enabled"

    .line 423
    .line 424
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result p0

    .line 428
    if-nez p0, :cond_8

    .line 429
    .line 430
    goto :goto_4

    .line 431
    :sswitch_3
    const-string p0, "*"

    .line 432
    .line 433
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result p0

    .line 437
    if-nez p0, :cond_8

    .line 438
    .line 439
    goto :goto_4

    .line 440
    :sswitch_4
    const-string p0, "clean_progress_bar_only_in_clean_mode"

    .line 441
    .line 442
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result p0

    .line 446
    if-nez p0, :cond_8

    .line 447
    .line 448
    goto :goto_4

    .line 449
    :sswitch_5
    const-string p0, "clean_mode_enabled"

    .line 450
    .line 451
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result p0

    .line 455
    if-nez p0, :cond_8

    .line 456
    .line 457
    goto :goto_4

    .line 458
    :cond_8
    :goto_2
    sget-object p0, Loh;->α:Loh;

    .line 459
    .line 460
    invoke-static {}, Loh;->η()V

    .line 461
    .line 462
    .line 463
    sget-object p0, Loh;->λ:Ljava/util/Set;

    .line 464
    .line 465
    monitor-enter p0

    .line 466
    :try_start_0
    move-object p1, p0

    .line 467
    check-cast p1, Ljava/lang/Iterable;

    .line 468
    .line 469
    invoke-static {p1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 473
    monitor-exit p0

    .line 474
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    :catchall_0
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result p1

    .line 482
    if-eqz p1, :cond_9

    .line 483
    .line 484
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    check-cast p1, Landroid/view/View;

    .line 489
    .line 490
    sget-object v0, Loh;->α:Loh;

    .line 491
    .line 492
    :try_start_1
    invoke-static {p1}, Loh;->α(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 493
    .line 494
    .line 495
    goto :goto_3

    .line 496
    :cond_9
    :goto_4
    sget-object p0, Ls62;->α:Ls62;

    .line 497
    .line 498
    return-object p0

    .line 499
    :catchall_1
    move-exception v0

    .line 500
    move-object p1, v0

    .line 501
    monitor-exit p0

    .line 502
    throw p1

    .line 503
    :pswitch_17
    check-cast p1, Ljava/lang/ClassLoader;

    .line 504
    .line 505
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    sget-object p0, Lkh;->α:Lkh;

    .line 509
    .line 510
    invoke-virtual {p0, p1}, Lkh;->ε(Ljava/lang/ClassLoader;)V

    .line 511
    .line 512
    .line 513
    sget-object p0, Ls62;->α:Ls62;

    .line 514
    .line 515
    return-object p0

    .line 516
    :pswitch_18
    check-cast p1, Ljava/lang/ClassLoader;

    .line 517
    .line 518
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    new-instance p0, Lqx;

    .line 522
    .line 523
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 524
    .line 525
    sget-object v1, Lkx;->Ｕ:Lkx;

    .line 526
    .line 527
    invoke-static {v1, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    const-string v2, "\u5b9a\u4f4d\u6e05\u723d\u6a21\u5f0f\u64ad\u653e\u63a7\u5236\u5668"

    .line 532
    .line 533
    new-instance v3, Lcb;

    .line 534
    .line 535
    const/16 v4, 0xc

    .line 536
    .line 537
    invoke-direct {v3, p1, v4}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 538
    .line 539
    .line 540
    invoke-direct {p0, v1, v2, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 541
    .line 542
    .line 543
    new-instance v1, Lqx;

    .line 544
    .line 545
    sget-object v2, Lkx;->Ｖ:Lkx;

    .line 546
    .line 547
    invoke-static {v2, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    const-string v3, "\u5b9a\u4f4d\u6e05\u723d\u6a21\u5f0f\u64ad\u653e\u6682\u505c\u4e8b\u4ef6\u5206\u53d1\u65b9\u6cd5"

    .line 552
    .line 553
    new-instance v4, Lcb;

    .line 554
    .line 555
    invoke-direct {v4, p1, v0}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 556
    .line 557
    .line 558
    invoke-direct {v1, v2, v3, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 559
    .line 560
    .line 561
    new-instance v0, Lqx;

    .line 562
    .line 563
    sget-object v2, Lkx;->Ｗ:Lkx;

    .line 564
    .line 565
    invoke-static {v2, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    const-string v3, "\u5b9a\u4f4d\u6e05\u723d\u6a21\u5f0f\u64ad\u653e\u6062\u590d\u65b9\u6cd5"

    .line 570
    .line 571
    new-instance v4, Lcb;

    .line 572
    .line 573
    const/16 v5, 0xb

    .line 574
    .line 575
    invoke-direct {v4, p1, v5}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 576
    .line 577
    .line 578
    invoke-direct {v0, v2, v3, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 579
    .line 580
    .line 581
    filled-new-array {p0, v1, v0}, [Lqx;

    .line 582
    .line 583
    .line 584
    move-result-object p0

    .line 585
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 586
    .line 587
    .line 588
    move-result-object p0

    .line 589
    return-object p0

    .line 590
    :pswitch_19
    check-cast p1, Ljava/lang/reflect/Method;

    .line 591
    .line 592
    sget-object p0, Lkh;->α:Lkh;

    .line 593
    .line 594
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    invoke-static {p1}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object p0

    .line 601
    return-object p0

    .line 602
    :pswitch_1a
    check-cast p1, Ljava/lang/reflect/Method;

    .line 603
    .line 604
    sget-object p0, Lkh;->α:Lkh;

    .line 605
    .line 606
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    invoke-static {p1}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object p0

    .line 613
    return-object p0

    .line 614
    :pswitch_1b
    move-object v0, p1

    .line 615
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 616
    .line 617
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    const-string p0, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB94312851DBF90DE22E29AC5FA85873739BB209E3F8E8F8E"

    .line 621
    .line 622
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    const/4 v4, 0x6

    .line 627
    const/4 v5, 0x0

    .line 628
    const/4 v2, 0x0

    .line 629
    const/4 v3, 0x0

    .line 630
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 631
    .line 632
    .line 633
    const-string v1, "void"

    .line 634
    .line 635
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 636
    .line 637
    .line 638
    sget-object p0, Ls62;->α:Ls62;

    .line 639
    .line 640
    return-object p0

    .line 641
    :pswitch_1c
    check-cast p1, Ljava/lang/Class;

    .line 642
    .line 643
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object p0

    .line 647
    return-object p0

    .line 648
    nop

    .line 649
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

    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    :sswitch_data_0
    .sparse-switch
        -0x6b33f525 -> :sswitch_5
        -0x1c7ce618 -> :sswitch_4
        0x2a -> :sswitch_3
        0x3abc8c39 -> :sswitch_2
        0x49dcfb30 -> :sswitch_1
        0x56f29056 -> :sswitch_0
    .end sparse-switch
.end method
