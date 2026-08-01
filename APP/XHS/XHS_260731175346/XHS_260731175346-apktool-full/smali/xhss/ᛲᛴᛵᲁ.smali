.class public abstract Lxhss/ᛲᛴᛵᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᛵᛵᲈ:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛲᛴᛵᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/Class;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛲᛴᛵᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_38

    .line 10
    .line 11
    new-instance v1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    move-object v2, v0

    .line 17
    :goto_0
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x2

    .line 20
    const-class v7, Ljava/lang/Object;

    .line 21
    .line 22
    if-eq v2, v7, :cond_12

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    array-length v8, v7

    .line 29
    move v9, v3

    .line 30
    :goto_1
    if-ge v9, v8, :cond_11

    .line 31
    .line 32
    aget-object v10, v7, v9

    .line 33
    .line 34
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    invoke-virtual {v1, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v12

    .line 42
    if-eqz v12, :cond_0

    .line 43
    .line 44
    move/from16 v18, v4

    .line 45
    .line 46
    move/from16 v17, v5

    .line 47
    .line 48
    goto/16 :goto_9

    .line 49
    .line 50
    :cond_0
    new-instance v12, Lxhss/ᛷᛸᛷ;

    .line 51
    .line 52
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    iput-object v13, v12, Lxhss/ᛷᛸᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    and-int/lit16 v14, v13, 0x88

    .line 66
    .line 67
    if-lez v14, :cond_1

    .line 68
    .line 69
    move/from16 v18, v4

    .line 70
    .line 71
    move/from16 v17, v5

    .line 72
    .line 73
    goto/16 :goto_8

    .line 74
    .line 75
    :cond_1
    and-int/lit8 v13, v13, 0x1

    .line 76
    .line 77
    if-lez v13, :cond_2

    .line 78
    .line 79
    iput-object v10, v12, Lxhss/ᛷᛸᛷ;->ᛷᛵᛵᲈ:Ljava/lang/reflect/Field;

    .line 80
    .line 81
    :cond_2
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    add-int/lit8 v15, v14, 0x3

    .line 90
    .line 91
    new-array v15, v15, [C

    .line 92
    .line 93
    const/16 v16, 0x73

    .line 94
    .line 95
    aput-char v16, v15, v3

    .line 96
    .line 97
    const/16 v17, 0x65

    .line 98
    .line 99
    aput-char v17, v15, v4

    .line 100
    .line 101
    const/16 v17, 0x74

    .line 102
    .line 103
    aput-char v17, v15, v5

    .line 104
    .line 105
    move/from16 v17, v5

    .line 106
    .line 107
    invoke-virtual {v13, v3}, Ljava/lang/String;->charAt(I)C

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    move/from16 v18, v4

    .line 112
    .line 113
    const/16 v4, 0x7a

    .line 114
    .line 115
    const/16 v6, 0x61

    .line 116
    .line 117
    if-lt v5, v6, :cond_3

    .line 118
    .line 119
    if-gt v5, v4, :cond_3

    .line 120
    .line 121
    add-int/lit8 v5, v5, -0x20

    .line 122
    .line 123
    int-to-char v5, v5

    .line 124
    :cond_3
    const/16 v20, 0x3

    .line 125
    .line 126
    aput-char v5, v15, v20

    .line 127
    .line 128
    move/from16 v5, v18

    .line 129
    .line 130
    :goto_2
    if-ge v5, v14, :cond_4

    .line 131
    .line 132
    add-int/lit8 v20, v5, 0x3

    .line 133
    .line 134
    invoke-virtual {v13, v5}, Ljava/lang/String;->charAt(I)C

    .line 135
    .line 136
    .line 137
    move-result v21

    .line 138
    aput-char v21, v15, v20

    .line 139
    .line 140
    add-int/lit8 v5, v5, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_4
    new-instance v5, Ljava/lang/String;

    .line 144
    .line 145
    invoke-direct {v5, v15}, Ljava/lang/String;-><init>([C)V

    .line 146
    .line 147
    .line 148
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    filled-new-array {v13}, [Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    invoke-virtual {v2, v5, v13}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    iput-object v5, v12, Lxhss/ᛷᛸᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    :catch_0
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 167
    .line 168
    invoke-virtual {v5, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_7

    .line 173
    .line 174
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    add-int/lit8 v15, v14, 0x2

    .line 183
    .line 184
    new-array v15, v15, [C

    .line 185
    .line 186
    const/16 v20, 0x69

    .line 187
    .line 188
    aput-char v20, v15, v3

    .line 189
    .line 190
    aput-char v16, v15, v18

    .line 191
    .line 192
    move/from16 v16, v5

    .line 193
    .line 194
    invoke-virtual {v13, v3}, Ljava/lang/String;->charAt(I)C

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-lt v5, v6, :cond_5

    .line 199
    .line 200
    if-gt v5, v4, :cond_5

    .line 201
    .line 202
    add-int/lit8 v5, v5, -0x20

    .line 203
    .line 204
    int-to-char v5, v5

    .line 205
    :cond_5
    aput-char v5, v15, v17

    .line 206
    .line 207
    move/from16 v4, v18

    .line 208
    .line 209
    :goto_3
    if-ge v4, v14, :cond_6

    .line 210
    .line 211
    add-int/lit8 v5, v4, 0x2

    .line 212
    .line 213
    invoke-virtual {v13, v4}, Ljava/lang/String;->charAt(I)C

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    aput-char v6, v15, v5

    .line 218
    .line 219
    add-int/lit8 v4, v4, 0x1

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_6
    new-instance v4, Ljava/lang/String;

    .line 223
    .line 224
    invoke-direct {v4, v15}, Ljava/lang/String;-><init>([C)V

    .line 225
    .line 226
    .line 227
    :goto_4
    const/4 v5, 0x0

    .line 228
    goto :goto_5

    .line 229
    :cond_7
    move/from16 v16, v5

    .line 230
    .line 231
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-static {v4}, Lxhss/ᲁᛵᛸᛳ;->ᲀᲇᛳᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    goto :goto_4

    .line 240
    :goto_5
    :try_start_1
    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    iput-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 245
    .line 246
    :catch_1
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;

    .line 247
    .line 248
    if-nez v4, :cond_8

    .line 249
    .line 250
    if-eqz v16, :cond_8

    .line 251
    .line 252
    :try_start_2
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-static {v4}, Lxhss/ᲁᛵᛸᛳ;->ᲀᲇᛳᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    const/4 v5, 0x0

    .line 261
    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    iput-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 266
    .line 267
    :catch_2
    :cond_8
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛷᛵᛵᲈ:Ljava/lang/reflect/Field;

    .line 268
    .line 269
    if-nez v4, :cond_9

    .line 270
    .line 271
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;

    .line 272
    .line 273
    if-nez v4, :cond_9

    .line 274
    .line 275
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 276
    .line 277
    if-nez v4, :cond_9

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :cond_9
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;

    .line 281
    .line 282
    const-class v5, Lxhss/ᛳᲀᲈᛲ;

    .line 283
    .line 284
    if-eqz v4, :cond_b

    .line 285
    .line 286
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    check-cast v4, Lxhss/ᛳᲀᲈᛲ;

    .line 291
    .line 292
    if-eqz v4, :cond_a

    .line 293
    .line 294
    invoke-interface {v4}, Lxhss/ᛳᲀᲈᛲ;->value()Z

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    if-eqz v4, :cond_a

    .line 299
    .line 300
    move v4, v3

    .line 301
    goto :goto_6

    .line 302
    :cond_a
    move/from16 v4, v18

    .line 303
    .line 304
    :goto_6
    if-nez v4, :cond_b

    .line 305
    .line 306
    const/4 v4, 0x0

    .line 307
    iput-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;

    .line 308
    .line 309
    :cond_b
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 310
    .line 311
    if-eqz v4, :cond_d

    .line 312
    .line 313
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    check-cast v4, Lxhss/ᛳᲀᲈᛲ;

    .line 318
    .line 319
    if-eqz v4, :cond_c

    .line 320
    .line 321
    invoke-interface {v4}, Lxhss/ᛳᲀᲈᛲ;->value()Z

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-eqz v4, :cond_c

    .line 326
    .line 327
    move v4, v3

    .line 328
    goto :goto_7

    .line 329
    :cond_c
    move/from16 v4, v18

    .line 330
    .line 331
    :goto_7
    if-nez v4, :cond_d

    .line 332
    .line 333
    const/4 v5, 0x0

    .line 334
    iput-object v5, v12, Lxhss/ᛷᛸᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 335
    .line 336
    :cond_d
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;

    .line 337
    .line 338
    if-nez v4, :cond_e

    .line 339
    .line 340
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 341
    .line 342
    if-nez v4, :cond_e

    .line 343
    .line 344
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛷᛵᛵᲈ:Ljava/lang/reflect/Field;

    .line 345
    .line 346
    if-nez v4, :cond_e

    .line 347
    .line 348
    goto :goto_8

    .line 349
    :cond_e
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    iput-object v4, v12, Lxhss/ᛷᛸᛷ;->ᲇᛴᲇᛵ:Ljava/lang/Class;

    .line 354
    .line 355
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 356
    .line 357
    .line 358
    :goto_8
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛷᛵᛵᲈ:Ljava/lang/reflect/Field;

    .line 359
    .line 360
    if-nez v4, :cond_f

    .line 361
    .line 362
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;

    .line 363
    .line 364
    if-nez v4, :cond_f

    .line 365
    .line 366
    iget-object v4, v12, Lxhss/ᛷᛸᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 367
    .line 368
    if-eqz v4, :cond_10

    .line 369
    .line 370
    :cond_f
    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    :cond_10
    :goto_9
    add-int/lit8 v9, v9, 0x1

    .line 374
    .line 375
    move/from16 v5, v17

    .line 376
    .line 377
    move/from16 v4, v18

    .line 378
    .line 379
    goto/16 :goto_1

    .line 380
    .line 381
    :cond_11
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    goto/16 :goto_0

    .line 386
    .line 387
    :cond_12
    move/from16 v18, v4

    .line 388
    .line 389
    move/from16 v17, v5

    .line 390
    .line 391
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    new-array v1, v1, [Lxhss/ᛷᛸᛷ;

    .line 400
    .line 401
    invoke-interface {v2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    check-cast v1, [Lxhss/ᛷᛸᛷ;

    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    const-string v4, "java.util."

    .line 412
    .line 413
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    const-string v5, "AccAccess"

    .line 418
    .line 419
    if-eqz v4, :cond_13

    .line 420
    .line 421
    const-string v4, "net.minidev.asm."

    .line 422
    .line 423
    invoke-static {v4, v2, v5}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    goto :goto_a

    .line 428
    :cond_13
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    :goto_a
    new-instance v4, Lxhss/ᲀᛸᲈᛷ;

    .line 433
    .line 434
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    invoke-direct {v4, v5}, Lxhss/ᲀᛸᲈᛷ;-><init>(Ljava/lang/ClassLoader;)V

    .line 439
    .line 440
    .line 441
    :try_start_3
    invoke-virtual {v4, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    move-result-object v5
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    .line 445
    goto :goto_b

    .line 446
    :catch_3
    const/4 v5, 0x0

    .line 447
    :goto_b
    new-instance v6, Ljava/util/LinkedList;

    .line 448
    .line 449
    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    .line 450
    .line 451
    .line 452
    move-object v8, v0

    .line 453
    :goto_c
    if-eqz v8, :cond_15

    .line 454
    .line 455
    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    if-nez v9, :cond_15

    .line 460
    .line 461
    invoke-virtual {v6, v8}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v8}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    move-result-object v9

    .line 468
    array-length v10, v9

    .line 469
    move v11, v3

    .line 470
    :goto_d
    if-ge v11, v10, :cond_14

    .line 471
    .line 472
    aget-object v12, v9, v11

    .line 473
    .line 474
    invoke-virtual {v6, v12}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    add-int/lit8 v11, v11, 0x1

    .line 478
    .line 479
    goto :goto_d

    .line 480
    :cond_14
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    goto :goto_c

    .line 485
    :cond_15
    invoke-virtual {v6, v7}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    if-nez v5, :cond_36

    .line 489
    .line 490
    new-instance v5, Lxhss/ᲇᲈᛴᛵ;

    .line 491
    .line 492
    invoke-direct {v5, v0, v1, v4}, Lxhss/ᲇᲈᛴᛵ;-><init>(Ljava/lang/Class;[Lxhss/ᛷᛸᛷ;Lxhss/ᲀᛸᲈᛷ;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    if-eqz v1, :cond_1e

    .line 504
    .line 505
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    check-cast v1, Ljava/lang/Class;

    .line 510
    .line 511
    sget-object v4, Lxhss/ᛸᛱᲁᲇ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 512
    .line 513
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    check-cast v1, Ljava/lang/Iterable;

    .line 518
    .line 519
    if-nez v1, :cond_16

    .line 520
    .line 521
    goto :goto_13

    .line 522
    :cond_16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 527
    .line 528
    .line 529
    move-result v4

    .line 530
    if-eqz v4, :cond_1d

    .line 531
    .line 532
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    check-cast v4, Ljava/lang/Class;

    .line 537
    .line 538
    if-nez v4, :cond_17

    .line 539
    .line 540
    goto :goto_12

    .line 541
    :cond_17
    invoke-virtual {v4}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    array-length v6, v4

    .line 546
    move v8, v3

    .line 547
    :goto_10
    if-ge v8, v6, :cond_1c

    .line 548
    .line 549
    aget-object v9, v4, v8

    .line 550
    .line 551
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 552
    .line 553
    .line 554
    move-result v10

    .line 555
    and-int/lit8 v10, v10, 0x8

    .line 556
    .line 557
    if-nez v10, :cond_18

    .line 558
    .line 559
    goto :goto_11

    .line 560
    :cond_18
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    move-result-object v10

    .line 564
    array-length v11, v10

    .line 565
    move/from16 v12, v18

    .line 566
    .line 567
    if-eq v11, v12, :cond_19

    .line 568
    .line 569
    goto :goto_11

    .line 570
    :cond_19
    aget-object v10, v10, v3

    .line 571
    .line 572
    invoke-virtual {v10, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v10

    .line 576
    if-nez v10, :cond_1a

    .line 577
    .line 578
    goto :goto_11

    .line 579
    :cond_1a
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    move-result-object v10

    .line 583
    sget-object v11, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 584
    .line 585
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v11

    .line 589
    if-eqz v11, :cond_1b

    .line 590
    .line 591
    goto :goto_11

    .line 592
    :cond_1b
    iget-object v11, v5, Lxhss/ᲇᲈᛴᛵ;->ᲀᲇᛳᲁ:Ljava/util/HashMap;

    .line 593
    .line 594
    invoke-virtual {v11, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    :goto_11
    add-int/lit8 v8, v8, 0x1

    .line 598
    .line 599
    const/16 v18, 0x1

    .line 600
    .line 601
    goto :goto_10

    .line 602
    :cond_1c
    :goto_12
    const/16 v18, 0x1

    .line 603
    .line 604
    goto :goto_f

    .line 605
    :cond_1d
    :goto_13
    const/16 v18, 0x1

    .line 606
    .line 607
    goto :goto_e

    .line 608
    :cond_1e
    new-instance v9, Lxhss/ᲇᛷᛳᛵ;

    .line 609
    .line 610
    invoke-direct {v9}, Lxhss/ᲇᛷᛳᛵ;-><init>()V

    .line 611
    .line 612
    .line 613
    iget-object v0, v5, Lxhss/ᲇᲈᛴᛵ;->ᛷᛵᛵᲈ:[Lxhss/ᛷᛸᛷ;

    .line 614
    .line 615
    array-length v1, v0

    .line 616
    const/16 v4, 0xa

    .line 617
    .line 618
    if-le v1, v4, :cond_1f

    .line 619
    .line 620
    const/4 v1, 0x1

    .line 621
    goto :goto_14

    .line 622
    :cond_1f
    move v1, v3

    .line 623
    :goto_14
    const-string v4, "Lnet/minidev/asm/BeansAccess<L"

    .line 624
    .line 625
    const-string v6, ";>;"

    .line 626
    .line 627
    iget-object v7, v5, Lxhss/ᲇᲈᛴᛵ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 628
    .line 629
    invoke-static {v4, v7, v6}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v13

    .line 633
    sget-object v22, Lxhss/ᲇᲈᛴᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 634
    .line 635
    const/4 v15, 0x0

    .line 636
    const/16 v10, 0x32

    .line 637
    .line 638
    const/16 v11, 0x21

    .line 639
    .line 640
    iget-object v12, v5, Lxhss/ᲇᲈᛴᛵ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 641
    .line 642
    move-object/from16 v14, v22

    .line 643
    .line 644
    invoke-virtual/range {v9 .. v15}, Lxhss/ᲇᛷᛳᛵ;->ᛳᲁᲇᛸ(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    const/4 v13, 0x0

    .line 648
    const/4 v14, 0x0

    .line 649
    const/4 v10, 0x1

    .line 650
    const-string v11, "<init>"

    .line 651
    .line 652
    const-string v12, "()V"

    .line 653
    .line 654
    invoke-virtual/range {v9 .. v14}, Lxhss/ᲇᛷᛳᛵ;->ᲇᛴᲇᛵ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lxhss/ᲁᛶᲁᛶ;

    .line 655
    .line 656
    .line 657
    move-result-object v4

    .line 658
    const/16 v6, 0x19

    .line 659
    .line 660
    invoke-virtual {v4, v6, v3}, Lxhss/ᲁᛶᲁᛶ;->ᲁᛴᲇᛲ(II)V

    .line 661
    .line 662
    .line 663
    const-string v24, "()V"

    .line 664
    .line 665
    const/16 v25, 0x0

    .line 666
    .line 667
    const/16 v21, 0xb7

    .line 668
    .line 669
    const-string v23, "<init>"

    .line 670
    .line 671
    move-object/from16 v20, v4

    .line 672
    .line 673
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᛴᲈᛱᛴ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 674
    .line 675
    .line 676
    const/16 v8, 0xb1

    .line 677
    .line 678
    invoke-virtual {v4, v8}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 679
    .line 680
    .line 681
    const/4 v12, 0x1

    .line 682
    invoke-virtual {v4, v12, v12}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛲᛷᛱ(II)V

    .line 683
    .line 684
    .line 685
    const-string v11, "set"

    .line 686
    .line 687
    const-string v12, "(Ljava/lang/Object;ILjava/lang/Object;)V"

    .line 688
    .line 689
    invoke-virtual/range {v9 .. v14}, Lxhss/ᲇᛷᛳᛵ;->ᲇᛴᲇᛵ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lxhss/ᲁᛶᲁᛶ;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    array-length v10, v0

    .line 694
    const/16 v15, 0x15

    .line 695
    .line 696
    const/16 v11, 0xe

    .line 697
    .line 698
    if-nez v10, :cond_20

    .line 699
    .line 700
    goto/16 :goto_19

    .line 701
    .line 702
    :cond_20
    array-length v10, v0

    .line 703
    if-le v10, v11, :cond_24

    .line 704
    .line 705
    move/from16 v10, v17

    .line 706
    .line 707
    invoke-virtual {v4, v15, v10}, Lxhss/ᲁᛶᲁᛶ;->ᲁᛴᲇᛲ(II)V

    .line 708
    .line 709
    .line 710
    array-length v10, v0

    .line 711
    invoke-static {v10}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲈᲈᛲ(I)[Lxhss/ᲁᲁᛱᲀ;

    .line 712
    .line 713
    .line 714
    move-result-object v10

    .line 715
    new-instance v12, Lxhss/ᲁᲁᛱᲀ;

    .line 716
    .line 717
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 718
    .line 719
    .line 720
    array-length v13, v10

    .line 721
    const/16 v18, 0x1

    .line 722
    .line 723
    add-int/lit8 v13, v13, -0x1

    .line 724
    .line 725
    invoke-virtual {v4, v3, v13, v12, v10}, Lxhss/ᲁᛶᲁᛶ;->ᲁᛲᛴᛴ(IILxhss/ᲁᲁᛱᲀ;[Lxhss/ᲁᲁᛱᲀ;)V

    .line 726
    .line 727
    .line 728
    array-length v13, v0

    .line 729
    move v14, v3

    .line 730
    move/from16 v16, v14

    .line 731
    .line 732
    :goto_15
    if-ge v14, v13, :cond_23

    .line 733
    .line 734
    aget-object v11, v0, v14

    .line 735
    .line 736
    add-int/lit8 v20, v16, 0x1

    .line 737
    .line 738
    aget-object v6, v10, v16

    .line 739
    .line 740
    invoke-virtual {v4, v6}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛸᛳᲁ(Lxhss/ᲁᲁᛱᲀ;)V

    .line 741
    .line 742
    .line 743
    iget-object v6, v11, Lxhss/ᛷᛸᛷ;->ᛷᛵᛵᲈ:Ljava/lang/reflect/Field;

    .line 744
    .line 745
    if-nez v6, :cond_22

    .line 746
    .line 747
    iget-object v6, v11, Lxhss/ᛷᛸᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 748
    .line 749
    if-eqz v6, :cond_21

    .line 750
    .line 751
    goto :goto_16

    .line 752
    :cond_21
    invoke-virtual {v4, v8}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 753
    .line 754
    .line 755
    goto :goto_17

    .line 756
    :cond_22
    :goto_16
    invoke-virtual {v5, v4, v11}, Lxhss/ᲇᲈᛴᛵ;->ᛱᛱᛲᲇ(Lxhss/ᲁᛶᲁᛶ;Lxhss/ᛷᛸᛷ;)V

    .line 757
    .line 758
    .line 759
    :goto_17
    add-int/lit8 v14, v14, 0x1

    .line 760
    .line 761
    move/from16 v16, v20

    .line 762
    .line 763
    const/16 v6, 0x19

    .line 764
    .line 765
    const/16 v11, 0xe

    .line 766
    .line 767
    goto :goto_15

    .line 768
    :cond_23
    invoke-virtual {v4, v12}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛸᛳᲁ(Lxhss/ᲁᲁᛱᲀ;)V

    .line 769
    .line 770
    .line 771
    goto :goto_19

    .line 772
    :cond_24
    array-length v6, v0

    .line 773
    invoke-static {v6}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲈᲈᛲ(I)[Lxhss/ᲁᲁᛱᲀ;

    .line 774
    .line 775
    .line 776
    move-result-object v6

    .line 777
    array-length v8, v0

    .line 778
    move v10, v3

    .line 779
    move v11, v10

    .line 780
    :goto_18
    if-ge v10, v8, :cond_25

    .line 781
    .line 782
    aget-object v12, v0, v10

    .line 783
    .line 784
    aget-object v13, v6, v11

    .line 785
    .line 786
    invoke-static {v4, v11, v13}, Lxhss/ᲇᲈᛴᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲁᛶᲁᛶ;ILxhss/ᲁᲁᛱᲀ;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v5, v4, v12}, Lxhss/ᲇᲈᛴᛵ;->ᛱᛱᛲᲇ(Lxhss/ᲁᛶᲁᛶ;Lxhss/ᛷᛸᛷ;)V

    .line 790
    .line 791
    .line 792
    aget-object v12, v6, v11

    .line 793
    .line 794
    invoke-virtual {v4, v12}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛸᛳᲁ(Lxhss/ᲁᲁᛱᲀ;)V

    .line 795
    .line 796
    .line 797
    const/16 v23, 0x0

    .line 798
    .line 799
    const/16 v25, 0x0

    .line 800
    .line 801
    const/16 v21, 0x3

    .line 802
    .line 803
    const/16 v22, 0x0

    .line 804
    .line 805
    const/16 v24, 0x0

    .line 806
    .line 807
    move-object/from16 v20, v4

    .line 808
    .line 809
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛶᛴᲀ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    const/16 v18, 0x1

    .line 813
    .line 814
    add-int/lit8 v11, v11, 0x1

    .line 815
    .line 816
    add-int/lit8 v10, v10, 0x1

    .line 817
    .line 818
    goto :goto_18

    .line 819
    :cond_25
    :goto_19
    invoke-virtual {v5, v4}, Lxhss/ᲇᲈᛴᛵ;->ᛳᲁᲇᛸ(Lxhss/ᲁᛶᲁᛶ;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v4, v3, v3}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛲᛷᛱ(II)V

    .line 823
    .line 824
    .line 825
    const/4 v13, 0x0

    .line 826
    const/4 v14, 0x0

    .line 827
    const/4 v10, 0x1

    .line 828
    const-string v11, "get"

    .line 829
    .line 830
    const-string v12, "(Ljava/lang/Object;I)Ljava/lang/Object;"

    .line 831
    .line 832
    const/16 v4, 0xe

    .line 833
    .line 834
    invoke-virtual/range {v9 .. v14}, Lxhss/ᲇᛷᛳᛵ;->ᲇᛴᲇᛵ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lxhss/ᲁᛶᲁᛶ;

    .line 835
    .line 836
    .line 837
    move-result-object v20

    .line 838
    array-length v6, v0

    .line 839
    const/16 v10, 0xc0

    .line 840
    .line 841
    const/16 v11, 0xb0

    .line 842
    .line 843
    if-nez v6, :cond_26

    .line 844
    .line 845
    const/16 v23, 0x0

    .line 846
    .line 847
    const/16 v25, 0x0

    .line 848
    .line 849
    const/16 v21, 0x3

    .line 850
    .line 851
    const/16 v22, 0x0

    .line 852
    .line 853
    const/16 v24, 0x0

    .line 854
    .line 855
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛶᛴᲀ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    move v12, v11

    .line 859
    move-object/from16 v6, v20

    .line 860
    .line 861
    goto/16 :goto_22

    .line 862
    .line 863
    :cond_26
    move-object/from16 v6, v20

    .line 864
    .line 865
    array-length v12, v0

    .line 866
    if-le v12, v4, :cond_2d

    .line 867
    .line 868
    const/4 v4, 0x2

    .line 869
    invoke-virtual {v6, v15, v4}, Lxhss/ᲁᛶᲁᛶ;->ᲁᛴᲇᛲ(II)V

    .line 870
    .line 871
    .line 872
    array-length v4, v0

    .line 873
    invoke-static {v4}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲈᲈᛲ(I)[Lxhss/ᲁᲁᛱᲀ;

    .line 874
    .line 875
    .line 876
    move-result-object v4

    .line 877
    new-instance v12, Lxhss/ᲁᲁᛱᲀ;

    .line 878
    .line 879
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 880
    .line 881
    .line 882
    array-length v13, v4

    .line 883
    const/16 v18, 0x1

    .line 884
    .line 885
    add-int/lit8 v13, v13, -0x1

    .line 886
    .line 887
    invoke-virtual {v6, v3, v13, v12, v4}, Lxhss/ᲁᛶᲁᛶ;->ᲁᛲᛴᛴ(IILxhss/ᲁᲁᛱᲀ;[Lxhss/ᲁᲁᛱᲀ;)V

    .line 888
    .line 889
    .line 890
    array-length v13, v0

    .line 891
    move v14, v3

    .line 892
    move v15, v14

    .line 893
    :goto_1a
    if-ge v14, v13, :cond_2b

    .line 894
    .line 895
    aget-object v3, v0, v14

    .line 896
    .line 897
    add-int/lit8 v26, v15, 0x1

    .line 898
    .line 899
    aget-object v15, v4, v15

    .line 900
    .line 901
    invoke-virtual {v6, v15}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛸᛳᲁ(Lxhss/ᲁᲁᛱᲀ;)V

    .line 902
    .line 903
    .line 904
    const/16 v23, 0x0

    .line 905
    .line 906
    const/16 v25, 0x0

    .line 907
    .line 908
    const/16 v21, 0x3

    .line 909
    .line 910
    const/16 v22, 0x0

    .line 911
    .line 912
    const/16 v24, 0x0

    .line 913
    .line 914
    move-object/from16 v20, v6

    .line 915
    .line 916
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛶᛴᲀ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    iget-object v15, v3, Lxhss/ᛷᛸᛷ;->ᛷᛵᛵᲈ:Ljava/lang/reflect/Field;

    .line 920
    .line 921
    iget-object v8, v3, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;

    .line 922
    .line 923
    if-nez v15, :cond_28

    .line 924
    .line 925
    if-eqz v8, :cond_27

    .line 926
    .line 927
    const/16 v11, 0x19

    .line 928
    .line 929
    const/4 v15, 0x1

    .line 930
    goto :goto_1b

    .line 931
    :cond_27
    const/4 v15, 0x1

    .line 932
    invoke-virtual {v6, v15}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v6, v11}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 936
    .line 937
    .line 938
    goto :goto_1e

    .line 939
    :cond_28
    const/4 v15, 0x1

    .line 940
    const/16 v11, 0x19

    .line 941
    .line 942
    :goto_1b
    invoke-virtual {v6, v11, v15}, Lxhss/ᲁᛶᲁᛶ;->ᲁᛴᲇᛲ(II)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v6, v7, v10}, Lxhss/ᲁᛶᲁᛶ;->ᲈᛲᛵᲁ(Ljava/lang/String;I)V

    .line 946
    .line 947
    .line 948
    iget-object v11, v3, Lxhss/ᛷᛸᛷ;->ᲇᛴᲇᛵ:Ljava/lang/Class;

    .line 949
    .line 950
    invoke-static {v11}, Lxhss/ᲀᛲᲀᲈ;->ᲀᲇᛳᲁ(Ljava/lang/Class;)Lxhss/ᲀᛲᲀᲈ;

    .line 951
    .line 952
    .line 953
    move-result-object v11

    .line 954
    iget-object v15, v3, Lxhss/ᛷᛸᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 955
    .line 956
    if-nez v15, :cond_29

    .line 957
    .line 958
    if-nez v8, :cond_29

    .line 959
    .line 960
    goto :goto_1c

    .line 961
    :cond_29
    if-nez v8, :cond_2a

    .line 962
    .line 963
    :goto_1c
    iget-object v3, v3, Lxhss/ᛷᛸᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 964
    .line 965
    invoke-virtual {v11}, Lxhss/ᲀᛲᲀᲈ;->ᲇᛴᲇᛵ()Ljava/lang/String;

    .line 966
    .line 967
    .line 968
    move-result-object v8

    .line 969
    const/16 v15, 0xb4

    .line 970
    .line 971
    invoke-virtual {v6, v15, v7, v3, v8}, Lxhss/ᲁᛶᲁᛶ;->ᛷᛴᛷᛱ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    goto :goto_1d

    .line 975
    :cond_2a
    invoke-static {v8}, Lxhss/ᲀᛲᲀᲈ;->ᲇᛶᛴᲀ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v24

    .line 979
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v23

    .line 983
    const/16 v25, 0x0

    .line 984
    .line 985
    const/16 v21, 0xb6

    .line 986
    .line 987
    iget-object v3, v5, Lxhss/ᲇᲈᛴᛵ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 988
    .line 989
    move-object/from16 v22, v3

    .line 990
    .line 991
    move-object/from16 v20, v6

    .line 992
    .line 993
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᛴᲈᛱᛴ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 994
    .line 995
    .line 996
    :goto_1d
    invoke-static {v6, v11}, Lxhss/ᲁᛵᛸᛳ;->ᛷᛵᛵᲈ(Lxhss/ᲁᛶᲁᛶ;Lxhss/ᲀᛲᲀᲈ;)V

    .line 997
    .line 998
    .line 999
    const/16 v3, 0xb0

    .line 1000
    .line 1001
    invoke-virtual {v6, v3}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 1002
    .line 1003
    .line 1004
    :goto_1e
    add-int/lit8 v14, v14, 0x1

    .line 1005
    .line 1006
    move/from16 v15, v26

    .line 1007
    .line 1008
    const/4 v3, 0x0

    .line 1009
    const/16 v11, 0xb0

    .line 1010
    .line 1011
    goto :goto_1a

    .line 1012
    :cond_2b
    invoke-virtual {v6, v12}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛸᛳᲁ(Lxhss/ᲁᲁᛱᲀ;)V

    .line 1013
    .line 1014
    .line 1015
    const/16 v23, 0x0

    .line 1016
    .line 1017
    const/16 v25, 0x0

    .line 1018
    .line 1019
    const/16 v21, 0x3

    .line 1020
    .line 1021
    const/16 v22, 0x0

    .line 1022
    .line 1023
    const/16 v24, 0x0

    .line 1024
    .line 1025
    move-object/from16 v20, v6

    .line 1026
    .line 1027
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛶᛴᲀ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    :cond_2c
    const/16 v12, 0xb0

    .line 1031
    .line 1032
    goto :goto_22

    .line 1033
    :cond_2d
    array-length v3, v0

    .line 1034
    invoke-static {v3}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲈᲈᛲ(I)[Lxhss/ᲁᲁᛱᲀ;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v3

    .line 1038
    array-length v4, v0

    .line 1039
    const/4 v8, 0x0

    .line 1040
    const/4 v11, 0x0

    .line 1041
    :goto_1f
    if-ge v8, v4, :cond_2c

    .line 1042
    .line 1043
    aget-object v12, v0, v8

    .line 1044
    .line 1045
    aget-object v13, v3, v11

    .line 1046
    .line 1047
    invoke-static {v6, v11, v13}, Lxhss/ᲇᲈᛴᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲁᛶᲁᛶ;ILxhss/ᲁᲁᛱᲀ;)V

    .line 1048
    .line 1049
    .line 1050
    const/16 v13, 0x19

    .line 1051
    .line 1052
    const/4 v15, 0x1

    .line 1053
    invoke-virtual {v6, v13, v15}, Lxhss/ᲁᛶᲁᛶ;->ᲁᛴᲇᛲ(II)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v6, v7, v10}, Lxhss/ᲁᛶᲁᛶ;->ᲈᛲᛵᲁ(Ljava/lang/String;I)V

    .line 1057
    .line 1058
    .line 1059
    iget-object v13, v12, Lxhss/ᛷᛸᛷ;->ᲇᛴᲇᛵ:Ljava/lang/Class;

    .line 1060
    .line 1061
    iget-object v14, v12, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;

    .line 1062
    .line 1063
    iget-object v15, v12, Lxhss/ᛷᛸᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 1064
    .line 1065
    invoke-static {v13}, Lxhss/ᲀᛲᲀᲈ;->ᲀᲇᛳᲁ(Ljava/lang/Class;)Lxhss/ᲀᛲᲀᲈ;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v13

    .line 1069
    iget-object v12, v12, Lxhss/ᛷᛸᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 1070
    .line 1071
    if-nez v12, :cond_2e

    .line 1072
    .line 1073
    if-nez v14, :cond_2e

    .line 1074
    .line 1075
    goto :goto_20

    .line 1076
    :cond_2e
    if-nez v14, :cond_2f

    .line 1077
    .line 1078
    :goto_20
    invoke-virtual {v13}, Lxhss/ᲀᛲᲀᲈ;->ᲇᛴᲇᛵ()Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v12

    .line 1082
    const/16 v14, 0xb4

    .line 1083
    .line 1084
    invoke-virtual {v6, v14, v7, v15, v12}, Lxhss/ᲁᛶᲁᛶ;->ᛷᛴᛷᛱ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1085
    .line 1086
    .line 1087
    goto :goto_21

    .line 1088
    :cond_2f
    invoke-static {v14}, Lxhss/ᲀᛲᲀᲈ;->ᲇᛶᛴᲀ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v24

    .line 1092
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v23

    .line 1096
    const/16 v25, 0x0

    .line 1097
    .line 1098
    const/16 v21, 0xb6

    .line 1099
    .line 1100
    iget-object v12, v5, Lxhss/ᲇᲈᛴᛵ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 1101
    .line 1102
    move-object/from16 v20, v6

    .line 1103
    .line 1104
    move-object/from16 v22, v12

    .line 1105
    .line 1106
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᛴᲈᛱᛴ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1107
    .line 1108
    .line 1109
    :goto_21
    invoke-static {v6, v13}, Lxhss/ᲁᛵᛸᛳ;->ᛷᛵᛵᲈ(Lxhss/ᲁᛶᲁᛶ;Lxhss/ᲀᛲᲀᲈ;)V

    .line 1110
    .line 1111
    .line 1112
    const/16 v12, 0xb0

    .line 1113
    .line 1114
    invoke-virtual {v6, v12}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 1115
    .line 1116
    .line 1117
    aget-object v13, v3, v11

    .line 1118
    .line 1119
    invoke-virtual {v6, v13}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛸᛳᲁ(Lxhss/ᲁᲁᛱᲀ;)V

    .line 1120
    .line 1121
    .line 1122
    const/16 v23, 0x0

    .line 1123
    .line 1124
    const/16 v25, 0x0

    .line 1125
    .line 1126
    const/16 v21, 0x3

    .line 1127
    .line 1128
    const/16 v22, 0x0

    .line 1129
    .line 1130
    const/16 v24, 0x0

    .line 1131
    .line 1132
    move-object/from16 v20, v6

    .line 1133
    .line 1134
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛶᛴᲀ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 1135
    .line 1136
    .line 1137
    add-int/lit8 v11, v11, 0x1

    .line 1138
    .line 1139
    add-int/lit8 v8, v8, 0x1

    .line 1140
    .line 1141
    goto :goto_1f

    .line 1142
    :goto_22
    invoke-virtual {v5, v6}, Lxhss/ᲇᲈᛴᛵ;->ᛳᲁᲇᛸ(Lxhss/ᲁᛶᲁᛶ;)V

    .line 1143
    .line 1144
    .line 1145
    const/4 v3, 0x0

    .line 1146
    invoke-virtual {v6, v3, v3}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛲᛷᛱ(II)V

    .line 1147
    .line 1148
    .line 1149
    const/16 v3, 0x99

    .line 1150
    .line 1151
    if-nez v1, :cond_31

    .line 1152
    .line 1153
    const/4 v13, 0x0

    .line 1154
    const/4 v14, 0x0

    .line 1155
    move v4, v10

    .line 1156
    const/4 v10, 0x1

    .line 1157
    const-string v11, "set"

    .line 1158
    .line 1159
    move/from16 v27, v12

    .line 1160
    .line 1161
    const-string v12, "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V"

    .line 1162
    .line 1163
    move/from16 v6, v27

    .line 1164
    .line 1165
    invoke-virtual/range {v9 .. v14}, Lxhss/ᲇᛷᛳᛵ;->ᲇᛴᲇᛵ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lxhss/ᲁᛶᲁᛶ;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v8

    .line 1169
    array-length v10, v0

    .line 1170
    invoke-static {v10}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲈᲈᛲ(I)[Lxhss/ᲁᲁᛱᲀ;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v10

    .line 1174
    array-length v11, v0

    .line 1175
    const/4 v12, 0x0

    .line 1176
    const/4 v13, 0x0

    .line 1177
    :goto_23
    if-ge v12, v11, :cond_30

    .line 1178
    .line 1179
    aget-object v14, v0, v12

    .line 1180
    .line 1181
    const/16 v6, 0x19

    .line 1182
    .line 1183
    const/4 v15, 0x2

    .line 1184
    invoke-virtual {v8, v6, v15}, Lxhss/ᲁᛶᲁᛶ;->ᲁᛴᲇᛲ(II)V

    .line 1185
    .line 1186
    .line 1187
    iget-object v6, v14, Lxhss/ᛷᛸᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 1188
    .line 1189
    invoke-virtual {v8, v6}, Lxhss/ᲁᛶᲁᛶ;->ᛳᲈᲈᛲ(Ljava/lang/Object;)V

    .line 1190
    .line 1191
    .line 1192
    const-string v24, "(Ljava/lang/Object;)Z"

    .line 1193
    .line 1194
    const/16 v25, 0x0

    .line 1195
    .line 1196
    const/16 v21, 0xb6

    .line 1197
    .line 1198
    const-string v22, "java/lang/String"

    .line 1199
    .line 1200
    const-string v23, "equals"

    .line 1201
    .line 1202
    move-object/from16 v20, v8

    .line 1203
    .line 1204
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᛴᲈᛱᛴ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1205
    .line 1206
    .line 1207
    move-object/from16 v6, v20

    .line 1208
    .line 1209
    aget-object v8, v10, v13

    .line 1210
    .line 1211
    invoke-virtual {v6, v3, v8}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛶᲈᛶ(ILxhss/ᲁᲁᛱᲀ;)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v5, v6, v14}, Lxhss/ᲇᲈᛴᛵ;->ᛱᛱᛲᲇ(Lxhss/ᲁᛶᲁᛶ;Lxhss/ᛷᛸᛷ;)V

    .line 1215
    .line 1216
    .line 1217
    aget-object v8, v10, v13

    .line 1218
    .line 1219
    invoke-virtual {v6, v8}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛸᛳᲁ(Lxhss/ᲁᲁᛱᲀ;)V

    .line 1220
    .line 1221
    .line 1222
    const/16 v23, 0x0

    .line 1223
    .line 1224
    const/16 v25, 0x0

    .line 1225
    .line 1226
    const/16 v21, 0x3

    .line 1227
    .line 1228
    const/16 v22, 0x0

    .line 1229
    .line 1230
    const/16 v24, 0x0

    .line 1231
    .line 1232
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛶᛴᲀ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 1233
    .line 1234
    .line 1235
    const/16 v18, 0x1

    .line 1236
    .line 1237
    add-int/lit8 v13, v13, 0x1

    .line 1238
    .line 1239
    add-int/lit8 v12, v12, 0x1

    .line 1240
    .line 1241
    move-object v8, v6

    .line 1242
    const/16 v6, 0xb0

    .line 1243
    .line 1244
    goto :goto_23

    .line 1245
    :cond_30
    move-object v6, v8

    .line 1246
    invoke-virtual {v5, v6}, Lxhss/ᲇᲈᛴᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲁᛶᲁᛶ;)V

    .line 1247
    .line 1248
    .line 1249
    const/4 v8, 0x0

    .line 1250
    invoke-virtual {v6, v8, v8}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛲᛷᛱ(II)V

    .line 1251
    .line 1252
    .line 1253
    goto :goto_24

    .line 1254
    :cond_31
    move v4, v10

    .line 1255
    :goto_24
    if-nez v1, :cond_35

    .line 1256
    .line 1257
    const/4 v13, 0x0

    .line 1258
    const/4 v14, 0x0

    .line 1259
    const/4 v10, 0x1

    .line 1260
    const-string v11, "get"

    .line 1261
    .line 1262
    const-string v12, "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;"

    .line 1263
    .line 1264
    invoke-virtual/range {v9 .. v14}, Lxhss/ᲇᛷᛳᛵ;->ᲇᛴᲇᛵ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lxhss/ᲁᛶᲁᛶ;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v1

    .line 1268
    array-length v6, v0

    .line 1269
    invoke-static {v6}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲈᲈᛲ(I)[Lxhss/ᲁᲁᛱᲀ;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v6

    .line 1273
    array-length v8, v0

    .line 1274
    const/4 v10, 0x0

    .line 1275
    const/4 v11, 0x0

    .line 1276
    :goto_25
    if-ge v10, v8, :cond_34

    .line 1277
    .line 1278
    aget-object v12, v0, v10

    .line 1279
    .line 1280
    const/16 v13, 0x19

    .line 1281
    .line 1282
    const/4 v15, 0x2

    .line 1283
    invoke-virtual {v1, v13, v15}, Lxhss/ᲁᛶᲁᛶ;->ᲁᛴᲇᛲ(II)V

    .line 1284
    .line 1285
    .line 1286
    iget-object v13, v12, Lxhss/ᛷᛸᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 1287
    .line 1288
    iget-object v14, v12, Lxhss/ᛷᛸᛷ;->ᛳᲁᲇᛸ:Ljava/lang/reflect/Method;

    .line 1289
    .line 1290
    invoke-virtual {v1, v13}, Lxhss/ᲁᛶᲁᛶ;->ᛳᲈᲈᛲ(Ljava/lang/Object;)V

    .line 1291
    .line 1292
    .line 1293
    const-string v24, "(Ljava/lang/Object;)Z"

    .line 1294
    .line 1295
    const/16 v25, 0x0

    .line 1296
    .line 1297
    const/16 v21, 0xb6

    .line 1298
    .line 1299
    const-string v22, "java/lang/String"

    .line 1300
    .line 1301
    const-string v23, "equals"

    .line 1302
    .line 1303
    move-object/from16 v20, v1

    .line 1304
    .line 1305
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᛴᲈᛱᛴ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1306
    .line 1307
    .line 1308
    aget-object v13, v6, v11

    .line 1309
    .line 1310
    invoke-virtual {v1, v3, v13}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛶᲈᛶ(ILxhss/ᲁᲁᛱᲀ;)V

    .line 1311
    .line 1312
    .line 1313
    const/16 v13, 0x19

    .line 1314
    .line 1315
    const/4 v15, 0x1

    .line 1316
    invoke-virtual {v1, v13, v15}, Lxhss/ᲁᛶᲁᛶ;->ᲁᛴᲇᛲ(II)V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v1, v7, v4}, Lxhss/ᲁᛶᲁᛶ;->ᲈᛲᛵᲁ(Ljava/lang/String;I)V

    .line 1320
    .line 1321
    .line 1322
    iget-object v15, v12, Lxhss/ᛷᛸᛷ;->ᲇᛴᲇᛵ:Ljava/lang/Class;

    .line 1323
    .line 1324
    invoke-static {v15}, Lxhss/ᲀᛲᲀᲈ;->ᲀᲇᛳᲁ(Ljava/lang/Class;)Lxhss/ᲀᛲᲀᲈ;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v15

    .line 1328
    iget-object v3, v12, Lxhss/ᛷᛸᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 1329
    .line 1330
    if-nez v3, :cond_32

    .line 1331
    .line 1332
    if-nez v14, :cond_32

    .line 1333
    .line 1334
    goto :goto_26

    .line 1335
    :cond_32
    if-nez v14, :cond_33

    .line 1336
    .line 1337
    :goto_26
    iget-object v3, v12, Lxhss/ᛷᛸᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 1338
    .line 1339
    invoke-virtual {v15}, Lxhss/ᲀᛲᲀᲈ;->ᲇᛴᲇᛵ()Ljava/lang/String;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v12

    .line 1343
    const/16 v14, 0xb4

    .line 1344
    .line 1345
    invoke-virtual {v1, v14, v7, v3, v12}, Lxhss/ᲁᛶᲁᛶ;->ᛷᛴᛷᛱ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1346
    .line 1347
    .line 1348
    move v3, v14

    .line 1349
    goto :goto_27

    .line 1350
    :cond_33
    const/16 v3, 0xb4

    .line 1351
    .line 1352
    invoke-static {v14}, Lxhss/ᲀᛲᲀᲈ;->ᲇᛶᛴᲀ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v24

    .line 1356
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v23

    .line 1360
    const/16 v25, 0x0

    .line 1361
    .line 1362
    const/16 v21, 0xb6

    .line 1363
    .line 1364
    iget-object v12, v5, Lxhss/ᲇᲈᛴᛵ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 1365
    .line 1366
    move-object/from16 v20, v1

    .line 1367
    .line 1368
    move-object/from16 v22, v12

    .line 1369
    .line 1370
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᛴᲈᛱᛴ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1371
    .line 1372
    .line 1373
    :goto_27
    invoke-static {v1, v15}, Lxhss/ᲁᛵᛸᛳ;->ᛷᛵᛵᲈ(Lxhss/ᲁᛶᲁᛶ;Lxhss/ᲀᛲᲀᲈ;)V

    .line 1374
    .line 1375
    .line 1376
    const/16 v12, 0xb0

    .line 1377
    .line 1378
    invoke-virtual {v1, v12}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 1379
    .line 1380
    .line 1381
    aget-object v12, v6, v11

    .line 1382
    .line 1383
    invoke-virtual {v1, v12}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛸᛳᲁ(Lxhss/ᲁᲁᛱᲀ;)V

    .line 1384
    .line 1385
    .line 1386
    const/16 v23, 0x0

    .line 1387
    .line 1388
    const/16 v25, 0x0

    .line 1389
    .line 1390
    const/16 v21, 0x3

    .line 1391
    .line 1392
    const/16 v22, 0x0

    .line 1393
    .line 1394
    const/16 v24, 0x0

    .line 1395
    .line 1396
    move-object/from16 v20, v1

    .line 1397
    .line 1398
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᲇᛶᛴᲀ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 1399
    .line 1400
    .line 1401
    add-int/lit8 v11, v11, 0x1

    .line 1402
    .line 1403
    add-int/lit8 v10, v10, 0x1

    .line 1404
    .line 1405
    const/16 v3, 0x99

    .line 1406
    .line 1407
    goto/16 :goto_25

    .line 1408
    .line 1409
    :cond_34
    invoke-virtual {v5, v1}, Lxhss/ᲇᲈᛴᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲁᛶᲁᛶ;)V

    .line 1410
    .line 1411
    .line 1412
    const/4 v3, 0x0

    .line 1413
    invoke-virtual {v1, v3, v3}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛲᛷᛱ(II)V

    .line 1414
    .line 1415
    .line 1416
    :cond_35
    const/4 v13, 0x0

    .line 1417
    const/4 v14, 0x0

    .line 1418
    const/4 v10, 0x1

    .line 1419
    const-string v11, "newInstance"

    .line 1420
    .line 1421
    const-string v12, "()Ljava/lang/Object;"

    .line 1422
    .line 1423
    invoke-virtual/range {v9 .. v14}, Lxhss/ᲇᛷᛳᛵ;->ᲇᛴᲇᛵ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lxhss/ᲁᛶᲁᛶ;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v0

    .line 1427
    const/16 v1, 0xbb

    .line 1428
    .line 1429
    invoke-virtual {v0, v7, v1}, Lxhss/ᲁᛶᲁᛶ;->ᲈᛲᛵᲁ(Ljava/lang/String;I)V

    .line 1430
    .line 1431
    .line 1432
    const/16 v1, 0x59

    .line 1433
    .line 1434
    invoke-virtual {v0, v1}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 1435
    .line 1436
    .line 1437
    const-string v24, "()V"

    .line 1438
    .line 1439
    const/16 v25, 0x0

    .line 1440
    .line 1441
    const/16 v21, 0xb7

    .line 1442
    .line 1443
    iget-object v1, v5, Lxhss/ᲇᲈᛴᛵ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 1444
    .line 1445
    const-string v23, "<init>"

    .line 1446
    .line 1447
    move-object/from16 v20, v0

    .line 1448
    .line 1449
    move-object/from16 v22, v1

    .line 1450
    .line 1451
    invoke-virtual/range {v20 .. v25}, Lxhss/ᲁᛶᲁᛶ;->ᛴᲈᛱᛴ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1452
    .line 1453
    .line 1454
    const/16 v12, 0xb0

    .line 1455
    .line 1456
    invoke-virtual {v0, v12}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 1457
    .line 1458
    .line 1459
    const/4 v4, 0x2

    .line 1460
    const/4 v15, 0x1

    .line 1461
    invoke-virtual {v0, v4, v15}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛲᛷᛱ(II)V

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v9}, Lxhss/ᲇᛷᛳᛵ;->ᛱᛱᛲᲇ()[B

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    iget-object v1, v5, Lxhss/ᲇᲈᛴᛵ;->ᛱᛱᛲᲇ:Lxhss/ᲀᛸᲈᛷ;

    .line 1469
    .line 1470
    iget-object v3, v5, Lxhss/ᲇᲈᛴᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 1471
    .line 1472
    invoke-virtual {v1, v3, v0}, Lxhss/ᲀᛸᲈᛷ;->ᛷᛵᛵᲈ(Ljava/lang/String;[B)Ljava/lang/Class;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v5

    .line 1476
    :cond_36
    :try_start_4
    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v0

    .line 1480
    if-nez v0, :cond_37

    .line 1481
    .line 1482
    const/16 v19, 0x0

    .line 1483
    .line 1484
    throw v19

    .line 1485
    :catch_4
    move-exception v0

    .line 1486
    goto :goto_28

    .line 1487
    :cond_37
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1488
    .line 1489
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1490
    .line 1491
    .line 1492
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 1493
    :goto_28
    new-instance v1, Ljava/lang/RuntimeException;

    .line 1494
    .line 1495
    const-string v3, "Error constructing accessor class: "

    .line 1496
    .line 1497
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v2

    .line 1501
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1502
    .line 1503
    .line 1504
    throw v1

    .line 1505
    :cond_38
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1506
    .line 1507
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1508
    .line 1509
    .line 1510
    throw v0
.end method
