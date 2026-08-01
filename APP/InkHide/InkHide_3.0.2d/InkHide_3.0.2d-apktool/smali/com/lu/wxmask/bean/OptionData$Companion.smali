.class public final Lcom/lu/wxmask/bean/OptionData$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lu/wxmask/bean/OptionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LN0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lu/wxmask/bean/OptionData$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Ljava/lang/String;)Lcom/lu/wxmask/bean/OptionData;
    .locals 44

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "jsonText"

    .line 4
    .line 5
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    new-instance v1, Lorg/json/JSONObject;

    .line 15
    .line 16
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 17
    .line 18
    .line 19
    :goto_0
    const-string v0, "hideMainSearch"

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const-string v0, "hideSingleSearch"

    .line 27
    .line 28
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const-string v0, "hideMainSearchStrong"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    const-string v0, "hideCloseFriend"

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v0, "hideChatHistory"

    .line 46
    .line 47
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const-string v0, "chatHistoryQuickUnhideClickCount"

    .line 52
    .line 53
    const/4 v9, 0x3

    .line 54
    invoke-virtual {v1, v0, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v10, 0x2

    .line 59
    const/16 v11, 0x8

    .line 60
    .line 61
    invoke-static {v0, v10, v11}, LD/h;->g(III)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const-string v12, "chatHistoryQuickUnhideDurationMs"

    .line 66
    .line 67
    const/16 v13, 0x5dc

    .line 68
    .line 69
    invoke-virtual {v1, v12, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    const/16 v13, 0x12c

    .line 74
    .line 75
    const/16 v14, 0x1388

    .line 76
    .line 77
    invoke-static {v12, v13, v14}, LD/h;->g(III)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    const-string v13, "hideStorageChatHistory"

    .line 82
    .line 83
    invoke-virtual {v1, v13, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    const-string v14, "hideTextStatusFriend"

    .line 88
    .line 89
    invoke-virtual {v1, v14, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    const-string v15, "hideConversationUnreadBadge"

    .line 94
    .line 95
    invoke-virtual {v1, v15, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    const-string v10, "hideContactFriend"

    .line 100
    .line 101
    invoke-virtual {v1, v10, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    const-string v11, "hideTopBarUnreadBold"

    .line 106
    .line 107
    invoke-virtual {v1, v11, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    const-string v9, "hiddenMessageVibrate"

    .line 112
    .line 113
    invoke-virtual {v1, v9, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    move/from16 v18, v0

    .line 118
    .line 119
    const-string v0, "hiddenMessageVibrateMode"

    .line 120
    .line 121
    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    const/4 v3, 0x3

    .line 126
    invoke-static {v0, v2, v3}, LD/h;->g(III)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    const-string v3, "closeFriendQuickDisplay"

    .line 131
    .line 132
    const/4 v2, 0x1

    .line 133
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    move/from16 v21, v0

    .line 138
    .line 139
    const-string v0, "shakeHideTemporary"

    .line 140
    .line 141
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    move/from16 v22, v0

    .line 146
    .line 147
    const-string v0, "enableSearchCommand"

    .line 148
    .line 149
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    const-string v2, "searchCommandText"

    .line 154
    .line 155
    move/from16 v23, v0

    .line 156
    .line 157
    const-string v0, "#hide"

    .line 158
    .line 159
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v24

    .line 167
    if-eqz v24, :cond_0

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_0
    move-object v0, v2

    .line 171
    :goto_1
    const-string v2, "searchListCommandText"

    .line 172
    .line 173
    move-object/from16 v24, v0

    .line 174
    .line 175
    const-string v0, "#list"

    .line 176
    .line 177
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v25

    .line 185
    if-eqz v25, :cond_1

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_1
    move-object v0, v2

    .line 189
    :goto_2
    const-string v2, "quickDisplayClickCount"

    .line 190
    .line 191
    move-object/from16 v25, v0

    .line 192
    .line 193
    const/4 v0, 0x3

    .line 194
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    move/from16 p1, v3

    .line 199
    .line 200
    const/4 v2, 0x2

    .line 201
    const/16 v3, 0x8

    .line 202
    .line 203
    invoke-static {v0, v2, v3}, LD/h;->g(III)I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    const-string v2, "quickDisplayLongPressMs"

    .line 208
    .line 209
    const/16 v3, 0x1f4

    .line 210
    .line 211
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    const/16 v3, 0xc8

    .line 216
    .line 217
    move/from16 v16, v0

    .line 218
    .line 219
    const/16 v0, 0xbb8

    .line 220
    .line 221
    invoke-static {v2, v3, v0}, LD/h;->g(III)I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    const-string v2, "quickAddMaskList"

    .line 226
    .line 227
    const/4 v3, 0x1

    .line 228
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    const-string v3, "quickAddMenuTitle"

    .line 233
    .line 234
    move/from16 v17, v0

    .line 235
    .line 236
    const-string v0, "\u52a0\u5165\u540d\u5355"

    .line 237
    .line 238
    invoke-virtual {v1, v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const-string v3, "optString(...)"

    .line 243
    .line 244
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    move-object/from16 v26, v0

    .line 248
    .line 249
    const-string v0, "hideSnsLike"

    .line 250
    .line 251
    move/from16 v27, v2

    .line 252
    .line 253
    const/4 v2, 0x0

    .line 254
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    move/from16 v28, v0

    .line 259
    .line 260
    const-string v0, "hideSnsGroupIcon"

    .line 261
    .line 262
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    move/from16 v29, v0

    .line 267
    .line 268
    const-string v0, "hideSnsCloseFriendPosts"

    .line 269
    .line 270
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    move/from16 v30, v0

    .line 275
    .line 276
    const-string v0, "hideSelfSnsPosts"

    .line 277
    .line 278
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    move/from16 v31, v0

    .line 283
    .line 284
    const-string v0, "disableSelfSnsLongPressHidePrompt"

    .line 285
    .line 286
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    const-string v2, "antiRevokeMessage"

    .line 291
    .line 292
    move/from16 v32, v0

    .line 293
    .line 294
    const/4 v0, 0x1

    .line 295
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    const-string v0, "readTraceMessage"

    .line 300
    .line 301
    move/from16 v33, v2

    .line 302
    .line 303
    const/4 v2, 0x0

    .line 304
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    const-string v2, "readTraceCommandPrefix"

    .line 309
    .line 310
    move/from16 v34, v0

    .line 311
    .line 312
    const-string v0, "#read"

    .line 313
    .line 314
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 319
    .line 320
    .line 321
    move-result v35

    .line 322
    if-eqz v35, :cond_2

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_2
    move-object v0, v2

    .line 326
    :goto_3
    const-string v2, "readTraceServerUrl"

    .line 327
    .line 328
    move-object/from16 v35, v0

    .line 329
    .line 330
    const-string v0, "https://read.spint.kdns.fr"

    .line 331
    .line 332
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 337
    .line 338
    .line 339
    move-result v36

    .line 340
    if-eqz v36, :cond_3

    .line 341
    .line 342
    goto :goto_4

    .line 343
    :cond_3
    move-object v0, v2

    .line 344
    :goto_4
    const-string v2, "disableWechatHotUpdate"

    .line 345
    .line 346
    move-object/from16 v36, v0

    .line 347
    .line 348
    const/4 v0, 0x0

    .line 349
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    move/from16 v20, v2

    .line 354
    .line 355
    const-string v2, "customLocalFriendAvatar"

    .line 356
    .line 357
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 358
    .line 359
    .line 360
    move-result v37

    .line 361
    const-string v2, "useFullscreenConfigUi"

    .line 362
    .line 363
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 364
    .line 365
    .line 366
    move-result v38

    .line 367
    const-string v2, "tripleTapPassword"

    .line 368
    .line 369
    const-string v0, ""

    .line 370
    .line 371
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    const-string v2, "viewWxDbPw"

    .line 379
    .line 380
    const/4 v3, 0x0

    .line 381
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 382
    .line 383
    .line 384
    move-result v40

    .line 385
    const-string v2, "enableChattingKey"

    .line 386
    .line 387
    const/4 v3, 0x1

    .line 388
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 389
    .line 390
    .line 391
    move-result v41

    .line 392
    const-string v2, "hideVoipCall"

    .line 393
    .line 394
    const/4 v3, 0x0

    .line 395
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 396
    .line 397
    .line 398
    move-result v42

    .line 399
    new-instance v3, Lcom/lu/wxmask/bean/OptionData;

    .line 400
    .line 401
    const/16 v43, 0x0

    .line 402
    .line 403
    move/from16 v19, v14

    .line 404
    .line 405
    move v14, v10

    .line 406
    move v10, v12

    .line 407
    move/from16 v12, v19

    .line 408
    .line 409
    move/from16 v19, v15

    .line 410
    .line 411
    move v15, v11

    .line 412
    move v11, v13

    .line 413
    move/from16 v13, v19

    .line 414
    .line 415
    move-object/from16 v19, v24

    .line 416
    .line 417
    move/from16 v24, v17

    .line 418
    .line 419
    move/from16 v17, v21

    .line 420
    .line 421
    move-object/from16 v21, v19

    .line 422
    .line 423
    move-object/from16 v39, v0

    .line 424
    .line 425
    move/from16 v19, v22

    .line 426
    .line 427
    move-object/from16 v22, v25

    .line 428
    .line 429
    move/from16 v25, v27

    .line 430
    .line 431
    move/from16 v27, v28

    .line 432
    .line 433
    move/from16 v28, v29

    .line 434
    .line 435
    move/from16 v29, v30

    .line 436
    .line 437
    move/from16 v30, v31

    .line 438
    .line 439
    move/from16 v31, v32

    .line 440
    .line 441
    move/from16 v32, v33

    .line 442
    .line 443
    move/from16 v33, v34

    .line 444
    .line 445
    move-object/from16 v34, v35

    .line 446
    .line 447
    move-object/from16 v35, v36

    .line 448
    .line 449
    move/from16 v36, v20

    .line 450
    .line 451
    move/from16 v20, v23

    .line 452
    .line 453
    move/from16 v23, v16

    .line 454
    .line 455
    move/from16 v16, v9

    .line 456
    .line 457
    move/from16 v9, v18

    .line 458
    .line 459
    move/from16 v18, p1

    .line 460
    .line 461
    invoke-direct/range {v3 .. v43}, Lcom/lu/wxmask/bean/OptionData;-><init>(ZZZZZIIZZZZZZIZZZLjava/lang/String;Ljava/lang/String;IIZLjava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZZLN0/e;)V

    .line 462
    .line 463
    .line 464
    return-object v3
.end method

.method public final toJson(Lcom/lu/wxmask/bean/OptionData;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "hideMainSearch"

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideMainSearch()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "hideSingleSearch"

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideSingleSearch()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    const-string v1, "hideMainSearchStrong"

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideMainSearchStrong()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    const-string v1, "hideCloseFriend"

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideCloseFriend()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    const-string v1, "hideChatHistory"

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideChatHistory()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getChatHistoryQuickUnhideClickCount()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x2

    .line 61
    const/16 v3, 0x8

    .line 62
    .line 63
    invoke-static {v1, v2, v3}, LD/h;->g(III)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const-string v4, "chatHistoryQuickUnhideClickCount"

    .line 68
    .line 69
    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getChatHistoryQuickUnhideDurationMs()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/16 v4, 0x12c

    .line 77
    .line 78
    const/16 v5, 0x1388

    .line 79
    .line 80
    invoke-static {v1, v4, v5}, LD/h;->g(III)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const-string v4, "chatHistoryQuickUnhideDurationMs"

    .line 85
    .line 86
    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    const-string v1, "hideStorageChatHistory"

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideStorageChatHistory()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    const-string v1, "hideTextStatusFriend"

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideTextStatusFriend()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    const-string v1, "hideConversationUnreadBadge"

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideConversationUnreadBadge()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    const-string v1, "hideContactFriend"

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideContactFriend()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    const-string v1, "hideTopBarUnreadBold"

    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideTopBarUnreadBold()Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 132
    .line 133
    .line 134
    const-string v1, "hiddenMessageVibrate"

    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHiddenMessageVibrate()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHiddenMessageVibrateMode()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    const/4 v4, 0x0

    .line 148
    const/4 v5, 0x3

    .line 149
    invoke-static {v1, v4, v5}, LD/h;->g(III)I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    const-string v4, "hiddenMessageVibrateMode"

    .line 154
    .line 155
    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 156
    .line 157
    .line 158
    const-string v1, "closeFriendQuickDisplay"

    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getCloseFriendQuickDisplay()Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 165
    .line 166
    .line 167
    const-string v1, "shakeHideTemporary"

    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getShakeHideTemporary()Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 174
    .line 175
    .line 176
    const-string v1, "enableSearchCommand"

    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getEnableSearchCommand()Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getSearchCommandText()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_0

    .line 194
    .line 195
    const-string v1, "#hide"

    .line 196
    .line 197
    :cond_0
    const-string v4, "searchCommandText"

    .line 198
    .line 199
    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getSearchListCommandText()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-eqz v4, :cond_1

    .line 211
    .line 212
    const-string v1, "#list"

    .line 213
    .line 214
    :cond_1
    const-string v4, "searchListCommandText"

    .line 215
    .line 216
    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getQuickDisplayClickCount()I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    invoke-static {v1, v2, v3}, LD/h;->g(III)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    const-string v2, "quickDisplayClickCount"

    .line 228
    .line 229
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getQuickDisplayLongPressMs()I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    const/16 v2, 0xc8

    .line 237
    .line 238
    const/16 v3, 0xbb8

    .line 239
    .line 240
    invoke-static {v1, v2, v3}, LD/h;->g(III)I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    const-string v2, "quickDisplayLongPressMs"

    .line 245
    .line 246
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 247
    .line 248
    .line 249
    const-string v1, "quickAddMaskList"

    .line 250
    .line 251
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getQuickAddMaskList()Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 256
    .line 257
    .line 258
    const-string v1, "quickAddMenuTitle"

    .line 259
    .line 260
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getQuickAddMenuTitle()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 265
    .line 266
    .line 267
    const-string v1, "hideSnsLike"

    .line 268
    .line 269
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideSnsLike()Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 274
    .line 275
    .line 276
    const-string v1, "hideSnsGroupIcon"

    .line 277
    .line 278
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideSnsGroupIcon()Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 283
    .line 284
    .line 285
    const-string v1, "hideSnsCloseFriendPosts"

    .line 286
    .line 287
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideSnsCloseFriendPosts()Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 292
    .line 293
    .line 294
    const-string v1, "hideSelfSnsPosts"

    .line 295
    .line 296
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideSelfSnsPosts()Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 301
    .line 302
    .line 303
    const-string v1, "disableSelfSnsLongPressHidePrompt"

    .line 304
    .line 305
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getDisableSelfSnsLongPressHidePrompt()Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 310
    .line 311
    .line 312
    const-string v1, "antiRevokeMessage"

    .line 313
    .line 314
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getAntiRevokeMessage()Z

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 319
    .line 320
    .line 321
    const-string v1, "readTraceMessage"

    .line 322
    .line 323
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getReadTraceMessage()Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 328
    .line 329
    .line 330
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getReadTraceCommandPrefix()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    if-eqz v2, :cond_2

    .line 339
    .line 340
    const-string v1, "#read"

    .line 341
    .line 342
    :cond_2
    const-string v2, "readTraceCommandPrefix"

    .line 343
    .line 344
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 345
    .line 346
    .line 347
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getReadTraceServerUrl()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-eqz v2, :cond_3

    .line 356
    .line 357
    const-string v1, "https://read.spint.kdns.fr"

    .line 358
    .line 359
    :cond_3
    const-string v2, "readTraceServerUrl"

    .line 360
    .line 361
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 362
    .line 363
    .line 364
    const-string v1, "disableWechatHotUpdate"

    .line 365
    .line 366
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getDisableWechatHotUpdate()Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 371
    .line 372
    .line 373
    const-string v1, "customLocalFriendAvatar"

    .line 374
    .line 375
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getCustomLocalFriendAvatar()Z

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 380
    .line 381
    .line 382
    const-string v1, "useFullscreenConfigUi"

    .line 383
    .line 384
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getUseFullscreenConfigUi()Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 389
    .line 390
    .line 391
    const-string v1, "tripleTapPassword"

    .line 392
    .line 393
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getTripleTapPassword()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 398
    .line 399
    .line 400
    const-string v1, "viewWxDbPw"

    .line 401
    .line 402
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getViewWxDbPw()Z

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 407
    .line 408
    .line 409
    const-string v1, "enableChattingKey"

    .line 410
    .line 411
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getEnableChattingKey()Z

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 416
    .line 417
    .line 418
    const-string v1, "hideVoipCall"

    .line 419
    .line 420
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getHideVoipCall()Z

    .line 421
    .line 422
    .line 423
    move-result p1

    .line 424
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    const-string v0, "toString(...)"

    .line 432
    .line 433
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    return-object p1
.end method
