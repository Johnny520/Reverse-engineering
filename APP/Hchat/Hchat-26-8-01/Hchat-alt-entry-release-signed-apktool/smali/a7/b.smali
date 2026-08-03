.class public final synthetic La7/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, La7/b;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget v0, p0, La7/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lud/p;

    .line 7
    .line 8
    iget-object v0, p1, Lmd/e;->g:Lmd/f;

    .line 9
    .line 10
    invoke-virtual {v0}, Lmd/f;->f()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p1, Lud/p;->k:Lpd/k;

    .line 18
    .line 19
    sget-object v0, Lpd/k;->q:Lpd/k;

    .line 20
    .line 21
    if-eq p1, v0, :cond_2

    .line 22
    .line 23
    sget-object v0, Lpd/k;->Q:Lpd/k;

    .line 24
    .line 25
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 31
    :goto_2
    return p1

    .line 32
    :pswitch_0
    check-cast p1, Lud/a;

    .line 33
    .line 34
    iget-object v0, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    iget-object v0, p1, Lud/a;->m:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iget-object v0, p1, Lud/a;->n:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    sget-object v0, Lmd/a;->g:Lmd/a;

    .line 59
    .line 60
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    sget-object v0, Lmd/a;->h:Lmd/a;

    .line 69
    .line 70
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_3

    .line 77
    .line 78
    const/4 p1, 0x1

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    const/4 p1, 0x0

    .line 81
    :goto_3
    return p1

    .line 82
    :pswitch_1
    check-cast p1, Lud/a;

    .line 83
    .line 84
    invoke-static {p1}, Lce/m;->q(Lud/a;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    return p1

    .line 89
    :pswitch_2
    check-cast p1, Lud/a;

    .line 90
    .line 91
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    xor-int/lit8 p1, p1, 0x1

    .line 98
    .line 99
    return p1

    .line 100
    :pswitch_3
    check-cast p1, Lud/a;

    .line 101
    .line 102
    sget-object v0, Lmd/a;->u:Lmd/a;

    .line 103
    .line 104
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    return p1

    .line 111
    :pswitch_4
    check-cast p1, Lae/h;

    .line 112
    .line 113
    iget-object v0, p1, Lae/h;->i:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_5

    .line 120
    .line 121
    iget-object p1, p1, Lae/h;->h:Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_4

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_4
    const/4 p1, 0x0

    .line 131
    goto :goto_5

    .line 132
    :cond_5
    :goto_4
    const/4 p1, 0x1

    .line 133
    :goto_5
    return p1

    .line 134
    :pswitch_5
    check-cast p1, Lc7/b;

    .line 135
    .line 136
    invoke-virtual {p1}, Lc7/b;->b()J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    const-wide/16 v2, 0x0

    .line 141
    .line 142
    cmp-long v0, v0, v2

    .line 143
    .line 144
    const/4 v1, 0x1

    .line 145
    if-nez v0, :cond_6

    .line 146
    .line 147
    iget-object p1, p1, Lc7/b;->a:Ld7/m;

    .line 148
    .line 149
    invoke-virtual {p1}, Ld7/g;->a0()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    const-string v0, "/"

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_6

    .line 160
    .line 161
    move p1, v1

    .line 162
    goto :goto_6

    .line 163
    :cond_6
    const/4 p1, 0x0

    .line 164
    :goto_6
    xor-int/2addr p1, v1

    .line 165
    return p1

    .line 166
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {p1}, Lbsh/classpath/BshClassPath;->isClassFileName(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    return p1

    .line 173
    :pswitch_7
    check-cast p1, Ljava/nio/file/Path;

    .line 174
    .line 175
    const/4 v0, 0x0

    .line 176
    new-array v0, v0, [Ljava/nio/file/LinkOption;

    .line 177
    .line 178
    invoke-static {p1, v0}, Ljava/nio/file/Files;->isRegularFile(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    return p1

    .line 183
    :pswitch_8
    check-cast p1, Ljava/util/Map$Entry;

    .line 184
    .line 185
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Ljava/util/List;

    .line 190
    .line 191
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    const/4 v0, 0x1

    .line 196
    if-ne p1, v0, :cond_7

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_7
    const/4 v0, 0x0

    .line 200
    :goto_7
    return v0

    .line 201
    :pswitch_9
    check-cast p1, Lud/r;

    .line 202
    .line 203
    invoke-virtual {p1}, Lud/r;->W()Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    return p1

    .line 208
    :pswitch_a
    check-cast p1, Lnd/b0;

    .line 209
    .line 210
    iget p1, p1, Lnd/r;->i:I

    .line 211
    .line 212
    if-eqz p1, :cond_8

    .line 213
    .line 214
    const/4 p1, 0x1

    .line 215
    goto :goto_8

    .line 216
    :cond_8
    const/4 p1, 0x0

    .line 217
    :goto_8
    return p1

    .line 218
    :pswitch_b
    check-cast p1, Lnd/b0;

    .line 219
    .line 220
    sget-object v0, Lmd/a;->s:Lmd/a;

    .line 221
    .line 222
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 223
    .line 224
    invoke-virtual {p1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    xor-int/lit8 p1, p1, 0x1

    .line 229
    .line 230
    return p1

    .line 231
    :pswitch_c
    check-cast p1, Lud/m;

    .line 232
    .line 233
    instance-of p1, p1, Lud/r;

    .line 234
    .line 235
    xor-int/lit8 p1, p1, 0x1

    .line 236
    .line 237
    return p1

    .line 238
    :pswitch_d
    check-cast p1, Lqd/r;

    .line 239
    .line 240
    iget-object p1, p1, Lqd/l;->j:Lud/p;

    .line 241
    .line 242
    sget-object v0, Lpd/k;->v:Lpd/k;

    .line 243
    .line 244
    invoke-static {p1, v0}, Lxe/m;->j(Lud/p;Lpd/k;)Z

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    return p1

    .line 249
    :pswitch_e
    check-cast p1, Ljava/lang/String;

    .line 250
    .line 251
    const-string v0, "java.lang.Throwable"

    .line 252
    .line 253
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    xor-int/lit8 p1, p1, 0x1

    .line 258
    .line 259
    return p1

    .line 260
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 261
    .line 262
    const-string v0, "java.lang.Exception"

    .line 263
    .line 264
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    xor-int/lit8 p1, p1, 0x1

    .line 269
    .line 270
    return p1

    .line 271
    :pswitch_10
    check-cast p1, Lqd/j;

    .line 272
    .line 273
    invoke-virtual {p1}, Lqd/j;->w()Z

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    return p1

    .line 278
    :pswitch_11
    check-cast p1, Lqd/j;

    .line 279
    .line 280
    invoke-static {p1}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    return p1

    .line 285
    :pswitch_12
    check-cast p1, Ljava/util/Map$Entry;

    .line 286
    .line 287
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    check-cast p1, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    const/4 v0, 0x1

    .line 298
    if-le p1, v0, :cond_9

    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_9
    const/4 v0, 0x0

    .line 302
    :goto_9
    return v0

    .line 303
    :pswitch_13
    check-cast p1, Lud/g;

    .line 304
    .line 305
    iget-object p1, p1, Lud/g;->m:Lb5/k;

    .line 306
    .line 307
    invoke-virtual {p1}, Lb5/k;->h()Z

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    xor-int/lit8 p1, p1, 0x1

    .line 312
    .line 313
    return p1

    .line 314
    :pswitch_14
    check-cast p1, Lud/g;

    .line 315
    .line 316
    iget-object p1, p1, Lud/g;->m:Lb5/k;

    .line 317
    .line 318
    invoke-virtual {p1}, Lb5/k;->h()Z

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    return p1

    .line 323
    :pswitch_15
    check-cast p1, Lud/p;

    .line 324
    .line 325
    iget-object p1, p1, Lud/p;->m:Ljava/util/List;

    .line 326
    .line 327
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 328
    .line 329
    .line 330
    move-result p1

    .line 331
    const/4 v0, 0x1

    .line 332
    if-ne p1, v0, :cond_a

    .line 333
    .line 334
    goto :goto_a

    .line 335
    :cond_a
    const/4 v0, 0x0

    .line 336
    :goto_a
    return v0

    .line 337
    :pswitch_16
    check-cast p1, Lud/g;

    .line 338
    .line 339
    iget-object p1, p1, Lud/g;->l:Lod/c;

    .line 340
    .line 341
    iget-object p1, p1, Lod/c;->h:Ljava/lang/String;

    .line 342
    .line 343
    const-string v0, "$VALUES"

    .line 344
    .line 345
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result p1

    .line 349
    return p1

    .line 350
    :pswitch_17
    check-cast p1, Lud/g;

    .line 351
    .line 352
    iget-object p1, p1, Lud/g;->m:Lb5/k;

    .line 353
    .line 354
    invoke-virtual {p1}, Lb5/k;->i()Z

    .line 355
    .line 356
    .line 357
    move-result p1

    .line 358
    xor-int/lit8 p1, p1, 0x1

    .line 359
    .line 360
    return p1

    .line 361
    :pswitch_18
    check-cast p1, Lud/g;

    .line 362
    .line 363
    iget-object p1, p1, Lud/g;->n:Lqd/j;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    instance-of p1, p1, Lqd/a;

    .line 369
    .line 370
    return p1

    .line 371
    :pswitch_19
    check-cast p1, Lud/g;

    .line 372
    .line 373
    iget-object p1, p1, Lud/g;->m:Lb5/k;

    .line 374
    .line 375
    invoke-virtual {p1}, Lb5/k;->h()Z

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    return p1

    .line 380
    :pswitch_1a
    check-cast p1, Lqd/r;

    .line 381
    .line 382
    iget-object v0, p1, Lqd/l;->j:Lud/p;

    .line 383
    .line 384
    if-eqz v0, :cond_d

    .line 385
    .line 386
    iget-object v1, v0, Lud/p;->k:Lpd/k;

    .line 387
    .line 388
    sget-object v2, Lpd/k;->X:Lpd/k;

    .line 389
    .line 390
    if-ne v1, v2, :cond_b

    .line 391
    .line 392
    goto :goto_b

    .line 393
    :cond_b
    iget-object p1, p1, Lqd/r;->m:Lqd/s;

    .line 394
    .line 395
    invoke-virtual {p1}, Lqd/s;->b()Lqd/k;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    iget-object p1, p1, Lqd/k;->c:Ljava/util/List;

    .line 400
    .line 401
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 402
    .line 403
    .line 404
    move-result p1

    .line 405
    const/4 v1, 0x1

    .line 406
    if-le p1, v1, :cond_c

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_c
    sget-object p1, Lmd/a;->s:Lmd/a;

    .line 410
    .line 411
    iget-object v0, v0, Lmd/e;->g:Lmd/f;

    .line 412
    .line 413
    invoke-virtual {v0, p1}, Lmd/f;->a(Lmd/a;)Z

    .line 414
    .line 415
    .line 416
    move-result p1

    .line 417
    goto :goto_c

    .line 418
    :cond_d
    :goto_b
    const/4 p1, 0x0

    .line 419
    :goto_c
    return p1

    .line 420
    :pswitch_1b
    check-cast p1, Lqd/s;

    .line 421
    .line 422
    iget-object p1, p1, Lqd/s;->i:Lqd/r;

    .line 423
    .line 424
    sget-object v0, Lmd/a;->M:Lmd/a;

    .line 425
    .line 426
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 427
    .line 428
    invoke-virtual {p1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 429
    .line 430
    .line 431
    move-result p1

    .line 432
    return p1

    .line 433
    :pswitch_1c
    check-cast p1, Lv7/d;

    .line 434
    .line 435
    iget-object v0, p1, Lv7/d;->k:Lv7/g0;

    .line 436
    .line 437
    instance-of v0, v0, Lv7/b0;

    .line 438
    .line 439
    const/4 v1, 0x0

    .line 440
    if-eqz v0, :cond_12

    .line 441
    .line 442
    const-class v0, Ll7/m;

    .line 443
    .line 444
    invoke-virtual {p1, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    check-cast p1, Ll7/m;

    .line 449
    .line 450
    if-eqz p1, :cond_e

    .line 451
    .line 452
    invoke-virtual {p1}, Ll7/m;->V()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    goto :goto_d

    .line 457
    :cond_e
    const/4 p1, 0x0

    .line 458
    :goto_d
    const/4 v0, 0x1

    .line 459
    if-nez p1, :cond_f

    .line 460
    .line 461
    move p1, v1

    .line 462
    goto :goto_e

    .line 463
    :cond_f
    const-string v2, "string"

    .line 464
    .line 465
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    if-eqz v3, :cond_10

    .line 470
    .line 471
    move p1, v0

    .line 472
    goto :goto_e

    .line 473
    :cond_10
    invoke-static {v2}, Ll7/m;->W(Ljava/lang/String;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-static {p1}, Ll7/m;->W(Ljava/lang/String;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result p1

    .line 485
    :goto_e
    if-eqz p1, :cond_11

    .line 486
    .line 487
    goto :goto_f

    .line 488
    :cond_11
    move v1, v0

    .line 489
    :cond_12
    :goto_f
    return v1

    .line 490
    nop

    .line 491
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
