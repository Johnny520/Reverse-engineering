.class public final Ll82;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ll82;

.field public static final β:Ljava/util/List;

.field public static final γ:Ljava/lang/ThreadLocal;

.field public static final δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final ε:Ljava/lang/Object;

.field public static final ζ:Landroid/os/Handler;

.field public static final η:Ljava/util/concurrent/atomic/AtomicLong;

.field public static volatile θ:J

.field public static volatile ι:J

.field public static volatile κ:Li82;

.field public static volatile λ:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll82;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll82;->α:Ll82;

    .line 7
    .line 8
    const-string v0, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "~795CFE82AE87DC48225355B65A8474AC8888795688CFC505AE0AE615CE280772922D63B5F8A7251BD40F9CB4512B8F0072E7"

    .line 15
    .line 16
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Ll82;->β:Ljava/util/List;

    .line 29
    .line 30
    new-instance v0, Lb01;

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    invoke-direct {v0, v1}, Lb01;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Ll82;->γ:Ljava/lang/ThreadLocal;

    .line 41
    .line 42
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Ll82;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 47
    .line 48
    new-instance v0, Ljava/lang/Object;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    sput-object v0, Ll82;->ε:Ljava/lang/Object;

    .line 54
    .line 55
    new-instance v0, Landroid/os/Handler;

    .line 56
    .line 57
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Ll82;->ζ:Landroid/os/Handler;

    .line 65
    .line 66
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 67
    .line 68
    const-wide/16 v1, 0x0

    .line 69
    .line 70
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 71
    .line 72
    .line 73
    sput-object v0, Ll82;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 74
    .line 75
    const-wide/high16 v0, -0x8000000000000000L

    .line 76
    .line 77
    sput-wide v0, Ll82;->ι:J

    .line 78
    .line 79
    return-void
.end method

