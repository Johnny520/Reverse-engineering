.class public final synthetic Landroidx/activity/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/activity/b;->a:I

    iput-object p2, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    iget v4, v1, Landroidx/activity/b;->a:I

    .line 6
    .line 7
    packed-switch v4, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ls0/J;

    .line 13
    .line 14
    iget-boolean v4, v0, Ls0/J;->i:Z

    .line 15
    .line 16
    if-nez v4, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Lt0/c;->c()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "app"

    .line 30
    .line 31
    invoke-virtual {v4, v5, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v5, v0, Ls0/J;->h:Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iput-boolean v3, v0, Ls0/J;->i:Z

    .line 45
    .line 46
    sget-object v2, Lz0/d;->a:Lz0/c;

    .line 47
    .line 48
    new-instance v4, Ls0/E;

    .line 49
    .line 50
    invoke-direct {v4, v0, v3}, Ls0/E;-><init>(Ls0/J;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3, v4}, Lz0/c;->h(ZLM0/l;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    return-void

    .line 57
    :pswitch_0
    iget-object v4, v1, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Ls0/l;

    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object v5, Lz0/z;->a:Lz0/z;

    .line 65
    .line 66
    new-array v5, v2, [Ljava/lang/Object;

    .line 67
    .line 68
    const-string v6, "select r.username,r.alias,r.encryptUsername,r.conRemark,r.nickname,r.pyInitial,r.quanPin,r.type,r.verifyFlag,i.reserved2 as avatarUrl\nfrom rcontact r\nleft join img_flag i on r.username=i.username\nwhere r.username is not null and r.username<>\'\'\n  and r.encryptUsername is not null and r.encryptUsername<>\'\'\n  and r.verifyFlag=0\n  and (r.type & 1)<>0\n  and (r.type & 8)=0\n  and (r.type & 32)=0\n  and r.username not like \'%@chatroom\'"

    .line 69
    .line 70
    invoke-static {v6, v5}, Lz0/z;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 75
    .line 76
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_27

    .line 88
    .line 89
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    check-cast v7, Ljava/util/Map;

    .line 94
    .line 95
    const-string v8, "username"

    .line 96
    .line 97
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, Ljava/lang/String;

    .line 102
    .line 103
    if-eqz v8, :cond_3

    .line 104
    .line 105
    invoke-static {v8}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    const/4 v8, 0x0

    .line 115
    :goto_2
    const-string v9, ""

    .line 116
    .line 117
    if-nez v8, :cond_4

    .line 118
    .line 119
    move-object v11, v9

    .line 120
    goto :goto_3

    .line 121
    :cond_4
    move-object v11, v8

    .line 122
    :goto_3
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 123
    .line 124
    const-string v10, "ROOT"

    .line 125
    .line 126
    invoke-static {v8, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    const-string v12, "toLowerCase(...)"

    .line 134
    .line 135
    invoke-static {v10, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-static {v8, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v8}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-eqz v12, :cond_5

    .line 150
    .line 151
    goto/16 :goto_6

    .line 152
    .line 153
    :cond_5
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    const v13, -0x719d07d6

    .line 158
    .line 159
    .line 160
    if-eq v12, v13, :cond_8

    .line 161
    .line 162
    const v13, -0x2f2e7d9e

    .line 163
    .line 164
    .line 165
    if-eq v12, v13, :cond_7

    .line 166
    .line 167
    const v13, 0x7fa08dd6

    .line 168
    .line 169
    .line 170
    if-eq v12, v13, :cond_6

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_6
    const-string v12, "medianote"

    .line 174
    .line 175
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v12

    .line 179
    if-nez v12, :cond_10

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_7
    const-string v12, "weixin"

    .line 183
    .line 184
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    if-nez v12, :cond_10

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_8
    const-string v12, "filehelper"

    .line 192
    .line 193
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v12

    .line 197
    if-eqz v12, :cond_9

    .line 198
    .line 199
    goto/16 :goto_6

    .line 200
    .line 201
    :cond_9
    :goto_4
    const-string v12, "gh_"

    .line 202
    .line 203
    invoke-static {v8, v2, v12}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    if-nez v13, :cond_10

    .line 208
    .line 209
    const-string v13, "appbrand"

    .line 210
    .line 211
    invoke-static {v8, v2, v13}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    if-eqz v13, :cond_a

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_a
    const-string v13, "@app"

    .line 219
    .line 220
    invoke-static {v8, v13, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    if-nez v13, :cond_10

    .line 225
    .line 226
    const-string v13, "@stranger"

    .line 227
    .line 228
    invoke-static {v8, v13, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    if-nez v13, :cond_10

    .line 233
    .line 234
    const-string v13, "@qqim"

    .line 235
    .line 236
    invoke-static {v8, v13, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    if-eqz v13, :cond_b

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_b
    const-string v13, "wxid_"

    .line 244
    .line 245
    invoke-static {v8, v2, v13}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 246
    .line 247
    .line 248
    move-result v13

    .line 249
    const-string v14, "@chatroom"

    .line 250
    .line 251
    if-nez v13, :cond_c

    .line 252
    .line 253
    invoke-virtual {v8, v14}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v13

    .line 257
    if-nez v13, :cond_c

    .line 258
    .line 259
    const-string v13, "@"

    .line 260
    .line 261
    invoke-static {v8, v13, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    if-nez v8, :cond_10

    .line 266
    .line 267
    :cond_c
    invoke-virtual {v10, v14}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-nez v8, :cond_10

    .line 272
    .line 273
    invoke-static {v10, v2, v12}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    if-eqz v8, :cond_d

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_d
    const-string v8, "encryptUsername"

    .line 281
    .line 282
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    check-cast v8, Ljava/lang/String;

    .line 287
    .line 288
    if-eqz v8, :cond_e

    .line 289
    .line 290
    invoke-static {v8}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    goto :goto_5

    .line 299
    :cond_e
    const/4 v8, 0x0

    .line 300
    :goto_5
    if-nez v8, :cond_f

    .line 301
    .line 302
    move-object v8, v9

    .line 303
    :cond_f
    invoke-static {v8}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    if-eqz v8, :cond_11

    .line 308
    .line 309
    :cond_10
    :goto_6
    move v8, v2

    .line 310
    goto :goto_9

    .line 311
    :cond_11
    const-string v8, "verifyFlag"

    .line 312
    .line 313
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    check-cast v8, Ljava/lang/String;

    .line 318
    .line 319
    if-eqz v8, :cond_12

    .line 320
    .line 321
    invoke-static {v8}, LU0/p;->Z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    if-eqz v8, :cond_12

    .line 326
    .line 327
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v8

    .line 331
    goto :goto_7

    .line 332
    :cond_12
    move v8, v2

    .line 333
    :goto_7
    if-eqz v8, :cond_13

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_13
    const-string v8, "type"

    .line 337
    .line 338
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v8

    .line 342
    check-cast v8, Ljava/lang/String;

    .line 343
    .line 344
    if-eqz v8, :cond_14

    .line 345
    .line 346
    invoke-static {v8}, LU0/p;->Z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v8

    .line 350
    if-eqz v8, :cond_14

    .line 351
    .line 352
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    goto :goto_8

    .line 357
    :cond_14
    move v8, v2

    .line 358
    :goto_8
    and-int/lit8 v10, v8, 0x1

    .line 359
    .line 360
    if-eqz v10, :cond_10

    .line 361
    .line 362
    and-int/lit8 v10, v8, 0x8

    .line 363
    .line 364
    if-nez v10, :cond_10

    .line 365
    .line 366
    and-int/lit8 v8, v8, 0x20

    .line 367
    .line 368
    if-nez v8, :cond_10

    .line 369
    .line 370
    move v8, v3

    .line 371
    :goto_9
    if-nez v8, :cond_15

    .line 372
    .line 373
    const/16 v20, 0x0

    .line 374
    .line 375
    goto/16 :goto_1

    .line 376
    .line 377
    :cond_15
    const-string v8, "alias"

    .line 378
    .line 379
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v8

    .line 383
    check-cast v8, Ljava/lang/String;

    .line 384
    .line 385
    if-eqz v8, :cond_16

    .line 386
    .line 387
    invoke-static {v8}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 388
    .line 389
    .line 390
    move-result-object v8

    .line 391
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v8

    .line 395
    goto :goto_a

    .line 396
    :cond_16
    const/4 v8, 0x0

    .line 397
    :goto_a
    if-nez v8, :cond_17

    .line 398
    .line 399
    move-object v14, v9

    .line 400
    goto :goto_b

    .line 401
    :cond_17
    move-object v14, v8

    .line 402
    :goto_b
    const-string v8, "conRemark"

    .line 403
    .line 404
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    check-cast v8, Ljava/lang/String;

    .line 409
    .line 410
    if-eqz v8, :cond_18

    .line 411
    .line 412
    invoke-static {v8}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v8

    .line 420
    goto :goto_c

    .line 421
    :cond_18
    const/4 v8, 0x0

    .line 422
    :goto_c
    if-nez v8, :cond_19

    .line 423
    .line 424
    move-object v15, v9

    .line 425
    goto :goto_d

    .line 426
    :cond_19
    move-object v15, v8

    .line 427
    :goto_d
    const-string v8, "nickname"

    .line 428
    .line 429
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    check-cast v8, Ljava/lang/String;

    .line 434
    .line 435
    if-eqz v8, :cond_1a

    .line 436
    .line 437
    invoke-static {v8}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 438
    .line 439
    .line 440
    move-result-object v8

    .line 441
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v8

    .line 445
    goto :goto_e

    .line 446
    :cond_1a
    const/4 v8, 0x0

    .line 447
    :goto_e
    if-nez v8, :cond_1b

    .line 448
    .line 449
    move-object v8, v9

    .line 450
    :cond_1b
    const-string v10, "pyInitial"

    .line 451
    .line 452
    invoke-interface {v7, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v10

    .line 456
    check-cast v10, Ljava/lang/String;

    .line 457
    .line 458
    if-eqz v10, :cond_1c

    .line 459
    .line 460
    invoke-static {v10}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 461
    .line 462
    .line 463
    move-result-object v10

    .line 464
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v10

    .line 468
    goto :goto_f

    .line 469
    :cond_1c
    const/4 v10, 0x0

    .line 470
    :goto_f
    if-nez v10, :cond_1d

    .line 471
    .line 472
    move-object/from16 v17, v9

    .line 473
    .line 474
    goto :goto_10

    .line 475
    :cond_1d
    move-object/from16 v17, v10

    .line 476
    .line 477
    :goto_10
    const-string v10, "quanPin"

    .line 478
    .line 479
    invoke-interface {v7, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v10

    .line 483
    check-cast v10, Ljava/lang/String;

    .line 484
    .line 485
    if-eqz v10, :cond_1e

    .line 486
    .line 487
    invoke-static {v10}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 488
    .line 489
    .line 490
    move-result-object v10

    .line 491
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v10

    .line 495
    goto :goto_11

    .line 496
    :cond_1e
    const/4 v10, 0x0

    .line 497
    :goto_11
    if-nez v10, :cond_1f

    .line 498
    .line 499
    move-object/from16 v18, v9

    .line 500
    .line 501
    goto :goto_12

    .line 502
    :cond_1f
    move-object/from16 v18, v10

    .line 503
    .line 504
    :goto_12
    filled-new-array {v15, v8, v14, v11}, [Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v10

    .line 508
    invoke-static {v10}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 509
    .line 510
    .line 511
    move-result-object v10

    .line 512
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 513
    .line 514
    .line 515
    move-result-object v10

    .line 516
    :cond_20
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 517
    .line 518
    .line 519
    move-result v12

    .line 520
    if-eqz v12, :cond_22

    .line 521
    .line 522
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v12

    .line 526
    move-object v13, v12

    .line 527
    check-cast v13, Ljava/lang/String;

    .line 528
    .line 529
    invoke-static {v13}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 530
    .line 531
    .line 532
    move-result v16

    .line 533
    if-nez v16, :cond_21

    .line 534
    .line 535
    invoke-virtual {v13, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v13

    .line 539
    if-nez v13, :cond_21

    .line 540
    .line 541
    move v13, v3

    .line 542
    goto :goto_13

    .line 543
    :cond_21
    move v13, v2

    .line 544
    :goto_13
    if-eqz v13, :cond_20

    .line 545
    .line 546
    goto :goto_14

    .line 547
    :cond_22
    const/4 v12, 0x0

    .line 548
    :goto_14
    check-cast v12, Ljava/lang/String;

    .line 549
    .line 550
    if-nez v12, :cond_23

    .line 551
    .line 552
    move-object v12, v11

    .line 553
    :cond_23
    new-instance v10, Ls0/i;

    .line 554
    .line 555
    invoke-static {v14}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 556
    .line 557
    .line 558
    move-result v13

    .line 559
    const/16 v20, 0x0

    .line 560
    .line 561
    const-string v0, "\u5fae\u4fe1ID\uff1a"

    .line 562
    .line 563
    if-nez v13, :cond_24

    .line 564
    .line 565
    invoke-virtual {v14, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v13

    .line 569
    if-nez v13, :cond_24

    .line 570
    .line 571
    new-instance v13, Ljava/lang/StringBuilder;

    .line 572
    .line 573
    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    const-string v0, " \u00b7 \u5fae\u4fe1\u53f7\uff1a"

    .line 580
    .line 581
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    :goto_15
    move-object v13, v0

    .line 592
    goto :goto_16

    .line 593
    :cond_24
    invoke-virtual {v0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    goto :goto_15

    .line 598
    :goto_16
    const-string v0, "avatarUrl"

    .line 599
    .line 600
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    check-cast v0, Ljava/lang/String;

    .line 605
    .line 606
    if-eqz v0, :cond_25

    .line 607
    .line 608
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    goto :goto_17

    .line 617
    :cond_25
    move-object/from16 v0, v20

    .line 618
    .line 619
    :goto_17
    if-nez v0, :cond_26

    .line 620
    .line 621
    move-object/from16 v19, v9

    .line 622
    .line 623
    :goto_18
    move-object/from16 v16, v8

    .line 624
    .line 625
    goto :goto_19

    .line 626
    :cond_26
    move-object/from16 v19, v0

    .line 627
    .line 628
    goto :goto_18

    .line 629
    :goto_19
    invoke-direct/range {v10 .. v19}, Ls0/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    invoke-interface {v6, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    goto/16 :goto_1

    .line 636
    .line 637
    :cond_27
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    const-string v2, "<get-values>(...)"

    .line 642
    .line 643
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    new-instance v2, Ls0/k;

    .line 647
    .line 648
    invoke-direct {v2, v4, v3}, Ls0/k;-><init>(Ls0/l;I)V

    .line 649
    .line 650
    .line 651
    new-instance v3, LA0/Q;

    .line 652
    .line 653
    const/4 v5, 0x3

    .line 654
    invoke-direct {v3, v2, v4, v5}, LA0/Q;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 655
    .line 656
    .line 657
    new-instance v2, LA0/Q;

    .line 658
    .line 659
    const/4 v5, 0x4

    .line 660
    invoke-direct {v2, v3, v4, v5}, LA0/Q;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 661
    .line 662
    .line 663
    new-instance v3, LA0/f;

    .line 664
    .line 665
    const/16 v5, 0x12

    .line 666
    .line 667
    invoke-direct {v3, v5, v2}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    invoke-static {v0, v3}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    new-instance v2, LA0/m;

    .line 675
    .line 676
    const/16 v3, 0xc

    .line 677
    .line 678
    invoke-direct {v2, v4, v0, v3}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 679
    .line 680
    .line 681
    iget-object v0, v4, Ls0/l;->a:Landroid/app/Activity;

    .line 682
    .line 683
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 684
    .line 685
    .line 686
    return-void

    .line 687
    :pswitch_1
    const/16 v20, 0x0

    .line 688
    .line 689
    iget-object v0, v1, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v0, Li/q1;

    .line 692
    .line 693
    iget-object v2, v0, Li/q1;->g:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 696
    .line 697
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 698
    .line 699
    .line 700
    move-result v2

    .line 701
    if-nez v2, :cond_2a

    .line 702
    .line 703
    iget-object v2, v0, Li/q1;->b:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v2, Landroid/app/Activity;

    .line 706
    .line 707
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 708
    .line 709
    .line 710
    move-result v3

    .line 711
    if-nez v3, :cond_2a

    .line 712
    .line 713
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 714
    .line 715
    .line 716
    move-result v2

    .line 717
    if-eqz v2, :cond_28

    .line 718
    .line 719
    goto :goto_1a

    .line 720
    :cond_28
    iget-object v0, v0, Li/q1;->c:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast v0, Ls0/g;

    .line 723
    .line 724
    if-eqz v0, :cond_29

    .line 725
    .line 726
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 727
    .line 728
    .line 729
    goto :goto_1a

    .line 730
    :cond_29
    const-string v0, "listAdapter"

    .line 731
    .line 732
    invoke-static {v0}, LN0/g;->g(Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    throw v20

    .line 736
    :cond_2a
    :goto_1a
    return-void

    .line 737
    :pswitch_2
    iget-object v0, v1, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v0, Landroid/widget/ListView;

    .line 740
    .line 741
    invoke-virtual {v0}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 742
    .line 743
    .line 744
    return-void

    .line 745
    :pswitch_3
    iget-object v0, v1, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v0, Li/W;

    .line 748
    .line 749
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    return-void

    .line 753
    :pswitch_4
    iget-object v0, v1, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 756
    .line 757
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->m()V

    .line 758
    .line 759
    .line 760
    return-void

    .line 761
    :pswitch_5
    iget-object v0, v1, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v0, Landroidx/lifecycle/B;

    .line 764
    .line 765
    const-string v2, "this$0"

    .line 766
    .line 767
    invoke-static {v0, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    iget v2, v0, Landroidx/lifecycle/B;->c:I

    .line 771
    .line 772
    iget-object v4, v0, Landroidx/lifecycle/B;->g:Landroidx/lifecycle/u;

    .line 773
    .line 774
    if-nez v2, :cond_2b

    .line 775
    .line 776
    iput-boolean v3, v0, Landroidx/lifecycle/B;->d:Z

    .line 777
    .line 778
    sget-object v2, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 779
    .line 780
    invoke-virtual {v4, v2}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 781
    .line 782
    .line 783
    :cond_2b
    iget v2, v0, Landroidx/lifecycle/B;->b:I

    .line 784
    .line 785
    if-nez v2, :cond_2c

    .line 786
    .line 787
    iget-boolean v2, v0, Landroidx/lifecycle/B;->d:Z

    .line 788
    .line 789
    if-eqz v2, :cond_2c

    .line 790
    .line 791
    sget-object v2, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 792
    .line 793
    invoke-virtual {v4, v2}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 794
    .line 795
    .line 796
    iput-boolean v3, v0, Landroidx/lifecycle/B;->e:Z

    .line 797
    .line 798
    :cond_2c
    return-void

    .line 799
    :pswitch_6
    iget-object v0, v1, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 800
    .line 801
    move-object v3, v0

    .line 802
    check-cast v3, Landroidx/emoji2/text/p;

    .line 803
    .line 804
    const-string v0, "fetchFonts result is not OK. ("

    .line 805
    .line 806
    iget-object v4, v3, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    .line 807
    .line 808
    monitor-enter v4

    .line 809
    :try_start_0
    iget-object v5, v3, Landroidx/emoji2/text/p;->i:LD/h;

    .line 810
    .line 811
    if-nez v5, :cond_2d

    .line 812
    .line 813
    monitor-exit v4

    .line 814
    goto/16 :goto_20

    .line 815
    .line 816
    :catchall_0
    move-exception v0

    .line 817
    goto/16 :goto_22

    .line 818
    .line 819
    :cond_2d
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 820
    :try_start_1
    invoke-virtual {v3}, Landroidx/emoji2/text/p;->b()Lv/h;

    .line 821
    .line 822
    .line 823
    move-result-object v4

    .line 824
    iget v5, v4, Lv/h;->e:I

    .line 825
    .line 826
    const/4 v6, 0x2

    .line 827
    if-ne v5, v6, :cond_2e

    .line 828
    .line 829
    iget-object v6, v3, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    .line 830
    .line 831
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 832
    :try_start_2
    monitor-exit v6

    .line 833
    goto :goto_1b

    .line 834
    :catchall_1
    move-exception v0

    .line 835
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 836
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 837
    :catchall_2
    move-exception v0

    .line 838
    goto/16 :goto_1e

    .line 839
    .line 840
    :cond_2e
    :goto_1b
    if-nez v5, :cond_31

    .line 841
    .line 842
    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 843
    .line 844
    sget v5, Lu/d;->a:I

    .line 845
    .line 846
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 847
    .line 848
    .line 849
    iget-object v0, v3, Landroidx/emoji2/text/p;->d:LG/d;

    .line 850
    .line 851
    iget-object v5, v3, Landroidx/emoji2/text/p;->b:Landroid/content/Context;

    .line 852
    .line 853
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    filled-new-array {v4}, [Lv/h;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    sget-object v6, Lr/f;->a:Lb1/h;

    .line 861
    .line 862
    invoke-virtual {v6, v5, v0, v2}, Lb1/h;->m(Landroid/content/Context;[Lv/h;I)Landroid/graphics/Typeface;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    iget-object v2, v3, Landroidx/emoji2/text/p;->b:Landroid/content/Context;

    .line 867
    .line 868
    iget-object v4, v4, Lv/h;->a:Landroid/net/Uri;

    .line 869
    .line 870
    invoke-static {v2, v4}, Lb1/h;->G(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 871
    .line 872
    .line 873
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 874
    if-eqz v2, :cond_30

    .line 875
    .line 876
    if-eqz v0, :cond_30

    .line 877
    .line 878
    :try_start_5
    const-string v4, "EmojiCompat.MetadataRepo.create"

    .line 879
    .line 880
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    new-instance v4, Landroidx/emoji2/text/s;

    .line 884
    .line 885
    invoke-static {v2}, LD/h;->M(Ljava/nio/MappedByteBuffer;)LG/b;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    invoke-direct {v4, v0, v2}, Landroidx/emoji2/text/s;-><init>(Landroid/graphics/Typeface;LG/b;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 890
    .line 891
    .line 892
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 893
    .line 894
    .line 895
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 896
    .line 897
    .line 898
    iget-object v2, v3, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    .line 899
    .line 900
    monitor-enter v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 901
    :try_start_8
    iget-object v0, v3, Landroidx/emoji2/text/p;->i:LD/h;

    .line 902
    .line 903
    if-eqz v0, :cond_2f

    .line 904
    .line 905
    invoke-virtual {v0, v4}, LD/h;->I(Landroidx/emoji2/text/s;)V

    .line 906
    .line 907
    .line 908
    goto :goto_1c

    .line 909
    :catchall_3
    move-exception v0

    .line 910
    goto :goto_1d

    .line 911
    :cond_2f
    :goto_1c
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 912
    :try_start_9
    invoke-virtual {v3}, Landroidx/emoji2/text/p;->a()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 913
    .line 914
    .line 915
    goto :goto_20

    .line 916
    :goto_1d
    :try_start_a
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 917
    :try_start_b
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 918
    :catchall_4
    move-exception v0

    .line 919
    :try_start_c
    sget v2, Lu/d;->a:I

    .line 920
    .line 921
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 922
    .line 923
    .line 924
    throw v0

    .line 925
    :cond_30
    new-instance v0, Ljava/lang/RuntimeException;

    .line 926
    .line 927
    const-string v2, "Unable to open file."

    .line 928
    .line 929
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 933
    :catchall_5
    move-exception v0

    .line 934
    :try_start_d
    sget v2, Lu/d;->a:I

    .line 935
    .line 936
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 937
    .line 938
    .line 939
    throw v0

    .line 940
    :cond_31
    new-instance v2, Ljava/lang/RuntimeException;

    .line 941
    .line 942
    new-instance v4, Ljava/lang/StringBuilder;

    .line 943
    .line 944
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 948
    .line 949
    .line 950
    const-string v0, ")"

    .line 951
    .line 952
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 960
    .line 961
    .line 962
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 963
    :goto_1e
    iget-object v2, v3, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    .line 964
    .line 965
    monitor-enter v2

    .line 966
    :try_start_e
    iget-object v4, v3, Landroidx/emoji2/text/p;->i:LD/h;

    .line 967
    .line 968
    if-eqz v4, :cond_32

    .line 969
    .line 970
    invoke-virtual {v4, v0}, LD/h;->F(Ljava/lang/Throwable;)V

    .line 971
    .line 972
    .line 973
    goto :goto_1f

    .line 974
    :catchall_6
    move-exception v0

    .line 975
    goto :goto_21

    .line 976
    :cond_32
    :goto_1f
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 977
    invoke-virtual {v3}, Landroidx/emoji2/text/p;->a()V

    .line 978
    .line 979
    .line 980
    :goto_20
    return-void

    .line 981
    :goto_21
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 982
    throw v0

    .line 983
    :goto_22
    :try_start_10
    monitor-exit v4
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 984
    throw v0

    .line 985
    :pswitch_7
    iget-object v0, v1, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast v0, Le/w;

    .line 988
    .line 989
    invoke-static {v0}, Le/w;->a(Le/w;)V

    .line 990
    .line 991
    .line 992
    return-void

    .line 993
    :pswitch_8
    iget-object v0, v1, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v0, Le/i;

    .line 996
    .line 997
    invoke-virtual {v0}, Le/i;->invalidateOptionsMenu()V

    .line 998
    .line 999
    .line 1000
    return-void

    .line 1001
    :pswitch_data_0
    .packed-switch 0x0
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
