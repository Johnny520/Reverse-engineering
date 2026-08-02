.class public final Lts;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic k:Lus;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lus;II)V
    .locals 0

    .line 15
    iput p4, p0, Lts;->i:I

    iput-object p1, p0, Lts;->j:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, Lts;->k:Lus;

    iput p3, p0, Lts;->l:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lus;Lorg/luckypray/dexkit/DexKitBridge;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lts;->i:I

    .line 3
    .line 4
    iput-object p1, p0, Lts;->k:Lus;

    .line 5
    .line 6
    iput-object p2, p0, Lts;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 7
    .line 8
    iput p3, p0, Lts;->l:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lts;->i:I

    .line 2
    .line 3
    const-string v1, "DexKitBridge is not valid"

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/16 v5, 0xa

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lts;->k:Lus;

    .line 16
    .line 17
    iget-object v0, v0, Lus;->k:Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lts;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 22
    .line 23
    iget p0, p0, Lts;->l:I

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {p0, v0}, Lsj;->f(II)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    new-array p0, v7, [J

    .line 34
    .line 35
    aput-wide v2, p0, v6

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Lorg/luckypray/dexkit/DexKitBridge;->D([J)Lws;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p0}, Ltj;->first()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    :goto_0
    check-cast v4, Lus;

    .line 53
    .line 54
    :cond_1
    return-object v4

    .line 55
    :pswitch_0
    iget-object v0, p0, Lts;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 56
    .line 57
    iget-object v4, p0, Lts;->k:Lus;

    .line 58
    .line 59
    iget-object v4, v4, Lus;->m:Ljava/util/ArrayList;

    .line 60
    .line 61
    iget p0, p0, Lts;->l:I

    .line 62
    .line 63
    new-instance v8, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-static {v4, v5}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    check-cast v5, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    invoke-static {p0, v5}, Lsj;->f(II)J

    .line 93
    .line 94
    .line 95
    move-result-wide v9

    .line 96
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    invoke-static {v8}, Ldu;->G0(Ljava/util/ArrayList;)[J

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v4, v0, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 118
    .line 119
    .line 120
    :try_start_0
    iget-wide v8, v0, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 121
    .line 122
    cmp-long v2, v8, v2

    .line 123
    .line 124
    if-eqz v2, :cond_4

    .line 125
    .line 126
    invoke-static {v8, v9, p0}, Lorg/luckypray/dexkit/DexKitBridge;->r(J[J)[B

    .line 127
    .line 128
    .line 129
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 131
    .line 132
    .line 133
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    new-instance v1, La;

    .line 141
    .line 142
    invoke-direct {v1}, Lox2;-><init>()V

    .line 143
    .line 144
    .line 145
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 146
    .line 147
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    add-int/2addr v3, v2

    .line 163
    invoke-virtual {v1, v3, p0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 164
    .line 165
    .line 166
    new-instance p0, Lki0;

    .line 167
    .line 168
    invoke-direct {p0, v7}, Lki0;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, La;->i()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    :goto_2
    if-ge v6, v2, :cond_3

    .line 176
    .line 177
    invoke-virtual {v1, v6}, La;->j(I)Lr;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {v0, v3}, Lp40;->t(Lorg/luckypray/dexkit/DexKitBridge;Lr;)Lug1;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {p0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    add-int/lit8 v6, v6, 0x1

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_3
    return-object p0

    .line 195
    :catchall_0
    move-exception p0

    .line 196
    goto :goto_3

    .line 197
    :cond_4
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 198
    .line 199
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    :goto_3
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 204
    .line 205
    .line 206
    throw p0

    .line 207
    :pswitch_1
    iget-object v0, p0, Lts;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 208
    .line 209
    iget-object v1, p0, Lts;->k:Lus;

    .line 210
    .line 211
    iget-object v1, v1, Lus;->l:Ljava/util/ArrayList;

    .line 212
    .line 213
    iget p0, p0, Lts;->l:I

    .line 214
    .line 215
    new-instance v2, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-static {v1, v5}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-eqz v3, :cond_5

    .line 233
    .line 234
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    check-cast v3, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    invoke-static {p0, v3}, Lsj;->f(II)J

    .line 245
    .line 246
    .line 247
    move-result-wide v3

    .line 248
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_5
    invoke-static {v2}, Ldu;->G0(Ljava/util/ArrayList;)[J

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge;->D([J)Lws;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    return-object p0

    .line 265
    :pswitch_2
    iget-object v0, p0, Lts;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 266
    .line 267
    iget-object v7, p0, Lts;->k:Lus;

    .line 268
    .line 269
    iget-object v7, v7, Lus;->n:Ljava/util/ArrayList;

    .line 270
    .line 271
    iget p0, p0, Lts;->l:I

    .line 272
    .line 273
    new-instance v8, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-static {v7, v5}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    if-eqz v7, :cond_6

    .line 291
    .line 292
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    check-cast v7, Ljava/lang/Number;

    .line 297
    .line 298
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v7

    .line 302
    invoke-static {p0, v7}, Lsj;->f(II)J

    .line 303
    .line 304
    .line 305
    move-result-wide v9

    .line 306
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_6
    invoke-static {v8}, Ldu;->G0(Ljava/util/ArrayList;)[J

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    iget-object v5, v0, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 322
    .line 323
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 328
    .line 329
    .line 330
    :try_start_2
    iget-wide v7, v0, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 331
    .line 332
    cmp-long v2, v7, v2

    .line 333
    .line 334
    if-eqz v2, :cond_c

    .line 335
    .line 336
    invoke-static {v7, v8, p0}, Lorg/luckypray/dexkit/DexKitBridge;->o(J[J)[B

    .line 337
    .line 338
    .line 339
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 340
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 341
    .line 342
    .line 343
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-static {}, Ljx2;->d()Ljx2;

    .line 351
    .line 352
    .line 353
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 354
    .line 355
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 356
    .line 357
    .line 358
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    add-int/2addr v2, v1

    .line 371
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    sub-int v1, v2, v1

    .line 376
    .line 377
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    new-instance v5, Lki0;

    .line 382
    .line 383
    invoke-direct {v5, v6}, Lki0;-><init>(I)V

    .line 384
    .line 385
    .line 386
    const/4 v7, 0x4

    .line 387
    if-ge v7, v3, :cond_7

    .line 388
    .line 389
    add-int/lit8 v8, v1, 0x4

    .line 390
    .line 391
    invoke-virtual {p0, v8}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 392
    .line 393
    .line 394
    move-result v8

    .line 395
    goto :goto_6

    .line 396
    :cond_7
    move v8, v6

    .line 397
    :goto_6
    if-eqz v8, :cond_8

    .line 398
    .line 399
    add-int/2addr v8, v2

    .line 400
    invoke-virtual {p0, v8}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    add-int/2addr v9, v8

    .line 405
    invoke-virtual {p0, v9}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 406
    .line 407
    .line 408
    move-result v8

    .line 409
    goto :goto_7

    .line 410
    :cond_8
    move v8, v6

    .line 411
    :goto_7
    move v9, v6

    .line 412
    :goto_8
    if-ge v9, v8, :cond_b

    .line 413
    .line 414
    new-instance v10, Lq;

    .line 415
    .line 416
    invoke-direct {v10}, Lox2;-><init>()V

    .line 417
    .line 418
    .line 419
    if-ge v7, v3, :cond_9

    .line 420
    .line 421
    add-int/lit8 v11, v1, 0x4

    .line 422
    .line 423
    invoke-virtual {p0, v11}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 424
    .line 425
    .line 426
    move-result v11

    .line 427
    goto :goto_9

    .line 428
    :cond_9
    move v11, v6

    .line 429
    :goto_9
    if-eqz v11, :cond_a

    .line 430
    .line 431
    add-int/2addr v11, v2

    .line 432
    invoke-virtual {p0, v11}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 433
    .line 434
    .line 435
    move-result v12

    .line 436
    add-int/2addr v12, v11

    .line 437
    add-int/2addr v12, v7

    .line 438
    mul-int/lit8 v11, v9, 0x4

    .line 439
    .line 440
    add-int/2addr v11, v12

    .line 441
    invoke-virtual {p0, v11}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 442
    .line 443
    .line 444
    move-result v12

    .line 445
    add-int/2addr v12, v11

    .line 446
    invoke-virtual {v10, v12, p0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 447
    .line 448
    .line 449
    goto :goto_a

    .line 450
    :cond_a
    move-object v10, v4

    .line 451
    :goto_a
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    invoke-static {v0, v10}, Lse;->B(Lorg/luckypray/dexkit/DexKitBridge;Lq;)Lji0;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    invoke-virtual {v5, v10}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    add-int/lit8 v9, v9, 0x1

    .line 462
    .line 463
    goto :goto_8

    .line 464
    :cond_b
    return-object v5

    .line 465
    :catchall_1
    move-exception p0

    .line 466
    goto :goto_b

    .line 467
    :cond_c
    :try_start_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 468
    .line 469
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 473
    :goto_b
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 474
    .line 475
    .line 476
    throw p0

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
