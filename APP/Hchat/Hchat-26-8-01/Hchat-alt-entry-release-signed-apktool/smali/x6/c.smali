.class public final synthetic Lx6/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lx6/c;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lx6/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Lu6/d;

    .line 7
    .line 8
    iget-object p2, p2, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p2, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    check-cast p2, Lu6/d;

    .line 30
    .line 31
    iget-object p2, p2, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isDefault()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eq p2, p1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    check-cast p2, Lu6/d;

    .line 54
    .line 55
    iget-object p2, p2, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isDefault()Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-ne p2, p1, :cond_1

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    const/4 p1, 0x0

    .line 66
    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    check-cast p2, Lu6/d;

    .line 78
    .line 79
    iget-object p2, p2, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eq p2, p1, :cond_2

    .line 86
    .line 87
    const/4 p1, 0x1

    .line 88
    goto :goto_3

    .line 89
    :cond_2
    const/4 p1, 0x0

    .line 90
    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    check-cast p2, Lu6/d;

    .line 102
    .line 103
    iget-object p2, p2, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-ne p2, p1, :cond_3

    .line 110
    .line 111
    const/4 p1, 0x1

    .line 112
    goto :goto_4

    .line 113
    :cond_3
    const/4 p1, 0x0

    .line 114
    :goto_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    return-object p1

    .line 119
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 120
    .line 121
    check-cast p2, Lu6/c;

    .line 122
    .line 123
    invoke-virtual {p2}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    instance-of v0, p2, Ljava/lang/reflect/Method;

    .line 128
    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    check-cast p2, Ljava/lang/reflect/Method;

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_4
    instance-of v0, p2, Ljava/lang/reflect/Constructor;

    .line 142
    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_5
    instance-of v0, p2, Ljava/lang/reflect/Field;

    .line 156
    .line 157
    if-eqz v0, :cond_6

    .line 158
    .line 159
    check-cast p2, Ljava/lang/reflect/Field;

    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->toGenericString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    :goto_5
    invoke-static {p2, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    check-cast p2, Lu6/c;

    .line 186
    .line 187
    invoke-virtual {p2}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-interface {p2}, Ljava/lang/reflect/Member;->isSynthetic()Z

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    if-eq p2, p1, :cond_7

    .line 196
    .line 197
    const/4 p1, 0x1

    .line 198
    goto :goto_6

    .line 199
    :cond_7
    const/4 p1, 0x0

    .line 200
    :goto_6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    return-object p1

    .line 205
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    check-cast p2, Lu6/c;

    .line 212
    .line 213
    invoke-virtual {p2}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-interface {p2}, Ljava/lang/reflect/Member;->isSynthetic()Z

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    if-ne p2, p1, :cond_8

    .line 222
    .line 223
    const/4 p1, 0x1

    .line 224
    goto :goto_7

    .line 225
    :cond_8
    const/4 p1, 0x0

    .line 226
    :goto_7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    return-object p1

    .line 231
    :pswitch_7
    check-cast p1, Lfg/l;

    .line 232
    .line 233
    check-cast p2, Lu6/d;

    .line 234
    .line 235
    :try_start_0
    iget-object p2, p2, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 236
    .line 237
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    check-cast p1, Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 251
    .line 252
    .line 253
    goto :goto_8

    .line 254
    :catchall_0
    move-exception p1

    .line 255
    new-instance p2, Lsf/f;

    .line 256
    .line 257
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    move-object p1, p2

    .line 261
    :goto_8
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 262
    .line 263
    instance-of v0, p1, Lsf/f;

    .line 264
    .line 265
    if-eqz v0, :cond_9

    .line 266
    .line 267
    move-object p1, p2

    .line 268
    :cond_9
    check-cast p1, Ljava/lang/Boolean;

    .line 269
    .line 270
    return-object p1

    .line 271
    :pswitch_8
    check-cast p1, Lfg/l;

    .line 272
    .line 273
    check-cast p2, Lu6/c;

    .line 274
    .line 275
    :try_start_1
    sget-object v0, Ls6/a;->h:Ll3/w;

    .line 276
    .line 277
    invoke-virtual {p2}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    invoke-interface {p2}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    sget-object v0, Ls6/a;->j:Lzf/b;

    .line 289
    .line 290
    new-instance v1, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    :cond_a
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    if-eqz v2, :cond_c

    .line 304
    .line 305
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    move-object v3, v2

    .line 310
    check-cast v3, Ls6/a;

    .line 311
    .line 312
    iget v3, v3, Ls6/a;->g:I

    .line 313
    .line 314
    and-int/2addr v3, p2

    .line 315
    if-eqz v3, :cond_b

    .line 316
    .line 317
    const/4 v3, 0x1

    .line 318
    goto :goto_a

    .line 319
    :cond_b
    const/4 v3, 0x0

    .line 320
    :goto_a
    if-eqz v3, :cond_a

    .line 321
    .line 322
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_c
    invoke-static {v1}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 327
    .line 328
    .line 329
    move-result-object p2

    .line 330
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    check-cast p1, Ljava/lang/Boolean;

    .line 335
    .line 336
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 337
    .line 338
    .line 339
    goto :goto_b

    .line 340
    :catchall_1
    move-exception p1

    .line 341
    new-instance p2, Lsf/f;

    .line 342
    .line 343
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 344
    .line 345
    .line 346
    move-object p1, p2

    .line 347
    :goto_b
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 348
    .line 349
    instance-of v0, p1, Lsf/f;

    .line 350
    .line 351
    if-eqz v0, :cond_d

    .line 352
    .line 353
    move-object p1, p2

    .line 354
    :cond_d
    check-cast p1, Ljava/lang/Boolean;

    .line 355
    .line 356
    return-object p1

    .line 357
    :pswitch_9
    check-cast p1, Ljava/util/Set;

    .line 358
    .line 359
    check-cast p2, Lu6/c;

    .line 360
    .line 361
    check-cast p1, Ljava/lang/Iterable;

    .line 362
    .line 363
    instance-of v0, p1, Ljava/util/Collection;

    .line 364
    .line 365
    if-eqz v0, :cond_e

    .line 366
    .line 367
    move-object v0, p1

    .line 368
    check-cast v0, Ljava/util/Collection;

    .line 369
    .line 370
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_e

    .line 375
    .line 376
    goto :goto_c

    .line 377
    :cond_e
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    :cond_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_10

    .line 386
    .line 387
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    check-cast v0, Ls6/a;

    .line 392
    .line 393
    invoke-virtual {p2}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-interface {v1}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    iget v0, v0, Ls6/a;->g:I

    .line 402
    .line 403
    and-int/2addr v0, v1

    .line 404
    if-eqz v0, :cond_f

    .line 405
    .line 406
    const/4 p1, 0x0

    .line 407
    goto :goto_d

    .line 408
    :cond_10
    :goto_c
    const/4 p1, 0x1

    .line 409
    :goto_d
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    return-object p1

    .line 414
    :pswitch_a
    check-cast p1, Ljava/util/Set;

    .line 415
    .line 416
    check-cast p2, Lu6/c;

    .line 417
    .line 418
    check-cast p1, Ljava/lang/Iterable;

    .line 419
    .line 420
    instance-of v0, p1, Ljava/util/Collection;

    .line 421
    .line 422
    if-eqz v0, :cond_11

    .line 423
    .line 424
    move-object v0, p1

    .line 425
    check-cast v0, Ljava/util/Collection;

    .line 426
    .line 427
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    if-eqz v0, :cond_11

    .line 432
    .line 433
    goto :goto_f

    .line 434
    :cond_11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-eqz v0, :cond_13

    .line 443
    .line 444
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    check-cast v0, Ls6/a;

    .line 449
    .line 450
    invoke-virtual {p2}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    invoke-interface {v1}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    iget v0, v0, Ls6/a;->g:I

    .line 459
    .line 460
    and-int/2addr v0, v1

    .line 461
    if-eqz v0, :cond_12

    .line 462
    .line 463
    goto :goto_e

    .line 464
    :cond_12
    const/4 p1, 0x0

    .line 465
    goto :goto_10

    .line 466
    :cond_13
    :goto_f
    const/4 p1, 0x1

    .line 467
    :goto_10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    return-object p1

    .line 472
    :pswitch_b
    check-cast p1, Lfg/l;

    .line 473
    .line 474
    check-cast p2, Lu6/c;

    .line 475
    .line 476
    :try_start_2
    invoke-virtual {p2}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 477
    .line 478
    .line 479
    move-result-object p2

    .line 480
    invoke-interface {p2}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object p2

    .line 484
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    check-cast p1, Ljava/lang/Boolean;

    .line 492
    .line 493
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 494
    .line 495
    .line 496
    goto :goto_11

    .line 497
    :catchall_2
    move-exception p1

    .line 498
    new-instance p2, Lsf/f;

    .line 499
    .line 500
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 501
    .line 502
    .line 503
    move-object p1, p2

    .line 504
    :goto_11
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 505
    .line 506
    instance-of v0, p1, Lsf/f;

    .line 507
    .line 508
    if-eqz v0, :cond_14

    .line 509
    .line 510
    move-object p1, p2

    .line 511
    :cond_14
    check-cast p1, Ljava/lang/Boolean;

    .line 512
    .line 513
    return-object p1

    .line 514
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 515
    .line 516
    check-cast p2, Lu6/c;

    .line 517
    .line 518
    invoke-virtual {p2}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 519
    .line 520
    .line 521
    move-result-object p2

    .line 522
    invoke-interface {p2}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object p2

    .line 526
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result p1

    .line 533
    goto/16 :goto_0

    .line 534
    .line 535
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
