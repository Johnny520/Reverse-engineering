.class public final synthetic Ldb/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lcb/f;

.field public final synthetic i:Ldb/c;


# direct methods
.method public synthetic constructor <init>(Lcb/f;Ldb/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldb/d;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ldb/d;->h:Lcb/f;

    .line 4
    .line 5
    iput-object p2, p0, Ldb/d;->i:Ldb/c;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ldb/d;->g:I

    .line 4
    .line 5
    iget-object v2, v1, Ldb/d;->h:Lcb/f;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Ldb/d;->i:Ldb/c;

    .line 11
    .line 12
    iget-object v3, v0, Ldb/c;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-wide v4, v0, Ldb/c;->g:J

    .line 15
    .line 16
    iget-object v0, v2, Lcb/f;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ldb/g;

    .line 19
    .line 20
    invoke-virtual {v0}, Ldb/g;->c()Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0, v3}, Ldb/g;->b(Ljava/lang/String;)Ldb/c;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    if-eqz v7, :cond_c

    .line 33
    .line 34
    iget-wide v8, v7, Ldb/c;->g:J

    .line 35
    .line 36
    cmp-long v4, v8, v4

    .line 37
    .line 38
    if-nez v4, :cond_c

    .line 39
    .line 40
    iget-object v4, v7, Ldb/c;->m:Ljava/lang/String;

    .line 41
    .line 42
    const-string v5, "running"

    .line 43
    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    cmp-long v6, v4, v8

    .line 57
    .line 58
    if-gez v6, :cond_2

    .line 59
    .line 60
    sub-long/2addr v8, v4

    .line 61
    invoke-virtual {v2, v7, v8, v9}, Lcb/f;->s(Ldb/c;J)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_2
    const-string v6, "scheduled_task:"

    .line 67
    .line 68
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    iget-object v10, v2, Lcb/f;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v10, Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    .line 76
    invoke-virtual {v10, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lcb/f;->u()Lo8/j;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    if-eqz v10, :cond_3

    .line 84
    .line 85
    invoke-virtual {v10, v6}, Lo8/j;->a(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    sub-long/2addr v4, v8

    .line 89
    const-wide/16 v8, 0x0

    .line 90
    .line 91
    cmp-long v6, v4, v8

    .line 92
    .line 93
    if-gez v6, :cond_4

    .line 94
    .line 95
    move-wide v4, v8

    .line 96
    :cond_4
    const-wide/32 v8, 0xea60

    .line 97
    .line 98
    .line 99
    cmp-long v6, v4, v8

    .line 100
    .line 101
    const/4 v8, 0x0

    .line 102
    if-gtz v6, :cond_5

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    iget-boolean v6, v7, Ldb/c;->l:Z

    .line 106
    .line 107
    if-nez v6, :cond_6

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    iget v6, v7, Ldb/c;->h:I

    .line 111
    .line 112
    if-nez v6, :cond_8

    .line 113
    .line 114
    const-wide/32 v9, 0x927c0

    .line 115
    .line 116
    .line 117
    cmp-long v4, v4, v9

    .line 118
    .line 119
    if-gez v4, :cond_7

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_7
    :goto_0
    invoke-virtual {v2, v7, v8, v8}, Lcb/f;->d(Ldb/c;II)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_4

    .line 126
    .line 127
    :cond_8
    :goto_1
    const-string v20, "running"

    .line 128
    .line 129
    const/16 v30, 0x0

    .line 130
    .line 131
    const v31, 0x3fefff

    .line 132
    .line 133
    .line 134
    move v4, v8

    .line 135
    const/4 v8, 0x0

    .line 136
    const/4 v9, 0x0

    .line 137
    const/4 v10, 0x0

    .line 138
    const/4 v11, 0x0

    .line 139
    const/4 v12, 0x0

    .line 140
    const-wide/16 v13, 0x0

    .line 141
    .line 142
    const/4 v15, 0x0

    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const/16 v18, 0x0

    .line 148
    .line 149
    const/16 v19, 0x0

    .line 150
    .line 151
    const-wide/16 v21, 0x0

    .line 152
    .line 153
    const/16 v23, 0x0

    .line 154
    .line 155
    const/16 v24, 0x0

    .line 156
    .line 157
    const/16 v25, 0x0

    .line 158
    .line 159
    const/16 v26, 0x0

    .line 160
    .line 161
    const/16 v27, 0x0

    .line 162
    .line 163
    const/16 v28, 0x0

    .line 164
    .line 165
    const/16 v29, 0x0

    .line 166
    .line 167
    invoke-static/range {v7 .. v31}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v0, v5}, Ldb/g;->d(Ldb/c;)V

    .line 172
    .line 173
    .line 174
    const/4 v6, 0x1

    .line 175
    const/4 v7, 0x0

    .line 176
    :try_start_0
    iget-object v0, v2, Lcb/f;->b:Lr8/g;

    .line 177
    .line 178
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 179
    .line 180
    const-class v8, Landroid/os/PowerManager;

    .line 181
    .line 182
    invoke-virtual {v0, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Landroid/os/PowerManager;

    .line 187
    .line 188
    if-eqz v0, :cond_a

    .line 189
    .line 190
    const-string v8, "Hchat:ScheduledTask"

    .line 191
    .line 192
    invoke-virtual {v0, v6, v8}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0, v4}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 197
    .line 198
    .line 199
    const-wide/32 v8, 0x1b7740

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v8, v9}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :catchall_0
    move-exception v0

    .line 207
    new-instance v4, Lsf/f;

    .line 208
    .line 209
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    move-object v0, v4

    .line 213
    :goto_2
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    if-nez v4, :cond_9

    .line 218
    .line 219
    move-object v7, v0

    .line 220
    goto :goto_3

    .line 221
    :cond_9
    iget-object v0, v2, Lcb/f;->d:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, Lab/b;

    .line 224
    .line 225
    const-string v8, "\u5b9a\u65f6\u4efb\u52a1 WakeLock \u83b7\u53d6\u5931\u8d25"

    .line 226
    .line 227
    invoke-virtual {v0, v8, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    :goto_3
    check-cast v7, Landroid/os/PowerManager$WakeLock;

    .line 231
    .line 232
    :cond_a
    new-instance v0, Lac/l;

    .line 233
    .line 234
    const/16 v4, 0xa

    .line 235
    .line 236
    invoke-direct {v0, v2, v5, v7, v4}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 237
    .line 238
    .line 239
    invoke-static {}, Lcb/f;->u()Lo8/j;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    if-eqz v2, :cond_b

    .line 244
    .line 245
    invoke-virtual {v2, v0}, Lo8/j;->d(Ljava/lang/Runnable;)V

    .line 246
    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_b
    new-instance v2, Ljava/lang/Thread;

    .line 250
    .line 251
    const-string v4, "Hchat-ScheduledTask-"

    .line 252
    .line 253
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-direct {v2, v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v6}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 264
    .line 265
    .line 266
    :cond_c
    :goto_4
    return-void

    .line 267
    :pswitch_0
    iget-object v3, v1, Ldb/d;->i:Ldb/c;

    .line 268
    .line 269
    :try_start_1
    invoke-virtual {v2, v3}, Lcb/f;->t(Ldb/c;)Lsf/e;

    .line 270
    .line 271
    .line 272
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 273
    goto :goto_5

    .line 274
    :catchall_1
    move-exception v0

    .line 275
    new-instance v4, Lsf/f;

    .line 276
    .line 277
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 278
    .line 279
    .line 280
    move-object v0, v4

    .line 281
    :goto_5
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    if-nez v4, :cond_d

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_d
    iget-object v0, v2, Lcb/f;->d:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, Lab/b;

    .line 291
    .line 292
    const-string v5, "\u5b9a\u65f6\u4efb\u52a1\u7acb\u5373\u6267\u884c\u5f02\u5e38"

    .line 293
    .line 294
    invoke-virtual {v0, v5, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    const/4 v0, 0x0

    .line 298
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-static {v3}, Lcb/f;->b(Ldb/c;)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    new-instance v5, Lsf/e;

    .line 311
    .line 312
    invoke-direct {v5, v0, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    move-object v0, v5

    .line 316
    :goto_6
    check-cast v0, Lsf/e;

    .line 317
    .line 318
    iget-object v4, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v4, Ljava/lang/Number;

    .line 321
    .line 322
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 323
    .line 324
    .line 325
    move-result v21

    .line 326
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, Ljava/lang/Number;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result v22

    .line 334
    monitor-enter v2

    .line 335
    :try_start_2
    iget-object v0, v2, Lcb/f;->e:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Ldb/g;

    .line 338
    .line 339
    iget-object v3, v3, Ldb/c;->a:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v0, v3}, Ldb/g;->b(Ljava/lang/String;)Ldb/c;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    if-eqz v5, :cond_e

    .line 346
    .line 347
    iget-object v0, v2, Lcb/f;->e:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Ldb/g;

    .line 350
    .line 351
    const-string v18, "pending"

    .line 352
    .line 353
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 354
    .line 355
    .line 356
    move-result-wide v19

    .line 357
    const/16 v28, 0x0

    .line 358
    .line 359
    const v29, 0x3f0fff

    .line 360
    .line 361
    .line 362
    const/4 v6, 0x0

    .line 363
    const/4 v7, 0x0

    .line 364
    const/4 v8, 0x0

    .line 365
    const/4 v9, 0x0

    .line 366
    const/4 v10, 0x0

    .line 367
    const-wide/16 v11, 0x0

    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    const/4 v14, 0x0

    .line 371
    const/4 v15, 0x0

    .line 372
    const/16 v16, 0x0

    .line 373
    .line 374
    const/16 v17, 0x0

    .line 375
    .line 376
    const/16 v23, 0x0

    .line 377
    .line 378
    const/16 v24, 0x0

    .line 379
    .line 380
    const/16 v25, 0x0

    .line 381
    .line 382
    const/16 v26, 0x0

    .line 383
    .line 384
    const/16 v27, 0x0

    .line 385
    .line 386
    invoke-static/range {v5 .. v29}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    invoke-virtual {v0, v3}, Ldb/g;->d(Ldb/c;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, Lcb/f;->r()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 394
    .line 395
    .line 396
    monitor-exit v2

    .line 397
    goto :goto_7

    .line 398
    :catchall_2
    move-exception v0

    .line 399
    goto :goto_8

    .line 400
    :cond_e
    monitor-exit v2

    .line 401
    :goto_7
    return-void

    .line 402
    :goto_8
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 403
    throw v0

    .line 404
    nop

    .line 405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
