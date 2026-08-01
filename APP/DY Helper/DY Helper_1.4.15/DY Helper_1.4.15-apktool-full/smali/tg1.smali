.class public final synthetic Ltg1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lky1;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lky1;I)V
    .locals 0

    .line 1
    iput p3, p0, Ltg1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ltg1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Ltg1;->η:Lky1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ltg1;->ε:I

    .line 4
    .line 5
    sget-object v2, Ls62;->α:Ls62;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x4

    .line 9
    const-string v5, " tasks="

    .line 10
    .line 11
    const-string v6, "rc62a71041a7416a5"

    .line 12
    .line 13
    const-string v7, ""

    .line 14
    .line 15
    const-string v8, "\u4efb\u52a1\u5217\u8868\u4e3a\u7a7a"

    .line 16
    .line 17
    const-string v9, "\u706b\u661f\u53d1\u9001\u6d4b\u8bd5\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 18
    .line 19
    iget-object v10, v0, Ltg1;->η:Lky1;

    .line 20
    .line 21
    iget-object v0, v0, Ltg1;->ζ:Landroid/app/Activity;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x1

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lx9;->η()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance v3, Lrf1;

    .line 43
    .line 44
    invoke-direct {v3, v11, v1, v12}, Lrf1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    invoke-static {v0, v10}, Li81;->λ(Landroid/app/Activity;Lky1;)Lrf1;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v9, v1, Lrf1;->α:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v9, Lgg1;

    .line 56
    .line 57
    if-nez v9, :cond_2

    .line 58
    .line 59
    iget-object v1, v1, Lrf1;->β:Ljava/lang/Throwable;

    .line 60
    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    new-instance v3, Lrf1;

    .line 69
    .line 70
    invoke-direct {v3, v11, v1, v12}, Lrf1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_2
    invoke-virtual {v9}, Lgg1;->α()Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v8, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_4

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    move-object v13, v9

    .line 99
    check-cast v13, Ltf1;

    .line 100
    .line 101
    iget v14, v13, Ltf1;->γ:I

    .line 102
    .line 103
    if-ne v14, v12, :cond_3

    .line 104
    .line 105
    invoke-virtual {v13}, Ltf1;->γ()Lfg1;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    sget-object v14, Lfg1;->ζ:Lfg1;

    .line 110
    .line 111
    if-ne v13, v14, :cond_3

    .line 112
    .line 113
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_4
    new-instance v1, Ljava/util/HashSet;

    .line 118
    .line 119
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 120
    .line 121
    .line 122
    new-instance v9, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    :cond_5
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    if-eqz v13, :cond_7

    .line 136
    .line 137
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    move-object v14, v13

    .line 142
    check-cast v14, Ltf1;

    .line 143
    .line 144
    iget-object v15, v14, Ltf1;->β:Ljava/lang/String;

    .line 145
    .line 146
    if-nez v15, :cond_6

    .line 147
    .line 148
    iget-object v15, v14, Ltf1;->α:Ljava/lang/String;

    .line 149
    .line 150
    :cond_6
    invoke-virtual {v1, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v14

    .line 154
    if-eqz v14, :cond_5

    .line 155
    .line 156
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_7
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_8

    .line 165
    .line 166
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 167
    .line 168
    const-string v3, "\u5f53\u524d\u4f1a\u8bdd\u6ca1\u6709\u8fdb\u884c\u4e2d\u7684\u56fe\u7247\u6216\u89c6\u9891\u5206\u4eab\u4efb\u52a1"

    .line 169
    .line 170
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    new-instance v3, Lrf1;

    .line 174
    .line 175
    invoke-direct {v3, v11, v1, v12}, Lrf1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_8
    sget-object v1, Lry1;->α:Lry1;

    .line 180
    .line 181
    invoke-static {v10}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    new-instance v12, Ljava/util/ArrayList;

    .line 186
    .line 187
    const/16 v8, 0xa

    .line 188
    .line 189
    invoke-static {v9, v8}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v13

    .line 200
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v14

    .line 204
    if-eqz v14, :cond_9

    .line 205
    .line 206
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    check-cast v14, Ltf1;

    .line 211
    .line 212
    iget-object v14, v14, Ltf1;->α:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_9
    new-instance v13, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-static {v9, v8}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    invoke-direct {v13, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_b

    .line 236
    .line 237
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    check-cast v9, Ltf1;

    .line 242
    .line 243
    iget-object v14, v9, Ltf1;->κ:Ljava/lang/String;

    .line 244
    .line 245
    if-nez v14, :cond_a

    .line 246
    .line 247
    iget-object v14, v9, Ltf1;->ζ:Ljava/lang/String;

    .line 248
    .line 249
    if-nez v14, :cond_a

    .line 250
    .line 251
    move-object v14, v7

    .line 252
    :cond_a
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_b
    new-instance v7, Lxg1;

    .line 257
    .line 258
    invoke-direct {v7, v10, v1, v12, v13}, Lxg1;-><init>(Lky1;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 259
    .line 260
    .line 261
    const/16 v17, 0x0

    .line 262
    .line 263
    const/16 v18, 0x3f

    .line 264
    .line 265
    const/4 v13, 0x0

    .line 266
    const/4 v14, 0x0

    .line 267
    const/4 v15, 0x0

    .line 268
    const/16 v16, 0x0

    .line 269
    .line 270
    invoke-static/range {v12 .. v18}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    const-string v9, "\u56fe\u7247\u8ba1\u5212 name="

    .line 275
    .line 276
    invoke-static {v9, v1, v5, v8}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-static {v6, v1, v11, v4, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    new-instance v1, Lrf1;

    .line 284
    .line 285
    invoke-direct {v1, v7, v11, v3}, Lrf1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    .line 286
    .line 287
    .line 288
    move-object v3, v1

    .line 289
    :goto_4
    new-instance v1, Lug1;

    .line 290
    .line 291
    const/4 v4, 0x0

    .line 292
    invoke-direct {v1, v3, v0, v4}, Lug1;-><init>(Lrf1;Landroid/app/Activity;I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 296
    .line 297
    .line 298
    return-object v2

    .line 299
    :pswitch_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-static {}, Lx9;->η()Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-nez v1, :cond_c

    .line 307
    .line 308
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 309
    .line 310
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    new-instance v3, Lrf1;

    .line 314
    .line 315
    invoke-direct {v3, v11, v1, v12}, Lrf1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    .line 316
    .line 317
    .line 318
    goto/16 :goto_a

    .line 319
    .line 320
    :cond_c
    invoke-static {v0, v10}, Li81;->λ(Landroid/app/Activity;Lky1;)Lrf1;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    iget-object v9, v1, Lrf1;->α:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v9, Lgg1;

    .line 327
    .line 328
    if-nez v9, :cond_e

    .line 329
    .line 330
    iget-object v1, v1, Lrf1;->β:Ljava/lang/Throwable;

    .line 331
    .line 332
    if-nez v1, :cond_d

    .line 333
    .line 334
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 335
    .line 336
    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    :cond_d
    new-instance v3, Lrf1;

    .line 340
    .line 341
    invoke-direct {v3, v11, v1, v12}, Lrf1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_a

    .line 345
    .line 346
    :cond_e
    invoke-virtual {v9}, Lgg1;->α()Ljava/util/ArrayList;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    new-instance v8, Lf7;

    .line 351
    .line 352
    invoke-direct {v8, v12, v1}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    new-instance v9, Lcf1;

    .line 356
    .line 357
    const/16 v13, 0xe

    .line 358
    .line 359
    invoke-direct {v9, v13}, Lcf1;-><init>(I)V

    .line 360
    .line 361
    .line 362
    new-instance v13, Ly30;

    .line 363
    .line 364
    invoke-direct {v13, v8, v12, v9}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 365
    .line 366
    .line 367
    new-instance v8, Lx30;

    .line 368
    .line 369
    invoke-direct {v8, v13}, Lx30;-><init>(Ly30;)V

    .line 370
    .line 371
    .line 372
    :goto_5
    invoke-virtual {v8}, Lx30;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v9

    .line 376
    if-eqz v9, :cond_10

    .line 377
    .line 378
    invoke-virtual {v8}, Lx30;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    check-cast v9, Ltf1;

    .line 383
    .line 384
    iget-object v13, v9, Ltf1;->α:Ljava/lang/String;

    .line 385
    .line 386
    iget-object v9, v9, Ltf1;->κ:Ljava/lang/String;

    .line 387
    .line 388
    if-nez v9, :cond_f

    .line 389
    .line 390
    move-object v9, v7

    .line 391
    :cond_f
    const-string v14, "\u6392\u9664\u591a\u95ea\u4e92\u53d1\u4efb\u52a1 taskId="

    .line 392
    .line 393
    const-string v15, " title="

    .line 394
    .line 395
    invoke-static {v14, v13, v15, v9}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    invoke-static {v6, v9, v11, v4, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    goto :goto_5

    .line 403
    :cond_10
    new-instance v8, Ljava/util/ArrayList;

    .line 404
    .line 405
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    :cond_11
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 413
    .line 414
    .line 415
    move-result v9

    .line 416
    if-eqz v9, :cond_12

    .line 417
    .line 418
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v9

    .line 422
    move-object v13, v9

    .line 423
    check-cast v13, Ltf1;

    .line 424
    .line 425
    iget v14, v13, Ltf1;->γ:I

    .line 426
    .line 427
    if-ne v14, v12, :cond_11

    .line 428
    .line 429
    invoke-virtual {v13}, Ltf1;->γ()Lfg1;

    .line 430
    .line 431
    .line 432
    move-result-object v14

    .line 433
    sget-object v15, Lfg1;->ε:Lfg1;

    .line 434
    .line 435
    if-ne v14, v15, :cond_11

    .line 436
    .line 437
    iget-object v14, v13, Ltf1;->κ:Ljava/lang/String;

    .line 438
    .line 439
    iget-object v13, v13, Ltf1;->ζ:Ljava/lang/String;

    .line 440
    .line 441
    invoke-static {v14, v13}, Le81;->λ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 442
    .line 443
    .line 444
    move-result v13

    .line 445
    if-eqz v13, :cond_11

    .line 446
    .line 447
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    goto :goto_6

    .line 451
    :cond_12
    new-instance v1, Ljava/util/HashSet;

    .line 452
    .line 453
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 454
    .line 455
    .line 456
    new-instance v9, Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    :cond_13
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v13

    .line 469
    if-eqz v13, :cond_15

    .line 470
    .line 471
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v13

    .line 475
    move-object v14, v13

    .line 476
    check-cast v14, Ltf1;

    .line 477
    .line 478
    iget-object v15, v14, Ltf1;->β:Ljava/lang/String;

    .line 479
    .line 480
    if-nez v15, :cond_14

    .line 481
    .line 482
    iget-object v15, v14, Ltf1;->α:Ljava/lang/String;

    .line 483
    .line 484
    :cond_14
    invoke-virtual {v1, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v14

    .line 488
    if-eqz v14, :cond_13

    .line 489
    .line 490
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    goto :goto_7

    .line 494
    :cond_15
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    if-eqz v1, :cond_16

    .line 499
    .line 500
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 501
    .line 502
    const-string v3, "\u5f53\u524d\u4f1a\u8bdd\u6ca1\u6709\u8fdb\u884c\u4e2d\u7684\u6296\u97f3\u4e92\u53d1\u6d88\u606f\u4efb\u52a1"

    .line 503
    .line 504
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    new-instance v3, Lrf1;

    .line 508
    .line 509
    invoke-direct {v3, v11, v1, v12}, Lrf1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_a

    .line 513
    .line 514
    :cond_16
    new-instance v13, Ljava/util/ArrayList;

    .line 515
    .line 516
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v8

    .line 531
    if-eqz v8, :cond_19

    .line 532
    .line 533
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v8

    .line 537
    check-cast v8, Ltf1;

    .line 538
    .line 539
    invoke-static {v8}, Lrg1;->β(Ltf1;)Lqg1;

    .line 540
    .line 541
    .line 542
    move-result-object v9

    .line 543
    iget-object v14, v8, Ltf1;->α:Ljava/lang/String;

    .line 544
    .line 545
    if-nez v9, :cond_17

    .line 546
    .line 547
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 548
    .line 549
    const-string v3, "\u4efb\u52a1 "

    .line 550
    .line 551
    const-string v4, " \u65e0\u6cd5\u786e\u8ba4\u4e92\u53d1\u6d88\u606f\u6761\u6570\uff0c\u5df2\u62d2\u7edd\u53d1\u9001"

    .line 552
    .line 553
    invoke-static {v3, v14, v4}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    new-instance v3, Lrf1;

    .line 561
    .line 562
    invoke-direct {v3, v11, v1, v12}, Lrf1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    .line 563
    .line 564
    .line 565
    goto/16 :goto_a

    .line 566
    .line 567
    :cond_17
    new-instance v15, Lzg1;

    .line 568
    .line 569
    iget-object v12, v8, Ltf1;->κ:Ljava/lang/String;

    .line 570
    .line 571
    if-nez v12, :cond_18

    .line 572
    .line 573
    iget-object v12, v8, Ltf1;->ζ:Ljava/lang/String;

    .line 574
    .line 575
    if-nez v12, :cond_18

    .line 576
    .line 577
    move-object v12, v7

    .line 578
    :cond_18
    iget v8, v9, Lqg1;->α:I

    .line 579
    .line 580
    iget-object v9, v9, Lqg1;->β:Ljava/lang/String;

    .line 581
    .line 582
    invoke-direct {v15, v8, v14, v12, v9}, Lzg1;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    const/4 v12, 0x1

    .line 589
    goto :goto_8

    .line 590
    :cond_19
    sget-object v1, Lry1;->α:Lry1;

    .line 591
    .line 592
    invoke-static {v10}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 597
    .line 598
    .line 599
    move-result-object v7

    .line 600
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 601
    .line 602
    .line 603
    move-result v8

    .line 604
    if-eqz v8, :cond_1c

    .line 605
    .line 606
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    check-cast v8, Lzg1;

    .line 611
    .line 612
    iget v8, v8, Lzg1;->γ:I

    .line 613
    .line 614
    :cond_1a
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 615
    .line 616
    .line 617
    move-result v9

    .line 618
    if-eqz v9, :cond_1b

    .line 619
    .line 620
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v9

    .line 624
    check-cast v9, Lzg1;

    .line 625
    .line 626
    iget v9, v9, Lzg1;->γ:I

    .line 627
    .line 628
    if-ge v8, v9, :cond_1a

    .line 629
    .line 630
    move v8, v9

    .line 631
    goto :goto_9

    .line 632
    :cond_1b
    new-instance v7, Lyg1;

    .line 633
    .line 634
    invoke-direct {v7, v10, v1, v8, v13}, Lyg1;-><init>(Lky1;Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 635
    .line 636
    .line 637
    new-instance v9, Lcf1;

    .line 638
    .line 639
    const/16 v10, 0xf

    .line 640
    .line 641
    invoke-direct {v9, v10}, Lcf1;-><init>(I)V

    .line 642
    .line 643
    .line 644
    const/16 v19, 0x1f

    .line 645
    .line 646
    const/4 v14, 0x0

    .line 647
    const/4 v15, 0x0

    .line 648
    const/16 v16, 0x0

    .line 649
    .line 650
    const/16 v17, 0x0

    .line 651
    .line 652
    move-object/from16 v18, v9

    .line 653
    .line 654
    invoke-static/range {v13 .. v19}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v9

    .line 658
    const-string v10, "\u6587\u672c\u8ba1\u5212 name="

    .line 659
    .line 660
    const-string v12, " count="

    .line 661
    .line 662
    invoke-static {v8, v10, v1, v12, v5}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-static {v6, v1, v11, v4, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    new-instance v1, Lrf1;

    .line 677
    .line 678
    invoke-direct {v1, v7, v11, v3}, Lrf1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    .line 679
    .line 680
    .line 681
    move-object v3, v1

    .line 682
    :goto_a
    new-instance v1, Lug1;

    .line 683
    .line 684
    const/4 v4, 0x1

    .line 685
    invoke-direct {v1, v3, v0, v4}, Lug1;-><init>(Lrf1;Landroid/app/Activity;I)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 689
    .line 690
    .line 691
    goto :goto_b

    .line 692
    :cond_1c
    invoke-static {}, Lγ;->ο()V

    .line 693
    .line 694
    .line 695
    move-object v2, v11

    .line 696
    :goto_b
    return-object v2

    .line 697
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
