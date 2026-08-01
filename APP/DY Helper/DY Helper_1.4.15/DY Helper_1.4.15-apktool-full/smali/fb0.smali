.class public final synthetic Lfb0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lfb0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly5;I)V
    .locals 0

    .line 1
    const/16 p1, 0x12

    .line 2
    .line 3
    iput p1, p0, Lfb0;->ε:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final α()V
    .locals 20

    .line 1
    sget-object v1, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const-string v2, "r86c859e3375e752"

    .line 4
    .line 5
    sget-object v3, Lpg1;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    :try_start_0
    const-string v0, "spark_auto_renew_delay_seconds"
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    const/16 v5, 0xf

    .line 11
    .line 12
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    invoke-interface {v6, v0, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :catchall_0
    const/4 v0, 0x5

    .line 21
    const/16 v6, 0x12c

    .line 22
    .line 23
    :try_start_2
    invoke-static {v5, v0, v6}, Lj81;->μ(III)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-long v5, v0

    .line 28
    const-wide/16 v7, 0x3e8

    .line 29
    .line 30
    mul-long/2addr v5, v7

    .line 31
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lpg1;->ε()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_11

    .line 39
    .line 40
    invoke-static {}, Lx9;->η()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :cond_0
    new-instance v0, Lkt0;

    .line 49
    .line 50
    const/16 v5, 0x11

    .line 51
    .line 52
    invoke-direct {v0, v5}, Lkt0;-><init>(I)V

    .line 53
    .line 54
    .line 55
    const/16 v5, 0x3c

    .line 56
    .line 57
    invoke-static {v5, v0}, Lpg1;->π(ILp70;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/4 v5, 0x4

    .line 62
    const/4 v6, 0x0

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    const-string v0, "\u6bcf\u65e5\u706b\u661f\u4efb\u52a1\u7b49\u5f85\u4f1a\u8bdd\u8d85\u65f6\uff0c\u4fdd\u7559\u91cd\u8bd5\u673a\u4f1a"

    .line 66
    .line 67
    invoke-static {v2, v0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catchall_1
    move-exception v0

    .line 75
    goto/16 :goto_7

    .line 76
    .line 77
    :cond_1
    :try_start_3
    const-string v0, "pet_elf_auto_mutual_message_enabled"

    .line 78
    .line 79
    const/4 v9, 0x1

    .line 80
    invoke-static {v0, v9}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    const-string v0, "pet_elf_auto_image_enabled"

    .line 85
    .line 86
    invoke-static {v0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v13

    .line 90
    sget-object v0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 91
    .line 92
    invoke-static {v0}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ljava/lang/Iterable;

    .line 101
    .line 102
    instance-of v10, v0, Ljava/util/Collection;

    .line 103
    .line 104
    if-eqz v10, :cond_2

    .line 105
    .line 106
    move-object v10, v0

    .line 107
    check-cast v10, Ljava/util/Collection;

    .line 108
    .line 109
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eqz v10, :cond_2

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    if-eqz v10, :cond_7

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    check-cast v10, Lky1;

    .line 131
    .line 132
    iget v11, v10, Lky1;->δ:I

    .line 133
    .line 134
    if-ne v11, v9, :cond_3

    .line 135
    .line 136
    sget-object v11, Lry1;->α:Lry1;

    .line 137
    .line 138
    invoke-static {v10, v12, v13, v6}, Lry1;->Ω(Lky1;ZZLmy1;)Liy1;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    iget-boolean v10, v10, Liy1;->β:Z

    .line 143
    .line 144
    if-eqz v10, :cond_3

    .line 145
    .line 146
    move v0, v4

    .line 147
    :goto_0
    const/16 v10, 0x1e

    .line 148
    .line 149
    if-ge v0, v10, :cond_6

    .line 150
    .line 151
    sget-object v10, Lry1;->α:Lry1;

    .line 152
    .line 153
    invoke-static {}, Lry1;->х()Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-eqz v10, :cond_4

    .line 158
    .line 159
    move v0, v9

    .line 160
    goto :goto_1

    .line 161
    :cond_4
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    .line 162
    .line 163
    .line 164
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    invoke-virtual {v10}, Ljava/lang/Thread;->isInterrupted()Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    if-nez v10, :cond_5

    .line 173
    .line 174
    add-int/lit8 v0, v0, 0x1

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_5
    new-instance v0, Ljava/lang/InterruptedException;

    .line 178
    .line 179
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    .line 180
    .line 181
    .line 182
    throw v0

    .line 183
    :cond_6
    sget-object v0, Lry1;->α:Lry1;

    .line 184
    .line 185
    invoke-static {}, Lry1;->х()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    :goto_1
    if-nez v0, :cond_7

    .line 190
    .line 191
    const-string v0, "\u6bcf\u65e5\u706b\u661f\u4efb\u52a1\u7b49\u5f85\u6587\u672c\u53d1\u9001\u6838\u5fc3\u8d85\u65f6\uff0c\u4fdd\u7559\u91cd\u8bd5\u673a\u4f1a"

    .line 192
    .line 193
    invoke-static {v2, v0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_7
    :goto_2
    :try_start_4
    sget-object v0, Lpg1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 207
    .line 208
    if-eqz v0, :cond_10

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Landroid/app/Activity;

    .line 215
    .line 216
    if-eqz v0, :cond_10

    .line 217
    .line 218
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-nez v7, :cond_8

    .line 223
    .line 224
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-eqz v7, :cond_9

    .line 229
    .line 230
    :cond_8
    move-object v0, v6

    .line 231
    :cond_9
    if-eqz v0, :cond_10

    .line 232
    .line 233
    new-instance v7, Lkt0;

    .line 234
    .line 235
    const/16 v8, 0x12

    .line 236
    .line 237
    invoke-direct {v7, v8}, Lkt0;-><init>(I)V

    .line 238
    .line 239
    .line 240
    const/16 v8, 0x5a

    .line 241
    .line 242
    invoke-static {v8, v7}, Lpg1;->π(ILp70;)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    if-nez v7, :cond_a

    .line 247
    .line 248
    const-string v0, "\u6bcf\u65e5\u706b\u661f\u4efb\u52a1\u7b49\u5f85\u542f\u52a8\u9886\u53d6\u5b8c\u6210\u8d85\u65f6\uff0c\u4fdd\u7559\u91cd\u8bd5\u673a\u4f1a"

    .line 249
    .line 250
    invoke-static {v2, v0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :cond_a
    :try_start_5
    invoke-virtual {v1, v4, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 258
    .line 259
    .line 260
    move-result v7
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 261
    if-nez v7, :cond_b

    .line 262
    .line 263
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_b
    :try_start_6
    const-string v7, "pet_elf_task_image_uri"

    .line 268
    .line 269
    const-string v8, ""

    .line 270
    .line 271
    invoke-static {v7, v8}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    if-nez v8, :cond_c

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_c
    move-object v7, v6

    .line 283
    :goto_3
    if-eqz v7, :cond_d

    .line 284
    .line 285
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 286
    .line 287
    .line 288
    move-result-object v7
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 289
    move-object/from16 v16, v7

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_d
    move-object/from16 v16, v6

    .line 293
    .line 294
    :goto_4
    :try_start_7
    new-instance v10, Llg1;

    .line 295
    .line 296
    sget-object v11, Lkg1;->η:Lkg1;

    .line 297
    .line 298
    const/16 v18, 0x0

    .line 299
    .line 300
    const/16 v19, 0xd0

    .line 301
    .line 302
    const/4 v14, 0x1

    .line 303
    const/4 v15, 0x0

    .line 304
    const/16 v17, 0x0

    .line 305
    .line 306
    invoke-direct/range {v10 .. v19}, Llg1;-><init>(Lkg1;ZZZZLandroid/net/Uri;Lky1;Lmy1;I)V

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v10}, Lpg1;->γ(Landroid/app/Activity;Llg1;)Lmg1;

    .line 310
    .line 311
    .line 312
    move-result-object v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 313
    :try_start_8
    iget v8, v7, Lmg1;->η:I

    .line 314
    .line 315
    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 316
    .line 317
    .line 318
    iget v1, v7, Lmg1;->δ:I

    .line 319
    .line 320
    iget-object v9, v7, Lmg1;->θ:Ljava/lang/String;

    .line 321
    .line 322
    invoke-static {v0, v9, v1}, Lpg1;->λ(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 323
    .line 324
    .line 325
    iget v0, v7, Lmg1;->α:I

    .line 326
    .line 327
    if-lez v0, :cond_e

    .line 328
    .line 329
    if-nez v8, :cond_e

    .line 330
    .line 331
    const-string v0, "pet_elf_auto_last_run_date"

    .line 332
    .line 333
    invoke-static {}, Lpg1;->ξ()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-static {v0, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-static {}, Lpg1;->ξ()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    new-instance v1, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    const-string v7, "\u5df2\u8bb0\u5f55\u6bcf\u65e5\u706b\u661f\u4efb\u52a1\u65e5\u671f="

    .line 350
    .line 351
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-static {v2, v0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_e
    if-lez v0, :cond_f

    .line 366
    .line 367
    new-instance v0, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 370
    .line 371
    .line 372
    const-string v1, "\u6bcf\u65e5\u706b\u661f\u4efb\u52a1\u5b58\u5728\u53ef\u91cd\u8bd5\u5931\u8d25 count="

    .line 373
    .line 374
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    const-string v1, "\uff0c\u4fdd\u7559\u540e\u7eed Activity \u6062\u590d\u91cd\u8bd5\u673a\u4f1a"

    .line 381
    .line 382
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v2, v0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 390
    .line 391
    .line 392
    :cond_f
    :goto_5
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 393
    .line 394
    .line 395
    return-void

    .line 396
    :catchall_2
    move-exception v0

    .line 397
    :try_start_9
    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 398
    .line 399
    .line 400
    throw v0
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 401
    :cond_10
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :cond_11
    :goto_6
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :goto_7
    :try_start_a
    const-string v1, "\u6bcf\u65e5\u706b\u661f\u4efb\u52a1\u8c03\u5ea6\u5f02\u5e38"

    .line 410
    .line 411
    invoke-static {v2, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 412
    .line 413
    .line 414
    :goto_8
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 415
    .line 416
    .line 417
    goto :goto_9

    .line 418
    :catchall_3
    move-exception v0

    .line 419
    goto :goto_a

    .line 420
    :catch_0
    :try_start_b
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 425
    .line 426
    .line 427
    goto :goto_8

    .line 428
    :goto_9
    return-void

    .line 429
    :goto_a
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 430
    .line 431
    .line 432
    throw v0
.end method

.method private final β()V
    .locals 20

    .line 1
    sget-object v1, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const-string v2, "r86c859e3375e752"

    .line 4
    .line 5
    sget-object v3, Lpg1;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const-string v0, "\u672c\u6b21\u6296\u97f3\u8fdb\u7a0b\u542f\u52a8\u9886\u53d6\u68c0\u67e5\u5b8c\u6210: \u4f1a\u8bdd="

    .line 8
    .line 9
    const-wide/16 v4, 0x1388

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lpg1;->ζ()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_a

    .line 20
    .line 21
    invoke-static {}, Lx9;->η()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    new-instance v4, Lkt0;

    .line 30
    .line 31
    const/16 v5, 0x13

    .line 32
    .line 33
    invoke-direct {v4, v5}, Lkt0;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const/16 v5, 0x3c

    .line 37
    .line 38
    invoke-static {v5, v4}, Lpg1;->π(ILp70;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v5, 0x4

    .line 43
    const/4 v7, 0x0

    .line 44
    if-nez v4, :cond_1

    .line 45
    .line 46
    const-string v0, "\u542f\u52a8\u706b\u661f\u9886\u53d6\u7b49\u5f85\u4f1a\u8bdd\u8d85\u65f6\uff0c\u4fdd\u7559\u672c\u8fdb\u7a0b\u91cd\u8bd5\u673a\u4f1a"

    .line 47
    .line 48
    invoke-static {v2, v0, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_1
    :try_start_1
    sget-object v4, Lpg1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 65
    .line 66
    if-eqz v4, :cond_9

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Landroid/app/Activity;

    .line 73
    .line 74
    if-eqz v4, :cond_9

    .line 75
    .line 76
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-nez v8, :cond_2

    .line 81
    .line 82
    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_3

    .line 87
    .line 88
    :cond_2
    move-object v4, v7

    .line 89
    :cond_3
    if-eqz v4, :cond_9

    .line 90
    .line 91
    new-instance v8, Lkt0;

    .line 92
    .line 93
    const/16 v9, 0x14

    .line 94
    .line 95
    invoke-direct {v8, v9}, Lkt0;-><init>(I)V

    .line 96
    .line 97
    .line 98
    const/16 v9, 0x5a

    .line 99
    .line 100
    invoke-static {v9, v8}, Lpg1;->π(ILp70;)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-nez v8, :cond_4

    .line 105
    .line 106
    const-string v0, "\u542f\u52a8\u706b\u661f\u9886\u53d6\u7b49\u5f85\u6267\u884c\u9501\u8d85\u65f6\uff0c\u4fdd\u7559\u672c\u8fdb\u7a0b\u91cd\u8bd5\u673a\u4f1a"

    .line 107
    .line 108
    invoke-static {v2, v0, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_4
    const/4 v8, 0x1

    .line 116
    :try_start_2
    invoke-virtual {v1, v6, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 117
    .line 118
    .line 119
    move-result v9
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    if-nez v9, :cond_5

    .line 121
    .line 122
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    :try_start_3
    new-instance v10, Llg1;

    .line 127
    .line 128
    sget-object v11, Lkg1;->ε:Lkg1;

    .line 129
    .line 130
    const-string v9, "pet_elf_launch_claim_notice_date"

    .line 131
    .line 132
    const-string v12, "spark_show_top_notification"

    .line 133
    .line 134
    invoke-static {v12, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-nez v12, :cond_6

    .line 139
    .line 140
    :goto_0
    move v15, v6

    .line 141
    goto :goto_1

    .line 142
    :cond_6
    invoke-static {}, Lpg1;->ξ()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v12

    .line 146
    const-string v13, ""

    .line 147
    .line 148
    invoke-static {v9, v13}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    invoke-virtual {v13, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-eqz v13, :cond_7

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_7
    invoke-static {v9, v12}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    move v15, v8

    .line 163
    :goto_1
    const/16 v18, 0x0

    .line 164
    .line 165
    const/16 v19, 0xe0

    .line 166
    .line 167
    const/4 v12, 0x0

    .line 168
    const/4 v13, 0x0

    .line 169
    const/4 v14, 0x1

    .line 170
    const/16 v16, 0x0

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    invoke-direct/range {v10 .. v19}, Llg1;-><init>(Lkg1;ZZZZLandroid/net/Uri;Lky1;Lmy1;I)V

    .line 175
    .line 176
    .line 177
    invoke-static {v4, v10}, Lpg1;->γ(Landroid/app/Activity;Llg1;)Lmg1;

    .line 178
    .line 179
    .line 180
    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 181
    :try_start_4
    iget v10, v9, Lmg1;->α:I

    .line 182
    .line 183
    iget v11, v9, Lmg1;->δ:I

    .line 184
    .line 185
    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 186
    .line 187
    .line 188
    iget-object v1, v9, Lmg1;->θ:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v4, v1, v11}, Lpg1;->λ(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 191
    .line 192
    .line 193
    if-lez v10, :cond_8

    .line 194
    .line 195
    sget-object v1, Lpg1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 196
    .line 197
    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 198
    .line 199
    .line 200
    iget v1, v9, Lmg1;->ζ:I

    .line 201
    .line 202
    new-instance v4, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v0, " \u9886\u53d6="

    .line 211
    .line 212
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v0, " \u5931\u8d25="

    .line 219
    .line 220
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v2, v0, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 231
    .line 232
    .line 233
    :cond_8
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :catchall_1
    move-exception v0

    .line 238
    :try_start_5
    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 239
    .line 240
    .line 241
    throw v0
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 242
    :cond_9
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_a
    :goto_2
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :goto_3
    :try_start_6
    const-string v1, "\u542f\u52a8\u706b\u661f\u9886\u53d6\u8c03\u5ea6\u5f02\u5e38"

    .line 251
    .line 252
    invoke-static {v2, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 253
    .line 254
    .line 255
    :goto_4
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :catchall_2
    move-exception v0

    .line 260
    goto :goto_6

    .line 261
    :catch_0
    :try_start_7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :goto_5
    return-void

    .line 270
    :goto_6
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 271
    .line 272
    .line 273
    throw v0
.end method

.method private final γ()V
    .locals 5

    .line 1
    sget-object p0, Lcn1;->δ:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Iterable;

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v4, Ll91;

    .line 49
    .line 50
    invoke-direct {v4, v3, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto :goto_3

    .line 59
    :cond_0
    monitor-exit p0

    .line 60
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Ll91;

    .line 75
    .line 76
    iget-object v1, v0, Ll91;->ε:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v0, v0, Ll91;->ζ:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lbn1;

    .line 81
    .line 82
    :try_start_1
    iget-object v2, v0, Lbn1;->α:Lee0;

    .line 83
    .line 84
    iget-object v2, v2, Lee0;->α:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    new-instance v3, Ljava/util/ArrayList;

    .line 87
    .line 88
    iget-object v0, v0, Lbn1;->β:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 91
    .line 92
    .line 93
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    goto :goto_2

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    new-instance v1, Leo1;

    .line 104
    .line 105
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    move-object v0, v1

    .line 109
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_1

    .line 114
    .line 115
    const-string v1, "reae2c2e0c445b34d"

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const-string v2, "relation refresh failed: "

    .line 122
    .line 123
    invoke-static {v2, v0, v1}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    return-void

    .line 128
    :goto_3
    monitor-exit p0

    .line 129
    throw v0
.end method

.method private final δ()V
    .locals 0

    .line 1
    return-void
.end method

.method private final ε()V
    .locals 3

    .line 1
    sget-object p0, Lry1;->α:Lry1;

    .line 2
    .line 3
    sget-object p0, Lry1;->е:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    invoke-static {}, Lry1;->ａ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    :try_start_1
    const-string v2, "\u81ea\u52a8\u7eed\u706b\u68c0\u67e5\u5f02\u5e38"

    .line 15
    .line 16
    invoke-static {v2, v1}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_1
    move-exception v1

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 25
    .line 26
    .line 27
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lfb0;->ε:I

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/16 v3, 0x5a

    .line 8
    .line 9
    const/16 v4, 0x3c

    .line 10
    .line 11
    const-wide/16 v5, 0x2ee0

    .line 12
    .line 13
    const/4 v7, 0x2

    .line 14
    const/16 v8, 0xa

    .line 15
    .line 16
    const/4 v9, 0x4

    .line 17
    const/4 v10, 0x1

    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x0

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    sget-object v0, Ll82;->α:Ll82;

    .line 24
    .line 25
    sget-wide v0, Ll82;->ι:J

    .line 26
    .line 27
    sget-object v2, Ll82;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-static {}, Ll82;->ε()Ljava/lang/Float;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/high16 v2, 0x3f800000    # 1.0f

    .line 48
    .line 49
    cmpl-float v1, v1, v2

    .line 50
    .line 51
    if-lez v1, :cond_0

    .line 52
    .line 53
    move-object v11, v0

    .line 54
    :cond_0
    if-eqz v11, :cond_1

    .line 55
    .line 56
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v0}, Ll82;->α(F)Z

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void

    .line 64
    :pswitch_0
    invoke-static {v12}, Lu72;->α(Z)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_1
    sget-object v0, Lo22;->α:Lo22;

    .line 69
    .line 70
    invoke-static {}, Lo22;->Δ()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_2
    invoke-direct {v0}, Lfb0;->ε()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_3
    sget-object v0, Lbv1;->β:Landroid/app/AlertDialog;

    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 83
    .line 84
    .line 85
    :cond_2
    :pswitch_4
    return-void

    .line 86
    :pswitch_5
    invoke-direct {v0}, Lfb0;->γ()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_6
    invoke-direct {v0}, Lfb0;->β()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_7
    invoke-direct {v0}, Lfb0;->α()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_8
    sget-object v1, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 99
    .line 100
    const-string v7, "rb4e434d444870f0e"

    .line 101
    .line 102
    sget-object v8, Lse1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 103
    .line 104
    const-string v0, "\u672c\u6b21\u6296\u97f3\u8fdb\u7a0b\u4eb2\u5bc6\u5ea6\u9886\u53d6\u68c0\u67e5\u5b8c\u6210: \u4f1a\u8bdd="

    .line 105
    .line 106
    :try_start_0
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    .line 107
    .line 108
    .line 109
    sget-object v5, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 110
    .line 111
    invoke-static {}, Lse1;->γ()Z

    .line 112
    .line 113
    .line 114
    move-result v5
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    if-nez v5, :cond_4

    .line 116
    .line 117
    :cond_3
    :goto_0
    invoke-virtual {v8, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_5

    .line 121
    .line 122
    :cond_4
    :try_start_1
    new-instance v5, Lkt0;

    .line 123
    .line 124
    const/16 v6, 0xc

    .line 125
    .line 126
    invoke-direct {v5, v6}, Lkt0;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-static {v4, v5}, Lse1;->η(ILp70;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-nez v4, :cond_5

    .line 134
    .line 135
    const-string v0, "\u542f\u52a8\u4eb2\u5bc6\u5ea6\u9886\u53d6\u7b49\u5f85\u4f1a\u8bdd\u8d85\u65f6\uff0c\u4fdd\u7559\u672c\u8fdb\u7a0b\u91cd\u8bd5\u673a\u4f1a"

    .line 136
    .line 137
    invoke-static {v7, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :catchall_0
    move-exception v0

    .line 142
    goto/16 :goto_4

    .line 143
    .line 144
    :cond_5
    sget-object v4, Lse1;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 151
    .line 152
    if-eqz v4, :cond_3

    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, Landroid/app/Activity;

    .line 159
    .line 160
    if-eqz v4, :cond_3

    .line 161
    .line 162
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-nez v5, :cond_6

    .line 167
    .line 168
    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_7

    .line 173
    .line 174
    :cond_6
    move-object v4, v11

    .line 175
    :cond_7
    if-eqz v4, :cond_3

    .line 176
    .line 177
    new-instance v5, Lkt0;

    .line 178
    .line 179
    const/16 v6, 0xd

    .line 180
    .line 181
    invoke-direct {v5, v6}, Lkt0;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-static {v3, v5}, Lse1;->η(ILp70;)Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-nez v3, :cond_8

    .line 189
    .line 190
    const-string v0, "\u542f\u52a8\u4eb2\u5bc6\u5ea6\u9886\u53d6\u7b49\u5f85\u6267\u884c\u9501\u8d85\u65f6\uff0c\u4fdd\u7559\u672c\u8fdb\u7a0b\u91cd\u8bd5\u673a\u4f1a"

    .line 191
    .line 192
    invoke-static {v7, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_8
    invoke-static {}, Lse1;->α()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-lez v5, :cond_9

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_9
    move-object v3, v11

    .line 208
    :goto_1
    if-nez v3, :cond_a

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_a
    invoke-virtual {v1, v12, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-nez v5, :cond_b

    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_b
    sget-object v5, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    if-eqz v5, :cond_c

    .line 225
    .line 226
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    if-eqz v5, :cond_c

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_c
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 242
    .line 243
    .line 244
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 245
    :goto_2
    :try_start_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-static {v5, v10, v3, v11}, Lse1;->β(Ljava/lang/ClassLoader;ZLjava/lang/String;Ljava/util/List;)Lqe1;

    .line 249
    .line 250
    .line 251
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 252
    :try_start_3
    iget v6, v5, Lqe1;->δ:I

    .line 253
    .line 254
    iget v13, v5, Lqe1;->α:I

    .line 255
    .line 256
    iget v14, v5, Lqe1;->β:I

    .line 257
    .line 258
    invoke-virtual {v1, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 259
    .line 260
    .line 261
    iget-object v1, v5, Lqe1;->ζ:Ljava/lang/String;

    .line 262
    .line 263
    if-lt v14, v10, :cond_e

    .line 264
    .line 265
    const-string v15, "pet_elf_auto_success_toast_enabled"

    .line 266
    .line 267
    invoke-static {v15, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    if-nez v10, :cond_d

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_d
    new-instance v10, Lxx0;

    .line 275
    .line 276
    invoke-direct {v10, v4, v1, v2}, Lxx0;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4, v10}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 280
    .line 281
    .line 282
    :cond_e
    :goto_3
    invoke-static {}, Lse1;->α()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    if-eqz v1, :cond_3

    .line 291
    .line 292
    add-int v1, v13, v6

    .line 293
    .line 294
    if-lez v1, :cond_3

    .line 295
    .line 296
    sget-object v1, Lse1;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 297
    .line 298
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    iget v1, v5, Lqe1;->γ:I

    .line 302
    .line 303
    iget v2, v5, Lqe1;->ε:I

    .line 304
    .line 305
    new-instance v3, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v0, " \u9886\u53d6="

    .line 314
    .line 315
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    const-string v0, " \u5e42\u7b49="

    .line 322
    .line 323
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    const-string v0, " \u8df3\u8fc7="

    .line 330
    .line 331
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    const-string v0, " \u5931\u8d25="

    .line 338
    .line 339
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v7, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :catchall_1
    move-exception v0

    .line 355
    invoke-virtual {v1, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 356
    .line 357
    .line 358
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 359
    :goto_4
    :try_start_4
    const-string v1, "\u542f\u52a8\u4eb2\u5bc6\u5ea6\u9886\u53d6\u8c03\u5ea6\u5f02\u5e38"

    .line 360
    .line 361
    invoke-static {v7, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 362
    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :catchall_2
    move-exception v0

    .line 367
    goto :goto_6

    .line 368
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 373
    .line 374
    .line 375
    goto/16 :goto_0

    .line 376
    .line 377
    :goto_5
    return-void

    .line 378
    :goto_6
    invoke-virtual {v8, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 379
    .line 380
    .line 381
    throw v0

    .line 382
    :pswitch_9
    const-string v0, "\u81ea\u52a8\u8425\u5730\u7b49\u5f85\u79c1\u4fe1\u4f1a\u8bdd\u76ee\u5f55\u5c31\u7eea retry="

    .line 383
    .line 384
    sget-object v1, Ldd1;->γ:Ljava/lang/Object;

    .line 385
    .line 386
    monitor-enter v1

    .line 387
    :try_start_5
    sput-object v11, Ldd1;->η:Ljava/util/concurrent/ScheduledFuture;

    .line 388
    .line 389
    const-wide/16 v3, 0x0

    .line 390
    .line 391
    sput-wide v3, Ldd1;->θ:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 392
    .line 393
    monitor-exit v1

    .line 394
    invoke-static {}, Ldd1;->γ()Z

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    if-nez v1, :cond_f

    .line 399
    .line 400
    goto/16 :goto_10

    .line 401
    .line 402
    :cond_f
    const-wide/16 v3, 0xbb8

    .line 403
    .line 404
    :try_start_6
    invoke-static {}, Ldd1;->β()Landroid/app/Activity;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    sget-object v5, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 409
    .line 410
    invoke-static {}, Ljc1;->κ()Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 415
    .line 416
    .line 417
    move-result v5

    .line 418
    if-eqz v5, :cond_12

    .line 419
    .line 420
    sget-object v1, Ldd1;->δ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 421
    .line 422
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 423
    .line 424
    .line 425
    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 426
    const/16 v2, 0x14

    .line 427
    .line 428
    if-gt v1, v2, :cond_10

    .line 429
    .line 430
    move v2, v10

    .line 431
    goto :goto_7

    .line 432
    :cond_10
    move v2, v12

    .line 433
    :goto_7
    if-eqz v2, :cond_11

    .line 434
    .line 435
    :try_start_7
    const-string v5, "r8b18805b9e3774c8"

    .line 436
    .line 437
    new-instance v6, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    const-string v0, "/20"

    .line 446
    .line 447
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-static {v5, v0, v11, v9, v11}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    goto :goto_8

    .line 458
    :catchall_3
    move-exception v0

    .line 459
    goto/16 :goto_d

    .line 460
    .line 461
    :cond_11
    const-string v0, "r8b18805b9e3774c8"

    .line 462
    .line 463
    const-string v1, "\u81ea\u52a8\u8425\u5730\u7b49\u5f85\u4f1a\u8bdd\u8d85\u65f6\uff0c\u7b49\u5f85\u65b0\u4f1a\u8bdd\u4e8b\u4ef6\u5524\u9192"

    .line 464
    .line 465
    invoke-static {v0, v1, v11, v9, v11}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 466
    .line 467
    .line 468
    :goto_8
    move v10, v2

    .line 469
    goto/16 :goto_b

    .line 470
    .line 471
    :catchall_4
    move-exception v0

    .line 472
    move v2, v12

    .line 473
    goto/16 :goto_d

    .line 474
    .line 475
    :cond_12
    :try_start_8
    sget-object v0, Ljc1;->γ:La;

    .line 476
    .line 477
    iget-object v0, v0, La;->β:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v0, Lｚ;

    .line 480
    .line 481
    iget-boolean v0, v0, Lｚ;->β:Z

    .line 482
    .line 483
    if-nez v0, :cond_17

    .line 484
    .line 485
    sget-object v0, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 486
    .line 487
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-eqz v0, :cond_13

    .line 492
    .line 493
    goto :goto_a

    .line 494
    :cond_13
    sget-object v0, Ldd1;->δ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 495
    .line 496
    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 497
    .line 498
    .line 499
    invoke-static {v1}, Ldd1;->ζ(Landroid/app/Activity;)Ljava/lang/ClassLoader;

    .line 500
    .line 501
    .line 502
    move-result-object v13

    .line 503
    invoke-static {}, Ljc1;->β()Lcc1;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    iget-object v5, v0, Lcc1;->α:Ljava/util/LinkedHashSet;

    .line 508
    .line 509
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    if-eqz v5, :cond_14

    .line 514
    .line 515
    const-string v0, "r8b18805b9e3774c8"

    .line 516
    .line 517
    const-string v1, "\u81ea\u52a8\u8425\u5730\u6ca1\u6709\u5230\u671f\u4f1a\u8bdd\u6216\u53ef\u7acb\u5373\u6267\u884c\u7684\u7f13\u5b58\u5730\u5757"

    .line 518
    .line 519
    invoke-static {v0, v1, v11, v9, v11}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    goto :goto_9

    .line 523
    :cond_14
    iget-object v5, v0, Lcc1;->α:Ljava/util/LinkedHashSet;

    .line 524
    .line 525
    invoke-static {v13, v12, v5, v11, v2}, Ljc1;->ξ(Ljava/lang/ClassLoader;ZLjava/util/LinkedHashSet;Lhu;I)Ldc1;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    iget-object v5, v0, Lcc1;->α:Ljava/util/LinkedHashSet;

    .line 530
    .line 531
    iget-object v6, v0, Lcc1;->β:Ljava/util/LinkedHashMap;

    .line 532
    .line 533
    iget-object v0, v0, Lcc1;->γ:Ljava/util/LinkedHashMap;

    .line 534
    .line 535
    const/16 v19, 0x0

    .line 536
    .line 537
    const/16 v20, 0x40

    .line 538
    .line 539
    const/4 v14, 0x0

    .line 540
    const/4 v15, 0x1

    .line 541
    move-object/from16 v18, v0

    .line 542
    .line 543
    move-object/from16 v16, v5

    .line 544
    .line 545
    move-object/from16 v17, v6

    .line 546
    .line 547
    invoke-static/range {v13 .. v20}, Ljc1;->ε(Ljava/lang/ClassLoader;Lod;ZLjava/util/LinkedHashSet;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lac1;I)Ldc1;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    iget-boolean v5, v0, Ldc1;->ι:Z

    .line 552
    .line 553
    if-eqz v5, :cond_15

    .line 554
    .line 555
    goto :goto_b

    .line 556
    :cond_15
    iget-boolean v5, v0, Ldc1;->θ:Z

    .line 557
    .line 558
    if-nez v5, :cond_16

    .line 559
    .line 560
    invoke-static {v1, v2, v0}, Ldd1;->ι(Landroid/app/Activity;Ldc1;Ldc1;)V

    .line 561
    .line 562
    .line 563
    invoke-static {v1}, Lpg1;->κ(Landroid/app/Activity;)V

    .line 564
    .line 565
    .line 566
    :cond_16
    :goto_9
    move v10, v12

    .line 567
    goto :goto_b

    .line 568
    :cond_17
    :goto_a
    sget-object v0, Ldd1;->δ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 569
    .line 570
    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 571
    .line 572
    .line 573
    :try_start_9
    const-string v0, "r8b18805b9e3774c8"

    .line 574
    .line 575
    const-string v1, "\u81ea\u52a8\u8425\u5730\u68c0\u6d4b\u5230\u5df2\u6709\u5199\u6279\u6b21\uff0c\u7a0d\u540e\u91cd\u8bd5"

    .line 576
    .line 577
    invoke-static {v0, v1, v11, v9, v11}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 578
    .line 579
    .line 580
    :goto_b
    invoke-static {}, Ldd1;->γ()Z

    .line 581
    .line 582
    .line 583
    move-result v0

    .line 584
    if-eqz v0, :cond_1d

    .line 585
    .line 586
    if-eqz v10, :cond_18

    .line 587
    .line 588
    :goto_c
    invoke-static {v3, v4}, Ldd1;->η(J)V

    .line 589
    .line 590
    .line 591
    goto :goto_10

    .line 592
    :cond_18
    invoke-static {}, Ldd1;->θ()V

    .line 593
    .line 594
    .line 595
    goto :goto_10

    .line 596
    :catchall_5
    move-exception v0

    .line 597
    move v2, v10

    .line 598
    :goto_d
    :try_start_a
    invoke-static {}, Ldd1;->β()Landroid/app/Activity;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    invoke-static {}, Lui1;->Α()Z

    .line 603
    .line 604
    .line 605
    move-result v5

    .line 606
    if-eqz v5, :cond_19

    .line 607
    .line 608
    const-string v5, "pet_elf_camp_show_top_notification"

    .line 609
    .line 610
    invoke-static {v5, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 611
    .line 612
    .line 613
    move-result v5

    .line 614
    if-eqz v5, :cond_19

    .line 615
    .line 616
    goto :goto_e

    .line 617
    :cond_19
    move v10, v12

    .line 618
    :goto_e
    if-eqz v10, :cond_1c

    .line 619
    .line 620
    if-nez v1, :cond_1a

    .line 621
    .line 622
    goto :goto_f

    .line 623
    :cond_1a
    sget-object v5, Lbe1;->ι:Lbe1;

    .line 624
    .line 625
    invoke-static {v5}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 626
    .line 627
    .line 628
    move-result-object v5

    .line 629
    invoke-static {v5}, Lxn0;->ι(Ljava/util/List;)Ljava/util/Set;

    .line 630
    .line 631
    .line 632
    move-result-object v5

    .line 633
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 634
    .line 635
    .line 636
    move-result v5

    .line 637
    if-eqz v5, :cond_1b

    .line 638
    .line 639
    goto :goto_f

    .line 640
    :cond_1b
    sget-object v5, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 641
    .line 642
    const-string v5, "camp:auto"

    .line 643
    .line 644
    const-string v6, "\u8425\u5730\u540e\u53f0\u4efb\u52a1\u5931\u8d25"

    .line 645
    .line 646
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    move-result-object v7

    .line 650
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    const-string v8, "\uff0c\u5c06\u6309\u8ba1\u5212\u91cd\u8bd5"

    .line 655
    .line 656
    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v7

    .line 660
    invoke-static {v1, v5, v6, v7}, Lcom/example/dyhelper/ui/а;->γ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    :cond_1c
    :goto_f
    const-string v1, "r8b18805b9e3774c8"

    .line 664
    .line 665
    const-string v5, "\u81ea\u52a8\u8425\u5730\u6279\u6b21\u5f02\u5e38"

    .line 666
    .line 667
    invoke-static {v1, v5, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 668
    .line 669
    .line 670
    invoke-static {}, Ldd1;->γ()Z

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    if-eqz v0, :cond_1d

    .line 675
    .line 676
    if-eqz v2, :cond_18

    .line 677
    .line 678
    goto :goto_c

    .line 679
    :cond_1d
    :goto_10
    return-void

    .line 680
    :catchall_6
    move-exception v0

    .line 681
    invoke-static {}, Ldd1;->γ()Z

    .line 682
    .line 683
    .line 684
    move-result v1

    .line 685
    if-eqz v1, :cond_1f

    .line 686
    .line 687
    if-eqz v2, :cond_1e

    .line 688
    .line 689
    invoke-static {v3, v4}, Ldd1;->η(J)V

    .line 690
    .line 691
    .line 692
    goto :goto_11

    .line 693
    :cond_1e
    invoke-static {}, Ldd1;->θ()V

    .line 694
    .line 695
    .line 696
    :cond_1f
    :goto_11
    throw v0

    .line 697
    :catchall_7
    move-exception v0

    .line 698
    monitor-exit v1

    .line 699
    throw v0

    .line 700
    :pswitch_a
    const-string v1, "r87045d6703eaa6c4"

    .line 701
    .line 702
    sget-object v2, Lxa1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 703
    .line 704
    const-string v7, "\u81ea\u52a8\u6295\u5582\u5f02\u5e38 reason="

    .line 705
    .line 706
    :try_start_b
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    .line 707
    .line 708
    .line 709
    invoke-static {}, Lxa1;->ε()Z

    .line 710
    .line 711
    .line 712
    move-result v0
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 713
    if-nez v0, :cond_21

    .line 714
    .line 715
    :cond_20
    :goto_12
    invoke-virtual {v2, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 716
    .line 717
    .line 718
    goto/16 :goto_18

    .line 719
    .line 720
    :cond_21
    :try_start_c
    new-instance v0, Lkt0;

    .line 721
    .line 722
    invoke-direct {v0, v8}, Lkt0;-><init>(I)V

    .line 723
    .line 724
    .line 725
    invoke-static {v4, v0}, Lxa1;->λ(ILp70;)Z

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    if-nez v0, :cond_22

    .line 730
    .line 731
    const-string v0, "\u81ea\u52a8\u6295\u5582\u8df3\u8fc7 reason=wait_conversation_timeout"

    .line 732
    .line 733
    invoke-static {v1, v0, v11, v9, v11}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    goto :goto_12

    .line 737
    :catchall_8
    move-exception v0

    .line 738
    goto/16 :goto_16

    .line 739
    .line 740
    :cond_22
    sget-object v0, Lxa1;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 741
    .line 742
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 747
    .line 748
    if-eqz v0, :cond_20

    .line 749
    .line 750
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    check-cast v0, Landroid/app/Activity;

    .line 755
    .line 756
    if-eqz v0, :cond_20

    .line 757
    .line 758
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 759
    .line 760
    .line 761
    move-result v4

    .line 762
    if-nez v4, :cond_23

    .line 763
    .line 764
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 765
    .line 766
    .line 767
    move-result v4

    .line 768
    if-eqz v4, :cond_24

    .line 769
    .line 770
    :cond_23
    move-object v0, v11

    .line 771
    :cond_24
    if-eqz v0, :cond_20

    .line 772
    .line 773
    new-instance v4, Lkt0;

    .line 774
    .line 775
    const/16 v5, 0xb

    .line 776
    .line 777
    invoke-direct {v4, v5}, Lkt0;-><init>(I)V

    .line 778
    .line 779
    .line 780
    invoke-static {v3, v4}, Lxa1;->λ(ILp70;)Z

    .line 781
    .line 782
    .line 783
    move-result v3

    .line 784
    if-nez v3, :cond_25

    .line 785
    .line 786
    const-string v0, "\u81ea\u52a8\u6295\u5582\u8df3\u8fc7 reason=execution_busy_timeout"

    .line 787
    .line 788
    invoke-static {v1, v0, v11, v9, v11}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    goto :goto_12

    .line 792
    :cond_25
    invoke-static {}, Lxa1;->β()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v3

    .line 796
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 797
    .line 798
    .line 799
    move-result v4

    .line 800
    if-lez v4, :cond_26

    .line 801
    .line 802
    goto :goto_13

    .line 803
    :cond_26
    move-object v3, v11

    .line 804
    :goto_13
    if-nez v3, :cond_27

    .line 805
    .line 806
    goto :goto_12

    .line 807
    :cond_27
    sget-object v4, Ljf1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 808
    .line 809
    invoke-virtual {v4, v12, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 810
    .line 811
    .line 812
    move-result v5

    .line 813
    if-nez v5, :cond_28

    .line 814
    .line 815
    goto :goto_12

    .line 816
    :cond_28
    sget-object v5, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 817
    .line 818
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v5

    .line 822
    if-eqz v5, :cond_29

    .line 823
    .line 824
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    move-result-object v5

    .line 828
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 829
    .line 830
    .line 831
    move-result-object v5

    .line 832
    if-eqz v5, :cond_29

    .line 833
    .line 834
    goto :goto_14

    .line 835
    :cond_29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 840
    .line 841
    .line 842
    move-result-object v5
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 843
    :goto_14
    :try_start_d
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    invoke-static {v5, v3}, Lxa1;->γ(Ljava/lang/ClassLoader;Ljava/lang/String;)Lva1;

    .line 847
    .line 848
    .line 849
    move-result-object v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 850
    :try_start_e
    invoke-virtual {v4, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 851
    .line 852
    .line 853
    iget v4, v5, Lva1;->γ:I

    .line 854
    .line 855
    iget-object v6, v5, Lva1;->ι:Ljava/lang/String;

    .line 856
    .line 857
    if-lt v4, v10, :cond_2b

    .line 858
    .line 859
    const-string v4, "pet_elf_auto_success_toast_enabled"

    .line 860
    .line 861
    invoke-static {v4, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 862
    .line 863
    .line 864
    move-result v4

    .line 865
    if-nez v4, :cond_2a

    .line 866
    .line 867
    goto :goto_15

    .line 868
    :cond_2a
    new-instance v4, Lxx0;

    .line 869
    .line 870
    const/4 v8, 0x7

    .line 871
    invoke-direct {v4, v0, v6, v8}, Lxx0;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v0, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 875
    .line 876
    .line 877
    :cond_2b
    :goto_15
    invoke-static {}, Lxa1;->β()Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    if-eqz v0, :cond_20

    .line 886
    .line 887
    iget v0, v5, Lva1;->β:I

    .line 888
    .line 889
    if-lez v0, :cond_20

    .line 890
    .line 891
    sget-object v0, Lxa1;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 892
    .line 893
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    goto/16 :goto_12

    .line 897
    .line 898
    :catchall_9
    move-exception v0

    .line 899
    sget-object v3, Ljf1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 900
    .line 901
    invoke-virtual {v3, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 902
    .line 903
    .line 904
    throw v0
    :try_end_e
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 905
    :goto_16
    :try_start_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    move-result-object v3

    .line 909
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v3

    .line 913
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    if-nez v4, :cond_2c

    .line 918
    .line 919
    const-string v4, ""

    .line 920
    .line 921
    goto :goto_17

    .line 922
    :catchall_a
    move-exception v0

    .line 923
    goto :goto_19

    .line 924
    :cond_2c
    :goto_17
    const/16 v5, 0x78

    .line 925
    .line 926
    invoke-static {v4, v5}, Lxa1;->ι(Ljava/lang/String;I)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v4

    .line 930
    new-instance v5, Ljava/lang/StringBuilder;

    .line 931
    .line 932
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 936
    .line 937
    .line 938
    const-string v3, " message="

    .line 939
    .line 940
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 944
    .line 945
    .line 946
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v3

    .line 950
    invoke-static {v1, v3, v11, v9, v11}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 951
    .line 952
    .line 953
    const-string v3, "\u81ea\u52a8\u6295\u5582\u8c03\u5ea6\u5f02\u5e38"

    .line 954
    .line 955
    invoke-static {v1, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 956
    .line 957
    .line 958
    goto/16 :goto_12

    .line 959
    .line 960
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    .line 965
    .line 966
    .line 967
    goto/16 :goto_12

    .line 968
    .line 969
    :goto_18
    return-void

    .line 970
    :goto_19
    invoke-virtual {v2, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 971
    .line 972
    .line 973
    throw v0

    .line 974
    :pswitch_b
    sget-object v0, Lf01;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 975
    .line 976
    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 977
    .line 978
    .line 979
    sget-object v1, Lf01;->η:Ljava/util/Map;

    .line 980
    .line 981
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    monitor-enter v1

    .line 985
    :try_start_10
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    check-cast v0, Ljava/lang/Iterable;

    .line 990
    .line 991
    new-instance v2, Ljava/util/ArrayList;

    .line 992
    .line 993
    invoke-static {v0, v8}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 994
    .line 995
    .line 996
    move-result v3

    .line 997
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 998
    .line 999
    .line 1000
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v3

    .line 1008
    if-eqz v3, :cond_2d

    .line 1009
    .line 1010
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v3

    .line 1014
    check-cast v3, Ljava/util/Map$Entry;

    .line 1015
    .line 1016
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v4

    .line 1020
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v3

    .line 1024
    new-instance v5, Ll91;

    .line 1025
    .line 1026
    invoke-direct {v5, v4, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    .line 1030
    .line 1031
    .line 1032
    goto :goto_1a

    .line 1033
    :catchall_b
    move-exception v0

    .line 1034
    goto/16 :goto_25

    .line 1035
    .line 1036
    :cond_2d
    monitor-exit v1

    .line 1037
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v1

    .line 1041
    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1042
    .line 1043
    .line 1044
    move-result v0

    .line 1045
    if-eqz v0, :cond_31

    .line 1046
    .line 1047
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    check-cast v0, Ll91;

    .line 1052
    .line 1053
    iget-object v2, v0, Ll91;->ε:Ljava/lang/Object;

    .line 1054
    .line 1055
    iget-object v0, v0, Ll91;->ζ:Ljava/lang/Object;

    .line 1056
    .line 1057
    check-cast v0, Ld01;

    .line 1058
    .line 1059
    sget-object v3, Lf01;->ε:Ljava/lang/ThreadLocal;

    .line 1060
    .line 1061
    sget-object v4, Lvd0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1062
    .line 1063
    iget-object v4, v0, Ld01;->β:Ljava/util/ArrayList;

    .line 1064
    .line 1065
    invoke-static {v4}, Lvd0;->ζ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v4

    .line 1069
    if-nez v4, :cond_2e

    .line 1070
    .line 1071
    new-instance v4, Ljava/util/ArrayList;

    .line 1072
    .line 1073
    iget-object v5, v0, Ld01;->β:Ljava/util/ArrayList;

    .line 1074
    .line 1075
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1076
    .line 1077
    .line 1078
    :cond_2e
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v5

    .line 1082
    check-cast v5, Ljava/lang/Integer;

    .line 1083
    .line 1084
    if-eqz v5, :cond_2f

    .line 1085
    .line 1086
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1087
    .line 1088
    .line 1089
    move-result v5

    .line 1090
    goto :goto_1c

    .line 1091
    :cond_2f
    move v5, v12

    .line 1092
    :goto_1c
    add-int/lit8 v6, v5, 0x1

    .line 1093
    .line 1094
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v6

    .line 1098
    invoke-virtual {v3, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 1099
    .line 1100
    .line 1101
    :try_start_11
    sget-object v6, Lxq0;->α:Lxq0;

    .line 1102
    .line 1103
    iget-object v13, v0, Ld01;->α:Ljava/lang/reflect/Method;

    .line 1104
    .line 1105
    new-instance v14, Ljava/util/ArrayList;

    .line 1106
    .line 1107
    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1108
    .line 1109
    .line 1110
    iget-boolean v4, v0, Ld01;->γ:Z

    .line 1111
    .line 1112
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v4

    .line 1116
    iget v15, v0, Ld01;->δ:I

    .line 1117
    .line 1118
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v15

    .line 1122
    iget-object v0, v0, Ld01;->ε:Ljava/lang/String;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_d

    .line 1123
    .line 1124
    move-object/from16 v16, v11

    .line 1125
    .line 1126
    :try_start_12
    new-array v11, v9, [Ljava/io/Serializable;

    .line 1127
    .line 1128
    aput-object v14, v11, v12

    .line 1129
    .line 1130
    aput-object v4, v11, v10

    .line 1131
    .line 1132
    aput-object v15, v11, v7

    .line 1133
    .line 1134
    const/4 v4, 0x3

    .line 1135
    aput-object v0, v11, v4

    .line 1136
    .line 1137
    invoke-virtual {v6, v13, v2, v11}, Lxq0;->ζ(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    .line 1141
    goto :goto_1e

    .line 1142
    :catchall_c
    move-exception v0

    .line 1143
    goto :goto_1d

    .line 1144
    :catchall_d
    move-exception v0

    .line 1145
    move-object/from16 v16, v11

    .line 1146
    .line 1147
    :goto_1d
    new-instance v2, Leo1;

    .line 1148
    .line 1149
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1150
    .line 1151
    .line 1152
    move-object v0, v2

    .line 1153
    :goto_1e
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0

    .line 1157
    if-eqz v0, :cond_30

    .line 1158
    .line 1159
    const-string v2, "rd1fe9f51c470bd02"

    .line 1160
    .line 1161
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    const-string v4, "legacy status refresh failed: "

    .line 1166
    .line 1167
    invoke-static {v4, v0, v2}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1168
    .line 1169
    .line 1170
    :cond_30
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v0

    .line 1174
    invoke-virtual {v3, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 1175
    .line 1176
    .line 1177
    move-object/from16 v11, v16

    .line 1178
    .line 1179
    goto/16 :goto_1b

    .line 1180
    .line 1181
    :cond_31
    move-object/from16 v16, v11

    .line 1182
    .line 1183
    sget-object v1, Lf01;->θ:Ljava/util/Map;

    .line 1184
    .line 1185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1186
    .line 1187
    .line 1188
    monitor-enter v1

    .line 1189
    :try_start_13
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    check-cast v0, Ljava/lang/Iterable;

    .line 1194
    .line 1195
    new-instance v2, Ljava/util/ArrayList;

    .line 1196
    .line 1197
    invoke-static {v0, v8}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 1198
    .line 1199
    .line 1200
    move-result v3

    .line 1201
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1202
    .line 1203
    .line 1204
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v0

    .line 1208
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1209
    .line 1210
    .line 1211
    move-result v3

    .line 1212
    if-eqz v3, :cond_32

    .line 1213
    .line 1214
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v3

    .line 1218
    check-cast v3, Ljava/util/Map$Entry;

    .line 1219
    .line 1220
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v4

    .line 1224
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v3

    .line 1228
    new-instance v5, Ll91;

    .line 1229
    .line 1230
    invoke-direct {v5, v4, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_e

    .line 1234
    .line 1235
    .line 1236
    goto :goto_1f

    .line 1237
    :catchall_e
    move-exception v0

    .line 1238
    goto/16 :goto_24

    .line 1239
    .line 1240
    :cond_32
    monitor-exit v1

    .line 1241
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v1

    .line 1245
    :goto_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1246
    .line 1247
    .line 1248
    move-result v0

    .line 1249
    if-eqz v0, :cond_37

    .line 1250
    .line 1251
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    check-cast v0, Ll91;

    .line 1256
    .line 1257
    iget-object v2, v0, Ll91;->ε:Ljava/lang/Object;

    .line 1258
    .line 1259
    iget-object v0, v0, Ll91;->ζ:Ljava/lang/Object;

    .line 1260
    .line 1261
    check-cast v0, Lc01;

    .line 1262
    .line 1263
    sget-object v3, Lf01;->ζ:Ljava/lang/ThreadLocal;

    .line 1264
    .line 1265
    sget-object v4, Lvd0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1266
    .line 1267
    iget-object v4, v0, Lc01;->β:Ljava/util/ArrayList;

    .line 1268
    .line 1269
    iget-object v5, v0, Lc01;->α:Ljava/lang/reflect/Method;

    .line 1270
    .line 1271
    invoke-static {v4}, Lvd0;->ζ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v4

    .line 1275
    if-nez v4, :cond_33

    .line 1276
    .line 1277
    new-instance v4, Ljava/util/ArrayList;

    .line 1278
    .line 1279
    iget-object v0, v0, Lc01;->β:Ljava/util/ArrayList;

    .line 1280
    .line 1281
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1282
    .line 1283
    .line 1284
    :cond_33
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v0

    .line 1288
    check-cast v0, Ljava/lang/Integer;

    .line 1289
    .line 1290
    if-eqz v0, :cond_34

    .line 1291
    .line 1292
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1293
    .line 1294
    .line 1295
    move-result v0

    .line 1296
    move v6, v0

    .line 1297
    goto :goto_21

    .line 1298
    :cond_34
    move v6, v12

    .line 1299
    :goto_21
    add-int/lit8 v0, v6, 0x1

    .line 1300
    .line 1301
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    invoke-virtual {v3, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    array-length v0, v0

    .line 1313
    if-ne v0, v10, :cond_35

    .line 1314
    .line 1315
    new-array v0, v10, [Ljava/lang/Object;

    .line 1316
    .line 1317
    new-instance v8, Ljava/util/ArrayList;

    .line 1318
    .line 1319
    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1320
    .line 1321
    .line 1322
    aput-object v8, v0, v12

    .line 1323
    .line 1324
    goto :goto_22

    .line 1325
    :cond_35
    new-array v0, v7, [Ljava/lang/Object;

    .line 1326
    .line 1327
    new-instance v8, Ljava/util/ArrayList;

    .line 1328
    .line 1329
    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1330
    .line 1331
    .line 1332
    aput-object v8, v0, v12

    .line 1333
    .line 1334
    aput-object v16, v0, v10

    .line 1335
    .line 1336
    :goto_22
    :try_start_14
    sget-object v4, Lxq0;->α:Lxq0;

    .line 1337
    .line 1338
    invoke-virtual {v4, v5, v2, v0}, Lxq0;->ζ(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_f

    .line 1342
    goto :goto_23

    .line 1343
    :catchall_f
    move-exception v0

    .line 1344
    new-instance v2, Leo1;

    .line 1345
    .line 1346
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1347
    .line 1348
    .line 1349
    move-object v0, v2

    .line 1350
    :goto_23
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v0

    .line 1354
    if-eqz v0, :cond_36

    .line 1355
    .line 1356
    const-string v2, "rd1fe9f51c470bd02"

    .line 1357
    .line 1358
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    const-string v4, "refactor status refresh failed: "

    .line 1363
    .line 1364
    invoke-static {v4, v0, v2}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1365
    .line 1366
    .line 1367
    :cond_36
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    invoke-virtual {v3, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 1372
    .line 1373
    .line 1374
    goto/16 :goto_20

    .line 1375
    .line 1376
    :cond_37
    return-void

    .line 1377
    :goto_24
    monitor-exit v1

    .line 1378
    throw v0

    .line 1379
    :goto_25
    monitor-exit v1

    .line 1380
    throw v0

    .line 1381
    :pswitch_c
    sget-object v0, La01;->ε:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1382
    .line 1383
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1384
    .line 1385
    .line 1386
    move-result v0

    .line 1387
    if-lez v0, :cond_38

    .line 1388
    .line 1389
    sget-object v0, Lbe0;->α:Lbe0;

    .line 1390
    .line 1391
    invoke-virtual {v0}, Lbe0;->θ()Z

    .line 1392
    .line 1393
    .line 1394
    move-result v0

    .line 1395
    if-nez v0, :cond_38

    .line 1396
    .line 1397
    sget-object v0, La01;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1398
    .line 1399
    invoke-static {v12}, La01;->γ(Z)V

    .line 1400
    .line 1401
    .line 1402
    const-string v0, "rbe3d87ed96de26de"

    .line 1403
    .line 1404
    const-string v1, "\u5916\u90e8\u72b6\u6001\u53d8\u5316\u5bfc\u81f4\u4e34\u65f6\u663e\u793a\u7ec8\u6b62\uff0c\u5df2\u8fd8\u539f\u6807\u9898\u6587\u5b57"

    .line 1405
    .line 1406
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1407
    .line 1408
    .line 1409
    :cond_38
    return-void

    .line 1410
    :pswitch_d
    move-object/from16 v16, v11

    .line 1411
    .line 1412
    sget-object v0, La01;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1413
    .line 1414
    sget-object v0, La01;->ε:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1415
    .line 1416
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 1417
    .line 1418
    .line 1419
    move-result v1

    .line 1420
    if-gtz v1, :cond_3a

    .line 1421
    .line 1422
    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1423
    .line 1424
    .line 1425
    sput-object v16, La01;->ζ:Lfb0;

    .line 1426
    .line 1427
    sget-object v0, Lbe0;->α:Lbe0;

    .line 1428
    .line 1429
    invoke-virtual {v0}, Lbe0;->θ()Z

    .line 1430
    .line 1431
    .line 1432
    move-result v1

    .line 1433
    if-eqz v1, :cond_39

    .line 1434
    .line 1435
    invoke-virtual {v0}, Lbe0;->ρ()Lae0;

    .line 1436
    .line 1437
    .line 1438
    :cond_39
    invoke-static {}, La01;->ζ()V

    .line 1439
    .line 1440
    .line 1441
    const-string v0, "rbe3d87ed96de26de"

    .line 1442
    .line 1443
    const-string v1, "\u4e34\u65f6\u663e\u793a\u5012\u8ba1\u65f6\u5230\u671f\uff0c\u5df2\u81ea\u52a8\u6062\u590d\u9690\u85cf"

    .line 1444
    .line 1445
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1446
    .line 1447
    .line 1448
    goto :goto_26

    .line 1449
    :cond_3a
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1450
    .line 1451
    .line 1452
    move-result v0

    .line 1453
    sget-object v1, La01;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1454
    .line 1455
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v1

    .line 1459
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 1460
    .line 1461
    if-eqz v1, :cond_3b

    .line 1462
    .line 1463
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    check-cast v1, Landroid/widget/TextView;

    .line 1468
    .line 1469
    if-eqz v1, :cond_3b

    .line 1470
    .line 1471
    invoke-static {v0}, La01;->β(I)Ljava/lang/String;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v0

    .line 1475
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1476
    .line 1477
    .line 1478
    :cond_3b
    new-instance v0, Lfb0;

    .line 1479
    .line 1480
    const/16 v1, 0x9

    .line 1481
    .line 1482
    invoke-direct {v0, v1}, Lfb0;-><init>(I)V

    .line 1483
    .line 1484
    .line 1485
    sput-object v0, La01;->ζ:Lfb0;

    .line 1486
    .line 1487
    sget-object v1, La01;->β:Landroid/os/Handler;

    .line 1488
    .line 1489
    const-wide/16 v2, 0x3e8

    .line 1490
    .line 1491
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1492
    .line 1493
    .line 1494
    :goto_26
    return-void

    .line 1495
    :pswitch_e
    move-object/from16 v16, v11

    .line 1496
    .line 1497
    sget-object v0, Lyz0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1498
    .line 1499
    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1500
    .line 1501
    .line 1502
    sget-object v1, Lyz0;->δ:Ljava/util/Map;

    .line 1503
    .line 1504
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1505
    .line 1506
    .line 1507
    monitor-enter v1

    .line 1508
    :try_start_15
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v0

    .line 1512
    check-cast v0, Ljava/lang/Iterable;

    .line 1513
    .line 1514
    new-instance v2, Ljava/util/ArrayList;

    .line 1515
    .line 1516
    invoke-static {v0, v8}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 1517
    .line 1518
    .line 1519
    move-result v3

    .line 1520
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1521
    .line 1522
    .line 1523
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v0

    .line 1527
    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1528
    .line 1529
    .line 1530
    move-result v3

    .line 1531
    if-eqz v3, :cond_3c

    .line 1532
    .line 1533
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v3

    .line 1537
    check-cast v3, Ljava/util/Map$Entry;

    .line 1538
    .line 1539
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v4

    .line 1543
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v3

    .line 1547
    new-instance v5, Ll91;

    .line 1548
    .line 1549
    invoke-direct {v5, v4, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_10

    .line 1553
    .line 1554
    .line 1555
    goto :goto_27

    .line 1556
    :catchall_10
    move-exception v0

    .line 1557
    goto :goto_2a

    .line 1558
    :cond_3c
    monitor-exit v1

    .line 1559
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v1

    .line 1563
    :goto_28
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1564
    .line 1565
    .line 1566
    move-result v0

    .line 1567
    if-eqz v0, :cond_3e

    .line 1568
    .line 1569
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v0

    .line 1573
    check-cast v0, Ll91;

    .line 1574
    .line 1575
    iget-object v2, v0, Ll91;->ε:Ljava/lang/Object;

    .line 1576
    .line 1577
    iget-object v0, v0, Ll91;->ζ:Ljava/lang/Object;

    .line 1578
    .line 1579
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1580
    .line 1581
    move-object/from16 v3, v16

    .line 1582
    .line 1583
    :try_start_16
    filled-new-array {v3, v3}, [Ljava/lang/Object;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v4

    .line 1587
    invoke-virtual {v0, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_11

    .line 1591
    goto :goto_29

    .line 1592
    :catchall_11
    move-exception v0

    .line 1593
    new-instance v2, Leo1;

    .line 1594
    .line 1595
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1596
    .line 1597
    .line 1598
    move-object v0, v2

    .line 1599
    :goto_29
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    if-eqz v0, :cond_3d

    .line 1604
    .line 1605
    const-string v2, "r1e0d2867edbb56e0"

    .line 1606
    .line 1607
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v0

    .line 1611
    const-string v4, "session refresh failed: "

    .line 1612
    .line 1613
    invoke-static {v4, v0, v2}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1614
    .line 1615
    .line 1616
    :cond_3d
    move-object/from16 v16, v3

    .line 1617
    .line 1618
    goto :goto_28

    .line 1619
    :cond_3e
    return-void

    .line 1620
    :goto_2a
    monitor-exit v1

    .line 1621
    throw v0

    .line 1622
    :pswitch_f
    sget-object v0, Lht0;->α:Lht0;

    .line 1623
    .line 1624
    invoke-static {}, Lht0;->ζ()V

    .line 1625
    .line 1626
    .line 1627
    return-void

    .line 1628
    :pswitch_10
    sget-object v0, Lht0;->α:Lht0;

    .line 1629
    .line 1630
    invoke-static {}, Lht0;->ζ()V

    .line 1631
    .line 1632
    .line 1633
    return-void

    .line 1634
    :pswitch_11
    sget-object v0, Lht0;->α:Lht0;

    .line 1635
    .line 1636
    invoke-static {}, Lht0;->ζ()V

    .line 1637
    .line 1638
    .line 1639
    return-void

    .line 1640
    :pswitch_12
    sget-object v0, Lvh0;->ο:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1641
    .line 1642
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v0

    .line 1646
    :catchall_12
    :goto_2b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1647
    .line 1648
    .line 1649
    move-result v1

    .line 1650
    if-eqz v1, :cond_3f

    .line 1651
    .line 1652
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v1

    .line 1656
    check-cast v1, Lp70;

    .line 1657
    .line 1658
    :try_start_17
    invoke-interface {v1}, Lp70;->invoke()Ljava/lang/Object;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_12

    .line 1659
    .line 1660
    .line 1661
    goto :goto_2b

    .line 1662
    :cond_3f
    return-void

    .line 1663
    :pswitch_13
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 1664
    .line 1665
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 1666
    .line 1667
    new-instance v1, Lfb0;

    .line 1668
    .line 1669
    invoke-direct {v1, v7}, Lfb0;-><init>(I)V

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1673
    .line 1674
    .line 1675
    return-void

    .line 1676
    :pswitch_14
    sget-object v0, Lah0;->ρ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1677
    .line 1678
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v1

    .line 1682
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1683
    .line 1684
    .line 1685
    :goto_2c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1686
    .line 1687
    .line 1688
    move-result v2

    .line 1689
    if-eqz v2, :cond_41

    .line 1690
    .line 1691
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v2

    .line 1695
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 1696
    .line 1697
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v3

    .line 1701
    check-cast v3, Landroid/view/ViewGroup;

    .line 1702
    .line 1703
    if-nez v3, :cond_40

    .line 1704
    .line 1705
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 1706
    .line 1707
    .line 1708
    goto :goto_2c

    .line 1709
    :cond_40
    sget-object v2, Lah0;->α:Landroid/os/Handler;

    .line 1710
    .line 1711
    const-string v2, "refresh"

    .line 1712
    .line 1713
    invoke-static {v3, v2, v10}, Lah0;->б(Landroid/view/ViewGroup;Ljava/lang/String;Z)V

    .line 1714
    .line 1715
    .line 1716
    goto :goto_2c

    .line 1717
    :cond_41
    return-void

    .line 1718
    :pswitch_15
    :try_start_18
    const-string v0, "im_auto_read_enabled"
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_14

    .line 1719
    .line 1720
    :try_start_19
    invoke-static {}, Ltg0;->α()V

    .line 1721
    .line 1722
    .line 1723
    invoke-static {v0, v12}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1724
    .line 1725
    .line 1726
    move-result v12
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_13

    .line 1727
    :catchall_13
    if-eqz v12, :cond_42

    .line 1728
    .line 1729
    :try_start_1a
    invoke-static {}, Ltg0;->β()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_14

    .line 1730
    .line 1731
    .line 1732
    :cond_42
    :goto_2d
    invoke-static {}, Ltg0;->γ()V

    .line 1733
    .line 1734
    .line 1735
    goto :goto_2e

    .line 1736
    :catchall_14
    move-exception v0

    .line 1737
    :try_start_1b
    const-string v1, "DYHelper"

    .line 1738
    .line 1739
    const-string v2, "\u5b9a\u65f6\u5df2\u8bfb\u6267\u884c\u5f02\u5e38"

    .line 1740
    .line 1741
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_15

    .line 1742
    .line 1743
    .line 1744
    goto :goto_2d

    .line 1745
    :goto_2e
    return-void

    .line 1746
    :catchall_15
    move-exception v0

    .line 1747
    invoke-static {}, Ltg0;->γ()V

    .line 1748
    .line 1749
    .line 1750
    throw v0

    .line 1751
    :pswitch_16
    sget-object v0, Ljb0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1752
    .line 1753
    sget-object v0, Lhb0;->ζ:Lhb0;

    .line 1754
    .line 1755
    invoke-static {v0}, Ljb0;->ε(Lhb0;)Z

    .line 1756
    .line 1757
    .line 1758
    return-void

    .line 1759
    :pswitch_data_0
    .packed-switch 0x0
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
