.class public final synthetic Lz81;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lz81;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget p0, p0, Lz81;->h:I

    .line 2
    .line 3
    const-string v0, "getAnnotatedReturnType is not supported on Android."

    .line 4
    .line 5
    const-string v1, "getAnnotatedReceiverType is not supported on Android."

    .line 6
    .line 7
    const-string v2, "getAnnotatedParameterTypes is not supported on Android."

    .line 8
    .line 9
    const-string v3, "getAnnotatedExceptionTypes is not supported on Android."

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    check-cast p2, Lwf1;

    .line 20
    .line 21
    invoke-virtual {p2}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, Ljava/util/Set;

    .line 39
    .line 40
    check-cast p2, Lbh0;

    .line 41
    .line 42
    check-cast p1, Ljava/util/Collection;

    .line 43
    .line 44
    iget-object p0, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast p0, Ljava/lang/reflect/Executable;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/reflect/Executable;->getGenericExceptionTypes()[Ljava/lang/reflect/Type;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eq p2, v0, :cond_0

    .line 68
    .line 69
    move v5, v6

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-nez p2, :cond_1

    .line 82
    .line 83
    :goto_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, Lvi0;->t(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Ljava/lang/reflect/Type;

    .line 100
    .line 101
    throw v4

    .line 102
    :pswitch_1
    check-cast p1, Lin0;

    .line 103
    .line 104
    check-cast p2, Lrg1;

    .line 105
    .line 106
    :try_start_0
    iget-object p0, p2, Lrg1;->c:Ljava/lang/reflect/Method;

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catchall_0
    move-exception p0

    .line 123
    new-instance p1, Lx92;

    .line 124
    .line 125
    invoke-direct {p1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    move-object p0, p1

    .line 129
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 130
    .line 131
    instance-of p2, p0, Lx92;

    .line 132
    .line 133
    if-eqz p2, :cond_2

    .line 134
    .line 135
    move-object p0, p1

    .line 136
    :cond_2
    check-cast p0, Ljava/lang/Boolean;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_2
    check-cast p1, Ljava/util/Set;

    .line 140
    .line 141
    check-cast p2, Lbh0;

    .line 142
    .line 143
    check-cast p1, Ljava/util/Collection;

    .line 144
    .line 145
    iget-object p0, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    check-cast p0, Ljava/lang/reflect/Executable;

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/reflect/Executable;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eq p2, v0, :cond_3

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_3
    check-cast p1, Ljava/lang/Iterable;

    .line 172
    .line 173
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-nez p2, :cond_4

    .line 182
    .line 183
    move v6, v5

    .line 184
    :goto_2
    xor-int/lit8 p0, v6, 0x1

    .line 185
    .line 186
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0

    .line 191
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {p1}, Lvi0;->t(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, Ljava/lang/reflect/Type;

    .line 203
    .line 204
    throw v4

    .line 205
    :pswitch_3
    check-cast p1, Ljava/util/Set;

    .line 206
    .line 207
    check-cast p2, Lbh0;

    .line 208
    .line 209
    check-cast p1, Ljava/util/Collection;

    .line 210
    .line 211
    iget-object p0, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 212
    .line 213
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    check-cast p0, Ljava/lang/reflect/Executable;

    .line 217
    .line 218
    invoke-virtual {p0}, Ljava/lang/reflect/Executable;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eq p2, v0, :cond_5

    .line 235
    .line 236
    move v5, v6

    .line 237
    goto :goto_3

    .line 238
    :cond_5
    check-cast p1, Ljava/lang/Iterable;

    .line 239
    .line 240
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    if-nez p2, :cond_6

    .line 249
    .line 250
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    return-object p0

    .line 255
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-static {p1}, Lvi0;->t(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    check-cast p0, Ljava/lang/reflect/Type;

    .line 267
    .line 268
    throw v4

    .line 269
    :pswitch_4
    check-cast p1, Lin0;

    .line 270
    .line 271
    check-cast p2, Lbh0;

    .line 272
    .line 273
    :try_start_1
    iget-object p0, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    check-cast p0, Ljava/lang/reflect/Executable;

    .line 279
    .line 280
    invoke-virtual {p0}, Ljava/lang/reflect/Executable;->getParameterCount()I

    .line 281
    .line 282
    .line 283
    move-result p0

    .line 284
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    check-cast p0, Ljava/lang/Boolean;

    .line 293
    .line 294
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 295
    .line 296
    .line 297
    goto :goto_4

    .line 298
    :catchall_1
    move-exception p0

    .line 299
    new-instance p1, Lx92;

    .line 300
    .line 301
    invoke-direct {p1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    move-object p0, p1

    .line 305
    :goto_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 306
    .line 307
    instance-of p2, p0, Lx92;

    .line 308
    .line 309
    if-eqz p2, :cond_7

    .line 310
    .line 311
    move-object p0, p1

    .line 312
    :cond_7
    check-cast p0, Ljava/lang/Boolean;

    .line 313
    .line 314
    return-object p0

    .line 315
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 318
    .line 319
    .line 320
    move-result p0

    .line 321
    check-cast p2, Lbh0;

    .line 322
    .line 323
    iget-object p1, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    check-cast p1, Ljava/lang/reflect/Executable;

    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/reflect/Executable;->getParameterCount()I

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    if-ne p1, p0, :cond_8

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_8
    move v5, v6

    .line 338
    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    return-object p0

    .line 343
    :pswitch_6
    check-cast p1, Lin0;

    .line 344
    .line 345
    check-cast p2, Lbh0;

    .line 346
    .line 347
    :try_start_2
    iget-object p0, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 348
    .line 349
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    check-cast p0, Ljava/lang/reflect/Executable;

    .line 353
    .line 354
    invoke-virtual {p0}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    check-cast p0, Ljava/lang/Boolean;

    .line 367
    .line 368
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 369
    .line 370
    .line 371
    goto :goto_6

    .line 372
    :catchall_2
    move-exception p0

    .line 373
    new-instance p1, Lx92;

    .line 374
    .line 375
    invoke-direct {p1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    move-object p0, p1

    .line 379
    :goto_6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 380
    .line 381
    instance-of p2, p0, Lx92;

    .line 382
    .line 383
    if-eqz p2, :cond_9

    .line 384
    .line 385
    move-object p0, p1

    .line 386
    :cond_9
    check-cast p0, Ljava/lang/Boolean;

    .line 387
    .line 388
    return-object p0

    .line 389
    :pswitch_7
    check-cast p1, Ljava/util/Set;

    .line 390
    .line 391
    check-cast p2, Lbh0;

    .line 392
    .line 393
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 397
    .line 398
    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw p0

    .line 402
    :pswitch_8
    check-cast p1, Ljava/util/Set;

    .line 403
    .line 404
    check-cast p2, Lbh0;

    .line 405
    .line 406
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 410
    .line 411
    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw p0

    .line 415
    :pswitch_9
    check-cast p1, Ljava/util/Set;

    .line 416
    .line 417
    check-cast p2, Lbh0;

    .line 418
    .line 419
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 423
    .line 424
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    throw p0

    .line 428
    :pswitch_a
    if-nez p1, :cond_a

    .line 429
    .line 430
    check-cast p2, Lrg1;

    .line 431
    .line 432
    iget-object p0, p2, Lrg1;->c:Ljava/lang/reflect/Method;

    .line 433
    .line 434
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 435
    .line 436
    .line 437
    throw v4

    .line 438
    :cond_a
    new-instance p0, Ljava/lang/ClassCastException;

    .line 439
    .line 440
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 441
    .line 442
    .line 443
    throw p0

    .line 444
    :pswitch_b
    check-cast p1, Ljava/util/Set;

    .line 445
    .line 446
    check-cast p2, Lbh0;

    .line 447
    .line 448
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 452
    .line 453
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    throw p0

    .line 457
    :pswitch_c
    check-cast p1, Ljava/util/Set;

    .line 458
    .line 459
    check-cast p2, Lbh0;

    .line 460
    .line 461
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 465
    .line 466
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    throw p0

    .line 470
    :pswitch_d
    check-cast p1, Ljava/util/Set;

    .line 471
    .line 472
    check-cast p2, Lbh0;

    .line 473
    .line 474
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 478
    .line 479
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw p0

    .line 483
    :pswitch_e
    check-cast p1, Ljava/util/Set;

    .line 484
    .line 485
    check-cast p2, Lbh0;

    .line 486
    .line 487
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 491
    .line 492
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    throw p0

    .line 496
    :pswitch_f
    check-cast p1, Ljava/util/Set;

    .line 497
    .line 498
    check-cast p2, Lbh0;

    .line 499
    .line 500
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 504
    .line 505
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    throw p0

    .line 509
    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    .line 510
    .line 511
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 512
    .line 513
    .line 514
    move-result p0

    .line 515
    check-cast p2, Lbh0;

    .line 516
    .line 517
    iget-object p1, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 518
    .line 519
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    check-cast p1, Ljava/lang/reflect/Executable;

    .line 523
    .line 524
    invoke-virtual {p1}, Ljava/lang/reflect/Executable;->isVarArgs()Z

    .line 525
    .line 526
    .line 527
    move-result p1

    .line 528
    if-eq p1, p0, :cond_b

    .line 529
    .line 530
    goto :goto_7

    .line 531
    :cond_b
    move v5, v6

    .line 532
    :goto_7
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 533
    .line 534
    .line 535
    move-result-object p0

    .line 536
    return-object p0

    .line 537
    :pswitch_11
    check-cast p1, Ljava/lang/Boolean;

    .line 538
    .line 539
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 540
    .line 541
    .line 542
    move-result p0

    .line 543
    check-cast p2, Lbh0;

    .line 544
    .line 545
    iget-object p1, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 546
    .line 547
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    check-cast p1, Ljava/lang/reflect/Executable;

    .line 551
    .line 552
    invoke-virtual {p1}, Ljava/lang/reflect/Executable;->isVarArgs()Z

    .line 553
    .line 554
    .line 555
    move-result p1

    .line 556
    if-ne p1, p0, :cond_c

    .line 557
    .line 558
    goto :goto_8

    .line 559
    :cond_c
    move v5, v6

    .line 560
    :goto_8
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 561
    .line 562
    .line 563
    move-result-object p0

    .line 564
    return-object p0

    .line 565
    :pswitch_12
    check-cast p1, Lin0;

    .line 566
    .line 567
    check-cast p2, Lrg1;

    .line 568
    .line 569
    :try_start_3
    iget-object p0, p2, Lrg1;->c:Ljava/lang/reflect/Method;

    .line 570
    .line 571
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    check-cast p0, Ljava/lang/Boolean;

    .line 580
    .line 581
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 582
    .line 583
    .line 584
    goto :goto_9

    .line 585
    :catchall_3
    move-exception p0

    .line 586
    new-instance p1, Lx92;

    .line 587
    .line 588
    invoke-direct {p1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 589
    .line 590
    .line 591
    move-object p0, p1

    .line 592
    :goto_9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 593
    .line 594
    instance-of p2, p0, Lx92;

    .line 595
    .line 596
    if-eqz p2, :cond_d

    .line 597
    .line 598
    move-object p0, p1

    .line 599
    :cond_d
    check-cast p0, Ljava/lang/Boolean;

    .line 600
    .line 601
    return-object p0

    .line 602
    :pswitch_13
    check-cast p1, Ljava/util/Set;

    .line 603
    .line 604
    check-cast p2, Lbh0;

    .line 605
    .line 606
    check-cast p1, Ljava/util/Collection;

    .line 607
    .line 608
    iget-object p0, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 609
    .line 610
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    check-cast p0, Ljava/lang/reflect/Executable;

    .line 614
    .line 615
    invoke-virtual {p0}, Ljava/lang/reflect/Executable;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 616
    .line 617
    .line 618
    move-result-object p0

    .line 619
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 624
    .line 625
    .line 626
    move-result p2

    .line 627
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    if-eq p2, v0, :cond_e

    .line 632
    .line 633
    goto :goto_a

    .line 634
    :cond_e
    check-cast p1, Ljava/lang/Iterable;

    .line 635
    .line 636
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 637
    .line 638
    .line 639
    move-result-object p1

    .line 640
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 641
    .line 642
    .line 643
    move-result p2

    .line 644
    if-nez p2, :cond_f

    .line 645
    .line 646
    move v6, v5

    .line 647
    :goto_a
    xor-int/lit8 p0, v6, 0x1

    .line 648
    .line 649
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 650
    .line 651
    .line 652
    move-result-object p0

    .line 653
    return-object p0

    .line 654
    :cond_f
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object p1

    .line 658
    invoke-static {p1}, Lvi0;->t(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object p0

    .line 665
    check-cast p0, Ljava/lang/reflect/Type;

    .line 666
    .line 667
    throw v4

    .line 668
    :pswitch_14
    check-cast p1, Ljava/util/Set;

    .line 669
    .line 670
    check-cast p2, Lbh0;

    .line 671
    .line 672
    check-cast p1, Ljava/util/Collection;

    .line 673
    .line 674
    iget-object p0, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 675
    .line 676
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    check-cast p0, Ljava/lang/reflect/Executable;

    .line 680
    .line 681
    invoke-virtual {p0}, Ljava/lang/reflect/Executable;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 682
    .line 683
    .line 684
    move-result-object p0

    .line 685
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 690
    .line 691
    .line 692
    move-result p2

    .line 693
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    if-eq p2, v0, :cond_10

    .line 698
    .line 699
    move v5, v6

    .line 700
    goto :goto_b

    .line 701
    :cond_10
    check-cast p1, Ljava/lang/Iterable;

    .line 702
    .line 703
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 704
    .line 705
    .line 706
    move-result-object p1

    .line 707
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 708
    .line 709
    .line 710
    move-result p2

    .line 711
    if-nez p2, :cond_11

    .line 712
    .line 713
    :goto_b
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 714
    .line 715
    .line 716
    move-result-object p0

    .line 717
    return-object p0

    .line 718
    :cond_11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object p1

    .line 722
    invoke-static {p1}, Lvi0;->t(Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object p0

    .line 729
    check-cast p0, Ljava/lang/reflect/Type;

    .line 730
    .line 731
    throw v4

    .line 732
    :pswitch_15
    check-cast p1, Ljava/util/Set;

    .line 733
    .line 734
    check-cast p2, Lbh0;

    .line 735
    .line 736
    check-cast p1, Ljava/util/Collection;

    .line 737
    .line 738
    iget-object p0, p2, Lbh0;->b:Ljava/lang/reflect/Member;

    .line 739
    .line 740
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    check-cast p0, Ljava/lang/reflect/Executable;

    .line 744
    .line 745
    invoke-virtual {p0}, Ljava/lang/reflect/Executable;->getGenericExceptionTypes()[Ljava/lang/reflect/Type;

    .line 746
    .line 747
    .line 748
    move-result-object p0

    .line 749
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 750
    .line 751
    .line 752
    move-result-object p0

    .line 753
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 754
    .line 755
    .line 756
    move-result p2

    .line 757
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 758
    .line 759
    .line 760
    move-result v0

    .line 761
    if-eq p2, v0, :cond_12

    .line 762
    .line 763
    goto :goto_c

    .line 764
    :cond_12
    check-cast p1, Ljava/lang/Iterable;

    .line 765
    .line 766
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 767
    .line 768
    .line 769
    move-result-object p1

    .line 770
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 771
    .line 772
    .line 773
    move-result p2

    .line 774
    if-nez p2, :cond_13

    .line 775
    .line 776
    move v6, v5

    .line 777
    :goto_c
    xor-int/lit8 p0, v6, 0x1

    .line 778
    .line 779
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 780
    .line 781
    .line 782
    move-result-object p0

    .line 783
    return-object p0

    .line 784
    :cond_13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object p1

    .line 788
    invoke-static {p1}, Lvi0;->t(Ljava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object p0

    .line 795
    check-cast p0, Ljava/lang/reflect/Type;

    .line 796
    .line 797
    throw v4

    .line 798
    :pswitch_16
    check-cast p1, Lin0;

    .line 799
    .line 800
    check-cast p2, Lgi0;

    .line 801
    .line 802
    iget-object p0, p2, Lgi0;->c:Ljava/lang/reflect/Field;

    .line 803
    .line 804
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 805
    .line 806
    .line 807
    move-result-object p0

    .line 808
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object p0

    .line 812
    check-cast p0, Ljava/lang/Boolean;

    .line 813
    .line 814
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 815
    .line 816
    .line 817
    return-object p0

    .line 818
    :pswitch_17
    if-nez p1, :cond_14

    .line 819
    .line 820
    check-cast p2, Lgi0;

    .line 821
    .line 822
    iget-object p0, p2, Lgi0;->c:Ljava/lang/reflect/Field;

    .line 823
    .line 824
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 825
    .line 826
    .line 827
    throw v4

    .line 828
    :cond_14
    new-instance p0, Ljava/lang/ClassCastException;

    .line 829
    .line 830
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 831
    .line 832
    .line 833
    throw p0

    .line 834
    :pswitch_18
    check-cast p1, Lin0;

    .line 835
    .line 836
    check-cast p2, Lgi0;

    .line 837
    .line 838
    iget-object p0, p2, Lgi0;->c:Ljava/lang/reflect/Field;

    .line 839
    .line 840
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    move-result-object p0

    .line 844
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object p0

    .line 848
    check-cast p0, Ljava/lang/Boolean;

    .line 849
    .line 850
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 851
    .line 852
    .line 853
    return-object p0

    .line 854
    :pswitch_19
    check-cast p1, Ljava/lang/Boolean;

    .line 855
    .line 856
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 857
    .line 858
    .line 859
    move-result p0

    .line 860
    check-cast p2, Lgi0;

    .line 861
    .line 862
    iget-object p1, p2, Lgi0;->c:Ljava/lang/reflect/Field;

    .line 863
    .line 864
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 865
    .line 866
    .line 867
    move-result p1

    .line 868
    if-eq p1, p0, :cond_15

    .line 869
    .line 870
    goto :goto_d

    .line 871
    :cond_15
    move v5, v6

    .line 872
    :goto_d
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 873
    .line 874
    .line 875
    move-result-object p0

    .line 876
    return-object p0

    .line 877
    :pswitch_1a
    check-cast p1, Ljava/lang/Boolean;

    .line 878
    .line 879
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 880
    .line 881
    .line 882
    move-result p0

    .line 883
    check-cast p2, Lgi0;

    .line 884
    .line 885
    iget-object p1, p2, Lgi0;->c:Ljava/lang/reflect/Field;

    .line 886
    .line 887
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 888
    .line 889
    .line 890
    move-result p1

    .line 891
    if-ne p1, p0, :cond_16

    .line 892
    .line 893
    goto :goto_e

    .line 894
    :cond_16
    move v5, v6

    .line 895
    :goto_e
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 896
    .line 897
    .line 898
    move-result-object p0

    .line 899
    return-object p0

    .line 900
    :pswitch_1b
    check-cast p1, Lbc2;

    .line 901
    .line 902
    check-cast p2, Lg91;

    .line 903
    .line 904
    invoke-virtual {p2}, Lg91;->c()Ljava/util/Map;

    .line 905
    .line 906
    .line 907
    move-result-object p0

    .line 908
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 909
    .line 910
    .line 911
    move-result p1

    .line 912
    if-eqz p1, :cond_17

    .line 913
    .line 914
    goto :goto_f

    .line 915
    :cond_17
    move-object v4, p0

    .line 916
    :goto_f
    return-object v4

    .line 917
    :pswitch_1c
    check-cast p1, Lbc2;

    .line 918
    .line 919
    check-cast p2, Ld91;

    .line 920
    .line 921
    iget-object p0, p2, Ld91;->e:Los;

    .line 922
    .line 923
    iget-object p0, p0, Los;->b:Ljava/lang/Object;

    .line 924
    .line 925
    check-cast p0, Lkx1;

    .line 926
    .line 927
    invoke-virtual {p0}, Lkx1;->g()I

    .line 928
    .line 929
    .line 930
    move-result p0

    .line 931
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 932
    .line 933
    .line 934
    move-result-object p0

    .line 935
    iget-object p1, p2, Ld91;->e:Los;

    .line 936
    .line 937
    iget-object p1, p1, Los;->c:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast p1, Lkx1;

    .line 940
    .line 941
    invoke-virtual {p1}, Lkx1;->g()I

    .line 942
    .line 943
    .line 944
    move-result p1

    .line 945
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 946
    .line 947
    .line 948
    move-result-object p1

    .line 949
    filled-new-array {p0, p1}, [Ljava/lang/Integer;

    .line 950
    .line 951
    .line 952
    move-result-object p0

    .line 953
    invoke-static {p0}, Leu;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 954
    .line 955
    .line 956
    move-result-object p0

    .line 957
    return-object p0

    .line 958
    nop

    .line 959
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
