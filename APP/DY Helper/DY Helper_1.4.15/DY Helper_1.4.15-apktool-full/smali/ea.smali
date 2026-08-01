.class public final synthetic Lea;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lea;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lea;->ζ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lea;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lea;->ζ:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lo22;->ρ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lo22;->α:Lo22;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-static {p0}, Lo22;->Κ(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    sget-object v0, Lo22;->κ:Ljava/util/Map;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    monitor-enter v0

    .line 41
    :try_start_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/Iterable;

    .line 46
    .line 47
    new-instance v2, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v3, 0xa

    .line 50
    .line 51
    invoke-static {v1, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Ljava/util/Map$Entry;

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    new-instance v5, Ll91;

    .line 83
    .line 84
    invoke-direct {v5, v4, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    goto :goto_3

    .line 93
    :cond_1
    monitor-exit v0

    .line 94
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Ll91;

    .line 109
    .line 110
    iget-object v2, v1, Ll91;->ε:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, Landroid/view/View;

    .line 113
    .line 114
    iget-object v1, v1, Ll91;->ζ:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Lm22;

    .line 117
    .line 118
    sget-object v3, Lo22;->α:Lo22;

    .line 119
    .line 120
    iget-object v4, v1, Lm22;->α:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v4}, Lo22;->Λ(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_2

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object v1, v1, Lm22;->α:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v3, v2, v1, p0}, Lo22;->η(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v1}, Lo22;->Η(Landroid/view/View;Lm22;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v2}, Lo22;->Ι(Landroid/view/View;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    :goto_2
    return-void

    .line 148
    :goto_3
    monitor-exit v0

    .line 149
    throw p0

    .line 150
    :pswitch_0
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 151
    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v1, "profile:"

    .line 155
    .line 156
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {p0}, Lah0;->г(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_1
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 171
    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v1, "config:"

    .line 175
    .line 176
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-static {p0}, Lah0;->г(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :pswitch_2
    sget-object v0, Lpq;->ζ:Ljava/lang/Object;

    .line 191
    .line 192
    monitor-enter v0

    .line 193
    :try_start_1
    sget-object v2, Lpq;->θ:Ljava/util/HashMap;

    .line 194
    .line 195
    invoke-virtual {v2, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    check-cast v2, Ljq;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 200
    .line 201
    monitor-exit v0

    .line 202
    if-nez v2, :cond_4

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_4
    :try_start_2
    sget-object v0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 206
    .line 207
    iget-object v0, v2, Ljq;->α:Ljava/lang/Object;

    .line 208
    .line 209
    invoke-static {v0}, Lb10;->υ(Ljava/lang/Object;)Lf8;

    .line 210
    .line 211
    .line 212
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 213
    goto :goto_4

    .line 214
    :catchall_1
    move-exception v0

    .line 215
    new-instance v2, Leo1;

    .line 216
    .line 217
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    move-object v0, v2

    .line 221
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    if-nez v2, :cond_5

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    const-string v2, "DYHelper: CurrentAwemeContext: \u5f02\u6b65\u89e3\u6790\u5931\u8d25: "

    .line 233
    .line 234
    invoke-static {v2, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    sget-object v0, Lf8;->Χ:Lf8;

    .line 238
    .line 239
    :goto_5
    check-cast v0, Lf8;

    .line 240
    .line 241
    sget-object v2, Lpq;->ζ:Ljava/lang/Object;

    .line 242
    .line 243
    monitor-enter v2

    .line 244
    :try_start_3
    sget-object v3, Lpq;->θ:Ljava/util/HashMap;

    .line 245
    .line 246
    invoke-virtual {v3, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    check-cast v3, Ljq;

    .line 251
    .line 252
    if-eqz v3, :cond_6

    .line 253
    .line 254
    iget-object v1, v3, Ljq;->β:Ljava/util/ArrayList;

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :catchall_2
    move-exception p0

    .line 258
    goto :goto_9

    .line 259
    :cond_6
    :goto_6
    if-nez v1, :cond_7

    .line 260
    .line 261
    sget-object v1, Ljz;->ε:Ljz;

    .line 262
    .line 263
    :cond_7
    sget-object v3, Lpq;->η:Lnq;

    .line 264
    .line 265
    new-instance v4, Liq;

    .line 266
    .line 267
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 268
    .line 269
    .line 270
    move-result-wide v5

    .line 271
    invoke-direct {v4, v0, v5, v6}, Liq;-><init>(Lf8;J)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, p0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 275
    .line 276
    .line 277
    monitor-exit v2

    .line 278
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_8

    .line 287
    .line 288
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, La80;

    .line 293
    .line 294
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_8
    :goto_8
    return-void

    .line 299
    :goto_9
    monitor-exit v2

    .line 300
    throw p0

    .line 301
    :catchall_3
    move-exception p0

    .line 302
    monitor-exit v0

    .line 303
    throw p0

    .line 304
    :pswitch_3
    sget-object v0, Lug;->α:Ltg;

    .line 305
    .line 306
    invoke-static {}, Ltg;->θ()V

    .line 307
    .line 308
    .line 309
    const-string v0, "feed selection changed generation="

    .line 310
    .line 311
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-static {v1}, Ltg;->ζ(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    const/16 v0, 0x8

    .line 323
    .line 324
    invoke-static {v2, p0, v2, v0}, Ltg;->ι(ZLjava/lang/String;ZI)V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    :pswitch_4
    const-string v0, "rc2b948eb05c3593c"

    .line 329
    .line 330
    const-string v2, "blacklist check failed: "

    .line 331
    .line 332
    const-string v3, "blacklist verification pending reason="

    .line 333
    .line 334
    const/4 v4, 0x4

    .line 335
    :try_start_4
    sget-object v5, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 336
    .line 337
    invoke-virtual {v5, p0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->β(Ljava/lang/String;)Lfa;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    iget-boolean v7, v6, Lfa;->γ:Z

    .line 342
    .line 343
    if-eqz v7, :cond_a

    .line 344
    .line 345
    iget-boolean v3, v6, Lfa;->α:Z

    .line 346
    .line 347
    iget-object v7, v6, Lfa;->β:Ljava/lang/String;

    .line 348
    .line 349
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    invoke-static {v7}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 358
    .line 359
    .line 360
    move-result-object v7

    .line 361
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    sput-boolean v3, Lcom/example/dyhelper/beta/BlacklistVerifier;->μ:Z

    .line 366
    .line 367
    sput-object v7, Lcom/example/dyhelper/beta/BlacklistVerifier;->ν:Ljava/lang/String;

    .line 368
    .line 369
    invoke-static {}, Lui1;->Α()Z

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    if-eqz v9, :cond_9

    .line 374
    .line 375
    invoke-static {v8, v7, v3}, Lui1;->Μ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 376
    .line 377
    .line 378
    :cond_9
    const-string v8, "persistResult"

    .line 379
    .line 380
    invoke-virtual {v5, v7, v8, v3}, Lcom/example/dyhelper/beta/BlacklistVerifier;->λ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 381
    .line 382
    .line 383
    goto :goto_a

    .line 384
    :catchall_4
    move-exception v3

    .line 385
    goto :goto_c

    .line 386
    :cond_a
    iget-object v5, v6, Lfa;->β:Ljava/lang/String;

    .line 387
    .line 388
    new-instance v7, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    invoke-static {v0, v3, v1, v4, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :goto_a
    iget-boolean v3, v6, Lfa;->α:Z

    .line 404
    .line 405
    if-eqz v3, :cond_b

    .line 406
    .line 407
    invoke-static {}, Lcom/example/dyhelper/beta/BlacklistVerifier;->η()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 408
    .line 409
    .line 410
    :cond_b
    :goto_b
    sget-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->η:Ljava/util/Set;

    .line 411
    .line 412
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    goto :goto_d

    .line 416
    :goto_c
    :try_start_5
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    new-instance v5, Ljava/lang/StringBuilder;

    .line 421
    .line 422
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-static {v0, v2, v1, v4, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 433
    .line 434
    .line 435
    goto :goto_b

    .line 436
    :goto_d
    return-void

    .line 437
    :catchall_5
    move-exception v0

    .line 438
    sget-object v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->η:Ljava/util/Set;

    .line 439
    .line 440
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    throw v0

    .line 444
    nop

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
