.class public final Lv8/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lv8/r;

.field public static final b:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lv8/r;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv8/r;->a:Lv8/r;

    .line 7
    .line 8
    const-string v13, "note"

    .line 9
    .line 10
    const-string v14, "video_number_video"

    .line 11
    .line 12
    const-string v1, "text"

    .line 13
    .line 14
    const-string v2, "image"

    .line 15
    .line 16
    const-string v3, "voice"

    .line 17
    .line 18
    const-string v4, "video"

    .line 19
    .line 20
    const-string v5, "emoji"

    .line 21
    .line 22
    const-string v6, "quote"

    .line 23
    .line 24
    const-string v7, "file"

    .line 25
    .line 26
    const-string v8, "link"

    .line 27
    .line 28
    const-string v9, "music"

    .line 29
    .line 30
    const-string v10, "app"

    .line 31
    .line 32
    const-string v11, "location"

    .line 33
    .line 34
    const-string v12, "share_card"

    .line 35
    .line 36
    filled-new-array/range {v1 .. v14}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Ltf/d0;->R([Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, Lv8/r;->b:Ljava/util/LinkedHashSet;

    .line 45
    .line 46
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Hchat_auto_message_forward_config"

    .line 5
    .line 6
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "enabled"

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static b(Landroid/content/Context;)Ljava/util/List;
    .locals 29

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Hchat_auto_message_forward_config"

    .line 5
    .line 6
    move-object/from16 v1, p0

    .line 7
    .line 8
    invoke-static {v1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "rules_v1"

    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    move-object v0, v2

    .line 23
    :cond_0
    const-string v1, "excludeKeywords"

    .line 24
    .line 25
    const-string v3, "includeKeywords"

    .line 26
    .line 27
    const-string v4, "delaySeconds"

    .line 28
    .line 29
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    return-object v6

    .line 38
    :cond_1
    :try_start_0
    new-instance v5, Lorg/json/JSONArray;

    .line 39
    .line 40
    invoke-direct {v5, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, La/a;->E()Luf/c;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const/4 v8, 0x0

    .line 52
    move v9, v8

    .line 53
    :goto_0
    if-lt v9, v7, :cond_2

    .line 54
    .line 55
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    move-object/from16 v27, v6

    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :catchall_0
    move-exception v0

    .line 64
    move-object/from16 v27, v6

    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_2
    invoke-virtual {v5, v9}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    if-eqz v10, :cond_9

    .line 73
    .line 74
    const-string v11, "id"

    .line 75
    .line 76
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-eqz v12, :cond_3

    .line 85
    .line 86
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    :cond_3
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    const-string v12, "name"

    .line 98
    .line 99
    add-int/lit8 v13, v9, 0x1

    .line 100
    .line 101
    new-instance v14, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v15, "\u8f6c\u53d1\u89c4\u5219 "

    .line 107
    .line 108
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    invoke-virtual {v10, v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    const-string v13, "enabled"

    .line 126
    .line 127
    const/4 v14, 0x1

    .line 128
    invoke-virtual {v10, v13, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    const-string v15, "forwardOwnMessages"

    .line 133
    .line 134
    invoke-virtual {v10, v15, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v15

    .line 138
    const-string v8, "sourceIds"

    .line 139
    .line 140
    invoke-virtual {v10, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-static {v8}, Lv8/r;->e(Lorg/json/JSONArray;)Luf/i;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    move/from16 v16, v14

    .line 149
    .line 150
    const-string v14, "sourceMemberIds"

    .line 151
    .line 152
    invoke-virtual {v10, v14}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 153
    .line 154
    .line 155
    move-result-object v14

    .line 156
    invoke-static {v14}, Lv8/r;->e(Lorg/json/JSONArray;)Luf/i;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    move-object/from16 v26, v5

    .line 161
    .line 162
    const-string v5, "targetIds"

    .line 163
    .line 164
    invoke-virtual {v10, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-static {v5}, Lv8/r;->e(Lorg/json/JSONArray;)Luf/i;

    .line 169
    .line 170
    .line 171
    move-result-object v17

    .line 172
    const-string v5, "messageKinds"

    .line 173
    .line 174
    invoke-virtual {v10, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-static {v5}, Lv8/r;->e(Lorg/json/JSONArray;)Luf/i;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    move-object/from16 v18, v5

    .line 183
    .line 184
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 185
    .line 186
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v18 .. v18}, Luf/i;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v18

    .line 193
    :goto_1
    move-object/from16 v19, v18

    .line 194
    .line 195
    check-cast v19, Lm3/c;

    .line 196
    .line 197
    invoke-virtual/range {v19 .. v19}, Lm3/c;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v19
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    move-object/from16 v27, v6

    .line 202
    .line 203
    sget-object v6, Lv8/r;->b:Ljava/util/LinkedHashSet;

    .line 204
    .line 205
    if-eqz v19, :cond_5

    .line 206
    .line 207
    :try_start_1
    move-object/from16 v19, v18

    .line 208
    .line 209
    check-cast v19, Luf/e;

    .line 210
    .line 211
    move/from16 v28, v7

    .line 212
    .line 213
    invoke-virtual/range {v19 .. v19}, Luf/e;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    move-object/from16 v19, v8

    .line 218
    .line 219
    move-object v8, v7

    .line 220
    check-cast v8, Ljava/lang/String;

    .line 221
    .line 222
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-eqz v6, :cond_4

    .line 227
    .line 228
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    :cond_4
    move-object/from16 v8, v19

    .line 232
    .line 233
    move-object/from16 v6, v27

    .line 234
    .line 235
    move/from16 v7, v28

    .line 236
    .line 237
    goto :goto_1

    .line 238
    :catchall_1
    move-exception v0

    .line 239
    goto/16 :goto_5

    .line 240
    .line 241
    :cond_5
    move/from16 v28, v7

    .line 242
    .line 243
    move-object/from16 v19, v8

    .line 244
    .line 245
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    if-eqz v7, :cond_6

    .line 250
    .line 251
    move-object/from16 v18, v6

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_6
    move-object/from16 v18, v5

    .line 255
    .line 256
    :goto_2
    const-string v5, "delayEnabled"

    .line 257
    .line 258
    const-wide/16 v6, 0x0

    .line 259
    .line 260
    invoke-virtual {v10, v4, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 261
    .line 262
    .line 263
    move-result-wide v20

    .line 264
    cmp-long v8, v20, v6

    .line 265
    .line 266
    if-lez v8, :cond_7

    .line 267
    .line 268
    move/from16 v8, v16

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_7
    const/4 v8, 0x0

    .line 272
    :goto_3
    invoke-virtual {v10, v5, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    invoke-virtual {v10, v4, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 277
    .line 278
    .line 279
    move-result-wide v20

    .line 280
    cmp-long v8, v20, v6

    .line 281
    .line 282
    if-gez v8, :cond_8

    .line 283
    .line 284
    move-wide/from16 v20, v6

    .line 285
    .line 286
    :cond_8
    const-string v6, "includeKeywordsEnabled"

    .line 287
    .line 288
    invoke-virtual {v10, v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    xor-int/lit8 v7, v7, 0x1

    .line 300
    .line 301
    invoke-virtual {v10, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 302
    .line 303
    .line 304
    move-result v22

    .line 305
    invoke-virtual {v10, v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v23

    .line 309
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    const-string v6, "excludeKeywordsEnabled"

    .line 313
    .line 314
    invoke-virtual {v10, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 322
    .line 323
    .line 324
    move-result v7

    .line 325
    xor-int/lit8 v7, v7, 0x1

    .line 326
    .line 327
    invoke-virtual {v10, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 328
    .line 329
    .line 330
    move-result v24

    .line 331
    invoke-virtual {v10, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v25

    .line 335
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    new-instance v10, Lv8/a;

    .line 339
    .line 340
    move-object/from16 v16, v14

    .line 341
    .line 342
    move v14, v15

    .line 343
    move-object/from16 v15, v19

    .line 344
    .line 345
    move/from16 v19, v5

    .line 346
    .line 347
    invoke-direct/range {v10 .. v25}, Lv8/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0, v10}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 351
    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_9
    move-object/from16 v26, v5

    .line 355
    .line 356
    move-object/from16 v27, v6

    .line 357
    .line 358
    move/from16 v28, v7

    .line 359
    .line 360
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 361
    .line 362
    move-object/from16 v5, v26

    .line 363
    .line 364
    move-object/from16 v6, v27

    .line 365
    .line 366
    move/from16 v7, v28

    .line 367
    .line 368
    const/4 v8, 0x0

    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :goto_5
    new-instance v1, Lsf/f;

    .line 372
    .line 373
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 374
    .line 375
    .line 376
    move-object v0, v1

    .line 377
    :goto_6
    nop

    .line 378
    instance-of v1, v0, Lsf/f;

    .line 379
    .line 380
    if-eqz v1, :cond_a

    .line 381
    .line 382
    move-object/from16 v6, v27

    .line 383
    .line 384
    goto :goto_7

    .line 385
    :cond_a
    move-object v6, v0

    .line 386
    :goto_7
    check-cast v6, Ljava/util/List;

    .line 387
    .line 388
    return-object v6
.end method

.method public static c(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-static {p0, v0, v1}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v2, v1

    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-lez v2, :cond_2

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/4 v2, 0x0

    .line 72
    :goto_2
    if-eqz v2, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    return-object p0

    .line 79
    :array_0
    .array-data 2
        0x7cs
        0x2cs
        -0xf4s
        0x3bs
        -0xe5s
        0xas
        0xds
    .end array-data
.end method

.method public static d(Ljava/util/Set;)Lorg/json/JSONArray;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/lang/Iterable;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v1}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    move-object v3, v2

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-lez v3, :cond_2

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    const/4 v3, 0x0

    .line 68
    :goto_2
    if-eqz v3, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-static {p0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    return-object v0
.end method

.method public static e(Lorg/json/JSONArray;)Luf/i;
    .locals 6

    .line 1
    new-instance v0, Luf/i;

    .line 2
    .line 3
    invoke-direct {v0}, Luf/i;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-lt v3, v1, :cond_1

    .line 16
    .line 17
    :goto_1
    invoke-static {v0}, Lac/p;->h(Luf/i;)Luf/i;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-lez v5, :cond_2

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move v5, v2

    .line 46
    :goto_2
    if-eqz v5, :cond_3

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_3
    const/4 v4, 0x0

    .line 50
    :goto_3
    if-eqz v4, :cond_4

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Luf/i;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0
.end method
