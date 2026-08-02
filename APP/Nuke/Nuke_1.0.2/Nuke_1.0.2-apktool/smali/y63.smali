.class public final synthetic Ly63;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ly63;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 9

    .line 1
    iget p0, p0, Ly63;->h:I

    .line 2
    .line 3
    const-class v0, Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p0, Lmg3;->b:Lmg3;

    .line 11
    .line 12
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    sget-object p0, Led3;->d:Lhx2;

    .line 18
    .line 19
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-long v0, p0

    .line 30
    const-wide v2, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v0, v2

    .line 36
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_1
    sget-object p0, La10;->d:La10;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object p0, La10;->f:Lhx2;

    .line 47
    .line 48
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/lang/reflect/Method;

    .line 53
    .line 54
    invoke-static {p0}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    check-cast p0, Ljava/lang/Integer;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_3
    invoke-static {}, Led3;->a()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    sget-object v0, Led3;->a:Landroid/content/SharedPreferences;

    .line 84
    .line 85
    const-string v1, "last_login_nick_name"

    .line 86
    .line 87
    const-string v3, ""

    .line 88
    .line 89
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_0

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    move-object v2, v0

    .line 104
    :goto_0
    new-instance v0, Lid2;

    .line 105
    .line 106
    invoke-direct {v0, p0, v2}, Lid2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v0

    .line 110
    :pswitch_4
    sget-object p0, Ldc3;->d:Ldc3;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget-object p0, Ldc3;->i:Lhx2;

    .line 116
    .line 117
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ljava/lang/reflect/Method;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    sget-object v0, Lxb3;->b:Lxb3;

    .line 128
    .line 129
    invoke-virtual {v0}, Lv70;->d()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    array-length v3, v0

    .line 141
    :goto_1
    if-ge v1, v3, :cond_2

    .line 142
    .line 143
    aget-object v4, v0, v1

    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_1

    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-nez v5, :cond_1

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-static {v5, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_1

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_2
    move-object v4, v2

    .line 179
    :goto_2
    if-eqz v4, :cond_3

    .line 180
    .line 181
    invoke-static {v4}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 182
    .line 183
    .line 184
    move-object v2, v4

    .line 185
    goto :goto_3

    .line 186
    :cond_3
    const-string p0, "SceneVoiceService getter not found"

    .line 187
    .line 188
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :goto_3
    return-object v2

    .line 192
    :pswitch_5
    sget-object p0, Lbc3;->b:Lbc3;

    .line 193
    .line 194
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-static {p0}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 199
    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_6
    sget-object p0, Lcc3;->b:Lcc3;

    .line 203
    .line 204
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-static {p0}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 209
    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_7
    sget-object p0, Lac3;->b:Lac3;

    .line 213
    .line 214
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-static {p0}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 219
    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_8
    sget-object p0, Lzb3;->b:Lzb3;

    .line 223
    .line 224
    invoke-virtual {p0}, Lv70;->d()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    array-length v3, p0

    .line 236
    move v4, v1

    .line 237
    :goto_4
    if-ge v4, v3, :cond_9

    .line 238
    .line 239
    aget-object v5, p0, v4

    .line 240
    .line 241
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    if-eqz v6, :cond_8

    .line 253
    .line 254
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    const/4 v7, 0x3

    .line 259
    if-gt v7, v6, :cond_8

    .line 260
    .line 261
    const/4 v7, 0x5

    .line 262
    if-ge v6, v7, :cond_8

    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    aget-object v6, v6, v1

    .line 269
    .line 270
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    invoke-static {v7}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    if-nez v7, :cond_4

    .line 279
    .line 280
    move-object v7, v0

    .line 281
    :cond_4
    invoke-static {v6, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    if-eqz v6, :cond_8

    .line 286
    .line 287
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    const/4 v7, 0x1

    .line 292
    aget-object v6, v6, v7

    .line 293
    .line 294
    const-class v7, Ljava/lang/Integer;

    .line 295
    .line 296
    invoke-static {v7}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    invoke-static {v8}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    if-nez v8, :cond_5

    .line 305
    .line 306
    move-object v8, v7

    .line 307
    :cond_5
    invoke-static {v6, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    if-eqz v6, :cond_8

    .line 312
    .line 313
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    const/4 v8, 0x2

    .line 318
    aget-object v6, v6, v8

    .line 319
    .line 320
    invoke-static {v7}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    invoke-static {v8}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    if-nez v8, :cond_6

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_6
    move-object v7, v8

    .line 332
    :goto_5
    invoke-static {v6, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    if-eqz v6, :cond_8

    .line 337
    .line 338
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    const-class v7, Ljava/lang/Boolean;

    .line 343
    .line 344
    invoke-static {v7}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    invoke-static {v8}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    if-nez v8, :cond_7

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_7
    move-object v7, v8

    .line 356
    :goto_6
    invoke-static {v6, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    if-eqz v6, :cond_8

    .line 361
    .line 362
    goto :goto_7

    .line 363
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 364
    .line 365
    goto/16 :goto_4

    .line 366
    .line 367
    :cond_9
    move-object v5, v2

    .line 368
    :goto_7
    if-eqz v5, :cond_a

    .line 369
    .line 370
    invoke-static {v5}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 371
    .line 372
    .line 373
    move-object v2, v5

    .line 374
    goto :goto_8

    .line 375
    :cond_a
    const-string p0, "VoiceLogic set voice method not found"

    .line 376
    .line 377
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    :goto_8
    return-object v2

    .line 381
    :pswitch_9
    sget-object p0, Lzb3;->b:Lzb3;

    .line 382
    .line 383
    invoke-virtual {p0}, Lv70;->d()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    array-length v3, p0

    .line 395
    :goto_9
    if-ge v1, v3, :cond_f

    .line 396
    .line 397
    aget-object v4, p0, v1

    .line 398
    .line 399
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    if-eqz v5, :cond_e

    .line 411
    .line 412
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    invoke-static {v6}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    if-nez v6, :cond_b

    .line 425
    .line 426
    move-object v6, v0

    .line 427
    :cond_b
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    invoke-static {v7}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    if-nez v7, :cond_c

    .line 436
    .line 437
    move-object v7, v0

    .line 438
    :cond_c
    filled-new-array {v6, v7}, [Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    if-eqz v5, :cond_e

    .line 447
    .line 448
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    move-result-object v5

    .line 452
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    invoke-static {v6}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    if-nez v6, :cond_d

    .line 461
    .line 462
    move-object v6, v0

    .line 463
    :cond_d
    invoke-static {v5, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v5

    .line 467
    if-eqz v5, :cond_e

    .line 468
    .line 469
    goto :goto_a

    .line 470
    :cond_e
    add-int/lit8 v1, v1, 0x1

    .line 471
    .line 472
    goto :goto_9

    .line 473
    :cond_f
    move-object v4, v2

    .line 474
    :goto_a
    if-eqz v4, :cond_10

    .line 475
    .line 476
    invoke-static {v4}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 477
    .line 478
    .line 479
    move-object v2, v4

    .line 480
    goto :goto_b

    .line 481
    :cond_10
    const-string p0, "VoiceLogic voice name method not found"

    .line 482
    .line 483
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    :goto_b
    return-object v2

    .line 487
    :pswitch_a
    new-instance p0, Lcg;

    .line 488
    .line 489
    sget-object v0, Lnv2;->a:Lnv2;

    .line 490
    .line 491
    invoke-direct {p0, v0}, Lcg;-><init>(Lw41;)V

    .line 492
    .line 493
    .line 494
    return-object p0

    .line 495
    :pswitch_data_0
    .packed-switch 0x0
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
