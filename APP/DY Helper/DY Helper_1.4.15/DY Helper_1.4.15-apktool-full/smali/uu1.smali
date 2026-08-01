.class public final synthetic Luu1;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Luu1;->ε:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lo80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Luu1;->ε:I

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    const/16 v3, 0xe10

    .line 8
    .line 9
    const-string v4, "\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 10
    .line 11
    const/16 v5, 0x8

    .line 12
    .line 13
    sget-object v6, Ls62;->α:Ls62;

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    const/16 v8, 0xa

    .line 17
    .line 18
    const/16 v9, 0xb

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v11, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Class;

    .line 28
    .line 29
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lib2;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lib2;->ι(Ljava/lang/Class;)Lbb2;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v10, v11

    .line 44
    :goto_0
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :pswitch_0
    move-object/from16 v1, p1

    .line 50
    .line 51
    check-cast v1, Ljava/lang/Class;

    .line 52
    .line 53
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lib2;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lib2;->ι(Ljava/lang/Class;)Lbb2;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v10, v11

    .line 68
    :goto_1
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :pswitch_1
    move-object/from16 v1, p1

    .line 74
    .line 75
    check-cast v1, Ljava/lang/Class;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lc82;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    sget-object v0, Lc82;->ν:Ljava/util/List;

    .line 88
    .line 89
    new-instance v2, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_3

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Ljava/lang/String;

    .line 109
    .line 110
    sget-object v4, Lc82;->α:Lc82;

    .line 111
    .line 112
    invoke-static {v1, v3}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-eqz v3, :cond_2

    .line 117
    .line 118
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    :goto_3
    if-eqz v1, :cond_5

    .line 128
    .line 129
    const-class v3, Ljava/lang/Object;

    .line 130
    .line 131
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-nez v3, :cond_5

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-static {v3}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    new-instance v4, Lj72;

    .line 149
    .line 150
    invoke-direct {v4, v9}, Lj72;-><init>(I)V

    .line 151
    .line 152
    .line 153
    new-instance v5, Ly30;

    .line 154
    .line 155
    invoke-direct {v5, v3, v10, v4}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 156
    .line 157
    .line 158
    new-instance v3, Lx30;

    .line 159
    .line 160
    invoke-direct {v3, v5}, Lx30;-><init>(Ly30;)V

    .line 161
    .line 162
    .line 163
    :catchall_0
    :goto_4
    invoke-virtual {v3}, Lx30;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_4

    .line 168
    .line 169
    invoke-virtual {v3}, Lx30;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    check-cast v4, Ljava/lang/reflect/Field;

    .line 174
    .line 175
    :try_start_0
    invoke-virtual {v4, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    goto :goto_3

    .line 187
    :cond_5
    invoke-static {v2, v0}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    new-instance v1, Ljava/util/HashSet;

    .line 192
    .line 193
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 194
    .line 195
    .line 196
    new-instance v2, Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :cond_6
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-eqz v3, :cond_7

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    move-object v4, v3

    .line 216
    check-cast v4, Ljava/lang/reflect/Field;

    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-eqz v4, :cond_6

    .line 227
    .line 228
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_7
    new-instance v0, Lb82;

    .line 233
    .line 234
    invoke-direct {v0, v2}, Lb82;-><init>(Ljava/util/ArrayList;)V

    .line 235
    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_2
    move-object/from16 v1, p1

    .line 239
    .line 240
    check-cast v1, Ljava/lang/Class;

    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v0, Lc82;

    .line 248
    .line 249
    new-instance v2, La82;

    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    const-string v0, "desc"

    .line 255
    .line 256
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    const-string v0, "title"

    .line 261
    .line 262
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    const-string v0, "simpleDesc"

    .line 267
    .line 268
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    const-string v0, "authorUserId"

    .line 273
    .line 274
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    const-string v0, "author"

    .line 279
    .line 280
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    const-string v0, "awemeType"

    .line 285
    .line 286
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    const-string v0, "isAd"

    .line 291
    .line 292
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    const-string v0, "isAigcMedia"

    .line 297
    .line 298
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    const-string v0, "aigcInfo"

    .line 303
    .line 304
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 305
    .line 306
    .line 307
    move-result-object v11

    .line 308
    const-string v0, "textVideoLabels"

    .line 309
    .line 310
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    const-string v0, "textTopLabels"

    .line 315
    .line 316
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 317
    .line 318
    .line 319
    move-result-object v13

    .line 320
    const-string v0, "hybridLabels"

    .line 321
    .line 322
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 323
    .line 324
    .line 325
    move-result-object v14

    .line 326
    const-string v0, "commonLeftTopLabels"

    .line 327
    .line 328
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 329
    .line 330
    .line 331
    move-result-object v15

    .line 332
    const-string v0, "liveRoom"

    .line 333
    .line 334
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 335
    .line 336
    .line 337
    move-result-object v16

    .line 338
    const-string v0, "newLiveRoomData"

    .line 339
    .line 340
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 341
    .line 342
    .line 343
    move-result-object v17

    .line 344
    const-string v0, "liveRoomStruct"

    .line 345
    .line 346
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 347
    .line 348
    .line 349
    move-result-object v18

    .line 350
    const-string v0, "mRoomFeedCellStruct"

    .line 351
    .line 352
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 353
    .line 354
    .line 355
    move-result-object v19

    .line 356
    const-string v0, "liveId"

    .line 357
    .line 358
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 359
    .line 360
    .line 361
    move-result-object v20

    .line 362
    const-string v0, "isDetailLive"

    .line 363
    .line 364
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 365
    .line 366
    .line 367
    move-result-object v21

    .line 368
    const-string v0, "liveFeedbackCard"

    .line 369
    .line 370
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 371
    .line 372
    .line 373
    move-result-object v22

    .line 374
    const-string v0, "isLiveReplay"

    .line 375
    .line 376
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 377
    .line 378
    .line 379
    move-result-object v23

    .line 380
    const-string v0, "isEcomLive"

    .line 381
    .line 382
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 383
    .line 384
    .line 385
    move-result-object v24

    .line 386
    const-string v0, "awemeRawAd"

    .line 387
    .line 388
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 389
    .line 390
    .line 391
    move-result-object v25

    .line 392
    const-string v0, "adAwemeSource"

    .line 393
    .line 394
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 395
    .line 396
    .line 397
    move-result-object v26

    .line 398
    const-string v0, "feedAdPlayletExtraInfo"

    .line 399
    .line 400
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 401
    .line 402
    .line 403
    move-result-object v27

    .line 404
    const-string v0, "feedAdForcePlayletExtraInfo"

    .line 405
    .line 406
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 407
    .line 408
    .line 409
    move-result-object v28

    .line 410
    const-string v0, "insertionAdConfig"

    .line 411
    .line 412
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 413
    .line 414
    .line 415
    move-result-object v29

    .line 416
    const-string v0, "asyncAdInfo"

    .line 417
    .line 418
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 419
    .line 420
    .line 421
    move-result-object v30

    .line 422
    const-string v0, "packUsageSceneByReqPath"

    .line 423
    .line 424
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 425
    .line 426
    .line 427
    move-result-object v31

    .line 428
    const-string v0, "images"

    .line 429
    .line 430
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 431
    .line 432
    .line 433
    move-result-object v32

    .line 434
    const-string v0, "isTextMode"

    .line 435
    .line 436
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 437
    .line 438
    .line 439
    move-result-object v33

    .line 440
    const-string v0, "isNewTextMode"

    .line 441
    .line 442
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 443
    .line 444
    .line 445
    move-result-object v34

    .line 446
    const-string v0, "video"

    .line 447
    .line 448
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 449
    .line 450
    .line 451
    move-result-object v35

    .line 452
    const-string v0, "statistics"

    .line 453
    .line 454
    invoke-static {v1, v0}, Lc82;->ε(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 455
    .line 456
    .line 457
    move-result-object v36

    .line 458
    const-string v0, "isLive"

    .line 459
    .line 460
    invoke-static {v1, v0}, Lc82;->ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 461
    .line 462
    .line 463
    move-result-object v37

    .line 464
    const-string v0, "getLiveRoom"

    .line 465
    .line 466
    invoke-static {v1, v0}, Lc82;->ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 467
    .line 468
    .line 469
    move-result-object v38

    .line 470
    const-string v0, "getAd"

    .line 471
    .line 472
    invoke-static {v1, v0}, Lc82;->ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 473
    .line 474
    .line 475
    move-result-object v39

    .line 476
    const-string v0, "getAdId"

    .line 477
    .line 478
    invoke-static {v1, v0}, Lc82;->ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 479
    .line 480
    .line 481
    move-result-object v40

    .line 482
    invoke-direct/range {v2 .. v40}, La82;-><init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 483
    .line 484
    .line 485
    return-object v2

    .line 486
    :pswitch_3
    move-object/from16 v1, p1

    .line 487
    .line 488
    check-cast v1, Ljava/util/Set;

    .line 489
    .line 490
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, Lvv1;

    .line 496
    .line 497
    invoke-virtual {v0, v1}, Lvv1;->α(Ljava/util/Set;)V

    .line 498
    .line 499
    .line 500
    return-object v6

    .line 501
    :pswitch_4
    move-object/from16 v1, p1

    .line 502
    .line 503
    check-cast v1, Ljava/lang/Class;

    .line 504
    .line 505
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v0, Llv1;

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    sget-object v2, Llv1;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 516
    .line 517
    invoke-static {v1}, Lxb;->Ψ(Ljava/lang/Class;)Lce0;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    if-nez v0, :cond_8

    .line 522
    .line 523
    goto :goto_7

    .line 524
    :cond_8
    iget-object v1, v0, Lce0;->β:Ljava/lang/reflect/Method;

    .line 525
    .line 526
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    if-nez v3, :cond_9

    .line 531
    .line 532
    goto :goto_7

    .line 533
    :cond_9
    :try_start_1
    sget-object v3, Lxq0;->α:Lxq0;

    .line 534
    .line 535
    new-instance v4, Lnh;

    .line 536
    .line 537
    invoke-direct {v4, v5, v0}, Lnh;-><init>(ILjava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v3, v1, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 541
    .line 542
    .line 543
    move-object v3, v6

    .line 544
    goto :goto_6

    .line 545
    :catchall_1
    move-exception v0

    .line 546
    new-instance v3, Leo1;

    .line 547
    .line 548
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 549
    .line 550
    .line 551
    :goto_6
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    if-nez v0, :cond_a

    .line 556
    .line 557
    :goto_7
    return-object v6

    .line 558
    :cond_a
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    throw v0

    .line 562
    :pswitch_5
    move-object/from16 v12, p1

    .line 563
    .line 564
    check-cast v12, Landroid/app/Activity;

    .line 565
    .line 566
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, Lbv1;

    .line 572
    .line 573
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    invoke-static {v12}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    const-string v1, "im_auto_read_enabled"

    .line 581
    .line 582
    invoke-static {v1, v11}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    new-instance v2, Loq1;

    .line 587
    .line 588
    const/16 v3, 0x10

    .line 589
    .line 590
    invoke-direct {v2, v3}, Loq1;-><init>(I)V

    .line 591
    .line 592
    .line 593
    const-string v3, "\u542f\u7528\u5b9a\u65f6\u5df2\u8bfb"

    .line 594
    .line 595
    const-string v4, "\u6309\u8bbe\u5b9a\u95f4\u9694\u81ea\u52a8\u5c06\u79c1\u4fe1\u6807\u8bb0\u4e3a\u5df2\u8bfb"

    .line 596
    .line 597
    invoke-static {v12, v3, v4, v1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 602
    .line 603
    .line 604
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 609
    .line 610
    .line 611
    const-string v1, "im_auto_read_interval_minutes"

    .line 612
    .line 613
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    invoke-interface {v2, v1, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 618
    .line 619
    .line 620
    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 621
    :catchall_2
    const/16 v1, 0xb4

    .line 622
    .line 623
    invoke-static {v8, v10, v1}, Lj81;->μ(III)I

    .line 624
    .line 625
    .line 626
    move-result v14

    .line 627
    new-instance v1, Ldt1;

    .line 628
    .line 629
    invoke-direct {v1, v9}, Ldt1;-><init>(I)V

    .line 630
    .line 631
    .line 632
    const-string v13, "\u6267\u884c\u95f4\u9694"

    .line 633
    .line 634
    const/16 v15, 0xb4

    .line 635
    .line 636
    const/16 v16, 0x1

    .line 637
    .line 638
    const-string v17, "\u5206\u949f"

    .line 639
    .line 640
    const-string v18, "\u6bcf\u9694\u591a\u5c11\u5206\u949f\u81ea\u52a8\u6267\u884c\u4e00\u6b21\u5df2\u8bfb"

    .line 641
    .line 642
    move-object/from16 v19, v1

    .line 643
    .line 644
    invoke-static/range {v12 .. v19}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 649
    .line 650
    .line 651
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 656
    .line 657
    .line 658
    const-string v1, "im_auto_read_include_interactive"

    .line 659
    .line 660
    invoke-static {v1, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    new-instance v2, Loq1;

    .line 665
    .line 666
    const/16 v3, 0x11

    .line 667
    .line 668
    invoke-direct {v2, v3}, Loq1;-><init>(I)V

    .line 669
    .line 670
    .line 671
    const-string v3, "\u540c\u65f6\u5df2\u8bfb\u4e92\u52a8\u6d88\u606f"

    .line 672
    .line 673
    const-string v4, "\u5b9a\u65f6\u5df2\u8bfb\u65f6\u540c\u6b65\u6e05\u9664\u70b9\u8d5e\u3001\u8bc4\u8bba\u3001\u5173\u6ce8\u7b49\u4e92\u52a8\u6d88\u606f\u89d2\u6807"

    .line 674
    .line 675
    invoke-static {v12, v3, v4, v1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 680
    .line 681
    .line 682
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 687
    .line 688
    .line 689
    const-string v1, "im_auto_read_filter_mode"

    .line 690
    .line 691
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    invoke-interface {v2, v1, v11}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 696
    .line 697
    .line 698
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 699
    goto :goto_8

    .line 700
    :catchall_3
    move v1, v11

    .line 701
    :goto_8
    sget-object v2, Lkn0;->β:[Ljava/lang/String;

    .line 702
    .line 703
    invoke-static {v1, v11, v7}, Lj81;->μ(III)I

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    aget-object v1, v2, v1

    .line 708
    .line 709
    new-instance v2, Lg71;

    .line 710
    .line 711
    const/16 v3, 0x1c

    .line 712
    .line 713
    invoke-direct {v2, v12, v3}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 714
    .line 715
    .line 716
    const-string v3, "\u5df2\u8bfb\u6a21\u5f0f"

    .line 717
    .line 718
    const-string v4, "\u5168\u90e8\uff1a\u6240\u6709\u4f1a\u8bdd\uff1b\u767d\u540d\u5355\uff1a\u53ea\u5904\u7406\u89c4\u5219\u5185\uff1b\u9ed1\u540d\u5355\uff1a\u6392\u9664\u89c4\u5219\u5185"

    .line 719
    .line 720
    invoke-static {v12, v3, v1, v4, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 725
    .line 726
    .line 727
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 732
    .line 733
    .line 734
    const-string v1, "im_auto_read_filter_rules"

    .line 735
    .line 736
    const-string v2, ""

    .line 737
    .line 738
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    invoke-static {v1}, Lbv1;->μ(Ljava/lang/String;)Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    new-instance v2, Lg71;

    .line 747
    .line 748
    const/16 v3, 0x1d

    .line 749
    .line 750
    invoke-direct {v2, v12, v3}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 751
    .line 752
    .line 753
    const-string v3, "\u767d/\u9ed1\u540d\u5355\u89c4\u5219"

    .line 754
    .line 755
    const-string v4, "\u6bcf\u884c\u4e00\u4e2a conversationId\u3001UID\u3001\u7fa4\u540d\u6216\u6635\u79f0\u5173\u952e\u8bcd"

    .line 756
    .line 757
    invoke-static {v12, v3, v1, v4, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 762
    .line 763
    .line 764
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 765
    .line 766
    .line 767
    move-result-object v1

    .line 768
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 769
    .line 770
    .line 771
    const-string v1, "\u5982\u679c\u5f00\u542f\u201c\u5173\u95ed\u5df2\u8bfb\u72b6\u6001\u4e0a\u62a5\u201d\uff0c\u5b9a\u65f6\u5df2\u8bfb\u53ea\u4f1a\u6e05\u672c\u5730\u672a\u8bfb\uff0c\u5bf9\u65b9\u901a\u5e38\u770b\u4e0d\u5230\u5df2\u8bfb"

    .line 772
    .line 773
    invoke-static {v12, v1}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 778
    .line 779
    .line 780
    return-object v0

    .line 781
    :pswitch_6
    move-object/from16 v1, p1

    .line 782
    .line 783
    check-cast v1, Landroid/app/Activity;

    .line 784
    .line 785
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast v0, Lbv1;

    .line 791
    .line 792
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    invoke-static {}, Lx9;->γ()Z

    .line 796
    .line 797
    .line 798
    move-result v0

    .line 799
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 800
    .line 801
    .line 802
    move-result-object v12

    .line 803
    if-eqz v0, :cond_b

    .line 804
    .line 805
    const-string v5, "\u672c\u8fdb\u7a0b\u9996\u6b21\u8fdb\u5165\u6296\u97f3\u5e76\u7b49\u5f85\u6d88\u606f\u670d\u52a1\u5c31\u7eea\u540e\u6267\u884c\u4e00\u6b21"

    .line 806
    .line 807
    goto :goto_9

    .line 808
    :cond_b
    move-object v5, v4

    .line 809
    :goto_9
    if-eqz v0, :cond_c

    .line 810
    .line 811
    const-string v6, "group_apply_auto_approval_cold_start_enabled"

    .line 812
    .line 813
    invoke-static {v6, v11}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 814
    .line 815
    .line 816
    move-result v6

    .line 817
    if-eqz v6, :cond_c

    .line 818
    .line 819
    move v6, v10

    .line 820
    goto :goto_a

    .line 821
    :cond_c
    move v6, v11

    .line 822
    :goto_a
    new-instance v7, Lit1;

    .line 823
    .line 824
    invoke-direct {v7, v1, v11}, Lit1;-><init>(Landroid/app/Activity;I)V

    .line 825
    .line 826
    .line 827
    const-string v9, "\u51b7\u542f\u52a8\u81ea\u52a8\u5ba1\u6279"

    .line 828
    .line 829
    invoke-static {v1, v9, v5, v6, v7}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 830
    .line 831
    .line 832
    move-result-object v5

    .line 833
    invoke-static {v12, v5, v1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 834
    .line 835
    .line 836
    if-eqz v0, :cond_d

    .line 837
    .line 838
    const-string v4, "\u6309\u8bbe\u5b9a\u95f4\u9694\u91cd\u590d\u67e5\u8be2\u5e76\u901a\u8fc7\u5168\u90e8\u5f85\u5ba1\u6838\u5165\u7fa4\u7533\u8bf7"

    .line 839
    .line 840
    :cond_d
    if-eqz v0, :cond_e

    .line 841
    .line 842
    const-string v5, "group_apply_auto_approval_polling_enabled"

    .line 843
    .line 844
    invoke-static {v5, v11}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 845
    .line 846
    .line 847
    move-result v5

    .line 848
    if-eqz v5, :cond_e

    .line 849
    .line 850
    move v11, v10

    .line 851
    :cond_e
    new-instance v5, Lit1;

    .line 852
    .line 853
    invoke-direct {v5, v1, v10}, Lit1;-><init>(Landroid/app/Activity;I)V

    .line 854
    .line 855
    .line 856
    const-string v6, "\u8f6e\u8be2\u81ea\u52a8\u5ba1\u6279"

    .line 857
    .line 858
    invoke-static {v1, v6, v4, v11, v5}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 859
    .line 860
    .line 861
    move-result-object v4

    .line 862
    invoke-static {v12, v4, v1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 863
    .line 864
    .line 865
    const-string v4, "group_apply_auto_approval_interval_seconds"

    .line 866
    .line 867
    const/16 v5, 0x3c

    .line 868
    .line 869
    :try_start_4
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 870
    .line 871
    .line 872
    move-result-object v6

    .line 873
    invoke-interface {v6, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 874
    .line 875
    .line 876
    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 877
    :catchall_4
    invoke-static {v5, v8, v3}, Lj81;->μ(III)I

    .line 878
    .line 879
    .line 880
    move-result v4

    .line 881
    new-instance v9, Ldt1;

    .line 882
    .line 883
    invoke-direct {v9, v2}, Ldt1;-><init>(I)V

    .line 884
    .line 885
    .line 886
    const-string v3, "\u8f6e\u8be2\u95f4\u9694"

    .line 887
    .line 888
    const/16 v5, 0xe10

    .line 889
    .line 890
    const/16 v6, 0xa

    .line 891
    .line 892
    const-string v7, "\u79d2"

    .line 893
    .line 894
    const-string v8, "\u6bcf\u8f6e\u5b8c\u6574\u7ed3\u675f\u540e\u91cd\u65b0\u8ba1\u65f6\uff1b\u51b7\u542f\u52a8\u5ba1\u6279\u4e0d\u53d7\u6b64\u95f4\u9694\u9650\u5236"

    .line 895
    .line 896
    move-object v2, v1

    .line 897
    invoke-static/range {v2 .. v9}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 898
    .line 899
    .line 900
    move-result-object v1

    .line 901
    invoke-virtual {v12, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 902
    .line 903
    .line 904
    invoke-static {v12, v0}, Lbv1;->ζ(Landroid/view/View;Z)V

    .line 905
    .line 906
    .line 907
    return-object v12

    .line 908
    :pswitch_7
    move-object/from16 v1, p1

    .line 909
    .line 910
    check-cast v1, Landroid/app/Activity;

    .line 911
    .line 912
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v0, Lbv1;

    .line 918
    .line 919
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    sget-object v2, Lzs1;->σ:Ljava/util/List;

    .line 927
    .line 928
    invoke-static {v0, v1, v2, v11}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 929
    .line 930
    .line 931
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 936
    .line 937
    .line 938
    const-string v2, "\u5f00\u542f\u5df2\u8bfb\u4e0a\u62a5\u5173\u95ed\u540e\uff0c\u670d\u52a1\u7aef\u53ef\u80fd\u4ecd\u8ba4\u4e3a\u6d88\u606f\u672a\u8bfb\uff0c\u591a\u7aef\u540c\u6b65\u65f6\u672a\u8bfb\u6570\u53ef\u80fd\u6062\u590d"

    .line 939
    .line 940
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 945
    .line 946
    .line 947
    return-object v0

    .line 948
    :pswitch_8
    move-object/from16 v12, p1

    .line 949
    .line 950
    check-cast v12, Landroid/app/Activity;

    .line 951
    .line 952
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 956
    .line 957
    check-cast v0, Lbv1;

    .line 958
    .line 959
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 960
    .line 961
    .line 962
    invoke-static {v12}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    sget-object v1, Lzs1;->γ:Ljava/util/List;

    .line 967
    .line 968
    invoke-static {v0, v12, v1, v11}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 969
    .line 970
    .line 971
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 972
    .line 973
    .line 974
    move-result-object v1

    .line 975
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 976
    .line 977
    .line 978
    const-string v1, "filter_keywords"

    .line 979
    .line 980
    const-string v2, "[]"

    .line 981
    .line 982
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    invoke-static {v1}, Lbv1;->ξ(Ljava/lang/String;)Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v4

    .line 990
    new-instance v6, Lfj1;

    .line 991
    .line 992
    invoke-direct {v6, v12, v1, v10}, Lfj1;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 993
    .line 994
    .line 995
    const-string v1, "\u5173\u952e\u8bcd\u9ed1\u540d\u5355"

    .line 996
    .line 997
    const-string v9, "\u5305\u542b\u8fd9\u4e9b\u8bcd\u7684\u89c6\u9891\u5c06\u88ab\u8fc7\u6ee4"

    .line 998
    .line 999
    invoke-static {v12, v1, v4, v9, v6}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v1

    .line 1003
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1004
    .line 1005
    .line 1006
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v1

    .line 1010
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1011
    .line 1012
    .line 1013
    const-string v1, "filter_user_ids"

    .line 1014
    .line 1015
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    invoke-static {v1}, Lbv1;->ξ(Ljava/lang/String;)Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    new-instance v4, Lfj1;

    .line 1024
    .line 1025
    invoke-direct {v4, v12, v1, v7}, Lfj1;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 1026
    .line 1027
    .line 1028
    const-string v1, "\u7528\u6237 UID \u9ed1\u540d\u5355"

    .line 1029
    .line 1030
    const-string v6, "\u8fd9\u4e9b\u7528\u6237\u7684\u89c6\u9891\u5c06\u88ab\u8fc7\u6ee4"

    .line 1031
    .line 1032
    invoke-static {v12, v1, v2, v6, v4}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    invoke-static {v0, v1, v12}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 1037
    .line 1038
    .line 1039
    const-string v1, "filter_min_duration_sec"

    .line 1040
    .line 1041
    :try_start_5
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v2

    .line 1045
    invoke-interface {v2, v1, v11}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1046
    .line 1047
    .line 1048
    move-result v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1049
    goto :goto_b

    .line 1050
    :catchall_5
    move v1, v11

    .line 1051
    :goto_b
    invoke-static {v1, v11, v3}, Lj81;->μ(III)I

    .line 1052
    .line 1053
    .line 1054
    move-result v14

    .line 1055
    new-instance v1, Ldt1;

    .line 1056
    .line 1057
    invoke-direct {v1, v5}, Ldt1;-><init>(I)V

    .line 1058
    .line 1059
    .line 1060
    const-string v13, "\u6700\u77ed\u65f6\u957f"

    .line 1061
    .line 1062
    const/16 v15, 0x258

    .line 1063
    .line 1064
    const/16 v16, 0x0

    .line 1065
    .line 1066
    const-string v17, "\u79d2"

    .line 1067
    .line 1068
    const-string v18, "\u8fc7\u6ee4\u65f6\u957f\u4f4e\u4e8e\u6b64\u503c\u7684\u89c6\u9891\uff080 = \u4e0d\u9650\u5236\uff09"

    .line 1069
    .line 1070
    move-object/from16 v19, v1

    .line 1071
    .line 1072
    invoke-static/range {v12 .. v19}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v1

    .line 1076
    invoke-static {v0, v1, v12}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 1077
    .line 1078
    .line 1079
    const-string v1, "filter_max_duration_sec"

    .line 1080
    .line 1081
    :try_start_6
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v2

    .line 1085
    invoke-interface {v2, v1, v11}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1086
    .line 1087
    .line 1088
    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1089
    goto :goto_c

    .line 1090
    :catchall_6
    move v1, v11

    .line 1091
    :goto_c
    const/16 v2, 0x1c20

    .line 1092
    .line 1093
    invoke-static {v1, v11, v2}, Lj81;->μ(III)I

    .line 1094
    .line 1095
    .line 1096
    move-result v14

    .line 1097
    new-instance v1, Ldt1;

    .line 1098
    .line 1099
    const/16 v2, 0x9

    .line 1100
    .line 1101
    invoke-direct {v1, v2}, Ldt1;-><init>(I)V

    .line 1102
    .line 1103
    .line 1104
    const-string v13, "\u6700\u957f\u65f6\u957f"

    .line 1105
    .line 1106
    const/16 v15, 0x1c20

    .line 1107
    .line 1108
    const/16 v16, 0x0

    .line 1109
    .line 1110
    const-string v17, "\u79d2"

    .line 1111
    .line 1112
    const-string v18, "\u8fc7\u6ee4\u65f6\u957f\u8d85\u8fc7\u6b64\u503c\u7684\u89c6\u9891\uff080 = \u4e0d\u9650\u5236\uff09"

    .line 1113
    .line 1114
    move-object/from16 v19, v1

    .line 1115
    .line 1116
    invoke-static/range {v12 .. v19}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v1

    .line 1120
    invoke-static {v0, v1, v12}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 1121
    .line 1122
    .line 1123
    const-string v1, "filter_min_digg"

    .line 1124
    .line 1125
    :try_start_7
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    invoke-interface {v2, v1, v11}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1130
    .line 1131
    .line 1132
    move-result v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 1133
    goto :goto_d

    .line 1134
    :catchall_7
    move v1, v11

    .line 1135
    :goto_d
    const v2, 0x186a0

    .line 1136
    .line 1137
    .line 1138
    invoke-static {v1, v11, v2}, Lj81;->μ(III)I

    .line 1139
    .line 1140
    .line 1141
    move-result v4

    .line 1142
    new-instance v9, Ldt1;

    .line 1143
    .line 1144
    invoke-direct {v9, v8}, Ldt1;-><init>(I)V

    .line 1145
    .line 1146
    .line 1147
    const-string v3, "\u6700\u4f4e\u70b9\u8d5e\u6570"

    .line 1148
    .line 1149
    const v5, 0xc350

    .line 1150
    .line 1151
    .line 1152
    const/4 v6, 0x0

    .line 1153
    const-string v7, ""

    .line 1154
    .line 1155
    const-string v8, "\u8fc7\u6ee4\u70b9\u8d5e\u6570\u4f4e\u4e8e\u6b64\u503c\u7684\u89c6\u9891\uff080 = \u4e0d\u9650\u5236\uff09"

    .line 1156
    .line 1157
    move-object v2, v12

    .line 1158
    invoke-static/range {v2 .. v9}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v1

    .line 1162
    invoke-static {v0, v1, v12}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 1163
    .line 1164
    .line 1165
    sget-object v1, Lc82;->μ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1166
    .line 1167
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1168
    .line 1169
    .line 1170
    move-result v1

    .line 1171
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1172
    .line 1173
    const-string v3, "\u672c\u6b21\u4f1a\u8bdd\u5df2\u8fc7\u6ee4 "

    .line 1174
    .line 1175
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1179
    .line 1180
    .line 1181
    const-string v1, " \u6761\u5185\u5bb9"

    .line 1182
    .line 1183
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v1

    .line 1190
    invoke-static {v12, v1}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v1

    .line 1194
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1195
    .line 1196
    .line 1197
    return-object v0

    .line 1198
    :pswitch_9
    move-object/from16 v1, p1

    .line 1199
    .line 1200
    check-cast v1, Landroid/app/Activity;

    .line 1201
    .line 1202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1203
    .line 1204
    .line 1205
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1206
    .line 1207
    check-cast v0, Lbv1;

    .line 1208
    .line 1209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1210
    .line 1211
    .line 1212
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    sget-object v3, Lzs1;->ρ:Ljava/util/List;

    .line 1217
    .line 1218
    invoke-static {v0, v1, v3, v11}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 1219
    .line 1220
    .line 1221
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v3

    .line 1225
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1226
    .line 1227
    .line 1228
    const-string v3, "im_time_label_format"

    .line 1229
    .line 1230
    const-string v4, "yyyy-MM-dd HH:mm:ss"

    .line 1231
    .line 1232
    invoke-static {v3, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v3

    .line 1236
    const-string v4, "im_time_label_text"

    .line 1237
    .line 1238
    const-string v5, "{time}"

    .line 1239
    .line 1240
    invoke-static {v4, v5}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v4

    .line 1244
    invoke-static {v4, v3}, Lbv1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v3

    .line 1248
    new-instance v4, Lg71;

    .line 1249
    .line 1250
    invoke-direct {v4, v1, v9}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 1251
    .line 1252
    .line 1253
    const-string v5, "\u663e\u793a\u6587\u5b57"

    .line 1254
    .line 1255
    const-string v6, "\u81ea\u5b9a\u4e49\u6587\u5b57\u3001\u6362\u884c\u548c\u65f6\u95f4\u683c\u5f0f\uff0c\u5e76\u5b9e\u65f6\u9884\u89c8\u6c14\u6ce1\u4e0b\u65b9\u6548\u679c"

    .line 1256
    .line 1257
    invoke-static {v1, v5, v3, v6, v4}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v3

    .line 1261
    invoke-static {v0, v3, v1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 1262
    .line 1263
    .line 1264
    sget-object v3, Lhk0;->α:Lym1;

    .line 1265
    .line 1266
    const-string v3, "im_time_label_light_color"

    .line 1267
    .line 1268
    const-string v4, "#000000"

    .line 1269
    .line 1270
    invoke-static {v3, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v3

    .line 1274
    invoke-static {v3, v4}, Lhk0;->γ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v3

    .line 1278
    new-instance v4, Lg71;

    .line 1279
    .line 1280
    const/16 v5, 0xc

    .line 1281
    .line 1282
    invoke-direct {v4, v1, v5}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 1283
    .line 1284
    .line 1285
    const-string v5, "\u6d45\u8272\u6a21\u5f0f\u989c\u8272"

    .line 1286
    .line 1287
    const-string v6, "\u6d45\u8272\u6a21\u5f0f\u4e0b\u7684\u6807\u7b7e\u6587\u5b57\u989c\u8272\uff0c\u9ed8\u8ba4\u9ed1\u8272"

    .line 1288
    .line 1289
    invoke-static {v1, v5, v3, v6, v4}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v3

    .line 1293
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1294
    .line 1295
    .line 1296
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v3

    .line 1300
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1301
    .line 1302
    .line 1303
    const-string v3, "im_time_label_dark_color"

    .line 1304
    .line 1305
    const-string v4, "#FFFFFF"

    .line 1306
    .line 1307
    invoke-static {v3, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v3

    .line 1311
    invoke-static {v3, v4}, Lhk0;->γ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v3

    .line 1315
    new-instance v4, Lg71;

    .line 1316
    .line 1317
    invoke-direct {v4, v1, v2}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 1318
    .line 1319
    .line 1320
    const-string v2, "\u6df1\u8272\u6a21\u5f0f\u989c\u8272"

    .line 1321
    .line 1322
    const-string v5, "\u6df1\u8272\u6a21\u5f0f\u4e0b\u7684\u6807\u7b7e\u6587\u5b57\u989c\u8272\uff0c\u9ed8\u8ba4\u767d\u8272"

    .line 1323
    .line 1324
    invoke-static {v1, v2, v3, v5, v4}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v2

    .line 1328
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1329
    .line 1330
    .line 1331
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v2

    .line 1335
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1336
    .line 1337
    .line 1338
    const-string v2, "\u652f\u6301 {time} \u5360\u4f4d\u7b26\u548c\u6700\u591a 4 \u884c\u6587\u5b57\uff1b\u70b9\u51fb\u540e\u53ef\u9009\u62e9\u5e38\u7528\u65f6\u95f4\u683c\u5f0f"

    .line 1339
    .line 1340
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v1

    .line 1344
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1345
    .line 1346
    .line 1347
    return-object v0

    .line 1348
    :pswitch_a
    move-object/from16 v1, p1

    .line 1349
    .line 1350
    check-cast v1, Landroid/app/Activity;

    .line 1351
    .line 1352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1353
    .line 1354
    .line 1355
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1356
    .line 1357
    check-cast v0, Lbv1;

    .line 1358
    .line 1359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1360
    .line 1361
    .line 1362
    const/4 v0, 0x0

    .line 1363
    sget-object v2, Lzs1;->π:Lys1;

    .line 1364
    .line 1365
    invoke-static {v1, v2, v0}, Lbv1;->σ(Landroid/content/Context;Lys1;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v0

    .line 1369
    return-object v0

    .line 1370
    :pswitch_b
    move-object/from16 v1, p1

    .line 1371
    .line 1372
    check-cast v1, Landroid/app/Activity;

    .line 1373
    .line 1374
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1375
    .line 1376
    .line 1377
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1378
    .line 1379
    check-cast v0, Lbv1;

    .line 1380
    .line 1381
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1382
    .line 1383
    .line 1384
    invoke-static {}, Lx9;->β()Z

    .line 1385
    .line 1386
    .line 1387
    move-result v0

    .line 1388
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v2

    .line 1392
    new-instance v3, Lqm1;

    .line 1393
    .line 1394
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1395
    .line 1396
    .line 1397
    if-eqz v0, :cond_f

    .line 1398
    .line 1399
    const-string v4, "\u5f00\u542f\u540e\u5728\u6296\u97f3\u6d88\u606f\u9875\u6807\u9898\u680f\u663e\u793a\u6279\u91cf\u5220\u9664\u6309\u94ae"

    .line 1400
    .line 1401
    :cond_f
    if-eqz v0, :cond_10

    .line 1402
    .line 1403
    const-string v5, "im_conversation_delete_entry_enabled"

    .line 1404
    .line 1405
    invoke-static {v5, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1406
    .line 1407
    .line 1408
    move-result v5

    .line 1409
    if-eqz v5, :cond_10

    .line 1410
    .line 1411
    goto :goto_e

    .line 1412
    :cond_10
    move v10, v11

    .line 1413
    :goto_e
    new-instance v5, Lkt1;

    .line 1414
    .line 1415
    invoke-direct {v5, v3, v1, v7}, Lkt1;-><init>(Lqm1;Landroid/app/Activity;I)V

    .line 1416
    .line 1417
    .line 1418
    const-string v3, "\u6d88\u606f\u9875\u9876\u90e8\u6ce8\u5165\u4f1a\u8bdd\u6279\u91cf\u5220\u9664\u5165\u53e3"

    .line 1419
    .line 1420
    invoke-static {v1, v3, v4, v10, v5}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v3

    .line 1424
    invoke-static {v2, v3, v1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 1425
    .line 1426
    .line 1427
    if-eqz v0, :cond_11

    .line 1428
    .line 1429
    const-string v0, "\u5207\u6362\u6d88\u606f\u9875\u540e\u751f\u6548\uff1b\u5220\u9664\u524d\u4ecd\u4f1a\u4e8c\u6b21\u786e\u8ba4"

    .line 1430
    .line 1431
    goto :goto_f

    .line 1432
    :cond_11
    const-string v0, "\u5df2\u9501\u5b9a \u00b7 \u4ec5\u9650\u5185\u6d4b\u7528\u6237"

    .line 1433
    .line 1434
    :goto_f
    invoke-static {v1, v0}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1439
    .line 1440
    .line 1441
    return-object v2

    .line 1442
    nop

    .line 1443
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
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
