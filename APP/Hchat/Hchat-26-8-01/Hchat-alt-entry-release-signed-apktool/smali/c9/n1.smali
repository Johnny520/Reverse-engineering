.class public final synthetic Lc9/n1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 8
    iput p2, p0, Lc9/n1;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lc9/n1;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lc9/n1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv0/b;

    .line 7
    .line 8
    check-cast p2, Li2/p0;

    .line 9
    .line 10
    iget-object p1, p2, Li2/p0;->a:Ljava/lang/String;

    .line 11
    .line 12
    return-object p1

    .line 13
    :pswitch_0
    check-cast p1, Lv0/b;

    .line 14
    .line 15
    check-cast p2, Lt2/g;

    .line 16
    .line 17
    iget p1, p2, Lt2/g;->a:I

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :pswitch_1
    check-cast p1, Lv0/b;

    .line 25
    .line 26
    check-cast p2, Lt2/h;

    .line 27
    .line 28
    iget p1, p2, Lt2/h;->a:I

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_2
    check-cast p1, Lv0/b;

    .line 36
    .line 37
    check-cast p2, Lt2/f;

    .line 38
    .line 39
    iget p1, p2, Lt2/f;->a:F

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :pswitch_3
    check-cast p1, Lv0/b;

    .line 47
    .line 48
    check-cast p2, Lt2/i;

    .line 49
    .line 50
    iget v0, p2, Lt2/i;->a:F

    .line 51
    .line 52
    new-instance v1, Lt2/f;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Lt2/f;-><init>(F)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Li2/d0;->B:Li2/c0;

    .line 58
    .line 59
    invoke-static {v1, v0, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget v1, p2, Lt2/i;->b:I

    .line 64
    .line 65
    new-instance v2, Lt2/h;

    .line 66
    .line 67
    invoke-direct {v2, v1}, Lt2/h;-><init>(I)V

    .line 68
    .line 69
    .line 70
    sget-object v1, Li2/d0;->C:Li2/c0;

    .line 71
    .line 72
    invoke-static {v2, v1, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget p2, p2, Lt2/i;->c:I

    .line 77
    .line 78
    new-instance v2, Lt2/g;

    .line 79
    .line 80
    invoke-direct {v2, p2}, Lt2/g;-><init>(I)V

    .line 81
    .line 82
    .line 83
    sget-object p2, Li2/d0;->D:Li2/c0;

    .line 84
    .line 85
    invoke-static {v2, p2, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :pswitch_4
    check-cast p1, Lv0/b;

    .line 99
    .line 100
    check-cast p2, Lp2/a;

    .line 101
    .line 102
    iget-object p1, p2, Lp2/a;->a:Ljava/util/Locale;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :pswitch_5
    check-cast p1, Lv0/b;

    .line 110
    .line 111
    check-cast p2, Lp2/b;

    .line 112
    .line 113
    iget-object p2, p2, Lp2/b;->g:Ljava/lang/Object;

    .line 114
    .line 115
    new-instance v0, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    const/4 v2, 0x0

    .line 129
    :goto_0
    if-ge v2, v1, :cond_0

    .line 130
    .line 131
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Lp2/a;

    .line 136
    .line 137
    sget-object v4, Li2/d0;->z:Lp4/t;

    .line 138
    .line 139
    invoke-static {v3, v4, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    add-int/lit8 v2, v2, 0x1

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_0
    return-object v0

    .line 150
    :pswitch_6
    check-cast p1, Lv0/b;

    .line 151
    .line 152
    check-cast p2, Li2/e;

    .line 153
    .line 154
    iget-object v0, p2, Li2/e;->a:Ljava/lang/Object;

    .line 155
    .line 156
    instance-of v1, v0, Li2/u;

    .line 157
    .line 158
    if-eqz v1, :cond_1

    .line 159
    .line 160
    sget-object v1, Li2/i;->g:Li2/i;

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_1
    instance-of v1, v0, Li2/f0;

    .line 164
    .line 165
    if-eqz v1, :cond_2

    .line 166
    .line 167
    sget-object v1, Li2/i;->h:Li2/i;

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_2
    instance-of v1, v0, Li2/p0;

    .line 171
    .line 172
    if-eqz v1, :cond_3

    .line 173
    .line 174
    sget-object v1, Li2/i;->i:Li2/i;

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    instance-of v1, v0, Li2/o0;

    .line 178
    .line 179
    if-eqz v1, :cond_4

    .line 180
    .line 181
    sget-object v1, Li2/i;->j:Li2/i;

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_4
    instance-of v1, v0, Li2/l;

    .line 185
    .line 186
    if-eqz v1, :cond_5

    .line 187
    .line 188
    sget-object v1, Li2/i;->k:Li2/i;

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_5
    instance-of v1, v0, Li2/k;

    .line 192
    .line 193
    if-eqz v1, :cond_6

    .line 194
    .line 195
    sget-object v1, Li2/i;->l:Li2/i;

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_6
    instance-of v1, v0, Li2/h0;

    .line 199
    .line 200
    if-eqz v1, :cond_7

    .line 201
    .line 202
    sget-object v1, Li2/i;->m:Li2/i;

    .line 203
    .line 204
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    packed-switch v2, :pswitch_data_1

    .line 209
    .line 210
    .line 211
    invoke-static {}, Lokio/a;->k()V

    .line 212
    .line 213
    .line 214
    const/4 p1, 0x0

    .line 215
    goto :goto_3

    .line 216
    :pswitch_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    check-cast v0, Li2/h0;

    .line 220
    .line 221
    iget-object p1, v0, Li2/h0;->a:Ljava/lang/String;

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :pswitch_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    check-cast v0, Li2/k;

    .line 228
    .line 229
    sget-object v2, Li2/d0;->f:Lp4/t;

    .line 230
    .line 231
    invoke-static {v0, v2, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    goto :goto_2

    .line 236
    :pswitch_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    check-cast v0, Li2/l;

    .line 240
    .line 241
    sget-object v2, Li2/d0;->e:Lp4/t;

    .line 242
    .line 243
    invoke-static {v0, v2, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    goto :goto_2

    .line 248
    :pswitch_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    check-cast v0, Li2/o0;

    .line 252
    .line 253
    sget-object v2, Li2/d0;->d:Lp4/t;

    .line 254
    .line 255
    invoke-static {v0, v2, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    goto :goto_2

    .line 260
    :pswitch_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    check-cast v0, Li2/p0;

    .line 264
    .line 265
    sget-object v2, Li2/d0;->c:Lp4/t;

    .line 266
    .line 267
    invoke-static {v0, v2, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    goto :goto_2

    .line 272
    :pswitch_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    check-cast v0, Li2/f0;

    .line 276
    .line 277
    sget-object v2, Li2/d0;->h:Lp4/t;

    .line 278
    .line 279
    invoke-static {v0, v2, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    goto :goto_2

    .line 284
    :pswitch_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    check-cast v0, Li2/u;

    .line 288
    .line 289
    sget-object v2, Li2/d0;->g:Lp4/t;

    .line 290
    .line 291
    invoke-static {v0, v2, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    :goto_2
    iget v0, p2, Li2/e;->b:I

    .line 296
    .line 297
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    iget v2, p2, Li2/e;->c:I

    .line 302
    .line 303
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    iget-object p2, p2, Li2/e;->d:Ljava/lang/String;

    .line 308
    .line 309
    filled-new-array {v1, p1, v0, v2, p2}, [Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    :goto_3
    return-object p1

    .line 318
    :cond_7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 319
    .line 320
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 321
    .line 322
    .line 323
    throw p1

    .line 324
    :pswitch_e
    check-cast p1, Lv0/b;

    .line 325
    .line 326
    check-cast p2, Le1/b;

    .line 327
    .line 328
    if-nez p2, :cond_8

    .line 329
    .line 330
    const/4 p1, 0x0

    .line 331
    goto :goto_4

    .line 332
    :cond_8
    iget-wide v0, p2, Le1/b;->a:J

    .line 333
    .line 334
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    invoke-static {v0, v1, v2, v3}, Le1/b;->b(JJ)Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    :goto_4
    if-eqz p1, :cond_9

    .line 344
    .line 345
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_9
    iget-wide v0, p2, Le1/b;->a:J

    .line 349
    .line 350
    const/16 p1, 0x20

    .line 351
    .line 352
    shr-long/2addr v0, p1

    .line 353
    long-to-int p1, v0

    .line 354
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 355
    .line 356
    .line 357
    move-result p1

    .line 358
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    iget-wide v0, p2, Le1/b;->a:J

    .line 363
    .line 364
    const-wide v2, 0xffffffffL

    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    and-long/2addr v0, v2

    .line 370
    long-to-int p2, v0

    .line 371
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 372
    .line 373
    .line 374
    move-result p2

    .line 375
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 376
    .line 377
    .line 378
    move-result-object p2

    .line 379
    filled-new-array {p1, p2}, [Ljava/lang/Float;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    :goto_5
    return-object p1

    .line 388
    :pswitch_f
    check-cast p1, Lv0/b;

    .line 389
    .line 390
    check-cast p2, Lu2/p;

    .line 391
    .line 392
    iget-wide p1, p2, Lu2/p;->a:J

    .line 393
    .line 394
    const-wide v0, 0x200000000L

    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    invoke-static {p1, p2, v0, v1}, Lu2/p;->a(JJ)Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-eqz v0, :cond_a

    .line 404
    .line 405
    const/4 p1, 0x0

    .line 406
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    goto :goto_6

    .line 411
    :cond_a
    const-wide v0, 0x100000000L

    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    invoke-static {p1, p2, v0, v1}, Lu2/p;->a(JJ)Z

    .line 417
    .line 418
    .line 419
    move-result p1

    .line 420
    if-eqz p1, :cond_b

    .line 421
    .line 422
    const/4 p1, 0x1

    .line 423
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    goto :goto_6

    .line 428
    :cond_b
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 429
    .line 430
    :goto_6
    return-object p1

    .line 431
    :pswitch_10
    check-cast p1, Lv0/b;

    .line 432
    .line 433
    check-cast p2, Li2/k;

    .line 434
    .line 435
    iget-object v0, p2, Li2/k;->a:Ljava/lang/String;

    .line 436
    .line 437
    iget-object p2, p2, Li2/k;->b:Li2/l0;

    .line 438
    .line 439
    sget-object v1, Li2/d0;->i:Lp4/t;

    .line 440
    .line 441
    invoke-static {p2, v1, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    return-object p1

    .line 454
    :pswitch_11
    check-cast p1, Lv0/b;

    .line 455
    .line 456
    check-cast p2, Lu2/o;

    .line 457
    .line 458
    sget-wide v0, Lu2/o;->c:J

    .line 459
    .line 460
    if-nez p2, :cond_c

    .line 461
    .line 462
    const/4 v0, 0x0

    .line 463
    goto :goto_7

    .line 464
    :cond_c
    iget-wide v2, p2, Lu2/o;->a:J

    .line 465
    .line 466
    invoke-static {v2, v3, v0, v1}, Lu2/o;->a(JJ)Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    :goto_7
    if-eqz v0, :cond_d

    .line 471
    .line 472
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_d
    iget-wide v0, p2, Lu2/o;->a:J

    .line 476
    .line 477
    invoke-static {v0, v1}, Lu2/o;->c(J)F

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    iget-wide v1, p2, Lu2/o;->a:J

    .line 486
    .line 487
    invoke-static {v1, v2}, Lu2/o;->b(J)J

    .line 488
    .line 489
    .line 490
    move-result-wide v1

    .line 491
    new-instance p2, Lu2/p;

    .line 492
    .line 493
    invoke-direct {p2, v1, v2}, Lu2/p;-><init>(J)V

    .line 494
    .line 495
    .line 496
    sget-object v1, Li2/d0;->w:Li2/c0;

    .line 497
    .line 498
    invoke-static {p2, v1, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    :goto_8
    return-object p1

    .line 511
    :pswitch_12
    check-cast p1, Lv0/b;

    .line 512
    .line 513
    check-cast p2, Lm2/j;

    .line 514
    .line 515
    iget p1, p2, Lm2/j;->a:I

    .line 516
    .line 517
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    return-object p1

    .line 522
    :pswitch_13
    check-cast p1, Lv0/b;

    .line 523
    .line 524
    check-cast p2, Lm2/i;

    .line 525
    .line 526
    iget p1, p2, Lm2/i;->a:I

    .line 527
    .line 528
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    return-object p1

    .line 533
    :pswitch_14
    check-cast p1, Lv0/b;

    .line 534
    .line 535
    check-cast p2, Lt2/d;

    .line 536
    .line 537
    iget p1, p2, Lt2/d;->a:I

    .line 538
    .line 539
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 540
    .line 541
    .line 542
    move-result-object p1

    .line 543
    return-object p1

    .line 544
    :pswitch_15
    check-cast p1, Lv0/b;

    .line 545
    .line 546
    check-cast p2, Lt2/m;

    .line 547
    .line 548
    iget p1, p2, Lt2/m;->a:I

    .line 549
    .line 550
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    return-object p1

    .line 555
    :pswitch_16
    check-cast p1, Lv0/b;

    .line 556
    .line 557
    check-cast p2, Lt2/k;

    .line 558
    .line 559
    iget p1, p2, Lt2/k;->a:I

    .line 560
    .line 561
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 562
    .line 563
    .line 564
    move-result-object p1

    .line 565
    return-object p1

    .line 566
    :pswitch_17
    check-cast p1, Lv0/b;

    .line 567
    .line 568
    check-cast p2, Lf1/q0;

    .line 569
    .line 570
    iget-wide v0, p2, Lf1/q0;->a:J

    .line 571
    .line 572
    new-instance v2, Lf1/w;

    .line 573
    .line 574
    invoke-direct {v2, v0, v1}, Lf1/w;-><init>(J)V

    .line 575
    .line 576
    .line 577
    sget-object v0, Li2/d0;->p:Li2/c0;

    .line 578
    .line 579
    invoke-static {v2, v0, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    iget-wide v1, p2, Lf1/q0;->b:J

    .line 584
    .line 585
    new-instance v3, Le1/b;

    .line 586
    .line 587
    invoke-direct {v3, v1, v2}, Le1/b;-><init>(J)V

    .line 588
    .line 589
    .line 590
    sget-object v1, Li2/d0;->x:Li2/c0;

    .line 591
    .line 592
    invoke-static {v3, v1, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    iget p2, p2, Lf1/q0;->c:F

    .line 597
    .line 598
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 599
    .line 600
    .line 601
    move-result-object p2

    .line 602
    filled-new-array {v0, p1, p2}, [Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 607
    .line 608
    .line 609
    move-result-object p1

    .line 610
    return-object p1

    .line 611
    :pswitch_18
    check-cast p1, Lv0/b;

    .line 612
    .line 613
    check-cast p2, Li2/m0;

    .line 614
    .line 615
    iget-wide v0, p2, Li2/m0;->a:J

    .line 616
    .line 617
    const/16 p1, 0x20

    .line 618
    .line 619
    shr-long/2addr v0, p1

    .line 620
    long-to-int p1, v0

    .line 621
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 622
    .line 623
    .line 624
    move-result-object p1

    .line 625
    iget-wide v0, p2, Li2/m0;->a:J

    .line 626
    .line 627
    const-wide v2, 0xffffffffL

    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    and-long/2addr v0, v2

    .line 633
    long-to-int p2, v0

    .line 634
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 635
    .line 636
    .line 637
    move-result-object p2

    .line 638
    filled-new-array {p1, p2}, [Ljava/lang/Integer;

    .line 639
    .line 640
    .line 641
    move-result-object p1

    .line 642
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 643
    .line 644
    .line 645
    move-result-object p1

    .line 646
    return-object p1

    .line 647
    :pswitch_19
    check-cast p1, Lv0/b;

    .line 648
    .line 649
    check-cast p2, Ljava/util/List;

    .line 650
    .line 651
    new-instance v0, Ljava/util/ArrayList;

    .line 652
    .line 653
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 658
    .line 659
    .line 660
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    const/4 v2, 0x0

    .line 665
    :goto_9
    if-ge v2, v1, :cond_e

    .line 666
    .line 667
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    check-cast v3, Li2/e;

    .line 672
    .line 673
    sget-object v4, Li2/d0;->b:Lp4/t;

    .line 674
    .line 675
    invoke-static {v3, v4, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v3

    .line 679
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    add-int/lit8 v2, v2, 0x1

    .line 683
    .line 684
    goto :goto_9

    .line 685
    :cond_e
    return-object v0

    .line 686
    :pswitch_1a
    check-cast p1, Lv0/b;

    .line 687
    .line 688
    check-cast p2, Lt2/a;

    .line 689
    .line 690
    iget p1, p2, Lt2/a;->a:F

    .line 691
    .line 692
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 693
    .line 694
    .line 695
    move-result-object p1

    .line 696
    return-object p1

    .line 697
    :pswitch_1b
    check-cast p1, Lv0/b;

    .line 698
    .line 699
    check-cast p2, Li2/l;

    .line 700
    .line 701
    iget-object v0, p2, Li2/l;->a:Ljava/lang/String;

    .line 702
    .line 703
    iget-object p2, p2, Li2/l;->b:Li2/l0;

    .line 704
    .line 705
    sget-object v1, Li2/d0;->i:Lp4/t;

    .line 706
    .line 707
    invoke-static {p2, v1, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object p1

    .line 711
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object p1

    .line 715
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 716
    .line 717
    .line 718
    move-result-object p1

    .line 719
    return-object p1

    .line 720
    :pswitch_1c
    check-cast p1, Lv0/b;

    .line 721
    .line 722
    check-cast p2, Lm2/k;

    .line 723
    .line 724
    iget p1, p2, Lm2/k;->g:I

    .line 725
    .line 726
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 727
    .line 728
    .line 729
    move-result-object p1

    .line 730
    return-object p1

    .line 731
    :pswitch_1d
    check-cast p1, Lv0/b;

    .line 732
    .line 733
    check-cast p2, Lt2/q;

    .line 734
    .line 735
    iget-wide v0, p2, Lt2/q;->a:J

    .line 736
    .line 737
    new-instance v2, Lu2/o;

    .line 738
    .line 739
    invoke-direct {v2, v0, v1}, Lu2/o;-><init>(J)V

    .line 740
    .line 741
    .line 742
    sget-object v0, Li2/d0;->v:Li2/c0;

    .line 743
    .line 744
    invoke-static {v2, v0, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    iget-wide v2, p2, Lt2/q;->b:J

    .line 749
    .line 750
    new-instance p2, Lu2/o;

    .line 751
    .line 752
    invoke-direct {p2, v2, v3}, Lu2/o;-><init>(J)V

    .line 753
    .line 754
    .line 755
    invoke-static {p2, v0, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object p1

    .line 759
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object p1

    .line 763
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 764
    .line 765
    .line 766
    move-result-object p1

    .line 767
    return-object p1

    .line 768
    :pswitch_1e
    check-cast p1, Lv0/b;

    .line 769
    .line 770
    check-cast p2, Lt2/p;

    .line 771
    .line 772
    iget p1, p2, Lt2/p;->a:F

    .line 773
    .line 774
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 775
    .line 776
    .line 777
    move-result-object p1

    .line 778
    iget p2, p2, Lt2/p;->b:F

    .line 779
    .line 780
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 781
    .line 782
    .line 783
    move-result-object p2

    .line 784
    filled-new-array {p1, p2}, [Ljava/lang/Float;

    .line 785
    .line 786
    .line 787
    move-result-object p1

    .line 788
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 789
    .line 790
    .line 791
    move-result-object p1

    .line 792
    return-object p1

    .line 793
    :pswitch_1f
    check-cast p1, Lv0/b;

    .line 794
    .line 795
    check-cast p2, Lt2/l;

    .line 796
    .line 797
    iget p1, p2, Lt2/l;->a:I

    .line 798
    .line 799
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 800
    .line 801
    .line 802
    move-result-object p1

    .line 803
    return-object p1

    .line 804
    :pswitch_20
    check-cast p1, Lv0/b;

    .line 805
    .line 806
    check-cast p2, Li2/g;

    .line 807
    .line 808
    iget-object v0, p2, Li2/g;->h:Ljava/lang/String;

    .line 809
    .line 810
    iget-object p2, p2, Li2/g;->g:Ljava/util/List;

    .line 811
    .line 812
    sget-object v1, Li2/d0;->a:Lp4/t;

    .line 813
    .line 814
    invoke-static {p2, v1, p1}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object p1

    .line 818
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    invoke-static {p1}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 823
    .line 824
    .line 825
    move-result-object p1

    .line 826
    return-object p1

    .line 827
    :pswitch_21
    check-cast p1, Ljava/lang/String;

    .line 828
    .line 829
    check-cast p2, Ljava/lang/Throwable;

    .line 830
    .line 831
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 832
    .line 833
    .line 834
    const-string v0, "[Hchat:FakeLocation] "

    .line 835
    .line 836
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object p1

    .line 840
    invoke-static {p1, p2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 841
    .line 842
    .line 843
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 844
    .line 845
    return-object p1

    .line 846
    :pswitch_22
    check-cast p1, Li0/h0;

    .line 847
    .line 848
    check-cast p2, Ljava/lang/Integer;

    .line 849
    .line 850
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    const/4 p2, 0x1

    .line 854
    invoke-static {p2}, Li0/r;->C(I)I

    .line 855
    .line 856
    .line 857
    move-result p2

    .line 858
    invoke-static {p1, p2}, Lci/k0;->a(Li0/h0;I)V

    .line 859
    .line 860
    .line 861
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 862
    .line 863
    return-object p1

    .line 864
    :pswitch_23
    check-cast p1, Ljava/lang/String;

    .line 865
    .line 866
    check-cast p2, Ljava/lang/Throwable;

    .line 867
    .line 868
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    const-string v0, "[Hchat:ConversationGroup] "

    .line 872
    .line 873
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object p1

    .line 877
    invoke-static {p1, p2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 878
    .line 879
    .line 880
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 881
    .line 882
    return-object p1

    .line 883
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method
