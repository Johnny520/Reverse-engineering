.class public abstract Lr4;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lej;

.field public static final b:Lg41;

.field public static final c:Lg41;

.field public static final d:Lg41;

.field public static final e:Lg41;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lj4;->e:Lj4;

    .line 2
    .line 3
    new-instance v1, Lej;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lej;-><init>(Lhw;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lr4;->a:Lej;

    .line 9
    .line 10
    sget-object v0, Lj4;->f:Lj4;

    .line 11
    .line 12
    new-instance v1, Lg41;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lat0;-><init>(Lhw;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lr4;->b:Lg41;

    .line 18
    .line 19
    new-instance v0, La2;

    .line 20
    .line 21
    const/16 v1, 0x1a

    .line 22
    .line 23
    invoke-direct {v0, v1}, La2;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lz60;->J(Lhw;)Lx51;

    .line 27
    .line 28
    .line 29
    sget-object v0, Lj4;->g:Lj4;

    .line 30
    .line 31
    new-instance v1, Lg41;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lat0;-><init>(Lhw;)V

    .line 34
    .line 35
    .line 36
    sput-object v1, Lr4;->c:Lg41;

    .line 37
    .line 38
    sget-object v0, Lj4;->h:Lj4;

    .line 39
    .line 40
    new-instance v1, Lg41;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Lat0;-><init>(Lhw;)V

    .line 43
    .line 44
    .line 45
    sput-object v1, Lr4;->d:Lg41;

    .line 46
    .line 47
    sget-object v0, Lj4;->i:Lj4;

    .line 48
    .line 49
    new-instance v1, Lg41;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lat0;-><init>(Lhw;)V

    .line 52
    .line 53
    .line 54
    sput-object v1, Lr4;->e:Lg41;

    .line 55
    .line 56
    return-void
.end method

.method public static final a(Lw3;Lww;Lji;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    check-cast v3, Lpi;

    .line 10
    .line 11
    const v4, -0x1f032317

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v4}, Lpi;->X(I)Lpi;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    const/4 v4, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v4, 0x2

    .line 26
    :goto_0
    or-int/2addr v4, v2

    .line 27
    invoke-virtual {v3, v1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    const/16 v6, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v6, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v4, v6

    .line 39
    and-int/lit8 v6, v4, 0x13

    .line 40
    .line 41
    const/16 v7, 0x12

    .line 42
    .line 43
    const/4 v9, 0x1

    .line 44
    if-eq v6, v7, :cond_2

    .line 45
    .line 46
    move v6, v9

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/4 v6, 0x0

    .line 49
    :goto_2
    and-int/2addr v4, v9

    .line 50
    invoke-virtual {v3, v4, v6}, Lpi;->O(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_17

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    sget-object v7, Lii;->a:Lr3;

    .line 65
    .line 66
    if-ne v6, v7, :cond_3

    .line 67
    .line 68
    new-instance v6, Lt6;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v6}, Lpi;->g0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    check-cast v6, Lt6;

    .line 77
    .line 78
    invoke-virtual {v0}, Lw3;->getViewTreeOwners()Lk3;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    if-eqz v10, :cond_16

    .line 83
    .line 84
    iget-object v11, v10, Lk3;->b:Lnx0;

    .line 85
    .line 86
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    if-ne v12, v7, :cond_7

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    check-cast v12, Landroid/view/View;

    .line 100
    .line 101
    const v13, 0x7f060032

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v13}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    instance-of v14, v13, Ljava/lang/String;

    .line 109
    .line 110
    const/4 v15, 0x0

    .line 111
    if-eqz v14, :cond_4

    .line 112
    .line 113
    check-cast v13, Ljava/lang/String;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    move-object v13, v15

    .line 117
    :goto_3
    if-nez v13, :cond_5

    .line 118
    .line 119
    invoke-virtual {v12}, Landroid/view/View;->getId()I

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    :cond_5
    new-instance v12, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    const-class v14, Lzw0;

    .line 133
    .line 134
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v14

    .line 138
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const/16 v14, 0x3a

    .line 142
    .line 143
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    invoke-interface {v11}, Lnx0;->getSavedStateRegistry()Lkx0;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    invoke-virtual {v13, v12}, Lkx0;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    if-eqz v14, :cond_6

    .line 162
    .line 163
    new-instance v15, Ljava/util/LinkedHashMap;

    .line 164
    .line 165
    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v14}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 169
    .line 170
    .line 171
    move-result-object v16

    .line 172
    check-cast v16, Ljava/lang/Iterable;

    .line 173
    .line 174
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v16

    .line 178
    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v17

    .line 182
    if-eqz v17, :cond_6

    .line 183
    .line 184
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v17

    .line 188
    move-object/from16 v8, v17

    .line 189
    .line 190
    check-cast v8, Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v14, v8}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-interface {v15, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_6
    sget-object v5, Lp3;->n:Lp3;

    .line 204
    .line 205
    sget-object v8, Lbx0;->a:Lg41;

    .line 206
    .line 207
    new-instance v8, Lax0;

    .line 208
    .line 209
    invoke-direct {v8, v15, v5}, Lax0;-><init>(Ljava/util/Map;Lsw;)V

    .line 210
    .line 211
    .line 212
    :try_start_0
    new-instance v5, Lxg;

    .line 213
    .line 214
    invoke-direct {v5, v9, v8}, Lxg;-><init>(ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v13, v12, v5}, Lkx0;->c(Ljava/lang/String;Ljx0;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    .line 219
    .line 220
    move v5, v9

    .line 221
    goto :goto_5

    .line 222
    :catch_0
    const/4 v5, 0x0

    .line 223
    :goto_5
    new-instance v14, Lqo;

    .line 224
    .line 225
    new-instance v15, Lro;

    .line 226
    .line 227
    invoke-direct {v15, v5, v13, v12}, Lro;-><init>(ZLkx0;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-direct {v14, v8, v15}, Lqo;-><init>(Lax0;Lro;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v14}, Lpi;->g0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    move-object v12, v14

    .line 237
    :cond_7
    check-cast v12, Lqo;

    .line 238
    .line 239
    invoke-virtual {v3, v12}, Lpi;->h(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    if-nez v5, :cond_8

    .line 248
    .line 249
    if-ne v8, v7, :cond_9

    .line 250
    .line 251
    :cond_8
    new-instance v8, Ls2;

    .line 252
    .line 253
    const/4 v5, 0x5

    .line 254
    invoke-direct {v8, v5, v12}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v8}, Lpi;->g0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_9
    check-cast v8, Lsw;

    .line 261
    .line 262
    sget-object v5, Lna1;->a:Lna1;

    .line 263
    .line 264
    invoke-static {v5, v8, v3}, Ls91;->c(Ljava/lang/Object;Lsw;Lji;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    if-ne v5, v7, :cond_b

    .line 272
    .line 273
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 274
    .line 275
    const/16 v8, 0x1f

    .line 276
    .line 277
    if-lt v5, v8, :cond_a

    .line 278
    .line 279
    const-class v5, Landroid/os/Vibrator;

    .line 280
    .line 281
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    check-cast v5, Landroid/os/Vibrator;

    .line 286
    .line 287
    const/4 v8, 0x7

    .line 288
    const/4 v13, 0x2

    .line 289
    filled-new-array {v9, v8, v13}, [I

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    invoke-virtual {v5, v8}, Landroid/os/Vibrator;->areAllPrimitivesSupported([I)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    if-eqz v5, :cond_a

    .line 298
    .line 299
    new-instance v5, Lyl;

    .line 300
    .line 301
    invoke-virtual {v0}, Lw3;->getView()Landroid/view/View;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    const/4 v13, 0x0

    .line 306
    invoke-direct {v5, v8, v13}, Lyl;-><init>(Landroid/view/View;I)V

    .line 307
    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_a
    new-instance v5, Lij0;

    .line 311
    .line 312
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 313
    .line 314
    .line 315
    :goto_6
    invoke-virtual {v3, v5}, Lpi;->g0(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    :cond_b
    check-cast v5, Ljy;

    .line 319
    .line 320
    invoke-virtual {v0}, Lw3;->getConfiguration()Landroid/content/res/Configuration;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v13

    .line 328
    if-ne v13, v7, :cond_c

    .line 329
    .line 330
    new-instance v13, Ls00;

    .line 331
    .line 332
    invoke-direct {v13}, Ls00;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3, v13}, Lpi;->g0(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    :cond_c
    check-cast v13, Ls00;

    .line 339
    .line 340
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    if-ne v14, v7, :cond_e

    .line 345
    .line 346
    new-instance v14, Landroid/content/res/Configuration;

    .line 347
    .line 348
    invoke-direct {v14}, Landroid/content/res/Configuration;-><init>()V

    .line 349
    .line 350
    .line 351
    if-eqz v8, :cond_d

    .line 352
    .line 353
    invoke-virtual {v14, v8}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 354
    .line 355
    .line 356
    :cond_d
    invoke-virtual {v3, v14}, Lpi;->g0(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    :cond_e
    check-cast v14, Landroid/content/res/Configuration;

    .line 360
    .line 361
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v8

    .line 365
    if-ne v8, v7, :cond_f

    .line 366
    .line 367
    new-instance v8, Lp4;

    .line 368
    .line 369
    invoke-direct {v8, v14, v13}, Lp4;-><init>(Landroid/content/res/Configuration;Ls00;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v3, v8}, Lpi;->g0(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    :cond_f
    check-cast v8, Lp4;

    .line 376
    .line 377
    invoke-virtual {v3, v4}, Lpi;->h(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v14

    .line 381
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v15

    .line 385
    if-nez v14, :cond_10

    .line 386
    .line 387
    if-ne v15, v7, :cond_11

    .line 388
    .line 389
    :cond_10
    new-instance v15, Lo4;

    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    invoke-direct {v15, v14, v4, v8}, Lo4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v3, v15}, Lpi;->g0(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    :cond_11
    check-cast v15, Lsw;

    .line 399
    .line 400
    invoke-static {v13, v15, v3}, Ls91;->c(Ljava/lang/Object;Lsw;Lji;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    if-ne v8, v7, :cond_12

    .line 408
    .line 409
    new-instance v8, Lxu0;

    .line 410
    .line 411
    invoke-direct {v8}, Lxu0;-><init>()V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v3, v8}, Lpi;->g0(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    :cond_12
    check-cast v8, Lxu0;

    .line 418
    .line 419
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v14

    .line 423
    if-ne v14, v7, :cond_13

    .line 424
    .line 425
    new-instance v14, Lq4;

    .line 426
    .line 427
    invoke-direct {v14, v8}, Lq4;-><init>(Lxu0;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v3, v14}, Lpi;->g0(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    :cond_13
    check-cast v14, Lq4;

    .line 434
    .line 435
    invoke-virtual {v3, v4}, Lpi;->h(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v15

    .line 439
    invoke-virtual {v3}, Lpi;->L()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    if-nez v15, :cond_14

    .line 444
    .line 445
    if-ne v9, v7, :cond_15

    .line 446
    .line 447
    :cond_14
    new-instance v9, Lo4;

    .line 448
    .line 449
    const/4 v7, 0x1

    .line 450
    invoke-direct {v9, v7, v4, v14}, Lo4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v3, v9}, Lpi;->g0(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    :cond_15
    check-cast v9, Lsw;

    .line 457
    .line 458
    invoke-static {v8, v9, v3}, Ls91;->c(Ljava/lang/Object;Lsw;Lji;)V

    .line 459
    .line 460
    .line 461
    sget-object v7, Ldj;->v:Lej;

    .line 462
    .line 463
    invoke-virtual {v3, v7}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    check-cast v9, Ljava/lang/Boolean;

    .line 468
    .line 469
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 470
    .line 471
    .line 472
    move-result v9

    .line 473
    invoke-virtual {v0}, Lw3;->getScrollCaptureInProgress$ui()Z

    .line 474
    .line 475
    .line 476
    move-result v14

    .line 477
    or-int/2addr v9, v14

    .line 478
    sget-object v14, Lr4;->a:Lej;

    .line 479
    .line 480
    invoke-virtual {v0}, Lw3;->getConfiguration()Landroid/content/res/Configuration;

    .line 481
    .line 482
    .line 483
    move-result-object v15

    .line 484
    invoke-virtual {v14, v15}, Lej;->a(Ljava/lang/Object;)Lct0;

    .line 485
    .line 486
    .line 487
    move-result-object v16

    .line 488
    sget-object v14, Lr4;->b:Lg41;

    .line 489
    .line 490
    invoke-virtual {v14, v4}, Lg41;->a(Ljava/lang/Object;)Lct0;

    .line 491
    .line 492
    .line 493
    move-result-object v17

    .line 494
    sget-object v4, Lbb0;->a:Lat0;

    .line 495
    .line 496
    iget-object v10, v10, Lk3;->a:Lx90;

    .line 497
    .line 498
    invoke-virtual {v4, v10}, Lat0;->a(Ljava/lang/Object;)Lct0;

    .line 499
    .line 500
    .line 501
    move-result-object v18

    .line 502
    sget-object v4, Ldb0;->a:Lat0;

    .line 503
    .line 504
    invoke-virtual {v4, v11}, Lat0;->a(Ljava/lang/Object;)Lct0;

    .line 505
    .line 506
    .line 507
    move-result-object v19

    .line 508
    sget-object v4, Lbx0;->a:Lg41;

    .line 509
    .line 510
    invoke-virtual {v4, v12}, Lg41;->a(Ljava/lang/Object;)Lct0;

    .line 511
    .line 512
    .line 513
    move-result-object v20

    .line 514
    sget-object v4, Lr4;->e:Lg41;

    .line 515
    .line 516
    invoke-virtual {v0}, Lw3;->getView()Landroid/view/View;

    .line 517
    .line 518
    .line 519
    move-result-object v10

    .line 520
    invoke-virtual {v4, v10}, Lg41;->a(Ljava/lang/Object;)Lct0;

    .line 521
    .line 522
    .line 523
    move-result-object v21

    .line 524
    sget-object v4, Lr4;->c:Lg41;

    .line 525
    .line 526
    invoke-virtual {v4, v13}, Lg41;->a(Ljava/lang/Object;)Lct0;

    .line 527
    .line 528
    .line 529
    move-result-object v22

    .line 530
    sget-object v4, Lr4;->d:Lg41;

    .line 531
    .line 532
    invoke-virtual {v4, v8}, Lg41;->a(Ljava/lang/Object;)Lct0;

    .line 533
    .line 534
    .line 535
    move-result-object v23

    .line 536
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    invoke-virtual {v7, v4}, Lej;->a(Ljava/lang/Object;)Lct0;

    .line 541
    .line 542
    .line 543
    move-result-object v24

    .line 544
    sget-object v4, Ldj;->l:Lg41;

    .line 545
    .line 546
    invoke-virtual {v4, v5}, Lg41;->a(Ljava/lang/Object;)Lct0;

    .line 547
    .line 548
    .line 549
    move-result-object v25

    .line 550
    filled-new-array/range {v16 .. v25}, [Lct0;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    new-instance v5, Ll4;

    .line 555
    .line 556
    invoke-direct {v5, v0, v6, v1}, Ll4;-><init>(Lw3;Lt6;Lww;)V

    .line 557
    .line 558
    .line 559
    const v6, 0x3f2ad1a9

    .line 560
    .line 561
    .line 562
    invoke-static {v6, v5, v3}, Lkl;->w(ILex;Lji;)Lmh;

    .line 563
    .line 564
    .line 565
    move-result-object v5

    .line 566
    const/16 v6, 0x38

    .line 567
    .line 568
    invoke-static {v4, v5, v3, v6}, Li4;->c([Lct0;Lww;Lji;I)V

    .line 569
    .line 570
    .line 571
    goto :goto_7

    .line 572
    :cond_16
    const-string v0, "Called when the ViewTreeOwnersAvailability is not yet in Available state"

    .line 573
    .line 574
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    return-void

    .line 578
    :cond_17
    invoke-virtual {v3}, Lpi;->R()V

    .line 579
    .line 580
    .line 581
    :goto_7
    invoke-virtual {v3}, Lpi;->r()Lht0;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    if-eqz v3, :cond_18

    .line 586
    .line 587
    new-instance v4, Lm4;

    .line 588
    .line 589
    const/4 v13, 0x0

    .line 590
    invoke-direct {v4, v0, v1, v2, v13}, Lm4;-><init>(Ljava/lang/Object;Lww;II)V

    .line 591
    .line 592
    .line 593
    iput-object v4, v3, Lht0;->d:Lww;

    .line 594
    .line 595
    :cond_18
    return-void
.end method

.method public static final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CompositionLocal "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not present"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