.method public static α(F)Z
    .locals 13

    .line 1
    sget-object v0, Ll82;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ll82;->κ:Li82;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    :goto_0
    move-object v4, v2

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :try_start_1
    iget-object v3, v1, Li82;->α:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    sput-object v2, Ll82;->κ:Li82;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto/16 :goto_14

    .line 26
    .line 27
    :cond_1
    :try_start_2
    new-instance v4, Lj82;

    .line 28
    .line 29
    iget-object v1, v1, Li82;->β:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-direct {v4, v1, v3}, Lj82;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit v0

    .line 35
    :goto_1
    if-nez v4, :cond_16

    .line 36
    .line 37
    const-string v0, "r6024182e27de5477"

    .line 38
    .line 39
    sget-object v1, Ll82;->λ:Ljava/lang/ClassLoader;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    :goto_2
    move-object v4, v2

    .line 45
    goto/16 :goto_d

    .line 46
    .line 47
    :cond_2
    sget-object v4, Ll82;->β:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_15

    .line 58
    .line 59
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1, v5}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    invoke-static {v5}, Ll82;->γ(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    if-nez v6, :cond_4

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v8, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    array-length v9, v7

    .line 92
    move v10, v3

    .line 93
    :goto_4
    if-ge v10, v9, :cond_6

    .line 94
    .line 95
    aget-object v11, v7, v10

    .line 96
    .line 97
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    if-eqz v12, :cond_5

    .line 106
    .line 107
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    :cond_7
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    const/4 v10, 0x1

    .line 122
    if-eqz v9, :cond_a

    .line 123
    .line 124
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    check-cast v9, Ljava/lang/reflect/Field;

    .line 129
    .line 130
    :try_start_3
    invoke-virtual {v9, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v9, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 137
    goto :goto_6

    .line 138
    :catchall_1
    move-exception v9

    .line 139
    new-instance v10, Leo1;

    .line 140
    .line 141
    invoke-direct {v10, v9}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    move-object v9, v10

    .line 145
    :goto_6
    instance-of v10, v9, Leo1;

    .line 146
    .line 147
    if-eqz v10, :cond_8

    .line 148
    .line 149
    move-object v9, v2

    .line 150
    :cond_8
    if-nez v9, :cond_9

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_9
    invoke-virtual {v5, v9}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-eqz v10, :cond_7

    .line 158
    .line 159
    goto/16 :goto_c

    .line 160
    .line 161
    :cond_a
    new-instance v7, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    :cond_b
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-eqz v9, :cond_c

    .line 175
    .line 176
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    move-object v11, v9

    .line 181
    check-cast v11, Ljava/lang/reflect/Field;

    .line 182
    .line 183
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    const-string v12, "kotlin.Lazy"

    .line 192
    .line 193
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    if-eqz v11, :cond_b

    .line 198
    .line 199
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_c
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    :cond_d
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v8

    .line 211
    if-eqz v8, :cond_11

    .line 212
    .line 213
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    check-cast v8, Ljava/lang/reflect/Field;

    .line 218
    .line 219
    :try_start_4
    invoke-virtual {v8, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 226
    goto :goto_9

    .line 227
    :catchall_2
    move-exception v8

    .line 228
    new-instance v9, Leo1;

    .line 229
    .line 230
    invoke-direct {v9, v8}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    move-object v8, v9

    .line 234
    :goto_9
    instance-of v9, v8, Leo1;

    .line 235
    .line 236
    if-eqz v9, :cond_e

    .line 237
    .line 238
    move-object v8, v2

    .line 239
    :cond_e
    if-nez v8, :cond_f

    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_f
    :try_start_5
    const-string v9, "getValue"

    .line 243
    .line 244
    new-array v11, v3, [Ljava/lang/Object;

    .line 245
    .line 246
    invoke-static {v8, v9, v11}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 250
    goto :goto_a

    .line 251
    :catchall_3
    move-exception v8

    .line 252
    new-instance v9, Leo1;

    .line 253
    .line 254
    invoke-direct {v9, v8}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    move-object v8, v9

    .line 258
    :goto_a
    instance-of v9, v8, Leo1;

    .line 259
    .line 260
    if-eqz v9, :cond_10

    .line 261
    .line 262
    move-object v9, v2

    .line 263
    goto :goto_b

    .line 264
    :cond_10
    move-object v9, v8

    .line 265
    :goto_b
    invoke-virtual {v5, v9}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    if-eqz v8, :cond_d

    .line 270
    .line 271
    goto :goto_c

    .line 272
    :cond_11
    invoke-virtual {v5}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {v7}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-static {v8}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-static {v7, v8}, Lus1;->Δ(Lss1;Lss1;)Lc40;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    new-instance v8, Lt00;

    .line 299
    .line 300
    const/16 v9, 0xa

    .line 301
    .line 302
    invoke-direct {v8, v5, v9}, Lt00;-><init>(Ljava/lang/Class;I)V

    .line 303
    .line 304
    .line 305
    new-instance v9, Ly30;

    .line 306
    .line 307
    invoke-direct {v9, v7, v10, v8}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 308
    .line 309
    .line 310
    new-instance v7, Lj72;

    .line 311
    .line 312
    const/16 v8, 0xf

    .line 313
    .line 314
    invoke-direct {v7, v8}, Lj72;-><init>(I)V

    .line 315
    .line 316
    .line 317
    new-instance v8, Lcu;

    .line 318
    .line 319
    const/4 v10, 0x0

    .line 320
    invoke-direct {v8, v9, v10, v7}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    new-instance v7, Lj72;

    .line 324
    .line 325
    const/16 v9, 0x10

    .line 326
    .line 327
    invoke-direct {v7, v9}, Lj72;-><init>(I)V

    .line 328
    .line 329
    .line 330
    invoke-static {v8, v7}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    new-instance v8, Lx30;

    .line 335
    .line 336
    invoke-direct {v8, v7}, Lx30;-><init>(Ly30;)V

    .line 337
    .line 338
    .line 339
    :cond_12
    invoke-virtual {v8}, Lx30;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    if-eqz v7, :cond_13

    .line 344
    .line 345
    invoke-virtual {v8}, Lx30;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v9

    .line 353
    if-eqz v9, :cond_12

    .line 354
    .line 355
    move-object v9, v7

    .line 356
    goto :goto_c

    .line 357
    :cond_13
    move-object v9, v2

    .line 358
    :goto_c
    if-nez v9, :cond_14

    .line 359
    .line 360
    goto/16 :goto_3

    .line 361
    .line 362
    :cond_14
    invoke-static {v6, v9}, Ll82;->β(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    const-string v4, "resolved current player from host singleton: "

    .line 370
    .line 371
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    new-instance v0, Lj82;

    .line 379
    .line 380
    invoke-direct {v0, v6, v9}, Lj82;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    move-object v4, v0

    .line 384
    goto :goto_d

    .line 385
    :cond_15
    const-string v1, "host current player singleton unavailable"

    .line 386
    .line 387
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_2

    .line 391
    .line 392
    :goto_d
    if-nez v4, :cond_16

    .line 393
    .line 394
    return v3

    .line 395
    :cond_16
    :try_start_6
    sget-object v0, Ll82;->γ:Ljava/lang/ThreadLocal;

    .line 396
    .line 397
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 398
    .line 399
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 400
    .line 401
    .line 402
    :try_start_7
    iget-object v3, v4, Lj82;->β:Ljava/lang/reflect/Method;

    .line 403
    .line 404
    iget-object v5, v4, Lj82;->α:Ljava/lang/Object;

    .line 405
    .line 406
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    invoke-virtual {v3, v5, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 415
    .line 416
    .line 417
    :try_start_8
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 418
    .line 419
    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    goto :goto_f

    .line 423
    :catchall_4
    move-exception p0

    .line 424
    goto :goto_e

    .line 425
    :catchall_5
    move-exception p0

    .line 426
    sget-object v0, Ll82;->γ:Ljava/lang/ThreadLocal;

    .line 427
    .line 428
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 429
    .line 430
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 434
    :goto_e
    new-instance v1, Leo1;

    .line 435
    .line 436
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 437
    .line 438
    .line 439
    :goto_f
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    if-eqz p0, :cond_1a

    .line 444
    .line 445
    sget-object v0, Ll82;->ε:Ljava/lang/Object;

    .line 446
    .line 447
    monitor-enter v0

    .line 448
    :try_start_9
    sget-object v3, Ll82;->κ:Li82;

    .line 449
    .line 450
    if-eqz v3, :cond_17

    .line 451
    .line 452
    iget-object v5, v3, Li82;->α:Ljava/lang/ref/WeakReference;

    .line 453
    .line 454
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    goto :goto_10

    .line 459
    :catchall_6
    move-exception p0

    .line 460
    goto :goto_12

    .line 461
    :cond_17
    move-object v5, v2

    .line 462
    :goto_10
    iget-object v6, v4, Lj82;->α:Ljava/lang/Object;

    .line 463
    .line 464
    if-ne v5, v6, :cond_18

    .line 465
    .line 466
    iget-object v3, v3, Li82;->β:Ljava/lang/reflect/Method;

    .line 467
    .line 468
    iget-object v4, v4, Lj82;->β:Ljava/lang/reflect/Method;

    .line 469
    .line 470
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    if-eqz v3, :cond_18

    .line 475
    .line 476
    sput-object v2, Ll82;->κ:Li82;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 477
    .line 478
    :cond_18
    monitor-exit v0

    .line 479
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    if-nez v0, :cond_19

    .line 484
    .line 485
    goto :goto_11

    .line 486
    :cond_19
    move-object p0, v0

    .line 487
    :goto_11
    const-string v0, "r6024182e27de5477"

    .line 488
    .line 489
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    const-string v3, "set current video speed failed: "

    .line 502
    .line 503
    const-string v4, ": "

    .line 504
    .line 505
    invoke-static {v3, v2, v4, p0, v0}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    goto :goto_13

    .line 509
    :goto_12
    monitor-exit v0

    .line 510
    throw p0

    .line 511
    :cond_1a
    :goto_13
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 512
    .line 513
    instance-of v0, v1, Leo1;

    .line 514
    .line 515
    if-eqz v0, :cond_1b

    .line 516
    .line 517
    move-object v1, p0

    .line 518
    :cond_1b
    check-cast v1, Ljava/lang/Boolean;

    .line 519
    .line 520
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 521
    .line 522
    .line 523
    move-result p0

    .line 524
    return p0

    .line 525
    :goto_14
    monitor-exit v0

    .line 526
    throw p0
.end method

.method public static β(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    array-length v0, v0

    .line 23
    const/4 v1, 0x1

    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v2, 0x0

    .line 31
    aget-object v0, v0, v2

    .line 32
    .line 33
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :catchall_0
    sget-object v0, Ll82;->ε:Ljava/lang/Object;

    .line 46
    .line 47
    monitor-enter v0

    .line 48
    :try_start_1
    new-instance v1, Li82;

    .line 49
    .line 50
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v2, p0}, Li82;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/reflect/Method;)V

    .line 56
    .line 57
    .line 58
    sput-object v1, Ll82;->κ:Li82;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :catchall_1
    move-exception p0

    .line 63
    monitor-exit v0

    .line 64
    throw p0

    .line 65
    :cond_2
    :goto_0
    return-void
.end method

.method public static γ(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {v0, p0}, Lus1;->Δ(Lss1;Lss1;)Lc40;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance v0, Lj72;

    .line 28
    .line 29
    const/16 v1, 0xd

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lj72;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ly30;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-direct {v1, p0, v2, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Lj72;

    .line 41
    .line 42
    const/16 v0, 0xe

    .line 43
    .line 44
    invoke-direct {p0, v0}, Lj72;-><init>(I)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lbu;

    .line 48
    .line 49
    invoke-interface {v1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1, p0}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lσ;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    const/4 v1, 0x0

    .line 61
    if-nez p0, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v0}, Lσ;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v0}, Lσ;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    :goto_0
    move-object p0, v1

    .line 75
    :cond_1
    check-cast p0, Ljava/lang/reflect/Method;

    .line 76
    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_2
    return-object v1
.end method

.method public static ε()Ljava/lang/Float;
    .locals 6

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    :try_start_0
    const-string v1, "global_video_speed"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 4
    .line 5
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2, v1, v0}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 10
    .line 11
    .line 12
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move v1, v0

    .line 15
    :goto_0
    :try_start_2
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 16
    .line 17
    .line 18
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 19
    goto :goto_1

    .line 20
    :catchall_1
    move-exception v1

    .line 21
    new-instance v2, Leo1;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object v1, v2

    .line 27
    :goto_1
    instance-of v2, v1, Leo1;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    move-object v1, v3

    .line 33
    :cond_0
    check-cast v1, Ljava/lang/Float;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 46
    .line 47
    .line 48
    cmpg-float v4, v4, v5

    .line 49
    .line 50
    if-gtz v4, :cond_1

    .line 51
    .line 52
    cmpg-float v0, v0, v2

    .line 53
    .line 54
    if-gtz v0, :cond_1

    .line 55
    .line 56
    const/high16 v0, 0x40a00000    # 5.0f

    .line 57
    .line 58
    cmpg-float v0, v2, v0

    .line 59
    .line 60
    if-gtz v0, :cond_1

    .line 61
    .line 62
    move-object v3, v1

    .line 63
    :cond_1
    return-object v3
.end method

.method public static ζ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of p1, p0, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p0, v0

    .line 28
    goto :goto_1

    .line 29
    :goto_0
    new-instance p1, Leo1;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p0, p1

    .line 35
    :goto_1
    instance-of p1, p0, Leo1;

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move-object v0, p0

    .line 41
    :goto_2
    check-cast v0, Ljava/lang/String;

    .line 42
    .line 43
    return-object v0
.end method


# virtual methods
.method public final δ(Ljava/lang/ClassLoader;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sput-object v2, Ll82;->λ:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    sget-object v3, Ll82;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 17
    .line 18
    const-string v0, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E111E5057B4FC455FA29A8C52DD30A87961CC4190963A91D26B00402EEF12A5B8AD70E093D5FE91A1B0FDF2881E"

    .line 19
    .line 20
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v2, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const-string v6, "(float)"

    .line 29
    .line 30
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    const-string v8, "setSpeed"

    .line 33
    .line 34
    const-string v10, "r6024182e27de5477"

    .line 35
    .line 36
    const-string v11, "#"

    .line 37
    .line 38
    const-string v12, ":"

    .line 39
    .line 40
    if-nez v5, :cond_0

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    array-length v15, v0

    .line 52
    const/4 v9, 0x0

    .line 53
    :goto_0
    if-ge v9, v15, :cond_2

    .line 54
    .line 55
    aget-object v16, v0, v9

    .line 56
    .line 57
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    const-string v14, "LJZ"

    .line 62
    .line 63
    invoke-static {v13, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    if-eqz v13, :cond_1

    .line 68
    .line 69
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    array-length v13, v13

    .line 74
    const/4 v14, 0x1

    .line 75
    if-ne v13, v14, :cond_1

    .line 76
    .line 77
    move-object/from16 v0, v16

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const/4 v0, 0x0

    .line 84
    :goto_1
    if-nez v0, :cond_3

    .line 85
    .line 86
    goto/16 :goto_5

    .line 87
    .line 88
    :cond_3
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v13

    .line 100
    new-instance v14, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v9, "/play"

    .line 121
    .line 122
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-virtual {v3, v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v13

    .line 133
    if-nez v13, :cond_4

    .line 134
    .line 135
    goto/16 :goto_5

    .line 136
    .line 137
    :cond_4
    const/4 v14, 0x1

    .line 138
    :try_start_0
    invoke-virtual {v0, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 139
    .line 140
    .line 141
    sget-object v13, Lxq0;->α:Lxq0;

    .line 142
    .line 143
    new-instance v14, Lpy1;

    .line 144
    .line 145
    const/16 v15, 0x11

    .line 146
    .line 147
    invoke-direct {v14, v15, v1}, Lpy1;-><init>(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v13, v0, v14}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 151
    .line 152
    .line 153
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    goto :goto_2

    .line 155
    :catchall_0
    move-exception v0

    .line 156
    new-instance v13, Leo1;

    .line 157
    .line 158
    invoke-direct {v13, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    move-object v0, v13

    .line 162
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-eqz v0, :cond_5

    .line 167
    .line 168
    invoke-virtual {v3, v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const-string v9, "play lifecycle hook failed: "

    .line 176
    .line 177
    invoke-static {v9, v0, v10}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :cond_5
    :try_start_1
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v5, v8, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    const/4 v14, 0x1

    .line 189
    invoke-virtual {v0, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :catchall_1
    move-exception v0

    .line 194
    new-instance v5, Leo1;

    .line 195
    .line 196
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    move-object v0, v5

    .line 200
    :goto_3
    instance-of v5, v0, Leo1;

    .line 201
    .line 202
    if-eqz v5, :cond_6

    .line 203
    .line 204
    const/4 v0, 0x0

    .line 205
    :cond_6
    check-cast v0, Ljava/lang/reflect/Method;

    .line 206
    .line 207
    if-nez v0, :cond_7

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_7
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    new-instance v13, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-nez v5, :cond_8

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_8
    :try_start_2
    sget-object v5, Lxq0;->α:Lxq0;

    .line 257
    .line 258
    new-instance v9, Lxe;

    .line 259
    .line 260
    const/16 v13, 0xc

    .line 261
    .line 262
    invoke-direct {v9, v13, v1, v0}, Lxe;-><init>(ILjava/lang/Object;Ljava/lang/reflect/Method;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v0, v9}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 266
    .line 267
    .line 268
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 269
    goto :goto_4

    .line 270
    :catchall_2
    move-exception v0

    .line 271
    new-instance v5, Leo1;

    .line 272
    .line 273
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    move-object v0, v5

    .line 277
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    if-eqz v0, :cond_9

    .line 282
    .line 283
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    const-string v3, "play ability speed hook failed: "

    .line 291
    .line 292
    invoke-static {v3, v0, v10}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    :cond_9
    :goto_5
    sget-object v3, Ll82;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 296
    .line 297
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    sget-object v4, Lqe0;->α:Ljava/lang/Object;

    .line 302
    .line 303
    const-string v4, "~78D3ECFA63DB52E5A19E9BAEB1F7800A11F1EB5A04E5B7A2213D6E40D73B64D2CFAB2BF3453CD724F602B86EF825744FD99B260256C001FD1011C5B043588EF6C0D4E35AF5B8851CB0E10693FA6B35B142"

    .line 304
    .line 305
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-static {v2, v4}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    if-nez v4, :cond_a

    .line 314
    .line 315
    goto/16 :goto_9

    .line 316
    .line 317
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    array-length v5, v4

    .line 325
    const/4 v9, 0x0

    .line 326
    :goto_6
    if-ge v9, v5, :cond_c

    .line 327
    .line 328
    aget-object v13, v4, v9

    .line 329
    .line 330
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v14

    .line 334
    const-string v15, "LJJIJL"

    .line 335
    .line 336
    invoke-static {v14, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v14

    .line 340
    if-eqz v14, :cond_b

    .line 341
    .line 342
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    move-result-object v14

    .line 346
    array-length v14, v14

    .line 347
    const/4 v15, 0x1

    .line 348
    if-ne v14, v15, :cond_b

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_b
    add-int/lit8 v9, v9, 0x1

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_c
    const/4 v13, 0x0

    .line 355
    :goto_7
    if-nez v13, :cond_d

    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_d
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    new-instance v9, Ljava/lang/StringBuilder;

    .line 371
    .line 372
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    const-string v0, "/speed-request"

    .line 391
    .line 392
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-nez v0, :cond_e

    .line 404
    .line 405
    goto :goto_9

    .line 406
    :cond_e
    const/4 v14, 0x1

    .line 407
    :try_start_3
    invoke-virtual {v13, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 408
    .line 409
    .line 410
    sget-object v0, Lxq0;->α:Lxq0;

    .line 411
    .line 412
    new-instance v5, Lpy1;

    .line 413
    .line 414
    const/16 v9, 0x13

    .line 415
    .line 416
    invoke-direct {v5, v9, v1}, Lpy1;-><init>(ILjava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, v13, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 420
    .line 421
    .line 422
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 423
    goto :goto_8

    .line 424
    :catchall_3
    move-exception v0

    .line 425
    new-instance v1, Leo1;

    .line 426
    .line 427
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 428
    .line 429
    .line 430
    move-object v0, v1

    .line 431
    :goto_8
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    if-eqz v0, :cond_f

    .line 436
    .line 437
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    const-string v1, "speed provider hook failed: "

    .line 445
    .line 446
    invoke-static {v1, v0, v10}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    :cond_f
    :goto_9
    sget-object v1, Ll82;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 450
    .line 451
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 456
    .line 457
    const-string v0, "~78162BCF42A1422BC9A8F0FB9BD072868F9DD7B58CBAAEB1FF2611FE54EA54BCFFC411896B36A19282EAD587A0F23E9210D7BBB066747F33B2DD9D1BB1BBDEE11EA147D72415A1115C97831A7761059A5EDB3BBE3BF12B01E80A04840272FF71"

    .line 458
    .line 459
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-static {v2, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    if-nez v4, :cond_10

    .line 468
    .line 469
    goto/16 :goto_e

    .line 470
    .line 471
    :cond_10
    const-string v0, "onRenderFirstFrame"

    .line 472
    .line 473
    const-string v5, "onResumePlay"

    .line 474
    .line 475
    filled-new-array {v0, v5}, [Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v5

    .line 479
    const/4 v9, 0x0

    .line 480
    :goto_a
    const/4 v0, 0x2

    .line 481
    if-ge v9, v0, :cond_13

    .line 482
    .line 483
    aget-object v13, v5, v9

    .line 484
    .line 485
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    new-instance v14, Ljava/lang/StringBuilder;

    .line 490
    .line 491
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    const-string v0, "/global-speed"

    .line 510
    .line 511
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v14

    .line 518
    invoke-virtual {v1, v14}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-eqz v0, :cond_11

    .line 523
    .line 524
    :try_start_4
    sget-object v0, Lxq0;->α:Lxq0;

    .line 525
    .line 526
    new-instance v15, Lpy1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 527
    .line 528
    move/from16 p0, v3

    .line 529
    .line 530
    const/16 v3, 0x12

    .line 531
    .line 532
    :try_start_5
    invoke-direct {v15, v3}, Lpy1;-><init>(I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0, v4, v13, v15}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 536
    .line 537
    .line 538
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 539
    goto :goto_c

    .line 540
    :catchall_4
    move-exception v0

    .line 541
    goto :goto_b

    .line 542
    :catchall_5
    move-exception v0

    .line 543
    move/from16 p0, v3

    .line 544
    .line 545
    :goto_b
    new-instance v3, Leo1;

    .line 546
    .line 547
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 548
    .line 549
    .line 550
    move-object v0, v3

    .line 551
    :goto_c
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    if-eqz v0, :cond_12

    .line 556
    .line 557
    invoke-virtual {v1, v14}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    const-string v3, "speed listener hook failed: "

    .line 565
    .line 566
    const-string v14, ": "

    .line 567
    .line 568
    invoke-static {v3, v13, v14, v0, v10}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    goto :goto_d

    .line 572
    :cond_11
    move/from16 p0, v3

    .line 573
    .line 574
    :cond_12
    :goto_d
    add-int/lit8 v9, v9, 0x1

    .line 575
    .line 576
    move/from16 v3, p0

    .line 577
    .line 578
    goto :goto_a

    .line 579
    :cond_13
    :goto_e
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    sget-object v0, Ll82;->β:Ljava/util/List;

    .line 584
    .line 585
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    :cond_14
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_19

    .line 594
    .line 595
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    check-cast v0, Ljava/lang/String;

    .line 600
    .line 601
    invoke-static {v2, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    if-nez v0, :cond_15

    .line 606
    .line 607
    const/4 v14, 0x1

    .line 608
    goto :goto_f

    .line 609
    :cond_15
    :try_start_6
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    invoke-virtual {v0, v8, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 614
    .line 615
    .line 616
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 617
    const/4 v14, 0x1

    .line 618
    :try_start_7
    invoke-virtual {v0, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 619
    .line 620
    .line 621
    goto :goto_11

    .line 622
    :catchall_6
    move-exception v0

    .line 623
    goto :goto_10

    .line 624
    :catchall_7
    move-exception v0

    .line 625
    const/4 v14, 0x1

    .line 626
    :goto_10
    new-instance v4, Leo1;

    .line 627
    .line 628
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 629
    .line 630
    .line 631
    move-object v0, v4

    .line 632
    :goto_11
    instance-of v4, v0, Leo1;

    .line 633
    .line 634
    if-eqz v4, :cond_16

    .line 635
    .line 636
    const/4 v0, 0x0

    .line 637
    :cond_16
    check-cast v0, Ljava/lang/reflect/Method;

    .line 638
    .line 639
    if-nez v0, :cond_17

    .line 640
    .line 641
    goto :goto_f

    .line 642
    :cond_17
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v4

    .line 650
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v5

    .line 654
    new-instance v9, Ljava/lang/StringBuilder;

    .line 655
    .line 656
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v4

    .line 681
    sget-object v5, Ll82;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 682
    .line 683
    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v5

    .line 687
    if-eqz v5, :cond_14

    .line 688
    .line 689
    :try_start_8
    sget-object v5, Lxq0;->α:Lxq0;

    .line 690
    .line 691
    new-instance v9, Lxe;

    .line 692
    .line 693
    const/16 v13, 0xb

    .line 694
    .line 695
    invoke-direct {v9, v13, v0}, Lxe;-><init>(ILjava/lang/reflect/Method;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v5, v0, v9}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 699
    .line 700
    .line 701
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 702
    goto :goto_12

    .line 703
    :catchall_8
    move-exception v0

    .line 704
    new-instance v5, Leo1;

    .line 705
    .line 706
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 707
    .line 708
    .line 709
    move-object v0, v5

    .line 710
    :goto_12
    instance-of v5, v0, Leo1;

    .line 711
    .line 712
    if-nez v5, :cond_18

    .line 713
    .line 714
    move-object v5, v0

    .line 715
    check-cast v5, Ll01;

    .line 716
    .line 717
    const-string v5, "current player hook installed: "

    .line 718
    .line 719
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    invoke-static {v10, v5}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    :cond_18
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    if-eqz v0, :cond_14

    .line 731
    .line 732
    sget-object v5, Ll82;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 733
    .line 734
    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 735
    .line 736
    .line 737
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    const-string v5, "current player hook failed: "

    .line 742
    .line 743
    const-string v9, ", "

    .line 744
    .line 745
    invoke-static {v5, v4, v9, v0, v10}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    goto/16 :goto_f

    .line 749
    .line 750
    :cond_19
    return-void
.end method
