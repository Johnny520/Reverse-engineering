.class public final Ls8/b;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls8/c;

.field public final synthetic c:Lr8/g;


# direct methods
.method public synthetic constructor <init>(Ls8/c;Lr8/g;I)V
    .locals 0

    .line 1
    iput p3, p0, Ls8/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ls8/b;->b:Ls8/c;

    .line 4
    .line 5
    iput-object p2, p0, Ls8/b;->c:Lr8/g;

    .line 6
    .line 7
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 48

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Ls8/b;->a:I

    .line 6
    .line 7
    const-string v3, "\u64a4\u56de"

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    const/16 v5, 0x2f

    .line 12
    .line 13
    const/16 v6, 0x2b

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    const/16 v8, 0x22

    .line 17
    .line 18
    iget-object v11, v1, Ls8/b;->c:Lr8/g;

    .line 19
    .line 20
    const/4 v12, 0x3

    .line 21
    const/4 v13, 0x0

    .line 22
    const/4 v14, 0x1

    .line 23
    iget-object v15, v1, Ls8/b;->b:Ls8/c;

    .line 24
    .line 25
    const-wide/16 v16, 0x0

    .line 26
    .line 27
    const/4 v9, 0x0

    .line 28
    packed-switch v0, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v15, v11}, Ls8/c;->k(Ls8/c;Lr8/g;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_6

    .line 39
    .line 40
    invoke-static {v11}, Ls8/c;->C(Lr8/g;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_0
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v3, v15, Ls8/c;->g:Ljava/util/Set;

    .line 50
    .line 51
    if-eqz v0, :cond_6

    .line 52
    .line 53
    array-length v4, v0

    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    aget-object v4, v0, v13

    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-static {v10}, Ls8/c;->A(Ljava/lang/Class;)Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    if-eqz v10, :cond_2

    .line 70
    .line 71
    invoke-static {v4}, Ls8/c;->H(Ljava/lang/Object;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v10

    .line 75
    invoke-static {v4}, Ls8/c;->I(Ljava/lang/Object;)I

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    invoke-interface {v3, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-eqz v10, :cond_2

    .line 88
    .line 89
    if-eq v13, v12, :cond_5

    .line 90
    .line 91
    if-eq v13, v8, :cond_5

    .line 92
    .line 93
    if-eq v13, v6, :cond_5

    .line 94
    .line 95
    if-ne v13, v5, :cond_2

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    array-length v5, v0

    .line 99
    if-lt v5, v7, :cond_6

    .line 100
    .line 101
    instance-of v4, v4, Ljava/lang/String;

    .line 102
    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    aget-object v0, v0, v14

    .line 106
    .line 107
    instance-of v4, v0, Ljava/lang/Number;

    .line 108
    .line 109
    if-eqz v4, :cond_3

    .line 110
    .line 111
    check-cast v0, Ljava/lang/Number;

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    move-object v0, v9

    .line 115
    :goto_0
    if-eqz v0, :cond_4

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v4

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    move-wide/from16 v4, v16

    .line 123
    .line 124
    :goto_1
    cmp-long v0, v4, v16

    .line 125
    .line 126
    if-lez v0, :cond_6

    .line 127
    .line 128
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    :cond_5
    :goto_2
    invoke-virtual {v2, v9}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_6
    :goto_3
    return-void

    .line 142
    :pswitch_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-static {v15, v11}, Ls8/c;->k(Ls8/c;Lr8/g;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_e

    .line 150
    .line 151
    invoke-static {v11}, Ls8/c;->C(Lr8/g;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_7

    .line 156
    .line 157
    goto/16 :goto_5

    .line 158
    .line 159
    :cond_7
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 160
    .line 161
    if-eqz v0, :cond_e

    .line 162
    .line 163
    array-length v3, v0

    .line 164
    if-ge v3, v7, :cond_8

    .line 165
    .line 166
    goto/16 :goto_5

    .line 167
    .line 168
    :cond_8
    aget-object v3, v0, v13

    .line 169
    .line 170
    if-eqz v3, :cond_e

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-static {v4}, Ls8/c;->A(Ljava/lang/Class;)Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-nez v4, :cond_9

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_9
    aget-object v0, v0, v14

    .line 184
    .line 185
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 186
    .line 187
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_a

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_a
    new-instance v0, Ljava/lang/Throwable;

    .line 195
    .line 196
    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    array-length v4, v0

    .line 207
    move v7, v13

    .line 208
    :goto_4
    if-ge v7, v4, :cond_e

    .line 209
    .line 210
    aget-object v10, v0, v7

    .line 211
    .line 212
    invoke-virtual {v10}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    const-string v14, "onGYNetEnd"

    .line 217
    .line 218
    invoke-static {v11, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    if-eqz v11, :cond_d

    .line 223
    .line 224
    invoke-virtual {v10}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    const-string v11, "com.tencent.mm.modelsimple."

    .line 232
    .line 233
    invoke-static {v10, v11, v13}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    if-eqz v10, :cond_d

    .line 238
    .line 239
    invoke-static {v3}, Ls8/c;->I(Ljava/lang/Object;)I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eq v0, v12, :cond_b

    .line 244
    .line 245
    if-eq v0, v8, :cond_b

    .line 246
    .line 247
    if-eq v0, v6, :cond_b

    .line 248
    .line 249
    if-ne v0, v5, :cond_e

    .line 250
    .line 251
    :cond_b
    invoke-static {v3}, Ls8/c;->H(Ljava/lang/Object;)J

    .line 252
    .line 253
    .line 254
    move-result-wide v4

    .line 255
    iget-object v0, v15, Ls8/c;->g:Ljava/util/Set;

    .line 256
    .line 257
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-nez v0, :cond_c

    .line 266
    .line 267
    invoke-static {v3}, Ls8/c;->G(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_e

    .line 272
    .line 273
    :cond_c
    invoke-virtual {v15, v4, v5}, Ls8/c;->F(J)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v9}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_d
    add-int/lit8 v7, v7, 0x1

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_e
    :goto_5
    return-void

    .line 284
    :pswitch_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object v5, v15, Ls8/c;->e:Ljava/util/Set;

    .line 288
    .line 289
    iget-object v6, v1, Ls8/b;->c:Lr8/g;

    .line 290
    .line 291
    invoke-static {v15, v6}, Ls8/c;->k(Ls8/c;Lr8/g;)Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-nez v0, :cond_f

    .line 296
    .line 297
    goto/16 :goto_3f

    .line 298
    .line 299
    :cond_f
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 300
    .line 301
    if-eqz v0, :cond_4f

    .line 302
    .line 303
    invoke-static {v13, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    instance-of v10, v8, Ljava/lang/String;

    .line 308
    .line 309
    if-eqz v10, :cond_10

    .line 310
    .line 311
    check-cast v8, Ljava/lang/String;

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_10
    move-object v8, v9

    .line 315
    :goto_6
    if-eqz v8, :cond_11

    .line 316
    .line 317
    goto :goto_7

    .line 318
    :cond_11
    move-object v8, v4

    .line 319
    :goto_7
    invoke-static {v14, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v10

    .line 323
    instance-of v11, v10, Ljava/lang/Number;

    .line 324
    .line 325
    if-eqz v11, :cond_12

    .line 326
    .line 327
    check-cast v10, Ljava/lang/Number;

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_12
    move-object v10, v9

    .line 331
    :goto_8
    if-eqz v10, :cond_13

    .line 332
    .line 333
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 334
    .line 335
    .line 336
    move-result-wide v10

    .line 337
    goto :goto_9

    .line 338
    :cond_13
    move-wide/from16 v10, v16

    .line 339
    .line 340
    :goto_9
    invoke-static {v12, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v9

    .line 344
    instance-of v12, v9, Ljava/lang/String;

    .line 345
    .line 346
    if-eqz v12, :cond_14

    .line 347
    .line 348
    check-cast v9, Ljava/lang/String;

    .line 349
    .line 350
    goto :goto_a

    .line 351
    :cond_14
    const/4 v9, 0x0

    .line 352
    :goto_a
    if-eqz v9, :cond_15

    .line 353
    .line 354
    goto :goto_b

    .line 355
    :cond_15
    move-object v9, v4

    .line 356
    :goto_b
    invoke-static {v7, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    const-string v12, "a"

    .line 361
    .line 362
    invoke-static {v7, v12}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 367
    .line 368
    .line 369
    move-result-object v19

    .line 370
    if-eqz v19, :cond_16

    .line 371
    .line 372
    invoke-virtual/range {v19 .. v19}, Lg8/a;->c()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v19

    .line 376
    goto :goto_c

    .line 377
    :cond_16
    const/16 v19, 0x0

    .line 378
    .line 379
    :goto_c
    if-nez v19, :cond_17

    .line 380
    .line 381
    move-object v14, v4

    .line 382
    goto :goto_d

    .line 383
    :cond_17
    move-object/from16 v14, v19

    .line 384
    .line 385
    :goto_d
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageParser()Lk8/q;

    .line 386
    .line 387
    .line 388
    move-result-object v19

    .line 389
    if-eqz v19, :cond_18

    .line 390
    .line 391
    invoke-static {v0, v14}, Lk8/q;->k(Ljava/lang/Object;Ljava/lang/String;)Ll8/e;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    if-eqz v0, :cond_18

    .line 396
    .line 397
    iget-wide v13, v0, Ll8/e;->c:J

    .line 398
    .line 399
    goto :goto_e

    .line 400
    :catchall_0
    move-exception v0

    .line 401
    goto :goto_f

    .line 402
    :cond_18
    move-wide/from16 v13, v16

    .line 403
    .line 404
    :goto_e
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 405
    .line 406
    .line 407
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 408
    goto :goto_10

    .line 409
    :goto_f
    new-instance v13, Lsf/f;

    .line 410
    .line 411
    invoke-direct {v13, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 412
    .line 413
    .line 414
    move-object v0, v13

    .line 415
    :goto_10
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 416
    .line 417
    .line 418
    move-result-object v13

    .line 419
    instance-of v14, v0, Lsf/f;

    .line 420
    .line 421
    if-eqz v14, :cond_19

    .line 422
    .line 423
    move-object v0, v13

    .line 424
    :cond_19
    check-cast v0, Ljava/lang/Number;

    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 427
    .line 428
    .line 429
    move-result-wide v13

    .line 430
    invoke-static {v13, v14}, Ls8/c;->K(J)J

    .line 431
    .line 432
    .line 433
    move-result-wide v13

    .line 434
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    cmp-long v13, v13, v16

    .line 439
    .line 440
    if-lez v13, :cond_1a

    .line 441
    .line 442
    goto :goto_11

    .line 443
    :cond_1a
    const/4 v0, 0x0

    .line 444
    :goto_11
    if-eqz v0, :cond_1b

    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 447
    .line 448
    .line 449
    move-result-wide v13

    .line 450
    goto :goto_12

    .line 451
    :cond_1b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 452
    .line 453
    .line 454
    move-result-wide v13

    .line 455
    :goto_12
    invoke-static {v7, v12}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    const-string v12, "h"

    .line 460
    .line 461
    invoke-static {v0, v12}, Ls8/c;->l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v12

    .line 465
    const-string v1, "e"

    .line 466
    .line 467
    invoke-static {v0, v1}, Ls8/c;->l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 472
    .line 473
    .line 474
    move-result-object v19

    .line 475
    move-object/from16 v20, v4

    .line 476
    .line 477
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    move-wide/from16 v32, v13

    .line 482
    .line 483
    const-string v13, "\u4f60\u64a4\u56de"

    .line 484
    .line 485
    const/4 v14, 0x0

    .line 486
    invoke-static {v4, v13, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 487
    .line 488
    .line 489
    move-result v13

    .line 490
    if-nez v13, :cond_22

    .line 491
    .line 492
    const-string v13, "\"\u4f60\"\u64a4\u56de"

    .line 493
    .line 494
    invoke-static {v4, v13, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 495
    .line 496
    .line 497
    move-result v13

    .line 498
    if-nez v13, :cond_22

    .line 499
    .line 500
    const-string v13, "\u201c\u4f60\u201d\u64a4\u56de"

    .line 501
    .line 502
    invoke-static {v4, v13, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    if-eqz v4, :cond_1c

    .line 507
    .line 508
    goto :goto_16

    .line 509
    :cond_1c
    invoke-static {v8, v1}, Ls8/c;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    if-eqz v4, :cond_1d

    .line 514
    .line 515
    :goto_13
    move-object/from16 v24, v1

    .line 516
    .line 517
    goto :goto_17

    .line 518
    :cond_1d
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 519
    .line 520
    .line 521
    move-result v1

    .line 522
    if-eqz v1, :cond_1e

    .line 523
    .line 524
    move-object/from16 v4, v20

    .line 525
    .line 526
    goto :goto_15

    .line 527
    :cond_1e
    const-string v1, "[\"\u201c](.*?)[\"\u201d]\\s*\u64a4\u56de"

    .line 528
    .line 529
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    const/4 v14, 0x0

    .line 544
    invoke-static {v1, v14, v9}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    if-eqz v1, :cond_1f

    .line 549
    .line 550
    invoke-virtual {v1}, Log/i;->a()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    const/4 v4, 0x1

    .line 555
    invoke-static {v4, v1}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    check-cast v1, Ljava/lang/String;

    .line 560
    .line 561
    if-eqz v1, :cond_1f

    .line 562
    .line 563
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    move-object v4, v1

    .line 572
    goto :goto_14

    .line 573
    :cond_1f
    const/4 v4, 0x0

    .line 574
    :goto_14
    if-eqz v4, :cond_20

    .line 575
    .line 576
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    if-eqz v1, :cond_21

    .line 581
    .line 582
    :cond_20
    invoke-static {v9, v3}, Log/m;->N0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    const/4 v3, 0x3

    .line 595
    new-array v3, v3, [C

    .line 596
    .line 597
    fill-array-data v3, :array_0

    .line 598
    .line 599
    .line 600
    invoke-static {v1, v3}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    :cond_21
    :goto_15
    move-object/from16 v24, v4

    .line 605
    .line 606
    goto :goto_17

    .line 607
    :cond_22
    :goto_16
    const-string v1, "\u4f60"

    .line 608
    .line 609
    goto :goto_13

    .line 610
    :goto_17
    const-string v1, "f"

    .line 611
    .line 612
    invoke-static {v0, v1}, Ls8/c;->l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v25

    .line 616
    const-string v1, "msgid"

    .line 617
    .line 618
    invoke-static {v12, v1}, Ls8/c;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    const-string v3, "r"

    .line 623
    .line 624
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    instance-of v3, v0, Ljava/lang/Number;

    .line 629
    .line 630
    if-eqz v3, :cond_23

    .line 631
    .line 632
    check-cast v0, Ljava/lang/Number;

    .line 633
    .line 634
    goto :goto_18

    .line 635
    :cond_23
    const/4 v0, 0x0

    .line 636
    :goto_18
    if-eqz v0, :cond_24

    .line 637
    .line 638
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 639
    .line 640
    .line 641
    move-result-wide v3

    .line 642
    :goto_19
    move-wide/from16 v21, v3

    .line 643
    .line 644
    goto :goto_1a

    .line 645
    :cond_24
    const-string v0, "newmsgid"

    .line 646
    .line 647
    invoke-static {v12, v0}, Ls8/c;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    if-eqz v0, :cond_25

    .line 652
    .line 653
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 654
    .line 655
    .line 656
    move-result-wide v3

    .line 657
    goto :goto_19

    .line 658
    :cond_25
    move-wide/from16 v21, v16

    .line 659
    .line 660
    :goto_1a
    const-string v0, "c"

    .line 661
    .line 662
    invoke-static {v7, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    if-eqz v0, :cond_26

    .line 667
    .line 668
    goto :goto_1b

    .line 669
    :cond_26
    const-string v0, "d"

    .line 670
    .line 671
    invoke-static {v7, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    :goto_1b
    instance-of v3, v0, Ljava/lang/Number;

    .line 676
    .line 677
    if-eqz v3, :cond_27

    .line 678
    .line 679
    check-cast v0, Ljava/lang/Number;

    .line 680
    .line 681
    goto :goto_1c

    .line 682
    :cond_27
    const/4 v0, 0x0

    .line 683
    :goto_1c
    if-eqz v0, :cond_28

    .line 684
    .line 685
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    move/from16 v30, v0

    .line 690
    .line 691
    goto :goto_1d

    .line 692
    :cond_28
    const/16 v30, 0x0

    .line 693
    .line 694
    :goto_1d
    if-eqz v1, :cond_29

    .line 695
    .line 696
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 697
    .line 698
    .line 699
    move-result-wide v0

    .line 700
    move-wide/from16 v19, v0

    .line 701
    .line 702
    goto :goto_1e

    .line 703
    :cond_29
    move-wide/from16 v19, v10

    .line 704
    .line 705
    :goto_1e
    invoke-static/range {v24 .. v24}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-eqz v0, :cond_2a

    .line 710
    .line 711
    invoke-static/range {v25 .. v25}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    if-eqz v0, :cond_2a

    .line 716
    .line 717
    cmp-long v0, v19, v16

    .line 718
    .line 719
    if-gtz v0, :cond_2a

    .line 720
    .line 721
    cmp-long v0, v21, v16

    .line 722
    .line 723
    if-gtz v0, :cond_2a

    .line 724
    .line 725
    move-object v4, v8

    .line 726
    const/4 v0, 0x0

    .line 727
    goto :goto_1f

    .line 728
    :cond_2a
    new-instance v18, Ll8/f;

    .line 729
    .line 730
    const-string v29, ""

    .line 731
    .line 732
    const/16 v31, 0x0

    .line 733
    .line 734
    const-wide/16 v26, 0x0

    .line 735
    .line 736
    const-string v28, ""

    .line 737
    .line 738
    move-object/from16 v23, v8

    .line 739
    .line 740
    invoke-direct/range {v18 .. v31}, Ll8/f;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 741
    .line 742
    .line 743
    move-object/from16 v4, v23

    .line 744
    .line 745
    move-object/from16 v0, v18

    .line 746
    .line 747
    :goto_1f
    invoke-static {v0}, Ls8/c;->y(Ll8/f;)Z

    .line 748
    .line 749
    .line 750
    move-result v1

    .line 751
    if-eqz v1, :cond_2b

    .line 752
    .line 753
    goto :goto_23

    .line 754
    :cond_2b
    if-eqz v0, :cond_2d

    .line 755
    .line 756
    iget-wide v7, v0, Ll8/f;->a:J

    .line 757
    .line 758
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    cmp-long v3, v7, v16

    .line 763
    .line 764
    if-lez v3, :cond_2c

    .line 765
    .line 766
    goto :goto_20

    .line 767
    :cond_2c
    const/4 v1, 0x0

    .line 768
    :goto_20
    if-eqz v1, :cond_2d

    .line 769
    .line 770
    :goto_21
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 771
    .line 772
    .line 773
    move-result-wide v7

    .line 774
    goto :goto_24

    .line 775
    :cond_2d
    if-eqz v0, :cond_2e

    .line 776
    .line 777
    iget-wide v7, v0, Ll8/f;->b:J

    .line 778
    .line 779
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    cmp-long v3, v7, v16

    .line 784
    .line 785
    if-lez v3, :cond_2e

    .line 786
    .line 787
    goto :goto_22

    .line 788
    :cond_2e
    const/4 v1, 0x0

    .line 789
    :goto_22
    if-eqz v1, :cond_2f

    .line 790
    .line 791
    goto :goto_21

    .line 792
    :cond_2f
    :goto_23
    move-wide v7, v10

    .line 793
    :goto_24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 794
    .line 795
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    const-string v3, ":"

    .line 802
    .line 803
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 814
    .line 815
    .line 816
    move-result v7

    .line 817
    if-eqz v7, :cond_30

    .line 818
    .line 819
    const/4 v7, 0x0

    .line 820
    goto :goto_25

    .line 821
    :cond_30
    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result v7

    .line 825
    :goto_25
    if-nez v7, :cond_4e

    .line 826
    .line 827
    invoke-static {v10, v11, v0}, Ls8/c;->M(JLl8/f;)Ljava/util/ArrayList;

    .line 828
    .line 829
    .line 830
    move-result-object v7

    .line 831
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 832
    .line 833
    .line 834
    move-result-object v7

    .line 835
    :cond_31
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 836
    .line 837
    .line 838
    move-result v8

    .line 839
    if-eqz v8, :cond_37

    .line 840
    .line 841
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v8

    .line 845
    check-cast v8, Ljava/lang/Number;

    .line 846
    .line 847
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 848
    .line 849
    .line 850
    move-result-wide v8

    .line 851
    iget-object v12, v15, Ls8/c;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 852
    .line 853
    new-instance v13, Ljava/lang/StringBuilder;

    .line 854
    .line 855
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 856
    .line 857
    .line 858
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 859
    .line 860
    .line 861
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v13, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v13

    .line 871
    invoke-virtual {v12, v13}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v12

    .line 875
    check-cast v12, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 876
    .line 877
    if-eqz v12, :cond_32

    .line 878
    .line 879
    goto :goto_28

    .line 880
    :cond_32
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 881
    .line 882
    .line 883
    move-result-object v12

    .line 884
    if-eqz v12, :cond_33

    .line 885
    .line 886
    invoke-virtual {v12, v8, v9}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 887
    .line 888
    .line 889
    move-result-object v12

    .line 890
    if-eqz v12, :cond_33

    .line 891
    .line 892
    goto :goto_27

    .line 893
    :cond_33
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 894
    .line 895
    .line 896
    move-result-object v12

    .line 897
    if-eqz v12, :cond_34

    .line 898
    .line 899
    invoke-virtual {v12, v8, v9, v4}, Lk8/s;->e(JLjava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 900
    .line 901
    .line 902
    move-result-object v12

    .line 903
    goto :goto_26

    .line 904
    :cond_34
    const/4 v12, 0x0

    .line 905
    :goto_26
    if-eqz v12, :cond_35

    .line 906
    .line 907
    goto :goto_27

    .line 908
    :cond_35
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 909
    .line 910
    .line 911
    move-result-object v12

    .line 912
    if-eqz v12, :cond_36

    .line 913
    .line 914
    invoke-virtual {v12, v8, v9}, Lk8/s;->d(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 915
    .line 916
    .line 917
    move-result-object v8

    .line 918
    move-object v12, v8

    .line 919
    goto :goto_27

    .line 920
    :cond_36
    const/4 v12, 0x0

    .line 921
    :goto_27
    if-eqz v12, :cond_31

    .line 922
    .line 923
    invoke-virtual {v15, v12}, Ls8/c;->N(Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 924
    .line 925
    .line 926
    goto :goto_28

    .line 927
    :cond_37
    const/4 v12, 0x0

    .line 928
    :goto_28
    if-eqz v12, :cond_42

    .line 929
    .line 930
    new-instance v18, Ll8/f;

    .line 931
    .line 932
    iget-wide v7, v12, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 933
    .line 934
    iget-object v3, v12, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 935
    .line 936
    invoke-virtual {v12}, Lh/Hchat/hooks/api/model/WeChatMessage;->sendTalker()Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v24

    .line 940
    iget-wide v13, v12, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 941
    .line 942
    invoke-virtual {v12}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v28

    .line 946
    invoke-virtual {v12}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgSource()Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v29

    .line 950
    iget v9, v12, Lh/Hchat/hooks/api/model/WeChatMessage;->flag:I

    .line 951
    .line 952
    const-wide/16 v21, 0x0

    .line 953
    .line 954
    const-string v25, ""

    .line 955
    .line 956
    move-object/from16 v23, v3

    .line 957
    .line 958
    move-wide/from16 v19, v7

    .line 959
    .line 960
    move/from16 v30, v9

    .line 961
    .line 962
    move-object/from16 v31, v12

    .line 963
    .line 964
    move-wide/from16 v26, v13

    .line 965
    .line 966
    invoke-direct/range {v18 .. v31}, Ll8/f;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 967
    .line 968
    .line 969
    move-object/from16 v3, v18

    .line 970
    .line 971
    if-eqz v0, :cond_43

    .line 972
    .line 973
    iget-object v7, v0, Ll8/f;->h:Ljava/lang/String;

    .line 974
    .line 975
    iget-object v8, v0, Ll8/f;->g:Ljava/lang/String;

    .line 976
    .line 977
    iget-object v9, v0, Ll8/f;->e:Ljava/lang/String;

    .line 978
    .line 979
    iget-object v12, v0, Ll8/f;->d:Ljava/lang/String;

    .line 980
    .line 981
    iget-object v13, v0, Ll8/f;->c:Ljava/lang/String;

    .line 982
    .line 983
    new-instance v34, Ll8/f;

    .line 984
    .line 985
    move-object v14, v7

    .line 986
    move-object/from16 v18, v8

    .line 987
    .line 988
    iget-wide v7, v0, Ll8/f;->a:J

    .line 989
    .line 990
    cmp-long v23, v7, v16

    .line 991
    .line 992
    if-lez v23, :cond_38

    .line 993
    .line 994
    move-wide/from16 v35, v7

    .line 995
    .line 996
    goto :goto_29

    .line 997
    :cond_38
    move-wide/from16 v35, v19

    .line 998
    .line 999
    :goto_29
    iget-wide v7, v0, Ll8/f;->b:J

    .line 1000
    .line 1001
    cmp-long v19, v7, v16

    .line 1002
    .line 1003
    if-lez v19, :cond_39

    .line 1004
    .line 1005
    move-wide/from16 v37, v7

    .line 1006
    .line 1007
    goto :goto_2a

    .line 1008
    :cond_39
    move-wide/from16 v37, v21

    .line 1009
    .line 1010
    :goto_2a
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    .line 1011
    .line 1012
    .line 1013
    move-result v7

    .line 1014
    if-nez v7, :cond_3a

    .line 1015
    .line 1016
    :goto_2b
    move-object/from16 v39, v13

    .line 1017
    .line 1018
    goto :goto_2c

    .line 1019
    :cond_3a
    iget-object v13, v3, Ll8/f;->c:Ljava/lang/String;

    .line 1020
    .line 1021
    goto :goto_2b

    .line 1022
    :goto_2c
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 1023
    .line 1024
    .line 1025
    move-result v7

    .line 1026
    if-nez v7, :cond_3b

    .line 1027
    .line 1028
    :goto_2d
    move-object/from16 v40, v12

    .line 1029
    .line 1030
    goto :goto_2e

    .line 1031
    :cond_3b
    iget-object v12, v3, Ll8/f;->d:Ljava/lang/String;

    .line 1032
    .line 1033
    goto :goto_2d

    .line 1034
    :goto_2e
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v7

    .line 1038
    if-nez v7, :cond_3c

    .line 1039
    .line 1040
    :goto_2f
    move-object/from16 v41, v9

    .line 1041
    .line 1042
    goto :goto_30

    .line 1043
    :cond_3c
    iget-object v9, v3, Ll8/f;->e:Ljava/lang/String;

    .line 1044
    .line 1045
    goto :goto_2f

    .line 1046
    :goto_30
    invoke-virtual {v0}, Ll8/f;->a()J

    .line 1047
    .line 1048
    .line 1049
    move-result-wide v7

    .line 1050
    cmp-long v7, v7, v16

    .line 1051
    .line 1052
    if-lez v7, :cond_3d

    .line 1053
    .line 1054
    invoke-virtual {v0}, Ll8/f;->a()J

    .line 1055
    .line 1056
    .line 1057
    move-result-wide v7

    .line 1058
    :goto_31
    move-wide/from16 v42, v7

    .line 1059
    .line 1060
    goto :goto_32

    .line 1061
    :cond_3d
    invoke-virtual {v3}, Ll8/f;->a()J

    .line 1062
    .line 1063
    .line 1064
    move-result-wide v7

    .line 1065
    goto :goto_31

    .line 1066
    :goto_32
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->isEmpty()Z

    .line 1067
    .line 1068
    .line 1069
    move-result v7

    .line 1070
    if-nez v7, :cond_3e

    .line 1071
    .line 1072
    move-object/from16 v44, v18

    .line 1073
    .line 1074
    goto :goto_33

    .line 1075
    :cond_3e
    iget-object v8, v3, Ll8/f;->g:Ljava/lang/String;

    .line 1076
    .line 1077
    move-object/from16 v44, v8

    .line 1078
    .line 1079
    :goto_33
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    .line 1080
    .line 1081
    .line 1082
    move-result v7

    .line 1083
    if-nez v7, :cond_3f

    .line 1084
    .line 1085
    move-object/from16 v45, v14

    .line 1086
    .line 1087
    goto :goto_34

    .line 1088
    :cond_3f
    iget-object v7, v3, Ll8/f;->h:Ljava/lang/String;

    .line 1089
    .line 1090
    move-object/from16 v45, v7

    .line 1091
    .line 1092
    :goto_34
    iget v9, v0, Ll8/f;->i:I

    .line 1093
    .line 1094
    if-eqz v9, :cond_40

    .line 1095
    .line 1096
    move/from16 v46, v9

    .line 1097
    .line 1098
    goto :goto_35

    .line 1099
    :cond_40
    move/from16 v46, v30

    .line 1100
    .line 1101
    :goto_35
    iget-object v12, v0, Ll8/f;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1102
    .line 1103
    if-eqz v12, :cond_41

    .line 1104
    .line 1105
    move-object/from16 v47, v12

    .line 1106
    .line 1107
    goto :goto_36

    .line 1108
    :cond_41
    move-object/from16 v47, v31

    .line 1109
    .line 1110
    :goto_36
    invoke-direct/range {v34 .. v47}, Ll8/f;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 1111
    .line 1112
    .line 1113
    move-object/from16 v3, v34

    .line 1114
    .line 1115
    goto :goto_37

    .line 1116
    :cond_42
    move-object v3, v0

    .line 1117
    :cond_43
    :goto_37
    invoke-static {v0}, Ls8/c;->y(Ll8/f;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v0

    .line 1121
    invoke-static {v3}, Ls8/c;->y(Ll8/f;)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v7

    .line 1125
    if-nez v0, :cond_45

    .line 1126
    .line 1127
    if-eqz v7, :cond_44

    .line 1128
    .line 1129
    goto :goto_38

    .line 1130
    :cond_44
    const/16 v25, 0x0

    .line 1131
    .line 1132
    goto :goto_39

    .line 1133
    :cond_45
    :goto_38
    const/16 v25, 0x1

    .line 1134
    .line 1135
    :goto_39
    if-eqz v25, :cond_46

    .line 1136
    .line 1137
    invoke-static {v6}, Ls8/c;->C(Lr8/g;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v0

    .line 1141
    if-nez v0, :cond_46

    .line 1142
    .line 1143
    const/4 v13, 0x0

    .line 1144
    goto :goto_3c

    .line 1145
    :cond_46
    if-eqz v25, :cond_48

    .line 1146
    .line 1147
    if-eqz v3, :cond_47

    .line 1148
    .line 1149
    iget-object v0, v3, Ll8/f;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1150
    .line 1151
    if-eqz v0, :cond_47

    .line 1152
    .line 1153
    iget-wide v7, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 1154
    .line 1155
    goto :goto_3a

    .line 1156
    :cond_47
    move-wide/from16 v7, v16

    .line 1157
    .line 1158
    :goto_3a
    cmp-long v0, v7, v16

    .line 1159
    .line 1160
    if-lez v0, :cond_48

    .line 1161
    .line 1162
    invoke-virtual {v15, v7, v8}, Ls8/c;->F(J)V

    .line 1163
    .line 1164
    .line 1165
    :cond_48
    iget-object v0, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1166
    .line 1167
    const-string v7, "anti_recall_show_notice"

    .line 1168
    .line 1169
    const-string v8, "Hchat_anti_recall_config"

    .line 1170
    .line 1171
    if-eqz v25, :cond_49

    .line 1172
    .line 1173
    invoke-static {v0, v8}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    const/4 v9, 0x1

    .line 1178
    invoke-interface {v0, v7, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v0

    .line 1182
    if-eqz v0, :cond_4a

    .line 1183
    .line 1184
    const/16 v25, 0x1

    .line 1185
    .line 1186
    move-object/from16 v22, v3

    .line 1187
    .line 1188
    move-object/from16 v19, v4

    .line 1189
    .line 1190
    move-object/from16 v18, v6

    .line 1191
    .line 1192
    move-wide/from16 v20, v10

    .line 1193
    .line 1194
    move-wide/from16 v23, v32

    .line 1195
    .line 1196
    invoke-static/range {v18 .. v25}, Ls8/c;->o(Lr8/g;Ljava/lang/String;JLl8/f;JZ)V

    .line 1197
    .line 1198
    .line 1199
    move v13, v9

    .line 1200
    goto :goto_3c

    .line 1201
    :cond_49
    move-object/from16 v22, v3

    .line 1202
    .line 1203
    move-object/from16 v19, v4

    .line 1204
    .line 1205
    move-object/from16 v18, v6

    .line 1206
    .line 1207
    move-wide/from16 v20, v10

    .line 1208
    .line 1209
    move-wide/from16 v23, v32

    .line 1210
    .line 1211
    const/4 v9, 0x1

    .line 1212
    invoke-static {v0, v8}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    invoke-interface {v0, v7, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v0

    .line 1220
    if-nez v0, :cond_4b

    .line 1221
    .line 1222
    :cond_4a
    :goto_3b
    const/4 v13, 0x1

    .line 1223
    goto :goto_3c

    .line 1224
    :cond_4b
    invoke-static/range {v18 .. v25}, Ls8/c;->o(Lr8/g;Ljava/lang/String;JLl8/f;JZ)V

    .line 1225
    .line 1226
    .line 1227
    goto :goto_3b

    .line 1228
    :goto_3c
    if-nez v13, :cond_4c

    .line 1229
    .line 1230
    goto :goto_3f

    .line 1231
    :cond_4c
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1232
    .line 1233
    .line 1234
    move-result v0

    .line 1235
    if-eqz v0, :cond_4d

    .line 1236
    .line 1237
    goto :goto_3e

    .line 1238
    :cond_4d
    invoke-interface {v5, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1239
    .line 1240
    .line 1241
    invoke-interface {v5}, Ljava/util/Set;->size()I

    .line 1242
    .line 1243
    .line 1244
    move-result v0

    .line 1245
    const/16 v1, 0x3e8

    .line 1246
    .line 1247
    if-le v0, v1, :cond_4e

    .line 1248
    .line 1249
    move-object v0, v5

    .line 1250
    check-cast v0, Ljava/lang/Iterable;

    .line 1251
    .line 1252
    invoke-interface {v5}, Ljava/util/Set;->size()I

    .line 1253
    .line 1254
    .line 1255
    move-result v3

    .line 1256
    sub-int/2addr v3, v1

    .line 1257
    invoke-static {v3, v0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v0

    .line 1261
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1266
    .line 1267
    .line 1268
    move-result v1

    .line 1269
    if-eqz v1, :cond_4e

    .line 1270
    .line 1271
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v1

    .line 1275
    check-cast v1, Ljava/lang/String;

    .line 1276
    .line 1277
    invoke-interface {v5, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1278
    .line 1279
    .line 1280
    goto :goto_3d

    .line 1281
    :cond_4e
    :goto_3e
    const/4 v1, 0x0

    .line 1282
    invoke-virtual {v2, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1283
    .line 1284
    .line 1285
    :cond_4f
    :goto_3f
    return-void

    .line 1286
    :pswitch_2
    move-object/from16 v20, v4

    .line 1287
    .line 1288
    move-object v1, v9

    .line 1289
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1290
    .line 1291
    .line 1292
    invoke-static {v15, v11}, Ls8/c;->k(Ls8/c;Lr8/g;)Z

    .line 1293
    .line 1294
    .line 1295
    move-result v0

    .line 1296
    if-eqz v0, :cond_8e

    .line 1297
    .line 1298
    invoke-static {v11}, Ls8/c;->C(Lr8/g;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v0

    .line 1302
    if-nez v0, :cond_50

    .line 1303
    .line 1304
    goto/16 :goto_63

    .line 1305
    .line 1306
    :cond_50
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1307
    .line 1308
    iget-object v4, v15, Ls8/c;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1309
    .line 1310
    const-string v5, "type"

    .line 1311
    .line 1312
    if-nez v2, :cond_51

    .line 1313
    .line 1314
    goto/16 :goto_63

    .line 1315
    .line 1316
    :cond_51
    invoke-static {v2}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v0

    .line 1320
    instance-of v6, v0, Ljava/lang/String;

    .line 1321
    .line 1322
    if-eqz v6, :cond_52

    .line 1323
    .line 1324
    check-cast v0, Ljava/lang/String;

    .line 1325
    .line 1326
    goto :goto_40

    .line 1327
    :cond_52
    move-object v0, v1

    .line 1328
    :goto_40
    if-eqz v0, :cond_54

    .line 1329
    .line 1330
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v6

    .line 1334
    if-eqz v6, :cond_53

    .line 1335
    .line 1336
    goto :goto_41

    .line 1337
    :cond_53
    move-object v6, v0

    .line 1338
    goto :goto_44

    .line 1339
    :cond_54
    :goto_41
    new-instance v0, Ljava/util/ArrayList;

    .line 1340
    .line 1341
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1342
    .line 1343
    .line 1344
    array-length v6, v2

    .line 1345
    const/4 v7, 0x0

    .line 1346
    :goto_42
    if-ge v7, v6, :cond_56

    .line 1347
    .line 1348
    aget-object v8, v2, v7

    .line 1349
    .line 1350
    instance-of v9, v8, Ljava/lang/String;

    .line 1351
    .line 1352
    if-eqz v9, :cond_55

    .line 1353
    .line 1354
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1355
    .line 1356
    .line 1357
    :cond_55
    add-int/lit8 v7, v7, 0x1

    .line 1358
    .line 1359
    goto :goto_42

    .line 1360
    :cond_56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v0

    .line 1364
    :cond_57
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1365
    .line 1366
    .line 1367
    move-result v6

    .line 1368
    if-eqz v6, :cond_58

    .line 1369
    .line 1370
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v6

    .line 1374
    move-object v7, v6

    .line 1375
    check-cast v7, Ljava/lang/String;

    .line 1376
    .line 1377
    invoke-static {v7}, Ls8/c;->u(Ljava/lang/String;)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v7

    .line 1381
    if-eqz v7, :cond_57

    .line 1382
    .line 1383
    goto :goto_43

    .line 1384
    :cond_58
    move-object v6, v1

    .line 1385
    :goto_43
    move-object v0, v6

    .line 1386
    check-cast v0, Ljava/lang/String;

    .line 1387
    .line 1388
    if-nez v0, :cond_53

    .line 1389
    .line 1390
    move-object/from16 v6, v20

    .line 1391
    .line 1392
    :goto_44
    invoke-static {v6}, Ls8/c;->u(Ljava/lang/String;)Z

    .line 1393
    .line 1394
    .line 1395
    move-result v0

    .line 1396
    if-nez v0, :cond_59

    .line 1397
    .line 1398
    goto/16 :goto_63

    .line 1399
    .line 1400
    :cond_59
    array-length v0, v2

    .line 1401
    const/4 v7, 0x0

    .line 1402
    :goto_45
    if-ge v7, v0, :cond_5b

    .line 1403
    .line 1404
    aget-object v8, v2, v7

    .line 1405
    .line 1406
    instance-of v9, v8, Landroid/content/ContentValues;

    .line 1407
    .line 1408
    if-eqz v9, :cond_5a

    .line 1409
    .line 1410
    goto :goto_46

    .line 1411
    :cond_5a
    add-int/lit8 v7, v7, 0x1

    .line 1412
    .line 1413
    goto :goto_45

    .line 1414
    :cond_5b
    move-object v8, v1

    .line 1415
    :goto_46
    instance-of v0, v8, Landroid/content/ContentValues;

    .line 1416
    .line 1417
    if-eqz v0, :cond_5c

    .line 1418
    .line 1419
    check-cast v8, Landroid/content/ContentValues;

    .line 1420
    .line 1421
    goto :goto_47

    .line 1422
    :cond_5c
    move-object v8, v1

    .line 1423
    :goto_47
    if-eqz v8, :cond_8e

    .line 1424
    .line 1425
    const-string v7, "content"

    .line 1426
    .line 1427
    invoke-virtual {v8, v7}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    if-nez v0, :cond_5d

    .line 1432
    .line 1433
    move-object/from16 v9, v20

    .line 1434
    .line 1435
    goto :goto_48

    .line 1436
    :cond_5d
    move-object v9, v0

    .line 1437
    :goto_48
    :try_start_1
    invoke-virtual {v8, v5}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    if-eqz v0, :cond_5e

    .line 1442
    .line 1443
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1444
    .line 1445
    .line 1446
    move-result v0

    .line 1447
    goto :goto_49

    .line 1448
    :catchall_1
    move-exception v0

    .line 1449
    goto :goto_4b

    .line 1450
    :cond_5e
    const/4 v0, 0x0

    .line 1451
    :goto_49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1455
    :goto_4a
    const/4 v14, 0x0

    .line 1456
    goto :goto_4c

    .line 1457
    :goto_4b
    new-instance v10, Lsf/f;

    .line 1458
    .line 1459
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1460
    .line 1461
    .line 1462
    move-object v0, v10

    .line 1463
    goto :goto_4a

    .line 1464
    :goto_4c
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v10

    .line 1468
    instance-of v11, v0, Lsf/f;

    .line 1469
    .line 1470
    if-eqz v11, :cond_5f

    .line 1471
    .line 1472
    move-object v0, v10

    .line 1473
    :cond_5f
    check-cast v0, Ljava/lang/Number;

    .line 1474
    .line 1475
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1476
    .line 1477
    .line 1478
    move-result v0

    .line 1479
    invoke-static {v0}, Ls8/c;->B(I)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v0

    .line 1483
    const-string v10, "revokemsg"

    .line 1484
    .line 1485
    if-nez v0, :cond_60

    .line 1486
    .line 1487
    invoke-static {v9, v3, v14}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1488
    .line 1489
    .line 1490
    move-result v0

    .line 1491
    if-nez v0, :cond_60

    .line 1492
    .line 1493
    const/4 v11, 0x1

    .line 1494
    invoke-static {v9, v10, v11}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1495
    .line 1496
    .line 1497
    move-result v0

    .line 1498
    if-nez v0, :cond_60

    .line 1499
    .line 1500
    goto/16 :goto_63

    .line 1501
    .line 1502
    :cond_60
    array-length v0, v2

    .line 1503
    const/4 v11, 0x0

    .line 1504
    const/4 v14, 0x0

    .line 1505
    :goto_4d
    if-lt v14, v0, :cond_61

    .line 1506
    .line 1507
    move-object/from16 v12, v20

    .line 1508
    .line 1509
    goto :goto_4f

    .line 1510
    :cond_61
    aget-object v12, v2, v14

    .line 1511
    .line 1512
    instance-of v13, v12, Landroid/content/ContentValues;

    .line 1513
    .line 1514
    if-eqz v13, :cond_62

    .line 1515
    .line 1516
    const/4 v1, 0x0

    .line 1517
    const/4 v11, 0x1

    .line 1518
    :goto_4e
    const/4 v12, 0x1

    .line 1519
    goto/16 :goto_62

    .line 1520
    .line 1521
    :cond_62
    if-eqz v11, :cond_8d

    .line 1522
    .line 1523
    instance-of v13, v12, Ljava/lang/String;

    .line 1524
    .line 1525
    if-eqz v13, :cond_8d

    .line 1526
    .line 1527
    check-cast v12, Ljava/lang/String;

    .line 1528
    .line 1529
    :goto_4f
    array-length v0, v2

    .line 1530
    const/4 v14, 0x0

    .line 1531
    :goto_50
    if-ge v14, v0, :cond_64

    .line 1532
    .line 1533
    aget-object v11, v2, v14

    .line 1534
    .line 1535
    instance-of v13, v11, [Ljava/lang/Object;

    .line 1536
    .line 1537
    if-eqz v13, :cond_63

    .line 1538
    .line 1539
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v13

    .line 1543
    invoke-virtual {v13}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v13

    .line 1547
    const-class v1, Ljava/lang/String;

    .line 1548
    .line 1549
    invoke-static {v13, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1550
    .line 1551
    .line 1552
    move-result v1

    .line 1553
    if-eqz v1, :cond_63

    .line 1554
    .line 1555
    goto :goto_51

    .line 1556
    :cond_63
    add-int/lit8 v14, v14, 0x1

    .line 1557
    .line 1558
    const/4 v1, 0x0

    .line 1559
    goto :goto_50

    .line 1560
    :cond_64
    const/4 v11, 0x0

    .line 1561
    :goto_51
    instance-of v0, v11, [Ljava/lang/String;

    .line 1562
    .line 1563
    if-eqz v0, :cond_65

    .line 1564
    .line 1565
    check-cast v11, [Ljava/lang/String;

    .line 1566
    .line 1567
    goto :goto_52

    .line 1568
    :cond_65
    const/4 v11, 0x0

    .line 1569
    :goto_52
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1570
    .line 1571
    .line 1572
    move-result v0

    .line 1573
    if-nez v0, :cond_67

    .line 1574
    .line 1575
    if-eqz v11, :cond_67

    .line 1576
    .line 1577
    array-length v0, v11

    .line 1578
    if-nez v0, :cond_66

    .line 1579
    .line 1580
    goto :goto_53

    .line 1581
    :cond_66
    const-string v0, "msgId"

    .line 1582
    .line 1583
    const/4 v1, 0x1

    .line 1584
    invoke-static {v12, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1585
    .line 1586
    .line 1587
    move-result v0

    .line 1588
    if-nez v0, :cond_68

    .line 1589
    .line 1590
    :cond_67
    :goto_53
    move-wide/from16 v0, v16

    .line 1591
    .line 1592
    goto :goto_57

    .line 1593
    :cond_68
    array-length v0, v11

    .line 1594
    const/4 v14, 0x0

    .line 1595
    :goto_54
    if-ge v14, v0, :cond_6b

    .line 1596
    .line 1597
    aget-object v1, v11, v14

    .line 1598
    .line 1599
    invoke-static {v1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v1

    .line 1603
    if-eqz v1, :cond_69

    .line 1604
    .line 1605
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 1606
    .line 1607
    .line 1608
    move-result-wide v12

    .line 1609
    cmp-long v2, v12, v16

    .line 1610
    .line 1611
    if-lez v2, :cond_69

    .line 1612
    .line 1613
    goto :goto_55

    .line 1614
    :cond_69
    const/4 v1, 0x0

    .line 1615
    :goto_55
    if-eqz v1, :cond_6a

    .line 1616
    .line 1617
    goto :goto_56

    .line 1618
    :cond_6a
    add-int/lit8 v14, v14, 0x1

    .line 1619
    .line 1620
    goto :goto_54

    .line 1621
    :cond_6b
    const/4 v1, 0x0

    .line 1622
    :goto_56
    if-eqz v1, :cond_67

    .line 1623
    .line 1624
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1625
    .line 1626
    .line 1627
    move-result-wide v0

    .line 1628
    :goto_57
    cmp-long v2, v0, v16

    .line 1629
    .line 1630
    if-gtz v2, :cond_6c

    .line 1631
    .line 1632
    goto/16 :goto_63

    .line 1633
    .line 1634
    :cond_6c
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v2

    .line 1638
    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v2

    .line 1642
    check-cast v2, Ljava/util/Map;

    .line 1643
    .line 1644
    if-eqz v2, :cond_6d

    .line 1645
    .line 1646
    goto :goto_59

    .line 1647
    :cond_6d
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v2

    .line 1651
    if-eqz v2, :cond_71

    .line 1652
    .line 1653
    invoke-static {v0, v1, v6}, Ls8/c;->L(JLjava/lang/String;)Ljava/util/Map;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v6

    .line 1657
    if-eqz v6, :cond_6e

    .line 1658
    .line 1659
    check-cast v6, Ljava/util/Map;

    .line 1660
    .line 1661
    goto :goto_58

    .line 1662
    :cond_6e
    invoke-virtual {v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTables()Ljava/util/List;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v2

    .line 1666
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v2

    .line 1670
    :cond_6f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1671
    .line 1672
    .line 1673
    move-result v6

    .line 1674
    if-eqz v6, :cond_70

    .line 1675
    .line 1676
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v6

    .line 1680
    check-cast v6, Ljava/lang/String;

    .line 1681
    .line 1682
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1683
    .line 1684
    .line 1685
    invoke-static {v0, v1, v6}, Ls8/c;->L(JLjava/lang/String;)Ljava/util/Map;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v6

    .line 1689
    if-eqz v6, :cond_6f

    .line 1690
    .line 1691
    check-cast v6, Ljava/util/Map;

    .line 1692
    .line 1693
    goto :goto_58

    .line 1694
    :cond_70
    const-string v2, "message"

    .line 1695
    .line 1696
    invoke-static {v0, v1, v2}, Ls8/c;->L(JLjava/lang/String;)Ljava/util/Map;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v6

    .line 1700
    goto :goto_58

    .line 1701
    :cond_71
    const/4 v6, 0x0

    .line 1702
    :goto_58
    if-eqz v6, :cond_72

    .line 1703
    .line 1704
    move-object v2, v6

    .line 1705
    check-cast v2, Ljava/util/Map;

    .line 1706
    .line 1707
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v6

    .line 1711
    invoke-virtual {v4, v6, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1712
    .line 1713
    .line 1714
    goto :goto_59

    .line 1715
    :cond_72
    const/4 v2, 0x0

    .line 1716
    :goto_59
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v4

    .line 1720
    if-eqz v4, :cond_73

    .line 1721
    .line 1722
    invoke-virtual {v4, v0, v1}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v4

    .line 1726
    goto :goto_5a

    .line 1727
    :cond_73
    const/4 v4, 0x0

    .line 1728
    :goto_5a
    iget-object v6, v15, Ls8/c;->g:Ljava/util/Set;

    .line 1729
    .line 1730
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v11

    .line 1734
    invoke-interface {v6, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1735
    .line 1736
    .line 1737
    move-result v6

    .line 1738
    if-nez v6, :cond_74

    .line 1739
    .line 1740
    if-eqz v4, :cond_8e

    .line 1741
    .line 1742
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend()Z

    .line 1743
    .line 1744
    .line 1745
    move-result v6

    .line 1746
    const/4 v11, 0x1

    .line 1747
    if-ne v6, v11, :cond_8e

    .line 1748
    .line 1749
    :cond_74
    invoke-virtual {v15, v0, v1}, Ls8/c;->F(J)V

    .line 1750
    .line 1751
    .line 1752
    if-nez v2, :cond_75

    .line 1753
    .line 1754
    goto/16 :goto_5c

    .line 1755
    .line 1756
    :cond_75
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v0

    .line 1760
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v0

    .line 1764
    :cond_76
    :goto_5b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1765
    .line 1766
    .line 1767
    move-result v1

    .line 1768
    if-eqz v1, :cond_80

    .line 1769
    .line 1770
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v1

    .line 1774
    check-cast v1, Ljava/util/Map$Entry;

    .line 1775
    .line 1776
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v2

    .line 1780
    check-cast v2, Ljava/lang/String;

    .line 1781
    .line 1782
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v1

    .line 1786
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1787
    .line 1788
    .line 1789
    move-result v6

    .line 1790
    if-nez v6, :cond_76

    .line 1791
    .line 1792
    sget-object v6, Ls8/c;->n:Ljava/util/Set;

    .line 1793
    .line 1794
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1795
    .line 1796
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1797
    .line 1798
    .line 1799
    invoke-virtual {v2, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v11

    .line 1803
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1804
    .line 1805
    .line 1806
    invoke-interface {v6, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1807
    .line 1808
    .line 1809
    move-result v6

    .line 1810
    if-eqz v6, :cond_77

    .line 1811
    .line 1812
    goto :goto_5b

    .line 1813
    :cond_77
    instance-of v6, v1, [B

    .line 1814
    .line 1815
    if-eqz v6, :cond_78

    .line 1816
    .line 1817
    check-cast v1, [B

    .line 1818
    .line 1819
    invoke-virtual {v8, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 1820
    .line 1821
    .line 1822
    goto :goto_5b

    .line 1823
    :cond_78
    instance-of v6, v1, Ljava/lang/String;

    .line 1824
    .line 1825
    if-eqz v6, :cond_79

    .line 1826
    .line 1827
    check-cast v1, Ljava/lang/String;

    .line 1828
    .line 1829
    invoke-virtual {v8, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1830
    .line 1831
    .line 1832
    goto :goto_5b

    .line 1833
    :cond_79
    instance-of v6, v1, Ljava/lang/Integer;

    .line 1834
    .line 1835
    if-eqz v6, :cond_7a

    .line 1836
    .line 1837
    check-cast v1, Ljava/lang/Integer;

    .line 1838
    .line 1839
    invoke-virtual {v8, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1840
    .line 1841
    .line 1842
    goto :goto_5b

    .line 1843
    :cond_7a
    instance-of v6, v1, Ljava/lang/Long;

    .line 1844
    .line 1845
    if-eqz v6, :cond_7b

    .line 1846
    .line 1847
    check-cast v1, Ljava/lang/Long;

    .line 1848
    .line 1849
    invoke-virtual {v8, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1850
    .line 1851
    .line 1852
    goto :goto_5b

    .line 1853
    :cond_7b
    instance-of v6, v1, Ljava/lang/Short;

    .line 1854
    .line 1855
    if-eqz v6, :cond_7c

    .line 1856
    .line 1857
    check-cast v1, Ljava/lang/Short;

    .line 1858
    .line 1859
    invoke-virtual {v8, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Short;)V

    .line 1860
    .line 1861
    .line 1862
    goto :goto_5b

    .line 1863
    :cond_7c
    instance-of v6, v1, Ljava/lang/Float;

    .line 1864
    .line 1865
    if-eqz v6, :cond_7d

    .line 1866
    .line 1867
    check-cast v1, Ljava/lang/Float;

    .line 1868
    .line 1869
    invoke-virtual {v8, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1870
    .line 1871
    .line 1872
    goto :goto_5b

    .line 1873
    :cond_7d
    instance-of v6, v1, Ljava/lang/Double;

    .line 1874
    .line 1875
    if-eqz v6, :cond_7e

    .line 1876
    .line 1877
    check-cast v1, Ljava/lang/Double;

    .line 1878
    .line 1879
    invoke-virtual {v8, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 1880
    .line 1881
    .line 1882
    goto :goto_5b

    .line 1883
    :cond_7e
    instance-of v6, v1, Ljava/lang/Boolean;

    .line 1884
    .line 1885
    if-eqz v6, :cond_7f

    .line 1886
    .line 1887
    check-cast v1, Ljava/lang/Boolean;

    .line 1888
    .line 1889
    invoke-virtual {v8, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 1890
    .line 1891
    .line 1892
    goto/16 :goto_5b

    .line 1893
    .line 1894
    :cond_7f
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v1

    .line 1898
    invoke-virtual {v8, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1899
    .line 1900
    .line 1901
    goto/16 :goto_5b

    .line 1902
    .line 1903
    :cond_80
    :goto_5c
    if-eqz v4, :cond_82

    .line 1904
    .line 1905
    iget v0, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 1906
    .line 1907
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v1

    .line 1911
    if-lez v0, :cond_81

    .line 1912
    .line 1913
    invoke-static {v0}, Ls8/c;->B(I)Z

    .line 1914
    .line 1915
    .line 1916
    move-result v0

    .line 1917
    if-nez v0, :cond_81

    .line 1918
    .line 1919
    goto :goto_5d

    .line 1920
    :cond_81
    const/4 v1, 0x0

    .line 1921
    :goto_5d
    if-eqz v1, :cond_82

    .line 1922
    .line 1923
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1924
    .line 1925
    .line 1926
    move-result v0

    .line 1927
    goto :goto_5e

    .line 1928
    :cond_82
    const/4 v0, 0x1

    .line 1929
    :goto_5e
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v0

    .line 1933
    invoke-virtual {v8, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1934
    .line 1935
    .line 1936
    if-eqz v4, :cond_83

    .line 1937
    .line 1938
    iget v0, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend:I

    .line 1939
    .line 1940
    goto :goto_5f

    .line 1941
    :cond_83
    const/4 v0, 0x1

    .line 1942
    :goto_5f
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v0

    .line 1946
    const-string v1, "isSend"

    .line 1947
    .line 1948
    invoke-virtual {v8, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1949
    .line 1950
    .line 1951
    if-eqz v4, :cond_84

    .line 1952
    .line 1953
    iget v0, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->status:I

    .line 1954
    .line 1955
    if-lez v0, :cond_84

    .line 1956
    .line 1957
    const-string v1, "status"

    .line 1958
    .line 1959
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v0

    .line 1963
    invoke-virtual {v8, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1964
    .line 1965
    .line 1966
    :cond_84
    if-eqz v4, :cond_89

    .line 1967
    .line 1968
    iget-object v0, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 1969
    .line 1970
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1971
    .line 1972
    .line 1973
    move-result v0

    .line 1974
    if-nez v0, :cond_85

    .line 1975
    .line 1976
    const-string v0, "imgPath"

    .line 1977
    .line 1978
    iget-object v1, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 1979
    .line 1980
    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1981
    .line 1982
    .line 1983
    :cond_85
    iget-object v0, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->reserved:Ljava/lang/String;

    .line 1984
    .line 1985
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1986
    .line 1987
    .line 1988
    move-result v0

    .line 1989
    if-nez v0, :cond_86

    .line 1990
    .line 1991
    const-string v0, "reserved"

    .line 1992
    .line 1993
    iget-object v1, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->reserved:Ljava/lang/String;

    .line 1994
    .line 1995
    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1996
    .line 1997
    .line 1998
    :cond_86
    iget-object v0, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->translatedContent:Ljava/lang/String;

    .line 1999
    .line 2000
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2001
    .line 2002
    .line 2003
    move-result v0

    .line 2004
    if-nez v0, :cond_87

    .line 2005
    .line 2006
    const-string v0, "transContent"

    .line 2007
    .line 2008
    iget-object v1, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->translatedContent:Ljava/lang/String;

    .line 2009
    .line 2010
    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2011
    .line 2012
    .line 2013
    :cond_87
    iget-object v0, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSource:Ljava/lang/String;

    .line 2014
    .line 2015
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2016
    .line 2017
    .line 2018
    move-result v0

    .line 2019
    if-nez v0, :cond_88

    .line 2020
    .line 2021
    const-string v0, "msgSource"

    .line 2022
    .line 2023
    iget-object v1, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSource:Ljava/lang/String;

    .line 2024
    .line 2025
    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2026
    .line 2027
    .line 2028
    :cond_88
    iget v0, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->flag:I

    .line 2029
    .line 2030
    if-eqz v0, :cond_89

    .line 2031
    .line 2032
    const-string v1, "flag"

    .line 2033
    .line 2034
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v0

    .line 2038
    invoke-virtual {v8, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2039
    .line 2040
    .line 2041
    :cond_89
    const/4 v1, 0x0

    .line 2042
    invoke-static {v9, v3, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2043
    .line 2044
    .line 2045
    move-result v0

    .line 2046
    if-nez v0, :cond_8a

    .line 2047
    .line 2048
    const/4 v12, 0x1

    .line 2049
    invoke-static {v9, v10, v12}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2050
    .line 2051
    .line 2052
    move-result v0

    .line 2053
    if-eqz v0, :cond_8e

    .line 2054
    .line 2055
    :cond_8a
    if-eqz v4, :cond_8b

    .line 2056
    .line 2057
    iget-object v9, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 2058
    .line 2059
    goto :goto_60

    .line 2060
    :cond_8b
    const/4 v9, 0x0

    .line 2061
    :goto_60
    if-nez v9, :cond_8c

    .line 2062
    .line 2063
    move-object/from16 v4, v20

    .line 2064
    .line 2065
    goto :goto_61

    .line 2066
    :cond_8c
    move-object v4, v9

    .line 2067
    :goto_61
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2068
    .line 2069
    .line 2070
    move-result v0

    .line 2071
    if-nez v0, :cond_8e

    .line 2072
    .line 2073
    invoke-virtual {v8, v7, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2074
    .line 2075
    .line 2076
    goto :goto_63

    .line 2077
    :cond_8d
    const/4 v1, 0x0

    .line 2078
    goto/16 :goto_4e

    .line 2079
    .line 2080
    :goto_62
    add-int/lit8 v14, v14, 0x1

    .line 2081
    .line 2082
    const/4 v1, 0x0

    .line 2083
    goto/16 :goto_4d

    .line 2084
    .line 2085
    :cond_8e
    :goto_63
    return-void

    .line 2086
    nop

    .line 2087
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    :array_0
    .array-data 2
        0x22s
        0x201cs
        0x201ds
    .end array-data
.end method
