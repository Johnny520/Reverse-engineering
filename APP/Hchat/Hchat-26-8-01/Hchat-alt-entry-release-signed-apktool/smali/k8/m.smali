.class public final synthetic Lk8/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk8/h;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk8/m;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lk8/m;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lb/e;)V
    .locals 13

    .line 1
    iget v0, p0, Lk8/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk8/m;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ls8/c;

    .line 9
    .line 10
    iget-object p1, p1, Lb/e;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ls8/c;->N(Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lk8/m;->b:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v2, v0

    .line 21
    check-cast v2, Lka/f;

    .line 22
    .line 23
    iget-object v0, v2, Lka/f;->c:Lka/g;

    .line 24
    .line 25
    iget-object v1, p1, Lb/e;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ll8/a;

    .line 28
    .line 29
    const-string v3, "insert"

    .line 30
    .line 31
    iget-object v1, v1, Ll8/a;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_c

    .line 38
    .line 39
    iget-object p1, p1, Lb/e;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 42
    .line 43
    if-eqz p1, :cond_c

    .line 44
    .line 45
    const-string v1, "qq_music_order_enable"

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-virtual {v0, v1, v3}, Lka/g;->b(Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_c

    .line 53
    .line 54
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_0

    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_0
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSystem()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_1
    iget-wide v4, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 71
    .line 72
    const-wide/16 v6, 0x0

    .line 73
    .line 74
    cmp-long v1, v4, v6

    .line 75
    .line 76
    if-lez v1, :cond_3

    .line 77
    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v6

    .line 82
    const-wide v8, 0x174876e800L

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    cmp-long v1, v4, v8

    .line 88
    .line 89
    if-gez v1, :cond_2

    .line 90
    .line 91
    const-wide/16 v8, 0x3e8

    .line 92
    .line 93
    mul-long/2addr v4, v8

    .line 94
    :cond_2
    sub-long/2addr v6, v4

    .line 95
    const-wide/16 v4, 0x7530

    .line 96
    .line 97
    cmp-long v1, v6, v4

    .line 98
    .line 99
    if-ltz v1, :cond_3

    .line 100
    .line 101
    goto/16 :goto_5

    .line 102
    .line 103
    :cond_3
    move v1, v3

    .line 104
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_4

    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_4
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_5

    .line 119
    .line 120
    invoke-virtual {v0}, Lka/g;->a()Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_5

    .line 129
    .line 130
    goto/16 :goto_5

    .line 131
    .line 132
    :cond_5
    iget-object v0, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-nez v4, :cond_6

    .line 139
    .line 140
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    goto :goto_1

    .line 149
    :cond_6
    const-string v4, ":\n"

    .line 150
    .line 151
    invoke-static {v0, v4, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_7

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_7
    const-string v4, ":\\n"

    .line 159
    .line 160
    invoke-static {v0, v4, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_8

    .line 165
    .line 166
    :goto_0
    invoke-static {v0, v4}, Log/m;->K0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    goto :goto_1

    .line 179
    :cond_8
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    :goto_1
    invoke-virtual {v2, v0}, Lka/f;->c(Ljava/lang/String;)Lka/d;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    if-eqz v7, :cond_c

    .line 192
    .line 193
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_b

    .line 198
    .line 199
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->a()Lg8/a;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-eqz v0, :cond_9

    .line 211
    .line 212
    invoke-virtual {v0}, Lg8/a;->c()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    goto :goto_2

    .line 217
    :cond_9
    const/4 v0, 0x0

    .line 218
    :goto_2
    if-nez v0, :cond_a

    .line 219
    .line 220
    const-string v0, ""

    .line 221
    .line 222
    :cond_a
    :goto_3
    move-object v6, v0

    .line 223
    goto :goto_4

    .line 224
    :cond_b
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->getSendTalker()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    goto :goto_3

    .line 229
    :goto_4
    iget-wide v4, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 230
    .line 231
    iget-object p1, v2, Lka/f;->e:Ljava/util/concurrent/ExecutorService;

    .line 232
    .line 233
    new-instance v1, Lka/c;

    .line 234
    .line 235
    invoke-direct/range {v1 .. v7}, Lka/c;-><init>(Lka/f;Ljava/lang/String;JLjava/lang/String;Lka/d;)V

    .line 236
    .line 237
    .line 238
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 239
    .line 240
    .line 241
    :cond_c
    :goto_5
    return-void

    .line 242
    :pswitch_1
    iget-object v0, p0, Lk8/m;->b:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Lk8/p;

    .line 245
    .line 246
    iget-object p1, p1, Lb/e;->i:Ljava/lang/Object;

    .line 247
    .line 248
    move-object v11, p1

    .line 249
    check-cast v11, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 250
    .line 251
    if-nez v11, :cond_d

    .line 252
    .line 253
    goto/16 :goto_e

    .line 254
    .line 255
    :cond_d
    iget-boolean p1, v0, Lk8/p;->h:Z

    .line 256
    .line 257
    if-eqz p1, :cond_e

    .line 258
    .line 259
    invoke-virtual {v11}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-nez p1, :cond_e

    .line 264
    .line 265
    goto/16 :goto_e

    .line 266
    .line 267
    :cond_e
    invoke-virtual {v11}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    if-eqz p1, :cond_10

    .line 272
    .line 273
    iget-object p1, v11, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 274
    .line 275
    iget-object v1, v11, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 276
    .line 277
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-nez v2, :cond_10

    .line 282
    .line 283
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_f

    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_f
    iget-object v2, v0, Lk8/p;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 291
    .line 292
    new-instance v3, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const/16 p1, 0xa

    .line 301
    .line 302
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    check-cast p1, Ljava/lang/Long;

    .line 317
    .line 318
    if-eqz p1, :cond_10

    .line 319
    .line 320
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 321
    .line 322
    .line 323
    move-result-wide v1

    .line 324
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 325
    .line 326
    .line 327
    move-result-wide v3

    .line 328
    sub-long/2addr v1, v3

    .line 329
    const-wide/16 v3, 0x2710

    .line 330
    .line 331
    cmp-long p1, v1, v3

    .line 332
    .line 333
    if-gez p1, :cond_10

    .line 334
    .line 335
    goto/16 :goto_e

    .line 336
    .line 337
    :cond_10
    :goto_6
    invoke-virtual {v11}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    if-eqz p1, :cond_11

    .line 342
    .line 343
    iget-object p1, v11, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 344
    .line 345
    iget-object v1, v11, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {p1, v1}, Lk8/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_11
    new-instance v1, Lk8/o;

    .line 351
    .line 352
    invoke-virtual {v0, v11}, Lk8/p;->d(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    iget-object v4, v11, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 357
    .line 358
    invoke-virtual {v11}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    const-string v2, ""

    .line 363
    .line 364
    if-eqz p1, :cond_13

    .line 365
    .line 366
    iget-object p1, v0, Lk8/p;->d:Lg8/a;

    .line 367
    .line 368
    if-eqz p1, :cond_12

    .line 369
    .line 370
    invoke-virtual {p1}, Lg8/a;->c()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    goto :goto_7

    .line 375
    :cond_12
    move-object p1, v2

    .line 376
    :goto_7
    move-object v5, p1

    .line 377
    goto :goto_8

    .line 378
    :cond_13
    move-object v5, v2

    .line 379
    :goto_8
    iget-object v6, v11, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 380
    .line 381
    iget-object p1, v0, Lk8/p;->c:Lk8/q;

    .line 382
    .line 383
    if-eqz p1, :cond_14

    .line 384
    .line 385
    invoke-static {v6}, Lk8/q;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    move-object v7, p1

    .line 390
    goto :goto_9

    .line 391
    :cond_14
    move-object v7, v6

    .line 392
    :goto_9
    iget-object p1, v11, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 393
    .line 394
    iget-object v8, v0, Lk8/p;->c:Lk8/q;

    .line 395
    .line 396
    if-nez v8, :cond_15

    .line 397
    .line 398
    :goto_a
    move-object v8, v2

    .line 399
    goto :goto_b

    .line 400
    :cond_15
    invoke-static {p1}, Lk8/q;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    const-string v2, "nativeurl"

    .line 405
    .line 406
    invoke-static {p1, v2}, Lk8/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    goto :goto_a

    .line 411
    :goto_b
    iget-object p1, v11, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 412
    .line 413
    iget-object v2, v0, Lk8/p;->c:Lk8/q;

    .line 414
    .line 415
    if-eqz v2, :cond_16

    .line 416
    .line 417
    invoke-static {p1}, Lk8/q;->f(Ljava/lang/String;)Z

    .line 418
    .line 419
    .line 420
    move-result p1

    .line 421
    if-eqz p1, :cond_16

    .line 422
    .line 423
    const/4 p1, 0x1

    .line 424
    :goto_c
    move v9, p1

    .line 425
    goto :goto_d

    .line 426
    :cond_16
    const/4 p1, 0x0

    .line 427
    goto :goto_c

    .line 428
    :goto_d
    invoke-virtual {v11}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    const/4 v12, 0x0

    .line 433
    const-string v2, "message_db"

    .line 434
    .line 435
    invoke-direct/range {v1 .. v12}, Lk8/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLh/Hchat/hooks/api/model/WeChatMessage;Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v1}, Lk8/p;->a(Lk8/o;)V

    .line 439
    .line 440
    .line 441
    :goto_e
    return-void

    .line 442
    nop

    .line 443
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
