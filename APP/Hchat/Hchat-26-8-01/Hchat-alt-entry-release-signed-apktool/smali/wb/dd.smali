.class public final synthetic Lwb/dd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput v0, p0, Lwb/dd;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lwb/dd;->i:Li0/a1;

    .line 9
    .line 10
    iput-object p1, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 13
    iput p3, p0, Lwb/dd;->g:I

    iput-object p1, p0, Lwb/dd;->h:Landroid/content/Context;

    iput-object p2, p0, Lwb/dd;->i:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/dd;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/dd;->i:Li0/a1;

    .line 9
    .line 10
    sget-object v2, Lfb/v0;->a:Lrb/k;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    iget-object v4, v2, Lrb/k;->d:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v4

    .line 18
    :try_start_0
    iput-boolean v3, v2, Lrb/k;->m:Z

    .line 19
    .line 20
    iput-boolean v3, v2, Lrb/k;->s:Z

    .line 21
    .line 22
    iget-wide v5, v2, Lrb/k;->r:J

    .line 23
    .line 24
    const-wide/16 v7, 0x1

    .line 25
    .line 26
    add-long/2addr v5, v7

    .line 27
    iput-wide v5, v2, Lrb/k;->r:J

    .line 28
    .line 29
    iget-object v5, v2, Lrb/k;->q:Lrb/h;

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    iget-object v5, v5, Lrb/h;->c:Ljava/util/concurrent/ScheduledFuture;

    .line 34
    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    invoke-interface {v5, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    const/4 v5, 0x0

    .line 44
    iput-object v5, v2, Lrb/k;->q:Lrb/h;

    .line 45
    .line 46
    iget-object v6, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->clear()V

    .line 49
    .line 50
    .line 51
    iget-object v6, v2, Lrb/k;->h:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 54
    .line 55
    .line 56
    iget-object v6, v2, Lrb/k;->i:Ljava/util/ArrayDeque;

    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->clear()V

    .line 59
    .line 60
    .line 61
    iget-object v6, v2, Lrb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 64
    .line 65
    .line 66
    iput v3, v2, Lrb/k;->p:I

    .line 67
    .line 68
    iput v3, v2, Lrb/k;->t:I

    .line 69
    .line 70
    iput v3, v2, Lrb/k;->u:I

    .line 71
    .line 72
    iput v3, v2, Lrb/k;->v:I

    .line 73
    .line 74
    iput v3, v2, Lrb/k;->w:I

    .line 75
    .line 76
    const-string v3, ""

    .line 77
    .line 78
    iput-object v3, v2, Lrb/k;->o:Ljava/lang/String;

    .line 79
    .line 80
    const-string v3, "\u7b49\u5f85\u68c0\u6d4b"

    .line 81
    .line 82
    iput-object v3, v2, Lrb/k;->n:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v3, v2, Lrb/k;->c:Lrb/l;

    .line 85
    .line 86
    iget-object v3, v3, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 87
    .line 88
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const-string v6, "zombie_check_pending_ids"

    .line 93
    .line 94
    invoke-interface {v3, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const-string v6, "zombie_check_total_count"

    .line 99
    .line 100
    invoke-interface {v3, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const-string v6, "zombie_check_results"

    .line 105
    .line 106
    invoke-interface {v3, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    monitor-exit v4

    .line 114
    invoke-virtual {v2}, Lrb/k;->j()V

    .line 115
    .line 116
    .line 117
    :try_start_1
    iget-object v2, v2, Lrb/k;->b:Landroid/content/Context;

    .line 118
    .line 119
    const-string v3, "notification"

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    instance-of v3, v2, Landroid/app/NotificationManager;

    .line 126
    .line 127
    if-eqz v3, :cond_1

    .line 128
    .line 129
    move-object v5, v2

    .line 130
    check-cast v5, Landroid/app/NotificationManager;

    .line 131
    .line 132
    :cond_1
    if-eqz v5, :cond_2

    .line 133
    .line 134
    const v2, 0x48435a43    # 200041.05f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v2}, Landroid/app/NotificationManager;->cancel(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 138
    .line 139
    .line 140
    :catchall_1
    :cond_2
    new-instance v2, Lrb/a;

    .line 141
    .line 142
    const/4 v3, 0x1

    .line 143
    const-string v4, "\u68c0\u6d4b\u8fdb\u5ea6\u5df2\u91cd\u7f6e"

    .line 144
    .line 145
    invoke-direct {v2, v3, v4}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :goto_1
    monitor-exit v4

    .line 150
    throw v0

    .line 151
    :cond_3
    new-instance v2, Lrb/a;

    .line 152
    .line 153
    const-string v4, "\u68c0\u6d4b\u8fd0\u884c\u65f6\u5c1a\u672a\u5c31\u7eea"

    .line 154
    .line 155
    invoke-direct {v2, v3, v4}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :goto_2
    invoke-static {v0, v1, v2}, Lwb/ho;->t4(Landroid/content/Context;Li0/a1;Lrb/a;)V

    .line 159
    .line 160
    .line 161
    :goto_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_0
    iget-object v0, p0, Lwb/dd;->i:Li0/a1;

    .line 165
    .line 166
    iget-object v1, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 167
    .line 168
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Lrb/m;

    .line 173
    .line 174
    iget-boolean v2, v2, Lrb/m;->b:Z

    .line 175
    .line 176
    if-nez v2, :cond_1d

    .line 177
    .line 178
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, Lrb/m;

    .line 183
    .line 184
    iget-boolean v2, v2, Lrb/m;->i:Z

    .line 185
    .line 186
    if-eqz v2, :cond_4

    .line 187
    .line 188
    goto/16 :goto_17

    .line 189
    .line 190
    :cond_4
    sget-object v2, Lfb/v0;->a:Lrb/k;

    .line 191
    .line 192
    const/4 v3, 0x0

    .line 193
    if-eqz v2, :cond_1c

    .line 194
    .line 195
    iget-object v4, v2, Lrb/k;->c:Lrb/l;

    .line 196
    .line 197
    iget-object v4, v4, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 198
    .line 199
    const-string v5, "zombie_check_enable"

    .line 200
    .line 201
    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-nez v4, :cond_5

    .line 206
    .line 207
    new-instance v2, Lrb/a;

    .line 208
    .line 209
    const-string v4, "\u8bf7\u5148\u542f\u7528\u50f5\u5c38\u7c89\u68c0\u6d4b"

    .line 210
    .line 211
    invoke-direct {v2, v3, v4}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_18

    .line 215
    .line 216
    :cond_5
    iget-boolean v4, v2, Lrb/k;->l:Z

    .line 217
    .line 218
    if-eqz v4, :cond_1b

    .line 219
    .line 220
    iget-object v4, v2, Lrb/k;->k:Lrb/c;

    .line 221
    .line 222
    if-nez v4, :cond_6

    .line 223
    .line 224
    goto/16 :goto_16

    .line 225
    .line 226
    :cond_6
    iget-object v4, v2, Lrb/k;->d:Ljava/lang/Object;

    .line 227
    .line 228
    monitor-enter v4

    .line 229
    :try_start_2
    iget-boolean v5, v2, Lrb/k;->m:Z

    .line 230
    .line 231
    if-eqz v5, :cond_7

    .line 232
    .line 233
    new-instance v2, Lrb/a;

    .line 234
    .line 235
    const-string v5, "\u68c0\u6d4b\u6b63\u5728\u8fd0\u884c"

    .line 236
    .line 237
    invoke-direct {v2, v3, v5}, Lrb/a;-><init>(ZLjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 238
    .line 239
    .line 240
    :goto_4
    monitor-exit v4

    .line 241
    goto/16 :goto_18

    .line 242
    .line 243
    :catchall_2
    move-exception v0

    .line 244
    goto/16 :goto_15

    .line 245
    .line 246
    :cond_7
    :try_start_3
    iget-boolean v5, v2, Lrb/k;->s:Z

    .line 247
    .line 248
    if-eqz v5, :cond_8

    .line 249
    .line 250
    new-instance v2, Lrb/a;

    .line 251
    .line 252
    const-string v5, "\u6b63\u5728\u6279\u91cf\u5220\u9664\u597d\u53cb"

    .line 253
    .line 254
    invoke-direct {v2, v3, v5}, Lrb/a;-><init>(ZLjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 255
    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_8
    monitor-exit v4

    .line 259
    const/4 v4, 0x0

    .line 260
    :try_start_4
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    if-eqz v5, :cond_9

    .line 265
    .line 266
    const-string v6, "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!=\'\' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE \'%chatroom\'"

    .line 267
    .line 268
    invoke-virtual {v5, v6, v4}, Lg8/i;->U(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    goto :goto_5

    .line 273
    :cond_9
    move-object v5, v4

    .line 274
    :goto_5
    if-nez v5, :cond_a

    .line 275
    .line 276
    sget-object v5, Ltf/t;->g:Ltf/t;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :catchall_3
    move-exception v5

    .line 280
    new-instance v6, Lsf/f;

    .line 281
    .line 282
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    move-object v5, v6

    .line 286
    :cond_a
    :goto_6
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    if-nez v6, :cond_1a

    .line 291
    .line 292
    check-cast v5, Ljava/util/List;

    .line 293
    .line 294
    new-instance v6, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 297
    .line 298
    .line 299
    move-result v7

    .line 300
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v8

    .line 311
    if-eqz v8, :cond_b

    .line 312
    .line 313
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    check-cast v8, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 318
    .line 319
    iget-object v8, v8, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 320
    .line 321
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_b
    new-instance v7, Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    :cond_c
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v8

    .line 338
    if-eqz v8, :cond_d

    .line 339
    .line 340
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v8

    .line 344
    move-object v9, v8

    .line 345
    check-cast v9, Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v9}, Lrb/k;->g(Ljava/lang/String;)Z

    .line 348
    .line 349
    .line 350
    move-result v9

    .line 351
    if-eqz v9, :cond_c

    .line 352
    .line 353
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_d
    invoke-static {v7}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    iget-object v7, v2, Lrb/k;->c:Lrb/l;

    .line 362
    .line 363
    const-string v8, "zombie_check_excluded_ids"

    .line 364
    .line 365
    invoke-virtual {v7, v8}, Lrb/l;->c(Ljava/lang/String;)Ljava/util/Set;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v8

    .line 377
    if-eqz v8, :cond_e

    .line 378
    .line 379
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v8

    .line 383
    check-cast v8, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 384
    .line 385
    iget-object v9, v2, Lrb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 386
    .line 387
    iget-object v10, v8, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    invoke-virtual {v9, v10, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    goto :goto_9

    .line 397
    :cond_e
    iget-object v5, v2, Lrb/k;->d:Ljava/lang/Object;

    .line 398
    .line 399
    monitor-enter v5

    .line 400
    :try_start_5
    iget-object v8, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 401
    .line 402
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    if-eqz v8, :cond_12

    .line 407
    .line 408
    iget-object v8, v2, Lrb/k;->c:Lrb/l;

    .line 409
    .line 410
    const-string v9, "zombie_check_target_ids"

    .line 411
    .line 412
    invoke-virtual {v8, v9}, Lrb/l;->c(Ljava/lang/String;)Ljava/util/Set;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    invoke-interface {v8}, Ljava/util/Set;->isEmpty()Z

    .line 417
    .line 418
    .line 419
    move-result v9

    .line 420
    if-eqz v9, :cond_f

    .line 421
    .line 422
    goto :goto_a

    .line 423
    :cond_f
    check-cast v8, Ljava/lang/Iterable;

    .line 424
    .line 425
    check-cast v6, Ljava/lang/Iterable;

    .line 426
    .line 427
    invoke-static {v8, v6}, Ltf/m;->x1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    :goto_a
    check-cast v7, Ljava/lang/Iterable;

    .line 432
    .line 433
    invoke-static {v6, v7}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    if-eqz v7, :cond_10

    .line 442
    .line 443
    new-instance v2, Lrb/a;

    .line 444
    .line 445
    const-string v4, "\u6ca1\u6709\u53ef\u68c0\u6d4b\u7684\u597d\u53cb"

    .line 446
    .line 447
    invoke-direct {v2, v3, v4}, Lrb/a;-><init>(ZLjava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 448
    .line 449
    .line 450
    :goto_b
    monitor-exit v5

    .line 451
    goto/16 :goto_18

    .line 452
    .line 453
    :catchall_4
    move-exception v0

    .line 454
    goto/16 :goto_14

    .line 455
    .line 456
    :cond_10
    :try_start_6
    iget-object v7, v2, Lrb/k;->h:Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 459
    .line 460
    .line 461
    check-cast v6, Ljava/lang/Iterable;

    .line 462
    .line 463
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 464
    .line 465
    .line 466
    move-result-object v6

    .line 467
    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 468
    .line 469
    .line 470
    move-result v7

    .line 471
    if-eqz v7, :cond_11

    .line 472
    .line 473
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v7

    .line 477
    check-cast v7, Ljava/lang/String;

    .line 478
    .line 479
    iget-object v8, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 480
    .line 481
    new-instance v9, Lrb/j;

    .line 482
    .line 483
    invoke-direct {v9, v7, v3}, Lrb/j;-><init>(Ljava/lang/String;I)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v8, v9}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    goto :goto_c

    .line 490
    :cond_11
    iget-object v6, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 491
    .line 492
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->size()I

    .line 493
    .line 494
    .line 495
    move-result v6

    .line 496
    iput v6, v2, Lrb/k;->p:I

    .line 497
    .line 498
    goto :goto_f

    .line 499
    :cond_12
    iget-object v8, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 500
    .line 501
    new-instance v9, Ljava/util/ArrayList;

    .line 502
    .line 503
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 507
    .line 508
    .line 509
    move-result-object v8

    .line 510
    :cond_13
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 511
    .line 512
    .line 513
    move-result v10

    .line 514
    if-eqz v10, :cond_14

    .line 515
    .line 516
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v10

    .line 520
    move-object v11, v10

    .line 521
    check-cast v11, Lrb/j;

    .line 522
    .line 523
    iget-object v12, v11, Lrb/j;->a:Ljava/lang/String;

    .line 524
    .line 525
    invoke-interface {v6, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v12

    .line 529
    if-eqz v12, :cond_13

    .line 530
    .line 531
    iget-object v11, v11, Lrb/j;->a:Ljava/lang/String;

    .line 532
    .line 533
    invoke-interface {v7, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v11

    .line 537
    if-nez v11, :cond_13

    .line 538
    .line 539
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    goto :goto_d

    .line 543
    :cond_14
    iget-object v6, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 544
    .line 545
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->clear()V

    .line 546
    .line 547
    .line 548
    iget-object v6, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 549
    .line 550
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 555
    .line 556
    .line 557
    move-result v8

    .line 558
    if-eqz v8, :cond_15

    .line 559
    .line 560
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v8

    .line 564
    check-cast v8, Lrb/j;

    .line 565
    .line 566
    invoke-virtual {v6, v8}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    goto :goto_e

    .line 570
    :cond_15
    iget-object v6, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 571
    .line 572
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->size()I

    .line 573
    .line 574
    .line 575
    move-result v6

    .line 576
    iget-object v7, v2, Lrb/k;->h:Ljava/util/ArrayList;

    .line 577
    .line 578
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 579
    .line 580
    .line 581
    move-result v7

    .line 582
    add-int/2addr v6, v7

    .line 583
    iput v6, v2, Lrb/k;->p:I

    .line 584
    .line 585
    iget-object v6, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 586
    .line 587
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 588
    .line 589
    .line 590
    move-result v6

    .line 591
    if-eqz v6, :cond_16

    .line 592
    .line 593
    new-instance v2, Lrb/a;

    .line 594
    .line 595
    const-string v4, "\u6ca1\u6709\u53ef\u7ee7\u7eed\u7684\u597d\u53cb"

    .line 596
    .line 597
    invoke-direct {v2, v3, v4}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 598
    .line 599
    .line 600
    goto/16 :goto_b

    .line 601
    .line 602
    :cond_16
    :goto_f
    const/4 v6, 0x1

    .line 603
    iput-boolean v6, v2, Lrb/k;->m:Z

    .line 604
    .line 605
    const-string v7, "\u68c0\u6d4b\u8fd0\u884c\u4e2d"

    .line 606
    .line 607
    iput-object v7, v2, Lrb/k;->n:Ljava/lang/String;

    .line 608
    .line 609
    const-string v7, ""

    .line 610
    .line 611
    iput-object v7, v2, Lrb/k;->o:Ljava/lang/String;

    .line 612
    .line 613
    iget-object v7, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 614
    .line 615
    invoke-virtual {v7}, Ljava/util/ArrayDeque;->size()I

    .line 616
    .line 617
    .line 618
    move-result v7

    .line 619
    new-instance v8, Ljava/lang/StringBuilder;

    .line 620
    .line 621
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 622
    .line 623
    .line 624
    const-string v9, "\u5f00\u59cb\u68c0\u6d4b\uff0c\u5f85\u68c0\u6d4b "

    .line 625
    .line 626
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    const-string v7, " \u4f4d\u597d\u53cb"

    .line 633
    .line 634
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v7

    .line 641
    invoke-virtual {v2, v7}, Lrb/k;->b(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v2}, Lrb/k;->h()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 645
    .line 646
    .line 647
    monitor-exit v5

    .line 648
    iget-object v5, v2, Lrb/k;->c:Lrb/l;

    .line 649
    .line 650
    iget-object v5, v5, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 651
    .line 652
    const-string v7, "zombie_check_keep_awake"

    .line 653
    .line 654
    invoke-interface {v5, v7, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 655
    .line 656
    .line 657
    move-result v5

    .line 658
    if-nez v5, :cond_17

    .line 659
    .line 660
    goto :goto_13

    .line 661
    :cond_17
    :try_start_7
    iget-object v5, v2, Lrb/k;->b:Landroid/content/Context;

    .line 662
    .line 663
    const-string v7, "power"

    .line 664
    .line 665
    invoke-virtual {v5, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v5

    .line 669
    instance-of v7, v5, Landroid/os/PowerManager;

    .line 670
    .line 671
    if-eqz v7, :cond_18

    .line 672
    .line 673
    move-object v4, v5

    .line 674
    check-cast v4, Landroid/os/PowerManager;

    .line 675
    .line 676
    goto :goto_10

    .line 677
    :catchall_5
    move-exception v3

    .line 678
    goto :goto_11

    .line 679
    :cond_18
    :goto_10
    if-eqz v4, :cond_19

    .line 680
    .line 681
    const-string v5, "Hchat:ZombieCheck"

    .line 682
    .line 683
    invoke-virtual {v4, v6, v5}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    invoke-virtual {v4, v3}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 688
    .line 689
    .line 690
    const-wide/32 v7, 0x36ee80

    .line 691
    .line 692
    .line 693
    invoke-virtual {v4, v7, v8}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 694
    .line 695
    .line 696
    iput-object v4, v2, Lrb/k;->x:Landroid/os/PowerManager$WakeLock;

    .line 697
    .line 698
    sget-object v3, Lsf/n;->a:Lsf/n;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 699
    .line 700
    goto :goto_12

    .line 701
    :goto_11
    new-instance v4, Lsf/f;

    .line 702
    .line 703
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 704
    .line 705
    .line 706
    move-object v3, v4

    .line 707
    :goto_12
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    if-eqz v3, :cond_19

    .line 712
    .line 713
    iget-object v4, v2, Lrb/k;->a:Lia/t;

    .line 714
    .line 715
    const-string v5, "\u7533\u8bf7\u50f5\u5c38\u7c89\u68c0\u6d4b WakeLock \u5931\u8d25"

    .line 716
    .line 717
    invoke-virtual {v4, v5, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    :cond_19
    :goto_13
    invoke-virtual {v2}, Lrb/k;->m()V

    .line 721
    .line 722
    .line 723
    const-wide/16 v3, 0x0

    .line 724
    .line 725
    invoke-virtual {v2, v3, v4}, Lrb/k;->k(J)V

    .line 726
    .line 727
    .line 728
    new-instance v2, Lrb/a;

    .line 729
    .line 730
    const-string v3, "\u68c0\u6d4b\u5df2\u5f00\u59cb"

    .line 731
    .line 732
    invoke-direct {v2, v6, v3}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 733
    .line 734
    .line 735
    goto :goto_18

    .line 736
    :goto_14
    monitor-exit v5

    .line 737
    throw v0

    .line 738
    :cond_1a
    iget-object v2, v2, Lrb/k;->a:Lia/t;

    .line 739
    .line 740
    const-string v4, "\u8bfb\u53d6\u597d\u53cb\u5217\u8868\u5931\u8d25"

    .line 741
    .line 742
    invoke-virtual {v2, v4, v6}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    new-instance v2, Lrb/a;

    .line 746
    .line 747
    const-string v4, "\u8bfb\u53d6\u597d\u53cb\u5217\u8868\u5931\u8d25"

    .line 748
    .line 749
    invoke-direct {v2, v3, v4}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 750
    .line 751
    .line 752
    goto :goto_18

    .line 753
    :goto_15
    monitor-exit v4

    .line 754
    throw v0

    .line 755
    :cond_1b
    :goto_16
    new-instance v2, Lrb/a;

    .line 756
    .line 757
    const-string v4, "\u68c0\u6d4b\u63a5\u53e3\u5c1a\u672a\u5c31\u7eea"

    .line 758
    .line 759
    invoke-direct {v2, v3, v4}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 760
    .line 761
    .line 762
    goto :goto_18

    .line 763
    :cond_1c
    new-instance v2, Lrb/a;

    .line 764
    .line 765
    const-string v4, "\u68c0\u6d4b\u8fd0\u884c\u65f6\u5c1a\u672a\u5c31\u7eea"

    .line 766
    .line 767
    invoke-direct {v2, v3, v4}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 768
    .line 769
    .line 770
    goto :goto_18

    .line 771
    :cond_1d
    :goto_17
    invoke-static {}, Lfb/v0;->I()Lrb/a;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    :goto_18
    invoke-static {v1, v0, v2}, Lwb/ho;->t4(Landroid/content/Context;Li0/a1;Lrb/a;)V

    .line 776
    .line 777
    .line 778
    goto/16 :goto_3

    .line 779
    .line 780
    :pswitch_1
    iget-object v0, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 781
    .line 782
    iget-object v1, p0, Lwb/dd;->i:Li0/a1;

    .line 783
    .line 784
    const-string v2, ""

    .line 785
    .line 786
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    const-string v1, "\u94c3\u58f0\u5df2\u6e05\u7a7a\uff0c\u4fdd\u5b58\u540e\u751f\u6548"

    .line 790
    .line 791
    const/4 v2, 0x0

    .line 792
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 797
    .line 798
    .line 799
    goto/16 :goto_3

    .line 800
    .line 801
    :pswitch_2
    iget-object v0, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 802
    .line 803
    iget-object v1, p0, Lwb/dd;->i:Li0/a1;

    .line 804
    .line 805
    instance-of v2, v0, Landroid/app/Activity;

    .line 806
    .line 807
    if-eqz v2, :cond_1e

    .line 808
    .line 809
    move-object v2, v0

    .line 810
    check-cast v2, Landroid/app/Activity;

    .line 811
    .line 812
    goto :goto_19

    .line 813
    :cond_1e
    const/4 v2, 0x0

    .line 814
    :goto_19
    if-nez v2, :cond_1f

    .line 815
    .line 816
    const-string v1, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 817
    .line 818
    const/4 v2, 0x0

    .line 819
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 824
    .line 825
    .line 826
    goto :goto_1a

    .line 827
    :cond_1f
    sget-object v3, Lwb/vq;->a:Lwb/vq;

    .line 828
    .line 829
    new-instance v4, Lwb/q1;

    .line 830
    .line 831
    const/4 v5, 0x4

    .line 832
    invoke-direct {v4, v0, v1, v5}, Lwb/q1;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v3, v2, v4}, Lwb/vq;->c(Landroid/app/Activity;Lfg/l;)V

    .line 836
    .line 837
    .line 838
    :goto_1a
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 839
    .line 840
    return-object v0

    .line 841
    :pswitch_3
    iget-object v0, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 842
    .line 843
    iget-object v1, p0, Lwb/dd;->i:Li0/a1;

    .line 844
    .line 845
    instance-of v2, v0, Landroid/app/Activity;

    .line 846
    .line 847
    if-eqz v2, :cond_20

    .line 848
    .line 849
    move-object v2, v0

    .line 850
    check-cast v2, Landroid/app/Activity;

    .line 851
    .line 852
    goto :goto_1b

    .line 853
    :cond_20
    const/4 v2, 0x0

    .line 854
    :goto_1b
    if-nez v2, :cond_21

    .line 855
    .line 856
    const-string v1, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u94c3\u58f0\u9009\u62e9\u5668"

    .line 857
    .line 858
    const/4 v2, 0x0

    .line 859
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 864
    .line 865
    .line 866
    goto :goto_1c

    .line 867
    :cond_21
    sget-object v3, Lwb/vq;->a:Lwb/vq;

    .line 868
    .line 869
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    check-cast v4, Ljava/lang/String;

    .line 874
    .line 875
    new-instance v5, Lwb/q1;

    .line 876
    .line 877
    const/4 v6, 0x3

    .line 878
    invoke-direct {v5, v0, v1, v6}, Lwb/q1;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v3, v2, v4, v5}, Lwb/vq;->d(Landroid/app/Activity;Ljava/lang/String;Lfg/l;)V

    .line 882
    .line 883
    .line 884
    :goto_1c
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 885
    .line 886
    return-object v0

    .line 887
    :pswitch_4
    iget-object v0, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 888
    .line 889
    iget-object v1, p0, Lwb/dd;->i:Li0/a1;

    .line 890
    .line 891
    const-string v2, "\u63d0\u9192,\u641c\u4e00\u641c,\u6536\u85cf"

    .line 892
    .line 893
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    const-string v1, "\u5df2\u6062\u590d\u9ed8\u8ba4\uff0c\u4fdd\u5b58\u540e\u751f\u6548"

    .line 897
    .line 898
    const/4 v2, 0x0

    .line 899
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 904
    .line 905
    .line 906
    goto/16 :goto_3

    .line 907
    .line 908
    :pswitch_5
    iget-object v0, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 909
    .line 910
    iget-object v1, p0, Lwb/dd;->i:Li0/a1;

    .line 911
    .line 912
    const/4 v2, 0x0

    .line 913
    invoke-static {v0, v2}, Lw9/a;->a(Landroid/content/Context;Landroid/content/Context;)V

    .line 914
    .line 915
    .line 916
    invoke-static {v0}, Lw9/a;->b(Landroid/content/Context;)Z

    .line 917
    .line 918
    .line 919
    move-result v2

    .line 920
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 921
    .line 922
    .line 923
    move-result-object v2

    .line 924
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 925
    .line 926
    .line 927
    const-string v1, "\u5df2\u5e94\u7528"

    .line 928
    .line 929
    const/4 v2, 0x0

    .line 930
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 935
    .line 936
    .line 937
    goto/16 :goto_3

    .line 938
    .line 939
    :pswitch_6
    iget-object v0, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 940
    .line 941
    iget-object v1, p0, Lwb/dd;->i:Li0/a1;

    .line 942
    .line 943
    invoke-static {v0}, Lw9/a;->b(Landroid/content/Context;)Z

    .line 944
    .line 945
    .line 946
    move-result v2

    .line 947
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 952
    .line 953
    .line 954
    const-string v1, "\u72b6\u6001\u5df2\u5237\u65b0"

    .line 955
    .line 956
    const/4 v2, 0x0

    .line 957
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 962
    .line 963
    .line 964
    goto/16 :goto_3

    .line 965
    .line 966
    :pswitch_7
    iget-object v0, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 967
    .line 968
    iget-object v1, p0, Lwb/dd;->i:Li0/a1;

    .line 969
    .line 970
    const-string v2, "Hchat \u7ecf\u5ea6"

    .line 971
    .line 972
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    check-cast v1, Ljava/lang/String;

    .line 977
    .line 978
    invoke-static {v0, v2, v1}, Lwb/ho;->d5(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    goto/16 :goto_3

    .line 982
    .line 983
    :pswitch_8
    iget-object v0, p0, Lwb/dd;->h:Landroid/content/Context;

    .line 984
    .line 985
    iget-object v1, p0, Lwb/dd;->i:Li0/a1;

    .line 986
    .line 987
    const-string v2, "Hchat \u7eac\u5ea6"

    .line 988
    .line 989
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    check-cast v1, Ljava/lang/String;

    .line 994
    .line 995
    invoke-static {v0, v2, v1}, Lwb/ho;->d5(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    goto/16 :goto_3

    .line 999
    .line 1000
    nop

    .line 1001
    :pswitch_data_0
    .packed-switch 0x0
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
