.class public abstract Lkb;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static volatile a:Z = false

.field public static volatile b:Z = false


# direct methods
.method public static a(Ljava/lang/Object;)V
    .locals 9

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "lCurrentStyleId"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lw4;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    if-ne v1, v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    instance-of v6, v5, Ljava/lang/Number;

    .line 41
    .line 42
    if-eqz v6, :cond_3

    .line 43
    .line 44
    check-cast v5, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    move-wide v5, v3

    .line 52
    :goto_0
    const-wide/16 v7, 0x15

    .line 53
    .line 54
    cmp-long v7, v5, v7

    .line 55
    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    const-wide/16 v7, 0x16

    .line 59
    .line 60
    cmp-long v5, v5, v7

    .line 61
    .line 62
    if-nez v5, :cond_8

    .line 63
    .line 64
    :cond_4
    if-ne v1, v2, :cond_5

    .line 65
    .line 66
    invoke-virtual {v0, p0, v3, v4}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_5
    const-class v2, Ljava/lang/Long;

    .line 71
    .line 72
    if-ne v1, v2, :cond_6

    .line 73
    .line 74
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_6
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    if-ne v1, v2, :cond_7

    .line 86
    .line 87
    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_7
    const-class v2, Ljava/lang/Integer;

    .line 92
    .line 93
    if-ne v1, v2, :cond_8

    .line 94
    .line 95
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    :catchall_0
    :cond_8
    :goto_1
    return-void
.end method

