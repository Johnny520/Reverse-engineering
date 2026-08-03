.class public abstract Lc9/o2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc9/o2;->a:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static final a()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Lg8/a;->c()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-nez v1, :cond_1

    .line 18
    .line 19
    move-object v1, v0

    .line 20
    :cond_1
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_2

    .line 29
    :goto_1
    new-instance v2, Lsf/f;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object v1, v2

    .line 35
    :goto_2
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    move-object v0, v1

    .line 42
    goto :goto_3

    .line 43
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v3, "[Hchat:ConversationGroup] \u8bfb\u53d6\u5f53\u524d\u8d26\u53f7\u5931\u8d25: "

    .line 48
    .line 49
    invoke-static {v3, v1, v2}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    return-object v0
.end method

.method public static final b(Landroid/content/Context;Lc9/a;)Z
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v14, Lc9/o2;->a:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v14

    .line 14
    :try_start_0
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v15

    .line 18
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    :cond_0
    :goto_0
    const/4 v3, 0x0

    .line 25
    goto/16 :goto_9

    .line 26
    .line 27
    :cond_1
    invoke-static {v0, v15}, Lc9/o2;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v4, v1, Lc9/a;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    iget-object v5, v1, Lc9/a;->b:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget-object v6, v1, Lc9/a;->c:Ljava/lang/String;

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x1

    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-lez v9, :cond_2

    .line 72
    .line 73
    move v9, v8

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 v9, 0x0

    .line 76
    :goto_1
    if-eqz v9, :cond_3

    .line 77
    .line 78
    move-object v7, v6

    .line 79
    goto :goto_2

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto/16 :goto_a

    .line 82
    .line 83
    :cond_3
    :goto_2
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-nez v6, :cond_0

    .line 88
    .line 89
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-nez v6, :cond_0

    .line 94
    .line 95
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eqz v6, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eqz v9, :cond_6

    .line 111
    .line 112
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    check-cast v9, Lc9/a;

    .line 117
    .line 118
    iget-object v9, v9, Lc9/a;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v9, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eqz v9, :cond_5

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_6
    :goto_3
    if-eqz v7, :cond_9

    .line 128
    .line 129
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_7

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_7
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    :cond_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    if-eqz v9, :cond_0

    .line 145
    .line 146
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    check-cast v9, Lc9/a;

    .line 151
    .line 152
    iget-object v9, v9, Lc9/a;->a:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v9, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    if-eqz v9, :cond_8

    .line 159
    .line 160
    :cond_9
    iget-object v6, v1, Lc9/a;->e:Ljava/util/List;

    .line 161
    .line 162
    invoke-static {v6}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    sget-object v9, Lc9/l2;->n:Lc9/l2;

    .line 167
    .line 168
    invoke-static {v6, v9}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    sget-object v9, Lc9/m2;->n:Lc9/m2;

    .line 173
    .line 174
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v10, Lng/i;

    .line 178
    .line 179
    invoke-direct {v10, v6, v8, v9}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 180
    .line 181
    .line 182
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 183
    .line 184
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-static {v10, v6}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 188
    .line 189
    .line 190
    new-instance v8, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-eqz v9, :cond_e

    .line 208
    .line 209
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    check-cast v9, Lc9/a;

    .line 214
    .line 215
    iget-object v10, v9, Lc9/a;->e:Ljava/util/List;

    .line 216
    .line 217
    new-instance v11, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    :cond_a
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    if-eqz v12, :cond_b

    .line 231
    .line 232
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    move-object v13, v12

    .line 237
    check-cast v13, Ljava/lang/String;

    .line 238
    .line 239
    invoke-interface {v6, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v13

    .line 243
    if-nez v13, :cond_a

    .line 244
    .line 245
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_b
    iget-object v10, v9, Lc9/a;->f:Ljava/util/List;

    .line 250
    .line 251
    new-instance v12, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    :cond_c
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v13

    .line 264
    if-eqz v13, :cond_d

    .line 265
    .line 266
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    move-object v3, v13

    .line 271
    check-cast v3, Ljava/lang/String;

    .line 272
    .line 273
    invoke-interface {v6, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-nez v3, :cond_c

    .line 278
    .line 279
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_d
    const/16 v27, 0x0

    .line 284
    .line 285
    const/16 v28, 0xfcf

    .line 286
    .line 287
    const/16 v17, 0x0

    .line 288
    .line 289
    const/16 v18, 0x0

    .line 290
    .line 291
    const/16 v19, 0x0

    .line 292
    .line 293
    const/16 v20, 0x0

    .line 294
    .line 295
    const/16 v23, 0x0

    .line 296
    .line 297
    const/16 v24, 0x0

    .line 298
    .line 299
    const/16 v25, 0x0

    .line 300
    .line 301
    const/16 v26, 0x0

    .line 302
    .line 303
    move-object/from16 v16, v9

    .line 304
    .line 305
    move-object/from16 v21, v11

    .line 306
    .line 307
    move-object/from16 v22, v12

    .line 308
    .line 309
    invoke-static/range {v16 .. v28}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_e
    iget v2, v1, Lc9/a;->d:I

    .line 318
    .line 319
    if-gez v2, :cond_f

    .line 320
    .line 321
    const/4 v3, 0x0

    .line 322
    goto :goto_7

    .line 323
    :cond_f
    move v3, v2

    .line 324
    :goto_7
    invoke-static {v6}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    iget-object v9, v1, Lc9/a;->f:Ljava/util/List;

    .line 329
    .line 330
    move-object v10, v2

    .line 331
    move-object v2, v4

    .line 332
    move-object v4, v7

    .line 333
    new-instance v7, Ljava/util/ArrayList;

    .line 334
    .line 335
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    :cond_10
    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    if-eqz v11, :cond_11

    .line 347
    .line 348
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    move-object v12, v11

    .line 353
    check-cast v12, Ljava/lang/String;

    .line 354
    .line 355
    invoke-interface {v6, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v12

    .line 359
    if-eqz v12, :cond_10

    .line 360
    .line 361
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    goto :goto_8

    .line 365
    :cond_11
    const/4 v12, 0x0

    .line 366
    const/16 v13, 0xfc0

    .line 367
    .line 368
    move-object v6, v8

    .line 369
    const/4 v8, 0x0

    .line 370
    const/4 v9, 0x0

    .line 371
    move-object v11, v6

    .line 372
    move-object v6, v10

    .line 373
    const/4 v10, 0x0

    .line 374
    move-object/from16 v16, v11

    .line 375
    .line 376
    const/4 v11, 0x0

    .line 377
    move-object v0, v5

    .line 378
    move v5, v3

    .line 379
    move-object v3, v0

    .line 380
    move-object/from16 v0, v16

    .line 381
    .line 382
    invoke-static/range {v1 .. v13}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-static {v0, v1}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v0}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    move-object/from16 v1, p0

    .line 395
    .line 396
    invoke-static {v1, v15, v0}, Lc9/o2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z

    .line 397
    .line 398
    .line 399
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 400
    :goto_9
    monitor-exit v14

    .line 401
    return v3

    .line 402
    :goto_a
    monitor-exit v14

    .line 403
    throw v0
.end method

.method public static c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    return p2
.end method

.method public static final d(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-static {p1}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v2, v0

    .line 42
    check-cast v2, Lc9/a;

    .line 43
    .line 44
    iget-object v2, v2, Lc9/a;->e:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v2, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object v0, v1

    .line 54
    :goto_0
    check-cast v0, Lc9/a;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object p0, v0, Lc9/a;->a:Ljava/lang/String;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_3
    :goto_1
    return-object v1
.end method

.method public static final e(Landroid/content/Context;Ljava/util/Collection;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lc9/o2;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    invoke-static {p0, v1}, Lc9/o2;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast p1, Ljava/lang/Iterable;

    .line 28
    .line 29
    new-instance v4, Ldg/n;

    .line 30
    .line 31
    const/4 v5, 0x6

    .line 32
    invoke-direct {v4, p1, v5}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lc9/g2;->n:Lc9/g2;

    .line 36
    .line 37
    invoke-static {v4, p1}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v4, Lc9/h2;->n:Lc9/h2;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v5, Lng/i;

    .line 47
    .line 48
    const/4 v6, 0x1

    .line 49
    invoke-direct {v5, p1, v6, v4}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Lng/m;->c0(Lng/j;)Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v4, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_1

    .line 70
    .line 71
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Lc9/a;

    .line 76
    .line 77
    iget-object v6, v6, Lc9/a;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    goto :goto_3

    .line 85
    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    .line 86
    .line 87
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 88
    .line 89
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_3

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    move-object v7, v6

    .line 107
    check-cast v7, Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_2

    .line 114
    .line 115
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_4

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    invoke-static {v2, v5}, Lc9/o2;->o(Ljava/util/List;Ljava/util/LinkedHashSet;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p1}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p0, v1, p1}, Lc9/o2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z

    .line 135
    .line 136
    .line 137
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    :goto_2
    monitor-exit v0

    .line 139
    return v3

    .line 140
    :goto_3
    monitor-exit v0

    .line 141
    throw p0
.end method

.method public static final f(Ljava/lang/String;Ljava/util/List;)Ljava/util/Set;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {p1}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lc9/a;

    .line 48
    .line 49
    iget-object v1, v1, Lc9/a;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v1, Lgg/u;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-static {p0}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iput-object v2, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 72
    .line 73
    :goto_0
    iget-object v2, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Ljava/util/Collection;

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    new-instance v2, Ldg/n;

    .line 84
    .line 85
    const/4 v3, 0x6

    .line 86
    invoke-direct {v2, p1, v3}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    new-instance v3, Lc9/i;

    .line 90
    .line 91
    const/4 v4, 0x4

    .line 92
    invoke-direct {v3, v1, v4, v0}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v4, Lng/i;

    .line 96
    .line 97
    const/4 v5, 0x1

    .line 98
    invoke-direct {v4, v2, v5, v3}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 99
    .line 100
    .line 101
    new-instance v2, Lb4/b;

    .line 102
    .line 103
    const/4 v3, 0x6

    .line 104
    invoke-direct {v2, v3}, Lb4/b;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v4, v2}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 112
    .line 113
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-static {v2, v3}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 120
    .line 121
    .line 122
    iput-object v3, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_4
    :goto_1
    sget-object p0, Ltf/v;->g:Ltf/v;

    .line 130
    .line 131
    return-object p0
.end method

.method public static g(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 6

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lc9/a;

    .line 21
    .line 22
    new-instance v2, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "id"

    .line 28
    .line 29
    iget-object v4, v1, Lc9/a;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v3, "name"

    .line 35
    .line 36
    iget-object v4, v1, Lc9/a;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    iget-object v3, v1, Lc9/a;->c:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    sget-object v3, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 47
    .line 48
    :goto_1
    const-string v4, "parentId"

    .line 49
    .line 50
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    const-string v3, "order"

    .line 54
    .line 55
    iget v4, v1, Lc9/a;->d:I

    .line 56
    .line 57
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    new-instance v3, Lorg/json/JSONArray;

    .line 61
    .line 62
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object v4, v1, Lc9/a;->e:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_1

    .line 76
    .line 77
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_1
    const-string v4, "conversationIds"

    .line 88
    .line 89
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    new-instance v3, Lorg/json/JSONArray;

    .line 93
    .line 94
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 95
    .line 96
    .line 97
    iget-object v4, v1, Lc9/a;->f:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_2

    .line 108
    .line 109
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    check-cast v5, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_2
    const-string v4, "pinnedConversationIds"

    .line 120
    .line 121
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    const-string v3, "pinned"

    .line 125
    .line 126
    iget-boolean v4, v1, Lc9/a;->g:Z

    .line 127
    .line 128
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    const-string v3, "avatarPath"

    .line 132
    .line 133
    iget-object v4, v1, Lc9/a;->h:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    const-string v3, "showUnreadCount"

    .line 139
    .line 140
    iget-boolean v4, v1, Lc9/a;->i:Z

    .line 141
    .line 142
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 143
    .line 144
    .line 145
    const-string v3, "previewLatestMessage"

    .line 146
    .line 147
    iget-boolean v4, v1, Lc9/a;->j:Z

    .line 148
    .line 149
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 150
    .line 151
    .line 152
    const-string v3, "roundAvatar"

    .line 153
    .line 154
    iget-boolean v4, v1, Lc9/a;->k:Z

    .line 155
    .line 156
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 157
    .line 158
    .line 159
    const-string v3, "showEmpty"

    .line 160
    .line 161
    iget-boolean v1, v1, Lc9/a;->l:Z

    .line 162
    .line 163
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_3
    return-object v0
.end method

.method public static final h(Landroid/content/Context;Ljava/lang/String;)Lc9/f2;
    .locals 6

    .line 1
    const-string v0, "[Hchat:ConversationGroup] \u6821\u9a8c\u804a\u5929\u5206\u7ec4\u5bfc\u5165\u6587\u4ef6\u5931\u8d25: "

    .line 2
    .line 3
    const-string v1, "\u5df2\u5bfc\u5165 "

    .line 4
    .line 5
    sget-object v2, Lc9/o2;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    new-instance p0, Lc9/f2;

    .line 20
    .line 21
    const-string p1, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u5c1a\u672a\u5c31\u7eea"

    .line 22
    .line 23
    invoke-direct {p0, p1, v5, v5}, Lc9/f2;-><init>(Ljava/lang/String;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    :try_start_1
    invoke-static {p1}, Lc9/o2;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception p1

    .line 35
    :try_start_2
    new-instance v4, Lsf/f;

    .line 36
    .line 37
    invoke-direct {v4, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object p1, v4

    .line 41
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-nez v4, :cond_2

    .line 46
    .line 47
    check-cast p1, Ljava/util/List;

    .line 48
    .line 49
    invoke-static {p0, v3, p1}, Lc9/o2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    new-instance p0, Lc9/f2;

    .line 56
    .line 57
    const-string p1, "\u4fdd\u5b58\u804a\u5929\u5206\u7ec4\u5931\u8d25"

    .line 58
    .line 59
    invoke-direct {p0, p1, v5, v5}, Lc9/f2;-><init>(Ljava/lang/String;IZ)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    new-instance p0, Lc9/f2;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    new-instance v3, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p1, " \u4e2a\u5206\u7ec4"

    .line 82
    .line 83
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const/4 v1, 0x1

    .line 91
    invoke-direct {p0, p1, v0, v1}, Lc9/f2;-><init>(Ljava/lang/String;IZ)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    new-instance p1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0, v4}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    new-instance p0, Lc9/f2;

    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_3

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    const-string p1, "\u5bfc\u5165\u6587\u4ef6\u683c\u5f0f\u9519\u8bef"

    .line 124
    .line 125
    :goto_1
    invoke-direct {p0, p1, v5, v5}, Lc9/f2;-><init>(Ljava/lang/String;IZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    .line 127
    .line 128
    :goto_2
    monitor-exit v2

    .line 129
    return-object p0

    .line 130
    :goto_3
    monitor-exit v2

    .line 131
    throw p0
.end method

.method public static final i(Landroid/content/Context;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lc9/o2;->a:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {p0, v1}, Lc9/o2;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :goto_0
    monitor-exit v0

    .line 27
    return-object p0

    .line 28
    :goto_1
    monitor-exit v0

    .line 29
    throw p0
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;
    .locals 9

    .line 1
    const-string v0, "accounts"

    .line 2
    .line 3
    const-string v1, "[Hchat:ConversationGroup] \u4fdd\u5b58\u8d26\u53f7 "

    .line 4
    .line 5
    const-string v2, "Hchat_conversation_groups"

    .line 6
    .line 7
    invoke-static {p0, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v2, "groups_v1"

    .line 12
    .line 13
    const-string v3, ""

    .line 14
    .line 15
    invoke-interface {p0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v3, v4

    .line 23
    :goto_0
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    return-object v5

    .line 32
    :cond_1
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 33
    .line 34
    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v3, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-static {v6}, Lc9/o2;->m(Lorg/json/JSONArray;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-static {v6}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-nez v6, :cond_3

    .line 60
    .line 61
    invoke-static {v7}, Lc9/o2;->g(Ljava/util/List;)Lorg/json/JSONArray;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v3, p1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    const-string v6, "schemaVersion"

    .line 69
    .line 70
    const/4 v8, 0x1

    .line 71
    invoke-virtual {v4, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {p0, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-nez p0, :cond_3

    .line 94
    .line 95
    new-instance p0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v0, " \u7684\u4fee\u590d\u7ed3\u679c\u5931\u8d25"

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    goto :goto_1

    .line 118
    :cond_2
    move-object v7, v5

    .line 119
    goto :goto_2

    .line 120
    :goto_1
    new-instance v7, Lsf/f;

    .line 121
    .line 122
    invoke-direct {v7, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    :cond_3
    :goto_2
    invoke-static {v7}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    if-nez p0, :cond_4

    .line 130
    .line 131
    move-object v5, v7

    .line 132
    goto :goto_3

    .line 133
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    const-string v1, "[Hchat:ConversationGroup] \u8bfb\u53d6\u8d26\u53f7 "

    .line 138
    .line 139
    const-string v2, " \u7684\u804a\u5929\u5206\u7ec4\u5931\u8d25: "

    .line 140
    .line 141
    invoke-static {v1, p1, v2, v0, p0}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    :goto_3
    check-cast v5, Ljava/util/List;

    .line 145
    .line 146
    return-object v5
.end method

.method public static final k(Ljava/lang/String;)Lc9/a;
    .locals 14

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-lez v1, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    move-object v0, p0

    .line 45
    :cond_1
    move-object v4, v0

    .line 46
    new-instance v1, Lc9/a;

    .line 47
    .line 48
    const/4 v12, 0x1

    .line 49
    const/4 v13, 0x0

    .line 50
    const-string v3, ""

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const-string v9, ""

    .line 57
    .line 58
    const/4 v10, 0x1

    .line 59
    const/4 v11, 0x1

    .line 60
    move-object v7, v6

    .line 61
    invoke-direct/range {v1 .. v13}, Lc9/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZZ)V

    .line 62
    .line 63
    .line 64
    return-object v1
.end method

.method public static final l(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 26

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v2, :cond_6

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v6, v2

    .line 27
    check-cast v6, Lc9/a;

    .line 28
    .line 29
    iget-object v2, v6, Lc9/a;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    iget-object v2, v6, Lc9/a;->b:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_0

    .line 54
    .line 55
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object v2, v6, Lc9/a;->e:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {v2}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    sget-object v9, Lc9/i2;->n:Lc9/i2;

    .line 69
    .line 70
    invoke-static {v2, v9}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    sget-object v9, Lc9/j2;->n:Lc9/j2;

    .line 75
    .line 76
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v10, Lng/i;

    .line 80
    .line 81
    invoke-direct {v10, v2, v3, v9}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v10}, Lng/m;->S(Lng/j;)Lng/c;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v2}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    iget-object v2, v6, Lc9/a;->f:Ljava/util/List;

    .line 93
    .line 94
    invoke-static {v2}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    sget-object v9, Lc9/k2;->n:Lc9/k2;

    .line 99
    .line 100
    invoke-static {v2, v9}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    new-instance v9, Lb0/d0;

    .line 105
    .line 106
    const/4 v10, 0x4

    .line 107
    invoke-direct {v9, v11, v10}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 108
    .line 109
    .line 110
    new-instance v10, Lng/i;

    .line 111
    .line 112
    invoke-direct {v10, v2, v3, v9}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v10}, Lng/m;->S(Lng/j;)Lng/c;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v2}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    invoke-virtual {v0, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    move-object v13, v2

    .line 128
    check-cast v13, Lc9/a;

    .line 129
    .line 130
    if-nez v13, :cond_5

    .line 131
    .line 132
    iget-object v2, v6, Lc9/a;->c:Ljava/lang/String;

    .line 133
    .line 134
    if-eqz v2, :cond_3

    .line 135
    .line 136
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    if-eqz v2, :cond_3

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-lez v9, :cond_2

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    move v3, v5

    .line 154
    :goto_1
    if-eqz v3, :cond_3

    .line 155
    .line 156
    move-object v4, v2

    .line 157
    :cond_3
    move-object v9, v4

    .line 158
    iget v2, v6, Lc9/a;->d:I

    .line 159
    .line 160
    if-gez v2, :cond_4

    .line 161
    .line 162
    move v10, v5

    .line 163
    goto :goto_2

    .line 164
    :cond_4
    move v10, v2

    .line 165
    :goto_2
    iget-object v2, v6, Lc9/a;->h:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v14

    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    const/16 v18, 0xf40

    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    const/4 v15, 0x0

    .line 181
    const/16 v16, 0x0

    .line 182
    .line 183
    invoke-static/range {v6 .. v18}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-interface {v0, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_5
    iget-object v2, v13, Lc9/a;->e:Ljava/util/List;

    .line 193
    .line 194
    invoke-static {v2, v11}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {v2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-static {v2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v18

    .line 206
    iget-object v2, v13, Lc9/a;->f:Ljava/util/List;

    .line 207
    .line 208
    invoke-static {v2, v12}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-static {v2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-static {v2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v19

    .line 220
    const/16 v24, 0x0

    .line 221
    .line 222
    const/16 v25, 0xfcf

    .line 223
    .line 224
    const/4 v14, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    const/16 v16, 0x0

    .line 227
    .line 228
    const/16 v17, 0x0

    .line 229
    .line 230
    const/16 v20, 0x0

    .line 231
    .line 232
    const/16 v21, 0x0

    .line 233
    .line 234
    const/16 v22, 0x0

    .line 235
    .line 236
    const/16 v23, 0x0

    .line 237
    .line 238
    invoke-static/range {v13 .. v25}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-interface {v0, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_6
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    check-cast v1, Ljava/util/Set;

    .line 255
    .line 256
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 257
    .line 258
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    check-cast v6, Ljava/lang/Iterable;

    .line 266
    .line 267
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    if-eqz v7, :cond_9

    .line 276
    .line 277
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    check-cast v7, Ljava/util/Map$Entry;

    .line 282
    .line 283
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    check-cast v9, Ljava/lang/String;

    .line 292
    .line 293
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    check-cast v7, Lc9/a;

    .line 298
    .line 299
    iget-object v7, v7, Lc9/a;->c:Ljava/lang/String;

    .line 300
    .line 301
    if-eqz v7, :cond_8

    .line 302
    .line 303
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    if-nez v9, :cond_7

    .line 308
    .line 309
    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v9

    .line 313
    if-eqz v9, :cond_7

    .line 314
    .line 315
    move v9, v3

    .line 316
    goto :goto_4

    .line 317
    :cond_7
    move v9, v5

    .line 318
    :goto_4
    if-eqz v9, :cond_8

    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_8
    move-object v7, v4

    .line 322
    :goto_5
    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_9
    new-instance v1, Ljava/util/HashMap;

    .line 327
    .line 328
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    check-cast v3, Ljava/lang/Iterable;

    .line 336
    .line 337
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    if-eqz v6, :cond_a

    .line 346
    .line 347
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    check-cast v6, Ljava/lang/String;

    .line 352
    .line 353
    invoke-static {v1, v2, v6}, Lc9/o2;->q(Ljava/util/HashMap;Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_a
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    check-cast v0, Ljava/lang/Iterable;

    .line 365
    .line 366
    new-instance v1, Ljava/util/ArrayList;

    .line 367
    .line 368
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 373
    .line 374
    .line 375
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-eqz v3, :cond_b

    .line 384
    .line 385
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    move-object v6, v3

    .line 390
    check-cast v6, Lc9/a;

    .line 391
    .line 392
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    iget-object v3, v6, Lc9/a;->a:Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    move-object v9, v3

    .line 402
    check-cast v9, Ljava/lang/String;

    .line 403
    .line 404
    const/16 v17, 0x0

    .line 405
    .line 406
    const/16 v18, 0xffb

    .line 407
    .line 408
    const/4 v7, 0x0

    .line 409
    const/4 v8, 0x0

    .line 410
    const/4 v10, 0x0

    .line 411
    const/4 v11, 0x0

    .line 412
    const/4 v12, 0x0

    .line 413
    const/4 v13, 0x0

    .line 414
    const/4 v14, 0x0

    .line 415
    const/4 v15, 0x0

    .line 416
    const/16 v16, 0x0

    .line 417
    .line 418
    invoke-static/range {v6 .. v18}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_b
    new-instance v0, Ljava/util/HashMap;

    .line 427
    .line 428
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 429
    .line 430
    .line 431
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 432
    .line 433
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 434
    .line 435
    .line 436
    new-instance v3, Lng/d;

    .line 437
    .line 438
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    invoke-direct {v3, v6}, Lng/d;-><init>(Ljava/util/Iterator;)V

    .line 443
    .line 444
    .line 445
    :goto_8
    iget-object v6, v3, Lng/d;->i:Ljava/util/Iterator;

    .line 446
    .line 447
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v6

    .line 451
    if-eqz v6, :cond_d

    .line 452
    .line 453
    invoke-virtual {v3}, Lng/d;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    move-object v7, v6

    .line 458
    check-cast v7, Ltf/w;

    .line 459
    .line 460
    iget-object v7, v7, Ltf/w;->b:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v7, Lc9/a;

    .line 463
    .line 464
    iget-object v7, v7, Lc9/a;->c:Ljava/lang/String;

    .line 465
    .line 466
    invoke-virtual {v2, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    if-nez v8, :cond_c

    .line 471
    .line 472
    new-instance v8, Ljava/util/ArrayList;

    .line 473
    .line 474
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 475
    .line 476
    .line 477
    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    :cond_c
    check-cast v8, Ljava/util/List;

    .line 481
    .line 482
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_d
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    check-cast v2, Ljava/lang/Iterable;

    .line 491
    .line 492
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    if-eqz v3, :cond_10

    .line 501
    .line 502
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    check-cast v3, Ljava/util/List;

    .line 507
    .line 508
    new-instance v6, Lc9/h1;

    .line 509
    .line 510
    const/4 v7, 0x2

    .line 511
    invoke-direct {v6, v7}, Lc9/h1;-><init>(I)V

    .line 512
    .line 513
    .line 514
    new-instance v7, Lc9/a0;

    .line 515
    .line 516
    const/4 v8, 0x1

    .line 517
    invoke-direct {v7, v6, v8}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 518
    .line 519
    .line 520
    invoke-static {v3, v7}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    move v6, v5

    .line 529
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 530
    .line 531
    .line 532
    move-result v7

    .line 533
    if-eqz v7, :cond_e

    .line 534
    .line 535
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    add-int/lit8 v8, v6, 0x1

    .line 540
    .line 541
    if-ltz v6, :cond_f

    .line 542
    .line 543
    check-cast v7, Ltf/w;

    .line 544
    .line 545
    iget-object v7, v7, Ltf/w;->b:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v7, Lc9/a;

    .line 548
    .line 549
    iget-object v7, v7, Lc9/a;->a:Ljava/lang/String;

    .line 550
    .line 551
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    invoke-virtual {v0, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move v6, v8

    .line 559
    goto :goto_9

    .line 560
    :cond_f
    invoke-static {}, La/a;->Q0()V

    .line 561
    .line 562
    .line 563
    throw v4

    .line 564
    :cond_10
    new-instance v2, Ljava/util/ArrayList;

    .line 565
    .line 566
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    if-eqz v3, :cond_12

    .line 582
    .line 583
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    move-object v6, v3

    .line 588
    check-cast v6, Lc9/a;

    .line 589
    .line 590
    iget-object v3, v6, Lc9/a;->a:Ljava/lang/String;

    .line 591
    .line 592
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    check-cast v3, Ljava/lang/Integer;

    .line 597
    .line 598
    if-eqz v3, :cond_11

    .line 599
    .line 600
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 601
    .line 602
    .line 603
    move-result v3

    .line 604
    move v10, v3

    .line 605
    goto :goto_b

    .line 606
    :cond_11
    move v10, v5

    .line 607
    :goto_b
    const/16 v17, 0x0

    .line 608
    .line 609
    const/16 v18, 0xff7

    .line 610
    .line 611
    const/4 v7, 0x0

    .line 612
    const/4 v8, 0x0

    .line 613
    const/4 v9, 0x0

    .line 614
    const/4 v11, 0x0

    .line 615
    const/4 v12, 0x0

    .line 616
    const/4 v13, 0x0

    .line 617
    const/4 v14, 0x0

    .line 618
    const/4 v15, 0x0

    .line 619
    const/16 v16, 0x0

    .line 620
    .line 621
    invoke-static/range {v6 .. v18}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    goto :goto_a

    .line 629
    :cond_12
    new-instance v0, Ljava/util/HashMap;

    .line 630
    .line 631
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    :cond_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 639
    .line 640
    .line 641
    move-result v3

    .line 642
    if-eqz v3, :cond_14

    .line 643
    .line 644
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    check-cast v3, Lc9/a;

    .line 649
    .line 650
    iget-object v4, v3, Lc9/a;->e:Ljava/util/List;

    .line 651
    .line 652
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 653
    .line 654
    .line 655
    move-result-object v4

    .line 656
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 657
    .line 658
    .line 659
    move-result v5

    .line 660
    if-eqz v5, :cond_13

    .line 661
    .line 662
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v5

    .line 666
    check-cast v5, Ljava/lang/String;

    .line 667
    .line 668
    iget-object v6, v3, Lc9/a;->a:Ljava/lang/String;

    .line 669
    .line 670
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    goto :goto_c

    .line 674
    :cond_14
    new-instance v1, Ljava/util/ArrayList;

    .line 675
    .line 676
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 677
    .line 678
    .line 679
    move-result v3

    .line 680
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    if-eqz v3, :cond_19

    .line 692
    .line 693
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    move-object v4, v3

    .line 698
    check-cast v4, Lc9/a;

    .line 699
    .line 700
    iget-object v3, v4, Lc9/a;->e:Ljava/util/List;

    .line 701
    .line 702
    new-instance v9, Ljava/util/ArrayList;

    .line 703
    .line 704
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 705
    .line 706
    .line 707
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    :cond_15
    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 712
    .line 713
    .line 714
    move-result v5

    .line 715
    if-eqz v5, :cond_16

    .line 716
    .line 717
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v5

    .line 721
    move-object v6, v5

    .line 722
    check-cast v6, Ljava/lang/String;

    .line 723
    .line 724
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v6

    .line 728
    iget-object v7, v4, Lc9/a;->a:Ljava/lang/String;

    .line 729
    .line 730
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v6

    .line 734
    if-eqz v6, :cond_15

    .line 735
    .line 736
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    goto :goto_e

    .line 740
    :cond_16
    iget-object v3, v4, Lc9/a;->f:Ljava/util/List;

    .line 741
    .line 742
    new-instance v10, Ljava/util/ArrayList;

    .line 743
    .line 744
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 745
    .line 746
    .line 747
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    :cond_17
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 752
    .line 753
    .line 754
    move-result v5

    .line 755
    if-eqz v5, :cond_18

    .line 756
    .line 757
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v5

    .line 761
    move-object v6, v5

    .line 762
    check-cast v6, Ljava/lang/String;

    .line 763
    .line 764
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v6

    .line 768
    if-eqz v6, :cond_17

    .line 769
    .line 770
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    goto :goto_f

    .line 774
    :cond_18
    const/4 v15, 0x0

    .line 775
    const/16 v16, 0xfcf

    .line 776
    .line 777
    const/4 v5, 0x0

    .line 778
    const/4 v6, 0x0

    .line 779
    const/4 v7, 0x0

    .line 780
    const/4 v8, 0x0

    .line 781
    const/4 v11, 0x0

    .line 782
    const/4 v12, 0x0

    .line 783
    const/4 v13, 0x0

    .line 784
    const/4 v14, 0x0

    .line 785
    invoke-static/range {v4 .. v16}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 786
    .line 787
    .line 788
    move-result-object v3

    .line 789
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    goto :goto_d

    .line 793
    :cond_19
    return-object v1
.end method

.method public static m(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-static {}, La/a;->E()Luf/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-lt v4, v2, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, La/a;->t(Luf/c;)Luf/c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_1
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    if-eqz v5, :cond_d

    .line 30
    .line 31
    invoke-static {}, La/a;->E()Luf/c;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-string v7, "conversationIds"

    .line 36
    .line 37
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    new-instance v7, Lorg/json/JSONArray;

    .line 45
    .line 46
    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    move v9, v3

    .line 54
    :goto_2
    const/4 v10, 0x0

    .line 55
    if-lt v9, v8, :cond_a

    .line 56
    .line 57
    invoke-static {v6}, La/a;->t(Luf/c;)Luf/c;

    .line 58
    .line 59
    .line 60
    move-result-object v16

    .line 61
    invoke-static {}, La/a;->E()Luf/c;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    const-string v6, "pinnedConversationIds"

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    if-eqz v6, :cond_3

    .line 72
    .line 73
    :goto_3
    move-object v12, v6

    .line 74
    goto :goto_4

    .line 75
    :cond_3
    new-instance v6, Lorg/json/JSONArray;

    .line 76
    .line 77
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :goto_4
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    move v6, v3

    .line 86
    :goto_5
    if-lt v6, v13, :cond_7

    .line 87
    .line 88
    invoke-static {v11}, La/a;->t(Luf/c;)Luf/c;

    .line 89
    .line 90
    .line 91
    move-result-object v17

    .line 92
    const-string v6, "id"

    .line 93
    .line 94
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const-string v6, "name"

    .line 102
    .line 103
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const-string v6, "parentId"

    .line 111
    .line 112
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-nez v7, :cond_4

    .line 121
    .line 122
    move-object v14, v6

    .line 123
    goto :goto_6

    .line 124
    :cond_4
    move-object v14, v10

    .line 125
    :goto_6
    const-string v6, "order"

    .line 126
    .line 127
    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 128
    .line 129
    .line 130
    move-result v15

    .line 131
    const-string v6, "pinned"

    .line 132
    .line 133
    invoke-static {v5, v6, v3}, Lc9/o2;->c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 134
    .line 135
    .line 136
    move-result v18

    .line 137
    const-string v6, "avatarPath"

    .line 138
    .line 139
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    instance-of v7, v6, Ljava/lang/String;

    .line 144
    .line 145
    if-eqz v7, :cond_5

    .line 146
    .line 147
    move-object v10, v6

    .line 148
    check-cast v10, Ljava/lang/String;

    .line 149
    .line 150
    :cond_5
    if-eqz v10, :cond_6

    .line 151
    .line 152
    invoke-static {v10}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    if-eqz v6, :cond_6

    .line 161
    .line 162
    :goto_7
    move-object/from16 v19, v6

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_6
    const-string v6, ""

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :goto_8
    const-string v6, "showUnreadCount"

    .line 169
    .line 170
    const/4 v7, 0x1

    .line 171
    invoke-static {v5, v6, v7}, Lc9/o2;->c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 172
    .line 173
    .line 174
    move-result v20

    .line 175
    const-string v6, "previewLatestMessage"

    .line 176
    .line 177
    invoke-static {v5, v6, v7}, Lc9/o2;->c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 178
    .line 179
    .line 180
    move-result v21

    .line 181
    const-string v6, "roundAvatar"

    .line 182
    .line 183
    invoke-static {v5, v6, v7}, Lc9/o2;->c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 184
    .line 185
    .line 186
    move-result v22

    .line 187
    const-string v6, "showEmpty"

    .line 188
    .line 189
    invoke-static {v5, v6, v3}, Lc9/o2;->c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 190
    .line 191
    .line 192
    move-result v23

    .line 193
    new-instance v11, Lc9/a;

    .line 194
    .line 195
    invoke-direct/range {v11 .. v23}, Lc9/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZZ)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v11}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_a

    .line 202
    :cond_7
    invoke-virtual {v12, v6}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    if-nez v8, :cond_8

    .line 211
    .line 212
    goto :goto_9

    .line 213
    :cond_8
    move-object v7, v10

    .line 214
    :goto_9
    if-eqz v7, :cond_9

    .line 215
    .line 216
    invoke-virtual {v11, v7}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 220
    .line 221
    goto/16 :goto_5

    .line 222
    .line 223
    :cond_a
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result v12

    .line 231
    if-nez v12, :cond_b

    .line 232
    .line 233
    move-object v10, v11

    .line 234
    :cond_b
    if-eqz v10, :cond_c

    .line 235
    .line 236
    invoke-virtual {v6, v10}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    :cond_c
    add-int/lit8 v9, v9, 0x1

    .line 240
    .line 241
    goto/16 :goto_2

    .line 242
    .line 243
    :cond_d
    :goto_a
    add-int/lit8 v4, v4, 0x1

    .line 244
    .line 245
    goto/16 :goto_0
.end method

.method public static n(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 31

    .line 1
    invoke-static/range {p0 .. p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2e

    .line 6
    .line 7
    new-instance v0, Lorg/json/JSONObject;

    .line 8
    .line 9
    move-object/from16 v1, p0

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "format"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "HchatConversationGroups"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2d

    .line 27
    .line 28
    const-string v1, "schema"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    instance-of v3, v3, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v3, :cond_2d

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2d

    .line 47
    .line 48
    const-string v1, "version"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    instance-of v2, v2, Ljava/lang/Number;

    .line 55
    .line 56
    if-eqz v2, :cond_2c

    .line 57
    .line 58
    const/4 v2, -0x1

    .line 59
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const/4 v2, 0x1

    .line 64
    if-ne v1, v2, :cond_2c

    .line 65
    .line 66
    const-string v1, "groups"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_2b

    .line 73
    .line 74
    new-instance v1, Ljava/util/HashSet;

    .line 75
    .line 76
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {}, La/a;->E()Luf/c;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    const/4 v5, 0x0

    .line 88
    move v6, v5

    .line 89
    :goto_0
    const-string v7, "\u5206\u7ec4 "

    .line 90
    .line 91
    if-lt v6, v4, :cond_3

    .line 92
    .line 93
    invoke-static {v3}, La/a;->t(Luf/c;)Luf/c;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0, v5}, Luf/c;->listIterator(I)Ljava/util/ListIterator;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    :cond_0
    :goto_1
    move-object v3, v2

    .line 102
    check-cast v3, Luf/a;

    .line 103
    .line 104
    invoke-virtual {v3}, Luf/a;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_2

    .line 109
    .line 110
    invoke-virtual {v3}, Luf/a;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Lc9/a;

    .line 115
    .line 116
    iget-object v4, v3, Lc9/a;->c:Ljava/lang/String;

    .line 117
    .line 118
    if-eqz v4, :cond_0

    .line 119
    .line 120
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    iget-object v0, v3, Lc9/a;->b:Ljava/lang/String;

    .line 128
    .line 129
    const-string v1, " \u7684\u4e0a\u7ea7\u5206\u7ec4\u4e0d\u5b58\u5728"

    .line 130
    .line 131
    invoke-static {v7, v0, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :goto_2
    const/4 v0, 0x0

    .line 139
    return-object v0

    .line 140
    :cond_2
    invoke-static {v0}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    return-object v0

    .line 145
    :cond_3
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    const-string v9, "\u7b2c "

    .line 150
    .line 151
    if-eqz v8, :cond_2a

    .line 152
    .line 153
    const-string v10, "id"

    .line 154
    .line 155
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    instance-of v11, v11, Ljava/lang/String;

    .line 160
    .line 161
    if-eqz v11, :cond_29

    .line 162
    .line 163
    const-string v11, "name"

    .line 164
    .line 165
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v12

    .line 169
    instance-of v12, v12, Ljava/lang/String;

    .line 170
    .line 171
    if-eqz v12, :cond_29

    .line 172
    .line 173
    invoke-static {v10, v8}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    invoke-static {v11, v8}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v15

    .line 181
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    if-nez v10, :cond_28

    .line 186
    .line 187
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-nez v10, :cond_27

    .line 192
    .line 193
    invoke-virtual {v1, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-eqz v9, :cond_26

    .line 198
    .line 199
    const-string v9, "parentId"

    .line 200
    .line 201
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_4

    .line 206
    .line 207
    const/16 v16, 0x0

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_4
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    instance-of v10, v10, Ljava/lang/String;

    .line 215
    .line 216
    if-eqz v10, :cond_25

    .line 217
    .line 218
    invoke-static {v9, v8}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    if-lez v10, :cond_5

    .line 227
    .line 228
    move v10, v2

    .line 229
    goto :goto_3

    .line 230
    :cond_5
    move v10, v5

    .line 231
    :goto_3
    if-eqz v10, :cond_6

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_6
    const/4 v9, 0x0

    .line 235
    :goto_4
    move-object/from16 v16, v9

    .line 236
    .line 237
    :goto_5
    const-string v9, "conversationIds"

    .line 238
    .line 239
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    if-eqz v9, :cond_24

    .line 244
    .line 245
    const-string v10, "pinnedConversationIds"

    .line 246
    .line 247
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result v12

    .line 251
    if-eqz v12, :cond_8

    .line 252
    .line 253
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    instance-of v12, v10, Lorg/json/JSONArray;

    .line 258
    .line 259
    if-eqz v12, :cond_7

    .line 260
    .line 261
    check-cast v10, Lorg/json/JSONArray;

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_7
    const-string v0, " \u7684\u7f6e\u9876\u4f1a\u8bdd\u5217\u8868\u683c\u5f0f\u9519\u8bef"

    .line 265
    .line 266
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_2

    .line 274
    .line 275
    :cond_8
    new-instance v10, Lorg/json/JSONArray;

    .line 276
    .line 277
    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    .line 278
    .line 279
    .line 280
    :goto_6
    const-string v12, "order"

    .line 281
    .line 282
    invoke-virtual {v8, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 283
    .line 284
    .line 285
    move-result v13

    .line 286
    if-eqz v13, :cond_a

    .line 287
    .line 288
    invoke-virtual {v8, v12}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v13

    .line 292
    instance-of v13, v13, Ljava/lang/Number;

    .line 293
    .line 294
    if-eqz v13, :cond_9

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_9
    const-string v0, " \u7684\u6392\u5e8f\u5b57\u6bb5\u683c\u5f0f\u9519\u8bef"

    .line 298
    .line 299
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_2

    .line 307
    .line 308
    :cond_a
    :goto_7
    const-string v13, "pinned"

    .line 309
    .line 310
    invoke-virtual {v8, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 311
    .line 312
    .line 313
    move-result v17

    .line 314
    if-eqz v17, :cond_c

    .line 315
    .line 316
    invoke-virtual {v8, v13}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v11

    .line 320
    instance-of v11, v11, Ljava/lang/Boolean;

    .line 321
    .line 322
    if-eqz v11, :cond_b

    .line 323
    .line 324
    goto :goto_8

    .line 325
    :cond_b
    const-string v0, " \u7684\u4e3b\u9875\u7f6e\u9876\u5b57\u6bb5\u683c\u5f0f\u9519\u8bef"

    .line 326
    .line 327
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    goto/16 :goto_2

    .line 335
    .line 336
    :cond_c
    :goto_8
    const-string v11, "avatarPath"

    .line 337
    .line 338
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 339
    .line 340
    .line 341
    move-result v17

    .line 342
    if-eqz v17, :cond_e

    .line 343
    .line 344
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    instance-of v2, v2, Ljava/lang/String;

    .line 349
    .line 350
    if-eqz v2, :cond_d

    .line 351
    .line 352
    goto :goto_9

    .line 353
    :cond_d
    const-string v0, " \u7684\u5934\u50cf\u8def\u5f84\u5b57\u6bb5\u683c\u5f0f\u9519\u8bef"

    .line 354
    .line 355
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    goto/16 :goto_2

    .line 363
    .line 364
    :cond_e
    :goto_9
    const-string v2, "showUnreadCount"

    .line 365
    .line 366
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 367
    .line 368
    .line 369
    move-result v17

    .line 370
    if-eqz v17, :cond_10

    .line 371
    .line 372
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    instance-of v5, v5, Ljava/lang/Boolean;

    .line 377
    .line 378
    if-eqz v5, :cond_f

    .line 379
    .line 380
    goto :goto_a

    .line 381
    :cond_f
    const-string v0, " \u7684\u672a\u8bfb\u6570\u5b57\u5b57\u6bb5\u683c\u5f0f\u9519\u8bef"

    .line 382
    .line 383
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_2

    .line 391
    .line 392
    :cond_10
    :goto_a
    const-string v5, "previewLatestMessage"

    .line 393
    .line 394
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 395
    .line 396
    .line 397
    move-result v17

    .line 398
    move-object/from16 v28, v0

    .line 399
    .line 400
    if-eqz v17, :cond_12

    .line 401
    .line 402
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    instance-of v0, v0, Ljava/lang/Boolean;

    .line 407
    .line 408
    if-eqz v0, :cond_11

    .line 409
    .line 410
    goto :goto_b

    .line 411
    :cond_11
    const-string v0, " \u7684\u6700\u65b0\u6d88\u606f\u9884\u89c8\u5b57\u6bb5\u683c\u5f0f\u9519\u8bef"

    .line 412
    .line 413
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    goto/16 :goto_2

    .line 421
    .line 422
    :cond_12
    :goto_b
    const-string v0, "roundAvatar"

    .line 423
    .line 424
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 425
    .line 426
    .line 427
    move-result v17

    .line 428
    move-object/from16 v29, v1

    .line 429
    .line 430
    if-eqz v17, :cond_14

    .line 431
    .line 432
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    instance-of v1, v1, Ljava/lang/Boolean;

    .line 437
    .line 438
    if-eqz v1, :cond_13

    .line 439
    .line 440
    goto :goto_c

    .line 441
    :cond_13
    const-string v0, " \u7684\u5706\u5f62\u5934\u50cf\u5b57\u6bb5\u683c\u5f0f\u9519\u8bef"

    .line 442
    .line 443
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_2

    .line 451
    .line 452
    :cond_14
    :goto_c
    const-string v1, "showEmpty"

    .line 453
    .line 454
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 455
    .line 456
    .line 457
    move-result v17

    .line 458
    move/from16 v30, v4

    .line 459
    .line 460
    if-eqz v17, :cond_16

    .line 461
    .line 462
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    instance-of v4, v4, Ljava/lang/Boolean;

    .line 467
    .line 468
    if-eqz v4, :cond_15

    .line 469
    .line 470
    goto :goto_d

    .line 471
    :cond_15
    const-string v0, " \u7684\u7a7a\u5206\u7ec4\u663e\u793a\u5b57\u6bb5\u683c\u5f0f\u9519\u8bef"

    .line 472
    .line 473
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    goto/16 :goto_2

    .line 481
    .line 482
    :cond_16
    :goto_d
    invoke-static {}, La/a;->E()Luf/c;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    move-object/from16 v17, v14

    .line 487
    .line 488
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    .line 489
    .line 490
    .line 491
    move-result v14

    .line 492
    move-object/from16 v18, v15

    .line 493
    .line 494
    const/4 v15, 0x0

    .line 495
    :goto_e
    if-lt v15, v14, :cond_1f

    .line 496
    .line 497
    move-object/from16 v15, v18

    .line 498
    .line 499
    invoke-static {v4}, La/a;->t(Luf/c;)Luf/c;

    .line 500
    .line 501
    .line 502
    move-result-object v18

    .line 503
    invoke-static {}, La/a;->E()Luf/c;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 508
    .line 509
    .line 510
    move-result v9

    .line 511
    const/4 v14, 0x0

    .line 512
    :goto_f
    if-lt v14, v9, :cond_1a

    .line 513
    .line 514
    invoke-static {v4}, La/a;->t(Luf/c;)Luf/c;

    .line 515
    .line 516
    .line 517
    move-result-object v19

    .line 518
    new-instance v4, Lc9/a;

    .line 519
    .line 520
    invoke-virtual {v8, v12, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 521
    .line 522
    .line 523
    move-result v7

    .line 524
    if-gez v7, :cond_17

    .line 525
    .line 526
    const/4 v7, 0x0

    .line 527
    :cond_17
    const/4 v9, 0x0

    .line 528
    invoke-static {v8, v13, v9}, Lc9/o2;->c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 529
    .line 530
    .line 531
    move-result v20

    .line 532
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v9

    .line 536
    instance-of v10, v9, Ljava/lang/String;

    .line 537
    .line 538
    if-eqz v10, :cond_18

    .line 539
    .line 540
    move-object v11, v9

    .line 541
    check-cast v11, Ljava/lang/String;

    .line 542
    .line 543
    goto :goto_10

    .line 544
    :cond_18
    const/4 v11, 0x0

    .line 545
    :goto_10
    if-eqz v11, :cond_19

    .line 546
    .line 547
    invoke-static {v11}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 548
    .line 549
    .line 550
    move-result-object v9

    .line 551
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v9

    .line 555
    if-eqz v9, :cond_19

    .line 556
    .line 557
    :goto_11
    move-object/from16 v21, v9

    .line 558
    .line 559
    const/4 v9, 0x1

    .line 560
    goto :goto_12

    .line 561
    :cond_19
    const-string v9, ""

    .line 562
    .line 563
    goto :goto_11

    .line 564
    :goto_12
    invoke-static {v8, v2, v9}, Lc9/o2;->c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 565
    .line 566
    .line 567
    move-result v22

    .line 568
    invoke-static {v8, v5, v9}, Lc9/o2;->c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 569
    .line 570
    .line 571
    move-result v23

    .line 572
    invoke-static {v8, v0, v9}, Lc9/o2;->c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 573
    .line 574
    .line 575
    move-result v24

    .line 576
    const/4 v0, 0x0

    .line 577
    invoke-static {v8, v1, v0}, Lc9/o2;->c(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 578
    .line 579
    .line 580
    move-result v25

    .line 581
    move-object v13, v4

    .line 582
    move-object/from16 v14, v17

    .line 583
    .line 584
    move/from16 v17, v7

    .line 585
    .line 586
    invoke-direct/range {v13 .. v25}, Lc9/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZZ)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v3, v13}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    add-int/lit8 v6, v6, 0x1

    .line 593
    .line 594
    move v5, v0

    .line 595
    move-object/from16 v0, v28

    .line 596
    .line 597
    move-object/from16 v1, v29

    .line 598
    .line 599
    move/from16 v4, v30

    .line 600
    .line 601
    const/4 v2, 0x1

    .line 602
    goto/16 :goto_0

    .line 603
    .line 604
    :cond_1a
    move-object/from16 v19, v0

    .line 605
    .line 606
    const/16 v27, 0x0

    .line 607
    .line 608
    invoke-virtual {v10, v14}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    move-object/from16 v20, v1

    .line 613
    .line 614
    instance-of v1, v0, Ljava/lang/String;

    .line 615
    .line 616
    if-eqz v1, :cond_1e

    .line 617
    .line 618
    check-cast v0, Ljava/lang/String;

    .line 619
    .line 620
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 629
    .line 630
    .line 631
    move-result v1

    .line 632
    if-lez v1, :cond_1b

    .line 633
    .line 634
    const/4 v1, 0x1

    .line 635
    goto :goto_13

    .line 636
    :cond_1b
    move/from16 v1, v27

    .line 637
    .line 638
    :goto_13
    if-eqz v1, :cond_1c

    .line 639
    .line 640
    goto :goto_14

    .line 641
    :cond_1c
    const/4 v0, 0x0

    .line 642
    :goto_14
    if-eqz v0, :cond_1d

    .line 643
    .line 644
    invoke-virtual {v4, v0}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    :cond_1d
    add-int/lit8 v14, v14, 0x1

    .line 648
    .line 649
    move-object/from16 v0, v19

    .line 650
    .line 651
    move-object/from16 v1, v20

    .line 652
    .line 653
    goto/16 :goto_f

    .line 654
    .line 655
    :cond_1e
    const-string v0, " \u7684\u7f6e\u9876\u4f1a\u8bdd\u6570\u636e\u683c\u5f0f\u9519\u8bef"

    .line 656
    .line 657
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_2

    .line 665
    .line 666
    :cond_1f
    move-object/from16 v19, v18

    .line 667
    .line 668
    move/from16 v18, v14

    .line 669
    .line 670
    move v14, v15

    .line 671
    move-object/from16 v15, v19

    .line 672
    .line 673
    move-object/from16 v19, v0

    .line 674
    .line 675
    move-object/from16 v20, v1

    .line 676
    .line 677
    const/16 v27, 0x0

    .line 678
    .line 679
    invoke-virtual {v9, v14}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    instance-of v1, v0, Ljava/lang/String;

    .line 684
    .line 685
    if-eqz v1, :cond_23

    .line 686
    .line 687
    check-cast v0, Ljava/lang/String;

    .line 688
    .line 689
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    if-lez v1, :cond_20

    .line 702
    .line 703
    const/4 v1, 0x1

    .line 704
    goto :goto_15

    .line 705
    :cond_20
    move/from16 v1, v27

    .line 706
    .line 707
    :goto_15
    if-eqz v1, :cond_21

    .line 708
    .line 709
    goto :goto_16

    .line 710
    :cond_21
    const/4 v0, 0x0

    .line 711
    :goto_16
    if-eqz v0, :cond_22

    .line 712
    .line 713
    invoke-virtual {v4, v0}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    :cond_22
    add-int/lit8 v0, v14, 0x1

    .line 717
    .line 718
    move/from16 v14, v18

    .line 719
    .line 720
    move-object/from16 v1, v20

    .line 721
    .line 722
    move-object/from16 v18, v15

    .line 723
    .line 724
    move v15, v0

    .line 725
    move-object/from16 v0, v19

    .line 726
    .line 727
    goto/16 :goto_e

    .line 728
    .line 729
    :cond_23
    const-string v0, " \u7684\u4f1a\u8bdd\u6570\u636e\u683c\u5f0f\u9519\u8bef"

    .line 730
    .line 731
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    goto/16 :goto_2

    .line 739
    .line 740
    :cond_24
    const-string v0, " \u7f3a\u5c11\u4f1a\u8bdd\u5217\u8868"

    .line 741
    .line 742
    invoke-static {v15, v7, v0}, Lokio/a;->m(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    goto/16 :goto_2

    .line 746
    .line 747
    :cond_25
    const-string v0, " \u7684\u4e0a\u7ea7\u5206\u7ec4\u683c\u5f0f\u9519\u8bef"

    .line 748
    .line 749
    invoke-static {v7, v15, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    goto/16 :goto_2

    .line 757
    .line 758
    :cond_26
    const-string v0, "\u5bfc\u5165\u6587\u4ef6\u5305\u542b\u91cd\u590d\u5206\u7ec4 ID"

    .line 759
    .line 760
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    goto/16 :goto_2

    .line 764
    .line 765
    :cond_27
    move/from16 v26, v2

    .line 766
    .line 767
    add-int/lit8 v6, v6, 0x1

    .line 768
    .line 769
    const-string v0, " \u4e2a\u5206\u7ec4\u7f3a\u5c11\u540d\u79f0"

    .line 770
    .line 771
    invoke-static {v6, v9, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    goto/16 :goto_2

    .line 779
    .line 780
    :cond_28
    move/from16 v26, v2

    .line 781
    .line 782
    add-int/lit8 v6, v6, 0x1

    .line 783
    .line 784
    const-string v0, " \u4e2a\u5206\u7ec4\u7f3a\u5c11 ID"

    .line 785
    .line 786
    invoke-static {v6, v9, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    goto/16 :goto_2

    .line 794
    .line 795
    :cond_29
    move/from16 v26, v2

    .line 796
    .line 797
    add-int/lit8 v6, v6, 0x1

    .line 798
    .line 799
    const-string v0, " \u4e2a\u5206\u7ec4\u5b57\u6bb5\u683c\u5f0f\u9519\u8bef"

    .line 800
    .line 801
    invoke-static {v6, v9, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_2

    .line 809
    .line 810
    :cond_2a
    move/from16 v26, v2

    .line 811
    .line 812
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 813
    .line 814
    add-int/lit8 v6, v6, 0x1

    .line 815
    .line 816
    new-instance v1, Ljava/lang/StringBuilder;

    .line 817
    .line 818
    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    const-string v2, " \u4e2a\u5206\u7ec4\u683c\u5f0f\u9519\u8bef"

    .line 825
    .line 826
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v1

    .line 837
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    throw v0

    .line 841
    :cond_2b
    const-string v0, "\u5bfc\u5165\u6587\u4ef6\u7f3a\u5c11\u5206\u7ec4\u6570\u636e"

    .line 842
    .line 843
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    goto/16 :goto_2

    .line 847
    .line 848
    :cond_2c
    const-string v0, "\u4e0d\u652f\u6301\u7684\u804a\u5929\u5206\u7ec4\u6587\u4ef6\u7248\u672c"

    .line 849
    .line 850
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    goto/16 :goto_2

    .line 854
    .line 855
    :cond_2d
    const-string v0, "\u4e0d\u662f Hchat \u804a\u5929\u5206\u7ec4\u6587\u4ef6"

    .line 856
    .line 857
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    goto/16 :goto_2

    .line 861
    .line 862
    :cond_2e
    const-string v0, "\u5bfc\u5165\u6587\u4ef6\u4e3a\u7a7a"

    .line 863
    .line 864
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    goto/16 :goto_2
.end method

.method public static o(Ljava/util/List;Ljava/util/LinkedHashSet;)Ljava/util/List;
    .locals 6

    .line 1
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ltf/y;->a0(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x10

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v1

    .line 14
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    move-object v3, v2

    .line 34
    check-cast v3, Lc9/a;

    .line 35
    .line 36
    iget-object v3, v3, Lc9/a;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v2, Ldg/n;

    .line 48
    .line 49
    const/4 v3, 0x6

    .line 50
    invoke-direct {v2, p0, v3}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    new-instance v3, Lc9/e2;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-direct {v3, p1, v4}, Lc9/e2;-><init>(Ljava/util/LinkedHashSet;I)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lng/i;

    .line 60
    .line 61
    const/4 v5, 0x1

    .line 62
    invoke-direct {v4, v2, v5, v3}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 63
    .line 64
    .line 65
    new-instance v2, Lng/h;

    .line 66
    .line 67
    invoke-direct {v2, v4}, Lng/h;-><init>(Lng/i;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_1
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_4

    .line 75
    .line 76
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lc9/a;

    .line 81
    .line 82
    iget-object v4, v3, Lc9/a;->c:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v1, p1, v4}, Lc9/o2;->p(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashSet;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-nez v5, :cond_3

    .line 95
    .line 96
    new-instance v5, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :cond_3
    check-cast v5, Ljava/util/List;

    .line 105
    .line 106
    iget-object v3, v3, Lc9/a;->e:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v5, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    new-instance v2, Ldg/n;

    .line 113
    .line 114
    const/4 v3, 0x6

    .line 115
    invoke-direct {v2, p0, v3}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    new-instance p0, Lc9/e2;

    .line 119
    .line 120
    const/4 v3, 0x1

    .line 121
    invoke-direct {p0, p1, v3}, Lc9/e2;-><init>(Ljava/util/LinkedHashSet;I)V

    .line 122
    .line 123
    .line 124
    new-instance v3, Lng/i;

    .line 125
    .line 126
    const/4 v4, 0x0

    .line 127
    invoke-direct {v3, v2, v4, p0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 128
    .line 129
    .line 130
    new-instance p0, Lb0/s;

    .line 131
    .line 132
    const/4 v2, 0x5

    .line 133
    invoke-direct {p0, v0, v1, p1, v2}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 134
    .line 135
    .line 136
    invoke-static {v3, p0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0
.end method

.method public static final p(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashSet;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Lc9/a;

    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    iget-object v1, p2, Lc9/a;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_0
    iget-object p2, p2, Lc9/a;->c:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public static final q(Ljava/util/HashMap;Ljava/util/LinkedHashMap;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Integer;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eq v2, v1, :cond_6

    .line 16
    .line 17
    :goto_0
    const/4 v2, 0x2

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v2, :cond_2

    .line 26
    .line 27
    goto :goto_4

    .line 28
    :cond_2
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v0, :cond_5

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Integer;

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-ne v3, v1, :cond_4

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    :goto_2
    invoke-static {p0, p1, v0}, Lc9/o2;->q(Ljava/util/HashMap;Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_5
    :goto_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_6
    :goto_4
    return-void
.end method

.method public static r(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z
    .locals 5

    .line 1
    const-string v0, "Hchat_conversation_groups"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "groups_v1"

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v1, v2

    .line 19
    :goto_0
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    new-instance v1, Lorg/json/JSONObject;

    .line 26
    .line 27
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 32
    .line 33
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    new-instance v2, Lsf/f;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_1
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_4

    .line 48
    .line 49
    move-object v1, v2

    .line 50
    check-cast v1, Lorg/json/JSONObject;

    .line 51
    .line 52
    :goto_2
    const-string v2, "accounts"

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_2
    new-instance v3, Lorg/json/JSONObject;

    .line 62
    .line 63
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 64
    .line 65
    .line 66
    :goto_3
    invoke-static {p2}, Lc9/o2;->g(Ljava/util/List;)Lorg/json/JSONArray;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    const-string p2, "schemaVersion"

    .line 74
    .line 75
    const/4 v4, 0x1

    .line 76
    invoke-virtual {v1, p2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    .line 81
    .line 82
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-interface {p0, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-nez p0, :cond_3

    .line 99
    .line 100
    new-instance p2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v0, "[Hchat:ConversationGroup] \u4fdd\u5b58\u8d26\u53f7 "

    .line 103
    .line 104
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p1, " \u7684\u804a\u5929\u5206\u7ec4\u5931\u8d25"

    .line 111
    .line 112
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    return p0

    .line 123
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    const-string p1, "[Hchat:ConversationGroup] \u914d\u7f6e\u5df2\u635f\u574f\uff0c\u62d2\u7edd\u8986\u76d6\u73b0\u6709\u8d26\u53f7\u6570\u636e: "

    .line 128
    .line 129
    invoke-static {p1, p0, v1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    const/4 p0, 0x0

    .line 133
    return p0
.end method

.method public static final s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v1, Lc9/o2;->a:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static/range {p1 .. p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x1

    .line 26
    const/4 v6, 0x0

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-static/range {p2 .. p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-lez v8, :cond_0

    .line 44
    .line 45
    move v8, v5

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v8, v6

    .line 48
    :goto_0
    if-eqz v8, :cond_1

    .line 49
    .line 50
    move-object v4, v7

    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto/16 :goto_9

    .line 54
    .line 55
    :cond_1
    :goto_1
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-nez v7, :cond_5

    .line 60
    .line 61
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-nez v7, :cond_5

    .line 66
    .line 67
    const-string v7, "wxid_hchat_group_"

    .line 68
    .line 69
    invoke-static {v3, v7, v6}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    invoke-static {v0, v2}, Lc9/o2;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    if-eqz v4, :cond_6

    .line 81
    .line 82
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-eqz v9, :cond_5

    .line 98
    .line 99
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    check-cast v9, Lc9/a;

    .line 104
    .line 105
    iget-object v9, v9, Lc9/a;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v9, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-eqz v9, :cond_4

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    :goto_2
    move v5, v6

    .line 115
    goto/16 :goto_8

    .line 116
    .line 117
    :cond_6
    :goto_3
    invoke-static {v3, v7}, Lc9/o2;->d(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-static {v6, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-eqz v6, :cond_7

    .line 126
    .line 127
    goto/16 :goto_8

    .line 128
    .line 129
    :cond_7
    new-instance v5, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-static {v7}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_d

    .line 147
    .line 148
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    move-object v8, v7

    .line 153
    check-cast v8, Lc9/a;

    .line 154
    .line 155
    iget-object v7, v8, Lc9/a;->e:Ljava/util/List;

    .line 156
    .line 157
    new-instance v13, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    :cond_8
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    if-eqz v9, :cond_9

    .line 171
    .line 172
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    move-object v10, v9

    .line 177
    check-cast v10, Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {v10, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-nez v10, :cond_8

    .line 184
    .line 185
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_9
    iget-object v7, v8, Lc9/a;->f:Ljava/util/List;

    .line 190
    .line 191
    new-instance v14, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    :cond_a
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_b

    .line 205
    .line 206
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    move-object v10, v9

    .line 211
    check-cast v10, Ljava/lang/String;

    .line 212
    .line 213
    invoke-static {v10, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    if-nez v10, :cond_a

    .line 218
    .line 219
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_b
    iget-object v7, v8, Lc9/a;->a:Ljava/lang/String;

    .line 224
    .line 225
    invoke-static {v7, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-eqz v7, :cond_c

    .line 230
    .line 231
    invoke-static {v13, v3}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object v13

    .line 235
    const/16 v19, 0x0

    .line 236
    .line 237
    const/16 v20, 0xfcf

    .line 238
    .line 239
    const/4 v9, 0x0

    .line 240
    const/4 v10, 0x0

    .line 241
    const/4 v11, 0x0

    .line 242
    const/4 v12, 0x0

    .line 243
    const/4 v15, 0x0

    .line 244
    const/16 v16, 0x0

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    const/16 v18, 0x0

    .line 249
    .line 250
    invoke-static/range {v8 .. v20}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    goto :goto_7

    .line 255
    :cond_c
    const/16 v19, 0x0

    .line 256
    .line 257
    const/16 v20, 0xfcf

    .line 258
    .line 259
    const/4 v9, 0x0

    .line 260
    const/4 v10, 0x0

    .line 261
    const/4 v11, 0x0

    .line 262
    const/4 v12, 0x0

    .line 263
    const/4 v15, 0x0

    .line 264
    const/16 v16, 0x0

    .line 265
    .line 266
    const/16 v17, 0x0

    .line 267
    .line 268
    const/16 v18, 0x0

    .line 269
    .line 270
    invoke-static/range {v8 .. v20}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    :goto_7
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    goto/16 :goto_4

    .line 278
    .line 279
    :cond_d
    invoke-static {v5}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-static {v0, v2, v3}, Lc9/o2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z

    .line 284
    .line 285
    .line 286
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    :goto_8
    monitor-exit v1

    .line 288
    return v5

    .line 289
    :goto_9
    monitor-exit v1

    .line 290
    throw v0
.end method

.method public static final t(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lc9/o2;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    if-eqz v6, :cond_1

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-lez v7, :cond_0

    .line 30
    .line 31
    move v7, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v7, v5

    .line 34
    :goto_0
    if-eqz v7, :cond_1

    .line 35
    .line 36
    move-object v3, v6

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto/16 :goto_7

    .line 40
    .line 41
    :cond_1
    :goto_1
    new-instance v6, Ldg/n;

    .line 42
    .line 43
    const/4 v7, 0x6

    .line 44
    move-object/from16 v8, p2

    .line 45
    .line 46
    invoke-direct {v6, v8, v7}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    sget-object v7, Lc9/n2;->n:Lc9/n2;

    .line 50
    .line 51
    invoke-static {v6, v7}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    new-instance v7, Lb4/b;

    .line 56
    .line 57
    const/4 v8, 0x7

    .line 58
    invoke-direct {v7, v8}, Lb4/b;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance v8, Lng/i;

    .line 62
    .line 63
    invoke-direct {v8, v6, v4, v7}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 64
    .line 65
    .line 66
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 67
    .line 68
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v8, v4}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_c

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_2

    .line 85
    .line 86
    goto/16 :goto_6

    .line 87
    .line 88
    :cond_2
    invoke-static {v0, v2}, Lc9/o2;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_3

    .line 99
    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :cond_3
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-eqz v8, :cond_c

    .line 111
    .line 112
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    check-cast v8, Lc9/a;

    .line 117
    .line 118
    iget-object v8, v8, Lc9/a;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v8, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eqz v8, :cond_4

    .line 125
    .line 126
    :cond_5
    new-instance v5, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-static {v6}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-eqz v7, :cond_b

    .line 144
    .line 145
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    move-object v8, v7

    .line 150
    check-cast v8, Lc9/a;

    .line 151
    .line 152
    iget-object v7, v8, Lc9/a;->e:Ljava/util/List;

    .line 153
    .line 154
    new-instance v13, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    :cond_6
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    if-eqz v9, :cond_7

    .line 168
    .line 169
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    move-object v10, v9

    .line 174
    check-cast v10, Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v4, v10}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    if-nez v10, :cond_6

    .line 181
    .line 182
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_7
    iget-object v7, v8, Lc9/a;->f:Ljava/util/List;

    .line 187
    .line 188
    new-instance v14, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    :cond_8
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    if-eqz v9, :cond_9

    .line 202
    .line 203
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    move-object v10, v9

    .line 208
    check-cast v10, Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v4, v10}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    if-nez v10, :cond_8

    .line 215
    .line 216
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_9
    iget-object v7, v8, Lc9/a;->a:Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v7, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-eqz v7, :cond_a

    .line 227
    .line 228
    invoke-static {v13, v4}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-static {v7}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-static {v7}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    const/16 v19, 0x0

    .line 241
    .line 242
    const/16 v20, 0xfcf

    .line 243
    .line 244
    const/4 v9, 0x0

    .line 245
    const/4 v10, 0x0

    .line 246
    const/4 v11, 0x0

    .line 247
    const/4 v12, 0x0

    .line 248
    const/4 v15, 0x0

    .line 249
    const/16 v16, 0x0

    .line 250
    .line 251
    const/16 v17, 0x0

    .line 252
    .line 253
    const/16 v18, 0x0

    .line 254
    .line 255
    invoke-static/range {v8 .. v20}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    goto :goto_5

    .line 260
    :cond_a
    const/16 v19, 0x0

    .line 261
    .line 262
    const/16 v20, 0xfcf

    .line 263
    .line 264
    const/4 v9, 0x0

    .line 265
    const/4 v10, 0x0

    .line 266
    const/4 v11, 0x0

    .line 267
    const/4 v12, 0x0

    .line 268
    const/4 v15, 0x0

    .line 269
    const/16 v16, 0x0

    .line 270
    .line 271
    const/16 v17, 0x0

    .line 272
    .line 273
    const/16 v18, 0x0

    .line 274
    .line 275
    invoke-static/range {v8 .. v20}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    :goto_5
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto/16 :goto_2

    .line 283
    .line 284
    :cond_b
    invoke-static {v5}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    invoke-static {v0, v2, v3}, Lc9/o2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z

    .line 289
    .line 290
    .line 291
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    :cond_c
    :goto_6
    monitor-exit v1

    .line 293
    return v5

    .line 294
    :goto_7
    monitor-exit v1

    .line 295
    throw v0
.end method

.method public static final u(Landroid/content/Context;Lc9/a;)Z
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v14, Lc9/o2;->a:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v14

    .line 14
    :try_start_0
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v15

    .line 18
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v16, 0x0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    goto/16 :goto_c

    .line 27
    .line 28
    :cond_0
    invoke-static {v0, v15}, Lc9/o2;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, v1, Lc9/a;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    move/from16 v5, v16

    .line 47
    .line 48
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Lc9/a;

    .line 59
    .line 60
    iget-object v6, v6, Lc9/a;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v6, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_1

    .line 67
    .line 68
    :goto_1
    move v4, v5

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    goto/16 :goto_d

    .line 75
    .line 76
    :cond_2
    const/4 v5, -0x1

    .line 77
    goto :goto_1

    .line 78
    :goto_2
    if-ltz v4, :cond_15

    .line 79
    .line 80
    iget-object v5, v1, Lc9/a;->b:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_3

    .line 95
    .line 96
    goto/16 :goto_c

    .line 97
    .line 98
    :cond_3
    iget-object v5, v1, Lc9/a;->c:Ljava/lang/String;

    .line 99
    .line 100
    const/16 v17, 0x0

    .line 101
    .line 102
    const/4 v6, 0x1

    .line 103
    if-eqz v5, :cond_5

    .line 104
    .line 105
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    if-eqz v5, :cond_5

    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-lez v7, :cond_4

    .line 120
    .line 121
    move v7, v6

    .line 122
    goto :goto_3

    .line 123
    :cond_4
    move/from16 v7, v16

    .line 124
    .line 125
    :goto_3
    if-eqz v7, :cond_5

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_5
    move-object/from16 v5, v17

    .line 129
    .line 130
    :goto_4
    if-nez v5, :cond_6

    .line 131
    .line 132
    move v7, v6

    .line 133
    goto :goto_6

    .line 134
    :cond_6
    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-nez v7, :cond_9

    .line 139
    .line 140
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_7

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-eqz v8, :cond_9

    .line 156
    .line 157
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    check-cast v8, Lc9/a;

    .line 162
    .line 163
    iget-object v8, v8, Lc9/a;->a:Ljava/lang/String;

    .line 164
    .line 165
    invoke-static {v8, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-eqz v8, :cond_8

    .line 170
    .line 171
    invoke-static {v3, v2}, Lc9/o2;->f(Ljava/lang/String;Ljava/util/List;)Ljava/util/Set;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    xor-int/2addr v7, v6

    .line 180
    goto :goto_6

    .line 181
    :cond_9
    :goto_5
    move/from16 v7, v16

    .line 182
    .line 183
    :goto_6
    if-nez v7, :cond_a

    .line 184
    .line 185
    goto/16 :goto_c

    .line 186
    .line 187
    :cond_a
    iget-object v7, v1, Lc9/a;->e:Ljava/util/List;

    .line 188
    .line 189
    invoke-static {v7}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    sget-object v8, Lc9/l2;->n:Lc9/l2;

    .line 194
    .line 195
    invoke-static {v7, v8}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    sget-object v8, Lc9/m2;->n:Lc9/m2;

    .line 200
    .line 201
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    new-instance v9, Lng/i;

    .line 205
    .line 206
    invoke-direct {v9, v7, v6, v8}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 207
    .line 208
    .line 209
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 210
    .line 211
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-static {v9, v6}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 215
    .line 216
    .line 217
    iget-object v7, v1, Lc9/a;->f:Ljava/util/List;

    .line 218
    .line 219
    new-instance v8, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    :cond_b
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    if-eqz v9, :cond_c

    .line 233
    .line 234
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    move-object v10, v9

    .line 239
    check-cast v10, Ljava/lang/String;

    .line 240
    .line 241
    invoke-interface {v6, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    if-eqz v10, :cond_b

    .line 246
    .line 247
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_c
    invoke-static {v8}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    invoke-static {v7}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    new-instance v8, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 266
    .line 267
    .line 268
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v18

    .line 272
    move/from16 v2, v16

    .line 273
    .line 274
    :goto_8
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    if-eqz v9, :cond_14

    .line 279
    .line 280
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    add-int/lit8 v19, v2, 0x1

    .line 285
    .line 286
    if-ltz v2, :cond_13

    .line 287
    .line 288
    check-cast v9, Lc9/a;

    .line 289
    .line 290
    if-ne v2, v4, :cond_e

    .line 291
    .line 292
    iget-object v2, v1, Lc9/a;->b:Ljava/lang/String;

    .line 293
    .line 294
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    iget v9, v1, Lc9/a;->d:I

    .line 303
    .line 304
    if-gez v9, :cond_d

    .line 305
    .line 306
    move/from16 v9, v16

    .line 307
    .line 308
    :cond_d
    move-object v10, v6

    .line 309
    invoke-static {v10}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    const/4 v12, 0x0

    .line 314
    const/16 v13, 0xfc0

    .line 315
    .line 316
    move-object v11, v8

    .line 317
    const/4 v8, 0x0

    .line 318
    move/from16 v20, v4

    .line 319
    .line 320
    move-object v4, v5

    .line 321
    move v5, v9

    .line 322
    const/4 v9, 0x0

    .line 323
    move-object/from16 v21, v10

    .line 324
    .line 325
    const/4 v10, 0x0

    .line 326
    move-object/from16 v22, v11

    .line 327
    .line 328
    const/4 v11, 0x0

    .line 329
    move-object v0, v3

    .line 330
    move-object v3, v2

    .line 331
    move-object v2, v0

    .line 332
    move-object/from16 v34, v15

    .line 333
    .line 334
    move/from16 v33, v20

    .line 335
    .line 336
    move-object/from16 v0, v21

    .line 337
    .line 338
    move-object/from16 v15, v22

    .line 339
    .line 340
    invoke-static/range {v1 .. v13}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    goto/16 :goto_b

    .line 345
    .line 346
    :cond_e
    move-object v2, v3

    .line 347
    move/from16 v33, v4

    .line 348
    .line 349
    move-object v4, v5

    .line 350
    move-object v0, v6

    .line 351
    move-object/from16 v34, v15

    .line 352
    .line 353
    move-object v15, v8

    .line 354
    iget-object v1, v9, Lc9/a;->e:Ljava/util/List;

    .line 355
    .line 356
    new-instance v3, Ljava/util/ArrayList;

    .line 357
    .line 358
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 359
    .line 360
    .line 361
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    :cond_f
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    if-eqz v5, :cond_10

    .line 370
    .line 371
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    move-object v6, v5

    .line 376
    check-cast v6, Ljava/lang/String;

    .line 377
    .line 378
    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    if-nez v6, :cond_f

    .line 383
    .line 384
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    goto :goto_9

    .line 388
    :cond_10
    iget-object v1, v9, Lc9/a;->f:Ljava/util/List;

    .line 389
    .line 390
    new-instance v5, Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 393
    .line 394
    .line 395
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    :cond_11
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    if-eqz v6, :cond_12

    .line 404
    .line 405
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    move-object v8, v6

    .line 410
    check-cast v8, Ljava/lang/String;

    .line 411
    .line 412
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v8

    .line 416
    if-nez v8, :cond_11

    .line 417
    .line 418
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    goto :goto_a

    .line 422
    :cond_12
    const/16 v31, 0x0

    .line 423
    .line 424
    const/16 v32, 0xfcf

    .line 425
    .line 426
    const/16 v21, 0x0

    .line 427
    .line 428
    const/16 v22, 0x0

    .line 429
    .line 430
    const/16 v23, 0x0

    .line 431
    .line 432
    const/16 v24, 0x0

    .line 433
    .line 434
    const/16 v27, 0x0

    .line 435
    .line 436
    const/16 v28, 0x0

    .line 437
    .line 438
    const/16 v29, 0x0

    .line 439
    .line 440
    const/16 v30, 0x0

    .line 441
    .line 442
    move-object/from16 v25, v3

    .line 443
    .line 444
    move-object/from16 v26, v5

    .line 445
    .line 446
    move-object/from16 v20, v9

    .line 447
    .line 448
    invoke-static/range {v20 .. v32}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    :goto_b
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-object/from16 v1, p1

    .line 456
    .line 457
    move-object v6, v0

    .line 458
    move-object v3, v2

    .line 459
    move-object v5, v4

    .line 460
    move-object v8, v15

    .line 461
    move/from16 v2, v19

    .line 462
    .line 463
    move/from16 v4, v33

    .line 464
    .line 465
    move-object/from16 v15, v34

    .line 466
    .line 467
    move-object/from16 v0, p0

    .line 468
    .line 469
    goto/16 :goto_8

    .line 470
    .line 471
    :cond_13
    invoke-static {}, La/a;->Q0()V

    .line 472
    .line 473
    .line 474
    throw v17

    .line 475
    :cond_14
    move-object/from16 v34, v15

    .line 476
    .line 477
    move-object v15, v8

    .line 478
    invoke-static {v15}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    move-object/from16 v1, p0

    .line 483
    .line 484
    move-object/from16 v2, v34

    .line 485
    .line 486
    invoke-static {v1, v2, v0}, Lc9/o2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z

    .line 487
    .line 488
    .line 489
    move-result v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 490
    :cond_15
    :goto_c
    monitor-exit v14

    .line 491
    return v16

    .line 492
    :goto_d
    monitor-exit v14

    .line 493
    throw v0
.end method
