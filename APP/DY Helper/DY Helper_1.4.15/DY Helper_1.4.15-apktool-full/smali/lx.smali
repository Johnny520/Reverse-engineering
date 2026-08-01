.class public final synthetic Llx;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:La80;

.field public final synthetic η:Ljx;

.field public final synthetic θ:Lkx;

.field public final synthetic ι:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La80;Ljx;Lkx;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p5, p0, Llx;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Llx;->ζ:La80;

    .line 4
    .line 5
    iput-object p2, p0, Llx;->η:Ljx;

    .line 6
    .line 7
    iput-object p3, p0, Llx;->θ:Lkx;

    .line 8
    .line 9
    iput-object p4, p0, Llx;->ι:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Llx;->ε:I

    .line 4
    .line 5
    const-string v2, ", count="

    .line 6
    .line 7
    const-string v4, "#"

    .line 8
    .line 9
    iget-object v6, v0, Llx;->ι:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v7, v0, Llx;->θ:Lkx;

    .line 12
    .line 13
    iget-object v8, v0, Llx;->η:Ljx;

    .line 14
    .line 15
    iget-object v0, v0, Llx;->ζ:La80;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/util/List;

    .line 32
    .line 33
    new-instance v1, Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v9, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-eqz v10, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    move-object v12, v10

    .line 58
    check-cast v12, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    invoke-static {v12}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v14

    .line 68
    invoke-static {v14, v12}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v15

    .line 72
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v3, Ljava/util/ArrayList;

    .line 80
    .line 81
    array-length v5, v11

    .line 82
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    array-length v5, v11

    .line 86
    move-object/from16 p1, v0

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    :goto_1
    if-ge v0, v5, :cond_0

    .line 90
    .line 91
    move/from16 v16, v5

    .line 92
    .line 93
    aget-object v5, v11, v0

    .line 94
    .line 95
    move-object/from16 v17, v11

    .line 96
    .line 97
    const/4 v11, 0x1

    .line 98
    invoke-static {v5, v3, v0, v11}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    move/from16 v5, v16

    .line 103
    .line 104
    move-object/from16 v11, v17

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_0
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 112
    .line 113
    .line 114
    const/16 v21, 0x0

    .line 115
    .line 116
    const/16 v22, 0x3e

    .line 117
    .line 118
    const-string v17, ","

    .line 119
    .line 120
    const/16 v18, 0x0

    .line 121
    .line 122
    const/16 v19, 0x0

    .line 123
    .line 124
    const/16 v20, 0x0

    .line 125
    .line 126
    move-object/from16 v16, v3

    .line 127
    .line 128
    invoke-static/range {v16 .. v22}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v3, "("

    .line 133
    .line 134
    invoke-static {v13, v4, v14, v3, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const-string v3, "):"

    .line 139
    .line 140
    invoke-static {v0, v3, v15, v1}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_1

    .line 145
    .line 146
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    :cond_1
    move-object/from16 v0, p1

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 153
    .line 154
    const/16 v1, 0xa

    .line 155
    .line 156
    invoke-static {v9, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_4

    .line 172
    .line 173
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, Ljava/lang/reflect/Method;

    .line 178
    .line 179
    invoke-static {v3}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-static {v12, v3}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v13

    .line 191
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance v14, Ljava/util/ArrayList;

    .line 199
    .line 200
    array-length v5, v4

    .line 201
    invoke-direct {v14, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    .line 203
    .line 204
    array-length v5, v4

    .line 205
    const/4 v10, 0x0

    .line 206
    :goto_3
    if-ge v10, v5, :cond_3

    .line 207
    .line 208
    aget-object v15, v4, v10

    .line 209
    .line 210
    move-object/from16 p1, v1

    .line 211
    .line 212
    const/4 v1, 0x1

    .line 213
    invoke-static {v15, v14, v10, v1}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    move-object/from16 v1, p1

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_3
    move-object/from16 p1, v1

    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 227
    .line 228
    .line 229
    move-result v15

    .line 230
    new-instance v10, Lsx;

    .line 231
    .line 232
    invoke-direct/range {v10 .. v15}, Lsx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-object/from16 v1, p1

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_4
    invoke-virtual {v8, v7, v0}, Ljx;->κ(Lkx;Ljava/util/ArrayList;)V

    .line 242
    .line 243
    .line 244
    sget-object v0, Lox;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 245
    .line 246
    invoke-virtual {v0, v6, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 250
    .line 251
    iget-object v0, v7, Lkx;->ε:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    new-instance v3, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v4, "DexKit query methods done, key="

    .line 260
    .line 261
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    return-object v9

    .line 281
    :pswitch_0
    iget-object v1, v7, Lkx;->ε:Ljava/lang/String;

    .line 282
    .line 283
    move-object/from16 v2, p1

    .line 284
    .line 285
    check-cast v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 286
    .line 287
    sget-object v3, Lox;->α:Ljava/lang/Object;

    .line 288
    .line 289
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-interface {v0, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    check-cast v0, Ljava/lang/reflect/Field;

    .line 297
    .line 298
    if-eqz v0, :cond_5

    .line 299
    .line 300
    const/4 v11, 0x1

    .line 301
    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    new-instance v7, Lorg/json/JSONObject;

    .line 331
    .line 332
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 333
    .line 334
    .line 335
    const-string v9, "className"

    .line 336
    .line 337
    invoke-virtual {v7, v9, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    const-string v7, "fieldName"

    .line 342
    .line 343
    invoke-virtual {v2, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    const-string v3, "fieldType"

    .line 348
    .line 349
    invoke-virtual {v2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    const-string v3, "data_"

    .line 354
    .line 355
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v8, v3, v2}, Ljx;->λ(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    sget-object v2, Lox;->μ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 370
    .line 371
    invoke-virtual {v2, v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    const-string v5, "DexKit query field done, key="

    .line 387
    .line 388
    const-string v6, ", field="

    .line 389
    .line 390
    invoke-static {v5, v1, v6, v2, v4}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    goto :goto_4

    .line 405
    :cond_5
    const-string v2, "DexKit query field empty, key="

    .line 406
    .line 407
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    :goto_4
    return-object v0

    .line 415
    :pswitch_1
    move-object/from16 v1, p1

    .line 416
    .line 417
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 418
    .line 419
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    check-cast v0, Ljava/util/List;

    .line 427
    .line 428
    new-instance v1, Ljava/util/HashSet;

    .line 429
    .line 430
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 431
    .line 432
    .line 433
    new-instance v3, Ljava/util/ArrayList;

    .line 434
    .line 435
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 436
    .line 437
    .line 438
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    :cond_6
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    if-eqz v4, :cond_7

    .line 447
    .line 448
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    move-object v5, v4

    .line 453
    check-cast v5, Ljava/lang/Class;

    .line 454
    .line 455
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v5

    .line 463
    if-eqz v5, :cond_6

    .line 464
    .line 465
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    goto :goto_5

    .line 469
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 470
    .line 471
    const/16 v1, 0xa

    .line 472
    .line 473
    invoke-static {v3, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 485
    .line 486
    .line 487
    move-result v4

    .line 488
    if-eqz v4, :cond_8

    .line 489
    .line 490
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    check-cast v4, Ljava/lang/Class;

    .line 495
    .line 496
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    new-instance v5, Lcx;

    .line 500
    .line 501
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    invoke-direct {v5, v4}, Lcx;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    goto :goto_6

    .line 512
    :cond_8
    invoke-virtual {v8, v7, v0}, Ljx;->θ(Lkx;Ljava/util/List;)V

    .line 513
    .line 514
    .line 515
    sget-object v0, Lox;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 516
    .line 517
    invoke-virtual {v0, v6, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 521
    .line 522
    iget-object v0, v7, Lkx;->ε:Ljava/lang/String;

    .line 523
    .line 524
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    new-instance v4, Ljava/lang/StringBuilder;

    .line 529
    .line 530
    const-string v5, "DexKit query classes done, key="

    .line 531
    .line 532
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    return-object v3

    .line 552
    nop

    .line 553
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
