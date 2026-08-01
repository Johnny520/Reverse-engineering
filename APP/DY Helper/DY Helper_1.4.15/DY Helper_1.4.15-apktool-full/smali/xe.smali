.class public final Lxe;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 32
    iput p1, p0, Lxe;->α:I

    iput-object p3, p0, Lxe;->β:Ljava/lang/reflect/Method;

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjava/lang/reflect/Method;)V
    .locals 0

    .line 1
    iput p1, p0, Lxe;->α:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Leh;->α:Leh;

    .line 7
    .line 8
    iput-object p2, p0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    invoke-direct {p0}, Lm01;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :sswitch_0
    sget-object p1, Ll82;->α:Ll82;

    .line 15
    .line 16
    iput-object p2, p0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    invoke-direct {p0}, Lm01;-><init>()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_1
    sget-object p1, Leh;->α:Leh;

    .line 23
    .line 24
    iput-object p2, p0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 25
    .line 26
    invoke-direct {p0}, Lm01;-><init>()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Method;IZ)V
    .locals 0

    .line 31
    iput p2, p0, Lxe;->α:I

    iput-object p1, p0, Lxe;->β:Ljava/lang/reflect/Method;

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lxe;->α:I

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-static {}, Lm82;->δ()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    iget-object v2, v1, Lk01;->ε:Ljava/lang/Object;

    .line 30
    .line 31
    instance-of v6, v2, Ljava/util/List;

    .line 32
    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    move-object v3, v2

    .line 36
    check-cast v3, Ljava/util/List;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const/4 v3, 0x0

    .line 42
    :goto_0
    if-nez v3, :cond_2

    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_2
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_6

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_5

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    instance-of v3, v3, Ljava/lang/Float;

    .line 74
    .line 75
    if-nez v3, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    .line 79
    .line 80
    sget-object v3, Lm82;->β:Ljava/util/List;

    .line 81
    .line 82
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, Lk01;->α(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v1, Lm82;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 89
    .line 90
    invoke-virtual {v1, v5, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v2, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v3, "extended speed list via "

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v1, "#"

    .line 122
    .line 123
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Lm82;->ζ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :goto_2
    sget-object v1, Lm82;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 138
    .line 139
    invoke-virtual {v1, v5, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    new-instance v1, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v2, "speed callback failed: "

    .line 152
    .line 153
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Lm82;->ζ(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    :goto_3
    return-void

    .line 167
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_7

    .line 181
    .line 182
    sget-object v0, Ln82;->γ:[Ljava/lang/Float;

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_7
    const-class v2, Ljava/util/List;

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_8

    .line 196
    .line 197
    sget-object v0, Ln82;->γ:[Ljava/lang/Float;

    .line 198
    .line 199
    invoke-static {v0}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    goto :goto_4

    .line 204
    :cond_8
    iget-object v0, v1, Lk01;->ε:Ljava/lang/Object;

    .line 205
    .line 206
    :goto_4
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sget-object v2, Lo22;->α:Lo22;

    .line 224
    .line 225
    invoke-static {}, Lo22;->ζ()Ljava/util/Set;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eqz v6, :cond_9

    .line 234
    .line 235
    goto/16 :goto_16

    .line 236
    .line 237
    :cond_9
    iget-object v6, v1, Lk01;->ε:Ljava/lang/Object;

    .line 238
    .line 239
    instance-of v7, v6, Ljava/util/List;

    .line 240
    .line 241
    if-eqz v7, :cond_a

    .line 242
    .line 243
    check-cast v6, Ljava/util/List;

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_a
    const/4 v6, 0x0

    .line 247
    :goto_5
    if-nez v6, :cond_b

    .line 248
    .line 249
    goto/16 :goto_16

    .line 250
    .line 251
    :cond_b
    new-instance v7, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    :cond_c
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    if-eqz v9, :cond_d

    .line 265
    .line 266
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-static {v9}, Lo22;->Ε(Ljava/lang/Object;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    if-eqz v9, :cond_c

    .line 275
    .line 276
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_d
    iget-object v8, v1, Lk01;->α:Ljava/lang/reflect/Executable;

    .line 281
    .line 282
    instance-of v9, v8, Ljava/lang/reflect/Method;

    .line 283
    .line 284
    if-eqz v9, :cond_e

    .line 285
    .line 286
    check-cast v8, Ljava/lang/reflect/Method;

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_e
    const/4 v8, 0x0

    .line 290
    :goto_7
    invoke-static {v6, v7}, Lo22;->σ(Ljava/util/List;Ljava/util/ArrayList;)Z

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-nez v9, :cond_f

    .line 295
    .line 296
    const-string v0, "skip"

    .line 297
    .line 298
    invoke-static {v8, v6, v7, v0}, Lo22;->ρ(Ljava/lang/reflect/Method;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_16

    .line 302
    .line 303
    :cond_f
    const-string v9, "match"

    .line 304
    .line 305
    invoke-static {v8, v6, v7, v9}, Lo22;->ρ(Ljava/lang/reflect/Method;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    if-eqz v9, :cond_12

    .line 313
    .line 314
    new-instance v7, Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 317
    .line 318
    .line 319
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    :cond_10
    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    if-eqz v10, :cond_12

    .line 328
    .line 329
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v10

    .line 333
    if-eqz v10, :cond_11

    .line 334
    .line 335
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v10

    .line 339
    goto :goto_9

    .line 340
    :cond_11
    const/4 v10, 0x0

    .line 341
    :goto_9
    if-eqz v10, :cond_10

    .line 342
    .line 343
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    goto :goto_8

    .line 347
    :cond_12
    move-object v11, v7

    .line 348
    const/16 v16, 0x0

    .line 349
    .line 350
    const/16 v17, 0x3e

    .line 351
    .line 352
    const-string v12, ", "

    .line 353
    .line 354
    const/4 v13, 0x0

    .line 355
    const/4 v14, 0x0

    .line 356
    const/4 v15, 0x0

    .line 357
    invoke-static/range {v11 .. v17}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v7

    .line 361
    new-instance v9, Ljava/util/ArrayList;

    .line 362
    .line 363
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 364
    .line 365
    .line 366
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v10

    .line 370
    :cond_13
    :goto_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v11

    .line 374
    if-eqz v11, :cond_15

    .line 375
    .line 376
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v11

    .line 380
    invoke-static {v11}, Lo22;->Ε(Ljava/lang/Object;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v12

    .line 384
    invoke-static {v12}, Lo22;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v12

    .line 388
    if-eqz v12, :cond_14

    .line 389
    .line 390
    const-string v13, "homepage_home"

    .line 391
    .line 392
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v13

    .line 396
    if-nez v13, :cond_14

    .line 397
    .line 398
    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    if-nez v12, :cond_13

    .line 403
    .line 404
    :cond_14
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    goto :goto_a

    .line 408
    :cond_15
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 409
    .line 410
    .line 411
    move-result v10

    .line 412
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 413
    .line 414
    .line 415
    move-result v6

    .line 416
    if-eq v10, v6, :cond_2a

    .line 417
    .line 418
    invoke-virtual {v1, v9}, Lk01;->α(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 422
    .line 423
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 424
    .line 425
    .line 426
    move-result v6

    .line 427
    if-eqz v6, :cond_17

    .line 428
    .line 429
    :cond_16
    const/4 v11, 0x0

    .line 430
    goto/16 :goto_13

    .line 431
    .line 432
    :cond_17
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 433
    .line 434
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 435
    .line 436
    .line 437
    if-eqz v1, :cond_18

    .line 438
    .line 439
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    invoke-virtual {v6, v10}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    :cond_18
    if-eqz v0, :cond_1a

    .line 447
    .line 448
    sget-object v10, Lvb;->α:Ljava/util/List;

    .line 449
    .line 450
    sget-object v10, Lox;->α:Ljava/lang/Object;

    .line 451
    .line 452
    sget-object v10, Lkx;->ｂ:Lkx;

    .line 453
    .line 454
    invoke-static {v10, v0}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    if-nez v0, :cond_19

    .line 459
    .line 460
    sget-object v0, Ljz;->ε:Ljz;

    .line 461
    .line 462
    :cond_19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    if-eqz v10, :cond_1a

    .line 471
    .line 472
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v10

    .line 476
    check-cast v10, Ljava/lang/Class;

    .line 477
    .line 478
    invoke-virtual {v6, v10}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    goto :goto_b

    .line 482
    :cond_1a
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    if-eqz v6, :cond_16

    .line 491
    .line 492
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    check-cast v6, Ljava/lang/Class;

    .line 497
    .line 498
    if-eqz v1, :cond_21

    .line 499
    .line 500
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    move-result-object v10

    .line 504
    invoke-virtual {v6, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    if-eqz v10, :cond_1b

    .line 509
    .line 510
    move-object v10, v1

    .line 511
    goto :goto_d

    .line 512
    :cond_1b
    const/4 v10, 0x0

    .line 513
    :goto_d
    if-eqz v10, :cond_21

    .line 514
    .line 515
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    move-result-object v11

    .line 519
    :goto_e
    if-eqz v11, :cond_21

    .line 520
    .line 521
    const-class v12, Ljava/lang/Object;

    .line 522
    .line 523
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v12

    .line 527
    if-nez v12, :cond_21

    .line 528
    .line 529
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 530
    .line 531
    .line 532
    move-result-object v12

    .line 533
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    array-length v13, v12

    .line 537
    move v14, v5

    .line 538
    :goto_f
    if-ge v14, v13, :cond_20

    .line 539
    .line 540
    aget-object v15, v12, v14

    .line 541
    .line 542
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 543
    .line 544
    .line 545
    move-result v16

    .line 546
    invoke-static/range {v16 .. v16}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 547
    .line 548
    .line 549
    move-result v16

    .line 550
    if-nez v16, :cond_1f

    .line 551
    .line 552
    :try_start_1
    invoke-virtual {v15, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v15, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v5

    .line 559
    if-nez v5, :cond_1c

    .line 560
    .line 561
    goto :goto_10

    .line 562
    :cond_1c
    instance-of v3, v5, Ljava/util/List;

    .line 563
    .line 564
    if-eqz v3, :cond_1d

    .line 565
    .line 566
    check-cast v5, Ljava/util/List;

    .line 567
    .line 568
    invoke-static {v15, v10, v5, v2}, Lo22;->χ(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/util/List;Ljava/util/Set;)V

    .line 569
    .line 570
    .line 571
    goto :goto_10

    .line 572
    :cond_1d
    instance-of v3, v5, Ljava/util/Map;

    .line 573
    .line 574
    if-eqz v3, :cond_1e

    .line 575
    .line 576
    check-cast v5, Ljava/util/Map;

    .line 577
    .line 578
    invoke-static {v15, v10, v5, v2}, Lo22;->ψ(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Set;)V

    .line 579
    .line 580
    .line 581
    goto :goto_10

    .line 582
    :cond_1e
    invoke-static {v5, v2}, Lo22;->φ(Ljava/lang/Object;Ljava/util/Set;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 583
    .line 584
    .line 585
    :catchall_1
    :cond_1f
    :goto_10
    add-int/lit8 v14, v14, 0x1

    .line 586
    .line 587
    const/4 v5, 0x0

    .line 588
    goto :goto_f

    .line 589
    :cond_20
    invoke-virtual {v11}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    move-result-object v11

    .line 593
    const/4 v5, 0x0

    .line 594
    goto :goto_e

    .line 595
    :cond_21
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 596
    .line 597
    .line 598
    move-result-object v3

    .line 599
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    array-length v5, v3

    .line 603
    const/4 v6, 0x0

    .line 604
    :goto_11
    if-ge v6, v5, :cond_26

    .line 605
    .line 606
    aget-object v10, v3, v6

    .line 607
    .line 608
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 609
    .line 610
    .line 611
    move-result v11

    .line 612
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 613
    .line 614
    .line 615
    move-result v11

    .line 616
    if-eqz v11, :cond_25

    .line 617
    .line 618
    :try_start_2
    invoke-virtual {v10, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 619
    .line 620
    .line 621
    const/4 v11, 0x0

    .line 622
    :try_start_3
    invoke-virtual {v10, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v12

    .line 626
    if-nez v12, :cond_22

    .line 627
    .line 628
    goto :goto_12

    .line 629
    :cond_22
    instance-of v13, v12, Ljava/util/List;

    .line 630
    .line 631
    if-eqz v13, :cond_23

    .line 632
    .line 633
    check-cast v12, Ljava/util/List;

    .line 634
    .line 635
    invoke-static {v10, v11, v12, v2}, Lo22;->χ(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/util/List;Ljava/util/Set;)V

    .line 636
    .line 637
    .line 638
    goto :goto_12

    .line 639
    :cond_23
    instance-of v13, v12, Ljava/util/Map;

    .line 640
    .line 641
    if-eqz v13, :cond_24

    .line 642
    .line 643
    check-cast v12, Ljava/util/Map;

    .line 644
    .line 645
    invoke-static {v10, v11, v12, v2}, Lo22;->ψ(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Set;)V

    .line 646
    .line 647
    .line 648
    goto :goto_12

    .line 649
    :cond_24
    invoke-static {v12, v2}, Lo22;->φ(Ljava/lang/Object;Ljava/util/Set;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 650
    .line 651
    .line 652
    goto :goto_12

    .line 653
    :catchall_2
    :cond_25
    const/4 v11, 0x0

    .line 654
    :catchall_3
    :goto_12
    add-int/lit8 v6, v6, 0x1

    .line 655
    .line 656
    goto :goto_11

    .line 657
    :cond_26
    const/4 v5, 0x0

    .line 658
    goto/16 :goto_c

    .line 659
    .line 660
    :goto_13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 661
    .line 662
    .line 663
    move-result-wide v0

    .line 664
    sget-wide v2, Lo22;->Β:J

    .line 665
    .line 666
    sub-long v2, v0, v2

    .line 667
    .line 668
    const-wide/16 v4, 0x2710

    .line 669
    .line 670
    cmp-long v2, v2, v4

    .line 671
    .line 672
    if-gtz v2, :cond_27

    .line 673
    .line 674
    sget-object v2, Lo22;->Α:Ljava/lang/String;

    .line 675
    .line 676
    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    move-result v2

    .line 680
    if-nez v2, :cond_2a

    .line 681
    .line 682
    :cond_27
    if-eqz v8, :cond_28

    .line 683
    .line 684
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    if-eqz v2, :cond_28

    .line 689
    .line 690
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    goto :goto_14

    .line 695
    :cond_28
    move-object v2, v11

    .line 696
    :goto_14
    if-eqz v8, :cond_29

    .line 697
    .line 698
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    goto :goto_15

    .line 703
    :cond_29
    move-object v3, v11

    .line 704
    :goto_15
    const/4 v14, 0x0

    .line 705
    const/16 v15, 0x3e

    .line 706
    .line 707
    const-string v10, ", "

    .line 708
    .line 709
    const/4 v11, 0x0

    .line 710
    const/4 v12, 0x0

    .line 711
    const/4 v13, 0x0

    .line 712
    invoke-static/range {v9 .. v15}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    new-instance v5, Ljava/lang/StringBuilder;

    .line 717
    .line 718
    const-string v6, "r9766bd9254517fa8"

    .line 719
    .line 720
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    invoke-static {v2}, Lux;->ρ(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    sput-wide v0, Lo22;->Β:J

    .line 743
    .line 744
    sput-object v7, Lo22;->Α:Ljava/lang/String;

    .line 745
    .line 746
    :cond_2a
    :goto_16
    return-void

    .line 747
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    sget-object v0, Lf01;->ε:Ljava/lang/ThreadLocal;

    .line 751
    .line 752
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    check-cast v1, Ljava/lang/Integer;

    .line 757
    .line 758
    if-eqz v1, :cond_2b

    .line 759
    .line 760
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 761
    .line 762
    .line 763
    move-result v1

    .line 764
    goto :goto_17

    .line 765
    :cond_2b
    const/4 v1, 0x0

    .line 766
    :goto_17
    sub-int/2addr v1, v4

    .line 767
    if-gez v1, :cond_2c

    .line 768
    .line 769
    const/4 v5, 0x0

    .line 770
    goto :goto_18

    .line 771
    :cond_2c
    move v5, v1

    .line 772
    :goto_18
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    return-void

    .line 780
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 784
    .line 785
    if-nez v0, :cond_2d

    .line 786
    .line 787
    goto :goto_1b

    .line 788
    :cond_2d
    sget-object v1, Lf01;->ι:Ljava/util/Set;

    .line 789
    .line 790
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    move-result v0

    .line 794
    if-nez v0, :cond_2e

    .line 795
    .line 796
    goto :goto_1b

    .line 797
    :cond_2e
    sget-object v0, Lf01;->ζ:Ljava/lang/ThreadLocal;

    .line 798
    .line 799
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    check-cast v1, Ljava/lang/Integer;

    .line 804
    .line 805
    if-eqz v1, :cond_2f

    .line 806
    .line 807
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 808
    .line 809
    .line 810
    move-result v1

    .line 811
    goto :goto_19

    .line 812
    :cond_2f
    const/4 v1, 0x0

    .line 813
    :goto_19
    sub-int/2addr v1, v4

    .line 814
    if-gez v1, :cond_30

    .line 815
    .line 816
    const/4 v5, 0x0

    .line 817
    goto :goto_1a

    .line 818
    :cond_30
    move v5, v1

    .line 819
    :goto_1a
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 824
    .line 825
    .line 826
    :goto_1b
    return-void

    .line 827
    :pswitch_6
    const/4 v11, 0x0

    .line 828
    const-string v2, "bind:"

    .line 829
    .line 830
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    iget-object v3, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 834
    .line 835
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 836
    .line 837
    if-eqz v3, :cond_34

    .line 838
    .line 839
    const/4 v5, 0x0

    .line 840
    :try_start_4
    invoke-static {v5, v3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v5

    .line 844
    if-nez v5, :cond_31

    .line 845
    .line 846
    goto :goto_1f

    .line 847
    :cond_31
    invoke-static {v4, v3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v3

    .line 851
    instance-of v4, v3, Ljava/lang/Number;

    .line 852
    .line 853
    if-eqz v4, :cond_32

    .line 854
    .line 855
    check-cast v3, Ljava/lang/Number;

    .line 856
    .line 857
    goto :goto_1c

    .line 858
    :cond_32
    move-object v3, v11

    .line 859
    :goto_1c
    if-eqz v3, :cond_33

    .line 860
    .line 861
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 862
    .line 863
    .line 864
    move-result v3

    .line 865
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 866
    .line 867
    .line 868
    move-result-object v3

    .line 869
    goto :goto_1d

    .line 870
    :cond_33
    move-object v3, v11

    .line 871
    :goto_1d
    sget-object v4, Lah0;->α:Landroid/os/Handler;

    .line 872
    .line 873
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 874
    .line 875
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    new-instance v4, Ljava/lang/StringBuilder;

    .line 880
    .line 881
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    invoke-static {v1, v5, v3, v0}, Lah0;->Β(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    sget-object v0, Ls62;->α:Ls62;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 895
    .line 896
    goto :goto_1e

    .line 897
    :catchall_4
    move-exception v0

    .line 898
    new-instance v1, Leo1;

    .line 899
    .line 900
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 901
    .line 902
    .line 903
    move-object v0, v1

    .line 904
    :goto_1e
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    if-eqz v0, :cond_34

    .line 909
    .line 910
    sget-object v1, Lah0;->α:Landroid/os/Handler;

    .line 911
    .line 912
    const-string v1, "adapter-bind"

    .line 913
    .line 914
    invoke-static {v1, v0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 915
    .line 916
    .line 917
    :cond_34
    :goto_1f
    return-void

    .line 918
    nop

    .line 919
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lxe;->α:I

    .line 6
    .line 7
    const/4 v3, 0x7

    .line 8
    const/4 v4, 0x4

    .line 9
    const/high16 v5, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v2, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    instance-of v3, v2, Ljava/lang/Number;

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    move-object v10, v2

    .line 40
    check-cast v10, Ljava/lang/Number;

    .line 41
    .line 42
    :cond_0
    if-eqz v10, :cond_2

    .line 43
    .line 44
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iget-object v3, v1, Lk01;->β:Ljava/lang/Object;

    .line 49
    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 54
    .line 55
    invoke-static {v0, v3}, Ll82;->β(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Ll82;->γ:Ljava/lang/ThreadLocal;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    sget-wide v3, Ll82;->ι:J

    .line 73
    .line 74
    sget-object v0, Ll82;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 77
    .line 78
    .line 79
    move-result-wide v6

    .line 80
    cmp-long v0, v3, v6

    .line 81
    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    cmpg-float v0, v2, v5

    .line 85
    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    invoke-static {}, Ll82;->ε()Ljava/lang/Float;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    aput-object v0, v1, v9

    .line 105
    .line 106
    :cond_2
    :goto_0
    return-void

    .line 107
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v2, v1, Lk01;->β:Ljava/lang/Object;

    .line 111
    .line 112
    if-nez v2, :cond_3

    .line 113
    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    :cond_3
    iget-object v3, v1, Lk01;->α:Ljava/lang/reflect/Executable;

    .line 117
    .line 118
    instance-of v4, v3, Ljava/lang/reflect/Method;

    .line 119
    .line 120
    if-eqz v4, :cond_4

    .line 121
    .line 122
    check-cast v3, Ljava/lang/reflect/Method;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    move-object v3, v10

    .line 126
    :goto_1
    if-nez v3, :cond_5

    .line 127
    .line 128
    iget-object v3, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 129
    .line 130
    :cond_5
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    instance-of v4, v0, Ljava/lang/Number;

    .line 140
    .line 141
    if-eqz v4, :cond_6

    .line 142
    .line 143
    check-cast v0, Ljava/lang/Number;

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_6
    move-object v0, v10

    .line 147
    :goto_2
    if-eqz v0, :cond_7

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    goto :goto_3

    .line 158
    :cond_7
    move-object v0, v10

    .line 159
    :goto_3
    if-eqz v0, :cond_f

    .line 160
    .line 161
    sget-object v4, Ll82;->γ:Ljava/lang/ThreadLocal;

    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 168
    .line 169
    invoke-static {v4, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-nez v4, :cond_9

    .line 174
    .line 175
    sget-wide v6, Ll82;->ι:J

    .line 176
    .line 177
    sget-object v4, Ll82;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 180
    .line 181
    .line 182
    move-result-wide v11

    .line 183
    cmp-long v4, v6, v11

    .line 184
    .line 185
    if-eqz v4, :cond_9

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    cmpl-float v4, v4, v5

    .line 192
    .line 193
    if-nez v4, :cond_9

    .line 194
    .line 195
    sget-object v4, Ll82;->α:Ll82;

    .line 196
    .line 197
    invoke-static {}, Ll82;->ε()Ljava/lang/Float;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    if-eqz v4, :cond_9

    .line 202
    .line 203
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    cmpl-float v5, v6, v5

    .line 208
    .line 209
    if-lez v5, :cond_8

    .line 210
    .line 211
    move-object v10, v4

    .line 212
    :cond_8
    if-eqz v10, :cond_9

    .line 213
    .line 214
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    iget-object v5, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 219
    .line 220
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    aput-object v4, v5, v9

    .line 225
    .line 226
    :cond_9
    sget-object v4, Lgf0;->α:Lym1;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-virtual {v5}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-static {v5}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    sget-object v6, Lk82;->ε:Lk82;

    .line 248
    .line 249
    invoke-static {}, Lgf0;->α()I

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    const/high16 v10, 0x40000000    # 2.0f

    .line 254
    .line 255
    cmpg-float v10, v4, v10

    .line 256
    .line 257
    if-nez v10, :cond_d

    .line 258
    .line 259
    invoke-interface {v5}, Lss1;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    :cond_a
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    if-eqz v10, :cond_d

    .line 268
    .line 269
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    invoke-interface {v6, v10}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    check-cast v10, Ljava/lang/String;

    .line 278
    .line 279
    sget-object v11, Lgf0;->β:Ljava/util/List;

    .line 280
    .line 281
    if-eqz v11, :cond_b

    .line 282
    .line 283
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    if-eqz v12, :cond_b

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_b
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    :cond_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v12

    .line 298
    if-eqz v12, :cond_a

    .line 299
    .line 300
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v12

    .line 304
    check-cast v12, Ljava/lang/String;

    .line 305
    .line 306
    invoke-static {v10, v12, v9}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 307
    .line 308
    .line 309
    move-result v12

    .line 310
    if-eqz v12, :cond_c

    .line 311
    .line 312
    const/4 v4, 0x5

    .line 313
    invoke-static {v7, v8, v4}, Lj81;->μ(III)I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    int-to-float v4, v4

    .line 318
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    cmpl-float v0, v4, v0

    .line 323
    .line 324
    if-nez v0, :cond_e

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_e
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 328
    .line 329
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    aput-object v1, v0, v9

    .line 334
    .line 335
    :cond_f
    :goto_5
    sget-object v0, Ll82;->α:Ll82;

    .line 336
    .line 337
    invoke-static {v3, v2}, Ll82;->β(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    :goto_6
    return-void

    .line 341
    :pswitch_3
    const-string v2, "rd1fe9f51c470bd02"

    .line 342
    .line 343
    const-string v3, "legacy status filtered source="

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    iget-object v4, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 349
    .line 350
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 351
    .line 352
    if-nez v1, :cond_10

    .line 353
    .line 354
    goto/16 :goto_f

    .line 355
    .line 356
    :cond_10
    sget-object v5, Lf01;->ε:Ljava/lang/ThreadLocal;

    .line 357
    .line 358
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v11

    .line 362
    check-cast v11, Ljava/lang/Integer;

    .line 363
    .line 364
    if-eqz v11, :cond_11

    .line 365
    .line 366
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 367
    .line 368
    .line 369
    move-result v11

    .line 370
    goto :goto_7

    .line 371
    :cond_11
    move v11, v9

    .line 372
    :goto_7
    add-int/lit8 v12, v11, 0x1

    .line 373
    .line 374
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 375
    .line 376
    .line 377
    move-result-object v12

    .line 378
    invoke-virtual {v5, v12}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    iget-object v14, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 382
    .line 383
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-static {v9, v4}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    instance-of v5, v0, Ljava/util/List;

    .line 391
    .line 392
    if-eqz v5, :cond_12

    .line 393
    .line 394
    check-cast v0, Ljava/util/List;

    .line 395
    .line 396
    goto :goto_8

    .line 397
    :catchall_0
    move-exception v0

    .line 398
    goto/16 :goto_d

    .line 399
    .line 400
    :cond_12
    move-object v0, v10

    .line 401
    :goto_8
    if-nez v0, :cond_13

    .line 402
    .line 403
    goto/16 :goto_f

    .line 404
    .line 405
    :cond_13
    if-nez v11, :cond_1a

    .line 406
    .line 407
    sget-object v5, Lf01;->η:Ljava/util/Map;

    .line 408
    .line 409
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    new-instance v15, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 415
    .line 416
    .line 417
    move-result v11

    .line 418
    invoke-direct {v15, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 422
    .line 423
    .line 424
    invoke-static {v8, v4}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    instance-of v11, v8, Ljava/lang/Boolean;

    .line 429
    .line 430
    if-eqz v11, :cond_14

    .line 431
    .line 432
    check-cast v8, Ljava/lang/Boolean;

    .line 433
    .line 434
    goto :goto_9

    .line 435
    :cond_14
    move-object v8, v10

    .line 436
    :goto_9
    if-eqz v8, :cond_15

    .line 437
    .line 438
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 439
    .line 440
    .line 441
    move-result v8

    .line 442
    move/from16 v16, v8

    .line 443
    .line 444
    goto :goto_a

    .line 445
    :cond_15
    move/from16 v16, v9

    .line 446
    .line 447
    :goto_a
    invoke-static {v7, v4}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    instance-of v8, v7, Ljava/lang/Integer;

    .line 452
    .line 453
    if-eqz v8, :cond_16

    .line 454
    .line 455
    check-cast v7, Ljava/lang/Integer;

    .line 456
    .line 457
    goto :goto_b

    .line 458
    :cond_16
    move-object v7, v10

    .line 459
    :goto_b
    if-eqz v7, :cond_17

    .line 460
    .line 461
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 462
    .line 463
    .line 464
    move-result v7

    .line 465
    move/from16 v17, v7

    .line 466
    .line 467
    goto :goto_c

    .line 468
    :cond_17
    move/from16 v17, v9

    .line 469
    .line 470
    :goto_c
    invoke-static {v6, v4}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    instance-of v7, v6, Ljava/lang/String;

    .line 475
    .line 476
    if-eqz v7, :cond_18

    .line 477
    .line 478
    move-object v10, v6

    .line 479
    check-cast v10, Ljava/lang/String;

    .line 480
    .line 481
    :cond_18
    if-nez v10, :cond_19

    .line 482
    .line 483
    const-string v10, ""

    .line 484
    .line 485
    :cond_19
    move-object/from16 v18, v10

    .line 486
    .line 487
    new-instance v13, Ld01;

    .line 488
    .line 489
    invoke-direct/range {v13 .. v18}, Ld01;-><init>(Ljava/lang/reflect/Method;Ljava/util/ArrayList;ZILjava/lang/String;)V

    .line 490
    .line 491
    .line 492
    invoke-interface {v5, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    :cond_1a
    sget-object v1, Lbe0;->α:Lbe0;

    .line 496
    .line 497
    invoke-virtual {v1}, Lbe0;->η()Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-nez v1, :cond_1b

    .line 502
    .line 503
    goto :goto_f

    .line 504
    :cond_1b
    invoke-static {v0}, Lvd0;->ζ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    if-nez v1, :cond_1c

    .line 509
    .line 510
    goto :goto_f

    .line 511
    :cond_1c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 516
    .line 517
    .line 518
    move-result v6

    .line 519
    if-lt v5, v6, :cond_1d

    .line 520
    .line 521
    goto :goto_f

    .line 522
    :cond_1d
    new-instance v5, Ljava/util/ArrayList;

    .line 523
    .line 524
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 525
    .line 526
    .line 527
    aput-object v5, v4, v9

    .line 528
    .line 529
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    sub-int/2addr v0, v1

    .line 542
    new-instance v1, Ljava/lang/StringBuilder;

    .line 543
    .line 544
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    const-string v3, " removed="

    .line 551
    .line 552
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 566
    .line 567
    goto :goto_e

    .line 568
    :goto_d
    new-instance v1, Leo1;

    .line 569
    .line 570
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 571
    .line 572
    .line 573
    move-object v0, v1

    .line 574
    :goto_e
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    if-eqz v0, :cond_1e

    .line 579
    .line 580
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    const-string v1, "legacy status callback failed: "

    .line 585
    .line 586
    invoke-static {v1, v0, v2}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    :cond_1e
    :goto_f
    return-void

    .line 590
    :pswitch_4
    const-string v2, "rd1fe9f51c470bd02"

    .line 591
    .line 592
    const-string v3, "refactor status filtered source="

    .line 593
    .line 594
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    iget-object v4, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 598
    .line 599
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 600
    .line 601
    if-nez v1, :cond_1f

    .line 602
    .line 603
    goto/16 :goto_14

    .line 604
    .line 605
    :cond_1f
    sget-object v5, Lf01;->ι:Ljava/util/Set;

    .line 606
    .line 607
    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v5

    .line 611
    if-nez v5, :cond_20

    .line 612
    .line 613
    goto/16 :goto_14

    .line 614
    .line 615
    :cond_20
    sget-object v5, Lf01;->ζ:Ljava/lang/ThreadLocal;

    .line 616
    .line 617
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    check-cast v6, Ljava/lang/Integer;

    .line 622
    .line 623
    if-eqz v6, :cond_21

    .line 624
    .line 625
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 626
    .line 627
    .line 628
    move-result v6

    .line 629
    goto :goto_10

    .line 630
    :cond_21
    move v6, v9

    .line 631
    :goto_10
    add-int/lit8 v7, v6, 0x1

    .line 632
    .line 633
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 634
    .line 635
    .line 636
    move-result-object v7

    .line 637
    invoke-virtual {v5, v7}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 641
    .line 642
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    invoke-static {v9, v4}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v5

    .line 649
    instance-of v7, v5, Ljava/util/List;

    .line 650
    .line 651
    if-eqz v7, :cond_22

    .line 652
    .line 653
    move-object v10, v5

    .line 654
    check-cast v10, Ljava/util/List;

    .line 655
    .line 656
    goto :goto_11

    .line 657
    :catchall_1
    move-exception v0

    .line 658
    goto :goto_12

    .line 659
    :cond_22
    :goto_11
    if-nez v10, :cond_23

    .line 660
    .line 661
    goto/16 :goto_14

    .line 662
    .line 663
    :cond_23
    if-nez v6, :cond_24

    .line 664
    .line 665
    sget-object v5, Lf01;->θ:Ljava/util/Map;

    .line 666
    .line 667
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    new-instance v6, Ljava/util/ArrayList;

    .line 671
    .line 672
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 673
    .line 674
    .line 675
    move-result v7

    .line 676
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 680
    .line 681
    .line 682
    new-instance v7, Lc01;

    .line 683
    .line 684
    invoke-direct {v7, v0, v6}, Lc01;-><init>(Ljava/lang/reflect/Method;Ljava/util/ArrayList;)V

    .line 685
    .line 686
    .line 687
    invoke-interface {v5, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    :cond_24
    sget-object v0, Lbe0;->α:Lbe0;

    .line 691
    .line 692
    invoke-virtual {v0}, Lbe0;->η()Z

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    if-nez v0, :cond_25

    .line 697
    .line 698
    goto :goto_14

    .line 699
    :cond_25
    invoke-static {v10}, Lvd0;->ζ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    if-nez v0, :cond_26

    .line 704
    .line 705
    goto :goto_14

    .line 706
    :cond_26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 711
    .line 712
    .line 713
    move-result v5

    .line 714
    if-lt v1, v5, :cond_27

    .line 715
    .line 716
    goto :goto_14

    .line 717
    :cond_27
    new-instance v1, Ljava/util/ArrayList;

    .line 718
    .line 719
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 720
    .line 721
    .line 722
    aput-object v1, v4, v9

    .line 723
    .line 724
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 725
    .line 726
    .line 727
    move-result v1

    .line 728
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 729
    .line 730
    .line 731
    move-result v4

    .line 732
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    sub-int/2addr v4, v0

    .line 737
    new-instance v0, Ljava/lang/StringBuilder;

    .line 738
    .line 739
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    const-string v1, " removed="

    .line 746
    .line 747
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 761
    .line 762
    goto :goto_13

    .line 763
    :goto_12
    new-instance v1, Leo1;

    .line 764
    .line 765
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 766
    .line 767
    .line 768
    move-object v0, v1

    .line 769
    :goto_13
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    if-eqz v0, :cond_28

    .line 774
    .line 775
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    const-string v1, "refactor status callback failed: "

    .line 780
    .line 781
    invoke-static {v1, v0, v2}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    :cond_28
    :goto_14
    return-void

    .line 785
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 789
    .line 790
    sget-object v2, Lbe0;->α:Lbe0;

    .line 791
    .line 792
    invoke-virtual {v2}, Lbe0;->η()Z

    .line 793
    .line 794
    .line 795
    move-result v2

    .line 796
    if-nez v2, :cond_29

    .line 797
    .line 798
    goto :goto_18

    .line 799
    :cond_29
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 800
    .line 801
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    array-length v2, v0

    .line 809
    :goto_15
    if-ge v9, v2, :cond_2b

    .line 810
    .line 811
    aget-object v3, v0, v9

    .line 812
    .line 813
    const-class v4, Ljava/util/List;

    .line 814
    .line 815
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 816
    .line 817
    .line 818
    move-result v3

    .line 819
    if-eqz v3, :cond_2a

    .line 820
    .line 821
    goto :goto_16

    .line 822
    :cond_2a
    add-int/lit8 v9, v9, 0x1

    .line 823
    .line 824
    goto :goto_15

    .line 825
    :cond_2b
    const/4 v9, -0x1

    .line 826
    :goto_16
    if-gez v9, :cond_2c

    .line 827
    .line 828
    goto :goto_18

    .line 829
    :cond_2c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    invoke-static {v9, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    instance-of v2, v0, Ljava/util/List;

    .line 837
    .line 838
    if-eqz v2, :cond_2d

    .line 839
    .line 840
    move-object v10, v0

    .line 841
    check-cast v10, Ljava/util/List;

    .line 842
    .line 843
    :cond_2d
    if-nez v10, :cond_2e

    .line 844
    .line 845
    goto :goto_18

    .line 846
    :cond_2e
    new-instance v0, Ljava/util/ArrayList;

    .line 847
    .line 848
    invoke-static {v10}, Lvd0;->β(Ljava/util/List;)Ljava/util/ArrayList;

    .line 849
    .line 850
    .line 851
    move-result-object v2

    .line 852
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 853
    .line 854
    .line 855
    aput-object v0, v1, v9

    .line 856
    .line 857
    sget-object v0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 858
    .line 859
    goto :goto_17

    .line 860
    :catchall_2
    move-exception v0

    .line 861
    new-instance v1, Leo1;

    .line 862
    .line 863
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 864
    .line 865
    .line 866
    move-object v0, v1

    .line 867
    :goto_17
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    if-eqz v0, :cond_2f

    .line 872
    .line 873
    const-string v1, "r1e0d2867edbb56e0"

    .line 874
    .line 875
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    const-string v2, "search publish callback failed: "

    .line 880
    .line 881
    invoke-static {v2, v0, v1}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    :cond_2f
    :goto_18
    return-void

    .line 885
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    .line 887
    .line 888
    sget-boolean v2, Lkn0;->θ:Z

    .line 889
    .line 890
    if-eqz v2, :cond_30

    .line 891
    .line 892
    sget v2, Lkn0;->ι:I

    .line 893
    .line 894
    if-gtz v2, :cond_31

    .line 895
    .line 896
    :cond_30
    invoke-virtual {v1, v10}, Lk01;->α(Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    sget-object v1, Lq20;->α:Ljava/util/Set;

    .line 900
    .line 901
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 902
    .line 903
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    new-instance v1, Ljava/lang/StringBuilder;

    .line 908
    .line 909
    const-string v2, "skip FamiliarFeedPreloadManager."

    .line 910
    .line 911
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 915
    .line 916
    .line 917
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    invoke-static {v0}, Lq20;->κ(Ljava/lang/String;)V

    .line 922
    .line 923
    .line 924
    :cond_31
    return-void

    .line 925
    :pswitch_7
    iget-object v2, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 926
    .line 927
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    sget-object v0, Leu;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 931
    .line 932
    :try_start_3
    const-string v0, "block_douyin_duration_reminder_enabled"

    .line 933
    .line 934
    invoke-static {v0, v9}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 939
    .line 940
    .line 941
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 942
    goto :goto_19

    .line 943
    :catchall_3
    move-exception v0

    .line 944
    new-instance v3, Leo1;

    .line 945
    .line 946
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 947
    .line 948
    .line 949
    move-object v0, v3

    .line 950
    :goto_19
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 951
    .line 952
    instance-of v4, v0, Leo1;

    .line 953
    .line 954
    if-eqz v4, :cond_32

    .line 955
    .line 956
    move-object v0, v3

    .line 957
    :cond_32
    check-cast v0, Ljava/lang/Boolean;

    .line 958
    .line 959
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 960
    .line 961
    .line 962
    move-result v0

    .line 963
    if-nez v0, :cond_33

    .line 964
    .line 965
    goto :goto_1a

    .line 966
    :cond_33
    invoke-virtual {v1, v10}, Lk01;->α(Ljava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    sget-object v0, Leu;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 970
    .line 971
    invoke-virtual {v0, v9, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 972
    .line 973
    .line 974
    move-result v0

    .line 975
    if-eqz v0, :cond_34

    .line 976
    .line 977
    sget-object v0, Leu;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 978
    .line 979
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v0

    .line 987
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    new-instance v2, Ljava/lang/StringBuilder;

    .line 992
    .line 993
    const-string v3, "blocked Douyin duration reminder feed trigger: "

    .line 994
    .line 995
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    .line 1001
    const-string v0, "#"

    .line 1002
    .line 1003
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-static {v0}, Leu;->γ(Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    :cond_34
    :goto_1a
    return-void

    .line 1017
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    iget-object v2, v1, Lk01;->β:Ljava/lang/Object;

    .line 1021
    .line 1022
    if-nez v2, :cond_35

    .line 1023
    .line 1024
    goto :goto_1b

    .line 1025
    :cond_35
    sget-object v3, Leh;->α:Leh;

    .line 1026
    .line 1027
    invoke-static {}, Leh;->δ()Z

    .line 1028
    .line 1029
    .line 1030
    move-result v3

    .line 1031
    if-nez v3, :cond_36

    .line 1032
    .line 1033
    sget-object v1, Leh;->ε:Ljava/util/Map;

    .line 1034
    .line 1035
    monitor-enter v1

    .line 1036
    :try_start_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1037
    .line 1038
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1039
    .line 1040
    .line 1041
    monitor-exit v1

    .line 1042
    goto :goto_1b

    .line 1043
    :catchall_4
    move-exception v0

    .line 1044
    monitor-exit v1

    .line 1045
    throw v0

    .line 1046
    :cond_36
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 1047
    .line 1048
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1053
    .line 1054
    const-string v4, "resume "

    .line 1055
    .line 1056
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    invoke-static {v2, v0}, Leh;->ζ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v1, v10}, Lk01;->α(Ljava/lang/Object;)V

    .line 1070
    .line 1071
    .line 1072
    :goto_1b
    return-void

    .line 1073
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    .line 1075
    .line 1076
    iget-object v2, v1, Lk01;->β:Ljava/lang/Object;

    .line 1077
    .line 1078
    if-nez v2, :cond_37

    .line 1079
    .line 1080
    goto :goto_1c

    .line 1081
    :cond_37
    sget-object v3, Leh;->α:Leh;

    .line 1082
    .line 1083
    invoke-static {}, Leh;->δ()Z

    .line 1084
    .line 1085
    .line 1086
    move-result v3

    .line 1087
    if-nez v3, :cond_38

    .line 1088
    .line 1089
    sget-object v1, Leh;->ε:Ljava/util/Map;

    .line 1090
    .line 1091
    monitor-enter v1

    .line 1092
    :try_start_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1093
    .line 1094
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1095
    .line 1096
    .line 1097
    monitor-exit v1

    .line 1098
    goto :goto_1c

    .line 1099
    :catchall_5
    move-exception v0

    .line 1100
    monitor-exit v1

    .line 1101
    throw v0

    .line 1102
    :cond_38
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 1103
    .line 1104
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1109
    .line 1110
    const-string v4, "bitmap start "

    .line 1111
    .line 1112
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v0

    .line 1122
    invoke-static {v2, v0}, Leh;->ζ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1123
    .line 1124
    .line 1125
    const/16 v0, -0xc

    .line 1126
    .line 1127
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 1132
    .line 1133
    .line 1134
    :goto_1c
    return-void

    .line 1135
    :pswitch_a
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 1136
    .line 1137
    const-string v2, "enabled host chapter ad skip via "

    .line 1138
    .line 1139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1140
    .line 1141
    .line 1142
    :try_start_6
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1143
    .line 1144
    .line 1145
    move-result-wide v10

    .line 1146
    sget-object v5, Laf;->η:Ldf;

    .line 1147
    .line 1148
    new-instance v12, Lo7;

    .line 1149
    .line 1150
    const/16 v13, 0x11

    .line 1151
    .line 1152
    invoke-direct {v12, v13}, Lo7;-><init>(I)V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v5, v10, v11, v12}, Ldf;->α(JLp70;)Z

    .line 1156
    .line 1157
    .line 1158
    move-result v12

    .line 1159
    if-nez v12, :cond_39

    .line 1160
    .line 1161
    goto/16 :goto_1d

    .line 1162
    .line 1163
    :cond_39
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1164
    .line 1165
    if-nez v1, :cond_3a

    .line 1166
    .line 1167
    goto/16 :goto_1d

    .line 1168
    .line 1169
    :cond_3a
    array-length v12, v1

    .line 1170
    if-eq v12, v3, :cond_3b

    .line 1171
    .line 1172
    goto :goto_1d

    .line 1173
    :cond_3b
    aget-object v3, v1, v7

    .line 1174
    .line 1175
    instance-of v3, v3, Ljava/lang/Boolean;

    .line 1176
    .line 1177
    if-eqz v3, :cond_3e

    .line 1178
    .line 1179
    aget-object v3, v1, v6

    .line 1180
    .line 1181
    instance-of v3, v3, Ljava/lang/Boolean;

    .line 1182
    .line 1183
    if-eqz v3, :cond_3e

    .line 1184
    .line 1185
    aget-object v3, v1, v4

    .line 1186
    .line 1187
    instance-of v3, v3, Ljava/lang/Boolean;

    .line 1188
    .line 1189
    if-nez v3, :cond_3c

    .line 1190
    .line 1191
    goto :goto_1d

    .line 1192
    :cond_3c
    invoke-virtual {v5, v10, v11}, Ldf;->β(J)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v3

    .line 1196
    if-nez v3, :cond_3d

    .line 1197
    .line 1198
    goto :goto_1d

    .line 1199
    :cond_3d
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1200
    .line 1201
    aput-object v3, v1, v7

    .line 1202
    .line 1203
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1204
    .line 1205
    aput-object v3, v1, v6

    .line 1206
    .line 1207
    aput-object v3, v1, v4

    .line 1208
    .line 1209
    sget-object v1, Laf;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1210
    .line 1211
    invoke-virtual {v1, v9, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v1

    .line 1215
    if-eqz v1, :cond_3e

    .line 1216
    .line 1217
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v1

    .line 1221
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v1

    .line 1225
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1230
    .line 1231
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1235
    .line 1236
    .line 1237
    const-string v1, "#"

    .line 1238
    .line 1239
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    invoke-static {v0}, Laf;->η(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1250
    .line 1251
    .line 1252
    goto :goto_1d

    .line 1253
    :catchall_6
    move-exception v0

    .line 1254
    sget-object v1, Laf;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1255
    .line 1256
    invoke-virtual {v1, v9, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1257
    .line 1258
    .line 1259
    move-result v1

    .line 1260
    if-eqz v1, :cond_3e

    .line 1261
    .line 1262
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1267
    .line 1268
    const-string v2, "chapter callback failed: "

    .line 1269
    .line 1270
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    invoke-static {v0}, Laf;->η(Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    :cond_3e
    :goto_1d
    return-void

    .line 1284
    :pswitch_b
    iget-object v0, v0, Lxe;->β:Ljava/lang/reflect/Method;

    .line 1285
    .line 1286
    const-string v2, "enabled host chapter ad skip via "

    .line 1287
    .line 1288
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1289
    .line 1290
    .line 1291
    :try_start_7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1292
    .line 1293
    .line 1294
    move-result-wide v10

    .line 1295
    sget-object v5, Lbf;->ζ:Ldf;

    .line 1296
    .line 1297
    new-instance v12, Lo7;

    .line 1298
    .line 1299
    const/16 v13, 0x10

    .line 1300
    .line 1301
    invoke-direct {v12, v13}, Lo7;-><init>(I)V

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v5, v10, v11, v12}, Ldf;->α(JLp70;)Z

    .line 1305
    .line 1306
    .line 1307
    move-result v12

    .line 1308
    if-nez v12, :cond_3f

    .line 1309
    .line 1310
    goto/16 :goto_1e

    .line 1311
    .line 1312
    :cond_3f
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1313
    .line 1314
    if-nez v1, :cond_40

    .line 1315
    .line 1316
    goto/16 :goto_1e

    .line 1317
    .line 1318
    :cond_40
    array-length v12, v1

    .line 1319
    if-eq v12, v3, :cond_41

    .line 1320
    .line 1321
    goto :goto_1e

    .line 1322
    :cond_41
    aget-object v3, v1, v7

    .line 1323
    .line 1324
    instance-of v3, v3, Ljava/lang/Boolean;

    .line 1325
    .line 1326
    if-eqz v3, :cond_44

    .line 1327
    .line 1328
    aget-object v3, v1, v6

    .line 1329
    .line 1330
    instance-of v3, v3, Ljava/lang/Boolean;

    .line 1331
    .line 1332
    if-eqz v3, :cond_44

    .line 1333
    .line 1334
    aget-object v3, v1, v4

    .line 1335
    .line 1336
    instance-of v3, v3, Ljava/lang/Boolean;

    .line 1337
    .line 1338
    if-nez v3, :cond_42

    .line 1339
    .line 1340
    goto :goto_1e

    .line 1341
    :cond_42
    invoke-virtual {v5, v10, v11}, Ldf;->β(J)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v3

    .line 1345
    if-nez v3, :cond_43

    .line 1346
    .line 1347
    goto :goto_1e

    .line 1348
    :cond_43
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1349
    .line 1350
    aput-object v3, v1, v7

    .line 1351
    .line 1352
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1353
    .line 1354
    aput-object v3, v1, v6

    .line 1355
    .line 1356
    aput-object v3, v1, v4

    .line 1357
    .line 1358
    sget-object v1, Lbf;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1359
    .line 1360
    invoke-virtual {v1, v9, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1361
    .line 1362
    .line 1363
    move-result v1

    .line 1364
    if-eqz v1, :cond_44

    .line 1365
    .line 1366
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v1

    .line 1370
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v1

    .line 1374
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v0

    .line 1378
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1379
    .line 1380
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1384
    .line 1385
    .line 1386
    const-string v1, "#"

    .line 1387
    .line 1388
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1389
    .line 1390
    .line 1391
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v0

    .line 1398
    invoke-static {v0}, Lbf;->ζ(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 1399
    .line 1400
    .line 1401
    goto :goto_1e

    .line 1402
    :catchall_7
    move-exception v0

    .line 1403
    sget-object v1, Lbf;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1404
    .line 1405
    invoke-virtual {v1, v9, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1406
    .line 1407
    .line 1408
    move-result v1

    .line 1409
    if-eqz v1, :cond_44

    .line 1410
    .line 1411
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v0

    .line 1415
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1416
    .line 1417
    const-string v2, "legacy chapter callback failed: "

    .line 1418
    .line 1419
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    invoke-static {v0}, Lbf;->ζ(Ljava/lang/String;)V

    .line 1430
    .line 1431
    .line 1432
    :cond_44
    :goto_1e
    return-void

    .line 1433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
