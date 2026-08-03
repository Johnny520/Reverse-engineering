.class public final synthetic Lg8/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lo8/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg8/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lg8/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ll8/a;)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lg8/e;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, Lg8/e;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lk8/i;

    .line 13
    .line 14
    iget-object v3, v0, Ll8/a;->d:Landroid/content/ContentValues;

    .line 15
    .line 16
    const-string v4, "message"

    .line 17
    .line 18
    iget-object v5, v0, Ll8/a;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    goto/16 :goto_13

    .line 27
    .line 28
    :cond_0
    const-string v4, "msgid"

    .line 29
    .line 30
    const-string v5, "msgId"

    .line 31
    .line 32
    invoke-static {v3, v5}, Lk8/i;->c(Landroid/content/ContentValues;Ljava/lang/String;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    const-wide/16 v7, 0x0

    .line 37
    .line 38
    cmp-long v9, v5, v7

    .line 39
    .line 40
    const/4 v10, 0x0

    .line 41
    if-lez v9, :cond_1

    .line 42
    .line 43
    :goto_0
    move-wide v12, v5

    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_1
    invoke-static {v3, v4}, Lk8/i;->c(Landroid/content/ContentValues;Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    cmp-long v9, v5, v7

    .line 51
    .line 52
    if-lez v9, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const-string v5, "_id"

    .line 56
    .line 57
    invoke-static {v3, v5}, Lk8/i;->c(Landroid/content/ContentValues;Ljava/lang/String;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    cmp-long v9, v5, v7

    .line 62
    .line 63
    if-lez v9, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    const-string v5, "rowid"

    .line 67
    .line 68
    invoke-static {v3, v5}, Lk8/i;->c(Landroid/content/ContentValues;Ljava/lang/String;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v5

    .line 72
    cmp-long v9, v5, v7

    .line 73
    .line 74
    if-lez v9, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    const-string v5, "insert"

    .line 78
    .line 79
    iget-object v6, v0, Ll8/a;->a:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_5

    .line 86
    .line 87
    iget-wide v5, v0, Ll8/a;->c:J

    .line 88
    .line 89
    cmp-long v9, v5, v7

    .line 90
    .line 91
    if-lez v9, :cond_5

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    iget-object v5, v0, Ll8/a;->e:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v6, v0, Ll8/a;->f:[Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-nez v9, :cond_b

    .line 103
    .line 104
    if-eqz v6, :cond_b

    .line 105
    .line 106
    array-length v9, v6

    .line 107
    if-nez v9, :cond_6

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 111
    .line 112
    invoke-virtual {v5, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v5, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-nez v4, :cond_7

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    array-length v4, v6

    .line 124
    move v5, v10

    .line 125
    :goto_1
    if-ge v5, v4, :cond_a

    .line 126
    .line 127
    aget-object v9, v6, v5

    .line 128
    .line 129
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    if-eqz v11, :cond_8

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_8
    :try_start_0
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 137
    .line 138
    .line 139
    move-result-wide v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    cmp-long v9, v11, v7

    .line 141
    .line 142
    if-lez v9, :cond_9

    .line 143
    .line 144
    move-wide v5, v11

    .line 145
    goto :goto_0

    .line 146
    :catchall_0
    :cond_9
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_a
    move-wide v5, v7

    .line 150
    goto :goto_0

    .line 151
    :cond_b
    :goto_3
    move-wide v12, v7

    .line 152
    :goto_4
    cmp-long v4, v12, v7

    .line 153
    .line 154
    if-lez v4, :cond_c

    .line 155
    .line 156
    iget-object v4, v2, Lk8/i;->b:Lk8/s;

    .line 157
    .line 158
    if-eqz v4, :cond_c

    .line 159
    .line 160
    invoke-virtual {v4, v12, v13}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    if-eqz v4, :cond_c

    .line 165
    .line 166
    goto/16 :goto_11

    .line 167
    .line 168
    :cond_c
    const/4 v4, 0x0

    .line 169
    if-nez v3, :cond_d

    .line 170
    .line 171
    goto/16 :goto_11

    .line 172
    .line 173
    :cond_d
    new-instance v11, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 174
    .line 175
    const-string v5, "msgSvrId"

    .line 176
    .line 177
    invoke-static {v3, v5}, Lk8/i;->c(Landroid/content/ContentValues;Ljava/lang/String;)J

    .line 178
    .line 179
    .line 180
    move-result-wide v14

    .line 181
    const-string v5, "type"

    .line 182
    .line 183
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-nez v6, :cond_f

    .line 188
    .line 189
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    if-nez v6, :cond_e

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_e
    :try_start_1
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 200
    goto :goto_6

    .line 201
    :catchall_1
    :cond_f
    :goto_5
    move-object v5, v4

    .line 202
    :goto_6
    if-eqz v5, :cond_10

    .line 203
    .line 204
    invoke-virtual {v5}, Ljava/lang/Long;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    move/from16 v16, v5

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_10
    move/from16 v16, v10

    .line 212
    .line 213
    :goto_7
    const-string v5, "status"

    .line 214
    .line 215
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    if-nez v6, :cond_12

    .line 220
    .line 221
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    if-nez v6, :cond_11

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_11
    :try_start_2
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 229
    .line 230
    .line 231
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 232
    goto :goto_9

    .line 233
    :catchall_2
    :cond_12
    :goto_8
    move-object v5, v4

    .line 234
    :goto_9
    if-eqz v5, :cond_13

    .line 235
    .line 236
    invoke-virtual {v5}, Ljava/lang/Long;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    move/from16 v17, v5

    .line 241
    .line 242
    goto :goto_a

    .line 243
    :cond_13
    move/from16 v17, v10

    .line 244
    .line 245
    :goto_a
    const-string v5, "isSend"

    .line 246
    .line 247
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    if-nez v6, :cond_15

    .line 252
    .line 253
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-nez v6, :cond_14

    .line 258
    .line 259
    goto :goto_b

    .line 260
    :cond_14
    :try_start_3
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 261
    .line 262
    .line 263
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 264
    goto :goto_c

    .line 265
    :catchall_3
    :cond_15
    :goto_b
    move-object v5, v4

    .line 266
    :goto_c
    if-eqz v5, :cond_16

    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/lang/Long;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    move/from16 v18, v5

    .line 273
    .line 274
    goto :goto_d

    .line 275
    :cond_16
    move/from16 v18, v10

    .line 276
    .line 277
    :goto_d
    const-string v5, "createTime"

    .line 278
    .line 279
    invoke-static {v3, v5}, Lk8/i;->c(Landroid/content/ContentValues;Ljava/lang/String;)J

    .line 280
    .line 281
    .line 282
    move-result-wide v19

    .line 283
    const-string v5, "talker"

    .line 284
    .line 285
    invoke-static {v3, v5}, Lk8/i;->d(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v21

    .line 289
    const-string v5, "content"

    .line 290
    .line 291
    invoke-static {v3, v5}, Lk8/i;->d(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v22

    .line 295
    const-string v5, "imgPath"

    .line 296
    .line 297
    invoke-static {v3, v5}, Lk8/i;->d(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v23

    .line 301
    const-string v5, "reserved"

    .line 302
    .line 303
    invoke-static {v3, v5}, Lk8/i;->d(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v24

    .line 307
    const-string v5, "transContent"

    .line 308
    .line 309
    invoke-static {v3, v5}, Lk8/i;->d(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v25

    .line 313
    const-string v5, "flag"

    .line 314
    .line 315
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    if-nez v6, :cond_18

    .line 320
    .line 321
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    if-nez v6, :cond_17

    .line 326
    .line 327
    goto :goto_e

    .line 328
    :cond_17
    :try_start_4
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 329
    .line 330
    .line 331
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 332
    :catchall_4
    :cond_18
    :goto_e
    if-eqz v4, :cond_19

    .line 333
    .line 334
    invoke-virtual {v4}, Ljava/lang/Long;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    :cond_19
    move/from16 v26, v10

    .line 339
    .line 340
    const-string v4, "msgSource"

    .line 341
    .line 342
    invoke-static {v3, v4}, Lk8/i;->d(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v27

    .line 346
    iget-object v3, v2, Lk8/i;->c:Lg8/a;

    .line 347
    .line 348
    if-eqz v3, :cond_1a

    .line 349
    .line 350
    invoke-virtual {v3}, Lg8/a;->c()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    :goto_f
    move-object/from16 v28, v3

    .line 355
    .line 356
    goto :goto_10

    .line 357
    :cond_1a
    const-string v3, ""

    .line 358
    .line 359
    goto :goto_f

    .line 360
    :goto_10
    invoke-direct/range {v11 .. v28}, Lh/Hchat/hooks/api/model/WeChatMessage;-><init>(JJIIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    move-object v4, v11

    .line 364
    :goto_11
    new-instance v3, Lb/e;

    .line 365
    .line 366
    const/16 v5, 0x13

    .line 367
    .line 368
    invoke-direct {v3, v0, v5, v4}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    iget-object v0, v2, Lk8/i;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    :cond_1b
    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-eqz v0, :cond_1c

    .line 382
    .line 383
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    check-cast v0, Lk8/h;

    .line 388
    .line 389
    :try_start_5
    invoke-interface {v0, v3}, Lk8/h;->a(Lb/e;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 390
    .line 391
    .line 392
    goto :goto_12

    .line 393
    :catchall_5
    move-exception v0

    .line 394
    new-instance v5, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    const-string v6, "\u6d88\u606f\u53d8\u66f4\u56de\u8c03\u5931\u8d25: "

    .line 397
    .line 398
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    iget-object v5, v2, Lk8/i;->d:Li8/f;

    .line 413
    .line 414
    if-eqz v5, :cond_1b

    .line 415
    .line 416
    const-string v5, "[WeChatMessageChangeApi] "

    .line 417
    .line 418
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    goto :goto_12

    .line 426
    :cond_1c
    :goto_13
    return-void

    .line 427
    :pswitch_0
    iget-object v2, v1, Lg8/e;->b:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v2, Lha/k;

    .line 430
    .line 431
    iget-object v3, v0, Ll8/a;->b:Ljava/lang/String;

    .line 432
    .line 433
    const-string v4, "SnsInfo"

    .line 434
    .line 435
    invoke-static {v3, v4}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-nez v3, :cond_1d

    .line 440
    .line 441
    goto/16 :goto_15

    .line 442
    .line 443
    :cond_1d
    const-string v3, "delete"

    .line 444
    .line 445
    iget-object v4, v0, Ll8/a;->a:Ljava/lang/String;

    .line 446
    .line 447
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    if-eqz v3, :cond_23

    .line 452
    .line 453
    iget-object v3, v0, Ll8/a;->e:Ljava/lang/String;

    .line 454
    .line 455
    if-nez v3, :cond_1e

    .line 456
    .line 457
    const-string v3, ""

    .line 458
    .line 459
    :cond_1e
    const-string v4, "snsId"

    .line 460
    .line 461
    const/4 v5, 0x1

    .line 462
    invoke-static {v3, v4, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    if-nez v4, :cond_1f

    .line 467
    .line 468
    goto :goto_15

    .line 469
    :cond_1f
    iget-object v0, v0, Ll8/a;->f:[Ljava/lang/String;

    .line 470
    .line 471
    const/4 v4, 0x0

    .line 472
    if-eqz v0, :cond_20

    .line 473
    .line 474
    invoke-static {v0}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    check-cast v0, Ljava/lang/String;

    .line 479
    .line 480
    if-eqz v0, :cond_20

    .line 481
    .line 482
    goto :goto_14

    .line 483
    :cond_20
    const-string v0, "snsId\\s*=\\s*[\'\"]?([0-9]+)"

    .line 484
    .line 485
    const/16 v6, 0x42

    .line 486
    .line 487
    invoke-static {v0, v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    invoke-static {v0, v4, v3}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    if-eqz v0, :cond_21

    .line 506
    .line 507
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-static {v5, v0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    check-cast v0, Ljava/lang/String;

    .line 516
    .line 517
    goto :goto_14

    .line 518
    :cond_21
    const/4 v0, 0x0

    .line 519
    :goto_14
    invoke-static {v0}, Loh/h;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    if-eqz v0, :cond_23

    .line 524
    .line 525
    iget-object v3, v2, Lha/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 526
    .line 527
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    check-cast v3, Ljava/util/concurrent/ScheduledFuture;

    .line 532
    .line 533
    if-eqz v3, :cond_22

    .line 534
    .line 535
    invoke-interface {v3, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 536
    .line 537
    .line 538
    :cond_22
    iget-object v3, v2, Lha/k;->d:Ljava/lang/Object;

    .line 539
    .line 540
    monitor-enter v3

    .line 541
    :try_start_6
    iget-object v4, v2, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 542
    .line 543
    invoke-virtual {v4, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    check-cast v0, Lha/j;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 548
    .line 549
    monitor-exit v3

    .line 550
    const-string v0, "\u5df2\u53d6\u6d88\u88ab\u5220\u9664\u670b\u53cb\u5708\u7684\u5f85\u70b9\u8d5e\u4efb\u52a1"

    .line 551
    .line 552
    invoke-virtual {v2, v0}, Lha/k;->b(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    goto :goto_15

    .line 556
    :catchall_6
    move-exception v0

    .line 557
    monitor-exit v3

    .line 558
    throw v0

    .line 559
    :cond_23
    :goto_15
    return-void

    .line 560
    :pswitch_1
    iget-object v2, v1, Lg8/e;->b:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v2, Lha/h;

    .line 563
    .line 564
    iget-object v3, v0, Ll8/a;->b:Ljava/lang/String;

    .line 565
    .line 566
    const-string v4, "SnsInfo"

    .line 567
    .line 568
    invoke-static {v3, v4}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    if-eqz v3, :cond_2c

    .line 573
    .line 574
    const-string v3, "delete"

    .line 575
    .line 576
    iget-object v4, v0, Ll8/a;->a:Ljava/lang/String;

    .line 577
    .line 578
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    if-nez v3, :cond_24

    .line 583
    .line 584
    goto/16 :goto_1a

    .line 585
    .line 586
    :cond_24
    iget-object v3, v0, Ll8/a;->e:Ljava/lang/String;

    .line 587
    .line 588
    if-nez v3, :cond_25

    .line 589
    .line 590
    const-string v3, ""

    .line 591
    .line 592
    :cond_25
    const-string v4, "snsId"

    .line 593
    .line 594
    const/4 v5, 0x1

    .line 595
    invoke-static {v3, v4, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    const/4 v6, 0x0

    .line 600
    const/4 v7, 0x0

    .line 601
    if-nez v4, :cond_26

    .line 602
    .line 603
    goto :goto_17

    .line 604
    :cond_26
    iget-object v0, v0, Ll8/a;->f:[Ljava/lang/String;

    .line 605
    .line 606
    if-eqz v0, :cond_27

    .line 607
    .line 608
    invoke-static {v0}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    check-cast v0, Ljava/lang/String;

    .line 613
    .line 614
    if-eqz v0, :cond_27

    .line 615
    .line 616
    move-object v7, v0

    .line 617
    goto :goto_16

    .line 618
    :cond_27
    const-string v0, "snsId\\s*=\\s*[\'\"]?([0-9-]+)"

    .line 619
    .line 620
    const/16 v4, 0x42

    .line 621
    .line 622
    invoke-static {v0, v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    invoke-static {v0, v6, v3}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    if-eqz v0, :cond_28

    .line 641
    .line 642
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-static {v5, v0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    move-object v7, v0

    .line 651
    check-cast v7, Ljava/lang/String;

    .line 652
    .line 653
    :cond_28
    :goto_16
    invoke-static {v7}, Loh/h;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v7

    .line 657
    :goto_17
    if-eqz v7, :cond_2c

    .line 658
    .line 659
    iget-object v3, v2, Lha/h;->e:Ljava/lang/Object;

    .line 660
    .line 661
    monitor-enter v3

    .line 662
    :try_start_7
    iget-object v0, v2, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 663
    .line 664
    invoke-virtual {v0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    check-cast v0, Lha/g;

    .line 669
    .line 670
    if-eqz v0, :cond_29

    .line 671
    .line 672
    iget-object v4, v0, Lha/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 673
    .line 674
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 675
    .line 676
    .line 677
    iget-object v0, v0, Lha/g;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 678
    .line 679
    if-eqz v0, :cond_2a

    .line 680
    .line 681
    invoke-interface {v0, v5}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 682
    .line 683
    .line 684
    goto :goto_18

    .line 685
    :catchall_7
    move-exception v0

    .line 686
    goto :goto_19

    .line 687
    :cond_29
    move v5, v6

    .line 688
    :cond_2a
    :goto_18
    iget-boolean v0, v2, Lha/h;->j:Z

    .line 689
    .line 690
    if-eqz v0, :cond_2b

    .line 691
    .line 692
    invoke-virtual {v2, v7}, Lha/h;->k(Ljava/lang/String;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 693
    .line 694
    .line 695
    :cond_2b
    monitor-exit v3

    .line 696
    if-eqz v5, :cond_2c

    .line 697
    .line 698
    const-string v0, "\u5df2\u53d6\u6d88\u88ab\u5220\u9664\u670b\u53cb\u5708\u7684\u5f85\u8f6c\u53d1\u4efb\u52a1"

    .line 699
    .line 700
    invoke-virtual {v2, v0}, Lha/h;->i(Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    goto :goto_1a

    .line 704
    :goto_19
    monitor-exit v3

    .line 705
    throw v0

    .line 706
    :cond_2c
    :goto_1a
    return-void

    .line 707
    :pswitch_2
    iget-object v2, v1, Lg8/e;->b:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v2, Lha/d;

    .line 710
    .line 711
    iget-object v3, v0, Ll8/a;->b:Ljava/lang/String;

    .line 712
    .line 713
    const-string v4, "SnsInfo"

    .line 714
    .line 715
    invoke-static {v3, v4}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    if-nez v3, :cond_2d

    .line 720
    .line 721
    goto/16 :goto_1c

    .line 722
    .line 723
    :cond_2d
    const-string v3, "delete"

    .line 724
    .line 725
    iget-object v4, v0, Ll8/a;->a:Ljava/lang/String;

    .line 726
    .line 727
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    move-result v3

    .line 731
    if-eqz v3, :cond_33

    .line 732
    .line 733
    iget-object v3, v0, Ll8/a;->e:Ljava/lang/String;

    .line 734
    .line 735
    if-nez v3, :cond_2e

    .line 736
    .line 737
    const-string v3, ""

    .line 738
    .line 739
    :cond_2e
    const-string v4, "snsId"

    .line 740
    .line 741
    const/4 v5, 0x1

    .line 742
    invoke-static {v3, v4, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 743
    .line 744
    .line 745
    move-result v4

    .line 746
    if-nez v4, :cond_2f

    .line 747
    .line 748
    goto :goto_1c

    .line 749
    :cond_2f
    iget-object v0, v0, Ll8/a;->f:[Ljava/lang/String;

    .line 750
    .line 751
    const/4 v4, 0x0

    .line 752
    if-eqz v0, :cond_30

    .line 753
    .line 754
    invoke-static {v0}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    check-cast v0, Ljava/lang/String;

    .line 759
    .line 760
    if-eqz v0, :cond_30

    .line 761
    .line 762
    goto :goto_1b

    .line 763
    :cond_30
    const-string v0, "snsId\\s*=\\s*[\'\"]?([0-9]+)"

    .line 764
    .line 765
    const/16 v6, 0x42

    .line 766
    .line 767
    invoke-static {v0, v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    invoke-static {v0, v4, v3}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    if-eqz v0, :cond_31

    .line 786
    .line 787
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-static {v5, v0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    check-cast v0, Ljava/lang/String;

    .line 796
    .line 797
    goto :goto_1b

    .line 798
    :cond_31
    const/4 v0, 0x0

    .line 799
    :goto_1b
    invoke-static {v0}, Loh/h;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    if-eqz v0, :cond_33

    .line 804
    .line 805
    iget-object v3, v2, Lha/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 806
    .line 807
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    check-cast v3, Ljava/util/concurrent/ScheduledFuture;

    .line 812
    .line 813
    if-eqz v3, :cond_32

    .line 814
    .line 815
    invoke-interface {v3, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 816
    .line 817
    .line 818
    :cond_32
    iget-object v3, v2, Lha/d;->d:Ljava/lang/Object;

    .line 819
    .line 820
    monitor-enter v3

    .line 821
    :try_start_8
    iget-object v4, v2, Lha/d;->f:Ljava/util/LinkedHashMap;

    .line 822
    .line 823
    invoke-virtual {v4, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    check-cast v0, Lha/b;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 828
    .line 829
    monitor-exit v3

    .line 830
    const-string v0, "\u5df2\u53d6\u6d88\u88ab\u5220\u9664\u670b\u53cb\u5708\u7684\u5f85\u8bc4\u8bba\u4efb\u52a1"

    .line 831
    .line 832
    invoke-virtual {v2, v0}, Lha/d;->c(Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    goto :goto_1c

    .line 836
    :catchall_8
    move-exception v0

    .line 837
    monitor-exit v3

    .line 838
    throw v0

    .line 839
    :cond_33
    :goto_1c
    return-void

    .line 840
    :pswitch_3
    iget-object v2, v1, Lg8/e;->b:Ljava/lang/Object;

    .line 841
    .line 842
    check-cast v2, Lh8/b;

    .line 843
    .line 844
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    iget-object v3, v0, Ll8/a;->d:Landroid/content/ContentValues;

    .line 848
    .line 849
    const-string v4, "rconversation"

    .line 850
    .line 851
    iget-object v5, v0, Ll8/a;->b:Ljava/lang/String;

    .line 852
    .line 853
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 854
    .line 855
    .line 856
    move-result v4

    .line 857
    if-nez v4, :cond_34

    .line 858
    .line 859
    goto/16 :goto_25

    .line 860
    .line 861
    :cond_34
    const-string v4, "username"

    .line 862
    .line 863
    const-string v5, ""

    .line 864
    .line 865
    invoke-static {v3, v4}, Lh8/b;->b(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v6

    .line 869
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 870
    .line 871
    .line 872
    move-result v7

    .line 873
    const/4 v8, 0x0

    .line 874
    if-nez v7, :cond_35

    .line 875
    .line 876
    move-object v5, v6

    .line 877
    goto :goto_1e

    .line 878
    :cond_35
    iget-object v6, v0, Ll8/a;->e:Ljava/lang/String;

    .line 879
    .line 880
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 881
    .line 882
    .line 883
    move-result v7

    .line 884
    if-nez v7, :cond_38

    .line 885
    .line 886
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 887
    .line 888
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v6

    .line 892
    invoke-virtual {v6, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 893
    .line 894
    .line 895
    move-result v4

    .line 896
    if-eqz v4, :cond_38

    .line 897
    .line 898
    iget-object v4, v0, Ll8/a;->f:[Ljava/lang/String;

    .line 899
    .line 900
    if-nez v4, :cond_36

    .line 901
    .line 902
    goto :goto_1e

    .line 903
    :cond_36
    array-length v6, v4

    .line 904
    move v7, v8

    .line 905
    :goto_1d
    if-ge v7, v6, :cond_38

    .line 906
    .line 907
    aget-object v9, v4, v7

    .line 908
    .line 909
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 910
    .line 911
    .line 912
    move-result v10

    .line 913
    if-nez v10, :cond_37

    .line 914
    .line 915
    move-object v5, v9

    .line 916
    goto :goto_1e

    .line 917
    :cond_37
    add-int/lit8 v7, v7, 0x1

    .line 918
    .line 919
    goto :goto_1d

    .line 920
    :cond_38
    :goto_1e
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 921
    .line 922
    .line 923
    move-result v4

    .line 924
    const/4 v6, 0x0

    .line 925
    if-nez v4, :cond_3b

    .line 926
    .line 927
    iget-object v4, v2, Lh8/b;->b:Lh8/a;

    .line 928
    .line 929
    if-eqz v4, :cond_3b

    .line 930
    .line 931
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 932
    .line 933
    .line 934
    move-result v7

    .line 935
    if-eqz v7, :cond_39

    .line 936
    .line 937
    :goto_1f
    move-object v4, v6

    .line 938
    goto :goto_20

    .line 939
    :cond_39
    const-string v7, "SELECT username, unReadCount, status, isSend, conversationTime, content, msgType, flag, digest, digestUser, atCount, unReadMuteCount, hasTodo FROM rconversation WHERE username=? LIMIT 1"

    .line 940
    .line 941
    filled-new-array {v5}, [Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v9

    .line 945
    invoke-virtual {v4, v7, v9}, Lh8/a;->i(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 946
    .line 947
    .line 948
    move-result-object v4

    .line 949
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 950
    .line 951
    .line 952
    move-result v7

    .line 953
    if-eqz v7, :cond_3a

    .line 954
    .line 955
    goto :goto_1f

    .line 956
    :cond_3a
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v4

    .line 960
    check-cast v4, Ll8/b;

    .line 961
    .line 962
    :goto_20
    if-eqz v4, :cond_3b

    .line 963
    .line 964
    move-object v6, v4

    .line 965
    goto :goto_23

    .line 966
    :cond_3b
    if-nez v3, :cond_3c

    .line 967
    .line 968
    goto :goto_23

    .line 969
    :cond_3c
    new-instance v6, Ll8/b;

    .line 970
    .line 971
    const-string v4, "unReadCount"

    .line 972
    .line 973
    invoke-static {v3, v4}, Lh8/b;->a(Landroid/content/ContentValues;Ljava/lang/String;)I

    .line 974
    .line 975
    .line 976
    const-string v4, "status"

    .line 977
    .line 978
    invoke-static {v3, v4}, Lh8/b;->a(Landroid/content/ContentValues;Ljava/lang/String;)I

    .line 979
    .line 980
    .line 981
    const-string v4, "isSend"

    .line 982
    .line 983
    invoke-static {v3, v4}, Lh8/b;->a(Landroid/content/ContentValues;Ljava/lang/String;)I

    .line 984
    .line 985
    .line 986
    const-string v4, "conversationTime"

    .line 987
    .line 988
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 989
    .line 990
    .line 991
    move-result v7

    .line 992
    if-nez v7, :cond_3e

    .line 993
    .line 994
    invoke-virtual {v3, v4}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 995
    .line 996
    .line 997
    move-result v7

    .line 998
    if-nez v7, :cond_3d

    .line 999
    .line 1000
    goto :goto_21

    .line 1001
    :cond_3d
    :try_start_9
    invoke-virtual {v3, v4}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1002
    .line 1003
    .line 1004
    :catchall_9
    :cond_3e
    :goto_21
    const-string v4, "content"

    .line 1005
    .line 1006
    invoke-static {v3, v4}, Lh8/b;->b(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    const-string v4, "msgType"

    .line 1010
    .line 1011
    invoke-static {v3, v4}, Lh8/b;->b(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1012
    .line 1013
    .line 1014
    const-string v4, "flag"

    .line 1015
    .line 1016
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1017
    .line 1018
    .line 1019
    move-result v7

    .line 1020
    if-nez v7, :cond_40

    .line 1021
    .line 1022
    invoke-virtual {v3, v4}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v7

    .line 1026
    if-nez v7, :cond_3f

    .line 1027
    .line 1028
    goto :goto_22

    .line 1029
    :cond_3f
    :try_start_a
    invoke-virtual {v3, v4}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1030
    .line 1031
    .line 1032
    :catchall_a
    :cond_40
    :goto_22
    const-string v4, "digest"

    .line 1033
    .line 1034
    invoke-static {v3, v4}, Lh8/b;->b(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    const-string v4, "digestUser"

    .line 1038
    .line 1039
    invoke-static {v3, v4}, Lh8/b;->b(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    const-string v4, "atCount"

    .line 1043
    .line 1044
    invoke-static {v3, v4}, Lh8/b;->a(Landroid/content/ContentValues;Ljava/lang/String;)I

    .line 1045
    .line 1046
    .line 1047
    const-string v4, "unReadMuteCount"

    .line 1048
    .line 1049
    invoke-static {v3, v4}, Lh8/b;->a(Landroid/content/ContentValues;Ljava/lang/String;)I

    .line 1050
    .line 1051
    .line 1052
    const-string v4, "hasTodo"

    .line 1053
    .line 1054
    invoke-static {v3, v4}, Lh8/b;->a(Landroid/content/ContentValues;Ljava/lang/String;)I

    .line 1055
    .line 1056
    .line 1057
    invoke-direct {v6, v5}, Ll8/b;-><init>(Ljava/lang/String;)V

    .line 1058
    .line 1059
    .line 1060
    :goto_23
    new-instance v3, Lb/e;

    .line 1061
    .line 1062
    const/16 v4, 0xa

    .line 1063
    .line 1064
    invoke-direct {v3, v0, v4, v6}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1065
    .line 1066
    .line 1067
    iget-object v0, v2, Lh8/b;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1068
    .line 1069
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v4

    .line 1073
    :cond_41
    :goto_24
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1074
    .line 1075
    .line 1076
    move-result v0

    .line 1077
    if-eqz v0, :cond_42

    .line 1078
    .line 1079
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    check-cast v0, Lc9/q1;

    .line 1084
    .line 1085
    :try_start_b
    invoke-virtual {v0, v3}, Lc9/q1;->a(Lb/e;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1086
    .line 1087
    .line 1088
    goto :goto_24

    .line 1089
    :catchall_b
    move-exception v0

    .line 1090
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1091
    .line 1092
    const-string v6, "\u4f1a\u8bdd\u53d8\u66f4\u56de\u8c03\u5931\u8d25: "

    .line 1093
    .line 1094
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    iget-object v5, v2, Lh8/b;->c:Lg1/d;

    .line 1109
    .line 1110
    if-eqz v5, :cond_41

    .line 1111
    .line 1112
    const-string v5, "[WeChatConversationChangeApi] "

    .line 1113
    .line 1114
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    goto :goto_24

    .line 1122
    :cond_42
    :goto_25
    return-void

    .line 1123
    :pswitch_4
    iget-object v2, v1, Lg8/e;->b:Ljava/lang/Object;

    .line 1124
    .line 1125
    check-cast v2, Lg8/j;

    .line 1126
    .line 1127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1128
    .line 1129
    .line 1130
    const-string v3, "rcontact"

    .line 1131
    .line 1132
    iget-object v4, v0, Ll8/a;->b:Ljava/lang/String;

    .line 1133
    .line 1134
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1135
    .line 1136
    .line 1137
    move-result v5

    .line 1138
    if-nez v5, :cond_43

    .line 1139
    .line 1140
    const-string v5, "img_flag"

    .line 1141
    .line 1142
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1143
    .line 1144
    .line 1145
    move-result v5

    .line 1146
    if-nez v5, :cond_43

    .line 1147
    .line 1148
    goto/16 :goto_2b

    .line 1149
    .line 1150
    :cond_43
    iget-object v0, v0, Ll8/a;->d:Landroid/content/ContentValues;

    .line 1151
    .line 1152
    const-string v5, "username"

    .line 1153
    .line 1154
    invoke-static {v0, v5}, Lg8/j;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v7

    .line 1158
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1159
    .line 1160
    .line 1161
    move-result v5

    .line 1162
    if-nez v5, :cond_44

    .line 1163
    .line 1164
    iget-object v5, v2, Lg8/j;->b:Lg8/i;

    .line 1165
    .line 1166
    if-eqz v5, :cond_44

    .line 1167
    .line 1168
    invoke-virtual {v5, v7}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v5

    .line 1172
    if-eqz v5, :cond_44

    .line 1173
    .line 1174
    goto/16 :goto_29

    .line 1175
    .line 1176
    :cond_44
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1177
    .line 1178
    .line 1179
    move-result v3

    .line 1180
    if-eqz v3, :cond_4a

    .line 1181
    .line 1182
    if-nez v0, :cond_45

    .line 1183
    .line 1184
    goto :goto_29

    .line 1185
    :cond_45
    new-instance v6, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 1186
    .line 1187
    const-string v3, "nickname"

    .line 1188
    .line 1189
    invoke-static {v0, v3}, Lg8/j;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v8

    .line 1193
    const-string v3, "alias"

    .line 1194
    .line 1195
    invoke-static {v0, v3}, Lg8/j;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v9

    .line 1199
    const-string v3, "conRemark"

    .line 1200
    .line 1201
    invoke-static {v0, v3}, Lg8/j;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v10

    .line 1205
    const-string v11, ""

    .line 1206
    .line 1207
    const-string v12, ""

    .line 1208
    .line 1209
    const-string v3, "encryptUsername"

    .line 1210
    .line 1211
    invoke-static {v0, v3}, Lg8/j;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v13

    .line 1215
    const-string v3, "province"

    .line 1216
    .line 1217
    invoke-static {v0, v3}, Lg8/j;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v14

    .line 1221
    const-string v3, "city"

    .line 1222
    .line 1223
    invoke-static {v0, v3}, Lg8/j;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v15

    .line 1227
    const-string v3, "sex"

    .line 1228
    .line 1229
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1230
    .line 1231
    .line 1232
    move-result v4

    .line 1233
    const/4 v5, 0x0

    .line 1234
    if-nez v4, :cond_47

    .line 1235
    .line 1236
    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v4

    .line 1240
    if-nez v4, :cond_46

    .line 1241
    .line 1242
    goto :goto_26

    .line 1243
    :cond_46
    :try_start_c
    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v3

    .line 1247
    if-eqz v3, :cond_47

    .line 1248
    .line 1249
    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    .line 1250
    .line 1251
    .line 1252
    move-result v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1253
    move/from16 v16, v3

    .line 1254
    .line 1255
    goto :goto_27

    .line 1256
    :catchall_c
    :cond_47
    :goto_26
    move/from16 v16, v5

    .line 1257
    .line 1258
    :goto_27
    const-string v3, "type"

    .line 1259
    .line 1260
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1261
    .line 1262
    .line 1263
    move-result v4

    .line 1264
    if-nez v4, :cond_49

    .line 1265
    .line 1266
    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v4

    .line 1270
    if-nez v4, :cond_48

    .line 1271
    .line 1272
    goto :goto_28

    .line 1273
    :cond_48
    :try_start_d
    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v0

    .line 1277
    if-eqz v0, :cond_49

    .line 1278
    .line 1279
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    .line 1280
    .line 1281
    .line 1282
    move-result v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 1283
    :catchall_d
    :cond_49
    :goto_28
    move/from16 v17, v5

    .line 1284
    .line 1285
    invoke-direct/range {v6 .. v17}, Lh/Hchat/hooks/api/model/WeChatContact;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1286
    .line 1287
    .line 1288
    :cond_4a
    :goto_29
    iget-object v0, v2, Lg8/j;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1289
    .line 1290
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v3

    .line 1294
    :cond_4b
    :goto_2a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1295
    .line 1296
    .line 1297
    move-result v0

    .line 1298
    if-nez v0, :cond_4c

    .line 1299
    .line 1300
    goto :goto_2b

    .line 1301
    :cond_4c
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    if-eqz v0, :cond_4d

    .line 1306
    .line 1307
    invoke-static {}, Lah/a;->d()V

    .line 1308
    .line 1309
    .line 1310
    :goto_2b
    return-void

    .line 1311
    :cond_4d
    const/4 v0, 0x0

    .line 1312
    :try_start_e
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 1313
    :catchall_e
    move-exception v0

    .line 1314
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1315
    .line 1316
    const-string v5, "\u8054\u7cfb\u4eba\u53d8\u66f4\u56de\u8c03\u5931\u8d25: "

    .line 1317
    .line 1318
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v0

    .line 1325
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v0

    .line 1332
    iget-object v4, v2, Lg8/j;->c:Lg1/d;

    .line 1333
    .line 1334
    if-eqz v4, :cond_4b

    .line 1335
    .line 1336
    const-string v4, "[WeChatContactChangeApi] "

    .line 1337
    .line 1338
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v0

    .line 1342
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 1343
    .line 1344
    .line 1345
    goto :goto_2a

    .line 1346
    :pswitch_5
    const-string v2, "chatroomname"

    .line 1347
    .line 1348
    iget-object v3, v1, Lg8/e;->b:Ljava/lang/Object;

    .line 1349
    .line 1350
    check-cast v3, Lg8/g;

    .line 1351
    .line 1352
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1353
    .line 1354
    .line 1355
    const-string v4, "chatroom"

    .line 1356
    .line 1357
    iget-object v5, v0, Ll8/a;->b:Ljava/lang/String;

    .line 1358
    .line 1359
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1360
    .line 1361
    .line 1362
    move-result v4

    .line 1363
    if-nez v4, :cond_4e

    .line 1364
    .line 1365
    goto/16 :goto_2f

    .line 1366
    .line 1367
    :cond_4e
    iget-object v4, v0, Ll8/a;->d:Landroid/content/ContentValues;

    .line 1368
    .line 1369
    const-string v5, ""

    .line 1370
    .line 1371
    if-eqz v4, :cond_50

    .line 1372
    .line 1373
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1374
    .line 1375
    .line 1376
    move-result v6

    .line 1377
    if-nez v6, :cond_50

    .line 1378
    .line 1379
    invoke-virtual {v4, v2}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 1380
    .line 1381
    .line 1382
    move-result v6

    .line 1383
    if-nez v6, :cond_4f

    .line 1384
    .line 1385
    goto :goto_2c

    .line 1386
    :cond_4f
    invoke-virtual {v4, v2}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v4

    .line 1390
    if-eqz v4, :cond_50

    .line 1391
    .line 1392
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v5

    .line 1396
    :cond_50
    :goto_2c
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1397
    .line 1398
    .line 1399
    move-result v4

    .line 1400
    if-eqz v4, :cond_51

    .line 1401
    .line 1402
    iget-object v4, v0, Ll8/a;->e:Ljava/lang/String;

    .line 1403
    .line 1404
    if-eqz v4, :cond_51

    .line 1405
    .line 1406
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v4

    .line 1410
    invoke-virtual {v4, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1411
    .line 1412
    .line 1413
    move-result v2

    .line 1414
    if-eqz v2, :cond_51

    .line 1415
    .line 1416
    iget-object v2, v0, Ll8/a;->f:[Ljava/lang/String;

    .line 1417
    .line 1418
    if-eqz v2, :cond_51

    .line 1419
    .line 1420
    array-length v4, v2

    .line 1421
    if-lez v4, :cond_51

    .line 1422
    .line 1423
    const/4 v4, 0x0

    .line 1424
    aget-object v5, v2, v4

    .line 1425
    .line 1426
    :cond_51
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1427
    .line 1428
    .line 1429
    move-result v2

    .line 1430
    if-nez v2, :cond_52

    .line 1431
    .line 1432
    iget-object v2, v3, Lg8/g;->b:Lg8/d;

    .line 1433
    .line 1434
    if-eqz v2, :cond_52

    .line 1435
    .line 1436
    invoke-virtual {v2, v5}, Lg8/d;->e(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v2

    .line 1440
    goto :goto_2d

    .line 1441
    :cond_52
    const/4 v2, 0x0

    .line 1442
    :goto_2d
    new-instance v4, Lb/e;

    .line 1443
    .line 1444
    const/16 v5, 0x8

    .line 1445
    .line 1446
    invoke-direct {v4, v0, v5, v2}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1447
    .line 1448
    .line 1449
    iget-object v0, v3, Lg8/g;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1450
    .line 1451
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v2

    .line 1455
    :cond_53
    :goto_2e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1456
    .line 1457
    .line 1458
    move-result v0

    .line 1459
    if-eqz v0, :cond_54

    .line 1460
    .line 1461
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v0

    .line 1465
    check-cast v0, Lg8/f;

    .line 1466
    .line 1467
    :try_start_f
    invoke-interface {v0, v4}, Lg8/f;->a(Lb/e;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 1468
    .line 1469
    .line 1470
    goto :goto_2e

    .line 1471
    :catchall_f
    move-exception v0

    .line 1472
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1473
    .line 1474
    const-string v6, "\u7fa4\u804a\u53d8\u66f4\u56de\u8c03\u5931\u8d25: "

    .line 1475
    .line 1476
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v0

    .line 1483
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1484
    .line 1485
    .line 1486
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    iget-object v5, v3, Lg8/g;->c:Lg1/d;

    .line 1491
    .line 1492
    if-eqz v5, :cond_53

    .line 1493
    .line 1494
    const-string v5, "[WeChatChatroomChangeApi] "

    .line 1495
    .line 1496
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0

    .line 1500
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 1501
    .line 1502
    .line 1503
    goto :goto_2e

    .line 1504
    :cond_54
    :goto_2f
    return-void

    .line 1505
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
