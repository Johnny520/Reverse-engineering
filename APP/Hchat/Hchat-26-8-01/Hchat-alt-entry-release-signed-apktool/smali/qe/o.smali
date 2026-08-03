.class public final synthetic Lqe/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqe/r;


# direct methods
.method public synthetic constructor <init>(Lqe/r;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqe/o;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lqe/o;->b:Lqe/r;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 13

    .line 1
    iget v0, p0, Lqe/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lqe/s;

    .line 8
    .line 9
    iget-object p1, v0, Lqe/s;->f:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v1, Lme/a;

    .line 16
    .line 17
    const/16 v2, 0xb

    .line 18
    .line 19
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v1, Lbe/i;

    .line 27
    .line 28
    const/16 v2, 0x19

    .line 29
    .line 30
    iget-object v3, p0, Lqe/o;->b:Lqe/r;

    .line 31
    .line 32
    invoke-direct {v1, v3, v2}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->allMatch(Ljava/util/function/Predicate;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    iget-boolean p1, v0, Lqe/s;->b:Z

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    iput p1, v0, Lqe/s;->e:I

    .line 49
    .line 50
    iget-object v1, v0, Lqe/s;->d:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Lqd/j;

    .line 57
    .line 58
    iput-object p1, v0, Lqe/s;->c:Lqd/j;

    .line 59
    .line 60
    :cond_2
    :goto_0
    invoke-virtual {v3, v0}, Lqe/r;->e(Lqe/s;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    iput-boolean p1, v0, Lqe/s;->b:Z

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {v0}, Lqe/s;->a()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    :goto_1
    return-void

    .line 77
    :pswitch_0
    check-cast p1, Lqd/s;

    .line 78
    .line 79
    iget-object v0, p0, Lqe/o;->b:Lqe/r;

    .line 80
    .line 81
    iget-object v1, v0, Lqe/r;->b:Landroidx/lifecycle/e0;

    .line 82
    .line 83
    invoke-virtual {v1, p1}, Landroidx/lifecycle/e0;->c(Lqd/s;)Lqe/s;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-boolean v2, v1, Lqe/s;->b:Z

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 92
    .line 93
    iput-object p1, v1, Lqe/s;->f:Ljava/util/List;

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object v2, v1, Lqe/s;->f:Ljava/util/List;

    .line 102
    .line 103
    iget-object v2, p1, Lqd/s;->i:Lqd/r;

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Lqe/r;->c(Lqd/r;)Lqe/a;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-eqz v2, :cond_5

    .line 110
    .line 111
    iget-object v3, v1, Lqe/s;->f:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :cond_5
    iget-object p1, p1, Lqd/s;->j:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_7

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, Lqd/r;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Lqe/r;->c(Lqd/r;)Lqe/a;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    if-eqz v2, :cond_6

    .line 139
    .line 140
    iget-object v3, v1, Lqe/s;->f:Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    :goto_3
    return-void

    .line 147
    :pswitch_1
    check-cast p1, Lqd/s;

    .line 148
    .line 149
    iget-object v0, p0, Lqe/o;->b:Lqe/r;

    .line 150
    .line 151
    iget-object v1, v0, Lqe/r;->a:Lud/r;

    .line 152
    .line 153
    iget-object v2, v0, Lqe/r;->b:Landroidx/lifecycle/e0;

    .line 154
    .line 155
    invoke-virtual {v2, p1}, Landroidx/lifecycle/e0;->c(Lqd/s;)Lqe/s;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {p1}, Lqd/s;->d()Lqd/j;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    iget-object v4, p1, Lqd/s;->l:Lp4/t;

    .line 164
    .line 165
    const/4 v5, 0x1

    .line 166
    if-eqz v3, :cond_8

    .line 167
    .line 168
    iput-object v3, v2, Lqe/s;->c:Lqd/j;

    .line 169
    .line 170
    iput-boolean v5, v2, Lqe/s;->b:Z

    .line 171
    .line 172
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 173
    .line 174
    iput-object p1, v2, Lqe/s;->d:Ljava/util/List;

    .line 175
    .line 176
    goto/16 :goto_c

    .line 177
    .line 178
    :cond_8
    iget-object v3, v4, Lp4/t;->h:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v3, Lqd/j;

    .line 181
    .line 182
    invoke-virtual {v3}, Lqd/j;->w()Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-eqz v6, :cond_9

    .line 187
    .line 188
    iput-object v3, v2, Lqe/s;->c:Lqd/j;

    .line 189
    .line 190
    iput-boolean v5, v2, Lqe/s;->b:Z

    .line 191
    .line 192
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 193
    .line 194
    iput-object p1, v2, Lqe/s;->d:Ljava/util/List;

    .line 195
    .line 196
    goto/16 :goto_c

    .line 197
    .line 198
    :cond_9
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 199
    .line 200
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 201
    .line 202
    .line 203
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 204
    .line 205
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 206
    .line 207
    .line 208
    iget-object v4, v4, Lp4/t;->i:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v4, Ljava/util/LinkedHashSet;

    .line 211
    .line 212
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v8

    .line 220
    if-eqz v8, :cond_b

    .line 221
    .line 222
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    check-cast v8, Lqe/d;

    .line 227
    .line 228
    invoke-interface {v8}, Lqe/d;->b()I

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    if-ne v9, v5, :cond_a

    .line 233
    .line 234
    invoke-interface {v8}, Lqe/d;->getType()Lqd/j;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-interface {v3, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_a
    invoke-interface {v8}, Lqe/d;->getType()Lqd/j;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    invoke-interface {v6, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_b
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 251
    .line 252
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, v4, v7, v3}, Lqe/r;->b(Ljava/util/Set;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v4, v7, v6}, Lqe/r;->b(Ljava/util/Set;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    const/4 v9, 0x0

    .line 270
    if-eqz v8, :cond_f

    .line 271
    .line 272
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    check-cast v8, Lqd/j;

    .line 277
    .line 278
    invoke-virtual {v8}, Lqd/j;->w()Z

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    if-eqz v10, :cond_d

    .line 283
    .line 284
    invoke-virtual {v8}, Lqd/j;->v()Z

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    if-eqz v9, :cond_c

    .line 289
    .line 290
    iget-object v9, v1, Lud/r;->l:Lud/e;

    .line 291
    .line 292
    iget-object v9, v9, Lud/e;->k:Lud/u;

    .line 293
    .line 294
    iget-object v9, v9, Lud/u;->s:Led/c;

    .line 295
    .line 296
    invoke-virtual {v8}, Lqd/j;->l()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    invoke-virtual {v9, v8}, Led/c;->d(Ljava/lang/String;)Ljava/util/Set;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    invoke-interface {v8}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    new-instance v9, Lme/a;

    .line 309
    .line 310
    const/16 v10, 0xe

    .line 311
    .line 312
    invoke-direct {v9, v10}, Lme/a;-><init>(I)V

    .line 313
    .line 314
    .line 315
    invoke-interface {v8, v9}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    invoke-interface {v8, v9}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    check-cast v8, Ljava/util/List;

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_c
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_d
    new-instance v10, Ljava/util/ArrayList;

    .line 334
    .line 335
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v8}, Lqd/j;->n()[Lqd/q;

    .line 339
    .line 340
    .line 341
    move-result-object v8

    .line 342
    array-length v11, v8

    .line 343
    :goto_6
    if-ge v9, v11, :cond_e

    .line 344
    .line 345
    aget-object v12, v8, v9

    .line 346
    .line 347
    invoke-static {v12}, Lqd/j;->d(Lqd/q;)Lqd/d;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    add-int/lit8 v9, v9, 0x1

    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_e
    move-object v8, v10

    .line 358
    :goto_7
    invoke-virtual {v0, v4, v7, v8}, Lqe/r;->b(Ljava/util/Set;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V

    .line 359
    .line 360
    .line 361
    goto :goto_5

    .line 362
    :cond_f
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    if-eqz v6, :cond_15

    .line 371
    .line 372
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    check-cast v6, Lqd/j;

    .line 377
    .line 378
    invoke-virtual {v6}, Lqd/j;->w()Z

    .line 379
    .line 380
    .line 381
    move-result v8

    .line 382
    if-eqz v8, :cond_13

    .line 383
    .line 384
    invoke-virtual {v6}, Lqd/j;->v()Z

    .line 385
    .line 386
    .line 387
    move-result v8

    .line 388
    if-eqz v8, :cond_12

    .line 389
    .line 390
    sget-object v8, Lqd/j;->k:Lqd/e;

    .line 391
    .line 392
    invoke-virtual {v6, v8}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v10

    .line 396
    if-eqz v10, :cond_10

    .line 397
    .line 398
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    goto :goto_a

    .line 403
    :cond_10
    iget-object v8, v1, Lud/r;->l:Lud/e;

    .line 404
    .line 405
    iget-object v8, v8, Lud/e;->k:Lud/u;

    .line 406
    .line 407
    iget-object v8, v8, Lud/u;->s:Led/c;

    .line 408
    .line 409
    invoke-virtual {v6}, Lqd/j;->l()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v6

    .line 413
    iget-object v8, v8, Led/c;->d:Ljava/util/HashMap;

    .line 414
    .line 415
    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v6

    .line 419
    check-cast v6, Ljava/util/List;

    .line 420
    .line 421
    if-nez v6, :cond_11

    .line 422
    .line 423
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 424
    .line 425
    :cond_11
    invoke-interface {v6}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    new-instance v8, Lme/a;

    .line 430
    .line 431
    const/16 v10, 0xe

    .line 432
    .line 433
    invoke-direct {v8, v10}, Lme/a;-><init>(I)V

    .line 434
    .line 435
    .line 436
    invoke-interface {v6, v8}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    invoke-interface {v6, v8}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    check-cast v6, Ljava/util/List;

    .line 449
    .line 450
    goto :goto_a

    .line 451
    :cond_12
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 452
    .line 453
    goto :goto_a

    .line 454
    :cond_13
    new-instance v8, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v6}, Lqd/j;->n()[Lqd/q;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    array-length v10, v6

    .line 464
    move v11, v9

    .line 465
    :goto_9
    if-ge v11, v10, :cond_14

    .line 466
    .line 467
    aget-object v12, v6, v11

    .line 468
    .line 469
    invoke-static {v12}, Lqd/j;->d(Lqd/q;)Lqd/d;

    .line 470
    .line 471
    .line 472
    move-result-object v12

    .line 473
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    add-int/lit8 v11, v11, 0x1

    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_14
    move-object v6, v8

    .line 480
    :goto_a
    invoke-virtual {v0, v4, v7, v6}, Lqe/r;->b(Ljava/util/Set;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V

    .line 481
    .line 482
    .line 483
    goto :goto_8

    .line 484
    :cond_15
    iget-object p1, p1, Lqd/s;->j:Ljava/util/ArrayList;

    .line 485
    .line 486
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    :cond_16
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    if-eqz v1, :cond_17

    .line 495
    .line 496
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    check-cast v1, Lqd/r;

    .line 501
    .line 502
    iget-object v1, v1, Lqd/l;->j:Lud/p;

    .line 503
    .line 504
    if-eqz v1, :cond_16

    .line 505
    .line 506
    iget-object v3, v1, Lud/p;->k:Lpd/k;

    .line 507
    .line 508
    sget-object v6, Lpd/k;->H:Lpd/k;

    .line 509
    .line 510
    if-ne v3, v6, :cond_16

    .line 511
    .line 512
    const/4 v3, 0x2

    .line 513
    invoke-virtual {v1, v3}, Lud/p;->S(I)Lqd/l;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-virtual {v1}, Lqd/l;->I()Lqd/j;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-virtual {v1}, Lqd/j;->w()Z

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    if-eqz v3, :cond_16

    .line 526
    .line 527
    new-instance v3, Lqd/a;

    .line 528
    .line 529
    invoke-direct {v3, v1}, Lqd/a;-><init>(Lqd/j;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0, v4, v7, v3}, Lqe/r;->a(Ljava/util/Set;Ljava/util/LinkedHashSet;Lqd/j;)Z

    .line 533
    .line 534
    .line 535
    goto :goto_b

    .line 536
    :cond_17
    invoke-interface {v7}, Ljava/util/Set;->size()I

    .line 537
    .line 538
    .line 539
    move-result p1

    .line 540
    if-nez p1, :cond_18

    .line 541
    .line 542
    iput-boolean v5, v2, Lqe/s;->b:Z

    .line 543
    .line 544
    sget-object p1, Lqd/j;->u:Lqd/h;

    .line 545
    .line 546
    iput-object p1, v2, Lqe/s;->c:Lqd/j;

    .line 547
    .line 548
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 549
    .line 550
    iput-object p1, v2, Lqe/s;->d:Ljava/util/List;

    .line 551
    .line 552
    goto :goto_c

    .line 553
    :cond_18
    if-ne p1, v5, :cond_19

    .line 554
    .line 555
    iput-boolean v5, v2, Lqe/s;->b:Z

    .line 556
    .line 557
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 558
    .line 559
    .line 560
    move-result-object p1

    .line 561
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object p1

    .line 565
    check-cast p1, Lqd/j;

    .line 566
    .line 567
    iput-object p1, v2, Lqe/s;->c:Lqd/j;

    .line 568
    .line 569
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 570
    .line 571
    iput-object p1, v2, Lqe/s;->d:Ljava/util/List;

    .line 572
    .line 573
    goto :goto_c

    .line 574
    :cond_19
    iput-boolean v9, v2, Lqe/s;->b:Z

    .line 575
    .line 576
    sget-object p1, Lqd/j;->u:Lqd/h;

    .line 577
    .line 578
    iput-object p1, v2, Lqe/s;->c:Lqd/j;

    .line 579
    .line 580
    new-instance p1, Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-direct {p1, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 583
    .line 584
    .line 585
    iget-object v0, v0, Lqe/r;->c:Lqe/k;

    .line 586
    .line 587
    iget-object v0, v0, Lqe/k;->c:Ljava/util/Comparator;

    .line 588
    .line 589
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 590
    .line 591
    .line 592
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    iput-object p1, v2, Lqe/s;->d:Ljava/util/List;

    .line 597
    .line 598
    :goto_c
    return-void

    .line 599
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
