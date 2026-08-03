.class public final synthetic Lce/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lae/f;Lud/r;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lce/a;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lce/a;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lce/a;->h:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lke/c;Ljava/util/concurrent/atomic/AtomicBoolean;Lhb/r;)V
    .locals 0

    .line 12
    const/4 p1, 0x2

    iput p1, p0, Lce/a;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lce/a;->i:Ljava/lang/Object;

    iput-object p3, p0, Lce/a;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lud/r;Lud/a;)V
    .locals 1

    .line 13
    const/4 v0, 0x1

    iput v0, p0, Lce/a;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/a;->h:Ljava/lang/Object;

    iput-object p2, p0, Lce/a;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lce/a;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lce/a;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iget-object v2, v0, Lce/a;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lhb/r;

    .line 15
    .line 16
    iget-object v3, v2, Lhb/r;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    move-object/from16 v4, p1

    .line 21
    .line 22
    check-cast v4, Lud/n;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/4 v6, 0x0

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    instance-of v5, v4, Lyd/c;

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    if-eqz v5, :cond_a

    .line 37
    .line 38
    check-cast v4, Lyd/c;

    .line 39
    .line 40
    iget-object v5, v4, Lyd/a;->k:Lyd/b;

    .line 41
    .line 42
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget v8, v5, Lyd/b;->i:I

    .line 46
    .line 47
    const/4 v9, 0x3

    .line 48
    if-ne v8, v9, :cond_1

    .line 49
    .line 50
    iget-object v5, v5, Lyd/b;->j:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Lyd/b;

    .line 57
    .line 58
    move v8, v7

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v8, v6

    .line 61
    :goto_0
    iget-object v5, v5, Lyd/b;->k:Lxe/e;

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_2
    iget-object v5, v5, Lxe/e;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v5, Lpd/i;

    .line 71
    .line 72
    invoke-virtual {v5, v6}, Lud/p;->S(I)Lqd/l;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    instance-of v11, v10, Lqd/m;

    .line 80
    .line 81
    if-eqz v11, :cond_3

    .line 82
    .line 83
    iget-object v11, v2, Lhb/r;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v11, Ljava/util/IdentityHashMap;

    .line 86
    .line 87
    check-cast v10, Lqd/m;

    .line 88
    .line 89
    iget-object v10, v10, Lqd/m;->l:Lud/p;

    .line 90
    .line 91
    invoke-virtual {v11, v10}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    check-cast v10, Ljava/lang/String;

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    move-object v10, v9

    .line 99
    :goto_1
    if-nez v10, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    iget v9, v5, Lpd/i;->p:I

    .line 103
    .line 104
    const/4 v11, 0x2

    .line 105
    if-ne v9, v11, :cond_5

    .line 106
    .line 107
    invoke-virtual {v5, v7}, Lud/p;->S(I)Lqd/l;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v9}, Lqd/l;->O()Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-eqz v9, :cond_5

    .line 116
    .line 117
    move v8, v7

    .line 118
    :cond_5
    iget v9, v5, Lpd/i;->p:I

    .line 119
    .line 120
    if-ne v9, v7, :cond_6

    .line 121
    .line 122
    invoke-virtual {v5, v7}, Lud/p;->S(I)Lqd/l;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-virtual {v9}, Lqd/l;->L()Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eqz v9, :cond_6

    .line 131
    .line 132
    move v8, v7

    .line 133
    :cond_6
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    iget-object v5, v4, Lyd/a;->l:Ljava/util/List;

    .line 137
    .line 138
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 139
    .line 140
    .line 141
    new-instance v9, Lke/l;

    .line 142
    .line 143
    invoke-direct {v9}, Lke/l;-><init>()V

    .line 144
    .line 145
    .line 146
    iget-object v3, v9, Lke/l;->a:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    if-eqz v8, :cond_7

    .line 152
    .line 153
    iget-object v3, v4, Lyd/c;->n:Lud/j;

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_7
    iget-object v3, v4, Lyd/c;->m:Lud/j;

    .line 157
    .line 158
    :goto_2
    if-nez v3, :cond_8

    .line 159
    .line 160
    iget-object v3, v4, Lyd/a;->l:Ljava/util/List;

    .line 161
    .line 162
    invoke-static {v3}, Lxe/s;->i(Ljava/util/List;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Lud/a;

    .line 167
    .line 168
    iput-object v3, v9, Lke/l;->c:Lud/a;

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_8
    iput-object v3, v9, Lke/l;->b:Lud/j;

    .line 172
    .line 173
    :goto_3
    if-nez v9, :cond_9

    .line 174
    .line 175
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_9
    iget-object v1, v2, Lhb/r;->f:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_a
    move v6, v7

    .line 187
    :goto_4
    return v6

    .line 188
    :pswitch_0
    iget-object v1, v0, Lce/a;->h:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v1, Lud/r;

    .line 191
    .line 192
    iget-object v2, v0, Lce/a;->i:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v2, Lud/a;

    .line 195
    .line 196
    move-object/from16 v3, p1

    .line 197
    .line 198
    check-cast v3, Lud/a;

    .line 199
    .line 200
    iget-object v4, v3, Lud/a;->m:Ljava/util/List;

    .line 201
    .line 202
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    const/4 v6, 0x0

    .line 207
    const/4 v7, 0x1

    .line 208
    if-le v5, v7, :cond_14

    .line 209
    .line 210
    invoke-interface {v4}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    new-instance v8, Lce/n;

    .line 215
    .line 216
    const/4 v9, 0x2

    .line 217
    invoke-direct {v8, v9}, Lce/n;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v5, v8}, Ljava/util/stream/Stream;->allMatch(Ljava/util/function/Predicate;)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_14

    .line 225
    .line 226
    new-instance v5, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v1, v3, v6}, La/a;->y(Lud/r;Lud/a;Z)Ljava/util/ArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    iget-object v8, v2, Lud/a;->l:Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-static {v8}, Lbe/h;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    check-cast v8, Lud/p;

    .line 242
    .line 243
    if-eqz v8, :cond_b

    .line 244
    .line 245
    iget-object v9, v8, Lud/p;->k:Lpd/k;

    .line 246
    .line 247
    sget-object v10, Lpd/k;->a0:Lpd/k;

    .line 248
    .line 249
    if-ne v9, v10, :cond_b

    .line 250
    .line 251
    invoke-virtual {v8, v6}, Lud/p;->S(I)Lqd/l;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    instance-of v9, v8, Lqd/r;

    .line 259
    .line 260
    if-eqz v9, :cond_b

    .line 261
    .line 262
    check-cast v8, Lqd/r;

    .line 263
    .line 264
    iget v8, v8, Lqd/r;->l:I

    .line 265
    .line 266
    invoke-static {v3}, La/a;->W(Lud/h;)Lud/p;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    if-eqz v9, :cond_b

    .line 271
    .line 272
    iget-object v10, v9, Lud/p;->k:Lpd/k;

    .line 273
    .line 274
    sget-object v11, Lpd/k;->m:Lpd/k;

    .line 275
    .line 276
    if-ne v10, v11, :cond_b

    .line 277
    .line 278
    iget-object v9, v9, Lud/p;->l:Lqd/r;

    .line 279
    .line 280
    iget v9, v9, Lqd/r;->l:I

    .line 281
    .line 282
    if-ne v9, v8, :cond_b

    .line 283
    .line 284
    iget-object v8, v3, Lud/a;->l:Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    :cond_b
    new-instance v6, Lae/e;

    .line 290
    .line 291
    const/16 v8, 0x10

    .line 292
    .line 293
    invoke-direct {v6, v8}, Lae/e;-><init>(I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    const/4 v6, 0x0

    .line 304
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-eqz v8, :cond_12

    .line 309
    .line 310
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    check-cast v8, Lud/a;

    .line 315
    .line 316
    if-nez v6, :cond_c

    .line 317
    .line 318
    move-object/from16 v17, v1

    .line 319
    .line 320
    move-object v6, v8

    .line 321
    goto/16 :goto_9

    .line 322
    .line 323
    :cond_c
    iget-object v9, v8, Lud/a;->n:Ljava/util/List;

    .line 324
    .line 325
    invoke-static {v9, v3}, La/a;->N0(Ljava/util/List;Lud/a;)Lud/a;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    invoke-static {v8, v3}, Lce/m;->p(Lud/a;Lud/a;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v8, v9}, Lce/m;->p(Lud/a;Lud/a;)V

    .line 333
    .line 334
    .line 335
    new-instance v10, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 342
    .line 343
    .line 344
    new-instance v11, Ljava/util/HashMap;

    .line 345
    .line 346
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v12

    .line 353
    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v13

    .line 357
    if-eqz v13, :cond_d

    .line 358
    .line 359
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v13

    .line 363
    check-cast v13, Lud/a;

    .line 364
    .line 365
    iget v14, v13, Lud/a;->k:I

    .line 366
    .line 367
    invoke-static {v1, v14}, Lce/m;->s(Lud/r;I)Lud/a;

    .line 368
    .line 369
    .line 370
    move-result-object v14

    .line 371
    invoke-static {v13, v14}, Lce/m;->k(Lud/a;Lud/a;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    invoke-virtual {v11, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 382
    .line 383
    .line 384
    move-result-object v12

    .line 385
    :cond_e
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v13

    .line 389
    if-eqz v13, :cond_11

    .line 390
    .line 391
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v13

    .line 395
    check-cast v13, Lud/a;

    .line 396
    .line 397
    invoke-virtual {v11, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v14

    .line 401
    check-cast v14, Lud/a;

    .line 402
    .line 403
    const-string v15, "Copy blocks tree failed. Missing block for connection: "

    .line 404
    .line 405
    if-eqz v14, :cond_10

    .line 406
    .line 407
    iget-object v13, v13, Lud/a;->n:Ljava/util/List;

    .line 408
    .line 409
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object v13

    .line 413
    :goto_7
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v16

    .line 417
    if-eqz v16, :cond_e

    .line 418
    .line 419
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v16

    .line 423
    move-object/from16 v7, v16

    .line 424
    .line 425
    check-cast v7, Lud/a;

    .line 426
    .line 427
    invoke-virtual {v11, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v16

    .line 431
    move-object/from16 v17, v1

    .line 432
    .line 433
    move-object/from16 v1, v16

    .line 434
    .line 435
    check-cast v1, Lud/a;

    .line 436
    .line 437
    if-eqz v1, :cond_f

    .line 438
    .line 439
    invoke-static {v14, v1}, Lce/m;->j(Lud/a;Lud/a;)V

    .line 440
    .line 441
    .line 442
    move-object/from16 v1, v17

    .line 443
    .line 444
    const/4 v7, 0x1

    .line 445
    goto :goto_7

    .line 446
    :cond_f
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-virtual {v15, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    invoke-static {v1}, Lah/a;->k(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    :goto_8
    const/4 v6, 0x0

    .line 458
    goto :goto_a

    .line 459
    :cond_10
    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    invoke-virtual {v15, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    invoke-static {v1}, Lah/a;->k(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    goto :goto_8

    .line 471
    :cond_11
    move-object/from16 v17, v1

    .line 472
    .line 473
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    check-cast v1, Lud/a;

    .line 482
    .line 483
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v7

    .line 491
    check-cast v7, Lud/a;

    .line 492
    .line 493
    invoke-static {v8, v1}, Lce/m;->j(Lud/a;Lud/a;)V

    .line 494
    .line 495
    .line 496
    invoke-static {v7, v9}, Lce/m;->j(Lud/a;Lud/a;)V

    .line 497
    .line 498
    .line 499
    :goto_9
    move-object/from16 v1, v17

    .line 500
    .line 501
    const/4 v7, 0x1

    .line 502
    goto/16 :goto_5

    .line 503
    .line 504
    :cond_12
    if-eqz v6, :cond_13

    .line 505
    .line 506
    iget-object v1, v6, Lud/a;->n:Ljava/util/List;

    .line 507
    .line 508
    invoke-static {v1, v3}, La/a;->N0(Ljava/util/List;Lud/a;)Lud/a;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    invoke-static {v6, v1}, Lce/m;->p(Lud/a;Lud/a;)V

    .line 513
    .line 514
    .line 515
    invoke-static {v2, v1}, Lce/m;->j(Lud/a;Lud/a;)V

    .line 516
    .line 517
    .line 518
    :cond_13
    const/4 v6, 0x1

    .line 519
    :cond_14
    :goto_a
    return v6

    .line 520
    :pswitch_1
    iget-object v1, v0, Lce/a;->i:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v1, Lae/f;

    .line 523
    .line 524
    iget-object v2, v0, Lce/a;->h:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v2, Lud/r;

    .line 527
    .line 528
    move-object/from16 v3, p1

    .line 529
    .line 530
    check-cast v3, Lae/f;

    .line 531
    .line 532
    if-ne v3, v1, :cond_15

    .line 533
    .line 534
    const/4 v1, 0x0

    .line 535
    goto :goto_c

    .line 536
    :cond_15
    iget-object v4, v3, Lae/f;->a:Ljava/util/ArrayList;

    .line 537
    .line 538
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 546
    .line 547
    .line 548
    move-result v5

    .line 549
    if-eqz v5, :cond_16

    .line 550
    .line 551
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    check-cast v5, Lod/a;

    .line 556
    .line 557
    invoke-virtual {v1, v2, v5}, Lae/f;->a(Lud/r;Lod/a;)Z

    .line 558
    .line 559
    .line 560
    goto :goto_b

    .line 561
    :cond_16
    const/4 v1, 0x1

    .line 562
    iput-boolean v1, v3, Lae/f;->i:Z

    .line 563
    .line 564
    iget-object v2, v3, Lae/f;->d:Ljava/util/ArrayList;

    .line 565
    .line 566
    new-instance v3, Lae/e;

    .line 567
    .line 568
    const/4 v4, 0x0

    .line 569
    invoke-direct {v3, v4}, Lae/e;-><init>(I)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 573
    .line 574
    .line 575
    :goto_c
    return v1

    .line 576
    nop

    .line 577
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
