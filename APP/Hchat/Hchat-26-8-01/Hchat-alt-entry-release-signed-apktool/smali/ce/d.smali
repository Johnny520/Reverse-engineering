.class public final synthetic Lce/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lud/r;


# direct methods
.method public synthetic constructor <init>(Lud/r;I)V
    .locals 0

    .line 1
    iput p2, p0, Lce/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lce/d;->b:Lud/r;

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
    .locals 11

    .line 1
    iget v0, p0, Lce/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lud/p;

    .line 7
    .line 8
    iget-object v0, p0, Lce/d;->b:Lud/r;

    .line 9
    .line 10
    invoke-static {v0, p1}, Lxe/l;->l(Lud/r;Lud/p;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lmd/a;->s:Lmd/a;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lmd/e;->w(Lmd/a;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Lce/d;->b:Lud/r;

    .line 20
    .line 21
    check-cast p1, Lud/p;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lxe/l;->h(Lud/r;Lud/p;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_1
    check-cast p1, Lqd/s;

    .line 28
    .line 29
    iget-object v0, p1, Lqd/s;->l:Lp4/t;

    .line 30
    .line 31
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lqd/j;

    .line 34
    .line 35
    invoke-virtual {v0}, Lqd/j;->w()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lce/d;->b:Lud/r;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lqd/s;->c(Lud/r;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "Type inference failed for: "

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {p1}, Lqd/s;->b()Lqd/k;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v0, v0, Lqd/k;->b:Lqd/j;

    .line 61
    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1}, Lqd/s;->b()Lqd/k;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object v0, Lqd/j;->u:Lqd/h;

    .line 69
    .line 70
    iput-object v0, p1, Lqd/k;->b:Lqd/j;

    .line 71
    .line 72
    :cond_1
    return-void

    .line 73
    :pswitch_2
    check-cast p1, Lqd/s;

    .line 74
    .line 75
    iget-object p1, p1, Lqd/s;->k:Ljava/util/ArrayList;

    .line 76
    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 80
    .line 81
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lpd/q;

    .line 96
    .line 97
    new-instance v1, Ljava/util/HashSet;

    .line 98
    .line 99
    iget-object v2, v0, Lud/p;->m:Ljava/util/List;

    .line 100
    .line 101
    iget-object v3, v0, Lud/p;->m:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    const/4 v4, 0x1

    .line 108
    add-int/2addr v2, v4

    .line 109
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v0, Lud/p;->l:Lqd/r;

    .line 113
    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    invoke-interface {v2}, Lqd/o;->getName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-eqz v2, :cond_4

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    :cond_4
    new-instance v2, Lbe/z;

    .line 126
    .line 127
    const/4 v5, 0x3

    .line 128
    invoke-direct {v2, v1, v5}, Lbe/z;-><init>(Ljava/util/HashSet;I)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v3, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ne v2, v4, :cond_5

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Ljava/lang/String;

    .line 149
    .line 150
    iget-object v0, v0, Lud/p;->l:Lqd/r;

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Lqd/r;->p(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    new-instance v0, Lbe/i0;

    .line 156
    .line 157
    const/4 v2, 0x1

    .line 158
    invoke-direct {v0, v1, v2}, Lbe/i0;-><init>(Ljava/lang/String;I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v3, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_5
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-le v2, v4, :cond_3

    .line 170
    .line 171
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    new-instance v4, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v5, "Different variable names in phi insn: "

    .line 178
    .line 179
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v2, ", use first"

    .line 186
    .line 187
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    iget-object v4, p0, Lce/d;->b:Lud/r;

    .line 195
    .line 196
    invoke-virtual {v4, v2}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    check-cast v1, Ljava/lang/String;

    .line 208
    .line 209
    iget-object v0, v0, Lud/p;->l:Lqd/r;

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Lqd/r;->p(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Lbe/i0;

    .line 215
    .line 216
    const/4 v2, 0x1

    .line 217
    invoke-direct {v0, v1, v2}, Lbe/i0;-><init>(Ljava/lang/String;I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v3, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_6
    return-void

    .line 226
    :pswitch_3
    check-cast p1, Lqd/s;

    .line 227
    .line 228
    iget-object v0, p1, Lqd/s;->i:Lqd/r;

    .line 229
    .line 230
    iget-object v1, p1, Lqd/s;->j:Ljava/util/ArrayList;

    .line 231
    .line 232
    iget-object v0, v0, Lmd/e;->g:Lmd/f;

    .line 233
    .line 234
    sget-object v2, Lmd/b;->L:Lmd/b;

    .line 235
    .line 236
    invoke-virtual {v0, v2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    check-cast v0, Lnd/d0;

    .line 241
    .line 242
    const/4 v3, 0x0

    .line 243
    iget-object v4, p0, Lce/d;->b:Lud/r;

    .line 244
    .line 245
    if-nez v0, :cond_7

    .line 246
    .line 247
    move v0, v3

    .line 248
    goto :goto_1

    .line 249
    :cond_7
    iget-object v5, v0, Lnd/d0;->g:Lqd/j;

    .line 250
    .line 251
    iget-object v0, v0, Lnd/d0;->h:Ljava/lang/String;

    .line 252
    .line 253
    invoke-static {v4, p1, v5, v0}, Lde/a;->j(Lud/r;Lqd/s;Lqd/j;Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    :goto_1
    if-eqz v0, :cond_8

    .line 258
    .line 259
    goto/16 :goto_6

    .line 260
    .line 261
    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    if-eqz v5, :cond_b

    .line 270
    .line 271
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    check-cast v5, Lqd/r;

    .line 276
    .line 277
    iget-object v5, v5, Lmd/e;->g:Lmd/f;

    .line 278
    .line 279
    invoke-virtual {v5, v2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    check-cast v5, Lnd/d0;

    .line 284
    .line 285
    if-nez v5, :cond_a

    .line 286
    .line 287
    move v5, v3

    .line 288
    goto :goto_2

    .line 289
    :cond_a
    iget-object v6, v5, Lnd/d0;->g:Lqd/j;

    .line 290
    .line 291
    iget-object v5, v5, Lnd/d0;->h:Ljava/lang/String;

    .line 292
    .line 293
    invoke-static {v4, p1, v6, v5}, Lde/a;->j(Lud/r;Lqd/s;Lqd/j;Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    :goto_2
    if-eqz v5, :cond_9

    .line 298
    .line 299
    goto/16 :goto_6

    .line 300
    .line 301
    :cond_b
    sget-object v0, Lmd/b;->m:Lmd/b;

    .line 302
    .line 303
    iget-object v2, v4, Lmd/e;->g:Lmd/f;

    .line 304
    .line 305
    invoke-virtual {v2, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    check-cast v0, Lnd/s;

    .line 310
    .line 311
    if-nez v0, :cond_c

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_c
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    new-instance v2, Lae/a;

    .line 319
    .line 320
    const/4 v5, 0x5

    .line 321
    invoke-direct {v2, v5}, Lae/a;-><init>(I)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->mapToInt(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-interface {v1}, Ljava/util/stream/IntStream;->max()Ljava/util/OptionalInt;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v1}, Ljava/util/OptionalInt;->isPresent()Z

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    if-nez v2, :cond_d

    .line 337
    .line 338
    goto :goto_6

    .line 339
    :cond_d
    iget-object v2, p1, Lqd/s;->i:Lqd/r;

    .line 340
    .line 341
    if-eqz v2, :cond_e

    .line 342
    .line 343
    iget-object v2, v2, Lqd/l;->j:Lud/p;

    .line 344
    .line 345
    if-eqz v2, :cond_e

    .line 346
    .line 347
    iget v2, v2, Lud/p;->n:I

    .line 348
    .line 349
    goto :goto_3

    .line 350
    :cond_e
    const/4 v2, -0x1

    .line 351
    :goto_3
    invoke-virtual {v1}, Ljava/util/OptionalInt;->getAsInt()I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    iget v5, p1, Lqd/s;->g:I

    .line 356
    .line 357
    iget-object v0, v0, Lnd/s;->g:Ljava/util/List;

    .line 358
    .line 359
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v6

    .line 367
    if-eqz v6, :cond_13

    .line 368
    .line 369
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    check-cast v6, Llf/b;

    .line 374
    .line 375
    iget v7, v6, Llf/b;->a:I

    .line 376
    .line 377
    if-ne v7, v5, :cond_f

    .line 378
    .line 379
    iget v7, v6, Llf/b;->f:I

    .line 380
    .line 381
    iget v8, v6, Llf/b;->g:I

    .line 382
    .line 383
    const/4 v9, 0x1

    .line 384
    if-gt v7, v2, :cond_10

    .line 385
    .line 386
    if-gt v2, v8, :cond_10

    .line 387
    .line 388
    move v10, v9

    .line 389
    goto :goto_4

    .line 390
    :cond_10
    move v10, v3

    .line 391
    :goto_4
    if-nez v10, :cond_12

    .line 392
    .line 393
    if-gt v7, v1, :cond_11

    .line 394
    .line 395
    if-gt v1, v8, :cond_11

    .line 396
    .line 397
    goto :goto_5

    .line 398
    :cond_11
    move v9, v3

    .line 399
    :goto_5
    if-eqz v9, :cond_f

    .line 400
    .line 401
    :cond_12
    invoke-static {v4, v6}, Lbe/b;->G(Lud/r;Llf/b;)Lqd/j;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    iget-object v1, v6, Llf/b;->b:Ljava/lang/String;

    .line 406
    .line 407
    invoke-static {v4, p1, v0, v1}, Lde/a;->j(Lud/r;Lqd/s;Lqd/j;Ljava/lang/String;)Z

    .line 408
    .line 409
    .line 410
    :cond_13
    :goto_6
    return-void

    .line 411
    :pswitch_4
    check-cast p1, Lud/a;

    .line 412
    .line 413
    sget-object v0, Lmd/a;->k:Lmd/a;

    .line 414
    .line 415
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 416
    .line 417
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-eqz v0, :cond_14

    .line 422
    .line 423
    sget-object v0, Lmd/b;->z:Lmd/b;

    .line 424
    .line 425
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 426
    .line 427
    invoke-virtual {p1, v0}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    iget-object v0, p0, Lce/d;->b:Lud/r;

    .line 432
    .line 433
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    new-instance v1, Lce/d;

    .line 437
    .line 438
    const/4 v2, 0x1

    .line 439
    invoke-direct {v1, v0, v2}, Lce/d;-><init>(Lud/r;I)V

    .line 440
    .line 441
    .line 442
    invoke-interface {p1, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 443
    .line 444
    .line 445
    :cond_14
    return-void

    .line 446
    :pswitch_5
    check-cast p1, Lnd/t;

    .line 447
    .line 448
    iget-object v0, p0, Lce/d;->b:Lud/r;

    .line 449
    .line 450
    iget-object v1, v0, Lud/r;->F:Ljava/util/List;

    .line 451
    .line 452
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-eqz v1, :cond_15

    .line 457
    .line 458
    new-instance v1, Ljava/util/ArrayList;

    .line 459
    .line 460
    const/4 v2, 0x5

    .line 461
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 462
    .line 463
    .line 464
    iput-object v1, v0, Lud/r;->F:Ljava/util/List;

    .line 465
    .line 466
    :cond_15
    iget-object v1, v0, Lud/r;->F:Ljava/util/List;

    .line 467
    .line 468
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    iput v1, p1, Lnd/t;->d:I

    .line 473
    .line 474
    iget-object v0, v0, Lud/r;->F:Ljava/util/List;

    .line 475
    .line 476
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    return-void

    .line 480
    :pswitch_6
    check-cast p1, Lae/f;

    .line 481
    .line 482
    const/4 v0, 0x1

    .line 483
    iput-boolean v0, p1, Lae/f;->i:Z

    .line 484
    .line 485
    iget-object v0, p1, Lae/f;->d:Ljava/util/ArrayList;

    .line 486
    .line 487
    new-instance v1, Lae/e;

    .line 488
    .line 489
    const/4 v2, 0x0

    .line 490
    invoke-direct {v1, v2}, Lae/e;-><init>(I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 494
    .line 495
    .line 496
    iget-object v0, p0, Lce/d;->b:Lud/r;

    .line 497
    .line 498
    iget-object v0, v0, Lud/r;->B:Lud/a;

    .line 499
    .line 500
    iget-object p1, p1, Lae/f;->c:Lud/a;

    .line 501
    .line 502
    invoke-static {v0, p1}, Lce/m;->p(Lud/a;Lud/a;)V

    .line 503
    .line 504
    .line 505
    return-void

    .line 506
    nop

    .line 507
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
