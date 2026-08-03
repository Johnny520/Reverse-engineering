.class public final synthetic Lrb/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p2, p0, Lrb/g;->g:I

    iput-object p1, p0, Lrb/g;->h:Ljava/lang/Object;

    iput-object p3, p0, Lrb/g;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lwb/ep;Lwb/dp;)V
    .locals 0

    .line 1
    const/16 p2, 0xd

    .line 2
    .line 3
    iput p2, p0, Lrb/g;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lrb/g;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Lrb/g;->i:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 41

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lrb/g;->g:I

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ly9/e;

    .line 16
    .line 17
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ly9/d;

    .line 20
    .line 21
    iget-object v3, v0, Ly9/e;->e:Ljava/util/Map;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    monitor-enter v3

    .line 27
    :try_start_0
    iget-object v4, v0, Ly9/e;->e:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Ljava/lang/Iterable;

    .line 34
    .line 35
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    monitor-exit v3

    .line 40
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Landroid/widget/TextView;

    .line 61
    .line 62
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ly9/d;

    .line 67
    .line 68
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_0

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v4, v2, Ly9/d;->a:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v6, v2, Ly9/d;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v5, v4, v6}, Ly9/e;->a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    return-void

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    monitor-exit v3

    .line 88
    throw v0

    .line 89
    :pswitch_0
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Ly9/e;

    .line 92
    .line 93
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Ljava/lang/String;

    .line 96
    .line 97
    iget-object v3, v0, Ly9/e;->e:Ljava/util/Map;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    monitor-enter v3

    .line 103
    :try_start_1
    iget-object v4, v0, Ly9/e;->e:Ljava/util/Map;

    .line 104
    .line 105
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Ljava/lang/Iterable;

    .line 110
    .line 111
    invoke-static {v4}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    monitor-exit v3

    .line 116
    check-cast v4, Ljava/lang/Iterable;

    .line 117
    .line 118
    new-instance v3, Ldg/n;

    .line 119
    .line 120
    const/4 v6, 0x6

    .line 121
    invoke-direct {v3, v4, v6}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    new-instance v4, Lca/s;

    .line 125
    .line 126
    const/16 v6, 0x17

    .line 127
    .line 128
    invoke-direct {v4, v2, v6}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    new-instance v2, Lng/i;

    .line 132
    .line 133
    invoke-direct {v2, v3, v5, v4}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v2}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-eqz v3, :cond_3

    .line 149
    .line 150
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Ly9/d;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    if-eqz v4, :cond_2

    .line 164
    .line 165
    new-instance v5, Lrb/g;

    .line 166
    .line 167
    const/16 v6, 0x16

    .line 168
    .line 169
    invoke-direct {v5, v0, v6, v3}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v5}, Lo8/j;->e(Ljava/lang/Runnable;)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_3
    return-void

    .line 177
    :catchall_1
    move-exception v0

    .line 178
    monitor-exit v3

    .line 179
    throw v0

    .line 180
    :pswitch_1
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Ly1/x2;

    .line 183
    .line 184
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v2, Landroidx/lifecycle/s;

    .line 187
    .line 188
    iget-boolean v3, v0, Ly1/x2;->i:Z

    .line 189
    .line 190
    if-nez v3, :cond_4

    .line 191
    .line 192
    iput-object v2, v0, Ly1/x2;->j:Landroidx/lifecycle/s;

    .line 193
    .line 194
    invoke-virtual {v2, v0}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/p;)V

    .line 195
    .line 196
    .line 197
    :cond_4
    return-void

    .line 198
    :pswitch_2
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Lx8/k;

    .line 201
    .line 202
    iget-object v2, v0, Lx8/k;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 203
    .line 204
    iget-object v5, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v5, Lx8/k;

    .line 207
    .line 208
    :goto_2
    :try_start_2
    iget-object v8, v0, Lx8/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 209
    .line 210
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-nez v8, :cond_9

    .line 215
    .line 216
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 217
    .line 218
    .line 219
    move-result-wide v8

    .line 220
    iget-object v10, v0, Lx8/k;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 221
    .line 222
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 223
    .line 224
    .line 225
    move-result-wide v10

    .line 226
    sub-long/2addr v8, v10

    .line 227
    iget-wide v10, v0, Lx8/k;->e:J

    .line 228
    .line 229
    sub-long/2addr v10, v8

    .line 230
    cmp-long v8, v10, v3

    .line 231
    .line 232
    if-gtz v8, :cond_7

    .line 233
    .line 234
    sget-object v3, Lx8/q;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 235
    .line 236
    :cond_5
    invoke-virtual {v3, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-eqz v4, :cond_6

    .line 241
    .line 242
    const-string v3, "idle timeout"

    .line 243
    .line 244
    invoke-virtual {v0, v3}, Lx8/k;->b(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :catchall_2
    move-exception v0

    .line 249
    goto :goto_4

    .line 250
    :cond_6
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    if-eq v4, v5, :cond_5

    .line 255
    .line 256
    const-string v3, "idle replaced"

    .line 257
    .line 258
    invoke-virtual {v0, v3}, Lx8/k;->b(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_7
    const-wide/16 v8, 0x3e8

    .line 263
    .line 264
    cmp-long v12, v10, v8

    .line 265
    .line 266
    if-gez v12, :cond_8

    .line 267
    .line 268
    move-wide v10, v8

    .line 269
    :cond_8
    invoke-static {v10, v11}, Ljava/lang/Thread;->sleep(J)V

    .line 270
    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_9
    :goto_3
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :goto_4
    new-instance v3, Lsf/f;

    .line 277
    .line 278
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    move-object v0, v3

    .line 282
    :goto_5
    invoke-virtual {v2, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 283
    .line 284
    .line 285
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-eqz v0, :cond_a

    .line 290
    .line 291
    invoke-virtual {v2, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    const-string v3, "[Hchat:AutoReply] \u5c0f\u667aMCP\u7a7a\u95f2\u68c0\u67e5\u5931\u8d25: "

    .line 299
    .line 300
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 301
    .line 302
    .line 303
    :cond_a
    return-void

    .line 304
    :pswitch_3
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, Landroid/content/Context;

    .line 307
    .line 308
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v2, Lwb/st;

    .line 311
    .line 312
    iget-object v2, v2, Lwb/st;->b:Lfb/i2;

    .line 313
    .line 314
    sget-object v3, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    :try_start_3
    invoke-static {v0, v2}, Lfb/t2;->g(Landroid/content/Context;Lfb/i2;)Ljava/io/File;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v0}, Lfb/t2;->q(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 324
    .line 325
    .line 326
    :catchall_3
    return-void

    .line 327
    :pswitch_4
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Landroid/content/Context;

    .line 330
    .line 331
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v2, Lfb/j2;

    .line 334
    .line 335
    :try_start_4
    sget-object v3, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 341
    .line 342
    .line 343
    :try_start_5
    iget-object v2, v2, Lfb/j2;->a:Ljava/lang/String;

    .line 344
    .line 345
    invoke-static {v0, v2}, Lfb/t2;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v0}, Lfb/t2;->q(Ljava/io/File;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 350
    .line 351
    .line 352
    :catchall_4
    :try_start_6
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :catchall_5
    move-exception v0

    .line 356
    new-instance v2, Lsf/f;

    .line 357
    .line 358
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 359
    .line 360
    .line 361
    move-object v0, v2

    .line 362
    :goto_6
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    if-eqz v0, :cond_b

    .line 367
    .line 368
    const-string v2, "[Hchat:ScriptAgent] \u6e05\u7406\u6062\u590d\u5de5\u4f5c\u533a\u5931\u8d25"

    .line 369
    .line 370
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 371
    .line 372
    .line 373
    :cond_b
    return-void

    .line 374
    :pswitch_5
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Lwb/gr;

    .line 377
    .line 378
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v2, Ljava/util/ArrayList;

    .line 381
    .line 382
    iget-object v0, v0, Lwb/gr;->c:Lwb/ns;

    .line 383
    .line 384
    invoke-virtual {v0, v2}, Lwb/ns;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :pswitch_6
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, Landroid/content/Context;

    .line 391
    .line 392
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v2, Ljava/lang/Throwable;

    .line 395
    .line 396
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    if-eqz v2, :cond_c

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_c
    const-string v2, "\u8bfb\u53d6\u9644\u4ef6\u5931\u8d25"

    .line 404
    .line 405
    :goto_7
    invoke-static {v0, v2, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 410
    .line 411
    .line 412
    return-void

    .line 413
    :pswitch_7
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v0, Lwb/dp;

    .line 416
    .line 417
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v2, Ljava/util/ArrayList;

    .line 420
    .line 421
    iget-object v0, v0, Lwb/dp;->b:Lwb/kp;

    .line 422
    .line 423
    invoke-virtual {v0, v2}, Lwb/kp;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    return-void

    .line 427
    :pswitch_8
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v0, Ljava/util/List;

    .line 430
    .line 431
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v2, Lwb/dp;

    .line 434
    .line 435
    new-instance v5, Ljava/util/ArrayList;

    .line 436
    .line 437
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 438
    .line 439
    .line 440
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-eqz v0, :cond_17

    .line 449
    .line 450
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    check-cast v0, Landroid/net/Uri;

    .line 455
    .line 456
    iget-object v9, v2, Lwb/dp;->a:Landroid/app/Activity;

    .line 457
    .line 458
    sget-object v10, Lwb/ep;->a:Lwb/ep;

    .line 459
    .line 460
    :try_start_7
    invoke-static {v9, v0}, Lwb/ho;->C6(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v10

    .line 464
    const/16 v11, 0x2f

    .line 465
    .line 466
    if-eqz v10, :cond_e

    .line 467
    .line 468
    invoke-static {v10, v11, v10}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v10

    .line 472
    const/16 v12, 0x5c

    .line 473
    .line 474
    invoke-static {v10, v12, v10}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v10

    .line 478
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 479
    .line 480
    .line 481
    move-result v12

    .line 482
    if-eqz v12, :cond_d

    .line 483
    .line 484
    move-object v10, v6

    .line 485
    :cond_d
    if-eqz v10, :cond_e

    .line 486
    .line 487
    goto :goto_a

    .line 488
    :catchall_6
    move-exception v0

    .line 489
    move-wide/from16 v16, v3

    .line 490
    .line 491
    goto/16 :goto_10

    .line 492
    .line 493
    :cond_e
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v10

    .line 497
    if-eqz v10, :cond_f

    .line 498
    .line 499
    invoke-static {v10, v11, v10}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v10

    .line 503
    goto :goto_9

    .line 504
    :cond_f
    move-object v10, v6

    .line 505
    :goto_9
    if-nez v10, :cond_10

    .line 506
    .line 507
    const-string v10, ""

    .line 508
    .line 509
    :cond_10
    :goto_a
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 510
    .line 511
    .line 512
    move-result v11

    .line 513
    if-nez v11, :cond_14

    .line 514
    .line 515
    new-instance v11, Ljava/io/ByteArrayOutputStream;

    .line 516
    .line 517
    invoke-direct {v11}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 518
    .line 519
    .line 520
    :try_start_8
    invoke-virtual {v9}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 521
    .line 522
    .line 523
    move-result-object v12

    .line 524
    invoke-virtual {v12, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 525
    .line 526
    .line 527
    move-result-object v12
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 528
    if-eqz v12, :cond_13

    .line 529
    .line 530
    const v0, 0x8000

    .line 531
    .line 532
    .line 533
    :try_start_9
    new-array v0, v0, [B

    .line 534
    .line 535
    move-wide v13, v3

    .line 536
    :goto_b
    invoke-virtual {v12, v0}, Ljava/io/InputStream;->read([B)I

    .line 537
    .line 538
    .line 539
    move-result v15
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 540
    if-gez v15, :cond_11

    .line 541
    .line 542
    :try_start_a
    invoke-interface {v12}, Ljava/io/Closeable;->close()V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v11}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 546
    .line 547
    .line 548
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 549
    :try_start_b
    invoke-virtual {v11}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 550
    .line 551
    .line 552
    sget-object v11, Lgb/k;->a:Ljava/util/Set;

    .line 553
    .line 554
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    invoke-static {v10, v0}, Lgb/k;->c(Ljava/lang/String;[B)Lgb/g;

    .line 558
    .line 559
    .line 560
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 561
    move-wide/from16 v16, v3

    .line 562
    .line 563
    goto :goto_11

    .line 564
    :catchall_7
    move-exception v0

    .line 565
    move-wide/from16 v16, v3

    .line 566
    .line 567
    :goto_c
    move-object v3, v0

    .line 568
    goto :goto_f

    .line 569
    :cond_11
    move-wide/from16 v16, v3

    .line 570
    .line 571
    int-to-long v3, v15

    .line 572
    add-long/2addr v13, v3

    .line 573
    const-wide/32 v3, 0x1000000

    .line 574
    .line 575
    .line 576
    cmp-long v3, v13, v3

    .line 577
    .line 578
    if-gtz v3, :cond_12

    .line 579
    .line 580
    :try_start_c
    invoke-virtual {v11, v0, v7, v15}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 581
    .line 582
    .line 583
    move-wide/from16 v3, v16

    .line 584
    .line 585
    goto :goto_b

    .line 586
    :catchall_8
    move-exception v0

    .line 587
    :goto_d
    move-object v3, v0

    .line 588
    goto :goto_e

    .line 589
    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    const-string v3, " \u8d85\u8fc7 16384 KiB"

    .line 598
    .line 599
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 607
    .line 608
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    throw v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 616
    :catchall_9
    move-exception v0

    .line 617
    move-wide/from16 v16, v3

    .line 618
    .line 619
    goto :goto_d

    .line 620
    :goto_e
    :try_start_d
    throw v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 621
    :catchall_a
    move-exception v0

    .line 622
    :try_start_e
    invoke-static {v12, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 623
    .line 624
    .line 625
    throw v0

    .line 626
    :catchall_b
    move-exception v0

    .line 627
    goto :goto_c

    .line 628
    :cond_13
    move-wide/from16 v16, v3

    .line 629
    .line 630
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 631
    .line 632
    const-string v3, "\u65e0\u6cd5\u6253\u5f00\u6240\u9009\u6587\u4ef6"

    .line 633
    .line 634
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    .line 638
    :goto_f
    :try_start_f
    throw v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_c

    .line 639
    :catchall_c
    move-exception v0

    .line 640
    :try_start_10
    invoke-static {v11, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 641
    .line 642
    .line 643
    throw v0

    .line 644
    :catchall_d
    move-exception v0

    .line 645
    goto :goto_10

    .line 646
    :cond_14
    move-wide/from16 v16, v3

    .line 647
    .line 648
    const-string v0, "\u65e0\u6cd5\u8bfb\u53d6\u6240\u9009\u6587\u4ef6\u540d"

    .line 649
    .line 650
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 651
    .line 652
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    throw v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_d

    .line 656
    :goto_10
    new-instance v3, Lsf/f;

    .line 657
    .line 658
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 659
    .line 660
    .line 661
    move-object v0, v3

    .line 662
    :goto_11
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    if-nez v3, :cond_15

    .line 667
    .line 668
    goto :goto_12

    .line 669
    :cond_15
    new-instance v0, Landroid/os/Handler;

    .line 670
    .line 671
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 676
    .line 677
    .line 678
    new-instance v4, Lrb/g;

    .line 679
    .line 680
    const/16 v10, 0xc

    .line 681
    .line 682
    invoke-direct {v4, v9, v10, v3}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 686
    .line 687
    .line 688
    move-object v0, v6

    .line 689
    :goto_12
    check-cast v0, Lgb/g;

    .line 690
    .line 691
    if-eqz v0, :cond_16

    .line 692
    .line 693
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    :cond_16
    move-wide/from16 v3, v16

    .line 697
    .line 698
    goto/16 :goto_8

    .line 699
    .line 700
    :cond_17
    new-instance v0, Ljava/util/HashSet;

    .line 701
    .line 702
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 703
    .line 704
    .line 705
    new-instance v3, Ljava/util/ArrayList;

    .line 706
    .line 707
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    :cond_18
    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    if-eqz v5, :cond_19

    .line 719
    .line 720
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v5

    .line 724
    move-object v6, v5

    .line 725
    check-cast v6, Lgb/g;

    .line 726
    .line 727
    iget-object v6, v6, Lgb/g;->a:Ljava/lang/String;

    .line 728
    .line 729
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 730
    .line 731
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v6

    .line 738
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v6

    .line 745
    if-eqz v6, :cond_18

    .line 746
    .line 747
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    goto :goto_13

    .line 751
    :cond_19
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    if-nez v0, :cond_1a

    .line 756
    .line 757
    new-instance v0, Landroid/os/Handler;

    .line 758
    .line 759
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 760
    .line 761
    .line 762
    move-result-object v4

    .line 763
    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 764
    .line 765
    .line 766
    new-instance v4, Lrb/g;

    .line 767
    .line 768
    const/16 v5, 0xe

    .line 769
    .line 770
    invoke-direct {v4, v2, v5, v3}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 774
    .line 775
    .line 776
    :cond_1a
    return-void

    .line 777
    :pswitch_9
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v0, Landroid/app/Activity;

    .line 780
    .line 781
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v2, Ljava/lang/Throwable;

    .line 784
    .line 785
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    if-eqz v2, :cond_1b

    .line 790
    .line 791
    goto :goto_14

    .line 792
    :cond_1b
    const-string v2, "\u8bfb\u53d6\u9644\u52a0\u6587\u4ef6\u5931\u8d25"

    .line 793
    .line 794
    :goto_14
    invoke-static {v0, v2, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 799
    .line 800
    .line 801
    return-void

    .line 802
    :pswitch_a
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 803
    .line 804
    check-cast v0, Landroid/app/Activity;

    .line 805
    .line 806
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast v2, Lhb/e0;

    .line 809
    .line 810
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 811
    .line 812
    .line 813
    move-result v3

    .line 814
    if-nez v3, :cond_1c

    .line 815
    .line 816
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    if-nez v0, :cond_1c

    .line 821
    .line 822
    invoke-virtual {v2}, Lhb/e0;->invoke()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    :cond_1c
    return-void

    .line 826
    :pswitch_b
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v0, Lwb/la;

    .line 829
    .line 830
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 831
    .line 832
    check-cast v2, Ljava/lang/Throwable;

    .line 833
    .line 834
    new-instance v3, Lwb/j5;

    .line 835
    .line 836
    invoke-direct {v3}, Lwb/j5;-><init>()V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v0, v3, v2}, Lwb/la;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    return-void

    .line 843
    :pswitch_c
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v0, Lwb/la;

    .line 846
    .line 847
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast v2, Ljava/lang/Throwable;

    .line 850
    .line 851
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 852
    .line 853
    invoke-virtual {v0, v3, v2}, Lwb/la;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    return-void

    .line 857
    :pswitch_d
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast v0, Lwb/la;

    .line 860
    .line 861
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v2, Ljava/util/List;

    .line 864
    .line 865
    invoke-virtual {v0, v2, v6}, Lwb/la;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    return-void

    .line 869
    :pswitch_e
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 870
    .line 871
    check-cast v0, Lfg/p;

    .line 872
    .line 873
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v2, Ljava/lang/Throwable;

    .line 876
    .line 877
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 878
    .line 879
    invoke-interface {v0, v3, v2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    return-void

    .line 883
    :pswitch_f
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 884
    .line 885
    check-cast v0, Lfg/p;

    .line 886
    .line 887
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v2, Ljava/util/List;

    .line 890
    .line 891
    invoke-interface {v0, v2, v6}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    return-void

    .line 895
    :pswitch_10
    move-wide/from16 v16, v3

    .line 896
    .line 897
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v0, Lv8/q;

    .line 900
    .line 901
    iget-object v3, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 902
    .line 903
    check-cast v3, Lk8/o;

    .line 904
    .line 905
    iget-boolean v4, v3, Lk8/o;->i:Z

    .line 906
    .line 907
    const/16 v8, 0x2712

    .line 908
    .line 909
    const/16 v9, 0x2710

    .line 910
    .line 911
    if-eqz v4, :cond_2e

    .line 912
    .line 913
    iget-object v4, v0, Lv8/q;->g:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 914
    .line 915
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 916
    .line 917
    .line 918
    move-result-wide v11

    .line 919
    iget-object v13, v3, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 920
    .line 921
    iget-object v14, v3, Lk8/o;->c:Ljava/lang/String;

    .line 922
    .line 923
    iget v13, v13, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 924
    .line 925
    if-gtz v13, :cond_1d

    .line 926
    .line 927
    const v18, 0xffff

    .line 928
    .line 929
    .line 930
    goto :goto_15

    .line 931
    :cond_1d
    and-int/lit16 v15, v13, 0xff

    .line 932
    .line 933
    const v18, 0xffff

    .line 934
    .line 935
    .line 936
    and-int v10, v13, v18

    .line 937
    .line 938
    ushr-int/lit8 v19, v13, 0x10

    .line 939
    .line 940
    if-nez v19, :cond_1e

    .line 941
    .line 942
    goto :goto_15

    .line 943
    :cond_1e
    if-eq v10, v9, :cond_1f

    .line 944
    .line 945
    if-eq v10, v8, :cond_1f

    .line 946
    .line 947
    if-eqz v15, :cond_20

    .line 948
    .line 949
    if-ne v10, v15, :cond_20

    .line 950
    .line 951
    move v13, v15

    .line 952
    goto :goto_15

    .line 953
    :cond_1f
    move v13, v10

    .line 954
    :cond_20
    :goto_15
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedDeque;->iterator()Ljava/util/Iterator;

    .line 955
    .line 956
    .line 957
    move-result-object v10

    .line 958
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    :goto_16
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 962
    .line 963
    .line 964
    move-result v15

    .line 965
    if-eqz v15, :cond_2d

    .line 966
    .line 967
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v15

    .line 971
    check-cast v15, Lv8/g;

    .line 972
    .line 973
    iget-wide v5, v15, Lv8/g;->e:J

    .line 974
    .line 975
    iget-object v2, v15, Lv8/g;->c:Ljava/lang/String;

    .line 976
    .line 977
    sub-long v5, v11, v5

    .line 978
    .line 979
    const-wide/16 v21, 0x2710

    .line 980
    .line 981
    cmp-long v5, v5, v21

    .line 982
    .line 983
    if-lez v5, :cond_21

    .line 984
    .line 985
    invoke-virtual {v4, v15}, Ljava/util/concurrent/ConcurrentLinkedDeque;->remove(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    const/4 v5, 0x1

    .line 989
    const/4 v6, 0x0

    .line 990
    goto :goto_16

    .line 991
    :cond_21
    iget-object v5, v15, Lv8/g;->a:Ljava/lang/String;

    .line 992
    .line 993
    invoke-static {v5, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 994
    .line 995
    .line 996
    move-result v5

    .line 997
    if-eqz v5, :cond_2c

    .line 998
    .line 999
    iget v5, v15, Lv8/g;->b:I

    .line 1000
    .line 1001
    if-ne v5, v13, :cond_2c

    .line 1002
    .line 1003
    invoke-virtual {v0, v15}, Lv8/q;->m(Lv8/g;)V

    .line 1004
    .line 1005
    .line 1006
    iget-object v5, v3, Lk8/o;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1007
    .line 1008
    if-eqz v5, :cond_22

    .line 1009
    .line 1010
    goto :goto_17

    .line 1011
    :cond_22
    iget-object v5, v3, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1012
    .line 1013
    :goto_17
    iget-wide v8, v5, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 1014
    .line 1015
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v22

    .line 1019
    cmp-long v8, v8, v16

    .line 1020
    .line 1021
    if-lez v8, :cond_23

    .line 1022
    .line 1023
    goto :goto_18

    .line 1024
    :cond_23
    const/16 v22, 0x0

    .line 1025
    .line 1026
    :goto_18
    if-eqz v22, :cond_24

    .line 1027
    .line 1028
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Number;->longValue()J

    .line 1029
    .line 1030
    .line 1031
    move-result-wide v8

    .line 1032
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v6

    .line 1036
    if-eqz v6, :cond_24

    .line 1037
    .line 1038
    invoke-virtual {v6, v8, v9, v14}, Lk8/s;->e(JLjava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v6

    .line 1042
    goto :goto_19

    .line 1043
    :cond_24
    const/4 v6, 0x0

    .line 1044
    :goto_19
    filled-new-array {v5, v6}, [Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v6

    .line 1048
    invoke-static {v6}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v6

    .line 1052
    new-instance v8, Li2/z;

    .line 1053
    .line 1054
    const/16 v9, 0x1d

    .line 1055
    .line 1056
    invoke-direct {v8, v9}, Li2/z;-><init>(I)V

    .line 1057
    .line 1058
    .line 1059
    new-instance v9, Lng/i;

    .line 1060
    .line 1061
    invoke-direct {v9, v6, v7, v8}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1062
    .line 1063
    .line 1064
    new-instance v6, Lng/h;

    .line 1065
    .line 1066
    invoke-direct {v6, v9}, Lng/h;-><init>(Lng/i;)V

    .line 1067
    .line 1068
    .line 1069
    :goto_1a
    invoke-virtual {v6}, Lng/h;->hasNext()Z

    .line 1070
    .line 1071
    .line 1072
    move-result v8

    .line 1073
    if-eqz v8, :cond_28

    .line 1074
    .line 1075
    invoke-virtual {v6}, Lng/h;->next()Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v8

    .line 1079
    check-cast v8, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1080
    .line 1081
    move-object v9, v5

    .line 1082
    move-object/from16 v23, v6

    .line 1083
    .line 1084
    iget-wide v5, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 1085
    .line 1086
    cmp-long v24, v5, v16

    .line 1087
    .line 1088
    if-lez v24, :cond_25

    .line 1089
    .line 1090
    iget-object v7, v15, Lv8/g;->f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 1091
    .line 1092
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v5

    .line 1096
    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v5

    .line 1100
    if-nez v5, :cond_26

    .line 1101
    .line 1102
    :cond_25
    iget-wide v5, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 1103
    .line 1104
    cmp-long v7, v5, v16

    .line 1105
    .line 1106
    if-lez v7, :cond_27

    .line 1107
    .line 1108
    iget-object v7, v15, Lv8/g;->g:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 1109
    .line 1110
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v5

    .line 1114
    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    move-result v5

    .line 1118
    if-eqz v5, :cond_27

    .line 1119
    .line 1120
    :cond_26
    const/4 v5, 0x1

    .line 1121
    goto :goto_1b

    .line 1122
    :cond_27
    move-object v5, v9

    .line 1123
    move-object/from16 v6, v23

    .line 1124
    .line 1125
    const/4 v7, 0x0

    .line 1126
    goto :goto_1a

    .line 1127
    :cond_28
    move-object v9, v5

    .line 1128
    const/4 v5, 0x0

    .line 1129
    :goto_1b
    iget-object v6, v3, Lk8/o;->a:Ljava/lang/String;

    .line 1130
    .line 1131
    const-string v7, "local_send"

    .line 1132
    .line 1133
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1134
    .line 1135
    .line 1136
    move-result v6

    .line 1137
    if-eqz v6, :cond_2a

    .line 1138
    .line 1139
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1140
    .line 1141
    .line 1142
    move-result v6

    .line 1143
    if-nez v6, :cond_2a

    .line 1144
    .line 1145
    iget-object v6, v3, Lk8/o;->e:Ljava/lang/String;

    .line 1146
    .line 1147
    invoke-virtual {v9}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v7

    .line 1151
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v6

    .line 1155
    invoke-static {v6}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v6

    .line 1159
    invoke-interface {v6}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v6

    .line 1163
    :cond_29
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1164
    .line 1165
    .line 1166
    move-result v7

    .line 1167
    if-eqz v7, :cond_2a

    .line 1168
    .line 1169
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v7

    .line 1173
    check-cast v7, Ljava/lang/String;

    .line 1174
    .line 1175
    invoke-static {v7, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1176
    .line 1177
    .line 1178
    move-result v7

    .line 1179
    if-eqz v7, :cond_29

    .line 1180
    .line 1181
    const/4 v2, 0x1

    .line 1182
    goto :goto_1c

    .line 1183
    :cond_2a
    const/4 v2, 0x0

    .line 1184
    :goto_1c
    if-nez v5, :cond_2b

    .line 1185
    .line 1186
    if-eqz v2, :cond_2c

    .line 1187
    .line 1188
    :cond_2b
    invoke-virtual {v4, v15}, Ljava/util/concurrent/ConcurrentLinkedDeque;->remove(Ljava/lang/Object;)Z

    .line 1189
    .line 1190
    .line 1191
    move-result v2

    .line 1192
    goto :goto_1d

    .line 1193
    :cond_2c
    const/4 v5, 0x1

    .line 1194
    const/4 v6, 0x0

    .line 1195
    const/4 v7, 0x0

    .line 1196
    const/16 v8, 0x2712

    .line 1197
    .line 1198
    const/16 v9, 0x2710

    .line 1199
    .line 1200
    goto/16 :goto_16

    .line 1201
    .line 1202
    :cond_2d
    const/4 v2, 0x0

    .line 1203
    :goto_1d
    if-eqz v2, :cond_2f

    .line 1204
    .line 1205
    goto/16 :goto_2d

    .line 1206
    .line 1207
    :cond_2e
    const v18, 0xffff

    .line 1208
    .line 1209
    .line 1210
    :cond_2f
    sget-object v2, Lv8/r;->a:Lv8/r;

    .line 1211
    .line 1212
    iget-object v2, v0, Lv8/q;->b:Landroid/content/Context;

    .line 1213
    .line 1214
    invoke-static {v2}, Lv8/r;->a(Landroid/content/Context;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v2

    .line 1218
    if-nez v2, :cond_30

    .line 1219
    .line 1220
    goto/16 :goto_2d

    .line 1221
    .line 1222
    :cond_30
    sget-object v2, Lv8/r;->b:Ljava/util/LinkedHashSet;

    .line 1223
    .line 1224
    iget-object v4, v3, Lk8/o;->b:Ljava/lang/String;

    .line 1225
    .line 1226
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1227
    .line 1228
    .line 1229
    move-result v4

    .line 1230
    if-nez v4, :cond_36

    .line 1231
    .line 1232
    iget-object v4, v3, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1233
    .line 1234
    iget v4, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 1235
    .line 1236
    if-gtz v4, :cond_31

    .line 1237
    .line 1238
    goto :goto_1e

    .line 1239
    :cond_31
    and-int/lit16 v5, v4, 0xff

    .line 1240
    .line 1241
    and-int v6, v4, v18

    .line 1242
    .line 1243
    ushr-int/lit8 v7, v4, 0x10

    .line 1244
    .line 1245
    if-nez v7, :cond_32

    .line 1246
    .line 1247
    goto :goto_1e

    .line 1248
    :cond_32
    const/16 v7, 0x2710

    .line 1249
    .line 1250
    if-eq v6, v7, :cond_33

    .line 1251
    .line 1252
    const/16 v7, 0x2712

    .line 1253
    .line 1254
    if-eq v6, v7, :cond_33

    .line 1255
    .line 1256
    if-eqz v5, :cond_34

    .line 1257
    .line 1258
    if-ne v6, v5, :cond_34

    .line 1259
    .line 1260
    move v4, v5

    .line 1261
    goto :goto_1e

    .line 1262
    :cond_33
    move v4, v6

    .line 1263
    :cond_34
    :goto_1e
    const/16 v5, 0x3e

    .line 1264
    .line 1265
    if-ne v4, v5, :cond_35

    .line 1266
    .line 1267
    const-string v4, "video_number_video"

    .line 1268
    .line 1269
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1270
    .line 1271
    .line 1272
    move-result v2

    .line 1273
    if-eqz v2, :cond_35

    .line 1274
    .line 1275
    goto :goto_1f

    .line 1276
    :cond_35
    const/4 v2, 0x0

    .line 1277
    goto :goto_20

    .line 1278
    :cond_36
    :goto_1f
    const/4 v2, 0x1

    .line 1279
    :goto_20
    if-nez v2, :cond_37

    .line 1280
    .line 1281
    goto/16 :goto_2d

    .line 1282
    .line 1283
    :cond_37
    iget-object v2, v3, Lk8/o;->e:Ljava/lang/String;

    .line 1284
    .line 1285
    iget-object v4, v3, Lk8/o;->f:Ljava/lang/String;

    .line 1286
    .line 1287
    iget-object v5, v3, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1288
    .line 1289
    invoke-virtual {v5}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v5

    .line 1293
    filled-new-array {v2, v4, v5}, [Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v2

    .line 1297
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v2

    .line 1301
    new-instance v4, Ljava/util/ArrayList;

    .line 1302
    .line 1303
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1304
    .line 1305
    .line 1306
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v2

    .line 1310
    :cond_38
    :goto_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1311
    .line 1312
    .line 1313
    move-result v5

    .line 1314
    if-eqz v5, :cond_39

    .line 1315
    .line 1316
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v5

    .line 1320
    move-object v6, v5

    .line 1321
    check-cast v6, Ljava/lang/String;

    .line 1322
    .line 1323
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1324
    .line 1325
    .line 1326
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v6

    .line 1330
    if-nez v6, :cond_38

    .line 1331
    .line 1332
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1333
    .line 1334
    .line 1335
    goto :goto_21

    .line 1336
    :cond_39
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    invoke-static {v2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v4

    .line 1344
    const-string v5, "\n"

    .line 1345
    .line 1346
    const/4 v8, 0x0

    .line 1347
    const/16 v9, 0x3e

    .line 1348
    .line 1349
    const/4 v6, 0x0

    .line 1350
    const/4 v7, 0x0

    .line 1351
    invoke-static/range {v4 .. v9}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v35

    .line 1355
    iget-object v2, v3, Lk8/o;->d:Ljava/lang/String;

    .line 1356
    .line 1357
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1358
    .line 1359
    .line 1360
    move-result v4

    .line 1361
    if-eqz v4, :cond_3a

    .line 1362
    .line 1363
    invoke-virtual {v3}, Lk8/o;->c()Ljava/lang/String;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v2

    .line 1367
    :cond_3a
    invoke-static {v2, v2}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v31

    .line 1371
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1372
    .line 1373
    .line 1374
    move-result-wide v4

    .line 1375
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1376
    .line 1377
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1378
    .line 1379
    .line 1380
    sget-object v6, Lv8/r;->a:Lv8/r;

    .line 1381
    .line 1382
    iget-object v6, v0, Lv8/q;->b:Landroid/content/Context;

    .line 1383
    .line 1384
    invoke-static {v6}, Lv8/r;->b(Landroid/content/Context;)Ljava/util/List;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v6

    .line 1388
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v6

    .line 1392
    :cond_3b
    :goto_22
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1393
    .line 1394
    .line 1395
    move-result v7

    .line 1396
    if-eqz v7, :cond_43

    .line 1397
    .line 1398
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v7

    .line 1402
    move-object/from16 v25, v7

    .line 1403
    .line 1404
    check-cast v25, Lv8/a;

    .line 1405
    .line 1406
    iget-object v7, v3, Lk8/o;->c:Ljava/lang/String;

    .line 1407
    .line 1408
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1409
    .line 1410
    .line 1411
    iget-object v8, v3, Lk8/o;->b:Ljava/lang/String;

    .line 1412
    .line 1413
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1414
    .line 1415
    .line 1416
    iget-object v9, v3, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1417
    .line 1418
    iget v9, v9, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 1419
    .line 1420
    iget-boolean v10, v3, Lk8/o;->i:Z

    .line 1421
    .line 1422
    move-object/from16 v26, v7

    .line 1423
    .line 1424
    move-object/from16 v27, v8

    .line 1425
    .line 1426
    move/from16 v28, v9

    .line 1427
    .line 1428
    move/from16 v30, v10

    .line 1429
    .line 1430
    move-object/from16 v29, v35

    .line 1431
    .line 1432
    invoke-static/range {v25 .. v31}, Lv8/q;->n(Lv8/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)Z

    .line 1433
    .line 1434
    .line 1435
    move-result v7

    .line 1436
    move-object/from16 v8, v25

    .line 1437
    .line 1438
    if-nez v7, :cond_3c

    .line 1439
    .line 1440
    goto :goto_22

    .line 1441
    :cond_3c
    iget-object v7, v8, Lv8/a;->g:Ljava/util/Set;

    .line 1442
    .line 1443
    check-cast v7, Ljava/lang/Iterable;

    .line 1444
    .line 1445
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v7

    .line 1449
    :cond_3d
    :goto_23
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1450
    .line 1451
    .line 1452
    move-result v9

    .line 1453
    if-eqz v9, :cond_3b

    .line 1454
    .line 1455
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v9

    .line 1459
    check-cast v9, Ljava/lang/String;

    .line 1460
    .line 1461
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1462
    .line 1463
    .line 1464
    move-result v10

    .line 1465
    if-nez v10, :cond_3d

    .line 1466
    .line 1467
    iget-object v10, v3, Lk8/o;->c:Ljava/lang/String;

    .line 1468
    .line 1469
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1470
    .line 1471
    .line 1472
    move-result v10

    .line 1473
    if-nez v10, :cond_3d

    .line 1474
    .line 1475
    iget-boolean v10, v8, Lv8/a;->i:Z

    .line 1476
    .line 1477
    if-eqz v10, :cond_3f

    .line 1478
    .line 1479
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1480
    .line 1481
    iget-wide v11, v8, Lv8/a;->j:J

    .line 1482
    .line 1483
    cmp-long v13, v11, v16

    .line 1484
    .line 1485
    if-gez v13, :cond_3e

    .line 1486
    .line 1487
    move-wide/from16 v11, v16

    .line 1488
    .line 1489
    :cond_3e
    invoke-virtual {v10, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 1490
    .line 1491
    .line 1492
    move-result-wide v10

    .line 1493
    goto :goto_24

    .line 1494
    :cond_3f
    move-wide/from16 v10, v16

    .line 1495
    .line 1496
    :goto_24
    invoke-virtual {v2, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v12

    .line 1500
    if-nez v12, :cond_40

    .line 1501
    .line 1502
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 1503
    .line 1504
    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1505
    .line 1506
    .line 1507
    invoke-interface {v2, v9, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1508
    .line 1509
    .line 1510
    :cond_40
    check-cast v12, Ljava/util/Map;

    .line 1511
    .line 1512
    iget-object v9, v8, Lv8/a;->a:Ljava/lang/String;

    .line 1513
    .line 1514
    cmp-long v13, v10, v16

    .line 1515
    .line 1516
    if-gtz v13, :cond_41

    .line 1517
    .line 1518
    move-wide v13, v4

    .line 1519
    goto :goto_25

    .line 1520
    :cond_41
    const-wide v13, 0x7fffffffffffffffL

    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    sub-long v18, v13, v10

    .line 1526
    .line 1527
    cmp-long v15, v4, v18

    .line 1528
    .line 1529
    if-lez v15, :cond_42

    .line 1530
    .line 1531
    goto :goto_25

    .line 1532
    :cond_42
    add-long v13, v4, v10

    .line 1533
    .line 1534
    :goto_25
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v10

    .line 1538
    invoke-interface {v12, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    goto :goto_23

    .line 1542
    :cond_43
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v6

    .line 1546
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1547
    .line 1548
    .line 1549
    check-cast v6, Ljava/lang/Iterable;

    .line 1550
    .line 1551
    new-instance v7, Lc9/a0;

    .line 1552
    .line 1553
    const/16 v8, 0x1c

    .line 1554
    .line 1555
    invoke-direct {v7, v2, v8}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 1556
    .line 1557
    .line 1558
    invoke-static {v6, v7}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v6

    .line 1562
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1563
    .line 1564
    .line 1565
    move-result v7

    .line 1566
    if-eqz v7, :cond_44

    .line 1567
    .line 1568
    goto/16 :goto_2d

    .line 1569
    .line 1570
    :cond_44
    const-string v7, ":"

    .line 1571
    .line 1572
    iget-object v8, v3, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1573
    .line 1574
    iget-wide v9, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 1575
    .line 1576
    cmp-long v11, v9, v16

    .line 1577
    .line 1578
    if-lez v11, :cond_45

    .line 1579
    .line 1580
    const-string v7, "svr:"

    .line 1581
    .line 1582
    :goto_26
    invoke-static {v9, v10, v7}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v7

    .line 1586
    goto :goto_27

    .line 1587
    :cond_45
    iget-wide v9, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 1588
    .line 1589
    cmp-long v11, v9, v16

    .line 1590
    .line 1591
    if-lez v11, :cond_46

    .line 1592
    .line 1593
    const-string v7, "local:"

    .line 1594
    .line 1595
    goto :goto_26

    .line 1596
    :cond_46
    iget-object v9, v3, Lk8/o;->c:Ljava/lang/String;

    .line 1597
    .line 1598
    iget-wide v10, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 1599
    .line 1600
    iget v8, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 1601
    .line 1602
    iget-object v12, v3, Lk8/o;->e:Ljava/lang/String;

    .line 1603
    .line 1604
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 1605
    .line 1606
    .line 1607
    move-result v12

    .line 1608
    const-string v13, "event:"

    .line 1609
    .line 1610
    invoke-static {v13, v9, v7, v10, v11}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v9

    .line 1614
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1618
    .line 1619
    .line 1620
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1621
    .line 1622
    .line 1623
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v7

    .line 1630
    :goto_27
    iget-object v8, v0, Lv8/q;->d:Ljava/util/LinkedHashMap;

    .line 1631
    .line 1632
    monitor-enter v8

    .line 1633
    :try_start_11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1634
    .line 1635
    .line 1636
    move-result-wide v9

    .line 1637
    iget-object v11, v0, Lv8/q;->d:Ljava/util/LinkedHashMap;

    .line 1638
    .line 1639
    invoke-virtual {v11}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v11

    .line 1643
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1644
    .line 1645
    .line 1646
    check-cast v11, Ljava/lang/Iterable;

    .line 1647
    .line 1648
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v11

    .line 1652
    :cond_47
    :goto_28
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1653
    .line 1654
    .line 1655
    move-result v12

    .line 1656
    if-eqz v12, :cond_49

    .line 1657
    .line 1658
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v12

    .line 1662
    check-cast v12, Ljava/util/Map$Entry;

    .line 1663
    .line 1664
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1665
    .line 1666
    .line 1667
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v12

    .line 1671
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1672
    .line 1673
    .line 1674
    check-cast v12, Ljava/lang/Number;

    .line 1675
    .line 1676
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 1677
    .line 1678
    .line 1679
    move-result-wide v12

    .line 1680
    sub-long v12, v9, v12

    .line 1681
    .line 1682
    const-wide/32 v14, 0x927c0

    .line 1683
    .line 1684
    .line 1685
    cmp-long v12, v12, v14

    .line 1686
    .line 1687
    if-lez v12, :cond_48

    .line 1688
    .line 1689
    const/4 v12, 0x1

    .line 1690
    :goto_29
    const/4 v13, 0x1

    .line 1691
    goto :goto_2a

    .line 1692
    :cond_48
    const/4 v12, 0x0

    .line 1693
    goto :goto_29

    .line 1694
    :goto_2a
    if-ne v12, v13, :cond_47

    .line 1695
    .line 1696
    invoke-interface {v11}, Ljava/util/Iterator;->remove()V

    .line 1697
    .line 1698
    .line 1699
    goto :goto_28

    .line 1700
    :cond_49
    iget-object v11, v0, Lv8/q;->d:Ljava/util/LinkedHashMap;

    .line 1701
    .line 1702
    invoke-virtual {v11, v7}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 1703
    .line 1704
    .line 1705
    move-result v11

    .line 1706
    if-eqz v11, :cond_4a

    .line 1707
    .line 1708
    const/16 v20, 0x0

    .line 1709
    .line 1710
    goto :goto_2b

    .line 1711
    :cond_4a
    iget-object v11, v0, Lv8/q;->d:Ljava/util/LinkedHashMap;

    .line 1712
    .line 1713
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v9

    .line 1717
    invoke-interface {v11, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_e

    .line 1718
    .line 1719
    .line 1720
    const/16 v20, 0x1

    .line 1721
    .line 1722
    :goto_2b
    monitor-exit v8

    .line 1723
    if-nez v20, :cond_4b

    .line 1724
    .line 1725
    goto/16 :goto_2d

    .line 1726
    .line 1727
    :cond_4b
    iget-object v8, v0, Lv8/q;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 1728
    .line 1729
    invoke-virtual {v8, v7}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 1730
    .line 1731
    .line 1732
    move-result v8

    .line 1733
    if-nez v8, :cond_4c

    .line 1734
    .line 1735
    goto/16 :goto_2d

    .line 1736
    .line 1737
    :cond_4c
    iget-object v8, v0, Lv8/q;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 1738
    .line 1739
    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->size()I

    .line 1740
    .line 1741
    .line 1742
    move-result v8

    .line 1743
    const/16 v9, 0x80

    .line 1744
    .line 1745
    if-le v8, v9, :cond_4d

    .line 1746
    .line 1747
    iget-object v0, v0, Lv8/q;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 1748
    .line 1749
    invoke-virtual {v0, v7}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 1750
    .line 1751
    .line 1752
    goto/16 :goto_2d

    .line 1753
    .line 1754
    :cond_4d
    iget-object v8, v3, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1755
    .line 1756
    iget-object v9, v3, Lk8/o;->c:Ljava/lang/String;

    .line 1757
    .line 1758
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1759
    .line 1760
    .line 1761
    iget-wide v10, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 1762
    .line 1763
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 1764
    .line 1765
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 1766
    .line 1767
    .line 1768
    move-result v13

    .line 1769
    invoke-static {v13}, Ltf/y;->a0(I)I

    .line 1770
    .line 1771
    .line 1772
    move-result v13

    .line 1773
    invoke-direct {v12, v13}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1774
    .line 1775
    .line 1776
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v2

    .line 1780
    check-cast v2, Ljava/lang/Iterable;

    .line 1781
    .line 1782
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v2

    .line 1786
    :goto_2c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1787
    .line 1788
    .line 1789
    move-result v13

    .line 1790
    if-eqz v13, :cond_4e

    .line 1791
    .line 1792
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v13

    .line 1796
    check-cast v13, Ljava/util/Map$Entry;

    .line 1797
    .line 1798
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v14

    .line 1802
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v13

    .line 1806
    check-cast v13, Ljava/util/Map;

    .line 1807
    .line 1808
    invoke-static {v13}, Ltf/y;->f0(Ljava/util/Map;)Ljava/util/Map;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v13

    .line 1812
    invoke-interface {v12, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1813
    .line 1814
    .line 1815
    goto :goto_2c

    .line 1816
    :cond_4e
    iget-object v2, v3, Lk8/o;->b:Ljava/lang/String;

    .line 1817
    .line 1818
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1819
    .line 1820
    .line 1821
    iget v13, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 1822
    .line 1823
    iget-boolean v3, v3, Lk8/o;->i:Z

    .line 1824
    .line 1825
    const-wide/32 v14, 0xea60

    .line 1826
    .line 1827
    .line 1828
    add-long v38, v4, v14

    .line 1829
    .line 1830
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v4

    .line 1834
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v4

    .line 1838
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1839
    .line 1840
    .line 1841
    const-string v5, "-"

    .line 1842
    .line 1843
    const-string v14, ""

    .line 1844
    .line 1845
    const/4 v15, 0x0

    .line 1846
    invoke-static {v4, v5, v14, v15}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v40

    .line 1850
    new-instance v25, Lv8/h;

    .line 1851
    .line 1852
    move-object/from16 v33, v2

    .line 1853
    .line 1854
    move/from16 v36, v3

    .line 1855
    .line 1856
    move-object/from16 v26, v7

    .line 1857
    .line 1858
    move-object/from16 v30, v8

    .line 1859
    .line 1860
    move-object/from16 v27, v9

    .line 1861
    .line 1862
    move-wide/from16 v28, v10

    .line 1863
    .line 1864
    move-object/from16 v32, v12

    .line 1865
    .line 1866
    move/from16 v34, v13

    .line 1867
    .line 1868
    move-object/from16 v37, v31

    .line 1869
    .line 1870
    move-object/from16 v31, v6

    .line 1871
    .line 1872
    invoke-direct/range {v25 .. v40}, Lv8/h;-><init>(Ljava/lang/String;Ljava/lang/String;JLh/Hchat/hooks/api/model/WeChatMessage;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;JLjava/lang/String;)V

    .line 1873
    .line 1874
    .line 1875
    move-object/from16 v2, v25

    .line 1876
    .line 1877
    new-instance v3, Lv8/b;

    .line 1878
    .line 1879
    const/4 v4, 0x3

    .line 1880
    invoke-direct {v3, v0, v2, v4}, Lv8/b;-><init>(Lv8/q;Lv8/h;I)V

    .line 1881
    .line 1882
    .line 1883
    const-wide/16 v4, 0x15e

    .line 1884
    .line 1885
    invoke-virtual {v0, v4, v5, v3}, Lv8/q;->o(JLfg/a;)Z

    .line 1886
    .line 1887
    .line 1888
    move-result v3

    .line 1889
    if-nez v3, :cond_4f

    .line 1890
    .line 1891
    invoke-virtual {v0, v2}, Lv8/q;->d(Lv8/h;)V

    .line 1892
    .line 1893
    .line 1894
    :cond_4f
    :goto_2d
    return-void

    .line 1895
    :catchall_e
    move-exception v0

    .line 1896
    monitor-exit v8

    .line 1897
    throw v0

    .line 1898
    :pswitch_11
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 1899
    .line 1900
    check-cast v0, Lua/k;

    .line 1901
    .line 1902
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 1903
    .line 1904
    check-cast v2, Ljava/lang/String;

    .line 1905
    .line 1906
    iget-boolean v3, v0, Lua/k;->h:Z

    .line 1907
    .line 1908
    if-eqz v3, :cond_50

    .line 1909
    .line 1910
    invoke-virtual {v0, v2}, Lua/k;->d(Ljava/lang/String;)V

    .line 1911
    .line 1912
    .line 1913
    goto :goto_2e

    .line 1914
    :cond_50
    iget-object v3, v0, Lua/k;->i:Ljava/util/ArrayDeque;

    .line 1915
    .line 1916
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1917
    .line 1918
    .line 1919
    iget-object v2, v0, Lua/k;->g:Landroid/speech/tts/TextToSpeech;

    .line 1920
    .line 1921
    if-eqz v2, :cond_51

    .line 1922
    .line 1923
    goto :goto_2e

    .line 1924
    :cond_51
    new-instance v2, Landroid/speech/tts/TextToSpeech;

    .line 1925
    .line 1926
    iget-object v3, v0, Lua/k;->a:Landroid/content/Context;

    .line 1927
    .line 1928
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v3

    .line 1932
    new-instance v4, Lsa/a;

    .line 1933
    .line 1934
    const/4 v13, 0x1

    .line 1935
    invoke-direct {v4, v0, v13}, Lsa/a;-><init>(Ljava/lang/Object;I)V

    .line 1936
    .line 1937
    .line 1938
    invoke-direct {v2, v3, v4}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V

    .line 1939
    .line 1940
    .line 1941
    iput-object v2, v0, Lua/k;->g:Landroid/speech/tts/TextToSpeech;

    .line 1942
    .line 1943
    :goto_2e
    return-void

    .line 1944
    :pswitch_12
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 1945
    .line 1946
    check-cast v0, Lsa/c;

    .line 1947
    .line 1948
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 1949
    .line 1950
    check-cast v2, Landroid/media/Ringtone;

    .line 1951
    .line 1952
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1953
    .line 1954
    .line 1955
    :try_start_12
    invoke-virtual {v2}, Landroid/media/Ringtone;->isPlaying()Z

    .line 1956
    .line 1957
    .line 1958
    move-result v0

    .line 1959
    if-eqz v0, :cond_52

    .line 1960
    .line 1961
    invoke-virtual {v2}, Landroid/media/Ringtone;->stop()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_f

    .line 1962
    .line 1963
    .line 1964
    :catchall_f
    :cond_52
    return-void

    .line 1965
    :pswitch_13
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 1966
    .line 1967
    check-cast v0, Lsa/c;

    .line 1968
    .line 1969
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 1970
    .line 1971
    check-cast v2, Landroid/net/Uri;

    .line 1972
    .line 1973
    iget-object v3, v0, Lsa/c;->b:Ljava/lang/String;

    .line 1974
    .line 1975
    :try_start_13
    iget-object v4, v0, Lsa/c;->a:Landroid/content/Context;

    .line 1976
    .line 1977
    invoke-static {v4, v2}, Landroid/media/RingtoneManager;->getRingtone(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_12

    .line 1981
    if-nez v2, :cond_53

    .line 1982
    .line 1983
    goto :goto_30

    .line 1984
    :cond_53
    const/4 v4, 0x5

    .line 1985
    :try_start_14
    invoke-virtual {v2, v4}, Landroid/media/Ringtone;->setStreamType(I)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_10

    .line 1986
    .line 1987
    .line 1988
    :catchall_10
    :try_start_15
    invoke-virtual {v2}, Landroid/media/Ringtone;->play()V

    .line 1989
    .line 1990
    .line 1991
    iget-object v4, v0, Lsa/c;->e:Landroid/os/Handler;

    .line 1992
    .line 1993
    new-instance v5, Lrb/g;

    .line 1994
    .line 1995
    const/4 v6, 0x3

    .line 1996
    invoke-direct {v5, v0, v6, v2}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1997
    .line 1998
    .line 1999
    const-wide/16 v6, 0xdac

    .line 2000
    .line 2001
    invoke-virtual {v4, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_11

    .line 2002
    .line 2003
    .line 2004
    goto :goto_30

    .line 2005
    :catchall_11
    move-exception v0

    .line 2006
    const-string v2, " \u94c3\u58f0\u64ad\u653e\u5931\u8d25: "

    .line 2007
    .line 2008
    goto :goto_2f

    .line 2009
    :catchall_12
    move-exception v0

    .line 2010
    const-string v2, " \u94c3\u58f0\u52a0\u8f7d\u5931\u8d25: "

    .line 2011
    .line 2012
    :goto_2f
    invoke-static {v3, v2}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2013
    .line 2014
    .line 2015
    move-result-object v2

    .line 2016
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 2017
    .line 2018
    .line 2019
    :goto_30
    return-void

    .line 2020
    :pswitch_14
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 2021
    .line 2022
    check-cast v0, Lsa/c;

    .line 2023
    .line 2024
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 2025
    .line 2026
    check-cast v2, Ljava/lang/String;

    .line 2027
    .line 2028
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2029
    .line 2030
    .line 2031
    :try_start_16
    iget-object v0, v0, Lsa/c;->a:Landroid/content/Context;

    .line 2032
    .line 2033
    const/4 v15, 0x0

    .line 2034
    invoke-static {v0, v2, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v0

    .line 2038
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_13

    .line 2039
    .line 2040
    .line 2041
    :catchall_13
    return-void

    .line 2042
    :pswitch_15
    iget-object v0, v1, Lrb/g;->h:Ljava/lang/Object;

    .line 2043
    .line 2044
    check-cast v0, Lrb/k;

    .line 2045
    .line 2046
    iget-object v2, v1, Lrb/g;->i:Ljava/lang/Object;

    .line 2047
    .line 2048
    check-cast v2, Lrb/h;

    .line 2049
    .line 2050
    iget-object v3, v0, Lrb/k;->d:Ljava/lang/Object;

    .line 2051
    .line 2052
    monitor-enter v3

    .line 2053
    :try_start_17
    iget-object v4, v0, Lrb/k;->q:Lrb/h;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_14

    .line 2054
    .line 2055
    if-eq v4, v2, :cond_54

    .line 2056
    .line 2057
    monitor-exit v3

    .line 2058
    goto :goto_31

    .line 2059
    :cond_54
    const/4 v4, 0x0

    .line 2060
    :try_start_18
    iput-object v4, v0, Lrb/k;->q:Lrb/h;

    .line 2061
    .line 2062
    const-string v4, ""

    .line 2063
    .line 2064
    iput-object v4, v0, Lrb/k;->o:Ljava/lang/String;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_14

    .line 2065
    .line 2066
    monitor-exit v3

    .line 2067
    const-string v3, "\u68c0\u6d4b\u8d85\u65f6"

    .line 2068
    .line 2069
    invoke-virtual {v0, v2, v3}, Lrb/k;->f(Lrb/h;Ljava/lang/String;)V

    .line 2070
    .line 2071
    .line 2072
    :goto_31
    return-void

    .line 2073
    :catchall_14
    move-exception v0

    .line 2074
    monitor-exit v3

    .line 2075
    throw v0

    .line 2076
    nop

    .line 2077
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
