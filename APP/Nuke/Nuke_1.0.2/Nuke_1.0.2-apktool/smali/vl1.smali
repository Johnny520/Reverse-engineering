.class public abstract Lvl1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Let1;

.field public static volatile b:J

.field public static volatile c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldt1;

    .line 2
    .line 3
    invoke-direct {v0}, Ldt1;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-wide/16 v2, 0xa

    .line 12
    .line 13
    invoke-static {v2, v3, v1}, Lwg3;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iput v2, v0, Ldt1;->y:I

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-wide/16 v2, 0x1e

    .line 23
    .line 24
    invoke-static {v2, v3, v1}, Lwg3;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, v0, Ldt1;->z:I

    .line 29
    .line 30
    new-instance v1, Let1;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Let1;-><init>(Ldt1;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Lvl1;->a:Let1;

    .line 36
    .line 37
    return-void
.end method

.method public static a(Lql1;Lmn0;)Lsl1;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "manifest HTTP "

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    new-array v4, v3, [C

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/16 v6, 0x2f

    .line 12
    .line 13
    aput-char v6, v4, v5

    .line 14
    .line 15
    const-string v7, "https://www.guang233.com/"

    .line 16
    .line 17
    invoke-static {v7, v4}, Lpv2;->J0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v7, "/"

    .line 22
    .line 23
    invoke-static {v4, v7}, Lhk1;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    new-instance v7, Lcj;

    .line 28
    .line 29
    const/4 v8, 0x4

    .line 30
    invoke-direct {v7, v8}, Lcj;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const-string v9, "api/client/native/manifest"

    .line 34
    .line 35
    invoke-virtual {v4, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    invoke-virtual {v7, v9}, Lcj;->s(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v9, "GET"

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    invoke-virtual {v7, v9, v10}, Lcj;->n(Ljava/lang/String;Lo82;)V

    .line 46
    .line 47
    .line 48
    sget-object v11, Lvl1;->c:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v11, :cond_0

    .line 51
    .line 52
    const-string v12, "If-None-Match"

    .line 53
    .line 54
    invoke-virtual {v7, v12, v11}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    new-instance v11, Lk82;

    .line 58
    .line 59
    invoke-direct {v11, v7}, Lk82;-><init>(Lcj;)V

    .line 60
    .line 61
    .line 62
    sget-object v7, Lvl1;->a:Let1;

    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v12, Ls52;

    .line 68
    .line 69
    invoke-direct {v12, v7, v11}, Ls52;-><init>(Let1;Lk82;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v12}, Ls52;->h()Lr92;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    :try_start_0
    iget v11, v7, Lr92;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 77
    .line 78
    const/16 v12, 0x130

    .line 79
    .line 80
    if-ne v11, v12, :cond_1

    .line 81
    .line 82
    invoke-virtual {v7}, Lr92;->close()V

    .line 83
    .line 84
    .line 85
    return-object v10

    .line 86
    :cond_1
    :try_start_1
    iget-boolean v12, v7, Lr92;->w:Z

    .line 87
    .line 88
    if-eqz v12, :cond_10

    .line 89
    .line 90
    iget-object v2, v7, Lr92;->n:Lu92;

    .line 91
    .line 92
    invoke-virtual {v2}, Lu92;->c()J

    .line 93
    .line 94
    .line 95
    move-result-wide v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 96
    const-wide/32 v13, 0x10000

    .line 97
    .line 98
    .line 99
    cmp-long v11, v11, v13

    .line 100
    .line 101
    const-string v12, "Native activation manifest is too large"

    .line 102
    .line 103
    if-gtz v11, :cond_f

    .line 104
    .line 105
    :try_start_2
    invoke-virtual {v2}, Lu92;->b()Ljava/io/InputStream;

    .line 106
    .line 107
    .line 108
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 109
    :try_start_3
    new-instance v11, Ljava/io/ByteArrayOutputStream;

    .line 110
    .line 111
    invoke-direct {v11}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 112
    .line 113
    .line 114
    const/16 v15, 0x1000

    .line 115
    .line 116
    new-array v15, v15, [B

    .line 117
    .line 118
    const-wide/16 v16, 0x0

    .line 119
    .line 120
    move/from16 v20, v6

    .line 121
    .line 122
    move-wide/from16 v18, v16

    .line 123
    .line 124
    :goto_0
    invoke-virtual {v2, v15}, Ljava/io/InputStream;->read([B)I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    move-wide/from16 v21, v13

    .line 129
    .line 130
    const/4 v13, -0x1

    .line 131
    if-eq v6, v13, :cond_3

    .line 132
    .line 133
    int-to-long v13, v6

    .line 134
    add-long v18, v18, v13

    .line 135
    .line 136
    cmp-long v13, v18, v21

    .line 137
    .line 138
    if-gtz v13, :cond_2

    .line 139
    .line 140
    invoke-virtual {v11, v15, v5, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 141
    .line 142
    .line 143
    move-wide/from16 v13, v21

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    move-object v1, v0

    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :cond_2
    new-instance v0, Ljava/lang/SecurityException;

    .line 151
    .line 152
    invoke-direct {v0, v12}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_3
    invoke-virtual {v11}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 157
    .line 158
    .line 159
    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 160
    :try_start_4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v6}, Lvl1;->d([B)Lul1;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const-string v6, "ETag"

    .line 171
    .line 172
    iget-object v11, v7, Lr92;->m:Ljs0;

    .line 173
    .line 174
    invoke-virtual {v11, v6}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    if-nez v6, :cond_4

    .line 179
    .line 180
    move-object v6, v10

    .line 181
    :cond_4
    sput-object v6, Lvl1;->c:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 182
    .line 183
    invoke-virtual {v7}, Lr92;->close()V

    .line 184
    .line 185
    .line 186
    iget-object v6, v2, Lul1;->a:Ltl1;

    .line 187
    .line 188
    iget-wide v11, v6, Ltl1;->a:J

    .line 189
    .line 190
    iget-wide v13, v0, Lql1;->g:J

    .line 191
    .line 192
    cmp-long v7, v11, v13

    .line 193
    .line 194
    if-ltz v7, :cond_e

    .line 195
    .line 196
    if-nez v7, :cond_6

    .line 197
    .line 198
    iget-object v1, v6, Ltl1;->b:Ljava/lang/String;

    .line 199
    .line 200
    iget-object v2, v0, Lql1;->d:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_5

    .line 207
    .line 208
    iget-wide v1, v6, Ltl1;->h:J

    .line 209
    .line 210
    iget-wide v3, v0, Lql1;->e:J

    .line 211
    .line 212
    cmp-long v0, v1, v3

    .line 213
    .line 214
    if-nez v0, :cond_5

    .line 215
    .line 216
    return-object v10

    .line 217
    :cond_5
    const-string v0, "Native activation sequence is inconsistent"

    .line 218
    .line 219
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return-object v10

    .line 223
    :cond_6
    iget v0, v6, Ltl1;->j:I

    .line 224
    .line 225
    if-ne v0, v3, :cond_d

    .line 226
    .line 227
    iget v0, v6, Ltl1;->k:I

    .line 228
    .line 229
    if-gt v0, v3, :cond_d

    .line 230
    .line 231
    iget-object v0, v6, Ltl1;->b:Ljava/lang/String;

    .line 232
    .line 233
    const-string v7, "/api/client/native/releases/"

    .line 234
    .line 235
    const-string v11, "/package"

    .line 236
    .line 237
    invoke-static {v7, v0, v11}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    iget-object v7, v6, Ltl1;->c:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    if-eqz v7, :cond_c

    .line 248
    .line 249
    new-instance v7, Lcj;

    .line 250
    .line 251
    invoke-direct {v7, v8}, Lcj;-><init>(I)V

    .line 252
    .line 253
    .line 254
    new-array v3, v3, [C

    .line 255
    .line 256
    aput-char v20, v3, v5

    .line 257
    .line 258
    invoke-static {v4, v3}, Lpv2;->J0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    new-instance v4, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {v7, v0}, Lcj;->s(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7, v9, v10}, Lcj;->n(Ljava/lang/String;Lo82;)V

    .line 281
    .line 282
    .line 283
    new-instance v0, Lk82;

    .line 284
    .line 285
    invoke-direct {v0, v7}, Lk82;-><init>(Lcj;)V

    .line 286
    .line 287
    .line 288
    sget-object v3, Lvl1;->a:Let1;

    .line 289
    .line 290
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    new-instance v4, Ls52;

    .line 294
    .line 295
    invoke-direct {v4, v3, v0}, Ls52;-><init>(Let1;Lk82;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4}, Ls52;->h()Lr92;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    :try_start_5
    iget-boolean v0, v3, Lr92;->w:Z

    .line 303
    .line 304
    if-eqz v0, :cond_b

    .line 305
    .line 306
    iget-object v0, v3, Lr92;->n:Lu92;

    .line 307
    .line 308
    invoke-virtual {v0}, Lu92;->c()J

    .line 309
    .line 310
    .line 311
    move-result-wide v4

    .line 312
    cmp-long v4, v4, v16

    .line 313
    .line 314
    if-ltz v4, :cond_8

    .line 315
    .line 316
    invoke-virtual {v0}, Lu92;->c()J

    .line 317
    .line 318
    .line 319
    move-result-wide v4

    .line 320
    iget-wide v7, v6, Ltl1;->e:J

    .line 321
    .line 322
    cmp-long v4, v4, v7

    .line 323
    .line 324
    if-nez v4, :cond_7

    .line 325
    .line 326
    goto :goto_1

    .line 327
    :cond_7
    new-instance v0, Ljava/lang/SecurityException;

    .line 328
    .line 329
    const-string v1, "Native release package length header mismatch"

    .line 330
    .line 331
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw v0

    .line 335
    :catchall_1
    move-exception v0

    .line 336
    move-object v1, v0

    .line 337
    goto/16 :goto_5

    .line 338
    .line 339
    :cond_8
    :goto_1
    invoke-virtual {v0}, Lu92;->b()Ljava/io/InputStream;

    .line 340
    .line 341
    .line 342
    move-result-object v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 343
    iget-object v8, v6, Ltl1;->b:Ljava/lang/String;

    .line 344
    .line 345
    iget-wide v9, v6, Ltl1;->e:J

    .line 346
    .line 347
    if-nez v1, :cond_9

    .line 348
    .line 349
    :try_start_6
    iget-object v11, v6, Ltl1;->d:Ljava/lang/String;

    .line 350
    .line 351
    const/4 v12, 0x0

    .line 352
    invoke-static/range {v7 .. v12}, Ls11;->m0(Ljava/io/InputStream;Ljava/lang/String;JLjava/lang/String;Lrl1;)Ljava/io/File;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    :goto_2
    move-object v1, v0

    .line 357
    goto :goto_3

    .line 358
    :cond_9
    iget-object v11, v6, Ltl1;->d:Ljava/lang/String;

    .line 359
    .line 360
    new-instance v12, Lrl1;

    .line 361
    .line 362
    invoke-direct {v12, v1}, Lrl1;-><init>(Lmn0;)V

    .line 363
    .line 364
    .line 365
    invoke-static/range {v7 .. v12}, Ls11;->m0(Ljava/io/InputStream;Ljava/lang/String;JLjava/lang/String;Lrl1;)Ljava/io/File;

    .line 366
    .line 367
    .line 368
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 369
    goto :goto_2

    .line 370
    :goto_3
    invoke-virtual {v3}, Lr92;->close()V

    .line 371
    .line 372
    .line 373
    :try_start_7
    iget-object v0, v2, Lul1;->c:[B

    .line 374
    .line 375
    iget-wide v3, v6, Ltl1;->a:J

    .line 376
    .line 377
    invoke-static {v1, v0, v3, v4}, Ls11;->k0(Ljava/io/File;[BJ)Lql1;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    iget-object v3, v0, Lql1;->d:Ljava/lang/String;

    .line 382
    .line 383
    iget-object v4, v6, Ltl1;->b:Ljava/lang/String;

    .line 384
    .line 385
    invoke-static {v3, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    if-eqz v3, :cond_a

    .line 390
    .line 391
    iget-wide v3, v0, Lql1;->e:J

    .line 392
    .line 393
    iget-wide v7, v6, Ltl1;->h:J

    .line 394
    .line 395
    cmp-long v3, v3, v7

    .line 396
    .line 397
    if-nez v3, :cond_a

    .line 398
    .line 399
    iget-object v3, v0, Lql1;->f:Ljava/lang/String;

    .line 400
    .line 401
    iget-object v4, v6, Ltl1;->i:Ljava/lang/String;

    .line 402
    .line 403
    invoke-static {v3, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    if-eqz v3, :cond_a

    .line 408
    .line 409
    iget-object v3, v0, Lql1;->i:Ljava/lang/String;

    .line 410
    .line 411
    iget-object v4, v6, Ltl1;->d:Ljava/lang/String;

    .line 412
    .line 413
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    if-eqz v3, :cond_a

    .line 418
    .line 419
    iget-wide v3, v0, Lql1;->j:J

    .line 420
    .line 421
    iget-wide v7, v6, Ltl1;->e:J

    .line 422
    .line 423
    cmp-long v3, v3, v7

    .line 424
    .line 425
    if-nez v3, :cond_a

    .line 426
    .line 427
    iget-object v3, v0, Lql1;->k:Ljava/lang/String;

    .line 428
    .line 429
    iget-object v4, v6, Ltl1;->f:Ljava/lang/String;

    .line 430
    .line 431
    invoke-static {v3, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-eqz v3, :cond_a

    .line 436
    .line 437
    iget-wide v3, v0, Lql1;->l:J

    .line 438
    .line 439
    iget-wide v5, v6, Ltl1;->g:J

    .line 440
    .line 441
    cmp-long v3, v3, v5

    .line 442
    .line 443
    if-nez v3, :cond_a

    .line 444
    .line 445
    new-instance v3, Lsl1;

    .line 446
    .line 447
    iget-object v2, v2, Lul1;->b:[B

    .line 448
    .line 449
    invoke-direct {v3, v0, v2}, Lsl1;-><init>(Lql1;[B)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 453
    .line 454
    .line 455
    return-object v3

    .line 456
    :catchall_2
    move-exception v0

    .line 457
    goto :goto_4

    .line 458
    :cond_a
    :try_start_8
    new-instance v0, Ljava/lang/SecurityException;

    .line 459
    .line 460
    const-string v2, "Native package does not match activation manifest"

    .line 461
    .line 462
    invoke-direct {v0, v2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 466
    :goto_4
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 467
    .line 468
    .line 469
    throw v0

    .line 470
    :cond_b
    :try_start_9
    new-instance v0, Ljava/io/IOException;

    .line 471
    .line 472
    iget v1, v3, Lr92;->k:I

    .line 473
    .line 474
    new-instance v2, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 477
    .line 478
    .line 479
    const-string v4, "package HTTP "

    .line 480
    .line 481
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 495
    :goto_5
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 496
    :catchall_3
    move-exception v0

    .line 497
    invoke-static {v3, v1}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 498
    .line 499
    .line 500
    throw v0

    .line 501
    :cond_c
    const-string v0, "Native release package URL is invalid"

    .line 502
    .line 503
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    return-object v10

    .line 507
    :cond_d
    const-string v0, "Native release requires a newer Bridge"

    .line 508
    .line 509
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    return-object v10

    .line 513
    :cond_e
    const-string v0, "Native activation sequence was replayed"

    .line 514
    .line 515
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    return-object v10

    .line 519
    :catchall_4
    move-exception v0

    .line 520
    move-object v1, v0

    .line 521
    goto :goto_7

    .line 522
    :goto_6
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 523
    :catchall_5
    move-exception v0

    .line 524
    :try_start_c
    invoke-static {v2, v1}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 525
    .line 526
    .line 527
    throw v0

    .line 528
    :cond_f
    new-instance v0, Ljava/lang/SecurityException;

    .line 529
    .line 530
    invoke-direct {v0, v12}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    throw v0

    .line 534
    :cond_10
    new-instance v0, Ljava/io/IOException;

    .line 535
    .line 536
    new-instance v1, Ljava/lang/StringBuilder;

    .line 537
    .line 538
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 552
    :goto_7
    :try_start_d
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 553
    :catchall_6
    move-exception v0

    .line 554
    invoke-static {v7, v1}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 555
    .line 556
    .line 557
    throw v0
.end method

.method public static b(Lql1;)[B
    .locals 7

    .line 1
    iget-object v0, p0, Lql1;->h:Ljava/io/File;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmp-long v2, v2, v4

    .line 19
    .line 20
    if-lez v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    const-wide/32 v4, 0x10000

    .line 27
    .line 28
    .line 29
    cmp-long v2, v2, v4

    .line 30
    .line 31
    if-gtz v2, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Lwi0;->e0(Ljava/io/File;)[B

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lvl1;->d([B)Lul1;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v2, v0, Lul1;->a:Ltl1;

    .line 42
    .line 43
    iget-wide v3, v2, Ltl1;->a:J

    .line 44
    .line 45
    iget-wide v5, p0, Lql1;->g:J

    .line 46
    .line 47
    cmp-long v3, v3, v5

    .line 48
    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    iget-object v3, v2, Ltl1;->b:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v4, p0, Lql1;->d:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    iget-wide v3, v2, Ltl1;->h:J

    .line 62
    .line 63
    iget-wide v5, p0, Lql1;->e:J

    .line 64
    .line 65
    cmp-long v3, v3, v5

    .line 66
    .line 67
    if-nez v3, :cond_0

    .line 68
    .line 69
    iget-object v3, v2, Ltl1;->i:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v4, p0, Lql1;->f:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_0

    .line 78
    .line 79
    iget-object v3, v2, Ltl1;->d:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v4, p0, Lql1;->i:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_0

    .line 88
    .line 89
    iget-wide v3, v2, Ltl1;->e:J

    .line 90
    .line 91
    iget-wide v5, p0, Lql1;->j:J

    .line 92
    .line 93
    cmp-long v3, v3, v5

    .line 94
    .line 95
    if-nez v3, :cond_0

    .line 96
    .line 97
    iget-object v3, v2, Ltl1;->f:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v4, p0, Lql1;->k:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_0

    .line 106
    .line 107
    iget-wide v2, v2, Ltl1;->g:J

    .line 108
    .line 109
    iget-wide v4, p0, Lql1;->l:J

    .line 110
    .line 111
    cmp-long p0, v2, v4

    .line 112
    .line 113
    if-nez p0, :cond_0

    .line 114
    .line 115
    iget-object p0, v0, Lul1;->b:[B

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_0
    const-string p0, "Stored Native activation proof does not match release"

    .line 119
    .line 120
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-object v1

    .line 124
    :cond_1
    const-string p0, "Native activation proof is invalid"

    .line 125
    .line 126
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_2
    const-string p0, "Native activation proof is missing"

    .line 131
    .line 132
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v1
.end method

.method public static c(Lorg/json/JSONObject;Ljava/util/Set;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const-string p0, "Native activation JSON shape is invalid"

    .line 32
    .line 33
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static d([B)Lul1;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "Native activation base64 is invalid"

    .line 4
    .line 5
    new-instance v2, Lorg/json/JSONObject;

    .line 6
    .line 7
    new-instance v3, Ljava/lang/String;

    .line 8
    .line 9
    sget-object v4, Lwq;->a:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    invoke-direct {v3, v0, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "v"

    .line 18
    .line 19
    const-string v5, "payload"

    .line 20
    .line 21
    const-string v6, "signature"

    .line 22
    .line 23
    filled-new-array {v3, v5, v6}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    invoke-static {v7}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v2, v7}, Lvl1;->c(Lorg/json/JSONObject;Ljava/util/Set;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x1

    .line 40
    if-ne v7, v9, :cond_3

    .line 41
    .line 42
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    :try_start_0
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v7, v5}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    :try_start_1
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v6, v2}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2

    .line 76
    .line 77
    .line 78
    array-length v1, v5

    .line 79
    const-string v6, "Native activation signature mismatch"

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    array-length v1, v5

    .line 84
    int-to-long v10, v1

    .line 85
    const-wide/32 v12, 0x10000

    .line 86
    .line 87
    .line 88
    cmp-long v1, v10, v12

    .line 89
    .line 90
    if-gtz v1, :cond_2

    .line 91
    .line 92
    array-length v1, v2

    .line 93
    const/16 v7, 0x40

    .line 94
    .line 95
    if-ne v1, v7, :cond_2

    .line 96
    .line 97
    sget-object v1, Lnuke/data/cipher/NativeCrypto;->INSTANCE:Lnuke/data/cipher/NativeCrypto;

    .line 98
    .line 99
    invoke-virtual {v1, v5, v2}, Lnuke/data/cipher/NativeCrypto;->prepareActivationDirect$app([B[B)[B

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-eqz v1, :cond_1

    .line 104
    .line 105
    new-instance v2, Lorg/json/JSONObject;

    .line 106
    .line 107
    new-instance v6, Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {v6, v5, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {v2, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const-string v22, "minAppVersionCode"

    .line 116
    .line 117
    const-string v23, "publishedAt"

    .line 118
    .line 119
    const-string v10, "v"

    .line 120
    .line 121
    const-string v11, "sequence"

    .line 122
    .line 123
    const-string v12, "releaseId"

    .line 124
    .line 125
    const-string v13, "packageUrl"

    .line 126
    .line 127
    const-string v14, "packageSha256"

    .line 128
    .line 129
    const-string v15, "packageLength"

    .line 130
    .line 131
    const-string v16, "engineSha256"

    .line 132
    .line 133
    const-string v17, "engineLength"

    .line 134
    .line 135
    const-string v18, "generation"

    .line 136
    .line 137
    const-string v19, "kid"

    .line 138
    .line 139
    const-string v20, "engineAbi"

    .line 140
    .line 141
    const-string v21, "minBridgeAbi"

    .line 142
    .line 143
    filled-new-array/range {v10 .. v23}, [Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v4}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-static {v2, v4}, Lvl1;->c(Lorg/json/JSONObject;Ljava/util/Set;)V

    .line 152
    .line 153
    .line 154
    new-instance v10, Ltl1;

    .line 155
    .line 156
    const-string v4, "sequence"

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v11

    .line 162
    const-string v4, "releaseId"

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    const-string v4, "packageUrl"

    .line 172
    .line 173
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    const-string v4, "packageSha256"

    .line 181
    .line 182
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 190
    .line 191
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v15

    .line 195
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    const-string v4, "packageLength"

    .line 199
    .line 200
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 201
    .line 202
    .line 203
    move-result-wide v16

    .line 204
    const-string v4, "engineSha256"

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v18

    .line 217
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    const-string v4, "engineLength"

    .line 221
    .line 222
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 223
    .line 224
    .line 225
    move-result-wide v19

    .line 226
    const-string v4, "generation"

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 229
    .line 230
    .line 231
    move-result-wide v21

    .line 232
    const-string v4, "kid"

    .line 233
    .line 234
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v23

    .line 245
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    const-string v4, "engineAbi"

    .line 249
    .line 250
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    move-result v24

    .line 254
    const-string v4, "minBridgeAbi"

    .line 255
    .line 256
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 257
    .line 258
    .line 259
    move-result v25

    .line 260
    const-string v4, "minAppVersionCode"

    .line 261
    .line 262
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    move-result v26

    .line 266
    invoke-direct/range {v10 .. v26}, Ltl1;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;III)V

    .line 267
    .line 268
    .line 269
    :try_start_2
    const-string v4, "publishedAt"

    .line 270
    .line 271
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-static {v4}, Ljava/time/Instant;->parse(Ljava/lang/CharSequence;)Ljava/time/Instant;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-ne v2, v9, :cond_0

    .line 283
    .line 284
    const-wide/16 v2, 0x0

    .line 285
    .line 286
    cmp-long v4, v11, v2

    .line 287
    .line 288
    if-lez v4, :cond_0

    .line 289
    .line 290
    cmp-long v4, v21, v2

    .line 291
    .line 292
    if-lez v4, :cond_0

    .line 293
    .line 294
    :try_start_3
    invoke-static {v13}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-virtual {v13, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-static {v4, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v4
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    .line 313
    goto :goto_0

    .line 314
    :catch_0
    const/4 v4, 0x0

    .line 315
    :goto_0
    if-eqz v4, :cond_0

    .line 316
    .line 317
    const-string v4, "[0-9a-f]{64}"

    .line 318
    .line 319
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    iget-object v6, v10, Ltl1;->d:Ljava/lang/String;

    .line 327
    .line 328
    invoke-virtual {v5, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eqz v5, :cond_0

    .line 337
    .line 338
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    iget-object v5, v10, Ltl1;->f:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    if-eqz v4, :cond_0

    .line 356
    .line 357
    const-string v4, "[0-9a-f]{8}"

    .line 358
    .line 359
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    iget-object v5, v10, Ltl1;->i:Ljava/lang/String;

    .line 367
    .line 368
    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    if-eqz v4, :cond_0

    .line 377
    .line 378
    iget-wide v4, v10, Ltl1;->e:J

    .line 379
    .line 380
    cmp-long v6, v4, v2

    .line 381
    .line 382
    if-lez v6, :cond_0

    .line 383
    .line 384
    const-wide/32 v6, 0x4000000

    .line 385
    .line 386
    .line 387
    cmp-long v4, v4, v6

    .line 388
    .line 389
    if-gtz v4, :cond_0

    .line 390
    .line 391
    iget-wide v4, v10, Ltl1;->g:J

    .line 392
    .line 393
    cmp-long v2, v4, v2

    .line 394
    .line 395
    if-lez v2, :cond_0

    .line 396
    .line 397
    cmp-long v2, v4, v6

    .line 398
    .line 399
    if-gtz v2, :cond_0

    .line 400
    .line 401
    new-instance v2, Lul1;

    .line 402
    .line 403
    array-length v3, v0

    .line 404
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-direct {v2, v10, v1, v0}, Lul1;-><init>(Ltl1;[B[B)V

    .line 409
    .line 410
    .line 411
    return-object v2

    .line 412
    :cond_0
    const-string v0, "Native activation manifest fields are invalid"

    .line 413
    .line 414
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    return-object v8

    .line 418
    :catch_1
    move-exception v0

    .line 419
    new-instance v1, Ljava/lang/SecurityException;

    .line 420
    .line 421
    const-string v2, "Native activation publish time is invalid"

    .line 422
    .line 423
    invoke-direct {v1, v2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 424
    .line 425
    .line 426
    throw v1

    .line 427
    :cond_1
    invoke-static {v6}, Lc80;->x(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    return-object v8

    .line 431
    :cond_2
    invoke-static {v6}, Lc80;->x(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    return-object v8

    .line 435
    :catch_2
    move-exception v0

    .line 436
    new-instance v2, Ljava/lang/SecurityException;

    .line 437
    .line 438
    invoke-direct {v2, v1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 439
    .line 440
    .line 441
    throw v2

    .line 442
    :catch_3
    move-exception v0

    .line 443
    new-instance v2, Ljava/lang/SecurityException;

    .line 444
    .line 445
    invoke-direct {v2, v1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    throw v2

    .line 449
    :cond_3
    const-string v0, "Native activation envelope version is unsupported"

    .line 450
    .line 451
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-object v8
.end method
