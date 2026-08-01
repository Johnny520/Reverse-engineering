.class public final synthetic Lwj;
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
    iput p1, p0, Lwj;->ε:I

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
    iget p0, p0, Lwj;->ε:I

    .line 2
    .line 3
    const-class v0, Landroid/widget/ImageView;

    .line 4
    .line 5
    const/16 v1, 0xb

    .line 6
    .line 7
    const-class v2, Landroid/widget/TextView;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    sget-object v5, Ls62;->α:Ls62;

    .line 12
    .line 13
    packed-switch p0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p0, Lul;

    .line 22
    .line 23
    invoke-direct {p0, v3}, Lul;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 27
    .line 28
    .line 29
    return-object v5

    .line 30
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const-string p0, "void"

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string p0, "int"

    .line 41
    .line 42
    const-string v0, "java.lang.String"

    .line 43
    .line 44
    const-string v1, "boolean"

    .line 45
    .line 46
    const-string v2, "android.view.View"

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    filled-new-array {v1, v2, v3, p0, v0}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_0

    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    array-length p0, p0

    .line 82
    if-nez p0, :cond_8

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-eqz p0, :cond_1

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    sparse-switch v0, :sswitch_data_0

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :sswitch_0
    const-string v0, "getClass"

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_8

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :sswitch_1
    const-string v0, "hashCode"

    .line 108
    .line 109
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_8

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :sswitch_2
    const-string v0, "equals"

    .line 117
    .line 118
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_8

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :sswitch_3
    const-string v0, "toString"

    .line 126
    .line 127
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_1

    .line 132
    .line 133
    goto/16 :goto_5

    .line 134
    .line 135
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 140
    .line 141
    invoke-static {p1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_2

    .line 146
    .line 147
    goto/16 :goto_5

    .line 148
    .line 149
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    goto/16 :goto_5

    .line 156
    .line 157
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 161
    .line 162
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    const-string v1, "get"

    .line 178
    .line 179
    invoke-static {p0, v1, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-nez v1, :cond_5

    .line 184
    .line 185
    const-string v1, "is"

    .line 186
    .line 187
    invoke-static {p0, v1, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-nez v1, :cond_5

    .line 192
    .line 193
    const-string v1, "liz"

    .line 194
    .line 195
    invoke-static {p0, v1, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    if-eqz p0, :cond_4

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_4
    move p0, v4

    .line 203
    goto :goto_2

    .line 204
    :cond_5
    :goto_1
    move p0, v3

    .line 205
    :goto_2
    const-class v1, Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-nez v1, :cond_7

    .line 212
    .line 213
    const-class v1, Landroid/net/Uri;

    .line 214
    .line 215
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-nez v1, :cond_7

    .line 220
    .line 221
    const-class v1, Ljava/lang/Iterable;

    .line 222
    .line 223
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-nez v1, :cond_7

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    if-nez p1, :cond_7

    .line 234
    .line 235
    const-string p1, "emoji"

    .line 236
    .line 237
    invoke-static {v0, p1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-nez p1, :cond_7

    .line 242
    .line 243
    const-string p1, "url"

    .line 244
    .line 245
    invoke-static {v0, p1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    if-nez p1, :cond_7

    .line 250
    .line 251
    const-string p1, "image"

    .line 252
    .line 253
    invoke-static {v0, p1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    if-nez p1, :cond_7

    .line 258
    .line 259
    const-string p1, "icon"

    .line 260
    .line 261
    invoke-static {v0, p1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-nez p1, :cond_7

    .line 266
    .line 267
    const-string p1, "model"

    .line 268
    .line 269
    invoke-static {v0, p1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-nez p1, :cond_7

    .line 274
    .line 275
    const-string p1, "x."

    .line 276
    .line 277
    invoke-static {v0, p1, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    if-eqz p1, :cond_6

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_6
    move p1, v4

    .line 285
    goto :goto_4

    .line 286
    :cond_7
    :goto_3
    move p1, v3

    .line 287
    :goto_4
    if-eqz p0, :cond_8

    .line 288
    .line 289
    if-eqz p1, :cond_8

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_8
    :goto_5
    move v3, v4

    .line 293
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    return-object p0

    .line 298
    :pswitch_2
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    new-instance p0, Lwj;

    .line 304
    .line 305
    const/16 v0, 0x1c

    .line 306
    .line 307
    invoke-direct {p0, v0}, Lwj;-><init>(I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 311
    .line 312
    .line 313
    return-object v5

    .line 314
    :pswitch_3
    check-cast p1, Ljava/lang/ClassLoader;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    sget-object p0, Lql;->α:Lql;

    .line 320
    .line 321
    invoke-static {p1}, Lql;->Β(Ljava/lang/ClassLoader;)V

    .line 322
    .line 323
    .line 324
    return-object v5

    .line 325
    :pswitch_4
    check-cast p1, Ljava/lang/ClassLoader;

    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    new-instance p0, Lqx;

    .line 331
    .line 332
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 333
    .line 334
    sget-object v0, Lkx;->д:Lkx;

    .line 335
    .line 336
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    new-instance v1, Lcb;

    .line 341
    .line 342
    const/16 v2, 0x13

    .line 343
    .line 344
    invoke-direct {v1, p1, v2}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 345
    .line 346
    .line 347
    const-string p1, "\u5b9a\u4f4d\u8bc4\u8bba\u76f8\u4f3c\u8868\u60c5\u5165\u53e3\u65b9\u6cd5"

    .line 348
    .line 349
    invoke-direct {p0, v0, p1, v1}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 350
    .line 351
    .line 352
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    return-object p0

    .line 357
    :pswitch_5
    check-cast p1, Ljava/lang/Class;

    .line 358
    .line 359
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    return-object p0

    .line 364
    :pswitch_6
    check-cast p1, Ljava/lang/Class;

    .line 365
    .line 366
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    const-string v0, "mention"

    .line 374
    .line 375
    invoke-static {p0, v0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 376
    .line 377
    .line 378
    move-result p0

    .line 379
    if-nez p0, :cond_b

    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    array-length p1, p0

    .line 389
    move v0, v4

    .line 390
    :goto_7
    if-ge v0, p1, :cond_a

    .line 391
    .line 392
    aget-object v1, p0, v0

    .line 393
    .line 394
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    array-length v2, v2

    .line 402
    if-nez v2, :cond_9

    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    const-string v2, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943129D06B299C122F389D8E0B4BD36388D018B3D8B8988"

    .line 413
    .line 414
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-eqz v1, :cond_9

    .line 423
    .line 424
    goto :goto_8

    .line 425
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 426
    .line 427
    goto :goto_7

    .line 428
    :cond_a
    move v3, v4

    .line 429
    :cond_b
    :goto_8
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    return-object p0

    .line 434
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 435
    .line 436
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    sget-object p0, Lll;->α:Lll;

    .line 440
    .line 441
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result p0

    .line 453
    if-eqz p0, :cond_c

    .line 454
    .line 455
    invoke-static {}, Lll;->μ()V

    .line 456
    .line 457
    .line 458
    goto :goto_9

    .line 459
    :cond_c
    sget-object p0, Lll;->β:Landroid/os/Handler;

    .line 460
    .line 461
    new-instance p1, Ls0;

    .line 462
    .line 463
    invoke-direct {p1, v1}, Ls0;-><init>(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 467
    .line 468
    .line 469
    :goto_9
    return-object v5

    .line 470
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    const-string p0, "*"

    .line 476
    .line 477
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result p0

    .line 481
    if-nez p0, :cond_d

    .line 482
    .line 483
    const-string p0, "comment_control_custom_enabled"

    .line 484
    .line 485
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result p0

    .line 489
    if-nez p0, :cond_d

    .line 490
    .line 491
    const-string p0, "comment_content_color_skip_mention"

    .line 492
    .line 493
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result p0

    .line 497
    if-nez p0, :cond_d

    .line 498
    .line 499
    const-string p0, "comment_control_"

    .line 500
    .line 501
    invoke-static {p1, p0, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 502
    .line 503
    .line 504
    move-result p0

    .line 505
    if-eqz p0, :cond_f

    .line 506
    .line 507
    :cond_d
    sget-object p0, Lll;->α:Lll;

    .line 508
    .line 509
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 510
    .line 511
    .line 512
    move-result-object p0

    .line 513
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result p0

    .line 521
    if-eqz p0, :cond_e

    .line 522
    .line 523
    invoke-static {}, Lll;->μ()V

    .line 524
    .line 525
    .line 526
    goto :goto_a

    .line 527
    :cond_e
    sget-object p0, Lll;->β:Landroid/os/Handler;

    .line 528
    .line 529
    new-instance p1, Ls0;

    .line 530
    .line 531
    invoke-direct {p1, v1}, Ls0;-><init>(I)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 535
    .line 536
    .line 537
    :cond_f
    :goto_a
    return-object v5

    .line 538
    :pswitch_9
    check-cast p1, Lfk;

    .line 539
    .line 540
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    iget-object p0, p1, Lfk;->α:Ljava/lang/Class;

    .line 544
    .line 545
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object p0

    .line 549
    return-object p0

    .line 550
    :pswitch_a
    check-cast p1, Ljava/lang/Class;

    .line 551
    .line 552
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    return-object p0

    .line 557
    :pswitch_b
    check-cast p1, Lik;

    .line 558
    .line 559
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    iget-object p0, p1, Lik;->β:Ljava/lang/Class;

    .line 563
    .line 564
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    return-object p0

    .line 569
    :pswitch_c
    check-cast p1, Ljava/lang/reflect/Field;

    .line 570
    .line 571
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 579
    .line 580
    .line 581
    move-result p0

    .line 582
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 583
    .line 584
    .line 585
    move-result-object p0

    .line 586
    return-object p0

    .line 587
    :pswitch_d
    check-cast p1, Ljava/lang/reflect/Field;

    .line 588
    .line 589
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object p0

    .line 600
    const-string p1, "~79504AF3D2914B0617A99E1CFF7630F352162A9DD9ED0E0697077C8BEF44AF3C8C111F9FECBA549AE7343AC47496E6BC9D"

    .line 601
    .line 602
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result p0

    .line 610
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 611
    .line 612
    .line 613
    move-result-object p0

    .line 614
    return-object p0

    .line 615
    :pswitch_e
    check-cast p1, Ljava/lang/reflect/Field;

    .line 616
    .line 617
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    move-result-object p0

    .line 624
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object p0

    .line 628
    const-string v0, ".BuryView"

    .line 629
    .line 630
    invoke-static {p0, v0, v4}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 631
    .line 632
    .line 633
    move-result p0

    .line 634
    if-nez p0, :cond_11

    .line 635
    .line 636
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    move-result-object p0

    .line 640
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object p0

    .line 644
    const-string p1, ".BuryView2"

    .line 645
    .line 646
    invoke-static {p0, p1, v4}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 647
    .line 648
    .line 649
    move-result p0

    .line 650
    if-eqz p0, :cond_10

    .line 651
    .line 652
    goto :goto_b

    .line 653
    :cond_10
    move v3, v4

    .line 654
    :cond_11
    :goto_b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 655
    .line 656
    .line 657
    move-result-object p0

    .line 658
    return-object p0

    .line 659
    :pswitch_f
    check-cast p1, Ljava/lang/reflect/Field;

    .line 660
    .line 661
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    move-result-object p0

    .line 668
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object p0

    .line 672
    const-string p1, ".DiggNewView"

    .line 673
    .line 674
    invoke-static {p0, p1, v4}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 675
    .line 676
    .line 677
    move-result p0

    .line 678
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 679
    .line 680
    .line 681
    move-result-object p0

    .line 682
    return-object p0

    .line 683
    :pswitch_10
    check-cast p1, Ljava/lang/reflect/Field;

    .line 684
    .line 685
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    move-result-object p0

    .line 692
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object p0

    .line 696
    const-string p1, ".DiggOldView"

    .line 697
    .line 698
    invoke-static {p0, p1, v4}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 699
    .line 700
    .line 701
    move-result p0

    .line 702
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 703
    .line 704
    .line 705
    move-result-object p0

    .line 706
    return-object p0

    .line 707
    :pswitch_11
    check-cast p1, Ljava/lang/ClassLoader;

    .line 708
    .line 709
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    invoke-static {p1}, Lbl;->β(Ljava/lang/ClassLoader;)V

    .line 713
    .line 714
    .line 715
    return-object v5

    .line 716
    :pswitch_12
    check-cast p1, Ljava/lang/ClassLoader;

    .line 717
    .line 718
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    new-instance p0, Lqx;

    .line 722
    .line 723
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 724
    .line 725
    sget-object v0, Lkx;->Α:Lkx;

    .line 726
    .line 727
    invoke-static {v0, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    new-instance v1, Lcb;

    .line 732
    .line 733
    const/16 v2, 0x12

    .line 734
    .line 735
    invoke-direct {v1, p1, v2}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 736
    .line 737
    .line 738
    const-string p1, "\u5b9a\u4f4d\u8bc4\u8bba\u65e7\u5f0f ViewHolder"

    .line 739
    .line 740
    invoke-direct {p0, v0, p1, v1}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 741
    .line 742
    .line 743
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 744
    .line 745
    .line 746
    move-result-object p0

    .line 747
    return-object p0

    .line 748
    :pswitch_13
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 749
    .line 750
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    new-instance p0, Luj;

    .line 754
    .line 755
    const/16 v0, 0x11

    .line 756
    .line 757
    invoke-direct {p0, v0}, Luj;-><init>(I)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(La80;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 761
    .line 762
    .line 763
    new-instance p0, Luj;

    .line 764
    .line 765
    const/16 v0, 0x1b

    .line 766
    .line 767
    invoke-direct {p0, v0}, Luj;-><init>(I)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(La80;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 771
    .line 772
    .line 773
    new-instance p0, Lwj;

    .line 774
    .line 775
    const/4 v0, 0x5

    .line 776
    invoke-direct {p0, v0}, Lwj;-><init>(I)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(La80;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 780
    .line 781
    .line 782
    return-object v5

    .line 783
    :pswitch_14
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 784
    .line 785
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    new-instance p0, Lwj;

    .line 789
    .line 790
    const/16 v0, 0x9

    .line 791
    .line 792
    invoke-direct {p0, v0}, Lwj;-><init>(I)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fields(La80;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 796
    .line 797
    .line 798
    return-object v5

    .line 799
    :pswitch_15
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 800
    .line 801
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    new-instance p0, Lwj;

    .line 805
    .line 806
    const/16 v0, 0x8

    .line 807
    .line 808
    invoke-direct {p0, v0}, Lwj;-><init>(I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindClass;->matcher(La80;)Lorg/luckypray/dexkit/query/FindClass;

    .line 812
    .line 813
    .line 814
    return-object v5

    .line 815
    :pswitch_16
    check-cast p1, Ljava/lang/Class;

    .line 816
    .line 817
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object p0

    .line 821
    return-object p0

    .line 822
    :pswitch_17
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 823
    .line 824
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    const-string p0, "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A6499963BE1D3A49484E8BEB0B611570272AC88E18D"

    .line 828
    .line 829
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object p0

    .line 833
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->setType(Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    return-object v5

    .line 837
    :pswitch_18
    check-cast p1, Ljava/lang/reflect/Field;

    .line 838
    .line 839
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    move-result-object p0

    .line 846
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object p0

    .line 850
    const-string v0, "~79380C0D9D92A341B10DD9D9D717B6FACDF8DA2405C1D35872475FB38843A3806391E9448AD9C33A9B847F"

    .line 851
    .line 852
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v1

    .line 856
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    move-result p0

    .line 860
    if-nez p0, :cond_13

    .line 861
    .line 862
    sget-object p0, Lkk;->α:Lkk;

    .line 863
    .line 864
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    move-result-object p0

    .line 868
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object p1

    .line 875
    invoke-static {p0, p1}, Lkk;->γ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 876
    .line 877
    .line 878
    move-result p0

    .line 879
    if-eqz p0, :cond_12

    .line 880
    .line 881
    goto :goto_c

    .line 882
    :cond_12
    move v3, v4

    .line 883
    :cond_13
    :goto_c
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 884
    .line 885
    .line 886
    move-result-object p0

    .line 887
    return-object p0

    .line 888
    :pswitch_19
    check-cast p1, Ljava/lang/reflect/Field;

    .line 889
    .line 890
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    move-result-object p0

    .line 897
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 898
    .line 899
    .line 900
    move-result p0

    .line 901
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 902
    .line 903
    .line 904
    move-result-object p0

    .line 905
    return-object p0

    .line 906
    :pswitch_1a
    check-cast p1, Ljava/lang/reflect/Field;

    .line 907
    .line 908
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 912
    .line 913
    .line 914
    move-result-object p0

    .line 915
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 916
    .line 917
    .line 918
    move-result p0

    .line 919
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 920
    .line 921
    .line 922
    move-result-object p0

    .line 923
    return-object p0

    .line 924
    :pswitch_1b
    check-cast p1, Ljava/lang/reflect/Field;

    .line 925
    .line 926
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 927
    .line 928
    .line 929
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 930
    .line 931
    .line 932
    move-result p0

    .line 933
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 934
    .line 935
    .line 936
    move-result p0

    .line 937
    if-nez p0, :cond_14

    .line 938
    .line 939
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    move-result-object p0

    .line 943
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 944
    .line 945
    .line 946
    move-result p0

    .line 947
    if-eqz p0, :cond_14

    .line 948
    .line 949
    goto :goto_d

    .line 950
    :cond_14
    move v3, v4

    .line 951
    :goto_d
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 952
    .line 953
    .line 954
    move-result-object p0

    .line 955
    return-object p0

    .line 956
    :pswitch_1c
    check-cast p1, Ljava/lang/reflect/Field;

    .line 957
    .line 958
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 962
    .line 963
    .line 964
    move-result p0

    .line 965
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 966
    .line 967
    .line 968
    move-result p0

    .line 969
    if-nez p0, :cond_15

    .line 970
    .line 971
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 972
    .line 973
    .line 974
    move-result-object p0

    .line 975
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 976
    .line 977
    .line 978
    move-result p0

    .line 979
    if-eqz p0, :cond_15

    .line 980
    .line 981
    goto :goto_e

    .line 982
    :cond_15
    move v3, v4

    .line 983
    :goto_e
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 984
    .line 985
    .line 986
    move-result-object p0

    .line 987
    return-object p0

    .line 988
    nop

    .line 989
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
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_3
        -0x4d378041 -> :sswitch_2
        0x8cdac1b -> :sswitch_1
        0x74434fc2 -> :sswitch_0
    .end sparse-switch
.end method
