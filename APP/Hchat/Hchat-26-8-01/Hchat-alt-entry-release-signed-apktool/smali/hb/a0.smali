.class public final synthetic Lhb/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lhb/i0;

.field public final synthetic h:I

.field public final synthetic i:Ljava/util/Set;

.field public final synthetic j:Landroid/app/Activity;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:I

.field public final synthetic n:Lb/e;


# direct methods
.method public synthetic constructor <init>(Lhb/i0;ILjava/util/Set;Landroid/app/Activity;Ljava/util/List;Ljava/util/List;ILb/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhb/a0;->g:Lhb/i0;

    .line 5
    .line 6
    iput p2, p0, Lhb/a0;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lhb/a0;->i:Ljava/util/Set;

    .line 9
    .line 10
    iput-object p4, p0, Lhb/a0;->j:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p5, p0, Lhb/a0;->k:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Lhb/a0;->l:Ljava/util/List;

    .line 15
    .line 16
    iput p7, p0, Lhb/a0;->m:I

    .line 17
    .line 18
    iput-object p8, p0, Lhb/a0;->n:Lb/e;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lhb/a0;->g:Lhb/i0;

    .line 4
    .line 5
    iget v4, v0, Lhb/a0;->h:I

    .line 6
    .line 7
    iget-object v5, v0, Lhb/a0;->i:Ljava/util/Set;

    .line 8
    .line 9
    iget-object v8, v0, Lhb/a0;->j:Landroid/app/Activity;

    .line 10
    .line 11
    iget-object v9, v0, Lhb/a0;->k:Ljava/util/List;

    .line 12
    .line 13
    iget-object v10, v0, Lhb/a0;->l:Ljava/util/List;

    .line 14
    .line 15
    iget v11, v0, Lhb/a0;->m:I

    .line 16
    .line 17
    iget-object v12, v0, Lhb/a0;->n:Lb/e;

    .line 18
    .line 19
    move-object/from16 v2, p1

    .line 20
    .line 21
    check-cast v2, Ljava/lang/Long;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v6

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v13

    .line 34
    const/4 v15, 0x0

    .line 35
    const-wide/16 v16, 0x0

    .line 36
    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    cmp-long v3, v6, v13

    .line 40
    .line 41
    if-lez v3, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v2, v15

    .line 45
    :goto_0
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    :goto_1
    move-wide/from16 v2, v16

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/4 v2, 0x2

    .line 56
    if-ne v4, v2, :cond_4

    .line 57
    .line 58
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2, v6, v7}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 70
    .line 71
    .line 72
    const/4 v3, 0x7

    .line 73
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-interface {v5, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_4

    .line 86
    .line 87
    invoke-static {v6, v7, v4, v5}, La2/a;->b(JILjava/util/Set;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v6

    .line 91
    :cond_4
    move-wide v2, v6

    .line 92
    move-wide v6, v13

    .line 93
    invoke-static/range {v2 .. v7}, La2/a;->F(JILjava/util/Set;J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    cmp-long v2, v2, v6

    .line 102
    .line 103
    if-lez v2, :cond_5

    .line 104
    .line 105
    move-object v15, v13

    .line 106
    :cond_5
    if-eqz v15, :cond_1

    .line 107
    .line 108
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    :goto_2
    cmp-long v6, v2, v16

    .line 113
    .line 114
    if-gtz v6, :cond_6

    .line 115
    .line 116
    const-string v2, "\u8ba1\u5212\u65f6\u95f4\u9700\u8981\u665a\u4e8e\u5f53\u524d\u65f6\u95f4"

    .line 117
    .line 118
    invoke-virtual {v1, v8, v2}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_6

    .line 122
    .line 123
    :cond_6
    new-instance v6, Ldb/g;

    .line 124
    .line 125
    iget-object v7, v1, Lhb/i0;->a:Lr8/g;

    .line 126
    .line 127
    iget-object v7, v7, Lr8/g;->a:Landroid/content/Context;

    .line 128
    .line 129
    invoke-direct {v6, v7}, Ldb/g;-><init>(Landroid/content/Context;)V

    .line 130
    .line 131
    .line 132
    move-object v7, v9

    .line 133
    move-wide/from16 v28, v2

    .line 134
    .line 135
    move-object v3, v8

    .line 136
    move-wide/from16 v8, v28

    .line 137
    .line 138
    invoke-static {}, La2/a;->p()Ldb/c;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    new-instance v13, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-static {v7}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    if-eqz v14, :cond_8

    .line 160
    .line 161
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    check-cast v14, Lhb/t;

    .line 166
    .line 167
    new-instance v15, Ldb/a;

    .line 168
    .line 169
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    new-instance v0, Lorg/json/JSONObject;

    .line 173
    .line 174
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 175
    .line 176
    .line 177
    move-object/from16 v16, v2

    .line 178
    .line 179
    move-object/from16 p1, v3

    .line 180
    .line 181
    iget-wide v2, v14, Lhb/t;->a:J

    .line 182
    .line 183
    move/from16 v17, v4

    .line 184
    .line 185
    const-string v4, "msgId"

    .line 186
    .line 187
    invoke-virtual {v0, v4, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 188
    .line 189
    .line 190
    const-string v2, "type"

    .line 191
    .line 192
    iget v3, v14, Lhb/t;->b:I

    .line 193
    .line 194
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 195
    .line 196
    .line 197
    iget-object v2, v14, Lhb/t;->c:Ljava/lang/String;

    .line 198
    .line 199
    const-string v3, "sourceTalker"

    .line 200
    .line 201
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    iget-object v2, v14, Lhb/t;->d:Ljava/lang/String;

    .line 205
    .line 206
    move-object/from16 v18, v5

    .line 207
    .line 208
    const-string v5, "content"

    .line 209
    .line 210
    invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 211
    .line 212
    .line 213
    const-string v2, "imagePath"

    .line 214
    .line 215
    move-object/from16 v19, v6

    .line 216
    .line 217
    iget-object v6, v14, Lhb/t;->e:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 220
    .line 221
    .line 222
    const-string v2, "createTime"

    .line 223
    .line 224
    move-object/from16 v20, v7

    .line 225
    .line 226
    iget-wide v6, v14, Lhb/t;->f:J

    .line 227
    .line 228
    invoke-virtual {v0, v2, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 229
    .line 230
    .line 231
    const-string v2, "voicePath"

    .line 232
    .line 233
    iget-object v6, v14, Lhb/t;->h:Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 236
    .line 237
    .line 238
    const-string v2, "voiceDurationMillis"

    .line 239
    .line 240
    iget v6, v14, Lhb/t;->i:I

    .line 241
    .line 242
    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 243
    .line 244
    .line 245
    const-string v2, "voiceFileName"

    .line 246
    .line 247
    iget-object v6, v14, Lhb/t;->j:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 250
    .line 251
    .line 252
    iget-object v2, v14, Lhb/t;->g:Lk8/t;

    .line 253
    .line 254
    if-eqz v2, :cond_7

    .line 255
    .line 256
    new-instance v6, Lorg/json/JSONObject;

    .line 257
    .line 258
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 259
    .line 260
    .line 261
    move-wide/from16 v21, v8

    .line 262
    .line 263
    iget-wide v7, v2, Lk8/t;->a:J

    .line 264
    .line 265
    invoke-virtual {v6, v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 266
    .line 267
    .line 268
    iget-object v4, v2, Lk8/t;->b:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v6, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 271
    .line 272
    .line 273
    iget-object v3, v2, Lk8/t;->c:Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {v6, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 276
    .line 277
    .line 278
    const-string v3, "retrType"

    .line 279
    .line 280
    iget v4, v2, Lk8/t;->d:I

    .line 281
    .line 282
    invoke-virtual {v6, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 283
    .line 284
    .line 285
    const-string v3, "msgFromScene"

    .line 286
    .line 287
    iget v4, v2, Lk8/t;->e:I

    .line 288
    .line 289
    invoke-virtual {v6, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 290
    .line 291
    .line 292
    const-string v3, "fileName"

    .line 293
    .line 294
    iget-object v4, v2, Lk8/t;->f:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v6, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 297
    .line 298
    .line 299
    const-string v3, "length"

    .line 300
    .line 301
    iget v2, v2, Lk8/t;->g:I

    .line 302
    .line 303
    invoke-virtual {v6, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 304
    .line 305
    .line 306
    const-string v2, "retransmit"

    .line 307
    .line 308
    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 309
    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_7
    move-wide/from16 v21, v8

    .line 313
    .line 314
    :goto_4
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    const/16 v2, 0x8

    .line 322
    .line 323
    invoke-direct {v15, v2, v0}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-object/from16 v0, p0

    .line 330
    .line 331
    move-object/from16 v3, p1

    .line 332
    .line 333
    move-object/from16 v2, v16

    .line 334
    .line 335
    move/from16 v4, v17

    .line 336
    .line 337
    move-object/from16 v5, v18

    .line 338
    .line 339
    move-object/from16 v6, v19

    .line 340
    .line 341
    move-object/from16 v7, v20

    .line 342
    .line 343
    move-wide/from16 v8, v21

    .line 344
    .line 345
    goto/16 :goto_3

    .line 346
    .line 347
    :cond_8
    move-object/from16 v16, v2

    .line 348
    .line 349
    move-object/from16 p1, v3

    .line 350
    .line 351
    move/from16 v17, v4

    .line 352
    .line 353
    move-object/from16 v18, v5

    .line 354
    .line 355
    move-object/from16 v19, v6

    .line 356
    .line 357
    move-wide/from16 v21, v8

    .line 358
    .line 359
    new-instance v7, Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-static {v10}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 366
    .line 367
    .line 368
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-eqz v2, :cond_9

    .line 377
    .line 378
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    check-cast v2, Lwb/jv;

    .line 383
    .line 384
    iget-object v2, v2, Lwb/jv;->a:Ljava/lang/String;

    .line 385
    .line 386
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_9
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v25

    .line 398
    move-wide/from16 v8, v21

    .line 399
    .line 400
    const/16 v22, 0x0

    .line 401
    .line 402
    const v26, 0x6fe1d

    .line 403
    .line 404
    .line 405
    const/16 v3, 0x8

    .line 406
    .line 407
    const/4 v4, 0x0

    .line 408
    const/4 v5, 0x0

    .line 409
    const/4 v6, 0x0

    .line 410
    move-object v0, v12

    .line 411
    const/4 v12, 0x0

    .line 412
    move-object/from16 v23, v13

    .line 413
    .line 414
    const/4 v13, 0x0

    .line 415
    const/4 v14, 0x0

    .line 416
    const/4 v15, 0x0

    .line 417
    move-object/from16 v2, v16

    .line 418
    .line 419
    move/from16 v10, v17

    .line 420
    .line 421
    const-wide/16 v16, 0x0

    .line 422
    .line 423
    move/from16 v24, v11

    .line 424
    .line 425
    move-object/from16 v11, v18

    .line 426
    .line 427
    const/16 v18, 0x0

    .line 428
    .line 429
    move-object/from16 v20, v19

    .line 430
    .line 431
    const/16 v19, 0x0

    .line 432
    .line 433
    move-object/from16 v21, v20

    .line 434
    .line 435
    const-string v20, "\u5b9a\u65f6\u8f6c\u53d1[H]"

    .line 436
    .line 437
    move-object/from16 v27, v21

    .line 438
    .line 439
    const/16 v21, 0x0

    .line 440
    .line 441
    move-object/from16 v28, v27

    .line 442
    .line 443
    move-object/from16 v27, v0

    .line 444
    .line 445
    move-object/from16 v0, v28

    .line 446
    .line 447
    invoke-static/range {v2 .. v26}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    iget-object v3, v0, Ldb/g;->a:Landroid/content/SharedPreferences;

    .line 452
    .line 453
    if-eqz v3, :cond_a

    .line 454
    .line 455
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    if-eqz v3, :cond_a

    .line 460
    .line 461
    const-string v4, "scheduled_task_enable"

    .line 462
    .line 463
    const/4 v5, 0x1

    .line 464
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    if-eqz v3, :cond_a

    .line 469
    .line 470
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 471
    .line 472
    .line 473
    :cond_a
    invoke-static {v2}, La2/a;->r(Ldb/c;)Ldb/c;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-virtual {v0, v2}, Ldb/g;->d(Ldb/c;)V

    .line 478
    .line 479
    .line 480
    sget-object v0, Lbe/h;->a:Lcb/f;

    .line 481
    .line 482
    if-eqz v0, :cond_b

    .line 483
    .line 484
    invoke-virtual {v0}, Lcb/f;->r()V

    .line 485
    .line 486
    .line 487
    :cond_b
    iget-object v0, v1, Lhb/i0;->b:Lab/b;

    .line 488
    .line 489
    move-object/from16 v2, v27

    .line 490
    .line 491
    invoke-virtual {v2, v0}, Lb/e;->r(Lfg/p;)V

    .line 492
    .line 493
    .line 494
    const-string v0, "\u5b9a\u65f6\u4efb\u52a1\u5df2\u4fdd\u5b58"

    .line 495
    .line 496
    move-object/from16 v3, p1

    .line 497
    .line 498
    invoke-virtual {v1, v3, v0}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    :goto_6
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 502
    .line 503
    return-object v0
.end method
