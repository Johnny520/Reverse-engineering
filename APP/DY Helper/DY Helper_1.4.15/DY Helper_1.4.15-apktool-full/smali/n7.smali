.class public final synthetic Ln7;
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
    iput p1, p0, Ln7;->ε:I

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
    .locals 11

    .line 1
    iget p0, p0, Ln7;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 5
    .line 6
    const/16 v2, 0xa28

    .line 7
    .line 8
    const/4 v3, 0x7

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p0, Lwe;

    .line 20
    .line 21
    invoke-direct {p0, v5}, Lwe;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 25
    .line 26
    .line 27
    sget-object p0, Ls62;->α:Ls62;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, Ljava/lang/ClassLoader;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object p0, Lbf;->α:Lbf;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lbf;->δ(Ljava/lang/ClassLoader;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Ls62;->α:Ls62;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, Ljava/lang/ClassLoader;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance p0, Lqx;

    .line 49
    .line 50
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 51
    .line 52
    sget-object v0, Lkx;->Ｄ:Lkx;

    .line 53
    .line 54
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v1, Lcb;

    .line 59
    .line 60
    invoke-direct {v1, p1, v3}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 61
    .line 62
    .line 63
    const-string p1, "\u5b9a\u4f4d\u89c6\u9891\u7ae0\u8282\u5e7f\u544a\u81ea\u52a8\u8df3\u8fc7\u903b\u8f91"

    .line 64
    .line 65
    invoke-direct {p0, v0, p1, v1}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_2
    check-cast p1, Ljava/lang/Class;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_3
    check-cast p1, Ljava/lang/ClassLoader;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance p0, Lqx;

    .line 86
    .line 87
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 88
    .line 89
    sget-object v0, Lkx;->Я:Lkx;

    .line 90
    .line 91
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v1, Lcb;

    .line 96
    .line 97
    const/4 v2, 0x3

    .line 98
    invoke-direct {v1, p1, v2}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 99
    .line 100
    .line 101
    const-string v2, "\u626b\u63cf\u5e95\u680f Tab ID \u65b9\u6cd5"

    .line 102
    .line 103
    invoke-direct {p0, v0, v2, v1}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 104
    .line 105
    .line 106
    new-instance v0, Lqx;

    .line 107
    .line 108
    sget-object v1, Lkx;->ｂ:Lkx;

    .line 109
    .line 110
    invoke-static {v1, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    new-instance v2, Lcb;

    .line 115
    .line 116
    const/4 v3, 0x4

    .line 117
    invoke-direct {v2, p1, v3}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 118
    .line 119
    .line 120
    const-string v3, "\u8bc6\u522b\u5e95\u680f\u771f\u5b9e\u6570\u636e\u6e90\u7c7b"

    .line 121
    .line 122
    invoke-direct {v0, v1, v3, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 123
    .line 124
    .line 125
    new-instance v1, Lqx;

    .line 126
    .line 127
    sget-object v2, Lkx;->ｃ:Lkx;

    .line 128
    .line 129
    invoke-static {v2, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    new-instance v3, Lcb;

    .line 134
    .line 135
    const/4 v4, 0x5

    .line 136
    invoke-direct {v3, p1, v4}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 137
    .line 138
    .line 139
    const-string v4, "\u8bc6\u522b\u5e95\u680f\u771f\u5b9e\u6570\u636e\u6e90\u5217\u8868\u65b9\u6cd5"

    .line 140
    .line 141
    invoke-direct {v1, v2, v4, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 142
    .line 143
    .line 144
    new-instance v2, Lqx;

    .line 145
    .line 146
    sget-object v3, Lkx;->ａ:Lkx;

    .line 147
    .line 148
    invoke-static {v3, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    new-instance v4, Lcb;

    .line 153
    .line 154
    const/4 v5, 0x6

    .line 155
    invoke-direct {v4, p1, v5}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 156
    .line 157
    .line 158
    const-string p1, "\u8bc6\u522b\u5e95\u680f\u6570\u636e\u6e90\u5165\u53e3\u65b9\u6cd5"

    .line 159
    .line 160
    invoke-direct {v2, v3, p1, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 161
    .line 162
    .line 163
    filled-new-array {p0, v0, v1, v2}, [Lqx;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Method;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 178
    .line 179
    .line 180
    sget-object p0, Ls62;->α:Ls62;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_5
    check-cast p1, Ljava/lang/reflect/Method;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    sget-object p0, Lvb;->α:Ljava/util/List;

    .line 189
    .line 190
    invoke-static {p1}, Lvb;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :pswitch_6
    check-cast p1, Ll91;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    iget-object p0, p1, Ll91;->ε:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p0, Ljava/lang/reflect/Method;

    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_7
    check-cast p1, Ll91;

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object p0, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast p0, Ljava/lang/Number;

    .line 213
    .line 214
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-lt p0, v2, :cond_0

    .line 219
    .line 220
    move v4, v5

    .line 221
    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/Method;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    sget-object p0, Lvb;->α:Ljava/util/List;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 234
    .line 235
    .line 236
    move-result p0

    .line 237
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-nez p0, :cond_1

    .line 242
    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    array-length p0, p0

    .line 253
    if-nez p0, :cond_b

    .line 254
    .line 255
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    if-nez p0, :cond_b

    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    if-eqz p0, :cond_2

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_3

    .line 277
    .line 278
    goto :goto_1

    .line 279
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_4

    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_4
    const-class v0, Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_5

    .line 293
    .line 294
    goto :goto_1

    .line 295
    :cond_5
    const-class v0, Ljava/lang/Number;

    .line 296
    .line 297
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_6

    .line 302
    .line 303
    goto :goto_1

    .line 304
    :cond_6
    const-class v0, Ljava/lang/Boolean;

    .line 305
    .line 306
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_7

    .line 311
    .line 312
    goto :goto_1

    .line 313
    :cond_7
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-static {v0}, Lvb;->κ(Ljava/lang/String;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_8

    .line 326
    .line 327
    goto :goto_0

    .line 328
    :cond_8
    move v2, v4

    .line 329
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_9

    .line 334
    .line 335
    add-int/lit16 v2, v2, 0x3e8

    .line 336
    .line 337
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v0}, Lvb;->κ(Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-eqz v0, :cond_a

    .line 346
    .line 347
    add-int/lit16 v2, v2, 0x4b0

    .line 348
    .line 349
    :cond_a
    move v4, v2

    .line 350
    invoke-static {p0}, Lvb;->θ(Ljava/lang/Class;)Z

    .line 351
    .line 352
    .line 353
    move-result p0

    .line 354
    if-eqz p0, :cond_b

    .line 355
    .line 356
    add-int/lit16 v4, v4, 0x708

    .line 357
    .line 358
    :cond_b
    :goto_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    new-instance v0, Ll91;

    .line 363
    .line 364
    invoke-direct {v0, p1, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    return-object v0

    .line 368
    :pswitch_9
    check-cast p1, Ljava/lang/reflect/Method;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual {p1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 374
    .line 375
    .line 376
    sget-object p0, Ls62;->α:Ls62;

    .line 377
    .line 378
    return-object p0

    .line 379
    :pswitch_a
    check-cast p1, Ljava/lang/reflect/Method;

    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    sget-object p0, Lvb;->α:Ljava/util/List;

    .line 385
    .line 386
    invoke-static {p1}, Lvb;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    return-object p0

    .line 391
    :pswitch_b
    check-cast p1, Ll91;

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    iget-object p0, p1, Ll91;->ε:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast p0, Ljava/lang/reflect/Method;

    .line 399
    .line 400
    return-object p0

    .line 401
    :pswitch_c
    check-cast p1, Ll91;

    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    iget-object p0, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast p0, Ljava/lang/Number;

    .line 409
    .line 410
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result p0

    .line 414
    const/16 p1, 0x9c4

    .line 415
    .line 416
    if-lt p0, p1, :cond_c

    .line 417
    .line 418
    move v4, v5

    .line 419
    :cond_c
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    return-object p0

    .line 424
    :pswitch_d
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 425
    .line 426
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    if-nez p0, :cond_d

    .line 434
    .line 435
    move v4, v5

    .line 436
    :cond_d
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 437
    .line 438
    .line 439
    move-result-object p0

    .line 440
    return-object p0

    .line 441
    :pswitch_e
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 442
    .line 443
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    if-nez p0, :cond_e

    .line 451
    .line 452
    move v4, v5

    .line 453
    :cond_e
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    return-object p0

    .line 458
    :pswitch_f
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 459
    .line 460
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    if-nez p0, :cond_f

    .line 468
    .line 469
    move v4, v5

    .line 470
    :cond_f
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    return-object p0

    .line 475
    :pswitch_10
    check-cast p1, Ljava/util/List;

    .line 476
    .line 477
    sget-object p0, Lsb;->α:Lsb;

    .line 478
    .line 479
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 483
    .line 484
    .line 485
    move-result-object p0

    .line 486
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 487
    .line 488
    .line 489
    move-result p1

    .line 490
    if-eqz p1, :cond_13

    .line 491
    .line 492
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    check-cast p1, Leb;

    .line 497
    .line 498
    iget-object v0, p1, Leb;->β:Ljava/lang/reflect/Method;

    .line 499
    .line 500
    iget-object v1, p1, Leb;->α:Ldb;

    .line 501
    .line 502
    new-instance v2, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    const/16 v3, 0x23

    .line 519
    .line 520
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    const/16 v3, 0x28

    .line 531
    .line 532
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    array-length v6, v3

    .line 543
    move v7, v4

    .line 544
    move v8, v7

    .line 545
    :goto_3
    if-ge v7, v6, :cond_11

    .line 546
    .line 547
    aget-object v9, v3, v7

    .line 548
    .line 549
    add-int/lit8 v10, v8, 0x1

    .line 550
    .line 551
    if-lez v8, :cond_10

    .line 552
    .line 553
    const/16 v8, 0x2c

    .line 554
    .line 555
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    :cond_10
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v8

    .line 562
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    add-int/lit8 v7, v7, 0x1

    .line 566
    .line 567
    move v8, v10

    .line 568
    goto :goto_3

    .line 569
    :cond_11
    const-string v3, "):"

    .line 570
    .line 571
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    new-instance v3, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    const-string v1, ":"

    .line 598
    .line 599
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    sget-object v2, Lsb;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 610
    .line 611
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    if-nez v2, :cond_12

    .line 616
    .line 617
    goto/16 :goto_2

    .line 618
    .line 619
    :cond_12
    :try_start_0
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 620
    .line 621
    .line 622
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    invoke-virtual {v2, v0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    sget-object v2, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 631
    .line 632
    invoke-interface {v0, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    new-instance v2, Lob;

    .line 637
    .line 638
    invoke-direct {v2, v4, p1}, Lob;-><init>(ILjava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    invoke-interface {v0, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 642
    .line 643
    .line 644
    new-instance p1, Ljava/lang/StringBuilder;

    .line 645
    .line 646
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 647
    .line 648
    .line 649
    const-string v0, "rd466a70296c65486"

    .line 650
    .line 651
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object p1

    .line 661
    invoke-static {p1}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 662
    .line 663
    .line 664
    goto/16 :goto_2

    .line 665
    .line 666
    :catchall_0
    move-exception p1

    .line 667
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object p1

    .line 671
    const-string v0, "ree4cc28326ce6af4"

    .line 672
    .line 673
    invoke-static {v0, v1, p1}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    goto/16 :goto_2

    .line 677
    .line 678
    :cond_13
    new-instance p0, Lo7;

    .line 679
    .line 680
    const/16 p1, 0xe

    .line 681
    .line 682
    invoke-direct {p0, p1}, Lo7;-><init>(I)V

    .line 683
    .line 684
    .line 685
    invoke-static {p0}, Lsb;->Ψ(Lp70;)V

    .line 686
    .line 687
    .line 688
    sget-object p0, Ls62;->α:Ls62;

    .line 689
    .line 690
    return-object p0

    .line 691
    :pswitch_11
    check-cast p1, Ljava/lang/reflect/Method;

    .line 692
    .line 693
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object p0

    .line 697
    const-string p1, "addView"

    .line 698
    .line 699
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    move-result p0

    .line 703
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 704
    .line 705
    .line 706
    move-result-object p0

    .line 707
    return-object p0

    .line 708
    :pswitch_12
    check-cast p1, Ljava/lang/Class;

    .line 709
    .line 710
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    sget-object p0, Lsb;->α:Lsb;

    .line 714
    .line 715
    sget-object p0, Lsb;->Γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 716
    .line 717
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    move-result p0

    .line 725
    if-nez p0, :cond_14

    .line 726
    .line 727
    goto/16 :goto_9

    .line 728
    .line 729
    :cond_14
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object p0

    .line 733
    sget-boolean v0, Lsb;->ο:Z

    .line 734
    .line 735
    new-instance v1, Ljava/lang/StringBuilder;

    .line 736
    .line 737
    const-string v2, "r7e5a560c5f86f955"

    .line 738
    .line 739
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object p0

    .line 752
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 753
    .line 754
    .line 755
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 756
    .line 757
    .line 758
    move-result-object p0

    .line 759
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    array-length v0, p0

    .line 763
    move v1, v4

    .line 764
    :goto_4
    if-ge v1, v0, :cond_15

    .line 765
    .line 766
    aget-object v2, p0, v1

    .line 767
    .line 768
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 769
    .line 770
    .line 771
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 772
    .line 773
    .line 774
    move-result-object v3

    .line 775
    invoke-virtual {v3, v2}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    sget-object v3, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 780
    .line 781
    invoke-interface {v2, v3}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    new-instance v3, Lib;

    .line 786
    .line 787
    const/16 v6, 0x14

    .line 788
    .line 789
    invoke-direct {v3, v6}, Lib;-><init>(I)V

    .line 790
    .line 791
    .line 792
    invoke-interface {v2, v3}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 793
    .line 794
    .line 795
    add-int/lit8 v1, v1, 0x1

    .line 796
    .line 797
    goto :goto_4

    .line 798
    :catchall_1
    move-exception p0

    .line 799
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object p0

    .line 803
    const-string v0, "rfefddf9488cb9808"

    .line 804
    .line 805
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    :cond_15
    :try_start_2
    new-instance p0, Ljava/util/HashSet;

    .line 809
    .line 810
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 811
    .line 812
    .line 813
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    array-length v1, v0

    .line 821
    move v2, v4

    .line 822
    :goto_5
    if-ge v2, v1, :cond_17

    .line 823
    .line 824
    aget-object v3, v0, v2

    .line 825
    .line 826
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 827
    .line 828
    .line 829
    move-result v6

    .line 830
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 831
    .line 832
    .line 833
    move-result v6

    .line 834
    if-nez v6, :cond_16

    .line 835
    .line 836
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 837
    .line 838
    .line 839
    move-result v6

    .line 840
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    .line 841
    .line 842
    .line 843
    move-result v6

    .line 844
    if-nez v6, :cond_16

    .line 845
    .line 846
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v6

    .line 850
    invoke-virtual {p0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 854
    if-eqz v6, :cond_16

    .line 855
    .line 856
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 857
    .line 858
    .line 859
    move-result-object v6

    .line 860
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    invoke-static {v6}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 864
    .line 865
    .line 866
    move-result-object v6

    .line 867
    new-instance v7, Lnb;

    .line 868
    .line 869
    invoke-direct {v7, v4, v3}, Lnb;-><init>(ILjava/lang/reflect/Method;)V

    .line 870
    .line 871
    .line 872
    new-instance v3, Ly30;

    .line 873
    .line 874
    invoke-direct {v3, v6, v5, v7}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 875
    .line 876
    .line 877
    new-instance v6, Lx30;

    .line 878
    .line 879
    invoke-direct {v6, v3}, Lx30;-><init>(Ly30;)V

    .line 880
    .line 881
    .line 882
    :goto_6
    invoke-virtual {v6}, Lx30;->hasNext()Z

    .line 883
    .line 884
    .line 885
    move-result v3

    .line 886
    if-eqz v3, :cond_16

    .line 887
    .line 888
    invoke-virtual {v6}, Lx30;->next()Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    check-cast v3, Ljava/lang/reflect/Method;

    .line 893
    .line 894
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 895
    .line 896
    .line 897
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 898
    .line 899
    .line 900
    move-result-object v7

    .line 901
    invoke-virtual {v7, v3}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    sget-object v7, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 906
    .line 907
    invoke-interface {v3, v7}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 908
    .line 909
    .line 910
    move-result-object v3

    .line 911
    new-instance v7, Lib;

    .line 912
    .line 913
    const/16 v8, 0x15

    .line 914
    .line 915
    invoke-direct {v7, v8}, Lib;-><init>(I)V

    .line 916
    .line 917
    .line 918
    invoke-interface {v3, v7}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 919
    .line 920
    .line 921
    goto :goto_6

    .line 922
    :catchall_2
    move-exception p0

    .line 923
    goto :goto_7

    .line 924
    :catchall_3
    :cond_16
    add-int/lit8 v2, v2, 0x1

    .line 925
    .line 926
    goto :goto_5

    .line 927
    :goto_7
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object p0

    .line 931
    const-string v0, "r3850277bce1edbdb"

    .line 932
    .line 933
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    :cond_17
    const-string p0, "onTouchEvent"

    .line 937
    .line 938
    const-string v0, "performClick"

    .line 939
    .line 940
    const-string v1, "dispatchTouchEvent"

    .line 941
    .line 942
    filled-new-array {v1, p0, v0}, [Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object p0

    .line 946
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 947
    .line 948
    .line 949
    move-result-object p0

    .line 950
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 951
    .line 952
    .line 953
    move-result-object p0

    .line 954
    :catchall_4
    :cond_18
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 955
    .line 956
    .line 957
    move-result v0

    .line 958
    if-eqz v0, :cond_19

    .line 959
    .line 960
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    check-cast v0, Ljava/lang/String;

    .line 965
    .line 966
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    invoke-static {v1}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    new-instance v2, Ls9;

    .line 978
    .line 979
    invoke-direct {v2, v0, v5}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 980
    .line 981
    .line 982
    new-instance v0, Ly30;

    .line 983
    .line 984
    invoke-direct {v0, v1, v5, v2}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 985
    .line 986
    .line 987
    new-instance v1, Lx30;

    .line 988
    .line 989
    invoke-direct {v1, v0}, Lx30;-><init>(Ly30;)V

    .line 990
    .line 991
    .line 992
    :goto_8
    invoke-virtual {v1}, Lx30;->hasNext()Z

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    if-eqz v0, :cond_18

    .line 997
    .line 998
    invoke-virtual {v1}, Lx30;->next()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1003
    .line 1004
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1005
    .line 1006
    .line 1007
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v2

    .line 1011
    invoke-virtual {v2, v0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    sget-object v2, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 1016
    .line 1017
    invoke-interface {v0, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    new-instance v2, Lib;

    .line 1022
    .line 1023
    const/16 v3, 0xb

    .line 1024
    .line 1025
    invoke-direct {v2, v3}, Lib;-><init>(I)V

    .line 1026
    .line 1027
    .line 1028
    invoke-interface {v0, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1029
    .line 1030
    .line 1031
    goto :goto_8

    .line 1032
    :cond_19
    :goto_9
    new-instance p0, Lo7;

    .line 1033
    .line 1034
    const/16 p1, 0xc

    .line 1035
    .line 1036
    invoke-direct {p0, p1}, Lo7;-><init>(I)V

    .line 1037
    .line 1038
    .line 1039
    invoke-static {p0}, Lsb;->Ψ(Lp70;)V

    .line 1040
    .line 1041
    .line 1042
    sget-object p0, Ls62;->α:Ls62;

    .line 1043
    .line 1044
    return-object p0

    .line 1045
    :pswitch_13
    check-cast p1, Ljava/lang/Class;

    .line 1046
    .line 1047
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object p0

    .line 1054
    return-object p0

    .line 1055
    :pswitch_14
    check-cast p1, Ljava/lang/String;

    .line 1056
    .line 1057
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    sget-object p0, Lsb;->α:Lsb;

    .line 1061
    .line 1062
    new-instance p0, Lo7;

    .line 1063
    .line 1064
    const/16 p1, 0x9

    .line 1065
    .line 1066
    invoke-direct {p0, p1}, Lo7;-><init>(I)V

    .line 1067
    .line 1068
    .line 1069
    invoke-static {p0}, Lsb;->Ψ(Lp70;)V

    .line 1070
    .line 1071
    .line 1072
    sget-object p0, Ls62;->α:Ls62;

    .line 1073
    .line 1074
    return-object p0

    .line 1075
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 1076
    .line 1077
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    sget-object p0, Lsb;->α:Lsb;

    .line 1081
    .line 1082
    const-string p0, "bottom_bar_hidden"

    .line 1083
    .line 1084
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1085
    .line 1086
    .line 1087
    move-result p0

    .line 1088
    if-nez p0, :cond_1a

    .line 1089
    .line 1090
    const-string p0, "liquid_glass_bottom_bar_enabled"

    .line 1091
    .line 1092
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1093
    .line 1094
    .line 1095
    move-result p0

    .line 1096
    if-nez p0, :cond_1a

    .line 1097
    .line 1098
    const-string p0, "bottom_bar_alpha"

    .line 1099
    .line 1100
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1101
    .line 1102
    .line 1103
    move-result p0

    .line 1104
    if-nez p0, :cond_1a

    .line 1105
    .line 1106
    const-string p0, "bottom_bar_text_alpha"

    .line 1107
    .line 1108
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1109
    .line 1110
    .line 1111
    move-result p0

    .line 1112
    if-nez p0, :cond_1a

    .line 1113
    .line 1114
    const-string p0, "bottom_bar_show_text"

    .line 1115
    .line 1116
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result p0

    .line 1120
    if-nez p0, :cond_1a

    .line 1121
    .line 1122
    const-string p0, "bottom_bar_hide_badge"

    .line 1123
    .line 1124
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result p0

    .line 1128
    if-nez p0, :cond_1a

    .line 1129
    .line 1130
    const-string p0, "hide_tab_publish"

    .line 1131
    .line 1132
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1133
    .line 1134
    .line 1135
    move-result p0

    .line 1136
    if-eqz p0, :cond_1b

    .line 1137
    .line 1138
    :cond_1a
    new-instance p0, Lo7;

    .line 1139
    .line 1140
    const/16 p1, 0xa

    .line 1141
    .line 1142
    invoke-direct {p0, p1}, Lo7;-><init>(I)V

    .line 1143
    .line 1144
    .line 1145
    invoke-static {p0}, Lsb;->Ψ(Lp70;)V

    .line 1146
    .line 1147
    .line 1148
    :cond_1b
    sget-object p0, Ls62;->α:Ls62;

    .line 1149
    .line 1150
    return-object p0

    .line 1151
    :pswitch_16
    check-cast p1, Ljava/lang/ClassLoader;

    .line 1152
    .line 1153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1154
    .line 1155
    .line 1156
    invoke-static {p1}, Lfb;->γ(Ljava/lang/ClassLoader;)V

    .line 1157
    .line 1158
    .line 1159
    sget-object p0, Ls62;->α:Ls62;

    .line 1160
    .line 1161
    return-object p0

    .line 1162
    :pswitch_17
    check-cast p1, Ljava/lang/ClassLoader;

    .line 1163
    .line 1164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    new-instance p0, Lqx;

    .line 1168
    .line 1169
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 1170
    .line 1171
    sget-object v1, Lkx;->л:Lkx;

    .line 1172
    .line 1173
    invoke-static {v1, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v1

    .line 1177
    new-instance v2, Lcb;

    .line 1178
    .line 1179
    invoke-direct {v2, p1, v4}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1180
    .line 1181
    .line 1182
    const-string v3, "\u5b9a\u4f4d\u5e95\u680f\u53ef\u89c1\u6027\u6df7\u6dc6\u63a7\u5236\u65b9\u6cd5"

    .line 1183
    .line 1184
    invoke-direct {p0, v1, v3, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 1185
    .line 1186
    .line 1187
    new-instance v1, Lqx;

    .line 1188
    .line 1189
    sget-object v2, Lkx;->м:Lkx;

    .line 1190
    .line 1191
    invoke-static {v2, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v2

    .line 1195
    new-instance v3, Lcb;

    .line 1196
    .line 1197
    invoke-direct {v3, p1, v5}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1198
    .line 1199
    .line 1200
    const-string v4, "\u5b9a\u4f4d\u5e95\u680f\u5360\u4f4d\u53ef\u89c1\u6027\u6df7\u6dc6\u65b9\u6cd5"

    .line 1201
    .line 1202
    invoke-direct {v1, v2, v4, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 1203
    .line 1204
    .line 1205
    new-instance v2, Lqx;

    .line 1206
    .line 1207
    sget-object v3, Lkx;->н:Lkx;

    .line 1208
    .line 1209
    invoke-static {v3, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v3

    .line 1213
    new-instance v4, Lcb;

    .line 1214
    .line 1215
    invoke-direct {v4, p1, v0}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1216
    .line 1217
    .line 1218
    const-string p1, "\u5b9a\u4f4d\u5e95\u680f\u5360\u4f4d\u5e03\u5c40\u5237\u65b0\u6df7\u6dc6\u65b9\u6cd5"

    .line 1219
    .line 1220
    invoke-direct {v2, v3, p1, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 1221
    .line 1222
    .line 1223
    filled-new-array {p0, v1, v2}, [Lqx;

    .line 1224
    .line 1225
    .line 1226
    move-result-object p0

    .line 1227
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1228
    .line 1229
    .line 1230
    move-result-object p0

    .line 1231
    return-object p0

    .line 1232
    :pswitch_18
    check-cast p1, Laq0;

    .line 1233
    .line 1234
    invoke-virtual {p1}, Laq0;->γ()V

    .line 1235
    .line 1236
    .line 1237
    sget-object p0, Ls62;->α:Ls62;

    .line 1238
    .line 1239
    return-object p0

    .line 1240
    :pswitch_19
    check-cast p1, Ljava/lang/Byte;

    .line 1241
    .line 1242
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 1243
    .line 1244
    .line 1245
    move-result p0

    .line 1246
    and-int/lit16 p0, p0, 0xff

    .line 1247
    .line 1248
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1249
    .line 1250
    .line 1251
    move-result-object p0

    .line 1252
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object p0

    .line 1256
    invoke-static {p0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    move-result-object p0

    .line 1260
    const-string p1, "%02x"

    .line 1261
    .line 1262
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object p0

    .line 1266
    return-object p0

    .line 1267
    :pswitch_1a
    check-cast p1, Ljava/lang/Class;

    .line 1268
    .line 1269
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1270
    .line 1271
    .line 1272
    sget-object p0, Le8;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1273
    .line 1274
    invoke-static {p1}, Le8;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1275
    .line 1276
    .line 1277
    move-result-object p0

    .line 1278
    new-instance v0, Ljava/util/ArrayList;

    .line 1279
    .line 1280
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1284
    .line 1285
    .line 1286
    move-result-object p0

    .line 1287
    :cond_1c
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1288
    .line 1289
    .line 1290
    move-result v2

    .line 1291
    if-eqz v2, :cond_1e

    .line 1292
    .line 1293
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v2

    .line 1297
    move-object v4, v2

    .line 1298
    check-cast v4, Ljava/lang/reflect/Field;

    .line 1299
    .line 1300
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1301
    .line 1302
    .line 1303
    move-result v5

    .line 1304
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1305
    .line 1306
    .line 1307
    move-result v5

    .line 1308
    if-nez v5, :cond_1c

    .line 1309
    .line 1310
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v5

    .line 1314
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    invoke-static {v5}, Le8;->ε(Ljava/lang/String;)Z

    .line 1318
    .line 1319
    .line 1320
    move-result v5

    .line 1321
    if-nez v5, :cond_1d

    .line 1322
    .line 1323
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v4

    .line 1327
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1328
    .line 1329
    .line 1330
    invoke-static {v4}, Le8;->ζ(Ljava/lang/Class;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v4

    .line 1334
    if-eqz v4, :cond_1c

    .line 1335
    .line 1336
    :cond_1d
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1337
    .line 1338
    .line 1339
    goto :goto_a

    .line 1340
    :cond_1e
    invoke-static {p1}, Le8;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1341
    .line 1342
    .line 1343
    move-result-object p0

    .line 1344
    new-instance p1, Ljava/util/ArrayList;

    .line 1345
    .line 1346
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1350
    .line 1351
    .line 1352
    move-result-object p0

    .line 1353
    :cond_1f
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1354
    .line 1355
    .line 1356
    move-result v2

    .line 1357
    if-eqz v2, :cond_21

    .line 1358
    .line 1359
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v2

    .line 1363
    move-object v4, v2

    .line 1364
    check-cast v4, Ljava/lang/reflect/Method;

    .line 1365
    .line 1366
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1367
    .line 1368
    .line 1369
    move-result v5

    .line 1370
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v5

    .line 1374
    if-nez v5, :cond_1f

    .line 1375
    .line 1376
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v5

    .line 1380
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1381
    .line 1382
    .line 1383
    array-length v5, v5

    .line 1384
    if-nez v5, :cond_1f

    .line 1385
    .line 1386
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v5

    .line 1390
    invoke-static {v5, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1391
    .line 1392
    .line 1393
    move-result v5

    .line 1394
    if-nez v5, :cond_1f

    .line 1395
    .line 1396
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v5

    .line 1400
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1401
    .line 1402
    .line 1403
    invoke-static {v5}, Le8;->ε(Ljava/lang/String;)Z

    .line 1404
    .line 1405
    .line 1406
    move-result v5

    .line 1407
    if-nez v5, :cond_20

    .line 1408
    .line 1409
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v4

    .line 1413
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1414
    .line 1415
    .line 1416
    invoke-static {v4}, Le8;->ζ(Ljava/lang/Class;)Z

    .line 1417
    .line 1418
    .line 1419
    move-result v4

    .line 1420
    if-eqz v4, :cond_1f

    .line 1421
    .line 1422
    :cond_20
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1423
    .line 1424
    .line 1425
    goto :goto_b

    .line 1426
    :cond_21
    invoke-static {v0, p1}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1427
    .line 1428
    .line 1429
    move-result-object p0

    .line 1430
    new-instance p1, Ld50;

    .line 1431
    .line 1432
    sget-object v0, Le8;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1433
    .line 1434
    invoke-direct {p1, v3}, Ld50;-><init>(I)V

    .line 1435
    .line 1436
    .line 1437
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1438
    .line 1439
    .line 1440
    move-result-object p0

    .line 1441
    return-object p0

    .line 1442
    :pswitch_1b
    check-cast p1, Ljava/lang/String;

    .line 1443
    .line 1444
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1445
    .line 1446
    .line 1447
    const-string p0, "*"

    .line 1448
    .line 1449
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1450
    .line 1451
    .line 1452
    move-result p0

    .line 1453
    if-nez p0, :cond_22

    .line 1454
    .line 1455
    sget-object p0, Lt7;->κ:Ljava/util/Set;

    .line 1456
    .line 1457
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1458
    .line 1459
    .line 1460
    move-result p0

    .line 1461
    if-eqz p0, :cond_23

    .line 1462
    .line 1463
    :cond_22
    new-instance p0, Lo7;

    .line 1464
    .line 1465
    invoke-direct {p0, v5}, Lo7;-><init>(I)V

    .line 1466
    .line 1467
    .line 1468
    invoke-static {p0}, Lt7;->δ(Lp70;)V

    .line 1469
    .line 1470
    .line 1471
    :cond_23
    sget-object p0, Ls62;->α:Ls62;

    .line 1472
    .line 1473
    return-object p0

    .line 1474
    :pswitch_1c
    check-cast p1, Lmq;

    .line 1475
    .line 1476
    new-instance p0, Lη;

    .line 1477
    .line 1478
    invoke-direct {p0, v0, p1}, Lη;-><init>(ILjava/lang/Object;)V

    .line 1479
    .line 1480
    .line 1481
    invoke-static {p0}, Lt7;->δ(Lp70;)V

    .line 1482
    .line 1483
    .line 1484
    sget-object p0, Ls62;->α:Ls62;

    .line 1485
    .line 1486
    return-object p0

    .line 1487
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
.end method
