.class public final Lhe2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lug;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lv20;


# direct methods
.method public synthetic constructor <init>(Lv20;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhe2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lhe2;->b:Lv20;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lhe2;->a:I

    .line 6
    .line 7
    const-string v3, "data"

    .line 8
    .line 9
    iget-object v4, v0, Lhe2;->b:Lv20;

    .line 10
    .line 11
    const-string v5, "additionalData"

    .line 12
    .line 13
    const-string v6, "iv"

    .line 14
    .line 15
    const-string v7, "salt"

    .line 16
    .line 17
    const/4 v8, 0x5

    .line 18
    const-string v9, "key"

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const-string v11, "algorithm"

    .line 22
    .line 23
    const/4 v12, 0x4

    .line 24
    const/4 v13, 0x3

    .line 25
    const/4 v14, 0x2

    .line 26
    const/4 v15, 0x1

    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    packed-switch v2, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Lhe2;->b:Lv20;

    .line 33
    .line 34
    :try_start_0
    invoke-static {v8, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    aget-object v2, v1, v16

    .line 38
    .line 39
    const-string v3, "keyMaterial"

    .line 40
    .line 41
    invoke-static {v3, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 42
    .line 43
    .line 44
    move-result-object v18

    .line 45
    aget-object v2, v1, v15

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-static {v7, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    move-object/from16 v19, v2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-object/from16 v19, v10

    .line 57
    .line 58
    :goto_0
    aget-object v2, v1, v14

    .line 59
    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    const-string v3, "info"

    .line 63
    .line 64
    invoke-static {v3, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    :cond_1
    move-object/from16 v20, v10

    .line 69
    .line 70
    aget-object v2, v1, v13

    .line 71
    .line 72
    const-string v3, "length"

    .line 73
    .line 74
    const-wide/16 v4, 0x1

    .line 75
    .line 76
    const-wide/32 v6, 0x7fffffff

    .line 77
    .line 78
    .line 79
    invoke-static/range {v2 .. v7}, Lsp0;->d0(Ljava/lang/Object;Ljava/lang/String;JJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    long-to-int v2, v2

    .line 84
    aget-object v1, v1, v12

    .line 85
    .line 86
    invoke-static {v11, v1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v22

    .line 90
    move-object/from16 v17, v0

    .line 91
    .line 92
    move/from16 v21, v2

    .line 93
    .line 94
    invoke-virtual/range {v17 .. v22}, Lv20;->c([B[B[BILjava/lang/String;)[B

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    array-length v1, v0

    .line 99
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, Lkotlin/UByteArray;

    .line 104
    .line 105
    invoke-direct {v1, v0}, Lkotlin/UByteArray;-><init>([B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 109
    .line 110
    .line 111
    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_1
    return-object v0

    .line 119
    :catch_0
    move-exception v0

    .line 120
    throw v0

    .line 121
    :pswitch_0
    iget-object v0, v0, Lhe2;->b:Lv20;

    .line 122
    .line 123
    :try_start_1
    invoke-static {v8, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    aget-object v2, v1, v16

    .line 127
    .line 128
    const-string v3, "password"

    .line 129
    .line 130
    invoke-static {v3, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    aget-object v3, v1, v15

    .line 135
    .line 136
    invoke-static {v7, v3}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    aget-object v4, v1, v14

    .line 141
    .line 142
    const-string v5, "iterations"

    .line 143
    .line 144
    const-wide/16 v6, 0x1

    .line 145
    .line 146
    const-wide/32 v8, 0x7fffffff

    .line 147
    .line 148
    .line 149
    invoke-static/range {v4 .. v9}, Lsp0;->d0(Ljava/lang/Object;Ljava/lang/String;JJ)J

    .line 150
    .line 151
    .line 152
    move-result-wide v4

    .line 153
    long-to-int v4, v4

    .line 154
    aget-object v5, v1, v13

    .line 155
    .line 156
    const-string v6, "length"

    .line 157
    .line 158
    const-wide/16 v7, 0x1

    .line 159
    .line 160
    const-wide/32 v9, 0x7fffffff

    .line 161
    .line 162
    .line 163
    invoke-static/range {v5 .. v10}, Lsp0;->d0(Ljava/lang/Object;Ljava/lang/String;JJ)J

    .line 164
    .line 165
    .line 166
    move-result-wide v5

    .line 167
    long-to-int v5, v5

    .line 168
    aget-object v1, v1, v12

    .line 169
    .line 170
    invoke-static {v11, v1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    move-object v1, v0

    .line 175
    invoke-virtual/range {v1 .. v6}, Lv20;->f([B[BIILjava/lang/String;)[B

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    array-length v1, v0

    .line 180
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    new-instance v1, Lkotlin/UByteArray;

    .line 185
    .line 186
    invoke-direct {v1, v0}, Lkotlin/UByteArray;-><init>([B)V

    .line 187
    .line 188
    .line 189
    invoke-static {v1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 190
    .line 191
    .line 192
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 193
    goto :goto_2

    .line 194
    :catchall_1
    move-exception v0

    .line 195
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    :goto_2
    return-object v0

    .line 200
    :catch_1
    move-exception v0

    .line 201
    throw v0

    .line 202
    :pswitch_1
    iget-object v0, v0, Lhe2;->b:Lv20;

    .line 203
    .line 204
    :try_start_2
    invoke-static {v12, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    aget-object v2, v1, v16

    .line 208
    .line 209
    invoke-static {v9, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    aget-object v2, v1, v15

    .line 214
    .line 215
    invoke-static {v6, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    aget-object v2, v1, v14

    .line 220
    .line 221
    const-string v6, "ciphertext"

    .line 222
    .line 223
    invoke-static {v6, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    aget-object v1, v1, v13

    .line 228
    .line 229
    if-eqz v1, :cond_2

    .line 230
    .line 231
    invoke-static {v5, v1}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 232
    .line 233
    .line 234
    move-result-object v10
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 235
    :cond_2
    move-object v5, v2

    .line 236
    move-object v6, v10

    .line 237
    const/4 v2, 0x2

    .line 238
    move-object v1, v0

    .line 239
    :try_start_3
    invoke-virtual/range {v1 .. v6}, Lv20;->a(I[B[B[B[B)[B

    .line 240
    .line 241
    .line 242
    move-result-object v0
    :try_end_3
    .catch Lsd2; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 243
    :try_start_4
    array-length v1, v0

    .line 244
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    new-instance v1, Lkotlin/UByteArray;

    .line 249
    .line 250
    invoke-direct {v1, v0}, Lkotlin/UByteArray;-><init>([B)V

    .line 251
    .line 252
    .line 253
    invoke-static {v1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    goto :goto_3

    .line 258
    :catchall_2
    move-exception v0

    .line 259
    move-object v6, v0

    .line 260
    new-instance v1, Lsd2;

    .line 261
    .line 262
    const-string v2, "AUTHENTICATION_FAILED"

    .line 263
    .line 264
    const-string v3, "AES-GCM authentication failed."

    .line 265
    .line 266
    const/4 v5, 0x0

    .line 267
    const/16 v7, 0xc

    .line 268
    .line 269
    const/4 v4, 0x0

    .line 270
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 271
    .line 272
    .line 273
    throw v1

    .line 274
    :catch_2
    move-exception v0

    .line 275
    throw v0
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 276
    :catchall_3
    move-exception v0

    .line 277
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    :goto_3
    return-object v0

    .line 282
    :catch_3
    move-exception v0

    .line 283
    throw v0

    .line 284
    :pswitch_2
    iget-object v0, v0, Lhe2;->b:Lv20;

    .line 285
    .line 286
    :try_start_5
    invoke-static {v12, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    aget-object v2, v1, v16

    .line 290
    .line 291
    invoke-static {v9, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    aget-object v2, v1, v15

    .line 296
    .line 297
    invoke-static {v6, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    aget-object v2, v1, v14

    .line 302
    .line 303
    const-string v6, "plaintext"

    .line 304
    .line 305
    invoke-static {v6, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    aget-object v1, v1, v13

    .line 310
    .line 311
    if-eqz v1, :cond_3

    .line 312
    .line 313
    invoke-static {v5, v1}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    :cond_3
    move-object v5, v2

    .line 318
    move-object v6, v10

    .line 319
    const/4 v2, 0x1

    .line 320
    move-object v1, v0

    .line 321
    invoke-virtual/range {v1 .. v6}, Lv20;->a(I[B[B[B[B)[B

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    array-length v1, v0

    .line 326
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    new-instance v1, Lkotlin/UByteArray;

    .line 331
    .line 332
    invoke-direct {v1, v0}, Lkotlin/UByteArray;-><init>([B)V

    .line 333
    .line 334
    .line 335
    invoke-static {v1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 336
    .line 337
    .line 338
    move-result-object v0
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 339
    goto :goto_4

    .line 340
    :catchall_4
    move-exception v0

    .line 341
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    :goto_4
    return-object v0

    .line 346
    :catch_4
    move-exception v0

    .line 347
    throw v0

    .line 348
    :pswitch_3
    :try_start_6
    invoke-static {v13, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    aget-object v0, v1, v16

    .line 352
    .line 353
    invoke-static {v11, v0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    aget-object v2, v1, v15

    .line 358
    .line 359
    invoke-static {v9, v2}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    aget-object v1, v1, v14

    .line 364
    .line 365
    invoke-static {v3, v1}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-virtual {v4, v0, v2, v1}, Lv20;->d(Ljava/lang/String;[B[B)[B

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    array-length v1, v0

    .line 374
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    new-instance v1, Lkotlin/UByteArray;

    .line 379
    .line 380
    invoke-direct {v1, v0}, Lkotlin/UByteArray;-><init>([B)V

    .line 381
    .line 382
    .line 383
    invoke-static {v1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 384
    .line 385
    .line 386
    move-result-object v0
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 387
    goto :goto_5

    .line 388
    :catchall_5
    move-exception v0

    .line 389
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    :goto_5
    return-object v0

    .line 394
    :catch_5
    move-exception v0

    .line 395
    throw v0

    .line 396
    :pswitch_4
    :try_start_7
    invoke-static {v14, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    aget-object v0, v1, v16

    .line 400
    .line 401
    invoke-static {v11, v0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    aget-object v1, v1, v15

    .line 406
    .line 407
    invoke-static {v3, v1}, Lsp0;->Y(Ljava/lang/String;Ljava/lang/Object;)[B

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    array-length v2, v1

    .line 412
    int-to-long v2, v2

    .line 413
    invoke-virtual {v4, v2, v3}, Lv20;->h(J)V

    .line 414
    .line 415
    .line 416
    invoke-static {v0}, Lv20;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    array-length v1, v0

    .line 432
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    new-instance v1, Lkotlin/UByteArray;

    .line 437
    .line 438
    invoke-direct {v1, v0}, Lkotlin/UByteArray;-><init>([B)V

    .line 439
    .line 440
    .line 441
    invoke-static {v1}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 442
    .line 443
    .line 444
    move-result-object v0
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 445
    goto :goto_6

    .line 446
    :catchall_6
    move-exception v0

    .line 447
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    :goto_6
    return-object v0

    .line 452
    :catch_6
    move-exception v0

    .line 453
    throw v0

    .line 454
    nop

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
