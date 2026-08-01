.class public abstract Lqa;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static volatile a:J

.field public static volatile b:J

.field public static volatile c:J

.field public static volatile d:J

.field public static volatile e:J

.field public static volatile f:J

.field public static volatile g:J

.field public static final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final j:Ljava/lang/ThreadLocal;

.field public static final k:Ljava/lang/ThreadLocal;

.field public static final l:Ljava/lang/ThreadLocal;


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
    sput-object v0, Lqa;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lqa;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lqa;->j:Ljava/lang/ThreadLocal;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lqa;->k:Ljava/lang/ThreadLocal;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lqa;->l:Ljava/lang/ThreadLocal;

    .line 35
    .line 36
    return-void
.end method

.method public static A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;
    .locals 13

    .line 1
    const-string v0, "pic"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p0, :cond_1c

    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    if-gt p1, v2, :cond_1c

    .line 8
    .line 9
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto/16 :goto_c

    .line 16
    .line 17
    :cond_0
    instance-of v3, p0, Ljava/lang/CharSequence;

    .line 18
    .line 19
    if-nez v3, :cond_1c

    .line 20
    .line 21
    instance-of v3, p0, Ljava/lang/Number;

    .line 22
    .line 23
    if-nez v3, :cond_1c

    .line 24
    .line 25
    instance-of v3, p0, Ljava/lang/Boolean;

    .line 26
    .line 27
    if-nez v3, :cond_1c

    .line 28
    .line 29
    instance-of v3, p0, Landroid/content/Context;

    .line 30
    .line 31
    if-nez v3, :cond_1c

    .line 32
    .line 33
    instance-of v3, p0, Landroid/view/View;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    goto/16 :goto_c

    .line 38
    .line 39
    :cond_1
    instance-of v3, p0, Ljava/util/Collection;

    .line 40
    .line 41
    const/16 v4, 0x50

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x1

    .line 45
    if-eqz v3, :cond_5

    .line 46
    .line 47
    check-cast p0, Ljava/util/Collection;

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    add-int/2addr v5, v6

    .line 64
    if-le v5, v4, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    add-int/lit8 v2, p1, 0x1

    .line 68
    .line 69
    invoke-static {v0, v2, p2}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_4
    :goto_0
    return-object v1

    .line 77
    :cond_5
    instance-of v3, p0, Ljava/util/Map;

    .line 78
    .line 79
    if-eqz v3, :cond_a

    .line 80
    .line 81
    check-cast p0, Ljava/util/Map;

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_9

    .line 96
    .line 97
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/util/Map$Entry;

    .line 102
    .line 103
    add-int/2addr v5, v6

    .line 104
    if-le v5, v4, :cond_7

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_7
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    add-int/lit8 v3, p1, 0x1

    .line 112
    .line 113
    invoke-static {v2, v3, p2}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    if-eqz v2, :cond_8

    .line 118
    .line 119
    return-object v2

    .line 120
    :cond_8
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0, v3, p2}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-eqz v0, :cond_6

    .line 129
    .line 130
    return-object v0

    .line 131
    :cond_9
    :goto_1
    return-object v1

    .line 132
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-eqz v7, :cond_d

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-nez v3, :cond_d

    .line 151
    .line 152
    :try_start_0
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 153
    .line 154
    .line 155
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    goto :goto_2

    .line 157
    :catchall_0
    move v0, v5

    .line 158
    :goto_2
    if-ge v5, v0, :cond_c

    .line 159
    .line 160
    if-ge v5, v4, :cond_c

    .line 161
    .line 162
    :try_start_1
    invoke-static {p0, v5}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    add-int/lit8 v3, p1, 0x1

    .line 167
    .line 168
    invoke-static {v2, v3, p2}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 172
    if-eqz v2, :cond_b

    .line 173
    .line 174
    return-object v2

    .line 175
    :catchall_1
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_c
    return-object v1

    .line 179
    :cond_d
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 188
    .line 189
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    const-string v4, "picelement"

    .line 194
    .line 195
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-eqz v3, :cond_e

    .line 200
    .line 201
    return-object p0

    .line 202
    :cond_e
    const-string v3, "picElement"

    .line 203
    .line 204
    invoke-static {p0, v3}, Lqa;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    if-eqz v3, :cond_10

    .line 209
    .line 210
    add-int/2addr p1, v6

    .line 211
    invoke-static {v3, p1, p2}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    if-nez p0, :cond_f

    .line 216
    .line 217
    return-object v3

    .line 218
    :cond_f
    return-object p0

    .line 219
    :cond_10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    :goto_3
    const-class v4, Ljava/lang/Object;

    .line 224
    .line 225
    if-eqz v3, :cond_16

    .line 226
    .line 227
    if-eq v3, v4, :cond_16

    .line 228
    .line 229
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 230
    .line 231
    .line 232
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 233
    goto :goto_4

    .line 234
    :catchall_2
    move-object v4, v1

    .line 235
    :goto_4
    if-eqz v4, :cond_15

    .line 236
    .line 237
    array-length v7, v4

    .line 238
    move v8, v5

    .line 239
    :goto_5
    if-ge v8, v7, :cond_15

    .line 240
    .line 241
    aget-object v9, v4, v8

    .line 242
    .line 243
    :try_start_3
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    if-nez v10, :cond_14

    .line 252
    .line 253
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    if-eqz v10, :cond_11

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_11
    invoke-virtual {v9, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v9, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    if-nez v10, :cond_12

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_12
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 279
    .line 280
    invoke-virtual {v9, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    invoke-virtual {v12, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v11

    .line 296
    invoke-virtual {v9, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 297
    .line 298
    .line 299
    move-result v12

    .line 300
    if-nez v12, :cond_13

    .line 301
    .line 302
    const-string v12, "image"

    .line 303
    .line 304
    invoke-virtual {v9, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    if-nez v9, :cond_13

    .line 309
    .line 310
    invoke-virtual {v11, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 311
    .line 312
    .line 313
    move-result v9

    .line 314
    if-eqz v9, :cond_14

    .line 315
    .line 316
    :cond_13
    add-int/lit8 v9, p1, 0x1

    .line 317
    .line 318
    invoke-static {v10, v9, p2}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 322
    if-eqz v9, :cond_14

    .line 323
    .line 324
    return-object v9

    .line 325
    :catchall_3
    :cond_14
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_15
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    goto :goto_3

    .line 333
    :cond_16
    if-gt p1, v2, :cond_1c

    .line 334
    .line 335
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    move v2, v5

    .line 340
    :goto_7
    if-eqz v0, :cond_1c

    .line 341
    .line 342
    if-eq v0, v4, :cond_1c

    .line 343
    .line 344
    const/16 v3, 0x60

    .line 345
    .line 346
    if-ge v2, v3, :cond_1c

    .line 347
    .line 348
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 349
    .line 350
    .line 351
    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 352
    goto :goto_8

    .line 353
    :catchall_4
    move-object v7, v1

    .line 354
    :goto_8
    if-eqz v7, :cond_1b

    .line 355
    .line 356
    array-length v8, v7

    .line 357
    move v9, v5

    .line 358
    :goto_9
    if-ge v9, v8, :cond_1b

    .line 359
    .line 360
    aget-object v10, v7, v9

    .line 361
    .line 362
    if-lt v2, v3, :cond_17

    .line 363
    .line 364
    goto :goto_b

    .line 365
    :cond_17
    :try_start_5
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 366
    .line 367
    .line 368
    move-result v11

    .line 369
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    if-nez v11, :cond_1a

    .line 374
    .line 375
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    move-result-object v11

    .line 379
    invoke-virtual {v11}, Ljava/lang/Class;->isPrimitive()Z

    .line 380
    .line 381
    .line 382
    move-result v11

    .line 383
    if-eqz v11, :cond_18

    .line 384
    .line 385
    goto :goto_a

    .line 386
    :cond_18
    invoke-virtual {v10, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v10, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    invoke-static {v10}, Lqa;->J(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v11

    .line 397
    if-nez v11, :cond_19

    .line 398
    .line 399
    goto :goto_a

    .line 400
    :cond_19
    add-int/lit8 v2, v2, 0x1

    .line 401
    .line 402
    add-int/lit8 v11, p1, 0x1

    .line 403
    .line 404
    invoke-static {v10, v11, p2}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 408
    if-eqz v10, :cond_1a

    .line 409
    .line 410
    return-object v10

    .line 411
    :catchall_5
    :cond_1a
    :goto_a
    add-int/lit8 v9, v9, 0x1

    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_1b
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    goto :goto_7

    .line 419
    :cond_1c
    :goto_c
    return-object v1
.end method

.method public static B(Ljava/lang/Object;)I
    .locals 26

    move-object/from16 v0, p0

    .line 1
    invoke-static {v0}, Lqa;->D(Ljava/lang/Object;)Lf2;

    move-result-object v1

    .line 2
    iget-object v2, v1, Lf2;->c:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move/from16 v16, v3

    goto/16 :goto_1c

    .line 3
    :cond_0
    iget-object v2, v1, Lf2;->c:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    .line 4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    invoke-static {v2, v4, v5}, Lqa;->b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 6
    iget-object v2, v1, Lf2;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    const/16 v7, 0x78

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpa;

    .line 7
    iget-object v5, v5, Lpa;->a:Ljava/lang/String;

    invoke-static {v5}, Lqa;->h(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 8
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lqa;->s(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lqa;->t(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 9
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lqa;->w(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    iget-object v8, v1, Lf2;->c:Ljava/io/Serializable;

    check-cast v8, Ljava/lang/String;

    invoke-static {v5, v8, v4}, Lqa;->F(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)I

    move-result v8

    if-lt v8, v7, :cond_1

    .line 10
    iget-object v2, v1, Lf2;->c:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, v5}, Lqa;->d(Ljava/lang/String;Ljava/io/File;)V

    goto :goto_0

    .line 11
    :cond_2
    iget-object v2, v1, Lf2;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Loa;

    .line 12
    iget-object v5, v5, Loa;->a:Ljava/io/File;

    .line 13
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lqa;->s(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 14
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lqa;->t(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lqa;->w(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    iget-object v8, v1, Lf2;->c:Ljava/io/Serializable;

    check-cast v8, Ljava/lang/String;

    .line 15
    invoke-static {v5, v8, v4}, Lqa;->F(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)I

    move-result v8

    if-lt v8, v7, :cond_3

    .line 16
    iget-object v2, v1, Lf2;->c:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, v5}, Lqa;->d(Ljava/lang/String;Ljava/io/File;)V

    goto :goto_0

    :cond_4
    move-object v5, v6

    :goto_0
    if-nez v5, :cond_f

    .line 17
    iget-object v2, v1, Lf2;->c:Ljava/io/Serializable;

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    .line 18
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 19
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-static {v9, v8, v2}, Lqa;->b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 20
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    :goto_1
    move-object v5, v6

    goto/16 :goto_7

    .line 21
    :cond_5
    :try_start_0
    invoke-static {v9}, Lqa;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_7

    :catchall_0
    :cond_6
    :goto_2
    move-object v4, v6

    goto :goto_3

    .line 23
    :cond_7
    sget-object v4, Lqa;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_6

    .line 24
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_8

    goto :goto_2

    .line 25
    :cond_8
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_6

    :goto_3
    const/16 v2, 0xdc

    if-eqz v4, :cond_9

    .line 27
    invoke-static {v4, v9, v8}, Lqa;->F(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)I

    move-result v5

    if-lt v5, v2, :cond_9

    move-object v5, v4

    goto/16 :goto_7

    .line 28
    :cond_9
    new-instance v10, Lna;

    .line 29
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 31
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 32
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    move-result-object v7

    if-eqz v7, :cond_c

    .line 33
    :try_start_1
    invoke-virtual {v7, v6}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v7

    if-nez v7, :cond_a

    move-object v7, v6

    goto :goto_4

    .line 34
    :cond_a
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    :goto_4
    if-nez v7, :cond_b

    move-object v11, v6

    goto :goto_5

    .line 35
    :cond_b
    new-instance v11, Ljava/io/File;

    const-string v12, "Tencent/MobileQQ/photo"

    invoke-direct {v11, v7, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 36
    :goto_5
    invoke-static {v4, v5, v11}, Lqa;->a(Ljava/util/ArrayList;Ljava/util/HashSet;Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    :catchall_1
    :cond_c
    new-instance v7, Ljava/io/File;

    const-string v11, "/storage/emulated/0/Android/data/com.tencent.mobileqq/Tencent/MobileQQ/photo"

    invoke-direct {v7, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5, v7}, Lqa;->a(Ljava/util/ArrayList;Ljava/util/HashSet;Ljava/io/File;)V

    .line 38
    new-instance v7, Ljava/io/File;

    const-string v11, "/sdcard/Android/data/com.tencent.mobileqq/Tencent/MobileQQ/photo"

    invoke-direct {v7, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5, v7}, Lqa;->a(Ljava/util/ArrayList;Ljava/util/HashSet;Ljava/io/File;)V

    .line 39
    new-array v5, v3, [Ljava/io/File;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/io/File;

    .line 40
    array-length v5, v4

    move v13, v3

    :goto_6
    if-ge v13, v5, :cond_d

    aget-object v7, v4, v13

    const/4 v11, 0x0

    .line 41
    filled-new-array {v3}, [I

    move-result-object v12

    invoke-static/range {v7 .. v12}, Lqa;->E(Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;Lna;I[I)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    .line 42
    :cond_d
    iget v4, v10, Lna;->b:I

    if-ge v4, v2, :cond_e

    goto/16 :goto_1

    .line 43
    :cond_e
    iget-object v2, v10, Lna;->a:Ljava/io/File;

    invoke-static {v9, v2}, Lqa;->d(Ljava/lang/String;Ljava/io/File;)V

    .line 44
    iget-object v2, v10, Lna;->a:Ljava/io/File;

    move-object v5, v2

    :cond_f
    :goto_7
    const/4 v2, 0x1

    if-eqz v5, :cond_10

    .line 45
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v4

    if-nez v4, :cond_11

    :cond_10
    move/from16 v18, v2

    move/from16 v16, v3

    goto/16 :goto_18

    .line 46
    :cond_11
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    .line 47
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    .line 48
    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v8

    .line 49
    iget-object v10, v1, Lf2;->d:Ljava/lang/Object;

    check-cast v10, Ljava/io/File;

    if-eqz v10, :cond_13

    invoke-virtual {v10}, Ljava/io/File;->isFile()Z

    move-result v10

    if-nez v10, :cond_12

    goto :goto_8

    :cond_12
    iget-object v10, v1, Lf2;->d:Ljava/lang/Object;

    check-cast v10, Ljava/io/File;

    invoke-virtual {v10}, Ljava/io/File;->length()J

    move-result-wide v10

    goto :goto_9

    :cond_13
    :goto_8
    const-wide/16 v10, -0x1

    .line 50
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    move v13, v3

    :goto_a
    if-eqz v12, :cond_21

    .line 51
    const-class v14, Ljava/lang/Object;

    if-eq v12, v14, :cond_21

    .line 52
    :try_start_2
    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_b

    :catchall_2
    move-object v14, v6

    :goto_b
    if-eqz v14, :cond_20

    .line 53
    array-length v15, v14

    move/from16 v16, v3

    :goto_c
    if-ge v3, v15, :cond_1f

    aget-object v6, v14, v3

    .line 54
    :try_start_3
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v17

    if-eqz v17, :cond_14

    :catchall_3
    move/from16 v18, v2

    :catchall_4
    move/from16 v17, v3

    :catchall_5
    move-object/from16 v19, v12

    :catchall_6
    move/from16 v20, v13

    :catchall_7
    move-object/from16 v24, v14

    :catchall_8
    move/from16 v25, v15

    goto/16 :goto_13

    .line 55
    :cond_14
    invoke-virtual {v6, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v17
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move/from16 v18, v2

    :try_start_4
    invoke-static/range {v17 .. v17}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move/from16 v17, v3

    .line 57
    :try_start_5
    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move-object/from16 v19, v12

    .line 58
    :try_start_6
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    move/from16 v20, v13

    :try_start_7
    const-class v13, Ljava/lang/String;

    if-ne v12, v13, :cond_1c

    instance-of v12, v3, Ljava/lang/String;

    if-eqz v12, :cond_1c

    .line 59
    check-cast v3, Ljava/lang/String;

    .line 60
    iget-object v12, v1, Lf2;->c:Ljava/io/Serializable;

    check-cast v12, Ljava/lang/String;

    .line 61
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v13

    move-object/from16 v21, v12

    if-nez v13, :cond_15

    :goto_d
    move-object/from16 v24, v14

    move/from16 v25, v15

    move/from16 v12, v16

    goto :goto_10

    .line 62
    :cond_15
    invoke-static {v3}, Lqa;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 63
    invoke-static {v2}, Lqa;->r(Ljava/lang/String;)Z

    move-result v22

    if-nez v22, :cond_16

    const/16 v12, 0x2f

    invoke-virtual {v13, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v23

    if-gez v23, :cond_16

    const/16 v12, 0x5c

    invoke-virtual {v13, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v23

    if-gez v23, :cond_16

    goto :goto_d

    :cond_16
    if-eqz v13, :cond_17

    if-nez v21, :cond_18

    :cond_17
    move-object/from16 v23, v13

    move-object/from16 v24, v14

    move/from16 v25, v15

    goto :goto_e

    .line 64
    :cond_18
    invoke-static {v13}, Lqa;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    move-object/from16 v23, v13

    move-object/from16 v24, v14

    const/16 v13, 0x2f

    const/16 v14, 0x5c

    :try_start_8
    invoke-virtual {v12, v14, v13}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v12
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    move/from16 v25, v15

    :try_start_9
    invoke-static/range {v21 .. v21}, Lqa;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15, v14, v13}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_f

    :goto_e
    move/from16 v12, v16

    :goto_f
    if-eqz v12, :cond_19

    move/from16 v12, v18

    goto :goto_10

    .line 65
    :cond_19
    invoke-static/range {v23 .. v23}, Lqa;->t(Ljava/lang/String;)Z

    move-result v12

    :goto_10
    if-eqz v12, :cond_1b

    .line 66
    const-string v2, "file://"

    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1a

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v12, 0x2f

    const/16 v14, 0x5c

    invoke-virtual {v4, v14, v12}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_11

    :cond_1a
    move-object v2, v4

    .line 67
    :goto_11
    invoke-virtual {v6, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_12
    add-int/lit8 v13, v20, 0x1

    goto :goto_14

    .line 68
    :cond_1b
    iget-object v12, v1, Lf2;->c:Ljava/io/Serializable;

    check-cast v12, Ljava/lang/String;

    invoke-static {v2, v3, v12}, Lqa;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 69
    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_12

    :cond_1c
    move-object/from16 v24, v14

    move/from16 v25, v15

    .line 70
    instance-of v12, v3, Ljava/io/File;

    if-eqz v12, :cond_1d

    invoke-static {v2}, Lqa;->r(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1d

    .line 71
    check-cast v3, Ljava/io/File;

    .line 72
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lqa;->t(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 73
    invoke-virtual {v6, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_12

    :cond_1d
    const-wide/16 v12, 0x0

    cmp-long v12, v8, v12

    if-lez v12, :cond_1e

    .line 74
    invoke-static {v2, v3, v10, v11}, Lqa;->I(Ljava/lang/String;Ljava/lang/Object;J)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 75
    invoke-static {v6, v0, v8, v9}, Lqa;->G(Ljava/lang/reflect/Field;Ljava/lang/Object;J)I

    move-result v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    add-int v13, v20, v2

    goto :goto_14

    :catchall_9
    :cond_1e
    :goto_13
    move/from16 v13, v20

    :goto_14
    add-int/lit8 v3, v17, 0x1

    move/from16 v2, v18

    move-object/from16 v12, v19

    move-object/from16 v14, v24

    move/from16 v15, v25

    const/4 v6, 0x0

    goto/16 :goto_c

    :cond_1f
    move/from16 v20, v13

    :goto_15
    move/from16 v18, v2

    move-object/from16 v19, v12

    goto :goto_16

    :cond_20
    move/from16 v16, v3

    goto :goto_15

    .line 76
    :goto_16
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v12

    move/from16 v3, v16

    move/from16 v2, v18

    const/4 v6, 0x0

    goto/16 :goto_a

    :cond_21
    if-lez v13, :cond_23

    .line 77
    iget-object v0, v1, Lf2;->c:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 79
    sget-wide v4, Lqa;->b:J

    sub-long v4, v2, v4

    const-wide/16 v6, 0x4b0

    cmp-long v4, v4, v6

    if-gez v4, :cond_22

    goto :goto_17

    .line 80
    :cond_22
    sput-wide v2, Lqa;->b:J

    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "original image default path restored: cache="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lqa;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", original="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    invoke-static {v1}, Lqa;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fields="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 83
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    :cond_23
    :goto_17
    return v13

    .line 84
    :goto_18
    iget-object v0, v1, Lf2;->c:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/String;

    .line 85
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 86
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 87
    invoke-static {v0, v2, v3}, Lqa;->b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 88
    iget-object v1, v1, Lf2;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move/from16 v4, v16

    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_25

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpa;

    add-int/lit8 v4, v4, 0x1

    const/16 v6, 0x18

    if-le v4, v6, :cond_24

    goto :goto_1a

    .line 89
    :cond_24
    iget-object v5, v5, Lpa;->a:Ljava/lang/String;

    invoke-static {v5, v2, v3}, Lqa;->b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    goto :goto_19

    .line 90
    :cond_25
    :goto_1a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    move/from16 v4, v16

    :goto_1b
    if-ge v4, v3, :cond_27

    if-lez v4, :cond_26

    const/16 v5, 0x2c

    .line 92
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    :cond_26
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1b

    .line 94
    :cond_27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 96
    sget-wide v4, Lqa;->c:J

    sub-long v4, v2, v4

    const-wide/16 v6, 0x708

    cmp-long v4, v4, v6

    if-gez v4, :cond_28

    goto :goto_1c

    .line 97
    :cond_28
    sput-wide v2, Lqa;->c:J

    .line 98
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "original image default path restore miss: cache="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lqa;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tokens="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    invoke-static {v1}, Lqa;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 100
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    :goto_1c
    return v16
.end method

.method public static C(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/16 v0, 0xd

    .line 7
    .line 8
    const/16 v1, 0x20

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/16 v0, 0x9

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/16 v1, 0xdc

    .line 31
    .line 32
    if-le v0, v1, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v0, "..."

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :cond_1
    return-object p0
.end method

.method public static D(Ljava/lang/Object;)Lf2;
    .locals 8

    .line 1
    new-instance v0, Lf2;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_4

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    if-eqz v1, :cond_5

    .line 15
    .line 16
    const-class v2, Ljava/lang/Object;

    .line 17
    .line 18
    if-eq v1, v2, :cond_5

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 21
    .line 22
    .line 23
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    const/4 v2, 0x0

    .line 26
    :goto_1
    if-eqz v2, :cond_4

    .line 27
    .line 28
    array-length v3, v2

    .line 29
    const/4 v4, 0x0

    .line 30
    :goto_2
    if-ge v4, v3, :cond_4

    .line 31
    .line 32
    aget-object v5, v2, v4

    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    const/4 v6, 0x1

    .line 46
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-static {v6}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    instance-of v6, v5, Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v6, :cond_2

    .line 63
    .line 64
    check-cast v5, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v6, v0, Lf2;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v6, Ljava/util/ArrayList;

    .line 69
    .line 70
    new-instance v7, Lpa;

    .line 71
    .line 72
    invoke-direct {v7, v5}, Lpa;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    invoke-static {v5}, Lqa;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-static {v6}, Lqa;->t(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-eqz v7, :cond_3

    .line 87
    .line 88
    iget-object v7, v0, Lf2;->c:Ljava/io/Serializable;

    .line 89
    .line 90
    check-cast v7, Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-nez v7, :cond_3

    .line 97
    .line 98
    iput-object v6, v0, Lf2;->c:Ljava/io/Serializable;

    .line 99
    .line 100
    invoke-static {v5}, Lqa;->h(Ljava/lang/String;)Ljava/io/File;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iput-object v5, v0, Lf2;->d:Ljava/lang/Object;

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_2
    instance-of v6, v5, Ljava/io/File;

    .line 108
    .line 109
    if-eqz v6, :cond_3

    .line 110
    .line 111
    check-cast v5, Ljava/io/File;

    .line 112
    .line 113
    iget-object v6, v0, Lf2;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v6, Ljava/util/ArrayList;

    .line 116
    .line 117
    new-instance v7, Loa;

    .line 118
    .line 119
    invoke-direct {v7, v5}, Loa;-><init>(Ljava/io/File;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-static {v6}, Lqa;->t(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-eqz v7, :cond_3

    .line 134
    .line 135
    iget-object v7, v0, Lf2;->c:Ljava/io/Serializable;

    .line 136
    .line 137
    check-cast v7, Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-nez v7, :cond_3

    .line 144
    .line 145
    iput-object v6, v0, Lf2;->c:Ljava/io/Serializable;

    .line 146
    .line 147
    iput-object v5, v0, Lf2;->d:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    .line 149
    :catchall_1
    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_5
    :goto_4
    return-object v0
.end method

.method public static E(Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;Lna;I[I)V
    .locals 10

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    aget v1, p5, v0

    .line 11
    .line 12
    const/16 v2, 0x4b0

    .line 13
    .line 14
    if-lt v1, v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    if-nez p0, :cond_1

    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_1
    array-length v1, p0

    .line 28
    move v3, v0

    .line 29
    :goto_1
    if-ge v3, v1, :cond_6

    .line 30
    .line 31
    aget-object v4, p0, v3

    .line 32
    .line 33
    if-eqz v4, :cond_6

    .line 34
    .line 35
    aget v5, p5, v0

    .line 36
    .line 37
    if-lt v5, v2, :cond_2

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_2
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const/4 v6, 0x1

    .line 45
    if-eqz v5, :cond_4

    .line 46
    .line 47
    if-ge p4, v6, :cond_3

    .line 48
    .line 49
    add-int/lit8 v8, p4, 0x1

    .line 50
    .line 51
    move-object v5, p1

    .line 52
    move-object v6, p2

    .line 53
    move-object v7, p3

    .line 54
    move-object v9, p5

    .line 55
    invoke-static/range {v4 .. v9}, Lqa;->E(Ljava/io/File;Ljava/util/ArrayList;Ljava/lang/String;Lna;I[I)V

    .line 56
    .line 57
    .line 58
    move-object p1, v6

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move-object v5, p1

    .line 61
    move-object p1, p2

    .line 62
    move-object v7, p3

    .line 63
    move-object v9, p5

    .line 64
    goto :goto_2

    .line 65
    :cond_4
    move-object v5, p1

    .line 66
    move-object p1, p2

    .line 67
    move-object v7, p3

    .line 68
    move-object v9, p5

    .line 69
    aget p2, v9, v0

    .line 70
    .line 71
    add-int/2addr p2, v6

    .line 72
    aput p2, v9, v0

    .line 73
    .line 74
    invoke-static {v4, p1, v5}, Lqa;->F(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    iget p3, v7, Lna;->b:I

    .line 79
    .line 80
    if-le p2, p3, :cond_5

    .line 81
    .line 82
    iput-object v4, v7, Lna;->a:Ljava/io/File;

    .line 83
    .line 84
    iput p2, v7, Lna;->b:I

    .line 85
    .line 86
    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    move-object p2, p1

    .line 89
    move-object p1, v5

    .line 90
    move-object p3, v7

    .line 91
    move-object p5, v9

    .line 92
    goto :goto_1

    .line 93
    :cond_6
    :goto_3
    return-void
.end method

.method public static F(Ljava/io/File;Ljava/lang/String;Ljava/util/ArrayList;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_b

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lqa;->w(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p1}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Lqa;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-lez v3, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    const/16 v1, 0xdc

    .line 53
    .line 54
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-lez v3, :cond_2

    .line 59
    .line 60
    const-string v3, "_0_wifi_0.jpg"

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    add-int/lit16 v1, v1, 0x140

    .line 73
    .line 74
    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    :cond_3
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_7

    .line 83
    .line 84
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    const/16 v4, 0x18

    .line 108
    .line 109
    if-lt v3, v4, :cond_5

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x5a

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    const/16 v3, 0xc

    .line 119
    .line 120
    if-lt v2, v3, :cond_6

    .line 121
    .line 122
    add-int/lit8 v1, v1, 0x24

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_6
    add-int/lit8 v1, v1, 0xa

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_7
    const-string p2, "_0_wifi_"

    .line 129
    .line 130
    invoke-virtual {v0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_8

    .line 135
    .line 136
    add-int/lit8 v1, v1, 0x18

    .line 137
    .line 138
    :cond_8
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-static {p2}, Lqa;->s(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-eqz p2, :cond_9

    .line 147
    .line 148
    add-int/lit8 v1, v1, 0x18

    .line 149
    .line 150
    :cond_9
    :try_start_0
    invoke-static {p1}, Lqa;->h(Ljava/lang/String;)Ljava/io/File;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-nez p1, :cond_a

    .line 155
    .line 156
    const-wide/16 p1, -0x1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_a
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 160
    .line 161
    .line 162
    move-result-wide p1

    .line 163
    :goto_1
    const-wide/16 v2, 0x0

    .line 164
    .line 165
    cmp-long v0, p1, v2

    .line 166
    .line 167
    if-lez v0, :cond_b

    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 170
    .line 171
    .line 172
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    cmp-long p0, v2, p1

    .line 174
    .line 175
    if-lez p0, :cond_b

    .line 176
    .line 177
    add-int/lit8 v1, v1, 0x14

    .line 178
    .line 179
    :catchall_0
    :cond_b
    :goto_2
    return v1
.end method

.method public static G(Ljava/lang/reflect/Field;Ljava/lang/Object;J)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    if-eq v0, v1, :cond_5

    .line 8
    .line 9
    const-class v1, Ljava/lang/Long;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    if-eq v0, v1, :cond_4

    .line 17
    .line 18
    const-class v1, Ljava/lang/Integer;

    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    const-class v1, Ljava/lang/Short;

    .line 28
    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_3
    :goto_0
    const-wide/16 v0, 0x7fff

    .line 35
    .line 36
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide p2

    .line 40
    long-to-int p2, p2

    .line 41
    int-to-short p2, p2

    .line 42
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_4
    :goto_1
    const-wide/32 v0, 0x7fffffff

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide p2

    .line 57
    long-to-int p2, p2

    .line 58
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_5
    :goto_2
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_3
    const/4 p0, 0x1

    .line 74
    return p0
.end method

.method public static H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_0
    const-string v0, "path"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_4

    .line 18
    .line 19
    const-string v0, "url"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_4

    .line 26
    .line 27
    const-string v0, "uri"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    const-string v0, "md5"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    const-string v0, "sha"

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    const-string v0, "uin"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    const-string v0, "uid"

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    const-string v0, "uuid"

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const-string v0, "filename"

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    const-string v0, "file_name"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    const-string v0, "name"

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_2

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_4

    .line 105
    .line 106
    :cond_2
    invoke-static {p1}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p2}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-nez p2, :cond_3

    .line 119
    .line 120
    invoke-static {p0}, Lqa;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p1}, Lqa;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-eqz p0, :cond_4

    .line 133
    .line 134
    :cond_3
    const/4 p0, 0x1

    .line 135
    return p0

    .line 136
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 137
    return p0
.end method

.method public static I(Ljava/lang/String;Ljava/lang/Object;J)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const-string v1, "size"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v1, "filesize"

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    const-string v1, "filelen"

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    const-string v1, "length"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    :cond_1
    instance-of v1, p1, Ljava/lang/Number;

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    :cond_2
    :goto_0
    return v0

    .line 48
    :cond_3
    check-cast p1, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    const-wide/16 v3, 0x0

    .line 55
    .line 56
    cmp-long p1, p2, v3

    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    if-lez p1, :cond_4

    .line 60
    .line 61
    cmp-long p1, v1, p2

    .line 62
    .line 63
    if-nez p1, :cond_4

    .line 64
    .line 65
    return v5

    .line 66
    :cond_4
    cmp-long p1, v1, v3

    .line 67
    .line 68
    if-nez p1, :cond_6

    .line 69
    .line 70
    const-string p1, "file"

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_5

    .line 77
    .line 78
    const-string p1, "origin"

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    const-string p1, "original"

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_5

    .line 93
    .line 94
    const-string p1, "source"

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_5

    .line 101
    .line 102
    const-string p1, "raw"

    .line 103
    .line 104
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_6

    .line 109
    .line 110
    :cond_5
    return v5

    .line 111
    :cond_6
    return v0
.end method

.method public static J(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 6
    .line 7
    if-nez v1, :cond_7

    .line 8
    .line 9
    instance-of v1, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-nez v1, :cond_7

    .line 12
    .line 13
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    if-nez v1, :cond_7

    .line 16
    .line 17
    instance-of v1, p0, Landroid/content/Context;

    .line 18
    .line 19
    if-nez v1, :cond_7

    .line 20
    .line 21
    instance-of v1, p0, Landroid/view/View;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    instance-of v1, p0, Ljava/util/Collection;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    if-nez v1, :cond_6

    .line 30
    .line 31
    instance-of v1, p0, Ljava/util/Map;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    xor-int/2addr p0, v2

    .line 55
    return p0

    .line 56
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string v1, "java."

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_5

    .line 73
    .line 74
    const-string v1, "android."

    .line 75
    .line 76
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_5

    .line 81
    .line 82
    const-string v1, "kotlin."

    .line 83
    .line 84
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_4

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    return v2

    .line 92
    :cond_5
    :goto_0
    return v0

    .line 93
    :cond_6
    :goto_1
    return v2

    .line 94
    :cond_7
    :goto_2
    return v0
.end method

.method public static K(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 v0, 0x2e

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_1
    return-object p0
.end method

.method public static L(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v0, "file://"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x7

    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    return-object p0
.end method

.method public static a(Ljava/util/ArrayList;Ljava/util/HashSet;Ljava/io/File;)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/16 v1, 0x5c

    .line 9
    .line 10
    const/16 v2, 0x2f

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 5

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lqa;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/16 v1, 0x10

    .line 28
    .line 29
    if-lt v0, v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/16 v1, 0xb4

    .line 36
    .line 37
    if-gt v0, v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    const-string v0, "[^a-z0-9]+"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    array-length v0, p0

    .line 55
    const/4 v1, 0x0

    .line 56
    :goto_0
    if-ge v1, v0, :cond_4

    .line 57
    .line 58
    aget-object v2, p0, v1

    .line 59
    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/16 v4, 0x8

    .line 67
    .line 68
    if-lt v3, v4, :cond_3

    .line 69
    .line 70
    const-string v3, "screenshot"

    .line 71
    .line 72
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_3

    .line 77
    .line 78
    const-string v3, "snapshot"

    .line 79
    .line 80
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_3

    .line 85
    .line 86
    const-string v3, "picture"

    .line 87
    .line 88
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_3

    .line 93
    .line 94
    const-string v3, "android"

    .line 95
    .line 96
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_3

    .line 101
    .line 102
    const-string v3, "mobileqq"

    .line 103
    .line 104
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_3

    .line 109
    .line 110
    const-string v3, "tencent"

    .line 111
    .line 112
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_2

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    invoke-virtual {p2, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_3

    .line 124
    .line 125
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_4
    :goto_2
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/16 v0, 0x2f

    .line 11
    .line 12
    const/16 v1, 0x5c

    .line 13
    .line 14
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 15
    .line 16
    invoke-static {p0}, Lqa;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    return-object p0

    .line 38
    :catchall_0
    invoke-static {p0}, Lqa;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_1
    :goto_0
    const-string p0, ""

    .line 54
    .line 55
    return-object p0
.end method

.method public static d(Ljava/lang/String;Ljava/io/File;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lqa;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lqa;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    if-eqz v1, :cond_2

    .line 18
    .line 19
    const-class v2, Ljava/lang/Object;

    .line 20
    .line 21
    if-eq v1, v2, :cond_2

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    array-length v3, v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v3, 0x1

    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    return-object p0

    .line 44
    :catchall_0
    return-object v0

    .line 45
    :catch_0
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    :goto_2
    return-object v0
.end method

.method public static f(Ljava/lang/Object;)Ljava/lang/String;
    .locals 11

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_a

    .line 6
    .line 7
    :cond_0
    invoke-static {p0}, Lqa;->D(Ljava/lang/Object;)Lf2;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, v1, Lf2;->c:Ljava/io/Serializable;

    .line 12
    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-lez v2, :cond_1

    .line 20
    .line 21
    new-instance p0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v0, "cache:"

    .line 24
    .line 25
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, Lf2;->c:Ljava/io/Serializable;

    .line 29
    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0}, Lqa;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_1
    iget-object v2, v1, Lf2;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    move-object v3, v0

    .line 53
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_7

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lpa;

    .line 64
    .line 65
    iget-object v4, v4, Lpa;->a:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v4}, Lqa;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-nez v5, :cond_3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    invoke-static {v4}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {v4}, Lqa;->t(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-nez v5, :cond_4

    .line 87
    .line 88
    invoke-static {v4}, Lqa;->s(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-nez v5, :cond_4

    .line 93
    .line 94
    invoke-static {v4}, Lqa;->w(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    :cond_4
    invoke-static {v4}, Lqa;->t(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-nez v3, :cond_6

    .line 105
    .line 106
    invoke-static {v4}, Lqa;->s(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_5

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    move-object v3, v4

    .line 114
    goto :goto_0

    .line 115
    :cond_6
    :goto_1
    move-object v3, v4

    .line 116
    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-lez v2, :cond_8

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_8
    iget-object v1, v1, Lf2;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v1, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :cond_9
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_b

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, Loa;

    .line 142
    .line 143
    iget-object v2, v2, Loa;->a:Ljava/io/File;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-nez v3, :cond_a

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_a
    invoke-static {v2}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-static {v3}, Lqa;->t(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_c

    .line 165
    .line 166
    invoke-static {v3}, Lqa;->s(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-nez v2, :cond_c

    .line 171
    .line 172
    invoke-static {v3}, Lqa;->w(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_9

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_b
    move-object v3, v0

    .line 180
    :cond_c
    :goto_3
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-lez v1, :cond_d

    .line 185
    .line 186
    new-instance p0, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    const-string v0, "path:"

    .line 189
    .line 190
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v3}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    return-object p0

    .line 205
    :cond_d
    const-string v1, "uuid"

    .line 206
    .line 207
    const-string v2, "guid"

    .line 208
    .line 209
    const-string v3, "md5"

    .line 210
    .line 211
    const-string v4, "sha"

    .line 212
    .line 213
    const-string v5, "hash"

    .line 214
    .line 215
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    :goto_4
    if-eqz v2, :cond_12

    .line 224
    .line 225
    const-class v3, Ljava/lang/Object;

    .line 226
    .line 227
    if-eq v2, v3, :cond_12

    .line 228
    .line 229
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 230
    .line 231
    .line 232
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    goto :goto_5

    .line 234
    :catchall_0
    const/4 v3, 0x0

    .line 235
    :goto_5
    if-eqz v3, :cond_11

    .line 236
    .line 237
    array-length v4, v3

    .line 238
    const/4 v5, 0x0

    .line 239
    move v6, v5

    .line 240
    :goto_6
    if-ge v6, v4, :cond_11

    .line 241
    .line 242
    aget-object v7, v3, v6

    .line 243
    .line 244
    :try_start_1
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-nez v8, :cond_10

    .line 253
    .line 254
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    const-class v9, Ljava/lang/String;

    .line 259
    .line 260
    if-eq v8, v9, :cond_e

    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_e
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    invoke-static {v8}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    move v9, v5

    .line 272
    :goto_7
    const/4 v10, 0x5

    .line 273
    if-ge v9, v10, :cond_10

    .line 274
    .line 275
    aget-object v10, v1, v9

    .line 276
    .line 277
    if-eqz v10, :cond_f

    .line 278
    .line 279
    invoke-virtual {v8, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    if-eqz v10, :cond_f

    .line 284
    .line 285
    const/4 v8, 0x1

    .line 286
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v7, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    instance-of v8, v7, Ljava/lang/String;

    .line 294
    .line 295
    if-eqz v8, :cond_10

    .line 296
    .line 297
    move-object v8, v7

    .line 298
    check-cast v8, Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    if-lez v8, :cond_10

    .line 305
    .line 306
    check-cast v7, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 307
    .line 308
    goto :goto_9

    .line 309
    :cond_f
    add-int/lit8 v9, v9, 0x1

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :catchall_1
    :cond_10
    :goto_8
    add-int/lit8 v6, v6, 0x1

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_11
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    goto :goto_4

    .line 320
    :cond_12
    move-object v7, v0

    .line 321
    :goto_9
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 322
    .line 323
    .line 324
    move-result p0

    .line 325
    if-lez p0, :cond_13

    .line 326
    .line 327
    new-instance p0, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v0, "hash:"

    .line 330
    .line 331
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-static {v7}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :cond_13
    :goto_a
    return-object v0
.end method

.method public static g(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const-string v2, "compress"

    .line 6
    .line 7
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move v2, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v0

    .line 16
    :goto_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const-string v3, "quality"

    .line 19
    .line 20
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move p1, v0

    .line 29
    :goto_1
    if-eqz p0, :cond_10

    .line 30
    .line 31
    instance-of v3, p0, Ljava/lang/Boolean;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    goto :goto_5

    .line 36
    :cond_2
    instance-of v3, p0, Ljava/lang/Integer;

    .line 37
    .line 38
    const/16 v4, 0x64

    .line 39
    .line 40
    if-eqz v3, :cond_5

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    if-eqz p1, :cond_4

    .line 46
    .line 47
    move v0, v4

    .line 48
    goto :goto_2

    .line 49
    :cond_4
    move v0, v1

    .line 50
    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_5
    instance-of v3, p0, Ljava/lang/Long;

    .line 56
    .line 57
    if-eqz v3, :cond_8

    .line 58
    .line 59
    if-eqz v2, :cond_6

    .line 60
    .line 61
    const-wide/16 p0, 0x0

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_6
    if-eqz p1, :cond_7

    .line 65
    .line 66
    const-wide/16 p0, 0x64

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_7
    const-wide/16 p0, 0x1

    .line 70
    .line 71
    :goto_3
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_8
    instance-of v3, p0, Ljava/lang/Short;

    .line 77
    .line 78
    if-eqz v3, :cond_b

    .line 79
    .line 80
    if-eqz v2, :cond_9

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_9
    if-eqz p1, :cond_a

    .line 84
    .line 85
    move v0, v4

    .line 86
    goto :goto_4

    .line 87
    :cond_a
    move v0, v1

    .line 88
    :goto_4
    int-to-short p0, v0

    .line 89
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :cond_b
    instance-of v0, p0, Ljava/lang/Byte;

    .line 95
    .line 96
    if-eqz v0, :cond_c

    .line 97
    .line 98
    xor-int/lit8 p0, v2, 0x1

    .line 99
    .line 100
    int-to-byte p0, p0

    .line 101
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_c
    instance-of p0, p0, Ljava/lang/String;

    .line 107
    .line 108
    if-eqz p0, :cond_f

    .line 109
    .line 110
    if-eqz v2, :cond_d

    .line 111
    .line 112
    const-string p0, "0"

    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_d
    if-eqz p1, :cond_e

    .line 116
    .line 117
    const-string p0, "100"

    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_e
    const-string p0, "origin"

    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_f
    const/4 p0, 0x0

    .line 124
    return-object p0

    .line 125
    :cond_10
    :goto_5
    xor-int/lit8 p0, v2, 0x1

    .line 126
    .line 127
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method

.method public static h(Ljava/lang/String;)Ljava/io/File;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    const-string v5, "content://"

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/16 v7, 0xa

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v2, p0

    .line 18
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p0, Ljava/io/File;

    .line 26
    .line 27
    invoke-static {v2}, Lqa;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 35
    .line 36
    .line 37
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    return-object p0

    .line 41
    :catchall_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static varargs i(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_3

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    invoke-static {p0, v3}, Lqa;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    instance-of v5, v4, Ljava/lang/CharSequence;

    .line 13
    .line 14
    if-eqz v5, :cond_0

    .line 15
    .line 16
    move-object v5, v4

    .line 17
    check-cast v5, Ljava/lang/CharSequence;

    .line 18
    .line 19
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-lez v5, :cond_0

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-static {p0, v3}, Lqa;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    instance-of v5, v4, Ljava/lang/CharSequence;

    .line 35
    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    move-object v5, v4

    .line 39
    check-cast v5, Ljava/lang/CharSequence;

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-lez v5, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_1
    if-eqz v3, :cond_2

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-lez v4, :cond_2

    .line 59
    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v5, "get"

    .line 63
    .line 64
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-static {v5}, Ljava/lang/Character;->toUpperCase(C)C

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const/4 v5, 0x1

    .line 79
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-static {p0, v3}, Lqa;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    instance-of v4, v3, Ljava/lang/CharSequence;

    .line 95
    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    move-object v4, v3

    .line 99
    check-cast v4, Ljava/lang/CharSequence;

    .line 100
    .line 101
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-lez v4, :cond_2

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    const-string p0, ""

    .line 116
    .line 117
    return-object p0
.end method

.method public static j(Ljava/lang/Object;ILjava/util/Set;)I
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    if-eqz v0, :cond_2a

    const/4 v4, 0x5

    if-gt v1, v4, :cond_2a

    .line 1
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_15

    .line 2
    :cond_0
    instance-of v5, v0, Ljava/lang/CharSequence;

    if-nez v5, :cond_2a

    instance-of v5, v0, Ljava/lang/Number;

    if-nez v5, :cond_2a

    instance-of v5, v0, Ljava/lang/Boolean;

    if-nez v5, :cond_2a

    instance-of v5, v0, Landroid/content/Context;

    if-nez v5, :cond_2a

    instance-of v5, v0, Landroid/view/View;

    if-eqz v5, :cond_1

    goto/16 :goto_15

    .line 3
    :cond_1
    instance-of v5, v0, Ljava/util/Collection;

    const-string v6, "original image default skipped flash picture"

    const-wide/16 v7, 0x4b0

    if-eqz v5, :cond_8

    .line 4
    check-cast v0, Ljava/util/Collection;

    .line 5
    const-string v1, "original_image_default"

    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2a

    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_15

    .line 7
    :cond_2
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v3

    move v4, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 9
    invoke-static {v5, v3, v1}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_3

    goto :goto_0

    .line 10
    :cond_3
    sget-object v9, Lqa;->j:Ljava/lang/ThreadLocal;

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v9, v10}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    .line 11
    sget-object v9, La5;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    new-instance v9, Ljava/util/IdentityHashMap;

    invoke-direct {v9}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v9}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v9

    invoke-static {v5, v3, v9}, La5;->e(Ljava/lang/Object;ILjava/util/Set;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 14
    sget-wide v11, Lqa;->f:J

    sub-long v11, v9, v11

    cmp-long v5, v11, v7

    if-gez v5, :cond_4

    goto :goto_0

    .line 15
    :cond_4
    sput-wide v9, Lqa;->f:J

    .line 16
    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    goto :goto_0

    .line 17
    :cond_5
    invoke-static {v5}, Lqa;->z(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v4

    .line 18
    invoke-static {v5}, Lqa;->B(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v9

    goto :goto_0

    :cond_6
    if-lez v2, :cond_7

    .line 19
    invoke-static {v2, v4}, Lqa;->u(II)V

    :cond_7
    return v4

    .line 20
    :cond_8
    instance-of v5, v0, Ljava/util/Map;

    const/16 v9, 0x50

    const/4 v10, 0x1

    if-eqz v5, :cond_15

    .line 21
    check-cast v0, Ljava/util/Map;

    .line 22
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2a

    if-le v1, v4, :cond_9

    goto/16 :goto_15

    .line 23
    :cond_9
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_a

    move v6, v3

    goto/16 :goto_3

    .line 24
    :cond_a
    :try_start_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v5, v3

    move v6, v5

    :cond_b
    :goto_1
    :try_start_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/2addr v5, v10

    if-le v5, v9, :cond_c

    goto :goto_2

    .line 25
    :cond_c
    instance-of v12, v11, Ljava/util/Map$Entry;

    if-nez v12, :cond_d

    goto :goto_1

    .line 26
    :cond_d
    check-cast v11, Ljava/util/Map$Entry;

    .line 27
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 28
    invoke-static {v12}, Lqa;->q(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_e

    goto :goto_1

    .line 29
    :cond_e
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    .line 30
    invoke-static {v13, v12}, Lqa;->g(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_b

    .line 31
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    goto :goto_1

    .line 32
    :cond_f
    invoke-interface {v11, v12}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catchall_0
    move v6, v3

    :catchall_1
    :cond_10
    :goto_2
    if-lez v6, :cond_12

    .line 33
    sget-object v4, Lqa;->j:Ljava/lang/ThreadLocal;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 35
    sget-wide v11, Lqa;->e:J

    sub-long v11, v4, v11

    cmp-long v7, v11, v7

    if-gez v7, :cond_11

    goto :goto_3

    .line 36
    :cond_11
    sput-wide v4, Lqa;->e:J

    .line 37
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "original image default send map forced: changed="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 38
    :cond_12
    :goto_3
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catchall_2
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    add-int/2addr v3, v10

    if-le v3, v9, :cond_13

    goto :goto_5

    .line 39
    :cond_13
    :try_start_2
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v7, v1, 0x1

    invoke-static {v5, v7, v2}, Lqa;->j(Ljava/lang/Object;ILjava/util/Set;)I

    move-result v5

    add-int/2addr v6, v5

    .line 40
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v7, v2}, Lqa;->j(Ljava/lang/Object;ILjava/util/Set;)I

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    add-int/2addr v6, v4

    goto :goto_4

    :cond_14
    :goto_5
    return v6

    .line 41
    :cond_15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    .line 42
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    move-result v5

    if-nez v5, :cond_17

    .line 43
    :try_start_3
    invoke-static {v0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_6

    :catchall_3
    move v4, v3

    :goto_6
    move v5, v3

    :goto_7
    if-ge v3, v4, :cond_16

    if-ge v3, v9, :cond_16

    .line 44
    :try_start_4
    invoke-static {v0, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v1, 0x1

    invoke-static {v6, v7, v2}, Lqa;->j(Ljava/lang/Object;ILjava/util/Set;)I

    move-result v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    add-int/2addr v5, v6

    :catchall_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_16
    return v5

    .line 45
    :cond_17
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    .line 46
    const-string v9, "picelement"

    invoke-virtual {v5, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_26

    const-string v9, "pic"

    invoke-virtual {v5, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_26

    const-string v11, "image"

    invoke-virtual {v5, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_18

    goto/16 :goto_13

    :cond_18
    move v5, v3

    .line 47
    :goto_8
    const-class v7, Ljava/lang/Object;

    if-eqz v4, :cond_1d

    if-eq v4, v7, :cond_1d

    if-nez v5, :cond_1d

    .line 48
    :try_start_5
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_9

    :catchall_5
    const/4 v6, 0x0

    :goto_9
    if-eqz v6, :cond_1c

    .line 49
    array-length v7, v6

    move v8, v3

    :goto_a
    if-ge v8, v7, :cond_1c

    aget-object v12, v6, v8

    .line 50
    :try_start_6
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v13

    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v13

    if-nez v13, :cond_1b

    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Class;->isPrimitive()Z

    move-result v13

    if-eqz v13, :cond_19

    goto :goto_b

    .line 51
    :cond_19
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v13, v14}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v13

    .line 52
    invoke-virtual {v13, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_1a

    invoke-virtual {v13, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_1a

    const-string v14, "element"

    invoke-virtual {v13, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_1a

    const-string v14, "msg"

    invoke-virtual {v13, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_1a

    goto :goto_b

    .line 53
    :cond_1a
    invoke-virtual {v12, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 54
    invoke-virtual {v12, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v13, v1, 0x1

    invoke-static {v12, v13, v2}, Lqa;->j(Ljava/lang/Object;ILjava/util/Set;)I

    move-result v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    add-int/2addr v5, v12

    if-lez v5, :cond_1b

    goto :goto_c

    :catchall_6
    :cond_1b
    :goto_b
    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    .line 55
    :cond_1c
    :goto_c
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    goto :goto_8

    :cond_1d
    if-nez v5, :cond_25

    const/4 v4, 0x3

    if-gt v1, v4, :cond_25

    .line 56
    invoke-static {v0}, Lqa;->J(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_25

    if-le v1, v4, :cond_1e

    goto :goto_12

    .line 57
    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    move v8, v3

    move v9, v8

    :goto_d
    if-eqz v4, :cond_22

    if-eq v4, v7, :cond_22

    const/16 v11, 0x48

    if-ge v8, v11, :cond_22

    .line 58
    :try_start_7
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v12
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_e

    :catchall_7
    const/4 v12, 0x0

    :goto_e
    if-eqz v12, :cond_24

    .line 59
    array-length v13, v12

    move v14, v3

    :goto_f
    if-ge v14, v13, :cond_24

    aget-object v15, v12, v14

    if-lt v8, v11, :cond_1f

    goto :goto_11

    .line 60
    :cond_1f
    :try_start_8
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v16

    if-nez v16, :cond_23

    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->isPrimitive()Z

    move-result v16

    if-eqz v16, :cond_20

    goto :goto_10

    .line 61
    :cond_20
    invoke-virtual {v15, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 62
    invoke-virtual {v15, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    .line 63
    invoke-static {v15}, Lqa;->J(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_21

    goto :goto_10

    :cond_21
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v6, v1, 0x1

    .line 64
    invoke-static {v15, v6, v2}, Lqa;->j(Ljava/lang/Object;ILjava/util/Set;)I

    move-result v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    add-int/2addr v9, v6

    if-lez v9, :cond_23

    :cond_22
    move v3, v9

    goto :goto_12

    :catchall_8
    :cond_23
    :goto_10
    add-int/lit8 v14, v14, 0x1

    goto :goto_f

    .line 65
    :cond_24
    :goto_11
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    goto :goto_d

    :goto_12
    add-int/2addr v5, v3

    :cond_25
    return v5

    .line 66
    :cond_26
    :goto_13
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    .line 67
    invoke-static {v0, v3, v1}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_27

    goto :goto_15

    .line 68
    :cond_27
    sget-object v1, Lqa;->j:Ljava/lang/ThreadLocal;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 69
    sget-object v1, La5;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 70
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v3, v1}, La5;->e(Ljava/lang/Object;ILjava/util/Set;)Z

    move-result v1

    if-eqz v1, :cond_29

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 72
    sget-wide v4, Lqa;->f:J

    sub-long v4, v0, v4

    cmp-long v2, v4, v7

    if-gez v2, :cond_28

    goto :goto_14

    .line 73
    :cond_28
    sput-wide v0, Lqa;->f:J

    .line 74
    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 75
    :goto_14
    invoke-static {v10, v3}, Lqa;->u(II)V

    return v3

    .line 76
    :cond_29
    invoke-static {v0}, Lqa;->z(Ljava/lang/Object;)I

    move-result v1

    .line 77
    invoke-static {v0}, Lqa;->B(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 78
    invoke-static {v10, v0}, Lqa;->u(II)V

    return v0

    :cond_2a
    :goto_15
    return v3
.end method

.method public static k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    move-object v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 17
    .line 18
    const-class v3, Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    if-eq v1, v3, :cond_2

    .line 21
    .line 22
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :catchall_0
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_2
    move-object v3, v0

    .line 36
    :goto_3
    if-nez v3, :cond_3

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_3
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    return-object p0

    .line 47
    :catchall_1
    return-object v0
.end method

.method public static l([Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    array-length v2, p0

    .line 18
    move v3, v0

    .line 19
    :goto_0
    if-ge v3, v2, :cond_2

    .line 20
    .line 21
    aget-object v4, p0, v3

    .line 22
    .line 23
    invoke-static {v4, v0, v0, v1}, Lqa;->m(Ljava/lang/Object;ZILjava/util/Set;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    :goto_1
    return v0
.end method

.method public static m(Ljava/lang/Object;ZILjava/util/Set;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    if-gt v2, v5, :cond_0

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-nez v5, :cond_1

    .line 21
    .line 22
    :cond_0
    :goto_0
    const/16 v16, 0x0

    .line 23
    .line 24
    goto/16 :goto_a

    .line 25
    .line 26
    :cond_1
    instance-of v5, v0, Ljava/lang/CharSequence;

    .line 27
    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    instance-of v5, v0, Ljava/lang/Number;

    .line 31
    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    instance-of v5, v0, Ljava/lang/Boolean;

    .line 35
    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    instance-of v5, v0, Landroid/content/Context;

    .line 39
    .line 40
    if-nez v5, :cond_0

    .line 41
    .line 42
    instance-of v5, v0, Landroid/view/View;

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    instance-of v5, v0, Ljava/util/Collection;

    .line 48
    .line 49
    const/16 v6, 0x20

    .line 50
    .line 51
    const/4 v7, 0x1

    .line 52
    if-eqz v5, :cond_5

    .line 53
    .line 54
    check-cast v0, Ljava/util/Collection;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/4 v5, 0x0

    .line 61
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-eqz v8, :cond_0

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    add-int/2addr v5, v7

    .line 72
    if-le v5, v6, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    add-int/lit8 v9, v2, 0x1

    .line 76
    .line 77
    invoke-static {v8, v1, v9, v3}, Lqa;->m(Ljava/lang/Object;ZILjava/util/Set;)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_3

    .line 82
    .line 83
    goto/16 :goto_8

    .line 84
    .line 85
    :cond_5
    instance-of v5, v0, Ljava/util/Map;

    .line 86
    .line 87
    if-eqz v5, :cond_8

    .line 88
    .line 89
    check-cast v0, Ljava/util/Map;

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const/4 v5, 0x0

    .line 100
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_0

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    check-cast v8, Ljava/util/Map$Entry;

    .line 111
    .line 112
    add-int/2addr v5, v7

    .line 113
    if-le v5, v6, :cond_7

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_7
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    add-int/lit8 v10, v2, 0x1

    .line 121
    .line 122
    invoke-static {v9, v1, v10, v3}, Lqa;->m(Ljava/lang/Object;ZILjava/util/Set;)Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-nez v9, :cond_1a

    .line 127
    .line 128
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-static {v8, v1, v10, v3}, Lqa;->m(Ljava/lang/Object;ZILjava/util/Set;)Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-eqz v8, :cond_6

    .line 137
    .line 138
    goto/16 :goto_8

    .line 139
    .line 140
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    if-eqz v8, :cond_a

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-nez v8, :cond_a

    .line 159
    .line 160
    :try_start_0
    invoke-static {v0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 161
    .line 162
    .line 163
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    goto :goto_1

    .line 165
    :catchall_0
    const/4 v5, 0x0

    .line 166
    :goto_1
    const/4 v8, 0x0

    .line 167
    :goto_2
    if-ge v8, v5, :cond_0

    .line 168
    .line 169
    if-ge v8, v6, :cond_0

    .line 170
    .line 171
    :try_start_1
    invoke-static {v0, v8}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    add-int/lit8 v10, v2, 0x1

    .line 176
    .line 177
    invoke-static {v9, v1, v10, v3}, Lqa;->m(Ljava/lang/Object;ZILjava/util/Set;)Z

    .line 178
    .line 179
    .line 180
    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 181
    if-eqz v9, :cond_9

    .line 182
    .line 183
    goto/16 :goto_8

    .line 184
    .line 185
    :catchall_1
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_a
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 193
    .line 194
    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    const-string v9, "picelement"

    .line 199
    .line 200
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    if-eqz v10, :cond_b

    .line 205
    .line 206
    goto/16 :goto_8

    .line 207
    .line 208
    :cond_b
    const-string v10, "facebubble"

    .line 209
    .line 210
    const-string v11, "marketface"

    .line 211
    .line 212
    const-string v12, "giphyelement"

    .line 213
    .line 214
    if-eqz v1, :cond_c

    .line 215
    .line 216
    invoke-virtual {v8, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    if-nez v13, :cond_1a

    .line 221
    .line 222
    invoke-virtual {v8, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 223
    .line 224
    .line 225
    move-result v13

    .line 226
    if-nez v13, :cond_1a

    .line 227
    .line 228
    invoke-virtual {v8, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    if-eqz v8, :cond_c

    .line 233
    .line 234
    goto/16 :goto_8

    .line 235
    .line 236
    :cond_c
    const-string v8, "picElement"

    .line 237
    .line 238
    invoke-static {v0, v8}, Lqa;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    if-eqz v8, :cond_d

    .line 243
    .line 244
    goto/16 :goto_8

    .line 245
    .line 246
    :cond_d
    if-eqz v1, :cond_e

    .line 247
    .line 248
    const-string v8, "marketFaceElement"

    .line 249
    .line 250
    invoke-static {v0, v8}, Lqa;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    if-nez v8, :cond_1a

    .line 255
    .line 256
    const-string v8, "faceBubbleElement"

    .line 257
    .line 258
    invoke-static {v0, v8}, Lqa;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    if-nez v8, :cond_1a

    .line 263
    .line 264
    const-string v8, "faceElement"

    .line 265
    .line 266
    invoke-static {v0, v8}, Lqa;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    if-nez v8, :cond_1a

    .line 271
    .line 272
    const-string v8, "giphyElement"

    .line 273
    .line 274
    invoke-static {v0, v8}, Lqa;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    if-eqz v8, :cond_e

    .line 279
    .line 280
    goto/16 :goto_8

    .line 281
    .line 282
    :cond_e
    const/4 v8, 0x2

    .line 283
    if-lt v2, v8, :cond_f

    .line 284
    .line 285
    goto/16 :goto_0

    .line 286
    .line 287
    :cond_f
    :try_start_2
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 288
    .line 289
    .line 290
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 291
    goto :goto_3

    .line 292
    :catchall_2
    const/4 v5, 0x0

    .line 293
    :goto_3
    if-nez v5, :cond_10

    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :cond_10
    const/4 v8, 0x0

    .line 298
    const/4 v13, 0x0

    .line 299
    :goto_4
    array-length v14, v5

    .line 300
    if-ge v8, v14, :cond_0

    .line 301
    .line 302
    if-ge v13, v6, :cond_0

    .line 303
    .line 304
    aget-object v14, v5, v8

    .line 305
    .line 306
    :try_start_3
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 307
    .line 308
    .line 309
    move-result v15

    .line 310
    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 311
    .line 312
    .line 313
    move-result v15

    .line 314
    if-nez v15, :cond_11

    .line 315
    .line 316
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    move-result-object v15

    .line 320
    invoke-virtual {v15}, Ljava/lang/Class;->isPrimitive()Z

    .line 321
    .line 322
    .line 323
    move-result v15

    .line 324
    if-eqz v15, :cond_12

    .line 325
    .line 326
    :catchall_3
    :cond_11
    const/16 v16, 0x0

    .line 327
    .line 328
    goto/16 :goto_9

    .line 329
    .line 330
    :cond_12
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v15

    .line 334
    if-nez v15, :cond_13

    .line 335
    .line 336
    const-string v15, ""
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 337
    .line 338
    const/16 v16, 0x0

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_13
    const/16 v16, 0x0

    .line 342
    .line 343
    :try_start_4
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 344
    .line 345
    invoke-virtual {v15, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v15

    .line 349
    :goto_5
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-nez v4, :cond_15

    .line 354
    .line 355
    const-string v4, "pic_element"

    .line 356
    .line 357
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-nez v4, :cond_15

    .line 362
    .line 363
    if-eqz v1, :cond_14

    .line 364
    .line 365
    const-string v4, "marketfaceelement"

    .line 366
    .line 367
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    if-nez v4, :cond_15

    .line 372
    .line 373
    const-string v4, "facebubbleelement"

    .line 374
    .line 375
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    if-nez v4, :cond_15

    .line 380
    .line 381
    const-string v4, "faceelement"

    .line 382
    .line 383
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v4

    .line 387
    if-nez v4, :cond_15

    .line 388
    .line 389
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    if-eqz v4, :cond_14

    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_14
    move/from16 v4, v16

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_15
    :goto_6
    move v4, v7

    .line 400
    :goto_7
    invoke-virtual {v14, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v14, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v14

    .line 407
    if-eqz v4, :cond_16

    .line 408
    .line 409
    if-eqz v14, :cond_16

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_16
    if-nez v14, :cond_17

    .line 413
    .line 414
    goto :goto_9

    .line 415
    :cond_17
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    sget-object v15, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 424
    .line 425
    invoke-virtual {v4, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    invoke-virtual {v4, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 430
    .line 431
    .line 432
    move-result v15

    .line 433
    if-nez v15, :cond_1a

    .line 434
    .line 435
    if-eqz v1, :cond_18

    .line 436
    .line 437
    invoke-virtual {v4, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 438
    .line 439
    .line 440
    move-result v15

    .line 441
    if-nez v15, :cond_1a

    .line 442
    .line 443
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 444
    .line 445
    .line 446
    move-result v15

    .line 447
    if-nez v15, :cond_1a

    .line 448
    .line 449
    invoke-virtual {v4, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    if-eqz v4, :cond_18

    .line 454
    .line 455
    goto :goto_8

    .line 456
    :cond_18
    add-int/lit8 v13, v13, 0x1

    .line 457
    .line 458
    const/16 v4, 0x10

    .line 459
    .line 460
    if-gt v13, v4, :cond_1b

    .line 461
    .line 462
    instance-of v4, v14, Ljava/util/Collection;

    .line 463
    .line 464
    if-nez v4, :cond_19

    .line 465
    .line 466
    instance-of v4, v14, Ljava/util/Map;

    .line 467
    .line 468
    if-eqz v4, :cond_1b

    .line 469
    .line 470
    :cond_19
    add-int/lit8 v4, v2, 0x1

    .line 471
    .line 472
    invoke-static {v14, v1, v4, v3}, Lqa;->m(Ljava/lang/Object;ZILjava/util/Set;)Z

    .line 473
    .line 474
    .line 475
    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 476
    if-eqz v4, :cond_1b

    .line 477
    .line 478
    :cond_1a
    :goto_8
    return v7

    .line 479
    :catchall_4
    :cond_1b
    :goto_9
    add-int/lit8 v8, v8, 0x1

    .line 480
    .line 481
    goto/16 :goto_4

    .line 482
    .line 483
    :goto_a
    return v16
.end method

.method public static n(Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string v0, "compress"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    const-string v0, "quality"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/16 p0, 0x64

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const-string v0, "type"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x1

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    const-string v0, "flag"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    const-string v0, "source"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    const-string v0, "raw"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return v1

    .line 57
    :cond_3
    :goto_0
    if-gtz p1, :cond_4

    .line 58
    .line 59
    return v1

    .line 60
    :cond_4
    return p1
.end method

.method public static o(Ljava/lang/Object;Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lqa;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-static {p0, p1}, Lqa;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v1, v0, Ljava/lang/Number;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    check-cast v0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-lez v0, :cond_2

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "get"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p0, p1}, Lqa;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    instance-of p1, p0, Ljava/lang/Number;

    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    check-cast p0, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0

    .line 83
    :cond_2
    const/high16 p0, -0x80000000

    .line 84
    .line 85
    return p0
.end method

.method public static p(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-string v1, "summary"

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_4

    .line 18
    .line 19
    const-string v1, "name"

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_4

    .line 26
    .line 27
    const-string v1, "path"

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_4

    .line 34
    .line 35
    const-string v1, "url"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string v1, "origin"

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    const-string v1, "original"

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    const-string v1, "raw"

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    const-string v1, "source"

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    const-string v1, "quality"

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_3

    .line 83
    .line 84
    const-string v1, "compress"

    .line 85
    .line 86
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    return v0

    .line 94
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 95
    return p0

    .line 96
    :cond_4
    :goto_1
    return v0
.end method

.method public static q(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    const-string v1, "summary"

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_4

    .line 19
    .line 20
    const-string v1, "name"

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_4

    .line 27
    .line 28
    const-string v1, "path"

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_4

    .line 35
    .line 36
    const-string v1, "url"

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    const-string v1, "md5"

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    const-string v1, "sha"

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_4

    .line 59
    .line 60
    const-string v1, "hash"

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_4

    .line 67
    .line 68
    const-string v1, "uin"

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_4

    .line 75
    .line 76
    const-string v1, "uid"

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const-string v1, "origin"

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_3

    .line 92
    .line 93
    const-string v1, "original"

    .line 94
    .line 95
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_3

    .line 100
    .line 101
    const-string v1, "raw"

    .line 102
    .line 103
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    const-string v1, "quality"

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_3

    .line 116
    .line 117
    const-string v1, "compress"

    .line 118
    .line 119
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_2

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    return v0

    .line 127
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 128
    return p0

    .line 129
    :cond_4
    :goto_1
    return v0
.end method

.method public static r(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "path"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    const-string v1, "local"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    const-string v1, "uri"

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    const-string v1, "file"

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return v0

    .line 45
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public static s(Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/16 v0, 0x5c

    .line 8
    .line 9
    const/16 v1, 0x2f

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "/tencent/mobileqq/photo/"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public static t(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "rich_media_send_cache"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static u(II)V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Lqa;->a:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x4b0

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sput-wide v0, Lqa;->a:J

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "original image default send patch: pic="

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, ", changed="

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static v(Ljava/lang/String;I)V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Lqa;->g:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x4b0

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sput-wide v0, Lqa;->g:J

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "original image duplicate send blocked: source="

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lqa;->C(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, ", count="

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static w(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, ".jpg"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, ".jpeg"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, ".png"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, ".webp"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const-string v0, ".gif"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    const-string v0, ".heic"

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    const-string v0, ".heif"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 p0, 0x0

    .line 67
    return p0

    .line 68
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 69
    return p0
.end method

.method public static x(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Field;)I
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 7
    .line 8
    if-eq v0, v2, :cond_14

    .line 9
    .line 10
    const-class v3, Ljava/lang/Boolean;

    .line 11
    .line 12
    if-ne v0, v3, :cond_0

    .line 13
    .line 14
    goto/16 :goto_5

    .line 15
    .line 16
    :cond_0
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    if-eq v0, v2, :cond_f

    .line 19
    .line 20
    const-class v3, Ljava/lang/Integer;

    .line 21
    .line 22
    if-ne v0, v3, :cond_1

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_1
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    if-eq v0, v2, :cond_a

    .line 29
    .line 30
    const-class v3, Ljava/lang/Long;

    .line 31
    .line 32
    if-ne v0, v3, :cond_2

    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_2
    const-class v2, Ljava/lang/String;

    .line 37
    .line 38
    if-ne v0, v2, :cond_16

    .line 39
    .line 40
    invoke-virtual {p2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    instance-of v2, v0, Ljava/lang/String;

    .line 45
    .line 46
    const-string v3, ""

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move-object v0, v3

    .line 54
    :goto_0
    const-string v2, "origin"

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_16

    .line 61
    .line 62
    const-string v4, "original"

    .line 63
    .line 64
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_16

    .line 69
    .line 70
    const-string v4, "raw"

    .line 71
    .line 72
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_4

    .line 77
    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_4
    if-nez p1, :cond_5

    .line 81
    .line 82
    move-object p1, v3

    .line 83
    :cond_5
    const-string v3, "md5"

    .line 84
    .line 85
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-nez v3, :cond_16

    .line 90
    .line 91
    const-string v3, "sha"

    .line 92
    .line 93
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-nez v3, :cond_16

    .line 98
    .line 99
    const-string v3, "hash"

    .line 100
    .line 101
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-nez v3, :cond_16

    .line 106
    .line 107
    const-string v3, "uuid"

    .line 108
    .line 109
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_16

    .line 114
    .line 115
    const-string v3, "guid"

    .line 116
    .line 117
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_16

    .line 122
    .line 123
    const-string v3, "id"

    .line 124
    .line 125
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_6

    .line 130
    .line 131
    goto/16 :goto_7

    .line 132
    .line 133
    :cond_6
    const/16 p1, 0x2f

    .line 134
    .line 135
    invoke-virtual {v0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-gez p1, :cond_16

    .line 140
    .line 141
    const/16 p1, 0x5c

    .line 142
    .line 143
    invoke-virtual {v0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-gez p1, :cond_16

    .line 148
    .line 149
    const-string p1, "content://"

    .line 150
    .line 151
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_7

    .line 156
    .line 157
    goto/16 :goto_7

    .line 158
    .line 159
    :cond_7
    invoke-static {v0}, Lqa;->w(Ljava/lang/String;)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_8

    .line 164
    .line 165
    goto/16 :goto_7

    .line 166
    .line 167
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    const/16 v0, 0x28

    .line 172
    .line 173
    if-le p1, v0, :cond_9

    .line 174
    .line 175
    goto/16 :goto_7

    .line 176
    .line 177
    :cond_9
    invoke-virtual {p2, p0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    return v1

    .line 181
    :cond_a
    :goto_1
    if-ne v0, v2, :cond_b

    .line 182
    .line 183
    invoke-virtual {p2, p0}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 184
    .line 185
    .line 186
    move-result-wide v3

    .line 187
    goto :goto_2

    .line 188
    :cond_b
    invoke-virtual {p2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    instance-of v4, v3, Ljava/lang/Number;

    .line 193
    .line 194
    if-eqz v4, :cond_c

    .line 195
    .line 196
    check-cast v3, Ljava/lang/Number;

    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 199
    .line 200
    .line 201
    move-result-wide v3

    .line 202
    goto :goto_2

    .line 203
    :cond_c
    const-wide/high16 v3, -0x8000000000000000L

    .line 204
    .line 205
    :goto_2
    const-wide/32 v5, 0x7fffffff

    .line 206
    .line 207
    .line 208
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 209
    .line 210
    .line 211
    move-result-wide v5

    .line 212
    const-wide/32 v7, -0x80000000

    .line 213
    .line 214
    .line 215
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 216
    .line 217
    .line 218
    move-result-wide v5

    .line 219
    long-to-int v5, v5

    .line 220
    invoke-static {p1, v5}, Lqa;->n(Ljava/lang/String;I)I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    int-to-long v5, p1

    .line 225
    cmp-long p1, v3, v5

    .line 226
    .line 227
    if-nez p1, :cond_d

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_d
    if-ne v0, v2, :cond_e

    .line 231
    .line 232
    invoke-virtual {p2, p0, v5, v6}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    .line 233
    .line 234
    .line 235
    return v1

    .line 236
    :cond_e
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {p2, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    return v1

    .line 244
    :cond_f
    :goto_3
    if-ne v0, v2, :cond_10

    .line 245
    .line 246
    invoke-virtual {p2, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    goto :goto_4

    .line 251
    :cond_10
    invoke-virtual {p2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    instance-of v4, v3, Ljava/lang/Number;

    .line 256
    .line 257
    if-eqz v4, :cond_11

    .line 258
    .line 259
    check-cast v3, Ljava/lang/Number;

    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    goto :goto_4

    .line 266
    :cond_11
    const/high16 v3, -0x80000000

    .line 267
    .line 268
    :goto_4
    invoke-static {p1, v3}, Lqa;->n(Ljava/lang/String;I)I

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    if-ne v3, p1, :cond_12

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_12
    if-ne v0, v2, :cond_13

    .line 276
    .line 277
    invoke-virtual {p2, p0, p1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 278
    .line 279
    .line 280
    return v1

    .line 281
    :cond_13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-virtual {p2, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    return v1

    .line 289
    :cond_14
    :goto_5
    const-string v3, "compress"

    .line 290
    .line 291
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    xor-int/2addr p1, v1

    .line 296
    if-ne v0, v2, :cond_15

    .line 297
    .line 298
    invoke-virtual {p2, p0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    goto :goto_6

    .line 307
    :cond_15
    invoke-virtual {p2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    :goto_6
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 312
    .line 313
    if-eqz v4, :cond_17

    .line 314
    .line 315
    check-cast v3, Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    if-ne v3, p1, :cond_17

    .line 322
    .line 323
    :cond_16
    :goto_7
    const/4 p0, 0x0

    .line 324
    return p0

    .line 325
    :cond_17
    if-ne v0, v2, :cond_18

    .line 326
    .line 327
    invoke-virtual {p2, p0, p1}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 328
    .line 329
    .line 330
    return v1

    .line 331
    :cond_18
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p2, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    return v1
.end method

.method public static z(Ljava/lang/Object;)I
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const-class v3, Ljava/lang/Object;

    .line 10
    .line 11
    if-eq v0, v3, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 14
    .line 15
    .line 16
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_1

    .line 18
    :catchall_0
    const/4 v3, 0x0

    .line 19
    :goto_1
    if-eqz v3, :cond_2

    .line 20
    .line 21
    array-length v4, v3

    .line 22
    move v5, v1

    .line 23
    :goto_2
    if-ge v5, v4, :cond_2

    .line 24
    .line 25
    aget-object v6, v3, v5

    .line 26
    .line 27
    :try_start_1
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_0
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 43
    .line 44
    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-static {v7}, Lqa;->p(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-nez v8, :cond_1

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_1
    const/4 v8, 0x1

    .line 56
    invoke-virtual {v6, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v7, v6}, Lqa;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Field;)I

    .line 60
    .line 61
    .line 62
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    add-int/2addr v2, v6

    .line 64
    :catchall_1
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    return v2
.end method
