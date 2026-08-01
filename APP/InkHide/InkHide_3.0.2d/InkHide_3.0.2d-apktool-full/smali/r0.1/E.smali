.class public final Lr0/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# static fields
.field public static final m:Ljava/util/HashMap;

.field public static final n:Ljava/util/HashSet;

.field public static final o:LU0/g;

.field public static final p:LU0/g;

.field public static final q:LU0/g;


# instance fields
.field public a:Ljava/lang/ref/WeakReference;

.field public b:Ljava/lang/ref/WeakReference;

.field public c:Ljava/lang/ref/WeakReference;

.field public d:Z

.field public e:LA0/j;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/ref/WeakReference;

.field public h:Ljava/lang/ref/WeakReference;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr0/E;->m:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lr0/E;->n:Ljava/util/HashSet;

    .line 14
    .line 15
    new-instance v0, LU0/g;

    .line 16
    .line 17
    const-string v1, "(?is)\\bwhere\\b.{0,260}\\b(?:rconversation\\.)?(?:field_)?username\\s*(?:=|in\\s*\\()"

    .line 18
    .line 19
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lr0/E;->o:LU0/g;

    .line 23
    .line 24
    new-instance v0, LU0/g;

    .line 25
    .line 26
    const-string v1, "(?is)\\bwhere\\b"

    .line 27
    .line 28
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lr0/E;->p:LU0/g;

    .line 32
    .line 33
    new-instance v0, LU0/g;

    .line 34
    .line 35
    const-string v1, "(?is)\\b(group\\s+by|order\\s+by|limit)\\b"

    .line 36
    .line 37
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lr0/E;->q:LU0/g;

    .line 41
    .line 42
    return-void
.end method

