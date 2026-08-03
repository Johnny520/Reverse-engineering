.class public final synthetic L۟/j4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥ:I

.field public final synthetic ۥ۟:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, L۟/j4;->ۥ:I

    iput-object p2, p0, L۟/j4;->ۥ۟:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, L۟/j4;->ۥ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x5

    .line 6
    const/4 v4, 0x6

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :pswitch_0
    iget-object v0, p0, L۟/j4;->ۥ۟:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/widget/LinearLayout;

    .line 14
    .line 15
    sget-object v1, L۟/z1;->ۥ۟:Ljava/lang/String;

    .line 16
    .line 17
    const/16 v1, 0xd

    .line 18
    .line 19
    new-array v1, v1, [B

    .line 20
    .line 21
    fill-array-data v1, :array_0

    .line 22
    .line 23
    .line 24
    new-array v2, v4, [B

    .line 25
    .line 26
    fill-array-data v2, :array_1

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object v1, L۟/k8;->ۥۣ۟:L۟/k;

    .line 37
    .line 38
    invoke-static {}, L۟/k8$a;->ۥ()Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;->ۥ۟ۧ()L۟/yb;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, L۟/yb;->getAll()Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, L۟/a2;

    .line 51
    .line 52
    invoke-direct {v2, v1, v0}, L۟/a2;-><init>(Ljava/util/List;Landroid/widget/LinearLayout;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2}, L۟/l3;->ۥۣ۟(L۟/g3;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_1
    iget-object v0, p0, L۟/j4;->ۥ۟:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/lang/String;

    .line 62
    .line 63
    new-array v1, v3, [B

    .line 64
    .line 65
    fill-array-data v1, :array_2

    .line 66
    .line 67
    .line 68
    new-array v3, v4, [B

    .line 69
    .line 70
    fill-array-data v3, :array_3

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget v1, L۟/o;->ۥ:I

    .line 81
    .line 82
    invoke-static {v2, v0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_2
    iget-object v0, p0, L۟/j4;->ۥ۟:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, L۟/k4;

    .line 89
    .line 90
    monitor-enter v0

    .line 91
    :try_start_0
    iput-boolean v2, v0, L۟/k4;->ۥ۟ۡ:Z

    .line 92
    .line 93
    iget-object v3, v0, L۟/k4;->ۥۣ۟:L۟/k4$b;

    .line 94
    .line 95
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 96
    :try_start_1
    iget-object v4, v3, L۟/k4$b;->ۥ۟:[Z

    .line 97
    .line 98
    invoke-static {v4, v2}, Ljava/util/Arrays;->fill([ZZ)V

    .line 99
    .line 100
    .line 101
    iput-boolean v1, v3, L۟/k4$b;->ۥ۟۠:Z

    .line 102
    .line 103
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    return-void

    .line 106
    :catchall_0
    move-exception v1

    .line 107
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    :try_start_4
    throw v1

    .line 109
    :catchall_1
    move-exception v1

    .line 110
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 111
    throw v1

    .line 112
    :goto_0
    iget-object v0, p0, L۟/j4;->ۥ۟:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Landroid/app/Application;

    .line 115
    .line 116
    const/16 v5, 0xc

    .line 117
    .line 118
    new-array v5, v5, [B

    .line 119
    .line 120
    fill-array-data v5, :array_4

    .line 121
    .line 122
    .line 123
    new-array v6, v4, [B

    .line 124
    .line 125
    fill-array-data v6, :array_5

    .line 126
    .line 127
    .line 128
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-static {v5, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lcom/tendcloud/tenddata/TalkingDataSDK;->startA(Landroid/content/Context;)V

    .line 136
    .line 137
    .line 138
    sget-object v5, L۟/q;->ۥ۟:L۟/kb;

    .line 139
    .line 140
    invoke-static {v0}, L۟/q$c;->ۥ۟ۡ(Landroid/app/Application;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    const/4 v6, 0x2

    .line 145
    if-nez v5, :cond_0

    .line 146
    .line 147
    goto/16 :goto_4

    .line 148
    .line 149
    :cond_0
    invoke-static {}, L۟/nb;->ۥ()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    check-cast v7, Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-lez v8, :cond_1

    .line 164
    .line 165
    move v8, v1

    .line 166
    goto :goto_1

    .line 167
    :cond_1
    move v8, v2

    .line 168
    :goto_1
    if-eqz v8, :cond_9

    .line 169
    .line 170
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    check-cast v8, Ljava/lang/String;

    .line 175
    .line 176
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    check-cast v5, Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {}, L۟/b6;->ۥ۟۟()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    if-lez v9, :cond_2

    .line 191
    .line 192
    move v9, v1

    .line 193
    goto :goto_2

    .line 194
    :cond_2
    move v9, v2

    .line 195
    :goto_2
    if-eqz v9, :cond_3

    .line 196
    .line 197
    sget-object v9, Lcom/tendcloud/tenddata/TalkingDataProfileType;->TYPE1:Lcom/tendcloud/tenddata/TalkingDataProfileType;

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_3
    invoke-static {}, L۟/b6;->ۥ۟()Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_4

    .line 205
    .line 206
    sget-object v9, Lcom/tendcloud/tenddata/TalkingDataProfileType;->TYPE2:Lcom/tendcloud/tenddata/TalkingDataProfileType;

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_4
    invoke-static {}, L۟/b6;->ۥ()Z

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    if-eqz v9, :cond_5

    .line 214
    .line 215
    sget-object v9, Lcom/tendcloud/tenddata/TalkingDataProfileType;->TYPE3:Lcom/tendcloud/tenddata/TalkingDataProfileType;

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_5
    invoke-static {}, L۟/b6;->ۥ۟ۢ()Z

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    if-eqz v9, :cond_6

    .line 223
    .line 224
    sget-object v9, Lcom/tendcloud/tenddata/TalkingDataProfileType;->TYPE7:Lcom/tendcloud/tenddata/TalkingDataProfileType;

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_6
    invoke-static {}, L۟/b6;->ۥ۟ۡ()Z

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    if-eqz v9, :cond_7

    .line 232
    .line 233
    sget-object v9, Lcom/tendcloud/tenddata/TalkingDataProfileType;->TYPE4:Lcom/tendcloud/tenddata/TalkingDataProfileType;

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_7
    invoke-static {}, L۟/b6;->ۥۣ۟()Z

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    if-eqz v9, :cond_8

    .line 241
    .line 242
    sget-object v9, Lcom/tendcloud/tenddata/TalkingDataProfileType;->TYPE5:Lcom/tendcloud/tenddata/TalkingDataProfileType;

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_8
    sget-object v9, Lcom/tendcloud/tenddata/TalkingDataProfileType;->TYPE6:Lcom/tendcloud/tenddata/TalkingDataProfileType;

    .line 246
    .line 247
    :goto_3
    invoke-static {}, Lcom/tendcloud/tenddata/TalkingDataProfile;->createProfile()Lcom/tendcloud/tenddata/TalkingDataProfile;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    invoke-virtual {v10, v8}, Lcom/tendcloud/tenddata/TalkingDataProfile;->setName(Ljava/lang/String;)Lcom/tendcloud/tenddata/TalkingDataProfile;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v10, v9}, Lcom/tendcloud/tenddata/TalkingDataProfile;->setType(Lcom/tendcloud/tenddata/TalkingDataProfileType;)Lcom/tendcloud/tenddata/TalkingDataProfile;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v10, v5}, Lcom/tendcloud/tenddata/TalkingDataProfile;->setProperty1(Ljava/lang/Object;)Lcom/tendcloud/tenddata/TalkingDataProfile;

    .line 258
    .line 259
    .line 260
    invoke-static {v7, v10}, Lcom/tendcloud/tenddata/TalkingDataSDK;->onLogin(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;)V

    .line 261
    .line 262
    .line 263
    :cond_9
    :goto_4
    invoke-static {}, L۟/nb;->ۥ()Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    new-instance v7, Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    check-cast v5, Ljava/lang/CharSequence;

    .line 277
    .line 278
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    if-lez v5, :cond_a

    .line 283
    .line 284
    move v5, v1

    .line 285
    goto :goto_5

    .line 286
    :cond_a
    move v5, v2

    .line 287
    :goto_5
    const/4 v8, 0x4

    .line 288
    const/4 v9, 0x3

    .line 289
    if-eqz v5, :cond_b

    .line 290
    .line 291
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    check-cast v5, Ljava/lang/String;

    .line 296
    .line 297
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    check-cast v10, Ljava/lang/String;

    .line 302
    .line 303
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    check-cast v7, Ljava/lang/String;

    .line 308
    .line 309
    new-instance v11, Ljava/util/HashMap;

    .line 310
    .line 311
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 312
    .line 313
    .line 314
    const/16 v12, 0x8

    .line 315
    .line 316
    new-array v13, v12, [B

    .line 317
    .line 318
    fill-array-data v13, :array_6

    .line 319
    .line 320
    .line 321
    new-array v14, v4, [B

    .line 322
    .line 323
    fill-array-data v14, :array_7

    .line 324
    .line 325
    .line 326
    invoke-static {v13, v14}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v13

    .line 330
    invoke-virtual {v11, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    new-array v5, v9, [B

    .line 334
    .line 335
    fill-array-data v5, :array_8

    .line 336
    .line 337
    .line 338
    new-array v13, v4, [B

    .line 339
    .line 340
    fill-array-data v13, :array_9

    .line 341
    .line 342
    .line 343
    invoke-static {v5, v13}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    invoke-virtual {v11, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    new-array v5, v3, [B

    .line 351
    .line 352
    fill-array-data v5, :array_a

    .line 353
    .line 354
    .line 355
    new-array v10, v4, [B

    .line 356
    .line 357
    fill-array-data v10, :array_b

    .line 358
    .line 359
    .line 360
    invoke-static {v5, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-virtual {v11, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    new-array v5, v8, [B

    .line 368
    .line 369
    fill-array-data v5, :array_c

    .line 370
    .line 371
    .line 372
    new-array v7, v4, [B

    .line 373
    .line 374
    fill-array-data v7, :array_d

    .line 375
    .line 376
    .line 377
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    sget v7, L۟/l3;->ۥ۟۠:I

    .line 382
    .line 383
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    invoke-virtual {v11, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    invoke-static {}, L۟/b6;->ۥ۟۠()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    new-array v7, v8, [B

    .line 395
    .line 396
    fill-array-data v7, :array_e

    .line 397
    .line 398
    .line 399
    new-array v10, v4, [B

    .line 400
    .line 401
    fill-array-data v10, :array_f

    .line 402
    .line 403
    .line 404
    invoke-static {v7, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    new-array v10, v6, [B

    .line 409
    .line 410
    fill-array-data v10, :array_10

    .line 411
    .line 412
    .line 413
    new-array v13, v4, [B

    .line 414
    .line 415
    fill-array-data v13, :array_11

    .line 416
    .line 417
    .line 418
    invoke-static {v10, v13}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v10

    .line 422
    invoke-virtual {v11, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    new-array v7, v12, [B

    .line 426
    .line 427
    fill-array-data v7, :array_12

    .line 428
    .line 429
    .line 430
    new-array v10, v4, [B

    .line 431
    .line 432
    fill-array-data v10, :array_13

    .line 433
    .line 434
    .line 435
    invoke-static {v7, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    invoke-virtual {v11, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    new-array v5, v3, [B

    .line 443
    .line 444
    fill-array-data v5, :array_14

    .line 445
    .line 446
    .line 447
    new-array v7, v4, [B

    .line 448
    .line 449
    fill-array-data v7, :array_15

    .line 450
    .line 451
    .line 452
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 457
    .line 458
    invoke-virtual {v11, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    const/16 v5, 0xa

    .line 462
    .line 463
    new-array v5, v5, [B

    .line 464
    .line 465
    fill-array-data v5, :array_16

    .line 466
    .line 467
    .line 468
    new-array v7, v4, [B

    .line 469
    .line 470
    fill-array-data v7, :array_17

    .line 471
    .line 472
    .line 473
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v5

    .line 477
    invoke-static {v0, v5, v11}, Lcom/tendcloud/tenddata/TalkingDataSDK;->onEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 478
    .line 479
    .line 480
    :cond_b
    sget-object v5, L۟/k8;->ۥ۟ۤ:Ljava/lang/String;

    .line 481
    .line 482
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 483
    .line 484
    .line 485
    move-result v5

    .line 486
    if-nez v5, :cond_c

    .line 487
    .line 488
    move v5, v1

    .line 489
    goto :goto_6

    .line 490
    :cond_c
    move v5, v2

    .line 491
    :goto_6
    if-nez v5, :cond_11

    .line 492
    .line 493
    const/16 v5, 0x20

    .line 494
    .line 495
    new-array v5, v5, [B

    .line 496
    .line 497
    fill-array-data v5, :array_18

    .line 498
    .line 499
    .line 500
    new-array v7, v4, [B

    .line 501
    .line 502
    fill-array-data v7, :array_19

    .line 503
    .line 504
    .line 505
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    invoke-static {v5}, L۟/jb;->ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    sget-object v7, L۟/k8;->ۥ۟ۤ:Ljava/lang/String;

    .line 514
    .line 515
    invoke-static {v5, v7}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v5

    .line 519
    if-eqz v5, :cond_d

    .line 520
    .line 521
    goto/16 :goto_a

    .line 522
    .line 523
    :cond_d
    invoke-static {}, L۟/nb;->ۥ()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v7

    .line 531
    check-cast v7, Ljava/lang/CharSequence;

    .line 532
    .line 533
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    if-lez v7, :cond_e

    .line 538
    .line 539
    move v7, v1

    .line 540
    goto :goto_7

    .line 541
    :cond_e
    move v7, v2

    .line 542
    :goto_7
    if-eqz v7, :cond_11

    .line 543
    .line 544
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v7

    .line 548
    check-cast v7, Ljava/lang/String;

    .line 549
    .line 550
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v10

    .line 554
    check-cast v10, Ljava/lang/String;

    .line 555
    .line 556
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v5

    .line 560
    check-cast v5, Ljava/lang/String;

    .line 561
    .line 562
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 563
    .line 564
    .line 565
    move-result v11

    .line 566
    if-lez v11, :cond_f

    .line 567
    .line 568
    move v11, v1

    .line 569
    goto :goto_8

    .line 570
    :cond_f
    move v11, v2

    .line 571
    :goto_8
    if-eqz v11, :cond_11

    .line 572
    .line 573
    new-instance v11, Ljava/lang/StringBuilder;

    .line 574
    .line 575
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 576
    .line 577
    .line 578
    const-string v12, "sign_"

    .line 579
    .line 580
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v11

    .line 590
    new-array v12, v9, [L۟/q7;

    .line 591
    .line 592
    new-array v13, v9, [B

    .line 593
    .line 594
    fill-array-data v13, :array_1a

    .line 595
    .line 596
    .line 597
    new-array v14, v4, [B

    .line 598
    .line 599
    fill-array-data v14, :array_1b

    .line 600
    .line 601
    .line 602
    invoke-static {v13, v14}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v13

    .line 606
    new-instance v14, L۟/q7;

    .line 607
    .line 608
    invoke-direct {v14, v13, v10}, L۟/q7;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    aput-object v14, v12, v2

    .line 612
    .line 613
    new-array v3, v3, [B

    .line 614
    .line 615
    fill-array-data v3, :array_1c

    .line 616
    .line 617
    .line 618
    new-array v10, v4, [B

    .line 619
    .line 620
    fill-array-data v10, :array_1d

    .line 621
    .line 622
    .line 623
    invoke-static {v3, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    new-instance v10, L۟/q7;

    .line 628
    .line 629
    invoke-direct {v10, v3, v5}, L۟/q7;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    aput-object v10, v12, v1

    .line 633
    .line 634
    new-array v1, v8, [B

    .line 635
    .line 636
    fill-array-data v1, :array_1e

    .line 637
    .line 638
    .line 639
    new-array v3, v4, [B

    .line 640
    .line 641
    fill-array-data v3, :array_1f

    .line 642
    .line 643
    .line 644
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    new-instance v3, L۟/q7;

    .line 649
    .line 650
    invoke-direct {v3, v1, v7}, L۟/q7;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    aput-object v3, v12, v6

    .line 654
    .line 655
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 656
    .line 657
    int-to-float v3, v9

    .line 658
    const/high16 v4, 0x3f400000    # 0.75f

    .line 659
    .line 660
    div-float/2addr v3, v4

    .line 661
    const/high16 v4, 0x3f800000    # 1.0f

    .line 662
    .line 663
    add-float/2addr v3, v4

    .line 664
    float-to-int v3, v3

    .line 665
    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 666
    .line 667
    .line 668
    :goto_9
    if-ge v2, v9, :cond_10

    .line 669
    .line 670
    aget-object v3, v12, v2

    .line 671
    .line 672
    iget-object v4, v3, L۟/q7;->ۥ:Ljava/lang/Object;

    .line 673
    .line 674
    iget-object v3, v3, L۟/q7;->ۥ۟:Ljava/lang/Object;

    .line 675
    .line 676
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    add-int/lit8 v2, v2, 0x1

    .line 680
    .line 681
    goto :goto_9

    .line 682
    :cond_10
    invoke-static {v0, v11, v1}, Lcom/tendcloud/tenddata/TalkingDataSDK;->onEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 683
    .line 684
    .line 685
    :cond_11
    :goto_a
    return-void

    .line 686
    nop

    .line 687
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    :array_0
    .array-data 1
        -0x8t
        -0x5et
        0x76t
        -0x79t
        0x55t
        0x3bt
        -0x52t
        -0x7et
        0x7et
        -0x70t
        0x5ft
        0x2ft
        -0x58t
    .end array-data

    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    nop

    .line 709
    :array_1
    .array-data 1
        -0x24t
        -0x32t
        0x1ft
        -0x17t
        0x30t
        0x5at
    .end array-data

    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    nop

    .line 717
    :array_2
    .array-data 1
        0x47t
        -0x37t
        0x6ct
        -0x56t
        -0xdt
    .end array-data

    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    nop

    .line 725
    :array_3
    .array-data 1
        0x63t
        -0x43t
        0x9t
        -0x2et
        -0x79t
        -0x6dt
    .end array-data

    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    nop

    .line 733
    :array_4
    .array-data 1
        -0x39t
        0x7ct
        0x6t
        -0x65t
        -0x7bt
        0x2et
        -0x80t
        0x7ct
        0x2t
        -0x7et
        -0x7at
        0x29t
    .end array-data

    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    :array_5
    .array-data 1
        -0x1dt
        0x1dt
        0x76t
        -0x15t
        -0x17t
        0x47t
    .end array-data

    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    nop

    .line 751
    :array_6
    .array-data 1
        -0x49t
        -0x24t
        0x2at
        0x62t
        0x69t
        -0x4et
        -0x51t
        -0x36t
    .end array-data

    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    :array_7
    .array-data 1
        -0x3et
        -0x51t
        0x4ft
        0x10t
        0x27t
        -0x2dt
    .end array-data

    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    nop

    .line 767
    :array_8
    .array-data 1
        -0x76t
        0x4et
        0x42t
    .end array-data

    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    :array_9
    .array-data 1
        -0x1t
        0x27t
        0x26t
        -0x15t
        0x22t
        -0x30t
    .end array-data

    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    nop

    .line 781
    :array_a
    .array-data 1
        -0x26t
        -0x7bt
        0x63t
        -0x24t
        -0xft
    .end array-data

    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    nop

    .line 789
    :array_b
    .array-data 1
        -0x58t
        -0x20t
        0x7t
        -0x4bt
        -0x6bt
        -0x1at
    .end array-data

    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    nop

    .line 797
    :array_c
    .array-data 1
        0x26t
        -0x6at
        -0x66t
        -0x66t
    .end array-data

    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    :array_d
    .array-data 1
        0x47t
        -0x40t
        -0x1t
        -0x18t
        -0x50t
        0x15t
    .end array-data

    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    nop

    .line 811
    :array_e
    .array-data 1
        -0x27t
        0x50t
        -0x2dt
        -0x76t
    .end array-data

    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    :array_f
    .array-data 1
        -0x4ct
        0x6t
        -0x4at
        -0x8t
        0x30t
        -0x1dt
    .end array-data

    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    nop

    .line 825
    :array_10
    .array-data 1
        -0x37t
        0x14t
    .end array-data

    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    nop

    .line 831
    :array_11
    .array-data 1
        -0x6t
        0x26t
        0x31t
        -0x71t
        0x4at
        -0x80t
    .end array-data

    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    nop

    .line 839
    :array_12
    .array-data 1
        0x66t
        0x4ct
        0x54t
        -0x1dt
        0x73t
        0x4at
        0x64t
        0x4dt
    .end array-data

    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    :array_13
    .array-data 1
        0x16t
        0x20t
        0x35t
        -0x69t
        0x15t
        0x25t
    .end array-data

    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    nop

    .line 855
    :array_14
    .array-data 1
        0x15t
        -0xat
        -0x2at
        -0x41t
        0x20t
    .end array-data

    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    nop

    .line 863
    :array_15
    .array-data 1
        0x78t
        -0x67t
        -0x4et
        -0x26t
        0x4ct
        0x41t
    .end array-data

    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    nop

    .line 871
    :array_16
    .array-data 1
        -0x4bt
        0x7t
        -0x35t
        0x2at
        0x23t
        -0x2at
        -0x6bt
        0x19t
        -0x5t
        0x37t
    .end array-data

    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    nop

    .line 881
    :array_17
    .array-data 1
        -0x26t
        0x69t
        -0x62t
        0x59t
        0x46t
        -0x5ct
    .end array-data

    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    nop

    .line 889
    :array_18
    .array-data 1
        -0x39t
        -0x23t
        -0x68t
        0x48t
        -0x33t
        0x7ct
        -0x46t
        -0x5et
        -0x49t
        0x6t
        -0x3t
        0x4ct
        -0x3ct
        -0x11t
        -0x63t
        0x5t
        -0x4ft
        0x2t
        -0x46t
        -0x26t
        -0x57t
        0x49t
        -0x4t
        0x53t
        -0x3at
        -0x10t
        -0x64t
        0x56t
        -0x4et
        0x52t
        -0x3ct
        -0x14t
    .end array-data

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
    :array_19
    .array-data 1
        -0x5t
        -0x62t
        -0x27t
        0x38t
        -0x73t
        0x3dt
    .end array-data

    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    nop

    .line 917
    :array_1a
    .array-data 1
        0xct
        -0x25t
        0x67t
    .end array-data

    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    :array_1b
    .array-data 1
        0x79t
        -0x4et
        0x3t
        0x1at
        0x4ct
        0x53t
    .end array-data

    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    nop

    .line 931
    :array_1c
    .array-data 1
        -0x17t
        0x78t
        -0x34t
        0x4et
        -0x4at
    .end array-data

    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    nop

    .line 939
    :array_1d
    .array-data 1
        -0x65t
        0x1dt
        -0x58t
        0x27t
        -0x2et
        0x14t
    .end array-data

    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    nop

    :array_1e
    .array-data 1
        0x11t
        0x78t
        0x3at
        0x21t
    .end array-data

    :array_1f
    .array-data 1
        0x7ft
        0x11t
        0x59t
        0x4at
        -0x12t
        -0x69t
    .end array-data
.end method
