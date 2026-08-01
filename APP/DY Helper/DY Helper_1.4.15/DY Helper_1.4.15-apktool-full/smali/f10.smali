.class public final Lf10;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lf10;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Lm01;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 7
    iput p2, p0, Lf10;->α:I

    invoke-direct {p0, p1}, Lm01;-><init>(I)V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 13

    .line 1
    iget v0, p0, Lf10;->α:I

    .line 2
    .line 3
    const-wide/16 v1, 0x2bc

    .line 4
    .line 5
    const/16 v3, 0xe

    .line 6
    .line 7
    const-wide/16 v4, 0x78

    .line 8
    .line 9
    const v6, 0x9c41

    .line 10
    .line 11
    .line 12
    const/4 v7, 0x4

    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    :pswitch_0
    invoke-super {p0, p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    instance-of v0, p1, Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    move-object v10, p1

    .line 40
    check-cast v10, Landroid/view/View;

    .line 41
    .line 42
    :cond_0
    if-nez v10, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance p1, Ljb;

    .line 46
    .line 47
    const/16 v0, 0x17

    .line 48
    .line 49
    invoke-direct {p1, v0, v10, p0}, Ljb;-><init>(ILandroid/view/View;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v10, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void

    .line 56
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 60
    .line 61
    aget-object p0, p0, v9

    .line 62
    .line 63
    instance-of p1, p0, Landroid/content/Context;

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    check-cast p0, Landroid/content/Context;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move-object p0, v10

    .line 71
    :goto_1
    if-nez p0, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    sget-object p1, Lnh0;->α:Lnh0;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sput-object p1, Lnh0;->γ:Landroid/content/Context;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const-string p1, "appContext captured = "

    .line 87
    .line 88
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const-string p1, "rfae3094b732ade5a"

    .line 93
    .line 94
    invoke-static {p1, p0, v10, v7, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :goto_2
    return-void

    .line 98
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    :try_start_0
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 102
    .line 103
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 104
    .line 105
    if-eqz p1, :cond_4

    .line 106
    .line 107
    move-object v10, p0

    .line 108
    check-cast v10, Landroid/view/ViewGroup;

    .line 109
    .line 110
    :cond_4
    if-nez v10, :cond_5

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    sget-object p0, Lah0;->α:Landroid/os/Handler;

    .line 114
    .line 115
    const-string p0, "getAdapter"

    .line 116
    .line 117
    invoke-static {v10, p0}, Lah0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    const-string p1, "RecyclerView.setAdapter"

    .line 122
    .line 123
    invoke-static {v10, p0, p1}, Lah0;->Π(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :catchall_0
    move-exception p0

    .line 130
    new-instance p1, Leo1;

    .line 131
    .line 132
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    move-object p0, p1

    .line 136
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-eqz p0, :cond_6

    .line 141
    .line 142
    sget-object p1, Lah0;->α:Landroid/os/Handler;

    .line 143
    .line 144
    const-string p1, "lazy-set-adapter"

    .line 145
    .line 146
    invoke-static {p1, p0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    :cond_6
    :goto_4
    return-void

    .line 150
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    :try_start_1
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 154
    .line 155
    if-eqz p0, :cond_7

    .line 156
    .line 157
    invoke-static {v9, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    goto :goto_5

    .line 162
    :cond_7
    move-object p0, v10

    .line 163
    :goto_5
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 164
    .line 165
    if-eqz v0, :cond_8

    .line 166
    .line 167
    move-object v10, p0

    .line 168
    check-cast v10, Landroid/view/ViewGroup;

    .line 169
    .line 170
    :cond_8
    if-nez v10, :cond_9

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_9
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 174
    .line 175
    sget-object p1, Lah0;->α:Landroid/os/Handler;

    .line 176
    .line 177
    const-string p1, "Adapter.onAttachedToRecyclerView"

    .line 178
    .line 179
    invoke-static {v10, p0, p1}, Lah0;->Π(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :catchall_1
    move-exception p0

    .line 186
    new-instance p1, Leo1;

    .line 187
    .line 188
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    move-object p0, p1

    .line 192
    :goto_6
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    if-eqz p0, :cond_a

    .line 197
    .line 198
    sget-object p1, Lah0;->α:Landroid/os/Handler;

    .line 199
    .line 200
    const-string p1, "lazy-adapter-attached"

    .line 201
    .line 202
    invoke-static {p1, p0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    :cond_a
    :goto_7
    return-void

    .line 206
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    :try_start_2
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 210
    .line 211
    if-eqz p0, :cond_c

    .line 212
    .line 213
    invoke-static {v9, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    if-nez p0, :cond_b

    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_b
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 221
    .line 222
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 223
    .line 224
    const-string v0, "attached"

    .line 225
    .line 226
    invoke-static {p1, p0, v10, v0}, Lah0;->Β(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :catchall_2
    move-exception p0

    .line 233
    new-instance p1, Leo1;

    .line 234
    .line 235
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    move-object p0, p1

    .line 239
    :goto_8
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    if-eqz p0, :cond_c

    .line 244
    .line 245
    sget-object p1, Lah0;->α:Landroid/os/Handler;

    .line 246
    .line 247
    const-string p1, "holder-attached"

    .line 248
    .line 249
    invoke-static {p1, p0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    :cond_c
    :goto_9
    return-void

    .line 253
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    :try_start_3
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 257
    .line 258
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-static {v9, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 266
    .line 267
    if-eqz p1, :cond_d

    .line 268
    .line 269
    move-object v10, p0

    .line 270
    check-cast v10, Landroid/view/ViewGroup;

    .line 271
    .line 272
    :cond_d
    if-nez v10, :cond_e

    .line 273
    .line 274
    goto :goto_b

    .line 275
    :cond_e
    sget-object p0, Lah0;->α:Landroid/os/Handler;

    .line 276
    .line 277
    invoke-static {v10}, Lah0;->Τ(Landroid/view/ViewGroup;)V

    .line 278
    .line 279
    .line 280
    const-string p0, "target-adapter-attached"

    .line 281
    .line 282
    invoke-static {v10, p0, v8}, Lah0;->б(Landroid/view/ViewGroup;Ljava/lang/String;Z)V

    .line 283
    .line 284
    .line 285
    sget-object p0, Ls62;->α:Ls62;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 286
    .line 287
    goto :goto_a

    .line 288
    :catchall_3
    move-exception p0

    .line 289
    new-instance p1, Leo1;

    .line 290
    .line 291
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 292
    .line 293
    .line 294
    move-object p0, p1

    .line 295
    :goto_a
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    if-eqz p0, :cond_f

    .line 300
    .line 301
    sget-object p1, Lah0;->α:Landroid/os/Handler;

    .line 302
    .line 303
    const-string p1, "adapter-rv-attached"

    .line 304
    .line 305
    invoke-static {p1, p0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    :cond_f
    :goto_b
    return-void

    .line 309
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    :try_start_4
    sget-object p0, Lsg0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 313
    .line 314
    invoke-static {}, Lsg0;->α()Z

    .line 315
    .line 316
    .line 317
    move-result p0

    .line 318
    if-nez p0, :cond_10

    .line 319
    .line 320
    goto :goto_d

    .line 321
    :cond_10
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 322
    .line 323
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-static {p0}, Lsg0;->ζ(Ljava/lang/Object;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    if-nez p0, :cond_11

    .line 331
    .line 332
    goto :goto_d

    .line 333
    :cond_11
    iget-object v0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 334
    .line 335
    instance-of v1, v0, [B

    .line 336
    .line 337
    if-eqz v1, :cond_12

    .line 338
    .line 339
    move-object v10, v0

    .line 340
    check-cast v10, [B

    .line 341
    .line 342
    :cond_12
    if-eqz v10, :cond_14

    .line 343
    .line 344
    array-length v0, v10

    .line 345
    if-nez v0, :cond_13

    .line 346
    .line 347
    goto :goto_c

    .line 348
    :cond_13
    sget-object p1, Lsg0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 349
    .line 350
    array-length v0, v10

    .line 351
    invoke-static {v10, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    invoke-static {p1}, Lsg0;->η(Ljava/util/concurrent/ConcurrentHashMap;)V

    .line 359
    .line 360
    .line 361
    goto :goto_d

    .line 362
    :cond_14
    :goto_c
    sget-object v0, Lsg0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 363
    .line 364
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    check-cast p0, [B

    .line 369
    .line 370
    if-eqz p0, :cond_15

    .line 371
    .line 372
    array-length v0, p0

    .line 373
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 374
    .line 375
    .line 376
    move-result-object p0

    .line 377
    invoke-virtual {p1, p0}, Lk01;->α(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 378
    .line 379
    .line 380
    goto :goto_d

    .line 381
    :catchall_4
    move-exception p0

    .line 382
    invoke-static {p0}, Lsg0;->γ(Ljava/lang/Throwable;)V

    .line 383
    .line 384
    .line 385
    :cond_15
    :goto_d
    return-void

    .line 386
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 390
    .line 391
    :try_start_5
    sget-object v0, Lsg0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 392
    .line 393
    invoke-static {}, Lsg0;->α()Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-nez v0, :cond_16

    .line 398
    .line 399
    goto :goto_f

    .line 400
    :cond_16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-static {p0}, Lsg0;->ζ(Ljava/lang/Object;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    if-nez v0, :cond_17

    .line 408
    .line 409
    goto :goto_f

    .line 410
    :cond_17
    iget-object v1, p1, Lk01;->ε:Ljava/lang/Object;

    .line 411
    .line 412
    instance-of v2, v1, Ljava/lang/String;

    .line 413
    .line 414
    if-eqz v2, :cond_18

    .line 415
    .line 416
    move-object v10, v1

    .line 417
    check-cast v10, Ljava/lang/String;

    .line 418
    .line 419
    :cond_18
    if-eqz v10, :cond_1a

    .line 420
    .line 421
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    if-nez v1, :cond_19

    .line 426
    .line 427
    goto :goto_e

    .line 428
    :cond_19
    invoke-static {v10}, Lsg0;->β(Ljava/lang/String;)Z

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    if-nez v1, :cond_1a

    .line 433
    .line 434
    sget-object p0, Lsg0;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 435
    .line 436
    invoke-virtual {p0, v0, v10}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    invoke-static {p0}, Lsg0;->η(Ljava/util/concurrent/ConcurrentHashMap;)V

    .line 440
    .line 441
    .line 442
    goto :goto_f

    .line 443
    :cond_1a
    :goto_e
    sget-object v1, Lsg0;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 444
    .line 445
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    check-cast v0, Ljava/lang/String;

    .line 450
    .line 451
    if-eqz v0, :cond_1b

    .line 452
    .line 453
    invoke-virtual {p1, v0}, Lk01;->α(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 454
    .line 455
    .line 456
    :try_start_6
    const-string p1, "content"

    .line 457
    .line 458
    invoke-static {p1, p0, v0}, Lqe0;->ξ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 459
    .line 460
    .line 461
    goto :goto_f

    .line 462
    :catchall_5
    move-exception p0

    .line 463
    invoke-static {p0}, Lsg0;->γ(Ljava/lang/Throwable;)V

    .line 464
    .line 465
    .line 466
    :catchall_6
    :cond_1b
    :goto_f
    return-void

    .line 467
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 471
    .line 472
    :try_start_7
    sget-object v0, Lsg0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 473
    .line 474
    invoke-static {}, Lsg0;->α()Z

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    if-nez v0, :cond_1c

    .line 479
    .line 480
    goto :goto_10

    .line 481
    :cond_1c
    iget-object v0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 482
    .line 483
    instance-of v1, v0, Ljava/lang/Number;

    .line 484
    .line 485
    if-eqz v1, :cond_1d

    .line 486
    .line 487
    move-object v10, v0

    .line 488
    check-cast v10, Ljava/lang/Number;

    .line 489
    .line 490
    :cond_1d
    if-eqz v10, :cond_21

    .line 491
    .line 492
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    const/4 v1, 0x5

    .line 497
    if-eq v0, v1, :cond_1e

    .line 498
    .line 499
    goto :goto_10

    .line 500
    :cond_1e
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-static {p0}, Lsg0;->ε(Ljava/lang/Object;)I

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    if-ne v0, v6, :cond_1f

    .line 508
    .line 509
    goto :goto_10

    .line 510
    :cond_1f
    invoke-static {p0}, Lsg0;->ζ(Ljava/lang/Object;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    if-eqz p0, :cond_20

    .line 515
    .line 516
    sget-object v0, Lsg0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 517
    .line 518
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-eqz v0, :cond_20

    .line 523
    .line 524
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object p0

    .line 528
    invoke-virtual {p1, p0}, Lk01;->α(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    goto :goto_10

    .line 532
    :cond_20
    if-eqz p0, :cond_21

    .line 533
    .line 534
    sget-object p1, Lsg0;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 535
    .line 536
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 537
    .line 538
    .line 539
    move-result-wide v0

    .line 540
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    invoke-static {p1}, Lsg0;->η(Ljava/util/concurrent/ConcurrentHashMap;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 548
    .line 549
    .line 550
    goto :goto_10

    .line 551
    :catchall_7
    move-exception p0

    .line 552
    invoke-static {p0}, Lsg0;->γ(Ljava/lang/Throwable;)V

    .line 553
    .line 554
    .line 555
    :cond_21
    :goto_10
    return-void

    .line 556
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 560
    .line 561
    :try_start_8
    invoke-static {}, Lsg0;->α()Z

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    if-nez v0, :cond_22

    .line 566
    .line 567
    goto :goto_11

    .line 568
    :cond_22
    iget-object v0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 569
    .line 570
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 571
    .line 572
    if-eqz v1, :cond_23

    .line 573
    .line 574
    move-object v10, v0

    .line 575
    check-cast v10, Ljava/lang/Boolean;

    .line 576
    .line 577
    :cond_23
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 578
    .line 579
    invoke-static {v10, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    invoke-static {p0}, Lsg0;->ε(Ljava/lang/Object;)I

    .line 587
    .line 588
    .line 589
    move-result v1

    .line 590
    if-eqz v0, :cond_24

    .line 591
    .line 592
    if-eq v1, v6, :cond_24

    .line 593
    .line 594
    invoke-static {p0}, Lsg0;->δ(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    :cond_24
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 598
    .line 599
    invoke-virtual {p1, p0}, Lk01;->α(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 600
    .line 601
    .line 602
    goto :goto_11

    .line 603
    :catchall_8
    move-exception p0

    .line 604
    invoke-static {p0}, Lsg0;->γ(Ljava/lang/Throwable;)V

    .line 605
    .line 606
    .line 607
    :goto_11
    return-void

    .line 608
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    invoke-static {}, Lgf0;->α()I

    .line 612
    .line 613
    .line 614
    move-result p0

    .line 615
    int-to-float p0, p0

    .line 616
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 617
    .line 618
    .line 619
    move-result-object p0

    .line 620
    invoke-virtual {p1, p0}, Lk01;->α(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    return-void

    .line 624
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 628
    .line 629
    if-nez p0, :cond_25

    .line 630
    .line 631
    goto/16 :goto_31

    .line 632
    .line 633
    :cond_25
    invoke-static {}, Lui1;->ξ()Z

    .line 634
    .line 635
    .line 636
    move-result p1

    .line 637
    if-nez p1, :cond_26

    .line 638
    .line 639
    goto/16 :goto_31

    .line 640
    .line 641
    :cond_26
    const-string p1, "color_ring"

    .line 642
    .line 643
    invoke-static {p1}, Lui1;->ω(Ljava/lang/String;)Z

    .line 644
    .line 645
    .line 646
    move-result v0

    .line 647
    if-eqz v0, :cond_5d

    .line 648
    .line 649
    sget-object v0, Lc30;->β:Ljava/util/Set;

    .line 650
    .line 651
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-static {v1}, Lc30;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    new-instance v2, Ljava/util/ArrayList;

    .line 660
    .line 661
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    :cond_27
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    if-eqz v3, :cond_2f

    .line 673
    .line 674
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    move-object v4, v3

    .line 679
    check-cast v4, Ljava/lang/reflect/Field;

    .line 680
    .line 681
    :try_start_9
    invoke-virtual {v4, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 688
    goto :goto_13

    .line 689
    :catchall_9
    move-exception v4

    .line 690
    new-instance v5, Leo1;

    .line 691
    .line 692
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 693
    .line 694
    .line 695
    move-object v4, v5

    .line 696
    :goto_13
    instance-of v5, v4, Leo1;

    .line 697
    .line 698
    if-eqz v5, :cond_28

    .line 699
    .line 700
    move-object v4, v10

    .line 701
    :cond_28
    instance-of v5, v4, Ljava/util/List;

    .line 702
    .line 703
    if-eqz v5, :cond_29

    .line 704
    .line 705
    check-cast v4, Ljava/util/List;

    .line 706
    .line 707
    goto :goto_14

    .line 708
    :cond_29
    move-object v4, v10

    .line 709
    :goto_14
    if-nez v4, :cond_2a

    .line 710
    .line 711
    goto :goto_12

    .line 712
    :cond_2a
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 713
    .line 714
    .line 715
    move-result v5

    .line 716
    if-eqz v5, :cond_2b

    .line 717
    .line 718
    goto :goto_12

    .line 719
    :cond_2b
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 720
    .line 721
    .line 722
    move-result-object v4

    .line 723
    :cond_2c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 724
    .line 725
    .line 726
    move-result v5

    .line 727
    if-eqz v5, :cond_27

    .line 728
    .line 729
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    invoke-static {v5}, Lc30;->β(Ljava/lang/Object;)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v5

    .line 737
    if-eqz v5, :cond_2d

    .line 738
    .line 739
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v5

    .line 743
    goto :goto_15

    .line 744
    :cond_2d
    move-object v5, v10

    .line 745
    :goto_15
    sget-object v6, Lc30;->α:Ljava/util/Set;

    .line 746
    .line 747
    check-cast v6, Ljava/lang/Iterable;

    .line 748
    .line 749
    invoke-static {v6, v5}, Lxh;->Б(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v6

    .line 753
    if-nez v6, :cond_2e

    .line 754
    .line 755
    sget-object v6, Lc30;->β:Ljava/util/Set;

    .line 756
    .line 757
    check-cast v6, Ljava/lang/Iterable;

    .line 758
    .line 759
    invoke-static {v6, v5}, Lxh;->Б(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    move-result v5

    .line 763
    if-eqz v5, :cond_2c

    .line 764
    .line 765
    :cond_2e
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    goto :goto_12

    .line 769
    :cond_2f
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    :cond_30
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    const-string v3, "FeedRightControlsHide3903"

    .line 778
    .line 779
    if-eqz v2, :cond_38

    .line 780
    .line 781
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    check-cast v2, Ljava/lang/reflect/Field;

    .line 786
    .line 787
    :try_start_a
    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    invoke-static {v4}, Lh62;->к(Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    move-result v5

    .line 798
    if-eqz v5, :cond_31

    .line 799
    .line 800
    check-cast v4, Ljava/util/List;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 801
    .line 802
    goto :goto_18

    .line 803
    :catchall_a
    move-exception v4

    .line 804
    goto :goto_17

    .line 805
    :cond_31
    move-object v4, v10

    .line 806
    goto :goto_18

    .line 807
    :goto_17
    new-instance v5, Leo1;

    .line 808
    .line 809
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 810
    .line 811
    .line 812
    move-object v4, v5

    .line 813
    :goto_18
    instance-of v5, v4, Leo1;

    .line 814
    .line 815
    if-eqz v5, :cond_32

    .line 816
    .line 817
    move-object v4, v10

    .line 818
    :cond_32
    check-cast v4, Ljava/util/List;

    .line 819
    .line 820
    if-nez v4, :cond_33

    .line 821
    .line 822
    goto :goto_16

    .line 823
    :cond_33
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 824
    .line 825
    .line 826
    move-result v5

    .line 827
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 828
    .line 829
    .line 830
    move-result v6

    .line 831
    add-int/lit8 v6, v6, -0x1

    .line 832
    .line 833
    if-ltz v6, :cond_37

    .line 834
    .line 835
    :goto_19
    add-int/lit8 v11, v6, -0x1

    .line 836
    .line 837
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v12

    .line 841
    invoke-static {v12}, Lc30;->β(Ljava/lang/Object;)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v12

    .line 845
    if-eqz v12, :cond_35

    .line 846
    .line 847
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v12

    .line 851
    if-nez v12, :cond_34

    .line 852
    .line 853
    goto :goto_1a

    .line 854
    :cond_34
    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result v12

    .line 858
    if-eqz v12, :cond_35

    .line 859
    .line 860
    invoke-interface {v4, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    :cond_35
    :goto_1a
    if-gez v11, :cond_36

    .line 864
    .line 865
    goto :goto_1b

    .line 866
    :cond_36
    move v6, v11

    .line 867
    goto :goto_19

    .line 868
    :cond_37
    :goto_1b
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 869
    .line 870
    .line 871
    move-result v6

    .line 872
    if-eq v5, v6, :cond_30

    .line 873
    .line 874
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 879
    .line 880
    .line 881
    move-result v4

    .line 882
    sub-int/2addr v5, v4

    .line 883
    new-instance v4, Ljava/lang/StringBuilder;

    .line 884
    .line 885
    const-string v6, "\u5df2\u79fb\u9664 3903 \u5934\u50cf\u6269\u5c55 "

    .line 886
    .line 887
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    const-string v6, ", field="

    .line 894
    .line 895
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    const-string v2, ", removed="

    .line 902
    .line 903
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 907
    .line 908
    .line 909
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    invoke-static {v3, v2, v10, v7, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 914
    .line 915
    .line 916
    goto/16 :goto_16

    .line 917
    .line 918
    :cond_38
    sget-object v0, Lc30;->α:Ljava/util/Set;

    .line 919
    .line 920
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    invoke-static {v0}, Lc30;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    new-instance v1, Ljava/util/ArrayList;

    .line 929
    .line 930
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    :cond_39
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 938
    .line 939
    .line 940
    move-result v2

    .line 941
    if-eqz v2, :cond_42

    .line 942
    .line 943
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    check-cast v2, Ljava/lang/reflect/Field;

    .line 948
    .line 949
    :try_start_b
    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 956
    goto :goto_1d

    .line 957
    :catchall_b
    move-exception v4

    .line 958
    new-instance v5, Leo1;

    .line 959
    .line 960
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 961
    .line 962
    .line 963
    move-object v4, v5

    .line 964
    :goto_1d
    instance-of v5, v4, Leo1;

    .line 965
    .line 966
    if-eqz v5, :cond_3a

    .line 967
    .line 968
    move-object v4, v10

    .line 969
    :cond_3a
    instance-of v5, v4, Ljava/util/List;

    .line 970
    .line 971
    if-eqz v5, :cond_3b

    .line 972
    .line 973
    check-cast v4, Ljava/util/List;

    .line 974
    .line 975
    goto :goto_1e

    .line 976
    :cond_3b
    move-object v4, v10

    .line 977
    :goto_1e
    if-nez v4, :cond_3d

    .line 978
    .line 979
    :cond_3c
    move-object v5, v10

    .line 980
    goto :goto_21

    .line 981
    :cond_3d
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 982
    .line 983
    .line 984
    move-result v5

    .line 985
    if-eqz v5, :cond_3e

    .line 986
    .line 987
    move v5, v9

    .line 988
    goto :goto_20

    .line 989
    :cond_3e
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 990
    .line 991
    .line 992
    move-result-object v4

    .line 993
    move v5, v9

    .line 994
    :cond_3f
    :goto_1f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 995
    .line 996
    .line 997
    move-result v6

    .line 998
    if-eqz v6, :cond_41

    .line 999
    .line 1000
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v6

    .line 1004
    if-eqz v6, :cond_3f

    .line 1005
    .line 1006
    sget-object v11, Lc30;->α:Ljava/util/Set;

    .line 1007
    .line 1008
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v6

    .line 1012
    invoke-static {v6}, Lc30;->ε(Ljava/lang/Class;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v6

    .line 1016
    if-eqz v6, :cond_3f

    .line 1017
    .line 1018
    add-int/lit8 v5, v5, 0x1

    .line 1019
    .line 1020
    if-ltz v5, :cond_40

    .line 1021
    .line 1022
    goto :goto_1f

    .line 1023
    :cond_40
    invoke-static {}, Lyh;->ф()V

    .line 1024
    .line 1025
    .line 1026
    throw v10

    .line 1027
    :cond_41
    :goto_20
    if-lez v5, :cond_3c

    .line 1028
    .line 1029
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v4

    .line 1033
    new-instance v5, Ll91;

    .line 1034
    .line 1035
    invoke-direct {v5, v2, v4}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1036
    .line 1037
    .line 1038
    :goto_21
    if-eqz v5, :cond_39

    .line 1039
    .line 1040
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    goto :goto_1c

    .line 1044
    :cond_42
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v1

    .line 1052
    if-nez v1, :cond_43

    .line 1053
    .line 1054
    move-object v1, v10

    .line 1055
    goto :goto_22

    .line 1056
    :cond_43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1061
    .line 1062
    .line 1063
    move-result v2

    .line 1064
    if-nez v2, :cond_44

    .line 1065
    .line 1066
    goto :goto_22

    .line 1067
    :cond_44
    move-object v2, v1

    .line 1068
    check-cast v2, Ll91;

    .line 1069
    .line 1070
    iget-object v2, v2, Ll91;->ζ:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast v2, Ljava/lang/Number;

    .line 1073
    .line 1074
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1075
    .line 1076
    .line 1077
    move-result v2

    .line 1078
    :cond_45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v4

    .line 1082
    move-object v5, v4

    .line 1083
    check-cast v5, Ll91;

    .line 1084
    .line 1085
    iget-object v5, v5, Ll91;->ζ:Ljava/lang/Object;

    .line 1086
    .line 1087
    check-cast v5, Ljava/lang/Number;

    .line 1088
    .line 1089
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1090
    .line 1091
    .line 1092
    move-result v5

    .line 1093
    if-ge v2, v5, :cond_46

    .line 1094
    .line 1095
    move-object v1, v4

    .line 1096
    move v2, v5

    .line 1097
    :cond_46
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1098
    .line 1099
    .line 1100
    move-result v4

    .line 1101
    if-nez v4, :cond_45

    .line 1102
    .line 1103
    :goto_22
    check-cast v1, Ll91;

    .line 1104
    .line 1105
    if-eqz v1, :cond_47

    .line 1106
    .line 1107
    iget-object v0, v1, Ll91;->ε:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v0, Ljava/lang/reflect/Field;

    .line 1110
    .line 1111
    goto :goto_23

    .line 1112
    :cond_47
    move-object v0, v10

    .line 1113
    :goto_23
    if-nez v0, :cond_48

    .line 1114
    .line 1115
    goto/16 :goto_31

    .line 1116
    .line 1117
    :cond_48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v1

    .line 1121
    invoke-static {v1}, Lc30;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v1

    .line 1125
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v1

    .line 1129
    :cond_49
    :goto_24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1130
    .line 1131
    .line 1132
    move-result v2

    .line 1133
    if-eqz v2, :cond_4f

    .line 1134
    .line 1135
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v2

    .line 1139
    move-object v4, v2

    .line 1140
    check-cast v4, Ljava/lang/reflect/Field;

    .line 1141
    .line 1142
    :try_start_c
    invoke-virtual {v4, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1149
    goto :goto_25

    .line 1150
    :catchall_c
    move-exception v4

    .line 1151
    new-instance v5, Leo1;

    .line 1152
    .line 1153
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1154
    .line 1155
    .line 1156
    move-object v4, v5

    .line 1157
    :goto_25
    instance-of v5, v4, Leo1;

    .line 1158
    .line 1159
    if-eqz v5, :cond_4a

    .line 1160
    .line 1161
    move-object v4, v10

    .line 1162
    :cond_4a
    instance-of v5, v4, Ljava/util/List;

    .line 1163
    .line 1164
    if-eqz v5, :cond_4b

    .line 1165
    .line 1166
    check-cast v4, Ljava/util/List;

    .line 1167
    .line 1168
    goto :goto_26

    .line 1169
    :cond_4b
    move-object v4, v10

    .line 1170
    :goto_26
    if-nez v4, :cond_4c

    .line 1171
    .line 1172
    goto :goto_24

    .line 1173
    :cond_4c
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 1174
    .line 1175
    .line 1176
    move-result v5

    .line 1177
    if-nez v5, :cond_49

    .line 1178
    .line 1179
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 1180
    .line 1181
    .line 1182
    move-result v5

    .line 1183
    if-eqz v5, :cond_4d

    .line 1184
    .line 1185
    goto :goto_27

    .line 1186
    :cond_4d
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v4

    .line 1190
    :cond_4e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1191
    .line 1192
    .line 1193
    move-result v5

    .line 1194
    if-eqz v5, :cond_50

    .line 1195
    .line 1196
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v5

    .line 1200
    instance-of v5, v5, Ljava/lang/Integer;

    .line 1201
    .line 1202
    if-nez v5, :cond_4e

    .line 1203
    .line 1204
    goto :goto_24

    .line 1205
    :cond_4f
    move-object v2, v10

    .line 1206
    :cond_50
    :goto_27
    check-cast v2, Ljava/lang/reflect/Field;

    .line 1207
    .line 1208
    :try_start_d
    invoke-virtual {v0, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v0

    .line 1215
    invoke-static {v0}, Lh62;->к(Ljava/lang/Object;)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v1

    .line 1219
    if-eqz v1, :cond_51

    .line 1220
    .line 1221
    check-cast v0, Ljava/util/List;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 1222
    .line 1223
    goto :goto_29

    .line 1224
    :catchall_d
    move-exception v0

    .line 1225
    goto :goto_28

    .line 1226
    :cond_51
    move-object v0, v10

    .line 1227
    goto :goto_29

    .line 1228
    :goto_28
    new-instance v1, Leo1;

    .line 1229
    .line 1230
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1231
    .line 1232
    .line 1233
    move-object v0, v1

    .line 1234
    :goto_29
    instance-of v1, v0, Leo1;

    .line 1235
    .line 1236
    if-eqz v1, :cond_52

    .line 1237
    .line 1238
    move-object v0, v10

    .line 1239
    :cond_52
    check-cast v0, Ljava/util/List;

    .line 1240
    .line 1241
    if-nez v0, :cond_53

    .line 1242
    .line 1243
    goto/16 :goto_31

    .line 1244
    .line 1245
    :cond_53
    if-eqz v2, :cond_54

    .line 1246
    .line 1247
    :try_start_e
    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1248
    .line 1249
    .line 1250
    goto :goto_2a

    .line 1251
    :catchall_e
    move-exception p0

    .line 1252
    goto :goto_2c

    .line 1253
    :cond_54
    :goto_2a
    if-eqz v2, :cond_55

    .line 1254
    .line 1255
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    move-result-object p0

    .line 1259
    goto :goto_2b

    .line 1260
    :cond_55
    move-object p0, v10

    .line 1261
    :goto_2b
    invoke-static {p0}, Lh62;->к(Ljava/lang/Object;)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v1

    .line 1265
    if-eqz v1, :cond_56

    .line 1266
    .line 1267
    check-cast p0, Ljava/util/List;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 1268
    .line 1269
    goto :goto_2d

    .line 1270
    :cond_56
    move-object p0, v10

    .line 1271
    goto :goto_2d

    .line 1272
    :goto_2c
    new-instance v1, Leo1;

    .line 1273
    .line 1274
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1275
    .line 1276
    .line 1277
    move-object p0, v1

    .line 1278
    :goto_2d
    instance-of v1, p0, Leo1;

    .line 1279
    .line 1280
    if-eqz v1, :cond_57

    .line 1281
    .line 1282
    move-object p0, v10

    .line 1283
    :cond_57
    check-cast p0, Ljava/util/List;

    .line 1284
    .line 1285
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1286
    .line 1287
    .line 1288
    move-result v1

    .line 1289
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 1290
    .line 1291
    .line 1292
    move-result v2

    .line 1293
    add-int/lit8 v2, v2, -0x1

    .line 1294
    .line 1295
    if-ltz v2, :cond_5c

    .line 1296
    .line 1297
    :goto_2e
    add-int/lit8 v4, v2, -0x1

    .line 1298
    .line 1299
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v5

    .line 1303
    if-nez v5, :cond_58

    .line 1304
    .line 1305
    goto :goto_2f

    .line 1306
    :cond_58
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v5

    .line 1310
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v5

    .line 1314
    invoke-static {p1}, Lui1;->ω(Ljava/lang/String;)Z

    .line 1315
    .line 1316
    .line 1317
    move-result v6

    .line 1318
    if-eqz v6, :cond_5a

    .line 1319
    .line 1320
    const-string v6, "ColorRing"

    .line 1321
    .line 1322
    invoke-static {v5, v6, v8}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1323
    .line 1324
    .line 1325
    move-result v6

    .line 1326
    if-nez v6, :cond_59

    .line 1327
    .line 1328
    const-string v6, "Story"

    .line 1329
    .line 1330
    invoke-static {v5, v6, v8}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v6

    .line 1334
    if-nez v6, :cond_59

    .line 1335
    .line 1336
    const-string v6, "AvatarRing"

    .line 1337
    .line 1338
    invoke-static {v5, v6, v8}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1339
    .line 1340
    .line 1341
    move-result v5

    .line 1342
    if-eqz v5, :cond_5a

    .line 1343
    .line 1344
    :cond_59
    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1345
    .line 1346
    .line 1347
    if-eqz p0, :cond_5a

    .line 1348
    .line 1349
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 1350
    .line 1351
    .line 1352
    move-result v5

    .line 1353
    if-ge v2, v5, :cond_5a

    .line 1354
    .line 1355
    invoke-interface {p0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    :cond_5a
    :goto_2f
    if-gez v4, :cond_5b

    .line 1359
    .line 1360
    goto :goto_30

    .line 1361
    :cond_5b
    move v2, v4

    .line 1362
    goto :goto_2e

    .line 1363
    :cond_5c
    :goto_30
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1364
    .line 1365
    .line 1366
    move-result p0

    .line 1367
    if-eq v1, p0, :cond_5d

    .line 1368
    .line 1369
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1370
    .line 1371
    .line 1372
    move-result p0

    .line 1373
    sub-int/2addr v1, p0

    .line 1374
    const-string p0, "\u5df2\u79fb\u9664 3903 \u5934\u50cf\u5df2\u6ce8\u518c Presenter removed="

    .line 1375
    .line 1376
    invoke-static {p0, v1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object p0

    .line 1380
    invoke-static {v3, p0, v10, v7, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1381
    .line 1382
    .line 1383
    :cond_5d
    :goto_31
    return-void

    .line 1384
    :pswitch_d
    sget-object p0, Lz20;->α:Lz20;

    .line 1385
    .line 1386
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1387
    .line 1388
    .line 1389
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1390
    .line 1391
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 1392
    .line 1393
    if-eqz p1, :cond_5e

    .line 1394
    .line 1395
    move-object v10, p0

    .line 1396
    check-cast v10, Landroid/view/ViewGroup;

    .line 1397
    .line 1398
    :cond_5e
    if-nez v10, :cond_5f

    .line 1399
    .line 1400
    goto :goto_32

    .line 1401
    :cond_5f
    const-string p0, "onLayout"

    .line 1402
    .line 1403
    invoke-static {v10, p0}, Lz20;->ν(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1407
    .line 1408
    .line 1409
    move-result-object p0

    .line 1410
    invoke-static {p0}, Lz20;->ρ(Landroid/content/Context;)Landroid/app/Activity;

    .line 1411
    .line 1412
    .line 1413
    move-result-object p0

    .line 1414
    if-nez p0, :cond_60

    .line 1415
    .line 1416
    goto :goto_32

    .line 1417
    :cond_60
    invoke-static {v10}, Lz20;->ο(Landroid/view/ViewGroup;)Ljava/lang/Object;

    .line 1418
    .line 1419
    .line 1420
    move-result-object p1

    .line 1421
    if-nez p1, :cond_61

    .line 1422
    .line 1423
    goto :goto_32

    .line 1424
    :cond_61
    sget-object v0, Lz20;->θ:Ljava/util/Map;

    .line 1425
    .line 1426
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 1430
    .line 1431
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1432
    .line 1433
    .line 1434
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    :goto_32
    return-void

    .line 1438
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1439
    .line 1440
    .line 1441
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1442
    .line 1443
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 1444
    .line 1445
    if-eqz p1, :cond_62

    .line 1446
    .line 1447
    move-object v10, p0

    .line 1448
    check-cast v10, Landroid/view/ViewGroup;

    .line 1449
    .line 1450
    :cond_62
    if-nez v10, :cond_63

    .line 1451
    .line 1452
    goto :goto_33

    .line 1453
    :cond_63
    sget-object p0, Lz20;->α:Lz20;

    .line 1454
    .line 1455
    const-string p0, "onAttachedToWindow"

    .line 1456
    .line 1457
    invoke-static {v10, p0}, Lz20;->α(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 1458
    .line 1459
    .line 1460
    :goto_33
    return-void

    .line 1461
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1462
    .line 1463
    .line 1464
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1465
    .line 1466
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 1467
    .line 1468
    if-eqz p1, :cond_64

    .line 1469
    .line 1470
    move-object v10, p0

    .line 1471
    check-cast v10, Landroid/view/ViewGroup;

    .line 1472
    .line 1473
    :cond_64
    if-nez v10, :cond_65

    .line 1474
    .line 1475
    goto :goto_34

    .line 1476
    :cond_65
    sget-object p0, Lz20;->α:Lz20;

    .line 1477
    .line 1478
    const-string p0, "constructor"

    .line 1479
    .line 1480
    invoke-static {v10, p0}, Lz20;->α(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 1481
    .line 1482
    .line 1483
    :goto_34
    return-void

    .line 1484
    :pswitch_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1485
    .line 1486
    .line 1487
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1488
    .line 1489
    instance-of v0, p0, Landroid/app/Activity;

    .line 1490
    .line 1491
    if-eqz v0, :cond_66

    .line 1492
    .line 1493
    check-cast p0, Landroid/app/Activity;

    .line 1494
    .line 1495
    goto :goto_35

    .line 1496
    :cond_66
    move-object p0, v10

    .line 1497
    :goto_35
    if-nez p0, :cond_67

    .line 1498
    .line 1499
    goto :goto_36

    .line 1500
    :cond_67
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 1501
    .line 1502
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1503
    .line 1504
    .line 1505
    invoke-static {v9, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1506
    .line 1507
    .line 1508
    move-result-object p1

    .line 1509
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 1510
    .line 1511
    if-eqz v0, :cond_68

    .line 1512
    .line 1513
    move-object v10, p1

    .line 1514
    check-cast v10, Ljava/lang/Boolean;

    .line 1515
    .line 1516
    :cond_68
    if-eqz v10, :cond_69

    .line 1517
    .line 1518
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1519
    .line 1520
    .line 1521
    move-result v9

    .line 1522
    :cond_69
    if-eqz v9, :cond_6b

    .line 1523
    .line 1524
    invoke-static {p0, v4, v5, v8}, Lcom/example/dyhelper/hook/γ;->в(Landroid/app/Activity;JZ)V

    .line 1525
    .line 1526
    .line 1527
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1528
    .line 1529
    .line 1530
    move-result-object p1

    .line 1531
    if-eqz p1, :cond_6b

    .line 1532
    .line 1533
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1534
    .line 1535
    .line 1536
    move-result-object p1

    .line 1537
    if-nez p1, :cond_6a

    .line 1538
    .line 1539
    goto :goto_36

    .line 1540
    :cond_6a
    new-instance v0, Ln9;

    .line 1541
    .line 1542
    invoke-direct {v0, p0, v3}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1546
    .line 1547
    .line 1548
    :cond_6b
    :goto_36
    return-void

    .line 1549
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1550
    .line 1551
    .line 1552
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1553
    .line 1554
    instance-of p1, p0, Landroid/app/Activity;

    .line 1555
    .line 1556
    if-eqz p1, :cond_6c

    .line 1557
    .line 1558
    move-object v10, p0

    .line 1559
    check-cast v10, Landroid/app/Activity;

    .line 1560
    .line 1561
    :cond_6c
    if-nez v10, :cond_6d

    .line 1562
    .line 1563
    goto :goto_37

    .line 1564
    :cond_6d
    invoke-static {v10, v4, v5, v8}, Lcom/example/dyhelper/hook/γ;->в(Landroid/app/Activity;JZ)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v10}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1568
    .line 1569
    .line 1570
    move-result-object p0

    .line 1571
    if-eqz p0, :cond_6f

    .line 1572
    .line 1573
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1574
    .line 1575
    .line 1576
    move-result-object p0

    .line 1577
    if-nez p0, :cond_6e

    .line 1578
    .line 1579
    goto :goto_37

    .line 1580
    :cond_6e
    new-instance p1, Ln9;

    .line 1581
    .line 1582
    invoke-direct {p1, v10, v3}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {p0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1586
    .line 1587
    .line 1588
    :cond_6f
    :goto_37
    return-void

    .line 1589
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_11
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lf10;->α:I

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/16 v4, 0xb

    .line 10
    .line 11
    const/4 v5, 0x4

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    sparse-switch v2, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-super/range {p0 .. p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v0, Lpj0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-static {}, Lpj0;->β()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object v0, Lpj0;->β:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/16 v2, 0x14

    .line 41
    .line 42
    if-le v0, v2, :cond_1

    .line 43
    .line 44
    rem-int/lit8 v2, v0, 0x32

    .line 45
    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    :cond_1
    const-string v2, "DYHelper"

    .line 49
    .line 50
    const-string v3, "\u52ff\u6270\u6a21\u5f0f\u62e6\u622a\u6d88\u606fTab\u89d2\u6807\u5237\u65b0 LJIIL #"

    .line 51
    .line 52
    invoke-static {v3, v0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v2, v0, v8, v5, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-static {}, Lpj0;->α()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v8}, Lk01;->α(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    return-void

    .line 66
    :sswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    :try_start_0
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    invoke-static {v7, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    sget-object v1, Lah0;->α:Landroid/os/Handler;

    .line 81
    .line 82
    invoke-static {v0}, Lah0;->φ(Ljava/lang/Object;)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-nez v0, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    invoke-static {v0, v6, v6}, Lah0;->ζ(Landroid/view/View;ZZ)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    new-instance v1, Leo1;

    .line 97
    .line 98
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    move-object v0, v1

    .line 102
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    sget-object v1, Lah0;->α:Landroid/os/Handler;

    .line 109
    .line 110
    const-string v1, "holder-detached"

    .line 111
    .line 112
    invoke-static {v1, v0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    :goto_2
    return-void

    .line 116
    :sswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    :try_start_1
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 120
    .line 121
    if-eqz v0, :cond_8

    .line 122
    .line 123
    invoke-static {v7, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-nez v0, :cond_6

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_6
    sget-object v1, Lah0;->α:Landroid/os/Handler;

    .line 131
    .line 132
    invoke-static {v0}, Lah0;->φ(Ljava/lang/Object;)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-nez v0, :cond_7

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_7
    invoke-static {v0, v6, v7}, Lah0;->ζ(Landroid/view/View;ZZ)V

    .line 140
    .line 141
    .line 142
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :catchall_1
    move-exception v0

    .line 146
    new-instance v1, Leo1;

    .line 147
    .line 148
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    move-object v0, v1

    .line 152
    :goto_3
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-eqz v0, :cond_8

    .line 157
    .line 158
    sget-object v1, Lah0;->α:Landroid/os/Handler;

    .line 159
    .line 160
    const-string v1, "holder-recycled"

    .line 161
    .line 162
    invoke-static {v1, v0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    :cond_8
    :goto_4
    return-void

    .line 166
    :sswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 170
    .line 171
    :try_start_2
    sget-object v2, Lsg0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 172
    .line 173
    invoke-static {}, Lsg0;->α()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-nez v2, :cond_9

    .line 178
    .line 179
    goto/16 :goto_8

    .line 180
    .line 181
    :cond_9
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 182
    .line 183
    if-nez v1, :cond_a

    .line 184
    .line 185
    goto/16 :goto_8

    .line 186
    .line 187
    :cond_a
    invoke-static {v1}, Lsg0;->ζ(Ljava/lang/Object;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    if-nez v2, :cond_b

    .line 192
    .line 193
    goto/16 :goto_8

    .line 194
    .line 195
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    array-length v3, v0

    .line 199
    if-nez v3, :cond_d

    .line 200
    .line 201
    :cond_c
    move-object v3, v8

    .line 202
    goto :goto_5

    .line 203
    :cond_d
    aget-object v3, v0, v7

    .line 204
    .line 205
    instance-of v4, v3, Ljava/lang/String;

    .line 206
    .line 207
    if-eqz v4, :cond_c

    .line 208
    .line 209
    check-cast v3, Ljava/lang/String;

    .line 210
    .line 211
    :goto_5
    if-eqz v3, :cond_f

    .line 212
    .line 213
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-nez v4, :cond_e

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_e
    invoke-static {v3}, Lsg0;->β(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-nez v4, :cond_f

    .line 225
    .line 226
    sget-object v0, Lsg0;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 227
    .line 228
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    invoke-static {v0}, Lsg0;->η(Ljava/util/concurrent/ConcurrentHashMap;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 232
    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_f
    :goto_6
    :try_start_3
    const-string v4, "content"

    .line 236
    .line 237
    invoke-static {v1, v4}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    instance-of v4, v1, Ljava/lang/String;

    .line 242
    .line 243
    if-eqz v4, :cond_10

    .line 244
    .line 245
    check-cast v1, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 246
    .line 247
    move-object v8, v1

    .line 248
    :catchall_2
    :cond_10
    if-eqz v8, :cond_12

    .line 249
    .line 250
    :try_start_4
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-nez v1, :cond_11

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_11
    sget-object v1, Lsg0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 258
    .line 259
    invoke-static {v8}, Lsg0;->β(Ljava/lang/String;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-nez v1, :cond_12

    .line 264
    .line 265
    sget-object v1, Lsg0;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 266
    .line 267
    invoke-virtual {v1, v2, v8}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    invoke-static {v1}, Lsg0;->η(Ljava/util/concurrent/ConcurrentHashMap;)V

    .line 271
    .line 272
    .line 273
    :cond_12
    :goto_7
    sget-object v1, Lsg0;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 274
    .line 275
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v3}, Lsg0;->β(Ljava/lang/String;)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-eqz v2, :cond_13

    .line 286
    .line 287
    if-eqz v1, :cond_13

    .line 288
    .line 289
    aput-object v1, v0, v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 290
    .line 291
    goto :goto_8

    .line 292
    :catchall_3
    move-exception v0

    .line 293
    invoke-static {v0}, Lsg0;->γ(Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    :cond_13
    :goto_8
    return-void

    .line 297
    :sswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    sget-object v0, Le30;->δ:Ljava/lang/ThreadLocal;

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 307
    .line 308
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_14

    .line 313
    .line 314
    goto/16 :goto_e

    .line 315
    .line 316
    :cond_14
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 317
    .line 318
    instance-of v2, v0, Landroid/app/Activity;

    .line 319
    .line 320
    if-eqz v2, :cond_15

    .line 321
    .line 322
    check-cast v0, Landroid/app/Activity;

    .line 323
    .line 324
    move-object v2, v0

    .line 325
    goto :goto_9

    .line 326
    :cond_15
    move-object v2, v8

    .line 327
    :goto_9
    if-nez v2, :cond_16

    .line 328
    .line 329
    goto/16 :goto_e

    .line 330
    .line 331
    :cond_16
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 332
    .line 333
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-static {v7, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    instance-of v3, v0, Landroid/view/MotionEvent;

    .line 341
    .line 342
    if-eqz v3, :cond_17

    .line 343
    .line 344
    check-cast v0, Landroid/view/MotionEvent;

    .line 345
    .line 346
    move-object v3, v0

    .line 347
    goto :goto_a

    .line 348
    :cond_17
    move-object v3, v8

    .line 349
    :goto_a
    if-nez v3, :cond_18

    .line 350
    .line 351
    goto/16 :goto_e

    .line 352
    .line 353
    :cond_18
    sget-object v0, Le30;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    if-eqz v4, :cond_19

    .line 360
    .line 361
    goto/16 :goto_d

    .line 362
    .line 363
    :cond_19
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 364
    .line 365
    .line 366
    move-result-wide v9

    .line 367
    sget-object v4, Le30;->ε:Ljava/lang/Object;

    .line 368
    .line 369
    monitor-enter v4

    .line 370
    :try_start_5
    sget-object v11, Le30;->ζ:Landroid/view/MotionEvent;

    .line 371
    .line 372
    if-ne v11, v3, :cond_1a

    .line 373
    .line 374
    sget v11, Le30;->η:I

    .line 375
    .line 376
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 377
    .line 378
    .line 379
    move-result v12

    .line 380
    if-ne v11, v12, :cond_1a

    .line 381
    .line 382
    sget-wide v11, Le30;->θ:J

    .line 383
    .line 384
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getEventTime()J

    .line 385
    .line 386
    .line 387
    move-result-wide v13

    .line 388
    cmp-long v11, v11, v13

    .line 389
    .line 390
    if-nez v11, :cond_1a

    .line 391
    .line 392
    sget-wide v11, Le30;->ι:J

    .line 393
    .line 394
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getDownTime()J

    .line 395
    .line 396
    .line 397
    move-result-wide v13

    .line 398
    cmp-long v11, v11, v13

    .line 399
    .line 400
    if-nez v11, :cond_1a

    .line 401
    .line 402
    sget-wide v11, Le30;->κ:J

    .line 403
    .line 404
    sub-long v11, v9, v11

    .line 405
    .line 406
    const-wide/16 v13, 0x3e8

    .line 407
    .line 408
    cmp-long v11, v11, v13

    .line 409
    .line 410
    if-gez v11, :cond_1a

    .line 411
    .line 412
    move v11, v6

    .line 413
    goto :goto_b

    .line 414
    :catchall_4
    move-exception v0

    .line 415
    goto :goto_f

    .line 416
    :cond_1a
    move v11, v7

    .line 417
    :goto_b
    if-nez v11, :cond_1b

    .line 418
    .line 419
    sput-object v3, Le30;->ζ:Landroid/view/MotionEvent;

    .line 420
    .line 421
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 422
    .line 423
    .line 424
    move-result v12

    .line 425
    sput v12, Le30;->η:I

    .line 426
    .line 427
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getEventTime()J

    .line 428
    .line 429
    .line 430
    move-result-wide v12

    .line 431
    sput-wide v12, Le30;->θ:J

    .line 432
    .line 433
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getDownTime()J

    .line 434
    .line 435
    .line 436
    move-result-wide v12

    .line 437
    sput-wide v12, Le30;->ι:J

    .line 438
    .line 439
    sput-wide v9, Le30;->κ:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 440
    .line 441
    :cond_1b
    monitor-exit v4

    .line 442
    if-eqz v11, :cond_1c

    .line 443
    .line 444
    goto :goto_d

    .line 445
    :cond_1c
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    :cond_1d
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-eqz v0, :cond_1e

    .line 454
    .line 455
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    move-object v9, v0

    .line 460
    check-cast v9, Ld30;

    .line 461
    .line 462
    :try_start_6
    invoke-interface {v9, v2, v3}, Ld30;->γ(Landroid/app/Activity;Landroid/view/MotionEvent;)Z

    .line 463
    .line 464
    .line 465
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 466
    if-eqz v0, :cond_1d

    .line 467
    .line 468
    move v7, v6

    .line 469
    goto :goto_c

    .line 470
    :catchall_5
    move-exception v0

    .line 471
    const-string v10, "FeedTouchEventDispatcher"

    .line 472
    .line 473
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    move-result-object v9

    .line 477
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v9

    .line 481
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    const-string v11, "listener \u5206\u53d1\u5f02\u5e38: "

    .line 486
    .line 487
    const-string v12, ", "

    .line 488
    .line 489
    invoke-static {v11, v9, v12, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-static {v10, v0, v8, v5, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    goto :goto_c

    .line 497
    :cond_1e
    :goto_d
    if-eqz v7, :cond_1f

    .line 498
    .line 499
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 500
    .line 501
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    :cond_1f
    :goto_e
    return-void

    .line 505
    :goto_f
    monitor-exit v4

    .line 506
    throw v0

    .line 507
    :sswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-static {v7, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    instance-of v2, v1, Ljava/lang/Integer;

    .line 520
    .line 521
    if-eqz v2, :cond_20

    .line 522
    .line 523
    move-object v8, v1

    .line 524
    check-cast v8, Ljava/lang/Integer;

    .line 525
    .line 526
    :cond_20
    if-eqz v8, :cond_23

    .line 527
    .line 528
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    if-ne v1, v4, :cond_23

    .line 533
    .line 534
    sget-object v1, Lq20;->α:Ljava/util/Set;

    .line 535
    .line 536
    sget-boolean v1, Lkn0;->θ:Z

    .line 537
    .line 538
    if-eqz v1, :cond_22

    .line 539
    .line 540
    sget v1, Lkn0;->ι:I

    .line 541
    .line 542
    if-gtz v1, :cond_21

    .line 543
    .line 544
    goto :goto_10

    .line 545
    :cond_21
    sget v1, Lkn0;->ι:I

    .line 546
    .line 547
    invoke-static {v1, v6, v3}, Lj81;->μ(III)I

    .line 548
    .line 549
    .line 550
    move-result v7

    .line 551
    :cond_22
    :goto_10
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    aput-object v1, v0, v6

    .line 556
    .line 557
    const-string v0, "force_tt_parallel"

    .line 558
    .line 559
    new-instance v2, Ljava/lang/StringBuilder;

    .line 560
    .line 561
    const-string v3, "force TTVideoEngine.setIntValue(11, "

    .line 562
    .line 563
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    const-string v1, ")"

    .line 570
    .line 571
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-static {v0, v1}, Lq20;->λ(Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    :cond_23
    return-void

    .line 582
    :sswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 586
    .line 587
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-static {v7, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    instance-of v2, v1, Ljava/lang/Integer;

    .line 595
    .line 596
    if-eqz v2, :cond_24

    .line 597
    .line 598
    move-object v8, v1

    .line 599
    check-cast v8, Ljava/lang/Integer;

    .line 600
    .line 601
    :cond_24
    if-eqz v8, :cond_27

    .line 602
    .line 603
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    if-ne v1, v4, :cond_27

    .line 608
    .line 609
    sget-object v1, Lq20;->α:Ljava/util/Set;

    .line 610
    .line 611
    sget-boolean v1, Lkn0;->θ:Z

    .line 612
    .line 613
    if-eqz v1, :cond_26

    .line 614
    .line 615
    sget v1, Lkn0;->ι:I

    .line 616
    .line 617
    if-gtz v1, :cond_25

    .line 618
    .line 619
    goto :goto_11

    .line 620
    :cond_25
    sget v1, Lkn0;->ι:I

    .line 621
    .line 622
    invoke-static {v1, v6, v3}, Lj81;->μ(III)I

    .line 623
    .line 624
    .line 625
    move-result v7

    .line 626
    :cond_26
    :goto_11
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    aput-object v1, v0, v6

    .line 631
    .line 632
    const-string v0, "force_loader_parallel"

    .line 633
    .line 634
    new-instance v2, Ljava/lang/StringBuilder;

    .line 635
    .line 636
    const-string v3, "force DataLoaderHelper.setInt(11, "

    .line 637
    .line 638
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    const-string v1, ")"

    .line 645
    .line 646
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    invoke-static {v0, v1}, Lq20;->λ(Ljava/lang/String;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    :cond_27
    return-void

    .line 657
    :sswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    sget-boolean v0, Lkn0;->θ:Z

    .line 661
    .line 662
    if-eqz v0, :cond_28

    .line 663
    .line 664
    sget v0, Lkn0;->ι:I

    .line 665
    .line 666
    if-gtz v0, :cond_29

    .line 667
    .line 668
    :cond_28
    invoke-virtual {v1, v8}, Lk01;->α(Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    sget-object v0, Lq20;->α:Ljava/util/Set;

    .line 672
    .line 673
    const-string v0, "skip adapter preloadTypeConfig"

    .line 674
    .line 675
    invoke-static {v0}, Lq20;->κ(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    :cond_29
    return-void

    .line 679
    :sswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    sget-boolean v0, Lkn0;->θ:Z

    .line 683
    .line 684
    if-eqz v0, :cond_2a

    .line 685
    .line 686
    sget v0, Lkn0;->ι:I

    .line 687
    .line 688
    if-gtz v0, :cond_2b

    .line 689
    .line 690
    :cond_2a
    invoke-virtual {v1, v8}, Lk01;->α(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    sget-object v0, Lq20;->α:Ljava/util/Set;

    .line 694
    .line 695
    const-string v0, "skip adapter prefetchItemView"

    .line 696
    .line 697
    invoke-static {v0}, Lq20;->κ(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    :cond_2b
    return-void

    .line 701
    :sswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    sget-boolean v0, Lkn0;->θ:Z

    .line 705
    .line 706
    if-eqz v0, :cond_2c

    .line 707
    .line 708
    sget v0, Lkn0;->ι:I

    .line 709
    .line 710
    if-gtz v0, :cond_2d

    .line 711
    .line 712
    :cond_2c
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 713
    .line 714
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    sget-object v0, Lq20;->α:Ljava/util/Set;

    .line 718
    .line 719
    const-string v0, "skip adapter preloadViewHolder"

    .line 720
    .line 721
    invoke-static {v0}, Lq20;->κ(Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    :cond_2d
    return-void

    .line 725
    :sswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 729
    .line 730
    instance-of v2, v0, Landroid/view/View;

    .line 731
    .line 732
    if-eqz v2, :cond_2e

    .line 733
    .line 734
    check-cast v0, Landroid/view/View;

    .line 735
    .line 736
    goto :goto_12

    .line 737
    :cond_2e
    move-object v0, v8

    .line 738
    :goto_12
    if-nez v0, :cond_2f

    .line 739
    .line 740
    goto :goto_13

    .line 741
    :cond_2f
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 742
    .line 743
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 744
    .line 745
    .line 746
    invoke-static {v7, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    instance-of v2, v1, Landroid/view/MotionEvent;

    .line 751
    .line 752
    if-eqz v2, :cond_30

    .line 753
    .line 754
    move-object v8, v1

    .line 755
    check-cast v8, Landroid/view/MotionEvent;

    .line 756
    .line 757
    :cond_30
    if-nez v8, :cond_31

    .line 758
    .line 759
    goto :goto_13

    .line 760
    :cond_31
    sget-object v1, Lx10;->α:Lx10;

    .line 761
    .line 762
    invoke-virtual {v8}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 763
    .line 764
    .line 765
    move-result v1

    .line 766
    if-eqz v1, :cond_32

    .line 767
    .line 768
    if-eq v1, v6, :cond_32

    .line 769
    .line 770
    goto :goto_13

    .line 771
    :cond_32
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-static {v0}, Lx10;->θ(Landroid/content/Context;)Landroid/app/Activity;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    if-nez v0, :cond_33

    .line 780
    .line 781
    goto :goto_13

    .line 782
    :cond_33
    new-instance v9, Lw10;

    .line 783
    .line 784
    new-instance v10, Ljava/lang/ref/WeakReference;

    .line 785
    .line 786
    invoke-direct {v10, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v8}, Landroid/view/MotionEvent;->getRawX()F

    .line 790
    .line 791
    .line 792
    move-result v11

    .line 793
    invoke-virtual {v8}, Landroid/view/MotionEvent;->getRawY()F

    .line 794
    .line 795
    .line 796
    move-result v12

    .line 797
    invoke-virtual {v8}, Landroid/view/MotionEvent;->getEventTime()J

    .line 798
    .line 799
    .line 800
    move-result-wide v13

    .line 801
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 802
    .line 803
    .line 804
    move-result-wide v15

    .line 805
    invoke-direct/range {v9 .. v16}, Lw10;-><init>(Ljava/lang/ref/WeakReference;FFJJ)V

    .line 806
    .line 807
    .line 808
    sget-object v1, Lx10;->μ:Ljava/lang/Object;

    .line 809
    .line 810
    monitor-enter v1

    .line 811
    :try_start_7
    sget-object v2, Lx10;->λ:Ljava/util/WeakHashMap;

    .line 812
    .line 813
    invoke-virtual {v2, v0, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    sput-object v9, Lx10;->ν:Lw10;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 817
    .line 818
    monitor-exit v1

    .line 819
    :goto_13
    return-void

    .line 820
    :catchall_6
    move-exception v0

    .line 821
    monitor-exit v1

    .line 822
    throw v0

    .line 823
    :sswitch_b
    const-string v0, ""

    .line 824
    .line 825
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    iget-object v2, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 829
    .line 830
    sget-object v3, Ln10;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 831
    .line 832
    invoke-static {}, Lui1;->ψ()Z

    .line 833
    .line 834
    .line 835
    move-result v3

    .line 836
    if-nez v3, :cond_34

    .line 837
    .line 838
    goto/16 :goto_29

    .line 839
    .line 840
    :cond_34
    if-eqz v2, :cond_35

    .line 841
    .line 842
    const/4 v3, 0x2

    .line 843
    invoke-static {v3, v2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v3

    .line 847
    goto :goto_14

    .line 848
    :cond_35
    move-object v3, v8

    .line 849
    :goto_14
    instance-of v4, v3, Ljava/lang/Number;

    .line 850
    .line 851
    if-eqz v4, :cond_36

    .line 852
    .line 853
    check-cast v3, Ljava/lang/Number;

    .line 854
    .line 855
    goto :goto_15

    .line 856
    :cond_36
    move-object v3, v8

    .line 857
    :goto_15
    if-eqz v3, :cond_53

    .line 858
    .line 859
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 860
    .line 861
    .line 862
    move-result v3

    .line 863
    if-ne v3, v6, :cond_53

    .line 864
    .line 865
    if-nez v2, :cond_37

    .line 866
    .line 867
    goto/16 :goto_29

    .line 868
    .line 869
    :cond_37
    const/4 v3, 0x5

    .line 870
    invoke-static {v3, v2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v3

    .line 874
    if-eqz v3, :cond_38

    .line 875
    .line 876
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v3

    .line 880
    goto :goto_16

    .line 881
    :cond_38
    move-object v3, v8

    .line 882
    :goto_16
    if-nez v3, :cond_39

    .line 883
    .line 884
    move-object v3, v0

    .line 885
    :cond_39
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 886
    .line 887
    .line 888
    move-result v3

    .line 889
    if-nez v3, :cond_3a

    .line 890
    .line 891
    goto/16 :goto_1a

    .line 892
    .line 893
    :cond_3a
    move v3, v7

    .line 894
    :goto_17
    array-length v4, v2

    .line 895
    if-ge v3, v4, :cond_3e

    .line 896
    .line 897
    add-int/lit8 v4, v3, 0x1

    .line 898
    .line 899
    :try_start_8
    aget-object v3, v2, v3
    :try_end_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_0

    .line 900
    .line 901
    if-eqz v3, :cond_3b

    .line 902
    .line 903
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v3

    .line 907
    if-eqz v3, :cond_3b

    .line 908
    .line 909
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 910
    .line 911
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v3

    .line 915
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    goto :goto_18

    .line 919
    :cond_3b
    move-object v3, v8

    .line 920
    :goto_18
    if-nez v3, :cond_3c

    .line 921
    .line 922
    move-object v3, v0

    .line 923
    :cond_3c
    const-string v5, "homepage"

    .line 924
    .line 925
    invoke-static {v3, v5, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 926
    .line 927
    .line 928
    move-result v5

    .line 929
    if-nez v5, :cond_40

    .line 930
    .line 931
    const-string v5, "feed"

    .line 932
    .line 933
    invoke-static {v3, v5, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 934
    .line 935
    .line 936
    move-result v5

    .line 937
    if-nez v5, :cond_40

    .line 938
    .line 939
    const-string v5, "click"

    .line 940
    .line 941
    invoke-static {v3, v5, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 942
    .line 943
    .line 944
    move-result v3

    .line 945
    if-eqz v3, :cond_3d

    .line 946
    .line 947
    goto :goto_1a

    .line 948
    :cond_3d
    move v3, v4

    .line 949
    goto :goto_17

    .line 950
    :catch_0
    move-exception v0

    .line 951
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 952
    .line 953
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 958
    .line 959
    .line 960
    throw v1

    .line 961
    :cond_3e
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 962
    .line 963
    .line 964
    move-result-object v3

    .line 965
    invoke-virtual {v3}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 966
    .line 967
    .line 968
    move-result-object v3

    .line 969
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 970
    .line 971
    .line 972
    array-length v4, v3

    .line 973
    move v5, v7

    .line 974
    :goto_19
    if-ge v5, v4, :cond_53

    .line 975
    .line 976
    aget-object v9, v3, v5

    .line 977
    .line 978
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v9

    .line 982
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    const-string v10, ".feed."

    .line 986
    .line 987
    invoke-static {v9, v10, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 988
    .line 989
    .line 990
    move-result v10

    .line 991
    if-nez v10, :cond_40

    .line 992
    .line 993
    const-string v10, "FeedAvatarPresenter"

    .line 994
    .line 995
    invoke-static {v9, v10, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 996
    .line 997
    .line 998
    move-result v10

    .line 999
    if-nez v10, :cond_40

    .line 1000
    .line 1001
    const-string v10, "DPPFollowUserPresenter"

    .line 1002
    .line 1003
    invoke-static {v9, v10, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v9

    .line 1007
    if-eqz v9, :cond_3f

    .line 1008
    .line 1009
    goto :goto_1a

    .line 1010
    :cond_3f
    add-int/lit8 v5, v5, 0x1

    .line 1011
    .line 1012
    goto :goto_19

    .line 1013
    :cond_40
    :goto_1a
    invoke-static {v7, v2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v3

    .line 1017
    instance-of v4, v3, Ljava/lang/String;

    .line 1018
    .line 1019
    if-eqz v4, :cond_41

    .line 1020
    .line 1021
    check-cast v3, Ljava/lang/String;

    .line 1022
    .line 1023
    goto :goto_1b

    .line 1024
    :cond_41
    move-object v3, v8

    .line 1025
    :goto_1b
    if-nez v3, :cond_42

    .line 1026
    .line 1027
    move-object v12, v0

    .line 1028
    goto :goto_1c

    .line 1029
    :cond_42
    move-object v12, v3

    .line 1030
    :goto_1c
    invoke-static {v6, v2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v2

    .line 1034
    instance-of v3, v2, Ljava/lang/String;

    .line 1035
    .line 1036
    if-eqz v3, :cond_43

    .line 1037
    .line 1038
    check-cast v2, Ljava/lang/String;

    .line 1039
    .line 1040
    goto :goto_1d

    .line 1041
    :cond_43
    move-object v2, v8

    .line 1042
    :goto_1d
    if-nez v2, :cond_44

    .line 1043
    .line 1044
    move-object v13, v0

    .line 1045
    goto :goto_1e

    .line 1046
    :cond_44
    move-object v13, v2

    .line 1047
    :goto_1e
    invoke-static {v13}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v0

    .line 1051
    if-nez v0, :cond_45

    .line 1052
    .line 1053
    const-string v0, "sec:"

    .line 1054
    .line 1055
    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    :goto_1f
    move-object v14, v0

    .line 1060
    goto :goto_20

    .line 1061
    :cond_45
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1062
    .line 1063
    .line 1064
    move-result v0

    .line 1065
    if-nez v0, :cond_46

    .line 1066
    .line 1067
    const-string v0, "uid:"

    .line 1068
    .line 1069
    invoke-virtual {v0, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    goto :goto_1f

    .line 1074
    :cond_46
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 1079
    .line 1080
    .line 1081
    move-result-wide v2

    .line 1082
    const-string v0, "unknown:"

    .line 1083
    .line 1084
    invoke-static {v2, v3, v0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    goto :goto_1f

    .line 1089
    :goto_20
    sget-object v2, Ln10;->ζ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1090
    .line 1091
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1092
    .line 1093
    .line 1094
    move-result-wide v3

    .line 1095
    sget-object v5, Ln10;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1096
    .line 1097
    invoke-virtual {v5, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    check-cast v0, Ljava/lang/Long;

    .line 1102
    .line 1103
    const-wide/16 v9, 0x0

    .line 1104
    .line 1105
    if-eqz v0, :cond_47

    .line 1106
    .line 1107
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1108
    .line 1109
    .line 1110
    move-result-wide v15

    .line 1111
    goto :goto_21

    .line 1112
    :cond_47
    move-wide v15, v9

    .line 1113
    :goto_21
    cmp-long v0, v15, v3

    .line 1114
    .line 1115
    if-lez v0, :cond_48

    .line 1116
    .line 1117
    move v0, v6

    .line 1118
    goto/16 :goto_28

    .line 1119
    .line 1120
    :cond_48
    cmp-long v0, v15, v9

    .line 1121
    .line 1122
    if-eqz v0, :cond_49

    .line 1123
    .line 1124
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    invoke-virtual {v5, v14, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1129
    .line 1130
    .line 1131
    :cond_49
    new-instance v0, Lm10;

    .line 1132
    .line 1133
    invoke-direct {v0}, Lm10;-><init>()V

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v2, v14, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v3

    .line 1140
    check-cast v3, Lm10;

    .line 1141
    .line 1142
    if-nez v3, :cond_4a

    .line 1143
    .line 1144
    move-object v11, v0

    .line 1145
    goto :goto_22

    .line 1146
    :cond_4a
    move-object v11, v3

    .line 1147
    :goto_22
    iget-object v0, v11, Lm10;->α:Ljava/util/concurrent/CountDownLatch;

    .line 1148
    .line 1149
    if-nez v3, :cond_4e

    .line 1150
    .line 1151
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v10

    .line 1155
    if-nez v10, :cond_4b

    .line 1156
    .line 1157
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1158
    .line 1159
    .line 1160
    goto :goto_24

    .line 1161
    :cond_4b
    invoke-virtual {v10}, Landroid/app/Activity;->isFinishing()Z

    .line 1162
    .line 1163
    .line 1164
    move-result v4

    .line 1165
    if-nez v4, :cond_4d

    .line 1166
    .line 1167
    invoke-virtual {v10}, Landroid/app/Activity;->isDestroyed()Z

    .line 1168
    .line 1169
    .line 1170
    move-result v4

    .line 1171
    if-eqz v4, :cond_4c

    .line 1172
    .line 1173
    goto :goto_23

    .line 1174
    :cond_4c
    sget-object v4, Ln10;->δ:Landroid/os/Handler;

    .line 1175
    .line 1176
    new-instance v9, Lv8;

    .line 1177
    .line 1178
    const/4 v15, 0x2

    .line 1179
    invoke-direct/range {v9 .. v15}, Lv8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v4, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1183
    .line 1184
    .line 1185
    goto :goto_24

    .line 1186
    :cond_4d
    :goto_23
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1187
    .line 1188
    .line 1189
    :cond_4e
    :goto_24
    :try_start_9
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1190
    .line 1191
    const-wide/16 v9, 0x7530

    .line 1192
    .line 1193
    invoke-virtual {v0, v9, v10, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 1194
    .line 1195
    .line 1196
    move-result v0

    .line 1197
    if-eqz v0, :cond_4f

    .line 1198
    .line 1199
    iget-object v0, v11, Lm10;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1200
    .line 1201
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v0

    .line 1205
    check-cast v0, Ljava/lang/Boolean;

    .line 1206
    .line 1207
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1208
    .line 1209
    .line 1210
    move-result v0

    .line 1211
    if-eqz v0, :cond_4f

    .line 1212
    .line 1213
    move v7, v6

    .line 1214
    goto :goto_25

    .line 1215
    :catchall_7
    move-exception v0

    .line 1216
    goto :goto_26

    .line 1217
    :cond_4f
    :goto_25
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 1221
    goto :goto_27

    .line 1222
    :goto_26
    new-instance v4, Leo1;

    .line 1223
    .line 1224
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1225
    .line 1226
    .line 1227
    move-object v0, v4

    .line 1228
    :goto_27
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1229
    .line 1230
    instance-of v7, v0, Leo1;

    .line 1231
    .line 1232
    if-eqz v7, :cond_50

    .line 1233
    .line 1234
    move-object v0, v4

    .line 1235
    :cond_50
    check-cast v0, Ljava/lang/Boolean;

    .line 1236
    .line 1237
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1238
    .line 1239
    .line 1240
    move-result v0

    .line 1241
    if-nez v3, :cond_51

    .line 1242
    .line 1243
    invoke-virtual {v2, v14, v11}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1244
    .line 1245
    .line 1246
    :cond_51
    if-eqz v0, :cond_52

    .line 1247
    .line 1248
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1249
    .line 1250
    .line 1251
    move-result-wide v2

    .line 1252
    const-wide/16 v9, 0x1388

    .line 1253
    .line 1254
    add-long/2addr v2, v9

    .line 1255
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v2

    .line 1259
    invoke-virtual {v5, v14, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1260
    .line 1261
    .line 1262
    :cond_52
    :goto_28
    if-nez v0, :cond_53

    .line 1263
    .line 1264
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 1265
    .line 1266
    const-string v2, "DYHelper cancelled feed follow request"

    .line 1267
    .line 1268
    invoke-direct {v0, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 1269
    .line 1270
    .line 1271
    iput-object v0, v1, Lk01;->ζ:Ljava/lang/Throwable;

    .line 1272
    .line 1273
    iput-object v8, v1, Lk01;->ε:Ljava/lang/Object;

    .line 1274
    .line 1275
    iput-boolean v6, v1, Lk01;->η:Z

    .line 1276
    .line 1277
    const-string v0, "r84c14b19b9028fd2"

    .line 1278
    .line 1279
    invoke-static {v0, v12, v13}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1280
    .line 1281
    .line 1282
    :cond_53
    :goto_29
    return-void

    .line 1283
    :sswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1284
    .line 1285
    .line 1286
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1287
    .line 1288
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1289
    .line 1290
    .line 1291
    invoke-static {v7, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    instance-of v2, v0, Landroid/view/MotionEvent;

    .line 1296
    .line 1297
    if-eqz v2, :cond_54

    .line 1298
    .line 1299
    check-cast v0, Landroid/view/MotionEvent;

    .line 1300
    .line 1301
    goto :goto_2a

    .line 1302
    :cond_54
    move-object v0, v8

    .line 1303
    :goto_2a
    if-nez v0, :cond_55

    .line 1304
    .line 1305
    goto :goto_2b

    .line 1306
    :cond_55
    sget-object v2, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1307
    .line 1308
    iget-object v2, v1, Lk01;->β:Ljava/lang/Object;

    .line 1309
    .line 1310
    const-string v3, "semantic"

    .line 1311
    .line 1312
    invoke-static {v2, v0, v3, v6}, Lg10;->α(Ljava/lang/Object;Landroid/view/MotionEvent;Ljava/lang/String;Z)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v0

    .line 1316
    if-eqz v0, :cond_56

    .line 1317
    .line 1318
    invoke-virtual {v1, v8}, Lk01;->α(Ljava/lang/Object;)V

    .line 1319
    .line 1320
    .line 1321
    const-string v0, "r898d705a05f158a0"

    .line 1322
    .line 1323
    const-string v1, "\u5bbf\u4e3b\u53cc\u51fb\u8bed\u4e49\u515c\u5e95\u5df2\u6d88\u8d39\u4e8b\u4ef6"

    .line 1324
    .line 1325
    invoke-static {v0, v1, v8, v5, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1326
    .line 1327
    .line 1328
    :cond_56
    :goto_2b
    return-void

    .line 1329
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_c
        0x1 -> :sswitch_b
        0x2 -> :sswitch_a
        0x5 -> :sswitch_9
        0x6 -> :sswitch_8
        0x7 -> :sswitch_7
        0x8 -> :sswitch_6
        0x9 -> :sswitch_5
        0xe -> :sswitch_4
        0x12 -> :sswitch_3
        0x17 -> :sswitch_2
        0x18 -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method
