.class public final L۟/nb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static ۥ()Ljava/util/List;
    .locals 11

    .line 1
    sget-object v0, L۟/k8;->ۥۣ۟:L۟/k;

    .line 2
    .line 3
    iget-object v0, v0, L۟/k;->ۥۦۧ:Ljava/lang/String;

    .line 4
    .line 5
    const/16 v1, 0x11

    .line 6
    .line 7
    new-array v1, v1, [B

    .line 8
    .line 9
    fill-array-data v1, :array_0

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    new-array v3, v2, [B

    .line 14
    .line 15
    fill-array-data v3, :array_1

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, L۟/k8;->ۥۣ۟:L۟/k;

    .line 26
    .line 27
    iget-object v1, v1, L۟/k;->ۥۦۨ:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0, v1}, L۟/r3;->ۥ۠(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    sget-object v3, L۟/k8;->ۥۣ۟:L۟/k;

    .line 37
    .line 38
    iget-object v3, v3, L۟/k;->ۥۧ:Ljava/lang/String;

    .line 39
    .line 40
    new-array v4, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {v0, v3, v4}, L۟/r3;->ۥ(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v0, 0x0

    .line 48
    :goto_0
    const-string v3, ""

    .line 49
    .line 50
    filled-new-array {v3, v3, v3}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v4}, L۟/jb;->ۥ۟ۨ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const/16 v5, 0x8

    .line 59
    .line 60
    const/4 v6, 0x1

    .line 61
    const/4 v7, 0x2

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    new-array v8, v5, [B

    .line 65
    .line 66
    fill-array-data v8, :array_2

    .line 67
    .line 68
    .line 69
    new-array v9, v2, [B

    .line 70
    .line 71
    fill-array-data v9, :array_3

    .line 72
    .line 73
    .line 74
    invoke-static {v8, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-static {v0, v8}, L۟/r3;->ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    check-cast v8, Ljava/lang/String;

    .line 83
    .line 84
    if-nez v8, :cond_1

    .line 85
    .line 86
    move-object v8, v3

    .line 87
    :cond_1
    invoke-interface {v4, v1, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    new-array v8, v2, [B

    .line 91
    .line 92
    fill-array-data v8, :array_4

    .line 93
    .line 94
    .line 95
    new-array v9, v2, [B

    .line 96
    .line 97
    fill-array-data v9, :array_5

    .line 98
    .line 99
    .line 100
    invoke-static {v8, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-static {v0, v8}, L۟/r3;->ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, Ljava/lang/String;

    .line 109
    .line 110
    if-nez v8, :cond_2

    .line 111
    .line 112
    move-object v8, v3

    .line 113
    :cond_2
    invoke-interface {v4, v6, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    const/4 v8, 0x5

    .line 117
    new-array v8, v8, [B

    .line 118
    .line 119
    fill-array-data v8, :array_6

    .line 120
    .line 121
    .line 122
    new-array v9, v2, [B

    .line 123
    .line 124
    fill-array-data v9, :array_7

    .line 125
    .line 126
    .line 127
    invoke-static {v8, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v0, v8}, L۟/r3;->ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ljava/lang/String;

    .line 136
    .line 137
    if-nez v0, :cond_3

    .line 138
    .line 139
    move-object v0, v3

    .line 140
    :cond_3
    invoke-interface {v4, v7, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_4
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Ljava/lang/CharSequence;

    .line 148
    .line 149
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_5

    .line 154
    .line 155
    move v0, v6

    .line 156
    goto :goto_1

    .line 157
    :cond_5
    move v0, v1

    .line 158
    :goto_1
    if-eqz v0, :cond_6

    .line 159
    .line 160
    sget-object v0, L۟/n8;->ۥ:L۟/n8;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-static {}, L۟/n8;->ۥ۟()Lorg/json/JSONObject;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    if-eqz v0, :cond_6

    .line 170
    .line 171
    new-array v5, v5, [B

    .line 172
    .line 173
    fill-array-data v5, :array_8

    .line 174
    .line 175
    .line 176
    new-array v8, v2, [B

    .line 177
    .line 178
    fill-array-data v8, :array_9

    .line 179
    .line 180
    .line 181
    invoke-static {v5, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    const/16 v8, 0xe

    .line 190
    .line 191
    new-array v9, v8, [B

    .line 192
    .line 193
    fill-array-data v9, :array_a

    .line 194
    .line 195
    .line 196
    new-array v10, v2, [B

    .line 197
    .line 198
    fill-array-data v10, :array_b

    .line 199
    .line 200
    .line 201
    invoke-static {v9, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    invoke-static {v9, v5}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v4, v1, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    new-array v5, v2, [B

    .line 212
    .line 213
    fill-array-data v5, :array_c

    .line 214
    .line 215
    .line 216
    new-array v9, v2, [B

    .line 217
    .line 218
    fill-array-data v9, :array_d

    .line 219
    .line 220
    .line 221
    invoke-static {v5, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    new-array v9, v8, [B

    .line 230
    .line 231
    fill-array-data v9, :array_e

    .line 232
    .line 233
    .line 234
    new-array v10, v2, [B

    .line 235
    .line 236
    fill-array-data v10, :array_f

    .line 237
    .line 238
    .line 239
    invoke-static {v9, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    invoke-static {v9, v5}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-interface {v4, v6, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    new-array v5, v2, [B

    .line 250
    .line 251
    fill-array-data v5, :array_10

    .line 252
    .line 253
    .line 254
    new-array v9, v2, [B

    .line 255
    .line 256
    fill-array-data v9, :array_11

    .line 257
    .line 258
    .line 259
    invoke-static {v5, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    new-array v5, v8, [B

    .line 268
    .line 269
    fill-array-data v5, :array_12

    .line 270
    .line 271
    .line 272
    new-array v2, v2, [B

    .line 273
    .line 274
    fill-array-data v2, :array_13

    .line 275
    .line 276
    .line 277
    invoke-static {v5, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-static {v2, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-interface {v4, v7, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    :cond_6
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    check-cast v0, Ljava/lang/CharSequence;

    .line 292
    .line 293
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-lez v0, :cond_7

    .line 298
    .line 299
    move v1, v6

    .line 300
    :cond_7
    if-eqz v1, :cond_8

    .line 301
    .line 302
    return-object v4

    .line 303
    :cond_8
    filled-new-array {v3, v3, v3}, [Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v0}, L۟/jb;->ۥ۟ۧ([Ljava/lang/Object;)Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    return-object v0

    .line 312
    nop

    .line 313
    :array_0
    .array-data 1
        0x64t
        -0xft
        -0x10t
        0x42t
        -0xdt
        -0x53t
        0x51t
        -0x21t
        -0xet
        0x43t
        -0x19t
        -0x5ct
        0x40t
        -0x20t
        -0x30t
        0x41t
        -0xbt
    .end array-data

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    nop

    .line 327
    :array_1
    .array-data 1
        0x25t
        -0x6et
        -0x6dt
        0x2dt
        -0x7at
        -0x3dt
    .end array-data

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    nop

    .line 335
    :array_2
    .array-data 1
        -0x2t
        -0x27t
        -0x4ct
        -0x45t
        -0x6bt
        -0x78t
        -0x3t
        -0x2bt
    .end array-data

    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    :array_3
    .array-data 1
        -0x70t
        -0x50t
        -0x29t
        -0x30t
        -0x5t
        -0x17t
    .end array-data

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    nop

    .line 351
    :array_4
    .array-data 1
        -0x24t
        -0x4ft
        0x11t
        -0x1t
        0x4dt
        -0xft
    .end array-data

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    nop

    .line 359
    :array_5
    .array-data 1
        -0x57t
        -0x3et
        0x74t
        -0x73t
        0x24t
        -0x6bt
    .end array-data

    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    nop

    .line 367
    :array_6
    .array-data 1
        -0x4dt
        0x17t
        0x8t
        -0x44t
        -0x6at
    .end array-data

    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    nop

    .line 375
    :array_7
    .array-data 1
        -0x3ft
        0x72t
        0x6ct
        -0xbt
        -0xet
        0x5at
    .end array-data

    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    nop

    .line 383
    :array_8
    .array-data 1
        0x26t
        -0x3bt
        -0x61t
        -0x5bt
        0x71t
        0x4t
        0x25t
        -0x37t
    .end array-data

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    :array_9
    .array-data 1
        0x48t
        -0x54t
        -0x4t
        -0x32t
        0x1ft
        0x65t
    .end array-data

    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    nop

    .line 399
    :array_a
    .array-data 1
        0x40t
        0x23t
        0x10t
        -0x5et
        0x27t
        0x58t
        0x46t
        0x3dt
        0x3t
        -0x27t
        0x7dt
        0x4t
        0x1t
        0x7at
    .end array-data

    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    nop

    .line 411
    :array_b
    .array-data 1
        0x2ft
        0x53t
        0x64t
        -0xft
        0x53t
        0x2at
    .end array-data

    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    nop

    .line 419
    :array_c
    .array-data 1
        0x9t
        0x4ft
        -0x6ct
        0x2et
        -0x50t
        0x72t
    .end array-data

    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    nop

    .line 427
    :array_d
    .array-data 1
        0x7ct
        0x3ct
        -0xft
        0x5ct
        -0x27t
        0x16t
    .end array-data

    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    nop

    .line 435
    :array_e
    .array-data 1
        -0x15t
        -0x16t
        0x43t
        -0x3dt
        0x2ct
        0x1et
        -0x13t
        -0xct
        0x50t
        -0x48t
        0x76t
        0x42t
        -0x56t
        -0x4dt
    .end array-data

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    nop

    .line 447
    :array_f
    .array-data 1
        -0x7ct
        -0x66t
        0x37t
        -0x70t
        0x58t
        0x6ct
    .end array-data

    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    nop

    .line 455
    :array_10
    .array-data 1
        0x6et
        0x1at
        -0x30t
        0x7et
        0x21t
        -0x4ct
    .end array-data

    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    nop

    .line 463
    :array_11
    .array-data 1
        0x1ct
        0x7ft
        -0x4ct
        0x21t
        0x48t
        -0x30t
    .end array-data

    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    nop

    .line 471
    :array_12
    .array-data 1
        -0x71t
        0x5t
        -0x4dt
        0x1ct
        -0x25t
        -0x27t
        -0x77t
        0x1bt
        -0x60t
        0x67t
        -0x7ft
        -0x7bt
        -0x32t
        0x5ct
    .end array-data

    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    nop

    .line 483
    :array_13
    .array-data 1
        -0x20t
        0x75t
        -0x39t
        0x4ft
        -0x51t
        -0x55t
    .end array-data
.end method

.method public static ۥ۟(Landroid/app/Application;)V
    .locals 4

    const/16 v0, 0xb

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    sget-object v0, L۟/q;->ۥ۟:L۟/kb;

    invoke-static {p0}, L۟/q$c;->ۥ۟ۡ(Landroid/app/Application;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/tendcloud/tenddata/TalkingDataSDK;->setVerboseLogDisable()V

    const/16 v0, 0x20

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v2, v1, [B

    fill-array-data v2, :array_3

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, L۟/jb;->ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, L۟/b6;->ۥ۟۠()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x8

    new-array v3, v3, [B

    fill-array-data v3, :array_4

    new-array v1, v1, [B

    fill-array-data v1, :array_5

    invoke-static {v3, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v2, v1}, Lcom/tendcloud/tenddata/TalkingDataSDK;->initSDK(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tendcloud/tenddata/TalkingDataSDK;->setReportUncaughtExceptions(Z)V

    invoke-static {}, L۟/q$c;->ۥ۟()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, L۟/j4;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, L۟/j4;-><init>(ILjava/lang/Object;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    nop

    :array_0
    .array-data 1
        -0x3ft
        -0x2ft
        -0x7at
        0x1ct
        0x67t
        0x1bt
        -0x3ft
        -0x2bt
        -0x61t
        0x1ft
        0x60t
    .end array-data

    :array_1
    .array-data 1
        -0x60t
        -0x5ft
        -0xat
        0x70t
        0xet
        0x78t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x9t
        0x5ft
        -0x4bt
        -0x46t
        0x68t
        -0x11t
        -0xft
        0x24t
        -0x3bt
        -0x45t
        0x6et
        -0xdt
        -0xbt
        0x49t
        -0x36t
        -0x47t
        0x63t
        -0x80t
        -0x9t
        0x59t
        -0x32t
        -0x47t
        0x6ft
        -0xdt
        -0xct
        0x5et
        -0x4ct
        -0x46t
        0x6ft
        -0x5t
        -0x19t
        0x25t
    .end array-data

    :array_3
    .array-data 1
        -0x4bt
        0x1bt
        -0x75t
        -0x6t
        0x2dt
        -0x42t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x58t
        0x34t
        0x69t
        0x6ct
        0x63t
        -0x70t
        -0x56t
        0x28t
    .end array-data

    :array_5
    .array-data 1
        -0x67t
        0x1at
        0x5bt
        0x42t
        0x54t
        -0x43t
    .end array-data
.end method
