.class public final Lj8/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;


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
    sput-object v0, Lj8/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lj8/d;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;I)V
    .locals 10

    .line 1
    if-eqz p1, :cond_17

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-gt p5, v1, :cond_17

    .line 5
    .line 6
    invoke-interface {p4, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_9

    .line 13
    .line 14
    :cond_0
    instance-of v1, p1, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_10

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v3, -0x1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_1
    const/16 v1, 0x2f

    .line 33
    .line 34
    invoke-static {v0, v1}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    const-string v1, "://"

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_2
    new-instance v1, Ljava/io/File;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v0}, Lj8/d;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_3

    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_3
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 64
    .line 65
    invoke-static {p0, v0, p0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, p0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-nez v4, :cond_4

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-static {v4, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_4

    .line 98
    .line 99
    const/16 v4, 0x1e

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    move v4, v2

    .line 103
    :goto_0
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_5

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v5, p2, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_5

    .line 121
    .line 122
    add-int/lit8 v4, v4, 0x18

    .line 123
    .line 124
    :cond_5
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-nez v5, :cond_6

    .line 129
    .line 130
    invoke-static {v0, p2, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_6

    .line 135
    .line 136
    add-int/lit8 v4, v4, 0x12

    .line 137
    .line 138
    :cond_6
    const-string p2, "_t"

    .line 139
    .line 140
    invoke-static {p0, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-nez p2, :cond_7

    .line 145
    .line 146
    add-int/lit8 v4, v4, 0xc

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_7
    add-int/lit8 v4, v4, -0x1e

    .line 150
    .line 151
    :goto_1
    const-string p2, ".silk"

    .line 152
    .line 153
    invoke-static {p0, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-nez p2, :cond_8

    .line 158
    .line 159
    const-string p2, ".slk"

    .line 160
    .line 161
    invoke-static {p0, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-nez p2, :cond_8

    .line 166
    .line 167
    const-string p2, ".amr"

    .line 168
    .line 169
    invoke-static {p0, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-nez p2, :cond_8

    .line 174
    .line 175
    const-string p2, ".spx"

    .line 176
    .line 177
    invoke-static {p0, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-nez p2, :cond_8

    .line 182
    .line 183
    const-string p2, ".speex"

    .line 184
    .line 185
    invoke-static {p0, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    if-nez p2, :cond_8

    .line 190
    .line 191
    const-string p2, ".mp3"

    .line 192
    .line 193
    invoke-static {p0, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-eqz p0, :cond_9

    .line 198
    .line 199
    :cond_8
    add-int/lit8 v4, v4, 0x10

    .line 200
    .line 201
    :cond_9
    const-string p0, "/favorite"

    .line 202
    .line 203
    invoke-static {v3, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-nez p0, :cond_a

    .line 208
    .line 209
    const-string p0, "/fav/"

    .line 210
    .line 211
    invoke-static {v3, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-eqz p0, :cond_b

    .line 216
    .line 217
    :cond_a
    add-int/lit8 v4, v4, 0x4

    .line 218
    .line 219
    :cond_b
    const-string p0, "voice"

    .line 220
    .line 221
    invoke-static {v3, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 222
    .line 223
    .line 224
    move-result p0

    .line 225
    if-eqz p0, :cond_c

    .line 226
    .line 227
    add-int/lit8 v4, v4, 0x4

    .line 228
    .line 229
    :cond_c
    move v3, v4

    .line 230
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    if-eqz p0, :cond_d

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 237
    .line 238
    .line 239
    move-result-wide v0

    .line 240
    const-wide/16 v4, 0x0

    .line 241
    .line 242
    cmp-long p0, v0, v4

    .line 243
    .line 244
    if-lez p0, :cond_d

    .line 245
    .line 246
    add-int/lit8 v3, v3, 0x2

    .line 247
    .line 248
    :cond_d
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    if-ltz v3, :cond_e

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_e
    move v8, v2

    .line 256
    :goto_3
    if-eqz v8, :cond_f

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_f
    const/4 p0, 0x0

    .line 260
    :goto_4
    if-eqz p0, :cond_17

    .line 261
    .line 262
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    new-instance p2, Lsf/e;

    .line 271
    .line 272
    invoke-direct {p2, p1, p0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_10
    instance-of v1, p1, [Ljava/lang/Object;

    .line 280
    .line 281
    if-eqz v1, :cond_11

    .line 282
    .line 283
    check-cast p1, [Ljava/lang/Object;

    .line 284
    .line 285
    array-length v1, p1

    .line 286
    move v9, v2

    .line 287
    :goto_5
    if-ge v9, v1, :cond_17

    .line 288
    .line 289
    aget-object v3, p1, v9

    .line 290
    .line 291
    add-int/lit8 v7, p5, 0x1

    .line 292
    .line 293
    move-object v2, p0

    .line 294
    move-object v4, p2

    .line 295
    move-object v5, p3

    .line 296
    move-object v6, p4

    .line 297
    invoke-static/range {v2 .. v7}, Lj8/d;->a(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;I)V

    .line 298
    .line 299
    .line 300
    add-int/lit8 v9, v9, 0x1

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_11
    instance-of v1, p1, Ljava/util/Collection;

    .line 304
    .line 305
    if-eqz v1, :cond_12

    .line 306
    .line 307
    check-cast p1, Ljava/lang/Iterable;

    .line 308
    .line 309
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    if-eqz v1, :cond_17

    .line 318
    .line 319
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    add-int/lit8 v7, p5, 0x1

    .line 324
    .line 325
    move-object v2, p0

    .line 326
    move-object v4, p2

    .line 327
    move-object v5, p3

    .line 328
    move-object v6, p4

    .line 329
    invoke-static/range {v2 .. v7}, Lj8/d;->a(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;I)V

    .line 330
    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    const-string v3, "android."

    .line 342
    .line 343
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    if-nez v3, :cond_17

    .line 348
    .line 349
    const-string v3, "java.lang."

    .line 350
    .line 351
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    if-nez v3, :cond_17

    .line 356
    .line 357
    const-string v3, "java.io."

    .line 358
    .line 359
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    if-eqz v1, :cond_13

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    :goto_7
    if-eqz v1, :cond_17

    .line 371
    .line 372
    const-class v2, Ljava/lang/Object;

    .line 373
    .line 374
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-nez v2, :cond_17

    .line 379
    .line 380
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 385
    .line 386
    .line 387
    move-result-object v9

    .line 388
    :cond_14
    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    if-eqz v2, :cond_16

    .line 393
    .line 394
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    check-cast v2, Ljava/lang/reflect/Field;

    .line 399
    .line 400
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    if-eqz v3, :cond_15

    .line 409
    .line 410
    goto :goto_8

    .line 411
    :cond_15
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    if-eqz v3, :cond_14

    .line 416
    .line 417
    add-int/lit8 v7, p5, 0x1

    .line 418
    .line 419
    move-object v2, p0

    .line 420
    move-object v4, p2

    .line 421
    move-object v5, p3

    .line 422
    move-object v6, p4

    .line 423
    invoke-static/range {v2 .. v7}, Lj8/d;->a(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;I)V

    .line 424
    .line 425
    .line 426
    goto :goto_8

    .line 427
    :cond_16
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    goto :goto_7

    .line 432
    :cond_17
    :goto_9
    return-void
.end method

.method public static b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "T"

    .line 2
    .line 3
    const-string v1, "Z"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    const/4 v2, 0x2

    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    const-string p0, ""

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    aget-object v2, v0, v1

    .line 17
    .line 18
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    instance-of v3, v2, Ljava/lang/String;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v2, v4

    .line 31
    :goto_1
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    move-object v4, v2

    .line 40
    :cond_2
    if-eqz v4, :cond_3

    .line 41
    .line 42
    return-object v4

    .line 43
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0
.end method

.method public static c(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)I
    .locals 6

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_10

    .line 6
    .line 7
    const/16 v0, 0x2f

    .line 8
    .line 9
    invoke-static {p1, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "://"

    .line 17
    .line 18
    invoke-static {p1, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 32
    .line 33
    invoke-static {v2, p1, v2}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    if-eqz p3, :cond_1

    .line 52
    .line 53
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 p3, 0x0

    .line 59
    :goto_0
    if-eqz p3, :cond_7

    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    const/16 v5, 0x58

    .line 66
    .line 67
    if-eq v4, v5, :cond_5

    .line 68
    .line 69
    const/16 v5, 0x77

    .line 70
    .line 71
    if-eq v4, v5, :cond_3

    .line 72
    .line 73
    const/16 v5, 0x78

    .line 74
    .line 75
    if-eq v4, v5, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const-string v4, "x"

    .line 79
    .line 80
    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-nez p3, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    const-string v4, "w"

    .line 88
    .line 89
    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-nez p3, :cond_4

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    const/16 p3, 0x50

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    const-string v4, "X"

    .line 100
    .line 101
    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    if-nez p3, :cond_6

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_6
    const/16 p3, -0x14

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    :goto_1
    move p3, v1

    .line 112
    :goto_2
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_8

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {v4, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_8

    .line 127
    .line 128
    add-int/lit8 p3, p3, 0x28

    .line 129
    .line 130
    :cond_8
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_9

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {v0, p2, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    add-int/lit8 p3, p3, 0x1e

    .line 150
    .line 151
    :cond_9
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_a

    .line 156
    .line 157
    invoke-static {p1, p2, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_a

    .line 162
    .line 163
    add-int/lit8 p3, p3, 0x14

    .line 164
    .line 165
    :cond_a
    const-string p2, "_t"

    .line 166
    .line 167
    invoke-static {v2, p2, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    if-nez p2, :cond_b

    .line 172
    .line 173
    add-int/lit8 p3, p3, 0xa

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_b
    add-int/lit8 p3, p3, -0x1e

    .line 177
    .line 178
    :goto_3
    const-string p2, "/favorite"

    .line 179
    .line 180
    invoke-static {v3, p2, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-nez p2, :cond_c

    .line 185
    .line 186
    const-string p2, "/fav/"

    .line 187
    .line 188
    invoke-static {v3, p2, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    if-eqz p2, :cond_d

    .line 193
    .line 194
    :cond_c
    add-int/lit8 p3, p3, 0x8

    .line 195
    .line 196
    :cond_d
    const-string p2, "voice"

    .line 197
    .line 198
    invoke-static {v3, p2, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-eqz p2, :cond_e

    .line 203
    .line 204
    add-int/lit8 p3, p3, 0x6

    .line 205
    .line 206
    :cond_e
    invoke-static {p0, p1}, Lj8/d;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-eqz p0, :cond_f

    .line 211
    .line 212
    add-int/lit8 p3, p3, 0x18

    .line 213
    .line 214
    :cond_f
    return p3

    .line 215
    :cond_10
    :goto_4
    const/4 p0, -0x1

    .line 216
    return p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/Object;Lfg/p;)Ljava/util/List;
    .locals 14

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static/range {p3 .. p3}, Lj8/d;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v5, Lj8/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-virtual {v5, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    check-cast v6, Ljava/lang/reflect/Method;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x1

    .line 26
    const/4 v9, 0x0

    .line 27
    if-eqz v6, :cond_3

    .line 28
    .line 29
    filled-new-array/range {p3 .. p3}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    invoke-static {v6, v9, v10}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    instance-of v11, v10, Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v11, :cond_0

    .line 40
    .line 41
    check-cast v10, Ljava/lang/String;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v10, v9

    .line 45
    :goto_0
    if-eqz v10, :cond_3

    .line 46
    .line 47
    invoke-static {p1, v10, v3, v6}, Lj8/d;->c(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-ltz v6, :cond_1

    .line 52
    .line 53
    move v6, v8

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v6, v7

    .line 56
    :goto_1
    if-eqz v6, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move-object v10, v9

    .line 60
    :goto_2
    if-eqz v10, :cond_3

    .line 61
    .line 62
    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_3
    const-string v6, "Hchat_favorite_voice_method_cache"

    .line 66
    .line 67
    invoke-static {p0, v6}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    const-string v11, "fav_data_path_v2_"

    .line 76
    .line 77
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    invoke-static/range {p0 .. p1}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {v6, p0, p1, v10}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    if-eqz v11, :cond_7

    .line 90
    .line 91
    invoke-static {v2, v11}, Lj8/d;->h(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-eqz v12, :cond_7

    .line 96
    .line 97
    invoke-virtual {v5, v2, v11}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    filled-new-array/range {p3 .. p3}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    invoke-static {v11, v9, v12}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    instance-of v13, v12, Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v13, :cond_4

    .line 111
    .line 112
    check-cast v12, Ljava/lang/String;

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    move-object v12, v9

    .line 116
    :goto_3
    if-eqz v12, :cond_7

    .line 117
    .line 118
    invoke-static {p1, v12, v3, v11}, Lj8/d;->c(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)I

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    if-ltz v11, :cond_5

    .line 123
    .line 124
    move v7, v8

    .line 125
    :cond_5
    if-eqz v7, :cond_6

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    move-object v12, v9

    .line 129
    :goto_4
    if-eqz v12, :cond_7

    .line 130
    .line 131
    invoke-interface {v4, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    :cond_7
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 135
    .line 136
    if-nez v0, :cond_8

    .line 137
    .line 138
    goto/16 :goto_b

    .line 139
    .line 140
    :cond_8
    :try_start_0
    new-instance v8, Lch/e;

    .line 141
    .line 142
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v11, Lfh/k;

    .line 146
    .line 147
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v12, "java.lang.String"

    .line 151
    .line 152
    invoke-static {v11, v12}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    filled-new-array {v12}, [Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    invoke-virtual {v11, v12}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iput-object v11, v8, Lch/e;->h:Lfh/k;

    .line 167
    .line 168
    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    new-instance v8, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    :cond_9
    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_b

    .line 186
    .line 187
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 192
    .line 193
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v0, p1}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 201
    .line 202
    .line 203
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 204
    goto :goto_6

    .line 205
    :catchall_0
    move-exception v0

    .line 206
    :try_start_2
    new-instance v12, Lsf/f;

    .line 207
    .line 208
    invoke-direct {v12, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    move-object v0, v12

    .line 212
    :goto_6
    nop

    .line 213
    instance-of v12, v0, Lsf/f;

    .line 214
    .line 215
    if-eqz v12, :cond_a

    .line 216
    .line 217
    move-object v0, v9

    .line 218
    :cond_a
    check-cast v0, Ljava/lang/reflect/Method;

    .line 219
    .line 220
    if-eqz v0, :cond_9

    .line 221
    .line 222
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :catchall_1
    move-exception v0

    .line 227
    goto :goto_9

    .line 228
    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    :cond_c
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v11

    .line 241
    if-eqz v11, :cond_d

    .line 242
    .line 243
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    move-object v12, v11

    .line 248
    check-cast v12, Ljava/lang/reflect/Method;

    .line 249
    .line 250
    invoke-static {v2, v12}, Lj8/d;->h(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    if-eqz v12, :cond_c

    .line 255
    .line 256
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_d
    new-instance v8, Ljava/util/HashSet;

    .line 261
    .line 262
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 263
    .line 264
    .line 265
    new-instance v11, Ljava/util/ArrayList;

    .line 266
    .line 267
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    :cond_e
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v12

    .line 278
    if-eqz v12, :cond_f

    .line 279
    .line 280
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    move-object v13, v12

    .line 285
    check-cast v13, Ljava/lang/reflect/Method;

    .line 286
    .line 287
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v13

    .line 291
    invoke-virtual {v8, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v13

    .line 295
    if-eqz v13, :cond_e

    .line 296
    .line 297
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 298
    .line 299
    .line 300
    goto :goto_8

    .line 301
    :goto_9
    new-instance v11, Lsf/f;

    .line 302
    .line 303
    invoke-direct {v11, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    :cond_f
    invoke-static {v11}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-nez v0, :cond_10

    .line 311
    .line 312
    move-object v7, v11

    .line 313
    goto :goto_a

    .line 314
    :cond_10
    const-string v8, "\u6536\u85cf\u5a92\u4f53\u5b9a\u4f4d\u6587\u4ef6\u8def\u5f84\u65b9\u6cd5\u5931\u8d25"

    .line 315
    .line 316
    move-object/from16 v11, p4

    .line 317
    .line 318
    invoke-interface {v11, v8, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    :goto_a
    check-cast v7, Ljava/util/List;

    .line 322
    .line 323
    :goto_b
    new-instance v0, Ljava/util/ArrayList;

    .line 324
    .line 325
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    :cond_11
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    if-eqz v8, :cond_15

    .line 337
    .line 338
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v8

    .line 342
    check-cast v8, Ljava/lang/reflect/Method;

    .line 343
    .line 344
    filled-new-array/range {p3 .. p3}, [Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    invoke-static {v8, v9, v11}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    instance-of v12, v11, Ljava/lang/String;

    .line 353
    .line 354
    if-eqz v12, :cond_12

    .line 355
    .line 356
    check-cast v11, Ljava/lang/String;

    .line 357
    .line 358
    goto :goto_d

    .line 359
    :cond_12
    move-object v11, v9

    .line 360
    :goto_d
    if-eqz v11, :cond_13

    .line 361
    .line 362
    invoke-static {p1, v11, v3, v8}, Lj8/d;->c(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)I

    .line 363
    .line 364
    .line 365
    move-result v12

    .line 366
    if-gez v12, :cond_14

    .line 367
    .line 368
    :cond_13
    move-object v13, v9

    .line 369
    goto :goto_e

    .line 370
    :cond_14
    new-instance v13, Lsf/j;

    .line 371
    .line 372
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 373
    .line 374
    .line 375
    move-result-object v12

    .line 376
    invoke-direct {v13, v8, v11, v12}, Lsf/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :goto_e
    if-eqz v13, :cond_11

    .line 380
    .line 381
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    goto :goto_c

    .line 385
    :cond_15
    new-instance v1, La9/h;

    .line 386
    .line 387
    const/16 v3, 0x16

    .line 388
    .line 389
    invoke-direct {v1, v3}, La9/h;-><init>(I)V

    .line 390
    .line 391
    .line 392
    invoke-static {v0, v1}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-static {v0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    check-cast v1, Lsf/j;

    .line 401
    .line 402
    if-eqz v1, :cond_16

    .line 403
    .line 404
    iget-object v1, v1, Lsf/j;->g:Ljava/lang/Object;

    .line 405
    .line 406
    invoke-virtual {v5, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    check-cast v1, Ljava/lang/reflect/Method;

    .line 410
    .line 411
    invoke-static {v6, p0, v10, v1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 412
    .line 413
    .line 414
    :cond_16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_17

    .line 423
    .line 424
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    check-cast v0, Lsf/j;

    .line 429
    .line 430
    iget-object v0, v0, Lsf/j;->h:Ljava/lang/Object;

    .line 431
    .line 432
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    goto :goto_f

    .line 436
    :cond_17
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object p0

    .line 440
    return-object p0
.end method

.method public static e(Ljava/lang/Object;)I
    .locals 2

    .line 1
    const-string v0, "field_type"

    .line 2
    .line 3
    const-string v1, "type"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lj8/d;->g(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "field_favProto"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p0, :cond_7

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    if-eqz v1, :cond_7

    .line 15
    .line 16
    const-class v2, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_7

    .line 23
    .line 24
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_6

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/reflect/Field;

    .line 43
    .line 44
    const-class v4, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-static {v3, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    instance-of v4, v3, Ljava/util/Collection;

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    check-cast v3, Ljava/util/Collection;

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move-object v3, v0

    .line 69
    :goto_2
    if-eqz v3, :cond_5

    .line 70
    .line 71
    check-cast v3, Ljava/lang/Iterable;

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_5

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    if-eqz v4, :cond_4

    .line 88
    .line 89
    const/4 v5, 0x1

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    const/4 v5, 0x0

    .line 92
    :goto_3
    if-eqz v5, :cond_3

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move-object v4, v0

    .line 96
    :goto_4
    if-eqz v4, :cond_0

    .line 97
    .line 98
    return-object v4

    .line 99
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_0

    .line 104
    :cond_7
    return-object v0
.end method

.method public static varargs g(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-lt v1, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    aget-object v2, p1, v1

    .line 8
    .line 9
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    instance-of v3, v2, Ljava/lang/Number;

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    check-cast v2, Ljava/lang/Number;

    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0
.end method

.method public static h(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-class v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    array-length p1, v0

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ne p1, v1, :cond_0

    .line 31
    .line 32
    aget-object p1, v0, v2

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    return v1

    .line 41
    :cond_0
    return v2
.end method

.method public static i(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    array-length p1, v0

    .line 29
    const/4 v1, 0x2

    .line 30
    if-ne p1, v1, :cond_1

    .line 31
    .line 32
    aget-object p1, v0, v2

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    aget-object p1, v0, p0

    .line 42
    .line 43
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    aget-object p1, v0, p0

    .line 52
    .line 53
    const-class v0, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    :cond_0
    return p0

    .line 62
    :cond_1
    return v2
.end method

.method public static j(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-static {p2}, Leh/a;->y(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :goto_0
    move-object v6, v3

    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    const-string v0, "com.tencent.mm.vfs.w6"

    .line 21
    .line 22
    const-string v4, "com.tencent.mm.vfs.p6"

    .line 23
    .line 24
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move v4, v2

    .line 29
    :goto_1
    const/4 v5, 0x2

    .line 30
    if-lt v4, v5, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    aget-object v6, v0, v4

    .line 34
    .line 35
    invoke-static {v6, p1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-eqz v6, :cond_15

    .line 40
    .line 41
    const-string v7, "E"

    .line 42
    .line 43
    const-string v8, "F"

    .line 44
    .line 45
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    move v8, v2

    .line 50
    :goto_2
    const-class v9, Ljava/lang/String;

    .line 51
    .line 52
    if-lt v8, v5, :cond_8

    .line 53
    .line 54
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    :cond_3
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_15

    .line 67
    .line 68
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Ljava/lang/reflect/Method;

    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-nez v7, :cond_4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    const-class v8, Ljava/io/InputStream;

    .line 90
    .line 91
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-nez v7, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    array-length v8, v7

    .line 103
    if-ne v8, v1, :cond_3

    .line 104
    .line 105
    aget-object v7, v7, v2

    .line 106
    .line 107
    invoke-static {v7, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-nez v7, :cond_6

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-static {v6, v3, v7}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    instance-of v7, v6, Ljava/io/InputStream;

    .line 123
    .line 124
    if-eqz v7, :cond_7

    .line 125
    .line 126
    check-cast v6, Ljava/io/InputStream;

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    move-object v6, v3

    .line 130
    :goto_4
    if-eqz v6, :cond_3

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_8
    aget-object v10, v7, v8

    .line 134
    .line 135
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    invoke-static {v6, v10, v9}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    if-eqz v9, :cond_14

    .line 144
    .line 145
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    invoke-static {v9, v3, v10}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    instance-of v10, v9, Ljava/io/InputStream;

    .line 154
    .line 155
    if-eqz v10, :cond_9

    .line 156
    .line 157
    check-cast v9, Ljava/io/InputStream;

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_9
    move-object v9, v3

    .line 161
    :goto_5
    if-eqz v9, :cond_14

    .line 162
    .line 163
    move-object v6, v9

    .line 164
    :goto_6
    if-eqz v6, :cond_13

    .line 165
    .line 166
    new-instance p1, Ljava/io/File;

    .line 167
    .line 168
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-static {p1}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-nez v0, :cond_a

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    const/16 v4, 0x8

    .line 186
    .line 187
    if-gt v0, v4, :cond_a

    .line 188
    .line 189
    move v0, v1

    .line 190
    goto :goto_7

    .line 191
    :cond_a
    move v0, v2

    .line 192
    :goto_7
    if-eqz v0, :cond_b

    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_b
    move-object p1, v3

    .line 196
    :goto_8
    if-eqz p1, :cond_c

    .line 197
    .line 198
    move-object p4, p1

    .line 199
    :cond_c
    new-instance p1, Ljava/io/File;

    .line 200
    .line 201
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-direct {p1, p0, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    if-nez p0, :cond_d

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-nez p0, :cond_d

    .line 219
    .line 220
    goto/16 :goto_10

    .line 221
    .line 222
    :cond_d
    new-instance p0, Ljava/io/File;

    .line 223
    .line 224
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    const-string p3, "fav_"

    .line 233
    .line 234
    const-string v0, "."

    .line 235
    .line 236
    invoke-static {p3, p2, v0, p4}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-direct {p0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    .line 244
    .line 245
    invoke-direct {p1, p0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 246
    .line 247
    .line 248
    const/16 p2, 0x2000

    .line 249
    .line 250
    :try_start_1
    new-array p2, p2, [B

    .line 251
    .line 252
    :goto_9
    invoke-virtual {v6, p2}, Ljava/io/InputStream;->read([B)I

    .line 253
    .line 254
    .line 255
    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 256
    if-gtz p3, :cond_11

    .line 257
    .line 258
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 259
    .line 260
    .line 261
    :try_start_3
    invoke-interface {v6}, Ljava/io/Closeable;->close()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    if-eqz p1, :cond_e

    .line 269
    .line 270
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 271
    .line 272
    .line 273
    move-result-wide p1

    .line 274
    const-wide/16 p3, 0x0

    .line 275
    .line 276
    cmp-long p1, p1, p3

    .line 277
    .line 278
    if-lez p1, :cond_e

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :catchall_0
    move-exception p0

    .line 282
    goto :goto_d

    .line 283
    :cond_e
    move v1, v2

    .line 284
    :goto_a
    if-eqz v1, :cond_f

    .line 285
    .line 286
    goto :goto_b

    .line 287
    :cond_f
    move-object p0, v3

    .line 288
    :goto_b
    if-eqz p0, :cond_10

    .line 289
    .line 290
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 294
    goto :goto_e

    .line 295
    :cond_10
    move-object p0, v3

    .line 296
    goto :goto_e

    .line 297
    :catchall_1
    move-exception p0

    .line 298
    goto :goto_c

    .line 299
    :cond_11
    :try_start_4
    invoke-virtual {p1, p2, v2, p3}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 300
    .line 301
    .line 302
    goto :goto_9

    .line 303
    :catchall_2
    move-exception p0

    .line 304
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 305
    :catchall_3
    move-exception p2

    .line 306
    :try_start_6
    invoke-static {p1, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 307
    .line 308
    .line 309
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 310
    :goto_c
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 311
    :catchall_4
    move-exception p1

    .line 312
    :try_start_8
    invoke-static {v6, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 316
    :goto_d
    new-instance p1, Lsf/f;

    .line 317
    .line 318
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 319
    .line 320
    .line 321
    move-object p0, p1

    .line 322
    :goto_e
    nop

    .line 323
    instance-of p1, p0, Lsf/f;

    .line 324
    .line 325
    if-eqz p1, :cond_12

    .line 326
    .line 327
    goto :goto_f

    .line 328
    :cond_12
    move-object v3, p0

    .line 329
    :goto_f
    check-cast v3, Ljava/lang/String;

    .line 330
    .line 331
    :cond_13
    :goto_10
    return-object v3

    .line 332
    :cond_14
    add-int/lit8 v8, v8, 0x1

    .line 333
    .line 334
    goto/16 :goto_2

    .line 335
    .line 336
    :cond_15
    add-int/lit8 v4, v4, 0x1

    .line 337
    .line 338
    goto/16 :goto_1
.end method

.method public static k(Ljava/lang/Long;)Ljava/lang/Integer;
    .locals 6

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long p0, v0, v2

    .line 10
    .line 11
    if-gtz p0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const-wide/16 v2, 0x1

    .line 15
    .line 16
    cmp-long p0, v2, v0

    .line 17
    .line 18
    if-gtz p0, :cond_1

    .line 19
    .line 20
    const-wide/16 v4, 0x259

    .line 21
    .line 22
    cmp-long p0, v0, v4

    .line 23
    .line 24
    if-gez p0, :cond_1

    .line 25
    .line 26
    const-wide/16 v4, 0x3e8

    .line 27
    .line 28
    mul-long/2addr v0, v4

    .line 29
    :cond_1
    cmp-long p0, v0, v2

    .line 30
    .line 31
    if-gez p0, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move-wide v2, v0

    .line 35
    :goto_0
    const-wide/32 v0, 0x7fffffff

    .line 36
    .line 37
    .line 38
    cmp-long p0, v2, v0

    .line 39
    .line 40
    if-lez p0, :cond_3

    .line 41
    .line 42
    move-wide v2, v0

    .line 43
    :cond_3
    long-to-int p0, v2

    .line 44
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public static l(Ljava/lang/ClassLoader;Ljava/lang/String;)Z
    .locals 10

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-static {p1}, Leh/a;->y(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_1
    const-string v0, "j"

    .line 19
    .line 20
    const-string v3, "k"

    .line 21
    .line 22
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v3, "com.tencent.mm.vfs.w6"

    .line 27
    .line 28
    const-string v4, "com.tencent.mm.vfs.p6"

    .line 29
    .line 30
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    move v4, v1

    .line 35
    :goto_0
    const/4 v5, 0x2

    .line 36
    if-lt v4, v5, :cond_2

    .line 37
    .line 38
    :goto_1
    return v1

    .line 39
    :cond_2
    aget-object v5, v3, v4

    .line 40
    .line 41
    invoke-static {v5, p0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-eqz v5, :cond_8

    .line 46
    .line 47
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    :cond_3
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_8

    .line 60
    .line 61
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Ljava/lang/reflect/Method;

    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-static {v0, v7}, Ltf/l;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-nez v7, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    array-length v8, v7

    .line 94
    if-ne v8, v2, :cond_3

    .line 95
    .line 96
    aget-object v7, v7, v1

    .line 97
    .line 98
    const-class v8, Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-nez v7, :cond_6

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    const/4 v7, 0x0

    .line 108
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-static {v6, v7, v8}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_7

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    instance-of v7, v6, Ljava/lang/Number;

    .line 126
    .line 127
    if-eqz v7, :cond_3

    .line 128
    .line 129
    check-cast v6, Ljava/lang/Number;

    .line 130
    .line 131
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v6

    .line 135
    const-wide/16 v8, 0x0

    .line 136
    .line 137
    cmp-long v6, v6, v8

    .line 138
    .line 139
    if-lez v6, :cond_3

    .line 140
    .line 141
    :goto_3
    return v2

    .line 142
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 143
    .line 144
    goto :goto_0
.end method

.method public static m(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p1}, Lj8/d;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-object v4, v0

    .line 23
    check-cast v4, Ljava/util/Set;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    invoke-static/range {v0 .. v5}, Lj8/d;->a(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/4 v0, 0x0

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    move-object p1, v0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v1, p1

    .line 56
    check-cast v1, Lsf/e;

    .line 57
    .line 58
    iget-object v1, v1, Lsf/e;->h:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    move-object v3, v2

    .line 75
    check-cast v3, Lsf/e;

    .line 76
    .line 77
    iget-object v3, v3, Lsf/e;->h:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v1, v3}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-gez v4, :cond_3

    .line 94
    .line 95
    move-object p1, v2

    .line 96
    move-object v1, v3

    .line 97
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_2

    .line 102
    .line 103
    :goto_0
    check-cast p1, Lsf/e;

    .line 104
    .line 105
    if-eqz p1, :cond_4

    .line 106
    .line 107
    iget-object p0, p1, Lsf/e;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p0, Ljava/lang/String;

    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_4
    return-object v0
.end method
