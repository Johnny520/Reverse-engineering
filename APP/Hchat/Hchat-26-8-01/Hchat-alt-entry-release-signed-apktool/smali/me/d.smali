.class public final Lme/d;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Lmh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lme/d;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lme/d;->g:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public static i(Lme/e;Ljava/util/ArrayList;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lme/e;->a:Lud/n;

    .line 2
    .line 3
    iget-object p0, p0, Lme/e;->b:Lud/h;

    .line 4
    .line 5
    new-instance v1, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Lud/n;->u()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v0, 0x0

    .line 19
    move v2, v0

    .line 20
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lud/j;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    if-ne v3, p0, :cond_1

    .line 36
    .line 37
    move v2, v4

    .line 38
    :cond_1
    if-eqz v2, :cond_0

    .line 39
    .line 40
    new-instance v5, Lbe/i;

    .line 41
    .line 42
    const/16 v6, 0x11

    .line 43
    .line 44
    invoke-direct {v5, v3, v6}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v5}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    return v4

    .line 57
    :cond_2
    return v0
.end method


# virtual methods
.method public final g(Lud/r;)V
    .locals 12

    .line 1
    iget-boolean v0, p1, Lud/r;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_1f

    .line 4
    .line 5
    iget-object v0, p1, Lud/r;->D:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_b

    .line 14
    .line 15
    :cond_0
    new-instance v0, Lme/c;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p1, Lud/r;->G:Lxd/b;

    .line 21
    .line 22
    invoke-static {p1, v0, v1}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p1, Lud/r;->D:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lqd/s;

    .line 47
    .line 48
    invoke-virtual {v2}, Lqd/s;->b()Lqd/k;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget-boolean v3, v3, Lqd/k;->e:Z

    .line 53
    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v2}, Lqd/s;->b()Lqd/k;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    new-instance v4, Lme/a;

    .line 62
    .line 63
    const/4 v5, 0x1

    .line 64
    invoke-direct {v4, v5}, Lme/a;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    const/4 v3, 0x1

    .line 90
    if-eqz v2, :cond_8

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Ljava/util/Map$Entry;

    .line 97
    .line 98
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    check-cast v4, Lqd/k;

    .line 103
    .line 104
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    :cond_3
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-eqz v6, :cond_6

    .line 119
    .line 120
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    check-cast v6, Lqd/s;

    .line 125
    .line 126
    invoke-virtual {v6}, Lqd/s;->b()Lqd/k;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-boolean v7, v6, Lqd/k;->f:Z

    .line 134
    .line 135
    if-eqz v7, :cond_4

    .line 136
    .line 137
    iput-boolean v3, v4, Lqd/k;->f:Z

    .line 138
    .line 139
    :cond_4
    iget-boolean v7, v6, Lqd/k;->e:Z

    .line 140
    .line 141
    if-eqz v7, :cond_5

    .line 142
    .line 143
    iput-boolean v3, v4, Lqd/k;->e:Z

    .line 144
    .line 145
    :cond_5
    iget-boolean v6, v6, Lqd/k;->d:Z

    .line 146
    .line 147
    if-eqz v6, :cond_3

    .line 148
    .line 149
    iput-boolean v3, v4, Lqd/k;->d:Z

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_6
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-le v5, v3, :cond_7

    .line 157
    .line 158
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_7

    .line 167
    .line 168
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, Lqd/s;

    .line 173
    .line 174
    invoke-virtual {v5, v4}, Lqd/s;->m(Lqd/k;)V

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_7
    iput-object v2, v4, Lqd/k;->c:Ljava/util/List;

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_9

    .line 195
    .line 196
    goto/16 :goto_b

    .line 197
    .line 198
    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    const/4 v2, 0x0

    .line 203
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    if-eqz v4, :cond_b

    .line 208
    .line 209
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    check-cast v4, Lqd/k;

    .line 214
    .line 215
    iget-object v5, v4, Lqd/k;->b:Lqd/j;

    .line 216
    .line 217
    if-nez v5, :cond_a

    .line 218
    .line 219
    sget-object v5, Lqd/j;->u:Lqd/h;

    .line 220
    .line 221
    iput-object v5, v4, Lqd/k;->b:Lqd/j;

    .line 222
    .line 223
    add-int/lit8 v2, v2, 0x1

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_a
    iget-object v4, v4, Lqd/k;->c:Ljava/util/List;

    .line 227
    .line 228
    new-instance v6, Lbe/w;

    .line 229
    .line 230
    const/16 v7, 0xb

    .line 231
    .line 232
    invoke-direct {v6, p1, v7, v5}, Lbe/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v4, v6}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_b
    if-eqz v2, :cond_c

    .line 240
    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v4, "Unknown variable types count: "

    .line 244
    .line 245
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {p1, v0}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    :cond_c
    new-instance v0, Lme/b;

    .line 259
    .line 260
    invoke-direct {v0}, Lme/b;-><init>()V

    .line 261
    .line 262
    .line 263
    iget-object v2, p1, Lud/r;->G:Lxd/b;

    .line 264
    .line 265
    invoke-static {p1, v0, v2}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 266
    .line 267
    .line 268
    iget-object v0, v0, Lme/b;->i:Ljava/util/LinkedHashMap;

    .line 269
    .line 270
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_d

    .line 275
    .line 276
    goto/16 :goto_b

    .line 277
    .line 278
    :cond_d
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    invoke-direct {v2, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    if-eqz v4, :cond_10

    .line 296
    .line 297
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    check-cast v4, Lqd/k;

    .line 302
    .line 303
    new-instance v5, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 306
    .line 307
    .line 308
    iget-object v6, v4, Lqd/k;->c:Ljava/util/List;

    .line 309
    .line 310
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    :cond_e
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    if-eqz v7, :cond_f

    .line 319
    .line 320
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    check-cast v7, Lqd/s;

    .line 325
    .line 326
    invoke-virtual {v0, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    check-cast v7, Lme/f;

    .line 331
    .line 332
    if-eqz v7, :cond_e

    .line 333
    .line 334
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_f
    invoke-static {v5}, Lxe/s;->m(Ljava/util/List;)Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_10
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-eqz v1, :cond_1f

    .line 359
    .line 360
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    check-cast v1, Ljava/util/Map$Entry;

    .line 365
    .line 366
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    check-cast v2, Lqd/k;

    .line 371
    .line 372
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, Ljava/util/List;

    .line 377
    .line 378
    iget-boolean v4, v2, Lqd/k;->f:Z

    .line 379
    .line 380
    if-eqz v4, :cond_11

    .line 381
    .line 382
    goto :goto_7

    .line 383
    :cond_11
    new-instance v4, Ljava/util/ArrayList;

    .line 384
    .line 385
    const/4 v5, 0x3

    .line 386
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 387
    .line 388
    .line 389
    new-instance v6, Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 392
    .line 393
    .line 394
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v7

    .line 402
    if-eqz v7, :cond_12

    .line 403
    .line 404
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    check-cast v7, Lme/f;

    .line 409
    .line 410
    iget-object v8, v7, Lme/f;->b:Ljava/util/ArrayList;

    .line 411
    .line 412
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 413
    .line 414
    .line 415
    iget-object v7, v7, Lme/f;->c:Ljava/util/ArrayList;

    .line 416
    .line 417
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 418
    .line 419
    .line 420
    goto :goto_8

    .line 421
    :cond_12
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_13

    .line 426
    .line 427
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    if-eqz v5, :cond_13

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :cond_13
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 435
    .line 436
    .line 437
    move-result v5

    .line 438
    if-eqz v5, :cond_14

    .line 439
    .line 440
    goto/16 :goto_a

    .line 441
    .line 442
    :cond_14
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    :cond_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    if-eqz v5, :cond_1c

    .line 451
    .line 452
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    check-cast v5, Lme/f;

    .line 457
    .line 458
    iget-object v7, v5, Lme/f;->b:Ljava/util/ArrayList;

    .line 459
    .line 460
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v7

    .line 464
    :cond_16
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v8

    .line 468
    if-eqz v8, :cond_15

    .line 469
    .line 470
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    check-cast v8, Lme/e;

    .line 475
    .line 476
    iget-object v9, v8, Lme/e;->a:Lud/n;

    .line 477
    .line 478
    instance-of v10, v9, Lzd/c;

    .line 479
    .line 480
    if-eqz v10, :cond_18

    .line 481
    .line 482
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 483
    .line 484
    .line 485
    move-result-object v10

    .line 486
    :cond_17
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 487
    .line 488
    .line 489
    move-result v11

    .line 490
    if-eqz v11, :cond_18

    .line 491
    .line 492
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v11

    .line 496
    check-cast v11, Lme/e;

    .line 497
    .line 498
    iget-object v11, v11, Lme/e;->a:Lud/n;

    .line 499
    .line 500
    invoke-static {v9, v11}, Lf8/i;->a0(Lud/j;Lud/n;)Z

    .line 501
    .line 502
    .line 503
    move-result v11

    .line 504
    if-nez v11, :cond_17

    .line 505
    .line 506
    goto :goto_9

    .line 507
    :cond_18
    check-cast v9, Lmd/e;

    .line 508
    .line 509
    iget-object v9, v9, Lmd/e;->g:Lmd/f;

    .line 510
    .line 511
    sget-object v10, Lmd/a;->R:Lmd/a;

    .line 512
    .line 513
    invoke-virtual {v9, v10}, Lmd/f;->a(Lmd/a;)Z

    .line 514
    .line 515
    .line 516
    move-result v9

    .line 517
    if-eqz v9, :cond_19

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :cond_19
    invoke-static {v8, v4}, Lme/d;->i(Lme/e;Ljava/util/ArrayList;)Z

    .line 521
    .line 522
    .line 523
    move-result v9

    .line 524
    if-eqz v9, :cond_16

    .line 525
    .line 526
    invoke-static {v8, v6}, Lme/d;->i(Lme/e;Ljava/util/ArrayList;)Z

    .line 527
    .line 528
    .line 529
    move-result v8

    .line 530
    if-eqz v8, :cond_16

    .line 531
    .line 532
    iget-object v1, v5, Lme/f;->a:Lqd/s;

    .line 533
    .line 534
    iget-object v4, v1, Lqd/s;->i:Lqd/r;

    .line 535
    .line 536
    iget-object v5, v4, Lqd/l;->j:Lud/p;

    .line 537
    .line 538
    if-eqz v5, :cond_1c

    .line 539
    .line 540
    sget-object v6, Lmd/a;->S:Lmd/a;

    .line 541
    .line 542
    iget-object v7, v5, Lmd/e;->g:Lmd/f;

    .line 543
    .line 544
    invoke-virtual {v7, v6}, Lmd/f;->a(Lmd/a;)Z

    .line 545
    .line 546
    .line 547
    move-result v6

    .line 548
    if-nez v6, :cond_1c

    .line 549
    .line 550
    iget-object v6, v5, Lud/p;->k:Lpd/k;

    .line 551
    .line 552
    sget-object v7, Lpd/k;->X:Lpd/k;

    .line 553
    .line 554
    if-ne v6, v7, :cond_1a

    .line 555
    .line 556
    goto :goto_a

    .line 557
    :cond_1a
    iget-object v6, v5, Lud/p;->l:Lqd/r;

    .line 558
    .line 559
    invoke-virtual {v4, v6}, Lqd/r;->equals(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v4

    .line 563
    if-nez v4, :cond_1b

    .line 564
    .line 565
    goto :goto_a

    .line 566
    :cond_1b
    sget-object v2, Lmd/a;->Q:Lmd/a;

    .line 567
    .line 568
    invoke-virtual {v5, v2}, Lmd/e;->w(Lmd/a;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1}, Lqd/s;->b()Lqd/k;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    iput-boolean v3, v1, Lqd/k;->f:Z

    .line 576
    .line 577
    goto/16 :goto_7

    .line 578
    .line 579
    :cond_1c
    :goto_a
    iget-object v1, p1, Lud/r;->G:Lxd/b;

    .line 580
    .line 581
    iget-boolean v4, v2, Lqd/k;->f:Z

    .line 582
    .line 583
    if-eqz v4, :cond_1d

    .line 584
    .line 585
    sget-object v1, Lme/d;->g:Lmh/b;

    .line 586
    .line 587
    const-string v4, "Try to declare already declared variable: {}"

    .line 588
    .line 589
    invoke-interface {v1, v2, v4}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    goto/16 :goto_7

    .line 593
    .line 594
    :cond_1d
    sget-object v4, Lmd/b;->w:Lmd/b;

    .line 595
    .line 596
    iget-object v5, v1, Lmd/e;->g:Lmd/f;

    .line 597
    .line 598
    invoke-virtual {v5, v4}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 599
    .line 600
    .line 601
    move-result-object v4

    .line 602
    check-cast v4, Lnd/e;

    .line 603
    .line 604
    if-nez v4, :cond_1e

    .line 605
    .line 606
    new-instance v4, Lnd/e;

    .line 607
    .line 608
    invoke-direct {v4}, Lnd/e;-><init>()V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v1, v4}, Lmd/e;->y(Loc/b;)V

    .line 612
    .line 613
    .line 614
    :cond_1e
    iget-object v1, v4, Lnd/e;->g:Ljava/util/ArrayList;

    .line 615
    .line 616
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    iput-boolean v3, v2, Lqd/k;->f:Z

    .line 620
    .line 621
    goto/16 :goto_7

    .line 622
    .line 623
    :cond_1f
    :goto_b
    return-void
.end method