.method public static b([Ljava/lang/Object;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, "block_profile_card_decor"

    .line 4
    .line 5
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    array-length v0, p0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_1

    .line 15
    .line 16
    aget-object v2, p0, v1

    .line 17
    .line 18
    invoke-static {v2}, Lkb;->c(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    :goto_1
    return-void
.end method

.method public static c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "block_profile_card_decor"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {p0, v1, v0}, Lkb;->d(Ljava/lang/Object;ILjava/util/Set;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static d(Ljava/lang/Object;ILjava/util/Set;)V
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    if-gt v1, v3, :cond_e

    .line 11
    .line 12
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkb;->a(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const-string v3, "zplanCover"

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static {v0, v3, v4}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const-string v3, "zplanCoverInfo"

    .line 33
    .line 34
    invoke-static {v0, v3, v4}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const-string v3, "zPlanCoverInfo"

    .line 38
    .line 39
    invoke-static {v0, v3, v4}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 43
    .line 44
    const-string v5, "profileCardShowZplanCover"

    .line 45
    .line 46
    invoke-static {v0, v5, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const-string v5, "isProfileCardShowZplanCover"

    .line 50
    .line 51
    invoke-static {v0, v5, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const-string v5, "showZPlan"

    .line 55
    .line 56
    invoke-static {v0, v5, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const-string v5, "isShowZPlan"

    .line 60
    .line 61
    invoke-static {v0, v5, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const-string v3, "diyCard"

    .line 65
    .line 66
    invoke-static {v0, v3}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    if-eq v3, v0, :cond_1

    .line 73
    .line 74
    invoke-static {v3}, Lkb;->a(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    const-string v3, "diyCardInfo"

    .line 78
    .line 79
    invoke-static {v0, v3}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-eqz v3, :cond_2

    .line 84
    .line 85
    if-eq v3, v0, :cond_2

    .line 86
    .line 87
    invoke-static {v3}, Lkb;->a(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    const-string v3, "background"

    .line 91
    .line 92
    invoke-static {v0, v3}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    if-eq v3, v0, :cond_3

    .line 99
    .line 100
    invoke-static {v3}, Lkb;->a(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    const-string v3, "template"

    .line 104
    .line 105
    invoke-static {v0, v3}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    if-eqz v3, :cond_4

    .line 110
    .line 111
    if-eq v3, v0, :cond_4

    .line 112
    .line 113
    invoke-static {v3}, Lkb;->a(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    const-string v23, "profileBgId"

    .line 117
    .line 118
    const-string v24, "profileCoverId"

    .line 119
    .line 120
    const-string v5, "iCardType"

    .line 121
    .line 122
    const-string v6, "cardType"

    .line 123
    .line 124
    const-string v7, "templateId"

    .line 125
    .line 126
    const-string v8, "templateID"

    .line 127
    .line 128
    const-string v9, "profileTemplateId"

    .line 129
    .line 130
    const-string v10, "profileCardTemplateId"

    .line 131
    .line 132
    const-string v11, "dynamicCardId"

    .line 133
    .line 134
    const-string v12, "dynamicCardID"

    .line 135
    .line 136
    const-string v13, "bgId"

    .line 137
    .line 138
    const-string v14, "backgroundId"

    .line 139
    .line 140
    const-string v15, "dressId"

    .line 141
    .line 142
    const-string v16, "vipDressId"

    .line 143
    .line 144
    const-string v17, "namePlateId"

    .line 145
    .line 146
    const-string v18, "nameplateId"

    .line 147
    .line 148
    const-string v19, "diyCardId"

    .line 149
    .line 150
    const-string v20, "diyId"

    .line 151
    .line 152
    const-string v21, "officialCardId"

    .line 153
    .line 154
    const-string v22, "officialBgId"

    .line 155
    .line 156
    filled-new-array/range {v5 .. v24}, [Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const/4 v5, 0x0

    .line 161
    move v6, v5

    .line 162
    :goto_0
    const/16 v7, 0x14

    .line 163
    .line 164
    if-ge v6, v7, :cond_5

    .line 165
    .line 166
    aget-object v7, v3, v6

    .line 167
    .line 168
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-static {v0, v7, v8}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    add-int/lit8 v6, v6, 0x1

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_5
    const-string v16, "profileCoverId"

    .line 179
    .line 180
    const-string v17, "lProfileBgId"

    .line 181
    .line 182
    const-string v7, "lCurrentStyleId"

    .line 183
    .line 184
    const-string v8, "lCurrentBgId"

    .line 185
    .line 186
    const-string v9, "lTemplateId"

    .line 187
    .line 188
    const-string v10, "lNamePlateId"

    .line 189
    .line 190
    const-string v11, "backgroundTimeStamp"

    .line 191
    .line 192
    const-string v12, "dynamicCardTimeStamp"

    .line 193
    .line 194
    const-string v13, "officialCardId"

    .line 195
    .line 196
    const-string v14, "profileCardId"

    .line 197
    .line 198
    const-string v15, "profileBgId"

    .line 199
    .line 200
    filled-new-array/range {v7 .. v17}, [Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    move v6, v5

    .line 205
    :goto_1
    const/16 v7, 0xb

    .line 206
    .line 207
    if-ge v6, v7, :cond_6

    .line 208
    .line 209
    aget-object v7, v3, v6

    .line 210
    .line 211
    const-wide/16 v8, 0x0

    .line 212
    .line 213
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-static {v0, v7, v8}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    add-int/lit8 v6, v6, 0x1

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_6
    const-string v20, "hasOfficialCard"

    .line 224
    .line 225
    const-string v21, "isUseOfficialCard"

    .line 226
    .line 227
    const-string v7, "isShowCardBackground"

    .line 228
    .line 229
    const-string v8, "showCardBackground"

    .line 230
    .line 231
    const-string v9, "showProfileBackground"

    .line 232
    .line 233
    const-string v10, "isDynamicCard"

    .line 234
    .line 235
    const-string v11, "isShowDynamicCard"

    .line 236
    .line 237
    const-string v12, "useDiyCard"

    .line 238
    .line 239
    const-string v13, "isUseDiyCard"

    .line 240
    .line 241
    const-string v14, "hasDiyCard"

    .line 242
    .line 243
    const-string v15, "hasProfileDecor"

    .line 244
    .line 245
    const-string v16, "isShowNamePlate"

    .line 246
    .line 247
    const-string v17, "isShowProfileBg"

    .line 248
    .line 249
    const-string v18, "showProfileBg"

    .line 250
    .line 251
    const-string v19, "hasProfileBg"

    .line 252
    .line 253
    filled-new-array/range {v7 .. v21}, [Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    move v6, v5

    .line 258
    :goto_2
    const/16 v7, 0xf

    .line 259
    .line 260
    if-ge v6, v7, :cond_7

    .line 261
    .line 262
    aget-object v7, v3, v6

    .line 263
    .line 264
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-static {v0, v7, v8}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    add-int/lit8 v6, v6, 0x1

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_7
    const-string v46, "vasProfileInfo"

    .line 273
    .line 274
    const-string v47, "profileVasInfo"

    .line 275
    .line 276
    const-string v7, "cardBackground"

    .line 277
    .line 278
    const-string v8, "cardBackgroundInfo"

    .line 279
    .line 280
    const-string v9, "background"

    .line 281
    .line 282
    const-string v10, "backgroundInfo"

    .line 283
    .line 284
    const-string v11, "profileBg"

    .line 285
    .line 286
    const-string v12, "profileBgInfo"

    .line 287
    .line 288
    const-string v13, "profileCardBg"

    .line 289
    .line 290
    const-string v14, "profileCardBackground"

    .line 291
    .line 292
    const-string v15, "profileBackground"

    .line 293
    .line 294
    const-string v16, "profileBackgroundInfo"

    .line 295
    .line 296
    const-string v17, "officialCard"

    .line 297
    .line 298
    const-string v18, "officialCardInfo"

    .line 299
    .line 300
    const-string v19, "officialBg"

    .line 301
    .line 302
    const-string v20, "officialBgInfo"

    .line 303
    .line 304
    const-string v21, "bgUrl"

    .line 305
    .line 306
    const-string v22, "backgroundUrl"

    .line 307
    .line 308
    const-string v23, "coverUrl"

    .line 309
    .line 310
    const-string v24, "videoUrl"

    .line 311
    .line 312
    const-string v25, "dynamicCardUrl"

    .line 313
    .line 314
    const-string v26, "profileBgUrl"

    .line 315
    .line 316
    const-string v27, "profileVideoUrl"

    .line 317
    .line 318
    const-string v28, "coverInfo"

    .line 319
    .line 320
    const-string v29, "dynamicCard"

    .line 321
    .line 322
    const-string v30, "dynamicCardInfo"

    .line 323
    .line 324
    const-string v31, "template"

    .line 325
    .line 326
    const-string v32, "profileTemplate"

    .line 327
    .line 328
    const-string v33, "templateInfo"

    .line 329
    .line 330
    const-string v34, "profileTemplateInfo"

    .line 331
    .line 332
    const-string v35, "vipCard"

    .line 333
    .line 334
    const-string v36, "vipCardInfo"

    .line 335
    .line 336
    const-string v37, "namePlate"

    .line 337
    .line 338
    const-string v38, "nameplate"

    .line 339
    .line 340
    const-string v39, "namePlateInfo"

    .line 341
    .line 342
    const-string v40, "nameplateInfo"

    .line 343
    .line 344
    const-string v41, "cardDecor"

    .line 345
    .line 346
    const-string v42, "cardDecorInfo"

    .line 347
    .line 348
    const-string v43, "decorInfo"

    .line 349
    .line 350
    const-string v44, "dressInfo"

    .line 351
    .line 352
    const-string v45, "vasCardInfo"

    .line 353
    .line 354
    filled-new-array/range {v7 .. v47}, [Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    :goto_3
    const/16 v6, 0x29

    .line 359
    .line 360
    if-ge v5, v6, :cond_8

    .line 361
    .line 362
    aget-object v6, v3, v5

    .line 363
    .line 364
    invoke-static {v0, v6, v4}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    add-int/lit8 v5, v5, 0x1

    .line 368
    .line 369
    goto :goto_3

    .line 370
    :cond_8
    const-string v3, "card"

    .line 371
    .line 372
    invoke-static {v0, v3}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    if-eqz v3, :cond_9

    .line 377
    .line 378
    add-int/lit8 v4, v1, 0x1

    .line 379
    .line 380
    invoke-static {v3, v4, v2}, Lkb;->d(Ljava/lang/Object;ILjava/util/Set;)V

    .line 381
    .line 382
    .line 383
    :cond_9
    const-string v3, "a"

    .line 384
    .line 385
    invoke-static {v0, v3}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    if-eqz v3, :cond_a

    .line 390
    .line 391
    if-eq v3, v0, :cond_a

    .line 392
    .line 393
    add-int/lit8 v4, v1, 0x1

    .line 394
    .line 395
    invoke-static {v3, v4, v2}, Lkb;->d(Ljava/lang/Object;ILjava/util/Set;)V

    .line 396
    .line 397
    .line 398
    :cond_a
    const-string v3, "b"

    .line 399
    .line 400
    invoke-static {v0, v3}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    if-eqz v3, :cond_b

    .line 405
    .line 406
    if-eq v3, v0, :cond_b

    .line 407
    .line 408
    add-int/lit8 v4, v1, 0x1

    .line 409
    .line 410
    invoke-static {v3, v4, v2}, Lkb;->d(Ljava/lang/Object;ILjava/util/Set;)V

    .line 411
    .line 412
    .line 413
    :cond_b
    const-string v3, "profileCardInfo"

    .line 414
    .line 415
    invoke-static {v0, v3}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    if-eqz v3, :cond_c

    .line 420
    .line 421
    if-eq v3, v0, :cond_c

    .line 422
    .line 423
    add-int/lit8 v4, v1, 0x1

    .line 424
    .line 425
    invoke-static {v3, v4, v2}, Lkb;->d(Ljava/lang/Object;ILjava/util/Set;)V

    .line 426
    .line 427
    .line 428
    :cond_c
    const-string v3, "cardInfo"

    .line 429
    .line 430
    invoke-static {v0, v3}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    if-eqz v3, :cond_e

    .line 435
    .line 436
    if-ne v3, v0, :cond_d

    .line 437
    .line 438
    goto :goto_4

    .line 439
    :cond_d
    add-int/lit8 v0, v1, 0x1

    .line 440
    .line 441
    invoke-static {v3, v0, v2}, Lkb;->d(Ljava/lang/Object;ILjava/util/Set;)V

    .line 442
    .line 443
    .line 444
    :cond_e
    :goto_4
    return-void
.end method
