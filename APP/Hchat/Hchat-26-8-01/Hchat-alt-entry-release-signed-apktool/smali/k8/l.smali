.class public final synthetic Lk8/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf8/d;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lk8/p;


# direct methods
.method public synthetic constructor <init>(Lk8/p;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk8/l;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lk8/l;->h:Lk8/p;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lk8/l;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lf8/h;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    iget-object v2, v1, Lf8/h;->d:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, v1, Lf8/h;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v3, v1, Lf8/h;->a:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v11, v0, Lk8/l;->h:Lk8/p;

    .line 23
    .line 24
    iget-object v5, v11, Lk8/p;->d:Lg8/a;

    .line 25
    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    invoke-virtual {v5}, Lg8/a;->c()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string v5, ""

    .line 34
    .line 35
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const/4 v12, 0x0

    .line 40
    const/4 v13, 0x1

    .line 41
    if-nez v6, :cond_2

    .line 42
    .line 43
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    move v7, v13

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v7, v12

    .line 52
    :goto_1
    iget-wide v5, v1, Lf8/h;->e:J

    .line 53
    .line 54
    const-wide v8, 0x174876e800L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    cmp-long v8, v5, v8

    .line 60
    .line 61
    if-lez v8, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    const-wide/16 v8, 0x0

    .line 65
    .line 66
    cmp-long v8, v5, v8

    .line 67
    .line 68
    if-lez v8, :cond_4

    .line 69
    .line 70
    const-wide/16 v8, 0x3e8

    .line 71
    .line 72
    mul-long/2addr v5, v8

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    :goto_2
    const/16 v8, 0x2710

    .line 79
    .line 80
    iget-wide v9, v1, Lf8/h;->f:J

    .line 81
    .line 82
    invoke-static/range {v2 .. v10}, Lh/Hchat/hooks/api/model/WeChatMessage;->fromTransient(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJ)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    new-instance v6, Lk8/o;

    .line 87
    .line 88
    iget-object v8, v11, Lk8/p;->c:Lk8/q;

    .line 89
    .line 90
    if-eqz v8, :cond_5

    .line 91
    .line 92
    invoke-static {v2}, Lk8/q;->f(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_5

    .line 97
    .line 98
    move v10, v13

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    move v10, v12

    .line 101
    :goto_3
    iget-object v15, v1, Lf8/h;->b:Ljava/lang/String;

    .line 102
    .line 103
    iget-wide v8, v1, Lf8/h;->e:J

    .line 104
    .line 105
    move-object v13, v5

    .line 106
    move-object v5, v2

    .line 107
    move-object v2, v6

    .line 108
    move-object v6, v3

    .line 109
    const-string v3, "pat_pb"

    .line 110
    .line 111
    move-object v1, v11

    .line 112
    move v11, v7

    .line 113
    move-object v7, v4

    .line 114
    const-string v4, "pat"

    .line 115
    .line 116
    move-wide/from16 v17, v8

    .line 117
    .line 118
    const-string v8, ""

    .line 119
    .line 120
    const-string v9, ""

    .line 121
    .line 122
    const/4 v12, 0x0

    .line 123
    move-object v14, v6

    .line 124
    move-object/from16 v16, v7

    .line 125
    .line 126
    invoke-direct/range {v2 .. v18}, Lk8/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLh/Hchat/hooks/api/model/WeChatMessage;Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2}, Lk8/p;->a(Lk8/o;)V

    .line 130
    .line 131
    .line 132
    :goto_4
    return-void

    .line 133
    :pswitch_0
    iget-object v1, v0, Lk8/l;->h:Lk8/p;

    .line 134
    .line 135
    iget-object v2, v1, Lk8/p;->d:Lg8/a;

    .line 136
    .line 137
    iget-object v3, v1, Lk8/p;->c:Lk8/q;

    .line 138
    .line 139
    move-object/from16 v4, p1

    .line 140
    .line 141
    check-cast v4, Lf8/g;

    .line 142
    .line 143
    if-nez v4, :cond_6

    .line 144
    .line 145
    goto/16 :goto_10

    .line 146
    .line 147
    :cond_6
    iget-object v5, v4, Lf8/g;->c:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v6, v4, Lf8/g;->j:Ljava/lang/String;

    .line 150
    .line 151
    iget-object v7, v4, Lf8/g;->d:Ljava/lang/String;

    .line 152
    .line 153
    const-string v8, ""

    .line 154
    .line 155
    if-eqz v3, :cond_7

    .line 156
    .line 157
    iget-object v9, v4, Lf8/g;->a:Ljava/lang/String;

    .line 158
    .line 159
    const-string v10, "nativeurl"

    .line 160
    .line 161
    invoke-static {v9, v10}, Lk8/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    move-object/from16 v17, v9

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_7
    move-object/from16 v17, v8

    .line 169
    .line 170
    :goto_5
    iget-object v9, v4, Lf8/g;->e:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-nez v10, :cond_8

    .line 177
    .line 178
    :try_start_0
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    if-lez v9, :cond_8

    .line 183
    .line 184
    :goto_6
    move/from16 v24, v9

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :catchall_0
    :cond_8
    invoke-static {v7}, Lh/Hchat/hooks/api/model/WeChatMessage;->inferType(Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    goto :goto_6

    .line 192
    :goto_7
    iget-boolean v9, v4, Lf8/g;->k:Z

    .line 193
    .line 194
    const/4 v11, 0x0

    .line 195
    if-nez v9, :cond_b

    .line 196
    .line 197
    iget-object v9, v4, Lf8/g;->b:Ljava/lang/String;

    .line 198
    .line 199
    if-eqz v2, :cond_9

    .line 200
    .line 201
    invoke-virtual {v2}, Lg8/a;->c()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v12

    .line 205
    goto :goto_8

    .line 206
    :cond_9
    move-object v12, v8

    .line 207
    :goto_8
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    if-nez v13, :cond_a

    .line 212
    .line 213
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    if-eqz v9, :cond_a

    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_a
    move/from16 v19, v11

    .line 221
    .line 222
    goto :goto_a

    .line 223
    :cond_b
    :goto_9
    const/16 v19, 0x1

    .line 224
    .line 225
    :goto_a
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    if-nez v9, :cond_c

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_c
    const-string v6, "add_msg"

    .line 233
    .line 234
    :goto_b
    iget-object v9, v4, Lf8/g;->c:Ljava/lang/String;

    .line 235
    .line 236
    iget-object v12, v4, Lf8/g;->b:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v13, v4, Lf8/g;->d:Ljava/lang/String;

    .line 239
    .line 240
    iget-wide v14, v4, Lf8/g;->f:J

    .line 241
    .line 242
    const-wide/16 v20, 0x0

    .line 243
    .line 244
    cmp-long v16, v14, v20

    .line 245
    .line 246
    if-lez v16, :cond_d

    .line 247
    .line 248
    const-wide/16 v20, 0x3e8

    .line 249
    .line 250
    mul-long v14, v14, v20

    .line 251
    .line 252
    :goto_c
    move-wide/from16 v21, v14

    .line 253
    .line 254
    goto :goto_d

    .line 255
    :cond_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 256
    .line 257
    .line 258
    move-result-wide v14

    .line 259
    goto :goto_c

    .line 260
    :goto_d
    iget-wide v14, v4, Lf8/g;->g:J

    .line 261
    .line 262
    iget-object v10, v4, Lf8/g;->h:Ljava/lang/String;

    .line 263
    .line 264
    if-eqz v2, :cond_e

    .line 265
    .line 266
    invoke-virtual {v2}, Lg8/a;->c()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    :cond_e
    move-object/from16 v28, v8

    .line 271
    .line 272
    move-object/from16 v18, v9

    .line 273
    .line 274
    move-object/from16 v27, v10

    .line 275
    .line 276
    move-object/from16 v20, v13

    .line 277
    .line 278
    move-wide/from16 v25, v14

    .line 279
    .line 280
    move/from16 v23, v19

    .line 281
    .line 282
    move-object/from16 v19, v12

    .line 283
    .line 284
    invoke-static/range {v18 .. v28}, Lh/Hchat/hooks/api/model/WeChatMessage;->fromTransient(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    move/from16 v19, v23

    .line 289
    .line 290
    invoke-virtual {v1, v2}, Lk8/p;->d(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    if-eqz v19, :cond_12

    .line 295
    .line 296
    const-string v8, "local_send"

    .line 297
    .line 298
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    if-nez v8, :cond_12

    .line 303
    .line 304
    iget-object v8, v1, Lk8/p;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 305
    .line 306
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    if-nez v9, :cond_11

    .line 311
    .line 312
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 313
    .line 314
    .line 315
    move-result v9

    .line 316
    if-eqz v9, :cond_f

    .line 317
    .line 318
    goto :goto_e

    .line 319
    :cond_f
    new-instance v9, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    const/16 v10, 0xa

    .line 328
    .line 329
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v9

    .line 339
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 340
    .line 341
    .line 342
    move-result-wide v13

    .line 343
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 351
    .line 352
    .line 353
    move-result v9

    .line 354
    const/16 v10, 0x40

    .line 355
    .line 356
    if-ge v9, v10, :cond_10

    .line 357
    .line 358
    goto :goto_e

    .line 359
    :cond_10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 360
    .line 361
    .line 362
    move-result-wide v9

    .line 363
    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    new-instance v13, Lk8/j;

    .line 368
    .line 369
    const/4 v14, 0x1

    .line 370
    invoke-direct {v13, v9, v10, v14}, Lk8/j;-><init>(JI)V

    .line 371
    .line 372
    .line 373
    invoke-interface {v8, v13}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 374
    .line 375
    .line 376
    :cond_11
    :goto_e
    invoke-static {v5, v7}, Lk8/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :cond_12
    new-instance v10, Lk8/o;

    .line 380
    .line 381
    iget-object v13, v4, Lf8/g;->c:Ljava/lang/String;

    .line 382
    .line 383
    iget-object v14, v4, Lf8/g;->b:Ljava/lang/String;

    .line 384
    .line 385
    iget-object v15, v4, Lf8/g;->d:Ljava/lang/String;

    .line 386
    .line 387
    iget-object v4, v4, Lf8/g;->a:Ljava/lang/String;

    .line 388
    .line 389
    if-eqz v3, :cond_13

    .line 390
    .line 391
    invoke-static {v13}, Lk8/q;->f(Ljava/lang/String;)Z

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    if-eqz v3, :cond_13

    .line 396
    .line 397
    const/16 v18, 0x1

    .line 398
    .line 399
    goto :goto_f

    .line 400
    :cond_13
    move/from16 v18, v11

    .line 401
    .line 402
    :goto_f
    const/16 v20, 0x0

    .line 403
    .line 404
    move-object/from16 v21, v2

    .line 405
    .line 406
    move-object/from16 v16, v4

    .line 407
    .line 408
    move-object v11, v6

    .line 409
    invoke-direct/range {v10 .. v21}, Lk8/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLh/Hchat/hooks/api/model/WeChatMessage;Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1, v10}, Lk8/p;->a(Lk8/o;)V

    .line 413
    .line 414
    .line 415
    :goto_10
    return-void

    .line 416
    nop

    .line 417
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
