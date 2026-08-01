.class public final Loj0;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Loj0;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Lm01;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 7
    iput p1, p0, Loj0;->α:I

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Loj0;->α:I

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, -0x1

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-boolean v0, Ljx0;->ρ:Z

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v6, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v1, v0, Landroid/view/View;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    move-object v7, v0

    .line 42
    check-cast v7, Landroid/view/View;

    .line 43
    .line 44
    :cond_1
    if-nez v7, :cond_2

    .line 45
    .line 46
    const-string v0, "[ui] skipped reason=root_missing"

    .line 47
    .line 48
    invoke-static {v0}, Lm41;->γ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    sget v1, Ljx0;->σ:I

    .line 53
    .line 54
    const-string v0, "offline_cache_applied_count"

    .line 55
    .line 56
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {v2, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :catchall_0
    sget-object v0, Lxn0;->μ:Ljava/lang/Integer;

    .line 65
    .line 66
    if-ne v4, v1, :cond_4

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eq v0, v1, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move v5, v6

    .line 78
    :cond_4
    :goto_0
    :try_start_1
    invoke-static {v7, v1, v5}, Ln41;->α(Landroid/view/View;IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    goto :goto_1

    .line 87
    :catchall_1
    move-exception v0

    .line 88
    new-instance v2, Leo1;

    .line 89
    .line 90
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    move-object v0, v2

    .line 94
    :goto_1
    instance-of v2, v0, Leo1;

    .line 95
    .line 96
    if-nez v2, :cond_5

    .line 97
    .line 98
    move-object v2, v0

    .line 99
    check-cast v2, Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    sget-object v3, Lm41;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 106
    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v4, "[ui] updated="

    .line 110
    .line 111
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v2, " count="

    .line 118
    .line 119
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v1, " pending_rebuild="

    .line 126
    .line 127
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-static {v1}, Lm41;->γ(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_5
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_6

    .line 145
    .line 146
    const-string v1, "DYH-OfflineCache"

    .line 147
    .line 148
    const-string v2, "[ui] hint_failed"

    .line 149
    .line 150
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    :cond_6
    :goto_2
    return-void

    .line 154
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v0, v1, Lk01;->ε:Ljava/lang/Object;

    .line 158
    .line 159
    instance-of v2, v0, Ljava/lang/Integer;

    .line 160
    .line 161
    if-eqz v2, :cond_7

    .line 162
    .line 163
    move-object v7, v0

    .line 164
    check-cast v7, Ljava/lang/Integer;

    .line 165
    .line 166
    :cond_7
    if-eqz v7, :cond_9

    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-lez v0, :cond_8

    .line 173
    .line 174
    sput-object v7, Lxn0;->μ:Ljava/lang/Integer;

    .line 175
    .line 176
    :cond_8
    sget-boolean v0, Ljx0;->ρ:Z

    .line 177
    .line 178
    if-eqz v0, :cond_9

    .line 179
    .line 180
    sget v0, Ljx0;->σ:I

    .line 181
    .line 182
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :cond_9
    return-void

    .line 190
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    sget-object v0, Lf31;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 194
    .line 195
    iget-object v0, v1, Lk01;->ε:Ljava/lang/Object;

    .line 196
    .line 197
    if-nez v0, :cond_a

    .line 198
    .line 199
    goto/16 :goto_c

    .line 200
    .line 201
    :cond_a
    sget-object v1, Lf31;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 202
    .line 203
    const-string v2, "DYHelper: [COMMENT-NET] url="

    .line 204
    .line 205
    :try_start_2
    const-string v3, "request"

    .line 206
    .line 207
    new-array v4, v6, [Ljava/lang/Object;

    .line 208
    .line 209
    invoke-static {v0, v3, v4}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    if-nez v3, :cond_b

    .line 214
    .line 215
    goto/16 :goto_c

    .line 216
    .line 217
    :cond_b
    const-string v4, "url"

    .line 218
    .line 219
    new-array v7, v6, [Ljava/lang/Object;

    .line 220
    .line 221
    invoke-static {v3, v4, v7}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {v3, v4}, Lf31;->β(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const-string v3, "/aweme/v1/feed"

    .line 233
    .line 234
    invoke-static {v4, v3, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-nez v3, :cond_d

    .line 239
    .line 240
    const-string v3, "/aweme/v2/feed"

    .line 241
    .line 242
    invoke-static {v4, v3, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_c

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_c
    move v3, v6

    .line 250
    goto :goto_4

    .line 251
    :cond_d
    :goto_3
    move v3, v5

    .line 252
    :goto_4
    const-string v7, "/aweme/v1/aweme/detail"

    .line 253
    .line 254
    invoke-static {v4, v7, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    const-string v8, "/aweme/v1/aweme/post/"

    .line 259
    .line 260
    invoke-static {v4, v8, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    if-nez v8, :cond_f

    .line 265
    .line 266
    const-string v8, "/aweme/v2/aweme/post/"

    .line 267
    .line 268
    invoke-static {v4, v8, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    if-eqz v8, :cond_e

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_e
    move v8, v6

    .line 276
    goto :goto_6

    .line 277
    :cond_f
    :goto_5
    move v8, v5

    .line 278
    :goto_6
    const-string v9, "/aweme/v1/user/profile/other"

    .line 279
    .line 280
    invoke-static {v4, v9, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    if-nez v9, :cond_11

    .line 285
    .line 286
    const-string v9, "/aweme/v1/user/profile/self"

    .line 287
    .line 288
    invoke-static {v4, v9, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    if-nez v9, :cond_11

    .line 293
    .line 294
    const-string v9, "/aweme/v1/user/"

    .line 295
    .line 296
    invoke-static {v4, v9, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    if-eqz v9, :cond_10

    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_10
    move v9, v6

    .line 304
    goto :goto_8

    .line 305
    :cond_11
    :goto_7
    move v9, v5

    .line 306
    :goto_8
    const-string v10, "comment"

    .line 307
    .line 308
    invoke-static {v4, v10, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    if-nez v10, :cond_12

    .line 313
    .line 314
    const-string v10, "aweme/detail"

    .line 315
    .line 316
    invoke-static {v4, v10, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 317
    .line 318
    .line 319
    move-result v10

    .line 320
    if-nez v10, :cond_12

    .line 321
    .line 322
    const-string v10, "aweme/v1/comment"

    .line 323
    .line 324
    invoke-static {v4, v10, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    if-nez v10, :cond_12

    .line 329
    .line 330
    const-string v10, "aweme/v2/comment"

    .line 331
    .line 332
    invoke-static {v4, v10, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eqz v5, :cond_13

    .line 337
    .line 338
    :cond_12
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-static {v2}, Lux;->ρ(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    :cond_13
    if-nez v3, :cond_14

    .line 346
    .line 347
    if-nez v7, :cond_14

    .line 348
    .line 349
    if-nez v8, :cond_14

    .line 350
    .line 351
    if-nez v9, :cond_14

    .line 352
    .line 353
    goto/16 :goto_c

    .line 354
    .line 355
    :cond_14
    invoke-static {v0}, Lf31;->ρ(Ljava/lang/Object;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    if-nez v0, :cond_15

    .line 360
    .line 361
    goto/16 :goto_c

    .line 362
    .line 363
    :cond_15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    const/16 v3, 0x64

    .line 368
    .line 369
    if-ge v2, v3, :cond_16

    .line 370
    .line 371
    goto/16 :goto_c

    .line 372
    .line 373
    :cond_16
    new-instance v2, Lorg/json/JSONObject;

    .line 374
    .line 375
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    if-eqz v9, :cond_17

    .line 379
    .line 380
    invoke-static {v2}, Lf31;->λ(Lorg/json/JSONObject;)V

    .line 381
    .line 382
    .line 383
    invoke-static {v2}, Lf31;->α(Lorg/json/JSONObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 384
    .line 385
    .line 386
    :cond_17
    const-string v0, "aweme_list"

    .line 387
    .line 388
    if-eqz v8, :cond_1e

    .line 389
    .line 390
    :try_start_3
    sget v3, Lcom/example/dyhelper/MainHook;->β:I

    .line 391
    .line 392
    const-string v3, "cursor"

    .line 393
    .line 394
    const-wide/16 v7, -0x1

    .line 395
    .line 396
    invoke-virtual {v2, v3, v7, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 397
    .line 398
    .line 399
    move-result-wide v9

    .line 400
    const-string v3, "max_cursor"

    .line 401
    .line 402
    invoke-virtual {v2, v3, v7, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 403
    .line 404
    .line 405
    move-result-wide v7

    .line 406
    const-wide/16 v11, 0x0

    .line 407
    .line 408
    cmp-long v3, v9, v11

    .line 409
    .line 410
    if-eqz v3, :cond_18

    .line 411
    .line 412
    cmp-long v3, v7, v11

    .line 413
    .line 414
    if-eqz v3, :cond_18

    .line 415
    .line 416
    const-string v3, "max_cursor=0"

    .line 417
    .line 418
    invoke-static {v4, v3, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    if-eqz v3, :cond_19

    .line 423
    .line 424
    :cond_18
    sget-object v3, Ld72;->α:Ljava/util/LinkedHashMap;

    .line 425
    .line 426
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    .line 427
    .line 428
    .line 429
    :cond_19
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    if-eqz v3, :cond_1e

    .line 434
    .line 435
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    if-lez v4, :cond_1e

    .line 440
    .line 441
    new-instance v4, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    move v7, v6

    .line 451
    :goto_9
    if-ge v7, v5, :cond_1b

    .line 452
    .line 453
    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 454
    .line 455
    .line 456
    move-result-object v8

    .line 457
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    invoke-static {v8}, Lf31;->π(Lorg/json/JSONObject;)Lf8;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    if-eqz v8, :cond_1a

    .line 465
    .line 466
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    :cond_1a
    add-int/lit8 v7, v7, 0x1

    .line 470
    .line 471
    goto :goto_9

    .line 472
    :cond_1b
    sget-object v3, Ld72;->α:Ljava/util/LinkedHashMap;

    .line 473
    .line 474
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    :cond_1c
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v5

    .line 482
    if-eqz v5, :cond_1d

    .line 483
    .line 484
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    check-cast v5, Lf8;

    .line 489
    .line 490
    iget-object v7, v5, Lf8;->θ:Ljava/lang/String;

    .line 491
    .line 492
    if-eqz v7, :cond_1c

    .line 493
    .line 494
    sget-object v8, Ld72;->α:Ljava/util/LinkedHashMap;

    .line 495
    .line 496
    invoke-interface {v8, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    goto :goto_a

    .line 500
    :cond_1d
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    sget-object v4, Ld72;->α:Ljava/util/LinkedHashMap;

    .line 505
    .line 506
    invoke-virtual {v4}, Ljava/util/AbstractMap;->size()I

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    new-instance v5, Ljava/lang/StringBuilder;

    .line 511
    .line 512
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 513
    .line 514
    .line 515
    const-string v7, "DYHelper: \u4e3b\u9875\u4f5c\u54c1 "

    .line 516
    .line 517
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    const-string v3, " \u6761\uff0c\u5171 "

    .line 524
    .line 525
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    invoke-static {v3}, Lux;->ρ(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    :cond_1e
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    if-eqz v0, :cond_20

    .line 543
    .line 544
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    :goto_b
    if-ge v6, v3, :cond_20

    .line 549
    .line 550
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    invoke-static {v4}, Lf31;->ε(Lorg/json/JSONObject;)V

    .line 558
    .line 559
    .line 560
    if-nez v6, :cond_1f

    .line 561
    .line 562
    invoke-static {v4}, Lf31;->π(Lorg/json/JSONObject;)Lf8;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    if-eqz v4, :cond_1f

    .line 567
    .line 568
    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    :cond_1f
    add-int/lit8 v6, v6, 0x1

    .line 572
    .line 573
    goto :goto_b

    .line 574
    :cond_20
    const-string v0, "aweme_detail"

    .line 575
    .line 576
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    if-eqz v0, :cond_21

    .line 581
    .line 582
    invoke-static {v0}, Lf31;->ε(Lorg/json/JSONObject;)V

    .line 583
    .line 584
    .line 585
    invoke-static {v0}, Lf31;->π(Lorg/json/JSONObject;)Lf8;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    if-eqz v0, :cond_21

    .line 590
    .line 591
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 592
    .line 593
    .line 594
    goto :goto_c

    .line 595
    :catchall_2
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 596
    .line 597
    :cond_21
    :goto_c
    return-void

    .line 598
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    sget-object v0, Lan1;->α:Lan1;

    .line 602
    .line 603
    sget-boolean v2, Lan1;->δ:Z

    .line 604
    .line 605
    if-eqz v2, :cond_22

    .line 606
    .line 607
    goto/16 :goto_13

    .line 608
    .line 609
    :cond_22
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 610
    .line 611
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    check-cast v1, Landroid/app/Application;

    .line 615
    .line 616
    const-class v2, Lcom/example/dyhelper/MainHook;

    .line 617
    .line 618
    const-string v4, "region_codes.json"

    .line 619
    .line 620
    const-string v5, "DYHelper"

    .line 621
    .line 622
    const/16 v6, 0x2000

    .line 623
    .line 624
    :try_start_4
    const-string v8, "com.example.dyhelper"

    .line 625
    .line 626
    const/4 v9, 0x2

    .line 627
    invoke-virtual {v1, v8, v9}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 628
    .line 629
    .line 630
    move-result-object v8

    .line 631
    invoke-virtual {v8}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 632
    .line 633
    .line 634
    move-result-object v8

    .line 635
    invoke-virtual {v8, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 636
    .line 637
    .line 638
    move-result-object v8

    .line 639
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    sget-object v9, Lmf;->α:Ljava/nio/charset/Charset;

    .line 643
    .line 644
    new-instance v10, Ljava/io/InputStreamReader;

    .line 645
    .line 646
    invoke-direct {v10, v8, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 647
    .line 648
    .line 649
    new-instance v8, Ljava/io/BufferedReader;

    .line 650
    .line 651
    invoke-direct {v8, v10, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 652
    .line 653
    .line 654
    :try_start_5
    invoke-static {v8}, Li81;->φ(Ljava/io/Reader;)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 658
    :try_start_6
    invoke-interface {v8}, Ljava/io/Closeable;->close()V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v0, v9}, Lan1;->β(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    sget-boolean v0, Lan1;->δ:Z

    .line 665
    .line 666
    if-eqz v0, :cond_23

    .line 667
    .line 668
    const-string v0, "\u2705 \u65b9\u68481 createPackageContext \u6210\u529f"

    .line 669
    .line 670
    invoke-static {v5, v0, v7, v3, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 671
    .line 672
    .line 673
    goto/16 :goto_13

    .line 674
    .line 675
    :catchall_3
    move-exception v0

    .line 676
    goto :goto_d

    .line 677
    :catchall_4
    move-exception v0

    .line 678
    move-object v9, v0

    .line 679
    :try_start_7
    throw v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 680
    :catchall_5
    move-exception v0

    .line 681
    :try_start_8
    invoke-static {v8, v9}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 682
    .line 683
    .line 684
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 685
    :goto_d
    const-string v8, "\u65b9\u68481 \u5931\u8d25"

    .line 686
    .line 687
    invoke-static {v5, v8, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 688
    .line 689
    .line 690
    :cond_23
    :try_start_9
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    if-nez v0, :cond_24

    .line 695
    .line 696
    goto/16 :goto_13

    .line 697
    .line 698
    :cond_24
    const-string v8, "assets/"

    .line 699
    .line 700
    invoke-virtual {v8, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v4

    .line 704
    invoke-virtual {v0, v4}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    if-nez v0, :cond_25

    .line 709
    .line 710
    move-object v0, v7

    .line 711
    goto :goto_e

    .line 712
    :cond_25
    new-instance v4, Ljava/io/InputStreamReader;

    .line 713
    .line 714
    sget-object v8, Lmf;->α:Ljava/nio/charset/Charset;

    .line 715
    .line 716
    invoke-direct {v4, v0, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 717
    .line 718
    .line 719
    new-instance v8, Ljava/io/BufferedReader;

    .line 720
    .line 721
    invoke-direct {v8, v4, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 722
    .line 723
    .line 724
    :try_start_a
    invoke-static {v8}, Li81;->φ(Ljava/io/Reader;)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 728
    :try_start_b
    invoke-interface {v8}, Ljava/io/Closeable;->close()V

    .line 729
    .line 730
    .line 731
    :goto_e
    if-eqz v0, :cond_26

    .line 732
    .line 733
    sget-object v4, Lan1;->α:Lan1;

    .line 734
    .line 735
    invoke-virtual {v4, v0}, Lan1;->β(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    sget-boolean v0, Lan1;->δ:Z

    .line 739
    .line 740
    if-eqz v0, :cond_27

    .line 741
    .line 742
    const-string v0, "\u2705 \u65b9\u68482 ClassLoader \u6210\u529f"

    .line 743
    .line 744
    invoke-static {v5, v0, v7, v3, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    goto :goto_13

    .line 748
    :catchall_6
    move-exception v0

    .line 749
    goto :goto_f

    .line 750
    :cond_26
    const-string v0, "\u65b9\u68482 stream \u4e3a null"

    .line 751
    .line 752
    invoke-static {v5, v0, v7, v3, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 753
    .line 754
    .line 755
    goto :goto_10

    .line 756
    :catchall_7
    move-exception v0

    .line 757
    move-object v4, v0

    .line 758
    :try_start_c
    throw v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 759
    :catchall_8
    move-exception v0

    .line 760
    :try_start_d
    invoke-static {v8, v4}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 761
    .line 762
    .line 763
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 764
    :goto_f
    const-string v4, "\u65b9\u68482 \u5931\u8d25"

    .line 765
    .line 766
    invoke-static {v5, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 767
    .line 768
    .line 769
    :cond_27
    :goto_10
    :try_start_e
    invoke-virtual {v2}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    if-eqz v0, :cond_28

    .line 774
    .line 775
    invoke-virtual {v0}, Ljava/security/ProtectionDomain;->getCodeSource()Ljava/security/CodeSource;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    if-eqz v0, :cond_28

    .line 780
    .line 781
    invoke-virtual {v0}, Ljava/security/CodeSource;->getLocation()Ljava/net/URL;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    if-eqz v0, :cond_28

    .line 786
    .line 787
    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    goto :goto_11

    .line 792
    :catchall_9
    move-exception v0

    .line 793
    goto :goto_12

    .line 794
    :cond_28
    move-object v0, v7

    .line 795
    :goto_11
    if-eqz v0, :cond_29

    .line 796
    .line 797
    invoke-static {v1, v0}, Lpd2;->Κ(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    sget-object v1, Lan1;->α:Lan1;

    .line 802
    .line 803
    invoke-virtual {v1, v0}, Lan1;->β(Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    sget-boolean v0, Lan1;->δ:Z

    .line 807
    .line 808
    if-eqz v0, :cond_29

    .line 809
    .line 810
    const-string v0, "\u2705 \u65b9\u68483 AssetManager \u6210\u529f"

    .line 811
    .line 812
    invoke-static {v5, v0, v7, v3, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 813
    .line 814
    .line 815
    goto :goto_13

    .line 816
    :goto_12
    const-string v1, "\u65b9\u68483 \u5931\u8d25"

    .line 817
    .line 818
    invoke-static {v5, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 819
    .line 820
    .line 821
    :cond_29
    const-string v0, "\u26a0\ufe0f \u6240\u6709\u65b9\u6848\u5747\u5931\u8d25\uff0c\u533a\u57df\u4ee3\u7801\u5c06\u663e\u793a\u539f\u59cb\u6570\u5b57"

    .line 822
    .line 823
    invoke-static {v5, v0, v7, v3, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 824
    .line 825
    .line 826
    :goto_13
    return-void

    .line 827
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 831
    .line 832
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    invoke-static {v1}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    instance-of v2, v1, Landroid/view/View;

    .line 840
    .line 841
    if-eqz v2, :cond_2a

    .line 842
    .line 843
    move-object v7, v1

    .line 844
    check-cast v7, Landroid/view/View;

    .line 845
    .line 846
    :cond_2a
    if-nez v7, :cond_2b

    .line 847
    .line 848
    goto :goto_14

    .line 849
    :cond_2b
    new-instance v1, Ljb;

    .line 850
    .line 851
    const/16 v2, 0x1c

    .line 852
    .line 853
    invoke-direct {v1, v2, v7, v0}, Ljb;-><init>(ILandroid/view/View;Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v7, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 857
    .line 858
    .line 859
    :goto_14
    return-void

    .line 860
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    sget-object v0, Lbe0;->α:Lbe0;

    .line 864
    .line 865
    invoke-virtual {v0}, Lbe0;->η()Z

    .line 866
    .line 867
    .line 868
    move-result v0

    .line 869
    if-nez v0, :cond_2c

    .line 870
    .line 871
    goto :goto_16

    .line 872
    :cond_2c
    :try_start_f
    iget-object v0, v1, Lk01;->ε:Ljava/lang/Object;

    .line 873
    .line 874
    instance-of v2, v0, Ljava/util/List;

    .line 875
    .line 876
    if-eqz v2, :cond_2d

    .line 877
    .line 878
    move-object v7, v0

    .line 879
    check-cast v7, Ljava/util/List;

    .line 880
    .line 881
    :cond_2d
    if-nez v7, :cond_2e

    .line 882
    .line 883
    goto :goto_16

    .line 884
    :cond_2e
    new-instance v0, Ljava/util/ArrayList;

    .line 885
    .line 886
    invoke-static {v7}, Lvd0;->γ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    sget-object v0, Ls62;->α:Ls62;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    .line 897
    .line 898
    goto :goto_15

    .line 899
    :catchall_a
    move-exception v0

    .line 900
    new-instance v1, Leo1;

    .line 901
    .line 902
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 903
    .line 904
    .line 905
    move-object v0, v1

    .line 906
    :goto_15
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    if-eqz v0, :cond_2f

    .line 911
    .line 912
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    const-string v1, "session build callback failed: "

    .line 917
    .line 918
    const-string v2, "r1e0d2867edbb56e0"

    .line 919
    .line 920
    invoke-static {v1, v0, v2}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    :cond_2f
    :goto_16
    return-void

    .line 924
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 928
    .line 929
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 930
    .line 931
    if-eqz v1, :cond_30

    .line 932
    .line 933
    move-object v7, v0

    .line 934
    check-cast v7, Landroid/view/ViewGroup;

    .line 935
    .line 936
    :cond_30
    if-nez v7, :cond_31

    .line 937
    .line 938
    goto :goto_17

    .line 939
    :cond_31
    invoke-static {v7}, Lht0;->θ(Landroid/view/ViewGroup;)V

    .line 940
    .line 941
    .line 942
    :goto_17
    return-void

    .line 943
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 947
    .line 948
    instance-of v1, v0, Landroid/app/Activity;

    .line 949
    .line 950
    if-eqz v1, :cond_32

    .line 951
    .line 952
    move-object v7, v0

    .line 953
    check-cast v7, Landroid/app/Activity;

    .line 954
    .line 955
    :cond_32
    if-nez v7, :cond_33

    .line 956
    .line 957
    goto :goto_18

    .line 958
    :cond_33
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    const-string v1, "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7000C6ADBCAD99044D3E8549548CF07CFE2D"

    .line 967
    .line 968
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 973
    .line 974
    .line 975
    move-result v0

    .line 976
    if-nez v0, :cond_34

    .line 977
    .line 978
    goto :goto_18

    .line 979
    :cond_34
    invoke-static {v7}, Lht0;->ε(Landroid/app/Activity;)V

    .line 980
    .line 981
    .line 982
    :goto_18
    return-void

    .line 983
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    .line 985
    .line 986
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 987
    .line 988
    if-nez v1, :cond_35

    .line 989
    .line 990
    goto/16 :goto_36

    .line 991
    .line 992
    :cond_35
    invoke-static {}, Lui1;->ξ()Z

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    if-nez v0, :cond_36

    .line 997
    .line 998
    goto/16 :goto_36

    .line 999
    .line 1000
    :cond_36
    const-string v2, "color_ring"

    .line 1001
    .line 1002
    invoke-static {v2}, Lui1;->ω(Ljava/lang/String;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v0

    .line 1006
    if-eqz v0, :cond_5f

    .line 1007
    .line 1008
    sget-object v0, Ltq0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1009
    .line 1010
    const-string v0, "j"

    .line 1011
    .line 1012
    const-string v8, "k"

    .line 1013
    .line 1014
    const-string v9, "h"

    .line 1015
    .line 1016
    const-string v10, "i"

    .line 1017
    .line 1018
    filled-new-array {v9, v10, v0, v8}, [Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v0

    .line 1022
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v8

    .line 1030
    :goto_19
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1031
    .line 1032
    .line 1033
    move-result v0

    .line 1034
    const-string v9, "b"

    .line 1035
    .line 1036
    const-string v11, "a"

    .line 1037
    .line 1038
    const-string v12, "FeedRightControlsHideLegacy"

    .line 1039
    .line 1040
    const-string v13, "ColorRing"

    .line 1041
    .line 1042
    if-eqz v0, :cond_51

    .line 1043
    .line 1044
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    move-object v14, v0

    .line 1049
    check-cast v14, Ljava/lang/String;

    .line 1050
    .line 1051
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    :try_start_10
    invoke-virtual {v0, v14}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    .line 1059
    goto :goto_1a

    .line 1060
    :catchall_b
    move-exception v0

    .line 1061
    new-instance v15, Leo1;

    .line 1062
    .line 1063
    invoke-direct {v15, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1064
    .line 1065
    .line 1066
    move-object v0, v15

    .line 1067
    :goto_1a
    instance-of v15, v0, Leo1;

    .line 1068
    .line 1069
    if-eqz v15, :cond_37

    .line 1070
    .line 1071
    move-object v0, v7

    .line 1072
    :cond_37
    check-cast v0, Ljava/lang/reflect/Field;

    .line 1073
    .line 1074
    if-nez v0, :cond_38

    .line 1075
    .line 1076
    :goto_1b
    move-object/from16 p0, v2

    .line 1077
    .line 1078
    move/from16 v16, v4

    .line 1079
    .line 1080
    goto/16 :goto_2c

    .line 1081
    .line 1082
    :cond_38
    :try_start_11
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    invoke-static {v0}, Lh62;->к(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v15

    .line 1093
    if-eqz v15, :cond_39

    .line 1094
    .line 1095
    check-cast v0, Ljava/util/List;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    .line 1096
    .line 1097
    goto :goto_1d

    .line 1098
    :catchall_c
    move-exception v0

    .line 1099
    goto :goto_1c

    .line 1100
    :cond_39
    move-object v0, v7

    .line 1101
    goto :goto_1d

    .line 1102
    :goto_1c
    new-instance v15, Leo1;

    .line 1103
    .line 1104
    invoke-direct {v15, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1105
    .line 1106
    .line 1107
    move-object v0, v15

    .line 1108
    :goto_1d
    instance-of v15, v0, Leo1;

    .line 1109
    .line 1110
    if-eqz v15, :cond_3a

    .line 1111
    .line 1112
    move-object v0, v7

    .line 1113
    :cond_3a
    move-object v15, v0

    .line 1114
    check-cast v15, Ljava/util/List;

    .line 1115
    .line 1116
    if-nez v15, :cond_3b

    .line 1117
    .line 1118
    goto :goto_1b

    .line 1119
    :cond_3b
    move/from16 v16, v4

    .line 1120
    .line 1121
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 1122
    .line 1123
    .line 1124
    move-result v4

    .line 1125
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    .line 1126
    .line 1127
    .line 1128
    move-result v0

    .line 1129
    add-int/lit8 v0, v0, -0x1

    .line 1130
    .line 1131
    if-ltz v0, :cond_4f

    .line 1132
    .line 1133
    move v6, v0

    .line 1134
    :goto_1e
    add-int/lit8 v18, v6, -0x1

    .line 1135
    .line 1136
    invoke-interface {v15, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    const-string v3, "getFirst"

    .line 1141
    .line 1142
    if-nez v0, :cond_3c

    .line 1143
    .line 1144
    move-object/from16 p0, v2

    .line 1145
    .line 1146
    move-object v0, v7

    .line 1147
    goto :goto_21

    .line 1148
    :cond_3c
    :try_start_12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v19

    .line 1152
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v7

    .line 1156
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    array-length v5, v7
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    .line 1160
    move-object/from16 p0, v2

    .line 1161
    .line 1162
    const/4 v2, 0x0

    .line 1163
    :goto_1f
    if-ge v2, v5, :cond_3e

    .line 1164
    .line 1165
    :try_start_13
    aget-object v21, v7, v2

    .line 1166
    .line 1167
    move/from16 p1, v2

    .line 1168
    .line 1169
    invoke-virtual/range {v21 .. v21}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v2

    .line 1173
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1174
    .line 1175
    .line 1176
    move-result v2

    .line 1177
    if-eqz v2, :cond_3d

    .line 1178
    .line 1179
    invoke-virtual/range {v21 .. v21}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v2

    .line 1183
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1184
    .line 1185
    .line 1186
    array-length v2, v2

    .line 1187
    if-nez v2, :cond_3d

    .line 1188
    .line 1189
    move-object/from16 v2, v21

    .line 1190
    .line 1191
    goto :goto_20

    .line 1192
    :cond_3d
    add-int/lit8 v2, p1, 0x1

    .line 1193
    .line 1194
    goto :goto_1f

    .line 1195
    :cond_3e
    const/4 v2, 0x0

    .line 1196
    :goto_20
    if-eqz v2, :cond_3f

    .line 1197
    .line 1198
    const/4 v5, 0x1

    .line 1199
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1200
    .line 1201
    .line 1202
    const/4 v5, 0x0

    .line 1203
    invoke-virtual {v2, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_e

    .line 1207
    goto :goto_21

    .line 1208
    :catchall_d
    move-object/from16 p0, v2

    .line 1209
    .line 1210
    :catchall_e
    :cond_3f
    :try_start_14
    const-string v2, "first"

    .line 1211
    .line 1212
    invoke-static {v0, v2}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_f

    .line 1216
    goto :goto_21

    .line 1217
    :catchall_f
    :try_start_15
    invoke-static {v0, v11}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_10

    .line 1221
    goto :goto_21

    .line 1222
    :catchall_10
    :try_start_16
    const-class v2, Ll91;

    .line 1223
    .line 1224
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v5

    .line 1228
    if-eqz v5, :cond_40

    .line 1229
    .line 1230
    const/4 v5, 0x0

    .line 1231
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v2

    .line 1235
    invoke-virtual {v2, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_11

    .line 1239
    goto :goto_21

    .line 1240
    :catchall_11
    :cond_40
    const/4 v0, 0x0

    .line 1241
    :goto_21
    if-eqz v0, :cond_41

    .line 1242
    .line 1243
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    goto :goto_22

    .line 1248
    :cond_41
    const/4 v0, 0x0

    .line 1249
    :goto_22
    invoke-static {v0, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v0

    .line 1253
    if-eqz v0, :cond_4d

    .line 1254
    .line 1255
    invoke-interface {v15, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    invoke-static {v14, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v0

    .line 1262
    if-eqz v0, :cond_4d

    .line 1263
    .line 1264
    sget-object v0, Ltq0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1265
    .line 1266
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v0

    .line 1270
    invoke-static {v0, v11}, Ltq0;->β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v0

    .line 1274
    if-nez v0, :cond_42

    .line 1275
    .line 1276
    goto/16 :goto_2a

    .line 1277
    .line 1278
    :cond_42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v2

    .line 1282
    invoke-static {v2, v9}, Ltq0;->β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v2

    .line 1286
    const/4 v5, 0x1

    .line 1287
    :try_start_17
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v0

    .line 1294
    invoke-static {v0}, Lh62;->к(Ljava/lang/Object;)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v3

    .line 1298
    if-eqz v3, :cond_43

    .line 1299
    .line 1300
    check-cast v0, Ljava/util/List;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_12

    .line 1301
    .line 1302
    goto :goto_24

    .line 1303
    :catchall_12
    move-exception v0

    .line 1304
    goto :goto_23

    .line 1305
    :cond_43
    const/4 v0, 0x0

    .line 1306
    goto :goto_24

    .line 1307
    :goto_23
    new-instance v3, Leo1;

    .line 1308
    .line 1309
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1310
    .line 1311
    .line 1312
    move-object v0, v3

    .line 1313
    :goto_24
    instance-of v3, v0, Leo1;

    .line 1314
    .line 1315
    if-eqz v3, :cond_44

    .line 1316
    .line 1317
    const/4 v0, 0x0

    .line 1318
    :cond_44
    move-object v3, v0

    .line 1319
    check-cast v3, Ljava/util/List;

    .line 1320
    .line 1321
    if-nez v3, :cond_45

    .line 1322
    .line 1323
    goto/16 :goto_2a

    .line 1324
    .line 1325
    :cond_45
    if-eqz v2, :cond_46

    .line 1326
    .line 1327
    const/4 v5, 0x1

    .line 1328
    :try_start_18
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1329
    .line 1330
    .line 1331
    goto :goto_25

    .line 1332
    :catchall_13
    move-exception v0

    .line 1333
    goto :goto_27

    .line 1334
    :cond_46
    :goto_25
    if-eqz v2, :cond_47

    .line 1335
    .line 1336
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v0

    .line 1340
    goto :goto_26

    .line 1341
    :cond_47
    const/4 v0, 0x0

    .line 1342
    :goto_26
    invoke-static {v0}, Lh62;->к(Ljava/lang/Object;)Z

    .line 1343
    .line 1344
    .line 1345
    move-result v2

    .line 1346
    if-eqz v2, :cond_48

    .line 1347
    .line 1348
    check-cast v0, Ljava/util/List;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_13

    .line 1349
    .line 1350
    goto :goto_28

    .line 1351
    :cond_48
    const/4 v0, 0x0

    .line 1352
    goto :goto_28

    .line 1353
    :goto_27
    new-instance v2, Leo1;

    .line 1354
    .line 1355
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1356
    .line 1357
    .line 1358
    move-object v0, v2

    .line 1359
    :goto_28
    instance-of v2, v0, Leo1;

    .line 1360
    .line 1361
    if-eqz v2, :cond_49

    .line 1362
    .line 1363
    const/4 v0, 0x0

    .line 1364
    :cond_49
    check-cast v0, Ljava/util/List;

    .line 1365
    .line 1366
    if-ltz v6, :cond_4d

    .line 1367
    .line 1368
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1369
    .line 1370
    .line 1371
    move-result v2

    .line 1372
    if-lt v6, v2, :cond_4a

    .line 1373
    .line 1374
    goto :goto_2a

    .line 1375
    :cond_4a
    invoke-interface {v3, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v2

    .line 1379
    if-eqz v0, :cond_4b

    .line 1380
    .line 1381
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1382
    .line 1383
    .line 1384
    move-result v3

    .line 1385
    if-ge v6, v3, :cond_4b

    .line 1386
    .line 1387
    invoke-interface {v0, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1388
    .line 1389
    .line 1390
    :cond_4b
    if-eqz v2, :cond_4c

    .line 1391
    .line 1392
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    goto :goto_29

    .line 1401
    :cond_4c
    const/4 v0, 0x0

    .line 1402
    :goto_29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1403
    .line 1404
    const-string v3, "\u5df2\u540c\u6b65\u79fb\u9664\u5934\u50cf Presenter index="

    .line 1405
    .line 1406
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1410
    .line 1411
    .line 1412
    const-string v3, " presenter="

    .line 1413
    .line 1414
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0

    .line 1424
    const/4 v2, 0x4

    .line 1425
    const/4 v5, 0x0

    .line 1426
    invoke-static {v12, v0, v5, v2, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1427
    .line 1428
    .line 1429
    :cond_4d
    :goto_2a
    if-gez v18, :cond_4e

    .line 1430
    .line 1431
    goto :goto_2b

    .line 1432
    :cond_4e
    move-object/from16 v2, p0

    .line 1433
    .line 1434
    move/from16 v6, v18

    .line 1435
    .line 1436
    const/4 v3, 0x4

    .line 1437
    const/4 v5, 0x1

    .line 1438
    const/4 v7, 0x0

    .line 1439
    goto/16 :goto_1e

    .line 1440
    .line 1441
    :cond_4f
    move-object/from16 p0, v2

    .line 1442
    .line 1443
    :goto_2b
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 1444
    .line 1445
    .line 1446
    move-result v0

    .line 1447
    if-eq v4, v0, :cond_50

    .line 1448
    .line 1449
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 1450
    .line 1451
    .line 1452
    move-result v0

    .line 1453
    sub-int/2addr v4, v0

    .line 1454
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1455
    .line 1456
    const-string v2, "\u5df2\u79fb\u9664\u5934\u50cf\u6269\u5c55 ColorRing, field="

    .line 1457
    .line 1458
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1462
    .line 1463
    .line 1464
    const-string v2, ", removed="

    .line 1465
    .line 1466
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v0

    .line 1476
    const/4 v2, 0x4

    .line 1477
    const/4 v5, 0x0

    .line 1478
    invoke-static {v12, v0, v5, v2, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1479
    .line 1480
    .line 1481
    :cond_50
    :goto_2c
    move-object/from16 v2, p0

    .line 1482
    .line 1483
    move/from16 v4, v16

    .line 1484
    .line 1485
    const/4 v3, 0x4

    .line 1486
    const/4 v5, 0x1

    .line 1487
    const/4 v6, 0x0

    .line 1488
    const/4 v7, 0x0

    .line 1489
    goto/16 :goto_19

    .line 1490
    .line 1491
    :cond_51
    move-object/from16 p0, v2

    .line 1492
    .line 1493
    move/from16 v16, v4

    .line 1494
    .line 1495
    sget-object v0, Ltq0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1496
    .line 1497
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v0

    .line 1501
    invoke-static {v0, v11}, Ltq0;->β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    if-nez v0, :cond_52

    .line 1506
    .line 1507
    goto/16 :goto_36

    .line 1508
    .line 1509
    :cond_52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v2

    .line 1513
    invoke-static {v2, v9}, Ltq0;->β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v2

    .line 1517
    const/4 v5, 0x1

    .line 1518
    :try_start_19
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    invoke-static {v0}, Lh62;->к(Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    move-result v3

    .line 1529
    if-eqz v3, :cond_53

    .line 1530
    .line 1531
    check-cast v0, Ljava/util/List;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_14

    .line 1532
    .line 1533
    goto :goto_2e

    .line 1534
    :catchall_14
    move-exception v0

    .line 1535
    goto :goto_2d

    .line 1536
    :cond_53
    const/4 v0, 0x0

    .line 1537
    goto :goto_2e

    .line 1538
    :goto_2d
    new-instance v3, Leo1;

    .line 1539
    .line 1540
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1541
    .line 1542
    .line 1543
    move-object v0, v3

    .line 1544
    :goto_2e
    instance-of v3, v0, Leo1;

    .line 1545
    .line 1546
    if-eqz v3, :cond_54

    .line 1547
    .line 1548
    const/4 v0, 0x0

    .line 1549
    :cond_54
    move-object v3, v0

    .line 1550
    check-cast v3, Ljava/util/List;

    .line 1551
    .line 1552
    if-nez v3, :cond_55

    .line 1553
    .line 1554
    goto/16 :goto_36

    .line 1555
    .line 1556
    :cond_55
    if-eqz v2, :cond_56

    .line 1557
    .line 1558
    const/4 v5, 0x1

    .line 1559
    :try_start_1a
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1560
    .line 1561
    .line 1562
    goto :goto_2f

    .line 1563
    :catchall_15
    move-exception v0

    .line 1564
    goto :goto_31

    .line 1565
    :cond_56
    :goto_2f
    if-eqz v2, :cond_57

    .line 1566
    .line 1567
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    goto :goto_30

    .line 1572
    :cond_57
    const/4 v0, 0x0

    .line 1573
    :goto_30
    invoke-static {v0}, Lh62;->к(Ljava/lang/Object;)Z

    .line 1574
    .line 1575
    .line 1576
    move-result v1

    .line 1577
    if-eqz v1, :cond_58

    .line 1578
    .line 1579
    check-cast v0, Ljava/util/List;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_15

    .line 1580
    .line 1581
    goto :goto_32

    .line 1582
    :cond_58
    const/4 v0, 0x0

    .line 1583
    goto :goto_32

    .line 1584
    :goto_31
    new-instance v1, Leo1;

    .line 1585
    .line 1586
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1587
    .line 1588
    .line 1589
    move-object v0, v1

    .line 1590
    :goto_32
    instance-of v1, v0, Leo1;

    .line 1591
    .line 1592
    if-eqz v1, :cond_59

    .line 1593
    .line 1594
    const/4 v0, 0x0

    .line 1595
    :cond_59
    check-cast v0, Ljava/util/List;

    .line 1596
    .line 1597
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1598
    .line 1599
    .line 1600
    move-result v1

    .line 1601
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1602
    .line 1603
    .line 1604
    move-result v2

    .line 1605
    add-int/lit8 v2, v2, -0x1

    .line 1606
    .line 1607
    if-ltz v2, :cond_5e

    .line 1608
    .line 1609
    :goto_33
    add-int/lit8 v4, v2, -0x1

    .line 1610
    .line 1611
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v5

    .line 1615
    if-nez v5, :cond_5a

    .line 1616
    .line 1617
    goto :goto_34

    .line 1618
    :cond_5a
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v5

    .line 1622
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v5

    .line 1626
    invoke-static/range {p0 .. p0}, Lui1;->ω(Ljava/lang/String;)Z

    .line 1627
    .line 1628
    .line 1629
    move-result v6

    .line 1630
    if-eqz v6, :cond_5c

    .line 1631
    .line 1632
    const/4 v6, 0x1

    .line 1633
    invoke-static {v5, v13, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1634
    .line 1635
    .line 1636
    move-result v7

    .line 1637
    if-nez v7, :cond_5b

    .line 1638
    .line 1639
    const-string v7, "Story"

    .line 1640
    .line 1641
    invoke-static {v5, v7, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1642
    .line 1643
    .line 1644
    move-result v7

    .line 1645
    if-nez v7, :cond_5b

    .line 1646
    .line 1647
    const-string v7, "AvatarRing"

    .line 1648
    .line 1649
    invoke-static {v5, v7, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1650
    .line 1651
    .line 1652
    move-result v5

    .line 1653
    if-eqz v5, :cond_5c

    .line 1654
    .line 1655
    :cond_5b
    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1656
    .line 1657
    .line 1658
    if-eqz v0, :cond_5c

    .line 1659
    .line 1660
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1661
    .line 1662
    .line 1663
    move-result v5

    .line 1664
    if-ge v2, v5, :cond_5c

    .line 1665
    .line 1666
    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    :cond_5c
    :goto_34
    if-gez v4, :cond_5d

    .line 1670
    .line 1671
    goto :goto_35

    .line 1672
    :cond_5d
    move v2, v4

    .line 1673
    goto :goto_33

    .line 1674
    :cond_5e
    :goto_35
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1675
    .line 1676
    .line 1677
    move-result v0

    .line 1678
    if-eq v1, v0, :cond_5f

    .line 1679
    .line 1680
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1681
    .line 1682
    .line 1683
    move-result v0

    .line 1684
    sub-int/2addr v1, v0

    .line 1685
    const-string v0, "\u5df2\u79fb\u9664\u5934\u50cf\u5df2\u6ce8\u518c Presenter removed="

    .line 1686
    .line 1687
    invoke-static {v0, v1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v0

    .line 1691
    const/4 v2, 0x4

    .line 1692
    const/4 v5, 0x0

    .line 1693
    invoke-static {v12, v0, v5, v2, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1694
    .line 1695
    .line 1696
    :cond_5f
    :goto_36
    return-void

    .line 1697
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1698
    .line 1699
    .line 1700
    iget-object v0, v1, Lk01;->ε:Ljava/lang/Object;

    .line 1701
    .line 1702
    instance-of v1, v0, Landroid/view/View;

    .line 1703
    .line 1704
    if-eqz v1, :cond_60

    .line 1705
    .line 1706
    move-object v7, v0

    .line 1707
    check-cast v7, Landroid/view/View;

    .line 1708
    .line 1709
    goto :goto_37

    .line 1710
    :cond_60
    const/4 v7, 0x0

    .line 1711
    :goto_37
    if-nez v7, :cond_61

    .line 1712
    .line 1713
    goto :goto_38

    .line 1714
    :cond_61
    invoke-static {v7}, Lcp0;->α(Landroid/view/View;)V

    .line 1715
    .line 1716
    .line 1717
    new-instance v0, Ljb;

    .line 1718
    .line 1719
    const/16 v1, 0x19

    .line 1720
    .line 1721
    invoke-direct {v0, v7, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 1722
    .line 1723
    .line 1724
    invoke-virtual {v7, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1725
    .line 1726
    .line 1727
    new-instance v0, Ljb;

    .line 1728
    .line 1729
    const/16 v1, 0x1a

    .line 1730
    .line 1731
    invoke-direct {v0, v7, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 1732
    .line 1733
    .line 1734
    const-wide/16 v1, 0x78

    .line 1735
    .line 1736
    invoke-virtual {v7, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1737
    .line 1738
    .line 1739
    :goto_38
    return-void

    .line 1740
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1741
    .line 1742
    .line 1743
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1744
    .line 1745
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1746
    .line 1747
    .line 1748
    check-cast v0, Landroid/app/Dialog;

    .line 1749
    .line 1750
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v1

    .line 1754
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v1

    .line 1758
    sget-object v2, Lin0;->α:Landroid/os/Handler;

    .line 1759
    .line 1760
    const-string v2, "SharePanel"

    .line 1761
    .line 1762
    const/4 v5, 0x1

    .line 1763
    invoke-static {v1, v2, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1764
    .line 1765
    .line 1766
    move-result v2

    .line 1767
    if-nez v2, :cond_62

    .line 1768
    .line 1769
    goto/16 :goto_3a

    .line 1770
    .line 1771
    :cond_62
    invoke-static {}, Lin0;->α()V

    .line 1772
    .line 1773
    .line 1774
    sget-boolean v2, Lin0;->β:Z

    .line 1775
    .line 1776
    if-nez v2, :cond_63

    .line 1777
    .line 1778
    goto/16 :goto_3a

    .line 1779
    .line 1780
    :cond_63
    const-string v2, "DYHelper: \u5206\u4eab\u9762\u677f\u6253\u5f00: "

    .line 1781
    .line 1782
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v1

    .line 1786
    invoke-static {v1}, Lux;->ρ(Ljava/lang/String;)V

    .line 1787
    .line 1788
    .line 1789
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 1790
    .line 1791
    .line 1792
    move-result v1

    .line 1793
    if-nez v1, :cond_64

    .line 1794
    .line 1795
    goto :goto_3a

    .line 1796
    :cond_64
    invoke-static {v0}, Lin0;->ζ(Landroid/app/Dialog;)Z

    .line 1797
    .line 1798
    .line 1799
    move-result v1

    .line 1800
    if-eqz v1, :cond_65

    .line 1801
    .line 1802
    const-string v0, "DYHelper: \u5206\u4eab\u9762\u677f\u5df2\u540c\u6b65\u6ce8\u5165\u5feb\u6377\u64cd\u4f5c"

    .line 1803
    .line 1804
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1805
    .line 1806
    .line 1807
    goto :goto_3a

    .line 1808
    :cond_65
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v1

    .line 1812
    if-eqz v1, :cond_66

    .line 1813
    .line 1814
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v5

    .line 1818
    goto :goto_39

    .line 1819
    :cond_66
    const/4 v5, 0x0

    .line 1820
    :goto_39
    if-nez v5, :cond_67

    .line 1821
    .line 1822
    const/4 v1, 0x0

    .line 1823
    invoke-static {v0, v1}, Lin0;->β(Landroid/app/Dialog;I)V

    .line 1824
    .line 1825
    .line 1826
    goto :goto_3a

    .line 1827
    :cond_67
    const/4 v1, 0x0

    .line 1828
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1829
    .line 1830
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 1831
    .line 1832
    .line 1833
    new-instance v3, Lum1;

    .line 1834
    .line 1835
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1836
    .line 1837
    .line 1838
    new-instance v4, Lxb0;

    .line 1839
    .line 1840
    invoke-direct {v4, v2, v5, v3, v0}, Lxb0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/view/View;Lum1;Landroid/app/Dialog;)V

    .line 1841
    .line 1842
    .line 1843
    new-instance v2, Ldn0;

    .line 1844
    .line 1845
    invoke-direct {v2, v1, v4}, Ldn0;-><init>(ILjava/lang/Object;)V

    .line 1846
    .line 1847
    .line 1848
    iput-object v2, v3, Lum1;->ε:Ljava/lang/Object;

    .line 1849
    .line 1850
    invoke-virtual {v5}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v1

    .line 1854
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 1855
    .line 1856
    .line 1857
    move-result v2

    .line 1858
    if-eqz v2, :cond_69

    .line 1859
    .line 1860
    iget-object v0, v3, Lum1;->ε:Ljava/lang/Object;

    .line 1861
    .line 1862
    if-eqz v0, :cond_68

    .line 1863
    .line 1864
    check-cast v0, Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 1865
    .line 1866
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1867
    .line 1868
    .line 1869
    sget-object v0, Lin0;->α:Landroid/os/Handler;

    .line 1870
    .line 1871
    new-instance v1, Lν;

    .line 1872
    .line 1873
    const/16 v2, 0x15

    .line 1874
    .line 1875
    invoke-direct {v1, v2, v4}, Lν;-><init>(ILjava/lang/Object;)V

    .line 1876
    .line 1877
    .line 1878
    const-wide/16 v2, 0x20

    .line 1879
    .line 1880
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1881
    .line 1882
    .line 1883
    goto :goto_3a

    .line 1884
    :cond_68
    const-string v0, "firstFrameListener"

    .line 1885
    .line 1886
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 1887
    .line 1888
    .line 1889
    const/16 v20, 0x0

    .line 1890
    .line 1891
    throw v20

    .line 1892
    :cond_69
    const/4 v1, 0x0

    .line 1893
    invoke-static {v0, v1}, Lin0;->β(Landroid/app/Dialog;I)V

    .line 1894
    .line 1895
    .line 1896
    :goto_3a
    return-void

    .line 1897
    :pswitch_c
    move-object/from16 v20, v7

    .line 1898
    .line 1899
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1900
    .line 1901
    .line 1902
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1903
    .line 1904
    instance-of v1, v0, Landroid/app/Activity;

    .line 1905
    .line 1906
    if-eqz v1, :cond_6a

    .line 1907
    .line 1908
    move-object v7, v0

    .line 1909
    check-cast v7, Landroid/app/Activity;

    .line 1910
    .line 1911
    goto :goto_3b

    .line 1912
    :cond_6a
    move-object/from16 v7, v20

    .line 1913
    .line 1914
    :goto_3b
    if-nez v7, :cond_6b

    .line 1915
    .line 1916
    goto :goto_3c

    .line 1917
    :cond_6b
    sget-object v0, Lil0;->β:Ljava/util/Set;

    .line 1918
    .line 1919
    invoke-interface {v0, v7}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1920
    .line 1921
    .line 1922
    :goto_3c
    return-void

    .line 1923
    :pswitch_d
    move-object/from16 v20, v7

    .line 1924
    .line 1925
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1926
    .line 1927
    .line 1928
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1929
    .line 1930
    const/16 v17, 0x0

    .line 1931
    .line 1932
    aget-object v0, v0, v17

    .line 1933
    .line 1934
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 1935
    .line 1936
    if-eqz v2, :cond_6c

    .line 1937
    .line 1938
    move-object v5, v0

    .line 1939
    check-cast v5, Ljava/lang/Boolean;

    .line 1940
    .line 1941
    goto :goto_3d

    .line 1942
    :cond_6c
    move-object/from16 v5, v20

    .line 1943
    .line 1944
    :goto_3d
    if-eqz v5, :cond_6d

    .line 1945
    .line 1946
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1947
    .line 1948
    .line 1949
    move-result v6

    .line 1950
    goto :goto_3e

    .line 1951
    :cond_6d
    const/4 v6, 0x0

    .line 1952
    :goto_3e
    if-nez v6, :cond_6e

    .line 1953
    .line 1954
    goto :goto_40

    .line 1955
    :cond_6e
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1956
    .line 1957
    instance-of v1, v0, Landroid/app/Activity;

    .line 1958
    .line 1959
    if-eqz v1, :cond_6f

    .line 1960
    .line 1961
    move-object v7, v0

    .line 1962
    check-cast v7, Landroid/app/Activity;

    .line 1963
    .line 1964
    goto :goto_3f

    .line 1965
    :cond_6f
    move-object/from16 v7, v20

    .line 1966
    .line 1967
    :goto_3f
    if-nez v7, :cond_70

    .line 1968
    .line 1969
    goto :goto_40

    .line 1970
    :cond_70
    sget-object v0, Lil0;->β:Ljava/util/Set;

    .line 1971
    .line 1972
    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1973
    .line 1974
    .line 1975
    invoke-static {v7}, Lil0;->α(Landroid/app/Activity;)V

    .line 1976
    .line 1977
    .line 1978
    :goto_40
    return-void

    .line 1979
    :pswitch_e
    move-object/from16 v20, v7

    .line 1980
    .line 1981
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1982
    .line 1983
    .line 1984
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1985
    .line 1986
    instance-of v1, v0, Landroid/app/Activity;

    .line 1987
    .line 1988
    if-eqz v1, :cond_71

    .line 1989
    .line 1990
    move-object v7, v0

    .line 1991
    check-cast v7, Landroid/app/Activity;

    .line 1992
    .line 1993
    goto :goto_41

    .line 1994
    :cond_71
    move-object/from16 v7, v20

    .line 1995
    .line 1996
    :goto_41
    if-nez v7, :cond_72

    .line 1997
    .line 1998
    goto :goto_42

    .line 1999
    :cond_72
    sget-object v0, Lil0;->β:Ljava/util/Set;

    .line 2000
    .line 2001
    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2002
    .line 2003
    .line 2004
    invoke-static {v7}, Lil0;->α(Landroid/app/Activity;)V

    .line 2005
    .line 2006
    .line 2007
    :goto_42
    return-void

    .line 2008
    :pswitch_f
    move-object/from16 v20, v7

    .line 2009
    .line 2010
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2011
    .line 2012
    .line 2013
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 2014
    .line 2015
    instance-of v1, v0, Landroid/app/Activity;

    .line 2016
    .line 2017
    if-eqz v1, :cond_73

    .line 2018
    .line 2019
    move-object v7, v0

    .line 2020
    check-cast v7, Landroid/app/Activity;

    .line 2021
    .line 2022
    goto :goto_43

    .line 2023
    :cond_73
    move-object/from16 v7, v20

    .line 2024
    .line 2025
    :goto_43
    if-nez v7, :cond_74

    .line 2026
    .line 2027
    goto :goto_44

    .line 2028
    :cond_74
    sget-object v0, Lil0;->β:Ljava/util/Set;

    .line 2029
    .line 2030
    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2031
    .line 2032
    .line 2033
    invoke-static {v7}, Lil0;->α(Landroid/app/Activity;)V

    .line 2034
    .line 2035
    .line 2036
    :goto_44
    return-void

    .line 2037
    :pswitch_10
    move-object/from16 v20, v7

    .line 2038
    .line 2039
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2040
    .line 2041
    .line 2042
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 2043
    .line 2044
    const/16 v17, 0x0

    .line 2045
    .line 2046
    aget-object v0, v0, v17

    .line 2047
    .line 2048
    instance-of v1, v0, Landroid/graphics/Bitmap;

    .line 2049
    .line 2050
    if-eqz v1, :cond_75

    .line 2051
    .line 2052
    move-object v7, v0

    .line 2053
    check-cast v7, Landroid/graphics/Bitmap;

    .line 2054
    .line 2055
    goto :goto_45

    .line 2056
    :cond_75
    move-object/from16 v7, v20

    .line 2057
    .line 2058
    :goto_45
    if-nez v7, :cond_76

    .line 2059
    .line 2060
    goto :goto_46

    .line 2061
    :cond_76
    invoke-static {v7}, Lxk0;->α(Landroid/graphics/Bitmap;)V

    .line 2062
    .line 2063
    .line 2064
    :goto_46
    return-void

    .line 2065
    :pswitch_11
    move-object/from16 v20, v7

    .line 2066
    .line 2067
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2068
    .line 2069
    .line 2070
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 2071
    .line 2072
    instance-of v1, v0, Landroid/view/View;

    .line 2073
    .line 2074
    if-eqz v1, :cond_77

    .line 2075
    .line 2076
    move-object v7, v0

    .line 2077
    check-cast v7, Landroid/view/View;

    .line 2078
    .line 2079
    goto :goto_47

    .line 2080
    :cond_77
    move-object/from16 v7, v20

    .line 2081
    .line 2082
    :goto_47
    if-nez v7, :cond_78

    .line 2083
    .line 2084
    goto :goto_48

    .line 2085
    :cond_78
    sget-object v0, Lxk0;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2086
    .line 2087
    new-instance v1, Lwk0;

    .line 2088
    .line 2089
    const/4 v2, 0x0

    .line 2090
    invoke-direct {v1, v7, v2}, Lwk0;-><init>(Landroid/view/View;I)V

    .line 2091
    .line 2092
    .line 2093
    invoke-static {v0, v1}, Lxh;->Ч(Ljava/util/List;La80;)Z

    .line 2094
    .line 2095
    .line 2096
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 2097
    .line 2098
    .line 2099
    :goto_48
    return-void

    .line 2100
    :pswitch_12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2101
    .line 2102
    .line 2103
    sget-object v0, Lxk0;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2104
    .line 2105
    return-void

    .line 2106
    :pswitch_13
    move-object/from16 v20, v7

    .line 2107
    .line 2108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2109
    .line 2110
    .line 2111
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 2112
    .line 2113
    instance-of v1, v0, Landroid/view/View;

    .line 2114
    .line 2115
    if-eqz v1, :cond_79

    .line 2116
    .line 2117
    move-object v7, v0

    .line 2118
    check-cast v7, Landroid/view/View;

    .line 2119
    .line 2120
    goto :goto_49

    .line 2121
    :cond_79
    move-object/from16 v7, v20

    .line 2122
    .line 2123
    :goto_49
    if-nez v7, :cond_7a

    .line 2124
    .line 2125
    goto :goto_4a

    .line 2126
    :cond_7a
    sget-object v0, Lxk0;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2127
    .line 2128
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 2129
    .line 2130
    invoke-direct {v1, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 2131
    .line 2132
    .line 2133
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2134
    .line 2135
    .line 2136
    :goto_4a
    return-void

    .line 2137
    :pswitch_14
    move-object/from16 v20, v7

    .line 2138
    .line 2139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2140
    .line 2141
    .line 2142
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 2143
    .line 2144
    if-nez v0, :cond_7b

    .line 2145
    .line 2146
    goto :goto_4c

    .line 2147
    :cond_7b
    sget-object v1, Lzj0;->α:Lzj0;

    .line 2148
    .line 2149
    invoke-static {v0}, Lzj0;->ο(Ljava/lang/Object;)Z

    .line 2150
    .line 2151
    .line 2152
    move-result v1

    .line 2153
    if-nez v1, :cond_7c

    .line 2154
    .line 2155
    goto :goto_4c

    .line 2156
    :cond_7c
    sget-object v1, Lzj0;->β:Ljava/lang/ref/WeakReference;

    .line 2157
    .line 2158
    if-eqz v1, :cond_7d

    .line 2159
    .line 2160
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 2161
    .line 2162
    .line 2163
    move-result-object v7

    .line 2164
    goto :goto_4b

    .line 2165
    :cond_7d
    move-object/from16 v7, v20

    .line 2166
    .line 2167
    :goto_4b
    if-ne v7, v0, :cond_7e

    .line 2168
    .line 2169
    goto :goto_4c

    .line 2170
    :cond_7e
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 2171
    .line 2172
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 2173
    .line 2174
    .line 2175
    sput-object v1, Lzj0;->β:Ljava/lang/ref/WeakReference;

    .line 2176
    .line 2177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v0

    .line 2181
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v0

    .line 2185
    const-string v1, "DYHelperIMMarkAllReadHelper: \u6355\u83b7\u6d88\u606f\u5e95\u680f Helper \u5b9e\u4f8b: constructor -> "

    .line 2186
    .line 2187
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v0

    .line 2191
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 2192
    .line 2193
    .line 2194
    :goto_4c
    return-void

    .line 2195
    :pswitch_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2196
    .line 2197
    .line 2198
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 2199
    .line 2200
    if-nez v0, :cond_7f

    .line 2201
    .line 2202
    goto :goto_4d

    .line 2203
    :cond_7f
    const-string v1, "constructor"

    .line 2204
    .line 2205
    invoke-static {v0, v1}, Lzj0;->δ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2206
    .line 2207
    .line 2208
    :goto_4d
    return-void

    .line 2209
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Loj0;->α:I

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    sparse-switch v2, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-super/range {p0 .. p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :sswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    :try_start_0
    sget-object v0, Lbd1;->α:Ljava/util/Set;

    .line 21
    .line 22
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lbd1;->δ([Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    new-instance v1, Leo1;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object v0, v1

    .line 40
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    const-string v1, "rc2954fec18baf260"

    .line 47
    .line 48
    const-string v2, "\u89c2\u5bdf\u8425\u5730\u54cd\u5e94\u5931\u8d25"

    .line 49
    .line 50
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void

    .line 54
    :sswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    :try_start_1
    sget-object v0, Lbd1;->α:Ljava/util/Set;

    .line 58
    .line 59
    sget-object v0, Lhe1;->α:Lym1;

    .line 60
    .line 61
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v5, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    instance-of v1, v0, Ljava/util/Map;

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    move-object v6, v0

    .line 75
    check-cast v6, Ljava/util/Map;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    const/4 v6, 0x0

    .line 79
    :goto_1
    invoke-static {v6}, Lhe1;->β(Ljava/util/Map;)Lee1;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v1, "common_params"

    .line 84
    .line 85
    invoke-static {v0, v1}, Lbd1;->η(Lee1;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    new-instance v1, Leo1;

    .line 93
    .line 94
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    move-object v0, v1

    .line 98
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_2

    .line 103
    .line 104
    const-string v1, "rc2954fec18baf260"

    .line 105
    .line 106
    const-string v2, "\u89c2\u5bdf\u4e16\u754c\u516c\u5171\u53c2\u6570\u5931\u8d25"

    .line 107
    .line 108
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    return-void

    .line 112
    :sswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 116
    .line 117
    :try_start_2
    sget-object v2, Lbd1;->α:Ljava/util/Set;

    .line 118
    .line 119
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {v5, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    instance-of v3, v2, Ljava/lang/Number;

    .line 129
    .line 130
    if-eqz v3, :cond_3

    .line 131
    .line 132
    check-cast v2, Ljava/lang/Number;

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_3
    const/4 v2, 0x0

    .line 136
    :goto_3
    if-eqz v2, :cond_4

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    goto :goto_4

    .line 147
    :cond_4
    const/4 v2, 0x0

    .line 148
    :goto_4
    invoke-static {v4, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-eqz v0, :cond_5

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    goto :goto_5

    .line 159
    :cond_5
    const/4 v6, 0x0

    .line 160
    :goto_5
    invoke-static {v1, v2, v6}, Lbd1;->β(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    sget-object v0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :catchall_2
    move-exception v0

    .line 167
    new-instance v1, Leo1;

    .line 168
    .line 169
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    move-object v0, v1

    .line 173
    :goto_6
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-eqz v0, :cond_6

    .line 178
    .line 179
    const-string v1, "rc2954fec18baf260"

    .line 180
    .line 181
    const-string v2, "\u89c2\u5bdf\u8425\u5730\u6865\u63a5\u5931\u8d25\u56de\u8c03\u5931\u8d25"

    .line 182
    .line 183
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    :cond_6
    return-void

    .line 187
    :sswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    :try_start_3
    sget-object v0, Lbd1;->α:Ljava/util/Set;

    .line 191
    .line 192
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 193
    .line 194
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-static {v5, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    instance-of v2, v1, Lorg/json/JSONObject;

    .line 204
    .line 205
    if-eqz v2, :cond_7

    .line 206
    .line 207
    move-object v6, v1

    .line 208
    check-cast v6, Lorg/json/JSONObject;

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_7
    const/4 v6, 0x0

    .line 212
    :goto_7
    invoke-static {v0, v6}, Lbd1;->γ(Ljava/lang/Object;Lorg/json/JSONObject;)V

    .line 213
    .line 214
    .line 215
    sget-object v0, Ls62;->α:Ls62;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :catchall_3
    move-exception v0

    .line 219
    new-instance v1, Leo1;

    .line 220
    .line 221
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    move-object v0, v1

    .line 225
    :goto_8
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-eqz v0, :cond_8

    .line 230
    .line 231
    const-string v1, "rc2954fec18baf260"

    .line 232
    .line 233
    const-string v2, "\u89c2\u5bdf\u8425\u5730\u6865\u63a5\u6210\u529f\u56de\u8c03\u5931\u8d25"

    .line 234
    .line 235
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    :cond_8
    return-void

    .line 239
    :sswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    :try_start_4
    sget-object v0, Lbd1;->α:Ljava/util/Set;

    .line 243
    .line 244
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-static {v0}, Lbd1;->α([Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    sget-object v0, Ls62;->α:Ls62;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 253
    .line 254
    goto :goto_9

    .line 255
    :catchall_4
    move-exception v0

    .line 256
    new-instance v1, Leo1;

    .line 257
    .line 258
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 259
    .line 260
    .line 261
    move-object v0, v1

    .line 262
    :goto_9
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-eqz v0, :cond_9

    .line 267
    .line 268
    const-string v1, "rc2954fec18baf260"

    .line 269
    .line 270
    const-string v2, "\u89c2\u5bdf\u8425\u5730\u8bf7\u6c42\u5931\u8d25"

    .line 271
    .line 272
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    :cond_9
    return-void

    .line 276
    :sswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    sget-boolean v0, Ljx0;->ρ:Z

    .line 280
    .line 281
    if-nez v0, :cond_a

    .line 282
    .line 283
    goto :goto_b

    .line 284
    :cond_a
    sget v0, Ljx0;->σ:I

    .line 285
    .line 286
    sget-object v2, Ln41;->α:Ljava/util/Set;

    .line 287
    .line 288
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    if-eqz v2, :cond_b

    .line 297
    .line 298
    goto :goto_b

    .line 299
    :cond_b
    iget-object v2, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 300
    .line 301
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-static {v5, v2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    instance-of v3, v2, Ljava/lang/Integer;

    .line 309
    .line 310
    if-eqz v3, :cond_c

    .line 311
    .line 312
    move-object v6, v2

    .line 313
    check-cast v6, Ljava/lang/Integer;

    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_c
    const/4 v6, 0x0

    .line 317
    :goto_a
    if-eqz v6, :cond_e

    .line 318
    .line 319
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-eq v2, v0, :cond_d

    .line 324
    .line 325
    goto :goto_b

    .line 326
    :cond_d
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 327
    .line 328
    const/16 v2, 0xc8

    .line 329
    .line 330
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    aput-object v2, v1, v5

    .line 335
    .line 336
    sget-object v1, Lm41;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 337
    .line 338
    new-instance v1, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    const-string v2, "[ui] selection_alias custom="

    .line 341
    .line 342
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    const-string v0, " native_slot=200"

    .line 349
    .line 350
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v0}, Lm41;->γ(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    :cond_e
    :goto_b
    return-void

    .line 361
    :sswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    sget-boolean v0, Ljx0;->ρ:Z

    .line 365
    .line 366
    if-nez v0, :cond_f

    .line 367
    .line 368
    goto :goto_c

    .line 369
    :cond_f
    sget-object v2, Lxn0;->λ:Lxn0;

    .line 370
    .line 371
    sget v0, Ljx0;->σ:I

    .line 372
    .line 373
    const-string v1, "[rebuild] panel_adjust_requested count="

    .line 374
    .line 375
    monitor-enter v2

    .line 376
    :try_start_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    sput-object v3, Lxn0;->ν:Ljava/lang/Integer;

    .line 381
    .line 382
    new-instance v3, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    const-string v1, "DYH-OfflineCache"

    .line 395
    .line 396
    invoke-static {v1, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 397
    .line 398
    .line 399
    monitor-exit v2

    .line 400
    :goto_c
    return-void

    .line 401
    :catchall_5
    move-exception v0

    .line 402
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 403
    throw v0

    .line 404
    :sswitch_7
    const-string v0, "^\\d+(\\.\\d+)?\u4e07\\+?$"

    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    sget-object v2, Ltu0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 410
    .line 411
    const-string v2, ""

    .line 412
    .line 413
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 414
    .line 415
    if-nez v1, :cond_10

    .line 416
    .line 417
    goto/16 :goto_14

    .line 418
    .line 419
    :cond_10
    array-length v7, v1

    .line 420
    if-ge v7, v3, :cond_11

    .line 421
    .line 422
    goto/16 :goto_14

    .line 423
    .line 424
    :cond_11
    aget-object v3, v1, v5

    .line 425
    .line 426
    instance-of v7, v3, Ljava/lang/Number;

    .line 427
    .line 428
    if-eqz v7, :cond_12

    .line 429
    .line 430
    check-cast v3, Ljava/lang/Number;

    .line 431
    .line 432
    goto :goto_d

    .line 433
    :cond_12
    const/4 v3, 0x0

    .line 434
    :goto_d
    if-eqz v3, :cond_23

    .line 435
    .line 436
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 437
    .line 438
    .line 439
    move-result-wide v7

    .line 440
    const-wide/16 v9, 0x2710

    .line 441
    .line 442
    cmp-long v3, v9, v7

    .line 443
    .line 444
    if-gtz v3, :cond_23

    .line 445
    .line 446
    const-wide/32 v11, 0x5f5e101

    .line 447
    .line 448
    .line 449
    cmp-long v3, v7, v11

    .line 450
    .line 451
    if-gez v3, :cond_23

    .line 452
    .line 453
    aget-object v3, v1, v4

    .line 454
    .line 455
    if-eqz v3, :cond_13

    .line 456
    .line 457
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    goto :goto_e

    .line 462
    :cond_13
    const/4 v3, 0x0

    .line 463
    :goto_e
    if-nez v3, :cond_14

    .line 464
    .line 465
    move-object v3, v2

    .line 466
    :cond_14
    invoke-static {v3}, Ltu0;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 471
    .line 472
    .line 473
    move-result v11

    .line 474
    if-nez v11, :cond_15

    .line 475
    .line 476
    goto/16 :goto_14

    .line 477
    .line 478
    :cond_15
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v11

    .line 482
    invoke-virtual {v3, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v11

    .line 486
    if-eqz v11, :cond_16

    .line 487
    .line 488
    goto/16 :goto_14

    .line 489
    .line 490
    :cond_16
    const-string v11, "+"

    .line 491
    .line 492
    invoke-static {v3}, Ltu0;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v12

    .line 496
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 497
    .line 498
    .line 499
    move-result-object v13

    .line 500
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v13, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 507
    .line 508
    .line 509
    move-result-object v13

    .line 510
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->matches()Z

    .line 511
    .line 512
    .line 513
    move-result v13

    .line 514
    const/4 v14, 0x2

    .line 515
    if-nez v13, :cond_18

    .line 516
    .line 517
    :cond_17
    move/from16 v16, v4

    .line 518
    .line 519
    move-wide/from16 v17, v7

    .line 520
    .line 521
    const/4 v5, 0x0

    .line 522
    goto/16 :goto_10

    .line 523
    .line 524
    :cond_18
    invoke-static {v12, v11, v5}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 525
    .line 526
    .line 527
    move-result v13

    .line 528
    invoke-static {v12, v11}, Lq02;->о(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v11

    .line 532
    const-string v12, "\u4e07"

    .line 533
    .line 534
    invoke-static {v11, v12}, Lq02;->о(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v11

    .line 538
    invoke-static {v11}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 539
    .line 540
    .line 541
    move-result-object v11

    .line 542
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v11

    .line 546
    invoke-static {v11}, Lw02;->Θ(Ljava/lang/String;)Ljava/lang/Double;

    .line 547
    .line 548
    .line 549
    move-result-object v12

    .line 550
    if-eqz v12, :cond_17

    .line 551
    .line 552
    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    .line 553
    .line 554
    .line 555
    move-result-wide v15

    .line 556
    const-wide v17, 0x40c3880000000000L    # 10000.0

    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    move-wide/from16 p0, v9

    .line 562
    .line 563
    mul-double v9, v15, v17

    .line 564
    .line 565
    double-to-long v9, v9

    .line 566
    if-eqz v13, :cond_19

    .line 567
    .line 568
    new-instance v5, Lsu0;

    .line 569
    .line 570
    const-wide v11, 0x7fffffffffffffffL

    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    invoke-direct {v5, v9, v10, v11, v12}, Lsu0;-><init>(JJ)V

    .line 576
    .line 577
    .line 578
    move/from16 v16, v4

    .line 579
    .line 580
    move-wide/from16 v17, v7

    .line 581
    .line 582
    goto :goto_10

    .line 583
    :cond_19
    const/16 v12, 0x2e

    .line 584
    .line 585
    const/4 v13, 0x6

    .line 586
    invoke-static {v11, v12, v5, v13}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 587
    .line 588
    .line 589
    move-result v12

    .line 590
    if-ltz v12, :cond_1c

    .line 591
    .line 592
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 593
    .line 594
    .line 595
    move-result v11

    .line 596
    sub-int/2addr v11, v12

    .line 597
    sub-int/2addr v11, v4

    .line 598
    const/4 v12, 0x3

    .line 599
    invoke-static {v11, v4, v12}, Lj81;->μ(III)I

    .line 600
    .line 601
    .line 602
    move-result v11

    .line 603
    move-wide/from16 v12, p0

    .line 604
    .line 605
    :goto_f
    if-ge v5, v11, :cond_1a

    .line 606
    .line 607
    const/16 v15, 0xa

    .line 608
    .line 609
    move/from16 v16, v4

    .line 610
    .line 611
    move/from16 v17, v5

    .line 612
    .line 613
    int-to-long v4, v15

    .line 614
    div-long/2addr v12, v4

    .line 615
    add-int/lit8 v5, v17, 0x1

    .line 616
    .line 617
    move/from16 v4, v16

    .line 618
    .line 619
    goto :goto_f

    .line 620
    :cond_1a
    move/from16 v16, v4

    .line 621
    .line 622
    const-wide/16 v4, 0x0

    .line 623
    .line 624
    cmp-long v4, v12, v4

    .line 625
    .line 626
    if-gtz v4, :cond_1b

    .line 627
    .line 628
    const-wide/16 v12, 0x1

    .line 629
    .line 630
    :cond_1b
    new-instance v5, Lsu0;

    .line 631
    .line 632
    move-wide/from16 v17, v7

    .line 633
    .line 634
    int-to-long v6, v14

    .line 635
    div-long v6, v12, v6

    .line 636
    .line 637
    sub-long v6, v9, v6

    .line 638
    .line 639
    add-long/2addr v9, v12

    .line 640
    invoke-direct {v5, v6, v7, v9, v10}, Lsu0;-><init>(JJ)V

    .line 641
    .line 642
    .line 643
    goto :goto_10

    .line 644
    :cond_1c
    move/from16 v16, v4

    .line 645
    .line 646
    move-wide/from16 v17, v7

    .line 647
    .line 648
    new-instance v5, Lsu0;

    .line 649
    .line 650
    add-long v6, v9, p0

    .line 651
    .line 652
    invoke-direct {v5, v9, v10, v6, v7}, Lsu0;-><init>(JJ)V

    .line 653
    .line 654
    .line 655
    :goto_10
    if-nez v5, :cond_1d

    .line 656
    .line 657
    goto :goto_14

    .line 658
    :cond_1d
    iget-wide v6, v5, Lsu0;->α:J

    .line 659
    .line 660
    cmp-long v6, v17, v6

    .line 661
    .line 662
    if-ltz v6, :cond_23

    .line 663
    .line 664
    iget-wide v5, v5, Lsu0;->β:J

    .line 665
    .line 666
    cmp-long v5, v17, v5

    .line 667
    .line 668
    if-gez v5, :cond_23

    .line 669
    .line 670
    invoke-static/range {v17 .. v18}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v5

    .line 674
    aget-object v6, v1, v16

    .line 675
    .line 676
    if-eqz v6, :cond_1e

    .line 677
    .line 678
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v6

    .line 682
    goto :goto_11

    .line 683
    :cond_1e
    const/4 v6, 0x0

    .line 684
    :goto_11
    invoke-static {v6, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v6

    .line 688
    if-eqz v6, :cond_1f

    .line 689
    .line 690
    goto :goto_14

    .line 691
    :cond_1f
    aput-object v5, v1, v16

    .line 692
    .line 693
    aget-object v6, v1, v14

    .line 694
    .line 695
    if-eqz v6, :cond_20

    .line 696
    .line 697
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v6

    .line 701
    goto :goto_12

    .line 702
    :cond_20
    const/4 v6, 0x0

    .line 703
    :goto_12
    if-nez v6, :cond_21

    .line 704
    .line 705
    goto :goto_13

    .line 706
    :cond_21
    move-object v2, v6

    .line 707
    :goto_13
    invoke-static {v2}, Ltu0;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    if-nez v3, :cond_22

    .line 716
    .line 717
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    if-nez v3, :cond_22

    .line 722
    .line 723
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    if-eqz v0, :cond_23

    .line 742
    .line 743
    :cond_22
    aput-object v5, v1, v14

    .line 744
    .line 745
    :cond_23
    :goto_14
    return-void

    .line 746
    :sswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    sget-object v0, Lpj0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 750
    .line 751
    invoke-static {}, Lpj0;->β()Z

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    if-nez v0, :cond_24

    .line 756
    .line 757
    goto :goto_17

    .line 758
    :cond_24
    sget-object v0, Lpj0;->β:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 759
    .line 760
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 761
    .line 762
    .line 763
    move-result v0

    .line 764
    const/16 v2, 0x14

    .line 765
    .line 766
    if-le v0, v2, :cond_26

    .line 767
    .line 768
    rem-int/lit8 v2, v0, 0x32

    .line 769
    .line 770
    if-nez v2, :cond_25

    .line 771
    .line 772
    goto :goto_15

    .line 773
    :cond_25
    const/4 v4, 0x0

    .line 774
    goto :goto_16

    .line 775
    :cond_26
    :goto_15
    const-string v2, "DYHelper"

    .line 776
    .line 777
    const-string v5, "\u52ff\u6270\u6a21\u5f0f\u62e6\u622a\u6d88\u606fTab\u89d2\u6807\u4e0a\u5c4f LIZ #"

    .line 778
    .line 779
    invoke-static {v5, v0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    const/4 v4, 0x0

    .line 784
    invoke-static {v2, v0, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 785
    .line 786
    .line 787
    :goto_16
    invoke-static {}, Lpj0;->α()V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v1, v4}, Lk01;->α(Ljava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    :goto_17
    return-void

    .line 794
    nop

    .line 795
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_8
        0x10 -> :sswitch_7
        0x16 -> :sswitch_6
        0x18 -> :sswitch_5
        0x19 -> :sswitch_4
        0x1a -> :sswitch_3
        0x1b -> :sswitch_2
        0x1c -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method
