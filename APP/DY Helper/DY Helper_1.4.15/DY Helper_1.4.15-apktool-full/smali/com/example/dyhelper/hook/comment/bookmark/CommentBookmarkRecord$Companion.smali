.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 26

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "knownReplyIds"

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    move v5, v3

    .line 25
    :goto_0
    if-ge v5, v4, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-nez v7, :cond_0

    .line 39
    .line 40
    invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v4, "newReplyItems"

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-eqz v4, :cond_4

    .line 58
    .line 59
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    :goto_1
    if-ge v3, v5, :cond_4

    .line 64
    .line 65
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-nez v6, :cond_2

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    const-string v7, "replyId"

    .line 73
    .line 74
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_3

    .line 86
    .line 87
    sget-object v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem$Companion;

    .line 88
    .line 89
    invoke-virtual {v7, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    const-string v3, "commentId"

    .line 100
    .line 101
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const-string v4, "awemeId"

    .line 109
    .line 110
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const-string v5, "content"

    .line 118
    .line 119
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    const-string v6, "authorName"

    .line 127
    .line 128
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    const-string v7, "commentCreateTime"

    .line 136
    .line 137
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 138
    .line 139
    .line 140
    move-result-wide v7

    .line 141
    const-string v9, "createTimestamp"

    .line 142
    .line 143
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 144
    .line 145
    .line 146
    move-result-wide v10

    .line 147
    invoke-virtual {v0, v9, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 148
    .line 149
    .line 150
    move-result-wide v9

    .line 151
    const-string v11, "notificationEnabled"

    .line 152
    .line 153
    const/4 v12, 0x1

    .line 154
    invoke-virtual {v0, v11, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    const-string v12, "userTag"

    .line 159
    .line 160
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    const-string v13, "remark"

    .line 168
    .line 169
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    const-string v14, "lastCheckTimestamp"

    .line 177
    .line 178
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 179
    .line 180
    .line 181
    move-result-wide v14

    .line 182
    move-object/from16 v17, v1

    .line 183
    .line 184
    const-string v1, "lastKnownReplyCount"

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    move/from16 p0, v1

    .line 191
    .line 192
    const-string v1, "hasNewReplies"

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    move/from16 v16, v1

    .line 199
    .line 200
    const-string v1, "newReplyCount"

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    move/from16 v18, v1

    .line 207
    .line 208
    const-string v1, "awemeAuthorId"

    .line 209
    .line 210
    move-object/from16 v19, v2

    .line 211
    .line 212
    const-string v2, ""

    .line 213
    .line 214
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 222
    .line 223
    .line 224
    move-result v20

    .line 225
    const/16 v21, 0x0

    .line 226
    .line 227
    move-object/from16 v22, v3

    .line 228
    .line 229
    const-string v3, "null"

    .line 230
    .line 231
    if-nez v20, :cond_5

    .line 232
    .line 233
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v20

    .line 237
    if-nez v20, :cond_5

    .line 238
    .line 239
    move-object/from16 v20, v1

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_5
    move-object/from16 v20, v21

    .line 243
    .line 244
    :goto_3
    const-string v1, "awemeAuthorSecUid"

    .line 245
    .line 246
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result v23

    .line 257
    if-nez v23, :cond_6

    .line 258
    .line 259
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v23

    .line 263
    if-nez v23, :cond_6

    .line 264
    .line 265
    move-object/from16 v23, v1

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_6
    move-object/from16 v23, v21

    .line 269
    .line 270
    :goto_4
    const-string v1, "awemeTitle"

    .line 271
    .line 272
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v24

    .line 283
    if-nez v24, :cond_7

    .line 284
    .line 285
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v24

    .line 289
    if-nez v24, :cond_7

    .line 290
    .line 291
    move-object/from16 v24, v1

    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_7
    move-object/from16 v24, v21

    .line 295
    .line 296
    :goto_5
    const-string v1, "commentSecUid"

    .line 297
    .line 298
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 306
    .line 307
    .line 308
    move-result v25

    .line 309
    if-nez v25, :cond_8

    .line 310
    .line 311
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v25

    .line 315
    if-nez v25, :cond_8

    .line 316
    .line 317
    move-object/from16 v25, v1

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_8
    move-object/from16 v25, v21

    .line 321
    .line 322
    :goto_6
    const-string v1, "coverUrl"

    .line 323
    .line 324
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    if-nez v2, :cond_9

    .line 336
    .line 337
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-nez v2, :cond_9

    .line 342
    .line 343
    move-object/from16 v21, v1

    .line 344
    .line 345
    :cond_9
    const-string v1, "aweType"

    .line 346
    .line 347
    const/16 v2, 0x2904

    .line 348
    .line 349
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    move-object v2, v4

    .line 354
    move-object v3, v5

    .line 355
    move-object v4, v6

    .line 356
    move-wide v5, v7

    .line 357
    move-wide v7, v9

    .line 358
    move v9, v11

    .line 359
    move-object v10, v12

    .line 360
    move-object v11, v13

    .line 361
    move-wide v12, v14

    .line 362
    move/from16 v15, v16

    .line 363
    .line 364
    move/from16 v16, v18

    .line 365
    .line 366
    move-object/from16 v18, v19

    .line 367
    .line 368
    move-object/from16 v19, v20

    .line 369
    .line 370
    move-object/from16 v20, v23

    .line 371
    .line 372
    move-object/from16 v23, v21

    .line 373
    .line 374
    move-object/from16 v21, v24

    .line 375
    .line 376
    move/from16 v24, v0

    .line 377
    .line 378
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 379
    .line 380
    move/from16 v14, p0

    .line 381
    .line 382
    move-object/from16 v1, v22

    .line 383
    .line 384
    move-object/from16 v22, v25

    .line 385
    .line 386
    invoke-direct/range {v0 .. v24}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 387
    .line 388
    .line 389
    return-object v0
.end method
