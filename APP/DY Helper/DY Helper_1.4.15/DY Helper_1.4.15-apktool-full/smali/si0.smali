.class public final synthetic Lsi0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/String;

.field public final synthetic γ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lsi0;->α:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsi0;->γ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lsi0;->β:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Li0;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lsi0;->α:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsi0;->β:Ljava/lang/String;

    iput-object p2, p0, Lsi0;->γ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    iget v0, p0, Lsi0;->α:I

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, Lsi0;->β:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p0, p0, Lsi0;->γ:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Ljava/lang/ClassLoader;

    .line 18
    .line 19
    sget-object v7, Lry1;->ε:Ljava/lang/String;

    .line 20
    .line 21
    sget-object v8, Lry1;->θ:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v0, Lry1;->α:Lry1;

    .line 24
    .line 25
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    const/4 v10, 0x2

    .line 28
    if-eqz p2, :cond_8

    .line 29
    .line 30
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_8

    .line 39
    .line 40
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    array-length v0, v0

    .line 45
    if-eq v0, v10, :cond_0

    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_0
    :try_start_0
    invoke-virtual {p0, v8}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    new-instance v11, Leo1;

    .line 56
    .line 57
    invoke-direct {v11, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    move-object v0, v11

    .line 61
    :goto_0
    instance-of v11, v0, Leo1;

    .line 62
    .line 63
    if-eqz v11, :cond_1

    .line 64
    .line 65
    move-object v0, v4

    .line 66
    :cond_1
    move-object v11, v0

    .line 67
    check-cast v11, Ljava/lang/Class;

    .line 68
    .line 69
    if-nez v11, :cond_2

    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_2
    :try_start_1
    invoke-virtual {p0, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    new-instance v12, Leo1;

    .line 80
    .line 81
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    move-object v0, v12

    .line 85
    :goto_1
    instance-of v12, v0, Leo1;

    .line 86
    .line 87
    if-eqz v12, :cond_3

    .line 88
    .line 89
    move-object v0, v4

    .line 90
    :cond_3
    check-cast v0, Ljava/lang/Class;

    .line 91
    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_4
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    aget-object v12, v12, v3

    .line 100
    .line 101
    invoke-static {v12, v11}, Lry1;->ｔ(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_8

    .line 106
    .line 107
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    aget-object v11, v11, v5

    .line 112
    .line 113
    invoke-static {v11, v0}, Lry1;->ｔ(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_8

    .line 118
    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    invoke-static {v5, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    goto :goto_2

    .line 126
    :cond_5
    move-object p0, v4

    .line 127
    :goto_2
    if-eqz p0, :cond_6

    .line 128
    .line 129
    const-string v0, "getUuid"

    .line 130
    .line 131
    invoke-static {p0, v0}, Lry1;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    instance-of v0, p0, Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    check-cast p0, Ljava/lang/String;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    move-object p0, v4

    .line 143
    :goto_3
    if-nez p0, :cond_7

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_7
    move-object v2, p0

    .line 147
    :goto_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v0, "\u5b98\u65b9\u53d1\u9001\u6210\u529f\u56de\u8c03 conv="

    .line 150
    .line 151
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v0, " uuid="

    .line 158
    .line 159
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-static {p0}, Lry1;->ю(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v6}, Lry1;->Н(Ljava/lang/String;)Ls62;

    .line 173
    .line 174
    .line 175
    invoke-static {v6}, Lry1;->Ю(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_f

    .line 179
    .line 180
    :cond_8
    :goto_5
    const-string v2, " err="

    .line 181
    .line 182
    const/4 v11, 0x3

    .line 183
    if-eqz p2, :cond_11

    .line 184
    .line 185
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v0, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_11

    .line 194
    .line 195
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    array-length v0, v0

    .line 200
    if-eq v0, v11, :cond_9

    .line 201
    .line 202
    goto/16 :goto_a

    .line 203
    .line 204
    :cond_9
    :try_start_2
    invoke-virtual {p0, v8}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 208
    goto :goto_6

    .line 209
    :catchall_2
    move-exception v0

    .line 210
    new-instance v12, Leo1;

    .line 211
    .line 212
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    move-object v0, v12

    .line 216
    :goto_6
    instance-of v12, v0, Leo1;

    .line 217
    .line 218
    if-eqz v12, :cond_a

    .line 219
    .line 220
    move-object v0, v4

    .line 221
    :cond_a
    move-object v12, v0

    .line 222
    check-cast v12, Ljava/lang/Class;

    .line 223
    .line 224
    if-nez v12, :cond_b

    .line 225
    .line 226
    goto/16 :goto_a

    .line 227
    .line 228
    :cond_b
    :try_start_3
    invoke-virtual {p0, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 232
    goto :goto_7

    .line 233
    :catchall_3
    move-exception v0

    .line 234
    new-instance v7, Leo1;

    .line 235
    .line 236
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    move-object v0, v7

    .line 240
    :goto_7
    instance-of v7, v0, Leo1;

    .line 241
    .line 242
    if-eqz v7, :cond_c

    .line 243
    .line 244
    move-object v0, v4

    .line 245
    :cond_c
    move-object v7, v0

    .line 246
    check-cast v7, Ljava/lang/Class;

    .line 247
    .line 248
    if-nez v7, :cond_d

    .line 249
    .line 250
    goto :goto_a

    .line 251
    :cond_d
    :try_start_4
    sget-object v0, Lry1;->λ:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 257
    goto :goto_8

    .line 258
    :catchall_4
    move-exception v0

    .line 259
    new-instance v13, Leo1;

    .line 260
    .line 261
    invoke-direct {v13, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    move-object v0, v13

    .line 265
    :goto_8
    instance-of v13, v0, Leo1;

    .line 266
    .line 267
    if-eqz v13, :cond_e

    .line 268
    .line 269
    move-object v0, v4

    .line 270
    :cond_e
    check-cast v0, Ljava/lang/Class;

    .line 271
    .line 272
    if-nez v0, :cond_f

    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_f
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    aget-object v13, v13, v3

    .line 280
    .line 281
    invoke-static {v13, v12}, Lry1;->ｔ(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    if-eqz v12, :cond_11

    .line 286
    .line 287
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    aget-object v12, v12, v5

    .line 292
    .line 293
    invoke-static {v12, v7}, Lry1;->ｔ(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    if-eqz v7, :cond_11

    .line 298
    .line 299
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    aget-object v7, v7, v10

    .line 304
    .line 305
    invoke-static {v7, v0}, Lry1;->ｔ(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_11

    .line 310
    .line 311
    if-eqz v1, :cond_10

    .line 312
    .line 313
    invoke-static {v10, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    goto :goto_9

    .line 318
    :cond_10
    move-object p0, v4

    .line 319
    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    const-string v1, "\u5b98\u65b9\u53d1\u9001\u5931\u8d25\u56de\u8c03 conv="

    .line 322
    .line 323
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    invoke-static {p0, v4}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 340
    .line 341
    .line 342
    goto/16 :goto_f

    .line 343
    .line 344
    :cond_11
    :goto_a
    if-eqz p2, :cond_19

    .line 345
    .line 346
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-eqz v0, :cond_19

    .line 355
    .line 356
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    array-length v0, v0

    .line 361
    if-eq v0, v11, :cond_12

    .line 362
    .line 363
    goto/16 :goto_f

    .line 364
    .line 365
    :cond_12
    :try_start_5
    invoke-virtual {p0, v8}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 369
    goto :goto_b

    .line 370
    :catchall_5
    move-exception v0

    .line 371
    move-object p0, v0

    .line 372
    new-instance v0, Leo1;

    .line 373
    .line 374
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 375
    .line 376
    .line 377
    move-object p0, v0

    .line 378
    :goto_b
    instance-of v0, p0, Leo1;

    .line 379
    .line 380
    if-eqz v0, :cond_13

    .line 381
    .line 382
    move-object p0, v4

    .line 383
    :cond_13
    check-cast p0, Ljava/lang/Class;

    .line 384
    .line 385
    if-nez p0, :cond_14

    .line 386
    .line 387
    goto :goto_f

    .line 388
    :cond_14
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    aget-object v0, v0, v3

    .line 393
    .line 394
    invoke-static {v0, p0}, Lry1;->ｔ(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 395
    .line 396
    .line 397
    move-result p0

    .line 398
    if-eqz p0, :cond_19

    .line 399
    .line 400
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    aget-object p0, p0, v5

    .line 405
    .line 406
    const-class v0, Ljava/util/List;

    .line 407
    .line 408
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 409
    .line 410
    .line 411
    move-result p0

    .line 412
    if-eqz p0, :cond_19

    .line 413
    .line 414
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    aget-object p0, p0, v10

    .line 419
    .line 420
    const-class v0, Ljava/util/Map;

    .line 421
    .line 422
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 423
    .line 424
    .line 425
    move-result p0

    .line 426
    if-eqz p0, :cond_19

    .line 427
    .line 428
    if-eqz v1, :cond_15

    .line 429
    .line 430
    invoke-static {v10, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    goto :goto_c

    .line 435
    :cond_15
    move-object p0, v4

    .line 436
    :goto_c
    instance-of v0, p0, Ljava/util/Map;

    .line 437
    .line 438
    if-eqz v0, :cond_16

    .line 439
    .line 440
    check-cast p0, Ljava/util/Map;

    .line 441
    .line 442
    goto :goto_d

    .line 443
    :cond_16
    move-object p0, v4

    .line 444
    :goto_d
    if-eqz p0, :cond_18

    .line 445
    .line 446
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-eqz v0, :cond_17

    .line 451
    .line 452
    goto :goto_e

    .line 453
    :cond_17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 454
    .line 455
    const-string v1, "\u5b98\u65b9\u6279\u91cf\u53d1\u9001\u5931\u8d25\u56de\u8c03 conv="

    .line 456
    .line 457
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object p0

    .line 473
    invoke-static {p0, v4}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 474
    .line 475
    .line 476
    goto :goto_f

    .line 477
    :cond_18
    :goto_e
    const-string p0, "\u5b98\u65b9\u6279\u91cf\u53d1\u9001\u6210\u529f\u56de\u8c03 conv="

    .line 478
    .line 479
    invoke-virtual {p0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    invoke-static {p0}, Lry1;->ю(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    invoke-static {v6}, Lry1;->Н(Ljava/lang/String;)Ls62;

    .line 487
    .line 488
    .line 489
    invoke-static {v6}, Lry1;->Ю(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    :cond_19
    :goto_f
    return-object v4

    .line 493
    :pswitch_0
    check-cast p0, Li0;

    .line 494
    .line 495
    iget-object v0, p0, Li0;->ι:Ljava/lang/Object;

    .line 496
    .line 497
    move-object v11, v0

    .line 498
    check-cast v11, Lxi0;

    .line 499
    .line 500
    iget-object v0, p0, Li0;->θ:Ljava/lang/Object;

    .line 501
    .line 502
    move-object v10, v0

    .line 503
    check-cast v10, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 504
    .line 505
    iget-object v0, p0, Li0;->ζ:Ljava/lang/Object;

    .line 506
    .line 507
    move-object v8, v0

    .line 508
    check-cast v8, Ldj0;

    .line 509
    .line 510
    sget-object v0, Lwi0;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 511
    .line 512
    sget-object v7, Lwi0;->α:Lwi0;

    .line 513
    .line 514
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    const-class v9, Ljava/lang/Object;

    .line 519
    .line 520
    invoke-static {v7, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v7

    .line 524
    if-eqz v7, :cond_22

    .line 525
    .line 526
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object p0

    .line 533
    if-eqz p0, :cond_21

    .line 534
    .line 535
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    const v2, -0x69e9ad94

    .line 540
    .line 541
    .line 542
    if-eq v0, v2, :cond_20

    .line 543
    .line 544
    const v2, -0x4d378041

    .line 545
    .line 546
    .line 547
    if-eq v0, v2, :cond_1c

    .line 548
    .line 549
    const v1, 0x8cdac1b

    .line 550
    .line 551
    .line 552
    if-eq v0, v1, :cond_1a

    .line 553
    .line 554
    goto :goto_10

    .line 555
    :cond_1a
    const-string v0, "hashCode"

    .line 556
    .line 557
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result p0

    .line 561
    if-nez p0, :cond_1b

    .line 562
    .line 563
    goto :goto_10

    .line 564
    :cond_1b
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 565
    .line 566
    .line 567
    move-result p0

    .line 568
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    goto/16 :goto_19

    .line 573
    .line 574
    :cond_1c
    const-string v0, "equals"

    .line 575
    .line 576
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result p0

    .line 580
    if-nez p0, :cond_1d

    .line 581
    .line 582
    goto :goto_10

    .line 583
    :cond_1d
    if-eqz v1, :cond_1e

    .line 584
    .line 585
    invoke-static {v3, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    :cond_1e
    if-ne p1, v4, :cond_1f

    .line 590
    .line 591
    move v3, v5

    .line 592
    :cond_1f
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    goto/16 :goto_19

    .line 597
    .line 598
    :cond_20
    const-string v0, "toString"

    .line 599
    .line 600
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result p0

    .line 604
    if-eqz p0, :cond_21

    .line 605
    .line 606
    const-string p0, "DyHelperConversationDeleteListener"

    .line 607
    .line 608
    goto/16 :goto_19

    .line 609
    .line 610
    :cond_21
    :goto_10
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    move-result-object p0

    .line 614
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    invoke-static {p0}, Lwi0;->ζ(Ljava/lang/Class;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object p0

    .line 621
    goto/16 :goto_19

    .line 622
    .line 623
    :cond_22
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v5

    .line 627
    const-string v7, "onSuccess"

    .line 628
    .line 629
    invoke-static {v5, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v5

    .line 633
    if-eqz v5, :cond_23

    .line 634
    .line 635
    invoke-virtual {v0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    iget-object v0, v8, Ldj0;->β:Ljava/util/concurrent/ScheduledExecutorService;

    .line 639
    .line 640
    iget-object p0, p0, Li0;->η:Ljava/lang/Object;

    .line 641
    .line 642
    move-object v9, p0

    .line 643
    check-cast v9, Lcj0;

    .line 644
    .line 645
    new-instance v7, Laj0;

    .line 646
    .line 647
    const/4 v12, 0x1

    .line 648
    invoke-direct/range {v7 .. v12}, Laj0;-><init>(Ldj0;Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lxi0;I)V

    .line 649
    .line 650
    .line 651
    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    move-result-object p0

    .line 658
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    invoke-static {p0}, Lwi0;->ζ(Ljava/lang/Class;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object p0

    .line 665
    goto/16 :goto_19

    .line 666
    .line 667
    :cond_23
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v5

    .line 671
    const-string v7, "onFailure"

    .line 672
    .line 673
    invoke-static {v5, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v5

    .line 677
    if-eqz v5, :cond_31

    .line 678
    .line 679
    invoke-virtual {v0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    if-eqz v1, :cond_24

    .line 683
    .line 684
    invoke-static {v3, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    goto :goto_11

    .line 689
    :cond_24
    move-object v0, v4

    .line 690
    :goto_11
    if-nez v0, :cond_25

    .line 691
    .line 692
    const-string v0, "\u5bbf\u4e3b\u5220\u9664\u63a5\u53e3\u8fd4\u56de\u672a\u77e5\u9519\u8bef"

    .line 693
    .line 694
    :goto_12
    move-object v12, v0

    .line 695
    goto/16 :goto_18

    .line 696
    .line 697
    :cond_25
    const-string v1, "getCode"

    .line 698
    .line 699
    const-string v3, "getStatus"

    .line 700
    .line 701
    const-string v5, "getErrorCode"

    .line 702
    .line 703
    filled-new-array {v5, v1, v3}, [Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    :cond_26
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    if-eqz v3, :cond_28

    .line 720
    .line 721
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    check-cast v3, Ljava/lang/String;

    .line 726
    .line 727
    invoke-static {v0, v3}, Lwi0;->θ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v3

    .line 731
    instance-of v5, v3, Ljava/lang/Number;

    .line 732
    .line 733
    if-eqz v5, :cond_27

    .line 734
    .line 735
    check-cast v3, Ljava/lang/Number;

    .line 736
    .line 737
    goto :goto_13

    .line 738
    :cond_27
    move-object v3, v4

    .line 739
    :goto_13
    if-eqz v3, :cond_26

    .line 740
    .line 741
    goto :goto_14

    .line 742
    :cond_28
    move-object v3, v4

    .line 743
    :goto_14
    if-eqz v3, :cond_29

    .line 744
    .line 745
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 746
    .line 747
    .line 748
    move-result-wide v5

    .line 749
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 750
    .line 751
    .line 752
    move-result-object v1

    .line 753
    goto :goto_15

    .line 754
    :cond_29
    move-object v1, v4

    .line 755
    :goto_15
    const-string v3, "getMessage"

    .line 756
    .line 757
    const-string v5, "getStatusMsg"

    .line 758
    .line 759
    const-string v6, "getErrorMsg"

    .line 760
    .line 761
    filled-new-array {v6, v3, v5}, [Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    invoke-static {v3}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 770
    .line 771
    .line 772
    move-result-object v3

    .line 773
    :cond_2a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 774
    .line 775
    .line 776
    move-result v5

    .line 777
    if-eqz v5, :cond_2c

    .line 778
    .line 779
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v5

    .line 783
    check-cast v5, Ljava/lang/String;

    .line 784
    .line 785
    invoke-static {v0, v5}, Lwi0;->θ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v5

    .line 789
    instance-of v6, v5, Ljava/lang/String;

    .line 790
    .line 791
    if-eqz v6, :cond_2b

    .line 792
    .line 793
    check-cast v5, Ljava/lang/String;

    .line 794
    .line 795
    goto :goto_16

    .line 796
    :cond_2b
    move-object v5, v4

    .line 797
    :goto_16
    if-eqz v5, :cond_2a

    .line 798
    .line 799
    move-object v4, v5

    .line 800
    :cond_2c
    if-nez v4, :cond_2d

    .line 801
    .line 802
    goto :goto_17

    .line 803
    :cond_2d
    move-object v2, v4

    .line 804
    :goto_17
    const/16 v0, 0xa

    .line 805
    .line 806
    const/16 v3, 0x20

    .line 807
    .line 808
    invoke-virtual {v2, v0, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    const/16 v2, 0xd

    .line 816
    .line 817
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    const/16 v2, 0xb4

    .line 833
    .line 834
    invoke-static {v0, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    if-eqz v1, :cond_2e

    .line 839
    .line 840
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 841
    .line 842
    .line 843
    move-result v2

    .line 844
    if-nez v2, :cond_2e

    .line 845
    .line 846
    new-instance v2, Ljava/lang/StringBuilder;

    .line 847
    .line 848
    const-string v3, "\u9519\u8bef\u7801 "

    .line 849
    .line 850
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 854
    .line 855
    .line 856
    const-string v1, "\uff1a"

    .line 857
    .line 858
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 859
    .line 860
    .line 861
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    goto/16 :goto_12

    .line 869
    .line 870
    :cond_2e
    if-eqz v1, :cond_2f

    .line 871
    .line 872
    new-instance v0, Ljava/lang/StringBuilder;

    .line 873
    .line 874
    const-string v2, "\u5bbf\u4e3b\u5220\u9664\u5931\u8d25\uff0c\u9519\u8bef\u7801 "

    .line 875
    .line 876
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 880
    .line 881
    .line 882
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    goto/16 :goto_12

    .line 887
    .line 888
    :cond_2f
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 889
    .line 890
    .line 891
    move-result v1

    .line 892
    if-nez v1, :cond_30

    .line 893
    .line 894
    goto/16 :goto_12

    .line 895
    .line 896
    :cond_30
    const-string v0, "\u5bbf\u4e3b\u5220\u9664\u63a5\u53e3\u8fd4\u56de\u5931\u8d25"

    .line 897
    .line 898
    goto/16 :goto_12

    .line 899
    .line 900
    :goto_18
    iget-object v0, v8, Ldj0;->β:Ljava/util/concurrent/ScheduledExecutorService;

    .line 901
    .line 902
    iget-object p0, p0, Li0;->η:Ljava/lang/Object;

    .line 903
    .line 904
    move-object v9, p0

    .line 905
    check-cast v9, Lcj0;

    .line 906
    .line 907
    new-instance v7, Lbj0;

    .line 908
    .line 909
    const/4 v13, 0x1

    .line 910
    invoke-direct/range {v7 .. v13}, Lbj0;-><init>(Ldj0;Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lxi0;Ljava/lang/String;I)V

    .line 911
    .line 912
    .line 913
    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 914
    .line 915
    .line 916
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 917
    .line 918
    .line 919
    move-result-object p0

    .line 920
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 921
    .line 922
    .line 923
    invoke-static {p0}, Lwi0;->ζ(Ljava/lang/Class;)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object p0

    .line 927
    goto :goto_19

    .line 928
    :cond_31
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    move-result-object p0

    .line 932
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    invoke-static {p0}, Lwi0;->ζ(Ljava/lang/Class;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object p0

    .line 939
    :goto_19
    return-object p0

    .line 940
    nop

    .line 941
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