.method public static A(Ljava/lang/Object;Ljava/util/Set;)I
    .locals 21

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v3, v0

    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-eqz v3, :cond_25

    .line 10
    .line 11
    const-class v4, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-nez v5, :cond_25

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const-string v6, "getDeclaredFields(...)"

    .line 24
    .line 25
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    array-length v7, v5

    .line 29
    move v8, v0

    .line 30
    const/4 v9, 0x0

    .line 31
    :goto_1
    if-ge v9, v7, :cond_24

    .line 32
    .line 33
    aget-object v0, v5, v9

    .line 34
    .line 35
    const/4 v10, 0x1

    .line 36
    :try_start_0
    invoke-virtual {v0, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    .line 39
    move-object/from16 v11, p0

    .line 40
    .line 41
    :try_start_1
    invoke-virtual {v0, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_2

    .line 48
    :catchall_1
    move-exception v0

    .line 49
    move-object/from16 v11, p0

    .line 50
    .line 51
    :goto_2
    new-instance v12, LE0/d;

    .line 52
    .line 53
    invoke-direct {v12, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    move-object v0, v12

    .line 57
    :goto_3
    nop

    .line 58
    instance-of v12, v0, LE0/d;

    .line 59
    .line 60
    if-eqz v12, :cond_0

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    goto :goto_4

    .line 64
    :cond_0
    move-object v12, v0

    .line 65
    :goto_4
    if-nez v12, :cond_1

    .line 66
    .line 67
    move-object/from16 v19, v3

    .line 68
    .line 69
    goto/16 :goto_1f

    .line 70
    .line 71
    :cond_1
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v14

    .line 75
    sget-object v15, Lr0/E;->m:Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v15, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lr0/A;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    move-object v13, v0

    .line 90
    move-object/from16 v19, v3

    .line 91
    .line 92
    goto/16 :goto_f

    .line 93
    .line 94
    :cond_2
    sget-object v2, Lr0/E;->n:Ljava/util/HashSet;

    .line 95
    .line 96
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    move-object/from16 v19, v3

    .line 107
    .line 108
    :goto_5
    const/4 v13, 0x0

    .line 109
    goto/16 :goto_f

    .line 110
    .line 111
    :cond_3
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    move-object v13, v14

    .line 117
    :goto_6
    if-eqz v13, :cond_4

    .line 118
    .line 119
    invoke-virtual {v13, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v16

    .line 123
    if-nez v16, :cond_4

    .line 124
    .line 125
    invoke-virtual {v13}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-static {v10, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v10}, LF0/q;->f0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 139
    const/4 v10, 0x1

    .line 140
    goto :goto_6

    .line 141
    :catchall_2
    move-exception v0

    .line 142
    new-instance v10, LE0/d;

    .line 143
    .line 144
    invoke-direct {v10, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    move-object v0, v10

    .line 148
    :cond_4
    sget-object v10, LF0/s;->a:LF0/s;

    .line 149
    .line 150
    instance-of v13, v0, LE0/d;

    .line 151
    .line 152
    if-eqz v13, :cond_5

    .line 153
    .line 154
    move-object v0, v10

    .line 155
    :cond_5
    check-cast v0, Ljava/util/List;

    .line 156
    .line 157
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    if-eqz v13, :cond_7

    .line 166
    .line 167
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    move-object/from16 v17, v13

    .line 172
    .line 173
    check-cast v17, Ljava/lang/reflect/Field;

    .line 174
    .line 175
    move-object/from16 v18, v0

    .line 176
    .line 177
    const-class v0, Landroid/util/SparseArray;

    .line 178
    .line 179
    move-object/from16 v19, v3

    .line 180
    .line 181
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_6

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_6
    move-object/from16 v0, v18

    .line 193
    .line 194
    move-object/from16 v3, v19

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_7
    move-object/from16 v18, v0

    .line 198
    .line 199
    move-object/from16 v19, v3

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    :goto_8
    check-cast v13, Ljava/lang/reflect/Field;

    .line 203
    .line 204
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_9

    .line 213
    .line 214
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    move-object v10, v3

    .line 219
    check-cast v10, Ljava/lang/reflect/Field;

    .line 220
    .line 221
    move-object/from16 v17, v0

    .line 222
    .line 223
    const-class v0, Ljava/util/Map;

    .line 224
    .line 225
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    invoke-virtual {v0, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_8

    .line 234
    .line 235
    goto :goto_a

    .line 236
    :cond_8
    move-object/from16 v0, v17

    .line 237
    .line 238
    goto :goto_9

    .line 239
    :cond_9
    const/4 v3, 0x0

    .line 240
    :goto_a
    check-cast v3, Ljava/lang/reflect/Field;

    .line 241
    .line 242
    if-eqz v13, :cond_e

    .line 243
    .line 244
    if-nez v3, :cond_a

    .line 245
    .line 246
    goto :goto_e

    .line 247
    :cond_a
    const/4 v10, 0x1

    .line 248
    invoke-virtual {v13, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v3, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 252
    .line 253
    .line 254
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-eqz v2, :cond_c

    .line 263
    .line 264
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    move-object v10, v2

    .line 269
    check-cast v10, Ljava/lang/reflect/Field;

    .line 270
    .line 271
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    move-object/from16 v17, v0

    .line 276
    .line 277
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 278
    .line 279
    invoke-static {v10, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_b

    .line 284
    .line 285
    goto :goto_c

    .line 286
    :cond_b
    move-object/from16 v0, v17

    .line 287
    .line 288
    goto :goto_b

    .line 289
    :cond_c
    const/4 v2, 0x0

    .line 290
    :goto_c
    check-cast v2, Ljava/lang/reflect/Field;

    .line 291
    .line 292
    if-eqz v2, :cond_d

    .line 293
    .line 294
    const/4 v10, 0x1

    .line 295
    invoke-virtual {v2, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 296
    .line 297
    .line 298
    goto :goto_d

    .line 299
    :cond_d
    const/4 v2, 0x0

    .line 300
    :goto_d
    new-instance v0, Lr0/A;

    .line 301
    .line 302
    invoke-direct {v0, v13, v3, v2}, Lr0/A;-><init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-virtual {v15, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    const-string v3, "hide close friend mapping fields cached"

    .line 317
    .line 318
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    move-object v13, v0

    .line 326
    goto :goto_f

    .line 327
    :cond_e
    :goto_e
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    goto/16 :goto_5

    .line 335
    .line 336
    :goto_f
    if-nez v13, :cond_10

    .line 337
    .line 338
    :cond_f
    :goto_10
    const/4 v10, 0x0

    .line 339
    goto/16 :goto_1e

    .line 340
    .line 341
    :cond_10
    :try_start_3
    iget-object v0, v13, Lr0/A;->a:Ljava/lang/reflect/Field;

    .line 342
    .line 343
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    instance-of v2, v0, Landroid/util/SparseArray;

    .line 348
    .line 349
    if-eqz v2, :cond_11

    .line 350
    .line 351
    check-cast v0, Landroid/util/SparseArray;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 352
    .line 353
    goto :goto_12

    .line 354
    :catchall_3
    move-exception v0

    .line 355
    goto :goto_11

    .line 356
    :cond_11
    const/4 v0, 0x0

    .line 357
    goto :goto_12

    .line 358
    :goto_11
    new-instance v2, LE0/d;

    .line 359
    .line 360
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 361
    .line 362
    .line 363
    move-object v0, v2

    .line 364
    :goto_12
    nop

    .line 365
    instance-of v2, v0, LE0/d;

    .line 366
    .line 367
    if-eqz v2, :cond_12

    .line 368
    .line 369
    const/4 v0, 0x0

    .line 370
    :cond_12
    move-object v2, v0

    .line 371
    check-cast v2, Landroid/util/SparseArray;

    .line 372
    .line 373
    if-nez v2, :cond_13

    .line 374
    .line 375
    goto :goto_10

    .line 376
    :cond_13
    :try_start_4
    iget-object v0, v13, Lr0/A;->b:Ljava/lang/reflect/Field;

    .line 377
    .line 378
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-static {v0}, LN0/o;->c(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    if-eqz v3, :cond_14

    .line 387
    .line 388
    check-cast v0, Ljava/util/Map;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 389
    .line 390
    goto :goto_14

    .line 391
    :catchall_4
    move-exception v0

    .line 392
    goto :goto_13

    .line 393
    :cond_14
    const/4 v0, 0x0

    .line 394
    goto :goto_14

    .line 395
    :goto_13
    new-instance v3, LE0/d;

    .line 396
    .line 397
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 398
    .line 399
    .line 400
    move-object v0, v3

    .line 401
    :goto_14
    nop

    .line 402
    instance-of v3, v0, LE0/d;

    .line 403
    .line 404
    if-eqz v3, :cond_15

    .line 405
    .line 406
    const/4 v0, 0x0

    .line 407
    :cond_15
    check-cast v0, Ljava/util/Map;

    .line 408
    .line 409
    if-nez v0, :cond_16

    .line 410
    .line 411
    goto :goto_10

    .line 412
    :cond_16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    const/4 v10, 0x0

    .line 417
    :cond_17
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result v14

    .line 421
    if-eqz v14, :cond_18

    .line 422
    .line 423
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v14

    .line 427
    check-cast v14, Ljava/lang/String;

    .line 428
    .line 429
    invoke-interface {v0, v14}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v14

    .line 433
    if-eqz v14, :cond_17

    .line 434
    .line 435
    add-int/lit8 v10, v10, 0x1

    .line 436
    .line 437
    goto :goto_15

    .line 438
    :cond_18
    if-gtz v10, :cond_1b

    .line 439
    .line 440
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    const/4 v3, 0x0

    .line 445
    :goto_16
    if-ge v3, v0, :cond_f

    .line 446
    .line 447
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v14

    .line 451
    if-eqz v14, :cond_19

    .line 452
    .line 453
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v14

    .line 457
    goto :goto_17

    .line 458
    :cond_19
    const/4 v14, 0x0

    .line 459
    :goto_17
    invoke-interface {v1, v14}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v14

    .line 463
    if-eqz v14, :cond_1a

    .line 464
    .line 465
    goto :goto_18

    .line 466
    :cond_1a
    add-int/lit8 v3, v3, 0x1

    .line 467
    .line 468
    goto :goto_16

    .line 469
    :cond_1b
    :goto_18
    new-instance v0, Landroid/util/SparseArray;

    .line 470
    .line 471
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    const/4 v14, 0x0

    .line 479
    const/4 v15, 0x0

    .line 480
    :goto_19
    if-ge v14, v3, :cond_21

    .line 481
    .line 482
    invoke-virtual {v2, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v16

    .line 486
    if-eqz v16, :cond_1c

    .line 487
    .line 488
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v16

    .line 492
    move-object/from16 v20, v16

    .line 493
    .line 494
    move/from16 v16, v3

    .line 495
    .line 496
    move-object/from16 v3, v20

    .line 497
    .line 498
    goto :goto_1a

    .line 499
    :cond_1c
    move/from16 v16, v3

    .line 500
    .line 501
    const/4 v3, 0x0

    .line 502
    :goto_1a
    if-eqz v3, :cond_1f

    .line 503
    .line 504
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 505
    .line 506
    .line 507
    move-result v17

    .line 508
    if-eqz v17, :cond_1d

    .line 509
    .line 510
    goto :goto_1b

    .line 511
    :cond_1d
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v17

    .line 515
    if-eqz v17, :cond_1e

    .line 516
    .line 517
    goto :goto_1b

    .line 518
    :cond_1e
    add-int/lit8 v17, v15, 0x1

    .line 519
    .line 520
    invoke-virtual {v0, v15, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    move/from16 v15, v17

    .line 524
    .line 525
    goto :goto_1c

    .line 526
    :cond_1f
    :goto_1b
    invoke-interface {v1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    if-eqz v3, :cond_20

    .line 531
    .line 532
    add-int/lit8 v10, v10, 0x1

    .line 533
    .line 534
    :cond_20
    :goto_1c
    add-int/lit8 v14, v14, 0x1

    .line 535
    .line 536
    move/from16 v3, v16

    .line 537
    .line 538
    goto :goto_19

    .line 539
    :cond_21
    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 543
    .line 544
    .line 545
    move-result v3

    .line 546
    const/4 v14, 0x0

    .line 547
    :goto_1d
    if-ge v14, v3, :cond_22

    .line 548
    .line 549
    invoke-virtual {v0, v14}, Landroid/util/SparseArray;->keyAt(I)I

    .line 550
    .line 551
    .line 552
    move-result v15

    .line 553
    invoke-virtual {v0, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    invoke-virtual {v2, v15, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    add-int/lit8 v14, v14, 0x1

    .line 561
    .line 562
    move-object/from16 v1, p1

    .line 563
    .line 564
    goto :goto_1d

    .line 565
    :cond_22
    iget-object v0, v13, Lr0/A;->c:Ljava/lang/reflect/Field;

    .line 566
    .line 567
    if-eqz v0, :cond_23

    .line 568
    .line 569
    :try_start_5
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    invoke-virtual {v0, v12, v1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 574
    .line 575
    .line 576
    :catchall_5
    :cond_23
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    const-string v3, "count="

    .line 593
    .line 594
    invoke-static {v2, v3}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    const-string v3, "hide close friend mapping remove"

    .line 599
    .line 600
    filled-new-array {v3, v0, v1, v2}, [Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    :goto_1e
    add-int/2addr v8, v10

    .line 608
    :goto_1f
    add-int/lit8 v9, v9, 0x1

    .line 609
    .line 610
    move-object/from16 v1, p1

    .line 611
    .line 612
    move-object/from16 v3, v19

    .line 613
    .line 614
    goto/16 :goto_1

    .line 615
    .line 616
    :cond_24
    move-object/from16 v11, p0

    .line 617
    .line 618
    move-object/from16 v19, v3

    .line 619
    .line 620
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    move-object/from16 v1, p1

    .line 625
    .line 626
    move v0, v8

    .line 627
    goto/16 :goto_0

    .line 628
    .line 629
    :cond_25
    return v0
.end method

.method public static B(Ljava/lang/Object;Ljava/util/Set;)I
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
    if-eqz v0, :cond_4

    .line 8
    .line 9
    const-class v3, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_4

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "getDeclaredFields(...)"

    .line 22
    .line 23
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    array-length v4, v3

    .line 27
    move v5, v1

    .line 28
    :goto_1
    if-ge v5, v4, :cond_3

    .line 29
    .line 30
    aget-object v6, v3, v5

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    :try_start_0
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    goto :goto_2

    .line 41
    :catchall_0
    move-exception v6

    .line 42
    new-instance v7, LE0/d;

    .line 43
    .line 44
    invoke-direct {v7, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    move-object v6, v7

    .line 48
    :goto_2
    nop

    .line 49
    instance-of v7, v6, LE0/d;

    .line 50
    .line 51
    if-eqz v7, :cond_0

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    :cond_0
    if-nez v6, :cond_1

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    const-string v8, "MvvmList"

    .line 66
    .line 67
    invoke-static {v7, v8, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-nez v7, :cond_2

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    invoke-static {v6, p1}, Lr0/E;->z(Ljava/lang/Object;Ljava/util/Set;)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    add-int/2addr v6, v2

    .line 79
    move v2, v6

    .line 80
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_0

    .line 88
    :cond_4
    return v2
.end method

.method public static D()V
    .locals 3

    .line 1
    const-class v0, Lq0/h;

    .line 2
    .line 3
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    const/16 v1, 0xbf4

    .line 10
    .line 11
    invoke-static {v1}, Lz0/r;->r(I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :try_start_0
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lq0/h;

    .line 23
    .line 24
    const-string v2, "hideMainUIListPluginPart"

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string v1, "requestRefreshVisibleConversationList"

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    new-array v2, v2, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, Lc0/f;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const-string v0, "hide close friend legacy main refresh fallback"

    .line 50
    .line 51
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    new-instance v1, LE0/d;

    .line 63
    .line 64
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object v0, v1

    .line 68
    :goto_0
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    const-string v2, "hide close friend legacy main refresh fallback fail"

    .line 75
    .line 76
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    instance-of v2, v0, LE0/d;

    .line 86
    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    move-object v0, v1

    .line 90
    :cond_3
    check-cast v0, Ljava/lang/Boolean;

    .line 91
    .line 92
    :cond_4
    :goto_1
    return-void
.end method

.method public static final a(Lr0/E;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lr0/E;->b:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lr0/E;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string v0, "f434549h"

    .line 18
    .line 19
    const-string v1, "h"

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p1, v0}, Lr0/E;->p(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/widget/ListView;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 39
    .line 40
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v0, p0, Lr0/E;->c:Ljava/lang/ref/WeakReference;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move-object v0, v1

    .line 69
    :goto_0
    const-string v2, "datasource="

    .line 70
    .line 71
    invoke-static {v2, v0}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object p0, p0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 76
    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Landroid/widget/ListView;

    .line 84
    .line 85
    if-eqz p0, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :cond_3
    const-string p0, "listView="

    .line 96
    .line 97
    invoke-static {p0, v1}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    const-string v1, "hide close friend adapter cache"

    .line 102
    .line 103
    filled-new-array {v1, p1, v0, p0}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-boolean v2, Lz0/i;->a:Z

    .line 4
    .line 5
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, LF0/j;

    .line 10
    .line 11
    invoke-direct {v3, v1, v2}, LF0/j;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lq0/d;

    .line 15
    .line 16
    const/16 v4, 0x13

    .line 17
    .line 18
    invoke-direct {v2, v4}, Lq0/d;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v4, LK0/h;

    .line 22
    .line 23
    invoke-direct {v4, v3, v2}, LK0/h;-><init>(LT0/h;LM0/l;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lq0/d;

    .line 27
    .line 28
    const/16 v3, 0x14

    .line 29
    .line 30
    invoke-direct {v2, v3}, Lq0/d;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v3, LT0/f;

    .line 34
    .line 35
    invoke-direct {v3, v4, v1, v2}, LT0/f;-><init>(LT0/h;ZLM0/l;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, LF0/j;

    .line 39
    .line 40
    invoke-direct {v2, v0, v3}, LF0/j;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v2}, LT0/i;->Y(LF0/j;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {}, Lz0/g;->o()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-instance v4, LF0/j;

    .line 52
    .line 53
    invoke-direct {v4, v1, v3}, LF0/j;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v3, Lr0/B;->i:Lr0/B;

    .line 57
    .line 58
    new-instance v5, LK0/h;

    .line 59
    .line 60
    invoke-direct {v5, v4, v3}, LK0/h;-><init>(LT0/h;LM0/l;)V

    .line 61
    .line 62
    .line 63
    sget-object v3, Lr0/C;->i:Lr0/C;

    .line 64
    .line 65
    new-instance v4, LT0/f;

    .line 66
    .line 67
    invoke-direct {v4, v5, v1, v3}, LT0/f;-><init>(LT0/h;ZLM0/l;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, LF0/j;

    .line 71
    .line 72
    invoke-direct {v1, v0, v4}, LF0/j;-><init>(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1}, LT0/i;->Y(LF0/j;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {}, Lz0/g;->x()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    new-instance v3, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v1, "|"

    .line 92
    .line 93
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    const-class v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_6

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "getDeclaredMethods(...)"

    .line 21
    .line 22
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    array-length v3, v2

    .line 26
    const/4 v4, 0x0

    .line 27
    :goto_1
    if-ge v4, v3, :cond_1

    .line 28
    .line 29
    aget-object v5, v2, v4

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-static {v6, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-string v7, "getParameterTypes(...)"

    .line 46
    .line 47
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    array-length v6, v6

    .line 51
    if-nez v6, :cond_0

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const-class v7, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_0

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move-object v5, v1

    .line 70
    :goto_2
    if-eqz v5, :cond_5

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    instance-of p1, p0, Ljava/lang/String;

    .line 81
    .line 82
    if-eqz p1, :cond_2

    .line 83
    .line 84
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    goto :goto_3

    .line 89
    :cond_2
    move-object p0, v1

    .line 90
    goto :goto_4

    .line 91
    :goto_3
    new-instance p1, LE0/d;

    .line 92
    .line 93
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object p0, p1

    .line 97
    :goto_4
    nop

    .line 98
    instance-of p1, p0, LE0/d;

    .line 99
    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    move-object p0, v1

    .line 103
    :cond_3
    check-cast p0, Ljava/lang/String;

    .line 104
    .line 105
    if-eqz p0, :cond_4

    .line 106
    .line 107
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_4

    .line 112
    .line 113
    move-object v1, p0

    .line 114
    :cond_4
    return-object v1

    .line 115
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    goto :goto_0

    .line 120
    :cond_6
    return-object v1
.end method

.method public static g()Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, Lz0/r;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sput v1, Lz0/r;->e:I

    .line 39
    .line 40
    :cond_0
    sget v0, Lz0/r;->e:I

    .line 41
    .line 42
    const/16 v1, 0xbf4

    .line 43
    .line 44
    if-lt v0, v1, :cond_1

    .line 45
    .line 46
    const-string v0, "8070-plus"

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    invoke-static {}, Lr0/E;->w()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    const-string v0, "8067-8069"

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    invoke-static {}, Lr0/E;->v()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    const-string v0, "8065-8066"

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_3
    const-string v0, "legacy-other"

    .line 68
    .line 69
    return-object v0
.end method

.method public static varargs h(Ljava/lang/Class;Ljava/util/List;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3

    .line 1
    invoke-static {p1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    array-length v1, p2

    .line 26
    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 31
    .line 32
    invoke-interface {v2, p0, v0, v1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public static i(Landroid/content/Context;Ljava/util/List;)Ljava/lang/Class;
    .locals 4

    .line 1
    sget v0, Lz0/r;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sput v1, Lz0/r;->e:I

    .line 39
    .line 40
    :cond_0
    sget v0, Lz0/r;->e:I

    .line 41
    .line 42
    invoke-static {p1}, LF0/k;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "getClassLoader(...)"

    .line 67
    .line 68
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v3, "clazz"

    .line 72
    .line 73
    invoke-static {v1, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 77
    .line 78
    invoke-interface {v3, v2, v1}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string p1, "hide close friend version class"

    .line 89
    .line 90
    filled-new-array {p1, p0, v1}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-object v2

    .line 98
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const-string v3, "hide close friend version class missing"

    .line 103
    .line 104
    filled-new-array {v3, v2, v1}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    const/4 p0, 0x0

    .line 113
    return-object p0
.end method

.method public static k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Lz0/r;->e:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, -0x1

    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v1, v4, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget v3, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v1

    .line 36
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Li0/a;->b([Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sput v3, Lz0/r;->e:I

    .line 44
    .line 45
    :cond_0
    sget v1, Lz0/r;->e:I

    .line 46
    .line 47
    const/16 v3, 0xc30

    .line 48
    .line 49
    if-ne v1, v3, :cond_1

    .line 50
    .line 51
    const-string v1, "c"

    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_1
    const-string v1, "a"

    .line 57
    .line 58
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Ljava/lang/String;

    .line 80
    .line 81
    :try_start_1
    new-array v3, v2, [Ljava/lang/Object;

    .line 82
    .line 83
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 84
    .line 85
    invoke-interface {v4, p0, v1, v3}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception v1

    .line 91
    new-instance v3, LE0/d;

    .line 92
    .line 93
    invoke-direct {v3, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object v1, v3

    .line 97
    :goto_1
    nop

    .line 98
    instance-of v3, v1, LE0/d;

    .line 99
    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    :cond_3
    if-eqz v1, :cond_2

    .line 104
    .line 105
    return-object v1

    .line 106
    :cond_4
    const-string p0, "f434569g"

    .line 107
    .line 108
    const-string v0, "g"

    .line 109
    .line 110
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p1, p0}, Lr0/E;->p(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method

.method public static n(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "field_username"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lr0/E;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    const-string v0, "f1"

    .line 23
    .line 24
    invoke-static {p0, v0}, Lr0/E;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_2
    const-string v0, "h1"

    .line 32
    .line 33
    invoke-static {p0, v0}, Lr0/E;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static o(Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p0}, Lr0/E;->n(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "f434581d"

    .line 9
    .line 10
    invoke-static {p0, v0}, Lr0/E;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string v0, "d"

    .line 17
    .line 18
    invoke-static {p0, v0}, Lr0/E;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-static {v0}, Lr0/E;->n(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_7

    .line 35
    .line 36
    const-class v2, Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_7

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v3, "getDeclaredFields(...)"

    .line 49
    .line 50
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    array-length v3, v2

    .line 54
    const/4 v4, 0x0

    .line 55
    :goto_1
    if-ge v4, v3, :cond_6

    .line 56
    .line 57
    aget-object v5, v2, v4

    .line 58
    .line 59
    const/4 v6, 0x1

    .line 60
    :try_start_0
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception v5

    .line 69
    new-instance v6, LE0/d;

    .line 70
    .line 71
    invoke-direct {v6, v5}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object v5, v6

    .line 75
    :goto_2
    nop

    .line 76
    instance-of v6, v5, LE0/d;

    .line 77
    .line 78
    if-eqz v6, :cond_3

    .line 79
    .line 80
    move-object v5, v1

    .line 81
    :cond_3
    if-nez v5, :cond_4

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    invoke-static {v5}, Lr0/E;->n(Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    if-eqz v5, :cond_5

    .line 89
    .line 90
    return-object v5

    .line 91
    :cond_5
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    goto :goto_0

    .line 99
    :cond_7
    return-object v1
.end method

.method public static varargs p(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-static {p0, v2}, Lr0/E;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    if-eqz v1, :cond_2

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object v0, p0

    .line 27
    :goto_1
    return-object v0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    const-string v1, "hide close friend get field fail"

    .line 30
    .line 31
    filled-new-array {v1, p1, p0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :catch_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_2
    return-object v0
.end method

.method public static u()Z
    .locals 4

    .line 1
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lz0/r;->p()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "8.0.72"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v0, v3, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/16 v0, 0xc0b

    .line 19
    .line 20
    if-eq v1, v0, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lz0/r;->t()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    :cond_0
    const/4 v0, 0x1

    .line 29
    return v0

    .line 30
    :cond_1
    return v3
.end method

.method public static v()Z
    .locals 4

    .line 1
    invoke-static {}, Lz0/r;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "8.0.65"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v1, v3, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_2

    .line 17
    .line 18
    const-string v2, "8.0.66"

    .line 19
    .line 20
    invoke-static {v1, v3, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v1, 0xb90

    .line 28
    .line 29
    if-gt v1, v0, :cond_1

    .line 30
    .line 31
    const/16 v1, 0xbb8

    .line 32
    .line 33
    if-ge v0, v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v3

    .line 37
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 38
    return v0
.end method

.method public static w()Z
    .locals 4

    .line 1
    invoke-static {}, Lz0/r;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "8.0.67"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v1, v3, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_2

    .line 17
    .line 18
    const-string v2, "8.0.68"

    .line 19
    .line 20
    invoke-static {v1, v3, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    const-string v2, "8.0.69"

    .line 27
    .line 28
    invoke-static {v1, v3, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/16 v1, 0xbb8

    .line 36
    .line 37
    if-gt v1, v0, :cond_1

    .line 38
    .line 39
    const/16 v1, 0xbf4

    .line 40
    .line 41
    if-ge v0, v1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return v3

    .line 45
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 46
    return v0
.end method

.method public static x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    invoke-static {}, Lr0/E;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "notifyDataSetChanged"

    .line 6
    .line 7
    const-string v2, "hide close friend adapter refresh"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    new-array v0, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p0, v1, v0}, Lc0/f;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v0, "8065-8066-notify"

    .line 26
    .line 27
    filled-new-array {v2, p0, v0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const-string v0, "clearCache"

    .line 36
    .line 37
    const-string v4, "i2"

    .line 38
    .line 39
    const-string v5, "j0"

    .line 40
    .line 41
    const-string v6, "i0"

    .line 42
    .line 43
    filled-new-array {v0, v4, v5, v6, v1}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    move v1, v3

    .line 56
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    new-array v6, v3, [Ljava/lang/Object;

    .line 73
    .line 74
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 75
    .line 76
    invoke-interface {v7, v5, v4, v6}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-nez v5, :cond_1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    const/4 v6, 0x0

    .line 84
    :try_start_1
    invoke-virtual {v5, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    filled-new-array {v2, v5, v4}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-static {v4}, Li0/a;->a([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-class v3, Ljava/lang/String;

    .line 110
    .line 111
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 112
    .line 113
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 118
    .line 119
    const-string v5, "a"

    .line 120
    .line 121
    invoke-interface {v4, v0, v5, v3}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_3

    .line 126
    .line 127
    :try_start_2
    const-string v3, "wxmask"

    .line 128
    .line 129
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 130
    .line 131
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    add-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    filled-new-array {v2, v0, v5}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 153
    .line 154
    .line 155
    :catchall_1
    :cond_3
    if-gtz v1, :cond_4

    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    const-string v0, "hide close friend adapter refresh no method"

    .line 166
    .line 167
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :catchall_2
    :cond_4
    return-void
.end method

.method public static y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "f434578s"

    .line 2
    .line 3
    const-string v1, "s"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lr0/E;->p(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/util/Map;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :catchall_0
    :cond_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    :try_start_1
    const-string p0, "c"

    .line 23
    .line 24
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p1, p0, v0}, Lc0/f;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :catchall_1
    move-exception p0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    goto :goto_2

    .line 41
    :goto_1
    new-instance p1, LE0/d;

    .line 42
    .line 43
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    move-object p0, p1

    .line 47
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    instance-of v0, p0, LE0/d;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    move-object p0, p1

    .line 54
    :cond_2
    check-cast p0, Ljava/lang/Boolean;

    .line 55
    .line 56
    const-string p1, "hide close friend live remove"

    .line 57
    .line 58
    filled-new-array {p1, p2, p0}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static z(Ljava/lang/Object;Ljava/util/Set;)I
    .locals 10

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
    if-eqz v0, :cond_9

    .line 8
    .line 9
    const-class v3, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_9

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "getDeclaredFields(...)"

    .line 22
    .line 23
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    array-length v4, v3

    .line 27
    move v5, v1

    .line 28
    :goto_1
    if-ge v5, v4, :cond_8

    .line 29
    .line 30
    aget-object v6, v3, v5

    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    const-class v8, Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-nez v7, :cond_0

    .line 43
    .line 44
    goto :goto_5

    .line 45
    :cond_0
    const/4 v7, 0x1

    .line 46
    :try_start_0
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    goto :goto_2

    .line 54
    :catchall_0
    move-exception v6

    .line 55
    new-instance v8, LE0/d;

    .line 56
    .line 57
    invoke-direct {v8, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    move-object v6, v8

    .line 61
    :goto_2
    nop

    .line 62
    instance-of v8, v6, LE0/d;

    .line 63
    .line 64
    if-eqz v8, :cond_1

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    :cond_1
    if-nez v6, :cond_2

    .line 68
    .line 69
    goto :goto_5

    .line 70
    :cond_2
    invoke-static {v6}, LN0/o;->b(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    if-eqz v8, :cond_7

    .line 75
    .line 76
    invoke-static {v6}, LN0/o;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    sub-int/2addr v8, v7

    .line 85
    move v7, v1

    .line 86
    :goto_3
    const/4 v9, -0x1

    .line 87
    if-ge v9, v8, :cond_6

    .line 88
    .line 89
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    if-nez v9, :cond_3

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_3
    invoke-static {v9}, Lr0/E;->o(Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    if-nez v9, :cond_4

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_4
    invoke-interface {p1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_5

    .line 108
    .line 109
    invoke-interface {v6, v8}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    add-int/lit8 v7, v7, 0x1

    .line 113
    .line 114
    :cond_5
    :goto_4
    add-int/lit8 v8, v8, -0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_6
    add-int/2addr v2, v7

    .line 118
    :cond_7
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_0

    .line 126
    :cond_9
    return v2
.end method


# virtual methods
.method public final C(Ljava/lang/Object;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lr0/E;->q()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lr0/E;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    iget-object v1, p0, Lr0/E;->c:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v1, v2

    .line 30
    :cond_2
    :goto_0
    invoke-static {p1, v1}, Lr0/E;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3, v5}, Lr0/E;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {}, Lr0/E;->w()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_10

    .line 59
    .line 60
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {}, Lr0/E;->w()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_e

    .line 69
    .line 70
    iget-object v3, p0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Landroid/widget/ListView;

    .line 79
    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object v3, v2

    .line 88
    :goto_2
    iget-object v4, p0, Lr0/E;->e:LA0/j;

    .line 89
    .line 90
    if-nez v4, :cond_6

    .line 91
    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    invoke-static {v3}, LA0/l;->f(Landroid/content/Context;)LA0/j;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    move-object v4, v2

    .line 100
    :cond_6
    :goto_3
    iput-object v4, p0, Lr0/E;->e:LA0/j;

    .line 101
    .line 102
    if-eqz v4, :cond_7

    .line 103
    .line 104
    iget-object v4, v4, LA0/j;->a:Ljava/util/List;

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    move-object v4, v2

    .line 108
    :goto_4
    if-nez v4, :cond_8

    .line 109
    .line 110
    sget-object v4, LF0/s;->a:LF0/s;

    .line 111
    .line 112
    :cond_8
    move-object v5, v4

    .line 113
    if-eqz v3, :cond_9

    .line 114
    .line 115
    invoke-static {v3}, LA0/l;->h(Landroid/content/Context;)LA0/M;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    if-eqz v3, :cond_9

    .line 120
    .line 121
    iget-object v2, v3, LA0/M;->a:Ljava/lang/String;

    .line 122
    .line 123
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-interface {v5, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-nez v3, :cond_b

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_a

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_a
    const/4 v3, 0x0

    .line 153
    goto :goto_6

    .line 154
    :cond_b
    :goto_5
    const/4 v3, 0x1

    .line 155
    :goto_6
    if-nez v3, :cond_d

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    const/4 v8, 0x0

    .line 166
    const/4 v9, 0x0

    .line 167
    const-string v6, ","

    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    const/16 v10, 0x3e

    .line 171
    .line 172
    invoke-static/range {v5 .. v10}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    const-string v6, "dex="

    .line 177
    .line 178
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    if-nez v2, :cond_c

    .line 183
    .line 184
    const-string v2, ""

    .line 185
    .line 186
    :cond_c
    const-string v6, "legacy="

    .line 187
    .line 188
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const-string v6, "hide close friend mvvm sync adapter not matched"

    .line 193
    .line 194
    filled-new-array {v6, v4, v5, v2}, [Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_d
    if-nez v3, :cond_e

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    const-string v0, "hide close friend mvvm sync skipped non dex adapter"

    .line 212
    .line 213
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_e
    invoke-static {p1, v0}, Lr0/E;->z(Ljava/lang/Object;Ljava/util/Set;)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    invoke-static {p1, v0}, Lr0/E;->B(Ljava/lang/Object;Ljava/util/Set;)I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    add-int/2addr v3, v2

    .line 230
    invoke-static {p1, v0}, Lr0/E;->A(Ljava/lang/Object;Ljava/util/Set;)I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    add-int/2addr v2, v3

    .line 235
    if-eqz v1, :cond_f

    .line 236
    .line 237
    if-eq v1, p1, :cond_f

    .line 238
    .line 239
    invoke-static {v1, v0}, Lr0/E;->z(Ljava/lang/Object;Ljava/util/Set;)I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    add-int/2addr v3, v2

    .line 244
    invoke-static {v1, v0}, Lr0/E;->B(Ljava/lang/Object;Ljava/util/Set;)I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    add-int/2addr v2, v3

    .line 249
    invoke-static {v1, v0}, Lr0/E;->A(Ljava/lang/Object;Ljava/util/Set;)I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    add-int/2addr v2, v0

    .line 254
    :cond_f
    if-lez v2, :cond_10

    .line 255
    .line 256
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    const-string v1, "hide close friend adapter list remove"

    .line 272
    .line 273
    filled-new-array {v1, p1, v0}, [Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_10
    :goto_7
    return-void
.end method

.method public final E()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {}, Lz0/r;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    invoke-static {}, Lr0/E;->w()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Lr0/E;->b()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, p0, Lr0/E;->i:Ljava/lang/String;

    .line 21
    .line 22
    :cond_1
    :goto_0
    const-class v2, Lq0/h;

    .line 23
    .line 24
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lq0/h;

    .line 29
    .line 30
    invoke-virtual {v2}, Lq0/h;->c()V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lr0/E;->b:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object v2, v3

    .line 44
    :goto_1
    invoke-virtual {p0, v2}, Lr0/E;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-nez v4, :cond_3

    .line 49
    .line 50
    iget-object v4, p0, Lr0/E;->c:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    if-eqz v4, :cond_4

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    move-object v3, v4

    .line 60
    :cond_4
    :goto_2
    if-nez v3, :cond_5

    .line 61
    .line 62
    const-string v3, "hide close friend native refresh skipped, datasource null"

    .line 63
    .line 64
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, Li0/a;->d([Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move v4, v1

    .line 72
    goto :goto_4

    .line 73
    :cond_5
    sget-boolean v4, Lz0/i;->a:Z

    .line 74
    .line 75
    invoke-static {}, Lz0/g;->x()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_6

    .line 80
    .line 81
    invoke-virtual {p0}, Lr0/E;->q()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_6

    .line 94
    .line 95
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p0, v3, v5}, Lr0/E;->d(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_6
    const-string v4, ""

    .line 106
    .line 107
    invoke-virtual {p0, v3, v4}, Lr0/E;->d(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    const-string v6, "hide close friend native refresh"

    .line 124
    .line 125
    filled-new-array {v6, v5, v3}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :goto_4
    if-eqz v4, :cond_7

    .line 133
    .line 134
    invoke-static {}, Lz0/r;->u()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_7

    .line 139
    .line 140
    invoke-static {}, Lr0/E;->w()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_7

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    if-nez v2, :cond_9

    .line 148
    .line 149
    invoke-static {}, Lr0/E;->D()V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 153
    .line 154
    if-eqz v0, :cond_8

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, Landroid/widget/ListView;

    .line 161
    .line 162
    if-eqz v0, :cond_8

    .line 163
    .line 164
    new-instance v2, Lr0/z;

    .line 165
    .line 166
    invoke-direct {v2, p0, v1}, Lr0/z;-><init>(Lr0/E;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 170
    .line 171
    .line 172
    :cond_8
    :goto_5
    return-void

    .line 173
    :cond_9
    sget-boolean v3, Lz0/i;->a:Z

    .line 174
    .line 175
    invoke-static {}, Lz0/g;->x()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_a

    .line 180
    .line 181
    invoke-static {}, Lr0/E;->v()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-nez v3, :cond_a

    .line 186
    .line 187
    invoke-virtual {p0, v2}, Lr0/E;->C(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_a
    invoke-static {v2}, Lr0/E;->x(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-object v3, p0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 194
    .line 195
    if-eqz v3, :cond_b

    .line 196
    .line 197
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    check-cast v3, Landroid/widget/ListView;

    .line 202
    .line 203
    if-eqz v3, :cond_b

    .line 204
    .line 205
    new-instance v4, Lr0/z;

    .line 206
    .line 207
    invoke-direct {v4, p0, v0}, Lr0/z;-><init>(Lr0/E;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 211
    .line 212
    .line 213
    :cond_b
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    if-nez v3, :cond_d

    .line 218
    .line 219
    sget v3, Lz0/r;->e:I

    .line 220
    .line 221
    const/4 v4, -0x1

    .line 222
    if-ne v3, v4, :cond_c

    .line 223
    .line 224
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-virtual {v3, v5, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    iget v4, v3, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :catch_0
    move-exception v3

    .line 248
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-static {v3}, Li0/a;->b([Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :goto_6
    sput v4, Lz0/r;->e:I

    .line 256
    .line 257
    :cond_c
    sget v3, Lz0/r;->e:I

    .line 258
    .line 259
    const/16 v4, 0xbf4

    .line 260
    .line 261
    if-ge v3, v4, :cond_d

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_d
    move v0, v1

    .line 265
    :goto_7
    if-eqz v0, :cond_f

    .line 266
    .line 267
    iget-object v0, p0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 268
    .line 269
    if-eqz v0, :cond_f

    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, Landroid/widget/ListView;

    .line 276
    .line 277
    if-eqz v0, :cond_f

    .line 278
    .line 279
    new-instance v1, LA0/m;

    .line 280
    .line 281
    const/4 v3, 0x6

    .line 282
    invoke-direct {v1, p0, v2, v3}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 283
    .line 284
    .line 285
    invoke-static {}, Lr0/E;->v()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_e

    .line 290
    .line 291
    const-wide/16 v2, 0xa0

    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_e
    const-wide/16 v2, 0x78

    .line 295
    .line 296
    :goto_8
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 297
    .line 298
    .line 299
    :cond_f
    invoke-static {}, Lr0/E;->D()V

    .line 300
    .line 301
    .line 302
    return-void
.end method

.method public final F(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_b

    .line 3
    .line 4
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sparse-switch v1, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :sswitch_0
    const-string v1, "qmessage"

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_b

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :sswitch_1
    const-string v1, "message_fold"

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_b

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :sswitch_2
    const-string v1, "floatbottle"

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_b

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :sswitch_3
    const-string v1, "appbrand_notify_message"

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_1
    :goto_0
    invoke-static {}, Lr0/E;->u()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_7

    .line 62
    .line 63
    invoke-virtual {p0}, Lr0/E;->s()Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_b

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Ljava/util/Set;

    .line 95
    .line 96
    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_4

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_6

    .line 118
    .line 119
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Ljava/lang/String;

    .line 124
    .line 125
    sget-boolean v4, Lz0/i;->a:Z

    .line 126
    .line 127
    invoke-static {v3}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_5

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    :goto_2
    const/4 p1, 0x1

    .line 135
    return p1

    .line 136
    :cond_7
    sget-boolean v1, Lz0/i;->a:Z

    .line 137
    .line 138
    invoke-static {p1}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_8

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_8
    const-class v1, Lq0/h;

    .line 146
    .line 147
    invoke-static {v1}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Lq0/h;

    .line 152
    .line 153
    invoke-static {}, Lz0/g;->s()Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-nez v2, :cond_9

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_9
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_a

    .line 165
    .line 166
    const-string p1, "chatUser is null or blank"

    .line 167
    .line 168
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return v0

    .line 176
    :cond_a
    iget-object v0, v1, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 177
    .line 178
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    return p1

    .line 183
    :cond_b
    :goto_3
    return v0

    .line 184
    nop

    .line 185
    :sswitch_data_0
    .sparse-switch
        -0x74ca3796 -> :sswitch_3
        -0x520678de -> :sswitch_2
        -0x4cae4ec7 -> :sswitch_1
        0x134fce76 -> :sswitch_0
    .end sparse-switch
.end method

.method public final c()Ljava/util/List;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Lz0/r;->e:I

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget v2, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v1

    .line 36
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Li0/a;->b([Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sput v2, Lz0/r;->e:I

    .line 44
    .line 45
    :cond_0
    sget v1, Lz0/r;->e:I

    .line 46
    .line 47
    const/16 v2, 0xbf4

    .line 48
    .line 49
    const-string v3, "k"

    .line 50
    .line 51
    if-lt v1, v2, :cond_1

    .line 52
    .line 53
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object v1, p0, Lr0/E;->e:LA0/j;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    iget-object v1, v1, LA0/j;->i:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/4 v1, 0x0

    .line 70
    :goto_1
    if-eqz v1, :cond_3

    .line 71
    .line 72
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 9

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    iput-boolean v1, p0, Lr0/E;->d:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Lr0/E;->c()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    :cond_0
    move v1, v2

    .line 17
    goto :goto_2

    .line 18
    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    .line 34
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {v4}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    const-class v8, Ljava/lang/String;

    .line 45
    .line 46
    filled-new-array {v7, v8}, [Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-static {v5, v6, v7}, Lr0/E;->h(Ljava/lang/Class;Ljava/util/List;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    if-nez v5, :cond_3

    .line 55
    .line 56
    move v4, v2

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    filled-new-array {v6, p2}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    const-string v5, "hide close friend native update call"

    .line 70
    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    filled-new-array {v5, v4, v6, p2}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v4}, Li0/a;->a([Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move v4, v1

    .line 83
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception v4

    .line 89
    :try_start_2
    new-instance v5, LE0/d;

    .line 90
    .line 91
    invoke-direct {v5, v4}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    move-object v4, v5

    .line 95
    :goto_1
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 96
    .line 97
    instance-of v6, v4, LE0/d;

    .line 98
    .line 99
    if-eqz v6, :cond_4

    .line 100
    .line 101
    move-object v4, v5

    .line 102
    :cond_4
    check-cast v4, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_2

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_1
    move-exception p1

    .line 112
    goto :goto_3

    .line 113
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 117
    goto :goto_4

    .line 118
    :goto_3
    new-instance v1, LE0/d;

    .line 119
    .line 120
    invoke-direct {v1, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    move-object p1, v1

    .line 124
    :goto_4
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    if-eqz v1, :cond_5

    .line 129
    .line 130
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const-string v3, "hide close friend native update fail"

    .line 135
    .line 136
    filled-new-array {v3, v0, p2, v1}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-static {p2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    iput-boolean v2, p0, Lr0/E;->d:Z

    .line 144
    .line 145
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 146
    .line 147
    instance-of v0, p1, LE0/d;

    .line 148
    .line 149
    if-eqz v0, :cond_6

    .line 150
    .line 151
    move-object p1, p2

    .line 152
    :cond_6
    check-cast p1, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    return p1
.end method

.method public final f(Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lr0/E;->q()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v4, "\'"

    .line 32
    .line 33
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {p1, v3, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_2

    .line 51
    .line 52
    new-instance v3, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v4, "\""

    .line 55
    .line 56
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {p1, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    :cond_2
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :cond_3
    :goto_0
    return v2
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 8

    .line 1
    const/4 p2, 0x2

    .line 2
    const/4 v0, 0x1

    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1}, LA0/l;->f(Landroid/content/Context;)LA0/j;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    iput-object v2, p0, Lr0/E;->e:LA0/j;

    .line 9
    .line 10
    sget-boolean v2, Lz0/i;->a:Z

    .line 11
    .line 12
    invoke-static {}, Lz0/g;->x()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const-string v3, "enabled="

    .line 17
    .line 18
    invoke-static {v3, v2}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const-string v4, "maskCount="

    .line 31
    .line 32
    invoke-static {v3, v4}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v4, "hide close friend handleHook"

    .line 37
    .line 38
    filled-new-array {v4, v2, v3}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v3, "classLoader"

    .line 54
    .line 55
    invoke-static {v2, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 59
    .line 60
    const-string v4, "com.tencent.wcdb.database.SQLiteDatabase"

    .line 61
    .line 62
    invoke-interface {v3, v2, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    new-instance v3, Lq0/d;

    .line 67
    .line 68
    const/16 v4, 0x15

    .line 69
    .line 70
    invoke-direct {v3, v4}, Lq0/d;-><init>(I)V

    .line 71
    .line 72
    .line 73
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 74
    .line 75
    invoke-interface {v4, v2, v3}, Ld0/b;->d(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-string v3, "findMethodsByExactPredicate(...)"

    .line 80
    .line 81
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    array-length v3, v2

    .line 85
    move v4, v1

    .line 86
    :goto_0
    if-ge v4, v3, :cond_0

    .line 87
    .line 88
    aget-object v5, v2, v4

    .line 89
    .line 90
    new-instance v6, Lr0/D;

    .line 91
    .line 92
    invoke-direct {v6, p0, v1}, Lr0/D;-><init>(Lr0/E;I)V

    .line 93
    .line 94
    .line 95
    invoke-static {v5, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 96
    .line 97
    .line 98
    add-int/2addr v4, v0

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {p0, p1}, Lr0/E;->j(Landroid/content/Context;)Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    if-nez v2, :cond_1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v4, "hide-close-friend-adapter-ctor-"

    .line 110
    .line 111
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 122
    .line 123
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_2

    .line 128
    .line 129
    new-instance v4, Lr0/D;

    .line 130
    .line 131
    const/4 v5, 0x4

    .line 132
    invoke-direct {v4, p0, v5}, Lr0/D;-><init>(Lr0/E;I)V

    .line 133
    .line 134
    .line 135
    invoke-static {v2, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 136
    .line 137
    .line 138
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 139
    .line 140
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    :cond_2
    new-array v1, v1, [Ljava/lang/Object;

    .line 144
    .line 145
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 146
    .line 147
    const-string v4, "onCreate"

    .line 148
    .line 149
    invoke-interface {v3, v2, v4, v1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-nez v1, :cond_3

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_3
    const-string v2, "hide-close-friend-adapter-oncreate-"

    .line 157
    .line 158
    invoke-static {v2, v1}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    sget-object v3, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 163
    .line 164
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_4

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_4
    new-instance v3, Lr0/D;

    .line 172
    .line 173
    const/4 v4, 0x5

    .line 174
    invoke-direct {v3, p0, v4}, Lr0/D;-><init>(Lr0/E;I)V

    .line 175
    .line 176
    .line 177
    invoke-static {v1, v3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 178
    .line 179
    .line 180
    sget-object v1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 181
    .line 182
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    :goto_1
    invoke-virtual {p0, p1}, Lr0/E;->j(Landroid/content/Context;)Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const-class v2, Landroid/widget/ListView;

    .line 190
    .line 191
    if-nez v1, :cond_5

    .line 192
    .line 193
    goto/16 :goto_4

    .line 194
    .line 195
    :cond_5
    invoke-static {}, Lz0/r;->u()Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    const-string v4, "c0"

    .line 200
    .line 201
    const-string v5, "f0"

    .line 202
    .line 203
    const-string v6, "e0"

    .line 204
    .line 205
    if-nez v3, :cond_9

    .line 206
    .line 207
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 212
    .line 213
    invoke-interface {v7, v1, v6, v3}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    if-eqz v3, :cond_7

    .line 218
    .line 219
    :cond_6
    move-object v4, v6

    .line 220
    goto :goto_3

    .line 221
    :cond_7
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 226
    .line 227
    invoke-interface {v7, v1, v5, v3}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    if-eqz v3, :cond_8

    .line 232
    .line 233
    :goto_2
    move-object v4, v5

    .line 234
    goto :goto_3

    .line 235
    :cond_8
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 240
    .line 241
    invoke-interface {v7, v1, v4, v3}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    if-eqz v3, :cond_9

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    const-string v7, "kc5.v0"

    .line 253
    .line 254
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-eqz v7, :cond_a

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_a
    const-string v4, "sd5.x0"

    .line 262
    .line 263
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-eqz v3, :cond_6

    .line 268
    .line 269
    goto :goto_2

    .line 270
    :goto_3
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 275
    .line 276
    invoke-interface {v5, v1, v4, v3}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-nez v1, :cond_b

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_b
    const-string v3, "hide-close-friend-bind-"

    .line 284
    .line 285
    invoke-static {v3, v1}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 290
    .line 291
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    if-eqz v4, :cond_c

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_c
    new-instance v4, Lr0/D;

    .line 299
    .line 300
    invoke-direct {v4, p0, v0}, Lr0/D;-><init>(Lr0/E;I)V

    .line 301
    .line 302
    .line 303
    invoke-static {v1, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 304
    .line 305
    .line 306
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 307
    .line 308
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    :goto_4
    const-class v0, Landroid/widget/ListAdapter;

    .line 312
    .line 313
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 318
    .line 319
    const-string v3, "setAdapter"

    .line 320
    .line 321
    invoke-interface {v1, v2, v3, v0}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    if-nez v0, :cond_d

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_d
    const-string v1, "hide-close-friend-listview-bind-"

    .line 329
    .line 330
    invoke-static {v1, v0}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 335
    .line 336
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-eqz v2, :cond_e

    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_e
    new-instance v2, Lm0/f;

    .line 344
    .line 345
    invoke-direct {v2, p0, p1, p2}, Lm0/f;-><init>(Le0/a;Ljava/lang/Object;I)V

    .line 346
    .line 347
    .line 348
    invoke-static {v0, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 349
    .line 350
    .line 351
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 352
    .line 353
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    :goto_5
    invoke-virtual {p0, p1}, Lr0/E;->m(Landroid/content/Context;)Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    if-nez v0, :cond_f

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    const-string v2, "hide-close-friend-datasource-ctor-"

    .line 366
    .line 367
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 378
    .line 379
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-eqz v2, :cond_10

    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_10
    new-instance v2, Lr0/D;

    .line 387
    .line 388
    const/4 v3, 0x6

    .line 389
    invoke-direct {v2, p0, v3}, Lr0/D;-><init>(Lr0/E;I)V

    .line 390
    .line 391
    .line 392
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 393
    .line 394
    .line 395
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 396
    .line 397
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    :goto_6
    invoke-virtual {p0, p1}, Lr0/E;->m(Landroid/content/Context;)Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    if-nez v0, :cond_11

    .line 405
    .line 406
    goto/16 :goto_8

    .line 407
    .line 408
    :cond_11
    invoke-static {p1}, LA0/l;->f(Landroid/content/Context;)LA0/j;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    if-nez v1, :cond_12

    .line 413
    .line 414
    iget-object v1, p0, Lr0/E;->e:LA0/j;

    .line 415
    .line 416
    :cond_12
    iput-object v1, p0, Lr0/E;->e:LA0/j;

    .line 417
    .line 418
    const/4 v2, 0x0

    .line 419
    if-eqz v1, :cond_13

    .line 420
    .line 421
    iget-object v1, v1, LA0/j;->f:Ljava/util/List;

    .line 422
    .line 423
    goto :goto_7

    .line 424
    :cond_13
    move-object v1, v2

    .line 425
    :goto_7
    sget-object v3, LF0/s;->a:LF0/s;

    .line 426
    .line 427
    if-nez v1, :cond_14

    .line 428
    .line 429
    move-object v1, v3

    .line 430
    :cond_14
    const-string v4, "va5.j0"

    .line 431
    .line 432
    const-string v5, "kc5.j0"

    .line 433
    .line 434
    const-string v6, "sd5.l0"

    .line 435
    .line 436
    invoke-static {v4, v5, v6, v2}, Lz0/r;->D(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    check-cast v2, Ljava/lang/String;

    .line 441
    .line 442
    if-eqz v2, :cond_15

    .line 443
    .line 444
    invoke-static {v2}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    :cond_15
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    if-nez v2, :cond_16

    .line 453
    .line 454
    invoke-static {v1, v3}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    :cond_16
    const-string v1, "conversation"

    .line 467
    .line 468
    const-string v2, "request"

    .line 469
    .line 470
    invoke-static {v1, v2, v3}, Lz0/r;->E(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    invoke-static {p1, v1}, Lr0/E;->i(Landroid/content/Context;Ljava/util/List;)Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    if-nez v1, :cond_17

    .line 479
    .line 480
    goto :goto_8

    .line 481
    :cond_17
    const-string v2, "g"

    .line 482
    .line 483
    invoke-static {v2}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    invoke-static {v0, v2, v1}, Lr0/E;->h(Ljava/lang/Class;Ljava/util/List;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    if-nez v0, :cond_18

    .line 496
    .line 497
    goto :goto_8

    .line 498
    :cond_18
    const-string v1, "hide-close-friend-batch-"

    .line 499
    .line 500
    invoke-static {v1, v0}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 505
    .line 506
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    if-eqz v2, :cond_19

    .line 511
    .line 512
    goto :goto_8

    .line 513
    :cond_19
    new-instance v2, Lr0/D;

    .line 514
    .line 515
    invoke-direct {v2, p0, p2}, Lr0/D;-><init>(Lr0/E;I)V

    .line 516
    .line 517
    .line 518
    invoke-static {v0, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 519
    .line 520
    .line 521
    sget-object p2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 522
    .line 523
    invoke-virtual {p2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    :goto_8
    invoke-virtual {p0, p1}, Lr0/E;->m(Landroid/content/Context;)Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    move-result-object p2

    .line 530
    const-class v0, Ljava/lang/String;

    .line 531
    .line 532
    if-nez p2, :cond_1a

    .line 533
    .line 534
    goto :goto_9

    .line 535
    :cond_1a
    const-string v1, "h"

    .line 536
    .line 537
    invoke-static {v1}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-static {p2, v1, v2}, Lr0/E;->h(Ljava/lang/Class;Ljava/util/List;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 546
    .line 547
    .line 548
    move-result-object p2

    .line 549
    if-nez p2, :cond_1b

    .line 550
    .line 551
    goto :goto_9

    .line 552
    :cond_1b
    const-string v1, "hide-close-friend-single-"

    .line 553
    .line 554
    invoke-static {v1, p2}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 559
    .line 560
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v2

    .line 564
    if-eqz v2, :cond_1c

    .line 565
    .line 566
    goto :goto_9

    .line 567
    :cond_1c
    new-instance v2, Lr0/D;

    .line 568
    .line 569
    const/4 v3, 0x3

    .line 570
    invoke-direct {v2, p0, v3}, Lr0/D;-><init>(Lr0/E;I)V

    .line 571
    .line 572
    .line 573
    invoke-static {p2, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 574
    .line 575
    .line 576
    sget-object p2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 577
    .line 578
    invoke-virtual {p2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    :goto_9
    invoke-virtual {p0, p1}, Lr0/E;->m(Landroid/content/Context;)Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    move-result-object p1

    .line 585
    if-nez p1, :cond_1d

    .line 586
    .line 587
    goto :goto_a

    .line 588
    :cond_1d
    invoke-virtual {p0}, Lr0/E;->c()Ljava/util/List;

    .line 589
    .line 590
    .line 591
    move-result-object p2

    .line 592
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 593
    .line 594
    filled-new-array {v1, v0}, [Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-static {p1, p2, v0}, Lr0/E;->h(Ljava/lang/Class;Ljava/util/List;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 599
    .line 600
    .line 601
    move-result-object p1

    .line 602
    if-nez p1, :cond_1e

    .line 603
    .line 604
    goto :goto_a

    .line 605
    :cond_1e
    const-string p2, "hide-close-friend-live-update-"

    .line 606
    .line 607
    invoke-static {p2, p1}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object p2

    .line 611
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 612
    .line 613
    invoke-virtual {v0, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    if-eqz v0, :cond_1f

    .line 618
    .line 619
    :goto_a
    return-void

    .line 620
    :cond_1f
    new-instance v0, Lr0/D;

    .line 621
    .line 622
    const/4 v1, 0x7

    .line 623
    invoke-direct {v0, p0, v1}, Lr0/D;-><init>(Lr0/E;I)V

    .line 624
    .line 625
    .line 626
    invoke-static {p1, v0}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 627
    .line 628
    .line 629
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 630
    .line 631
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    return-void
.end method

.method public final j(Landroid/content/Context;)Ljava/lang/Class;
    .locals 6

    .line 1
    invoke-static {p1}, LA0/l;->f(Landroid/content/Context;)LA0/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lr0/E;->e:LA0/j;

    .line 8
    .line 9
    :cond_0
    iput-object v0, p0, Lr0/E;->e:LA0/j;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, LA0/j;->a:Ljava/util/List;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    sget-object v1, LF0/s;->a:LF0/s;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    move-object v0, v1

    .line 22
    :cond_2
    const-string v2, "va5.v0"

    .line 23
    .line 24
    const-string v3, "kc5.v0"

    .line 25
    .line 26
    const-string v4, "sd5.x0"

    .line 27
    .line 28
    const-string v5, "yf5.w0"

    .line 29
    .line 30
    invoke-static {v2, v3, v4, v5}, Lz0/r;->D(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-static {v2}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_4

    .line 47
    .line 48
    invoke-static {v0, v1}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_4
    const-string v0, "conversation"

    .line 61
    .line 62
    const-string v2, "adapter"

    .line 63
    .line 64
    invoke-static {v0, v2, v1}, Lz0/r;->E(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {p1, v0}, Lr0/E;->i(Landroid/content/Context;Ljava/util/List;)Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_5

    .line 5
    .line 6
    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lr0/E;->e:LA0/j;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    iget-object v2, v2, LA0/j;->g:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v2, v0

    .line 25
    :goto_0
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_2
    sget v2, Lz0/r;->e:I

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    const/4 v4, 0x0

    .line 34
    if-ne v2, v3, :cond_3

    .line 35
    .line 36
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v2, v5, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catch_0
    move-exception v2

    .line 60
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, Li0/a;->b([Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move v2, v3

    .line 68
    :goto_1
    sput v2, Lz0/r;->e:I

    .line 69
    .line 70
    :cond_3
    sget v2, Lz0/r;->e:I

    .line 71
    .line 72
    const-string v5, "d"

    .line 73
    .line 74
    const/16 v6, 0xc30

    .line 75
    .line 76
    if-ne v2, v6, :cond_4

    .line 77
    .line 78
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    :cond_4
    const-string v2, "c"

    .line 82
    .line 83
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_a

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Ljava/lang/String;

    .line 105
    .line 106
    :try_start_1
    new-array v7, v4, [Ljava/lang/Object;

    .line 107
    .line 108
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 109
    .line 110
    invoke-interface {v8, p1, v2, v7}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    goto :goto_2

    .line 115
    :catchall_0
    move-exception v7

    .line 116
    new-instance v8, LE0/d;

    .line 117
    .line 118
    invoke-direct {v8, v7}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    move-object v7, v8

    .line 122
    :goto_2
    nop

    .line 123
    instance-of v8, v7, LE0/d;

    .line 124
    .line 125
    if-eqz v8, :cond_6

    .line 126
    .line 127
    move-object v7, v0

    .line 128
    :cond_6
    if-eqz v7, :cond_5

    .line 129
    .line 130
    sget p1, Lz0/r;->e:I

    .line 131
    .line 132
    if-ne p1, v3, :cond_7

    .line 133
    .line 134
    :try_start_2
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {p1, v0, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iget v3, p1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :catch_1
    move-exception p1

    .line 158
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-static {p1}, Li0/a;->b([Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :goto_3
    sput v3, Lz0/r;->e:I

    .line 166
    .line 167
    :cond_7
    sget p1, Lz0/r;->e:I

    .line 168
    .line 169
    if-ne p1, v6, :cond_9

    .line 170
    .line 171
    invoke-static {v2, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-nez p1, :cond_9

    .line 176
    .line 177
    const-string p1, "a"

    .line 178
    .line 179
    filled-new-array {p1}, [Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-static {v7, p1}, Lr0/E;->p(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-nez p1, :cond_8

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    move-object v7, p1

    .line 191
    :cond_9
    :goto_4
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 192
    .line 193
    invoke-direct {p1, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iput-object p1, p0, Lr0/E;->c:Ljava/lang/ref/WeakReference;

    .line 197
    .line 198
    return-object v7

    .line 199
    :cond_a
    :goto_5
    return-object v0
.end method

.method public final m(Landroid/content/Context;)Ljava/lang/Class;
    .locals 6

    .line 1
    invoke-static {p1}, LA0/l;->f(Landroid/content/Context;)LA0/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lr0/E;->e:LA0/j;

    .line 8
    .line 9
    :cond_0
    iput-object v0, p0, Lr0/E;->e:LA0/j;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, LA0/j;->b:Ljava/util/List;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    sget-object v1, LF0/s;->a:LF0/s;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    move-object v0, v1

    .line 22
    :cond_2
    const-string v2, "va5.x"

    .line 23
    .line 24
    const-string v3, "kc5.x"

    .line 25
    .line 26
    const-string v4, "sd5.x"

    .line 27
    .line 28
    const-string v5, "yf5.w"

    .line 29
    .line 30
    invoke-static {v2, v3, v4, v5}, Lz0/r;->D(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-static {v2}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_4

    .line 47
    .line 48
    invoke-static {v0, v1}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_4
    const-string v0, "conversation"

    .line 61
    .line 62
    const-string v2, "dataSource"

    .line 63
    .line 64
    invoke-static {v0, v2, v1}, Lz0/r;->E(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {p1, v0}, Lr0/E;->i(Landroid/content/Context;Ljava/util/List;)Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1
.end method

.method public final q()Ljava/util/List;
    .locals 6

    .line 1
    invoke-static {}, Lr0/E;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, Lr0/E;->s()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move-object v3, v2

    .line 35
    check-cast v3, Ljava/util/Set;

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/lang/String;

    .line 61
    .line 62
    sget-boolean v5, Lz0/i;->a:Z

    .line 63
    .line 64
    invoke-static {v4}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Ljava/lang/Iterable;

    .line 95
    .line 96
    invoke-static {v2, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0

    .line 109
    :cond_5
    const-class v0, Lq0/h;

    .line 110
    .line 111
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Lq0/h;

    .line 116
    .line 117
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, LF0/k;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    new-instance v1, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_7

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    move-object v3, v2

    .line 147
    check-cast v3, Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-nez v3, :cond_6

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    move-object v3, v2

    .line 179
    check-cast v3, Ljava/lang/String;

    .line 180
    .line 181
    sget-boolean v4, Lz0/i;->a:Z

    .line 182
    .line 183
    invoke-static {v3}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-nez v3, :cond_8

    .line 188
    .line 189
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_9
    return-object v0
.end method

.method public final s()Ljava/util/Map;
    .locals 11

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v7, 0x0

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    move-object v7, v2

    .line 48
    :cond_1
    if-eqz v7, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    const-string v2, "|"

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    const/16 v6, 0x3e

    .line 60
    .line 61
    invoke-static/range {v1 .. v6}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v2, p0, Lr0/E;->f:Ljava/lang/Object;

    .line 66
    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const/4 v2, 0x0

    .line 72
    :goto_1
    iget-object v3, p0, Lr0/E;->l:Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v4, p0, Lr0/E;->j:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v4, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    iget-boolean v4, p0, Lr0/E;->k:Z

    .line 83
    .line 84
    if-ne v4, v2, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object v3, v7

    .line 88
    :goto_2
    if-eqz v3, :cond_5

    .line 89
    .line 90
    return-object v3

    .line 91
    :cond_5
    sget-object v3, Lz0/z;->a:Lz0/z;

    .line 92
    .line 93
    iget-object v4, p0, Lr0/E;->f:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-virtual {v3, v4}, Lz0/z;->h(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_a

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Ljava/lang/String;

    .line 118
    .line 119
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 120
    .line 121
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    sget-object v6, Lz0/z;->a:Lz0/z;

    .line 128
    .line 129
    invoke-static {v4}, Lz0/z;->b(Ljava/lang/String;)Lz0/y;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    if-eqz v6, :cond_9

    .line 134
    .line 135
    iget-object v8, v6, Lz0/y;->b:Ljava/lang/String;

    .line 136
    .line 137
    iget-object v9, v6, Lz0/y;->c:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v6, v6, Lz0/y;->a:Ljava/lang/String;

    .line 140
    .line 141
    filled-new-array {v6, v8, v9}, [Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-static {v6}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    new-instance v8, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    :cond_6
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    if-eqz v9, :cond_8

    .line 163
    .line 164
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    check-cast v9, Ljava/lang/String;

    .line 169
    .line 170
    if-eqz v9, :cond_7

    .line 171
    .line 172
    invoke-static {v9}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    if-eqz v9, :cond_7

    .line 181
    .line 182
    invoke-static {v9}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-nez v10, :cond_7

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_7
    move-object v9, v7

    .line 190
    :goto_5
    if-eqz v9, :cond_6

    .line 191
    .line 192
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_8
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    if-eqz v8, :cond_9

    .line 205
    .line 206
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    check-cast v8, Ljava/lang/String;

    .line 211
    .line 212
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_9
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_a
    iput-object v0, p0, Lr0/E;->j:Ljava/lang/String;

    .line 221
    .line 222
    iput-boolean v2, p0, Lr0/E;->k:Z

    .line 223
    .line 224
    iput-object v3, p0, Lr0/E;->l:Ljava/lang/Object;

    .line 225
    .line 226
    return-object v3
.end method

.method public final t(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    instance-of v0, p1, [Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    check-cast p1, [Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    array-length v3, p1

    .line 15
    move v4, v2

    .line 16
    :goto_0
    if-ge v4, v3, :cond_6

    .line 17
    .line 18
    aget-object v5, p1, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move-object v5, v1

    .line 28
    :goto_1
    if-eqz v5, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    instance-of v0, p1, Ljava/lang/Iterable;

    .line 37
    .line 38
    if-eqz v0, :cond_5

    .line 39
    .line 40
    check-cast p1, Ljava/lang/Iterable;

    .line 41
    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_6

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move-object v3, v1

    .line 69
    :goto_3
    if-eqz v3, :cond_3

    .line 70
    .line 71
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    sget-object v0, LF0/s;->a:LF0/s;

    .line 76
    .line 77
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_7

    .line 82
    .line 83
    return v2

    .line 84
    :cond_7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_8

    .line 89
    .line 90
    return v2

    .line 91
    :cond_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_a

    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Lr0/E;->F(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_9

    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    return p1

    .line 115
    :cond_a
    return v2
.end method
