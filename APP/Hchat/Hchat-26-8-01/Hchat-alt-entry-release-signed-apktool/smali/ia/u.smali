.class public final Lia/u;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lia/a0;

.field public f:Lia/h;

.field public g:Lp8/o;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "moments_fake_interaction"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lha/k0;

    .line 5
    .line 6
    const-string v0, "moments_fake_like"

    .line 7
    .line 8
    const-string v1, "\u670b\u53cb\u5708\u4f2a\u96c6\u8d5e"

    .line 9
    .line 10
    const-string v2, "\u957f\u6309\u670b\u53cb\u5708\u9009\u62e9\u6216\u51ed\u7a7a\u751f\u6210\u672c\u5730\u70b9\u8d5e"

    .line 11
    .line 12
    const-string v3, "practical"

    .line 13
    .line 14
    invoke-direct {p1, v0, v1, v2, v3}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lha/k0;

    .line 21
    .line 22
    const-string v0, "\u670b\u53cb\u5708\u4f2a\u8bc4\u8bba"

    .line 23
    .line 24
    const-string v1, "\u957f\u6309\u670b\u53cb\u5708\u6dfb\u52a0\u5e26\u65f6\u95f4\u548c\u987a\u5e8f\u7684\u672c\u5730\u8bc4\u8bba"

    .line 25
    .line 26
    const-string v2, "moments_fake_comment"

    .line 27
    .line 28
    invoke-direct {p1, v2, v0, v1, v3}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final g(Lr8/g;)V
    .locals 27

    .line 1
    move-object/from16 v9, p1

    .line 2
    .line 3
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v10, Lb5/c;

    .line 7
    .line 8
    iget-object v0, v9, Lr8/g;->a:Landroid/content/Context;

    .line 9
    .line 10
    const/4 v1, 0x7

    .line 11
    invoke-direct {v10, v0, v1}, Lb5/c;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    new-instance v11, Lia/h;

    .line 15
    .line 16
    new-instance v0, Lab/b;

    .line 17
    .line 18
    const-class v12, Lia/u;

    .line 19
    .line 20
    invoke-static {v12}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const/4 v7, 0x0

    .line 25
    const/16 v8, 0x1a

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v4, "logFeatureError"

    .line 29
    .line 30
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    move-object/from16 v2, p0

    .line 34
    .line 35
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v11, v9, v0}, Lia/h;-><init>(Lr8/g;Lab/b;)V

    .line 39
    .line 40
    .line 41
    new-instance v13, Lia/a0;

    .line 42
    .line 43
    new-instance v0, Lab/b;

    .line 44
    .line 45
    invoke-static {v12}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const/16 v8, 0x1d

    .line 50
    .line 51
    const-string v4, "logFeatureError"

    .line 52
    .line 53
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 54
    .line 55
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v13, v9, v10, v11, v0}, Lia/a0;-><init>(Lr8/g;Lb5/c;Lia/h;Lab/b;)V

    .line 59
    .line 60
    .line 61
    new-instance v14, Lia/q;

    .line 62
    .line 63
    iget-object v15, v9, Lr8/g;->a:Landroid/content/Context;

    .line 64
    .line 65
    new-instance v0, Lab/b;

    .line 66
    .line 67
    invoke-static {v12}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const/16 v8, 0x1b

    .line 72
    .line 73
    const-string v4, "logFeatureError"

    .line 74
    .line 75
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 76
    .line 77
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 78
    .line 79
    .line 80
    invoke-direct {v14, v15, v10, v13, v0}, Lia/q;-><init>(Landroid/content/Context;Lb5/c;Lia/a0;Lab/b;)V

    .line 81
    .line 82
    .line 83
    new-instance v10, Lp8/o;

    .line 84
    .line 85
    new-instance v0, Lab/b;

    .line 86
    .line 87
    invoke-static {v12}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    const/16 v8, 0x1c

    .line 92
    .line 93
    const-string v4, "logFeatureError"

    .line 94
    .line 95
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 96
    .line 97
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v10, v9, v0}, Lp8/o;-><init>(Lr8/g;Lfg/p;)V

    .line 101
    .line 102
    .line 103
    iput-object v11, v2, Lia/u;->f:Lia/h;

    .line 104
    .line 105
    iput-object v13, v2, Lia/u;->e:Lia/a0;

    .line 106
    .line 107
    iput-object v10, v2, Lia/u;->g:Lp8/o;

    .line 108
    .line 109
    sput-object v13, Lac/p;->b:Lia/a0;

    .line 110
    .line 111
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-eqz v0, :cond_0

    .line 116
    .line 117
    new-instance v1, Lha/c;

    .line 118
    .line 119
    const/4 v3, 0x4

    .line 120
    invoke-direct {v1, v13, v3}, Lha/c;-><init>(Ljava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lp8/d0;->n(Lha/c;)V

    .line 124
    .line 125
    .line 126
    :cond_0
    iget-object v1, v13, Lia/a0;->f:Ljava/util/Set;

    .line 127
    .line 128
    const-string v0, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 129
    .line 130
    iget-object v3, v9, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 131
    .line 132
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v11, 0x1

    .line 138
    const/4 v15, 0x0

    .line 139
    if-eqz v0, :cond_d

    .line 140
    .line 141
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v3, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    if-eqz v4, :cond_5

    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    move-object v5, v4

    .line 165
    check-cast v5, Ljava/lang/reflect/Method;

    .line 166
    .line 167
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-nez v6, :cond_1

    .line 176
    .line 177
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-eqz v6, :cond_2

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_2
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    const-string v7, "convertFrom"

    .line 193
    .line 194
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-eqz v6, :cond_1

    .line 199
    .line 200
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    array-length v6, v6

    .line 205
    if-eq v6, v11, :cond_3

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_3
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    aget-object v5, v5, v10

    .line 213
    .line 214
    const-class v6, Landroid/database/Cursor;

    .line 215
    .line 216
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-nez v6, :cond_4

    .line 221
    .line 222
    const-class v6, Landroid/content/ContentValues;

    .line 223
    .line 224
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    if-eqz v5, :cond_1

    .line 229
    .line 230
    :cond_4
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_0

    .line 234
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_6

    .line 239
    .line 240
    move v4, v10

    .line 241
    goto/16 :goto_6

    .line 242
    .line 243
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    move v4, v10

    .line 248
    :cond_7
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_c

    .line 253
    .line 254
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    move-object v5, v0

    .line 259
    check-cast v5, Ljava/lang/reflect/Method;

    .line 260
    .line 261
    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-nez v0, :cond_8

    .line 266
    .line 267
    move v0, v11

    .line 268
    goto :goto_5

    .line 269
    :cond_8
    :try_start_0
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 270
    .line 271
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    if-eqz v6, :cond_9

    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_9
    move-object v6, v5

    .line 279
    :goto_2
    new-instance v7, Lia/z;

    .line 280
    .line 281
    invoke-direct {v7, v13, v11}, Lia/z;-><init>(Lia/a0;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v6, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 285
    .line 286
    .line 287
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :catchall_0
    move-exception v0

    .line 291
    new-instance v6, Lsf/f;

    .line 292
    .line 293
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    move-object v0, v6

    .line 297
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    if-nez v6, :cond_a

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_a
    invoke-interface {v1, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    iget-object v0, v13, Lia/a0;->d:Lab/b;

    .line 308
    .line 309
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    new-instance v7, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    const-string v8, "\u5b89\u88c5\u670b\u53cb\u5708\u4f2a\u4e92\u52a8\u8bb0\u5f55Hook\u5931\u8d25: "

    .line 316
    .line 317
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-virtual {v0, v5, v6}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 331
    .line 332
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    :goto_5
    if-eqz v0, :cond_7

    .line 339
    .line 340
    add-int/lit8 v4, v4, 0x1

    .line 341
    .line 342
    if-ltz v4, :cond_b

    .line 343
    .line 344
    goto :goto_1

    .line 345
    :cond_b
    invoke-static {}, La/a;->P0()V

    .line 346
    .line 347
    .line 348
    throw v15

    .line 349
    :cond_c
    :goto_6
    if-lez v4, :cond_d

    .line 350
    .line 351
    move v0, v11

    .line 352
    goto :goto_7

    .line 353
    :cond_d
    move v0, v10

    .line 354
    :goto_7
    if-nez v0, :cond_e

    .line 355
    .line 356
    const-string v0, "\u670b\u53cb\u5708\u4f2a\u4e92\u52a8\u8bb0\u5f55Hook\u672a\u5b89\u88c5"

    .line 357
    .line 358
    invoke-virtual {v2, v0, v15}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 359
    .line 360
    .line 361
    :cond_e
    iget-object v0, v9, Lr8/g;->a:Landroid/content/Context;

    .line 362
    .line 363
    const-string v1, "Hchat_moments_fake_interaction_config"

    .line 364
    .line 365
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    sget-object v1, Lp8/j;->a:Lp8/j;

    .line 370
    .line 371
    new-instance v24, Lc0/f;

    .line 372
    .line 373
    invoke-static {v12}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    const/4 v7, 0x0

    .line 378
    const/16 v8, 0x16

    .line 379
    .line 380
    const/4 v1, 0x1

    .line 381
    const-string v4, "isNormalMomentsPost"

    .line 382
    .line 383
    const-string v5, "isNormalMomentsPost(Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)Z"

    .line 384
    .line 385
    const/4 v6, 0x0

    .line 386
    move-object v11, v0

    .line 387
    move-object/from16 v0, v24

    .line 388
    .line 389
    invoke-direct/range {v0 .. v8}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 390
    .line 391
    .line 392
    new-instance v25, Lab/b;

    .line 393
    .line 394
    const-class v26, Lia/q;

    .line 395
    .line 396
    invoke-static/range {v26 .. v26}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    move-result-object v17

    .line 400
    const/16 v21, 0x0

    .line 401
    .line 402
    const/16 v22, 0x18

    .line 403
    .line 404
    move-object v1, v15

    .line 405
    const/4 v15, 0x2

    .line 406
    const-string v18, "showFakeLikes"

    .line 407
    .line 408
    const-string v19, "showFakeLikes(Landroid/app/Activity;Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)V"

    .line 409
    .line 410
    const/16 v20, 0x0

    .line 411
    .line 412
    move-object/from16 v16, v14

    .line 413
    .line 414
    move-object/from16 v14, v25

    .line 415
    .line 416
    invoke-direct/range {v14 .. v22}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v14, v16

    .line 420
    .line 421
    new-instance v16, Lp8/i;

    .line 422
    .line 423
    new-instance v3, Lia/r;

    .line 424
    .line 425
    invoke-direct {v3, v2, v11, v10}, Lia/r;-><init>(Lia/u;Landroid/content/SharedPreferences;I)V

    .line 426
    .line 427
    .line 428
    new-instance v4, Lia/s;

    .line 429
    .line 430
    invoke-direct {v4, v13, v11, v10}, Lia/s;-><init>(Lia/a0;Landroid/content/SharedPreferences;I)V

    .line 431
    .line 432
    .line 433
    const-string v17, "moments_fake_like"

    .line 434
    .line 435
    const v18, 0x4843464c    # 199961.19f

    .line 436
    .line 437
    .line 438
    const-string v19, "\u4f2a\u96c6\u8d5e[H]"

    .line 439
    .line 440
    const/16 v20, 0x14

    .line 441
    .line 442
    const-string v22, "icons_filled_like"

    .line 443
    .line 444
    move-object/from16 v21, v3

    .line 445
    .line 446
    move-object/from16 v23, v4

    .line 447
    .line 448
    invoke-direct/range {v16 .. v25}, Lp8/i;-><init>(Ljava/lang/String;ILjava/lang/String;ILfg/a;Ljava/lang/String;Lfg/a;Lfg/l;Lfg/p;)V

    .line 449
    .line 450
    .line 451
    move-object/from16 v0, v16

    .line 452
    .line 453
    move-object/from16 v3, v17

    .line 454
    .line 455
    sget-object v10, Lp8/j;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 456
    .line 457
    invoke-virtual {v10, v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    new-instance v0, Lc0/f;

    .line 461
    .line 462
    invoke-static {v12}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    const/16 v8, 0x17

    .line 467
    .line 468
    move-object v4, v1

    .line 469
    const/4 v1, 0x1

    .line 470
    move-object v5, v4

    .line 471
    const-string v4, "isNormalMomentsPost"

    .line 472
    .line 473
    move-object v6, v5

    .line 474
    const-string v5, "isNormalMomentsPost(Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)Z"

    .line 475
    .line 476
    move-object v12, v6

    .line 477
    const/4 v6, 0x0

    .line 478
    invoke-direct/range {v0 .. v8}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 479
    .line 480
    .line 481
    new-instance v24, Lab/b;

    .line 482
    .line 483
    invoke-static/range {v26 .. v26}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    move-result-object v17

    .line 487
    const/16 v21, 0x0

    .line 488
    .line 489
    const/16 v22, 0x19

    .line 490
    .line 491
    const-string v18, "showFakeComments"

    .line 492
    .line 493
    const-string v19, "showFakeComments(Landroid/app/Activity;Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)V"

    .line 494
    .line 495
    const/16 v20, 0x0

    .line 496
    .line 497
    move-object/from16 v16, v14

    .line 498
    .line 499
    move-object/from16 v14, v24

    .line 500
    .line 501
    invoke-direct/range {v14 .. v22}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 502
    .line 503
    .line 504
    new-instance v15, Lp8/i;

    .line 505
    .line 506
    new-instance v1, Lia/r;

    .line 507
    .line 508
    const/4 v3, 0x1

    .line 509
    invoke-direct {v1, v2, v11, v3}, Lia/r;-><init>(Lia/u;Landroid/content/SharedPreferences;I)V

    .line 510
    .line 511
    .line 512
    new-instance v4, Lia/s;

    .line 513
    .line 514
    invoke-direct {v4, v13, v11, v3}, Lia/s;-><init>(Lia/a0;Landroid/content/SharedPreferences;I)V

    .line 515
    .line 516
    .line 517
    const-string v16, "moments_fake_comment"

    .line 518
    .line 519
    const v17, 0x48434643    # 199961.05f

    .line 520
    .line 521
    .line 522
    const-string v18, "\u4f2a\u8bc4\u8bba[H]"

    .line 523
    .line 524
    const/16 v19, 0x1e

    .line 525
    .line 526
    const-string v21, "icons_filled_comment"

    .line 527
    .line 528
    move-object/from16 v23, v0

    .line 529
    .line 530
    move-object/from16 v20, v1

    .line 531
    .line 532
    move-object/from16 v22, v4

    .line 533
    .line 534
    invoke-direct/range {v15 .. v24}, Lp8/i;-><init>(Ljava/lang/String;ILjava/lang/String;ILfg/a;Ljava/lang/String;Lfg/a;Lfg/l;Lfg/p;)V

    .line 535
    .line 536
    .line 537
    move-object/from16 v0, v16

    .line 538
    .line 539
    invoke-virtual {v10, v0, v15}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    new-instance v0, Laa/c;

    .line 543
    .line 544
    const/16 v1, 0x12

    .line 545
    .line 546
    invoke-direct {v0, v2, v1, v9}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    const/16 v1, 0xc

    .line 550
    .line 551
    const-string v3, "moments_fake_interaction_sns_menu"

    .line 552
    .line 553
    const-string v4, "\u670b\u53cb\u5708\u4f2a\u4e92\u52a8"

    .line 554
    .line 555
    invoke-static {v1, v0, v3, v4, v12}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 556
    .line 557
    .line 558
    new-instance v0, Le9/a;

    .line 559
    .line 560
    const/4 v3, 0x1

    .line 561
    invoke-direct {v0, v2, v3, v9}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    const-class v1, Lf8/e;

    .line 565
    .line 566
    invoke-virtual {v2, v1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 567
    .line 568
    .line 569
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u670b\u53cb\u5708\u4f2a\u4e92\u52a8"

    .line 2
    .line 3
    return-object v0
.end method
