.class public final synthetic Lq00;
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
    iput p1, p0, Lq00;->ε:I

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
    .locals 7

    .line 1
    iget p0, p0, Lq00;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance p0, Ll20;

    .line 15
    .line 16
    invoke-direct {p0, v2}, Ll20;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindClass;->matcher(La80;)Lorg/luckypray/dexkit/query/FindClass;

    .line 20
    .line 21
    .line 22
    sget-object p0, Ls62;->α:Ls62;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance p0, Ll20;

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ll20;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindClass;->matcher(La80;)Lorg/luckypray/dexkit/query/FindClass;

    .line 36
    .line 37
    .line 38
    sget-object p0, Ls62;->α:Ls62;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_1
    check-cast p1, Ljava/lang/ClassLoader;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lm20;->γ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    sget-object p0, Ls62;->α:Ls62;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_2
    check-cast p1, Ljava/lang/ClassLoader;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance p0, Lqx;

    .line 58
    .line 59
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 60
    .line 61
    sget-object v0, Lkx;->Ｇ:Lkx;

    .line 62
    .line 63
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "\u5b9a\u4f4d Feed \u5de6\u53f3\u4fa7\u957f\u6309\u500d\u901f\u63d0\u4f9b\u65b9\u6cd5"

    .line 68
    .line 69
    new-instance v2, Lcb;

    .line 70
    .line 71
    const/16 v3, 0x1d

    .line 72
    .line 73
    invoke-direct {v2, p1, v3}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 74
    .line 75
    .line 76
    invoke-direct {p0, v0, v1, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :pswitch_3
    move-object v0, p1

    .line 85
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const-string v1, "float"

    .line 91
    .line 92
    const/4 v4, 0x6

    .line 93
    const/4 v5, 0x0

    .line 94
    const/4 v2, 0x0

    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 100
    .line 101
    .line 102
    sget-object p0, Ls62;->α:Ls62;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    sparse-switch p0, :sswitch_data_0

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :sswitch_0
    const-string p0, "info_bar_text_format"

    .line 119
    .line 120
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :sswitch_1
    const-string p0, "info_bar_enabled"

    .line 128
    .line 129
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-nez p0, :cond_0

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :sswitch_2
    const-string p0, "info_bar_neon_enabled"

    .line 137
    .line 138
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-nez p0, :cond_0

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :sswitch_3
    const-string p0, "info_bar_text_color"

    .line 146
    .line 147
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-nez p0, :cond_0

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :sswitch_4
    const-string p0, "*"

    .line 155
    .line 156
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-nez p0, :cond_0

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :sswitch_5
    const-string p0, "info_bar_text_size"

    .line 164
    .line 165
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-nez p0, :cond_0

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :sswitch_6
    const-string p0, "info_bar_neon_solid_enabled"

    .line 173
    .line 174
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-nez p0, :cond_0

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_0
    :goto_0
    sget-object p0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 182
    .line 183
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->ι()V

    .line 184
    .line 185
    .line 186
    :cond_1
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_5
    check-cast p1, Lmq;

    .line 190
    .line 191
    sget-object p0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 192
    .line 193
    if-eqz p1, :cond_2

    .line 194
    .line 195
    iget-wide p0, p1, Lmq;->δ:J

    .line 196
    .line 197
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    :cond_2
    invoke-static {v1}, Lcom/example/dyhelper/hook/γ;->κ(Ljava/lang/Long;)V

    .line 202
    .line 203
    .line 204
    sget-object p0, Ls62;->α:Ls62;

    .line 205
    .line 206
    return-object p0

    .line 207
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    const/16 p0, 0x2e

    .line 213
    .line 214
    invoke-static {p1, p0, p1}, Lq02;->ц(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0

    .line 219
    :pswitch_7
    check-cast p1, Ljava/lang/ClassLoader;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    sget-object p0, Ln10;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 225
    .line 226
    invoke-static {p1}, Ln10;->γ(Ljava/lang/ClassLoader;)V

    .line 227
    .line 228
    .line 229
    sget-object p0, Ls62;->α:Ls62;

    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_8
    check-cast p1, Ljava/lang/ClassLoader;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    new-instance p0, Lqx;

    .line 238
    .line 239
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 240
    .line 241
    sget-object v0, Lkx;->Ｓ:Lkx;

    .line 242
    .line 243
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    const-string v1, "\u5b9a\u4f4d Feed \u5173\u6ce8\u63d0\u4ea4\u5165\u53e3"

    .line 248
    .line 249
    new-instance v2, Lcb;

    .line 250
    .line 251
    const/16 v3, 0x1c

    .line 252
    .line 253
    invoke-direct {v2, p1, v3}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 254
    .line 255
    .line 256
    invoke-direct {p0, v0, v1, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 257
    .line 258
    .line 259
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    return-object p0

    .line 264
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    sget-object p0, Li10;->α:Li10;

    .line 270
    .line 271
    invoke-virtual {p0}, Li10;->γ()V

    .line 272
    .line 273
    .line 274
    sget-object p0, Ls62;->α:Ls62;

    .line 275
    .line 276
    return-object p0

    .line 277
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    const-string p0, "*"

    .line 283
    .line 284
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result p0

    .line 288
    if-nez p0, :cond_3

    .line 289
    .line 290
    const-string p0, "feed_double_tap_like_block_enabled"

    .line 291
    .line 292
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result p0

    .line 296
    if-eqz p0, :cond_4

    .line 297
    .line 298
    :cond_3
    sget-object p0, Li10;->α:Li10;

    .line 299
    .line 300
    invoke-virtual {p0}, Li10;->γ()V

    .line 301
    .line 302
    .line 303
    :cond_4
    sget-object p0, Ls62;->α:Ls62;

    .line 304
    .line 305
    return-object p0

    .line 306
    :pswitch_b
    check-cast p1, Ljava/util/List;

    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    sget-object p0, Lg10;->ε:Ljava/lang/Object;

    .line 312
    .line 313
    monitor-enter p0

    .line 314
    :try_start_0
    sget-object v0, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-nez v0, :cond_6

    .line 321
    .line 322
    sget-object v0, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 323
    .line 324
    invoke-static {p1}, Lg10;->δ(Ljava/util/List;)V

    .line 325
    .line 326
    .line 327
    invoke-static {p1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    check-cast p1, Ljava/lang/reflect/Method;

    .line 332
    .line 333
    if-eqz p1, :cond_6

    .line 334
    .line 335
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    if-eqz p1, :cond_6

    .line 340
    .line 341
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 342
    .line 343
    .line 344
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 345
    if-eqz p1, :cond_6

    .line 346
    .line 347
    :try_start_1
    sget-object v0, Lc10;->α:Lc10;

    .line 348
    .line 349
    invoke-static {p1}, Lc10;->η(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 353
    goto :goto_2

    .line 354
    :catchall_0
    move-exception v0

    .line 355
    move-object p1, v0

    .line 356
    :try_start_2
    new-instance v0, Leo1;

    .line 357
    .line 358
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 359
    .line 360
    .line 361
    move-object p1, v0

    .line 362
    :goto_2
    sget-object v0, Ljz;->ε:Ljz;

    .line 363
    .line 364
    instance-of v1, p1, Leo1;

    .line 365
    .line 366
    if-eqz v1, :cond_5

    .line 367
    .line 368
    move-object p1, v0

    .line 369
    :cond_5
    check-cast p1, Ljava/util/List;

    .line 370
    .line 371
    sget-object v0, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 372
    .line 373
    invoke-static {p1}, Lg10;->ε(Ljava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 374
    .line 375
    .line 376
    goto :goto_3

    .line 377
    :catchall_1
    move-exception v0

    .line 378
    move-object p1, v0

    .line 379
    goto :goto_4

    .line 380
    :cond_6
    :goto_3
    monitor-exit p0

    .line 381
    sget-object p0, Ls62;->α:Ls62;

    .line 382
    .line 383
    return-object p0

    .line 384
    :goto_4
    monitor-exit p0

    .line 385
    throw p1

    .line 386
    :pswitch_c
    move-object v0, p1

    .line 387
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 388
    .line 389
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    const-string p0, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"

    .line 393
    .line 394
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    const/4 v4, 0x6

    .line 399
    const/4 v5, 0x0

    .line 400
    const/4 v2, 0x0

    .line 401
    const/4 v3, 0x0

    .line 402
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 403
    .line 404
    .line 405
    const-string v1, "void"

    .line 406
    .line 407
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 408
    .line 409
    .line 410
    const-class p0, Landroid/view/MotionEvent;

    .line 411
    .line 412
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    filled-new-array {p0}, [Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 421
    .line 422
    .line 423
    sget-object p0, Ls62;->α:Ls62;

    .line 424
    .line 425
    return-object p0

    .line 426
    :pswitch_d
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 427
    .line 428
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    new-instance p0, Lq00;

    .line 432
    .line 433
    const/16 v0, 0x10

    .line 434
    .line 435
    invoke-direct {p0, v0}, Lq00;-><init>(I)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 439
    .line 440
    .line 441
    sget-object p0, Ls62;->α:Ls62;

    .line 442
    .line 443
    return-object p0

    .line 444
    :pswitch_e
    check-cast p1, Ljava/lang/ClassLoader;

    .line 445
    .line 446
    sget-object p0, Ls62;->α:Ls62;

    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    sget-object v0, Lc10;->α:Lc10;

    .line 452
    .line 453
    invoke-virtual {v0, p1, v2}, Lc10;->ζ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-nez v0, :cond_8

    .line 462
    .line 463
    sget-object v0, Lc10;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    :cond_7
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    if-eqz v0, :cond_8

    .line 474
    .line 475
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    check-cast v0, La80;

    .line 480
    .line 481
    :try_start_3
    invoke-interface {v0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 482
    .line 483
    .line 484
    move-object v3, p0

    .line 485
    goto :goto_6

    .line 486
    :catchall_2
    move-exception v0

    .line 487
    new-instance v3, Leo1;

    .line 488
    .line 489
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 490
    .line 491
    .line 492
    :goto_6
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    if-eqz v0, :cond_7

    .line 497
    .line 498
    const-string v3, "rc8611bc391e3e31b"

    .line 499
    .line 500
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    const-string v4, "\u901a\u77e5\u53cc\u51fb\u5165\u53e3\u89e3\u6790\u7ed3\u679c\u5931\u8d25: "

    .line 505
    .line 506
    invoke-static {v4, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    const/4 v4, 0x4

    .line 511
    invoke-static {v3, v0, v1, v4, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    goto :goto_5

    .line 515
    :cond_8
    return-object p0

    .line 516
    :pswitch_f
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
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 524
    .line 525
    sget-object v0, Lkx;->З:Lkx;

    .line 526
    .line 527
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    const-string v1, "\u5b9a\u4f4d Feed \u539f\u751f\u53cc\u51fb\u70b9\u8d5e\u5165\u53e3"

    .line 532
    .line 533
    new-instance v2, Lcb;

    .line 534
    .line 535
    const/16 v3, 0x1b

    .line 536
    .line 537
    invoke-direct {v2, p1, v3}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 538
    .line 539
    .line 540
    invoke-direct {p0, v0, v1, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 541
    .line 542
    .line 543
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    return-object p0

    .line 548
    :pswitch_10
    check-cast p1, Ljava/lang/Class;

    .line 549
    .line 550
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    return-object p0

    .line 555
    :pswitch_11
    check-cast p1, Ljava/lang/ClassLoader;

    .line 556
    .line 557
    sget-object p0, Ls62;->α:Ls62;

    .line 558
    .line 559
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    sget-object v1, Lx00;->α:Lx00;

    .line 563
    .line 564
    :try_start_4
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 565
    .line 566
    const-string v1, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950BD40139730D1F55377227BCD8D5E99"

    .line 567
    .line 568
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    invoke-static {p1, v1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    const-string v3, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 577
    .line 578
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    invoke-static {p1, v3}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    invoke-static {v1, v0}, Lx00;->κ(Ljava/lang/Class;Z)Ljava/lang/reflect/Method;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    if-nez v4, :cond_9

    .line 591
    .line 592
    goto :goto_8

    .line 593
    :cond_9
    invoke-static {v1, v2}, Lx00;->κ(Ljava/lang/Class;Z)Ljava/lang/reflect/Method;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    if-nez v1, :cond_a

    .line 598
    .line 599
    goto :goto_8

    .line 600
    :cond_a
    invoke-static {p1, v0, v2}, Lx00;->ι(Ljava/lang/ClassLoader;ZZ)Ljava/util/List;

    .line 601
    .line 602
    .line 603
    move-result-object v5

    .line 604
    invoke-static {v5, v4, v0, v3}, Lx00;->β(Ljava/util/List;Ljava/lang/reflect/Method;ZLjava/lang/Class;)V

    .line 605
    .line 606
    .line 607
    invoke-static {p1, v2, v2}, Lx00;->ι(Ljava/lang/ClassLoader;ZZ)Ljava/util/List;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    invoke-static {p1, v1, v2, v3}, Lx00;->β(Ljava/util/List;Ljava/lang/reflect/Method;ZLjava/lang/Class;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 612
    .line 613
    .line 614
    move-object v0, p0

    .line 615
    goto :goto_7

    .line 616
    :catchall_3
    move-exception v0

    .line 617
    move-object p1, v0

    .line 618
    new-instance v0, Leo1;

    .line 619
    .line 620
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 621
    .line 622
    .line 623
    :goto_7
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 624
    .line 625
    .line 626
    move-result-object p1

    .line 627
    if-eqz p1, :cond_b

    .line 628
    .line 629
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object p1

    .line 633
    const-string v0, "r3785f68dc0e82f54"

    .line 634
    .line 635
    invoke-static {v0, p1}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    :cond_b
    :goto_8
    return-object p0

    .line 639
    :pswitch_12
    check-cast p1, Ljava/lang/ClassLoader;

    .line 640
    .line 641
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 645
    .line 646
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 647
    .line 648
    filled-new-array {p0, v0}, [Ljava/lang/Boolean;

    .line 649
    .line 650
    .line 651
    move-result-object p0

    .line 652
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 653
    .line 654
    .line 655
    move-result-object p0

    .line 656
    new-instance v0, Ljava/util/ArrayList;

    .line 657
    .line 658
    const/16 v1, 0xa

    .line 659
    .line 660
    invoke-static {p0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 665
    .line 666
    .line 667
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 668
    .line 669
    .line 670
    move-result-object p0

    .line 671
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 672
    .line 673
    .line 674
    move-result v1

    .line 675
    if-eqz v1, :cond_d

    .line 676
    .line 677
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    check-cast v1, Ljava/lang/Boolean;

    .line 682
    .line 683
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    sget-object v3, Lx00;->α:Lx00;

    .line 688
    .line 689
    if-eqz v1, :cond_c

    .line 690
    .line 691
    sget-object v3, Lkx;->η:Lkx;

    .line 692
    .line 693
    goto :goto_a

    .line 694
    :cond_c
    sget-object v3, Lkx;->θ:Lkx;

    .line 695
    .line 696
    :goto_a
    new-instance v4, Lqx;

    .line 697
    .line 698
    sget-object v5, Lox;->α:Ljava/lang/Object;

    .line 699
    .line 700
    invoke-static {v3, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v5

    .line 704
    iget-object v3, v3, Lkx;->ζ:Ljava/lang/String;

    .line 705
    .line 706
    new-instance v6, Lv00;

    .line 707
    .line 708
    invoke-direct {v6, p1, v1, v2}, Lv00;-><init>(Ljava/lang/Object;ZI)V

    .line 709
    .line 710
    .line 711
    invoke-direct {v4, v5, v3, v6}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    goto :goto_9

    .line 718
    :cond_d
    return-object v0

    .line 719
    :pswitch_13
    check-cast p1, Ljava/lang/reflect/Method;

    .line 720
    .line 721
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object p0

    .line 725
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    move-result-object p1

    .line 729
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    new-instance v0, Lq00;

    .line 733
    .line 734
    const/16 v2, 0xc

    .line 735
    .line 736
    invoke-direct {v0, v2}, Lq00;-><init>(I)V

    .line 737
    .line 738
    .line 739
    const/16 v2, 0x1f

    .line 740
    .line 741
    invoke-static {p1, v1, v1, v0, v2}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object p1

    .line 745
    new-instance v0, Ljava/lang/StringBuilder;

    .line 746
    .line 747
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    const-string p0, "("

    .line 754
    .line 755
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    const-string p0, ")"

    .line 762
    .line 763
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object p0

    .line 770
    return-object p0

    .line 771
    :pswitch_14
    check-cast p1, Ljava/lang/Class;

    .line 772
    .line 773
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object p0

    .line 777
    return-object p0

    .line 778
    :pswitch_15
    move-object v0, p1

    .line 779
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 780
    .line 781
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    const-string p0, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950A26F12973BD1F55377227BCD8D5E99"

    .line 785
    .line 786
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    const/4 v4, 0x6

    .line 791
    const/4 v5, 0x0

    .line 792
    const/4 v2, 0x0

    .line 793
    const/4 v3, 0x0

    .line 794
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 795
    .line 796
    .line 797
    const-string p0, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 798
    .line 799
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 804
    .line 805
    .line 806
    sget-object p0, Ls62;->α:Ls62;

    .line 807
    .line 808
    return-object p0

    .line 809
    :pswitch_16
    check-cast p1, Lorg/luckypray/dexkit/query/FindField;

    .line 810
    .line 811
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    new-instance p0, Lq00;

    .line 815
    .line 816
    const/4 v0, 0x7

    .line 817
    invoke-direct {p0, v0}, Lq00;-><init>(I)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindField;->matcher(La80;)Lorg/luckypray/dexkit/query/FindField;

    .line 821
    .line 822
    .line 823
    sget-object p0, Ls62;->α:Ls62;

    .line 824
    .line 825
    return-object p0

    .line 826
    :pswitch_17
    check-cast p1, Ljava/lang/reflect/Field;

    .line 827
    .line 828
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 832
    .line 833
    .line 834
    sget-object p0, Ls62;->α:Ls62;

    .line 835
    .line 836
    return-object p0

    .line 837
    :pswitch_18
    check-cast p1, Ljava/lang/reflect/Field;

    .line 838
    .line 839
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 843
    .line 844
    .line 845
    move-result p0

    .line 846
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 847
    .line 848
    .line 849
    move-result p0

    .line 850
    xor-int/2addr p0, v0

    .line 851
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 852
    .line 853
    .line 854
    move-result-object p0

    .line 855
    return-object p0

    .line 856
    :pswitch_19
    check-cast p1, Ljava/lang/Class;

    .line 857
    .line 858
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    new-instance p0, Ljava/util/ArrayList;

    .line 862
    .line 863
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 864
    .line 865
    .line 866
    :goto_b
    if-eqz p1, :cond_e

    .line 867
    .line 868
    const-class v1, Ljava/lang/Object;

    .line 869
    .line 870
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    move-result v1

    .line 874
    if-nez v1, :cond_e

    .line 875
    .line 876
    invoke-static {p1, p0}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 877
    .line 878
    .line 879
    move-result-object p1

    .line 880
    goto :goto_b

    .line 881
    :cond_e
    new-instance p1, Lf7;

    .line 882
    .line 883
    invoke-direct {p1, v0, p0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    return-object p1

    .line 887
    :pswitch_1a
    check-cast p1, Ljava/lang/ClassLoader;

    .line 888
    .line 889
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 890
    .line 891
    .line 892
    invoke-static {p1, v2}, Lu00;->β(Ljava/lang/ClassLoader;Z)V

    .line 893
    .line 894
    .line 895
    sget-object p0, Ls62;->α:Ls62;

    .line 896
    .line 897
    return-object p0

    .line 898
    :pswitch_1b
    check-cast p1, Ljava/lang/ClassLoader;

    .line 899
    .line 900
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    new-instance p0, Lqx;

    .line 904
    .line 905
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 906
    .line 907
    sget-object v0, Lkx;->Т:Lkx;

    .line 908
    .line 909
    invoke-static {v0, p1}, Lox;->ζ(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    const-string v1, "\u5b9a\u4f4d Feed ViewHolder \u5f53\u524d\u4f5c\u54c1\u5b57\u6bb5"

    .line 914
    .line 915
    new-instance v2, Lcb;

    .line 916
    .line 917
    const/16 v3, 0x1a

    .line 918
    .line 919
    invoke-direct {v2, p1, v3}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 920
    .line 921
    .line 922
    invoke-direct {p0, v0, v1, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 923
    .line 924
    .line 925
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 926
    .line 927
    .line 928
    move-result-object p0

    .line 929
    return-object p0

    .line 930
    :pswitch_1c
    check-cast p1, Ljava/lang/reflect/Field;

    .line 931
    .line 932
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 936
    .line 937
    .line 938
    move-result p0

    .line 939
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 940
    .line 941
    .line 942
    move-result p0

    .line 943
    if-nez p0, :cond_f

    .line 944
    .line 945
    sget-object p0, Ls00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 946
    .line 947
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    move-result-object p0

    .line 951
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    invoke-static {p0}, Ls00;->α(Ljava/lang/Class;)Z

    .line 955
    .line 956
    .line 957
    move-result p0

    .line 958
    if-eqz p0, :cond_f

    .line 959
    .line 960
    goto :goto_c

    .line 961
    :cond_f
    move v0, v2

    .line 962
    :goto_c
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 963
    .line 964
    .line 965
    move-result-object p0

    .line 966
    return-object p0

    .line 967
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

    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    :sswitch_data_0
    .sparse-switch
        -0x62384a9f -> :sswitch_6
        -0x1fe54f2a -> :sswitch_5
        0x2a -> :sswitch_4
        0x225c792e -> :sswitch_3
        0x264019f5 -> :sswitch_2
        0x27af1904 -> :sswitch_1
        0x2e53e78c -> :sswitch_0
    .end sparse-switch
.end method
