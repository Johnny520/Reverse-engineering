.class public final synthetic Lx6/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lr6/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx6/a;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lx6/a;->h:Lr6/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lx6/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/Set;

    .line 7
    .line 8
    check-cast p2, Lu6/c;

    .line 9
    .line 10
    invoke-virtual {p2}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    instance-of v0, p2, Ljava/lang/reflect/AnnotatedElement;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p2, Ljava/lang/reflect/AnnotatedElement;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object p2, v1

    .line 23
    :goto_0
    const/4 v0, 0x0

    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    new-array p2, v0, [Ljava/lang/annotation/Annotation;

    .line 34
    .line 35
    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    array-length v3, p2

    .line 38
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    array-length v3, p2

    .line 42
    move v4, v0

    .line 43
    :goto_2
    if-ge v4, v3, :cond_2

    .line 44
    .line 45
    aget-object v5, p2, v4

    .line 46
    .line 47
    invoke-static {v5}, La/a;->Q(Ljava/lang/annotation/Annotation;)Lgg/f;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-interface {v5}, Lgg/e;->a()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    check-cast p1, Ljava/util/Collection;

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    const/4 v4, 0x1

    .line 75
    if-eq p2, v3, :cond_3

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_3
    check-cast p1, Ljava/lang/Iterable;

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    move p2, v0

    .line 85
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_6

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    add-int/lit8 v5, p2, 0x1

    .line 96
    .line 97
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Ljava/lang/Class;

    .line 102
    .line 103
    iget-object v6, p0, Lx6/a;->h:Lr6/c;

    .line 104
    .line 105
    invoke-static {v3, v6, v1}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const-class v6, Ls6/b;

    .line 110
    .line 111
    invoke-static {v6}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-static {v7}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    if-nez v7, :cond_4

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_4
    move-object v6, v7

    .line 123
    :goto_4
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-nez v6, :cond_5

    .line 128
    .line 129
    invoke-static {p2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-nez p2, :cond_5

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_5
    move p2, v5

    .line 137
    goto :goto_3

    .line 138
    :cond_6
    move v0, v4

    .line 139
    :goto_5
    xor-int/lit8 p1, v0, 0x1

    .line 140
    .line 141
    :goto_6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    return-object p1

    .line 146
    :pswitch_0
    check-cast p1, Ljava/util/Set;

    .line 147
    .line 148
    check-cast p2, Lu6/c;

    .line 149
    .line 150
    invoke-virtual {p2}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    instance-of v0, p2, Ljava/lang/reflect/AnnotatedElement;

    .line 155
    .line 156
    const/4 v1, 0x0

    .line 157
    if-eqz v0, :cond_7

    .line 158
    .line 159
    check-cast p2, Ljava/lang/reflect/AnnotatedElement;

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_7
    move-object p2, v1

    .line 163
    :goto_7
    const/4 v0, 0x0

    .line 164
    if-eqz p2, :cond_8

    .line 165
    .line 166
    invoke-interface {p2}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    if-eqz p2, :cond_8

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_8
    new-array p2, v0, [Ljava/lang/annotation/Annotation;

    .line 174
    .line 175
    :goto_8
    new-instance v2, Ljava/util/ArrayList;

    .line 176
    .line 177
    array-length v3, p2

    .line 178
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 179
    .line 180
    .line 181
    array-length v3, p2

    .line 182
    move v4, v0

    .line 183
    :goto_9
    if-ge v4, v3, :cond_9

    .line 184
    .line 185
    aget-object v5, p2, v4

    .line 186
    .line 187
    invoke-static {v5}, La/a;->Q(Ljava/lang/annotation/Annotation;)Lgg/f;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-interface {v5}, Lgg/e;->a()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    add-int/lit8 v4, v4, 0x1

    .line 202
    .line 203
    goto :goto_9

    .line 204
    :cond_9
    check-cast p1, Ljava/util/Collection;

    .line 205
    .line 206
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eq p2, v3, :cond_a

    .line 215
    .line 216
    goto :goto_c

    .line 217
    :cond_a
    check-cast p1, Ljava/lang/Iterable;

    .line 218
    .line 219
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    move p2, v0

    .line 224
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_d

    .line 229
    .line 230
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    add-int/lit8 v4, p2, 0x1

    .line 235
    .line 236
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    check-cast p2, Ljava/lang/Class;

    .line 241
    .line 242
    iget-object v5, p0, Lx6/a;->h:Lr6/c;

    .line 243
    .line 244
    invoke-static {v3, v5, v1}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    const-class v5, Ls6/b;

    .line 249
    .line 250
    invoke-static {v5}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-static {v6}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    if-nez v6, :cond_b

    .line 259
    .line 260
    goto :goto_b

    .line 261
    :cond_b
    move-object v5, v6

    .line 262
    :goto_b
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    if-nez v5, :cond_c

    .line 267
    .line 268
    invoke-static {p2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    if-nez p2, :cond_c

    .line 273
    .line 274
    goto :goto_c

    .line 275
    :cond_c
    move p2, v4

    .line 276
    goto :goto_a

    .line 277
    :cond_d
    const/4 v0, 0x1

    .line 278
    :goto_c
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    return-object p1

    .line 283
    :pswitch_1
    check-cast p1, Ljava/util/Set;

    .line 284
    .line 285
    check-cast p2, Lu6/a;

    .line 286
    .line 287
    check-cast p1, Ljava/util/Collection;

    .line 288
    .line 289
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 290
    .line 291
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getExceptionTypes()[Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object p2

    .line 302
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    const/4 v2, 0x1

    .line 311
    const/4 v3, 0x0

    .line 312
    if-eq v0, v1, :cond_e

    .line 313
    .line 314
    goto :goto_f

    .line 315
    :cond_e
    check-cast p1, Ljava/lang/Iterable;

    .line 316
    .line 317
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    move v0, v3

    .line 322
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_11

    .line 327
    .line 328
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    add-int/lit8 v4, v0, 0x1

    .line 333
    .line 334
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, Ljava/lang/Class;

    .line 339
    .line 340
    iget-object v5, p0, Lx6/a;->h:Lr6/c;

    .line 341
    .line 342
    const/4 v6, 0x0

    .line 343
    invoke-static {v1, v5, v6}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    const-class v5, Ls6/b;

    .line 348
    .line 349
    invoke-static {v5}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-static {v6}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    if-nez v6, :cond_f

    .line 358
    .line 359
    goto :goto_e

    .line 360
    :cond_f
    move-object v5, v6

    .line 361
    :goto_e
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v5

    .line 365
    if-nez v5, :cond_10

    .line 366
    .line 367
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-nez v0, :cond_10

    .line 372
    .line 373
    goto :goto_f

    .line 374
    :cond_10
    move v0, v4

    .line 375
    goto :goto_d

    .line 376
    :cond_11
    move v3, v2

    .line 377
    :goto_f
    xor-int/lit8 p1, v3, 0x1

    .line 378
    .line 379
    goto/16 :goto_6

    .line 380
    .line 381
    :pswitch_2
    check-cast p1, Ljava/util/Set;

    .line 382
    .line 383
    check-cast p2, Lu6/a;

    .line 384
    .line 385
    check-cast p1, Ljava/util/Collection;

    .line 386
    .line 387
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 388
    .line 389
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getExceptionTypes()[Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    move-result-object p2

    .line 393
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object p2

    .line 400
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    const/4 v2, 0x0

    .line 409
    if-eq v0, v1, :cond_12

    .line 410
    .line 411
    goto :goto_12

    .line 412
    :cond_12
    check-cast p1, Ljava/lang/Iterable;

    .line 413
    .line 414
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    move v0, v2

    .line 419
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_15

    .line 424
    .line 425
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    add-int/lit8 v3, v0, 0x1

    .line 430
    .line 431
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, Ljava/lang/Class;

    .line 436
    .line 437
    iget-object v4, p0, Lx6/a;->h:Lr6/c;

    .line 438
    .line 439
    const/4 v5, 0x0

    .line 440
    invoke-static {v1, v4, v5}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    const-class v4, Ls6/b;

    .line 445
    .line 446
    invoke-static {v4}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    invoke-static {v5}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    if-nez v5, :cond_13

    .line 455
    .line 456
    goto :goto_11

    .line 457
    :cond_13
    move-object v4, v5

    .line 458
    :goto_11
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    if-nez v4, :cond_14

    .line 463
    .line 464
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    if-nez v0, :cond_14

    .line 469
    .line 470
    goto :goto_12

    .line 471
    :cond_14
    move v0, v3

    .line 472
    goto :goto_10

    .line 473
    :cond_15
    const/4 v2, 0x1

    .line 474
    :goto_12
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    return-object p1

    .line 479
    :pswitch_3
    check-cast p1, Ljava/util/Set;

    .line 480
    .line 481
    check-cast p2, Lu6/a;

    .line 482
    .line 483
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    const/4 p2, 0x0

    .line 487
    new-array p2, p2, [Ljava/lang/reflect/AnnotatedElement;

    .line 488
    .line 489
    invoke-static {p2}, Lx6/g;->e([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object p2

    .line 493
    check-cast p1, Ljava/util/Collection;

    .line 494
    .line 495
    iget-object v0, p0, Lx6/a;->h:Lr6/c;

    .line 496
    .line 497
    invoke-static {p1, p2, v0}, Lx6/g;->f(Ljava/util/Collection;Ljava/util/List;Lr6/c;)Z

    .line 498
    .line 499
    .line 500
    move-result p1

    .line 501
    :goto_13
    xor-int/lit8 p1, p1, 0x1

    .line 502
    .line 503
    goto/16 :goto_6

    .line 504
    .line 505
    :pswitch_4
    check-cast p1, Ljava/util/Set;

    .line 506
    .line 507
    check-cast p2, Lu6/a;

    .line 508
    .line 509
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    const/4 p2, 0x0

    .line 513
    new-array p2, p2, [Ljava/lang/reflect/AnnotatedElement;

    .line 514
    .line 515
    invoke-static {p2}, Lx6/g;->e([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object p2

    .line 519
    check-cast p1, Ljava/util/Collection;

    .line 520
    .line 521
    iget-object v0, p0, Lx6/a;->h:Lr6/c;

    .line 522
    .line 523
    invoke-static {p1, p2, v0}, Lx6/g;->f(Ljava/util/Collection;Ljava/util/List;Lr6/c;)Z

    .line 524
    .line 525
    .line 526
    move-result p1

    .line 527
    goto/16 :goto_6

    .line 528
    .line 529
    :pswitch_5
    check-cast p1, Ljava/util/Set;

    .line 530
    .line 531
    check-cast p2, Lu6/a;

    .line 532
    .line 533
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    const/4 p2, 0x0

    .line 537
    new-array p2, p2, [Ljava/lang/reflect/AnnotatedElement;

    .line 538
    .line 539
    invoke-static {p2}, Lx6/g;->e([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object p2

    .line 543
    check-cast p1, Ljava/util/Collection;

    .line 544
    .line 545
    iget-object v0, p0, Lx6/a;->h:Lr6/c;

    .line 546
    .line 547
    invoke-static {p1, p2, v0}, Lx6/g;->f(Ljava/util/Collection;Ljava/util/List;Lr6/c;)Z

    .line 548
    .line 549
    .line 550
    move-result p1

    .line 551
    goto :goto_13

    .line 552
    :pswitch_6
    check-cast p1, Ljava/util/Set;

    .line 553
    .line 554
    check-cast p2, Lu6/a;

    .line 555
    .line 556
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    const/4 p2, 0x0

    .line 560
    new-array p2, p2, [Ljava/lang/reflect/AnnotatedElement;

    .line 561
    .line 562
    invoke-static {p2}, Lx6/g;->e([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object p2

    .line 566
    check-cast p1, Ljava/util/Collection;

    .line 567
    .line 568
    iget-object v0, p0, Lx6/a;->h:Lr6/c;

    .line 569
    .line 570
    invoke-static {p1, p2, v0}, Lx6/g;->f(Ljava/util/Collection;Ljava/util/List;Lr6/c;)Z

    .line 571
    .line 572
    .line 573
    move-result p1

    .line 574
    goto/16 :goto_6

    .line 575
    .line 576
    :pswitch_7
    check-cast p1, Ljava/util/Set;

    .line 577
    .line 578
    check-cast p2, Lu6/a;

    .line 579
    .line 580
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    new-instance p2, Ljava/util/ArrayList;

    .line 584
    .line 585
    const/4 v0, 0x0

    .line 586
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 587
    .line 588
    .line 589
    check-cast p1, Ljava/util/Collection;

    .line 590
    .line 591
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    const/4 v3, 0x1

    .line 600
    if-eq v1, v2, :cond_16

    .line 601
    .line 602
    goto :goto_16

    .line 603
    :cond_16
    check-cast p1, Ljava/lang/Iterable;

    .line 604
    .line 605
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 606
    .line 607
    .line 608
    move-result-object p1

    .line 609
    move v1, v0

    .line 610
    :goto_14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 611
    .line 612
    .line 613
    move-result v2

    .line 614
    if-eqz v2, :cond_19

    .line 615
    .line 616
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    add-int/lit8 v4, v1, 0x1

    .line 621
    .line 622
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    check-cast v1, Ljava/lang/Class;

    .line 627
    .line 628
    iget-object v5, p0, Lx6/a;->h:Lr6/c;

    .line 629
    .line 630
    const/4 v6, 0x0

    .line 631
    invoke-static {v2, v5, v6}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    const-class v5, Ls6/b;

    .line 636
    .line 637
    invoke-static {v5}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 638
    .line 639
    .line 640
    move-result-object v6

    .line 641
    invoke-static {v6}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    move-result-object v6

    .line 645
    if-nez v6, :cond_17

    .line 646
    .line 647
    goto :goto_15

    .line 648
    :cond_17
    move-object v5, v6

    .line 649
    :goto_15
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v5

    .line 653
    if-nez v5, :cond_18

    .line 654
    .line 655
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    if-nez v1, :cond_18

    .line 660
    .line 661
    goto :goto_16

    .line 662
    :cond_18
    move v1, v4

    .line 663
    goto :goto_14

    .line 664
    :cond_19
    move v0, v3

    .line 665
    :goto_16
    xor-int/lit8 p1, v0, 0x1

    .line 666
    .line 667
    goto/16 :goto_6

    .line 668
    .line 669
    :pswitch_8
    check-cast p1, Ljava/util/List;

    .line 670
    .line 671
    check-cast p2, Lu6/a;

    .line 672
    .line 673
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 674
    .line 675
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    move-result-object p2

    .line 679
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 683
    .line 684
    .line 685
    move-result-object p2

    .line 686
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    const/4 v2, 0x1

    .line 695
    const/4 v3, 0x0

    .line 696
    if-eq v0, v1, :cond_1a

    .line 697
    .line 698
    goto/16 :goto_f

    .line 699
    .line 700
    :cond_1a
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 701
    .line 702
    .line 703
    move-result-object p1

    .line 704
    move v0, v3

    .line 705
    :goto_17
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 706
    .line 707
    .line 708
    move-result v1

    .line 709
    if-eqz v1, :cond_11

    .line 710
    .line 711
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    add-int/lit8 v4, v0, 0x1

    .line 716
    .line 717
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    check-cast v0, Ljava/lang/Class;

    .line 722
    .line 723
    iget-object v5, p0, Lx6/a;->h:Lr6/c;

    .line 724
    .line 725
    const/4 v6, 0x0

    .line 726
    invoke-static {v1, v5, v6}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    const-class v5, Ls6/b;

    .line 731
    .line 732
    invoke-static {v5}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 733
    .line 734
    .line 735
    move-result-object v6

    .line 736
    invoke-static {v6}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    move-result-object v6

    .line 740
    if-nez v6, :cond_1b

    .line 741
    .line 742
    goto :goto_18

    .line 743
    :cond_1b
    move-object v5, v6

    .line 744
    :goto_18
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v5

    .line 748
    if-nez v5, :cond_1c

    .line 749
    .line 750
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 751
    .line 752
    .line 753
    move-result v0

    .line 754
    if-nez v0, :cond_1c

    .line 755
    .line 756
    goto/16 :goto_f

    .line 757
    .line 758
    :cond_1c
    move v0, v4

    .line 759
    goto :goto_17

    .line 760
    :pswitch_9
    check-cast p1, Ljava/util/Set;

    .line 761
    .line 762
    check-cast p2, Lu6/a;

    .line 763
    .line 764
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    new-instance p2, Ljava/util/ArrayList;

    .line 768
    .line 769
    const/4 v0, 0x0

    .line 770
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 771
    .line 772
    .line 773
    check-cast p1, Ljava/util/Collection;

    .line 774
    .line 775
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 776
    .line 777
    .line 778
    move-result v1

    .line 779
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 780
    .line 781
    .line 782
    move-result v2

    .line 783
    if-eq v1, v2, :cond_1d

    .line 784
    .line 785
    goto :goto_1b

    .line 786
    :cond_1d
    check-cast p1, Ljava/lang/Iterable;

    .line 787
    .line 788
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 789
    .line 790
    .line 791
    move-result-object p1

    .line 792
    move v1, v0

    .line 793
    :goto_19
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 794
    .line 795
    .line 796
    move-result v2

    .line 797
    if-eqz v2, :cond_20

    .line 798
    .line 799
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v2

    .line 803
    add-int/lit8 v3, v1, 0x1

    .line 804
    .line 805
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    check-cast v1, Ljava/lang/Class;

    .line 810
    .line 811
    iget-object v4, p0, Lx6/a;->h:Lr6/c;

    .line 812
    .line 813
    const/4 v5, 0x0

    .line 814
    invoke-static {v2, v4, v5}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    const-class v4, Ls6/b;

    .line 819
    .line 820
    invoke-static {v4}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 821
    .line 822
    .line 823
    move-result-object v5

    .line 824
    invoke-static {v5}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    move-result-object v5

    .line 828
    if-nez v5, :cond_1e

    .line 829
    .line 830
    goto :goto_1a

    .line 831
    :cond_1e
    move-object v4, v5

    .line 832
    :goto_1a
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    move-result v4

    .line 836
    if-nez v4, :cond_1f

    .line 837
    .line 838
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 839
    .line 840
    .line 841
    move-result v1

    .line 842
    if-nez v1, :cond_1f

    .line 843
    .line 844
    goto :goto_1b

    .line 845
    :cond_1f
    move v1, v3

    .line 846
    goto :goto_19

    .line 847
    :cond_20
    const/4 v0, 0x1

    .line 848
    :goto_1b
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 849
    .line 850
    .line 851
    move-result-object p1

    .line 852
    return-object p1

    .line 853
    :pswitch_a
    check-cast p1, Ljava/util/Set;

    .line 854
    .line 855
    check-cast p2, Lu6/a;

    .line 856
    .line 857
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    new-instance p2, Ljava/util/ArrayList;

    .line 861
    .line 862
    const/4 v0, 0x0

    .line 863
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 864
    .line 865
    .line 866
    check-cast p1, Ljava/util/Collection;

    .line 867
    .line 868
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 869
    .line 870
    .line 871
    move-result v1

    .line 872
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 873
    .line 874
    .line 875
    move-result v2

    .line 876
    const/4 v3, 0x1

    .line 877
    if-eq v1, v2, :cond_21

    .line 878
    .line 879
    goto/16 :goto_16

    .line 880
    .line 881
    :cond_21
    check-cast p1, Ljava/lang/Iterable;

    .line 882
    .line 883
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 884
    .line 885
    .line 886
    move-result-object p1

    .line 887
    move v1, v0

    .line 888
    :goto_1c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    if-eqz v2, :cond_19

    .line 893
    .line 894
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    add-int/lit8 v4, v1, 0x1

    .line 899
    .line 900
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v1

    .line 904
    check-cast v1, Ljava/lang/Class;

    .line 905
    .line 906
    iget-object v5, p0, Lx6/a;->h:Lr6/c;

    .line 907
    .line 908
    const/4 v6, 0x0

    .line 909
    invoke-static {v2, v5, v6}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    const-class v5, Ls6/b;

    .line 914
    .line 915
    invoke-static {v5}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 916
    .line 917
    .line 918
    move-result-object v6

    .line 919
    invoke-static {v6}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    move-result-object v6

    .line 923
    if-nez v6, :cond_22

    .line 924
    .line 925
    goto :goto_1d

    .line 926
    :cond_22
    move-object v5, v6

    .line 927
    :goto_1d
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 928
    .line 929
    .line 930
    move-result v5

    .line 931
    if-nez v5, :cond_23

    .line 932
    .line 933
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    move-result v1

    .line 937
    if-nez v1, :cond_23

    .line 938
    .line 939
    goto/16 :goto_16

    .line 940
    .line 941
    :cond_23
    move v1, v4

    .line 942
    goto :goto_1c

    .line 943
    :pswitch_b
    check-cast p1, Ljava/util/Set;

    .line 944
    .line 945
    check-cast p2, Lu6/a;

    .line 946
    .line 947
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    new-instance p2, Ljava/util/ArrayList;

    .line 951
    .line 952
    const/4 v0, 0x0

    .line 953
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 954
    .line 955
    .line 956
    check-cast p1, Ljava/util/Collection;

    .line 957
    .line 958
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 959
    .line 960
    .line 961
    move-result v1

    .line 962
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 963
    .line 964
    .line 965
    move-result v2

    .line 966
    if-eq v1, v2, :cond_24

    .line 967
    .line 968
    goto :goto_20

    .line 969
    :cond_24
    check-cast p1, Ljava/lang/Iterable;

    .line 970
    .line 971
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 972
    .line 973
    .line 974
    move-result-object p1

    .line 975
    move v1, v0

    .line 976
    :goto_1e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 977
    .line 978
    .line 979
    move-result v2

    .line 980
    if-eqz v2, :cond_27

    .line 981
    .line 982
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    add-int/lit8 v3, v1, 0x1

    .line 987
    .line 988
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    check-cast v1, Ljava/lang/Class;

    .line 993
    .line 994
    iget-object v4, p0, Lx6/a;->h:Lr6/c;

    .line 995
    .line 996
    const/4 v5, 0x0

    .line 997
    invoke-static {v2, v4, v5}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    const-class v4, Ls6/b;

    .line 1002
    .line 1003
    invoke-static {v4}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v5

    .line 1007
    invoke-static {v5}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v5

    .line 1011
    if-nez v5, :cond_25

    .line 1012
    .line 1013
    goto :goto_1f

    .line 1014
    :cond_25
    move-object v4, v5

    .line 1015
    :goto_1f
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1016
    .line 1017
    .line 1018
    move-result v4

    .line 1019
    if-nez v4, :cond_26

    .line 1020
    .line 1021
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v1

    .line 1025
    if-nez v1, :cond_26

    .line 1026
    .line 1027
    goto :goto_20

    .line 1028
    :cond_26
    move v1, v3

    .line 1029
    goto :goto_1e

    .line 1030
    :cond_27
    const/4 v0, 0x1

    .line 1031
    :goto_20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1032
    .line 1033
    .line 1034
    move-result-object p1

    .line 1035
    return-object p1

    .line 1036
    :pswitch_c
    check-cast p1, Ljava/util/List;

    .line 1037
    .line 1038
    check-cast p2, Lu6/a;

    .line 1039
    .line 1040
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 1041
    .line 1042
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 1043
    .line 1044
    .line 1045
    move-result-object p2

    .line 1046
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1047
    .line 1048
    .line 1049
    check-cast p2, [[Ljava/lang/annotation/Annotation;

    .line 1050
    .line 1051
    new-instance v0, Ljava/util/ArrayList;

    .line 1052
    .line 1053
    array-length v1, p2

    .line 1054
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1055
    .line 1056
    .line 1057
    array-length v1, p2

    .line 1058
    const/4 v2, 0x0

    .line 1059
    move v3, v2

    .line 1060
    :goto_21
    if-ge v3, v1, :cond_29

    .line 1061
    .line 1062
    aget-object v4, p2, v3

    .line 1063
    .line 1064
    check-cast v4, [Ljava/lang/annotation/Annotation;

    .line 1065
    .line 1066
    new-instance v5, Ljava/util/ArrayList;

    .line 1067
    .line 1068
    array-length v6, v4

    .line 1069
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1070
    .line 1071
    .line 1072
    array-length v6, v4

    .line 1073
    move v7, v2

    .line 1074
    :goto_22
    if-ge v7, v6, :cond_28

    .line 1075
    .line 1076
    aget-object v8, v4, v7

    .line 1077
    .line 1078
    invoke-static {v8}, La/a;->Q(Ljava/lang/annotation/Annotation;)Lgg/f;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v8

    .line 1082
    invoke-interface {v8}, Lgg/e;->a()Ljava/lang/Class;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v8

    .line 1086
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    add-int/lit8 v7, v7, 0x1

    .line 1093
    .line 1094
    goto :goto_22

    .line 1095
    :cond_28
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1096
    .line 1097
    .line 1098
    add-int/lit8 v3, v3, 0x1

    .line 1099
    .line 1100
    goto :goto_21

    .line 1101
    :cond_29
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 1102
    .line 1103
    .line 1104
    move-result p2

    .line 1105
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1106
    .line 1107
    .line 1108
    move-result v1

    .line 1109
    const/4 v3, 0x1

    .line 1110
    if-eq p2, v1, :cond_2a

    .line 1111
    .line 1112
    goto :goto_24

    .line 1113
    :cond_2a
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1114
    .line 1115
    .line 1116
    move-result-object p1

    .line 1117
    move p2, v2

    .line 1118
    :goto_23
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1119
    .line 1120
    .line 1121
    move-result v1

    .line 1122
    if-eqz v1, :cond_2c

    .line 1123
    .line 1124
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v1

    .line 1128
    check-cast v1, Ljava/util/Collection;

    .line 1129
    .line 1130
    add-int/lit8 v4, p2, 0x1

    .line 1131
    .line 1132
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object p2

    .line 1136
    check-cast p2, Ljava/util/List;

    .line 1137
    .line 1138
    iget-object v5, p0, Lx6/a;->h:Lr6/c;

    .line 1139
    .line 1140
    invoke-static {v1, p2, v5}, Lx6/g;->f(Ljava/util/Collection;Ljava/util/List;Lr6/c;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result p2

    .line 1144
    if-nez p2, :cond_2b

    .line 1145
    .line 1146
    goto :goto_24

    .line 1147
    :cond_2b
    move p2, v4

    .line 1148
    goto :goto_23

    .line 1149
    :cond_2c
    move v2, v3

    .line 1150
    :goto_24
    xor-int/lit8 p1, v2, 0x1

    .line 1151
    .line 1152
    goto/16 :goto_6

    .line 1153
    .line 1154
    :pswitch_d
    check-cast p1, Ljava/util/List;

    .line 1155
    .line 1156
    check-cast p2, Lu6/a;

    .line 1157
    .line 1158
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 1159
    .line 1160
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 1161
    .line 1162
    .line 1163
    move-result-object p2

    .line 1164
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    check-cast p2, [[Ljava/lang/annotation/Annotation;

    .line 1168
    .line 1169
    new-instance v0, Ljava/util/ArrayList;

    .line 1170
    .line 1171
    array-length v1, p2

    .line 1172
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1173
    .line 1174
    .line 1175
    array-length v1, p2

    .line 1176
    const/4 v2, 0x0

    .line 1177
    move v3, v2

    .line 1178
    :goto_25
    if-ge v3, v1, :cond_2e

    .line 1179
    .line 1180
    aget-object v4, p2, v3

    .line 1181
    .line 1182
    check-cast v4, [Ljava/lang/annotation/Annotation;

    .line 1183
    .line 1184
    new-instance v5, Ljava/util/ArrayList;

    .line 1185
    .line 1186
    array-length v6, v4

    .line 1187
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1188
    .line 1189
    .line 1190
    array-length v6, v4

    .line 1191
    move v7, v2

    .line 1192
    :goto_26
    if-ge v7, v6, :cond_2d

    .line 1193
    .line 1194
    aget-object v8, v4, v7

    .line 1195
    .line 1196
    invoke-static {v8}, La/a;->Q(Ljava/lang/annotation/Annotation;)Lgg/f;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v8

    .line 1200
    invoke-interface {v8}, Lgg/e;->a()Ljava/lang/Class;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v8

    .line 1204
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1208
    .line 1209
    .line 1210
    add-int/lit8 v7, v7, 0x1

    .line 1211
    .line 1212
    goto :goto_26

    .line 1213
    :cond_2d
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1214
    .line 1215
    .line 1216
    add-int/lit8 v3, v3, 0x1

    .line 1217
    .line 1218
    goto :goto_25

    .line 1219
    :cond_2e
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 1220
    .line 1221
    .line 1222
    move-result p2

    .line 1223
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1224
    .line 1225
    .line 1226
    move-result v1

    .line 1227
    if-eq p2, v1, :cond_2f

    .line 1228
    .line 1229
    goto :goto_28

    .line 1230
    :cond_2f
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1231
    .line 1232
    .line 1233
    move-result-object p1

    .line 1234
    move p2, v2

    .line 1235
    :goto_27
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1236
    .line 1237
    .line 1238
    move-result v1

    .line 1239
    if-eqz v1, :cond_31

    .line 1240
    .line 1241
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v1

    .line 1245
    check-cast v1, Ljava/util/Collection;

    .line 1246
    .line 1247
    add-int/lit8 v3, p2, 0x1

    .line 1248
    .line 1249
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object p2

    .line 1253
    check-cast p2, Ljava/util/List;

    .line 1254
    .line 1255
    iget-object v4, p0, Lx6/a;->h:Lr6/c;

    .line 1256
    .line 1257
    invoke-static {v1, p2, v4}, Lx6/g;->f(Ljava/util/Collection;Ljava/util/List;Lr6/c;)Z

    .line 1258
    .line 1259
    .line 1260
    move-result p2

    .line 1261
    if-nez p2, :cond_30

    .line 1262
    .line 1263
    goto :goto_28

    .line 1264
    :cond_30
    move p2, v3

    .line 1265
    goto :goto_27

    .line 1266
    :cond_31
    const/4 v2, 0x1

    .line 1267
    :goto_28
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1268
    .line 1269
    .line 1270
    move-result-object p1

    .line 1271
    return-object p1

    .line 1272
    :pswitch_e
    check-cast p2, Lu6/d;

    .line 1273
    .line 1274
    iget-object p2, p2, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 1275
    .line 1276
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1277
    .line 1278
    .line 1279
    move-result-object p2

    .line 1280
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1281
    .line 1282
    .line 1283
    const-string v0, "Method: returnType"

    .line 1284
    .line 1285
    iget-object v1, p0, Lx6/a;->h:Lr6/c;

    .line 1286
    .line 1287
    invoke-static {p1, v1, v0}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 1288
    .line 1289
    .line 1290
    move-result-object p1

    .line 1291
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1292
    .line 1293
    .line 1294
    move-result p1

    .line 1295
    goto/16 :goto_6

    .line 1296
    .line 1297
    :pswitch_f
    check-cast p1, Ljava/util/List;

    .line 1298
    .line 1299
    check-cast p2, Lu6/a;

    .line 1300
    .line 1301
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 1302
    .line 1303
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 1304
    .line 1305
    .line 1306
    move-result-object p2

    .line 1307
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1308
    .line 1309
    .line 1310
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 1311
    .line 1312
    .line 1313
    move-result-object p2

    .line 1314
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 1315
    .line 1316
    .line 1317
    move-result v0

    .line 1318
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 1319
    .line 1320
    .line 1321
    move-result v1

    .line 1322
    const/4 v2, 0x0

    .line 1323
    if-eq v0, v1, :cond_32

    .line 1324
    .line 1325
    goto :goto_2b

    .line 1326
    :cond_32
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1327
    .line 1328
    .line 1329
    move-result-object p1

    .line 1330
    move v0, v2

    .line 1331
    :goto_29
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1332
    .line 1333
    .line 1334
    move-result v1

    .line 1335
    if-eqz v1, :cond_35

    .line 1336
    .line 1337
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v1

    .line 1341
    add-int/lit8 v3, v0, 0x1

    .line 1342
    .line 1343
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v0

    .line 1347
    check-cast v0, Ljava/lang/Class;

    .line 1348
    .line 1349
    iget-object v4, p0, Lx6/a;->h:Lr6/c;

    .line 1350
    .line 1351
    const/4 v5, 0x0

    .line 1352
    invoke-static {v1, v4, v5}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v1

    .line 1356
    const-class v4, Ls6/b;

    .line 1357
    .line 1358
    invoke-static {v4}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v5

    .line 1362
    invoke-static {v5}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v5

    .line 1366
    if-nez v5, :cond_33

    .line 1367
    .line 1368
    goto :goto_2a

    .line 1369
    :cond_33
    move-object v4, v5

    .line 1370
    :goto_2a
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v4

    .line 1374
    if-nez v4, :cond_34

    .line 1375
    .line 1376
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1377
    .line 1378
    .line 1379
    move-result v0

    .line 1380
    if-nez v0, :cond_34

    .line 1381
    .line 1382
    goto :goto_2b

    .line 1383
    :cond_34
    move v0, v3

    .line 1384
    goto :goto_29

    .line 1385
    :cond_35
    const/4 v2, 0x1

    .line 1386
    :goto_2b
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1387
    .line 1388
    .line 1389
    move-result-object p1

    .line 1390
    return-object p1

    .line 1391
    :pswitch_10
    check-cast p2, Lu6/b;

    .line 1392
    .line 1393
    iget-object p2, p2, Lu6/b;->c:Ljava/lang/reflect/Field;

    .line 1394
    .line 1395
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1396
    .line 1397
    .line 1398
    move-result-object p2

    .line 1399
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1400
    .line 1401
    .line 1402
    const-string v0, "Field: type"

    .line 1403
    .line 1404
    iget-object v1, p0, Lx6/a;->h:Lr6/c;

    .line 1405
    .line 1406
    invoke-static {p1, v1, v0}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 1407
    .line 1408
    .line 1409
    move-result-object p1

    .line 1410
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1411
    .line 1412
    .line 1413
    move-result p1

    .line 1414
    goto/16 :goto_6

    .line 1415
    .line 1416
    nop

    .line 1417
    :pswitch_data_0
    .packed-switch 0x0
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
