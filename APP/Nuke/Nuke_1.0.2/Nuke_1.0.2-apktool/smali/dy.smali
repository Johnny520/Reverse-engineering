.class public final synthetic Ldy;
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
    iput p1, p0, Ldy;->h:I

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
    .locals 8

    .line 1
    iget p0, p0, Ldy;->h:I

    .line 2
    .line 3
    const-string v0, "hostContext"

    .line 4
    .line 5
    const-class v1, Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object p0, Lb41;->b:Lap2;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object p0, Lk41;->b:Lap2;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_1
    sget-object p0, Lk01;->a:Ltu2;

    .line 20
    .line 21
    return-object v4

    .line 22
    :pswitch_2
    sget-object p0, Lly0;->a:Lmy;

    .line 23
    .line 24
    sget-object p0, Lj50;->a:Lj50;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_3
    sget-object p0, Llx0;->b:Llx0;

    .line 28
    .line 29
    invoke-virtual {p0}, Lv70;->d()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    array-length v0, p0

    .line 41
    :goto_0
    if-ge v2, v0, :cond_2

    .line 42
    .line 43
    aget-object v3, p0, v2

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    const/4 v6, 0x2

    .line 67
    if-gt v5, v6, :cond_1

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_1

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-static {v6}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    if-nez v6, :cond_0

    .line 88
    .line 89
    move-object v6, v1

    .line 90
    :cond_0
    invoke-static {v5, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    move-object v3, v4

    .line 101
    :goto_1
    if-eqz v3, :cond_3

    .line 102
    .line 103
    invoke-static {v3}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 104
    .line 105
    .line 106
    move-object v4, v3

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    const-string p0, "ConfigStorageLogic self alias method not found"

    .line 109
    .line 110
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :goto_2
    return-object v4

    .line 114
    :pswitch_4
    sget-object p0, Lpx0;->d:Lpx0;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    sget-object p0, Lpx0;->f:Lhx2;

    .line 120
    .line 121
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast p0, Ljava/lang/Class;

    .line 129
    .line 130
    invoke-static {p0}, Lpx0;->k(Ljava/lang/Class;)Lpb1;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Lz2;->a()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {p0, v0}, Lpb1;->listIterator(I)Ljava/util/ListIterator;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    :cond_4
    move-object v0, p0

    .line 143
    check-cast v0, Lvs0;

    .line 144
    .line 145
    invoke-virtual {v0}, Lvs0;->hasPrevious()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_6

    .line 150
    .line 151
    invoke-virtual {v0}, Lvs0;->previous()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    move-object v2, v0

    .line 156
    check-cast v2, Ljava/lang/reflect/Field;

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-static {v3}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    if-nez v3, :cond_5

    .line 171
    .line 172
    move-object v3, v1

    .line 173
    :cond_5
    invoke-static {v2, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_4

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_6
    move-object v0, v4

    .line 181
    :goto_3
    check-cast v0, Ljava/lang/reflect/Field;

    .line 182
    .line 183
    if-eqz v0, :cond_7

    .line 184
    .line 185
    invoke-static {v0}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 186
    .line 187
    .line 188
    move-object v4, v0

    .line 189
    goto :goto_4

    .line 190
    :cond_7
    const-string p0, "Image send task media type field not found"

    .line 191
    .line 192
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :goto_4
    return-object v4

    .line 196
    :pswitch_5
    sget-object p0, Lpx0;->d:Lpx0;

    .line 197
    .line 198
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    sget-object p0, Lpx0;->j:Lhx2;

    .line 202
    .line 203
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    check-cast p0, Ljava/lang/Class;

    .line 211
    .line 212
    invoke-static {p0}, Lpx0;->k(Ljava/lang/Class;)Lpb1;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-virtual {p0, v2}, Lpb1;->listIterator(I)Ljava/util/ListIterator;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    :cond_8
    move-object v0, p0

    .line 221
    check-cast v0, Lvs0;

    .line 222
    .line 223
    invoke-virtual {v0}, Lvs0;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-eqz v1, :cond_a

    .line 228
    .line 229
    invoke-virtual {v0}, Lvs0;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    move-object v1, v0

    .line 234
    check-cast v1, Ljava/lang/reflect/Field;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    const-class v2, Ljava/lang/Integer;

    .line 241
    .line 242
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-static {v3}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    if-nez v3, :cond_9

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_9
    move-object v2, v3

    .line 254
    :goto_5
    invoke-static {v1, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_8

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_a
    move-object v0, v4

    .line 262
    :goto_6
    check-cast v0, Ljava/lang/reflect/Field;

    .line 263
    .line 264
    if-eqz v0, :cond_b

    .line 265
    .line 266
    invoke-static {v0}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 267
    .line 268
    .line 269
    move-object v4, v0

    .line 270
    goto :goto_7

    .line 271
    :cond_b
    const-string p0, "Image cross params type field not found"

    .line 272
    .line 273
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    :goto_7
    return-object v4

    .line 277
    :pswitch_6
    sget-object p0, Lpx0;->d:Lpx0;

    .line 278
    .line 279
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    sget-object p0, Lpx0;->i:Lhx2;

    .line 283
    .line 284
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 289
    .line 290
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    const/4 v0, 0x4

    .line 295
    aget-object p0, p0, v0

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_7
    sget-object p0, Lpx0;->d:Lpx0;

    .line 299
    .line 300
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    sget-object p0, Lpx0;->f:Lhx2;

    .line 304
    .line 305
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    check-cast p0, Ljava/lang/Class;

    .line 313
    .line 314
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    array-length v0, p0

    .line 322
    :goto_8
    if-ge v2, v0, :cond_d

    .line 323
    .line 324
    aget-object v1, p0, v2

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    const/4 v5, 0x5

    .line 331
    if-ne v3, v5, :cond_c

    .line 332
    .line 333
    goto :goto_9

    .line 334
    :cond_c
    add-int/lit8 v2, v2, 0x1

    .line 335
    .line 336
    goto :goto_8

    .line 337
    :cond_d
    move-object v1, v4

    .line 338
    :goto_9
    if-eqz v1, :cond_e

    .line 339
    .line 340
    invoke-static {v1}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 341
    .line 342
    .line 343
    move-object v4, v1

    .line 344
    goto :goto_a

    .line 345
    :cond_e
    const-string p0, "Image send task constructor not found"

    .line 346
    .line 347
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :goto_a
    return-object v4

    .line 351
    :pswitch_8
    sget-object p0, Lmx0;->b:Lmx0;

    .line 352
    .line 353
    invoke-virtual {p0}, Lv70;->d()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    array-length v0, p0

    .line 365
    move v1, v2

    .line 366
    :goto_b
    if-ge v1, v0, :cond_10

    .line 367
    .line 368
    aget-object v5, p0, v1

    .line 369
    .line 370
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 371
    .line 372
    .line 373
    move-result v6

    .line 374
    if-ne v6, v3, :cond_f

    .line 375
    .line 376
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    aget-object v6, v6, v2

    .line 381
    .line 382
    sget-object v7, Lpx0;->d:Lpx0;

    .line 383
    .line 384
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    sget-object v7, Lpx0;->f:Lhx2;

    .line 388
    .line 389
    invoke-virtual {v7}, Lhx2;->getValue()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v7

    .line 393
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    check-cast v7, Ljava/lang/Class;

    .line 397
    .line 398
    invoke-static {v6, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v6

    .line 402
    if-eqz v6, :cond_f

    .line 403
    .line 404
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    const-string v7, "flow"

    .line 413
    .line 414
    invoke-static {v6, v7, v3}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 415
    .line 416
    .line 417
    move-result v6

    .line 418
    if-eqz v6, :cond_f

    .line 419
    .line 420
    goto :goto_c

    .line 421
    :cond_f
    add-int/lit8 v1, v1, 0x1

    .line 422
    .line 423
    goto :goto_b

    .line 424
    :cond_10
    move-object v5, v4

    .line 425
    :goto_c
    if-eqz v5, :cond_11

    .line 426
    .line 427
    invoke-static {v5}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 428
    .line 429
    .line 430
    move-object v4, v5

    .line 431
    goto :goto_d

    .line 432
    :cond_11
    const-string p0, "Image service send method not found"

    .line 433
    .line 434
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    :goto_d
    return-object v4

    .line 438
    :pswitch_9
    sget-object p0, Lmx0;->b:Lmx0;

    .line 439
    .line 440
    invoke-virtual {p0}, Lv70;->d()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    array-length v0, p0

    .line 452
    move v1, v2

    .line 453
    :goto_e
    if-ge v1, v0, :cond_13

    .line 454
    .line 455
    aget-object v3, p0, v1

    .line 456
    .line 457
    sget-object v5, Lpx0;->d:Lpx0;

    .line 458
    .line 459
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    if-eqz v5, :cond_12

    .line 470
    .line 471
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    const-string v6, "java."

    .line 476
    .line 477
    invoke-static {v5, v6, v2}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 478
    .line 479
    .line 480
    move-result v5

    .line 481
    if-nez v5, :cond_12

    .line 482
    .line 483
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    const-string v6, "javax."

    .line 488
    .line 489
    invoke-static {v5, v6, v2}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 490
    .line 491
    .line 492
    move-result v5

    .line 493
    if-nez v5, :cond_12

    .line 494
    .line 495
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    const-string v6, "kotlin."

    .line 500
    .line 501
    invoke-static {v5, v6, v2}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 502
    .line 503
    .line 504
    move-result v5

    .line 505
    if-nez v5, :cond_12

    .line 506
    .line 507
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    const-string v6, "android."

    .line 512
    .line 513
    invoke-static {v5, v6, v2}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 514
    .line 515
    .line 516
    move-result v5

    .line 517
    if-nez v5, :cond_12

    .line 518
    .line 519
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v5

    .line 523
    const-string v6, "androidx."

    .line 524
    .line 525
    invoke-static {v5, v6, v2}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 526
    .line 527
    .line 528
    move-result v5

    .line 529
    if-eqz v5, :cond_14

    .line 530
    .line 531
    :cond_12
    add-int/lit8 v1, v1, 0x1

    .line 532
    .line 533
    goto :goto_e

    .line 534
    :cond_13
    move-object v3, v4

    .line 535
    :cond_14
    if-eqz v3, :cond_15

    .line 536
    .line 537
    move-object v4, v3

    .line 538
    goto :goto_f

    .line 539
    :cond_15
    const-string p0, "Image service API interface not found"

    .line 540
    .line 541
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    :goto_f
    return-object v4

    .line 545
    :pswitch_a
    sget-object p0, Lox0;->b:Lox0;

    .line 546
    .line 547
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 548
    .line 549
    .line 550
    move-result-object p0

    .line 551
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    move-result-object p0

    .line 555
    aget-object p0, p0, v3

    .line 556
    .line 557
    return-object p0

    .line 558
    :pswitch_b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 559
    .line 560
    const-string v0, "CompositionLocal LocalHostDefaultProvider not present"

    .line 561
    .line 562
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    throw p0

    .line 566
    :pswitch_c
    invoke-static {v4}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    return-object p0

    .line 571
    :pswitch_d
    invoke-static {v4}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    return-object p0

    .line 576
    :pswitch_e
    const-string p0, ""

    .line 577
    .line 578
    invoke-static {p0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 579
    .line 580
    .line 581
    move-result-object p0

    .line 582
    return-object p0

    .line 583
    :pswitch_f
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 584
    .line 585
    invoke-static {p0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 586
    .line 587
    .line 588
    move-result-object p0

    .line 589
    return-object p0

    .line 590
    :pswitch_10
    invoke-static {}, Lnuke/ui/HomeActivity;->q()Lxk1;

    .line 591
    .line 592
    .line 593
    move-result-object p0

    .line 594
    return-object p0

    .line 595
    :pswitch_11
    sget-object p0, Ljp0;->a:Lcj;

    .line 596
    .line 597
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    const-class v0, Lip0;

    .line 601
    .line 602
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    if-eqz v1, :cond_19

    .line 607
    .line 608
    new-instance v1, Ljava/util/ArrayDeque;

    .line 609
    .line 610
    invoke-direct {v1, v3}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    :goto_10
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    if-nez v2, :cond_18

    .line 621
    .line 622
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    check-cast v2, Ljava/lang/Class;

    .line 627
    .line 628
    invoke-virtual {v2}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 629
    .line 630
    .line 631
    move-result-object v3

    .line 632
    array-length v3, v3

    .line 633
    if-eqz v3, :cond_17

    .line 634
    .line 635
    new-instance p0, Ljava/lang/StringBuilder;

    .line 636
    .line 637
    const-string v1, "Type parameters are unsupported on "

    .line 638
    .line 639
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    if-eq v2, v0, :cond_16

    .line 650
    .line 651
    const-string v1, " which is an interface of "

    .line 652
    .line 653
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 664
    .line 665
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object p0

    .line 669
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    throw v0

    .line 673
    :cond_17
    invoke-virtual {v2}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    invoke-static {v1, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    goto :goto_10

    .line 681
    :cond_18
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 682
    .line 683
    .line 684
    move-result-object v1

    .line 685
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    new-instance v2, Laa2;

    .line 690
    .line 691
    invoke-direct {v2, p0}, Laa2;-><init>(Lcj;)V

    .line 692
    .line 693
    .line 694
    invoke-static {v1, v0, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object p0

    .line 698
    move-object v4, p0

    .line 699
    check-cast v4, Lip0;

    .line 700
    .line 701
    goto :goto_11

    .line 702
    :cond_19
    const-string p0, "API declarations must be interfaces."

    .line 703
    .line 704
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    :goto_11
    return-object v4

    .line 708
    :pswitch_12
    sget p0, Lyb0;->a:F

    .line 709
    .line 710
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 711
    .line 712
    return-object p0

    .line 713
    :pswitch_13
    new-instance p0, Lop1;

    .line 714
    .line 715
    new-instance v1, Lai0;

    .line 716
    .line 717
    sget-object v2, Lup0;->i:Landroid/content/Context;

    .line 718
    .line 719
    if-eqz v2, :cond_1a

    .line 720
    .line 721
    const-string v0, "global_cache"

    .line 722
    .line 723
    invoke-direct {v1, v2, v0}, Lai0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v1}, Lai0;->a()Lbi0;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-direct {p0, v0}, Lop1;-><init>(Lbi0;)V

    .line 731
    .line 732
    .line 733
    return-object p0

    .line 734
    :cond_1a
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    throw v4

    .line 738
    :pswitch_14
    new-instance p0, Lop1;

    .line 739
    .line 740
    new-instance v1, Lai0;

    .line 741
    .line 742
    sget-object v2, Lup0;->i:Landroid/content/Context;

    .line 743
    .line 744
    if-eqz v2, :cond_1b

    .line 745
    .line 746
    const-string v0, "global_config"

    .line 747
    .line 748
    invoke-direct {v1, v2, v0}, Lai0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v1}, Lai0;->a()Lbi0;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-direct {p0, v0}, Lop1;-><init>(Lbi0;)V

    .line 756
    .line 757
    .line 758
    return-object p0

    .line 759
    :cond_1b
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    throw v4

    .line 763
    :pswitch_15
    sget-object p0, Lc10;->b:Lc10;

    .line 764
    .line 765
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 766
    .line 767
    .line 768
    move-result-object p0

    .line 769
    return-object p0

    .line 770
    :pswitch_16
    sget-object p0, Lz00;->b:Lz00;

    .line 771
    .line 772
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 773
    .line 774
    .line 775
    move-result-object p0

    .line 776
    return-object p0

    .line 777
    :pswitch_17
    sget-object p0, La10;->d:La10;

    .line 778
    .line 779
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    sget-object p0, La10;->f:Lhx2;

    .line 783
    .line 784
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object p0

    .line 788
    check-cast p0, Ljava/lang/reflect/Method;

    .line 789
    .line 790
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    move-result-object p0

    .line 794
    return-object p0

    .line 795
    :pswitch_18
    sget-object p0, Lhe;->e:Lhe;

    .line 796
    .line 797
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 798
    .line 799
    .line 800
    move-result-object p0

    .line 801
    return-object p0

    .line 802
    :pswitch_19
    sget-object p0, Lhe;->f:Lhe;

    .line 803
    .line 804
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 805
    .line 806
    .line 807
    move-result-object p0

    .line 808
    return-object p0

    .line 809
    :pswitch_1a
    sget-object p0, Lhe;->f:Lhe;

    .line 810
    .line 811
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 812
    .line 813
    .line 814
    move-result-object p0

    .line 815
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 816
    .line 817
    .line 818
    move-result-object p0

    .line 819
    return-object p0

    .line 820
    :pswitch_1b
    const-string p0, "Unexpected call to default provider"

    .line 821
    .line 822
    invoke-static {p0}, Ltx;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 823
    .line 824
    .line 825
    new-instance p0, Lpv;

    .line 826
    .line 827
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 828
    .line 829
    .line 830
    throw p0

    .line 831
    :pswitch_1c
    sget-object p0, Ley;->a:Ltu2;

    .line 832
    .line 833
    return-object v4

    .line 834
    nop

    .line 835
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
