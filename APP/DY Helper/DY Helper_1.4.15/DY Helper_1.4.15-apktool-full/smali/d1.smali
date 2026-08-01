.class public final Ld1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ld1;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Ld1;->ζ:Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ld1;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    const-wide/16 v5, -0x1

    .line 9
    .line 10
    const/4 v7, 0x2

    .line 11
    const/4 v8, 0x1

    .line 12
    const/4 v9, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lva2;

    .line 19
    .line 20
    iget-object v2, v0, Lva2;->δ:Landroid/widget/ProgressBar;

    .line 21
    .line 22
    iget-object v3, v0, Lva2;->ζ:Landroid/media/MediaPlayer;

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v3}, Landroid/media/MediaPlayer;->getDuration()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-ge v4, v8, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v8, v4

    .line 35
    :goto_0
    invoke-virtual {v2, v9}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    int-to-long v4, v4

    .line 43
    const-wide/16 v6, 0x64

    .line 44
    .line 45
    mul-long/2addr v4, v6

    .line 46
    int-to-long v6, v8

    .line 47
    div-long/2addr v4, v6

    .line 48
    long-to-int v4, v4

    .line 49
    const/16 v5, 0x64

    .line 50
    .line 51
    invoke-static {v4, v9, v5}, Lj81;->μ(III)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    iget-object v0, v0, Lva2;->ε:Landroid/os/Handler;

    .line 65
    .line 66
    const-wide/16 v2, 0x190

    .line 67
    .line 68
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_1
    return-void

    .line 72
    :pswitch_0
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    .line 75
    .line 76
    invoke-virtual {v0, v9}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_1
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lh92;

    .line 83
    .line 84
    invoke-virtual {v0, v9}, Lh92;->ρ(I)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_2
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 91
    .line 92
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 93
    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 97
    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/appcompat/widget/γ;->μ()Z

    .line 101
    .line 102
    .line 103
    :cond_3
    return-void

    .line 104
    :pswitch_3
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v2, v0

    .line 107
    check-cast v2, Lx22;

    .line 108
    .line 109
    monitor-enter v2

    .line 110
    :try_start_0
    iget v0, v2, Lx22;->η:I

    .line 111
    .line 112
    add-int/2addr v0, v8

    .line 113
    iput v0, v2, Lx22;->η:I

    .line 114
    .line 115
    invoke-virtual {v2}, Lx22;->β()Lt22;

    .line 116
    .line 117
    .line 118
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 119
    monitor-exit v2

    .line 120
    if-nez v0, :cond_4

    .line 121
    .line 122
    goto/16 :goto_5

    .line 123
    .line 124
    :cond_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    :cond_5
    move-object v4, v0

    .line 133
    :try_start_1
    iget-object v0, v4, Lt22;->α:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Lx22;

    .line 141
    .line 142
    iget-object v7, v0, Lx22;->β:Ljava/util/logging/Logger;

    .line 143
    .line 144
    iget-object v10, v4, Lt22;->γ:Lw22;

    .line 145
    .line 146
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 150
    .line 151
    invoke-virtual {v7, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    if-eqz v11, :cond_6

    .line 156
    .line 157
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 158
    .line 159
    .line 160
    move-result-wide v12

    .line 161
    const-string v0, "starting"

    .line 162
    .line 163
    invoke-static {v7, v4, v10, v0}, Lp91;->γ(Ljava/util/logging/Logger;Lt22;Lw22;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :catchall_0
    move-exception v0

    .line 168
    goto :goto_4

    .line 169
    :cond_6
    move-wide v12, v5

    .line 170
    :goto_2
    :try_start_2
    invoke-virtual {v4}, Lt22;->α()J

    .line 171
    .line 172
    .line 173
    move-result-wide v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 174
    if-eqz v11, :cond_7

    .line 175
    .line 176
    :try_start_3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 177
    .line 178
    .line 179
    move-result-wide v16

    .line 180
    sub-long v16, v16, v12

    .line 181
    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string v11, "finished run in "

    .line 188
    .line 189
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-static/range {v16 .. v17}, Lp91;->ν(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v7, v4, v10, v0}, Lp91;->γ(Ljava/util/logging/Logger;Lt22;Lw22;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_7
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 207
    .line 208
    move-object v7, v0

    .line 209
    check-cast v7, Lx22;

    .line 210
    .line 211
    monitor-enter v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 212
    :try_start_4
    invoke-static {v7, v4, v14, v15, v8}, Lx22;->α(Lx22;Lt22;JZ)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7}, Lx22;->β()Lt22;

    .line 216
    .line 217
    .line 218
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 219
    :try_start_5
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 220
    if-nez v0, :cond_5

    .line 221
    .line 222
    :goto_3
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :catchall_1
    move-exception v0

    .line 227
    :try_start_6
    monitor-exit v7

    .line 228
    throw v0

    .line 229
    :catchall_2
    move-exception v0

    .line 230
    if-eqz v11, :cond_8

    .line 231
    .line 232
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 233
    .line 234
    .line 235
    move-result-wide v14

    .line 236
    sub-long/2addr v14, v12

    .line 237
    new-instance v8, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const-string v11, "failed a run in "

    .line 243
    .line 244
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-static {v14, v15}, Lp91;->ν(J)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    invoke-static {v7, v4, v10, v8}, Lp91;->γ(Ljava/util/logging/Logger;Lt22;Lw22;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    :cond_8
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 262
    :goto_4
    :try_start_7
    iget-object v1, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v1, Lx22;

    .line 265
    .line 266
    monitor-enter v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 267
    :try_start_8
    invoke-static {v1, v4, v5, v6, v9}, Lx22;->α(Lx22;Lt22;JZ)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 268
    .line 269
    .line 270
    :try_start_9
    monitor-exit v1

    .line 271
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 272
    .line 273
    if-eqz v1, :cond_9

    .line 274
    .line 275
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :goto_5
    return-void

    .line 284
    :catchall_3
    move-exception v0

    .line 285
    goto :goto_6

    .line 286
    :cond_9
    throw v0

    .line 287
    :catchall_4
    move-exception v0

    .line 288
    monitor-exit v1

    .line 289
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 290
    :goto_6
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw v0

    .line 294
    :catchall_5
    move-exception v0

    .line 295
    monitor-exit v2

    .line 296
    throw v0

    .line 297
    :pswitch_4
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 300
    .line 301
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->а()Z

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_5
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 308
    .line 309
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 310
    .line 311
    if-eqz v0, :cond_17

    .line 312
    .line 313
    check-cast v0, Lfr;

    .line 314
    .line 315
    iget-object v1, v0, Lfr;->ε:Ljava/util/ArrayList;

    .line 316
    .line 317
    iget-object v2, v0, Lfr;->ι:Ljava/util/ArrayList;

    .line 318
    .line 319
    iget-object v5, v0, Lfr;->λ:Ljava/util/ArrayList;

    .line 320
    .line 321
    iget-object v6, v0, Lfr;->κ:Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v7

    .line 327
    iget-object v8, v0, Lfr;->η:Ljava/util/ArrayList;

    .line 328
    .line 329
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    iget-object v11, v0, Lfr;->θ:Ljava/util/ArrayList;

    .line 334
    .line 335
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 336
    .line 337
    .line 338
    move-result v12

    .line 339
    iget-object v13, v0, Lfr;->ζ:Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 342
    .line 343
    .line 344
    move-result v14

    .line 345
    if-eqz v7, :cond_a

    .line 346
    .line 347
    if-eqz v10, :cond_a

    .line 348
    .line 349
    if-eqz v14, :cond_a

    .line 350
    .line 351
    if-eqz v12, :cond_a

    .line 352
    .line 353
    goto/16 :goto_b

    .line 354
    .line 355
    :cond_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object v15

    .line 359
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v16

    .line 363
    if-nez v16, :cond_16

    .line 364
    .line 365
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 366
    .line 367
    .line 368
    if-nez v10, :cond_d

    .line 369
    .line 370
    new-instance v1, Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 376
    .line 377
    .line 378
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 382
    .line 383
    .line 384
    if-eqz v7, :cond_c

    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v15

    .line 394
    if-nez v15, :cond_b

    .line 395
    .line 396
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_b
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-static {v0}, Llz1;->ψ(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    const/4 v0, 0x0

    .line 411
    throw v0

    .line 412
    :cond_c
    invoke-static {v9, v1}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    throw v0

    .line 417
    :cond_d
    :goto_7
    if-nez v12, :cond_10

    .line 418
    .line 419
    new-instance v1, Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 425
    .line 426
    .line 427
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 431
    .line 432
    .line 433
    if-eqz v7, :cond_f

    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v8

    .line 443
    if-nez v8, :cond_e

    .line 444
    .line 445
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_e
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    invoke-static {}, Lγ;->β()V

    .line 460
    .line 461
    .line 462
    goto :goto_b

    .line 463
    :cond_f
    invoke-static {v9, v1}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    throw v0

    .line 468
    :cond_10
    :goto_8
    if-nez v14, :cond_17

    .line 469
    .line 470
    new-instance v1, Ljava/util/ArrayList;

    .line 471
    .line 472
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 482
    .line 483
    .line 484
    if-eqz v7, :cond_13

    .line 485
    .line 486
    if-eqz v10, :cond_13

    .line 487
    .line 488
    if-nez v12, :cond_11

    .line 489
    .line 490
    goto :goto_9

    .line 491
    :cond_11
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    if-nez v3, :cond_12

    .line 500
    .line 501
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    goto :goto_b

    .line 508
    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-static {}, Lγ;->β()V

    .line 516
    .line 517
    .line 518
    goto :goto_b

    .line 519
    :cond_13
    :goto_9
    if-nez v10, :cond_14

    .line 520
    .line 521
    iget-wide v5, v0, Lxl1;->γ:J

    .line 522
    .line 523
    goto :goto_a

    .line 524
    :cond_14
    move-wide v5, v3

    .line 525
    :goto_a
    if-nez v12, :cond_15

    .line 526
    .line 527
    iget-wide v3, v0, Lxl1;->δ:J

    .line 528
    .line 529
    :cond_15
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 530
    .line 531
    .line 532
    invoke-static {v9, v1}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    throw v0

    .line 537
    :cond_16
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    invoke-static {}, Lγ;->β()V

    .line 545
    .line 546
    .line 547
    :cond_17
    :goto_b
    return-void

    .line 548
    :pswitch_6
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v0, Landroidx/appcompat/widget/θ;

    .line 551
    .line 552
    iget-object v1, v0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 553
    .line 554
    if-eqz v1, :cond_18

    .line 555
    .line 556
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-eqz v1, :cond_18

    .line 561
    .line 562
    iget-object v1, v0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 563
    .line 564
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getCount()I

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    iget-object v2, v0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 569
    .line 570
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    if-le v1, v2, :cond_18

    .line 575
    .line 576
    iget-object v1, v0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 577
    .line 578
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    iget v2, v0, Landroidx/appcompat/widget/θ;->ρ:I

    .line 583
    .line 584
    if-gt v1, v2, :cond_18

    .line 585
    .line 586
    iget-object v1, v0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 587
    .line 588
    invoke-virtual {v1, v7}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v0}, Landroidx/appcompat/widget/θ;->δ()V

    .line 592
    .line 593
    .line 594
    :cond_18
    return-void

    .line 595
    :pswitch_7
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v0, Lb70;

    .line 598
    .line 599
    invoke-virtual {v0, v8}, Lb70;->ω(Z)Z

    .line 600
    .line 601
    .line 602
    return-void

    .line 603
    :pswitch_8
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 604
    .line 605
    check-cast v0, Lo00;

    .line 606
    .line 607
    iget-object v1, v0, Lo00;->φ:Landroid/animation/ValueAnimator;

    .line 608
    .line 609
    iget v3, v0, Lo00;->χ:I

    .line 610
    .line 611
    if-eq v3, v8, :cond_19

    .line 612
    .line 613
    if-eq v3, v7, :cond_1a

    .line 614
    .line 615
    goto :goto_c

    .line 616
    :cond_19
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 617
    .line 618
    .line 619
    :cond_1a
    iput v2, v0, Lo00;->χ:I

    .line 620
    .line 621
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    check-cast v0, Ljava/lang/Float;

    .line 626
    .line 627
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    new-array v2, v7, [F

    .line 632
    .line 633
    aput v0, v2, v9

    .line 634
    .line 635
    const/4 v0, 0x0

    .line 636
    aput v0, v2, v8

    .line 637
    .line 638
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 639
    .line 640
    .line 641
    const/16 v0, 0x1f4

    .line 642
    .line 643
    int-to-long v2, v0

    .line 644
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 648
    .line 649
    .line 650
    :goto_c
    return-void

    .line 651
    :pswitch_9
    sget-boolean v0, Lyw;->ε:Z

    .line 652
    .line 653
    if-nez v0, :cond_1b

    .line 654
    .line 655
    goto :goto_d

    .line 656
    :cond_1b
    :try_start_a
    sget-object v0, Lyw;->α:Landroid/os/Handler;

    .line 657
    .line 658
    invoke-static {}, Lyw;->δ()Lxw;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    iget-boolean v2, v0, Lxw;->α:Z

    .line 663
    .line 664
    if-eqz v2, :cond_1c

    .line 665
    .line 666
    iget-object v2, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v2, Landroid/app/Activity;

    .line 669
    .line 670
    invoke-static {v2, v0}, Lyw;->α(Landroid/app/Activity;Lxw;)V

    .line 671
    .line 672
    .line 673
    :cond_1c
    iget-boolean v2, v0, Lxw;->ζ:Z

    .line 674
    .line 675
    if-eqz v2, :cond_1d

    .line 676
    .line 677
    iget-object v2, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v2, Landroid/app/Activity;

    .line 680
    .line 681
    invoke-static {v2, v0}, Lyw;->β(Landroid/app/Activity;Lxw;)V

    .line 682
    .line 683
    .line 684
    :cond_1d
    iget-boolean v2, v0, Lxw;->α:Z

    .line 685
    .line 686
    if-nez v2, :cond_1e

    .line 687
    .line 688
    iget-boolean v0, v0, Lxw;->ζ:Z

    .line 689
    .line 690
    if-nez v0, :cond_1e

    .line 691
    .line 692
    invoke-static {}, Lyw;->θ()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 693
    .line 694
    .line 695
    goto :goto_d

    .line 696
    :catchall_6
    :cond_1e
    sget-object v0, Lyw;->α:Landroid/os/Handler;

    .line 697
    .line 698
    const-wide/16 v2, 0x2710

    .line 699
    .line 700
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 701
    .line 702
    .line 703
    :goto_d
    return-void

    .line 704
    :pswitch_a
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v0, Lq2;

    .line 707
    .line 708
    iget-object v1, v0, Lq2;->δ:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast v1, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 711
    .line 712
    iget-object v3, v0, Lq2;->β:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v3, Lh92;

    .line 715
    .line 716
    iget v3, v3, Lh92;->ο:I

    .line 717
    .line 718
    iget v4, v0, Lq2;->α:I

    .line 719
    .line 720
    if-ne v4, v2, :cond_1f

    .line 721
    .line 722
    move v5, v8

    .line 723
    goto :goto_e

    .line 724
    :cond_1f
    move v5, v9

    .line 725
    :goto_e
    const/4 v6, 0x5

    .line 726
    if-eqz v5, :cond_21

    .line 727
    .line 728
    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->δ(I)Landroid/view/View;

    .line 729
    .line 730
    .line 731
    move-result-object v7

    .line 732
    if-eqz v7, :cond_20

    .line 733
    .line 734
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 735
    .line 736
    .line 737
    move-result v10

    .line 738
    neg-int v10, v10

    .line 739
    goto :goto_f

    .line 740
    :cond_20
    move v10, v9

    .line 741
    :goto_f
    add-int/2addr v10, v3

    .line 742
    goto :goto_10

    .line 743
    :cond_21
    invoke-virtual {v1, v6}, Landroidx/drawerlayout/widget/DrawerLayout;->δ(I)Landroid/view/View;

    .line 744
    .line 745
    .line 746
    move-result-object v7

    .line 747
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 748
    .line 749
    .line 750
    move-result v10

    .line 751
    sub-int/2addr v10, v3

    .line 752
    :goto_10
    if-eqz v7, :cond_27

    .line 753
    .line 754
    if-eqz v5, :cond_22

    .line 755
    .line 756
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    .line 757
    .line 758
    .line 759
    move-result v3

    .line 760
    if-lt v3, v10, :cond_23

    .line 761
    .line 762
    :cond_22
    if-nez v5, :cond_27

    .line 763
    .line 764
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    .line 765
    .line 766
    .line 767
    move-result v3

    .line 768
    if-le v3, v10, :cond_27

    .line 769
    .line 770
    :cond_23
    invoke-virtual {v1, v7}, Landroidx/drawerlayout/widget/DrawerLayout;->ζ(Landroid/view/View;)I

    .line 771
    .line 772
    .line 773
    move-result v3

    .line 774
    if-nez v3, :cond_27

    .line 775
    .line 776
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 777
    .line 778
    .line 779
    move-result-object v3

    .line 780
    check-cast v3, Lkw;

    .line 781
    .line 782
    iget-object v0, v0, Lq2;->β:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v0, Lh92;

    .line 785
    .line 786
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    .line 787
    .line 788
    .line 789
    move-result v5

    .line 790
    invoke-virtual {v0, v7, v10, v5}, Lh92;->τ(Landroid/view/View;II)Z

    .line 791
    .line 792
    .line 793
    iput-boolean v8, v3, Lkw;->γ:Z

    .line 794
    .line 795
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 796
    .line 797
    .line 798
    if-ne v4, v2, :cond_24

    .line 799
    .line 800
    move v2, v6

    .line 801
    :cond_24
    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->δ(I)Landroid/view/View;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    if-eqz v0, :cond_25

    .line 806
    .line 807
    invoke-virtual {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->β(Landroid/view/View;)V

    .line 808
    .line 809
    .line 810
    :cond_25
    iget-boolean v0, v1, Landroidx/drawerlayout/widget/DrawerLayout;->φ:Z

    .line 811
    .line 812
    if-nez v0, :cond_27

    .line 813
    .line 814
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 815
    .line 816
    .line 817
    move-result-wide v10

    .line 818
    const/16 v16, 0x0

    .line 819
    .line 820
    const/16 v17, 0x0

    .line 821
    .line 822
    const/4 v14, 0x3

    .line 823
    const/4 v15, 0x0

    .line 824
    move-wide v12, v10

    .line 825
    invoke-static/range {v10 .. v17}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 830
    .line 831
    .line 832
    move-result v2

    .line 833
    :goto_11
    if-ge v9, v2, :cond_26

    .line 834
    .line 835
    invoke-virtual {v1, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 836
    .line 837
    .line 838
    move-result-object v3

    .line 839
    invoke-virtual {v3, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 840
    .line 841
    .line 842
    add-int/lit8 v9, v9, 0x1

    .line 843
    .line 844
    goto :goto_11

    .line 845
    :cond_26
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 846
    .line 847
    .line 848
    iput-boolean v8, v1, Landroidx/drawerlayout/widget/DrawerLayout;->φ:Z

    .line 849
    .line 850
    :cond_27
    return-void

    .line 851
    :pswitch_b
    :try_start_b
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 854
    .line 855
    invoke-static {v0}, Landroidx/activity/ComponentActivity;->ε(Landroidx/activity/ComponentActivity;)V
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_b .. :try_end_b} :catch_0

    .line 856
    .line 857
    .line 858
    goto :goto_14

    .line 859
    :catch_0
    move-exception v0

    .line 860
    goto :goto_12

    .line 861
    :catch_1
    move-exception v0

    .line 862
    goto :goto_13

    .line 863
    :goto_12
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    const-string v2, "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference"

    .line 868
    .line 869
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 870
    .line 871
    .line 872
    move-result v1

    .line 873
    if-eqz v1, :cond_28

    .line 874
    .line 875
    goto :goto_14

    .line 876
    :cond_28
    throw v0

    .line 877
    :goto_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    const-string v2, "Can not perform this action after onSaveInstanceState"

    .line 882
    .line 883
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    if-eqz v1, :cond_29

    .line 888
    .line 889
    :goto_14
    return-void

    .line 890
    :cond_29
    throw v0

    .line 891
    :pswitch_c
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 892
    .line 893
    check-cast v0, Liu0;

    .line 894
    .line 895
    iget-object v2, v0, Liu0;->η:Landroid/view/View;

    .line 896
    .line 897
    iget-object v7, v0, Liu0;->ε:Lu7;

    .line 898
    .line 899
    iget-boolean v8, v0, Liu0;->τ:Z

    .line 900
    .line 901
    if-nez v8, :cond_2a

    .line 902
    .line 903
    goto/16 :goto_16

    .line 904
    .line 905
    :cond_2a
    iget-boolean v8, v0, Liu0;->ρ:Z

    .line 906
    .line 907
    if-eqz v8, :cond_2b

    .line 908
    .line 909
    iput-boolean v9, v0, Liu0;->ρ:Z

    .line 910
    .line 911
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 912
    .line 913
    .line 914
    move-result-wide v10

    .line 915
    iput-wide v10, v7, Lu7;->ε:J

    .line 916
    .line 917
    iput-wide v5, v7, Lu7;->η:J

    .line 918
    .line 919
    iput-wide v10, v7, Lu7;->ζ:J

    .line 920
    .line 921
    const/high16 v5, 0x3f000000    # 0.5f

    .line 922
    .line 923
    iput v5, v7, Lu7;->θ:F

    .line 924
    .line 925
    :cond_2b
    iget-wide v5, v7, Lu7;->η:J

    .line 926
    .line 927
    cmp-long v5, v5, v3

    .line 928
    .line 929
    if-lez v5, :cond_2c

    .line 930
    .line 931
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 932
    .line 933
    .line 934
    move-result-wide v5

    .line 935
    iget-wide v10, v7, Lu7;->η:J

    .line 936
    .line 937
    iget v8, v7, Lu7;->ι:I

    .line 938
    .line 939
    int-to-long v12, v8

    .line 940
    add-long/2addr v10, v12

    .line 941
    cmp-long v5, v5, v10

    .line 942
    .line 943
    if-lez v5, :cond_2c

    .line 944
    .line 945
    goto :goto_15

    .line 946
    :cond_2c
    invoke-virtual {v0}, Liu0;->ε()Z

    .line 947
    .line 948
    .line 949
    move-result v5

    .line 950
    if-nez v5, :cond_2d

    .line 951
    .line 952
    :goto_15
    iput-boolean v9, v0, Liu0;->τ:Z

    .line 953
    .line 954
    goto :goto_16

    .line 955
    :cond_2d
    iget-boolean v5, v0, Liu0;->σ:Z

    .line 956
    .line 957
    if-eqz v5, :cond_2e

    .line 958
    .line 959
    iput-boolean v9, v0, Liu0;->σ:Z

    .line 960
    .line 961
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 962
    .line 963
    .line 964
    move-result-wide v10

    .line 965
    const/16 v16, 0x0

    .line 966
    .line 967
    const/16 v17, 0x0

    .line 968
    .line 969
    const/4 v14, 0x3

    .line 970
    const/4 v15, 0x0

    .line 971
    move-wide v12, v10

    .line 972
    invoke-static/range {v10 .. v17}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 973
    .line 974
    .line 975
    move-result-object v5

    .line 976
    invoke-virtual {v2, v5}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 977
    .line 978
    .line 979
    invoke-virtual {v5}, Landroid/view/MotionEvent;->recycle()V

    .line 980
    .line 981
    .line 982
    :cond_2e
    iget-wide v5, v7, Lu7;->ζ:J

    .line 983
    .line 984
    cmp-long v3, v5, v3

    .line 985
    .line 986
    if-eqz v3, :cond_2f

    .line 987
    .line 988
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 989
    .line 990
    .line 991
    move-result-wide v3

    .line 992
    invoke-virtual {v7, v3, v4}, Lu7;->α(J)F

    .line 993
    .line 994
    .line 995
    move-result v5

    .line 996
    const/high16 v6, -0x3f800000    # -4.0f

    .line 997
    .line 998
    mul-float/2addr v6, v5

    .line 999
    mul-float/2addr v6, v5

    .line 1000
    const/high16 v8, 0x40800000    # 4.0f

    .line 1001
    .line 1002
    mul-float/2addr v5, v8

    .line 1003
    add-float/2addr v5, v6

    .line 1004
    iget-wide v8, v7, Lu7;->ζ:J

    .line 1005
    .line 1006
    sub-long v8, v3, v8

    .line 1007
    .line 1008
    iput-wide v3, v7, Lu7;->ζ:J

    .line 1009
    .line 1010
    long-to-float v3, v8

    .line 1011
    mul-float/2addr v3, v5

    .line 1012
    iget v4, v7, Lu7;->δ:F

    .line 1013
    .line 1014
    mul-float/2addr v3, v4

    .line 1015
    float-to-int v3, v3

    .line 1016
    iget-object v0, v0, Liu0;->φ:Landroid/widget/ListView;

    .line 1017
    .line 1018
    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1019
    .line 1020
    .line 1021
    sget-object v0, Lb92;->α:Ljava/util/WeakHashMap;

    .line 1022
    .line 1023
    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1024
    .line 1025
    .line 1026
    :goto_16
    return-void

    .line 1027
    :cond_2f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1028
    .line 1029
    const-string v1, "Cannot compute scroll delta before calling start()"

    .line 1030
    .line 1031
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1032
    .line 1033
    .line 1034
    throw v0

    .line 1035
    :pswitch_d
    iget-object v0, v1, Ld1;->ζ:Ljava/lang/Object;

    .line 1036
    .line 1037
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1038
    .line 1039
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1040
    .line 1041
    .line 1042
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 1043
    .line 1044
    if-eqz v2, :cond_31

    .line 1045
    .line 1046
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1047
    .line 1048
    .line 1049
    move-result v1

    .line 1050
    const/16 v3, 0xa

    .line 1051
    .line 1052
    if-eq v1, v3, :cond_31

    .line 1053
    .line 1054
    if-eq v1, v8, :cond_31

    .line 1055
    .line 1056
    const/4 v3, 0x7

    .line 1057
    if-eq v1, v3, :cond_30

    .line 1058
    .line 1059
    const/16 v4, 0x9

    .line 1060
    .line 1061
    if-eq v1, v4, :cond_30

    .line 1062
    .line 1063
    move v3, v7

    .line 1064
    :cond_30
    iget-wide v4, v0, Landroidx/compose/ui/platform/AndroidComposeView;->ш:J

    .line 1065
    .line 1066
    const/4 v6, 0x0

    .line 1067
    move-object v1, v0

    .line 1068
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/platform/AndroidComposeView;->Θ(Landroid/view/MotionEvent;IJZ)V

    .line 1069
    .line 1070
    .line 1071
    :cond_31
    return-void

    .line 1072
    nop

    .line 1073
    :pswitch_data_0
    .packed-switch 0x0
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
