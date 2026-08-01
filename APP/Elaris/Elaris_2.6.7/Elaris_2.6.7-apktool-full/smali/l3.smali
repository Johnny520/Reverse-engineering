.class public abstract Ll3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll3;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "2.6.7"

    .line 6
    .line 7
    const-string v3, "com.mr.elaris"

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-wide/16 v6, 0x0

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 15
    .line 16
    .line 17
    move-result-object v8

    .line 18
    invoke-virtual {v8, v3, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    iget-wide v9, v8, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 23
    .line 24
    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    :try_start_1
    iget-wide v11, v8, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 29
    .line 30
    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    :try_start_2
    iget-object v8, v8, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 35
    .line 36
    if-eqz v8, :cond_1

    .line 37
    .line 38
    iget-object v8, v8, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 39
    .line 40
    if-nez v8, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    move-wide v13, v11

    .line 44
    move-wide v11, v9

    .line 45
    goto :goto_2

    .line 46
    :catchall_0
    move-wide v11, v6

    .line 47
    goto :goto_1

    .line 48
    :catchall_1
    move-wide v9, v6

    .line 49
    move-wide v11, v9

    .line 50
    :catchall_2
    :cond_1
    :goto_1
    move-object v8, v4

    .line 51
    goto :goto_0

    .line 52
    :goto_2
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-nez v9, :cond_3

    .line 57
    .line 58
    :try_start_3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-virtual {v9, v3, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 69
    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    move-object v8, v4

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    move-object v8, v3

    .line 75
    :catchall_3
    :cond_3
    :goto_3
    :try_start_4
    invoke-static {}, Lcom/mr/elaris/xposedcompat/XposedBridge;->getModuleApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 82
    .line 83
    if-nez v3, :cond_4

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    move-object v4, v3

    .line 87
    :goto_4
    move-object v8, v4

    .line 88
    :catchall_4
    :cond_5
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-lez v3, :cond_6

    .line 93
    .line 94
    :try_start_5
    new-instance v3, Ljava/io/File;

    .line 95
    .line 96
    invoke-direct {v3, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    .line 100
    .line 101
    .line 102
    move-result-wide v3

    .line 103
    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 107
    move-wide v15, v3

    .line 108
    goto :goto_5

    .line 109
    :catchall_5
    :cond_6
    move-wide v15, v6

    .line 110
    :goto_5
    const-string v3, "1220:"

    .line 111
    .line 112
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    new-instance v9, Lk3;

    .line 117
    .line 118
    invoke-direct/range {v9 .. v16}, Lk3;-><init>(Ljava/lang/String;JJJ)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 122
    .line 123
    .line 124
    move-result-wide v2

    .line 125
    invoke-static {v2, v3}, Ll3;->g(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    const-string v8, "elaris_analytics"

    .line 130
    .line 131
    invoke-virtual {v0, v8, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    const-class v21, Ll3;

    .line 136
    .line 137
    monitor-enter v21

    .line 138
    :try_start_6
    const-string v11, "install_id"

    .line 139
    .line 140
    const-string v12, ""

    .line 141
    .line 142
    invoke-interface {v8, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    const/16 v12, 0x10

    .line 147
    .line 148
    if-eqz v11, :cond_7

    .line 149
    .line 150
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 151
    .line 152
    .line 153
    move-result v13

    .line 154
    if-ge v13, v12, :cond_8

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :catchall_6
    move-exception v0

    .line 158
    goto/16 :goto_d

    .line 159
    .line 160
    :cond_7
    :goto_6
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    :cond_8
    const-string v13, "first_seen_at"

    .line 169
    .line 170
    invoke-interface {v8, v13, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 171
    .line 172
    .line 173
    move-result-wide v13

    .line 174
    const-string v15, "reported_module_revision"

    .line 175
    .line 176
    const-string v12, ""

    .line 177
    .line 178
    invoke-interface {v8, v15, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    const/16 v22, 0x0

    .line 187
    .line 188
    if-eqz v12, :cond_9

    .line 189
    .line 190
    monitor-exit v21

    .line 191
    move-object/from16 v11, v22

    .line 192
    .line 193
    const/16 v2, 0x10

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_9
    const-string v12, "report_total"

    .line 197
    .line 198
    invoke-interface {v8, v12, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 199
    .line 200
    .line 201
    move-result-wide v17

    .line 202
    const-wide/16 v19, 0x1

    .line 203
    .line 204
    add-long v17, v17, v19

    .line 205
    .line 206
    const-string v12, "launch_day"

    .line 207
    .line 208
    const-string v15, ""

    .line 209
    .line 210
    invoke-interface {v8, v12, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v12

    .line 214
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    const/4 v15, 0x1

    .line 219
    if-eqz v12, :cond_a

    .line 220
    .line 221
    const-string v12, "launch_day_count"

    .line 222
    .line 223
    invoke-interface {v8, v12, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    add-int/2addr v15, v12

    .line 228
    :cond_a
    invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    const-string v12, "install_id"

    .line 233
    .line 234
    invoke-interface {v8, v12, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    const-string v12, "first_seen_at"

    .line 239
    .line 240
    invoke-interface {v8, v12, v13, v14}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    const-string v12, "launch_day"

    .line 245
    .line 246
    invoke-interface {v8, v12, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    const-string v12, "launch_day_count"

    .line 251
    .line 252
    invoke-interface {v8, v12, v15}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    const-string v12, "last_attempt_at"

    .line 257
    .line 258
    invoke-interface {v8, v12, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    invoke-interface {v8}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 263
    .line 264
    .line 265
    move-object v12, v11

    .line 266
    new-instance v11, Lj3;

    .line 267
    .line 268
    move-object/from16 v19, v4

    .line 269
    .line 270
    move/from16 v20, v15

    .line 271
    .line 272
    move-wide v15, v2

    .line 273
    const/16 v2, 0x10

    .line 274
    .line 275
    invoke-direct/range {v11 .. v20}, Lj3;-><init>(Ljava/lang/String;JJJLjava/lang/String;I)V

    .line 276
    .line 277
    .line 278
    monitor-exit v21
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 279
    :goto_7
    if-nez v11, :cond_f

    .line 280
    .line 281
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 282
    .line 283
    .line 284
    move-result-wide v3

    .line 285
    invoke-static {v3, v4}, Ll3;->g(J)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    const-string v10, "elaris_analytics"

    .line 290
    .line 291
    invoke-virtual {v0, v10, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    const-class v23, Ll3;

    .line 296
    .line 297
    monitor-enter v23

    .line 298
    :try_start_7
    const-string v11, "install_id"

    .line 299
    .line 300
    const-string v12, ""

    .line 301
    .line 302
    invoke-interface {v10, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v13

    .line 306
    if-eqz v13, :cond_d

    .line 307
    .line 308
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    if-ge v11, v2, :cond_b

    .line 313
    .line 314
    goto :goto_9

    .line 315
    :cond_b
    const-string v2, "active_attempt_day"

    .line 316
    .line 317
    const-string v11, ""

    .line 318
    .line 319
    invoke-interface {v10, v2, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_c

    .line 328
    .line 329
    monitor-exit v23

    .line 330
    :goto_8
    move-object/from16 v12, v22

    .line 331
    .line 332
    goto :goto_a

    .line 333
    :catchall_7
    move-exception v0

    .line 334
    goto :goto_b

    .line 335
    :cond_c
    const-string v2, "first_seen_at"

    .line 336
    .line 337
    invoke-interface {v10, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 338
    .line 339
    .line 340
    move-result-wide v14

    .line 341
    const-string v2, "report_total"

    .line 342
    .line 343
    invoke-interface {v10, v2, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 344
    .line 345
    .line 346
    move-result-wide v11

    .line 347
    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 348
    .line 349
    .line 350
    move-result-wide v18

    .line 351
    invoke-interface {v10}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    const-string v6, "active_attempt_day"

    .line 356
    .line 357
    invoke-interface {v2, v6, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    const-string v6, "last_active_attempt_at"

    .line 362
    .line 363
    invoke-interface {v2, v6, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 368
    .line 369
    .line 370
    new-instance v12, Lj3;

    .line 371
    .line 372
    const/16 v21, 0x1

    .line 373
    .line 374
    move-wide/from16 v16, v3

    .line 375
    .line 376
    move-object/from16 v20, v8

    .line 377
    .line 378
    invoke-direct/range {v12 .. v21}, Lj3;-><init>(Ljava/lang/String;JJJLjava/lang/String;I)V

    .line 379
    .line 380
    .line 381
    monitor-exit v23

    .line 382
    goto :goto_a

    .line 383
    :cond_d
    :goto_9
    monitor-exit v23
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 384
    goto :goto_8

    .line 385
    :goto_a
    if-nez v12, :cond_e

    .line 386
    .line 387
    goto :goto_c

    .line 388
    :cond_e
    const-string v2, "active"

    .line 389
    .line 390
    invoke-static {v0, v1, v12, v9, v2}, Ll3;->b(Landroid/content/Context;Ljava/lang/String;Lj3;Lk3;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    const-string v2, "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/analytics/active"

    .line 395
    .line 396
    invoke-static {v2, v1}, Ll3;->f(Ljava/lang/String;Lorg/json/JSONObject;)Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    if-eqz v1, :cond_10

    .line 401
    .line 402
    :try_start_8
    const-string v1, "elaris_analytics"

    .line 403
    .line 404
    invoke-virtual {v0, v1, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    const-string v1, "active_success_day"

    .line 413
    .line 414
    iget-object v2, v12, Lj3;->e:Ljava/lang/String;

    .line 415
    .line 416
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    const-string v1, "last_active_success_at"

    .line 421
    .line 422
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 423
    .line 424
    .line 425
    move-result-wide v2

    .line 426
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 431
    .line 432
    .line 433
    goto :goto_c

    .line 434
    :goto_b
    :try_start_9
    monitor-exit v23
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 435
    throw v0

    .line 436
    :cond_f
    const-string v2, "launch"

    .line 437
    .line 438
    invoke-static {v0, v1, v11, v9, v2}, Ll3;->b(Landroid/content/Context;Ljava/lang/String;Lj3;Lk3;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    const-string v2, "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/analytics/launch"

    .line 443
    .line 444
    invoke-static {v2, v1}, Ll3;->f(Ljava/lang/String;Lorg/json/JSONObject;)Z

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    if-eqz v1, :cond_10

    .line 449
    .line 450
    :try_start_a
    const-string v1, "elaris_analytics"

    .line 451
    .line 452
    invoke-virtual {v0, v1, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    const-string v1, "reported_module_revision"

    .line 461
    .line 462
    invoke-interface {v0, v1, v10}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    const-string v1, "report_total"

    .line 467
    .line 468
    iget-wide v2, v11, Lj3;->d:J

    .line 469
    .line 470
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    const-string v1, "active_attempt_day"

    .line 475
    .line 476
    iget-object v2, v11, Lj3;->e:Ljava/lang/String;

    .line 477
    .line 478
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    const-string v1, "active_success_day"

    .line 483
    .line 484
    iget-object v2, v11, Lj3;->e:Ljava/lang/String;

    .line 485
    .line 486
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    const-string v1, "last_success_at"

    .line 491
    .line 492
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 493
    .line 494
    .line 495
    move-result-wide v2

    .line 496
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 501
    .line 502
    .line 503
    :catchall_8
    :cond_10
    :goto_c
    return-void

    .line 504
    :goto_d
    :try_start_b
    monitor-exit v21
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 505
    throw v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Lj3;Lk3;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 8

    .line 1
    const-string v0, "2.6.7"

    .line 2
    .line 3
    const-string v1, "com.tencent.mobileqq"

    .line 4
    .line 5
    const-string v2, "versionCode"

    .line 6
    .line 7
    const-string v3, "versionName"

    .line 8
    .line 9
    new-instance v4, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    .line 15
    .line 16
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    const/16 v0, 0x4c4

    .line 23
    .line 24
    invoke-virtual {v5, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    const-string v0, "revision"

    .line 28
    .line 29
    iget-object v6, p3, Lk3;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v5, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v0, "firstInstallAt"

    .line 35
    .line 36
    iget-wide v6, p3, Lk3;->b:J

    .line 37
    .line 38
    invoke-virtual {v5, v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v0, "lastUpdateAt"

    .line 42
    .line 43
    iget-wide v6, p3, Lk3;->c:J

    .line 44
    .line 45
    invoke-virtual {v5, v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v0, "sourceModifiedAt"

    .line 49
    .line 50
    iget-wide v6, p3, Lk3;->d:J

    .line 51
    .line 52
    invoke-virtual {v5, v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    new-instance p3, Lorg/json/JSONObject;

    .line 56
    .line 57
    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v0, "packageName"

    .line 61
    .line 62
    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    const-string v0, "processName"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 66
    .line 67
    const-string v6, ""

    .line 68
    .line 69
    if-nez p1, :cond_0

    .line 70
    .line 71
    move-object p1, v6

    .line 72
    :cond_0
    :try_start_1
    invoke-virtual {p3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 73
    .line 74
    .line 75
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const/4 p1, 0x0

    .line 80
    invoke-virtual {p0, v1, p1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iget-object p1, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 85
    .line 86
    if-nez p1, :cond_1

    .line 87
    .line 88
    move-object p1, v6

    .line 89
    :cond_1
    invoke-virtual {p3, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 93
    .line 94
    .line 95
    move-result-wide p0

    .line 96
    invoke-virtual {p3, v2, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catchall_0
    :try_start_3
    const-string p0, "unknown"

    .line 101
    .line 102
    invoke-virtual {p3, v3, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    const-wide/16 p0, 0x0

    .line 106
    .line 107
    invoke-virtual {p3, v2, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 108
    .line 109
    .line 110
    :catchall_1
    :goto_0
    :try_start_4
    new-instance p0, Lorg/json/JSONObject;

    .line 111
    .line 112
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string p1, "sdk"

    .line 116
    .line 117
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 118
    .line 119
    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    const-string p1, "release"

    .line 123
    .line 124
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 125
    .line 126
    if-nez v0, :cond_2

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    move-object v6, v0

    .line 130
    :goto_1
    invoke-virtual {p0, p1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    new-instance p1, Lorg/json/JSONObject;

    .line 134
    .line 135
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v0, "total"

    .line 139
    .line 140
    iget-wide v1, p2, Lj3;->d:J

    .line 141
    .line 142
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 143
    .line 144
    .line 145
    const-string v0, "day"

    .line 146
    .line 147
    iget-object v1, p2, Lj3;->e:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 150
    .line 151
    .line 152
    const-string v0, "dayCount"

    .line 153
    .line 154
    iget v1, p2, Lj3;->f:I

    .line 155
    .line 156
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 157
    .line 158
    .line 159
    const-string v0, "firstSeenAt"

    .line 160
    .line 161
    iget-wide v1, p2, Lj3;->b:J

    .line 162
    .line 163
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 164
    .line 165
    .line 166
    invoke-static {}, Ll3;->d()Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const-string v1, "schema"

    .line 171
    .line 172
    const/4 v2, 0x2

    .line 173
    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 174
    .line 175
    .line 176
    const-string v1, "event"

    .line 177
    .line 178
    invoke-virtual {v4, v1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    .line 180
    .line 181
    const-string p4, "installId"

    .line 182
    .line 183
    iget-object v1, p2, Lj3;->a:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v4, p4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    const-string p4, "reportedAt"

    .line 189
    .line 190
    iget-wide v1, p2, Lj3;->c:J

    .line 191
    .line 192
    invoke-virtual {v4, p4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 193
    .line 194
    .line 195
    const-string p2, "module"

    .line 196
    .line 197
    invoke-virtual {v4, p2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 198
    .line 199
    .line 200
    const-string p2, "qq"

    .line 201
    .line 202
    invoke-virtual {v4, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 203
    .line 204
    .line 205
    const-string p2, "android"

    .line 206
    .line 207
    invoke-virtual {v4, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 208
    .line 209
    .line 210
    const-string p0, "framework"

    .line 211
    .line 212
    invoke-virtual {v4, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 213
    .line 214
    .line 215
    const-string p0, "xposed"

    .line 216
    .line 217
    const-string p2, "name"

    .line 218
    .line 219
    const-string p3, "Unknown"

    .line 220
    .line 221
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    invoke-virtual {v4, p0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 226
    .line 227
    .line 228
    const-string p0, "launch"

    .line 229
    .line 230
    invoke-virtual {v4, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 231
    .line 232
    .line 233
    :catchall_2
    return-object v4
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, " "

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "lspatch"

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_7

    .line 34
    .line 35
    const-string p1, "org.lsposed.lspatch.loader.LSPApplication"

    .line 36
    .line 37
    invoke-static {p1}, Ll3;->e(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_7

    .line 42
    .line 43
    const-string p1, "org.lsposed.lspatch.loader.LSPModule"

    .line 44
    .line 45
    invoke-static {p1}, Ll3;->e(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_7

    .line 50
    .line 51
    const-string p1, "org.lsposed.lspatch.loader.LSPatchClassLoader"

    .line 52
    .line 53
    invoke-static {p1}, Ll3;->e(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_7

    .line 58
    .line 59
    const-string p1, "org.lsposed.lspatch.loader.LSPatchModuleLoader"

    .line 60
    .line 61
    invoke-static {p1}, Ll3;->e(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_0

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_0
    const-string p1, "npatch"

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_6

    .line 76
    .line 77
    const-string p1, "nitsuya"

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_6

    .line 84
    .line 85
    const-string p1, "io.github.nitsuya.npatch.NPatch"

    .line 86
    .line 87
    invoke-static {p1}, Ll3;->e(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_6

    .line 92
    .line 93
    const-string p1, "org.lsposed.npatch.loader.NPatchModuleLoader"

    .line 94
    .line 95
    invoke-static {p1}, Ll3;->e(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_1
    const-string p1, "fpa"

    .line 103
    .line 104
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-nez p1, :cond_5

    .line 109
    .line 110
    const-string p1, "fankes.fpa"

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-nez p1, :cond_5

    .line 117
    .line 118
    const-string p1, "com.fankes.fpa.core.FPA"

    .line 119
    .line 120
    invoke-static {p1}, Ll3;->e(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-nez p1, :cond_5

    .line 125
    .line 126
    const-string p1, "com.fankes.fpa.hook.FPAHook"

    .line 127
    .line 128
    invoke-static {p1}, Ll3;->e(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_2

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    const-string p1, "lsposed"

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-nez p1, :cond_4

    .line 142
    .line 143
    const-string p1, "lspd"

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_4

    .line 150
    .line 151
    const-string p0, "org.lsposed.lspd.core.Main"

    .line 152
    .line 153
    invoke-static {p0}, Ll3;->e(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-nez p0, :cond_4

    .line 158
    .line 159
    const-string p0, "org.lsposed.lspd.nativebridge.HookBridge"

    .line 160
    .line 161
    invoke-static {p0}, Ll3;->e(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-nez p0, :cond_4

    .line 166
    .line 167
    const-string p0, "org.lsposed.lspd.service.ILSPApplicationService"

    .line 168
    .line 169
    invoke-static {p0}, Ll3;->e(Ljava/lang/String;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-eqz p0, :cond_3

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_3
    const-string p0, "Unknown"

    .line 177
    .line 178
    return-object p0

    .line 179
    :cond_4
    :goto_0
    const-string p0, "LSPosed"

    .line 180
    .line 181
    return-object p0

    .line 182
    :cond_5
    :goto_1
    const-string p0, "FPA"

    .line 183
    .line 184
    return-object p0

    .line 185
    :cond_6
    :goto_2
    const-string p0, "NPatch"

    .line 186
    .line 187
    return-object p0

    .line 188
    :cond_7
    :goto_3
    const-string p0, "LSPatch"

    .line 189
    .line 190
    return-object p0
.end method

.method public static d()Lorg/json/JSONObject;
    .locals 8

    .line 1
    const-string v0, "api"

    .line 2
    .line 3
    const-string v1, "name"

    .line 4
    .line 5
    new-instance v2, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/xposedcompat/XposedBridge;->getFrameworkName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    const-string v4, ""

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    move-object v3, v4

    .line 19
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/mr/elaris/xposedcompat/XposedBridge;->getFrameworkVersion()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    if-nez v5, :cond_1

    .line 24
    .line 25
    move-object v5, v4

    .line 26
    :cond_1
    invoke-static {}, Lcom/mr/elaris/xposedcompat/XposedBridge;->getFrameworkClassName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    if-nez v6, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    move-object v4, v6

    .line 34
    :goto_0
    invoke-static {}, Lcom/mr/elaris/xposedcompat/XposedBridge;->getXposedVersion()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    invoke-static {v3, v4}, Ll3;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v2, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v6, "frameworkName"

    .line 49
    .line 50
    invoke-virtual {v2, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    const-string v3, "frameworkVersion"

    .line 54
    .line 55
    invoke-virtual {v2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    const-string v3, "source"

    .line 59
    .line 60
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :catchall_0
    :try_start_2
    const-string v3, "Unknown"

    .line 65
    .line 66
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    sget v1, Lcom/mr/elaris/xposedcompat/XposedBridge;->XPOSED_BRIDGE_VERSION:I

    .line 70
    .line 71
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 72
    .line 73
    .line 74
    :catchall_1
    return-object v2
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const-class v0, Ll3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    filled-new-array {v0, v1, v2}, [Ljava/lang/ClassLoader;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    move v2, v1

    .line 25
    :goto_0
    const/4 v3, 0x3

    .line 26
    if-ge v2, v3, :cond_1

    .line 27
    .line 28
    aget-object v3, v0, v2

    .line 29
    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :try_start_0
    invoke-static {p0, v1, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :catchall_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return v1
.end method

.method public static f(Ljava/lang/String;Lorg/json/JSONObject;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v2, Ljava/net/URL;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 23
    .line 24
    const/16 v1, 0x5dc

    .line 25
    .line 26
    :try_start_1
    invoke-virtual {p0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 30
    .line 31
    .line 32
    const-string v1, "POST"

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {p0, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 39
    .line 40
    .line 41
    const-string v2, "Content-Type"

    .line 42
    .line 43
    const-string v3, "application/json; charset=utf-8"

    .line 44
    .line 45
    invoke-virtual {p0, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v2, "Accept"

    .line 49
    .line 50
    const-string v3, "application/json"

    .line 51
    .line 52
    invoke-virtual {p0, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    array-length v2, p1

    .line 56
    invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 60
    .line 61
    .line 62
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    :try_start_2
    invoke-virtual {v2, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    .line 65
    .line 66
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 70
    .line 71
    .line 72
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 73
    const/16 v2, 0xc8

    .line 74
    .line 75
    if-lt p1, v2, :cond_0

    .line 76
    .line 77
    const/16 v2, 0x12c

    .line 78
    .line 79
    if-ge p1, v2, :cond_0

    .line 80
    .line 81
    move v0, v1

    .line 82
    :cond_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 83
    .line 84
    .line 85
    return v0

    .line 86
    :catchall_0
    move-object v1, p0

    .line 87
    goto :goto_0

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 90
    .line 91
    .line 92
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 93
    :catchall_2
    :goto_0
    if-eqz v1, :cond_1

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 96
    .line 97
    .line 98
    :cond_1
    return v0
.end method

.method public static g(J)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "UTC"

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/util/Date;

    .line 20
    .line 21
    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    return-object p0

    .line 29
    :catchall_0
    const-string p0, ""

    .line 30
    .line 31
    return-object p0
.end method
