.class public final synthetic La1/d;
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

    .line 1
    iput p2, p0, La1/d;->g:I

    .line 2
    .line 3
    iput-object p1, p0, La1/d;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, La1/d;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final a()V
    .locals 13

    .line 1
    iget-object v0, p0, La1/d;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lha/d;

    .line 4
    .line 5
    iget-object v1, p0, La1/d;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_f

    .line 12
    .line 13
    invoke-static {v1, v2}, Loh/h;->z(Ljava/lang/Object;Lp8/d0;)Lha/c0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_f

    .line 18
    .line 19
    invoke-virtual {v0}, Lha/d;->a()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    iget-object v1, v1, Lha/c0;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1}, Lha/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v3, "\u8df3\u8fc7 "

    .line 38
    .line 39
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, "\uff1a\u8bc4\u8bba\u5185\u5bb9\u4e3a\u7a7a"

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Lha/d;->c(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    iget-object v2, v1, Lha/c0;->a:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v3, v0, Lha/d;->d:Ljava/lang/Object;

    .line 61
    .line 62
    monitor-enter v3

    .line 63
    :try_start_0
    invoke-virtual {v0}, Lha/d;->d()V

    .line 64
    .line 65
    .line 66
    iget-object v4, v0, Lha/d;->g:Ljava/util/LinkedHashSet;

    .line 67
    .line 68
    invoke-virtual {v4, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const-wide/16 v5, 0x0

    .line 73
    .line 74
    const/4 v7, 0x1

    .line 75
    const/4 v8, 0x0

    .line 76
    if-nez v4, :cond_3

    .line 77
    .line 78
    iget-object v4, v0, Lha/d;->f:Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lha/b;

    .line 85
    .line 86
    if-eqz v2, :cond_1

    .line 87
    .line 88
    iget-wide v9, v2, Lha/b;->a:J

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    goto/16 :goto_a

    .line 93
    .line 94
    :cond_1
    move-wide v9, v5

    .line 95
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 96
    .line 97
    .line 98
    move-result-wide v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    cmp-long v2, v9, v11

    .line 100
    .line 101
    if-lez v2, :cond_2

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move v2, v8

    .line 105
    goto :goto_2

    .line 106
    :cond_3
    :goto_1
    move v2, v7

    .line 107
    :goto_2
    monitor-exit v3

    .line 108
    if-eqz v2, :cond_4

    .line 109
    .line 110
    goto/16 :goto_b

    .line 111
    .line 112
    :cond_4
    invoke-virtual {v0, v1}, Lha/d;->f(Lha/c0;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iget-object v3, v1, Lha/c0;->a:Ljava/lang/String;

    .line 117
    .line 118
    if-eqz v2, :cond_5

    .line 119
    .line 120
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    const-wide/32 v6, 0x36ee80

    .line 125
    .line 126
    .line 127
    add-long/2addr v4, v6

    .line 128
    invoke-virtual {v0, v4, v5, v3}, Lha/d;->g(JLjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iget-object v1, v1, Lha/c0;->c:Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v1}, Lha/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    new-instance v3, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v4, "\u8df3\u8fc7 "

    .line 140
    .line 141
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v1, "\uff1a"

    .line 148
    .line 149
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v0, v1}, Lha/d;->c(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_5
    iget-object v2, v0, Lha/d;->d:Ljava/lang/Object;

    .line 164
    .line 165
    monitor-enter v2

    .line 166
    :try_start_1
    invoke-virtual {v0}, Lha/d;->d()V

    .line 167
    .line 168
    .line 169
    iget-object v4, v0, Lha/d;->g:Ljava/util/LinkedHashSet;

    .line 170
    .line 171
    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_6

    .line 176
    .line 177
    :goto_3
    move v3, v8

    .line 178
    goto :goto_5

    .line 179
    :cond_6
    iget-object v4, v0, Lha/d;->f:Ljava/util/LinkedHashMap;

    .line 180
    .line 181
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    check-cast v4, Lha/b;

    .line 186
    .line 187
    if-eqz v4, :cond_7

    .line 188
    .line 189
    iget-wide v5, v4, Lha/b;->a:J

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :catchall_1
    move-exception v0

    .line 193
    goto/16 :goto_9

    .line 194
    .line 195
    :cond_7
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 196
    .line 197
    .line 198
    move-result-wide v9

    .line 199
    cmp-long v4, v5, v9

    .line 200
    .line 201
    if-lez v4, :cond_8

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_8
    iget-object v4, v0, Lha/d;->f:Ljava/util/LinkedHashMap;

    .line 205
    .line 206
    new-instance v5, Lha/b;

    .line 207
    .line 208
    const-wide v9, 0x7fffffffffffffffL

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    invoke-direct {v5, v9, v10}, Lha/b;-><init>(J)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 217
    .line 218
    .line 219
    move v3, v7

    .line 220
    :goto_5
    monitor-exit v2

    .line 221
    if-nez v3, :cond_9

    .line 222
    .line 223
    goto/16 :goto_b

    .line 224
    .line 225
    :cond_9
    iget-object v2, v0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 226
    .line 227
    const-string v3, "comment_delay_mode"

    .line 228
    .line 229
    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    if-nez v3, :cond_b

    .line 234
    .line 235
    const-string v3, "comment_fixed_delay_seconds"

    .line 236
    .line 237
    const/16 v4, 0x12c

    .line 238
    .line 239
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-gez v2, :cond_a

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_a
    move v8, v2

    .line 247
    :goto_6
    int-to-long v2, v8

    .line 248
    goto :goto_8

    .line 249
    :cond_b
    const-string v3, "comment_random_min_seconds"

    .line 250
    .line 251
    const/16 v4, 0x3c

    .line 252
    .line 253
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-gez v3, :cond_c

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_c
    move v8, v3

    .line 261
    :goto_7
    int-to-long v3, v8

    .line 262
    const-string v5, "comment_random_max_seconds"

    .line 263
    .line 264
    const/16 v6, 0xe10

    .line 265
    .line 266
    invoke-interface {v2, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    int-to-long v5, v2

    .line 271
    cmp-long v2, v5, v3

    .line 272
    .line 273
    if-gez v2, :cond_d

    .line 274
    .line 275
    move-wide v5, v3

    .line 276
    :cond_d
    cmp-long v2, v3, v5

    .line 277
    .line 278
    if-nez v2, :cond_e

    .line 279
    .line 280
    move-wide v2, v3

    .line 281
    goto :goto_8

    .line 282
    :cond_e
    const-wide/16 v7, 0x1

    .line 283
    .line 284
    add-long/2addr v5, v7

    .line 285
    sget-object v2, Ljg/d;->g:Ljg/a;

    .line 286
    .line 287
    invoke-virtual {v2, v3, v4, v5, v6}, Ljg/d;->e(JJ)J

    .line 288
    .line 289
    .line 290
    move-result-wide v2

    .line 291
    :goto_8
    iget-object v4, v1, Lha/c0;->c:Ljava/lang/String;

    .line 292
    .line 293
    invoke-static {v4}, Lha/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    iget-object v5, v1, Lha/c0;->e:Lha/d0;

    .line 298
    .line 299
    iget-object v5, v5, Lha/d0;->g:Ljava/lang/String;

    .line 300
    .line 301
    const-string v6, "\u5df2\u6355\u6349 "

    .line 302
    .line 303
    const-string v7, " \u7684"

    .line 304
    .line 305
    const-string v8, "\u670b\u53cb\u5708\uff0c"

    .line 306
    .line 307
    invoke-static {v6, v4, v7, v5, v8}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    const-string v5, "\u79d2\u540e\u8bc4\u8bba"

    .line 315
    .line 316
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-virtual {v0, v4}, Lha/d;->c(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    iget-object v4, v0, Lha/d;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 327
    .line 328
    new-instance v5, La1/d;

    .line 329
    .line 330
    const/16 v6, 0xc

    .line 331
    .line 332
    invoke-direct {v5, v0, v6, v1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 336
    .line 337
    invoke-virtual {v4, v5, v2, v3, v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    iget-object v3, v0, Lha/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 342
    .line 343
    iget-object v4, v1, Lha/c0;->a:Ljava/lang/String;

    .line 344
    .line 345
    invoke-virtual {v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    if-eqz v3, :cond_f

    .line 353
    .line 354
    iget-object v0, v0, Lha/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 355
    .line 356
    iget-object v1, v1, Lha/c0;->a:Ljava/lang/String;

    .line 357
    .line 358
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    return-void

    .line 362
    :goto_9
    monitor-exit v2

    .line 363
    throw v0

    .line 364
    :goto_a
    monitor-exit v3

    .line 365
    throw v0

    .line 366
    :cond_f
    :goto_b
    return-void
.end method

.method private final b()V
    .locals 13

    .line 1
    iget-object v0, p0, La1/d;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lha/k;

    .line 4
    .line 5
    iget-object v1, p0, La1/d;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_e

    .line 12
    .line 13
    invoke-static {v1, v2}, Loh/h;->z(Ljava/lang/Object;Lp8/d0;)Lha/c0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_e

    .line 18
    .line 19
    iget-object v2, v1, Lha/c0;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, v0, Lha/k;->d:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v3

    .line 24
    :try_start_0
    invoke-virtual {v0}, Lha/k;->c()V

    .line 25
    .line 26
    .line 27
    iget-object v4, v0, Lha/k;->g:Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    invoke-virtual {v4, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const-wide/16 v5, 0x0

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    const/4 v8, 0x0

    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    iget-object v4, v0, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lha/j;

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    iget-wide v9, v2, Lha/j;->a:J

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto/16 :goto_a

    .line 54
    .line 55
    :cond_0
    move-wide v9, v5

    .line 56
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    cmp-long v2, v9, v11

    .line 61
    .line 62
    if-lez v2, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move v2, v8

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    :goto_1
    move v2, v7

    .line 68
    :goto_2
    monitor-exit v3

    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    goto/16 :goto_b

    .line 72
    .line 73
    :cond_3
    invoke-virtual {v0, v1}, Lha/k;->e(Lha/c0;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v3, v1, Lha/c0;->a:Ljava/lang/String;

    .line 78
    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 82
    .line 83
    .line 84
    move-result-wide v4

    .line 85
    const-wide/32 v6, 0x36ee80

    .line 86
    .line 87
    .line 88
    add-long/2addr v4, v6

    .line 89
    invoke-virtual {v0, v4, v5, v3}, Lha/k;->f(JLjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v1, Lha/c0;->c:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1}, Lha/k;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    new-instance v3, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v4, "\u8df3\u8fc7 "

    .line 101
    .line 102
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v1, "\uff1a"

    .line 109
    .line 110
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v0, v1}, Lha/k;->b(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_4
    iget-object v2, v0, Lha/k;->d:Ljava/lang/Object;

    .line 125
    .line 126
    monitor-enter v2

    .line 127
    :try_start_1
    invoke-virtual {v0}, Lha/k;->c()V

    .line 128
    .line 129
    .line 130
    iget-object v4, v0, Lha/k;->g:Ljava/util/LinkedHashSet;

    .line 131
    .line 132
    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-eqz v4, :cond_5

    .line 137
    .line 138
    :goto_3
    move v3, v8

    .line 139
    goto :goto_5

    .line 140
    :cond_5
    iget-object v4, v0, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 141
    .line 142
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    check-cast v4, Lha/j;

    .line 147
    .line 148
    if-eqz v4, :cond_6

    .line 149
    .line 150
    iget-wide v5, v4, Lha/j;->a:J

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    goto/16 :goto_9

    .line 155
    .line 156
    :cond_6
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 157
    .line 158
    .line 159
    move-result-wide v9

    .line 160
    cmp-long v4, v5, v9

    .line 161
    .line 162
    if-lez v4, :cond_7

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_7
    iget-object v4, v0, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 166
    .line 167
    new-instance v5, Lha/j;

    .line 168
    .line 169
    const-wide v9, 0x7fffffffffffffffL

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    invoke-direct {v5, v9, v10}, Lha/j;-><init>(J)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    .line 179
    .line 180
    move v3, v7

    .line 181
    :goto_5
    monitor-exit v2

    .line 182
    if-nez v3, :cond_8

    .line 183
    .line 184
    goto/16 :goto_b

    .line 185
    .line 186
    :cond_8
    iget-object v2, v0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 187
    .line 188
    const-string v3, "delay_mode"

    .line 189
    .line 190
    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-nez v3, :cond_a

    .line 195
    .line 196
    const-string v3, "fixed_delay_seconds"

    .line 197
    .line 198
    const/16 v4, 0x12c

    .line 199
    .line 200
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-gez v2, :cond_9

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_9
    move v8, v2

    .line 208
    :goto_6
    int-to-long v2, v8

    .line 209
    goto :goto_8

    .line 210
    :cond_a
    const-string v3, "random_min_seconds"

    .line 211
    .line 212
    const/16 v4, 0x3c

    .line 213
    .line 214
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-gez v3, :cond_b

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_b
    move v8, v3

    .line 222
    :goto_7
    int-to-long v3, v8

    .line 223
    const-string v5, "random_max_seconds"

    .line 224
    .line 225
    const/16 v6, 0xe10

    .line 226
    .line 227
    invoke-interface {v2, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    int-to-long v5, v2

    .line 232
    cmp-long v2, v5, v3

    .line 233
    .line 234
    if-gez v2, :cond_c

    .line 235
    .line 236
    move-wide v5, v3

    .line 237
    :cond_c
    cmp-long v2, v3, v5

    .line 238
    .line 239
    if-nez v2, :cond_d

    .line 240
    .line 241
    move-wide v2, v3

    .line 242
    goto :goto_8

    .line 243
    :cond_d
    const-wide/16 v7, 0x1

    .line 244
    .line 245
    add-long/2addr v5, v7

    .line 246
    sget-object v2, Ljg/d;->g:Ljg/a;

    .line 247
    .line 248
    invoke-virtual {v2, v3, v4, v5, v6}, Ljg/d;->e(JJ)J

    .line 249
    .line 250
    .line 251
    move-result-wide v2

    .line 252
    :goto_8
    iget-object v4, v1, Lha/c0;->c:Ljava/lang/String;

    .line 253
    .line 254
    invoke-static {v4}, Lha/k;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    iget-object v5, v1, Lha/c0;->e:Lha/d0;

    .line 259
    .line 260
    iget-object v5, v5, Lha/d0;->g:Ljava/lang/String;

    .line 261
    .line 262
    const-string v6, "\u5df2\u6355\u6349 "

    .line 263
    .line 264
    const-string v7, " \u7684"

    .line 265
    .line 266
    const-string v8, "\u670b\u53cb\u5708\uff0c"

    .line 267
    .line 268
    invoke-static {v6, v4, v7, v5, v8}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string v5, "\u79d2\u540e\u70b9\u8d5e"

    .line 276
    .line 277
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-virtual {v0, v4}, Lha/k;->b(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    iget-object v4, v0, Lha/k;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 288
    .line 289
    new-instance v5, La1/d;

    .line 290
    .line 291
    const/16 v6, 0xe

    .line 292
    .line 293
    invoke-direct {v5, v0, v6, v1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 297
    .line 298
    invoke-virtual {v4, v5, v2, v3, v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    iget-object v3, v0, Lha/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 303
    .line 304
    iget-object v4, v1, Lha/c0;->a:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    if-eqz v3, :cond_e

    .line 314
    .line 315
    iget-object v0, v0, Lha/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 316
    .line 317
    iget-object v1, v1, Lha/c0;->a:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :goto_9
    monitor-exit v2

    .line 324
    throw v0

    .line 325
    :goto_a
    monitor-exit v3

    .line 326
    throw v0

    .line 327
    :cond_e
    :goto_b
    return-void
.end method

.method private final c()V
    .locals 12

    .line 1
    iget-object v0, p0, La1/d;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lha/k;

    .line 4
    .line 5
    iget-object v1, p0, La1/d;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lha/c0;

    .line 8
    .line 9
    const-string v2, "\u70b9\u8d5e\u5931\u8d25 "

    .line 10
    .line 11
    const-string v3, "\u70b9\u8d5e\u6210\u529f "

    .line 12
    .line 13
    const-string v4, "\u53d6\u6d88 "

    .line 14
    .line 15
    const-wide/32 v5, 0x927c0

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v0, v1}, Lha/k;->e(Lha/c0;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    iget-object v2, v1, Lha/c0;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v8

    .line 30
    const-wide/32 v10, 0x36ee80

    .line 31
    .line 32
    .line 33
    add-long/2addr v8, v10

    .line 34
    invoke-virtual {v0, v8, v9, v2}, Lha/k;->f(JLjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v1, Lha/c0;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v2}, Lha/k;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, "\uff1a"

    .line 52
    .line 53
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v0, v2}, Lha/k;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    :goto_0
    iget-object v0, v0, Lha/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 67
    .line 68
    iget-object v1, v1, Lha/c0;->a:Ljava/lang/String;

    .line 69
    .line 70
    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catchall_0
    move-exception v2

    .line 75
    goto :goto_3

    .line 76
    :cond_0
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    if-eqz v4, :cond_1

    .line 81
    .line 82
    iget-object v7, v1, Lha/c0;->g:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-virtual {v4, v7}, Lp8/d0;->k(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const/4 v7, 0x1

    .line 89
    if-ne v4, v7, :cond_1

    .line 90
    .line 91
    iget-object v2, v1, Lha/c0;->c:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Lha/k;->d(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object v2, v1, Lha/c0;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v4, v0, Lha/k;->d:Ljava/lang/Object;

    .line 99
    .line 100
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    :try_start_2
    iget-object v7, v0, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    invoke-virtual {v7, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    iget-object v7, v0, Lha/k;->g:Ljava/util/LinkedHashSet;

    .line 107
    .line 108
    invoke-virtual {v7, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 109
    .line 110
    .line 111
    :try_start_3
    monitor-exit v4

    .line 112
    invoke-virtual {v0}, Lha/k;->g()V

    .line 113
    .line 114
    .line 115
    iget-object v2, v1, Lha/c0;->c:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v2}, Lha/k;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iget-object v4, v1, Lha/c0;->e:Lha/d0;

    .line 122
    .line 123
    iget-object v4, v4, Lha/d0;->g:Ljava/lang/String;

    .line 124
    .line 125
    new-instance v7, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v2, " \u00b7 "

    .line 134
    .line 135
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v0, v2}, Lha/k;->b(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catchall_1
    move-exception v2

    .line 150
    monitor-exit v4

    .line 151
    throw v2

    .line 152
    :cond_1
    iget-object v3, v1, Lha/c0;->a:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 155
    .line 156
    .line 157
    move-result-wide v7

    .line 158
    add-long/2addr v7, v5

    .line 159
    invoke-virtual {v0, v7, v8, v3}, Lha/k;->f(JLjava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-object v3, v1, Lha/c0;->c:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v3}, Lha/k;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    new-instance v4, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v2, "\uff0c\u7a0d\u540e\u5141\u8bb8\u91cd\u8bd5"

    .line 177
    .line 178
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v0, v2}, Lha/k;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    .line 187
    .line 188
    :goto_2
    iget-object v0, v0, Lha/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 189
    .line 190
    iget-object v1, v1, Lha/c0;->a:Ljava/lang/String;

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :goto_3
    :try_start_4
    iget-object v3, v1, Lha/c0;->a:Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 196
    .line 197
    .line 198
    move-result-wide v7

    .line 199
    add-long/2addr v7, v5

    .line 200
    invoke-virtual {v0, v7, v8, v3}, Lha/k;->f(JLjava/lang/String;)V

    .line 201
    .line 202
    .line 203
    iget-object v3, v0, Lha/k;->a:Lab/b;

    .line 204
    .line 205
    const-string v4, "\u6267\u884c\u670b\u53cb\u5708\u70b9\u8d5e\u5931\u8d25"

    .line 206
    .line 207
    invoke-virtual {v3, v4, v2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 208
    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :catchall_2
    move-exception v2

    .line 213
    iget-object v0, v0, Lha/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 214
    .line 215
    iget-object v1, v1, Lha/c0;->a:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    throw v2
.end method

.method private final d()V
    .locals 9

    .line 1
    iget-object v0, p0, La1/d;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lha/b0;

    .line 4
    .line 5
    iget-object v1, p0, La1/d;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_e

    .line 12
    .line 13
    invoke-static {v1, v2}, Loh/h;->z(Ljava/lang/Object;Lp8/d0;)Lha/c0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_e

    .line 18
    .line 19
    iget-object v2, v0, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    const-string v3, "enabled_at_seconds"

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    iget-wide v6, v1, Lha/c0;->d:J

    .line 30
    .line 31
    cmp-long v8, v6, v4

    .line 32
    .line 33
    if-lez v8, :cond_e

    .line 34
    .line 35
    cmp-long v4, v2, v4

    .line 36
    .line 37
    if-lez v4, :cond_e

    .line 38
    .line 39
    cmp-long v2, v6, v2

    .line 40
    .line 41
    if-gez v2, :cond_0

    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_0
    iget-object v2, v0, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 46
    .line 47
    const-string v3, "targets"

    .line 48
    .line 49
    const-string v4, ""

    .line 50
    .line 51
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2}, Lr9/e0;->S(Ljava/lang/String;)Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-object v3, v1, Lha/c0;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_1
    iget-object v2, v1, Lha/c0;->a:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v3, v0, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 72
    .line 73
    monitor-enter v3

    .line 74
    :try_start_0
    iget-object v4, v0, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 75
    .line 76
    invoke-virtual {v4, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 80
    if-nez v2, :cond_2

    .line 81
    .line 82
    monitor-exit v3

    .line 83
    return-void

    .line 84
    :cond_2
    :try_start_1
    iget-object v2, v0, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 85
    .line 86
    invoke-static {v2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    monitor-exit v3

    .line 91
    new-instance v3, Lorg/json/JSONArray;

    .line 92
    .line 93
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_3

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    iget-object v2, v0, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 115
    .line 116
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    const-string v4, "notified_ids"

    .line 121
    .line 122
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 131
    .line 132
    .line 133
    iget-object v2, v1, Lha/c0;->c:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    if-eqz v3, :cond_5

    .line 140
    .line 141
    invoke-virtual {v3, v2}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    if-eqz v3, :cond_5

    .line 146
    .line 147
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-eqz v3, :cond_5

    .line 152
    .line 153
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_4

    .line 158
    .line 159
    move-object v3, v2

    .line 160
    :cond_4
    if-eqz v3, :cond_5

    .line 161
    .line 162
    move-object v2, v3

    .line 163
    :cond_5
    iget-object v3, v0, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 164
    .line 165
    const-string v4, "title_template"

    .line 166
    .line 167
    const-string v5, ""

    .line 168
    .line 169
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    if-nez v3, :cond_6

    .line 174
    .line 175
    const-string v3, ""

    .line 176
    .line 177
    :cond_6
    invoke-static {v1, v3, v2}, Lha/b0;->a(Lha/c0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-eqz v4, :cond_7

    .line 186
    .line 187
    const-string v3, "\ud83d\udce3 \u6307\u5b9a\u597d\u53cb\u53d1\u5e03\u670b\u53cb\u5708"

    .line 188
    .line 189
    :cond_7
    iget-object v4, v0, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 190
    .line 191
    const-string v5, "body_template"

    .line 192
    .line 193
    const-string v6, ""

    .line 194
    .line 195
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    if-nez v4, :cond_8

    .line 200
    .line 201
    const-string v4, ""

    .line 202
    .line 203
    :cond_8
    invoke-static {v1, v4, v2}, Lha/b0;->a(Lha/c0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-eqz v5, :cond_a

    .line 212
    .line 213
    iget-object v4, v1, Lha/c0;->e:Lha/d0;

    .line 214
    .line 215
    iget-object v4, v4, Lha/d0;->g:Ljava/lang/String;

    .line 216
    .line 217
    const-string v5, " \u53d1\u5e03\u4e86"

    .line 218
    .line 219
    const-string v6, "\u670b\u53cb\u5708"

    .line 220
    .line 221
    invoke-static {v2, v5, v4, v6}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    iget-object v5, v1, Lha/c0;->f:Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    if-eqz v6, :cond_9

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_9
    const-string v6, "\uff1a"

    .line 235
    .line 236
    invoke-static {v4, v6, v5}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    :cond_a
    :goto_1
    iget-object v5, v0, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 241
    .line 242
    const-string v6, "system_notification"

    .line 243
    .line 244
    const/4 v7, 0x1

    .line 245
    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-eqz v5, :cond_b

    .line 250
    .line 251
    :try_start_2
    invoke-virtual {v0, v1, v3, v4}, Lha/b0;->c(Lha/c0;Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    sget-object v3, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :catchall_0
    move-exception v3

    .line 258
    new-instance v4, Lsf/f;

    .line 259
    .line 260
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    move-object v3, v4

    .line 264
    :goto_2
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    if-eqz v3, :cond_b

    .line 269
    .line 270
    iget-object v4, v0, Lha/b0;->a:Lab/b;

    .line 271
    .line 272
    const-string v5, "\u53d1\u9001\u670b\u53cb\u5708\u53d1\u5e03\u901a\u77e5\u5931\u8d25"

    .line 273
    .line 274
    invoke-virtual {v4, v5, v3}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    :cond_b
    iget-object v3, v0, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 278
    .line 279
    const-string v4, "toast"

    .line 280
    .line 281
    invoke-interface {v3, v4, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-eqz v3, :cond_e

    .line 286
    .line 287
    iget-object v3, v0, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 288
    .line 289
    const-string v4, "toast_template"

    .line 290
    .line 291
    const-string v5, ""

    .line 292
    .line 293
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    if-nez v3, :cond_c

    .line 298
    .line 299
    const-string v3, ""

    .line 300
    .line 301
    :cond_c
    invoke-static {v1, v3, v2}, Lha/b0;->a(Lha/c0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    if-eqz v4, :cond_d

    .line 310
    .line 311
    iget-object v1, v1, Lha/c0;->e:Lha/d0;

    .line 312
    .line 313
    iget-object v1, v1, Lha/d0;->g:Ljava/lang/String;

    .line 314
    .line 315
    const-string v3, "\ud83d\udce3 "

    .line 316
    .line 317
    const-string v4, " \u53d1\u5e03\u4e86"

    .line 318
    .line 319
    const-string v5, "\u670b\u53cb\u5708"

    .line 320
    .line 321
    invoke-static {v3, v2, v4, v1, v5}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    :cond_d
    iget-object v1, v0, Lha/b0;->d:Landroid/os/Handler;

    .line 326
    .line 327
    new-instance v2, La1/d;

    .line 328
    .line 329
    const/16 v4, 0x10

    .line 330
    .line 331
    invoke-direct {v2, v0, v4, v3}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_3

    .line 338
    :catchall_1
    move-exception v0

    .line 339
    monitor-exit v3

    .line 340
    throw v0

    .line 341
    :cond_e
    :goto_3
    return-void
.end method

.method private final e()V
    .locals 12

    .line 1
    iget-object v0, p0, La1/d;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/TextView;

    .line 4
    .line 5
    iget-object v1, p0, La1/d;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [I

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    sub-int/2addr v2, v3

    .line 18
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingRight()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sub-int/2addr v2, v3

    .line 23
    int-to-float v2, v2

    .line 24
    const/high16 v3, 0x3f800000    # 1.0f

    .line 25
    .line 26
    cmpg-float v4, v2, v3

    .line 27
    .line 28
    if-gez v4, :cond_0

    .line 29
    .line 30
    move v2, v3

    .line 31
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-static {v4, v3, v2}, Lr9/e0;->q(FFF)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    int-to-float v5, v3

    .line 56
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    new-instance v4, Landroid/graphics/LinearGradient;

    .line 61
    .line 62
    add-float v7, v5, v2

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    aget v9, v1, v2

    .line 66
    .line 67
    const/4 v2, 0x1

    .line 68
    aget v10, v1, v2

    .line 69
    .line 70
    sget-object v11, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-direct/range {v4 .. v11}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method private final f()V
    .locals 9

    .line 1
    iget-object v0, p0, La1/d;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/FrameLayout;

    .line 4
    .line 5
    iget-object v1, p0, La1/d;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/view/ViewGroup;

    .line 8
    .line 9
    sget-object v2, Lk9/r;->a:Lk9/r;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    instance-of v3, v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 20
    .line 21
    :goto_0
    move-object v4, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    goto :goto_0

    .line 25
    :goto_1
    if-eqz v4, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    invoke-static/range {v3 .. v8}, Lk9/r;->b(Landroid/content/Context;Landroid/widget/FrameLayout$LayoutParams;IIII)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_2
    const/4 v1, 0x0

    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method private final g()V
    .locals 9

    .line 1
    iget-object v0, p0, La1/d;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lob/n;

    .line 4
    .line 5
    iget-object v1, p0, La1/d;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "\u6587\u5b57\u8f6c\u8bed\u97f3\u64ad\u653e\u5931\u8d25"

    .line 10
    .line 11
    const-string v3, ".part"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-virtual {v0, v4}, Lob/n;->j(Lob/j;)Lob/k;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    iget-object v5, v0, Lob/n;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Lob/n;->c(Lob/k;)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const/4 v7, 0x0

    .line 25
    :try_start_0
    invoke-virtual {v0, v1, v4, v6}, Lob/n;->k(Ljava/lang/String;Lob/k;Ljava/io/File;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Lob/n;->d()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v7, 0x1

    .line 42
    iget-object v1, v0, Lob/n;->d:Landroid/os/Handler;

    .line 43
    .line 44
    new-instance v4, La1/d;

    .line 45
    .line 46
    const/16 v8, 0x1a

    .line 47
    .line 48
    invoke-direct {v4, v0, v8, v6}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    new-instance v0, Ljava/io/File;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2, v3}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception v1

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    :goto_1
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 78
    .line 79
    .line 80
    new-instance v0, Ljava/io/File;

    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {v2, v3}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :goto_2
    :try_start_1
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    iget-object v4, v0, Lob/n;->b:Lia/t;

    .line 105
    .line 106
    invoke-virtual {v4, v2, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    invoke-static {v2, v1}, Lob/n;->m(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v0, v1}, Lob/n;->l(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :catchall_1
    move-exception v0

    .line 118
    goto :goto_4

    .line 119
    :cond_2
    :goto_3
    if-nez v7, :cond_3

    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 122
    .line 123
    .line 124
    :cond_3
    new-instance v0, Ljava/io/File;

    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-static {v2, v3}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :goto_4
    if-nez v7, :cond_4

    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 145
    .line 146
    .line 147
    :cond_4
    new-instance v1, Ljava/io/File;

    .line 148
    .line 149
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-static {v4, v3}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 165
    .line 166
    .line 167
    throw v0
.end method

.method private final h()V
    .locals 7

    .line 1
    iget-object v0, p0, La1/d;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lob/n;

    .line 4
    .line 5
    iget-object v1, p0, La1/d;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/io/File;

    .line 8
    .line 9
    iget-object v2, v0, Lob/n;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, Lob/n;->d()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {v0}, Lob/n;->g()V

    .line 31
    .line 32
    .line 33
    iget-wide v2, v0, Lob/n;->n:J

    .line 34
    .line 35
    const-wide/16 v4, 0x1

    .line 36
    .line 37
    add-long/2addr v2, v4

    .line 38
    iput-wide v2, v0, Lob/n;->n:J

    .line 39
    .line 40
    new-instance v4, Landroid/media/MediaPlayer;

    .line 41
    .line 42
    invoke-direct {v4}, Landroid/media/MediaPlayer;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v4, v0, Lob/n;->l:Landroid/media/MediaPlayer;

    .line 46
    .line 47
    iput-object v1, v0, Lob/n;->m:Ljava/io/File;

    .line 48
    .line 49
    :try_start_0
    new-instance v5, Landroid/media/AudioAttributes$Builder;

    .line 50
    .line 51
    invoke-direct {v5}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    invoke-virtual {v5, v6}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v5, v6}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v5}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v4, v5}, Landroid/media/MediaPlayer;->setAudioAttributes(Landroid/media/AudioAttributes;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v4, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lob/g;

    .line 78
    .line 79
    invoke-direct {v1, v2, v3, v0}, Lob/g;-><init>(JLob/n;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Lob/h;

    .line 86
    .line 87
    invoke-direct {v1, v2, v3, v0}, Lob/h;-><init>(JLob/n;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 91
    .line 92
    .line 93
    new-instance v1, Lob/i;

    .line 94
    .line 95
    invoke-direct {v1, v2, v3, v0}, Lob/i;-><init>(JLob/n;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 102
    .line 103
    .line 104
    sget-object v1, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception v1

    .line 108
    new-instance v2, Lsf/f;

    .line 109
    .line 110
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    move-object v1, v2

    .line 114
    :goto_0
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-eqz v1, :cond_1

    .line 119
    .line 120
    iget-object v2, v0, Lob/n;->b:Lia/t;

    .line 121
    .line 122
    const-string v3, "\u542f\u52a8\u6587\u5b57\u8f6c\u8bed\u97f3\u64ad\u653e\u5668\u5931\u8d25"

    .line 123
    .line 124
    invoke-virtual {v2, v3, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    const-string v1, "\u8bed\u97f3\u64ad\u653e\u5931\u8d25"

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Lob/n;->l(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lob/n;->g()V

    .line 133
    .line 134
    .line 135
    :cond_1
    return-void

    .line 136
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method private final i()V
    .locals 4

    .line 1
    iget-object v0, p0, La1/d;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq8/r;

    .line 4
    .line 5
    iget-object v1, p0, La1/d;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    :try_start_0
    iget-object v2, v0, Lq8/r;->a:Landroid/content/Context;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v2, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v3, "Toast\u5931\u8d25: "

    .line 24
    .line 25
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lq8/r;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, La1/d;->g:I

    .line 4
    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v6, 0x1

    .line 8
    const/4 v7, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lra/h;

    .line 15
    .line 16
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    new-instance v4, Lra/d;

    .line 25
    .line 26
    invoke-direct {v4, v0, v2}, Lra/d;-><init>(Lra/h;Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v4}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lr8/d;

    .line 36
    .line 37
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v3, v0, Lr8/d;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    invoke-virtual {v3, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 44
    .line 45
    .line 46
    sget-object v3, Lr8/e;->a:Landroid/os/Handler;

    .line 47
    .line 48
    iget-object v3, v0, Lr8/d;->b:Lr8/c;

    .line 49
    .line 50
    invoke-static {v3}, Lr8/e;->b(Lr8/c;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    invoke-static {v2, v0}, Lr8/e;->d(Ljava/lang/String;Lr8/d;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void

    .line 60
    :pswitch_1
    invoke-direct {v1}, La1/d;->i()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_2
    invoke-direct {v1}, La1/d;->h()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_3
    invoke-direct {v1}, La1/d;->g()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_4
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Ln8/c;

    .line 75
    .line 76
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v0, v0, Ln8/c;->d:Ljava/util/Map;

    .line 79
    .line 80
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lfg/l;

    .line 85
    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    invoke-interface {v0, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    :cond_1
    return-void

    .line 92
    :pswitch_5
    invoke-direct {v1}, La1/d;->f()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_6
    invoke-direct {v1}, La1/d;->e()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_7
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lb/e;

    .line 103
    .line 104
    iget-object v2, v0, Lb/e;->i:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, Ljava/lang/reflect/Method;

    .line 107
    .line 108
    iget-object v3, v1, La1/d;->i:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, Lfg/p;

    .line 111
    .line 112
    :try_start_0
    iget-object v0, v0, Lb/e;->h:Ljava/lang/Object;

    .line 113
    .line 114
    new-array v4, v7, [Ljava/lang/Object;

    .line 115
    .line 116
    invoke-static {v2, v0, v4}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    goto :goto_0

    .line 121
    :catchall_0
    move-exception v0

    .line 122
    new-instance v4, Lsf/f;

    .line 123
    .line 124
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    move-object v0, v4

    .line 128
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-eqz v0, :cond_2

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    new-instance v4, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v5, "\u9000\u51fa\u591a\u9009\u72b6\u6001\u5931\u8d25: "

    .line 141
    .line 142
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-interface {v3, v2, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    :cond_2
    return-void

    .line 156
    :pswitch_8
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Ljava/util/ArrayList;

    .line 159
    .line 160
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v2, Ljb/e;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    move v3, v7

    .line 169
    move v4, v3

    .line 170
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    if-eqz v6, :cond_6

    .line 175
    .line 176
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    add-int/lit8 v8, v3, 0x1

    .line 181
    .line 182
    if-ltz v3, :cond_5

    .line 183
    .line 184
    check-cast v6, Lorg/json/JSONObject;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v6}, Ljb/e;->d(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    if-eqz v3, :cond_4

    .line 194
    .line 195
    iget-object v6, v2, Ljb/e;->a:Lr8/g;

    .line 196
    .line 197
    iget-object v6, v6, Lr8/g;->a:Landroid/content/Context;

    .line 198
    .line 199
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 200
    .line 201
    .line 202
    move-result-wide v9

    .line 203
    new-instance v11, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    const-string v12, "finder_image_"

    .line 206
    .line 207
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v9, "_"

    .line 214
    .line 215
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v9, ".png"

    .line 222
    .line 223
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    sget-object v10, Lzb/b;->a:Lsf/i;

    .line 231
    .line 232
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    if-eqz v10, :cond_3

    .line 237
    .line 238
    move-object v3, v5

    .line 239
    goto :goto_2

    .line 240
    :cond_3
    new-instance v10, Ljava/io/File;

    .line 241
    .line 242
    const-string v11, "Finder"

    .line 243
    .line 244
    invoke-static {v6, v11}, Lzb/b;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    const-string v11, "finder_image"

    .line 249
    .line 250
    invoke-static {v3}, Lzb/b;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    invoke-static {v9, v11, v12}, Lzb/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    invoke-direct {v10, v6, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v10, v3, v7}, Lzb/b;->g(Ljava/io/File;Ljava/lang/String;Z)Ljava/io/File;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    :goto_2
    if-eqz v3, :cond_4

    .line 266
    .line 267
    add-int/lit8 v4, v4, 0x1

    .line 268
    .line 269
    :cond_4
    move v3, v8

    .line 270
    goto :goto_1

    .line 271
    :cond_5
    invoke-static {}, La/a;->Q0()V

    .line 272
    .line 273
    .line 274
    throw v5

    .line 275
    :cond_6
    if-lez v4, :cond_7

    .line 276
    .line 277
    const-string v0, "\u5df2\u4e0b\u8f7d "

    .line 278
    .line 279
    const-string v3, " \u5f20\u56fe\u7247\u5230 Hchat/Finder"

    .line 280
    .line 281
    invoke-static {v4, v0, v3}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    goto :goto_3

    .line 286
    :cond_7
    const-string v0, "\u56fe\u7247\u4e0b\u8f7d\u5931\u8d25"

    .line 287
    .line 288
    :goto_3
    invoke-virtual {v2, v0}, Ljb/e;->k(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :pswitch_9
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 293
    .line 294
    move-object v2, v0

    .line 295
    check-cast v2, Ljb/e;

    .line 296
    .line 297
    iget-object v0, v1, La1/d;->i:Ljava/lang/Object;

    .line 298
    .line 299
    move-object v3, v0

    .line 300
    check-cast v3, Lorg/json/JSONObject;

    .line 301
    .line 302
    const-string v4, ".mp4"

    .line 303
    .line 304
    const-string v6, "finder_video_"

    .line 305
    .line 306
    const-string v0, "decodeKey"

    .line 307
    .line 308
    const-string v8, "decode_key"

    .line 309
    .line 310
    filled-new-array {v0, v8}, [Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-static {v3, v0}, Ljb/e;->h(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    iget-object v9, v2, Ljb/e;->a:Lr8/g;

    .line 322
    .line 323
    const-string v0, "spec"

    .line 324
    .line 325
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    if-eqz v0, :cond_8

    .line 330
    .line 331
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    move v11, v7

    .line 336
    :goto_4
    if-lt v11, v10, :cond_9

    .line 337
    .line 338
    :cond_8
    move-object v12, v5

    .line 339
    goto :goto_7

    .line 340
    :cond_9
    invoke-virtual {v0, v11}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 341
    .line 342
    .line 343
    move-result-object v12

    .line 344
    if-eqz v12, :cond_c

    .line 345
    .line 346
    const-string v13, "codingFormat"

    .line 347
    .line 348
    const-string v14, "coding_format"

    .line 349
    .line 350
    filled-new-array {v13, v14}, [Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v13

    .line 354
    invoke-static {v12, v13}, Ljb/e;->h(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v13

    .line 358
    const-string v14, "h265"

    .line 359
    .line 360
    invoke-virtual {v13, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result v14

    .line 364
    if-nez v14, :cond_a

    .line 365
    .line 366
    const-string v14, "hevc"

    .line 367
    .line 368
    invoke-virtual {v13, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 369
    .line 370
    .line 371
    move-result v13

    .line 372
    if-nez v13, :cond_a

    .line 373
    .line 374
    goto :goto_6

    .line 375
    :cond_a
    const-string v13, "fileFormat"

    .line 376
    .line 377
    const-string v14, "file_format"

    .line 378
    .line 379
    filled-new-array {v13, v14}, [Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v13

    .line 383
    invoke-static {v12, v13}, Ljb/e;->h(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v12

    .line 387
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 388
    .line 389
    .line 390
    move-result v13

    .line 391
    if-nez v13, :cond_b

    .line 392
    .line 393
    goto :goto_5

    .line 394
    :cond_b
    move-object v12, v5

    .line 395
    :goto_5
    if-eqz v12, :cond_c

    .line 396
    .line 397
    goto :goto_7

    .line 398
    :cond_c
    :goto_6
    add-int/lit8 v11, v11, 0x1

    .line 399
    .line 400
    goto :goto_4

    .line 401
    :goto_7
    if-eqz v12, :cond_10

    .line 402
    .line 403
    const-string v0, "url"

    .line 404
    .line 405
    filled-new-array {v0}, [Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v3, v0}, Ljb/e;->h(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    const-string v10, "url_token"

    .line 414
    .line 415
    const-string v11, "urlToken"

    .line 416
    .line 417
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v10

    .line 421
    invoke-static {v3, v10}, Ljb/e;->h(Lorg/json/JSONObject;[Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v10

    .line 425
    invoke-virtual {v0, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 430
    .line 431
    .line 432
    move-result v10

    .line 433
    if-nez v10, :cond_d

    .line 434
    .line 435
    goto :goto_8

    .line 436
    :cond_d
    move-object v0, v5

    .line 437
    :goto_8
    if-eqz v0, :cond_10

    .line 438
    .line 439
    :try_start_1
    sget-object v10, Lokhttp3/HttpUrl;->Companion:Lokhttp3/HttpUrl$Companion;

    .line 440
    .line 441
    invoke-virtual {v10, v0}, Lokhttp3/HttpUrl$Companion;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    if-eqz v0, :cond_e

    .line 446
    .line 447
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    if-eqz v0, :cond_e

    .line 452
    .line 453
    const-string v10, "X-snsvideoflag"

    .line 454
    .line 455
    invoke-virtual {v0, v10, v12}, Lokhttp3/HttpUrl$Builder;->setQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    if-eqz v0, :cond_e

    .line 460
    .line 461
    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    if-eqz v0, :cond_e

    .line 466
    .line 467
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 471
    goto :goto_a

    .line 472
    :catchall_1
    move-exception v0

    .line 473
    goto :goto_9

    .line 474
    :cond_e
    move-object v0, v5

    .line 475
    goto :goto_a

    .line 476
    :goto_9
    new-instance v10, Lsf/f;

    .line 477
    .line 478
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 479
    .line 480
    .line 481
    move-object v0, v10

    .line 482
    :goto_a
    nop

    .line 483
    instance-of v10, v0, Lsf/f;

    .line 484
    .line 485
    if-eqz v10, :cond_f

    .line 486
    .line 487
    move-object v0, v5

    .line 488
    :cond_f
    check-cast v0, Ljava/lang/String;

    .line 489
    .line 490
    goto :goto_b

    .line 491
    :cond_10
    move-object v0, v5

    .line 492
    :goto_b
    invoke-static {v3}, Ljb/e;->i(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v10

    .line 496
    if-eqz v0, :cond_12

    .line 497
    .line 498
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 499
    .line 500
    .line 501
    move-result v11

    .line 502
    if-eqz v11, :cond_11

    .line 503
    .line 504
    goto :goto_c

    .line 505
    :cond_11
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 506
    .line 507
    .line 508
    move-result v11

    .line 509
    if-nez v11, :cond_12

    .line 510
    .line 511
    iget-object v3, v9, Lr8/g;->a:Landroid/content/Context;

    .line 512
    .line 513
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 514
    .line 515
    .line 516
    move-result-wide v9

    .line 517
    new-instance v5, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    invoke-static {v3, v0, v8, v4}, Lzb/b;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    goto :goto_e

    .line 537
    :cond_12
    :goto_c
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    if-nez v0, :cond_14

    .line 542
    .line 543
    iget-object v0, v9, Lr8/g;->a:Landroid/content/Context;

    .line 544
    .line 545
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 546
    .line 547
    .line 548
    move-result-wide v8

    .line 549
    new-instance v3, Ljava/lang/StringBuilder;

    .line 550
    .line 551
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    sget-object v4, Lzb/b;->a:Lsf/i;

    .line 565
    .line 566
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 567
    .line 568
    .line 569
    move-result v4

    .line 570
    if-eqz v4, :cond_13

    .line 571
    .line 572
    goto :goto_d

    .line 573
    :cond_13
    new-instance v4, Ljava/io/File;

    .line 574
    .line 575
    const-string v5, "Finder"

    .line 576
    .line 577
    invoke-static {v0, v5}, Lzb/b;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    const-string v5, "finder_video"

    .line 582
    .line 583
    const-string v6, "mp4"

    .line 584
    .line 585
    invoke-static {v3, v5, v6}, Lzb/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    invoke-direct {v4, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    invoke-static {v4, v10, v7}, Lzb/b;->g(Ljava/io/File;Ljava/lang/String;Z)Ljava/io/File;

    .line 593
    .line 594
    .line 595
    move-result-object v5

    .line 596
    :goto_d
    move-object v0, v5

    .line 597
    goto :goto_e

    .line 598
    :cond_14
    iget-object v0, v9, Lr8/g;->a:Landroid/content/Context;

    .line 599
    .line 600
    invoke-static {v3}, Ljb/e;->d(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 605
    .line 606
    .line 607
    move-result-wide v9

    .line 608
    new-instance v5, Ljava/lang/StringBuilder;

    .line 609
    .line 610
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v4

    .line 623
    invoke-static {v0, v3, v8, v4}, Lzb/b;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    :goto_e
    if-eqz v0, :cond_15

    .line 628
    .line 629
    const-string v0, "\u5df2\u4e0b\u8f7d\u89c6\u9891\u5230 Hchat/Finder"

    .line 630
    .line 631
    goto :goto_f

    .line 632
    :cond_15
    const-string v0, "\u89c6\u9891\u4e0b\u8f7d\u5931\u8d25"

    .line 633
    .line 634
    :goto_f
    invoke-virtual {v2, v0}, Ljb/e;->k(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    return-void

    .line 638
    :pswitch_a
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v0, Landroid/app/Activity;

    .line 641
    .line 642
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v2, Lhb/e0;

    .line 645
    .line 646
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 647
    .line 648
    .line 649
    move-result v3

    .line 650
    if-nez v3, :cond_16

    .line 651
    .line 652
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-nez v0, :cond_16

    .line 657
    .line 658
    invoke-virtual {v2}, Lhb/e0;->invoke()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    :cond_16
    return-void

    .line 662
    :pswitch_b
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v0, Lhb/k;

    .line 665
    .line 666
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v2, Ljava/lang/String;

    .line 669
    .line 670
    iget-object v3, v0, Lhb/k;->g:Lhb/i;

    .line 671
    .line 672
    if-eqz v3, :cond_17

    .line 673
    .line 674
    iget-object v4, v3, Lhb/i;->a:Ljava/lang/String;

    .line 675
    .line 676
    goto :goto_10

    .line 677
    :cond_17
    move-object v4, v5

    .line 678
    :goto_10
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v4

    .line 682
    if-eqz v4, :cond_1b

    .line 683
    .line 684
    iget-object v2, v0, Lhb/k;->i:Lb9/c;

    .line 685
    .line 686
    if-eqz v2, :cond_18

    .line 687
    .line 688
    iget-object v4, v0, Lhb/k;->c:Landroid/os/Handler;

    .line 689
    .line 690
    invoke-virtual {v4, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 691
    .line 692
    .line 693
    :cond_18
    iput-object v5, v0, Lhb/k;->i:Lb9/c;

    .line 694
    .line 695
    iget-object v2, v0, Lhb/k;->h:Ljava/lang/Object;

    .line 696
    .line 697
    if-eqz v2, :cond_19

    .line 698
    .line 699
    const-string v4, "cancel"

    .line 700
    .line 701
    new-array v6, v7, [Ljava/lang/Object;

    .line 702
    .line 703
    invoke-static {v2, v4, v6}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    :cond_19
    iput-object v5, v0, Lhb/k;->h:Ljava/lang/Object;

    .line 707
    .line 708
    iput-object v5, v0, Lhb/k;->g:Lhb/i;

    .line 709
    .line 710
    iget-object v2, v3, Lhb/i;->d:Lfg/q;

    .line 711
    .line 712
    if-eqz v2, :cond_1a

    .line 713
    .line 714
    iget v4, v3, Lhb/i;->f:I

    .line 715
    .line 716
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 717
    .line 718
    .line 719
    move-result-object v4

    .line 720
    iget v3, v3, Lhb/i;->c:I

    .line 721
    .line 722
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 723
    .line 724
    .line 725
    move-result-object v3

    .line 726
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 727
    .line 728
    invoke-interface {v2, v4, v3, v5}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    :cond_1a
    invoke-virtual {v0}, Lhb/k;->n()V

    .line 732
    .line 733
    .line 734
    goto :goto_12

    .line 735
    :cond_1b
    iget-object v0, v0, Lhb/k;->e:Ljava/util/ArrayDeque;

    .line 736
    .line 737
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 742
    .line 743
    .line 744
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    if-eqz v3, :cond_1d

    .line 749
    .line 750
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    check-cast v3, Lhb/i;

    .line 755
    .line 756
    iget-object v4, v3, Lhb/i;->a:Ljava/lang/String;

    .line 757
    .line 758
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 759
    .line 760
    .line 761
    move-result v4

    .line 762
    if-nez v4, :cond_1c

    .line 763
    .line 764
    goto :goto_11

    .line 765
    :cond_1c
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 766
    .line 767
    .line 768
    iget-object v0, v3, Lhb/i;->d:Lfg/q;

    .line 769
    .line 770
    if-eqz v0, :cond_1d

    .line 771
    .line 772
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 773
    .line 774
    .line 775
    move-result-object v2

    .line 776
    iget v3, v3, Lhb/i;->c:I

    .line 777
    .line 778
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 783
    .line 784
    invoke-interface {v0, v2, v3, v4}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    :cond_1d
    :goto_12
    return-void

    .line 788
    :pswitch_c
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast v0, Lha/b0;

    .line 791
    .line 792
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast v2, Ljava/lang/String;

    .line 795
    .line 796
    iget-object v0, v0, Lha/b0;->b:Landroid/content/Context;

    .line 797
    .line 798
    invoke-static {v0, v2, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 803
    .line 804
    .line 805
    return-void

    .line 806
    :pswitch_d
    invoke-direct {v1}, La1/d;->d()V

    .line 807
    .line 808
    .line 809
    return-void

    .line 810
    :pswitch_e
    invoke-direct {v1}, La1/d;->c()V

    .line 811
    .line 812
    .line 813
    return-void

    .line 814
    :pswitch_f
    invoke-direct {v1}, La1/d;->b()V

    .line 815
    .line 816
    .line 817
    return-void

    .line 818
    :pswitch_10
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 819
    .line 820
    move-object v2, v0

    .line 821
    check-cast v2, Lha/d;

    .line 822
    .line 823
    iget-object v0, v1, La1/d;->i:Ljava/lang/Object;

    .line 824
    .line 825
    move-object v3, v0

    .line 826
    check-cast v3, Lha/c0;

    .line 827
    .line 828
    const-string v0, "\u8bc4\u8bba\u5931\u8d25 "

    .line 829
    .line 830
    const-string v4, "\u8bc4\u8bba\u5df2\u63d0\u4ea4 "

    .line 831
    .line 832
    const-string v5, "\u53d6\u6d88 "

    .line 833
    .line 834
    const-string v7, "\u53d6\u6d88 "

    .line 835
    .line 836
    const-wide/32 v8, 0x927c0

    .line 837
    .line 838
    .line 839
    :try_start_2
    invoke-virtual {v2, v3}, Lha/d;->f(Lha/c0;)Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v10

    .line 843
    const-wide/32 v11, 0x36ee80

    .line 844
    .line 845
    .line 846
    if-eqz v10, :cond_1e

    .line 847
    .line 848
    iget-object v0, v3, Lha/c0;->a:Ljava/lang/String;

    .line 849
    .line 850
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 851
    .line 852
    .line 853
    move-result-wide v4

    .line 854
    add-long/2addr v4, v11

    .line 855
    invoke-virtual {v2, v4, v5, v0}, Lha/d;->g(JLjava/lang/String;)V

    .line 856
    .line 857
    .line 858
    iget-object v0, v3, Lha/c0;->c:Ljava/lang/String;

    .line 859
    .line 860
    invoke-static {v0}, Lha/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    new-instance v4, Ljava/lang/StringBuilder;

    .line 865
    .line 866
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 870
    .line 871
    .line 872
    const-string v0, "\uff1a"

    .line 873
    .line 874
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 878
    .line 879
    .line 880
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    invoke-virtual {v2, v0}, Lha/d;->c(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 885
    .line 886
    .line 887
    :goto_13
    iget-object v0, v2, Lha/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 888
    .line 889
    iget-object v2, v3, Lha/c0;->a:Ljava/lang/String;

    .line 890
    .line 891
    :goto_14
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    goto/16 :goto_17

    .line 895
    .line 896
    :catchall_2
    move-exception v0

    .line 897
    goto/16 :goto_16

    .line 898
    .line 899
    :cond_1e
    :try_start_3
    invoke-virtual {v2}, Lha/d;->h()Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v7

    .line 903
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 904
    .line 905
    .line 906
    move-result v10

    .line 907
    if-nez v10, :cond_1f

    .line 908
    .line 909
    iget-object v0, v3, Lha/c0;->a:Ljava/lang/String;

    .line 910
    .line 911
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 912
    .line 913
    .line 914
    move-result-wide v6

    .line 915
    add-long/2addr v6, v11

    .line 916
    invoke-virtual {v2, v6, v7, v0}, Lha/d;->g(JLjava/lang/String;)V

    .line 917
    .line 918
    .line 919
    iget-object v0, v3, Lha/c0;->c:Ljava/lang/String;

    .line 920
    .line 921
    invoke-static {v0}, Lha/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    new-instance v4, Ljava/lang/StringBuilder;

    .line 926
    .line 927
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    const-string v0, "\uff1a\u8bc4\u8bba\u5185\u5bb9\u4e3a\u7a7a"

    .line 934
    .line 935
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    invoke-virtual {v2, v0}, Lha/d;->c(Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    goto :goto_13

    .line 946
    :cond_1f
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 947
    .line 948
    .line 949
    move-result-object v5

    .line 950
    if-eqz v5, :cond_20

    .line 951
    .line 952
    iget-object v10, v3, Lha/c0;->g:Ljava/lang/Object;

    .line 953
    .line 954
    invoke-virtual {v5, v10, v7}, Lp8/d0;->e(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 955
    .line 956
    .line 957
    move-result v5

    .line 958
    if-ne v5, v6, :cond_20

    .line 959
    .line 960
    iget-object v0, v3, Lha/c0;->c:Ljava/lang/String;

    .line 961
    .line 962
    invoke-virtual {v2, v0}, Lha/d;->e(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    iget-object v0, v3, Lha/c0;->a:Ljava/lang/String;

    .line 966
    .line 967
    iget-object v5, v2, Lha/d;->d:Ljava/lang/Object;

    .line 968
    .line 969
    monitor-enter v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 970
    :try_start_4
    iget-object v6, v2, Lha/d;->f:Ljava/util/LinkedHashMap;

    .line 971
    .line 972
    invoke-virtual {v6, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    iget-object v6, v2, Lha/d;->g:Ljava/util/LinkedHashSet;

    .line 976
    .line 977
    invoke-virtual {v6, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 978
    .line 979
    .line 980
    :try_start_5
    monitor-exit v5

    .line 981
    invoke-virtual {v2}, Lha/d;->i()V

    .line 982
    .line 983
    .line 984
    iget-object v0, v3, Lha/c0;->c:Ljava/lang/String;

    .line 985
    .line 986
    invoke-static {v0}, Lha/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    iget-object v5, v3, Lha/c0;->e:Lha/d0;

    .line 991
    .line 992
    iget-object v5, v5, Lha/d0;->g:Ljava/lang/String;

    .line 993
    .line 994
    new-instance v6, Ljava/lang/StringBuilder;

    .line 995
    .line 996
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1000
    .line 1001
    .line 1002
    const-string v0, " \u00b7 "

    .line 1003
    .line 1004
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    invoke-virtual {v2, v0}, Lha/d;->c(Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    goto :goto_15

    .line 1018
    :catchall_3
    move-exception v0

    .line 1019
    monitor-exit v5

    .line 1020
    throw v0

    .line 1021
    :cond_20
    iget-object v4, v3, Lha/c0;->a:Ljava/lang/String;

    .line 1022
    .line 1023
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1024
    .line 1025
    .line 1026
    move-result-wide v5

    .line 1027
    add-long/2addr v5, v8

    .line 1028
    invoke-virtual {v2, v5, v6, v4}, Lha/d;->g(JLjava/lang/String;)V

    .line 1029
    .line 1030
    .line 1031
    iget-object v4, v3, Lha/c0;->c:Ljava/lang/String;

    .line 1032
    .line 1033
    invoke-static {v4}, Lha/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v4

    .line 1037
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1038
    .line 1039
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1043
    .line 1044
    .line 1045
    const-string v0, "\uff0c\u7a0d\u540e\u5141\u8bb8\u91cd\u8bd5"

    .line 1046
    .line 1047
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    invoke-virtual {v2, v0}, Lha/d;->c(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1055
    .line 1056
    .line 1057
    :goto_15
    iget-object v0, v2, Lha/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1058
    .line 1059
    iget-object v2, v3, Lha/c0;->a:Ljava/lang/String;

    .line 1060
    .line 1061
    goto/16 :goto_14

    .line 1062
    .line 1063
    :goto_16
    :try_start_6
    iget-object v4, v3, Lha/c0;->a:Ljava/lang/String;

    .line 1064
    .line 1065
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1066
    .line 1067
    .line 1068
    move-result-wide v5

    .line 1069
    add-long/2addr v5, v8

    .line 1070
    invoke-virtual {v2, v5, v6, v4}, Lha/d;->g(JLjava/lang/String;)V

    .line 1071
    .line 1072
    .line 1073
    iget-object v4, v2, Lha/d;->a:Lab/b;

    .line 1074
    .line 1075
    const-string v5, "\u6267\u884c\u670b\u53cb\u5708\u8bc4\u8bba\u5931\u8d25"

    .line 1076
    .line 1077
    invoke-virtual {v4, v5, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1078
    .line 1079
    .line 1080
    goto/16 :goto_13

    .line 1081
    .line 1082
    :goto_17
    return-void

    .line 1083
    :catchall_4
    move-exception v0

    .line 1084
    iget-object v2, v2, Lha/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1085
    .line 1086
    iget-object v3, v3, Lha/c0;->a:Ljava/lang/String;

    .line 1087
    .line 1088
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    throw v0

    .line 1092
    :pswitch_11
    invoke-direct {v1}, La1/d;->a()V

    .line 1093
    .line 1094
    .line 1095
    return-void

    .line 1096
    :pswitch_12
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 1097
    .line 1098
    check-cast v0, Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 1099
    .line 1100
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 1101
    .line 1102
    check-cast v2, Leb/w0;

    .line 1103
    .line 1104
    invoke-static {v0, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->j(Lh/Hchat/hooks/items/script/ScriptWaBridge;Leb/w0;)V

    .line 1105
    .line 1106
    .line 1107
    return-void

    .line 1108
    :pswitch_13
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 1109
    .line 1110
    check-cast v0, Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 1111
    .line 1112
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 1113
    .line 1114
    check-cast v2, Ljava/lang/Runnable;

    .line 1115
    .line 1116
    invoke-static {v0, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->c(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Runnable;)V

    .line 1117
    .line 1118
    .line 1119
    return-void

    .line 1120
    :pswitch_14
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v0, Landroid/content/Context;

    .line 1123
    .line 1124
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v2, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 1127
    .line 1128
    invoke-static {v0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->d(Landroid/content/Context;Lh/Hchat/hooks/items/script/ScriptPluginBridge;)V

    .line 1129
    .line 1130
    .line 1131
    return-void

    .line 1132
    :pswitch_15
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v0, Landroid/content/Context;

    .line 1135
    .line 1136
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 1137
    .line 1138
    check-cast v2, Leb/c0;

    .line 1139
    .line 1140
    invoke-static {v0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->u(Landroid/content/Context;Leb/c0;)V

    .line 1141
    .line 1142
    .line 1143
    return-void

    .line 1144
    :pswitch_16
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 1145
    .line 1146
    move-object v5, v0

    .line 1147
    check-cast v5, Ld9/e;

    .line 1148
    .line 1149
    iget-object v0, v1, La1/d;->i:Ljava/lang/Object;

    .line 1150
    .line 1151
    check-cast v0, Landroid/net/Uri;

    .line 1152
    .line 1153
    iget-object v8, v5, Ld9/e;->a:Landroid/app/Activity;

    .line 1154
    .line 1155
    iget-object v9, v5, Ld9/e;->b:Ljava/lang/String;

    .line 1156
    .line 1157
    iget-boolean v10, v5, Ld9/e;->c:Z

    .line 1158
    .line 1159
    sget-object v11, Ld9/o;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1160
    .line 1161
    const-string v11, "[Hchat:CustomFriendAvatar] \u4fdd\u5b58\u81ea\u5b9a\u4e49\u597d\u53cb\u5934\u50cf\u5931\u8d25: wxid="

    .line 1162
    .line 1163
    const-class v12, Ld9/o;

    .line 1164
    .line 1165
    monitor-enter v12

    .line 1166
    :try_start_7
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1170
    .line 1171
    .line 1172
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v9

    .line 1176
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v9

    .line 1180
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1181
    .line 1182
    .line 1183
    move-result v13
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_9

    .line 1184
    if-nez v13, :cond_21

    .line 1185
    .line 1186
    monitor-exit v12

    .line 1187
    goto/16 :goto_20

    .line 1188
    .line 1189
    :cond_21
    :try_start_8
    invoke-static {v8, v0}, Ld9/o;->c(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    if-eqz v0, :cond_2b

    .line 1194
    .line 1195
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1196
    .line 1197
    .line 1198
    move-result v13

    .line 1199
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1200
    .line 1201
    .line 1202
    move-result v14

    .line 1203
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    .line 1204
    .line 1205
    .line 1206
    move-result v13

    .line 1207
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1208
    .line 1209
    .line 1210
    move-result v14

    .line 1211
    if-ne v14, v13, :cond_22

    .line 1212
    .line 1213
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1214
    .line 1215
    .line 1216
    move-result v14

    .line 1217
    if-ne v14, v13, :cond_22

    .line 1218
    .line 1219
    goto :goto_18

    .line 1220
    :catchall_5
    move-exception v0

    .line 1221
    goto/16 :goto_1d

    .line 1222
    .line 1223
    :cond_22
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1224
    .line 1225
    .line 1226
    move-result v14

    .line 1227
    sub-int/2addr v14, v13

    .line 1228
    div-int/2addr v14, v4

    .line 1229
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1230
    .line 1231
    .line 1232
    move-result v15

    .line 1233
    sub-int/2addr v15, v13

    .line 1234
    div-int/2addr v15, v4

    .line 1235
    invoke-static {v0, v14, v15, v13, v13}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0

    .line 1239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1240
    .line 1241
    .line 1242
    :goto_18
    invoke-static {v8, v9}, Ld9/o;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v13

    .line 1246
    invoke-virtual {v13}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v14

    .line 1250
    if-eqz v14, :cond_23

    .line 1251
    .line 1252
    invoke-virtual {v14}, Ljava/io/File;->mkdirs()Z

    .line 1253
    .line 1254
    .line 1255
    :cond_23
    new-instance v14, Ljava/io/File;

    .line 1256
    .line 1257
    invoke-virtual {v13}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v15

    .line 1261
    const-wide/16 v16, 0x0

    .line 1262
    .line 1263
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v2

    .line 1267
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1273
    .line 1274
    .line 1275
    const-string v2, ".tmp"

    .line 1276
    .line 1277
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v2

    .line 1284
    invoke-direct {v14, v15, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1285
    .line 1286
    .line 1287
    new-instance v2, Ljava/io/FileOutputStream;

    .line 1288
    .line 1289
    invoke-direct {v2, v14}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 1290
    .line 1291
    .line 1292
    :try_start_9
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 1293
    .line 1294
    const/16 v15, 0x64

    .line 1295
    .line 1296
    invoke-virtual {v0, v3, v15, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 1297
    .line 1298
    .line 1299
    move-result v0

    .line 1300
    if-eqz v0, :cond_2a

    .line 1301
    .line 1302
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v0

    .line 1306
    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 1307
    .line 1308
    .line 1309
    :try_start_a
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    .line 1313
    .line 1314
    .line 1315
    move-result v0

    .line 1316
    if-eqz v0, :cond_29

    .line 1317
    .line 1318
    invoke-virtual {v14}, Ljava/io/File;->length()J

    .line 1319
    .line 1320
    .line 1321
    move-result-wide v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 1322
    cmp-long v0, v2, v16

    .line 1323
    .line 1324
    if-lez v0, :cond_29

    .line 1325
    .line 1326
    :try_start_b
    invoke-virtual {v14}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v0

    .line 1330
    invoke-virtual {v13}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v2

    .line 1334
    new-array v3, v4, [Ljava/nio/file/CopyOption;

    .line 1335
    .line 1336
    sget-object v4, Ljava/nio/file/StandardCopyOption;->ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;

    .line 1337
    .line 1338
    aput-object v4, v3, v7

    .line 1339
    .line 1340
    sget-object v4, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 1341
    .line 1342
    aput-object v4, v3, v6

    .line 1343
    .line 1344
    invoke-static {v0, v2, v3}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 1348
    goto :goto_19

    .line 1349
    :catchall_6
    move-exception v0

    .line 1350
    :try_start_c
    new-instance v2, Lsf/f;

    .line 1351
    .line 1352
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1353
    .line 1354
    .line 1355
    move-object v0, v2

    .line 1356
    :goto_19
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    if-nez v0, :cond_24

    .line 1361
    .line 1362
    goto :goto_1b

    .line 1363
    :cond_24
    invoke-virtual {v13}, Ljava/io/File;->exists()Z

    .line 1364
    .line 1365
    .line 1366
    move-result v0

    .line 1367
    if-eqz v0, :cond_26

    .line 1368
    .line 1369
    invoke-virtual {v13}, Ljava/io/File;->delete()Z

    .line 1370
    .line 1371
    .line 1372
    move-result v0

    .line 1373
    if-eqz v0, :cond_25

    .line 1374
    .line 1375
    goto :goto_1a

    .line 1376
    :cond_25
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1377
    .line 1378
    const-string v2, "\u65e7\u5934\u50cf\u5220\u9664\u5931\u8d25"

    .line 1379
    .line 1380
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1381
    .line 1382
    .line 1383
    throw v0

    .line 1384
    :cond_26
    :goto_1a
    invoke-virtual {v14, v13}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 1385
    .line 1386
    .line 1387
    move-result v0

    .line 1388
    if-eqz v0, :cond_28

    .line 1389
    .line 1390
    :goto_1b
    if-eqz v10, :cond_27

    .line 1391
    .line 1392
    invoke-static {v8}, Ld9/o;->b(Landroid/content/Context;)Ljava/util/LinkedHashSet;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    invoke-interface {v0, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1401
    .line 1402
    .line 1403
    const-string v2, "Hchat_custom_friend_avatar_config"

    .line 1404
    .line 1405
    invoke-static {v8, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v2

    .line 1409
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v2

    .line 1413
    const-string v3, "configured_friends"

    .line 1414
    .line 1415
    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v0

    .line 1419
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1420
    .line 1421
    .line 1422
    :cond_27
    sget-object v0, Ld9/o;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1423
    .line 1424
    invoke-virtual {v0, v9}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1428
    .line 1429
    goto :goto_1e

    .line 1430
    :cond_28
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1431
    .line 1432
    const-string v2, "\u5934\u50cf\u66ff\u6362\u5931\u8d25"

    .line 1433
    .line 1434
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1435
    .line 1436
    .line 1437
    throw v0

    .line 1438
    :cond_29
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1439
    .line 1440
    const-string v2, "\u5934\u50cf\u6587\u4ef6\u4e3a\u7a7a"

    .line 1441
    .line 1442
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1443
    .line 1444
    .line 1445
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 1446
    :catchall_7
    move-exception v0

    .line 1447
    move-object v3, v0

    .line 1448
    goto :goto_1c

    .line 1449
    :cond_2a
    :try_start_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1450
    .line 1451
    const-string v3, "\u5934\u50cf\u5199\u5165\u5931\u8d25"

    .line 1452
    .line 1453
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 1457
    :goto_1c
    :try_start_e
    throw v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 1458
    :catchall_8
    move-exception v0

    .line 1459
    :try_start_f
    invoke-static {v2, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1460
    .line 1461
    .line 1462
    throw v0

    .line 1463
    :cond_2b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1464
    .line 1465
    const-string v2, "\u65e0\u6cd5\u89e3\u6790\u56fe\u7247"

    .line 1466
    .line 1467
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1468
    .line 1469
    .line 1470
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 1471
    :goto_1d
    :try_start_10
    new-instance v2, Lsf/f;

    .line 1472
    .line 1473
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1474
    .line 1475
    .line 1476
    move-object v0, v2

    .line 1477
    :goto_1e
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    if-nez v2, :cond_2c

    .line 1482
    .line 1483
    goto :goto_1f

    .line 1484
    :cond_2c
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v0

    .line 1488
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1489
    .line 1490
    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1494
    .line 1495
    .line 1496
    const-string v4, ", error="

    .line 1497
    .line 1498
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1499
    .line 1500
    .line 1501
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v0

    .line 1508
    invoke-static {v0, v2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1509
    .line 1510
    .line 1511
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1512
    .line 1513
    :goto_1f
    check-cast v0, Ljava/lang/Boolean;

    .line 1514
    .line 1515
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1516
    .line 1517
    .line 1518
    move-result v7
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 1519
    monitor-exit v12

    .line 1520
    :goto_20
    iget-object v0, v5, Ld9/e;->a:Landroid/app/Activity;

    .line 1521
    .line 1522
    new-instance v2, Lba/e;

    .line 1523
    .line 1524
    invoke-direct {v2, v5, v7, v6}, Lba/e;-><init>(Ljava/lang/Object;ZI)V

    .line 1525
    .line 1526
    .line 1527
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1528
    .line 1529
    .line 1530
    return-void

    .line 1531
    :catchall_9
    move-exception v0

    .line 1532
    :try_start_11
    monitor-exit v12
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 1533
    throw v0

    .line 1534
    :pswitch_17
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 1535
    .line 1536
    check-cast v0, Lud/l;

    .line 1537
    .line 1538
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 1539
    .line 1540
    check-cast v2, Lud/r;

    .line 1541
    .line 1542
    invoke-static {v0, v2}, Lbe/d0;->i(Lud/l;Lud/r;)V

    .line 1543
    .line 1544
    .line 1545
    return-void

    .line 1546
    :pswitch_18
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 1547
    .line 1548
    check-cast v0, Lbb/g;

    .line 1549
    .line 1550
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 1551
    .line 1552
    check-cast v2, Ljava/lang/String;

    .line 1553
    .line 1554
    iget-object v3, v0, Lbb/g;->g:Ljava/util/Map;

    .line 1555
    .line 1556
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1557
    .line 1558
    .line 1559
    monitor-enter v3

    .line 1560
    :try_start_12
    iget-object v4, v0, Lbb/g;->g:Ljava/util/Map;

    .line 1561
    .line 1562
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v4

    .line 1566
    check-cast v4, Ljava/lang/Iterable;

    .line 1567
    .line 1568
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 1572
    monitor-exit v3

    .line 1573
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v3

    .line 1577
    :cond_2d
    :goto_21
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1578
    .line 1579
    .line 1580
    move-result v4

    .line 1581
    if-eqz v4, :cond_30

    .line 1582
    .line 1583
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v4

    .line 1587
    check-cast v4, Ljava/util/Map$Entry;

    .line 1588
    .line 1589
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v5

    .line 1593
    check-cast v5, Landroid/widget/TextView;

    .line 1594
    .line 1595
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v4

    .line 1599
    check-cast v4, Ljava/lang/String;

    .line 1600
    .line 1601
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1602
    .line 1603
    .line 1604
    move-result v4

    .line 1605
    if-eqz v4, :cond_2d

    .line 1606
    .line 1607
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1608
    .line 1609
    .line 1610
    iget-object v4, v0, Lbb/g;->b:Lbb/l;

    .line 1611
    .line 1612
    iget-object v6, v4, Lbb/l;->a:Landroid/content/SharedPreferences;

    .line 1613
    .line 1614
    const-string v8, "enable"

    .line 1615
    .line 1616
    invoke-interface {v6, v8, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1617
    .line 1618
    .line 1619
    move-result v6

    .line 1620
    if-eqz v6, :cond_2e

    .line 1621
    .line 1622
    invoke-virtual {v4, v2}, Lbb/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v4

    .line 1626
    invoke-virtual {v0, v5, v2, v4}, Lbb/g;->c(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1627
    .line 1628
    .line 1629
    goto :goto_22

    .line 1630
    :cond_2e
    invoke-static {v5}, Lbb/g;->j(Landroid/widget/TextView;)V

    .line 1631
    .line 1632
    .line 1633
    :goto_22
    iget-object v4, v0, Lbb/g;->c:Lib/b;

    .line 1634
    .line 1635
    iget-object v4, v4, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 1636
    .line 1637
    const-string v6, "enable"

    .line 1638
    .line 1639
    invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1640
    .line 1641
    .line 1642
    move-result v4

    .line 1643
    if-eqz v4, :cond_2f

    .line 1644
    .line 1645
    invoke-virtual {v0, v5}, Lbb/g;->b(Landroid/widget/TextView;)V

    .line 1646
    .line 1647
    .line 1648
    goto :goto_21

    .line 1649
    :cond_2f
    invoke-static {v5}, Lbb/g;->i(Landroid/widget/TextView;)V

    .line 1650
    .line 1651
    .line 1652
    goto :goto_21

    .line 1653
    :cond_30
    return-void

    .line 1654
    :catchall_a
    move-exception v0

    .line 1655
    monitor-exit v3

    .line 1656
    throw v0

    .line 1657
    :pswitch_19
    const-wide/16 v16, 0x0

    .line 1658
    .line 1659
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 1660
    .line 1661
    move-object v2, v0

    .line 1662
    check-cast v2, Lba/d;

    .line 1663
    .line 1664
    iget-object v0, v1, La1/d;->i:Ljava/lang/Object;

    .line 1665
    .line 1666
    check-cast v0, Landroid/net/Uri;

    .line 1667
    .line 1668
    iget-object v3, v2, Lba/d;->a:Landroid/app/Activity;

    .line 1669
    .line 1670
    iget-object v5, v2, Lba/d;->b:Lba/n;

    .line 1671
    .line 1672
    sget-object v8, Lba/r;->a:Lba/r;

    .line 1673
    .line 1674
    const-class v8, Lba/r;

    .line 1675
    .line 1676
    monitor-enter v8

    .line 1677
    :try_start_13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1678
    .line 1679
    .line 1680
    sget-object v9, Lba/r;->a:Lba/r;

    .line 1681
    .line 1682
    invoke-static {v3, v5}, Lba/r;->a(Landroid/content/Context;Lba/n;)Ljava/io/File;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v9

    .line 1686
    new-instance v10, Ljava/io/File;

    .line 1687
    .line 1688
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v11

    .line 1692
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v12

    .line 1696
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1697
    .line 1698
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1702
    .line 1703
    .line 1704
    const-string v12, ".tmp"

    .line 1705
    .line 1706
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v12

    .line 1713
    invoke-direct {v10, v11, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_16

    .line 1714
    .line 1715
    .line 1716
    :try_start_14
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v11

    .line 1720
    if-eqz v11, :cond_31

    .line 1721
    .line 1722
    invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z

    .line 1723
    .line 1724
    .line 1725
    goto :goto_23

    .line 1726
    :catchall_b
    move-exception v0

    .line 1727
    move-object v15, v5

    .line 1728
    goto/16 :goto_2c

    .line 1729
    .line 1730
    :cond_31
    :goto_23
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v3

    .line 1734
    invoke-virtual {v3, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v3
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    .line 1738
    if-eqz v3, :cond_3a

    .line 1739
    .line 1740
    :try_start_15
    new-instance v11, Ljava/io/FileOutputStream;

    .line 1741
    .line 1742
    invoke-direct {v11, v10}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_13

    .line 1743
    .line 1744
    .line 1745
    const/16 v0, 0x2000

    .line 1746
    .line 1747
    :try_start_16
    new-array v0, v0, [B

    .line 1748
    .line 1749
    move-wide/from16 v12, v16

    .line 1750
    .line 1751
    :goto_24
    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I

    .line 1752
    .line 1753
    .line 1754
    move-result v14
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_10

    .line 1755
    if-gez v14, :cond_38

    .line 1756
    .line 1757
    :try_start_17
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v0

    .line 1761
    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_e

    .line 1762
    .line 1763
    .line 1764
    :try_start_18
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    .line 1765
    .line 1766
    .line 1767
    :try_start_19
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v10}, Ljava/io/File;->isFile()Z

    .line 1771
    .line 1772
    .line 1773
    move-result v0

    .line 1774
    if-eqz v0, :cond_37

    .line 1775
    .line 1776
    invoke-virtual {v10}, Ljava/io/File;->length()J

    .line 1777
    .line 1778
    .line 1779
    move-result-wide v11

    .line 1780
    cmp-long v0, v11, v16

    .line 1781
    .line 1782
    if-lez v0, :cond_37

    .line 1783
    .line 1784
    invoke-static {v10}, Lba/r;->b(Ljava/io/File;)Lba/o;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v16
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_b

    .line 1788
    if-eqz v16, :cond_36

    .line 1789
    .line 1790
    :try_start_1a
    invoke-virtual {v10}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v0

    .line 1794
    invoke-virtual {v9}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v3

    .line 1798
    new-array v4, v4, [Ljava/nio/file/CopyOption;

    .line 1799
    .line 1800
    sget-object v11, Ljava/nio/file/StandardCopyOption;->ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;

    .line 1801
    .line 1802
    aput-object v11, v4, v7

    .line 1803
    .line 1804
    sget-object v11, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 1805
    .line 1806
    aput-object v11, v4, v6

    .line 1807
    .line 1808
    invoke-static {v0, v3, v4}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_c

    .line 1812
    goto :goto_25

    .line 1813
    :catchall_c
    move-exception v0

    .line 1814
    :try_start_1b
    new-instance v3, Lsf/f;

    .line 1815
    .line 1816
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1817
    .line 1818
    .line 1819
    move-object v0, v3

    .line 1820
    :goto_25
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v0

    .line 1824
    if-nez v0, :cond_32

    .line 1825
    .line 1826
    goto :goto_27

    .line 1827
    :cond_32
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 1828
    .line 1829
    .line 1830
    move-result v0

    .line 1831
    if-eqz v0, :cond_34

    .line 1832
    .line 1833
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 1834
    .line 1835
    .line 1836
    move-result v0

    .line 1837
    if-eqz v0, :cond_33

    .line 1838
    .line 1839
    goto :goto_26

    .line 1840
    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1841
    .line 1842
    const-string v3, "\u65e7\u6c14\u6ce1\u6587\u4ef6\u5220\u9664\u5931\u8d25"

    .line 1843
    .line 1844
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1845
    .line 1846
    .line 1847
    throw v0

    .line 1848
    :cond_34
    :goto_26
    invoke-virtual {v10, v9}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 1849
    .line 1850
    .line 1851
    move-result v0

    .line 1852
    if-eqz v0, :cond_35

    .line 1853
    .line 1854
    :goto_27
    sget-object v0, Lba/r;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1855
    .line 1856
    new-instance v11, Lba/p;

    .line 1857
    .line 1858
    invoke-virtual {v9}, Ljava/io/File;->lastModified()J

    .line 1859
    .line 1860
    .line 1861
    move-result-wide v12

    .line 1862
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 1863
    .line 1864
    .line 1865
    move-result-wide v14

    .line 1866
    invoke-direct/range {v11 .. v16}, Lba/p;-><init>(JJLba/o;)V

    .line 1867
    .line 1868
    .line 1869
    invoke-virtual {v0, v5, v11}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1870
    .line 1871
    .line 1872
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1873
    .line 1874
    move-object v15, v5

    .line 1875
    goto/16 :goto_2d

    .line 1876
    .line 1877
    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1878
    .line 1879
    const-string v3, "\u6c14\u6ce1\u6587\u4ef6\u66ff\u6362\u5931\u8d25"

    .line 1880
    .line 1881
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1882
    .line 1883
    .line 1884
    throw v0

    .line 1885
    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1886
    .line 1887
    const-string v3, "\u65e0\u6cd5\u89e3\u6790\u6c14\u6ce1\u56fe\u7247"

    .line 1888
    .line 1889
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1890
    .line 1891
    .line 1892
    throw v0

    .line 1893
    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1894
    .line 1895
    const-string v3, "\u6c14\u6ce1\u6587\u4ef6\u4e3a\u7a7a"

    .line 1896
    .line 1897
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1898
    .line 1899
    .line 1900
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_b

    .line 1901
    :catchall_d
    move-exception v0

    .line 1902
    move-object v4, v0

    .line 1903
    move-object v15, v5

    .line 1904
    goto :goto_2b

    .line 1905
    :catchall_e
    move-exception v0

    .line 1906
    move-object v4, v0

    .line 1907
    move-object v15, v5

    .line 1908
    goto :goto_29

    .line 1909
    :cond_38
    move-object v15, v5

    .line 1910
    int-to-long v4, v14

    .line 1911
    add-long/2addr v12, v4

    .line 1912
    const-wide/32 v4, 0x2000000

    .line 1913
    .line 1914
    .line 1915
    cmp-long v4, v12, v4

    .line 1916
    .line 1917
    if-gtz v4, :cond_39

    .line 1918
    .line 1919
    :try_start_1c
    invoke-virtual {v11, v0, v7, v14}, Ljava/io/FileOutputStream;->write([BII)V

    .line 1920
    .line 1921
    .line 1922
    move-object v5, v15

    .line 1923
    const/4 v4, 0x2

    .line 1924
    goto/16 :goto_24

    .line 1925
    .line 1926
    :catchall_f
    move-exception v0

    .line 1927
    :goto_28
    move-object v4, v0

    .line 1928
    goto :goto_29

    .line 1929
    :cond_39
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1930
    .line 1931
    const-string v4, "\u6c14\u6ce1\u6587\u4ef6\u4e0d\u80fd\u8d85\u8fc7 32 MB"

    .line 1932
    .line 1933
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1934
    .line 1935
    .line 1936
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_f

    .line 1937
    :catchall_10
    move-exception v0

    .line 1938
    move-object v15, v5

    .line 1939
    goto :goto_28

    .line 1940
    :goto_29
    :try_start_1d
    throw v4
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_11

    .line 1941
    :catchall_11
    move-exception v0

    .line 1942
    :try_start_1e
    invoke-static {v11, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1943
    .line 1944
    .line 1945
    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_12

    .line 1946
    :catchall_12
    move-exception v0

    .line 1947
    :goto_2a
    move-object v4, v0

    .line 1948
    goto :goto_2b

    .line 1949
    :catchall_13
    move-exception v0

    .line 1950
    move-object v15, v5

    .line 1951
    goto :goto_2a

    .line 1952
    :goto_2b
    :try_start_1f
    throw v4
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_14

    .line 1953
    :catchall_14
    move-exception v0

    .line 1954
    :try_start_20
    invoke-static {v3, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1955
    .line 1956
    .line 1957
    throw v0

    .line 1958
    :catchall_15
    move-exception v0

    .line 1959
    goto :goto_2c

    .line 1960
    :cond_3a
    move-object v15, v5

    .line 1961
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1962
    .line 1963
    const-string v3, "\u65e0\u6cd5\u8bfb\u53d6\u6c14\u6ce1\u6587\u4ef6"

    .line 1964
    .line 1965
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1966
    .line 1967
    .line 1968
    throw v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_15

    .line 1969
    :goto_2c
    :try_start_21
    new-instance v3, Lsf/f;

    .line 1970
    .line 1971
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1972
    .line 1973
    .line 1974
    move-object v0, v3

    .line 1975
    :goto_2d
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v3

    .line 1979
    if-nez v3, :cond_3b

    .line 1980
    .line 1981
    goto :goto_2e

    .line 1982
    :cond_3b
    invoke-virtual {v10}, Ljava/io/File;->delete()Z

    .line 1983
    .line 1984
    .line 1985
    iget-object v0, v15, Lba/n;->h:Ljava/lang/String;

    .line 1986
    .line 1987
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v4

    .line 1991
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1992
    .line 1993
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1994
    .line 1995
    .line 1996
    const-string v6, "[Hchat:MessageBubble] \u4fdd\u5b58"

    .line 1997
    .line 1998
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1999
    .line 2000
    .line 2001
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2002
    .line 2003
    .line 2004
    const-string v0, "\u5931\u8d25: "

    .line 2005
    .line 2006
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2007
    .line 2008
    .line 2009
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2010
    .line 2011
    .line 2012
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2013
    .line 2014
    .line 2015
    move-result-object v0

    .line 2016
    invoke-static {v0, v3}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2017
    .line 2018
    .line 2019
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2020
    .line 2021
    :goto_2e
    check-cast v0, Ljava/lang/Boolean;

    .line 2022
    .line 2023
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2024
    .line 2025
    .line 2026
    move-result v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_16

    .line 2027
    monitor-exit v8

    .line 2028
    iget-object v3, v2, Lba/d;->a:Landroid/app/Activity;

    .line 2029
    .line 2030
    new-instance v4, Lba/e;

    .line 2031
    .line 2032
    invoke-direct {v4, v2, v0, v7}, Lba/e;-><init>(Ljava/lang/Object;ZI)V

    .line 2033
    .line 2034
    .line 2035
    invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 2036
    .line 2037
    .line 2038
    return-void

    .line 2039
    :catchall_16
    move-exception v0

    .line 2040
    :try_start_22
    monitor-exit v8
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_16

    .line 2041
    throw v0

    .line 2042
    :pswitch_1a
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 2043
    .line 2044
    move-object v2, v0

    .line 2045
    check-cast v2, Lac/q;

    .line 2046
    .line 2047
    iget-object v0, v1, La1/d;->i:Ljava/lang/Object;

    .line 2048
    .line 2049
    check-cast v0, Ljava/lang/Runnable;

    .line 2050
    .line 2051
    :try_start_23
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_17

    .line 2052
    .line 2053
    .line 2054
    invoke-virtual {v2}, Lac/q;->a()V

    .line 2055
    .line 2056
    .line 2057
    return-void

    .line 2058
    :catchall_17
    move-exception v0

    .line 2059
    invoke-virtual {v2}, Lac/q;->a()V

    .line 2060
    .line 2061
    .line 2062
    throw v0

    .line 2063
    :pswitch_1b
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 2064
    .line 2065
    check-cast v0, Lac/o;

    .line 2066
    .line 2067
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 2068
    .line 2069
    check-cast v2, Ljava/lang/String;

    .line 2070
    .line 2071
    new-instance v3, Ljava/io/File;

    .line 2072
    .line 2073
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2074
    .line 2075
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 2076
    .line 2077
    .line 2078
    iget-object v5, v0, Lac/o;->a:Ljava/lang/String;

    .line 2079
    .line 2080
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2081
    .line 2082
    .line 2083
    iget-object v0, v0, Lac/o;->b:Ljava/lang/String;

    .line 2084
    .line 2085
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2086
    .line 2087
    .line 2088
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v0

    .line 2092
    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2093
    .line 2094
    .line 2095
    invoke-static {v3}, Lig/a;->n(Ljava/io/File;)V

    .line 2096
    .line 2097
    .line 2098
    return-void

    .line 2099
    :pswitch_1c
    iget-object v0, v1, La1/d;->h:Ljava/lang/Object;

    .line 2100
    .line 2101
    check-cast v0, La1/i;

    .line 2102
    .line 2103
    iget-object v2, v1, La1/d;->i:Ljava/lang/Object;

    .line 2104
    .line 2105
    check-cast v2, Landroid/util/LongSparseArray;

    .line 2106
    .line 2107
    invoke-static {v0, v2}, La7/a;->p(La1/i;Landroid/util/LongSparseArray;)V

    .line 2108
    .line 2109
    .line 2110
    return-void

    .line 2111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
