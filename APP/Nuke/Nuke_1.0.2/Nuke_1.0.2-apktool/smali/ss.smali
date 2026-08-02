.class public final Lss;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lsj;III)V
    .locals 0

    .line 1
    iput p5, p0, Lss;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput p3, p0, Lss;->k:I

    .line 6
    .line 7
    iput p4, p0, Lss;->l:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lss;->i:I

    .line 4
    .line 5
    const/4 v3, 0x4

    .line 6
    const-string v5, "DexKitBridge is not valid"

    .line 7
    .line 8
    const-wide/16 v6, 0x0

    .line 9
    .line 10
    const/4 v8, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 15
    .line 16
    iget v2, v0, Lss;->k:I

    .line 17
    .line 18
    iget v0, v0, Lss;->l:I

    .line 19
    .line 20
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-wide v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 34
    .line 35
    cmp-long v6, v0, v6

    .line 36
    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->v(JJ)[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    :goto_0
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :pswitch_0
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 64
    .line 65
    iget v9, v0, Lss;->k:I

    .line 66
    .line 67
    iget v0, v0, Lss;->l:I

    .line 68
    .line 69
    invoke-static {v9, v0}, Lsj;->f(II)J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    invoke-virtual {v11}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 80
    .line 81
    .line 82
    :try_start_2
    iget-wide v12, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 83
    .line 84
    cmp-long v0, v12, v6

    .line 85
    .line 86
    if-eqz v0, :cond_b

    .line 87
    .line 88
    invoke-static {v12, v13, v9, v10}, Lorg/luckypray/dexkit/DexKitBridge;->u(JJ)[B

    .line 89
    .line 90
    .line 91
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    invoke-virtual {v11}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {}, Ljx2;->d()Ljx2;

    .line 103
    .line 104
    .line 105
    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 106
    .line 107
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    add-int/2addr v6, v5

    .line 123
    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    sub-int v5, v6, v5

    .line 128
    .line 129
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    new-instance v9, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    if-ge v3, v7, :cond_1

    .line 139
    .line 140
    add-int/lit8 v10, v5, 0x4

    .line 141
    .line 142
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    goto :goto_1

    .line 147
    :cond_1
    const/4 v10, 0x0

    .line 148
    :goto_1
    if-eqz v10, :cond_2

    .line 149
    .line 150
    add-int/2addr v10, v6

    .line 151
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    add-int/2addr v11, v10

    .line 156
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    goto :goto_2

    .line 161
    :cond_2
    const/4 v10, 0x0

    .line 162
    :goto_2
    const/4 v11, 0x0

    .line 163
    :goto_3
    if-ge v11, v10, :cond_a

    .line 164
    .line 165
    new-instance v12, La;

    .line 166
    .line 167
    invoke-direct {v12}, Lox2;-><init>()V

    .line 168
    .line 169
    .line 170
    if-ge v3, v7, :cond_3

    .line 171
    .line 172
    add-int/lit8 v13, v5, 0x4

    .line 173
    .line 174
    invoke-virtual {v0, v13}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 175
    .line 176
    .line 177
    move-result v13

    .line 178
    goto :goto_4

    .line 179
    :cond_3
    const/4 v13, 0x0

    .line 180
    :goto_4
    if-eqz v13, :cond_4

    .line 181
    .line 182
    add-int/2addr v13, v6

    .line 183
    invoke-virtual {v0, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 184
    .line 185
    .line 186
    move-result v14

    .line 187
    add-int/2addr v14, v13

    .line 188
    add-int/2addr v14, v3

    .line 189
    mul-int/lit8 v13, v11, 0x4

    .line 190
    .line 191
    add-int/2addr v13, v14

    .line 192
    invoke-virtual {v0, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    add-int/2addr v14, v13

    .line 197
    invoke-virtual {v12, v14, v0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_4
    const/4 v12, 0x0

    .line 202
    :goto_5
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    new-instance v13, Lq;

    .line 206
    .line 207
    invoke-direct {v13}, Lox2;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v3}, Lox2;->b(I)I

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    if-eqz v14, :cond_5

    .line 215
    .line 216
    iget v15, v12, Lox2;->a:I

    .line 217
    .line 218
    add-int/2addr v14, v15

    .line 219
    invoke-virtual {v12, v14}, Lox2;->a(I)I

    .line 220
    .line 221
    .line 222
    move-result v14

    .line 223
    iget-object v15, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 224
    .line 225
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v13, v14, v15}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 229
    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_5
    const/4 v13, 0x0

    .line 233
    :goto_6
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {v1, v13}, Lse;->B(Lorg/luckypray/dexkit/DexKitBridge;Lq;)Lji0;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    const/4 v14, 0x6

    .line 241
    invoke-virtual {v12, v14}, Lox2;->b(I)I

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    if-eqz v15, :cond_6

    .line 246
    .line 247
    iget-object v2, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 248
    .line 249
    iget v4, v12, Lox2;->a:I

    .line 250
    .line 251
    add-int/2addr v15, v4

    .line 252
    invoke-virtual {v2, v15}, Ljava/nio/ByteBuffer;->get(I)B

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    goto :goto_7

    .line 257
    :cond_6
    const/4 v2, 0x0

    .line 258
    :goto_7
    if-ne v2, v8, :cond_7

    .line 259
    .line 260
    move v4, v8

    .line 261
    goto :goto_8

    .line 262
    :cond_7
    const/4 v4, 0x2

    .line 263
    if-ne v2, v4, :cond_8

    .line 264
    .line 265
    :goto_8
    new-instance v2, Lz83;

    .line 266
    .line 267
    invoke-direct {v2, v13, v4}, Lz83;-><init>(Lji0;I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    add-int/lit8 v11, v11, 0x1

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 277
    .line 278
    invoke-virtual {v12, v14}, Lox2;->b(I)I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_9

    .line 283
    .line 284
    iget-object v2, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 285
    .line 286
    iget v3, v12, Lox2;->a:I

    .line 287
    .line 288
    add-int/2addr v1, v3

    .line 289
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    goto :goto_9

    .line 294
    :cond_9
    const/4 v4, 0x0

    .line 295
    :goto_9
    const-string v1, "Unknown using type: "

    .line 296
    .line 297
    invoke-static {v1, v4}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw v0

    .line 305
    :cond_a
    return-object v9

    .line 306
    :catchall_1
    move-exception v0

    .line 307
    goto :goto_a

    .line 308
    :cond_b
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 309
    .line 310
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 314
    :goto_a
    invoke-virtual {v11}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 315
    .line 316
    .line 317
    throw v0

    .line 318
    :pswitch_1
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 319
    .line 320
    iget v2, v0, Lss;->k:I

    .line 321
    .line 322
    iget v0, v0, Lss;->l:I

    .line 323
    .line 324
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 325
    .line 326
    .line 327
    move-result-wide v2

    .line 328
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 335
    .line 336
    .line 337
    :try_start_4
    iget-wide v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 338
    .line 339
    cmp-long v6, v0, v6

    .line 340
    .line 341
    if-eqz v6, :cond_e

    .line 342
    .line 343
    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->B(JJ)[Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 347
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 348
    .line 349
    .line 350
    if-eqz v0, :cond_c

    .line 351
    .line 352
    new-instance v2, Ljava/util/ArrayList;

    .line 353
    .line 354
    array-length v1, v0

    .line 355
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 356
    .line 357
    .line 358
    array-length v1, v0

    .line 359
    const/4 v4, 0x0

    .line 360
    :goto_b
    if-ge v4, v1, :cond_d

    .line 361
    .line 362
    aget-object v3, v0, v4

    .line 363
    .line 364
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    add-int/lit8 v4, v4, 0x1

    .line 368
    .line 369
    goto :goto_b

    .line 370
    :cond_c
    const/4 v2, 0x0

    .line 371
    :cond_d
    return-object v2

    .line 372
    :catchall_2
    move-exception v0

    .line 373
    goto :goto_c

    .line 374
    :cond_e
    :try_start_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 375
    .line 376
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 380
    :goto_c
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 381
    .line 382
    .line 383
    throw v0

    .line 384
    :pswitch_2
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 385
    .line 386
    iget v2, v0, Lss;->k:I

    .line 387
    .line 388
    iget v0, v0, Lss;->l:I

    .line 389
    .line 390
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 391
    .line 392
    .line 393
    move-result-wide v8

    .line 394
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 395
    .line 396
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 401
    .line 402
    .line 403
    :try_start_6
    iget-wide v10, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 404
    .line 405
    cmp-long v0, v10, v6

    .line 406
    .line 407
    if-eqz v0, :cond_16

    .line 408
    .line 409
    invoke-static {v10, v11, v8, v9}, Lorg/luckypray/dexkit/DexKitBridge;->A(JJ)[B

    .line 410
    .line 411
    .line 412
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 413
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 414
    .line 415
    .line 416
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-static {}, Ljx2;->d()Ljx2;

    .line 424
    .line 425
    .line 426
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 427
    .line 428
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 440
    .line 441
    .line 442
    move-result v4

    .line 443
    add-int/2addr v4, v2

    .line 444
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    sub-int v2, v4, v2

    .line 449
    .line 450
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    new-instance v6, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 457
    .line 458
    .line 459
    if-ge v3, v5, :cond_f

    .line 460
    .line 461
    add-int/lit8 v7, v2, 0x4

    .line 462
    .line 463
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 464
    .line 465
    .line 466
    move-result v7

    .line 467
    goto :goto_d

    .line 468
    :cond_f
    const/4 v7, 0x0

    .line 469
    :goto_d
    if-eqz v7, :cond_10

    .line 470
    .line 471
    add-int/2addr v7, v4

    .line 472
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 473
    .line 474
    .line 475
    move-result v8

    .line 476
    add-int/2addr v8, v7

    .line 477
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 478
    .line 479
    .line 480
    move-result v7

    .line 481
    goto :goto_e

    .line 482
    :cond_10
    const/4 v7, 0x0

    .line 483
    :goto_e
    const/4 v8, 0x0

    .line 484
    :goto_f
    if-ge v8, v7, :cond_15

    .line 485
    .line 486
    new-instance v9, La;

    .line 487
    .line 488
    invoke-direct {v9}, Lox2;-><init>()V

    .line 489
    .line 490
    .line 491
    if-ge v3, v5, :cond_11

    .line 492
    .line 493
    add-int/lit8 v10, v2, 0x4

    .line 494
    .line 495
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 496
    .line 497
    .line 498
    move-result v10

    .line 499
    goto :goto_10

    .line 500
    :cond_11
    const/4 v10, 0x0

    .line 501
    :goto_10
    if-eqz v10, :cond_12

    .line 502
    .line 503
    add-int/2addr v10, v4

    .line 504
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 505
    .line 506
    .line 507
    move-result v11

    .line 508
    add-int/2addr v11, v10

    .line 509
    add-int/2addr v11, v3

    .line 510
    mul-int/lit8 v10, v8, 0x4

    .line 511
    .line 512
    add-int/2addr v10, v11

    .line 513
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 514
    .line 515
    .line 516
    move-result v11

    .line 517
    add-int/2addr v11, v10

    .line 518
    invoke-virtual {v9, v11, v0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 519
    .line 520
    .line 521
    goto :goto_11

    .line 522
    :cond_12
    const/4 v9, 0x0

    .line 523
    :goto_11
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    new-instance v10, Ljava/util/ArrayList;

    .line 527
    .line 528
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v9, v3}, Lox2;->b(I)I

    .line 532
    .line 533
    .line 534
    move-result v11

    .line 535
    if-eqz v11, :cond_13

    .line 536
    .line 537
    invoke-virtual {v9, v11}, Lox2;->f(I)I

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    goto :goto_12

    .line 542
    :cond_13
    const/4 v11, 0x0

    .line 543
    :goto_12
    const/4 v12, 0x0

    .line 544
    :goto_13
    if-ge v12, v11, :cond_14

    .line 545
    .line 546
    invoke-virtual {v9, v12}, La;->g(I)Lc;

    .line 547
    .line 548
    .line 549
    move-result-object v13

    .line 550
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    invoke-static {v1, v13}, Lgf1;->t(Lorg/luckypray/dexkit/DexKitBridge;Lc;)Lud;

    .line 554
    .line 555
    .line 556
    move-result-object v13

    .line 557
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    add-int/lit8 v12, v12, 0x1

    .line 561
    .line 562
    goto :goto_13

    .line 563
    :cond_14
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    add-int/lit8 v8, v8, 0x1

    .line 567
    .line 568
    goto :goto_f

    .line 569
    :cond_15
    return-object v6

    .line 570
    :catchall_3
    move-exception v0

    .line 571
    goto :goto_14

    .line 572
    :cond_16
    :try_start_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 573
    .line 574
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 578
    :goto_14
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 579
    .line 580
    .line 581
    throw v0

    .line 582
    :pswitch_3
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 583
    .line 584
    iget v2, v0, Lss;->k:I

    .line 585
    .line 586
    iget v0, v0, Lss;->l:I

    .line 587
    .line 588
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 589
    .line 590
    .line 591
    move-result-wide v2

    .line 592
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 593
    .line 594
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 599
    .line 600
    .line 601
    :try_start_8
    iget-wide v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 602
    .line 603
    cmp-long v6, v0, v6

    .line 604
    .line 605
    if-eqz v6, :cond_17

    .line 606
    .line 607
    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->t(JJ)[I

    .line 608
    .line 609
    .line 610
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 611
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 612
    .line 613
    .line 614
    invoke-static {v0}, Lmg;->s0([I)Ljava/util/List;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    return-object v0

    .line 619
    :catchall_4
    move-exception v0

    .line 620
    goto :goto_15

    .line 621
    :cond_17
    :try_start_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 622
    .line 623
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 627
    :goto_15
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 628
    .line 629
    .line 630
    throw v0

    .line 631
    :pswitch_4
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 632
    .line 633
    iget v2, v0, Lss;->k:I

    .line 634
    .line 635
    iget v0, v0, Lss;->l:I

    .line 636
    .line 637
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 638
    .line 639
    .line 640
    move-result-wide v2

    .line 641
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 642
    .line 643
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 644
    .line 645
    .line 646
    move-result-object v4

    .line 647
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 648
    .line 649
    .line 650
    :try_start_a
    iget-wide v9, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 651
    .line 652
    cmp-long v0, v9, v6

    .line 653
    .line 654
    if-eqz v0, :cond_19

    .line 655
    .line 656
    invoke-static {v9, v10, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->p(JJ)[B

    .line 657
    .line 658
    .line 659
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 660
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 661
    .line 662
    .line 663
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    new-instance v2, La;

    .line 671
    .line 672
    invoke-direct {v2}, Lox2;-><init>()V

    .line 673
    .line 674
    .line 675
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 676
    .line 677
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 681
    .line 682
    .line 683
    move-result v3

    .line 684
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 689
    .line 690
    .line 691
    move-result v4

    .line 692
    add-int/2addr v4, v3

    .line 693
    invoke-virtual {v2, v4, v0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 694
    .line 695
    .line 696
    new-instance v0, Lki0;

    .line 697
    .line 698
    invoke-direct {v0, v8}, Lki0;-><init>(I)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v2}, La;->i()I

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    const/4 v4, 0x0

    .line 706
    :goto_16
    if-ge v4, v3, :cond_18

    .line 707
    .line 708
    invoke-virtual {v2, v4}, La;->j(I)Lr;

    .line 709
    .line 710
    .line 711
    move-result-object v5

    .line 712
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    invoke-static {v1, v5}, Lp40;->t(Lorg/luckypray/dexkit/DexKitBridge;Lr;)Lug1;

    .line 716
    .line 717
    .line 718
    move-result-object v5

    .line 719
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    add-int/lit8 v4, v4, 0x1

    .line 723
    .line 724
    goto :goto_16

    .line 725
    :cond_18
    return-object v0

    .line 726
    :catchall_5
    move-exception v0

    .line 727
    goto :goto_17

    .line 728
    :cond_19
    :try_start_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 729
    .line 730
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 734
    :goto_17
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 735
    .line 736
    .line 737
    throw v0

    .line 738
    :pswitch_5
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 739
    .line 740
    iget v2, v0, Lss;->k:I

    .line 741
    .line 742
    iget v0, v0, Lss;->l:I

    .line 743
    .line 744
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 745
    .line 746
    .line 747
    move-result-wide v2

    .line 748
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 749
    .line 750
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 751
    .line 752
    .line 753
    move-result-object v4

    .line 754
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 755
    .line 756
    .line 757
    :try_start_c
    iget-wide v9, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 758
    .line 759
    cmp-long v0, v9, v6

    .line 760
    .line 761
    if-eqz v0, :cond_1b

    .line 762
    .line 763
    invoke-static {v9, v10, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->h(JJ)[B

    .line 764
    .line 765
    .line 766
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 767
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 768
    .line 769
    .line 770
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 775
    .line 776
    .line 777
    new-instance v2, La;

    .line 778
    .line 779
    invoke-direct {v2}, Lox2;-><init>()V

    .line 780
    .line 781
    .line 782
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 783
    .line 784
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 788
    .line 789
    .line 790
    move-result v3

    .line 791
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 792
    .line 793
    .line 794
    move-result v3

    .line 795
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 796
    .line 797
    .line 798
    move-result v4

    .line 799
    add-int/2addr v4, v3

    .line 800
    invoke-virtual {v2, v4, v0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 801
    .line 802
    .line 803
    new-instance v0, Lki0;

    .line 804
    .line 805
    invoke-direct {v0, v8}, Lki0;-><init>(I)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v2}, La;->i()I

    .line 809
    .line 810
    .line 811
    move-result v3

    .line 812
    const/4 v4, 0x0

    .line 813
    :goto_18
    if-ge v4, v3, :cond_1a

    .line 814
    .line 815
    invoke-virtual {v2, v4}, La;->j(I)Lr;

    .line 816
    .line 817
    .line 818
    move-result-object v5

    .line 819
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    .line 821
    .line 822
    invoke-static {v1, v5}, Lp40;->t(Lorg/luckypray/dexkit/DexKitBridge;Lr;)Lug1;

    .line 823
    .line 824
    .line 825
    move-result-object v5

    .line 826
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    add-int/lit8 v4, v4, 0x1

    .line 830
    .line 831
    goto :goto_18

    .line 832
    :cond_1a
    return-object v0

    .line 833
    :catchall_6
    move-exception v0

    .line 834
    goto :goto_19

    .line 835
    :cond_1b
    :try_start_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 836
    .line 837
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 841
    :goto_19
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 842
    .line 843
    .line 844
    throw v0

    .line 845
    :pswitch_6
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 846
    .line 847
    iget v2, v0, Lss;->k:I

    .line 848
    .line 849
    iget v0, v0, Lss;->l:I

    .line 850
    .line 851
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 852
    .line 853
    .line 854
    move-result-wide v8

    .line 855
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 856
    .line 857
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 862
    .line 863
    .line 864
    :try_start_e
    iget-wide v10, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 865
    .line 866
    cmp-long v0, v10, v6

    .line 867
    .line 868
    if-eqz v0, :cond_1e

    .line 869
    .line 870
    invoke-static {v10, v11, v8, v9}, Lorg/luckypray/dexkit/DexKitBridge;->q(JJ)[B

    .line 871
    .line 872
    .line 873
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 874
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 875
    .line 876
    .line 877
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    new-instance v2, La;

    .line 885
    .line 886
    invoke-direct {v2}, Lox2;-><init>()V

    .line 887
    .line 888
    .line 889
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 890
    .line 891
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 895
    .line 896
    .line 897
    move-result v4

    .line 898
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 899
    .line 900
    .line 901
    move-result v4

    .line 902
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 903
    .line 904
    .line 905
    move-result v5

    .line 906
    add-int/2addr v5, v4

    .line 907
    invoke-virtual {v2, v5, v0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 908
    .line 909
    .line 910
    new-instance v0, Ljava/util/ArrayList;

    .line 911
    .line 912
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v2, v3}, Lox2;->b(I)I

    .line 916
    .line 917
    .line 918
    move-result v3

    .line 919
    if-eqz v3, :cond_1c

    .line 920
    .line 921
    invoke-virtual {v2, v3}, Lox2;->f(I)I

    .line 922
    .line 923
    .line 924
    move-result v3

    .line 925
    goto :goto_1a

    .line 926
    :cond_1c
    const/4 v3, 0x0

    .line 927
    :goto_1a
    const/4 v4, 0x0

    .line 928
    :goto_1b
    if-ge v4, v3, :cond_1d

    .line 929
    .line 930
    invoke-virtual {v2, v4}, La;->g(I)Lc;

    .line 931
    .line 932
    .line 933
    move-result-object v5

    .line 934
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    invoke-static {v1, v5}, Lgf1;->t(Lorg/luckypray/dexkit/DexKitBridge;Lc;)Lud;

    .line 938
    .line 939
    .line 940
    move-result-object v5

    .line 941
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    add-int/lit8 v4, v4, 0x1

    .line 945
    .line 946
    goto :goto_1b

    .line 947
    :cond_1d
    return-object v0

    .line 948
    :catchall_7
    move-exception v0

    .line 949
    goto :goto_1c

    .line 950
    :cond_1e
    :try_start_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 951
    .line 952
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 953
    .line 954
    .line 955
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 956
    :goto_1c
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 957
    .line 958
    .line 959
    throw v0

    .line 960
    :pswitch_7
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 961
    .line 962
    iget v2, v0, Lss;->k:I

    .line 963
    .line 964
    iget v0, v0, Lss;->l:I

    .line 965
    .line 966
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 967
    .line 968
    .line 969
    move-result-wide v2

    .line 970
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 971
    .line 972
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 973
    .line 974
    .line 975
    move-result-object v4

    .line 976
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 977
    .line 978
    .line 979
    :try_start_10
    iget-wide v9, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 980
    .line 981
    cmp-long v0, v9, v6

    .line 982
    .line 983
    if-eqz v0, :cond_20

    .line 984
    .line 985
    invoke-static {v9, v10, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->c(JJ)[B

    .line 986
    .line 987
    .line 988
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 989
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 990
    .line 991
    .line 992
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    new-instance v2, La;

    .line 1000
    .line 1001
    invoke-direct {v2}, Lox2;-><init>()V

    .line 1002
    .line 1003
    .line 1004
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1005
    .line 1006
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 1010
    .line 1011
    .line 1012
    move-result v3

    .line 1013
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 1014
    .line 1015
    .line 1016
    move-result v3

    .line 1017
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 1018
    .line 1019
    .line 1020
    move-result v4

    .line 1021
    add-int/2addr v4, v3

    .line 1022
    invoke-virtual {v2, v4, v0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 1023
    .line 1024
    .line 1025
    new-instance v0, Lki0;

    .line 1026
    .line 1027
    invoke-direct {v0, v8}, Lki0;-><init>(I)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v2}, La;->i()I

    .line 1031
    .line 1032
    .line 1033
    move-result v3

    .line 1034
    const/4 v4, 0x0

    .line 1035
    :goto_1d
    if-ge v4, v3, :cond_1f

    .line 1036
    .line 1037
    invoke-virtual {v2, v4}, La;->j(I)Lr;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v5

    .line 1041
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1042
    .line 1043
    .line 1044
    invoke-static {v1, v5}, Lp40;->t(Lorg/luckypray/dexkit/DexKitBridge;Lr;)Lug1;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v5

    .line 1048
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1049
    .line 1050
    .line 1051
    add-int/lit8 v4, v4, 0x1

    .line 1052
    .line 1053
    goto :goto_1d

    .line 1054
    :cond_1f
    return-object v0

    .line 1055
    :catchall_8
    move-exception v0

    .line 1056
    goto :goto_1e

    .line 1057
    :cond_20
    :try_start_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1058
    .line 1059
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1060
    .line 1061
    .line 1062
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 1063
    :goto_1e
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 1064
    .line 1065
    .line 1066
    throw v0

    .line 1067
    :pswitch_8
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 1068
    .line 1069
    iget v2, v0, Lss;->k:I

    .line 1070
    .line 1071
    iget v0, v0, Lss;->l:I

    .line 1072
    .line 1073
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 1074
    .line 1075
    .line 1076
    move-result-wide v2

    .line 1077
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 1078
    .line 1079
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v4

    .line 1083
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 1084
    .line 1085
    .line 1086
    :try_start_12
    iget-wide v9, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 1087
    .line 1088
    cmp-long v0, v9, v6

    .line 1089
    .line 1090
    if-eqz v0, :cond_22

    .line 1091
    .line 1092
    invoke-static {v9, v10, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->b(JJ)[B

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 1096
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 1097
    .line 1098
    .line 1099
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1104
    .line 1105
    .line 1106
    new-instance v2, La;

    .line 1107
    .line 1108
    invoke-direct {v2}, Lox2;-><init>()V

    .line 1109
    .line 1110
    .line 1111
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1112
    .line 1113
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 1117
    .line 1118
    .line 1119
    move-result v3

    .line 1120
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 1121
    .line 1122
    .line 1123
    move-result v3

    .line 1124
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 1125
    .line 1126
    .line 1127
    move-result v4

    .line 1128
    add-int/2addr v4, v3

    .line 1129
    invoke-virtual {v2, v4, v0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 1130
    .line 1131
    .line 1132
    new-instance v0, Lki0;

    .line 1133
    .line 1134
    invoke-direct {v0, v8}, Lki0;-><init>(I)V

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v2}, La;->i()I

    .line 1138
    .line 1139
    .line 1140
    move-result v3

    .line 1141
    const/4 v4, 0x0

    .line 1142
    :goto_1f
    if-ge v4, v3, :cond_21

    .line 1143
    .line 1144
    invoke-virtual {v2, v4}, La;->j(I)Lr;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v5

    .line 1148
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1149
    .line 1150
    .line 1151
    invoke-static {v1, v5}, Lp40;->t(Lorg/luckypray/dexkit/DexKitBridge;Lr;)Lug1;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v5

    .line 1155
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1156
    .line 1157
    .line 1158
    add-int/lit8 v4, v4, 0x1

    .line 1159
    .line 1160
    goto :goto_1f

    .line 1161
    :cond_21
    return-object v0

    .line 1162
    :catchall_9
    move-exception v0

    .line 1163
    goto :goto_20

    .line 1164
    :cond_22
    :try_start_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1165
    .line 1166
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1167
    .line 1168
    .line 1169
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 1170
    :goto_20
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 1171
    .line 1172
    .line 1173
    throw v0

    .line 1174
    :pswitch_9
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 1175
    .line 1176
    iget v2, v0, Lss;->k:I

    .line 1177
    .line 1178
    iget v0, v0, Lss;->l:I

    .line 1179
    .line 1180
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 1181
    .line 1182
    .line 1183
    move-result-wide v8

    .line 1184
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 1185
    .line 1186
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 1191
    .line 1192
    .line 1193
    :try_start_14
    iget-wide v10, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 1194
    .line 1195
    cmp-long v0, v10, v6

    .line 1196
    .line 1197
    if-eqz v0, :cond_25

    .line 1198
    .line 1199
    invoke-static {v10, v11, v8, v9}, Lorg/luckypray/dexkit/DexKitBridge;->k(JJ)[B

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 1203
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 1204
    .line 1205
    .line 1206
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v0

    .line 1210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1211
    .line 1212
    .line 1213
    new-instance v2, La;

    .line 1214
    .line 1215
    invoke-direct {v2}, Lox2;-><init>()V

    .line 1216
    .line 1217
    .line 1218
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1219
    .line 1220
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 1224
    .line 1225
    .line 1226
    move-result v4

    .line 1227
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 1228
    .line 1229
    .line 1230
    move-result v4

    .line 1231
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 1232
    .line 1233
    .line 1234
    move-result v5

    .line 1235
    add-int/2addr v5, v4

    .line 1236
    invoke-virtual {v2, v5, v0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 1237
    .line 1238
    .line 1239
    new-instance v0, Ljava/util/ArrayList;

    .line 1240
    .line 1241
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v2, v3}, Lox2;->b(I)I

    .line 1245
    .line 1246
    .line 1247
    move-result v3

    .line 1248
    if-eqz v3, :cond_23

    .line 1249
    .line 1250
    invoke-virtual {v2, v3}, Lox2;->f(I)I

    .line 1251
    .line 1252
    .line 1253
    move-result v3

    .line 1254
    goto :goto_21

    .line 1255
    :cond_23
    const/4 v3, 0x0

    .line 1256
    :goto_21
    const/4 v4, 0x0

    .line 1257
    :goto_22
    if-ge v4, v3, :cond_24

    .line 1258
    .line 1259
    invoke-virtual {v2, v4}, La;->g(I)Lc;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v5

    .line 1263
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1264
    .line 1265
    .line 1266
    invoke-static {v1, v5}, Lgf1;->t(Lorg/luckypray/dexkit/DexKitBridge;Lc;)Lud;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v5

    .line 1270
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1271
    .line 1272
    .line 1273
    add-int/lit8 v4, v4, 0x1

    .line 1274
    .line 1275
    goto :goto_22

    .line 1276
    :cond_24
    return-object v0

    .line 1277
    :catchall_a
    move-exception v0

    .line 1278
    goto :goto_23

    .line 1279
    :cond_25
    :try_start_15
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1280
    .line 1281
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1282
    .line 1283
    .line 1284
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 1285
    :goto_23
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 1286
    .line 1287
    .line 1288
    throw v0

    .line 1289
    :pswitch_a
    iget-object v1, v0, Lss;->j:Lorg/luckypray/dexkit/DexKitBridge;

    .line 1290
    .line 1291
    iget v2, v0, Lss;->k:I

    .line 1292
    .line 1293
    iget v0, v0, Lss;->l:I

    .line 1294
    .line 1295
    invoke-static {v2, v0}, Lsj;->f(II)J

    .line 1296
    .line 1297
    .line 1298
    move-result-wide v8

    .line 1299
    iget-object v0, v1, Lorg/luckypray/dexkit/DexKitBridge;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 1300
    .line 1301
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v2

    .line 1305
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 1306
    .line 1307
    .line 1308
    :try_start_16
    iget-wide v10, v1, Lorg/luckypray/dexkit/DexKitBridge;->h:J

    .line 1309
    .line 1310
    cmp-long v0, v10, v6

    .line 1311
    .line 1312
    if-eqz v0, :cond_28

    .line 1313
    .line 1314
    invoke-static {v10, v11, v8, v9}, Lorg/luckypray/dexkit/DexKitBridge;->j(JJ)[B

    .line 1315
    .line 1316
    .line 1317
    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    .line 1318
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 1319
    .line 1320
    .line 1321
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v0

    .line 1325
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1326
    .line 1327
    .line 1328
    new-instance v2, La;

    .line 1329
    .line 1330
    invoke-direct {v2}, Lox2;-><init>()V

    .line 1331
    .line 1332
    .line 1333
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1334
    .line 1335
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 1339
    .line 1340
    .line 1341
    move-result v4

    .line 1342
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 1343
    .line 1344
    .line 1345
    move-result v4

    .line 1346
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 1347
    .line 1348
    .line 1349
    move-result v5

    .line 1350
    add-int/2addr v5, v4

    .line 1351
    invoke-virtual {v2, v5, v0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 1352
    .line 1353
    .line 1354
    new-instance v0, Ljava/util/ArrayList;

    .line 1355
    .line 1356
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v2, v3}, Lox2;->b(I)I

    .line 1360
    .line 1361
    .line 1362
    move-result v3

    .line 1363
    if-eqz v3, :cond_26

    .line 1364
    .line 1365
    invoke-virtual {v2, v3}, Lox2;->f(I)I

    .line 1366
    .line 1367
    .line 1368
    move-result v3

    .line 1369
    goto :goto_24

    .line 1370
    :cond_26
    const/4 v3, 0x0

    .line 1371
    :goto_24
    const/4 v4, 0x0

    .line 1372
    :goto_25
    if-ge v4, v3, :cond_27

    .line 1373
    .line 1374
    invoke-virtual {v2, v4}, La;->g(I)Lc;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v5

    .line 1378
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1379
    .line 1380
    .line 1381
    invoke-static {v1, v5}, Lgf1;->t(Lorg/luckypray/dexkit/DexKitBridge;Lc;)Lud;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v5

    .line 1385
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1386
    .line 1387
    .line 1388
    add-int/lit8 v4, v4, 0x1

    .line 1389
    .line 1390
    goto :goto_25

    .line 1391
    :cond_27
    return-object v0

    .line 1392
    :catchall_b
    move-exception v0

    .line 1393
    goto :goto_26

    .line 1394
    :cond_28
    :try_start_17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1395
    .line 1396
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1397
    .line 1398
    .line 1399
    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    .line 1400
    :goto_26
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 1401
    .line 1402
    .line 1403
    throw v0

    .line 1404
    nop

    .line 1405
    :pswitch_data_0
    .packed-switch 0x0
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
